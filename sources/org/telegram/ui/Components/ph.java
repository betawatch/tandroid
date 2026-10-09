package org.telegram.ui.Components;

import android.view.KeyEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ph implements Utilities.Callback4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;

    public /* synthetic */ ph(KeyEvent.Callback callback, int i10) {
        this.a = i10;
        this.b = callback;
    }

    @Override // org.telegram.messenger.Utilities.Callback4
    public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.a) {
            case 0:
                yi yiVar = (yi) this.b;
                CharSequence charSequence = (CharSequence) obj;
                di diVar = yiVar.H0;
                diVar.setText(charSequence);
                diVar.w(charSequence.length(), charSequence.length());
                yiVar.C1();
                break;
            case 1:
                yi yiVar2 = (yi) this.b;
                CharSequence charSequence2 = (CharSequence) obj;
                gi giVar = yiVar2.S0;
                giVar.setText(charSequence2);
                giVar.w(charSequence2.length(), charSequence2.length());
                yiVar2.C1();
                break;
            default:
                od odVar = (od) this.b;
                ci.g gVar = odVar.f;
                gVar.setText((CharSequence) obj);
                gVar.d();
                gVar.k(true);
                ci.e eVar = odVar.c0;
                AndroidUtilities.cancelRunOnUIThread(eVar);
                eVar.run();
                break;
        }
    }
}
