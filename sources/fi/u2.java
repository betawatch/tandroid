package fi;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import di.nb;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.BotFullscreenButtons;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class u2 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u2(Object obj, int i10) {
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
                k3 k3Var = (k3) obj;
                BotFullscreenButtons botFullscreenButtons = k3Var.m0;
                a3 a3Var = k3Var.v;
                a3Var.setSwipeOffsetY(a3Var.getHeight());
                k3Var.e.setAlpha(1.0f);
                if (k3Var.G0 != Float.MAX_VALUE) {
                    a3Var.setSwipeOffsetAnimationDisallowed(true);
                    a3Var.setOffsetY(k3Var.G0);
                    a3Var.setSwipeOffsetAnimationDisallowed(false);
                }
                k3Var.x.o(true, true);
                final AnimationNotificationsLocker animationNotificationsLocker = new AnimationNotificationsLocker();
                animationNotificationsLocker.lock();
                if (k3Var.F0 || k3Var.m()) {
                    a3Var.f(a3Var.getTopActionBarOffsetY() + (-a3Var.getOffsetY()), false, new nb(animationNotificationsLocker, 18));
                } else {
                    o1.k kVar = new o1.k(a3Var, q4.b0, 0.0f);
                    o1.l lVar = new o1.l(0.0f);
                    lVar.a(0.75f);
                    lVar.b(500.0f);
                    kVar.u = lVar;
                    kVar.a(new o1.f() { // from class: fi.t2
                        @Override // o1.f
                        public final void a(o1.h hVar, boolean z10, float f7, float f10) {
                            AnimationNotificationsLocker.this.unlock();
                        }
                    });
                    kVar.f();
                }
                a3Var.K = true;
                if (k3Var.d0 && botFullscreenButtons != null) {
                    botFullscreenButtons.setAlpha(0.0f);
                    botFullscreenButtons.animate().alpha(1.0f).setDuration(220L).start();
                    break;
                }
                break;
            case 1:
                ig.m.b0((ig.m) obj);
                break;
            default:
                SearchView searchView = (SearchView) obj;
                SearchView.SearchAutoComplete searchAutoComplete = searchView.F;
                View view2 = searchView.N;
                if (view2.getWidth() > 1) {
                    Resources resources = searchView.getContext().getResources();
                    int paddingLeft = searchView.H.getPaddingLeft();
                    Rect rect = new Rect();
                    boolean a2 = m.s3.a(searchView);
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
