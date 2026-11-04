package ii;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import gi.f6;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class l2 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l2(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i3, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        int i17 = this.a;
        Object obj = this.b;
        switch (i17) {
            case 0:
                view.removeOnLayoutChangeListener(this);
                a3 a3Var = (a3) obj;
                org.telegram.messenger.h2 h2Var = a3Var.o0;
                r2 r2Var = a3Var.x;
                r2Var.setSwipeOffsetY(r2Var.getHeight());
                a3Var.f.setAlpha(1.0f);
                if (a3Var.I0 != Float.MAX_VALUE) {
                    r2Var.setSwipeOffsetAnimationDisallowed(true);
                    r2Var.setOffsetY(a3Var.I0);
                    r2Var.setSwipeOffsetAnimationDisallowed(false);
                }
                a3Var.E.n(true, true);
                final g2.g gVar = new g2.g((int[]) null);
                gVar.d();
                if (a3Var.H0 || a3Var.r()) {
                    r2Var.f(r2Var.getTopActionBarOffsetY() + (-r2Var.getOffsetY()), false, new f6(gVar, 22));
                } else {
                    q1.g gVar2 = new q1.g((Object) r2Var, (q1.e) c4.c0, 0.0f);
                    q1.h hVar = new q1.h(0.0f);
                    hVar.a(0.75f);
                    hVar.b(500.0f);
                    gVar2.m = hVar;
                    gVar2.a(new q1.c() { // from class: ii.k2
                        @Override // q1.c
                        public final void a(q1.g gVar3, boolean z10, float f10, float f11) {
                            g2.g.this.e();
                        }
                    });
                    gVar2.h();
                }
                r2Var.L = true;
                if (a3Var.f0 && h2Var != null) {
                    h2Var.setAlpha(0.0f);
                    h2Var.animate().alpha(1.0f).setDuration(220L).start();
                    break;
                }
                break;
            case 1:
                lg.m.g0((lg.m) obj);
                break;
            default:
                SearchView searchView = (SearchView) obj;
                SearchView.SearchAutoComplete searchAutoComplete = searchView.G;
                View view2 = searchView.O;
                if (view2.getWidth() > 1) {
                    Resources resources = searchView.getContext().getResources();
                    int paddingLeft = searchView.I.getPaddingLeft();
                    Rect rect = new Rect();
                    boolean a10 = m.r3.a(searchView);
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
