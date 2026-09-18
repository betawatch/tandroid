package ci;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.Components.np;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes4.dex */
public final class q3 extends np {
    public final /* synthetic */ int d;
    public final /* synthetic */ ViewGroup e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q3(ViewGroup viewGroup, Context context, org.telegram.ui.ActionBar.e6 e6Var, int i10) {
        super(context, 21, e6Var);
        this.d = i10;
        this.e = viewGroup;
    }

    @Override // android.view.View
    public final void invalidate() {
        switch (this.d) {
            case 0:
                super.invalidate();
                ((s3) this.e).invalidate();
                break;
            case 1:
                super.invalidate();
                ((org.telegram.ui.Cells.s2) this.e).invalidate();
                break;
            default:
                super.invalidate();
                ((org.telegram.ui.web.h) this.e).invalidate();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(s3 s3Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, 24, e6Var);
        this.d = 0;
        this.e = s3Var;
    }
}
