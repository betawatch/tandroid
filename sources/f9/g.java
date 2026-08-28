package f9;

import android.util.Log;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class g {
    public static final Charset b = Charset.forName("UTF-8");
    public final j9.c a;

    public g(j9.c cVar) {
        this.a = cVar;
    }

    public static HashMap a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String str2 = null;
            if (!jSONObject.isNull(next)) {
                str2 = jSONObject.optString(next, null);
            }
            hashMap.put(next, str2);
        }
        return hashMap;
    }

    public static ArrayList b(String str) {
        JSONArray jSONArray = new JSONObject(str).getJSONArray("rolloutsState");
        ArrayList arrayList = new ArrayList();
        for (int i9 = 0; i9 < jSONArray.length(); i9++) {
            String string = jSONArray.getString(i9);
            try {
                arrayList.add(n.a(string));
            } catch (Exception e10) {
                Log.w("FirebaseCrashlytics", "Failed de-serializing rollouts state. " + string, e10);
            }
        }
        return arrayList;
    }

    public static String e(List list) {
        HashMap hashMap = new HashMap();
        JSONArray jSONArray = new JSONArray();
        for (int i9 = 0; i9 < list.size(); i9++) {
            try {
                jSONArray.put(new JSONObject(n.a.u(list.get(i9))));
            } catch (JSONException e10) {
                Log.w("FirebaseCrashlytics", "Exception parsing rollout assignment!", e10);
            }
        }
        hashMap.put("rolloutsState", jSONArray);
        return new JSONObject(hashMap).toString();
    }

    public static void f(File file) {
        if (file.exists() && file.delete()) {
            Log.i("FirebaseCrashlytics", "Deleted corrupt file: " + file.getAbsolutePath(), null);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [long] */
    public final Map c(String str, boolean z10) {
        FileInputStream fileInputStream;
        Exception e10;
        j9.c cVar = this.a;
        File b10 = z10 ? cVar.b(str, "internal-keys") : cVar.b(str, "keys");
        if (b10.exists()) {
            ?? length = b10.length();
            if (length != 0) {
                Closeable closeable = null;
                try {
                    try {
                        fileInputStream = new FileInputStream(b10);
                        try {
                            HashMap a2 = a(e9.h.j(fileInputStream));
                            e9.h.c(fileInputStream, "Failed to close user metadata file.");
                            return a2;
                        } catch (Exception e11) {
                            e10 = e11;
                            Log.w("FirebaseCrashlytics", "Error deserializing user metadata.", e10);
                            f(b10);
                            e9.h.c(fileInputStream, "Failed to close user metadata file.");
                            return Collections.EMPTY_MAP;
                        }
                    } catch (Throwable th) {
                        th = th;
                        closeable = length;
                        e9.h.c(closeable, "Failed to close user metadata file.");
                        throw th;
                    }
                } catch (Exception e12) {
                    fileInputStream = null;
                    e10 = e12;
                } catch (Throwable th2) {
                    th = th2;
                    e9.h.c(closeable, "Failed to close user metadata file.");
                    throw th;
                }
            }
        }
        f(b10);
        return Collections.EMPTY_MAP;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    public final String d(String str) {
        FileInputStream fileInputStream;
        File b10 = this.a.b(str, "user-data");
        Closeable closeable = null;
        if (b10.exists()) {
            ?? r32 = (b10.length() > 0L ? 1 : (b10.length() == 0L ? 0 : -1));
            try {
                if (r32 != 0) {
                    try {
                        fileInputStream = new FileInputStream(b10);
                        try {
                            JSONObject jSONObject = new JSONObject(e9.h.j(fileInputStream));
                            String optString = !jSONObject.isNull("userId") ? jSONObject.optString("userId", null) : null;
                            String str2 = "Loaded userId " + optString + " for session " + str;
                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                Log.d("FirebaseCrashlytics", str2, null);
                            }
                            e9.h.c(fileInputStream, "Failed to close user metadata file.");
                            return optString;
                        } catch (Exception e10) {
                            e = e10;
                            Log.w("FirebaseCrashlytics", "Error deserializing user metadata.", e);
                            f(b10);
                            e9.h.c(fileInputStream, "Failed to close user metadata file.");
                            return null;
                        }
                    } catch (Exception e11) {
                        e = e11;
                        fileInputStream = null;
                    } catch (Throwable th) {
                        th = th;
                        e9.h.c(closeable, "Failed to close user metadata file.");
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                closeable = r32;
            }
        }
        String d = ta.b.d("No userId set for session ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", d, null);
        }
        f(b10);
        return null;
    }

    public final void g(String str, Map map, boolean z10) {
        String jSONObject;
        BufferedWriter bufferedWriter;
        j9.c cVar = this.a;
        File b10 = z10 ? cVar.b(str, "internal-keys") : cVar.b(str, "keys");
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                jSONObject = new JSONObject(map).toString();
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(b10), b));
            } catch (Exception e10) {
                e = e10;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            bufferedWriter.write(jSONObject);
            bufferedWriter.flush();
            e9.h.c(bufferedWriter, "Failed to close key/value metadata file.");
        } catch (Exception e11) {
            e = e11;
            bufferedWriter2 = bufferedWriter;
            Log.w("FirebaseCrashlytics", "Error serializing key/value metadata.", e);
            f(b10);
            e9.h.c(bufferedWriter2, "Failed to close key/value metadata file.");
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            e9.h.c(bufferedWriter2, "Failed to close key/value metadata file.");
            throw th;
        }
    }

    public final void h(String str, List list) {
        String e10;
        BufferedWriter bufferedWriter;
        File b10 = this.a.b(str, "rollouts-state");
        if (list.isEmpty()) {
            f(b10);
            return;
        }
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                e10 = e(list);
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(b10), b));
            } catch (Exception e11) {
                e = e11;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            bufferedWriter.write(e10);
            bufferedWriter.flush();
            e9.h.c(bufferedWriter, "Failed to close rollouts state file.");
        } catch (Exception e12) {
            e = e12;
            bufferedWriter2 = bufferedWriter;
            Log.w("FirebaseCrashlytics", "Error serializing rollouts state.", e);
            f(b10);
            e9.h.c(bufferedWriter2, "Failed to close rollouts state file.");
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            e9.h.c(bufferedWriter2, "Failed to close rollouts state file.");
            throw th;
        }
    }

    public final void i(String str, String str2) {
        String obj;
        BufferedWriter bufferedWriter;
        File b10 = this.a.b(str, "user-data");
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                f fVar = new f();
                fVar.put("userId", str2);
                obj = fVar.toString();
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(b10), b));
            } catch (Exception e10) {
                e = e10;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            bufferedWriter.write(obj);
            bufferedWriter.flush();
            e9.h.c(bufferedWriter, "Failed to close user metadata file.");
        } catch (Exception e11) {
            e = e11;
            bufferedWriter2 = bufferedWriter;
            Log.w("FirebaseCrashlytics", "Error serializing user metadata.", e);
            e9.h.c(bufferedWriter2, "Failed to close user metadata file.");
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            e9.h.c(bufferedWriter2, "Failed to close user metadata file.");
            throw th;
        }
    }
}
