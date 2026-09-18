package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class pa0 extends nz {
    public final vv0 X;
    public final /* synthetic */ wa0 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pa0(wa0 wa0Var) {
        super(100, false);
        this.Y = wa0Var;
        this.X = new vv0();
    }

    @Override // s4.o0
    public final int A() {
        wa0 wa0Var = this.Y;
        return (wa0Var.f.I() == null && wa0Var.f.U == null) ? B() : B() - 1;
    }

    @Override // org.telegram.ui.Components.nz
    public final vv0 D1(int i10) {
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        vv0 vv0Var = this.X;
        int i11 = 0;
        vv0Var.c = false;
        wa0 wa0Var = this.Y;
        if (i10 == 0) {
            vv0Var.a = this.m;
            vv0Var.b = wa0Var.e.h;
            vv0Var.c = true;
            return vv0Var;
        }
        int i12 = i10 - 1;
        if (wa0Var.f.I() == null && wa0Var.f.U == null) {
            i10 = i12;
        }
        vv0Var.a = 0.0f;
        vv0Var.b = 0.0f;
        Object J = wa0Var.f.J(i10);
        if (J instanceof TLRPC.BotInlineResult) {
            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) J;
            TLRPC.Document document = botInlineResult.document;
            if (document != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                vv0Var.a = closestPhotoSizeWithSize2 != null ? closestPhotoSizeWithSize2.w : 100.0f;
                vv0Var.b = closestPhotoSizeWithSize2 != null ? closestPhotoSizeWithSize2.h : 100.0f;
                while (i11 < botInlineResult.document.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute = botInlineResult.document.attributes.get(i11);
                    if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                        vv0Var.a = documentAttribute.w;
                        vv0Var.b = documentAttribute.h;
                        break;
                    }
                    i11++;
                }
            } else if (botInlineResult.content != null) {
                while (i11 < botInlineResult.content.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute2 = botInlineResult.content.attributes.get(i11);
                    if ((documentAttribute2 instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute2 instanceof TLRPC.TL_documentAttributeVideo)) {
                        vv0Var.a = documentAttribute2.w;
                        vv0Var.b = documentAttribute2.h;
                        break;
                    }
                    i11++;
                }
            } else if (botInlineResult.thumb != null) {
                while (i11 < botInlineResult.thumb.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute3 = botInlineResult.thumb.attributes.get(i11);
                    if ((documentAttribute3 instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute3 instanceof TLRPC.TL_documentAttributeVideo)) {
                        vv0Var.a = documentAttribute3.w;
                        vv0Var.b = documentAttribute3.h;
                        break;
                    }
                    i11++;
                }
            } else {
                TLRPC.Photo photo = botInlineResult.photo;
                if (photo != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize())) != null) {
                    vv0Var.a = closestPhotoSizeWithSize.w;
                    vv0Var.b = closestPhotoSizeWithSize.h;
                }
            }
        }
        return vv0Var;
    }
}
