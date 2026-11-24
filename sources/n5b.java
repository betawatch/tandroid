// default package

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class n5b extends v5b {
    public final /* synthetic */ t5b N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5b(t5b t5bVar, Context context, wjb wjbVar, l5b l5bVar) {
        super(context, wjbVar, l5bVar);
        this.N = t5bVar;
    }

    @Override // v5b
    public final void setContainerHeight(float f) {
        super.setContainerHeight(f);
        t5b t5bVar = this.N;
        l35 l35Var = t5bVar.E;
        float y = getY();
        FrameLayout frameLayout = t5bVar.e;
        l35Var.setTranslationY((Math.min(gl.L(150.0f), this.K) + (y - (frameLayout == null ? 0 : frameLayout.getPaddingTop()))) - 1.0f);
        if (frameLayout != null) {
            frameLayout.invalidate();
        }
    }

    @Override // android.view.View
    public final void setTranslationY(float f) {
        super.setTranslationY(f);
        t5b t5bVar = this.N;
        l35 l35Var = t5bVar.E;
        float y = getY();
        FrameLayout frameLayout = t5bVar.e;
        l35Var.setTranslationY((Math.min(gl.L(150.0f), this.K) + (y - (frameLayout == null ? 0 : frameLayout.getPaddingTop()))) - 1.0f);
        if (frameLayout != null) {
            frameLayout.invalidate();
        }
    }
}
