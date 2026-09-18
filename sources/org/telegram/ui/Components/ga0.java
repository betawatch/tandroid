package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class ga0 extends nz {
    public final kv0 X;
    public final /* synthetic */ na0 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ga0(na0 na0Var) {
        super(100, false);
        this.Y = na0Var;
        this.X = new kv0();
    }

    @Override // s4.o0
    public final int A() {
        na0 na0Var = this.Y;
        return (na0Var.f.I() == null && na0Var.f.U == null) ? B() : B() - 1;
    }

    @Override // org.telegram.ui.Components.nz
    public final kv0 D1(int i10) {
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        kv0 kv0Var = this.X;
        int i11 = 0;
        kv0Var.c = false;
        na0 na0Var = this.Y;
        if (i10 == 0) {
            kv0Var.a = this.m;
            kv0Var.b = na0Var.e.h;
            kv0Var.c = true;
            return kv0Var;
        }
        int i12 = i10 - 1;
        if (na0Var.f.I() == null && na0Var.f.U == null) {
            i10 = i12;
        }
        kv0Var.a = 0.0f;
        kv0Var.b = 0.0f;
        Object J = na0Var.f.J(i10);
        if (J instanceof TLRPC.BotInlineResult) {
            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) J;
            TLRPC.Document document = botInlineResult.document;
            if (document != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                kv0Var.a = closestPhotoSizeWithSize2 != null ? closestPhotoSizeWithSize2.w : 100.0f;
                kv0Var.b = closestPhotoSizeWithSize2 != null ? closestPhotoSizeWithSize2.h : 100.0f;
                while (i11 < botInlineResult.document.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute = botInlineResult.document.attributes.get(i11);
                    if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                        kv0Var.a = documentAttribute.w;
                        kv0Var.b = documentAttribute.h;
                        break;
                    }
                    i11++;
                }
            } else if (botInlineResult.content != null) {
                while (i11 < botInlineResult.content.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute2 = botInlineResult.content.attributes.get(i11);
                    if ((documentAttribute2 instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute2 instanceof TLRPC.TL_documentAttributeVideo)) {
                        kv0Var.a = documentAttribute2.w;
                        kv0Var.b = documentAttribute2.h;
                        break;
                    }
                    i11++;
                }
            } else if (botInlineResult.thumb != null) {
                while (i11 < botInlineResult.thumb.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute3 = botInlineResult.thumb.attributes.get(i11);
                    if ((documentAttribute3 instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute3 instanceof TLRPC.TL_documentAttributeVideo)) {
                        kv0Var.a = documentAttribute3.w;
                        kv0Var.b = documentAttribute3.h;
                        break;
                    }
                    i11++;
                }
            } else {
                TLRPC.Photo photo = botInlineResult.photo;
                if (photo != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize())) != null) {
                    kv0Var.a = closestPhotoSizeWithSize.w;
                    kv0Var.b = closestPhotoSizeWithSize.h;
                }
            }
        }
        return kv0Var;
    }
}
