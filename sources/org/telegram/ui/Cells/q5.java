package org.telegram.ui.Cells;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.z20;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class q5 extends FrameLayout {
    public ImageView a;
    public ImageView b;
    public TextView c;
    public int d;

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.d, TLObject.FLAG_30), z20.B(2.0f, this.d, TLObject.FLAG_30));
    }

    public void setItemSize(int i10) {
        this.d = i10;
    }

    public void setType(int i10) {
        TextView textView = this.c;
        ImageView imageView = this.b;
        ImageView imageView2 = this.a;
        if (i10 == 0) {
            imageView2.setImageResource(R.drawable.permissions_camera1);
            imageView.setImageResource(R.drawable.permissions_camera2);
            textView.setText(cd.L0(2131752593, null));
            imageView2.setLayoutParams(w7.b6.d(44, 44.0f, 17, 5.0f, 0.0f, 0.0f, 27.0f));
            imageView.setLayoutParams(w7.b6.d(44, 44.0f, 17, 5.0f, 0.0f, 0.0f, 27.0f));
            return;
        }
        imageView2.setImageResource(R.drawable.permissions_gallery1);
        imageView.setImageResource(R.drawable.permissions_gallery2);
        textView.setText(cd.L0(2131750485, null));
        imageView2.setLayoutParams(w7.b6.d(44, 44.0f, 17, 0.0f, 0.0f, 2.0f, 27.0f));
        imageView.setLayoutParams(w7.b6.d(44, 44.0f, 17, 0.0f, 0.0f, 2.0f, 27.0f));
    }
}
