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

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class nm extends org.telegram.ui.lu0 {
    public ArrayList a = new ArrayList();
    public final /* synthetic */ rm b;

    public nm(rm rmVar) {
        this.b = rmVar;
    }

    @Override // org.telegram.ui.lu0, org.telegram.ui.tu0
    public final void D() {
        rm rmVar = this.b;
        rmVar.c();
        rmVar.i(rmVar.P.P, false);
    }

    @Override // org.telegram.ui.lu0, org.telegram.ui.tu0
    public final org.telegram.ui.vu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        MediaController.PhotoEntry photoEntry;
        ArrayList arrayList;
        rm rmVar = this.b;
        ArrayList arrayList2 = rmVar.b;
        sm smVar = rmVar.P;
        if (i10 >= 0 && i10 < this.a.size() && x(i10) && (photoEntry = (MediaController.PhotoEntry) this.a.get(i10)) != null) {
            int size = arrayList2.size();
            qm qmVar = null;
            pm pmVar = null;
            for (int i11 = 0; i11 < size; i11++) {
                qmVar = (qm) arrayList2.get(i11);
                if (qmVar != null && (arrayList = qmVar.h) != null) {
                    int size2 = arrayList.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= size2) {
                            break;
                        }
                        pm pmVar2 = (pm) arrayList.get(i12);
                        if (pmVar2 != null && pmVar2.b == photoEntry && pmVar2.k > 0.5d) {
                            pmVar = (pm) arrayList.get(i12);
                            break;
                        }
                        i12++;
                    }
                    if (pmVar != null) {
                        break;
                    }
                }
            }
            if (qmVar != null && pmVar != null) {
                org.telegram.ui.vu0 vu0Var = new org.telegram.ui.vu0();
                int[] iArr = new int[2];
                rmVar.getLocationInWindow(iArr);
                if (Build.VERSION.SDK_INT < 26) {
                    iArr[0] = iArr[0] - smVar.b.getLeftInset();
                }
                vu0Var.b = iArr[0];
                vu0Var.c = iArr[1] + ((int) qmVar.a);
                vu0Var.k = 1.0f;
                vu0Var.d = rmVar;
                ImageReceiver imageReceiver = pmVar.c;
                vu0Var.a = imageReceiver;
                vu0Var.e = imageReceiver.getBitmapSafe();
                vu0Var.h = new int[]{(int) r8.left, (int) r8.top, (int) r8.right, (int) r8.bottom};
                RectF rectF = pmVar.q;
                vu0Var.j = (int) (-rmVar.getY());
                vu0Var.i = rmVar.getHeight() - ((int) (((-rmVar.getY()) + smVar.r.getHeight()) - smVar.b.l1()));
                return vu0Var;
            }
        }
        return null;
    }

    @Override // org.telegram.ui.lu0, org.telegram.ui.tu0
    public final int H() {
        return this.b.h.size();
    }

    @Override // org.telegram.ui.lu0, org.telegram.ui.tu0
    public final int Q(Object obj) {
        int indexOf;
        Integer valueOf = Integer.valueOf(((MediaController.PhotoEntry) obj).imageId);
        rm rmVar = this.b;
        if (rmVar.h.size() <= 1 || (indexOf = rmVar.h.indexOf(valueOf)) < 0) {
            return -1;
        }
        rmVar.h.remove(indexOf);
        rmVar.c();
        return indexOf;
    }

    @Override // org.telegram.ui.lu0, org.telegram.ui.tu0
    public final int R(int i10) {
        MediaController.PhotoEntry photoEntry;
        if (i10 < 0 || i10 >= this.a.size() || (photoEntry = (MediaController.PhotoEntry) this.a.get(i10)) == null) {
            return -1;
        }
        return this.b.h.indexOf(Integer.valueOf(photoEntry.imageId));
    }

    @Override // org.telegram.ui.lu0, org.telegram.ui.tu0
    public final void W(int i10) {
        MediaController.PhotoEntry photoEntry;
        ArrayList arrayList;
        boolean z10;
        if (i10 < 0 || i10 >= this.a.size() || (photoEntry = (MediaController.PhotoEntry) this.a.get(i10)) == null) {
            return;
        }
        int i11 = photoEntry.imageId;
        rm rmVar = this.b;
        rmVar.invalidate();
        for (int i12 = 0; i12 < rmVar.b.size(); i12++) {
            qm qmVar = (qm) rmVar.b.get(i12);
            if (qmVar != null && (arrayList = qmVar.h) != null) {
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    pm pmVar = (pm) arrayList.get(i13);
                    if (pmVar != null && pmVar.b.imageId == i11) {
                        pm.a(pmVar, photoEntry);
                    }
                }
                lm lmVar = qmVar.k;
                if (lmVar == null || lmVar.g == null) {
                    z10 = false;
                } else {
                    z10 = false;
                    for (int i14 = 0; i14 < qmVar.k.g.size(); i14++) {
                        if (((MediaController.PhotoEntry) qmVar.k.g.get(i14)).imageId == i11) {
                            qmVar.k.g.set(i14, photoEntry);
                            z10 = true;
                        }
                    }
                }
                if (z10) {
                    qm.a(qmVar, qmVar.k, true);
                }
            }
        }
        rmVar.g();
        rmVar.invalidate();
    }

    @Override // org.telegram.ui.lu0, org.telegram.ui.tu0
    public final ArrayList c() {
        return this.b.h;
    }

    @Override // org.telegram.ui.lu0, org.telegram.ui.tu0
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        if (i10 < 0 || i10 >= this.a.size()) {
            return -1;
        }
        Integer valueOf = Integer.valueOf(((MediaController.PhotoEntry) this.a.get(i10)).imageId);
        rm rmVar = this.b;
        int indexOf = rmVar.h.indexOf(valueOf);
        if (indexOf < 0) {
            rmVar.h.add(valueOf);
            rmVar.c();
            return rmVar.h.size() - 1;
        }
        if (rmVar.h.size() <= 1) {
            return -1;
        }
        rmVar.h.remove(indexOf);
        rmVar.c();
        return indexOf;
    }

    @Override // org.telegram.ui.lu0, org.telegram.ui.tu0
    public final boolean u() {
        return false;
    }

    @Override // org.telegram.ui.lu0, org.telegram.ui.tu0
    public final HashMap v() {
        return this.b.d;
    }

    @Override // org.telegram.ui.lu0, org.telegram.ui.tu0
    public final boolean x(int i10) {
        if (i10 < 0 || i10 >= this.a.size()) {
            return false;
        }
        return this.b.h.contains(Integer.valueOf(((MediaController.PhotoEntry) this.a.get(i10)).imageId));
    }
}
