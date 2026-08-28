package dg;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.b9;
import org.telegram.ui.Components.fq;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class h0 extends b9 {
    public final b6 v;

    public h0(Context context, b6 b6Var) {
        super(context, b6Var);
        this.v = b6Var;
    }

    public void setBackground(boolean z10) {
        Context context = getContext();
        int i9 = z10 ? R.drawable.greydivider_bottom : R.drawable.greydivider;
        int i10 = f6.b7;
        b6 b6Var = this.v;
        fq fqVar = new fq(new ColorDrawable(f6.v0(f6.a7, b6Var)), f6.U0(context, i9, f6.v0(i10, b6Var)), 0, 0);
        fqVar.w = true;
        setBackground(fqVar);
    }
}
