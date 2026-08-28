package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class z6 extends View {
    public int a;
    public final int b;
    public boolean c;
    public boolean d;

    public z6(Context context) {
        this(context, (j2) null);
    }

    private int getBackgroundResId() {
        boolean z10 = this.c;
        return (z10 && this.d) ? R.drawable.greydivider : z10 ? R.drawable.greydivider_bottom : this.d ? R.drawable.greydivider_top : R.drawable.transparent;
    }

    @Override // android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.a), TLObject.FLAG_30));
    }

    public void setSize(int i9) {
        this.a = i9;
    }

    public z6(Context context, Object obj) {
        this(context, (j2) null);
    }

    public z6(Context context, j2 j2Var) {
        super(context);
        this.c = true;
        this.d = true;
        this.a = 12;
        int i9 = this.b;
        if (i9 == 0) {
            setBackground(null);
        } else {
            setBackgroundColor(i9);
        }
    }

    public z6(Context context, int i9, int i10) {
        super(context);
        this.c = true;
        this.d = true;
        this.b = i9;
        this.a = 12;
        if (i9 == 0) {
            setBackground(null);
        } else {
            setBackgroundColor(i9);
        }
    }
}
