// default package

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class j6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ActionBarLayout b;

    public /* synthetic */ j6(ActionBarLayout actionBarLayout, byte b) {
        this.a = b;
        this.b = actionBarLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ActionBarLayout actionBarLayout = this.b;
        switch (b) {
            case 0:
                Drawable drawable = ActionBarLayout.w1;
                actionBarLayout.I0.setVisibility(8);
                break;
            case 1:
                actionBarLayout.invalidate();
                break;
            case 2:
                actionBarLayout.requestLayout();
                actionBarLayout.s.requestLayout();
                actionBarLayout.w.requestLayout();
                actionBarLayout.x.requestLayout();
                break;
            case 3:
                Drawable drawable2 = ActionBarLayout.w1;
                if (actionBarLayout.a && actionBarLayout.getLastFragment() != null && actionBarLayout.s.getChildCount() == 0) {
                    boolean z = f11.a;
                    cc4.g(new RuntimeException(TextUtils.join(", ", actionBarLayout.p1)), true);
                    actionBarLayout.W(true, true);
                    break;
                }
                break;
            case 4:
                Drawable drawable3 = ActionBarLayout.w1;
                actionBarLayout.F(false);
                break;
            default:
                Drawable drawable4 = ActionBarLayout.w1;
                actionBarLayout.F(false);
                break;
        }
    }
}
