// default package

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ClipDescription;
import android.content.ComponentName;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.SurfaceTexture;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.os.PersistableBundle;
import android.os.Process;
import android.os.RemoteException;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.view.ViewGroup;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessagingService;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.io.StringReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.Signature;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.ReentrantLock;
import java.util.zip.Adler32;
import java.util.zip.InflaterInputStream;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.net.ssl.HttpsURLConnection;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.ILocationServiceProvider;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.messenger.b;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class in3 implements lv8, ILocationServiceProvider, fq5, ts4, dc7, uw9, ldc, i68, z99 {
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;
    public Object d;

    public in3(yh4 yh4Var, ybc ybcVar, yf7 yf7Var) {
        ig7 ig7Var;
        int i;
        int i2;
        this.a = (byte) 21;
        this.c = yh4Var;
        this.d = new ArrayList();
        yf7 yf7Var2 = yf7Var;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            ig7Var = ig7.n;
            if (yf7Var2 == null) {
                break;
            }
            int i5 = yf7Var2.c;
            int i6 = i3 + yf7Var2.d;
            yf7 yf7Var3 = yf7Var2.e;
            int i7 = i4;
            ig7 ig7Var2 = yf7Var2.a;
            boolean z = (ig7Var2 == ig7.h && yf7Var3 == null && i5 != 0) || !(yf7Var3 == null || i5 == yf7Var3.c);
            i = z ? 1 : i7;
            if (yf7Var3 == null || yf7Var3.a != ig7Var2 || z) {
                ((ArrayList) this.d).add(0, new zf7(this, ig7Var2, yf7Var2.b, i5, i6));
                i2 = 0;
            } else {
                i2 = i6;
            }
            if (z) {
                ((ArrayList) this.d).add(0, new zf7(this, ig7Var, yf7Var2.b, yf7Var2.c, 0));
            }
            i4 = i;
            yf7Var2 = yf7Var3;
            i3 = i2;
        }
        int i8 = i4;
        boolean z2 = yh4Var.a;
        g54 g54Var = (g54) yh4Var.d;
        if (z2) {
            zf7 zf7Var = (zf7) ((ArrayList) this.d).get(0);
            if (zf7Var != null && zf7Var.a != ig7Var && i8 != 0) {
                ((ArrayList) this.d).add(0, new zf7(this, ig7Var, 0, 0, 0));
            }
            ((ArrayList) this.d).add(((zf7) ((ArrayList) this.d).get(0)).a == ig7Var ? 1 : 0, new zf7(this, ig7.s, 0, 0, 0));
        }
        int i9 = ybcVar.a;
        int i10 = 26;
        int F = wi8.F(i9 <= 9 ? 1 : i9 <= 26 ? 2 : 3);
        if (F == 0) {
            i10 = 9;
        } else if (F != 1) {
            i = 27;
            i10 = 40;
        } else {
            i = 10;
        }
        int x = x(ybcVar);
        while (i9 < i10 && !a44.d(x, ybc.c(i9), g54Var)) {
            i9++;
        }
        while (i9 > i && a44.d(x, ybc.c(i9 - 1), g54Var)) {
            i9--;
        }
        this.b = ybc.c(i9);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v38 */
    public static StringBuilder C(String str) {
        StringBuilder sb;
        boolean z;
        byte[] H;
        char c;
        try {
            BufferedReader bufferedReader = new BufferedReader(new StringReader(str));
            boolean z2 = false;
            boolean z3 = false;
            in3 in3Var = null;
            String str2 = null;
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                if (!readLine.startsWith("PHOTO")) {
                    z3 = z3;
                    if (readLine.indexOf(58) >= 0) {
                        if (readLine.startsWith("BEGIN:VCARD")) {
                            in3Var = new in3((byte) 19, z2);
                            in3Var.d = new ArrayList();
                            in3Var.b = new ArrayList();
                            z3 = z3;
                        } else {
                            z3 = z3;
                            z3 = z3;
                            if (readLine.startsWith("END:VCARD") && in3Var != null) {
                                z3 = true;
                            }
                        }
                    }
                    if (str2 != null) {
                        readLine = str2 + readLine;
                        str2 = null;
                    }
                    if (readLine.contains("=QUOTED-PRINTABLE") && readLine.endsWith("=")) {
                        str2 = readLine.substring(z2 ? 1 : 0, readLine.length() - 1);
                    } else {
                        int indexOf = readLine.indexOf(":");
                        String[] strArr = indexOf >= 0 ? new String[]{readLine.substring(z2 ? 1 : 0, indexOf), readLine.substring(indexOf + 1).trim()} : new String[]{readLine.trim()};
                        if (strArr.length < 2 || in3Var == null) {
                            z = z2 ? 1 : 0;
                        } else if (strArr[z2 ? 1 : 0].startsWith("ORG")) {
                            String[] split = strArr[z2 ? 1 : 0].split(";");
                            int length = split.length;
                            int i = z2 ? 1 : 0;
                            String str3 = null;
                            String str4 = null;
                            ?? r2 = z2;
                            while (i < length) {
                                String[] split2 = split[i].split("=");
                                sb = null;
                                try {
                                    if (split2.length != 2) {
                                        c = r2;
                                    } else {
                                        c = r2;
                                        if (split2[r2].equals("CHARSET")) {
                                            str4 = split2[1];
                                        } else if (split2[c].equals("ENCODING")) {
                                            str3 = split2[1];
                                        }
                                    }
                                    i++;
                                    r2 = c;
                                } catch (Throwable unused) {
                                    return sb;
                                }
                            }
                            z = r2;
                            in3Var.c = strArr[1];
                            if (str3 != null && str3.equalsIgnoreCase("QUOTED-PRINTABLE") && (H = gm.H(gm.g1((String) in3Var.c))) != null && H.length != 0) {
                                in3Var.c = new String(H, str4);
                            }
                            in3Var.c = ((String) in3Var.c).replace(';', ' ');
                        } else {
                            ?? r17 = z2 ? 1 : 0;
                            if (strArr[r17].startsWith("TEL")) {
                                z = r17;
                                if (strArr[1].length() > 0) {
                                    ((ArrayList) in3Var.b).add(strArr[1]);
                                    z = r17;
                                }
                            } else {
                                boolean startsWith = strArr[r17].startsWith("EMAIL");
                                z = r17;
                                if (startsWith) {
                                    String str5 = strArr[1];
                                    z = r17;
                                    if (str5.length() > 0) {
                                        ((ArrayList) in3Var.d).add(str5);
                                        z = r17;
                                    }
                                }
                            }
                        }
                        z2 = z;
                    }
                }
                return sb;
            }
            int i2 = z2 ? 1 : 0;
            sb = null;
            try {
                bufferedReader.close();
            } catch (Exception e) {
                fc4.g(e, true);
            }
            if (!z3) {
                return null;
            }
            StringBuilder sb2 = new StringBuilder();
            for (int i3 = i2; i3 < ((ArrayList) in3Var.b).size(); i3++) {
                if (sb2.length() > 0) {
                    sb2.append('\n');
                }
                String str6 = (String) ((ArrayList) in3Var.b).get(i3);
                if (str6.contains("#") || str6.contains("*")) {
                    sb2.append(str6);
                } else {
                    sb2.append(r58.f().e(str6));
                }
            }
            for (int i4 = i2; i4 < ((ArrayList) in3Var.d).size(); i4++) {
                if (sb2.length() > 0) {
                    sb2.append('\n');
                }
                sb2.append(r58.f().e((String) ((ArrayList) in3Var.d).get(i4)));
            }
            if (!TextUtils.isEmpty((String) in3Var.c)) {
                if (sb2.length() > 0) {
                    sb2.append('\n');
                }
                sb2.append((String) in3Var.c);
            }
            return sb2;
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static String q(String str, HashMap hashMap) {
        StringBuilder sb = new StringBuilder();
        Iterator it = hashMap.entrySet().iterator();
        Map.Entry entry = (Map.Entry) it.next();
        sb.append((String) entry.getKey());
        sb.append("=");
        sb.append(entry.getValue() != null ? URLEncoder.encode((String) entry.getValue(), "UTF-8") : "");
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            sb.append("&");
            sb.append((String) entry2.getKey());
            sb.append("=");
            sb.append(entry2.getValue() != null ? URLEncoder.encode((String) entry2.getValue(), "UTF-8") : "");
        }
        String sb2 = sb.toString();
        if (sb2.isEmpty()) {
            return str;
        }
        if (!str.contains("?")) {
            return kt6.o(str, "?", sb2);
        }
        if (!str.endsWith("&")) {
            sb2 = "&".concat(sb2);
        }
        return str.concat(sb2);
    }

    public final void A(String str, String str2) {
        ((HashMap) this.d).put(str, str2);
    }

    public final String B() {
        if (!z()) {
            u36.g();
            return null;
        }
        String str = (String) this.c;
        this.c = null;
        return str;
    }

    public final void D(vc9 vc9Var, Serializable serializable) {
        EnumMap enumMap = (EnumMap) this.d;
        if (enumMap == null) {
            enumMap = new EnumMap(vc9.class);
            this.d = enumMap;
        }
        enumMap.put((EnumMap) vc9Var, (vc9) serializable);
    }

    public final void E(rb0 rb0Var, int i, boolean z) {
        char c;
        jb0 jb0Var = (jb0) this.d;
        Context context = (Context) this.b;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        String str = rb0Var.a;
        adler32.update(str.getBytes(Charset.forName("UTF-8")));
        ByteBuffer allocate = ByteBuffer.allocate(4);
        fl8 fl8Var = rb0Var.c;
        adler32.update(allocate.putInt(gl8.a(fl8Var)).array());
        byte[] bArr = rb0Var.b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i2 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i2 >= i) {
                        aqe.a(rb0Var, "JobInfoScheduler", "Upload for context %s is already scheduled. Returning...");
                        return;
                    }
                }
            }
        }
        Cursor rawQuery = ((mq9) this.c).a().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str, String.valueOf(gl8.a(fl8Var))});
        try {
            Long valueOf = rawQuery.moveToNext() ? Long.valueOf(rawQuery.getLong(0)) : 0L;
            rawQuery.close();
            long longValue = valueOf.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            builder.setMinimumLatency(jb0Var.a(fl8Var, longValue, i));
            Set set = ((kb0) jb0Var.b.get(fl8Var)).c;
            Long l = valueOf;
            if (set.contains(ns9.a)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(ns9.c)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(ns9.b)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i);
            persistableBundle.putString("backendName", str);
            persistableBundle.putInt("priority", gl8.a(fl8Var));
            if (bArr != null) {
                c = 0;
                persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
            } else {
                c = 0;
            }
            builder.setExtras(persistableBundle);
            Integer valueOf2 = Integer.valueOf(value);
            Long valueOf3 = Long.valueOf(jb0Var.a(fl8Var, longValue, i));
            Integer valueOf4 = Integer.valueOf(i);
            Object[] objArr = new Object[5];
            objArr[c] = rb0Var;
            objArr[1] = valueOf2;
            objArr[2] = valueOf3;
            objArr[3] = l;
            objArr[4] = valueOf4;
            String c2 = aqe.c("JobInfoScheduler");
            if (Log.isLoggable(c2, 3)) {
                Log.d(c2, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }

    @Override // dc7
    public final void a() {
        ((cr1) this.b).c(false);
        ((d) this.c).presentFragment(new yv1((Bundle) this.d));
    }

    @Override // uw9
    public final void b(yw7 yw7Var) {
        long d;
        ((vqb) this.c).getClass();
        String str = hac.a;
        vqb vqbVar = (vqb) this.c;
        synchronized (vqbVar) {
            long j = vqbVar.c;
            d = j != -9223372036854775807L ? j + vqbVar.b : vqbVar.d();
        }
        long e = ((vqb) this.c).e();
        if (d == -9223372036854775807L || e == -9223372036854775807L) {
            return;
        }
        go4 go4Var = (go4) this.b;
        if (e != go4Var.y) {
            fo4 a = go4Var.a();
            a.x = e;
            go4 go4Var2 = new go4(a);
            this.b = go4Var2;
            ((yzb) this.d).g(go4Var2);
        }
        int a2 = yw7Var.a();
        ((yzb) this.d).e(a2, yw7Var);
        ((yzb) this.d).a(d, 1, a2, 0, null);
    }

    @Override // uw9
    public final void c(vqb vqbVar, u84 u84Var, l4c l4cVar) {
        this.c = vqbVar;
        l4cVar.a();
        l4cVar.b();
        yzb c0 = u84Var.c0(l4cVar.d, 5);
        this.d = c0;
        c0.g((go4) this.b);
    }

    @Override // org.telegram.messenger.ILocationServiceProvider
    public final void checkLocationSettings(nj5 nj5Var, gu2 gu2Var) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(((o05) nj5Var).a);
        ua4 ua4Var = (ua4) this.c;
        id6 id6Var = new id6(arrayList, false, false);
        ua4Var.getClass();
        bib b = cib.b();
        b.a = new fkd((Object) id6Var, (byte) 0);
        b.d = (char) 2426;
        ua4Var.e(0, b.a()).addOnCompleteListener(new l05(gu2Var, (byte) 1));
    }

    @Override // org.telegram.messenger.ILocationServiceProvider
    public final boolean checkServices() {
        return b.b.hasServices();
    }

    @Override // z99
    public final void d() {
        qac qacVar;
        boolean[] zArr = (boolean[]) this.b;
        byte b = 1;
        if (!zArr[0] && (qacVar = (qac) this.c) != null) {
            zArr[0] = true;
            qacVar.a(Boolean.TRUE);
        }
        gm.d3(new i((c41) this.d, b), 200L);
    }

    @Override // fq5
    public final Uri e() {
        return (Uri) this.b;
    }

    @Override // mv8
    public final Object get() {
        Context context = (Context) ((lq5) this.b).a;
        cy2 cy2Var = (cy2) ((lq5) this.c).a;
        z7a z7aVar = (z7a) ((lv8) this.d).get();
        context.getClass();
        cy2Var.getClass();
        z7aVar.getClass();
        return jj4.a(z7aVar, new ai4((Object) new z1((Object) z7aVar, (byte) 4), (byte) 28), ibe.a(cy2Var), new ij4(context, (byte) 1));
    }

    @Override // fq5
    public final ClipDescription getDescription() {
        return (ClipDescription) this.c;
    }

    @Override // org.telegram.messenger.ILocationServiceProvider
    public final void getLastLocation(gu2 gu2Var) {
        ua4 ua4Var = (ua4) this.b;
        ua4Var.getClass();
        bib b = cib.b();
        b.a = f8e.d;
        b.d = (char) 2414;
        ua4Var.e(0, b.a()).addOnCompleteListener(new l05(gu2Var, (byte) 0));
    }

    @Override // fq5
    public final Uri h() {
        return (Uri) this.d;
    }

    @Override // org.telegram.messenger.ILocationServiceProvider
    public final void init(Context context) {
        zo zoVar = hd6.a;
        zo zoVar2 = ua4.r;
        b05 b05Var = b05.c;
        vo voVar = wo.g;
        this.b = new ua4(context, zoVar2, voVar, b05Var);
        this.c = new ua4(context, zoVar2, voVar, b05Var);
    }

    @Override // ts4
    public final void j(Throwable th) {
        ly6 ly6Var = (ly6) this.d;
        qt qtVar = ly6Var.h;
        my6 my6Var = (my6) this.b;
        ly6Var.i.remove(my6Var);
    }

    @Override // fq5
    public final Object k() {
        return null;
    }

    @Override // dc7
    public final void l(boolean z) {
        ((cr1) this.b).c(false);
        ((d) this.c).presentFragment(new yv1((Bundle) this.d));
    }

    @Override // i68
    public final void m(ArrayList arrayList) {
        String str = !arrayList.isEmpty() ? ((z5a) arrayList.get(0)).c : null;
        if (str == null) {
            return;
        }
        Utilities.e.c(new no8((Object) str, this.b, this.c, this.d, (byte) 5));
    }

    public final void o() {
        mx6 mx6Var = (mx6) this.b;
        if (mx6Var != null) {
            int i = ((wz4) this.d).n.d;
            zw6 zw6Var = (zw6) mx6Var.b;
            zw6Var.getClass();
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            builder.setLegacyStreamType(i);
            zw6Var.a.setPlaybackToLocal(builder.build());
            this.c = null;
        }
    }

    @Override // org.telegram.messenger.ILocationServiceProvider
    public final nj5 onCreateLocationRequest() {
        LocationRequest locationRequest = new LocationRequest(nm7.m1, 3600000L, 600000L, 0L, Long.MAX_VALUE, Long.MAX_VALUE, ConnectionsManager.DEFAULT_DATACENTER_ID, 0.0f, true, 3600000L, 0, 0, null, false, new WorkSource(), null);
        o05 o05Var = new o05();
        o05Var.a = locationRequest;
        return o05Var;
    }

    @Override // org.telegram.messenger.ILocationServiceProvider
    public final oj5 onCreateLocationServicesAPI(Context context, kj5 kj5Var, final lj5 lj5Var) {
        List list;
        Context context2 = a.b;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        qt qtVar = new qt(0);
        qt qtVar2 = new qt(0);
        Object obj = d05.d;
        or5 or5Var = p4d.a;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Looper mainLooper = context2.getMainLooper();
        String packageName = context2.getPackageName();
        String name = context2.getClass().getName();
        zo zoVar = hd6.a;
        ite.i(zoVar, "Api must not be null");
        oj5 oj5Var = null;
        qtVar2.put(zoVar, null);
        switch (zoVar.a.a) {
            case 9:
                list = Collections.EMPTY_LIST;
                break;
            default:
                list = Collections.EMPTY_LIST;
                break;
        }
        hashSet2.addAll(list);
        hashSet.addAll(list);
        arrayList.add(new n05(kj5Var));
        arrayList2.add(new g05() { // from class: k05
            @Override // g05
            public final void onConnectionFailed(ot2 ot2Var) {
                dd6 dd6Var = (dd6) lj5.this;
                if (dd6Var.M) {
                    return;
                }
                dd6Var.L = Boolean.FALSE;
                if (dd6Var.E) {
                    dd6Var.E = false;
                    dd6Var.p();
                }
            }
        });
        boolean z = true;
        ite.a("must call addApi() to add at least one API", !qtVar2.isEmpty());
        ija ijaVar = ija.a;
        zo zoVar2 = p4d.b;
        if (qtVar2.containsKey(zoVar2)) {
            ijaVar = (ija) qtVar2.get(zoVar2);
        }
        ovb ovbVar = new ovb(hashSet, qtVar, packageName, name, ijaVar);
        Map map = (Map) ovbVar.c;
        qt qtVar3 = new qt(0);
        qt qtVar4 = new qt(0);
        ArrayList arrayList3 = new ArrayList();
        Iterator it = ((ot) qtVar2.keySet()).iterator();
        zo zoVar3 = null;
        while (true) {
            nt ntVar = (nt) it;
            if (!ntVar.hasNext()) {
                ovb ovbVar2 = ovbVar;
                qt qtVar5 = qtVar3;
                qt qtVar6 = qtVar4;
                ArrayList arrayList4 = arrayList3;
                oj5 oj5Var2 = oj5Var;
                Looper looper = mainLooper;
                if (zoVar3 != null) {
                    boolean equals = hashSet.equals(hashSet2);
                    String str = zoVar3.c;
                    if (!equals) {
                        dq9.m(kt6.o("Must not set scopes in GoogleApiClient.Builder when using ", str, ". Set account in GoogleSignInOptions.Builder instead."));
                        return oj5Var2;
                    }
                }
                o3d o3dVar = new o3d(context2, new ReentrantLock(), looper, ovbVar2, qtVar5, arrayList, arrayList2, qtVar6, o3d.f(qtVar6.values(), true), arrayList4);
                Set set = h05.a;
                synchronized (set) {
                    set.add(o3dVar);
                }
                fk3 fk3Var = new fk3();
                fk3Var.a = o3dVar;
                return fk3Var;
            }
            oj5 oj5Var3 = oj5Var;
            zo zoVar4 = (zo) ntVar.next();
            Object obj2 = qtVar2.get(zoVar4);
            boolean z2 = map.get(zoVar4) != null ? z : false;
            qtVar3.put(zoVar4, Boolean.valueOf(z2));
            qt qtVar7 = qtVar4;
            Looper looper2 = mainLooper;
            j5d j5dVar = new j5d(zoVar4, z2);
            arrayList3.add(j5dVar);
            ArrayList arrayList5 = arrayList3;
            Map map2 = map;
            ovb ovbVar3 = ovbVar;
            qt qtVar8 = qtVar2;
            qt qtVar9 = qtVar3;
            zz4 a = zoVar4.a.a(context2, looper2, ovbVar3, obj2, j5dVar, j5dVar);
            qtVar7.put(zoVar4.b, a);
            zz4 zz4Var = a;
            zz4Var.getClass();
            if (!(zz4Var instanceof b6d)) {
                oj5Var = oj5Var3;
                mainLooper = looper2;
                ovbVar = ovbVar3;
                qtVar4 = qtVar7;
                map = map2;
                qtVar3 = qtVar9;
                qtVar2 = qtVar8;
                arrayList3 = arrayList5;
                z = true;
            } else {
                if (zoVar3 != null) {
                    String str2 = zoVar4.c;
                    String str3 = zoVar3.c;
                    dq9.m(kt6.p(str2, " cannot be used with ", str3, new StringBuilder(str2.length() + 21 + str3.length())));
                    return oj5Var3;
                }
                mainLooper = looper2;
                ovbVar = ovbVar3;
                qtVar4 = qtVar7;
                zoVar3 = zoVar4;
                map = map2;
                qtVar3 = qtVar9;
                qtVar2 = qtVar8;
                arrayList3 = arrayList5;
                z = true;
                oj5Var = oj5Var3;
            }
        }
    }

    @Override // ldc
    public final void onError(ndc ndcVar, Exception exc) {
        f8b f8bVar = ((cl8) this.d).O;
        if (f8bVar != null) {
            f8bVar.run();
        }
    }

    @Override // ldc
    public final void onRenderedFirstFrame() {
        g6b g6bVar = (g6b) this.b;
        Runnable[] runnableArr = (Runnable[]) this.c;
        cl8 cl8Var = (cl8) this.d;
        n10 n10Var = cl8Var.I;
        if (n10Var != null && n10Var.g) {
            int i = cl8Var.f;
            int i2 = cl8Var.h;
            n10Var.d = true;
            n10Var.e = i;
            n10Var.f = i2;
            vt4 vt4Var = (vt4) n10Var.c;
            if (vt4Var != null) {
                vt4Var.a(Integer.valueOf(i), Integer.valueOf(n10Var.f));
            }
        }
        Runnable runnable = runnableArr[0];
        if (runnable == null) {
            ncc nccVar = cl8Var.n;
            if (nccVar != null) {
                if (n10Var == null || !n10Var.g) {
                    nccVar.animate().alpha(1.0f).setDuration(180L).withEndAction(new a18(this, g6bVar, (byte) 23)).start();
                    return;
                }
                return;
            }
            return;
        }
        cl8Var.post(runnable);
        runnableArr[0] = null;
        Bitmap bitmap = cl8Var.a;
        if (bitmap != null) {
            bitmap.recycle();
            if (g6bVar.M0 == cl8Var.a) {
                g6bVar.M0 = null;
            }
            cl8Var.a = null;
            cl8Var.invalidate();
        }
    }

    @Override // ldc
    public final void onStateChanged(boolean z, int i) {
        cl8 cl8Var = (cl8) this.d;
        ndc ndcVar = cl8Var.e;
        if (ndcVar == null) {
            return;
        }
        boolean c0 = ndcVar.c0();
        bl8 bl8Var = cl8Var.L;
        if (c0) {
            gm.c3(bl8Var);
        } else {
            gm.r(bl8Var);
        }
    }

    @Override // ts4
    public final void onSuccess(Object obj) {
        qw6 qw6Var = (qw6) obj;
        List list = (List) ((ly6) this.d).i.remove((my6) this.b);
        if (((ly6) this.d).j.i() || qw6Var == null) {
            return;
        }
        mx6 mx6Var = ((ly6) this.d).g;
        sw6 sw6Var = (sw6) this.c;
        mx6Var.b(sw6Var.a, sw6Var, qw6Var.a, qw6Var.b);
        tx6 tx6Var = ((ly6) this.d).j;
        sw6 sw6Var2 = (sw6) this.c;
        if (!tx6Var.x || !tx6.j(sw6Var2)) {
            tx6Var.e.getClass();
        }
        ly6 ly6Var = (ly6) this.d;
        c1 c1Var = ly6Var.m;
        sw6 sw6Var3 = (sw6) this.c;
        long j = ly6Var.t;
        c1Var.removeMessages(1001, sw6Var3);
        c1Var.sendMessageDelayed(c1Var.obtainMessage(1001, sw6Var3), j);
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                try {
                    ((ky6) it.next()).a((sw6) this.c);
                } catch (RemoteException e) {
                    ncd.g("MediaSessionLegacyStub", "Exception in " + ((sw6) this.c), e);
                }
            }
        }
    }

    @Override // ldc
    public final boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // ldc
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        ((cl8) this.d).h();
    }

    @Override // ldc
    public final void onVideoSizeChanged(int i, int i2, int i3, float f) {
        cl8 cl8Var = (cl8) this.d;
        g6b g6bVar = (g6b) this.b;
        if (g6bVar != null) {
            f6b V = cl8Var.e.V(g6bVar.d1);
            g6bVar.d1 = V;
            ncc nccVar = cl8Var.n;
            if (nccVar != null) {
                nccVar.setHDRInfo(V);
            }
        }
        int i4 = (int) (i * f);
        cl8Var.f = i4;
        int i5 = (int) (i2 * f);
        cl8Var.h = i5;
        if (g6bVar != null && (g6bVar.k0 != i4 || g6bVar.l0 != i5)) {
            g6bVar.k0 = i4;
            g6bVar.l0 = i5;
            g6bVar.z();
        }
        cl8Var.a();
        ncc nccVar2 = cl8Var.n;
        if (nccVar2 != null) {
            int i6 = cl8Var.f;
            int i7 = cl8Var.h;
            nccVar2.d = i6;
            nccVar2.e = i7;
            uf4 uf4Var = nccVar2.b;
            if (uf4Var != null) {
                uf4Var.postRunnable(new rf4(uf4Var, i6, i7, (byte) 0));
            }
        }
    }

    public final void p(Canvas canvas, RectF rectF, float f) {
        Paint[] paintArr = (Paint[]) this.b;
        if (paintArr[0] == null) {
            Paint paint = new Paint(1);
            paintArr[0] = paint;
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        }
        paintArr[0].setShader((LinearGradient) this.c);
        paintArr[0].setAlpha((int) (f * 255.0f));
        canvas.drawRect(rectF, paintArr[0]);
    }

    public final void r(Canvas canvas, RectF rectF, int i, float f) {
        Paint[] paintArr = (Paint[]) this.b;
        Matrix matrix = (Matrix) this.d;
        if (f <= 0.0f) {
            return;
        }
        if (((LinearGradient) this.c) == null) {
            this.c = new LinearGradient(0.0f, 0.0f, 0.0f, 16.0f, new int[]{-65536, 16711680}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        }
        if (paintArr[i] == null) {
            Paint paint = new Paint(1);
            paintArr[i] = paint;
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        }
        paintArr[i].setShader((LinearGradient) this.c);
        matrix.reset();
        if (i == 0) {
            matrix.postScale(1.0f, rectF.width() / 16.0f);
            matrix.postRotate(-90.0f);
            matrix.postTranslate(rectF.left, rectF.top);
        } else if (i == 1) {
            matrix.postScale(1.0f, rectF.height() / 16.0f);
            matrix.postTranslate(rectF.left, rectF.top);
        } else if (i == 2) {
            matrix.postScale(1.0f, rectF.width() / 16.0f);
            matrix.postRotate(90.0f);
            matrix.postTranslate(rectF.right, rectF.top);
        } else if (i == 3) {
            matrix.postScale(1.0f, rectF.height() / 16.0f);
            matrix.postScale(1.0f, -1.0f);
            matrix.postTranslate(rectF.left, rectF.bottom);
        }
        ((LinearGradient) this.c).setLocalMatrix(matrix);
        paintArr[i].setAlpha((int) (255.0f * f));
        canvas.drawRect(rectF, paintArr[i]);
    }

    @Override // org.telegram.messenger.ILocationServiceProvider
    public final synchronized void removeLocationUpdates(mj5 mj5Var) {
        m05 m05Var = (m05) ((HashMap) this.d).remove(mj5Var);
        if (m05Var != null) {
            ua4 ua4Var = (ua4) this.b;
            ua4Var.getClass();
            String simpleName = m05.class.getSimpleName();
            ite.g(simpleName, "Listener type must not be empty");
            ua4Var.c(new u76(m05Var, simpleName), 2418).continueWith(gp3.c, kg7.e);
        }
    }

    @Override // org.telegram.messenger.ILocationServiceProvider
    public final synchronized void requestLocationUpdates(nj5 nj5Var, mj5 mj5Var) {
        m05 m05Var = (m05) ((HashMap) this.d).remove(mj5Var);
        if (m05Var != null) {
            ua4 ua4Var = (ua4) this.b;
            ua4Var.getClass();
            String simpleName = m05.class.getSimpleName();
            ite.g(simpleName, "Listener type must not be empty");
            ua4Var.c(new u76(m05Var, simpleName), 2418).continueWith(gp3.c, kg7.e);
        }
        m05 m05Var2 = new m05(mj5Var);
        ((HashMap) this.d).put(mj5Var, m05Var2);
        ((ua4) this.b).j(((o05) nj5Var).a, m05Var2, Looper.getMainLooper());
    }

    public final mi5 s() {
        HttpsURLConnection httpsURLConnection;
        mx6.x();
        InputStream inputStream = null;
        String sb = null;
        inputStream = null;
        try {
            String q = q((String) this.c, (HashMap) this.b);
            String concat = "GET Request URL: ".concat(q);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", concat, null);
            }
            httpsURLConnection = (HttpsURLConnection) new URL(q).openConnection();
            try {
                httpsURLConnection.setReadTimeout(10000);
                httpsURLConnection.setConnectTimeout(10000);
                httpsURLConnection.setRequestMethod("GET");
                for (Map.Entry entry : ((HashMap) this.d).entrySet()) {
                    httpsURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                httpsURLConnection.connect();
                int responseCode = httpsURLConnection.getResponseCode();
                InputStream inputStream2 = httpsURLConnection.getInputStream();
                if (inputStream2 != null) {
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream2, "UTF-8"));
                        char[] cArr = new char[TLObject.FLAG_13];
                        StringBuilder sb2 = new StringBuilder();
                        while (true) {
                            int read = bufferedReader.read(cArr);
                            if (read == -1) {
                                break;
                            }
                            sb2.append(cArr, 0, read);
                        }
                        sb = sb2.toString();
                    } catch (Throwable th) {
                        th = th;
                        inputStream = inputStream2;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (httpsURLConnection != null) {
                            httpsURLConnection.disconnect();
                        }
                        throw th;
                    }
                }
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                httpsURLConnection.disconnect();
                return new mi5(responseCode, sb);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            httpsURLConnection = null;
        }
    }

    public final String t() {
        String str = (String) this.c;
        int indexOf = str.indexOf(44);
        return indexOf < 0 ? str : str.substring(0, indexOf);
    }

    public final String toString() {
        int i = 0;
        switch (this.a) {
            case 0:
                return ((gn3) this.b).a + ":" + ((String) this.c);
            case 10:
                StringBuilder sb = new StringBuilder("id3v2tag[pos=");
                a19 a19Var = (a19) this.b;
                sb.append(a19Var.b);
                sb.append(", ");
                sb.append(a19Var.e());
                sb.append(" left]");
                return sb.toString();
            case 13:
                return "JsonConfiguration(encodeDefaults=false, ignoreUnknownKeys=false, isLenient=false, allowStructuredMapKeys=false, prettyPrint=false, explicitNulls=true, prettyPrintIndent='" + ((String) this.c) + "', coerceInputValues=false, useArrayPolymorphism=false, classDiscriminator='" + ((String) this.b) + "', allowSpecialFloatingPointValues=false, useAlternativeNames=true, namingStrategy=null, decodeEnumsCaseInsensitive=false, allowTrailingComma=false, allowComments=false, classDiscriminatorMode=" + ((bj2) this.d) + ')';
            case 21:
                StringBuilder sb2 = new StringBuilder();
                ArrayList arrayList = (ArrayList) this.d;
                int size = arrayList.size();
                zf7 zf7Var = null;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    zf7 zf7Var2 = (zf7) obj;
                    if (zf7Var != null) {
                        sb2.append(",");
                    }
                    sb2.append(zf7Var2.toString());
                    zf7Var = zf7Var2;
                }
                return sb2.toString();
            case 22:
                StringBuilder sb3 = new StringBuilder(32);
                sb3.append((String) this.c);
                sb3.append('{');
                wm4 wm4Var = (wm4) this.b;
                String str = "";
                while (true) {
                    wm4Var = (wm4) wm4Var.c;
                    if (wm4Var == null) {
                        sb3.append('}');
                        return sb3.toString();
                    }
                    Object obj2 = wm4Var.b;
                    sb3.append(str);
                    if (obj2 == null || !obj2.getClass().isArray()) {
                        sb3.append(obj2);
                    } else {
                        String deepToString = Arrays.deepToString(new Object[]{obj2});
                        sb3.append((CharSequence) deepToString, 1, deepToString.length() - 1);
                    }
                    str = ", ";
                }
                break;
            case 27:
                return (String) this.c;
            default:
                return super.toString();
        }
    }

    public final dj5 u(ej5 ej5Var) {
        InputStream inputStream;
        int i = ej5Var.c;
        InputStream inputStream2 = (a19) this.b;
        if (ej5Var.d) {
            ai4 ai4Var = (ai4) this.d;
            byte[] bArr = new byte[i];
            int i2 = 0;
            while (i2 < i) {
                int read = ((h61) ai4Var.b).read(bArr, i2, i - i2);
                if (read <= 0) {
                    throw new EOFException();
                }
                i2 += read;
            }
            int i3 = 0;
            boolean z = false;
            for (int i4 = 0; i4 < i; i4++) {
                byte b = bArr[i4];
                if (!z || b != 0) {
                    bArr[i3] = b;
                    i3++;
                }
                z = b == -1;
            }
            inputStream2 = new ByteArrayInputStream(bArr, 0, i3);
            i = i3;
        }
        if (ej5Var.f) {
            throw new bj5("Frame encryption is not supported");
        }
        if (ej5Var.e) {
            i = ej5Var.g;
            inputStream = new InflaterInputStream(inputStream2);
        } else {
            inputStream = inputStream2;
        }
        return new dj5(inputStream, ej5Var.b, i, (gj5) this.c, ej5Var);
    }

    public final ByteBuffer v() {
        Bitmap bitmap = (Bitmap) this.d;
        if (bitmap == null) {
            return (ByteBuffer) this.c;
        }
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = ((Bitmap) this.d).getHeight();
        int i = width * height;
        ((Bitmap) this.d).getPixels(new int[i], 0, width, 0, 0, width, height);
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((Color.blue(r1[i2]) * 0.114f) + (Color.green(r1[i2]) * 0.587f) + (Color.red(r1[i2]) * 0.299f));
        }
        return ByteBuffer.wrap(bArr);
    }

    public final Paint w(float f, int i) {
        Paint[] paintArr = (Paint[]) this.b;
        if (paintArr[i] == null) {
            Paint paint = new Paint(1);
            paintArr[i] = paint;
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        }
        paintArr[i].setShader(null);
        paintArr[i].setColor(-65536);
        paintArr[i].setAlpha((int) (f * 255.0f));
        return paintArr[i];
    }

    public final int x(ybc ybcVar) {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            zf7 zf7Var = (zf7) obj;
            int i3 = zf7Var.d;
            ig7 ig7Var = zf7Var.a;
            int a = ig7Var.a(ybcVar);
            int i4 = a + 4;
            int ordinal = ig7Var.ordinal();
            if (ordinal != 1) {
                if (ordinal == 2) {
                    i4 = ((i3 / 2) * 11) + i4 + (i3 % 2 != 1 ? 0 : 6);
                } else if (ordinal == 4) {
                    i4 += zf7Var.a() << 3;
                } else if (ordinal == 5) {
                    i4 = a + 12;
                } else if (ordinal == 6) {
                    i4 += i3 * 13;
                }
            } else {
                int i5 = ((i3 / 3) * 10) + i4;
                int i6 = i3 % 3;
                i4 = i5 + (i6 != 1 ? i6 == 2 ? 7 : 0 : 4);
            }
            i += i4;
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00af A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean y() {
        dm5 dm5Var;
        if (((ai4) this.d).q("gcm.n.noui")) {
            return true;
        }
        FirebaseMessagingService firebaseMessagingService = (FirebaseMessagingService) this.c;
        if (!((KeyguardManager) firebaseMessagingService.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            int myPid = Process.myPid();
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) firebaseMessagingService.getSystemService("activity")).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ActivityManager.RunningAppProcessInfo next = it.next();
                    if (next.pid == myPid) {
                        if (next.importance == 100) {
                            return false;
                        }
                    }
                }
            }
        }
        String y = ((ai4) this.d).y("gcm.n.image");
        if (!TextUtils.isEmpty(y)) {
            try {
                dm5Var = new dm5(new URL(y));
            } catch (MalformedURLException unused) {
                Log.w("FirebaseMessaging", "Not downloading image, bad URL: " + y);
            }
            if (dm5Var != null) {
                ExecutorService executorService = (ExecutorService) this.b;
                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                dm5Var.b = executorService.submit(new fd5(dm5Var, taskCompletionSource, (byte) 6));
                dm5Var.c = taskCompletionSource.getTask();
            }
            lx6 a = yn2.a((FirebaseMessagingService) this.c, (ai4) this.d);
            an7 an7Var = (an7) a.b;
            if (dm5Var != null) {
                try {
                    Task task = dm5Var.c;
                    ite.h(task);
                    Bitmap bitmap = (Bitmap) Tasks.await(task, 5L, TimeUnit.SECONDS);
                    an7Var.g(bitmap);
                    um7 um7Var = new um7();
                    um7Var.e = bitmap == null ? null : IconCompat.c(bitmap);
                    um7Var.f = null;
                    um7Var.g = true;
                    an7Var.i(um7Var);
                } catch (InterruptedException unused2) {
                    Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
                    dm5Var.close();
                    Thread.currentThread().interrupt();
                } catch (ExecutionException e) {
                    Log.w("FirebaseMessaging", "Failed to download image: " + e.getCause());
                } catch (TimeoutException unused3) {
                    Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
                    dm5Var.close();
                }
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Showing notification");
            }
            ((NotificationManager) ((FirebaseMessagingService) this.c).getSystemService("notification")).notify((String) a.c, 0, ((an7) a.b).b());
            return true;
        }
        dm5Var = null;
        if (dm5Var != null) {
        }
        lx6 a2 = yn2.a((FirebaseMessagingService) this.c, (ai4) this.d);
        an7 an7Var2 = (an7) a2.b;
        if (dm5Var != null) {
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
        }
        ((NotificationManager) ((FirebaseMessagingService) this.c).getSystemService("notification")).notify((String) a2.c, 0, ((an7) a2.b).b());
        return true;
    }

    public final boolean z() {
        String trim;
        ArrayDeque arrayDeque = (ArrayDeque) this.d;
        if (((String) this.c) == null) {
            if (!arrayDeque.isEmpty()) {
                String str = (String) arrayDeque.poll();
                str.getClass();
                this.c = str;
                return true;
            }
            do {
                String readLine = ((BufferedReader) this.b).readLine();
                this.c = readLine;
                if (readLine == null) {
                    return false;
                }
                trim = readLine.trim();
                this.c = trim;
            } while (trim.isEmpty());
        }
        return true;
    }

    @Override // z99
    public final void f() {
    }

    @Override // fq5
    public final void g() {
    }

    @Override // z99
    public final void i() {
    }

    @Override // fq5
    public final void n() {
    }

    @Override // i68
    public final void t0() {
    }

    @Override // ldc
    public final void onSeekFinished(tk tkVar) {
    }

    @Override // ldc
    public final void onSeekStarted(tk tkVar) {
    }

    @Override // ldc
    public final void onRenderedFirstFrame(tk tkVar) {
    }

    public /* synthetic */ in3(ViewGroup viewGroup, Object obj, Object obj2, byte b) {
        this.a = b;
        this.d = viewGroup;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ in3(Object obj, Object obj2, byte b) {
        this.a = b;
        this.d = obj;
        this.b = obj2;
    }

    public /* synthetic */ in3(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public in3(byte b) {
        this.a = b;
        switch (b) {
            case 6:
                this.d = new HashMap();
                break;
            case 7:
                this.b = new Paint[4];
                this.d = new Matrix();
                break;
            case 13:
                this.c = "    ";
                this.b = TeXSymbolParser.TYPE_ATTR;
                this.d = bj2.a;
                break;
            default:
                this.b = new pd0();
                this.c = null;
                this.d = null;
                break;
        }
    }

    public in3(InputStream inputStream, long j, int i, gj5 gj5Var) {
        this.a = (byte) 10;
        a19 a19Var = new a19(inputStream, j, i);
        this.b = a19Var;
        this.d = new ai4((Object) a19Var, (byte) 7);
        this.c = gj5Var;
    }

    public in3(String str, HashMap hashMap) {
        this.a = (byte) 9;
        this.c = str;
        this.b = hashMap;
        this.d = new HashMap();
    }

    public in3(String str, wc9[] wc9VarArr) {
        this.a = (byte) 27;
        System.currentTimeMillis();
        this.c = str;
        this.b = wc9VarArr;
        this.d = null;
    }

    public in3(FirebaseMessagingService firebaseMessagingService, ai4 ai4Var, ExecutorService executorService) {
        this.a = (byte) 1;
        this.b = executorService;
        this.c = firebaseMessagingService;
        this.d = ai4Var;
    }

    public in3(Runnable runnable) {
        this.a = (byte) 18;
        this.c = new CopyOnWriteArrayList();
        this.d = new HashMap();
        this.b = runnable;
    }

    public in3(String str, byte b) {
        this.a = b;
        switch (b) {
            case 23:
                fo4 fo4Var = new fo4();
                fo4Var.r = wf7.n("video/mp2t");
                fo4Var.s = wf7.n(str);
                this.b = new go4(fo4Var);
                break;
            default:
                wm4 wm4Var = new wm4((byte) 12);
                this.b = wm4Var;
                this.d = wm4Var;
                this.c = str;
                break;
        }
    }

    public in3(Signature signature) {
        this.a = (byte) 2;
        this.b = signature;
        this.c = null;
        this.d = null;
    }

    public in3(Cipher cipher) {
        this.a = (byte) 2;
        this.c = cipher;
        this.b = null;
        this.d = null;
    }

    public in3(Mac mac) {
        this.a = (byte) 2;
        this.d = mac;
        this.c = null;
        this.b = null;
    }

    public /* synthetic */ in3(byte b, boolean z) {
        this.a = b;
    }

    public in3(ly6 ly6Var, my6 my6Var, iy6 iy6Var, sw6 sw6Var) {
        this.a = (byte) 17;
        this.d = ly6Var;
        this.b = my6Var;
        this.c = sw6Var;
    }
}
