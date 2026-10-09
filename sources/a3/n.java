package a3;

import ai.f8;
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
import e9.a1;
import i2.n1;
import i2.p1;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLObject;
import u2.b1;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class n extends r2.s {
    public static final int[] M1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    public static boolean N1;
    public static boolean O1;
    public long A1;
    public x1 B1;
    public x1 C1;
    public int D1;
    public boolean E1;
    public int F1;
    public m G1;
    public y H1;
    public long I1;
    public long J1;
    public boolean K1;
    public int L1;
    public final Context W0;
    public final boolean X0;
    public final pf.b Y0;
    public final int Z0;
    public final boolean a1;
    public final a0 b1;
    public final z c1;
    public final long d1;
    public final PriorityQueue e1;
    public l f1;
    public boolean g1;
    public boolean h1;
    public o0 i1;
    public boolean j1;
    public int k1;
    public List l1;
    public Surface m1;
    public p n1;
    public e2.w o1;
    public boolean p1;
    public int q1;
    public int r1;
    public long s1;
    public int t1;
    public int u1;
    public int v1;
    public p1 w1;
    public boolean x1;
    public long y1;
    public int z1;

    public n(k kVar) {
        super(2, kVar.c, 30.0f);
        Context applicationContext = kVar.a.getApplicationContext();
        this.W0 = applicationContext;
        this.Z0 = kVar.g;
        this.i1 = null;
        this.Y0 = new pf.b(kVar.e, kVar.f);
        this.X0 = this.i1 == null;
        this.b1 = new a0(applicationContext, this, kVar.d);
        this.c1 = new z();
        this.a1 = "NVIDIA".equals(Build.MANUFACTURER);
        this.o1 = e2.w.c;
        this.q1 = 1;
        this.r1 = 0;
        this.B1 = x1.d;
        this.F1 = 0;
        this.C1 = null;
        this.D1 = -1000;
        this.I1 = -9223372036854775807L;
        this.J1 = -9223372036854775807L;
        this.e1 = new PriorityQueue();
        this.d1 = -9223372036854775807L;
        this.w1 = null;
    }

    public static List A0(Context context, r2.j jVar, b2.s sVar, boolean z10, boolean z11) {
        String str = sVar.r;
        if (str == null) {
            return a1.e;
        }
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(str) && !c2.d.d(context)) {
            String b10 = r2.x.b(sVar);
            List a2 = b10 == null ? a1.e : jVar.a(b10, z10, z11);
            if (!a2.isEmpty()) {
                return a2;
            }
        }
        return r2.x.f(jVar, sVar, z10, z11);
    }

    public static int B0(r2.p pVar, b2.s sVar) {
        int i10 = sVar.s;
        List list = sVar.u;
        if (i10 == -1) {
            return z0(pVar, sVar);
        }
        int size = list.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += ((byte[]) list.get(i12)).length;
        }
        return sVar.s + i11;
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
    public static boolean y0(String str) {
        boolean z10;
        boolean z11;
        boolean z12 = false;
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (n.class) {
            try {
                if (!N1) {
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
                        O1 = z12;
                        N1 = true;
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
                        O1 = z12;
                        N1 = true;
                    }
                    z12 = true;
                    O1 = z12;
                    N1 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return O1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x008b, code lost:
    
        if (r3.equals("video/av01") == false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int z0(r2.p pVar, b2.s sVar) {
        int i10 = sVar.y;
        int i11 = sVar.z;
        if (i10 != -1 && i11 != -1) {
            String str = sVar.r;
            str.getClass();
            char c10 = 1;
            if ("video/dolby-vision".equals(str)) {
                HashMap hashMap = r2.x.a;
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
                    if (!"BRAVIA 4K 2015".equals(str2) && (!"Amazon".equals(Build.MANUFACTURER) || (!"KFSOWI".equals(str2) && (!"AFTS".equals(str2) || !pVar.f)))) {
                        return ((e2.d0.f(i11, 16) * e2.d0.f(i10, 16)) * 768) / 4;
                    }
                    break;
                case 6:
                    return ((i10 * i11) * 3) / 8;
            }
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0070 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Surface C0(r2.p pVar) {
        boolean z10;
        o oVar;
        o0 o0Var = this.i1;
        if (o0Var != null) {
            return o0Var.c();
        }
        Surface surface = this.m1;
        if (surface != null) {
            return surface;
        }
        if (Build.VERSION.SDK_INT >= 35 && pVar.h) {
            return null;
        }
        e2.d.g(L0(pVar));
        p pVar2 = this.n1;
        if (pVar2 != null && pVar2.a != pVar.f && pVar2 != null) {
            pVar2.release();
            this.n1 = null;
        }
        if (this.n1 == null) {
            Context context = this.W0;
            boolean z11 = pVar.f;
            boolean z12 = false;
            if (!z11) {
                int i10 = p.d;
            } else if (!p.b(context)) {
                z10 = false;
                e2.d.g(z10);
                oVar = new o("ExoPlayer:PlaceholderSurface");
                int i11 = !z11 ? p.d : 0;
                oVar.start();
                Handler handler = new Handler(oVar.getLooper(), oVar);
                oVar.b = handler;
                oVar.a = new e2.j(handler);
                synchronized (oVar) {
                    oVar.b.obtainMessage(1, i11, 0).sendToTarget();
                    while (oVar.e == null && oVar.d == null && oVar.c == null) {
                        try {
                            oVar.wait();
                        } catch (InterruptedException unused) {
                            z12 = true;
                        }
                    }
                }
                if (z12) {
                    Thread.currentThread().interrupt();
                }
                RuntimeException runtimeException = oVar.d;
                if (runtimeException != null) {
                    throw runtimeException;
                }
                Error error = oVar.c;
                if (error != null) {
                    throw error;
                }
                p pVar3 = oVar.e;
                pVar3.getClass();
                this.n1 = pVar3;
            }
            z10 = true;
            e2.d.g(z10);
            oVar = new o("ExoPlayer:PlaceholderSurface");
            if (!z11) {
            }
            oVar.start();
            Handler handler2 = new Handler(oVar.getLooper(), oVar);
            oVar.b = handler2;
            oVar.a = new e2.j(handler2);
            synchronized (oVar) {
            }
        }
        return this.n1;
    }

    @Override // r2.s
    public final i2.h D(r2.p pVar, b2.s sVar, b2.s sVar2) {
        i2.h b10 = pVar.b(sVar, sVar2);
        int i10 = b10.e;
        l lVar = this.f1;
        lVar.getClass();
        if (sVar2.y > lVar.a || sVar2.z > lVar.b) {
            i10 |= 256;
        }
        if (B0(pVar, sVar2) > lVar.c) {
            i10 |= 64;
        }
        int i11 = i10;
        return new i2.h(pVar.a, sVar, sVar2, i11 != 0 ? 0 : b10.d, i11);
    }

    public final boolean D0(r2.p pVar) {
        if (this.i1 != null) {
            return true;
        }
        Surface surface = this.m1;
        if (surface == null || !surface.isValid()) {
            return (Build.VERSION.SDK_INT >= 35 && pVar.h) || L0(pVar);
        }
        return true;
    }

    @Override // r2.s
    public final r2.o E(IllegalStateException illegalStateException, r2.p pVar) {
        Surface surface = this.m1;
        i iVar = new i(illegalStateException, pVar);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return iVar;
    }

    public final boolean E0(h2.h hVar) {
        if (k() || hVar.isLastSample()) {
            return true;
        }
        long j3 = this.J1;
        return j3 == -9223372036854775807L || j3 - (hVar.e - this.O0.c) <= 100000;
    }

    public final void F0() {
        if (this.t1 > 0) {
            this.h.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j3 = elapsedRealtime - this.s1;
            int i10 = this.t1;
            pf.b bVar = this.Y0;
            Handler handler = (Handler) bVar.b;
            if (handler != null) {
                handler.post(new i0(bVar, i10, j3));
            }
            this.t1 = 0;
            this.s1 = elapsedRealtime;
        }
    }

    public final void G0() {
        if (this.E1) {
            int i10 = Build.VERSION.SDK_INT;
            r2.m mVar = this.b0;
            if (mVar == null) {
                return;
            }
            this.G1 = new m(this, mVar);
            if (i10 >= 33) {
                Bundle bundle = new Bundle();
                bundle.putInt("tunnel-peek", 1);
                mVar.setParameters(bundle);
            }
        }
    }

    public final void H0(long j3) {
        Surface surface;
        x0(j3);
        x1 x1Var = this.B1;
        boolean equals = x1Var.equals(x1.d);
        pf.b bVar = this.Y0;
        if (!equals && !x1Var.equals(this.C1)) {
            this.C1 = x1Var;
            bVar.V(x1Var);
        }
        this.N0.e++;
        a0 a0Var = this.b1;
        boolean z10 = a0Var.e != 3;
        a0Var.e = 3;
        a0Var.l.getClass();
        a0Var.g = e2.d0.P(SystemClock.elapsedRealtime());
        if (z10 && (surface = this.m1) != null) {
            bVar.R(surface);
            this.p1 = true;
        }
        c0(j3);
    }

    public final void I0(r2.m mVar, int i10, long j3) {
        Surface surface;
        Trace.beginSection("releaseOutputBuffer");
        mVar.f(i10, j3);
        Trace.endSection();
        this.N0.e++;
        this.u1 = 0;
        if (this.i1 == null) {
            x1 x1Var = this.B1;
            boolean equals = x1Var.equals(x1.d);
            pf.b bVar = this.Y0;
            if (!equals && !x1Var.equals(this.C1)) {
                this.C1 = x1Var;
                bVar.V(x1Var);
            }
            a0 a0Var = this.b1;
            boolean z10 = a0Var.e != 3;
            a0Var.e = 3;
            a0Var.l.getClass();
            a0Var.g = e2.d0.P(SystemClock.elapsedRealtime());
            if (!z10 || (surface = this.m1) == null) {
                return;
            }
            bVar.R(surface);
            this.p1 = true;
        }
    }

    public final void J0(Object obj) {
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        Surface surface2 = this.m1;
        pf.b bVar = this.Y0;
        if (surface2 == surface) {
            if (surface != null) {
                x1 x1Var = this.C1;
                if (x1Var != null) {
                    bVar.V(x1Var);
                }
                Surface surface3 = this.m1;
                if (surface3 == null || !this.p1) {
                    return;
                }
                bVar.R(surface3);
                return;
            }
            return;
        }
        this.m1 = surface;
        o0 o0Var = this.i1;
        a0 a0Var = this.b1;
        if (o0Var == null) {
            a0Var.h(surface);
        }
        this.p1 = false;
        int i10 = this.n;
        r2.m mVar = this.b0;
        if (mVar != null && this.i1 == null) {
            r2.p pVar = this.i0;
            pVar.getClass();
            boolean D0 = D0(pVar);
            int i11 = Build.VERSION.SDK_INT;
            if (!D0 || this.g1) {
                i0();
                T();
            } else {
                Surface C0 = C0(pVar);
                if (C0 != null) {
                    try {
                        mVar.j(C0);
                    } catch (Throwable th2) {
                        th2.printStackTrace();
                        throw new x(th2);
                    }
                } else {
                    if (i11 < 35) {
                        throw new IllegalStateException();
                    }
                    mVar.e();
                }
            }
        }
        if (surface != null) {
            x1 x1Var2 = this.C1;
            if (x1Var2 != null) {
                bVar.V(x1Var2);
            }
        } else {
            this.C1 = null;
            o0 o0Var2 = this.i1;
            if (o0Var2 != null) {
                o0Var2.k();
            }
        }
        if (i10 == 2) {
            o0 o0Var3 = this.i1;
            if (o0Var3 != null) {
                o0Var3.q(true);
            } else {
                a0Var.c(true);
            }
        }
        G0();
    }

    public final boolean K0(long j3, long j10, boolean z10, boolean z11) {
        if (this.i1 != null && this.X0) {
            j10 -= -this.I1;
        }
        if (j3 < -500000 && !z10) {
            b1 b1Var = this.r;
            b1Var.getClass();
            int j11 = b1Var.j(j10 - this.v);
            if (j11 != 0) {
                PriorityQueue priorityQueue = this.e1;
                if (z11) {
                    i2.g gVar = this.N0;
                    int i10 = gVar.d + j11;
                    gVar.d = i10;
                    gVar.f += this.v1;
                    gVar.d = priorityQueue.size() + i10;
                } else {
                    this.N0.j++;
                    N0(priorityQueue.size() + j11, this.v1);
                }
                if (J()) {
                    T();
                }
                o0 o0Var = this.i1;
                if (o0Var != null) {
                    o0Var.m(false);
                }
                return true;
            }
        }
        return false;
    }

    @Override // r2.s
    public final int L(h2.h hVar) {
        if (Build.VERSION.SDK_INT >= 34) {
            return ((this.w1 == null && !this.E1) || hVar.e >= this.w || E0(hVar)) ? 0 : 32;
        }
        return 0;
    }

    public final boolean L0(r2.p pVar) {
        if (this.E1 || y0(pVar.a)) {
            return false;
        }
        return !pVar.f || p.b(this.W0);
    }

    @Override // r2.s
    public final float M(float f7, b2.s sVar, b2.s[] sVarArr) {
        r2.p pVar;
        float f10 = -1.0f;
        for (b2.s sVar2 : sVarArr) {
            float f11 = sVar2.C;
            if (f11 != -1.0f) {
                f10 = Math.max(f10, f11);
            }
        }
        float f12 = f10 == -1.0f ? -1.0f : f10 * f7;
        if (this.w1 == null || (pVar = this.i0) == null) {
            return f12;
        }
        int i10 = sVar.y;
        int i11 = sVar.z;
        float f13 = -3.4028235E38f;
        if (pVar.i) {
            float f14 = pVar.l;
            if (f14 != -3.4028235E38f && pVar.j == i10 && pVar.k == i11) {
                f13 = f14;
            } else {
                float f15 = 1024.0f;
                if (!pVar.g(i10, i11, 1024.0f)) {
                    f13 = 0.0f;
                    while (true) {
                        float f16 = f15 - f13;
                        if (Math.abs(f16) <= 5.0f) {
                            break;
                        }
                        float f17 = (f16 / 2.0f) + f13;
                        if (pVar.g(i10, i11, f17)) {
                            f13 = f17;
                        } else {
                            f15 = f17;
                        }
                    }
                } else {
                    f13 = 1024.0f;
                }
                pVar.l = f13;
                pVar.j = i10;
                pVar.k = i11;
            }
        }
        return f12 != -1.0f ? Math.max(f12, f13) : f13;
    }

    public final void M0(r2.m mVar, int i10) {
        Trace.beginSection("skipVideoBuffer");
        mVar.c(i10);
        Trace.endSection();
        this.N0.f++;
    }

    @Override // r2.s
    public final ArrayList N(r2.j jVar, b2.s sVar, boolean z10) {
        List A0 = A0(this.W0, jVar, sVar, z10, this.E1);
        HashMap hashMap = r2.x.a;
        ArrayList arrayList = new ArrayList(A0);
        Collections.sort(arrayList, new f8(new m4.w(sVar, 28), 3));
        return arrayList;
    }

    public final void N0(int i10, int i11) {
        i2.g gVar = this.N0;
        gVar.h += i10;
        int i12 = i10 + i11;
        gVar.g += i12;
        this.t1 += i12;
        int i13 = this.u1 + i12;
        this.u1 = i13;
        gVar.i = Math.max(i13, gVar.i);
        int i14 = this.Z0;
        if (i14 <= 0 || this.t1 < i14) {
            return;
        }
        F0();
    }

    public final void O0(long j3) {
        i2.g gVar = this.N0;
        gVar.k += j3;
        gVar.l++;
        this.y1 += j3;
        this.z1++;
    }

    @Override // r2.s
    public final com.google.firebase.messaging.n P(r2.p pVar, b2.s sVar, MediaCrypto mediaCrypto, float f7) {
        b2.j jVar;
        int i10;
        l lVar;
        Point point;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int i11;
        int i12;
        char c10;
        boolean z10;
        int z02;
        String str = pVar.c;
        b2.s[] sVarArr = this.s;
        sVarArr.getClass();
        int i13 = sVar.y;
        float f10 = sVar.C;
        b2.j jVar2 = sVar.H;
        int i14 = sVar.z;
        int B0 = B0(pVar, sVar);
        if (sVarArr.length == 1) {
            if (B0 != -1 && (z02 = z0(pVar, sVar)) != -1) {
                B0 = Math.min((int) (B0 * 1.5f), z02);
            }
            lVar = new l(i13, i14, B0);
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
                i2.h b10 = pVar.b(sVar, sVar2);
                int i18 = length;
                int i19 = sVar2.z;
                if (b10.d != 0) {
                    int i20 = sVar2.y;
                    i12 = i17;
                    c10 = 65535;
                    z11 |= i20 == -1 || i19 == -1;
                    i15 = Math.max(i15, i20);
                    i16 = Math.max(i16, i19);
                    B0 = Math.max(B0, B0(pVar, sVar2));
                } else {
                    i12 = i17;
                    c10 = 65535;
                }
                length = i18;
                i17 = i12 + 1;
                sVarArr = sVarArr2;
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
                    int i24 = M1[i23];
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
                    MediaCodecInfo.CodecCapabilities codecCapabilities = pVar.d;
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
                        if (pVar.g(point.x, point.y, f10)) {
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
                    B0 = Math.max(B0, z0(pVar, new b2.s(a10)));
                    e2.a.n("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + i15 + "x" + i16);
                }
            } else {
                jVar = jVar2;
                i10 = i14;
            }
            lVar = new l(i15, i16, B0);
        }
        this.f1 = lVar;
        int i28 = this.E1 ? this.F1 : 0;
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
            HashMap hashMap = r2.x.a;
            Pair b11 = e2.e.b(sVar);
            if (b11 != null) {
                e2.d.n(mediaFormat, "profile", ((Integer) b11.first).intValue());
            }
        }
        mediaFormat.setInteger("max-width", lVar.a);
        mediaFormat.setInteger("max-height", lVar.b);
        e2.d.n(mediaFormat, "max-input-size", lVar.c);
        int i29 = Build.VERSION.SDK_INT;
        mediaFormat.setInteger("priority", 0);
        if (f7 != -1.0f) {
            mediaFormat.setFloat("operating-rate", f7);
        }
        if (this.a1) {
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
            mediaFormat.setInteger("importance", Math.max(0, -this.D1));
        }
        Surface C0 = C0(pVar);
        if (this.i1 != null && !e2.d0.K(this.W0)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        return new com.google.firebase.messaging.n(pVar, mediaFormat, sVar, C0, mediaCrypto, null);
    }

    @Override // r2.s
    public final void Q(h2.h hVar) {
        if (this.h1) {
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
                        r2.m mVar = this.b0;
                        mVar.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        mVar.setParameters(bundle);
                    }
                }
            }
        }
    }

    @Override // r2.s
    public final boolean V(b2.s sVar) {
        o0 o0Var = this.i1;
        if (o0Var == null || o0Var.v()) {
            return true;
        }
        try {
            return this.i1.d(sVar);
        } catch (n0 e7) {
            throw d(e7, sVar, false, 7000);
        }
    }

    @Override // r2.s
    public final void W(Exception exc) {
        e2.a.f("MediaCodecVideoRenderer", "Video codec error", exc);
        pf.b bVar = this.Y0;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new a1.f(3, bVar, exc));
        }
    }

    @Override // r2.s
    public final void X(long j3, long j10, String str) {
        String str2;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        pf.b bVar = this.Y0;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            str2 = str;
            handler.post(new g0(bVar, str2, j3, j10, 0));
        } else {
            str2 = str;
        }
        this.g1 = y0(str2);
        r2.p pVar = this.i0;
        pVar.getClass();
        boolean z10 = false;
        if (Build.VERSION.SDK_INT >= 29 && "video/x-vnd.on2.vp9".equals(pVar.b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = pVar.d;
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
        this.h1 = z10;
        G0();
    }

    @Override // r2.s
    public final void Y(String str) {
        pf.b bVar = this.Y0;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new a1.f(4, bVar, str));
        }
    }

    @Override // r2.s
    public final i2.h Z(n4.x xVar) {
        i2.h Z = super.Z(xVar);
        b2.s sVar = (b2.s) xVar.c;
        sVar.getClass();
        pf.b bVar = this.Y0;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new k0(bVar, sVar, Z, 0));
        }
        return Z;
    }

    @Override // r2.s
    public final void a0(b2.s sVar, MediaFormat mediaFormat) {
        int integer;
        int i10;
        r2.m mVar = this.b0;
        if (mVar != null) {
            mVar.i(this.q1);
        }
        if (this.E1) {
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
        this.B1 = new x1(f7, i10, integer);
        o0 o0Var = this.i1;
        if (o0Var == null || !this.K1) {
            this.b1.g(sVar.C);
        } else {
            b2.r a2 = sVar.a();
            a2.x = i10;
            a2.y = integer;
            a2.D = f7;
            b2.s sVar2 = new b2.s(a2);
            int i13 = this.k1;
            List list = this.l1;
            if (list == null) {
                e9.g0 g0Var = e9.i0.b;
                list = a1.e;
            }
            o0Var.l(sVar2, this.O0.b, i13, list);
            this.k1 = 2;
        }
        this.K1 = false;
    }

    @Override // i2.f, i2.j1
    public final void c(int i10, Object obj) {
        if (i10 == 1) {
            J0(obj);
            return;
        }
        if (i10 == 7) {
            obj.getClass();
            y yVar = (y) obj;
            this.H1 = yVar;
            o0 o0Var = this.i1;
            if (o0Var != null) {
                o0Var.u(yVar);
                return;
            }
            return;
        }
        if (i10 == 10) {
            obj.getClass();
            int intValue = ((Integer) obj).intValue();
            if (this.F1 != intValue) {
                this.F1 = intValue;
                if (this.E1) {
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
            this.q1 = intValue2;
            r2.m mVar = this.b0;
            if (mVar != null) {
                mVar.i(intValue2);
                return;
            }
            return;
        }
        if (i10 == 5) {
            obj.getClass();
            int intValue3 = ((Integer) obj).intValue();
            this.r1 = intValue3;
            o0 o0Var2 = this.i1;
            if (o0Var2 != null) {
                o0Var2.j(intValue3);
                return;
            }
            e0 e0Var = this.b1.b;
            if (e0Var.j == intValue3) {
                return;
            }
            e0Var.j = intValue3;
            e0Var.d(true);
            return;
        }
        if (i10 == 13) {
            obj.getClass();
            List list = (List) obj;
            if (list.equals(v1.a)) {
                o0 o0Var3 = this.i1;
                if (o0Var3 == null || !o0Var3.v()) {
                    return;
                }
                this.i1.t();
                return;
            }
            this.l1 = list;
            o0 o0Var4 = this.i1;
            if (o0Var4 != null) {
                o0Var4.o(list);
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
            this.o1 = wVar;
            o0 o0Var5 = this.i1;
            if (o0Var5 != null) {
                Surface surface = this.m1;
                e2.d.h(surface);
                o0Var5.s(surface, wVar);
                return;
            }
            return;
        }
        switch (i10) {
            case 16:
                obj.getClass();
                this.D1 = ((Integer) obj).intValue();
                r2.m mVar2 = this.b0;
                if (mVar2 != null && Build.VERSION.SDK_INT >= 35) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("importance", Math.max(0, -this.D1));
                    mVar2.setParameters(bundle);
                    break;
                }
                break;
            case 17:
                Surface surface2 = this.m1;
                J0(null);
                obj.getClass();
                ((n) obj).c(1, surface2);
                break;
            case 18:
                boolean z10 = this.w1 != null;
                p1 p1Var = (p1) obj;
                this.w1 = p1Var;
                if (z10 != (p1Var != null)) {
                    v0(this.c0);
                    break;
                }
                break;
            default:
                if (i10 == 11) {
                    i2.j0 j0Var = (i2.j0) obj;
                    j0Var.getClass();
                    this.W = j0Var;
                    break;
                }
                break;
        }
    }

    @Override // r2.s
    public final void c0(long j3) {
        super.c0(j3);
        if (this.E1) {
            return;
        }
        this.v1--;
    }

    @Override // r2.s
    public final void d0() {
        o0 o0Var = this.i1;
        if (o0Var != null) {
            o0Var.i();
            if (this.I1 == -9223372036854775807L) {
                this.I1 = this.O0.b;
            }
            this.i1.h(-this.I1);
        } else {
            this.b1.f(2);
        }
        this.K1 = true;
        G0();
    }

    @Override // i2.f
    public final void e() {
        o0 o0Var = this.i1;
        if (o0Var == null) {
            a0 a0Var = this.b1;
            if (a0Var.e == 0) {
                a0Var.e = 1;
                return;
            }
            return;
        }
        int i10 = this.k1;
        if (i10 == 0 || i10 == 1) {
            this.k1 = 0;
        } else {
            o0Var.w();
        }
    }

    @Override // r2.s
    public final void e0(h2.h hVar) {
        this.L1 = 0;
        int L = L(hVar);
        if ((Build.VERSION.SDK_INT < 34 || (L & 32) == 0) && !this.E1) {
            this.v1++;
        }
    }

    @Override // r2.s
    public final boolean g0(long j3, long j10, r2.m mVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j11, boolean z10, boolean z11, b2.s sVar) {
        int i13;
        mVar.getClass();
        long j12 = j11 - this.O0.c;
        int i14 = 0;
        while (true) {
            PriorityQueue priorityQueue = this.e1;
            Long l4 = (Long) priorityQueue.peek();
            if (l4 == null || l4.longValue() >= j11) {
                break;
            }
            i14++;
            priorityQueue.poll();
        }
        N0(i14, 0);
        o0 o0Var = this.i1;
        if (o0Var != null) {
            if (!z10 || z11) {
                return o0Var.n(j11, new j(this, mVar, i10, j12));
            }
            M0(mVar, i10);
            return true;
        }
        int a2 = this.b1.a(j11, j3, j10, this.O0.b, z10, z11, this.c1);
        z zVar = this.c1;
        if (a2 == 0) {
            this.h.getClass();
            long nanoTime = System.nanoTime();
            y yVar = this.H1;
            if (yVar != null) {
                yVar.a(j12, nanoTime, sVar, this.d0);
            }
            I0(mVar, i10, nanoTime);
            O0(zVar.a);
            return true;
        }
        if (a2 == 1) {
            long j13 = zVar.b;
            long j14 = zVar.a;
            if (j13 == this.A1) {
                M0(mVar, i10);
            } else {
                y yVar2 = this.H1;
                if (yVar2 != null) {
                    i13 = i10;
                    yVar2.a(j12, j13, sVar, this.d0);
                } else {
                    i13 = i10;
                }
                I0(mVar, i13, j13);
            }
            O0(j14);
            this.A1 = j13;
            return true;
        }
        if (a2 == 2) {
            Trace.beginSection("dropVideoBuffer");
            mVar.c(i10);
            Trace.endSection();
            N0(0, 1);
            O0(zVar.a);
            return true;
        }
        if (a2 == 3) {
            M0(mVar, i10);
            O0(zVar.a);
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

    @Override // r2.s
    public final void j0() {
        o0 o0Var = this.i1;
        if (o0Var != null) {
            o0Var.i();
        }
    }

    @Override // i2.f
    public final boolean l() {
        if (!this.J0) {
            return false;
        }
        o0 o0Var = this.i1;
        return o0Var == null || o0Var.b();
    }

    @Override // r2.s
    public final void l0() {
        super.l0();
        this.e1.clear();
        this.v1 = 0;
        this.L1 = 0;
        this.x1 = false;
    }

    @Override // r2.s, i2.f
    public final boolean m() {
        boolean m10 = super.m();
        o0 o0Var = this.i1;
        if (o0Var != null) {
            return o0Var.r(m10);
        }
        if (m10 && (this.b0 == null || this.E1)) {
            return true;
        }
        return this.b1.b(m10);
    }

    @Override // r2.s, i2.f
    public final void o() {
        pf.b bVar = this.Y0;
        this.C1 = null;
        this.J1 = -9223372036854775807L;
        G0();
        this.p1 = false;
        this.G1 = null;
        this.x1 = true;
        try {
            super.o();
        } finally {
            bVar.F(this.N0);
            bVar.V(x1.d);
        }
    }

    @Override // i2.f
    public final void p(boolean z10, boolean z11) {
        o0 o0Var;
        this.N0 = new i2.g();
        n1 n1Var = this.d;
        n1Var.getClass();
        boolean z12 = n1Var.b;
        e2.d.g((z12 && this.F1 == 0) ? false : true);
        if (this.E1 != z12) {
            this.E1 = z12;
            i0();
        }
        i2.g gVar = this.N0;
        pf.b bVar = this.Y0;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new j0(bVar, gVar, 0));
        }
        boolean z13 = this.j1;
        a0 a0Var = this.b1;
        if (!z13) {
            if (this.l1 != null && this.i1 == null) {
                q qVar = new q(this.W0, a0Var);
                qVar.a = true;
                e2.x xVar = this.h;
                xVar.getClass();
                qVar.f = xVar;
                e2.d.g(!qVar.b);
                if (((u) qVar.e) == null) {
                    qVar.e = new u();
                }
                w wVar = new w(qVar);
                qVar.b = true;
                wVar.n = 1;
                SparseArray sparseArray = wVar.c;
                if (e2.d0.j(sparseArray, 0)) {
                    o0Var = (o0) sparseArray.get(0);
                } else {
                    r rVar = new r(wVar, wVar.a);
                    wVar.g.add(rVar);
                    sparseArray.put(0, rVar);
                    o0Var = rVar;
                }
                this.i1 = o0Var;
            }
            this.j1 = true;
        }
        o0 o0Var2 = this.i1;
        if (o0Var2 == null) {
            e2.x xVar2 = this.h;
            xVar2.getClass();
            a0Var.l = xVar2;
            a0Var.f(!z11 ? 1 : 0);
            return;
        }
        o0Var2.g(new a6.i(this, 1));
        y yVar = this.H1;
        if (yVar != null) {
            this.i1.u(yVar);
        }
        if (this.m1 != null && !this.o1.equals(e2.w.c)) {
            this.i1.s(this.m1, this.o1);
        }
        this.i1.j(this.r1);
        this.i1.a(this.Z);
        List list = this.l1;
        if (list != null) {
            this.i1.o(list);
        }
        this.k1 = !z11 ? 1 : 0;
        this.R0 = true;
    }

    @Override // r2.s
    public final boolean p0(h2.h hVar) {
        boolean z10 = false;
        if (!E0(hVar)) {
            boolean z11 = hVar.e < this.w;
            if (z11 && !hVar.hasSupplementalData()) {
                if (hVar.notDependedOn()) {
                    hVar.clear();
                    z10 = true;
                }
                if (z10) {
                    if (z11) {
                        this.N0.d++;
                    } else {
                        this.e1.add(Long.valueOf(hVar.e));
                        this.L1++;
                    }
                }
                return z10;
            }
        }
        return false;
    }

    @Override // r2.s, i2.f
    public final void q(long j3, boolean z10) {
        o0 o0Var = this.i1;
        if (o0Var != null && !z10) {
            o0Var.m(true);
        }
        super.q(j3, z10);
        o0 o0Var2 = this.i1;
        a0 a0Var = this.b1;
        if (o0Var2 == null) {
            e0 e0Var = a0Var.b;
            e0Var.m = 0L;
            e0Var.p = -1L;
            e0Var.n = -1L;
            a0Var.h = -9223372036854775807L;
            a0Var.f = -9223372036854775807L;
            a0Var.e = Math.min(a0Var.e, 1);
            a0Var.i = -9223372036854775807L;
        }
        if (z10) {
            o0 o0Var3 = this.i1;
            if (o0Var3 != null) {
                o0Var3.q(false);
            } else {
                a0Var.c(false);
            }
        }
        G0();
        this.u1 = 0;
    }

    @Override // r2.s
    public final boolean q0() {
        b2.s sVar = this.c0;
        if (this.w1 == null || this.x1 || this.E1) {
            return true;
        }
        return (sVar != null && sVar.t > 0) || this.S0 || this.H0 != -9223372036854775807L;
    }

    @Override // i2.f
    public final void r() {
        o0 o0Var = this.i1;
        if (o0Var == null || !this.X0) {
            return;
        }
        o0Var.release();
    }

    @Override // r2.s
    public final boolean r0(r2.p pVar) {
        return D0(pVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // i2.f
    public final void s() {
        try {
            try {
                this.w0 = false;
                k0();
                i0();
            } finally {
                hg.c.A(this.V, null);
                this.V = null;
            }
        } finally {
            this.j1 = false;
            this.I1 = -9223372036854775807L;
            p pVar = this.n1;
            if (pVar != null) {
                pVar.release();
                this.n1 = null;
            }
        }
    }

    @Override // r2.s
    public final boolean s0() {
        r2.p pVar = this.i0;
        if (this.i1 != null && pVar != null) {
            String str = pVar.a;
            if (str.equals("c2.mtk.avc.decoder") || str.equals("c2.mtk.hevc.decoder")) {
                return true;
            }
        }
        return super.s0();
    }

    @Override // i2.f
    public final void t() {
        this.t1 = 0;
        this.h.getClass();
        this.s1 = SystemClock.elapsedRealtime();
        this.y1 = 0L;
        this.z1 = 0;
        o0 o0Var = this.i1;
        if (o0Var != null) {
            o0Var.f();
        } else {
            this.b1.d();
        }
    }

    @Override // i2.f
    public final void u() {
        F0();
        int i10 = this.z1;
        if (i10 != 0) {
            long j3 = this.y1;
            pf.b bVar = this.Y0;
            Handler handler = (Handler) bVar.b;
            if (handler != null) {
                handler.post(new i0(bVar, j3, i10));
            }
            this.y1 = 0L;
            this.z1 = 0;
        }
        o0 o0Var = this.i1;
        if (o0Var != null) {
            o0Var.e();
        } else {
            this.b1.e();
        }
    }

    @Override // r2.s
    public final int u0(r2.j jVar, b2.s sVar) {
        boolean z10;
        int i10 = 0;
        if (!r0.m(sVar.r)) {
            return hg.c.b(0, 0, 0, 0);
        }
        boolean z11 = sVar.v != null;
        Context context = this.W0;
        List A0 = A0(context, jVar, sVar, z11, false);
        if (z11 && A0.isEmpty()) {
            A0 = A0(context, jVar, sVar, false, false);
        }
        if (A0.isEmpty()) {
            return hg.c.b(1, 0, 0, 0);
        }
        int i11 = sVar.S;
        if (i11 != 0 && i11 != 2) {
            return hg.c.b(2, 0, 0, 0);
        }
        r2.p pVar = (r2.p) A0.get(0);
        boolean e7 = pVar.e(sVar);
        if (!e7) {
            for (int i12 = 1; i12 < A0.size(); i12++) {
                r2.p pVar2 = (r2.p) A0.get(i12);
                if (pVar2.e(sVar)) {
                    z10 = false;
                    e7 = true;
                    pVar = pVar2;
                    break;
                }
            }
        }
        z10 = true;
        int i13 = 3;
        int i14 = e7 ? 4 : 3;
        int i15 = pVar.f(sVar) ? 16 : 8;
        int i16 = pVar.g ? 64 : 0;
        int i17 = z10 ? 128 : 0;
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(sVar.r) && !c2.d.d(context)) {
            i17 = 256;
        }
        if (e7) {
            List A02 = A0(context, jVar, sVar, z11, true);
            if (!A02.isEmpty()) {
                HashMap hashMap = r2.x.a;
                ArrayList arrayList = new ArrayList(A02);
                Collections.sort(arrayList, new f8(new m4.w(sVar, 28), i13));
                r2.p pVar3 = (r2.p) arrayList.get(0);
                if (pVar3.e(sVar) && pVar3.f(sVar)) {
                    i10 = 32;
                }
            }
        }
        return i14 | i15 | i10 | i16 | i17;
    }

    @Override // r2.s, i2.f
    public final void v(b2.s[] sVarArr, long j3, long j10, u2.f0 f0Var) {
        super.v(sVarArr, j3, j10, f0Var);
        k1 k1Var = this.F;
        if (k1Var.p()) {
            this.J1 = -9223372036854775807L;
        } else {
            f0Var.getClass();
            this.J1 = k1Var.g(f0Var.a, new h1()).d;
        }
    }

    @Override // r2.s, i2.f
    public final void x(long j3, long j10) {
        o0 o0Var = this.i1;
        if (o0Var != null) {
            try {
                o0Var.p(j3, j10);
            } catch (n0 e7) {
                throw d(e7, e7.a, false, 7001);
            }
        }
        super.x(j3, j10);
    }

    @Override // r2.s, i2.f
    public final void z(float f7, float f10) {
        super.z(f7, f10);
        o0 o0Var = this.i1;
        if (o0Var != null) {
            o0Var.a(f7);
        } else {
            this.b1.i(f7);
        }
    }
}
