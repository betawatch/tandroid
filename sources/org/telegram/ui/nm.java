package org.telegram.ui;

import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class nm extends xr0 {
    public final ArrayList a;
    public final int[] b = new int[2];
    public final /* synthetic */ un c;

    public nm(un unVar, ArrayList arrayList) {
        this.c = unVar;
        this.a = arrayList;
    }

    @Override // org.telegram.ui.xr0, org.telegram.ui.ds0
    public final fs0 E(org.telegram.messenger.kj kjVar, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        char c10;
        char c11;
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.messenger.kj messageObject;
        org.telegram.messenger.wv wvVar;
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
            if (!z12 || (messageObject = (q1Var = (org.telegram.ui.Cells.q1) childAt).getMessageObject()) == null || (wvVar = messageObject.w2) == null) {
                c10 = 0;
                c11 = 1;
                imageReceiver = null;
            } else {
                int[] iArr2 = new int[2];
                ArrayList arrayList2 = wvVar.g;
                int i12 = 0;
                while (true) {
                    if (i12 >= arrayList2.size()) {
                        c10 = 0;
                        c11 = 1;
                        imageReceiver = null;
                        break;
                    }
                    org.telegram.messenger.ru ruVar = (org.telegram.messenger.ru) arrayList2.get(i12);
                    if (ruVar instanceof org.telegram.messenger.ev) {
                        org.telegram.messenger.ev evVar = (org.telegram.messenger.ev) ruVar;
                        pageBlock = evVar.q0;
                        imageReceiver2 = evVar.X;
                    } else if (ruVar instanceof org.telegram.messenger.qv) {
                        org.telegram.messenger.qv qvVar = (org.telegram.messenger.qv) ruVar;
                        TL_iv.pageBlockVideo pageblockvideo = qvVar.q0;
                        imageReceiver2 = qvVar.X;
                        pageBlock = pageblockvideo;
                    } else if (ruVar instanceof org.telegram.messenger.wu) {
                        ArrayList arrayList3 = ((org.telegram.messenger.wu) ruVar).X;
                        int size = arrayList3.size();
                        c10 = 0;
                        int i13 = 0;
                        while (i13 < size) {
                            Object obj = arrayList3.get(i13);
                            i13++;
                            c11 = 1;
                            org.telegram.messenger.ku kuVar = (org.telegram.messenger.ku) obj;
                            if (kuVar.b == pageBlock2) {
                                Rect rect = ruVar.b;
                                iArr2[0] = rect.left;
                                iArr2[1] = ruVar.T + rect.top;
                                imageReceiver = kuVar.c;
                                break;
                            }
                        }
                        i12++;
                    } else {
                        c10 = 0;
                        c11 = 1;
                        if (ruVar instanceof org.telegram.messenger.iv) {
                            org.telegram.messenger.iv ivVar = (org.telegram.messenger.iv) ruVar;
                            ArrayList arrayList4 = ivVar.X;
                            int i14 = ivVar.a0;
                            if (i14 >= 0 && i14 < arrayList4.size() && ((org.telegram.messenger.ku) arrayList4.get(i14)).b == pageBlock2) {
                                Rect rect2 = ruVar.b;
                                iArr2[0] = rect2.left;
                                iArr2[1] = ruVar.T + rect2.top;
                                imageReceiver = ((org.telegram.messenger.ku) arrayList4.get(i14)).c;
                                break;
                            }
                            i12++;
                        } else {
                            pageBlock = null;
                            imageReceiver2 = null;
                            if (pageBlock == pageBlock2 && imageReceiver2 != null) {
                                Rect rect3 = ruVar.b;
                                iArr2[c10] = rect3.left;
                                iArr2[c11] = ruVar.T + rect3.top;
                                imageReceiver = imageReceiver2;
                                break;
                            }
                            i12++;
                        }
                    }
                    c10 = 0;
                    c11 = 1;
                    if (pageBlock == pageBlock2) {
                        Rect rect32 = ruVar.b;
                        iArr2[c10] = rect32.left;
                        iArr2[c11] = ruVar.T + rect32.top;
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
                fs0 fs0Var = new fs0();
                fs0Var.b = iArr[c10];
                fs0Var.c = iArr[c11];
                fs0Var.d = unVar.z0;
                fs0Var.a = imageReceiver;
                fs0Var.e = imageReceiver.p();
                fs0Var.h = imageReceiver.E();
                fs0Var.j = (int) ((unVar.L9 - unVar.N9) - org.telegram.messenger.i0.L(4.0f));
                fs0Var.i = (int) (unVar.o9(org.telegram.ui.Components.l21.c) + unVar.w.d() + org.telegram.messenger.i0.L(9.0f) + unVar.Ua + unVar.Pc);
                return fs0Var;
            }
            i11++;
            nmVar = this;
        }
        return null;
    }
}
