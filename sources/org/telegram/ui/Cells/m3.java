package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class m3 extends FrameLayout {
    public int a;

    public m3(Context context) {
        this(context, 8);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(this.a, TLObject.FLAG_30));
    }

    public void setHeight(int i7) {
        if (this.a != i7) {
            this.a = i7;
            requestLayout();
        }
    }

    public m3(Context context, int i7) {
        super(context);
        this.a = i7;
    }
}
