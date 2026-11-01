package ag;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y implements DialogInterface.OnShowListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;
    public final /* synthetic */ Object c;

    public /* synthetic */ y(KeyEvent.Callback callback, Object obj, int i10) {
        this.a = i10;
        this.b = callback;
        this.c = obj;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                View view = (View) this.b;
                f0 f0Var = (f0) this.c;
                if (view != null) {
                    view.clearFocus();
                }
                f0Var.requestFocus();
                org.telegram.messenger.i0.J3(f0Var);
                break;
            default:
                VoIPService.lambda$toggleSpeakerphoneOrShowRouteSheet$94((org.telegram.ui.ActionBar.z2) this.b, (Integer) this.c, dialogInterface);
                break;
        }
    }
}
