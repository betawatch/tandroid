package kg;

import a8.ma;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Looper;
import bi.o2;
import ki.s2;
import ki.s3;
import m.o3;
import org.telegram.messenger.ks;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.ui.Cells.j3;
import org.telegram.ui.Cells.l3;
import org.telegram.ui.Components.b51;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class i0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i0(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        int i7 = this.a;
        int i10 = 0;
        Object obj2 = this.b;
        switch (i7) {
            case 0:
                k0 k0Var = (k0) obj2;
                b51 b51Var = k0Var.a2;
                if (b51Var != null) {
                    b51Var.O(true);
                }
                k0Var.e1(true);
                return;
            case 1:
                s0 s0Var = (s0) ((h6.o) obj2).b;
                s0Var.c.g3.O(true);
                s0Var.g0();
                return;
            case 2:
                u0 u0Var = (u0) obj2;
                u0Var.b.g3.O(true);
                u0Var.a0(true);
                return;
            case 3:
                e1 e1Var = (e1) obj2;
                e1Var.a.g3.O(true);
                e1Var.d0(true);
                return;
            case 4:
                ((o2) obj2).a(Boolean.FALSE);
                return;
            case 5:
                ks.f(((w1) obj2).a).k(ks.F1, new Object[0]);
                return;
            case 6:
                ((ki.c0) obj2).invalidateSelf();
                return;
            case 7:
                ((ki.d0) obj2).invalidateSelf();
                return;
            case 8:
                ((ki.f0) obj2).d();
                return;
            case 9:
                ((ki.s0) obj2).c();
                return;
            case 10:
                ((ki.s0) obj2).c();
                return;
            case 11:
                ((ki.t0) obj2).a();
                return;
            case 12:
                ((ki.u0) obj2).a();
                return;
            case 13:
                ((s2) obj2).invalidate();
                return;
            case 14:
                ((h2.f) obj2).e();
                return;
            case 15:
                s3 s3Var = (s3) obj2;
                s3Var.R = s3Var.r;
                return;
            case 16:
                l2.g0 g0Var = (l2.g0) obj2;
                h2.c cVar = g0Var.C;
                Context context = g0Var.e;
                String str = h2.l0.a;
                int generateAudioSessionId = f2.i.d(context).generateAudioSessionId();
                if (generateAudioSessionId == -1) {
                    generateAudioSessionId = 0;
                }
                cVar.getClass();
                Looper myLooper = Looper.myLooper();
                if (myLooper == ((h2.i0) cVar.c).a.getLooper()) {
                    obj = cVar.e;
                } else {
                    ma.p(myLooper == ((h2.i0) cVar.b).a.getLooper());
                    obj = cVar.f;
                }
                if (((Integer) obj).intValue() != generateAudioSessionId) {
                    Integer valueOf = Integer.valueOf(generateAudioSessionId);
                    cVar.f = valueOf;
                    h2.b bVar = new h2.b(cVar, valueOf, i10);
                    h2.i0 i0Var = (h2.i0) cVar.c;
                    if (i0Var.a.getLooper().getThread().isAlive()) {
                        i0Var.d(bVar);
                    }
                    g0Var.t1(1, 10, Integer.valueOf(generateAudioSessionId));
                    g0Var.t1(2, 10, Integer.valueOf(generateAudioSessionId));
                    return;
                }
                return;
            case 17:
                l2.g0 g0Var2 = ((l2.a0) obj2).a;
                g0Var2.x1(null);
                g0Var2.q1(0, 0);
                return;
            case 18:
                try {
                    l2.p0.f((l2.k1) obj2);
                    return;
                } catch (l2.m e10) {
                    h2.a.d("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e10);
                    throw new RuntimeException(e10);
                }
            case 19:
                m2.d dVar = (m2.d) obj2;
                m2.a Q = dVar.Q();
                dVar.V(Q, 1028, new li.c(Q, 23));
                dVar.f.d();
                return;
            case 20:
                ((mh.b) obj2).invalidate();
                return;
            case 21:
                ((n2.e) obj2).c();
                return;
            case 22:
                h2.r rVar = (h2.r) obj2;
                rVar.getClass();
                if (Thread.currentThread() == rVar.a) {
                    rVar.e(-1, new n2.a0(1));
                    return;
                }
                return;
            case 23:
                n2.s0 s0Var2 = (n2.s0) obj2;
                if (s0Var2.a0 >= 300000) {
                    s0Var2.n.l();
                    s0Var2.a0 = 0L;
                    return;
                }
                return;
            case 24:
                nh.c cVar2 = (nh.c) obj2;
                GroupCallMessage groupCallMessage = cVar2.I;
                if (groupCallMessage != null) {
                    cVar2.a.a(groupCallMessage.isSendDelayed(), true);
                    cVar2.b.a(cVar2.I.isSendError(), true);
                    return;
                }
                return;
            case 25:
                j3 j3Var = ((l3) obj2).d;
                j3Var.requestFocus();
                org.telegram.messenger.g0.I3(j3Var);
                return;
            case 26:
                org.telegram.messenger.g0.I3(((oi.v) obj2).a2.d);
                return;
            case 27:
                ((oi.b0) obj2).invalidate();
                return;
            case 28:
                o3 o3Var = (o3) obj2;
                o3Var.c = null;
                o3Var.d = null;
                o3Var.e = null;
                o3Var.f = null;
                o3Var.e(null);
                return;
            default:
                ((oi.y1) obj2).invalidateSelf();
                return;
        }
    }

    public /* synthetic */ i0(l2.a0 a0Var, SurfaceTexture surfaceTexture) {
        this.a = 17;
        this.b = a0Var;
    }

    public /* synthetic */ i0(l2.p0 p0Var, l2.k1 k1Var) {
        this.a = 18;
        this.b = k1Var;
    }
}
