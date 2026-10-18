package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class bb0 extends wz {
    public final dw0 X;
    public final /* synthetic */ ib0 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bb0(ib0 ib0Var) {
        super(100, false);
        this.Y = ib0Var;
        this.X = new dw0();
    }

    @Override // s4.n0
    public final int A() {
        ib0 ib0Var = this.Y;
        return (ib0Var.f.I() == null && ib0Var.f.U == null) ? B() : B() - 1;
    }

    @Override // org.telegram.ui.Components.wz
    public final dw0 D1(int i10) {
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        dw0 dw0Var = this.X;
        int i11 = 0;
        dw0Var.c = false;
        ib0 ib0Var = this.Y;
        if (i10 == 0) {
            dw0Var.a = this.m;
            dw0Var.b = ib0Var.e.h;
            dw0Var.c = true;
            return dw0Var;
        }
        int i12 = i10 - 1;
        if (ib0Var.f.I() == null && ib0Var.f.U == null) {
            i10 = i12;
        }
        dw0Var.a = 0.0f;
        dw0Var.b = 0.0f;
        Object J = ib0Var.f.J(i10);
        if (J instanceof TLRPC.BotInlineResult) {
            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) J;
            TLRPC.Document document = botInlineResult.document;
            if (document != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                dw0Var.a = closestPhotoSizeWithSize2 != null ? closestPhotoSizeWithSize2.w : 100.0f;
                dw0Var.b = closestPhotoSizeWithSize2 != null ? closestPhotoSizeWithSize2.h : 100.0f;
                while (i11 < botInlineResult.document.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute = botInlineResult.document.attributes.get(i11);
                    if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                        dw0Var.a = documentAttribute.w;
                        dw0Var.b = documentAttribute.h;
                        break;
                    }
                    i11++;
                }
            } else if (botInlineResult.content != null) {
                while (i11 < botInlineResult.content.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute2 = botInlineResult.content.attributes.get(i11);
                    if ((documentAttribute2 instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute2 instanceof TLRPC.TL_documentAttributeVideo)) {
                        dw0Var.a = documentAttribute2.w;
                        dw0Var.b = documentAttribute2.h;
                        break;
                    }
                    i11++;
                }
            } else if (botInlineResult.thumb != null) {
                while (i11 < botInlineResult.thumb.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute3 = botInlineResult.thumb.attributes.get(i11);
                    if ((documentAttribute3 instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute3 instanceof TLRPC.TL_documentAttributeVideo)) {
                        dw0Var.a = documentAttribute3.w;
                        dw0Var.b = documentAttribute3.h;
                        break;
                    }
                    i11++;
                }
            } else {
                TLRPC.Photo photo = botInlineResult.photo;
                if (photo != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize())) != null) {
                    dw0Var.a = closestPhotoSizeWithSize.w;
                    dw0Var.b = closestPhotoSizeWithSize.h;
                }
            }
        }
        return dw0Var;
    }
}
