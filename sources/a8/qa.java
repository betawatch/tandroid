package a8;

import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.view.View;
import c8.ue;
import c8.uf;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import org.telegram.messenger.ks;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.hn;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final /* synthetic */ class qa implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ qa(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.a = i7;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = obj4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0026, code lost:
    
        if (r2.isEmpty() == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void a() {
        String str;
        a0 a0Var;
        ua uaVar = (ua) this.c;
        xa xaVar = (xa) this.d;
        a8 a8Var = (a8) this.e;
        String str2 = (String) this.b;
        b8 b8Var = (b8) xaVar.c;
        b8Var.b = a8Var;
        v9 v9Var = (v9) b8Var.a;
        if (v9Var != null) {
            str = v9Var.d;
            int i7 = jb.a;
            if (str != null) {
            }
        }
        str = "NA";
        u9 u9Var = new u9();
        u9Var.a = uaVar.a;
        u9Var.b = uaVar.b;
        synchronized (ua.class) {
            a0Var = ua.k;
            if (a0Var == null) {
                n0.c a10 = c8.z9.a(Resources.getSystem().getConfiguration());
                Object[] objArr = new Object[4];
                int i10 = 0;
                int i11 = 0;
                while (i10 < a10.a.size()) {
                    Locale locale = a10.a.get(i10);
                    k8.a aVar = pb.c.a;
                    String languageTag = locale.toLanguageTag();
                    languageTag.getClass();
                    int i12 = i11 + 1;
                    int length = objArr.length;
                    if (length < i12) {
                        int i13 = length + (length >> 1) + 1;
                        if (i13 < i12) {
                            int highestOneBit = Integer.highestOneBit(i11);
                            i13 = highestOneBit + highestOneBit;
                        }
                        if (i13 < 0) {
                            i13 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                        }
                        objArr = Arrays.copyOf(objArr, i13);
                    }
                    objArr[i11] = languageTag;
                    i10++;
                    i11 = i12;
                }
                s sVar = u.b;
                a0Var = i11 == 0 ? a0.e : new a0(i11, objArr);
                ua.k = a0Var;
            }
        }
        u9Var.k = a0Var;
        u9Var.g = Boolean.TRUE;
        u9Var.d = str;
        u9Var.c = str2;
        u9Var.e = uaVar.f.isSuccessful() ? (String) uaVar.f.getResult() : uaVar.d.a();
        u9Var.i = 10;
        u9Var.j = Integer.valueOf(uaVar.h);
        xaVar.d = u9Var;
        uaVar.c.a(xaVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0026, code lost:
    
        if (r2.isEmpty() == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void b() {
        String str;
        c8.m mVar;
        uf ufVar = (uf) this.c;
        xa xaVar = (xa) this.d;
        c8.fb fbVar = (c8.fb) this.e;
        String str2 = (String) this.b;
        ga.d dVar = (ga.d) xaVar.c;
        dVar.c = fbVar;
        ue ueVar = (ue) dVar.b;
        if (ueVar != null) {
            str = ueVar.d;
            int i7 = c8.k4.a;
            if (str != null) {
            }
        }
        str = "NA";
        u9 u9Var = new u9();
        u9Var.a = ufVar.a;
        u9Var.b = ufVar.b;
        synchronized (uf.class) {
            mVar = uf.k;
            if (mVar == null) {
                n0.c a10 = c8.z9.a(Resources.getSystem().getConfiguration());
                Object[] objArr = new Object[4];
                int i10 = 0;
                int i11 = 0;
                while (i10 < a10.a.size()) {
                    Locale locale = a10.a.get(i10);
                    k8.a aVar = pb.c.a;
                    String languageTag = locale.toLanguageTag();
                    languageTag.getClass();
                    int i12 = i11 + 1;
                    int length = objArr.length;
                    if (length < i12) {
                        int i13 = length + (length >> 1) + 1;
                        if (i13 < i12) {
                            int highestOneBit = Integer.highestOneBit(i11);
                            i13 = highestOneBit + highestOneBit;
                        }
                        if (i13 < 0) {
                            i13 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                        }
                        objArr = Arrays.copyOf(objArr, i13);
                    }
                    objArr[i11] = languageTag;
                    i10++;
                    i11 = i12;
                }
                mVar = c8.i.m(i11, objArr);
                uf.k = mVar;
            }
        }
        u9Var.k = mVar;
        u9Var.g = Boolean.TRUE;
        u9Var.d = str;
        u9Var.c = str2;
        u9Var.e = ufVar.f.isSuccessful() ? (String) ufVar.f.getResult() : ufVar.d.a();
        u9Var.i = 10;
        u9Var.j = Integer.valueOf(ufVar.h);
        xaVar.d = u9Var;
        ufVar.c.a(xaVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0033, code lost:
    
        if (r7.isEmpty() == false) goto L11;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i7;
        Task task;
        String str;
        y7.m9 m9Var;
        f6.r rVar = null;
        int i10 = 0;
        switch (this.a) {
            case 0:
                a();
                return;
            case 1:
                b();
                return;
            case 2:
                com.google.android.gms.internal.cast.o oVar = (com.google.android.gms.internal.cast.o) this.c;
                s4.v vVar = (s4.v) this.d;
                s4.v vVar2 = (s4.v) this.e;
                c0.i iVar = (c0.i) this.b;
                com.google.android.gms.internal.cast.s sVar = oVar.a;
                sVar.getClass();
                j6.b bVar = com.google.android.gms.internal.cast.s.i;
                Set set = sVar.b;
                if (new HashSet(set).isEmpty()) {
                    bVar.b("No need to prepare transfer without any callback", new Object[0]);
                    iVar.a(null);
                    return;
                }
                if (vVar.l != 1) {
                    bVar.b("No need to prepare transfer when transferring from local", new Object[0]);
                    iVar.a(null);
                    return;
                }
                h6.h a10 = sVar.a();
                if (a10 == null || !a10.h()) {
                    bVar.b("No need to prepare transfer when there is no media session", new Object[0]);
                    iVar.a(null);
                    return;
                }
                bVar.b("Prepare route transfer for changing endpoint", new Object[0]);
                if (vVar2.l == 0) {
                    com.google.android.gms.internal.cast.a2.a(com.google.android.gms.internal.cast.a1.h0);
                    i7 = 1;
                } else {
                    i7 = CastDevice.b(vVar2.s) == null ? 3 : 2;
                }
                sVar.e = i7;
                sVar.g = iVar;
                bVar.b("notify transferring with type = %d", Integer.valueOf(i7));
                Iterator it = new HashSet(set).iterator();
                while (it.hasNext()) {
                    com.google.android.gms.internal.cast.v0 v0Var = (com.google.android.gms.internal.cast.v0) it.next();
                    int i11 = sVar.e;
                    switch (v0Var.a) {
                        case 0:
                            com.google.android.gms.internal.cast.x0.j.b("onTransferring with type = %d", Integer.valueOf(i11));
                            com.google.android.gms.internal.cast.x0 x0Var = (com.google.android.gms.internal.cast.x0) v0Var.b;
                            x0Var.i = true;
                            x0Var.c();
                            com.google.android.gms.internal.cast.o1 b10 = x0Var.c.b(x0Var.g);
                            com.google.android.gms.internal.cast.j1 m10 = com.google.android.gms.internal.cast.k1.m(b10.d());
                            m10.c();
                            com.google.android.gms.internal.cast.k1.v((com.google.android.gms.internal.cast.k1) m10.b, i11);
                            b10.e((com.google.android.gms.internal.cast.k1) m10.a());
                            x0Var.a.a((com.google.android.gms.internal.cast.p1) b10.a(), ks.G3);
                            break;
                        default:
                            xa xaVar = new xa(10, 4);
                            r7 r7Var = (r7) v0Var.b;
                            xaVar.d = Boolean.valueOf(((com.google.android.gms.internal.cast.c) r7Var.c).d == 2);
                            r7.O(r7Var, new com.google.android.gms.internal.cast.s6(xaVar));
                            com.google.android.gms.internal.cast.r6 P = r7Var.P();
                            com.google.android.gms.internal.cast.a aVar = new com.google.android.gms.internal.cast.a(new b7.l(i11));
                            aVar.c = P.h;
                            P.c.add(aVar);
                            break;
                    }
                }
                sVar.h = null;
                q6.m.e("Must be called from the main thread.");
                if (a10.w()) {
                    a10.g = new TaskCompletionSource();
                    h6.h.k.b("create SessionState with cached mediaInfo and mediaStatus", new Object[0]);
                    MediaInfo d = a10.d();
                    f6.q e10 = a10.e();
                    if (d != null && e10 != null) {
                        Boolean bool = Boolean.TRUE;
                        long a11 = a10.a();
                        f6.n nVar = e10.M;
                        double d2 = e10.d;
                        if (Double.compare(d2, 2.0d) > 0 || Double.compare(d2, 0.5d) < 0) {
                            throw new IllegalArgumentException("playbackRate must be between PLAYBACK_RATE_MIN and PLAYBACK_RATE_MAX");
                        }
                        rVar = new f6.r(new f6.k(d, nVar, bool, a11, d2, e10.w, e10.F, null, null, null, null, 0L), null);
                    }
                    if (rVar != null) {
                        a10.g.setResult(rVar);
                    } else {
                        a10.g.setException(new j6.k());
                    }
                    task = a10.g.getTask();
                } else {
                    task = Tasks.forException(new j6.k());
                }
                task.addOnSuccessListener(new com.google.android.gms.internal.cast.q(sVar)).addOnFailureListener(new com.google.android.gms.internal.cast.q(sVar));
                com.google.android.gms.internal.cast.y yVar = sVar.c;
                q6.m.h(yVar);
                com.google.android.gms.internal.cast.r rVar2 = sVar.d;
                q6.m.h(rVar2);
                yVar.postDelayed(rVar2, 10000L);
                return;
            case 3:
                l.e eVar = (l.e) ((hi.u5) this.b).b;
                l.m mVar = (l.m) this.d;
                l.d dVar = (l.d) this.c;
                if (dVar != null) {
                    eVar.Q = true;
                    dVar.b.c(false);
                    eVar.Q = false;
                }
                if (mVar.isEnabled() && mVar.hasSubMenu()) {
                    ((l.k) this.e).q(mVar, null, 4);
                    return;
                }
                return;
            case 4:
                r0.q0.h((View) this.c, (r0.v0) this.d, (k8.a) this.e);
                ((ValueAnimator) this.b).start();
                return;
            case 5:
                ((hn) this.c).F((s4.p) this.b, (s4.m) this.d, (Collection) this.e);
                return;
            case 6:
                ((hn) this.c).F((s4.p) this.b, (s4.m) this.d, (ArrayList) this.e);
                return;
            default:
                y7.d9 d9Var = (y7.d9) this.c;
                xa xaVar2 = (xa) this.d;
                y7.l6 l6Var = (y7.l6) this.e;
                String str2 = (String) this.b;
                xi.e eVar2 = (xi.e) xaVar2.c;
                eVar2.b = l6Var;
                y7.h8 h8Var = (y7.h8) eVar2.a;
                if (h8Var != null) {
                    str = h8Var.d;
                    int i12 = y7.h7.a;
                    if (str != null) {
                        break;
                    }
                }
                str = "NA";
                u9 u9Var = new u9();
                u9Var.a = d9Var.a;
                u9Var.b = d9Var.b;
                synchronized (y7.d9.class) {
                    m9Var = y7.d9.j;
                    if (m9Var == null) {
                        n0.c a12 = c8.z9.a(Resources.getSystem().getConfiguration());
                        Object[] objArr = new Object[4];
                        int i13 = 0;
                        while (i10 < a12.a.size()) {
                            Locale locale = a12.a.get(i10);
                            k8.a aVar2 = pb.c.a;
                            String languageTag = locale.toLanguageTag();
                            languageTag.getClass();
                            int i14 = i13 + 1;
                            int length = objArr.length;
                            if (length < i14) {
                                int i15 = length + (length >> 1) + 1;
                                if (i15 < i14) {
                                    int highestOneBit = Integer.highestOneBit(i13);
                                    i15 = highestOneBit + highestOneBit;
                                }
                                if (i15 < 0) {
                                    i15 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                }
                                objArr = Arrays.copyOf(objArr, i15);
                            }
                            objArr[i13] = languageTag;
                            i10++;
                            i13 = i14;
                        }
                        y7.i9 i9Var = y7.k9.b;
                        m9Var = i13 == 0 ? y7.m9.e : new y7.m9(i13, objArr);
                        y7.d9.j = m9Var;
                    }
                }
                u9Var.k = m9Var;
                u9Var.g = Boolean.TRUE;
                u9Var.d = str;
                u9Var.c = str2;
                u9Var.e = d9Var.f.isSuccessful() ? (String) d9Var.f.getResult() : d9Var.d.a();
                u9Var.i = 10;
                u9Var.j = Integer.valueOf(d9Var.h);
                xaVar2.d = u9Var;
                d9Var.c.a(xaVar2);
                return;
        }
    }

    public /* synthetic */ qa(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }
}
