package di;

import android.graphics.Paint;
import android.view.KeyEvent;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.x10;
import org.telegram.ui.Components.ti;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ta implements x10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;

    public /* synthetic */ ta(KeyEvent.Callback callback, int i7) {
        this.a = i7;
        this.b = callback;
    }

    @Override // org.telegram.messenger.x10
    public final Object a(Object obj) {
        hi.a0 a0Var;
        int i7 = this.a;
        KeyEvent.Callback callback = this.b;
        switch (i7) {
            case 0:
                ua uaVar = (ua) callback;
                return uaVar.s[((Integer) obj).intValue() % uaVar.s.length];
            case 1:
                fj fjVar = (fj) obj;
                ((hi.e7) callback).m2 = fjVar;
                return Boolean.valueOf(MediaController.B().o0(org.telegram.messenger.f3.i(fjVar), fjVar, 0L, true, null, 0L));
            case 2:
                ua uaVar2 = (ua) callback;
                return uaVar2.s[((Integer) obj).intValue() % uaVar2.s.length];
            case 3:
                return new org.telegram.ui.Wallet.r(28, (org.telegram.ui.l0) callback, (Integer) obj);
            case 4:
                tg.l0 l0Var = (tg.l0) callback;
                Integer num = (Integer) obj;
                if (num.intValue() == 2) {
                    ti tiVar = new ti(l0Var.getContext(), new tg.c0(l0Var), false, false, false, l0Var.A1);
                    tiVar.n = true;
                    tiVar.B1(gd.N0(2131754425, null));
                    tiVar.X3 = new t1.a(l0Var, tiVar);
                    tiVar.setOnDismissListener(new hi.n1(8));
                    tiVar.z1(1, false);
                    tiVar.f1();
                    MediaController.h2 = true;
                    tiVar.e2.i0();
                    tiVar.show();
                } else if (num.intValue() == 6 && (a0Var = l0Var.J1) != null) {
                    a0Var.a();
                }
                return Boolean.TRUE;
            default:
                Paint[] paintArr = ((yg.r) callback).h;
                return paintArr[((Integer) obj).intValue() % paintArr.length];
        }
    }
}
