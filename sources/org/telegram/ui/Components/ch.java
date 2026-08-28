package org.telegram.ui.Components;

import android.view.KeyEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ch implements Utilities.Callback4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;

    public /* synthetic */ ch(KeyEvent.Callback callback, int i9) {
        this.a = i9;
        this.b = callback;
    }

    @Override // org.telegram.messenger.Utilities.Callback4
    public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.a) {
            case 0:
                ki kiVar = (ki) this.b;
                CharSequence charSequence = (CharSequence) obj;
                qh qhVar = kiVar.A0;
                qhVar.setText(charSequence);
                qhVar.w(charSequence.length(), charSequence.length());
                kiVar.z1();
                break;
            case 1:
                ki kiVar2 = (ki) this.b;
                CharSequence charSequence2 = (CharSequence) obj;
                th thVar = kiVar2.L0;
                thVar.setText(charSequence2);
                thVar.w(charSequence2.length(), charSequence2.length());
                kiVar2.z1();
                break;
            default:
                ad adVar = (ad) this.b;
                kh.g gVar = adVar.f;
                gVar.setText((CharSequence) obj);
                gVar.d();
                gVar.k(true);
                kh.e eVar = adVar.V;
                AndroidUtilities.cancelRunOnUIThread(eVar);
                eVar.run();
                break;
        }
    }
}
