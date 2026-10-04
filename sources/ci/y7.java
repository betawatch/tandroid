package ci;

import android.graphics.Paint;
import android.view.KeyEvent;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.xi;
import org.telegram.ui.g91;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
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
                return Boolean.valueOf(MediaController.getInstance().setPlaylist(org.telegram.messenger.f0.k(messageObject), messageObject, 0L));
            case 1:
                di.g gVar = (di.g) this.b;
                return gVar.n[((Integer) obj).intValue() % gVar.n.length];
            case 2:
                return new g91(29, (org.telegram.ui.l0) this.b, (Integer) obj);
            case 3:
                qg.m0 m0Var = (qg.m0) this.b;
                if (((Integer) obj).intValue() == 2) {
                    xi xiVar = new xi(m0Var.getContext(), new qg.x(m0Var), false, false, false, m0Var.Q1);
                    xiVar.drawNavigationBar = true;
                    xiVar.I1(LocaleController.getString(R.string.AddImage));
                    xiVar.Z1 = new qg.y(m0Var, xiVar);
                    xiVar.setOnDismissListener(new f1(7));
                    xiVar.G1(1, false);
                    xiVar.o1();
                    MediaController.forceBroadcastNewPhotos = true;
                    xiVar.j0.f0();
                    xiVar.show();
                }
                return Boolean.TRUE;
            case 4:
                Paint[] paintArr = ((vg.r) this.b).h;
                return paintArr[((Integer) obj).intValue() % paintArr.length];
            default:
                yh.b7 b7Var = (yh.b7) this.b;
                return b7Var.n[((Integer) obj).intValue() % b7Var.n.length];
        }
    }
}
