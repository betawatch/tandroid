package ci;

import android.graphics.Paint;
import android.view.KeyEvent;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.vi;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final /* synthetic */ class a8 implements Utilities.CallbackReturn {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;

    public /* synthetic */ a8(KeyEvent.Callback callback, int i10) {
        this.a = i10;
        this.b = callback;
    }

    @Override // org.telegram.messenger.Utilities.CallbackReturn
    public final Object run(Object obj) {
        switch (this.a) {
            case 0:
                MessageObject messageObject = (MessageObject) obj;
                ((g8) this.b).r0 = messageObject;
                return Boolean.valueOf(MediaController.getInstance().setPlaylist(org.telegram.messenger.l0.j(messageObject), messageObject, 0L));
            case 1:
                di.d dVar = (di.d) this.b;
                return dVar.n[((Integer) obj).intValue() % dVar.n.length];
            case 2:
                return new org.telegram.ui.web.g1(2, (org.telegram.ui.k0) this.b, (Integer) obj);
            case 3:
                qg.n0 n0Var = (qg.n0) this.b;
                if (((Integer) obj).intValue() == 2) {
                    vi viVar = new vi(n0Var.getContext(), new qg.y(n0Var), false, false, false, n0Var.Q1);
                    viVar.drawNavigationBar = true;
                    viVar.L1(LocaleController.getString(R.string.AddImage));
                    viVar.Z1 = new qg.z(n0Var, viVar);
                    viVar.setOnDismissListener(new f1(7));
                    viVar.J1(1, false);
                    viVar.r1();
                    MediaController.forceBroadcastNewPhotos = true;
                    viVar.j0.f0();
                    viVar.show();
                }
                return Boolean.TRUE;
            case 4:
                Paint[] paintArr = ((vg.r) this.b).h;
                return paintArr[((Integer) obj).intValue() % paintArr.length];
            default:
                yh.y6 y6Var = (yh.y6) this.b;
                return y6Var.n[((Integer) obj).intValue() % y6Var.n.length];
        }
    }
}
