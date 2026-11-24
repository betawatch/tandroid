// default package

import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class cpb extends FrameLayout {
    public TextView a;
    public ImageView b;
    public boolean c;

    public final void a(String str, boolean z, boolean z2) {
        this.a.setText(str);
        this.b.setVisibility(z ? 0 : 4);
        this.c = z2;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.c) {
            canvas.drawLine(jb6.a0 ? 0.0f : gm.L(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (jb6.a0 ? gm.L(20.0f) : 0), getMeasuredHeight() - 1, cmb.j0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(50.0f) + (this.c ? 1 : 0), TLObject.FLAG_30));
    }

    public void setTypeChecked(boolean z) {
        this.b.setVisibility(z ? 0 : 4);
    }
}
