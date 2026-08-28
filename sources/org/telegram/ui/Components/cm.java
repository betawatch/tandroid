package org.telegram.ui.Components;

import android.graphics.RectF;
import android.os.Build;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class cm extends org.telegram.ui.rt0 {
    public ArrayList a = new ArrayList();
    public final /* synthetic */ gm b;

    public cm(gm gmVar) {
        this.b = gmVar;
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final void D() {
        gm gmVar = this.b;
        gmVar.c();
        gmVar.i(gmVar.L.L, false);
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final org.telegram.ui.bu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i9, boolean z10, boolean z11) {
        MediaController.PhotoEntry photoEntry;
        ArrayList arrayList;
        gm gmVar = this.b;
        ArrayList arrayList2 = gmVar.b;
        hm hmVar = gmVar.L;
        if (i9 >= 0 && i9 < this.a.size() && x(i9) && (photoEntry = (MediaController.PhotoEntry) this.a.get(i9)) != null) {
            int size = arrayList2.size();
            fm fmVar = null;
            em emVar = null;
            for (int i10 = 0; i10 < size; i10++) {
                fmVar = (fm) arrayList2.get(i10);
                if (fmVar != null && (arrayList = fmVar.h) != null) {
                    int size2 = arrayList.size();
                    int i11 = 0;
                    while (true) {
                        if (i11 >= size2) {
                            break;
                        }
                        em emVar2 = (em) arrayList.get(i11);
                        if (emVar2 != null && emVar2.b == photoEntry && emVar2.k > 0.5d) {
                            emVar = (em) arrayList.get(i11);
                            break;
                        }
                        i11++;
                    }
                    if (emVar != null) {
                        break;
                    }
                }
            }
            if (fmVar != null && emVar != null) {
                org.telegram.ui.bu0 bu0Var = new org.telegram.ui.bu0();
                int[] iArr = new int[2];
                gmVar.getLocationInWindow(iArr);
                if (Build.VERSION.SDK_INT < 26) {
                    iArr[0] = iArr[0] - hmVar.b.getLeftInset();
                }
                bu0Var.b = iArr[0];
                bu0Var.c = iArr[1] + ((int) fmVar.a);
                bu0Var.k = 1.0f;
                bu0Var.d = gmVar;
                ImageReceiver imageReceiver = emVar.c;
                bu0Var.a = imageReceiver;
                bu0Var.e = imageReceiver.getBitmapSafe();
                bu0Var.h = new int[]{(int) r8.left, (int) r8.top, (int) r8.right, (int) r8.bottom};
                RectF rectF = emVar.q;
                bu0Var.j = (int) (-gmVar.getY());
                bu0Var.i = gmVar.getHeight() - ((int) (((-gmVar.getY()) + hmVar.r.getHeight()) - hmVar.b.l1()));
                return bu0Var;
            }
        }
        return null;
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final int H() {
        return this.b.h.size();
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final int Q(Object obj) {
        int indexOf;
        Integer valueOf = Integer.valueOf(((MediaController.PhotoEntry) obj).imageId);
        gm gmVar = this.b;
        if (gmVar.h.size() <= 1 || (indexOf = gmVar.h.indexOf(valueOf)) < 0) {
            return -1;
        }
        gmVar.h.remove(indexOf);
        gmVar.c();
        return indexOf;
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final int R(int i9) {
        MediaController.PhotoEntry photoEntry;
        if (i9 < 0 || i9 >= this.a.size() || (photoEntry = (MediaController.PhotoEntry) this.a.get(i9)) == null) {
            return -1;
        }
        return this.b.h.indexOf(Integer.valueOf(photoEntry.imageId));
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final void W(int i9) {
        MediaController.PhotoEntry photoEntry;
        ArrayList arrayList;
        boolean z10;
        if (i9 < 0 || i9 >= this.a.size() || (photoEntry = (MediaController.PhotoEntry) this.a.get(i9)) == null) {
            return;
        }
        int i10 = photoEntry.imageId;
        gm gmVar = this.b;
        gmVar.invalidate();
        for (int i11 = 0; i11 < gmVar.b.size(); i11++) {
            fm fmVar = (fm) gmVar.b.get(i11);
            if (fmVar != null && (arrayList = fmVar.h) != null) {
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    em emVar = (em) arrayList.get(i12);
                    if (emVar != null && emVar.b.imageId == i10) {
                        em.a(emVar, photoEntry);
                    }
                }
                am amVar = fmVar.k;
                if (amVar == null || amVar.g == null) {
                    z10 = false;
                } else {
                    z10 = false;
                    for (int i13 = 0; i13 < fmVar.k.g.size(); i13++) {
                        if (((MediaController.PhotoEntry) fmVar.k.g.get(i13)).imageId == i10) {
                            fmVar.k.g.set(i13, photoEntry);
                            z10 = true;
                        }
                    }
                }
                if (z10) {
                    fm.a(fmVar, fmVar.k, true);
                }
            }
        }
        gmVar.g();
        gmVar.invalidate();
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final ArrayList c() {
        return this.b.h;
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final int k(int i9, VideoEditedInfo videoEditedInfo) {
        if (i9 < 0 || i9 >= this.a.size()) {
            return -1;
        }
        Integer valueOf = Integer.valueOf(((MediaController.PhotoEntry) this.a.get(i9)).imageId);
        gm gmVar = this.b;
        int indexOf = gmVar.h.indexOf(valueOf);
        if (indexOf < 0) {
            gmVar.h.add(valueOf);
            gmVar.c();
            return gmVar.h.size() - 1;
        }
        if (gmVar.h.size() <= 1) {
            return -1;
        }
        gmVar.h.remove(indexOf);
        gmVar.c();
        return indexOf;
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final boolean u() {
        return false;
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final HashMap v() {
        return this.b.d;
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final boolean x(int i9) {
        if (i9 < 0 || i9 >= this.a.size()) {
            return false;
        }
        return this.b.h.contains(Integer.valueOf(((MediaController.PhotoEntry) this.a.get(i9)).imageId));
    }
}
