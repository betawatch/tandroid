package m;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.BotFullscreenButtons;
import org.telegram.messenger.beta.R;
import ph.ga;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class t2 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t2(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        int i18 = this.a;
        Object obj = this.b;
        switch (i18) {
            case 0:
                SearchView searchView = (SearchView) obj;
                SearchView.SearchAutoComplete searchAutoComplete = searchView.C;
                View view2 = searchView.K;
                if (view2.getWidth() > 1) {
                    Resources resources = searchView.getContext().getResources();
                    int paddingLeft = searchView.E.getPaddingLeft();
                    Rect rect = new Rect();
                    boolean a2 = v3.a(searchView);
                    int dimensionPixelSize = searchView.c0 ? resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left) : 0;
                    searchAutoComplete.getDropDownBackground().getPadding(rect);
                    searchAutoComplete.setDropDownHorizontalOffset(a2 ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
                    searchAutoComplete.setDropDownWidth((((view2.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
                    break;
                }
                break;
            case 1:
                view.removeOnLayoutChangeListener(this);
                rh.q2 q2Var = (rh.q2) obj;
                BotFullscreenButtons botFullscreenButtons = q2Var.j0;
                rh.h2 h2Var = q2Var.v;
                h2Var.setSwipeOffsetY(h2Var.getHeight());
                q2Var.e.setAlpha(1.0f);
                if (q2Var.D0 != Float.MAX_VALUE) {
                    h2Var.setSwipeOffsetAnimationDisallowed(true);
                    h2Var.setOffsetY(q2Var.D0);
                    h2Var.setSwipeOffsetAnimationDisallowed(false);
                }
                q2Var.x.n(true, true);
                final AnimationNotificationsLocker animationNotificationsLocker = new AnimationNotificationsLocker();
                animationNotificationsLocker.lock();
                if (q2Var.C0 || q2Var.m()) {
                    h2Var.f(h2Var.getTopActionBarOffsetY() + (-h2Var.getOffsetY()), false, new ga(animationNotificationsLocker, 12));
                } else {
                    o1.j jVar = new o1.j(h2Var, rh.n3.V, 0.0f);
                    o1.k kVar = new o1.k(0.0f);
                    kVar.a(0.75f);
                    kVar.b(500.0f);
                    jVar.u = kVar;
                    jVar.a(new o1.f() { // from class: rh.d2
                        @Override // o1.f
                        public final void a(o1.h hVar, boolean z4, float f10, float f11) {
                            AnimationNotificationsLocker.this.unlock();
                        }
                    });
                    jVar.f();
                }
                h2Var.H = true;
                if (q2Var.a0 && botFullscreenButtons != null) {
                    botFullscreenButtons.setAlpha(0.0f);
                    botFullscreenButtons.animate().alpha(1.0f).setDuration(220L).start();
                    break;
                }
                break;
            default:
                uf.k.b0((uf.k) obj);
                break;
        }
    }
}
