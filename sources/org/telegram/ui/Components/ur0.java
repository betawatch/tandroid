package org.telegram.ui.Components;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class ur0 extends nz {
    public final iv0 X;
    public final /* synthetic */ tr0 Y;
    public final /* synthetic */ xu0 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ur0(xu0 xu0Var, tr0 tr0Var) {
        super(100, false);
        this.Z = xu0Var;
        this.Y = tr0Var;
        this.X = new iv0();
    }

    @Override // s4.o0
    public final int A() {
        if (this.Y.h.getAdapter() != this.Z.O) {
            return 0;
        }
        return B();
    }

    @Override // org.telegram.ui.Components.nz
    public final iv0 D1(int i10) {
        int i11;
        int i12;
        s4.h0 adapter = this.Y.h.getAdapter();
        xu0 xu0Var = this.Z;
        mu0[] mu0VarArr = xu0Var.t1;
        TLRPC.Document document = (adapter != xu0Var.O || mu0VarArr[5].a.isEmpty()) ? null : ((MessageObject) mu0VarArr[5].a.get(i10)).getDocument();
        iv0 iv0Var = this.X;
        iv0Var.b = 100.0f;
        iv0Var.a = 100.0f;
        if (document != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
            if (closestPhotoSizeWithSize != null && (i11 = closestPhotoSizeWithSize.w) != 0 && (i12 = closestPhotoSizeWithSize.h) != 0) {
                iv0Var.a = i11;
                iv0Var.b = i12;
            }
            ArrayList<TLRPC.DocumentAttribute> arrayList = document.attributes;
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i13);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    iv0Var.a = documentAttribute.w;
                    iv0Var.b = documentAttribute.h;
                    break;
                }
            }
        }
        return iv0Var;
    }

    @Override // s4.s, s4.o0
    public final void U(pf.e eVar, s4.z0 z0Var, View view, s0.c cVar) {
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
        tr0 tr0Var = this.Y;
        int i10 = tr0Var.F;
        if (i10 == 0 || xu0.p0(i10)) {
            iArr[1] = Math.max(iArr[1], org.telegram.ui.Cells.u7.a(1) * 2);
        } else if (tr0Var.F == 1) {
            iArr[1] = Math.max(iArr[1], AndroidUtilities.dp(56.0f) * 2);
        }
    }
}
