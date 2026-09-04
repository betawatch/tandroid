package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class ha0 extends nz {
    public final iv0 X;
    public final /* synthetic */ oa0 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ha0(oa0 oa0Var) {
        super(100, false);
        this.Y = oa0Var;
        this.X = new iv0();
    }

    @Override // s4.o0
    public final int A() {
        oa0 oa0Var = this.Y;
        return (oa0Var.f.I() == null && oa0Var.f.U == null) ? B() : B() - 1;
    }

    @Override // org.telegram.ui.Components.nz
    public final iv0 D1(int i10) {
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        iv0 iv0Var = this.X;
        int i11 = 0;
        iv0Var.c = false;
        oa0 oa0Var = this.Y;
        if (i10 == 0) {
            iv0Var.a = this.m;
            iv0Var.b = oa0Var.e.h;
            iv0Var.c = true;
            return iv0Var;
        }
        int i12 = i10 - 1;
        if (oa0Var.f.I() == null && oa0Var.f.U == null) {
            i10 = i12;
        }
        iv0Var.a = 0.0f;
        iv0Var.b = 0.0f;
        Object J = oa0Var.f.J(i10);
        if (J instanceof TLRPC.BotInlineResult) {
            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) J;
            TLRPC.Document document = botInlineResult.document;
            if (document != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                iv0Var.a = closestPhotoSizeWithSize2 != null ? closestPhotoSizeWithSize2.w : 100.0f;
                iv0Var.b = closestPhotoSizeWithSize2 != null ? closestPhotoSizeWithSize2.h : 100.0f;
                while (i11 < botInlineResult.document.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute = botInlineResult.document.attributes.get(i11);
                    if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                        iv0Var.a = documentAttribute.w;
                        iv0Var.b = documentAttribute.h;
                        break;
                    }
                    i11++;
                }
            } else if (botInlineResult.content != null) {
                while (i11 < botInlineResult.content.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute2 = botInlineResult.content.attributes.get(i11);
                    if ((documentAttribute2 instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute2 instanceof TLRPC.TL_documentAttributeVideo)) {
                        iv0Var.a = documentAttribute2.w;
                        iv0Var.b = documentAttribute2.h;
                        break;
                    }
                    i11++;
                }
            } else if (botInlineResult.thumb != null) {
                while (i11 < botInlineResult.thumb.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute3 = botInlineResult.thumb.attributes.get(i11);
                    if ((documentAttribute3 instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute3 instanceof TLRPC.TL_documentAttributeVideo)) {
                        iv0Var.a = documentAttribute3.w;
                        iv0Var.b = documentAttribute3.h;
                        break;
                    }
                    i11++;
                }
            } else {
                TLRPC.Photo photo = botInlineResult.photo;
                if (photo != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize())) != null) {
                    iv0Var.a = closestPhotoSizeWithSize.w;
                    iv0Var.b = closestPhotoSizeWithSize.h;
                }
            }
        }
        return iv0Var;
    }
}
