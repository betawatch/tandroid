package org.telegram.ui.Components;

import android.net.Uri;
import java.io.File;
import java.net.URLEncoder;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class l51 {
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

    public static Uri a(int i3, int i10, TLRPC.Document document) {
        StringBuilder m10 = k2.p1.m(i3, "?account=", "&id=");
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

    public static l51 d(int i3, TLRPC.Document document, TLRPC.Document document2, int i10, boolean z10) {
        TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo;
        String str;
        l51 l51Var = new l51();
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
        l51Var.a = i3;
        l51Var.g = document;
        l51Var.c = document.id;
        l51Var.d = a(i3, i10, document);
        if (document2 != null) {
            l51Var.h = document2;
            l51Var.e = document2.id;
            l51Var.f = a(i3, i10, document2);
            org.telegram.messenger.w7.G(i3);
            File K = org.telegram.messenger.w7.K(document2, null, false, z10);
            if (K == null || !K.exists()) {
                org.telegram.messenger.w7.G(i3);
                File K2 = org.telegram.messenger.w7.K(document2, null, true, z10);
                if (K2 != null && K2.exists()) {
                    l51Var.f = Uri.fromFile(K2);
                }
            } else {
                l51Var.f = Uri.fromFile(K);
            }
        }
        l51Var.m = lowerCase;
        long j10 = document.size;
        l51Var.k = j10;
        if (tL_documentAttributeVideo != null) {
            double d = tL_documentAttributeVideo.duration;
            l51Var.i = tL_documentAttributeVideo.w;
            l51Var.j = tL_documentAttributeVideo.h;
            l51Var.l = j10 / d;
        }
        org.telegram.messenger.w7.G(i3);
        File K3 = org.telegram.messenger.w7.K(document, null, false, z10);
        if (K3 != null && K3.exists()) {
            l51Var.d = Uri.fromFile(K3);
            return l51Var;
        }
        org.telegram.messenger.w7.G(i3);
        File K4 = org.telegram.messenger.w7.K(document, null, true, z10);
        if (K4 != null && K4.exists()) {
            l51Var.d = Uri.fromFile(K4);
        }
        return l51Var;
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
            File K = org.telegram.messenger.w7.K(this.g, null, false, z10);
            if (K == null || !K.exists()) {
                org.telegram.messenger.w7.G(this.a);
                File K2 = org.telegram.messenger.w7.K(this.g, null, true, z10);
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
        org.telegram.messenger.w7.G(this.a);
        File K3 = org.telegram.messenger.w7.K(this.h, null, false, z10);
        if (K3 != null && K3.exists()) {
            this.f = Uri.fromFile(K3);
            return;
        }
        org.telegram.messenger.w7.G(this.a);
        File K4 = org.telegram.messenger.w7.K(this.h, null, true, z10);
        if (K4 == null || !K4.exists()) {
            return;
        }
        this.f = Uri.fromFile(K4);
    }
}
