package org.telegram.ui.Components;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class cr0 extends yy {
    public final qu0 X;
    public final /* synthetic */ br0 Y;
    public final /* synthetic */ au0 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cr0(au0 au0Var, br0 br0Var) {
        super(100, false);
        this.Z = au0Var;
        this.Y = br0Var;
        this.X = new qu0();
    }

    @Override // s4.n0
    public final int A() {
        if (this.Y.h.getAdapter() != this.Z.Q) {
            return 0;
        }
        return B();
    }

    @Override // org.telegram.ui.Components.yy
    public final qu0 D1(int i10) {
        int i11;
        int i12;
        s4.g0 adapter = this.Y.h.getAdapter();
        au0 au0Var = this.Z;
        pt0[] pt0VarArr = au0Var.v1;
        TLRPC.Document F0 = (adapter != au0Var.Q || pt0VarArr[5].a.isEmpty()) ? null : ((org.telegram.messenger.kj) pt0VarArr[5].a.get(i10)).F0();
        qu0 qu0Var = this.X;
        qu0Var.b = 100.0f;
        qu0Var.a = 100.0f;
        if (F0 != null) {
            TLRPC.PhotoSize w9 = org.telegram.messenger.b8.w(F0.thumbs, 90, false, null, false);
            if (w9 != null && (i11 = w9.w) != 0 && (i12 = w9.h) != 0) {
                qu0Var.a = i11;
                qu0Var.b = i12;
            }
            ArrayList<TLRPC.DocumentAttribute> arrayList = F0.attributes;
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i13);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    qu0Var.a = documentAttribute.w;
                    qu0Var.b = documentAttribute.h;
                    break;
                }
            }
        }
        return qu0Var;
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
        br0 br0Var = this.Y;
        int i10 = br0Var.E;
        if (i10 == 0 || au0.y0(i10)) {
            iArr[1] = Math.max(iArr[1], org.telegram.ui.Cells.t7.a(1) * 2);
        } else if (br0Var.E == 1) {
            iArr[1] = Math.max(iArr[1], org.telegram.messenger.i0.L(56.0f) * 2);
        }
    }
}
