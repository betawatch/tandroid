// default package

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class jw0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jw0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        byte b = this.a;
        Object[] objArr = 0;
        Object obj = this.b;
        switch (b) {
            case 0:
                view.removeOnLayoutChangeListener(this);
                xw0 xw0Var = (xw0) obj;
                yp0 yp0Var = xw0Var.o0;
                ow0 ow0Var = xw0Var.x;
                ow0Var.setSwipeOffsetY(ow0Var.getHeight());
                xw0Var.f.setAlpha(1.0f);
                if (xw0Var.I0 != Float.MAX_VALUE) {
                    ow0Var.setSwipeOffsetAnimationDisallowed(true);
                    ow0Var.setOffsetY(xw0Var.I0);
                    ow0Var.setSwipeOffsetAnimationDisallowed(false);
                }
                xw0Var.E.l(true, true);
                pn pnVar = new pn(null);
                pnVar.d();
                if (xw0Var.H0 || xw0Var.p()) {
                    ow0Var.e(ow0Var.getTopActionBarOffsetY() + (-ow0Var.getOffsetY()), false, new fv0(pnVar, (byte) 3));
                } else {
                    vpa vpaVar = new vpa((Object) ow0Var, (vk4) i22.c0, 0.0f);
                    wpa wpaVar = new wpa(0.0f);
                    wpaVar.a(0.75f);
                    wpaVar.b(500.0f);
                    vpaVar.m = wpaVar;
                    vpaVar.a(new iw0(pnVar, objArr == true ? 1 : 0));
                    vpaVar.h();
                }
                ow0Var.L = true;
                if (xw0Var.f0 && yp0Var != null) {
                    yp0Var.setAlpha(0.0f);
                    yp0Var.animate().alpha(1.0f).setDuration(220L).start();
                    break;
                }
                break;
            case 1:
                ((g41) obj).l0();
                break;
            default:
                SearchView searchView = (SearchView) obj;
                SearchView.SearchAutoComplete searchAutoComplete = searchView.G;
                View view2 = searchView.O;
                if (view2.getWidth() > 1) {
                    Resources resources = searchView.getContext().getResources();
                    int paddingLeft = searchView.I.getPaddingLeft();
                    Rect rect = new Rect();
                    boolean a = fjc.a(searchView);
                    int dimensionPixelSize = searchView.g0 ? resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left) : 0;
                    searchAutoComplete.getDropDownBackground().getPadding(rect);
                    int i9 = rect.left;
                    searchAutoComplete.setDropDownHorizontalOffset(a ? -i9 : paddingLeft - (i9 + dimensionPixelSize));
                    searchAutoComplete.setDropDownWidth((((view2.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
                    break;
                }
                break;
        }
    }
}
