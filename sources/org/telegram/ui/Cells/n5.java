package org.telegram.ui.Cells;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class n5 extends FrameLayout {
    public ImageView a;
    public ImageView b;
    public TextView c;
    public int d;

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.d, TLObject.FLAG_30), ll.C(2.0f, this.d, TLObject.FLAG_30));
    }

    public void setItemSize(int i9) {
        this.d = i9;
    }

    public void setType(int i9) {
        TextView textView = this.c;
        ImageView imageView = this.b;
        ImageView imageView2 = this.a;
        if (i9 == 0) {
            imageView2.setImageResource(R.drawable.permissions_camera1);
            imageView.setImageResource(R.drawable.permissions_camera2);
            textView.setText(LocaleController.getString(R.string.CameraPermissionText));
            imageView2.setLayoutParams(g7.e6.d(44, 44.0f, 17, 5.0f, 0.0f, 0.0f, 27.0f));
            imageView.setLayoutParams(g7.e6.d(44, 44.0f, 17, 5.0f, 0.0f, 0.0f, 27.0f));
            return;
        }
        imageView2.setImageResource(R.drawable.permissions_gallery1);
        imageView.setImageResource(R.drawable.permissions_gallery2);
        textView.setText(LocaleController.getString(R.string.GalleryPermissionText));
        imageView2.setLayoutParams(g7.e6.d(44, 44.0f, 17, 0.0f, 0.0f, 2.0f, 27.0f));
        imageView.setLayoutParams(g7.e6.d(44, 44.0f, 17, 0.0f, 0.0f, 2.0f, 27.0f));
    }
}
