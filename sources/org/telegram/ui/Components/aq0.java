package org.telegram.ui.Components;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class aq0 extends jy {
    public final mt0 X;
    public final /* synthetic */ zp0 Y;
    public final /* synthetic */ xs0 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aq0(xs0 xs0Var, zp0 zp0Var) {
        super(100, false);
        this.Z = xs0Var;
        this.Y = zp0Var;
        this.X = new mt0();
    }

    @Override // v4.n0
    public final int A() {
        if (this.Y.h.getAdapter() != this.Z.Q) {
            return 0;
        }
        return B();
    }

    @Override // org.telegram.ui.Components.jy
    public final mt0 D1(int i7) {
        int i10;
        int i11;
        v4.g0 adapter = this.Y.h.getAdapter();
        xs0 xs0Var = this.Z;
        ms0[] ms0VarArr = xs0Var.v1;
        TLRPC.Document F0 = (adapter != xs0Var.Q || ms0VarArr[5].a.isEmpty()) ? null : ((org.telegram.messenger.ij) ms0VarArr[5].a.get(i7)).F0();
        mt0 mt0Var = this.X;
        mt0Var.b = 100.0f;
        mt0Var.a = 100.0f;
        if (F0 != null) {
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(F0.thumbs, 90, false, null, false);
            if (w10 != null && (i10 = w10.w) != 0 && (i11 = w10.h) != 0) {
                mt0Var.a = i10;
                mt0Var.b = i11;
            }
            ArrayList<TLRPC.DocumentAttribute> arrayList = F0.attributes;
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i12);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    mt0Var.a = documentAttribute.w;
                    mt0Var.b = documentAttribute.h;
                    break;
                }
            }
        }
        return mt0Var;
    }

    @Override // v4.s, v4.n0
    public final void U(v4.v0 v0Var, v4.a1 a1Var, View view, s0.d dVar) {
        super.U(v0Var, a1Var, view, dVar);
        AccessibilityNodeInfo accessibilityNodeInfo = dVar.a;
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = accessibilityNodeInfo.getCollectionItemInfo();
        d9.o oVar = collectionItemInfo != null ? new d9.o(collectionItemInfo) : null;
        if (oVar != null) {
            Object obj = oVar.a;
            if (((AccessibilityNodeInfo.CollectionItemInfo) obj).isHeading()) {
                accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowSpan(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnSpan(), false));
            }
        }
    }

    @Override // v4.b0
    public final void z0(v4.a1 a1Var, int[] iArr) {
        super.z0(a1Var, iArr);
        zp0 zp0Var = this.Y;
        int i7 = zp0Var.E;
        if (i7 == 0 || xs0.z0(i7)) {
            iArr[1] = Math.max(iArr[1], org.telegram.ui.Cells.p7.a(1) * 2);
        } else if (zp0Var.E == 1) {
            iArr[1] = Math.max(iArr[1], org.telegram.messenger.g0.L(56.0f) * 2);
        }
    }
}
