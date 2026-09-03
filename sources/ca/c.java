package ca;

import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.Log;
import b4.e0;
import b6.m;
import c9.q;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import d9.k;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class c implements d {
    public static final Object m = new Object();
    public final w8.g a;
    public final ea.c b;
    public final af.c c;
    public final j d;
    public final q e;
    public final h f;
    public final Object g;
    public final ExecutorService h;
    public final k i;
    public String j;
    public final HashSet k;
    public final ArrayList l;

    static {
        new AtomicInteger(1);
    }

    public c(w8.g gVar, ba.b bVar, ExecutorService executorService, k kVar) {
        gVar.a();
        ea.c cVar = new ea.c(gVar.a, bVar);
        af.c cVar2 = new af.c(gVar);
        if (db.a.b == null) {
            db.a.b = new db.a(6);
        }
        db.a aVar = db.a.b;
        if (j.d == null) {
            j.d = new j(aVar);
        }
        j jVar = j.d;
        q qVar = new q(new c9.d(gVar, 2));
        h hVar = new h();
        this.g = new Object();
        this.k = new HashSet();
        this.l = new ArrayList();
        this.a = gVar;
        this.b = cVar;
        this.c = cVar2;
        this.d = jVar;
        this.e = qVar;
        this.f = hVar;
        this.h = executorService;
        this.i = kVar;
    }

    public final void a(i iVar) {
        synchronized (this.g) {
            this.l.add(iVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
    
        r3 = h(r2);
        r4 = r6.c;
        r2 = r2.a();
        r2.c = r3;
        r2.b = 3;
        r2 = r2.a();
        r4.T(r2);
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        da.b Y;
        synchronized (m) {
            try {
                w8.g gVar = this.a;
                gVar.a();
                af.c p10 = af.c.p(gVar.a);
                try {
                    Y = this.c.Y();
                    int i10 = Y.b;
                    boolean z4 = true;
                    if (i10 != 2 && i10 != 1) {
                        z4 = false;
                    }
                    if (p10 != null) {
                        p10.a0();
                    }
                } catch (Throwable th2) {
                    if (p10 != null) {
                        p10.a0();
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        k(Y);
        this.i.execute(new b(this, 1));
    }

    public final da.b c(da.b bVar) {
        int responseCode;
        ea.b f10;
        w8.g gVar = this.a;
        gVar.a();
        String str = gVar.c.a;
        String str2 = bVar.a;
        gVar.a();
        String str3 = gVar.c.g;
        String str4 = bVar.d;
        ea.c cVar = this.b;
        ea.d dVar = cVar.c;
        if (!dVar.b()) {
            throw new e("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL a2 = ea.c.a("projects/" + str3 + "/installations/" + str2 + "/authTokens:generate");
        for (int i10 = 0; i10 <= 1; i10++) {
            TrafficStats.setThreadStatsTag(32771);
            HttpURLConnection c3 = cVar.c(a2, str);
            try {
                try {
                    c3.setRequestMethod("POST");
                    c3.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    c3.setDoOutput(true);
                    ea.c.h(c3);
                    responseCode = c3.getResponseCode();
                    dVar.d(responseCode);
                } finally {
                    c3.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
            } catch (IOException | AssertionError unused) {
            }
            if (responseCode >= 200 && responseCode < 300) {
                f10 = ea.c.f(c3);
            } else {
                ea.c.b(c3, null, str, str3);
                if (responseCode == 401 || responseCode == 404) {
                    e0 a10 = ea.b.a();
                    a10.b = 3;
                    f10 = a10.c();
                } else {
                    if (responseCode == 429) {
                        throw new e("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                        e0 a11 = ea.b.a();
                        a11.b = 2;
                        f10 = a11.c();
                    }
                }
            }
            int c10 = m1.j.c(f10.c);
            if (c10 != 0) {
                if (c10 == 1) {
                    da.a a12 = bVar.a();
                    a12.f = "BAD CONFIG";
                    a12.b = 5;
                    return a12.a();
                }
                if (c10 != 2) {
                    throw new e("Firebase Installations Service is unavailable. Please try again later.");
                }
                l(null);
                da.a a13 = bVar.a();
                a13.b = 2;
                return a13.a();
            }
            String str5 = f10.a;
            long j10 = f10.b;
            j jVar = this.d;
            jVar.getClass();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            jVar.a.getClass();
            long seconds = timeUnit.toSeconds(System.currentTimeMillis());
            da.a a14 = bVar.a();
            a14.d = str5;
            a14.g = Long.valueOf(j10);
            a14.h = Long.valueOf(seconds);
            return a14.a();
        }
        throw new e("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final Task d() {
        String str;
        g();
        synchronized (this) {
            str = this.j;
        }
        if (str != null) {
            return Tasks.forResult(str);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        a(new g(taskCompletionSource));
        Task task = taskCompletionSource.getTask();
        this.h.execute(new b(this, 0));
        return task;
    }

    public final Task e() {
        g();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        a(new f(this.d, taskCompletionSource));
        Task task = taskCompletionSource.getTask();
        this.h.execute(new b(this, 2));
        return task;
    }

    /* JADX WARN: Finally extract failed */
    public final void f(da.b bVar) {
        synchronized (m) {
            try {
                w8.g gVar = this.a;
                gVar.a();
                af.c p10 = af.c.p(gVar.a);
                try {
                    this.c.T(bVar);
                    if (p10 != null) {
                        p10.a0();
                    }
                } catch (Throwable th2) {
                    if (p10 != null) {
                        p10.a0();
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void g() {
        w8.g gVar = this.a;
        gVar.a();
        m.g(gVar.c.b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        m.g(gVar.c.g, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        m.g(gVar.c.a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        String str = gVar.c.b;
        Pattern pattern = j.c;
        m.a("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", str.contains(":"));
        gVar.a();
        m.a("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", j.c.matcher(gVar.c.a).matches());
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if ("[DEFAULT]".equals(r0.b) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String h(da.b bVar) {
        String a2;
        w8.g gVar = this.a;
        gVar.a();
        if (!gVar.b.equals("CHIME_ANDROID_SDK")) {
            w8.g gVar2 = this.a;
            gVar2.a();
        }
        if (bVar.b == 1) {
            da.c cVar = (da.c) this.e.get();
            synchronized (cVar.a) {
                try {
                    a2 = cVar.a();
                    if (a2 == null) {
                        a2 = cVar.b();
                    }
                } finally {
                }
            }
            if (!TextUtils.isEmpty(a2)) {
                return a2;
            }
            this.f.getClass();
            return h.a();
        }
        this.f.getClass();
        return h.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [ea.c] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [ea.a] */
    public final da.b i(da.b bVar) {
        int responseCode;
        String str = bVar.a;
        String str2 = null;
        if (str != null && str.length() == 11) {
            da.c cVar = (da.c) this.e.get();
            synchronized (cVar.a) {
                try {
                    String[] strArr = da.c.c;
                    int i10 = 0;
                    while (true) {
                        if (i10 < 4) {
                            String str3 = strArr[i10];
                            String string = cVar.a.getString("|T|" + cVar.b + "|" + str3, null);
                            if (string == null || string.isEmpty()) {
                                i10++;
                            } else if (string.startsWith("{")) {
                                try {
                                    str2 = new JSONObject(string).getString("token");
                                } catch (JSONException unused) {
                                }
                            } else {
                                str2 = string;
                            }
                        }
                    }
                } finally {
                }
            }
        }
        ea.c cVar2 = this.b;
        w8.g gVar = this.a;
        gVar.a();
        String str4 = gVar.c.a;
        String str5 = bVar.a;
        w8.g gVar2 = this.a;
        gVar2.a();
        String str6 = gVar2.c.g;
        w8.g gVar3 = this.a;
        gVar3.a();
        String str7 = gVar3.c.b;
        ea.d dVar = cVar2.c;
        if (!dVar.b()) {
            throw new e("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL a2 = ea.c.a("projects/" + str6 + "/installations");
        int i11 = 0;
        ea.a aVar = cVar2;
        while (i11 <= 1) {
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection c3 = aVar.c(a2, str4);
            try {
                try {
                    c3.setRequestMethod("POST");
                    c3.setDoOutput(true);
                    if (str2 != null) {
                        c3.addRequestProperty("x-goog-fis-android-iid-migration-auth", str2);
                    }
                    ea.c.g(c3, str5, str7);
                    responseCode = c3.getResponseCode();
                    dVar.d(responseCode);
                } catch (IOException | AssertionError unused2) {
                }
                if (responseCode >= 200 && responseCode < 300) {
                    ea.a e = ea.c.e(c3);
                    c3.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    aVar = e;
                } else {
                    try {
                        ea.c.b(c3, str7, str4, str6);
                    } catch (IOException | AssertionError unused3) {
                        c3.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        i11++;
                        aVar = aVar;
                    }
                    if (responseCode == 429) {
                        throw new e("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                        ea.a aVar2 = new ea.a(null, null, null, null, 2);
                        c3.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        aVar = aVar2;
                    } else {
                        c3.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        i11++;
                        aVar = aVar;
                    }
                }
                int c10 = m1.j.c(aVar.e);
                if (c10 != 0) {
                    if (c10 != 1) {
                        throw new e("Firebase Installations Service is unavailable. Please try again later.");
                    }
                    da.a a10 = bVar.a();
                    a10.f = "BAD CONFIG";
                    a10.b = 5;
                    return a10.a();
                }
                String str8 = aVar.b;
                String str9 = aVar.c;
                j jVar = this.d;
                jVar.getClass();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                jVar.a.getClass();
                long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                ea.b bVar2 = aVar.d;
                String str10 = bVar2.a;
                long j10 = bVar2.b;
                da.a a11 = bVar.a();
                a11.c = str8;
                a11.b = 4;
                a11.d = str10;
                a11.e = str9;
                a11.g = Long.valueOf(j10);
                a11.h = Long.valueOf(seconds);
                return a11.a();
            } finally {
                c3.disconnect();
                TrafficStats.clearThreadStatsTag();
            }
        }
        throw new e("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final void j(Exception exc) {
        synchronized (this.g) {
            try {
                Iterator it = this.l.iterator();
                while (it.hasNext()) {
                    if (((i) it.next()).a(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void k(da.b bVar) {
        synchronized (this.g) {
            try {
                Iterator it = this.l.iterator();
                while (it.hasNext()) {
                    if (((i) it.next()).b(bVar)) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final synchronized void l(String str) {
        this.j = str;
    }

    public final synchronized void m(da.b bVar, da.b bVar2) {
        try {
            if (this.k.size() != 0 && !TextUtils.equals(bVar.a, bVar2.a)) {
                Iterator it = this.k.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            }
        } finally {
        }
    }
}
