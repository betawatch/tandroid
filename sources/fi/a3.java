package fi;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.Components.wo;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class a3 extends wo {
    public final /* synthetic */ int d;
    public final /* synthetic */ ViewGroup e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a3(ViewGroup viewGroup, Context context, org.telegram.ui.ActionBar.f6 f6Var, int i7) {
        super(21, context, f6Var);
        this.d = i7;
        this.e = viewGroup;
    }

    @Override // android.view.View
    public final void invalidate() {
        switch (this.d) {
            case 0:
                super.invalidate();
                ((b3) this.e).invalidate();
                break;
            case 1:
                super.invalidate();
                ((org.telegram.ui.Cells.t2) this.e).invalidate();
                break;
            default:
                super.invalidate();
                ((org.telegram.ui.web.g) this.e).invalidate();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(b3 b3Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(24, context, f6Var);
        this.d = 0;
        this.e = b3Var;
    }
}
