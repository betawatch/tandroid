// default package

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
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public class bn6 extends qm6 {
    public static final int[] V1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    public static boolean W1;
    public static boolean X1;
    public int A1;
    public long B1;
    public int C1;
    public int D1;
    public int E1;
    public fv9 F1;
    public long G1;
    public boolean H1;
    public long I1;
    public int J1;
    public long K1;
    public ggc L1;
    public ggc M1;
    public int N1;
    public boolean O1;
    public int P1;
    public an6 Q1;
    public sec R1;
    public long S1;
    public boolean T1;
    public int U1;
    public final Context a1;
    public final boolean b1;
    public final k7b c1;
    public final byte d1;
    public final boolean e1;
    public final uec f1;
    public final ry0 g1;
    public final zj4 h1;
    public final qx6 i1;
    public final long j1;
    public final vec k1;
    public final PriorityQueue l1;
    public rc0 m1;
    public boolean n1;
    public boolean o1;
    public boolean p1;
    public boolean q1;
    public fgc r1;
    public boolean s1;
    public int t1;
    public List u1;
    public Surface v1;
    public df8 w1;
    public rma x1;
    public boolean y1;
    public int z1;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public bn6(zm6 zm6Var) {
        super(r0.getApplicationContext(), 2, zm6Var.c);
        Context context = zm6Var.a;
        Context applicationContext = context.getApplicationContext();
        this.a1 = applicationContext;
        this.d1 = zm6Var.g;
        this.r1 = null;
        this.c1 = new k7b(zm6Var.e, zm6Var.f);
        byte b = 1;
        this.b1 = this.r1 == null;
        this.f1 = new uec(applicationContext, this, zm6Var.d);
        this.g1 = new ry0();
        this.h1 = new zj4(new bm6(this, b));
        HashSet hashSet = gt6.a;
        this.e1 = "NVIDIA".equals(Build.MANUFACTURER);
        this.x1 = rma.c;
        this.z1 = 1;
        this.A1 = 0;
        this.L1 = ggc.d;
        this.P1 = 0;
        this.M1 = null;
        this.N1 = -1000;
        this.S1 = -9223372036854775807L;
        this.i1 = new qx6((byte) 6);
        this.l1 = new PriorityQueue();
        this.j1 = -15000L;
        this.k1 = new vec();
        this.F1 = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x064c, code lost:
    
        if (r0.equals("ELUGA_Ray_X") == false) goto L503;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0796, code lost:
    
        if (r13.equals("JSN-L21") != false) goto L508;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0798 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean J0(String str) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (bn6.class) {
            if (!W1) {
                HashSet hashSet = gt6.a;
                int i = Build.VERSION.SDK_INT;
                char c = 28;
                if (i <= 28) {
                    String str2 = Build.DEVICE;
                    str2.getClass();
                    switch (str2.hashCode()) {
                        case -1339091551:
                            if (str2.equals("dangal")) {
                                z2 = false;
                                break;
                            }
                            z2 = -1;
                            break;
                        case -1220081023:
                            if (str2.equals("dangalFHD")) {
                                z2 = true;
                                break;
                            }
                            z2 = -1;
                            break;
                        case -1220066608:
                            if (str2.equals("dangalUHD")) {
                                z2 = 2;
                                break;
                            }
                            z2 = -1;
                            break;
                        case -1012436106:
                            if (str2.equals("oneday")) {
                                z2 = 3;
                                break;
                            }
                            z2 = -1;
                            break;
                        case -760312546:
                            if (str2.equals("aquaman")) {
                                z2 = 4;
                                break;
                            }
                            z2 = -1;
                            break;
                        case -64886864:
                            if (str2.equals("magnolia")) {
                                z2 = 5;
                                break;
                            }
                            z2 = -1;
                            break;
                        case 3415681:
                            if (str2.equals("once")) {
                                z2 = 6;
                                break;
                            }
                            z2 = -1;
                            break;
                        case 825323514:
                            if (str2.equals("machuca")) {
                                z2 = 7;
                                break;
                            }
                            z2 = -1;
                            break;
                        default:
                            z2 = -1;
                            break;
                    }
                    switch (z2) {
                        case false:
                        case true:
                        case true:
                        case true:
                        case true:
                        case true:
                        case true:
                        case true:
                            z3 = true;
                            break;
                    }
                    X1 = z3;
                    W1 = true;
                }
                if (i > 27 || !"HWEML".equals(Build.DEVICE)) {
                    String str3 = Build.MODEL;
                    str3.getClass();
                    switch (str3.hashCode()) {
                        case -349662828:
                            if (str3.equals("AFTJMST12")) {
                                z = false;
                                break;
                            }
                            z = -1;
                            break;
                        case -321033677:
                            if (str3.equals("AFTKMST12")) {
                                z = true;
                                break;
                            }
                            z = -1;
                            break;
                        case 2006354:
                            if (str3.equals("AFTA")) {
                                z = 2;
                                break;
                            }
                            z = -1;
                            break;
                        case 2006367:
                            if (str3.equals("AFTN")) {
                                z = 3;
                                break;
                            }
                            z = -1;
                            break;
                        case 2006371:
                            if (str3.equals("AFTR")) {
                                z = 4;
                                break;
                            }
                            z = -1;
                            break;
                        case 1785421873:
                            if (str3.equals("AFTEU011")) {
                                z = 5;
                                break;
                            }
                            z = -1;
                            break;
                        case 1785421876:
                            if (str3.equals("AFTEU014")) {
                                z = 6;
                                break;
                            }
                            z = -1;
                            break;
                        case 1798172390:
                            if (str3.equals("AFTSO001")) {
                                z = 7;
                                break;
                            }
                            z = -1;
                            break;
                        case 2119412532:
                            if (str3.equals("AFTEUFF014")) {
                                z = 8;
                                break;
                            }
                            z = -1;
                            break;
                        default:
                            z = -1;
                            break;
                    }
                    switch (z) {
                        default:
                            if (i <= 26) {
                                String str4 = Build.DEVICE;
                                str4.getClass();
                                switch (str4.hashCode()) {
                                    case -2144781245:
                                        if (str4.equals("GIONEE_SWW1609")) {
                                            c = 0;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -2144781185:
                                        if (str4.equals("GIONEE_SWW1627")) {
                                            c = 1;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -2144781160:
                                        if (str4.equals("GIONEE_SWW1631")) {
                                            c = 2;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -2097309513:
                                        if (str4.equals("K50a40")) {
                                            c = 3;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -2022874474:
                                        if (str4.equals("CP8676_I02")) {
                                            c = 4;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1978993182:
                                        if (str4.equals("NX541J")) {
                                            c = 5;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1978990237:
                                        if (str4.equals("NX573J")) {
                                            c = 6;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1936688988:
                                        if (str4.equals("PGN528")) {
                                            c = 7;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1936688066:
                                        if (str4.equals("PGN610")) {
                                            c = '\b';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1936688065:
                                        if (str4.equals("PGN611")) {
                                            c = '\t';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1931988508:
                                        if (str4.equals("AquaPowerM")) {
                                            c = '\n';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1885099851:
                                        if (str4.equals("RAIJIN")) {
                                            c = 11;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1696512866:
                                        if (str4.equals("XT1663")) {
                                            c = '\f';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1680025915:
                                        if (str4.equals("ComioS1")) {
                                            c = '\r';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1615810839:
                                        if (str4.equals("Phantom6")) {
                                            c = 14;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1600724499:
                                        if (str4.equals("pacificrim")) {
                                            c = 15;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1554255044:
                                        if (str4.equals("vernee_M5")) {
                                            c = 16;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1481772737:
                                        if (str4.equals("panell_dl")) {
                                            c = 17;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1481772730:
                                        if (str4.equals("panell_ds")) {
                                            c = 18;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1481772729:
                                        if (str4.equals("panell_dt")) {
                                            c = 19;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1320080169:
                                        if (str4.equals("GiONEE_GBL7319")) {
                                            c = 20;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1217592143:
                                        if (str4.equals("BRAVIA_ATV2")) {
                                            c = 21;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1180384755:
                                        if (str4.equals("iris60")) {
                                            c = 22;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1139198265:
                                        if (str4.equals("Slate_Pro")) {
                                            c = 23;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1052835013:
                                        if (str4.equals("namath")) {
                                            c = 24;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -993250464:
                                        if (str4.equals("A10-70F")) {
                                            c = 25;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -993250458:
                                        if (str4.equals("A10-70L")) {
                                            c = 26;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -965403638:
                                        if (str4.equals("s905x018")) {
                                            c = 27;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -958336948:
                                        break;
                                    case -879245230:
                                        if (str4.equals("tcl_eu")) {
                                            c = 29;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -842500323:
                                        if (str4.equals("nicklaus_f")) {
                                            c = 30;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -821392978:
                                        if (str4.equals("A7000-a")) {
                                            c = 31;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -797483286:
                                        if (str4.equals("SVP-DTV15")) {
                                            c = ' ';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -794946968:
                                        if (str4.equals("watson")) {
                                            c = '!';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -788334647:
                                        if (str4.equals("whyred")) {
                                            c = '\"';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -782144577:
                                        if (str4.equals("OnePlus5T")) {
                                            c = '#';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -575125681:
                                        if (str4.equals("GiONEE_CBL7513")) {
                                            c = '$';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -521118391:
                                        if (str4.equals("GIONEE_GBL7360")) {
                                            c = '%';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -430914369:
                                        if (str4.equals("Pixi4-7_3G")) {
                                            c = '&';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -290434366:
                                        if (str4.equals("taido_row")) {
                                            c = '\'';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -282781963:
                                        if (str4.equals("BLACK-1X")) {
                                            c = '(';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -277133239:
                                        if (str4.equals("Z12_PRO")) {
                                            c = ')';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -173639913:
                                        if (str4.equals("ELUGA_A3_Pro")) {
                                            c = '*';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -56598463:
                                        if (str4.equals("woods_fn")) {
                                            c = '+';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2126:
                                        if (str4.equals("C1")) {
                                            c = ',';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2564:
                                        if (str4.equals("Q5")) {
                                            c = '-';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2715:
                                        if (str4.equals("V1")) {
                                            c = '.';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2719:
                                        if (str4.equals("V5")) {
                                            c = '/';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 3091:
                                        if (str4.equals("b5")) {
                                            c = '0';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 3483:
                                        if (str4.equals("mh")) {
                                            c = '1';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 73405:
                                        if (str4.equals("JGZ")) {
                                            c = '2';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 75537:
                                        if (str4.equals("M04")) {
                                            c = '3';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 75739:
                                        if (str4.equals("M5c")) {
                                            c = '4';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 76779:
                                        if (str4.equals("MX6")) {
                                            c = '5';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 78669:
                                        if (str4.equals("P85")) {
                                            c = '6';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 79305:
                                        if (str4.equals("PLE")) {
                                            c = '7';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 80618:
                                        if (str4.equals("QX1")) {
                                            c = '8';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 88274:
                                        if (str4.equals("Z80")) {
                                            c = '9';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 98846:
                                        if (str4.equals("cv1")) {
                                            c = ':';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 98848:
                                        if (str4.equals("cv3")) {
                                            c = ';';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 99329:
                                        if (str4.equals("deb")) {
                                            c = '<';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 101481:
                                        if (str4.equals("flo")) {
                                            c = '=';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1513190:
                                        if (str4.equals("1601")) {
                                            c = '>';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1514184:
                                        if (str4.equals("1713")) {
                                            c = '?';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1514185:
                                        if (str4.equals("1714")) {
                                            c = '@';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2133089:
                                        if (str4.equals("F01H")) {
                                            c = 'A';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2133091:
                                        if (str4.equals("F01J")) {
                                            c = 'B';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2133120:
                                        if (str4.equals("F02H")) {
                                            c = 'C';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2133151:
                                        if (str4.equals("F03H")) {
                                            c = 'D';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2133182:
                                        if (str4.equals("F04H")) {
                                            c = 'E';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2133184:
                                        if (str4.equals("F04J")) {
                                            c = 'F';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2436959:
                                        if (str4.equals("P681")) {
                                            c = 'G';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2463773:
                                        if (str4.equals("Q350")) {
                                            c = 'H';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2464648:
                                        if (str4.equals("Q427")) {
                                            c = 'I';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2689555:
                                        if (str4.equals("XE2X")) {
                                            c = 'J';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 3154429:
                                        if (str4.equals("fugu")) {
                                            c = 'K';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 3284551:
                                        if (str4.equals("kate")) {
                                            c = 'L';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 3351335:
                                        if (str4.equals("mido")) {
                                            c = 'M';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 3386211:
                                        if (str4.equals("p212")) {
                                            c = 'N';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 41325051:
                                        if (str4.equals("MEIZU_M5")) {
                                            c = 'O';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 51349633:
                                        if (str4.equals("601LV")) {
                                            c = 'P';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 51350594:
                                        if (str4.equals("602LV")) {
                                            c = 'Q';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 55178625:
                                        if (str4.equals("Aura_Note_2")) {
                                            c = 'R';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 61542055:
                                        if (str4.equals("A1601")) {
                                            c = 'S';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 65355429:
                                        if (str4.equals("E5643")) {
                                            c = 'T';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 66214468:
                                        if (str4.equals("F3111")) {
                                            c = 'U';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 66214470:
                                        if (str4.equals("F3113")) {
                                            c = 'V';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 66214473:
                                        if (str4.equals("F3116")) {
                                            c = 'W';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 66215429:
                                        if (str4.equals("F3211")) {
                                            c = 'X';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 66215431:
                                        if (str4.equals("F3213")) {
                                            c = 'Y';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 66215433:
                                        if (str4.equals("F3215")) {
                                            c = 'Z';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 66216390:
                                        if (str4.equals("F3311")) {
                                            c = '[';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 76402249:
                                        if (str4.equals("PRO7S")) {
                                            c = '\\';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 76404105:
                                        if (str4.equals("Q4260")) {
                                            c = ']';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 76404911:
                                        if (str4.equals("Q4310")) {
                                            c = '^';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 80963634:
                                        if (str4.equals("V23GB")) {
                                            c = '_';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 82882791:
                                        if (str4.equals("X3_HK")) {
                                            c = '`';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 98715550:
                                        if (str4.equals("i9031")) {
                                            c = 'a';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 101370885:
                                        if (str4.equals("l5460")) {
                                            c = 'b';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 102844228:
                                        if (str4.equals("le_x6")) {
                                            c = 'c';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 165221241:
                                        if (str4.equals("A2016a40")) {
                                            c = 'd';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 182191441:
                                        if (str4.equals("CPY83_I00")) {
                                            c = 'e';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 245388979:
                                        if (str4.equals("marino_f")) {
                                            c = 'f';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 287431619:
                                        if (str4.equals("griffin")) {
                                            c = 'g';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 307593612:
                                        if (str4.equals("A7010a48")) {
                                            c = 'h';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 308517133:
                                        if (str4.equals("A7020a48")) {
                                            c = 'i';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 316215098:
                                        if (str4.equals("TB3-730F")) {
                                            c = 'j';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 316215116:
                                        if (str4.equals("TB3-730X")) {
                                            c = 'k';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 316246811:
                                        if (str4.equals("TB3-850F")) {
                                            c = 'l';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 316246818:
                                        if (str4.equals("TB3-850M")) {
                                            c = 'm';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 407160593:
                                        if (str4.equals("Pixi5-10_4G")) {
                                            c = 'n';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 507412548:
                                        if (str4.equals("QM16XE_U")) {
                                            c = 'o';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 793982701:
                                        if (str4.equals("GIONEE_WBL5708")) {
                                            c = 'p';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 794038622:
                                        if (str4.equals("GIONEE_WBL7365")) {
                                            c = 'q';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 794040393:
                                        if (str4.equals("GIONEE_WBL7519")) {
                                            c = 'r';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 835649806:
                                        if (str4.equals("manning")) {
                                            c = 's';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 917340916:
                                        if (str4.equals("A7000plus")) {
                                            c = 't';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 958008161:
                                        if (str4.equals("j2xlteins")) {
                                            c = 'u';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1060579533:
                                        if (str4.equals("panell_d")) {
                                            c = 'v';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1150207623:
                                        if (str4.equals("LS-5017")) {
                                            c = 'w';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1176899427:
                                        if (str4.equals("itel_S41")) {
                                            c = 'x';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1280332038:
                                        if (str4.equals("hwALE-H")) {
                                            c = 'y';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1306947716:
                                        if (str4.equals("EverStar_S")) {
                                            c = 'z';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1349174697:
                                        if (str4.equals("htc_e56ml_dtul")) {
                                            c = '{';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1522194893:
                                        if (str4.equals("woods_f")) {
                                            c = '|';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1691543273:
                                        if (str4.equals("CPH1609")) {
                                            c = '}';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1691544261:
                                        if (str4.equals("CPH1715")) {
                                            c = '~';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1709443163:
                                        if (str4.equals("iball8735_9806")) {
                                            c = 127;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1865889110:
                                        if (str4.equals("santoni")) {
                                            c = 128;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1906253259:
                                        if (str4.equals("PB2-670M")) {
                                            c = 129;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1977196784:
                                        if (str4.equals("Infinix-X572")) {
                                            c = 130;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2006372676:
                                        if (str4.equals("BRAVIA_ATV3_4K")) {
                                            c = 131;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2019281702:
                                        if (str4.equals("DM-01K")) {
                                            c = 132;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2029784656:
                                        if (str4.equals("HWBLN-H")) {
                                            c = 133;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2030379515:
                                        if (str4.equals("HWCAM-H")) {
                                            c = 134;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2033393791:
                                        if (str4.equals("ASUS_X00AD_2")) {
                                            c = 135;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2047190025:
                                        if (str4.equals("ELUGA_Note")) {
                                            c = 136;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2047252157:
                                        if (str4.equals("ELUGA_Prim")) {
                                            c = 137;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2048319463:
                                        if (str4.equals("HWVNS-H")) {
                                            c = 138;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2048855701:
                                        if (str4.equals("HWWAS-H")) {
                                            c = 139;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    default:
                                        c = 65535;
                                        break;
                                }
                                switch (c) {
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
                    X1 = z3;
                    W1 = true;
                }
                z3 = true;
                X1 = z3;
                W1 = true;
            }
        }
        return X1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0079, code lost:
    
        if (r3.equals("video/av01") == false) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int K0(nm6 nm6Var, ko4 ko4Var) {
        int i = ko4Var.A;
        int i2 = ko4Var.B;
        if (i != -1 && i2 != -1) {
            String str = ko4Var.t;
            str.getClass();
            char c = 1;
            if ("video/dolby-vision".equals(str)) {
                Pair b = rk2.b(ko4Var);
                if (b != null) {
                    int intValue = ((Integer) b.first).intValue();
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
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1662735862:
                    break;
                case -1662541442:
                    if (str.equals("video/hevc")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 1187890754:
                    if (str.equals("video/mp4v-es")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 1331836730:
                    if (str.equals("video/avc")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 1599127256:
                    if (str.equals("video/x-vnd.on2.vp8")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 1599127257:
                    if (str.equals("video/x-vnd.on2.vp9")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                case 1:
                case 3:
                case 5:
                    return ((i * i2) * 3) / 4;
                case 2:
                    return Math.max(TLObject.FLAG_21, ((i * i2) * 3) / 4);
                case 4:
                    HashSet hashSet = gt6.a;
                    String str2 = Build.MODEL;
                    if (!"BRAVIA 4K 2015".equals(str2) && (!"Amazon".equals(Build.MANUFACTURER) || (!"KFSOWI".equals(str2) && (!"AFTS".equals(str2) || !nm6Var.f)))) {
                        return (((gcc.g(i2, 16) * gcc.g(i, 16)) << 8) * 3) / 4;
                    }
                    break;
                case 6:
                    return ((i * i2) * 3) / 8;
            }
        }
        return -1;
    }

    public static List L0(Context context, ko4 ko4Var, boolean z, boolean z2) {
        List e;
        String str = ko4Var.t;
        if (str == null) {
            no5 no5Var = po5.b;
            return j99.e;
        }
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(str) && !qq5.b(context)) {
            String c = wm6.c(ko4Var);
            if (c == null) {
                no5 no5Var2 = po5.b;
                e = j99.e;
            } else {
                e = wm6.e(c, z, z2);
            }
            if (!e.isEmpty()) {
                return e;
            }
        }
        return wm6.g(ko4Var, z, z2);
    }

    public static int M0(nm6 nm6Var, ko4 ko4Var) {
        int i = ko4Var.u;
        List list = ko4Var.w;
        if (i == -1) {
            return K0(nm6Var, ko4Var);
        }
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += ((byte[]) list.get(i3)).length;
        }
        return ko4Var.u + i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00eb, code lost:
    
        if ((r7 + 1) >= 8) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ed, code lost:
    
        if (r7 < 0) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ef, code lost:
    
        r2 = ((er7) r3.get(r7)).b.limit();
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00fc, code lost:
    
        r2 = r5.position();
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0052  */
    @Override // qm6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean A0(s93 s93Var) {
        boolean z;
        ByteBuffer byteBuffer;
        fr7 fr7Var;
        jp5 jp5Var;
        boolean z2 = false;
        if (!P0(s93Var)) {
            boolean z3 = s93Var.e < this.x;
            vec vecVar = this.k1;
            if (vecVar != null) {
                long j = vecVar.a == -9223372036854775807L ? -9223372036854775807L : (long) (((r2 - r6) * vecVar.c) + vecVar.b);
                if (j != -9223372036854775807L && j < this.j1) {
                    z = true;
                    if ((!z3 || z) && !s93Var.hasSupplementalData()) {
                        if (s93Var.notDependedOn()) {
                            qx6 qx6Var = this.i1;
                            if (qx6Var != null) {
                                ByteBuffer byteBuffer2 = (ByteBuffer) qx6Var.b;
                                nm6 nm6Var = this.j0;
                                nm6Var.getClass();
                                if (nm6Var.b.equals("video/av01") && (byteBuffer = s93Var.c) != null) {
                                    boolean z4 = z3 || this.U1 <= 0;
                                    ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                                    asReadOnlyBuffer.flip();
                                    if (byteBuffer2.hasRemaining()) {
                                        qx6Var.Q(wue.b(byteBuffer2));
                                        byteBuffer2.position(byteBuffer2.limit());
                                    }
                                    ArrayList b = wue.b(asReadOnlyBuffer);
                                    qx6Var.Q(b);
                                    int size = b.size() - 1;
                                    int i = 0;
                                    while (size >= 0) {
                                        er7 er7Var = (er7) b.get(size);
                                        byte b2 = er7Var.a;
                                        if (b2 != 2 && b2 != 15) {
                                            if ((b2 == 3 && !z4) || ((b2 != 6 && b2 != 3) || (fr7Var = (fr7) qx6Var.c) == null)) {
                                                break;
                                            }
                                            try {
                                                jp5Var = new jp5(fr7Var, er7Var);
                                            } catch (dr7 unused) {
                                                jp5Var = null;
                                            }
                                            if (jp5Var != null) {
                                                if (jp5Var.b) {
                                                    break;
                                                }
                                            } else {
                                                break;
                                            }
                                        }
                                        if (((er7) b.get(size)).a == 6 || ((er7) b.get(size)).a == 3) {
                                            i++;
                                        }
                                        size--;
                                    }
                                    int limit = asReadOnlyBuffer.limit();
                                    if (limit == 0) {
                                        s93Var.clear();
                                    } else if (limit != asReadOnlyBuffer.limit()) {
                                        rc0 rc0Var = this.m1;
                                        rc0Var.getClass();
                                        if (rc0Var.c + limit < asReadOnlyBuffer.capacity() && !s93Var.getFlag(TLObject.FLAG_30)) {
                                            ByteBuffer byteBuffer3 = s93Var.c;
                                            byteBuffer3.getClass();
                                            byteBuffer3.position(limit);
                                        }
                                    }
                                }
                            }
                            if (z2) {
                                if (!z3) {
                                    this.U1++;
                                }
                                this.l1.add(Long.valueOf(s93Var.e));
                            }
                            return z2;
                        }
                        s93Var.clear();
                        z2 = true;
                        if (z2) {
                        }
                        return z2;
                    }
                }
            }
            z = false;
            if (!z3) {
            }
            if (s93Var.notDependedOn()) {
            }
            z2 = true;
            if (z2) {
            }
            return z2;
        }
        return false;
    }

    @Override // qm6, vg0
    public final void B(long j, long j2) {
        fgc fgcVar = this.r1;
        if (fgcVar != null) {
            try {
                fgcVar.q(j, j2);
            } catch (egc e) {
                throw e(e, e.a, false, 7001);
            }
        }
        super.B(j, j2);
    }

    @Override // qm6
    public final boolean B0() {
        boolean z;
        if (this.E0) {
            ko4 ko4Var = this.d0;
            long j = this.I;
            if (j != -9223372036854775807L) {
                if (this.U0 + 1 + j <= Long.MAX_VALUE - (this.P0.c + j)) {
                    z = false;
                    if (this.F1 != null || this.H1 || this.O1 || ((ko4Var != null && ko4Var.v > 0) || z || this.P0.h != -9223372036854775807L)) {
                        return true;
                    }
                }
            }
            z = true;
            if (this.F1 != null) {
            }
            return true;
        }
        return false;
    }

    @Override // qm6
    public final boolean C0(nm6 nm6Var) {
        return O0(nm6Var);
    }

    @Override // qm6
    public final boolean D0() {
        nm6 nm6Var = this.j0;
        if (this.r1 != null && nm6Var != null) {
            String str = nm6Var.a;
            if (str.equals("c2.mtk.avc.decoder") || str.equals("c2.mtk.hevc.decoder") || str.equals("c2.mtk.vp9.decoder")) {
                return true;
            }
        }
        return super.D0();
    }

    @Override // qm6, vg0
    public final void E(float f, float f2) {
        super.E(f, f2);
        fgc fgcVar = this.r1;
        if (fgcVar != null) {
            fgcVar.d(f);
        } else {
            this.f1.g(f);
        }
        vec vecVar = this.k1;
        if (vecVar != null) {
            vecVar.c(f);
        }
    }

    @Override // qm6
    public final int F0(ko4 ko4Var) {
        boolean z;
        byte b = 0;
        if (!dg7.m(ko4Var.t)) {
            return qu6.a(0, 0, 0, 0);
        }
        boolean z2 = ko4Var.x != null;
        Context context = this.a1;
        List L0 = L0(context, ko4Var, z2, false);
        if (z2 && L0.isEmpty()) {
            L0 = L0(context, ko4Var, false, false);
        }
        if (L0.isEmpty()) {
            return qu6.a(1, 0, 0, 0);
        }
        int i = ko4Var.X;
        if (i != 0 && i != 2) {
            return qu6.a(2, 0, 0, 0);
        }
        nm6 nm6Var = (nm6) L0.get(0);
        boolean e = nm6Var.e(context, ko4Var);
        if (!e) {
            for (int i2 = 1; i2 < L0.size(); i2++) {
                nm6 nm6Var2 = (nm6) L0.get(i2);
                if (nm6Var2.e(context, ko4Var)) {
                    z = false;
                    e = true;
                    nm6Var = nm6Var2;
                    break;
                }
            }
        }
        z = true;
        byte b2 = 4;
        int i3 = e ? 4 : 3;
        int i4 = nm6Var.f(ko4Var) ? 16 : 8;
        int i5 = nm6Var.g ? 64 : 0;
        int i6 = z ? 128 : 0;
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(ko4Var.t) && !qq5.b(context)) {
            i6 = 256;
        }
        if (e) {
            List L02 = L0(context, ko4Var, z2, true);
            if (!L02.isEmpty()) {
                HashMap hashMap = wm6.a;
                ArrayList arrayList = new ArrayList(L02);
                Collections.sort(arrayList, new jz0(new rm6(context, ko4Var, b), b2));
                nm6 nm6Var3 = (nm6) arrayList.get(0);
                if (nm6Var3.e(context, ko4Var) && nm6Var3.f(ko4Var)) {
                    b = 32;
                }
            }
        }
        return i3 | i4 | b | i5 | i6;
    }

    @Override // vg0
    public final boolean I(long j) {
        if (this.H0 == -9223372036854775807L || j < this.G1) {
            return false;
        }
        long j2 = this.Q0;
        return j2 == -9223372036854775807L || j > j2;
    }

    @Override // qm6
    public final w93 M(nm6 nm6Var, ko4 ko4Var, ko4 ko4Var2, boolean z) {
        int i;
        w93 b = nm6Var.b(ko4Var, ko4Var2);
        float f = ko4Var.F;
        float f2 = ko4Var2.F;
        int i2 = b.e;
        rc0 rc0Var = this.m1;
        rc0Var.getClass();
        if (ko4Var2.A > rc0Var.a || ko4Var2.B > rc0Var.b) {
            i2 |= 256;
        }
        if (M0(nm6Var, ko4Var2) > rc0Var.c) {
            i2 |= 64;
        }
        if (this.A1 != Integer.MIN_VALUE && (i = Build.VERSION.SDK_INT) < 31 && ((i != 30 || Build.MODEL.startsWith("MiTV")) && f != -1.0f && f2 != -1.0f && (!nm6Var.f || !z))) {
            if (Math.abs((Math.max(f2, f) / Math.min(f2, f)) - Math.round(r10)) > 0.01f) {
                i2 |= 65536;
            }
        }
        int i3 = i2;
        return new w93(nm6Var.a, ko4Var, ko4Var2, i3 != 0 ? (byte) 0 : b.d, i3);
    }

    @Override // qm6
    public final mm6 N(IllegalStateException illegalStateException, nm6 nm6Var) {
        Surface surface = this.v1;
        xm6 xm6Var = new xm6(illegalStateException, nm6Var);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return xm6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Surface N0(nm6 nm6Var) {
        boolean z;
        cf8 cf8Var;
        fgc fgcVar = this.r1;
        if (fgcVar != null) {
            return fgcVar.b();
        }
        Surface surface = this.v1;
        if (surface != null) {
            return surface;
        }
        df8 df8Var = null;
        if (V0(nm6Var)) {
            return null;
        }
        yve.p(W0(nm6Var));
        df8 df8Var2 = this.w1;
        if (df8Var2 != null && df8Var2.a != nm6Var.f) {
            if (df8Var2 != null) {
                df8Var2.release();
                this.w1 = null;
            } else {
                df8Var = df8Var2;
            }
            df8Var2 = df8Var;
        }
        if (df8Var2 != null) {
            return df8Var2;
        }
        Context context = this.a1;
        boolean z2 = nm6Var.f;
        boolean z3 = false;
        if (!z2) {
            int i = df8.d;
        } else if (!df8.b(context)) {
            z = false;
            yve.p(z);
            cf8Var = new cf8("ExoPlayer:PlaceholderSurface");
            int i2 = !z2 ? df8.d : 0;
            cf8Var.start();
            Handler handler = new Handler(cf8Var.getLooper(), cf8Var);
            cf8Var.b = handler;
            cf8Var.a = new zs3(handler);
            synchronized (cf8Var) {
                cf8Var.b.obtainMessage(1, i2, 0).sendToTarget();
                while (cf8Var.e == null && cf8Var.d == null && cf8Var.c == null) {
                    try {
                        cf8Var.wait();
                    } catch (InterruptedException unused) {
                        z3 = true;
                    }
                }
            }
            if (z3) {
                Thread.currentThread().interrupt();
            }
            RuntimeException runtimeException = cf8Var.d;
            if (runtimeException != null) {
                throw runtimeException;
            }
            Error error = cf8Var.c;
            if (error != null) {
                throw error;
            }
            df8 df8Var3 = cf8Var.e;
            df8Var3.getClass();
            this.w1 = df8Var3;
            return df8Var3;
        }
        z = true;
        yve.p(z);
        cf8Var = new cf8("ExoPlayer:PlaceholderSurface");
        if (!z2) {
        }
        cf8Var.start();
        Handler handler2 = new Handler(cf8Var.getLooper(), cf8Var);
        cf8Var.b = handler2;
        cf8Var.a = new zs3(handler2);
        synchronized (cf8Var) {
        }
    }

    public final boolean O0(nm6 nm6Var) {
        if (this.r1 != null) {
            return true;
        }
        Surface surface = this.v1;
        return (surface != null && surface.isValid()) || V0(nm6Var) || W0(nm6Var);
    }

    public final boolean P0(s93 s93Var) {
        if (m() || s93Var.isLastSample()) {
            return true;
        }
        long j = this.I;
        return j == -9223372036854775807L || j - (s93Var.e - this.P0.c) <= 100000;
    }

    public final void Q0() {
        if (this.C1 > 0) {
            this.h.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = elapsedRealtime - this.B1;
            int i = this.C1;
            k7b k7bVar = this.c1;
            Handler handler = (Handler) k7bVar.b;
            if (handler != null) {
                handler.post(new tfc(k7bVar, i, j));
            }
            this.C1 = 0;
            this.B1 = elapsedRealtime;
        }
    }

    public final void R0() {
        jm6 jm6Var;
        if (!this.O1 || (jm6Var = this.c0) == null) {
            return;
        }
        this.Q1 = new an6(this, jm6Var);
        if (Build.VERSION.SDK_INT >= 33) {
            Bundle bundle = new Bundle();
            bundle.putInt("tunnel-peek", 1);
            jm6Var.setParameters(bundle);
        }
    }

    public final void S0(jm6 jm6Var, int i, long j) {
        Surface surface;
        Trace.beginSection("releaseOutputBuffer");
        jm6Var.f(i, j);
        Trace.endSection();
        this.O0.e++;
        this.D1 = 0;
        if (this.r1 == null) {
            ggc ggcVar = this.L1;
            boolean equals = ggcVar.equals(ggc.d);
            k7b k7bVar = this.c1;
            if (!equals && !ggcVar.equals(this.M1)) {
                this.M1 = ggcVar;
                k7bVar.t(ggcVar);
            }
            uec uecVar = this.f1;
            boolean z = uecVar.e != 3;
            uecVar.e = 3;
            uecVar.k.getClass();
            uecVar.g = gcc.T(SystemClock.elapsedRealtime());
            if (!z || (surface = this.v1) == null) {
                return;
            }
            k7bVar.s(surface);
            this.y1 = true;
        }
    }

    public final void T0(Object obj) {
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        Surface surface2 = this.v1;
        k7b k7bVar = this.c1;
        if (surface2 == surface) {
            if (surface != null) {
                ggc ggcVar = this.M1;
                if (ggcVar != null) {
                    k7bVar.t(ggcVar);
                }
                Surface surface3 = this.v1;
                if (surface3 == null || !this.y1) {
                    return;
                }
                k7bVar.s(surface3);
                return;
            }
            return;
        }
        this.v1 = surface;
        fgc fgcVar = this.r1;
        uec uecVar = this.f1;
        if (fgcVar == null) {
            uecVar.f(surface);
        }
        boolean z = false;
        this.y1 = false;
        byte b = this.n;
        jm6 jm6Var = this.c0;
        if (jm6Var != null) {
            if (this.r1 == null) {
                nm6 nm6Var = this.j0;
                nm6Var.getClass();
                if (!O0(nm6Var) || this.n1) {
                    t0();
                    d0();
                } else {
                    Surface N0 = N0(nm6Var);
                    if (N0 != null) {
                        try {
                            jm6Var.k(N0);
                        } catch (Throwable th) {
                            th.printStackTrace();
                            throw new wfb(th);
                        }
                    } else {
                        if (Build.VERSION.SDK_INT < 35) {
                            grb.g();
                            return;
                        }
                        jm6Var.e();
                    }
                }
            }
            z = true;
        }
        if (surface != null) {
            ggc ggcVar2 = this.M1;
            if (ggcVar2 != null) {
                k7bVar.t(ggcVar2);
            }
        } else {
            this.M1 = null;
            fgc fgcVar2 = this.r1;
            if (fgcVar2 != null) {
                fgcVar2.l();
            }
        }
        if (b == 2) {
            fgc fgcVar3 = this.r1;
            if (fgcVar3 != null) {
                fgcVar3.r(z);
            } else {
                uecVar.c(z);
            }
        }
        R0();
    }

    @Override // qm6
    public final int U(s93 s93Var) {
        if (Build.VERSION.SDK_INT >= 34) {
            return ((this.F1 != null || this.O1) && s93Var.e < this.x && !P0(s93Var)) ? 32 : 0;
        }
        return 0;
    }

    public final boolean U0(long j, long j2, boolean z, boolean z2) {
        int F;
        if (this.r1 != null && this.b1) {
            j2 -= -this.S1;
        }
        if (j >= -500000 || z || (F = F(j2)) == 0) {
            return false;
        }
        this.G1 = j2;
        boolean z3 = this.f1.h != -9223372036854775807L;
        PriorityQueue priorityQueue = this.l1;
        Iterator it = priorityQueue.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            if (((Long) it.next()).longValue() < this.x || z3) {
                i2++;
            } else {
                i++;
            }
        }
        priorityQueue.clear();
        p93 p93Var = this.O0;
        if (z2) {
            int i3 = p93Var.d + F;
            p93Var.f += this.E1;
            p93Var.d = i3 + i + i2;
        } else {
            p93Var.j++;
            Y0(F + i, this.E1);
            this.O0.d += i2;
        }
        if (S()) {
            d0();
        }
        fgc fgcVar = this.r1;
        if (fgcVar != null) {
            fgcVar.o(false);
        }
        return true;
    }

    @Override // qm6
    public final float V(float f, ko4 ko4Var, ko4[] ko4VarArr) {
        nm6 nm6Var;
        float f2 = -1.0f;
        for (ko4 ko4Var2 : ko4VarArr) {
            float f3 = ko4Var2.F;
            if (f3 != -1.0f) {
                f2 = Math.max(f2, f3);
            }
        }
        if (f2 == -1.0f && this.c0 != null) {
            if (this.h1.a() != -9223372036854775807L) {
                f2 = 1.0E9f / r11.a();
            }
        }
        float f4 = f2 == -1.0f ? -1.0f : f2 * f;
        if (this.F1 == null || (nm6Var = this.j0) == null) {
            return f4;
        }
        int i = ko4Var.A;
        int i2 = ko4Var.B;
        float f5 = -3.4028235E38f;
        if (nm6Var.i) {
            float f6 = nm6Var.l;
            if (f6 != -3.4028235E38f && nm6Var.j == i && nm6Var.k == i2) {
                f5 = f6;
            } else {
                f5 = 1024.0f;
                if (!nm6Var.g(i, i2, 1024.0d)) {
                    float f7 = 0.0f;
                    while (true) {
                        float f8 = f5 - f7;
                        if (Math.abs(f8) <= 5.0f) {
                            break;
                        }
                        float f9 = (f8 / 2.0f) + f7;
                        if (nm6Var.g(i, i2, f9)) {
                            f7 = f9;
                        } else {
                            f5 = f9;
                        }
                    }
                    f5 = f7;
                }
                nm6Var.l = f5;
                nm6Var.j = i;
                nm6Var.k = i2;
            }
        }
        return f4 != -1.0f ? Math.max(f4, f5) : f5;
    }

    public boolean V0(nm6 nm6Var) {
        return Build.VERSION.SDK_INT >= 35 && nm6Var.h;
    }

    @Override // qm6
    public final ArrayList W(ko4 ko4Var, boolean z) {
        boolean z2 = this.O1;
        Context context = this.a1;
        List L0 = L0(context, ko4Var, z, z2);
        HashMap hashMap = wm6.a;
        ArrayList arrayList = new ArrayList(L0);
        Collections.sort(arrayList, new jz0(new rm6(context, ko4Var, (byte) 0), (byte) 4));
        return arrayList;
    }

    public boolean W0(nm6 nm6Var) {
        if (this.O1 || J0(nm6Var.a)) {
            return false;
        }
        return !nm6Var.f || df8.b(this.a1);
    }

    public final void X0(jm6 jm6Var, int i) {
        Trace.beginSection("skipVideoBuffer");
        jm6Var.c(i);
        Trace.endSection();
        this.O0.f++;
    }

    public final void Y0(int i, int i2) {
        p93 p93Var = this.O0;
        p93Var.h += i;
        int i3 = i + i2;
        p93Var.g += i3;
        this.C1 += i3;
        int i4 = this.D1 + i3;
        this.D1 = i4;
        p93Var.i = Math.max(i4, p93Var.i);
        byte b = this.d1;
        if (b <= 0 || this.C1 < b) {
            return;
        }
        Q0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0127, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x012a, code lost:
    
        r15 = r9;
     */
    @Override // qm6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final fp Z(nm6 nm6Var, ko4 ko4Var, MediaCrypto mediaCrypto, float f) {
        bm2 bm2Var;
        int i;
        rc0 rc0Var;
        int i2;
        int i3;
        Point point;
        int i4;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int i5;
        boolean z;
        Pair b;
        int K0;
        String str = nm6Var.c;
        ko4[] ko4VarArr = this.s;
        ko4VarArr.getClass();
        int i6 = ko4Var.A;
        float f2 = ko4Var.F;
        bm2 bm2Var2 = ko4Var.L;
        int i7 = ko4Var.B;
        int M0 = M0(nm6Var, ko4Var);
        if (ko4VarArr.length == 1) {
            if (M0 != -1 && (K0 = K0(nm6Var, ko4Var)) != -1) {
                M0 = Math.min((int) (M0 * 1.5f), K0);
            }
            rc0Var = new rc0(i6, i7, M0);
            bm2Var = bm2Var2;
            i = i7;
        } else {
            int length = ko4VarArr.length;
            int i8 = i6;
            int i9 = i7;
            int i10 = 0;
            boolean z2 = false;
            while (i10 < length) {
                ko4 ko4Var2 = ko4VarArr[i10];
                ko4[] ko4VarArr2 = ko4VarArr;
                if (bm2Var2 != null && ko4Var2.L == null) {
                    jo4 a = ko4Var2.a();
                    a.K = bm2Var2;
                    ko4Var2 = new ko4(a);
                }
                w93 b2 = nm6Var.b(ko4Var, ko4Var2);
                int i11 = length;
                int i12 = ko4Var2.B;
                if (b2.d != 0) {
                    int i13 = ko4Var2.A;
                    i5 = i10;
                    z2 |= i13 == -1 || i12 == -1;
                    i8 = Math.max(i8, i13);
                    i9 = Math.max(i9, i12);
                    M0 = Math.max(M0, M0(nm6Var, ko4Var2));
                } else {
                    i5 = i10;
                }
                length = i11;
                i10 = i5 + 1;
                ko4VarArr = ko4VarArr2;
            }
            if (z2) {
                efd.f("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + i8 + "x" + i9);
                boolean z3 = i7 > i6;
                boolean z4 = z3;
                if (z3) {
                    i3 = i6;
                    i2 = i7;
                } else {
                    i2 = i6;
                    i3 = i7;
                }
                float f3 = i3 / i2;
                int i14 = 0;
                while (true) {
                    bm2Var = bm2Var2;
                    if (i14 >= 9) {
                        break;
                    }
                    int i15 = V1[i14];
                    int i16 = i14;
                    int i17 = (int) (i15 * f3);
                    if (i15 <= i2 || i17 <= i3) {
                        break;
                    }
                    if (!z4) {
                        i15 = i17;
                        i17 = i15;
                    }
                    int i18 = i2;
                    MediaCodecInfo.CodecCapabilities codecCapabilities = nm6Var.d;
                    if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                        i4 = i3;
                        point = null;
                    } else {
                        int widthAlignment = videoCapabilities.getWidthAlignment();
                        i4 = i3;
                        int heightAlignment = videoCapabilities.getHeightAlignment();
                        point = new Point(gcc.g(i17, widthAlignment) * widthAlignment, gcc.g(i15, heightAlignment) * heightAlignment);
                    }
                    if (point != null) {
                        i = i7;
                        if (nm6Var.g(point.x, point.y, f2)) {
                            break;
                        }
                    } else {
                        i = i7;
                    }
                    i14 = i16 + 1;
                    i7 = i;
                    bm2Var2 = bm2Var;
                    i2 = i18;
                    i3 = i4;
                }
                if (point != null) {
                    i8 = Math.max(i8, point.x);
                    i9 = Math.max(i9, point.y);
                    jo4 a2 = ko4Var.a();
                    a2.z = i8;
                    a2.A = i9;
                    M0 = Math.max(M0, K0(nm6Var, new ko4(a2)));
                    efd.f("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + i8 + "x" + i9);
                }
            } else {
                bm2Var = bm2Var2;
                i = i7;
            }
            rc0Var = new rc0(i8, i9, M0);
        }
        this.m1 = rc0Var;
        int i19 = this.O1 ? this.P1 : 0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i6);
        mediaFormat.setInteger("height", i);
        ite.b(mediaFormat, ko4Var.w);
        if (f2 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f2);
        }
        ite.a(mediaFormat, "rotation-degrees", ko4Var.G);
        if (bm2Var != null) {
            bm2 bm2Var3 = bm2Var;
            ite.a(mediaFormat, "color-transfer", bm2Var3.c);
            ite.a(mediaFormat, "color-standard", bm2Var3.a);
            ite.a(mediaFormat, "color-range", bm2Var3.b);
            byte[] bArr = bm2Var3.d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(ko4Var.t) && (b = rk2.b(ko4Var)) != null) {
            ite.a(mediaFormat, "profile", ((Integer) b.first).intValue());
        }
        mediaFormat.setInteger("max-width", rc0Var.a);
        mediaFormat.setInteger("max-height", rc0Var.b);
        ite.a(mediaFormat, "max-input-size", rc0Var.c);
        mediaFormat.setInteger("priority", 0);
        if (f != -1.0f) {
            mediaFormat.setFloat("operating-rate", f);
        }
        if (this.e1) {
            z = true;
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z = true;
        }
        if (i19 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z);
            mediaFormat.setInteger("audio-session-id", i19);
        }
        if (Build.VERSION.SDK_INT >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.N1));
        }
        K(mediaFormat);
        Surface N0 = N0(nm6Var);
        if (this.r1 != null && !gcc.O(this.a1)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        return new fp(nm6Var, mediaFormat, ko4Var, N0, mediaCrypto, null);
    }

    public final void Z0(long j) {
        p93 p93Var = this.O0;
        p93Var.k += j;
        p93Var.l++;
        this.I1 += j;
        this.J1++;
    }

    @Override // qm6
    public final void a0(s93 s93Var) {
        ByteBuffer byteBuffer = s93Var.f;
        if (byteBuffer == null || byteBuffer.remaining() < 7) {
            return;
        }
        byte b = byteBuffer.get();
        short s = byteBuffer.getShort();
        short s2 = byteBuffer.getShort();
        byte b2 = byteBuffer.get();
        byte b3 = byteBuffer.get();
        byteBuffer.position(0);
        if (b == -75 && s == 60 && s2 == 1 && b2 == 4 && (b3 == 0 || b3 == 1)) {
            if (this.p1) {
                byte[] bArr = new byte[byteBuffer.remaining()];
                byteBuffer.get(bArr);
                byteBuffer.position(0);
                jm6 jm6Var = this.c0;
                jm6Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putByteArray("hdr10-plus-info", bArr);
                jm6Var.setParameters(bundle);
                return;
            }
            return;
        }
        if (Build.VERSION.SDK_INT >= 37) {
            byte[] bArr2 = rk2.a;
            int remaining = byteBuffer.remaining();
            byte[] bArr3 = rk2.d;
            if (remaining >= bArr3.length) {
                int position = byteBuffer.position();
                for (int i = 0; i < bArr3.length; i++) {
                    if (byteBuffer.get(position + i) != bArr3[i]) {
                        return;
                    }
                }
                byteBuffer.position(5);
                int remaining2 = byteBuffer.remaining();
                byte[] bArr4 = new byte[remaining2];
                byteBuffer.get(bArr4);
                byteBuffer.position(0);
                boolean z = remaining2 > 0;
                this.q1 = z;
                if (z) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putByteArray("hdr-st2094-50-info", bArr4);
                    jm6 jm6Var2 = this.c0;
                    jm6Var2.getClass();
                    jm6Var2.setParameters(bundle2);
                }
            }
        }
    }

    @Override // qm6, vg0, lg8
    public final void d(int i, Object obj) {
        if (i == 1) {
            T0(obj);
            return;
        }
        if (i == 7) {
            obj.getClass();
            sec secVar = (sec) obj;
            this.R1 = secVar;
            fgc fgcVar = this.r1;
            if (fgcVar != null) {
                fgcVar.t(secVar);
                return;
            }
            return;
        }
        if (i == 10) {
            obj.getClass();
            int intValue = ((Integer) obj).intValue();
            if (this.P1 != intValue) {
                this.P1 = intValue;
                if (this.O1) {
                    t0();
                    return;
                }
                return;
            }
            return;
        }
        if (i == 4) {
            obj.getClass();
            int intValue2 = ((Integer) obj).intValue();
            this.z1 = intValue2;
            jm6 jm6Var = this.c0;
            if (jm6Var != null) {
                jm6Var.j(intValue2);
                return;
            }
            return;
        }
        if (i == 5) {
            obj.getClass();
            int intValue3 = ((Integer) obj).intValue();
            this.A1 = intValue3;
            fgc fgcVar2 = this.r1;
            if (fgcVar2 != null) {
                fgcVar2.k(intValue3);
                return;
            }
            zec zecVar = this.f1.b;
            if (zecVar.i != intValue3) {
                zecVar.i = intValue3;
                zecVar.c(true);
                return;
            }
            return;
        }
        if (i == 13) {
            obj.getClass();
            List list = (List) obj;
            if (list.equals(tec.a)) {
                fgc fgcVar3 = this.r1;
                if (fgcVar3 == null || !fgcVar3.v()) {
                    return;
                }
                this.r1.u();
                return;
            }
            this.u1 = list;
            fgc fgcVar4 = this.r1;
            if (fgcVar4 != null) {
                fgcVar4.p(list);
                return;
            }
            return;
        }
        if (i == 14) {
            obj.getClass();
            rma rmaVar = (rma) obj;
            if (rmaVar.a == 0 || rmaVar.b == 0) {
                return;
            }
            this.x1 = rmaVar;
            fgc fgcVar5 = this.r1;
            if (fgcVar5 != null) {
                Surface surface = this.v1;
                surface.getClass();
                fgcVar5.c(surface, rmaVar);
                return;
            }
            return;
        }
        switch (i) {
            case 16:
                obj.getClass();
                this.N1 = ((Integer) obj).intValue();
                jm6 jm6Var2 = this.c0;
                if (jm6Var2 != null && Build.VERSION.SDK_INT >= 35) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("importance", Math.max(0, -this.N1));
                    jm6Var2.setParameters(bundle);
                    break;
                }
                break;
            case 17:
                Surface surface2 = this.v1;
                T0(null);
                obj.getClass();
                ((bn6) obj).d(1, surface2);
                break;
            case 18:
                boolean z = this.F1 != null;
                fv9 fv9Var = (fv9) obj;
                this.F1 = fv9Var;
                if (z != (fv9Var != null)) {
                    G0(this.d0);
                    break;
                }
                break;
            default:
                super.d(i, obj);
                break;
        }
    }

    @Override // qm6
    public final boolean f0(ko4 ko4Var) {
        fgc fgcVar = this.r1;
        if (fgcVar == null || fgcVar.v()) {
            return true;
        }
        try {
            return this.r1.n(ko4Var);
        } catch (egc e) {
            throw this.e(e, ko4Var, false, 7000);
        }
    }

    @Override // qm6
    public final void g0(Exception exc) {
        efd.d("MediaCodecVideoRenderer", "Video codec error", exc);
        k7b k7bVar = this.c1;
        Handler handler = (Handler) k7bVar.b;
        if (handler != null) {
            handler.post(new g9c(k7bVar, exc, (byte) 18));
        }
    }

    @Override // qm6
    public final void h0(long j, long j2, String str) {
        String str2;
        boolean z;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        k7b k7bVar = this.c1;
        Handler handler = (Handler) k7bVar.b;
        if (handler != null) {
            str2 = str;
            handler.post(new o30((Object) k7bVar, (Object) str2, j, j2, (byte) 17));
        } else {
            str2 = str;
        }
        this.n1 = J0(str2);
        nm6 nm6Var = this.j0;
        nm6Var.getClass();
        boolean z2 = false;
        if (Build.VERSION.SDK_INT >= 29 && "video/x-vnd.on2.vp9".equals(nm6Var.b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = nm6Var.d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
                if (codecProfileLevel.profile == 16384) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        this.p1 = z;
        if (Build.VERSION.SDK_INT < 37) {
            nm6 nm6Var2 = this.j0;
            nm6Var2.getClass();
            if (nm6Var2.b.equals("video/av01")) {
                z2 = true;
            }
        }
        this.o1 = z2;
        R0();
    }

    @Override // vg0
    public final void i() {
        fgc fgcVar = this.r1;
        if (fgcVar == null) {
            uec uecVar = this.f1;
            if (uecVar.e == 0) {
                uecVar.e = 1;
                return;
            }
            return;
        }
        int i = this.t1;
        if (i == 0 || i == 1) {
            this.t1 = 0;
        } else {
            fgcVar.w();
        }
    }

    @Override // qm6
    public final void i0(pk2 pk2Var) {
        k7b k7bVar = this.c1;
        Handler handler = (Handler) k7bVar.b;
        if (handler != null) {
            handler.post(new g9c(k7bVar, pk2Var, (byte) 16));
        }
    }

    @Override // qm6
    public final void j0(String str) {
        k7b k7bVar = this.c1;
        Handler handler = (Handler) k7bVar.b;
        if (handler != null) {
            handler.post(new g9c(k7bVar, str, (byte) 19));
        }
    }

    @Override // qm6
    public final w93 k0(ym4 ym4Var) {
        w93 k0 = super.k0(ym4Var);
        this.q1 = false;
        ko4 ko4Var = (ko4) ym4Var.c;
        ko4Var.getClass();
        k7b k7bVar = this.c1;
        Handler handler = (Handler) k7bVar.b;
        if (handler != null) {
            handler.post(new b6c(k7bVar, ko4Var, k0, (byte) 9));
        }
        vec vecVar = this.k1;
        if (vecVar != null) {
            vecVar.b();
        }
        return k0;
    }

    @Override // vg0
    public final String l() {
        return "MediaCodecVideoRenderer";
    }

    @Override // qm6
    public final void l0(ko4 ko4Var, MediaFormat mediaFormat) {
        int integer;
        int i;
        jm6 jm6Var = this.c0;
        if (jm6Var != null) {
            jm6Var.j(this.z1);
        }
        if (this.O1) {
            i = ko4Var.A;
            integer = ko4Var.B;
        } else {
            mediaFormat.getClass();
            if (mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top")) {
                int integer2 = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
                int integer3 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
                i = integer2;
                integer = integer3;
            } else {
                int integer4 = mediaFormat.getInteger("width");
                integer = mediaFormat.getInteger("height");
                i = integer4;
            }
        }
        float f = ko4Var.I;
        int i2 = ko4Var.G;
        if (i2 == 90 || i2 == 270) {
            f = 1.0f / f;
            int i3 = integer;
            integer = i;
            i = i3;
        }
        this.L1 = new ggc(f, i, integer);
        fgc fgcVar = this.r1;
        if (fgcVar == null || !this.T1) {
            float f2 = ko4Var.F;
            zj4 zj4Var = this.h1;
            zj4Var.f = f2;
            zj4Var.a.c();
            zj4Var.b.c();
            zj4Var.c = false;
            zj4Var.d = -9223372036854775807L;
            zj4Var.e = 0;
            zj4Var.c();
        } else {
            if (i <= 0 || integer <= 0) {
                return;
            }
            jo4 a = ko4Var.a();
            a.z = i;
            a.A = integer;
            a.H = f;
            ko4 ko4Var2 = new ko4(a);
            int i4 = this.t1;
            List list = this.u1;
            if (list == null) {
                no5 no5Var = po5.b;
                list = j99.e;
            }
            fgcVar.g(ko4Var2, this.P0.b, i4, list);
            this.t1 = 2;
        }
        this.T1 = false;
    }

    @Override // vg0
    public final boolean n() {
        if (!this.K0) {
            return false;
        }
        fgc fgcVar = this.r1;
        return fgcVar == null || fgcVar.a();
    }

    @Override // qm6
    public final void n0(long j) {
        super.n0(j);
        if (this.O1) {
            return;
        }
        this.E1--;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        if (android.os.SystemClock.elapsedRealtime() < r6.s0) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    @Override // vg0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean o() {
        boolean z;
        fgc fgcVar;
        if (this.U != null) {
            if (!p() && this.u0 < 0) {
                if (this.s0 != -9223372036854775807L) {
                    this.h.getClass();
                }
            }
            z = true;
            fgcVar = this.r1;
            if (fgcVar == null) {
                return fgcVar.s(z);
            }
            if (z && (this.c0 == null || this.O1)) {
                return true;
            }
            return this.f1.b(z);
        }
        z = false;
        fgcVar = this.r1;
        if (fgcVar == null) {
        }
    }

    @Override // qm6
    public final void o0() {
        fgc fgcVar = this.r1;
        if (fgcVar != null) {
            fgcVar.j();
            long j = this.S1;
            if (j == -9223372036854775807L) {
                j = this.P0.b;
                this.S1 = j;
            }
            this.r1.h(-j);
        } else {
            this.f1.e(2);
        }
        this.T1 = true;
        R0();
    }

    @Override // qm6
    public final void p0(s93 s93Var) {
        ByteBuffer byteBuffer;
        int i;
        int i2;
        ByteBuffer byteBuffer2;
        bm2 bm2Var;
        nm6 nm6Var = this.j0;
        nm6Var.getClass();
        String str = nm6Var.b;
        if (str.equals("video/av01") && (byteBuffer2 = s93Var.c) != null) {
            ko4 ko4Var = this.d0;
            boolean z = (ko4Var == null || (bm2Var = ko4Var.L) == null || bm2Var.e <= 8) ? false : true;
            if (this.q1 && !byteBuffer2.isReadOnly()) {
                py0.b(byteBuffer2, false);
            } else if (z && this.o1 && !byteBuffer2.isReadOnly()) {
                py0.b(byteBuffer2, true);
            }
            qx6 qx6Var = this.i1;
            if (qx6Var != null && s93Var.isKeyFrame()) {
                int position = byteBuffer2.position();
                int limit = byteBuffer2.limit();
                byteBuffer2.limit(Math.min(limit, position + 500));
                ByteBuffer byteBuffer3 = (ByteBuffer) qx6Var.b;
                byteBuffer3.clear();
                byteBuffer3.put(byteBuffer2);
                byteBuffer3.flip();
                byteBuffer2.position(position);
                byteBuffer2.limit(limit);
            }
        } else if (str.equals("video/hevc") && (byteBuffer = s93Var.c) != null && this.q1 && !byteBuffer.isReadOnly()) {
            ByteBuffer byteBuffer4 = s93Var.c;
            int position2 = byteBuffer4.position();
            int limit2 = byteBuffer4.limit();
            if (limit2 - position2 >= 4) {
                while (position2 < limit2) {
                    int a = hoe.a(byteBuffer4, position2, limit2);
                    if (a == limit2 || (i = a + 3) >= limit2 || ((i2 = (byteBuffer4.get(i) & 126) >> 1) >= 0 && i2 <= 31)) {
                        break;
                    }
                    if (i2 == 39) {
                        int i3 = a + 5;
                        i = hoe.a(byteBuffer4, i3, limit2);
                        int i4 = 0;
                        while (i3 < i) {
                            int i5 = 0;
                            while (true) {
                                if (i3 >= i) {
                                    break;
                                }
                                int i6 = byteBuffer4.get(i3) & 255;
                                if (i6 != 3 || i4 < 2) {
                                    i4 = i6 == 0 ? i4 + 1 : 0;
                                    int i7 = i3 + 1;
                                    i5 += i6;
                                    if (i6 != 255) {
                                        if (i5 == 4) {
                                            byteBuffer4.put(i3, (byte) -2);
                                        }
                                        i3 = i7;
                                    } else {
                                        i3 = i7;
                                    }
                                } else {
                                    i3++;
                                    i4 = 0;
                                }
                            }
                            if (i3 < i) {
                                int i8 = 0;
                                while (i3 < i) {
                                    int i9 = byteBuffer4.get(i3) & 255;
                                    if (i9 != 3 || i4 < 2) {
                                        i4 = i9 == 0 ? i4 + 1 : 0;
                                        i3++;
                                        i8 += i9;
                                        if (i9 != 255) {
                                            break;
                                        }
                                    } else {
                                        i3++;
                                        i4 = 0;
                                    }
                                }
                                int i10 = 0;
                                while (i10 < i8 && i3 < i) {
                                    int i11 = i3 + 1;
                                    int i12 = byteBuffer4.get(i3) & 255;
                                    if (i12 == 3 && i4 >= 2) {
                                        i10--;
                                    } else if (i12 == 0) {
                                        i4++;
                                        i10++;
                                        i3 = i11;
                                    }
                                    i4 = 0;
                                    i10++;
                                    i3 = i11;
                                }
                            }
                        }
                    }
                    position2 = i;
                }
            }
        }
        this.U1 = 0;
        int U = U(s93Var);
        if ((Build.VERSION.SDK_INT < 34 || (U & 32) == 0) && !this.O1) {
            this.E1++;
        }
    }

    @Override // qm6, vg0
    public final void q() {
        k7b k7bVar = this.c1;
        this.M1 = null;
        R0();
        this.y1 = false;
        this.Q1 = null;
        this.H1 = B0();
        try {
            super.q();
        } finally {
            k7bVar.l(this.O0);
            k7bVar.t(ggc.d);
        }
    }

    @Override // vg0
    public final void r(boolean z, boolean z2) {
        fgc fgcVar;
        this.O0 = new p93();
        qa9 qa9Var = this.d;
        qa9Var.getClass();
        boolean z3 = qa9Var.b;
        byte b = 0;
        yve.p((z3 && this.P1 == 0) ? false : true);
        if (this.O1 != z3) {
            this.O1 = z3;
            t0();
        }
        p93 p93Var = this.O0;
        k7b k7bVar = this.c1;
        Handler handler = (Handler) k7bVar.b;
        if (handler != null) {
            handler.post(new ufc(k7bVar, p93Var, b));
        }
        boolean z4 = this.s1;
        uec uecVar = this.f1;
        if (!z4) {
            if (this.u1 != null && this.r1 == null) {
                rm3 rm3Var = new rm3(this.a1, uecVar);
                rm3Var.a = true;
                long j = this.j1;
                rm3Var.c = j != -9223372036854775807L ? -j : -9223372036854775807L;
                vgb vgbVar = this.h;
                vgbVar.getClass();
                rm3Var.g = vgbVar;
                yve.p(!rm3Var.b);
                if (((vf8) rm3Var.f) == null) {
                    rm3Var.f = new vf8();
                }
                xf8 xf8Var = new xf8(rm3Var);
                rm3Var.b = true;
                if (1 >= xf8Var.p) {
                    xf8Var.p = 1;
                }
                SparseArray sparseArray = xf8Var.c;
                if (sparseArray.indexOfKey(0) >= 0) {
                    fgcVar = (fgc) sparseArray.get(0);
                } else {
                    tf8 tf8Var = new tf8(xf8Var, xf8Var.a);
                    xf8Var.g.add(tf8Var);
                    sparseArray.put(0, tf8Var);
                    fgcVar = tf8Var;
                }
                this.r1 = fgcVar;
            }
            this.s1 = true;
        }
        fgc fgcVar2 = this.r1;
        if (fgcVar2 == null) {
            vgb vgbVar2 = this.h;
            vgbVar2.getClass();
            uecVar.k = vgbVar2;
            uecVar.e(!z2 ? 1 : 0);
            return;
        }
        fgcVar2.i(new v34(this, (byte) 15));
        sec secVar = this.R1;
        if (secVar != null) {
            this.r1.t(secVar);
        }
        if (this.v1 != null && !this.x1.equals(rma.c)) {
            this.r1.c(this.v1, this.x1);
        }
        this.r1.k(this.A1);
        this.r1.d(this.a0);
        List list = this.u1;
        if (list != null) {
            this.r1.p(list);
        }
        this.t1 = !z2 ? 1 : 0;
        this.S0 = true;
    }

    @Override // qm6
    public final boolean r0(long j, long j2, jm6 jm6Var, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, ko4 ko4Var) {
        zj4 zj4Var;
        jm6Var.getClass();
        long j4 = j3 - this.P0.c;
        boolean z3 = this.f1.h != -9223372036854775807L;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            PriorityQueue priorityQueue = this.l1;
            Long l = (Long) priorityQueue.peek();
            zj4Var = this.h1;
            if (l == null || l.longValue() >= j3) {
                break;
            }
            priorityQueue.poll();
            zj4Var.b(1000 * l.longValue());
            if (l.longValue() < this.x || z3) {
                i5++;
            } else {
                i4++;
            }
        }
        Y0(i4, 0);
        this.O0.d += i5;
        zj4Var.b(j3 * 1000);
        fgc fgcVar = this.r1;
        if (fgcVar != null) {
            if (!z || z2) {
                return fgcVar.m(j3, new ym6(this, jm6Var, i, j4));
            }
            X0(jm6Var, i);
            return true;
        }
        int a = this.f1.a(j3, j, j2, this.P0.b, z, z2, zj4Var.a(), zj4Var.h, this.g1);
        ry0 ry0Var = this.g1;
        vec vecVar = this.k1;
        if (vecVar != null && a != 5 && a != 4) {
            vecVar.a(j3, ry0Var.a);
        }
        if (a == 0) {
            this.h.getClass();
            long nanoTime = System.nanoTime();
            sec secVar = this.R1;
            if (secVar != null) {
                secVar.b(j4, nanoTime, ko4Var, this.e0);
            }
            S0(jm6Var, i, nanoTime);
            Z0(ry0Var.a);
            return true;
        }
        if (a == 1) {
            long j5 = ry0Var.b;
            long j6 = ry0Var.a;
            if (j5 == this.K1) {
                X0(jm6Var, i);
            } else {
                sec secVar2 = this.R1;
                if (secVar2 != null) {
                    secVar2.b(j4, j5, ko4Var, this.e0);
                }
                S0(jm6Var, i, j5);
            }
            Z0(j6);
            this.K1 = j5;
            return true;
        }
        if (a == 2) {
            Trace.beginSection("dropVideoBuffer");
            jm6Var.c(i);
            Trace.endSection();
            Y0(0, 1);
            Z0(ry0Var.a);
            return true;
        }
        if (a == 3) {
            X0(jm6Var, i);
            Z0(ry0Var.a);
            return true;
        }
        if (a == 4 || a == 5) {
            return false;
        }
        grb.i(String.valueOf(a));
        return false;
    }

    @Override // qm6, vg0
    public final void s(long j, boolean z, boolean z2) {
        fgc fgcVar = this.r1;
        if (fgcVar != null && !z) {
            fgcVar.o(true);
        }
        if (z2) {
            this.G1 = j;
        }
        super.s(j, z, z2);
        fgc fgcVar2 = this.r1;
        uec uecVar = this.f1;
        if (fgcVar2 == null) {
            uecVar.b.b();
            uecVar.f = -9223372036854775807L;
            uecVar.e = Math.min(uecVar.e, 1);
            uecVar.h = -9223372036854775807L;
            uecVar.m = false;
        }
        vec vecVar = this.k1;
        if (vecVar != null) {
            vecVar.b();
        }
        if (z) {
            fgc fgcVar3 = this.r1;
            if (fgcVar3 != null) {
                fgcVar3.r(false);
            } else {
                uecVar.c(false);
            }
        }
        R0();
        this.D1 = 0;
    }

    @Override // vg0
    public final void t() {
        fgc fgcVar = this.r1;
        if (fgcVar == null || !this.b1) {
            return;
        }
        fgcVar.release();
    }

    @Override // qm6
    public final void u0() {
        fgc fgcVar = this.r1;
        if (fgcVar != null) {
            fgcVar.j();
        } else {
            long j = this.P0.h;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // vg0
    public final void v() {
        try {
            try {
                this.x0 = false;
                v0();
                t0();
            } finally {
                bs2.C(this.X, null);
                this.X = null;
            }
        } finally {
            this.s1 = false;
            this.S1 = -9223372036854775807L;
            this.q1 = false;
            df8 df8Var = this.w1;
            if (df8Var != null) {
                df8Var.release();
                this.w1 = null;
            }
        }
    }

    @Override // vg0
    public final void w() {
        this.C1 = 0;
        this.h.getClass();
        this.B1 = SystemClock.elapsedRealtime();
        this.I1 = 0L;
        this.J1 = 0;
        fgc fgcVar = this.r1;
        if (fgcVar != null) {
            fgcVar.f();
        } else {
            this.f1.d();
        }
    }

    @Override // qm6
    public final void w0() {
        super.w0();
        this.l1.clear();
        this.E1 = 0;
        this.U1 = 0;
        this.H1 = false;
        qx6 qx6Var = this.i1;
        if (qx6Var != null) {
            qx6Var.c = null;
            ByteBuffer byteBuffer = (ByteBuffer) qx6Var.b;
            byteBuffer.position(byteBuffer.limit());
        }
    }

    @Override // vg0
    public final void x() {
        Q0();
        int i = this.J1;
        if (i != 0) {
            long j = this.I1;
            k7b k7bVar = this.c1;
            Handler handler = (Handler) k7bVar.b;
            if (handler != null) {
                handler.post(new tfc(k7bVar, j, i));
            }
            this.I1 = 0L;
            this.J1 = 0;
        }
        fgc fgcVar = this.r1;
        if (fgcVar != null) {
            fgcVar.e();
        } else {
            uec uecVar = this.f1;
            uecVar.d = false;
            uecVar.h = -9223372036854775807L;
            zec zecVar = uecVar.b;
            zecVar.d = false;
            wec wecVar = zecVar.c;
            if (wecVar != null) {
                wecVar.b();
            }
            zecVar.a();
        }
        vec vecVar = this.k1;
        if (vecVar != null) {
            vecVar.b();
        }
    }

    @Override // qm6, vg0
    public final void y(ko4[] ko4VarArr, long j, long j2, vz6 vz6Var) {
        super.y(ko4VarArr, j, j2, vz6Var);
        vec vecVar = this.k1;
        if (vecVar != null) {
            vecVar.b();
        }
    }
}
