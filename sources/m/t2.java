package m;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import mh.f4;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.BotFullscreenButtons;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class t2 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t2(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        int i17 = this.a;
        Object obj = this.b;
        switch (i17) {
            case 0:
                SearchView searchView = (SearchView) obj;
                SearchView.SearchAutoComplete searchAutoComplete = searchView.B;
                View view2 = searchView.J;
                if (view2.getWidth() > 1) {
                    Resources resources = searchView.getContext().getResources();
                    int paddingLeft = searchView.D.getPaddingLeft();
                    Rect rect = new Rect();
                    boolean a2 = w3.a(searchView);
                    r5 = searchView.b0 ? resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left) : 0;
                    searchAutoComplete.getDropDownBackground().getPadding(rect);
                    searchAutoComplete.setDropDownHorizontalOffset(a2 ? -rect.left : paddingLeft - (rect.left + r5));
                    searchAutoComplete.setDropDownWidth((((view2.getWidth() + rect.left) + rect.right) + r5) - paddingLeft);
                    break;
                }
                break;
            case 1:
                view.removeOnLayoutChangeListener(this);
                mh.c3 c3Var = (mh.c3) obj;
                BotFullscreenButtons botFullscreenButtons = c3Var.i0;
                mh.t2 t2Var = c3Var.v;
                t2Var.setSwipeOffsetY(t2Var.getHeight());
                c3Var.e.setAlpha(1.0f);
                if (c3Var.C0 != Float.MAX_VALUE) {
                    t2Var.setSwipeOffsetAnimationDisallowed(true);
                    t2Var.setOffsetY(c3Var.C0);
                    t2Var.setSwipeOffsetAnimationDisallowed(false);
                }
                c3Var.x.n(true, true);
                final AnimationNotificationsLocker animationNotificationsLocker = new AnimationNotificationsLocker();
                animationNotificationsLocker.lock();
                if (c3Var.B0 || c3Var.m()) {
                    t2Var.f(t2Var.getTopActionBarOffsetY() + (-t2Var.getOffsetY()), false, new mh.m2(animationNotificationsLocker, r5));
                } else {
                    o1.j jVar = new o1.j(t2Var, f4.U, 0.0f);
                    o1.k kVar = new o1.k(0.0f);
                    kVar.a(0.75f);
                    kVar.b(500.0f);
                    jVar.u = kVar;
                    jVar.a(new o1.f() { // from class: mh.n2
                        @Override // o1.f
                        public final void a(o1.h hVar, boolean z10, float f10, float f11) {
                            AnimationNotificationsLocker.this.unlock();
                        }
                    });
                    jVar.f();
                }
                t2Var.G = true;
                if (c3Var.Z && botFullscreenButtons != null) {
                    botFullscreenButtons.setAlpha(0.0f);
                    botFullscreenButtons.animate().alpha(1.0f).setDuration(220L).start();
                    break;
                }
                break;
            default:
                pf.l.a0((pf.l) obj);
                break;
        }
    }
}
