// default package

import android.net.Uri;
import java.io.File;
import java.net.URLEncoder;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class mdc {
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

    public static Uri a(int i, int i2, TLRPC.Document document) {
        StringBuilder l = hg9.l(i, "?account=", "&id=");
        l.append(document.id);
        l.append("&hash=");
        l.append(document.access_hash);
        l.append("&dc=");
        l.append(document.dc_id);
        l.append("&size=");
        l.append(document.size);
        l.append("&mime=");
        l.append(URLEncoder.encode(document.mime_type, "UTF-8"));
        l.append("&rid=");
        l.append(i2);
        l.append("&name=");
        l.append(URLEncoder.encode(bc4.B(document), "UTF-8"));
        l.append("&reference=");
        byte[] bArr = document.file_reference;
        if (bArr == null) {
            bArr = new byte[0];
        }
        l.append(Utilities.f(bArr));
        return Uri.parse("tg://" + bc4.r(null, document) + l.toString());
    }

    public static mdc d(int i, TLRPC.Document document, TLRPC.Document document2, int i2, boolean z) {
        TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo;
        String str;
        mdc mdcVar = new mdc();
        int i3 = 0;
        while (true) {
            if (i3 >= document.attributes.size()) {
                tL_documentAttributeVideo = null;
                break;
            }
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i3);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) documentAttribute;
                break;
            }
            i3++;
        }
        String lowerCase = (tL_documentAttributeVideo == null || (str = tL_documentAttributeVideo.video_codec) == null) ? null : str.toLowerCase();
        mdcVar.a = i;
        mdcVar.g = document;
        mdcVar.c = document.id;
        mdcVar.d = a(i, i2, document);
        if (document2 != null) {
            mdcVar.h = document2;
            mdcVar.e = document2.id;
            mdcVar.f = a(i, i2, document2);
            bc4.G(i);
            File J = bc4.J(document2, null, false, z);
            if (J == null || !J.exists()) {
                bc4.G(i);
                File J2 = bc4.J(document2, null, true, z);
                if (J2 != null && J2.exists()) {
                    mdcVar.f = Uri.fromFile(J2);
                }
            } else {
                mdcVar.f = Uri.fromFile(J);
            }
        }
        mdcVar.m = lowerCase;
        long j = document.size;
        mdcVar.k = j;
        if (tL_documentAttributeVideo != null) {
            double d = tL_documentAttributeVideo.duration;
            mdcVar.i = tL_documentAttributeVideo.w;
            mdcVar.j = tL_documentAttributeVideo.h;
            mdcVar.l = j / d;
        }
        bc4.G(i);
        File J3 = bc4.J(document, null, false, z);
        if (J3 != null && J3.exists()) {
            mdcVar.d = Uri.fromFile(J3);
            return mdcVar;
        }
        bc4.G(i);
        File J4 = bc4.J(document, null, true, z);
        if (J4 != null && J4.exists()) {
            mdcVar.d = Uri.fromFile(J4);
        }
        return mdcVar;
    }

    public final boolean b() {
        Uri uri = this.d;
        return uri != null && "file".equalsIgnoreCase(uri.getScheme());
    }

    public final boolean c() {
        Uri uri = this.f;
        return uri != null && "file".equalsIgnoreCase(uri.getScheme());
    }

    public final void e(boolean z) {
        if (!b() && this.g != null) {
            bc4.G(this.a);
            File J = bc4.J(this.g, null, false, z);
            if (J == null || !J.exists()) {
                bc4.G(this.a);
                File J2 = bc4.J(this.g, null, true, z);
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
        bc4.G(this.a);
        File J3 = bc4.J(this.h, null, false, z);
        if (J3 != null && J3.exists()) {
            this.f = Uri.fromFile(J3);
            return;
        }
        bc4.G(this.a);
        File J4 = bc4.J(this.h, null, true, z);
        if (J4 == null || !J4.exists()) {
            return;
        }
        this.f = Uri.fromFile(J4);
    }
}
