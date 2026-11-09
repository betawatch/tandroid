package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class a90 extends ky {
    public final ot0 X;
    public final /* synthetic */ h90 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a90(h90 h90Var) {
        super(100, false);
        this.Y = h90Var;
        this.X = new ot0();
    }

    @Override // v4.n0
    public final int A() {
        h90 h90Var = this.Y;
        return (h90Var.f.I() == null && h90Var.f.U == null) ? B() : B() - 1;
    }

    @Override // org.telegram.ui.Components.ky
    public final ot0 D1(int i7) {
        TLRPC.PhotoSize w10;
        ot0 ot0Var = this.X;
        int i10 = 0;
        ot0Var.c = false;
        h90 h90Var = this.Y;
        if (i7 == 0) {
            ot0Var.a = this.m;
            ot0Var.b = h90Var.e.h;
            ot0Var.c = true;
            return ot0Var;
        }
        int i11 = i7 - 1;
        if (h90Var.f.I() == null && h90Var.f.U == null) {
            i7 = i11;
        }
        ot0Var.a = 0.0f;
        ot0Var.b = 0.0f;
        Object J = h90Var.f.J(i7);
        if (J instanceof TLRPC.BotInlineResult) {
            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) J;
            TLRPC.Document document = botInlineResult.document;
            if (document != null) {
                TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false);
                ot0Var.a = w11 != null ? w11.w : 100.0f;
                ot0Var.b = w11 != null ? w11.h : 100.0f;
                while (i10 < botInlineResult.document.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute = botInlineResult.document.attributes.get(i10);
                    if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                        ot0Var.a = documentAttribute.w;
                        ot0Var.b = documentAttribute.h;
                        break;
                    }
                    i10++;
                }
            } else if (botInlineResult.content != null) {
                while (i10 < botInlineResult.content.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute2 = botInlineResult.content.attributes.get(i10);
                    if ((documentAttribute2 instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute2 instanceof TLRPC.TL_documentAttributeVideo)) {
                        ot0Var.a = documentAttribute2.w;
                        ot0Var.b = documentAttribute2.h;
                        break;
                    }
                    i10++;
                }
            } else if (botInlineResult.thumb != null) {
                while (i10 < botInlineResult.thumb.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute3 = botInlineResult.thumb.attributes.get(i10);
                    if ((documentAttribute3 instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute3 instanceof TLRPC.TL_documentAttributeVideo)) {
                        ot0Var.a = documentAttribute3.w;
                        ot0Var.b = documentAttribute3.h;
                        break;
                    }
                    i10++;
                }
            } else {
                TLRPC.Photo photo = botInlineResult.photo;
                if (photo != null && (w10 = org.telegram.messenger.w7.w(photo.sizes, org.telegram.messenger.g0.Z0(false), false, null, false)) != null) {
                    ot0Var.a = w10.w;
                    ot0Var.b = w10.h;
                }
            }
        }
        return ot0Var;
    }
}
