package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class z80 extends jy {
    public final mt0 X;
    public final /* synthetic */ g90 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z80(g90 g90Var) {
        super(100, false);
        this.Y = g90Var;
        this.X = new mt0();
    }

    @Override // v4.n0
    public final int A() {
        g90 g90Var = this.Y;
        return (g90Var.f.I() == null && g90Var.f.U == null) ? B() : B() - 1;
    }

    @Override // org.telegram.ui.Components.jy
    public final mt0 D1(int i7) {
        TLRPC.PhotoSize w10;
        mt0 mt0Var = this.X;
        int i10 = 0;
        mt0Var.c = false;
        g90 g90Var = this.Y;
        if (i7 == 0) {
            mt0Var.a = this.m;
            mt0Var.b = g90Var.e.h;
            mt0Var.c = true;
            return mt0Var;
        }
        int i11 = i7 - 1;
        if (g90Var.f.I() == null && g90Var.f.U == null) {
            i7 = i11;
        }
        mt0Var.a = 0.0f;
        mt0Var.b = 0.0f;
        Object J = g90Var.f.J(i7);
        if (J instanceof TLRPC.BotInlineResult) {
            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) J;
            TLRPC.Document document = botInlineResult.document;
            if (document != null) {
                TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false);
                mt0Var.a = w11 != null ? w11.w : 100.0f;
                mt0Var.b = w11 != null ? w11.h : 100.0f;
                while (i10 < botInlineResult.document.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute = botInlineResult.document.attributes.get(i10);
                    if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                        mt0Var.a = documentAttribute.w;
                        mt0Var.b = documentAttribute.h;
                        break;
                    }
                    i10++;
                }
            } else if (botInlineResult.content != null) {
                while (i10 < botInlineResult.content.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute2 = botInlineResult.content.attributes.get(i10);
                    if ((documentAttribute2 instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute2 instanceof TLRPC.TL_documentAttributeVideo)) {
                        mt0Var.a = documentAttribute2.w;
                        mt0Var.b = documentAttribute2.h;
                        break;
                    }
                    i10++;
                }
            } else if (botInlineResult.thumb != null) {
                while (i10 < botInlineResult.thumb.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute3 = botInlineResult.thumb.attributes.get(i10);
                    if ((documentAttribute3 instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute3 instanceof TLRPC.TL_documentAttributeVideo)) {
                        mt0Var.a = documentAttribute3.w;
                        mt0Var.b = documentAttribute3.h;
                        break;
                    }
                    i10++;
                }
            } else {
                TLRPC.Photo photo = botInlineResult.photo;
                if (photo != null && (w10 = org.telegram.messenger.w7.w(photo.sizes, org.telegram.messenger.g0.Z0(false), false, null, false)) != null) {
                    mt0Var.a = w10.w;
                    mt0Var.b = w10.h;
                }
            }
        }
        return mt0Var;
    }
}
