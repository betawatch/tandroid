package c3;

import android.media.MediaMetadataRetriever;
import com.google.android.gms.internal.cast.w4;
import com.google.android.gms.internal.vision.r0;
import com.google.android.recaptcha.internal.zzqv;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import org.telegram.messenger.at;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class i0 {
    public static int A(int i10, int i11, int i12) {
        return zzqv.zzA(i10) + i11 + i12;
    }

    public static float B(float f7, float f10, float f11, float f12) {
        return ((f7 - f10) / f11) + f12;
    }

    public static float C(float f7, float f10, float f11, float f12) {
        return ((f7 * f10) + f11) * f12;
    }

    public static float D(float f7, float f10, float f11, float f12) {
        return (f11 - (f7 * f10)) * f12;
    }

    public static float E(float f7, float f10, float f11, float f12) {
        return f7 * f10 * f11 * f12;
    }

    public static /* synthetic */ String F(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "null" : "FROSTED_FILTERED" : "FROSTED_GLASS" : "GLASS" : "BLURRED";
    }

    public static void a(k0 k0Var, e2.x xVar, int i10) {
        k0Var.g(xVar, i10, 0);
    }

    public static boolean b(int i10) {
        if (i10 != 0) {
            return i10 == 3 || i10 == 4;
        }
        throw null;
    }

    public static int c(int i10) {
        int[] d = m1.j.d(at.K1);
        if (i10 < 0 || i10 >= d.length) {
            return 0;
        }
        return d[i10];
    }

    public static int d(int i10) {
        if (i10 == 90) {
            return 81;
        }
        if (i10 == 91) {
            return 82;
        }
        if (i10 == 93) {
            return 84;
        }
        if (i10 == 94) {
            return 85;
        }
        switch (i10) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
                return 19;
            case 19:
                return 20;
            case 20:
                return 21;
            case 21:
                return 22;
            case 22:
                return 23;
            case 23:
                return 24;
            case 24:
                return 25;
            case 25:
                return 26;
            case 26:
                return 27;
            case 27:
                return 28;
            case 28:
                return 29;
            case 29:
                return 30;
            case at.T /* 30 */:
                return 31;
            case at.U /* 31 */:
                return 32;
            case 32:
                return 33;
            case 33:
                return 34;
            case 34:
                return 35;
            case 35:
                return 36;
            case 36:
                return 37;
            case 37:
                return 38;
            case 38:
                return 39;
            case 39:
                return 40;
            case 40:
                return 41;
            case 41:
                return 42;
            case 42:
                return 43;
            case 43:
                return 44;
            case 44:
                return 45;
            case 45:
                return 46;
            case 46:
                return 47;
            case 47:
                return 48;
            case 48:
                return 49;
            case 49:
                return 50;
            case 50:
                return 51;
            case at.o0 /* 51 */:
                return 52;
            case at.p0 /* 52 */:
                return 53;
            case at.q0 /* 53 */:
                return 54;
            case at.r0 /* 54 */:
                return 55;
            case at.s0 /* 55 */:
                return 56;
            case at.t0 /* 56 */:
                return 57;
            case at.u0 /* 57 */:
                return 58;
            case at.v0 /* 58 */:
                return 59;
            case at.w0 /* 59 */:
                return 60;
            case at.x0 /* 60 */:
                return 61;
            case at.y0 /* 61 */:
                return 62;
            case at.z0 /* 62 */:
                return 63;
            case at.A0 /* 63 */:
                return 64;
            case 64:
                return 65;
            case 65:
                return 66;
            case at.D0 /* 66 */:
                return 67;
            case at.E0 /* 67 */:
                return 68;
            case at.F0 /* 68 */:
                return 69;
            case at.G0 /* 69 */:
                return 70;
            case at.H0 /* 70 */:
                return 71;
            case at.I0 /* 71 */:
                return 72;
            case at.J0 /* 72 */:
                return 73;
            case at.K0 /* 73 */:
                return 74;
            case at.L0 /* 74 */:
                return 75;
            case at.M0 /* 75 */:
                return 76;
            case at.N0 /* 76 */:
                return 77;
            case at.O0 /* 77 */:
                return 78;
            case at.P0 /* 78 */:
                return 79;
            case at.Q0 /* 79 */:
                return 80;
            default:
                switch (i10) {
                    case 96:
                        return 87;
                    case at.i1 /* 97 */:
                        return 88;
                    case at.j1 /* 98 */:
                        return 89;
                    case at.k1 /* 99 */:
                        return 90;
                    case at.l1 /* 100 */:
                        return 91;
                    case 101:
                        return 92;
                    case at.n1 /* 102 */:
                        return 83;
                    case at.o1 /* 103 */:
                        return 86;
                    case at.p1 /* 104 */:
                        return 93;
                    case at.q1 /* 105 */:
                        return 94;
                    case at.r1 /* 106 */:
                        return 95;
                    case at.s1 /* 107 */:
                        return 96;
                    case at.t1 /* 108 */:
                        return 97;
                    case at.u1 /* 109 */:
                        return 98;
                    case at.v1 /* 110 */:
                        return 99;
                    case at.w1 /* 111 */:
                        return 100;
                    case at.x1 /* 112 */:
                        return 101;
                    case at.y1 /* 113 */:
                        return at.n1;
                    case at.z1 /* 114 */:
                        return at.o1;
                    case at.A1 /* 115 */:
                        return at.p1;
                    case at.B1 /* 116 */:
                        return at.q1;
                    case at.C1 /* 117 */:
                        return at.r1;
                    case at.D1 /* 118 */:
                        return at.s1;
                    case at.E1 /* 119 */:
                        return at.t1;
                    case 120:
                        return at.u1;
                    case at.F1 /* 121 */:
                        return at.v1;
                    case at.G1 /* 122 */:
                        return at.w1;
                    case at.H1 /* 123 */:
                        return at.x1;
                    case at.I1 /* 124 */:
                        return at.y1;
                    case at.J1 /* 125 */:
                        return at.z1;
                    case at.K1 /* 126 */:
                        return at.C1;
                    case at.L1 /* 127 */:
                        return at.E1;
                    case 128:
                        return 120;
                    case at.N1 /* 129 */:
                        return at.F1;
                    case at.O1 /* 130 */:
                        return at.G1;
                    case at.P1 /* 131 */:
                        return at.H1;
                    case at.Q1 /* 132 */:
                        return at.I1;
                    case 133:
                        return at.J1;
                    case 134:
                        return at.K1;
                    case at.R1 /* 135 */:
                        return at.L1;
                    case at.S1 /* 136 */:
                        return 128;
                    case at.T1 /* 137 */:
                        return at.N1;
                    case at.U1 /* 138 */:
                        return at.O1;
                    case at.V1 /* 139 */:
                        return at.P1;
                    case at.W1 /* 140 */:
                        return at.Q1;
                    case at.X1 /* 141 */:
                        return 133;
                    case at.Y1 /* 142 */:
                        return 134;
                    case at.Z1 /* 143 */:
                        return at.R1;
                    case at.a2 /* 144 */:
                        return at.S1;
                    case at.b2 /* 145 */:
                        return at.A1;
                    case at.c2 /* 146 */:
                        return at.B1;
                    case at.d2 /* 147 */:
                        return at.D1;
                    case at.e2 /* 148 */:
                        return at.T1;
                    case at.f2 /* 149 */:
                        return at.U1;
                    default:
                        return 0;
                }
        }
    }

    public static /* synthetic */ String e(int i10) {
        switch (i10) {
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
            case at.T /* 30 */:
                return "Jazz+Funk";
            case at.U /* 31 */:
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
            case at.o0 /* 51 */:
                return "Darkwave";
            case at.p0 /* 52 */:
                return "Techno-Industrial";
            case at.q0 /* 53 */:
                return "Electronic";
            case at.r0 /* 54 */:
                return "Pop-Folk";
            case at.s0 /* 55 */:
                return "Eurodance";
            case at.t0 /* 56 */:
                return "Dream";
            case at.u0 /* 57 */:
                return "Southern Rock";
            case at.v0 /* 58 */:
                return "Comedy";
            case at.w0 /* 59 */:
                return "Cult";
            case at.x0 /* 60 */:
                return "Gangsta";
            case at.y0 /* 61 */:
                return "Top 40";
            case at.z0 /* 62 */:
                return "Christian Rap";
            case at.A0 /* 63 */:
                return "Pop/Funk";
            case 64:
                return "Jungle";
            case 65:
                return "Native American";
            case at.D0 /* 66 */:
                return "Cabaret";
            case at.E0 /* 67 */:
                return "New Wave";
            case at.F0 /* 68 */:
                return "Psychadelic";
            case at.G0 /* 69 */:
                return "Rave";
            case at.H0 /* 70 */:
                return "Showtunes";
            case at.I0 /* 71 */:
                return "Trailer";
            case at.J0 /* 72 */:
                return "Lo-Fi";
            case at.K0 /* 73 */:
                return "Tribal";
            case at.L0 /* 74 */:
                return "Acid Punk";
            case at.M0 /* 75 */:
                return "Acid Jazz";
            case at.N0 /* 76 */:
                return "Polka";
            case at.O0 /* 77 */:
                return "Retro";
            case at.P0 /* 78 */:
                return "Musical";
            case at.Q0 /* 79 */:
                return "Rock & Roll";
            case 80:
                return "Hard Rock";
            case at.S0 /* 81 */:
                return "Folk";
            case at.T0 /* 82 */:
                return "Folk-Rock";
            case at.U0 /* 83 */:
                return "National Folk";
            case at.V0 /* 84 */:
                return "Swing";
            case at.W0 /* 85 */:
                return "Fast Fusion";
            case at.X0 /* 86 */:
                return "Bebop";
            case at.Y0 /* 87 */:
                return "Latin";
            case at.Z0 /* 88 */:
                return "Revival";
            case at.a1 /* 89 */:
                return "Celtic";
            case at.b1 /* 90 */:
                return "Bluegrass";
            case at.c1 /* 91 */:
                return "Avantgarde";
            case at.d1 /* 92 */:
                return "Gothic Rock";
            case at.e1 /* 93 */:
                return "Progressive Rock";
            case at.f1 /* 94 */:
                return "Psychedelic Rock";
            case at.g1 /* 95 */:
                return "Symphonic Rock";
            case 96:
                return "Slow Rock";
            case at.i1 /* 97 */:
                return "Big Band";
            case at.j1 /* 98 */:
                return "Chorus";
            case at.k1 /* 99 */:
                return "Easy Listening";
            case at.l1 /* 100 */:
                return "Acoustic";
            case 101:
                return "Humour";
            case at.n1 /* 102 */:
                return "Speech";
            case at.o1 /* 103 */:
                return "Chanson";
            case at.p1 /* 104 */:
                return "Opera";
            case at.q1 /* 105 */:
                return "Chamber Music";
            case at.r1 /* 106 */:
                return "Sonata";
            case at.s1 /* 107 */:
                return "Symphony";
            case at.t1 /* 108 */:
                return "Booty Bass";
            case at.u1 /* 109 */:
                return "Primus";
            case at.v1 /* 110 */:
                return "Porn Groove";
            case at.w1 /* 111 */:
                return "Satire";
            case at.x1 /* 112 */:
                return "Slow Jam";
            case at.y1 /* 113 */:
                return "Club";
            case at.z1 /* 114 */:
                return "Tango";
            case at.A1 /* 115 */:
                return "Samba";
            case at.B1 /* 116 */:
                return "Folklore";
            case at.C1 /* 117 */:
                return "Ballad";
            case at.D1 /* 118 */:
                return "Power Ballad";
            case at.E1 /* 119 */:
                return "Rhythmic Soul";
            case 120:
                return "Freestyle";
            case at.F1 /* 121 */:
                return "Duet";
            case at.G1 /* 122 */:
                return "Punk Rock";
            case at.H1 /* 123 */:
                return "Drum Solo";
            case at.I1 /* 124 */:
                return "A capella";
            case at.J1 /* 125 */:
                return "Euro-House";
            case at.K1 /* 126 */:
                return "Dance Hall";
            default:
                throw null;
        }
    }

    public static /* synthetic */ int f(int i10) {
        switch (i10) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            case 8:
                return 7;
            case 9:
                return 8;
            case 10:
                return 9;
            case 11:
                return 10;
            case 12:
                return 11;
            case 13:
                return 12;
            case 14:
                return 13;
            case 15:
                return 14;
            case 16:
                return 15;
            case 17:
                return 16;
            case 18:
                return 17;
            case 19:
                return 18;
            case 20:
                return 19;
            case 21:
                return 20;
            case 22:
                return 21;
            case 23:
                return 22;
            case 24:
                return 23;
            case 25:
                return 24;
            case 26:
                return 25;
            case 27:
                return 26;
            case 28:
                return 27;
            case 29:
                return 28;
            case at.T /* 30 */:
                return 29;
            case at.U /* 31 */:
                return 30;
            case 32:
                return 31;
            case 33:
                return 32;
            case 34:
                return 33;
            case 35:
                return 34;
            case 36:
                return 35;
            case 37:
                return 36;
            case 38:
                return 37;
            case 39:
                return 38;
            case 40:
                return 39;
            case 41:
                return 40;
            case 42:
                return 41;
            case 43:
                return 42;
            case 44:
                return 43;
            case 45:
                return 44;
            case 46:
                return 45;
            case 47:
                return 46;
            case 48:
                return 47;
            case 49:
                return 48;
            case 50:
                return 49;
            case at.o0 /* 51 */:
                return 50;
            case at.p0 /* 52 */:
                return 51;
            case at.q0 /* 53 */:
                return 52;
            case at.r0 /* 54 */:
                return 53;
            case at.s0 /* 55 */:
                return 54;
            case at.t0 /* 56 */:
                return 55;
            case at.u0 /* 57 */:
                return 56;
            case at.v0 /* 58 */:
                return 57;
            case at.w0 /* 59 */:
                return 58;
            case at.x0 /* 60 */:
                return 59;
            case at.y0 /* 61 */:
                return 60;
            case at.z0 /* 62 */:
                return 61;
            case at.A0 /* 63 */:
                return 62;
            case 64:
                return 63;
            case 65:
                return 64;
            case at.D0 /* 66 */:
                return 65;
            case at.E0 /* 67 */:
                return 66;
            case at.F0 /* 68 */:
                return 67;
            case at.G0 /* 69 */:
                return 68;
            case at.H0 /* 70 */:
                return 69;
            case at.I0 /* 71 */:
                return 70;
            case at.J0 /* 72 */:
                return 71;
            case at.K0 /* 73 */:
                return 72;
            case at.L0 /* 74 */:
                return 73;
            case at.M0 /* 75 */:
                return 74;
            case at.N0 /* 76 */:
                return 75;
            case at.O0 /* 77 */:
                return 76;
            case at.P0 /* 78 */:
                return 77;
            case at.Q0 /* 79 */:
                return 78;
            case 80:
                return 79;
            case at.S0 /* 81 */:
                return 90;
            case at.T0 /* 82 */:
                return 91;
            case at.U0 /* 83 */:
                return at.n1;
            case at.V0 /* 84 */:
                return 93;
            case at.W0 /* 85 */:
                return 94;
            case at.X0 /* 86 */:
                return at.o1;
            case at.Y0 /* 87 */:
                return 96;
            case at.Z0 /* 88 */:
                return 97;
            case at.a1 /* 89 */:
                return 98;
            case at.b1 /* 90 */:
                return 99;
            case at.c1 /* 91 */:
                return 100;
            case at.d1 /* 92 */:
                return 101;
            case at.e1 /* 93 */:
                return at.p1;
            case at.f1 /* 94 */:
                return at.q1;
            case at.g1 /* 95 */:
                return at.r1;
            case 96:
                return at.s1;
            case at.i1 /* 97 */:
                return at.t1;
            case at.j1 /* 98 */:
                return at.u1;
            case at.k1 /* 99 */:
                return at.v1;
            case at.l1 /* 100 */:
                return at.w1;
            case 101:
                return at.x1;
            case at.n1 /* 102 */:
                return at.y1;
            case at.o1 /* 103 */:
                return at.z1;
            case at.p1 /* 104 */:
                return at.A1;
            case at.q1 /* 105 */:
                return at.B1;
            case at.r1 /* 106 */:
                return at.C1;
            case at.s1 /* 107 */:
                return at.D1;
            case at.t1 /* 108 */:
                return at.E1;
            case at.u1 /* 109 */:
                return 120;
            case at.v1 /* 110 */:
                return at.F1;
            case at.w1 /* 111 */:
                return at.G1;
            case at.x1 /* 112 */:
                return at.H1;
            case at.y1 /* 113 */:
                return at.I1;
            case at.z1 /* 114 */:
                return at.J1;
            case at.A1 /* 115 */:
                return at.b2;
            case at.B1 /* 116 */:
                return at.c2;
            case at.C1 /* 117 */:
                return at.K1;
            case at.D1 /* 118 */:
                return at.d2;
            case at.E1 /* 119 */:
                return at.L1;
            case 120:
                return 128;
            case at.F1 /* 121 */:
                return at.N1;
            case at.G1 /* 122 */:
                return at.O1;
            case at.H1 /* 123 */:
                return at.P1;
            case at.I1 /* 124 */:
                return at.Q1;
            case at.J1 /* 125 */:
                return 133;
            case at.K1 /* 126 */:
                return 134;
            case at.L1 /* 127 */:
                return at.R1;
            case 128:
                return at.S1;
            case at.N1 /* 129 */:
                return at.T1;
            case at.O1 /* 130 */:
                return at.U1;
            case at.P1 /* 131 */:
                return at.V1;
            case at.Q1 /* 132 */:
                return at.W1;
            case 133:
                return at.X1;
            case 134:
                return at.Y1;
            case at.R1 /* 135 */:
                return at.Z1;
            case at.S1 /* 136 */:
                return at.a2;
            case at.T1 /* 137 */:
                return at.e2;
            case at.U1 /* 138 */:
                return at.f2;
            default:
                throw null;
        }
    }

    public static float g(float f7, float f10, float f11, float f12) {
        return (f11 - (f7 * f10)) / f12;
    }

    public static int h(int i10, int i11, int i12) {
        return w4.o(i10) + i11 + i12;
    }

    public static int i(int i10, int i11, int i12, int i13) {
        return r0.T(i10) + i11 + i12 + i13;
    }

    public static int j(int i10, int i11, int i12, ArrayList arrayList) {
        arrayList.add(Integer.valueOf(i10));
        return i11 + i12;
    }

    public static int k(int i10, int i11, long j10, ArrayList arrayList) {
        arrayList.add(Long.valueOf(j10));
        return i10 + i11;
    }

    public static ClassCastException l(Object obj) {
        obj.getClass();
        return new ClassCastException();
    }

    public static String m(int i10, int i11, String str) {
        return str.substring(i11, str.length() - i10);
    }

    public static String n(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static void o(int i10, HashMap hashMap, String str, int i11, String str2) {
        hashMap.put(str, Integer.valueOf(i10));
        hashMap.put(str2, Integer.valueOf(i11));
    }

    public static /* synthetic */ void p(MediaMetadataRetriever mediaMetadataRetriever) {
        if (mediaMetadataRetriever instanceof AutoCloseable) {
            mediaMetadataRetriever.close();
        } else if (mediaMetadataRetriever instanceof ExecutorService) {
            cf.b.b();
        } else {
            if (!t(mediaMetadataRetriever)) {
                throw new IllegalArgumentException();
            }
            mediaMetadataRetriever.release();
        }
    }

    public static void q(String str, String str2, String str3) {
        e2.a.l(str3, str + str2);
    }

    public static void r(StringBuilder sb2, String str, String str2, String str3, String str4) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
    }

    public static void s(ji.f fVar) {
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(fVar);
    }

    public static /* synthetic */ boolean t(Object obj) {
        return obj != null;
    }

    public static float u(float f7, float f10, float f11, float f12) {
        return (f7 * f10 * f11) + f12;
    }

    public static int v(int i10, int i11, int i12) {
        return r0.T(i10) + i11 + i12;
    }

    public static void w(int i10, HashMap hashMap, String str, int i11, String str2) {
        hashMap.put(Integer.valueOf(i10), str);
        hashMap.put(Integer.valueOf(i11), str2);
    }

    public static float x(float f7, float f10, float f11, float f12) {
        return ((f7 * f10) + f11) / f12;
    }

    public static int y(int i10, int i11, int i12) {
        return (r0.y(i10) * i11) + i12;
    }

    public static float z(float f7, float f10, float f11, float f12) {
        return ((f7 - f10) * f11) + f12;
    }
}
