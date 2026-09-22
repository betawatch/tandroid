package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class ka extends FrameLayout {
    public TextView a;
    public ImageView b;
    public boolean c;

    public final void a(String str, boolean z10, boolean z11) {
        this.a.setText(str);
        this.b.setVisibility(z10 ? 0 : 4);
        this.c = z11;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.c) {
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(20.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.i6.k0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f) + (this.c ? 1 : 0), TLObject.FLAG_30));
    }

    public void setTypeChecked(boolean z10) {
        this.b.setVisibility(z10 ? 0 : 4);
    }
}
