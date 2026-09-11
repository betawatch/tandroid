package a3;

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
import b2.h1;
import b2.k1;
import b2.r0;
import b2.v1;
import b2.x1;
import bi.l7;
import e9.a1;
import i2.m1;
import i2.o1;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;
import ji.k5;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLObject;
import u2.b1;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class m extends r2.r {
    public static final int[] N1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    public static boolean O1;
    public static boolean P1;
    public int A1;
    public long B1;
    public x1 C1;
    public x1 D1;
    public int E1;
    public boolean F1;
    public int G1;
    public l H1;
    public x I1;
    public long J1;
    public long K1;
    public boolean L1;
    public int M1;
    public final Context X0;
    public final boolean Y0;
    public final pf.b Z0;
    public final int a1;
    public final boolean b1;
    public final z c1;
    public final y d1;
    public final long e1;
    public final PriorityQueue f1;
    public k g1;
    public boolean h1;
    public boolean i1;
    public m0 j1;
    public boolean k1;
    public int l1;
    public List m1;
    public Surface n1;
    public o o1;
    public e2.w p1;
    public boolean q1;
    public int r1;
    public int s1;
    public long t1;
    public int u1;
    public int v1;
    public int w1;
    public o1 x1;
    public boolean y1;
    public long z1;

    public m(j jVar) {
        super(2, jVar.c, 30.0f);
        Context applicationContext = jVar.a.getApplicationContext();
        this.X0 = applicationContext;
        this.a1 = jVar.g;
        this.j1 = null;
        this.Z0 = new pf.b(jVar.e, jVar.f);
        this.Y0 = this.j1 == null;
        this.c1 = new z(applicationContext, this, jVar.d);
        this.d1 = new y();
        this.b1 = "NVIDIA".equals(Build.MANUFACTURER);
        this.p1 = e2.w.c;
        this.r1 = 1;
        this.s1 = 0;
        this.C1 = x1.d;
        this.G1 = 0;
        this.D1 = null;
        this.E1 = -1000;
        this.J1 = -9223372036854775807L;
        this.K1 = -9223372036854775807L;
        this.f1 = new PriorityQueue();
        this.e1 = -9223372036854775807L;
        this.x1 = null;
    }

    public static List A0(Context context, r2.i iVar, b2.s sVar, boolean z10, boolean z11) {
        String str = sVar.r;
        if (str == null) {
            return a1.e;
        }
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(str) && !c2.d.d(context)) {
            String b10 = r2.w.b(sVar);
            List a2 = b10 == null ? a1.e : iVar.a(b10, z10, z11);
            if (!a2.isEmpty()) {
                return a2;
            }
        }
        return r2.w.f(iVar, sVar, z10, z11);
    }

    public static int B0(r2.o oVar, b2.s sVar) {
        int i10 = sVar.s;
        List list = sVar.u;
        if (i10 == -1) {
            return z0(oVar, sVar);
        }
        int size = list.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += ((byte[]) list.get(i12)).length;
        }
        return sVar.s + i11;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x0740, code lost:
    
        if (r0.equals("ELUGA_Ray_X") == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x08ca, code lost:
    
        if (r13.equals("JSN-L21") == false) goto L664;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008b A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean y0(String str) {
        char c10;
        char c11;
        boolean z10 = false;
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (m.class) {
            try {
                if (!O1) {
                    int i10 = Build.VERSION.SDK_INT;
                    char c12 = 28;
                    if (i10 <= 28) {
                        String str2 = Build.DEVICE;
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
                        P1 = z10;
                        O1 = true;
                    }
                    if (i10 > 27 || !"HWEML".equals(Build.DEVICE)) {
                        String str3 = Build.MODEL;
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
                                    String str4 = Build.DEVICE;
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
                        P1 = z10;
                        O1 = true;
                    }
                    z10 = true;
                    P1 = z10;
                    O1 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return P1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x008b, code lost:
    
        if (r3.equals("video/av01") == false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int z0(r2.o oVar, b2.s sVar) {
        int i10 = sVar.y;
        int i11 = sVar.z;
        if (i10 != -1 && i11 != -1) {
            String str = sVar.r;
            str.getClass();
            char c10 = 1;
            if ("video/dolby-vision".equals(str)) {
                HashMap hashMap = r2.w.a;
                Pair b10 = e2.e.b(sVar);
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
                        return ((e2.d0.f(i11, 16) * e2.d0.f(i10, 16)) * 768) / 4;
                    }
                    break;
                case 6:
                    return ((i10 * i11) * 3) / 8;
            }
        }
        return -1;
    }

    @Override // r2.r
    public final i2.i C(r2.o oVar, b2.s sVar, b2.s sVar2) {
        i2.i b10 = oVar.b(sVar, sVar2);
        int i10 = b10.e;
        k kVar = this.g1;
        kVar.getClass();
        if (sVar2.y > kVar.a || sVar2.z > kVar.b) {
            i10 |= 256;
        }
        if (B0(oVar, sVar2) > kVar.c) {
            i10 |= 64;
        }
        int i11 = i10;
        return new i2.i(oVar.a, sVar, sVar2, i11 != 0 ? 0 : b10.d, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0070 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Surface C0(r2.o oVar) {
        boolean z10;
        n nVar;
        m0 m0Var = this.j1;
        if (m0Var != null) {
            return m0Var.c();
        }
        Surface surface = this.n1;
        if (surface != null) {
            return surface;
        }
        if (Build.VERSION.SDK_INT >= 35 && oVar.h) {
            return null;
        }
        e2.d.g(K0(oVar));
        o oVar2 = this.o1;
        if (oVar2 != null && oVar2.a != oVar.f && oVar2 != null) {
            oVar2.release();
            this.o1 = null;
        }
        if (this.o1 == null) {
            Context context = this.X0;
            boolean z11 = oVar.f;
            boolean z12 = false;
            if (!z11) {
                int i10 = o.d;
            } else if (!o.b(context)) {
                z10 = false;
                e2.d.g(z10);
                nVar = new n("ExoPlayer:PlaceholderSurface");
                int i11 = !z11 ? o.d : 0;
                nVar.start();
                Handler handler = new Handler(nVar.getLooper(), nVar);
                nVar.b = handler;
                nVar.a = new e2.j(handler);
                synchronized (nVar) {
                    nVar.b.obtainMessage(1, i11, 0).sendToTarget();
                    while (nVar.e == null && nVar.d == null && nVar.c == null) {
                        try {
                            nVar.wait();
                        } catch (InterruptedException unused) {
                            z12 = true;
                        }
                    }
                }
                if (z12) {
                    Thread.currentThread().interrupt();
                }
                RuntimeException runtimeException = nVar.d;
                if (runtimeException != null) {
                    throw runtimeException;
                }
                Error error = nVar.c;
                if (error != null) {
                    throw error;
                }
                o oVar3 = nVar.e;
                oVar3.getClass();
                this.o1 = oVar3;
            }
            z10 = true;
            e2.d.g(z10);
            nVar = new n("ExoPlayer:PlaceholderSurface");
            if (!z11) {
            }
            nVar.start();
            Handler handler2 = new Handler(nVar.getLooper(), nVar);
            nVar.b = handler2;
            nVar.a = new e2.j(handler2);
            synchronized (nVar) {
            }
        }
        return this.o1;
    }

    @Override // r2.r
    public final r2.n D(IllegalStateException illegalStateException, r2.o oVar) {
        Surface surface = this.n1;
        h hVar = new h(illegalStateException, oVar);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return hVar;
    }

    public final boolean D0(r2.o oVar) {
        if (this.j1 != null) {
            return true;
        }
        Surface surface = this.n1;
        if (surface == null || !surface.isValid()) {
            return (Build.VERSION.SDK_INT >= 35 && oVar.h) || K0(oVar);
        }
        return true;
    }

    public final boolean E0(h2.g gVar) {
        if (k() || gVar.c(TLObject.FLAG_29)) {
            return true;
        }
        long j3 = this.K1;
        return j3 == -9223372036854775807L || j3 - (gVar.h - this.P0.c) <= 100000;
    }

    public final void F0() {
        if (this.u1 > 0) {
            this.h.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j3 = elapsedRealtime - this.t1;
            int i10 = this.u1;
            pf.b bVar = this.Z0;
            Handler handler = (Handler) bVar.b;
            if (handler != null) {
                handler.post(new h0(bVar, i10, j3));
            }
            this.u1 = 0;
            this.t1 = elapsedRealtime;
        }
    }

    public final void G0() {
        int i10;
        r2.l lVar;
        if (!this.F1 || (i10 = Build.VERSION.SDK_INT) < 23 || (lVar = this.b0) == null) {
            return;
        }
        this.H1 = new l(this, lVar);
        if (i10 >= 33) {
            Bundle bundle = new Bundle();
            bundle.putInt("tunnel-peek", 1);
            lVar.setParameters(bundle);
        }
    }

    public final void H0(r2.l lVar, int i10, long j3) {
        Surface surface;
        Trace.beginSection("releaseOutputBuffer");
        lVar.f(i10, j3);
        Trace.endSection();
        this.O0.e++;
        this.v1 = 0;
        if (this.j1 == null) {
            x1 x1Var = this.C1;
            boolean equals = x1Var.equals(x1.d);
            pf.b bVar = this.Z0;
            if (!equals && !x1Var.equals(this.D1)) {
                this.D1 = x1Var;
                bVar.k0(x1Var);
            }
            z zVar = this.c1;
            boolean z10 = zVar.e != 3;
            zVar.e = 3;
            zVar.l.getClass();
            zVar.g = e2.d0.Q(SystemClock.elapsedRealtime());
            if (!z10 || (surface = this.n1) == null) {
                return;
            }
            Handler handler = (Handler) bVar.b;
            if (handler != null) {
                handler.post(new g0(bVar, surface, SystemClock.elapsedRealtime(), 0));
            }
            this.q1 = true;
        }
    }

    public final void I0(Object obj) {
        Handler handler;
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        Surface surface2 = this.n1;
        pf.b bVar = this.Z0;
        if (surface2 == surface) {
            if (surface != null) {
                x1 x1Var = this.D1;
                if (x1Var != null) {
                    bVar.k0(x1Var);
                }
                Surface surface3 = this.n1;
                if (surface3 == null || !this.q1 || (handler = (Handler) bVar.b) == null) {
                    return;
                }
                handler.post(new g0(bVar, surface3, SystemClock.elapsedRealtime(), 0));
                return;
            }
            return;
        }
        this.n1 = surface;
        m0 m0Var = this.j1;
        z zVar = this.c1;
        if (m0Var == null) {
            zVar.h(surface);
        }
        this.q1 = false;
        int i10 = this.n;
        r2.l lVar = this.b0;
        if (lVar != null && this.j1 == null) {
            r2.o oVar = this.i0;
            oVar.getClass();
            boolean D0 = D0(oVar);
            int i11 = Build.VERSION.SDK_INT;
            if (i11 < 23 || !D0 || this.h1) {
                i0();
                T();
            } else {
                Surface C0 = C0(oVar);
                if (i11 >= 23 && C0 != null) {
                    try {
                        lVar.k(C0);
                    } catch (Throwable th2) {
                        th2.printStackTrace();
                        throw new w(th2);
                    }
                } else {
                    if (i11 < 35) {
                        throw new IllegalStateException();
                    }
                    lVar.e();
                }
            }
        }
        if (surface != null) {
            x1 x1Var2 = this.D1;
            if (x1Var2 != null) {
                bVar.k0(x1Var2);
            }
        } else {
            this.D1 = null;
            m0 m0Var2 = this.j1;
            if (m0Var2 != null) {
                m0Var2.k();
            }
        }
        if (i10 == 2) {
            m0 m0Var3 = this.j1;
            if (m0Var3 != null) {
                m0Var3.q(true);
            } else {
                zVar.c(true);
            }
        }
        G0();
    }

    public final boolean J0(long j3, long j10, boolean z10, boolean z11) {
        if (this.j1 != null && this.Y0) {
            j10 -= -this.J1;
        }
        if (j3 < -500000 && !z10) {
            b1 b1Var = this.r;
            b1Var.getClass();
            int m10 = b1Var.m(j10 - this.v);
            if (m10 != 0) {
                PriorityQueue priorityQueue = this.f1;
                if (z11) {
                    i2.h hVar = this.O0;
                    int i10 = hVar.d + m10;
                    hVar.d = i10;
                    hVar.f += this.w1;
                    hVar.d = priorityQueue.size() + i10;
                } else {
                    this.O0.j++;
                    M0(priorityQueue.size() + m10, this.w1);
                }
                if (I()) {
                    T();
                }
                m0 m0Var = this.j1;
                if (m0Var != null) {
                    m0Var.m(false);
                }
                return true;
            }
        }
        return false;
    }

    @Override // r2.r
    public final int K(h2.g gVar) {
        if (Build.VERSION.SDK_INT >= 34) {
            return ((this.x1 == null && !this.F1) || gVar.h >= this.w || E0(gVar)) ? 0 : 32;
        }
        return 0;
    }

    public final boolean K0(r2.o oVar) {
        if (Build.VERSION.SDK_INT < 23 || this.F1 || y0(oVar.a)) {
            return false;
        }
        return !oVar.f || o.b(this.X0);
    }

    @Override // r2.r
    public final boolean L() {
        return this.F1 && Build.VERSION.SDK_INT < 23;
    }

    public final void L0(r2.l lVar, int i10) {
        Trace.beginSection("skipVideoBuffer");
        lVar.c(i10);
        Trace.endSection();
        this.O0.f++;
    }

    @Override // r2.r
    public final float M(float f7, b2.s sVar, b2.s[] sVarArr) {
        r2.o oVar;
        float f10 = -1.0f;
        for (b2.s sVar2 : sVarArr) {
            float f11 = sVar2.C;
            if (f11 != -1.0f) {
                f10 = Math.max(f10, f11);
            }
        }
        float f12 = f10 == -1.0f ? -1.0f : f10 * f7;
        if (this.x1 == null || (oVar = this.i0) == null) {
            return f12;
        }
        int i10 = sVar.y;
        int i11 = sVar.z;
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

    public final void M0(int i10, int i11) {
        i2.h hVar = this.O0;
        hVar.h += i10;
        int i12 = i10 + i11;
        hVar.g += i12;
        this.u1 += i12;
        int i13 = this.v1 + i12;
        this.v1 = i13;
        hVar.i = Math.max(i13, hVar.i);
        int i14 = this.a1;
        if (i14 <= 0 || this.u1 < i14) {
            return;
        }
        F0();
    }

    @Override // r2.r
    public final ArrayList N(r2.i iVar, b2.s sVar, boolean z10) {
        List A0 = A0(this.X0, iVar, sVar, z10, this.F1);
        HashMap hashMap = r2.w.a;
        ArrayList arrayList = new ArrayList(A0);
        Collections.sort(arrayList, new l7(new k5(sVar, 18), 3));
        return arrayList;
    }

    public final void N0(long j3) {
        i2.h hVar = this.O0;
        hVar.k += j3;
        hVar.l++;
        this.z1 += j3;
        this.A1++;
    }

    @Override // r2.r
    public final com.google.firebase.messaging.n P(r2.o oVar, b2.s sVar, MediaCrypto mediaCrypto, float f7) {
        b2.j jVar;
        int i10;
        k kVar;
        Point point;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int i11;
        int i12;
        boolean z10;
        int z02;
        String str = oVar.c;
        b2.s[] sVarArr = this.s;
        sVarArr.getClass();
        int i13 = sVar.y;
        float f10 = sVar.C;
        b2.j jVar2 = sVar.H;
        int i14 = sVar.z;
        int B0 = B0(oVar, sVar);
        if (sVarArr.length == 1) {
            if (B0 != -1 && (z02 = z0(oVar, sVar)) != -1) {
                B0 = Math.min((int) (B0 * 1.5f), z02);
            }
            kVar = new k(i13, i14, B0);
            jVar = jVar2;
            i10 = i14;
        } else {
            int length = sVarArr.length;
            int i15 = i13;
            int i16 = i14;
            int i17 = 0;
            boolean z11 = false;
            while (i17 < length) {
                b2.s sVar2 = sVarArr[i17];
                b2.s[] sVarArr2 = sVarArr;
                if (jVar2 != null && sVar2.H == null) {
                    b2.r a2 = sVar2.a();
                    a2.G = jVar2;
                    sVar2 = new b2.s(a2);
                }
                i2.i b10 = oVar.b(sVar, sVar2);
                int i18 = length;
                int i19 = sVar2.z;
                if (b10.d != 0) {
                    int i20 = sVar2.y;
                    i12 = i17;
                    z11 |= i20 == -1 || i19 == -1;
                    i15 = Math.max(i15, i20);
                    i16 = Math.max(i16, i19);
                    B0 = Math.max(B0, B0(oVar, sVar2));
                } else {
                    i12 = i17;
                }
                i17 = i12 + 1;
                sVarArr = sVarArr2;
                length = i18;
            }
            if (z11) {
                e2.a.n("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + i15 + "x" + i16);
                boolean z12 = i14 > i13;
                int i21 = z12 ? i14 : i13;
                boolean z13 = z12;
                int i22 = z12 ? i13 : i14;
                float f11 = i22 / i21;
                int i23 = 0;
                while (true) {
                    jVar = jVar2;
                    if (i23 >= 9) {
                        break;
                    }
                    int i24 = N1[i23];
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
                        point = new Point(e2.d0.f(i26, widthAlignment) * widthAlignment, e2.d0.f(i24, heightAlignment) * heightAlignment);
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
                    jVar2 = jVar;
                    i22 = i27;
                    i21 = i11;
                }
                i10 = i14;
                point = null;
                if (point != null) {
                    i15 = Math.max(i15, point.x);
                    i16 = Math.max(i16, point.y);
                    b2.r a10 = sVar.a();
                    a10.x = i15;
                    a10.y = i16;
                    B0 = Math.max(B0, z0(oVar, new b2.s(a10)));
                    e2.a.n("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + i15 + "x" + i16);
                }
            } else {
                jVar = jVar2;
                i10 = i14;
            }
            kVar = new k(i15, i16, B0);
        }
        this.g1 = kVar;
        int i28 = this.F1 ? this.G1 : 0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i13);
        mediaFormat.setInteger("height", i10);
        e2.d.o(mediaFormat, sVar.u);
        if (f10 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f10);
        }
        e2.d.n(mediaFormat, "rotation-degrees", sVar.D);
        if (jVar != null) {
            b2.j jVar3 = jVar;
            e2.d.n(mediaFormat, "color-transfer", jVar3.c);
            e2.d.n(mediaFormat, "color-standard", jVar3.a);
            e2.d.n(mediaFormat, "color-range", jVar3.b);
            byte[] bArr = jVar3.d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(sVar.r)) {
            HashMap hashMap = r2.w.a;
            Pair b11 = e2.e.b(sVar);
            if (b11 != null) {
                e2.d.n(mediaFormat, "profile", ((Integer) b11.first).intValue());
            }
        }
        mediaFormat.setInteger("max-width", kVar.a);
        mediaFormat.setInteger("max-height", kVar.b);
        e2.d.n(mediaFormat, "max-input-size", kVar.c);
        int i29 = Build.VERSION.SDK_INT;
        if (i29 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f7 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f7);
            }
        }
        if (this.b1) {
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
        if (i29 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.E1));
        }
        Surface C0 = C0(oVar);
        if (this.j1 != null && !e2.d0.L(this.X0)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        return new com.google.firebase.messaging.n(oVar, mediaFormat, sVar, C0, mediaCrypto, null);
    }

    @Override // r2.r
    public final void Q(h2.g gVar) {
        if (this.i1) {
            ByteBuffer byteBuffer = gVar.n;
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
                        r2.l lVar = this.b0;
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
    public final boolean V(b2.s sVar) {
        m0 m0Var = this.j1;
        if (m0Var == null || m0Var.v()) {
            return true;
        }
        try {
            return this.j1.d(sVar);
        } catch (l0 e7) {
            throw c(e7, sVar, false, 7000);
        }
    }

    @Override // r2.r
    public final void W(Exception exc) {
        e2.a.f("MediaCodecVideoRenderer", "Video codec error", exc);
        pf.b bVar = this.Z0;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new a1.e(3, bVar, exc));
        }
    }

    @Override // r2.r
    public final void X(long j3, long j10, String str) {
        String str2;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        pf.b bVar = this.Z0;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            str2 = str;
            handler.post(new f0(bVar, str2, j3, j10, 0));
        } else {
            str2 = str;
        }
        this.h1 = y0(str2);
        r2.o oVar = this.i0;
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
        this.i1 = z10;
        G0();
    }

    @Override // r2.r
    public final void Y(String str) {
        pf.b bVar = this.Z0;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new a1.e(4, bVar, str));
        }
    }

    @Override // r2.r
    public final i2.i Z(n4.y yVar) {
        i2.i Z = super.Z(yVar);
        b2.s sVar = (b2.s) yVar.c;
        sVar.getClass();
        pf.b bVar = this.Z0;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new j0(bVar, sVar, Z, 0));
        }
        return Z;
    }

    @Override // r2.r
    public final void a0(b2.s sVar, MediaFormat mediaFormat) {
        int integer;
        int i10;
        r2.l lVar = this.b0;
        if (lVar != null) {
            lVar.i(this.r1);
        }
        if (this.F1) {
            i10 = sVar.y;
            integer = sVar.z;
        } else {
            mediaFormat.getClass();
            boolean z10 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            int integer2 = z10 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
            integer = z10 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
            i10 = integer2;
        }
        float f7 = sVar.E;
        int i11 = sVar.D;
        if (i11 == 90 || i11 == 270) {
            f7 = 1.0f / f7;
            int i12 = integer;
            integer = i10;
            i10 = i12;
        }
        this.C1 = new x1(f7, i10, integer);
        m0 m0Var = this.j1;
        if (m0Var == null || !this.L1) {
            this.c1.g(sVar.C);
        } else {
            b2.r a2 = sVar.a();
            a2.x = i10;
            a2.y = integer;
            a2.D = f7;
            b2.s sVar2 = new b2.s(a2);
            int i13 = this.l1;
            List list = this.m1;
            if (list == null) {
                e9.g0 g0Var = e9.i0.b;
                list = a1.e;
            }
            m0Var.l(sVar2, this.P0.b, i13, list);
            this.l1 = 2;
        }
        this.L1 = false;
    }

    @Override // r2.r
    public final void c0(long j3) {
        super.c0(j3);
        if (this.F1) {
            return;
        }
        this.w1--;
    }

    @Override // i2.f, i2.i1
    public final void d(int i10, Object obj) {
        if (i10 == 1) {
            I0(obj);
            return;
        }
        if (i10 == 7) {
            obj.getClass();
            x xVar = (x) obj;
            this.I1 = xVar;
            m0 m0Var = this.j1;
            if (m0Var != null) {
                m0Var.u(xVar);
                return;
            }
            return;
        }
        if (i10 == 10) {
            obj.getClass();
            int intValue = ((Integer) obj).intValue();
            if (this.G1 != intValue) {
                this.G1 = intValue;
                if (this.F1) {
                    i0();
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == 4) {
            obj.getClass();
            int intValue2 = ((Integer) obj).intValue();
            this.r1 = intValue2;
            r2.l lVar = this.b0;
            if (lVar != null) {
                lVar.i(intValue2);
                return;
            }
            return;
        }
        if (i10 == 5) {
            obj.getClass();
            int intValue3 = ((Integer) obj).intValue();
            this.s1 = intValue3;
            m0 m0Var2 = this.j1;
            if (m0Var2 != null) {
                m0Var2.j(intValue3);
                return;
            }
            d0 d0Var = this.c1.b;
            if (d0Var.j == intValue3) {
                return;
            }
            d0Var.j = intValue3;
            d0Var.d(true);
            return;
        }
        if (i10 == 13) {
            obj.getClass();
            List list = (List) obj;
            if (list.equals(v1.a)) {
                m0 m0Var3 = this.j1;
                if (m0Var3 == null || !m0Var3.v()) {
                    return;
                }
                this.j1.t();
                return;
            }
            this.m1 = list;
            m0 m0Var4 = this.j1;
            if (m0Var4 != null) {
                m0Var4.o(list);
                return;
            }
            return;
        }
        if (i10 == 14) {
            obj.getClass();
            e2.w wVar = (e2.w) obj;
            if (wVar.a == 0 || wVar.b == 0) {
                return;
            }
            this.p1 = wVar;
            m0 m0Var5 = this.j1;
            if (m0Var5 != null) {
                Surface surface = this.n1;
                e2.d.h(surface);
                m0Var5.s(surface, wVar);
                return;
            }
            return;
        }
        switch (i10) {
            case 16:
                obj.getClass();
                this.E1 = ((Integer) obj).intValue();
                r2.l lVar2 = this.b0;
                if (lVar2 != null && Build.VERSION.SDK_INT >= 35) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("importance", Math.max(0, -this.E1));
                    lVar2.setParameters(bundle);
                    break;
                }
                break;
            case 17:
                Surface surface2 = this.n1;
                I0(null);
                obj.getClass();
                ((m) obj).d(1, surface2);
                break;
            case 18:
                boolean z10 = this.x1 != null;
                o1 o1Var = (o1) obj;
                this.x1 = o1Var;
                if (z10 != (o1Var != null)) {
                    v0(this.c0);
                    break;
                }
                break;
            default:
                if (i10 == 11) {
                    i2.i0 i0Var = (i2.i0) obj;
                    i0Var.getClass();
                    this.W = i0Var;
                    break;
                }
                break;
        }
    }

    @Override // r2.r
    public final void d0() {
        m0 m0Var = this.j1;
        if (m0Var != null) {
            m0Var.i();
            if (this.J1 == -9223372036854775807L) {
                this.J1 = this.P0.b;
            }
            this.j1.h(-this.J1);
        } else {
            this.c1.f(2);
        }
        this.L1 = true;
        G0();
    }

    @Override // i2.f
    public final void e() {
        m0 m0Var = this.j1;
        if (m0Var == null) {
            z zVar = this.c1;
            if (zVar.e == 0) {
                zVar.e = 1;
                return;
            }
            return;
        }
        int i10 = this.l1;
        if (i10 == 0 || i10 == 1) {
            this.l1 = 0;
        } else {
            m0Var.w();
        }
    }

    @Override // r2.r
    public final void e0(h2.g gVar) {
        Surface surface;
        this.M1 = 0;
        int K = K(gVar);
        int i10 = Build.VERSION.SDK_INT;
        if ((i10 < 34 || (K & 32) == 0) && !this.F1) {
            this.w1++;
        }
        if (i10 >= 23 || !this.F1) {
            return;
        }
        long j3 = gVar.h;
        x0(j3);
        x1 x1Var = this.C1;
        boolean equals = x1Var.equals(x1.d);
        pf.b bVar = this.Z0;
        if (!equals && !x1Var.equals(this.D1)) {
            this.D1 = x1Var;
            bVar.k0(x1Var);
        }
        this.O0.e++;
        z zVar = this.c1;
        boolean z10 = zVar.e != 3;
        zVar.e = 3;
        zVar.l.getClass();
        zVar.g = e2.d0.Q(SystemClock.elapsedRealtime());
        if (z10 && (surface = this.n1) != null) {
            Handler handler = (Handler) bVar.b;
            if (handler != null) {
                handler.post(new g0(bVar, surface, SystemClock.elapsedRealtime(), 0));
            }
            this.q1 = true;
        }
        c0(j3);
    }

    @Override // r2.r
    public final boolean g0(long j3, long j10, r2.l lVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j11, boolean z10, boolean z11, b2.s sVar) {
        int i13;
        lVar.getClass();
        long j12 = j11 - this.P0.c;
        int i14 = 0;
        while (true) {
            PriorityQueue priorityQueue = this.f1;
            Long l4 = (Long) priorityQueue.peek();
            if (l4 == null || l4.longValue() >= j11) {
                break;
            }
            i14++;
            priorityQueue.poll();
        }
        M0(i14, 0);
        m0 m0Var = this.j1;
        if (m0Var != null) {
            if (!z10 || z11) {
                return m0Var.n(j11, new i(this, lVar, i10, j12));
            }
            L0(lVar, i10);
            return true;
        }
        int a2 = this.c1.a(j11, j3, j10, this.P0.b, z10, z11, this.d1);
        y yVar = this.d1;
        if (a2 == 0) {
            this.h.getClass();
            long nanoTime = System.nanoTime();
            x xVar = this.I1;
            if (xVar != null) {
                xVar.c(j12, nanoTime, sVar, this.d0);
            }
            H0(lVar, i10, nanoTime);
            N0(yVar.a);
            return true;
        }
        if (a2 == 1) {
            long j13 = yVar.b;
            long j14 = yVar.a;
            if (j13 == this.B1) {
                L0(lVar, i10);
            } else {
                x xVar2 = this.I1;
                if (xVar2 != null) {
                    i13 = i10;
                    xVar2.c(j12, j13, sVar, this.d0);
                } else {
                    i13 = i10;
                }
                H0(lVar, i13, j13);
            }
            N0(j14);
            this.B1 = j13;
            return true;
        }
        if (a2 == 2) {
            Trace.beginSection("dropVideoBuffer");
            lVar.c(i10);
            Trace.endSection();
            M0(0, 1);
            N0(yVar.a);
            return true;
        }
        if (a2 == 3) {
            L0(lVar, i10);
            N0(yVar.a);
            return true;
        }
        if (a2 == 4 || a2 == 5) {
            return false;
        }
        throw new IllegalStateException(String.valueOf(a2));
    }

    @Override // i2.f
    public final String j() {
        return "MediaCodecVideoRenderer";
    }

    @Override // r2.r
    public final void j0() {
        m0 m0Var = this.j1;
        if (m0Var != null) {
            m0Var.i();
        }
    }

    @Override // i2.f
    public final boolean l() {
        if (!this.K0) {
            return false;
        }
        m0 m0Var = this.j1;
        return m0Var == null || m0Var.b();
    }

    @Override // r2.r
    public final void l0() {
        super.l0();
        this.f1.clear();
        this.w1 = 0;
        this.M1 = 0;
        this.y1 = false;
    }

    @Override // r2.r, i2.f
    public final boolean m() {
        boolean m10 = super.m();
        m0 m0Var = this.j1;
        if (m0Var != null) {
            return m0Var.r(m10);
        }
        if (m10 && (this.b0 == null || this.F1)) {
            return true;
        }
        return this.c1.b(m10);
    }

    @Override // r2.r, i2.f
    public final void n() {
        pf.b bVar = this.Z0;
        this.D1 = null;
        this.K1 = -9223372036854775807L;
        G0();
        this.q1 = false;
        this.H1 = null;
        this.y1 = true;
        try {
            super.n();
            i2.h hVar = this.O0;
            bVar.getClass();
            synchronized (hVar) {
            }
            Handler handler = (Handler) bVar.b;
            if (handler != null) {
                handler.post(new i0(bVar, hVar, 1));
            }
            bVar.k0(x1.d);
        } catch (Throwable th2) {
            bVar.B(this.O0);
            bVar.k0(x1.d);
            throw th2;
        }
    }

    @Override // i2.f
    public final void o(boolean z10, boolean z11) {
        m0 m0Var;
        this.O0 = new i2.h();
        m1 m1Var = this.d;
        m1Var.getClass();
        boolean z12 = m1Var.b;
        e2.d.g((z12 && this.G1 == 0) ? false : true);
        if (this.F1 != z12) {
            this.F1 = z12;
            i0();
        }
        i2.h hVar = this.O0;
        pf.b bVar = this.Z0;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new i0(bVar, hVar, 0));
        }
        boolean z13 = this.k1;
        z zVar = this.c1;
        if (!z13) {
            if (this.m1 != null && this.j1 == null) {
                p pVar = new p(this.X0, zVar);
                pVar.a = true;
                e2.x xVar = this.h;
                xVar.getClass();
                pVar.f = xVar;
                e2.d.g(!pVar.b);
                if (((t) pVar.e) == null) {
                    pVar.e = new t();
                }
                v vVar = new v(pVar);
                pVar.b = true;
                vVar.n = 1;
                SparseArray sparseArray = vVar.c;
                if (e2.d0.j(sparseArray, 0)) {
                    m0Var = (m0) sparseArray.get(0);
                } else {
                    q qVar = new q(vVar, vVar.a);
                    vVar.g.add(qVar);
                    sparseArray.put(0, qVar);
                    m0Var = qVar;
                }
                this.j1 = m0Var;
            }
            this.k1 = true;
        }
        m0 m0Var2 = this.j1;
        if (m0Var2 == null) {
            e2.x xVar2 = this.h;
            xVar2.getClass();
            zVar.l = xVar2;
            zVar.f(!z11 ? 1 : 0);
            return;
        }
        m0Var2.g(new a6.i(this, 1));
        x xVar3 = this.I1;
        if (xVar3 != null) {
            this.j1.u(xVar3);
        }
        if (this.n1 != null && !this.p1.equals(e2.w.c)) {
            this.j1.s(this.n1, this.p1);
        }
        this.j1.j(this.s1);
        this.j1.a(this.Z);
        List list = this.m1;
        if (list != null) {
            this.j1.o(list);
        }
        this.l1 = !z11 ? 1 : 0;
        this.S0 = true;
    }

    @Override // r2.r, i2.f
    public final void p(long j3, boolean z10) {
        m0 m0Var = this.j1;
        if (m0Var != null && !z10) {
            m0Var.m(true);
        }
        super.p(j3, z10);
        m0 m0Var2 = this.j1;
        z zVar = this.c1;
        if (m0Var2 == null) {
            d0 d0Var = zVar.b;
            d0Var.m = 0L;
            d0Var.p = -1L;
            d0Var.n = -1L;
            zVar.h = -9223372036854775807L;
            zVar.f = -9223372036854775807L;
            zVar.e = Math.min(zVar.e, 1);
            zVar.i = -9223372036854775807L;
        }
        if (z10) {
            m0 m0Var3 = this.j1;
            if (m0Var3 != null) {
                m0Var3.q(false);
            } else {
                zVar.c(false);
            }
        }
        G0();
        this.v1 = 0;
    }

    @Override // r2.r
    public final boolean p0(h2.g gVar) {
        boolean z10 = false;
        if (!E0(gVar)) {
            boolean z11 = gVar.h < this.w;
            if (z11 && !gVar.c(TLObject.FLAG_28)) {
                if (gVar.c(67108864)) {
                    gVar.i();
                    z10 = true;
                }
                if (z10) {
                    if (z11) {
                        this.O0.d++;
                    } else {
                        this.f1.add(Long.valueOf(gVar.h));
                        this.M1++;
                    }
                }
                return z10;
            }
        }
        return false;
    }

    @Override // i2.f
    public final void q() {
        m0 m0Var = this.j1;
        if (m0Var == null || !this.Y0) {
            return;
        }
        m0Var.release();
    }

    @Override // r2.r
    public final boolean q0() {
        b2.s sVar = this.c0;
        if (this.x1 == null || this.y1 || this.F1) {
            return true;
        }
        return (sVar != null && sVar.t > 0) || this.T0 || this.I0 != -9223372036854775807L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // i2.f
    public final void r() {
        try {
            try {
                this.x0 = false;
                k0();
                i0();
            } finally {
                i2.g.D(this.V, null);
                this.V = null;
            }
        } finally {
            this.k1 = false;
            this.J1 = -9223372036854775807L;
            o oVar = this.o1;
            if (oVar != null) {
                oVar.release();
                this.o1 = null;
            }
        }
    }

    @Override // r2.r
    public final boolean r0(r2.o oVar) {
        return D0(oVar);
    }

    @Override // i2.f
    public final void s() {
        this.u1 = 0;
        this.h.getClass();
        this.t1 = SystemClock.elapsedRealtime();
        this.z1 = 0L;
        this.A1 = 0;
        m0 m0Var = this.j1;
        if (m0Var != null) {
            m0Var.f();
        } else {
            this.c1.d();
        }
    }

    @Override // r2.r
    public final boolean s0() {
        r2.o oVar = this.i0;
        if (this.j1 != null && oVar != null) {
            String str = oVar.a;
            if (str.equals("c2.mtk.avc.decoder") || str.equals("c2.mtk.hevc.decoder")) {
                return true;
            }
        }
        return super.s0();
    }

    @Override // i2.f
    public final void t() {
        F0();
        int i10 = this.A1;
        if (i10 != 0) {
            long j3 = this.z1;
            pf.b bVar = this.Z0;
            Handler handler = (Handler) bVar.b;
            if (handler != null) {
                handler.post(new h0(bVar, j3, i10));
            }
            this.z1 = 0L;
            this.A1 = 0;
        }
        m0 m0Var = this.j1;
        if (m0Var != null) {
            m0Var.e();
        } else {
            this.c1.e();
        }
    }

    @Override // r2.r, i2.f
    public final void u(b2.s[] sVarArr, long j3, long j10, u2.f0 f0Var) {
        super.u(sVarArr, j3, j10, f0Var);
        k1 k1Var = this.F;
        if (k1Var.p()) {
            this.K1 = -9223372036854775807L;
        } else {
            f0Var.getClass();
            this.K1 = k1Var.g(f0Var.a, new h1()).d;
        }
    }

    @Override // r2.r
    public final int u0(r2.i iVar, b2.s sVar) {
        boolean z10;
        int i10 = 0;
        if (!r0.m(sVar.r)) {
            return i2.g.b(0, 0, 0, 0);
        }
        boolean z11 = sVar.v != null;
        Context context = this.X0;
        List A0 = A0(context, iVar, sVar, z11, false);
        if (z11 && A0.isEmpty()) {
            A0 = A0(context, iVar, sVar, false, false);
        }
        if (A0.isEmpty()) {
            return i2.g.b(1, 0, 0, 0);
        }
        int i11 = sVar.S;
        if (i11 != 0 && i11 != 2) {
            return i2.g.b(2, 0, 0, 0);
        }
        r2.o oVar = (r2.o) A0.get(0);
        boolean e7 = oVar.e(sVar);
        if (!e7) {
            for (int i12 = 1; i12 < A0.size(); i12++) {
                r2.o oVar2 = (r2.o) A0.get(i12);
                if (oVar2.e(sVar)) {
                    oVar = oVar2;
                    z10 = false;
                    e7 = true;
                    break;
                }
            }
        }
        z10 = true;
        int i13 = 3;
        int i14 = e7 ? 4 : 3;
        int i15 = oVar.f(sVar) ? 16 : 8;
        int i16 = oVar.g ? 64 : 0;
        int i17 = z10 ? 128 : 0;
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(sVar.r) && !c2.d.d(context)) {
            i17 = 256;
        }
        if (e7) {
            List A02 = A0(context, iVar, sVar, z11, true);
            if (!A02.isEmpty()) {
                HashMap hashMap = r2.w.a;
                ArrayList arrayList = new ArrayList(A02);
                Collections.sort(arrayList, new l7(new k5(sVar, 18), i13));
                r2.o oVar3 = (r2.o) arrayList.get(0);
                if (oVar3.e(sVar) && oVar3.f(sVar)) {
                    i10 = 32;
                }
            }
        }
        return i14 | i15 | i10 | i16 | i17;
    }

    @Override // r2.r, i2.f
    public final void w(long j3, long j10) {
        m0 m0Var = this.j1;
        if (m0Var != null) {
            try {
                m0Var.p(j3, j10);
            } catch (l0 e7) {
                throw c(e7, e7.a, false, 7001);
            }
        }
        super.w(j3, j10);
    }

    @Override // r2.r, i2.f
    public final void y(float f7, float f10) {
        super.y(f7, f10);
        m0 m0Var = this.j1;
        if (m0Var != null) {
            m0Var.a(f7);
        } else {
            this.c1.i(f7);
        }
    }
}
