package dg;

import android.graphics.Paint;
import android.view.KeyEvent;
import gh.n9;
import kh.g1;
import kh.s7;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.l0;
import org.telegram.ui.Components.ki;
import org.telegram.ui.ai1;
import org.telegram.ui.n0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o implements Utilities.CallbackReturn {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;

    public /* synthetic */ o(KeyEvent.Callback callback, int i9) {
        this.a = i9;
        this.b = callback;
    }

    @Override // org.telegram.messenger.Utilities.CallbackReturn
    public final Object run(Object obj) {
        switch (this.a) {
            case 0:
                Paint[] paintArr = ((u) this.b).h;
                return paintArr[((Integer) obj).intValue() % paintArr.length];
            case 1:
                n9 n9Var = (n9) this.b;
                return n9Var.n[((Integer) obj).intValue() % n9Var.n.length];
            case 2:
                MessageObject messageObject = (MessageObject) obj;
                ((s7) this.b).n0 = messageObject;
                return Boolean.valueOf(MediaController.getInstance().setPlaylist(l0.k(messageObject), messageObject, 0L));
            case 3:
                lh.c cVar = (lh.c) this.b;
                return cVar.n[((Integer) obj).intValue() % cVar.n.length];
            case 4:
                return new ai1(7, (n0) this.b, (Integer) obj);
            default:
                yf.l0 l0Var = (yf.l0) this.b;
                if (((Integer) obj).intValue() == 2) {
                    ki kiVar = new ki(l0Var.getContext(), new yf.w(l0Var), false, false, false, l0Var.M1);
                    kiVar.drawNavigationBar = true;
                    kiVar.L1(LocaleController.getString(R.string.AddImage));
                    kiVar.V1 = new yf.x(l0Var, kiVar);
                    kiVar.setOnDismissListener(new g1(7));
                    kiVar.J1(1, false);
                    kiVar.r1();
                    MediaController.forceBroadcastNewPhotos = true;
                    kiVar.f0.e0();
                    kiVar.show();
                }
                return Boolean.TRUE;
        }
    }
}
