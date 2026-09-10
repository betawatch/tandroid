package bi;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class db extends ob {
    public final /* synthetic */ kb L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public db(kb kbVar, Context context, org.telegram.ui.ActionBar.f6 f6Var, sa saVar) {
        super(context, f6Var, saVar);
        this.L = kbVar;
    }

    @Override // bi.ob
    public final void setContainerHeight(float f7) {
        super.setContainerHeight(f7);
        kb kbVar = this.L;
        kbVar.y.setTranslationY((Math.min(AndroidUtilities.dp(150.0f), this.I) + (getY() - (kbVar.e == null ? 0 : r2.getPaddingTop()))) - 1.0f);
        FrameLayout frameLayout = kbVar.e;
        if (frameLayout != null) {
            frameLayout.invalidate();
        }
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        kb kbVar = this.L;
        kbVar.y.setTranslationY((Math.min(AndroidUtilities.dp(150.0f), this.I) + (getY() - (kbVar.e == null ? 0 : r2.getPaddingTop()))) - 1.0f);
        FrameLayout frameLayout = kbVar.e;
        if (frameLayout != null) {
            frameLayout.invalidate();
        }
    }
}
