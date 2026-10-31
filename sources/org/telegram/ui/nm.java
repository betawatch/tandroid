package org.telegram.ui;

import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class nm extends yr0 {
    public final ArrayList a;
    public final int[] b = new int[2];
    public final /* synthetic */ un c;

    public nm(un unVar, ArrayList arrayList) {
        this.c = unVar;
        this.a = arrayList;
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final gs0 E(org.telegram.messenger.jj jjVar, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        char c10;
        char c11;
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.messenger.jj messageObject;
        org.telegram.messenger.vv vvVar;
        TL_iv.PageBlock pageBlock;
        ImageReceiver imageReceiver2;
        nm nmVar = this;
        un unVar = nmVar.c;
        if (unVar.z0 == null || i10 < 0) {
            return null;
        }
        ArrayList arrayList = nmVar.a;
        if (i10 >= arrayList.size()) {
            return null;
        }
        TL_iv.PageBlock pageBlock2 = (TL_iv.PageBlock) arrayList.get(i10);
        int childCount = unVar.z0.getChildCount();
        int i11 = 0;
        while (i11 < childCount) {
            View childAt = unVar.z0.getChildAt(i11);
            boolean z12 = childAt instanceof org.telegram.ui.Cells.q1;
            int[] iArr = nmVar.b;
            if (!z12 || (messageObject = (q1Var = (org.telegram.ui.Cells.q1) childAt).getMessageObject()) == null || (vvVar = messageObject.w2) == null) {
                c10 = 0;
                c11 = 1;
                imageReceiver = null;
            } else {
                int[] iArr2 = new int[2];
                ArrayList arrayList2 = vvVar.g;
                int i12 = 0;
                while (true) {
                    if (i12 >= arrayList2.size()) {
                        c10 = 0;
                        c11 = 1;
                        imageReceiver = null;
                        break;
                    }
                    org.telegram.messenger.qu quVar = (org.telegram.messenger.qu) arrayList2.get(i12);
                    if (quVar instanceof org.telegram.messenger.dv) {
                        org.telegram.messenger.dv dvVar = (org.telegram.messenger.dv) quVar;
                        pageBlock = dvVar.q0;
                        imageReceiver2 = dvVar.X;
                    } else if (quVar instanceof org.telegram.messenger.pv) {
                        org.telegram.messenger.pv pvVar = (org.telegram.messenger.pv) quVar;
                        TL_iv.pageBlockVideo pageblockvideo = pvVar.q0;
                        imageReceiver2 = pvVar.X;
                        pageBlock = pageblockvideo;
                    } else if (quVar instanceof org.telegram.messenger.vu) {
                        ArrayList arrayList3 = ((org.telegram.messenger.vu) quVar).X;
                        int size = arrayList3.size();
                        c10 = 0;
                        int i13 = 0;
                        while (i13 < size) {
                            Object obj = arrayList3.get(i13);
                            i13++;
                            c11 = 1;
                            org.telegram.messenger.ju juVar = (org.telegram.messenger.ju) obj;
                            if (juVar.b == pageBlock2) {
                                Rect rect = quVar.b;
                                iArr2[0] = rect.left;
                                iArr2[1] = quVar.T + rect.top;
                                imageReceiver = juVar.c;
                                break;
                            }
                        }
                        i12++;
                    } else {
                        c10 = 0;
                        c11 = 1;
                        if (quVar instanceof org.telegram.messenger.hv) {
                            org.telegram.messenger.hv hvVar = (org.telegram.messenger.hv) quVar;
                            ArrayList arrayList4 = hvVar.X;
                            int i14 = hvVar.a0;
                            if (i14 >= 0 && i14 < arrayList4.size() && ((org.telegram.messenger.ju) arrayList4.get(i14)).b == pageBlock2) {
                                Rect rect2 = quVar.b;
                                iArr2[0] = rect2.left;
                                iArr2[1] = quVar.T + rect2.top;
                                imageReceiver = ((org.telegram.messenger.ju) arrayList4.get(i14)).c;
                                break;
                            }
                            i12++;
                        } else {
                            pageBlock = null;
                            imageReceiver2 = null;
                            if (pageBlock == pageBlock2 && imageReceiver2 != null) {
                                Rect rect3 = quVar.b;
                                iArr2[c10] = rect3.left;
                                iArr2[c11] = quVar.T + rect3.top;
                                imageReceiver = imageReceiver2;
                                break;
                            }
                            i12++;
                        }
                    }
                    c10 = 0;
                    c11 = 1;
                    if (pageBlock == pageBlock2) {
                        Rect rect32 = quVar.b;
                        iArr2[c10] = rect32.left;
                        iArr2[c11] = quVar.T + rect32.top;
                        imageReceiver = imageReceiver2;
                        break;
                    }
                    continue;
                    i12++;
                }
                if (imageReceiver != null) {
                    childAt.getLocationInWindow(iArr);
                    iArr[c10] = q1Var.getTextX() + iArr2[c10] + iArr[c10];
                    iArr[c11] = q1Var.getTextY() + iArr2[c11] + iArr[c11];
                }
            }
            if (imageReceiver != null) {
                gs0 gs0Var = new gs0();
                gs0Var.b = iArr[c10];
                gs0Var.c = iArr[c11];
                gs0Var.d = unVar.z0;
                gs0Var.a = imageReceiver;
                gs0Var.e = imageReceiver.p();
                gs0Var.h = imageReceiver.E();
                gs0Var.j = (int) ((unVar.L9 - unVar.N9) - org.telegram.messenger.i0.L(4.0f));
                gs0Var.i = (int) (unVar.j9(org.telegram.ui.Components.k21.c) + unVar.w.d() + org.telegram.messenger.i0.L(9.0f) + unVar.Ua + unVar.Oc);
                return gs0Var;
            }
            i11++;
            nmVar = this;
        }
        return null;
    }
}
