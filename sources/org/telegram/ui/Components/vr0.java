package org.telegram.ui.Components;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class vr0 extends oz {
    public final jv0 X;
    public final /* synthetic */ ur0 Y;
    public final /* synthetic */ yu0 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vr0(yu0 yu0Var, ur0 ur0Var) {
        super(100, false);
        this.Z = yu0Var;
        this.Y = ur0Var;
        this.X = new jv0();
    }

    @Override // s4.o0
    public final int A() {
        if (this.Y.h.getAdapter() != this.Z.O) {
            return 0;
        }
        return B();
    }

    @Override // org.telegram.ui.Components.oz
    public final jv0 D1(int i10) {
        int i11;
        int i12;
        s4.h0 adapter = this.Y.h.getAdapter();
        yu0 yu0Var = this.Z;
        nu0[] nu0VarArr = yu0Var.t1;
        TLRPC.Document document = (adapter != yu0Var.O || nu0VarArr[5].a.isEmpty()) ? null : ((MessageObject) nu0VarArr[5].a.get(i10)).getDocument();
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

    @Override // s4.s, s4.o0
    public final void U(of.e eVar, s4.z0 z0Var, View view, s0.d dVar) {
        super.U(eVar, z0Var, view, dVar);
        AccessibilityNodeInfo accessibilityNodeInfo = dVar.a;
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = accessibilityNodeInfo.getCollectionItemInfo();
        n7.b bVar = collectionItemInfo != null ? new n7.b(collectionItemInfo) : null;
        if (bVar != null) {
            Object obj = bVar.a;
            if (((AccessibilityNodeInfo.CollectionItemInfo) obj).isHeading()) {
                accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowSpan(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnSpan(), false));
            }
        }
    }

    @Override // s4.c0
    public final void z0(s4.z0 z0Var, int[] iArr) {
        super.z0(z0Var, iArr);
        ur0 ur0Var = this.Y;
        int i10 = ur0Var.F;
        if (i10 == 0 || yu0.p0(i10)) {
            iArr[1] = Math.max(iArr[1], org.telegram.ui.Cells.u7.a(1) * 2);
        } else if (ur0Var.F == 1) {
            iArr[1] = Math.max(iArr[1], AndroidUtilities.dp(56.0f) * 2);
        }
    }
}
