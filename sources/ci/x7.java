package ci;

import android.graphics.Paint;
import android.view.KeyEvent;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.yi;
import org.telegram.ui.ii1;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
                return Boolean.valueOf(MediaController.getInstance().setPlaylist(org.telegram.messenger.q.k(messageObject), messageObject, 0L));
            case 1:
                di.d dVar = (di.d) this.b;
                return dVar.n[((Integer) obj).intValue() % dVar.n.length];
            case 2:
                return new ii1(29, (org.telegram.ui.l0) this.b, (Integer) obj);
            case 3:
                qg.m0 m0Var = (qg.m0) this.b;
                if (((Integer) obj).intValue() == 2) {
                    yi yiVar = new yi(m0Var.getContext(), new qg.x(m0Var), false, false, false, m0Var.Q1);
                    yiVar.drawNavigationBar = true;
                    yiVar.P1(LocaleController.getString(R.string.AddImage));
                    yiVar.c2 = new qg.y(m0Var, yiVar);
                    yiVar.setOnDismissListener(new e1(7));
                    yiVar.N1(1, false);
                    yiVar.t1();
                    MediaController.forceBroadcastNewPhotos = true;
                    yiVar.j0.f0();
                    yiVar.show();
                }
                return Boolean.TRUE;
            case 4:
                Paint[] paintArr = ((vg.r) this.b).h;
                return paintArr[((Integer) obj).intValue() % paintArr.length];
            default:
                yh.r6 r6Var = (yh.r6) this.b;
                return r6Var.n[((Integer) obj).intValue() % r6Var.n.length];
        }
    }
}
