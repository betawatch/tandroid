package org.telegram.ui.Components;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class ps0 extends wz {
    public final dw0 X;
    public final /* synthetic */ os0 Y;
    public final /* synthetic */ sv0 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ps0(sv0 sv0Var, os0 os0Var) {
        super(100, false);
        this.Z = sv0Var;
        this.Y = os0Var;
        this.X = new dw0();
    }

    @Override // s4.n0
    public final int A() {
        if (this.Y.h.getAdapter() != this.Z.O) {
            return 0;
        }
        return B();
    }

    @Override // org.telegram.ui.Components.wz
    public final dw0 D1(int i10) {
        int i11;
        int i12;
        s4.g0 adapter = this.Y.h.getAdapter();
        sv0 sv0Var = this.Z;
        hv0[] hv0VarArr = sv0Var.t1;
        TLRPC.Document document = (adapter != sv0Var.O || hv0VarArr[5].a.isEmpty()) ? null : ((MessageObject) hv0VarArr[5].a.get(i10)).getDocument();
        dw0 dw0Var = this.X;
        dw0Var.b = 100.0f;
        dw0Var.a = 100.0f;
        if (document != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
            if (closestPhotoSizeWithSize != null && (i11 = closestPhotoSizeWithSize.w) != 0 && (i12 = closestPhotoSizeWithSize.h) != 0) {
                dw0Var.a = i11;
                dw0Var.b = i12;
            }
            ArrayList<TLRPC.DocumentAttribute> arrayList = document.attributes;
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i13);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    dw0Var.a = documentAttribute.w;
                    dw0Var.b = documentAttribute.h;
                    break;
                }
            }
        }
        return dw0Var;
    }

    @Override // s4.s, s4.n0
    public final void U(qf.e eVar, s4.y0 y0Var, View view, s0.c cVar) {
        super.U(eVar, y0Var, view, cVar);
        AccessibilityNodeInfo accessibilityNodeInfo = cVar.a;
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = accessibilityNodeInfo.getCollectionItemInfo();
        n7.b bVar = collectionItemInfo != null ? new n7.b(collectionItemInfo) : null;
        if (bVar != null) {
            Object obj = bVar.a;
            if (((AccessibilityNodeInfo.CollectionItemInfo) obj).isHeading()) {
                accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowSpan(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnSpan(), false));
            }
        }
    }

    @Override // s4.b0
    public final void z0(s4.y0 y0Var, int[] iArr) {
        super.z0(y0Var, iArr);
        os0 os0Var = this.Y;
        int i10 = os0Var.F;
        if (i10 == 0 || sv0.q0(i10)) {
            iArr[1] = Math.max(iArr[1], org.telegram.ui.Cells.t7.a(1) * 2);
        } else if (os0Var.F == 1) {
            iArr[1] = Math.max(iArr[1], AndroidUtilities.dp(56.0f) * 2);
        }
    }
}
