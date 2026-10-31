package ag;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import m.s3;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class t implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        int i18 = this.a;
        Object obj = this.b;
        switch (i18) {
            case 0:
                w.f0((w) obj);
                break;
            case 1:
                SearchView searchView = (SearchView) obj;
                SearchView.SearchAutoComplete searchAutoComplete = searchView.F;
                View view2 = searchView.N;
                if (view2.getWidth() > 1) {
                    Resources resources = searchView.getContext().getResources();
                    int paddingLeft = searchView.H.getPaddingLeft();
                    Rect rect = new Rect();
                    boolean a2 = s3.a(searchView);
                    int dimensionPixelSize = searchView.f0 ? resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left) : 0;
                    searchAutoComplete.getDropDownBackground().getPadding(rect);
                    searchAutoComplete.setDropDownHorizontalOffset(a2 ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
                    searchAutoComplete.setDropDownWidth((((view2.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
                    break;
                }
                break;
            default:
                view.removeOnLayoutChangeListener(this);
                xh.m2 m2Var = (xh.m2) obj;
                org.telegram.messenger.l2 l2Var = m2Var.n0;
                xh.d2 d2Var = m2Var.x;
                d2Var.setSwipeOffsetY(d2Var.getHeight());
                m2Var.f.setAlpha(1.0f);
                if (m2Var.H0 != Float.MAX_VALUE) {
                    d2Var.setSwipeOffsetAnimationDisallowed(true);
                    d2Var.setOffsetY(m2Var.H0);
                    d2Var.setSwipeOffsetAnimationDisallowed(false);
                }
                m2Var.D.n(true, true);
                final e2.f fVar = new e2.f(null);
                fVar.d();
                if (m2Var.G0 || m2Var.r()) {
                    d2Var.f(d2Var.getTopActionBarOffsetY() + (-d2Var.getOffsetY()), false, new xh.d0(fVar, 6));
                } else {
                    o1.j jVar = new o1.j((Object) d2Var, (o1.h) xh.h3.b0, 0.0f);
                    o1.k kVar = new o1.k(0.0f);
                    kVar.a(0.75f);
                    kVar.b(500.0f);
                    jVar.m = kVar;
                    jVar.a(new o1.f() { // from class: xh.z1
                        @Override // o1.f
                        public final void a(o1.j jVar2, boolean z10, float f7, float f10) {
                            e2.f.this.e();
                        }
                    });
                    jVar.h();
                }
                d2Var.K = true;
                if (m2Var.e0 && l2Var != null) {
                    l2Var.setAlpha(0.0f);
                    l2Var.animate().alpha(1.0f).setDuration(220L).start();
                    break;
                }
                break;
        }
    }
}
