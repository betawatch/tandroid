package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class ib0 extends d00 {
    public final mw0 X;
    public final /* synthetic */ pb0 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ib0(pb0 pb0Var) {
        super(100, false);
        this.Y = pb0Var;
        this.X = new mw0();
    }

    @Override // s4.p0
    public final int A() {
        pb0 pb0Var = this.Y;
        return (pb0Var.f.I() == null && pb0Var.f.U == null) ? B() : B() - 1;
    }

    @Override // org.telegram.ui.Components.d00
    public final mw0 D1(int i10) {
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        mw0 mw0Var = this.X;
        int i11 = 0;
        mw0Var.c = false;
        pb0 pb0Var = this.Y;
        if (i10 == 0) {
            mw0Var.a = this.m;
            mw0Var.b = pb0Var.e.h;
            mw0Var.c = true;
            return mw0Var;
        }
        int i12 = i10 - 1;
        if (pb0Var.f.I() == null && pb0Var.f.U == null) {
            i10 = i12;
        }
        mw0Var.a = 0.0f;
        mw0Var.b = 0.0f;
        Object J = pb0Var.f.J(i10);
        if (J instanceof TLRPC.BotInlineResult) {
            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) J;
            TLRPC.Document document = botInlineResult.document;
            if (document != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                mw0Var.a = closestPhotoSizeWithSize2 != null ? closestPhotoSizeWithSize2.w : 100.0f;
                mw0Var.b = closestPhotoSizeWithSize2 != null ? closestPhotoSizeWithSize2.h : 100.0f;
                while (i11 < botInlineResult.document.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute = botInlineResult.document.attributes.get(i11);
                    if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                        mw0Var.a = documentAttribute.w;
                        mw0Var.b = documentAttribute.h;
                        break;
                    }
                    i11++;
                }
            } else if (botInlineResult.content != null) {
                while (i11 < botInlineResult.content.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute2 = botInlineResult.content.attributes.get(i11);
                    if ((documentAttribute2 instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute2 instanceof TLRPC.TL_documentAttributeVideo)) {
                        mw0Var.a = documentAttribute2.w;
                        mw0Var.b = documentAttribute2.h;
                        break;
                    }
                    i11++;
                }
            } else if (botInlineResult.thumb != null) {
                while (i11 < botInlineResult.thumb.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute3 = botInlineResult.thumb.attributes.get(i11);
                    if ((documentAttribute3 instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute3 instanceof TLRPC.TL_documentAttributeVideo)) {
                        mw0Var.a = documentAttribute3.w;
                        mw0Var.b = documentAttribute3.h;
                        break;
                    }
                    i11++;
                }
            } else {
                TLRPC.Photo photo = botInlineResult.photo;
                if (photo != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize())) != null) {
                    mw0Var.a = closestPhotoSizeWithSize.w;
                    mw0Var.b = closestPhotoSizeWithSize.h;
                }
            }
        }
        return mw0Var;
    }
}
