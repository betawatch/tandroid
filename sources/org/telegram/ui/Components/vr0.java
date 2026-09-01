package org.telegram.ui.Components;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class vr0 extends pz {
    public final kv0 X;
    public final /* synthetic */ ur0 Y;
    public final /* synthetic */ zu0 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vr0(zu0 zu0Var, ur0 ur0Var) {
        super(100, false);
        this.Z = zu0Var;
        this.Y = ur0Var;
        this.X = new kv0();
    }

    @Override // f2.w0
    public final int A() {
        if (this.Y.h.getAdapter() != this.Z.L) {
            return 0;
        }
        return B();
    }

    @Override // org.telegram.ui.Components.pz
    public final kv0 D1(int i10) {
        int i11;
        int i12;
        f2.p0 adapter = this.Y.h.getAdapter();
        zu0 zu0Var = this.Z;
        ou0[] ou0VarArr = zu0Var.q1;
        TLRPC.Document document = (adapter != zu0Var.L || ou0VarArr[5].a.isEmpty()) ? null : ((MessageObject) ou0VarArr[5].a.get(i10)).getDocument();
        kv0 kv0Var = this.X;
        kv0Var.b = 100.0f;
        kv0Var.a = 100.0f;
        if (document != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
            if (closestPhotoSizeWithSize != null && (i11 = closestPhotoSizeWithSize.w) != 0 && (i12 = closestPhotoSizeWithSize.h) != 0) {
                kv0Var.a = i11;
                kv0Var.b = i12;
            }
            ArrayList<TLRPC.DocumentAttribute> arrayList = document.attributes;
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i13);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    kv0Var.a = documentAttribute.w;
                    kv0Var.b = documentAttribute.h;
                    break;
                }
            }
        }
        return kv0Var;
    }

    @Override // f2.w, f2.w0
    public final void U(bf.f fVar, f2.j1 j1Var, View view, s0.d dVar) {
        super.U(fVar, j1Var, view, dVar);
        AccessibilityNodeInfo accessibilityNodeInfo = dVar.a;
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = accessibilityNodeInfo.getCollectionItemInfo();
        a3.c cVar = collectionItemInfo != null ? new a3.c(collectionItemInfo) : null;
        if (cVar != null) {
            Object obj = cVar.a;
            if (((AccessibilityNodeInfo.CollectionItemInfo) obj).isHeading()) {
                accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowSpan(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnSpan(), false));
            }
        }
    }

    @Override // f2.j0
    public final void z0(f2.j1 j1Var, int[] iArr) {
        super.z0(j1Var, iArr);
        ur0 ur0Var = this.Y;
        int i10 = ur0Var.C;
        if (i10 == 0 || zu0.p0(i10)) {
            iArr[1] = Math.max(iArr[1], org.telegram.ui.Cells.s7.a(1) * 2);
        } else if (ur0Var.C == 1) {
            iArr[1] = Math.max(iArr[1], AndroidUtilities.dp(56.0f) * 2);
        }
    }
}
