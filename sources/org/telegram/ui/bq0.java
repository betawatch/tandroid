package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class bq0 extends cu0 {
    public final /* synthetic */ mq0 a;

    public bq0(mq0 mq0Var) {
        this.a = mq0Var;
    }

    @Override // org.telegram.ui.cu0, org.telegram.ui.ku0
    public final mu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        mq0 mq0Var = this.a;
        org.telegram.ui.Cells.s5 V = mq0.V(mq0Var, i10);
        if (V == null) {
            return null;
        }
        org.telegram.ui.Components.w9 imageView = V.getImageView();
        int[] iArr = new int[2];
        imageView.getLocationInWindow(iArr);
        mu0 mu0Var = new mu0();
        mu0Var.b = iArr[0];
        mu0Var.c = iArr[1];
        mu0Var.d = mq0Var.K;
        ImageReceiver imageReceiver = imageView.getImageReceiver();
        mu0Var.a = imageReceiver;
        mu0Var.e = imageReceiver.getBitmapSafe();
        mu0Var.k = V.getScale();
        V.g(false);
        return mu0Var;
    }

    @Override // org.telegram.ui.cu0, org.telegram.ui.ku0
    public final void G() {
        mq0 mq0Var = this.a;
        int childCount = mq0Var.K.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = mq0Var.K.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.s5) {
                ((org.telegram.ui.Cells.s5) childAt).g(true);
            }
        }
    }

    @Override // org.telegram.ui.cu0, org.telegram.ui.ku0
    public final int H() {
        return this.a.b.size();
    }

    @Override // org.telegram.ui.cu0, org.telegram.ui.ku0
    public final int R(Object obj) {
        Object valueOf = obj instanceof MediaController.PhotoEntry ? Integer.valueOf(((MediaController.PhotoEntry) obj).imageId) : obj instanceof MediaController.SearchImage ? ((MediaController.SearchImage) obj).id : null;
        if (valueOf == null) {
            return -1;
        }
        mq0 mq0Var = this.a;
        if (!mq0Var.b.containsKey(valueOf)) {
            return -1;
        }
        mq0Var.b.remove(valueOf);
        int indexOf = mq0Var.c.indexOf(valueOf);
        if (indexOf >= 0) {
            mq0Var.c.remove(indexOf);
        }
        if (mq0Var.e) {
            mq0Var.h0();
        }
        return indexOf;
    }

    @Override // org.telegram.ui.cu0, org.telegram.ui.ku0
    public final void X(int i10) {
        mq0 mq0Var = this.a;
        MediaController.AlbumEntry albumEntry = mq0Var.J;
        org.telegram.ui.Cells.s5 V = mq0.V(mq0Var, i10);
        if (V != null) {
            if (albumEntry == null) {
                V.e((MediaController.SearchImage) mq0Var.f.get(i10));
                return;
            }
            org.telegram.ui.Components.w9 imageView = V.getImageView();
            imageView.q(0, true);
            MediaController.PhotoEntry photoEntry = albumEntry.photos.get(i10);
            String str = photoEntry.thumbPath;
            if (str != null) {
                imageView.g(str, null, org.telegram.ui.ActionBar.k6.R4);
                return;
            }
            if (photoEntry.path == null) {
                imageView.setImageDrawable(org.telegram.ui.ActionBar.k6.R4);
                return;
            }
            imageView.p(photoEntry.orientation, photoEntry.invert, true);
            if (!photoEntry.isVideo || photoEntry.isLivePhoto()) {
                imageView.g("thumb://" + photoEntry.imageId + ":" + photoEntry.path, null, org.telegram.ui.ActionBar.k6.R4);
                return;
            }
            imageView.g("vthumb://" + photoEntry.imageId + ":" + photoEntry.path, null, org.telegram.ui.ActionBar.k6.R4);
        }
    }

    @Override // org.telegram.ui.cu0, org.telegram.ui.ku0
    public final void a0(int i10) {
        mq0 mq0Var = this.a;
        int childCount = mq0Var.K.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = mq0Var.K.getChildAt(i11);
            if (childAt.getTag() != null) {
                org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) childAt;
                int intValue = ((Integer) childAt.getTag()).intValue();
                MediaController.AlbumEntry albumEntry = mq0Var.J;
                if (albumEntry == null ? !(intValue < 0 || intValue >= mq0Var.f.size()) : !(intValue < 0 || intValue >= albumEntry.photos.size())) {
                    if (intValue == i10) {
                        s5Var.g(true);
                        return;
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.cu0, org.telegram.ui.ku0
    public final ArrayList c() {
        return this.a.c;
    }

    @Override // org.telegram.ui.cu0, org.telegram.ui.ku0
    public final ImageReceiver.BitmapHolder j(int i10) {
        org.telegram.ui.Cells.s5 V = mq0.V(this.a, i10);
        if (V != null) {
            return V.getImageView().getImageReceiver().getBitmapSafe();
        }
        return null;
    }

    @Override // org.telegram.ui.cu0, org.telegram.ui.ku0
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        int Y;
        boolean z10;
        mq0 mq0Var = this.a;
        MediaController.AlbumEntry albumEntry = mq0Var.J;
        if (albumEntry != null) {
            if (i10 < 0 || i10 >= albumEntry.photos.size()) {
                return -1;
            }
            MediaController.PhotoEntry photoEntry = mq0Var.J.photos.get(i10);
            Y = mq0Var.Y(-1, photoEntry);
            if (Y == -1) {
                photoEntry.editedInfo = videoEditedInfo;
                Y = mq0Var.c.indexOf(Integer.valueOf(photoEntry.imageId));
                z10 = true;
            } else {
                photoEntry.editedInfo = null;
                z10 = false;
            }
        } else {
            if (i10 < 0 || i10 >= mq0Var.f.size()) {
                return -1;
            }
            MediaController.SearchImage searchImage = (MediaController.SearchImage) mq0Var.f.get(i10);
            Y = mq0Var.Y(-1, searchImage);
            if (Y == -1) {
                searchImage.editedInfo = videoEditedInfo;
                Y = mq0Var.c.indexOf(searchImage.id);
                z10 = true;
            } else {
                searchImage.editedInfo = null;
                z10 = false;
            }
        }
        int childCount = mq0Var.K.getChildCount();
        int i11 = 0;
        while (true) {
            if (i11 >= childCount) {
                break;
            }
            View childAt = mq0Var.K.getChildAt(i11);
            if (((Integer) childAt.getTag()).intValue() == i10) {
                ((org.telegram.ui.Cells.s5) childAt).b(mq0Var.e ? Y : -1, z10, false);
            } else {
                i11++;
            }
        }
        mq0Var.i0(z10 ? 1 : 2);
        mq0Var.s0.a();
        return Y;
    }

    @Override // org.telegram.ui.cu0, org.telegram.ui.ku0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        mq0 mq0Var = this.a;
        ArrayList arrayList = mq0Var.f;
        MediaController.AlbumEntry albumEntry = mq0Var.J;
        if (mq0Var.b.isEmpty()) {
            if (albumEntry != null) {
                if (i10 < 0 || i10 >= albumEntry.photos.size()) {
                    return;
                }
                MediaController.PhotoEntry photoEntry = albumEntry.photos.get(i10);
                photoEntry.editedInfo = videoEditedInfo;
                mq0Var.Y(-1, photoEntry);
            } else {
                if (i10 < 0 || i10 >= arrayList.size()) {
                    return;
                }
                MediaController.SearchImage searchImage = (MediaController.SearchImage) arrayList.get(i10);
                searchImage.editedInfo = videoEditedInfo;
                mq0Var.Y(-1, searchImage);
            }
        }
        mq0Var.e0(i11, z10);
    }

    @Override // org.telegram.ui.cu0, org.telegram.ui.ku0
    public final boolean u() {
        mq0 mq0Var = this.a;
        mq0Var.s0.h(0, true, true);
        mq0Var.finishFragment();
        return true;
    }

    @Override // org.telegram.ui.cu0, org.telegram.ui.ku0
    public final HashMap v() {
        return this.a.b;
    }

    @Override // org.telegram.ui.cu0, org.telegram.ui.ku0
    public final boolean x(int i10) {
        mq0 mq0Var = this.a;
        MediaController.AlbumEntry albumEntry = mq0Var.J;
        return albumEntry != null ? i10 >= 0 && i10 < albumEntry.photos.size() && mq0Var.b.containsKey(Integer.valueOf(mq0Var.J.photos.get(i10).imageId)) : i10 >= 0 && i10 < mq0Var.f.size() && mq0Var.b.containsKey(((MediaController.SearchImage) mq0Var.f.get(i10)).id);
    }

    @Override // org.telegram.ui.cu0, org.telegram.ui.ku0
    public final boolean z() {
        return this.a.E;
    }
}
