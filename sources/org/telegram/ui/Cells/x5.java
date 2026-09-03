package org.telegram.ui.Cells;

import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class x5 extends FrameLayout {
    public v5[] a;
    public MediaController.AlbumEntry[] b;
    public int c;
    public w5 d;
    public Paint e;

    public final void a(int i10, MediaController.AlbumEntry albumEntry) {
        v5[] v5VarArr = this.a;
        this.b[i10] = albumEntry;
        if (albumEntry == null) {
            v5VarArr[i10].setVisibility(4);
            return;
        }
        v5 v5Var = v5VarArr[i10];
        org.telegram.ui.Components.p9 p9Var = v5Var.a;
        org.telegram.ui.Components.p9 p9Var2 = v5Var.a;
        p9Var.q(0, true);
        MediaController.PhotoEntry photoEntry = albumEntry.coverPhoto;
        if (photoEntry == null || photoEntry.path == null) {
            p9Var2.setImageDrawable(org.telegram.ui.ActionBar.j6.R4);
        } else {
            p9Var2.p(photoEntry.orientation, photoEntry.invert, true);
            if (albumEntry.coverPhoto.isVideo) {
                p9Var2.f("vthumb://" + albumEntry.coverPhoto.imageId + ":" + albumEntry.coverPhoto.path, null, org.telegram.ui.ActionBar.j6.R4);
            } else {
                p9Var2.f("thumb://" + albumEntry.coverPhoto.imageId + ":" + albumEntry.coverPhoto.path, null, org.telegram.ui.ActionBar.j6.R4);
            }
        }
        v5Var.b.setText(albumEntry.bucketName);
        v5Var.c.setText(String.format("%d", Integer.valueOf(albumEntry.photos.size())));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        View[] viewArr = this.a;
        int z4 = AndroidUtilities.isTablet() ? org.telegram.ui.b.z(4.0f, this.c - 1, AndroidUtilities.dp(490.0f) - AndroidUtilities.dp(12.0f)) / this.c : org.telegram.ui.b.z(4.0f, this.c - 1, AndroidUtilities.displaySize.x - AndroidUtilities.dp(12.0f)) / this.c;
        for (int i12 = 0; i12 < this.c; i12++) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewArr[i12].getLayoutParams();
            layoutParams.topMargin = AndroidUtilities.dp(4.0f);
            layoutParams.leftMargin = (AndroidUtilities.dp(4.0f) + z4) * i12;
            layoutParams.width = z4;
            layoutParams.height = z4;
            layoutParams.gravity = 51;
            viewArr[i12].setLayoutParams(layoutParams);
        }
        super.onMeasure(i10, org.telegram.ui.b.B(4.0f, z4, TLObject.FLAG_30));
    }

    public void setAlbumsCount(int i10) {
        int i11 = 0;
        while (true) {
            v5[] v5VarArr = this.a;
            if (i11 >= v5VarArr.length) {
                this.c = i10;
                return;
            } else {
                v5VarArr[i11].setVisibility(i11 < i10 ? 0 : 4);
                i11++;
            }
        }
    }

    public void setDelegate(w5 w5Var) {
        this.d = w5Var;
    }
}
