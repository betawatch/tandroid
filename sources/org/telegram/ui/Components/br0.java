package org.telegram.ui.Components;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class br0 extends zy {
    public final qu0 X;
    public final /* synthetic */ ar0 Y;
    public final /* synthetic */ eu0 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public br0(eu0 eu0Var, ar0 ar0Var) {
        super(100, false);
        this.Z = eu0Var;
        this.Y = ar0Var;
        this.X = new qu0();
    }

    @Override // f2.z0
    public final int A() {
        if (this.Y.h.getAdapter() != this.Z.K) {
            return 0;
        }
        return B();
    }

    @Override // org.telegram.ui.Components.zy
    public final qu0 D1(int i9) {
        int i10;
        int i11;
        f2.r0 adapter = this.Y.h.getAdapter();
        eu0 eu0Var = this.Z;
        tt0[] tt0VarArr = eu0Var.p1;
        TLRPC.Document document = (adapter != eu0Var.K || tt0VarArr[5].a.isEmpty()) ? null : ((MessageObject) tt0VarArr[5].a.get(i9)).getDocument();
        qu0 qu0Var = this.X;
        qu0Var.b = 100.0f;
        qu0Var.a = 100.0f;
        if (document != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
            if (closestPhotoSizeWithSize != null && (i10 = closestPhotoSizeWithSize.w) != 0 && (i11 = closestPhotoSizeWithSize.h) != 0) {
                qu0Var.a = i10;
                qu0Var.b = i11;
            }
            ArrayList<TLRPC.DocumentAttribute> arrayList = document.attributes;
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i12);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    qu0Var.a = documentAttribute.w;
                    qu0Var.b = documentAttribute.h;
                    break;
                }
            }
        }
        return qu0Var;
    }

    @Override // f2.y, f2.z0
    public final void U(f2.g1 g1Var, f2.n1 n1Var, View view, s0.d dVar) {
        super.U(g1Var, n1Var, view, dVar);
        AccessibilityNodeInfo accessibilityNodeInfo = dVar.a;
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = accessibilityNodeInfo.getCollectionItemInfo();
        k8.o oVar = collectionItemInfo != null ? new k8.o(collectionItemInfo) : null;
        if (oVar != null) {
            Object obj = oVar.a;
            if (((AccessibilityNodeInfo.CollectionItemInfo) obj).isHeading()) {
                accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowSpan(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnSpan(), false));
            }
        }
    }

    @Override // f2.m0
    public final void z0(f2.n1 n1Var, int[] iArr) {
        super.z0(n1Var, iArr);
        ar0 ar0Var = this.Y;
        int i9 = ar0Var.B;
        if (i9 == 0 || eu0.p0(i9)) {
            iArr[1] = Math.max(iArr[1], org.telegram.ui.Cells.s7.a(1) * 2);
        } else if (ar0Var.B == 1) {
            iArr[1] = Math.max(iArr[1], AndroidUtilities.dp(56.0f) * 2);
        }
    }
}
