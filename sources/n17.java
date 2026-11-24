// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class n17 extends f84 {
    public final xka X;
    public final /* synthetic */ u17 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n17(u17 u17Var) {
        super(100, false);
        this.Y = u17Var;
        this.X = new xka();
    }

    @Override // f84
    public final xka B1(int i) {
        TLRPC.PhotoSize w;
        k17 k17Var = this.Y.f;
        xka xkaVar = this.X;
        int i2 = 0;
        xkaVar.c = false;
        if (i == 0) {
            xkaVar.a = this.m;
            xkaVar.b = r0.e.h;
            xkaVar.c = true;
            return xkaVar;
        }
        int i3 = i - 1;
        if (k17Var.I() == null && k17Var.V == null) {
            i = i3;
        }
        xkaVar.a = 0.0f;
        xkaVar.b = 0.0f;
        Object J = k17Var.J(i);
        if (J instanceof TLRPC.BotInlineResult) {
            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) J;
            TLRPC.Document document = botInlineResult.document;
            if (document != null) {
                TLRPC.PhotoSize w2 = bc4.w(document.thumbs, 90, false, null, false);
                xkaVar.a = w2 != null ? w2.w : 100.0f;
                xkaVar.b = w2 != null ? w2.h : 100.0f;
                while (i2 < botInlineResult.document.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute = botInlineResult.document.attributes.get(i2);
                    if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                        xkaVar.a = documentAttribute.w;
                        xkaVar.b = documentAttribute.h;
                        return xkaVar;
                    }
                    i2++;
                }
            } else if (botInlineResult.content != null) {
                while (i2 < botInlineResult.content.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute2 = botInlineResult.content.attributes.get(i2);
                    if ((documentAttribute2 instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute2 instanceof TLRPC.TL_documentAttributeVideo)) {
                        xkaVar.a = documentAttribute2.w;
                        xkaVar.b = documentAttribute2.h;
                        return xkaVar;
                    }
                    i2++;
                }
            } else if (botInlineResult.thumb != null) {
                while (i2 < botInlineResult.thumb.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute3 = botInlineResult.thumb.attributes.get(i2);
                    if ((documentAttribute3 instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute3 instanceof TLRPC.TL_documentAttributeVideo)) {
                        xkaVar.a = documentAttribute3.w;
                        xkaVar.b = documentAttribute3.h;
                        return xkaVar;
                    }
                    i2++;
                }
            } else {
                TLRPC.Photo photo = botInlineResult.photo;
                if (photo != null && (w = bc4.w(photo.sizes, gm.Y0(false), false, null, false)) != null) {
                    xkaVar.a = w.w;
                    xkaVar.b = w.h;
                }
            }
        }
        return xkaVar;
    }

    @Override // f69
    public final int z() {
        k17 k17Var = this.Y.f;
        return (k17Var.I() == null && k17Var.V == null) ? A() : A() - 1;
    }
}
