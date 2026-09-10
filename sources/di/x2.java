package di;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import bi.wc;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.BotFullscreenButtons;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class x2 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x2(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        int i18 = this.a;
        Object obj = this.b;
        switch (i18) {
            case 0:
                view.removeOnLayoutChangeListener(this);
                n3 n3Var = (n3) obj;
                BotFullscreenButtons botFullscreenButtons = n3Var.m0;
                d3 d3Var = n3Var.v;
                d3Var.setSwipeOffsetY(d3Var.getHeight());
                n3Var.e.setAlpha(1.0f);
                if (n3Var.G0 != Float.MAX_VALUE) {
                    d3Var.setSwipeOffsetAnimationDisallowed(true);
                    d3Var.setOffsetY(n3Var.G0);
                    d3Var.setSwipeOffsetAnimationDisallowed(false);
                }
                n3Var.x.o(true, true);
                final AnimationNotificationsLocker animationNotificationsLocker = new AnimationNotificationsLocker();
                animationNotificationsLocker.lock();
                if (n3Var.F0 || n3Var.m()) {
                    d3Var.f(d3Var.getTopActionBarOffsetY() + (-d3Var.getOffsetY()), false, new wc(animationNotificationsLocker, 20));
                } else {
                    o1.k kVar = new o1.k(d3Var, t4.b0, 0.0f);
                    o1.l lVar = new o1.l(0.0f);
                    lVar.a(0.75f);
                    lVar.b(500.0f);
                    kVar.u = lVar;
                    kVar.a(new o1.f() { // from class: di.w2
                        @Override // o1.f
                        public final void a(o1.h hVar, boolean z10, float f7, float f10) {
                            AnimationNotificationsLocker.this.unlock();
                        }
                    });
                    kVar.f();
                }
                d3Var.K = true;
                if (n3Var.d0 && botFullscreenButtons != null) {
                    botFullscreenButtons.setAlpha(0.0f);
                    botFullscreenButtons.animate().alpha(1.0f).setDuration(220L).start();
                    break;
                }
                break;
            case 1:
                gg.n.b0((gg.n) obj);
                break;
            default:
                SearchView searchView = (SearchView) obj;
                SearchView.SearchAutoComplete searchAutoComplete = searchView.F;
                View view2 = searchView.N;
                if (view2.getWidth() > 1) {
                    Resources resources = searchView.getContext().getResources();
                    int paddingLeft = searchView.H.getPaddingLeft();
                    Rect rect = new Rect();
                    boolean a2 = m.u3.a(searchView);
                    int dimensionPixelSize = searchView.f0 ? resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left) : 0;
                    searchAutoComplete.getDropDownBackground().getPadding(rect);
                    searchAutoComplete.setDropDownHorizontalOffset(a2 ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
                    searchAutoComplete.setDropDownWidth((((view2.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
                    break;
                }
                break;
        }
    }
}
