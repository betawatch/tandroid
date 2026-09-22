package ci;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final class u9 extends fa {
    public final /* synthetic */ ba L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u9(ba baVar, Context context, org.telegram.ui.ActionBar.f6 f6Var, p9 p9Var) {
        super(context, f6Var, p9Var);
        this.L = baVar;
    }

    @Override // ci.fa
    public final void setContainerHeight(float f7) {
        super.setContainerHeight(f7);
        ba baVar = this.L;
        baVar.y.setTranslationY((Math.min(AndroidUtilities.dp(150.0f), this.I) + (getY() - (baVar.e == null ? 0 : r2.getPaddingTop()))) - 1.0f);
        FrameLayout frameLayout = baVar.e;
        if (frameLayout != null) {
            frameLayout.invalidate();
        }
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        ba baVar = this.L;
        baVar.y.setTranslationY((Math.min(AndroidUtilities.dp(150.0f), this.I) + (getY() - (baVar.e == null ? 0 : r2.getPaddingTop()))) - 1.0f);
        FrameLayout frameLayout = baVar.e;
        if (frameLayout != null) {
            frameLayout.invalidate();
        }
    }
}
