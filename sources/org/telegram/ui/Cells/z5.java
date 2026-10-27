package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.qf0;
import org.telegram.ui.Components.rf0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class z5 extends FrameLayout {
    public TextView a;
    public TextView b;
    public rf0 c;
    public AnimatorSet d;
    public m.g3 e;

    public final void a(String str, int i10, float f7) {
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
        if (f7 > 0.0f) {
            textView2.setText("+" + ((int) f7));
        } else {
            textView2.setText("" + ((int) f7));
        }
        textView2.setAlpha(0.0f);
        textView.setAlpha(1.0f);
        rf0 rf0Var = this.c;
        rf0Var.h = i10;
        rf0Var.n = 100;
        rf0Var.a((int) f7, false);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(40.0f), TLObject.FLAG_30));
    }

    public void setSeekBarDelegate(qf0 qf0Var) {
        this.c.setDelegate(new o9(this, qf0Var));
    }

    @Override // android.view.View
    public void setTag(Object obj) {
        super.setTag(obj);
        this.c.setTag(obj);
    }
}
