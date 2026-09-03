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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class im extends org.telegram.ui.fu0 {
    public ArrayList a = new ArrayList();
    public final /* synthetic */ mm b;

    public im(mm mmVar) {
        this.b = mmVar;
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final void D() {
        mm mmVar = this.b;
        mmVar.c();
        mmVar.i(mmVar.M.M, false);
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final org.telegram.ui.qu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z4, boolean z10) {
        MediaController.PhotoEntry photoEntry;
        ArrayList arrayList;
        mm mmVar = this.b;
        ArrayList arrayList2 = mmVar.b;
        nm nmVar = mmVar.M;
        if (i10 >= 0 && i10 < this.a.size() && x(i10) && (photoEntry = (MediaController.PhotoEntry) this.a.get(i10)) != null) {
            int size = arrayList2.size();
            lm lmVar = null;
            km kmVar = null;
            for (int i11 = 0; i11 < size; i11++) {
                lmVar = (lm) arrayList2.get(i11);
                if (lmVar != null && (arrayList = lmVar.h) != null) {
                    int size2 = arrayList.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= size2) {
                            break;
                        }
                        km kmVar2 = (km) arrayList.get(i12);
                        if (kmVar2 != null && kmVar2.b == photoEntry && kmVar2.k > 0.5d) {
                            kmVar = (km) arrayList.get(i12);
                            break;
                        }
                        i12++;
                    }
                    if (kmVar != null) {
                        break;
                    }
                }
            }
            if (lmVar != null && kmVar != null) {
                org.telegram.ui.qu0 qu0Var = new org.telegram.ui.qu0();
                int[] iArr = new int[2];
                mmVar.getLocationInWindow(iArr);
                if (Build.VERSION.SDK_INT < 26) {
                    iArr[0] = iArr[0] - nmVar.b.getLeftInset();
                }
                qu0Var.b = iArr[0];
                qu0Var.c = iArr[1] + ((int) lmVar.a);
                qu0Var.k = 1.0f;
                qu0Var.d = mmVar;
                ImageReceiver imageReceiver = kmVar.c;
                qu0Var.a = imageReceiver;
                qu0Var.e = imageReceiver.getBitmapSafe();
                qu0Var.h = new int[]{(int) r8.left, (int) r8.top, (int) r8.right, (int) r8.bottom};
                RectF rectF = kmVar.q;
                qu0Var.j = (int) (-mmVar.getY());
                qu0Var.i = mmVar.getHeight() - ((int) (((-mmVar.getY()) + nmVar.r.getHeight()) - nmVar.b.l1()));
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
        mm mmVar = this.b;
        if (mmVar.h.size() <= 1 || (indexOf = mmVar.h.indexOf(valueOf)) < 0) {
            return -1;
        }
        mmVar.h.remove(indexOf);
        mmVar.c();
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
        mm mmVar = this.b;
        mmVar.invalidate();
        for (int i12 = 0; i12 < mmVar.b.size(); i12++) {
            lm lmVar = (lm) mmVar.b.get(i12);
            if (lmVar != null && (arrayList = lmVar.h) != null) {
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    km kmVar = (km) arrayList.get(i13);
                    if (kmVar != null && kmVar.b.imageId == i11) {
                        km.a(kmVar, photoEntry);
                    }
                }
                gm gmVar = lmVar.k;
                if (gmVar == null || gmVar.g == null) {
                    z4 = false;
                } else {
                    z4 = false;
                    for (int i14 = 0; i14 < lmVar.k.g.size(); i14++) {
                        if (((MediaController.PhotoEntry) lmVar.k.g.get(i14)).imageId == i11) {
                            lmVar.k.g.set(i14, photoEntry);
                            z4 = true;
                        }
                    }
                }
                if (z4) {
                    lm.a(lmVar, lmVar.k, true);
                }
            }
        }
        mmVar.g();
        mmVar.invalidate();
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
        mm mmVar = this.b;
        int indexOf = mmVar.h.indexOf(valueOf);
        if (indexOf < 0) {
            mmVar.h.add(valueOf);
            mmVar.c();
            return mmVar.h.size() - 1;
        }
        if (mmVar.h.size() <= 1) {
            return -1;
        }
        mmVar.h.remove(indexOf);
        mmVar.c();
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
