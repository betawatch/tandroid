package org.telegram.ui.Components;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class is0 extends nz {
    public final wv0 X;
    public final /* synthetic */ hs0 Y;
    public final /* synthetic */ lv0 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public is0(lv0 lv0Var, hs0 hs0Var) {
        super(100, false);
        this.Z = lv0Var;
        this.Y = hs0Var;
        this.X = new wv0();
    }

    @Override // s4.o0
    public final int A() {
        if (this.Y.h.getAdapter() != this.Z.O) {
            return 0;
        }
        return B();
    }

    @Override // org.telegram.ui.Components.nz
    public final wv0 D1(int i10) {
        int i11;
        int i12;
        s4.h0 adapter = this.Y.h.getAdapter();
        lv0 lv0Var = this.Z;
        av0[] av0VarArr = lv0Var.t1;
        TLRPC.Document document = (adapter != lv0Var.O || av0VarArr[5].a.isEmpty()) ? null : ((MessageObject) av0VarArr[5].a.get(i10)).getDocument();
        wv0 wv0Var = this.X;
        wv0Var.b = 100.0f;
        wv0Var.a = 100.0f;
        if (document != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
            if (closestPhotoSizeWithSize != null && (i11 = closestPhotoSizeWithSize.w) != 0 && (i12 = closestPhotoSizeWithSize.h) != 0) {
                wv0Var.a = i11;
                wv0Var.b = i12;
            }
            ArrayList<TLRPC.DocumentAttribute> arrayList = document.attributes;
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i13);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    wv0Var.a = documentAttribute.w;
                    wv0Var.b = documentAttribute.h;
                    break;
                }
            }
        }
        return wv0Var;
    }

    @Override // s4.s, s4.o0
    public final void U(of.e eVar, s4.z0 z0Var, View view, s0.d dVar) {
        super.U(eVar, z0Var, view, dVar);
        AccessibilityNodeInfo accessibilityNodeInfo = dVar.a;
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = accessibilityNodeInfo.getCollectionItemInfo();
        he.b bVar = collectionItemInfo != null ? new he.b(collectionItemInfo) : null;
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
        hs0 hs0Var = this.Y;
        int i10 = hs0Var.F;
        if (i10 == 0 || lv0.p0(i10)) {
            iArr[1] = Math.max(iArr[1], org.telegram.ui.Cells.v7.a(1) * 2);
        } else if (hs0Var.F == 1) {
            iArr[1] = Math.max(iArr[1], AndroidUtilities.dp(56.0f) * 2);
        }
    }
}
