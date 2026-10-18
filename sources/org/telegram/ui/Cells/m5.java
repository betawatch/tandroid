package org.telegram.ui.Cells;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.kk;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class m5 extends FrameLayout {
    public ImageView a;
    public ImageView b;
    public TextView c;
    public int d;

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.d, TLObject.FLAG_30), kk.C(2.0f, this.d, TLObject.FLAG_30));
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
            textView.setText(LocaleController.getString(R.string.CameraPermissionText));
            imageView2.setLayoutParams(w7.z5.a(44.0f, 5.0f, 0.0f, 0.0f, 27.0f, 44, 17));
            imageView.setLayoutParams(w7.z5.a(44.0f, 5.0f, 0.0f, 0.0f, 27.0f, 44, 17));
            return;
        }
        imageView2.setImageResource(R.drawable.permissions_gallery1);
        imageView.setImageResource(R.drawable.permissions_gallery2);
        textView.setText(LocaleController.getString(R.string.GalleryPermissionText));
        imageView2.setLayoutParams(w7.z5.a(44.0f, 0.0f, 0.0f, 2.0f, 27.0f, 44, 17));
        imageView.setLayoutParams(w7.z5.a(44.0f, 0.0f, 0.0f, 2.0f, 27.0f, 44, 17));
    }
}
