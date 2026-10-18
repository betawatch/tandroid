package h9;

import a6.m;
import d9.b;
import d9.e;
import d9.h;
import d9.i;
import d9.l;
import e9.d0;
import e9.h0;
import e9.k0;
import e9.l0;
import e9.m1;
import e9.n0;
import e9.o0;
import e9.q1;
import e9.s;
import e9.u;
import e9.x;
import e9.x1;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.webrtc.MediaStreamTrack;
import v7.s6;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class a {
    public static final o0 f;
    public static final d9.a g;
    public static final HashMap h;
    public static final a i;
    public static final m j;
    public final String a;
    public final String b;
    public final o0 c;
    public String d;
    public int e;

    static {
        o0 o0Var;
        String c10 = s6.c(StandardCharsets.UTF_8.name());
        s.e("charset", c10);
        x a2 = x.a();
        h0 h0Var = (h0) a2.get("charset");
        if (h0Var == null) {
            l0 l0Var = n0.b;
            s.f(4, "expectedSize");
            h0Var = new k0(4);
            a2.put("charset", h0Var);
        }
        h0Var.a(c10);
        Collection entrySet = a2.entrySet();
        if (((AbstractCollection) entrySet).isEmpty()) {
            o0Var = d0.h;
        } else {
            u uVar = (u) entrySet;
            a5.a aVar = new a5.a(uVar.b.size(), 5);
            Iterator it = uVar.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Object key = entry.getKey();
                x1 f7 = ((k0) entry.getValue()).f();
                aVar.x(key, f7);
                i10 += f7.d;
            }
            o0Var = new o0(aVar.d(true), i10);
        }
        f = o0Var;
        b bVar = b.d;
        b bVar2 = b.e;
        bVar2.getClass();
        h hVar = new h(bVar2);
        bVar.getClass();
        g = new d9.a(new d9.a(new d9.a(bVar, hVar), new e(' ', 1)), i.b("()<>@,;:\\\"/[]?=").d());
        i.b("\"\\\r").d().getClass();
        i.b(" \t\r\n");
        h = new HashMap();
        a("*", "*");
        a("text", "*");
        a("image", "*");
        a(MediaStreamTrack.AUDIO_TRACK_KIND, "*");
        a(MediaStreamTrack.VIDEO_TRACK_KIND, "*");
        a("application", "*");
        a("font", "*");
        b("text", "cache-manifest");
        b("text", "css");
        b("text", "csv");
        b("text", "html");
        b("text", "calendar");
        b("text", "markdown");
        b("text", "plain");
        b("text", "javascript");
        b("text", "tab-separated-values");
        b("text", "vcard");
        b("text", "vnd.wap.wml");
        b("text", "xml");
        b("text", "vtt");
        a("image", "bmp");
        a("image", "x-canon-crw");
        a("image", "gif");
        a("image", "vnd.microsoft.icon");
        a("image", "jpeg");
        a("image", "png");
        a("image", "vnd.adobe.photoshop");
        b("image", "svg+xml");
        a("image", "tiff");
        a("image", "webp");
        a("image", "heif");
        a("image", "jp2");
        a(MediaStreamTrack.AUDIO_TRACK_KIND, "mp4");
        a(MediaStreamTrack.AUDIO_TRACK_KIND, "mpeg");
        a(MediaStreamTrack.AUDIO_TRACK_KIND, "ogg");
        a(MediaStreamTrack.AUDIO_TRACK_KIND, "webm");
        a(MediaStreamTrack.AUDIO_TRACK_KIND, "l16");
        a(MediaStreamTrack.AUDIO_TRACK_KIND, "l24");
        a(MediaStreamTrack.AUDIO_TRACK_KIND, "basic");
        a(MediaStreamTrack.AUDIO_TRACK_KIND, "aac");
        a(MediaStreamTrack.AUDIO_TRACK_KIND, "vorbis");
        a(MediaStreamTrack.AUDIO_TRACK_KIND, "x-ms-wma");
        a(MediaStreamTrack.AUDIO_TRACK_KIND, "x-ms-wax");
        a(MediaStreamTrack.AUDIO_TRACK_KIND, "vnd.rn-realaudio");
        a(MediaStreamTrack.AUDIO_TRACK_KIND, "vnd.wave");
        a(MediaStreamTrack.VIDEO_TRACK_KIND, "mp4");
        a(MediaStreamTrack.VIDEO_TRACK_KIND, "mpeg");
        a(MediaStreamTrack.VIDEO_TRACK_KIND, "ogg");
        a(MediaStreamTrack.VIDEO_TRACK_KIND, "quicktime");
        a(MediaStreamTrack.VIDEO_TRACK_KIND, "webm");
        a(MediaStreamTrack.VIDEO_TRACK_KIND, "x-ms-wmv");
        a(MediaStreamTrack.VIDEO_TRACK_KIND, "x-flv");
        a(MediaStreamTrack.VIDEO_TRACK_KIND, "3gpp");
        a(MediaStreamTrack.VIDEO_TRACK_KIND, "3gpp2");
        b("application", "xml");
        b("application", "atom+xml");
        a("application", "x-bzip2");
        b("application", "dart");
        a("application", "vnd.apple.pkpass");
        a("application", "vnd.ms-fontobject");
        a("application", "epub+zip");
        a("application", "x-www-form-urlencoded");
        a("application", "pkcs12");
        a("application", "binary");
        a("application", "geo+json");
        a("application", "x-gzip");
        a("application", "hal+json");
        b("application", "javascript");
        a("application", "jose");
        a("application", "jose+json");
        i = b("application", "json");
        a("application", "jwt");
        b("application", "manifest+json");
        a("application", "vnd.google-earth.kml+xml");
        a("application", "vnd.google-earth.kmz");
        a("application", "mbox");
        a("application", "x-apple-aspen-config");
        a("application", "vnd.ms-excel");
        a("application", "vnd.ms-outlook");
        a("application", "vnd.ms-powerpoint");
        a("application", "msword");
        a("application", "dash+xml");
        a("application", "wasm");
        a("application", "x-nacl");
        a("application", "x-pnacl");
        a("application", "octet-stream");
        a("application", "ogg");
        a("application", "vnd.openxmlformats-officedocument.wordprocessingml.document");
        a("application", "vnd.openxmlformats-officedocument.presentationml.presentation");
        a("application", "vnd.openxmlformats-officedocument.spreadsheetml.sheet");
        a("application", "vnd.oasis.opendocument.graphics");
        a("application", "vnd.oasis.opendocument.presentation");
        a("application", "vnd.oasis.opendocument.spreadsheet");
        a("application", "vnd.oasis.opendocument.text");
        b("application", "opensearchdescription+xml");
        a("application", "pdf");
        a("application", "postscript");
        a("application", "protobuf");
        b("application", "rdf+xml");
        b("application", "rtf");
        a("application", "font-sfnt");
        a("application", "x-shockwave-flash");
        a("application", "vnd.sketchup.skp");
        b("application", "soap+xml");
        a("application", "x-tar");
        a("application", "font-woff");
        a("application", "font-woff2");
        b("application", "xhtml+xml");
        b("application", "xrd+xml");
        a("application", "zip");
        a("font", "collection");
        a("font", "otf");
        a("font", "sfnt");
        a("font", "ttf");
        a("font", "woff");
        a("font", "woff2");
        j = new m(new l("; "), 17);
    }

    public a(String str, String str2, o0 o0Var) {
        this.a = str;
        this.b = str2;
        this.c = o0Var;
    }

    public static void a(String str, String str2) {
        a aVar = new a(str, str2, d0.h);
        h.put(aVar, aVar);
    }

    public static a b(String str, String str2) {
        a aVar = new a(str, str2, f);
        h.put(aVar, aVar);
        StandardCharsets.UTF_8.getClass();
        return aVar;
    }

    public final m1 c() {
        return new m1(this.c.b(), new ag.b(new fh.b(15), 13));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a.equals(aVar.a) && this.b.equals(aVar.b) && c().equals(aVar.c());
    }

    public final int hashCode() {
        int i10 = this.e;
        if (i10 != 0) {
            return i10;
        }
        int hashCode = Arrays.hashCode(new Object[]{this.a, this.b, c()});
        this.e = hashCode;
        return hashCode;
    }

    public final String toString() {
        String str = this.d;
        if (str != null) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.a);
        sb2.append('/');
        sb2.append(this.b);
        o0 o0Var = this.c;
        if (o0Var.f != 0) {
            sb2.append("; ");
            Collection a2 = new q1(o0Var, new ag.b(new fh.b(14), 13)).a();
            m mVar = j;
            mVar.getClass();
            try {
                mVar.b(sb2, a2.iterator());
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }
        String sb3 = sb2.toString();
        this.d = sb3;
        return sb3;
    }
}
