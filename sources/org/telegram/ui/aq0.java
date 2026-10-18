package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class aq0 extends bu0 {
    public final /* synthetic */ lq0 a;

    public aq0(lq0 lq0Var) {
        this.a = lq0Var;
    }

    @Override // org.telegram.ui.bu0, org.telegram.ui.ju0
    public final lu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        lq0 lq0Var = this.a;
        org.telegram.ui.Cells.s5 V = lq0.V(lq0Var, i10);
        if (V == null) {
            return null;
        }
        org.telegram.ui.Components.w9 imageView = V.getImageView();
        int[] iArr = new int[2];
        imageView.getLocationInWindow(iArr);
        lu0 lu0Var = new lu0();
        lu0Var.b = iArr[0];
        lu0Var.c = iArr[1];
        lu0Var.d = lq0Var.K;
        ImageReceiver imageReceiver = imageView.getImageReceiver();
        lu0Var.a = imageReceiver;
        lu0Var.e = imageReceiver.getBitmapSafe();
        lu0Var.k = V.getScale();
        V.g(false);
        return lu0Var;
    }

    @Override // org.telegram.ui.bu0, org.telegram.ui.ju0
    public final void G() {
        lq0 lq0Var = this.a;
        int childCount = lq0Var.K.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = lq0Var.K.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.s5) {
                ((org.telegram.ui.Cells.s5) childAt).g(true);
            }
        }
    }

    @Override // org.telegram.ui.bu0, org.telegram.ui.ju0
    public final int H() {
        return this.a.b.size();
    }

    @Override // org.telegram.ui.bu0, org.telegram.ui.ju0
    public final int R(Object obj) {
        Object valueOf = obj instanceof MediaController.PhotoEntry ? Integer.valueOf(((MediaController.PhotoEntry) obj).imageId) : obj instanceof MediaController.SearchImage ? ((MediaController.SearchImage) obj).id : null;
        if (valueOf == null) {
            return -1;
        }
        lq0 lq0Var = this.a;
        if (!lq0Var.b.containsKey(valueOf)) {
            return -1;
        }
        lq0Var.b.remove(valueOf);
        int indexOf = lq0Var.c.indexOf(valueOf);
        if (indexOf >= 0) {
            lq0Var.c.remove(indexOf);
        }
        if (lq0Var.e) {
            lq0Var.h0();
        }
        return indexOf;
    }

    @Override // org.telegram.ui.bu0, org.telegram.ui.ju0
    public final void X(int i10) {
        lq0 lq0Var = this.a;
        MediaController.AlbumEntry albumEntry = lq0Var.J;
        org.telegram.ui.Cells.s5 V = lq0.V(lq0Var, i10);
        if (V != null) {
            if (albumEntry == null) {
                V.e((MediaController.SearchImage) lq0Var.f.get(i10));
                return;
            }
            org.telegram.ui.Components.w9 imageView = V.getImageView();
            imageView.q(0, true);
            MediaController.PhotoEntry photoEntry = albumEntry.photos.get(i10);
            String str = photoEntry.thumbPath;
            if (str != null) {
                imageView.f(str, null, org.telegram.ui.ActionBar.h6.R4);
                return;
            }
            if (photoEntry.path == null) {
                imageView.setImageDrawable(org.telegram.ui.ActionBar.h6.R4);
                return;
            }
            imageView.p(photoEntry.orientation, photoEntry.invert, true);
            if (!photoEntry.isVideo || photoEntry.isLivePhoto()) {
                imageView.f("thumb://" + photoEntry.imageId + ":" + photoEntry.path, null, org.telegram.ui.ActionBar.h6.R4);
                return;
            }
            imageView.f("vthumb://" + photoEntry.imageId + ":" + photoEntry.path, null, org.telegram.ui.ActionBar.h6.R4);
        }
    }

    @Override // org.telegram.ui.bu0, org.telegram.ui.ju0
    public final void a0(int i10) {
        lq0 lq0Var = this.a;
        int childCount = lq0Var.K.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = lq0Var.K.getChildAt(i11);
            if (childAt.getTag() != null) {
                org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) childAt;
                int intValue = ((Integer) childAt.getTag()).intValue();
                MediaController.AlbumEntry albumEntry = lq0Var.J;
                if (albumEntry == null ? !(intValue < 0 || intValue >= lq0Var.f.size()) : !(intValue < 0 || intValue >= albumEntry.photos.size())) {
                    if (intValue == i10) {
                        s5Var.g(true);
                        return;
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.bu0, org.telegram.ui.ju0
    public final ArrayList c() {
        return this.a.c;
    }

    @Override // org.telegram.ui.bu0, org.telegram.ui.ju0
    public final ImageReceiver.BitmapHolder j(int i10) {
        org.telegram.ui.Cells.s5 V = lq0.V(this.a, i10);
        if (V != null) {
            return V.getImageView().getImageReceiver().getBitmapSafe();
        }
        return null;
    }

    @Override // org.telegram.ui.bu0, org.telegram.ui.ju0
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        int Y;
        boolean z10;
        lq0 lq0Var = this.a;
        MediaController.AlbumEntry albumEntry = lq0Var.J;
        if (albumEntry != null) {
            if (i10 < 0 || i10 >= albumEntry.photos.size()) {
                return -1;
            }
            MediaController.PhotoEntry photoEntry = lq0Var.J.photos.get(i10);
            Y = lq0Var.Y(-1, photoEntry);
            if (Y == -1) {
                photoEntry.editedInfo = videoEditedInfo;
                Y = lq0Var.c.indexOf(Integer.valueOf(photoEntry.imageId));
                z10 = true;
            } else {
                photoEntry.editedInfo = null;
                z10 = false;
            }
        } else {
            if (i10 < 0 || i10 >= lq0Var.f.size()) {
                return -1;
            }
            MediaController.SearchImage searchImage = (MediaController.SearchImage) lq0Var.f.get(i10);
            Y = lq0Var.Y(-1, searchImage);
            if (Y == -1) {
                searchImage.editedInfo = videoEditedInfo;
                Y = lq0Var.c.indexOf(searchImage.id);
                z10 = true;
            } else {
                searchImage.editedInfo = null;
                z10 = false;
            }
        }
        int childCount = lq0Var.K.getChildCount();
        int i11 = 0;
        while (true) {
            if (i11 >= childCount) {
                break;
            }
            View childAt = lq0Var.K.getChildAt(i11);
            if (((Integer) childAt.getTag()).intValue() == i10) {
                ((org.telegram.ui.Cells.s5) childAt).b(lq0Var.e ? Y : -1, z10, false);
            } else {
                i11++;
            }
        }
        lq0Var.i0(z10 ? 1 : 2);
        lq0Var.s0.a();
        return Y;
    }

    @Override // org.telegram.ui.bu0, org.telegram.ui.ju0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        lq0 lq0Var = this.a;
        ArrayList arrayList = lq0Var.f;
        MediaController.AlbumEntry albumEntry = lq0Var.J;
        if (lq0Var.b.isEmpty()) {
            if (albumEntry != null) {
                if (i10 < 0 || i10 >= albumEntry.photos.size()) {
                    return;
                }
                MediaController.PhotoEntry photoEntry = albumEntry.photos.get(i10);
                photoEntry.editedInfo = videoEditedInfo;
                lq0Var.Y(-1, photoEntry);
            } else {
                if (i10 < 0 || i10 >= arrayList.size()) {
                    return;
                }
                MediaController.SearchImage searchImage = (MediaController.SearchImage) arrayList.get(i10);
                searchImage.editedInfo = videoEditedInfo;
                lq0Var.Y(-1, searchImage);
            }
        }
        lq0Var.e0(i11, z10);
    }

    @Override // org.telegram.ui.bu0, org.telegram.ui.ju0
    public final boolean u() {
        lq0 lq0Var = this.a;
        lq0Var.s0.h(0, true, true);
        lq0Var.finishFragment();
        return true;
    }

    @Override // org.telegram.ui.bu0, org.telegram.ui.ju0
    public final HashMap v() {
        return this.a.b;
    }

    @Override // org.telegram.ui.bu0, org.telegram.ui.ju0
    public final boolean x(int i10) {
        lq0 lq0Var = this.a;
        MediaController.AlbumEntry albumEntry = lq0Var.J;
        return albumEntry != null ? i10 >= 0 && i10 < albumEntry.photos.size() && lq0Var.b.containsKey(Integer.valueOf(lq0Var.J.photos.get(i10).imageId)) : i10 >= 0 && i10 < lq0Var.f.size() && lq0Var.b.containsKey(((MediaController.SearchImage) lq0Var.f.get(i10)).id);
    }

    @Override // org.telegram.ui.bu0, org.telegram.ui.ju0
    public final boolean z() {
        return this.a.E;
    }
}
