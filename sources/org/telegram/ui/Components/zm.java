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

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class zm extends org.telegram.ui.av0 {
    public ArrayList a = new ArrayList();
    public final /* synthetic */ dn b;

    public zm(dn dnVar) {
        this.b = dnVar;
    }

    @Override // org.telegram.ui.av0, org.telegram.ui.iv0
    public final void D() {
        dn dnVar = this.b;
        dnVar.c();
        dnVar.i(dnVar.P.P, false);
    }

    @Override // org.telegram.ui.av0, org.telegram.ui.iv0
    public final org.telegram.ui.kv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        MediaController.PhotoEntry photoEntry;
        ArrayList arrayList;
        dn dnVar = this.b;
        ArrayList arrayList2 = dnVar.b;
        en enVar = dnVar.P;
        if (i10 >= 0 && i10 < this.a.size() && x(i10) && (photoEntry = (MediaController.PhotoEntry) this.a.get(i10)) != null) {
            int size = arrayList2.size();
            cn cnVar = null;
            bn bnVar = null;
            for (int i11 = 0; i11 < size; i11++) {
                cnVar = (cn) arrayList2.get(i11);
                if (cnVar != null && (arrayList = cnVar.h) != null) {
                    int size2 = arrayList.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= size2) {
                            break;
                        }
                        bn bnVar2 = (bn) arrayList.get(i12);
                        if (bnVar2 != null && bnVar2.b == photoEntry && bnVar2.k > 0.5d) {
                            bnVar = (bn) arrayList.get(i12);
                            break;
                        }
                        i12++;
                    }
                    if (bnVar != null) {
                        break;
                    }
                }
            }
            if (cnVar != null && bnVar != null) {
                org.telegram.ui.kv0 kv0Var = new org.telegram.ui.kv0();
                int[] iArr = new int[2];
                dnVar.getLocationInWindow(iArr);
                if (Build.VERSION.SDK_INT < 26) {
                    iArr[0] = iArr[0] - enVar.b.getLeftInset();
                }
                kv0Var.b = iArr[0];
                kv0Var.c = iArr[1] + ((int) cnVar.a);
                kv0Var.k = 1.0f;
                kv0Var.d = dnVar;
                ImageReceiver imageReceiver = bnVar.c;
                kv0Var.a = imageReceiver;
                kv0Var.e = imageReceiver.getBitmapSafe();
                kv0Var.h = new int[]{(int) r8.left, (int) r8.top, (int) r8.right, (int) r8.bottom};
                RectF rectF = bnVar.q;
                kv0Var.j = (int) (-dnVar.getY());
                kv0Var.i = dnVar.getHeight() - ((int) (((-dnVar.getY()) + enVar.r.getHeight()) - enVar.b.n1()));
                return kv0Var;
            }
        }
        return null;
    }

    @Override // org.telegram.ui.av0, org.telegram.ui.iv0
    public final int H() {
        return this.b.h.size();
    }

    @Override // org.telegram.ui.av0, org.telegram.ui.iv0
    public final int Q(Object obj) {
        int indexOf;
        Integer valueOf = Integer.valueOf(((MediaController.PhotoEntry) obj).imageId);
        dn dnVar = this.b;
        if (dnVar.h.size() <= 1 || (indexOf = dnVar.h.indexOf(valueOf)) < 0) {
            return -1;
        }
        dnVar.h.remove(indexOf);
        dnVar.c();
        return indexOf;
    }

    @Override // org.telegram.ui.av0, org.telegram.ui.iv0
    public final int R(int i10) {
        MediaController.PhotoEntry photoEntry;
        if (i10 < 0 || i10 >= this.a.size() || (photoEntry = (MediaController.PhotoEntry) this.a.get(i10)) == null) {
            return -1;
        }
        return this.b.h.indexOf(Integer.valueOf(photoEntry.imageId));
    }

    @Override // org.telegram.ui.av0, org.telegram.ui.iv0
    public final void W(int i10) {
        MediaController.PhotoEntry photoEntry;
        ArrayList arrayList;
        boolean z10;
        if (i10 < 0 || i10 >= this.a.size() || (photoEntry = (MediaController.PhotoEntry) this.a.get(i10)) == null) {
            return;
        }
        int i11 = photoEntry.imageId;
        dn dnVar = this.b;
        dnVar.invalidate();
        for (int i12 = 0; i12 < dnVar.b.size(); i12++) {
            cn cnVar = (cn) dnVar.b.get(i12);
            if (cnVar != null && (arrayList = cnVar.h) != null) {
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    bn bnVar = (bn) arrayList.get(i13);
                    if (bnVar != null && bnVar.b.imageId == i11) {
                        bn.a(bnVar, photoEntry);
                    }
                }
                xm xmVar = cnVar.k;
                if (xmVar == null || xmVar.g == null) {
                    z10 = false;
                } else {
                    z10 = false;
                    for (int i14 = 0; i14 < cnVar.k.g.size(); i14++) {
                        if (((MediaController.PhotoEntry) cnVar.k.g.get(i14)).imageId == i11) {
                            cnVar.k.g.set(i14, photoEntry);
                            z10 = true;
                        }
                    }
                }
                if (z10) {
                    cn.a(cnVar, cnVar.k, true);
                }
            }
        }
        dnVar.g();
        dnVar.invalidate();
    }

    @Override // org.telegram.ui.av0, org.telegram.ui.iv0
    public final ArrayList c() {
        return this.b.h;
    }

    @Override // org.telegram.ui.av0, org.telegram.ui.iv0
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        if (i10 < 0 || i10 >= this.a.size()) {
            return -1;
        }
        Integer valueOf = Integer.valueOf(((MediaController.PhotoEntry) this.a.get(i10)).imageId);
        dn dnVar = this.b;
        int indexOf = dnVar.h.indexOf(valueOf);
        if (indexOf < 0) {
            dnVar.h.add(valueOf);
            dnVar.c();
            return dnVar.h.size() - 1;
        }
        if (dnVar.h.size() <= 1) {
            return -1;
        }
        dnVar.h.remove(indexOf);
        dnVar.c();
        return indexOf;
    }

    @Override // org.telegram.ui.av0, org.telegram.ui.iv0
    public final boolean u() {
        return false;
    }

    @Override // org.telegram.ui.av0, org.telegram.ui.iv0
    public final HashMap v() {
        return this.b.d;
    }

    @Override // org.telegram.ui.av0, org.telegram.ui.iv0
    public final boolean x(int i10) {
        if (i10 < 0 || i10 >= this.a.size()) {
            return false;
        }
        return this.b.h.contains(Integer.valueOf(((MediaController.PhotoEntry) this.a.get(i10)).imageId));
    }
}
