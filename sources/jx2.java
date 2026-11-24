// default package

import android.text.TextUtils;
import java.io.File;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class jx2 implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ lx2 b;

    public jx2(lx2 lx2Var, boolean z) {
        this.b = lx2Var;
        this.a = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00fa  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        File file;
        File file2;
        String str;
        String r;
        File I;
        TLRPC.Document document;
        lx2 lx2Var = this.b;
        int i = lx2Var.d;
        byte b = lx2Var.Q;
        String str2 = null;
        if (b == 5 || b == 3) {
            TLRPC.Document document2 = lx2Var.M;
            if (document2 != null) {
                str2 = bc4.r(null, document2);
                bc4.G(i);
                file = bc4.I(lx2Var.M);
            } else {
                if (lx2Var.K.content instanceof TLRPC.TL_webDocument) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(Utilities.a(lx2Var.K.content.url));
                    sb.append(".");
                    sb.append(fn5.x(lx2Var.K.content.url, lx2Var.Q == 5 ? "mp3" : "ogg"));
                    str2 = sb.toString();
                    file = new File(bc4.z(4), str2);
                }
                str = null;
                file2 = null;
            }
            file2 = file;
            str = str2;
        } else {
            if (lx2Var.R) {
                TLRPC.BotInlineResult botInlineResult = lx2Var.K;
                if (botInlineResult != null) {
                    TLRPC.Document document3 = botInlineResult.document;
                    if (document3 instanceof TLRPC.TL_document) {
                        r = bc4.r(null, document3);
                        bc4.G(i);
                        I = bc4.I(lx2Var.K.document);
                    } else {
                        TLRPC.Photo photo = botInlineResult.photo;
                        if (photo instanceof TLRPC.TL_photo) {
                            TLRPC.PhotoSize w = bc4.w(photo.sizes, gm.Y0(false), true, null, false);
                            lx2Var.P = w;
                            r = bc4.r(null, w);
                            bc4.G(i);
                            I = bc4.I(lx2Var.P);
                        } else if (botInlineResult.content instanceof TLRPC.TL_webDocument) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(Utilities.a(lx2Var.K.content.url));
                            sb2.append(".");
                            TLRPC.WebDocument webDocument = lx2Var.K.content;
                            sb2.append(fn5.x(webDocument.url, bc4.H(webDocument.mime_type)));
                            r = sb2.toString();
                            I = new File(bc4.z(4), r);
                            if (lx2Var.Q == 2) {
                                TLRPC.WebDocument webDocument2 = lx2Var.K.thumb;
                                if ((webDocument2 instanceof TLRPC.TL_webDocument) && "video/mp4".equals(webDocument2.mime_type)) {
                                    r = null;
                                }
                            }
                        } else {
                            if (botInlineResult.thumb instanceof TLRPC.TL_webDocument) {
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(Utilities.a(lx2Var.K.thumb.url));
                                sb3.append(".");
                                TLRPC.WebDocument webDocument3 = lx2Var.K.thumb;
                                sb3.append(fn5.x(webDocument3.url, bc4.H(webDocument3.mime_type)));
                                r = sb3.toString();
                                I = new File(bc4.z(4), r);
                            }
                            I = null;
                            r = null;
                        }
                    }
                    document = lx2Var.M;
                    if (document == null && lx2Var.Q == 2 && k47.J0(document) != null) {
                        file2 = I;
                        str = str2;
                    } else {
                        file2 = I;
                        str = r;
                    }
                } else {
                    TLRPC.Document document4 = lx2Var.M;
                    if (document4 != null) {
                        r = bc4.r(null, document4);
                        bc4.G(i);
                        I = bc4.I(lx2Var.M);
                        document = lx2Var.M;
                        if (document == null) {
                        }
                        file2 = I;
                        str = r;
                    }
                    I = null;
                    r = null;
                    document = lx2Var.M;
                    if (document == null) {
                    }
                    file2 = I;
                    str = r;
                }
            }
            str = null;
            file2 = null;
        }
        gm.c3(new bb1(this, str, file2, !TextUtils.isEmpty(str) && file2.exists(), this.a));
    }
}
