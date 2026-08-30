package org.telegram.ui.Components;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ur0 extends nz {
    public final jv0 X;
    public final /* synthetic */ tr0 Y;
    public final /* synthetic */ yu0 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ur0(yu0 yu0Var, tr0 tr0Var) {
        super(100, false);
        this.Z = yu0Var;
        this.Y = tr0Var;
        this.X = new jv0();
    }

    @Override // f2.v0
    public final int A() {
        if (this.Y.h.getAdapter() != this.Z.L) {
            return 0;
        }
        return B();
    }

    @Override // org.telegram.ui.Components.nz
    public final jv0 D1(int i10) {
        int i11;
        int i12;
        f2.o0 adapter = this.Y.h.getAdapter();
        yu0 yu0Var = this.Z;
        nu0[] nu0VarArr = yu0Var.q1;
        TLRPC.Document document = (adapter != yu0Var.L || nu0VarArr[5].a.isEmpty()) ? null : ((MessageObject) nu0VarArr[5].a.get(i10)).getDocument();
        jv0 jv0Var = this.X;
        jv0Var.b = 100.0f;
        jv0Var.a = 100.0f;
        if (document != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
            if (closestPhotoSizeWithSize != null && (i11 = closestPhotoSizeWithSize.w) != 0 && (i12 = closestPhotoSizeWithSize.h) != 0) {
                jv0Var.a = i11;
                jv0Var.b = i12;
            }
            ArrayList<TLRPC.DocumentAttribute> arrayList = document.attributes;
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i13);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    jv0Var.a = documentAttribute.w;
                    jv0Var.b = documentAttribute.h;
                    break;
                }
            }
        }
        return jv0Var;
    }

    @Override // f2.w, f2.v0
    public final void U(bf.f fVar, f2.i1 i1Var, View view, s0.e eVar) {
        super.U(fVar, i1Var, view, eVar);
        AccessibilityNodeInfo accessibilityNodeInfo = eVar.a;
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = accessibilityNodeInfo.getCollectionItemInfo();
        s0.d dVar = collectionItemInfo != null ? new s0.d(collectionItemInfo) : null;
        if (dVar != null) {
            Object obj = dVar.a;
            if (((AccessibilityNodeInfo.CollectionItemInfo) obj).isHeading()) {
                accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowSpan(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnSpan(), false));
            }
        }
    }

    @Override // f2.i0
    public final void z0(f2.i1 i1Var, int[] iArr) {
        super.z0(i1Var, iArr);
        tr0 tr0Var = this.Y;
        int i10 = tr0Var.C;
        if (i10 == 0 || yu0.p0(i10)) {
            iArr[1] = Math.max(iArr[1], org.telegram.ui.Cells.s7.a(1) * 2);
        } else if (tr0Var.C == 1) {
            iArr[1] = Math.max(iArr[1], AndroidUtilities.dp(56.0f) * 2);
        }
    }
}
