package hg;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.ActionBar.g3;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n implements DialogInterface.OnShowListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n(KeyEvent.Callback callback, Object obj, int i10) {
        this.a = i10;
        this.b = callback;
        this.c = obj;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                View view = (View) this.b;
                s sVar = (s) this.c;
                if (view != null) {
                    view.clearFocus();
                }
                sVar.requestFocus();
                AndroidUtilities.showKeyboard(sVar);
                break;
            default:
                VoIPService.lambda$toggleSpeakerphoneOrShowRouteSheet$94((g3) this.b, (Integer) this.c, dialogInterface);
                break;
        }
    }
}
