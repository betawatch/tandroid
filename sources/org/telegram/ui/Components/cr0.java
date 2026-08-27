package org.telegram.ui.Components;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class cr0 extends bz {
    public final tu0 X;
    public final /* synthetic */ br0 Y;
    public final /* synthetic */ hu0 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cr0(hu0 hu0Var, br0 br0Var) {
        super(100, false);
        this.Z = hu0Var;
        this.Y = br0Var;
        this.X = new tu0();
    }

    @Override // f2.x0
    public final int A() {
        if (this.Y.h.getAdapter() != this.Z.K) {
            return 0;
        }
        return B();
    }

    @Override // org.telegram.ui.Components.bz
    public final tu0 D1(int i10) {
        int i11;
        int i12;
        f2.q0 adapter = this.Y.h.getAdapter();
        hu0 hu0Var = this.Z;
        wt0[] wt0VarArr = hu0Var.p1;
        TLRPC.Document document = (adapter != hu0Var.K || wt0VarArr[5].a.isEmpty()) ? null : ((MessageObject) wt0VarArr[5].a.get(i10)).getDocument();
        tu0 tu0Var = this.X;
        tu0Var.b = 100.0f;
        tu0Var.a = 100.0f;
        if (document != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
            if (closestPhotoSizeWithSize != null && (i11 = closestPhotoSizeWithSize.w) != 0 && (i12 = closestPhotoSizeWithSize.h) != 0) {
                tu0Var.a = i11;
                tu0Var.b = i12;
            }
            ArrayList<TLRPC.DocumentAttribute> arrayList = document.attributes;
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i13);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    tu0Var.a = documentAttribute.w;
                    tu0Var.b = documentAttribute.h;
                    break;
                }
            }
        }
        return tu0Var;
    }

    @Override // f2.x, f2.x0
    public final void U(f2.e1 e1Var, f2.l1 l1Var, View view, s0.c cVar) {
        super.U(e1Var, l1Var, view, cVar);
        AccessibilityNodeInfo accessibilityNodeInfo = cVar.a;
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = accessibilityNodeInfo.getCollectionItemInfo();
        qd.b bVar = collectionItemInfo != null ? new qd.b(collectionItemInfo) : null;
        if (bVar != null) {
            Object obj = bVar.a;
            if (((AccessibilityNodeInfo.CollectionItemInfo) obj).isHeading()) {
                accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowSpan(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnSpan(), false));
            }
        }
    }

    @Override // f2.k0
    public final void z0(f2.l1 l1Var, int[] iArr) {
        super.z0(l1Var, iArr);
        br0 br0Var = this.Y;
        int i10 = br0Var.B;
        if (i10 == 0 || hu0.p0(i10)) {
            iArr[1] = Math.max(iArr[1], org.telegram.ui.Cells.p7.a(1) * 2);
        } else if (br0Var.B == 1) {
            iArr[1] = Math.max(iArr[1], AndroidUtilities.dp(56.0f) * 2);
        }
    }
}
