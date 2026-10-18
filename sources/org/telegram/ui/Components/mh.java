package org.telegram.ui.Components;

import android.view.KeyEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
                ti tiVar = (ti) this.b;
                CharSequence charSequence = (CharSequence) obj;
                zh zhVar = tiVar.H0;
                zhVar.setText(charSequence);
                zhVar.w(charSequence.length(), charSequence.length());
                tiVar.C1();
                break;
            case 1:
                ti tiVar2 = (ti) this.b;
                CharSequence charSequence2 = (CharSequence) obj;
                ci ciVar = tiVar2.S0;
                ciVar.setText(charSequence2);
                ciVar.w(charSequence2.length(), charSequence2.length());
                tiVar2.C1();
                break;
            default:
                kd kdVar = (kd) this.b;
                ei.g gVar = kdVar.f;
                gVar.setText((CharSequence) obj);
                gVar.d();
                gVar.k(true);
                ei.e eVar = kdVar.c0;
                AndroidUtilities.cancelRunOnUIThread(eVar);
                eVar.run();
                break;
        }
    }
}
