package org.telegram.ui.Components;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class rs0 extends wz {
    public final fw0 X;
    public final /* synthetic */ qs0 Y;
    public final /* synthetic */ uv0 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rs0(uv0 uv0Var, qs0 qs0Var) {
        super(100, false);
        this.Z = uv0Var;
        this.Y = qs0Var;
        this.X = new fw0();
    }

    @Override // s4.n0
    public final int A() {
        if (this.Y.h.getAdapter() != this.Z.O) {
            return 0;
        }
        return B();
    }

    @Override // org.telegram.ui.Components.wz
    public final fw0 D1(int i10) {
        int i11;
        int i12;
        s4.g0 adapter = this.Y.h.getAdapter();
        uv0 uv0Var = this.Z;
        jv0[] jv0VarArr = uv0Var.t1;
        TLRPC.Document document = (adapter != uv0Var.O || jv0VarArr[5].a.isEmpty()) ? null : ((MessageObject) jv0VarArr[5].a.get(i10)).getDocument();
        fw0 fw0Var = this.X;
        fw0Var.b = 100.0f;
        fw0Var.a = 100.0f;
        if (document != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
            if (closestPhotoSizeWithSize != null && (i11 = closestPhotoSizeWithSize.w) != 0 && (i12 = closestPhotoSizeWithSize.h) != 0) {
                fw0Var.a = i11;
                fw0Var.b = i12;
            }
            ArrayList<TLRPC.DocumentAttribute> arrayList = document.attributes;
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i13);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    fw0Var.a = documentAttribute.w;
                    fw0Var.b = documentAttribute.h;
                    break;
                }
            }
        }
        return fw0Var;
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
        qs0 qs0Var = this.Y;
        int i10 = qs0Var.F;
        if (i10 == 0 || uv0.q0(i10)) {
            iArr[1] = Math.max(iArr[1], org.telegram.ui.Cells.t7.a(1) * 2);
        } else if (qs0Var.F == 1) {
            iArr[1] = Math.max(iArr[1], AndroidUtilities.dp(56.0f) * 2);
        }
    }
}
