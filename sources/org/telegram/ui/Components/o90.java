package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class o90 extends wy {
    public final yt0 X;
    public final /* synthetic */ v90 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o90(v90 v90Var) {
        super(100, false);
        this.Y = v90Var;
        this.X = new yt0();
    }

    @Override // v4.p0
    public final int A() {
        v90 v90Var = this.Y;
        return (v90Var.f.I() == null && v90Var.f.V == null) ? B() : B() - 1;
    }

    @Override // org.telegram.ui.Components.wy
    public final yt0 D1(int i7) {
        TLRPC.PhotoSize w10;
        yt0 yt0Var = this.X;
        int i10 = 0;
        yt0Var.c = false;
        v90 v90Var = this.Y;
        if (i7 == 0) {
            yt0Var.a = this.m;
            yt0Var.b = v90Var.e.h;
            yt0Var.c = true;
            return yt0Var;
        }
        int i11 = i7 - 1;
        if (v90Var.f.I() == null && v90Var.f.V == null) {
            i7 = i11;
        }
        yt0Var.a = 0.0f;
        yt0Var.b = 0.0f;
        Object J = v90Var.f.J(i7);
        if (J instanceof TLRPC.BotInlineResult) {
            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) J;
            TLRPC.Document document = botInlineResult.document;
            if (document != null) {
                TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false);
                yt0Var.a = w11 != null ? w11.w : 100.0f;
                yt0Var.b = w11 != null ? w11.h : 100.0f;
                while (i10 < botInlineResult.document.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute = botInlineResult.document.attributes.get(i10);
                    if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                        yt0Var.a = documentAttribute.w;
                        yt0Var.b = documentAttribute.h;
                        break;
                    }
                    i10++;
                }
            } else if (botInlineResult.content != null) {
                while (i10 < botInlineResult.content.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute2 = botInlineResult.content.attributes.get(i10);
                    if ((documentAttribute2 instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute2 instanceof TLRPC.TL_documentAttributeVideo)) {
                        yt0Var.a = documentAttribute2.w;
                        yt0Var.b = documentAttribute2.h;
                        break;
                    }
                    i10++;
                }
            } else if (botInlineResult.thumb != null) {
                while (i10 < botInlineResult.thumb.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute3 = botInlineResult.thumb.attributes.get(i10);
                    if ((documentAttribute3 instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute3 instanceof TLRPC.TL_documentAttributeVideo)) {
                        yt0Var.a = documentAttribute3.w;
                        yt0Var.b = documentAttribute3.h;
                        break;
                    }
                    i10++;
                }
            } else {
                TLRPC.Photo photo = botInlineResult.photo;
                if (photo != null && (w10 = org.telegram.messenger.w7.w(photo.sizes, org.telegram.messenger.g0.Z0(false), false, null, false)) != null) {
                    yt0Var.a = w10.w;
                    yt0Var.b = w10.h;
                }
            }
        }
        return yt0Var;
    }
}
