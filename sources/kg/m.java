package kg;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import ki.o2;
import ki.x2;
import ki.x3;
import m.r3;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.h2;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
                x2 x2Var = (x2) obj;
                h2 h2Var = x2Var.o0;
                o2 o2Var = x2Var.x;
                o2Var.setSwipeOffsetY(o2Var.getHeight());
                x2Var.f.setAlpha(1.0f);
                if (x2Var.I0 != Float.MAX_VALUE) {
                    o2Var.setSwipeOffsetAnimationDisallowed(true);
                    o2Var.setOffsetY(x2Var.I0);
                    o2Var.setSwipeOffsetAnimationDisallowed(false);
                }
                x2Var.E.n(true, true);
                h2.f fVar = new h2.f((int[]) null);
                fVar.d();
                if (x2Var.H0 || x2Var.r()) {
                    o2Var.f(o2Var.getTopActionBarOffsetY() + (-o2Var.getOffsetY()), false, new j1(fVar, 10));
                } else {
                    r1.g gVar = new r1.g((Object) o2Var, (r1.e) x3.c0, 0.0f);
                    r1.h hVar = new r1.h(0.0f);
                    hVar.a(0.75f);
                    hVar.b(500.0f);
                    gVar.m = hVar;
                    gVar.a(new wi.c(fVar, 2));
                    gVar.h();
                }
                o2Var.L = true;
                if (x2Var.f0 && h2Var != null) {
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
