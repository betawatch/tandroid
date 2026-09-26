package org.telegram.ui.Cells;

import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.ok;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class y5 extends FrameLayout {
    public w5[] a;
    public MediaController.AlbumEntry[] b;
    public int c;
    public x5 d;
    public Paint e;

    public final void a(int i10, MediaController.AlbumEntry albumEntry) {
        w5[] w5VarArr = this.a;
        this.b[i10] = albumEntry;
        if (albumEntry == null) {
            w5VarArr[i10].setVisibility(4);
            return;
        }
        w5 w5Var = w5VarArr[i10];
        org.telegram.ui.Components.w9 w9Var = w5Var.a;
        org.telegram.ui.Components.w9 w9Var2 = w5Var.a;
        w9Var.q(0, true);
        MediaController.PhotoEntry photoEntry = albumEntry.coverPhoto;
        if (photoEntry == null || photoEntry.path == null) {
            w9Var2.setImageDrawable(org.telegram.ui.ActionBar.h6.R4);
        } else {
            w9Var2.p(photoEntry.orientation, photoEntry.invert, true);
            if (albumEntry.coverPhoto.isVideo) {
                w9Var2.f("vthumb://" + albumEntry.coverPhoto.imageId + ":" + albumEntry.coverPhoto.path, null, org.telegram.ui.ActionBar.h6.R4);
            } else {
                w9Var2.f("thumb://" + albumEntry.coverPhoto.imageId + ":" + albumEntry.coverPhoto.path, null, org.telegram.ui.ActionBar.h6.R4);
            }
        }
        w5Var.b.setText(albumEntry.bucketName);
        w5Var.c.setText(String.format("%d", Integer.valueOf(albumEntry.photos.size())));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        View[] viewArr = this.a;
        int B = AndroidUtilities.isTablet() ? ok.B(4.0f, this.c - 1, AndroidUtilities.dp(490.0f) - AndroidUtilities.dp(12.0f)) / this.c : ok.B(4.0f, this.c - 1, AndroidUtilities.displaySize.x - AndroidUtilities.dp(12.0f)) / this.c;
        for (int i12 = 0; i12 < this.c; i12++) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewArr[i12].getLayoutParams();
            layoutParams.topMargin = AndroidUtilities.dp(4.0f);
            layoutParams.leftMargin = (AndroidUtilities.dp(4.0f) + B) * i12;
            layoutParams.width = B;
            layoutParams.height = B;
            layoutParams.gravity = 51;
            viewArr[i12].setLayoutParams(layoutParams);
        }
        super.onMeasure(i10, ok.C(4.0f, B, TLObject.FLAG_30));
    }

    public void setAlbumsCount(int i10) {
        int i11 = 0;
        while (true) {
            w5[] w5VarArr = this.a;
            if (i11 >= w5VarArr.length) {
                this.c = i10;
                return;
            } else {
                w5VarArr[i11].setVisibility(i11 < i10 ? 0 : 4);
                i11++;
            }
        }
    }

    public void setDelegate(x5 x5Var) {
        this.d = x5Var;
    }
}
