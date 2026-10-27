package hi;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import fi.ua;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.BotFullscreenButtons;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
                m3 m3Var = (m3) obj;
                BotFullscreenButtons botFullscreenButtons = m3Var.n0;
                d3 d3Var = m3Var.w;
                d3Var.setSwipeOffsetY(d3Var.getHeight());
                m3Var.f.setAlpha(1.0f);
                if (m3Var.H0 != Float.MAX_VALUE) {
                    d3Var.setSwipeOffsetAnimationDisallowed(true);
                    d3Var.setOffsetY(m3Var.H0);
                    d3Var.setSwipeOffsetAnimationDisallowed(false);
                }
                m3Var.y.n(true, true);
                final AnimationNotificationsLocker animationNotificationsLocker = new AnimationNotificationsLocker();
                animationNotificationsLocker.lock();
                if (m3Var.G0 || m3Var.n()) {
                    d3Var.f(d3Var.getTopActionBarOffsetY() + (-d3Var.getOffsetY()), false, new ua(animationNotificationsLocker, 15));
                } else {
                    o1.j jVar = new o1.j(d3Var, n4.b0, 0.0f);
                    o1.k kVar = new o1.k(0.0f);
                    kVar.a(0.75f);
                    kVar.b(500.0f);
                    jVar.u = kVar;
                    jVar.a(new o1.f() { // from class: hi.w2
                        @Override // o1.f
                        public final void a(o1.h hVar, boolean z10, float f7, float f10) {
                            AnimationNotificationsLocker.this.unlock();
                        }
                    });
                    jVar.h();
                }
                d3Var.K = true;
                if (m3Var.e0 && botFullscreenButtons != null) {
                    botFullscreenButtons.setAlpha(0.0f);
                    botFullscreenButtons.animate().alpha(1.0f).setDuration(220L).start();
                    break;
                }
                break;
            case 1:
                jg.n.c0((jg.n) obj);
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
