package d3;

import a8.b8;
import a8.ia;
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
import bi.a4;
import bi.h4;
import bi.s5;
import e2.i1;
import e2.l1;
import e2.s0;
import e2.v1;
import e2.x1;
import h2.m0;
import h9.t1;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;
import l2.q1;
import l2.s1;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Cells.f1;
import x2.b1;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class l extends u2.r {
    public static final int[] S1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    public static boolean T1;
    public static boolean U1;
    public int A1;
    public s1 B1;
    public long C1;
    public boolean D1;
    public long E1;
    public int F1;
    public long G1;
    public x1 H1;
    public x1 I1;
    public int J1;
    public boolean K1;
    public int L1;
    public k M1;
    public w N1;
    public long O1;
    public long P1;
    public boolean Q1;
    public int R1;
    public final Context Z0;
    public final boolean a1;
    public final wf.b b1;
    public final int c1;
    public final boolean d1;
    public final y e1;
    public final x f1;
    public final wf.b g1;
    public final long h1;
    public final z i1;
    public final PriorityQueue j1;
    public b7.d k1;
    public boolean l1;
    public boolean m1;
    public k0 n1;
    public boolean o1;
    public int p1;
    public List q1;
    public Surface r1;
    public n s1;
    public h2.y t1;
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
    public l(j jVar) {
        super(r0.getApplicationContext(), 2, jVar.c, 30.0f);
        Context context = jVar.a;
        Context applicationContext = context.getApplicationContext();
        this.Z0 = applicationContext;
        this.c1 = jVar.g;
        this.n1 = null;
        this.b1 = new wf.b(jVar.e, jVar.f);
        this.a1 = this.n1 == null;
        this.e1 = new y(applicationContext, this, jVar.d);
        this.f1 = new x();
        this.d1 = "NVIDIA".equals(Build.MANUFACTURER);
        this.t1 = h2.y.c;
        this.v1 = 1;
        this.w1 = 0;
        this.H1 = x1.d;
        this.L1 = 0;
        this.I1 = null;
        this.J1 = -1000;
        this.O1 = -9223372036854775807L;
        this.P1 = -9223372036854775807L;
        this.g1 = new wf.b(13);
        this.j1 = new PriorityQueue();
        this.h1 = -15000L;
        this.i1 = new z();
        this.B1 = null;
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
        boolean z9;
        boolean z10;
        boolean z11 = false;
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (l.class) {
            try {
                if (!T1) {
                    int i7 = Build.VERSION.SDK_INT;
                    char c10 = 28;
                    if (i7 <= 28) {
                        String str2 = Build.DEVICE;
                        str2.getClass();
                        switch (str2.hashCode()) {
                            case -1339091551:
                                if (str2.equals("dangal")) {
                                    z10 = false;
                                    break;
                                }
                                z10 = -1;
                                break;
                            case -1220081023:
                                if (str2.equals("dangalFHD")) {
                                    z10 = true;
                                    break;
                                }
                                z10 = -1;
                                break;
                            case -1220066608:
                                if (str2.equals("dangalUHD")) {
                                    z10 = 2;
                                    break;
                                }
                                z10 = -1;
                                break;
                            case -1012436106:
                                if (str2.equals("oneday")) {
                                    z10 = 3;
                                    break;
                                }
                                z10 = -1;
                                break;
                            case -760312546:
                                if (str2.equals("aquaman")) {
                                    z10 = 4;
                                    break;
                                }
                                z10 = -1;
                                break;
                            case -64886864:
                                if (str2.equals("magnolia")) {
                                    z10 = 5;
                                    break;
                                }
                                z10 = -1;
                                break;
                            case 3415681:
                                if (str2.equals("once")) {
                                    z10 = 6;
                                    break;
                                }
                                z10 = -1;
                                break;
                            case 825323514:
                                if (str2.equals("machuca")) {
                                    z10 = 7;
                                    break;
                                }
                                z10 = -1;
                                break;
                            default:
                                z10 = -1;
                                break;
                        }
                        switch (z10) {
                            case false:
                            case true:
                            case true:
                            case true:
                            case true:
                            case true:
                            case true:
                            case true:
                                z11 = true;
                                break;
                        }
                        U1 = z11;
                        T1 = true;
                    }
                    if (i7 > 27 || !"HWEML".equals(Build.DEVICE)) {
                        String str3 = Build.MODEL;
                        str3.getClass();
                        switch (str3.hashCode()) {
                            case -349662828:
                                if (str3.equals("AFTJMST12")) {
                                    z9 = false;
                                    break;
                                }
                                z9 = -1;
                                break;
                            case -321033677:
                                if (str3.equals("AFTKMST12")) {
                                    z9 = true;
                                    break;
                                }
                                z9 = -1;
                                break;
                            case 2006354:
                                if (str3.equals("AFTA")) {
                                    z9 = 2;
                                    break;
                                }
                                z9 = -1;
                                break;
                            case 2006367:
                                if (str3.equals("AFTN")) {
                                    z9 = 3;
                                    break;
                                }
                                z9 = -1;
                                break;
                            case 2006371:
                                if (str3.equals("AFTR")) {
                                    z9 = 4;
                                    break;
                                }
                                z9 = -1;
                                break;
                            case 1785421873:
                                if (str3.equals("AFTEU011")) {
                                    z9 = 5;
                                    break;
                                }
                                z9 = -1;
                                break;
                            case 1785421876:
                                if (str3.equals("AFTEU014")) {
                                    z9 = 6;
                                    break;
                                }
                                z9 = -1;
                                break;
                            case 1798172390:
                                if (str3.equals("AFTSO001")) {
                                    z9 = 7;
                                    break;
                                }
                                z9 = -1;
                                break;
                            case 2119412532:
                                if (str3.equals("AFTEUFF014")) {
                                    z9 = 8;
                                    break;
                                }
                                z9 = -1;
                                break;
                            default:
                                z9 = -1;
                                break;
                        }
                        switch (z9) {
                            default:
                                if (i7 <= 26) {
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
                        U1 = z11;
                        T1 = true;
                    }
                    z11 = true;
                    U1 = z11;
                    T1 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return U1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0082, code lost:
    
        if (r3.equals("video/av01") == false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int E0(u2.o oVar, e2.u uVar) {
        int i7 = uVar.z;
        int i10 = uVar.A;
        if (i7 != -1 && i10 != -1) {
            String str = uVar.s;
            str.getClass();
            char c10 = 1;
            if ("video/dolby-vision".equals(str)) {
                Pair b10 = h2.g.b(uVar);
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
                    if (str.equals("video/avc")) {
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
                    return ((i7 * i10) * 3) / 4;
                case 2:
                    return Math.max(TLObject.FLAG_21, ((i7 * i10) * 3) / 4);
                case 4:
                    String str2 = Build.MODEL;
                    if (!"BRAVIA 4K 2015".equals(str2) && (!"Amazon".equals(Build.MANUFACTURER) || (!"KFSOWI".equals(str2) && (!"AFTS".equals(str2) || !oVar.f)))) {
                        return ((m0.g(i10, 16) * m0.g(i7, 16)) * 768) / 4;
                    }
                    break;
                case 6:
                    return ((i7 * i10) * 3) / 8;
            }
        }
        return -1;
    }

    public static List F0(Context context, u2.i iVar, e2.u uVar, boolean z9, boolean z10) {
        String str = uVar.s;
        if (str == null) {
            return t1.e;
        }
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(str) && !f2.i.c(context)) {
            String c10 = u2.w.c(uVar);
            List a10 = c10 == null ? t1.e : iVar.a(c10, z9, z10);
            if (!a10.isEmpty()) {
                return a10;
            }
        }
        return u2.w.g(iVar, uVar, z9, z10);
    }

    public static int G0(u2.o oVar, e2.u uVar) {
        int i7 = uVar.t;
        List list = uVar.v;
        if (i7 == -1) {
            return E0(oVar, uVar);
        }
        int size = list.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += ((byte[]) list.get(i11)).length;
        }
        return uVar.t + i10;
    }

    @Override // u2.r, l2.b
    public final void A(float f10, float f11) {
        super.A(f10, f11);
        k0 k0Var = this.n1;
        if (k0Var != null) {
            k0Var.d(f10);
        } else {
            this.e1.h(f10);
        }
        z zVar = this.i1;
        if (zVar != null) {
            zVar.c(f10);
        }
    }

    @Override // l2.b
    public final boolean E(long j3) {
        if (this.I0 == -9223372036854775807L || j3 < this.C1) {
            return false;
        }
        long j10 = this.Q0;
        return j10 == -9223372036854775807L || j3 > j10;
    }

    @Override // u2.r
    public final l2.e H(u2.o oVar, e2.u uVar, e2.u uVar2, boolean z9) {
        int i7;
        l2.e b10 = oVar.b(uVar, uVar2);
        float f10 = uVar.D;
        float f11 = uVar2.D;
        int i10 = b10.e;
        b7.d dVar = this.k1;
        dVar.getClass();
        if (uVar2.z > dVar.a || uVar2.A > dVar.b) {
            i10 |= 256;
        }
        if (G0(oVar, uVar2) > dVar.c) {
            i10 |= 64;
        }
        if (this.w1 != Integer.MIN_VALUE && (i7 = Build.VERSION.SDK_INT) < 31 && ((i7 != 30 || Build.MODEL.startsWith("MiTV")) && f10 != -1.0f && f11 != -1.0f && (!oVar.f || !z9))) {
            if (Math.abs((Math.max(f11, f10) / Math.min(f11, f10)) - Math.round(r14)) > 0.01f) {
                i10 |= 65536;
            }
        }
        int i11 = i10;
        return new l2.e(oVar.a, uVar, uVar2, i11 != 0 ? 0 : b10.d, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0070 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Surface H0(u2.o oVar) {
        boolean z9;
        m mVar;
        k0 k0Var = this.n1;
        if (k0Var != null) {
            return k0Var.b();
        }
        Surface surface = this.r1;
        if (surface != null) {
            return surface;
        }
        if (Build.VERSION.SDK_INT >= 35 && oVar.h) {
            return null;
        }
        ia.p(P0(oVar));
        n nVar = this.s1;
        if (nVar != null && nVar.a != oVar.f && nVar != null) {
            nVar.release();
            this.s1 = null;
        }
        if (this.s1 == null) {
            Context context = this.Z0;
            boolean z10 = oVar.f;
            boolean z11 = false;
            if (!z10) {
                int i7 = n.d;
            } else if (!n.b(context)) {
                z9 = false;
                ia.p(z9);
                mVar = new m("ExoPlayer:PlaceholderSurface");
                int i10 = !z10 ? n.d : 0;
                mVar.start();
                Handler handler = new Handler(mVar.getLooper(), mVar);
                mVar.b = handler;
                mVar.a = new h2.l(handler);
                synchronized (mVar) {
                    mVar.b.obtainMessage(1, i10, 0).sendToTarget();
                    while (mVar.e == null && mVar.d == null && mVar.c == null) {
                        try {
                            mVar.wait();
                        } catch (InterruptedException unused) {
                            z11 = true;
                        }
                    }
                }
                if (z11) {
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
                this.s1 = nVar2;
            }
            z9 = true;
            ia.p(z9);
            mVar = new m("ExoPlayer:PlaceholderSurface");
            if (!z10) {
            }
            mVar.start();
            Handler handler2 = new Handler(mVar.getLooper(), mVar);
            mVar.b = handler2;
            mVar.a = new h2.l(handler2);
            synchronized (mVar) {
            }
        }
        return this.s1;
    }

    @Override // u2.r
    public final u2.n I(IllegalStateException illegalStateException, u2.o oVar) {
        Surface surface = this.r1;
        h hVar = new h(illegalStateException, oVar);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return hVar;
    }

    public final boolean I0(u2.o oVar) {
        if (this.n1 != null) {
            return true;
        }
        Surface surface = this.r1;
        if (surface == null || !surface.isValid()) {
            return (Build.VERSION.SDK_INT >= 35 && oVar.h) || P0(oVar);
        }
        return true;
    }

    public final boolean J0(k2.h hVar) {
        if (k() || hVar.isLastSample()) {
            return true;
        }
        long j3 = this.P1;
        return j3 == -9223372036854775807L || j3 - (hVar.e - this.P0.c) <= 100000;
    }

    public final void K0() {
        if (this.y1 > 0) {
            this.h.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j3 = elapsedRealtime - this.x1;
            int i7 = this.y1;
            wf.b bVar = this.b1;
            Handler handler = (Handler) bVar.b;
            if (handler != null) {
                handler.post(new f0(bVar, i7, j3));
            }
            this.y1 = 0;
            this.x1 = elapsedRealtime;
        }
    }

    public final void L0() {
        u2.l lVar;
        if (this.K1 && (lVar = this.d0) != null) {
            this.M1 = new k(this, lVar);
            if (Build.VERSION.SDK_INT >= 33) {
                Bundle bundle = new Bundle();
                bundle.putInt("tunnel-peek", 1);
                lVar.setParameters(bundle);
            }
        }
    }

    public final void M0(u2.l lVar, int i7, long j3) {
        Surface surface;
        Trace.beginSection("releaseOutputBuffer");
        lVar.e(i7, j3);
        Trace.endSection();
        this.O0.e++;
        this.z1 = 0;
        if (this.n1 == null) {
            x1 x1Var = this.H1;
            boolean equals = x1Var.equals(x1.d);
            wf.b bVar = this.b1;
            if (!equals && !x1Var.equals(this.I1)) {
                this.I1 = x1Var;
                bVar.m0(x1Var);
            }
            y yVar = this.e1;
            boolean z9 = yVar.e != 3;
            yVar.e = 3;
            yVar.l.getClass();
            yVar.g = m0.S(SystemClock.elapsedRealtime());
            if (!z9 || (surface = this.r1) == null) {
                return;
            }
            bVar.g0(surface);
            this.u1 = true;
        }
    }

    public final void N0(Object obj) {
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        Surface surface2 = this.r1;
        wf.b bVar = this.b1;
        if (surface2 == surface) {
            if (surface != null) {
                x1 x1Var = this.I1;
                if (x1Var != null) {
                    bVar.m0(x1Var);
                }
                Surface surface3 = this.r1;
                if (surface3 == null || !this.u1) {
                    return;
                }
                bVar.g0(surface3);
                return;
            }
            return;
        }
        this.r1 = surface;
        k0 k0Var = this.n1;
        y yVar = this.e1;
        if (k0Var == null) {
            yVar.g(surface);
        }
        this.u1 = false;
        int i7 = this.n;
        u2.l lVar = this.d0;
        if (lVar != null && this.n1 == null) {
            u2.o oVar = this.k0;
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
            x1 x1Var2 = this.I1;
            if (x1Var2 != null) {
                bVar.m0(x1Var2);
            }
        } else {
            this.I1 = null;
            k0 k0Var2 = this.n1;
            if (k0Var2 != null) {
                k0Var2.m();
            }
        }
        if (i7 == 2) {
            k0 k0Var3 = this.n1;
            if (k0Var3 != null) {
                k0Var3.r(true);
            } else {
                yVar.c(true);
            }
        }
        L0();
    }

    @Override // u2.r
    public final int O(k2.h hVar) {
        if (Build.VERSION.SDK_INT >= 34) {
            return ((this.B1 == null && !this.K1) || hVar.e >= this.x || J0(hVar)) ? 0 : 32;
        }
        return 0;
    }

    public final boolean O0(long j3, long j10, boolean z9, boolean z10) {
        int B;
        if (this.n1 != null && this.a1) {
            j10 -= -this.O1;
        }
        if (j3 >= -500000 || z9 || (B = B(j10)) == 0) {
            return false;
        }
        this.C1 = j10;
        PriorityQueue priorityQueue = this.j1;
        if (z10) {
            l2.d dVar = this.O0;
            int i7 = dVar.d + B;
            dVar.d = i7;
            dVar.f += this.A1;
            dVar.d = priorityQueue.size() + i7;
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
        k0 k0Var = this.n1;
        if (k0Var != null) {
            k0Var.o(false);
        }
        return true;
    }

    @Override // u2.r
    public final float P(float f10, e2.u uVar, e2.u[] uVarArr) {
        u2.o oVar;
        float f11 = -1.0f;
        for (e2.u uVar2 : uVarArr) {
            float f12 = uVar2.D;
            if (f12 != -1.0f) {
                f11 = Math.max(f11, f12);
            }
        }
        float f13 = f11 == -1.0f ? -1.0f : f11 * f10;
        if (this.B1 == null || (oVar = this.k0) == null) {
            return f13;
        }
        int i7 = uVar.z;
        int i10 = uVar.A;
        float f14 = -3.4028235E38f;
        if (oVar.i) {
            float f15 = oVar.l;
            if (f15 != -3.4028235E38f && oVar.j == i7 && oVar.k == i10) {
                f14 = f15;
            } else {
                float f16 = 1024.0f;
                if (!oVar.g(i7, i10, 1024.0f)) {
                    f14 = 0.0f;
                    while (true) {
                        float f17 = f16 - f14;
                        if (Math.abs(f17) <= 5.0f) {
                            break;
                        }
                        float f18 = (f17 / 2.0f) + f14;
                        if (oVar.g(i7, i10, f18)) {
                            f14 = f18;
                        } else {
                            f16 = f18;
                        }
                    }
                } else {
                    f14 = 1024.0f;
                }
                oVar.l = f14;
                oVar.j = i7;
                oVar.k = i10;
            }
        }
        return f13 != -1.0f ? Math.max(f13, f14) : f14;
    }

    public final boolean P0(u2.o oVar) {
        if (this.K1 || D0(oVar.a)) {
            return false;
        }
        return !oVar.f || n.b(this.Z0);
    }

    @Override // u2.r
    public final ArrayList Q(u2.i iVar, e2.u uVar, boolean z9) {
        boolean z10 = this.K1;
        Context context = this.Z0;
        List F0 = F0(context, iVar, uVar, z9, z10);
        HashMap hashMap = u2.w.a;
        ArrayList arrayList = new ArrayList(F0);
        Collections.sort(arrayList, new s5(new org.telegram.ui.web.a0(10, context, uVar), 6));
        return arrayList;
    }

    public final void Q0(u2.l lVar, int i7) {
        Trace.beginSection("skipVideoBuffer");
        lVar.c(i7);
        Trace.endSection();
        this.O0.f++;
    }

    public final void R0(int i7, int i10) {
        l2.d dVar = this.O0;
        dVar.h += i7;
        int i11 = i7 + i10;
        dVar.g += i11;
        this.y1 += i11;
        int i12 = this.z1 + i11;
        this.z1 = i12;
        dVar.i = Math.max(i12, dVar.i);
        int i13 = this.c1;
        if (i13 <= 0 || this.y1 < i13) {
            return;
        }
        K0();
    }

    public final void S0(x2.f0 f0Var) {
        l1 l1Var = this.F;
        if (l1Var.p()) {
            this.P1 = -9223372036854775807L;
            return;
        }
        int b10 = l1Var.b(f0Var.a);
        if (b10 == -1) {
            this.P1 = -9223372036854775807L;
        } else {
            this.P1 = l1Var.f(b10, new i1(), false).d;
        }
    }

    @Override // u2.r
    public final b8 T(u2.o oVar, e2.u uVar, MediaCrypto mediaCrypto, float f10) {
        e2.m mVar;
        int i7;
        b7.d dVar;
        Point point;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int i10;
        int i11;
        char c10;
        boolean z9;
        Pair b10;
        int E0;
        String str = oVar.c;
        e2.u[] uVarArr = this.s;
        uVarArr.getClass();
        int i12 = uVar.z;
        float f11 = uVar.D;
        e2.m mVar2 = uVar.I;
        int i13 = uVar.A;
        int G0 = G0(oVar, uVar);
        if (uVarArr.length == 1) {
            if (G0 != -1 && (E0 = E0(oVar, uVar)) != -1) {
                G0 = Math.min((int) (G0 * 1.5f), E0);
            }
            dVar = new b7.d(i12, i13, G0);
            mVar = mVar2;
            i7 = i13;
        } else {
            int length = uVarArr.length;
            int i14 = i12;
            int i15 = i13;
            int i16 = 0;
            boolean z10 = false;
            while (i16 < length) {
                e2.u uVar2 = uVarArr[i16];
                e2.u[] uVarArr2 = uVarArr;
                if (mVar2 != null && uVar2.I == null) {
                    e2.t a10 = uVar2.a();
                    a10.H = mVar2;
                    uVar2 = new e2.u(a10);
                }
                l2.e b11 = oVar.b(uVar, uVar2);
                int i17 = length;
                int i18 = uVar2.A;
                if (b11.d != 0) {
                    int i19 = uVar2.z;
                    i11 = i16;
                    c10 = 65535;
                    z10 |= i19 == -1 || i18 == -1;
                    i14 = Math.max(i14, i19);
                    i15 = Math.max(i15, i18);
                    G0 = Math.max(G0, G0(oVar, uVar2));
                } else {
                    i11 = i16;
                    c10 = 65535;
                }
                length = i17;
                i16 = i11 + 1;
                uVarArr = uVarArr2;
            }
            if (z10) {
                h2.a.l("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + i14 + "x" + i15);
                boolean z11 = i13 > i12;
                int i20 = z11 ? i13 : i12;
                boolean z12 = z11;
                int i21 = z11 ? i12 : i13;
                float f12 = i21 / i20;
                int i22 = 0;
                while (true) {
                    mVar = mVar2;
                    if (i22 >= 9) {
                        break;
                    }
                    int i23 = S1[i22];
                    int i24 = i22;
                    int i25 = (int) (i23 * f12);
                    if (i23 <= i20 || i25 <= i21) {
                        break;
                    }
                    if (!z12) {
                        i25 = i23;
                    }
                    if (!z12) {
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
                        point = new Point(m0.g(i25, widthAlignment) * widthAlignment, m0.g(i23, heightAlignment) * heightAlignment);
                    }
                    if (point != null) {
                        i7 = i13;
                        if (oVar.g(point.x, point.y, f11)) {
                            break;
                        }
                    } else {
                        i7 = i13;
                    }
                    i22 = i24 + 1;
                    i13 = i7;
                    mVar2 = mVar;
                    i21 = i26;
                    i20 = i10;
                }
                i7 = i13;
                point = null;
                if (point != null) {
                    i14 = Math.max(i14, point.x);
                    i15 = Math.max(i15, point.y);
                    e2.t a11 = uVar.a();
                    a11.y = i14;
                    a11.z = i15;
                    G0 = Math.max(G0, E0(oVar, new e2.u(a11)));
                    h2.a.l("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + i14 + "x" + i15);
                }
            } else {
                mVar = mVar2;
                i7 = i13;
            }
            dVar = new b7.d(i14, i15, G0);
        }
        this.k1 = dVar;
        int i27 = this.K1 ? this.L1 : 0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i12);
        mediaFormat.setInteger("height", i7);
        h2.a.k(mediaFormat, uVar.v);
        if (f11 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f11);
        }
        h2.a.j(mediaFormat, "rotation-degrees", uVar.E);
        if (mVar != null) {
            e2.m mVar3 = mVar;
            h2.a.j(mediaFormat, "color-transfer", mVar3.c);
            h2.a.j(mediaFormat, "color-standard", mVar3.a);
            h2.a.j(mediaFormat, "color-range", mVar3.b);
            byte[] bArr = mVar3.d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(uVar.s) && (b10 = h2.g.b(uVar)) != null) {
            h2.a.j(mediaFormat, "profile", ((Integer) b10.first).intValue());
        }
        mediaFormat.setInteger("max-width", dVar.a);
        mediaFormat.setInteger("max-height", dVar.b);
        h2.a.j(mediaFormat, "max-input-size", dVar.c);
        mediaFormat.setInteger("priority", 0);
        if (f10 != -1.0f) {
            mediaFormat.setFloat("operating-rate", f10);
        }
        if (this.d1) {
            z9 = true;
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z9 = true;
        }
        if (i27 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z9);
            mediaFormat.setInteger("audio-session-id", i27);
        }
        if (Build.VERSION.SDK_INT >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.J1));
        }
        F(mediaFormat);
        Surface H0 = H0(oVar);
        if (this.n1 != null && !m0.N(this.Z0)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        return new b8(oVar, mediaFormat, uVar, H0, mediaCrypto, null);
    }

    public final void T0(long j3) {
        l2.d dVar = this.O0;
        dVar.k += j3;
        dVar.l++;
        this.E1 += j3;
        this.F1++;
    }

    @Override // u2.r
    public final void U(k2.h hVar) {
        if (this.m1) {
            ByteBuffer byteBuffer = hVar.f;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b10 = byteBuffer.get();
                short s5 = byteBuffer.getShort();
                short s9 = byteBuffer.getShort();
                byte b11 = byteBuffer.get();
                byte b12 = byteBuffer.get();
                byteBuffer.position(0);
                if (b10 == -75 && s5 == 60 && s9 == 1 && b11 == 4) {
                    if (b12 == 0 || b12 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        u2.l lVar = this.d0;
                        lVar.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        lVar.setParameters(bundle);
                    }
                }
            }
        }
    }

    @Override // u2.r
    public final boolean Z(e2.u uVar) {
        k0 k0Var = this.n1;
        if (k0Var == null || k0Var.v()) {
            return true;
        }
        try {
            return this.n1.j(uVar);
        } catch (j0 e10) {
            throw d(e10, uVar, false, 7000);
        }
    }

    @Override // u2.r
    public final void a0(Exception exc) {
        h2.a.d("MediaCodecVideoRenderer", "Video codec error", exc);
        wf.b bVar = this.b1;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new a4(25, bVar, exc));
        }
    }

    @Override // u2.r
    public final void b0(long j3, String str, long j10) {
        String str2;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        wf.b bVar = this.b1;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            str2 = str;
            handler.post(new h4(bVar, str2, j3, j10, 1));
        } else {
            str2 = str;
        }
        this.l1 = D0(str2);
        u2.o oVar = this.k0;
        oVar.getClass();
        boolean z9 = false;
        if (Build.VERSION.SDK_INT >= 29 && "video/x-vnd.on2.vp9".equals(oVar.b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = oVar.d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            int length = codecProfileLevelArr.length;
            int i7 = 0;
            while (true) {
                if (i7 >= length) {
                    break;
                }
                if (codecProfileLevelArr[i7].profile == 16384) {
                    z9 = true;
                    break;
                }
                i7++;
            }
        }
        this.m1 = z9;
        L0();
    }

    @Override // u2.r, l2.b, l2.m1
    public final void c(int i7, Object obj) {
        if (i7 == 1) {
            N0(obj);
            return;
        }
        if (i7 == 7) {
            obj.getClass();
            w wVar = (w) obj;
            this.N1 = wVar;
            k0 k0Var = this.n1;
            if (k0Var != null) {
                k0Var.c(wVar);
                return;
            }
            return;
        }
        if (i7 == 10) {
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
        if (i7 == 4) {
            obj.getClass();
            int intValue2 = ((Integer) obj).intValue();
            this.v1 = intValue2;
            u2.l lVar = this.d0;
            if (lVar != null) {
                lVar.i(intValue2);
                return;
            }
            return;
        }
        if (i7 == 5) {
            obj.getClass();
            int intValue3 = ((Integer) obj).intValue();
            this.w1 = intValue3;
            k0 k0Var2 = this.n1;
            if (k0Var2 != null) {
                k0Var2.l(intValue3);
                return;
            }
            d0 d0Var = this.e1.b;
            if (d0Var.j == intValue3) {
                return;
            }
            d0Var.j = intValue3;
            d0Var.d(true);
            return;
        }
        if (i7 == 13) {
            obj.getClass();
            List list = (List) obj;
            if (list.equals(v1.a)) {
                k0 k0Var3 = this.n1;
                if (k0Var3 == null || !k0Var3.v()) {
                    return;
                }
                this.n1.t();
                return;
            }
            this.q1 = list;
            k0 k0Var4 = this.n1;
            if (k0Var4 != null) {
                k0Var4.p(list);
                return;
            }
            return;
        }
        if (i7 == 14) {
            obj.getClass();
            h2.y yVar = (h2.y) obj;
            if (yVar.a == 0 || yVar.b == 0) {
                return;
            }
            this.t1 = yVar;
            k0 k0Var5 = this.n1;
            if (k0Var5 != null) {
                Surface surface = this.r1;
                surface.getClass();
                k0Var5.g(surface, yVar);
                return;
            }
            return;
        }
        switch (i7) {
            case 16:
                obj.getClass();
                this.J1 = ((Integer) obj).intValue();
                u2.l lVar2 = this.d0;
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
                ((l) obj).c(1, surface2);
                break;
            case 18:
                boolean z9 = this.B1 != null;
                s1 s1Var = (s1) obj;
                this.B1 = s1Var;
                if (z9 != (s1Var != null)) {
                    A0(this.e0);
                    break;
                }
                break;
            default:
                super.c(i7, obj);
                break;
        }
    }

    @Override // u2.r
    public final void c0(l2.c cVar) {
        wf.b bVar = this.b1;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new a4(23, bVar, cVar));
        }
    }

    @Override // u2.r
    public final void d0(String str) {
        wf.b bVar = this.b1;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new a4(26, bVar, str));
        }
    }

    @Override // u2.r
    public final l2.e e0(wf.b bVar) {
        l2.e e02 = super.e0(bVar);
        e2.u uVar = (e2.u) bVar.c;
        uVar.getClass();
        wf.b bVar2 = this.b1;
        Handler handler = (Handler) bVar2.b;
        if (handler != null) {
            handler.post(new aa.s(bVar2, uVar, e02, 21));
        }
        z zVar = this.i1;
        if (zVar != null) {
            zVar.b();
        }
        return e02;
    }

    @Override // l2.b
    public final void f() {
        k0 k0Var = this.n1;
        if (k0Var == null) {
            y yVar = this.e1;
            if (yVar.e == 0) {
                yVar.e = 1;
                return;
            }
            return;
        }
        int i7 = this.p1;
        if (i7 == 0 || i7 == 1) {
            this.p1 = 0;
        } else {
            k0Var.w();
        }
    }

    @Override // u2.r
    public final void f0(e2.u uVar, MediaFormat mediaFormat) {
        int integer;
        int i7;
        u2.l lVar = this.d0;
        if (lVar != null) {
            lVar.i(this.v1);
        }
        if (this.K1) {
            i7 = uVar.z;
            integer = uVar.A;
        } else {
            mediaFormat.getClass();
            boolean z9 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            int integer2 = z9 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
            integer = z9 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
            i7 = integer2;
        }
        float f10 = uVar.F;
        int i10 = uVar.E;
        if (i10 == 90 || i10 == 270) {
            f10 = 1.0f / f10;
            int i11 = integer;
            integer = i7;
            i7 = i11;
        }
        this.H1 = new x1(f10, i7, integer);
        k0 k0Var = this.n1;
        if (k0Var == null || !this.Q1) {
            this.e1.f(uVar.D);
        } else {
            e2.t a10 = uVar.a();
            a10.y = i7;
            a10.z = integer;
            a10.E = f10;
            e2.u uVar2 = new e2.u(a10);
            int i12 = this.p1;
            List list = this.q1;
            if (list == null) {
                h9.g0 g0Var = h9.i0.b;
                list = t1.e;
            }
            k0Var.u(uVar2, this.P0.b, i12, list);
            this.p1 = 2;
        }
        this.Q1 = false;
    }

    @Override // u2.r
    public final void h0(long j3) {
        super.h0(j3);
        if (this.K1) {
            return;
        }
        this.A1--;
    }

    @Override // l2.b
    public final String i() {
        return "MediaCodecVideoRenderer";
    }

    @Override // u2.r
    public final void i0() {
        k0 k0Var = this.n1;
        if (k0Var != null) {
            k0Var.k();
            if (this.O1 == -9223372036854775807L) {
                this.O1 = this.P0.b;
            }
            this.n1.i(-this.O1);
        } else {
            this.e1.e(2);
        }
        this.Q1 = true;
        L0();
    }

    @Override // u2.r
    public final void j0(k2.h hVar) {
        ByteBuffer byteBuffer;
        wf.b bVar = this.g1;
        if (bVar != null) {
            u2.o oVar = this.k0;
            oVar.getClass();
            if (oVar.b.equals("video/av01") && hVar.isKeyFrame() && (byteBuffer = hVar.c) != null) {
                int position = byteBuffer.position();
                int limit = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit, position + 500));
                ByteBuffer byteBuffer2 = (ByteBuffer) bVar.b;
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

    @Override // l2.b
    public final boolean l() {
        if (!this.K0) {
            return false;
        }
        k0 k0Var = this.n1;
        return k0Var == null || k0Var.a();
    }

    @Override // u2.r
    public final boolean l0(long j3, long j10, u2.l lVar, ByteBuffer byteBuffer, int i7, int i10, int i11, long j11, boolean z9, boolean z10, e2.u uVar) {
        int i12;
        lVar.getClass();
        long j12 = j11 - this.P0.c;
        int i13 = 0;
        while (true) {
            PriorityQueue priorityQueue = this.j1;
            Long l10 = (Long) priorityQueue.peek();
            if (l10 == null || l10.longValue() >= j11) {
                break;
            }
            i13++;
            priorityQueue.poll();
        }
        R0(i13, 0);
        k0 k0Var = this.n1;
        if (k0Var != null) {
            if (!z9 || z10) {
                return k0Var.n(j11, new i(this, lVar, i7, j12));
            }
            Q0(lVar, i7);
            return true;
        }
        int a10 = this.e1.a(j11, j3, j10, this.P0.b, z9, z10, this.f1);
        x xVar = this.f1;
        z zVar = this.i1;
        if (zVar != null && a10 != 5 && a10 != 4) {
            zVar.a(j11, xVar.a);
        }
        if (a10 == 0) {
            this.h.getClass();
            long nanoTime = System.nanoTime();
            w wVar = this.N1;
            if (wVar != null) {
                wVar.b(j12, nanoTime, uVar, this.f0);
            }
            M0(lVar, i7, nanoTime);
            T0(xVar.a);
            return true;
        }
        if (a10 == 1) {
            long j13 = xVar.b;
            long j14 = xVar.a;
            if (j13 == this.G1) {
                Q0(lVar, i7);
            } else {
                w wVar2 = this.N1;
                if (wVar2 != null) {
                    i12 = i7;
                    wVar2.b(j12, j13, uVar, this.f0);
                } else {
                    i12 = i7;
                }
                M0(lVar, i12, j13);
            }
            T0(j14);
            this.G1 = j13;
            return true;
        }
        if (a10 == 2) {
            Trace.beginSection("dropVideoBuffer");
            lVar.c(i7);
            Trace.endSection();
            R0(0, 1);
            T0(xVar.a);
            return true;
        }
        if (a10 == 3) {
            Q0(lVar, i7);
            T0(xVar.a);
            return true;
        }
        if (a10 == 4 || a10 == 5) {
            return false;
        }
        throw new IllegalStateException(String.valueOf(a10));
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
    
        if (android.os.SystemClock.elapsedRealtime() < r7.t0) goto L18;
     */
    @Override // l2.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m() {
        boolean f10;
        boolean z9 = false;
        if (this.U != null) {
            if (k()) {
                f10 = this.D;
            } else {
                b1 b1Var = this.r;
                b1Var.getClass();
                f10 = b1Var.f();
            }
            if (!f10) {
                if (!(this.v0 >= 0)) {
                    if (this.t0 != -9223372036854775807L) {
                        this.h.getClass();
                    }
                }
            }
            z9 = true;
        }
        k0 k0Var = this.n1;
        if (k0Var != null) {
            return k0Var.s(z9);
        }
        if (z9 && (this.d0 == null || this.K1)) {
            return true;
        }
        return this.e1.b(z9);
    }

    @Override // u2.r, l2.b
    public final void n() {
        wf.b bVar = this.b1;
        this.I1 = null;
        this.P1 = -9223372036854775807L;
        L0();
        this.u1 = false;
        this.M1 = null;
        this.D1 = true;
        try {
            super.n();
        } finally {
            bVar.F(this.O0);
            bVar.m0(x1.d);
        }
    }

    @Override // l2.b
    public final void o(boolean z9, boolean z10) {
        k0 k0Var;
        this.O0 = new l2.d();
        q1 q1Var = this.d;
        q1Var.getClass();
        boolean z11 = q1Var.b;
        ia.p((z11 && this.L1 == 0) ? false : true);
        if (this.K1 != z11) {
            this.K1 = z11;
            n0();
        }
        l2.d dVar = this.O0;
        wf.b bVar = this.b1;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new g0(bVar, dVar, 0));
        }
        boolean z12 = this.o1;
        y yVar = this.e1;
        if (!z12) {
            if (this.q1 != null && this.n1 == null) {
                o oVar = new o(this.Z0, yVar);
                oVar.d = true;
                long j3 = this.h1;
                oVar.g = j3 != -9223372036854775807L ? -j3 : -9223372036854775807L;
                h2.g0 g0Var = this.h;
                g0Var.getClass();
                oVar.e = g0Var;
                ia.p(!oVar.f);
                if (oVar.c == null) {
                    oVar.c = new s();
                }
                u uVar = new u(oVar);
                oVar.f = true;
                if (1 >= uVar.p) {
                    uVar.p = 1;
                }
                SparseArray sparseArray = uVar.c;
                if (m0.k(sparseArray, 0)) {
                    k0Var = (k0) sparseArray.get(0);
                } else {
                    p pVar = new p(uVar, uVar.a);
                    uVar.g.add(pVar);
                    sparseArray.put(0, pVar);
                    k0Var = pVar;
                }
                this.n1 = k0Var;
            }
            this.o1 = true;
        }
        k0 k0Var2 = this.n1;
        if (k0Var2 == null) {
            h2.g0 g0Var2 = this.h;
            g0Var2.getClass();
            yVar.l = g0Var2;
            yVar.e(!z10 ? 1 : 0);
            return;
        }
        k0Var2.e(new cb.c(this, 17));
        w wVar = this.N1;
        if (wVar != null) {
            this.n1.c(wVar);
        }
        if (this.r1 != null && !this.t1.equals(h2.y.c)) {
            this.n1.g(this.r1, this.t1);
        }
        this.n1.l(this.w1);
        this.n1.d(this.b0);
        List list = this.q1;
        if (list != null) {
            this.n1.p(list);
        }
        this.p1 = !z10 ? 1 : 0;
        this.S0 = true;
    }

    @Override // u2.r
    public final void o0() {
        k0 k0Var = this.n1;
        if (k0Var != null) {
            k0Var.k();
        } else {
            long j3 = this.P0.f;
        }
    }

    @Override // u2.r, l2.b
    public final void p(long j3, boolean z9, boolean z10) {
        k0 k0Var = this.n1;
        if (k0Var != null && !z9) {
            k0Var.o(true);
        }
        if (z10) {
            this.C1 = j3;
        }
        super.p(j3, z9, z10);
        k0 k0Var2 = this.n1;
        y yVar = this.e1;
        if (k0Var2 == null) {
            yVar.b.b();
            yVar.h = -9223372036854775807L;
            yVar.f = -9223372036854775807L;
            yVar.e = Math.min(yVar.e, 1);
            yVar.i = -9223372036854775807L;
            yVar.n = false;
        }
        z zVar = this.i1;
        if (zVar != null) {
            zVar.b();
        }
        if (z9) {
            k0 k0Var3 = this.n1;
            if (k0Var3 != null) {
                k0Var3.r(false);
            } else {
                yVar.c(false);
            }
        }
        L0();
        this.z1 = 0;
    }

    @Override // l2.b
    public final void q() {
        k0 k0Var = this.n1;
        if (k0Var == null || !this.a1) {
            return;
        }
        k0Var.release();
    }

    @Override // u2.r
    public final void q0() {
        super.q0();
        this.j1.clear();
        this.A1 = 0;
        this.R1 = 0;
        this.D1 = false;
        wf.b bVar = this.g1;
        if (bVar != null) {
            bVar.c = null;
            ByteBuffer byteBuffer = (ByteBuffer) bVar.b;
            byteBuffer.position(byteBuffer.limit());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l2.b
    public final void r() {
        try {
            try {
                this.y0 = false;
                p0();
                n0();
            } finally {
                f1.B(this.X, null);
                this.X = null;
            }
        } finally {
            this.o1 = false;
            this.O1 = -9223372036854775807L;
            n nVar = this.s1;
            if (nVar != null) {
                nVar.release();
                this.s1 = null;
            }
        }
    }

    @Override // l2.b
    public final void s() {
        this.y1 = 0;
        this.h.getClass();
        this.x1 = SystemClock.elapsedRealtime();
        this.E1 = 0L;
        this.F1 = 0;
        k0 k0Var = this.n1;
        if (k0Var != null) {
            k0Var.h();
        } else {
            this.e1.d();
        }
    }

    @Override // l2.b
    public final void t() {
        K0();
        int i7 = this.F1;
        if (i7 != 0) {
            long j3 = this.E1;
            wf.b bVar = this.b1;
            Handler handler = (Handler) bVar.b;
            if (handler != null) {
                handler.post(new f0(bVar, j3, i7));
            }
            this.E1 = 0L;
            this.F1 = 0;
        }
        k0 k0Var = this.n1;
        if (k0Var != null) {
            k0Var.f();
        } else {
            y yVar = this.e1;
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
        z zVar = this.i1;
        if (zVar != null) {
            zVar.b();
        }
    }

    @Override // u2.r, l2.b
    public final void u(e2.u[] uVarArr, long j3, long j10, x2.f0 f0Var) {
        super.u(uVarArr, j3, j10, f0Var);
        S0(f0Var);
        z zVar = this.i1;
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
    
        r2 = ((i2.q) r3.get(r7)).b.limit();
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0102, code lost:
    
        r2 = r5.position();
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0054  */
    @Override // u2.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean u0(k2.h hVar) {
        boolean z9;
        ByteBuffer byteBuffer;
        i2.r rVar;
        ci.a aVar;
        boolean z10 = false;
        if (!J0(hVar)) {
            boolean z11 = hVar.e < this.x;
            z zVar = this.i1;
            if (zVar != null) {
                long j3 = zVar.a == -9223372036854775807L ? -9223372036854775807L : (long) (((r2 - r6) * zVar.c) + zVar.b);
                if (j3 != -9223372036854775807L && j3 < this.h1) {
                    z9 = true;
                    if ((!z11 || z9) && !hVar.hasSupplementalData()) {
                        if (hVar.notDependedOn()) {
                            wf.b bVar = this.g1;
                            if (bVar != null) {
                                ByteBuffer byteBuffer2 = (ByteBuffer) bVar.b;
                                u2.o oVar = this.k0;
                                oVar.getClass();
                                if (oVar.b.equals("video/av01") && (byteBuffer = hVar.c) != null) {
                                    boolean z12 = z11 || this.R1 <= 0;
                                    ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                                    asReadOnlyBuffer.flip();
                                    if (byteBuffer2.hasRemaining()) {
                                        bVar.l0(i2.o.o(byteBuffer2));
                                        byteBuffer2.position(byteBuffer2.limit());
                                    }
                                    ArrayList o4 = i2.o.o(asReadOnlyBuffer);
                                    bVar.l0(o4);
                                    int size = o4.size() - 1;
                                    int i7 = 0;
                                    while (size >= 0) {
                                        i2.q qVar = (i2.q) o4.get(size);
                                        int i10 = qVar.a;
                                        if (i10 != 2 && i10 != 15) {
                                            if ((i10 == 3 && !z12) || ((i10 != 6 && i10 != 3) || (rVar = (i2.r) bVar.c) == null)) {
                                                break;
                                            }
                                            try {
                                                aVar = new ci.a(rVar, qVar);
                                            } catch (i2.p unused) {
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
                                        if (((i2.q) o4.get(size)).a == 6 || ((i2.q) o4.get(size)).a == 3) {
                                            i7++;
                                        }
                                        size--;
                                    }
                                    int limit = asReadOnlyBuffer.limit();
                                    if (limit == 0) {
                                        hVar.clear();
                                    } else if (limit != asReadOnlyBuffer.limit()) {
                                        b7.d dVar = this.k1;
                                        dVar.getClass();
                                        if (dVar.c + limit < asReadOnlyBuffer.capacity() && !hVar.getFlag(TLObject.FLAG_30)) {
                                            ByteBuffer byteBuffer3 = hVar.c;
                                            byteBuffer3.getClass();
                                            byteBuffer3.position(limit);
                                        }
                                    }
                                }
                            }
                            if (z10) {
                                if (z11) {
                                    this.O0.d++;
                                } else {
                                    this.j1.add(Long.valueOf(hVar.e));
                                    this.R1++;
                                }
                            }
                            return z10;
                        }
                        hVar.clear();
                        z10 = true;
                        if (z10) {
                        }
                        return z10;
                    }
                }
            }
            z9 = false;
            if (!z11) {
            }
            if (hVar.notDependedOn()) {
            }
            z10 = true;
            if (z10) {
            }
            return z10;
        }
        return false;
    }

    @Override // l2.b
    public final void v() {
        x2.f0 f0Var = this.G;
        if (f0Var != null) {
            S0(f0Var);
        }
    }

    @Override // u2.r
    public final boolean v0() {
        boolean z9;
        e2.u uVar = this.e0;
        long j3 = this.P1;
        if (j3 != -9223372036854775807L) {
            if (this.U0 + 1 + j3 <= Long.MAX_VALUE - (this.P0.c + j3)) {
                z9 = false;
                return this.B1 == null || this.D1 || this.K1 || (uVar != null && uVar.u > 0) || z9 || this.P0.f != -9223372036854775807L;
            }
        }
        z9 = true;
        if (this.B1 == null) {
        }
    }

    @Override // u2.r
    public final boolean w0(u2.o oVar) {
        return I0(oVar);
    }

    @Override // u2.r, l2.b
    public final void x(long j3, long j10) {
        k0 k0Var = this.n1;
        if (k0Var != null) {
            try {
                k0Var.q(j3, j10);
            } catch (j0 e10) {
                throw d(e10, e10.a, false, 7001);
            }
        }
        super.x(j3, j10);
    }

    @Override // u2.r
    public final boolean x0() {
        u2.o oVar = this.k0;
        if (this.n1 != null && oVar != null) {
            String str = oVar.a;
            if (str.equals("c2.mtk.avc.decoder") || str.equals("c2.mtk.hevc.decoder")) {
                return true;
            }
        }
        return super.x0();
    }

    @Override // u2.r
    public final int z0(u2.i iVar, e2.u uVar) {
        boolean z9;
        int i7 = 0;
        if (!s0.m(uVar.s)) {
            return jg.g.b(0, 0, 0, 0);
        }
        boolean z10 = uVar.w != null;
        Context context = this.Z0;
        List F0 = F0(context, iVar, uVar, z10, false);
        if (z10 && F0.isEmpty()) {
            F0 = F0(context, iVar, uVar, false, false);
        }
        if (F0.isEmpty()) {
            return jg.g.b(1, 0, 0, 0);
        }
        int i10 = uVar.T;
        if (i10 != 0 && i10 != 2) {
            return jg.g.b(2, 0, 0, 0);
        }
        u2.o oVar = (u2.o) F0.get(0);
        boolean e10 = oVar.e(context, uVar);
        if (!e10) {
            for (int i11 = 1; i11 < F0.size(); i11++) {
                u2.o oVar2 = (u2.o) F0.get(i11);
                if (oVar2.e(context, uVar)) {
                    z9 = false;
                    e10 = true;
                    oVar = oVar2;
                    break;
                }
            }
        }
        z9 = true;
        int i12 = e10 ? 4 : 3;
        int i13 = oVar.f(uVar) ? 16 : 8;
        int i14 = oVar.g ? 64 : 0;
        int i15 = z9 ? 128 : 0;
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(uVar.s) && !f2.i.c(context)) {
            i15 = 256;
        }
        if (e10) {
            List F02 = F0(context, iVar, uVar, z10, true);
            if (!F02.isEmpty()) {
                HashMap hashMap = u2.w.a;
                ArrayList arrayList = new ArrayList(F02);
                Collections.sort(arrayList, new s5(new org.telegram.ui.web.a0(10, context, uVar), 6));
                u2.o oVar3 = (u2.o) arrayList.get(0);
                if (oVar3.e(context, uVar) && oVar3.f(uVar)) {
                    i7 = 32;
                }
            }
        }
        return i12 | i13 | i7 | i14 | i15;
    }
}
