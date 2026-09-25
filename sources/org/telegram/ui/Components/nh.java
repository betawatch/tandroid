package org.telegram.ui.Components;

import android.view.KeyEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nh implements Utilities.Callback4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;

    public /* synthetic */ nh(KeyEvent.Callback callback, int i10) {
        this.a = i10;
        this.b = callback;
    }

    @Override // org.telegram.messenger.Utilities.Callback4
    public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.a) {
            case 0:
                wi wiVar = (wi) this.b;
                CharSequence charSequence = (CharSequence) obj;
                bi biVar = wiVar.E0;
                biVar.setText(charSequence);
                biVar.w(charSequence.length(), charSequence.length());
                wiVar.z1();
                break;
            case 1:
                wi wiVar2 = (wi) this.b;
                CharSequence charSequence2 = (CharSequence) obj;
                ei eiVar = wiVar2.P0;
                eiVar.setText(charSequence2);
                eiVar.w(charSequence2.length(), charSequence2.length());
                wiVar2.z1();
                break;
            default:
                md mdVar = (md) this.b;
                ci.g gVar = mdVar.f;
                gVar.setText((CharSequence) obj);
                gVar.d();
                gVar.k(true);
                ci.e eVar = mdVar.c0;
                AndroidUtilities.cancelRunOnUIThread(eVar);
                eVar.run();
                break;
        }
    }
}
