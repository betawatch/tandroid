package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class da0 extends iz {
    public final bv0 X;
    public final /* synthetic */ ka0 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public da0(ka0 ka0Var) {
        super(100, false);
        this.Y = ka0Var;
        this.X = new bv0();
    }

    @Override // f2.w0
    public final int A() {
        ka0 ka0Var = this.Y;
        return (ka0Var.f.I() == null && ka0Var.f.Q == null) ? B() : B() - 1;
    }

    @Override // org.telegram.ui.Components.iz
    public final bv0 D1(int i10) {
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        bv0 bv0Var = this.X;
        int i11 = 0;
        bv0Var.c = false;
        ka0 ka0Var = this.Y;
        if (i10 == 0) {
            bv0Var.a = this.m;
            bv0Var.b = ka0Var.e.h;
            bv0Var.c = true;
            return bv0Var;
        }
        int i12 = i10 - 1;
        if (ka0Var.f.I() == null && ka0Var.f.Q == null) {
            i10 = i12;
        }
        bv0Var.a = 0.0f;
        bv0Var.b = 0.0f;
        Object J = ka0Var.f.J(i10);
        if (J instanceof TLRPC.BotInlineResult) {
            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) J;
            TLRPC.Document document = botInlineResult.document;
            if (document != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                bv0Var.a = closestPhotoSizeWithSize2 != null ? closestPhotoSizeWithSize2.w : 100.0f;
                bv0Var.b = closestPhotoSizeWithSize2 != null ? closestPhotoSizeWithSize2.h : 100.0f;
                while (i11 < botInlineResult.document.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute = botInlineResult.document.attributes.get(i11);
                    if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                        bv0Var.a = documentAttribute.w;
                        bv0Var.b = documentAttribute.h;
                        break;
                    }
                    i11++;
                }
            } else if (botInlineResult.content != null) {
                while (i11 < botInlineResult.content.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute2 = botInlineResult.content.attributes.get(i11);
                    if ((documentAttribute2 instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute2 instanceof TLRPC.TL_documentAttributeVideo)) {
                        bv0Var.a = documentAttribute2.w;
                        bv0Var.b = documentAttribute2.h;
                        break;
                    }
                    i11++;
                }
            } else if (botInlineResult.thumb != null) {
                while (i11 < botInlineResult.thumb.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute3 = botInlineResult.thumb.attributes.get(i11);
                    if ((documentAttribute3 instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute3 instanceof TLRPC.TL_documentAttributeVideo)) {
                        bv0Var.a = documentAttribute3.w;
                        bv0Var.b = documentAttribute3.h;
                        break;
                    }
                    i11++;
                }
            } else {
                TLRPC.Photo photo = botInlineResult.photo;
                if (photo != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize())) != null) {
                    bv0Var.a = closestPhotoSizeWithSize.w;
                    bv0Var.b = closestPhotoSizeWithSize.h;
                }
            }
        }
        return bv0Var;
    }
}
