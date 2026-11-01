package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class r90 extends yy {
    public final qu0 X;
    public final /* synthetic */ y90 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r90(y90 y90Var) {
        super(100, false);
        this.Y = y90Var;
        this.X = new qu0();
    }

    @Override // s4.n0
    public final int A() {
        y90 y90Var = this.Y;
        return (y90Var.f.I() == null && y90Var.f.U == null) ? B() : B() - 1;
    }

    @Override // org.telegram.ui.Components.yy
    public final qu0 D1(int i10) {
        TLRPC.PhotoSize w9;
        qu0 qu0Var = this.X;
        int i11 = 0;
        qu0Var.c = false;
        y90 y90Var = this.Y;
        if (i10 == 0) {
            qu0Var.a = this.m;
            qu0Var.b = y90Var.e.h;
            qu0Var.c = true;
            return qu0Var;
        }
        int i12 = i10 - 1;
        if (y90Var.f.I() == null && y90Var.f.U == null) {
            i10 = i12;
        }
        qu0Var.a = 0.0f;
        qu0Var.b = 0.0f;
        Object J = y90Var.f.J(i10);
        if (J instanceof TLRPC.BotInlineResult) {
            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) J;
            TLRPC.Document document = botInlineResult.document;
            if (document != null) {
                TLRPC.PhotoSize w10 = org.telegram.messenger.b8.w(document.thumbs, 90, false, null, false);
                qu0Var.a = w10 != null ? w10.w : 100.0f;
                qu0Var.b = w10 != null ? w10.h : 100.0f;
                while (i11 < botInlineResult.document.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute = botInlineResult.document.attributes.get(i11);
                    if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                        qu0Var.a = documentAttribute.w;
                        qu0Var.b = documentAttribute.h;
                        break;
                    }
                    i11++;
                }
            } else if (botInlineResult.content != null) {
                while (i11 < botInlineResult.content.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute2 = botInlineResult.content.attributes.get(i11);
                    if ((documentAttribute2 instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute2 instanceof TLRPC.TL_documentAttributeVideo)) {
                        qu0Var.a = documentAttribute2.w;
                        qu0Var.b = documentAttribute2.h;
                        break;
                    }
                    i11++;
                }
            } else if (botInlineResult.thumb != null) {
                while (i11 < botInlineResult.thumb.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute3 = botInlineResult.thumb.attributes.get(i11);
                    if ((documentAttribute3 instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute3 instanceof TLRPC.TL_documentAttributeVideo)) {
                        qu0Var.a = documentAttribute3.w;
                        qu0Var.b = documentAttribute3.h;
                        break;
                    }
                    i11++;
                }
            } else {
                TLRPC.Photo photo = botInlineResult.photo;
                if (photo != null && (w9 = org.telegram.messenger.b8.w(photo.sizes, org.telegram.messenger.i0.Z0(false), false, null, false)) != null) {
                    qu0Var.a = w9.w;
                    qu0Var.b = w9.h;
                }
            }
        }
        return qu0Var;
    }
}
