// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class nz6 extends w64 {
    public final via X;
    public final /* synthetic */ uz6 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nz6(uz6 uz6Var) {
        super(100, false);
        this.Y = uz6Var;
        this.X = new via();
    }

    @Override // w64
    public final via B1(int i) {
        TLRPC.PhotoSize w;
        kz6 kz6Var = this.Y.f;
        via viaVar = this.X;
        int i2 = 0;
        viaVar.c = false;
        if (i == 0) {
            viaVar.a = this.m;
            viaVar.b = r0.e.h;
            viaVar.c = true;
            return viaVar;
        }
        int i3 = i - 1;
        if (kz6Var.I() == null && kz6Var.V == null) {
            i = i3;
        }
        viaVar.a = 0.0f;
        viaVar.b = 0.0f;
        Object J = kz6Var.J(i);
        if (J instanceof TLRPC.BotInlineResult) {
            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) J;
            TLRPC.Document document = botInlineResult.document;
            if (document != null) {
                TLRPC.PhotoSize w2 = ba4.w(document.thumbs, 90, false, null, false);
                viaVar.a = w2 != null ? w2.w : 100.0f;
                viaVar.b = w2 != null ? w2.h : 100.0f;
                while (i2 < botInlineResult.document.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute = botInlineResult.document.attributes.get(i2);
                    if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                        viaVar.a = documentAttribute.w;
                        viaVar.b = documentAttribute.h;
                        return viaVar;
                    }
                    i2++;
                }
            } else if (botInlineResult.content != null) {
                while (i2 < botInlineResult.content.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute2 = botInlineResult.content.attributes.get(i2);
                    if ((documentAttribute2 instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute2 instanceof TLRPC.TL_documentAttributeVideo)) {
                        viaVar.a = documentAttribute2.w;
                        viaVar.b = documentAttribute2.h;
                        return viaVar;
                    }
                    i2++;
                }
            } else if (botInlineResult.thumb != null) {
                while (i2 < botInlineResult.thumb.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute3 = botInlineResult.thumb.attributes.get(i2);
                    if ((documentAttribute3 instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute3 instanceof TLRPC.TL_documentAttributeVideo)) {
                        viaVar.a = documentAttribute3.w;
                        viaVar.b = documentAttribute3.h;
                        return viaVar;
                    }
                    i2++;
                }
            } else {
                TLRPC.Photo photo = botInlineResult.photo;
                if (photo != null && (w = ba4.w(photo.sizes, gl.Y0(false), false, null, false)) != null) {
                    viaVar.a = w.w;
                    viaVar.b = w.h;
                }
            }
        }
        return viaVar;
    }

    @Override // d49
    public final int z() {
        kz6 kz6Var = this.Y.f;
        return (kz6Var.I() == null && kz6Var.V == null) ? A() : A() - 1;
    }
}
