// default package

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class ev extends HorizontalScrollView {
    public final /* synthetic */ vg5 a;
    public final /* synthetic */ gv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ev(gv gvVar, Activity activity, vg5 vg5Var) {
        super(activity);
        this.b = gvVar;
        this.a = vg5Var;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        gv gvVar;
        TL_iv.pageBlockPreformatted pageblockpreformatted;
        super.onScrollChanged(i, i2, i3, i4);
        vg5 vg5Var = this.a;
        if (vg5Var.d != null) {
            vg5Var.d = null;
            vg5Var.f = null;
        }
        gv gvVar2 = this.b;
        TL_iv.pageBlockPreformatted pageblockpreformatted2 = gvVar2.f;
        if (pageblockpreformatted2 == null || !pageblockpreformatted2.diff || gvVar2.n) {
            return;
        }
        dx dxVar = gvVar2.b;
        if (dxVar != null) {
            dxVar.I = i;
        }
        if (gvVar2.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) gvVar2.getParent();
            for (int i5 = 0; i5 < viewGroup.getChildCount(); i5++) {
                View childAt = viewGroup.getChildAt(i5);
                if (childAt != gvVar2 && (childAt instanceof gv) && (pageblockpreformatted = (gvVar = (gv) childAt).f) != null && pageblockpreformatted.diff) {
                    gvVar.n = true;
                    gvVar.d.scrollTo(i, 0);
                    gvVar.n = false;
                }
            }
        }
    }
}
