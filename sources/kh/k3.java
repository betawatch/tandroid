package kh;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.Components.dp;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class k3 extends dp {
    public final /* synthetic */ int d;
    public final /* synthetic */ ViewGroup e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k3(ViewGroup viewGroup, Context context, org.telegram.ui.ActionBar.b6 b6Var, int i9) {
        super(context, 21, b6Var);
        this.d = i9;
        this.e = viewGroup;
    }

    @Override // android.view.View
    public final void invalidate() {
        switch (this.d) {
            case 0:
                super.invalidate();
                ((m3) this.e).invalidate();
                break;
            case 1:
                super.invalidate();
                ((org.telegram.ui.Cells.r2) this.e).invalidate();
                break;
            default:
                super.invalidate();
                ((org.telegram.ui.web.h) this.e).invalidate();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(m3 m3Var, Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, 24, b6Var);
        this.d = 0;
        this.e = m3Var;
    }
}
