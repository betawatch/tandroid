package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class qa0 extends uz {
    public final tv0 X;
    public final /* synthetic */ xa0 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qa0(xa0 xa0Var) {
        super(100, false);
        this.Y = xa0Var;
        this.X = new tv0();
    }

    @Override // s4.o0
    public final int A() {
        xa0 xa0Var = this.Y;
        return (xa0Var.f.I() == null && xa0Var.f.U == null) ? B() : B() - 1;
    }

    @Override // org.telegram.ui.Components.uz
    public final tv0 D1(int i10) {
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        tv0 tv0Var = this.X;
        int i11 = 0;
        tv0Var.c = false;
        xa0 xa0Var = this.Y;
        if (i10 == 0) {
            tv0Var.a = this.m;
            tv0Var.b = xa0Var.e.h;
            tv0Var.c = true;
            return tv0Var;
        }
        int i12 = i10 - 1;
        if (xa0Var.f.I() == null && xa0Var.f.U == null) {
            i10 = i12;
        }
        tv0Var.a = 0.0f;
        tv0Var.b = 0.0f;
        Object J = xa0Var.f.J(i10);
        if (J instanceof TLRPC.BotInlineResult) {
            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) J;
            TLRPC.Document document = botInlineResult.document;
            if (document != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                tv0Var.a = closestPhotoSizeWithSize2 != null ? closestPhotoSizeWithSize2.w : 100.0f;
                tv0Var.b = closestPhotoSizeWithSize2 != null ? closestPhotoSizeWithSize2.h : 100.0f;
                while (i11 < botInlineResult.document.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute = botInlineResult.document.attributes.get(i11);
                    if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                        tv0Var.a = documentAttribute.w;
                        tv0Var.b = documentAttribute.h;
                        break;
                    }
                    i11++;
                }
            } else if (botInlineResult.content != null) {
                while (i11 < botInlineResult.content.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute2 = botInlineResult.content.attributes.get(i11);
                    if ((documentAttribute2 instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute2 instanceof TLRPC.TL_documentAttributeVideo)) {
                        tv0Var.a = documentAttribute2.w;
                        tv0Var.b = documentAttribute2.h;
                        break;
                    }
                    i11++;
                }
            } else if (botInlineResult.thumb != null) {
                while (i11 < botInlineResult.thumb.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute3 = botInlineResult.thumb.attributes.get(i11);
                    if ((documentAttribute3 instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute3 instanceof TLRPC.TL_documentAttributeVideo)) {
                        tv0Var.a = documentAttribute3.w;
                        tv0Var.b = documentAttribute3.h;
                        break;
                    }
                    i11++;
                }
            } else {
                TLRPC.Photo photo = botInlineResult.photo;
                if (photo != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize())) != null) {
                    tv0Var.a = closestPhotoSizeWithSize.w;
                    tv0Var.b = closestPhotoSizeWithSize.h;
                }
            }
        }
        return tv0Var;
    }
}
