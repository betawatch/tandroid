package ai;

import android.graphics.Paint;
import android.view.KeyEvent;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ti;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final /* synthetic */ class kc implements Utilities.CallbackReturn {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;

    public /* synthetic */ kc(KeyEvent.Callback callback, int i10) {
        this.a = i10;
        this.b = callback;
    }

    @Override // org.telegram.messenger.Utilities.CallbackReturn
    public final Object run(Object obj) {
        switch (this.a) {
            case 0:
                lc lcVar = (lc) this.b;
                return lcVar.r[((Integer) obj).intValue() % lcVar.r.length];
            case 1:
                MessageObject messageObject = (MessageObject) obj;
                ((ei.s7) this.b).s0 = messageObject;
                return Boolean.valueOf(MediaController.getInstance().setPlaylist(org.telegram.messenger.v0.k(messageObject), messageObject, 0L));
            case 2:
                fi.c cVar = (fi.c) this.b;
                return cVar.r[((Integer) obj).intValue() % cVar.r.length];
            case 3:
                return new org.telegram.ui.Wallet.y3(26, (org.telegram.ui.m0) this.b, (Integer) obj);
            case 4:
                rg.m0 m0Var = (rg.m0) this.b;
                if (((Integer) obj).intValue() == 2) {
                    ti tiVar = new ti(m0Var.getContext(), new rg.x(m0Var), false, false, false, m0Var.Q1);
                    tiVar.drawNavigationBar = true;
                    tiVar.T1(LocaleController.getString(R.string.AddImage));
                    tiVar.c2 = new rg.y(m0Var, tiVar);
                    tiVar.setOnDismissListener(new ei.e1(7));
                    tiVar.R1(1, false);
                    tiVar.w1();
                    MediaController.forceBroadcastNewPhotos = true;
                    tiVar.j0.f0();
                    tiVar.show();
                }
                return Boolean.TRUE;
            default:
                Paint[] paintArr = ((wg.r) this.b).h;
                return paintArr[((Integer) obj).intValue() % paintArr.length];
        }
    }
}
