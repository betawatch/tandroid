package org.telegram.ui.Components;

import android.net.Uri;
import java.io.File;
import java.net.URLEncoder;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class e61 {
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
        StringBuilder m10 = i5.c.m(i7, "?account=", "&id=");
        m10.append(document.id);
        m10.append("&hash=");
        m10.append(document.access_hash);
        m10.append("&dc=");
        m10.append(document.dc_id);
        m10.append("&size=");
        m10.append(document.size);
        m10.append("&mime=");
        m10.append(URLEncoder.encode(document.mime_type, "UTF-8"));
        m10.append("&rid=");
        m10.append(i10);
        m10.append("&name=");
        m10.append(URLEncoder.encode(org.telegram.messenger.w7.B(document), "UTF-8"));
        m10.append("&reference=");
        byte[] bArr = document.file_reference;
        if (bArr == null) {
            bArr = new byte[0];
        }
        m10.append(Utilities.f(bArr));
        return Uri.parse("tg://" + org.telegram.messenger.w7.r(null, document) + m10.toString());
    }

    public static e61 d(int i7, TLRPC.Document document, TLRPC.Document document2, int i10, boolean z10) {
        TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo;
        String str;
        e61 e61Var = new e61();
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
        e61Var.a = i7;
        e61Var.g = document;
        e61Var.c = document.id;
        e61Var.d = a(i7, i10, document);
        if (document2 != null) {
            e61Var.h = document2;
            e61Var.e = document2.id;
            e61Var.f = a(i7, i10, document2);
            org.telegram.messenger.w7.G(i7);
            File J = org.telegram.messenger.w7.J(document2, null, false, z10);
            if (J == null || !J.exists()) {
                org.telegram.messenger.w7.G(i7);
                File J2 = org.telegram.messenger.w7.J(document2, null, true, z10);
                if (J2 != null && J2.exists()) {
                    e61Var.f = Uri.fromFile(J2);
                }
            } else {
                e61Var.f = Uri.fromFile(J);
            }
        }
        e61Var.m = lowerCase;
        long j3 = document.size;
        e61Var.k = j3;
        if (tL_documentAttributeVideo != null) {
            double d = tL_documentAttributeVideo.duration;
            e61Var.i = tL_documentAttributeVideo.w;
            e61Var.j = tL_documentAttributeVideo.h;
            e61Var.l = j3 / d;
        }
        org.telegram.messenger.w7.G(i7);
        File J3 = org.telegram.messenger.w7.J(document, null, false, z10);
        if (J3 != null && J3.exists()) {
            e61Var.d = Uri.fromFile(J3);
            return e61Var;
        }
        org.telegram.messenger.w7.G(i7);
        File J4 = org.telegram.messenger.w7.J(document, null, true, z10);
        if (J4 != null && J4.exists()) {
            e61Var.d = Uri.fromFile(J4);
        }
        return e61Var;
    }

    public final boolean b() {
        Uri uri = this.d;
        return uri != null && "file".equalsIgnoreCase(uri.getScheme());
    }

    public final boolean c() {
        Uri uri = this.f;
        return uri != null && "file".equalsIgnoreCase(uri.getScheme());
    }

    public final void e(boolean z10) {
        if (!b() && this.g != null) {
            org.telegram.messenger.w7.G(this.a);
            File J = org.telegram.messenger.w7.J(this.g, null, false, z10);
            if (J == null || !J.exists()) {
                org.telegram.messenger.w7.G(this.a);
                File J2 = org.telegram.messenger.w7.J(this.g, null, true, z10);
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
        File J3 = org.telegram.messenger.w7.J(this.h, null, false, z10);
        if (J3 != null && J3.exists()) {
            this.f = Uri.fromFile(J3);
            return;
        }
        org.telegram.messenger.w7.G(this.a);
        File J4 = org.telegram.messenger.w7.J(this.h, null, true, z10);
        if (J4 == null || !J4.exists()) {
            return;
        }
        this.f = Uri.fromFile(J4);
    }
}
