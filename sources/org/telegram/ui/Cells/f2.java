package org.telegram.ui.Cells;

import android.text.TextUtils;
import java.io.File;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ec;
import org.telegram.messenger.fj;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class f2 implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ i2 b;

    public f2(i2 i2Var, boolean z10) {
        this.b = i2Var;
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
        i2 i2Var = this.b;
        int i7 = i2Var.d;
        int i10 = i2Var.Q;
        String str2 = null;
        if (i10 == 5 || i10 == 3) {
            TLRPC.Document document2 = i2Var.M;
            if (document2 != null) {
                str2 = org.telegram.messenger.w7.r(null, document2);
                org.telegram.messenger.w7.G(i7);
                file = org.telegram.messenger.w7.I(i2Var.M);
            } else {
                if (i2Var.K.content instanceof TLRPC.TL_webDocument) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(Utilities.a(i2Var.K.content.url));
                    sb2.append(".");
                    sb2.append(ec.B(i2Var.K.content.url, i2Var.Q == 5 ? "mp3" : "ogg"));
                    str2 = sb2.toString();
                    file = new File(org.telegram.messenger.w7.z(4), str2);
                }
                str = null;
                file2 = null;
            }
            file2 = file;
            str = str2;
        } else {
            if (i2Var.R) {
                TLRPC.BotInlineResult botInlineResult = i2Var.K;
                if (botInlineResult != null) {
                    TLRPC.Document document3 = botInlineResult.document;
                    if (document3 instanceof TLRPC.TL_document) {
                        r10 = org.telegram.messenger.w7.r(null, document3);
                        org.telegram.messenger.w7.G(i7);
                        I = org.telegram.messenger.w7.I(i2Var.K.document);
                    } else {
                        TLRPC.Photo photo = botInlineResult.photo;
                        if (photo instanceof TLRPC.TL_photo) {
                            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(photo.sizes, org.telegram.messenger.g0.Z0(false), true, null, false);
                            i2Var.P = w10;
                            r10 = org.telegram.messenger.w7.r(null, w10);
                            org.telegram.messenger.w7.G(i7);
                            I = org.telegram.messenger.w7.I(i2Var.P);
                        } else if (botInlineResult.content instanceof TLRPC.TL_webDocument) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(Utilities.a(i2Var.K.content.url));
                            sb3.append(".");
                            TLRPC.WebDocument webDocument = i2Var.K.content;
                            sb3.append(ec.B(webDocument.url, org.telegram.messenger.w7.H(webDocument.mime_type)));
                            r10 = sb3.toString();
                            I = new File(org.telegram.messenger.w7.z(4), r10);
                            if (i2Var.Q == 2) {
                                TLRPC.WebDocument webDocument2 = i2Var.K.thumb;
                                if ((webDocument2 instanceof TLRPC.TL_webDocument) && "video/mp4".equals(webDocument2.mime_type)) {
                                    r10 = null;
                                }
                            }
                        } else {
                            if (botInlineResult.thumb instanceof TLRPC.TL_webDocument) {
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append(Utilities.a(i2Var.K.thumb.url));
                                sb4.append(".");
                                TLRPC.WebDocument webDocument3 = i2Var.K.thumb;
                                sb4.append(ec.B(webDocument3.url, org.telegram.messenger.w7.H(webDocument3.mime_type)));
                                r10 = sb4.toString();
                                I = new File(org.telegram.messenger.w7.z(4), r10);
                            }
                            I = null;
                            r10 = null;
                        }
                    }
                    document = i2Var.M;
                    if (document == null && i2Var.Q == 2 && fj.J0(document) != null) {
                        file2 = I;
                        str = str2;
                    } else {
                        file2 = I;
                        str = r10;
                    }
                } else {
                    TLRPC.Document document4 = i2Var.M;
                    if (document4 != null) {
                        r10 = org.telegram.messenger.w7.r(null, document4);
                        org.telegram.messenger.w7.G(i7);
                        I = org.telegram.messenger.w7.I(i2Var.M);
                        document = i2Var.M;
                        if (document == null) {
                        }
                        file2 = I;
                        str = r10;
                    }
                    I = null;
                    r10 = null;
                    document = i2Var.M;
                    if (document == null) {
                    }
                    file2 = I;
                    str = r10;
                }
            }
            str = null;
            file2 = null;
        }
        org.telegram.messenger.g0.g3(new h2.n0(this, str, file2, !TextUtils.isEmpty(str) && file2.exists(), this.a));
    }
}
