package c3;

import android.media.MediaMetadataRetriever;
import com.google.android.gms.internal.cast.w4;
import com.google.android.gms.internal.vision.r0;
import com.google.android.recaptcha.internal.zzqv;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import org.telegram.messenger.zs;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
        int[] d = m1.j.d(zs.K1);
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
            case zs.T /* 30 */:
                return 31;
            case zs.U /* 31 */:
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
            case zs.o0 /* 51 */:
                return 52;
            case zs.p0 /* 52 */:
                return 53;
            case zs.q0 /* 53 */:
                return 54;
            case zs.r0 /* 54 */:
                return 55;
            case zs.s0 /* 55 */:
                return 56;
            case zs.t0 /* 56 */:
                return 57;
            case zs.u0 /* 57 */:
                return 58;
            case zs.v0 /* 58 */:
                return 59;
            case zs.w0 /* 59 */:
                return 60;
            case zs.x0 /* 60 */:
                return 61;
            case zs.y0 /* 61 */:
                return 62;
            case zs.z0 /* 62 */:
                return 63;
            case zs.A0 /* 63 */:
                return 64;
            case 64:
                return 65;
            case 65:
                return 66;
            case zs.D0 /* 66 */:
                return 67;
            case zs.E0 /* 67 */:
                return 68;
            case zs.F0 /* 68 */:
                return 69;
            case zs.G0 /* 69 */:
                return 70;
            case zs.H0 /* 70 */:
                return 71;
            case zs.I0 /* 71 */:
                return 72;
            case zs.J0 /* 72 */:
                return 73;
            case zs.K0 /* 73 */:
                return 74;
            case zs.L0 /* 74 */:
                return 75;
            case zs.M0 /* 75 */:
                return 76;
            case zs.N0 /* 76 */:
                return 77;
            case zs.O0 /* 77 */:
                return 78;
            case zs.P0 /* 78 */:
                return 79;
            case zs.Q0 /* 79 */:
                return 80;
            default:
                switch (i10) {
                    case 96:
                        return 87;
                    case zs.i1 /* 97 */:
                        return 88;
                    case zs.j1 /* 98 */:
                        return 89;
                    case zs.k1 /* 99 */:
                        return 90;
                    case zs.l1 /* 100 */:
                        return 91;
                    case 101:
                        return 92;
                    case zs.n1 /* 102 */:
                        return 83;
                    case zs.o1 /* 103 */:
                        return 86;
                    case zs.p1 /* 104 */:
                        return 93;
                    case zs.q1 /* 105 */:
                        return 94;
                    case zs.r1 /* 106 */:
                        return 95;
                    case zs.s1 /* 107 */:
                        return 96;
                    case zs.t1 /* 108 */:
                        return 97;
                    case zs.u1 /* 109 */:
                        return 98;
                    case zs.v1 /* 110 */:
                        return 99;
                    case zs.w1 /* 111 */:
                        return 100;
                    case zs.x1 /* 112 */:
                        return 101;
                    case zs.y1 /* 113 */:
                        return zs.n1;
                    case zs.z1 /* 114 */:
                        return zs.o1;
                    case zs.A1 /* 115 */:
                        return zs.p1;
                    case zs.B1 /* 116 */:
                        return zs.q1;
                    case zs.C1 /* 117 */:
                        return zs.r1;
                    case zs.D1 /* 118 */:
                        return zs.s1;
                    case zs.E1 /* 119 */:
                        return zs.t1;
                    case 120:
                        return zs.u1;
                    case zs.F1 /* 121 */:
                        return zs.v1;
                    case zs.G1 /* 122 */:
                        return zs.w1;
                    case zs.H1 /* 123 */:
                        return zs.x1;
                    case zs.I1 /* 124 */:
                        return zs.y1;
                    case zs.J1 /* 125 */:
                        return zs.z1;
                    case zs.K1 /* 126 */:
                        return zs.C1;
                    case zs.L1 /* 127 */:
                        return zs.E1;
                    case 128:
                        return 120;
                    case zs.N1 /* 129 */:
                        return zs.F1;
                    case zs.O1 /* 130 */:
                        return zs.G1;
                    case zs.P1 /* 131 */:
                        return zs.H1;
                    case zs.Q1 /* 132 */:
                        return zs.I1;
                    case 133:
                        return zs.J1;
                    case 134:
                        return zs.K1;
                    case zs.R1 /* 135 */:
                        return zs.L1;
                    case zs.S1 /* 136 */:
                        return 128;
                    case zs.T1 /* 137 */:
                        return zs.N1;
                    case zs.U1 /* 138 */:
                        return zs.O1;
                    case zs.V1 /* 139 */:
                        return zs.P1;
                    case zs.W1 /* 140 */:
                        return zs.Q1;
                    case zs.X1 /* 141 */:
                        return 133;
                    case zs.Y1 /* 142 */:
                        return 134;
                    case zs.Z1 /* 143 */:
                        return zs.R1;
                    case zs.a2 /* 144 */:
                        return zs.S1;
                    case zs.b2 /* 145 */:
                        return zs.A1;
                    case zs.c2 /* 146 */:
                        return zs.B1;
                    case zs.d2 /* 147 */:
                        return zs.D1;
                    case zs.e2 /* 148 */:
                        return zs.T1;
                    case zs.f2 /* 149 */:
                        return zs.U1;
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
            case zs.T /* 30 */:
                return "Jazz+Funk";
            case zs.U /* 31 */:
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
            case zs.o0 /* 51 */:
                return "Darkwave";
            case zs.p0 /* 52 */:
                return "Techno-Industrial";
            case zs.q0 /* 53 */:
                return "Electronic";
            case zs.r0 /* 54 */:
                return "Pop-Folk";
            case zs.s0 /* 55 */:
                return "Eurodance";
            case zs.t0 /* 56 */:
                return "Dream";
            case zs.u0 /* 57 */:
                return "Southern Rock";
            case zs.v0 /* 58 */:
                return "Comedy";
            case zs.w0 /* 59 */:
                return "Cult";
            case zs.x0 /* 60 */:
                return "Gangsta";
            case zs.y0 /* 61 */:
                return "Top 40";
            case zs.z0 /* 62 */:
                return "Christian Rap";
            case zs.A0 /* 63 */:
                return "Pop/Funk";
            case 64:
                return "Jungle";
            case 65:
                return "Native American";
            case zs.D0 /* 66 */:
                return "Cabaret";
            case zs.E0 /* 67 */:
                return "New Wave";
            case zs.F0 /* 68 */:
                return "Psychadelic";
            case zs.G0 /* 69 */:
                return "Rave";
            case zs.H0 /* 70 */:
                return "Showtunes";
            case zs.I0 /* 71 */:
                return "Trailer";
            case zs.J0 /* 72 */:
                return "Lo-Fi";
            case zs.K0 /* 73 */:
                return "Tribal";
            case zs.L0 /* 74 */:
                return "Acid Punk";
            case zs.M0 /* 75 */:
                return "Acid Jazz";
            case zs.N0 /* 76 */:
                return "Polka";
            case zs.O0 /* 77 */:
                return "Retro";
            case zs.P0 /* 78 */:
                return "Musical";
            case zs.Q0 /* 79 */:
                return "Rock & Roll";
            case 80:
                return "Hard Rock";
            case zs.S0 /* 81 */:
                return "Folk";
            case zs.T0 /* 82 */:
                return "Folk-Rock";
            case zs.U0 /* 83 */:
                return "National Folk";
            case zs.V0 /* 84 */:
                return "Swing";
            case zs.W0 /* 85 */:
                return "Fast Fusion";
            case zs.X0 /* 86 */:
                return "Bebop";
            case zs.Y0 /* 87 */:
                return "Latin";
            case zs.Z0 /* 88 */:
                return "Revival";
            case zs.a1 /* 89 */:
                return "Celtic";
            case zs.b1 /* 90 */:
                return "Bluegrass";
            case zs.c1 /* 91 */:
                return "Avantgarde";
            case zs.d1 /* 92 */:
                return "Gothic Rock";
            case zs.e1 /* 93 */:
                return "Progressive Rock";
            case zs.f1 /* 94 */:
                return "Psychedelic Rock";
            case zs.g1 /* 95 */:
                return "Symphonic Rock";
            case 96:
                return "Slow Rock";
            case zs.i1 /* 97 */:
                return "Big Band";
            case zs.j1 /* 98 */:
                return "Chorus";
            case zs.k1 /* 99 */:
                return "Easy Listening";
            case zs.l1 /* 100 */:
                return "Acoustic";
            case 101:
                return "Humour";
            case zs.n1 /* 102 */:
                return "Speech";
            case zs.o1 /* 103 */:
                return "Chanson";
            case zs.p1 /* 104 */:
                return "Opera";
            case zs.q1 /* 105 */:
                return "Chamber Music";
            case zs.r1 /* 106 */:
                return "Sonata";
            case zs.s1 /* 107 */:
                return "Symphony";
            case zs.t1 /* 108 */:
                return "Booty Bass";
            case zs.u1 /* 109 */:
                return "Primus";
            case zs.v1 /* 110 */:
                return "Porn Groove";
            case zs.w1 /* 111 */:
                return "Satire";
            case zs.x1 /* 112 */:
                return "Slow Jam";
            case zs.y1 /* 113 */:
                return "Club";
            case zs.z1 /* 114 */:
                return "Tango";
            case zs.A1 /* 115 */:
                return "Samba";
            case zs.B1 /* 116 */:
                return "Folklore";
            case zs.C1 /* 117 */:
                return "Ballad";
            case zs.D1 /* 118 */:
                return "Power Ballad";
            case zs.E1 /* 119 */:
                return "Rhythmic Soul";
            case 120:
                return "Freestyle";
            case zs.F1 /* 121 */:
                return "Duet";
            case zs.G1 /* 122 */:
                return "Punk Rock";
            case zs.H1 /* 123 */:
                return "Drum Solo";
            case zs.I1 /* 124 */:
                return "A capella";
            case zs.J1 /* 125 */:
                return "Euro-House";
            case zs.K1 /* 126 */:
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
            case zs.T /* 30 */:
                return 29;
            case zs.U /* 31 */:
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
            case zs.o0 /* 51 */:
                return 50;
            case zs.p0 /* 52 */:
                return 51;
            case zs.q0 /* 53 */:
                return 52;
            case zs.r0 /* 54 */:
                return 53;
            case zs.s0 /* 55 */:
                return 54;
            case zs.t0 /* 56 */:
                return 55;
            case zs.u0 /* 57 */:
                return 56;
            case zs.v0 /* 58 */:
                return 57;
            case zs.w0 /* 59 */:
                return 58;
            case zs.x0 /* 60 */:
                return 59;
            case zs.y0 /* 61 */:
                return 60;
            case zs.z0 /* 62 */:
                return 61;
            case zs.A0 /* 63 */:
                return 62;
            case 64:
                return 63;
            case 65:
                return 64;
            case zs.D0 /* 66 */:
                return 65;
            case zs.E0 /* 67 */:
                return 66;
            case zs.F0 /* 68 */:
                return 67;
            case zs.G0 /* 69 */:
                return 68;
            case zs.H0 /* 70 */:
                return 69;
            case zs.I0 /* 71 */:
                return 70;
            case zs.J0 /* 72 */:
                return 71;
            case zs.K0 /* 73 */:
                return 72;
            case zs.L0 /* 74 */:
                return 73;
            case zs.M0 /* 75 */:
                return 74;
            case zs.N0 /* 76 */:
                return 75;
            case zs.O0 /* 77 */:
                return 76;
            case zs.P0 /* 78 */:
                return 77;
            case zs.Q0 /* 79 */:
                return 78;
            case 80:
                return 79;
            case zs.S0 /* 81 */:
                return 90;
            case zs.T0 /* 82 */:
                return 91;
            case zs.U0 /* 83 */:
                return zs.n1;
            case zs.V0 /* 84 */:
                return 93;
            case zs.W0 /* 85 */:
                return 94;
            case zs.X0 /* 86 */:
                return zs.o1;
            case zs.Y0 /* 87 */:
                return 96;
            case zs.Z0 /* 88 */:
                return 97;
            case zs.a1 /* 89 */:
                return 98;
            case zs.b1 /* 90 */:
                return 99;
            case zs.c1 /* 91 */:
                return 100;
            case zs.d1 /* 92 */:
                return 101;
            case zs.e1 /* 93 */:
                return zs.p1;
            case zs.f1 /* 94 */:
                return zs.q1;
            case zs.g1 /* 95 */:
                return zs.r1;
            case 96:
                return zs.s1;
            case zs.i1 /* 97 */:
                return zs.t1;
            case zs.j1 /* 98 */:
                return zs.u1;
            case zs.k1 /* 99 */:
                return zs.v1;
            case zs.l1 /* 100 */:
                return zs.w1;
            case 101:
                return zs.x1;
            case zs.n1 /* 102 */:
                return zs.y1;
            case zs.o1 /* 103 */:
                return zs.z1;
            case zs.p1 /* 104 */:
                return zs.A1;
            case zs.q1 /* 105 */:
                return zs.B1;
            case zs.r1 /* 106 */:
                return zs.C1;
            case zs.s1 /* 107 */:
                return zs.D1;
            case zs.t1 /* 108 */:
                return zs.E1;
            case zs.u1 /* 109 */:
                return 120;
            case zs.v1 /* 110 */:
                return zs.F1;
            case zs.w1 /* 111 */:
                return zs.G1;
            case zs.x1 /* 112 */:
                return zs.H1;
            case zs.y1 /* 113 */:
                return zs.I1;
            case zs.z1 /* 114 */:
                return zs.J1;
            case zs.A1 /* 115 */:
                return zs.b2;
            case zs.B1 /* 116 */:
                return zs.c2;
            case zs.C1 /* 117 */:
                return zs.K1;
            case zs.D1 /* 118 */:
                return zs.d2;
            case zs.E1 /* 119 */:
                return zs.L1;
            case 120:
                return 128;
            case zs.F1 /* 121 */:
                return zs.N1;
            case zs.G1 /* 122 */:
                return zs.O1;
            case zs.H1 /* 123 */:
                return zs.P1;
            case zs.I1 /* 124 */:
                return zs.Q1;
            case zs.J1 /* 125 */:
                return 133;
            case zs.K1 /* 126 */:
                return 134;
            case zs.L1 /* 127 */:
                return zs.R1;
            case 128:
                return zs.S1;
            case zs.N1 /* 129 */:
                return zs.T1;
            case zs.O1 /* 130 */:
                return zs.U1;
            case zs.P1 /* 131 */:
                return zs.V1;
            case zs.Q1 /* 132 */:
                return zs.W1;
            case 133:
                return zs.X1;
            case 134:
                return zs.Y1;
            case zs.R1 /* 135 */:
                return zs.Z1;
            case zs.S1 /* 136 */:
                return zs.a2;
            case zs.T1 /* 137 */:
                return zs.e2;
            case zs.U1 /* 138 */:
                return zs.f2;
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
