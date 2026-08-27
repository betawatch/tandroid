package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ni extends k51 {
    public final /* synthetic */ ri b3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ni(ri riVar, Context context, int i10, d dVar, ki kiVar, ki kiVar2, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, i10, 0, false, dVar, kiVar, kiVar2, c6Var);
        this.b3 = riVar;
    }

    @Override // org.telegram.ui.Components.k51
    public final void C1() {
        ri riVar = this.b3;
        riVar.b.X1(riVar, 0);
    }

    @Override // org.telegram.ui.Components.zk0
    public final boolean E0(float f10) {
        gi giVar = this.b3.b;
        return f10 >= ((float) ((AndroidUtilities.dp(30.0f) + giVar.X1[0]) + (!giVar.c0 ? AndroidUtilities.statusBarHeight : 0)));
    }

    @Override // org.telegram.ui.Components.zk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        ri riVar = this.b3;
        riVar.b.X1(riVar, 0);
    }
}
