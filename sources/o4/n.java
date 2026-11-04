package o4;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class n {
    public static final /* synthetic */ int a = 0;

    static {
        g9.t0.s("android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.DURATION", "android.media.metadata.ALBUM", "android.media.metadata.AUTHOR", "android.media.metadata.WRITER", "android.media.metadata.COMPOSER", "android.media.metadata.COMPILATION", "android.media.metadata.DATE", "android.media.metadata.YEAR", "android.media.metadata.GENRE", "android.media.metadata.TRACK_NUMBER", "android.media.metadata.NUM_TRACKS", "android.media.metadata.DISC_NUMBER", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.ART", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART", "android.media.metadata.ALBUM_ART_URI", "android.media.metadata.USER_RATING", "android.media.metadata.RATING", "android.media.metadata.DISPLAY_TITLE", "android.media.metadata.DISPLAY_SUBTITLE", "android.media.metadata.DISPLAY_DESCRIPTION", "android.media.metadata.DISPLAY_ICON", "android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.MEDIA_ID", "android.media.metadata.MEDIA_URI", "android.media.metadata.BT_FOLDER_TYPE", "android.media.metadata.ADVERTISEMENT", "android.media.metadata.DOWNLOAD_STATUS", "androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT");
    }

    public static long a(int i3) {
        switch (i3) {
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
                throw new IllegalArgumentException(k2.p1.i(i3, "Unrecognized FolderType: "));
        }
    }

    public static p4.i b(d2.q0 q0Var, String str, Uri uri, long j10, Bitmap bitmap) {
        Long l10;
        p4.u uVar = new p4.u();
        uVar.a = new Bundle();
        uVar.f("android.media.metadata.MEDIA_ID", str);
        CharSequence charSequence = q0Var.a;
        Bundle bundle = q0Var.J;
        Integer num = q0Var.q;
        Uri uri2 = q0Var.n;
        if (charSequence != null) {
            uVar.g(charSequence, "android.media.metadata.TITLE");
        }
        CharSequence charSequence2 = q0Var.e;
        if (charSequence2 != null) {
            uVar.g(charSequence2, "android.media.metadata.DISPLAY_TITLE");
        }
        CharSequence charSequence3 = q0Var.f;
        if (charSequence3 != null) {
            uVar.g(charSequence3, "android.media.metadata.DISPLAY_SUBTITLE");
        }
        CharSequence charSequence4 = q0Var.g;
        if (charSequence4 != null) {
            uVar.g(charSequence4, "android.media.metadata.DISPLAY_DESCRIPTION");
        }
        CharSequence charSequence5 = q0Var.b;
        if (charSequence5 != null) {
            uVar.g(charSequence5, "android.media.metadata.ARTIST");
        }
        CharSequence charSequence6 = q0Var.c;
        if (charSequence6 != null) {
            uVar.g(charSequence6, "android.media.metadata.ALBUM");
        }
        CharSequence charSequence7 = q0Var.d;
        if (charSequence7 != null) {
            uVar.g(charSequence7, "android.media.metadata.ALBUM_ARTIST");
        }
        if (q0Var.u != null) {
            uVar.d(r7.intValue(), "android.media.metadata.YEAR");
        }
        CharSequence charSequence8 = q0Var.A;
        if (charSequence8 != null) {
            uVar.g(charSequence8, "android.media.metadata.WRITER");
        }
        CharSequence charSequence9 = q0Var.B;
        if (charSequence9 != null) {
            uVar.g(charSequence9, "android.media.metadata.COMPOSER");
        }
        if (uri != null) {
            uVar.f("android.media.metadata.MEDIA_URI", uri.toString());
        }
        if (uri2 != null) {
            uVar.f("android.media.metadata.DISPLAY_ICON_URI", uri2.toString());
            uVar.f("android.media.metadata.ALBUM_ART_URI", uri2.toString());
            uVar.f("android.media.metadata.ART_URI", uri2.toString());
        }
        if (bitmap != null) {
            uVar.c("android.media.metadata.DISPLAY_ICON", bitmap);
            uVar.c("android.media.metadata.ALBUM_ART", bitmap);
        }
        if (num != null && num.intValue() != -1) {
            uVar.d(a(num.intValue()), "android.media.metadata.BT_FOLDER_TYPE");
        }
        if (j10 == -9223372036854775807L && (l10 = q0Var.h) != null) {
            j10 = l10.longValue();
        }
        if (j10 == -9223372036854775807L) {
            j10 = -1;
        }
        uVar.d(j10, "android.media.metadata.DURATION");
        p4.x d = d(q0Var.i);
        if (d != null) {
            uVar.e("android.media.metadata.USER_RATING", d);
        }
        p4.x d10 = d(q0Var.j);
        if (d10 != null) {
            uVar.e("android.media.metadata.RATING", d10);
        }
        if (q0Var.I != null) {
            uVar.d(r6.intValue(), "androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT");
        }
        if (bundle != null) {
            for (String str2 : bundle.keySet()) {
                Object obj = bundle.get(str2);
                if (obj == null || (obj instanceof CharSequence)) {
                    uVar.g((CharSequence) obj, str2);
                } else if ((obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long)) {
                    uVar.d(((Number) obj).longValue(), str2);
                }
            }
        }
        return new p4.i((Bundle) uVar.a);
    }

    public static d2.f1 c(p4.x xVar) {
        if (xVar == null) {
            return null;
        }
        float f10 = xVar.b;
        int i3 = xVar.a;
        switch (i3) {
            case 1:
                if (xVar.b()) {
                    return new d2.x(i3 == 1 && f10 == 1.0f);
                }
                return new d2.x();
            case 2:
                if (xVar.b()) {
                    return new d2.i1(i3 == 2 && f10 == 1.0f);
                }
                return new d2.i1();
            case 3:
                return xVar.b() ? new d2.g1(3, xVar.a()) : new d2.g1(3);
            case 4:
                return xVar.b() ? new d2.g1(4, xVar.a()) : new d2.g1(4);
            case 5:
                return xVar.b() ? new d2.g1(5, xVar.a()) : new d2.g1(5);
            case 6:
                if (!xVar.b()) {
                    return new d2.w0();
                }
                if (i3 != 6 || !xVar.b()) {
                    f10 = -1.0f;
                }
                return new d2.w0(f10);
            default:
                return null;
        }
    }

    public static p4.x d(d2.f1 f1Var) {
        if (f1Var != null) {
            int e10 = e(f1Var);
            if (!f1Var.b()) {
                switch (e10) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        return new p4.x(e10, -1.0f);
                    default:
                        return null;
                }
            }
            switch (e10) {
                case 1:
                    return new p4.x(1, ((d2.x) f1Var).c ? 1.0f : 0.0f);
                case 2:
                    return new p4.x(2, ((d2.i1) f1Var).c ? 1.0f : 0.0f);
                case 3:
                case 4:
                case 5:
                    return p4.x.d(((d2.g1) f1Var).c, e10);
                case 6:
                    return p4.x.c(((d2.w0) f1Var).b);
            }
        }
        return null;
    }

    public static int e(d2.f1 f1Var) {
        if (f1Var instanceof d2.x) {
            return 1;
        }
        if (f1Var instanceof d2.i1) {
            return 2;
        }
        if (!(f1Var instanceof d2.g1)) {
            return f1Var instanceof d2.w0 ? 6 : 0;
        }
        int i3 = ((d2.g1) f1Var).b;
        int i10 = 3;
        if (i3 != 3) {
            i10 = 4;
            if (i3 != 4) {
                i10 = 5;
                if (i3 != 5) {
                    return 0;
                }
            }
        }
        return i10;
    }
}
