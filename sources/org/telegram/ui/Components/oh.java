package org.telegram.ui.Components;

import android.view.KeyEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class oh implements Utilities.Callback4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;

    public /* synthetic */ oh(KeyEvent.Callback callback, int i10) {
        this.a = i10;
        this.b = callback;
    }

    @Override // org.telegram.messenger.Utilities.Callback4
    public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.a) {
            case 0:
                xi xiVar = (xi) this.b;
                CharSequence charSequence = (CharSequence) obj;
                zh zhVar = xiVar.E0;
                zhVar.setText(charSequence);
                zhVar.w(charSequence.length(), charSequence.length());
                xiVar.w1();
                break;
            case 1:
                xi xiVar2 = (xi) this.b;
                CharSequence charSequence2 = (CharSequence) obj;
                bi biVar = xiVar2.P0;
                biVar.setText(charSequence2);
                biVar.w(charSequence2.length(), charSequence2.length());
                xiVar2.w1();
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
