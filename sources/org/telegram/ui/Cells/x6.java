package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class x6 extends View {
    public int a;
    public final int b;
    public boolean c;
    public boolean d;

    public x6(Context context) {
        this(context, (y0) null);
    }

    private int getBackgroundResId() {
        boolean z10 = this.c;
        return (z10 && this.d) ? R.drawable.greydivider : z10 ? R.drawable.greydivider_bottom : this.d ? R.drawable.greydivider_top : R.drawable.transparent;
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(this.a), TLObject.FLAG_30));
    }

    public void setSize(int i7) {
        this.a = i7;
    }

    public x6(Context context, Object obj) {
        this(context, (y0) null);
    }

    public x6(Context context, y0 y0Var) {
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

    public x6(Context context, int i7, int i10) {
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
