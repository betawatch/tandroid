package org.telegram.ui.Components;

import android.view.KeyEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
                li liVar = (li) this.b;
                CharSequence charSequence = (CharSequence) obj;
                qh qhVar = liVar.B0;
                qhVar.setText(charSequence);
                qhVar.w(charSequence.length(), charSequence.length());
                liVar.z1();
                break;
            case 1:
                li liVar2 = (li) this.b;
                CharSequence charSequence2 = (CharSequence) obj;
                th thVar = liVar2.M0;
                thVar.setText(charSequence2);
                thVar.w(charSequence2.length(), charSequence2.length());
                liVar2.z1();
                break;
            default:
                bd bdVar = (bd) this.b;
                ph.f fVar = bdVar.f;
                fVar.setText((CharSequence) obj);
                fVar.d();
                fVar.k(true);
                ph.e eVar = bdVar.W;
                AndroidUtilities.cancelRunOnUIThread(eVar);
                eVar.run();
                break;
        }
    }
}
