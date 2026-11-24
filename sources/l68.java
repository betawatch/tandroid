// default package

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class l68 extends FrameLayout {
    public ImageView a;
    public ImageView b;
    public TextView c;
    public int d;

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.d, TLObject.FLAG_30), wi8.E(2.0f, this.d, TLObject.FLAG_30));
    }

    public void setItemSize(int i) {
        this.d = i;
    }

    public void setType(int i) {
        TextView textView = this.c;
        ImageView imageView = this.b;
        ImageView imageView2 = this.a;
        if (i == 0) {
            imageView2.setImageResource(R.drawable.permissions_camera1);
            imageView.setImageResource(R.drawable.permissions_camera2);
            textView.setText(jb6.M0(2131752546, null));
            imageView2.setLayoutParams(qoe.d(44, 44.0f, 17, 5.0f, 0.0f, 0.0f, 27.0f));
            imageView.setLayoutParams(qoe.d(44, 44.0f, 17, 5.0f, 0.0f, 0.0f, 27.0f));
            return;
        }
        imageView2.setImageResource(R.drawable.permissions_gallery1);
        imageView.setImageResource(R.drawable.permissions_gallery2);
        textView.setText(jb6.M0(2131750409, null));
        imageView2.setLayoutParams(qoe.d(44, 44.0f, 17, 0.0f, 0.0f, 2.0f, 27.0f));
        imageView.setLayoutParams(qoe.d(44, 44.0f, 17, 0.0f, 0.0f, 2.0f, 27.0f));
    }
}
