package di;

import android.graphics.Paint;
import android.view.KeyEvent;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.a20;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.ki;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class qa implements a20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;

    public /* synthetic */ qa(KeyEvent.Callback callback, int i7) {
        this.a = i7;
        this.b = callback;
    }

    @Override // org.telegram.messenger.a20
    public final Object a(Object obj) {
        int i7 = this.a;
        KeyEvent.Callback callback = this.b;
        switch (i7) {
            case 0:
                ra raVar = (ra) callback;
                return raVar.s[((Integer) obj).intValue() % raVar.s.length];
            case 1:
                gj gjVar = (gj) obj;
                ((hi.v6) callback).m2 = gjVar;
                return Boolean.valueOf(MediaController.B().o0(org.telegram.messenger.k5.j(gjVar), gjVar, 0L, true, null, 0L));
            case 2:
                ra raVar2 = (ra) callback;
                return raVar2.s[((Integer) obj).intValue() % raVar2.s.length];
            case 3:
                return new org.telegram.ui.web.e1(0, (org.telegram.ui.l0) callback, (Integer) obj);
            case 4:
                tg.g0 g0Var = (tg.g0) callback;
                if (((Integer) obj).intValue() == 2) {
                    ki kiVar = new ki(g0Var.getContext(), new tg.w(g0Var), false, false, false, g0Var.A1);
                    kiVar.n = true;
                    kiVar.A1(hd.M0(2131754428, null));
                    kiVar.X3 = new tg.x(g0Var, kiVar);
                    kiVar.setOnDismissListener(new hi.f1(8));
                    kiVar.y1(1, false);
                    kiVar.e1();
                    MediaController.h2 = true;
                    kiVar.e2.i0();
                    kiVar.show();
                }
                return Boolean.TRUE;
            default:
                Paint[] paintArr = ((yg.r) callback).h;
                return paintArr[((Integer) obj).intValue() % paintArr.length];
        }
    }
}
