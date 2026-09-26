package hg;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.ActionBar.e3;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o implements DialogInterface.OnShowListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o(KeyEvent.Callback callback, Object obj, int i10) {
        this.a = i10;
        this.b = callback;
        this.c = obj;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                View view = (View) this.b;
                u uVar = (u) this.c;
                if (view != null) {
                    view.clearFocus();
                }
                uVar.requestFocus();
                AndroidUtilities.showKeyboard(uVar);
                break;
            default:
                VoIPService.lambda$toggleSpeakerphoneOrShowRouteSheet$94((e3) this.b, (Integer) this.c, dialogInterface);
                break;
        }
    }
}
