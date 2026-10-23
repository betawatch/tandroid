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

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class wm extends org.telegram.ui.zt0 {
    public ArrayList a = new ArrayList();
    public final /* synthetic */ an b;

    public wm(an anVar) {
        this.b = anVar;
    }

    @Override // org.telegram.ui.zt0, org.telegram.ui.hu0
    public final void D() {
        an anVar = this.b;
        anVar.c();
        anVar.i(anVar.P.P, false);
    }

    @Override // org.telegram.ui.zt0, org.telegram.ui.hu0
    public final org.telegram.ui.ju0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        MediaController.PhotoEntry photoEntry;
        ArrayList arrayList;
        an anVar = this.b;
        ArrayList arrayList2 = anVar.b;
        bn bnVar = anVar.P;
        if (i10 >= 0 && i10 < this.a.size() && x(i10) && (photoEntry = (MediaController.PhotoEntry) this.a.get(i10)) != null) {
            int size = arrayList2.size();
            zm zmVar = null;
            ym ymVar = null;
            for (int i11 = 0; i11 < size; i11++) {
                zmVar = (zm) arrayList2.get(i11);
                if (zmVar != null && (arrayList = zmVar.h) != null) {
                    int size2 = arrayList.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= size2) {
                            break;
                        }
                        ym ymVar2 = (ym) arrayList.get(i12);
                        if (ymVar2 != null && ymVar2.b == photoEntry && ymVar2.k > 0.5d) {
                            ymVar = (ym) arrayList.get(i12);
                            break;
                        }
                        i12++;
                    }
                    if (ymVar != null) {
                        break;
                    }
                }
            }
            if (zmVar != null && ymVar != null) {
                org.telegram.ui.ju0 ju0Var = new org.telegram.ui.ju0();
                int[] iArr = new int[2];
                anVar.getLocationInWindow(iArr);
                if (Build.VERSION.SDK_INT < 26) {
                    iArr[0] = iArr[0] - bnVar.b.getLeftInset();
                }
                ju0Var.b = iArr[0];
                ju0Var.c = iArr[1] + ((int) zmVar.a);
                ju0Var.k = 1.0f;
                ju0Var.d = anVar;
                ImageReceiver imageReceiver = ymVar.c;
                ju0Var.a = imageReceiver;
                ju0Var.e = imageReceiver.getBitmapSafe();
                ju0Var.h = new int[]{(int) r8.left, (int) r8.top, (int) r8.right, (int) r8.bottom};
                RectF rectF = ymVar.q;
                ju0Var.j = (int) (-anVar.getY());
                ju0Var.i = anVar.getHeight() - ((int) (((-anVar.getY()) + bnVar.r.getHeight()) - bnVar.b.n1()));
                return ju0Var;
            }
        }
        return null;
    }

    @Override // org.telegram.ui.zt0, org.telegram.ui.hu0
    public final int H() {
        return this.b.h.size();
    }

    @Override // org.telegram.ui.zt0, org.telegram.ui.hu0
    public final int R(Object obj) {
        int indexOf;
        Integer valueOf = Integer.valueOf(((MediaController.PhotoEntry) obj).imageId);
        an anVar = this.b;
        if (anVar.h.size() <= 1 || (indexOf = anVar.h.indexOf(valueOf)) < 0) {
            return -1;
        }
        anVar.h.remove(indexOf);
        anVar.c();
        return indexOf;
    }

    @Override // org.telegram.ui.zt0, org.telegram.ui.hu0
    public final int S(int i10) {
        MediaController.PhotoEntry photoEntry;
        if (i10 < 0 || i10 >= this.a.size() || (photoEntry = (MediaController.PhotoEntry) this.a.get(i10)) == null) {
            return -1;
        }
        return this.b.h.indexOf(Integer.valueOf(photoEntry.imageId));
    }

    @Override // org.telegram.ui.zt0, org.telegram.ui.hu0
    public final void X(int i10) {
        MediaController.PhotoEntry photoEntry;
        ArrayList arrayList;
        boolean z10;
        if (i10 < 0 || i10 >= this.a.size() || (photoEntry = (MediaController.PhotoEntry) this.a.get(i10)) == null) {
            return;
        }
        int i11 = photoEntry.imageId;
        an anVar = this.b;
        anVar.invalidate();
        for (int i12 = 0; i12 < anVar.b.size(); i12++) {
            zm zmVar = (zm) anVar.b.get(i12);
            if (zmVar != null && (arrayList = zmVar.h) != null) {
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    ym ymVar = (ym) arrayList.get(i13);
                    if (ymVar != null && ymVar.b.imageId == i11) {
                        ym.a(ymVar, photoEntry);
                    }
                }
                um umVar = zmVar.k;
                if (umVar == null || umVar.g == null) {
                    z10 = false;
                } else {
                    z10 = false;
                    for (int i14 = 0; i14 < zmVar.k.g.size(); i14++) {
                        if (((MediaController.PhotoEntry) zmVar.k.g.get(i14)).imageId == i11) {
                            zmVar.k.g.set(i14, photoEntry);
                            z10 = true;
                        }
                    }
                }
                if (z10) {
                    zm.a(zmVar, zmVar.k, true);
                }
            }
        }
        anVar.g();
        anVar.invalidate();
    }

    @Override // org.telegram.ui.zt0, org.telegram.ui.hu0
    public final ArrayList c() {
        return this.b.h;
    }

    @Override // org.telegram.ui.zt0, org.telegram.ui.hu0
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        if (i10 < 0 || i10 >= this.a.size()) {
            return -1;
        }
        Integer valueOf = Integer.valueOf(((MediaController.PhotoEntry) this.a.get(i10)).imageId);
        an anVar = this.b;
        int indexOf = anVar.h.indexOf(valueOf);
        if (indexOf < 0) {
            anVar.h.add(valueOf);
            anVar.c();
            return anVar.h.size() - 1;
        }
        if (anVar.h.size() <= 1) {
            return -1;
        }
        anVar.h.remove(indexOf);
        anVar.c();
        return indexOf;
    }

    @Override // org.telegram.ui.zt0, org.telegram.ui.hu0
    public final boolean u() {
        return false;
    }

    @Override // org.telegram.ui.zt0, org.telegram.ui.hu0
    public final HashMap v() {
        return this.b.d;
    }

    @Override // org.telegram.ui.zt0, org.telegram.ui.hu0
    public final boolean x(int i10) {
        if (i10 < 0 || i10 >= this.a.size()) {
            return false;
        }
        return this.b.h.contains(Integer.valueOf(((MediaController.PhotoEntry) this.a.get(i10)).imageId));
    }
}
