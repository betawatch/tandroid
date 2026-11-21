package di;

import android.graphics.Paint;
import android.view.KeyEvent;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.y10;
import org.telegram.ui.Components.ui;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
                ((hi.u6) callback).m2 = fjVar;
                return Boolean.valueOf(MediaController.B().o0(org.telegram.messenger.f3.i(fjVar), fjVar, 0L, true, null, 0L));
            case 2:
                ua uaVar2 = (ua) callback;
                return uaVar2.s[((Integer) obj).intValue() % uaVar2.s.length];
            case 3:
                return new org.telegram.ui.Wallet.u4(24, (org.telegram.ui.l0) callback, (Integer) obj);
            case 4:
                tg.h0 h0Var = (tg.h0) callback;
                if (((Integer) obj).intValue() == 2) {
                    ui uiVar = new ui(h0Var.getContext(), new tg.x(h0Var), false, false, false, h0Var.A1);
                    uiVar.n = true;
                    uiVar.B1(gd.N0(2131754425, null));
                    uiVar.X3 = new tg.y(h0Var, uiVar);
                    uiVar.setOnDismissListener(new hi.f1(8));
                    uiVar.z1(1, false);
                    uiVar.f1();
                    MediaController.h2 = true;
                    uiVar.e2.i0();
                    uiVar.show();
                }
                return Boolean.TRUE;
            default:
                Paint[] paintArr = ((yg.r) callback).h;
                return paintArr[((Integer) obj).intValue() % paintArr.length];
        }
    }
}
