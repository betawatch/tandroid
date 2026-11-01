package org.telegram.ui.Components;

import android.net.Uri;
import java.io.File;
import java.net.URLEncoder;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class u61 {
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

    public static Uri a(int i10, int i11, TLRPC.Document document) {
        StringBuilder l4 = i0.a.l(i10, "?account=", "&id=");
        l4.append(document.id);
        l4.append("&hash=");
        l4.append(document.access_hash);
        l4.append("&dc=");
        l4.append(document.dc_id);
        l4.append("&size=");
        l4.append(document.size);
        l4.append("&mime=");
        l4.append(URLEncoder.encode(document.mime_type, "UTF-8"));
        l4.append("&rid=");
        l4.append(i11);
        l4.append("&name=");
        l4.append(URLEncoder.encode(org.telegram.messenger.b8.B(document), "UTF-8"));
        l4.append("&reference=");
        byte[] bArr = document.file_reference;
        if (bArr == null) {
            bArr = new byte[0];
        }
        l4.append(Utilities.f(bArr));
        return Uri.parse("tg://" + org.telegram.messenger.b8.r(null, document) + l4.toString());
    }

    public static u61 d(int i10, TLRPC.Document document, TLRPC.Document document2, int i11, boolean z10) {
        TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo;
        String str;
        u61 u61Var = new u61();
        int i12 = 0;
        while (true) {
            if (i12 >= document.attributes.size()) {
                tL_documentAttributeVideo = null;
                break;
            }
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i12);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) documentAttribute;
                break;
            }
            i12++;
        }
        String lowerCase = (tL_documentAttributeVideo == null || (str = tL_documentAttributeVideo.video_codec) == null) ? null : str.toLowerCase();
        u61Var.a = i10;
        u61Var.g = document;
        u61Var.c = document.id;
        u61Var.d = a(i10, i11, document);
        if (document2 != null) {
            u61Var.h = document2;
            u61Var.e = document2.id;
            u61Var.f = a(i10, i11, document2);
            org.telegram.messenger.b8.G(i10);
            File K = org.telegram.messenger.b8.K(document2, null, false, z10);
            if (K == null || !K.exists()) {
                org.telegram.messenger.b8.G(i10);
                File K2 = org.telegram.messenger.b8.K(document2, null, true, z10);
                if (K2 != null && K2.exists()) {
                    u61Var.f = Uri.fromFile(K2);
                }
            } else {
                u61Var.f = Uri.fromFile(K);
            }
        }
        u61Var.m = lowerCase;
        long j10 = document.size;
        u61Var.k = j10;
        if (tL_documentAttributeVideo != null) {
            double d = tL_documentAttributeVideo.duration;
            u61Var.i = tL_documentAttributeVideo.w;
            u61Var.j = tL_documentAttributeVideo.h;
            u61Var.l = j10 / d;
        }
        org.telegram.messenger.b8.G(i10);
        File K3 = org.telegram.messenger.b8.K(document, null, false, z10);
        if (K3 != null && K3.exists()) {
            u61Var.d = Uri.fromFile(K3);
            return u61Var;
        }
        org.telegram.messenger.b8.G(i10);
        File K4 = org.telegram.messenger.b8.K(document, null, true, z10);
        if (K4 != null && K4.exists()) {
            u61Var.d = Uri.fromFile(K4);
        }
        return u61Var;
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
            org.telegram.messenger.b8.G(this.a);
            File K = org.telegram.messenger.b8.K(this.g, null, false, z10);
            if (K == null || !K.exists()) {
                org.telegram.messenger.b8.G(this.a);
                File K2 = org.telegram.messenger.b8.K(this.g, null, true, z10);
                if (K2 != null && K2.exists()) {
                    this.d = Uri.fromFile(K2);
                }
            } else {
                this.d = Uri.fromFile(K);
            }
        }
        if (c() || this.h == null) {
            return;
        }
        org.telegram.messenger.b8.G(this.a);
        File K3 = org.telegram.messenger.b8.K(this.h, null, false, z10);
        if (K3 != null && K3.exists()) {
            this.f = Uri.fromFile(K3);
            return;
        }
        org.telegram.messenger.b8.G(this.a);
        File K4 = org.telegram.messenger.b8.K(this.h, null, true, z10);
        if (K4 == null || !K4.exists()) {
            return;
        }
        this.f = Uri.fromFile(K4);
    }
}
