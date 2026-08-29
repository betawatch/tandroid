package org.telegram.ui.Components;

import android.view.KeyEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fh implements Utilities.Callback4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;

    public /* synthetic */ fh(KeyEvent.Callback callback, int i10) {
        this.a = i10;
        this.b = callback;
    }

    @Override // org.telegram.messenger.Utilities.Callback4
    public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.a) {
            case 0:
                ni niVar = (ni) this.b;
                CharSequence charSequence = (CharSequence) obj;
                th thVar = niVar.A0;
                thVar.setText(charSequence);
                thVar.w(charSequence.length(), charSequence.length());
                niVar.z1();
                break;
            case 1:
                ni niVar2 = (ni) this.b;
                CharSequence charSequence2 = (CharSequence) obj;
                wh whVar = niVar2.L0;
                whVar.setText(charSequence2);
                whVar.w(charSequence2.length(), charSequence2.length());
                niVar2.z1();
                break;
            default:
                ed edVar = (ed) this.b;
                nh.g gVar = edVar.f;
                gVar.setText((CharSequence) obj);
                gVar.d();
                gVar.k(true);
                nh.e eVar = edVar.V;
                AndroidUtilities.cancelRunOnUIThread(eVar);
                eVar.run();
                break;
        }
    }
}
