package m;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.BotFullscreenButtons;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
                SearchView.SearchAutoComplete searchAutoComplete = searchView.B;
                View view2 = searchView.J;
                if (view2.getWidth() > 1) {
                    Resources resources = searchView.getContext().getResources();
                    int paddingLeft = searchView.D.getPaddingLeft();
                    Rect rect = new Rect();
                    boolean a2 = v3.a(searchView);
                    int dimensionPixelSize = searchView.b0 ? resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left) : 0;
                    searchAutoComplete.getDropDownBackground().getPadding(rect);
                    searchAutoComplete.setDropDownHorizontalOffset(a2 ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
                    searchAutoComplete.setDropDownWidth((((view2.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
                    break;
                }
                break;
            case 1:
                view.removeOnLayoutChangeListener(this);
                ph.p2 p2Var = (ph.p2) obj;
                BotFullscreenButtons botFullscreenButtons = p2Var.i0;
                ph.g2 g2Var = p2Var.v;
                g2Var.setSwipeOffsetY(g2Var.getHeight());
                p2Var.e.setAlpha(1.0f);
                if (p2Var.C0 != Float.MAX_VALUE) {
                    g2Var.setSwipeOffsetAnimationDisallowed(true);
                    g2Var.setOffsetY(p2Var.C0);
                    g2Var.setSwipeOffsetAnimationDisallowed(false);
                }
                p2Var.x.n(true, true);
                final AnimationNotificationsLocker animationNotificationsLocker = new AnimationNotificationsLocker();
                animationNotificationsLocker.lock();
                if (p2Var.B0 || p2Var.m()) {
                    g2Var.f(g2Var.getTopActionBarOffsetY() + (-g2Var.getOffsetY()), false, new org.telegram.ui.web.t1(animationNotificationsLocker, 10));
                } else {
                    o1.k kVar = new o1.k(g2Var, ph.m3.U, 0.0f);
                    o1.l lVar = new o1.l(0.0f);
                    lVar.a(0.75f);
                    lVar.b(500.0f);
                    kVar.u = lVar;
                    kVar.a(new o1.g() { // from class: ph.c2
                        @Override // o1.g
                        public final void a(o1.i iVar, boolean z10, float f9, float f10) {
                            AnimationNotificationsLocker.this.unlock();
                        }
                    });
                    kVar.f();
                }
                g2Var.G = true;
                if (p2Var.Z && botFullscreenButtons != null) {
                    botFullscreenButtons.setAlpha(0.0f);
                    botFullscreenButtons.animate().alpha(1.0f).setDuration(220L).start();
                    break;
                }
                break;
            default:
                sf.l.b0((sf.l) obj);
                break;
        }
    }
}
