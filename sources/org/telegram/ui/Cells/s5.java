package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.bd0;
import org.telegram.ui.Components.cd0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class s5 extends FrameLayout {
    public TextView a;
    public TextView b;
    public cd0 c;
    public AnimatorSet d;
    public mi.b0 e;

    public final void a(String str, int i3, float f10) {
        TextView textView = this.a;
        TextView textView2 = this.b;
        AnimatorSet animatorSet = this.d;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.d = null;
        }
        org.telegram.messenger.g0.r(this.e);
        textView2.setTag(null);
        textView.setText(str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase());
        if (f10 > 0.0f) {
            textView2.setText("+" + ((int) f10));
        } else {
            textView2.setText("" + ((int) f10));
        }
        textView2.setAlpha(0.0f);
        textView.setAlpha(1.0f);
        cd0 cd0Var = this.c;
        cd0Var.h = i3;
        cd0Var.n = 100;
        cd0Var.a((int) f10, false);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(40.0f), TLObject.FLAG_30));
    }

    public void setSeekBarDelegate(bd0 bd0Var) {
        this.c.setDelegate(new d9(this, bd0Var));
    }

    @Override // android.view.View
    public void setTag(Object obj) {
        super.setTag(obj);
        this.c.setTag(obj);
    }
}
