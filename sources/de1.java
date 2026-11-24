// default package

import android.content.res.Resources;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class de1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public de1(nl9 nl9Var, ee1 ee1Var, c27 c27Var, y17 y17Var) {
        this.a = (byte) 0;
        this.e = nl9Var;
        this.b = ee1Var;
        this.c = c27Var;
        this.d = y17Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0026, code lost:
    
        if (r2.isEmpty() == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void a() {
        String str;
        tjf tjfVar;
        uze uzeVar = (uze) this.b;
        ry ryVar = (ry) this.c;
        kje kjeVar = (kje) this.d;
        String str2 = (String) this.e;
        e7a e7aVar = (e7a) ryVar.c;
        e7aVar.b = kjeVar;
        eve eveVar = (eve) e7aVar.a;
        if (eveVar != null) {
            str = eveVar.d;
            int i = soe.a;
            if (str != null) {
            }
        }
        str = "NA";
        sue sueVar = new sue();
        sueVar.a = uzeVar.a;
        sueVar.b = uzeVar.b;
        synchronized (uze.class) {
            tjfVar = uze.j;
            if (tjfVar == null) {
                lb6 a = uvd.a(Resources.getSystem().getConfiguration());
                Object[] objArr = new Object[4];
                int i2 = 0;
                int i3 = 0;
                while (i2 < a.a.size()) {
                    Locale locale = a.a.get(i2);
                    s13 s13Var = ao2.a;
                    String languageTag = locale.toLanguageTag();
                    languageTag.getClass();
                    int i4 = i3 + 1;
                    int length = objArr.length;
                    if (length < i4) {
                        int i5 = length + (length >> 1) + 1;
                        if (i5 < i4) {
                            i5 = Integer.highestOneBit(i3) << 1;
                        }
                        if (i5 < 0) {
                            i5 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                        }
                        objArr = Arrays.copyOf(objArr, i5);
                    }
                    objArr[i3] = languageTag;
                    i2++;
                    i3 = i4;
                }
                tef tefVar = khf.f;
                tjfVar = i3 == 0 ? tjf.r : new tjf(i3, objArr);
                uze.j = tjfVar;
            }
        }
        sueVar.k = tjfVar;
        sueVar.g = Boolean.TRUE;
        sueVar.d = str;
        sueVar.c = str2;
        sueVar.e = uzeVar.f.isSuccessful() ? (String) uzeVar.f.getResult() : uzeVar.d.a();
        sueVar.i = 10;
        sueVar.j = Integer.valueOf(uzeVar.h);
        ryVar.d = sueVar;
        uzeVar.c.a(ryVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0026, code lost:
    
        if (r2.isEmpty() == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void b() {
        String str;
        ihd ihdVar;
        b6f b6fVar = (b6f) this.b;
        ry ryVar = (ry) this.c;
        hve hveVar = (hve) this.d;
        String str2 = (String) this.e;
        eq eqVar = (eq) ryVar.c;
        eqVar.b = hveVar;
        f3f f3fVar = (f3f) eqVar.a;
        if (f3fVar != null) {
            str = f3fVar.d;
            int i = adf.a;
            if (str != null) {
            }
        }
        str = "NA";
        sue sueVar = new sue();
        sueVar.a = b6fVar.a;
        sueVar.b = b6fVar.b;
        synchronized (b6f.class) {
            ihdVar = b6f.k;
            if (ihdVar == null) {
                lb6 a = uvd.a(Resources.getSystem().getConfiguration());
                Object[] objArr = new Object[4];
                int i2 = 0;
                int i3 = 0;
                while (i2 < a.a.size()) {
                    Locale locale = a.a.get(i2);
                    s13 s13Var = ao2.a;
                    String languageTag = locale.toLanguageTag();
                    languageTag.getClass();
                    int i4 = i3 + 1;
                    int length = objArr.length;
                    if (length < i4) {
                        int i5 = length + (length >> 1) + 1;
                        if (i5 < i4) {
                            i5 = Integer.highestOneBit(i3) << 1;
                        }
                        if (i5 < 0) {
                            i5 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                        }
                        objArr = Arrays.copyOf(objArr, i5);
                    }
                    objArr[i3] = languageTag;
                    i2++;
                    i3 = i4;
                }
                eed eedVar = ped.f;
                ihdVar = i3 == 0 ? ihd.r : new ihd(i3, objArr);
                b6f.k = ihdVar;
            }
        }
        sueVar.k = ihdVar;
        sueVar.g = Boolean.TRUE;
        sueVar.d = str;
        sueVar.c = str2;
        sueVar.e = b6fVar.f.isSuccessful() ? (String) b6fVar.f.getResult() : b6fVar.d.a();
        sueVar.i = 10;
        sueVar.j = Integer.valueOf(b6fVar.h);
        ryVar.d = sueVar;
        b6fVar.c.a(ryVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0033, code lost:
    
        if (r7.isEmpty() == false) goto L11;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        byte b;
        Task task;
        String str;
        vfd vfdVar;
        r8a r8aVar = null;
        int i = 0;
        switch (this.a) {
            case 0:
                fe1 fe1Var = (fe1) ((nl9) this.e).b;
                c27 c27Var = (c27) this.c;
                ee1 ee1Var = (ee1) this.b;
                if (ee1Var != null) {
                    fe1Var.Q = true;
                    ee1Var.b.c(false);
                    fe1Var.Q = false;
                }
                if (c27Var.isEnabled() && c27Var.hasSubMenu()) {
                    ((y17) this.d).q(c27Var, null, 4);
                    return;
                }
                return;
            case 1:
                xdd xddVar = (xdd) this.b;
                ew6 ew6Var = (ew6) this.c;
                ew6 ew6Var2 = (ew6) this.d;
                ta1 ta1Var = (ta1) this.e;
                zfd zfdVar = xddVar.a;
                zfdVar.getClass();
                ce6 ce6Var = zfd.i;
                Set set = zfdVar.b;
                if (new HashSet(set).isEmpty()) {
                    ce6Var.b("No need to prepare transfer without any callback", new Object[0]);
                    ta1Var.a();
                    return;
                }
                if (ew6Var.l != 1) {
                    ce6Var.b("No need to prepare transfer when transferring from local", new Object[0]);
                    ta1Var.a();
                    return;
                }
                k89 a = zfdVar.a();
                if (a == null || !a.h()) {
                    ce6Var.b("No need to prepare transfer when there is no media session", new Object[0]);
                    ta1Var.a();
                    return;
                }
                ce6Var.b("Prepare route transfer for changing endpoint", new Object[0]);
                if (ew6Var2.l == 0) {
                    k7f.a(m3f.h0);
                    b = 1;
                } else {
                    b = CastDevice.b(ew6Var2.s) == null ? (byte) 3 : (byte) 2;
                }
                zfdVar.e = b;
                zfdVar.g = ta1Var;
                ce6Var.b("notify transferring with type = %d", Integer.valueOf(b));
                Iterator it = new HashSet(set).iterator();
                while (it.hasNext()) {
                    bpe bpeVar = (bpe) it.next();
                    byte b2 = zfdVar.e;
                    switch (bpeVar.a) {
                        case 0:
                            hue.j.b("onTransferring with type = %d", Integer.valueOf(b2));
                            hue hueVar = (hue) bpeVar.b;
                            hueVar.i = true;
                            hueVar.c();
                            y5f b3 = hueVar.c.b(hueVar.g);
                            m5f m = n5f.m(b3.d());
                            m.c();
                            n5f.v((n5f) m.b, b2);
                            b3.e((n5f) m.a());
                            hueVar.a.a((a6f) b3.a(), 230);
                            break;
                        default:
                            dd8 dd8Var = new dd8(10);
                            sm2 sm2Var = (sm2) bpeVar.b;
                            dd8Var.c = Boolean.valueOf(((r8d) sm2Var.c).c == 2);
                            sm2.R(sm2Var, new yjf(dd8Var));
                            njf S = sm2Var.S();
                            q7d q7dVar = new q7d(new d10(b2));
                            q7dVar.c = S.h;
                            S.c.add(q7dVar);
                            break;
                    }
                }
                zfdVar.h = null;
                ite.e("Must be called from the main thread.");
                if (a.w()) {
                    a.g = new TaskCompletionSource();
                    k89.k.b("create SessionState with cached mediaInfo and mediaStatus", new Object[0]);
                    MediaInfo d = a.d();
                    f07 e = a.e();
                    if (d != null && e != null) {
                        Boolean bool = Boolean.TRUE;
                        long a2 = a.a();
                        zt6 zt6Var = e.M;
                        double d2 = e.d;
                        if (Double.compare(d2, 2.0d) > 0 || Double.compare(d2, 0.5d) < 0) {
                            u36.j("playbackRate must be between PLAYBACK_RATE_MIN and PLAYBACK_RATE_MAX");
                            return;
                        }
                        r8aVar = new r8a(new gt6(d, zt6Var, bool, a2, d2, e.w, e.F, null, null, null, null, 0L), null);
                    }
                    TaskCompletionSource taskCompletionSource = a.g;
                    if (r8aVar != null) {
                        taskCompletionSource.setResult(r8aVar);
                    } else {
                        taskCompletionSource.setException(new oad());
                    }
                    task = a.g.getTask();
                } else {
                    task = Tasks.forException(new oad());
                }
                task.addOnSuccessListener(new cf9((Object) zfdVar, (byte) 23)).addOnFailureListener(new et8((Object) zfdVar, (byte) 28));
                zfdVar.c.postDelayed(zfdVar.d, 10000L);
                return;
            case 2:
                a();
                return;
            case 3:
                b();
                return;
            default:
                tgf tgfVar = (tgf) this.b;
                ry ryVar = (ry) this.c;
                r7f r7fVar = (r7f) this.d;
                String str2 = (String) this.e;
                ovb ovbVar = (ovb) ryVar.c;
                ovbVar.b = r7fVar;
                cff cffVar = (cff) ovbVar.a;
                if (cffVar != null) {
                    str = cffVar.d;
                    int i2 = gee.a;
                    if (str != null) {
                        break;
                    }
                }
                str = "NA";
                sue sueVar = new sue();
                sueVar.a = tgfVar.a;
                sueVar.b = tgfVar.b;
                synchronized (tgf.class) {
                    vfdVar = tgf.k;
                    if (vfdVar == null) {
                        lb6 a3 = uvd.a(Resources.getSystem().getConfiguration());
                        Object[] objArr = new Object[4];
                        int i3 = 0;
                        while (i < a3.a.size()) {
                            Locale locale = a3.a.get(i);
                            s13 s13Var = ao2.a;
                            String languageTag = locale.toLanguageTag();
                            languageTag.getClass();
                            int i4 = i3 + 1;
                            int length = objArr.length;
                            if (length < i4) {
                                int i5 = length + (length >> 1) + 1;
                                if (i5 < i4) {
                                    i5 = Integer.highestOneBit(i3) << 1;
                                }
                                if (i5 < 0) {
                                    i5 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                }
                                objArr = Arrays.copyOf(objArr, i5);
                            }
                            objArr[i3] = languageTag;
                            i++;
                            i3 = i4;
                        }
                        vfdVar = ccd.m(i3, objArr);
                        tgf.k = vfdVar;
                    }
                }
                sueVar.k = vfdVar;
                sueVar.g = Boolean.TRUE;
                sueVar.d = str;
                sueVar.c = str2;
                sueVar.e = tgfVar.f.isSuccessful() ? (String) tgfVar.f.getResult() : tgfVar.d.a();
                sueVar.i = 10;
                sueVar.j = Integer.valueOf(tgfVar.h);
                ryVar.d = sueVar;
                tgfVar.c.a(ryVar);
                return;
        }
    }

    public /* synthetic */ de1(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }
}
