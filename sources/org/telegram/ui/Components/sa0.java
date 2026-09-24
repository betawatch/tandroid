package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class sa0 extends oz {
    public final uv0 X;
    public final /* synthetic */ za0 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sa0(za0 za0Var) {
        super(100, false);
        this.Y = za0Var;
        this.X = new uv0();
    }

    @Override // s4.o0
    public final int A() {
        za0 za0Var = this.Y;
        return (za0Var.f.I() == null && za0Var.f.U == null) ? B() : B() - 1;
    }

    @Override // org.telegram.ui.Components.oz
    public final uv0 D1(int i10) {
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        uv0 uv0Var = this.X;
        int i11 = 0;
        uv0Var.c = false;
        za0 za0Var = this.Y;
        if (i10 == 0) {
            uv0Var.a = this.m;
            uv0Var.b = za0Var.e.h;
            uv0Var.c = true;
            return uv0Var;
        }
        int i12 = i10 - 1;
        if (za0Var.f.I() == null && za0Var.f.U == null) {
            i10 = i12;
        }
        uv0Var.a = 0.0f;
        uv0Var.b = 0.0f;
        Object J = za0Var.f.J(i10);
        if (J instanceof TLRPC.BotInlineResult) {
            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) J;
            TLRPC.Document document = botInlineResult.document;
            if (document != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                uv0Var.a = closestPhotoSizeWithSize2 != null ? closestPhotoSizeWithSize2.w : 100.0f;
                uv0Var.b = closestPhotoSizeWithSize2 != null ? closestPhotoSizeWithSize2.h : 100.0f;
                while (i11 < botInlineResult.document.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute = botInlineResult.document.attributes.get(i11);
                    if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                        uv0Var.a = documentAttribute.w;
                        uv0Var.b = documentAttribute.h;
                        break;
                    }
                    i11++;
                }
            } else if (botInlineResult.content != null) {
                while (i11 < botInlineResult.content.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute2 = botInlineResult.content.attributes.get(i11);
                    if ((documentAttribute2 instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute2 instanceof TLRPC.TL_documentAttributeVideo)) {
                        uv0Var.a = documentAttribute2.w;
                        uv0Var.b = documentAttribute2.h;
                        break;
                    }
                    i11++;
                }
            } else if (botInlineResult.thumb != null) {
                while (i11 < botInlineResult.thumb.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute3 = botInlineResult.thumb.attributes.get(i11);
                    if ((documentAttribute3 instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute3 instanceof TLRPC.TL_documentAttributeVideo)) {
                        uv0Var.a = documentAttribute3.w;
                        uv0Var.b = documentAttribute3.h;
                        break;
                    }
                    i11++;
                }
            } else {
                TLRPC.Photo photo = botInlineResult.photo;
                if (photo != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize())) != null) {
                    uv0Var.a = closestPhotoSizeWithSize.w;
                    uv0Var.b = closestPhotoSizeWithSize.h;
                }
            }
        }
        return uv0Var;
    }
}
