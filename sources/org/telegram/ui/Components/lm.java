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

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class lm extends org.telegram.ui.su0 {
    public ArrayList a = new ArrayList();
    public final /* synthetic */ pm b;

    public lm(pm pmVar) {
        this.b = pmVar;
    }

    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    public final void D() {
        pm pmVar = this.b;
        pmVar.c();
        pmVar.i(pmVar.P.P, false);
    }

    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    public final org.telegram.ui.cv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        MediaController.PhotoEntry photoEntry;
        ArrayList arrayList;
        pm pmVar = this.b;
        ArrayList arrayList2 = pmVar.b;
        qm qmVar = pmVar.P;
        if (i10 >= 0 && i10 < this.a.size() && x(i10) && (photoEntry = (MediaController.PhotoEntry) this.a.get(i10)) != null) {
            int size = arrayList2.size();
            om omVar = null;
            nm nmVar = null;
            for (int i11 = 0; i11 < size; i11++) {
                omVar = (om) arrayList2.get(i11);
                if (omVar != null && (arrayList = omVar.h) != null) {
                    int size2 = arrayList.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= size2) {
                            break;
                        }
                        nm nmVar2 = (nm) arrayList.get(i12);
                        if (nmVar2 != null && nmVar2.b == photoEntry && nmVar2.k > 0.5d) {
                            nmVar = (nm) arrayList.get(i12);
                            break;
                        }
                        i12++;
                    }
                    if (nmVar != null) {
                        break;
                    }
                }
            }
            if (omVar != null && nmVar != null) {
                org.telegram.ui.cv0 cv0Var = new org.telegram.ui.cv0();
                int[] iArr = new int[2];
                pmVar.getLocationInWindow(iArr);
                if (Build.VERSION.SDK_INT < 26) {
                    iArr[0] = iArr[0] - qmVar.b.getLeftInset();
                }
                cv0Var.b = iArr[0];
                cv0Var.c = iArr[1] + ((int) omVar.a);
                cv0Var.k = 1.0f;
                cv0Var.d = pmVar;
                ImageReceiver imageReceiver = nmVar.c;
                cv0Var.a = imageReceiver;
                cv0Var.e = imageReceiver.getBitmapSafe();
                cv0Var.h = new int[]{(int) r8.left, (int) r8.top, (int) r8.right, (int) r8.bottom};
                RectF rectF = nmVar.q;
                cv0Var.j = (int) (-pmVar.getY());
                cv0Var.i = pmVar.getHeight() - ((int) (((-pmVar.getY()) + qmVar.r.getHeight()) - qmVar.b.l1()));
                return cv0Var;
            }
        }
        return null;
    }

    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    public final int H() {
        return this.b.h.size();
    }

    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    public final int Q(Object obj) {
        int indexOf;
        Integer valueOf = Integer.valueOf(((MediaController.PhotoEntry) obj).imageId);
        pm pmVar = this.b;
        if (pmVar.h.size() <= 1 || (indexOf = pmVar.h.indexOf(valueOf)) < 0) {
            return -1;
        }
        pmVar.h.remove(indexOf);
        pmVar.c();
        return indexOf;
    }

    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    public final int R(int i10) {
        MediaController.PhotoEntry photoEntry;
        if (i10 < 0 || i10 >= this.a.size() || (photoEntry = (MediaController.PhotoEntry) this.a.get(i10)) == null) {
            return -1;
        }
        return this.b.h.indexOf(Integer.valueOf(photoEntry.imageId));
    }

    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    public final void W(int i10) {
        MediaController.PhotoEntry photoEntry;
        ArrayList arrayList;
        boolean z10;
        if (i10 < 0 || i10 >= this.a.size() || (photoEntry = (MediaController.PhotoEntry) this.a.get(i10)) == null) {
            return;
        }
        int i11 = photoEntry.imageId;
        pm pmVar = this.b;
        pmVar.invalidate();
        for (int i12 = 0; i12 < pmVar.b.size(); i12++) {
            om omVar = (om) pmVar.b.get(i12);
            if (omVar != null && (arrayList = omVar.h) != null) {
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    nm nmVar = (nm) arrayList.get(i13);
                    if (nmVar != null && nmVar.b.imageId == i11) {
                        nm.a(nmVar, photoEntry);
                    }
                }
                jm jmVar = omVar.k;
                if (jmVar == null || jmVar.g == null) {
                    z10 = false;
                } else {
                    z10 = false;
                    for (int i14 = 0; i14 < omVar.k.g.size(); i14++) {
                        if (((MediaController.PhotoEntry) omVar.k.g.get(i14)).imageId == i11) {
                            omVar.k.g.set(i14, photoEntry);
                            z10 = true;
                        }
                    }
                }
                if (z10) {
                    om.a(omVar, omVar.k, true);
                }
            }
        }
        pmVar.g();
        pmVar.invalidate();
    }

    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    public final ArrayList c() {
        return this.b.h;
    }

    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        if (i10 < 0 || i10 >= this.a.size()) {
            return -1;
        }
        Integer valueOf = Integer.valueOf(((MediaController.PhotoEntry) this.a.get(i10)).imageId);
        pm pmVar = this.b;
        int indexOf = pmVar.h.indexOf(valueOf);
        if (indexOf < 0) {
            pmVar.h.add(valueOf);
            pmVar.c();
            return pmVar.h.size() - 1;
        }
        if (pmVar.h.size() <= 1) {
            return -1;
        }
        pmVar.h.remove(indexOf);
        pmVar.c();
        return indexOf;
    }

    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    public final boolean u() {
        return false;
    }

    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    public final HashMap v() {
        return this.b.d;
    }

    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    public final boolean x(int i10) {
        if (i10 < 0 || i10 >= this.a.size()) {
            return false;
        }
        return this.b.h.contains(Integer.valueOf(((MediaController.PhotoEntry) this.a.get(i10)).imageId));
    }
}
