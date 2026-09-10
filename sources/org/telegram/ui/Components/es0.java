package org.telegram.ui.Components;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class es0 extends uz {
    public final tv0 X;
    public final /* synthetic */ ds0 Y;
    public final /* synthetic */ iv0 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public es0(iv0 iv0Var, ds0 ds0Var) {
        super(100, false);
        this.Z = iv0Var;
        this.Y = ds0Var;
        this.X = new tv0();
    }

    @Override // s4.o0
    public final int A() {
        if (this.Y.h.getAdapter() != this.Z.O) {
            return 0;
        }
        return B();
    }

    @Override // org.telegram.ui.Components.uz
    public final tv0 D1(int i10) {
        int i11;
        int i12;
        s4.h0 adapter = this.Y.h.getAdapter();
        iv0 iv0Var = this.Z;
        xu0[] xu0VarArr = iv0Var.t1;
        TLRPC.Document document = (adapter != iv0Var.O || xu0VarArr[5].a.isEmpty()) ? null : ((MessageObject) xu0VarArr[5].a.get(i10)).getDocument();
        tv0 tv0Var = this.X;
        tv0Var.b = 100.0f;
        tv0Var.a = 100.0f;
        if (document != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
            if (closestPhotoSizeWithSize != null && (i11 = closestPhotoSizeWithSize.w) != 0 && (i12 = closestPhotoSizeWithSize.h) != 0) {
                tv0Var.a = i11;
                tv0Var.b = i12;
            }
            ArrayList<TLRPC.DocumentAttribute> arrayList = document.attributes;
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i13);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    tv0Var.a = documentAttribute.w;
                    tv0Var.b = documentAttribute.h;
                    break;
                }
            }
        }
        return tv0Var;
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
        ds0 ds0Var = this.Y;
        int i10 = ds0Var.F;
        if (i10 == 0 || iv0.p0(i10)) {
            iArr[1] = Math.max(iArr[1], org.telegram.ui.Cells.v7.a(1) * 2);
        } else if (ds0Var.F == 1) {
            iArr[1] = Math.max(iArr[1], AndroidUtilities.dp(56.0f) * 2);
        }
    }
}
