// default package

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class l9b extends t9b {
    public final /* synthetic */ r9b N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l9b(r9b r9bVar, Context context, vnb vnbVar, i9b i9bVar) {
        super(context, vnbVar, i9bVar);
        this.N = r9bVar;
    }

    @Override // t9b
    public final void setContainerHeight(float f) {
        super.setContainerHeight(f);
        r9b r9bVar = this.N;
        p55 p55Var = r9bVar.E;
        float y = getY();
        FrameLayout frameLayout = r9bVar.e;
        p55Var.setTranslationY((Math.min(hl.L(150.0f), this.K) + (y - (frameLayout == null ? 0 : frameLayout.getPaddingTop()))) - 1.0f);
        if (frameLayout != null) {
            frameLayout.invalidate();
        }
    }

    @Override // android.view.View
    public final void setTranslationY(float f) {
        super.setTranslationY(f);
        r9b r9bVar = this.N;
        p55 p55Var = r9bVar.E;
        float y = getY();
        FrameLayout frameLayout = r9bVar.e;
        p55Var.setTranslationY((Math.min(hl.L(150.0f), this.K) + (y - (frameLayout == null ? 0 : frameLayout.getPaddingTop()))) - 1.0f);
        if (frameLayout != null) {
            frameLayout.invalidate();
        }
    }
}
