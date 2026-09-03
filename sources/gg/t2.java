package gg;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class t2 extends f2.z0 {
    public final /* synthetic */ v2 a;

    public t2(v2 v2Var) {
        this.a = v2Var;
    }

    @Override // f2.z0
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            AndroidUtilities.hideKeyboard(this.a.W.getEditText());
        }
    }
}
