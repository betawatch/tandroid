package org.telegram.ui.Components;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class jq0 extends uy {
    public final vt0 X;
    public final /* synthetic */ iq0 Y;
    public final /* synthetic */ gt0 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jq0(gt0 gt0Var, iq0 iq0Var) {
        super(100, false);
        this.Z = gt0Var;
        this.Y = iq0Var;
        this.X = new vt0();
    }

    @Override // v4.p0
    public final int A() {
        if (this.Y.h.getAdapter() != this.Z.R) {
            return 0;
        }
        return B();
    }

    @Override // org.telegram.ui.Components.uy
    public final vt0 D1(int i7) {
        int i10;
        int i11;
        v4.i0 adapter = this.Y.h.getAdapter();
        gt0 gt0Var = this.Z;
        vs0[] vs0VarArr = gt0Var.w1;
        TLRPC.Document F0 = (adapter != gt0Var.R || vs0VarArr[5].a.isEmpty()) ? null : ((org.telegram.messenger.fj) vs0VarArr[5].a.get(i7)).F0();
        vt0 vt0Var = this.X;
        vt0Var.b = 100.0f;
        vt0Var.a = 100.0f;
        if (F0 != null) {
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(F0.thumbs, 90, false, null, false);
            if (w10 != null && (i10 = w10.w) != 0 && (i11 = w10.h) != 0) {
                vt0Var.a = i10;
                vt0Var.b = i11;
            }
            ArrayList<TLRPC.DocumentAttribute> arrayList = F0.attributes;
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i12);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    vt0Var.a = documentAttribute.w;
                    vt0Var.b = documentAttribute.h;
                    break;
                }
            }
        }
        return vt0Var;
    }

    @Override // v4.t, v4.p0
    public final void U(v4.x0 x0Var, v4.c1 c1Var, View view, s0.c cVar) {
        super.U(x0Var, c1Var, view, cVar);
        AccessibilityNodeInfo accessibilityNodeInfo = cVar.a;
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = accessibilityNodeInfo.getCollectionItemInfo();
        of ofVar = collectionItemInfo != null ? new of(collectionItemInfo, 15) : null;
        if (ofVar != null) {
            Object obj = ofVar.b;
            if (((AccessibilityNodeInfo.CollectionItemInfo) obj).isHeading()) {
                accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowSpan(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnSpan(), false));
            }
        }
    }

    @Override // v4.c0
    public final void z0(v4.c1 c1Var, int[] iArr) {
        super.z0(c1Var, iArr);
        iq0 iq0Var = this.Y;
        int i7 = iq0Var.F;
        if (i7 == 0 || gt0.z0(i7)) {
            iArr[1] = Math.max(iArr[1], org.telegram.ui.Cells.q7.a(1) * 2);
        } else if (iq0Var.F == 1) {
            iArr[1] = Math.max(iArr[1], org.telegram.messenger.g0.L(56.0f) * 2);
        }
    }
}
