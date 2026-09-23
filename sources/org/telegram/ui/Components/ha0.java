package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class ha0 extends oz {
    public final jv0 X;
    public final /* synthetic */ oa0 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ha0(oa0 oa0Var) {
        super(100, false);
        this.Y = oa0Var;
        this.X = new jv0();
    }

    @Override // s4.o0
    public final int A() {
        oa0 oa0Var = this.Y;
        return (oa0Var.f.I() == null && oa0Var.f.U == null) ? B() : B() - 1;
    }

    @Override // org.telegram.ui.Components.oz
    public final jv0 D1(int i10) {
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        jv0 jv0Var = this.X;
        int i11 = 0;
        jv0Var.c = false;
        oa0 oa0Var = this.Y;
        if (i10 == 0) {
            jv0Var.a = this.m;
            jv0Var.b = oa0Var.e.h;
            jv0Var.c = true;
            return jv0Var;
        }
        int i12 = i10 - 1;
        if (oa0Var.f.I() == null && oa0Var.f.U == null) {
            i10 = i12;
        }
        jv0Var.a = 0.0f;
        jv0Var.b = 0.0f;
        Object J = oa0Var.f.J(i10);
        if (J instanceof TLRPC.BotInlineResult) {
            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) J;
            TLRPC.Document document = botInlineResult.document;
            if (document != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                jv0Var.a = closestPhotoSizeWithSize2 != null ? closestPhotoSizeWithSize2.w : 100.0f;
                jv0Var.b = closestPhotoSizeWithSize2 != null ? closestPhotoSizeWithSize2.h : 100.0f;
                while (i11 < botInlineResult.document.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute = botInlineResult.document.attributes.get(i11);
                    if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                        jv0Var.a = documentAttribute.w;
                        jv0Var.b = documentAttribute.h;
                        break;
                    }
                    i11++;
                }
            } else if (botInlineResult.content != null) {
                while (i11 < botInlineResult.content.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute2 = botInlineResult.content.attributes.get(i11);
                    if ((documentAttribute2 instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute2 instanceof TLRPC.TL_documentAttributeVideo)) {
                        jv0Var.a = documentAttribute2.w;
                        jv0Var.b = documentAttribute2.h;
                        break;
                    }
                    i11++;
                }
            } else if (botInlineResult.thumb != null) {
                while (i11 < botInlineResult.thumb.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute3 = botInlineResult.thumb.attributes.get(i11);
                    if ((documentAttribute3 instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute3 instanceof TLRPC.TL_documentAttributeVideo)) {
                        jv0Var.a = documentAttribute3.w;
                        jv0Var.b = documentAttribute3.h;
                        break;
                    }
                    i11++;
                }
            } else {
                TLRPC.Photo photo = botInlineResult.photo;
                if (photo != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize())) != null) {
                    jv0Var.a = closestPhotoSizeWithSize.w;
                    jv0Var.b = closestPhotoSizeWithSize.h;
                }
            }
        }
        return jv0Var;
    }
}
