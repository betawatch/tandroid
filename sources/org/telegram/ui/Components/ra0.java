package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class ra0 extends nz {
    public final wv0 X;
    public final /* synthetic */ ya0 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ra0(ya0 ya0Var) {
        super(100, false);
        this.Y = ya0Var;
        this.X = new wv0();
    }

    @Override // s4.o0
    public final int A() {
        ya0 ya0Var = this.Y;
        return (ya0Var.f.I() == null && ya0Var.f.U == null) ? B() : B() - 1;
    }

    @Override // org.telegram.ui.Components.nz
    public final wv0 D1(int i10) {
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        wv0 wv0Var = this.X;
        int i11 = 0;
        wv0Var.c = false;
        ya0 ya0Var = this.Y;
        if (i10 == 0) {
            wv0Var.a = this.m;
            wv0Var.b = ya0Var.e.h;
            wv0Var.c = true;
            return wv0Var;
        }
        int i12 = i10 - 1;
        if (ya0Var.f.I() == null && ya0Var.f.U == null) {
            i10 = i12;
        }
        wv0Var.a = 0.0f;
        wv0Var.b = 0.0f;
        Object J = ya0Var.f.J(i10);
        if (J instanceof TLRPC.BotInlineResult) {
            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) J;
            TLRPC.Document document = botInlineResult.document;
            if (document != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                wv0Var.a = closestPhotoSizeWithSize2 != null ? closestPhotoSizeWithSize2.w : 100.0f;
                wv0Var.b = closestPhotoSizeWithSize2 != null ? closestPhotoSizeWithSize2.h : 100.0f;
                while (i11 < botInlineResult.document.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute = botInlineResult.document.attributes.get(i11);
                    if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                        wv0Var.a = documentAttribute.w;
                        wv0Var.b = documentAttribute.h;
                        break;
                    }
                    i11++;
                }
            } else if (botInlineResult.content != null) {
                while (i11 < botInlineResult.content.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute2 = botInlineResult.content.attributes.get(i11);
                    if ((documentAttribute2 instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute2 instanceof TLRPC.TL_documentAttributeVideo)) {
                        wv0Var.a = documentAttribute2.w;
                        wv0Var.b = documentAttribute2.h;
                        break;
                    }
                    i11++;
                }
            } else if (botInlineResult.thumb != null) {
                while (i11 < botInlineResult.thumb.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute3 = botInlineResult.thumb.attributes.get(i11);
                    if ((documentAttribute3 instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute3 instanceof TLRPC.TL_documentAttributeVideo)) {
                        wv0Var.a = documentAttribute3.w;
                        wv0Var.b = documentAttribute3.h;
                        break;
                    }
                    i11++;
                }
            } else {
                TLRPC.Photo photo = botInlineResult.photo;
                if (photo != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize())) != null) {
                    wv0Var.a = closestPhotoSizeWithSize.w;
                    wv0Var.b = closestPhotoSizeWithSize.h;
                }
            }
        }
        return wv0Var;
    }
}
