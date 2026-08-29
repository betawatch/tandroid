package aa;

import a9.q;
import ag.j2;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.Log;
import b9.l;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class c implements d {
    public static final Object m = new Object();
    public final u8.g a;
    public final ca.c b;
    public final ze.b c;
    public final j d;
    public final q e;
    public final h f;
    public final Object g;
    public final ExecutorService h;
    public final l i;
    public String j;
    public final HashSet k;
    public final ArrayList l;

    static {
        new AtomicInteger(1);
    }

    public c(u8.g gVar, z9.b bVar, ExecutorService executorService, l lVar) {
        gVar.a();
        ca.c cVar = new ca.c(gVar.a, bVar);
        ze.b bVar2 = new ze.b();
        bVar2.b = gVar;
        if (bb.a.b == null) {
            bb.a.b = new bb.a(5);
        }
        bb.a aVar = bb.a.b;
        if (j.d == null) {
            j.d = new j(aVar);
        }
        j jVar = j.d;
        q qVar = new q(new a9.d(gVar, 2));
        h hVar = new h();
        this.g = new Object();
        this.k = new HashSet();
        this.l = new ArrayList();
        this.a = gVar;
        this.b = cVar;
        this.c = bVar2;
        this.d = jVar;
        this.e = qVar;
        this.f = hVar;
        this.h = executorService;
        this.i = lVar;
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
        r4.K(r2);
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        ba.b R;
        synchronized (m) {
            try {
                u8.g gVar = this.a;
                gVar.a();
                ze.b i10 = ze.b.i(gVar.a);
                try {
                    R = this.c.R();
                    int i11 = R.b;
                    boolean z10 = true;
                    if (i11 != 2 && i11 != 1) {
                        z10 = false;
                    }
                    if (i10 != null) {
                        i10.S();
                    }
                } catch (Throwable th2) {
                    if (i10 != null) {
                        i10.S();
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        k(R);
        this.i.execute(new b(this, 1));
    }

    public final ba.b c(ba.b bVar) {
        int responseCode;
        ca.b f9;
        u8.g gVar = this.a;
        gVar.a();
        String str = gVar.c.a;
        String str2 = bVar.a;
        gVar.a();
        String str3 = gVar.c.g;
        String str4 = bVar.d;
        ca.c cVar = this.b;
        ca.d dVar = cVar.c;
        if (!dVar.b()) {
            throw new e("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL a2 = ca.c.a("projects/" + str3 + "/installations/" + str2 + "/authTokens:generate");
        for (int i10 = 0; i10 <= 1; i10++) {
            TrafficStats.setThreadStatsTag(32771);
            HttpURLConnection c3 = cVar.c(a2, str);
            try {
                try {
                    c3.setRequestMethod("POST");
                    c3.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    c3.setDoOutput(true);
                    ca.c.h(c3);
                    responseCode = c3.getResponseCode();
                    dVar.d(responseCode);
                } finally {
                    c3.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
            } catch (IOException | AssertionError unused) {
            }
            if (responseCode >= 200 && responseCode < 300) {
                f9 = ca.c.f(c3);
            } else {
                ca.c.b(c3, null, str, str3);
                if (responseCode == 401 || responseCode == 404) {
                    j2 a10 = ca.b.a();
                    a10.b = 3;
                    f9 = a10.b();
                } else {
                    if (responseCode == 429) {
                        throw new e("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                        j2 a11 = ca.b.a();
                        a11.b = 2;
                        f9 = a11.b();
                    }
                }
            }
            int b10 = m1.j.b(f9.c);
            if (b10 != 0) {
                if (b10 == 1) {
                    ba.a a12 = bVar.a();
                    a12.f = "BAD CONFIG";
                    a12.b = 5;
                    return a12.a();
                }
                if (b10 != 2) {
                    throw new e("Firebase Installations Service is unavailable. Please try again later.");
                }
                l(null);
                ba.a a13 = bVar.a();
                a13.b = 2;
                return a13.a();
            }
            String str5 = f9.a;
            long j10 = f9.b;
            j jVar = this.d;
            jVar.getClass();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            jVar.a.getClass();
            long seconds = timeUnit.toSeconds(System.currentTimeMillis());
            ba.a a14 = bVar.a();
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
    public final void f(ba.b bVar) {
        synchronized (m) {
            try {
                u8.g gVar = this.a;
                gVar.a();
                ze.b i10 = ze.b.i(gVar.a);
                try {
                    this.c.K(bVar);
                    if (i10 != null) {
                        i10.S();
                    }
                } catch (Throwable th2) {
                    if (i10 != null) {
                        i10.S();
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void g() {
        u8.g gVar = this.a;
        gVar.a();
        z5.l.g(gVar.c.b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        z5.l.g(gVar.c.g, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        z5.l.g(gVar.c.a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        String str = gVar.c.b;
        Pattern pattern = j.c;
        z5.l.a("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", str.contains(":"));
        gVar.a();
        z5.l.a("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", j.c.matcher(gVar.c.a).matches());
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if ("[DEFAULT]".equals(r0.b) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String h(ba.b bVar) {
        String a2;
        u8.g gVar = this.a;
        gVar.a();
        if (!gVar.b.equals("CHIME_ANDROID_SDK")) {
            u8.g gVar2 = this.a;
            gVar2.a();
        }
        if (bVar.b == 1) {
            ba.c cVar = (ba.c) this.e.get();
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
    /* JADX WARN: Type inference failed for: r2v2, types: [ca.c] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [ca.a] */
    public final ba.b i(ba.b bVar) {
        int responseCode;
        String str = bVar.a;
        String str2 = null;
        if (str != null && str.length() == 11) {
            ba.c cVar = (ba.c) this.e.get();
            synchronized (cVar.a) {
                try {
                    String[] strArr = ba.c.c;
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
        ca.c cVar2 = this.b;
        u8.g gVar = this.a;
        gVar.a();
        String str4 = gVar.c.a;
        String str5 = bVar.a;
        u8.g gVar2 = this.a;
        gVar2.a();
        String str6 = gVar2.c.g;
        u8.g gVar3 = this.a;
        gVar3.a();
        String str7 = gVar3.c.b;
        ca.d dVar = cVar2.c;
        if (!dVar.b()) {
            throw new e("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL a2 = ca.c.a("projects/" + str6 + "/installations");
        int i11 = 0;
        ca.a aVar = cVar2;
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
                    ca.c.g(c3, str5, str7);
                    responseCode = c3.getResponseCode();
                    dVar.d(responseCode);
                } catch (IOException | AssertionError unused2) {
                }
                if (responseCode >= 200 && responseCode < 300) {
                    ca.a e10 = ca.c.e(c3);
                    c3.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    aVar = e10;
                } else {
                    try {
                        ca.c.b(c3, str7, str4, str6);
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
                        ca.a aVar2 = new ca.a(null, null, null, null, 2);
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
                int b10 = m1.j.b(aVar.e);
                if (b10 != 0) {
                    if (b10 != 1) {
                        throw new e("Firebase Installations Service is unavailable. Please try again later.");
                    }
                    ba.a a10 = bVar.a();
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
                ca.b bVar2 = aVar.d;
                String str10 = bVar2.a;
                long j10 = bVar2.b;
                ba.a a11 = bVar.a();
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
                    if (((i) it.next()).b(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void k(ba.b bVar) {
        synchronized (this.g) {
            try {
                Iterator it = this.l.iterator();
                while (it.hasNext()) {
                    if (((i) it.next()).a(bVar)) {
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

    public final synchronized void m(ba.b bVar, ba.b bVar2) {
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
