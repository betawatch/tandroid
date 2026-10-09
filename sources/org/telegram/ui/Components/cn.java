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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class cn extends org.telegram.ui.uu0 {
    public ArrayList a = new ArrayList();
    public final /* synthetic */ gn b;

    public cn(gn gnVar) {
        this.b = gnVar;
    }

    @Override // org.telegram.ui.uu0, org.telegram.ui.cv0
    public final void D() {
        gn gnVar = this.b;
        gnVar.c();
        gnVar.i(gnVar.P.P, false);
    }

    @Override // org.telegram.ui.uu0, org.telegram.ui.cv0
    public final org.telegram.ui.ev0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        MediaController.PhotoEntry photoEntry;
        ArrayList arrayList;
        gn gnVar = this.b;
        ArrayList arrayList2 = gnVar.b;
        hn hnVar = gnVar.P;
        if (i10 >= 0 && i10 < this.a.size() && x(i10) && (photoEntry = (MediaController.PhotoEntry) this.a.get(i10)) != null) {
            int size = arrayList2.size();
            fn fnVar = null;
            en enVar = null;
            for (int i11 = 0; i11 < size; i11++) {
                fnVar = (fn) arrayList2.get(i11);
                if (fnVar != null && (arrayList = fnVar.h) != null) {
                    int size2 = arrayList.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= size2) {
                            break;
                        }
                        en enVar2 = (en) arrayList.get(i12);
                        if (enVar2 != null && enVar2.b == photoEntry && enVar2.k > 0.5d) {
                            enVar = (en) arrayList.get(i12);
                            break;
                        }
                        i12++;
                    }
                    if (enVar != null) {
                        break;
                    }
                }
            }
            if (fnVar != null && enVar != null) {
                org.telegram.ui.ev0 ev0Var = new org.telegram.ui.ev0();
                int[] iArr = new int[2];
                gnVar.getLocationInWindow(iArr);
                if (Build.VERSION.SDK_INT < 26) {
                    iArr[0] = iArr[0] - hnVar.b.getLeftInset();
                }
                ev0Var.b = iArr[0];
                ev0Var.c = iArr[1] + ((int) fnVar.a);
                ev0Var.k = 1.0f;
                ev0Var.d = gnVar;
                ImageReceiver imageReceiver = enVar.c;
                ev0Var.a = imageReceiver;
                ev0Var.e = imageReceiver.getBitmapSafe();
                ev0Var.h = new int[]{(int) r8.left, (int) r8.top, (int) r8.right, (int) r8.bottom};
                RectF rectF = enVar.q;
                ev0Var.j = (int) (-gnVar.getY());
                ev0Var.i = gnVar.getHeight() - ((int) (((-gnVar.getY()) + hnVar.r.getHeight()) - hnVar.b.n1()));
                return ev0Var;
            }
        }
        return null;
    }

    @Override // org.telegram.ui.uu0, org.telegram.ui.cv0
    public final int H() {
        return this.b.h.size();
    }

    @Override // org.telegram.ui.uu0, org.telegram.ui.cv0
    public final int Q(Object obj) {
        int indexOf;
        Integer valueOf = Integer.valueOf(((MediaController.PhotoEntry) obj).imageId);
        gn gnVar = this.b;
        if (gnVar.h.size() <= 1 || (indexOf = gnVar.h.indexOf(valueOf)) < 0) {
            return -1;
        }
        gnVar.h.remove(indexOf);
        gnVar.c();
        return indexOf;
    }

    @Override // org.telegram.ui.uu0, org.telegram.ui.cv0
    public final int R(int i10) {
        MediaController.PhotoEntry photoEntry;
        if (i10 < 0 || i10 >= this.a.size() || (photoEntry = (MediaController.PhotoEntry) this.a.get(i10)) == null) {
            return -1;
        }
        return this.b.h.indexOf(Integer.valueOf(photoEntry.imageId));
    }

    @Override // org.telegram.ui.uu0, org.telegram.ui.cv0
    public final void W(int i10) {
        MediaController.PhotoEntry photoEntry;
        ArrayList arrayList;
        boolean z10;
        if (i10 < 0 || i10 >= this.a.size() || (photoEntry = (MediaController.PhotoEntry) this.a.get(i10)) == null) {
            return;
        }
        int i11 = photoEntry.imageId;
        gn gnVar = this.b;
        gnVar.invalidate();
        for (int i12 = 0; i12 < gnVar.b.size(); i12++) {
            fn fnVar = (fn) gnVar.b.get(i12);
            if (fnVar != null && (arrayList = fnVar.h) != null) {
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    en enVar = (en) arrayList.get(i13);
                    if (enVar != null && enVar.b.imageId == i11) {
                        en.a(enVar, photoEntry);
                    }
                }
                an anVar = fnVar.k;
                if (anVar == null || anVar.g == null) {
                    z10 = false;
                } else {
                    z10 = false;
                    for (int i14 = 0; i14 < fnVar.k.g.size(); i14++) {
                        if (((MediaController.PhotoEntry) fnVar.k.g.get(i14)).imageId == i11) {
                            fnVar.k.g.set(i14, photoEntry);
                            z10 = true;
                        }
                    }
                }
                if (z10) {
                    fn.a(fnVar, fnVar.k, true);
                }
            }
        }
        gnVar.g();
        gnVar.invalidate();
    }

    @Override // org.telegram.ui.uu0, org.telegram.ui.cv0
    public final ArrayList c() {
        return this.b.h;
    }

    @Override // org.telegram.ui.uu0, org.telegram.ui.cv0
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        if (i10 < 0 || i10 >= this.a.size()) {
            return -1;
        }
        Integer valueOf = Integer.valueOf(((MediaController.PhotoEntry) this.a.get(i10)).imageId);
        gn gnVar = this.b;
        int indexOf = gnVar.h.indexOf(valueOf);
        if (indexOf < 0) {
            gnVar.h.add(valueOf);
            gnVar.c();
            return gnVar.h.size() - 1;
        }
        if (gnVar.h.size() <= 1) {
            return -1;
        }
        gnVar.h.remove(indexOf);
        gnVar.c();
        return indexOf;
    }

    @Override // org.telegram.ui.uu0, org.telegram.ui.cv0
    public final boolean u() {
        return false;
    }

    @Override // org.telegram.ui.uu0, org.telegram.ui.cv0
    public final HashMap v() {
        return this.b.d;
    }

    @Override // org.telegram.ui.uu0, org.telegram.ui.cv0
    public final boolean x(int i10) {
        if (i10 < 0 || i10 >= this.a.size()) {
            return false;
        }
        return this.b.h.contains(Integer.valueOf(((MediaController.PhotoEntry) this.a.get(i10)).imageId));
    }
}
