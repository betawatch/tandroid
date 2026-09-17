package org.telegram.ui.Cells;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final class v4 extends FrameLayout {
    public RadialProgressView a;
    public TextView b;
    public ImageView c;

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) (AndroidUtilities.dp(56.0f) * 2.5f), TLObject.FLAG_30));
    }

    public void setLoading(boolean z10) {
        this.a.setVisibility(z10 ? 0 : 4);
        this.b.setVisibility(z10 ? 4 : 0);
        this.c.setVisibility(z10 ? 4 : 0);
    }
}
