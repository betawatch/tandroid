package jf;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.i0;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class a extends FrameLayout {
    public final Activity a;
    public int b;
    public int c;
    public boolean d;

    public a(LaunchActivity launchActivity) {
        super(launchActivity);
        this.a = launchActivity;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        boolean H1 = i0.H1(this.a);
        if (!H1) {
            this.b = size;
            this.c = size2;
        }
        this.d = H1 && size < this.b && size2 < this.c;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
    }
}
