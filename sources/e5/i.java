package e5;

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
import d5.g0;
import h3.h0;
import h3.s0;
import h3.t0;
import h3.u0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLObject;
import p8.l0;
import p8.z;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class i extends y3.q {
    public static final int[] n1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    public static boolean o1;
    public static boolean p1;
    public final Context E0;
    public final r F0;
    public final xe.b G0;
    public final long H0;
    public final int I0;
    public final boolean J0;
    public b8.b K0;
    public boolean L0;
    public boolean M0;
    public Surface N0;
    public k O0;
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
    public x i1;
    public boolean j1;
    public int k1;
    public h l1;
    public m m1;

    public i(Context context, y3.j jVar, Handler handler, h0 h0Var) {
        super(2, jVar, 30.0f);
        this.H0 = 5000L;
        this.I0 = 50;
        Context applicationContext = context.getApplicationContext();
        this.E0 = applicationContext;
        this.F0 = new r(applicationContext);
        this.G0 = new xe.b(handler, h0Var, false, 20);
        this.J0 = "NVIDIA".equals(g0.c);
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
        char c10;
        char c11;
        boolean z10 = false;
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (i.class) {
            try {
                if (!o1) {
                    int i10 = g0.a;
                    char c12 = 28;
                    if (i10 <= 28) {
                        String str2 = g0.b;
                        str2.getClass();
                        switch (str2.hashCode()) {
                            case -1339091551:
                                if (str2.equals("dangal")) {
                                    c11 = 0;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -1220081023:
                                if (str2.equals("dangalFHD")) {
                                    c11 = 1;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -1220066608:
                                if (str2.equals("dangalUHD")) {
                                    c11 = 2;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -1012436106:
                                if (str2.equals("oneday")) {
                                    c11 = 3;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -760312546:
                                if (str2.equals("aquaman")) {
                                    c11 = 4;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -64886864:
                                if (str2.equals("magnolia")) {
                                    c11 = 5;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 3415681:
                                if (str2.equals("once")) {
                                    c11 = 6;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 825323514:
                                if (str2.equals("machuca")) {
                                    c11 = 7;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            default:
                                c11 = 65535;
                                break;
                        }
                        switch (c11) {
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
                    if (i10 > 27 || !"HWEML".equals(g0.b)) {
                        String str3 = g0.d;
                        str3.getClass();
                        switch (str3.hashCode()) {
                            case -349662828:
                                if (str3.equals("AFTJMST12")) {
                                    c10 = 0;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -321033677:
                                if (str3.equals("AFTKMST12")) {
                                    c10 = 1;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 2006354:
                                if (str3.equals("AFTA")) {
                                    c10 = 2;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 2006367:
                                if (str3.equals("AFTN")) {
                                    c10 = 3;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 2006371:
                                if (str3.equals("AFTR")) {
                                    c10 = 4;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1785421873:
                                if (str3.equals("AFTEU011")) {
                                    c10 = 5;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1785421876:
                                if (str3.equals("AFTEU014")) {
                                    c10 = 6;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1798172390:
                                if (str3.equals("AFTSO001")) {
                                    c10 = 7;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 2119412532:
                                if (str3.equals("AFTEUFF014")) {
                                    c10 = '\b';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            default:
                                c10 = 65535;
                                break;
                        }
                        switch (c10) {
                            default:
                                if (i10 <= 26) {
                                    String str4 = g0.b;
                                    str4.getClass();
                                    switch (str4.hashCode()) {
                                        case -2144781245:
                                            if (str4.equals("GIONEE_SWW1609")) {
                                                c12 = 0;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -2144781185:
                                            if (str4.equals("GIONEE_SWW1627")) {
                                                c12 = 1;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -2144781160:
                                            if (str4.equals("GIONEE_SWW1631")) {
                                                c12 = 2;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -2097309513:
                                            if (str4.equals("K50a40")) {
                                                c12 = 3;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -2022874474:
                                            if (str4.equals("CP8676_I02")) {
                                                c12 = 4;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -1978993182:
                                            if (str4.equals("NX541J")) {
                                                c12 = 5;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -1978990237:
                                            if (str4.equals("NX573J")) {
                                                c12 = 6;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -1936688988:
                                            if (str4.equals("PGN528")) {
                                                c12 = 7;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -1936688066:
                                            if (str4.equals("PGN610")) {
                                                c12 = '\b';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -1936688065:
                                            if (str4.equals("PGN611")) {
                                                c12 = '\t';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -1931988508:
                                            if (str4.equals("AquaPowerM")) {
                                                c12 = '\n';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -1885099851:
                                            if (str4.equals("RAIJIN")) {
                                                c12 = 11;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -1696512866:
                                            if (str4.equals("XT1663")) {
                                                c12 = '\f';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -1680025915:
                                            if (str4.equals("ComioS1")) {
                                                c12 = '\r';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -1615810839:
                                            if (str4.equals("Phantom6")) {
                                                c12 = 14;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -1600724499:
                                            if (str4.equals("pacificrim")) {
                                                c12 = 15;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -1554255044:
                                            if (str4.equals("vernee_M5")) {
                                                c12 = 16;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -1481772737:
                                            if (str4.equals("panell_dl")) {
                                                c12 = 17;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -1481772730:
                                            if (str4.equals("panell_ds")) {
                                                c12 = 18;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -1481772729:
                                            if (str4.equals("panell_dt")) {
                                                c12 = 19;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -1320080169:
                                            if (str4.equals("GiONEE_GBL7319")) {
                                                c12 = 20;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -1217592143:
                                            if (str4.equals("BRAVIA_ATV2")) {
                                                c12 = 21;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -1180384755:
                                            if (str4.equals("iris60")) {
                                                c12 = 22;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -1139198265:
                                            if (str4.equals("Slate_Pro")) {
                                                c12 = 23;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -1052835013:
                                            if (str4.equals("namath")) {
                                                c12 = 24;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -993250464:
                                            if (str4.equals("A10-70F")) {
                                                c12 = 25;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -993250458:
                                            if (str4.equals("A10-70L")) {
                                                c12 = 26;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -965403638:
                                            if (str4.equals("s905x018")) {
                                                c12 = 27;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -958336948:
                                            break;
                                        case -879245230:
                                            if (str4.equals("tcl_eu")) {
                                                c12 = 29;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -842500323:
                                            if (str4.equals("nicklaus_f")) {
                                                c12 = 30;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -821392978:
                                            if (str4.equals("A7000-a")) {
                                                c12 = 31;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -797483286:
                                            if (str4.equals("SVP-DTV15")) {
                                                c12 = ' ';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -794946968:
                                            if (str4.equals("watson")) {
                                                c12 = '!';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -788334647:
                                            if (str4.equals("whyred")) {
                                                c12 = '\"';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -782144577:
                                            if (str4.equals("OnePlus5T")) {
                                                c12 = '#';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -575125681:
                                            if (str4.equals("GiONEE_CBL7513")) {
                                                c12 = '$';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -521118391:
                                            if (str4.equals("GIONEE_GBL7360")) {
                                                c12 = '%';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -430914369:
                                            if (str4.equals("Pixi4-7_3G")) {
                                                c12 = '&';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -290434366:
                                            if (str4.equals("taido_row")) {
                                                c12 = '\'';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -282781963:
                                            if (str4.equals("BLACK-1X")) {
                                                c12 = '(';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -277133239:
                                            if (str4.equals("Z12_PRO")) {
                                                c12 = ')';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -173639913:
                                            if (str4.equals("ELUGA_A3_Pro")) {
                                                c12 = '*';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -56598463:
                                            if (str4.equals("woods_fn")) {
                                                c12 = '+';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 2126:
                                            if (str4.equals("C1")) {
                                                c12 = ',';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 2564:
                                            if (str4.equals("Q5")) {
                                                c12 = '-';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 2715:
                                            if (str4.equals("V1")) {
                                                c12 = '.';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 2719:
                                            if (str4.equals("V5")) {
                                                c12 = '/';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 3091:
                                            if (str4.equals("b5")) {
                                                c12 = '0';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 3483:
                                            if (str4.equals("mh")) {
                                                c12 = '1';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 73405:
                                            if (str4.equals("JGZ")) {
                                                c12 = '2';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 75537:
                                            if (str4.equals("M04")) {
                                                c12 = '3';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 75739:
                                            if (str4.equals("M5c")) {
                                                c12 = '4';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 76779:
                                            if (str4.equals("MX6")) {
                                                c12 = '5';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 78669:
                                            if (str4.equals("P85")) {
                                                c12 = '6';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 79305:
                                            if (str4.equals("PLE")) {
                                                c12 = '7';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 80618:
                                            if (str4.equals("QX1")) {
                                                c12 = '8';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 88274:
                                            if (str4.equals("Z80")) {
                                                c12 = '9';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 98846:
                                            if (str4.equals("cv1")) {
                                                c12 = ':';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 98848:
                                            if (str4.equals("cv3")) {
                                                c12 = ';';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 99329:
                                            if (str4.equals("deb")) {
                                                c12 = '<';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 101481:
                                            if (str4.equals("flo")) {
                                                c12 = '=';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 1513190:
                                            if (str4.equals("1601")) {
                                                c12 = '>';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 1514184:
                                            if (str4.equals("1713")) {
                                                c12 = '?';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 1514185:
                                            if (str4.equals("1714")) {
                                                c12 = '@';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 2133089:
                                            if (str4.equals("F01H")) {
                                                c12 = 'A';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 2133091:
                                            if (str4.equals("F01J")) {
                                                c12 = 'B';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 2133120:
                                            if (str4.equals("F02H")) {
                                                c12 = 'C';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 2133151:
                                            if (str4.equals("F03H")) {
                                                c12 = 'D';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 2133182:
                                            if (str4.equals("F04H")) {
                                                c12 = 'E';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 2133184:
                                            if (str4.equals("F04J")) {
                                                c12 = 'F';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 2436959:
                                            if (str4.equals("P681")) {
                                                c12 = 'G';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 2463773:
                                            if (str4.equals("Q350")) {
                                                c12 = 'H';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 2464648:
                                            if (str4.equals("Q427")) {
                                                c12 = 'I';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 2689555:
                                            if (str4.equals("XE2X")) {
                                                c12 = 'J';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 3154429:
                                            if (str4.equals("fugu")) {
                                                c12 = 'K';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 3284551:
                                            if (str4.equals("kate")) {
                                                c12 = 'L';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 3351335:
                                            if (str4.equals("mido")) {
                                                c12 = 'M';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 3386211:
                                            if (str4.equals("p212")) {
                                                c12 = 'N';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 41325051:
                                            if (str4.equals("MEIZU_M5")) {
                                                c12 = 'O';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 51349633:
                                            if (str4.equals("601LV")) {
                                                c12 = 'P';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 51350594:
                                            if (str4.equals("602LV")) {
                                                c12 = 'Q';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 55178625:
                                            if (str4.equals("Aura_Note_2")) {
                                                c12 = 'R';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 61542055:
                                            if (str4.equals("A1601")) {
                                                c12 = 'S';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 65355429:
                                            if (str4.equals("E5643")) {
                                                c12 = 'T';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 66214468:
                                            if (str4.equals("F3111")) {
                                                c12 = 'U';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 66214470:
                                            if (str4.equals("F3113")) {
                                                c12 = 'V';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 66214473:
                                            if (str4.equals("F3116")) {
                                                c12 = 'W';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 66215429:
                                            if (str4.equals("F3211")) {
                                                c12 = 'X';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 66215431:
                                            if (str4.equals("F3213")) {
                                                c12 = 'Y';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 66215433:
                                            if (str4.equals("F3215")) {
                                                c12 = 'Z';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 66216390:
                                            if (str4.equals("F3311")) {
                                                c12 = '[';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 76402249:
                                            if (str4.equals("PRO7S")) {
                                                c12 = '\\';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 76404105:
                                            if (str4.equals("Q4260")) {
                                                c12 = ']';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 76404911:
                                            if (str4.equals("Q4310")) {
                                                c12 = '^';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 80963634:
                                            if (str4.equals("V23GB")) {
                                                c12 = '_';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 82882791:
                                            if (str4.equals("X3_HK")) {
                                                c12 = '`';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 98715550:
                                            if (str4.equals("i9031")) {
                                                c12 = 'a';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 101370885:
                                            if (str4.equals("l5460")) {
                                                c12 = 'b';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 102844228:
                                            if (str4.equals("le_x6")) {
                                                c12 = 'c';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 165221241:
                                            if (str4.equals("A2016a40")) {
                                                c12 = 'd';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 182191441:
                                            if (str4.equals("CPY83_I00")) {
                                                c12 = 'e';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 245388979:
                                            if (str4.equals("marino_f")) {
                                                c12 = 'f';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 287431619:
                                            if (str4.equals("griffin")) {
                                                c12 = 'g';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 307593612:
                                            if (str4.equals("A7010a48")) {
                                                c12 = 'h';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 308517133:
                                            if (str4.equals("A7020a48")) {
                                                c12 = 'i';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 316215098:
                                            if (str4.equals("TB3-730F")) {
                                                c12 = 'j';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 316215116:
                                            if (str4.equals("TB3-730X")) {
                                                c12 = 'k';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 316246811:
                                            if (str4.equals("TB3-850F")) {
                                                c12 = 'l';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 316246818:
                                            if (str4.equals("TB3-850M")) {
                                                c12 = 'm';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 407160593:
                                            if (str4.equals("Pixi5-10_4G")) {
                                                c12 = 'n';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 507412548:
                                            if (str4.equals("QM16XE_U")) {
                                                c12 = 'o';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 793982701:
                                            if (str4.equals("GIONEE_WBL5708")) {
                                                c12 = 'p';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 794038622:
                                            if (str4.equals("GIONEE_WBL7365")) {
                                                c12 = 'q';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 794040393:
                                            if (str4.equals("GIONEE_WBL7519")) {
                                                c12 = 'r';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 835649806:
                                            if (str4.equals("manning")) {
                                                c12 = 's';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 917340916:
                                            if (str4.equals("A7000plus")) {
                                                c12 = 't';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 958008161:
                                            if (str4.equals("j2xlteins")) {
                                                c12 = 'u';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 1060579533:
                                            if (str4.equals("panell_d")) {
                                                c12 = 'v';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 1150207623:
                                            if (str4.equals("LS-5017")) {
                                                c12 = 'w';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 1176899427:
                                            if (str4.equals("itel_S41")) {
                                                c12 = 'x';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 1280332038:
                                            if (str4.equals("hwALE-H")) {
                                                c12 = 'y';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 1306947716:
                                            if (str4.equals("EverStar_S")) {
                                                c12 = 'z';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 1349174697:
                                            if (str4.equals("htc_e56ml_dtul")) {
                                                c12 = '{';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 1522194893:
                                            if (str4.equals("woods_f")) {
                                                c12 = '|';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 1691543273:
                                            if (str4.equals("CPH1609")) {
                                                c12 = '}';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 1691544261:
                                            if (str4.equals("CPH1715")) {
                                                c12 = '~';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 1709443163:
                                            if (str4.equals("iball8735_9806")) {
                                                c12 = 127;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 1865889110:
                                            if (str4.equals("santoni")) {
                                                c12 = 128;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 1906253259:
                                            if (str4.equals("PB2-670M")) {
                                                c12 = 129;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 1977196784:
                                            if (str4.equals("Infinix-X572")) {
                                                c12 = 130;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 2006372676:
                                            if (str4.equals("BRAVIA_ATV3_4K")) {
                                                c12 = 131;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 2019281702:
                                            if (str4.equals("DM-01K")) {
                                                c12 = 132;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 2029784656:
                                            if (str4.equals("HWBLN-H")) {
                                                c12 = 133;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 2030379515:
                                            if (str4.equals("HWCAM-H")) {
                                                c12 = 134;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 2033393791:
                                            if (str4.equals("ASUS_X00AD_2")) {
                                                c12 = 135;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 2047190025:
                                            if (str4.equals("ELUGA_Note")) {
                                                c12 = 136;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 2047252157:
                                            if (str4.equals("ELUGA_Prim")) {
                                                c12 = 137;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 2048319463:
                                            if (str4.equals("HWVNS-H")) {
                                                c12 = 138;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 2048855701:
                                            if (str4.equals("HWWAS-H")) {
                                                c12 = 139;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        default:
                                            c12 = 65535;
                                            break;
                                    }
                                    switch (c12) {
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
            } catch (Throwable th) {
                throw th;
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
    public static int S(y3.n nVar, t0 t0Var) {
        int intValue;
        int i10 = t0Var.G;
        int i11 = t0Var.H;
        if (i10 != -1 && i11 != -1) {
            String str = t0Var.B;
            char c10 = 1;
            if ("video/dolby-vision".equals(str)) {
                Pair d = y3.w.d(t0Var);
                str = (d == null || !((intValue = ((Integer) d.first).intValue()) == 512 || intValue == 1 || intValue == 2)) ? "video/hevc" : MediaController.VIDEO_MIME_TYPE;
            }
            str.getClass();
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
                    String str2 = g0.d;
                    if (!"BRAVIA 4K 2015".equals(str2) && (!"Amazon".equals(g0.c) || (!"KFSOWI".equals(str2) && (!"AFTS".equals(str2) || !nVar.f)))) {
                        return ((g0.f(i11, 16) * g0.f(i10, 16)) * 768) / 4;
                    }
                    break;
                case 6:
                    return ((i10 * i11) * 3) / 8;
            }
        }
        return -1;
    }

    public static z T(Context context, y3.r rVar, t0 t0Var, boolean z10, boolean z11) {
        String str = t0Var.B;
        if (str == null) {
            p8.x xVar = z.b;
            return l0.e;
        }
        rVar.getClass();
        List e9 = y3.w.e(str, z10, z11);
        String b10 = y3.w.b(t0Var);
        if (b10 == null) {
            return z.u(e9);
        }
        List e10 = y3.w.e(b10, z10, z11);
        if (g0.a >= 26 && "video/dolby-vision".equals(t0Var.B) && !e10.isEmpty() && !g.a(context)) {
            return z.u(e10);
        }
        p8.x xVar2 = z.b;
        p8.w wVar = new p8.w();
        wVar.b(e9);
        wVar.b(e10);
        return wVar.c();
    }

    public static int U(y3.n nVar, t0 t0Var) {
        int i10 = t0Var.C;
        List list = t0Var.D;
        if (i10 == -1) {
            return S(nVar, t0Var);
        }
        int size = list.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += ((byte[]) list.get(i12)).length;
        }
        return t0Var.C + i11;
    }

    @Override // y3.q
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
    @Override // y3.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean C(long j10, long j11, y3.k kVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, t0 t0Var) {
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
        kVar.getClass();
        if (this.U0 == -9223372036854775807L) {
            this.U0 = j10;
        }
        if (j12 != this.a1) {
            r rVar = this.F0;
            j15 = -1;
            long j20 = rVar.n;
            if (j20 != -1) {
                rVar.p = j20;
                rVar.q = rVar.o;
            }
            rVar.m++;
            d dVar = rVar.a;
            long j21 = j12 * 1000;
            j13 = 1000;
            dVar.a.b(j21);
            if (dVar.a.a()) {
                dVar.c = false;
                j14 = 0;
            } else {
                j14 = 0;
                if (dVar.d != -9223372036854775807L) {
                    if (dVar.c) {
                        c cVar = dVar.b;
                        long j22 = cVar.d;
                    }
                    dVar.b.c();
                    dVar.b.b(dVar.d);
                    dVar.c = true;
                    dVar.b.b(j21);
                }
            }
            if (dVar.c && dVar.b.a()) {
                c cVar2 = dVar.a;
                dVar.a = dVar.b;
                dVar.b = cVar2;
                dVar.c = false;
            }
            dVar.d = j21;
            dVar.e = dVar.a.a() ? 0 : dVar.e + 1;
            rVar.b();
            this.a1 = j12;
        } else {
            j13 = 1000;
            j14 = 0;
            j15 = -1;
        }
        long j23 = this.B0;
        long j24 = j12 - j23;
        if (z10 && !z11) {
            b0(kVar, i10);
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
            b0(kVar, i10);
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
                m mVar = this.m1;
                if (mVar != null) {
                    mVar.a(j24, nanoTime, t0Var, this.K);
                }
                if (g0.a >= 21) {
                    Z(kVar, i10, nanoTime);
                } else {
                    Y(kVar, i10);
                }
                d0(j25);
                return true;
            }
            if (!z16 || j10 == this.U0) {
                return false;
            }
            long nanoTime2 = System.nanoTime();
            long j27 = (j25 * j13) + nanoTime2;
            r rVar2 = this.F0;
            if (rVar2.p == j15 || !rVar2.a.a.a()) {
                j17 = nanoTime2;
            } else {
                d dVar2 = rVar2.a;
                if (dVar2.a.a()) {
                    c cVar3 = dVar2.a;
                    long j28 = cVar3.e;
                    j19 = j28 == j14 ? j14 : cVar3.f / j28;
                } else {
                    j19 = -9223372036854775807L;
                }
                j17 = nanoTime2;
                long j29 = rVar2.q + ((long) (((rVar2.m - rVar2.p) * j19) / rVar2.i));
                if (Math.abs(j27 - j29) <= 20000000) {
                    j27 = j29;
                } else {
                    rVar2.m = j14;
                    long j30 = j15;
                    rVar2.p = j30;
                    rVar2.n = j30;
                }
            }
            rVar2.n = rVar2.m;
            rVar2.o = j27;
            q qVar = rVar2.c;
            if (qVar != null && rVar2.k != -9223372036854775807L) {
                long j31 = qVar.a;
                if (j31 != -9223372036854775807L) {
                    long j32 = rVar2.k;
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
                    j27 = j33 - rVar2.l;
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
                        k3.f fVar = this.z0;
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
                    b0(kVar, i10);
                    z14 = true;
                } else {
                    d5.a.c("dropVideoBuffer");
                    kVar.releaseOutputBuffer(i10, false);
                    d5.a.q();
                    z14 = true;
                    c0(0, 1);
                }
                d0(j35);
                return z14;
            }
            if (g0.a >= 21) {
                if (j35 >= 50000) {
                    return false;
                }
                m mVar2 = this.m1;
                if (mVar2 != null) {
                    mVar2.a(j24, j34, t0Var, this.K);
                }
                Z(kVar, i10, j34);
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
            m mVar3 = this.m1;
            if (mVar3 != null) {
                mVar3.a(j24, j34, t0Var, this.K);
            }
            Y(kVar, i10);
            d0(j35);
            return true;
        }
        z13 = false;
        if (!z13) {
        }
    }

    @Override // y3.q
    public final void G() {
        super.G();
        this.Z0 = 0;
    }

    @Override // y3.q
    public final boolean K(y3.n nVar) {
        return this.N0 != null || a0(nVar);
    }

    @Override // y3.q
    public final int M(y3.r rVar, t0 t0Var) {
        boolean z10;
        int i10 = 0;
        if (!d5.q.j(t0Var.B)) {
            return com.google.android.recaptcha.internal.a.b(0, 0, 0);
        }
        boolean z11 = t0Var.E != null;
        Context context = this.E0;
        z T = T(context, rVar, t0Var, z11, false);
        if (z11 && T.isEmpty()) {
            T = T(context, rVar, t0Var, false, false);
        }
        if (T.isEmpty()) {
            return com.google.android.recaptcha.internal.a.b(1, 0, 0);
        }
        int i11 = t0Var.W;
        if (i11 != 0 && i11 != 2) {
            return com.google.android.recaptcha.internal.a.b(2, 0, 0);
        }
        y3.n nVar = (y3.n) T.get(0);
        boolean d = nVar.d(t0Var);
        if (!d) {
            for (int i12 = 1; i12 < T.size(); i12++) {
                y3.n nVar2 = (y3.n) T.get(i12);
                if (nVar2.d(t0Var)) {
                    nVar = nVar2;
                    z10 = false;
                    d = true;
                    break;
                }
            }
        }
        z10 = true;
        int i13 = d ? 4 : 3;
        int i14 = nVar.e(t0Var) ? 16 : 8;
        int i15 = nVar.g ? 64 : 0;
        int i16 = z10 ? 128 : 0;
        if (g0.a >= 26 && "video/dolby-vision".equals(t0Var.B) && !g.a(context)) {
            i16 = 256;
        }
        if (d) {
            z T2 = T(context, rVar, t0Var, z11, true);
            if (!T2.isEmpty()) {
                Pattern pattern = y3.w.a;
                ArrayList arrayList = new ArrayList(T2);
                Collections.sort(arrayList, new ag.h(new t0.c(t0Var, 5), 6));
                y3.n nVar3 = (y3.n) arrayList.get(0);
                if (nVar3.d(t0Var) && nVar3.e(t0Var)) {
                    i10 = 32;
                }
            }
        }
        return i13 | i14 | i10 | i15 | i16;
    }

    public final void Q() {
        y3.k kVar;
        this.R0 = false;
        if (g0.a < 23 || !this.j1 || (kVar = this.I) == null) {
            return;
        }
        this.l1 = new h(this, kVar);
    }

    public final void V() {
        if (this.X0 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = elapsedRealtime - this.W0;
            int i10 = this.X0;
            xe.b bVar = this.G0;
            Handler handler = (Handler) bVar.b;
            if (handler != null) {
                handler.post(new t(bVar, i10, j10));
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
        xe.b bVar = this.G0;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new u(bVar, surface, SystemClock.elapsedRealtime(), 0));
        }
        this.P0 = true;
    }

    public final void X() {
        int i10 = this.e1;
        if (i10 == -1 && this.f1 == -1) {
            return;
        }
        x xVar = this.i1;
        if (xVar != null && xVar.a == i10 && xVar.b == this.f1 && xVar.c == this.g1 && xVar.d == this.h1) {
            return;
        }
        x xVar2 = new x(this.e1, this.f1, this.h1, this.g1);
        this.i1 = xVar2;
        xe.b bVar = this.G0;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new d5.u(5, bVar, xVar2));
        }
    }

    public final void Y(y3.k kVar, int i10) {
        X();
        d5.a.c("releaseOutputBuffer");
        kVar.releaseOutputBuffer(i10, true);
        d5.a.q();
        this.b1 = SystemClock.elapsedRealtime() * 1000;
        this.z0.e++;
        this.Y0 = 0;
        W();
    }

    public final void Z(y3.k kVar, int i10, long j10) {
        X();
        d5.a.c("releaseOutputBuffer");
        kVar.b(i10, j10);
        d5.a.q();
        this.b1 = SystemClock.elapsedRealtime() * 1000;
        this.z0.e++;
        this.Y0 = 0;
        W();
    }

    public final boolean a0(y3.n nVar) {
        if (g0.a < 23 || this.j1 || R(nVar.a)) {
            return false;
        }
        return !nVar.f || k.b(this.E0);
    }

    @Override // y3.q
    public final k3.l b(y3.n nVar, t0 t0Var, t0 t0Var2) {
        k3.l b10 = nVar.b(t0Var, t0Var2);
        int i10 = b10.e;
        int i11 = t0Var2.G;
        b8.b bVar = this.K0;
        if (i11 > bVar.a || t0Var2.H > bVar.b) {
            i10 |= 256;
        }
        if (U(nVar, t0Var2) > this.K0.c) {
            i10 |= 64;
        }
        int i12 = i10;
        return new k3.l(nVar.a, t0Var, t0Var2, i12 != 0 ? 0 : b10.d, i12);
    }

    public final void b0(y3.k kVar, int i10) {
        d5.a.c("skipVideoBuffer");
        kVar.releaseOutputBuffer(i10, false);
        d5.a.q();
        this.z0.f++;
    }

    @Override // y3.q
    public final y3.l c(IllegalStateException illegalStateException, y3.n nVar) {
        Surface surface = this.N0;
        f fVar = new f(illegalStateException, nVar);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return fVar;
    }

    public final void c0(int i10, int i11) {
        k3.f fVar = this.z0;
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
        k3.f fVar = this.z0;
        fVar.k += j10;
        fVar.l++;
        this.c1 += j10;
        this.d1++;
    }

    @Override // h3.e, h3.h2
    public final String getName() {
        return "MediaCodecVideoRenderer";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v12, types: [android.view.Surface] */
    @Override // h3.e, h3.d2
    public final void handleMessage(int i10, Object obj) {
        Handler handler;
        Handler handler2;
        int intValue;
        r rVar = this.F0;
        if (i10 != 1) {
            if (i10 == 7) {
                this.m1 = (m) obj;
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
                if (i10 == 5 && rVar.j != (intValue = ((Integer) obj).intValue())) {
                    rVar.j = intValue;
                    rVar.c(true);
                    return;
                }
                return;
            }
            int intValue3 = ((Integer) obj).intValue();
            this.Q0 = intValue3;
            y3.k kVar = this.I;
            if (kVar != null) {
                kVar.f(intValue3);
                return;
            }
            return;
        }
        k kVar2 = obj instanceof Surface ? (Surface) obj : null;
        if (kVar2 == null) {
            k kVar3 = this.O0;
            if (kVar3 != null) {
                kVar2 = kVar3;
            } else {
                y3.n nVar = this.P;
                if (nVar != null && a0(nVar)) {
                    kVar2 = k.c(this.E0, nVar.f);
                    this.O0 = kVar2;
                }
            }
        }
        Surface surface = this.N0;
        xe.b bVar = this.G0;
        if (surface == kVar2) {
            if (kVar2 == null || kVar2 == this.O0) {
                return;
            }
            x xVar = this.i1;
            if (xVar != null && (handler = (Handler) bVar.b) != null) {
                handler.post(new d5.u(5, bVar, xVar));
            }
            if (this.P0) {
                Surface surface2 = this.N0;
                Handler handler3 = (Handler) bVar.b;
                if (handler3 != null) {
                    handler3.post(new u(bVar, surface2, SystemClock.elapsedRealtime(), 0));
                    return;
                }
                return;
            }
            return;
        }
        this.N0 = kVar2;
        rVar.getClass();
        k kVar4 = kVar2 instanceof k ? null : kVar2;
        if (rVar.e != kVar4) {
            rVar.a();
            rVar.e = kVar4;
            rVar.c(true);
        }
        this.P0 = false;
        int state = getState();
        y3.k kVar5 = this.I;
        if (kVar5 != null) {
            if (g0.a < 23 || kVar2 == null || this.L0) {
                E();
                r();
            } else {
                try {
                    kVar5.g(kVar2);
                } catch (Throwable th) {
                    th.printStackTrace();
                    throw new l(th);
                }
            }
        }
        if (kVar2 == null || kVar2 == this.O0) {
            this.i1 = null;
            Q();
            return;
        }
        x xVar2 = this.i1;
        if (xVar2 != null && (handler2 = (Handler) bVar.b) != null) {
            handler2.post(new d5.u(5, bVar, xVar2));
        }
        Q();
        if (state == 2) {
            long j10 = this.H0;
            this.V0 = j10 > 0 ? SystemClock.elapsedRealtime() + j10 : -9223372036854775807L;
        }
    }

    @Override // y3.q, h3.e
    public final boolean isReady() {
        k kVar;
        if (super.isReady() && (this.R0 || (((kVar = this.O0) != null && this.N0 == kVar) || this.I == null || this.j1))) {
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

    @Override // y3.q
    public final boolean k() {
        return this.j1 && g0.a < 23;
    }

    @Override // y3.q
    public final float l(float f10, t0[] t0VarArr) {
        float f11 = -1.0f;
        for (t0 t0Var : t0VarArr) {
            float f12 = t0Var.I;
            if (f12 != -1.0f) {
                f11 = Math.max(f11, f12);
            }
        }
        if (f11 == -1.0f) {
            return -1.0f;
        }
        return f11 * f10;
    }

    @Override // y3.q
    public final ArrayList m(y3.r rVar, t0 t0Var, boolean z10) {
        z T = T(this.E0, rVar, t0Var, z10, this.j1);
        Pattern pattern = y3.w.a;
        ArrayList arrayList = new ArrayList(T);
        Collections.sort(arrayList, new ag.h(new t0.c(t0Var, 5), 6));
        return arrayList;
    }

    @Override // y3.q
    public final y3.i o(y3.n nVar, t0 t0Var, MediaCrypto mediaCrypto, float f10) {
        int i10;
        b bVar;
        b8.b bVar2;
        Point point;
        Point point2;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int i11;
        boolean z10;
        Pair d;
        int S;
        k kVar = this.O0;
        if (kVar != null && kVar.a != nVar.f) {
            if (this.N0 == kVar) {
                this.N0 = null;
            }
            kVar.release();
            this.O0 = null;
        }
        String str = nVar.c;
        t0[] streamFormats = getStreamFormats();
        int i12 = t0Var.G;
        float f11 = t0Var.I;
        int i13 = t0Var.H;
        b bVar3 = t0Var.N;
        int U = U(nVar, t0Var);
        if (streamFormats.length == 1) {
            if (U != -1 && (S = S(nVar, t0Var)) != -1) {
                U = Math.min((int) (U * 1.5f), S);
            }
            bVar2 = new b8.b(i12, i13, U);
            i10 = i13;
            bVar = bVar3;
        } else {
            int length = streamFormats.length;
            int i14 = i12;
            int i15 = i13;
            int i16 = 0;
            boolean z11 = false;
            while (i16 < length) {
                t0 t0Var2 = streamFormats[i16];
                int i17 = i16;
                if (bVar3 != null && t0Var2.N == null) {
                    s0 a2 = t0Var2.a();
                    a2.A = bVar3;
                    t0Var2 = new t0(a2);
                }
                k3.l b10 = nVar.b(t0Var, t0Var2);
                t0[] t0VarArr = streamFormats;
                int i18 = t0Var2.H;
                if (b10.d != 0) {
                    int i19 = t0Var2.G;
                    i11 = length;
                    z11 |= i19 == -1 || i18 == -1;
                    i14 = Math.max(i14, i19);
                    i15 = Math.max(i15, i18);
                    U = Math.max(U, U(nVar, t0Var2));
                } else {
                    i11 = length;
                }
                i16 = i17 + 1;
                streamFormats = t0VarArr;
                length = i11;
            }
            if (z11) {
                d5.a.K("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + i14 + "x" + i15);
                boolean z12 = i13 > i12;
                int i20 = z12 ? i13 : i12;
                boolean z13 = z12;
                int i21 = z12 ? i12 : i13;
                float f12 = i21 / i20;
                bVar = bVar3;
                int i22 = 0;
                while (i22 < 9) {
                    int i23 = n1[i22];
                    int i24 = i22;
                    int i25 = (int) (i23 * f12);
                    if (i23 <= i20 || i25 <= i21) {
                        break;
                    }
                    int i26 = i21;
                    int i27 = i20;
                    if (g0.a >= 21) {
                        int i28 = z13 ? i25 : i23;
                        if (!z13) {
                            i23 = i25;
                        }
                        MediaCodecInfo.CodecCapabilities codecCapabilities = nVar.d;
                        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                            point2 = null;
                        } else {
                            int widthAlignment = videoCapabilities.getWidthAlignment();
                            int heightAlignment = videoCapabilities.getHeightAlignment();
                            point2 = new Point(g0.f(i28, widthAlignment) * widthAlignment, g0.f(i23, heightAlignment) * heightAlignment);
                        }
                        i10 = i13;
                        if (nVar.f(point2.x, point2.y, f11)) {
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
                            int f13 = g0.f(i23, 16) * 16;
                            int f14 = g0.f(i25, 16) * 16;
                            if (f13 * f14 <= y3.w.j()) {
                                int i29 = z13 ? f14 : f13;
                                if (!z13) {
                                    f13 = f14;
                                }
                                point2 = new Point(i29, f13);
                                point = point2;
                                break;
                            }
                            i22 = i24 + 1;
                            i13 = i10;
                            i21 = i26;
                            i20 = i27;
                        } catch (y3.t unused) {
                        }
                    }
                }
                i10 = i13;
                point = null;
                if (point != null) {
                    i14 = Math.max(i14, point.x);
                    i15 = Math.max(i15, point.y);
                    s0 a3 = t0Var.a();
                    a3.t = i14;
                    a3.u = i15;
                    U = Math.max(U, S(nVar, new t0(a3)));
                    d5.a.K("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + i14 + "x" + i15);
                }
            } else {
                i10 = i13;
                bVar = bVar3;
            }
            bVar2 = new b8.b(i14, i15, U);
        }
        this.K0 = bVar2;
        int i30 = this.j1 ? this.k1 : 0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i12);
        mediaFormat.setInteger("height", i10);
        d5.a.I(mediaFormat, t0Var.D);
        if (f11 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f11);
        }
        d5.a.A(mediaFormat, "rotation-degrees", t0Var.J);
        if (bVar != null) {
            b bVar4 = bVar;
            d5.a.A(mediaFormat, "color-transfer", bVar4.c);
            d5.a.A(mediaFormat, "color-standard", bVar4.a);
            d5.a.A(mediaFormat, "color-range", bVar4.b);
            byte[] bArr = bVar4.d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(t0Var.B) && (d = y3.w.d(t0Var)) != null) {
            d5.a.A(mediaFormat, "profile", ((Integer) d.first).intValue());
        }
        mediaFormat.setInteger("max-width", bVar2.a);
        mediaFormat.setInteger("max-height", bVar2.b);
        d5.a.A(mediaFormat, "max-input-size", bVar2.c);
        if (g0.a >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f10 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f10);
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
            if (!a0(nVar)) {
                throw new IllegalStateException();
            }
            if (this.O0 == null) {
                this.O0 = k.c(this.E0, nVar.f);
            }
            this.N0 = this.O0;
        }
        return new y3.i(nVar, mediaFormat, t0Var, this.N0, mediaCrypto);
    }

    @Override // y3.q, h3.e
    public final void onDisabled() {
        xe.b bVar = this.G0;
        this.i1 = null;
        Q();
        this.P0 = false;
        this.l1 = null;
        try {
            super.onDisabled();
            k3.f fVar = this.z0;
            bVar.getClass();
            synchronized (fVar) {
            }
            Handler handler = (Handler) bVar.b;
            if (handler != null) {
                handler.post(new v(bVar, fVar, 0));
            }
        } catch (Throwable th) {
            bVar.m(this.z0);
            throw th;
        }
    }

    @Override // h3.e
    public final void onEnabled(boolean z10, boolean z11) {
        this.z0 = new k3.f();
        boolean z12 = getConfiguration().a;
        d5.a.i((z12 && this.k1 == 0) ? false : true);
        if (this.j1 != z12) {
            this.j1 = z12;
            E();
        }
        k3.f fVar = this.z0;
        xe.b bVar = this.G0;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new v(bVar, fVar, 1));
        }
        this.S0 = z11;
        this.T0 = false;
    }

    @Override // y3.q, h3.e
    public final void onPositionReset(long j10, boolean z10) {
        super.onPositionReset(j10, z10);
        Q();
        r rVar = this.F0;
        rVar.m = 0L;
        rVar.p = -1L;
        rVar.n = -1L;
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

    @Override // y3.q
    public final void onQueueInputBuffer(k3.i iVar) {
        boolean z10 = this.j1;
        if (!z10) {
            this.Z0++;
        }
        if (g0.a >= 23 || !z10) {
            return;
        }
        long j10 = iVar.d;
        P(j10);
        X();
        this.z0.e++;
        W();
        z(j10);
    }

    @Override // y3.q, h3.e
    public final void onReset() {
        try {
            super.onReset();
            k kVar = this.O0;
            if (kVar != null) {
                if (this.N0 == kVar) {
                    this.N0 = null;
                }
                kVar.release();
                this.O0 = null;
            }
        } catch (Throwable th) {
            if (this.O0 != null) {
                Surface surface = this.N0;
                k kVar2 = this.O0;
                if (surface == kVar2) {
                    this.N0 = null;
                }
                kVar2.release();
                this.O0 = null;
            }
            throw th;
        }
    }

    @Override // h3.e
    public final void onStarted() {
        this.X0 = 0;
        this.W0 = SystemClock.elapsedRealtime();
        this.b1 = SystemClock.elapsedRealtime() * 1000;
        this.c1 = 0L;
        this.d1 = 0;
        r rVar = this.F0;
        rVar.d = true;
        rVar.m = 0L;
        rVar.p = -1L;
        rVar.n = -1L;
        o oVar = rVar.b;
        if (oVar != null) {
            q qVar = rVar.c;
            qVar.getClass();
            qVar.b.sendEmptyMessage(1);
            oVar.m(new a1.c(rVar, 21));
        }
        rVar.c(false);
    }

    @Override // h3.e
    public final void onStopped() {
        this.V0 = -9223372036854775807L;
        V();
        int i10 = this.d1;
        if (i10 != 0) {
            long j10 = this.c1;
            xe.b bVar = this.G0;
            Handler handler = (Handler) bVar.b;
            if (handler != null) {
                handler.post(new t(bVar, j10, i10));
            }
            this.c1 = 0L;
            this.d1 = 0;
        }
        r rVar = this.F0;
        rVar.d = false;
        o oVar = rVar.b;
        if (oVar != null) {
            oVar.r();
            q qVar = rVar.c;
            qVar.getClass();
            qVar.b.sendEmptyMessage(2);
        }
        rVar.a();
    }

    @Override // y3.q
    public final void p(k3.i iVar) {
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
                        y3.k kVar = this.I;
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        kVar.setParameters(bundle);
                    }
                }
            }
        }
    }

    @Override // y3.q, h3.e
    public final void setPlaybackSpeed(float f10, float f11) {
        super.setPlaybackSpeed(f10, f11);
        r rVar = this.F0;
        rVar.i = f10;
        rVar.m = 0L;
        rVar.p = -1L;
        rVar.n = -1L;
        rVar.c(false);
    }

    @Override // y3.q
    public final void t(Exception exc) {
        d5.a.p("MediaCodecVideoRenderer", "Video codec error", exc);
        xe.b bVar = this.G0;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new d5.u(7, bVar, exc));
        }
    }

    @Override // y3.q
    public final void u(long j10, long j11, String str) {
        String str2;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        xe.b bVar = this.G0;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            str2 = str;
            handler.post(new w(bVar, str2, j10, j11, 0));
        } else {
            str2 = str;
        }
        this.L0 = R(str2);
        y3.n nVar = this.P;
        nVar.getClass();
        boolean z10 = false;
        if (g0.a >= 29 && "video/x-vnd.on2.vp9".equals(nVar.b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = nVar.d;
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
        if (g0.a < 23 || !this.j1) {
            return;
        }
        y3.k kVar = this.I;
        kVar.getClass();
        this.l1 = new h(this, kVar);
    }

    @Override // y3.q
    public final void v(String str) {
        xe.b bVar = this.G0;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new d5.u(6, bVar, str));
        }
    }

    @Override // y3.q
    public final k3.l w(u0 u0Var) {
        k3.l w10 = super.w(u0Var);
        t0 t0Var = u0Var.b;
        xe.b bVar = this.G0;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new androidx.car.app.utils.a(bVar, t0Var, w10, 9));
        }
        return w10;
    }

    @Override // y3.q
    public final void x(t0 t0Var, MediaFormat mediaFormat) {
        y3.k kVar = this.I;
        if (kVar != null) {
            kVar.f(this.Q0);
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
        float f10 = t0Var.K;
        int i10 = t0Var.J;
        this.h1 = f10;
        if (g0.a < 21) {
            this.g1 = i10;
        } else if (i10 == 90 || i10 == 270) {
            int i11 = this.e1;
            this.e1 = this.f1;
            this.f1 = i11;
            this.h1 = 1.0f / f10;
        }
        float f11 = t0Var.I;
        r rVar = this.F0;
        rVar.f = f11;
        d dVar = rVar.a;
        dVar.a.c();
        dVar.b.c();
        dVar.c = false;
        dVar.d = -9223372036854775807L;
        dVar.e = 0;
        rVar.b();
    }

    @Override // y3.q
    public final void z(long j10) {
        super.z(j10);
        if (this.j1) {
            return;
        }
        this.Z0--;
    }
}
