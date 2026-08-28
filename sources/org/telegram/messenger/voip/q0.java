package org.telegram.messenger.voip;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f3;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class q0 implements DialogInterface.OnShowListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;
    public final /* synthetic */ Object c;

    public /* synthetic */ q0(KeyEvent.Callback callback, Object obj, int i9) {
        this.a = i9;
        this.b = callback;
        this.c = obj;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                VoIPService.lambda$toggleSpeakerphoneOrShowRouteSheet$94((f3) this.b, (Integer) this.c, dialogInterface);
                break;
            default:
                View view = (View) this.b;
                pf.o oVar = (pf.o) this.c;
                if (view != null) {
                    view.clearFocus();
                }
                oVar.requestFocus();
                AndroidUtilities.showKeyboard(oVar);
                break;
        }
    }
}
