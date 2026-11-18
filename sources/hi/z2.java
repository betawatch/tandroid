package hi;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.Components.mp;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class z2 extends mp {
    public final /* synthetic */ int d;
    public final /* synthetic */ ViewGroup e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z2(ViewGroup viewGroup, Context context, org.telegram.ui.ActionBar.i6 i6Var, int i7) {
        super(21, context, i6Var);
        this.d = i7;
        this.e = viewGroup;
    }

    @Override // android.view.View
    public final void invalidate() {
        switch (this.d) {
            case 0:
                super.invalidate();
                ((a3) this.e).invalidate();
                break;
            case 1:
                super.invalidate();
                ((org.telegram.ui.Cells.u2) this.e).invalidate();
                break;
            default:
                super.invalidate();
                ((org.telegram.ui.web.h) this.e).invalidate();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(a3 a3Var, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(24, context, i6Var);
        this.d = 0;
        this.e = a3Var;
    }
}
