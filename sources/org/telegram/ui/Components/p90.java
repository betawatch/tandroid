package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class p90 extends zy {
    public final qu0 X;
    public final /* synthetic */ w90 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p90(w90 w90Var) {
        super(100, false);
        this.Y = w90Var;
        this.X = new qu0();
    }

    @Override // f2.z0
    public final int A() {
        w90 w90Var = this.Y;
        return (w90Var.f.I() == null && w90Var.f.Q == null) ? B() : B() - 1;
    }

    @Override // org.telegram.ui.Components.zy
    public final qu0 D1(int i9) {
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        qu0 qu0Var = this.X;
        int i10 = 0;
        qu0Var.c = false;
        w90 w90Var = this.Y;
        if (i9 == 0) {
            qu0Var.a = this.m;
            qu0Var.b = w90Var.e.h;
            qu0Var.c = true;
            return qu0Var;
        }
        int i11 = i9 - 1;
        if (w90Var.f.I() == null && w90Var.f.Q == null) {
            i9 = i11;
        }
        qu0Var.a = 0.0f;
        qu0Var.b = 0.0f;
        Object J = w90Var.f.J(i9);
        if (J instanceof TLRPC.BotInlineResult) {
            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) J;
            TLRPC.Document document = botInlineResult.document;
            if (document != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                qu0Var.a = closestPhotoSizeWithSize2 != null ? closestPhotoSizeWithSize2.w : 100.0f;
                qu0Var.b = closestPhotoSizeWithSize2 != null ? closestPhotoSizeWithSize2.h : 100.0f;
                while (i10 < botInlineResult.document.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute = botInlineResult.document.attributes.get(i10);
                    if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                        qu0Var.a = documentAttribute.w;
                        qu0Var.b = documentAttribute.h;
                        break;
                    }
                    i10++;
                }
            } else if (botInlineResult.content != null) {
                while (i10 < botInlineResult.content.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute2 = botInlineResult.content.attributes.get(i10);
                    if ((documentAttribute2 instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute2 instanceof TLRPC.TL_documentAttributeVideo)) {
                        qu0Var.a = documentAttribute2.w;
                        qu0Var.b = documentAttribute2.h;
                        break;
                    }
                    i10++;
                }
            } else if (botInlineResult.thumb != null) {
                while (i10 < botInlineResult.thumb.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute3 = botInlineResult.thumb.attributes.get(i10);
                    if ((documentAttribute3 instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute3 instanceof TLRPC.TL_documentAttributeVideo)) {
                        qu0Var.a = documentAttribute3.w;
                        qu0Var.b = documentAttribute3.h;
                        break;
                    }
                    i10++;
                }
            } else {
                TLRPC.Photo photo = botInlineResult.photo;
                if (photo != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize())) != null) {
                    qu0Var.a = closestPhotoSizeWithSize.w;
                    qu0Var.b = closestPhotoSizeWithSize.h;
                }
            }
        }
        return qu0Var;
    }
}
