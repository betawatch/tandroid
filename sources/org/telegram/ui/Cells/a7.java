package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class a7 extends View {
    public int a;
    public final int b;
    public boolean c;
    public boolean d;

    public a7(Context context) {
        this(context, (p6) null);
    }

    private int getBackgroundResId() {
        boolean z10 = this.c;
        return (z10 && this.d) ? R.drawable.greydivider : z10 ? R.drawable.greydivider_bottom : this.d ? R.drawable.greydivider_top : R.drawable.transparent;
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.a), TLObject.FLAG_30));
    }

    public void setSize(int i10) {
        this.a = i10;
    }

    public a7(Context context, Object obj) {
        this(context, (p6) null);
    }

    public a7(Context context, p6 p6Var) {
        super(context);
        this.c = true;
        this.d = true;
        this.a = 12;
        int i10 = this.b;
        if (i10 == 0) {
            setBackground(null);
        } else {
            setBackgroundColor(i10);
        }
    }

    public a7(Context context, int i10, int i11) {
        super(context);
        this.c = true;
        this.d = true;
        this.b = i10;
        this.a = 12;
        if (i10 == 0) {
            setBackground(null);
        } else {
            setBackgroundColor(i10);
        }
    }
}
