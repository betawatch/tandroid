package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class cb0 extends wz {
    public final iw0 X;
    public final /* synthetic */ jb0 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cb0(jb0 jb0Var) {
        super(100, false);
        this.Y = jb0Var;
        this.X = new iw0();
    }

    @Override // s4.n0
    public final int A() {
        jb0 jb0Var = this.Y;
        return (jb0Var.f.I() == null && jb0Var.f.U == null) ? B() : B() - 1;
    }

    @Override // org.telegram.ui.Components.wz
    public final iw0 D1(int i10) {
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        iw0 iw0Var = this.X;
        int i11 = 0;
        iw0Var.c = false;
        jb0 jb0Var = this.Y;
        if (i10 == 0) {
            iw0Var.a = this.m;
            iw0Var.b = jb0Var.e.h;
            iw0Var.c = true;
            return iw0Var;
        }
        int i12 = i10 - 1;
        if (jb0Var.f.I() == null && jb0Var.f.U == null) {
            i10 = i12;
        }
        iw0Var.a = 0.0f;
        iw0Var.b = 0.0f;
        Object J = jb0Var.f.J(i10);
        if (J instanceof TLRPC.BotInlineResult) {
            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) J;
            TLRPC.Document document = botInlineResult.document;
            if (document != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                iw0Var.a = closestPhotoSizeWithSize2 != null ? closestPhotoSizeWithSize2.w : 100.0f;
                iw0Var.b = closestPhotoSizeWithSize2 != null ? closestPhotoSizeWithSize2.h : 100.0f;
                while (i11 < botInlineResult.document.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute = botInlineResult.document.attributes.get(i11);
                    if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                        iw0Var.a = documentAttribute.w;
                        iw0Var.b = documentAttribute.h;
                        break;
                    }
                    i11++;
                }
            } else if (botInlineResult.content != null) {
                while (i11 < botInlineResult.content.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute2 = botInlineResult.content.attributes.get(i11);
                    if ((documentAttribute2 instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute2 instanceof TLRPC.TL_documentAttributeVideo)) {
                        iw0Var.a = documentAttribute2.w;
                        iw0Var.b = documentAttribute2.h;
                        break;
                    }
                    i11++;
                }
            } else if (botInlineResult.thumb != null) {
                while (i11 < botInlineResult.thumb.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute3 = botInlineResult.thumb.attributes.get(i11);
                    if ((documentAttribute3 instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute3 instanceof TLRPC.TL_documentAttributeVideo)) {
                        iw0Var.a = documentAttribute3.w;
                        iw0Var.b = documentAttribute3.h;
                        break;
                    }
                    i11++;
                }
            } else {
                TLRPC.Photo photo = botInlineResult.photo;
                if (photo != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize())) != null) {
                    iw0Var.a = closestPhotoSizeWithSize.w;
                    iw0Var.b = closestPhotoSizeWithSize.h;
                }
            }
        }
        return iw0Var;
    }
}
