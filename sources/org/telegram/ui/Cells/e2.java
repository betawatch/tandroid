package org.telegram.ui.Cells;

import android.text.TextUtils;
import java.io.File;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.zb;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class e2 implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ h2 b;

    public e2(h2 h2Var, boolean z10) {
        this.b = h2Var;
        this.a = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00fc  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        File file;
        File file2;
        String str;
        String r5;
        File I;
        TLRPC.Document document;
        h2 h2Var = this.b;
        int i3 = h2Var.d;
        int i10 = h2Var.Q;
        String str2 = null;
        if (i10 == 5 || i10 == 3) {
            TLRPC.Document document2 = h2Var.M;
            if (document2 != null) {
                str2 = org.telegram.messenger.w7.r(null, document2);
                org.telegram.messenger.w7.G(i3);
                file = org.telegram.messenger.w7.I(h2Var.M);
            } else {
                if (h2Var.K.content instanceof TLRPC.TL_webDocument) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(Utilities.a(h2Var.K.content.url));
                    sb2.append(".");
                    sb2.append(zb.B(h2Var.K.content.url, h2Var.Q == 5 ? "mp3" : "ogg"));
                    str2 = sb2.toString();
                    file = new File(org.telegram.messenger.w7.z(4), str2);
                }
                str = null;
                file2 = null;
            }
            file2 = file;
            str = str2;
        } else {
            if (h2Var.R) {
                TLRPC.BotInlineResult botInlineResult = h2Var.K;
                if (botInlineResult != null) {
                    TLRPC.Document document3 = botInlineResult.document;
                    if (document3 instanceof TLRPC.TL_document) {
                        r5 = org.telegram.messenger.w7.r(null, document3);
                        org.telegram.messenger.w7.G(i3);
                        I = org.telegram.messenger.w7.I(h2Var.K.document);
                    } else {
                        TLRPC.Photo photo = botInlineResult.photo;
                        if (photo instanceof TLRPC.TL_photo) {
                            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(photo.sizes, org.telegram.messenger.g0.Z0(false), true, null, false);
                            h2Var.P = w10;
                            r5 = org.telegram.messenger.w7.r(null, w10);
                            org.telegram.messenger.w7.G(i3);
                            I = org.telegram.messenger.w7.I(h2Var.P);
                        } else if (botInlineResult.content instanceof TLRPC.TL_webDocument) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(Utilities.a(h2Var.K.content.url));
                            sb3.append(".");
                            TLRPC.WebDocument webDocument = h2Var.K.content;
                            sb3.append(zb.B(webDocument.url, org.telegram.messenger.w7.H(webDocument.mime_type)));
                            r5 = sb3.toString();
                            I = new File(org.telegram.messenger.w7.z(4), r5);
                            if (h2Var.Q == 2) {
                                TLRPC.WebDocument webDocument2 = h2Var.K.thumb;
                                if ((webDocument2 instanceof TLRPC.TL_webDocument) && "video/mp4".equals(webDocument2.mime_type)) {
                                    r5 = null;
                                }
                            }
                        } else {
                            if (botInlineResult.thumb instanceof TLRPC.TL_webDocument) {
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append(Utilities.a(h2Var.K.thumb.url));
                                sb4.append(".");
                                TLRPC.WebDocument webDocument3 = h2Var.K.thumb;
                                sb4.append(zb.B(webDocument3.url, org.telegram.messenger.w7.H(webDocument3.mime_type)));
                                r5 = sb4.toString();
                                I = new File(org.telegram.messenger.w7.z(4), r5);
                            }
                            I = null;
                            r5 = null;
                        }
                    }
                    document = h2Var.M;
                    if (document == null && h2Var.Q == 2 && zi.J0(document) != null) {
                        file2 = I;
                        str = str2;
                    } else {
                        file2 = I;
                        str = r5;
                    }
                } else {
                    TLRPC.Document document4 = h2Var.M;
                    if (document4 != null) {
                        r5 = org.telegram.messenger.w7.r(null, document4);
                        org.telegram.messenger.w7.G(i3);
                        I = org.telegram.messenger.w7.I(h2Var.M);
                        document = h2Var.M;
                        if (document == null) {
                        }
                        file2 = I;
                        str = r5;
                    }
                    I = null;
                    r5 = null;
                    document = h2Var.M;
                    if (document == null) {
                    }
                    file2 = I;
                    str = r5;
                }
            }
            str = null;
            file2 = null;
        }
        org.telegram.messenger.g0.h3(new g2.p0(this, str, file2, !TextUtils.isEmpty(str) && file2.exists(), this.a));
    }
}
