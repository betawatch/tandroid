package ci;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.Components.np;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes4.dex */
public final class q3 extends np {
    public final /* synthetic */ int d;
    public final /* synthetic */ ViewGroup e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q3(ViewGroup viewGroup, Context context, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        super(context, 21, f6Var);
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
    public q3(s3 s3Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, 24, f6Var);
        this.d = 0;
        this.e = s3Var;
    }
}
