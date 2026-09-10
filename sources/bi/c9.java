package bi;

import android.graphics.Paint;
import android.view.KeyEvent;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.yi;
import org.telegram.ui.r91;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class c9 implements Utilities.CallbackReturn {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;

    public /* synthetic */ c9(KeyEvent.Callback callback, int i10) {
        this.a = i10;
        this.b = callback;
    }

    @Override // org.telegram.messenger.Utilities.CallbackReturn
    public final Object run(Object obj) {
        switch (this.a) {
            case 0:
                MessageObject messageObject = (MessageObject) obj;
                ((i9) this.b).r0 = messageObject;
                return Boolean.valueOf(MediaController.getInstance().setPlaylist(org.telegram.messenger.a2.l(messageObject), messageObject, 0L));
            case 1:
                ci.d dVar = (ci.d) this.b;
                return dVar.n[((Integer) obj).intValue() % dVar.n.length];
            case 2:
                return new r91(29, (org.telegram.ui.l0) this.b, (Integer) obj);
            case 3:
                pg.m0 m0Var = (pg.m0) this.b;
                if (((Integer) obj).intValue() == 2) {
                    yi yiVar = new yi(m0Var.getContext(), new pg.x(m0Var), false, false, false, m0Var.Q1);
                    yiVar.drawNavigationBar = true;
                    yiVar.L1(LocaleController.getString(R.string.AddImage));
                    yiVar.Z1 = new pg.y(m0Var, yiVar);
                    yiVar.setOnDismissListener(new k1(7));
                    yiVar.J1(1, false);
                    yiVar.r1();
                    MediaController.forceBroadcastNewPhotos = true;
                    yiVar.j0.f0();
                    yiVar.show();
                }
                return Boolean.TRUE;
            case 4:
                Paint[] paintArr = ((ug.r) this.b).h;
                return paintArr[((Integer) obj).intValue() % paintArr.length];
            default:
                xh.b7 b7Var = (xh.b7) this.b;
                return b7Var.n[((Integer) obj).intValue() % b7Var.n.length];
        }
    }
}
