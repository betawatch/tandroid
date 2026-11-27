// default package

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.style.StyleSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.OvershootInterpolator;
import j$.util.Comparator$-CC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Stack;
import java.util.regex.Pattern;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public class of3 extends jf0 implements i6b, snb {
    public boolean A0;
    public boolean A1;
    public StaticLayout A2;
    public boolean A3;
    public boolean A4;
    public boolean B0;
    public boolean B1;
    public boolean B2;
    public boolean B3;
    public ValueAnimator B4;
    public boolean C0;
    public float C1;
    public float C2;
    public boolean C3;
    public long C4;
    public float D0;
    public float D1;
    public boolean D2;
    public int D3;
    public int D4;
    public boolean E;
    public tk0 E0;
    public float E1;
    public boolean E2;
    public int E3;
    public final uj3 E4;
    public boolean F;
    public boolean F0;
    public boolean F1;
    public Paint F2;
    public int F3;
    public StaticLayout F4;
    public boolean G;
    public final int G0;
    public final v41 G1;
    public Paint G2;
    public float G3;
    public int G4;
    public mea H;
    public jf3 H0;
    public final Paint H1;
    public boolean H2;
    public boolean H3;
    public int H4;
    public byte I;
    public long I0;
    public final RectF I1;
    public int I2;
    public boolean I3;
    public int I4;
    public byte J;
    public String J0;
    public pkb J1;
    public int J2;
    public int J3;
    public final lf3 J4;
    public byte K;
    public int K0;
    public boolean K1;
    public int K2;
    public LayerDrawable K3;
    public final vnb K4;
    public byte L;
    public long L0;
    public zj3 L1;
    public int L2;
    public int L3;
    public int L4;
    public final byte M;
    public String M0;
    public boolean M1;
    public int M2;
    public boolean M3;
    public byte M4;
    public final byte N;
    public int N0;
    public int N1;
    public int N2;
    public int N3;
    public int N4;
    public TLRPC.TL_forumTopic O;
    public boolean O0;
    public int O1;
    public StaticLayout O2;
    public int O3;
    public nf3 O4;
    public boolean P;
    public boolean P0;
    public String P1;
    public int P2;
    public int P3;
    public GradientDrawable P4;
    public boolean Q;
    public boolean Q0;
    public int Q1;
    public boolean Q2;
    public int Q3;
    public int Q4;
    public boolean R;
    public boolean R0;
    public b29 R1;
    public boolean R2;
    public int R3;
    public int R4;
    public boolean S;
    public int S0;
    public int S1;
    public boolean S2;
    public boolean S3;
    public Paint S4;
    public Paint T;
    public int T0;
    public boolean T1;
    public boolean T2;
    public final fm0 T3;
    public al8 T4;
    public Paint U;
    public boolean U0;
    public Paint U1;
    public int U2;
    public ValueAnimator U3;
    public Drawable U4;
    public float V;
    public int V0;
    public final boolean[] V1;
    public int V2;
    public ValueAnimator V3;
    public int V4;
    public boolean W;
    public int W0;
    public final ImageReceiver[] W1;
    public int W2;
    public float W3;
    public Drawable W4;
    public int X0;
    public final boolean[] X1;
    public int X2;
    public float X3;
    public Drawable X4;
    public boolean Y0;
    public final boolean[] Y1;
    public int Y2;
    public StaticLayout Y3;
    public ColorFilter[] Y4;
    public int Z0;
    public final ImageReceiver Z1;
    public int Z2;
    public StaticLayout Z3;
    public int[] Z4;
    public boolean a0;
    public boolean a1;
    public e88 a2;
    public int a3;
    public StaticLayout a4;
    public Runnable a5;
    public TextPaint b0;
    public boolean b1;
    public final rb0 b2;
    public int b3;
    public StaticLayout b4;
    public Paint c0;
    public boolean c1;
    public boolean c2;
    public int c3;
    public boolean c4;
    public za1 d0;
    public float d1;
    public float d2;
    public int d3;
    public boolean d4;
    public kf3 e0;
    public boolean e1;
    public final if3 e2;
    public int e3;
    public boolean e4;
    public boolean f;
    public boolean f0;
    public boolean f1;
    public ey8 f2;
    public StaticLayout f3;
    public int f4;
    public boolean g0;
    public r47 g1;
    public TLRPC.User g2;
    public StaticLayout g3;
    public int g4;
    public final boolean h;
    public boolean h0;
    public ArrayList h1;
    public TLRPC.Chat h2;
    public int h3;
    public int h4;
    public Drawable[] i0;
    public boolean i1;
    public TLRPC.EncryptedChat i2;
    public StaticLayout i3;
    public int i4;
    public float j0;
    public CharSequence j1;
    public CharSequence j2;
    public final Stack j3;
    public StaticLayout j4;
    public boolean k0;
    public int k1;
    public int k2;
    public final ArrayList k3;
    public boolean k4;
    public boolean l0;
    public int l1;
    public boolean l2;
    public final Stack l3;
    public boolean l4;
    public int m0;
    public int m1;
    public TLRPC.DraftMessage m2;
    public final ArrayList m3;
    public boolean m4;
    public float n;
    public float n0;
    public boolean n1;
    public final mm n2;
    public dm n3;
    public final tb n4;
    public rsb o0;
    public boolean o1;
    public boolean o2;
    public dm o3;
    public final ul o4;
    public Paint p0;
    public float p1;
    public final mm p2;
    public dm p3;
    public final ul p4;
    public Paint q0;
    public float q1;
    public long q2;
    public dm q3;
    public byte q4;
    public boolean r;
    public boolean r0;
    public float r1;
    public za r2;
    public int r3;
    public boolean r4;
    public b29 s;
    public boolean s0;
    public float s1;
    public final boolean s2;
    public int s3;
    public final RectF s4;
    public boolean t0;
    public int t1;
    public boolean t2;
    public StaticLayout t3;
    public dk3 t4;
    public lyc u0;
    public float u1;
    public boolean u2;
    public boolean u3;
    public Path u4;
    public final gf3 v0;
    public int v1;
    public boolean v2;
    public int v3;
    public RectF v4;
    public int w;
    public Path w0;
    public int w1;
    public boolean w2;
    public int w3;
    public int w4;
    public boolean x;
    public npa x0;
    public float x1;
    public boolean x2;
    public boolean x3;
    public int x4;
    public boolean y;
    public boolean y0;
    public boolean y1;
    public int y2;
    public float y3;
    public int y4;
    public boolean z0;
    public b29 z1;
    public int z2;
    public boolean z3;
    public float z4;

    /* JADX WARN: Multi-variable type inference failed */
    public of3(uj3 uj3Var, Context context, boolean z, int i, vnb vnbVar) {
        super(context);
        this.h = true;
        this.y = true;
        int i2 = 0;
        this.E = false;
        byte b = 11;
        this.I = (byte) 11;
        this.J = (byte) 72;
        this.K = (byte) 70;
        this.L = (byte) 76;
        this.M = (byte) 3;
        this.N = (byte) 11;
        this.V = 42.0f;
        gf3 gf3Var = new gf3(this);
        this.v0 = gf3Var;
        this.A0 = true;
        this.D0 = 0.0f;
        this.e1 = false;
        this.f1 = false;
        this.G1 = new v41(this);
        this.H1 = new Paint(1);
        this.I1 = new RectF();
        this.M1 = false;
        this.V1 = new boolean[3];
        this.W1 = new ImageReceiver[3];
        this.X1 = new boolean[3];
        this.Y1 = new boolean[3];
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.Z1 = imageReceiver;
        this.b2 = new rb0((vnb) null);
        this.e2 = new if3(0 == true ? 1 : 0);
        k43 k43Var = k43.h;
        this.n2 = new mm(this, 0L, 350L, k43Var);
        this.p2 = new mm(this, 0L, 350L, k43Var);
        this.j3 = new Stack();
        this.k3 = new ArrayList();
        this.l3 = new Stack();
        this.m3 = new ArrayList();
        this.M3 = true;
        this.T3 = new fm0(320L, this, k43Var);
        this.W3 = 1.0f;
        this.X3 = 1.0f;
        this.s4 = new RectF();
        this.y4 = -1;
        this.I4 = -1;
        this.J4 = new lf3(this);
        gf3Var.I = true;
        this.K4 = vnbVar;
        this.E4 = uj3Var;
        aob.S(context);
        this.E = false;
        this.F = false;
        imageReceiver.q0(hl.L(26.0f));
        while (true) {
            ImageReceiver[] imageReceiverArr = this.W1;
            if (i2 >= imageReceiverArr.length) {
                this.s2 = z;
                this.G0 = i;
                tb tbVar = new tb(b, context, this);
                this.n4 = tbVar;
                addView(tbVar);
                this.o4 = new ul(hl.L(22.0f), tbVar);
                this.p4 = new ul(hl.L(17.0f), this);
                this.Z1.A1 = true;
                return;
            }
            imageReceiverArr[i2] = new ImageReceiver(this);
            ImageReceiver imageReceiver2 = this.W1[i2];
            imageReceiver2.y = true;
            imageReceiver2.q0(hl.L(2.0f));
            this.W1[i2].A1 = true;
            i2++;
        }
    }

    public static SpannableStringBuilder Q(int i, CharSequence charSequence, CharSequence charSequence2) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (i == 1) {
            spannableStringBuilder.append(charSequence2).append((CharSequence) ": \u2068").append(charSequence).append((CharSequence) "\u2069");
            return spannableStringBuilder;
        }
        if (i == 2) {
            spannableStringBuilder.append((CharSequence) "\u2068").append(charSequence).append((CharSequence) "\u2069");
            return spannableStringBuilder;
        }
        if (i == 3) {
            spannableStringBuilder.append(charSequence2).append((CharSequence) ": ").append(charSequence);
            return spannableStringBuilder;
        }
        if (i != 4) {
            return spannableStringBuilder;
        }
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    private r47 getCaptionMessage() {
        CharSequence charSequence;
        if (this.h1 == null) {
            r47 r47Var = this.g1;
            if (r47Var == null || r47Var.z == null) {
                return null;
            }
            return r47Var;
        }
        int i = 0;
        r47 r47Var2 = null;
        for (int i2 = 0; i2 < this.h1.size(); i2++) {
            r47 r47Var3 = (r47) this.h1.get(i2);
            if (r47Var3 != null && (charSequence = r47Var3.z) != null) {
                if (!TextUtils.isEmpty(charSequence)) {
                    i++;
                }
                r47Var2 = r47Var3;
            }
        }
        if (i > 1) {
            return null;
        }
        return r47Var2;
    }

    private int getCollapsedHeight() {
        boolean z = this.s2;
        int L = hl.L((z || xea.l1) ? this.L : this.K) + 1;
        if (this.R) {
            L += hl.L(20.0f);
        }
        if (!U() || ((z || xea.l1) && !Y())) {
            return L;
        }
        return hl.L(Y() ? this.N : this.M) + L;
    }

    private Paint getPaintReorderGradient() {
        int v0 = aob.v0(aob.d6, this.K4);
        if (this.R4 != v0 || this.S4 == null) {
            this.R4 = v0;
            if (this.S4 == null) {
                this.S4 = new Paint(1);
            }
            this.S4.setShader(new LinearGradient(0.0f, 0.0f, hl.L(24.0f), 0.0f, new int[]{0, v0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
        }
        return this.S4;
    }

    private TextPaint getTimeTextPaint() {
        return this.H3 ? V() ? aob.I0 : aob.J0 : aob.H0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getTopicId() {
        TLRPC.TL_forumTopic tL_forumTopic = this.O;
        if (tL_forumTopic == null) {
            return 0;
        }
        return tL_forumTopic.id;
    }

    public final CharSequence A(CharSequence charSequence) {
        if (this.S1 <= 0) {
            return charSequence;
        }
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
        valueOf.insert(0, (CharSequence) " ");
        valueOf.setSpan(new mf3(hl.L(((this.M4 + 2) * this.S1) + 3)), 0, 1, 33);
        return valueOf;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(143:15|(1:17)|18|(1:2016)(1:24)|25|(1:2015)(1:29)|30|(1:32)|33|(1:2014)(1:37)|38|(1:40)|41|(1:43)(1:2007)|44|(7:46|(1:48)|49|50|(1:52)|53|54)(1:2006)|55|(1:57)(1:2005)|58|(9:60|(2:62|(2:974|(1:976)(1:977))(2:66|(1:68)(1:973)))(4:978|(1:995)(1:982)|983|(2:991|(1:993)(1:994))(2:987|(1:989)(1:990)))|69|(3:71|(1:73)(4:960|(1:962)|963|(1:968)(1:967))|74)(3:969|(1:971)|972)|75|(1:77)(1:959)|78|(1:80)(1:(1:957)(1:958))|81)(38:996|(2:2001|(1:2003)(1:2004))(2:1000|(1:1002)(1:2000))|1003|(1:(2:1006|(2:1014|(1:1016)(1:1017))(2:1010|(1:1012)(1:1013))))(1:(37:1920|(3:1922|(1:1924)(2:1931|(1:1933)(2:1934|(1:1936)(5:1937|(1:1949)(1:1941)|1942|(1:1948)(1:1946)|1947)))|1925)(2:1950|(8:1952|(1:1954)(2:1972|(1:1974)(12:1975|(2:1977|(2:1979|(6:1981|1956|(2:1958|(2:1960|(3:1964|1965|(2:1967|(1:1969)(1:1970)))))|1971|1965|(0)))(1:1997))(1:1998)|1982|(1:1996)(1:1986)|1987|(1:1995)(1:1993)|1994|1956|(0)|1971|1965|(0)))|1955|1956|(0)|1971|1965|(0))(1:1999))|1926|(1:1930)|1019|(1:1023)|1024|(6:1026|(1:1028)(1:1902)|1029|(1:1031)(1:1901)|1032|(1:1036))(2:1903|(5:1908|(1:1910)(1:1916)|1911|(1:1913)(1:1915)|1914)(1:1907))|1037|(27:1039|(1:(2:1044|(22:1046|(1:1048)|1050|1051|(11:1053|(1:1055)(1:1297)|1056|(3:(1:1059)|1060|(1:1062))|1063|(1:1065)(1:1296)|1066|(1:1068)(1:1295)|1069|(2:1071|(1:1074))|1075)(2:1298|(1:1300)(3:(6:1302|(1:1304)(1:1873)|1305|(1:1307)(1:1872)|(1:1309)(1:1871)|1310)(1:1874)|1311|(4:1819|(7:1835|(2:1863|(1:1865)(1:(2:1867|(1:1869))(1:1870)))(1:1839)|1840|(2:1842|(3:1846|(1:1848)(1:1850)|1849))(2:1860|(1:1862))|1851|(1:1859)(1:1855)|1856)(2:1825|(2:1834|1831)(1:1829))|1830|1831)(3:1315|(1:1317)(2:1319|(2:1321|(1:1323)(2:1324|(1:1326)(3:1327|(2:1329|(1:1331)(2:1332|(1:1334)(2:1335|(1:1337)(2:1338|(2:1340|(1:1342)(1:1343))))))(2:1345|(3:1349|(1:1355)(1:1353)|1354))|1344)))(12:1356|(1:1358)(1:1818)|1359|(2:1373|(2:1375|(9:1377|(8:1379|(1:1381)(3:1811|(1:1813)(1:1815)|1814)|(1:1383)(7:1394|(4:1396|(4:1398|(2:1400|(2:1402|(1:1404)(2:1408|(1:1410)(1:1411))))|1412|(1:1414)(2:1415|(1:1417)(2:1418|(1:1420)(1:1421))))(1:1422)|1405|1406)(2:1423|(8:1434|(1:(2:1449|(23:1480|(1:1810)(1:1488)|1489|(6:1564|(2:1566|(5:1568|(1:1570)|1803|(1:1805)|1807))|1809|1572|(8:1581|(2:1583|(5:1585|(4:1587|(1:1589)|1591|(2:1593|(1:1595)))|1596|1591|(0))(2:1597|(4:1604|(2:1606|(2:1611|(1:1613)(2:1614|(1:1616)(1:1617))))|1618|(2:1657|(3:1659|(2:1661|(1:1663)(1:1665))(2:1666|(1:1668)(1:1669))|1664)(2:1670|(3:1672|(3:(1:1675)(1:1679)|1676|1677)(3:1680|(1:1682)(1:1684)|1683)|1678)(5:1685|(5:1687|(2:1689|(3:1691|(1:1693)(1:1706)|1694))|1707|(0)(0)|1694)(2:1708|(1:1710)(2:1711|(2:1713|(1:1718)(1:1717))(2:1719|(2:1721|(1:1726)(1:1725))(2:1727|(1:1729)(2:1730|(1:1732)(2:1733|(1:1735)(2:1736|(3:1751|(4:1759|(1:1761)|1762|(2:1764|(3:1766|(1:1768)(1:1770)|1769)))(2:1755|(1:1757))|1758)(2:1740|(4:1742|(2:1744|(1:1746))(1:1749)|1747|1748)(1:1750)))))))))|1695|(2:1700|(2:1702|(1:1704)))|1699)))(4:1622|(1:1624)(2:1645|(1:1647)(2:1648|(1:1650)(2:1651|(2:1653|(1:1655)(1:1656)))))|1625|(3:1637|(3:1639|(1:1641)(1:1643)|1642)|1644)(4:1629|(1:1631)|(1:1635)|1636)))(1:1603)))|1771|(1:1773)(1:1802)|1774|(7:1776|(3:1793|(1:1795)|1796)(2:1780|(1:1782))|1783|(1:1785)(1:1792)|1786|(2:1788|(1:1790))|1791)|1797|(2:1799|(1:1801)))|1580)|1499|(1:1501)|1502|(2:1510|(16:1512|(1:1516)|1517|1518|1519|(1:1555)(5:1525|1526|1527|1528|1529)|1530|(1:1534)|1535|(4:1537|(1:1539)|1540|(1:1542)(1:1543))|1544|1442|1385|(1:1387)(2:1390|(1:1392)(2:1393|1389))|1388|1389))|1556|1518|1519|(2:1521|1551)|1555|1530|(2:1532|1534)|1535|(0)|1544|1442|1385|(0)(0)|1388|1389)(4:1455|(2:1457|(3:(1:1460)(1:1466)|1461|1462)(3:1467|(1:1469)(1:1471)|1470))(2:1472|(2:1477|(1:1479))(1:1476))|1463|(1:1465)))(1:1448))(1:1440)|1441|1442|1385|(0)(0)|1388|1389)(3:1427|(1:1433)(1:1431)|1432))|1407|1385|(0)(0)|1388|1389)|1384|1385|(0)(0)|1388|1389)|1816|(0)(0)|1384|1385|(0)(0)|1388|1389)))|1817|1816|(0)(0)|1384|1385|(0)(0)|1388|1389))|1318)))|1076|(3:1092|(1:1096)|1097)|1098|(10:1100|(1:1102)(2:1288|(1:1290)(2:1291|(1:1293)))|1103|(3:1279|(1:1287)(1:1285)|1286)(6:1107|(3:1109|(1:(1:1112)(1:1254))(1:1255)|1113)(9:1256|(1:1258)(2:1272|(1:1274)(2:1275|(1:1277)(1:1278)))|1259|(1:1261)(1:1271)|1262|(1:1264)(1:1270)|1265|(1:1267)(1:1269)|1268)|1114|(2:1119|(3:1121|(1:1123)(2:1214|(1:1216)(2:1217|(4:1219|(3:1221|(1:1223)(1:1227)|1224)(2:1228|(3:1230|(1:1242)(1:1234)|1235)(3:1243|(1:1251)(1:1249)|1250))|1225|1226)(1:1252)))|1124))|1253|1124)|1125|(2:1129|(1:1131)(1:(4:1133|(1:1135)|1136|(1:1138))))|1139|1140|(2:1143|(1:1145)(88:1146|(5:1148|(4:1150|(1:1152)|1153|(4:1155|1156|(1:1160)|1161))(2:1163|(4:1165|(1:1167)|1168|(1:1170)(1:1171))(4:1172|(1:1181)(3:1176|(1:1178)(1:1180)|1179)|(2:1158|1160)|1161))|1162|(0)|1161)(5:1182|(4:1184|(1:1186)(2:1187|(1:1189)(2:1190|(2:1204|(4:1206|(1:1208)|1209|(1:1211)(1:1212))(1:1213))(2:1194|(1:1196)(2:1197|(1:1199)(3:1200|(1:1202)|1203)))))|(0)|1161)|1156|(0)|1161)|83|(4:85|(1:87)(1:954)|88|(1:90)(1:953))(1:955)|91|(3:93|(1:95)(1:951)|96)(1:952)|97|(1:99)(1:950)|100|(3:102|(1:104)(1:106)|105)|107|(2:109|(1:111)(1:937))(2:938|(2:940|(2:942|(1:944)(1:945))(2:946|(1:948)(1:949))))|112|(1:936)(1:120)|121|(1:(4:899|(1:901)(2:905|(1:907))|902|(1:904))(2:908|(2:910|(1:912))(2:913|(2:915|(1:917))(2:918|(4:920|(2:922|(1:924)(1:928))(1:929)|925|(1:927))))))(4:125|(1:127)|128|(1:130))|131|(1:133)|134|135|136|(1:138)|139|(1:141)|142|(6:144|145|146|147|(1:149)(1:891)|150)(1:895)|151|(1:153)(1:890)|154|(1:156)|157|(1:889)(1:163)|164|(1:166)(1:888)|167|(1:887)(1:171)|172|173|(5:860|(1:862)(1:885)|863|(2:864|(5:866|(1:868)(1:882)|869|(2:880|881)(2:877|878)|879)(1:883))|884)(9:177|(1:179)(1:859)|180|181|(1:183)(1:858)|184|(1:186)(1:857)|187|(2:188|(5:190|(1:192)(1:206)|193|(2:204|205)(2:201|202)|203)(1:207)))|208|(1:210)(1:856)|211|(1:213)|214|(1:222)|223|(2:225|(1:227)(1:228))|229|(3:231|(1:233)(1:718)|234)(1:(7:753|(4:755|(1:757)(1:852)|758|759)(1:853)|(6:761|(1:763)(1:850)|764|(3:766|(1:768)(1:844)|769)(3:845|(1:847)(1:849)|848)|770|771)(1:851)|772|(2:774|(4:776|(3:778|(1:780)(1:782)|781)|783|(3:785|(1:787)(1:789)|788))(5:790|(3:792|(1:794)(1:796)|795)|797|(3:799|(1:801)(1:803)|802)|804))|805|(2:807|(6:809|(1:811)|812|(3:814|(1:816)(1:818)|817)|819|(3:821|(1:823)(1:825)|824))(7:826|(1:828)|829|(3:831|(1:833)(1:835)|834)|836|(3:838|(1:840)(1:842)|841)|843)))(2:725|(1:752)(6:737|(1:751)(2:741|(1:743)(1:750))|744|(1:746)(1:749)|747|748)))|235|(1:717)(1:255)|256|(14:258|(1:284)(1:262)|263|(1:267)|268|(1:270)|271|(1:273)|274|(1:276)|277|(1:279)(1:283)|280|(1:282))|(7:(1:287)|288|(1:290)|291|(1:304)(1:295)|296|(1:300))|305|(1:716)(1:309)|310|(3:316|(1:318)(1:320)|319)|321|(3:(1:651)(1:326)|327|(2:328|(1:330)(1:331)))(1:(16:678|679|(2:683|(12:685|686|687|688|689|690|691|692|693|(1:703)(1:697)|698|(2:699|(1:701)(1:702))))|712|686|687|688|689|690|691|692|693|(1:695)|703|698|(3:699|(0)(0)|701))(2:655|(4:660|(1:670)(1:664)|665|(2:666|(1:668)(1:669)))(1:659)))|332|(1:334)|335|336|337|(1:339)(1:649)|340|341|342|343|(2:345|(1:361)(6:349|350|351|352|353|354))|362|363|(4:615|616|(3:618|(2:641|642)|639)|643)|365|(2:613|614)(5:369|(3:603|(1:605)|380)|373|(1:599)(1:379)|380)|381|(8:582|(2:585|586)|587|588|589|(1:591)(1:595)|592|593)(6:385|(2:387|(1:391))|392|393|394|395)|396|397|398|399|400|(9:(8:405|(1:407)|408|(1:410)|411|(1:453)(1:(2:447|(1:449)(1:450))(2:422|(1:424)(2:430|(1:432)(2:433|(3:435|(1:(1:438)(1:440))(1:441)|439)(1:442)))))|425|(2:427|(1:429)))|454|(3:458|(1:(1:467)(2:460|(1:462)(2:463|464)))|(1:466))|468|(3:472|(1:(1:481)(2:474|(1:476)(2:477|478)))|(1:480))|482|(2:488|(1:490))|491|(4:495|(1:497)|498|499))(9:(8:520|(1:522)|523|(4:525|(1:527)|528|(1:530))|531|(1:533)|534|(1:536)(2:537|(1:539)))|540|(4:544|(1:546)|547|548)|549|(4:553|(1:555)|556|557)|558|(4:562|(1:564)|565|566)|567|(1:571))|500|(3:(1:514)(1:509)|510|(1:512)(1:513))|515|516))|1142)|1294|1103|(1:1105)|1279|(1:1281)|1287|1286|1125|(3:1127|1129|(0)(0))|1139|1140|(0)|1142)))|1875|(2:1877|(2:1879|(22:1881|(1:1883)|1050|1051|(0)(0)|1076|(10:1078|1080|1082|1084|1086|1088|1090|1092|(2:1094|1096)|1097)|1098|(0)|1294|1103|(0)|1279|(0)|1287|1286|1125|(0)|1139|1140|(0)|1142)))|1885|(22:1887|(1:1889)|1050|1051|(0)(0)|1076|(0)|1098|(0)|1294|1103|(0)|1279|(0)|1287|1286|1125|(0)|1139|1140|(0)|1142)|1891|(1:1893)|1051|(0)(0)|1076|(0)|1098|(0)|1294|1103|(0)|1279|(0)|1287|1286|1125|(0)|1139|1140|(0)|1142)|1895|(2:1897|(1:1899))|1875|(0)|1885|(0)|1891|(0)|1051|(0)(0)|1076|(0)|1098|(0)|1294|1103|(0)|1279|(0)|1287|1286|1125|(0)|1139|1140|(0)|1142))|1018|1019|(2:1021|1023)|1024|(0)(0)|1037|(0)|1895|(0)|1875|(0)|1885|(0)|1891|(0)|1051|(0)(0)|1076|(0)|1098|(0)|1294|1103|(0)|1279|(0)|1287|1286|1125|(0)|1139|1140|(0)|1142)|82|83|(0)(0)|91|(0)(0)|97|(0)(0)|100|(0)|107|(0)(0)|112|(1:114)|930|932|936|121|(1:123)|(0)(0)|131|(0)|134|135|136|(0)|139|(0)|142|(0)(0)|151|(0)(0)|154|(0)|157|(1:159)|889|164|(0)(0)|167|(1:169)|887|172|173|(1:175)|860|(0)(0)|863|(3:864|(0)(0)|879)|884|208|(0)(0)|211|(0)|214|(68:216|218|220|222|223|(0)|229|(0)(0)|235|(1:237)|717|256|(0)|(0)|305|(1:307)|716|310|(49:312|314|316|(0)(0)|319|321|(0)(0)|332|(0)|335|336|337|(0)(0)|340|341|342|343|(0)|362|363|(0)|365|(1:367)|607|609|611|613|614|381|(1:383)|580|582|(2:585|586)|587|588|589|(0)(0)|592|593|396|397|398|399|400|(0)(0)|500|(6:502|504|(1:507)|514|510|(0)(0))|515|516)|714|314|316|(0)(0)|319|321|(0)(0)|332|(0)|335|336|337|(0)(0)|340|341|342|343|(0)|362|363|(0)|365|(0)|607|609|611|613|614|381|(0)|580|582|(0)|587|588|589|(0)(0)|592|593|396|397|398|399|400|(0)(0)|500|(0)|515|516)|854|218|220|222|223|(0)|229|(0)(0)|235|(0)|717|256|(0)|(0)|305|(0)|716|310|(0)|714|314|316|(0)(0)|319|321|(0)(0)|332|(0)|335|336|337|(0)(0)|340|341|342|343|(0)|362|363|(0)|365|(0)|607|609|611|613|614|381|(0)|580|582|(0)|587|588|589|(0)(0)|592|593|396|397|398|399|400|(0)(0)|500|(0)|515|516) */
    /* JADX WARN: Can't wrap try/catch for region: R(15:(2:678|679)|(2:683|(12:685|686|687|688|689|690|691|692|693|(1:703)(1:697)|698|(2:699|(1:701)(1:702))))|712|686|687|688|689|690|691|692|693|(1:695)|703|698|(3:699|(0)(0)|701)) */
    /* JADX WARN: Can't wrap try/catch for region: R(16:678|679|(2:683|(12:685|686|687|688|689|690|691|692|693|(1:703)(1:697)|698|(2:699|(1:701)(1:702))))|712|686|687|688|689|690|691|692|693|(1:695)|703|698|(3:699|(0)(0)|701)) */
    /* JADX WARN: Code restructure failed: missing block: B:1049:0x062d, code lost:
    
        if (r3.reply_to_msg_id == 0) goto L317;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1571:0x0b2c, code lost:
    
        if (r42.id == r14) goto L574;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1590:0x0b81, code lost:
    
        if (r51.Q != false) goto L594;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1705:0x0f5f, code lost:
    
        if (r47.O2(r51.g1.k.rich_message.blocks.get(0)) != false) goto L773;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1806:0x0b3a, code lost:
    
        if (xc2.n0(r51.h2) == false) goto L574;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1808:0x0b42, code lost:
    
        if (ro4.l(r51.g1) != false) goto L574;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1884:0x0653, code lost:
    
        if (r2.post_messages == false) goto L317;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1890:0x065f, code lost:
    
        if (r2.kicked != false) goto L317;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1894:0x0669, code lost:
    
        if (r51.Q == false) goto L317;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1900:0x0639, code lost:
    
        if (r51.T0 != 0) goto L317;
     */
    /* JADX WARN: Code restructure failed: missing block: B:573:0x24eb, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:596:0x2481, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:597:0x2482, code lost:
    
        r8 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:606:0x23f6, code lost:
    
        if (xc2.g(r51.G0, r51.h2) != false) goto L1756;
     */
    /* JADX WARN: Code restructure failed: missing block: B:645:0x24f3, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:646:0x24f4, code lost:
    
        r14 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:647:0x235d, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:706:0x220c, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:707:0x220d, code lost:
    
        r8 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:708:0x220f, code lost:
    
        r2 = r42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:709:0x2215, code lost:
    
        cc4.f(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:710:0x2212, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:896:0x1a48, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:897:0x1a49, code lost:
    
        r32 = 36.0f;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:1026:0x059a  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x17a0  */
    /* JADX WARN: Removed duplicated region for block: B:1039:0x0613  */
    /* JADX WARN: Removed duplicated region for block: B:1053:0x0679  */
    /* JADX WARN: Removed duplicated region for block: B:1078:0x12d3  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x17bd  */
    /* JADX WARN: Removed duplicated region for block: B:1100:0x134e  */
    /* JADX WARN: Removed duplicated region for block: B:1105:0x1378  */
    /* JADX WARN: Removed duplicated region for block: B:1127:0x150f  */
    /* JADX WARN: Removed duplicated region for block: B:1131:0x1520  */
    /* JADX WARN: Removed duplicated region for block: B:1132:0x1529  */
    /* JADX WARN: Removed duplicated region for block: B:1143:0x1567  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x185c  */
    /* JADX WARN: Removed duplicated region for block: B:1158:0x16c8  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x1880  */
    /* JADX WARN: Removed duplicated region for block: B:1281:0x14da  */
    /* JADX WARN: Removed duplicated region for block: B:1298:0x0704  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x1947  */
    /* JADX WARN: Removed duplicated region for block: B:1383:0x097e  */
    /* JADX WARN: Removed duplicated region for block: B:1387:0x11b5  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x195b  */
    /* JADX WARN: Removed duplicated region for block: B:1390:0x11c5  */
    /* JADX WARN: Removed duplicated region for block: B:1394:0x0983  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x1960 A[Catch: Exception -> 0x1a48, TryCatch #10 {Exception -> 0x1a48, blocks: (B:136:0x1952, B:139:0x195c, B:141:0x1960, B:142:0x196a, B:144:0x196e), top: B:135:0x1952 }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x196e A[Catch: Exception -> 0x1a48, TRY_LEAVE, TryCatch #10 {Exception -> 0x1a48, blocks: (B:136:0x1952, B:139:0x195c, B:141:0x1960, B:142:0x196a, B:144:0x196e), top: B:135:0x1952 }] */
    /* JADX WARN: Removed duplicated region for block: B:1532:0x1141  */
    /* JADX WARN: Removed duplicated region for block: B:1537:0x1152  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x19a9  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x19b2 A[Catch: Exception -> 0x1a46, TryCatch #11 {Exception -> 0x1a46, blocks: (B:147:0x1976, B:150:0x198a, B:151:0x1996, B:154:0x19ac, B:156:0x19b2, B:157:0x19be, B:159:0x19d1, B:161:0x19d7, B:164:0x19e8, B:166:0x19ec, B:167:0x1a26, B:169:0x1a2a, B:171:0x1a31, B:172:0x1a3a, B:888:0x1a05), top: B:146:0x1976 }] */
    /* JADX WARN: Removed duplicated region for block: B:1593:0x0b8f  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x19d1 A[Catch: Exception -> 0x1a46, TryCatch #11 {Exception -> 0x1a46, blocks: (B:147:0x1976, B:150:0x198a, B:151:0x1996, B:154:0x19ac, B:156:0x19b2, B:157:0x19be, B:159:0x19d1, B:161:0x19d7, B:164:0x19e8, B:166:0x19ec, B:167:0x1a26, B:169:0x1a2a, B:171:0x1a31, B:172:0x1a3a, B:888:0x1a05), top: B:146:0x1976 }] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x19ec A[Catch: Exception -> 0x1a46, TryCatch #11 {Exception -> 0x1a46, blocks: (B:147:0x1976, B:150:0x198a, B:151:0x1996, B:154:0x19ac, B:156:0x19b2, B:157:0x19be, B:159:0x19d1, B:161:0x19d7, B:164:0x19e8, B:166:0x19ec, B:167:0x1a26, B:169:0x1a2a, B:171:0x1a31, B:172:0x1a3a, B:888:0x1a05), top: B:146:0x1976 }] */
    /* JADX WARN: Removed duplicated region for block: B:1693:0x0d81  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x1a2a A[Catch: Exception -> 0x1a46, TryCatch #11 {Exception -> 0x1a46, blocks: (B:147:0x1976, B:150:0x198a, B:151:0x1996, B:154:0x19ac, B:156:0x19b2, B:157:0x19be, B:159:0x19d1, B:161:0x19d7, B:164:0x19e8, B:166:0x19ec, B:167:0x1a26, B:169:0x1a2a, B:171:0x1a31, B:172:0x1a3a, B:888:0x1a05), top: B:146:0x1976 }] */
    /* JADX WARN: Removed duplicated region for block: B:1706:0x0d85  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x1a6c  */
    /* JADX WARN: Removed duplicated region for block: B:1877:0x0643  */
    /* JADX WARN: Removed duplicated region for block: B:1887:0x0659  */
    /* JADX WARN: Removed duplicated region for block: B:1893:0x0667  */
    /* JADX WARN: Removed duplicated region for block: B:1897:0x0633  */
    /* JADX WARN: Removed duplicated region for block: B:1903:0x05d6  */
    /* JADX WARN: Removed duplicated region for block: B:1958:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:1967:0x0542  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x1c95  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x1cc1  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x1cce  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x1cfa  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x1d22  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x204c  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x2085  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x210f  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x2163  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x2176  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x218e  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x2191  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x21a2  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x2284  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x22a3 A[Catch: Exception -> 0x22f2, TryCatch #7 {Exception -> 0x22f2, blocks: (B:337:0x229d, B:339:0x22a3, B:649:0x22ef), top: B:336:0x229d }] */
    /* JADX WARN: Removed duplicated region for block: B:345:0x2308 A[Catch: Exception -> 0x235d, TryCatch #8 {Exception -> 0x235d, blocks: (B:343:0x2302, B:345:0x2308, B:347:0x230c, B:349:0x2330, B:354:0x2356, B:359:0x2310, B:361:0x2316), top: B:342:0x2302 }] */
    /* JADX WARN: Removed duplicated region for block: B:367:0x23b7 A[Catch: Exception -> 0x24b7, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x24b7, blocks: (B:616:0x2365, B:618:0x2377, B:620:0x237d, B:622:0x2381, B:624:0x2389, B:626:0x238f, B:628:0x2393, B:630:0x2397, B:632:0x239b, B:634:0x239f, B:636:0x23a3, B:641:0x23ad, B:367:0x23b7, B:371:0x23da, B:375:0x23fe, B:377:0x2402, B:379:0x2415, B:383:0x2449, B:387:0x248c, B:389:0x249d, B:391:0x24a3, B:582:0x2453, B:585:0x2459, B:603:0x23e6, B:605:0x23ee, B:609:0x23c1, B:611:0x23c5, B:613:0x23ca), top: B:615:0x2365 }] */
    /* JADX WARN: Removed duplicated region for block: B:383:0x2449 A[Catch: Exception -> 0x24b7, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x24b7, blocks: (B:616:0x2365, B:618:0x2377, B:620:0x237d, B:622:0x2381, B:624:0x2389, B:626:0x238f, B:628:0x2393, B:630:0x2397, B:632:0x239b, B:634:0x239f, B:636:0x23a3, B:641:0x23ad, B:367:0x23b7, B:371:0x23da, B:375:0x23fe, B:377:0x2402, B:379:0x2415, B:383:0x2449, B:387:0x248c, B:389:0x249d, B:391:0x24a3, B:582:0x2453, B:585:0x2459, B:603:0x23e6, B:605:0x23ee, B:609:0x23c1, B:611:0x23c5, B:613:0x23ca), top: B:615:0x2365 }] */
    /* JADX WARN: Removed duplicated region for block: B:402:0x2511  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x2836  */
    /* JADX WARN: Removed duplicated region for block: B:512:0x2875  */
    /* JADX WARN: Removed duplicated region for block: B:513:0x287b  */
    /* JADX WARN: Removed duplicated region for block: B:517:0x2732  */
    /* JADX WARN: Removed duplicated region for block: B:584:0x2457 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:591:0x246d  */
    /* JADX WARN: Removed duplicated region for block: B:595:0x2470  */
    /* JADX WARN: Removed duplicated region for block: B:615:0x2365 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:649:0x22ef A[Catch: Exception -> 0x22f2, TRY_LEAVE, TryCatch #7 {Exception -> 0x22f2, blocks: (B:337:0x229d, B:339:0x22a3, B:649:0x22ef), top: B:336:0x229d }] */
    /* JADX WARN: Removed duplicated region for block: B:652:0x21c3  */
    /* JADX WARN: Removed duplicated region for block: B:695:0x2224  */
    /* JADX WARN: Removed duplicated region for block: B:701:0x2234 A[LOOP:12: B:699:0x222f->B:701:0x2234, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:702:0x2280 A[EDGE_INSN: B:702:0x2280->B:332:0x2280 BREAK  A[LOOP:12: B:699:0x222f->B:701:0x2234], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:719:0x1d5a  */
    /* JADX WARN: Removed duplicated region for block: B:856:0x1cac  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x16e2  */
    /* JADX WARN: Removed duplicated region for block: B:862:0x1be1  */
    /* JADX WARN: Removed duplicated region for block: B:866:0x1c46  */
    /* JADX WARN: Removed duplicated region for block: B:883:0x1c8e A[EDGE_INSN: B:883:0x1c8e->B:884:0x1c8e BREAK  A[LOOP:13: B:864:0x1c41->B:879:0x1c7a], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:885:0x1c02  */
    /* JADX WARN: Removed duplicated region for block: B:888:0x1a05 A[Catch: Exception -> 0x1a46, TryCatch #11 {Exception -> 0x1a46, blocks: (B:147:0x1976, B:150:0x198a, B:151:0x1996, B:154:0x19ac, B:156:0x19b2, B:157:0x19be, B:159:0x19d1, B:161:0x19d7, B:164:0x19e8, B:166:0x19ec, B:167:0x1a26, B:169:0x1a2a, B:171:0x1a31, B:172:0x1a3a, B:888:0x1a05), top: B:146:0x1976 }] */
    /* JADX WARN: Removed duplicated region for block: B:890:0x19ab  */
    /* JADX WARN: Removed duplicated region for block: B:895:0x1994  */
    /* JADX WARN: Removed duplicated region for block: B:899:0x18ac  */
    /* JADX WARN: Removed duplicated region for block: B:908:0x18e1  */
    /* JADX WARN: Removed duplicated region for block: B:938:0x17e7  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x1742  */
    /* JADX WARN: Removed duplicated region for block: B:950:0x1781  */
    /* JADX WARN: Removed duplicated region for block: B:952:0x176c  */
    /* JADX WARN: Removed duplicated region for block: B:955:0x1732  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x1771  */
    /* JADX WARN: Type inference failed for: r0v689 */
    /* JADX WARN: Type inference failed for: r0v690 */
    /* JADX WARN: Type inference failed for: r0v99, types: [android.graphics.drawable.Drawable[]] */
    /* JADX WARN: Type inference failed for: r12v31, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r4v25, types: [android.text.StaticLayout] */
    /* JADX WARN: Type inference failed for: r51v0, types: [android.view.View, of3] */
    /* JADX WARN: Type inference failed for: r5v243, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r5v244, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r6v113, types: [android.graphics.drawable.Drawable[]] */
    /* JADX WARN: Type inference failed for: r6v120 */
    /* JADX WARN: Type inference failed for: r6v225 */
    /* JADX WARN: Type inference failed for: r6v226 */
    /* JADX WARN: Type inference failed for: r6v227 */
    /* JADX WARN: Type inference failed for: r6v228 */
    /* JADX WARN: Type inference failed for: r7v127, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r7v129, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r9v55, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r9v65, types: [android.text.SpannableStringBuilder] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void C() {
        int i;
        float f;
        float f2;
        boolean z;
        char c;
        String str;
        CharSequence charSequence;
        long j;
        boolean z2;
        int i2;
        TLRPC.DraftMessage draftMessage;
        TLRPC.Chat chat;
        String str2;
        boolean z3;
        CharSequence charSequence2;
        int i3;
        String str3;
        String L0;
        CharSequence charSequence3;
        boolean z4;
        ArrayList<TLRPC.MessageEntity> arrayList;
        TL_iv.RichMessage richMessage;
        int i4;
        boolean z5;
        CharSequence charSequence4;
        CharSequence charSequence5;
        CharSequence charSequence6;
        TLRPC.Chat M0;
        TLRPC.Chat chat2;
        String str4;
        boolean z6;
        r47 r47Var;
        String str5;
        CharSequence charSequence7;
        CharSequence charSequence8;
        CharSequence J2;
        CharSequence charSequence9;
        char c2;
        String str6;
        CharSequence charSequence10;
        boolean V;
        char c3;
        int i5;
        String G;
        CharSequence charSequence11;
        r47 r47Var2;
        TLRPC.Message message;
        String str7;
        int i6;
        CharSequence l;
        CharSequence charSequence12;
        CharSequence v1;
        ho4 ho4Var;
        TLRPC.User user;
        r47 r47Var3;
        TLRPC.User user2;
        CharSequence charSequence13;
        CharSequence O;
        String str8;
        String str9;
        String str10;
        String str11;
        CharSequence charSequence14;
        String str12;
        TLRPC.TL_messageReactions tL_messageReactions;
        ArrayList<TLRPC.MessagePeerReaction> arrayList2;
        CharSequence Z;
        String str13;
        r47 r47Var4;
        boolean z7;
        String str14;
        String str15;
        uc7 s1;
        String str16;
        String str17;
        String str18;
        CharSequence U;
        CharSequence charSequence15;
        String str19;
        int i7;
        CharSequence charSequence16;
        CharSequence charSequence17;
        CharSequence charSequence18;
        String str20;
        String str21;
        CharSequence k;
        CharSequence charSequence19;
        int i8;
        boolean z8;
        String str22;
        String str23;
        String str24;
        String str25;
        boolean z9;
        boolean z10;
        r47 r47Var5;
        TLRPC.Message message2;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        r47 r47Var6;
        int i9;
        int i10;
        int x;
        byte b;
        boolean z11;
        float f3;
        float f4;
        float f5;
        float f6;
        int L;
        int L2;
        int L3;
        int i11;
        ImageReceiver[] imageReceiverArr;
        int i12;
        int i13;
        lyc lycVar;
        float f7;
        boolean z12;
        int max;
        boolean Y;
        int L4;
        int i14;
        ImageReceiver[] imageReceiverArr2;
        r47 r47Var7;
        CharSequence charSequence20;
        byte b2;
        StaticLayout staticLayout;
        boolean z13;
        int lineCount;
        int lineCount2;
        int lineCount3;
        StaticLayout staticLayout2;
        float primaryHorizontal;
        float primaryHorizontal2;
        int i15;
        int lineCount4;
        int lineCount5;
        int lineCount6;
        CharSequence charSequence21;
        CharSequence charSequence22;
        CharSequence charSequence23;
        CharSequence v12;
        r47 r47Var8;
        lyc lycVar2;
        float f8;
        int L5;
        int L6;
        lyc lycVar3;
        int L7;
        StaticLayout staticLayout3;
        CharSequence v13;
        boolean z14;
        CharSequence charSequence24;
        String str26;
        SpannableStringBuilder Q;
        if (this.k0) {
            return;
        }
        if (this.O0 && !this.J4.a() && this.K0 == 0 && this.L0 == 0 && this.i2 == null) {
            return;
        }
        if (!this.s2) {
            boolean z15 = xea.a;
        }
        aob.A0[0].setTextSize(hl.L(17.0f));
        aob.B0[0].setTextSize(hl.L(17.0f));
        aob.E0[0].setTextSize(hl.L(16.0f));
        aob.G0[0].setTextSize(hl.L(16.0f));
        boolean z16 = true;
        aob.A0[1].setTextSize(hl.L(16.0f));
        aob.B0[1].setTextSize(hl.L(16.0f));
        aob.E0[1].setTextSize(hl.L(15.0f));
        aob.G0[1].setTextSize(hl.L(15.0f));
        TextPaint textPaint = aob.E0[1];
        int v0 = aob.v0(aob.i9, this.K4);
        textPaint.linkColor = v0;
        textPaint.setColor(v0);
        this.F0 = true;
        this.M4 = (byte) 18;
        this.N0 = 0;
        String str27 = null;
        CharSequence C1 = (Y() || !(this.O0 || this.Q)) ? null : uc7.s1(this.G0).C1(this.I0, getTopicId(), true);
        this.b0 = aob.E0[this.F0 ? 1 : 0];
        this.H2 = false;
        this.k4 = false;
        this.l4 = false;
        this.m4 = false;
        this.y0 = false;
        this.z0 = false;
        this.q4 = (byte) 0;
        this.A3 = false;
        this.S1 = 0;
        this.T1 = false;
        this.E2 = false;
        boolean z17 = (lbc.D(this.g2) || this.v2) ? false : true;
        this.k2 = -1;
        if (!Y()) {
            this.i3 = null;
        }
        setOpenBotButton(false);
        if ((this.s2 || xea.l1) && this.K0 == 0 && !Y() && !U()) {
            this.a0 = false;
            i = 2;
        } else {
            this.a0 = true;
            i = 1;
        }
        r47 r47Var9 = this.g1;
        if (r47Var9 != null) {
            r47Var9.f6(false);
        }
        r47 r47Var10 = this.g1;
        CharSequence charSequence25 = r47Var10 != null ? r47Var10.v : null;
        if (charSequence25 instanceof Spannable) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence25);
            f2 = 16.0f;
            f = 17.0f;
            for (g8c g8cVar : (g8c[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), g8c.class)) {
                spannableStringBuilder.removeSpan(g8cVar);
            }
            for (f8c f8cVar : (f8c[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), f8c.class)) {
                spannableStringBuilder.removeSpan(f8cVar);
            }
            charSequence25 = spannableStringBuilder;
        } else {
            f = 17.0f;
            f2 = 16.0f;
        }
        this.j1 = charSequence25;
        if (this.G) {
            this.A3 = true;
            z = false;
            z17 = false;
        } else {
            z = true;
        }
        jf3 jf3Var = this.H0;
        boolean z18 = z;
        if (jf3Var != null) {
            if (jf3Var.g == 2) {
                this.H2 = true;
                if (this.s2 || xea.l1) {
                    this.L2 = hl.L(12.5f);
                    if (ob6.a0) {
                        this.K2 = (getMeasuredWidth() - hl.L(this.J + 6)) - aob.Z0.getIntrinsicWidth();
                        this.y2 = hl.L(22.0f);
                    } else {
                        this.K2 = hl.L(this.J + 6);
                        this.y2 = aob.Z0.getIntrinsicWidth() + hl.L(this.J + 10);
                    }
                } else {
                    this.L2 = hl.L(16.5f);
                    if (ob6.a0) {
                        this.K2 = (getMeasuredWidth() - hl.L(this.J + 4)) - aob.Z0.getIntrinsicWidth();
                        this.y2 = hl.L(18.0f);
                    } else {
                        this.K2 = hl.L(this.J + 4);
                        this.y2 = aob.Z0.getIntrinsicWidth() + hl.L(this.J + 8);
                    }
                }
            } else {
                this.k4 = !this.o1 && jf3Var.i;
                if (this.s2 || xea.l1) {
                    if (ob6.a0) {
                        this.y2 = hl.L(22.0f);
                    } else {
                        this.y2 = hl.L(this.J + 6);
                    }
                } else if (ob6.a0) {
                    this.y2 = hl.L(18.0f);
                } else {
                    this.y2 = hl.L(this.J + 4);
                }
            }
            jf3 jf3Var2 = this.H0;
            if (jf3Var2.g == 1) {
                L0 = ob6.L0(2131750464);
                jf3 jf3Var3 = this.H0;
                if (jf3Var3.j) {
                    this.b0 = aob.G0[this.F0 ? 1 : 0];
                    Q = Q(i, this.g1.v, null);
                    Q.setSpan(new ho4(aob.o9, this.K4), 0, Q.length(), 33);
                } else {
                    String str28 = jf3Var3.b;
                    if (str28.length() > 150) {
                        str28 = str28.substring(0, jn7.f2);
                    }
                    Q = (this.s2 || xea.l1) ? Q(i, str28, L0) : Q(i, str28.replace('\n', ' '), L0);
                }
                CharSequence l2 = pv3.l(Q, aob.E0[this.F0 ? 1 : 0].getFontMetricsInt(), false);
                z14 = false;
                charSequence24 = l2;
            } else {
                String str29 = jf3Var2.b;
                if (jf3Var2.j) {
                    this.b0 = aob.G0[this.F0 ? 1 : 0];
                }
                z14 = true;
                L0 = null;
                charSequence24 = str29;
            }
            c = '\n';
            str16 = ob6.e1(this.H0.h);
            byte b3 = this.H0.d;
            if (b3 != 0) {
                this.H3 = true;
                str26 = String.format("%d", Integer.valueOf(b3));
            } else {
                this.H3 = false;
                str26 = null;
            }
            jf3 jf3Var4 = this.H0;
            int i16 = jf3Var4.k;
            if (i16 == 2) {
                this.R2 = true;
                this.S2 = true;
                this.T2 = false;
            } else if (i16 == 1) {
                this.R2 = false;
                this.S2 = true;
                this.T2 = false;
            } else {
                this.T2 = false;
                this.R2 = false;
                this.S2 = false;
            }
            this.u3 = false;
            charSequence16 = jf3Var4.a;
            charSequence19 = charSequence24;
            z16 = z14;
            str20 = str26;
            str19 = null;
            str3 = null;
            z5 = z18;
            charSequence15 = "";
            i7 = -1;
        } else {
            c = '\n';
            if (this.s2 || xea.l1) {
                if (ob6.a0) {
                    this.y2 = hl.L(22.0f);
                } else {
                    this.y2 = hl.L(this.J + 6);
                }
            } else if (ob6.a0) {
                this.y2 = hl.L(18.0f);
            } else {
                this.y2 = hl.L(this.J + 4);
            }
            TLRPC.EncryptedChat encryptedChat = this.i2;
            int i17 = this.K0;
            if (encryptedChat != null) {
                if (i17 == 0) {
                    this.H2 = true;
                    if (this.s2 || xea.l1) {
                        this.L2 = hl.L(12.5f);
                        if (ob6.a0) {
                            this.K2 = (getMeasuredWidth() - hl.L(this.J + 6)) - aob.Z0.getIntrinsicWidth();
                            this.y2 = hl.L(22.0f);
                        } else {
                            this.K2 = hl.L(this.J + 6);
                            this.y2 = aob.Z0.getIntrinsicWidth() + hl.L(this.J + 10);
                        }
                    } else {
                        this.L2 = hl.L(16.5f);
                        if (ob6.a0) {
                            this.K2 = (getMeasuredWidth() - hl.L(this.J + 4)) - aob.Z0.getIntrinsicWidth();
                            this.y2 = hl.L(18.0f);
                        } else {
                            this.K2 = hl.L(this.J + 4);
                            this.y2 = aob.Z0.getIntrinsicWidth() + hl.L(this.J + 8);
                        }
                    }
                }
            } else if (i17 == 0 && !this.Q) {
                TLRPC.Chat chat3 = this.h2;
                if (chat3 != null) {
                    long c4 = wf3.c(chat3);
                    TLRPC.Chat chat4 = this.h2;
                    if (chat4.scam) {
                        this.q4 = (byte) 1;
                        aob.f1.a();
                    } else if (chat4.fake) {
                        this.q4 = (byte) 2;
                        aob.g1.a();
                    } else if (wf3.f(chat4.emoji_status) != 0) {
                        this.m4 = true;
                        this.E2 = true;
                        ul ulVar = this.o4;
                        ulVar.a = ob6.a0;
                        ulVar.j(wf3.f(this.h2.emoji_status), false);
                        this.o4.m(wf3.A(this.h2.emoji_status), false);
                    } else {
                        boolean z19 = this.o1;
                        this.k4 = !z19 && this.h2.verified;
                        this.l4 = (z19 || this.h2.bot_verification_icon == 0) ? false : true;
                    }
                    charSequence = charSequence25;
                    j = c4;
                    str = "%d";
                } else {
                    TLRPC.User user3 = this.g2;
                    if (user3 != null) {
                        j = wf3.c(user3);
                        TLRPC.User user4 = this.g2;
                        if (user4.scam) {
                            this.q4 = (byte) 1;
                            aob.f1.a();
                        } else if (user4.fake) {
                            this.q4 = (byte) 2;
                            aob.g1.a();
                        } else {
                            if (this.i2 == null) {
                                charSequence = charSequence25;
                                if (wf3.B(this.I0)) {
                                    str = "%d";
                                } else {
                                    str = "%d";
                                    if (uc7.s1(this.G0).r2(this.g2.id)) {
                                        this.q4 = (byte) 3;
                                        aob.h1.a();
                                        if (this.q4 != 3) {
                                            uc7.s1(this.G0);
                                            if (uc7.F2(this.g2)) {
                                                long j2 = yac.h(this.G0).n;
                                                long j3 = this.g2.id;
                                                if (j2 != j3 && j3 != 0) {
                                                    z2 = true;
                                                    this.m4 = z2;
                                                    if (z2) {
                                                        Long i18 = lbc.i(this.g2);
                                                        ul ulVar2 = this.o4;
                                                        ulVar2.a = ob6.a0;
                                                        if (i18 != null) {
                                                            this.E2 = true;
                                                            ulVar2.j(i18.longValue(), false);
                                                            this.o4.m(wf3.A(this.g2.emoji_status), false);
                                                        } else {
                                                            this.E2 = true;
                                                            ulVar2.g(bl8.d().e, false);
                                                            this.o4.m(false, false);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        z2 = false;
                                        this.m4 = z2;
                                        if (z2) {
                                        }
                                    }
                                }
                            } else {
                                str = "%d";
                                charSequence = charSequence25;
                            }
                            boolean z20 = this.o1;
                            this.k4 = !z20 && this.g2.verified;
                            this.l4 = (z20 || lbc.D(this.g2) || this.g2.bot_verification_icon == 0) ? false : true;
                            if (this.q4 != 3) {
                            }
                            z2 = false;
                            this.m4 = z2;
                            if (z2) {
                            }
                        }
                        str = "%d";
                        charSequence = charSequence25;
                        if (this.q4 != 3) {
                        }
                        z2 = false;
                        this.m4 = z2;
                        if (z2) {
                        }
                    } else {
                        str = "%d";
                        charSequence = charSequence25;
                        j = 0;
                    }
                }
                if (j != 0 && this.l4) {
                    this.p4.j(j, false);
                }
                i2 = this.S0;
                if (i2 == 0 && (r47Var6 = this.g1) != null) {
                    i2 = r47Var6.k.date;
                }
                if (!this.Q) {
                    boolean z21 = ls6.d0(this.G0).U(this.I0, (long) getTopicId()) != null;
                    this.l2 = z21;
                    TLRPC.DraftMessage T = !z21 ? ls6.d0(this.G0).T(this.I0, getTopicId()) : null;
                    this.m2 = T;
                    if (T != null && TextUtils.isEmpty(T.message)) {
                        this.m2 = null;
                    }
                } else if (this.O0 || this.t0) {
                    boolean z22 = ls6.d0(this.G0).U(this.I0, (long) getTopicId()) != null;
                    this.l2 = z22;
                    this.m2 = !z22 ? ls6.d0(this.G0).T(this.I0, 0L) : null;
                } else {
                    this.l2 = false;
                    this.m2 = null;
                }
                if (!this.l2) {
                    TLRPC.DraftMessage draftMessage2 = this.m2;
                    if (draftMessage2 != null) {
                        if (draftMessage2 != null && TextUtils.isEmpty(draftMessage2.message)) {
                            TLRPC.DraftMessage draftMessage3 = this.m2;
                            if (draftMessage3.rich_message == null) {
                                TLRPC.InputReplyTo inputReplyTo = draftMessage3.reply_to;
                                if (inputReplyTo != null) {
                                }
                                this.m2 = null;
                                this.l2 = false;
                                str2 = "d ";
                                if (!Y()) {
                                    this.m2 = null;
                                    this.l2 = false;
                                    this.W = true;
                                    k0();
                                    L0 = xc2.p0(this.h2) ? null : hl.U(getMessageNameString());
                                    if (xc2.p0(this.h2)) {
                                        if (i == 1) {
                                            i = 2;
                                        }
                                        L0 = null;
                                        if (i == 3) {
                                            i = 4;
                                        }
                                    }
                                    charSequence5 = R();
                                    r47 r47Var11 = this.g1;
                                    String T2 = this.g1 != null ? T(i, L0, r47Var11 != null ? uc7.s1(r47Var11.K1).E1(this.g1.k.restriction_reason) : null, true) : "";
                                    String str30 = T2;
                                    if (this.f0) {
                                        int length = T2.length();
                                        str30 = T2;
                                        str30 = T2;
                                        if (length >= 0 && L0 != null) {
                                            ?? valueOf = SpannableStringBuilder.valueOf(T2);
                                            valueOf.setSpan(new ho4(aob.X8, this.K4), 0, Math.min(valueOf.length(), L0.length() + 1), 0);
                                            str30 = valueOf;
                                        }
                                    }
                                    this.b0 = aob.E0[this.F0 ? 1 : 0];
                                    str3 = null;
                                    z5 = z18;
                                    charSequence4 = "";
                                    i4 = -1;
                                    str27 = str30;
                                } else if (TextUtils.isEmpty(this.J0)) {
                                    if (C1 != null) {
                                        this.j2 = C1;
                                        int intValue = uc7.s1(this.G0).D1(this.I0, getTopicId()).intValue();
                                        this.k2 = intValue;
                                        d2b t0 = aob.t0(intValue);
                                        int L8 = t0 != null ? hl.L(3.0f) + t0.getIntrinsicWidth() : 0;
                                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                                        CharSequence replace = TextUtils.replace(C1, new String[]{"..."}, new String[]{""});
                                        i3 = this.k2 == 5 ? replace.toString().indexOf("**oo**") : -1;
                                        if (i3 >= 0) {
                                            spannableStringBuilder2.append(replace).setSpan(new mf3(aob.t0(this.k2).getIntrinsicWidth()), i3, i3 + 6, 0);
                                        } else {
                                            spannableStringBuilder2.append((CharSequence) " ").append(replace).setSpan(new mf3(L8), 0, 1, 0);
                                        }
                                        z3 = false;
                                        charSequence2 = spannableStringBuilder2;
                                    } else {
                                        this.j2 = null;
                                        this.k2 = -1;
                                        z3 = true;
                                        charSequence2 = "";
                                        i3 = -1;
                                    }
                                    if (this.l2 || this.m2 != null) {
                                        str3 = null;
                                        L0 = ob6.L0(2131751307);
                                        TLRPC.DraftMessage draftMessage4 = this.m2;
                                        if (draftMessage4 == null || !TextUtils.isEmpty(draftMessage4.message) || this.m2.rich_message != null) {
                                            TLRPC.DraftMessage draftMessage5 = this.m2;
                                            if (draftMessage5 != null && (richMessage = draftMessage5.rich_message) != null) {
                                                charSequence3 = r47.e0(richMessage, jn7.f2);
                                            } else if (this.l2) {
                                                charSequence3 = ob6.L0(2131753975);
                                            } else if (draftMessage5 != null) {
                                                String str31 = draftMessage5.message;
                                                int length2 = str31.length();
                                                charSequence3 = str31;
                                                if (length2 > 150) {
                                                    charSequence3 = str31.subSequence(0, jn7.f2);
                                                }
                                            } else {
                                                charSequence3 = "";
                                            }
                                            SpannableString spannableString = new SpannableString(charSequence3);
                                            TLRPC.DraftMessage draftMessage6 = this.m2;
                                            if (draftMessage6 != null) {
                                                ls6.i(draftMessage6, spannableString);
                                                TLRPC.DraftMessage draftMessage7 = this.m2;
                                                if (draftMessage7 != null && (arrayList = draftMessage7.entities) != null) {
                                                    TextPaint textPaint2 = this.b0;
                                                    ls6.a(textPaint2 == null ? null : textPaint2.getFontMetricsInt(), spannableString, arrayList);
                                                }
                                            } else if (this.l2) {
                                                spannableString.setSpan(new ho4(aob.p9, this.K4), 0, spannableString.length(), 33);
                                            }
                                            SpannableStringBuilder Q2 = Q(i, hl.J2(spannableString), L0);
                                            if ((this.s2 || xea.l1) && !U()) {
                                                z4 = false;
                                            } else {
                                                z4 = false;
                                                Q2.setSpan(new ho4(aob.j9, this.K4), 0, L0.length() + 1, 33);
                                            }
                                            charSequence6 = pv3.l(Q2, aob.E0[this.F0 ? 1 : 0].getFontMetricsInt(), z4);
                                        } else if ((this.s2 || xea.l1) && !U()) {
                                            charSequence4 = charSequence2;
                                            i4 = i3;
                                            z5 = z18;
                                            charSequence5 = "";
                                            str27 = null;
                                            z16 = false;
                                        } else {
                                            SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(L0);
                                            valueOf2.setSpan(new ho4(aob.j9, this.K4), 0, L0.length(), 33);
                                            charSequence6 = valueOf2;
                                        }
                                        CharSequence charSequence26 = charSequence6;
                                        charSequence4 = charSequence2;
                                        charSequence5 = charSequence26;
                                        i4 = i3;
                                        z5 = z18;
                                        str27 = null;
                                        z16 = false;
                                    } else {
                                        if (this.i1) {
                                            this.b0 = aob.G0[this.F0 ? 1 : 0];
                                            Z = ob6.L0(2131749048);
                                        } else {
                                            r47 r47Var12 = this.g1;
                                            if (r47Var12 != null) {
                                                String E1 = uc7.s1(r47Var12.K1).E1(this.g1.k.restriction_reason);
                                                long Z0 = this.g1.Z0();
                                                boolean D = wf3.D(Z0);
                                                str3 = null;
                                                int i19 = this.G0;
                                                if (D) {
                                                    uc7.s1(i19).X1(Long.valueOf(Z0));
                                                    M0 = null;
                                                } else {
                                                    M0 = uc7.s1(i19).M0(Long.valueOf(-Z0));
                                                }
                                                this.M3 = true;
                                                if (this.k1 == 0 && this.I0 > 0 && this.g1.O3() && (tL_messageReactions = this.g1.k.reactions) != null && (arrayList2 = tL_messageReactions.recent_reactions) != null && !arrayList2.isEmpty() && this.W0 > 0) {
                                                    TLRPC.MessagePeerReaction messagePeerReaction = this.g1.k.reactions.recent_reactions.get(0);
                                                    if (messagePeerReaction.unread) {
                                                        long j4 = messagePeerReaction.peer_id.user_id;
                                                        if (j4 != 0) {
                                                            chat2 = M0;
                                                            if (j4 != yac.h(this.G0).n) {
                                                                w49 d = w49.d(messagePeerReaction.reaction);
                                                                this.b0 = aob.G0[this.F0 ? 1 : 0];
                                                                String str32 = d.f;
                                                                z6 = true;
                                                                if (str32 != null) {
                                                                    str4 = ob6.Z(2131746130, str32);
                                                                } else {
                                                                    String Z2 = ob6.Z(2131746130, "**reaction**");
                                                                    int indexOf = Z2.indexOf("**reaction**");
                                                                    ?? spannableStringBuilder3 = new SpannableStringBuilder(Z2.replace("**reaction**", "d"));
                                                                    long j5 = d.g;
                                                                    TextPaint textPaint3 = this.b0;
                                                                    spannableStringBuilder3.setSpan(new hm(j5, textPaint3 == null ? null : textPaint3.getFontMetricsInt()), indexOf, indexOf + 1, 0);
                                                                    str4 = spannableStringBuilder3;
                                                                    z6 = true;
                                                                }
                                                                if (z6) {
                                                                    charSequence8 = str4;
                                                                } else {
                                                                    int i20 = this.k1;
                                                                    if (i20 == 2) {
                                                                        TLRPC.Chat chat5 = this.h2;
                                                                        if (chat5 != null) {
                                                                            if (xc2.T(chat5)) {
                                                                                TLRPC.Chat chat6 = this.h2;
                                                                                if (!chat6.megagroup) {
                                                                                    int i21 = chat6.participants_count;
                                                                                    str11 = i21 != 0 ? ob6.I(i21, "Subscribers") : !xc2.t0(chat6) ? ob6.L0(2131752299).toLowerCase() : ob6.L0(2131752288).toLowerCase();
                                                                                }
                                                                            }
                                                                            TLRPC.Chat chat7 = this.h2;
                                                                            int i22 = chat7.participants_count;
                                                                            str11 = i22 != 0 ? ob6.I(i22, "Members") : chat7.has_geo ? ob6.L0(2131748396) : !xc2.t0(chat7) ? ob6.L0(2131748395).toLowerCase() : ob6.L0(2131748392).toLowerCase();
                                                                        } else {
                                                                            str11 = "";
                                                                        }
                                                                        this.M3 = false;
                                                                        str9 = str11;
                                                                    } else if (i20 == 3 && lbc.D(this.g2)) {
                                                                        uj3 uj3Var = this.E4;
                                                                        str9 = ob6.L0((uj3Var == null || !uj3Var.P0) ? 2131745624 : 2131745623);
                                                                    } else {
                                                                        boolean z23 = this.s2;
                                                                        if (!z23 && !xea.l1 && this.L0 != 0) {
                                                                            O = P();
                                                                        } else if (z23 || xea.l1 || this.K0 == 0) {
                                                                            r47 r47Var13 = this.g1;
                                                                            if (!(r47Var13.k instanceof TLRPC.TL_messageService) || (r47.D4(r47Var13) && !(this.g1.k.action instanceof TLRPC.TL_messageActionTopicCreate))) {
                                                                                this.W = true;
                                                                                k0();
                                                                                String U2 = (this.s0 || (user2 = this.g2) == null || !user2.self || this.g1.O3()) ? null : hl.U(getMessageNameString());
                                                                                if ((!this.s0 || (user = this.g2) == null || user.self || (r47Var3 = this.g1) == null || !r47Var3.O3()) && U2 == null && ((r47Var = this.g1) == null || (message = r47Var.k) == null || message.guestchat_via_from == null)) {
                                                                                    TLRPC.Chat chat8 = this.h2;
                                                                                    if (chat8 != null) {
                                                                                        long j6 = chat8.id;
                                                                                        if (j6 > 0) {
                                                                                            str5 = "d ";
                                                                                            if (chat2 != null) {
                                                                                            }
                                                                                            if (xc2.T(chat8)) {
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    str5 = "d ";
                                                                                    TLRPC.User user5 = this.g2;
                                                                                    if (user5 == null || user5.id != 489000 || (r47Var2 = this.g1) == null || r47Var2.W0() == null) {
                                                                                        boolean isEmpty = TextUtils.isEmpty(E1);
                                                                                        CharSequence charSequence27 = E1;
                                                                                        if (isEmpty) {
                                                                                            boolean D4 = r47.D4(this.g1);
                                                                                            r47 r47Var14 = this.g1;
                                                                                            if (D4) {
                                                                                                CharSequence charSequence28 = r47Var14.w;
                                                                                                if (charSequence28 != null) {
                                                                                                    charSequence11 = charSequence28;
                                                                                                    if (r47Var14.k.action instanceof TLRPC.TL_messageActionTopicCreate) {
                                                                                                        charSequence11 = charSequence28;
                                                                                                    }
                                                                                                    charSequence27 = charSequence11;
                                                                                                    if (r47Var14.i2[0] instanceof oo4) {
                                                                                                        TLRPC.TL_forumTopic f9 = uc7.s1(this.G0).g4.f(-this.g1.A0(), r47.a2(this.G0, this.g1.k, true));
                                                                                                        charSequence27 = charSequence11;
                                                                                                        if (f9 != null) {
                                                                                                            ((oo4) this.g1.i2[0]).b(f9.icon_color);
                                                                                                            charSequence27 = charSequence11;
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                charSequence11 = r47Var14.v;
                                                                                                charSequence27 = charSequence11;
                                                                                                if (r47Var14.i2[0] instanceof oo4) {
                                                                                                }
                                                                                            } else {
                                                                                                TLRPC.MessageMedia messageMedia = r47Var14.k.media;
                                                                                                if ((messageMedia instanceof TLRPC.TL_messageMediaPhoto) && (messageMedia.photo instanceof TLRPC.TL_photoEmpty) && messageMedia.ttl_seconds != 0) {
                                                                                                    charSequence27 = ob6.L0(2131753940);
                                                                                                } else {
                                                                                                    if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                                                                                                        TLRPC.Document document = messageMedia.document;
                                                                                                        if (((document instanceof TLRPC.TL_documentEmpty) || document == null) && messageMedia.ttl_seconds != 0) {
                                                                                                            charSequence27 = messageMedia.voice ? ob6.L0(2131753922) : messageMedia.round ? ob6.L0(2131753933) : ob6.L0(2131753925);
                                                                                                        }
                                                                                                    }
                                                                                                    String str33 = "🎧 ";
                                                                                                    if (getCaptionMessage() == null || (this.g1.k.media instanceof TLRPC.TL_messageMediaPoll)) {
                                                                                                        r47 r47Var15 = this.g1;
                                                                                                        TLRPC.Message message3 = r47Var15.k;
                                                                                                        TLRPC.MessageMedia messageMedia2 = message3.media;
                                                                                                        if (messageMedia2 instanceof TLRPC.TL_messageMediaPaidMedia) {
                                                                                                            int size = ((TLRPC.TL_messageMediaPaidMedia) messageMedia2).extended_media.size();
                                                                                                            if (this.T1) {
                                                                                                                i5 = 1;
                                                                                                                c3 = 0;
                                                                                                                G = size > 1 ? ob6.G(size, "Media", new Object[0]) : ob6.L0(2131753926);
                                                                                                            } else {
                                                                                                                c3 = 0;
                                                                                                                i5 = 1;
                                                                                                                G = size > 1 ? ob6.G(size, "Photos", new Object[0]) : ob6.L0(2131753941);
                                                                                                            }
                                                                                                            Object[] objArr = new Object[i5];
                                                                                                            objArr[c3] = G;
                                                                                                            SpannableStringBuilder T0 = nza.T0(ob6.Z(2131753942, objArr));
                                                                                                            this.b0 = aob.G0[this.F0 ? 1 : 0];
                                                                                                            charSequence27 = T0;
                                                                                                        } else if (this.S1 > 1) {
                                                                                                            boolean z24 = this.T1;
                                                                                                            ArrayList arrayList3 = this.h1;
                                                                                                            String G2 = z24 ? ob6.G(arrayList3 == null ? 0 : arrayList3.size(), "Media", new Object[0]) : ob6.G(arrayList3 == null ? 0 : arrayList3.size(), "Photos", new Object[0]);
                                                                                                            this.b0 = aob.G0[this.F0 ? 1 : 0];
                                                                                                            charSequence27 = G2;
                                                                                                        } else {
                                                                                                            if (messageMedia2 instanceof TLRPC.TL_messageMediaGiveaway) {
                                                                                                                TLRPC.MessageFwdHeader messageFwdHeader = message3.fwd_from;
                                                                                                                if (messageFwdHeader != null) {
                                                                                                                    TLRPC.Peer peer = messageFwdHeader.from_id;
                                                                                                                    if (peer instanceof TLRPC.TL_peerChannel) {
                                                                                                                        V = xc2.U(this.G0, peer.channel_id);
                                                                                                                        charSequence10 = ob6.L0(!V ? 2131753475 : 2131753469);
                                                                                                                    }
                                                                                                                }
                                                                                                                V = xc2.V(this.h2);
                                                                                                                charSequence10 = ob6.L0(!V ? 2131753475 : 2131753469);
                                                                                                            } else if (messageMedia2 instanceof TLRPC.TL_messageMediaGiveawayResults) {
                                                                                                                charSequence10 = ob6.L0(2131753385);
                                                                                                            } else if (messageMedia2 instanceof TLRPC.TL_messageMediaPoll) {
                                                                                                                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia2;
                                                                                                                TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_messageMediaPoll.poll.question;
                                                                                                                if (tL_textWithEntities2 == null || tL_textWithEntities2.entities == null) {
                                                                                                                    charSequence10 = vf3.a(R.drawable.dialog_media_poll_20, tL_textWithEntities2.text, false);
                                                                                                                } else {
                                                                                                                    SpannableString spannableString2 = new SpannableString(tL_messageMediaPoll.poll.question.text);
                                                                                                                    TLRPC.TL_textWithEntities tL_textWithEntities3 = tL_messageMediaPoll.poll.question;
                                                                                                                    ls6.h(tL_textWithEntities3.entities, tL_textWithEntities3.text, spannableString2, -1);
                                                                                                                    ls6.a(aob.E0[this.F0 ? 1 : 0].getFontMetricsInt(), spannableString2, tL_messageMediaPoll.poll.question.entities);
                                                                                                                    charSequence10 = vf3.a(R.drawable.dialog_media_poll_20, spannableString2, false);
                                                                                                                }
                                                                                                            } else if (messageMedia2 instanceof TLRPC.TL_messageMediaToDo) {
                                                                                                                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia2;
                                                                                                                TLRPC.TL_textWithEntities tL_textWithEntities4 = tL_messageMediaToDo.todo.title;
                                                                                                                if (tL_textWithEntities4 == null || tL_textWithEntities4.entities == null) {
                                                                                                                    charSequence10 = vf3.a(R.drawable.dialog_media_checklist_20, tL_textWithEntities4.text, false);
                                                                                                                } else {
                                                                                                                    SpannableString spannableString3 = new SpannableString(tL_messageMediaToDo.todo.title.text);
                                                                                                                    TLRPC.TL_textWithEntities tL_textWithEntities5 = tL_messageMediaToDo.todo.title;
                                                                                                                    ls6.h(tL_textWithEntities5.entities, tL_textWithEntities5.text, spannableString3, -1);
                                                                                                                    ls6.a(aob.E0[this.F0 ? 1 : 0].getFontMetricsInt(), spannableString3, tL_messageMediaToDo.todo.title.entities);
                                                                                                                    charSequence10 = vf3.a(R.drawable.dialog_media_checklist_20, spannableString3, false);
                                                                                                                }
                                                                                                            } else if (messageMedia2 instanceof TLRPC.TL_messageMediaGame) {
                                                                                                                charSequence10 = vf3.a(R.drawable.dialog_media_game_20, messageMedia2.game.title, false);
                                                                                                            } else if (messageMedia2 instanceof TLRPC.TL_messageMediaInvoice) {
                                                                                                                charSequence10 = messageMedia2.title;
                                                                                                            } else if (r47Var15.D == 14) {
                                                                                                                charSequence10 = qd4.q("🎧 ", r47Var15.w1(true), " - ", this.g1.y1(true));
                                                                                                            } else if (!(messageMedia2 instanceof TLRPC.TL_messageMediaStory) || !messageMedia2.via_mention) {
                                                                                                                if (!r47Var15.r2() || TextUtils.isEmpty(this.g1.k.message)) {
                                                                                                                    SpannableString spannableString4 = new SpannableString(charSequence);
                                                                                                                    r47 r47Var16 = this.g1;
                                                                                                                    if (r47Var16 != null) {
                                                                                                                        r47Var16.T5();
                                                                                                                    }
                                                                                                                    r47 r47Var17 = this.g1;
                                                                                                                    Pattern pattern = ls6.U1;
                                                                                                                    ls6.h(r47Var17.k.entities, r47Var17.v, spannableString4, jn7.m4);
                                                                                                                    r47 r47Var18 = this.g1;
                                                                                                                    charSequence9 = spannableString4;
                                                                                                                    if (r47Var18 != null) {
                                                                                                                        TLRPC.Message message4 = r47Var18.k;
                                                                                                                        charSequence9 = spannableString4;
                                                                                                                        if (message4 != null) {
                                                                                                                            ArrayList<TLRPC.MessageEntity> arrayList4 = message4.entities;
                                                                                                                            TextPaint textPaint4 = this.b0;
                                                                                                                            ls6.a(textPaint4 == null ? null : textPaint4.getFontMetricsInt(), spannableString4, arrayList4);
                                                                                                                            charSequence9 = spannableString4;
                                                                                                                        }
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    CharSequence charSequence29 = this.g1.c2;
                                                                                                                    int measuredWidth = getMeasuredWidth() - hl.L(this.J + 23);
                                                                                                                    r47 r47Var19 = this.g1;
                                                                                                                    charSequence9 = charSequence29;
                                                                                                                    if (r47Var19.b2) {
                                                                                                                        charSequence9 = hl.Q(charSequence29, (String) r47Var19.a2.get(0), measuredWidth, this.b0);
                                                                                                                    }
                                                                                                                }
                                                                                                                hl.v1(charSequence9, this.g1.a2, this.K4);
                                                                                                                charSequence10 = charSequence9;
                                                                                                            } else if (r47Var15.N3()) {
                                                                                                                TLRPC.User X1 = uc7.s1(this.G0).X1(Long.valueOf(this.g1.A0()));
                                                                                                                if (X1 != null) {
                                                                                                                    str6 = lbc.j(X1);
                                                                                                                    int indexOf2 = str6.indexOf(32);
                                                                                                                    c2 = 0;
                                                                                                                    if (indexOf2 >= 0) {
                                                                                                                        str6 = str6.substring(0, indexOf2);
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    c2 = 0;
                                                                                                                    str6 = "";
                                                                                                                }
                                                                                                                Object[] objArr2 = new Object[1];
                                                                                                                objArr2[c2] = str6;
                                                                                                                charSequence10 = ob6.Z(2131744093, objArr2);
                                                                                                            } else {
                                                                                                                charSequence10 = ob6.L0(2131744270);
                                                                                                            }
                                                                                                            r47 r47Var20 = this.g1;
                                                                                                            if (r47Var20.k.media == null || r47Var20.F3()) {
                                                                                                                TL_iv.RichMessage richMessage2 = this.g1.k.rich_message;
                                                                                                                charSequence27 = charSequence10;
                                                                                                                if (richMessage2 != null) {
                                                                                                                    charSequence27 = charSequence10;
                                                                                                                    if (richMessage2.blocks.size() == 1) {
                                                                                                                        charSequence27 = charSequence10;
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                            this.b0 = aob.G0[this.F0 ? 1 : 0];
                                                                                                            charSequence27 = charSequence10;
                                                                                                        }
                                                                                                    } else {
                                                                                                        r47 captionMessage = getCaptionMessage();
                                                                                                        if (!this.W) {
                                                                                                            str33 = "";
                                                                                                        } else if (captionMessage.G4()) {
                                                                                                            str33 = "📹 ";
                                                                                                        } else if (captionMessage.O4()) {
                                                                                                            str33 = "🎤 ";
                                                                                                        } else if (!captionMessage.I3()) {
                                                                                                            str33 = captionMessage.Q3() ? "🖼 " : "📎 ";
                                                                                                        }
                                                                                                        if (!captionMessage.r2() || TextUtils.isEmpty(captionMessage.k.message)) {
                                                                                                            SpannableString spannableString5 = new SpannableString(captionMessage.z);
                                                                                                            if (captionMessage.k != null) {
                                                                                                                captionMessage.T5();
                                                                                                                ls6.h(captionMessage.k.entities, captionMessage.z, spannableString5, jn7.m4);
                                                                                                                ArrayList<TLRPC.MessageEntity> arrayList5 = captionMessage.k.entities;
                                                                                                                TextPaint textPaint5 = this.b0;
                                                                                                                ls6.a(textPaint5 == null ? null : textPaint5.getFontMetricsInt(), spannableString5, arrayList5);
                                                                                                            }
                                                                                                            charSequence27 = new SpannableStringBuilder(str33).append((CharSequence) spannableString5);
                                                                                                        } else {
                                                                                                            CharSequence charSequence30 = captionMessage.c2;
                                                                                                            int measuredWidth2 = getMeasuredWidth() - hl.L(this.J + 47);
                                                                                                            if (this.a0) {
                                                                                                                measuredWidth2 = (int) (measuredWidth2 - this.b0.measureText(": "));
                                                                                                            }
                                                                                                            if (measuredWidth2 > 0 && captionMessage.b2) {
                                                                                                                charSequence30 = hl.Q(charSequence30, (String) captionMessage.a2.get(0), measuredWidth2, this.b0);
                                                                                                            }
                                                                                                            charSequence27 = new SpannableStringBuilder(str33).append(charSequence30);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        if (this.g1.e4()) {
                                                                                            SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(charSequence27);
                                                                                            str2 = str5;
                                                                                            spannableStringBuilder4.insert(0, (CharSequence) str2);
                                                                                            spannableStringBuilder4.setSpan(new wm2(getContext().getDrawable(R.drawable.msg_mini_replystory).mutate()), 0, 1, 0);
                                                                                            charSequence7 = spannableStringBuilder4;
                                                                                        } else {
                                                                                            str2 = str5;
                                                                                            charSequence7 = charSequence27;
                                                                                        }
                                                                                        CharSequence charSequence31 = charSequence7;
                                                                                        if (this.S1 > 0) {
                                                                                            if (!this.g1.r2() || TextUtils.isEmpty(this.g1.k.message)) {
                                                                                                int length3 = charSequence7.length();
                                                                                                CharSequence charSequence32 = charSequence7;
                                                                                                if (length3 > 150) {
                                                                                                    charSequence32 = charSequence7.subSequence(0, jn7.f2);
                                                                                                }
                                                                                                J2 = hl.J2(charSequence32);
                                                                                            } else {
                                                                                                J2 = this.g1.c2;
                                                                                                int measuredWidth3 = getMeasuredWidth() - hl.L((((this.M4 + 2) * this.S1) + (this.J + 23)) + 3);
                                                                                                r47 r47Var21 = this.g1;
                                                                                                if (r47Var21.b2) {
                                                                                                    J2 = hl.Q(J2, (String) r47Var21.a2.get(0), measuredWidth3, this.b0);
                                                                                                }
                                                                                            }
                                                                                            CharSequence spannableStringBuilder5 = !(J2 instanceof SpannableStringBuilder) ? new SpannableStringBuilder(J2) : J2;
                                                                                            SpannableStringBuilder spannableStringBuilder6 = (SpannableStringBuilder) spannableStringBuilder5;
                                                                                            spannableStringBuilder6.insert(0, (CharSequence) " ");
                                                                                            spannableStringBuilder6.setSpan(new mf3(hl.L(((this.M4 + 2) * this.S1) + 3)), 0, 1, 33);
                                                                                            pv3.l(spannableStringBuilder6, aob.E0[this.F0 ? 1 : 0].getFontMetricsInt(), false);
                                                                                            CharSequence charSequence33 = spannableStringBuilder5;
                                                                                            if (this.g1.r2()) {
                                                                                                CharSequence v14 = hl.v1(spannableStringBuilder6, this.g1.a2, this.K4);
                                                                                                charSequence33 = spannableStringBuilder5;
                                                                                                if (v14 != null) {
                                                                                                    charSequence33 = v14;
                                                                                                }
                                                                                            }
                                                                                            z3 = false;
                                                                                            charSequence31 = charSequence33;
                                                                                        }
                                                                                        charSequence8 = charSequence31;
                                                                                        if (this.g1.j3()) {
                                                                                            charSequence8 = charSequence31;
                                                                                            if (this.g1.m5()) {
                                                                                                this.y0 = true;
                                                                                                SpannableStringBuilder spannableStringBuilder7 = new SpannableStringBuilder(charSequence31);
                                                                                                spannableStringBuilder7.insert(0, (CharSequence) str2);
                                                                                                wm2 wm2Var = new wm2(getContext().getDrawable(R.drawable.mini_forwarded).mutate());
                                                                                                wm2Var.x = 0.9f;
                                                                                                spannableStringBuilder7.setSpan(wm2Var, 0, 1, 0);
                                                                                                charSequence8 = spannableStringBuilder7;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    str2 = str5;
                                                                                }
                                                                                int i23 = -1;
                                                                                if (U2 == null) {
                                                                                    U2 = getMessageNameString();
                                                                                }
                                                                                String U3 = hl.U(U2);
                                                                                TLRPC.Chat chat9 = this.h2;
                                                                                if (chat9 != null && chat9.forum && !this.Q && !this.P) {
                                                                                    CharSequence i24 = uc7.s1(this.G0).g4.i(this.h2, this.g1, this.b0);
                                                                                    if (!TextUtils.isEmpty(i24)) {
                                                                                        SpannableStringBuilder spannableStringBuilder8 = new SpannableStringBuilder("-");
                                                                                        wm2 wm2Var2 = new wm2(a.b.getDrawable(R.drawable.msg_mini_forumarrow).mutate());
                                                                                        if (!this.s2 && !xea.l1) {
                                                                                            i23 = aob.k9;
                                                                                        }
                                                                                        wm2Var2.a(i23);
                                                                                        spannableStringBuilder8.setSpan(wm2Var2, 0, 1, 0);
                                                                                        ?? spannableStringBuilder9 = new SpannableStringBuilder();
                                                                                        spannableStringBuilder9.append(U3).append((CharSequence) spannableStringBuilder8).append(i24);
                                                                                        str7 = spannableStringBuilder9;
                                                                                        SpannableStringBuilder T3 = T(i, str7, E1, false);
                                                                                        if (!this.P || ((this.s2 || xea.l1) && (this.K0 == 0 || T3.length() <= 0))) {
                                                                                            i6 = 0;
                                                                                        } else {
                                                                                            try {
                                                                                                ho4Var = new ho4(aob.k9, this.K4);
                                                                                                i6 = str7.length() + 1;
                                                                                            } catch (Exception e) {
                                                                                                e = e;
                                                                                                i6 = 0;
                                                                                            }
                                                                                            try {
                                                                                                T3.setSpan(ho4Var, 0, i6, 33);
                                                                                            } catch (Exception e2) {
                                                                                                e = e2;
                                                                                                cc4.f(e);
                                                                                                l = pv3.l(T3, aob.E0[this.F0 ? 1 : 0].getFontMetricsInt(), false);
                                                                                                if (this.g1.r2()) {
                                                                                                }
                                                                                                if (this.S1 > 0) {
                                                                                                }
                                                                                                charSequence12 = l;
                                                                                                str8 = str7;
                                                                                                z3 = false;
                                                                                                charSequence14 = charSequence12;
                                                                                                str10 = str8;
                                                                                                if (this.L0 == 0) {
                                                                                                }
                                                                                                CharSequence charSequence34 = charSequence14;
                                                                                                charSequence4 = charSequence2;
                                                                                                charSequence5 = charSequence34;
                                                                                                z16 = z3;
                                                                                                i4 = i3;
                                                                                                L0 = str12;
                                                                                                z5 = z18;
                                                                                                str27 = null;
                                                                                                if (!this.y0) {
                                                                                                }
                                                                                                if (TextUtils.isEmpty(this.J0)) {
                                                                                                }
                                                                                                str13 = "";
                                                                                                r47Var4 = this.g1;
                                                                                                if (r47Var4 != null) {
                                                                                                }
                                                                                                this.R2 = false;
                                                                                                this.S2 = false;
                                                                                                this.T2 = r47Var4 == null && r47Var4.n4() && this.I0 == yac.h(this.G0).e();
                                                                                                z7 = false;
                                                                                                this.H3 = false;
                                                                                                this.c4 = false;
                                                                                                this.d4 = false;
                                                                                                this.e4 = false;
                                                                                                this.u3 = false;
                                                                                                str14 = str3;
                                                                                                str15 = str14;
                                                                                                this.Q2 = z7;
                                                                                                s1 = uc7.s1(this.G0);
                                                                                                if (this.k1 == 0) {
                                                                                                }
                                                                                                str16 = str13;
                                                                                                str17 = this.M0;
                                                                                                if (str17 == null) {
                                                                                                }
                                                                                                str19 = str27;
                                                                                                i7 = i4;
                                                                                                charSequence16 = str17;
                                                                                                str27 = str15;
                                                                                                charSequence15 = charSequence4;
                                                                                                str20 = str14;
                                                                                                charSequence19 = charSequence5;
                                                                                                charSequence18 = L0;
                                                                                                charSequence17 = charSequence19;
                                                                                                if (z5) {
                                                                                                }
                                                                                                if (M()) {
                                                                                                }
                                                                                                if (ob6.a0) {
                                                                                                }
                                                                                                if (this.H2) {
                                                                                                }
                                                                                                if (this.T2) {
                                                                                                }
                                                                                                if (this.a1) {
                                                                                                }
                                                                                                if (!this.m4) {
                                                                                                }
                                                                                                if (z11) {
                                                                                                }
                                                                                                if (this.l4) {
                                                                                                }
                                                                                                L7 = this.z2 - hl.L(12.0f);
                                                                                                if (L7 < 0) {
                                                                                                }
                                                                                                if (charSequence16 instanceof String) {
                                                                                                }
                                                                                                if (this.E2) {
                                                                                                }
                                                                                                float f10 = L7;
                                                                                                this.S = aob.A0[this.F0 ? 1 : 0].measureText(charSequence16.toString()) > f10;
                                                                                                if (!this.R) {
                                                                                                }
                                                                                                CharSequence l3 = pv3.l(charSequence16, aob.A0[this.F0 ? 1 : 0].getFontMetricsInt(), false);
                                                                                                r47 r47Var22 = this.g1;
                                                                                                if (r47Var22 == null) {
                                                                                                }
                                                                                                if (this.R) {
                                                                                                }
                                                                                                this.C2 = (this.E2 || !staticLayout3.isRtlCharAt(0)) ? 0.0f : -hl.L(f3);
                                                                                                this.D2 = this.A2.isRtlCharAt(0);
                                                                                                this.q3 = hm.update(0, (View) this, this.q3, this.A2);
                                                                                                if (this.s2) {
                                                                                                }
                                                                                                f4 = 39.0f;
                                                                                                f5 = 8.0f;
                                                                                                f6 = 13.0f;
                                                                                                L = hl.L(11.0f);
                                                                                                this.r3 = hl.L(32.0f);
                                                                                                this.N2 = hl.L(13.0f);
                                                                                                this.v3 = hl.L(42.33f);
                                                                                                this.D3 = hl.L(43.0f);
                                                                                                this.N3 = hl.L(42.33f);
                                                                                                this.X2 = hl.L(13.0f);
                                                                                                int measuredWidth4 = getMeasuredWidth() - hl.L(this.J + 21);
                                                                                                if (ob6.a0) {
                                                                                                }
                                                                                                this.v0.F.set(L2, L, hl.L(56.0f) + L2, hl.L(56.0f) + L);
                                                                                                i11 = 0;
                                                                                                while (true) {
                                                                                                    imageReceiverArr = this.W1;
                                                                                                    if (i11 < imageReceiverArr.length) {
                                                                                                    }
                                                                                                    imageReceiverArr[i11].i0(((this.M4 + 2) * i11) + L3, ((hl.L(31.0f) + L) + (this.R ? hl.L(20.0f) : 0)) - ((this.s2 || xea.l1 || (lycVar = this.u0) == null || lycVar.D()) ? 0 : hl.L(9.0f)), hl.L(18.0f), hl.L(18.0f));
                                                                                                    i11++;
                                                                                                }
                                                                                                i12 = measuredWidth4;
                                                                                                i13 = L;
                                                                                                if (ob6.a0) {
                                                                                                }
                                                                                                if (this.R) {
                                                                                                }
                                                                                                if (!this.s2) {
                                                                                                }
                                                                                                this.N2 -= hl.L(6.0f);
                                                                                                this.X2 -= hl.L(6.0f);
                                                                                                if (getIsPinned()) {
                                                                                                }
                                                                                                if (this.u3) {
                                                                                                }
                                                                                                if (this.u3) {
                                                                                                }
                                                                                                this.I3 = z12;
                                                                                                if (z12) {
                                                                                                }
                                                                                                if (z16) {
                                                                                                }
                                                                                                max = Math.max(hl.L(12.0f), i12);
                                                                                                this.h3 = hl.L((!this.s2 || xea.l1) ? 58.0f : 62.0f);
                                                                                                if (!this.s2) {
                                                                                                }
                                                                                                this.h3 -= hl.L(!Y() ? 10.0f : 12.0f);
                                                                                                Y = Y();
                                                                                                boolean z25 = this.s2;
                                                                                                if (!Y) {
                                                                                                }
                                                                                                if (this.R) {
                                                                                                }
                                                                                                this.o3 = hm.update(0, (View) this, this.o3, this.t3);
                                                                                                if (TextUtils.isEmpty(str19)) {
                                                                                                }
                                                                                                this.p3 = hm.update(0, (View) this, this.p3, this.i3);
                                                                                                if (!TextUtils.isEmpty(charSequence15)) {
                                                                                                }
                                                                                                if (charSequence17 instanceof Spannable) {
                                                                                                }
                                                                                                if (this.s2) {
                                                                                                }
                                                                                                this.b0 = aob.E0[this.F0 ? 1 : 0];
                                                                                                charSequence21 = charSequence18;
                                                                                                charSequence22 = null;
                                                                                                Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                                                                                                if (this.s2) {
                                                                                                }
                                                                                                if (this.S1 > 0) {
                                                                                                }
                                                                                                int i25 = max;
                                                                                                TextPaint textPaint6 = this.b0;
                                                                                                float L9 = hl.L(1.0f);
                                                                                                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                                                                                                this.f3 = o0b.b(charSequence21, textPaint6, i25, L9, i25, charSequence22 == null ? 1 : 2);
                                                                                                max = i25;
                                                                                                this.j3.addAll(this.k3);
                                                                                                this.k3.clear();
                                                                                                b2 = 3;
                                                                                                npa.b(this, this.f3, -2, -2, this.j3, this.k3);
                                                                                                this.n3 = hm.update(0, (View) this, this.n3, this.f3);
                                                                                                z13 = ob6.a0;
                                                                                                StaticLayout staticLayout4 = this.A2;
                                                                                                if (z13) {
                                                                                                }
                                                                                                staticLayout2 = this.g3;
                                                                                                if (staticLayout2 != null) {
                                                                                                }
                                                                                                m0();
                                                                                            }
                                                                                        }
                                                                                        l = pv3.l(T3, aob.E0[this.F0 ? 1 : 0].getFontMetricsInt(), false);
                                                                                        if (this.g1.r2() && (v1 = hl.v1(l, this.g1.a2, this.K4)) != null) {
                                                                                            l = v1;
                                                                                        }
                                                                                        if (this.S1 > 0) {
                                                                                            if (!(l instanceof SpannableStringBuilder)) {
                                                                                                l = new SpannableStringBuilder(l);
                                                                                            }
                                                                                            SpannableStringBuilder spannableStringBuilder10 = (SpannableStringBuilder) l;
                                                                                            if (i6 >= spannableStringBuilder10.length()) {
                                                                                                spannableStringBuilder10.append((CharSequence) " ");
                                                                                                spannableStringBuilder10.setSpan(new mf3(hl.L(((this.M4 + 2) * this.S1) + 3)), spannableStringBuilder10.length() - 1, spannableStringBuilder10.length(), 33);
                                                                                            } else {
                                                                                                spannableStringBuilder10.insert(i6, (CharSequence) " ");
                                                                                                spannableStringBuilder10.setSpan(new mf3(hl.L(((this.M4 + 2) * this.S1) + 3)), i6, i6 + 1, 33);
                                                                                            }
                                                                                        }
                                                                                        charSequence12 = l;
                                                                                        str8 = str7;
                                                                                        z3 = false;
                                                                                        charSequence14 = charSequence12;
                                                                                        str10 = str8;
                                                                                        if (this.L0 == 0) {
                                                                                            str12 = P();
                                                                                        } else if (this.K0 != 0) {
                                                                                            str12 = O();
                                                                                        } else {
                                                                                            CharSequence charSequence35 = charSequence14;
                                                                                            charSequence4 = charSequence2;
                                                                                            charSequence5 = charSequence35;
                                                                                            z16 = z3;
                                                                                            i4 = i3;
                                                                                            L0 = str10;
                                                                                            z5 = z18;
                                                                                            str27 = null;
                                                                                        }
                                                                                        CharSequence charSequence342 = charSequence14;
                                                                                        charSequence4 = charSequence2;
                                                                                        charSequence5 = charSequence342;
                                                                                        z16 = z3;
                                                                                        i4 = i3;
                                                                                        L0 = str12;
                                                                                        z5 = z18;
                                                                                        str27 = null;
                                                                                    }
                                                                                }
                                                                                str7 = U3;
                                                                                SpannableStringBuilder T32 = T(i, str7, E1, false);
                                                                                if (this.P) {
                                                                                }
                                                                                i6 = 0;
                                                                                l = pv3.l(T32, aob.E0[this.F0 ? 1 : 0].getFontMetricsInt(), false);
                                                                                if (this.g1.r2()) {
                                                                                    l = v1;
                                                                                }
                                                                                if (this.S1 > 0) {
                                                                                }
                                                                                charSequence12 = l;
                                                                                str8 = str7;
                                                                                z3 = false;
                                                                                charSequence14 = charSequence12;
                                                                                str10 = str8;
                                                                                if (this.L0 == 0) {
                                                                                }
                                                                                CharSequence charSequence3422 = charSequence14;
                                                                                charSequence4 = charSequence2;
                                                                                charSequence5 = charSequence3422;
                                                                                z16 = z3;
                                                                                i4 = i3;
                                                                                L0 = str12;
                                                                                z5 = z18;
                                                                                str27 = null;
                                                                            } else {
                                                                                r47 r47Var23 = this.g1;
                                                                                TLRPC.MessageAction messageAction = r47Var23.k.action;
                                                                                if (messageAction instanceof TLRPC.TL_messageActionPhoneCall) {
                                                                                    boolean O3 = r47Var23.O3();
                                                                                    boolean z26 = ((TLRPC.TL_messageActionPhoneCall) messageAction).video;
                                                                                    charSequence13 = O3 ? vf3.a(z26 ? R.drawable.dialog_media_outgoing_video_call_20 : R.drawable.dialog_media_outgoing_call_20, charSequence, false) : vf3.a(z26 ? R.drawable.dialog_media_incoming_video_call_20 : R.drawable.dialog_media_incoming_call_20, charSequence, false);
                                                                                } else if (xc2.V(this.h2) && (this.g1.k.action instanceof TLRPC.TL_messageActionChannelMigrateFrom)) {
                                                                                    charSequence13 = "";
                                                                                    z17 = false;
                                                                                } else {
                                                                                    CharSequence charSequence36 = this.g1.w;
                                                                                    charSequence13 = charSequence36;
                                                                                    if (charSequence36 == null) {
                                                                                        charSequence13 = charSequence;
                                                                                    }
                                                                                }
                                                                                this.b0 = aob.G0[this.F0 ? 1 : 0];
                                                                                charSequence8 = charSequence13;
                                                                                if (this.g1.D == 21) {
                                                                                    k0();
                                                                                    charSequence8 = A(charSequence13);
                                                                                }
                                                                            }
                                                                        } else {
                                                                            O = O();
                                                                        }
                                                                        charSequence12 = O;
                                                                        str8 = null;
                                                                        z3 = false;
                                                                        charSequence14 = charSequence12;
                                                                        str10 = str8;
                                                                        if (this.L0 == 0) {
                                                                        }
                                                                        CharSequence charSequence34222 = charSequence14;
                                                                        charSequence4 = charSequence2;
                                                                        charSequence5 = charSequence34222;
                                                                        z16 = z3;
                                                                        i4 = i3;
                                                                        L0 = str12;
                                                                        z5 = z18;
                                                                        str27 = null;
                                                                    }
                                                                    str10 = null;
                                                                    z17 = false;
                                                                    z18 = false;
                                                                    charSequence14 = str9;
                                                                    if (this.L0 == 0) {
                                                                    }
                                                                    CharSequence charSequence342222 = charSequence14;
                                                                    charSequence4 = charSequence2;
                                                                    charSequence5 = charSequence342222;
                                                                    z16 = z3;
                                                                    i4 = i3;
                                                                    L0 = str12;
                                                                    z5 = z18;
                                                                    str27 = null;
                                                                }
                                                                str10 = null;
                                                                charSequence14 = charSequence8;
                                                                if (this.L0 == 0) {
                                                                }
                                                                CharSequence charSequence3422222 = charSequence14;
                                                                charSequence4 = charSequence2;
                                                                charSequence5 = charSequence3422222;
                                                                z16 = z3;
                                                                i4 = i3;
                                                                L0 = str12;
                                                                z5 = z18;
                                                                str27 = null;
                                                            }
                                                            str4 = "";
                                                            z6 = false;
                                                            if (z6) {
                                                            }
                                                            str10 = null;
                                                            charSequence14 = charSequence8;
                                                            if (this.L0 == 0) {
                                                            }
                                                            CharSequence charSequence34222222 = charSequence14;
                                                            charSequence4 = charSequence2;
                                                            charSequence5 = charSequence34222222;
                                                            z16 = z3;
                                                            i4 = i3;
                                                            L0 = str12;
                                                            z5 = z18;
                                                            str27 = null;
                                                        }
                                                    }
                                                }
                                                chat2 = M0;
                                                str4 = "";
                                                z6 = false;
                                                if (z6) {
                                                }
                                                str10 = null;
                                                charSequence14 = charSequence8;
                                                if (this.L0 == 0) {
                                                }
                                                CharSequence charSequence342222222 = charSequence14;
                                                charSequence4 = charSequence2;
                                                charSequence5 = charSequence342222222;
                                                z16 = z3;
                                                i4 = i3;
                                                L0 = str12;
                                                z5 = z18;
                                                str27 = null;
                                            } else if (this.L0 != 0) {
                                                Z = P();
                                            } else if (this.K0 != 0) {
                                                Z = O();
                                            } else {
                                                TLRPC.EncryptedChat encryptedChat2 = this.i2;
                                                if (encryptedChat2 != null) {
                                                    this.b0 = aob.G0[this.F0 ? 1 : 0];
                                                    if (encryptedChat2 instanceof TLRPC.TL_encryptedChatRequested) {
                                                        Z = ob6.L0(2131751094);
                                                    } else if (encryptedChat2 instanceof TLRPC.TL_encryptedChatWaiting) {
                                                        Z = ob6.Z(2131753750, lbc.j(this.g2));
                                                    } else if (encryptedChat2 instanceof TLRPC.TL_encryptedChatDiscarded) {
                                                        Z = ob6.L0(2131751093);
                                                    } else if (encryptedChat2 instanceof TLRPC.TL_encryptedChat) {
                                                        Z = encryptedChat2.admin_id == yac.h(this.G0).e() ? ob6.Z(2131751105, lbc.j(this.g2)) : ob6.L0(2131751106);
                                                    }
                                                } else if (this.k1 == 3 && lbc.D(this.g2)) {
                                                    uj3 uj3Var2 = this.E4;
                                                    int i26 = (uj3Var2 == null || !uj3Var2.P0) ? 2131745624 : 2131745623;
                                                    charSequence4 = charSequence2;
                                                    charSequence5 = ob6.L0(i26);
                                                    z16 = z3;
                                                    i4 = i3;
                                                    z5 = false;
                                                    z17 = false;
                                                    L0 = null;
                                                    str3 = null;
                                                }
                                                z16 = z3;
                                                charSequence4 = charSequence2;
                                                i4 = i3;
                                                L0 = null;
                                                str3 = null;
                                                z5 = z18;
                                                charSequence5 = "";
                                            }
                                        }
                                        CharSequence charSequence37 = Z;
                                        charSequence4 = charSequence2;
                                        charSequence5 = charSequence37;
                                        z16 = z3;
                                        i4 = i3;
                                        L0 = null;
                                        str3 = null;
                                        z5 = z18;
                                    }
                                } else {
                                    this.m2 = null;
                                    this.l2 = false;
                                    charSequence5 = this.J0;
                                    this.b0 = aob.E0[this.F0 ? 1 : 0];
                                    L0 = null;
                                    str3 = null;
                                    z5 = z18;
                                    charSequence4 = "";
                                    i4 = -1;
                                }
                                if (!this.y0 && !X() && !Y() && !W() && this.m2 == null && (r47Var5 = this.g1) != null && (message2 = r47Var5.k) != null && (message2.action instanceof TLRPC.TL_messageActionStarGift)) {
                                    this.z0 = true;
                                    SpannableStringBuilder spannableStringBuilder11 = new SpannableStringBuilder(charSequence5);
                                    spannableStringBuilder11.insert(0, (CharSequence) str2);
                                    wm2 wm2Var3 = new wm2(getContext().getDrawable(R.drawable.mini_gift).mutate());
                                    wm2Var3.I = 1.25f;
                                    wm2Var3.J = 1.25f;
                                    wm2Var3.H = 0.9f;
                                    wm2Var3.x = 0.9f;
                                    spannableStringBuilder11.setSpan(wm2Var3, 0, 1, 0);
                                    tL_textWithEntities = ((TLRPC.TL_messageActionStarGift) this.g1.k.action).message;
                                    if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
                                        this.b0 = aob.E0[this.F0 ? 1 : 0];
                                    }
                                    charSequence5 = spannableStringBuilder11;
                                }
                                if (TextUtils.isEmpty(this.J0)) {
                                    if (this.m2 != null) {
                                        str13 = ob6.e1(r6.date);
                                    } else {
                                        int i27 = this.S0;
                                        if (i27 != 0) {
                                            str13 = ob6.e1(i27);
                                        } else {
                                            if (this.g1 != null) {
                                                str13 = ob6.e1(r6.k.date);
                                            }
                                        }
                                    }
                                    r47Var4 = this.g1;
                                    if (r47Var4 != null || this.s0) {
                                        this.R2 = false;
                                        this.S2 = false;
                                        this.T2 = r47Var4 == null && r47Var4.n4() && this.I0 == yac.h(this.G0).e();
                                        z7 = false;
                                        this.H3 = false;
                                        this.c4 = false;
                                        this.d4 = false;
                                        this.e4 = false;
                                        this.u3 = false;
                                        str14 = str3;
                                        str15 = str14;
                                    } else {
                                        if (this.K0 != 0) {
                                            int i28 = this.T0;
                                            int i29 = this.V0;
                                            int i30 = i28 + i29;
                                            if (i30 <= 0) {
                                                z10 = false;
                                                this.H3 = false;
                                                this.c4 = false;
                                                str25 = str3;
                                                str24 = str25;
                                            } else if (i28 > i29) {
                                                this.H3 = true;
                                                z10 = false;
                                                this.c4 = false;
                                                str24 = String.format(str, Integer.valueOf(i30));
                                                str25 = str3;
                                            } else {
                                                z10 = false;
                                                this.H3 = false;
                                                this.c4 = true;
                                                str25 = String.format(str, Integer.valueOf(i30));
                                                str24 = str3;
                                            }
                                            this.d4 = z10;
                                            this.e4 = z10;
                                        } else {
                                            String str34 = str;
                                            if (this.i1) {
                                                this.H3 = false;
                                                z17 = false;
                                                str22 = str3;
                                                z8 = true;
                                            } else {
                                                int i31 = this.T0;
                                                z8 = true;
                                                if (i31 != 0) {
                                                    this.H3 = true;
                                                    str22 = String.format(str34, Integer.valueOf(i31));
                                                } else if (this.U0) {
                                                    this.H3 = true;
                                                    str22 = "";
                                                } else {
                                                    this.H3 = false;
                                                    str22 = str3;
                                                }
                                            }
                                            if (this.V0 != 0) {
                                                this.c4 = z8;
                                                str23 = "@";
                                            } else {
                                                this.c4 = false;
                                                str23 = str3;
                                            }
                                            this.d4 = this.W0 > 0;
                                            this.e4 = this.X0 > 0;
                                            str24 = str22;
                                            str25 = str23;
                                        }
                                        if (this.g1.N3() && this.m2 == null && z17) {
                                            r47 r47Var24 = this.g1;
                                            if (!(r47Var24.k.action instanceof TLRPC.TL_messageActionHistoryClear)) {
                                                if (r47Var24.n4()) {
                                                    z9 = false;
                                                    this.R2 = false;
                                                    this.S2 = false;
                                                    this.T2 = true;
                                                    this.u3 = false;
                                                } else {
                                                    z9 = false;
                                                    if (this.g1.m4()) {
                                                        this.R2 = false;
                                                        this.S2 = false;
                                                        this.T2 = false;
                                                        this.u3 = true;
                                                        this.H3 = false;
                                                        this.c4 = false;
                                                    } else if (this.g1.p4()) {
                                                        TLRPC.TL_forumTopic tL_forumTopic = this.O;
                                                        if (tL_forumTopic != null) {
                                                            this.R2 = tL_forumTopic.read_outbox_max_id >= this.g1.e1();
                                                        } else if (this.O0) {
                                                            int i32 = this.I4;
                                                            this.R2 = (i32 > 0 && i32 >= this.g1.e1()) || !this.g1.E4() || (xc2.T(this.h2) && !this.h2.megagroup);
                                                        } else {
                                                            this.R2 = !this.g1.E4() || (xc2.T(this.h2) && !this.h2.megagroup);
                                                        }
                                                        this.S2 = true;
                                                        z9 = false;
                                                        this.T2 = false;
                                                        this.u3 = false;
                                                    } else {
                                                        z9 = false;
                                                    }
                                                }
                                                str15 = str25;
                                                str14 = str24;
                                                z7 = z9;
                                            }
                                        }
                                        z9 = false;
                                        this.R2 = false;
                                        this.S2 = false;
                                        this.T2 = false;
                                        this.u3 = false;
                                        str15 = str25;
                                        str14 = str24;
                                        z7 = z9;
                                    }
                                    this.Q2 = z7;
                                    s1 = uc7.s1(this.G0);
                                    if (this.k1 == 0 && s1.G2(this.I0, true)) {
                                        this.A3 = true;
                                        this.Q2 = true;
                                        i8 = s1.t2;
                                        if (i8 != 0) {
                                            str13 = ob6.L0(2131743436);
                                        } else if (i8 == 1) {
                                            str13 = ob6.N0("PsaType_" + s1.v2);
                                            if (TextUtils.isEmpty(str13)) {
                                                str13 = ob6.L0(2131746320);
                                            }
                                            if (!TextUtils.isEmpty(s1.u2)) {
                                                charSequence5 = s1.u2;
                                                this.S1 = 0;
                                            }
                                        }
                                    }
                                    str16 = str13;
                                    str17 = this.M0;
                                    if (str17 == null) {
                                        if (this.K0 == 0) {
                                            TLRPC.Chat chat10 = this.h2;
                                            if (chat10 != null) {
                                                if (this.P) {
                                                    Drawable[] drawableArr = this.i0;
                                                    ?? r6 = drawableArr;
                                                    if (drawableArr == null) {
                                                        Drawable[] drawableArr2 = new Drawable[1];
                                                        this.i0 = drawableArr2;
                                                        r6 = drawableArr2;
                                                    }
                                                    r6[0] = str3;
                                                    k = uc7.s1(this.G0).g4.j(this.h2, this.g1, this.b0, this.i0);
                                                    if (k == null) {
                                                        str18 = L0;
                                                        U = "";
                                                        if (U != null && U.length() == 0) {
                                                            U = ob6.L0(2131749082);
                                                        }
                                                        charSequence15 = charSequence4;
                                                        str19 = str27;
                                                        i7 = i4;
                                                        charSequence16 = U;
                                                        charSequence17 = charSequence5;
                                                        str27 = str15;
                                                        charSequence18 = str18;
                                                        str20 = str14;
                                                    }
                                                } else if (this.Q) {
                                                    Drawable[] drawableArr3 = this.i0;
                                                    ?? r62 = drawableArr3;
                                                    if (drawableArr3 == null) {
                                                        Drawable[] drawableArr4 = new Drawable[1];
                                                        this.i0 = drawableArr4;
                                                        r62 = drawableArr4;
                                                    }
                                                    r62[0] = str3;
                                                    boolean z27 = this.h0;
                                                    TLRPC.TL_forumTopic tL_forumTopic2 = this.O;
                                                    k = z27 ? ro4.k(tL_forumTopic2, aob.A0[this.F0 ? 1 : 0], r62) : hl.U(tL_forumTopic2.title);
                                                } else {
                                                    if (!chat10.monoforum || chat10.linked_monoforum_id == 0) {
                                                        str18 = L0;
                                                        U = hl.U(chat10.title);
                                                    } else {
                                                        TLRPC.Chat M02 = uc7.s1(this.G0).M0(Long.valueOf(this.h2.linked_monoforum_id));
                                                        if (M02 != null) {
                                                            ?? spannableStringBuilder12 = new SpannableStringBuilder(hl.U(M02.title));
                                                            spannableStringBuilder12.append(" ");
                                                            int length4 = spannableStringBuilder12.length();
                                                            spannableStringBuilder12.append(ob6.L0(2131748101));
                                                            str18 = L0;
                                                            spannableStringBuilder12.setSpan(new mf4(ob6.L0(2131748101), aob.y6, this.K4), length4, spannableStringBuilder12.length(), 33);
                                                            str21 = spannableStringBuilder12;
                                                        } else {
                                                            str18 = L0;
                                                            str21 = hl.U(this.h2.title);
                                                        }
                                                        U = str21;
                                                    }
                                                    if (U != null) {
                                                        U = ob6.L0(2131749082);
                                                    }
                                                    charSequence15 = charSequence4;
                                                    str19 = str27;
                                                    i7 = i4;
                                                    charSequence16 = U;
                                                    charSequence17 = charSequence5;
                                                    str27 = str15;
                                                    charSequence18 = str18;
                                                    str20 = str14;
                                                }
                                                str18 = L0;
                                                U = k;
                                                if (U != null) {
                                                }
                                                charSequence15 = charSequence4;
                                                str19 = str27;
                                                i7 = i4;
                                                charSequence16 = U;
                                                charSequence17 = charSequence5;
                                                str27 = str15;
                                                charSequence18 = str18;
                                                str20 = str14;
                                            } else {
                                                str18 = L0;
                                                TLRPC.User user6 = this.g2;
                                                if (user6 != null) {
                                                    if (lbc.B(user6)) {
                                                        U = ob6.L0(2131745993);
                                                    } else if (lbc.u(this.g2)) {
                                                        U = ob6.L0(2131754245);
                                                    } else if (!lbc.D(this.g2) || this.r0) {
                                                        if (this.Q) {
                                                            Drawable[] drawableArr5 = this.i0;
                                                            ?? r0 = drawableArr5;
                                                            if (drawableArr5 == null) {
                                                                Drawable[] drawableArr6 = new Drawable[1];
                                                                this.i0 = drawableArr6;
                                                                r0 = drawableArr6;
                                                            }
                                                            r0[0] = str3;
                                                            boolean z28 = this.h0;
                                                            TLRPC.TL_forumTopic tL_forumTopic3 = this.O;
                                                            U = z28 ? ro4.k(tL_forumTopic3, aob.A0[this.F0 ? 1 : 0], r0) : hl.U(tL_forumTopic3.title);
                                                        } else {
                                                            U = hl.U(lbc.r(this.g2));
                                                        }
                                                    } else if (this.s0) {
                                                        U = ob6.L0(2131748057);
                                                    } else if (this.v2) {
                                                        U = ob6.L0(2131750464);
                                                    } else {
                                                        if (this.k1 == 3) {
                                                            this.A3 = true;
                                                        }
                                                        U = ob6.L0(2131745629);
                                                    }
                                                    if (U != null) {
                                                    }
                                                    charSequence15 = charSequence4;
                                                    str19 = str27;
                                                    i7 = i4;
                                                    charSequence16 = U;
                                                    charSequence17 = charSequence5;
                                                    str27 = str15;
                                                    charSequence18 = str18;
                                                    str20 = str14;
                                                }
                                                U = "";
                                                if (U != null) {
                                                }
                                                charSequence15 = charSequence4;
                                                str19 = str27;
                                                i7 = i4;
                                                charSequence16 = U;
                                                charSequence17 = charSequence5;
                                                str27 = str15;
                                                charSequence18 = str18;
                                                str20 = str14;
                                            }
                                            if (z5) {
                                                TextPaint timeTextPaint = getTimeTextPaint();
                                                int ceil = (int) Math.ceil(timeTextPaint.measureText(str16));
                                                this.O2 = new StaticLayout(str16, timeTextPaint, ceil, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                                                i9 = hl.L(getIsPinned() ? 24.0f : 0.0f) + ceil;
                                                if (ob6.a0) {
                                                    this.M2 = hl.L(15.0f);
                                                } else {
                                                    this.M2 = qu6.x(15.0f, getMeasuredWidth(), i9);
                                                }
                                            } else {
                                                this.O2 = str3;
                                                this.M2 = 0;
                                                i9 = 0;
                                            }
                                            if (M()) {
                                                boolean z29 = ob6.a0;
                                                int i33 = this.M2;
                                                if (z29) {
                                                    this.P2 = hl.L(4.0f) + i33 + i9;
                                                } else {
                                                    this.P2 = (i33 - aob.a1.getIntrinsicWidth()) - hl.L(4.0f);
                                                }
                                                i10 = aob.a1.getIntrinsicWidth() + hl.L(4.0f);
                                                i9 += i10;
                                            } else {
                                                i10 = 0;
                                            }
                                            if (ob6.a0) {
                                                x = qu6.x(this.J + 13, getMeasuredWidth() - this.y2, i9);
                                                this.z2 = x;
                                                this.y2 += i9;
                                            } else {
                                                x = qu6.x(22.0f, getMeasuredWidth() - this.y2, i9);
                                                this.z2 = x;
                                            }
                                            if (this.H2) {
                                                this.z2 = x - (aob.Z0.getIntrinsicWidth() + hl.L(ob6.a0 ? 8.0f : 4.0f));
                                            }
                                            if (this.T2) {
                                                int L10 = hl.L(5.0f) + aob.W0.getIntrinsicWidth();
                                                this.z2 -= L10;
                                                boolean z30 = ob6.a0;
                                                int i34 = this.M2;
                                                if (z30) {
                                                    this.W2 = hl.L(5.0f) + i34 + i9;
                                                    this.y2 += L10;
                                                } else {
                                                    this.W2 = (i34 - i10) - L10;
                                                }
                                            } else if (this.S2) {
                                                int L11 = hl.L(5.0f) + aob.S0.getIntrinsicWidth();
                                                int i35 = this.z2 - L11;
                                                this.z2 = i35;
                                                if (this.R2) {
                                                    this.z2 = uh9.f(8.0f, aob.V0.getIntrinsicWidth(), i35);
                                                    boolean z31 = ob6.a0;
                                                    int i36 = this.M2;
                                                    if (z31) {
                                                        int L12 = hl.L(5.0f) + i36 + i9;
                                                        this.U2 = L12;
                                                        this.Y2 = hl.L(5.5f) + L12;
                                                        this.y2 = c00.A(8.0f, aob.V0.getIntrinsicWidth() + L11, this.y2);
                                                    } else {
                                                        int i37 = (i36 - i10) - L11;
                                                        this.Y2 = i37;
                                                        this.U2 = i37 - hl.L(5.5f);
                                                    }
                                                } else {
                                                    boolean z32 = ob6.a0;
                                                    int i38 = this.M2;
                                                    if (z32) {
                                                        this.V2 = hl.L(5.0f) + i38 + i9;
                                                        this.y2 += L11;
                                                    } else {
                                                        this.V2 = (i38 - i10) - L11;
                                                    }
                                                }
                                            }
                                            z11 = (!this.a1 || this.R0 || this.c1 || this.d1 > 0.0f) && !this.k4 && ((b = this.q4) == 0 || b == 3);
                                            if (!this.m4 && this.o4.c() != null) {
                                                int L13 = hl.L(36.0f);
                                                if (z11) {
                                                    L13 += aob.b1.getIntrinsicWidth() + hl.L(6.0f);
                                                }
                                                this.z2 -= L13;
                                                if (ob6.a0) {
                                                    this.y2 += L13;
                                                }
                                            } else if (z11) {
                                                int intrinsicWidth = aob.b1.getIntrinsicWidth() + hl.L(6.0f);
                                                if (this.m4) {
                                                    intrinsicWidth += hl.L(36.0f);
                                                } else if (this.q4 == 3) {
                                                    intrinsicWidth += aob.h1.getIntrinsicWidth() + hl.L(6.0f);
                                                }
                                                this.z2 -= intrinsicWidth;
                                                if (ob6.a0) {
                                                    this.y2 += intrinsicWidth;
                                                }
                                            } else if (this.k4) {
                                                int intrinsicWidth2 = aob.e1.getIntrinsicWidth() + hl.L(6.0f);
                                                this.z2 -= intrinsicWidth2;
                                                if (ob6.a0) {
                                                    this.y2 += intrinsicWidth2;
                                                }
                                            } else if (this.m4) {
                                                int L14 = hl.L(36.0f);
                                                this.z2 -= L14;
                                                if (ob6.a0) {
                                                    this.y2 += L14;
                                                }
                                            } else if (this.q4 != 0) {
                                                int L15 = hl.L(6.0f);
                                                byte b4 = this.q4;
                                                int intrinsicWidth3 = (b4 != 1 ? b4 != 3 ? aob.g1 : aob.h1 : aob.f1).getIntrinsicWidth() + L15;
                                                this.z2 -= intrinsicWidth3;
                                                if (ob6.a0) {
                                                    this.y2 += intrinsicWidth3;
                                                }
                                            }
                                            if (this.l4) {
                                                this.z2 -= hl.L(21.0f);
                                            }
                                            L7 = this.z2 - hl.L(12.0f);
                                            if (L7 < 0) {
                                                L7 = 0;
                                            }
                                            if (charSequence16 instanceof String) {
                                                charSequence16 = ((String) charSequence16).replace(c, ' ');
                                            }
                                            if (this.E2) {
                                                f3 = 36.0f;
                                                try {
                                                    this.B2 = charSequence16.length() == TextUtils.ellipsize(charSequence16, aob.A0[this.F0 ? 1 : 0], (float) L7, TextUtils.TruncateAt.END).length();
                                                    L7 += hl.L(48.0f);
                                                } catch (Exception e3) {
                                                    e = e3;
                                                    cc4.f(e);
                                                    this.q3 = hm.update(0, (View) this, this.q3, this.A2);
                                                    if (this.s2) {
                                                    }
                                                    f4 = 39.0f;
                                                    f5 = 8.0f;
                                                    f6 = 13.0f;
                                                    L = hl.L(11.0f);
                                                    this.r3 = hl.L(32.0f);
                                                    this.N2 = hl.L(13.0f);
                                                    this.v3 = hl.L(42.33f);
                                                    this.D3 = hl.L(43.0f);
                                                    this.N3 = hl.L(42.33f);
                                                    this.X2 = hl.L(13.0f);
                                                    int measuredWidth42 = getMeasuredWidth() - hl.L(this.J + 21);
                                                    if (ob6.a0) {
                                                    }
                                                    this.v0.F.set(L2, L, hl.L(56.0f) + L2, hl.L(56.0f) + L);
                                                    i11 = 0;
                                                    while (true) {
                                                        imageReceiverArr = this.W1;
                                                        if (i11 < imageReceiverArr.length) {
                                                        }
                                                        imageReceiverArr[i11].i0(((this.M4 + 2) * i11) + L3, ((hl.L(31.0f) + L) + (this.R ? hl.L(20.0f) : 0)) - ((this.s2 || xea.l1 || (lycVar = this.u0) == null || lycVar.D()) ? 0 : hl.L(9.0f)), hl.L(18.0f), hl.L(18.0f));
                                                        i11++;
                                                    }
                                                    i12 = measuredWidth42;
                                                    i13 = L;
                                                    if (ob6.a0) {
                                                    }
                                                    if (this.R) {
                                                    }
                                                    if (!this.s2) {
                                                    }
                                                    this.N2 -= hl.L(6.0f);
                                                    this.X2 -= hl.L(6.0f);
                                                    if (getIsPinned()) {
                                                    }
                                                    if (this.u3) {
                                                    }
                                                    if (this.u3) {
                                                    }
                                                    this.I3 = z12;
                                                    if (z12) {
                                                    }
                                                    if (z16) {
                                                    }
                                                    max = Math.max(hl.L(12.0f), i12);
                                                    this.h3 = hl.L((!this.s2 || xea.l1) ? 58.0f : 62.0f);
                                                    if (!this.s2) {
                                                    }
                                                    this.h3 -= hl.L(!Y() ? 10.0f : 12.0f);
                                                    Y = Y();
                                                    boolean z252 = this.s2;
                                                    if (!Y) {
                                                    }
                                                    if (this.R) {
                                                    }
                                                    this.o3 = hm.update(0, (View) this, this.o3, this.t3);
                                                    if (TextUtils.isEmpty(str19)) {
                                                    }
                                                    this.p3 = hm.update(0, (View) this, this.p3, this.i3);
                                                    if (!TextUtils.isEmpty(charSequence15)) {
                                                    }
                                                    if (charSequence17 instanceof Spannable) {
                                                    }
                                                    if (this.s2) {
                                                    }
                                                    this.b0 = aob.E0[this.F0 ? 1 : 0];
                                                    charSequence21 = charSequence18;
                                                    charSequence22 = null;
                                                    Layout.Alignment alignment2 = Layout.Alignment.ALIGN_NORMAL;
                                                    if (this.s2) {
                                                    }
                                                    if (this.S1 > 0) {
                                                    }
                                                    int i252 = max;
                                                    TextPaint textPaint62 = this.b0;
                                                    float L92 = hl.L(1.0f);
                                                    TextUtils.TruncateAt truncateAt2 = TextUtils.TruncateAt.END;
                                                    this.f3 = o0b.b(charSequence21, textPaint62, i252, L92, i252, charSequence22 == null ? 1 : 2);
                                                    max = i252;
                                                    this.j3.addAll(this.k3);
                                                    this.k3.clear();
                                                    b2 = 3;
                                                    npa.b(this, this.f3, -2, -2, this.j3, this.k3);
                                                    this.n3 = hm.update(0, (View) this, this.n3, this.f3);
                                                    z13 = ob6.a0;
                                                    StaticLayout staticLayout42 = this.A2;
                                                    if (z13) {
                                                    }
                                                    staticLayout2 = this.g3;
                                                    if (staticLayout2 != null) {
                                                    }
                                                    m0();
                                                }
                                            } else {
                                                f3 = 36.0f;
                                            }
                                            float f102 = L7;
                                            this.S = aob.A0[this.F0 ? 1 : 0].measureText(charSequence16.toString()) > f102;
                                            if (!this.R) {
                                                charSequence16 = TextUtils.ellipsize(charSequence16, aob.A0[this.F0 ? 1 : 0], f102, TextUtils.TruncateAt.END);
                                            }
                                            CharSequence l32 = pv3.l(charSequence16, aob.A0[this.F0 ? 1 : 0].getFontMetricsInt(), false);
                                            r47 r47Var222 = this.g1;
                                            CharSequence charSequence38 = (r47Var222 == null && r47Var222.r2() && (v13 = hl.v1(l32, this.g1.a2, this.K4)) != null) ? v13 : l32;
                                            if (this.R) {
                                                TextPaint textPaint7 = aob.A0[this.F0 ? 1 : 0];
                                                Layout.Alignment alignment3 = Layout.Alignment.ALIGN_NORMAL;
                                                TextUtils.TruncateAt truncateAt3 = TextUtils.TruncateAt.END;
                                                staticLayout3 = o0b.b(charSequence38, textPaint7, L7, 0.0f, L7, 2);
                                                this.A2 = staticLayout3;
                                            } else {
                                                staticLayout3 = new StaticLayout(charSequence38, aob.A0[this.F0 ? 1 : 0], Math.max(L7, this.z2), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                                                this.A2 = staticLayout3;
                                            }
                                            this.C2 = (this.E2 || !staticLayout3.isRtlCharAt(0)) ? 0.0f : -hl.L(f3);
                                            this.D2 = this.A2.isRtlCharAt(0);
                                            this.q3 = hm.update(0, (View) this, this.q3, this.A2);
                                            if (this.s2 && !xea.l1) {
                                                int L16 = hl.L(9.0f);
                                                this.r3 = hl.L(31.0f);
                                                this.N2 = hl.L(f2);
                                                this.v3 = hl.L(38.0f);
                                                this.D3 = hl.L(39.0f);
                                                this.N3 = hl.L(this.Q ? 35.0f : 38.0f);
                                                this.X2 = hl.L(f);
                                                i12 = getMeasuredWidth() - hl.L((this.J + 20) - (ob6.a0 ? 0 : 12));
                                                if (ob6.a0) {
                                                    int L17 = hl.L(22.0f);
                                                    this.s3 = L17;
                                                    this.c3 = L17;
                                                    this.e3 = L17;
                                                    this.d3 = L17;
                                                    f4 = 39.0f;
                                                    L5 = getMeasuredWidth() - hl.L(this.I + 52);
                                                    f8 = 9.0f;
                                                    L6 = L5 - hl.L(((this.M4 + 2) * this.S1) + 9);
                                                } else {
                                                    f4 = 39.0f;
                                                    f8 = 9.0f;
                                                    int L18 = hl.L(this.J + 4);
                                                    this.s3 = L18;
                                                    this.c3 = L18;
                                                    this.e3 = L18;
                                                    this.d3 = L18;
                                                    L5 = hl.L(this.I);
                                                    L6 = hl.L(67.0f) + L5;
                                                }
                                                f6 = 13.0f;
                                                f5 = 8.0f;
                                                i13 = L16;
                                                this.v0.F.set(L5, L16, hl.L(52.0f) + L5, hl.L(52.0f) + i13);
                                                int i39 = 0;
                                                while (true) {
                                                    ImageReceiver[] imageReceiverArr3 = this.W1;
                                                    if (i39 >= imageReceiverArr3.length) {
                                                        break;
                                                    }
                                                    imageReceiverArr3[i39].i0(((this.M4 + 2) * i39) + L6, ((hl.L(30.0f) + i13) + (this.R ? hl.L(20.0f) : 0)) - ((this.s2 || xea.l1 || (lycVar3 = this.u0) == null || lycVar3.D()) ? 0 : hl.L(f8)), hl.L(this.M4), hl.L(this.M4));
                                                    i39++;
                                                }
                                            } else {
                                                f4 = 39.0f;
                                                f5 = 8.0f;
                                                f6 = 13.0f;
                                                L = hl.L(11.0f);
                                                this.r3 = hl.L(32.0f);
                                                this.N2 = hl.L(13.0f);
                                                this.v3 = hl.L(42.33f);
                                                this.D3 = hl.L(43.0f);
                                                this.N3 = hl.L(42.33f);
                                                this.X2 = hl.L(13.0f);
                                                int measuredWidth422 = getMeasuredWidth() - hl.L(this.J + 21);
                                                if (ob6.a0) {
                                                    int L19 = hl.L(this.J + 6);
                                                    this.s3 = L19;
                                                    this.c3 = L19;
                                                    this.e3 = L19;
                                                    this.d3 = L19;
                                                    L2 = hl.L(this.I);
                                                    L3 = hl.L(69.0f) + L2;
                                                } else {
                                                    int L20 = hl.L(f2);
                                                    this.s3 = L20;
                                                    this.c3 = L20;
                                                    this.e3 = L20;
                                                    this.d3 = L20;
                                                    L2 = getMeasuredWidth() - hl.L(this.I + 56);
                                                    L3 = L2 - hl.L(31.0f);
                                                }
                                                this.v0.F.set(L2, L, hl.L(56.0f) + L2, hl.L(56.0f) + L);
                                                i11 = 0;
                                                while (true) {
                                                    imageReceiverArr = this.W1;
                                                    if (i11 < imageReceiverArr.length) {
                                                        break;
                                                    }
                                                    imageReceiverArr[i11].i0(((this.M4 + 2) * i11) + L3, ((hl.L(31.0f) + L) + (this.R ? hl.L(20.0f) : 0)) - ((this.s2 || xea.l1 || (lycVar = this.u0) == null || lycVar.D()) ? 0 : hl.L(9.0f)), hl.L(18.0f), hl.L(18.0f));
                                                    i11++;
                                                }
                                                i12 = measuredWidth422;
                                                i13 = L;
                                            }
                                            if (ob6.a0) {
                                                this.Z2 = this.c3;
                                                this.a3 = getMeasuredWidth() - hl.L(64.0f);
                                            } else {
                                                this.a3 = getMeasuredWidth() - hl.L(this.J);
                                                this.Z2 = hl.L(64.0f);
                                            }
                                            if (this.R) {
                                                this.r3 = hl.L(20.0f) + this.r3;
                                            }
                                            if (((!this.s2 && !xea.l1) || Y()) && (lycVar2 = this.u0) != null && !lycVar2.D()) {
                                                this.N2 -= hl.L(6.0f);
                                                this.X2 -= hl.L(6.0f);
                                            }
                                            if (getIsPinned()) {
                                                if (ob6.a0) {
                                                    this.E3 = hl.L(14.0f);
                                                } else {
                                                    this.E3 = (getMeasuredWidth() - aob.j1.getIntrinsicWidth()) - hl.L(14.0f);
                                                }
                                            }
                                            if (this.u3) {
                                                int L21 = hl.L(29.0f);
                                                i12 -= L21;
                                                if (ob6.a0) {
                                                    this.w3 = hl.L(15.666f);
                                                    this.c3 += L21;
                                                    this.e3 += L21;
                                                    this.d3 += L21;
                                                    this.s3 += L21;
                                                } else {
                                                    this.w3 = getMeasuredWidth() - hl.L(36.3333f);
                                                }
                                                f7 = 25.0f;
                                            } else if (str20 != null || str27 != null || this.d4 || this.e4) {
                                                f7 = 25.0f;
                                                if (str20 != null) {
                                                    this.P3 = Math.max(hl.L(f5), (int) Math.ceil(aob.L0.measureText(str20)));
                                                    this.Y3 = new StaticLayout(str20, aob.L0, this.P3, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                                                    int L22 = hl.L(f) + this.P3;
                                                    i12 -= L22;
                                                    if (ob6.a0) {
                                                        this.O3 = hl.L(15.666f);
                                                        this.c3 += L22;
                                                        this.e3 += L22;
                                                        this.d3 += L22;
                                                        this.s3 += L22;
                                                    } else {
                                                        this.O3 = ik8.B(12.666f, this.P3, getMeasuredWidth() - hl.L(15.666f));
                                                    }
                                                    this.H3 = true;
                                                } else {
                                                    this.P3 = 0;
                                                }
                                                if (str27 != null) {
                                                    if (this.K0 != 0) {
                                                        this.i4 = Math.max(hl.L(f5), (int) Math.ceil(aob.L0.measureText(str27)));
                                                        this.j4 = new StaticLayout(str27, aob.L0, this.i4, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                                                    } else {
                                                        this.i4 = hl.L(f5);
                                                    }
                                                    int L23 = hl.L(f) + this.i4;
                                                    i12 -= L23;
                                                    if (ob6.a0) {
                                                        int L24 = hl.L(15.666f);
                                                        int i40 = this.P3;
                                                        this.f4 = L24 + (i40 != 0 ? i40 + hl.L(f) : 0);
                                                        this.c3 += L23;
                                                        this.e3 += L23;
                                                        this.d3 += L23;
                                                        this.s3 += L23;
                                                    } else {
                                                        int B = ik8.B(12.666f, this.i4, getMeasuredWidth()) - hl.L(15.666f);
                                                        int i41 = this.P3;
                                                        this.f4 = B - (i41 != 0 ? i41 + hl.L(f) : 0);
                                                    }
                                                    this.c4 = true;
                                                } else {
                                                    this.i4 = 0;
                                                }
                                                if (this.d4) {
                                                    int L25 = hl.L(25.0f);
                                                    i12 -= L25;
                                                    if (ob6.a0) {
                                                        int L26 = hl.L(15.666f);
                                                        this.g4 = L26;
                                                        if (this.c4) {
                                                            int i42 = this.i4;
                                                            L26 += i42 != 0 ? i42 + hl.L(f) : 0;
                                                            this.g4 = L26;
                                                        }
                                                        if (this.H3) {
                                                            int i43 = this.P3;
                                                            this.g4 = L26 + (i43 != 0 ? i43 + hl.L(f) : 0);
                                                        }
                                                        this.c3 += L25;
                                                        this.e3 += L25;
                                                        this.d3 += L25;
                                                        this.s3 += L25;
                                                    } else {
                                                        int measuredWidth5 = getMeasuredWidth() - hl.L(36.332f);
                                                        this.g4 = measuredWidth5;
                                                        if (this.c4) {
                                                            int i44 = this.i4;
                                                            measuredWidth5 -= i44 != 0 ? i44 + hl.L(f) : 0;
                                                            this.g4 = measuredWidth5;
                                                        }
                                                        if (this.H3) {
                                                            int i45 = this.P3;
                                                            this.g4 = measuredWidth5 - (i45 != 0 ? i45 + hl.L(f) : 0);
                                                        }
                                                    }
                                                }
                                                if (this.e4) {
                                                    int L27 = hl.L(25.0f);
                                                    i12 -= L27;
                                                    if (ob6.a0) {
                                                        int L28 = hl.L(15.666f);
                                                        this.h4 = L28;
                                                        if (this.d4) {
                                                            L28 += hl.L(25.0f);
                                                            this.h4 = L28;
                                                        }
                                                        if (this.c4) {
                                                            int i46 = this.i4;
                                                            L28 += i46 != 0 ? i46 + hl.L(f) : 0;
                                                            this.h4 = L28;
                                                        }
                                                        if (this.H3) {
                                                            int i47 = this.P3;
                                                            this.h4 = L28 + (i47 != 0 ? i47 + hl.L(f) : 0);
                                                        }
                                                        this.c3 += L27;
                                                        this.e3 += L27;
                                                        this.d3 += L27;
                                                        this.s3 += L27;
                                                    } else {
                                                        int measuredWidth6 = getMeasuredWidth() - hl.L(36.332f);
                                                        this.h4 = measuredWidth6;
                                                        if (this.d4) {
                                                            measuredWidth6 -= hl.L(25.0f);
                                                            this.h4 = measuredWidth6;
                                                        }
                                                        if (this.c4) {
                                                            int i48 = this.i4;
                                                            measuredWidth6 -= i48 != 0 ? i48 + hl.L(f) : 0;
                                                            this.h4 = measuredWidth6;
                                                        }
                                                        if (this.H3) {
                                                            int i49 = this.P3;
                                                            this.h4 = measuredWidth6 - (i49 != 0 ? i49 + hl.L(f) : 0);
                                                        }
                                                    }
                                                }
                                            } else if (!this.K1 || X() || Y() || W() || !lbc.v(this.g2) || !this.g2.bot_has_main_app) {
                                                f7 = 25.0f;
                                                this.H3 = false;
                                                this.c4 = false;
                                            } else {
                                                setOpenBotButton(true);
                                                int L29 = (int) (hl.L(26.0f) + this.J1.c);
                                                int L30 = hl.L(f6);
                                                i12 -= L29;
                                                int L31 = (this.s2 || xea.l1) ? hl.L(40.0f) : this.Q ? hl.L(33.0f) : hl.L(f3);
                                                boolean z33 = ob6.a0;
                                                RectF rectF = this.I1;
                                                if (z33) {
                                                    int L32 = hl.L(f6);
                                                    f7 = 25.0f;
                                                    rectF.set(hl.L(f6), L31, L32 + L29, hl.L(28.0f) + L31);
                                                    int i50 = L29 + L30;
                                                    this.c3 += i50;
                                                    this.e3 += i50;
                                                    this.d3 += i50;
                                                    this.s3 += i50;
                                                } else {
                                                    rectF.set((getMeasuredWidth() - L29) - hl.L(f6), L31, getMeasuredWidth() - hl.L(f6), hl.L(28.0f) + L31);
                                                    f7 = 25.0f;
                                                }
                                                this.H3 = false;
                                                this.c4 = false;
                                            }
                                            z12 = this.u3 && this.H0 == null && !X() && !Y() && !W() && (this.T0 > 0 || this.U0) && (r47Var8 = this.g1) != null && !r47Var8.O3() && (this.g1.k.action instanceof TLRPC.TL_messageActionGramTransfer);
                                            this.I3 = z12;
                                            if (z12) {
                                                int L33 = (this.H3 && this.M3) ? this.P3 + hl.L(f) : 0;
                                                if (this.c4 && this.M3) {
                                                    L33 = uh9.w(f, this.i4, L33);
                                                }
                                                if (this.d4) {
                                                    L33 += hl.L(f7);
                                                }
                                                if (this.e4) {
                                                    L33 += hl.L(f7);
                                                }
                                                if (this.F1) {
                                                    L33 = uh9.w(4.0f, (int) this.I1.width(), L33);
                                                }
                                                this.J3 = ob6.a0 ? hl.L(15.666f) + L33 : qu6.x(43.666f, getMeasuredWidth(), L33);
                                                i12 -= hl.L(32.0f);
                                                if (ob6.a0) {
                                                    this.c3 = hl.L(32.0f) + this.c3;
                                                    this.e3 = hl.L(32.0f) + this.e3;
                                                    this.d3 = hl.L(32.0f) + this.d3;
                                                    this.s3 = hl.L(32.0f) + this.s3;
                                                }
                                            }
                                            if (z16) {
                                                if (charSequence17 == null) {
                                                    charSequence17 = "";
                                                }
                                                int length5 = charSequence17.length();
                                                CharSequence charSequence39 = charSequence17;
                                                if (length5 > 150) {
                                                    charSequence39 = charSequence17.subSequence(0, jn7.f2);
                                                }
                                                charSequence17 = pv3.l(((this.s2 || xea.l1) && !U() && charSequence18 == null) ? hl.T2(charSequence39) : hl.J2(charSequence39), aob.E0[this.F0 ? 1 : 0].getFontMetricsInt(), false);
                                                r47 r47Var25 = this.g1;
                                                if (r47Var25 != null && (v12 = hl.v1(charSequence17, r47Var25.a2, this.K4)) != null) {
                                                    charSequence17 = v12;
                                                }
                                            }
                                            max = Math.max(hl.L(12.0f), i12);
                                            this.h3 = hl.L((!this.s2 || xea.l1) ? 58.0f : 62.0f);
                                            if (((!this.s2 && !xea.l1) || Y()) && U()) {
                                                this.h3 -= hl.L(!Y() ? 10.0f : 12.0f);
                                            }
                                            Y = Y();
                                            boolean z2522 = this.s2;
                                            if (!Y) {
                                                this.b3 = hl.L((z2522 || xea.l1) ? 34.0f : f4);
                                                int i51 = 0;
                                                while (true) {
                                                    ImageReceiver[] imageReceiverArr4 = this.W1;
                                                    if (i51 >= imageReceiverArr4.length) {
                                                        break;
                                                    }
                                                    imageReceiverArr4[i51].M0 = this.h3;
                                                    i51++;
                                                }
                                            } else if ((z2522 || xea.l1) && !U() && charSequence18 != null && (this.K0 == 0 || this.N0 == 1)) {
                                                try {
                                                    r47Var7 = this.g1;
                                                } catch (Exception e4) {
                                                    e = e4;
                                                }
                                                if (r47Var7 != null && r47Var7.r2()) {
                                                    CharSequence v15 = hl.v1(charSequence18, this.g1.a2, this.K4);
                                                    if (v15 != null) {
                                                        charSequence20 = v15;
                                                        TextPaint textPaint8 = aob.F0;
                                                        Layout.Alignment alignment4 = Layout.Alignment.ALIGN_NORMAL;
                                                        TextUtils.TruncateAt truncateAt4 = TextUtils.TruncateAt.END;
                                                        this.t3 = o0b.b(charSequence20, textPaint8, max, 0.0f, max, 1);
                                                        charSequence18 = charSequence20;
                                                        this.b3 = hl.L(51.0f);
                                                        L4 = (this.S || !this.Q) ? 0 : hl.L(20.0f);
                                                        i14 = 0;
                                                        while (true) {
                                                            imageReceiverArr2 = this.W1;
                                                            if (i14 >= imageReceiverArr2.length) {
                                                                break;
                                                            }
                                                            imageReceiverArr2[i14].M0 = hl.L(40.0f) + i13 + L4;
                                                            i14++;
                                                        }
                                                    }
                                                }
                                                charSequence20 = charSequence18;
                                                TextPaint textPaint82 = aob.F0;
                                                Layout.Alignment alignment42 = Layout.Alignment.ALIGN_NORMAL;
                                                TextUtils.TruncateAt truncateAt42 = TextUtils.TruncateAt.END;
                                                this.t3 = o0b.b(charSequence20, textPaint82, max, 0.0f, max, 1);
                                                charSequence18 = charSequence20;
                                                this.b3 = hl.L(51.0f);
                                                if (this.S) {
                                                }
                                                i14 = 0;
                                                while (true) {
                                                    imageReceiverArr2 = this.W1;
                                                    if (i14 >= imageReceiverArr2.length) {
                                                    }
                                                    imageReceiverArr2[i14].M0 = hl.L(40.0f) + i13 + L4;
                                                    i14++;
                                                }
                                            } else {
                                                this.t3 = null;
                                                if (this.s2 || xea.l1) {
                                                    this.b3 = hl.L(32.0f);
                                                    int L34 = (this.S && this.Q) ? hl.L(20.0f) : 0;
                                                    int i52 = 0;
                                                    while (true) {
                                                        ImageReceiver[] imageReceiverArr5 = this.W1;
                                                        if (i52 >= imageReceiverArr5.length) {
                                                            break;
                                                        }
                                                        imageReceiverArr5[i52].M0 = hl.L(21.0f) + i13 + L34;
                                                        i52++;
                                                    }
                                                } else {
                                                    this.b3 = hl.L(f4);
                                                }
                                            }
                                            if (this.R) {
                                                this.b3 = hl.L(20.0f) + this.b3;
                                            }
                                            this.o3 = hm.update(0, (View) this, this.o3, this.t3);
                                            if (TextUtils.isEmpty(str19)) {
                                                this.i3 = null;
                                            } else {
                                                this.i3 = new StaticLayout(TextUtils.ellipsize(pv3.l(str19, this.b0.getFontMetricsInt(), false), this.b0, max - hl.L(26.0f), TextUtils.TruncateAt.END), this.b0, max - hl.L(20.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                                                this.l3.addAll(this.m3);
                                                this.m3.clear();
                                                npa.c(this, this.i3, this.l3, this.m3);
                                            }
                                            this.p3 = hm.update(0, (View) this, this.p3, this.i3);
                                            if (!TextUtils.isEmpty(charSequence15)) {
                                                if ((this.s2 || xea.l1) && !U()) {
                                                    TextPaint textPaint9 = aob.G0[this.F0 ? 1 : 0];
                                                    Layout.Alignment alignment5 = Layout.Alignment.ALIGN_NORMAL;
                                                    float L35 = hl.L(1.0f);
                                                    TextUtils.TruncateAt truncateAt5 = TextUtils.TruncateAt.END;
                                                    this.g3 = o0b.b(charSequence15, textPaint9, max, L35, max, 1);
                                                } else {
                                                    int i53 = max;
                                                    try {
                                                        this.g3 = new StaticLayout(TextUtils.ellipsize(charSequence15, this.b0, max - hl.L(12.0f), TextUtils.TruncateAt.END), aob.G0[this.F0 ? 1 : 0], i53, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                                                    } catch (Exception e5) {
                                                        e = e5;
                                                        max = i53;
                                                        cc4.f(e);
                                                        if (charSequence17 instanceof Spannable) {
                                                        }
                                                        if (this.s2) {
                                                        }
                                                        this.b0 = aob.E0[this.F0 ? 1 : 0];
                                                        charSequence21 = charSequence18;
                                                        charSequence22 = null;
                                                        Layout.Alignment alignment22 = Layout.Alignment.ALIGN_NORMAL;
                                                        if (this.s2) {
                                                        }
                                                        if (this.S1 > 0) {
                                                        }
                                                        int i2522 = max;
                                                        TextPaint textPaint622 = this.b0;
                                                        float L922 = hl.L(1.0f);
                                                        TextUtils.TruncateAt truncateAt22 = TextUtils.TruncateAt.END;
                                                        this.f3 = o0b.b(charSequence21, textPaint622, i2522, L922, i2522, charSequence22 == null ? 1 : 2);
                                                        max = i2522;
                                                        this.j3.addAll(this.k3);
                                                        this.k3.clear();
                                                        b2 = 3;
                                                        npa.b(this, this.f3, -2, -2, this.j3, this.k3);
                                                        this.n3 = hm.update(0, (View) this, this.n3, this.f3);
                                                        z13 = ob6.a0;
                                                        StaticLayout staticLayout422 = this.A2;
                                                        if (z13) {
                                                        }
                                                        staticLayout2 = this.g3;
                                                        if (staticLayout2 != null) {
                                                        }
                                                        m0();
                                                    }
                                                }
                                            }
                                            if (charSequence17 instanceof Spannable) {
                                                try {
                                                    Spannable spannable = (Spannable) charSequence17;
                                                    for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                                                        if ((obj instanceof ClickableSpan) || (obj instanceof jk2) || ((this.L0 == 0 && !X() && (obj instanceof y7c)) || (obj instanceof fk2) || (obj instanceof r19) || (obj instanceof q19) || ((obj instanceof StyleSpan) && ((StyleSpan) obj).getStyle() == 1))) {
                                                            spannable.removeSpan(obj);
                                                        }
                                                    }
                                                } catch (Exception e6) {
                                                    e = e6;
                                                    staticLayout = null;
                                                    b2 = 3;
                                                    this.f3 = staticLayout;
                                                    cc4.f(e);
                                                    this.n3 = hm.update(0, (View) this, this.n3, this.f3);
                                                    z13 = ob6.a0;
                                                    StaticLayout staticLayout4222 = this.A2;
                                                    if (z13) {
                                                    }
                                                    staticLayout2 = this.g3;
                                                    if (staticLayout2 != null) {
                                                    }
                                                    m0();
                                                }
                                            }
                                            if ((!this.s2 || xea.l1) && !U() && this.K0 != 0 && this.N0 > 1) {
                                                this.b0 = aob.E0[this.F0 ? 1 : 0];
                                                charSequence21 = charSequence18;
                                                charSequence22 = null;
                                            } else {
                                                if ((this.s2 || xea.l1) && !U() && charSequence18 == null) {
                                                    charSequence23 = charSequence17;
                                                    if (xc2.p0(this.h2)) {
                                                        charSequence23 = charSequence17;
                                                    }
                                                    charSequence22 = charSequence18;
                                                    charSequence21 = charSequence23;
                                                }
                                                charSequence23 = (Y() || !(charSequence17 instanceof Spanned) || ((mf3[]) ((Spanned) charSequence17).getSpans(0, charSequence17.length(), mf3.class)).length > 0) ? TextUtils.ellipsize(charSequence17, this.b0, max - hl.L(12.0f), TextUtils.TruncateAt.END) : TextUtils.ellipsize(charSequence17, this.b0, max - hl.L(((this.M4 + 2) * this.S1) + 15), TextUtils.TruncateAt.END);
                                                charSequence22 = charSequence18;
                                                charSequence21 = charSequence23;
                                            }
                                            Layout.Alignment alignment222 = Layout.Alignment.ALIGN_NORMAL;
                                            if ((!this.s2 || xea.l1) && !U()) {
                                                if (this.S1 > 0 && charSequence22 != null) {
                                                    max += hl.L(5.0f);
                                                }
                                                int i25222 = max;
                                                TextPaint textPaint6222 = this.b0;
                                                float L9222 = hl.L(1.0f);
                                                TextUtils.TruncateAt truncateAt222 = TextUtils.TruncateAt.END;
                                                this.f3 = o0b.b(charSequence21, textPaint6222, i25222, L9222, i25222, charSequence22 == null ? 1 : 2);
                                                max = i25222;
                                            } else {
                                                if (this.S1 > 0) {
                                                    max += hl.L(((this.M4 + 2) * r0) + 3);
                                                    if (ob6.a0 && !Y()) {
                                                        this.c3 -= hl.L(((this.M4 + 2) * this.S1) + 3);
                                                    }
                                                }
                                                int i54 = max;
                                                try {
                                                    this.f3 = new StaticLayout(charSequence21, this.b0, i54, alignment222, 1.0f, 0.0f, false);
                                                    max = i54;
                                                } catch (Exception e7) {
                                                    e = e7;
                                                    b2 = 3;
                                                    max = i54;
                                                    staticLayout = null;
                                                    this.f3 = staticLayout;
                                                    cc4.f(e);
                                                    this.n3 = hm.update(0, (View) this, this.n3, this.f3);
                                                    z13 = ob6.a0;
                                                    StaticLayout staticLayout42222 = this.A2;
                                                    if (z13) {
                                                    }
                                                    staticLayout2 = this.g3;
                                                    if (staticLayout2 != null) {
                                                    }
                                                    m0();
                                                }
                                            }
                                            this.j3.addAll(this.k3);
                                            this.k3.clear();
                                            b2 = 3;
                                            npa.b(this, this.f3, -2, -2, this.j3, this.k3);
                                            this.n3 = hm.update(0, (View) this, this.n3, this.f3);
                                            z13 = ob6.a0;
                                            StaticLayout staticLayout422222 = this.A2;
                                            if (z13) {
                                                if (staticLayout422222 != null && staticLayout422222.getLineCount() > 0) {
                                                    float lineRight = this.A2.getLineRight(0);
                                                    if (this.E2) {
                                                        lineRight = Math.min(this.z2, lineRight);
                                                    }
                                                    if (lineRight == this.z2) {
                                                        double ceil2 = Math.ceil(this.A2.getLineWidth(0));
                                                        if (this.E2) {
                                                            ceil2 = Math.min(this.z2, ceil2);
                                                        }
                                                        double d2 = this.z2;
                                                        if (ceil2 < d2) {
                                                            this.y2 = (int) (this.y2 - (d2 - ceil2));
                                                        }
                                                    }
                                                    if (this.l4) {
                                                        this.y2 = hl.L(21.0f) + this.y2;
                                                    }
                                                    int L36 = (int) (this.y2 + lineRight + hl.L(6.0f));
                                                    this.I2 = L36;
                                                    if (this.m4) {
                                                        this.J2 = hl.L(30.0f) + L36;
                                                    } else if (this.q4 == b2) {
                                                        this.J2 = hl.L(6.0f) + aob.h1.getIntrinsicWidth() + L36;
                                                    }
                                                }
                                                StaticLayout staticLayout5 = this.f3;
                                                float f11 = 2.1474836E9f;
                                                if (staticLayout5 != null && (lineCount3 = staticLayout5.getLineCount()) > 0) {
                                                    float f12 = 2.1474836E9f;
                                                    for (int i55 = 0; i55 < lineCount3; i55++) {
                                                        f12 = Math.min(f12, this.f3.getLineLeft(i55));
                                                    }
                                                    this.c3 = (int) (this.c3 - f12);
                                                }
                                                StaticLayout staticLayout6 = this.i3;
                                                if (staticLayout6 != null && (lineCount2 = staticLayout6.getLineCount()) > 0) {
                                                    float f13 = 2.1474836E9f;
                                                    for (int i56 = 0; i56 < lineCount2; i56++) {
                                                        f13 = Math.min(f13, this.i3.getLineLeft(i56));
                                                    }
                                                    this.d3 = (int) (this.d3 - f13);
                                                }
                                                StaticLayout staticLayout7 = this.g3;
                                                if (staticLayout7 != null && (lineCount = staticLayout7.getLineCount()) > 0) {
                                                    for (int i57 = 0; i57 < lineCount; i57++) {
                                                        f11 = Math.min(f11, this.g3.getLineLeft(i57));
                                                    }
                                                    this.e3 = (int) (this.e3 - f11);
                                                }
                                                StaticLayout staticLayout8 = this.t3;
                                                if (staticLayout8 != null && staticLayout8.getLineCount() > 0) {
                                                    this.s3 = (int) (this.s3 - this.t3.getLineLeft(0));
                                                }
                                            } else {
                                                if (staticLayout422222 != null && staticLayout422222.getLineCount() > 0) {
                                                    float lineLeft = this.A2.getLineLeft(0);
                                                    double ceil3 = Math.ceil(this.A2.getLineWidth(0));
                                                    int L37 = hl.L(12.0f) + this.y2;
                                                    this.y2 = L37;
                                                    if (this.l4) {
                                                        this.y2 = hl.L(21.0f) + L37;
                                                    }
                                                    if (this.E2) {
                                                        ceil3 = Math.min(this.z2, ceil3);
                                                    }
                                                    boolean z34 = this.a1;
                                                    if ((z34 || this.c1 || this.d1 > 0.0f) && this.q4 == b2) {
                                                        int L38 = (int) ((((this.z2 - ceil3) + this.y2) - hl.L(6.0f)) - aob.h1.getIntrinsicWidth());
                                                        this.I2 = L38;
                                                        this.J2 = (L38 - hl.L(6.0f)) - aob.b1.getIntrinsicWidth();
                                                    } else if ((z34 || this.c1 || this.d1 > 0.0f) && !this.k4 && this.q4 == 0) {
                                                        boolean z35 = this.m4;
                                                        int i58 = this.y2;
                                                        int i59 = this.z2;
                                                        if (z35) {
                                                            int L39 = (int) ((((i59 - ceil3) - lineLeft) + i58) - hl.L(24.0f));
                                                            this.I2 = L39;
                                                            this.J2 = (L39 - hl.L(6.0f)) - aob.b1.getIntrinsicWidth();
                                                        } else {
                                                            this.I2 = (int) ((((i59 - ceil3) + i58) - hl.L(6.0f)) - aob.b1.getIntrinsicWidth());
                                                        }
                                                    } else if (this.k4) {
                                                        this.I2 = (int) ((((this.z2 - ceil3) + this.y2) - hl.L(6.0f)) - aob.e1.getIntrinsicWidth());
                                                    } else if (this.m4) {
                                                        int L40 = (int) ((((this.z2 - ceil3) - lineLeft) + this.y2) - hl.L(24.0f));
                                                        this.I2 = L40;
                                                        this.J2 = (L40 - hl.L(6.0f)) - aob.b1.getIntrinsicWidth();
                                                    } else {
                                                        byte b5 = this.q4;
                                                        int i60 = this.y2;
                                                        int i61 = this.z2;
                                                        if (b5 != 0) {
                                                            double L41 = ((i61 - ceil3) + i60) - hl.L(6.0f);
                                                            byte b6 = this.q4;
                                                            this.I2 = (int) (L41 - (b6 != 1 ? b6 != b2 ? aob.g1 : aob.h1 : aob.f1).getIntrinsicWidth());
                                                        } else {
                                                            this.I2 = (int) ((((i61 - ceil3) + i60) - hl.L(6.0f)) - aob.b1.getIntrinsicWidth());
                                                        }
                                                    }
                                                    if (lineLeft == 0.0f) {
                                                        double d3 = this.z2;
                                                        if (ceil3 < d3) {
                                                            this.y2 = (int) ((d3 - ceil3) + this.y2);
                                                        }
                                                    }
                                                }
                                                StaticLayout staticLayout9 = this.f3;
                                                int i62 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                if (staticLayout9 != null && (lineCount6 = staticLayout9.getLineCount()) > 0) {
                                                    int i63 = Integer.MAX_VALUE;
                                                    int i64 = 0;
                                                    while (true) {
                                                        if (i64 >= lineCount6) {
                                                            break;
                                                        }
                                                        if (this.f3.getLineLeft(i64) != 0.0f) {
                                                            i63 = 0;
                                                            break;
                                                        } else {
                                                            i63 = Math.min(i63, (int) (max - Math.ceil(this.f3.getLineWidth(i64))));
                                                            i64++;
                                                        }
                                                    }
                                                    if (i63 != Integer.MAX_VALUE) {
                                                        this.c3 += i63;
                                                    }
                                                }
                                                StaticLayout staticLayout10 = this.g3;
                                                if (staticLayout10 != null && (lineCount5 = staticLayout10.getLineCount()) > 0) {
                                                    int i65 = Integer.MAX_VALUE;
                                                    int i66 = 0;
                                                    while (true) {
                                                        if (i66 >= lineCount5) {
                                                            break;
                                                        }
                                                        if (this.g3.getLineLeft(i66) != 0.0f) {
                                                            i65 = 0;
                                                            break;
                                                        } else {
                                                            i65 = Math.min(i65, (int) (max - Math.ceil(this.g3.getLineWidth(i66))));
                                                            i66++;
                                                        }
                                                    }
                                                    if (i65 != Integer.MAX_VALUE) {
                                                        this.e3 += i65;
                                                    }
                                                }
                                                StaticLayout staticLayout11 = this.t3;
                                                if (staticLayout11 != null && staticLayout11.getLineCount() > 0 && this.t3.getLineLeft(0) == 0.0f) {
                                                    double ceil4 = Math.ceil(this.t3.getLineWidth(0));
                                                    double d4 = max;
                                                    if (ceil4 < d4) {
                                                        this.s3 = (int) ((d4 - ceil4) + this.s3);
                                                    }
                                                }
                                                StaticLayout staticLayout12 = this.i3;
                                                if (staticLayout12 != null && (lineCount4 = staticLayout12.getLineCount()) > 0) {
                                                    for (int i67 = 0; i67 < lineCount4; i67++) {
                                                        i62 = (int) Math.min(i62, this.i3.getWidth() - this.i3.getLineRight(i67));
                                                    }
                                                    this.d3 += i62;
                                                }
                                            }
                                            staticLayout2 = this.g3;
                                            if (staticLayout2 != null && this.k2 >= 0 && staticLayout2.getText().length() > 0) {
                                                if (i7 >= 0 || (i15 = i7 + 1) >= this.g3.getText().length()) {
                                                    primaryHorizontal = this.g3.getPrimaryHorizontal(0);
                                                    primaryHorizontal2 = this.g3.getPrimaryHorizontal(1);
                                                } else {
                                                    primaryHorizontal = this.g3.getPrimaryHorizontal(i7);
                                                    primaryHorizontal2 = this.g3.getPrimaryHorizontal(i15);
                                                }
                                                int i68 = this.e3;
                                                if (primaryHorizontal >= primaryHorizontal2) {
                                                    this.D4 = (int) (i68 + primaryHorizontal);
                                                } else {
                                                    this.D4 = (int) (i68 + primaryHorizontal2 + hl.L(3.0f));
                                                }
                                            }
                                            m0();
                                        }
                                        str17 = ob6.L0(2131754129);
                                    }
                                    str19 = str27;
                                    i7 = i4;
                                    charSequence16 = str17;
                                    str27 = str15;
                                    charSequence15 = charSequence4;
                                    str20 = str14;
                                    charSequence19 = charSequence5;
                                }
                                str13 = "";
                                r47Var4 = this.g1;
                                if (r47Var4 != null) {
                                }
                                this.R2 = false;
                                this.S2 = false;
                                this.T2 = r47Var4 == null && r47Var4.n4() && this.I0 == yac.h(this.G0).e();
                                z7 = false;
                                this.H3 = false;
                                this.c4 = false;
                                this.d4 = false;
                                this.e4 = false;
                                this.u3 = false;
                                str14 = str3;
                                str15 = str14;
                                this.Q2 = z7;
                                s1 = uc7.s1(this.G0);
                                if (this.k1 == 0) {
                                    this.A3 = true;
                                    this.Q2 = true;
                                    i8 = s1.t2;
                                    if (i8 != 0) {
                                    }
                                }
                                str16 = str13;
                                str17 = this.M0;
                                if (str17 == null) {
                                }
                                str19 = str27;
                                i7 = i4;
                                charSequence16 = str17;
                                str27 = str15;
                                charSequence15 = charSequence4;
                                str20 = str14;
                                charSequence19 = charSequence5;
                            }
                        }
                    }
                    if (xc2.T(this.h2)) {
                        TLRPC.Chat chat11 = this.h2;
                        if (!chat11.megagroup) {
                            if (!chat11.creator) {
                                TLRPC.TL_chatAdminRights tL_chatAdminRights = chat11.admin_rights;
                                if (tL_chatAdminRights != null) {
                                }
                                this.m2 = null;
                                this.l2 = false;
                                str2 = "d ";
                                if (!Y()) {
                                }
                                if (!this.y0) {
                                    this.z0 = true;
                                    SpannableStringBuilder spannableStringBuilder112 = new SpannableStringBuilder(charSequence5);
                                    spannableStringBuilder112.insert(0, (CharSequence) str2);
                                    wm2 wm2Var32 = new wm2(getContext().getDrawable(R.drawable.mini_gift).mutate());
                                    wm2Var32.I = 1.25f;
                                    wm2Var32.J = 1.25f;
                                    wm2Var32.H = 0.9f;
                                    wm2Var32.x = 0.9f;
                                    spannableStringBuilder112.setSpan(wm2Var32, 0, 1, 0);
                                    tL_textWithEntities = ((TLRPC.TL_messageActionStarGift) this.g1.k.action).message;
                                    if (tL_textWithEntities != null) {
                                        this.b0 = aob.E0[this.F0 ? 1 : 0];
                                    }
                                    charSequence5 = spannableStringBuilder112;
                                }
                                if (TextUtils.isEmpty(this.J0)) {
                                }
                                str13 = "";
                                r47Var4 = this.g1;
                                if (r47Var4 != null) {
                                }
                                this.R2 = false;
                                this.S2 = false;
                                this.T2 = r47Var4 == null && r47Var4.n4() && this.I0 == yac.h(this.G0).e();
                                z7 = false;
                                this.H3 = false;
                                this.c4 = false;
                                this.d4 = false;
                                this.e4 = false;
                                this.u3 = false;
                                str14 = str3;
                                str15 = str14;
                                this.Q2 = z7;
                                s1 = uc7.s1(this.G0);
                                if (this.k1 == 0) {
                                }
                                str16 = str13;
                                str17 = this.M0;
                                if (str17 == null) {
                                }
                                str19 = str27;
                                i7 = i4;
                                charSequence16 = str17;
                                str27 = str15;
                                charSequence15 = charSequence4;
                                str20 = str14;
                                charSequence19 = charSequence5;
                            }
                        }
                    }
                    chat = this.h2;
                    if (chat != null) {
                        if (chat.left) {
                        }
                        this.m2 = null;
                        this.l2 = false;
                        str2 = "d ";
                        if (!Y()) {
                        }
                        if (!this.y0) {
                        }
                        if (TextUtils.isEmpty(this.J0)) {
                        }
                        str13 = "";
                        r47Var4 = this.g1;
                        if (r47Var4 != null) {
                        }
                        this.R2 = false;
                        this.S2 = false;
                        this.T2 = r47Var4 == null && r47Var4.n4() && this.I0 == yac.h(this.G0).e();
                        z7 = false;
                        this.H3 = false;
                        this.c4 = false;
                        this.d4 = false;
                        this.e4 = false;
                        this.u3 = false;
                        str14 = str3;
                        str15 = str14;
                        this.Q2 = z7;
                        s1 = uc7.s1(this.G0);
                        if (this.k1 == 0) {
                        }
                        str16 = str13;
                        str17 = this.M0;
                        if (str17 == null) {
                        }
                        str19 = str27;
                        i7 = i4;
                        charSequence16 = str17;
                        str27 = str15;
                        charSequence15 = charSequence4;
                        str20 = str14;
                        charSequence19 = charSequence5;
                    }
                    if (xc2.c0(chat)) {
                    }
                    str2 = "d ";
                    if (!Y()) {
                    }
                    if (!this.y0) {
                    }
                    if (TextUtils.isEmpty(this.J0)) {
                    }
                    str13 = "";
                    r47Var4 = this.g1;
                    if (r47Var4 != null) {
                    }
                    this.R2 = false;
                    this.S2 = false;
                    this.T2 = r47Var4 == null && r47Var4.n4() && this.I0 == yac.h(this.G0).e();
                    z7 = false;
                    this.H3 = false;
                    this.c4 = false;
                    this.d4 = false;
                    this.e4 = false;
                    this.u3 = false;
                    str14 = str3;
                    str15 = str14;
                    this.Q2 = z7;
                    s1 = uc7.s1(this.G0);
                    if (this.k1 == 0) {
                    }
                    str16 = str13;
                    str17 = this.M0;
                    if (str17 == null) {
                    }
                    str19 = str27;
                    i7 = i4;
                    charSequence16 = str17;
                    str27 = str15;
                    charSequence15 = charSequence4;
                    str20 = str14;
                    charSequence19 = charSequence5;
                }
                draftMessage = this.m2;
                if (draftMessage != null) {
                    if (i2 > draftMessage.date) {
                    }
                }
                if (xc2.T(this.h2)) {
                }
                chat = this.h2;
                if (chat != null) {
                }
                if (xc2.c0(chat)) {
                }
                str2 = "d ";
                if (!Y()) {
                }
                if (!this.y0) {
                }
                if (TextUtils.isEmpty(this.J0)) {
                }
                str13 = "";
                r47Var4 = this.g1;
                if (r47Var4 != null) {
                }
                this.R2 = false;
                this.S2 = false;
                this.T2 = r47Var4 == null && r47Var4.n4() && this.I0 == yac.h(this.G0).e();
                z7 = false;
                this.H3 = false;
                this.c4 = false;
                this.d4 = false;
                this.e4 = false;
                this.u3 = false;
                str14 = str3;
                str15 = str14;
                this.Q2 = z7;
                s1 = uc7.s1(this.G0);
                if (this.k1 == 0) {
                }
                str16 = str13;
                str17 = this.M0;
                if (str17 == null) {
                }
                str19 = str27;
                i7 = i4;
                charSequence16 = str17;
                str27 = str15;
                charSequence15 = charSequence4;
                str20 = str14;
                charSequence19 = charSequence5;
            }
            str = "%d";
            charSequence = charSequence25;
            i2 = this.S0;
            if (i2 == 0) {
                i2 = r47Var6.k.date;
            }
            if (!this.Q) {
            }
            if (!this.l2) {
            }
            draftMessage = this.m2;
            if (draftMessage != null) {
            }
            if (xc2.T(this.h2)) {
            }
            chat = this.h2;
            if (chat != null) {
            }
            if (xc2.c0(chat)) {
            }
            str2 = "d ";
            if (!Y()) {
            }
            if (!this.y0) {
            }
            if (TextUtils.isEmpty(this.J0)) {
            }
            str13 = "";
            r47Var4 = this.g1;
            if (r47Var4 != null) {
            }
            this.R2 = false;
            this.S2 = false;
            this.T2 = r47Var4 == null && r47Var4.n4() && this.I0 == yac.h(this.G0).e();
            z7 = false;
            this.H3 = false;
            this.c4 = false;
            this.d4 = false;
            this.e4 = false;
            this.u3 = false;
            str14 = str3;
            str15 = str14;
            this.Q2 = z7;
            s1 = uc7.s1(this.G0);
            if (this.k1 == 0) {
            }
            str16 = str13;
            str17 = this.M0;
            if (str17 == null) {
            }
            str19 = str27;
            i7 = i4;
            charSequence16 = str17;
            str27 = str15;
            charSequence15 = charSequence4;
            str20 = str14;
            charSequence19 = charSequence5;
        }
        charSequence18 = L0;
        charSequence17 = charSequence19;
        if (z5) {
        }
        if (M()) {
        }
        if (ob6.a0) {
        }
        if (this.H2) {
        }
        if (this.T2) {
        }
        if (this.a1) {
        }
        if (!this.m4) {
        }
        if (z11) {
        }
        if (this.l4) {
        }
        L7 = this.z2 - hl.L(12.0f);
        if (L7 < 0) {
        }
        if (charSequence16 instanceof String) {
        }
        if (this.E2) {
        }
        float f1022 = L7;
        this.S = aob.A0[this.F0 ? 1 : 0].measureText(charSequence16.toString()) > f1022;
        if (!this.R) {
        }
        CharSequence l322 = pv3.l(charSequence16, aob.A0[this.F0 ? 1 : 0].getFontMetricsInt(), false);
        r47 r47Var2222 = this.g1;
        if (r47Var2222 == null) {
        }
        if (this.R) {
        }
        this.C2 = (this.E2 || !staticLayout3.isRtlCharAt(0)) ? 0.0f : -hl.L(f3);
        this.D2 = this.A2.isRtlCharAt(0);
        this.q3 = hm.update(0, (View) this, this.q3, this.A2);
        if (this.s2) {
        }
        f4 = 39.0f;
        f5 = 8.0f;
        f6 = 13.0f;
        L = hl.L(11.0f);
        this.r3 = hl.L(32.0f);
        this.N2 = hl.L(13.0f);
        this.v3 = hl.L(42.33f);
        this.D3 = hl.L(43.0f);
        this.N3 = hl.L(42.33f);
        this.X2 = hl.L(13.0f);
        int measuredWidth4222 = getMeasuredWidth() - hl.L(this.J + 21);
        if (ob6.a0) {
        }
        this.v0.F.set(L2, L, hl.L(56.0f) + L2, hl.L(56.0f) + L);
        i11 = 0;
        while (true) {
            imageReceiverArr = this.W1;
            if (i11 < imageReceiverArr.length) {
            }
            imageReceiverArr[i11].i0(((this.M4 + 2) * i11) + L3, ((hl.L(31.0f) + L) + (this.R ? hl.L(20.0f) : 0)) - ((this.s2 || xea.l1 || (lycVar = this.u0) == null || lycVar.D()) ? 0 : hl.L(9.0f)), hl.L(18.0f), hl.L(18.0f));
            i11++;
        }
        i12 = measuredWidth4222;
        i13 = L;
        if (ob6.a0) {
        }
        if (this.R) {
        }
        if (!this.s2) {
            this.N2 -= hl.L(6.0f);
            this.X2 -= hl.L(6.0f);
            if (getIsPinned()) {
            }
            if (this.u3) {
            }
            if (this.u3) {
            }
            this.I3 = z12;
            if (z12) {
            }
            if (z16) {
            }
            max = Math.max(hl.L(12.0f), i12);
            this.h3 = hl.L((!this.s2 || xea.l1) ? 58.0f : 62.0f);
            if (!this.s2) {
                this.h3 -= hl.L(!Y() ? 10.0f : 12.0f);
                Y = Y();
                boolean z25222 = this.s2;
                if (!Y) {
                }
                if (this.R) {
                }
                this.o3 = hm.update(0, (View) this, this.o3, this.t3);
                if (TextUtils.isEmpty(str19)) {
                }
                this.p3 = hm.update(0, (View) this, this.p3, this.i3);
                if (!TextUtils.isEmpty(charSequence15)) {
                }
                if (charSequence17 instanceof Spannable) {
                }
                if (this.s2) {
                }
                this.b0 = aob.E0[this.F0 ? 1 : 0];
                charSequence21 = charSequence18;
                charSequence22 = null;
                Layout.Alignment alignment2222 = Layout.Alignment.ALIGN_NORMAL;
                if (this.s2) {
                }
                if (this.S1 > 0) {
                    max += hl.L(5.0f);
                }
                int i252222 = max;
                TextPaint textPaint62222 = this.b0;
                float L92222 = hl.L(1.0f);
                TextUtils.TruncateAt truncateAt2222 = TextUtils.TruncateAt.END;
                this.f3 = o0b.b(charSequence21, textPaint62222, i252222, L92222, i252222, charSequence22 == null ? 1 : 2);
                max = i252222;
                this.j3.addAll(this.k3);
                this.k3.clear();
                b2 = 3;
                npa.b(this, this.f3, -2, -2, this.j3, this.k3);
                this.n3 = hm.update(0, (View) this, this.n3, this.f3);
                z13 = ob6.a0;
                StaticLayout staticLayout4222222 = this.A2;
                if (z13) {
                }
                staticLayout2 = this.g3;
                if (staticLayout2 != null) {
                    if (i7 >= 0) {
                    }
                    primaryHorizontal = this.g3.getPrimaryHorizontal(0);
                    primaryHorizontal2 = this.g3.getPrimaryHorizontal(1);
                    int i682 = this.e3;
                    if (primaryHorizontal >= primaryHorizontal2) {
                    }
                }
                m0();
            }
            this.h3 -= hl.L(!Y() ? 10.0f : 12.0f);
            Y = Y();
            boolean z252222 = this.s2;
            if (!Y) {
            }
            if (this.R) {
            }
            this.o3 = hm.update(0, (View) this, this.o3, this.t3);
            if (TextUtils.isEmpty(str19)) {
            }
            this.p3 = hm.update(0, (View) this, this.p3, this.i3);
            if (!TextUtils.isEmpty(charSequence15)) {
            }
            if (charSequence17 instanceof Spannable) {
            }
            if (this.s2) {
            }
            this.b0 = aob.E0[this.F0 ? 1 : 0];
            charSequence21 = charSequence18;
            charSequence22 = null;
            Layout.Alignment alignment22222 = Layout.Alignment.ALIGN_NORMAL;
            if (this.s2) {
            }
            if (this.S1 > 0) {
            }
            int i2522222 = max;
            TextPaint textPaint622222 = this.b0;
            float L922222 = hl.L(1.0f);
            TextUtils.TruncateAt truncateAt22222 = TextUtils.TruncateAt.END;
            this.f3 = o0b.b(charSequence21, textPaint622222, i2522222, L922222, i2522222, charSequence22 == null ? 1 : 2);
            max = i2522222;
            this.j3.addAll(this.k3);
            this.k3.clear();
            b2 = 3;
            npa.b(this, this.f3, -2, -2, this.j3, this.k3);
            this.n3 = hm.update(0, (View) this, this.n3, this.f3);
            z13 = ob6.a0;
            StaticLayout staticLayout42222222 = this.A2;
            if (z13) {
            }
            staticLayout2 = this.g3;
            if (staticLayout2 != null) {
            }
            m0();
        }
        this.N2 -= hl.L(6.0f);
        this.X2 -= hl.L(6.0f);
        if (getIsPinned()) {
        }
        if (this.u3) {
        }
        if (this.u3) {
        }
        this.I3 = z12;
        if (z12) {
        }
        if (z16) {
        }
        max = Math.max(hl.L(12.0f), i12);
        this.h3 = hl.L((!this.s2 || xea.l1) ? 58.0f : 62.0f);
        if (!this.s2) {
        }
        this.h3 -= hl.L(!Y() ? 10.0f : 12.0f);
        Y = Y();
        boolean z2522222 = this.s2;
        if (!Y) {
        }
        if (this.R) {
        }
        this.o3 = hm.update(0, (View) this, this.o3, this.t3);
        if (TextUtils.isEmpty(str19)) {
        }
        this.p3 = hm.update(0, (View) this, this.p3, this.i3);
        if (!TextUtils.isEmpty(charSequence15)) {
        }
        if (charSequence17 instanceof Spannable) {
        }
        if (this.s2) {
        }
        this.b0 = aob.E0[this.F0 ? 1 : 0];
        charSequence21 = charSequence18;
        charSequence22 = null;
        Layout.Alignment alignment222222 = Layout.Alignment.ALIGN_NORMAL;
        if (this.s2) {
        }
        if (this.S1 > 0) {
        }
        int i25222222 = max;
        TextPaint textPaint6222222 = this.b0;
        float L9222222 = hl.L(1.0f);
        TextUtils.TruncateAt truncateAt222222 = TextUtils.TruncateAt.END;
        this.f3 = o0b.b(charSequence21, textPaint6222222, i25222222, L9222222, i25222222, charSequence22 == null ? 1 : 2);
        max = i25222222;
        this.j3.addAll(this.k3);
        this.k3.clear();
        b2 = 3;
        npa.b(this, this.f3, -2, -2, this.j3, this.k3);
        this.n3 = hm.update(0, (View) this, this.n3, this.f3);
        z13 = ob6.a0;
        StaticLayout staticLayout422222222 = this.A2;
        if (z13) {
        }
        staticLayout2 = this.g3;
        if (staticLayout2 != null) {
        }
        m0();
    }

    public final void D() {
        TLRPC.Message message;
        r47 r47Var = this.g1;
        if (r47Var == null || (message = r47Var.k) == null) {
            return;
        }
        TLRPC.MessageAction messageAction = message.action;
        if ((messageAction instanceof TLRPC.TL_messageActionSetChatTheme) && this.Y0) {
            af2 e = af2.e(this.G0);
            long j = this.I0;
            TLRPC.ChatTheme chatTheme = ((TLRPC.TL_messageActionSetChatTheme) messageAction).theme;
            e.q(j, dpb.c(chatTheme), chatTheme, false);
        }
    }

    public final void E() {
        TLRPC.Chat chat = this.h2;
        boolean z = chat != null && chat.call_active && chat.call_not_empty;
        this.w2 = z;
        this.r1 = z ? 1.0f : 0.0f;
    }

    public final void F() {
        TLRPC.User X1;
        if (this.g2 != null && (X1 = uc7.s1(this.G0).X1(Long.valueOf(this.g2.id))) != null) {
            this.g2 = X1;
        }
        this.q1 = Z() ? 1.0f : 0.0f;
    }

    public final void G() {
        za zaVar;
        boolean z = this.m0 > 0 && !this.w2 && !Z() && ((zaVar = this.r2) == null || !zaVar.a.q) && !this.v0.w;
        this.x2 = z;
        this.n0 = z ? 1.0f : 0.0f;
    }

    public final int H() {
        if (!Y() || this.k0 || this.f) {
            return getCollapsedHeight();
        }
        int L = hl.L((this.s2 || xea.l1) ? 86.0f : 91.0f);
        if (this.t2) {
            L++;
        }
        return U() ? hl.L(this.N) + L : L;
    }

    public final void I(int i, int i2) {
        this.z4 = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.B4 = ofFloat;
        ofFloat.setDuration(220L);
        this.B4.setInterpolator(k43.f);
        this.x4 = i;
        this.w4 = i2;
        this.B4.addUpdateListener(new ef3(this, (byte) 2));
        this.B4.addListener(new hf3(this, (byte) 2));
        this.A4 = true;
        this.B4.start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0225, code lost:
    
        if (r3 > 0) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0725  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0730  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0640  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x06c5  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x06d2  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x06f4  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0717  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0703  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0325  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean J(Canvas canvas) {
        boolean z;
        float f;
        float L;
        int i;
        float L2;
        float L3;
        float L4;
        float f2;
        float L5;
        float L6;
        float L7;
        float f3;
        float L8;
        float L9;
        float f4;
        float L10;
        float L11;
        float f5;
        float f6;
        float f7;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        float L12;
        ImageReceiver imageReceiver;
        Drawable drawable;
        Drawable drawable2;
        BitmapShader bitmapShader;
        za zaVar;
        BitmapShader bitmapShader2;
        al8 al8Var;
        TLRPC.Chat chat = this.h2;
        boolean z6 = false;
        if (chat == null || (chat.flags2 & 2048) == 0) {
            z = false;
        } else {
            float x = this.Z1.x();
            float w = this.Z1.w();
            za zaVar2 = this.r2;
            float progress = (zaVar2 == null || !zaVar2.a.q) ? 1.0f : 1.0f - zaVar2.getProgress();
            if (this.X4 == null) {
                this.X4 = getContext().getResources().getDrawable(R.drawable.star_small_outline).mutate();
            }
            int w0 = aob.w0(null, aob.d6, false);
            if (this.V4 != w0) {
                Drawable drawable3 = this.X4;
                this.V4 = w0;
                drawable3.setColorFilter(new PorterDuffColorFilter(w0, PorterDuff.Mode.SRC_IN));
            }
            if (this.W4 == null) {
                this.W4 = getContext().getResources().getDrawable(R.drawable.star_small_inner).mutate();
            }
            int L13 = hl.L(19.33f);
            Rect rect = hl.Q;
            int i2 = (int) w;
            int i3 = (int) x;
            int i4 = i3 - L13;
            rect.set((hl.L(1.66f) + i2) - L13, i4, hl.L(1.66f) + i2, i3);
            rect.inset(-hl.L(1.0f), -hl.L(1.0f));
            this.X4.setBounds(rect);
            int i5 = (int) (progress * 255.0f);
            this.X4.setAlpha(i5);
            this.X4.draw(canvas);
            rect.set((hl.L(1.66f) + i2) - L13, i4, hl.L(1.66f) + i2, i3);
            this.W4.setBounds(rect);
            this.W4.setAlpha(i5);
            this.W4.draw(canvas);
            z = true;
        }
        float d = this.n2.d(this.o2 && !z);
        float f8 = 10.0f;
        if (d > 0.0f) {
            float s = this.Z1.s() + hl.L(18.0f);
            float r = this.Z1.r() + hl.L(18.0f);
            canvas.save();
            aob.s0.setColor(aob.v0(aob.d6, this.K4));
            canvas.drawCircle(r, s, hl.L(11.33f) * d, aob.s0);
            al8 al8Var2 = this.T4;
            if (al8Var2 == null) {
                al8 al8Var3 = new al8(aob.Ck, aob.Dk, -1, -1, this.K4);
                this.T4 = al8Var3;
                al8Var = al8Var3;
            } else {
                al8Var = al8Var2;
            }
            al8Var.d((int) (r - hl.L(10.0f)), 0.0f, (int) (s - hl.L(10.0f)), (int) (hl.L(10.0f) + r), 0.0f, (int) (hl.L(10.0f) + s));
            canvas.drawCircle(r, s, hl.L(10.0f) * d, this.T4.f);
            if (this.U4 == null) {
                Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_lock2).mutate();
                this.U4 = mutate;
                mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            }
            this.U4.setBounds((int) (r - (((r4.getIntrinsicWidth() / 2.0f) * 0.875f) * d)), (int) (s - (((this.U4.getIntrinsicHeight() / 2.0f) * 0.875f) * d)), (int) (((this.U4.getIntrinsicWidth() / 2.0f) * 0.875f * d) + r), (int) (((this.U4.getIntrinsicHeight() / 2.0f) * 0.875f * d) + s));
            this.U4.setAlpha((int) (d * 255.0f));
            this.U4.draw(canvas);
            canvas.restore();
            return false;
        }
        if (!this.O0 || this.K0 != 0 || z) {
            return false;
        }
        boolean z7 = (this.m0 <= 0 || Z() || this.w2 || this.v0.w) ? false : true;
        this.x2 = z7;
        if (this.j0 != 1.0f && (z7 || this.n0 > 0.0f)) {
            rsb rsbVar = this.o0;
            if (rsbVar != null) {
                int i6 = rsbVar.f;
                int i7 = this.m0;
                if (i6 != i7) {
                }
                if (this.p0 == null) {
                    this.p0 = new Paint(1);
                    Paint paint = new Paint(1);
                    this.q0 = paint;
                    paint.setColor(838860800);
                }
                int x2 = (int) (this.Z1.x() - hl.L(9.0f));
                boolean z8 = ob6.a0;
                gf3 gf3Var = this.v0;
                int L14 = (int) (!z8 ? gf3Var.F.left + hl.L(9.0f) : gf3Var.F.right - hl.L(9.0f));
                this.o0.setBounds(0, 0, hl.L(22.0f), hl.L(22.0f));
                this.o0.b(this.m0);
                imageReceiver = this.Z1;
                drawable = imageReceiver.b0;
                if (drawable != null || (bitmapShader2 = imageReceiver.c0) == null) {
                    drawable2 = imageReceiver.n0;
                    if (drawable2 != null || (bitmapShader = imageReceiver.d0) == null) {
                        this.p0.setShader(null);
                        if (this.Z1.n() == null && !this.Z1.n().isRecycled()) {
                            this.p0.setColor(hl.I0(this.Z1.n()));
                        } else if (this.Z1.t() instanceof idc) {
                            Paint paint2 = this.p0;
                            rb0 rb0Var = this.b2;
                            boolean z9 = rb0Var.g;
                            int i8 = rb0Var.e;
                            if (z9) {
                                ynb i9 = aob.I.i(false);
                                i8 = aob.B(aob.I, i9 != null ? i9.c : 0, i8);
                            }
                            paint2.setColor(i8);
                        } else {
                            this.p0.setColor(((idc) this.Z1.t()).a.a());
                        }
                        canvas.save();
                        float f9 = (1.0f - this.j0) * this.n0;
                        zaVar = this.r2;
                        if (zaVar != null) {
                            f9 *= 1.0f - zaVar.getProgress();
                        }
                        float f10 = L14;
                        float f11 = x2;
                        canvas.scale(f9, f9, f10, f11);
                        canvas.drawCircle(f10, f11, hl.N(11.0f), this.p0);
                        canvas.drawCircle(f10, f11, hl.N(11.0f), this.q0);
                        canvas.save();
                        canvas.translate(f10 - hl.N(11.0f), f11 - hl.N(11.0f));
                        this.o0.draw(canvas);
                        canvas.restore();
                        canvas.restore();
                    } else {
                        imageReceiver.j(null, drawable2, jn7.d4, bitmapShader, 0, 0, 0, null);
                    }
                } else {
                    imageReceiver.j(null, drawable, jn7.d4, bitmapShader2, 0, 0, 0, null);
                }
                ImageReceiver imageReceiver2 = this.Z1;
                BitmapShader bitmapShader3 = imageReceiver2.c0;
                if (bitmapShader3 != null) {
                    this.p0.setShader(bitmapShader3);
                } else {
                    BitmapShader bitmapShader4 = imageReceiver2.d0;
                    if (bitmapShader4 != null) {
                        this.p0.setShader(bitmapShader4);
                    }
                }
                canvas.save();
                float f92 = (1.0f - this.j0) * this.n0;
                zaVar = this.r2;
                if (zaVar != null) {
                }
                float f102 = L14;
                float f112 = x2;
                canvas.scale(f92, f92, f102, f112);
                canvas.drawCircle(f102, f112, hl.N(11.0f), this.p0);
                canvas.drawCircle(f102, f112, hl.N(11.0f), this.q0);
                canvas.save();
                canvas.translate(f102 - hl.N(11.0f), f112 - hl.N(11.0f));
                this.o0.draw(canvas);
                canvas.restore();
                canvas.restore();
            }
            int i10 = this.m0;
            rsb rsbVar2 = new rsb(a.b, null);
            rsbVar2.m = true;
            rsbVar2.b(i10);
            this.o0 = rsbVar2;
            if (this.p0 == null) {
            }
            int x22 = (int) (this.Z1.x() - hl.L(9.0f));
            boolean z82 = ob6.a0;
            gf3 gf3Var2 = this.v0;
            int L142 = (int) (!z82 ? gf3Var2.F.left + hl.L(9.0f) : gf3Var2.F.right - hl.L(9.0f));
            this.o0.setBounds(0, 0, hl.L(22.0f), hl.L(22.0f));
            this.o0.b(this.m0);
            imageReceiver = this.Z1;
            drawable = imageReceiver.b0;
            if (drawable != null) {
            }
            drawable2 = imageReceiver.n0;
            if (drawable2 != null) {
            }
            this.p0.setShader(null);
            if (this.Z1.n() == null) {
            }
            if (this.Z1.t() instanceof idc) {
            }
            canvas.save();
            float f922 = (1.0f - this.j0) * this.n0;
            zaVar = this.r2;
            if (zaVar != null) {
            }
            float f1022 = L142;
            float f1122 = x22;
            canvas.scale(f922, f922, f1022, f1122);
            canvas.drawCircle(f1022, f1122, hl.N(11.0f), this.p0);
            canvas.drawCircle(f1022, f1122, hl.N(11.0f), this.q0);
            canvas.save();
            canvas.translate(f1022 - hl.N(11.0f), f1122 - hl.N(11.0f));
            this.o0.draw(canvas);
            canvas.restore();
            canvas.restore();
        }
        TLRPC.User user = this.g2;
        if (user == null || uc7.K2(user) || this.g2.bot) {
            TLRPC.Chat chat2 = this.h2;
            if (chat2 != null) {
                boolean z10 = chat2.call_active && chat2.call_not_empty;
                this.w2 = z10;
                if ((z10 || this.r1 != 0.0f) && this.j0 < 1.0f) {
                    za zaVar3 = this.r2;
                    float progress2 = (zaVar3 == null || !zaVar3.a.q) ? 1.0f : 1.0f - zaVar3.getProgress();
                    int L15 = (int) (this.v0.F.bottom - hl.L((this.s2 || xea.l1) ? 6.0f : 8.0f));
                    boolean z11 = ob6.a0;
                    f = 0.10666667f;
                    gf3 gf3Var3 = this.v0;
                    if (z11) {
                        float f12 = gf3Var3.F.left;
                        if (!this.s2 && !xea.l1) {
                            f8 = 6.0f;
                        }
                        L = f12 + hl.L(f8);
                    } else {
                        float f13 = gf3Var3.F.right;
                        if (!this.s2 && !xea.l1) {
                            f8 = 6.0f;
                        }
                        L = f13 - hl.L(f8);
                    }
                    int i11 = (int) L;
                    if (this.j0 != 0.0f) {
                        canvas.save();
                        float f14 = 1.0f - this.j0;
                        canvas.scale(f14, f14, i11, L15);
                    }
                    Paint paint3 = aob.s0;
                    int i12 = aob.d6;
                    paint3.setColor(aob.v0(i12, this.K4));
                    float f15 = i11;
                    float f16 = L15;
                    canvas.drawCircle(f15, f16, hl.L(11.0f) * this.r1 * progress2, aob.s0);
                    aob.s0.setColor(aob.v0(aob.T8, this.K4));
                    canvas.drawCircle(f15, f16, hl.L(9.0f) * this.r1 * progress2, aob.s0);
                    aob.s0.setColor(aob.v0(i12, this.K4));
                    if (!i86.e(360928)) {
                        this.s1 = 0.65f;
                    }
                    int i13 = this.t1;
                    if (i13 != 0) {
                        i = 360928;
                        if (i13 != 1) {
                            if (i13 != 2) {
                                if (i13 == 3) {
                                    L2 = hl.L(3.0f) - (hl.L(2.0f) * this.s1);
                                    L3 = hl.L(1.0f);
                                    L4 = hl.L(2.0f);
                                    f2 = this.s1;
                                } else if (i13 == 4) {
                                    L2 = (hl.L(4.0f) * this.s1) + hl.L(1.0f);
                                    L10 = hl.L(3.0f);
                                    L11 = hl.L(2.0f);
                                    f5 = this.s1;
                                } else if (i13 == 5) {
                                    L5 = hl.L(5.0f) - (hl.L(4.0f) * this.s1);
                                    L8 = hl.L(1.0f);
                                    L9 = hl.L(4.0f);
                                    f4 = this.s1;
                                } else if (i13 == 6) {
                                    L5 = hl.L(1.0f) + (hl.L(4.0f) * this.s1);
                                    L6 = hl.L(5.0f);
                                    L7 = hl.L(4.0f);
                                    f3 = this.s1;
                                } else {
                                    L2 = hl.L(5.0f) - (hl.L(4.0f) * this.s1);
                                    L3 = hl.L(1.0f);
                                    L4 = hl.L(2.0f);
                                    f2 = this.s1;
                                }
                                f6 = L3 + (L4 * f2);
                                if (this.r1 >= 1.0f || progress2 < 1.0f) {
                                    canvas.save();
                                    float f17 = this.r1 * progress2;
                                    canvas.scale(f17, f17, f15, f16);
                                }
                                z2 = true;
                                this.s4.set(i11 - hl.L(1.0f), f16 - L2, hl.L(1.0f) + i11, L2 + f16);
                                canvas.drawRoundRect(this.s4, hl.L(1.0f), hl.L(1.0f), aob.s0);
                                float f18 = f16 - f6;
                                float f19 = f16 + f6;
                                this.s4.set(i11 - hl.L(5.0f), f18, i11 - hl.L(3.0f), f19);
                                canvas.drawRoundRect(this.s4, hl.L(1.0f), hl.L(1.0f), aob.s0);
                                this.s4.set(hl.L(3.0f) + i11, f18, hl.L(5.0f) + i11, f19);
                                canvas.drawRoundRect(this.s4, hl.L(1.0f), hl.L(1.0f), aob.s0);
                                if (this.r1 >= 1.0f || progress2 < 1.0f) {
                                    canvas.restore();
                                }
                                if (i86.e(i)) {
                                    float f20 = this.s1 + 0.04f;
                                    this.s1 = f20;
                                    if (f20 >= 1.0f) {
                                        this.s1 = 0.0f;
                                        int i14 = this.t1 + 1;
                                        this.t1 = i14;
                                        if (i14 >= 8) {
                                            this.t1 = 0;
                                        }
                                    }
                                    z6 = true;
                                }
                                z3 = this.w2;
                                float f21 = this.r1;
                                if (z3) {
                                    if (f21 > 0.0f) {
                                        float f22 = f21 - 0.10666667f;
                                        this.r1 = f22;
                                        if (f22 < 0.0f) {
                                            this.r1 = 0.0f;
                                        }
                                    }
                                } else if (f21 < 1.0f) {
                                    float f23 = f21 + 0.10666667f;
                                    this.r1 = f23;
                                    if (f23 > 1.0f) {
                                        this.r1 = 1.0f;
                                    }
                                }
                                if (this.j0 != 0.0f) {
                                    canvas.restore();
                                }
                                z4 = this.x2;
                                float f24 = this.n0;
                                if (z4) {
                                    if (f24 < 1.0f) {
                                        f24 += f;
                                        this.n0 = f24;
                                        z5 = z2;
                                    }
                                    z5 = z6;
                                } else {
                                    if (f24 > 0.0f) {
                                        f24 -= f;
                                        this.n0 = f24;
                                        z5 = z2;
                                    }
                                    z5 = z6;
                                }
                                this.n0 = Utilities.i(f24, 1.0f, 0.0f);
                                return z5;
                            }
                            L5 = hl.L(1.0f) + (hl.L(2.0f) * this.s1);
                            L6 = hl.L(5.0f);
                            L7 = hl.L(4.0f);
                            f3 = this.s1;
                            f7 = L6 - (L7 * f3);
                            L2 = L5;
                            f6 = f7;
                            if (this.r1 >= 1.0f) {
                            }
                            canvas.save();
                            float f172 = this.r1 * progress2;
                            canvas.scale(f172, f172, f15, f16);
                            z2 = true;
                            this.s4.set(i11 - hl.L(1.0f), f16 - L2, hl.L(1.0f) + i11, L2 + f16);
                            canvas.drawRoundRect(this.s4, hl.L(1.0f), hl.L(1.0f), aob.s0);
                            float f182 = f16 - f6;
                            float f192 = f16 + f6;
                            this.s4.set(i11 - hl.L(5.0f), f182, i11 - hl.L(3.0f), f192);
                            canvas.drawRoundRect(this.s4, hl.L(1.0f), hl.L(1.0f), aob.s0);
                            this.s4.set(hl.L(3.0f) + i11, f182, hl.L(5.0f) + i11, f192);
                            canvas.drawRoundRect(this.s4, hl.L(1.0f), hl.L(1.0f), aob.s0);
                            if (this.r1 >= 1.0f) {
                            }
                            canvas.restore();
                            if (i86.e(i)) {
                            }
                            z3 = this.w2;
                            float f212 = this.r1;
                            if (z3) {
                            }
                            if (this.j0 != 0.0f) {
                            }
                            z4 = this.x2;
                            float f242 = this.n0;
                            if (z4) {
                            }
                            this.n0 = Utilities.i(f242, 1.0f, 0.0f);
                            return z5;
                        }
                        L5 = hl.L(5.0f) - (hl.L(4.0f) * this.s1);
                        L8 = hl.L(1.0f);
                        L9 = hl.L(4.0f);
                        f4 = this.s1;
                        f7 = L8 + (L9 * f4);
                        L2 = L5;
                        f6 = f7;
                        if (this.r1 >= 1.0f) {
                        }
                        canvas.save();
                        float f1722 = this.r1 * progress2;
                        canvas.scale(f1722, f1722, f15, f16);
                        z2 = true;
                        this.s4.set(i11 - hl.L(1.0f), f16 - L2, hl.L(1.0f) + i11, L2 + f16);
                        canvas.drawRoundRect(this.s4, hl.L(1.0f), hl.L(1.0f), aob.s0);
                        float f1822 = f16 - f6;
                        float f1922 = f16 + f6;
                        this.s4.set(i11 - hl.L(5.0f), f1822, i11 - hl.L(3.0f), f1922);
                        canvas.drawRoundRect(this.s4, hl.L(1.0f), hl.L(1.0f), aob.s0);
                        this.s4.set(hl.L(3.0f) + i11, f1822, hl.L(5.0f) + i11, f1922);
                        canvas.drawRoundRect(this.s4, hl.L(1.0f), hl.L(1.0f), aob.s0);
                        if (this.r1 >= 1.0f) {
                        }
                        canvas.restore();
                        if (i86.e(i)) {
                        }
                        z3 = this.w2;
                        float f2122 = this.r1;
                        if (z3) {
                        }
                        if (this.j0 != 0.0f) {
                        }
                        z4 = this.x2;
                        float f2422 = this.n0;
                        if (z4) {
                        }
                        this.n0 = Utilities.i(f2422, 1.0f, 0.0f);
                        return z5;
                    }
                    i = 360928;
                    L2 = (hl.L(4.0f) * this.s1) + hl.L(1.0f);
                    L10 = hl.L(3.0f);
                    L11 = hl.L(2.0f);
                    f5 = this.s1;
                    f6 = L10 - (L11 * f5);
                    if (this.r1 >= 1.0f) {
                    }
                    canvas.save();
                    float f17222 = this.r1 * progress2;
                    canvas.scale(f17222, f17222, f15, f16);
                    z2 = true;
                    this.s4.set(i11 - hl.L(1.0f), f16 - L2, hl.L(1.0f) + i11, L2 + f16);
                    canvas.drawRoundRect(this.s4, hl.L(1.0f), hl.L(1.0f), aob.s0);
                    float f18222 = f16 - f6;
                    float f19222 = f16 + f6;
                    this.s4.set(i11 - hl.L(5.0f), f18222, i11 - hl.L(3.0f), f19222);
                    canvas.drawRoundRect(this.s4, hl.L(1.0f), hl.L(1.0f), aob.s0);
                    this.s4.set(hl.L(3.0f) + i11, f18222, hl.L(5.0f) + i11, f19222);
                    canvas.drawRoundRect(this.s4, hl.L(1.0f), hl.L(1.0f), aob.s0);
                    if (this.r1 >= 1.0f) {
                    }
                    canvas.restore();
                    if (i86.e(i)) {
                    }
                    z3 = this.w2;
                    float f21222 = this.r1;
                    if (z3) {
                    }
                    if (this.j0 != 0.0f) {
                    }
                    z4 = this.x2;
                    float f24222 = this.n0;
                    if (z4) {
                    }
                    this.n0 = Utilities.i(f24222, 1.0f, 0.0f);
                    return z5;
                }
            }
        } else {
            boolean Z = Z();
            this.C0 = Z;
            if (Z || this.q1 != 0.0f) {
                int L16 = (int) (this.v0.F.bottom - hl.L((this.s2 || xea.l1) ? 6.0f : 8.0f));
                boolean z12 = ob6.a0;
                gf3 gf3Var4 = this.v0;
                if (z12) {
                    float f25 = gf3Var4.F.left;
                    if (!this.s2 && !xea.l1) {
                        f8 = 6.0f;
                    }
                    L12 = f25 + hl.L(f8);
                } else {
                    float f26 = gf3Var4.F.right;
                    if (!this.s2 && !xea.l1) {
                        f8 = 6.0f;
                    }
                    L12 = f26 - hl.L(f8);
                }
                int i15 = (int) L12;
                aob.s0.setColor(aob.v0(aob.d6, this.K4));
                float f27 = i15;
                float f28 = L16;
                canvas.drawCircle(f27, f28, hl.L(7.0f) * this.q1, aob.s0);
                aob.s0.setColor(aob.v0(aob.T8, this.K4));
                canvas.drawCircle(f27, f28, hl.L(5.0f) * this.q1, aob.s0);
                float f29 = this.q1;
                if (Z) {
                    if (f29 < 1.0f) {
                        float f30 = f29 + 0.10666667f;
                        this.q1 = f30;
                        if (f30 > 1.0f) {
                            this.q1 = 1.0f;
                        }
                        z6 = true;
                    }
                } else if (f29 > 0.0f) {
                    float f31 = f29 - 0.10666667f;
                    this.q1 = f31;
                    if (f31 < 0.0f) {
                        this.q1 = 0.0f;
                    }
                    z6 = true;
                }
            }
        }
        f = 0.10666667f;
        z2 = true;
        z4 = this.x2;
        float f242222 = this.n0;
        if (z4) {
        }
        this.n0 = Utilities.i(f242222, 1.0f, 0.0f);
        return z5;
    }

    public final void K(Canvas canvas, boolean z, boolean z2, boolean z3, boolean z4, float f) {
        if (f != 0.0f || z4) {
            float f2 = (f * 0.5f) + 0.5f;
            if (z) {
                jf0.u(this.W2, this.X2, aob.W0);
                if (f != 1.0f) {
                    canvas.save();
                    canvas.scale(f2, f2, aob.W0.getBounds().centerX(), aob.V0.getBounds().centerY());
                    aob.W0.setAlpha((int) (f * 255.0f));
                }
                aob.W0.draw(canvas);
                if (f != 1.0f) {
                    canvas.restore();
                    aob.W0.setAlpha(jn7.d4);
                }
                invalidate();
                return;
            }
            if (z3) {
                if (!z2) {
                    jf0.u(this.V2, this.X2, aob.S0);
                    if (f != 1.0f) {
                        canvas.save();
                        canvas.scale(f2, f2, aob.S0.getBounds().centerX(), aob.V0.getBounds().centerY());
                        aob.S0.setAlpha((int) (f * 255.0f));
                    }
                    aob.S0.draw(canvas);
                    if (f != 1.0f) {
                        canvas.restore();
                        aob.S0.setAlpha(jn7.d4);
                        return;
                    }
                    return;
                }
                jf0.u(this.Y2, this.X2, aob.V0);
                if (z4) {
                    canvas.save();
                    canvas.scale(f2, f2, aob.V0.getBounds().centerX(), aob.V0.getBounds().centerY());
                    aob.V0.setAlpha((int) (255.0f * f));
                } else if (f != 0.0f) {
                    canvas.save();
                    canvas.scale(f2, f2, aob.V0.getBounds().centerX(), aob.V0.getBounds().centerY());
                    int i = (int) (255.0f * f);
                    aob.V0.setAlpha(i);
                    aob.U0.setAlpha(i);
                }
                aob.V0.draw(canvas);
                if (z4) {
                    canvas.restore();
                    canvas.save();
                    canvas.translate((1.0f - f) * hl.L(4.0f), 0.0f);
                }
                jf0.u(this.U2, this.X2, aob.U0);
                aob.U0.draw(canvas);
                if (z4) {
                    canvas.restore();
                    aob.V0.setAlpha(jn7.d4);
                } else if (f != 0.0f) {
                    canvas.restore();
                    aob.V0.setAlpha(jn7.d4);
                    aob.U0.setAlpha(jn7.d4);
                }
            }
        }
    }

    public final void L(Canvas canvas, boolean z, int i, int i2, int i3, float f, boolean z2) {
        float f2;
        Paint paint;
        boolean z3;
        RectF rectF;
        RectF rectF2;
        boolean z4 = Y() || X();
        if (!(this.H3 && this.M3) && this.W3 == 1.0f) {
            return;
        }
        float f3 = (this.T0 != 0 || this.U0) ? this.W3 : 1.0f - this.W3;
        int i4 = jn7.d4;
        if (z2) {
            if (this.U == null) {
                Paint paint2 = new Paint();
                this.U = paint2;
                paint2.setStyle(Paint.Style.STROKE);
                this.U.setStrokeWidth(hl.L(2.0f));
                this.U.setStrokeJoin(Paint.Join.ROUND);
                this.U.setStrokeCap(Paint.Cap.ROUND);
            }
            f2 = 1.0f;
            this.U.setColor(vm2.f(Color.alpha(r14) / 255.0f, aob.w0(null, aob.d6, false), vm2.o(aob.w0(null, aob.s9, false), jn7.d4)));
        } else {
            f2 = 1.0f;
        }
        if (this.Q && this.O.read_inbox_max_id == 0) {
            paint = this.T;
            if (paint == null) {
                paint = new Paint();
                this.T = paint;
            }
            int v0 = aob.v0(z ? aob.Vk : aob.Uk, this.K4);
            paint.setColor(v0);
            aob.L0.setColor(v0);
            i4 = z ? 30 : 40;
            z3 = true;
        } else {
            paint = (z || this.K0 != 0) ? aob.x0 : aob.v0;
            z3 = false;
        }
        StaticLayout staticLayout = this.Z3;
        RectF rectF3 = this.s4;
        if (staticLayout == null || this.T0 == 0) {
            if (this.T0 != 0) {
                staticLayout = this.Y3;
            }
            paint.setAlpha((int) ((f2 - this.y3) * i4));
            aob.L0.setAlpha((int) ((f2 - this.y3) * 255.0f));
            float f4 = i;
            rectF3.set(i2, f4, hl.L(12.666f) + this.P3 + i2, hl.L(20.666f) + i);
            int save = canvas.save();
            if (f != f2) {
                canvas.scale(f, f, rectF3.centerX(), rectF3.centerY());
            }
            if (f3 != f2) {
                canvas.scale(f3, f3, rectF3.centerX(), rectF3.centerY());
            }
            if (z4) {
                if (this.u4 == null || (rectF = this.v4) == null || !rectF.equals(rectF3)) {
                    RectF rectF4 = this.v4;
                    if (rectF4 == null) {
                        this.v4 = new RectF(rectF3);
                    } else {
                        rectF4.set(rectF3);
                    }
                    Path path = this.u4;
                    if (path == null) {
                        path = new Path();
                        this.u4 = path;
                    }
                    ttd.a(path, this.v4, hl.L(10.33f));
                }
                canvas.drawPath(this.u4, paint);
                if (z2) {
                    canvas.drawPath(this.u4, this.U);
                }
            } else {
                canvas.drawRoundRect(rectF3, hl.L(11.5f), hl.L(11.5f), paint);
                if (z2) {
                    canvas.drawRoundRect(rectF3, hl.L(11.5f), hl.L(11.5f), this.U);
                }
            }
            if (staticLayout != null) {
                canvas.save();
                canvas.translate(hl.L(6.333f) + i2, hl.N(3.0f) + f4);
                staticLayout.draw(canvas);
                canvas.restore();
            }
            canvas.restoreToCount(save);
        } else {
            paint.setAlpha((int) ((f2 - this.y3) * i4));
            aob.L0.setAlpha((int) ((f2 - this.y3) * 255.0f));
            float f5 = f3 * 2.0f;
            float f6 = f5 > f2 ? f2 : f5;
            float f7 = f2 - f6;
            float f8 = (i3 * f7) + (i2 * f6);
            float f9 = i;
            rectF3.set(f8, f9, (this.Q3 * f7) + (this.P3 * f6) + f8 + hl.L(12.666f), hl.L(20.666f) + i);
            float interpolation = ((f3 <= 0.5f ? k43.g.getInterpolation(f5) : k43.i.getInterpolation(f2 - ((f3 - 0.5f) * 2.0f))) * 0.1f) + f2;
            canvas.save();
            float f10 = interpolation * f;
            canvas.scale(f10, f10, rectF3.centerX(), rectF3.centerY());
            if (z4) {
                if (this.u4 == null || (rectF2 = this.v4) == null || !rectF2.equals(rectF3)) {
                    RectF rectF5 = this.v4;
                    if (rectF5 == null) {
                        this.v4 = new RectF(rectF3);
                    } else {
                        rectF5.set(rectF3);
                    }
                    Path path2 = this.u4;
                    if (path2 == null) {
                        path2 = new Path();
                        this.u4 = path2;
                    }
                    ttd.a(path2, this.v4, hl.L(10.33f));
                }
                canvas.drawPath(this.u4, paint);
                if (z2) {
                    canvas.drawPath(this.u4, this.U);
                }
            } else {
                canvas.drawRoundRect(rectF3, hl.L(11.5f), hl.L(11.5f), paint);
                if (z2) {
                    canvas.drawRoundRect(rectF3, hl.L(11.5f), hl.L(11.5f), this.U);
                }
            }
            if (this.a4 != null) {
                canvas.save();
                canvas.translate(hl.N(6.333f) + f8, hl.N(3.0f) + f9);
                this.a4.draw(canvas);
                canvas.restore();
            }
            int alpha = aob.L0.getAlpha();
            float f11 = alpha;
            aob.L0.setAlpha((int) (f11 * f6));
            if (this.b4 != null) {
                canvas.save();
                canvas.translate(hl.N(6.333f) + f8, hl.N(3.0f) + ((this.S3 ? hl.L(17.0f) : -hl.L(17.0f)) * f7) + f9);
                this.b4.draw(canvas);
                canvas.restore();
            } else if (this.Y3 != null) {
                canvas.save();
                canvas.translate(hl.N(6.333f) + f8, hl.N(3.0f) + ((this.S3 ? hl.L(17.0f) : -hl.L(17.0f)) * f7) + f9);
                this.Y3.draw(canvas);
                canvas.restore();
            }
            if (this.Z3 != null) {
                aob.L0.setAlpha((int) (f11 * f7));
                canvas.save();
                canvas.translate(hl.N(6.333f) + f8, hl.N(3.0f) + ((this.S3 ? -hl.L(17.0f) : hl.L(17.0f)) * f6) + f9);
                this.Z3.draw(canvas);
                canvas.restore();
            }
            aob.L0.setAlpha(alpha);
            canvas.restore();
        }
        if (z3) {
            aob.L0.setColor(aob.w0(null, aob.W8, false));
        }
    }

    public boolean M() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00dd A[EDGE_INSN: B:23:0x00dd->B:24:0x00dd BREAK  A[LOOP:0: B:2:0x001d->B:34:0x00d9], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CharSequence O() {
        TLRPC.Chat M0;
        TLRPC.User user;
        TLRPC.User X1;
        String M02;
        int i = this.G0;
        uc7 s1 = uc7.s1(i);
        ArrayList W0 = s1.W0(this.K0);
        this.N0 = W0.size();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int size = W0.size();
        for (int i2 = 0; i2 < size; i2++) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) W0.get(i2);
            if (!s1.y2(dialog.id)) {
                boolean B = wf3.B(dialog.id);
                long j = dialog.id;
                if (!B) {
                    boolean D = wf3.D(j);
                    long j2 = dialog.id;
                    if (!D) {
                        M0 = s1.M0(Long.valueOf(-j2));
                        user = null;
                        if (M0 == null) {
                            M02 = M0.title.replace('\n', ' ');
                        } else if (user == null) {
                            continue;
                        } else {
                            M02 = lbc.z(user) ? ob6.M0(2131749082, null) : hl.U(lv2.m(0, user.first_name, user.last_name).replace('\n', ' '));
                        }
                        if (spannableStringBuilder.length() > 0) {
                            spannableStringBuilder.append(", ");
                        }
                        int length = spannableStringBuilder.length();
                        int length2 = M02.length() + length;
                        spannableStringBuilder.append((CharSequence) M02);
                        if (dialog.unread_count > 0) {
                            spannableStringBuilder.setSpan(new y7c(hl.o(), aob.v0(aob.Y8, this.K4)), length, length2, 33);
                        }
                        if (spannableStringBuilder.length() <= 150) {
                            break;
                        }
                    } else {
                        X1 = s1.X1(Long.valueOf(j2));
                    }
                } else {
                    TLRPC.EncryptedChat a1 = s1.a1(Integer.valueOf((int) (j & 4294967295L)));
                    X1 = a1 != null ? s1.X1(Long.valueOf(a1.user_id)) : null;
                }
                user = X1;
                M0 = null;
                if (M0 == null) {
                }
                if (spannableStringBuilder.length() > 0) {
                }
                int length3 = spannableStringBuilder.length();
                int length22 = M02.length() + length3;
                spannableStringBuilder.append((CharSequence) M02);
                if (dialog.unread_count > 0) {
                }
                if (spannableStringBuilder.length() <= 150) {
                }
            }
        }
        if (uc7.s1(i).e0.C(true) > 0) {
            int max = Math.max(1, uc7.s1(i).e0.C(true));
            if (spannableStringBuilder.length() > 0) {
                spannableStringBuilder.append(", ");
            }
            spannableStringBuilder.append(ob6.G(max, "Stories", new Object[0]));
        }
        return pv3.m(spannableStringBuilder, aob.E0[this.F0 ? 1 : 0].getFontMetricsInt(), false, null, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e3 A[EDGE_INSN: B:26:0x00e3->B:27:0x00e3 BREAK  A[LOOP:0: B:5:0x0023->B:31:0x00df], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00df A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CharSequence P() {
        TLRPC.Chat M0;
        TLRPC.User user;
        TLRPC.User X1;
        String M02;
        uc7 s1 = uc7.s1(this.G0);
        ArrayList arrayList = (ArrayList) s1.x.f(-this.I0);
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList.get(i);
            if (!s1.y2(dialog.id)) {
                boolean B = wf3.B(dialog.id);
                long j = dialog.id;
                if (!B) {
                    boolean D = wf3.D(j);
                    long j2 = dialog.id;
                    if (!D) {
                        M0 = s1.M0(Long.valueOf(-j2));
                        user = null;
                        if (M0 == null) {
                            M02 = M0.title.replace('\n', ' ');
                        } else if (user == null) {
                            continue;
                        } else {
                            M02 = lbc.z(user) ? ob6.M0(2131749082, null) : hl.U(lv2.m(0, user.first_name, user.last_name).replace('\n', ' '));
                        }
                        if (spannableStringBuilder.length() > 0) {
                            spannableStringBuilder.append(", ");
                        }
                        int length = spannableStringBuilder.length();
                        int length2 = M02.length() + length;
                        spannableStringBuilder.append((CharSequence) M02);
                        if (dialog.unread_count > 0) {
                            spannableStringBuilder.setSpan(new y7c(hl.o(), aob.v0(aob.Y8, this.K4)), length, length2, 33);
                        }
                        if (spannableStringBuilder.length() <= 150) {
                            break;
                        }
                    } else {
                        X1 = s1.X1(Long.valueOf(j2));
                    }
                } else {
                    TLRPC.EncryptedChat a1 = s1.a1(Integer.valueOf((int) (j & 4294967295L)));
                    X1 = a1 != null ? s1.X1(Long.valueOf(a1.user_id)) : null;
                }
                user = X1;
                M0 = null;
                if (M0 == null) {
                }
                if (spannableStringBuilder.length() > 0) {
                }
                int length3 = spannableStringBuilder.length();
                int length22 = M02.length() + length3;
                spannableStringBuilder.append((CharSequence) M02);
                if (dialog.unread_count > 0) {
                }
                if (spannableStringBuilder.length() <= 150) {
                }
            }
        }
        return pv3.m(spannableStringBuilder, aob.E0[this.F0 ? 1 : 0].getFontMetricsInt(), false, null, 0);
    }

    public final CharSequence R() {
        nf3 nf3Var = this.O4;
        if (nf3Var == null) {
            nf3Var = new nf3(this);
            this.O4 = nf3Var;
        }
        nf3Var.a(this.G0, this.g1, this.h2);
        this.O4.getClass();
        nf3 nf3Var2 = this.O4;
        this.N4 = nf3Var2.c;
        this.g0 = nf3Var2.d;
        return nf3Var2.g;
    }

    public final ColorFilter S(int i, int i2) {
        ColorFilter[] colorFilterArr = this.Y4;
        if (colorFilterArr == null) {
            this.Z4 = new int[4];
            colorFilterArr = new ColorFilter[4];
            this.Y4 = colorFilterArr;
        }
        if (i2 != this.Z4[i] || colorFilterArr[i] == null) {
            this.Z4[i] = i2;
            colorFilterArr[i] = new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_IN);
        }
        return this.Y4[i];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0, types: [android.view.View, of3] */
    /* JADX WARN: Type inference failed for: r3v6, types: [android.text.Spannable, android.text.SpannableString, java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.CharSequence] */
    public final SpannableStringBuilder T(int i, CharSequence charSequence, String str, boolean z) {
        CharSequence J2;
        TLRPC.Message message;
        CharSequence charSequence2;
        String G;
        CharSequence charSequence3;
        SpannableStringBuilder valueOf;
        r47 captionMessage = getCaptionMessage();
        r47 r47Var = this.g1;
        CharSequence charSequence4 = r47Var != null ? r47Var.v : null;
        this.f0 = true;
        if (!TextUtils.isEmpty(str)) {
            return Q(i, str, charSequence);
        }
        r47 r47Var2 = this.g1;
        TLRPC.Message message2 = r47Var2.k;
        if (message2 instanceof TLRPC.TL_messageService) {
            CharSequence charSequence5 = r47Var2.w;
            if (charSequence5 == null || ((message2.action instanceof TLRPC.TL_messageActionTopicCreate) && this.Q)) {
                charSequence5 = r47Var2.v;
            }
            if (r47.D4(r47Var2)) {
                valueOf = Q(i, charSequence5, charSequence);
                if (this.g1.i2[0] instanceof oo4) {
                    int i2 = this.G0;
                    TLRPC.TL_forumTopic f = uc7.s1(i2).g4.f(-r47.B0(this.g1.k), r47.b2(i2, this.g1.k, true, false));
                    if (f != null) {
                        ((oo4) this.g1.i2[0]).b(f.icon_color);
                    }
                }
            } else {
                this.f0 = false;
                valueOf = SpannableStringBuilder.valueOf(charSequence5);
            }
            if (z) {
                A(valueOf);
            }
            return valueOf;
        }
        if (captionMessage != null && (charSequence3 = captionMessage.z) != null) {
            String charSequence6 = charSequence3.toString();
            String str2 = !this.W ? "" : r47.K4(captionMessage.k) ? "📹 " : r47.Q4(captionMessage.k) ? "🎤 " : captionMessage.I3() ? "🎧 " : r47.R3(captionMessage.k) ? "🖼 " : "📎 ";
            if (captionMessage.r2() && !TextUtils.isEmpty(captionMessage.k.message)) {
                CharSequence charSequence7 = captionMessage.c2;
                int measuredWidth = getMeasuredWidth() - hl.L(this.J + 47);
                if (this.a0) {
                    if (!TextUtils.isEmpty(charSequence)) {
                        measuredWidth = (int) (measuredWidth - this.b0.measureText(charSequence.toString()));
                    }
                    measuredWidth = (int) (measuredWidth - this.b0.measureText(": "));
                }
                if (measuredWidth > 0 && captionMessage.b2) {
                    charSequence7 = hl.Q(charSequence7, (String) captionMessage.a2.get(0), measuredWidth, this.b0);
                }
                return new SpannableStringBuilder(str2).append(charSequence7);
            }
            int length = charSequence6.length();
            CharSequence charSequence8 = charSequence6;
            if (length > 150) {
                charSequence8 = charSequence6.subSequence(0, jn7.f2);
            }
            SpannableString spannableString = new SpannableString(charSequence8);
            captionMessage.T5();
            ls6.h(captionMessage.k.entities, charSequence8, spannableString, jn7.m4);
            TLRPC.Message message3 = captionMessage.k;
            if (message3 != null) {
                ArrayList<TLRPC.MessageEntity> arrayList = message3.entities;
                TextPaint textPaint = this.b0;
                ls6.a(textPaint != null ? textPaint.getFontMetricsInt() : null, spannableString, arrayList);
            }
            CharSequence append = new SpannableStringBuilder(str2).append(hl.J2(spannableString));
            if (z) {
                append = A(append);
            }
            return Q(i, append, charSequence);
        }
        TL_iv.RichMessage richMessage = message2.rich_message;
        vnb vnbVar = this.K4;
        if (richMessage != null) {
            boolean O2 = richMessage.blocks.size() == 1 ? r47.O2(this.g1.k.rich_message.blocks.get(0)) : false;
            SpannableStringBuilder Q = Q(i, this.g1.v, charSequence);
            if (O2 && !Y()) {
                try {
                    Q.setSpan(new ho4(aob.p9, vnbVar), this.a0 ? charSequence.length() + 2 : 0, Q.length(), 33);
                    return Q;
                } catch (Exception e) {
                    cc4.g(e, true);
                }
            }
            return Q;
        }
        if (message2.media == null || r47Var2.F3()) {
            r47 r47Var3 = this.g1;
            String str3 = r47Var3.k.message;
            if (str3 == null) {
                return new SpannableStringBuilder();
            }
            if (r47Var3.r2()) {
                CharSequence charSequence9 = this.g1.c2;
                J2 = str3;
                if (charSequence9 != null) {
                    J2 = charSequence9;
                }
                int measuredWidth2 = getMeasuredWidth() - hl.L(this.J + 33);
                if (this.a0) {
                    if (!TextUtils.isEmpty(charSequence)) {
                        measuredWidth2 = (int) (measuredWidth2 - this.b0.measureText(charSequence.toString()));
                    }
                    measuredWidth2 = (int) (measuredWidth2 - this.b0.measureText(": "));
                }
                if (measuredWidth2 > 0) {
                    J2 = hl.Q(J2, (String) this.g1.a2.get(0), measuredWidth2, this.b0);
                }
            } else {
                int length2 = str3.length();
                CharSequence charSequence10 = str3;
                if (length2 > 150) {
                    charSequence10 = str3.subSequence(0, jn7.f2);
                }
                J2 = hl.J2(charSequence10);
            }
            ?? spannableString2 = new SpannableString(J2);
            r47 r47Var4 = this.g1;
            if (r47Var4 != null) {
                r47Var4.T5();
            }
            r47 r47Var5 = this.g1;
            Pattern pattern = ls6.U1;
            ls6.h(r47Var5.k.entities, r47Var5.v, spannableString2, jn7.m4);
            r47 r47Var6 = this.g1;
            if (r47Var6 != null && (message = r47Var6.k) != null) {
                ArrayList<TLRPC.MessageEntity> arrayList2 = message.entities;
                TextPaint textPaint2 = this.b0;
                ls6.a(textPaint2 != null ? textPaint2.getFontMetricsInt() : null, spannableString2, arrayList2);
            }
            if (z) {
                spannableString2 = A(spannableString2);
            }
            return Q(i, spannableString2, charSequence);
        }
        this.b0 = aob.G0[this.F0 ? 1 : 0];
        int i3 = aob.o9;
        r47 r47Var7 = this.g1;
        TLRPC.MessageMedia messageMedia = r47Var7.k.media;
        if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
            TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia;
            TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageMediaPoll.poll.question;
            if (tL_textWithEntities == null || tL_textWithEntities.entities == null) {
                charSequence2 = vf3.a(R.drawable.dialog_media_poll_20, tL_textWithEntities.text, true);
            } else {
                SpannableString spannableString3 = new SpannableString(tL_messageMediaPoll.poll.question.text.replace('\n', ' '));
                TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_messageMediaPoll.poll.question;
                ls6.h(tL_textWithEntities2.entities, tL_textWithEntities2.text, spannableString3, -1);
                ls6.a(aob.E0[this.F0 ? 1 : 0].getFontMetricsInt(), spannableString3, tL_messageMediaPoll.poll.question.entities);
                charSequence2 = vf3.a(R.drawable.dialog_media_poll_20, spannableString3, true);
            }
        } else if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
            TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia;
            TLRPC.TL_textWithEntities tL_textWithEntities3 = tL_messageMediaToDo.todo.title;
            if (tL_textWithEntities3 == null || tL_textWithEntities3.entities == null) {
                charSequence2 = vf3.a(R.drawable.dialog_media_checklist_20, tL_textWithEntities3.text, true);
            } else {
                SpannableString spannableString4 = new SpannableString(tL_messageMediaToDo.todo.title.text.replace('\n', ' '));
                TLRPC.TL_textWithEntities tL_textWithEntities4 = tL_messageMediaToDo.todo.title;
                ls6.h(tL_textWithEntities4.entities, tL_textWithEntities4.text, spannableString4, -1);
                ls6.a(aob.E0[this.F0 ? 1 : 0].getFontMetricsInt(), spannableString4, tL_messageMediaToDo.todo.title.entities);
                charSequence2 = vf3.a(R.drawable.dialog_media_checklist_20, spannableString4, true);
            }
        } else if (messageMedia instanceof TLRPC.TL_messageMediaGame) {
            charSequence2 = vf3.a(R.drawable.dialog_media_game_20, messageMedia.game.title, true);
        } else if (messageMedia instanceof TLRPC.TL_messageMediaInvoice) {
            charSequence2 = messageMedia.title;
        } else if (r47Var7.D == 14) {
            charSequence2 = c00.j("🎧 \u2068", r47Var7.w1(true), " - ", this.g1.y1(true), "\u2069");
        } else if (messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) {
            int size = ((TLRPC.TL_messageMediaPaidMedia) messageMedia).extended_media.size();
            charSequence2 = nza.T0(ob6.a0(null, null, 2131753942, this.T1 ? size > 1 ? ob6.G(size, "Media", new Object[0]) : ob6.M0(2131753926, null) : size > 1 ? ob6.G(size, "Photos", new Object[0]) : ob6.M0(2131753941, null)));
            i3 = aob.p9;
        } else if (this.S1 > 1) {
            boolean z2 = this.T1;
            ArrayList arrayList3 = this.h1;
            if (z2) {
                G = ob6.G(arrayList3 == null ? 0 : arrayList3.size(), "Media", new Object[0]);
            } else {
                G = ob6.G(arrayList3 == null ? 0 : arrayList3.size(), "Photos", new Object[0]);
            }
            charSequence2 = G;
            i3 = aob.p9;
        } else {
            charSequence2 = charSequence4.toString();
            i3 = aob.p9;
        }
        if (charSequence2 instanceof String) {
            charSequence2 = ((String) charSequence2).replace('\n', ' ');
        }
        if (z) {
            charSequence2 = A(charSequence2);
        }
        SpannableStringBuilder Q2 = Q(i, charSequence2, charSequence);
        if (!Y()) {
            try {
                Q2.setSpan(new ho4(i3, vnbVar), this.a0 ? charSequence.length() + 2 : 0, Q2.length(), 33);
                return Q2;
            } catch (Exception e2) {
                cc4.g(e2, true);
            }
        }
        return Q2;
    }

    public final boolean U() {
        lyc lycVar = this.u0;
        return (lycVar == null || ((ArrayList) lycVar.d).isEmpty()) ? false : true;
    }

    public final boolean V() {
        if (xc2.Y(this.h2)) {
            return !this.f1;
        }
        if (this.Q) {
            return this.b1;
        }
        TLRPC.Chat chat = this.h2;
        return (chat != null && chat.forum && this.O == null) ? !this.e1 : this.a1;
    }

    public final boolean W() {
        return this.K0 > 0;
    }

    public final boolean X() {
        return this.K0 != 0;
    }

    public boolean Y() {
        TLRPC.Chat chat;
        if (W() || this.Q0 || (chat = this.h2) == null) {
            return false;
        }
        if (!chat.forum) {
            if (!xc2.p0(chat)) {
                return false;
            }
            if (!xc2.A(this.G0, this.h2, 24)) {
                return false;
            }
        }
        return !this.Q;
    }

    public final boolean Z() {
        TLRPC.User user;
        if (Y() || this.v0.w || (user = this.g2) == null || user.self) {
            return false;
        }
        TLRPC.UserStatus userStatus = user.status;
        int i = this.G0;
        if (userStatus != null && userStatus.expires <= 0 && uc7.s1(i).a0.containsKey(Long.valueOf(this.g2.id))) {
            return true;
        }
        TLRPC.UserStatus userStatus2 = this.g2.status;
        return userStatus2 != null && userStatus2.expires > ConnectionsManager.getInstance(i).getCurrentTime();
    }

    public final boolean a0(float f) {
        return !ob6.a0 ? f >= 0.0f && f < ((float) hl.L(60.0f)) : f >= ((float) (getMeasuredWidth() - hl.L(60.0f))) && f < ((float) getMeasuredWidth());
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.Y8));
        hashSet.add(Integer.valueOf(aob.i9));
        hashSet.add(Integer.valueOf(aob.g9));
        hashSet.add(Integer.valueOf(aob.o9));
        hashSet.add(Integer.valueOf(aob.X8));
        hashSet.add(Integer.valueOf(aob.j9));
        hashSet.add(Integer.valueOf(aob.p9));
        hashSet.add(Integer.valueOf(aob.k9));
        hashSet.add(Integer.valueOf(aob.y6));
        hashSet.add(Integer.valueOf(aob.d6));
        hashSet.add(Integer.valueOf(aob.k7));
        hashSet.add(Integer.valueOf(aob.d9));
        hashSet.add(Integer.valueOf(aob.c9));
        hashSet.add(Integer.valueOf(aob.Y5));
        hashSet.add(Integer.valueOf(aob.s9));
        hashSet.add(Integer.valueOf(aob.Z8));
        hashSet.add(Integer.valueOf(aob.n9));
        hashSet.add(Integer.valueOf(aob.m9));
        hashSet.add(Integer.valueOf(aob.l9));
        hashSet.add(Integer.valueOf(aob.h9));
        hashSet.add(Integer.valueOf(aob.z9));
        hashSet.add(Integer.valueOf(aob.Fi));
        hashSet.add(Integer.valueOf(aob.Ji));
        hashSet.add(Integer.valueOf(aob.V8));
        hashSet.add(Integer.valueOf(aob.U8));
        hashSet.add(Integer.valueOf(aob.Ck));
        hashSet.add(Integer.valueOf(aob.Dk));
        hashSet.add(Integer.valueOf(aob.T8));
        hashSet.add(Integer.valueOf(aob.Vk));
        hashSet.add(Integer.valueOf(aob.Uk));
        hashSet.add(Integer.valueOf(aob.W8));
    }

    public final void b0(boolean z, boolean z2) {
        if ((!getIsPinned() && z) || this.z3 == z) {
            if (getIsPinned()) {
                return;
            }
            this.z3 = false;
        } else {
            this.z3 = z;
            if (z2) {
                this.y3 = z ? 0.0f : 1.0f;
            } else {
                this.y3 = z ? 1.0f : 0.0f;
            }
            invalidate();
        }
    }

    public final void c0() {
        boolean z = xea.m1;
        this.n1 = z;
        float f = z ? 0.0f : 1.0f;
        this.E1 = f;
        this.b2.o = f;
        this.u1 = 0.0f;
        this.y1 = false;
        this.y3 = (getIsPinned() && this.z3) ? 1.0f : 0.0f;
        this.x3 = true;
        this.p1 = 0.0f;
        setTranslationX(0.0f);
        setTranslationY(0.0f);
        ul ulVar = this.o4;
        if (ulVar != null && this.x3) {
            ulVar.a();
        }
        ul ulVar2 = this.p4;
        if (ulVar2 == null || !this.x3) {
            return;
        }
        ulVar2.a();
    }

    public final void d0(boolean z, boolean z2) {
        if (this.r2 == null) {
            if (!z) {
                return;
            }
            za zaVar = new za(this, getContext(), this.K4, (byte) 1);
            this.r2 = zaVar;
            zaVar.b(-1, aob.d6, aob.k7);
            this.r2.setDrawUnchecked(false);
            this.r2.setDrawBackgroundAsArc(3);
            addView(this.r2);
        }
        this.r2.a(z, z2);
        G();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if ((!this.Q && !this.G && motionEvent.getAction() == 1) || motionEvent.getAction() == 3) {
            this.v0.a(this, motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e0(long j, r47 r47Var, int i, boolean z, boolean z2) {
        if (this.I0 != j) {
            this.y4 = -1;
        }
        this.I0 = j;
        this.C4 = System.currentTimeMillis();
        this.g1 = r47Var;
        this.v2 = z;
        this.O0 = false;
        this.S0 = i;
        if (r47Var != null) {
            int i2 = r47Var.k.edit_date;
        }
        this.T0 = 0;
        this.U0 = false;
        this.m1 = r47Var != null ? r47Var.e1() : 0;
        this.V0 = 0;
        this.W0 = 0;
        this.X0 = 0;
        this.Y0 = r47Var != null && r47Var.E4();
        r47 r47Var2 = this.g1;
        if (r47Var2 != null) {
            this.Z0 = r47Var2.k.send_state;
        }
        j0(0, z2);
    }

    public final void f0(TLRPC.Dialog dialog, int i, int i2) {
        if (this.I0 != dialog.id) {
            ValueAnimator valueAnimator = this.B4;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.B4.cancel();
            }
            this.A4 = false;
            this.y4 = -1;
        }
        this.I0 = dialog.id;
        this.C4 = System.currentTimeMillis();
        this.O0 = true;
        if (dialog instanceof TLRPC.TL_dialogCommunity) {
            this.L0 = dialog.community_id;
        } else {
            this.L0 = 0L;
        }
        if (dialog instanceof TLRPC.TL_dialogFolder) {
            this.K0 = ((TLRPC.TL_dialogFolder) dialog).folder.id;
            ey8 ey8Var = this.f2;
            if (ey8Var != null) {
                ey8Var.H = this;
                ey8Var.h();
            }
        } else {
            this.K0 = 0;
        }
        this.k1 = i;
        boolean z = i == 3;
        Runnable runnable = this.a5;
        if (z != (runnable != null)) {
            if (z) {
                this.a5 = jn7.f(this.G0).h(this, jn7.k3, new t2d(this, (byte) 1));
            } else if (runnable != null) {
                runnable.run();
                this.a5 = null;
            }
        }
        if (this.u0 == null) {
            this.u0 = new lyc(this);
        }
        this.l1 = i2;
        this.m1 = 0;
        if (j0(0, false)) {
            requestLayout();
        }
        F();
        E();
        D();
        G();
    }

    public final void g0(TLRPC.TL_forumTopic tL_forumTopic, long j, r47 r47Var, boolean z, boolean z2) {
        ey8 ey8Var;
        this.O = tL_forumTopic;
        this.Q = tL_forumTopic != null;
        if (this.I0 != j) {
            this.y4 = -1;
        }
        Drawable drawable = r47Var.i2[0];
        if (drawable instanceof oo4) {
            ((oo4) drawable).b(tL_forumTopic.icon_color);
        }
        this.I0 = j;
        this.C4 = System.currentTimeMillis();
        this.g1 = r47Var;
        this.O0 = false;
        this.h0 = z;
        this.S0 = r47Var.k.date;
        this.U0 = false;
        this.m1 = r47Var.e1();
        this.Y0 = r47Var.E4();
        r47 r47Var2 = this.g1;
        if (r47Var2 != null) {
            this.Z0 = r47Var2.k.send_state;
        }
        if (!z2) {
            this.y4 = -1;
        }
        if (tL_forumTopic != null) {
            this.h1 = tL_forumTopic.groupedMessages;
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = this.O;
        if (tL_forumTopic2 != null && tL_forumTopic2.id == 1 && (ey8Var = this.f2) != null) {
            ey8Var.H = this;
            ey8Var.h();
        }
        j0(0, z2);
    }

    public float getClipProgress() {
        return this.u1;
    }

    public int getCurrentDialogFolderId() {
        return this.K0;
    }

    public long getDialogId() {
        return this.I0;
    }

    public boolean getHasUnread() {
        return this.T0 != 0 || this.U0;
    }

    public boolean getIsMuted() {
        return this.a1;
    }

    public boolean getIsPinned() {
        return this.B3 || this.C3;
    }

    public r47 getMessage() {
        return this.g1;
    }

    public int getMessageId() {
        return this.m1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
    
        if (r2 != r9) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String getMessageNameString() {
        TLRPC.Chat M0;
        TLRPC.User user;
        String str;
        TLRPC.Message message;
        TLRPC.MessageFwdHeader messageFwdHeader;
        String str2;
        r47 r47Var;
        TLRPC.Message message2;
        TLRPC.User X1;
        r47 r47Var2;
        TLRPC.Message message3;
        TLRPC.MessageFwdHeader messageFwdHeader2;
        TLRPC.Message message4;
        TLRPC.MessageFwdHeader messageFwdHeader3;
        TLRPC.MessageFwdHeader messageFwdHeader4;
        r47 r47Var3 = this.g1;
        if (r47Var3 != null) {
            long Z0 = r47Var3.Z0();
            int i = this.G0;
            long e = yac.h(i).e();
            if (!this.s0 && this.I0 == e) {
                long P1 = this.g1.P1();
                if (P1 != e) {
                    if (P1 != 2666000) {
                        TLRPC.Message message5 = this.g1.k;
                        if (message5 != null && (messageFwdHeader4 = message5.fwd_from) != null) {
                            long n = wf3.n(messageFwdHeader4.saved_from_id);
                            if (n == 0) {
                                n = wf3.n(this.g1.k.fwd_from.from_id);
                            }
                            if (n > 0) {
                            }
                        }
                        Z0 = P1;
                    }
                }
            }
            if (this.s0 && (message4 = this.g1.k) != null && (messageFwdHeader3 = message4.fwd_from) != null) {
                Z0 = wf3.n(messageFwdHeader3.saved_from_id);
                if (Z0 == 0) {
                    Z0 = wf3.n(this.g1.k.fwd_from.from_id);
                }
            }
            if (wf3.D(Z0)) {
                user = uc7.s1(i).X1(Long.valueOf(Z0));
                M0 = null;
            } else {
                M0 = uc7.s1(i).M0(Long.valueOf(-Z0));
                user = null;
            }
            long j = this.I0;
            if (j != e) {
                if (j == 489000 && (r47Var2 = this.g1) != null && (message3 = r47Var2.k) != null && (messageFwdHeader2 = message3.fwd_from) != null) {
                    String str3 = messageFwdHeader2.from_name;
                    if (str3 != null) {
                        return hl.U(str3);
                    }
                    long n2 = wf3.n(messageFwdHeader2.from_id);
                    if (wf3.D(n2)) {
                        return lbc.r(uc7.s1(i).X1(Long.valueOf(n2)));
                    }
                    TLRPC.Chat M02 = uc7.s1(i).M0(Long.valueOf(-n2));
                    return M02 == null ? "" : M02.title;
                }
                if (this.g1.O3() && user != null) {
                    return ob6.M0(2131750464, null);
                }
                if (!this.s0 && (r47Var = this.g1) != null && (message2 = r47Var.k) != null && (message2.from_id instanceof TLRPC.TL_peerUser) && (X1 = uc7.s1(i).X1(Long.valueOf(this.g1.k.from_id.user_id))) != null) {
                    return hl.U(lbc.k(X1, true).replace("\n", ""));
                }
                r47 r47Var4 = this.g1;
                return (r47Var4 == null || (message = r47Var4.k) == null || (messageFwdHeader = message.fwd_from) == null || (str2 = messageFwdHeader.from_name) == null) ? user != null ? (this.s2 || xea.l1) ? lbc.z(user) ? ob6.M0(2131749082, null) : hl.U(lv2.m(0, user.first_name, user.last_name).replace("\n", "")) : hl.U(lbc.k(user, true).replace("\n", "")) : (M0 == null || (str = M0.title) == null) ? "DELETED" : hl.U(str.replace("\n", "")) : hl.U(str2);
            }
            if (user != null) {
                return hl.U(lbc.k(user, true).replace("\n", ""));
            }
            if (M0 != null) {
                return hl.U(M0.title.replace("\n", ""));
            }
        }
        return null;
    }

    public long getStarsPrice() {
        return this.q2;
    }

    @Override // android.view.View
    public float getTranslationX() {
        return this.x1;
    }

    public final void h0(int i, r47 r47Var) {
        TLRPC.MessageMedia messageMedia;
        ArrayList<TLRPC.PhotoSize> arrayList = r47Var.p0;
        TLObject tLObject = r47Var.n0;
        if (r47Var.x4()) {
            TL_stories.StoryItem storyItem = r47Var.k.media.storyItem;
            if (storyItem == null || (messageMedia = storyItem.media) == null) {
                return;
            }
            TLRPC.Document document = messageMedia.document;
            if (document != null) {
                arrayList = document.thumbs;
                tLObject = document;
            } else {
                TLRPC.Photo photo = messageMedia.photo;
                if (photo != null) {
                    arrayList = photo.sizes;
                    tLObject = photo;
                }
            }
        }
        TLRPC.PhotoSize Q = xb4.Q(arrayList);
        if (Q == null) {
            Q = xb4.w(arrayList, 40, false, null, false);
        }
        TLRPC.PhotoSize w = xb4.w(arrayList, hl.Y0(false), false, null, true);
        TLRPC.PhotoSize photoSize = Q != w ? w : null;
        if (photoSize == null || !lq3.q(this.G0).d(r47Var)) {
            photoSize = Q;
        }
        if (Q != null) {
            this.T1 = this.T1 || r47.K4(r47Var.k) || r47Var.g4();
            int i2 = this.S1;
            if (i2 < 3) {
                this.S1 = i2 + 1;
                this.X1[i] = (r47.K4(r47Var.k) || r47Var.g4()) && !r47Var.t2();
                this.Y1[i] = r47Var.t2();
                int i3 = (r47Var.D != 1 || photoSize == null) ? 0 : photoSize.size;
                String str = r47Var.t2() ? "5_5_b" : "20_20";
                ImageReceiver[] imageReceiverArr = this.W1;
                imageReceiverArr[i].Z(jn5.f(photoSize, tLObject), str, jn5.f(Q, tLObject), str, null, i3, null, r47Var, 0);
                imageReceiverArr[i].q0(hl.L(r47Var.g4() ? 18.0f : 2.0f));
                this.W = false;
            }
        }
    }

    public final void i0() {
        ey8 ey8Var = this.f2;
        if (ey8Var != null) {
            if (this.Q) {
                ey8Var.K = hl.L(24.0f);
                this.f2.L = hl.L(24.0f);
                this.f2.M = 0.0f;
            } else {
                gf3 gf3Var = this.v0;
                RectF rectF = gf3Var.F;
                RectF rectF2 = gf3Var.F;
                ey8Var.K = rectF.centerY();
                this.f2.L = rectF2.centerX();
                this.f2.M = rectF2.width() / 2.0f;
                if (!uc7.s1(this.G0).O1().h.isEmpty()) {
                    this.f2.M -= hl.N(3.5f);
                }
                ey8 ey8Var2 = this.f2;
                this.Z1.q();
                ey8Var2.getClass();
            }
            ey8 ey8Var3 = this.f2;
            if (ey8Var3.E || ey8Var3.I == null) {
                return;
            }
            AnimatorSet animatorSet = ey8Var3.B;
            if (animatorSet != null) {
                animatorSet.removeAllListeners();
                ey8Var3.B.cancel();
            }
            ey8Var3.E = true;
            ey8Var3.F = true;
            ey8Var3.D = 0.0f;
            ey8Var3.I.getTranslationY();
            Typeface typeface = hl.a;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new dy8(ey8Var3, (byte) 3));
            ofFloat.setInterpolator(k43.h);
            ofFloat.setDuration(250L);
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat2.addUpdateListener(new dy8(ey8Var3, (byte) 4));
            k43 k43Var = k43.j;
            ofFloat2.setInterpolator(k43Var);
            ofFloat2.setDuration(150L);
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat3.addUpdateListener(new dy8(ey8Var3, (byte) 5));
            ofFloat3.setInterpolator(k43Var);
            ofFloat3.setDuration(135L);
            AnimatorSet animatorSet2 = new AnimatorSet();
            ey8Var3.B = animatorSet2;
            animatorSet2.addListener(new n88(ey8Var3, (byte) 24));
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.playSequentially(ofFloat2, ofFloat3);
            animatorSet3.setStartDelay(180L);
            ey8Var3.B.playTogether(ofFloat, animatorSet3);
            ey8Var3.B.start();
        }
    }

    @Override // jf0, android.view.View
    public final void invalidate() {
        if (lcb.x1) {
            return;
        }
        super.invalidate();
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        if (drawable == this.z1 || drawable == aob.u1) {
            invalidate(drawable.getBounds());
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:252:0x0526, code lost:
    
        if (xc2.A(r6, r5, 24) != false) goto L276;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x058a  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x066d  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x067d  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0682  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0699  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x06db  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x07a3  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0854  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x096d  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x0aa4  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x0aa6  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x0ab2  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x0abe  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x0b2a  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x0b2c  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x0ac0  */
    /* JADX WARN: Removed duplicated region for block: B:503:0x0ab4  */
    /* JADX WARN: Removed duplicated region for block: B:504:0x0872  */
    /* JADX WARN: Removed duplicated region for block: B:547:0x0747  */
    /* JADX WARN: Removed duplicated region for block: B:602:0x0688  */
    /* JADX WARN: Removed duplicated region for block: B:634:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:642:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01b7  */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v2 */
    /* JADX WARN: Type inference failed for: r20v6 */
    /* JADX WARN: Type inference failed for: r20v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean j0(int i, boolean z) {
        boolean z2;
        int i2;
        rb0 rb0Var;
        int i3;
        boolean z3;
        boolean z4;
        int i4;
        ImageReceiver imageReceiver;
        boolean z5;
        boolean z6;
        boolean z7;
        int i5;
        boolean z8;
        int i6;
        long j;
        ImageReceiver imageReceiver2;
        int i7;
        r47 r47Var;
        float f;
        boolean z9;
        int L;
        TLRPC.User user;
        TLRPC.Chat chat;
        int i8;
        ValueAnimator valueAnimator;
        int i9;
        String str;
        TLRPC.Chat M0;
        r47 r47Var2;
        ArrayList o3;
        r47 r47Var3;
        boolean z10;
        r47 r47Var4;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        HashMap hashMap;
        r47 r47Var5;
        boolean z11;
        long j2;
        boolean z12;
        int i16;
        ac7 ac7Var;
        int i17;
        ac7 ac7Var2;
        pf3 pf3Var;
        ac7 ac7Var3;
        String str2;
        r47 r47Var6;
        int i18;
        r47 r47Var7;
        ImageReceiver imageReceiver3;
        boolean Y = Y();
        boolean z13 = false;
        this.m0 = 0;
        jf3 jf3Var = this.H0;
        ImageReceiver imageReceiver4 = this.Z1;
        rb0 rb0Var2 = this.b2;
        int i19 = this.G0;
        if (jf3Var != null) {
            this.S0 = jf3Var.h;
            byte b = jf3Var.d;
            this.Y0 = b != 0;
            this.T0 = b;
            this.B3 = jf3Var.e;
            this.a1 = jf3Var.f;
            this.e1 = false;
            this.f1 = false;
            rb0Var2.j(jf3Var.c, jf3Var.a, null, null);
            if (this.G) {
                imageReceiver3 = imageReceiver4;
                imageReceiver3.e0(null, "50_50", this.H, null, 0L);
            } else {
                imageReceiver3 = imageReceiver4;
                imageReceiver3.e0(null, "50_50", rb0Var2, null, 0L);
            }
            int i20 = 0;
            while (true) {
                ImageReceiver[] imageReceiverArr = this.W1;
                if (i20 >= imageReceiverArr.length) {
                    break;
                }
                imageReceiverArr[i20].g0(null);
                i20++;
            }
            this.E = false;
            this.F = false;
            imageReceiver3.q0(hl.L(26.0f));
            this.c1 = false;
            i5 = i19;
            z3 = Y;
            z7 = false;
            z8 = false;
            f = 0.0f;
        } else {
            ImageReceiver imageReceiver5 = imageReceiver4;
            int i21 = this.T0;
            boolean z14 = this.W0 != 0;
            boolean z15 = this.U0;
            this.e1 = false;
            this.f1 = false;
            this.I4 = -1;
            boolean z16 = this.O0;
            int[] iArr = qyb.w;
            if (z16) {
                boolean z17 = true;
                rb0Var = rb0Var2;
                i3 = 2;
                TLRPC.Dialog dialog = (TLRPC.Dialog) uc7.s1(i19).R.f(this.I0);
                if (dialog != null) {
                    this.I4 = dialog.read_outbox_max_id;
                    this.m0 = dialog.ttl_period;
                    if (i == 0) {
                        this.i1 = uc7.s1(i19).v0.f(dialog.id) != null;
                        ArrayList arrayList = (ArrayList) uc7.s1(i19).S.f(dialog.id);
                        this.h1 = arrayList;
                        r47 r47Var8 = (arrayList == null || arrayList.size() <= 0) ? null : (r47) this.h1.get(0);
                        this.g1 = r47Var8;
                        this.Y0 = r47Var8 != null && r47Var8.E4();
                        TLRPC.Chat M02 = uc7.s1(i19).M0(Long.valueOf(-dialog.id));
                        if (M02 == null || !(M02.forum || (M02.monoforum && xc2.A(i19, M02, 24)))) {
                            i2 = i19;
                            if (dialog instanceof TLRPC.TL_dialogFolder) {
                                this.T0 = jf7.Y(i2).M;
                                this.V0 = 0;
                                this.W0 = 0;
                                this.X0 = 0;
                            } else {
                                if (dialog instanceof TLRPC.TL_dialogCommunity) {
                                    imageReceiver5 = imageReceiver5;
                                    ga6 Q0 = uc7.s1(i2).Q0(-dialog.id);
                                    this.T0 = Q0.a;
                                    this.V0 = Q0.b;
                                    this.W0 = Q0.c;
                                    this.X0 = Q0.d;
                                    this.f1 = Q0.e;
                                } else {
                                    imageReceiver5 = imageReceiver5;
                                    this.T0 = dialog.unread_count;
                                    this.V0 = dialog.unread_mentions_count;
                                    this.W0 = dialog.unread_reactions_count;
                                    this.X0 = dialog.unread_poll_votes_count;
                                }
                                if (xc2.p0(M02)) {
                                    this.V0 = 0;
                                }
                                this.U0 = dialog.unread_mark;
                                r47Var6 = this.g1;
                                if (r47Var6 != null) {
                                    int i22 = r47Var6.k.edit_date;
                                }
                                this.S0 = dialog.last_message_date;
                                i18 = this.k1;
                                if (i18 != 7 || i18 == 8) {
                                    ac7 ac7Var4 = uc7.s1(i2).N[this.k1 != 8 ? (char) 1 : (char) 0];
                                    this.B3 = ac7Var4 == null && ac7Var4.j.indexOfKey(dialog.id) >= 0;
                                } else {
                                    this.B3 = this.K0 == 0 && dialog.pinned;
                                }
                                r47Var7 = this.g1;
                                if (r47Var7 != null) {
                                    this.Z0 = r47Var7.k.send_state;
                                }
                            }
                        } else {
                            i2 = i19;
                            uc7.s1(i19).g4.h(M02.id);
                            this.T0 = iArr[0];
                            this.V0 = iArr[1];
                            this.W0 = iArr[2];
                            this.e1 = iArr[3] != 0;
                            this.X0 = iArr[4];
                        }
                        imageReceiver5 = imageReceiver5;
                        if (xc2.p0(M02)) {
                        }
                        this.U0 = dialog.unread_mark;
                        r47Var6 = this.g1;
                        if (r47Var6 != null) {
                        }
                        this.S0 = dialog.last_message_date;
                        i18 = this.k1;
                        if (i18 != 7) {
                        }
                        ac7 ac7Var42 = uc7.s1(i2).N[this.k1 != 8 ? (char) 1 : (char) 0];
                        this.B3 = ac7Var42 == null && ac7Var42.j.indexOfKey(dialog.id) >= 0;
                        r47Var7 = this.g1;
                        if (r47Var7 != null) {
                        }
                    } else {
                        i2 = i19;
                    }
                } else {
                    i2 = i19;
                    this.T0 = 0;
                    this.V0 = 0;
                    this.W0 = 0;
                    this.X0 = 0;
                    this.S0 = 0;
                    this.i1 = false;
                }
                z2 = z17;
                if (this.I0 != 0) {
                    int i23 = rm9.S;
                    z2 = z17;
                }
            } else {
                z2 = 1;
                i2 = i19;
                rb0Var = rb0Var2;
                i3 = 2;
                this.B3 = false;
            }
            TLRPC.TL_forumTopic tL_forumTopic = this.O;
            if (tL_forumTopic != null) {
                this.T0 = tL_forumTopic.unread_count;
                this.V0 = tL_forumTopic.unread_mentions_count;
                this.W0 = tL_forumTopic.unread_reactions_count;
                this.X0 = tL_forumTopic.unread_poll_votes_count;
            }
            if (this.k1 == i3) {
                this.B3 = false;
            }
            lyc lycVar = this.u0;
            if (lycVar != null) {
                boolean isEmpty = ((ArrayList) lycVar.d).isEmpty();
                lyc lycVar2 = this.u0;
                int i24 = this.k1;
                i4 = i21;
                long j3 = this.I0;
                of3 of3Var = (of3) lycVar2.b;
                ArrayList arrayList2 = (ArrayList) lycVar2.c;
                ArrayList arrayList3 = (ArrayList) lycVar2.d;
                z4 = false;
                k5 a = k5.a(i2);
                uc7 s1 = uc7.s1(i2);
                imageReceiver = imageReceiver5;
                ac7[] ac7VarArr = s1.N;
                if (s1.l4 && yac.h(a.a).p()) {
                    ArrayList arrayList4 = s1.G0;
                    if (i24 == 7) {
                        ac7Var = ac7VarArr[0];
                        i16 = 8;
                    } else {
                        i16 = 8;
                        ac7Var = i24 == 8 ? ac7VarArr[z2] : null;
                    }
                    arrayList2.clear();
                    z3 = Y;
                    if (i24 == 0 || i24 == 7 || i24 == i16) {
                        int i25 = 0;
                        while (i25 < arrayList4.size()) {
                            ac7 ac7Var5 = (ac7) arrayList4.get(i25);
                            if (ac7Var5 != null) {
                                ac7Var2 = ac7Var;
                                i17 = i25;
                                if (ac7Var5 != ac7Var2 && ac7Var5.m >= 0 && ac7Var5.a(a, j3)) {
                                    arrayList2.add(ac7Var5);
                                }
                            } else {
                                i17 = i25;
                                ac7Var2 = ac7Var;
                            }
                            i25 = i17 + 1;
                            ac7Var = ac7Var2;
                        }
                    }
                    int i26 = 0;
                    z12 = false;
                    while (i26 < arrayList3.size()) {
                        pf3 pf3Var2 = (pf3) arrayList3.get(i26);
                        int i27 = 0;
                        while (true) {
                            if (i27 >= arrayList2.size()) {
                                ac7Var3 = null;
                                break;
                            }
                            if (((ac7) arrayList2.get(i27)).a == pf3Var2.a) {
                                ac7Var3 = (ac7) arrayList2.get(i27);
                                break;
                            }
                            i27++;
                        }
                        if (ac7Var3 == null) {
                            arrayList3.remove(i26);
                            i26--;
                        } else {
                            if (ac7Var3.m != pf3Var2.b || ((str2 = ac7Var3.b) != null && pf3Var2.c != null && str2.length() != pf3Var2.c.i().length())) {
                                arrayList3.set(i26, pf3.b(of3Var, ac7Var3));
                            }
                            i26++;
                        }
                        z12 = z2;
                        i26++;
                    }
                    for (int i28 = 0; i28 < arrayList2.size(); i28++) {
                        ac7 ac7Var6 = (ac7) arrayList2.get(i28);
                        int i29 = 0;
                        while (true) {
                            if (i29 >= arrayList3.size()) {
                                pf3Var = null;
                                break;
                            }
                            if (((pf3) arrayList3.get(i29)).a == ac7Var6.a) {
                                pf3Var = (pf3) arrayList3.get(i29);
                                break;
                            }
                            i29++;
                        }
                        if (pf3Var == null) {
                            arrayList3.add(i28, pf3.b(of3Var, ac7Var6));
                            z12 = z2;
                        }
                    }
                    arrayList2.clear();
                } else {
                    z3 = Y;
                    boolean isEmpty2 = arrayList3.isEmpty();
                    arrayList3.clear();
                    z12 = !isEmpty2;
                }
                if (z12) {
                    z5 = isEmpty != ((ArrayList) this.u0.d).isEmpty() ? z2 : false;
                    z7 = z5;
                    z6 = z2;
                    if (i == 0) {
                        TLRPC.User user2 = this.g2;
                        if (user2 != null && !uc7.K2(user2) && !this.g2.bot && (i & 4) != 0) {
                            this.g2 = uc7.s1(i2).X1(Long.valueOf(this.g2.id));
                            if (this.C0 != Z()) {
                                z6 = z2;
                            }
                        }
                        int i30 = uc7.r5;
                        if ((524288 & i) != 0) {
                            TLRPC.User user3 = this.g2;
                            ul ulVar = this.o4;
                            if (user3 != null) {
                                TLRPC.User X1 = uc7.s1(i2).X1(Long.valueOf(this.g2.id));
                                this.g2 = X1;
                                if (X1 == null || wf3.f(X1.emoji_status) == 0) {
                                    this.E2 = true;
                                    ulVar.g(bl8.d().e, z);
                                    ulVar.m(z4, z);
                                } else {
                                    this.E2 = z2;
                                    ulVar.j(wf3.f(this.g2.emoji_status), z);
                                    ulVar.m(wf3.A(this.g2.emoji_status), z);
                                }
                                j2 = wf3.c(this.g2);
                                z11 = true;
                            } else {
                                z11 = z6;
                                j2 = 0;
                            }
                            if (this.h2 != null) {
                                TLRPC.Chat M03 = uc7.s1(i2).M0(Long.valueOf(this.h2.id));
                                this.h2 = M03;
                                if (M03 == null || wf3.f(M03.emoji_status) == 0) {
                                    this.E2 = true;
                                    ulVar.g(bl8.d().e, z);
                                    ulVar.m(false, z);
                                } else {
                                    this.E2 = true;
                                    ulVar.j(wf3.f(this.h2.emoji_status), z);
                                    ulVar.m(wf3.A(this.h2.emoji_status), z);
                                }
                                j2 = wf3.c(this.h2);
                                z11 = true;
                            }
                            z10 = this.l4;
                            ul ulVar2 = this.p4;
                            if (j2 != 0) {
                                z10 = !z10;
                                ulVar2.j(j2, z);
                            } else {
                                ulVar2.g(null, z);
                            }
                            z6 = z11;
                        } else {
                            z10 = false;
                        }
                        if ((this.O0 || this.Q) && (i & 64) != 0) {
                            CharSequence C1 = uc7.s1(i2).C1(this.I0, getTopicId(), true);
                            CharSequence charSequence = this.j2;
                            if (charSequence == null ? C1 != null : !(C1 != null && charSequence.equals(C1))) {
                                z10 = true;
                            }
                        }
                        if (!z10 && (32768 & i) != 0 && (r47Var5 = this.g1) != null && r47Var5.v != this.j1) {
                            z10 = true;
                        }
                        if (!z10 && (i & TLObject.FLAG_13) != 0 && this.h2 != null) {
                            TLRPC.Chat M04 = uc7.s1(i2).M0(Long.valueOf(this.h2.id));
                            if ((M04 != null && M04.call_active && M04.call_not_empty) != this.w2) {
                                z10 = true;
                            }
                        }
                        if (!z10 && (i & 2) != 0) {
                            TLRPC.Chat chat2 = this.h2;
                            if (chat2 == null) {
                                i5 = i2;
                            } else if (chat2.monoforum) {
                                i5 = i2;
                            }
                            nf3 nf3Var = this.O4;
                            if (nf3Var != null && (hashMap = nf3Var.f) != null && !hashMap.isEmpty()) {
                                for (Map.Entry entry : nf3Var.f.entrySet()) {
                                    ((gc0) entry.getValue()).c(((Long) entry.getKey()).longValue());
                                }
                            }
                            z10 = true;
                            if (!z10 && (i & 1) != 0 && this.h2 == null) {
                                z10 = true;
                            }
                            if (!z10 && (i & 8) != 0 && this.g2 == null) {
                                z10 = true;
                            }
                            if (!z10 && (i & 16) != 0 && this.g2 == null) {
                                z10 = true;
                            }
                            if (!z10) {
                                r47 r47Var9 = this.g1;
                                if (r47Var9 != null && this.Y0 != r47Var9.E4()) {
                                    this.Y0 = this.g1.E4();
                                    z10 = true;
                                }
                                if (this.O0) {
                                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) uc7.s1(i5).R.f(this.I0);
                                    TLRPC.Chat M05 = dialog2 == null ? null : uc7.s1(i5).M0(Long.valueOf(-dialog2.id));
                                    if (M05 == null || !(M05.forum || (M05.monoforum && xc2.A(i5, M05, 24)))) {
                                        if (dialog2 instanceof TLRPC.TL_dialogFolder) {
                                            i12 = jf7.Y(i5).M;
                                            z8 = z5;
                                        } else if (dialog2 instanceof TLRPC.TL_dialogCommunity) {
                                            ga6 Q02 = uc7.s1(i5).Q0(-dialog2.id);
                                            int i31 = Q02.a;
                                            int i32 = Q02.b;
                                            int i33 = Q02.c;
                                            z8 = z5;
                                            int i34 = Q02.d;
                                            this.f1 = Q02.e;
                                            i12 = i31;
                                            i15 = i32;
                                            i14 = i33;
                                            i13 = i34;
                                        } else {
                                            z8 = z5;
                                            if (dialog2 != null) {
                                                int i35 = dialog2.unread_count;
                                                int i36 = dialog2.unread_mentions_count;
                                                int i37 = dialog2.unread_reactions_count;
                                                i13 = dialog2.unread_poll_votes_count;
                                                i14 = i37;
                                                i15 = i36;
                                                i12 = i35;
                                            } else {
                                                i12 = 0;
                                            }
                                        }
                                        i15 = 0;
                                        i14 = 0;
                                        i13 = 0;
                                    } else {
                                        uc7.s1(i5).g4.h(M05.id);
                                        i12 = iArr[0];
                                        i15 = iArr[1];
                                        i14 = iArr[2];
                                        this.e1 = iArr[3] != 0;
                                        i13 = iArr[4];
                                        z8 = z5;
                                    }
                                    if (xc2.p0(M05)) {
                                        i15 = 0;
                                    }
                                    if (dialog2 != null && (this.T0 != i12 || this.U0 != dialog2.unread_mark || this.V0 != i15 || this.W0 != i14)) {
                                        this.T0 = i12;
                                        this.V0 = i15;
                                        this.U0 = dialog2.unread_mark;
                                        this.W0 = i14;
                                        this.X0 = i13;
                                        z10 = true;
                                    }
                                    if (!z10 && (i & TLObject.FLAG_12) != 0 && (r47Var4 = this.g1) != null) {
                                        i10 = this.Z0;
                                        i11 = r47Var4.k.send_state;
                                        if (i10 != i11) {
                                            this.Z0 = i11;
                                            z10 = true;
                                        }
                                    }
                                    if (!z10) {
                                        invalidate();
                                        return z7;
                                    }
                                }
                            }
                            z8 = z5;
                            if (!z10) {
                                i10 = this.Z0;
                                i11 = r47Var4.k.send_state;
                                if (i10 != i11) {
                                }
                            }
                            if (!z10) {
                            }
                        }
                        i5 = i2;
                        if (!z10) {
                            z10 = true;
                        }
                        if (!z10) {
                            z10 = true;
                        }
                        if (!z10) {
                            z10 = true;
                        }
                        if (!z10) {
                        }
                        z8 = z5;
                        if (!z10) {
                        }
                        if (!z10) {
                        }
                    } else {
                        i5 = i2;
                        z8 = z5;
                    }
                    this.g2 = null;
                    this.h2 = null;
                    this.i2 = null;
                    if (this.L0 != 0) {
                        uc7 s12 = uc7.s1(i5);
                        ArrayList arrayList5 = (ArrayList) s12.x.f(this.L0);
                        if (arrayList5 != null) {
                            int size = arrayList5.size();
                            for (int i38 = 0; i38 < size; i38++) {
                                ArrayList arrayList6 = (ArrayList) s12.S.f(((TLRPC.Dialog) arrayList5.get(i38)).id);
                                if (arrayList6 != null && !arrayList6.isEmpty()) {
                                    r47Var3 = (r47) arrayList6.get(0);
                                    break;
                                }
                            }
                        }
                        r47Var3 = null;
                        this.g1 = r47Var3;
                    }
                    i6 = this.K0;
                    if (i6 == 0) {
                        this.a1 = false;
                        this.c1 = false;
                        uj3 uj3Var = this.E4;
                        if (uj3Var == null || (o3 = uj3Var.o3(i5, this.k1, i6, false)) == null || o3.isEmpty()) {
                            r47Var2 = null;
                        } else {
                            int size2 = o3.size();
                            r47Var2 = null;
                            for (int i39 = 0; i39 < size2; i39++) {
                                TLRPC.Dialog dialog3 = (TLRPC.Dialog) o3.get(i39);
                                zh6 zh6Var = uc7.s1(i5).S;
                                if (zh6Var != null) {
                                    ArrayList arrayList7 = (ArrayList) zh6Var.f(dialog3.id);
                                    r47 r47Var10 = (arrayList7 == null || arrayList7.isEmpty()) ? null : (r47) arrayList7.get(0);
                                    if (r47Var10 != null && (r47Var2 == null || r47Var10.k.date > r47Var2.k.date)) {
                                        r47Var2 = r47Var10;
                                    }
                                    if (dialog3.pinnedNum == 0 && r47Var2 != null) {
                                        break;
                                    }
                                }
                            }
                        }
                        this.g1 = r47Var2;
                        j = r47Var2 != null ? r47.B0(r47Var2.k) : 0L;
                    } else {
                        this.c1 = false;
                        if (this.O != null) {
                            boolean p2 = uc7.s1(i5).p2(this.I0, 0L, null);
                            boolean p22 = uc7.s1(i5).p2(this.I0, this.O.id, null);
                            this.b1 = p22;
                            if (p2 == p22) {
                                this.a1 = false;
                                this.c1 = false;
                            } else {
                                this.a1 = p22;
                                this.c1 = !p22;
                            }
                        } else {
                            this.a1 = this.O0 && uc7.s1(i5).p2(this.I0, (long) getTopicId(), null);
                        }
                        j = this.I0;
                    }
                    if (j != 0) {
                        if (wf3.B(j)) {
                            TLRPC.EncryptedChat a1 = uc7.s1(i5).a1(Integer.valueOf((int) (j & 4294967295L)));
                            this.i2 = a1;
                            if (a1 != null) {
                                this.g2 = uc7.s1(i5).X1(Long.valueOf(this.i2.user_id));
                            }
                        } else if (wf3.D(j)) {
                            this.g2 = uc7.s1(i5).X1(Long.valueOf(j));
                        } else {
                            TLRPC.Chat M06 = uc7.s1(i5).M0(Long.valueOf(-j));
                            this.h2 = M06;
                            if (!this.O0 && M06 != null && M06.migrated_to != null && (M0 = uc7.s1(i5).M0(Long.valueOf(this.h2.migrated_to.channel_id))) != null) {
                                this.h2 = M0;
                            }
                        }
                        if (this.v2 && this.g2 != null && this.g1.O3()) {
                            this.g2 = uc7.s1(i5).X1(Long.valueOf(yac.h(i5).n));
                        }
                    }
                    this.F = this.P0 && xc2.Y(this.h2) && this.O0;
                    if (this.K0 == 0) {
                        aob.u1.setCallback(this);
                        rb0 rb0Var3 = rb0Var;
                        i7 = 2;
                        rb0Var3.f(2);
                        imageReceiver2 = imageReceiver;
                        imageReceiver2.d0(null, null, rb0Var3, null, this.g2, 0);
                    } else {
                        rb0 rb0Var4 = rb0Var;
                        imageReceiver2 = imageReceiver;
                        i7 = 2;
                        if (!this.P || (r47Var = this.g1) == null) {
                            TLRPC.User user4 = this.g2;
                            if (user4 != null) {
                                rb0Var4.q(user4);
                                if (lbc.B(this.g2)) {
                                    rb0Var4.f(12);
                                    imageReceiver2.d0(null, null, rb0Var4, null, this.g2, 0);
                                } else if (lbc.u(this.g2)) {
                                    rb0Var4.f(21);
                                    imageReceiver2.d0(null, null, rb0Var4, null, this.g2, 0);
                                } else if (lbc.D(this.g2) && this.s0 && !this.r0) {
                                    rb0Var4.f(22);
                                    imageReceiver2.d0(null, null, rb0Var4, null, this.g2, 0);
                                } else if (!lbc.D(this.g2) || this.v2 || this.r0) {
                                    imageReceiver2.V(this.g2, rb0Var4, null, true, 1, false);
                                } else {
                                    rb0Var4.f(1);
                                    imageReceiver2.d0(null, null, rb0Var4, null, this.g2, 0);
                                }
                            } else {
                                TLRPC.Chat chat3 = this.h2;
                                if (chat3 != null) {
                                    if (chat3.monoforum) {
                                        ro4.p(i5, chat3, rb0Var4, imageReceiver2);
                                        rb0Var4.p = 1.0f;
                                    } else {
                                        rb0Var4.p(chat3);
                                        imageReceiver2.U(chat3, rb0Var4, null);
                                    }
                                }
                            }
                        } else {
                            rb0Var4.o(r47Var.b1());
                            imageReceiver2.U(this.g1.b1(), rb0Var4, null);
                        }
                    }
                    boolean z18 = z6;
                    if (z && (((i8 = i4) != this.T0 || z15 != this.U0) && (!this.O0 || System.currentTimeMillis() - this.C4 > 100))) {
                        valueAnimator = this.U3;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        float[] fArr = new float[i7];
                        // fill-array-data instruction
                        fArr[0] = 0.0f;
                        fArr[1] = 1.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
                        this.U3 = ofFloat;
                        ofFloat.addUpdateListener(new ef3(this, (byte) 0));
                        this.U3.addListener(new hf3(this, (byte) 0));
                        if ((i8 != 0 || this.U0) && (this.U0 || !z15)) {
                            this.U3.setDuration(220L);
                            this.U3.setInterpolator(new OvershootInterpolator());
                        } else {
                            int i40 = this.T0;
                            ValueAnimator valueAnimator2 = this.U3;
                            if (i40 == 0) {
                                valueAnimator2.setDuration(150L);
                                this.U3.setInterpolator(k43.f);
                            } else {
                                valueAnimator2.setDuration(430L);
                                this.U3.setInterpolator(k43.f);
                            }
                        }
                        if (this.H3 || !this.M3 || this.Y3 == null) {
                            i9 = i8;
                        } else {
                            String format = String.format("%d", Integer.valueOf(i8));
                            String format2 = String.format("%d", Integer.valueOf(this.T0));
                            if (format.length() == format2.length()) {
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(format);
                                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(format2);
                                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(format2);
                                int i41 = 0;
                                while (i41 < format.length()) {
                                    if (format.charAt(i41) == format2.charAt(i41)) {
                                        int i42 = i41 + 1;
                                        spannableStringBuilder.setSpan(new fy2((byte) 1), i41, i42, 0);
                                        str = format2;
                                        spannableStringBuilder2.setSpan(new fy2((byte) 1), i41, i42, 0);
                                    } else {
                                        str = format2;
                                        spannableStringBuilder3.setSpan(new fy2((byte) 1), i41, i41 + 1, 0);
                                    }
                                    i41++;
                                    format2 = str;
                                }
                                i9 = i8;
                                int max = Math.max(hl.L(8.0f), (int) Math.ceil(aob.L0.measureText(format)));
                                TextPaint textPaint = aob.L0;
                                Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                                this.Z3 = new StaticLayout(spannableStringBuilder, textPaint, max, alignment, 1.0f, 0.0f, false);
                                this.a4 = new StaticLayout(spannableStringBuilder3, aob.L0, max, alignment, 1.0f, 0.0f, false);
                                this.b4 = new StaticLayout(spannableStringBuilder2, aob.L0, max, alignment, 1.0f, 0.0f, false);
                            } else {
                                i9 = i8;
                                this.Z3 = this.Y3;
                            }
                        }
                        this.Q3 = this.P3;
                        this.R3 = this.O3;
                        this.S3 = this.T0 <= i9;
                        this.U3.start();
                    }
                    this.T3.a(this.X0 == 0, z);
                    boolean z19 = this.W0 == 0;
                    if (z || z19 == z14) {
                        f = 0.0f;
                    } else {
                        ValueAnimator valueAnimator3 = this.V3;
                        if (valueAnimator3 != null) {
                            valueAnimator3.cancel();
                        }
                        f = 0.0f;
                        this.X3 = 0.0f;
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        this.V3 = ofFloat2;
                        ofFloat2.addUpdateListener(new ef3(this, (byte) 1));
                        this.V3.addListener(new hf3(this, (byte) 1));
                        ValueAnimator valueAnimator4 = this.V3;
                        if (z19) {
                            valueAnimator4.setDuration(220L);
                            this.V3.setInterpolator(new OvershootInterpolator());
                        } else {
                            valueAnimator4.setDuration(150L);
                            this.V3.setInterpolator(k43.f);
                        }
                        this.V3.start();
                    }
                    z9 = X() && (chat = this.h2) != null && chat.monoforum;
                    this.E = z9;
                    if (!z9) {
                        L = 1;
                    } else if (this.F) {
                        L = hl.L(12.0f);
                    } else {
                        TLRPC.Chat chat4 = this.h2;
                        L = ((chat4 == null || !chat4.forum || this.K0 != 0 || this.P) && (this.s0 || (user = this.g2) == null || !user.self || !uc7.s1(i5).P3)) ? hl.L(28.0f) : hl.L(16.0f);
                    }
                    imageReceiver2.q0(L);
                    z13 = z18;
                }
            } else {
                z3 = Y;
                z4 = false;
                i4 = i21;
                imageReceiver = imageReceiver5;
            }
            z5 = z4;
            z6 = z5;
            z7 = z6;
            if (i == 0) {
            }
            this.g2 = null;
            this.h2 = null;
            this.i2 = null;
            if (this.L0 != 0) {
            }
            i6 = this.K0;
            if (i6 == 0) {
            }
            if (j != 0) {
            }
            this.F = this.P0 && xc2.Y(this.h2) && this.O0;
            if (this.K0 == 0) {
            }
            boolean z182 = z6;
            if (z) {
                valueAnimator = this.U3;
                if (valueAnimator != null) {
                }
                float[] fArr2 = new float[i7];
                // fill-array-data instruction
                fArr2[0] = 0.0f;
                fArr2[1] = 1.0f;
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(fArr2);
                this.U3 = ofFloat3;
                ofFloat3.addUpdateListener(new ef3(this, (byte) 0));
                this.U3.addListener(new hf3(this, (byte) 0));
                if (i8 != 0) {
                }
                this.U3.setDuration(220L);
                this.U3.setInterpolator(new OvershootInterpolator());
                if (this.H3) {
                }
                i9 = i8;
                this.Q3 = this.P3;
                this.R3 = this.O3;
                this.S3 = this.T0 <= i9;
                this.U3.start();
            }
            this.T3.a(this.X0 == 0, z);
            if (this.W0 == 0) {
            }
            if (z) {
            }
            f = 0.0f;
            if (X()) {
            }
            this.E = z9;
            if (!z9) {
            }
            imageReceiver2.q0(L);
            z13 = z182;
        }
        if (!this.Q && (getMeasuredWidth() != 0 || getMeasuredHeight() != 0)) {
            z8 = true;
        }
        if (!z13) {
            int i43 = this.v0.y;
            t6b.r(uc7.s1(i5).O1(), getDialogId());
        }
        if (!z) {
            this.d1 = (this.a1 || this.c1) ? 1.0f : f;
            ValueAnimator valueAnimator5 = this.U3;
            if (valueAnimator5 != null) {
                valueAnimator5.cancel();
            }
        }
        invalidate();
        if (Y() != z3) {
            z7 = true;
        }
        if (z8) {
            if (this.x3) {
                C();
            } else {
                this.B0 = true;
            }
        }
        l0(z);
        return z7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ed, code lost:
    
        if (lq3.q(r33.G0).c(1, r4.size) == false) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f0  */
    /* JADX WARN: Type inference failed for: r14v10, types: [java.util.ArrayList<org.telegram.tgnet.TLRPC$PhotoSize>] */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9, types: [int] */
    /* JADX WARN: Type inference failed for: r8v25, types: [org.telegram.tgnet.TLRPC$Document] */
    /* JADX WARN: Type inference failed for: r8v28, types: [org.telegram.tgnet.TLRPC$Photo] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k0() {
        TLRPC.Message message;
        int i;
        ?? r14;
        boolean z;
        TLRPC.PhotoSize photoSize;
        TLRPC.PhotoSize Q;
        TLRPC.PhotoSize photoSize2;
        TLRPC.PhotoSize w;
        boolean z2;
        int i2;
        TLRPC.PhotoSize photoSize3;
        r47 r47Var = this.g1;
        if (r47Var != null) {
            String E1 = uc7.s1(r47Var.K1).E1(this.g1.k.restriction_reason);
            r47 r47Var2 = this.g1;
            TLRPC.PhotoSize photoSize4 = null;
            int i3 = 3;
            boolean z3 = false;
            if (r47Var2 != null && (message = r47Var2.k) != null) {
                TLRPC.MessageMedia messageMedia = message.media;
                if (messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) {
                    this.S1 = 0;
                    this.T1 = false;
                    TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) messageMedia;
                    int i4 = 0;
                    int i5 = 0;
                    while (i4 < tL_messageMediaPaidMedia.extended_media.size() && this.S1 < i3) {
                        TLRPC.MessageExtendedMedia messageExtendedMedia = tL_messageMediaPaidMedia.extended_media.get(i4);
                        boolean z4 = messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview;
                        boolean[] zArr = this.Y1;
                        boolean[] zArr2 = this.X1;
                        ImageReceiver[] imageReceiverArr = this.W1;
                        if (z4) {
                            i = i5 + 1;
                            TLRPC.PhotoSize photoSize5 = ((TLRPC.TL_messageExtendedMediaPreview) messageExtendedMedia).thumb;
                            if (i5 < i3 && photoSize5 != null) {
                                this.T1 = z3;
                                int i6 = this.S1;
                                if (i6 < i3) {
                                    this.S1 = i6 + 1;
                                    zArr2[i5] = z3;
                                    zArr[i5] = true;
                                    imageReceiverArr[i5].Z(jn5.f(photoSize5, this.g1.k), "2_2_b", null, null, null, 0L, null, this.g1, 0);
                                    imageReceiverArr[i5].q0(hl.L(2.0f));
                                    this.W = z3;
                                }
                            }
                        } else if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia) {
                            i = i5 + 1;
                            TLRPC.MessageMedia messageMedia2 = ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media;
                            if (messageMedia2 instanceof TLRPC.TL_messageMediaPhoto) {
                                ?? r8 = messageMedia2.photo;
                                r14 = r8.sizes;
                                photoSize3 = r8;
                            } else if (messageMedia2 instanceof TLRPC.TL_messageMediaDocument) {
                                boolean J4 = r47.J4(messageMedia2.document);
                                ?? r82 = messageMedia2.document;
                                z = J4;
                                r14 = r82.thumbs;
                                photoSize = r82;
                                Q = xb4.Q(r14);
                                if (Q == null) {
                                    Q = xb4.w(r14, 40, z3, photoSize4, z3);
                                }
                                photoSize2 = Q;
                                w = xb4.w(r14, hl.Y0(z3), z3, photoSize4, true);
                                if (photoSize2 == w) {
                                    w = photoSize4;
                                }
                                if (w == null) {
                                    z2 = z3;
                                    i2 = i5;
                                } else {
                                    z2 = z3;
                                    i2 = i5;
                                }
                                w = photoSize2;
                                if (photoSize2 != null) {
                                    this.T1 = (this.T1 || z) ? true : z2;
                                    int i7 = this.S1;
                                    if (i7 < 3) {
                                        this.S1 = i7 + 1;
                                        zArr2[i2] = z;
                                        zArr[i2] = z2;
                                        imageReceiverArr[i2].Z(jn5.f(w, photoSize), "20_20", jn5.f(photoSize2, photoSize), "20_20", null, (long) ((z || w == null) ? z2 : w.size), null, this.g1, 0);
                                        imageReceiverArr[i2].q0(hl.L(2.0f));
                                        this.W = z2;
                                    }
                                }
                            } else {
                                TLRPC.PhotoSize photoSize6 = photoSize4;
                                r14 = photoSize6;
                                photoSize3 = photoSize6;
                            }
                            z = z3;
                            photoSize = photoSize3;
                            Q = xb4.Q(r14);
                            if (Q == null) {
                            }
                            photoSize2 = Q;
                            w = xb4.w(r14, hl.Y0(z3), z3, photoSize4, true);
                            if (photoSize2 == w) {
                            }
                            if (w == null) {
                            }
                            w = photoSize2;
                            if (photoSize2 != null) {
                            }
                        } else {
                            i4++;
                            photoSize4 = null;
                            i3 = 3;
                            z3 = false;
                        }
                        i5 = i;
                        i4++;
                        photoSize4 = null;
                        i3 = 3;
                        z3 = false;
                    }
                    return;
                }
            }
            ArrayList arrayList = this.h1;
            if (arrayList != null && arrayList.size() > 1 && TextUtils.isEmpty(E1) && this.K0 == 0 && this.i2 == null) {
                this.S1 = 0;
                this.T1 = false;
                Collections.sort(this.h1, Comparator$-CC.comparingInt(new nm((byte) 3)));
                for (int i8 = 0; i8 < Math.min(3, this.h1.size()); i8++) {
                    r47 r47Var3 = (r47) this.h1.get(i8);
                    if (r47Var3 != null && !r47Var3.l5() && (r47.R3(r47Var3.k) || r47Var3.L3() || r47.K4(r47Var3.k) || r47Var3.g4() || r47Var3.x4())) {
                        String str = r47Var3.Y4() ? r47Var3.k.media.webpage.type : null;
                        if (!"app".equals(str) && !"profile".equals(str) && !"article".equals(str) && (str == null || !str.startsWith("telegram_"))) {
                            h0(i8, r47Var3);
                        }
                    }
                }
                return;
            }
            r47 r47Var4 = this.g1;
            if (r47Var4 == null || this.K0 != 0) {
                return;
            }
            this.S1 = 0;
            this.T1 = false;
            if (r47Var4.l5()) {
                return;
            }
            if (r47.R3(this.g1.k) || this.g1.L3() || r47.K4(this.g1.k) || this.g1.g4() || this.g1.x4()) {
                String str2 = this.g1.Y4() ? this.g1.k.media.webpage.type : null;
                if ("app".equals(str2) || "profile".equals(str2) || "article".equals(str2)) {
                    return;
                }
                if (str2 == null || !str2.startsWith("telegram_")) {
                    h0(0, this.g1);
                }
            }
        }
    }

    public final void l0(boolean z) {
        TL_account.RequirementToContact P2 = (this.a5 == null || this.g2 == null) ? null : uc7.s1(this.G0).P2(this.g2.id);
        boolean z2 = P2 instanceof TL_account.requirementToContactPremium;
        if (this.o2 == z2 && this.q2 == wf3.j(P2)) {
            return;
        }
        this.o2 = z2;
        this.q2 = wf3.j(P2);
        if (!z) {
            this.n2.f(this.o2, true);
            this.p2.f(this.q2 > 0, true);
        }
        invalidate();
    }

    public final void m0() {
        if (this.S1 > 0) {
            StaticLayout staticLayout = Y() ? this.i3 : this.f3;
            int i = Y() ? this.d3 : this.c3;
            if (staticLayout != null) {
                try {
                    CharSequence text = staticLayout.getText();
                    if (text instanceof Spanned) {
                        mf3[] mf3VarArr = (mf3[]) ((Spanned) text).getSpans(0, text.length(), mf3.class);
                        boolean[] zArr = this.V1;
                        if (mf3VarArr == null || mf3VarArr.length <= 0) {
                            for (int i2 = 0; i2 < 3; i2++) {
                                zArr[i2] = false;
                            }
                            return;
                        }
                        int spanStart = ((Spanned) text).getSpanStart(mf3VarArr[0]);
                        if (spanStart < 0) {
                            spanStart = 0;
                        }
                        int ceil = (int) Math.ceil(Math.min(staticLayout.getPrimaryHorizontal(spanStart), staticLayout.getPrimaryHorizontal(spanStart + 1)));
                        if (ceil != 0 && !this.y0 && !this.z0) {
                            ceil += hl.L(3.0f);
                        }
                        for (int i3 = 0; i3 < this.S1; i3++) {
                            this.W1[i3].L0 = i + ceil + hl.L((this.M4 + 2) * i3);
                            zArr[i3] = true;
                        }
                    }
                } catch (Exception e) {
                    cc4.g(e, true);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.Z1.I();
        int i = 0;
        while (true) {
            ImageReceiver[] imageReceiverArr = this.W1;
            if (i >= imageReceiverArr.length) {
                break;
            }
            imageReceiverArr[i].I();
            i++;
        }
        c0();
        this.n3 = hm.update(0, this, this.n3, this.f3);
        this.o3 = hm.update(0, this, this.o3, this.t3);
        this.p3 = hm.update(0, this, this.p3, this.i3);
        this.q3 = hm.update(0, this, this.q3, this.A2);
        ul ulVar = this.o4;
        if (ulVar != null) {
            ulVar.a();
        }
        ul ulVar2 = this.p4;
        if (ulVar2 != null) {
            ulVar2.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.y1 = false;
        this.B1 = false;
        this.C1 = 0.0f;
        this.x3 = false;
        this.y3 = (getIsPinned() && this.z3) ? 1.0f : 0.0f;
        this.Z1.K();
        int i = 0;
        while (true) {
            ImageReceiver[] imageReceiverArr = this.W1;
            if (i >= imageReceiverArr.length) {
                break;
            }
            imageReceiverArr[i].K();
            i++;
        }
        b29 b29Var = this.z1;
        if (b29Var != null) {
            b29Var.stop();
            this.z1.O(true, 0.0f);
            this.z1.setCallback(null);
            this.z1 = null;
            this.A1 = false;
        }
        dk3 dk3Var = this.t4;
        if (dk3Var != null) {
            dk3Var.d.remove(Long.valueOf(this.I0));
        }
        ul ulVar = this.o4;
        if (ulVar != null) {
            ulVar.b();
        }
        ul ulVar2 = this.p4;
        if (ulVar2 != null) {
            ulVar2.b();
        }
        hm.release(this, this.n3);
        hm.release(this, this.o3);
        hm.release(this, this.p3);
        hm.release(this, this.q3);
        this.v0.g();
        this.d0 = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:1021:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:1031:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:1048:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:1054:0x053b  */
    /* JADX WARN: Removed duplicated region for block: B:1057:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:1060:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:1061:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0cac  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0cb9  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0ccf  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0cd2  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0ce4  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0d17  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0d4e  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0d71  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0d74  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0d7f  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0d9e  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0da3  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0d54  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0dc1  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0fc6  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x1083  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x10e7  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x10f7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:449:0x123f  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x1387  */
    /* JADX WARN: Removed duplicated region for block: B:468:0x13f0  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x162f  */
    /* JADX WARN: Removed duplicated region for block: B:485:0x16a3  */
    /* JADX WARN: Removed duplicated region for block: B:526:0x17e0  */
    /* JADX WARN: Removed duplicated region for block: B:531:0x1811  */
    /* JADX WARN: Removed duplicated region for block: B:534:0x182c  */
    /* JADX WARN: Removed duplicated region for block: B:537:0x184b  */
    /* JADX WARN: Removed duplicated region for block: B:551:0x1868  */
    /* JADX WARN: Removed duplicated region for block: B:569:0x1944  */
    /* JADX WARN: Removed duplicated region for block: B:575:0x18a3  */
    /* JADX WARN: Removed duplicated region for block: B:593:0x197d  */
    /* JADX WARN: Removed duplicated region for block: B:596:0x1984  */
    /* JADX WARN: Removed duplicated region for block: B:601:0x1994  */
    /* JADX WARN: Removed duplicated region for block: B:606:0x19ea  */
    /* JADX WARN: Removed duplicated region for block: B:609:0x19f3  */
    /* JADX WARN: Removed duplicated region for block: B:611:0x19f8  */
    /* JADX WARN: Removed duplicated region for block: B:626:0x1a4b  */
    /* JADX WARN: Removed duplicated region for block: B:646:0x1ac8  */
    /* JADX WARN: Removed duplicated region for block: B:651:0x1b16  */
    /* JADX WARN: Removed duplicated region for block: B:660:0x1b76  */
    /* JADX WARN: Removed duplicated region for block: B:665:0x1bab  */
    /* JADX WARN: Removed duplicated region for block: B:676:0x1bf7  */
    /* JADX WARN: Removed duplicated region for block: B:682:0x1c10  */
    /* JADX WARN: Removed duplicated region for block: B:693:0x1c52  */
    /* JADX WARN: Removed duplicated region for block: B:696:0x1c5b  */
    /* JADX WARN: Removed duplicated region for block: B:698:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:699:0x1c54  */
    /* JADX WARN: Removed duplicated region for block: B:701:0x1c32  */
    /* JADX WARN: Removed duplicated region for block: B:709:0x1bcd  */
    /* JADX WARN: Removed duplicated region for block: B:719:0x1b82  */
    /* JADX WARN: Removed duplicated region for block: B:725:0x1b95  */
    /* JADX WARN: Removed duplicated region for block: B:736:0x143e  */
    /* JADX WARN: Removed duplicated region for block: B:799:0x1393  */
    /* JADX WARN: Removed duplicated region for block: B:804:0x128f  */
    /* JADX WARN: Removed duplicated region for block: B:897:0x1076  */
    /* JADX WARN: Removed duplicated region for block: B:915:0x0fc0  */
    /* JADX WARN: Removed duplicated region for block: B:918:0x0cb2  */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v61 */
    /* JADX WARN: Type inference failed for: r12v62 */
    /* JADX WARN: Type inference failed for: r12v7, types: [boolean, int] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onDraw(Canvas canvas) {
        float f;
        boolean z;
        int v0;
        int v02;
        int i;
        String L0;
        b29 b29Var;
        String str;
        b29 b29Var2;
        int i2;
        int i3;
        float f2;
        int i4;
        vnb vnbVar;
        boolean z2;
        tb tbVar;
        if3 if3Var;
        String str2;
        float f3;
        int i5;
        String str3;
        float f4;
        if3 if3Var2;
        float f5;
        if3 if3Var3;
        String str4;
        int ceil;
        int i6;
        StaticLayout staticLayout;
        float f6;
        boolean z3;
        b29 b29Var3;
        float f7;
        float f8;
        vnb vnbVar2;
        float f9;
        of3 of3Var;
        int i7;
        vnb vnbVar3;
        if3 if3Var4;
        tb tbVar2;
        ?? r12;
        float f10;
        int i8;
        boolean z4;
        int i9;
        boolean z5;
        ImageReceiver imageReceiver;
        boolean z6;
        gf3 gf3Var;
        of3 of3Var2;
        float f11;
        int i10;
        Canvas canvas2;
        boolean z7;
        float f12;
        boolean z8;
        boolean z9;
        TLRPC.TL_forumTopic tL_forumTopic;
        TLRPC.Chat chat;
        TLRPC.User user;
        tk0 tk0Var;
        TLRPC.TL_forumTopic tL_forumTopic2;
        ey8 ey8Var;
        lf3 lf3Var;
        float f13;
        float f14;
        int i11;
        int i12;
        float f15;
        int i13;
        boolean z10;
        lf3 lf3Var2;
        int i14;
        RectF rectF;
        vnb vnbVar4;
        lf3 lf3Var3;
        float f16;
        boolean z11;
        byte b;
        of3 of3Var3;
        boolean z12;
        float f17;
        lyc lycVar;
        int i15;
        float L;
        float f18;
        byte b2;
        boolean z13;
        boolean z14;
        boolean z15;
        StaticLayout staticLayout2;
        int i16;
        float f19;
        float A;
        StaticLayout staticLayout3;
        int i17;
        d2b t0;
        float A2;
        int i18;
        StaticLayout staticLayout4;
        jf3 jf3Var;
        uj3 uj3Var;
        li3 li3Var;
        TLRPC.TL_forumTopic tL_forumTopic3;
        ey8 ey8Var2;
        TLRPC.TL_forumTopic tL_forumTopic4;
        Canvas canvas3 = canvas;
        if ((this.I0 == 0 && this.H0 == null) || !this.A0) {
            return;
        }
        boolean z16 = this.h;
        tb tbVar3 = this.n4;
        if (z16 && ((this.K0 != 0 || (this.Q && (tL_forumTopic4 = this.O) != null && tL_forumTopic4.id == 1)) && (ey8Var2 = this.f2) != null && ey8Var2.C == 0.0f && this.x1 == 0.0f)) {
            canvas3.save();
            canvas3.translate(0.0f, (-this.F3) - this.n);
            canvas3.clipRect(0.0f, (1.0f - this.f2.J) * getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
            this.f2.c(canvas3, false);
            canvas3.restore();
            tbVar3.setVisibility(4);
            return;
        }
        boolean z17 = z16 && (this.K0 != 0 || (this.Q && (tL_forumTopic3 = this.O) != null && tL_forumTopic3.id == 1)) && this.f2 != null && this.x1 == 0.0f && (uj3Var = this.E4) != null && uj3Var.y3() && ((li3Var = uj3Var.H3) == null || !li3Var.c());
        ey8 ey8Var3 = this.f2;
        float f20 = ey8Var3 != null ? ey8Var3.J : 1.0f;
        if (z17) {
            canvas3.save();
            canvas3.clipRect(0.0f, (1.0f - f20) * getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
        }
        if (this.u1 != 0.0f && Build.VERSION.SDK_INT != 24) {
            canvas3.save();
            canvas3.clipRect(0.0f, this.v1 * this.u1, getMeasuredWidth(), getMeasuredHeight() - ((int) (this.w1 * this.u1)));
        }
        float f21 = this.x1;
        if3 if3Var5 = this.e2;
        vnb vnbVar5 = this.K4;
        if (f21 == 0.0f && this.p1 == 0.0f) {
            b29 b29Var4 = this.z1;
            if (b29Var4 != null) {
                b29Var4.stop();
                this.z1.O(true, 0.0f);
                this.z1.setCallback(null);
                this.z1 = null;
                this.A1 = false;
            }
            f = 1.0f;
            vnbVar = vnbVar5;
            z2 = z16;
            tbVar = tbVar3;
            f6 = 2.0f;
            if3Var3 = if3Var5;
        } else {
            canvas3.save();
            canvas3.translate(0.0f, -this.F3);
            if (this.M1) {
                v0 = aob.v0(this.N1, vnbVar5);
                v02 = aob.v0(this.O1, vnbVar5);
                String str5 = this.P1;
                f = 1.0f;
                i = this.Q1;
                L0 = ob6.M0(i, str5);
                z = false;
                b29Var = this.R1;
                this.z1 = b29Var;
            } else {
                f = 1.0f;
                z = false;
                if (this.K0 != 0) {
                    if (this.n1) {
                        v0 = aob.v0(aob.d9, vnbVar5);
                        v02 = aob.v0(aob.c9, vnbVar5);
                        i = 2131743538;
                        L0 = ob6.L0(2131743538);
                        b29Var = aob.y1;
                        this.z1 = b29Var;
                    } else {
                        v0 = aob.v0(aob.c9, vnbVar5);
                        v02 = aob.v0(aob.d9, vnbVar5);
                        i = 2131749070;
                        L0 = ob6.L0(2131749070);
                        b29Var = aob.x1;
                        this.z1 = b29Var;
                    }
                } else if (this.Q2) {
                    v0 = aob.v0(aob.c9, vnbVar5);
                    v02 = aob.v0(aob.d9, vnbVar5);
                    i = 2131746326;
                    L0 = ob6.L0(2131746326);
                    b29Var = aob.z1;
                    this.z1 = b29Var;
                } else if (this.l1 == 0) {
                    v0 = aob.v0(aob.c9, vnbVar5);
                    v02 = aob.v0(aob.d9, vnbVar5);
                    if (xc2.Y(this.h2)) {
                        String L02 = ob6.L0(2131743957);
                        v0 = aob.v0(aob.Y5, vnbVar5);
                        b29 b29Var5 = aob.K1;
                        this.z1 = b29Var5;
                        str = L02;
                        b29Var2 = b29Var5;
                        i2 = 2131743957;
                        i3 = v0;
                        if (this.x || (b29Var3 = this.s) == null) {
                            this.s = b29Var2;
                            this.w = i2;
                        } else {
                            this.z1 = b29Var3;
                            i2 = this.w;
                        }
                        if (!this.A1 && Math.abs(this.x1) > hl.L(43.0f)) {
                            this.A1 = true;
                            this.z1.O(true, 0.0f);
                            this.z1.setCallback(this);
                            this.z1.start();
                        }
                        float measuredWidth = getMeasuredWidth() + this.x1;
                        if (this.C1 >= f) {
                            aob.u0.setColor(v0);
                            vnbVar = vnbVar5;
                            z2 = z16;
                            tbVar = tbVar3;
                            if3Var = if3Var5;
                            str2 = "Arrow";
                            f2 = 0.0f;
                            f3 = measuredWidth;
                            i4 = i2;
                            canvas3.drawRect(measuredWidth - hl.L(8.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight(), aob.u0);
                            if (this.C1 == 0.0f) {
                                if (aob.A1) {
                                    aob.v1.L(aob.F0(aob.c9), str2);
                                    aob.A1 = z;
                                }
                                if (aob.B1) {
                                    b29 b29Var6 = aob.z1;
                                    b29Var6.a0 = true;
                                    int i19 = aob.c9;
                                    b29Var6.L(aob.F0(i19), "Line 1");
                                    aob.z1.L(aob.F0(i19), "Line 2");
                                    aob.z1.L(aob.F0(i19), "Line 3");
                                    aob.z1.j();
                                    aob.B1 = z;
                                }
                            }
                        } else {
                            f2 = 0.0f;
                            i4 = i2;
                            vnbVar = vnbVar5;
                            z2 = z16;
                            tbVar = tbVar3;
                            if3Var = if3Var5;
                            str2 = "Arrow";
                            f3 = measuredWidth;
                        }
                        int measuredWidth2 = (getMeasuredWidth() - hl.L(43.0f)) - (this.z1.getIntrinsicWidth() / 2);
                        int D = ik8.D(52.0f, getMeasuredHeight(), 2);
                        int intrinsicWidth = (this.z1.getIntrinsicWidth() / 2) + measuredWidth2;
                        int intrinsicHeight = (this.z1.getIntrinsicHeight() / 2) + D;
                        if (this.C1 <= f2) {
                            canvas3.save();
                            i5 = i4;
                            str3 = str;
                            f4 = f3;
                            canvas3.clipRect(f3 - hl.L(8.0f), f2, getMeasuredWidth(), getMeasuredHeight());
                            aob.u0.setColor(i3);
                            if3Var2 = if3Var;
                            canvas3.drawCircle(intrinsicWidth, intrinsicHeight, hl.G.getInterpolation(this.C1) * ((float) Math.sqrt(((intrinsicHeight - getMeasuredHeight()) * (intrinsicHeight - getMeasuredHeight())) + (intrinsicWidth * intrinsicWidth))), aob.u0);
                            canvas3.restore();
                            if (aob.A1) {
                                z3 = true;
                            } else {
                                aob.v1.L(aob.F0(aob.d9), str2);
                                z3 = true;
                                aob.A1 = true;
                            }
                            if (!aob.B1) {
                                b29 b29Var7 = aob.z1;
                                b29Var7.a0 = z3;
                                int i20 = aob.d9;
                                b29Var7.L(aob.F0(i20), "Line 1");
                                aob.z1.L(aob.F0(i20), "Line 2");
                                aob.z1.L(aob.F0(i20), "Line 3");
                                aob.z1.j();
                                aob.B1 = true;
                            }
                        } else {
                            i5 = i4;
                            str3 = str;
                            f4 = f3;
                            if3Var2 = if3Var;
                        }
                        canvas3.save();
                        canvas3.translate(measuredWidth2, D);
                        f5 = this.D1;
                        if (f5 != 0.0f || f5 == f) {
                            if3Var3 = if3Var2;
                        } else {
                            if3Var3 = if3Var2;
                            float interpolation = if3Var3.getInterpolation(f5) + f;
                            canvas3.scale(interpolation, interpolation, this.z1.getIntrinsicWidth() / 2, this.z1.getIntrinsicHeight() / 2);
                        }
                        boolean z18 = z;
                        jf0.u(z18 ? 1 : 0, z18 ? 1 : 0, this.z1);
                        this.z1.draw(canvas3);
                        canvas3.restore();
                        canvas3.clipRect(f4, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                        str4 = str3;
                        ceil = (int) Math.ceil(aob.L0.measureText(str4));
                        i6 = i5;
                        if (this.G4 == i6 || this.H4 != getMeasuredWidth()) {
                            this.G4 = i6;
                            this.H4 = getMeasuredWidth();
                            TextPaint textPaint = aob.M0;
                            int min = Math.min(hl.L(80.0f), ceil);
                            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                            staticLayout = new StaticLayout(str4, textPaint, min, alignment, 1.0f, 0.0f, false);
                            this.F4 = staticLayout;
                            if (staticLayout.getLineCount() > 1) {
                                this.F4 = new StaticLayout(str4, aob.N0, Math.min(hl.L(82.0f), ceil), alignment, 1.0f, 0.0f, false);
                            }
                        }
                        if (this.F4 == null) {
                            canvas3.save();
                            f6 = 2.0f;
                            canvas3.translate((getMeasuredWidth() - hl.L(43.0f)) - (this.F4.getWidth() / 2.0f), hl.L(36.0f) + D + (this.F4.getLineCount() > 1 ? -hl.L(4.0f) : 0.0f));
                            this.F4.draw(canvas3);
                            canvas3.restore();
                        } else {
                            f6 = 2.0f;
                        }
                        canvas3.restore();
                    } else {
                        int i21 = this.G0;
                        if (xea.m(i21) == 3) {
                            if (this.a1) {
                                i = 2131743956;
                                L0 = ob6.L0(2131743956);
                                b29Var = aob.I1;
                                this.z1 = b29Var;
                            } else {
                                i = 2131743974;
                                L0 = ob6.L0(2131743974);
                                b29Var = aob.H1;
                                this.z1 = b29Var;
                            }
                        } else if (xea.m(i21) == 4) {
                            i = 2131743977;
                            L0 = ob6.L0(2131743977);
                            v0 = aob.v0(aob.Y5, vnbVar5);
                            b29Var = aob.J1;
                            this.z1 = b29Var;
                        } else if (xea.m(i21) == 1) {
                            if (this.T0 > 0 || this.U0) {
                                i = 2131743976;
                                L0 = ob6.L0(2131743976);
                                b29Var = aob.L1;
                                this.z1 = b29Var;
                            } else {
                                i = 2131743975;
                                L0 = ob6.L0(2131743975);
                                b29Var = aob.M1;
                                this.z1 = b29Var;
                            }
                        } else if (xea.m(i21) != 0) {
                            i = 2131754165;
                            L0 = ob6.L0(2131754165);
                            b29Var = aob.v1;
                            this.z1 = b29Var;
                        } else if (getIsPinned()) {
                            i = 2131743955;
                            L0 = ob6.L0(2131743955);
                            b29Var = aob.O1;
                            this.z1 = b29Var;
                        } else {
                            i = 2131743973;
                            L0 = ob6.L0(2131743973);
                            b29Var = aob.N1;
                            this.z1 = b29Var;
                        }
                    }
                } else {
                    v0 = aob.v0(aob.d9, vnbVar5);
                    v02 = aob.v0(aob.c9, vnbVar5);
                    i = 2131743570;
                    L0 = ob6.L0(2131743570);
                    b29Var = aob.w1;
                    this.z1 = b29Var;
                }
            }
            int i22 = i;
            i3 = v02;
            i2 = i22;
            b29 b29Var8 = b29Var;
            str = L0;
            b29Var2 = b29Var8;
            if (this.x) {
            }
            this.s = b29Var2;
            this.w = i2;
            if (!this.A1) {
                this.A1 = true;
                this.z1.O(true, 0.0f);
                this.z1.setCallback(this);
                this.z1.start();
            }
            float measuredWidth3 = getMeasuredWidth() + this.x1;
            if (this.C1 >= f) {
            }
            int measuredWidth22 = (getMeasuredWidth() - hl.L(43.0f)) - (this.z1.getIntrinsicWidth() / 2);
            int D2 = ik8.D(52.0f, getMeasuredHeight(), 2);
            int intrinsicWidth2 = (this.z1.getIntrinsicWidth() / 2) + measuredWidth22;
            int intrinsicHeight2 = (this.z1.getIntrinsicHeight() / 2) + D2;
            if (this.C1 <= f2) {
            }
            canvas3.save();
            canvas3.translate(measuredWidth22, D2);
            f5 = this.D1;
            if (f5 != 0.0f) {
            }
            if3Var3 = if3Var2;
            boolean z182 = z;
            jf0.u(z182 ? 1 : 0, z182 ? 1 : 0, this.z1);
            this.z1.draw(canvas3);
            canvas3.restore();
            canvas3.clipRect(f4, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            str4 = str3;
            ceil = (int) Math.ceil(aob.L0.measureText(str4));
            i6 = i5;
            if (this.G4 == i6) {
            }
            this.G4 = i6;
            this.H4 = getMeasuredWidth();
            TextPaint textPaint2 = aob.M0;
            int min2 = Math.min(hl.L(80.0f), ceil);
            Layout.Alignment alignment2 = Layout.Alignment.ALIGN_CENTER;
            staticLayout = new StaticLayout(str4, textPaint2, min2, alignment2, 1.0f, 0.0f, false);
            this.F4 = staticLayout;
            if (staticLayout.getLineCount() > 1) {
            }
            if (this.F4 == null) {
            }
            canvas3.restore();
        }
        if (this.x1 != 0.0f) {
            canvas3.save();
            canvas3.translate(this.x1, 0.0f);
            f7 = 0.0f + this.x1;
        } else {
            f7 = 0.0f;
        }
        float L2 = hl.L(8.0f) * this.p1;
        boolean z19 = this.r4;
        RectF rectF2 = this.s4;
        if (z19) {
            f8 = 0.0f;
            rectF2.set(0.0f, 0.0f, getMeasuredWidth(), hl.U1(this.j0, getMeasuredHeight(), getCollapsedHeight()));
            rectF2.offset(0.0f, (-this.F3) + this.D0);
            canvas3.drawRoundRect(rectF2, L2, L2, aob.t0);
        } else {
            f8 = 0.0f;
        }
        canvas3.save();
        canvas3.translate(f8, (-this.n) * this.j0);
        if (this.K0 == 0 || (xea.m1 && this.E1 == f8)) {
            vnbVar2 = vnbVar;
            if (getIsPinned() || this.A3) {
                aob.u0.setColor(aob.v0(aob.s9, vnbVar2));
                aob.u0.setAlpha((int) ((1.0f - this.j0) * r3.getAlpha()));
            }
        } else {
            vnbVar2 = vnbVar;
            float f22 = f;
            aob.u0.setColor(hl.R0(this.E1, f22, 0, aob.v0(aob.s9, vnbVar2)));
            aob.u0.setAlpha((int) ((f22 - this.j0) * r3.getAlpha()));
        }
        canvas3.restore();
        lf3 lf3Var4 = this.J4;
        lf3Var4.b();
        if (this.D0 != 0.0f) {
            canvas3.save();
            canvas3.translate(0.0f, this.D0);
            f9 = this.D0 + 0.0f;
        } else {
            f9 = 0.0f;
        }
        float f23 = this.j0;
        if (f23 != 1.0f) {
            int i23 = -1;
            if (f23 != 0.0f) {
                float i24 = Utilities.i(f23 / 0.4f, 1.0f, 0.0f);
                if (xea.o() >= 2) {
                    lf3Var = lf3Var4;
                    f14 = 1.0f;
                    f13 = f6;
                    i12 = -1;
                    i23 = canvas3.saveLayerAlpha(qu6.B(1.0f, i24, hl.L(8.0f), hl.L(rm9.getRightPaddingSize() + 1)), 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) ((1.0f - this.j0) * 255.0f), 31);
                    i11 = 1;
                } else {
                    lf3Var = lf3Var4;
                    f13 = f6;
                    i12 = -1;
                    f14 = 1.0f;
                    int save = canvas3.save();
                    i11 = 1;
                    canvas3.clipRect(qu6.B(1.0f, i24, hl.L(8.0f), hl.L(rm9.getRightPaddingSize() + 1)), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    i23 = save;
                }
                canvas3.translate((-(getMeasuredWidth() - hl.L(74.0f))) * 0.7f * this.j0, 0.0f);
                f7 += (-(getMeasuredWidth() - hl.L(74.0f))) * 0.7f * this.j0;
            } else {
                lf3Var = lf3Var4;
                f13 = f6;
                f14 = 1.0f;
                i11 = 1;
                i12 = -1;
            }
            float f24 = f7;
            if (this.x1 != 0.0f || this.p1 != 0.0f) {
                canvas3.save();
                aob.u0.setColor(aob.v0(aob.d6, vnbVar2));
                rectF2.set(getMeasuredWidth() - hl.L(64.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                rectF2.offset(0.0f, -this.F3);
                canvas3.drawRoundRect(rectF2, L2, L2, aob.u0);
                if (this.r4) {
                    canvas3.drawRoundRect(rectF2, L2, L2, aob.t0);
                }
                if (this.K0 != 0 && (!xea.m1 || this.E1 != 0.0f)) {
                    aob.u0.setColor(hl.R0(this.E1, f14, 0, aob.v0(aob.s9, vnbVar2)));
                    aob.u0.setAlpha((int) ((f14 - this.j0) * r0.getAlpha()));
                } else if (getIsPinned() || this.A3) {
                    aob.u0.setColor(aob.v0(aob.s9, vnbVar2));
                    aob.u0.setAlpha((int) ((f14 - this.j0) * r0.getAlpha()));
                }
                canvas3.restore();
            }
            float f25 = this.x1;
            float f26 = this.p1;
            if (f25 != 0.0f) {
                if (f26 < f14) {
                    float f27 = f26 + 0.10666667f;
                    this.p1 = f27;
                    if (f27 > f14) {
                        this.p1 = f14;
                    }
                    i9 = i11;
                }
                i9 = 0;
            } else {
                if (f26 > 0.0f) {
                    float f28 = f26 - 0.10666667f;
                    this.p1 = f28;
                    if (f28 < 0.0f) {
                        this.p1 = 0.0f;
                    }
                    i9 = i11;
                }
                i9 = 0;
            }
            if (this.H2) {
                jf0.u(this.K2, this.L2, aob.Z0);
                aob.Z0.draw(canvas3);
            }
            boolean z20 = this.s2;
            int L3 = hl.L((z20 || xea.l1) ? 10.0f : 14.0f);
            if (((!z20 && !xea.l1) || Y()) && U()) {
                L3 -= hl.L(Y() ? 8.0f : 9.0f);
            }
            if (this.A2 != null) {
                if (!this.E2 || this.B2) {
                    f15 = 24.0f;
                    i13 = i23;
                } else {
                    if (this.D2 && this.F2 == null) {
                        Paint paint = new Paint();
                        this.F2 = paint;
                        paint.setShader(new LinearGradient(0.0f, 0.0f, hl.L(24.0f), 0.0f, new int[]{i12, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                        this.F2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    } else if (this.G2 == null) {
                        Paint paint2 = new Paint();
                        this.G2 = paint2;
                        paint2.setShader(new LinearGradient(0.0f, 0.0f, hl.L(24.0f), 0.0f, new int[]{0, i12}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                        this.G2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    }
                    f15 = 24.0f;
                    i13 = i23;
                    canvas3.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), jn7.d4, 31);
                    int i25 = this.y2;
                    canvas3.clipRect(i25, 0, this.z2 + i25, getMeasuredHeight());
                }
                if (this.K0 != 0) {
                    TextPaint textPaint3 = aob.A0[this.F0 ? 1 : 0];
                    int v03 = aob.v0(aob.Y8, vnbVar2);
                    textPaint3.linkColor = v03;
                    textPaint3.setColor(v03);
                } else if (this.i2 != null || ((jf3Var = this.H0) != null && jf3Var.g == 2)) {
                    TextPaint textPaint4 = aob.A0[this.F0 ? 1 : 0];
                    int v04 = aob.v0(aob.Z8, vnbVar2);
                    textPaint4.linkColor = v04;
                    textPaint4.setColor(v04);
                } else {
                    TextPaint textPaint5 = aob.A0[this.F0 ? 1 : 0];
                    int v05 = aob.v0(aob.X8, vnbVar2);
                    textPaint5.linkColor = v05;
                    textPaint5.setColor(v05);
                }
                canvas3.save();
                canvas3.translate(this.y2 + this.C2, L3);
                npa.f(canvas3, this.A2);
                StaticLayout staticLayout5 = this.A2;
                z10 = z20;
                lf3Var2 = lf3Var;
                i14 = i11;
                hm.drawAnimatedEmojis(canvas3, staticLayout5, this.q3, -0.075f, null, 0.0f, 0.0f, 0.0f, 1.0f, S(0, staticLayout5.getPaint().getColor()));
                canvas3.restore();
                if (this.E2 && !this.B2) {
                    canvas3.save();
                    boolean z21 = this.D2;
                    int i26 = this.y2;
                    if (z21) {
                        canvas3.translate(i26, 0.0f);
                        canvas3.drawRect(0.0f, 0.0f, hl.L(f15), getMeasuredHeight(), this.F2);
                    } else {
                        canvas3.translate((i26 + this.z2) - hl.L(f15), 0.0f);
                        canvas3.drawRect(0.0f, 0.0f, hl.L(f15), getMeasuredHeight(), this.G2);
                    }
                    canvas3.restore();
                    canvas3.restore();
                }
            } else {
                f15 = 24.0f;
                i13 = i23;
                z10 = z20;
                lf3Var2 = lf3Var;
                i14 = i11;
            }
            if (this.O2 != null && this.K0 == 0) {
                canvas3.save();
                canvas3.translate(this.M2, this.N2);
                TextPaint timeTextPaint = getTimeTextPaint();
                if (getIsPinned()) {
                    canvas3.translate(hl.L(20.0f), 0.0f);
                    float height = (this.O2.getHeight() / f13) - hl.L(8.5f);
                    float f29 = -hl.L(20.0f);
                    float L4 = hl.L(6.0f) + this.O2.getWidth();
                    Drawable drawable = (!this.H3 || V()) ? aob.k1 : aob.l1;
                    int L5 = (int) (((hl.L(17.0f) - drawable.getIntrinsicHeight()) / f13) + height);
                    int L6 = hl.L(4.0f) + ((int) f29);
                    drawable.setBounds(L6, L5, drawable.getIntrinsicWidth() + L6, drawable.getIntrinsicHeight() + L5);
                    int alpha = timeTextPaint.getAlpha();
                    timeTextPaint.setAlpha(27);
                    canvas3.drawRoundRect(f29, height, L4, height + hl.L(17.0f), hl.L(8.5f), hl.L(8.5f), timeTextPaint);
                    timeTextPaint.setAlpha(alpha);
                    drawable.draw(canvas3);
                }
                int color = this.O2.getPaint().getColor();
                int i27 = color != timeTextPaint.getColor() ? i14 : 0;
                if (i27 != 0) {
                    this.O2.getPaint().setColor(timeTextPaint.getColor());
                }
                npa.f(canvas3, this.O2);
                if (i27 != 0) {
                    this.O2.getPaint().setColor(color);
                }
                canvas3.restore();
            }
            if (M()) {
                aob.a1.setBounds(this.P2, ((this.O2.getHeight() - aob.a1.getIntrinsicHeight()) / 2) + this.N2, aob.a1.getIntrinsicWidth() + this.P2, aob.a1.getIntrinsicHeight() + ((this.O2.getHeight() - aob.a1.getIntrinsicHeight()) / 2) + this.N2);
                aob.a1.draw(canvas3);
            }
            if (this.t3 != null && !Y()) {
                if (this.K0 != 0) {
                    TextPaint textPaint6 = aob.F0;
                    int v06 = aob.v0(aob.n9, vnbVar2);
                    textPaint6.linkColor = v06;
                    textPaint6.setColor(v06);
                } else if (this.m2 != null) {
                    TextPaint textPaint7 = aob.F0;
                    int v07 = aob.v0(aob.j9, vnbVar2);
                    textPaint7.linkColor = v07;
                    textPaint7.setColor(v07);
                } else {
                    TextPaint textPaint8 = aob.F0;
                    int v08 = aob.v0(aob.m9, vnbVar2);
                    textPaint8.linkColor = v08;
                    textPaint8.setColor(v08);
                }
                canvas3.save();
                canvas3.translate(this.s3, this.r3);
                try {
                    npa.f(canvas3, this.t3);
                    StaticLayout staticLayout6 = this.t3;
                    hm.drawAnimatedEmojis(canvas3, staticLayout6, this.o3, -0.075f, null, 0.0f, 0.0f, 0.0f, 1.0f, S(i14, staticLayout6.getPaint().getColor()));
                } catch (Exception e) {
                    cc4.f(e);
                }
                canvas3.restore();
            }
            if (this.f3 != null) {
                if (this.K0 == 0) {
                    TextPaint textPaint9 = aob.E0[this.F0 ? 1 : 0];
                    int v09 = aob.v0(aob.g9, vnbVar2);
                    textPaint9.linkColor = v09;
                    textPaint9.setColor(v09);
                } else if (this.h2 != null) {
                    TextPaint textPaint10 = aob.E0[this.F0 ? 1 : 0];
                    int v010 = aob.v0(aob.l9, vnbVar2);
                    textPaint10.linkColor = v010;
                    textPaint10.setColor(v010);
                } else {
                    TextPaint textPaint11 = aob.E0[this.F0 ? 1 : 0];
                    int v011 = aob.v0(aob.h9, vnbVar2);
                    textPaint11.linkColor = v011;
                    textPaint11.setColor(v011);
                }
                float L7 = hl.L(14.0f);
                lf3 lf3Var5 = lf3Var2;
                boolean z22 = lf3Var5.m;
                int i28 = this.b3;
                float f30 = lf3Var5.l;
                float f31 = z22 ? i28 - (f30 * L7) : i28 + (f30 * L7);
                if (((!z10 && !xea.l1) || Y()) && U()) {
                    f31 -= hl.L(Y() ? 10.0f : 11.0f);
                }
                if (lf3Var5.l != 1.0f) {
                    canvas3.save();
                    canvas3.translate(this.c3, f31);
                    int alpha2 = this.f3.getPaint().getAlpha();
                    this.f3.getPaint().setAlpha((int) ((1.0f - lf3Var5.l) * alpha2));
                    ArrayList arrayList = this.k3;
                    if (arrayList.isEmpty()) {
                        f19 = L7;
                        rectF = rectF2;
                        vnbVar4 = vnbVar2;
                        if3Var4 = if3Var3;
                        lf3Var3 = lf3Var5;
                        i18 = alpha2;
                        f16 = 1.0f;
                        npa.f(canvas3, this.f3);
                        StaticLayout staticLayout7 = this.f3;
                        hm.drawAnimatedEmojis(canvas3, staticLayout7, this.n3, -0.075f, null, 0.0f, 0.0f, 0.0f, 1.0f, S(2, staticLayout7.getPaint().getColor()));
                    } else {
                        try {
                            canvas3.save();
                            npa.d(canvas3, arrayList);
                            npa.f(canvas3, this.f3);
                            try {
                                staticLayout4 = this.f3;
                            } catch (Exception e2) {
                                e = e2;
                                f19 = L7;
                                rectF = rectF2;
                                vnbVar4 = vnbVar2;
                                if3Var4 = if3Var3;
                                lf3Var3 = lf3Var5;
                                i18 = alpha2;
                                f16 = 1.0f;
                                cc4.f(e);
                                this.f3.getPaint().setAlpha(i18);
                                canvas3.restore();
                                canvas3.save();
                                boolean z23 = lf3Var3.m;
                                int i29 = this.b3;
                                float f32 = lf3Var3.l;
                                if (!z23) {
                                }
                                if (!z10) {
                                }
                                A -= hl.L(Y() ? 10.0f : 11.0f);
                                canvas3.translate(this.e3, A);
                                staticLayout3 = this.g3;
                                if (staticLayout3 != null) {
                                }
                                canvas3.restore();
                                if (this.g3 != null) {
                                }
                                if (this.i3 != null) {
                                }
                                if (this.K0 != 0) {
                                }
                                float f33 = 12.5f;
                                if (of3Var3.l4) {
                                }
                                vnbVar3 = vnbVar4;
                                if (of3Var3.c1) {
                                }
                                if (of3Var3.k1 != 2) {
                                }
                                i7 = 17;
                                if (of3Var3.k4) {
                                }
                                z4 = z11 ? 1 : 0;
                                if (!of3Var3.z3) {
                                }
                                if (!ob6.a0) {
                                }
                                aob.Y0.setAlpha((int) (of3Var3.y3 * 255.0f));
                                jf0.u(of3Var3.E3, of3Var3.D3, aob.Y0);
                                aob.Y0.draw(canvas3);
                                float f34 = of3Var3.T3.e;
                                if (of3Var3.u3) {
                                }
                                of3Var = of3Var3;
                                f10 = f16;
                                if (of3Var.I3) {
                                }
                                if (of3Var.S1 > 0) {
                                }
                                lycVar = of3Var.u0;
                                if (lycVar != null) {
                                }
                                i15 = i13;
                                r12 = z11;
                                if (i15 != -1) {
                                }
                                z5 = of3Var.c2;
                                imageReceiver = of3Var.Z1;
                                if (z5) {
                                }
                                z6 = of3Var.y;
                                gf3Var = of3Var.v0;
                                if (z6) {
                                }
                                if (of3Var.c2) {
                                }
                                if (imageReceiver.R0) {
                                }
                                if (of3Var.j0 > 0.0f) {
                                }
                                of3Var2 = of3Var;
                                if (of3Var2.D0 != 0.0f) {
                                }
                                if (of3Var2.x1 != 0.0f) {
                                }
                                if (z2) {
                                }
                                if (of3Var2.t2) {
                                }
                                f11 = 0.0f;
                                i10 = 1;
                                if (of3Var2.u1 != f11) {
                                }
                                canvas2 = canvas;
                                if (z17) {
                                }
                                z7 = of3Var2.z3;
                                if (!z7) {
                                }
                                float f35 = of3Var2.y3;
                                if (z7) {
                                }
                            }
                        } catch (Exception e3) {
                            e = e3;
                            f19 = L7;
                        }
                        try {
                            if3Var4 = if3Var3;
                            i18 = alpha2;
                            f19 = L7;
                            vnbVar4 = vnbVar2;
                            f16 = 1.0f;
                            rectF = rectF2;
                            lf3Var3 = lf3Var5;
                            try {
                                hm.drawAnimatedEmojis(canvas3, staticLayout4, this.n3, -0.075f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f, S(2, staticLayout4.getPaint().getColor()));
                                canvas3.restore();
                                for (int i30 = 0; i30 < arrayList.size(); i30++) {
                                    npa npaVar = (npa) arrayList.get(i30);
                                    npaVar.h(this.f3.getPaint().getColor());
                                    npaVar.draw(canvas3);
                                }
                            } catch (Exception e4) {
                                e = e4;
                                cc4.f(e);
                                this.f3.getPaint().setAlpha(i18);
                                canvas3.restore();
                                canvas3.save();
                                boolean z232 = lf3Var3.m;
                                int i292 = this.b3;
                                float f322 = lf3Var3.l;
                                if (!z232) {
                                }
                                if (!z10) {
                                    A -= hl.L(Y() ? 10.0f : 11.0f);
                                    canvas3.translate(this.e3, A);
                                    staticLayout3 = this.g3;
                                    if (staticLayout3 != null) {
                                        int alpha3 = staticLayout3.getPaint().getAlpha();
                                        this.g3.getPaint().setAlpha((int) (alpha3 * lf3Var3.l));
                                        this.g3.draw(canvas3);
                                        this.g3.getPaint().setAlpha(alpha3);
                                    }
                                    canvas3.restore();
                                    if (this.g3 != null) {
                                        canvas3.save();
                                        t0.b(vm2.o(aob.u0(aob.p9), (int) (Color.alpha(r4) * lf3Var3.l)));
                                        boolean z24 = lf3Var3.m;
                                        int i31 = this.b3;
                                        float f36 = lf3Var3.l;
                                        if (!z24) {
                                        }
                                        if (!z10) {
                                            A2 -= hl.L(Y() ? 10.0f : 11.0f);
                                            if (i17 != 1) {
                                            }
                                            canvas3.translate(this.D4, A2 + (i17 == 1 ? hl.L(f16) : 0));
                                            t0.draw(canvas3);
                                            invalidate();
                                            canvas3.restore();
                                        }
                                        A2 -= hl.L(Y() ? 10.0f : 11.0f);
                                        if (i17 != 1) {
                                        }
                                        canvas3.translate(this.D4, A2 + (i17 == 1 ? hl.L(f16) : 0));
                                        t0.draw(canvas3);
                                        invalidate();
                                        canvas3.restore();
                                    }
                                    if (this.i3 != null) {
                                    }
                                    if (this.K0 != 0) {
                                    }
                                    float f332 = 12.5f;
                                    if (of3Var3.l4) {
                                    }
                                    vnbVar3 = vnbVar4;
                                    if (of3Var3.c1) {
                                    }
                                    if (of3Var3.k1 != 2) {
                                    }
                                    i7 = 17;
                                    if (of3Var3.k4) {
                                    }
                                    z4 = z11 ? 1 : 0;
                                    if (!of3Var3.z3) {
                                    }
                                    if (!ob6.a0) {
                                    }
                                    aob.Y0.setAlpha((int) (of3Var3.y3 * 255.0f));
                                    jf0.u(of3Var3.E3, of3Var3.D3, aob.Y0);
                                    aob.Y0.draw(canvas3);
                                    float f342 = of3Var3.T3.e;
                                    if (of3Var3.u3) {
                                    }
                                    of3Var = of3Var3;
                                    f10 = f16;
                                    if (of3Var.I3) {
                                    }
                                    if (of3Var.S1 > 0) {
                                    }
                                    lycVar = of3Var.u0;
                                    if (lycVar != null) {
                                    }
                                    i15 = i13;
                                    r12 = z11;
                                    if (i15 != -1) {
                                    }
                                    z5 = of3Var.c2;
                                    imageReceiver = of3Var.Z1;
                                    if (z5) {
                                    }
                                    z6 = of3Var.y;
                                    gf3Var = of3Var.v0;
                                    if (z6) {
                                        if (!of3Var.E) {
                                        }
                                        if (!of3Var.P0) {
                                            float centerX = gf3Var.F.centerX() + hl.L(20.33f);
                                            float centerY = gf3Var.F.centerY() + hl.L(19.0f);
                                            tk0Var = of3Var.E0;
                                            if (tk0Var == null) {
                                            }
                                            br3.d(tk0Var, centerX, centerY, i7);
                                            canvas3.drawCircle(of3Var.E0.getBounds().exactCenterX(), of3Var.E0.getBounds().exactCenterY(), hl.L(8.0f), aob.l0(aob.v0(aob.d6, vnbVar3)));
                                            of3Var.E0.draw(canvas3);
                                        }
                                    }
                                    if (of3Var.c2) {
                                    }
                                    if (imageReceiver.R0) {
                                        i9 = 1;
                                    }
                                    if (of3Var.j0 > 0.0f) {
                                    }
                                    of3Var2 = of3Var;
                                    if (of3Var2.D0 != 0.0f) {
                                    }
                                    if (of3Var2.x1 != 0.0f) {
                                    }
                                    if (z2) {
                                        canvas3.save();
                                        canvas3.translate(0.0f, (-of3Var2.F3) - (of3Var2.n * of3Var2.j0));
                                        canvas3.clipRect(0.0f, (f10 - of3Var2.f2.J) * of3Var2.getMeasuredHeight(), of3Var2.getMeasuredWidth(), of3Var2.getMeasuredHeight());
                                        of3Var2.f2.c(canvas3, r12);
                                        canvas3.restore();
                                    }
                                    if (of3Var2.t2) {
                                    }
                                    f11 = 0.0f;
                                    i10 = 1;
                                    if (of3Var2.u1 != f11) {
                                    }
                                    canvas2 = canvas;
                                    if (z17) {
                                    }
                                    z7 = of3Var2.z3;
                                    if (!z7) {
                                    }
                                    float f352 = of3Var2.y3;
                                    if (z7) {
                                    }
                                }
                                A -= hl.L(Y() ? 10.0f : 11.0f);
                                canvas3.translate(this.e3, A);
                                staticLayout3 = this.g3;
                                if (staticLayout3 != null) {
                                }
                                canvas3.restore();
                                if (this.g3 != null) {
                                }
                                if (this.i3 != null) {
                                }
                                if (this.K0 != 0) {
                                }
                                float f3322 = 12.5f;
                                if (of3Var3.l4) {
                                }
                                vnbVar3 = vnbVar4;
                                if (of3Var3.c1) {
                                }
                                if (of3Var3.k1 != 2) {
                                }
                                i7 = 17;
                                if (of3Var3.k4) {
                                }
                                z4 = z11 ? 1 : 0;
                                if (!of3Var3.z3) {
                                }
                                if (!ob6.a0) {
                                }
                                aob.Y0.setAlpha((int) (of3Var3.y3 * 255.0f));
                                jf0.u(of3Var3.E3, of3Var3.D3, aob.Y0);
                                aob.Y0.draw(canvas3);
                                float f3422 = of3Var3.T3.e;
                                if (of3Var3.u3) {
                                }
                                of3Var = of3Var3;
                                f10 = f16;
                                if (of3Var.I3) {
                                }
                                if (of3Var.S1 > 0) {
                                }
                                lycVar = of3Var.u0;
                                if (lycVar != null) {
                                }
                                i15 = i13;
                                r12 = z11;
                                if (i15 != -1) {
                                }
                                z5 = of3Var.c2;
                                imageReceiver = of3Var.Z1;
                                if (z5) {
                                }
                                z6 = of3Var.y;
                                gf3Var = of3Var.v0;
                                if (z6) {
                                }
                                if (of3Var.c2) {
                                }
                                if (imageReceiver.R0) {
                                }
                                if (of3Var.j0 > 0.0f) {
                                }
                                of3Var2 = of3Var;
                                if (of3Var2.D0 != 0.0f) {
                                }
                                if (of3Var2.x1 != 0.0f) {
                                }
                                if (z2) {
                                }
                                if (of3Var2.t2) {
                                }
                                f11 = 0.0f;
                                i10 = 1;
                                if (of3Var2.u1 != f11) {
                                }
                                canvas2 = canvas;
                                if (z17) {
                                }
                                z7 = of3Var2.z3;
                                if (!z7) {
                                }
                                float f3522 = of3Var2.y3;
                                if (z7) {
                                }
                            }
                        } catch (Exception e5) {
                            e = e5;
                            f19 = L7;
                            rectF = rectF2;
                            vnbVar4 = vnbVar2;
                            if3Var4 = if3Var3;
                            lf3Var3 = lf3Var5;
                            i18 = alpha2;
                            f16 = 1.0f;
                            cc4.f(e);
                            this.f3.getPaint().setAlpha(i18);
                            canvas3.restore();
                            canvas3.save();
                            boolean z2322 = lf3Var3.m;
                            int i2922 = this.b3;
                            float f3222 = lf3Var3.l;
                            if (!z2322) {
                            }
                            if (!z10) {
                            }
                            A -= hl.L(Y() ? 10.0f : 11.0f);
                            canvas3.translate(this.e3, A);
                            staticLayout3 = this.g3;
                            if (staticLayout3 != null) {
                            }
                            canvas3.restore();
                            if (this.g3 != null) {
                            }
                            if (this.i3 != null) {
                            }
                            if (this.K0 != 0) {
                            }
                            float f33222 = 12.5f;
                            if (of3Var3.l4) {
                            }
                            vnbVar3 = vnbVar4;
                            if (of3Var3.c1) {
                            }
                            if (of3Var3.k1 != 2) {
                            }
                            i7 = 17;
                            if (of3Var3.k4) {
                            }
                            z4 = z11 ? 1 : 0;
                            if (!of3Var3.z3) {
                            }
                            if (!ob6.a0) {
                            }
                            aob.Y0.setAlpha((int) (of3Var3.y3 * 255.0f));
                            jf0.u(of3Var3.E3, of3Var3.D3, aob.Y0);
                            aob.Y0.draw(canvas3);
                            float f34222 = of3Var3.T3.e;
                            if (of3Var3.u3) {
                            }
                            of3Var = of3Var3;
                            f10 = f16;
                            if (of3Var.I3) {
                            }
                            if (of3Var.S1 > 0) {
                            }
                            lycVar = of3Var.u0;
                            if (lycVar != null) {
                            }
                            i15 = i13;
                            r12 = z11;
                            if (i15 != -1) {
                            }
                            z5 = of3Var.c2;
                            imageReceiver = of3Var.Z1;
                            if (z5) {
                            }
                            z6 = of3Var.y;
                            gf3Var = of3Var.v0;
                            if (z6) {
                            }
                            if (of3Var.c2) {
                            }
                            if (imageReceiver.R0) {
                            }
                            if (of3Var.j0 > 0.0f) {
                            }
                            of3Var2 = of3Var;
                            if (of3Var2.D0 != 0.0f) {
                            }
                            if (of3Var2.x1 != 0.0f) {
                            }
                            if (z2) {
                            }
                            if (of3Var2.t2) {
                            }
                            f11 = 0.0f;
                            i10 = 1;
                            if (of3Var2.u1 != f11) {
                            }
                            canvas2 = canvas;
                            if (z17) {
                            }
                            z7 = of3Var2.z3;
                            if (!z7) {
                            }
                            float f35222 = of3Var2.y3;
                            if (z7) {
                            }
                        }
                    }
                    this.f3.getPaint().setAlpha(i18);
                    canvas3.restore();
                } else {
                    f19 = L7;
                    rectF = rectF2;
                    vnbVar4 = vnbVar2;
                    if3Var4 = if3Var3;
                    lf3Var3 = lf3Var5;
                    f16 = 1.0f;
                }
                canvas3.save();
                boolean z23222 = lf3Var3.m;
                int i29222 = this.b3;
                float f32222 = lf3Var3.l;
                A = !z23222 ? qd4.A(f16, f32222, f19, i29222) : qu6.B(f16, f32222, f19, i29222);
                if (((!z10 && !xea.l1) || Y()) && U()) {
                    A -= hl.L(Y() ? 10.0f : 11.0f);
                }
                canvas3.translate(this.e3, A);
                staticLayout3 = this.g3;
                if (staticLayout3 != null && lf3Var3.l > 0.0f) {
                    int alpha32 = staticLayout3.getPaint().getAlpha();
                    this.g3.getPaint().setAlpha((int) (alpha32 * lf3Var3.l));
                    this.g3.draw(canvas3);
                    this.g3.getPaint().setAlpha(alpha32);
                }
                canvas3.restore();
                if (this.g3 != null && (((i17 = this.k2) >= 0 || (lf3Var3.l > 0.0f && (i17 = lf3Var3.n) >= 0)) && (t0 = aob.t0(i17)) != null)) {
                    canvas3.save();
                    t0.b(vm2.o(aob.u0(aob.p9), (int) (Color.alpha(r4) * lf3Var3.l)));
                    boolean z242 = lf3Var3.m;
                    int i312 = this.b3;
                    float f362 = lf3Var3.l;
                    A2 = !z242 ? qd4.A(f16, f362, f19, i312) : qu6.B(f16, f362, f19, i312);
                    if (((!z10 && !xea.l1) || Y()) && U()) {
                        A2 -= hl.L(Y() ? 10.0f : 11.0f);
                    }
                    if (i17 != 1 || i17 == 4) {
                        canvas3.translate(this.D4, A2 + (i17 == 1 ? hl.L(f16) : 0));
                    } else {
                        canvas3.translate(this.D4, ((hl.L(18.0f) - t0.getIntrinsicHeight()) / f13) + A2);
                    }
                    t0.draw(canvas3);
                    invalidate();
                    canvas3.restore();
                }
            } else {
                rectF = rectF2;
                vnbVar4 = vnbVar2;
                if3Var4 = if3Var3;
                lf3Var3 = lf3Var2;
                f16 = 1.0f;
            }
            if (this.i3 != null) {
                canvas3.save();
                if (this.c0 == null) {
                    this.c0 = new Paint(1);
                }
                za1 za1Var = this.d0;
                if (za1Var == null) {
                    za1Var = new za1(this);
                    this.d0 = za1Var;
                    z15 = false;
                    final boolean z25 = false ? 1 : 0;
                    za1Var.h = new Runnable(this) { // from class: ff3
                        public final /* synthetic */ of3 b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b3 = z25;
                            of3 of3Var4 = this.b;
                            switch (b3) {
                                case 0:
                                    kf3 kf3Var = of3Var4.e0;
                                    if (kf3Var != null) {
                                        kf3Var.o(of3Var4);
                                        break;
                                    }
                                    break;
                                default:
                                    kf3 kf3Var2 = of3Var4.e0;
                                    if (kf3Var2 != null) {
                                        kf3Var2.w(of3Var4);
                                        break;
                                    }
                                    break;
                            }
                        }
                    };
                    final byte b3 = 1;
                    Runnable runnable = new Runnable(this) { // from class: ff3
                        public final /* synthetic */ of3 b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b32 = b3;
                            of3 of3Var4 = this.b;
                            switch (b32) {
                                case 0:
                                    kf3 kf3Var = of3Var4.e0;
                                    if (kf3Var != null) {
                                        kf3Var.o(of3Var4);
                                        break;
                                    }
                                    break;
                                default:
                                    kf3 kf3Var2 = of3Var4.e0;
                                    if (kf3Var2 != null) {
                                        kf3Var2.w(of3Var4);
                                        break;
                                    }
                                    break;
                            }
                        }
                    };
                    za1Var.l = true;
                    za1Var.j = runnable;
                } else {
                    z15 = false;
                }
                if (this.g0 && this.N4 != 0 && ((i16 = this.k1) == 0 || i16 == 7 || i16 == 8)) {
                    int o = vm2.o(this.b0.getColor(), aob.h1() ? 36 : 26);
                    za1Var.g.setColor(o);
                    hf0 hf0Var = za1Var.e;
                    if (hf0Var != null) {
                        aob.F1(hf0Var, o, true);
                    }
                    za1 za1Var2 = this.d0;
                    za1Var2.i = z15;
                    za1Var2.c = z15 ? 1 : 0;
                    int i32 = this.N4;
                    if (i32 != 0 && i32 > 0) {
                        float f37 = this.b3;
                        if (((!z10 && !xea.l1) || Y()) && U()) {
                            f37 -= hl.L(Y() ? 10.0f : 11.0f);
                        }
                        RectF rectF3 = hl.P;
                        float primaryHorizontal = this.f3.getPrimaryHorizontal(z15 ? 1 : 0) + hl.L(f13) + this.c3;
                        float f38 = this.c3;
                        StaticLayout staticLayout8 = this.f3;
                        rectF3.set(primaryHorizontal, f37, (staticLayout8.getPrimaryHorizontal(Math.min(staticLayout8.getText().length(), this.N4)) + f38) - hl.L(3.0f), this.h3 - hl.L(4.0f));
                        rectF3.inset(-hl.L(8.0f), -hl.L(4.0f));
                        if (rectF3.right > rectF3.left) {
                            this.d0.a(rectF3);
                        }
                    }
                    float lineLeft = this.i3.getLineLeft(z15 ? 1 : 0);
                    RectF rectF4 = hl.P;
                    rectF4.set(this.d3 + lineLeft + hl.L(f13), hl.L(f13) + this.h3, this.i3.getLineWidth(z15 ? 1 : 0) + this.d3 + lineLeft + hl.L(12.0f), this.i3.getHeight() + this.h3);
                    rectF4.inset(-hl.L(8.0f), -hl.L(3.0f));
                    this.d0.a(rectF4);
                    za1 za1Var3 = this.d0;
                    za1Var3.c(canvas3, za1Var3.g);
                    hf0 hf0Var2 = za1Var3.e;
                    if (hf0Var2 != null) {
                        hf0Var2.draw(canvas3);
                    }
                    aob.t1.setAlpha(jn7.I1);
                    jf0.w(aob.t1, rectF4.right - hl.L(18.0f), bp1.z(rectF4.height(), aob.t1.getIntrinsicHeight(), f13, rectF4.top));
                    aob.t1.draw(canvas3);
                }
                canvas3.translate(this.d3, this.h3);
                ArrayList arrayList2 = this.m3;
                if (arrayList2.isEmpty()) {
                    b = 3;
                    npa.f(canvas3, this.i3);
                    StaticLayout staticLayout9 = this.i3;
                    hm.drawAnimatedEmojis(canvas3, staticLayout9, this.p3, -0.075f, null, 0.0f, 0.0f, 0.0f, 1.0f, S(3, staticLayout9.getPaint().getColor()));
                } else {
                    try {
                        canvas3.save();
                        npa.d(canvas3, arrayList2);
                        npa.f(canvas3, this.i3);
                        staticLayout2 = this.i3;
                        b = 3;
                    } catch (Exception e6) {
                        e = e6;
                        b = 3;
                    }
                    try {
                        hm.drawAnimatedEmojis(canvas3, staticLayout2, this.p3, -0.075f, arrayList2, 0.0f, 0.0f, 0.0f, 1.0f, S(3, staticLayout2.getPaint().getColor()));
                        canvas3.restore();
                        for (int i33 = z15 ? 1 : 0; i33 < arrayList2.size(); i33++) {
                            npa npaVar2 = (npa) arrayList2.get(i33);
                            npaVar2.h(this.i3.getPaint().getColor());
                            npaVar2.draw(canvas3);
                        }
                    } catch (Exception e7) {
                        e = e7;
                        cc4.f(e);
                        canvas.restore();
                        z11 = z15;
                        if (this.K0 != 0) {
                        }
                        float f332222 = 12.5f;
                        if (of3Var3.l4) {
                        }
                        vnbVar3 = vnbVar4;
                        if (of3Var3.c1) {
                        }
                        if (of3Var3.k1 != 2) {
                        }
                        i7 = 17;
                        if (of3Var3.k4) {
                        }
                        z4 = z11 ? 1 : 0;
                        if (!of3Var3.z3) {
                        }
                        if (!ob6.a0) {
                        }
                        aob.Y0.setAlpha((int) (of3Var3.y3 * 255.0f));
                        jf0.u(of3Var3.E3, of3Var3.D3, aob.Y0);
                        aob.Y0.draw(canvas3);
                        float f342222 = of3Var3.T3.e;
                        if (of3Var3.u3) {
                        }
                        of3Var = of3Var3;
                        f10 = f16;
                        if (of3Var.I3) {
                        }
                        if (of3Var.S1 > 0) {
                        }
                        lycVar = of3Var.u0;
                        if (lycVar != null) {
                        }
                        i15 = i13;
                        r12 = z11;
                        if (i15 != -1) {
                        }
                        z5 = of3Var.c2;
                        imageReceiver = of3Var.Z1;
                        if (z5) {
                        }
                        z6 = of3Var.y;
                        gf3Var = of3Var.v0;
                        if (z6) {
                        }
                        if (of3Var.c2) {
                        }
                        if (imageReceiver.R0) {
                        }
                        if (of3Var.j0 > 0.0f) {
                        }
                        of3Var2 = of3Var;
                        if (of3Var2.D0 != 0.0f) {
                        }
                        if (of3Var2.x1 != 0.0f) {
                        }
                        if (z2) {
                        }
                        if (of3Var2.t2) {
                        }
                        f11 = 0.0f;
                        i10 = 1;
                        if (of3Var2.u1 != f11) {
                        }
                        canvas2 = canvas;
                        if (z17) {
                        }
                        z7 = of3Var2.z3;
                        if (!z7) {
                        }
                        float f352222 = of3Var2.y3;
                        if (z7) {
                        }
                    }
                }
                canvas.restore();
                z11 = z15;
            } else {
                z11 = false;
                b = 3;
            }
            if (this.K0 != 0) {
                int i34 = (this.T2 ? 1 : 0) + (this.R2 ? 2 : z11 ? 1 : 0) + (this.S2 ? 4 : z11 ? 1 : 0);
                int i35 = this.y4;
                if (i35 >= 0 && i35 != i34 && !this.A4) {
                    I(i35, i34);
                }
                boolean z26 = this.A4;
                if (z26) {
                    i34 = this.w4;
                }
                boolean z27 = (i34 & 1) != 0 ? true : z11 ? 1 : 0;
                boolean z28 = (i34 & 2) != 0 ? true : z11 ? 1 : 0;
                boolean z29 = (i34 & 4) != 0 ? true : z11 ? 1 : 0;
                if (z26) {
                    int i36 = this.x4;
                    boolean z30 = (i36 & 1) != 0 ? true : z11 ? 1 : 0;
                    boolean z31 = (i36 & 2) != 0 ? true : z11 ? 1 : 0;
                    i8 = 4;
                    if ((i36 & 4) != 0) {
                        z13 = z29;
                        z14 = true;
                    } else {
                        z13 = z29;
                        z14 = z11 ? 1 : 0;
                    }
                    if (z27 || z30 || !z14 || z31 || !z28 || !z13) {
                        K(canvas, z30, z31, z14, false, f16 - this.z4);
                        K(canvas, z27, z28, z13, false, this.z4);
                    } else {
                        K(canvas, z27, z28, z13, true, this.z4);
                    }
                    of3Var3 = this;
                    canvas3 = canvas;
                } else {
                    i8 = 4;
                    canvas3 = canvas;
                    K(canvas3, z27, z28, z29, false, 1.0f);
                    of3Var3 = this;
                }
                of3Var3.y4 = (of3Var3.T2 ? 1 : 0) + (of3Var3.R2 ? 2 : z11 ? 1 : 0) + (of3Var3.S2 ? i8 : z11 ? 1 : 0);
            } else {
                canvas3 = canvas;
                of3Var3 = this;
                i8 = 4;
            }
            float f3322222 = 12.5f;
            if (of3Var3.l4) {
                int L8 = hl.L((z10 || xea.l1) ? 12.5f : 15.5f);
                if (((!z10 && !xea.l1) || of3Var3.Y()) && of3Var3.U()) {
                    L8 -= hl.L(9.0f);
                }
                ul ulVar = of3Var3.p4;
                if (ulVar != null) {
                    ulVar.setBounds(of3Var3.y2 - hl.L(19.0f), hl.L(-1.0f) + L8, of3Var3.y2 - hl.L(2.0f), hl.L(16.0f) + L8);
                    vnbVar3 = vnbVar4;
                    ulVar.k(Integer.valueOf(aob.v0(aob.z9, vnbVar3)));
                    ulVar.draw(canvas3);
                    boolean z32 = (!of3Var3.c1 || of3Var3.a1 || of3Var3.R0) ? true : z11 ? 1 : 0;
                    if (of3Var3.k1 != 2 || ((!z32 && of3Var3.d1 <= 0.0f) || of3Var3.k4 || !((b2 = of3Var3.q4) == 0 || b2 == b))) {
                        i7 = 17;
                    } else {
                        float f39 = of3Var3.d1;
                        if (z32) {
                            if (f39 != f16) {
                                float f40 = f39 + 0.10666667f;
                                of3Var3.d1 = f40;
                                if (f40 > f16) {
                                    of3Var3.d1 = f16;
                                } else {
                                    of3Var3.invalidate();
                                }
                            }
                        } else if (f39 != 0.0f) {
                            float f41 = f39 - 0.10666667f;
                            of3Var3.d1 = f41;
                            if (f41 < 0.0f) {
                                of3Var3.d1 = 0.0f;
                            } else {
                                of3Var3.invalidate();
                            }
                        }
                        float L9 = ((of3Var3.m4 || of3Var3.q4 == b) ? of3Var3.J2 : of3Var3.I2) - hl.L((z10 || xea.l1) ? 0.0f : f16);
                        float L10 = hl.L(xea.l1 ? 13.5f : 17.5f);
                        if (((!z10 && !xea.l1) || of3Var3.Y()) && of3Var3.U()) {
                            L10 -= hl.L(of3Var3.Y() ? 8.0f : 9.0f);
                        }
                        jf0.w(aob.b1, L9, L10);
                        jf0.w(aob.c1, L9, L10);
                        i7 = 17;
                        br3.d(aob.d1, aob.b1.getBounds().exactCenterX() + hl.L(2.0f), aob.b1.getBounds().exactCenterY(), 17);
                        if (of3Var3.d1 != f16) {
                            canvas3.save();
                            float f42 = of3Var3.d1;
                            canvas3.scale(f42, f42, aob.b1.getBounds().centerX(), aob.b1.getBounds().centerY());
                            if (of3Var3.R0) {
                                aob.d1.setAlpha((int) (of3Var3.d1 * 255.0f));
                                aob.d1.draw(canvas3);
                                aob.d1.setAlpha(jn7.d4);
                            } else if (of3Var3.c1) {
                                aob.c1.setAlpha((int) (of3Var3.d1 * 255.0f));
                                aob.c1.draw(canvas3);
                                aob.c1.setAlpha(jn7.d4);
                            } else {
                                aob.b1.setAlpha((int) (of3Var3.d1 * 255.0f));
                                aob.b1.draw(canvas3);
                                aob.b1.setAlpha(jn7.d4);
                            }
                            canvas3.restore();
                        } else if (of3Var3.R0) {
                            aob.d1.draw(canvas3);
                        } else if (of3Var3.c1) {
                            aob.c1.draw(canvas3);
                        } else {
                            aob.b1.draw(canvas3);
                        }
                    }
                    if (of3Var3.k4) {
                        float L11 = hl.L((z10 || xea.l1) ? 13.5f : 16.5f);
                        if (((!z10 && !xea.l1) || of3Var3.Y()) && of3Var3.U()) {
                            L11 -= hl.L(9.0f);
                        }
                        jf0.w(aob.e1, of3Var3.I2 - hl.L(f16), L11);
                        jf0.w(aob.i1, of3Var3.I2 - hl.L(f16), L11);
                        aob.e1.draw(canvas3);
                        aob.i1.draw(canvas3);
                        tbVar2 = tbVar;
                    } else if (of3Var3.m4) {
                        int L12 = hl.L((z10 || xea.l1) ? 12.5f : 15.5f);
                        if (((!z10 && !xea.l1) || of3Var3.Y()) && of3Var3.U()) {
                            L12 -= hl.L(9.0f);
                        }
                        ul ulVar2 = of3Var3.o4;
                        if (ulVar2 != null) {
                            tbVar2 = tbVar;
                            tbVar2.setTranslationX((f24 + of3Var3.I2) - hl.L(2.0f));
                            tbVar2.setTranslationY((f9 + L12) - hl.L(4.0f));
                            if (of3Var3.j0 > 0.0f) {
                                ulVar2.setBounds(of3Var3.I2 - hl.L(2.0f), L12 - hl.L(4.0f), hl.L(20.0f) + of3Var3.I2, hl.L(22.0f) + (L12 - hl.L(4.0f)));
                                ulVar2.draw(canvas3);
                                z12 = z11 ? 1 : 0;
                            } else {
                                z12 = true;
                            }
                            ulVar2.k(Integer.valueOf(aob.v0(aob.z9, vnbVar3)));
                        } else {
                            tbVar2 = tbVar;
                            Drawable drawable2 = bl8.d().e;
                            int L13 = of3Var3.I2 - hl.L(f16);
                            if (!z10 && !xea.l1) {
                                f3322222 = 15.5f;
                            }
                            jf0.u(L13, hl.L(f3322222), drawable2);
                            drawable2.draw(canvas3);
                            z12 = z11 ? 1 : 0;
                        }
                        z4 = z12;
                        if (!of3Var3.z3 || of3Var3.y3 != 0.0f) {
                            if (!ob6.a0) {
                                Paint paintReorderGradient = of3Var3.getPaintReorderGradient();
                                paintReorderGradient.setAlpha((int) (of3Var3.y3 * 255.0f));
                                canvas3.save();
                                canvas3.translate(of3Var3.E3 - hl.L(f15), of3Var3.D3);
                                float f43 = f15;
                                canvas.drawRect(0.0f, 0.0f, uh9.f(f43, of3Var3.E3, of3Var3.getMeasuredWidth()), hl.L(f43), paintReorderGradient);
                                canvas3 = canvas;
                                canvas3.restore();
                            }
                            aob.Y0.setAlpha((int) (of3Var3.y3 * 255.0f));
                            jf0.u(of3Var3.E3, of3Var3.D3, aob.Y0);
                            aob.Y0.draw(canvas3);
                        }
                        float f3422222 = of3Var3.T3.e;
                        if (of3Var3.u3) {
                            RectF rectF5 = rectF;
                            if (((of3Var3.H3 || of3Var3.c4) && of3Var3.M3) || of3Var3.W3 != f16 || of3Var3.d4 || of3Var3.X3 != f16 || of3Var3.e4 || f3422222 > 0.0f) {
                                boolean V = of3Var3.V();
                                canvas3 = canvas;
                                f10 = f16;
                                L(canvas3, V, of3Var3.N3, of3Var3.O3, of3Var3.R3, 1.0f, false);
                                of3Var = this;
                                if (of3Var.c4) {
                                    aob.v0.setAlpha((int) ((f10 - of3Var.y3) * 255.0f));
                                    if (of3Var.j4 != null) {
                                        rectF5.set(of3Var.f4, of3Var.N3, hl.L(12.666f) + r1 + of3Var.i4, hl.L(20.666f) + of3Var.N3);
                                        canvas3.drawRoundRect(rectF5, rectF5.height() / 2.0f, rectF5.height() / 2.0f, (!V || of3Var.l1 == 0) ? aob.v0 : aob.x0);
                                        aob.L0.setAlpha((int) ((f10 - of3Var.y3) * 255.0f));
                                        canvas3.save();
                                        canvas3.translate(hl.L(6.333f) + of3Var.f4, hl.L(4.0f) + of3Var.N3);
                                        of3Var.j4.draw(canvas3);
                                        canvas3.restore();
                                    } else {
                                        Drawable drawable3 = aob.m1;
                                        drawable3.setAlpha((int) ((f10 - of3Var.y3) * 255.0f));
                                        br3.d(drawable3, hl.L(10.333f) + of3Var.f4, hl.L(10.333f) + of3Var.N3, i7);
                                        drawable3.draw(canvas3);
                                    }
                                }
                                if (of3Var.d4 || of3Var.X3 != f10) {
                                    f17 = 10.333f;
                                    rectF5.set(of3Var.g4, of3Var.N3, hl.L(20.666f) + r1, hl.L(20.666f) + of3Var.N3);
                                    float f44 = of3Var.X3;
                                    if (f44 == f10) {
                                        f44 = f10;
                                    } else if (!of3Var.d4) {
                                        f44 = f10 - f44;
                                    }
                                    Drawable drawable4 = V ? aob.q1 : aob.n1;
                                    drawable4.setAlpha((int) ((f10 - of3Var.y3) * 255.0f));
                                    br3.d(drawable4, hl.L(10.333f) + r1, hl.L(10.333f) + of3Var.N3, i7);
                                    br3.b(canvas3, drawable4, f44);
                                } else {
                                    f17 = 10.333f;
                                }
                                if ((of3Var.e4 || f3422222 > 0.0f) && f3422222 != 0.0f) {
                                    rectF5.set(of3Var.h4, of3Var.N3, hl.L(20.666f) + r1, hl.L(20.666f) + of3Var.N3);
                                    Drawable drawable5 = V ? aob.r1 : aob.o1;
                                    drawable5.setAlpha((int) ((f10 - of3Var.y3) * 255.0f));
                                    br3.d(drawable5, hl.L(f17) + r1, hl.L(f17) + of3Var.N3, i7);
                                    br3.b(canvas3, drawable5, f3422222);
                                }
                                if (of3Var.I3) {
                                    if (of3Var.K3 == null) {
                                        of3Var.K3 = (LayerDrawable) of3Var.getContext().getDrawable(R.drawable.dialog_gram_transfer).mutate();
                                    }
                                    int v012 = aob.v0(of3Var.V() ? aob.V8 : aob.U8, vnbVar3);
                                    if (of3Var.L3 != v012) {
                                        Drawable drawable6 = of3Var.K3.getDrawable(z11 ? 1 : 0);
                                        of3Var.L3 = v012;
                                        drawable6.setColorFilter(new PorterDuffColorFilter(v012, PorterDuff.Mode.SRC_IN));
                                    }
                                    int L14 = ((hl.L(20.666f) - hl.L(28.0f)) / 2) + of3Var.N3;
                                    LayerDrawable layerDrawable = of3Var.K3;
                                    int i37 = of3Var.J3;
                                    layerDrawable.setBounds(i37, L14, hl.L(28.0f) + i37, hl.L(28.0f) + L14);
                                    of3Var.K3.setAlpha((int) ((f10 - of3Var.y3) * 255.0f));
                                    of3Var.K3.draw(canvas3);
                                }
                                if (of3Var.S1 > 0) {
                                    float f45 = lf3Var3.l;
                                    if (f45 != f10) {
                                        if (f45 > 0.0f) {
                                            canvas.saveLayerAlpha(0.0f, 0.0f, of3Var.getWidth(), of3Var.getHeight(), (int) ((f10 - f45) * 255.0f), 31);
                                            canvas3 = canvas;
                                            if (lf3Var3.m) {
                                                L = -hl.L(14.0f);
                                                f18 = lf3Var3.l;
                                            } else {
                                                L = hl.L(14.0f);
                                                f18 = lf3Var3.l;
                                            }
                                            canvas3.translate(0.0f, L * f18);
                                        }
                                        for (int i38 = z11 ? 1 : 0; i38 < of3Var.S1; i38++) {
                                            if (of3Var.V1[i38]) {
                                                if (of3Var.U1 == null) {
                                                    Paint paint3 = new Paint(1);
                                                    of3Var.U1 = paint3;
                                                    paint3.setShadowLayer(hl.L(1.34f), 0.0f, hl.L(0.34f), 402653184);
                                                    of3Var.U1.setColor(z11 ? 1 : 0);
                                                }
                                                RectF rectF6 = hl.P;
                                                ImageReceiver[] imageReceiverArr = of3Var.W1;
                                                ImageReceiver imageReceiver2 = imageReceiverArr[i38];
                                                rectF6.set(imageReceiver2.L0, imageReceiver2.M0, imageReceiver2.w(), imageReceiverArr[i38].x());
                                                imageReceiverArr[i38].g(canvas3);
                                                if (of3Var.Y1[i38]) {
                                                    Path path = of3Var.w0;
                                                    if (path == null) {
                                                        of3Var.w0 = new Path();
                                                    } else {
                                                        path.rewind();
                                                    }
                                                    Path path2 = of3Var.w0;
                                                    int[] iArr = imageReceiverArr[i38].X0;
                                                    path2.addRoundRect(rectF6, iArr[z11 ? 1 : 0], iArr[1], Path.Direction.CW);
                                                    canvas3.save();
                                                    canvas3.clipPath(of3Var.w0);
                                                    npa npaVar3 = of3Var.x0;
                                                    if (npaVar3 == null) {
                                                        npaVar3 = new npa();
                                                        of3Var.x0 = npaVar3;
                                                    }
                                                    npaVar3.h(vm2.o(-1, 82));
                                                    npa npaVar4 = of3Var.x0;
                                                    ImageReceiver imageReceiver3 = imageReceiverArr[i38];
                                                    npaVar4.setBounds((int) imageReceiver3.L0, (int) imageReceiver3.M0, (int) imageReceiver3.w(), (int) imageReceiverArr[i38].x());
                                                    of3Var.x0.draw(canvas3);
                                                    of3Var.invalidate();
                                                    canvas3.restore();
                                                }
                                                if (of3Var.X1[i38]) {
                                                    jf0.u((int) (imageReceiverArr[i38].r() - (aob.T0.getIntrinsicWidth() / 2)), (int) (imageReceiverArr[i38].s() - (aob.T0.getIntrinsicHeight() / 2)), aob.T0);
                                                    aob.T0.draw(canvas3);
                                                }
                                            }
                                        }
                                        if (lf3Var3.l > 0.0f) {
                                            canvas3.restore();
                                        }
                                    }
                                }
                                lycVar = of3Var.u0;
                                if (lycVar != null && !lycVar.D()) {
                                    canvas3.save();
                                    canvas3.translate(of3Var.Z2, (of3Var.getMeasuredHeight() - hl.L(21.66f)) - (of3Var.t2 ? 1 : 0));
                                    of3Var.u0.h(canvas3, of3Var.a3 - of3Var.Z2);
                                    canvas3.restore();
                                }
                                i15 = i13;
                                r12 = z11;
                                if (i15 != -1) {
                                    canvas3.restoreToCount(i15);
                                    r12 = z11;
                                }
                            } else {
                                if (of3Var3.F1) {
                                    canvas3.save();
                                    float a = of3Var3.G1.a(0.05f);
                                    RectF rectF7 = of3Var3.I1;
                                    canvas3.scale(a, a, rectF7.centerX(), rectF7.centerY());
                                    of3Var3.H1.setColor(aob.v0(aob.Fi, vnbVar3));
                                    canvas3.drawRoundRect(rectF7, rectF7.height() / 2.0f, rectF7.height() / 2.0f, of3Var3.H1);
                                    pkb pkbVar = of3Var3.J1;
                                    if (pkbVar != null) {
                                        pkbVar.c(rectF7.left + hl.L(13.0f), rectF7.centerY(), 1.0f, aob.v0(aob.Ji, vnbVar3), canvas);
                                    }
                                    canvas.restore();
                                }
                                canvas3 = canvas;
                            }
                        } else {
                            aob.X0.setAlpha((int) ((f16 - of3Var3.y3) * 255.0f));
                            RectF rectF8 = rectF;
                            rectF8.set(of3Var3.w3, of3Var3.v3, hl.L(20.666f) + r0, hl.L(20.666f) + of3Var3.v3);
                            float f46 = hl.p * 10.5f;
                            canvas3.drawRoundRect(rectF8, f46, f46, aob.w0);
                            jf0.u(hl.L(4.5f) + of3Var3.w3, hl.L(5.0f) + of3Var3.v3, aob.X0);
                            aob.X0.draw(canvas3);
                        }
                        of3Var = of3Var3;
                        f10 = f16;
                        if (of3Var.I3) {
                        }
                        if (of3Var.S1 > 0) {
                        }
                        lycVar = of3Var.u0;
                        if (lycVar != null) {
                            canvas3.save();
                            canvas3.translate(of3Var.Z2, (of3Var.getMeasuredHeight() - hl.L(21.66f)) - (of3Var.t2 ? 1 : 0));
                            of3Var.u0.h(canvas3, of3Var.a3 - of3Var.Z2);
                            canvas3.restore();
                        }
                        i15 = i13;
                        r12 = z11;
                        if (i15 != -1) {
                        }
                    } else {
                        tbVar2 = tbVar;
                        if (of3Var3.q4 != 0) {
                            int L15 = hl.L((z10 || xea.l1) ? 12.0f : 15.0f);
                            if (((!z10 && !xea.l1) || of3Var3.Y()) && of3Var3.U()) {
                                L15 -= hl.L(9.0f);
                            }
                            byte b4 = of3Var3.q4;
                            yt9 yt9Var = b4 != 1 ? b4 != b ? aob.g1 : aob.h1 : aob.f1;
                            jf0.u(of3Var3.I2, L15, yt9Var);
                            yt9Var.draw(canvas3);
                        }
                    }
                    z4 = z11 ? 1 : 0;
                    if (!of3Var3.z3) {
                    }
                    if (!ob6.a0) {
                    }
                    aob.Y0.setAlpha((int) (of3Var3.y3 * 255.0f));
                    jf0.u(of3Var3.E3, of3Var3.D3, aob.Y0);
                    aob.Y0.draw(canvas3);
                    float f34222222 = of3Var3.T3.e;
                    if (of3Var3.u3) {
                    }
                    of3Var = of3Var3;
                    f10 = f16;
                    if (of3Var.I3) {
                    }
                    if (of3Var.S1 > 0) {
                    }
                    lycVar = of3Var.u0;
                    if (lycVar != null) {
                    }
                    i15 = i13;
                    r12 = z11;
                    if (i15 != -1) {
                    }
                }
            }
            vnbVar3 = vnbVar4;
            if (of3Var3.c1) {
            }
            if (of3Var3.k1 != 2) {
            }
            i7 = 17;
            if (of3Var3.k4) {
            }
            z4 = z11 ? 1 : 0;
            if (!of3Var3.z3) {
            }
            if (!ob6.a0) {
            }
            aob.Y0.setAlpha((int) (of3Var3.y3 * 255.0f));
            jf0.u(of3Var3.E3, of3Var3.D3, aob.Y0);
            aob.Y0.draw(canvas3);
            float f342222222 = of3Var3.T3.e;
            if (of3Var3.u3) {
            }
            of3Var = of3Var3;
            f10 = f16;
            if (of3Var.I3) {
            }
            if (of3Var.S1 > 0) {
            }
            lycVar = of3Var.u0;
            if (lycVar != null) {
            }
            i15 = i13;
            r12 = z11;
            if (i15 != -1) {
            }
        } else {
            of3Var = this;
            i7 = 17;
            vnbVar3 = vnbVar2;
            if3Var4 = if3Var3;
            tbVar2 = tbVar;
            r12 = 0;
            f10 = 1.0f;
            i8 = 4;
            z4 = false;
            i9 = 0;
        }
        z5 = of3Var.c2;
        imageReceiver = of3Var.Z1;
        if (z5) {
            canvas3.save();
            float interpolation2 = if3Var4.getInterpolation(of3Var.d2 / 170.0f) + f10;
            canvas3.scale(interpolation2, interpolation2, imageReceiver.r(), imageReceiver.s());
        }
        z6 = of3Var.y;
        gf3Var = of3Var.v0;
        if (z6 && (!of3Var.Q || (tL_forumTopic2 = of3Var.O) == null || tL_forumTopic2.id != 1 || (ey8Var = of3Var.f2) == null || !ey8Var.X || ey8Var.Y)) {
            if (!of3Var.E) {
                e88 e88Var = of3Var.a2;
                if (e88Var == null) {
                    e88Var = new e88();
                    of3Var.a2 = e88Var;
                }
                e88Var.a((int) gf3Var.F.centerX(), (int) gf3Var.F.centerY(), (int) (gf3Var.F.width() / 2.0f));
                canvas3.save();
                canvas3.clipPath(of3Var.a2);
                imageReceiver.k0(gf3Var.F);
                imageReceiver.g(canvas3);
                canvas3.restore();
            } else if (of3Var.F) {
                br3.f(imageReceiver, hl.N(f10) + gf3Var.F.centerX(), gf3Var.F.centerY(), hl.L(48.0f), hl.L(48.0f));
                br3.a(canvas3, aob.R0, imageReceiver.r(), imageReceiver.s(), hl.L(48.0f));
                imageReceiver.g(canvas3);
            } else {
                boolean z33 = of3Var.G;
                gf3Var.r = (z33 || of3Var.K0 != 0) ? true : r12;
                int i39 = gf3Var.z;
                if (z33) {
                    gf3Var.z = 1;
                }
                t6b.h(of3Var.I0, canvas3, imageReceiver, gf3Var);
                if (gf3Var.w) {
                    of3Var.G();
                }
                gf3Var.z = i39;
            }
            if (!of3Var.P0 && ((((chat = of3Var.h2) != null && chat.linked_community_id != 0) || ((user = of3Var.g2) != null && user.linked_community_id != 0)) && !of3Var.F && of3Var.O0 && !of3Var.W())) {
                float centerX2 = gf3Var.F.centerX() + hl.L(20.33f);
                float centerY2 = gf3Var.F.centerY() + hl.L(19.0f);
                tk0Var = of3Var.E0;
                if (tk0Var == null) {
                    tk0Var = new tk0();
                    of3Var.E0 = tk0Var;
                }
                br3.d(tk0Var, centerX2, centerY2, i7);
                canvas3.drawCircle(of3Var.E0.getBounds().exactCenterX(), of3Var.E0.getBounds().exactCenterY(), hl.L(8.0f), aob.l0(aob.v0(aob.d6, vnbVar3)));
                of3Var.E0.draw(canvas3);
            }
        }
        if (of3Var.c2) {
            canvas3.restore();
        }
        if (imageReceiver.R0 && J(canvas)) {
            i9 = 1;
        }
        if (of3Var.j0 > 0.0f || of3Var.K0 != 0) {
            of3Var2 = of3Var;
        } else {
            boolean V2 = of3Var.V();
            RectF rectF9 = gf3Var.F;
            int width = (int) (((rectF9.width() + rectF9.left) - of3Var.P3) - hl.L(5.0f));
            RectF rectF10 = gf3Var.F;
            L(canvas3, V2, (int) ((gf3Var.F.height() + imageReceiver.M0) - hl.L(22.0f)), width, (int) (((rectF10.width() + rectF10.left) - of3Var.Q3) - hl.L(5.0f)), of3Var.j0, true);
            of3Var2 = this;
        }
        if (of3Var2.D0 != 0.0f) {
            canvas3.restore();
        }
        if (of3Var2.x1 != 0.0f) {
            canvas3.restore();
        }
        if (z2 && ((of3Var2.K0 != 0 || (of3Var2.Q && (tL_forumTopic = of3Var2.O) != null && tL_forumTopic.id == 1)) && of3Var2.x1 == 0.0f && of3Var2.f2 != null)) {
            canvas3.save();
            canvas3.translate(0.0f, (-of3Var2.F3) - (of3Var2.n * of3Var2.j0));
            canvas3.clipRect(0.0f, (f10 - of3Var2.f2.J) * of3Var2.getMeasuredHeight(), of3Var2.getMeasuredWidth(), of3Var2.getMeasuredHeight());
            of3Var2.f2.c(canvas3, r12);
            canvas3.restore();
        }
        if (of3Var2.t2) {
            int L16 = (of3Var2.u2 || (of3Var2.K0 != 0 && of3Var2.n1)) ? r12 : hl.L(of3Var2.J);
            if (of3Var2.j0 != f10) {
                int alpha4 = aob.j0.getAlpha();
                float f47 = of3Var2.j0;
                if (f47 != 0.0f) {
                    aob.j0.setAlpha((int) ((f10 - f47) * alpha4));
                }
                i10 = 1;
                float measuredHeight = (of3Var2.getMeasuredHeight() - 1) - (of3Var2.n * of3Var2.j0);
                if (ob6.a0) {
                    canvas.drawLine(0.0f, measuredHeight, of3Var2.getMeasuredWidth() - L16, measuredHeight, aob.j0);
                } else {
                    canvas.drawLine(L16, measuredHeight, of3Var2.getMeasuredWidth(), measuredHeight, aob.j0);
                }
                f11 = 0.0f;
                if (of3Var2.j0 != 0.0f) {
                    aob.j0.setAlpha(alpha4);
                }
                if (of3Var2.u1 != f11) {
                    if (Build.VERSION.SDK_INT != 24) {
                        canvas.restore();
                    } else {
                        aob.u0.setColor(aob.v0(aob.d6, vnbVar3));
                        canvas.drawRect(0.0f, 0.0f, of3Var2.getMeasuredWidth(), of3Var2.v1 * of3Var2.u1, aob.u0);
                        canvas.drawRect(0.0f, of3Var2.getMeasuredHeight() - ((int) (of3Var2.w1 * of3Var2.u1)), of3Var2.getMeasuredWidth(), of3Var2.getMeasuredHeight(), aob.u0);
                        canvas2 = canvas;
                        if (z17) {
                            float f48 = f10 - f20;
                            int measuredHeight2 = (int) (of3Var2.getMeasuredHeight() * f48);
                            int u0 = aob.u0(aob.d6);
                            GradientDrawable gradientDrawable = of3Var2.P4;
                            if (gradientDrawable == null) {
                                gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, null);
                                of3Var2.P4 = gradientDrawable;
                            }
                            if (of3Var2.Q4 != u0) {
                                of3Var2.Q4 = u0;
                                gradientDrawable.setColors(new int[]{u0, 16777215 & u0});
                            }
                            float a2 = ete.a((f48 - 0.05f) * 10.0f, 0.0f, f10);
                            of3Var2.P4.setBounds(r12, measuredHeight2, of3Var2.getMeasuredWidth(), hl.L(6.0f) + measuredHeight2);
                            of3Var2.P4.setAlpha((int) (a2 * 255.0f));
                            of3Var2.P4.draw(canvas2);
                            canvas2.restore();
                        }
                        z7 = of3Var2.z3;
                        if (!z7 || of3Var2.y3 != 0.0f) {
                            float f3522222 = of3Var2.y3;
                            if (z7) {
                                f12 = 0.0f;
                                if (f3522222 > 0.0f) {
                                    float f49 = f3522222 - 0.09411765f;
                                    of3Var2.y3 = f49;
                                    if (f49 < 0.0f) {
                                        of3Var2.y3 = 0.0f;
                                    }
                                    i9 = i10;
                                }
                                z8 = of3Var2.n1;
                                float f50 = of3Var2.E1;
                                if (!z8) {
                                    if (f50 > f12) {
                                        float f51 = f50 - 0.069565214f;
                                        of3Var2.E1 = f51;
                                        if (f51 < f12) {
                                            of3Var2.E1 = f12;
                                            f51 = 0.0f;
                                        }
                                        rb0 rb0Var = of3Var2.b2;
                                        if (rb0Var.n == 2) {
                                            rb0Var.o = k43.h.getInterpolation(f51);
                                        }
                                        i9 = i10;
                                    }
                                    if (of3Var2.c2) {
                                        float f52 = of3Var2.d2 + 16.0f;
                                        of3Var2.d2 = f52;
                                        if (f52 >= 170.0f) {
                                            of3Var2.d2 = 170.0f;
                                            of3Var2.c2 = r12;
                                        }
                                        i9 = i10;
                                    }
                                    z9 = of3Var2.B1;
                                    float f53 = of3Var2.D1;
                                    if (z9) {
                                        if (f53 == 1.0f) {
                                            of3Var2.D1 = 0.0f;
                                            i9 = i10;
                                        }
                                        float f54 = of3Var2.C1;
                                        if (f54 > 0.0f) {
                                            float f55 = f54 - 0.053333335f;
                                            of3Var2.C1 = f55;
                                            if (f55 < 0.0f) {
                                                of3Var2.C1 = 0.0f;
                                            }
                                        }
                                        i10 = i9;
                                    } else {
                                        if (f53 < 1.0f) {
                                            float f56 = f53 + 0.09411765f;
                                            of3Var2.D1 = f56;
                                            if (f56 > 1.0f) {
                                                of3Var2.D1 = 1.0f;
                                                i9 = i10;
                                            }
                                        }
                                        float f57 = of3Var2.C1;
                                        if (f57 < 1.0f) {
                                            float f58 = f57 + 0.053333335f;
                                            of3Var2.C1 = f58;
                                            if (f58 > 1.0f) {
                                                of3Var2.C1 = 1.0f;
                                            }
                                        }
                                        i10 = i9;
                                    }
                                    tbVar2.setVisibility(!z4 ? r12 : i8);
                                    if (i10 == 0) {
                                        of3Var2.invalidate();
                                        return;
                                    }
                                    return;
                                }
                                if (f50 < 1.0f) {
                                    float f59 = f50 + 0.069565214f;
                                    of3Var2.E1 = f59;
                                    if (f59 > 1.0f) {
                                        of3Var2.E1 = 1.0f;
                                        f59 = 1.0f;
                                    }
                                    rb0 rb0Var2 = of3Var2.b2;
                                    if (rb0Var2.n == 2) {
                                        rb0Var2.o = k43.h.getInterpolation(f59);
                                    }
                                    i9 = i10;
                                }
                                if (of3Var2.c2) {
                                }
                                z9 = of3Var2.B1;
                                float f532 = of3Var2.D1;
                                if (z9) {
                                }
                                tbVar2.setVisibility(!z4 ? r12 : i8);
                                if (i10 == 0) {
                                }
                            } else if (f3522222 < 1.0f) {
                                float f60 = f3522222 + 0.09411765f;
                                of3Var2.y3 = f60;
                                if (f60 > 1.0f) {
                                    of3Var2.y3 = 1.0f;
                                }
                                i9 = i10;
                            }
                        }
                        f12 = 0.0f;
                        z8 = of3Var2.n1;
                        float f502 = of3Var2.E1;
                        if (!z8) {
                        }
                    }
                }
                canvas2 = canvas;
                if (z17) {
                }
                z7 = of3Var2.z3;
                if (!z7) {
                }
                float f35222222 = of3Var2.y3;
                if (z7) {
                }
            }
        }
        f11 = 0.0f;
        i10 = 1;
        if (of3Var2.u1 != f11) {
        }
        canvas2 = canvas;
        if (z17) {
        }
        z7 = of3Var2.z3;
        if (!z7) {
        }
        float f352222222 = of3Var2.y3;
        if (z7) {
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        ey8 ey8Var;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (X() && (ey8Var = this.f2) != null && xea.m1 && ey8Var.J == 0.0f) {
            accessibilityNodeInfo.setVisibleToUser(false);
        } else {
            accessibilityNodeInfo.addAction(16);
            accessibilityNodeInfo.addAction(32);
            if (!X() && this.E4 != null) {
                accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_chat_preview, ob6.M0(2131754936, null)));
            }
        }
        za zaVar = this.r2;
        if (zaVar == null || !zaVar.a.q) {
            return;
        }
        accessibilityNodeInfo.setClassName("android.widget.CheckBox");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(true);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.j0 != 0.0f || this.Q || this.G || !this.v0.a(this, motionEvent)) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int L;
        int i5;
        if (this.I0 == 0 && this.H0 == null) {
            return;
        }
        tb tbVar = this.n4;
        if (tbVar != null) {
            tbVar.layout(0, 0, hl.L(22.0f), hl.L(22.0f));
        }
        if (this.r2 != null) {
            byte b = this.J;
            boolean z2 = this.s2;
            int L2 = hl.L(b - ((z2 || xea.l1) ? (byte) 29 : (byte) 27));
            if (this.l0) {
                i5 = hl.L(8.0f);
                L = (getMeasuredHeight() - this.r2.getMeasuredHeight()) >> 1;
            } else {
                if (ob6.a0) {
                    L2 = (i3 - i) - L2;
                }
                int i6 = L2;
                L = hl.L(this.V + ((z2 || xea.l1) ? 6 : 0));
                i5 = i6;
            }
            za zaVar = this.r2;
            zaVar.layout(i5, L, zaVar.getMeasuredWidth() + i5, this.r2.getMeasuredHeight() + L);
        }
        int measuredWidth = (getMeasuredWidth() + getMeasuredHeight()) << 16;
        if (measuredWidth != this.L4 || this.B0) {
            this.B0 = false;
            this.L4 = measuredWidth;
            try {
                C();
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        tb tbVar = this.n4;
        if (tbVar != null) {
            tbVar.measure(View.MeasureSpec.makeMeasureSpec(hl.L(22.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(22.0f), TLObject.FLAG_30));
        }
        za zaVar = this.r2;
        if (zaVar != null) {
            zaVar.measure(View.MeasureSpec.makeMeasureSpec(hl.L(24.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(24.0f), TLObject.FLAG_30));
        }
        if (this.Q) {
            int size = View.MeasureSpec.getSize(i);
            boolean z = this.s2;
            setMeasuredDimension(size, hl.L(((z || xea.l1) ? this.L : this.K) + ((!U() || ((z || xea.l1) && !Y())) ? (byte) 0 : Y() ? this.N : this.M)) + (this.t2 ? 1 : 0));
            this.R = false;
            if (this.Q && !U()) {
                C();
                if (this.S) {
                    this.R = true;
                    C();
                }
            }
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), H());
        this.v1 = 0;
        this.w1 = getMeasuredHeight();
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        r47 captionMessage;
        TLRPC.User X1;
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        StringBuilder sb = new StringBuilder();
        String str = this.M0;
        if (str != null) {
            sb.append(str);
            sb.append(". ");
        } else if (this.K0 == 1) {
            sb.append(ob6.M0(2131754129, null));
            sb.append(". ");
        } else {
            if (this.i2 != null) {
                sb.append(ob6.M0(2131754772, null));
                sb.append(". ");
            }
            if (!this.Q || this.O == null) {
                TLRPC.User user = this.g2;
                if (user != null) {
                    if (lbc.B(user)) {
                        sb.append(ob6.M0(2131745993, null));
                    } else if (lbc.u(this.g2)) {
                        sb.append(ob6.M0(2131754245, null));
                    } else {
                        if (this.g2.bot) {
                            sb.append(ob6.M0(2131753149, null));
                            sb.append(". ");
                        }
                        TLRPC.User user2 = this.g2;
                        if (user2.self) {
                            sb.append(ob6.M0(2131745629, null));
                        } else {
                            sb.append(lv2.m(0, user2.first_name, user2.last_name));
                        }
                    }
                    sb.append(". ");
                } else {
                    TLRPC.Chat chat = this.h2;
                    if (chat != null) {
                        if (chat.broadcast) {
                            sb.append(ob6.M0(2131754900, null));
                        } else {
                            sb.append(ob6.M0(2131754872, null));
                        }
                        sb.append(". ");
                        sb.append(this.h2.title);
                        sb.append(". ");
                    }
                }
            } else {
                sb.append(ob6.M0(2131754741, null));
                sb.append(". ");
                sb.append(this.O.title);
                sb.append(". ");
            }
        }
        if (this.k4) {
            sb.append(ob6.M0(2131754734, null));
            sb.append(". ");
        }
        if (this.a1) {
            sb.append(ob6.M0(2131754824, null));
            sb.append(". ");
        }
        if (Z()) {
            sb.append(ob6.M0(2131754736, null));
            sb.append(". ");
        }
        int i = this.T0;
        if (i > 0) {
            sb.append(ob6.G(i, "NewMessages", new Object[0]));
            sb.append(". ");
        }
        int i2 = this.V0;
        if (i2 > 0) {
            sb.append(ob6.G(i2, "AccDescrMentionCount", new Object[0]));
            sb.append(". ");
        }
        if (this.W0 > 0) {
            sb.append(ob6.M0(2131754836, null));
            sb.append(". ");
        }
        r47 r47Var = this.g1;
        if (r47Var == null || this.K0 != 0) {
            accessibilityEvent.setContentDescription(sb);
            setContentDescription(sb);
            return;
        }
        int i3 = this.S0;
        if (i3 == 0) {
            i3 = r47Var.k.date;
        }
        String s = ob6.s(i3, true);
        if (this.g1.N3()) {
            sb.append(ob6.a0("AccDescrSentDate", null, 2131754760, s));
        } else {
            sb.append(ob6.a0("AccDescrReceivedDate", null, 2131754784, s));
        }
        sb.append(". ");
        if (this.h2 != null && !this.g1.N3() && this.g1.p3() && this.g1.k.action == null && (X1 = uc7.s1(this.G0).X1(Long.valueOf(this.g1.k.from_id.user_id))) != null) {
            sb.append(lv2.m(0, X1.first_name, X1.last_name));
            sb.append(". ");
        }
        if (this.i2 == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.g1.v);
            if (!this.g1.F3() && (captionMessage = getCaptionMessage()) != null && !TextUtils.isEmpty(captionMessage.z)) {
                if (sb2.length() > 0) {
                    sb2.append(". ");
                }
                sb2.append(captionMessage.z);
            }
            StaticLayout staticLayout = this.f3;
            int length = staticLayout == null ? -1 : staticLayout.getText().length();
            if (length > 0) {
                int length2 = sb2.length();
                int indexOf = sb2.indexOf("\n", length);
                if (indexOf < length2 && indexOf >= 0) {
                    length2 = indexOf;
                }
                int indexOf2 = sb2.indexOf("\t", length);
                if (indexOf2 < length2 && indexOf2 >= 0) {
                    length2 = indexOf2;
                }
                int indexOf3 = sb2.indexOf(" ", length);
                if (indexOf3 < length2 && indexOf3 >= 0) {
                    length2 = indexOf3;
                }
                sb.append(sb2.substring(0, length2));
            } else {
                sb.append((CharSequence) sb2);
            }
        }
        accessibilityEvent.setContentDescription(sb);
        setContentDescription(sb);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x006d, code lost:
    
        if (r0 == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0084, code lost:
    
        if (r2 == 8) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x008a, code lost:
    
        if (r0.b(r7) != false) goto L51;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.j0 != 0.0f || this.Q || this.G || !this.v0.a(this, motionEvent)) {
            kf3 kf3Var = this.e0;
            if (kf3Var == null || kf3Var.m()) {
                if (this.F1) {
                    boolean contains = this.I1.contains(motionEvent.getX(), motionEvent.getY());
                    int action = motionEvent.getAction();
                    v41 v41Var = this.G1;
                    if (action == 0 || motionEvent.getAction() == 2) {
                        v41Var.c(contains);
                    } else {
                        if (v41Var.i && motionEvent.getAction() == 1) {
                            zj3 zj3Var = this.L1;
                            if (zj3Var != null) {
                                zj3Var.a(this.g2);
                            }
                            v41Var.c(false);
                            return true;
                        }
                        if (v41Var.i && motionEvent.getAction() == 3) {
                            v41Var.c(false);
                            return true;
                        }
                    }
                }
                if (this.g0) {
                    za1 za1Var = this.d0;
                    if (za1Var != null) {
                        if (this.i3 != null) {
                            int i = this.k1;
                            if (i != 0) {
                                if (i != 7) {
                                }
                            }
                        }
                    }
                }
            }
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        uj3 uj3Var;
        if (i != R.id.acc_action_chat_preview || (uj3Var = this.E4) == null) {
            return super.performAccessibilityAction(i, bundle);
        }
        uj3Var.c5(this);
        return true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (getParent() != null && getParent().isLayoutRequested()) {
            getParent().requestLayout();
        }
        super.requestLayout();
    }

    public void setArchivedPullAnimation(ey8 ey8Var) {
        this.f2 = ey8Var;
    }

    public void setBottomClip(int i) {
        this.w1 = i;
    }

    public void setClipProgress(float f) {
        this.u1 = f;
        invalidate();
    }

    public void setCurrentDialogId(long j) {
        this.I0 = j;
    }

    public void setCustomMessage(String str) {
        if (TextUtils.equals(this.J0, str)) {
            return;
        }
        this.J0 = str;
        C();
        requestLayout();
    }

    public void setCustomMessageWithoutRebuild(String str) {
        this.J0 = str;
    }

    public void setDialog(jf3 jf3Var) {
        this.H0 = jf3Var;
        this.m1 = 0;
        j0(0, true);
        F();
        E();
        D();
        G();
    }

    public void setDialogCellDelegate(kf3 kf3Var) {
        this.e0 = kf3Var;
    }

    public void setDialogSelected(boolean z) {
        if (this.r4 != z) {
            invalidate();
        }
        this.r4 = z;
    }

    public void setIsTransitionSupport(boolean z) {
        this.k0 = z;
    }

    public void setMoving(boolean z) {
        this.r = z;
    }

    public void setOpenBotButton(boolean z) {
        if (this.F1 == z) {
            return;
        }
        if (this.J1 == null) {
            this.J1 = new pkb(ob6.M0(2131753004, null), 14.0f, hl.o());
        }
        this.F1 = z;
        this.G1.c(false);
    }

    public void setPinForced(boolean z) {
        this.C3 = z;
        if (getMeasuredWidth() > 0 && getMeasuredHeight() > 0) {
            C();
        }
        invalidate();
    }

    public void setPreloader(dk3 dk3Var) {
        this.t4 = dk3Var;
    }

    public void setRightFragmentOpenedProgress(float f) {
        if (this.j0 != f) {
            this.j0 = f;
            invalidate();
        }
    }

    public void setSliding(boolean z) {
        this.y1 = z;
    }

    public void setTitleOverride(String str) {
        this.M0 = str;
    }

    public void setTopClip(int i) {
        this.v1 = i;
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        if (f == this.x1) {
            return;
        }
        this.x1 = f;
        b29 b29Var = this.z1;
        if (b29Var != null && f == 0.0f) {
            b29Var.O(true, 0.0f);
            this.A1 = false;
            this.n1 = xea.m1;
            this.C1 = 0.0f;
            this.y1 = false;
        }
        float f2 = this.x1;
        if (f2 != 0.0f) {
            this.y1 = true;
        } else {
            this.D1 = 0.0f;
            this.C1 = 0.0f;
            this.B1 = false;
        }
        if (this.y1 && !this.x) {
            boolean z = this.B1;
            boolean z2 = Math.abs(f2) >= ((float) getMeasuredWidth()) * 0.45f;
            this.B1 = z2;
            if (z != z2 && this.n1 == xea.m1) {
                try {
                    performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
            }
        }
        invalidate();
    }

    public void setVisible(boolean z) {
        if (this.A0 != z) {
            this.A0 = z;
            if (z) {
                invalidate();
            }
        }
    }

    @Override // snb
    public void updateColors() {
        try {
            if (isAttachedToWindow()) {
                if (this.I0 == 0 && this.H0 == null) {
                    return;
                }
                j0(0, true);
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // android.view.View
    public final void invalidate(int i, int i2, int i3, int i4) {
        if (lcb.x1) {
            return;
        }
        super.invalidate(i, i2, i3, i4);
    }

    public of3(Context context, boolean z) {
        this(null, context, z, yac.t0, null);
    }
}
