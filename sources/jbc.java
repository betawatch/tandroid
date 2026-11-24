// default package

import android.net.Uri;
import java.io.File;
import java.net.URLEncoder;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class jbc {
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
        StringBuilder m = de9.m(i, "?account=", "&id=");
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
        m.append(URLEncoder.encode(ba4.B(document), "UTF-8"));
        m.append("&reference=");
        byte[] bArr = document.file_reference;
        if (bArr == null) {
            bArr = new byte[0];
        }
        m.append(Utilities.f(bArr));
        return Uri.parse("tg://" + ba4.r(null, document) + m.toString());
    }

    public static jbc d(int i, TLRPC.Document document, TLRPC.Document document2, int i2, boolean z) {
        TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo;
        String str;
        jbc jbcVar = new jbc();
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
        jbcVar.a = i;
        jbcVar.g = document;
        jbcVar.c = document.id;
        jbcVar.d = a(i, i2, document);
        if (document2 != null) {
            jbcVar.h = document2;
            jbcVar.e = document2.id;
            jbcVar.f = a(i, i2, document2);
            ba4.G(i);
            File J = ba4.J(document2, null, false, z);
            if (J == null || !J.exists()) {
                ba4.G(i);
                File J2 = ba4.J(document2, null, true, z);
                if (J2 != null && J2.exists()) {
                    jbcVar.f = Uri.fromFile(J2);
                }
            } else {
                jbcVar.f = Uri.fromFile(J);
            }
        }
        jbcVar.m = lowerCase;
        long j = document.size;
        jbcVar.k = j;
        if (tL_documentAttributeVideo != null) {
            double d = tL_documentAttributeVideo.duration;
            jbcVar.i = tL_documentAttributeVideo.w;
            jbcVar.j = tL_documentAttributeVideo.h;
            jbcVar.l = j / d;
        }
        ba4.G(i);
        File J3 = ba4.J(document, null, false, z);
        if (J3 != null && J3.exists()) {
            jbcVar.d = Uri.fromFile(J3);
            return jbcVar;
        }
        ba4.G(i);
        File J4 = ba4.J(document, null, true, z);
        if (J4 != null && J4.exists()) {
            jbcVar.d = Uri.fromFile(J4);
        }
        return jbcVar;
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
            ba4.G(this.a);
            File J = ba4.J(this.g, null, false, z);
            if (J == null || !J.exists()) {
                ba4.G(this.a);
                File J2 = ba4.J(this.g, null, true, z);
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
        ba4.G(this.a);
        File J3 = ba4.J(this.h, null, false, z);
        if (J3 != null && J3.exists()) {
            this.f = Uri.fromFile(J3);
            return;
        }
        ba4.G(this.a);
        File J4 = ba4.J(this.h, null, true, z);
        if (J4 == null || !J4.exists()) {
            return;
        }
        this.f = Uri.fromFile(J4);
    }
}
