package org.telegram.ui.Components;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class ys0 extends d00 {
    public final mw0 X;
    public final /* synthetic */ xs0 Y;
    public final /* synthetic */ bw0 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ys0(bw0 bw0Var, xs0 xs0Var) {
        super(100, false);
        this.Z = bw0Var;
        this.Y = xs0Var;
        this.X = new mw0();
    }

    @Override // s4.p0
    public final int A() {
        if (this.Y.h.getAdapter() != this.Z.O) {
            return 0;
        }
        return B();
    }

    @Override // org.telegram.ui.Components.d00
    public final mw0 D1(int i10) {
        int i11;
        int i12;
        s4.i0 adapter = this.Y.h.getAdapter();
        bw0 bw0Var = this.Z;
        qv0[] qv0VarArr = bw0Var.t1;
        TLRPC.Document document = (adapter != bw0Var.O || qv0VarArr[5].a.isEmpty()) ? null : ((MessageObject) qv0VarArr[5].a.get(i10)).getDocument();
        mw0 mw0Var = this.X;
        mw0Var.b = 100.0f;
        mw0Var.a = 100.0f;
        if (document != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
            if (closestPhotoSizeWithSize != null && (i11 = closestPhotoSizeWithSize.w) != 0 && (i12 = closestPhotoSizeWithSize.h) != 0) {
                mw0Var.a = i11;
                mw0Var.b = i12;
            }
            ArrayList<TLRPC.DocumentAttribute> arrayList = document.attributes;
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i13);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    mw0Var.a = documentAttribute.w;
                    mw0Var.b = documentAttribute.h;
                    break;
                }
            }
        }
        return mw0Var;
    }

    @Override // s4.s, s4.p0
    public final void U(pf.e eVar, s4.a1 a1Var, View view, s0.d dVar) {
        super.U(eVar, a1Var, view, dVar);
        AccessibilityNodeInfo accessibilityNodeInfo = dVar.a;
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = accessibilityNodeInfo.getCollectionItemInfo();
        e.a aVar = collectionItemInfo != null ? new e.a(collectionItemInfo) : null;
        if (aVar != null) {
            Object obj = aVar.a;
            if (((AccessibilityNodeInfo.CollectionItemInfo) obj).isHeading()) {
                accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowSpan(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnSpan(), false));
            }
        }
    }

    @Override // s4.d0
    public final void z0(s4.a1 a1Var, int[] iArr) {
        super.z0(a1Var, iArr);
        xs0 xs0Var = this.Y;
        int i10 = xs0Var.F;
        if (i10 == 0 || bw0.p0(i10)) {
            iArr[1] = Math.max(iArr[1], org.telegram.ui.Cells.u7.a(1) * 2);
        } else if (xs0Var.F == 1) {
            iArr[1] = Math.max(iArr[1], AndroidUtilities.dp(56.0f) * 2);
        }
    }
}
