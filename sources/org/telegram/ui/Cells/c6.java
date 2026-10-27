package org.telegram.ui.Cells;

import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.wh;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class c6 extends FrameLayout {
    public a6[] a;
    public MediaController.AlbumEntry[] b;
    public int c;
    public b6 d;
    public Paint e;

    public final void a(int i10, MediaController.AlbumEntry albumEntry) {
        a6[] a6VarArr = this.a;
        this.b[i10] = albumEntry;
        if (albumEntry == null) {
            a6VarArr[i10].setVisibility(4);
            return;
        }
        a6 a6Var = a6VarArr[i10];
        org.telegram.ui.Components.y9 y9Var = a6Var.a;
        org.telegram.ui.Components.y9 y9Var2 = a6Var.a;
        y9Var.q(0, true);
        MediaController.PhotoEntry photoEntry = albumEntry.coverPhoto;
        if (photoEntry == null || photoEntry.path == null) {
            y9Var2.setImageDrawable(org.telegram.ui.ActionBar.y6.R4);
        } else {
            y9Var2.p(photoEntry.orientation, photoEntry.invert, true);
            if (albumEntry.coverPhoto.isVideo) {
                y9Var2.g("vthumb://" + albumEntry.coverPhoto.imageId + ":" + albumEntry.coverPhoto.path, null, org.telegram.ui.ActionBar.y6.R4);
            } else {
                y9Var2.g("thumb://" + albumEntry.coverPhoto.imageId + ":" + albumEntry.coverPhoto.path, null, org.telegram.ui.ActionBar.y6.R4);
            }
        }
        a6Var.b.setText(albumEntry.bucketName);
        a6Var.c.setText(String.format("%d", Integer.valueOf(albumEntry.photos.size())));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        View[] viewArr = this.a;
        int C = AndroidUtilities.isTablet() ? wh.C(4.0f, this.c - 1, AndroidUtilities.dp(490.0f) - AndroidUtilities.dp(12.0f)) / this.c : wh.C(4.0f, this.c - 1, AndroidUtilities.displaySize.x - AndroidUtilities.dp(12.0f)) / this.c;
        for (int i12 = 0; i12 < this.c; i12++) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewArr[i12].getLayoutParams();
            layoutParams.topMargin = AndroidUtilities.dp(4.0f);
            layoutParams.leftMargin = (AndroidUtilities.dp(4.0f) + C) * i12;
            layoutParams.width = C;
            layoutParams.height = C;
            layoutParams.gravity = 51;
            viewArr[i12].setLayoutParams(layoutParams);
        }
        super.onMeasure(i10, wh.D(4.0f, C, TLObject.FLAG_30));
    }

    public void setAlbumsCount(int i10) {
        int i11 = 0;
        while (true) {
            a6[] a6VarArr = this.a;
            if (i11 >= a6VarArr.length) {
                this.c = i10;
                return;
            } else {
                a6VarArr[i11].setVisibility(i11 < i10 ? 0 : 4);
                i11++;
            }
        }
    }

    public void setDelegate(b6 b6Var) {
        this.d = b6Var;
    }
}
