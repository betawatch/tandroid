package org.telegram.ui.Cells;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.messenger.n10;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class m5 extends FrameLayout {
    public ImageView a;
    public ImageView b;
    public TextView c;
    public int d;

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.d, TLObject.FLAG_30), n10.C(2.0f, this.d, TLObject.FLAG_30));
    }

    public void setItemSize(int i7) {
        this.d = i7;
    }

    public void setType(int i7) {
        TextView textView = this.c;
        ImageView imageView = this.b;
        ImageView imageView2 = this.a;
        if (i7 == 0) {
            imageView2.setImageResource(R.drawable.permissions_camera1);
            imageView.setImageResource(R.drawable.permissions_camera2);
            textView.setText(gd.M0(2131752582, null));
            imageView2.setLayoutParams(c8.ma.d(44, 44.0f, 17, 5.0f, 0.0f, 0.0f, 27.0f));
            imageView.setLayoutParams(c8.ma.d(44, 44.0f, 17, 5.0f, 0.0f, 0.0f, 27.0f));
            return;
        }
        imageView2.setImageResource(R.drawable.permissions_gallery1);
        imageView.setImageResource(R.drawable.permissions_gallery2);
        textView.setText(gd.M0(2131750460, null));
        imageView2.setLayoutParams(c8.ma.d(44, 44.0f, 17, 0.0f, 0.0f, 2.0f, 27.0f));
        imageView.setLayoutParams(c8.ma.d(44, 44.0f, 17, 0.0f, 0.0f, 2.0f, 27.0f));
    }
}
