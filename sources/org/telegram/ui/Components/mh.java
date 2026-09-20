package org.telegram.ui.Components;

import android.view.KeyEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class mh implements Utilities.Callback4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;

    public /* synthetic */ mh(KeyEvent.Callback callback, int i10) {
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
                ci.g gVar = ldVar.f;
                gVar.setText((CharSequence) obj);
                gVar.d();
                gVar.k(true);
                ci.e eVar = ldVar.c0;
                AndroidUtilities.cancelRunOnUIThread(eVar);
                eVar.run();
                break;
        }
    }
}
