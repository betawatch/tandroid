package org.telegram.ui.Cells;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.id;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class l5 extends FrameLayout {
    public ImageView a;
    public ImageView b;
    public TextView c;
    public int d;

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.d, TLObject.FLAG_30), org.telegram.messenger.camera.q.B(2.0f, this.d, TLObject.FLAG_30));
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
            textView.setText(id.M0(2131752593, null));
            imageView2.setLayoutParams(c8.ha.d(44, 44.0f, 17, 5.0f, 0.0f, 0.0f, 27.0f));
            imageView.setLayoutParams(c8.ha.d(44, 44.0f, 17, 5.0f, 0.0f, 0.0f, 27.0f));
            return;
        }
        imageView2.setImageResource(R.drawable.permissions_gallery1);
        imageView.setImageResource(R.drawable.permissions_gallery2);
        textView.setText(id.M0(2131750477, null));
        imageView2.setLayoutParams(c8.ha.d(44, 44.0f, 17, 0.0f, 0.0f, 2.0f, 27.0f));
        imageView.setLayoutParams(c8.ha.d(44, 44.0f, 17, 0.0f, 0.0f, 2.0f, 27.0f));
    }
}
