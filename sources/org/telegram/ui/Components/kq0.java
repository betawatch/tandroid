package org.telegram.ui.Components;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class kq0 extends ty {
    public final xt0 X;
    public final /* synthetic */ jq0 Y;
    public final /* synthetic */ it0 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kq0(it0 it0Var, jq0 jq0Var) {
        super(100, false);
        this.Z = it0Var;
        this.Y = jq0Var;
        this.X = new xt0();
    }

    @Override // v4.p0
    public final int A() {
        if (this.Y.h.getAdapter() != this.Z.R) {
            return 0;
        }
        return B();
    }

    @Override // org.telegram.ui.Components.ty
    public final xt0 D1(int i7) {
        int i10;
        int i11;
        v4.i0 adapter = this.Y.h.getAdapter();
        it0 it0Var = this.Z;
        xs0[] xs0VarArr = it0Var.w1;
        TLRPC.Document F0 = (adapter != it0Var.R || xs0VarArr[5].a.isEmpty()) ? null : ((org.telegram.messenger.fj) xs0VarArr[5].a.get(i7)).F0();
        xt0 xt0Var = this.X;
        xt0Var.b = 100.0f;
        xt0Var.a = 100.0f;
        if (F0 != null) {
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(F0.thumbs, 90, false, null, false);
            if (w10 != null && (i10 = w10.w) != 0 && (i11 = w10.h) != 0) {
                xt0Var.a = i10;
                xt0Var.b = i11;
            }
            ArrayList<TLRPC.DocumentAttribute> arrayList = F0.attributes;
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i12);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    xt0Var.a = documentAttribute.w;
                    xt0Var.b = documentAttribute.h;
                    break;
                }
            }
        }
        return xt0Var;
    }

    @Override // v4.t, v4.p0
    public final void U(v4.x0 x0Var, v4.c1 c1Var, View view, s0.c cVar) {
        super.U(x0Var, c1Var, view, cVar);
        AccessibilityNodeInfo accessibilityNodeInfo = cVar.a;
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = accessibilityNodeInfo.getCollectionItemInfo();
        d9.o oVar = collectionItemInfo != null ? new d9.o(collectionItemInfo) : null;
        if (oVar != null) {
            Object obj = oVar.a;
            if (((AccessibilityNodeInfo.CollectionItemInfo) obj).isHeading()) {
                accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowSpan(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnSpan(), false));
            }
        }
    }

    @Override // v4.c0
    public final void z0(v4.c1 c1Var, int[] iArr) {
        super.z0(c1Var, iArr);
        jq0 jq0Var = this.Y;
        int i7 = jq0Var.F;
        if (i7 == 0 || it0.z0(i7)) {
            iArr[1] = Math.max(iArr[1], org.telegram.ui.Cells.p7.a(1) * 2);
        } else if (jq0Var.F == 1) {
            iArr[1] = Math.max(iArr[1], org.telegram.messenger.g0.L(56.0f) * 2);
        }
    }
}
