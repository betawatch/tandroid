package org.telegram.ui.Components;

import android.net.Uri;
import java.io.File;
import java.net.URLEncoder;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class m51 {
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

    public static m51 d(int i7, TLRPC.Document document, TLRPC.Document document2, int i10, boolean z9) {
        TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo;
        String str;
        m51 m51Var = new m51();
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
        m51Var.a = i7;
        m51Var.g = document;
        m51Var.c = document.id;
        m51Var.d = a(i7, i10, document);
        if (document2 != null) {
            m51Var.h = document2;
            m51Var.e = document2.id;
            m51Var.f = a(i7, i10, document2);
            org.telegram.messenger.w7.G(i7);
            File K = org.telegram.messenger.w7.K(document2, null, false, z9);
            if (K == null || !K.exists()) {
                org.telegram.messenger.w7.G(i7);
                File K2 = org.telegram.messenger.w7.K(document2, null, true, z9);
                if (K2 != null && K2.exists()) {
                    m51Var.f = Uri.fromFile(K2);
                }
            } else {
                m51Var.f = Uri.fromFile(K);
            }
        }
        m51Var.m = lowerCase;
        long j3 = document.size;
        m51Var.k = j3;
        if (tL_documentAttributeVideo != null) {
            double d = tL_documentAttributeVideo.duration;
            m51Var.i = tL_documentAttributeVideo.w;
            m51Var.j = tL_documentAttributeVideo.h;
            m51Var.l = j3 / d;
        }
        org.telegram.messenger.w7.G(i7);
        File K3 = org.telegram.messenger.w7.K(document, null, false, z9);
        if (K3 != null && K3.exists()) {
            m51Var.d = Uri.fromFile(K3);
            return m51Var;
        }
        org.telegram.messenger.w7.G(i7);
        File K4 = org.telegram.messenger.w7.K(document, null, true, z9);
        if (K4 != null && K4.exists()) {
            m51Var.d = Uri.fromFile(K4);
        }
        return m51Var;
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
            File K = org.telegram.messenger.w7.K(this.g, null, false, z9);
            if (K == null || !K.exists()) {
                org.telegram.messenger.w7.G(this.a);
                File K2 = org.telegram.messenger.w7.K(this.g, null, true, z9);
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
        File K3 = org.telegram.messenger.w7.K(this.h, null, false, z9);
        if (K3 != null && K3.exists()) {
            this.f = Uri.fromFile(K3);
            return;
        }
        org.telegram.messenger.w7.G(this.a);
        File K4 = org.telegram.messenger.w7.K(this.h, null, true, z9);
        if (K4 == null || !K4.exists()) {
            return;
        }
        this.f = Uri.fromFile(K4);
    }
}
