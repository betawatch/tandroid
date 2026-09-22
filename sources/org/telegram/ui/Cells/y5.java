package org.telegram.ui.Cells;

import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.vl;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
        org.telegram.ui.Components.u9 u9Var = w5Var.a;
        org.telegram.ui.Components.u9 u9Var2 = w5Var.a;
        u9Var.q(0, true);
        MediaController.PhotoEntry photoEntry = albumEntry.coverPhoto;
        if (photoEntry == null || photoEntry.path == null) {
            u9Var2.setImageDrawable(org.telegram.ui.ActionBar.i6.R4);
        } else {
            u9Var2.p(photoEntry.orientation, photoEntry.invert, true);
            if (albumEntry.coverPhoto.isVideo) {
                u9Var2.f("vthumb://" + albumEntry.coverPhoto.imageId + ":" + albumEntry.coverPhoto.path, null, org.telegram.ui.ActionBar.i6.R4);
            } else {
                u9Var2.f("thumb://" + albumEntry.coverPhoto.imageId + ":" + albumEntry.coverPhoto.path, null, org.telegram.ui.ActionBar.i6.R4);
            }
        }
        w5Var.b.setText(albumEntry.bucketName);
        w5Var.c.setText(String.format("%d", Integer.valueOf(albumEntry.photos.size())));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        View[] viewArr = this.a;
        int A = AndroidUtilities.isTablet() ? vl.A(4.0f, this.c - 1, AndroidUtilities.dp(490.0f) - AndroidUtilities.dp(12.0f)) / this.c : vl.A(4.0f, this.c - 1, AndroidUtilities.displaySize.x - AndroidUtilities.dp(12.0f)) / this.c;
        for (int i12 = 0; i12 < this.c; i12++) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewArr[i12].getLayoutParams();
            layoutParams.topMargin = AndroidUtilities.dp(4.0f);
            layoutParams.leftMargin = (AndroidUtilities.dp(4.0f) + A) * i12;
            layoutParams.width = A;
            layoutParams.height = A;
            layoutParams.gravity = 51;
            viewArr[i12].setLayoutParams(layoutParams);
        }
        super.onMeasure(i10, vl.C(4.0f, A, TLObject.FLAG_30));
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
