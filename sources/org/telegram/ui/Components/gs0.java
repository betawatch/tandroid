package org.telegram.ui.Components;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class gs0 extends oz {
    public final uv0 X;
    public final /* synthetic */ fs0 Y;
    public final /* synthetic */ jv0 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gs0(jv0 jv0Var, fs0 fs0Var) {
        super(100, false);
        this.Z = jv0Var;
        this.Y = fs0Var;
        this.X = new uv0();
    }

    @Override // s4.o0
    public final int A() {
        if (this.Y.h.getAdapter() != this.Z.O) {
            return 0;
        }
        return B();
    }

    @Override // org.telegram.ui.Components.oz
    public final uv0 D1(int i10) {
        int i11;
        int i12;
        s4.h0 adapter = this.Y.h.getAdapter();
        jv0 jv0Var = this.Z;
        yu0[] yu0VarArr = jv0Var.t1;
        TLRPC.Document document = (adapter != jv0Var.O || yu0VarArr[5].a.isEmpty()) ? null : ((MessageObject) yu0VarArr[5].a.get(i10)).getDocument();
        uv0 uv0Var = this.X;
        uv0Var.b = 100.0f;
        uv0Var.a = 100.0f;
        if (document != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
            if (closestPhotoSizeWithSize != null && (i11 = closestPhotoSizeWithSize.w) != 0 && (i12 = closestPhotoSizeWithSize.h) != 0) {
                uv0Var.a = i11;
                uv0Var.b = i12;
            }
            ArrayList<TLRPC.DocumentAttribute> arrayList = document.attributes;
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i13);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    uv0Var.a = documentAttribute.w;
                    uv0Var.b = documentAttribute.h;
                    break;
                }
            }
        }
        return uv0Var;
    }

    @Override // s4.s, s4.o0
    public final void U(of.e eVar, s4.z0 z0Var, View view, s0.d dVar) {
        super.U(eVar, z0Var, view, dVar);
        AccessibilityNodeInfo accessibilityNodeInfo = dVar.a;
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = accessibilityNodeInfo.getCollectionItemInfo();
        he.c cVar = collectionItemInfo != null ? new he.c(collectionItemInfo) : null;
        if (cVar != null) {
            Object obj = cVar.a;
            if (((AccessibilityNodeInfo.CollectionItemInfo) obj).isHeading()) {
                accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowSpan(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnSpan(), false));
            }
        }
    }

    @Override // s4.c0
    public final void z0(s4.z0 z0Var, int[] iArr) {
        super.z0(z0Var, iArr);
        fs0 fs0Var = this.Y;
        int i10 = fs0Var.F;
        if (i10 == 0 || jv0.p0(i10)) {
            iArr[1] = Math.max(iArr[1], org.telegram.ui.Cells.u7.a(1) * 2);
        } else if (fs0Var.F == 1) {
            iArr[1] = Math.max(iArr[1], AndroidUtilities.dp(56.0f) * 2);
        }
    }
}
