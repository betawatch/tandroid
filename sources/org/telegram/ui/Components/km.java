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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class km extends org.telegram.ui.fu0 {
    public ArrayList a = new ArrayList();
    public final /* synthetic */ om b;

    public km(om omVar) {
        this.b = omVar;
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final void D() {
        om omVar = this.b;
        omVar.c();
        omVar.i(omVar.M.M, false);
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final org.telegram.ui.qu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z4, boolean z10) {
        MediaController.PhotoEntry photoEntry;
        ArrayList arrayList;
        om omVar = this.b;
        ArrayList arrayList2 = omVar.b;
        pm pmVar = omVar.M;
        if (i10 >= 0 && i10 < this.a.size() && x(i10) && (photoEntry = (MediaController.PhotoEntry) this.a.get(i10)) != null) {
            int size = arrayList2.size();
            nm nmVar = null;
            mm mmVar = null;
            for (int i11 = 0; i11 < size; i11++) {
                nmVar = (nm) arrayList2.get(i11);
                if (nmVar != null && (arrayList = nmVar.h) != null) {
                    int size2 = arrayList.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= size2) {
                            break;
                        }
                        mm mmVar2 = (mm) arrayList.get(i12);
                        if (mmVar2 != null && mmVar2.b == photoEntry && mmVar2.k > 0.5d) {
                            mmVar = (mm) arrayList.get(i12);
                            break;
                        }
                        i12++;
                    }
                    if (mmVar != null) {
                        break;
                    }
                }
            }
            if (nmVar != null && mmVar != null) {
                org.telegram.ui.qu0 qu0Var = new org.telegram.ui.qu0();
                int[] iArr = new int[2];
                omVar.getLocationInWindow(iArr);
                if (Build.VERSION.SDK_INT < 26) {
                    iArr[0] = iArr[0] - pmVar.b.getLeftInset();
                }
                qu0Var.b = iArr[0];
                qu0Var.c = iArr[1] + ((int) nmVar.a);
                qu0Var.k = 1.0f;
                qu0Var.d = omVar;
                ImageReceiver imageReceiver = mmVar.c;
                qu0Var.a = imageReceiver;
                qu0Var.e = imageReceiver.getBitmapSafe();
                qu0Var.h = new int[]{(int) r8.left, (int) r8.top, (int) r8.right, (int) r8.bottom};
                RectF rectF = mmVar.q;
                qu0Var.j = (int) (-omVar.getY());
                qu0Var.i = omVar.getHeight() - ((int) (((-omVar.getY()) + pmVar.r.getHeight()) - pmVar.b.l1()));
                return qu0Var;
            }
        }
        return null;
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final int H() {
        return this.b.h.size();
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final int Q(Object obj) {
        int indexOf;
        Integer valueOf = Integer.valueOf(((MediaController.PhotoEntry) obj).imageId);
        om omVar = this.b;
        if (omVar.h.size() <= 1 || (indexOf = omVar.h.indexOf(valueOf)) < 0) {
            return -1;
        }
        omVar.h.remove(indexOf);
        omVar.c();
        return indexOf;
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final int R(int i10) {
        MediaController.PhotoEntry photoEntry;
        if (i10 < 0 || i10 >= this.a.size() || (photoEntry = (MediaController.PhotoEntry) this.a.get(i10)) == null) {
            return -1;
        }
        return this.b.h.indexOf(Integer.valueOf(photoEntry.imageId));
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final void W(int i10) {
        MediaController.PhotoEntry photoEntry;
        ArrayList arrayList;
        boolean z4;
        if (i10 < 0 || i10 >= this.a.size() || (photoEntry = (MediaController.PhotoEntry) this.a.get(i10)) == null) {
            return;
        }
        int i11 = photoEntry.imageId;
        om omVar = this.b;
        omVar.invalidate();
        for (int i12 = 0; i12 < omVar.b.size(); i12++) {
            nm nmVar = (nm) omVar.b.get(i12);
            if (nmVar != null && (arrayList = nmVar.h) != null) {
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    mm mmVar = (mm) arrayList.get(i13);
                    if (mmVar != null && mmVar.b.imageId == i11) {
                        mm.a(mmVar, photoEntry);
                    }
                }
                hm hmVar = nmVar.k;
                if (hmVar == null || hmVar.g == null) {
                    z4 = false;
                } else {
                    z4 = false;
                    for (int i14 = 0; i14 < nmVar.k.g.size(); i14++) {
                        if (((MediaController.PhotoEntry) nmVar.k.g.get(i14)).imageId == i11) {
                            nmVar.k.g.set(i14, photoEntry);
                            z4 = true;
                        }
                    }
                }
                if (z4) {
                    nm.a(nmVar, nmVar.k, true);
                }
            }
        }
        omVar.g();
        omVar.invalidate();
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final ArrayList c() {
        return this.b.h;
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        if (i10 < 0 || i10 >= this.a.size()) {
            return -1;
        }
        Integer valueOf = Integer.valueOf(((MediaController.PhotoEntry) this.a.get(i10)).imageId);
        om omVar = this.b;
        int indexOf = omVar.h.indexOf(valueOf);
        if (indexOf < 0) {
            omVar.h.add(valueOf);
            omVar.c();
            return omVar.h.size() - 1;
        }
        if (omVar.h.size() <= 1) {
            return -1;
        }
        omVar.h.remove(indexOf);
        omVar.c();
        return indexOf;
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final boolean u() {
        return false;
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final HashMap v() {
        return this.b.d;
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final boolean x(int i10) {
        if (i10 < 0 || i10 >= this.a.size()) {
            return false;
        }
        return this.b.h.contains(Integer.valueOf(((MediaController.PhotoEntry) this.a.get(i10)).imageId));
    }
}
