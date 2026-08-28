package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class pp0 extends rt0 {
    public final /* synthetic */ zp0 a;

    public pp0(zp0 zp0Var) {
        this.a = zp0Var;
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final bu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i9, boolean z10, boolean z11) {
        zp0 zp0Var = this.a;
        org.telegram.ui.Cells.t5 U = zp0.U(zp0Var, i9);
        if (U == null) {
            return null;
        }
        org.telegram.ui.Components.o9 imageView = U.getImageView();
        int[] iArr = new int[2];
        imageView.getLocationInWindow(iArr);
        bu0 bu0Var = new bu0();
        bu0Var.b = iArr[0];
        bu0Var.c = iArr[1];
        bu0Var.d = zp0Var.G;
        ImageReceiver imageReceiver = imageView.getImageReceiver();
        bu0Var.a = imageReceiver;
        bu0Var.e = imageReceiver.getBitmapSafe();
        bu0Var.k = U.getScale();
        U.g(false);
        return bu0Var;
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final void G() {
        zp0 zp0Var = this.a;
        int childCount = zp0Var.G.getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = zp0Var.G.getChildAt(i9);
            if (childAt instanceof org.telegram.ui.Cells.t5) {
                ((org.telegram.ui.Cells.t5) childAt).g(true);
            }
        }
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final int H() {
        return this.a.b.size();
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
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
            zp0Var.g0();
        }
        return indexOf;
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final void W(int i9) {
        zp0 zp0Var = this.a;
        MediaController.AlbumEntry albumEntry = zp0Var.F;
        org.telegram.ui.Cells.t5 U = zp0.U(zp0Var, i9);
        if (U != null) {
            if (albumEntry == null) {
                U.e((MediaController.SearchImage) zp0Var.f.get(i9));
                return;
            }
            org.telegram.ui.Components.o9 imageView = U.getImageView();
            imageView.q(0, true);
            MediaController.PhotoEntry photoEntry = albumEntry.photos.get(i9);
            String str = photoEntry.thumbPath;
            if (str != null) {
                imageView.f(str, null, org.telegram.ui.ActionBar.f6.R4);
                return;
            }
            if (photoEntry.path == null) {
                imageView.setImageDrawable(org.telegram.ui.ActionBar.f6.R4);
                return;
            }
            imageView.p(photoEntry.orientation, photoEntry.invert, true);
            if (!photoEntry.isVideo || photoEntry.isLivePhoto()) {
                imageView.f("thumb://" + photoEntry.imageId + ":" + photoEntry.path, null, org.telegram.ui.ActionBar.f6.R4);
                return;
            }
            imageView.f("vthumb://" + photoEntry.imageId + ":" + photoEntry.path, null, org.telegram.ui.ActionBar.f6.R4);
        }
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final void Z(int i9) {
        zp0 zp0Var = this.a;
        int childCount = zp0Var.G.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = zp0Var.G.getChildAt(i10);
            if (childAt.getTag() != null) {
                org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) childAt;
                int intValue = ((Integer) childAt.getTag()).intValue();
                MediaController.AlbumEntry albumEntry = zp0Var.F;
                if (albumEntry == null ? !(intValue < 0 || intValue >= zp0Var.f.size()) : !(intValue < 0 || intValue >= albumEntry.photos.size())) {
                    if (intValue == i9) {
                        t5Var.g(true);
                        return;
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final ArrayList c() {
        return this.a.c;
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final ImageReceiver.BitmapHolder j(int i9) {
        org.telegram.ui.Cells.t5 U = zp0.U(this.a, i9);
        if (U != null) {
            return U.getImageView().getImageReceiver().getBitmapSafe();
        }
        return null;
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final int k(int i9, VideoEditedInfo videoEditedInfo) {
        int X;
        boolean z10;
        zp0 zp0Var = this.a;
        MediaController.AlbumEntry albumEntry = zp0Var.F;
        if (albumEntry != null) {
            if (i9 < 0 || i9 >= albumEntry.photos.size()) {
                return -1;
            }
            MediaController.PhotoEntry photoEntry = zp0Var.F.photos.get(i9);
            X = zp0Var.X(-1, photoEntry);
            if (X == -1) {
                photoEntry.editedInfo = videoEditedInfo;
                X = zp0Var.c.indexOf(Integer.valueOf(photoEntry.imageId));
                z10 = true;
            } else {
                photoEntry.editedInfo = null;
                z10 = false;
            }
        } else {
            if (i9 < 0 || i9 >= zp0Var.f.size()) {
                return -1;
            }
            MediaController.SearchImage searchImage = (MediaController.SearchImage) zp0Var.f.get(i9);
            X = zp0Var.X(-1, searchImage);
            if (X == -1) {
                searchImage.editedInfo = videoEditedInfo;
                X = zp0Var.c.indexOf(searchImage.id);
                z10 = true;
            } else {
                searchImage.editedInfo = null;
                z10 = false;
            }
        }
        int childCount = zp0Var.G.getChildCount();
        int i10 = 0;
        while (true) {
            if (i10 >= childCount) {
                break;
            }
            View childAt = zp0Var.G.getChildAt(i10);
            if (((Integer) childAt.getTag()).intValue() == i9) {
                ((org.telegram.ui.Cells.t5) childAt).b(zp0Var.e ? X : -1, z10, false);
            } else {
                i10++;
            }
        }
        zp0Var.h0(z10 ? 1 : 2);
        zp0Var.o0.a();
        return X;
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final void o(int i9, VideoEditedInfo videoEditedInfo, boolean z10, int i10, int i11, boolean z11) {
        zp0 zp0Var = this.a;
        ArrayList arrayList = zp0Var.f;
        MediaController.AlbumEntry albumEntry = zp0Var.F;
        if (zp0Var.b.isEmpty()) {
            if (albumEntry != null) {
                if (i9 < 0 || i9 >= albumEntry.photos.size()) {
                    return;
                }
                MediaController.PhotoEntry photoEntry = albumEntry.photos.get(i9);
                photoEntry.editedInfo = videoEditedInfo;
                zp0Var.X(-1, photoEntry);
            } else {
                if (i9 < 0 || i9 >= arrayList.size()) {
                    return;
                }
                MediaController.SearchImage searchImage = (MediaController.SearchImage) arrayList.get(i9);
                searchImage.editedInfo = videoEditedInfo;
                zp0Var.X(-1, searchImage);
            }
        }
        zp0Var.d0(i10, z10);
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final boolean u() {
        zp0 zp0Var = this.a;
        zp0Var.o0.i(0, true, true);
        zp0Var.finishFragment();
        return true;
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final HashMap v() {
        return this.a.b;
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final boolean x(int i9) {
        zp0 zp0Var = this.a;
        MediaController.AlbumEntry albumEntry = zp0Var.F;
        return albumEntry != null ? i9 >= 0 && i9 < albumEntry.photos.size() && zp0Var.b.containsKey(Integer.valueOf(zp0Var.F.photos.get(i9).imageId)) : i9 >= 0 && i9 < zp0Var.f.size() && zp0Var.b.containsKey(((MediaController.SearchImage) zp0Var.f.get(i9)).id);
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final boolean z() {
        return this.a.A;
    }
}
