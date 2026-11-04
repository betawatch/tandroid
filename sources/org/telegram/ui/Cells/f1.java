package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import b8.zb;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.bd;
import org.telegram.messenger.hs;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.gt0;
import org.telegram.ui.Components.iz;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class f1 {
    public static float A(float f10, float f11, float f12, float f13) {
        return f13 - ((f10 * f11) * f12);
    }

    public static int B(int i3, int i10, Drawable drawable) {
        return i10 - (drawable.getIntrinsicHeight() / i3);
    }

    public static int C(int i3, int i10, Drawable drawable) {
        return i10 - (drawable.getIntrinsicWidth() / i3);
    }

    public static /* synthetic */ String D(int i3) {
        if (i3 == 1) {
            return "PAID";
        }
        if (i3 == 2) {
            return "CANCELLED";
        }
        if (i3 == 3) {
            return "PENDING";
        }
        if (i3 == 4) {
            return "FAILED";
        }
        throw null;
    }

    public static void E(p2.g gVar, p2.g gVar2) {
        if (gVar == gVar2) {
            return;
        }
        if (gVar2 != null) {
            gVar2.e(null);
        }
        if (gVar != null) {
            gVar.b(null);
        }
    }

    public static /* synthetic */ String F(int i3) {
        return i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? "null" : "FROSTED_FILTERED" : "FROSTED_GLASS" : "GLASS" : "BLURRED";
    }

    public static boolean a(zi ziVar) {
        return ziVar != null && zi.B0(ziVar.k) == 1271266957;
    }

    public static void b(RecyclerView recyclerView) {
        recyclerView.C0();
        u4.o0 layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof u4.b0) {
            ((u4.b0) layoutManager).h1(0, 0);
        } else {
            recyclerView.v0(0);
        }
    }

    public static float c(RecyclerView recyclerView) {
        int i3 = gt0.m0;
        u4.o0 layoutManager = recyclerView.getLayoutManager();
        if (layoutManager == null || !recyclerView.canScrollVertically(-1)) {
            return 0.0f;
        }
        if (layoutManager.m(0) == null) {
            return Float.POSITIVE_INFINITY;
        }
        return Math.max(0.0f, (recyclerView.getPaddingTop() - u4.o0.z(r0)) + ((ViewGroup.MarginLayoutParams) ((u4.p0) r0.getLayoutParams())).topMargin);
    }

    public static boolean d(int i3) {
        if (i3 != 0) {
            return i3 == 3 || i3 == 4;
        }
        throw null;
    }

    public static int e(int i3) {
        int[] d = o1.g.d(hs.K1);
        if (i3 < 0 || i3 >= d.length) {
            return 0;
        }
        return d[i3];
    }

    public static /* synthetic */ String f(int i3) {
        switch (i3) {
            case 1:
                return "Blues";
            case 2:
                return "Classic Rock";
            case 3:
                return "Country";
            case 4:
                return "Dance";
            case 5:
                return "Disco";
            case 6:
                return "Funk";
            case 7:
                return "Grunge";
            case 8:
                return "Hip-Hop";
            case 9:
                return "Jazz";
            case 10:
                return "Metal";
            case 11:
                return "New Age";
            case 12:
                return "Oldies";
            case 13:
                return "Other";
            case 14:
                return "Pop";
            case 15:
                return "R&B";
            case 16:
                return "Rap";
            case 17:
                return "Reggae";
            case 18:
                return "Rock";
            case 19:
                return "Techno";
            case 20:
                return "Industrial";
            case 21:
                return "Alternative";
            case 22:
                return "Ska";
            case 23:
                return "Death Metal";
            case 24:
                return "Pranks";
            case 25:
                return "Soundtrack";
            case 26:
                return "Euro-Techno";
            case 27:
                return "Ambient";
            case 28:
                return "Trip-Hop";
            case 29:
                return "Vocal";
            case hs.T /* 30 */:
                return "Jazz+Funk";
            case hs.U /* 31 */:
                return "Fusion";
            case 32:
                return "Trance";
            case 33:
                return "Classical";
            case 34:
                return "Instrumental";
            case 35:
                return "Acid";
            case 36:
                return "House";
            case 37:
                return "Game";
            case 38:
                return "Sound Clip";
            case 39:
                return "Gospel";
            case 40:
                return "Noise";
            case 41:
                return "AlternRock";
            case 42:
                return "Bass";
            case 43:
                return "Soul";
            case 44:
                return "Punk";
            case 45:
                return "Space";
            case 46:
                return "Meditative";
            case 47:
                return "Instrumental Pop";
            case 48:
                return "Instrumental Rock";
            case 49:
                return "Ethnic";
            case 50:
                return "Gothic";
            case hs.o0 /* 51 */:
                return "Darkwave";
            case hs.p0 /* 52 */:
                return "Techno-Industrial";
            case hs.q0 /* 53 */:
                return "Electronic";
            case hs.r0 /* 54 */:
                return "Pop-Folk";
            case hs.s0 /* 55 */:
                return "Eurodance";
            case hs.t0 /* 56 */:
                return "Dream";
            case hs.u0 /* 57 */:
                return "Southern Rock";
            case hs.v0 /* 58 */:
                return "Comedy";
            case hs.w0 /* 59 */:
                return "Cult";
            case hs.x0 /* 60 */:
                return "Gangsta";
            case hs.y0 /* 61 */:
                return "Top 40";
            case hs.z0 /* 62 */:
                return "Christian Rap";
            case hs.A0 /* 63 */:
                return "Pop/Funk";
            case 64:
                return "Jungle";
            case 65:
                return "Native American";
            case hs.D0 /* 66 */:
                return "Cabaret";
            case hs.E0 /* 67 */:
                return "New Wave";
            case hs.F0 /* 68 */:
                return "Psychadelic";
            case hs.G0 /* 69 */:
                return "Rave";
            case hs.H0 /* 70 */:
                return "Showtunes";
            case hs.I0 /* 71 */:
                return "Trailer";
            case hs.J0 /* 72 */:
                return "Lo-Fi";
            case hs.K0 /* 73 */:
                return "Tribal";
            case hs.L0 /* 74 */:
                return "Acid Punk";
            case hs.M0 /* 75 */:
                return "Acid Jazz";
            case hs.N0 /* 76 */:
                return "Polka";
            case hs.O0 /* 77 */:
                return "Retro";
            case hs.P0 /* 78 */:
                return "Musical";
            case hs.Q0 /* 79 */:
                return "Rock & Roll";
            case 80:
                return "Hard Rock";
            case hs.S0 /* 81 */:
                return "Folk";
            case hs.T0 /* 82 */:
                return "Folk-Rock";
            case hs.U0 /* 83 */:
                return "National Folk";
            case hs.V0 /* 84 */:
                return "Swing";
            case hs.W0 /* 85 */:
                return "Fast Fusion";
            case hs.X0 /* 86 */:
                return "Bebop";
            case hs.Y0 /* 87 */:
                return "Latin";
            case hs.Z0 /* 88 */:
                return "Revival";
            case hs.a1 /* 89 */:
                return "Celtic";
            case hs.b1 /* 90 */:
                return "Bluegrass";
            case hs.c1 /* 91 */:
                return "Avantgarde";
            case hs.d1 /* 92 */:
                return "Gothic Rock";
            case hs.e1 /* 93 */:
                return "Progressive Rock";
            case hs.f1 /* 94 */:
                return "Psychedelic Rock";
            case hs.g1 /* 95 */:
                return "Symphonic Rock";
            case 96:
                return "Slow Rock";
            case hs.i1 /* 97 */:
                return "Big Band";
            case hs.j1 /* 98 */:
                return "Chorus";
            case hs.k1 /* 99 */:
                return "Easy Listening";
            case hs.l1 /* 100 */:
                return "Acoustic";
            case 101:
                return "Humour";
            case hs.n1 /* 102 */:
                return "Speech";
            case hs.o1 /* 103 */:
                return "Chanson";
            case hs.p1 /* 104 */:
                return "Opera";
            case hs.q1 /* 105 */:
                return "Chamber Music";
            case hs.r1 /* 106 */:
                return "Sonata";
            case hs.s1 /* 107 */:
                return "Symphony";
            case hs.t1 /* 108 */:
                return "Booty Bass";
            case hs.u1 /* 109 */:
                return "Primus";
            case hs.v1 /* 110 */:
                return "Porn Groove";
            case hs.w1 /* 111 */:
                return "Satire";
            case hs.x1 /* 112 */:
                return "Slow Jam";
            case hs.y1 /* 113 */:
                return "Club";
            case hs.z1 /* 114 */:
                return "Tango";
            case hs.A1 /* 115 */:
                return "Samba";
            case hs.B1 /* 116 */:
                return "Folklore";
            case hs.C1 /* 117 */:
                return "Ballad";
            case hs.D1 /* 118 */:
                return "Power Ballad";
            case hs.E1 /* 119 */:
                return "Rhythmic Soul";
            case 120:
                return "Freestyle";
            case hs.F1 /* 121 */:
                return "Duet";
            case hs.G1 /* 122 */:
                return "Punk Rock";
            case hs.H1 /* 123 */:
                return "Drum Solo";
            case hs.I1 /* 124 */:
                return "A capella";
            case hs.J1 /* 125 */:
                return "Euro-House";
            case hs.K1 /* 126 */:
                return "Dance Hall";
            default:
                throw null;
        }
    }

    public static float g(float f10, float f11, float f12) {
        return (org.telegram.messenger.g0.N(f10) * f11) + f12;
    }

    public static float h(float f10, float f11, float f12, float f13) {
        return Math.min(f13, (f10 / f11) + f12);
    }

    public static int i(int i3, int i10, Drawable drawable) {
        return (drawable.getIntrinsicHeight() / i3) + i10;
    }

    public static int j(iz izVar, int i3) {
        return izVar.c(izVar.getMeasuredWidth()) + i3;
    }

    public static Bundle k(int i3, String str) {
        Bundle bundle = new Bundle();
        bundle.putInt(str, i3);
        return bundle;
    }

    public static Bundle l(int i3, String str, String str2, boolean z10) {
        Bundle bundle = new Bundle();
        bundle.putBoolean(str, z10);
        bundle.putInt(str2, i3);
        return bundle;
    }

    public static TextView m(FrameLayout frameLayout, TextView textView, FrameLayout.LayoutParams layoutParams, Context context) {
        frameLayout.addView(textView, layoutParams);
        return new TextView(context);
    }

    public static Integer n(int i3, ArrayList arrayList, int i10, ArrayList arrayList2, int i11) {
        arrayList.add(bd.M0(i3, null));
        arrayList2.add(Integer.valueOf(i10));
        return Integer.valueOf(i11);
    }

    public static Object o(int i3, ArrayList arrayList) {
        return arrayList.remove(arrayList.size() - i3);
    }

    public static Object p(HashMap hashMap, Uri uri, Uri uri2) {
        zb.p(hashMap.containsKey(uri));
        return hashMap.get(uri2);
    }

    public static String q(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static String r(String str, String str2, String str3, StringBuilder sb2) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        return sb2.toString();
    }

    public static q1.h s(float f10, float f11, float f12) {
        q1.h hVar = new q1.h(f10);
        hVar.b(f11);
        hVar.a(f12);
        return hVar;
    }

    public static void t(int i3, String str, ArrayList arrayList) {
        arrayList.add(new o6(i3, str));
    }

    public static void u(int i3, ArrayList arrayList, ArrayList arrayList2, Integer num) {
        arrayList.add(bd.M0(i3, null));
        arrayList2.add(num);
    }

    public static void v(FrameLayout frameLayout, org.telegram.ui.ActionBar.e6 e6Var, TLRPC.TL_error tL_error, boolean z10) {
        new fc(frameLayout, e6Var).f0(tL_error, z10);
    }

    public static void w(d2.u uVar, e3.i0 i0Var) {
        i0Var.g(new d2.v(uVar));
    }

    public static void x(String str, int i3, ArrayList arrayList, int i10, ArrayList arrayList2) {
        arrayList.add(bd.M0(i3, str));
        arrayList2.add(Integer.valueOf(i10));
    }

    public static float y(float f10, float f11, float f12, float f13) {
        return Math.max(f13, f12 - (f10 / f11));
    }

    public static int z(int i3, int i10, Drawable drawable) {
        return (drawable.getIntrinsicWidth() / i3) + i10;
    }
}
