package lh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class z4 extends org.telegram.ui.ActionBar.g1 {
    public final int I;
    public long J;
    public x4 K;

    public z4(Context context, int i10, g6 g6Var) {
        super(0, context, g6Var, false, false);
        this.I = i10;
        setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        int v02 = k6.v0(k6.E8, g6Var);
        int i11 = k6.F8;
        c(v02, k6.v0(i11, g6Var));
        e(k6.v0(i11, g6Var), PorterDuff.Mode.SRC_IN);
        this.c.setTranslationX(AndroidUtilities.dp(2.0f));
        a(2);
        setBackground(null);
        this.c.addOnAttachStateChangeListener(new ff.b(this, 5));
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
