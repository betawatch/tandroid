package bi;

import android.graphics.Paint;
import android.view.KeyEvent;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ti;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class dc implements Utilities.CallbackReturn {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;

    public /* synthetic */ dc(KeyEvent.Callback callback, int i10) {
        this.a = i10;
        this.b = callback;
    }

    @Override // org.telegram.messenger.Utilities.CallbackReturn
    public final Object run(Object obj) {
        switch (this.a) {
            case 0:
                ec ecVar = (ec) this.b;
                return ecVar.r[((Integer) obj).intValue() % ecVar.r.length];
            case 1:
                MessageObject messageObject = (MessageObject) obj;
                ((fi.o7) this.b).q0 = messageObject;
                return Boolean.valueOf(MediaController.getInstance().setPlaylist(org.telegram.messenger.t.l(messageObject), messageObject, 0L));
            case 2:
                gi.d dVar = (gi.d) this.b;
                return dVar.r[((Integer) obj).intValue() % dVar.r.length];
            case 3:
                return new org.telegram.ui.Wallet.a6(17, (org.telegram.ui.l0) this.b, (Integer) obj);
            case 4:
                sg.m0 m0Var = (sg.m0) this.b;
                if (((Integer) obj).intValue() == 2) {
                    ti tiVar = new ti(m0Var.getContext(), new sg.x(m0Var), false, false, false, m0Var.F1);
                    tiVar.drawNavigationBar = true;
                    tiVar.T1(LocaleController.getString(R.string.AddImage));
                    tiVar.c2 = new sg.y(m0Var, tiVar);
                    tiVar.setOnDismissListener(new fi.e1(8));
                    tiVar.R1(1, false);
                    tiVar.w1();
                    MediaController.forceBroadcastNewPhotos = true;
                    tiVar.j0.g0();
                    tiVar.show();
                }
                return Boolean.TRUE;
            default:
                Paint[] paintArr = ((xg.r) this.b).h;
                return paintArr[((Integer) obj).intValue() % paintArr.length];
        }
    }
}
