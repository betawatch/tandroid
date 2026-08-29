package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ky extends iz {
    public final bv0 X;
    public final /* synthetic */ fz Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ky(fz fzVar) {
        super(100, true);
        this.Y = fzVar;
        this.X = new bv0();
        this.O = new ih.n5(this, 6);
    }

    @Override // f2.w0
    public final int A() {
        fz fzVar = this.Y;
        f2.p0 adapter = fzVar.d0.getAdapter();
        jy jyVar = fzVar.f0;
        if (adapter == jyVar && jyVar.x.isEmpty()) {
            return 0;
        }
        return B() - 1;
    }

    @Override // org.telegram.ui.Components.iz
    public final bv0 D1(int i10) {
        ArrayList<TLRPC.DocumentAttribute> arrayList;
        TLRPC.Document document;
        fz fzVar = this.Y;
        jy jyVar = fzVar.f0;
        f2.p0 adapter = fzVar.d0.getAdapter();
        jy jyVar2 = fzVar.j0;
        TLRPC.Document document2 = null;
        r4 = null;
        ArrayList<TLRPC.DocumentAttribute> arrayList2 = null;
        if (adapter != jyVar2) {
            if (jyVar.x.isEmpty()) {
                arrayList = null;
                return F1(document2, arrayList);
            }
            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) jyVar.x.get(i10);
            document = botInlineResult.document;
            if (document != null) {
                arrayList2 = document.attributes;
            } else {
                TLRPC.WebDocument webDocument = botInlineResult.content;
                if (webDocument != null) {
                    arrayList2 = webDocument.attributes;
                } else {
                    TLRPC.WebDocument webDocument2 = botInlineResult.thumb;
                    if (webDocument2 != null) {
                        arrayList2 = webDocument2.attributes;
                    }
                }
            }
            arrayList = arrayList2;
            document2 = document;
            return F1(document2, arrayList);
        }
        int i11 = jyVar2.D;
        if (i10 <= i11) {
            if (i10 == i11) {
                return null;
            }
            document2 = (TLRPC.Document) fzVar.e1.get(i10);
            arrayList = document2.attributes;
            return F1(document2, arrayList);
        }
        TLRPC.BotInlineResult botInlineResult2 = (TLRPC.BotInlineResult) jyVar2.x.get((i10 - i11) - 1);
        document = botInlineResult2.document;
        if (document != null) {
            arrayList2 = document.attributes;
        } else {
            TLRPC.WebDocument webDocument3 = botInlineResult2.content;
            if (webDocument3 != null) {
                arrayList2 = webDocument3.attributes;
            } else {
                TLRPC.WebDocument webDocument4 = botInlineResult2.thumb;
                if (webDocument4 != null) {
                    arrayList2 = webDocument4.attributes;
                }
            }
        }
        arrayList = arrayList2;
        document2 = document;
        return F1(document2, arrayList);
    }

    public final bv0 F1(TLRPC.Document document, List list) {
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        int i10;
        int i11;
        bv0 bv0Var = this.X;
        bv0Var.b = 100.0f;
        bv0Var.a = 100.0f;
        if (document != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90)) != null && (i10 = closestPhotoSizeWithSize.w) != 0 && (i11 = closestPhotoSizeWithSize.h) != 0) {
            bv0Var.a = i10;
            bv0Var.b = i11;
        }
        if (list != null) {
            for (int i12 = 0; i12 < list.size(); i12++) {
                TLRPC.DocumentAttribute documentAttribute = (TLRPC.DocumentAttribute) list.get(i12);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    bv0Var.a = documentAttribute.w;
                    bv0Var.b = documentAttribute.h;
                    break;
                }
            }
        }
        return bv0Var;
    }
}
