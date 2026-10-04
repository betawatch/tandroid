package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class ua0 extends qz {
    public final fw0 X;
    public final /* synthetic */ bb0 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ua0(bb0 bb0Var) {
        super(100, false);
        this.Y = bb0Var;
        this.X = new fw0();
    }

    @Override // s4.o0
    public final int A() {
        bb0 bb0Var = this.Y;
        return (bb0Var.f.I() == null && bb0Var.f.U == null) ? B() : B() - 1;
    }

    @Override // org.telegram.ui.Components.qz
    public final fw0 D1(int i10) {
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        fw0 fw0Var = this.X;
        int i11 = 0;
        fw0Var.c = false;
        bb0 bb0Var = this.Y;
        if (i10 == 0) {
            fw0Var.a = this.m;
            fw0Var.b = bb0Var.e.h;
            fw0Var.c = true;
            return fw0Var;
        }
        int i12 = i10 - 1;
        if (bb0Var.f.I() == null && bb0Var.f.U == null) {
            i10 = i12;
        }
        fw0Var.a = 0.0f;
        fw0Var.b = 0.0f;
        Object J = bb0Var.f.J(i10);
        if (J instanceof TLRPC.BotInlineResult) {
            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) J;
            TLRPC.Document document = botInlineResult.document;
            if (document != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                fw0Var.a = closestPhotoSizeWithSize2 != null ? closestPhotoSizeWithSize2.w : 100.0f;
                fw0Var.b = closestPhotoSizeWithSize2 != null ? closestPhotoSizeWithSize2.h : 100.0f;
                while (i11 < botInlineResult.document.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute = botInlineResult.document.attributes.get(i11);
                    if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                        fw0Var.a = documentAttribute.w;
                        fw0Var.b = documentAttribute.h;
                        break;
                    }
                    i11++;
                }
            } else if (botInlineResult.content != null) {
                while (i11 < botInlineResult.content.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute2 = botInlineResult.content.attributes.get(i11);
                    if ((documentAttribute2 instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute2 instanceof TLRPC.TL_documentAttributeVideo)) {
                        fw0Var.a = documentAttribute2.w;
                        fw0Var.b = documentAttribute2.h;
                        break;
                    }
                    i11++;
                }
            } else if (botInlineResult.thumb != null) {
                while (i11 < botInlineResult.thumb.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute3 = botInlineResult.thumb.attributes.get(i11);
                    if ((documentAttribute3 instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute3 instanceof TLRPC.TL_documentAttributeVideo)) {
                        fw0Var.a = documentAttribute3.w;
                        fw0Var.b = documentAttribute3.h;
                        break;
                    }
                    i11++;
                }
            } else {
                TLRPC.Photo photo = botInlineResult.photo;
                if (photo != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize())) != null) {
                    fw0Var.a = closestPhotoSizeWithSize.w;
                    fw0Var.b = closestPhotoSizeWithSize.h;
                }
            }
        }
        return fw0Var;
    }
}
