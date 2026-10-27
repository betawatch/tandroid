package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class ab0 extends vz {
    public final rw0 X;
    public final /* synthetic */ hb0 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ab0(hb0 hb0Var) {
        super(100, false);
        this.Y = hb0Var;
        this.X = new rw0();
    }

    @Override // s4.p0
    public final int A() {
        hb0 hb0Var = this.Y;
        return (hb0Var.f.I() == null && hb0Var.f.U == null) ? B() : B() - 1;
    }

    @Override // org.telegram.ui.Components.vz
    public final rw0 E1(int i10) {
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        rw0 rw0Var = this.X;
        int i11 = 0;
        rw0Var.c = false;
        hb0 hb0Var = this.Y;
        if (i10 == 0) {
            rw0Var.a = this.m;
            rw0Var.b = hb0Var.e.h;
            rw0Var.c = true;
            return rw0Var;
        }
        int i12 = i10 - 1;
        if (hb0Var.f.I() == null && hb0Var.f.U == null) {
            i10 = i12;
        }
        rw0Var.a = 0.0f;
        rw0Var.b = 0.0f;
        Object J = hb0Var.f.J(i10);
        if (J instanceof TLRPC.BotInlineResult) {
            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) J;
            TLRPC.Document document = botInlineResult.document;
            if (document != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                rw0Var.a = closestPhotoSizeWithSize2 != null ? closestPhotoSizeWithSize2.w : 100.0f;
                rw0Var.b = closestPhotoSizeWithSize2 != null ? closestPhotoSizeWithSize2.h : 100.0f;
                while (i11 < botInlineResult.document.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute = botInlineResult.document.attributes.get(i11);
                    if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                        rw0Var.a = documentAttribute.w;
                        rw0Var.b = documentAttribute.h;
                        break;
                    }
                    i11++;
                }
            } else if (botInlineResult.content != null) {
                while (i11 < botInlineResult.content.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute2 = botInlineResult.content.attributes.get(i11);
                    if ((documentAttribute2 instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute2 instanceof TLRPC.TL_documentAttributeVideo)) {
                        rw0Var.a = documentAttribute2.w;
                        rw0Var.b = documentAttribute2.h;
                        break;
                    }
                    i11++;
                }
            } else if (botInlineResult.thumb != null) {
                while (i11 < botInlineResult.thumb.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute3 = botInlineResult.thumb.attributes.get(i11);
                    if ((documentAttribute3 instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute3 instanceof TLRPC.TL_documentAttributeVideo)) {
                        rw0Var.a = documentAttribute3.w;
                        rw0Var.b = documentAttribute3.h;
                        break;
                    }
                    i11++;
                }
            } else {
                TLRPC.Photo photo = botInlineResult.photo;
                if (photo != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize())) != null) {
                    rw0Var.a = closestPhotoSizeWithSize.w;
                    rw0Var.b = closestPhotoSizeWithSize.h;
                }
            }
        }
        return rw0Var;
    }
}
