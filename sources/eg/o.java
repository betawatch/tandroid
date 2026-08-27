package eg;

import android.graphics.Paint;
import android.view.KeyEvent;
import hh.m9;
import lh.e1;
import lh.r7;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.y1;
import org.telegram.ui.Components.gi;
import org.telegram.ui.o0;
import org.telegram.ui.zh1;
import zf.l0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o implements Utilities.CallbackReturn {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;

    public /* synthetic */ o(KeyEvent.Callback callback, int i10) {
        this.a = i10;
        this.b = callback;
    }

    @Override // org.telegram.messenger.Utilities.CallbackReturn
    public final Object run(Object obj) {
        switch (this.a) {
            case 0:
                Paint[] paintArr = ((t) this.b).h;
                return paintArr[((Integer) obj).intValue() % paintArr.length];
            case 1:
                m9 m9Var = (m9) this.b;
                return m9Var.n[((Integer) obj).intValue() % m9Var.n.length];
            case 2:
                MessageObject messageObject = (MessageObject) obj;
                ((r7) this.b).n0 = messageObject;
                return Boolean.valueOf(MediaController.getInstance().setPlaylist(y1.m(messageObject), messageObject, 0L));
            case 3:
                mh.c cVar = (mh.c) this.b;
                return cVar.n[((Integer) obj).intValue() % cVar.n.length];
            case 4:
                return new zh1(7, (o0) this.b, (Integer) obj);
            default:
                l0 l0Var = (l0) this.b;
                if (((Integer) obj).intValue() == 2) {
                    gi giVar = new gi(l0Var.getContext(), new zf.w(l0Var), false, false, false, l0Var.M1);
                    giVar.drawNavigationBar = true;
                    giVar.L1(LocaleController.getString(R.string.AddImage));
                    giVar.V1 = new zf.x(l0Var, giVar);
                    giVar.setOnDismissListener(new e1(7));
                    giVar.J1(1, false);
                    giVar.r1();
                    MediaController.forceBroadcastNewPhotos = true;
                    giVar.f0.f0();
                    giVar.show();
                }
                return Boolean.TRUE;
        }
    }
}
