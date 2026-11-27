// default package

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class fv extends HorizontalScrollView {
    public final /* synthetic */ xi5 a;
    public final /* synthetic */ hv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fv(hv hvVar, Activity activity, xi5 xi5Var) {
        super(activity);
        this.b = hvVar;
        this.a = xi5Var;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        hv hvVar;
        TL_iv.pageBlockPreformatted pageblockpreformatted;
        super.onScrollChanged(i, i2, i3, i4);
        xi5 xi5Var = this.a;
        if (xi5Var.d != null) {
            xi5Var.d = null;
            xi5Var.f = null;
        }
        hv hvVar2 = this.b;
        TL_iv.pageBlockPreformatted pageblockpreformatted2 = hvVar2.f;
        if (pageblockpreformatted2 == null || !pageblockpreformatted2.diff || hvVar2.n) {
            return;
        }
        ex exVar = hvVar2.b;
        if (exVar != null) {
            exVar.I = i;
        }
        if (hvVar2.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) hvVar2.getParent();
            for (int i5 = 0; i5 < viewGroup.getChildCount(); i5++) {
                View childAt = viewGroup.getChildAt(i5);
                if (childAt != hvVar2 && (childAt instanceof hv) && (pageblockpreformatted = (hvVar = (hv) childAt).f) != null && pageblockpreformatted.diff) {
                    hvVar.n = true;
                    hvVar.d.scrollTo(i, 0);
                    hvVar.n = false;
                }
            }
        }
    }
}
