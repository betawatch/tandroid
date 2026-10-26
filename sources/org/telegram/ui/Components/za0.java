package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class za0 extends vz {
    public final qw0 X;
    public final /* synthetic */ gb0 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public za0(gb0 gb0Var) {
        super(100, false);
        this.Y = gb0Var;
        this.X = new qw0();
    }

    @Override // s4.p0
    public final int A() {
        gb0 gb0Var = this.Y;
        return (gb0Var.f.I() == null && gb0Var.f.U == null) ? B() : B() - 1;
    }

    @Override // org.telegram.ui.Components.vz
    public final qw0 E1(int i10) {
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        qw0 qw0Var = this.X;
        int i11 = 0;
        qw0Var.c = false;
        gb0 gb0Var = this.Y;
        if (i10 == 0) {
            qw0Var.a = this.m;
            qw0Var.b = gb0Var.e.h;
            qw0Var.c = true;
            return qw0Var;
        }
        int i12 = i10 - 1;
        if (gb0Var.f.I() == null && gb0Var.f.U == null) {
            i10 = i12;
        }
        qw0Var.a = 0.0f;
        qw0Var.b = 0.0f;
        Object J = gb0Var.f.J(i10);
        if (J instanceof TLRPC.BotInlineResult) {
            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) J;
            TLRPC.Document document = botInlineResult.document;
            if (document != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                qw0Var.a = closestPhotoSizeWithSize2 != null ? closestPhotoSizeWithSize2.w : 100.0f;
                qw0Var.b = closestPhotoSizeWithSize2 != null ? closestPhotoSizeWithSize2.h : 100.0f;
                while (i11 < botInlineResult.document.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute = botInlineResult.document.attributes.get(i11);
                    if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                        qw0Var.a = documentAttribute.w;
                        qw0Var.b = documentAttribute.h;
                        break;
                    }
                    i11++;
                }
            } else if (botInlineResult.content != null) {
                while (i11 < botInlineResult.content.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute2 = botInlineResult.content.attributes.get(i11);
                    if ((documentAttribute2 instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute2 instanceof TLRPC.TL_documentAttributeVideo)) {
                        qw0Var.a = documentAttribute2.w;
                        qw0Var.b = documentAttribute2.h;
                        break;
                    }
                    i11++;
                }
            } else if (botInlineResult.thumb != null) {
                while (i11 < botInlineResult.thumb.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute3 = botInlineResult.thumb.attributes.get(i11);
                    if ((documentAttribute3 instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute3 instanceof TLRPC.TL_documentAttributeVideo)) {
                        qw0Var.a = documentAttribute3.w;
                        qw0Var.b = documentAttribute3.h;
                        break;
                    }
                    i11++;
                }
            } else {
                TLRPC.Photo photo = botInlineResult.photo;
                if (photo != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize())) != null) {
                    qw0Var.a = closestPhotoSizeWithSize.w;
                    qw0Var.b = closestPhotoSizeWithSize.h;
                }
            }
        }
        return qw0Var;
    }
}
