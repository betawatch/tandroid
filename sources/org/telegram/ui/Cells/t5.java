package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.qe0;
import org.telegram.ui.Components.re0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class t5 extends FrameLayout {
    public TextView a;
    public TextView b;
    public re0 c;
    public AnimatorSet d;
    public lh.m7 e;

    public final void a(String str, int i10, float f9) {
        TextView textView = this.a;
        TextView textView2 = this.b;
        AnimatorSet animatorSet = this.d;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.d = null;
        }
        AndroidUtilities.cancelRunOnUIThread(this.e);
        textView2.setTag(null);
        textView.setText(str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase());
        if (f9 > 0.0f) {
            textView2.setText("+" + ((int) f9));
        } else {
            textView2.setText("" + ((int) f9));
        }
        textView2.setAlpha(0.0f);
        textView.setAlpha(1.0f);
        re0 re0Var = this.c;
        re0Var.h = i10;
        re0Var.n = 100;
        re0Var.a((int) f9, false);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(40.0f), TLObject.FLAG_30));
    }

    public void setSeekBarDelegate(qe0 qe0Var) {
        this.c.setDelegate(new g9(this, qe0Var));
    }

    @Override // android.view.View
    public void setTag(Object obj) {
        super.setTag(obj);
        this.c.setTag(obj);
    }
}
