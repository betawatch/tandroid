package a3;

import ai.u5;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import b2.a2;
import b2.l1;
import b2.o1;
import b2.v0;
import b2.y1;
import e9.x1;
import i2.p1;
import i2.r1;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLObject;
import u2.e1;
import v7.u6;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes.dex */
public final class n extends r2.r {
    public static final int[] S1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    public static boolean T1;
    public static boolean U1;
    public int A1;
    public r1 B1;
    public long C1;
    public boolean D1;
    public long E1;
    public int F1;
    public long G1;
    public a2 H1;
    public a2 I1;
    public int J1;
    public boolean K1;
    public int L1;
    public m M1;
    public y N1;
    public long O1;
    public long P1;
    public boolean Q1;
    public int R1;
    public final Context Z0;
    public final boolean a1;
    public final n4.s b1;
    public final int c1;
    public final boolean d1;
    public final a0 e1;
    public final z f1;
    public final n4.s g1;
    public final long h1;
    public final b0 i1;
    public final PriorityQueue j1;
    public l k1;
    public boolean l1;
    public boolean m1;
    public p0 n1;
    public boolean o1;
    public int p1;
    public List q1;
    public Surface r1;
    public p s1;
    public e2.y t1;
    public boolean u1;
    public int v1;
    public int w1;
    public long x1;
    public int y1;
    public int z1;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public n(k kVar) {
        super(r0.getApplicationContext(), 2, kVar.c, 30.0f);
        Context context = kVar.a;
        Context applicationContext = context.getApplicationContext();
        this.Z0 = applicationContext;
        this.c1 = kVar.g;
        this.n1 = null;
        this.b1 = new n4.s(kVar.e, kVar.f);
        this.a1 = this.n1 == null;
        this.e1 = new a0(applicationContext, this, kVar.d);
        this.f1 = new z();
        this.d1 = "NVIDIA".equals(Build.MANUFACTURER);
        this.t1 = e2.y.c;
        this.v1 = 1;
        this.w1 = 0;
        this.H1 = a2.d;
        this.L1 = 0;
        this.I1 = null;
        this.J1 = -1000;
        this.O1 = -9223372036854775807L;
        this.P1 = -9223372036854775807L;
        this.g1 = new n4.s(1);
        this.j1 = new PriorityQueue();
        this.h1 = -15000L;
        this.i1 = new b0();
        this.B1 = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x0741, code lost:
    
        if (r0.equals("ELUGA_Ray_X") == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x08c8, code lost:
    
        if (r13.equals("JSN-L21") == false) goto L664;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008d A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean D0(String str) {
        boolean z10;
        boolean z11;
        boolean z12 = false;
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (n.class) {
            try {
                if (!T1) {
                    int i10 = Build.VERSION.SDK_INT;
                    char c10 = 28;
                    if (i10 <= 28) {
                        String str2 = Build.DEVICE;
                        str2.getClass();
                        switch (str2.hashCode()) {
                            case -1339091551:
                                if (str2.equals("dangal")) {
                                    z11 = false;
                                    break;
                                }
                                z11 = -1;
                                break;
                            case -1220081023:
                                if (str2.equals("dangalFHD")) {
                                    z11 = true;
                                    break;
                                }
                                z11 = -1;
                                break;
                            case -1220066608:
                                if (str2.equals("dangalUHD")) {
                                    z11 = 2;
                                    break;
                                }
                                z11 = -1;
                                break;
                            case -1012436106:
                                if (str2.equals("oneday")) {
                                    z11 = 3;
                                    break;
                                }
                                z11 = -1;
                                break;
                            case -760312546:
                                if (str2.equals("aquaman")) {
                                    z11 = 4;
                                    break;
                                }
                                z11 = -1;
                                break;
                            case -64886864:
                                if (str2.equals("magnolia")) {
                                    z11 = 5;
                                    break;
                                }
                                z11 = -1;
                                break;
                            case 3415681:
                                if (str2.equals("once")) {
                                    z11 = 6;
                                    break;
                                }
                                z11 = -1;
                                break;
                            case 825323514:
                                if (str2.equals("machuca")) {
                                    z11 = 7;
                                    break;
                                }
                                z11 = -1;
                                break;
                            default:
                                z11 = -1;
                                break;
                        }
                        switch (z11) {
                            case false:
                            case true:
                            case true:
                            case true:
                            case true:
                            case true:
                            case true:
                            case true:
                                z12 = true;
                                break;
                        }
                        U1 = z12;
                        T1 = true;
                    }
                    if (i10 > 27 || !"HWEML".equals(Build.DEVICE)) {
                        String str3 = Build.MODEL;
                        str3.getClass();
                        switch (str3.hashCode()) {
                            case -349662828:
                                if (str3.equals("AFTJMST12")) {
                                    z10 = false;
                                    break;
                                }
                                z10 = -1;
                                break;
                            case -321033677:
                                if (str3.equals("AFTKMST12")) {
                                    z10 = true;
                                    break;
                                }
                                z10 = -1;
                                break;
                            case 2006354:
                                if (str3.equals("AFTA")) {
                                    z10 = 2;
                                    break;
                                }
                                z10 = -1;
                                break;
                            case 2006367:
                                if (str3.equals("AFTN")) {
                                    z10 = 3;
                                    break;
                                }
                                z10 = -1;
                                break;
                            case 2006371:
                                if (str3.equals("AFTR")) {
                                    z10 = 4;
                                    break;
                                }
                                z10 = -1;
                                break;
                            case 1785421873:
                                if (str3.equals("AFTEU011")) {
                                    z10 = 5;
                                    break;
                                }
                                z10 = -1;
                                break;
                            case 1785421876:
                                if (str3.equals("AFTEU014")) {
                                    z10 = 6;
                                    break;
                                }
                                z10 = -1;
                                break;
                            case 1798172390:
                                if (str3.equals("AFTSO001")) {
                                    z10 = 7;
                                    break;
                                }
                                z10 = -1;
                                break;
                            case 2119412532:
                                if (str3.equals("AFTEUFF014")) {
                                    z10 = 8;
                                    break;
                                }
                                z10 = -1;
                                break;
                            default:
                                z10 = -1;
                                break;
                        }
                        switch (z10) {
                            default:
                                if (i10 <= 26) {
                                    String str4 = Build.DEVICE;
                                    str4.getClass();
                                    switch (str4.hashCode()) {
                                        case -2144781245:
                                            if (str4.equals("GIONEE_SWW1609")) {
                                                c10 = 0;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case -2144781185:
                                            if (str4.equals("GIONEE_SWW1627")) {
                                                c10 = 1;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case -2144781160:
                                            if (str4.equals("GIONEE_SWW1631")) {
                                                c10 = 2;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case -2097309513:
                                            if (str4.equals("K50a40")) {
                                                c10 = 3;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case -2022874474:
                                            if (str4.equals("CP8676_I02")) {
                                                c10 = 4;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case -1978993182:
                                            if (str4.equals("NX541J")) {
                                                c10 = 5;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case -1978990237:
                                            if (str4.equals("NX573J")) {
                                                c10 = 6;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case -1936688988:
                                            if (str4.equals("PGN528")) {
                                                c10 = 7;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case -1936688066:
                                            if (str4.equals("PGN610")) {
                                                c10 = '\b';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case -1936688065:
                                            if (str4.equals("PGN611")) {
                                                c10 = '\t';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case -1931988508:
                                            if (str4.equals("AquaPowerM")) {
                                                c10 = '\n';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case -1885099851:
                                            if (str4.equals("RAIJIN")) {
                                                c10 = 11;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case -1696512866:
                                            if (str4.equals("XT1663")) {
                                                c10 = '\f';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case -1680025915:
                                            if (str4.equals("ComioS1")) {
                                                c10 = '\r';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case -1615810839:
                                            if (str4.equals("Phantom6")) {
                                                c10 = 14;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case -1600724499:
                                            if (str4.equals("pacificrim")) {
                                                c10 = 15;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case -1554255044:
                                            if (str4.equals("vernee_M5")) {
                                                c10 = 16;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case -1481772737:
                                            if (str4.equals("panell_dl")) {
                                                c10 = 17;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case -1481772730:
                                            if (str4.equals("panell_ds")) {
                                                c10 = 18;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case -1481772729:
                                            if (str4.equals("panell_dt")) {
                                                c10 = 19;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case -1320080169:
                                            if (str4.equals("GiONEE_GBL7319")) {
                                                c10 = 20;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case -1217592143:
                                            if (str4.equals("BRAVIA_ATV2")) {
                                                c10 = 21;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case -1180384755:
                                            if (str4.equals("iris60")) {
                                                c10 = 22;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case -1139198265:
                                            if (str4.equals("Slate_Pro")) {
                                                c10 = 23;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case -1052835013:
                                            if (str4.equals("namath")) {
                                                c10 = 24;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case -993250464:
                                            if (str4.equals("A10-70F")) {
                                                c10 = 25;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case -993250458:
                                            if (str4.equals("A10-70L")) {
                                                c10 = 26;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case -965403638:
                                            if (str4.equals("s905x018")) {
                                                c10 = 27;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case -958336948:
                                            break;
                                        case -879245230:
                                            if (str4.equals("tcl_eu")) {
                                                c10 = 29;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case -842500323:
                                            if (str4.equals("nicklaus_f")) {
                                                c10 = 30;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case -821392978:
                                            if (str4.equals("A7000-a")) {
                                                c10 = 31;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case -797483286:
                                            if (str4.equals("SVP-DTV15")) {
                                                c10 = ' ';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case -794946968:
                                            if (str4.equals("watson")) {
                                                c10 = '!';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case -788334647:
                                            if (str4.equals("whyred")) {
                                                c10 = '\"';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case -782144577:
                                            if (str4.equals("OnePlus5T")) {
                                                c10 = '#';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case -575125681:
                                            if (str4.equals("GiONEE_CBL7513")) {
                                                c10 = '$';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case -521118391:
                                            if (str4.equals("GIONEE_GBL7360")) {
                                                c10 = '%';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case -430914369:
                                            if (str4.equals("Pixi4-7_3G")) {
                                                c10 = '&';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case -290434366:
                                            if (str4.equals("taido_row")) {
                                                c10 = '\'';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case -282781963:
                                            if (str4.equals("BLACK-1X")) {
                                                c10 = '(';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case -277133239:
                                            if (str4.equals("Z12_PRO")) {
                                                c10 = ')';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case -173639913:
                                            if (str4.equals("ELUGA_A3_Pro")) {
                                                c10 = '*';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case -56598463:
                                            if (str4.equals("woods_fn")) {
                                                c10 = '+';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 2126:
                                            if (str4.equals("C1")) {
                                                c10 = ',';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 2564:
                                            if (str4.equals("Q5")) {
                                                c10 = '-';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 2715:
                                            if (str4.equals("V1")) {
                                                c10 = '.';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 2719:
                                            if (str4.equals("V5")) {
                                                c10 = '/';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 3091:
                                            if (str4.equals("b5")) {
                                                c10 = '0';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 3483:
                                            if (str4.equals("mh")) {
                                                c10 = '1';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 73405:
                                            if (str4.equals("JGZ")) {
                                                c10 = '2';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 75537:
                                            if (str4.equals("M04")) {
                                                c10 = '3';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 75739:
                                            if (str4.equals("M5c")) {
                                                c10 = '4';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 76779:
                                            if (str4.equals("MX6")) {
                                                c10 = '5';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 78669:
                                            if (str4.equals("P85")) {
                                                c10 = '6';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 79305:
                                            if (str4.equals("PLE")) {
                                                c10 = '7';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 80618:
                                            if (str4.equals("QX1")) {
                                                c10 = '8';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 88274:
                                            if (str4.equals("Z80")) {
                                                c10 = '9';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 98846:
                                            if (str4.equals("cv1")) {
                                                c10 = ':';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 98848:
                                            if (str4.equals("cv3")) {
                                                c10 = ';';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 99329:
                                            if (str4.equals("deb")) {
                                                c10 = '<';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 101481:
                                            if (str4.equals("flo")) {
                                                c10 = '=';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 1513190:
                                            if (str4.equals("1601")) {
                                                c10 = '>';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 1514184:
                                            if (str4.equals("1713")) {
                                                c10 = '?';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 1514185:
                                            if (str4.equals("1714")) {
                                                c10 = '@';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 2133089:
                                            if (str4.equals("F01H")) {
                                                c10 = 'A';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 2133091:
                                            if (str4.equals("F01J")) {
                                                c10 = 'B';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 2133120:
                                            if (str4.equals("F02H")) {
                                                c10 = 'C';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 2133151:
                                            if (str4.equals("F03H")) {
                                                c10 = 'D';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 2133182:
                                            if (str4.equals("F04H")) {
                                                c10 = 'E';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 2133184:
                                            if (str4.equals("F04J")) {
                                                c10 = 'F';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 2436959:
                                            if (str4.equals("P681")) {
                                                c10 = 'G';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 2463773:
                                            if (str4.equals("Q350")) {
                                                c10 = 'H';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 2464648:
                                            if (str4.equals("Q427")) {
                                                c10 = 'I';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 2689555:
                                            if (str4.equals("XE2X")) {
                                                c10 = 'J';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 3154429:
                                            if (str4.equals("fugu")) {
                                                c10 = 'K';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 3284551:
                                            if (str4.equals("kate")) {
                                                c10 = 'L';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 3351335:
                                            if (str4.equals("mido")) {
                                                c10 = 'M';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 3386211:
                                            if (str4.equals("p212")) {
                                                c10 = 'N';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 41325051:
                                            if (str4.equals("MEIZU_M5")) {
                                                c10 = 'O';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 51349633:
                                            if (str4.equals("601LV")) {
                                                c10 = 'P';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 51350594:
                                            if (str4.equals("602LV")) {
                                                c10 = 'Q';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 55178625:
                                            if (str4.equals("Aura_Note_2")) {
                                                c10 = 'R';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 61542055:
                                            if (str4.equals("A1601")) {
                                                c10 = 'S';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 65355429:
                                            if (str4.equals("E5643")) {
                                                c10 = 'T';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 66214468:
                                            if (str4.equals("F3111")) {
                                                c10 = 'U';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 66214470:
                                            if (str4.equals("F3113")) {
                                                c10 = 'V';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 66214473:
                                            if (str4.equals("F3116")) {
                                                c10 = 'W';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 66215429:
                                            if (str4.equals("F3211")) {
                                                c10 = 'X';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 66215431:
                                            if (str4.equals("F3213")) {
                                                c10 = 'Y';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 66215433:
                                            if (str4.equals("F3215")) {
                                                c10 = 'Z';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 66216390:
                                            if (str4.equals("F3311")) {
                                                c10 = '[';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 76402249:
                                            if (str4.equals("PRO7S")) {
                                                c10 = '\\';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 76404105:
                                            if (str4.equals("Q4260")) {
                                                c10 = ']';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 76404911:
                                            if (str4.equals("Q4310")) {
                                                c10 = '^';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 80963634:
                                            if (str4.equals("V23GB")) {
                                                c10 = '_';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 82882791:
                                            if (str4.equals("X3_HK")) {
                                                c10 = '`';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 98715550:
                                            if (str4.equals("i9031")) {
                                                c10 = 'a';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 101370885:
                                            if (str4.equals("l5460")) {
                                                c10 = 'b';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 102844228:
                                            if (str4.equals("le_x6")) {
                                                c10 = 'c';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 165221241:
                                            if (str4.equals("A2016a40")) {
                                                c10 = 'd';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 182191441:
                                            if (str4.equals("CPY83_I00")) {
                                                c10 = 'e';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 245388979:
                                            if (str4.equals("marino_f")) {
                                                c10 = 'f';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 287431619:
                                            if (str4.equals("griffin")) {
                                                c10 = 'g';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 307593612:
                                            if (str4.equals("A7010a48")) {
                                                c10 = 'h';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 308517133:
                                            if (str4.equals("A7020a48")) {
                                                c10 = 'i';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 316215098:
                                            if (str4.equals("TB3-730F")) {
                                                c10 = 'j';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 316215116:
                                            if (str4.equals("TB3-730X")) {
                                                c10 = 'k';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 316246811:
                                            if (str4.equals("TB3-850F")) {
                                                c10 = 'l';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 316246818:
                                            if (str4.equals("TB3-850M")) {
                                                c10 = 'm';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 407160593:
                                            if (str4.equals("Pixi5-10_4G")) {
                                                c10 = 'n';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 507412548:
                                            if (str4.equals("QM16XE_U")) {
                                                c10 = 'o';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 793982701:
                                            if (str4.equals("GIONEE_WBL5708")) {
                                                c10 = 'p';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 794038622:
                                            if (str4.equals("GIONEE_WBL7365")) {
                                                c10 = 'q';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 794040393:
                                            if (str4.equals("GIONEE_WBL7519")) {
                                                c10 = 'r';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 835649806:
                                            if (str4.equals("manning")) {
                                                c10 = 's';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 917340916:
                                            if (str4.equals("A7000plus")) {
                                                c10 = 't';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 958008161:
                                            if (str4.equals("j2xlteins")) {
                                                c10 = 'u';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 1060579533:
                                            if (str4.equals("panell_d")) {
                                                c10 = 'v';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 1150207623:
                                            if (str4.equals("LS-5017")) {
                                                c10 = 'w';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 1176899427:
                                            if (str4.equals("itel_S41")) {
                                                c10 = 'x';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 1280332038:
                                            if (str4.equals("hwALE-H")) {
                                                c10 = 'y';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 1306947716:
                                            if (str4.equals("EverStar_S")) {
                                                c10 = 'z';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 1349174697:
                                            if (str4.equals("htc_e56ml_dtul")) {
                                                c10 = '{';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 1522194893:
                                            if (str4.equals("woods_f")) {
                                                c10 = '|';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 1691543273:
                                            if (str4.equals("CPH1609")) {
                                                c10 = '}';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 1691544261:
                                            if (str4.equals("CPH1715")) {
                                                c10 = '~';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 1709443163:
                                            if (str4.equals("iball8735_9806")) {
                                                c10 = 127;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 1865889110:
                                            if (str4.equals("santoni")) {
                                                c10 = 128;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 1906253259:
                                            if (str4.equals("PB2-670M")) {
                                                c10 = 129;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 1977196784:
                                            if (str4.equals("Infinix-X572")) {
                                                c10 = 130;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 2006372676:
                                            if (str4.equals("BRAVIA_ATV3_4K")) {
                                                c10 = 131;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 2019281702:
                                            if (str4.equals("DM-01K")) {
                                                c10 = 132;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 2029784656:
                                            if (str4.equals("HWBLN-H")) {
                                                c10 = 133;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 2030379515:
                                            if (str4.equals("HWCAM-H")) {
                                                c10 = 134;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 2033393791:
                                            if (str4.equals("ASUS_X00AD_2")) {
                                                c10 = 135;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 2047190025:
                                            if (str4.equals("ELUGA_Note")) {
                                                c10 = 136;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 2047252157:
                                            if (str4.equals("ELUGA_Prim")) {
                                                c10 = 137;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 2048319463:
                                            if (str4.equals("HWVNS-H")) {
                                                c10 = 138;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 2048855701:
                                            if (str4.equals("HWWAS-H")) {
                                                c10 = 139;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        default:
                                            c10 = 65535;
                                            break;
                                    }
                                    switch (c10) {
                                    }
                                }
                                break;
                            case false:
                            case true:
                            case true:
                            case true:
                            case true:
                            case true:
                            case true:
                            case true:
                            case true:
                                break;
                        }
                        U1 = z12;
                        T1 = true;
                    }
                    z12 = true;
                    U1 = z12;
                    T1 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return U1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0089, code lost:
    
        if (r3.equals("video/av01") == false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int E0(r2.o oVar, b2.w wVar) {
        int i10 = wVar.z;
        int i11 = wVar.A;
        if (i10 != -1 && i11 != -1) {
            String str = wVar.s;
            str.getClass();
            char c10 = 1;
            if ("video/dolby-vision".equals(str)) {
                Pair b10 = e2.g.b(wVar);
                if (b10 != null) {
                    int intValue = ((Integer) b10.first).intValue();
                    if (intValue == 512 || intValue == 1 || intValue == 2) {
                        str = MediaController.VIDEO_MIME_TYPE;
                    } else if (intValue == 1024) {
                        str = "video/av01";
                    }
                }
                str = "video/hevc";
            }
            switch (str.hashCode()) {
                case -1664118616:
                    if (str.equals("video/3gpp")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1662735862:
                    break;
                case -1662541442:
                    if (str.equals("video/hevc")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1187890754:
                    if (str.equals("video/mp4v-es")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1331836730:
                    if (str.equals(MediaController.VIDEO_MIME_TYPE)) {
                        c10 = 4;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1599127256:
                    if (str.equals("video/x-vnd.on2.vp8")) {
                        c10 = 5;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1599127257:
                    if (str.equals("video/x-vnd.on2.vp9")) {
                        c10 = 6;
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            switch (c10) {
                case 0:
                case 1:
                case 3:
                case 5:
                    return ((i10 * i11) * 3) / 4;
                case 2:
                    return Math.max(TLObject.FLAG_21, ((i10 * i11) * 3) / 4);
                case 4:
                    String str2 = Build.MODEL;
                    if (!"BRAVIA 4K 2015".equals(str2) && (!"Amazon".equals(Build.MANUFACTURER) || (!"KFSOWI".equals(str2) && (!"AFTS".equals(str2) || !oVar.f)))) {
                        return ((e2.m0.g(i11, 16) * e2.m0.g(i10, 16)) * 768) / 4;
                    }
                    break;
                case 6:
                    return ((i10 * i11) * 3) / 8;
            }
        }
        return -1;
    }

    public static List F0(Context context, r2.i iVar, b2.w wVar, boolean z10, boolean z11) {
        String str = wVar.s;
        if (str == null) {
            return x1.e;
        }
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(str) && !c2.i.d(context)) {
            String c10 = r2.w.c(wVar);
            List a2 = c10 == null ? x1.e : iVar.a(c10, z10, z11);
            if (!a2.isEmpty()) {
                return a2;
            }
        }
        return r2.w.g(iVar, wVar, z10, z11);
    }

    public static int G0(r2.o oVar, b2.w wVar) {
        int i10 = wVar.t;
        List list = wVar.v;
        if (i10 == -1) {
            return E0(oVar, wVar);
        }
        int size = list.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += ((byte[]) list.get(i12)).length;
        }
        return wVar.t + i11;
    }

    @Override // r2.r, i2.b
    public final void A(float f7, float f10) {
        super.A(f7, f10);
        p0 p0Var = this.n1;
        if (p0Var != null) {
            p0Var.a(f7);
        } else {
            this.e1.h(f7);
        }
        b0 b0Var = this.i1;
        if (b0Var != null) {
            b0Var.c(f7);
        }
    }

    @Override // i2.b
    public final boolean E(long j10) {
        if (this.I0 == -9223372036854775807L || j10 < this.C1) {
            return false;
        }
        long j11 = this.Q0;
        return j11 == -9223372036854775807L || j10 > j11;
    }

    @Override // r2.r
    public final i2.g H(r2.o oVar, b2.w wVar, b2.w wVar2, boolean z10) {
        int i10;
        i2.g b10 = oVar.b(wVar, wVar2);
        float f7 = wVar.D;
        float f10 = wVar2.D;
        int i11 = b10.e;
        l lVar = this.k1;
        lVar.getClass();
        if (wVar2.z > lVar.a || wVar2.A > lVar.b) {
            i11 |= 256;
        }
        if (G0(oVar, wVar2) > lVar.c) {
            i11 |= 64;
        }
        if (this.w1 != Integer.MIN_VALUE && (i10 = Build.VERSION.SDK_INT) < 31 && ((i10 != 30 || Build.MODEL.startsWith("MiTV")) && f7 != -1.0f && f10 != -1.0f && (!oVar.f || !z10))) {
            if (Math.abs((Math.max(f10, f7) / Math.min(f10, f7)) - Math.round(r14)) > 0.01f) {
                i11 |= 65536;
            }
        }
        int i12 = i11;
        return new i2.g(oVar.a, wVar, wVar2, i12 != 0 ? 0 : b10.d, i12);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0070 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Surface H0(r2.o oVar) {
        boolean z10;
        o oVar2;
        p0 p0Var = this.n1;
        if (p0Var != null) {
            return p0Var.c();
        }
        Surface surface = this.r1;
        if (surface != null) {
            return surface;
        }
        if (Build.VERSION.SDK_INT >= 35 && oVar.h) {
            return null;
        }
        u6.p(P0(oVar));
        p pVar = this.s1;
        if (pVar != null && pVar.a != oVar.f && pVar != null) {
            pVar.release();
            this.s1 = null;
        }
        if (this.s1 == null) {
            Context context = this.Z0;
            boolean z11 = oVar.f;
            boolean z12 = false;
            if (!z11) {
                int i10 = p.d;
            } else if (!p.b(context)) {
                z10 = false;
                u6.p(z10);
                oVar2 = new o("ExoPlayer:PlaceholderSurface");
                int i11 = !z11 ? p.d : 0;
                oVar2.start();
                Handler handler = new Handler(oVar2.getLooper(), oVar2);
                oVar2.b = handler;
                oVar2.a = new e2.l(handler);
                synchronized (oVar2) {
                    oVar2.b.obtainMessage(1, i11, 0).sendToTarget();
                    while (oVar2.e == null && oVar2.d == null && oVar2.c == null) {
                        try {
                            oVar2.wait();
                        } catch (InterruptedException unused) {
                            z12 = true;
                        }
                    }
                }
                if (z12) {
                    Thread.currentThread().interrupt();
                }
                RuntimeException runtimeException = oVar2.d;
                if (runtimeException != null) {
                    throw runtimeException;
                }
                Error error = oVar2.c;
                if (error != null) {
                    throw error;
                }
                p pVar2 = oVar2.e;
                pVar2.getClass();
                this.s1 = pVar2;
            }
            z10 = true;
            u6.p(z10);
            oVar2 = new o("ExoPlayer:PlaceholderSurface");
            if (!z11) {
            }
            oVar2.start();
            Handler handler2 = new Handler(oVar2.getLooper(), oVar2);
            oVar2.b = handler2;
            oVar2.a = new e2.l(handler2);
            synchronized (oVar2) {
            }
        }
        return this.s1;
    }

    @Override // r2.r
    public final r2.n I(IllegalStateException illegalStateException, r2.o oVar) {
        Surface surface = this.r1;
        i iVar = new i(illegalStateException, oVar);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return iVar;
    }

    public final boolean I0(r2.o oVar) {
        if (this.n1 != null) {
            return true;
        }
        Surface surface = this.r1;
        if (surface == null || !surface.isValid()) {
            return (Build.VERSION.SDK_INT >= 35 && oVar.h) || P0(oVar);
        }
        return true;
    }

    public final boolean J0(h2.h hVar) {
        if (k() || hVar.isLastSample()) {
            return true;
        }
        long j10 = this.P1;
        return j10 == -9223372036854775807L || j10 - (hVar.e - this.P0.c) <= 100000;
    }

    public final void K0() {
        if (this.y1 > 0) {
            this.h.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = elapsedRealtime - this.x1;
            int i10 = this.y1;
            n4.s sVar = this.b1;
            Handler handler = (Handler) sVar.b;
            if (handler != null) {
                handler.post(new j0(sVar, i10, j10));
            }
            this.y1 = 0;
            this.x1 = elapsedRealtime;
        }
    }

    public final void L0() {
        r2.l lVar;
        if (this.K1 && (lVar = this.d0) != null) {
            this.M1 = new m(this, lVar);
            if (Build.VERSION.SDK_INT >= 33) {
                Bundle bundle = new Bundle();
                bundle.putInt("tunnel-peek", 1);
                lVar.setParameters(bundle);
            }
        }
    }

    public final void M0(r2.l lVar, int i10, long j10) {
        Surface surface;
        Trace.beginSection("releaseOutputBuffer");
        lVar.g(i10, j10);
        Trace.endSection();
        this.O0.e++;
        this.z1 = 0;
        if (this.n1 == null) {
            a2 a2Var = this.H1;
            boolean equals = a2Var.equals(a2.d);
            n4.s sVar = this.b1;
            if (!equals && !a2Var.equals(this.I1)) {
                this.I1 = a2Var;
                sVar.I(a2Var);
            }
            a0 a0Var = this.e1;
            boolean z10 = a0Var.e != 3;
            a0Var.e = 3;
            a0Var.l.getClass();
            a0Var.g = e2.m0.S(SystemClock.elapsedRealtime());
            if (!z10 || (surface = this.r1) == null) {
                return;
            }
            sVar.D(surface);
            this.u1 = true;
        }
    }

    public final void N0(Object obj) {
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        Surface surface2 = this.r1;
        n4.s sVar = this.b1;
        if (surface2 == surface) {
            if (surface != null) {
                a2 a2Var = this.I1;
                if (a2Var != null) {
                    sVar.I(a2Var);
                }
                Surface surface3 = this.r1;
                if (surface3 == null || !this.u1) {
                    return;
                }
                sVar.D(surface3);
                return;
            }
            return;
        }
        this.r1 = surface;
        p0 p0Var = this.n1;
        a0 a0Var = this.e1;
        if (p0Var == null) {
            a0Var.g(surface);
        }
        this.u1 = false;
        int i10 = this.n;
        r2.l lVar = this.d0;
        if (lVar != null && this.n1 == null) {
            r2.o oVar = this.k0;
            oVar.getClass();
            if (!I0(oVar) || this.l1) {
                n0();
                X();
            } else {
                Surface H0 = H0(oVar);
                if (H0 != null) {
                    try {
                        lVar.k(H0);
                    } catch (Throwable th2) {
                        th2.printStackTrace();
                        throw new x(th2);
                    }
                } else {
                    if (Build.VERSION.SDK_INT < 35) {
                        throw new IllegalStateException();
                    }
                    lVar.f();
                }
            }
        }
        if (surface != null) {
            a2 a2Var2 = this.I1;
            if (a2Var2 != null) {
                sVar.I(a2Var2);
            }
        } else {
            this.I1 = null;
            p0 p0Var2 = this.n1;
            if (p0Var2 != null) {
                p0Var2.k();
            }
        }
        if (i10 == 2) {
            p0 p0Var3 = this.n1;
            if (p0Var3 != null) {
                p0Var3.q(true);
            } else {
                a0Var.c(true);
            }
        }
        L0();
    }

    @Override // r2.r
    public final int O(h2.h hVar) {
        if (Build.VERSION.SDK_INT >= 34) {
            return ((this.B1 == null && !this.K1) || hVar.e >= this.w || J0(hVar)) ? 0 : 32;
        }
        return 0;
    }

    public final boolean O0(long j10, long j11, boolean z10, boolean z11) {
        int B;
        if (this.n1 != null && this.a1) {
            j11 -= -this.O1;
        }
        if (j10 >= -500000 || z10 || (B = B(j11)) == 0) {
            return false;
        }
        this.C1 = j11;
        PriorityQueue priorityQueue = this.j1;
        if (z11) {
            i2.f fVar = this.O0;
            int i10 = fVar.d + B;
            fVar.d = i10;
            fVar.f += this.A1;
            fVar.d = priorityQueue.size() + i10;
        } else {
            this.O0.j++;
            R0(priorityQueue.size() + B, this.A1);
        }
        if (this.d0 != null) {
            if (x0()) {
                n0();
                X();
            } else if (v0()) {
                M();
            } else {
                this.T0 = true;
            }
        }
        p0 p0Var = this.n1;
        if (p0Var != null) {
            p0Var.m(false);
        }
        return true;
    }

    @Override // r2.r
    public final float P(float f7, b2.w wVar, b2.w[] wVarArr) {
        r2.o oVar;
        float f10 = -1.0f;
        for (b2.w wVar2 : wVarArr) {
            float f11 = wVar2.D;
            if (f11 != -1.0f) {
                f10 = Math.max(f10, f11);
            }
        }
        float f12 = f10 == -1.0f ? -1.0f : f10 * f7;
        if (this.B1 == null || (oVar = this.k0) == null) {
            return f12;
        }
        int i10 = wVar.z;
        int i11 = wVar.A;
        float f13 = -3.4028235E38f;
        if (oVar.i) {
            float f14 = oVar.l;
            if (f14 != -3.4028235E38f && oVar.j == i10 && oVar.k == i11) {
                f13 = f14;
            } else {
                float f15 = 1024.0f;
                if (!oVar.g(i10, i11, 1024.0f)) {
                    f13 = 0.0f;
                    while (true) {
                        float f16 = f15 - f13;
                        if (Math.abs(f16) <= 5.0f) {
                            break;
                        }
                        float f17 = (f16 / 2.0f) + f13;
                        if (oVar.g(i10, i11, f17)) {
                            f13 = f17;
                        } else {
                            f15 = f17;
                        }
                    }
                } else {
                    f13 = 1024.0f;
                }
                oVar.l = f13;
                oVar.j = i10;
                oVar.k = i11;
            }
        }
        return f12 != -1.0f ? Math.max(f12, f13) : f13;
    }

    public final boolean P0(r2.o oVar) {
        if (this.K1 || D0(oVar.a)) {
            return false;
        }
        return !oVar.f || p.b(this.Z0);
    }

    @Override // r2.r
    public final ArrayList Q(r2.i iVar, b2.w wVar, boolean z10) {
        boolean z11 = this.K1;
        Context context = this.Z0;
        List F0 = F0(context, iVar, wVar, z10, z11);
        HashMap hashMap = r2.w.a;
        ArrayList arrayList = new ArrayList(F0);
        Collections.sort(arrayList, new u5(new org.telegram.ui.web.m(3, context, wVar), 4));
        return arrayList;
    }

    public final void Q0(r2.l lVar, int i10) {
        Trace.beginSection("skipVideoBuffer");
        lVar.c(i10);
        Trace.endSection();
        this.O0.f++;
    }

    public final void R0(int i10, int i11) {
        i2.f fVar = this.O0;
        fVar.h += i10;
        int i12 = i10 + i11;
        fVar.g += i12;
        this.y1 += i12;
        int i13 = this.z1 + i12;
        this.z1 = i13;
        fVar.i = Math.max(i13, fVar.i);
        int i14 = this.c1;
        if (i14 <= 0 || this.y1 < i14) {
            return;
        }
        K0();
    }

    public final void S0(u2.g0 g0Var) {
        o1 o1Var = this.F;
        if (o1Var.p()) {
            this.P1 = -9223372036854775807L;
            return;
        }
        int b10 = o1Var.b(g0Var.a);
        if (b10 == -1) {
            this.P1 = -9223372036854775807L;
        } else {
            this.P1 = o1Var.f(b10, new l1(), false).d;
        }
    }

    @Override // r2.r
    public final com.google.firebase.messaging.l T(r2.o oVar, b2.w wVar, MediaCrypto mediaCrypto, float f7) {
        b2.n nVar;
        int i10;
        l lVar;
        Point point;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int i11;
        int i12;
        char c10;
        boolean z10;
        Pair b10;
        int E0;
        String str = oVar.c;
        b2.w[] wVarArr = this.s;
        wVarArr.getClass();
        int i13 = wVar.z;
        float f10 = wVar.D;
        b2.n nVar2 = wVar.I;
        int i14 = wVar.A;
        int G0 = G0(oVar, wVar);
        if (wVarArr.length == 1) {
            if (G0 != -1 && (E0 = E0(oVar, wVar)) != -1) {
                G0 = Math.min((int) (G0 * 1.5f), E0);
            }
            lVar = new l(i13, i14, G0);
            nVar = nVar2;
            i10 = i14;
        } else {
            int length = wVarArr.length;
            int i15 = i13;
            int i16 = i14;
            int i17 = 0;
            boolean z11 = false;
            while (i17 < length) {
                b2.w wVar2 = wVarArr[i17];
                b2.w[] wVarArr2 = wVarArr;
                if (nVar2 != null && wVar2.I == null) {
                    b2.v a2 = wVar2.a();
                    a2.H = nVar2;
                    wVar2 = new b2.w(a2);
                }
                i2.g b11 = oVar.b(wVar, wVar2);
                int i18 = length;
                int i19 = wVar2.A;
                if (b11.d != 0) {
                    int i20 = wVar2.z;
                    i12 = i17;
                    c10 = 65535;
                    z11 |= i20 == -1 || i19 == -1;
                    i15 = Math.max(i15, i20);
                    i16 = Math.max(i16, i19);
                    G0 = Math.max(G0, G0(oVar, wVar2));
                } else {
                    i12 = i17;
                    c10 = 65535;
                }
                length = i18;
                i17 = i12 + 1;
                wVarArr = wVarArr2;
            }
            if (z11) {
                e2.a.l("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + i15 + "x" + i16);
                boolean z12 = i14 > i13;
                int i21 = z12 ? i14 : i13;
                boolean z13 = z12;
                int i22 = z12 ? i13 : i14;
                float f11 = i22 / i21;
                int i23 = 0;
                while (true) {
                    nVar = nVar2;
                    if (i23 >= 9) {
                        break;
                    }
                    int i24 = S1[i23];
                    int i25 = i23;
                    int i26 = (int) (i24 * f11);
                    if (i24 <= i21 || i26 <= i22) {
                        break;
                    }
                    if (!z13) {
                        i26 = i24;
                    }
                    if (!z13) {
                        i24 = i26;
                    }
                    int i27 = i22;
                    MediaCodecInfo.CodecCapabilities codecCapabilities = oVar.d;
                    if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                        i11 = i21;
                        point = null;
                    } else {
                        int widthAlignment = videoCapabilities.getWidthAlignment();
                        i11 = i21;
                        int heightAlignment = videoCapabilities.getHeightAlignment();
                        point = new Point(e2.m0.g(i26, widthAlignment) * widthAlignment, e2.m0.g(i24, heightAlignment) * heightAlignment);
                    }
                    if (point != null) {
                        i10 = i14;
                        if (oVar.g(point.x, point.y, f10)) {
                            break;
                        }
                    } else {
                        i10 = i14;
                    }
                    i23 = i25 + 1;
                    i14 = i10;
                    nVar2 = nVar;
                    i22 = i27;
                    i21 = i11;
                }
                i10 = i14;
                point = null;
                if (point != null) {
                    i15 = Math.max(i15, point.x);
                    i16 = Math.max(i16, point.y);
                    b2.v a10 = wVar.a();
                    a10.y = i15;
                    a10.z = i16;
                    G0 = Math.max(G0, E0(oVar, new b2.w(a10)));
                    e2.a.l("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + i15 + "x" + i16);
                }
            } else {
                nVar = nVar2;
                i10 = i14;
            }
            lVar = new l(i15, i16, G0);
        }
        this.k1 = lVar;
        int i28 = this.K1 ? this.L1 : 0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i13);
        mediaFormat.setInteger("height", i10);
        e2.a.k(mediaFormat, wVar.v);
        if (f10 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f10);
        }
        e2.a.j(mediaFormat, "rotation-degrees", wVar.E);
        if (nVar != null) {
            b2.n nVar3 = nVar;
            e2.a.j(mediaFormat, "color-transfer", nVar3.c);
            e2.a.j(mediaFormat, "color-standard", nVar3.a);
            e2.a.j(mediaFormat, "color-range", nVar3.b);
            byte[] bArr = nVar3.d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(wVar.s) && (b10 = e2.g.b(wVar)) != null) {
            e2.a.j(mediaFormat, "profile", ((Integer) b10.first).intValue());
        }
        mediaFormat.setInteger("max-width", lVar.a);
        mediaFormat.setInteger("max-height", lVar.b);
        e2.a.j(mediaFormat, "max-input-size", lVar.c);
        mediaFormat.setInteger("priority", 0);
        if (f7 != -1.0f) {
            mediaFormat.setFloat("operating-rate", f7);
        }
        if (this.d1) {
            z10 = true;
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z10 = true;
        }
        if (i28 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z10);
            mediaFormat.setInteger("audio-session-id", i28);
        }
        if (Build.VERSION.SDK_INT >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.J1));
        }
        F(mediaFormat);
        Surface H0 = H0(oVar);
        if (this.n1 != null && !e2.m0.N(this.Z0)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        return new com.google.firebase.messaging.l(oVar, mediaFormat, wVar, H0, mediaCrypto, null);
    }

    public final void T0(long j10) {
        i2.f fVar = this.O0;
        fVar.k += j10;
        fVar.l++;
        this.E1 += j10;
        this.F1++;
    }

    @Override // r2.r
    public final void U(h2.h hVar) {
        if (this.m1) {
            ByteBuffer byteBuffer = hVar.f;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b10 = byteBuffer.get();
                short s10 = byteBuffer.getShort();
                short s11 = byteBuffer.getShort();
                byte b11 = byteBuffer.get();
                byte b12 = byteBuffer.get();
                byteBuffer.position(0);
                if (b10 == -75 && s10 == 60 && s11 == 1 && b11 == 4) {
                    if (b12 == 0 || b12 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        r2.l lVar = this.d0;
                        lVar.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        lVar.setParameters(bundle);
                    }
                }
            }
        }
    }

    @Override // r2.r
    public final boolean Z(b2.w wVar) {
        p0 p0Var = this.n1;
        if (p0Var == null || p0Var.v()) {
            return true;
        }
        try {
            return this.n1.d(wVar);
        } catch (o0 e) {
            throw d(e, wVar, false, 7000);
        }
    }

    @Override // r2.r
    public final void a0(Exception exc) {
        e2.a.d("MediaCodecVideoRenderer", "Video codec error", exc);
        n4.s sVar = this.b1;
        Handler handler = (Handler) sVar.b;
        if (handler != null) {
            handler.post(new a1.f(5, sVar, exc));
        }
    }

    @Override // r2.r
    public final void b0(long j10, long j11, String str) {
        String str2;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        n4.s sVar = this.b1;
        Handler handler = (Handler) sVar.b;
        if (handler != null) {
            str2 = str;
            handler.post(new h0(sVar, str2, j10, j11, 0));
        } else {
            str2 = str;
        }
        this.l1 = D0(str2);
        r2.o oVar = this.k0;
        oVar.getClass();
        boolean z10 = false;
        if (Build.VERSION.SDK_INT >= 29 && "video/x-vnd.on2.vp9".equals(oVar.b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = oVar.d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            int length = codecProfileLevelArr.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                if (codecProfileLevelArr[i10].profile == 16384) {
                    z10 = true;
                    break;
                }
                i10++;
            }
        }
        this.m1 = z10;
        L0();
    }

    @Override // r2.r, i2.b, i2.l1
    public final void c(int i10, Object obj) {
        if (i10 == 1) {
            N0(obj);
            return;
        }
        if (i10 == 7) {
            obj.getClass();
            y yVar = (y) obj;
            this.N1 = yVar;
            p0 p0Var = this.n1;
            if (p0Var != null) {
                p0Var.u(yVar);
                return;
            }
            return;
        }
        if (i10 == 10) {
            obj.getClass();
            int intValue = ((Integer) obj).intValue();
            if (this.L1 != intValue) {
                this.L1 = intValue;
                if (this.K1) {
                    n0();
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == 4) {
            obj.getClass();
            int intValue2 = ((Integer) obj).intValue();
            this.v1 = intValue2;
            r2.l lVar = this.d0;
            if (lVar != null) {
                lVar.j(intValue2);
                return;
            }
            return;
        }
        if (i10 == 5) {
            obj.getClass();
            int intValue3 = ((Integer) obj).intValue();
            this.w1 = intValue3;
            p0 p0Var2 = this.n1;
            if (p0Var2 != null) {
                p0Var2.j(intValue3);
                return;
            }
            f0 f0Var = this.e1.b;
            if (f0Var.j == intValue3) {
                return;
            }
            f0Var.j = intValue3;
            f0Var.d(true);
            return;
        }
        if (i10 == 13) {
            obj.getClass();
            List list = (List) obj;
            if (list.equals(y1.a)) {
                p0 p0Var3 = this.n1;
                if (p0Var3 == null || !p0Var3.v()) {
                    return;
                }
                this.n1.t();
                return;
            }
            this.q1 = list;
            p0 p0Var4 = this.n1;
            if (p0Var4 != null) {
                p0Var4.o(list);
                return;
            }
            return;
        }
        if (i10 == 14) {
            obj.getClass();
            e2.y yVar2 = (e2.y) obj;
            if (yVar2.a == 0 || yVar2.b == 0) {
                return;
            }
            this.t1 = yVar2;
            p0 p0Var5 = this.n1;
            if (p0Var5 != null) {
                Surface surface = this.r1;
                surface.getClass();
                p0Var5.s(surface, yVar2);
                return;
            }
            return;
        }
        switch (i10) {
            case 16:
                obj.getClass();
                this.J1 = ((Integer) obj).intValue();
                r2.l lVar2 = this.d0;
                if (lVar2 != null && Build.VERSION.SDK_INT >= 35) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("importance", Math.max(0, -this.J1));
                    lVar2.setParameters(bundle);
                    break;
                }
                break;
            case 17:
                Surface surface2 = this.r1;
                N0(null);
                obj.getClass();
                ((n) obj).c(1, surface2);
                break;
            case 18:
                boolean z10 = this.B1 != null;
                r1 r1Var = (r1) obj;
                this.B1 = r1Var;
                if (z10 != (r1Var != null)) {
                    A0(this.e0);
                    break;
                }
                break;
            default:
                super.c(i10, obj);
                break;
        }
    }

    @Override // r2.r
    public final void c0(i2.d dVar) {
        n4.s sVar = this.b1;
        Handler handler = (Handler) sVar.b;
        if (handler != null) {
            handler.post(new a1.f(3, sVar, dVar));
        }
    }

    @Override // r2.r
    public final void d0(String str) {
        n4.s sVar = this.b1;
        Handler handler = (Handler) sVar.b;
        if (handler != null) {
            handler.post(new a1.f(6, sVar, str));
        }
    }

    @Override // i2.b
    public final void e() {
        p0 p0Var = this.n1;
        if (p0Var == null) {
            a0 a0Var = this.e1;
            if (a0Var.e == 0) {
                a0Var.e = 1;
                return;
            }
            return;
        }
        int i10 = this.p1;
        if (i10 == 0 || i10 == 1) {
            this.p1 = 0;
        } else {
            p0Var.w();
        }
    }

    @Override // r2.r
    public final i2.g e0(qf.b bVar) {
        i2.g e02 = super.e0(bVar);
        b2.w wVar = (b2.w) bVar.c;
        wVar.getClass();
        n4.s sVar = this.b1;
        Handler handler = (Handler) sVar.b;
        if (handler != null) {
            handler.post(new l0(sVar, wVar, e02, 0));
        }
        b0 b0Var = this.i1;
        if (b0Var != null) {
            b0Var.b();
        }
        return e02;
    }

    @Override // r2.r
    public final void f0(b2.w wVar, MediaFormat mediaFormat) {
        int integer;
        int i10;
        r2.l lVar = this.d0;
        if (lVar != null) {
            lVar.j(this.v1);
        }
        if (this.K1) {
            i10 = wVar.z;
            integer = wVar.A;
        } else {
            mediaFormat.getClass();
            boolean z10 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            int integer2 = z10 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
            integer = z10 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
            i10 = integer2;
        }
        float f7 = wVar.F;
        int i11 = wVar.E;
        if (i11 == 90 || i11 == 270) {
            f7 = 1.0f / f7;
            int i12 = integer;
            integer = i10;
            i10 = i12;
        }
        this.H1 = new a2(f7, i10, integer);
        p0 p0Var = this.n1;
        if (p0Var == null || !this.Q1) {
            this.e1.f(wVar.D);
        } else {
            b2.v a2 = wVar.a();
            a2.y = i10;
            a2.z = integer;
            a2.E = f7;
            b2.w wVar2 = new b2.w(a2);
            int i13 = this.p1;
            List list = this.q1;
            if (list == null) {
                e9.l0 l0Var = e9.n0.b;
                list = x1.e;
            }
            p0Var.l(wVar2, this.P0.b, i13, list);
            this.p1 = 2;
        }
        this.Q1 = false;
    }

    @Override // r2.r
    public final void h0(long j10) {
        super.h0(j10);
        if (this.K1) {
            return;
        }
        this.A1--;
    }

    @Override // r2.r
    public final void i0() {
        p0 p0Var = this.n1;
        if (p0Var != null) {
            p0Var.i();
            if (this.O1 == -9223372036854775807L) {
                this.O1 = this.P0.b;
            }
            this.n1.h(-this.O1);
        } else {
            this.e1.e(2);
        }
        this.Q1 = true;
        L0();
    }

    @Override // i2.b
    public final String j() {
        return "MediaCodecVideoRenderer";
    }

    @Override // r2.r
    public final void j0(h2.h hVar) {
        ByteBuffer byteBuffer;
        n4.s sVar = this.g1;
        if (sVar != null) {
            r2.o oVar = this.k0;
            oVar.getClass();
            if (oVar.b.equals("video/av01") && hVar.isKeyFrame() && (byteBuffer = hVar.c) != null) {
                int position = byteBuffer.position();
                int limit = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit, position + 500));
                ByteBuffer byteBuffer2 = (ByteBuffer) sVar.b;
                byteBuffer2.clear();
                byteBuffer2.put(byteBuffer);
                byteBuffer2.flip();
                byteBuffer.position(position);
                byteBuffer.limit(limit);
            }
        }
        this.R1 = 0;
        int O = O(hVar);
        if ((Build.VERSION.SDK_INT < 34 || (O & 32) == 0) && !this.K1) {
            this.A1++;
        }
    }

    @Override // i2.b
    public final boolean l() {
        if (!this.K0) {
            return false;
        }
        p0 p0Var = this.n1;
        return p0Var == null || p0Var.b();
    }

    @Override // r2.r
    public final boolean l0(long j10, long j11, r2.l lVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, b2.w wVar) {
        int i13;
        lVar.getClass();
        long j13 = j12 - this.P0.c;
        int i14 = 0;
        while (true) {
            PriorityQueue priorityQueue = this.j1;
            Long l4 = (Long) priorityQueue.peek();
            if (l4 == null || l4.longValue() >= j12) {
                break;
            }
            i14++;
            priorityQueue.poll();
        }
        R0(i14, 0);
        p0 p0Var = this.n1;
        if (p0Var != null) {
            if (!z10 || z11) {
                return p0Var.n(j12, new j(this, lVar, i10, j13));
            }
            Q0(lVar, i10);
            return true;
        }
        int a2 = this.e1.a(j12, j10, j11, this.P0.b, z10, z11, this.f1);
        z zVar = this.f1;
        b0 b0Var = this.i1;
        if (b0Var != null && a2 != 5 && a2 != 4) {
            b0Var.a(j12, zVar.a);
        }
        if (a2 == 0) {
            this.h.getClass();
            long nanoTime = System.nanoTime();
            y yVar = this.N1;
            if (yVar != null) {
                yVar.b(j13, nanoTime, wVar, this.f0);
            }
            M0(lVar, i10, nanoTime);
            T0(zVar.a);
            return true;
        }
        if (a2 == 1) {
            long j14 = zVar.b;
            long j15 = zVar.a;
            if (j14 == this.G1) {
                Q0(lVar, i10);
            } else {
                y yVar2 = this.N1;
                if (yVar2 != null) {
                    i13 = i10;
                    yVar2.b(j13, j14, wVar, this.f0);
                } else {
                    i13 = i10;
                }
                M0(lVar, i13, j14);
            }
            T0(j15);
            this.G1 = j14;
            return true;
        }
        if (a2 == 2) {
            Trace.beginSection("dropVideoBuffer");
            lVar.c(i10);
            Trace.endSection();
            R0(0, 1);
            T0(zVar.a);
            return true;
        }
        if (a2 == 3) {
            Q0(lVar, i10);
            T0(zVar.a);
            return true;
        }
        if (a2 == 4 || a2 == 5) {
            return false;
        }
        throw new IllegalStateException(String.valueOf(a2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
    
        if (android.os.SystemClock.elapsedRealtime() < r7.t0) goto L18;
     */
    @Override // i2.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m() {
        boolean f7;
        boolean z10 = false;
        if (this.U != null) {
            if (k()) {
                f7 = this.y;
            } else {
                e1 e1Var = this.r;
                e1Var.getClass();
                f7 = e1Var.f();
            }
            if (!f7) {
                if (!(this.v0 >= 0)) {
                    if (this.t0 != -9223372036854775807L) {
                        this.h.getClass();
                    }
                }
            }
            z10 = true;
        }
        p0 p0Var = this.n1;
        if (p0Var != null) {
            return p0Var.r(z10);
        }
        if (z10 && (this.d0 == null || this.K1)) {
            return true;
        }
        return this.e1.b(z10);
    }

    @Override // r2.r, i2.b
    public final void n() {
        n4.s sVar = this.b1;
        this.I1 = null;
        this.P1 = -9223372036854775807L;
        L0();
        this.u1 = false;
        this.M1 = null;
        this.D1 = true;
        try {
            super.n();
        } finally {
            sVar.s(this.O0);
            sVar.I(a2.d);
        }
    }

    @Override // i2.b
    public final void o(boolean z10, boolean z11) {
        p0 p0Var;
        this.O0 = new i2.f();
        p1 p1Var = this.d;
        p1Var.getClass();
        boolean z12 = p1Var.b;
        u6.p((z12 && this.L1 == 0) ? false : true);
        if (this.K1 != z12) {
            this.K1 = z12;
            n0();
        }
        i2.f fVar = this.O0;
        n4.s sVar = this.b1;
        Handler handler = (Handler) sVar.b;
        if (handler != null) {
            handler.post(new k0(sVar, fVar, 0));
        }
        boolean z13 = this.o1;
        a0 a0Var = this.e1;
        if (!z13) {
            if (this.q1 != null && this.n1 == null) {
                q qVar = new q(this.Z0, a0Var);
                qVar.d = true;
                long j10 = this.h1;
                qVar.g = j10 != -9223372036854775807L ? -j10 : -9223372036854775807L;
                e2.g0 g0Var = this.h;
                g0Var.getClass();
                qVar.e = g0Var;
                u6.p(!qVar.f);
                if (qVar.c == null) {
                    qVar.c = new u();
                }
                w wVar = new w(qVar);
                qVar.f = true;
                if (1 >= wVar.p) {
                    wVar.p = 1;
                }
                SparseArray sparseArray = wVar.c;
                if (e2.m0.k(sparseArray, 0)) {
                    p0Var = (p0) sparseArray.get(0);
                } else {
                    r rVar = new r(wVar, wVar.a);
                    wVar.g.add(rVar);
                    sparseArray.put(0, rVar);
                    p0Var = rVar;
                }
                this.n1 = p0Var;
            }
            this.o1 = true;
        }
        p0 p0Var2 = this.n1;
        if (p0Var2 == null) {
            e2.g0 g0Var2 = this.h;
            g0Var2.getClass();
            a0Var.l = g0Var2;
            a0Var.e(!z11 ? 1 : 0);
            return;
        }
        p0Var2.g(new a6.i(this, 1));
        y yVar = this.N1;
        if (yVar != null) {
            this.n1.u(yVar);
        }
        if (this.r1 != null && !this.t1.equals(e2.y.c)) {
            this.n1.s(this.r1, this.t1);
        }
        this.n1.j(this.w1);
        this.n1.a(this.b0);
        List list = this.q1;
        if (list != null) {
            this.n1.o(list);
        }
        this.p1 = !z11 ? 1 : 0;
        this.S0 = true;
    }

    @Override // r2.r
    public final void o0() {
        p0 p0Var = this.n1;
        if (p0Var != null) {
            p0Var.i();
        } else {
            long j10 = this.P0.f;
        }
    }

    @Override // r2.r, i2.b
    public final void p(long j10, boolean z10, boolean z11) {
        p0 p0Var = this.n1;
        if (p0Var != null && !z10) {
            p0Var.m(true);
        }
        if (z11) {
            this.C1 = j10;
        }
        super.p(j10, z10, z11);
        p0 p0Var2 = this.n1;
        a0 a0Var = this.e1;
        if (p0Var2 == null) {
            a0Var.b.b();
            a0Var.h = -9223372036854775807L;
            a0Var.f = -9223372036854775807L;
            a0Var.e = Math.min(a0Var.e, 1);
            a0Var.i = -9223372036854775807L;
            a0Var.n = false;
        }
        b0 b0Var = this.i1;
        if (b0Var != null) {
            b0Var.b();
        }
        if (z10) {
            p0 p0Var3 = this.n1;
            if (p0Var3 != null) {
                p0Var3.q(false);
            } else {
                a0Var.c(false);
            }
        }
        L0();
        this.z1 = 0;
    }

    @Override // i2.b
    public final void q() {
        p0 p0Var = this.n1;
        if (p0Var == null || !this.a1) {
            return;
        }
        p0Var.release();
    }

    @Override // r2.r
    public final void q0() {
        super.q0();
        this.j1.clear();
        this.A1 = 0;
        this.R1 = 0;
        this.D1 = false;
        n4.s sVar = this.g1;
        if (sVar != null) {
            sVar.c = null;
            ByteBuffer byteBuffer = (ByteBuffer) sVar.b;
            byteBuffer.position(byteBuffer.limit());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // i2.b
    public final void r() {
        try {
            try {
                this.y0 = false;
                p0();
                n0();
            } finally {
                i2.e.D(this.X, null);
                this.X = null;
            }
        } finally {
            this.o1 = false;
            this.O1 = -9223372036854775807L;
            p pVar = this.s1;
            if (pVar != null) {
                pVar.release();
                this.s1 = null;
            }
        }
    }

    @Override // i2.b
    public final void s() {
        this.y1 = 0;
        this.h.getClass();
        this.x1 = SystemClock.elapsedRealtime();
        this.E1 = 0L;
        this.F1 = 0;
        p0 p0Var = this.n1;
        if (p0Var != null) {
            p0Var.f();
        } else {
            this.e1.d();
        }
    }

    @Override // i2.b
    public final void t() {
        K0();
        int i10 = this.F1;
        if (i10 != 0) {
            long j10 = this.E1;
            n4.s sVar = this.b1;
            Handler handler = (Handler) sVar.b;
            if (handler != null) {
                handler.post(new j0(sVar, j10, i10));
            }
            this.E1 = 0L;
            this.F1 = 0;
        }
        p0 p0Var = this.n1;
        if (p0Var != null) {
            p0Var.e();
        } else {
            a0 a0Var = this.e1;
            a0Var.d = false;
            a0Var.i = -9223372036854775807L;
            f0 f0Var = a0Var.b;
            f0Var.d = false;
            c0 c0Var = f0Var.c;
            if (c0Var != null) {
                c0Var.b();
            }
            f0Var.a();
        }
        b0 b0Var = this.i1;
        if (b0Var != null) {
            b0Var.b();
        }
    }

    @Override // r2.r, i2.b
    public final void u(b2.w[] wVarArr, long j10, long j11, u2.g0 g0Var) {
        super.u(wVarArr, j10, j11, g0Var);
        S0(g0Var);
        b0 b0Var = this.i1;
        if (b0Var != null) {
            b0Var.b();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f1, code lost:
    
        if ((r7 + 1) < 8) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f4, code lost:
    
        if (r7 < 0) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00f6, code lost:
    
        r2 = ((f2.s) r3.get(r7)).b.limit();
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0103, code lost:
    
        r2 = r5.position();
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0054  */
    @Override // r2.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean u0(h2.h hVar) {
        boolean z10;
        ByteBuffer byteBuffer;
        f2.t tVar;
        bi.a aVar;
        boolean z11 = false;
        if (!J0(hVar)) {
            boolean z12 = hVar.e < this.w;
            b0 b0Var = this.i1;
            if (b0Var != null) {
                long j10 = b0Var.a == -9223372036854775807L ? -9223372036854775807L : (long) (((r2 - r6) * b0Var.c) + b0Var.b);
                if (j10 != -9223372036854775807L && j10 < this.h1) {
                    z10 = true;
                    if ((!z12 || z10) && !hVar.hasSupplementalData()) {
                        if (hVar.notDependedOn()) {
                            n4.s sVar = this.g1;
                            if (sVar != null) {
                                ByteBuffer byteBuffer2 = (ByteBuffer) sVar.b;
                                r2.o oVar = this.k0;
                                oVar.getClass();
                                if (oVar.b.equals("video/av01") && (byteBuffer = hVar.c) != null) {
                                    boolean z13 = z12 || this.R1 <= 0;
                                    ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                                    asReadOnlyBuffer.flip();
                                    if (byteBuffer2.hasRemaining()) {
                                        sVar.H(f2.q.o(byteBuffer2));
                                        byteBuffer2.position(byteBuffer2.limit());
                                    }
                                    ArrayList o10 = f2.q.o(asReadOnlyBuffer);
                                    sVar.H(o10);
                                    int size = o10.size() - 1;
                                    int i10 = 0;
                                    while (size >= 0) {
                                        f2.s sVar2 = (f2.s) o10.get(size);
                                        int i11 = sVar2.a;
                                        if (i11 != 2 && i11 != 15) {
                                            if ((i11 == 3 && !z13) || ((i11 != 6 && i11 != 3) || (tVar = (f2.t) sVar.c) == null)) {
                                                break;
                                            }
                                            try {
                                                aVar = new bi.a(tVar, sVar2);
                                            } catch (f2.r unused) {
                                                aVar = null;
                                            }
                                            if (aVar != null) {
                                                if (aVar.a) {
                                                    break;
                                                }
                                            } else {
                                                break;
                                            }
                                        }
                                        if (((f2.s) o10.get(size)).a == 6 || ((f2.s) o10.get(size)).a == 3) {
                                            i10++;
                                        }
                                        size--;
                                    }
                                    int limit = asReadOnlyBuffer.limit();
                                    if (limit == 0) {
                                        hVar.clear();
                                    } else if (limit != asReadOnlyBuffer.limit()) {
                                        l lVar = this.k1;
                                        lVar.getClass();
                                        if (lVar.c + limit < asReadOnlyBuffer.capacity() && !hVar.getFlag(TLObject.FLAG_30)) {
                                            ByteBuffer byteBuffer3 = hVar.c;
                                            byteBuffer3.getClass();
                                            byteBuffer3.position(limit);
                                        }
                                    }
                                }
                            }
                            if (z11) {
                                if (z12) {
                                    this.O0.d++;
                                } else {
                                    this.j1.add(Long.valueOf(hVar.e));
                                    this.R1++;
                                }
                            }
                            return z11;
                        }
                        hVar.clear();
                        z11 = true;
                        if (z11) {
                        }
                        return z11;
                    }
                }
            }
            z10 = false;
            if (!z12) {
            }
            if (hVar.notDependedOn()) {
            }
            z11 = true;
            if (z11) {
            }
            return z11;
        }
        return false;
    }

    @Override // i2.b
    public final void v() {
        u2.g0 g0Var = this.G;
        if (g0Var != null) {
            S0(g0Var);
        }
    }

    @Override // r2.r
    public final boolean v0() {
        boolean z10;
        b2.w wVar = this.e0;
        long j10 = this.P1;
        if (j10 != -9223372036854775807L) {
            if (this.U0 + 1 + j10 <= Long.MAX_VALUE - (this.P0.c + j10)) {
                z10 = false;
                return this.B1 == null || this.D1 || this.K1 || (wVar != null && wVar.u > 0) || z10 || this.P0.f != -9223372036854775807L;
            }
        }
        z10 = true;
        if (this.B1 == null) {
        }
    }

    @Override // r2.r
    public final boolean w0(r2.o oVar) {
        return I0(oVar);
    }

    @Override // r2.r, i2.b
    public final void x(long j10, long j11) {
        p0 p0Var = this.n1;
        if (p0Var != null) {
            try {
                p0Var.p(j10, j11);
            } catch (o0 e) {
                throw d(e, e.a, false, 7001);
            }
        }
        super.x(j10, j11);
    }

    @Override // r2.r
    public final boolean x0() {
        r2.o oVar = this.k0;
        if (this.n1 != null && oVar != null) {
            String str = oVar.a;
            if (str.equals("c2.mtk.avc.decoder") || str.equals("c2.mtk.hevc.decoder")) {
                return true;
            }
        }
        return super.x0();
    }

    @Override // r2.r
    public final int z0(r2.i iVar, b2.w wVar) {
        boolean z10;
        int i10 = 0;
        if (!v0.m(wVar.s)) {
            return i2.e.c(0, 0, 0, 0);
        }
        boolean z11 = wVar.w != null;
        Context context = this.Z0;
        List F0 = F0(context, iVar, wVar, z11, false);
        if (z11 && F0.isEmpty()) {
            F0 = F0(context, iVar, wVar, false, false);
        }
        if (F0.isEmpty()) {
            return i2.e.c(1, 0, 0, 0);
        }
        int i11 = wVar.T;
        if (i11 != 0 && i11 != 2) {
            return i2.e.c(2, 0, 0, 0);
        }
        r2.o oVar = (r2.o) F0.get(0);
        boolean e = oVar.e(context, wVar);
        if (!e) {
            for (int i12 = 1; i12 < F0.size(); i12++) {
                r2.o oVar2 = (r2.o) F0.get(i12);
                if (oVar2.e(context, wVar)) {
                    z10 = false;
                    e = true;
                    oVar = oVar2;
                    break;
                }
            }
        }
        z10 = true;
        int i13 = 3;
        int i14 = 4;
        int i15 = e ? 4 : 3;
        int i16 = oVar.f(wVar) ? 16 : 8;
        int i17 = oVar.g ? 64 : 0;
        int i18 = z10 ? 128 : 0;
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(wVar.s) && !c2.i.d(context)) {
            i18 = 256;
        }
        if (e) {
            List F02 = F0(context, iVar, wVar, z11, true);
            if (!F02.isEmpty()) {
                HashMap hashMap = r2.w.a;
                ArrayList arrayList = new ArrayList(F02);
                Collections.sort(arrayList, new u5(new org.telegram.ui.web.m(i13, context, wVar), i14));
                r2.o oVar3 = (r2.o) arrayList.get(0);
                if (oVar3.e(context, wVar) && oVar3.f(wVar)) {
                    i10 = 32;
                }
            }
        }
        return i15 | i16 | i10 | i17 | i18;
    }
}
