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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class xm extends org.telegram.ui.gu0 {
    public ArrayList a = new ArrayList();
    public final /* synthetic */ bn b;

    public xm(bn bnVar) {
        this.b = bnVar;
    }

    @Override // org.telegram.ui.gu0, org.telegram.ui.ou0
    public final void D() {
        bn bnVar = this.b;
        bnVar.c();
        bnVar.i(bnVar.P.P, false);
    }

    @Override // org.telegram.ui.gu0, org.telegram.ui.ou0
    public final org.telegram.ui.qu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        MediaController.PhotoEntry photoEntry;
        ArrayList arrayList;
        bn bnVar = this.b;
        ArrayList arrayList2 = bnVar.b;
        cn cnVar = bnVar.P;
        if (i10 >= 0 && i10 < this.a.size() && x(i10) && (photoEntry = (MediaController.PhotoEntry) this.a.get(i10)) != null) {
            int size = arrayList2.size();
            an anVar = null;
            zm zmVar = null;
            for (int i11 = 0; i11 < size; i11++) {
                anVar = (an) arrayList2.get(i11);
                if (anVar != null && (arrayList = anVar.h) != null) {
                    int size2 = arrayList.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= size2) {
                            break;
                        }
                        zm zmVar2 = (zm) arrayList.get(i12);
                        if (zmVar2 != null && zmVar2.b == photoEntry && zmVar2.k > 0.5d) {
                            zmVar = (zm) arrayList.get(i12);
                            break;
                        }
                        i12++;
                    }
                    if (zmVar != null) {
                        break;
                    }
                }
            }
            if (anVar != null && zmVar != null) {
                org.telegram.ui.qu0 qu0Var = new org.telegram.ui.qu0();
                int[] iArr = new int[2];
                bnVar.getLocationInWindow(iArr);
                if (Build.VERSION.SDK_INT < 26) {
                    iArr[0] = iArr[0] - cnVar.b.getLeftInset();
                }
                qu0Var.b = iArr[0];
                qu0Var.c = iArr[1] + ((int) anVar.a);
                qu0Var.k = 1.0f;
                qu0Var.d = bnVar;
                ImageReceiver imageReceiver = zmVar.c;
                qu0Var.a = imageReceiver;
                qu0Var.e = imageReceiver.getBitmapSafe();
                qu0Var.h = new int[]{(int) r8.left, (int) r8.top, (int) r8.right, (int) r8.bottom};
                RectF rectF = zmVar.q;
                qu0Var.j = (int) (-bnVar.getY());
                qu0Var.i = bnVar.getHeight() - ((int) (((-bnVar.getY()) + cnVar.r.getHeight()) - cnVar.b.q1()));
                return qu0Var;
            }
        }
        return null;
    }

    @Override // org.telegram.ui.gu0, org.telegram.ui.ou0
    public final int H() {
        return this.b.h.size();
    }

    @Override // org.telegram.ui.gu0, org.telegram.ui.ou0
    public final int R(Object obj) {
        int indexOf;
        Integer valueOf = Integer.valueOf(((MediaController.PhotoEntry) obj).imageId);
        bn bnVar = this.b;
        if (bnVar.h.size() <= 1 || (indexOf = bnVar.h.indexOf(valueOf)) < 0) {
            return -1;
        }
        bnVar.h.remove(indexOf);
        bnVar.c();
        return indexOf;
    }

    @Override // org.telegram.ui.gu0, org.telegram.ui.ou0
    public final int S(int i10) {
        MediaController.PhotoEntry photoEntry;
        if (i10 < 0 || i10 >= this.a.size() || (photoEntry = (MediaController.PhotoEntry) this.a.get(i10)) == null) {
            return -1;
        }
        return this.b.h.indexOf(Integer.valueOf(photoEntry.imageId));
    }

    @Override // org.telegram.ui.gu0, org.telegram.ui.ou0
    public final void X(int i10) {
        MediaController.PhotoEntry photoEntry;
        ArrayList arrayList;
        boolean z10;
        if (i10 < 0 || i10 >= this.a.size() || (photoEntry = (MediaController.PhotoEntry) this.a.get(i10)) == null) {
            return;
        }
        int i11 = photoEntry.imageId;
        bn bnVar = this.b;
        bnVar.invalidate();
        for (int i12 = 0; i12 < bnVar.b.size(); i12++) {
            an anVar = (an) bnVar.b.get(i12);
            if (anVar != null && (arrayList = anVar.h) != null) {
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    zm zmVar = (zm) arrayList.get(i13);
                    if (zmVar != null && zmVar.b.imageId == i11) {
                        zm.a(zmVar, photoEntry);
                    }
                }
                vm vmVar = anVar.k;
                if (vmVar == null || vmVar.g == null) {
                    z10 = false;
                } else {
                    z10 = false;
                    for (int i14 = 0; i14 < anVar.k.g.size(); i14++) {
                        if (((MediaController.PhotoEntry) anVar.k.g.get(i14)).imageId == i11) {
                            anVar.k.g.set(i14, photoEntry);
                            z10 = true;
                        }
                    }
                }
                if (z10) {
                    an.a(anVar, anVar.k, true);
                }
            }
        }
        bnVar.g();
        bnVar.invalidate();
    }

    @Override // org.telegram.ui.gu0, org.telegram.ui.ou0
    public final ArrayList c() {
        return this.b.h;
    }

    @Override // org.telegram.ui.gu0, org.telegram.ui.ou0
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        if (i10 < 0 || i10 >= this.a.size()) {
            return -1;
        }
        Integer valueOf = Integer.valueOf(((MediaController.PhotoEntry) this.a.get(i10)).imageId);
        bn bnVar = this.b;
        int indexOf = bnVar.h.indexOf(valueOf);
        if (indexOf < 0) {
            bnVar.h.add(valueOf);
            bnVar.c();
            return bnVar.h.size() - 1;
        }
        if (bnVar.h.size() <= 1) {
            return -1;
        }
        bnVar.h.remove(indexOf);
        bnVar.c();
        return indexOf;
    }

    @Override // org.telegram.ui.gu0, org.telegram.ui.ou0
    public final boolean u() {
        return false;
    }

    @Override // org.telegram.ui.gu0, org.telegram.ui.ou0
    public final HashMap v() {
        return this.b.d;
    }

    @Override // org.telegram.ui.gu0, org.telegram.ui.ou0
    public final boolean x(int i10) {
        if (i10 < 0 || i10 >= this.a.size()) {
            return false;
        }
        return this.b.h.contains(Integer.valueOf(((MediaController.PhotoEntry) this.a.get(i10)).imageId));
    }
}
