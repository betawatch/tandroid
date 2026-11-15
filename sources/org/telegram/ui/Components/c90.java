package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class c90 extends oy {
    public final nt0 X;
    public final /* synthetic */ j90 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c90(j90 j90Var) {
        super(100, false);
        this.Y = j90Var;
        this.X = new nt0();
    }

    @Override // v4.o0
    public final int A() {
        j90 j90Var = this.Y;
        return (j90Var.f.I() == null && j90Var.f.V == null) ? B() : B() - 1;
    }

    @Override // org.telegram.ui.Components.oy
    public final nt0 D1(int i7) {
        TLRPC.PhotoSize w10;
        nt0 nt0Var = this.X;
        int i10 = 0;
        nt0Var.c = false;
        j90 j90Var = this.Y;
        if (i7 == 0) {
            nt0Var.a = this.m;
            nt0Var.b = j90Var.e.h;
            nt0Var.c = true;
            return nt0Var;
        }
        int i11 = i7 - 1;
        if (j90Var.f.I() == null && j90Var.f.V == null) {
            i7 = i11;
        }
        nt0Var.a = 0.0f;
        nt0Var.b = 0.0f;
        Object J = j90Var.f.J(i7);
        if (J instanceof TLRPC.BotInlineResult) {
            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) J;
            TLRPC.Document document = botInlineResult.document;
            if (document != null) {
                TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false);
                nt0Var.a = w11 != null ? w11.w : 100.0f;
                nt0Var.b = w11 != null ? w11.h : 100.0f;
                while (i10 < botInlineResult.document.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute = botInlineResult.document.attributes.get(i10);
                    if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                        nt0Var.a = documentAttribute.w;
                        nt0Var.b = documentAttribute.h;
                        break;
                    }
                    i10++;
                }
            } else if (botInlineResult.content != null) {
                while (i10 < botInlineResult.content.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute2 = botInlineResult.content.attributes.get(i10);
                    if ((documentAttribute2 instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute2 instanceof TLRPC.TL_documentAttributeVideo)) {
                        nt0Var.a = documentAttribute2.w;
                        nt0Var.b = documentAttribute2.h;
                        break;
                    }
                    i10++;
                }
            } else if (botInlineResult.thumb != null) {
                while (i10 < botInlineResult.thumb.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute3 = botInlineResult.thumb.attributes.get(i10);
                    if ((documentAttribute3 instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute3 instanceof TLRPC.TL_documentAttributeVideo)) {
                        nt0Var.a = documentAttribute3.w;
                        nt0Var.b = documentAttribute3.h;
                        break;
                    }
                    i10++;
                }
            } else {
                TLRPC.Photo photo = botInlineResult.photo;
                if (photo != null && (w10 = org.telegram.messenger.w7.w(photo.sizes, org.telegram.messenger.g0.Z0(false), false, null, false)) != null) {
                    nt0Var.a = w10.w;
                    nt0Var.b = w10.h;
                }
            }
        }
        return nt0Var;
    }
}
