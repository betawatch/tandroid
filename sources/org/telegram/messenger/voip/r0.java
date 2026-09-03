package org.telegram.messenger.voip;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.h3;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final /* synthetic */ class r0 implements DialogInterface.OnShowListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;
    public final /* synthetic */ Object c;

    public /* synthetic */ r0(KeyEvent.Callback callback, Object obj, int i10) {
        this.a = i10;
        this.b = callback;
        this.c = obj;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                VoIPService.lambda$toggleSpeakerphoneOrShowRouteSheet$94((h3) this.b, (Integer) this.c, dialogInterface);
                break;
            default:
                View view = (View) this.b;
                vf.n nVar = (vf.n) this.c;
                if (view != null) {
                    view.clearFocus();
                }
                nVar.requestFocus();
                AndroidUtilities.showKeyboard(nVar);
                break;
        }
    }
}
