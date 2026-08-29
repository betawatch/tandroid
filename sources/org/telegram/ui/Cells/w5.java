package org.telegram.ui.Cells;

import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class w5 extends FrameLayout {
    public u5[] a;
    public MediaController.AlbumEntry[] b;
    public int c;
    public v5 d;
    public Paint e;

    public final void a(int i10, MediaController.AlbumEntry albumEntry) {
        u5[] u5VarArr = this.a;
        this.b[i10] = albumEntry;
        if (albumEntry == null) {
            u5VarArr[i10].setVisibility(4);
            return;
        }
        u5 u5Var = u5VarArr[i10];
        org.telegram.ui.Components.t9 t9Var = u5Var.a;
        org.telegram.ui.Components.t9 t9Var2 = u5Var.a;
        t9Var.q(0, true);
        MediaController.PhotoEntry photoEntry = albumEntry.coverPhoto;
        if (photoEntry == null || photoEntry.path == null) {
            t9Var2.setImageDrawable(org.telegram.ui.ActionBar.g6.R4);
        } else {
            t9Var2.p(photoEntry.orientation, photoEntry.invert, true);
            if (albumEntry.coverPhoto.isVideo) {
                t9Var2.f("vthumb://" + albumEntry.coverPhoto.imageId + ":" + albumEntry.coverPhoto.path, null, org.telegram.ui.ActionBar.g6.R4);
            } else {
                t9Var2.f("thumb://" + albumEntry.coverPhoto.imageId + ":" + albumEntry.coverPhoto.path, null, org.telegram.ui.ActionBar.g6.R4);
            }
        }
        u5Var.b.setText(albumEntry.bucketName);
        u5Var.c.setText(String.format("%d", Integer.valueOf(albumEntry.photos.size())));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        View[] viewArr = this.a;
        int z10 = AndroidUtilities.isTablet() ? org.telegram.ui.b.z(4.0f, this.c - 1, AndroidUtilities.dp(490.0f) - AndroidUtilities.dp(12.0f)) / this.c : org.telegram.ui.b.z(4.0f, this.c - 1, AndroidUtilities.displaySize.x - AndroidUtilities.dp(12.0f)) / this.c;
        for (int i12 = 0; i12 < this.c; i12++) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewArr[i12].getLayoutParams();
            layoutParams.topMargin = AndroidUtilities.dp(4.0f);
            layoutParams.leftMargin = (AndroidUtilities.dp(4.0f) + z10) * i12;
            layoutParams.width = z10;
            layoutParams.height = z10;
            layoutParams.gravity = 51;
            viewArr[i12].setLayoutParams(layoutParams);
        }
        super.onMeasure(i10, org.telegram.ui.b.B(4.0f, z10, TLObject.FLAG_30));
    }

    public void setAlbumsCount(int i10) {
        int i11 = 0;
        while (true) {
            u5[] u5VarArr = this.a;
            if (i11 >= u5VarArr.length) {
                this.c = i10;
                return;
            } else {
                u5VarArr[i11].setVisibility(i11 < i10 ? 0 : 4);
                i11++;
            }
        }
    }

    public void setDelegate(v5 v5Var) {
        this.d = v5Var;
    }
}
