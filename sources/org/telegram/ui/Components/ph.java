package org.telegram.ui.Components;

import android.view.KeyEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
                di diVar = yiVar.E0;
                diVar.setText(charSequence);
                diVar.w(charSequence.length(), charSequence.length());
                yiVar.z1();
                break;
            case 1:
                yi yiVar2 = (yi) this.b;
                CharSequence charSequence2 = (CharSequence) obj;
                gi giVar = yiVar2.P0;
                giVar.setText(charSequence2);
                giVar.w(charSequence2.length(), charSequence2.length());
                yiVar2.z1();
                break;
            default:
                jd jdVar = (jd) this.b;
                bi.i iVar = jdVar.f;
                iVar.setText((CharSequence) obj);
                iVar.d();
                iVar.k(true);
                bi.e eVar = jdVar.c0;
                AndroidUtilities.cancelRunOnUIThread(eVar);
                eVar.run();
                break;
        }
    }
}
