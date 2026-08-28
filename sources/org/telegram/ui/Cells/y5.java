package org.telegram.ui.Cells;

import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class y5 extends FrameLayout {
    public w5[] a;
    public MediaController.AlbumEntry[] b;
    public int c;
    public x5 d;
    public Paint e;

    public final void a(int i9, MediaController.AlbumEntry albumEntry) {
        w5[] w5VarArr = this.a;
        this.b[i9] = albumEntry;
        if (albumEntry == null) {
            w5VarArr[i9].setVisibility(4);
            return;
        }
        w5 w5Var = w5VarArr[i9];
        org.telegram.ui.Components.o9 o9Var = w5Var.a;
        org.telegram.ui.Components.o9 o9Var2 = w5Var.a;
        o9Var.q(0, true);
        MediaController.PhotoEntry photoEntry = albumEntry.coverPhoto;
        if (photoEntry == null || photoEntry.path == null) {
            o9Var2.setImageDrawable(org.telegram.ui.ActionBar.f6.R4);
        } else {
            o9Var2.p(photoEntry.orientation, photoEntry.invert, true);
            if (albumEntry.coverPhoto.isVideo) {
                o9Var2.f("vthumb://" + albumEntry.coverPhoto.imageId + ":" + albumEntry.coverPhoto.path, null, org.telegram.ui.ActionBar.f6.R4);
            } else {
                o9Var2.f("thumb://" + albumEntry.coverPhoto.imageId + ":" + albumEntry.coverPhoto.path, null, org.telegram.ui.ActionBar.f6.R4);
            }
        }
        w5Var.b.setText(albumEntry.bucketName);
        w5Var.c.setText(String.format("%d", Integer.valueOf(albumEntry.photos.size())));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        View[] viewArr = this.a;
        int A = AndroidUtilities.isTablet() ? ll.A(4.0f, this.c - 1, AndroidUtilities.dp(490.0f) - AndroidUtilities.dp(12.0f)) / this.c : ll.A(4.0f, this.c - 1, AndroidUtilities.displaySize.x - AndroidUtilities.dp(12.0f)) / this.c;
        for (int i11 = 0; i11 < this.c; i11++) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewArr[i11].getLayoutParams();
            layoutParams.topMargin = AndroidUtilities.dp(4.0f);
            layoutParams.leftMargin = (AndroidUtilities.dp(4.0f) + A) * i11;
            layoutParams.width = A;
            layoutParams.height = A;
            layoutParams.gravity = 51;
            viewArr[i11].setLayoutParams(layoutParams);
        }
        super.onMeasure(i9, ll.C(4.0f, A, TLObject.FLAG_30));
    }

    public void setAlbumsCount(int i9) {
        int i10 = 0;
        while (true) {
            w5[] w5VarArr = this.a;
            if (i10 >= w5VarArr.length) {
                this.c = i9;
                return;
            } else {
                w5VarArr[i10].setVisibility(i10 < i9 ? 0 : 4);
                i10++;
            }
        }
    }

    public void setDelegate(x5 x5Var) {
        this.d = x5Var;
    }
}
