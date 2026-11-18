package di;

import android.graphics.Paint;
import android.view.KeyEvent;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.y10;
import org.telegram.ui.Components.si;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ta implements y10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;

    public /* synthetic */ ta(KeyEvent.Callback callback, int i7) {
        this.a = i7;
        this.b = callback;
    }

    @Override // org.telegram.messenger.y10
    public final Object a(Object obj) {
        int i7 = this.a;
        KeyEvent.Callback callback = this.b;
        switch (i7) {
            case 0:
                ua uaVar = (ua) callback;
                return uaVar.s[((Integer) obj).intValue() % uaVar.s.length];
            case 1:
                fj fjVar = (fj) obj;
                ((hi.v6) callback).m2 = fjVar;
                return Boolean.valueOf(MediaController.B().o0(org.telegram.messenger.f3.i(fjVar), fjVar, 0L, true, null, 0L));
            case 2:
                ua uaVar2 = (ua) callback;
                return uaVar2.s[((Integer) obj).intValue() % uaVar2.s.length];
            case 3:
                return new org.telegram.ui.Wallet.c5(22, (org.telegram.ui.l0) callback, (Integer) obj);
            case 4:
                tg.g0 g0Var = (tg.g0) callback;
                if (((Integer) obj).intValue() == 2) {
                    si siVar = new si(g0Var.getContext(), new tg.w(g0Var), false, false, false, g0Var.A1);
                    siVar.n = true;
                    siVar.B1(gd.M0(2131754426, null));
                    siVar.X3 = new tg.x(g0Var, siVar);
                    siVar.setOnDismissListener(new hi.f1(8));
                    siVar.z1(1, false);
                    siVar.f1();
                    MediaController.h2 = true;
                    siVar.e2.i0();
                    siVar.show();
                }
                return Boolean.TRUE;
            default:
                Paint[] paintArr = ((yg.r) callback).h;
                return paintArr[((Integer) obj).intValue() % paintArr.length];
        }
    }
}
