// default package

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class g51 implements DialogInterface.OnShowListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ KeyEvent.Callback b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g51(KeyEvent.Callback callback, Object obj, byte b) {
        this.a = b;
        this.b = callback;
        this.c = obj;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        byte b = this.a;
        Object obj = this.c;
        KeyEvent.Callback callback = this.b;
        switch (b) {
            case 0:
                View view = (View) callback;
                j51 j51Var = (j51) obj;
                if (view != null) {
                    view.clearFocus();
                }
                j51Var.requestFocus();
                gm.E3(j51Var);
                break;
            default:
                VoIPService.lambda$toggleSpeakerphoneOrShowRouteSheet$90((my0) callback, (Integer) obj, dialogInterface);
                break;
        }
    }
}
