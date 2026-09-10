package org.telegram.ui.Cells;

import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.em;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
        org.telegram.ui.Components.w9 w9Var = x5Var.a;
        org.telegram.ui.Components.w9 w9Var2 = x5Var.a;
        w9Var.q(0, true);
        MediaController.PhotoEntry photoEntry = albumEntry.coverPhoto;
        if (photoEntry == null || photoEntry.path == null) {
            w9Var2.setImageDrawable(org.telegram.ui.ActionBar.j6.R4);
        } else {
            w9Var2.p(photoEntry.orientation, photoEntry.invert, true);
            if (albumEntry.coverPhoto.isVideo) {
                w9Var2.f("vthumb://" + albumEntry.coverPhoto.imageId + ":" + albumEntry.coverPhoto.path, null, org.telegram.ui.ActionBar.j6.R4);
            } else {
                w9Var2.f("thumb://" + albumEntry.coverPhoto.imageId + ":" + albumEntry.coverPhoto.path, null, org.telegram.ui.ActionBar.j6.R4);
            }
        }
        x5Var.b.setText(albumEntry.bucketName);
        x5Var.c.setText(String.format("%d", Integer.valueOf(albumEntry.photos.size())));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        View[] viewArr = this.a;
        int A = AndroidUtilities.isTablet() ? em.A(4.0f, this.c - 1, AndroidUtilities.dp(490.0f) - AndroidUtilities.dp(12.0f)) / this.c : em.A(4.0f, this.c - 1, AndroidUtilities.displaySize.x - AndroidUtilities.dp(12.0f)) / this.c;
        for (int i12 = 0; i12 < this.c; i12++) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewArr[i12].getLayoutParams();
            layoutParams.topMargin = AndroidUtilities.dp(4.0f);
            layoutParams.leftMargin = (AndroidUtilities.dp(4.0f) + A) * i12;
            layoutParams.width = A;
            layoutParams.height = A;
            layoutParams.gravity = 51;
            viewArr[i12].setLayoutParams(layoutParams);
        }
        super.onMeasure(i10, em.C(4.0f, A, TLObject.FLAG_30));
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
