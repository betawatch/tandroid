package org.telegram.ui.Components;

import android.view.KeyEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
                tiVar.F1();
                break;
            case 1:
                ti tiVar2 = (ti) this.b;
                CharSequence charSequence2 = (CharSequence) obj;
                ci ciVar = tiVar2.S0;
                ciVar.setText(charSequence2);
                ciVar.w(charSequence2.length(), charSequence2.length());
                tiVar2.F1();
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
