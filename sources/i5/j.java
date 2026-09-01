package i5;

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
import h5.d0;
import j3.c0;
import j3.g2;
import j3.m0;
import j3.n0;
import j7.c8;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.regex.Pattern;
import o4.l0;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLObject;
import s8.i0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class j extends d4.r {
    public static boolean A1;
    public static boolean B1;
    public static final int[] z1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    public final Context R0;
    public final s S0;
    public final f7.b T0;
    public final cb.m U0;
    public final long V0;
    public final int W0;
    public final boolean X0;
    public e8.a Y0;
    public boolean Z0;
    public boolean a1;
    public Surface b1;
    public l c1;
    public boolean d1;
    public int e1;
    public boolean f1;
    public boolean g1;
    public boolean h1;
    public long i1;
    public long j1;
    public long k1;
    public int l1;
    public int m1;
    public int n1;
    public long o1;
    public long p1;
    public long q1;
    public int r1;
    public long s1;
    public y t1;
    public y u1;
    public boolean v1;
    public int w1;
    public i x1;
    public n y1;

    public j(Context context, d4.j jVar, Handler handler, c0 c0Var) {
        super(2, jVar, 30.0f);
        this.V0 = 5000L;
        this.W0 = 50;
        Context applicationContext = context.getApplicationContext();
        this.R0 = applicationContext;
        this.S0 = new s(applicationContext);
        this.T0 = new f7.b(10, handler, c0Var);
        cb.m mVar = new cb.m();
        mVar.b = this;
        new ArrayDeque();
        new ArrayDeque();
        mVar.a = true;
        y yVar = y.e;
        this.U0 = mVar;
        this.X0 = "NVIDIA".equals(d0.c);
        this.j1 = -9223372036854775807L;
        this.e1 = 1;
        this.t1 = y.e;
        this.w1 = 0;
        this.u1 = null;
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
    public static boolean r0(String str) {
        char c3;
        char c10;
        boolean z4 = false;
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (j.class) {
            try {
                if (!A1) {
                    int i10 = d0.a;
                    char c11 = 28;
                    if (i10 <= 28) {
                        String str2 = d0.b;
                        str2.getClass();
                        switch (str2.hashCode()) {
                            case -1339091551:
                                if (str2.equals("dangal")) {
                                    c10 = 0;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1220081023:
                                if (str2.equals("dangalFHD")) {
                                    c10 = 1;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1220066608:
                                if (str2.equals("dangalUHD")) {
                                    c10 = 2;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1012436106:
                                if (str2.equals("oneday")) {
                                    c10 = 3;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -760312546:
                                if (str2.equals("aquaman")) {
                                    c10 = 4;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -64886864:
                                if (str2.equals("magnolia")) {
                                    c10 = 5;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 3415681:
                                if (str2.equals("once")) {
                                    c10 = 6;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 825323514:
                                if (str2.equals("machuca")) {
                                    c10 = 7;
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
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                                z4 = true;
                                break;
                        }
                        B1 = z4;
                        A1 = true;
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
                                                c11 = 0;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case -2144781185:
                                            if (str4.equals("GIONEE_SWW1627")) {
                                                c11 = 1;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case -2144781160:
                                            if (str4.equals("GIONEE_SWW1631")) {
                                                c11 = 2;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case -2097309513:
                                            if (str4.equals("K50a40")) {
                                                c11 = 3;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case -2022874474:
                                            if (str4.equals("CP8676_I02")) {
                                                c11 = 4;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case -1978993182:
                                            if (str4.equals("NX541J")) {
                                                c11 = 5;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case -1978990237:
                                            if (str4.equals("NX573J")) {
                                                c11 = 6;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case -1936688988:
                                            if (str4.equals("PGN528")) {
                                                c11 = 7;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case -1936688066:
                                            if (str4.equals("PGN610")) {
                                                c11 = '\b';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case -1936688065:
                                            if (str4.equals("PGN611")) {
                                                c11 = '\t';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case -1931988508:
                                            if (str4.equals("AquaPowerM")) {
                                                c11 = '\n';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case -1885099851:
                                            if (str4.equals("RAIJIN")) {
                                                c11 = 11;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case -1696512866:
                                            if (str4.equals("XT1663")) {
                                                c11 = '\f';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case -1680025915:
                                            if (str4.equals("ComioS1")) {
                                                c11 = '\r';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case -1615810839:
                                            if (str4.equals("Phantom6")) {
                                                c11 = 14;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case -1600724499:
                                            if (str4.equals("pacificrim")) {
                                                c11 = 15;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case -1554255044:
                                            if (str4.equals("vernee_M5")) {
                                                c11 = 16;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case -1481772737:
                                            if (str4.equals("panell_dl")) {
                                                c11 = 17;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case -1481772730:
                                            if (str4.equals("panell_ds")) {
                                                c11 = 18;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case -1481772729:
                                            if (str4.equals("panell_dt")) {
                                                c11 = 19;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case -1320080169:
                                            if (str4.equals("GiONEE_GBL7319")) {
                                                c11 = 20;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case -1217592143:
                                            if (str4.equals("BRAVIA_ATV2")) {
                                                c11 = 21;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case -1180384755:
                                            if (str4.equals("iris60")) {
                                                c11 = 22;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case -1139198265:
                                            if (str4.equals("Slate_Pro")) {
                                                c11 = 23;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case -1052835013:
                                            if (str4.equals("namath")) {
                                                c11 = 24;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case -993250464:
                                            if (str4.equals("A10-70F")) {
                                                c11 = 25;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case -993250458:
                                            if (str4.equals("A10-70L")) {
                                                c11 = 26;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case -965403638:
                                            if (str4.equals("s905x018")) {
                                                c11 = 27;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case -958336948:
                                            break;
                                        case -879245230:
                                            if (str4.equals("tcl_eu")) {
                                                c11 = 29;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case -842500323:
                                            if (str4.equals("nicklaus_f")) {
                                                c11 = 30;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case -821392978:
                                            if (str4.equals("A7000-a")) {
                                                c11 = 31;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case -797483286:
                                            if (str4.equals("SVP-DTV15")) {
                                                c11 = ' ';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case -794946968:
                                            if (str4.equals("watson")) {
                                                c11 = '!';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case -788334647:
                                            if (str4.equals("whyred")) {
                                                c11 = '\"';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case -782144577:
                                            if (str4.equals("OnePlus5T")) {
                                                c11 = '#';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case -575125681:
                                            if (str4.equals("GiONEE_CBL7513")) {
                                                c11 = '$';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case -521118391:
                                            if (str4.equals("GIONEE_GBL7360")) {
                                                c11 = '%';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case -430914369:
                                            if (str4.equals("Pixi4-7_3G")) {
                                                c11 = '&';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case -290434366:
                                            if (str4.equals("taido_row")) {
                                                c11 = '\'';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case -282781963:
                                            if (str4.equals("BLACK-1X")) {
                                                c11 = '(';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case -277133239:
                                            if (str4.equals("Z12_PRO")) {
                                                c11 = ')';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case -173639913:
                                            if (str4.equals("ELUGA_A3_Pro")) {
                                                c11 = '*';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case -56598463:
                                            if (str4.equals("woods_fn")) {
                                                c11 = '+';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 2126:
                                            if (str4.equals("C1")) {
                                                c11 = ',';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 2564:
                                            if (str4.equals("Q5")) {
                                                c11 = '-';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 2715:
                                            if (str4.equals("V1")) {
                                                c11 = '.';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 2719:
                                            if (str4.equals("V5")) {
                                                c11 = '/';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 3091:
                                            if (str4.equals("b5")) {
                                                c11 = '0';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 3483:
                                            if (str4.equals("mh")) {
                                                c11 = '1';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 73405:
                                            if (str4.equals("JGZ")) {
                                                c11 = '2';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 75537:
                                            if (str4.equals("M04")) {
                                                c11 = '3';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 75739:
                                            if (str4.equals("M5c")) {
                                                c11 = '4';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 76779:
                                            if (str4.equals("MX6")) {
                                                c11 = '5';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 78669:
                                            if (str4.equals("P85")) {
                                                c11 = '6';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 79305:
                                            if (str4.equals("PLE")) {
                                                c11 = '7';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 80618:
                                            if (str4.equals("QX1")) {
                                                c11 = '8';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 88274:
                                            if (str4.equals("Z80")) {
                                                c11 = '9';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 98846:
                                            if (str4.equals("cv1")) {
                                                c11 = ':';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 98848:
                                            if (str4.equals("cv3")) {
                                                c11 = ';';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 99329:
                                            if (str4.equals("deb")) {
                                                c11 = '<';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 101481:
                                            if (str4.equals("flo")) {
                                                c11 = '=';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 1513190:
                                            if (str4.equals("1601")) {
                                                c11 = '>';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 1514184:
                                            if (str4.equals("1713")) {
                                                c11 = '?';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 1514185:
                                            if (str4.equals("1714")) {
                                                c11 = '@';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 2133089:
                                            if (str4.equals("F01H")) {
                                                c11 = 'A';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 2133091:
                                            if (str4.equals("F01J")) {
                                                c11 = 'B';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 2133120:
                                            if (str4.equals("F02H")) {
                                                c11 = 'C';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 2133151:
                                            if (str4.equals("F03H")) {
                                                c11 = 'D';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 2133182:
                                            if (str4.equals("F04H")) {
                                                c11 = 'E';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 2133184:
                                            if (str4.equals("F04J")) {
                                                c11 = 'F';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 2436959:
                                            if (str4.equals("P681")) {
                                                c11 = 'G';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 2463773:
                                            if (str4.equals("Q350")) {
                                                c11 = 'H';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 2464648:
                                            if (str4.equals("Q427")) {
                                                c11 = 'I';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 2689555:
                                            if (str4.equals("XE2X")) {
                                                c11 = 'J';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 3154429:
                                            if (str4.equals("fugu")) {
                                                c11 = 'K';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 3284551:
                                            if (str4.equals("kate")) {
                                                c11 = 'L';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 3351335:
                                            if (str4.equals("mido")) {
                                                c11 = 'M';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 3386211:
                                            if (str4.equals("p212")) {
                                                c11 = 'N';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 41325051:
                                            if (str4.equals("MEIZU_M5")) {
                                                c11 = 'O';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 51349633:
                                            if (str4.equals("601LV")) {
                                                c11 = 'P';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 51350594:
                                            if (str4.equals("602LV")) {
                                                c11 = 'Q';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 55178625:
                                            if (str4.equals("Aura_Note_2")) {
                                                c11 = 'R';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 61542055:
                                            if (str4.equals("A1601")) {
                                                c11 = 'S';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 65355429:
                                            if (str4.equals("E5643")) {
                                                c11 = 'T';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 66214468:
                                            if (str4.equals("F3111")) {
                                                c11 = 'U';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 66214470:
                                            if (str4.equals("F3113")) {
                                                c11 = 'V';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 66214473:
                                            if (str4.equals("F3116")) {
                                                c11 = 'W';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 66215429:
                                            if (str4.equals("F3211")) {
                                                c11 = 'X';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 66215431:
                                            if (str4.equals("F3213")) {
                                                c11 = 'Y';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 66215433:
                                            if (str4.equals("F3215")) {
                                                c11 = 'Z';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 66216390:
                                            if (str4.equals("F3311")) {
                                                c11 = '[';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 76402249:
                                            if (str4.equals("PRO7S")) {
                                                c11 = '\\';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 76404105:
                                            if (str4.equals("Q4260")) {
                                                c11 = ']';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 76404911:
                                            if (str4.equals("Q4310")) {
                                                c11 = '^';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 80963634:
                                            if (str4.equals("V23GB")) {
                                                c11 = '_';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 82882791:
                                            if (str4.equals("X3_HK")) {
                                                c11 = '`';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 98715550:
                                            if (str4.equals("i9031")) {
                                                c11 = 'a';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 101370885:
                                            if (str4.equals("l5460")) {
                                                c11 = 'b';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 102844228:
                                            if (str4.equals("le_x6")) {
                                                c11 = 'c';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 165221241:
                                            if (str4.equals("A2016a40")) {
                                                c11 = 'd';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 182191441:
                                            if (str4.equals("CPY83_I00")) {
                                                c11 = 'e';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 245388979:
                                            if (str4.equals("marino_f")) {
                                                c11 = 'f';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 287431619:
                                            if (str4.equals("griffin")) {
                                                c11 = 'g';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 307593612:
                                            if (str4.equals("A7010a48")) {
                                                c11 = 'h';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 308517133:
                                            if (str4.equals("A7020a48")) {
                                                c11 = 'i';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 316215098:
                                            if (str4.equals("TB3-730F")) {
                                                c11 = 'j';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 316215116:
                                            if (str4.equals("TB3-730X")) {
                                                c11 = 'k';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 316246811:
                                            if (str4.equals("TB3-850F")) {
                                                c11 = 'l';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 316246818:
                                            if (str4.equals("TB3-850M")) {
                                                c11 = 'm';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 407160593:
                                            if (str4.equals("Pixi5-10_4G")) {
                                                c11 = 'n';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 507412548:
                                            if (str4.equals("QM16XE_U")) {
                                                c11 = 'o';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 793982701:
                                            if (str4.equals("GIONEE_WBL5708")) {
                                                c11 = 'p';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 794038622:
                                            if (str4.equals("GIONEE_WBL7365")) {
                                                c11 = 'q';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 794040393:
                                            if (str4.equals("GIONEE_WBL7519")) {
                                                c11 = 'r';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 835649806:
                                            if (str4.equals("manning")) {
                                                c11 = 's';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 917340916:
                                            if (str4.equals("A7000plus")) {
                                                c11 = 't';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 958008161:
                                            if (str4.equals("j2xlteins")) {
                                                c11 = 'u';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 1060579533:
                                            if (str4.equals("panell_d")) {
                                                c11 = 'v';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 1150207623:
                                            if (str4.equals("LS-5017")) {
                                                c11 = 'w';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 1176899427:
                                            if (str4.equals("itel_S41")) {
                                                c11 = 'x';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 1280332038:
                                            if (str4.equals("hwALE-H")) {
                                                c11 = 'y';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 1306947716:
                                            if (str4.equals("EverStar_S")) {
                                                c11 = 'z';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 1349174697:
                                            if (str4.equals("htc_e56ml_dtul")) {
                                                c11 = '{';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 1522194893:
                                            if (str4.equals("woods_f")) {
                                                c11 = '|';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 1691543273:
                                            if (str4.equals("CPH1609")) {
                                                c11 = '}';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 1691544261:
                                            if (str4.equals("CPH1715")) {
                                                c11 = '~';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 1709443163:
                                            if (str4.equals("iball8735_9806")) {
                                                c11 = 127;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 1865889110:
                                            if (str4.equals("santoni")) {
                                                c11 = 128;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 1906253259:
                                            if (str4.equals("PB2-670M")) {
                                                c11 = 129;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 1977196784:
                                            if (str4.equals("Infinix-X572")) {
                                                c11 = 130;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 2006372676:
                                            if (str4.equals("BRAVIA_ATV3_4K")) {
                                                c11 = 131;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 2019281702:
                                            if (str4.equals("DM-01K")) {
                                                c11 = 132;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 2029784656:
                                            if (str4.equals("HWBLN-H")) {
                                                c11 = 133;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 2030379515:
                                            if (str4.equals("HWCAM-H")) {
                                                c11 = 134;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 2033393791:
                                            if (str4.equals("ASUS_X00AD_2")) {
                                                c11 = 135;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 2047190025:
                                            if (str4.equals("ELUGA_Note")) {
                                                c11 = 136;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 2047252157:
                                            if (str4.equals("ELUGA_Prim")) {
                                                c11 = 137;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 2048319463:
                                            if (str4.equals("HWVNS-H")) {
                                                c11 = 138;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 2048855701:
                                            if (str4.equals("HWWAS-H")) {
                                                c11 = 139;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        default:
                                            c11 = 65535;
                                            break;
                                    }
                                    switch (c11) {
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
                        B1 = z4;
                        A1 = true;
                    }
                    z4 = true;
                    B1 = z4;
                    A1 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return B1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0082, code lost:
    
        if (r3.equals("video/av01") == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int s0(d4.n nVar, n0 n0Var) {
        int intValue;
        int i10 = n0Var.H;
        int i11 = n0Var.I;
        if (i10 != -1 && i11 != -1) {
            String str = n0Var.C;
            char c3 = 1;
            if ("video/dolby-vision".equals(str)) {
                Pair d = d4.y.d(n0Var);
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
                    if (!"BRAVIA 4K 2015".equals(str2) && (!"Amazon".equals(d0.c) || (!"KFSOWI".equals(str2) && (!"AFTS".equals(str2) || !nVar.f)))) {
                        return ((d0.f(i11, 16) * d0.f(i10, 16)) * 768) / 4;
                    }
                    break;
                case 6:
                    return ((i10 * i11) * 3) / 8;
            }
        }
        return -1;
    }

    public static List t0(Context context, d4.s sVar, n0 n0Var, boolean z4, boolean z10) {
        Iterable e6;
        List e10;
        String str = n0Var.C;
        if (str == null) {
            s8.t tVar = s8.v.b;
            return i0.e;
        }
        if (d0.a >= 26 && "video/dolby-vision".equals(str) && !h.a(context)) {
            String b10 = d4.y.b(n0Var);
            if (b10 == null) {
                s8.t tVar2 = s8.v.b;
                e10 = i0.e;
            } else {
                sVar.getClass();
                e10 = d4.y.e(b10, z4, z10);
            }
            if (!e10.isEmpty()) {
                return e10;
            }
        }
        Pattern pattern = d4.y.a;
        String str2 = n0Var.C;
        sVar.getClass();
        List e11 = d4.y.e(str2, z4, z10);
        String b11 = d4.y.b(n0Var);
        if (b11 == null) {
            s8.t tVar3 = s8.v.b;
            e6 = i0.e;
        } else {
            e6 = d4.y.e(b11, z4, z10);
        }
        s8.t tVar4 = s8.v.b;
        s8.s sVar2 = new s8.s();
        sVar2.d(e11);
        sVar2.d(e6);
        return sVar2.i();
    }

    public static int u0(d4.n nVar, n0 n0Var) {
        int i10 = n0Var.D;
        List list = n0Var.E;
        if (i10 == -1) {
            return s0(nVar, n0Var);
        }
        int size = list.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += ((byte[]) list.get(i12)).length;
        }
        return n0Var.D + i11;
    }

    @Override // d4.r
    public final n3.k A(d4.n nVar, n0 n0Var, n0 n0Var2) {
        n3.k b10 = nVar.b(n0Var, n0Var2);
        int i10 = b10.e;
        int i11 = n0Var2.H;
        e8.a aVar = this.Y0;
        if (i11 > aVar.a || n0Var2.I > aVar.b) {
            i10 |= 256;
        }
        if (u0(nVar, n0Var2) > this.Y0.c) {
            i10 |= 64;
        }
        int i12 = i10;
        return new n3.k(nVar.a, n0Var, n0Var2, i12 != 0 ? 0 : b10.d, i12);
    }

    public final boolean A0(d4.n nVar) {
        if (d0.a < 23 || this.v1 || r0(nVar.a)) {
            return false;
        }
        return !nVar.f || l.e(this.R0);
    }

    @Override // d4.r
    public final d4.l B(IllegalStateException illegalStateException, d4.n nVar) {
        Surface surface = this.b1;
        g gVar = new g(illegalStateException, nVar);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return gVar;
    }

    public final void B0(d4.k kVar, int i10) {
        h5.a.c("skipVideoBuffer");
        kVar.releaseOutputBuffer(i10, false);
        h5.a.q();
        this.M0.f++;
    }

    public final void C0(int i10, int i11) {
        n3.f fVar = this.M0;
        fVar.h += i10;
        int i12 = i10 + i11;
        fVar.g += i12;
        this.l1 += i12;
        int i13 = this.m1 + i12;
        this.m1 = i13;
        fVar.i = Math.max(i13, fVar.i);
        int i14 = this.W0;
        if (i14 <= 0 || this.l1 < i14) {
            return;
        }
        v0();
    }

    public final void D0(long j10) {
        n3.f fVar = this.M0;
        fVar.k += j10;
        fVar.l++;
        this.q1 += j10;
        this.r1++;
    }

    @Override // d4.r
    public final boolean J() {
        return this.v1 && d0.a < 23;
    }

    @Override // d4.r
    public final float K(float f10, n0[] n0VarArr) {
        float f11 = -1.0f;
        for (n0 n0Var : n0VarArr) {
            float f12 = n0Var.J;
            if (f12 != -1.0f) {
                f11 = Math.max(f11, f12);
            }
        }
        if (f11 == -1.0f) {
            return -1.0f;
        }
        return f11 * f10;
    }

    @Override // d4.r
    public final ArrayList L(d4.s sVar, n0 n0Var, boolean z4) {
        List t02 = t0(this.R0, sVar, n0Var, z4, this.v1);
        Pattern pattern = d4.y.a;
        ArrayList arrayList = new ArrayList(t02);
        Collections.sort(arrayList, new d4.t(new a1.c(n0Var, 10), 0));
        return arrayList;
    }

    @Override // d4.r
    public final d4.i M(d4.n nVar, n0 n0Var, MediaCrypto mediaCrypto, float f10) {
        int i10;
        b bVar;
        e8.a aVar;
        Point point;
        Point point2;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int i11;
        boolean z4;
        Pair d;
        int s02;
        l lVar = this.c1;
        if (lVar != null && lVar.a != nVar.f) {
            if (this.b1 == lVar) {
                this.b1 = null;
            }
            lVar.release();
            this.c1 = null;
        }
        String str = nVar.c;
        n0[] n0VarArr = this.r;
        n0VarArr.getClass();
        int i12 = n0Var.H;
        float f11 = n0Var.J;
        int i13 = n0Var.I;
        b bVar2 = n0Var.O;
        int u02 = u0(nVar, n0Var);
        if (n0VarArr.length == 1) {
            if (u02 != -1 && (s02 = s0(nVar, n0Var)) != -1) {
                u02 = Math.min((int) (u02 * 1.5f), s02);
            }
            aVar = new e8.a(i12, i13, u02);
            i10 = i13;
            bVar = bVar2;
        } else {
            int length = n0VarArr.length;
            int i14 = i12;
            int i15 = i13;
            int i16 = 0;
            boolean z10 = false;
            while (i16 < length) {
                n0 n0Var2 = n0VarArr[i16];
                int i17 = i16;
                if (bVar2 != null && n0Var2.O == null) {
                    m0 a2 = n0Var2.a();
                    a2.A = bVar2;
                    n0Var2 = new n0(a2);
                }
                n3.k b10 = nVar.b(n0Var, n0Var2);
                n0[] n0VarArr2 = n0VarArr;
                int i18 = n0Var2.I;
                if (b10.d != 0) {
                    int i19 = n0Var2.H;
                    i11 = length;
                    z10 |= i19 == -1 || i18 == -1;
                    i14 = Math.max(i14, i19);
                    i15 = Math.max(i15, i18);
                    u02 = Math.max(u02, u0(nVar, n0Var2));
                } else {
                    i11 = length;
                }
                i16 = i17 + 1;
                n0VarArr = n0VarArr2;
                length = i11;
            }
            if (z10) {
                h5.a.K("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + i14 + "x" + i15);
                boolean z11 = i13 > i12;
                int i20 = z11 ? i13 : i12;
                boolean z12 = z11;
                int i21 = z11 ? i12 : i13;
                float f12 = i21 / i20;
                bVar = bVar2;
                int i22 = 0;
                while (i22 < 9) {
                    int i23 = z1[i22];
                    int i24 = i22;
                    int i25 = (int) (i23 * f12);
                    if (i23 <= i20 || i25 <= i21) {
                        break;
                    }
                    int i26 = i21;
                    int i27 = i20;
                    if (d0.a >= 21) {
                        int i28 = z12 ? i25 : i23;
                        if (!z12) {
                            i23 = i25;
                        }
                        MediaCodecInfo.CodecCapabilities codecCapabilities = nVar.d;
                        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                            point2 = null;
                        } else {
                            int widthAlignment = videoCapabilities.getWidthAlignment();
                            int heightAlignment = videoCapabilities.getHeightAlignment();
                            point2 = new Point(d0.f(i28, widthAlignment) * widthAlignment, d0.f(i23, heightAlignment) * heightAlignment);
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
                            int f13 = d0.f(i23, 16) * 16;
                            int f14 = d0.f(i25, 16) * 16;
                            if (f13 * f14 <= d4.y.j()) {
                                int i29 = z12 ? f14 : f13;
                                if (!z12) {
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
                        } catch (d4.v unused) {
                        }
                    }
                }
                i10 = i13;
                point = null;
                if (point != null) {
                    i14 = Math.max(i14, point.x);
                    i15 = Math.max(i15, point.y);
                    m0 a10 = n0Var.a();
                    a10.t = i14;
                    a10.u = i15;
                    u02 = Math.max(u02, s0(nVar, new n0(a10)));
                    h5.a.K("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + i14 + "x" + i15);
                }
            } else {
                i10 = i13;
                bVar = bVar2;
            }
            aVar = new e8.a(i14, i15, u02);
        }
        this.Y0 = aVar;
        int i30 = this.v1 ? this.w1 : 0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i12);
        mediaFormat.setInteger("height", i10);
        h5.a.I(mediaFormat, n0Var.E);
        if (f11 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f11);
        }
        h5.a.A(mediaFormat, "rotation-degrees", n0Var.K);
        if (bVar != null) {
            b bVar3 = bVar;
            h5.a.A(mediaFormat, "color-transfer", bVar3.c);
            h5.a.A(mediaFormat, "color-standard", bVar3.a);
            h5.a.A(mediaFormat, "color-range", bVar3.b);
            byte[] bArr = bVar3.d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(n0Var.C) && (d = d4.y.d(n0Var)) != null) {
            h5.a.A(mediaFormat, "profile", ((Integer) d.first).intValue());
        }
        mediaFormat.setInteger("max-width", aVar.a);
        mediaFormat.setInteger("max-height", aVar.b);
        h5.a.A(mediaFormat, "max-input-size", aVar.c);
        if (d0.a >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f10 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f10);
            }
        }
        if (this.X0) {
            z4 = true;
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z4 = true;
        }
        if (i30 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z4);
            mediaFormat.setInteger("audio-session-id", i30);
        }
        if (this.b1 == null) {
            if (!A0(nVar)) {
                throw new IllegalStateException();
            }
            if (this.c1 == null) {
                this.c1 = l.f(this.R0, nVar.f);
            }
            this.b1 = this.c1;
        }
        this.U0.getClass();
        return new d4.i(nVar, mediaFormat, n0Var, this.b1, mediaCrypto);
    }

    @Override // d4.r
    public final void N(n3.i iVar) {
        if (this.a1) {
            ByteBuffer byteBuffer = iVar.h;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b10 = byteBuffer.get();
                short s6 = byteBuffer.getShort();
                short s9 = byteBuffer.getShort();
                byte b11 = byteBuffer.get();
                byte b12 = byteBuffer.get();
                byteBuffer.position(0);
                if (b10 == -75 && s6 == 60 && s9 == 1 && b11 == 4) {
                    if (b12 == 0 || b12 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        d4.k kVar = this.V;
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        kVar.setParameters(bundle);
                    }
                }
            }
        }
    }

    @Override // d4.r
    public final void R(Exception exc) {
        h5.a.p("MediaCodecVideoRenderer", "Video codec error", exc);
        f7.b bVar = this.T0;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new gf.c(14, bVar, exc));
        }
    }

    @Override // d4.r
    public final void S(long j10, long j11, String str) {
        String str2;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        f7.b bVar = this.T0;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            str2 = str;
            handler.post(new x(bVar, str2, j10, j11, 0));
        } else {
            str2 = str;
        }
        this.Z0 = r0(str2);
        d4.n nVar = this.c0;
        nVar.getClass();
        boolean z4 = false;
        if (d0.a >= 29 && "video/x-vnd.on2.vp9".equals(nVar.b)) {
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
                    z4 = true;
                    break;
                }
                i10++;
            }
        }
        this.a1 = z4;
        int i11 = d0.a;
        if (i11 >= 23 && this.v1) {
            d4.k kVar = this.V;
            kVar.getClass();
            this.x1 = new i(this, kVar);
        }
        Context context = ((j) this.U0.b).R0;
        if (i11 >= 29) {
            int i12 = context.getApplicationContext().getApplicationInfo().targetSdkVersion;
        }
    }

    @Override // d4.r
    public final void T(String str) {
        f7.b bVar = this.T0;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new gf.c(13, bVar, str));
        }
    }

    @Override // d4.r
    public final n3.k U(f7.b bVar) {
        n3.k U = super.U(bVar);
        n0 n0Var = (n0) bVar.c;
        f7.b bVar2 = this.T0;
        Handler handler = (Handler) bVar2.b;
        if (handler != null) {
            handler.post(new androidx.car.app.utils.b(bVar2, n0Var, U, 9));
        }
        return U;
    }

    @Override // d4.r
    public final void V(n0 n0Var, MediaFormat mediaFormat) {
        int integer;
        int i10;
        d4.k kVar = this.V;
        if (kVar != null) {
            kVar.g(this.e1);
        }
        if (this.v1) {
            i10 = n0Var.H;
            integer = n0Var.I;
        } else {
            mediaFormat.getClass();
            boolean z4 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            int integer2 = z4 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
            integer = z4 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
            i10 = integer2;
        }
        float f10 = n0Var.L;
        int i11 = n0Var.K;
        int i12 = d0.a;
        cb.m mVar = this.U0;
        if (i12 >= 21) {
            if (i11 == 90 || i11 == 270) {
                f10 = 1.0f / f10;
                int i13 = integer;
                integer = i10;
                i10 = i13;
            }
            i11 = 0;
        } else {
            mVar.getClass();
        }
        this.t1 = new y(i10, integer, f10, i11);
        float f11 = n0Var.J;
        s sVar = this.S0;
        sVar.f = f11;
        e eVar = sVar.a;
        eVar.a.c();
        eVar.b.c();
        eVar.c = false;
        eVar.d = -9223372036854775807L;
        eVar.e = 0;
        sVar.b();
        mVar.getClass();
    }

    @Override // d4.r
    public final void X(long j10) {
        super.X(j10);
        if (this.v1) {
            return;
        }
        this.n1--;
    }

    @Override // d4.r
    public final void Y() {
        q0();
    }

    @Override // d4.r
    public final void Z(n3.i iVar) {
        boolean z4 = this.v1;
        if (!z4) {
            this.n1++;
        }
        if (d0.a >= 23 || !z4) {
            return;
        }
        long j10 = iVar.f;
        p0(j10);
        x0(this.t1);
        this.M0.e++;
        w0();
        X(j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0051  */
    @Override // d4.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a0(n0 n0Var) {
        int i10;
        cb.m mVar = this.U0;
        mVar.getClass();
        long j10 = this.N0.b;
        j jVar = (j) mVar.b;
        if (!mVar.a) {
            return;
        }
        if (((CopyOnWriteArrayList) mVar.c) == null) {
            mVar.a = false;
            return;
        }
        d0.l(null);
        b bVar = n0Var.O;
        try {
            if (bVar != null) {
                int i11 = bVar.c;
                if (i11 == 7 || i11 == 6) {
                    if (i11 == 7) {
                        Pair.create(bVar, new b(bVar.a, bVar.b, 6, bVar.d));
                    } else {
                        Pair.create(bVar, bVar);
                    }
                    if (!(d0.a < 21) || (i10 = n0Var.K) == 0) {
                        c8.a();
                        c8.e.invoke(c8.d.newInstance(null), null).getClass();
                        throw new ClassCastException();
                    }
                    c8.a();
                    Object newInstance = c8.a.newInstance(null);
                    c8.b.invoke(newInstance, Float.valueOf(i10));
                    c8.c.invoke(newInstance, null).getClass();
                    throw new ClassCastException();
                }
            } else {
                b bVar2 = b.f;
            }
            if (d0.a < 21) {
            }
            c8.a();
            c8.e.invoke(c8.d.newInstance(null), null).getClass();
            throw new ClassCastException();
        } catch (Exception e6) {
            throw jVar.a(e6, n0Var, false, 7000);
        }
        b bVar3 = b.f;
        Pair.create(bVar3, bVar3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v10, types: [android.view.Surface] */
    @Override // j3.e, j3.b2
    public final void b(int i10, Object obj) {
        Surface surface;
        s sVar = this.S0;
        cb.m mVar = this.U0;
        if (i10 != 1) {
            if (i10 == 7) {
                this.y1 = (n) obj;
                return;
            }
            if (i10 == 10) {
                int intValue = ((Integer) obj).intValue();
                if (this.w1 != intValue) {
                    this.w1 = intValue;
                    if (this.v1) {
                        e0();
                        return;
                    }
                    return;
                }
                return;
            }
            if (i10 == 4) {
                int intValue2 = ((Integer) obj).intValue();
                this.e1 = intValue2;
                d4.k kVar = this.V;
                if (kVar != null) {
                    kVar.g(intValue2);
                    return;
                }
                return;
            }
            if (i10 == 5) {
                int intValue3 = ((Integer) obj).intValue();
                if (sVar.j == intValue3) {
                    return;
                }
                sVar.j = intValue3;
                sVar.c(true);
                return;
            }
            if (i10 == 13) {
                obj.getClass();
                List list = (List) obj;
                CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) mVar.c;
                if (copyOnWriteArrayList == null) {
                    mVar.c = new CopyOnWriteArrayList(list);
                    return;
                } else {
                    copyOnWriteArrayList.clear();
                    ((CopyOnWriteArrayList) mVar.c).addAll(list);
                    return;
                }
            }
            if (i10 != 14) {
                return;
            }
            obj.getClass();
            h5.x xVar = (h5.x) obj;
            if (xVar.a == 0 || xVar.b == 0 || (surface = this.b1) == null) {
                return;
            }
            Pair pair = (Pair) mVar.d;
            if (pair != null && ((Surface) pair.first).equals(surface) && ((h5.x) ((Pair) mVar.d).second).equals(xVar)) {
                return;
            }
            mVar.d = Pair.create(surface, xVar);
            return;
        }
        l lVar = obj instanceof Surface ? (Surface) obj : null;
        if (lVar == null) {
            l lVar2 = this.c1;
            if (lVar2 != null) {
                lVar = lVar2;
            } else {
                d4.n nVar = this.c0;
                if (nVar != null && A0(nVar)) {
                    lVar = l.f(this.R0, nVar.f);
                    this.c1 = lVar;
                }
            }
        }
        Surface surface2 = this.b1;
        f7.b bVar = this.T0;
        if (surface2 == lVar) {
            if (lVar == null || lVar == this.c1) {
                return;
            }
            y yVar = this.u1;
            if (yVar != null) {
                bVar.v(yVar);
            }
            if (this.d1) {
                Surface surface3 = this.b1;
                Handler handler = (Handler) bVar.b;
                if (handler != null) {
                    handler.post(new v(bVar, surface3, SystemClock.elapsedRealtime(), 0));
                    return;
                }
                return;
            }
            return;
        }
        this.b1 = lVar;
        sVar.getClass();
        l lVar3 = lVar instanceof l ? null : lVar;
        if (sVar.e != lVar3) {
            sVar.a();
            sVar.e = lVar3;
            sVar.c(true);
        }
        this.d1 = false;
        int i11 = this.h;
        d4.k kVar2 = this.V;
        if (kVar2 != null) {
            mVar.getClass();
            if (d0.a < 23 || lVar == null || this.Z0) {
                e0();
                P();
            } else {
                try {
                    kVar2.h(lVar);
                } catch (Throwable th2) {
                    th2.printStackTrace();
                    throw new m(th2);
                }
            }
        }
        if (lVar == null || lVar == this.c1) {
            this.u1 = null;
            q0();
            mVar.getClass();
            return;
        }
        y yVar2 = this.u1;
        if (yVar2 != null) {
            bVar.v(yVar2);
        }
        q0();
        if (i11 == 2) {
            long j10 = this.V0;
            this.j1 = j10 > 0 ? SystemClock.elapsedRealtime() + j10 : -9223372036854775807L;
        }
        mVar.getClass();
    }

    /* JADX WARN: Code restructure failed: missing block: B:175:0x0077, code lost:
    
        if ((r11 == 0 ? false : r10.g[(int) ((r11 - 1) % 15)]) != false) goto L24;
     */
    @Override // d4.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c0(long j10, long j11, d4.k kVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z4, boolean z10, n0 n0Var) {
        long j13;
        long j14;
        boolean z11;
        long j15;
        long j16;
        s sVar = this.S0;
        cb.m mVar = this.U0;
        kVar.getClass();
        if (this.i1 == -9223372036854775807L) {
            this.i1 = j10;
        }
        if (j12 != this.o1) {
            mVar.getClass();
            long j17 = sVar.n;
            if (j17 != -1) {
                sVar.p = j17;
                sVar.q = sVar.o;
            }
            sVar.m++;
            e eVar = sVar.a;
            j13 = 0;
            long j18 = j12 * 1000;
            eVar.a.b(j18);
            if (eVar.a.a()) {
                eVar.c = false;
            } else if (eVar.d != -9223372036854775807L) {
                if (eVar.c) {
                    d dVar = eVar.b;
                    long j19 = dVar.d;
                }
                eVar.b.c();
                eVar.b.b(eVar.d);
                eVar.c = true;
                eVar.b.b(j18);
            }
            if (eVar.c && eVar.b.a()) {
                d dVar2 = eVar.a;
                eVar.a = eVar.b;
                eVar.b = dVar2;
                eVar.c = false;
            }
            eVar.d = j18;
            eVar.e = eVar.a.a() ? 0 : eVar.e + 1;
            sVar.b();
            this.o1 = j12;
        } else {
            j13 = 0;
        }
        long j20 = j12 - this.N0.b;
        if (z4 && !z10) {
            B0(kVar, i10);
            return true;
        }
        boolean z12 = this.h == 2;
        long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
        long j21 = (long) ((j12 - j10) / this.T);
        if (z12) {
            j21 -= elapsedRealtime - j11;
        }
        if (this.b1 == this.c1) {
            if (j21 < -30000) {
                B0(kVar, i10);
                D0(j21);
                return true;
            }
        } else {
            boolean z13 = this.h == 2;
            if (this.j1 == -9223372036854775807L && j10 >= this.N0.b && ((this.h1 ? !this.f1 : !(!z13 && !this.g1)) || (z13 && j21 < -30000 && (SystemClock.elapsedRealtime() * 1000) - this.p1 > 100000))) {
                mVar.getClass();
                this.U0.getClass();
                long nanoTime = System.nanoTime();
                n nVar = this.y1;
                if (nVar != null) {
                    nVar.a(j20, nanoTime, n0Var, this.X);
                }
                if (d0.a >= 21) {
                    z0(kVar, i10, nanoTime);
                } else {
                    y0(kVar, i10);
                }
                D0(j21);
                return true;
            }
            if (z12 && j10 != this.i1) {
                long nanoTime2 = System.nanoTime();
                long j22 = (j21 * 1000) + nanoTime2;
                if (sVar.p != -1 && sVar.a.a.a()) {
                    e eVar2 = sVar.a;
                    if (eVar2.a.a()) {
                        d dVar3 = eVar2.a;
                        long j23 = dVar3.e;
                        j16 = j23 == j13 ? j13 : dVar3.f / j23;
                    } else {
                        j16 = -9223372036854775807L;
                    }
                    long j24 = sVar.q + ((long) (((sVar.m - sVar.p) * j16) / sVar.i));
                    if (Math.abs(j22 - j24) <= 20000000) {
                        j22 = j24;
                    } else {
                        sVar.m = j13;
                        sVar.p = -1L;
                        sVar.n = -1L;
                    }
                }
                sVar.n = sVar.m;
                sVar.o = j22;
                r rVar = sVar.c;
                if (rVar != null && sVar.k != -9223372036854775807L) {
                    long j25 = rVar.a;
                    if (j25 != -9223372036854775807L) {
                        long j26 = sVar.k;
                        long j27 = (((j22 - j25) / j26) * j26) + j25;
                        if (j22 <= j27) {
                            j15 = j27 - j26;
                        } else {
                            j15 = j27;
                            j27 = j26 + j27;
                        }
                        if (j27 - j22 >= j22 - j15) {
                            j27 = j15;
                        }
                        j22 = j27 - sVar.l;
                    }
                }
                long j28 = j22;
                mVar.getClass();
                long j29 = (j28 - nanoTime2) / 1000;
                boolean z14 = this.j1 != -9223372036854775807L;
                if (j29 < -500000 && !z10) {
                    l0 l0Var = this.n;
                    l0Var.getClass();
                    int l10 = l0Var.l(j10 - this.s);
                    if (l10 != 0) {
                        if (z14) {
                            n3.f fVar = this.M0;
                            fVar.d += l10;
                            fVar.f += this.n1;
                        } else {
                            this.M0.j++;
                            C0(l10, this.n1);
                        }
                        if (H()) {
                            P();
                            return false;
                        }
                    }
                }
                if (j29 < -30000 && !z10) {
                    if (z14) {
                        B0(kVar, i10);
                        z11 = true;
                    } else {
                        h5.a.c("dropVideoBuffer");
                        kVar.releaseOutputBuffer(i10, false);
                        h5.a.q();
                        z11 = true;
                        C0(0, 1);
                    }
                    D0(j29);
                    return z11;
                }
                if (d0.a >= 21) {
                    if (j29 < 50000) {
                        if (j28 == this.s1) {
                            B0(kVar, i10);
                            j14 = j28;
                        } else {
                            n nVar2 = this.y1;
                            if (nVar2 != null) {
                                nVar2.a(j20, j28, n0Var, this.X);
                            }
                            j14 = j28;
                            z0(kVar, i10, j14);
                        }
                        D0(j29);
                        this.s1 = j14;
                        return true;
                    }
                } else if (j29 < 30000) {
                    if (j29 > 11000) {
                        try {
                            Thread.sleep((j29 - 10000) / 1000);
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            return false;
                        }
                    }
                    n nVar3 = this.y1;
                    if (nVar3 != null) {
                        nVar3.a(j20, j28, n0Var, this.X);
                    }
                    y0(kVar, i10);
                    D0(j29);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // j3.e
    public final String g() {
        return "MediaCodecVideoRenderer";
    }

    @Override // d4.r
    public final void g0() {
        super.g0();
        this.n1 = 0;
    }

    @Override // j3.e
    public final boolean i() {
        boolean z4 = this.I0;
        this.U0.getClass();
        return z4;
    }

    @Override // d4.r, j3.e
    public final boolean j() {
        l lVar;
        if (super.j()) {
            this.U0.getClass();
            if (this.f1 || (((lVar = this.c1) != null && this.b1 == lVar) || this.V == null || this.v1)) {
                this.j1 = -9223372036854775807L;
                return true;
            }
        }
        if (this.j1 == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.j1) {
            return true;
        }
        this.j1 = -9223372036854775807L;
        return false;
    }

    @Override // d4.r, j3.e
    public final void k() {
        f7.b bVar = this.T0;
        this.u1 = null;
        q0();
        this.d1 = false;
        this.x1 = null;
        try {
            super.k();
            n3.f fVar = this.M0;
            bVar.getClass();
            synchronized (fVar) {
            }
            Handler handler = (Handler) bVar.b;
            if (handler != null) {
                handler.post(new w(bVar, fVar, 0));
            }
            bVar.v(y.e);
        } catch (Throwable th2) {
            bVar.o(this.M0);
            bVar.v(y.e);
            throw th2;
        }
    }

    @Override // d4.r
    public final boolean k0(d4.n nVar) {
        return this.b1 != null || A0(nVar);
    }

    @Override // j3.e
    public final void l(boolean z4, boolean z10) {
        this.M0 = new n3.f();
        g2 g2Var = this.d;
        g2Var.getClass();
        boolean z11 = g2Var.a;
        h5.a.i((z11 && this.w1 == 0) ? false : true);
        if (this.v1 != z11) {
            this.v1 = z11;
            e0();
        }
        n3.f fVar = this.M0;
        f7.b bVar = this.T0;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new w(bVar, fVar, 1));
        }
        this.g1 = z10;
        this.h1 = false;
    }

    @Override // d4.r, j3.e
    public final void m(long j10, boolean z4) {
        super.m(j10, z4);
        this.U0.getClass();
        q0();
        s sVar = this.S0;
        sVar.m = 0L;
        sVar.p = -1L;
        sVar.n = -1L;
        this.o1 = -9223372036854775807L;
        this.i1 = -9223372036854775807L;
        this.m1 = 0;
        if (!z4) {
            this.j1 = -9223372036854775807L;
        } else {
            long j11 = this.V0;
            this.j1 = j11 > 0 ? SystemClock.elapsedRealtime() + j11 : -9223372036854775807L;
        }
    }

    @Override // d4.r
    public final int m0(d4.s sVar, n0 n0Var) {
        boolean z4;
        int i10 = 0;
        if (!h5.o.j(n0Var.C)) {
            return e2.c.b(0, 0, 0);
        }
        boolean z10 = n0Var.F != null;
        Context context = this.R0;
        List t02 = t0(context, sVar, n0Var, z10, false);
        if (z10 && t02.isEmpty()) {
            t02 = t0(context, sVar, n0Var, false, false);
        }
        if (t02.isEmpty()) {
            return e2.c.b(1, 0, 0);
        }
        int i11 = n0Var.X;
        if (i11 != 0 && i11 != 2) {
            return e2.c.b(2, 0, 0);
        }
        d4.n nVar = (d4.n) t02.get(0);
        boolean d = nVar.d(n0Var);
        if (!d) {
            for (int i12 = 1; i12 < t02.size(); i12++) {
                d4.n nVar2 = (d4.n) t02.get(i12);
                if (nVar2.d(n0Var)) {
                    nVar = nVar2;
                    z4 = false;
                    d = true;
                    break;
                }
            }
        }
        z4 = true;
        int i13 = d ? 4 : 3;
        int i14 = nVar.e(n0Var) ? 16 : 8;
        int i15 = nVar.g ? 64 : 0;
        int i16 = z4 ? 128 : 0;
        if (d0.a >= 26 && "video/dolby-vision".equals(n0Var.C) && !h.a(context)) {
            i16 = 256;
        }
        if (d) {
            List t03 = t0(context, sVar, n0Var, z10, true);
            if (!t03.isEmpty()) {
                Pattern pattern = d4.y.a;
                ArrayList arrayList = new ArrayList(t03);
                Collections.sort(arrayList, new d4.t(new a1.c(n0Var, 10), i10));
                d4.n nVar3 = (d4.n) arrayList.get(0);
                if (nVar3.d(n0Var) && nVar3.e(n0Var)) {
                    i10 = 32;
                }
            }
        }
        return i13 | i14 | i10 | i15 | i16;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j3.e
    public final void o() {
        cb.m mVar = this.U0;
        try {
            try {
                C();
                e0();
            } finally {
                l.d.D(this.P, null);
                this.P = null;
            }
        } finally {
            mVar.getClass();
            l lVar = this.c1;
            if (lVar != null) {
                if (this.b1 == lVar) {
                    this.b1 = null;
                }
                lVar.release();
                this.c1 = null;
            }
        }
    }

    @Override // j3.e
    public final void p() {
        this.l1 = 0;
        this.k1 = SystemClock.elapsedRealtime();
        this.p1 = SystemClock.elapsedRealtime() * 1000;
        this.q1 = 0L;
        this.r1 = 0;
        s sVar = this.S0;
        sVar.d = true;
        sVar.m = 0L;
        sVar.p = -1L;
        sVar.n = -1L;
        p pVar = sVar.b;
        if (pVar != null) {
            r rVar = sVar.c;
            rVar.getClass();
            rVar.b.sendEmptyMessage(1);
            pVar.r(new hg.f(sVar, 3));
        }
        sVar.c(false);
    }

    @Override // j3.e
    public final void q() {
        this.j1 = -9223372036854775807L;
        v0();
        int i10 = this.r1;
        if (i10 != 0) {
            long j10 = this.q1;
            f7.b bVar = this.T0;
            Handler handler = (Handler) bVar.b;
            if (handler != null) {
                handler.post(new u(bVar, j10, i10));
            }
            this.q1 = 0L;
            this.r1 = 0;
        }
        s sVar = this.S0;
        sVar.d = false;
        p pVar = sVar.b;
        if (pVar != null) {
            pVar.s();
            r rVar = sVar.c;
            rVar.getClass();
            rVar.b.sendEmptyMessage(2);
        }
        sVar.a();
    }

    public final void q0() {
        d4.k kVar;
        this.f1 = false;
        if (d0.a < 23 || !this.v1 || (kVar = this.V) == null) {
            return;
        }
        this.x1 = new i(this, kVar);
    }

    @Override // d4.r, j3.e
    public final void t(long j10, long j11) {
        super.t(j10, j11);
        this.U0.getClass();
    }

    public final void v0() {
        if (this.l1 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = elapsedRealtime - this.k1;
            int i10 = this.l1;
            f7.b bVar = this.T0;
            Handler handler = (Handler) bVar.b;
            if (handler != null) {
                handler.post(new u(bVar, i10, j10));
            }
            this.l1 = 0;
            this.k1 = elapsedRealtime;
        }
    }

    @Override // d4.r, j3.e
    public final void w(float f10, float f11) {
        super.w(f10, f11);
        s sVar = this.S0;
        sVar.i = f10;
        sVar.m = 0L;
        sVar.p = -1L;
        sVar.n = -1L;
        sVar.c(false);
    }

    public final void w0() {
        this.h1 = true;
        if (this.f1) {
            return;
        }
        this.f1 = true;
        Surface surface = this.b1;
        f7.b bVar = this.T0;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new v(bVar, surface, SystemClock.elapsedRealtime(), 0));
        }
        this.d1 = true;
    }

    public final void x0(y yVar) {
        if (yVar.equals(y.e) || yVar.equals(this.u1)) {
            return;
        }
        this.u1 = yVar;
        this.T0.v(yVar);
    }

    public final void y0(d4.k kVar, int i10) {
        h5.a.c("releaseOutputBuffer");
        kVar.releaseOutputBuffer(i10, true);
        h5.a.q();
        this.M0.e++;
        this.m1 = 0;
        this.U0.getClass();
        this.p1 = SystemClock.elapsedRealtime() * 1000;
        x0(this.t1);
        w0();
    }

    public final void z0(d4.k kVar, int i10, long j10) {
        h5.a.c("releaseOutputBuffer");
        kVar.b(i10, j10);
        h5.a.q();
        this.M0.e++;
        this.m1 = 0;
        this.U0.getClass();
        this.p1 = SystemClock.elapsedRealtime() * 1000;
        x0(this.t1);
        w0();
    }
}
