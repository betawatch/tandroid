package org.telegram.ui.Components;

import android.view.KeyEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ch implements Utilities.Callback4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;

    public /* synthetic */ ch(KeyEvent.Callback callback, int i10) {
        this.a = i10;
        this.b = callback;
    }

    @Override // org.telegram.messenger.Utilities.Callback4
    public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.a) {
            case 0:
                mi miVar = (mi) this.b;
                CharSequence charSequence = (CharSequence) obj;
                qh qhVar = miVar.B0;
                qhVar.setText(charSequence);
                qhVar.w(charSequence.length(), charSequence.length());
                miVar.z1();
                break;
            case 1:
                mi miVar2 = (mi) this.b;
                CharSequence charSequence2 = (CharSequence) obj;
                th thVar = miVar2.M0;
                thVar.setText(charSequence2);
                thVar.w(charSequence2.length(), charSequence2.length());
                miVar2.z1();
                break;
            default:
                bd bdVar = (bd) this.b;
                qh.f fVar = bdVar.f;
                fVar.setText((CharSequence) obj);
                fVar.d();
                fVar.k(true);
                qh.e eVar = bdVar.W;
                AndroidUtilities.cancelRunOnUIThread(eVar);
                eVar.run();
                break;
        }
    }
}
