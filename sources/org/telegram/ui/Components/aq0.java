package org.telegram.ui.Components;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class aq0 extends hy {
    public final lt0 X;
    public final /* synthetic */ zp0 Y;
    public final /* synthetic */ ws0 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aq0(ws0 ws0Var, zp0 zp0Var) {
        super(100, false);
        this.Z = ws0Var;
        this.Y = zp0Var;
        this.X = new lt0();
    }

    @Override // u4.o0
    public final int A() {
        if (this.Y.h.getAdapter() != this.Z.R) {
            return 0;
        }
        return B();
    }

    @Override // org.telegram.ui.Components.hy
    public final lt0 D1(int i3) {
        int i10;
        int i11;
        u4.h0 adapter = this.Y.h.getAdapter();
        ws0 ws0Var = this.Z;
        ls0[] ls0VarArr = ws0Var.w1;
        TLRPC.Document F0 = (adapter != ws0Var.R || ls0VarArr[5].a.isEmpty()) ? null : ((org.telegram.messenger.zi) ls0VarArr[5].a.get(i3)).F0();
        lt0 lt0Var = this.X;
        lt0Var.b = 100.0f;
        lt0Var.a = 100.0f;
        if (F0 != null) {
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(F0.thumbs, 90, false, null, false);
            if (w10 != null && (i10 = w10.w) != 0 && (i11 = w10.h) != 0) {
                lt0Var.a = i10;
                lt0Var.b = i11;
            }
            ArrayList<TLRPC.DocumentAttribute> arrayList = F0.attributes;
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i12);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    lt0Var.a = documentAttribute.w;
                    lt0Var.b = documentAttribute.h;
                    break;
                }
            }
        }
        return lt0Var;
    }

    @Override // u4.s, u4.o0
    public final void U(tf.e eVar, u4.a1 a1Var, View view, s0.d dVar) {
        super.U(eVar, a1Var, view, dVar);
        AccessibilityNodeInfo accessibilityNodeInfo = dVar.a;
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = accessibilityNodeInfo.getCollectionItemInfo();
        e.a aVar = collectionItemInfo != null ? new e.a(collectionItemInfo) : null;
        if (aVar != null) {
            Object obj = aVar.a;
            if (((AccessibilityNodeInfo.CollectionItemInfo) obj).isHeading()) {
                accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowSpan(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnSpan(), false));
            }
        }
    }

    @Override // u4.b0
    public final void z0(u4.a1 a1Var, int[] iArr) {
        super.z0(a1Var, iArr);
        zp0 zp0Var = this.Y;
        int i3 = zp0Var.F;
        if (i3 == 0 || ws0.z0(i3)) {
            iArr[1] = Math.max(iArr[1], org.telegram.ui.Cells.o7.a(1) * 2);
        } else if (zp0Var.F == 1) {
            iArr[1] = Math.max(iArr[1], org.telegram.messenger.g0.L(56.0f) * 2);
        }
    }
}
