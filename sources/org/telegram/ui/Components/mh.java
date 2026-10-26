package org.telegram.ui.Components;

import android.view.KeyEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
                wh whVar = tiVar.H0;
                whVar.setText(charSequence);
                whVar.w(charSequence.length(), charSequence.length());
                tiVar.E1();
                break;
            case 1:
                ti tiVar2 = (ti) this.b;
                CharSequence charSequence2 = (CharSequence) obj;
                yh yhVar = tiVar2.S0;
                yhVar.setText(charSequence2);
                yhVar.w(charSequence2.length(), charSequence2.length());
                tiVar2.E1();
                break;
            default:
                jd jdVar = (jd) this.b;
                fi.g gVar = jdVar.f;
                gVar.setText((CharSequence) obj);
                gVar.d();
                gVar.k(true);
                fi.e eVar = jdVar.c0;
                AndroidUtilities.cancelRunOnUIThread(eVar);
                eVar.run();
                break;
        }
    }
}
