package kg;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.ActionBar.x2;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class o implements DialogInterface.OnShowListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o(KeyEvent.Callback callback, Object obj, int i7) {
        this.a = i7;
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
                org.telegram.messenger.g0.I3(sVar);
                break;
            default:
                VoIPService.lambda$toggleSpeakerphoneOrShowRouteSheet$94((x2) this.b, (Integer) this.c, dialogInterface);
                break;
        }
    }
}
