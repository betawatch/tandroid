package org.telegram.ui.Components;

import android.net.Uri;
import java.io.File;
import java.net.URLEncoder;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class r51 {
    public int a;
    public boolean b;
    public long c;
    public Uri d;
    public long e;
    public Uri f;
    public TLRPC.Document g;
    public TLRPC.Document h;
    public int i;
    public int j;
    public long k;
    public double l;
    public String m;

    public static Uri a(int i7, int i10, TLRPC.Document document) {
        StringBuilder n10 = jg.g.n(i7, "?account=", "&id=");
        n10.append(document.id);
        n10.append("&hash=");
        n10.append(document.access_hash);
        n10.append("&dc=");
        n10.append(document.dc_id);
        n10.append("&size=");
        n10.append(document.size);
        n10.append("&mime=");
        n10.append(URLEncoder.encode(document.mime_type, "UTF-8"));
        n10.append("&rid=");
        n10.append(i10);
        n10.append("&name=");
        n10.append(URLEncoder.encode(org.telegram.messenger.w7.B(document), "UTF-8"));
        n10.append("&reference=");
        byte[] bArr = document.file_reference;
        if (bArr == null) {
            bArr = new byte[0];
        }
        n10.append(Utilities.f(bArr));
        return Uri.parse("tg://" + org.telegram.messenger.w7.r(null, document) + n10.toString());
    }

    public static r51 d(int i7, TLRPC.Document document, TLRPC.Document document2, int i10, boolean z9) {
        TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo;
        String str;
        r51 r51Var = new r51();
        int i11 = 0;
        while (true) {
            if (i11 >= document.attributes.size()) {
                tL_documentAttributeVideo = null;
                break;
            }
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i11);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) documentAttribute;
                break;
            }
            i11++;
        }
        String lowerCase = (tL_documentAttributeVideo == null || (str = tL_documentAttributeVideo.video_codec) == null) ? null : str.toLowerCase();
        r51Var.a = i7;
        r51Var.g = document;
        r51Var.c = document.id;
        r51Var.d = a(i7, i10, document);
        if (document2 != null) {
            r51Var.h = document2;
            r51Var.e = document2.id;
            r51Var.f = a(i7, i10, document2);
            org.telegram.messenger.w7.G(i7);
            File J = org.telegram.messenger.w7.J(document2, null, false, z9);
            if (J == null || !J.exists()) {
                org.telegram.messenger.w7.G(i7);
                File J2 = org.telegram.messenger.w7.J(document2, null, true, z9);
                if (J2 != null && J2.exists()) {
                    r51Var.f = Uri.fromFile(J2);
                }
            } else {
                r51Var.f = Uri.fromFile(J);
            }
        }
        r51Var.m = lowerCase;
        long j3 = document.size;
        r51Var.k = j3;
        if (tL_documentAttributeVideo != null) {
            double d = tL_documentAttributeVideo.duration;
            r51Var.i = tL_documentAttributeVideo.w;
            r51Var.j = tL_documentAttributeVideo.h;
            r51Var.l = j3 / d;
        }
        org.telegram.messenger.w7.G(i7);
        File J3 = org.telegram.messenger.w7.J(document, null, false, z9);
        if (J3 != null && J3.exists()) {
            r51Var.d = Uri.fromFile(J3);
            return r51Var;
        }
        org.telegram.messenger.w7.G(i7);
        File J4 = org.telegram.messenger.w7.J(document, null, true, z9);
        if (J4 != null && J4.exists()) {
            r51Var.d = Uri.fromFile(J4);
        }
        return r51Var;
    }

    public final boolean b() {
        Uri uri = this.d;
        return uri != null && "file".equalsIgnoreCase(uri.getScheme());
    }

    public final boolean c() {
        Uri uri = this.f;
        return uri != null && "file".equalsIgnoreCase(uri.getScheme());
    }

    public final void e(boolean z9) {
        if (!b() && this.g != null) {
            org.telegram.messenger.w7.G(this.a);
            File J = org.telegram.messenger.w7.J(this.g, null, false, z9);
            if (J == null || !J.exists()) {
                org.telegram.messenger.w7.G(this.a);
                File J2 = org.telegram.messenger.w7.J(this.g, null, true, z9);
                if (J2 != null && J2.exists()) {
                    this.d = Uri.fromFile(J2);
                }
            } else {
                this.d = Uri.fromFile(J);
            }
        }
        if (c() || this.h == null) {
            return;
        }
        org.telegram.messenger.w7.G(this.a);
        File J3 = org.telegram.messenger.w7.J(this.h, null, false, z9);
        if (J3 != null && J3.exists()) {
            this.f = Uri.fromFile(J3);
            return;
        }
        org.telegram.messenger.w7.G(this.a);
        File J4 = org.telegram.messenger.w7.J(this.h, null, true, z9);
        if (J4 == null || !J4.exists()) {
            return;
        }
        this.f = Uri.fromFile(J4);
    }
}
