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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class gm extends org.telegram.ui.pt0 {
    public ArrayList a = new ArrayList();
    public final /* synthetic */ km b;

    public gm(km kmVar) {
        this.b = kmVar;
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final void D() {
        km kmVar = this.b;
        kmVar.c();
        kmVar.i(kmVar.L.L, false);
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final org.telegram.ui.zt0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        MediaController.PhotoEntry photoEntry;
        ArrayList arrayList;
        km kmVar = this.b;
        ArrayList arrayList2 = kmVar.b;
        lm lmVar = kmVar.L;
        if (i10 >= 0 && i10 < this.a.size() && x(i10) && (photoEntry = (MediaController.PhotoEntry) this.a.get(i10)) != null) {
            int size = arrayList2.size();
            jm jmVar = null;
            im imVar = null;
            for (int i11 = 0; i11 < size; i11++) {
                jmVar = (jm) arrayList2.get(i11);
                if (jmVar != null && (arrayList = jmVar.h) != null) {
                    int size2 = arrayList.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= size2) {
                            break;
                        }
                        im imVar2 = (im) arrayList.get(i12);
                        if (imVar2 != null && imVar2.b == photoEntry && imVar2.k > 0.5d) {
                            imVar = (im) arrayList.get(i12);
                            break;
                        }
                        i12++;
                    }
                    if (imVar != null) {
                        break;
                    }
                }
            }
            if (jmVar != null && imVar != null) {
                org.telegram.ui.zt0 zt0Var = new org.telegram.ui.zt0();
                int[] iArr = new int[2];
                kmVar.getLocationInWindow(iArr);
                if (Build.VERSION.SDK_INT < 26) {
                    iArr[0] = iArr[0] - lmVar.b.getLeftInset();
                }
                zt0Var.b = iArr[0];
                zt0Var.c = iArr[1] + ((int) jmVar.a);
                zt0Var.k = 1.0f;
                zt0Var.d = kmVar;
                ImageReceiver imageReceiver = imVar.c;
                zt0Var.a = imageReceiver;
                zt0Var.e = imageReceiver.getBitmapSafe();
                zt0Var.h = new int[]{(int) r8.left, (int) r8.top, (int) r8.right, (int) r8.bottom};
                RectF rectF = imVar.q;
                zt0Var.j = (int) (-kmVar.getY());
                zt0Var.i = kmVar.getHeight() - ((int) (((-kmVar.getY()) + lmVar.r.getHeight()) - lmVar.b.l1()));
                return zt0Var;
            }
        }
        return null;
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final int H() {
        return this.b.h.size();
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final int Q(Object obj) {
        int indexOf;
        Integer valueOf = Integer.valueOf(((MediaController.PhotoEntry) obj).imageId);
        km kmVar = this.b;
        if (kmVar.h.size() <= 1 || (indexOf = kmVar.h.indexOf(valueOf)) < 0) {
            return -1;
        }
        kmVar.h.remove(indexOf);
        kmVar.c();
        return indexOf;
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final int R(int i10) {
        MediaController.PhotoEntry photoEntry;
        if (i10 < 0 || i10 >= this.a.size() || (photoEntry = (MediaController.PhotoEntry) this.a.get(i10)) == null) {
            return -1;
        }
        return this.b.h.indexOf(Integer.valueOf(photoEntry.imageId));
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final void W(int i10) {
        MediaController.PhotoEntry photoEntry;
        ArrayList arrayList;
        boolean z10;
        if (i10 < 0 || i10 >= this.a.size() || (photoEntry = (MediaController.PhotoEntry) this.a.get(i10)) == null) {
            return;
        }
        int i11 = photoEntry.imageId;
        km kmVar = this.b;
        kmVar.invalidate();
        for (int i12 = 0; i12 < kmVar.b.size(); i12++) {
            jm jmVar = (jm) kmVar.b.get(i12);
            if (jmVar != null && (arrayList = jmVar.h) != null) {
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    im imVar = (im) arrayList.get(i13);
                    if (imVar != null && imVar.b.imageId == i11) {
                        im.a(imVar, photoEntry);
                    }
                }
                em emVar = jmVar.k;
                if (emVar == null || emVar.g == null) {
                    z10 = false;
                } else {
                    z10 = false;
                    for (int i14 = 0; i14 < jmVar.k.g.size(); i14++) {
                        if (((MediaController.PhotoEntry) jmVar.k.g.get(i14)).imageId == i11) {
                            jmVar.k.g.set(i14, photoEntry);
                            z10 = true;
                        }
                    }
                }
                if (z10) {
                    jm.a(jmVar, jmVar.k, true);
                }
            }
        }
        kmVar.g();
        kmVar.invalidate();
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final ArrayList c() {
        return this.b.h;
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        if (i10 < 0 || i10 >= this.a.size()) {
            return -1;
        }
        Integer valueOf = Integer.valueOf(((MediaController.PhotoEntry) this.a.get(i10)).imageId);
        km kmVar = this.b;
        int indexOf = kmVar.h.indexOf(valueOf);
        if (indexOf < 0) {
            kmVar.h.add(valueOf);
            kmVar.c();
            return kmVar.h.size() - 1;
        }
        if (kmVar.h.size() <= 1) {
            return -1;
        }
        kmVar.h.remove(indexOf);
        kmVar.c();
        return indexOf;
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final boolean u() {
        return false;
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final HashMap v() {
        return this.b.d;
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final boolean x(int i10) {
        if (i10 < 0 || i10 >= this.a.size()) {
            return false;
        }
        return this.b.h.contains(Integer.valueOf(((MediaController.PhotoEntry) this.a.get(i10)).imageId));
    }
}
