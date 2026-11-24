// default package

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class o7b extends x7b {
    public final /* synthetic */ v7b N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o7b(v7b v7bVar, Context context, ylb ylbVar, m7b m7bVar) {
        super(context, ylbVar, m7bVar);
        this.N = v7bVar;
    }

    @Override // x7b
    public final void setContainerHeight(float f) {
        super.setContainerHeight(f);
        v7b v7bVar = this.N;
        l55 l55Var = v7bVar.E;
        float y = getY();
        FrameLayout frameLayout = v7bVar.e;
        l55Var.setTranslationY((Math.min(gm.L(150.0f), this.K) + (y - (frameLayout == null ? 0 : frameLayout.getPaddingTop()))) - 1.0f);
        if (frameLayout != null) {
            frameLayout.invalidate();
        }
    }

    @Override // android.view.View
    public final void setTranslationY(float f) {
        super.setTranslationY(f);
        v7b v7bVar = this.N;
        l55 l55Var = v7bVar.E;
        float y = getY();
        FrameLayout frameLayout = v7bVar.e;
        l55Var.setTranslationY((Math.min(gm.L(150.0f), this.K) + (y - (frameLayout == null ? 0 : frameLayout.getPaddingTop()))) - 1.0f);
        if (frameLayout != null) {
            frameLayout.invalidate();
        }
    }
}
