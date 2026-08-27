package org.telegram.ui.Components;

import android.view.KeyEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yg implements Utilities.Callback4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;

    public /* synthetic */ yg(KeyEvent.Callback callback, int i10) {
        this.a = i10;
        this.b = callback;
    }

    @Override // org.telegram.messenger.Utilities.Callback4
    public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.a) {
            case 0:
                gi giVar = (gi) this.b;
                CharSequence charSequence = (CharSequence) obj;
                mh mhVar = giVar.A0;
                mhVar.setText(charSequence);
                mhVar.w(charSequence.length(), charSequence.length());
                giVar.z1();
                break;
            case 1:
                gi giVar2 = (gi) this.b;
                CharSequence charSequence2 = (CharSequence) obj;
                ph phVar = giVar2.L0;
                phVar.setText(charSequence2);
                phVar.w(charSequence2.length(), charSequence2.length());
                giVar2.z1();
                break;
            default:
                xc xcVar = (xc) this.b;
                lh.g gVar = xcVar.f;
                gVar.setText((CharSequence) obj);
                gVar.d();
                gVar.k(true);
                lh.e eVar = xcVar.V;
                AndroidUtilities.cancelRunOnUIThread(eVar);
                eVar.run();
                break;
        }
    }
}
