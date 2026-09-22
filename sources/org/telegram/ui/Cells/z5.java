package org.telegram.ui.Cells;

import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.rk;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class z5 extends FrameLayout {
    public x5[] a;
    public MediaController.AlbumEntry[] b;
    public int c;
    public y5 d;
    public Paint e;

    public final void a(int i10, MediaController.AlbumEntry albumEntry) {
        x5[] x5VarArr = this.a;
        this.b[i10] = albumEntry;
        if (albumEntry == null) {
            x5VarArr[i10].setVisibility(4);
            return;
        }
        x5 x5Var = x5VarArr[i10];
        org.telegram.ui.Components.v9 v9Var = x5Var.a;
        org.telegram.ui.Components.v9 v9Var2 = x5Var.a;
        v9Var.q(0, true);
        MediaController.PhotoEntry photoEntry = albumEntry.coverPhoto;
        if (photoEntry == null || photoEntry.path == null) {
            v9Var2.setImageDrawable(org.telegram.ui.ActionBar.j6.R4);
        } else {
            v9Var2.p(photoEntry.orientation, photoEntry.invert, true);
            if (albumEntry.coverPhoto.isVideo) {
                v9Var2.f("vthumb://" + albumEntry.coverPhoto.imageId + ":" + albumEntry.coverPhoto.path, null, org.telegram.ui.ActionBar.j6.R4);
            } else {
                v9Var2.f("thumb://" + albumEntry.coverPhoto.imageId + ":" + albumEntry.coverPhoto.path, null, org.telegram.ui.ActionBar.j6.R4);
            }
        }
        x5Var.b.setText(albumEntry.bucketName);
        x5Var.c.setText(String.format("%d", Integer.valueOf(albumEntry.photos.size())));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        View[] viewArr = this.a;
        int B = AndroidUtilities.isTablet() ? rk.B(4.0f, this.c - 1, AndroidUtilities.dp(490.0f) - AndroidUtilities.dp(12.0f)) / this.c : rk.B(4.0f, this.c - 1, AndroidUtilities.displaySize.x - AndroidUtilities.dp(12.0f)) / this.c;
        for (int i12 = 0; i12 < this.c; i12++) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewArr[i12].getLayoutParams();
            layoutParams.topMargin = AndroidUtilities.dp(4.0f);
            layoutParams.leftMargin = (AndroidUtilities.dp(4.0f) + B) * i12;
            layoutParams.width = B;
            layoutParams.height = B;
            layoutParams.gravity = 51;
            viewArr[i12].setLayoutParams(layoutParams);
        }
        super.onMeasure(i10, rk.C(4.0f, B, TLObject.FLAG_30));
    }

    public void setAlbumsCount(int i10) {
        int i11 = 0;
        while (true) {
            x5[] x5VarArr = this.a;
            if (i11 >= x5VarArr.length) {
                this.c = i10;
                return;
            } else {
                x5VarArr[i11].setVisibility(i11 < i10 ? 0 : 4);
                i11++;
            }
        }
    }

    public void setDelegate(y5 y5Var) {
        this.d = y5Var;
    }
}
