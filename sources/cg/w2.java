package cg;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class w2 extends f2.b1 {
    public final /* synthetic */ y2 a;

    public w2(y2 y2Var) {
        this.a = y2Var;
    }

    @Override // f2.b1
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            AndroidUtilities.hideKeyboard(this.a.V.getEditText());
        }
    }
}
