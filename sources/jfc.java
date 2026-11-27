// default package

import android.net.Uri;
import java.io.File;
import java.net.URLEncoder;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class jfc {
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
        StringBuilder m = uh9.m(i, "?account=", "&id=");
        m.append(document.id);
        m.append("&hash=");
        m.append(document.access_hash);
        m.append("&dc=");
        m.append(document.dc_id);
        m.append("&size=");
        m.append(document.size);
        m.append("&mime=");
        m.append(URLEncoder.encode(document.mime_type, "UTF-8"));
        m.append("&rid=");
        m.append(i2);
        m.append("&name=");
        m.append(URLEncoder.encode(xb4.B(document), "UTF-8"));
        m.append("&reference=");
        byte[] bArr = document.file_reference;
        if (bArr == null) {
            bArr = new byte[0];
        }
        m.append(Utilities.f(bArr));
        return Uri.parse("tg://" + xb4.r(null, document) + m.toString());
    }

    public static jfc d(int i, TLRPC.Document document, TLRPC.Document document2, int i2, boolean z) {
        TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo;
        String str;
        jfc jfcVar = new jfc();
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
        jfcVar.a = i;
        jfcVar.g = document;
        jfcVar.c = document.id;
        jfcVar.d = a(i, i2, document);
        if (document2 != null) {
            jfcVar.h = document2;
            jfcVar.e = document2.id;
            jfcVar.f = a(i, i2, document2);
            xb4.G(i);
            File J = xb4.J(document2, null, false, z);
            if (J == null || !J.exists()) {
                xb4.G(i);
                File J2 = xb4.J(document2, null, true, z);
                if (J2 != null && J2.exists()) {
                    jfcVar.f = Uri.fromFile(J2);
                }
            } else {
                jfcVar.f = Uri.fromFile(J);
            }
        }
        jfcVar.m = lowerCase;
        long j = document.size;
        jfcVar.k = j;
        if (tL_documentAttributeVideo != null) {
            double d = tL_documentAttributeVideo.duration;
            jfcVar.i = tL_documentAttributeVideo.w;
            jfcVar.j = tL_documentAttributeVideo.h;
            jfcVar.l = j / d;
        }
        xb4.G(i);
        File J3 = xb4.J(document, null, false, z);
        if (J3 != null && J3.exists()) {
            jfcVar.d = Uri.fromFile(J3);
            return jfcVar;
        }
        xb4.G(i);
        File J4 = xb4.J(document, null, true, z);
        if (J4 != null && J4.exists()) {
            jfcVar.d = Uri.fromFile(J4);
        }
        return jfcVar;
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
            xb4.G(this.a);
            File J = xb4.J(this.g, null, false, z);
            if (J == null || !J.exists()) {
                xb4.G(this.a);
                File J2 = xb4.J(this.g, null, true, z);
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
        xb4.G(this.a);
        File J3 = xb4.J(this.h, null, false, z);
        if (J3 != null && J3.exists()) {
            this.f = Uri.fromFile(J3);
            return;
        }
        xb4.G(this.a);
        File J4 = xb4.J(this.h, null, true, z);
        if (J4 == null || !J4.exists()) {
            return;
        }
        this.f = Uri.fromFile(J4);
    }
}
