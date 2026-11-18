package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class m90 extends uy {
    public final vt0 X;
    public final /* synthetic */ t90 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m90(t90 t90Var) {
        super(100, false);
        this.Y = t90Var;
        this.X = new vt0();
    }

    @Override // v4.p0
    public final int A() {
        t90 t90Var = this.Y;
        return (t90Var.f.I() == null && t90Var.f.V == null) ? B() : B() - 1;
    }

    @Override // org.telegram.ui.Components.uy
    public final vt0 D1(int i7) {
        TLRPC.PhotoSize w10;
        vt0 vt0Var = this.X;
        int i10 = 0;
        vt0Var.c = false;
        t90 t90Var = this.Y;
        if (i7 == 0) {
            vt0Var.a = this.m;
            vt0Var.b = t90Var.e.h;
            vt0Var.c = true;
            return vt0Var;
        }
        int i11 = i7 - 1;
        if (t90Var.f.I() == null && t90Var.f.V == null) {
            i7 = i11;
        }
        vt0Var.a = 0.0f;
        vt0Var.b = 0.0f;
        Object J = t90Var.f.J(i7);
        if (J instanceof TLRPC.BotInlineResult) {
            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) J;
            TLRPC.Document document = botInlineResult.document;
            if (document != null) {
                TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false);
                vt0Var.a = w11 != null ? w11.w : 100.0f;
                vt0Var.b = w11 != null ? w11.h : 100.0f;
                while (i10 < botInlineResult.document.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute = botInlineResult.document.attributes.get(i10);
                    if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                        vt0Var.a = documentAttribute.w;
                        vt0Var.b = documentAttribute.h;
                        break;
                    }
                    i10++;
                }
            } else if (botInlineResult.content != null) {
                while (i10 < botInlineResult.content.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute2 = botInlineResult.content.attributes.get(i10);
                    if ((documentAttribute2 instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute2 instanceof TLRPC.TL_documentAttributeVideo)) {
                        vt0Var.a = documentAttribute2.w;
                        vt0Var.b = documentAttribute2.h;
                        break;
                    }
                    i10++;
                }
            } else if (botInlineResult.thumb != null) {
                while (i10 < botInlineResult.thumb.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute3 = botInlineResult.thumb.attributes.get(i10);
                    if ((documentAttribute3 instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute3 instanceof TLRPC.TL_documentAttributeVideo)) {
                        vt0Var.a = documentAttribute3.w;
                        vt0Var.b = documentAttribute3.h;
                        break;
                    }
                    i10++;
                }
            } else {
                TLRPC.Photo photo = botInlineResult.photo;
                if (photo != null && (w10 = org.telegram.messenger.w7.w(photo.sizes, org.telegram.messenger.g0.Z0(false), false, null, false)) != null) {
                    vt0Var.a = w10.w;
                    vt0Var.b = w10.h;
                }
            }
        }
        return vt0Var;
    }
}
