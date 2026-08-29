package ih;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.g6;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class w4 extends org.telegram.ui.ActionBar.g1 {
    public final int H;
    public long I;
    public u4 J;

    public w4(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(0, context, c6Var, false, false);
        this.H = i10;
        setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        c(g6.v0(g6.E8, c6Var), g6.v0(g6.F8, c6Var));
        setIconColor(-1);
        this.c.setTranslationX(AndroidUtilities.dp(2.0f));
        this.c.setScaleX(1.2f);
        this.c.setScaleY(1.2f);
        a(2);
        setBackground(null);
        this.c.addOnAttachStateChangeListener(new df.b(this, 2));
    }

    @Override // org.telegram.ui.ActionBar.g1, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        if (View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            size = AndroidUtilities.dp(250.0f);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), i11);
    }
}
