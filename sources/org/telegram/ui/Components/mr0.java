package org.telegram.ui.Components;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class mr0 extends iz {
    public final bv0 X;
    public final /* synthetic */ lr0 Y;
    public final /* synthetic */ qu0 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mr0(qu0 qu0Var, lr0 lr0Var) {
        super(100, false);
        this.Z = qu0Var;
        this.Y = lr0Var;
        this.X = new bv0();
    }

    @Override // f2.w0
    public final int A() {
        if (this.Y.h.getAdapter() != this.Z.K) {
            return 0;
        }
        return B();
    }

    @Override // org.telegram.ui.Components.iz
    public final bv0 D1(int i10) {
        int i11;
        int i12;
        f2.p0 adapter = this.Y.h.getAdapter();
        qu0 qu0Var = this.Z;
        fu0[] fu0VarArr = qu0Var.p1;
        TLRPC.Document document = (adapter != qu0Var.K || fu0VarArr[5].a.isEmpty()) ? null : ((MessageObject) fu0VarArr[5].a.get(i10)).getDocument();
        bv0 bv0Var = this.X;
        bv0Var.b = 100.0f;
        bv0Var.a = 100.0f;
        if (document != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
            if (closestPhotoSizeWithSize != null && (i11 = closestPhotoSizeWithSize.w) != 0 && (i12 = closestPhotoSizeWithSize.h) != 0) {
                bv0Var.a = i11;
                bv0Var.b = i12;
            }
            ArrayList<TLRPC.DocumentAttribute> arrayList = document.attributes;
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i13);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    bv0Var.a = documentAttribute.w;
                    bv0Var.b = documentAttribute.h;
                    break;
                }
            }
        }
        return bv0Var;
    }

    @Override // f2.w, f2.w0
    public final void U(f2.d1 d1Var, f2.k1 k1Var, View view, s0.c cVar) {
        super.U(d1Var, k1Var, view, cVar);
        AccessibilityNodeInfo accessibilityNodeInfo = cVar.a;
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = accessibilityNodeInfo.getCollectionItemInfo();
        m8.o oVar = collectionItemInfo != null ? new m8.o(collectionItemInfo) : null;
        if (oVar != null) {
            Object obj = oVar.a;
            if (((AccessibilityNodeInfo.CollectionItemInfo) obj).isHeading()) {
                accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowSpan(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnSpan(), false));
            }
        }
    }

    @Override // f2.j0
    public final void z0(f2.k1 k1Var, int[] iArr) {
        super.z0(k1Var, iArr);
        lr0 lr0Var = this.Y;
        int i10 = lr0Var.B;
        if (i10 == 0 || qu0.p0(i10)) {
            iArr[1] = Math.max(iArr[1], org.telegram.ui.Cells.q7.a(1) * 2);
        } else if (lr0Var.B == 1) {
            iArr[1] = Math.max(iArr[1], AndroidUtilities.dp(56.0f) * 2);
        }
    }
}
