package ai;

import android.graphics.Paint;
import android.view.KeyEvent;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ti;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final /* synthetic */ class ic implements Utilities.CallbackReturn {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;

    public /* synthetic */ ic(KeyEvent.Callback callback, int i10) {
        this.a = i10;
        this.b = callback;
    }

    @Override // org.telegram.messenger.Utilities.CallbackReturn
    public final Object run(Object obj) {
        switch (this.a) {
            case 0:
                jc jcVar = (jc) this.b;
                return jcVar.n[((Integer) obj).intValue() % jcVar.n.length];
            case 1:
                MessageObject messageObject = (MessageObject) obj;
                ((ei.s7) this.b).r0 = messageObject;
                return Boolean.valueOf(MediaController.getInstance().setPlaylist(org.telegram.messenger.q.k(messageObject), messageObject, 0L));
            case 2:
                fi.c cVar = (fi.c) this.b;
                return cVar.n[((Integer) obj).intValue() % cVar.n.length];
            case 3:
                return new org.telegram.ui.Wallet.t3(26, (org.telegram.ui.n0) this.b, (Integer) obj);
            case 4:
                rg.m0 m0Var = (rg.m0) this.b;
                if (((Integer) obj).intValue() == 2) {
                    ti tiVar = new ti(m0Var.getContext(), new rg.w(m0Var), false, false, false, m0Var.Q1);
                    tiVar.drawNavigationBar = true;
                    tiVar.P1(LocaleController.getString(R.string.AddImage));
                    tiVar.c2 = new rg.x(m0Var, tiVar);
                    tiVar.setOnDismissListener(new ei.e1(7));
                    tiVar.N1(1, false);
                    tiVar.t1();
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
