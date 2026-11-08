package hi;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import fi.h9;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final class l2 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l2(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        int i17 = this.a;
        Object obj = this.b;
        switch (i17) {
            case 0:
                view.removeOnLayoutChangeListener(this);
                a3 a3Var = (a3) obj;
                org.telegram.messenger.h2 h2Var = a3Var.n0;
                r2 r2Var = a3Var.x;
                r2Var.setSwipeOffsetY(r2Var.getHeight());
                a3Var.f.setAlpha(1.0f);
                if (a3Var.H0 != Float.MAX_VALUE) {
                    r2Var.setSwipeOffsetAnimationDisallowed(true);
                    r2Var.setOffsetY(a3Var.H0);
                    r2Var.setSwipeOffsetAnimationDisallowed(false);
                }
                a3Var.D.n(true, true);
                h2.f fVar = new h2.f((int[]) null);
                fVar.d();
                if (a3Var.G0 || a3Var.r()) {
                    r2Var.f(r2Var.getTopActionBarOffsetY() + (-r2Var.getOffsetY()), false, new h9(fVar, 19));
                } else {
                    r1.g gVar = new r1.g((Object) r2Var, (r1.e) b4.b0, 0.0f);
                    r1.h hVar = new r1.h(0.0f);
                    hVar.a(0.75f);
                    hVar.b(500.0f);
                    gVar.m = hVar;
                    gVar.a(new ti.c(fVar, 2));
                    gVar.h();
                }
                r2Var.K = true;
                if (a3Var.e0 && h2Var != null) {
                    h2Var.setAlpha(0.0f);
                    h2Var.animate().alpha(1.0f).setDuration(220L).start();
                    break;
                }
                break;
            case 1:
                kg.m.g0((kg.m) obj);
                break;
            default:
                SearchView searchView = (SearchView) obj;
                SearchView.SearchAutoComplete searchAutoComplete = searchView.F;
                View view2 = searchView.N;
                if (view2.getWidth() > 1) {
                    Resources resources = searchView.getContext().getResources();
                    int paddingLeft = searchView.H.getPaddingLeft();
                    Rect rect = new Rect();
                    boolean a10 = m.t3.a(searchView);
                    int dimensionPixelSize = searchView.f0 ? resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left) : 0;
                    searchAutoComplete.getDropDownBackground().getPadding(rect);
                    searchAutoComplete.setDropDownHorizontalOffset(a10 ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
                    searchAutoComplete.setDropDownWidth((((view2.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
                    break;
                }
                break;
        }
    }
}
