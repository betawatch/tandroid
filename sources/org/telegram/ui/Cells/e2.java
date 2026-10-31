package org.telegram.ui.Cells;

import android.text.TextUtils;
import java.io.File;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.hc;
import org.telegram.messenger.jj;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
        String r10;
        File I;
        TLRPC.Document document;
        h2 h2Var = this.b;
        int i10 = h2Var.d;
        int i11 = h2Var.P;
        String str2 = null;
        if (i11 == 5 || i11 == 3) {
            TLRPC.Document document2 = h2Var.L;
            if (document2 != null) {
                str2 = org.telegram.messenger.b8.r(null, document2);
                org.telegram.messenger.b8.G(i10);
                file = org.telegram.messenger.b8.I(h2Var.L);
            } else {
                if (h2Var.J.content instanceof TLRPC.TL_webDocument) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(Utilities.a(h2Var.J.content.url));
                    sb2.append(".");
                    sb2.append(hc.B(h2Var.J.content.url, h2Var.P == 5 ? "mp3" : "ogg"));
                    str2 = sb2.toString();
                    file = new File(org.telegram.messenger.b8.z(4), str2);
                }
                str = null;
                file2 = null;
            }
            file2 = file;
            str = str2;
        } else {
            if (h2Var.Q) {
                TLRPC.BotInlineResult botInlineResult = h2Var.J;
                if (botInlineResult != null) {
                    TLRPC.Document document3 = botInlineResult.document;
                    if (document3 instanceof TLRPC.TL_document) {
                        r10 = org.telegram.messenger.b8.r(null, document3);
                        org.telegram.messenger.b8.G(i10);
                        I = org.telegram.messenger.b8.I(h2Var.J.document);
                    } else {
                        TLRPC.Photo photo = botInlineResult.photo;
                        if (photo instanceof TLRPC.TL_photo) {
                            TLRPC.PhotoSize w9 = org.telegram.messenger.b8.w(photo.sizes, org.telegram.messenger.i0.Z0(false), true, null, false);
                            h2Var.O = w9;
                            r10 = org.telegram.messenger.b8.r(null, w9);
                            org.telegram.messenger.b8.G(i10);
                            I = org.telegram.messenger.b8.I(h2Var.O);
                        } else if (botInlineResult.content instanceof TLRPC.TL_webDocument) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(Utilities.a(h2Var.J.content.url));
                            sb3.append(".");
                            TLRPC.WebDocument webDocument = h2Var.J.content;
                            sb3.append(hc.B(webDocument.url, org.telegram.messenger.b8.H(webDocument.mime_type)));
                            r10 = sb3.toString();
                            I = new File(org.telegram.messenger.b8.z(4), r10);
                            if (h2Var.P == 2) {
                                TLRPC.WebDocument webDocument2 = h2Var.J.thumb;
                                if ((webDocument2 instanceof TLRPC.TL_webDocument) && "video/mp4".equals(webDocument2.mime_type)) {
                                    r10 = null;
                                }
                            }
                        } else {
                            if (botInlineResult.thumb instanceof TLRPC.TL_webDocument) {
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append(Utilities.a(h2Var.J.thumb.url));
                                sb4.append(".");
                                TLRPC.WebDocument webDocument3 = h2Var.J.thumb;
                                sb4.append(hc.B(webDocument3.url, org.telegram.messenger.b8.H(webDocument3.mime_type)));
                                r10 = sb4.toString();
                                I = new File(org.telegram.messenger.b8.z(4), r10);
                            }
                            I = null;
                            r10 = null;
                        }
                    }
                    document = h2Var.L;
                    if (document == null && h2Var.P == 2 && jj.J0(document) != null) {
                        file2 = I;
                        str = str2;
                    } else {
                        file2 = I;
                        str = r10;
                    }
                } else {
                    TLRPC.Document document4 = h2Var.L;
                    if (document4 != null) {
                        r10 = org.telegram.messenger.b8.r(null, document4);
                        org.telegram.messenger.b8.G(i10);
                        I = org.telegram.messenger.b8.I(h2Var.L);
                        document = h2Var.L;
                        if (document == null) {
                        }
                        file2 = I;
                        str = r10;
                    }
                    I = null;
                    r10 = null;
                    document = h2Var.L;
                    if (document == null) {
                    }
                    file2 = I;
                    str = r10;
                }
            }
            str = null;
            file2 = null;
        }
        org.telegram.messenger.i0.g3(new e2.n0(this, str, file2, !TextUtils.isEmpty(str) && file2.exists(), this.a));
    }
}
