package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class x6 extends View {
    public int a;
    public final int b;
    public boolean c;
    public boolean d;

    public x6(Context context) {
        this(context, (f1) null);
    }

    private int getBackgroundResId() {
        boolean z10 = this.c;
        return (z10 && this.d) ? R.drawable.greydivider : z10 ? R.drawable.greydivider_bottom : this.d ? R.drawable.greydivider_top : R.drawable.transparent;
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(this.a), TLObject.FLAG_30));
    }

    public void setSize(int i3) {
        this.a = i3;
    }

    public x6(Context context, Object obj) {
        this(context, (f1) null);
    }

    public x6(Context context, f1 f1Var) {
        super(context);
        this.c = true;
        this.d = true;
        this.a = 12;
        int i3 = this.b;
        if (i3 == 0) {
            setBackground(null);
        } else {
            setBackgroundColor(i3);
        }
    }

    public x6(Context context, int i3, int i10) {
        super(context);
        this.c = true;
        this.d = true;
        this.b = i3;
        this.a = 12;
        if (i3 == 0) {
            setBackground(null);
        } else {
            setBackgroundColor(i3);
        }
    }
}
