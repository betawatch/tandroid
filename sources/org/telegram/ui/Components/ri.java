package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ri extends i51 {
    public final /* synthetic */ vi b3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ri(vi viVar, Context context, int i9, d dVar, oi oiVar, oi oiVar2, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, i9, 0, false, dVar, oiVar, oiVar2, b6Var);
        this.b3 = viVar;
    }

    @Override // org.telegram.ui.Components.i51
    public final void C1() {
        vi viVar = this.b3;
        viVar.b.X1(viVar, 0);
    }

    @Override // org.telegram.ui.Components.wk0
    public final boolean E0(float f10) {
        ki kiVar = this.b3.b;
        return f10 >= ((float) ((AndroidUtilities.dp(30.0f) + kiVar.X1[0]) + (!kiVar.c0 ? AndroidUtilities.statusBarHeight : 0)));
    }

    @Override // org.telegram.ui.Components.wk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        vi viVar = this.b3;
        viVar.b.X1(viVar, 0);
    }
}
