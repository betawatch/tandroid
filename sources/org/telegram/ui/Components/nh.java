package org.telegram.ui.Components;

import android.view.KeyEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
                ai aiVar = viVar.E0;
                aiVar.setText(charSequence);
                aiVar.w(charSequence.length(), charSequence.length());
                viVar.z1();
                break;
            case 1:
                vi viVar2 = (vi) this.b;
                CharSequence charSequence2 = (CharSequence) obj;
                di diVar = viVar2.P0;
                diVar.setText(charSequence2);
                diVar.w(charSequence2.length(), charSequence2.length());
                viVar2.z1();
                break;
            default:
                ld ldVar = (ld) this.b;
                di.g gVar = ldVar.f;
                gVar.setText((CharSequence) obj);
                gVar.d();
                gVar.k(true);
                di.e eVar = ldVar.c0;
                AndroidUtilities.cancelRunOnUIThread(eVar);
                eVar.run();
                break;
        }
    }
}
