package k9;

import a8.ga;
import a8.wa;
import aa.n;
import g6.d0;
import g9.b;
import g9.e;
import g9.h;
import g9.i;
import g9.l;
import h9.c0;
import h9.f0;
import h9.g0;
import h9.i0;
import h9.i1;
import h9.j0;
import h9.m1;
import h9.o;
import h9.q;
import h9.s;
import h9.t1;
import h9.y;
import hi.x3;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class a {
    public static final j0 f;
    public static final g9.a g;
    public static final HashMap h;
    public static final a i;
    public static final n j;
    public final String a;
    public final String b;
    public final j0 c;
    public String d;
    public int e;

    static {
        j0 j0Var;
        String c10 = ga.c(StandardCharsets.UTF_8.name());
        o.f("charset", c10);
        s b10 = s.b();
        c0 c0Var = (c0) b10.get("charset");
        if (c0Var == null) {
            g0 g0Var = i0.b;
            o.g(4, "expectedSize");
            c0Var = new f0(4);
            b10.put("charset", c0Var);
        }
        c0Var.a(c10);
        Collection entrySet = b10.entrySet();
        if (((AbstractCollection) entrySet).isEmpty()) {
            j0Var = y.h;
        } else {
            q qVar = (q) entrySet;
            wa waVar = new wa(qVar.b.size(), 10);
            Iterator it = qVar.iterator();
            int i7 = 0;
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Object key = entry.getKey();
                t1 f10 = ((f0) entry.getValue()).f();
                waVar.v(key, f10);
                i7 += f10.d;
            }
            j0Var = new j0(waVar.d(true), i7);
        }
        f = j0Var;
        b bVar = b.d;
        b bVar2 = b.e;
        bVar2.getClass();
        h hVar = new h(bVar2);
        bVar.getClass();
        g = new g9.a(new g9.a(new g9.a(bVar, hVar), new e(' ', 1)), i.b("()<>@,;:\\\"/[]?=").d());
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
        j = new n(new l("; ", 0), 27);
    }

    public a(String str, String str2, j0 j0Var) {
        this.a = str;
        this.b = str2;
        this.c = j0Var;
    }

    public static void a(String str, String str2) {
        a aVar = new a(str, str2, y.h);
        h.put(aVar, aVar);
    }

    public static a b(String str, String str2) {
        a aVar = new a(str, str2, f);
        h.put(aVar, aVar);
        StandardCharsets.UTF_8.getClass();
        return aVar;
    }

    public final i1 c() {
        return new i1(this.c.b(), new d0(new x3(14), 4));
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
        int i7 = this.e;
        if (i7 != 0) {
            return i7;
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
        j0 j0Var = this.c;
        if (j0Var.f != 0) {
            sb2.append("; ");
            Collection a10 = new m1(j0Var, new d0(new x3(13), 4)).a();
            n nVar = j;
            nVar.getClass();
            try {
                nVar.c(sb2, a10.iterator());
            } catch (IOException e10) {
                throw new AssertionError(e10);
            }
        }
        String sb3 = sb2.toString();
        this.d = sb3;
        return sb3;
    }
}
