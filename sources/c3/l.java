package c3;

import ai.k3;
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
import b8.zb;
import ci.y4;
import d2.a2;
import d2.k1;
import d2.n1;
import d2.u0;
import d2.y1;
import g2.n0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;
import k2.p1;
import k2.q1;
import k2.s1;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.na1;
import w2.d1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class l extends t2.r {
    public static final int[] T1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    public static boolean U1;
    public static boolean V1;
    public int A1;
    public int B1;
    public s1 C1;
    public long D1;
    public boolean E1;
    public long F1;
    public int G1;
    public long H1;
    public a2 I1;
    public a2 J1;
    public int K1;
    public boolean L1;
    public int M1;
    public k N1;
    public w O1;
    public long P1;
    public long Q1;
    public boolean R1;
    public int S1;
    public final Context a1;
    public final boolean b1;
    public final tf.b c1;
    public final int d1;
    public final boolean e1;
    public final y f1;
    public final x g1;
    public final tf.b h1;
    public final long i1;
    public final z j1;
    public final PriorityQueue k1;
    public a7.d l1;
    public boolean m1;
    public boolean n1;
    public l0 o1;
    public boolean p1;
    public int q1;
    public List r1;
    public Surface s1;
    public n t1;
    public g2.z u1;
    public boolean v1;
    public int w1;
    public int x1;
    public long y1;
    public int z1;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public l(j jVar) {
        super(r0.getApplicationContext(), 2, jVar.c, 30.0f);
        Context context = jVar.a;
        Context applicationContext = context.getApplicationContext();
        this.a1 = applicationContext;
        this.d1 = jVar.g;
        this.o1 = null;
        this.c1 = new tf.b(jVar.e, (i0) jVar.f);
        this.b1 = this.o1 == null;
        this.f1 = new y(applicationContext, this, jVar.d);
        this.g1 = new x();
        this.e1 = "NVIDIA".equals(Build.MANUFACTURER);
        this.u1 = g2.z.c;
        this.w1 = 1;
        this.x1 = 0;
        this.I1 = a2.d;
        this.M1 = 0;
        this.J1 = null;
        this.K1 = -1000;
        this.P1 = -9223372036854775807L;
        this.Q1 = -9223372036854775807L;
        this.h1 = new tf.b(7);
        this.k1 = new PriorityQueue();
        this.i1 = -15000L;
        this.j1 = new z();
        this.C1 = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x0736, code lost:
    
        if (r0.equals("ELUGA_Ray_X") == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x08b7, code lost:
    
        if (r13.equals("JSN-L21") == false) goto L664;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008b A[FALL_THROUGH] */
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
        synchronized (l.class) {
            try {
                if (!U1) {
                    int i3 = Build.VERSION.SDK_INT;
                    char c2 = 28;
                    if (i3 <= 28) {
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
                        V1 = z12;
                        U1 = true;
                    }
                    if (i3 > 27 || !"HWEML".equals(Build.DEVICE)) {
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
                                if (i3 <= 26) {
                                    String str4 = Build.DEVICE;
                                    str4.getClass();
                                    switch (str4.hashCode()) {
                                        case -2144781245:
                                            if (str4.equals("GIONEE_SWW1609")) {
                                                c2 = 0;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case -2144781185:
                                            if (str4.equals("GIONEE_SWW1627")) {
                                                c2 = 1;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case -2144781160:
                                            if (str4.equals("GIONEE_SWW1631")) {
                                                c2 = 2;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case -2097309513:
                                            if (str4.equals("K50a40")) {
                                                c2 = 3;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case -2022874474:
                                            if (str4.equals("CP8676_I02")) {
                                                c2 = 4;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case -1978993182:
                                            if (str4.equals("NX541J")) {
                                                c2 = 5;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case -1978990237:
                                            if (str4.equals("NX573J")) {
                                                c2 = 6;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case -1936688988:
                                            if (str4.equals("PGN528")) {
                                                c2 = 7;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case -1936688066:
                                            if (str4.equals("PGN610")) {
                                                c2 = '\b';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case -1936688065:
                                            if (str4.equals("PGN611")) {
                                                c2 = '\t';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case -1931988508:
                                            if (str4.equals("AquaPowerM")) {
                                                c2 = '\n';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case -1885099851:
                                            if (str4.equals("RAIJIN")) {
                                                c2 = 11;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case -1696512866:
                                            if (str4.equals("XT1663")) {
                                                c2 = '\f';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case -1680025915:
                                            if (str4.equals("ComioS1")) {
                                                c2 = '\r';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case -1615810839:
                                            if (str4.equals("Phantom6")) {
                                                c2 = 14;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case -1600724499:
                                            if (str4.equals("pacificrim")) {
                                                c2 = 15;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case -1554255044:
                                            if (str4.equals("vernee_M5")) {
                                                c2 = 16;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case -1481772737:
                                            if (str4.equals("panell_dl")) {
                                                c2 = 17;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case -1481772730:
                                            if (str4.equals("panell_ds")) {
                                                c2 = 18;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case -1481772729:
                                            if (str4.equals("panell_dt")) {
                                                c2 = 19;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case -1320080169:
                                            if (str4.equals("GiONEE_GBL7319")) {
                                                c2 = 20;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case -1217592143:
                                            if (str4.equals("BRAVIA_ATV2")) {
                                                c2 = 21;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case -1180384755:
                                            if (str4.equals("iris60")) {
                                                c2 = 22;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case -1139198265:
                                            if (str4.equals("Slate_Pro")) {
                                                c2 = 23;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case -1052835013:
                                            if (str4.equals("namath")) {
                                                c2 = 24;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case -993250464:
                                            if (str4.equals("A10-70F")) {
                                                c2 = 25;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case -993250458:
                                            if (str4.equals("A10-70L")) {
                                                c2 = 26;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case -965403638:
                                            if (str4.equals("s905x018")) {
                                                c2 = 27;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case -958336948:
                                            break;
                                        case -879245230:
                                            if (str4.equals("tcl_eu")) {
                                                c2 = 29;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case -842500323:
                                            if (str4.equals("nicklaus_f")) {
                                                c2 = 30;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case -821392978:
                                            if (str4.equals("A7000-a")) {
                                                c2 = 31;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case -797483286:
                                            if (str4.equals("SVP-DTV15")) {
                                                c2 = ' ';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case -794946968:
                                            if (str4.equals("watson")) {
                                                c2 = '!';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case -788334647:
                                            if (str4.equals("whyred")) {
                                                c2 = '\"';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case -782144577:
                                            if (str4.equals("OnePlus5T")) {
                                                c2 = '#';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case -575125681:
                                            if (str4.equals("GiONEE_CBL7513")) {
                                                c2 = '$';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case -521118391:
                                            if (str4.equals("GIONEE_GBL7360")) {
                                                c2 = '%';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case -430914369:
                                            if (str4.equals("Pixi4-7_3G")) {
                                                c2 = '&';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case -290434366:
                                            if (str4.equals("taido_row")) {
                                                c2 = '\'';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case -282781963:
                                            if (str4.equals("BLACK-1X")) {
                                                c2 = '(';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case -277133239:
                                            if (str4.equals("Z12_PRO")) {
                                                c2 = ')';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case -173639913:
                                            if (str4.equals("ELUGA_A3_Pro")) {
                                                c2 = '*';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case -56598463:
                                            if (str4.equals("woods_fn")) {
                                                c2 = '+';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 2126:
                                            if (str4.equals("C1")) {
                                                c2 = ',';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 2564:
                                            if (str4.equals("Q5")) {
                                                c2 = '-';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 2715:
                                            if (str4.equals("V1")) {
                                                c2 = '.';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 2719:
                                            if (str4.equals("V5")) {
                                                c2 = '/';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 3091:
                                            if (str4.equals("b5")) {
                                                c2 = '0';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 3483:
                                            if (str4.equals("mh")) {
                                                c2 = '1';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 73405:
                                            if (str4.equals("JGZ")) {
                                                c2 = '2';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 75537:
                                            if (str4.equals("M04")) {
                                                c2 = '3';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 75739:
                                            if (str4.equals("M5c")) {
                                                c2 = '4';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 76779:
                                            if (str4.equals("MX6")) {
                                                c2 = '5';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 78669:
                                            if (str4.equals("P85")) {
                                                c2 = '6';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 79305:
                                            if (str4.equals("PLE")) {
                                                c2 = '7';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 80618:
                                            if (str4.equals("QX1")) {
                                                c2 = '8';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 88274:
                                            if (str4.equals("Z80")) {
                                                c2 = '9';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 98846:
                                            if (str4.equals("cv1")) {
                                                c2 = ':';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 98848:
                                            if (str4.equals("cv3")) {
                                                c2 = ';';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 99329:
                                            if (str4.equals("deb")) {
                                                c2 = '<';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 101481:
                                            if (str4.equals("flo")) {
                                                c2 = '=';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 1513190:
                                            if (str4.equals("1601")) {
                                                c2 = '>';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 1514184:
                                            if (str4.equals("1713")) {
                                                c2 = '?';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 1514185:
                                            if (str4.equals("1714")) {
                                                c2 = '@';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 2133089:
                                            if (str4.equals("F01H")) {
                                                c2 = 'A';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 2133091:
                                            if (str4.equals("F01J")) {
                                                c2 = 'B';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 2133120:
                                            if (str4.equals("F02H")) {
                                                c2 = 'C';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 2133151:
                                            if (str4.equals("F03H")) {
                                                c2 = 'D';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 2133182:
                                            if (str4.equals("F04H")) {
                                                c2 = 'E';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 2133184:
                                            if (str4.equals("F04J")) {
                                                c2 = 'F';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 2436959:
                                            if (str4.equals("P681")) {
                                                c2 = 'G';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 2463773:
                                            if (str4.equals("Q350")) {
                                                c2 = 'H';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 2464648:
                                            if (str4.equals("Q427")) {
                                                c2 = 'I';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 2689555:
                                            if (str4.equals("XE2X")) {
                                                c2 = 'J';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 3154429:
                                            if (str4.equals("fugu")) {
                                                c2 = 'K';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 3284551:
                                            if (str4.equals("kate")) {
                                                c2 = 'L';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 3351335:
                                            if (str4.equals("mido")) {
                                                c2 = 'M';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 3386211:
                                            if (str4.equals("p212")) {
                                                c2 = 'N';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 41325051:
                                            if (str4.equals("MEIZU_M5")) {
                                                c2 = 'O';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 51349633:
                                            if (str4.equals("601LV")) {
                                                c2 = 'P';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 51350594:
                                            if (str4.equals("602LV")) {
                                                c2 = 'Q';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 55178625:
                                            if (str4.equals("Aura_Note_2")) {
                                                c2 = 'R';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 61542055:
                                            if (str4.equals("A1601")) {
                                                c2 = 'S';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 65355429:
                                            if (str4.equals("E5643")) {
                                                c2 = 'T';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 66214468:
                                            if (str4.equals("F3111")) {
                                                c2 = 'U';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 66214470:
                                            if (str4.equals("F3113")) {
                                                c2 = 'V';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 66214473:
                                            if (str4.equals("F3116")) {
                                                c2 = 'W';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 66215429:
                                            if (str4.equals("F3211")) {
                                                c2 = 'X';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 66215431:
                                            if (str4.equals("F3213")) {
                                                c2 = 'Y';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 66215433:
                                            if (str4.equals("F3215")) {
                                                c2 = 'Z';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 66216390:
                                            if (str4.equals("F3311")) {
                                                c2 = '[';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 76402249:
                                            if (str4.equals("PRO7S")) {
                                                c2 = '\\';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 76404105:
                                            if (str4.equals("Q4260")) {
                                                c2 = ']';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 76404911:
                                            if (str4.equals("Q4310")) {
                                                c2 = '^';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 80963634:
                                            if (str4.equals("V23GB")) {
                                                c2 = '_';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 82882791:
                                            if (str4.equals("X3_HK")) {
                                                c2 = '`';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 98715550:
                                            if (str4.equals("i9031")) {
                                                c2 = 'a';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 101370885:
                                            if (str4.equals("l5460")) {
                                                c2 = 'b';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 102844228:
                                            if (str4.equals("le_x6")) {
                                                c2 = 'c';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 165221241:
                                            if (str4.equals("A2016a40")) {
                                                c2 = 'd';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 182191441:
                                            if (str4.equals("CPY83_I00")) {
                                                c2 = 'e';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 245388979:
                                            if (str4.equals("marino_f")) {
                                                c2 = 'f';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 287431619:
                                            if (str4.equals("griffin")) {
                                                c2 = 'g';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 307593612:
                                            if (str4.equals("A7010a48")) {
                                                c2 = 'h';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 308517133:
                                            if (str4.equals("A7020a48")) {
                                                c2 = 'i';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 316215098:
                                            if (str4.equals("TB3-730F")) {
                                                c2 = 'j';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 316215116:
                                            if (str4.equals("TB3-730X")) {
                                                c2 = 'k';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 316246811:
                                            if (str4.equals("TB3-850F")) {
                                                c2 = 'l';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 316246818:
                                            if (str4.equals("TB3-850M")) {
                                                c2 = 'm';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 407160593:
                                            if (str4.equals("Pixi5-10_4G")) {
                                                c2 = 'n';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 507412548:
                                            if (str4.equals("QM16XE_U")) {
                                                c2 = 'o';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 793982701:
                                            if (str4.equals("GIONEE_WBL5708")) {
                                                c2 = 'p';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 794038622:
                                            if (str4.equals("GIONEE_WBL7365")) {
                                                c2 = 'q';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 794040393:
                                            if (str4.equals("GIONEE_WBL7519")) {
                                                c2 = 'r';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 835649806:
                                            if (str4.equals("manning")) {
                                                c2 = 's';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 917340916:
                                            if (str4.equals("A7000plus")) {
                                                c2 = 't';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 958008161:
                                            if (str4.equals("j2xlteins")) {
                                                c2 = 'u';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 1060579533:
                                            if (str4.equals("panell_d")) {
                                                c2 = 'v';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 1150207623:
                                            if (str4.equals("LS-5017")) {
                                                c2 = 'w';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 1176899427:
                                            if (str4.equals("itel_S41")) {
                                                c2 = 'x';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 1280332038:
                                            if (str4.equals("hwALE-H")) {
                                                c2 = 'y';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 1306947716:
                                            if (str4.equals("EverStar_S")) {
                                                c2 = 'z';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 1349174697:
                                            if (str4.equals("htc_e56ml_dtul")) {
                                                c2 = '{';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 1522194893:
                                            if (str4.equals("woods_f")) {
                                                c2 = '|';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 1691543273:
                                            if (str4.equals("CPH1609")) {
                                                c2 = '}';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 1691544261:
                                            if (str4.equals("CPH1715")) {
                                                c2 = '~';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 1709443163:
                                            if (str4.equals("iball8735_9806")) {
                                                c2 = 127;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 1865889110:
                                            if (str4.equals("santoni")) {
                                                c2 = 128;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 1906253259:
                                            if (str4.equals("PB2-670M")) {
                                                c2 = 129;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 1977196784:
                                            if (str4.equals("Infinix-X572")) {
                                                c2 = 130;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 2006372676:
                                            if (str4.equals("BRAVIA_ATV3_4K")) {
                                                c2 = 131;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 2019281702:
                                            if (str4.equals("DM-01K")) {
                                                c2 = 132;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 2029784656:
                                            if (str4.equals("HWBLN-H")) {
                                                c2 = 133;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 2030379515:
                                            if (str4.equals("HWCAM-H")) {
                                                c2 = 134;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 2033393791:
                                            if (str4.equals("ASUS_X00AD_2")) {
                                                c2 = 135;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 2047190025:
                                            if (str4.equals("ELUGA_Note")) {
                                                c2 = 136;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 2047252157:
                                            if (str4.equals("ELUGA_Prim")) {
                                                c2 = 137;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 2048319463:
                                            if (str4.equals("HWVNS-H")) {
                                                c2 = 138;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 2048855701:
                                            if (str4.equals("HWWAS-H")) {
                                                c2 = 139;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        default:
                                            c2 = 65535;
                                            break;
                                    }
                                    switch (c2) {
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
                        V1 = z12;
                        U1 = true;
                    }
                    z12 = true;
                    V1 = z12;
                    U1 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return V1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0082, code lost:
    
        if (r3.equals("video/av01") == false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int E0(t2.o oVar, d2.v vVar) {
        int i3 = vVar.z;
        int i10 = vVar.A;
        if (i3 != -1 && i10 != -1) {
            String str = vVar.s;
            str.getClass();
            char c2 = 1;
            if ("video/dolby-vision".equals(str)) {
                Pair b10 = g2.h.b(vVar);
                if (b10 != null) {
                    int intValue = ((Integer) b10.first).intValue();
                    if (intValue == 512 || intValue == 1 || intValue == 2) {
                        str = "video/avc";
                    } else if (intValue == 1024) {
                        str = "video/av01";
                    }
                }
                str = "video/hevc";
            }
            switch (str.hashCode()) {
                case -1664118616:
                    if (str.equals("video/3gpp")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1662735862:
                    break;
                case -1662541442:
                    if (str.equals("video/hevc")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1187890754:
                    if (str.equals("video/mp4v-es")) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1331836730:
                    if (str.equals("video/avc")) {
                        c2 = 4;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1599127256:
                    if (str.equals("video/x-vnd.on2.vp8")) {
                        c2 = 5;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1599127257:
                    if (str.equals("video/x-vnd.on2.vp9")) {
                        c2 = 6;
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    c2 = 65535;
                    break;
            }
            switch (c2) {
                case 0:
                case 1:
                case 3:
                case 5:
                    return ((i3 * i10) * 3) / 4;
                case 2:
                    return Math.max(TLObject.FLAG_21, ((i3 * i10) * 3) / 4);
                case 4:
                    String str2 = Build.MODEL;
                    if (!"BRAVIA 4K 2015".equals(str2) && (!"Amazon".equals(Build.MANUFACTURER) || (!"KFSOWI".equals(str2) && (!"AFTS".equals(str2) || !oVar.f)))) {
                        return ((n0.g(i10, 16) * n0.g(i3, 16)) * 768) / 4;
                    }
                    break;
                case 6:
                    return ((i3 * i10) * 3) / 8;
            }
        }
        return -1;
    }

    public static List F0(Context context, t2.i iVar, d2.v vVar, boolean z10, boolean z11) {
        String str = vVar.s;
        if (str == null) {
            return g9.s1.e;
        }
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(str) && !e2.h.d(context)) {
            String c2 = t2.w.c(vVar);
            List b10 = c2 == null ? g9.s1.e : iVar.b(c2, z10, z11);
            if (!b10.isEmpty()) {
                return b10;
            }
        }
        return t2.w.g(iVar, vVar, z10, z11);
    }

    public static int G0(t2.o oVar, d2.v vVar) {
        int i3 = vVar.t;
        List list = vVar.v;
        if (i3 == -1) {
            return E0(oVar, vVar);
        }
        int size = list.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += ((byte[]) list.get(i11)).length;
        }
        return vVar.t + i10;
    }

    @Override // t2.r, k2.b
    public final void A(float f10, float f11) {
        super.A(f10, f11);
        l0 l0Var = this.o1;
        if (l0Var != null) {
            l0Var.b(f10);
        } else {
            this.f1.h(f10);
        }
        z zVar = this.j1;
        if (zVar != null) {
            zVar.c(f10);
        }
    }

    @Override // k2.b
    public final boolean E(long j10) {
        if (this.J0 == -9223372036854775807L || j10 < this.D1) {
            return false;
        }
        long j11 = this.R0;
        return j11 == -9223372036854775807L || j10 > j11;
    }

    @Override // t2.r
    public final k2.e H(t2.o oVar, d2.v vVar, d2.v vVar2, boolean z10) {
        int i3;
        k2.e b10 = oVar.b(vVar, vVar2);
        float f10 = vVar.D;
        float f11 = vVar2.D;
        int i10 = b10.e;
        a7.d dVar = this.l1;
        dVar.getClass();
        if (vVar2.z > dVar.a || vVar2.A > dVar.b) {
            i10 |= 256;
        }
        if (G0(oVar, vVar2) > dVar.c) {
            i10 |= 64;
        }
        if (this.x1 != Integer.MIN_VALUE && (i3 = Build.VERSION.SDK_INT) < 31 && ((i3 != 30 || Build.MODEL.startsWith("MiTV")) && f10 != -1.0f && f11 != -1.0f && (!oVar.f || !z10))) {
            if (Math.abs((Math.max(f11, f10) / Math.min(f11, f10)) - Math.round(r14)) > 0.01f) {
                i10 |= 65536;
            }
        }
        int i11 = i10;
        return new k2.e(oVar.a, vVar, vVar2, i11 != 0 ? 0 : b10.d, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0070 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Surface H0(t2.o oVar) {
        boolean z10;
        m mVar;
        l0 l0Var = this.o1;
        if (l0Var != null) {
            return l0Var.c();
        }
        Surface surface = this.s1;
        if (surface != null) {
            return surface;
        }
        if (Build.VERSION.SDK_INT >= 35 && oVar.h) {
            return null;
        }
        zb.p(P0(oVar));
        n nVar = this.t1;
        if (nVar != null && nVar.a != oVar.f && nVar != null) {
            nVar.release();
            this.t1 = null;
        }
        if (this.t1 == null) {
            Context context = this.a1;
            boolean z11 = oVar.f;
            boolean z12 = false;
            if (!z11) {
                int i3 = n.d;
            } else if (!n.b(context)) {
                z10 = false;
                zb.p(z10);
                mVar = new m("ExoPlayer:PlaceholderSurface");
                int i10 = !z11 ? n.d : 0;
                mVar.start();
                Handler handler = new Handler(mVar.getLooper(), mVar);
                mVar.b = handler;
                mVar.a = new g2.m(handler);
                synchronized (mVar) {
                    mVar.b.obtainMessage(1, i10, 0).sendToTarget();
                    while (mVar.e == null && mVar.d == null && mVar.c == null) {
                        try {
                            mVar.wait();
                        } catch (InterruptedException unused) {
                            z12 = true;
                        }
                    }
                }
                if (z12) {
                    Thread.currentThread().interrupt();
                }
                RuntimeException runtimeException = mVar.d;
                if (runtimeException != null) {
                    throw runtimeException;
                }
                Error error = mVar.c;
                if (error != null) {
                    throw error;
                }
                n nVar2 = mVar.e;
                nVar2.getClass();
                this.t1 = nVar2;
            }
            z10 = true;
            zb.p(z10);
            mVar = new m("ExoPlayer:PlaceholderSurface");
            if (!z11) {
            }
            mVar.start();
            Handler handler2 = new Handler(mVar.getLooper(), mVar);
            mVar.b = handler2;
            mVar.a = new g2.m(handler2);
            synchronized (mVar) {
            }
        }
        return this.t1;
    }

    @Override // t2.r
    public final t2.n I(IllegalStateException illegalStateException, t2.o oVar) {
        Surface surface = this.s1;
        h hVar = new h(illegalStateException, oVar);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return hVar;
    }

    public final boolean I0(t2.o oVar) {
        if (this.o1 != null) {
            return true;
        }
        Surface surface = this.s1;
        if (surface == null || !surface.isValid()) {
            return (Build.VERSION.SDK_INT >= 35 && oVar.h) || P0(oVar);
        }
        return true;
    }

    public final boolean J0(j2.h hVar) {
        if (k() || hVar.isLastSample()) {
            return true;
        }
        long j10 = this.Q1;
        return j10 == -9223372036854775807L || j10 - (hVar.e - this.Q0.c) <= 100000;
    }

    public final void K0() {
        if (this.z1 > 0) {
            this.h.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = elapsedRealtime - this.y1;
            int i3 = this.z1;
            tf.b bVar = this.c1;
            Handler handler = (Handler) bVar.a;
            if (handler != null) {
                handler.post(new g0(bVar, i3, j10));
            }
            this.z1 = 0;
            this.y1 = elapsedRealtime;
        }
    }

    public final void L0() {
        t2.l lVar;
        if (this.L1 && (lVar = this.e0) != null) {
            this.N1 = new k(this, lVar);
            if (Build.VERSION.SDK_INT >= 33) {
                Bundle bundle = new Bundle();
                bundle.putInt("tunnel-peek", 1);
                lVar.setParameters(bundle);
            }
        }
    }

    public final void M0(t2.l lVar, int i3, long j10) {
        Surface surface;
        Trace.beginSection("releaseOutputBuffer");
        lVar.e(i3, j10);
        Trace.endSection();
        this.P0.e++;
        this.A1 = 0;
        if (this.o1 == null) {
            a2 a2Var = this.I1;
            boolean equals = a2Var.equals(a2.d);
            tf.b bVar = this.c1;
            if (!equals && !a2Var.equals(this.J1)) {
                this.J1 = a2Var;
                bVar.E(a2Var);
            }
            y yVar = this.f1;
            boolean z10 = yVar.e != 3;
            yVar.e = 3;
            yVar.l.getClass();
            yVar.g = n0.S(SystemClock.elapsedRealtime());
            if (!z10 || (surface = this.s1) == null) {
                return;
            }
            bVar.y(surface);
            this.v1 = true;
        }
    }

    public final void N0(Object obj) {
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        Surface surface2 = this.s1;
        tf.b bVar = this.c1;
        if (surface2 == surface) {
            if (surface != null) {
                a2 a2Var = this.J1;
                if (a2Var != null) {
                    bVar.E(a2Var);
                }
                Surface surface3 = this.s1;
                if (surface3 == null || !this.v1) {
                    return;
                }
                bVar.y(surface3);
                return;
            }
            return;
        }
        this.s1 = surface;
        l0 l0Var = this.o1;
        y yVar = this.f1;
        if (l0Var == null) {
            yVar.g(surface);
        }
        this.v1 = false;
        int i3 = this.n;
        t2.l lVar = this.e0;
        if (lVar != null && this.o1 == null) {
            t2.o oVar = this.l0;
            oVar.getClass();
            if (!I0(oVar) || this.m1) {
                n0();
                X();
            } else {
                Surface H0 = H0(oVar);
                if (H0 != null) {
                    try {
                        lVar.l(H0);
                    } catch (Throwable th2) {
                        th2.printStackTrace();
                        throw new v(th2);
                    }
                } else {
                    if (Build.VERSION.SDK_INT < 35) {
                        throw new IllegalStateException();
                    }
                    lVar.d();
                }
            }
        }
        if (surface != null) {
            a2 a2Var2 = this.J1;
            if (a2Var2 != null) {
                bVar.E(a2Var2);
            }
        } else {
            this.J1 = null;
            l0 l0Var2 = this.o1;
            if (l0Var2 != null) {
                l0Var2.k();
            }
        }
        if (i3 == 2) {
            l0 l0Var3 = this.o1;
            if (l0Var3 != null) {
                l0Var3.q(true);
            } else {
                yVar.c(true);
            }
        }
        L0();
    }

    @Override // t2.r
    public final int O(j2.h hVar) {
        if (Build.VERSION.SDK_INT >= 34) {
            return ((this.C1 == null && !this.L1) || hVar.e >= this.x || J0(hVar)) ? 0 : 32;
        }
        return 0;
    }

    public final boolean O0(long j10, long j11, boolean z10, boolean z11) {
        int B;
        if (this.o1 != null && this.b1) {
            j11 -= -this.P1;
        }
        if (j10 >= -500000 || z10 || (B = B(j11)) == 0) {
            return false;
        }
        this.D1 = j11;
        PriorityQueue priorityQueue = this.k1;
        if (z11) {
            k2.d dVar = this.P0;
            int i3 = dVar.d + B;
            dVar.d = i3;
            dVar.f += this.B1;
            dVar.d = priorityQueue.size() + i3;
        } else {
            this.P0.j++;
            R0(priorityQueue.size() + B, this.B1);
        }
        if (this.e0 != null) {
            if (x0()) {
                n0();
                X();
            } else if (v0()) {
                M();
            } else {
                this.U0 = true;
            }
        }
        l0 l0Var = this.o1;
        if (l0Var != null) {
            l0Var.l(false);
        }
        return true;
    }

    @Override // t2.r
    public final float P(float f10, d2.v vVar, d2.v[] vVarArr) {
        t2.o oVar;
        float f11 = -1.0f;
        for (d2.v vVar2 : vVarArr) {
            float f12 = vVar2.D;
            if (f12 != -1.0f) {
                f11 = Math.max(f11, f12);
            }
        }
        float f13 = f11 == -1.0f ? -1.0f : f11 * f10;
        if (this.C1 == null || (oVar = this.l0) == null) {
            return f13;
        }
        int i3 = vVar.z;
        int i10 = vVar.A;
        float f14 = -3.4028235E38f;
        if (oVar.i) {
            float f15 = oVar.l;
            if (f15 != -3.4028235E38f && oVar.j == i3 && oVar.k == i10) {
                f14 = f15;
            } else {
                float f16 = 1024.0f;
                if (!oVar.g(i3, i10, 1024.0f)) {
                    f14 = 0.0f;
                    while (true) {
                        float f17 = f16 - f14;
                        if (Math.abs(f17) <= 5.0f) {
                            break;
                        }
                        float f18 = (f17 / 2.0f) + f14;
                        if (oVar.g(i3, i10, f18)) {
                            f14 = f18;
                        } else {
                            f16 = f18;
                        }
                    }
                } else {
                    f14 = 1024.0f;
                }
                oVar.l = f14;
                oVar.j = i3;
                oVar.k = i10;
            }
        }
        return f13 != -1.0f ? Math.max(f13, f14) : f14;
    }

    public final boolean P0(t2.o oVar) {
        if (this.L1 || D0(oVar.a)) {
            return false;
        }
        return !oVar.f || n.b(this.a1);
    }

    @Override // t2.r
    public final ArrayList Q(t2.i iVar, d2.v vVar, boolean z10) {
        boolean z11 = this.L1;
        Context context = this.a1;
        List F0 = F0(context, iVar, vVar, z10, z11);
        HashMap hashMap = t2.w.a;
        ArrayList arrayList = new ArrayList(F0);
        Collections.sort(arrayList, new y4(new na1(11, context, vVar), 4));
        return arrayList;
    }

    public final void Q0(t2.l lVar, int i3) {
        Trace.beginSection("skipVideoBuffer");
        lVar.c(i3);
        Trace.endSection();
        this.P0.f++;
    }

    public final void R0(int i3, int i10) {
        k2.d dVar = this.P0;
        dVar.h += i3;
        int i11 = i3 + i10;
        dVar.g += i11;
        this.z1 += i11;
        int i12 = this.A1 + i11;
        this.A1 = i12;
        dVar.i = Math.max(i12, dVar.i);
        int i13 = this.d1;
        if (i13 <= 0 || this.z1 < i13) {
            return;
        }
        K0();
    }

    public final void S0(w2.g0 g0Var) {
        n1 n1Var = this.G;
        if (n1Var.p()) {
            this.Q1 = -9223372036854775807L;
            return;
        }
        int b10 = n1Var.b(g0Var.a);
        if (b10 == -1) {
            this.Q1 = -9223372036854775807L;
        } else {
            this.Q1 = n1Var.f(b10, new k1(), false).d;
        }
    }

    @Override // t2.r
    public final l2.e T(t2.o oVar, d2.v vVar, MediaCrypto mediaCrypto, float f10) {
        d2.n nVar;
        int i3;
        a7.d dVar;
        Point point;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int i10;
        int i11;
        char c2;
        boolean z10;
        Pair b10;
        int E0;
        String str = oVar.c;
        d2.v[] vVarArr = this.s;
        vVarArr.getClass();
        int i12 = vVar.z;
        float f11 = vVar.D;
        d2.n nVar2 = vVar.I;
        int i13 = vVar.A;
        int G0 = G0(oVar, vVar);
        if (vVarArr.length == 1) {
            if (G0 != -1 && (E0 = E0(oVar, vVar)) != -1) {
                G0 = Math.min((int) (G0 * 1.5f), E0);
            }
            dVar = new a7.d(i12, i13, G0);
            nVar = nVar2;
            i3 = i13;
        } else {
            int length = vVarArr.length;
            int i14 = i12;
            int i15 = i13;
            int i16 = 0;
            boolean z11 = false;
            while (i16 < length) {
                d2.v vVar2 = vVarArr[i16];
                d2.v[] vVarArr2 = vVarArr;
                if (nVar2 != null && vVar2.I == null) {
                    d2.u a10 = vVar2.a();
                    a10.H = nVar2;
                    vVar2 = new d2.v(a10);
                }
                k2.e b11 = oVar.b(vVar, vVar2);
                int i17 = length;
                int i18 = vVar2.A;
                if (b11.d != 0) {
                    int i19 = vVar2.z;
                    i11 = i16;
                    c2 = 65535;
                    z11 |= i19 == -1 || i18 == -1;
                    i14 = Math.max(i14, i19);
                    i15 = Math.max(i15, i18);
                    G0 = Math.max(G0, G0(oVar, vVar2));
                } else {
                    i11 = i16;
                    c2 = 65535;
                }
                length = i17;
                i16 = i11 + 1;
                vVarArr = vVarArr2;
            }
            if (z11) {
                g2.a.l("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + i14 + "x" + i15);
                boolean z12 = i13 > i12;
                int i20 = z12 ? i13 : i12;
                boolean z13 = z12;
                int i21 = z12 ? i12 : i13;
                float f12 = i21 / i20;
                int i22 = 0;
                while (true) {
                    nVar = nVar2;
                    if (i22 >= 9) {
                        break;
                    }
                    int i23 = T1[i22];
                    int i24 = i22;
                    int i25 = (int) (i23 * f12);
                    if (i23 <= i20 || i25 <= i21) {
                        break;
                    }
                    if (!z13) {
                        i25 = i23;
                    }
                    if (!z13) {
                        i23 = i25;
                    }
                    int i26 = i21;
                    MediaCodecInfo.CodecCapabilities codecCapabilities = oVar.d;
                    if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                        i10 = i20;
                        point = null;
                    } else {
                        int widthAlignment = videoCapabilities.getWidthAlignment();
                        i10 = i20;
                        int heightAlignment = videoCapabilities.getHeightAlignment();
                        point = new Point(n0.g(i25, widthAlignment) * widthAlignment, n0.g(i23, heightAlignment) * heightAlignment);
                    }
                    if (point != null) {
                        i3 = i13;
                        if (oVar.g(point.x, point.y, f11)) {
                            break;
                        }
                    } else {
                        i3 = i13;
                    }
                    i22 = i24 + 1;
                    i13 = i3;
                    nVar2 = nVar;
                    i21 = i26;
                    i20 = i10;
                }
                i3 = i13;
                point = null;
                if (point != null) {
                    i14 = Math.max(i14, point.x);
                    i15 = Math.max(i15, point.y);
                    d2.u a11 = vVar.a();
                    a11.y = i14;
                    a11.z = i15;
                    G0 = Math.max(G0, E0(oVar, new d2.v(a11)));
                    g2.a.l("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + i14 + "x" + i15);
                }
            } else {
                nVar = nVar2;
                i3 = i13;
            }
            dVar = new a7.d(i14, i15, G0);
        }
        this.l1 = dVar;
        int i27 = this.L1 ? this.M1 : 0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i12);
        mediaFormat.setInteger("height", i3);
        g2.a.k(mediaFormat, vVar.v);
        if (f11 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f11);
        }
        g2.a.j(mediaFormat, "rotation-degrees", vVar.E);
        if (nVar != null) {
            d2.n nVar3 = nVar;
            g2.a.j(mediaFormat, "color-transfer", nVar3.c);
            g2.a.j(mediaFormat, "color-standard", nVar3.a);
            g2.a.j(mediaFormat, "color-range", nVar3.b);
            byte[] bArr = nVar3.d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(vVar.s) && (b10 = g2.h.b(vVar)) != null) {
            g2.a.j(mediaFormat, "profile", ((Integer) b10.first).intValue());
        }
        mediaFormat.setInteger("max-width", dVar.a);
        mediaFormat.setInteger("max-height", dVar.b);
        g2.a.j(mediaFormat, "max-input-size", dVar.c);
        mediaFormat.setInteger("priority", 0);
        if (f10 != -1.0f) {
            mediaFormat.setFloat("operating-rate", f10);
        }
        if (this.e1) {
            z10 = true;
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z10 = true;
        }
        if (i27 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z10);
            mediaFormat.setInteger("audio-session-id", i27);
        }
        if (Build.VERSION.SDK_INT >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.K1));
        }
        F(mediaFormat);
        Surface H0 = H0(oVar);
        if (this.o1 != null && !n0.N(this.a1)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        return new l2.e(oVar, mediaFormat, vVar, H0, mediaCrypto, null);
    }

    public final void T0(long j10) {
        k2.d dVar = this.P0;
        dVar.k += j10;
        dVar.l++;
        this.F1 += j10;
        this.G1++;
    }

    @Override // t2.r
    public final void U(j2.h hVar) {
        if (this.n1) {
            ByteBuffer byteBuffer = hVar.f;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b10 = byteBuffer.get();
                short s6 = byteBuffer.getShort();
                short s10 = byteBuffer.getShort();
                byte b11 = byteBuffer.get();
                byte b12 = byteBuffer.get();
                byteBuffer.position(0);
                if (b10 == -75 && s6 == 60 && s10 == 1 && b11 == 4) {
                    if (b12 == 0 || b12 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        t2.l lVar = this.e0;
                        lVar.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        lVar.setParameters(bundle);
                    }
                }
            }
        }
    }

    @Override // t2.r
    public final boolean Z(d2.v vVar) {
        l0 l0Var = this.o1;
        if (l0Var == null || l0Var.u()) {
            return true;
        }
        try {
            return this.o1.e(vVar);
        } catch (k0 e10) {
            throw e(e10, vVar, false, 7000);
        }
    }

    @Override // t2.r
    public final void a0(Exception exc) {
        g2.a.d("MediaCodecVideoRenderer", "Video codec error", exc);
        tf.b bVar = this.c1;
        Handler handler = (Handler) bVar.a;
        if (handler != null) {
            handler.post(new a1.f(28, bVar, exc));
        }
    }

    @Override // t2.r
    public final void b0(long j10, String str, long j11) {
        String str2;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        tf.b bVar = this.c1;
        Handler handler = (Handler) bVar.a;
        if (handler != null) {
            str2 = str;
            handler.post(new f0(bVar, str2, j10, j11, 0));
        } else {
            str2 = str;
        }
        this.m1 = D0(str2);
        t2.o oVar = this.l0;
        oVar.getClass();
        boolean z10 = false;
        if (Build.VERSION.SDK_INT >= 29 && "video/x-vnd.on2.vp9".equals(oVar.b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = oVar.d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            int length = codecProfileLevelArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                if (codecProfileLevelArr[i3].profile == 16384) {
                    z10 = true;
                    break;
                }
                i3++;
            }
        }
        this.n1 = z10;
        L0();
    }

    @Override // t2.r
    public final void c0(k2.c cVar) {
        tf.b bVar = this.c1;
        Handler handler = (Handler) bVar.a;
        if (handler != null) {
            handler.post(new a1.f(26, bVar, cVar));
        }
    }

    @Override // t2.r, k2.b, k2.l1
    public final void d(int i3, Object obj) {
        if (i3 == 1) {
            N0(obj);
            return;
        }
        if (i3 == 7) {
            obj.getClass();
            w wVar = (w) obj;
            this.O1 = wVar;
            l0 l0Var = this.o1;
            if (l0Var != null) {
                l0Var.p(wVar);
                return;
            }
            return;
        }
        if (i3 == 10) {
            obj.getClass();
            int intValue = ((Integer) obj).intValue();
            if (this.M1 != intValue) {
                this.M1 = intValue;
                if (this.L1) {
                    n0();
                    return;
                }
                return;
            }
            return;
        }
        if (i3 == 4) {
            obj.getClass();
            int intValue2 = ((Integer) obj).intValue();
            this.w1 = intValue2;
            t2.l lVar = this.e0;
            if (lVar != null) {
                lVar.j(intValue2);
                return;
            }
            return;
        }
        if (i3 == 5) {
            obj.getClass();
            int intValue3 = ((Integer) obj).intValue();
            this.x1 = intValue3;
            l0 l0Var2 = this.o1;
            if (l0Var2 != null) {
                l0Var2.j(intValue3);
                return;
            }
            d0 d0Var = this.f1.b;
            if (d0Var.j == intValue3) {
                return;
            }
            d0Var.j = intValue3;
            d0Var.d(true);
            return;
        }
        if (i3 == 13) {
            obj.getClass();
            List list = (List) obj;
            if (list.equals(y1.a)) {
                l0 l0Var3 = this.o1;
                if (l0Var3 == null || !l0Var3.u()) {
                    return;
                }
                this.o1.s();
                return;
            }
            this.r1 = list;
            l0 l0Var4 = this.o1;
            if (l0Var4 != null) {
                l0Var4.m(list);
                return;
            }
            return;
        }
        if (i3 == 14) {
            obj.getClass();
            g2.z zVar = (g2.z) obj;
            if (zVar.a == 0 || zVar.b == 0) {
                return;
            }
            this.u1 = zVar;
            l0 l0Var5 = this.o1;
            if (l0Var5 != null) {
                Surface surface = this.s1;
                surface.getClass();
                l0Var5.o(surface, zVar);
                return;
            }
            return;
        }
        switch (i3) {
            case 16:
                obj.getClass();
                this.K1 = ((Integer) obj).intValue();
                t2.l lVar2 = this.e0;
                if (lVar2 != null && Build.VERSION.SDK_INT >= 35) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("importance", Math.max(0, -this.K1));
                    lVar2.setParameters(bundle);
                    break;
                }
                break;
            case 17:
                Surface surface2 = this.s1;
                N0(null);
                obj.getClass();
                ((l) obj).d(1, surface2);
                break;
            case 18:
                boolean z10 = this.C1 != null;
                s1 s1Var = (s1) obj;
                this.C1 = s1Var;
                if (z10 != (s1Var != null)) {
                    A0(this.f0);
                    break;
                }
                break;
            default:
                super.d(i3, obj);
                break;
        }
    }

    @Override // t2.r
    public final void d0(String str) {
        tf.b bVar = this.c1;
        Handler handler = (Handler) bVar.a;
        if (handler != null) {
            handler.post(new a1.f(29, bVar, str));
        }
    }

    @Override // t2.r
    public final k2.e e0(tf.b bVar) {
        k2.e e02 = super.e0(bVar);
        d2.v vVar = (d2.v) bVar.b;
        vVar.getClass();
        tf.b bVar2 = this.c1;
        Handler handler = (Handler) bVar2.a;
        if (handler != null) {
            handler.post(new k3(bVar2, vVar, e02, 9));
        }
        z zVar = this.j1;
        if (zVar != null) {
            zVar.b();
        }
        return e02;
    }

    @Override // k2.b
    public final void f() {
        l0 l0Var = this.o1;
        if (l0Var == null) {
            y yVar = this.f1;
            if (yVar.e == 0) {
                yVar.e = 1;
                return;
            }
            return;
        }
        int i3 = this.q1;
        if (i3 == 0 || i3 == 1) {
            this.q1 = 0;
        } else {
            l0Var.v();
        }
    }

    @Override // t2.r
    public final void f0(d2.v vVar, MediaFormat mediaFormat) {
        int integer;
        int i3;
        t2.l lVar = this.e0;
        if (lVar != null) {
            lVar.j(this.w1);
        }
        if (this.L1) {
            i3 = vVar.z;
            integer = vVar.A;
        } else {
            mediaFormat.getClass();
            boolean z10 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            int integer2 = z10 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
            integer = z10 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
            i3 = integer2;
        }
        float f10 = vVar.F;
        int i10 = vVar.E;
        if (i10 == 90 || i10 == 270) {
            f10 = 1.0f / f10;
            int i11 = integer;
            integer = i3;
            i3 = i11;
        }
        this.I1 = new a2(f10, i3, integer);
        l0 l0Var = this.o1;
        if (l0Var == null || !this.R1) {
            this.f1.f(vVar.D);
        } else {
            d2.u a10 = vVar.a();
            a10.y = i3;
            a10.z = integer;
            a10.E = f10;
            d2.v vVar2 = new d2.v(a10);
            int i12 = this.q1;
            List list = this.r1;
            if (list == null) {
                g9.g0 g0Var = g9.i0.b;
                list = g9.s1.e;
            }
            l0Var.f(vVar2, this.Q0.b, i12, list);
            this.q1 = 2;
        }
        this.R1 = false;
    }

    @Override // t2.r
    public final void h0(long j10) {
        super.h0(j10);
        if (this.L1) {
            return;
        }
        this.B1--;
    }

    @Override // t2.r
    public final void i0() {
        l0 l0Var = this.o1;
        if (l0Var != null) {
            l0Var.i();
            if (this.P1 == -9223372036854775807L) {
                this.P1 = this.Q0.b;
            }
            this.o1.h(-this.P1);
        } else {
            this.f1.e(2);
        }
        this.R1 = true;
        L0();
    }

    @Override // k2.b
    public final String j() {
        return "MediaCodecVideoRenderer";
    }

    @Override // t2.r
    public final void j0(j2.h hVar) {
        ByteBuffer byteBuffer;
        tf.b bVar = this.h1;
        if (bVar != null) {
            t2.o oVar = this.l0;
            oVar.getClass();
            if (oVar.b.equals("video/av01") && hVar.isKeyFrame() && (byteBuffer = hVar.c) != null) {
                int position = byteBuffer.position();
                int limit = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit, position + 500));
                ByteBuffer byteBuffer2 = (ByteBuffer) bVar.a;
                byteBuffer2.clear();
                byteBuffer2.put(byteBuffer);
                byteBuffer2.flip();
                byteBuffer.position(position);
                byteBuffer.limit(limit);
            }
        }
        this.S1 = 0;
        int O = O(hVar);
        if ((Build.VERSION.SDK_INT < 34 || (O & 32) == 0) && !this.L1) {
            this.B1++;
        }
    }

    @Override // k2.b
    public final boolean l() {
        if (!this.L0) {
            return false;
        }
        l0 l0Var = this.o1;
        return l0Var == null || l0Var.a();
    }

    @Override // t2.r
    public final boolean l0(long j10, long j11, t2.l lVar, ByteBuffer byteBuffer, int i3, int i10, int i11, long j12, boolean z10, boolean z11, d2.v vVar) {
        int i12;
        lVar.getClass();
        long j13 = j12 - this.Q0.c;
        int i13 = 0;
        while (true) {
            PriorityQueue priorityQueue = this.k1;
            Long l10 = (Long) priorityQueue.peek();
            if (l10 == null || l10.longValue() >= j12) {
                break;
            }
            i13++;
            priorityQueue.poll();
        }
        R0(i13, 0);
        l0 l0Var = this.o1;
        if (l0Var != null) {
            if (!z10 || z11) {
                return l0Var.t(j12, new i(this, lVar, i3, j13));
            }
            Q0(lVar, i3);
            return true;
        }
        int a10 = this.f1.a(j12, j10, j11, this.Q0.b, z10, z11, this.g1);
        x xVar = this.g1;
        z zVar = this.j1;
        if (zVar != null && a10 != 5 && a10 != 4) {
            zVar.a(j12, xVar.a);
        }
        if (a10 == 0) {
            this.h.getClass();
            long nanoTime = System.nanoTime();
            w wVar = this.O1;
            if (wVar != null) {
                wVar.a(j13, nanoTime, vVar, this.g0);
            }
            M0(lVar, i3, nanoTime);
            T0(xVar.a);
            return true;
        }
        if (a10 == 1) {
            long j14 = xVar.b;
            long j15 = xVar.a;
            if (j14 == this.H1) {
                Q0(lVar, i3);
            } else {
                w wVar2 = this.O1;
                if (wVar2 != null) {
                    i12 = i3;
                    wVar2.a(j13, j14, vVar, this.g0);
                } else {
                    i12 = i3;
                }
                M0(lVar, i12, j14);
            }
            T0(j15);
            this.H1 = j14;
            return true;
        }
        if (a10 == 2) {
            Trace.beginSection("dropVideoBuffer");
            lVar.c(i3);
            Trace.endSection();
            R0(0, 1);
            T0(xVar.a);
            return true;
        }
        if (a10 == 3) {
            Q0(lVar, i3);
            T0(xVar.a);
            return true;
        }
        if (a10 == 4 || a10 == 5) {
            return false;
        }
        throw new IllegalStateException(String.valueOf(a10));
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
    
        if (android.os.SystemClock.elapsedRealtime() < r7.u0) goto L18;
     */
    @Override // k2.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m() {
        boolean f10;
        boolean z10 = false;
        if (this.V != null) {
            if (k()) {
                f10 = this.E;
            } else {
                d1 d1Var = this.r;
                d1Var.getClass();
                f10 = d1Var.f();
            }
            if (!f10) {
                if (!(this.w0 >= 0)) {
                    if (this.u0 != -9223372036854775807L) {
                        this.h.getClass();
                    }
                }
            }
            z10 = true;
        }
        l0 l0Var = this.o1;
        if (l0Var != null) {
            return l0Var.r(z10);
        }
        if (z10 && (this.e0 == null || this.L1)) {
            return true;
        }
        return this.f1.b(z10);
    }

    @Override // t2.r, k2.b
    public final void n() {
        tf.b bVar = this.c1;
        this.J1 = null;
        this.Q1 = -9223372036854775807L;
        L0();
        this.v1 = false;
        this.N1 = null;
        this.E1 = true;
        try {
            super.n();
        } finally {
            bVar.s(this.P0);
            bVar.E(a2.d);
        }
    }

    @Override // k2.b
    public final void o(boolean z10, boolean z11) {
        l0 l0Var;
        this.P0 = new k2.d();
        q1 q1Var = this.d;
        q1Var.getClass();
        boolean z12 = q1Var.b;
        zb.p((z12 && this.M1 == 0) ? false : true);
        if (this.L1 != z12) {
            this.L1 = z12;
            n0();
        }
        k2.d dVar = this.P0;
        tf.b bVar = this.c1;
        Handler handler = (Handler) bVar.a;
        if (handler != null) {
            handler.post(new h0(bVar, dVar, 0));
        }
        boolean z13 = this.p1;
        y yVar = this.f1;
        if (!z13) {
            if (this.r1 != null && this.o1 == null) {
                o oVar = new o(this.a1, yVar);
                oVar.d = true;
                long j10 = this.i1;
                oVar.g = j10 != -9223372036854775807L ? -j10 : -9223372036854775807L;
                g2.h0 h0Var = this.h;
                h0Var.getClass();
                oVar.e = h0Var;
                zb.p(!oVar.f);
                if (oVar.c == null) {
                    oVar.c = new s();
                }
                u uVar = new u(oVar);
                oVar.f = true;
                if (1 >= uVar.p) {
                    uVar.p = 1;
                }
                SparseArray sparseArray = uVar.c;
                if (n0.k(sparseArray, 0)) {
                    l0Var = (l0) sparseArray.get(0);
                } else {
                    p pVar = new p(uVar, uVar.a);
                    uVar.g.add(pVar);
                    sparseArray.put(0, pVar);
                    l0Var = pVar;
                }
                this.o1 = l0Var;
            }
            this.p1 = true;
        }
        l0 l0Var2 = this.o1;
        if (l0Var2 == null) {
            g2.h0 h0Var2 = this.h;
            h0Var2.getClass();
            yVar.l = h0Var2;
            yVar.e(!z11 ? 1 : 0);
            return;
        }
        l0Var2.w(new c6.i(this, 7));
        w wVar = this.O1;
        if (wVar != null) {
            this.o1.p(wVar);
        }
        if (this.s1 != null && !this.u1.equals(g2.z.c)) {
            this.o1.o(this.s1, this.u1);
        }
        this.o1.j(this.x1);
        this.o1.b(this.c0);
        List list = this.r1;
        if (list != null) {
            this.o1.m(list);
        }
        this.q1 = !z11 ? 1 : 0;
        this.T0 = true;
    }

    @Override // t2.r
    public final void o0() {
        l0 l0Var = this.o1;
        if (l0Var != null) {
            l0Var.i();
        } else {
            long j10 = this.Q0.f;
        }
    }

    @Override // t2.r, k2.b
    public final void p(long j10, boolean z10, boolean z11) {
        l0 l0Var = this.o1;
        if (l0Var != null && !z10) {
            l0Var.l(true);
        }
        if (z11) {
            this.D1 = j10;
        }
        super.p(j10, z10, z11);
        l0 l0Var2 = this.o1;
        y yVar = this.f1;
        if (l0Var2 == null) {
            yVar.b.b();
            yVar.h = -9223372036854775807L;
            yVar.f = -9223372036854775807L;
            yVar.e = Math.min(yVar.e, 1);
            yVar.i = -9223372036854775807L;
            yVar.n = false;
        }
        z zVar = this.j1;
        if (zVar != null) {
            zVar.b();
        }
        if (z10) {
            l0 l0Var3 = this.o1;
            if (l0Var3 != null) {
                l0Var3.q(false);
            } else {
                yVar.c(false);
            }
        }
        L0();
        this.A1 = 0;
    }

    @Override // k2.b
    public final void q() {
        l0 l0Var = this.o1;
        if (l0Var == null || !this.b1) {
            return;
        }
        l0Var.release();
    }

    @Override // t2.r
    public final void q0() {
        super.q0();
        this.k1.clear();
        this.B1 = 0;
        this.S1 = 0;
        this.E1 = false;
        tf.b bVar = this.h1;
        if (bVar != null) {
            bVar.b = null;
            ByteBuffer byteBuffer = (ByteBuffer) bVar.a;
            byteBuffer.position(byteBuffer.limit());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // k2.b
    public final void r() {
        try {
            try {
                this.z0 = false;
                p0();
                n0();
            } finally {
                f1.E(this.Y, null);
                this.Y = null;
            }
        } finally {
            this.p1 = false;
            this.P1 = -9223372036854775807L;
            n nVar = this.t1;
            if (nVar != null) {
                nVar.release();
                this.t1 = null;
            }
        }
    }

    @Override // k2.b
    public final void s() {
        this.z1 = 0;
        this.h.getClass();
        this.y1 = SystemClock.elapsedRealtime();
        this.F1 = 0L;
        this.G1 = 0;
        l0 l0Var = this.o1;
        if (l0Var != null) {
            l0Var.g();
        } else {
            this.f1.d();
        }
    }

    @Override // k2.b
    public final void t() {
        K0();
        int i3 = this.G1;
        if (i3 != 0) {
            long j10 = this.F1;
            tf.b bVar = this.c1;
            Handler handler = (Handler) bVar.a;
            if (handler != null) {
                handler.post(new g0(bVar, j10, i3));
            }
            this.F1 = 0L;
            this.G1 = 0;
        }
        l0 l0Var = this.o1;
        if (l0Var != null) {
            l0Var.d();
        } else {
            y yVar = this.f1;
            yVar.d = false;
            yVar.i = -9223372036854775807L;
            d0 d0Var = yVar.b;
            d0Var.d = false;
            a0 a0Var = d0Var.c;
            if (a0Var != null) {
                a0Var.b();
            }
            d0Var.a();
        }
        z zVar = this.j1;
        if (zVar != null) {
            zVar.b();
        }
    }

    @Override // t2.r, k2.b
    public final void u(d2.v[] vVarArr, long j10, long j11, w2.g0 g0Var) {
        super.u(vVarArr, j10, j11, g0Var);
        S0(g0Var);
        z zVar = this.j1;
        if (zVar != null) {
            zVar.b();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f0, code lost:
    
        if ((r7 + 1) < 8) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f3, code lost:
    
        if (r7 < 0) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00f5, code lost:
    
        r2 = ((h2.q) r3.get(r7)).b.limit();
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0102, code lost:
    
        r2 = r5.position();
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0054  */
    @Override // t2.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean u0(j2.h hVar) {
        boolean z10;
        ByteBuffer byteBuffer;
        h2.r rVar;
        di.a aVar;
        boolean z11 = false;
        if (!J0(hVar)) {
            boolean z12 = hVar.e < this.x;
            z zVar = this.j1;
            if (zVar != null) {
                long j10 = zVar.a == -9223372036854775807L ? -9223372036854775807L : (long) (((r2 - r6) * zVar.c) + zVar.b);
                if (j10 != -9223372036854775807L && j10 < this.i1) {
                    z10 = true;
                    if ((!z12 || z10) && !hVar.hasSupplementalData()) {
                        if (hVar.notDependedOn()) {
                            tf.b bVar = this.h1;
                            if (bVar != null) {
                                ByteBuffer byteBuffer2 = (ByteBuffer) bVar.a;
                                t2.o oVar = this.l0;
                                oVar.getClass();
                                if (oVar.b.equals("video/av01") && (byteBuffer = hVar.c) != null) {
                                    boolean z13 = z12 || this.S1 <= 0;
                                    ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                                    asReadOnlyBuffer.flip();
                                    if (byteBuffer2.hasRemaining()) {
                                        bVar.D(h2.o.o(byteBuffer2));
                                        byteBuffer2.position(byteBuffer2.limit());
                                    }
                                    ArrayList o10 = h2.o.o(asReadOnlyBuffer);
                                    bVar.D(o10);
                                    int size = o10.size() - 1;
                                    int i3 = 0;
                                    while (size >= 0) {
                                        h2.q qVar = (h2.q) o10.get(size);
                                        int i10 = qVar.a;
                                        if (i10 != 2 && i10 != 15) {
                                            if ((i10 == 3 && !z13) || ((i10 != 6 && i10 != 3) || (rVar = (h2.r) bVar.b) == null)) {
                                                break;
                                            }
                                            try {
                                                aVar = new di.a(rVar, qVar);
                                            } catch (h2.p unused) {
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
                                        if (((h2.q) o10.get(size)).a == 6 || ((h2.q) o10.get(size)).a == 3) {
                                            i3++;
                                        }
                                        size--;
                                    }
                                    int limit = asReadOnlyBuffer.limit();
                                    if (limit == 0) {
                                        hVar.clear();
                                    } else if (limit != asReadOnlyBuffer.limit()) {
                                        a7.d dVar = this.l1;
                                        dVar.getClass();
                                        if (dVar.c + limit < asReadOnlyBuffer.capacity() && !hVar.getFlag(TLObject.FLAG_30)) {
                                            ByteBuffer byteBuffer3 = hVar.c;
                                            byteBuffer3.getClass();
                                            byteBuffer3.position(limit);
                                        }
                                    }
                                }
                            }
                            if (z11) {
                                if (z12) {
                                    this.P0.d++;
                                } else {
                                    this.k1.add(Long.valueOf(hVar.e));
                                    this.S1++;
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

    @Override // k2.b
    public final void v() {
        w2.g0 g0Var = this.H;
        if (g0Var != null) {
            S0(g0Var);
        }
    }

    @Override // t2.r
    public final boolean v0() {
        boolean z10;
        d2.v vVar = this.f0;
        long j10 = this.Q1;
        if (j10 != -9223372036854775807L) {
            if (this.V0 + 1 + j10 <= Long.MAX_VALUE - (this.Q0.c + j10)) {
                z10 = false;
                return this.C1 == null || this.E1 || this.L1 || (vVar != null && vVar.u > 0) || z10 || this.Q0.f != -9223372036854775807L;
            }
        }
        z10 = true;
        if (this.C1 == null) {
        }
    }

    @Override // t2.r
    public final boolean w0(t2.o oVar) {
        return I0(oVar);
    }

    @Override // t2.r, k2.b
    public final void x(long j10, long j11) {
        l0 l0Var = this.o1;
        if (l0Var != null) {
            try {
                l0Var.n(j10, j11);
            } catch (k0 e10) {
                throw e(e10, e10.a, false, 7001);
            }
        }
        super.x(j10, j11);
    }

    @Override // t2.r
    public final boolean x0() {
        t2.o oVar = this.l0;
        if (this.o1 != null && oVar != null) {
            String str = oVar.a;
            if (str.equals("c2.mtk.avc.decoder") || str.equals("c2.mtk.hevc.decoder")) {
                return true;
            }
        }
        return super.x0();
    }

    @Override // t2.r
    public final int z0(t2.i iVar, d2.v vVar) {
        boolean z10;
        int i3 = 0;
        if (!u0.m(vVar.s)) {
            return p1.a(0, 0, 0, 0);
        }
        boolean z11 = vVar.w != null;
        Context context = this.a1;
        List F0 = F0(context, iVar, vVar, z11, false);
        if (z11 && F0.isEmpty()) {
            F0 = F0(context, iVar, vVar, false, false);
        }
        if (F0.isEmpty()) {
            return p1.a(1, 0, 0, 0);
        }
        int i10 = vVar.T;
        if (i10 != 0 && i10 != 2) {
            return p1.a(2, 0, 0, 0);
        }
        t2.o oVar = (t2.o) F0.get(0);
        boolean e10 = oVar.e(context, vVar);
        if (!e10) {
            for (int i11 = 1; i11 < F0.size(); i11++) {
                t2.o oVar2 = (t2.o) F0.get(i11);
                if (oVar2.e(context, vVar)) {
                    z10 = false;
                    e10 = true;
                    oVar = oVar2;
                    break;
                }
            }
        }
        z10 = true;
        int i12 = 4;
        int i13 = e10 ? 4 : 3;
        int i14 = oVar.f(vVar) ? 16 : 8;
        int i15 = oVar.g ? 64 : 0;
        int i16 = z10 ? 128 : 0;
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(vVar.s) && !e2.h.d(context)) {
            i16 = 256;
        }
        if (e10) {
            List F02 = F0(context, iVar, vVar, z11, true);
            if (!F02.isEmpty()) {
                HashMap hashMap = t2.w.a;
                ArrayList arrayList = new ArrayList(F02);
                Collections.sort(arrayList, new y4(new na1(11, context, vVar), i12));
                t2.o oVar3 = (t2.o) arrayList.get(0);
                if (oVar3.e(context, vVar) && oVar3.f(vVar)) {
                    i3 = 32;
                }
            }
        }
        return i13 | i14 | i3 | i15 | i16;
    }
}
