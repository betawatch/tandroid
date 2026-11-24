// default package

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class aw0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ aw0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        byte b = this.a;
        Object[] objArr = 0;
        byte b2 = 1;
        Object obj = this.b;
        switch (b) {
            case 0:
                view.removeOnLayoutChangeListener(this);
                ow0 ow0Var = (ow0) obj;
                yp0 yp0Var = ow0Var.o0;
                fw0 fw0Var = ow0Var.x;
                fw0Var.setSwipeOffsetY(fw0Var.getHeight());
                ow0Var.f.setAlpha(1.0f);
                if (ow0Var.I0 != Float.MAX_VALUE) {
                    fw0Var.setSwipeOffsetAnimationDisallowed(true);
                    fw0Var.setOffsetY(ow0Var.I0);
                    fw0Var.setSwipeOffsetAnimationDisallowed(false);
                }
                ow0Var.E.l(true, true);
                on onVar = new on(null);
                onVar.d();
                if (ow0Var.H0 || ow0Var.p()) {
                    fw0Var.e(fw0Var.getTopActionBarOffsetY() + (-fw0Var.getOffsetY()), false, new nv0(onVar, b2));
                } else {
                    yla ylaVar = new yla((Object) fw0Var, (ri4) r12.c0, 0.0f);
                    zla zlaVar = new zla(0.0f);
                    zlaVar.a(0.75f);
                    zlaVar.b(500.0f);
                    ylaVar.m = zlaVar;
                    ylaVar.a(new zv0(onVar, objArr == true ? 1 : 0));
                    ylaVar.h();
                }
                fw0Var.L = true;
                if (ow0Var.f0 && yp0Var != null) {
                    yp0Var.setAlpha(0.0f);
                    yp0Var.animate().alpha(1.0f).setDuration(220L).start();
                    break;
                }
                break;
            case 1:
                ((y31) obj).l0();
                break;
            default:
                SearchView searchView = (SearchView) obj;
                SearchView.SearchAutoComplete searchAutoComplete = searchView.G;
                View view2 = searchView.O;
                if (view2.getWidth() > 1) {
                    Resources resources = searchView.getContext().getResources();
                    int paddingLeft = searchView.I.getPaddingLeft();
                    Rect rect = new Rect();
                    boolean a = gfc.a(searchView);
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
