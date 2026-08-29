package bg;

import android.graphics.Paint;
import android.view.KeyEvent;
import jh.i9;
import nh.g7;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ni;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b0 implements Utilities.CallbackReturn {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;

    public /* synthetic */ b0(KeyEvent.Callback callback, int i10) {
        this.a = i10;
        this.b = callback;
    }

    @Override // org.telegram.messenger.Utilities.CallbackReturn
    public final Object run(Object obj) {
        switch (this.a) {
            case 0:
                g1 g1Var = (g1) this.b;
                if (((Integer) obj).intValue() == 2) {
                    ni niVar = new ni(g1Var.getContext(), new o0(g1Var), false, false, false, g1Var.M1);
                    niVar.drawNavigationBar = true;
                    niVar.L1(LocaleController.getString(R.string.AddImage));
                    niVar.V1 = new p0(g1Var, niVar);
                    niVar.setOnDismissListener(new f0(0));
                    niVar.J1(1, false);
                    niVar.r1();
                    MediaController.forceBroadcastNewPhotos = true;
                    niVar.f0.f0();
                    niVar.show();
                }
                return Boolean.TRUE;
            case 1:
                Paint[] paintArr = ((gg.s) this.b).h;
                return paintArr[((Integer) obj).intValue() % paintArr.length];
            case 2:
                i9 i9Var = (i9) this.b;
                return i9Var.n[((Integer) obj).intValue() % i9Var.n.length];
            case 3:
                MessageObject messageObject = (MessageObject) obj;
                ((g7) this.b).n0 = messageObject;
                return Boolean.valueOf(MediaController.getInstance().setPlaylist(org.telegram.messenger.x3.n(messageObject), messageObject, 0L));
            case 4:
                oh.c cVar = (oh.c) this.b;
                return cVar.n[((Integer) obj).intValue() % cVar.n.length];
            default:
                return new org.telegram.ui.web.y(4, (org.telegram.ui.o0) this.b, (Integer) obj);
        }
    }
}
