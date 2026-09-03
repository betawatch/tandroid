package m;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.BotFullscreenButtons;
import org.telegram.messenger.beta.R;
import qh.u9;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class s2 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s2(Object obj, int i10) {
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
                    boolean a2 = u3.a(searchView);
                    int dimensionPixelSize = searchView.c0 ? resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left) : 0;
                    searchAutoComplete.getDropDownBackground().getPadding(rect);
                    searchAutoComplete.setDropDownHorizontalOffset(a2 ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
                    searchAutoComplete.setDropDownWidth((((view2.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
                    break;
                }
                break;
            case 1:
                view.removeOnLayoutChangeListener(this);
                sh.p2 p2Var = (sh.p2) obj;
                BotFullscreenButtons botFullscreenButtons = p2Var.j0;
                sh.g2 g2Var = p2Var.v;
                g2Var.setSwipeOffsetY(g2Var.getHeight());
                p2Var.e.setAlpha(1.0f);
                if (p2Var.D0 != Float.MAX_VALUE) {
                    g2Var.setSwipeOffsetAnimationDisallowed(true);
                    g2Var.setOffsetY(p2Var.D0);
                    g2Var.setSwipeOffsetAnimationDisallowed(false);
                }
                p2Var.x.n(true, true);
                final AnimationNotificationsLocker animationNotificationsLocker = new AnimationNotificationsLocker();
                animationNotificationsLocker.lock();
                if (p2Var.C0 || p2Var.m()) {
                    g2Var.f(g2Var.getTopActionBarOffsetY() + (-g2Var.getOffsetY()), false, new u9(animationNotificationsLocker, 14));
                } else {
                    o1.j jVar = new o1.j(g2Var, sh.m3.V, 0.0f);
                    o1.k kVar = new o1.k(0.0f);
                    kVar.a(0.75f);
                    kVar.b(500.0f);
                    jVar.u = kVar;
                    jVar.a(new o1.f() { // from class: sh.c2
                        @Override // o1.f
                        public final void a(o1.h hVar, boolean z4, float f10, float f11) {
                            AnimationNotificationsLocker.this.unlock();
                        }
                    });
                    jVar.f();
                }
                g2Var.H = true;
                if (p2Var.a0 && botFullscreenButtons != null) {
                    botFullscreenButtons.setAlpha(0.0f);
                    botFullscreenButtons.animate().alpha(1.0f).setDuration(220L).start();
                    break;
                }
                break;
            default:
                vf.k.b0((vf.k) obj);
                break;
        }
    }
}
