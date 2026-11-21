package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class z6 extends View {
    public int a;
    public final int b;
    public boolean c;
    public boolean d;

    public z6(Context context) {
        this(context, (c0) null);
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

    public z6(Context context, Object obj) {
        this(context, (c0) null);
    }

    public z6(Context context, c0 c0Var) {
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

    public z6(Context context, int i7, int i10) {
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
