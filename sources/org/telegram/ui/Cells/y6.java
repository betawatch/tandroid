package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class y6 extends View {
    public int a;
    public final int b;
    public boolean c;
    public boolean d;

    public y6(Context context) {
        this(context, (f1) null);
    }

    private int getBackgroundResId() {
        boolean z9 = this.c;
        return (z9 && this.d) ? R.drawable.greydivider : z9 ? R.drawable.greydivider_bottom : this.d ? R.drawable.greydivider_top : R.drawable.transparent;
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(this.a), TLObject.FLAG_30));
    }

    public void setSize(int i7) {
        this.a = i7;
    }

    public y6(Context context, Object obj) {
        this(context, (f1) null);
    }

    public y6(Context context, f1 f1Var) {
        super(context);
        this.c = true;
        this.d = true;
        this.a = 12;
        int i7 = this.b;
        if (i7 == 0) {
            setBackground(null);
        } else {
            setBackgroundColor(i7);
        }
    }

    public y6(Context context, int i7, int i10) {
        super(context);
        this.c = true;
        this.d = true;
        this.b = i7;
        this.a = 12;
        if (i7 == 0) {
            setBackground(null);
        } else {
            setBackgroundColor(i7);
        }
    }
}
