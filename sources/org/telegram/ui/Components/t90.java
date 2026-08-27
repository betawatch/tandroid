package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class t90 extends bz {
    public final tu0 X;
    public final /* synthetic */ aa0 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t90(aa0 aa0Var) {
        super(100, false);
        this.Y = aa0Var;
        this.X = new tu0();
    }

    @Override // f2.x0
    public final int A() {
        aa0 aa0Var = this.Y;
        return (aa0Var.f.I() == null && aa0Var.f.Q == null) ? B() : B() - 1;
    }

    @Override // org.telegram.ui.Components.bz
    public final tu0 D1(int i10) {
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        tu0 tu0Var = this.X;
        int i11 = 0;
        tu0Var.c = false;
        aa0 aa0Var = this.Y;
        if (i10 == 0) {
            tu0Var.a = this.m;
            tu0Var.b = aa0Var.e.h;
            tu0Var.c = true;
            return tu0Var;
        }
        int i12 = i10 - 1;
        if (aa0Var.f.I() == null && aa0Var.f.Q == null) {
            i10 = i12;
        }
        tu0Var.a = 0.0f;
        tu0Var.b = 0.0f;
        Object J = aa0Var.f.J(i10);
        if (J instanceof TLRPC.BotInlineResult) {
            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) J;
            TLRPC.Document document = botInlineResult.document;
            if (document != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                tu0Var.a = closestPhotoSizeWithSize2 != null ? closestPhotoSizeWithSize2.w : 100.0f;
                tu0Var.b = closestPhotoSizeWithSize2 != null ? closestPhotoSizeWithSize2.h : 100.0f;
                while (i11 < botInlineResult.document.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute = botInlineResult.document.attributes.get(i11);
                    if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                        tu0Var.a = documentAttribute.w;
                        tu0Var.b = documentAttribute.h;
                        break;
                    }
                    i11++;
                }
            } else if (botInlineResult.content != null) {
                while (i11 < botInlineResult.content.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute2 = botInlineResult.content.attributes.get(i11);
                    if ((documentAttribute2 instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute2 instanceof TLRPC.TL_documentAttributeVideo)) {
                        tu0Var.a = documentAttribute2.w;
                        tu0Var.b = documentAttribute2.h;
                        break;
                    }
                    i11++;
                }
            } else if (botInlineResult.thumb != null) {
                while (i11 < botInlineResult.thumb.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute3 = botInlineResult.thumb.attributes.get(i11);
                    if ((documentAttribute3 instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute3 instanceof TLRPC.TL_documentAttributeVideo)) {
                        tu0Var.a = documentAttribute3.w;
                        tu0Var.b = documentAttribute3.h;
                        break;
                    }
                    i11++;
                }
            } else {
                TLRPC.Photo photo = botInlineResult.photo;
                if (photo != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize())) != null) {
                    tu0Var.a = closestPhotoSizeWithSize.w;
                    tu0Var.b = closestPhotoSizeWithSize.h;
                }
            }
        }
        return tu0Var;
    }
}
