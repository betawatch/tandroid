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

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class om extends org.telegram.ui.ou0 {
    public ArrayList a = new ArrayList();
    public final /* synthetic */ sm b;

    public om(sm smVar) {
        this.b = smVar;
    }

    @Override // org.telegram.ui.ou0, org.telegram.ui.wu0
    public final void D() {
        sm smVar = this.b;
        smVar.c();
        smVar.i(smVar.P.P, false);
    }

    @Override // org.telegram.ui.ou0, org.telegram.ui.wu0
    public final org.telegram.ui.yu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        MediaController.PhotoEntry photoEntry;
        ArrayList arrayList;
        sm smVar = this.b;
        ArrayList arrayList2 = smVar.b;
        tm tmVar = smVar.P;
        if (i10 >= 0 && i10 < this.a.size() && x(i10) && (photoEntry = (MediaController.PhotoEntry) this.a.get(i10)) != null) {
            int size = arrayList2.size();
            rm rmVar = null;
            qm qmVar = null;
            for (int i11 = 0; i11 < size; i11++) {
                rmVar = (rm) arrayList2.get(i11);
                if (rmVar != null && (arrayList = rmVar.h) != null) {
                    int size2 = arrayList.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= size2) {
                            break;
                        }
                        qm qmVar2 = (qm) arrayList.get(i12);
                        if (qmVar2 != null && qmVar2.b == photoEntry && qmVar2.k > 0.5d) {
                            qmVar = (qm) arrayList.get(i12);
                            break;
                        }
                        i12++;
                    }
                    if (qmVar != null) {
                        break;
                    }
                }
            }
            if (rmVar != null && qmVar != null) {
                org.telegram.ui.yu0 yu0Var = new org.telegram.ui.yu0();
                int[] iArr = new int[2];
                smVar.getLocationInWindow(iArr);
                if (Build.VERSION.SDK_INT < 26) {
                    iArr[0] = iArr[0] - tmVar.b.getLeftInset();
                }
                yu0Var.b = iArr[0];
                yu0Var.c = iArr[1] + ((int) rmVar.a);
                yu0Var.k = 1.0f;
                yu0Var.d = smVar;
                ImageReceiver imageReceiver = qmVar.c;
                yu0Var.a = imageReceiver;
                yu0Var.e = imageReceiver.getBitmapSafe();
                yu0Var.h = new int[]{(int) r8.left, (int) r8.top, (int) r8.right, (int) r8.bottom};
                RectF rectF = qmVar.q;
                yu0Var.j = (int) (-smVar.getY());
                yu0Var.i = smVar.getHeight() - ((int) (((-smVar.getY()) + tmVar.r.getHeight()) - tmVar.b.l1()));
                return yu0Var;
            }
        }
        return null;
    }

    @Override // org.telegram.ui.ou0, org.telegram.ui.wu0
    public final int H() {
        return this.b.h.size();
    }

    @Override // org.telegram.ui.ou0, org.telegram.ui.wu0
    public final int Q(Object obj) {
        int indexOf;
        Integer valueOf = Integer.valueOf(((MediaController.PhotoEntry) obj).imageId);
        sm smVar = this.b;
        if (smVar.h.size() <= 1 || (indexOf = smVar.h.indexOf(valueOf)) < 0) {
            return -1;
        }
        smVar.h.remove(indexOf);
        smVar.c();
        return indexOf;
    }

    @Override // org.telegram.ui.ou0, org.telegram.ui.wu0
    public final int R(int i10) {
        MediaController.PhotoEntry photoEntry;
        if (i10 < 0 || i10 >= this.a.size() || (photoEntry = (MediaController.PhotoEntry) this.a.get(i10)) == null) {
            return -1;
        }
        return this.b.h.indexOf(Integer.valueOf(photoEntry.imageId));
    }

    @Override // org.telegram.ui.ou0, org.telegram.ui.wu0
    public final void W(int i10) {
        MediaController.PhotoEntry photoEntry;
        ArrayList arrayList;
        boolean z10;
        if (i10 < 0 || i10 >= this.a.size() || (photoEntry = (MediaController.PhotoEntry) this.a.get(i10)) == null) {
            return;
        }
        int i11 = photoEntry.imageId;
        sm smVar = this.b;
        smVar.invalidate();
        for (int i12 = 0; i12 < smVar.b.size(); i12++) {
            rm rmVar = (rm) smVar.b.get(i12);
            if (rmVar != null && (arrayList = rmVar.h) != null) {
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    qm qmVar = (qm) arrayList.get(i13);
                    if (qmVar != null && qmVar.b.imageId == i11) {
                        qm.a(qmVar, photoEntry);
                    }
                }
                mm mmVar = rmVar.k;
                if (mmVar == null || mmVar.g == null) {
                    z10 = false;
                } else {
                    z10 = false;
                    for (int i14 = 0; i14 < rmVar.k.g.size(); i14++) {
                        if (((MediaController.PhotoEntry) rmVar.k.g.get(i14)).imageId == i11) {
                            rmVar.k.g.set(i14, photoEntry);
                            z10 = true;
                        }
                    }
                }
                if (z10) {
                    rm.a(rmVar, rmVar.k, true);
                }
            }
        }
        smVar.g();
        smVar.invalidate();
    }

    @Override // org.telegram.ui.ou0, org.telegram.ui.wu0
    public final ArrayList c() {
        return this.b.h;
    }

    @Override // org.telegram.ui.ou0, org.telegram.ui.wu0
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        if (i10 < 0 || i10 >= this.a.size()) {
            return -1;
        }
        Integer valueOf = Integer.valueOf(((MediaController.PhotoEntry) this.a.get(i10)).imageId);
        sm smVar = this.b;
        int indexOf = smVar.h.indexOf(valueOf);
        if (indexOf < 0) {
            smVar.h.add(valueOf);
            smVar.c();
            return smVar.h.size() - 1;
        }
        if (smVar.h.size() <= 1) {
            return -1;
        }
        smVar.h.remove(indexOf);
        smVar.c();
        return indexOf;
    }

    @Override // org.telegram.ui.ou0, org.telegram.ui.wu0
    public final boolean u() {
        return false;
    }

    @Override // org.telegram.ui.ou0, org.telegram.ui.wu0
    public final HashMap v() {
        return this.b.d;
    }

    @Override // org.telegram.ui.ou0, org.telegram.ui.wu0
    public final boolean x(int i10) {
        if (i10 < 0 || i10 >= this.a.size()) {
            return false;
        }
        return this.b.h.contains(Integer.valueOf(((MediaController.PhotoEntry) this.a.get(i10)).imageId));
    }
}
