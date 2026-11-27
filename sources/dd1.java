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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class dd1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public dd1(zm9 zm9Var, ed1 ed1Var, j27 j27Var, f27 f27Var) {
        this.a = (byte) 0;
        this.e = zm9Var;
        this.b = ed1Var;
        this.c = j27Var;
        this.d = f27Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0026, code lost:
    
        if (r2.isEmpty() == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void a() {
        String str;
        imf imfVar;
        j2f j2fVar = (j2f) this.b;
        rx rxVar = (rx) this.c;
        ame ameVar = (ame) this.d;
        String str2 = (String) this.e;
        u8a u8aVar = (u8a) rxVar.c;
        u8aVar.b = ameVar;
        sxe sxeVar = (sxe) u8aVar.a;
        if (sxeVar != null) {
            str = sxeVar.d;
            int i = gre.a;
            if (str != null) {
            }
        }
        str = "NA";
        gxe gxeVar = new gxe();
        gxeVar.a = j2fVar.a;
        gxeVar.b = j2fVar.b;
        synchronized (j2f.class) {
            imfVar = j2f.j;
            if (imfVar == null) {
                qb6 a = hyd.a(Resources.getSystem().getConfiguration());
                Object[] objArr = new Object[4];
                int i2 = 0;
                int i3 = 0;
                while (i2 < a.a.size()) {
                    Locale locale = a.a.get(i2);
                    j5 j5Var = in2.a;
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
                ihf ihfVar = zjf.f;
                imfVar = i3 == 0 ? imf.r : new imf(i3, objArr);
                j2f.j = imfVar;
            }
        }
        gxeVar.k = imfVar;
        gxeVar.g = Boolean.TRUE;
        gxeVar.d = str;
        gxeVar.c = str2;
        gxeVar.e = j2fVar.f.isSuccessful() ? (String) j2fVar.f.getResult() : j2fVar.d.a();
        gxeVar.i = 10;
        gxeVar.j = Integer.valueOf(j2fVar.h);
        rxVar.d = gxeVar;
        j2fVar.c.a(rxVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0026, code lost:
    
        if (r2.isEmpty() == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void b() {
        String str;
        yjd yjdVar;
        q8f q8fVar = (q8f) this.b;
        rx rxVar = (rx) this.c;
        vxe vxeVar = (vxe) this.d;
        String str2 = (String) this.e;
        fp fpVar = (fp) rxVar.c;
        fpVar.b = vxeVar;
        u5f u5fVar = (u5f) fpVar.a;
        if (u5fVar != null) {
            str = u5fVar.d;
            int i = pff.a;
            if (str != null) {
            }
        }
        str = "NA";
        gxe gxeVar = new gxe();
        gxeVar.a = q8fVar.a;
        gxeVar.b = q8fVar.b;
        synchronized (q8f.class) {
            yjdVar = q8f.k;
            if (yjdVar == null) {
                qb6 a = hyd.a(Resources.getSystem().getConfiguration());
                Object[] objArr = new Object[4];
                int i2 = 0;
                int i3 = 0;
                while (i2 < a.a.size()) {
                    Locale locale = a.a.get(i2);
                    j5 j5Var = in2.a;
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
                vgd vgdVar = ghd.f;
                yjdVar = i3 == 0 ? yjd.r : new yjd(i3, objArr);
                q8f.k = yjdVar;
            }
        }
        gxeVar.k = yjdVar;
        gxeVar.g = Boolean.TRUE;
        gxeVar.d = str;
        gxeVar.c = str2;
        gxeVar.e = q8fVar.f.isSuccessful() ? (String) q8fVar.f.getResult() : q8fVar.d.a();
        gxeVar.i = 10;
        gxeVar.j = Integer.valueOf(q8fVar.h);
        rxVar.d = gxeVar;
        q8fVar.c.a(rxVar);
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
        lid lidVar;
        haa haaVar = null;
        int i = 0;
        switch (this.a) {
            case 0:
                fd1 fd1Var = (fd1) ((zm9) this.e).b;
                j27 j27Var = (j27) this.c;
                ed1 ed1Var = (ed1) this.b;
                if (ed1Var != null) {
                    fd1Var.Q = true;
                    ed1Var.b.c(false);
                    fd1Var.Q = false;
                }
                if (j27Var.isEnabled() && j27Var.hasSubMenu()) {
                    ((f27) this.d).q(j27Var, null, 4);
                    return;
                }
                return;
            case 1:
                ogd ogdVar = (ogd) this.b;
                jw6 jw6Var = (jw6) this.c;
                jw6 jw6Var2 = (jw6) this.d;
                t91 t91Var = (t91) this.e;
                pid pidVar = ogdVar.a;
                pidVar.getClass();
                he6 he6Var = pid.i;
                Set set = pidVar.b;
                if (new HashSet(set).isEmpty()) {
                    he6Var.b("No need to prepare transfer without any callback", new Object[0]);
                    t91Var.a();
                    return;
                }
                if (jw6Var.l != 1) {
                    he6Var.b("No need to prepare transfer when transferring from local", new Object[0]);
                    t91Var.a();
                    return;
                }
                v99 a = pidVar.a();
                if (a == null || !a.h()) {
                    he6Var.b("No need to prepare transfer when there is no media session", new Object[0]);
                    t91Var.a();
                    return;
                }
                he6Var.b("Prepare route transfer for changing endpoint", new Object[0]);
                if (jw6Var2.l == 0) {
                    z9f.a(b6f.h0);
                    b = 1;
                } else {
                    b = CastDevice.b(jw6Var2.s) == null ? (byte) 3 : (byte) 2;
                }
                pidVar.e = b;
                pidVar.g = t91Var;
                he6Var.b("notify transferring with type = %d", Integer.valueOf(b));
                Iterator it = new HashSet(set).iterator();
                while (it.hasNext()) {
                    pre preVar = (pre) it.next();
                    byte b2 = pidVar.e;
                    switch (preVar.a) {
                        case 0:
                            vwe.j.b("onTransferring with type = %d", Integer.valueOf(b2));
                            vwe vweVar = (vwe) preVar.b;
                            vweVar.i = true;
                            vweVar.c();
                            n8f b3 = vweVar.c.b(vweVar.g);
                            b8f m = c8f.m(b3.d());
                            m.c();
                            c8f.v((c8f) m.b, b2);
                            b3.e((c8f) m.a());
                            vweVar.a.a((p8f) b3.a(), 230);
                            break;
                        default:
                            pe8 pe8Var = new pe8(10);
                            am2 am2Var = (am2) preVar.b;
                            pe8Var.c = Boolean.valueOf(((ibd) am2Var.c).c == 2);
                            am2.R(am2Var, new nmf(pe8Var));
                            cmf S = am2Var.S();
                            had hadVar = new had(new e00(b2));
                            hadVar.c = S.h;
                            S.c.add(hadVar);
                            break;
                    }
                }
                pidVar.h = null;
                xve.e("Must be called from the main thread.");
                if (a.w()) {
                    a.g = new TaskCompletionSource();
                    v99.k.b("create SessionState with cached mediaInfo and mediaStatus", new Object[0]);
                    MediaInfo d = a.d();
                    j07 e = a.e();
                    if (d != null && e != null) {
                        Boolean bool = Boolean.TRUE;
                        long a2 = a.a();
                        du6 du6Var = e.M;
                        double d2 = e.d;
                        if (Double.compare(d2, 2.0d) > 0 || Double.compare(d2, 0.5d) < 0) {
                            lq5.j("playbackRate must be between PLAYBACK_RATE_MIN and PLAYBACK_RATE_MAX");
                            return;
                        }
                        haaVar = new haa(new kt6(d, du6Var, bool, a2, d2, e.w, e.F, null, null, null, null, 0L), null);
                    }
                    TaskCompletionSource taskCompletionSource = a.g;
                    if (haaVar != null) {
                        taskCompletionSource.setResult(haaVar);
                    } else {
                        taskCompletionSource.setException(new fdd());
                    }
                    task = a.g.getTask();
                } else {
                    task = Tasks.forException(new fdd());
                }
                task.addOnSuccessListener(new i09((Object) pidVar, (byte) 28)).addOnFailureListener(new g9d(pidVar, (byte) 1));
                pidVar.c.postDelayed(pidVar.d, 10000L);
                return;
            case 2:
                a();
                return;
            case 3:
                b();
                return;
            default:
                ijf ijfVar = (ijf) this.b;
                rx rxVar = (rx) this.c;
                gaf gafVar = (gaf) this.d;
                String str2 = (String) this.e;
                oxb oxbVar = (oxb) rxVar.c;
                oxbVar.b = gafVar;
                rhf rhfVar = (rhf) oxbVar.a;
                if (rhfVar != null) {
                    str = rhfVar.d;
                    int i2 = vge.a;
                    if (str != null) {
                        break;
                    }
                }
                str = "NA";
                gxe gxeVar = new gxe();
                gxeVar.a = ijfVar.a;
                gxeVar.b = ijfVar.b;
                synchronized (ijf.class) {
                    lidVar = ijf.k;
                    if (lidVar == null) {
                        qb6 a3 = hyd.a(Resources.getSystem().getConfiguration());
                        Object[] objArr = new Object[4];
                        int i3 = 0;
                        while (i < a3.a.size()) {
                            Locale locale = a3.a.get(i);
                            j5 j5Var = in2.a;
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
                        lidVar = ted.m(i3, objArr);
                        ijf.k = lidVar;
                    }
                }
                gxeVar.k = lidVar;
                gxeVar.g = Boolean.TRUE;
                gxeVar.d = str;
                gxeVar.c = str2;
                gxeVar.e = ijfVar.f.isSuccessful() ? (String) ijfVar.f.getResult() : ijfVar.d.a();
                gxeVar.i = 10;
                gxeVar.j = Integer.valueOf(ijfVar.h);
                rxVar.d = gxeVar;
                ijfVar.c.a(rxVar);
                return;
        }
    }

    public /* synthetic */ dd1(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }
}
