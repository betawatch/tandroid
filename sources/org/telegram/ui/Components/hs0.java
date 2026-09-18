package org.telegram.ui.Components;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class hs0 extends nz {
    public final vv0 X;
    public final /* synthetic */ gs0 Y;
    public final /* synthetic */ kv0 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hs0(kv0 kv0Var, gs0 gs0Var) {
        super(100, false);
        this.Z = kv0Var;
        this.Y = gs0Var;
        this.X = new vv0();
    }

    @Override // s4.o0
    public final int A() {
        if (this.Y.h.getAdapter() != this.Z.O) {
            return 0;
        }
        return B();
    }

    @Override // org.telegram.ui.Components.nz
    public final vv0 D1(int i10) {
        int i11;
        int i12;
        s4.h0 adapter = this.Y.h.getAdapter();
        kv0 kv0Var = this.Z;
        zu0[] zu0VarArr = kv0Var.t1;
        TLRPC.Document document = (adapter != kv0Var.O || zu0VarArr[5].a.isEmpty()) ? null : ((MessageObject) zu0VarArr[5].a.get(i10)).getDocument();
        vv0 vv0Var = this.X;
        vv0Var.b = 100.0f;
        vv0Var.a = 100.0f;
        if (document != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
            if (closestPhotoSizeWithSize != null && (i11 = closestPhotoSizeWithSize.w) != 0 && (i12 = closestPhotoSizeWithSize.h) != 0) {
                vv0Var.a = i11;
                vv0Var.b = i12;
            }
            ArrayList<TLRPC.DocumentAttribute> arrayList = document.attributes;
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i13);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    vv0Var.a = documentAttribute.w;
                    vv0Var.b = documentAttribute.h;
                    break;
                }
            }
        }
        return vv0Var;
    }

    @Override // s4.s, s4.o0
    public final void U(of.e eVar, s4.z0 z0Var, View view, s0.c cVar) {
        super.U(eVar, z0Var, view, cVar);
        AccessibilityNodeInfo accessibilityNodeInfo = cVar.a;
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = accessibilityNodeInfo.getCollectionItemInfo();
        he.c cVar2 = collectionItemInfo != null ? new he.c(collectionItemInfo) : null;
        if (cVar2 != null) {
            Object obj = cVar2.a;
            if (((AccessibilityNodeInfo.CollectionItemInfo) obj).isHeading()) {
                accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowSpan(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnSpan(), false));
            }
        }
    }

    @Override // s4.c0
    public final void z0(s4.z0 z0Var, int[] iArr) {
        super.z0(z0Var, iArr);
        gs0 gs0Var = this.Y;
        int i10 = gs0Var.F;
        if (i10 == 0 || kv0.p0(i10)) {
            iArr[1] = Math.max(iArr[1], org.telegram.ui.Cells.u7.a(1) * 2);
        } else if (gs0Var.F == 1) {
            iArr[1] = Math.max(iArr[1], AndroidUtilities.dp(56.0f) * 2);
        }
    }
}
