package fh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class k5 extends org.telegram.ui.ActionBar.g1 {
    public final int H;
    public long I;
    public i5 J;

    public k5(Context context, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        super(0, context, b6Var, false, false);
        this.H = i9;
        setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        c(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.E8, b6Var), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.F8, b6Var));
        setIconColor(-1);
        this.c.setTranslationX(AndroidUtilities.dp(2.0f));
        this.c.setScaleX(1.2f);
        this.c.setScaleY(1.2f);
        a(2);
        setBackground(null);
        this.c.addOnAttachStateChangeListener(new af.b(this, 2));
    }

    @Override // org.telegram.ui.ActionBar.g1, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        int size = View.MeasureSpec.getSize(i9);
        if (View.MeasureSpec.getMode(i9) == Integer.MIN_VALUE) {
            size = AndroidUtilities.dp(250.0f);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), i10);
    }
}
