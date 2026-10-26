package bi;

import android.graphics.Paint;
import android.view.KeyEvent;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ti;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
                return new org.telegram.ui.Wallet.q6(16, (org.telegram.ui.l0) this.b, (Integer) obj);
            case 4:
                sg.n0 n0Var = (sg.n0) this.b;
                if (((Integer) obj).intValue() == 2) {
                    ti tiVar = new ti(n0Var.getContext(), new sg.y(n0Var), false, false, false, n0Var.F1);
                    tiVar.drawNavigationBar = true;
                    tiVar.S1(LocaleController.getString(R.string.AddImage));
                    tiVar.c2 = new sg.z(n0Var, tiVar);
                    tiVar.setOnDismissListener(new fi.e1(8));
                    tiVar.Q1(1, false);
                    tiVar.v1();
                    MediaController.forceBroadcastNewPhotos = true;
                    tiVar.j0.f0();
                    tiVar.show();
                }
                return Boolean.TRUE;
            default:
                Paint[] paintArr = ((xg.r) this.b).h;
                return paintArr[((Integer) obj).intValue() % paintArr.length];
        }
    }
}
