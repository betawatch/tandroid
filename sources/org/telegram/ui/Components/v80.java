package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class v80 extends hy {
    public final lt0 X;
    public final /* synthetic */ c90 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v80(c90 c90Var) {
        super(100, false);
        this.Y = c90Var;
        this.X = new lt0();
    }

    @Override // u4.o0
    public final int A() {
        c90 c90Var = this.Y;
        return (c90Var.f.I() == null && c90Var.f.V == null) ? B() : B() - 1;
    }

    @Override // org.telegram.ui.Components.hy
    public final lt0 D1(int i3) {
        TLRPC.PhotoSize w10;
        lt0 lt0Var = this.X;
        int i10 = 0;
        lt0Var.c = false;
        c90 c90Var = this.Y;
        if (i3 == 0) {
            lt0Var.a = this.m;
            lt0Var.b = c90Var.e.h;
            lt0Var.c = true;
            return lt0Var;
        }
        int i11 = i3 - 1;
        if (c90Var.f.I() == null && c90Var.f.V == null) {
            i3 = i11;
        }
        lt0Var.a = 0.0f;
        lt0Var.b = 0.0f;
        Object J = c90Var.f.J(i3);
        if (J instanceof TLRPC.BotInlineResult) {
            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) J;
            TLRPC.Document document = botInlineResult.document;
            if (document != null) {
                TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false);
                lt0Var.a = w11 != null ? w11.w : 100.0f;
                lt0Var.b = w11 != null ? w11.h : 100.0f;
                while (i10 < botInlineResult.document.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute = botInlineResult.document.attributes.get(i10);
                    if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                        lt0Var.a = documentAttribute.w;
                        lt0Var.b = documentAttribute.h;
                        break;
                    }
                    i10++;
                }
            } else if (botInlineResult.content != null) {
                while (i10 < botInlineResult.content.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute2 = botInlineResult.content.attributes.get(i10);
                    if ((documentAttribute2 instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute2 instanceof TLRPC.TL_documentAttributeVideo)) {
                        lt0Var.a = documentAttribute2.w;
                        lt0Var.b = documentAttribute2.h;
                        break;
                    }
                    i10++;
                }
            } else if (botInlineResult.thumb != null) {
                while (i10 < botInlineResult.thumb.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute3 = botInlineResult.thumb.attributes.get(i10);
                    if ((documentAttribute3 instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute3 instanceof TLRPC.TL_documentAttributeVideo)) {
                        lt0Var.a = documentAttribute3.w;
                        lt0Var.b = documentAttribute3.h;
                        break;
                    }
                    i10++;
                }
            } else {
                TLRPC.Photo photo = botInlineResult.photo;
                if (photo != null && (w10 = org.telegram.messenger.w7.w(photo.sizes, org.telegram.messenger.g0.Z0(false), false, null, false)) != null) {
                    lt0Var.a = w10.w;
                    lt0Var.b = w10.h;
                }
            }
        }
        return lt0Var;
    }
}
