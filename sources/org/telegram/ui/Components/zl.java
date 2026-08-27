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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class zl extends org.telegram.ui.st0 {
    public ArrayList a = new ArrayList();
    public final /* synthetic */ dm b;

    public zl(dm dmVar) {
        this.b = dmVar;
    }

    @Override // org.telegram.ui.st0, org.telegram.ui.au0
    public final void D() {
        dm dmVar = this.b;
        dmVar.c();
        dmVar.i(dmVar.L.L, false);
    }

    @Override // org.telegram.ui.st0, org.telegram.ui.au0
    public final org.telegram.ui.cu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        MediaController.PhotoEntry photoEntry;
        ArrayList arrayList;
        dm dmVar = this.b;
        ArrayList arrayList2 = dmVar.b;
        em emVar = dmVar.L;
        if (i10 >= 0 && i10 < this.a.size() && x(i10) && (photoEntry = (MediaController.PhotoEntry) this.a.get(i10)) != null) {
            int size = arrayList2.size();
            cm cmVar = null;
            bm bmVar = null;
            for (int i11 = 0; i11 < size; i11++) {
                cmVar = (cm) arrayList2.get(i11);
                if (cmVar != null && (arrayList = cmVar.h) != null) {
                    int size2 = arrayList.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= size2) {
                            break;
                        }
                        bm bmVar2 = (bm) arrayList.get(i12);
                        if (bmVar2 != null && bmVar2.b == photoEntry && bmVar2.k > 0.5d) {
                            bmVar = (bm) arrayList.get(i12);
                            break;
                        }
                        i12++;
                    }
                    if (bmVar != null) {
                        break;
                    }
                }
            }
            if (cmVar != null && bmVar != null) {
                org.telegram.ui.cu0 cu0Var = new org.telegram.ui.cu0();
                int[] iArr = new int[2];
                dmVar.getLocationInWindow(iArr);
                if (Build.VERSION.SDK_INT < 26) {
                    iArr[0] = iArr[0] - emVar.b.getLeftInset();
                }
                cu0Var.b = iArr[0];
                cu0Var.c = iArr[1] + ((int) cmVar.a);
                cu0Var.k = 1.0f;
                cu0Var.d = dmVar;
                ImageReceiver imageReceiver = bmVar.c;
                cu0Var.a = imageReceiver;
                cu0Var.e = imageReceiver.getBitmapSafe();
                cu0Var.h = new int[]{(int) r8.left, (int) r8.top, (int) r8.right, (int) r8.bottom};
                RectF rectF = bmVar.q;
                cu0Var.j = (int) (-dmVar.getY());
                cu0Var.i = dmVar.getHeight() - ((int) (((-dmVar.getY()) + emVar.r.getHeight()) - emVar.b.l1()));
                return cu0Var;
            }
        }
        return null;
    }

    @Override // org.telegram.ui.st0, org.telegram.ui.au0
    public final int H() {
        return this.b.h.size();
    }

    @Override // org.telegram.ui.st0, org.telegram.ui.au0
    public final int Q(Object obj) {
        int indexOf;
        Integer valueOf = Integer.valueOf(((MediaController.PhotoEntry) obj).imageId);
        dm dmVar = this.b;
        if (dmVar.h.size() <= 1 || (indexOf = dmVar.h.indexOf(valueOf)) < 0) {
            return -1;
        }
        dmVar.h.remove(indexOf);
        dmVar.c();
        return indexOf;
    }

    @Override // org.telegram.ui.st0, org.telegram.ui.au0
    public final int R(int i10) {
        MediaController.PhotoEntry photoEntry;
        if (i10 < 0 || i10 >= this.a.size() || (photoEntry = (MediaController.PhotoEntry) this.a.get(i10)) == null) {
            return -1;
        }
        return this.b.h.indexOf(Integer.valueOf(photoEntry.imageId));
    }

    @Override // org.telegram.ui.st0, org.telegram.ui.au0
    public final void W(int i10) {
        MediaController.PhotoEntry photoEntry;
        ArrayList arrayList;
        boolean z10;
        if (i10 < 0 || i10 >= this.a.size() || (photoEntry = (MediaController.PhotoEntry) this.a.get(i10)) == null) {
            return;
        }
        int i11 = photoEntry.imageId;
        dm dmVar = this.b;
        dmVar.invalidate();
        for (int i12 = 0; i12 < dmVar.b.size(); i12++) {
            cm cmVar = (cm) dmVar.b.get(i12);
            if (cmVar != null && (arrayList = cmVar.h) != null) {
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    bm bmVar = (bm) arrayList.get(i13);
                    if (bmVar != null && bmVar.b.imageId == i11) {
                        bm.a(bmVar, photoEntry);
                    }
                }
                wl wlVar = cmVar.k;
                if (wlVar == null || wlVar.g == null) {
                    z10 = false;
                } else {
                    z10 = false;
                    for (int i14 = 0; i14 < cmVar.k.g.size(); i14++) {
                        if (((MediaController.PhotoEntry) cmVar.k.g.get(i14)).imageId == i11) {
                            cmVar.k.g.set(i14, photoEntry);
                            z10 = true;
                        }
                    }
                }
                if (z10) {
                    cm.a(cmVar, cmVar.k, true);
                }
            }
        }
        dmVar.g();
        dmVar.invalidate();
    }

    @Override // org.telegram.ui.st0, org.telegram.ui.au0
    public final ArrayList c() {
        return this.b.h;
    }

    @Override // org.telegram.ui.st0, org.telegram.ui.au0
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        if (i10 < 0 || i10 >= this.a.size()) {
            return -1;
        }
        Integer valueOf = Integer.valueOf(((MediaController.PhotoEntry) this.a.get(i10)).imageId);
        dm dmVar = this.b;
        int indexOf = dmVar.h.indexOf(valueOf);
        if (indexOf < 0) {
            dmVar.h.add(valueOf);
            dmVar.c();
            return dmVar.h.size() - 1;
        }
        if (dmVar.h.size() <= 1) {
            return -1;
        }
        dmVar.h.remove(indexOf);
        dmVar.c();
        return indexOf;
    }

    @Override // org.telegram.ui.st0, org.telegram.ui.au0
    public final boolean u() {
        return false;
    }

    @Override // org.telegram.ui.st0, org.telegram.ui.au0
    public final HashMap v() {
        return this.b.d;
    }

    @Override // org.telegram.ui.st0, org.telegram.ui.au0
    public final boolean x(int i10) {
        if (i10 < 0 || i10 >= this.a.size()) {
            return false;
        }
        return this.b.h.contains(Integer.valueOf(((MediaController.PhotoEntry) this.a.get(i10)).imageId));
    }
}
