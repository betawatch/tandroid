package m;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import nh.d4;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.BotFullscreenButtons;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
        switch (this.a) {
            case 0:
                SearchView searchView = (SearchView) this.b;
                SearchView.SearchAutoComplete searchAutoComplete = searchView.B;
                View view2 = searchView.J;
                if (view2.getWidth() > 1) {
                    Resources resources = searchView.getContext().getResources();
                    int paddingLeft = searchView.D.getPaddingLeft();
                    Rect rect = new Rect();
                    boolean a2 = w3.a(searchView);
                    int dimensionPixelSize = searchView.b0 ? resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width) : 0;
                    searchAutoComplete.getDropDownBackground().getPadding(rect);
                    searchAutoComplete.setDropDownHorizontalOffset(a2 ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
                    searchAutoComplete.setDropDownWidth((((view2.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
                    break;
                }
                break;
            case 1:
                view.removeOnLayoutChangeListener(this);
                nh.b3 b3Var = (nh.b3) this.b;
                BotFullscreenButtons botFullscreenButtons = b3Var.i0;
                nh.s2 s2Var = b3Var.v;
                s2Var.setSwipeOffsetY(s2Var.getHeight());
                b3Var.e.setAlpha(1.0f);
                if (b3Var.C0 != Float.MAX_VALUE) {
                    s2Var.setSwipeOffsetAnimationDisallowed(true);
                    s2Var.setOffsetY(b3Var.C0);
                    s2Var.setSwipeOffsetAnimationDisallowed(false);
                }
                b3Var.x.n(true, true);
                final AnimationNotificationsLocker animationNotificationsLocker = new AnimationNotificationsLocker();
                animationNotificationsLocker.lock();
                if (b3Var.B0 || b3Var.m()) {
                    s2Var.f(s2Var.getTopActionBarOffsetY() + (-s2Var.getOffsetY()), false, new nh.f0(animationNotificationsLocker, 7));
                } else {
                    o1.j jVar = new o1.j(s2Var, d4.U, 0.0f);
                    o1.k kVar = new o1.k(0.0f);
                    kVar.a(0.75f);
                    kVar.b(500.0f);
                    jVar.u = kVar;
                    jVar.a(new o1.f() { // from class: nh.m2
                        @Override // o1.f
                        public final void a(o1.h hVar, boolean z10, float f10, float f11) {
                            AnimationNotificationsLocker.this.unlock();
                        }
                    });
                    jVar.f();
                }
                s2Var.G = true;
                if (b3Var.Z && botFullscreenButtons != null) {
                    botFullscreenButtons.setAlpha(0.0f);
                    botFullscreenButtons.animate().alpha(1.0f).setDuration(220L).start();
                    break;
                }
                break;
            default:
                qf.m.b0((qf.m) this.b);
                break;
        }
    }
}
