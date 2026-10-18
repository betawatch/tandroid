package m4;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public abstract class n {
    public static final /* synthetic */ int a = 0;

    static {
        e9.y0.w("android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.DURATION", "android.media.metadata.ALBUM", "android.media.metadata.AUTHOR", "android.media.metadata.WRITER", "android.media.metadata.COMPOSER", "android.media.metadata.COMPILATION", "android.media.metadata.DATE", "android.media.metadata.YEAR", "android.media.metadata.GENRE", "android.media.metadata.TRACK_NUMBER", "android.media.metadata.NUM_TRACKS", "android.media.metadata.DISC_NUMBER", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.ART", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART", "android.media.metadata.ALBUM_ART_URI", "android.media.metadata.USER_RATING", "android.media.metadata.RATING", "android.media.metadata.DISPLAY_TITLE", "android.media.metadata.DISPLAY_SUBTITLE", "android.media.metadata.DISPLAY_DESCRIPTION", "android.media.metadata.DISPLAY_ICON", "android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.MEDIA_ID", "android.media.metadata.MEDIA_URI", "android.media.metadata.BT_FOLDER_TYPE", "android.media.metadata.ADVERTISEMENT", "android.media.metadata.DOWNLOAD_STATUS", "androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT");
    }

    public static long a(int i10) {
        switch (i10) {
            case 0:
                return 0L;
            case 1:
                return 1L;
            case 2:
                return 2L;
            case 3:
                return 3L;
            case 4:
                return 4L;
            case 5:
                return 5L;
            case 6:
                return 6L;
            default:
                throw new IllegalArgumentException(i2.d.j(i10, "Unrecognized FolderType: "));
        }
    }

    public static n4.i b(b2.r0 r0Var, String str, Uri uri, long j10, Bitmap bitmap) {
        Long l4;
        n4.w wVar = new n4.w();
        wVar.a = new Bundle();
        wVar.f("android.media.metadata.MEDIA_ID", str);
        CharSequence charSequence = r0Var.a;
        Bundle bundle = r0Var.J;
        Integer num = r0Var.q;
        Uri uri2 = r0Var.n;
        if (charSequence != null) {
            wVar.g(charSequence, "android.media.metadata.TITLE");
        }
        CharSequence charSequence2 = r0Var.e;
        if (charSequence2 != null) {
            wVar.g(charSequence2, "android.media.metadata.DISPLAY_TITLE");
        }
        CharSequence charSequence3 = r0Var.f;
        if (charSequence3 != null) {
            wVar.g(charSequence3, "android.media.metadata.DISPLAY_SUBTITLE");
        }
        CharSequence charSequence4 = r0Var.g;
        if (charSequence4 != null) {
            wVar.g(charSequence4, "android.media.metadata.DISPLAY_DESCRIPTION");
        }
        CharSequence charSequence5 = r0Var.b;
        if (charSequence5 != null) {
            wVar.g(charSequence5, "android.media.metadata.ARTIST");
        }
        CharSequence charSequence6 = r0Var.c;
        if (charSequence6 != null) {
            wVar.g(charSequence6, "android.media.metadata.ALBUM");
        }
        CharSequence charSequence7 = r0Var.d;
        if (charSequence7 != null) {
            wVar.g(charSequence7, "android.media.metadata.ALBUM_ARTIST");
        }
        if (r0Var.u != null) {
            wVar.d(r7.intValue(), "android.media.metadata.YEAR");
        }
        CharSequence charSequence8 = r0Var.A;
        if (charSequence8 != null) {
            wVar.g(charSequence8, "android.media.metadata.WRITER");
        }
        CharSequence charSequence9 = r0Var.B;
        if (charSequence9 != null) {
            wVar.g(charSequence9, "android.media.metadata.COMPOSER");
        }
        if (uri != null) {
            wVar.f("android.media.metadata.MEDIA_URI", uri.toString());
        }
        if (uri2 != null) {
            wVar.f("android.media.metadata.DISPLAY_ICON_URI", uri2.toString());
            wVar.f("android.media.metadata.ALBUM_ART_URI", uri2.toString());
            wVar.f("android.media.metadata.ART_URI", uri2.toString());
        }
        if (bitmap != null) {
            wVar.c("android.media.metadata.DISPLAY_ICON", bitmap);
            wVar.c("android.media.metadata.ALBUM_ART", bitmap);
        }
        if (num != null && num.intValue() != -1) {
            wVar.d(a(num.intValue()), "android.media.metadata.BT_FOLDER_TYPE");
        }
        if (j10 == -9223372036854775807L && (l4 = r0Var.h) != null) {
            j10 = l4.longValue();
        }
        if (j10 == -9223372036854775807L) {
            j10 = -1;
        }
        wVar.d(j10, "android.media.metadata.DURATION");
        n4.z d = d(r0Var.i);
        if (d != null) {
            wVar.e("android.media.metadata.USER_RATING", d);
        }
        n4.z d10 = d(r0Var.j);
        if (d10 != null) {
            wVar.e("android.media.metadata.RATING", d10);
        }
        if (r0Var.I != null) {
            wVar.d(r6.intValue(), "androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT");
        }
        if (bundle != null) {
            for (String str2 : bundle.keySet()) {
                Object obj = bundle.get(str2);
                if (obj == null || (obj instanceof CharSequence)) {
                    wVar.g((CharSequence) obj, str2);
                } else if ((obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long)) {
                    wVar.d(((Number) obj).longValue(), str2);
                }
            }
        }
        return new n4.i((Bundle) wVar.a);
    }

    public static b2.g1 c(n4.z zVar) {
        if (zVar == null) {
            return null;
        }
        float f7 = zVar.b;
        int i10 = zVar.a;
        switch (i10) {
            case 1:
                if (zVar.b()) {
                    return new b2.y(i10 == 1 && f7 == 1.0f);
                }
                return new b2.y();
            case 2:
                if (zVar.b()) {
                    return new b2.j1(i10 == 2 && f7 == 1.0f);
                }
                return new b2.j1();
            case 3:
                return zVar.b() ? new b2.h1(3, zVar.a()) : new b2.h1(3);
            case 4:
                return zVar.b() ? new b2.h1(4, zVar.a()) : new b2.h1(4);
            case 5:
                return zVar.b() ? new b2.h1(5, zVar.a()) : new b2.h1(5);
            case 6:
                if (!zVar.b()) {
                    return new b2.x0();
                }
                if (i10 != 6 || !zVar.b()) {
                    f7 = -1.0f;
                }
                return new b2.x0(f7);
            default:
                return null;
        }
    }

    public static n4.z d(b2.g1 g1Var) {
        if (g1Var != null) {
            int e = e(g1Var);
            if (!g1Var.b()) {
                switch (e) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        return new n4.z(e, -1.0f);
                    default:
                        return null;
                }
            }
            switch (e) {
                case 1:
                    return new n4.z(1, ((b2.y) g1Var).c ? 1.0f : 0.0f);
                case 2:
                    return new n4.z(2, ((b2.j1) g1Var).c ? 1.0f : 0.0f);
                case 3:
                case 4:
                case 5:
                    return n4.z.d(((b2.h1) g1Var).c, e);
                case 6:
                    return n4.z.c(((b2.x0) g1Var).b);
            }
        }
        return null;
    }

    public static int e(b2.g1 g1Var) {
        if (g1Var instanceof b2.y) {
            return 1;
        }
        if (g1Var instanceof b2.j1) {
            return 2;
        }
        if (!(g1Var instanceof b2.h1)) {
            return g1Var instanceof b2.x0 ? 6 : 0;
        }
        int i10 = ((b2.h1) g1Var).b;
        int i11 = 3;
        if (i10 != 3) {
            i11 = 4;
            if (i10 != 4) {
                i11 = 5;
                if (i10 != 5) {
                    return 0;
                }
            }
        }
        return i11;
    }
}
