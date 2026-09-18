package org.telegram.ui.Cells;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
