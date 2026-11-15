package org.telegram.ui.Components;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class bq0 extends oy {
    public final nt0 X;
    public final /* synthetic */ aq0 Y;
    public final /* synthetic */ ys0 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bq0(ys0 ys0Var, aq0 aq0Var) {
        super(100, false);
        this.Z = ys0Var;
        this.Y = aq0Var;
        this.X = new nt0();
    }

    @Override // v4.o0
    public final int A() {
        if (this.Y.h.getAdapter() != this.Z.R) {
            return 0;
        }
        return B();
    }

    @Override // org.telegram.ui.Components.oy
    public final nt0 D1(int i7) {
        int i10;
        int i11;
        v4.h0 adapter = this.Y.h.getAdapter();
        ys0 ys0Var = this.Z;
        ns0[] ns0VarArr = ys0Var.w1;
        TLRPC.Document F0 = (adapter != ys0Var.R || ns0VarArr[5].a.isEmpty()) ? null : ((org.telegram.messenger.gj) ns0VarArr[5].a.get(i7)).F0();
        nt0 nt0Var = this.X;
        nt0Var.b = 100.0f;
        nt0Var.a = 100.0f;
        if (F0 != null) {
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(F0.thumbs, 90, false, null, false);
            if (w10 != null && (i10 = w10.w) != 0 && (i11 = w10.h) != 0) {
                nt0Var.a = i10;
                nt0Var.b = i11;
            }
            ArrayList<TLRPC.DocumentAttribute> arrayList = F0.attributes;
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i12);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    nt0Var.a = documentAttribute.w;
                    nt0Var.b = documentAttribute.h;
                    break;
                }
            }
        }
        return nt0Var;
    }

    @Override // v4.s, v4.o0
    public final void U(v4.w0 w0Var, v4.b1 b1Var, View view, s0.c cVar) {
        super.U(w0Var, b1Var, view, cVar);
        AccessibilityNodeInfo accessibilityNodeInfo = cVar.a;
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = accessibilityNodeInfo.getCollectionItemInfo();
        e.a aVar = collectionItemInfo != null ? new e.a(collectionItemInfo) : null;
        if (aVar != null) {
            Object obj = aVar.a;
            if (((AccessibilityNodeInfo.CollectionItemInfo) obj).isHeading()) {
                accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowSpan(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnSpan(), false));
            }
        }
    }

    @Override // v4.b0
    public final void z0(v4.b1 b1Var, int[] iArr) {
        super.z0(b1Var, iArr);
        aq0 aq0Var = this.Y;
        int i7 = aq0Var.F;
        if (i7 == 0 || ys0.z0(i7)) {
            iArr[1] = Math.max(iArr[1], org.telegram.ui.Cells.o7.a(1) * 2);
        } else if (aq0Var.F == 1) {
            iArr[1] = Math.max(iArr[1], org.telegram.messenger.g0.L(56.0f) * 2);
        }
    }
}
