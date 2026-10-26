package org.telegram.ui.Components;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.WidgetConformanceActivity;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class qa1 {
    public final Context a;
    public final File b;
    public final String c;
    public final org.telegram.ui.hl0 d;
    public final Handler e = new Handler(Looper.getMainLooper());

    public qa1(WidgetConformanceActivity widgetConformanceActivity, String str, org.telegram.ui.hl0 hl0Var) {
        this.a = widgetConformanceActivity.getApplicationContext();
        this.b = new File(widgetConformanceActivity.getExternalFilesDir(null), "attacks");
        this.c = str;
        this.d = hl0Var;
    }

    public final void a(String str) {
        Log.i("WidgetAttacks", str);
        this.e.post(new c71(7, this, str));
    }

    public final void b() {
        boolean z10;
        int i10;
        File file = this.b;
        JSONArray jSONArray = new JSONArray();
        try {
            try {
                int i11 = 2;
                File[] listFiles = file.listFiles(new da.a(2));
                try {
                    if (listFiles == null) {
                        throw new IllegalStateException("no " + file);
                    }
                    Arrays.sort(listFiles);
                    boolean z11 = true;
                    WidgetSandboxNative.attackScan(true);
                    int length = listFiles.length;
                    int i12 = 0;
                    int i13 = 0;
                    int i14 = 0;
                    int i15 = 0;
                    while (true) {
                        String str = "dead";
                        if (i12 < length) {
                            File file2 = listFiles[i12];
                            String str2 = this.c;
                            if (str2 == null || str2.isEmpty()) {
                                z10 = z11;
                            } else {
                                z10 = z11;
                                if (!file2.getName().contains(str2)) {
                                    i10 = i11;
                                    i12++;
                                    z11 = z10;
                                    i11 = i10;
                                }
                            }
                            JSONObject c10 = c(file2);
                            jSONArray.put(c10);
                            i13++;
                            if (!c10.optBoolean("ok")) {
                                i14++;
                            }
                            if (!c10.optString("dead").isEmpty()) {
                                i15++;
                            }
                            String name = file2.getName();
                            if (!c10.optBoolean("ok")) {
                                str = "FAIL";
                            } else if (c10.optString("dead").isEmpty()) {
                                str = "ok";
                            }
                            String optString = c10.optString("summary");
                            i10 = i11;
                            Object[] objArr = new Object[3];
                            objArr[0] = name;
                            objArr[z10 ? 1 : 0] = str;
                            objArr[i10] = optString;
                            a(String.format("%-40s %-6s %s", objArr));
                            JSONArray optJSONArray = c10.optJSONArray("problems");
                            for (int i16 = 0; optJSONArray != null && i16 < optJSONArray.length(); i16++) {
                                a("    " + optJSONArray.optString(i16));
                            }
                            i12++;
                            z11 = z10;
                            i11 = i10;
                        } else {
                            int i17 = i11;
                            JSONObject put = new JSONObject().put("width", 390).put("files", i13).put("failed", i14).put("dead", i15).put("results", jSONArray);
                            File file3 = new File(file, "report.json");
                            FileOutputStream fileOutputStream = new FileOutputStream(file3);
                            try {
                                fileOutputStream.write(put.toString(i17).getBytes(StandardCharsets.UTF_8));
                                fileOutputStream.close();
                                a("done · " + i13 + " attacks · " + i14 + " failed · " + i15 + " runtimes killed by limits · " + file3);
                                WidgetSandboxNative.attackScan(false);
                                return;
                            } finally {
                            }
                        }
                    }
                } catch (Exception e) {
                    e = e;
                    a("error · " + e);
                    WidgetSandboxNative.attackScan(false);
                }
            } catch (Throwable th2) {
                th = th2;
                WidgetSandboxNative.attackScan(false);
                throw th;
            }
        } catch (Exception e10) {
            e = e10;
        } catch (Throwable th3) {
            th = th3;
            WidgetSandboxNative.attackScan(false);
            throw th;
        }
    }

    /* JADX WARN: Finally extract failed */
    public final JSONObject c(File file) {
        String str;
        String str2;
        JSONObject put = new JSONObject().put("file", file.getName());
        pa1 pa1Var = new pa1();
        Context context = this.a;
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[16384];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read <= 0) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            String byteArrayOutputStream2 = byteArrayOutputStream.toString("UTF-8");
            fileInputStream.close();
            yb1 yb1Var = new yb1(context, byteArrayOutputStream2, zb1.d(false), 1, "en-US", null);
            yb1Var.J = new b3(pa1Var, 13);
            d(new c71(6, yb1Var, pa1Var));
            try {
                long uptimeMillis = SystemClock.uptimeMillis();
                try {
                    yb1Var.f(Math.round(AndroidUtilities.density * 390.0f));
                } catch (Exception e) {
                    pa1Var.b = String.valueOf(e.getMessage());
                }
                pa1Var.j();
                int h = pa1Var.h();
                d(new na1(yb1Var, 0));
                Thread.sleep(80L);
                d(new na1(yb1Var, 1));
                Thread.sleep(1500L);
                int h10 = pa1Var.h() - h;
                JSONArray jSONArray = new JSONArray();
                synchronized (pa1Var.d) {
                    try {
                        ArrayList arrayList = pa1Var.d;
                        int size = arrayList.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj = arrayList.get(i10);
                            i10++;
                            jSONArray.put("LEAK " + ((String) obj));
                        }
                    } finally {
                    }
                }
                if (h > 0) {
                    jSONArray.put("ACTION before the tap: " + pa1Var.i());
                }
                boolean z10 = true;
                if (h10 > 1) {
                    jSONArray.put("ACTIONS after one tap: " + pa1Var.i());
                }
                JSONObject jSONObject = pa1Var.a;
                String optString = jSONObject == null ? "" : jSONObject.optString("dead");
                JSONObject put2 = put.put("ok", jSONArray.length() == 0).put("problems", jSONArray).put("dead", optString);
                if (jSONObject == null || !jSONObject.optBoolean("loaded")) {
                    z10 = false;
                }
                put2.put("loaded", z10).put("actions", pa1Var.h()).put("ms", SystemClock.uptimeMillis() - uptimeMillis);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(jSONObject == null ? "no diagnostics" : jSONObject.optString("diagnostic"));
                if (optString.isEmpty()) {
                    str = "";
                } else {
                    str = " — " + optString;
                }
                sb2.append(str);
                if (pa1Var.b != null) {
                    str2 = " — failure: " + pa1Var.b;
                } else {
                    str2 = "";
                }
                sb2.append(str2);
                String sb3 = sb2.toString();
                if (sb3.length() > 140) {
                    sb3 = sb3.substring(0, 140);
                }
                put.put("summary", sb3);
                return put;
            } finally {
                d(new na1(yb1Var, 2));
            }
        } catch (Throwable th2) {
            try {
                fileInputStream.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    public final void d(Runnable runnable) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.e.post(new oa1(runnable, countDownLatch, 0));
        countDownLatch.await(5L, TimeUnit.SECONDS);
    }
}
