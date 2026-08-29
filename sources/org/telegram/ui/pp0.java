package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class pp0 extends pt0 {
    public final /* synthetic */ zp0 a;

    public pp0(zp0 zp0Var) {
        this.a = zp0Var;
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final zt0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        zp0 zp0Var = this.a;
        org.telegram.ui.Cells.r5 V = zp0.V(zp0Var, i10);
        if (V == null) {
            return null;
        }
        org.telegram.ui.Components.t9 imageView = V.getImageView();
        int[] iArr = new int[2];
        imageView.getLocationInWindow(iArr);
        zt0 zt0Var = new zt0();
        zt0Var.b = iArr[0];
        zt0Var.c = iArr[1];
        zt0Var.d = zp0Var.G;
        ImageReceiver imageReceiver = imageView.getImageReceiver();
        zt0Var.a = imageReceiver;
        zt0Var.e = imageReceiver.getBitmapSafe();
        zt0Var.k = V.getScale();
        V.g(false);
        return zt0Var;
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final void G() {
        zp0 zp0Var = this.a;
        int childCount = zp0Var.G.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = zp0Var.G.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.r5) {
                ((org.telegram.ui.Cells.r5) childAt).g(true);
            }
        }
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final int H() {
        return this.a.b.size();
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final int Q(Object obj) {
        Object valueOf = obj instanceof MediaController.PhotoEntry ? Integer.valueOf(((MediaController.PhotoEntry) obj).imageId) : obj instanceof MediaController.SearchImage ? ((MediaController.SearchImage) obj).id : null;
        if (valueOf == null) {
            return -1;
        }
        zp0 zp0Var = this.a;
        if (!zp0Var.b.containsKey(valueOf)) {
            return -1;
        }
        zp0Var.b.remove(valueOf);
        int indexOf = zp0Var.c.indexOf(valueOf);
        if (indexOf >= 0) {
            zp0Var.c.remove(indexOf);
        }
        if (zp0Var.e) {
            zp0Var.h0();
        }
        return indexOf;
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final void W(int i10) {
        zp0 zp0Var = this.a;
        MediaController.AlbumEntry albumEntry = zp0Var.F;
        org.telegram.ui.Cells.r5 V = zp0.V(zp0Var, i10);
        if (V != null) {
            if (albumEntry == null) {
                V.e((MediaController.SearchImage) zp0Var.f.get(i10));
                return;
            }
            org.telegram.ui.Components.t9 imageView = V.getImageView();
            imageView.q(0, true);
            MediaController.PhotoEntry photoEntry = albumEntry.photos.get(i10);
            String str = photoEntry.thumbPath;
            if (str != null) {
                imageView.f(str, null, org.telegram.ui.ActionBar.g6.R4);
                return;
            }
            if (photoEntry.path == null) {
                imageView.setImageDrawable(org.telegram.ui.ActionBar.g6.R4);
                return;
            }
            imageView.p(photoEntry.orientation, photoEntry.invert, true);
            if (!photoEntry.isVideo || photoEntry.isLivePhoto()) {
                imageView.f("thumb://" + photoEntry.imageId + ":" + photoEntry.path, null, org.telegram.ui.ActionBar.g6.R4);
                return;
            }
            imageView.f("vthumb://" + photoEntry.imageId + ":" + photoEntry.path, null, org.telegram.ui.ActionBar.g6.R4);
        }
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final void Z(int i10) {
        zp0 zp0Var = this.a;
        int childCount = zp0Var.G.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = zp0Var.G.getChildAt(i11);
            if (childAt.getTag() != null) {
                org.telegram.ui.Cells.r5 r5Var = (org.telegram.ui.Cells.r5) childAt;
                int intValue = ((Integer) childAt.getTag()).intValue();
                MediaController.AlbumEntry albumEntry = zp0Var.F;
                if (albumEntry == null ? !(intValue < 0 || intValue >= zp0Var.f.size()) : !(intValue < 0 || intValue >= albumEntry.photos.size())) {
                    if (intValue == i10) {
                        r5Var.g(true);
                        return;
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final ArrayList c() {
        return this.a.c;
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final ImageReceiver.BitmapHolder j(int i10) {
        org.telegram.ui.Cells.r5 V = zp0.V(this.a, i10);
        if (V != null) {
            return V.getImageView().getImageReceiver().getBitmapSafe();
        }
        return null;
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        int Y;
        boolean z10;
        zp0 zp0Var = this.a;
        MediaController.AlbumEntry albumEntry = zp0Var.F;
        if (albumEntry != null) {
            if (i10 < 0 || i10 >= albumEntry.photos.size()) {
                return -1;
            }
            MediaController.PhotoEntry photoEntry = zp0Var.F.photos.get(i10);
            Y = zp0Var.Y(-1, photoEntry);
            if (Y == -1) {
                photoEntry.editedInfo = videoEditedInfo;
                Y = zp0Var.c.indexOf(Integer.valueOf(photoEntry.imageId));
                z10 = true;
            } else {
                photoEntry.editedInfo = null;
                z10 = false;
            }
        } else {
            if (i10 < 0 || i10 >= zp0Var.f.size()) {
                return -1;
            }
            MediaController.SearchImage searchImage = (MediaController.SearchImage) zp0Var.f.get(i10);
            Y = zp0Var.Y(-1, searchImage);
            if (Y == -1) {
                searchImage.editedInfo = videoEditedInfo;
                Y = zp0Var.c.indexOf(searchImage.id);
                z10 = true;
            } else {
                searchImage.editedInfo = null;
                z10 = false;
            }
        }
        int childCount = zp0Var.G.getChildCount();
        int i11 = 0;
        while (true) {
            if (i11 >= childCount) {
                break;
            }
            View childAt = zp0Var.G.getChildAt(i11);
            if (((Integer) childAt.getTag()).intValue() == i10) {
                ((org.telegram.ui.Cells.r5) childAt).b(zp0Var.e ? Y : -1, z10, false);
            } else {
                i11++;
            }
        }
        zp0Var.i0(z10 ? 1 : 2);
        zp0Var.o0.a();
        return Y;
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        zp0 zp0Var = this.a;
        ArrayList arrayList = zp0Var.f;
        MediaController.AlbumEntry albumEntry = zp0Var.F;
        if (zp0Var.b.isEmpty()) {
            if (albumEntry != null) {
                if (i10 < 0 || i10 >= albumEntry.photos.size()) {
                    return;
                }
                MediaController.PhotoEntry photoEntry = albumEntry.photos.get(i10);
                photoEntry.editedInfo = videoEditedInfo;
                zp0Var.Y(-1, photoEntry);
            } else {
                if (i10 < 0 || i10 >= arrayList.size()) {
                    return;
                }
                MediaController.SearchImage searchImage = (MediaController.SearchImage) arrayList.get(i10);
                searchImage.editedInfo = videoEditedInfo;
                zp0Var.Y(-1, searchImage);
            }
        }
        zp0Var.e0(i11, z10);
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final boolean u() {
        zp0 zp0Var = this.a;
        zp0Var.o0.h(0, true, true);
        zp0Var.finishFragment();
        return true;
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final HashMap v() {
        return this.a.b;
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final boolean x(int i10) {
        zp0 zp0Var = this.a;
        MediaController.AlbumEntry albumEntry = zp0Var.F;
        return albumEntry != null ? i10 >= 0 && i10 < albumEntry.photos.size() && zp0Var.b.containsKey(Integer.valueOf(zp0Var.F.photos.get(i10).imageId)) : i10 >= 0 && i10 < zp0Var.f.size() && zp0Var.b.containsKey(((MediaController.SearchImage) zp0Var.f.get(i10)).id);
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final boolean z() {
        return this.a.A;
    }
}
