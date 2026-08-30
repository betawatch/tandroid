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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class jm extends org.telegram.ui.yt0 {
    public ArrayList a = new ArrayList();
    public final /* synthetic */ nm b;

    public jm(nm nmVar) {
        this.b = nmVar;
    }

    @Override // org.telegram.ui.yt0, org.telegram.ui.hu0
    public final void D() {
        nm nmVar = this.b;
        nmVar.c();
        nmVar.i(nmVar.M.M, false);
    }

    @Override // org.telegram.ui.yt0, org.telegram.ui.hu0
    public final org.telegram.ui.ju0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z4, boolean z10) {
        MediaController.PhotoEntry photoEntry;
        ArrayList arrayList;
        nm nmVar = this.b;
        ArrayList arrayList2 = nmVar.b;
        om omVar = nmVar.M;
        if (i10 >= 0 && i10 < this.a.size() && x(i10) && (photoEntry = (MediaController.PhotoEntry) this.a.get(i10)) != null) {
            int size = arrayList2.size();
            mm mmVar = null;
            lm lmVar = null;
            for (int i11 = 0; i11 < size; i11++) {
                mmVar = (mm) arrayList2.get(i11);
                if (mmVar != null && (arrayList = mmVar.h) != null) {
                    int size2 = arrayList.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= size2) {
                            break;
                        }
                        lm lmVar2 = (lm) arrayList.get(i12);
                        if (lmVar2 != null && lmVar2.b == photoEntry && lmVar2.k > 0.5d) {
                            lmVar = (lm) arrayList.get(i12);
                            break;
                        }
                        i12++;
                    }
                    if (lmVar != null) {
                        break;
                    }
                }
            }
            if (mmVar != null && lmVar != null) {
                org.telegram.ui.ju0 ju0Var = new org.telegram.ui.ju0();
                int[] iArr = new int[2];
                nmVar.getLocationInWindow(iArr);
                if (Build.VERSION.SDK_INT < 26) {
                    iArr[0] = iArr[0] - omVar.b.getLeftInset();
                }
                ju0Var.b = iArr[0];
                ju0Var.c = iArr[1] + ((int) mmVar.a);
                ju0Var.k = 1.0f;
                ju0Var.d = nmVar;
                ImageReceiver imageReceiver = lmVar.c;
                ju0Var.a = imageReceiver;
                ju0Var.e = imageReceiver.getBitmapSafe();
                ju0Var.h = new int[]{(int) r8.left, (int) r8.top, (int) r8.right, (int) r8.bottom};
                RectF rectF = lmVar.q;
                ju0Var.j = (int) (-nmVar.getY());
                ju0Var.i = nmVar.getHeight() - ((int) (((-nmVar.getY()) + omVar.r.getHeight()) - omVar.b.l1()));
                return ju0Var;
            }
        }
        return null;
    }

    @Override // org.telegram.ui.yt0, org.telegram.ui.hu0
    public final int H() {
        return this.b.h.size();
    }

    @Override // org.telegram.ui.yt0, org.telegram.ui.hu0
    public final int Q(Object obj) {
        int indexOf;
        Integer valueOf = Integer.valueOf(((MediaController.PhotoEntry) obj).imageId);
        nm nmVar = this.b;
        if (nmVar.h.size() <= 1 || (indexOf = nmVar.h.indexOf(valueOf)) < 0) {
            return -1;
        }
        nmVar.h.remove(indexOf);
        nmVar.c();
        return indexOf;
    }

    @Override // org.telegram.ui.yt0, org.telegram.ui.hu0
    public final int R(int i10) {
        MediaController.PhotoEntry photoEntry;
        if (i10 < 0 || i10 >= this.a.size() || (photoEntry = (MediaController.PhotoEntry) this.a.get(i10)) == null) {
            return -1;
        }
        return this.b.h.indexOf(Integer.valueOf(photoEntry.imageId));
    }

    @Override // org.telegram.ui.yt0, org.telegram.ui.hu0
    public final void W(int i10) {
        MediaController.PhotoEntry photoEntry;
        ArrayList arrayList;
        boolean z4;
        if (i10 < 0 || i10 >= this.a.size() || (photoEntry = (MediaController.PhotoEntry) this.a.get(i10)) == null) {
            return;
        }
        int i11 = photoEntry.imageId;
        nm nmVar = this.b;
        nmVar.invalidate();
        for (int i12 = 0; i12 < nmVar.b.size(); i12++) {
            mm mmVar = (mm) nmVar.b.get(i12);
            if (mmVar != null && (arrayList = mmVar.h) != null) {
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    lm lmVar = (lm) arrayList.get(i13);
                    if (lmVar != null && lmVar.b.imageId == i11) {
                        lm.a(lmVar, photoEntry);
                    }
                }
                gm gmVar = mmVar.k;
                if (gmVar == null || gmVar.g == null) {
                    z4 = false;
                } else {
                    z4 = false;
                    for (int i14 = 0; i14 < mmVar.k.g.size(); i14++) {
                        if (((MediaController.PhotoEntry) mmVar.k.g.get(i14)).imageId == i11) {
                            mmVar.k.g.set(i14, photoEntry);
                            z4 = true;
                        }
                    }
                }
                if (z4) {
                    mm.a(mmVar, mmVar.k, true);
                }
            }
        }
        nmVar.g();
        nmVar.invalidate();
    }

    @Override // org.telegram.ui.yt0, org.telegram.ui.hu0
    public final ArrayList c() {
        return this.b.h;
    }

    @Override // org.telegram.ui.yt0, org.telegram.ui.hu0
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        if (i10 < 0 || i10 >= this.a.size()) {
            return -1;
        }
        Integer valueOf = Integer.valueOf(((MediaController.PhotoEntry) this.a.get(i10)).imageId);
        nm nmVar = this.b;
        int indexOf = nmVar.h.indexOf(valueOf);
        if (indexOf < 0) {
            nmVar.h.add(valueOf);
            nmVar.c();
            return nmVar.h.size() - 1;
        }
        if (nmVar.h.size() <= 1) {
            return -1;
        }
        nmVar.h.remove(indexOf);
        nmVar.c();
        return indexOf;
    }

    @Override // org.telegram.ui.yt0, org.telegram.ui.hu0
    public final boolean u() {
        return false;
    }

    @Override // org.telegram.ui.yt0, org.telegram.ui.hu0
    public final HashMap v() {
        return this.b.d;
    }

    @Override // org.telegram.ui.yt0, org.telegram.ui.hu0
    public final boolean x(int i10) {
        if (i10 < 0 || i10 >= this.a.size()) {
            return false;
        }
        return this.b.h.contains(Integer.valueOf(((MediaController.PhotoEntry) this.a.get(i10)).imageId));
    }
}
