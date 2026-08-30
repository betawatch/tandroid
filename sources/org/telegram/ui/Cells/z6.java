package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class z6 extends View {
    public int a;
    public final int b;
    public boolean c;
    public boolean d;

    public z6(Context context) {
        this(context, (org.telegram.ui.b) null);
    }

    private int getBackgroundResId() {
        boolean z4 = this.c;
        return (z4 && this.d) ? R.drawable.greydivider : z4 ? R.drawable.greydivider_bottom : this.d ? R.drawable.greydivider_top : R.drawable.transparent;
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.a), TLObject.FLAG_30));
    }

    public void setSize(int i10) {
        this.a = i10;
    }

    public z6(Context context, Object obj) {
        this(context, (org.telegram.ui.b) null);
    }

    public z6(Context context, org.telegram.ui.b bVar) {
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

    public z6(Context context, int i10, int i11) {
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
