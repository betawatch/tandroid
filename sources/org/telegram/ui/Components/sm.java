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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class sm extends org.telegram.ui.tu0 {
    public ArrayList a = new ArrayList();
    public final /* synthetic */ wm b;

    public sm(wm wmVar) {
        this.b = wmVar;
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.cv0
    public final void D() {
        wm wmVar = this.b;
        wmVar.c();
        wmVar.i(wmVar.P.P, false);
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.cv0
    public final org.telegram.ui.ev0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        MediaController.PhotoEntry photoEntry;
        ArrayList arrayList;
        wm wmVar = this.b;
        ArrayList arrayList2 = wmVar.b;
        xm xmVar = wmVar.P;
        if (i10 >= 0 && i10 < this.a.size() && x(i10) && (photoEntry = (MediaController.PhotoEntry) this.a.get(i10)) != null) {
            int size = arrayList2.size();
            vm vmVar = null;
            um umVar = null;
            for (int i11 = 0; i11 < size; i11++) {
                vmVar = (vm) arrayList2.get(i11);
                if (vmVar != null && (arrayList = vmVar.h) != null) {
                    int size2 = arrayList.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= size2) {
                            break;
                        }
                        um umVar2 = (um) arrayList.get(i12);
                        if (umVar2 != null && umVar2.b == photoEntry && umVar2.k > 0.5d) {
                            umVar = (um) arrayList.get(i12);
                            break;
                        }
                        i12++;
                    }
                    if (umVar != null) {
                        break;
                    }
                }
            }
            if (vmVar != null && umVar != null) {
                org.telegram.ui.ev0 ev0Var = new org.telegram.ui.ev0();
                int[] iArr = new int[2];
                wmVar.getLocationInWindow(iArr);
                if (Build.VERSION.SDK_INT < 26) {
                    iArr[0] = iArr[0] - xmVar.b.getLeftInset();
                }
                ev0Var.b = iArr[0];
                ev0Var.c = iArr[1] + ((int) vmVar.a);
                ev0Var.k = 1.0f;
                ev0Var.d = wmVar;
                ImageReceiver imageReceiver = umVar.c;
                ev0Var.a = imageReceiver;
                ev0Var.e = imageReceiver.getBitmapSafe();
                ev0Var.h = new int[]{(int) r8.left, (int) r8.top, (int) r8.right, (int) r8.bottom};
                RectF rectF = umVar.q;
                ev0Var.j = (int) (-wmVar.getY());
                ev0Var.i = wmVar.getHeight() - ((int) (((-wmVar.getY()) + xmVar.r.getHeight()) - xmVar.b.l1()));
                return ev0Var;
            }
        }
        return null;
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.cv0
    public final int H() {
        return this.b.h.size();
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.cv0
    public final int Q(Object obj) {
        int indexOf;
        Integer valueOf = Integer.valueOf(((MediaController.PhotoEntry) obj).imageId);
        wm wmVar = this.b;
        if (wmVar.h.size() <= 1 || (indexOf = wmVar.h.indexOf(valueOf)) < 0) {
            return -1;
        }
        wmVar.h.remove(indexOf);
        wmVar.c();
        return indexOf;
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.cv0
    public final int R(int i10) {
        MediaController.PhotoEntry photoEntry;
        if (i10 < 0 || i10 >= this.a.size() || (photoEntry = (MediaController.PhotoEntry) this.a.get(i10)) == null) {
            return -1;
        }
        return this.b.h.indexOf(Integer.valueOf(photoEntry.imageId));
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.cv0
    public final void W(int i10) {
        MediaController.PhotoEntry photoEntry;
        ArrayList arrayList;
        boolean z10;
        if (i10 < 0 || i10 >= this.a.size() || (photoEntry = (MediaController.PhotoEntry) this.a.get(i10)) == null) {
            return;
        }
        int i11 = photoEntry.imageId;
        wm wmVar = this.b;
        wmVar.invalidate();
        for (int i12 = 0; i12 < wmVar.b.size(); i12++) {
            vm vmVar = (vm) wmVar.b.get(i12);
            if (vmVar != null && (arrayList = vmVar.h) != null) {
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    um umVar = (um) arrayList.get(i13);
                    if (umVar != null && umVar.b.imageId == i11) {
                        um.a(umVar, photoEntry);
                    }
                }
                pm pmVar = vmVar.k;
                if (pmVar == null || pmVar.g == null) {
                    z10 = false;
                } else {
                    z10 = false;
                    for (int i14 = 0; i14 < vmVar.k.g.size(); i14++) {
                        if (((MediaController.PhotoEntry) vmVar.k.g.get(i14)).imageId == i11) {
                            vmVar.k.g.set(i14, photoEntry);
                            z10 = true;
                        }
                    }
                }
                if (z10) {
                    vm.a(vmVar, vmVar.k, true);
                }
            }
        }
        wmVar.g();
        wmVar.invalidate();
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.cv0
    public final ArrayList c() {
        return this.b.h;
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.cv0
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        if (i10 < 0 || i10 >= this.a.size()) {
            return -1;
        }
        Integer valueOf = Integer.valueOf(((MediaController.PhotoEntry) this.a.get(i10)).imageId);
        wm wmVar = this.b;
        int indexOf = wmVar.h.indexOf(valueOf);
        if (indexOf < 0) {
            wmVar.h.add(valueOf);
            wmVar.c();
            return wmVar.h.size() - 1;
        }
        if (wmVar.h.size() <= 1) {
            return -1;
        }
        wmVar.h.remove(indexOf);
        wmVar.c();
        return indexOf;
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.cv0
    public final boolean u() {
        return false;
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.cv0
    public final HashMap v() {
        return this.b.d;
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.cv0
    public final boolean x(int i10) {
        if (i10 < 0 || i10 >= this.a.size()) {
            return false;
        }
        return this.b.h.contains(Integer.valueOf(((MediaController.PhotoEntry) this.a.get(i10)).imageId));
    }
}
