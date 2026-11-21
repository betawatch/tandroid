package org.telegram.ui.Components;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class lq0 extends wy {
    public final yt0 X;
    public final /* synthetic */ kq0 Y;
    public final /* synthetic */ jt0 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lq0(jt0 jt0Var, kq0 kq0Var) {
        super(100, false);
        this.Z = jt0Var;
        this.Y = kq0Var;
        this.X = new yt0();
    }

    @Override // v4.p0
    public final int A() {
        if (this.Y.h.getAdapter() != this.Z.R) {
            return 0;
        }
        return B();
    }

    @Override // org.telegram.ui.Components.wy
    public final yt0 D1(int i7) {
        int i10;
        int i11;
        v4.i0 adapter = this.Y.h.getAdapter();
        jt0 jt0Var = this.Z;
        ys0[] ys0VarArr = jt0Var.w1;
        TLRPC.Document F0 = (adapter != jt0Var.R || ys0VarArr[5].a.isEmpty()) ? null : ((org.telegram.messenger.fj) ys0VarArr[5].a.get(i7)).F0();
        yt0 yt0Var = this.X;
        yt0Var.b = 100.0f;
        yt0Var.a = 100.0f;
        if (F0 != null) {
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(F0.thumbs, 90, false, null, false);
            if (w10 != null && (i10 = w10.w) != 0 && (i11 = w10.h) != 0) {
                yt0Var.a = i10;
                yt0Var.b = i11;
            }
            ArrayList<TLRPC.DocumentAttribute> arrayList = F0.attributes;
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i12);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    yt0Var.a = documentAttribute.w;
                    yt0Var.b = documentAttribute.h;
                    break;
                }
            }
        }
        return yt0Var;
    }

    @Override // v4.t, v4.p0
    public final void U(v4.x0 x0Var, v4.c1 c1Var, View view, s0.c cVar) {
        super.U(x0Var, c1Var, view, cVar);
        AccessibilityNodeInfo accessibilityNodeInfo = cVar.a;
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = accessibilityNodeInfo.getCollectionItemInfo();
        qf qfVar = collectionItemInfo != null ? new qf(collectionItemInfo, 15) : null;
        if (qfVar != null) {
            Object obj = qfVar.b;
            if (((AccessibilityNodeInfo.CollectionItemInfo) obj).isHeading()) {
                accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowSpan(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnSpan(), false));
            }
        }
    }

    @Override // v4.c0
    public final void z0(v4.c1 c1Var, int[] iArr) {
        super.z0(c1Var, iArr);
        kq0 kq0Var = this.Y;
        int i7 = kq0Var.F;
        if (i7 == 0 || jt0.z0(i7)) {
            iArr[1] = Math.max(iArr[1], org.telegram.ui.Cells.q7.a(1) * 2);
        } else if (kq0Var.F == 1) {
            iArr[1] = Math.max(iArr[1], org.telegram.messenger.g0.L(56.0f) * 2);
        }
    }
}
