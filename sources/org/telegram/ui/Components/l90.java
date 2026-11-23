package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class l90 extends ty {
    public final xt0 X;
    public final /* synthetic */ s90 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l90(s90 s90Var) {
        super(100, false);
        this.Y = s90Var;
        this.X = new xt0();
    }

    @Override // v4.p0
    public final int A() {
        s90 s90Var = this.Y;
        return (s90Var.f.I() == null && s90Var.f.V == null) ? B() : B() - 1;
    }

    @Override // org.telegram.ui.Components.ty
    public final xt0 D1(int i7) {
        TLRPC.PhotoSize w10;
        xt0 xt0Var = this.X;
        int i10 = 0;
        xt0Var.c = false;
        s90 s90Var = this.Y;
        if (i7 == 0) {
            xt0Var.a = this.m;
            xt0Var.b = s90Var.e.h;
            xt0Var.c = true;
            return xt0Var;
        }
        int i11 = i7 - 1;
        if (s90Var.f.I() == null && s90Var.f.V == null) {
            i7 = i11;
        }
        xt0Var.a = 0.0f;
        xt0Var.b = 0.0f;
        Object J = s90Var.f.J(i7);
        if (J instanceof TLRPC.BotInlineResult) {
            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) J;
            TLRPC.Document document = botInlineResult.document;
            if (document != null) {
                TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false);
                xt0Var.a = w11 != null ? w11.w : 100.0f;
                xt0Var.b = w11 != null ? w11.h : 100.0f;
                while (i10 < botInlineResult.document.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute = botInlineResult.document.attributes.get(i10);
                    if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                        xt0Var.a = documentAttribute.w;
                        xt0Var.b = documentAttribute.h;
                        break;
                    }
                    i10++;
                }
            } else if (botInlineResult.content != null) {
                while (i10 < botInlineResult.content.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute2 = botInlineResult.content.attributes.get(i10);
                    if ((documentAttribute2 instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute2 instanceof TLRPC.TL_documentAttributeVideo)) {
                        xt0Var.a = documentAttribute2.w;
                        xt0Var.b = documentAttribute2.h;
                        break;
                    }
                    i10++;
                }
            } else if (botInlineResult.thumb != null) {
                while (i10 < botInlineResult.thumb.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute3 = botInlineResult.thumb.attributes.get(i10);
                    if ((documentAttribute3 instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute3 instanceof TLRPC.TL_documentAttributeVideo)) {
                        xt0Var.a = documentAttribute3.w;
                        xt0Var.b = documentAttribute3.h;
                        break;
                    }
                    i10++;
                }
            } else {
                TLRPC.Photo photo = botInlineResult.photo;
                if (photo != null && (w10 = org.telegram.messenger.w7.w(photo.sizes, org.telegram.messenger.g0.Z0(false), false, null, false)) != null) {
                    xt0Var.a = w10.w;
                    xt0Var.b = w10.h;
                }
            }
        }
        return xt0Var;
    }
}
