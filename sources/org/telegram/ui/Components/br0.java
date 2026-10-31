package org.telegram.ui.Components;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class br0 extends yy {
    public final pu0 X;
    public final /* synthetic */ ar0 Y;
    public final /* synthetic */ zt0 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public br0(zt0 zt0Var, ar0 ar0Var) {
        super(100, false);
        this.Z = zt0Var;
        this.Y = ar0Var;
        this.X = new pu0();
    }

    @Override // s4.n0
    public final int A() {
        if (this.Y.h.getAdapter() != this.Z.Q) {
            return 0;
        }
        return B();
    }

    @Override // org.telegram.ui.Components.yy
    public final pu0 D1(int i10) {
        int i11;
        int i12;
        s4.g0 adapter = this.Y.h.getAdapter();
        zt0 zt0Var = this.Z;
        ot0[] ot0VarArr = zt0Var.v1;
        TLRPC.Document F0 = (adapter != zt0Var.Q || ot0VarArr[5].a.isEmpty()) ? null : ((org.telegram.messenger.jj) ot0VarArr[5].a.get(i10)).F0();
        pu0 pu0Var = this.X;
        pu0Var.b = 100.0f;
        pu0Var.a = 100.0f;
        if (F0 != null) {
            TLRPC.PhotoSize w9 = org.telegram.messenger.b8.w(F0.thumbs, 90, false, null, false);
            if (w9 != null && (i11 = w9.w) != 0 && (i12 = w9.h) != 0) {
                pu0Var.a = i11;
                pu0Var.b = i12;
            }
            ArrayList<TLRPC.DocumentAttribute> arrayList = F0.attributes;
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i13);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    pu0Var.a = documentAttribute.w;
                    pu0Var.b = documentAttribute.h;
                    break;
                }
            }
        }
        return pu0Var;
    }

    @Override // s4.r, s4.n0
    public final void U(hf.e eVar, s4.z0 z0Var, View view, s0.c cVar) {
        super.U(eVar, z0Var, view, cVar);
        AccessibilityNodeInfo accessibilityNodeInfo = cVar.a;
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = accessibilityNodeInfo.getCollectionItemInfo();
        a9.r rVar = collectionItemInfo != null ? new a9.r(collectionItemInfo) : null;
        if (rVar != null) {
            Object obj = rVar.a;
            if (((AccessibilityNodeInfo.CollectionItemInfo) obj).isHeading()) {
                accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowSpan(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnSpan(), false));
            }
        }
    }

    @Override // s4.a0
    public final void z0(s4.z0 z0Var, int[] iArr) {
        super.z0(z0Var, iArr);
        ar0 ar0Var = this.Y;
        int i10 = ar0Var.E;
        if (i10 == 0 || zt0.x0(i10)) {
            iArr[1] = Math.max(iArr[1], org.telegram.ui.Cells.t7.a(1) * 2);
        } else if (ar0Var.E == 1) {
            iArr[1] = Math.max(iArr[1], org.telegram.messenger.i0.L(56.0f) * 2);
        }
    }
}
