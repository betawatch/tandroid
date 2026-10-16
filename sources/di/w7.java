package di;

import android.graphics.Paint;
import android.view.KeyEvent;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.vi;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class w7 implements Utilities.CallbackReturn {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;

    public /* synthetic */ w7(KeyEvent.Callback callback, int i10) {
        this.a = i10;
        this.b = callback;
    }

    @Override // org.telegram.messenger.Utilities.CallbackReturn
    public final Object run(Object obj) {
        switch (this.a) {
            case 0:
                MessageObject messageObject = (MessageObject) obj;
                ((c8) this.b).r0 = messageObject;
                return Boolean.valueOf(MediaController.getInstance().setPlaylist(org.telegram.messenger.g0.k(messageObject), messageObject, 0L));
            case 1:
                ei.d dVar = (ei.d) this.b;
                return dVar.n[((Integer) obj).intValue() % dVar.n.length];
            case 2:
                return new org.telegram.ui.web.v(5, (org.telegram.ui.m0) this.b, (Integer) obj);
            case 3:
                rg.o0 o0Var = (rg.o0) this.b;
                if (((Integer) obj).intValue() == 2) {
                    vi viVar = new vi(o0Var.getContext(), new rg.x(o0Var), false, false, false, o0Var.Q1);
                    viVar.drawNavigationBar = true;
                    viVar.P1(LocaleController.getString(R.string.AddImage));
                    viVar.c2 = new rg.y(o0Var, viVar);
                    viVar.setOnDismissListener(new e1(7));
                    viVar.N1(1, false);
                    viVar.t1();
                    MediaController.forceBroadcastNewPhotos = true;
                    viVar.j0.f0();
                    viVar.show();
                }
                return Boolean.TRUE;
            case 4:
                Paint[] paintArr = ((wg.r) this.b).h;
                return paintArr[((Integer) obj).intValue() % paintArr.length];
            default:
                zh.r6 r6Var = (zh.r6) this.b;
                return r6Var.n[((Integer) obj).intValue() % r6Var.n.length];
        }
    }
}
