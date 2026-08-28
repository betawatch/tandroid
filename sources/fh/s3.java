package fh;

import android.content.Context;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.vq0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class s3 extends i51 {
    public final /* synthetic */ vq0 b3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3(Context context, int i9, bh.c cVar, q3 q3Var, q3 q3Var2, org.telegram.ui.ActionBar.b6 b6Var, vq0 vq0Var) {
        super(context, i9, 0, false, cVar, q3Var, q3Var2, b6Var, 3, 1);
        this.b3 = vq0Var;
    }

    @Override // org.telegram.ui.Components.wk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        this.b3.o();
    }
}
