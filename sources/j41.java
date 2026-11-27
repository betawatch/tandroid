// default package

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class j41 implements DialogInterface.OnShowListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ KeyEvent.Callback b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j41(byte b, KeyEvent.Callback callback, Object obj) {
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
                k41 k41Var = (k41) obj;
                if (view != null) {
                    view.clearFocus();
                }
                k41Var.requestFocus();
                hl.E3(k41Var);
                break;
            default:
                VoIPService.lambda$toggleSpeakerphoneOrShowRouteSheet$91((nx0) callback, (Integer) obj, dialogInterface);
                break;
        }
    }
}
