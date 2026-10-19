package org.telegram.ui.Components;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class qs0 extends wz {
    public final ew0 X;
    public final /* synthetic */ ps0 Y;
    public final /* synthetic */ tv0 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qs0(tv0 tv0Var, ps0 ps0Var) {
        super(100, false);
        this.Z = tv0Var;
        this.Y = ps0Var;
        this.X = new ew0();
    }

    @Override // s4.n0
    public final int A() {
        if (this.Y.h.getAdapter() != this.Z.O) {
            return 0;
        }
        return B();
    }

    @Override // org.telegram.ui.Components.wz
    public final ew0 D1(int i10) {
        int i11;
        int i12;
        s4.g0 adapter = this.Y.h.getAdapter();
        tv0 tv0Var = this.Z;
        iv0[] iv0VarArr = tv0Var.t1;
        TLRPC.Document document = (adapter != tv0Var.O || iv0VarArr[5].a.isEmpty()) ? null : ((MessageObject) iv0VarArr[5].a.get(i10)).getDocument();
        ew0 ew0Var = this.X;
        ew0Var.b = 100.0f;
        ew0Var.a = 100.0f;
        if (document != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
            if (closestPhotoSizeWithSize != null && (i11 = closestPhotoSizeWithSize.w) != 0 && (i12 = closestPhotoSizeWithSize.h) != 0) {
                ew0Var.a = i11;
                ew0Var.b = i12;
            }
            ArrayList<TLRPC.DocumentAttribute> arrayList = document.attributes;
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i13);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    ew0Var.a = documentAttribute.w;
                    ew0Var.b = documentAttribute.h;
                    break;
                }
            }
        }
        return ew0Var;
    }

    @Override // s4.s, s4.n0
    public final void U(qf.e eVar, s4.y0 y0Var, View view, s0.c cVar) {
        super.U(eVar, y0Var, view, cVar);
        AccessibilityNodeInfo accessibilityNodeInfo = cVar.a;
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = accessibilityNodeInfo.getCollectionItemInfo();
        n5.c cVar2 = collectionItemInfo != null ? new n5.c(collectionItemInfo) : null;
        if (cVar2 != null) {
            Object obj = cVar2.a;
            if (((AccessibilityNodeInfo.CollectionItemInfo) obj).isHeading()) {
                accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowSpan(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnSpan(), false));
            }
        }
    }

    @Override // s4.b0
    public final void z0(s4.y0 y0Var, int[] iArr) {
        super.z0(y0Var, iArr);
        ps0 ps0Var = this.Y;
        int i10 = ps0Var.F;
        if (i10 == 0 || tv0.q0(i10)) {
            iArr[1] = Math.max(iArr[1], org.telegram.ui.Cells.t7.a(1) * 2);
        } else if (ps0Var.F == 1) {
            iArr[1] = Math.max(iArr[1], AndroidUtilities.dp(56.0f) * 2);
        }
    }
}
