package eg;

import android.graphics.Paint;
import android.view.KeyEvent;
import mh.j9;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.mi;
import org.telegram.ui.bh1;
import qh.i6;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y implements Utilities.CallbackReturn {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;

    public /* synthetic */ y(KeyEvent.Callback callback, int i10) {
        this.a = i10;
        this.b = callback;
    }

    @Override // org.telegram.messenger.Utilities.CallbackReturn
    public final Object run(Object obj) {
        switch (this.a) {
            case 0:
                c1 c1Var = (c1) this.b;
                if (((Integer) obj).intValue() == 2) {
                    mi miVar = new mi(c1Var.getContext(), new l0(c1Var), false, false, false, c1Var.N1);
                    miVar.drawNavigationBar = true;
                    miVar.L1(LocaleController.getString(R.string.AddImage));
                    miVar.W1 = new m0(c1Var, miVar);
                    miVar.setOnDismissListener(new c0(0));
                    miVar.J1(1, false);
                    miVar.r1();
                    MediaController.forceBroadcastNewPhotos = true;
                    miVar.g0.f0();
                    miVar.show();
                }
                return Boolean.TRUE;
            case 1:
                Paint[] paintArr = ((jg.s) this.b).h;
                return paintArr[((Integer) obj).intValue() % paintArr.length];
            case 2:
                j9 j9Var = (j9) this.b;
                return j9Var.n[((Integer) obj).intValue() % j9Var.n.length];
            case 3:
                return new bh1(11, (org.telegram.ui.m0) this.b, (Integer) obj);
            case 4:
                MessageObject messageObject = (MessageObject) obj;
                ((i6) this.b).o0 = messageObject;
                return Boolean.valueOf(MediaController.getInstance().setPlaylist(org.telegram.messenger.y3.m(messageObject), messageObject, 0L));
            default:
                rh.c cVar = (rh.c) this.b;
                return cVar.n[((Integer) obj).intValue() % cVar.n.length];
        }
    }
}
