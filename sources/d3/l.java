package d3;

import a8.b8;
import a8.ma;
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
import di.s4;
import e2.i1;
import e2.l1;
import e2.s0;
import e2.v1;
import e2.x1;
import h2.l0;
import h9.s1;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;
import l2.n1;
import l2.p1;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.uc1;
import x2.d1;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class l extends u2.r {
    public static final int[] T1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    public static boolean U1;
    public static boolean V1;
    public int A1;
    public int B1;
    public p1 C1;
    public long D1;
    public boolean E1;
    public long F1;
    public int G1;
    public long H1;
    public x1 I1;
    public x1 J1;
    public int K1;
    public boolean L1;
    public int M1;
    public k N1;
    public v O1;
    public long P1;
    public long Q1;
    public boolean R1;
    public int S1;
    public final Context a1;
    public final boolean b1;
    public final wf.b c1;
    public final int d1;
    public final boolean e1;
    public final x f1;
    public final w g1;
    public final wf.b h1;
    public final long i1;
    public final y j1;
    public final PriorityQueue k1;
    public b7.d l1;
    public boolean m1;
    public boolean n1;
    public k0 o1;
    public boolean p1;
    public int q1;
    public List r1;
    public Surface s1;
    public n t1;
    public h2.y u1;
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
        this.c1 = new wf.b(jVar.e, jVar.f);
        this.b1 = this.o1 == null;
        this.f1 = new x(applicationContext, this, jVar.d);
        this.g1 = new w();
        this.e1 = "NVIDIA".equals(Build.MANUFACTURER);
        this.u1 = h2.y.c;
        this.w1 = 1;
        this.x1 = 0;
        this.I1 = x1.d;
        this.M1 = 0;
        this.J1 = null;
        this.K1 = -1000;
        this.P1 = -9223372036854775807L;
        this.Q1 = -9223372036854775807L;
        this.h1 = new wf.b(13);
        this.k1 = new PriorityQueue();
        this.i1 = -15000L;
        this.j1 = new y();
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
                    int i7 = Build.VERSION.SDK_INT;
                    char c10 = 28;
                    if (i7 <= 28) {
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
                    if (i7 > 27 || !"HWEML".equals(Build.DEVICE)) {
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
                        return ((l0.g(i10, 16) * l0.g(i7, 16)) * 768) / 4;
                    }
                    break;
                case 6:
                    return ((i7 * i10) * 3) / 8;
            }
        }
        return -1;
    }

    public static List F0(Context context, u2.i iVar, e2.u uVar, boolean z10, boolean z11) {
        String str = uVar.s;
        if (str == null) {
            return s1.e;
        }
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(str) && !f2.i.c(context)) {
            String c10 = u2.w.c(uVar);
            List b10 = c10 == null ? s1.e : iVar.b(c10, z10, z11);
            if (!b10.isEmpty()) {
                return b10;
            }
        }
        return u2.w.g(iVar, uVar, z10, z11);
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
        k0 k0Var = this.o1;
        if (k0Var != null) {
            k0Var.d(f10);
        } else {
            this.f1.h(f10);
        }
        y yVar = this.j1;
        if (yVar != null) {
            yVar.c(f10);
        }
    }

    @Override // l2.b
    public final boolean E(long j3) {
        if (this.J0 == -9223372036854775807L || j3 < this.D1) {
            return false;
        }
        long j10 = this.R0;
        return j10 == -9223372036854775807L || j3 > j10;
    }

    @Override // u2.r
    public final l2.f H(u2.o oVar, e2.u uVar, e2.u uVar2, boolean z10) {
        int i7;
        l2.f b10 = oVar.b(uVar, uVar2);
        float f10 = uVar.D;
        float f11 = uVar2.D;
        int i10 = b10.e;
        b7.d dVar = this.l1;
        dVar.getClass();
        if (uVar2.z > dVar.a || uVar2.A > dVar.b) {
            i10 |= 256;
        }
        if (G0(oVar, uVar2) > dVar.c) {
            i10 |= 64;
        }
        if (this.x1 != Integer.MIN_VALUE && (i7 = Build.VERSION.SDK_INT) < 31 && ((i7 != 30 || Build.MODEL.startsWith("MiTV")) && f10 != -1.0f && f11 != -1.0f && (!oVar.f || !z10))) {
            if (Math.abs((Math.max(f11, f10) / Math.min(f11, f10)) - Math.round(r14)) > 0.01f) {
                i10 |= 65536;
            }
        }
        int i11 = i10;
        return new l2.f(oVar.a, uVar, uVar2, i11 != 0 ? 0 : b10.d, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0070 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Surface H0(u2.o oVar) {
        boolean z10;
        m mVar;
        k0 k0Var = this.o1;
        if (k0Var != null) {
            return k0Var.b();
        }
        Surface surface = this.s1;
        if (surface != null) {
            return surface;
        }
        if (Build.VERSION.SDK_INT >= 35 && oVar.h) {
            return null;
        }
        ma.p(P0(oVar));
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
                int i7 = n.d;
            } else if (!n.b(context)) {
                z10 = false;
                ma.p(z10);
                mVar = new m("ExoPlayer:PlaceholderSurface");
                int i10 = !z11 ? n.d : 0;
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
            ma.p(z10);
            mVar = new m("ExoPlayer:PlaceholderSurface");
            if (!z11) {
            }
            mVar.start();
            Handler handler2 = new Handler(mVar.getLooper(), mVar);
            mVar.b = handler2;
            mVar.a = new h2.l(handler2);
            synchronized (mVar) {
            }
        }
        return this.t1;
    }

    @Override // u2.r
    public final u2.n I(IllegalStateException illegalStateException, u2.o oVar) {
        Surface surface = this.s1;
        h hVar = new h(illegalStateException, oVar);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return hVar;
    }

    public final boolean I0(u2.o oVar) {
        if (this.o1 != null) {
            return true;
        }
        Surface surface = this.s1;
        if (surface == null || !surface.isValid()) {
            return (Build.VERSION.SDK_INT >= 35 && oVar.h) || P0(oVar);
        }
        return true;
    }

    public final boolean J0(k2.h hVar) {
        if (j() || hVar.isLastSample()) {
            return true;
        }
        long j3 = this.Q1;
        return j3 == -9223372036854775807L || j3 - (hVar.e - this.Q0.c) <= 100000;
    }

    public final void K0() {
        if (this.z1 > 0) {
            this.h.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j3 = elapsedRealtime - this.y1;
            int i7 = this.z1;
            wf.b bVar = this.c1;
            Handler handler = (Handler) bVar.b;
            if (handler != null) {
                handler.post(new f0(bVar, i7, j3));
            }
            this.z1 = 0;
            this.y1 = elapsedRealtime;
        }
    }

    public final void L0() {
        u2.l lVar;
        if (this.L1 && (lVar = this.e0) != null) {
            this.N1 = new k(this, lVar);
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
        lVar.k(i7, j3);
        Trace.endSection();
        this.P0.e++;
        this.A1 = 0;
        if (this.o1 == null) {
            x1 x1Var = this.I1;
            boolean equals = x1Var.equals(x1.d);
            wf.b bVar = this.c1;
            if (!equals && !x1Var.equals(this.J1)) {
                this.J1 = x1Var;
                bVar.V(x1Var);
            }
            x xVar = this.f1;
            boolean z10 = xVar.e != 3;
            xVar.e = 3;
            xVar.l.getClass();
            xVar.g = l0.S(SystemClock.elapsedRealtime());
            if (!z10 || (surface = this.s1) == null) {
                return;
            }
            bVar.P(surface);
            this.v1 = true;
        }
    }

    public final void N0(Object obj) {
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        Surface surface2 = this.s1;
        wf.b bVar = this.c1;
        if (surface2 == surface) {
            if (surface != null) {
                x1 x1Var = this.J1;
                if (x1Var != null) {
                    bVar.V(x1Var);
                }
                Surface surface3 = this.s1;
                if (surface3 == null || !this.v1) {
                    return;
                }
                bVar.P(surface3);
                return;
            }
            return;
        }
        this.s1 = surface;
        k0 k0Var = this.o1;
        x xVar = this.f1;
        if (k0Var == null) {
            xVar.g(surface);
        }
        this.v1 = false;
        int i7 = this.n;
        u2.l lVar = this.e0;
        if (lVar != null && this.o1 == null) {
            u2.o oVar = this.l0;
            oVar.getClass();
            if (!I0(oVar) || this.m1) {
                n0();
                X();
            } else {
                Surface H0 = H0(oVar);
                if (H0 != null) {
                    try {
                        lVar.r(H0);
                    } catch (Throwable th2) {
                        th2.printStackTrace();
                        throw new u(th2);
                    }
                } else {
                    if (Build.VERSION.SDK_INT < 35) {
                        throw new IllegalStateException();
                    }
                    lVar.j();
                }
            }
        }
        if (surface != null) {
            x1 x1Var2 = this.J1;
            if (x1Var2 != null) {
                bVar.V(x1Var2);
            }
        } else {
            this.J1 = null;
            k0 k0Var2 = this.o1;
            if (k0Var2 != null) {
                k0Var2.m();
            }
        }
        if (i7 == 2) {
            k0 k0Var3 = this.o1;
            if (k0Var3 != null) {
                k0Var3.r(true);
            } else {
                xVar.c(true);
            }
        }
        L0();
    }

    @Override // u2.r
    public final int O(k2.h hVar) {
        if (Build.VERSION.SDK_INT >= 34) {
            return ((this.C1 == null && !this.L1) || hVar.e >= this.x || J0(hVar)) ? 0 : 32;
        }
        return 0;
    }

    public final boolean O0(long j3, long j10, boolean z10, boolean z11) {
        int B;
        if (this.o1 != null && this.b1) {
            j10 -= -this.P1;
        }
        if (j3 >= -500000 || z10 || (B = B(j10)) == 0) {
            return false;
        }
        this.D1 = j10;
        PriorityQueue priorityQueue = this.k1;
        if (z11) {
            l2.e eVar = this.P0;
            int i7 = eVar.d + B;
            eVar.d = i7;
            eVar.f += this.B1;
            eVar.d = priorityQueue.size() + i7;
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
        k0 k0Var = this.o1;
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
        if (this.C1 == null || (oVar = this.l0) == null) {
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
        if (this.L1 || D0(oVar.a)) {
            return false;
        }
        return !oVar.f || n.b(this.a1);
    }

    @Override // u2.r
    public final ArrayList Q(u2.i iVar, e2.u uVar, boolean z10) {
        boolean z11 = this.L1;
        Context context = this.a1;
        List F0 = F0(context, iVar, uVar, z10, z11);
        HashMap hashMap = u2.w.a;
        ArrayList arrayList = new ArrayList(F0);
        Collections.sort(arrayList, new s4(new uc1(14, context, uVar), 4));
        return arrayList;
    }

    public final void Q0(u2.l lVar, int i7) {
        Trace.beginSection("skipVideoBuffer");
        lVar.i(i7);
        Trace.endSection();
        this.P0.f++;
    }

    public final void R0(int i7, int i10) {
        l2.e eVar = this.P0;
        eVar.h += i7;
        int i11 = i7 + i10;
        eVar.g += i11;
        this.z1 += i11;
        int i12 = this.A1 + i11;
        this.A1 = i12;
        eVar.i = Math.max(i12, eVar.i);
        int i13 = this.d1;
        if (i13 <= 0 || this.z1 < i13) {
            return;
        }
        K0();
    }

    public final void S0(x2.g0 g0Var) {
        l1 l1Var = this.G;
        if (l1Var.p()) {
            this.Q1 = -9223372036854775807L;
            return;
        }
        int b10 = l1Var.b(g0Var.a);
        if (b10 == -1) {
            this.Q1 = -9223372036854775807L;
        } else {
            this.Q1 = l1Var.f(b10, new i1(), false).d;
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
        boolean z10;
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
            boolean z11 = false;
            while (i16 < length) {
                e2.u uVar2 = uVarArr[i16];
                e2.u[] uVarArr2 = uVarArr;
                if (mVar2 != null && uVar2.I == null) {
                    e2.t a10 = uVar2.a();
                    a10.H = mVar2;
                    uVar2 = new e2.u(a10);
                }
                l2.f b11 = oVar.b(uVar, uVar2);
                int i17 = length;
                int i18 = uVar2.A;
                if (b11.d != 0) {
                    int i19 = uVar2.z;
                    i11 = i16;
                    c10 = 65535;
                    z11 |= i19 == -1 || i18 == -1;
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
            if (z11) {
                h2.a.l("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + i14 + "x" + i15);
                boolean z12 = i13 > i12;
                int i20 = z12 ? i13 : i12;
                boolean z13 = z12;
                int i21 = z12 ? i12 : i13;
                float f12 = i21 / i20;
                int i22 = 0;
                while (true) {
                    mVar = mVar2;
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
                        point = new Point(l0.g(i25, widthAlignment) * widthAlignment, l0.g(i23, heightAlignment) * heightAlignment);
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
        this.l1 = dVar;
        int i27 = this.L1 ? this.M1 : 0;
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
        if (this.o1 != null && !l0.N(this.a1)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        return new b8(oVar, mediaFormat, uVar, H0, mediaCrypto, null);
    }

    public final void T0(long j3) {
        l2.e eVar = this.P0;
        eVar.k += j3;
        eVar.l++;
        this.F1 += j3;
        this.G1++;
    }

    @Override // u2.r
    public final void U(k2.h hVar) {
        if (this.n1) {
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
                        u2.l lVar = this.e0;
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
        k0 k0Var = this.o1;
        if (k0Var == null || k0Var.v()) {
            return true;
        }
        try {
            return this.o1.j(uVar);
        } catch (j0 e10) {
            throw d(e10, uVar, false, 7000);
        }
    }

    @Override // u2.r
    public final void a0(Exception exc) {
        h2.a.d("MediaCodecVideoRenderer", "Video codec error", exc);
        wf.b bVar = this.c1;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new c1.a(24, bVar, exc));
        }
    }

    @Override // u2.r
    public final void b0(long j3, String str, long j10) {
        String str2;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        wf.b bVar = this.c1;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            str2 = str;
            handler.post(new e0(bVar, str2, j3, j10, 0));
        } else {
            str2 = str;
        }
        this.m1 = D0(str2);
        u2.o oVar = this.l0;
        oVar.getClass();
        boolean z10 = false;
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
                    z10 = true;
                    break;
                }
                i7++;
            }
        }
        this.n1 = z10;
        L0();
    }

    @Override // u2.r, l2.b, l2.j1
    public final void c(int i7, Object obj) {
        if (i7 == 1) {
            N0(obj);
            return;
        }
        if (i7 == 7) {
            obj.getClass();
            v vVar = (v) obj;
            this.O1 = vVar;
            k0 k0Var = this.o1;
            if (k0Var != null) {
                k0Var.c(vVar);
                return;
            }
            return;
        }
        if (i7 == 10) {
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
        if (i7 == 4) {
            obj.getClass();
            int intValue2 = ((Integer) obj).intValue();
            this.w1 = intValue2;
            u2.l lVar = this.e0;
            if (lVar != null) {
                lVar.q(intValue2);
                return;
            }
            return;
        }
        if (i7 == 5) {
            obj.getClass();
            int intValue3 = ((Integer) obj).intValue();
            this.x1 = intValue3;
            k0 k0Var2 = this.o1;
            if (k0Var2 != null) {
                k0Var2.l(intValue3);
                return;
            }
            c0 c0Var = this.f1.b;
            if (c0Var.j == intValue3) {
                return;
            }
            c0Var.j = intValue3;
            c0Var.d(true);
            return;
        }
        if (i7 == 13) {
            obj.getClass();
            List list = (List) obj;
            if (list.equals(v1.a)) {
                k0 k0Var3 = this.o1;
                if (k0Var3 == null || !k0Var3.v()) {
                    return;
                }
                this.o1.t();
                return;
            }
            this.r1 = list;
            k0 k0Var4 = this.o1;
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
            this.u1 = yVar;
            k0 k0Var5 = this.o1;
            if (k0Var5 != null) {
                Surface surface = this.s1;
                surface.getClass();
                k0Var5.f(surface, yVar);
                return;
            }
            return;
        }
        switch (i7) {
            case 16:
                obj.getClass();
                this.K1 = ((Integer) obj).intValue();
                u2.l lVar2 = this.e0;
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
                ((l) obj).c(1, surface2);
                break;
            case 18:
                boolean z10 = this.C1 != null;
                p1 p1Var = (p1) obj;
                this.C1 = p1Var;
                if (z10 != (p1Var != null)) {
                    A0(this.f0);
                    break;
                }
                break;
            default:
                super.c(i7, obj);
                break;
        }
    }

    @Override // u2.r
    public final void c0(l2.d dVar) {
        wf.b bVar = this.c1;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new c1.a(22, bVar, dVar));
        }
    }

    @Override // u2.r
    public final void d0(String str) {
        wf.b bVar = this.c1;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new c1.a(25, bVar, str));
        }
    }

    @Override // u2.r
    public final l2.f e0(jb.m mVar) {
        l2.f e02 = super.e0(mVar);
        e2.u uVar = (e2.u) mVar.c;
        uVar.getClass();
        wf.b bVar = this.c1;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new aa.r(bVar, uVar, e02, 17));
        }
        y yVar = this.j1;
        if (yVar != null) {
            yVar.b();
        }
        return e02;
    }

    @Override // l2.b
    public final void f() {
        k0 k0Var = this.o1;
        if (k0Var == null) {
            x xVar = this.f1;
            if (xVar.e == 0) {
                xVar.e = 1;
                return;
            }
            return;
        }
        int i7 = this.q1;
        if (i7 == 0 || i7 == 1) {
            this.q1 = 0;
        } else {
            k0Var.w();
        }
    }

    @Override // u2.r
    public final void f0(e2.u uVar, MediaFormat mediaFormat) {
        int integer;
        int i7;
        u2.l lVar = this.e0;
        if (lVar != null) {
            lVar.q(this.w1);
        }
        if (this.L1) {
            i7 = uVar.z;
            integer = uVar.A;
        } else {
            mediaFormat.getClass();
            boolean z10 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            int integer2 = z10 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
            integer = z10 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
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
        this.I1 = new x1(f10, i7, integer);
        k0 k0Var = this.o1;
        if (k0Var == null || !this.R1) {
            this.f1.f(uVar.D);
        } else {
            e2.t a10 = uVar.a();
            a10.y = i7;
            a10.z = integer;
            a10.E = f10;
            e2.u uVar2 = new e2.u(a10);
            int i12 = this.q1;
            List list = this.r1;
            if (list == null) {
                h9.g0 g0Var = h9.i0.b;
                list = s1.e;
            }
            k0Var.u(uVar2, this.Q0.b, i12, list);
            this.q1 = 2;
        }
        this.R1 = false;
    }

    @Override // u2.r
    public final void h0(long j3) {
        super.h0(j3);
        if (this.L1) {
            return;
        }
        this.B1--;
    }

    @Override // l2.b
    public final String i() {
        return "MediaCodecVideoRenderer";
    }

    @Override // u2.r
    public final void i0() {
        k0 k0Var = this.o1;
        if (k0Var != null) {
            k0Var.k();
            if (this.P1 == -9223372036854775807L) {
                this.P1 = this.Q0.b;
            }
            this.o1.i(-this.P1);
        } else {
            this.f1.e(2);
        }
        this.R1 = true;
        L0();
    }

    @Override // u2.r
    public final void j0(k2.h hVar) {
        ByteBuffer byteBuffer;
        wf.b bVar = this.h1;
        if (bVar != null) {
            u2.o oVar = this.l0;
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
        this.S1 = 0;
        int O = O(hVar);
        if ((Build.VERSION.SDK_INT < 34 || (O & 32) == 0) && !this.L1) {
            this.B1++;
        }
    }

    @Override // l2.b
    public final boolean k() {
        if (!this.L0) {
            return false;
        }
        k0 k0Var = this.o1;
        return k0Var == null || k0Var.a();
    }

    @Override // u2.r
    public final boolean l0(long j3, long j10, u2.l lVar, ByteBuffer byteBuffer, int i7, int i10, int i11, long j11, boolean z10, boolean z11, e2.u uVar) {
        int i12;
        lVar.getClass();
        long j12 = j11 - this.Q0.c;
        int i13 = 0;
        while (true) {
            PriorityQueue priorityQueue = this.k1;
            Long l10 = (Long) priorityQueue.peek();
            if (l10 == null || l10.longValue() >= j11) {
                break;
            }
            i13++;
            priorityQueue.poll();
        }
        R0(i13, 0);
        k0 k0Var = this.o1;
        if (k0Var != null) {
            if (!z10 || z11) {
                return k0Var.n(j11, new i(this, lVar, i7, j12));
            }
            Q0(lVar, i7);
            return true;
        }
        int a10 = this.f1.a(j11, j3, j10, this.Q0.b, z10, z11, this.g1);
        w wVar = this.g1;
        y yVar = this.j1;
        if (yVar != null && a10 != 5 && a10 != 4) {
            yVar.a(j11, wVar.a);
        }
        if (a10 == 0) {
            this.h.getClass();
            long nanoTime = System.nanoTime();
            v vVar = this.O1;
            if (vVar != null) {
                vVar.a(j12, nanoTime, uVar, this.g0);
            }
            M0(lVar, i7, nanoTime);
            T0(wVar.a);
            return true;
        }
        if (a10 == 1) {
            long j13 = wVar.b;
            long j14 = wVar.a;
            if (j13 == this.H1) {
                Q0(lVar, i7);
            } else {
                v vVar2 = this.O1;
                if (vVar2 != null) {
                    i12 = i7;
                    vVar2.a(j12, j13, uVar, this.g0);
                } else {
                    i12 = i7;
                }
                M0(lVar, i12, j13);
            }
            T0(j14);
            this.H1 = j13;
            return true;
        }
        if (a10 == 2) {
            Trace.beginSection("dropVideoBuffer");
            lVar.i(i7);
            Trace.endSection();
            R0(0, 1);
            T0(wVar.a);
            return true;
        }
        if (a10 == 3) {
            Q0(lVar, i7);
            T0(wVar.a);
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
    @Override // l2.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m() {
        boolean h;
        boolean z10 = false;
        if (this.V != null) {
            if (j()) {
                h = this.E;
            } else {
                d1 d1Var = this.r;
                d1Var.getClass();
                h = d1Var.h();
            }
            if (!h) {
                if (!(this.w0 >= 0)) {
                    if (this.u0 != -9223372036854775807L) {
                        this.h.getClass();
                    }
                }
            }
            z10 = true;
        }
        k0 k0Var = this.o1;
        if (k0Var != null) {
            return k0Var.s(z10);
        }
        if (z10 && (this.e0 == null || this.L1)) {
            return true;
        }
        return this.f1.b(z10);
    }

    @Override // u2.r, l2.b
    public final void n() {
        wf.b bVar = this.c1;
        this.J1 = null;
        this.Q1 = -9223372036854775807L;
        L0();
        this.v1 = false;
        this.N1 = null;
        this.E1 = true;
        try {
            super.n();
        } finally {
            bVar.t(this.P0);
            bVar.V(x1.d);
        }
    }

    @Override // l2.b
    public final void o(boolean z10, boolean z11) {
        k0 k0Var;
        this.P0 = new l2.e();
        n1 n1Var = this.d;
        n1Var.getClass();
        boolean z12 = n1Var.b;
        ma.p((z12 && this.M1 == 0) ? false : true);
        if (this.L1 != z12) {
            this.L1 = z12;
            n0();
        }
        l2.e eVar = this.P0;
        wf.b bVar = this.c1;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new g0(bVar, eVar, 0));
        }
        boolean z13 = this.p1;
        x xVar = this.f1;
        if (!z13) {
            if (this.r1 != null && this.o1 == null) {
                ai.u uVar = new ai.u(this.a1, xVar);
                uVar.a = true;
                long j3 = this.i1;
                uVar.c = j3 != -9223372036854775807L ? -j3 : -9223372036854775807L;
                h2.g0 g0Var = this.h;
                g0Var.getClass();
                uVar.g = g0Var;
                ma.p(!uVar.b);
                if (((r) uVar.f) == null) {
                    uVar.f = new r();
                }
                t tVar = new t(uVar);
                uVar.b = true;
                if (1 >= tVar.p) {
                    tVar.p = 1;
                }
                SparseArray sparseArray = tVar.c;
                if (l0.k(sparseArray, 0)) {
                    k0Var = (k0) sparseArray.get(0);
                } else {
                    o oVar = new o(tVar, tVar.a);
                    tVar.g.add(oVar);
                    sparseArray.put(0, oVar);
                    k0Var = oVar;
                }
                this.o1 = k0Var;
            }
            this.p1 = true;
        }
        k0 k0Var2 = this.o1;
        if (k0Var2 == null) {
            h2.g0 g0Var2 = this.h;
            g0Var2.getClass();
            xVar.l = g0Var2;
            xVar.e(!z11 ? 1 : 0);
            return;
        }
        k0Var2.g(new d6.i(this, 12));
        v vVar = this.O1;
        if (vVar != null) {
            this.o1.c(vVar);
        }
        if (this.s1 != null && !this.u1.equals(h2.y.c)) {
            this.o1.f(this.s1, this.u1);
        }
        this.o1.l(this.x1);
        this.o1.d(this.c0);
        List list = this.r1;
        if (list != null) {
            this.o1.p(list);
        }
        this.q1 = !z11 ? 1 : 0;
        this.T0 = true;
    }

    @Override // u2.r
    public final void o0() {
        k0 k0Var = this.o1;
        if (k0Var != null) {
            k0Var.k();
        } else {
            long j3 = this.Q0.f;
        }
    }

    @Override // u2.r, l2.b
    public final void p(long j3, boolean z10, boolean z11) {
        k0 k0Var = this.o1;
        if (k0Var != null && !z10) {
            k0Var.o(true);
        }
        if (z11) {
            this.D1 = j3;
        }
        super.p(j3, z10, z11);
        k0 k0Var2 = this.o1;
        x xVar = this.f1;
        if (k0Var2 == null) {
            xVar.b.b();
            xVar.h = -9223372036854775807L;
            xVar.f = -9223372036854775807L;
            xVar.e = Math.min(xVar.e, 1);
            xVar.i = -9223372036854775807L;
            xVar.n = false;
        }
        y yVar = this.j1;
        if (yVar != null) {
            yVar.b();
        }
        if (z10) {
            k0 k0Var3 = this.o1;
            if (k0Var3 != null) {
                k0Var3.r(false);
            } else {
                xVar.c(false);
            }
        }
        L0();
        this.A1 = 0;
    }

    @Override // l2.b
    public final void q() {
        k0 k0Var = this.o1;
        if (k0Var == null || !this.b1) {
            return;
        }
        k0Var.release();
    }

    @Override // u2.r
    public final void q0() {
        super.q0();
        this.k1.clear();
        this.B1 = 0;
        this.S1 = 0;
        this.E1 = false;
        wf.b bVar = this.h1;
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
                this.z0 = false;
                p0();
                n0();
            } finally {
                p5.c.w(this.Y, null);
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

    @Override // l2.b
    public final void s() {
        this.z1 = 0;
        this.h.getClass();
        this.y1 = SystemClock.elapsedRealtime();
        this.F1 = 0L;
        this.G1 = 0;
        k0 k0Var = this.o1;
        if (k0Var != null) {
            k0Var.h();
        } else {
            this.f1.d();
        }
    }

    @Override // l2.b
    public final void t() {
        K0();
        int i7 = this.G1;
        if (i7 != 0) {
            long j3 = this.F1;
            wf.b bVar = this.c1;
            Handler handler = (Handler) bVar.b;
            if (handler != null) {
                handler.post(new f0(bVar, j3, i7));
            }
            this.F1 = 0L;
            this.G1 = 0;
        }
        k0 k0Var = this.o1;
        if (k0Var != null) {
            k0Var.e();
        } else {
            x xVar = this.f1;
            xVar.d = false;
            xVar.i = -9223372036854775807L;
            c0 c0Var = xVar.b;
            c0Var.d = false;
            z zVar = c0Var.c;
            if (zVar != null) {
                zVar.b();
            }
            c0Var.a();
        }
        y yVar = this.j1;
        if (yVar != null) {
            yVar.b();
        }
    }

    @Override // u2.r, l2.b
    public final void u(e2.u[] uVarArr, long j3, long j10, x2.g0 g0Var) {
        super.u(uVarArr, j3, j10, g0Var);
        S0(g0Var);
        y yVar = this.j1;
        if (yVar != null) {
            yVar.b();
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
        boolean z10;
        ByteBuffer byteBuffer;
        i2.r rVar;
        ei.a aVar;
        boolean z11 = false;
        if (!J0(hVar)) {
            boolean z12 = hVar.e < this.x;
            y yVar = this.j1;
            if (yVar != null) {
                long j3 = yVar.a == -9223372036854775807L ? -9223372036854775807L : (long) (((r2 - r6) * yVar.c) + yVar.b);
                if (j3 != -9223372036854775807L && j3 < this.i1) {
                    z10 = true;
                    if ((!z12 || z10) && !hVar.hasSupplementalData()) {
                        if (hVar.notDependedOn()) {
                            wf.b bVar = this.h1;
                            if (bVar != null) {
                                ByteBuffer byteBuffer2 = (ByteBuffer) bVar.b;
                                u2.o oVar = this.l0;
                                oVar.getClass();
                                if (oVar.b.equals("video/av01") && (byteBuffer = hVar.c) != null) {
                                    boolean z13 = z12 || this.S1 <= 0;
                                    ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                                    asReadOnlyBuffer.flip();
                                    if (byteBuffer2.hasRemaining()) {
                                        bVar.U(i2.o.o(byteBuffer2));
                                        byteBuffer2.position(byteBuffer2.limit());
                                    }
                                    ArrayList o4 = i2.o.o(asReadOnlyBuffer);
                                    bVar.U(o4);
                                    int size = o4.size() - 1;
                                    int i7 = 0;
                                    while (size >= 0) {
                                        i2.q qVar = (i2.q) o4.get(size);
                                        int i10 = qVar.a;
                                        if (i10 != 2 && i10 != 15) {
                                            if ((i10 == 3 && !z13) || ((i10 != 6 && i10 != 3) || (rVar = (i2.r) bVar.c) == null)) {
                                                break;
                                            }
                                            try {
                                                aVar = new ei.a(rVar, qVar);
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
                                        b7.d dVar = this.l1;
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

    @Override // l2.b
    public final void v() {
        x2.g0 g0Var = this.H;
        if (g0Var != null) {
            S0(g0Var);
        }
    }

    @Override // u2.r
    public final boolean v0() {
        boolean z10;
        e2.u uVar = this.f0;
        long j3 = this.Q1;
        if (j3 != -9223372036854775807L) {
            if (this.V0 + 1 + j3 <= Long.MAX_VALUE - (this.Q0.c + j3)) {
                z10 = false;
                return this.C1 == null || this.E1 || this.L1 || (uVar != null && uVar.u > 0) || z10 || this.Q0.f != -9223372036854775807L;
            }
        }
        z10 = true;
        if (this.C1 == null) {
        }
    }

    @Override // u2.r
    public final boolean w0(u2.o oVar) {
        return I0(oVar);
    }

    @Override // u2.r, l2.b
    public final void x(long j3, long j10) {
        k0 k0Var = this.o1;
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
        u2.o oVar = this.l0;
        if (this.o1 != null && oVar != null) {
            String str = oVar.a;
            if (str.equals("c2.mtk.avc.decoder") || str.equals("c2.mtk.hevc.decoder")) {
                return true;
            }
        }
        return super.x0();
    }

    @Override // u2.r
    public final int z0(u2.i iVar, e2.u uVar) {
        boolean z10;
        int i7 = 0;
        if (!s0.m(uVar.s)) {
            return i5.c.a(0, 0, 0, 0);
        }
        boolean z11 = uVar.w != null;
        Context context = this.a1;
        List F0 = F0(context, iVar, uVar, z11, false);
        if (z11 && F0.isEmpty()) {
            F0 = F0(context, iVar, uVar, false, false);
        }
        if (F0.isEmpty()) {
            return i5.c.a(1, 0, 0, 0);
        }
        int i10 = uVar.T;
        if (i10 != 0 && i10 != 2) {
            return i5.c.a(2, 0, 0, 0);
        }
        u2.o oVar = (u2.o) F0.get(0);
        boolean e10 = oVar.e(context, uVar);
        if (!e10) {
            for (int i11 = 1; i11 < F0.size(); i11++) {
                u2.o oVar2 = (u2.o) F0.get(i11);
                if (oVar2.e(context, uVar)) {
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
        int i14 = oVar.f(uVar) ? 16 : 8;
        int i15 = oVar.g ? 64 : 0;
        int i16 = z10 ? 128 : 0;
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(uVar.s) && !f2.i.c(context)) {
            i16 = 256;
        }
        if (e10) {
            List F02 = F0(context, iVar, uVar, z11, true);
            if (!F02.isEmpty()) {
                HashMap hashMap = u2.w.a;
                ArrayList arrayList = new ArrayList(F02);
                Collections.sort(arrayList, new s4(new uc1(14, context, uVar), i12));
                u2.o oVar3 = (u2.o) arrayList.get(0);
                if (oVar3.e(context, uVar) && oVar3.f(uVar)) {
                    i7 = 32;
                }
            }
        }
        return i13 | i14 | i7 | i15 | i16;
    }
}
