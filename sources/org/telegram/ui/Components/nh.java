package org.telegram.ui.Components;

import android.view.KeyEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
                vi viVar = (vi) this.b;
                CharSequence charSequence = (CharSequence) obj;
                ai aiVar = viVar.H0;
                aiVar.setText(charSequence);
                aiVar.w(charSequence.length(), charSequence.length());
                viVar.C1();
                break;
            case 1:
                vi viVar2 = (vi) this.b;
                CharSequence charSequence2 = (CharSequence) obj;
                di diVar = viVar2.S0;
                diVar.setText(charSequence2);
                diVar.w(charSequence2.length(), charSequence2.length());
                viVar2.C1();
                break;
            default:
                md mdVar = (md) this.b;
                di.g gVar = mdVar.f;
                gVar.setText((CharSequence) obj);
                gVar.d();
                gVar.k(true);
                di.e eVar = mdVar.c0;
                AndroidUtilities.cancelRunOnUIThread(eVar);
                eVar.run();
                break;
        }
    }
}
