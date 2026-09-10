package gg;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import m.r3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.tgnet.TLParseException;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Cells.g3;
import org.telegram.ui.Cells.i3;
import org.telegram.ui.eo;
import org.telegram.ui.ig1;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class v1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v1(i2.b0 b0Var, SurfaceTexture surfaceTexture) {
        this.a = 12;
        this.b = b0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        int i11 = 0;
        int i12 = 1;
        Object obj = this.b;
        switch (i10) {
            case 0:
                ((u1) obj).run(Boolean.FALSE);
                return;
            case 1:
                NotificationCenter.getInstance(((k2) obj).a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                return;
            case 2:
                ((e2.a0) obj).getClass();
                return;
            case 3:
                g3 g3Var = ((i3) obj).b;
                g3Var.requestFocus();
                AndroidUtilities.showKeyboard(g3Var);
                return;
            case 4:
                AndroidUtilities.showKeyboard(((hi.y) obj).e0.b);
                return;
            case 5:
                ((hi.f0) obj).invalidate();
                return;
            case 6:
                r3 r3Var = (r3) obj;
                r3Var.c = null;
                r3Var.d = null;
                r3Var.e = null;
                r3Var.f = null;
                r3Var.c(null);
                return;
            case 7:
                ((hi.d2) obj).invalidateSelf();
                return;
            case 8:
                ((hi.k2) obj).c();
                return;
            case 9:
                com.google.firebase.messaging.m mVar = (com.google.firebase.messaging.m) obj;
                ((Context) mVar.b).unregisterReceiver((i2.b) mVar.c);
                return;
            case 10:
                i2.b bVar = (i2.b) obj;
                if (bVar.c.a) {
                    bVar.a.a.y1(3, false);
                    return;
                }
                return;
            case 11:
                i2.e0 e0Var = (i2.e0) obj;
                e2.c cVar = e0Var.E;
                Context context = e0Var.e;
                String str = e2.d0.a;
                Integer valueOf = Integer.valueOf(c2.d.e(context).generateAudioSessionId());
                cVar.f = valueOf;
                e2.b bVar2 = new e2.b(cVar, valueOf, i11);
                e2.z zVar = (e2.z) cVar.c;
                if (zVar.a.getLooper().getThread().isAlive()) {
                    zVar.c(bVar2);
                    return;
                }
                return;
            case 12:
                i2.e0 e0Var2 = ((i2.b0) obj).a;
                e0Var2.t1(null);
                e0Var2.m1(0, 0);
                return;
            case 13:
                try {
                    i2.n0.h((i2.i1) obj);
                    return;
                } catch (i2.n e) {
                    e2.a.f("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
                    throw new RuntimeException(e);
                }
            case 14:
                j2.e eVar = (j2.e) obj;
                j2.a l4 = eVar.l();
                eVar.q(l4, 1028, new i0.b(l4));
                eVar.f.d();
                return;
            case 15:
                ((jh.b) obj).invalidate();
                return;
            case 16:
                k2.e0 e0Var3 = (k2.e0) obj;
                if (e0Var3.k0 >= 300000) {
                    e0Var3.t.l();
                    e0Var3.k0 = 0L;
                    return;
                }
                return;
            case 17:
                kh.c cVar2 = (kh.c) obj;
                GroupCallMessage groupCallMessage = cVar2.H;
                if (groupCallMessage != null) {
                    cVar2.a.a(groupCallMessage.isSendDelayed(), true);
                    cVar2.b.a(cVar2.H.isSendError(), true);
                    return;
                }
                return;
            case 18:
                ki.d dVar = (ki.d) obj;
                AndroidUtilities.runOnUIThread(new ki.c(dVar.a, dVar.b, i12), 500L);
                return;
            case 19:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, (i6) obj, Boolean.TRUE, null, -1);
                return;
            case 20:
                ig1 ig1Var = (ig1) obj;
                if (ig1Var.getParentLayout() != null) {
                    ig1Var.H = true;
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", ig1Var.a);
                    eo eoVar = new eo(bundle);
                    eoVar.ja = true;
                    ig1Var.presentFragment(eoVar);
                    return;
                }
                return;
            case 21:
                n2.d dVar2 = (n2.d) obj;
                if (dVar2.c) {
                    return;
                }
                n2.g gVar = dVar2.b;
                if (gVar != null) {
                    gVar.a(dVar2.a);
                }
                dVar2.d.x.remove(dVar2);
                dVar2.c = true;
                return;
            case 22:
                ((n2.b) obj).a(null);
                return;
            case 23:
                ((o0.b) obj).A();
                return;
            case 24:
                l2.h hVar = ((og.t0) obj).b.a;
                if (hVar != null) {
                    hVar.n();
                    return;
                }
                return;
            case 25:
                og.v0 v0Var = ((og.t0) obj).b;
                if (v0Var.d == null) {
                    v0Var.L = null;
                    return;
                }
                int currentColor = v0Var.f.getCurrentColor();
                v0Var.l(v0Var.b, false, false);
                a5.a d = v0Var.d(v0Var.b, currentColor, new RectF(v0Var.h));
                v0Var.b();
                og.k1 k1Var = v0Var.d;
                RectF rectF = new RectF();
                v0Var.h = rectF;
                k1Var.a(rectF);
                v0Var.p(v0Var.e(k1Var, currentColor, new RectF(v0Var.h)), false);
                v0Var.p(d, false);
                v0Var.e(k1Var, currentColor, null);
                v0Var.d = null;
                v0Var.J = 0.0f;
                v0Var.L = null;
                return;
            case 26:
                ((og.f1) ((androidx.activity.i) obj).b).y.a.a();
                return;
            case 27:
                og.x1 x1Var = ((og.y1) obj).a;
                if (x1Var != null) {
                    x1Var.e();
                    return;
                }
                return;
            case 28:
                oh.c cVar3 = (oh.c) obj;
                oh.b bVar3 = cVar3.c;
                if (bVar3 == oh.b.b) {
                    cVar3.a(oh.b.a, true);
                    return;
                } else {
                    if (bVar3 == oh.b.c) {
                        cVar3.a(oh.b.d, true);
                        return;
                    }
                    return;
                }
            default:
                TLParseException.lambda$doThrowOrLog$0((TLParseException) obj);
                return;
        }
    }

    public /* synthetic */ v1(i2.n0 n0Var, i2.i1 i1Var) {
        this.a = 13;
        this.b = i1Var;
    }

    public /* synthetic */ v1(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }
}
