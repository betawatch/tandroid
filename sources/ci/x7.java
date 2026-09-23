package ci;

import android.graphics.Paint;
import android.view.KeyEvent;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.wi;
import org.telegram.ui.hb1;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final /* synthetic */ class x7 implements Utilities.CallbackReturn {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;

    public /* synthetic */ x7(KeyEvent.Callback callback, int i10) {
        this.a = i10;
        this.b = callback;
    }

    @Override // org.telegram.messenger.Utilities.CallbackReturn
    public final Object run(Object obj) {
        switch (this.a) {
            case 0:
                MessageObject messageObject = (MessageObject) obj;
                ((d8) this.b).r0 = messageObject;
                return Boolean.valueOf(MediaController.getInstance().setPlaylist(org.telegram.messenger.z0.k(messageObject), messageObject, 0L));
            case 1:
                di.d dVar = (di.d) this.b;
                return dVar.n[((Integer) obj).intValue() % dVar.n.length];
            case 2:
                return new hb1(26, (org.telegram.ui.l0) this.b, (Integer) obj);
            case 3:
                qg.p0 p0Var = (qg.p0) this.b;
                if (((Integer) obj).intValue() == 2) {
                    wi wiVar = new wi(p0Var.getContext(), new qg.y(p0Var), false, false, false, p0Var.Q1);
                    wiVar.drawNavigationBar = true;
                    wiVar.L1(LocaleController.getString(R.string.AddImage));
                    wiVar.Z1 = new qg.z(p0Var, wiVar);
                    wiVar.setOnDismissListener(new f1(7));
                    wiVar.J1(1, false);
                    wiVar.r1();
                    MediaController.forceBroadcastNewPhotos = true;
                    wiVar.j0.f0();
                    wiVar.show();
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
