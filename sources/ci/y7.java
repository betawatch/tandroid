package ci;

import android.graphics.Paint;
import android.view.KeyEvent;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.xi;
import org.telegram.ui.e91;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes4.dex */
public final /* synthetic */ class y7 implements Utilities.CallbackReturn {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;

    public /* synthetic */ y7(KeyEvent.Callback callback, int i10) {
        this.a = i10;
        this.b = callback;
    }

    @Override // org.telegram.messenger.Utilities.CallbackReturn
    public final Object run(Object obj) {
        switch (this.a) {
            case 0:
                MessageObject messageObject = (MessageObject) obj;
                ((c8) this.b).p0 = messageObject;
                return Boolean.valueOf(MediaController.getInstance().setPlaylist(org.telegram.messenger.q.k(messageObject), messageObject, 0L));
            case 1:
                di.g gVar = (di.g) this.b;
                return gVar.n[((Integer) obj).intValue() % gVar.n.length];
            case 2:
                return new e91(29, (org.telegram.ui.l0) this.b, (Integer) obj);
            case 3:
                qg.m0 m0Var = (qg.m0) this.b;
                if (((Integer) obj).intValue() == 2) {
                    xi xiVar = new xi(m0Var.getContext(), new qg.x(m0Var), false, false, false, m0Var.Q1);
                    xiVar.drawNavigationBar = true;
                    xiVar.K1(LocaleController.getString(R.string.AddImage));
                    xiVar.Z1 = new qg.y(m0Var, xiVar);
                    xiVar.setOnDismissListener(new f1(7));
                    xiVar.I1(1, false);
                    xiVar.q1();
                    MediaController.forceBroadcastNewPhotos = true;
                    xiVar.j0.f0();
                    xiVar.show();
                }
                return Boolean.TRUE;
            case 4:
                Paint[] paintArr = ((vg.r) this.b).h;
                return paintArr[((Integer) obj).intValue() % paintArr.length];
            default:
                yh.c7 c7Var = (yh.c7) this.b;
                return c7Var.n[((Integer) obj).intValue() % c7Var.n.length];
        }
    }
}
