package kg;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import ki.k2;
import ki.s3;
import ki.t2;
import m.r3;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.h2;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class m implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        int i17 = this.a;
        Object obj = this.b;
        switch (i17) {
            case 0:
                n.g0((n) obj);
                break;
            case 1:
                view.removeOnLayoutChangeListener(this);
                t2 t2Var = (t2) obj;
                h2 h2Var = t2Var.o0;
                k2 k2Var = t2Var.x;
                k2Var.setSwipeOffsetY(k2Var.getHeight());
                t2Var.f.setAlpha(1.0f);
                if (t2Var.I0 != Float.MAX_VALUE) {
                    k2Var.setSwipeOffsetAnimationDisallowed(true);
                    k2Var.setOffsetY(t2Var.I0);
                    k2Var.setSwipeOffsetAnimationDisallowed(false);
                }
                t2Var.E.n(true, true);
                h2.f fVar = new h2.f((int[]) null);
                fVar.d();
                if (t2Var.H0 || t2Var.r()) {
                    k2Var.f(k2Var.getTopActionBarOffsetY() + (-k2Var.getOffsetY()), false, new j0(fVar, 14));
                } else {
                    r1.g gVar = new r1.g((Object) k2Var, (r1.e) s3.c0, 0.0f);
                    r1.h hVar = new r1.h(0.0f);
                    hVar.a(0.75f);
                    hVar.b(500.0f);
                    gVar.m = hVar;
                    gVar.a(new wi.c(fVar, 2));
                    gVar.h();
                }
                k2Var.L = true;
                if (t2Var.f0 && h2Var != null) {
                    h2Var.setAlpha(0.0f);
                    h2Var.animate().alpha(1.0f).setDuration(220L).start();
                    break;
                }
                break;
            default:
                SearchView searchView = (SearchView) obj;
                SearchView.SearchAutoComplete searchAutoComplete = searchView.G;
                View view2 = searchView.O;
                if (view2.getWidth() > 1) {
                    Resources resources = searchView.getContext().getResources();
                    int paddingLeft = searchView.I.getPaddingLeft();
                    Rect rect = new Rect();
                    boolean a10 = r3.a(searchView);
                    int dimensionPixelSize = searchView.g0 ? resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left) : 0;
                    searchAutoComplete.getDropDownBackground().getPadding(rect);
                    searchAutoComplete.setDropDownHorizontalOffset(a10 ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
                    searchAutoComplete.setDropDownWidth((((view2.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
                    break;
                }
                break;
        }
    }
}
