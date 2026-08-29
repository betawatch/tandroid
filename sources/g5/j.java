package g5;

import a4.b0;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import f5.d0;
import j3.h0;
import j3.s0;
import j3.t0;
import j3.u0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLObject;
import q8.l0;
import q8.z;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class j extends a4.t {
    public static final int[] n1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    public static boolean o1;
    public static boolean p1;
    public final Context E0;
    public final s F0;
    public final ze.b G0;
    public final long H0;
    public final int I0;
    public final boolean J0;
    public c8.a K0;
    public boolean L0;
    public boolean M0;
    public Surface N0;
    public l O0;
    public boolean P0;
    public int Q0;
    public boolean R0;
    public boolean S0;
    public boolean T0;
    public long U0;
    public long V0;
    public long W0;
    public int X0;
    public int Y0;
    public int Z0;
    public long a1;
    public long b1;
    public long c1;
    public int d1;
    public int e1;
    public int f1;
    public int g1;
    public float h1;
    public y i1;
    public boolean j1;
    public int k1;
    public i l1;
    public n m1;

    public j(Context context, a4.m mVar, Handler handler, h0 h0Var) {
        super(2, mVar, 30.0f);
        this.H0 = 5000L;
        this.I0 = 50;
        Context applicationContext = context.getApplicationContext();
        this.E0 = applicationContext;
        this.F0 = new s(applicationContext);
        this.G0 = new ze.b(handler, h0Var);
        this.J0 = "NVIDIA".equals(d0.c);
        this.V0 = -9223372036854775807L;
        this.e1 = -1;
        this.f1 = -1;
        this.h1 = -1.0f;
        this.Q0 = 1;
        this.k1 = 0;
        this.i1 = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x0742, code lost:
    
        if (r0.equals("ELUGA_Ray_X") == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x08cc, code lost:
    
        if (r13.equals("JSN-L21") == false) goto L664;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008d A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean R(String str) {
        char c3;
        char c6;
        boolean z10 = false;
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (j.class) {
            try {
                if (!o1) {
                    int i10 = d0.a;
                    char c10 = 28;
                    if (i10 <= 28) {
                        String str2 = d0.b;
                        str2.getClass();
                        switch (str2.hashCode()) {
                            case -1339091551:
                                if (str2.equals("dangal")) {
                                    c6 = 0;
                                    break;
                                }
                                c6 = 65535;
                                break;
                            case -1220081023:
                                if (str2.equals("dangalFHD")) {
                                    c6 = 1;
                                    break;
                                }
                                c6 = 65535;
                                break;
                            case -1220066608:
                                if (str2.equals("dangalUHD")) {
                                    c6 = 2;
                                    break;
                                }
                                c6 = 65535;
                                break;
                            case -1012436106:
                                if (str2.equals("oneday")) {
                                    c6 = 3;
                                    break;
                                }
                                c6 = 65535;
                                break;
                            case -760312546:
                                if (str2.equals("aquaman")) {
                                    c6 = 4;
                                    break;
                                }
                                c6 = 65535;
                                break;
                            case -64886864:
                                if (str2.equals("magnolia")) {
                                    c6 = 5;
                                    break;
                                }
                                c6 = 65535;
                                break;
                            case 3415681:
                                if (str2.equals("once")) {
                                    c6 = 6;
                                    break;
                                }
                                c6 = 65535;
                                break;
                            case 825323514:
                                if (str2.equals("machuca")) {
                                    c6 = 7;
                                    break;
                                }
                                c6 = 65535;
                                break;
                            default:
                                c6 = 65535;
                                break;
                        }
                        switch (c6) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                                z10 = true;
                                break;
                        }
                        p1 = z10;
                        o1 = true;
                    }
                    if (i10 > 27 || !"HWEML".equals(d0.b)) {
                        String str3 = d0.d;
                        str3.getClass();
                        switch (str3.hashCode()) {
                            case -349662828:
                                if (str3.equals("AFTJMST12")) {
                                    c3 = 0;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -321033677:
                                if (str3.equals("AFTKMST12")) {
                                    c3 = 1;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 2006354:
                                if (str3.equals("AFTA")) {
                                    c3 = 2;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 2006367:
                                if (str3.equals("AFTN")) {
                                    c3 = 3;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 2006371:
                                if (str3.equals("AFTR")) {
                                    c3 = 4;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 1785421873:
                                if (str3.equals("AFTEU011")) {
                                    c3 = 5;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 1785421876:
                                if (str3.equals("AFTEU014")) {
                                    c3 = 6;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 1798172390:
                                if (str3.equals("AFTSO001")) {
                                    c3 = 7;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 2119412532:
                                if (str3.equals("AFTEUFF014")) {
                                    c3 = '\b';
                                    break;
                                }
                                c3 = 65535;
                                break;
                            default:
                                c3 = 65535;
                                break;
                        }
                        switch (c3) {
                            default:
                                if (i10 <= 26) {
                                    String str4 = d0.b;
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
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case '\b':
                                break;
                        }
                        p1 = z10;
                        o1 = true;
                    }
                    z10 = true;
                    p1 = z10;
                    o1 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return p1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0082, code lost:
    
        if (r3.equals("video/av01") == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int S(a4.q qVar, t0 t0Var) {
        int intValue;
        int i10 = t0Var.G;
        int i11 = t0Var.H;
        if (i10 != -1 && i11 != -1) {
            String str = t0Var.B;
            char c3 = 1;
            if ("video/dolby-vision".equals(str)) {
                Pair d = b0.d(t0Var);
                str = (d == null || !((intValue = ((Integer) d.first).intValue()) == 512 || intValue == 1 || intValue == 2)) ? "video/hevc" : MediaController.VIDEO_MIME_TYPE;
            }
            str.getClass();
            switch (str.hashCode()) {
                case -1664118616:
                    if (str.equals("video/3gpp")) {
                        c3 = 0;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -1662735862:
                    break;
                case -1662541442:
                    if (str.equals("video/hevc")) {
                        c3 = 2;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1187890754:
                    if (str.equals("video/mp4v-es")) {
                        c3 = 3;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1331836730:
                    if (str.equals(MediaController.VIDEO_MIME_TYPE)) {
                        c3 = 4;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1599127256:
                    if (str.equals("video/x-vnd.on2.vp8")) {
                        c3 = 5;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1599127257:
                    if (str.equals("video/x-vnd.on2.vp9")) {
                        c3 = 6;
                        break;
                    }
                    c3 = 65535;
                    break;
                default:
                    c3 = 65535;
                    break;
            }
            switch (c3) {
                case 0:
                case 1:
                case 3:
                case 5:
                    return ((i10 * i11) * 3) / 4;
                case 2:
                    return Math.max(TLObject.FLAG_21, ((i10 * i11) * 3) / 4);
                case 4:
                    String str2 = d0.d;
                    if (!"BRAVIA 4K 2015".equals(str2) && (!"Amazon".equals(d0.c) || (!"KFSOWI".equals(str2) && (!"AFTS".equals(str2) || !qVar.f)))) {
                        return ((d0.f(i11, 16) * d0.f(i10, 16)) * 768) / 4;
                    }
                    break;
                case 6:
                    return ((i10 * i11) * 3) / 8;
            }
        }
        return -1;
    }

    public static z T(Context context, a4.u uVar, t0 t0Var, boolean z10, boolean z11) {
        String str = t0Var.B;
        if (str == null) {
            q8.x xVar = z.b;
            return l0.e;
        }
        uVar.getClass();
        List e10 = b0.e(str, z10, z11);
        String b10 = b0.b(t0Var);
        if (b10 == null) {
            return z.u(e10);
        }
        List e11 = b0.e(b10, z10, z11);
        if (d0.a >= 26 && "video/dolby-vision".equals(t0Var.B) && !e11.isEmpty() && !h.a(context)) {
            return z.u(e11);
        }
        q8.x xVar2 = z.b;
        q8.w wVar = new q8.w();
        wVar.b(e10);
        wVar.b(e11);
        return wVar.c();
    }

    public static int U(a4.q qVar, t0 t0Var) {
        int i10 = t0Var.C;
        List list = t0Var.D;
        if (i10 == -1) {
            return S(qVar, t0Var);
        }
        int size = list.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += ((byte[]) list.get(i12)).length;
        }
        return t0Var.C + i11;
    }

    @Override // a4.t
    public final void A() {
        Q();
    }

    /* JADX WARN: Code restructure failed: missing block: B:188:0x0076, code lost:
    
        if ((r9 == 0 ? false : r11.g[(int) ((r9 - 1) % 15)]) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0144, code lost:
    
        if ((((r5 > (-30000) ? 1 : (r5 == (-30000) ? 0 : -1)) < 0) && r40 > 100000) != false) goto L86;
     */
    /* JADX WARN: Removed duplicated region for block: B:68:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0172  */
    @Override // a4.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean C(long j10, long j11, a4.n nVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, t0 t0Var) {
        long j13;
        long j14;
        long j15;
        long j16;
        boolean z12;
        boolean z13;
        long j17;
        boolean z14;
        boolean z15;
        long j18;
        long j19;
        nVar.getClass();
        if (this.U0 == -9223372036854775807L) {
            this.U0 = j10;
        }
        if (j12 != this.a1) {
            s sVar = this.F0;
            j15 = -1;
            long j20 = sVar.n;
            if (j20 != -1) {
                sVar.p = j20;
                sVar.q = sVar.o;
            }
            sVar.m++;
            e eVar = sVar.a;
            long j21 = j12 * 1000;
            j13 = 1000;
            eVar.a.b(j21);
            if (eVar.a.a()) {
                eVar.c = false;
                j14 = 0;
            } else {
                j14 = 0;
                if (eVar.d != -9223372036854775807L) {
                    if (eVar.c) {
                        d dVar = eVar.b;
                        long j22 = dVar.d;
                    }
                    eVar.b.c();
                    eVar.b.b(eVar.d);
                    eVar.c = true;
                    eVar.b.b(j21);
                }
            }
            if (eVar.c && eVar.b.a()) {
                d dVar2 = eVar.a;
                eVar.a = eVar.b;
                eVar.b = dVar2;
                eVar.c = false;
            }
            eVar.d = j21;
            eVar.e = eVar.a.a() ? 0 : eVar.e + 1;
            sVar.b();
            this.a1 = j12;
        } else {
            j13 = 1000;
            j14 = 0;
            j15 = -1;
        }
        long j23 = this.B0;
        long j24 = j12 - j23;
        if (z10 && !z11) {
            b0(nVar, i10);
            return true;
        }
        double d = this.G;
        boolean z16 = getState() == 2;
        long elapsedRealtime = SystemClock.elapsedRealtime() * j13;
        long j25 = (long) ((j12 - j10) / d);
        if (z16) {
            j25 -= elapsedRealtime - j11;
        }
        if (this.N0 == this.O0) {
            if (!(j25 < -30000)) {
                return false;
            }
            b0(nVar, i10);
            d0(j25);
            return true;
        }
        long j26 = elapsedRealtime - this.b1;
        if (this.T0 ? this.R0 : !(z16 || this.S0)) {
            j16 = j26;
            z12 = false;
        } else {
            j16 = j26;
            z12 = true;
        }
        if (this.V0 == -9223372036854775807L && j10 >= j23) {
            if (!z12) {
                if (z16) {
                }
            }
            z13 = true;
            if (!z13) {
                long nanoTime = System.nanoTime();
                n nVar2 = this.m1;
                if (nVar2 != null) {
                    nVar2.a(j24, nanoTime, t0Var, this.K);
                }
                if (d0.a >= 21) {
                    Z(nVar, i10, nanoTime);
                } else {
                    Y(nVar, i10);
                }
                d0(j25);
                return true;
            }
            if (!z16 || j10 == this.U0) {
                return false;
            }
            long nanoTime2 = System.nanoTime();
            long j27 = (j25 * j13) + nanoTime2;
            s sVar2 = this.F0;
            if (sVar2.p == j15 || !sVar2.a.a.a()) {
                j17 = nanoTime2;
            } else {
                e eVar2 = sVar2.a;
                if (eVar2.a.a()) {
                    d dVar3 = eVar2.a;
                    long j28 = dVar3.e;
                    j19 = j28 == j14 ? j14 : dVar3.f / j28;
                } else {
                    j19 = -9223372036854775807L;
                }
                j17 = nanoTime2;
                long j29 = sVar2.q + ((long) (((sVar2.m - sVar2.p) * j19) / sVar2.i));
                if (Math.abs(j27 - j29) <= 20000000) {
                    j27 = j29;
                } else {
                    sVar2.m = j14;
                    long j30 = j15;
                    sVar2.p = j30;
                    sVar2.n = j30;
                }
            }
            sVar2.n = sVar2.m;
            sVar2.o = j27;
            r rVar = sVar2.c;
            if (rVar != null && sVar2.k != -9223372036854775807L) {
                long j31 = rVar.a;
                if (j31 != -9223372036854775807L) {
                    long j32 = sVar2.k;
                    long j33 = (((j27 - j31) / j32) * j32) + j31;
                    if (j27 <= j33) {
                        j18 = j33 - j32;
                    } else {
                        j18 = j33;
                        j33 = j32 + j33;
                    }
                    if (j33 - j27 >= j27 - j18) {
                        j33 = j18;
                    }
                    j27 = j33 - sVar2.l;
                }
            }
            long j34 = j27;
            long j35 = (j34 - j17) / j13;
            boolean z17 = this.V0 != -9223372036854775807L;
            if (j35 < -500000 && !z11) {
                int skipSource = skipSource(j10);
                if (skipSource == 0) {
                    z15 = false;
                } else {
                    if (z17) {
                        m3.f fVar = this.z0;
                        fVar.d += skipSource;
                        fVar.f += this.Z0;
                    } else {
                        this.z0.j++;
                        c0(skipSource, this.Z0);
                    }
                    if (i()) {
                        r();
                    }
                    z15 = true;
                }
                if (z15) {
                    return false;
                }
            }
            if (((j35 > (-30000L) ? 1 : (j35 == (-30000L) ? 0 : -1)) < 0) && !z11) {
                if (z17) {
                    b0(nVar, i10);
                    z14 = true;
                } else {
                    f5.a.c("dropVideoBuffer");
                    nVar.releaseOutputBuffer(i10, false);
                    f5.a.q();
                    z14 = true;
                    c0(0, 1);
                }
                d0(j35);
                return z14;
            }
            if (d0.a >= 21) {
                if (j35 >= 50000) {
                    return false;
                }
                n nVar3 = this.m1;
                if (nVar3 != null) {
                    nVar3.a(j24, j34, t0Var, this.K);
                }
                Z(nVar, i10, j34);
                d0(j35);
                return true;
            }
            if (j35 >= 30000) {
                return false;
            }
            if (j35 > 11000) {
                try {
                    Thread.sleep((j35 - 10000) / j13);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return false;
                }
            }
            n nVar4 = this.m1;
            if (nVar4 != null) {
                nVar4.a(j24, j34, t0Var, this.K);
            }
            Y(nVar, i10);
            d0(j35);
            return true;
        }
        z13 = false;
        if (!z13) {
        }
    }

    @Override // a4.t
    public final void G() {
        super.G();
        this.Z0 = 0;
    }

    @Override // a4.t
    public final boolean K(a4.q qVar) {
        return this.N0 != null || a0(qVar);
    }

    @Override // a4.t
    public final int M(a4.u uVar, t0 t0Var) {
        boolean z10;
        int i10 = 0;
        if (!f5.o.j(t0Var.B)) {
            return com.google.android.recaptcha.internal.a.b(0, 0, 0);
        }
        int i11 = 1;
        boolean z11 = t0Var.E != null;
        Context context = this.E0;
        z T = T(context, uVar, t0Var, z11, false);
        if (z11 && T.isEmpty()) {
            T = T(context, uVar, t0Var, false, false);
        }
        if (T.isEmpty()) {
            return com.google.android.recaptcha.internal.a.b(1, 0, 0);
        }
        int i12 = t0Var.W;
        if (i12 != 0 && i12 != 2) {
            return com.google.android.recaptcha.internal.a.b(2, 0, 0);
        }
        a4.q qVar = (a4.q) T.get(0);
        boolean d = qVar.d(t0Var);
        if (!d) {
            for (int i13 = 1; i13 < T.size(); i13++) {
                a4.q qVar2 = (a4.q) T.get(i13);
                if (qVar2.d(t0Var)) {
                    qVar = qVar2;
                    z10 = false;
                    d = true;
                    break;
                }
            }
        }
        z10 = true;
        int i14 = d ? 4 : 3;
        int i15 = qVar.e(t0Var) ? 16 : 8;
        int i16 = qVar.g ? 64 : 0;
        int i17 = z10 ? 128 : 0;
        if (d0.a >= 26 && "video/dolby-vision".equals(t0Var.B) && !h.a(context)) {
            i17 = 256;
        }
        if (d) {
            z T2 = T(context, uVar, t0Var, z11, true);
            if (!T2.isEmpty()) {
                Pattern pattern = b0.a;
                ArrayList arrayList = new ArrayList(T2);
                Collections.sort(arrayList, new a4.v(new a1.c(t0Var, i11), i10));
                a4.q qVar3 = (a4.q) arrayList.get(0);
                if (qVar3.d(t0Var) && qVar3.e(t0Var)) {
                    i10 = 32;
                }
            }
        }
        return i14 | i15 | i10 | i16 | i17;
    }

    public final void Q() {
        a4.n nVar;
        this.R0 = false;
        if (d0.a < 23 || !this.j1 || (nVar = this.I) == null) {
            return;
        }
        this.l1 = new i(this, nVar);
    }

    public final void V() {
        if (this.X0 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = elapsedRealtime - this.W0;
            int i10 = this.X0;
            ze.b bVar = this.G0;
            Handler handler = (Handler) bVar.a;
            if (handler != null) {
                handler.post(new u(bVar, i10, j10));
            }
            this.X0 = 0;
            this.W0 = elapsedRealtime;
        }
    }

    public final void W() {
        this.T0 = true;
        if (this.R0) {
            return;
        }
        this.R0 = true;
        Surface surface = this.N0;
        ze.b bVar = this.G0;
        Handler handler = (Handler) bVar.a;
        if (handler != null) {
            handler.post(new v(bVar, surface, SystemClock.elapsedRealtime(), 0));
        }
        this.P0 = true;
    }

    public final void X() {
        int i10 = this.e1;
        if (i10 == -1 && this.f1 == -1) {
            return;
        }
        y yVar = this.i1;
        if (yVar != null && yVar.a == i10 && yVar.b == this.f1 && yVar.c == this.g1 && yVar.d == this.h1) {
            return;
        }
        y yVar2 = new y(this.e1, this.f1, this.h1, this.g1);
        this.i1 = yVar2;
        ze.b bVar = this.G0;
        Handler handler = (Handler) bVar.a;
        if (handler != null) {
            handler.post(new ef.c(12, bVar, yVar2));
        }
    }

    public final void Y(a4.n nVar, int i10) {
        X();
        f5.a.c("releaseOutputBuffer");
        nVar.releaseOutputBuffer(i10, true);
        f5.a.q();
        this.b1 = SystemClock.elapsedRealtime() * 1000;
        this.z0.e++;
        this.Y0 = 0;
        W();
    }

    public final void Z(a4.n nVar, int i10, long j10) {
        X();
        f5.a.c("releaseOutputBuffer");
        nVar.d(i10, j10);
        f5.a.q();
        this.b1 = SystemClock.elapsedRealtime() * 1000;
        this.z0.e++;
        this.Y0 = 0;
        W();
    }

    public final boolean a0(a4.q qVar) {
        if (d0.a < 23 || this.j1 || R(qVar.a)) {
            return false;
        }
        return !qVar.f || l.b(this.E0);
    }

    @Override // a4.t
    public final m3.l b(a4.q qVar, t0 t0Var, t0 t0Var2) {
        m3.l b10 = qVar.b(t0Var, t0Var2);
        int i10 = b10.e;
        int i11 = t0Var2.G;
        c8.a aVar = this.K0;
        if (i11 > aVar.a || t0Var2.H > aVar.b) {
            i10 |= 256;
        }
        if (U(qVar, t0Var2) > this.K0.c) {
            i10 |= 64;
        }
        int i12 = i10;
        return new m3.l(qVar.a, t0Var, t0Var2, i12 != 0 ? 0 : b10.d, i12);
    }

    public final void b0(a4.n nVar, int i10) {
        f5.a.c("skipVideoBuffer");
        nVar.releaseOutputBuffer(i10, false);
        f5.a.q();
        this.z0.f++;
    }

    @Override // a4.t
    public final a4.o c(IllegalStateException illegalStateException, a4.q qVar) {
        Surface surface = this.N0;
        g gVar = new g(illegalStateException, qVar);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return gVar;
    }

    public final void c0(int i10, int i11) {
        m3.f fVar = this.z0;
        fVar.h += i10;
        int i12 = i10 + i11;
        fVar.g += i12;
        this.X0 += i12;
        int i13 = this.Y0 + i12;
        this.Y0 = i13;
        fVar.i = Math.max(i13, fVar.i);
        int i14 = this.I0;
        if (i14 <= 0 || this.X0 < i14) {
            return;
        }
        V();
    }

    public final void d0(long j10) {
        m3.f fVar = this.z0;
        fVar.k += j10;
        fVar.l++;
        this.c1 += j10;
        this.d1++;
    }

    @Override // j3.e, j3.h2
    public final String getName() {
        return "MediaCodecVideoRenderer";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v12, types: [android.view.Surface] */
    @Override // j3.e, j3.d2
    public final void handleMessage(int i10, Object obj) {
        Handler handler;
        Handler handler2;
        int intValue;
        s sVar = this.F0;
        if (i10 != 1) {
            if (i10 == 7) {
                this.m1 = (n) obj;
                return;
            }
            if (i10 == 10) {
                int intValue2 = ((Integer) obj).intValue();
                if (this.k1 != intValue2) {
                    this.k1 = intValue2;
                    if (this.j1) {
                        E();
                        return;
                    }
                    return;
                }
                return;
            }
            if (i10 != 4) {
                if (i10 == 5 && sVar.j != (intValue = ((Integer) obj).intValue())) {
                    sVar.j = intValue;
                    sVar.c(true);
                    return;
                }
                return;
            }
            int intValue3 = ((Integer) obj).intValue();
            this.Q0 = intValue3;
            a4.n nVar = this.I;
            if (nVar != null) {
                nVar.g(intValue3);
                return;
            }
            return;
        }
        l lVar = obj instanceof Surface ? (Surface) obj : null;
        if (lVar == null) {
            l lVar2 = this.O0;
            if (lVar2 != null) {
                lVar = lVar2;
            } else {
                a4.q qVar = this.P;
                if (qVar != null && a0(qVar)) {
                    lVar = l.c(this.E0, qVar.f);
                    this.O0 = lVar;
                }
            }
        }
        Surface surface = this.N0;
        ze.b bVar = this.G0;
        if (surface == lVar) {
            if (lVar == null || lVar == this.O0) {
                return;
            }
            y yVar = this.i1;
            if (yVar != null && (handler = (Handler) bVar.a) != null) {
                handler.post(new ef.c(12, bVar, yVar));
            }
            if (this.P0) {
                Surface surface2 = this.N0;
                Handler handler3 = (Handler) bVar.a;
                if (handler3 != null) {
                    handler3.post(new v(bVar, surface2, SystemClock.elapsedRealtime(), 0));
                    return;
                }
                return;
            }
            return;
        }
        this.N0 = lVar;
        sVar.getClass();
        l lVar3 = lVar instanceof l ? null : lVar;
        if (sVar.e != lVar3) {
            sVar.a();
            sVar.e = lVar3;
            sVar.c(true);
        }
        this.P0 = false;
        int state = getState();
        a4.n nVar2 = this.I;
        if (nVar2 != null) {
            if (d0.a < 23 || lVar == null || this.L0) {
                E();
                r();
            } else {
                try {
                    nVar2.h(lVar);
                } catch (Throwable th2) {
                    th2.printStackTrace();
                    throw new m(th2);
                }
            }
        }
        if (lVar == null || lVar == this.O0) {
            this.i1 = null;
            Q();
            return;
        }
        y yVar2 = this.i1;
        if (yVar2 != null && (handler2 = (Handler) bVar.a) != null) {
            handler2.post(new ef.c(12, bVar, yVar2));
        }
        Q();
        if (state == 2) {
            long j10 = this.H0;
            this.V0 = j10 > 0 ? SystemClock.elapsedRealtime() + j10 : -9223372036854775807L;
        }
    }

    @Override // a4.t, j3.e
    public final boolean isReady() {
        l lVar;
        if (super.isReady() && (this.R0 || (((lVar = this.O0) != null && this.N0 == lVar) || this.I == null || this.j1))) {
            this.V0 = -9223372036854775807L;
            return true;
        }
        if (this.V0 == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.V0) {
            return true;
        }
        this.V0 = -9223372036854775807L;
        return false;
    }

    @Override // a4.t
    public final boolean k() {
        return this.j1 && d0.a < 23;
    }

    @Override // a4.t
    public final float l(float f9, t0[] t0VarArr) {
        float f10 = -1.0f;
        for (t0 t0Var : t0VarArr) {
            float f11 = t0Var.I;
            if (f11 != -1.0f) {
                f10 = Math.max(f10, f11);
            }
        }
        if (f10 == -1.0f) {
            return -1.0f;
        }
        return f10 * f9;
    }

    @Override // a4.t
    public final ArrayList m(a4.u uVar, t0 t0Var, boolean z10) {
        z T = T(this.E0, uVar, t0Var, z10, this.j1);
        Pattern pattern = b0.a;
        ArrayList arrayList = new ArrayList(T);
        Collections.sort(arrayList, new a4.v(new a1.c(t0Var, 1), 0));
        return arrayList;
    }

    @Override // a4.t
    public final a4.l o(a4.q qVar, t0 t0Var, MediaCrypto mediaCrypto, float f9) {
        int i10;
        b bVar;
        c8.a aVar;
        Point point;
        Point point2;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int i11;
        boolean z10;
        Pair d;
        int S;
        l lVar = this.O0;
        if (lVar != null && lVar.a != qVar.f) {
            if (this.N0 == lVar) {
                this.N0 = null;
            }
            lVar.release();
            this.O0 = null;
        }
        String str = qVar.c;
        t0[] streamFormats = getStreamFormats();
        int i12 = t0Var.G;
        float f10 = t0Var.I;
        int i13 = t0Var.H;
        b bVar2 = t0Var.N;
        int U = U(qVar, t0Var);
        if (streamFormats.length == 1) {
            if (U != -1 && (S = S(qVar, t0Var)) != -1) {
                U = Math.min((int) (U * 1.5f), S);
            }
            aVar = new c8.a(i12, i13, U);
            i10 = i13;
            bVar = bVar2;
        } else {
            int length = streamFormats.length;
            int i14 = i12;
            int i15 = i13;
            int i16 = 0;
            boolean z11 = false;
            while (i16 < length) {
                t0 t0Var2 = streamFormats[i16];
                int i17 = i16;
                if (bVar2 != null && t0Var2.N == null) {
                    s0 a2 = t0Var2.a();
                    a2.A = bVar2;
                    t0Var2 = new t0(a2);
                }
                m3.l b10 = qVar.b(t0Var, t0Var2);
                t0[] t0VarArr = streamFormats;
                int i18 = t0Var2.H;
                if (b10.d != 0) {
                    int i19 = t0Var2.G;
                    i11 = length;
                    z11 |= i19 == -1 || i18 == -1;
                    i14 = Math.max(i14, i19);
                    i15 = Math.max(i15, i18);
                    U = Math.max(U, U(qVar, t0Var2));
                } else {
                    i11 = length;
                }
                i16 = i17 + 1;
                streamFormats = t0VarArr;
                length = i11;
            }
            if (z11) {
                f5.a.K("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + i14 + "x" + i15);
                boolean z12 = i13 > i12;
                int i20 = z12 ? i13 : i12;
                boolean z13 = z12;
                int i21 = z12 ? i12 : i13;
                float f11 = i21 / i20;
                bVar = bVar2;
                int i22 = 0;
                while (i22 < 9) {
                    int i23 = n1[i22];
                    int i24 = i22;
                    int i25 = (int) (i23 * f11);
                    if (i23 <= i20 || i25 <= i21) {
                        break;
                    }
                    int i26 = i21;
                    int i27 = i20;
                    if (d0.a >= 21) {
                        int i28 = z13 ? i25 : i23;
                        if (!z13) {
                            i23 = i25;
                        }
                        MediaCodecInfo.CodecCapabilities codecCapabilities = qVar.d;
                        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                            point2 = null;
                        } else {
                            int widthAlignment = videoCapabilities.getWidthAlignment();
                            int heightAlignment = videoCapabilities.getHeightAlignment();
                            point2 = new Point(d0.f(i28, widthAlignment) * widthAlignment, d0.f(i23, heightAlignment) * heightAlignment);
                        }
                        i10 = i13;
                        if (qVar.f(point2.x, point2.y, f10)) {
                            point = point2;
                            break;
                        }
                        i22 = i24 + 1;
                        i13 = i10;
                        i21 = i26;
                        i20 = i27;
                    } else {
                        i10 = i13;
                        try {
                            int f12 = d0.f(i23, 16) * 16;
                            int f13 = d0.f(i25, 16) * 16;
                            if (f12 * f13 <= b0.j()) {
                                int i29 = z13 ? f13 : f12;
                                if (!z13) {
                                    f12 = f13;
                                }
                                point2 = new Point(i29, f12);
                                point = point2;
                                break;
                            }
                            i22 = i24 + 1;
                            i13 = i10;
                            i21 = i26;
                            i20 = i27;
                        } catch (a4.y unused) {
                        }
                    }
                }
                i10 = i13;
                point = null;
                if (point != null) {
                    i14 = Math.max(i14, point.x);
                    i15 = Math.max(i15, point.y);
                    s0 a10 = t0Var.a();
                    a10.t = i14;
                    a10.u = i15;
                    U = Math.max(U, S(qVar, new t0(a10)));
                    f5.a.K("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + i14 + "x" + i15);
                }
            } else {
                i10 = i13;
                bVar = bVar2;
            }
            aVar = new c8.a(i14, i15, U);
        }
        this.K0 = aVar;
        int i30 = this.j1 ? this.k1 : 0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i12);
        mediaFormat.setInteger("height", i10);
        f5.a.I(mediaFormat, t0Var.D);
        if (f10 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f10);
        }
        f5.a.A(mediaFormat, "rotation-degrees", t0Var.J);
        if (bVar != null) {
            b bVar3 = bVar;
            f5.a.A(mediaFormat, "color-transfer", bVar3.c);
            f5.a.A(mediaFormat, "color-standard", bVar3.a);
            f5.a.A(mediaFormat, "color-range", bVar3.b);
            byte[] bArr = bVar3.d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(t0Var.B) && (d = b0.d(t0Var)) != null) {
            f5.a.A(mediaFormat, "profile", ((Integer) d.first).intValue());
        }
        mediaFormat.setInteger("max-width", aVar.a);
        mediaFormat.setInteger("max-height", aVar.b);
        f5.a.A(mediaFormat, "max-input-size", aVar.c);
        if (d0.a >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f9 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f9);
            }
        }
        if (this.J0) {
            z10 = true;
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z10 = true;
        }
        if (i30 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z10);
            mediaFormat.setInteger("audio-session-id", i30);
        }
        if (this.N0 == null) {
            if (!a0(qVar)) {
                throw new IllegalStateException();
            }
            if (this.O0 == null) {
                this.O0 = l.c(this.E0, qVar.f);
            }
            this.N0 = this.O0;
        }
        return new a4.l(qVar, mediaFormat, t0Var, this.N0, mediaCrypto);
    }

    @Override // a4.t, j3.e
    public final void onDisabled() {
        ze.b bVar = this.G0;
        this.i1 = null;
        Q();
        this.P0 = false;
        this.l1 = null;
        try {
            super.onDisabled();
            m3.f fVar = this.z0;
            bVar.getClass();
            synchronized (fVar) {
            }
            Handler handler = (Handler) bVar.a;
            if (handler != null) {
                handler.post(new w(bVar, fVar, 0));
            }
        } catch (Throwable th2) {
            bVar.n(this.z0);
            throw th2;
        }
    }

    @Override // j3.e
    public final void onEnabled(boolean z10, boolean z11) {
        this.z0 = new m3.f();
        boolean z12 = getConfiguration().a;
        f5.a.i((z12 && this.k1 == 0) ? false : true);
        if (this.j1 != z12) {
            this.j1 = z12;
            E();
        }
        m3.f fVar = this.z0;
        ze.b bVar = this.G0;
        Handler handler = (Handler) bVar.a;
        if (handler != null) {
            handler.post(new w(bVar, fVar, 1));
        }
        this.S0 = z11;
        this.T0 = false;
    }

    @Override // a4.t, j3.e
    public final void onPositionReset(long j10, boolean z10) {
        super.onPositionReset(j10, z10);
        Q();
        s sVar = this.F0;
        sVar.m = 0L;
        sVar.p = -1L;
        sVar.n = -1L;
        this.a1 = -9223372036854775807L;
        this.U0 = -9223372036854775807L;
        this.Y0 = 0;
        if (!z10) {
            this.V0 = -9223372036854775807L;
        } else {
            long j11 = this.H0;
            this.V0 = j11 > 0 ? SystemClock.elapsedRealtime() + j11 : -9223372036854775807L;
        }
    }

    @Override // a4.t
    public final void onQueueInputBuffer(m3.i iVar) {
        boolean z10 = this.j1;
        if (!z10) {
            this.Z0++;
        }
        if (d0.a >= 23 || !z10) {
            return;
        }
        long j10 = iVar.d;
        P(j10);
        X();
        this.z0.e++;
        W();
        z(j10);
    }

    @Override // a4.t, j3.e
    public final void onReset() {
        try {
            super.onReset();
            l lVar = this.O0;
            if (lVar != null) {
                if (this.N0 == lVar) {
                    this.N0 = null;
                }
                lVar.release();
                this.O0 = null;
            }
        } catch (Throwable th2) {
            if (this.O0 != null) {
                Surface surface = this.N0;
                l lVar2 = this.O0;
                if (surface == lVar2) {
                    this.N0 = null;
                }
                lVar2.release();
                this.O0 = null;
            }
            throw th2;
        }
    }

    @Override // j3.e
    public final void onStarted() {
        this.X0 = 0;
        this.W0 = SystemClock.elapsedRealtime();
        this.b1 = SystemClock.elapsedRealtime() * 1000;
        this.c1 = 0L;
        this.d1 = 0;
        s sVar = this.F0;
        sVar.d = true;
        sVar.m = 0L;
        sVar.p = -1L;
        sVar.n = -1L;
        p pVar = sVar.b;
        if (pVar != null) {
            r rVar = sVar.c;
            rVar.getClass();
            rVar.b.sendEmptyMessage(1);
            pVar.c(new eg.n(sVar, 4));
        }
        sVar.c(false);
    }

    @Override // j3.e
    public final void onStopped() {
        this.V0 = -9223372036854775807L;
        V();
        int i10 = this.d1;
        if (i10 != 0) {
            long j10 = this.c1;
            ze.b bVar = this.G0;
            Handler handler = (Handler) bVar.a;
            if (handler != null) {
                handler.post(new u(bVar, j10, i10));
            }
            this.c1 = 0L;
            this.d1 = 0;
        }
        s sVar = this.F0;
        sVar.d = false;
        p pVar = sVar.b;
        if (pVar != null) {
            pVar.x();
            r rVar = sVar.c;
            rVar.getClass();
            rVar.b.sendEmptyMessage(2);
        }
        sVar.a();
    }

    @Override // a4.t
    public final void p(m3.i iVar) {
        if (this.M0) {
            ByteBuffer byteBuffer = iVar.e;
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
                        a4.n nVar = this.I;
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        nVar.setParameters(bundle);
                    }
                }
            }
        }
    }

    @Override // a4.t, j3.e
    public final void setPlaybackSpeed(float f9, float f10) {
        super.setPlaybackSpeed(f9, f10);
        s sVar = this.F0;
        sVar.i = f9;
        sVar.m = 0L;
        sVar.p = -1L;
        sVar.n = -1L;
        sVar.c(false);
    }

    @Override // a4.t
    public final void t(Exception exc) {
        f5.a.p("MediaCodecVideoRenderer", "Video codec error", exc);
        ze.b bVar = this.G0;
        Handler handler = (Handler) bVar.a;
        if (handler != null) {
            handler.post(new ef.c(14, bVar, exc));
        }
    }

    @Override // a4.t
    public final void u(long j10, long j11, String str) {
        String str2;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        ze.b bVar = this.G0;
        Handler handler = (Handler) bVar.a;
        if (handler != null) {
            str2 = str;
            handler.post(new x(bVar, str2, j10, j11, 0));
        } else {
            str2 = str;
        }
        this.L0 = R(str2);
        a4.q qVar = this.P;
        qVar.getClass();
        boolean z10 = false;
        if (d0.a >= 29 && "video/x-vnd.on2.vp9".equals(qVar.b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = qVar.d;
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
        this.M0 = z10;
        if (d0.a < 23 || !this.j1) {
            return;
        }
        a4.n nVar = this.I;
        nVar.getClass();
        this.l1 = new i(this, nVar);
    }

    @Override // a4.t
    public final void v(String str) {
        ze.b bVar = this.G0;
        Handler handler = (Handler) bVar.a;
        if (handler != null) {
            handler.post(new ef.c(13, bVar, str));
        }
    }

    @Override // a4.t
    public final m3.l w(u0 u0Var) {
        m3.l w10 = super.w(u0Var);
        t0 t0Var = u0Var.b;
        ze.b bVar = this.G0;
        Handler handler = (Handler) bVar.a;
        if (handler != null) {
            handler.post(new androidx.car.app.utils.b(bVar, t0Var, w10, 9));
        }
        return w10;
    }

    @Override // a4.t
    public final void x(t0 t0Var, MediaFormat mediaFormat) {
        a4.n nVar = this.I;
        if (nVar != null) {
            nVar.g(this.Q0);
        }
        if (this.j1) {
            this.e1 = t0Var.G;
            this.f1 = t0Var.H;
        } else {
            mediaFormat.getClass();
            boolean z10 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            this.e1 = z10 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
            this.f1 = z10 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        }
        float f9 = t0Var.K;
        int i10 = t0Var.J;
        this.h1 = f9;
        if (d0.a < 21) {
            this.g1 = i10;
        } else if (i10 == 90 || i10 == 270) {
            int i11 = this.e1;
            this.e1 = this.f1;
            this.f1 = i11;
            this.h1 = 1.0f / f9;
        }
        float f10 = t0Var.I;
        s sVar = this.F0;
        sVar.f = f10;
        e eVar = sVar.a;
        eVar.a.c();
        eVar.b.c();
        eVar.c = false;
        eVar.d = -9223372036854775807L;
        eVar.e = 0;
        sVar.b();
    }

    @Override // a4.t
    public final void z(long j10) {
        super.z(j10);
        if (this.j1) {
            return;
        }
        this.Z0--;
    }
}
