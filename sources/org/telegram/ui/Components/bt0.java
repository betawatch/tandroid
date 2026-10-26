package org.telegram.ui.Components;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class bt0 extends vz {
    public final qw0 X;
    public final /* synthetic */ at0 Y;
    public final /* synthetic */ aw0 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bt0(aw0 aw0Var, at0 at0Var) {
        super(100, false);
        this.Z = aw0Var;
        this.Y = at0Var;
        this.X = new qw0();
    }

    @Override // s4.p0
    public final int A() {
        if (this.Y.h.getAdapter() != this.Z.Q) {
            return 0;
        }
        return B();
    }

    @Override // org.telegram.ui.Components.vz
    public final qw0 E1(int i10) {
        int i11;
        int i12;
        s4.h0 adapter = this.Y.h.getAdapter();
        aw0 aw0Var = this.Z;
        pv0[] pv0VarArr = aw0Var.v1;
        TLRPC.Document document = (adapter != aw0Var.Q || pv0VarArr[5].a.isEmpty()) ? null : ((MessageObject) pv0VarArr[5].a.get(i10)).getDocument();
        qw0 qw0Var = this.X;
        qw0Var.b = 100.0f;
        qw0Var.a = 100.0f;
        if (document != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
            if (closestPhotoSizeWithSize != null && (i11 = closestPhotoSizeWithSize.w) != 0 && (i12 = closestPhotoSizeWithSize.h) != 0) {
                qw0Var.a = i11;
                qw0Var.b = i12;
            }
            ArrayList<TLRPC.DocumentAttribute> arrayList = document.attributes;
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i13);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    qw0Var.a = documentAttribute.w;
                    qw0Var.b = documentAttribute.h;
                    break;
                }
            }
        }
        return qw0Var;
    }

    @Override // s4.t, s4.p0
    public final void U(rf.e eVar, s4.b1 b1Var, View view, s0.d dVar) {
        super.U(eVar, b1Var, view, dVar);
        AccessibilityNodeInfo accessibilityNodeInfo = dVar.a;
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = accessibilityNodeInfo.getCollectionItemInfo();
        ke.c cVar = collectionItemInfo != null ? new ke.c(collectionItemInfo) : null;
        if (cVar != null) {
            Object obj = cVar.a;
            if (((AccessibilityNodeInfo.CollectionItemInfo) obj).isHeading()) {
                accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowSpan(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnSpan(), false));
            }
        }
    }

    @Override // s4.c0
    public final void z0(s4.b1 b1Var, int[] iArr) {
        super.z0(b1Var, iArr);
        at0 at0Var = this.Y;
        int i10 = at0Var.E;
        if (i10 == 0 || aw0.w0(i10)) {
            iArr[1] = Math.max(iArr[1], org.telegram.ui.Cells.x7.a(1) * 2);
        } else if (at0Var.E == 1) {
            iArr[1] = Math.max(iArr[1], AndroidUtilities.dp(56.0f) * 2);
        }
    }
}
