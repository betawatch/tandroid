package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class lq0 extends ou0 {
    public final /* synthetic */ wq0 a;

    public lq0(wq0 wq0Var) {
        this.a = wq0Var;
    }

    @Override // org.telegram.ui.ou0, org.telegram.ui.wu0
    public final yu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        wq0 wq0Var = this.a;
        org.telegram.ui.Cells.t5 T = wq0.T(wq0Var, i10);
        if (T == null) {
            return null;
        }
        org.telegram.ui.Components.w9 imageView = T.getImageView();
        int[] iArr = new int[2];
        imageView.getLocationInWindow(iArr);
        yu0 yu0Var = new yu0();
        yu0Var.b = iArr[0];
        yu0Var.c = iArr[1];
        yu0Var.d = wq0Var.K;
        ImageReceiver imageReceiver = imageView.getImageReceiver();
        yu0Var.a = imageReceiver;
        yu0Var.e = imageReceiver.getBitmapSafe();
        yu0Var.k = T.getScale();
        T.g(false);
        return yu0Var;
    }

    @Override // org.telegram.ui.ou0, org.telegram.ui.wu0
    public final void G() {
        wq0 wq0Var = this.a;
        int childCount = wq0Var.K.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = wq0Var.K.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.t5) {
                ((org.telegram.ui.Cells.t5) childAt).g(true);
            }
        }
    }

    @Override // org.telegram.ui.ou0, org.telegram.ui.wu0
    public final int H() {
        return this.a.b.size();
    }

    @Override // org.telegram.ui.ou0, org.telegram.ui.wu0
    public final int Q(Object obj) {
        Object valueOf = obj instanceof MediaController.PhotoEntry ? Integer.valueOf(((MediaController.PhotoEntry) obj).imageId) : obj instanceof MediaController.SearchImage ? ((MediaController.SearchImage) obj).id : null;
        if (valueOf == null) {
            return -1;
        }
        wq0 wq0Var = this.a;
        if (!wq0Var.b.containsKey(valueOf)) {
            return -1;
        }
        wq0Var.b.remove(valueOf);
        int indexOf = wq0Var.c.indexOf(valueOf);
        if (indexOf >= 0) {
            wq0Var.c.remove(indexOf);
        }
        if (wq0Var.e) {
            wq0Var.h0();
        }
        return indexOf;
    }

    @Override // org.telegram.ui.ou0, org.telegram.ui.wu0
    public final void W(int i10) {
        wq0 wq0Var = this.a;
        MediaController.AlbumEntry albumEntry = wq0Var.J;
        org.telegram.ui.Cells.t5 T = wq0.T(wq0Var, i10);
        if (T != null) {
            if (albumEntry == null) {
                T.e((MediaController.SearchImage) wq0Var.f.get(i10));
                return;
            }
            org.telegram.ui.Components.w9 imageView = T.getImageView();
            imageView.q(0, true);
            MediaController.PhotoEntry photoEntry = albumEntry.photos.get(i10);
            String str = photoEntry.thumbPath;
            if (str != null) {
                imageView.f(str, null, org.telegram.ui.ActionBar.i6.R4);
                return;
            }
            if (photoEntry.path == null) {
                imageView.setImageDrawable(org.telegram.ui.ActionBar.i6.R4);
                return;
            }
            imageView.p(photoEntry.orientation, photoEntry.invert, true);
            if (!photoEntry.isVideo || photoEntry.isLivePhoto()) {
                imageView.f("thumb://" + photoEntry.imageId + ":" + photoEntry.path, null, org.telegram.ui.ActionBar.i6.R4);
                return;
            }
            imageView.f("vthumb://" + photoEntry.imageId + ":" + photoEntry.path, null, org.telegram.ui.ActionBar.i6.R4);
        }
    }

    @Override // org.telegram.ui.ou0, org.telegram.ui.wu0
    public final void Z(int i10) {
        wq0 wq0Var = this.a;
        int childCount = wq0Var.K.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = wq0Var.K.getChildAt(i11);
            if (childAt.getTag() != null) {
                org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) childAt;
                int intValue = ((Integer) childAt.getTag()).intValue();
                MediaController.AlbumEntry albumEntry = wq0Var.J;
                if (albumEntry == null ? !(intValue < 0 || intValue >= wq0Var.f.size()) : !(intValue < 0 || intValue >= albumEntry.photos.size())) {
                    if (intValue == i10) {
                        t5Var.g(true);
                        return;
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.ou0, org.telegram.ui.wu0
    public final ArrayList c() {
        return this.a.c;
    }

    @Override // org.telegram.ui.ou0, org.telegram.ui.wu0
    public final ImageReceiver.BitmapHolder j(int i10) {
        org.telegram.ui.Cells.t5 T = wq0.T(this.a, i10);
        if (T != null) {
            return T.getImageView().getImageReceiver().getBitmapSafe();
        }
        return null;
    }

    @Override // org.telegram.ui.ou0, org.telegram.ui.wu0
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        int X;
        boolean z10;
        wq0 wq0Var = this.a;
        MediaController.AlbumEntry albumEntry = wq0Var.J;
        if (albumEntry != null) {
            if (i10 < 0 || i10 >= albumEntry.photos.size()) {
                return -1;
            }
            MediaController.PhotoEntry photoEntry = wq0Var.J.photos.get(i10);
            X = wq0Var.X(-1, photoEntry);
            if (X == -1) {
                photoEntry.editedInfo = videoEditedInfo;
                X = wq0Var.c.indexOf(Integer.valueOf(photoEntry.imageId));
                z10 = true;
            } else {
                photoEntry.editedInfo = null;
                z10 = false;
            }
        } else {
            if (i10 < 0 || i10 >= wq0Var.f.size()) {
                return -1;
            }
            MediaController.SearchImage searchImage = (MediaController.SearchImage) wq0Var.f.get(i10);
            X = wq0Var.X(-1, searchImage);
            if (X == -1) {
                searchImage.editedInfo = videoEditedInfo;
                X = wq0Var.c.indexOf(searchImage.id);
                z10 = true;
            } else {
                searchImage.editedInfo = null;
                z10 = false;
            }
        }
        int childCount = wq0Var.K.getChildCount();
        int i11 = 0;
        while (true) {
            if (i11 >= childCount) {
                break;
            }
            View childAt = wq0Var.K.getChildAt(i11);
            if (((Integer) childAt.getTag()).intValue() == i10) {
                ((org.telegram.ui.Cells.t5) childAt).b(wq0Var.e ? X : -1, z10, false);
            } else {
                i11++;
            }
        }
        wq0Var.i0(z10 ? 1 : 2);
        wq0Var.s0.a();
        return X;
    }

    @Override // org.telegram.ui.ou0, org.telegram.ui.wu0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        wq0 wq0Var = this.a;
        ArrayList arrayList = wq0Var.f;
        MediaController.AlbumEntry albumEntry = wq0Var.J;
        if (wq0Var.b.isEmpty()) {
            if (albumEntry != null) {
                if (i10 < 0 || i10 >= albumEntry.photos.size()) {
                    return;
                }
                MediaController.PhotoEntry photoEntry = albumEntry.photos.get(i10);
                photoEntry.editedInfo = videoEditedInfo;
                wq0Var.X(-1, photoEntry);
            } else {
                if (i10 < 0 || i10 >= arrayList.size()) {
                    return;
                }
                MediaController.SearchImage searchImage = (MediaController.SearchImage) arrayList.get(i10);
                searchImage.editedInfo = videoEditedInfo;
                wq0Var.X(-1, searchImage);
            }
        }
        wq0Var.e0(i11, z10);
    }

    @Override // org.telegram.ui.ou0, org.telegram.ui.wu0
    public final boolean u() {
        wq0 wq0Var = this.a;
        wq0Var.s0.h(0, true, true);
        wq0Var.finishFragment();
        return true;
    }

    @Override // org.telegram.ui.ou0, org.telegram.ui.wu0
    public final HashMap v() {
        return this.a.b;
    }

    @Override // org.telegram.ui.ou0, org.telegram.ui.wu0
    public final boolean x(int i10) {
        wq0 wq0Var = this.a;
        MediaController.AlbumEntry albumEntry = wq0Var.J;
        return albumEntry != null ? i10 >= 0 && i10 < albumEntry.photos.size() && wq0Var.b.containsKey(Integer.valueOf(wq0Var.J.photos.get(i10).imageId)) : i10 >= 0 && i10 < wq0Var.f.size() && wq0Var.b.containsKey(((MediaController.SearchImage) wq0Var.f.get(i10)).id);
    }

    @Override // org.telegram.ui.ou0, org.telegram.ui.wu0
    public final boolean z() {
        return this.a.E;
    }
}
