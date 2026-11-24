// default package

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.RoundRectShape;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.StateSet;
import android.view.View;
import j$.util.Objects;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.time.SunDate;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ThemeEditorView;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public abstract class bkb {
    public static int A;
    public static TextPaint[] A0;
    public static boolean A1;
    public static TextPaint A2;
    public static Drawable A3;
    public static Drawable A4;
    public static final int A5;
    public static final int A6;
    public static final int A7;
    public static final int A8;
    public static final int A9;
    public static final int Aa;
    public static final int Ab;
    public static final int Ac;
    public static final int Ad;
    public static final int Ae;
    public static final int Af;
    public static final int Ag;
    public static final int Ah;
    public static final int Ai;
    public static final int Aj;
    public static final int Ak;
    public static final int Al;
    public static Bitmap Am;
    public static int B;
    public static TextPaint[] B0;
    public static boolean B1;
    public static TextPaint B2;
    public static Drawable B3;
    public static Drawable B4;
    public static final int B5;
    public static final int B6;
    public static final int B7;
    public static final int B8;
    public static final int B9;
    public static final int Ba;
    public static final int Bb;
    public static final int Bc;
    public static final int Bd;
    public static final int Be;
    public static final int Bf;
    public static final int Bg;
    public static final int Bh;
    public static final int Bi;
    public static final int Bj;
    public static final int Bk;
    public static final int Bl;
    public static int[] Bm;
    public static TextPaint C0;
    public static int C1;
    public static TextPaint C2;
    public static Drawable C3;
    public static Drawable C4;
    public static final int C5;
    public static final int C6;
    public static final int C7;
    public static final int C8;
    public static final int C9;
    public static final int Ca;
    public static final int Cb;
    public static final int Cc;
    public static final int Cd;
    public static final int Ce;
    public static final int Cf;
    public static final int Cg;
    public static final int Ch;
    public static final int Ci;
    public static final int Cj;
    public static final int Ck;
    public static final int Cl;
    public static final HashSet Cm;
    public static TextPaint D0;
    public static int D1;
    public static TextPaint D2;
    public static xf7 D3;
    public static Drawable D4;
    public static final int D5;
    public static final int D6;
    public static final int D7;
    public static final int D8;
    public static final int D9;
    public static final int Da;
    public static final int Db;
    public static final int Dc;
    public static final int Dd;
    public static final int De;
    public static final int Df;
    public static final int Dg;
    public static final int Dh;
    public static final int Di;
    public static final int Dj;
    public static final int Dk;
    public static final int Dl;
    public static int Dm;
    public static TextPaint[] E0;
    public static long E1;
    public static TextPaint E2;
    public static Drawable E3;
    public static Drawable E4;
    public static final int E5;
    public static final int E6;
    public static final int E7;
    public static final int E8;
    public static final int E9;
    public static final int Ea;
    public static final int Eb;
    public static final int Ec;
    public static final int Ed;
    public static final int Ee;
    public static final int Ef;
    public static final int Eg;
    public static final int Eh;
    public static final int Ei;
    public static final int Ej;
    public static final int Ek;
    public static final int El;
    public static final Paint Em;
    public static final ArrayList F;
    public static TextPaint F0;
    public static boolean F1;
    public static TextPaint F2;
    public static Drawable F3;
    public static final int F5;
    public static final int F6;
    public static final int F7;
    public static final int F8;
    public static final int F9;
    public static final int Fa;
    public static final int Fb;
    public static final int Fc;
    public static final int Fd;
    public static final int Fe;
    public static final int Ff;
    public static final int Fg;
    public static final int Fh;
    public static final int Fi;
    public static final int Fj;
    public static final int Fk;
    public static final int Fl;
    public static final Paint Fm;
    public static final ArrayList G;
    public static TextPaint[] G0;
    public static oy8 G1;
    public static TextPaint G2;
    public static Drawable G3;
    public static final int G5;
    public static final int G6;
    public static final int G7;
    public static final int G8;
    public static final int G9;
    public static final int Ga;
    public static final int Gb;
    public static final int Gc;
    public static final int Gd;
    public static final int Ge;
    public static final int Gf;
    public static final int Gg;
    public static final int Gh;
    public static final int Gi;
    public static final int Gj;
    public static final int Gk;
    public static final int Gl;
    public static final Paint Gm;
    public static final HashMap H;
    public static TextPaint H0;
    public static oy8 H1;
    public static TextPaint H2;
    public static Drawable H3;
    public static final int H5;
    public static final int H6;
    public static final int H7;
    public static final int H8;
    public static final int H9;
    public static final int Ha;
    public static final int Hb;
    public static final int Hc;
    public static final int Hd;
    public static final int He;
    public static final int Hf;
    public static final int Hg;
    public static final int Hh;
    public static final int Hi;
    public static final int Hj;
    public static final int Hk;
    public static final int Hl;
    public static final Paint Hm;
    public static akb I;
    public static TextPaint I0;
    public static oy8 I1;
    public static TextPaint I2;
    public static Drawable I3;
    public static final int I5;
    public static final int I6;
    public static final int I7;
    public static final int I8;
    public static final int I9;
    public static final int Ia;
    public static final int Ib;
    public static final int Ic;
    public static final int Id;
    public static final int Ie;
    public static final int If;
    public static final int Ig;
    public static final int Ih;
    public static final int Ii;
    public static final int Ij;
    public static final int Ik;
    public static final int Il;
    public static final Paint Im;
    public static akb J;
    public static TextPaint J0;
    public static oy8 J1;
    public static TextPaint J2;
    public static Drawable J3;
    public static final int J5;
    public static final int J6;
    public static final int J7;
    public static final int J8;
    public static final int J9;
    public static final int Ja;
    public static final int Jb;
    public static final int Jc;
    public static final int Jd;
    public static final int Je;
    public static final int Jf;
    public static final int Jg;
    public static final int Jh;
    public static final int Ji;
    public static final int Jj;
    public static final int Jk;
    public static final int Jl;
    public static final Paint Jm;
    public static akb K;
    public static TextPaint K0;
    public static oy8 K1;
    public static TextPaint K2;
    public static Drawable K3;
    public static final int K5;
    public static final int K6;
    public static final int K7;
    public static final int K8;
    public static final int K9;
    public static final int Ka;
    public static final int Kb;
    public static final int Kc;
    public static final int Kd;
    public static final int Ke;
    public static final int Kf;
    public static final int Kg;
    public static final int Kh;
    public static final int Ki;
    public static final int Kj;
    public static final int Kk;
    public static final int Kl;
    public static final akb L;
    public static TextPaint L0;
    public static oy8 L1;
    public static TextPaint L2;
    public static Drawable L3;
    public static final int L5;
    public static final int L6;
    public static final int L7;
    public static final int L8;
    public static final int L9;
    public static final int La;
    public static final int Lb;
    public static final int Lc;
    public static final int Ld;
    public static final int Le;
    public static final int Lf;
    public static final int Lg;
    public static final int Lh;
    public static final int Li;
    public static final int Lj;
    public static final int Lk;
    public static final int Ll;
    public static akb M;
    public static TextPaint M0;
    public static oy8 M1;
    public static TextPaint M2;
    public static Drawable M3;
    public static final int M5;
    public static final int M6;
    public static final int M7;
    public static final int M8;
    public static final int M9;
    public static final int Ma;
    public static final int Mb;
    public static final int Mc;
    public static final int Md;
    public static final int Me;
    public static final int Mf;
    public static final int Mg;
    public static final int Mh;
    public static final int Mi;
    public static final int Mj;
    public static final int Mk;
    public static final int Ml;
    public static boolean N;
    public static TextPaint N0;
    public static oy8 N1;
    public static TextPaint N2;
    public static Drawable N3;
    public static Drawable N4;
    public static final int N5;
    public static final int N6;
    public static final int N7;
    public static final int N8;
    public static final int N9;
    public static final int Na;
    public static final int Nb;
    public static final int Nc;
    public static final int Nd;
    public static final int Ne;
    public static final int Nf;
    public static final int Ng;
    public static final int Nh;
    public static final int Ni;
    public static final int Nj;
    public static final int Nk;
    public static final int Nl;
    public static boolean O;
    public static TextPaint O0;
    public static TextPaint O1;
    public static TextPaint O2;
    public static Drawable O3;
    public static Drawable O4;
    public static final int O5;
    public static final int O6;
    public static final int O7;
    public static final int O8;
    public static final int O9;
    public static final int Oa;
    public static final int Ob;
    public static final int Oc;
    public static final int Od;
    public static final int Oe;
    public static final int Of;
    public static final int Og;
    public static final int Oh;
    public static final int Oi;
    public static final int Oj;
    public static final int Ok;
    public static final int Ol;
    public static boolean P;
    public static TextPaint P0;
    public static Drawable P1;
    public static TextPaint P2;
    public static Drawable P3;
    public static Drawable P4;
    public static final int P5;
    public static final int P6;
    public static final int P7;
    public static final int P8;
    public static final int P9;
    public static final int Pa;
    public static final int Pb;
    public static final int Pc;
    public static final int Pd;
    public static final int Pe;
    public static final int Pf;
    public static final int Pg;
    public static final int Ph;
    public static final int Pi;
    public static final int Pj;
    public static final int Pk;
    public static final int Pl;
    public static boolean Q;
    public static TextPaint Q0;
    public static Drawable Q1;
    public static TextPaint Q2;
    public static Drawable Q3;
    public static Drawable Q4;
    public static final int Q5;
    public static final int Q6;
    public static final int Q7;
    public static final int Q8;
    public static final int Q9;
    public static final int Qa;
    public static final int Qb;
    public static final int Qc;
    public static final int Qd;
    public static final int Qe;
    public static final int Qf;
    public static final int Qg;
    public static final int Qh;
    public static final int Qi;
    public static final int Qj;
    public static final int Qk;
    public static final int Ql;
    public static boolean R;
    public static Drawable R0;
    public static Paint R1;
    public static TextPaint R2;
    public static Drawable R3;
    public static final int R5;
    public static final int R6;
    public static final int R7;
    public static final int R8;
    public static final int R9;
    public static final int Ra;
    public static final int Rb;
    public static final int Rc;
    public static final int Rd;
    public static final int Re;
    public static final int Rf;
    public static final int Rg;
    public static final int Rh;
    public static final int Ri;
    public static final int Rj;
    public static final int Rk;
    public static final int Rl;
    public static int S;
    public static Drawable S0;
    public static Paint S1;
    public static TextPaint S2;
    public static Drawable S3;
    public static final int S5;
    public static final int S6;
    public static final int S7;
    public static final int S8;
    public static final int S9;
    public static final int Sa;
    public static final int Sb;
    public static final int Sc;
    public static final int Sd;
    public static final int Se;
    public static final int Sf;
    public static final int Sg;
    public static final int Sh;
    public static final int Si;
    public static final int Sj;
    public static final int Sk;
    public static final int Sl;
    public static int T;
    public static Drawable T0;
    public static Paint T1;
    public static TextPaint T2;
    public static Drawable T3;
    public static final int T5;
    public static final int T6;
    public static final int T7;
    public static final int T8;
    public static final int T9;
    public static final int Ta;
    public static final int Tb;
    public static final int Tc;
    public static final int Td;
    public static final int Te;
    public static final int Tf;
    public static final int Tg;
    public static final int Th;
    public static final int Ti;
    public static final int Tj;
    public static final int Tk;
    public static final int Tl;
    public static long U;
    public static Drawable U0;
    public static Paint U1;
    public static TextPaint U2;
    public static Drawable U3;
    public static Drawable U4;
    public static final int U5;
    public static final int U6;
    public static final int U7;
    public static final int U8;
    public static final int U9;
    public static final int Ua;
    public static final int Ub;
    public static final int Uc;
    public static final int Ud;
    public static final int Ue;
    public static final int Uf;
    public static final int Ug;
    public static final int Uh;
    public static final int Ui;
    public static final int Uj;
    public static final int Uk;
    public static final int Ul;
    public static boolean V;
    public static Drawable V0;
    public static Paint V1;
    public static TextPaint V2;
    public static Drawable V3;
    public static Drawable V4;
    public static final int V5;
    public static final int V6;
    public static final int V7;
    public static final int V8;
    public static final int V9;
    public static final int Va;
    public static final int Vb;
    public static final int Vc;
    public static final int Vd;
    public static final int Ve;
    public static final int Vf;
    public static final int Vg;
    public static final int Vh;
    public static final int Vi;
    public static final int Vj;
    public static final int Vk;
    public static final int Vl;
    public static int W;
    public static xf7 W0;
    public static Paint W1;
    public static TextPaint W2;
    public static Drawable W3;
    public static Drawable W4;
    public static final int W5;
    public static final int W6;
    public static final int W7;
    public static final int W8;
    public static final int W9;
    public static final int Wa;
    public static final int Wb;
    public static final int Wc;
    public static final int Wd;
    public static final int We;
    public static final int Wf;
    public static final int Wg;
    public static final int Wh;
    public static final int Wi;
    public static final int Wj;
    public static final int Wk;
    public static final int Wl;
    public static Bitmap X;
    public static Drawable X0;
    public static Paint X1;
    public static TextPaint X2;
    public static Drawable X3;
    public static Drawable X4;
    public static final int X5;
    public static final int X6;
    public static final int X7;
    public static final int X8;
    public static final int X9;
    public static final int Xa;
    public static final int Xb;
    public static final int Xc;
    public static final int Xd;
    public static final int Xe;
    public static final int Xf;
    public static final int Xg;
    public static final int Xh;
    public static final int Xi;
    public static final int Xj;
    public static final int Xk;
    public static final int Xl;
    public static BitmapShader Y;
    public static Drawable Y0;
    public static Paint Y1;
    public static TextPaint Y2;
    public static Drawable Y3;
    public static final int Y5;
    public static final int Y6;
    public static final int Y7;
    public static final int Y8;
    public static final int Y9;
    public static final int Ya;
    public static final int Yb;
    public static final int Yc;
    public static final int Yd;
    public static final int Ye;
    public static final int Yf;
    public static final int Yg;
    public static final int Yh;
    public static final int Yi;
    public static final int Yj;
    public static final int Yk;
    public static final int Yl;
    public static Matrix Z;
    public static Drawable Z0;
    public static Paint Z1;
    public static TextPaint Z2;
    public static Drawable Z3;
    public static final int Z5;
    public static final int Z6;
    public static final int Z7;
    public static final int Z8;
    public static final int Z9;
    public static final int Za;
    public static final int Zb;
    public static final int Zc;
    public static final int Zd;
    public static final int Ze;
    public static final int Zf;
    public static final int Zg;
    public static final int Zh;
    public static final int Zi;
    public static final int Zj;
    public static final int Zk;
    public static final int Zl;
    public static int a0;
    public static Drawable a1;
    public static Paint a2;
    public static TextPaint a3;
    public static Drawable a4;
    public static Drawable a5;
    public static final int a6;
    public static final int a7;
    public static final int a8;
    public static final int a9;
    public static final int aa;
    public static final int ab;
    public static final int ac;
    public static final int ad;
    public static final int ae;
    public static final int af;
    public static final int ag;
    public static final int ah;
    public static final int ai;
    public static final int aj;
    public static final int ak;
    public static final int al;
    public static final int am;
    public static boolean b;
    public static int b0;
    public static Drawable b1;
    public static Paint b2;
    public static TextPaint b3;
    public static Drawable b4;
    public static Drawable b5;
    public static final int b6;
    public static final int b7;
    public static final int b8;
    public static final int b9;
    public static final int ba;
    public static final int bb;
    public static final int bc;
    public static final int bd;
    public static final int be;
    public static final int bf;
    public static final int bg;
    public static final int bh;
    public static final int bi;
    public static final int bj;
    public static final int bk;
    public static final int bl;
    public static final int bm;
    public static int c0;
    public static Drawable c1;
    public static Paint c2;
    public static TextPaint c3;
    public static Drawable c4;
    public static n40 c5;
    public static final int c6;
    public static final int c7;
    public static final int c8;
    public static final int c9;
    public static final int ca;
    public static final int cb;
    public static final int cc;
    public static final int cd;
    public static final int ce;
    public static final int cf;
    public static final int cg;
    public static final int ch;
    public static final int ci;
    public static final int cj;
    public static final int ck;
    public static final int cl;
    public static final HashMap cm;
    public static fp6 d;
    public static Drawable d0;
    public static Drawable d1;
    public static Paint d2;
    public static TextPaint d3;
    public static Drawable d4;
    public static HashMap d5;
    public static final int d6;
    public static final int d7;
    public static final int d8;
    public static final int d9;
    public static final int da;
    public static final int db;
    public static final int dc;
    public static final int dd;
    public static final int de;
    public static final int df;
    public static final int dg;
    public static final int dh;
    public static final int di;
    public static final int dj;
    public static final int dk;
    public static final int dl;
    public static final HashMap dm;
    public static SensorManager e;
    public static Drawable e0;
    public static Drawable e1;
    public static Paint e2;
    public static TextPaint e3;
    public static Drawable e4;
    public static final int e5;
    public static final int e6;
    public static final int e7;
    public static final int e8;
    public static final int e9;
    public static final int ea;
    public static final int eb;
    public static final int ec;
    public static final int ed;
    public static final int ee;
    public static final int ef;
    public static final int eg;
    public static final int eh;
    public static final int ei;
    public static final int ej;
    public static final int ek;
    public static final int el;
    public static final HashMap em;
    public static Sensor f;
    public static int f0;
    public static gq9 f1;
    public static Paint f2;
    public static TextPaint f3;
    public static Drawable f4;
    public static final int f5;
    public static final int f6;
    public static final int f7;
    public static final int f8;
    public static final int f9;
    public static final int fa;
    public static final int fb;
    public static final int fc;
    public static final int fd;
    public static final int fe;
    public static final int ff;
    public static final int fg;
    public static final int fh;
    public static final int fi;
    public static final int fj;
    public static final int fk;
    public static final int fl;
    public static final HashMap fm;
    public static boolean g;
    public static String g0;
    public static gq9 g1;
    public static Paint g2;
    public static Drawable g3;
    public static Drawable g4;
    public static final int g5;
    public static final int g6;
    public static final int g7;
    public static final int g8;
    public static final int g9;
    public static final int ga;
    public static final int gb;
    public static final int gc;
    public static final int gd;
    public static final int ge;
    public static final int gf;
    public static final int gg;
    public static final int gh;
    public static final int gi;
    public static final int gj;
    public static final int gk;
    public static final int gl;
    public static final int[] gm;
    public static boolean h0;
    public static Drawable h1;
    public static Paint h2;
    public static Drawable h3;
    public static Drawable h4;
    public static final int h5;
    public static final int h6;
    public static final int h7;
    public static final int h8;
    public static final int h9;
    public static final int ha;
    public static final int hb;
    public static final int hc;
    public static final int hd;
    public static final int he;
    public static final int hf;
    public static final int hg;
    public static final int hh;
    public static final int hi;
    public static final int hj;
    public static final int hk;
    public static final int hl;
    public static final SparseIntArray hm;
    public static long i;
    public static boolean i0;
    public static Drawable i1;
    public static Paint i2;
    public static Drawable i3;
    public static Drawable i4;
    public static final int i5;
    public static final int i6;
    public static final int i7;
    public static final int i8;
    public static final int i9;
    public static final int ia;
    public static final int ib;
    public static final int ic;
    public static final int id;
    public static final int ie;
    public static final int ig;
    public static final int ih;
    public static final int ii;
    public static final int ij;
    public static final int ik;
    public static final int il;
    public static final HashSet im;
    public static boolean j;
    public static Paint j0;
    public static Drawable j1;
    public static Paint j2;
    public static wl9 j3;
    public static Drawable j4;
    public static final int j5;
    public static final int j6;
    public static final int j7;
    public static final int j8;
    public static final int j9;
    public static final int ja;
    public static final int jb;
    public static final int jc;
    public static final int jd;
    public static final int je;
    public static final int jf;
    public static final int jg;
    public static final int jh;
    public static final int ji;
    public static final int jj;
    public static final int jk;
    public static final int jl;
    public static SparseIntArray jm;
    public static boolean k;
    public static Paint k0;
    public static Drawable k1;
    public static Paint k2;
    public static Drawable k3;
    public static Drawable k4;
    public static final int k5;
    public static final int k6;
    public static final int k7;
    public static final int k8;
    public static final int k9;
    public static final int ka;
    public static final int kb;
    public static final int kc;
    public static final int kd;
    public static final int ke;
    public static final int kf;
    public static final int kg;
    public static final int kh;
    public static final int ki;
    public static final int kj;
    public static final int kk;
    public static final int kl;
    public static SparseIntArray km;
    public static Paint l0;
    public static Drawable l1;
    public static Paint l2;
    public static m17 l3;
    public static Drawable l4;
    public static final int l5;
    public static final int l6;
    public static final int l7;
    public static final int l8;
    public static final int l9;
    public static final int la;
    public static final int lb;
    public static final int lc;
    public static final int ld;
    public static final int le;
    public static final int lf;
    public static final int lg;
    public static final int lh;
    public static final int li;
    public static final int lj;
    public static final int lk;
    public static final int ll;
    public static SparseIntArray lm;
    public static Paint m0;
    public static Drawable m1;
    public static Paint m2;
    public static m17 m3;
    public static Drawable m4;
    public static final int m5;
    public static final int m6;
    public static final int m7;
    public static final int m8;
    public static final int m9;
    public static final int ma;
    public static final int mb;
    public static final int mc;
    public static final int md;
    public static final int me;
    public static final int mf;
    public static final int mg;
    public static final int mh;
    public static final int mi;
    public static final int mj;
    public static final int mk;
    public static final int ml;
    public static boolean mm;
    public static Paint n0;
    public static Drawable n1;
    public static TextPaint n2;
    public static m17 n3;
    public static Drawable n4;
    public static final int n5;
    public static final int n6;
    public static final int n7;
    public static final int n8;
    public static final int n9;
    public static final int na;
    public static final int nb;
    public static final int nc;
    public static final int nd;
    public static final int ne;
    public static final int nf;
    public static final int ng;
    public static final int nh;
    public static final int ni;
    public static final int nj;
    public static final int nk;
    public static final int nl;
    public static final ThreadLocal nm;
    public static int o;
    public static Paint o0;
    public static Drawable o1;
    public static TextPaint o2;
    public static m17 o3;
    public static Drawable o4;
    public static final int o5;
    public static final int o6;
    public static final int o7;
    public static final int[] o8;
    public static final int o9;
    public static final int oa;
    public static final int ob;
    public static final int oc;
    public static final int od;
    public static final int oe;
    public static final int of;
    public static final int og;
    public static final int oh;
    public static final int oi;
    public static final int oj;
    public static final int ok;
    public static final int ol;
    public static final ThreadLocal om;
    public static boolean p;
    public static Paint p0;
    public static Drawable p1;
    public static TextPaint p2;
    public static m17 p3;
    public static Drawable p4;
    public static final int p5;
    public static final int p6;
    public static final int p7;
    public static final int[] p8;
    public static final int p9;
    public static final int pa;
    public static final int pb;
    public static final int pc;
    public static final int pd;
    public static final int pe;
    public static final int pf;
    public static final int pg;
    public static final int ph;
    public static final int pi;
    public static final int pj;
    public static final int pk;
    public static final int pl;
    public static final ThreadLocal pm;
    public static float q;
    public static Drawable q1;
    public static TextPaint q2;
    public static m17 q3;
    public static Drawable q4;
    public static final int q5;
    public static final int q6;
    public static final int q7;
    public static final int[] q8;
    public static final int q9;
    public static final int qa;
    public static final int qb;
    public static final int qc;
    public static final int qd;
    public static final int qe;
    public static final int qf;
    public static final int qg;
    public static final int qh;
    public static final int qi;
    public static final int qj;
    public static final int qk;
    public static final int ql;
    public static final ThreadLocal qm;
    public static int r;
    public static Drawable r0;
    public static Drawable r1;
    public static TextPaint r2;
    public static m17 r3;
    public static Drawable r4;
    public static final int r5;
    public static final int r6;
    public static final int r7;
    public static final int r8;
    public static final int r9;
    public static final int ra;
    public static final int rb;
    public static final int rc;
    public static final int rd;
    public static final int re;
    public static final int rf;
    public static final int rg;
    public static final int rh;
    public static final int ri;
    public static final int rj;
    public static final int[] rk;
    public static final int rl;
    public static final ThreadLocal rm;
    public static int s;
    public static Paint s0;
    public static Drawable s1;
    public static TextPaint s2;
    public static m17 s3;
    public static Drawable s4;
    public static final int s5;
    public static final int s6;
    public static final int s7;
    public static final int s8;
    public static final int s9;
    public static final int sa;
    public static final int sb;
    public static final int sc;
    public static final int sd;
    public static final int se;
    public static final int sf;
    public static final int sg;
    public static final int sh;
    public static final int si;
    public static final int sj;
    public static final int sk;
    public static final int sl;
    public static tn4 sm;
    public static int t;
    public static Paint t0;
    public static oy8 t1;
    public static TextPaint t2;
    public static Drawable t4;
    public static final int t5;
    public static final int t6;
    public static final int t7;
    public static final int t8;
    public static final int t9;
    public static final int ta;
    public static final int tb;
    public static final int tc;
    public static final int td;
    public static final int te;
    public static final int tf;
    public static final int tg;
    public static final int th;
    public static final int ti;
    public static final int tj;
    public static final int tk;
    public static final int tl;
    public static vk9 tm;
    public static int u;
    public static Paint u0;
    public static oy8 u1;
    public static TextPaint u2;
    public static PorterDuffColorFilter u3;
    public static Drawable u4;
    public static final int u5;
    public static final int u6;
    public static final int u7;
    public static final int u8;
    public static final int u9;
    public static final int ua;
    public static final int ub;
    public static final int uc;
    public static final int ud;
    public static final int ue;
    public static final int uf;
    public static final int ug;
    public static final int uh;
    public static final int ui;
    public static final int uj;
    public static final int uk;
    public static final int ul;
    public static Method um;
    public static int v;
    public static Paint v0;
    public static oy8 v1;
    public static TextPaint v2;
    public static PorterDuffColorFilter v3;
    public static Drawable v4;
    public static final int v5;
    public static final int v6;
    public static final int v7;
    public static final int v8;
    public static final int v9;
    public static final int va;
    public static final int vb;
    public static final int vc;
    public static final int vd;
    public static final int ve;
    public static final int vf;
    public static final int vg;
    public static final int vh;
    public static final int vi;
    public static final int vj;
    public static final int vk;
    public static final int vl;
    public static int vm;
    public static String w;
    public static Paint w0;
    public static oy8 w1;
    public static TextPaint w2;
    public static jy7 w3;
    public static Drawable w4;
    public static final int w5;
    public static final int w6;
    public static final int w7;
    public static final int w8;
    public static final int w9;
    public static final int wa;
    public static final int wb;
    public static final int wc;
    public static final int wd;
    public static final int we;
    public static final int wf;
    public static final int wg;
    public static final int wh;
    public static final int wi;
    public static final int wj;
    public static final int wk;
    public static final int wl;
    public static float[] wm;
    public static double x;
    public static Paint x0;
    public static oy8 x1;
    public static TextPaint[] x2;
    public static Drawable x3;
    public static Drawable x4;
    public static final int x5;
    public static final int x6;
    public static final int x7;
    public static final int x8;
    public static final int x9;
    public static final int xa;
    public static final int xb;
    public static final int xc;
    public static final int xd;
    public static final int xe;
    public static final int xf;
    public static final int xg;
    public static final int xh;
    public static final int xi;
    public static final int xj;
    public static final int xk;
    public static final int[] xl;
    public static final mjb xm;
    public static double y;
    public static Paint y0;
    public static oy8 y1;
    public static TextPaint y2;
    public static Drawable y3;
    public static Drawable y4;
    public static final int y5;
    public static final int y6;
    public static final int y7;
    public static final int y8;
    public static final int y9;
    public static final int ya;
    public static final int yb;
    public static final int yc;
    public static final int yd;
    public static final int ye;
    public static final int yf;
    public static final int yg;
    public static final int yh;
    public static final int yi;
    public static final int yj;
    public static final int yk;
    public static final int yl;
    public static final int[] ym;
    public static Paint z0;
    public static boolean z1;
    public static TextPaint z2;
    public static Drawable z3;
    public static Drawable z4;
    public static final int z5;
    public static final int z6;
    public static final int z7;
    public static final int z8;
    public static final int z9;
    public static final int za;
    public static final int zb;
    public static final int zc;
    public static final int zd;
    public static final int ze;
    public static final int zf;
    public static final int zg;
    public static final int zh;
    public static final int zi;
    public static final int zj;
    public static final int zk;
    public static final int zl;
    public static WeakReference zm;
    public static final int a = bm2.o(-16777216, 27);
    public static final Object c = new Object();
    public static float h = 1.0f;
    public static final sv l = new sv(11);
    public static final sv m = new sv(12);
    public static final byte n = 99;
    public static final Paint z = new Paint(1);
    public static final boolean[] C = new boolean[4];
    public static final int[] D = new int[4];
    public static final long[] E = new long[4];
    public static final Drawable[] q0 = new Drawable[25];
    public static final bya[] t3 = new bya[6];
    public static final Drawable[] F4 = new Drawable[2];
    public static final Drawable[] G4 = new Drawable[2];
    public static final Drawable[] H4 = new Drawable[2];
    public static final Drawable[] I4 = new Drawable[2];
    public static final Drawable[] J4 = new Drawable[2];
    public static final Drawable[] K4 = new Drawable[2];
    public static final Drawable[] L4 = new Drawable[2];
    public static final Drawable[] M4 = new Drawable[2];
    public static final Drawable[] R4 = new Drawable[2];
    public static final Drawable[] S4 = new Drawable[2];
    public static final Drawable[][] T4 = (Drawable[][]) Array.newInstance((Class<?>) Drawable.class, 5, 2);
    public static final Path[] Y4 = new Path[2];
    public static final Path[] Z4 = new Path[3];

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x26a2  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x26af A[Catch: Exception -> 0x28cb, TryCatch #0 {Exception -> 0x28cb, blocks: (B:55:0x2352, B:57:0x236c, B:58:0x23a9, B:60:0x23b7, B:61:0x23de, B:63:0x23e2, B:65:0x23ea, B:66:0x23fc, B:67:0x2406, B:69:0x240c, B:71:0x2416, B:73:0x241a, B:75:0x2448, B:76:0x244c, B:90:0x2680, B:92:0x2686, B:93:0x268f, B:95:0x2693, B:97:0x269b, B:99:0x269f, B:100:0x26a3, B:102:0x26a5, B:104:0x26af, B:78:0x2576, B:81:0x2595, B:82:0x25a0, B:84:0x25ac, B:88:0x25b8, B:89:0x2664, B:86:0x25bf, B:109:0x25c2, B:168:0x256d, B:169:0x2575, B:176:0x26c4, B:177:0x26ca, B:180:0x26d5, B:182:0x272c, B:183:0x273a, B:185:0x2748, B:186:0x2756, B:219:0x274f, B:220:0x2733, B:222:0x23c5, B:224:0x23cd, B:226:0x23d4, B:228:0x23dc, B:229:0x2379, B:231:0x2381, B:233:0x2387, B:235:0x238f, B:237:0x2397, B:114:0x245d, B:161:0x2560, B:162:0x2565), top: B:54:0x2352, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x26ba A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x2533 A[Catch: all -> 0x255f, TryCatch #3 {all -> 0x255f, blocks: (B:118:0x2472, B:120:0x2487, B:121:0x248d, B:123:0x249f, B:126:0x24af, B:129:0x24bc, B:132:0x24d3, B:135:0x24e4, B:137:0x24f3, B:140:0x24fc, B:142:0x250f, B:144:0x2518, B:146:0x251f, B:147:0x252f, B:149:0x2533, B:150:0x2537, B:152:0x2542, B:153:0x2549, B:156:0x24da, B:157:0x24c6), top: B:117:0x2472, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x2542 A[Catch: all -> 0x255f, TryCatch #3 {all -> 0x255f, blocks: (B:118:0x2472, B:120:0x2487, B:121:0x248d, B:123:0x249f, B:126:0x24af, B:129:0x24bc, B:132:0x24d3, B:135:0x24e4, B:137:0x24f3, B:140:0x24fc, B:142:0x250f, B:144:0x2518, B:146:0x251f, B:147:0x252f, B:149:0x2533, B:150:0x2537, B:152:0x2542, B:153:0x2549, B:156:0x24da, B:157:0x24c6), top: B:117:0x2472, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x2686 A[Catch: Exception -> 0x28cb, TryCatch #0 {Exception -> 0x28cb, blocks: (B:55:0x2352, B:57:0x236c, B:58:0x23a9, B:60:0x23b7, B:61:0x23de, B:63:0x23e2, B:65:0x23ea, B:66:0x23fc, B:67:0x2406, B:69:0x240c, B:71:0x2416, B:73:0x241a, B:75:0x2448, B:76:0x244c, B:90:0x2680, B:92:0x2686, B:93:0x268f, B:95:0x2693, B:97:0x269b, B:99:0x269f, B:100:0x26a3, B:102:0x26a5, B:104:0x26af, B:78:0x2576, B:81:0x2595, B:82:0x25a0, B:84:0x25ac, B:88:0x25b8, B:89:0x2664, B:86:0x25bf, B:109:0x25c2, B:168:0x256d, B:169:0x2575, B:176:0x26c4, B:177:0x26ca, B:180:0x26d5, B:182:0x272c, B:183:0x273a, B:185:0x2748, B:186:0x2756, B:219:0x274f, B:220:0x2733, B:222:0x23c5, B:224:0x23cd, B:226:0x23d4, B:228:0x23dc, B:229:0x2379, B:231:0x2381, B:233:0x2387, B:235:0x238f, B:237:0x2397, B:114:0x245d, B:161:0x2560, B:162:0x2565), top: B:54:0x2352, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x269f A[Catch: Exception -> 0x28cb, TryCatch #0 {Exception -> 0x28cb, blocks: (B:55:0x2352, B:57:0x236c, B:58:0x23a9, B:60:0x23b7, B:61:0x23de, B:63:0x23e2, B:65:0x23ea, B:66:0x23fc, B:67:0x2406, B:69:0x240c, B:71:0x2416, B:73:0x241a, B:75:0x2448, B:76:0x244c, B:90:0x2680, B:92:0x2686, B:93:0x268f, B:95:0x2693, B:97:0x269b, B:99:0x269f, B:100:0x26a3, B:102:0x26a5, B:104:0x26af, B:78:0x2576, B:81:0x2595, B:82:0x25a0, B:84:0x25ac, B:88:0x25b8, B:89:0x2664, B:86:0x25bf, B:109:0x25c2, B:168:0x256d, B:169:0x2575, B:176:0x26c4, B:177:0x26ca, B:180:0x26d5, B:182:0x272c, B:183:0x273a, B:185:0x2748, B:186:0x2756, B:219:0x274f, B:220:0x2733, B:222:0x23c5, B:224:0x23cd, B:226:0x23d4, B:228:0x23dc, B:229:0x2379, B:231:0x2381, B:233:0x2387, B:235:0x238f, B:237:0x2397, B:114:0x245d, B:161:0x2560, B:162:0x2565), top: B:54:0x2352, inners: #2 }] */
    /* JADX WARN: Type inference failed for: r11v103, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v108 */
    /* JADX WARN: Type inference failed for: r11v132 */
    static {
        HashSet hashSet;
        akb akbVar;
        akb akbVar2;
        boolean z10;
        int i10;
        Iterator it;
        SharedPreferences.Editor editor;
        RuntimeException runtimeException;
        boolean z11;
        Iterator it2;
        SharedPreferences.Editor editor2;
        int i11;
        TLRPC.TL_theme tL_theme;
        TLRPC.TL_theme tL_theme2;
        SparseArray sparseArray;
        zjb i12;
        o = 0;
        q = 0.25f;
        r = 1320;
        s = 480;
        t = 1320;
        u = -1;
        v = 480;
        w = "";
        x = 10000.0d;
        y = 10000.0d;
        int i13 = 3;
        int i14 = e5;
        int i15 = i14 + 1;
        e5 = i15;
        f5 = i14;
        int i16 = i14 + 2;
        e5 = i16;
        g5 = i15;
        int i17 = i14 + 3;
        e5 = i17;
        h5 = i16;
        int i18 = i14 + 4;
        e5 = i18;
        i5 = i17;
        int i19 = i14 + 5;
        e5 = i19;
        j5 = i18;
        int i20 = i14 + 6;
        e5 = i20;
        k5 = i19;
        int i21 = i14 + 7;
        e5 = i21;
        l5 = i20;
        int i22 = i14 + 8;
        e5 = i22;
        m5 = i21;
        int i23 = i14 + 9;
        e5 = i23;
        n5 = i22;
        int i24 = i14 + 10;
        e5 = i24;
        o5 = i23;
        int i25 = i14 + 11;
        e5 = i25;
        p5 = i24;
        int i26 = i14 + 12;
        e5 = i26;
        q5 = i25;
        int i27 = i14 + 13;
        e5 = i27;
        r5 = i26;
        int i28 = i14 + 14;
        e5 = i28;
        s5 = i27;
        int i29 = i14 + 15;
        e5 = i29;
        t5 = i28;
        int i30 = i14 + 16;
        e5 = i30;
        u5 = i29;
        int i31 = i14 + 17;
        e5 = i31;
        v5 = i30;
        int i32 = i14 + 18;
        e5 = i32;
        w5 = i31;
        int i33 = i14 + 19;
        e5 = i33;
        x5 = i32;
        int i34 = i14 + 20;
        e5 = i34;
        y5 = i33;
        int i35 = i14 + 21;
        e5 = i35;
        z5 = i34;
        int i36 = i14 + 22;
        e5 = i36;
        A5 = i35;
        int i37 = i14 + 23;
        e5 = i37;
        B5 = i36;
        int i38 = i14 + 24;
        e5 = i38;
        C5 = i37;
        int i39 = i14 + 25;
        e5 = i39;
        D5 = i38;
        int i40 = i14 + 26;
        e5 = i40;
        E5 = i39;
        int i41 = i14 + 27;
        e5 = i41;
        F5 = i40;
        int i42 = i14 + 28;
        e5 = i42;
        G5 = i41;
        int i43 = i14 + 29;
        e5 = i43;
        H5 = i42;
        int i44 = i14 + 30;
        e5 = i44;
        I5 = i43;
        int i45 = i14 + 31;
        e5 = i45;
        J5 = i44;
        int i46 = i14 + 32;
        e5 = i46;
        K5 = i45;
        int i47 = i14 + 33;
        e5 = i47;
        L5 = i46;
        int i48 = i14 + 34;
        e5 = i48;
        M5 = i47;
        int i49 = i14 + 35;
        e5 = i49;
        N5 = i48;
        int i50 = i14 + 36;
        e5 = i50;
        O5 = i49;
        int i51 = i14 + 37;
        e5 = i51;
        P5 = i50;
        int i52 = i14 + 38;
        e5 = i52;
        Q5 = i51;
        int i53 = i14 + 39;
        e5 = i53;
        R5 = i52;
        int i54 = i14 + 40;
        e5 = i54;
        S5 = i53;
        int i55 = i14 + 41;
        e5 = i55;
        T5 = i54;
        int i56 = i14 + 42;
        e5 = i56;
        U5 = i55;
        int i57 = i14 + 43;
        e5 = i57;
        V5 = i56;
        int i58 = i14 + 44;
        e5 = i58;
        W5 = i57;
        int i59 = i14 + 45;
        e5 = i59;
        X5 = i58;
        int i60 = i14 + 46;
        e5 = i60;
        Y5 = i59;
        int i61 = i14 + 47;
        e5 = i61;
        Z5 = i60;
        int i62 = i14 + 48;
        e5 = i62;
        a6 = i61;
        e5 = i14 + 49;
        b6 = i62;
        int i63 = e5;
        int i64 = i63 + 1;
        e5 = i64;
        c6 = i63;
        int i65 = i63 + 2;
        e5 = i65;
        d6 = i64;
        int i66 = i63 + 3;
        e5 = i66;
        e6 = i65;
        int i67 = i63 + 4;
        e5 = i67;
        f6 = i66;
        int i68 = i63 + 5;
        e5 = i68;
        g6 = i67;
        int i69 = i63 + 6;
        e5 = i69;
        h6 = i68;
        int i70 = i63 + 7;
        e5 = i70;
        i6 = i69;
        int i71 = i63 + 8;
        e5 = i71;
        j6 = i70;
        int i72 = i63 + 9;
        e5 = i72;
        k6 = i71;
        int i73 = i63 + 10;
        e5 = i73;
        l6 = i72;
        int i74 = i63 + 11;
        e5 = i74;
        m6 = i73;
        int i75 = i63 + 12;
        e5 = i75;
        n6 = i74;
        int i76 = i63 + 13;
        e5 = i76;
        o6 = i75;
        int i77 = i63 + 14;
        e5 = i77;
        p6 = i76;
        int i78 = i63 + 15;
        e5 = i78;
        q6 = i77;
        int i79 = i63 + 16;
        e5 = i79;
        r6 = i78;
        int i80 = i63 + 17;
        e5 = i80;
        s6 = i79;
        int i81 = i63 + 18;
        e5 = i81;
        t6 = i80;
        int i82 = i63 + 19;
        e5 = i82;
        u6 = i81;
        int i83 = i63 + 20;
        e5 = i83;
        v6 = i82;
        int i84 = i63 + 21;
        e5 = i84;
        w6 = i83;
        int i85 = i63 + 22;
        e5 = i85;
        x6 = i84;
        int i86 = i63 + 23;
        e5 = i86;
        y6 = i85;
        int i87 = i63 + 24;
        e5 = i87;
        z6 = i86;
        int i88 = i63 + 25;
        e5 = i88;
        A6 = i87;
        int i89 = i63 + 26;
        e5 = i89;
        B6 = i88;
        int i90 = i63 + 27;
        e5 = i90;
        C6 = i89;
        int i91 = i63 + 28;
        e5 = i91;
        D6 = i90;
        int i92 = i63 + 29;
        e5 = i92;
        E6 = i91;
        int i93 = i63 + 30;
        e5 = i93;
        F6 = i92;
        int i94 = i63 + 31;
        e5 = i94;
        G6 = i93;
        int i95 = i63 + 32;
        e5 = i95;
        H6 = i94;
        int i96 = i63 + 33;
        e5 = i96;
        I6 = i95;
        int i97 = i63 + 34;
        e5 = i97;
        J6 = i96;
        int i98 = i63 + 35;
        e5 = i98;
        K6 = i97;
        int i99 = i63 + 36;
        e5 = i99;
        L6 = i98;
        int i100 = i63 + 37;
        e5 = i100;
        M6 = i99;
        int i101 = i63 + 38;
        e5 = i101;
        N6 = i100;
        int i102 = i63 + 39;
        e5 = i102;
        O6 = i101;
        int i103 = i63 + 40;
        e5 = i103;
        P6 = i102;
        int i104 = i63 + 41;
        e5 = i104;
        Q6 = i103;
        int i105 = i63 + 42;
        e5 = i105;
        R6 = i104;
        int i106 = i63 + 43;
        e5 = i106;
        S6 = i105;
        int i107 = i63 + 44;
        e5 = i107;
        T6 = i106;
        int i108 = i63 + 45;
        e5 = i108;
        U6 = i107;
        int i109 = i63 + 46;
        e5 = i109;
        V6 = i108;
        int i110 = i63 + 47;
        e5 = i110;
        W6 = i109;
        int i111 = i63 + 48;
        e5 = i111;
        X6 = i110;
        e5 = i63 + 49;
        Y6 = i111;
        int i112 = e5;
        int i113 = i112 + 1;
        e5 = i113;
        Z6 = i112;
        int i114 = i112 + 2;
        e5 = i114;
        a7 = i113;
        int i115 = i112 + 3;
        e5 = i115;
        b7 = i114;
        int i116 = i112 + 4;
        e5 = i116;
        c7 = i115;
        int i117 = i112 + 5;
        e5 = i117;
        d7 = i116;
        int i118 = i112 + 6;
        e5 = i118;
        e7 = i117;
        int i119 = i112 + 7;
        e5 = i119;
        f7 = i118;
        int i120 = i112 + 8;
        e5 = i120;
        g7 = i119;
        int i121 = i112 + 9;
        e5 = i121;
        h7 = i120;
        int i122 = i112 + 10;
        e5 = i122;
        i7 = i121;
        int i123 = i112 + 11;
        e5 = i123;
        j7 = i122;
        int i124 = i112 + 12;
        e5 = i124;
        k7 = i123;
        int i125 = i112 + 13;
        e5 = i125;
        l7 = i124;
        int i126 = i112 + 14;
        e5 = i126;
        m7 = i125;
        int i127 = i112 + 15;
        e5 = i127;
        n7 = i126;
        int i128 = i112 + 16;
        e5 = i128;
        o7 = i127;
        int i129 = i112 + 17;
        e5 = i129;
        p7 = i128;
        int i130 = i112 + 18;
        e5 = i130;
        q7 = i129;
        int i131 = i112 + 19;
        e5 = i131;
        r7 = i130;
        int i132 = i112 + 20;
        e5 = i132;
        s7 = i131;
        int i133 = i112 + 21;
        e5 = i133;
        t7 = i132;
        int i134 = i112 + 22;
        e5 = i134;
        u7 = i133;
        int i135 = i112 + 23;
        e5 = i135;
        v7 = i134;
        int i136 = i112 + 24;
        e5 = i136;
        w7 = i135;
        int i137 = i112 + 25;
        e5 = i137;
        x7 = i136;
        int i138 = i112 + 26;
        e5 = i138;
        y7 = i137;
        int i139 = i112 + 27;
        e5 = i139;
        z7 = i138;
        int i140 = i112 + 28;
        e5 = i140;
        A7 = i139;
        int i141 = i112 + 29;
        e5 = i141;
        B7 = i140;
        int i142 = i112 + 30;
        e5 = i142;
        C7 = i141;
        int i143 = i112 + 31;
        e5 = i143;
        D7 = i142;
        int i144 = i112 + 32;
        e5 = i144;
        E7 = i143;
        int i145 = i112 + 33;
        e5 = i145;
        F7 = i144;
        int i146 = i112 + 34;
        e5 = i146;
        G7 = i145;
        int i147 = i112 + 35;
        e5 = i147;
        H7 = i146;
        int i148 = i112 + 36;
        e5 = i148;
        I7 = i147;
        int i149 = i112 + 37;
        e5 = i149;
        J7 = i148;
        int i150 = i112 + 38;
        e5 = i150;
        K7 = i149;
        int i151 = i112 + 39;
        e5 = i151;
        L7 = i150;
        int i152 = i112 + 40;
        e5 = i152;
        M7 = i151;
        int i153 = i112 + 41;
        e5 = i153;
        N7 = i152;
        int i154 = i112 + 42;
        e5 = i154;
        O7 = i153;
        int i155 = i112 + 43;
        e5 = i155;
        P7 = i154;
        int i156 = i112 + 44;
        e5 = i156;
        Q7 = i155;
        int i157 = i112 + 45;
        e5 = i157;
        R7 = i156;
        int i158 = i112 + 46;
        e5 = i158;
        S7 = i157;
        int i159 = i112 + 47;
        e5 = i159;
        T7 = i158;
        int i160 = i112 + 48;
        e5 = i160;
        U7 = i159;
        e5 = i112 + 49;
        V7 = i160;
        int i161 = e5;
        int i162 = i161 + 1;
        e5 = i162;
        W7 = i161;
        int i163 = i161 + 2;
        e5 = i163;
        X7 = i162;
        int i164 = i161 + 3;
        e5 = i164;
        Y7 = i163;
        int i165 = i161 + 4;
        e5 = i165;
        Z7 = i164;
        int i166 = i161 + 5;
        e5 = i166;
        a8 = i165;
        int i167 = i161 + 6;
        e5 = i167;
        b8 = i166;
        int i168 = i161 + 7;
        e5 = i168;
        c8 = i167;
        int i169 = i161 + 8;
        e5 = i169;
        d8 = i168;
        int i170 = i161 + 9;
        e5 = i170;
        e8 = i169;
        int i171 = i161 + 10;
        e5 = i171;
        f8 = i170;
        int i172 = i161 + 11;
        e5 = i172;
        g8 = i171;
        int i173 = i161 + 12;
        e5 = i173;
        h8 = i172;
        int i174 = i161 + 13;
        e5 = i174;
        i8 = i173;
        int i175 = i161 + 14;
        e5 = i175;
        j8 = i174;
        int i176 = i161 + 15;
        e5 = i176;
        k8 = i175;
        int i177 = i161 + 16;
        e5 = i177;
        l8 = i176;
        int i178 = i161 + 17;
        e5 = i178;
        m8 = i177;
        int i179 = i161 + 18;
        e5 = i179;
        n8 = i178;
        o8 = new int[]{i152, i153, i154, i155, i156, i157, i158};
        p8 = new int[]{i159, i160, i161, i162, i163, i164, i165};
        q8 = new int[]{i172, i173, i174, i175, i176, i177, i178};
        int i180 = i161 + 19;
        e5 = i180;
        r8 = i179;
        int i181 = i161 + 20;
        e5 = i181;
        s8 = i180;
        int i182 = i161 + 21;
        e5 = i182;
        t8 = i181;
        int i183 = i161 + 22;
        e5 = i183;
        u8 = i182;
        int i184 = i161 + 23;
        e5 = i184;
        v8 = i183;
        int i185 = i161 + 24;
        e5 = i185;
        w8 = i184;
        int i186 = i161 + 25;
        e5 = i186;
        x8 = i185;
        int i187 = i161 + 26;
        e5 = i187;
        y8 = i186;
        int i188 = i161 + 27;
        e5 = i188;
        z8 = i187;
        int i189 = i161 + 28;
        e5 = i189;
        A8 = i188;
        int i190 = i161 + 29;
        e5 = i190;
        B8 = i189;
        int i191 = i161 + 30;
        e5 = i191;
        C8 = i190;
        int i192 = i161 + 31;
        e5 = i192;
        D8 = i191;
        int i193 = i161 + 32;
        e5 = i193;
        E8 = i192;
        int i194 = i161 + 33;
        e5 = i194;
        F8 = i193;
        int i195 = i161 + 34;
        e5 = i195;
        G8 = i194;
        int i196 = i161 + 35;
        e5 = i196;
        H8 = i195;
        int i197 = i161 + 36;
        e5 = i197;
        I8 = i196;
        int i198 = i161 + 37;
        e5 = i198;
        J8 = i197;
        int i199 = i161 + 38;
        e5 = i199;
        K8 = i198;
        int i200 = i161 + 39;
        e5 = i200;
        L8 = i199;
        int i201 = i161 + 40;
        e5 = i201;
        M8 = i200;
        int i202 = i161 + 41;
        e5 = i202;
        N8 = i201;
        int i203 = i161 + 42;
        e5 = i203;
        O8 = i202;
        int i204 = i161 + 43;
        e5 = i204;
        P8 = i203;
        int i205 = i161 + 44;
        e5 = i205;
        Q8 = i204;
        int i206 = i161 + 45;
        e5 = i206;
        R8 = i205;
        e5 = i161 + 46;
        S8 = i206;
        int i207 = e5;
        int i208 = i207 + 1;
        e5 = i208;
        T8 = i207;
        int i209 = i207 + 2;
        e5 = i209;
        U8 = i208;
        int i210 = i207 + 3;
        e5 = i210;
        V8 = i209;
        int i211 = i207 + 4;
        e5 = i211;
        W8 = i210;
        int i212 = i207 + 5;
        e5 = i212;
        X8 = i211;
        int i213 = i207 + 6;
        e5 = i213;
        Y8 = i212;
        int i214 = i207 + 7;
        e5 = i214;
        Z8 = i213;
        int i215 = i207 + 8;
        e5 = i215;
        a9 = i214;
        int i216 = i207 + 9;
        e5 = i216;
        b9 = i215;
        int i217 = i207 + 10;
        e5 = i217;
        c9 = i216;
        int i218 = i207 + 11;
        e5 = i218;
        d9 = i217;
        int i219 = i207 + 12;
        e5 = i219;
        e9 = i218;
        int i220 = i207 + 13;
        e5 = i220;
        f9 = i219;
        int i221 = i207 + 14;
        e5 = i221;
        g9 = i220;
        int i222 = i207 + 15;
        e5 = i222;
        h9 = i221;
        int i223 = i207 + 16;
        e5 = i223;
        i9 = i222;
        int i224 = i207 + 17;
        e5 = i224;
        j9 = i223;
        int i225 = i207 + 18;
        e5 = i225;
        k9 = i224;
        int i226 = i207 + 19;
        e5 = i226;
        l9 = i225;
        int i227 = i207 + 20;
        e5 = i227;
        m9 = i226;
        int i228 = i207 + 21;
        e5 = i228;
        n9 = i227;
        int i229 = i207 + 22;
        e5 = i229;
        o9 = i228;
        int i230 = i207 + 23;
        e5 = i230;
        p9 = i229;
        int i231 = i207 + 24;
        e5 = i231;
        q9 = i230;
        int i232 = i207 + 25;
        e5 = i232;
        r9 = i231;
        int i233 = i207 + 26;
        e5 = i233;
        s9 = i232;
        int i234 = i207 + 27;
        e5 = i234;
        t9 = i233;
        int i235 = i207 + 28;
        e5 = i235;
        u9 = i234;
        int i236 = i207 + 29;
        e5 = i236;
        v9 = i235;
        int i237 = i207 + 30;
        e5 = i237;
        w9 = i236;
        int i238 = i207 + 31;
        e5 = i238;
        x9 = i237;
        int i239 = i207 + 32;
        e5 = i239;
        y9 = i238;
        int i240 = i207 + 33;
        e5 = i240;
        z9 = i239;
        int i241 = i207 + 34;
        e5 = i241;
        A9 = i240;
        int i242 = i207 + 35;
        e5 = i242;
        B9 = i241;
        int i243 = i207 + 36;
        e5 = i243;
        C9 = i242;
        int i244 = i207 + 37;
        e5 = i244;
        D9 = i243;
        int i245 = i207 + 38;
        e5 = i245;
        E9 = i244;
        int i246 = i207 + 39;
        e5 = i246;
        F9 = i245;
        int i247 = i207 + 40;
        e5 = i247;
        G9 = i246;
        int i248 = i207 + 41;
        e5 = i248;
        H9 = i247;
        int i249 = i207 + 42;
        e5 = i249;
        I9 = i248;
        int i250 = i207 + 43;
        e5 = i250;
        J9 = i249;
        int i251 = i207 + 44;
        e5 = i251;
        K9 = i250;
        int i252 = i207 + 45;
        e5 = i252;
        L9 = i251;
        int i253 = i207 + 46;
        e5 = i253;
        M9 = i252;
        int i254 = i207 + 47;
        e5 = i254;
        N9 = i253;
        int i255 = i207 + 48;
        e5 = i255;
        O9 = i254;
        e5 = i207 + 49;
        P9 = i255;
        int i256 = e5;
        int i257 = i256 + 1;
        e5 = i257;
        Q9 = i256;
        int i258 = i256 + 2;
        e5 = i258;
        R9 = i257;
        int i259 = i256 + 3;
        e5 = i259;
        S9 = i258;
        int i260 = i256 + 4;
        e5 = i260;
        T9 = i259;
        int i261 = i256 + 5;
        e5 = i261;
        U9 = i260;
        int i262 = i256 + 6;
        e5 = i262;
        V9 = i261;
        int i263 = i256 + 7;
        e5 = i263;
        W9 = i262;
        int i264 = i256 + 8;
        e5 = i264;
        X9 = i263;
        int i265 = i256 + 9;
        e5 = i265;
        Y9 = i264;
        int i266 = i256 + 10;
        e5 = i266;
        Z9 = i265;
        int i267 = i256 + 11;
        e5 = i267;
        aa = i266;
        int i268 = i256 + 12;
        e5 = i268;
        ba = i267;
        int i269 = i256 + 13;
        e5 = i269;
        ca = i268;
        int i270 = i256 + 14;
        e5 = i270;
        da = i269;
        int i271 = i256 + 15;
        e5 = i271;
        ea = i270;
        int i272 = i256 + 16;
        e5 = i272;
        fa = i271;
        int i273 = i256 + 17;
        e5 = i273;
        ga = i272;
        int i274 = i256 + 18;
        e5 = i274;
        ha = i273;
        int i275 = i256 + 19;
        e5 = i275;
        ia = i274;
        int i276 = i256 + 20;
        e5 = i276;
        ja = i275;
        int i277 = i256 + 21;
        e5 = i277;
        ka = i276;
        int i278 = i256 + 22;
        e5 = i278;
        la = i277;
        int i279 = i256 + 23;
        e5 = i279;
        ma = i278;
        int i280 = i256 + 24;
        e5 = i280;
        na = i279;
        int i281 = i256 + 25;
        e5 = i281;
        oa = i280;
        int i282 = i256 + 26;
        e5 = i282;
        pa = i281;
        int i283 = i256 + 27;
        e5 = i283;
        qa = i282;
        int i284 = i256 + 28;
        e5 = i284;
        ra = i283;
        int i285 = i256 + 29;
        e5 = i285;
        sa = i284;
        int i286 = i256 + 30;
        e5 = i286;
        ta = i285;
        int i287 = i256 + 31;
        e5 = i287;
        ua = i286;
        int i288 = i256 + 32;
        e5 = i288;
        va = i287;
        int i289 = i256 + 33;
        e5 = i289;
        wa = i288;
        int i290 = i256 + 34;
        e5 = i290;
        xa = i289;
        int i291 = i256 + 35;
        e5 = i291;
        ya = i290;
        int i292 = i256 + 36;
        e5 = i292;
        za = i291;
        int i293 = i256 + 37;
        e5 = i293;
        Aa = i292;
        int i294 = i256 + 38;
        e5 = i294;
        Ba = i293;
        int i295 = i256 + 39;
        e5 = i295;
        Ca = i294;
        int i296 = i256 + 40;
        e5 = i296;
        Da = i295;
        int i297 = i256 + 41;
        e5 = i297;
        Ea = i296;
        int i298 = i256 + 42;
        e5 = i298;
        Fa = i297;
        int i299 = i256 + 43;
        e5 = i299;
        Ga = i298;
        int i300 = i256 + 44;
        e5 = i300;
        Ha = i299;
        int i301 = i256 + 45;
        e5 = i301;
        Ia = i300;
        int i302 = i256 + 46;
        e5 = i302;
        Ja = i301;
        int i303 = i256 + 47;
        e5 = i303;
        Ka = i302;
        int i304 = i256 + 48;
        e5 = i304;
        La = i303;
        e5 = i256 + 49;
        Ma = i304;
        int i305 = e5;
        int i306 = i305 + 1;
        e5 = i306;
        Na = i305;
        int i307 = i305 + 2;
        e5 = i307;
        Oa = i306;
        int i308 = i305 + 3;
        e5 = i308;
        Pa = i307;
        int i309 = i305 + 4;
        e5 = i309;
        Qa = i308;
        int i310 = i305 + 5;
        e5 = i310;
        Ra = i309;
        int i311 = i305 + 6;
        e5 = i311;
        Sa = i310;
        int i312 = i305 + 7;
        e5 = i312;
        Ta = i311;
        int i313 = i305 + 8;
        e5 = i313;
        Ua = i312;
        int i314 = i305 + 9;
        e5 = i314;
        Va = i313;
        int i315 = i305 + 10;
        e5 = i315;
        Wa = i314;
        int i316 = i305 + 11;
        e5 = i316;
        Xa = i315;
        int i317 = i305 + 12;
        e5 = i317;
        Ya = i316;
        int i318 = i305 + 13;
        e5 = i318;
        Za = i317;
        int i319 = i305 + 14;
        e5 = i319;
        ab = i318;
        int i320 = i305 + 15;
        e5 = i320;
        bb = i319;
        int i321 = i305 + 16;
        e5 = i321;
        cb = i320;
        int i322 = i305 + 17;
        e5 = i322;
        db = i321;
        int i323 = i305 + 18;
        e5 = i323;
        eb = i322;
        int i324 = i305 + 19;
        e5 = i324;
        fb = i323;
        int i325 = i305 + 20;
        e5 = i325;
        gb = i324;
        int i326 = i305 + 21;
        e5 = i326;
        hb = i325;
        int i327 = i305 + 22;
        e5 = i327;
        ib = i326;
        int i328 = i305 + 23;
        e5 = i328;
        jb = i327;
        int i329 = i305 + 24;
        e5 = i329;
        kb = i328;
        int i330 = i305 + 25;
        e5 = i330;
        lb = i329;
        int i331 = i305 + 26;
        e5 = i331;
        mb = i330;
        int i332 = i305 + 27;
        e5 = i332;
        nb = i331;
        int i333 = i305 + 28;
        e5 = i333;
        ob = i332;
        pb = i333;
        int i334 = i305 + 29;
        e5 = i334;
        qb = i333;
        int i335 = i305 + 30;
        e5 = i335;
        rb = i334;
        int i336 = i305 + 31;
        e5 = i336;
        sb = i335;
        int i337 = i305 + 32;
        e5 = i337;
        tb = i336;
        int i338 = i305 + 33;
        e5 = i338;
        ub = i337;
        int i339 = i305 + 34;
        e5 = i339;
        vb = i338;
        wb = i339;
        xb = i339;
        int i340 = i305 + 35;
        e5 = i340;
        yb = i339;
        int i341 = i305 + 36;
        e5 = i341;
        zb = i340;
        int i342 = i305 + 37;
        e5 = i342;
        Ab = i341;
        int i343 = i305 + 38;
        e5 = i343;
        Bb = i342;
        int i344 = i305 + 39;
        e5 = i344;
        Cb = i343;
        int i345 = i305 + 40;
        e5 = i345;
        Db = i344;
        int i346 = i305 + 41;
        e5 = i346;
        Eb = i345;
        int i347 = i305 + 42;
        e5 = i347;
        Fb = i346;
        int i348 = i305 + 43;
        e5 = i348;
        Gb = i347;
        int i349 = i305 + 44;
        e5 = i349;
        Hb = i348;
        int i350 = i305 + 45;
        e5 = i350;
        Ib = i349;
        e5 = i305 + 46;
        Jb = i350;
        int i351 = e5;
        int i352 = i351 + 1;
        e5 = i352;
        Kb = i351;
        int i353 = i351 + 2;
        e5 = i353;
        Lb = i352;
        int i354 = i351 + 3;
        e5 = i354;
        Mb = i353;
        int i355 = i351 + 4;
        e5 = i355;
        Nb = i354;
        int i356 = i351 + 5;
        e5 = i356;
        Ob = i355;
        int i357 = i351 + 6;
        e5 = i357;
        Pb = i356;
        int i358 = i351 + 7;
        e5 = i358;
        Qb = i357;
        int i359 = i351 + 8;
        e5 = i359;
        Rb = i358;
        int i360 = i351 + 9;
        e5 = i360;
        Sb = i359;
        int i361 = i351 + 10;
        e5 = i361;
        Tb = i360;
        int i362 = i351 + 11;
        e5 = i362;
        Ub = i361;
        int i363 = i351 + 12;
        e5 = i363;
        Vb = i362;
        int i364 = i351 + 13;
        e5 = i364;
        Wb = i363;
        int i365 = i351 + 14;
        e5 = i365;
        Xb = i364;
        int i366 = i351 + 15;
        e5 = i366;
        Yb = i365;
        int i367 = i351 + 16;
        e5 = i367;
        Zb = i366;
        int i368 = i351 + 17;
        e5 = i368;
        ac = i367;
        int i369 = i351 + 18;
        e5 = i369;
        bc = i368;
        int i370 = i351 + 19;
        e5 = i370;
        cc = i369;
        int i371 = i351 + 20;
        e5 = i371;
        dc = i370;
        int i372 = i351 + 21;
        e5 = i372;
        ec = i371;
        int i373 = i351 + 22;
        e5 = i373;
        fc = i372;
        int i374 = i351 + 23;
        e5 = i374;
        gc = i373;
        int i375 = i351 + 24;
        e5 = i375;
        hc = i374;
        int i376 = i351 + 25;
        e5 = i376;
        ic = i375;
        int i377 = i351 + 26;
        e5 = i377;
        jc = i376;
        int i378 = i351 + 27;
        e5 = i378;
        kc = i377;
        int i379 = i351 + 28;
        e5 = i379;
        lc = i378;
        int i380 = i351 + 29;
        e5 = i380;
        mc = i379;
        int i381 = i351 + 30;
        e5 = i381;
        nc = i380;
        int i382 = i351 + 31;
        e5 = i382;
        oc = i381;
        int i383 = i351 + 32;
        e5 = i383;
        pc = i382;
        int i384 = i351 + 33;
        e5 = i384;
        qc = i383;
        int i385 = i351 + 34;
        e5 = i385;
        rc = i384;
        int i386 = i351 + 35;
        e5 = i386;
        sc = i385;
        int i387 = i351 + 36;
        e5 = i387;
        tc = i386;
        int i388 = i351 + 37;
        e5 = i388;
        uc = i387;
        int i389 = i351 + 38;
        e5 = i389;
        vc = i388;
        int i390 = i351 + 39;
        e5 = i390;
        wc = i389;
        int i391 = i351 + 40;
        e5 = i391;
        xc = i390;
        int i392 = i351 + 41;
        e5 = i392;
        yc = i391;
        int i393 = i351 + 42;
        e5 = i393;
        zc = i392;
        int i394 = i351 + 43;
        e5 = i394;
        Ac = i393;
        int i395 = i351 + 44;
        e5 = i395;
        Bc = i394;
        int i396 = i351 + 45;
        e5 = i396;
        Cc = i395;
        int i397 = i351 + 46;
        e5 = i397;
        Dc = i396;
        int i398 = i351 + 47;
        e5 = i398;
        Ec = i397;
        int i399 = i351 + 48;
        e5 = i399;
        Fc = i398;
        e5 = i351 + 49;
        Gc = i399;
        int i400 = e5;
        int i401 = i400 + 1;
        e5 = i401;
        Hc = i400;
        int i402 = i400 + 2;
        e5 = i402;
        Ic = i401;
        Jc = i402;
        Kc = i402;
        int i403 = i400 + 3;
        e5 = i403;
        Lc = i402;
        int i404 = i400 + 4;
        e5 = i404;
        Mc = i403;
        int i405 = i400 + 5;
        e5 = i405;
        Nc = i404;
        int i406 = i400 + 6;
        e5 = i406;
        Oc = i405;
        int i407 = i400 + 7;
        e5 = i407;
        Pc = i406;
        int i408 = i400 + 8;
        e5 = i408;
        Qc = i407;
        int i409 = i400 + 9;
        e5 = i409;
        Rc = i408;
        Sc = i409;
        int i410 = i400 + 10;
        e5 = i410;
        Tc = i409;
        int i411 = i400 + 11;
        e5 = i411;
        Uc = i410;
        int i412 = i400 + 12;
        e5 = i412;
        Vc = i411;
        int i413 = i400 + 13;
        e5 = i413;
        Wc = i412;
        int i414 = i400 + 14;
        e5 = i414;
        Xc = i413;
        int i415 = i400 + 15;
        e5 = i415;
        Yc = i414;
        int i416 = i400 + 16;
        e5 = i416;
        Zc = i415;
        int i417 = i400 + 17;
        e5 = i417;
        ad = i416;
        int i418 = i400 + 18;
        e5 = i418;
        bd = i417;
        int i419 = i400 + 19;
        e5 = i419;
        cd = i418;
        int i420 = i400 + 20;
        e5 = i420;
        dd = i419;
        int i421 = i400 + 21;
        e5 = i421;
        ed = i420;
        int i422 = i400 + 22;
        e5 = i422;
        fd = i421;
        int i423 = i400 + 23;
        e5 = i423;
        gd = i422;
        int i424 = i400 + 24;
        e5 = i424;
        hd = i423;
        int i425 = i400 + 25;
        e5 = i425;
        id = i424;
        int i426 = i400 + 26;
        e5 = i426;
        jd = i425;
        int i427 = i400 + 27;
        e5 = i427;
        kd = i426;
        int i428 = i400 + 28;
        e5 = i428;
        ld = i427;
        int i429 = i400 + 29;
        e5 = i429;
        md = i428;
        int i430 = i400 + 30;
        e5 = i430;
        nd = i429;
        int i431 = i400 + 31;
        e5 = i431;
        od = i430;
        int i432 = i400 + 32;
        e5 = i432;
        pd = i431;
        int i433 = i400 + 33;
        e5 = i433;
        qd = i432;
        int i434 = i400 + 34;
        e5 = i434;
        rd = i433;
        int i435 = i400 + 35;
        e5 = i435;
        sd = i434;
        int i436 = i400 + 36;
        e5 = i436;
        td = i435;
        int i437 = i400 + 37;
        e5 = i437;
        ud = i436;
        int i438 = i400 + 38;
        e5 = i438;
        vd = i437;
        int i439 = i400 + 39;
        e5 = i439;
        wd = i438;
        int i440 = i400 + 40;
        e5 = i440;
        xd = i439;
        int i441 = i400 + 41;
        e5 = i441;
        yd = i440;
        int i442 = i400 + 42;
        e5 = i442;
        zd = i441;
        int i443 = i400 + 43;
        e5 = i443;
        Ad = i442;
        int i444 = i400 + 44;
        e5 = i444;
        Bd = i443;
        int i445 = i400 + 45;
        e5 = i445;
        Cd = i444;
        e5 = i400 + 46;
        Dd = i445;
        int i446 = e5;
        int i447 = i446 + 1;
        e5 = i447;
        Ed = i446;
        int i448 = i446 + 2;
        e5 = i448;
        Fd = i447;
        int i449 = i446 + 3;
        e5 = i449;
        Gd = i448;
        int i450 = i446 + 4;
        e5 = i450;
        Hd = i449;
        int i451 = i446 + 5;
        e5 = i451;
        Id = i450;
        int i452 = i446 + 6;
        e5 = i452;
        Jd = i451;
        int i453 = i446 + 7;
        e5 = i453;
        Kd = i452;
        int i454 = i446 + 8;
        e5 = i454;
        Ld = i453;
        int i455 = i446 + 9;
        e5 = i455;
        Md = i454;
        int i456 = i446 + 10;
        e5 = i456;
        Nd = i455;
        int i457 = i446 + 11;
        e5 = i457;
        Od = i456;
        int i458 = i446 + 12;
        e5 = i458;
        Pd = i457;
        int i459 = i446 + 13;
        e5 = i459;
        Qd = i458;
        int i460 = i446 + 14;
        e5 = i460;
        Rd = i459;
        int i461 = i446 + 15;
        e5 = i461;
        Sd = i460;
        int i462 = i446 + 16;
        e5 = i462;
        Td = i461;
        int i463 = i446 + 17;
        e5 = i463;
        Ud = i462;
        int i464 = i446 + 18;
        e5 = i464;
        Vd = i463;
        int i465 = i446 + 19;
        e5 = i465;
        Wd = i464;
        int i466 = i446 + 20;
        e5 = i466;
        Xd = i465;
        int i467 = i446 + 21;
        e5 = i467;
        Yd = i466;
        int i468 = i446 + 22;
        e5 = i468;
        Zd = i467;
        int i469 = i446 + 23;
        e5 = i469;
        ae = i468;
        int i470 = i446 + 24;
        e5 = i470;
        be = i469;
        int i471 = i446 + 25;
        e5 = i471;
        ce = i470;
        int i472 = i446 + 26;
        e5 = i472;
        de = i471;
        int i473 = i446 + 27;
        e5 = i473;
        ee = i472;
        int i474 = i446 + 28;
        e5 = i474;
        fe = i473;
        int i475 = i446 + 29;
        e5 = i475;
        ge = i474;
        int i476 = i446 + 30;
        e5 = i476;
        he = i475;
        int i477 = i446 + 31;
        e5 = i477;
        ie = i476;
        int i478 = i446 + 32;
        e5 = i478;
        je = i477;
        int i479 = i446 + 33;
        e5 = i479;
        ke = i478;
        int i480 = i446 + 34;
        e5 = i480;
        le = i479;
        int i481 = i446 + 35;
        e5 = i481;
        me = i480;
        int i482 = i446 + 36;
        e5 = i482;
        ne = i481;
        int i483 = i446 + 37;
        e5 = i483;
        oe = i482;
        int i484 = i446 + 38;
        e5 = i484;
        pe = i483;
        int i485 = i446 + 39;
        e5 = i485;
        qe = i484;
        int i486 = i446 + 40;
        e5 = i486;
        re = i485;
        int i487 = i446 + 41;
        e5 = i487;
        se = i486;
        int i488 = i446 + 42;
        e5 = i488;
        te = i487;
        int i489 = i446 + 43;
        e5 = i489;
        ue = i488;
        int i490 = i446 + 44;
        e5 = i490;
        ve = i489;
        int i491 = i446 + 45;
        e5 = i491;
        we = i490;
        int i492 = i446 + 46;
        e5 = i492;
        xe = i491;
        int i493 = i446 + 47;
        e5 = i493;
        ye = i492;
        int i494 = i446 + 48;
        e5 = i494;
        ze = i493;
        e5 = i446 + 49;
        Ae = i494;
        int i495 = e5;
        int i496 = i495 + 1;
        e5 = i496;
        Be = i495;
        int i497 = i495 + 2;
        e5 = i497;
        Ce = i496;
        int i498 = i495 + 3;
        e5 = i498;
        De = i497;
        int i499 = i495 + 4;
        e5 = i499;
        Ee = i498;
        int i500 = i495 + 5;
        e5 = i500;
        Fe = i499;
        int i501 = i495 + 6;
        e5 = i501;
        Ge = i500;
        int i502 = i495 + 7;
        e5 = i502;
        He = i501;
        int i503 = i495 + 8;
        e5 = i503;
        Ie = i502;
        int i504 = i495 + 9;
        e5 = i504;
        Je = i503;
        int i505 = i495 + 10;
        e5 = i505;
        Ke = i504;
        int i506 = i495 + 11;
        e5 = i506;
        Le = i505;
        int i507 = i495 + 12;
        e5 = i507;
        Me = i506;
        int i508 = i495 + 13;
        e5 = i508;
        Ne = i507;
        int i509 = i495 + 14;
        e5 = i509;
        Oe = i508;
        int i510 = i495 + 15;
        e5 = i510;
        Pe = i509;
        int i511 = i495 + 16;
        e5 = i511;
        Qe = i510;
        int i512 = i495 + 17;
        e5 = i512;
        Re = i511;
        int i513 = i495 + 18;
        e5 = i513;
        Se = i512;
        int i514 = i495 + 19;
        e5 = i514;
        Te = i513;
        int i515 = i495 + 20;
        e5 = i515;
        Ue = i514;
        int i516 = i495 + 21;
        e5 = i516;
        Ve = i515;
        int i517 = i495 + 22;
        e5 = i517;
        We = i516;
        int i518 = i495 + 23;
        e5 = i518;
        Xe = i517;
        int i519 = i495 + 24;
        e5 = i519;
        Ye = i518;
        int i520 = i495 + 25;
        e5 = i520;
        Ze = i519;
        int i521 = i495 + 26;
        e5 = i521;
        af = i520;
        int i522 = i495 + 27;
        e5 = i522;
        bf = i521;
        int i523 = i495 + 28;
        e5 = i523;
        cf = i522;
        int i524 = i495 + 29;
        e5 = i524;
        df = i523;
        int i525 = i495 + 30;
        e5 = i525;
        ef = i524;
        int i526 = i495 + 31;
        e5 = i526;
        ff = i525;
        int i527 = i495 + 32;
        e5 = i527;
        gf = i526;
        int i528 = i495 + 33;
        e5 = i528;
        hf = i527;
        int i529 = i495 + 34;
        e5 = i529;
        jf = i528;
        int i530 = i495 + 35;
        e5 = i530;
        kf = i529;
        int i531 = i495 + 36;
        e5 = i531;
        lf = i530;
        int i532 = i495 + 37;
        e5 = i532;
        mf = i531;
        int i533 = i495 + 38;
        e5 = i533;
        nf = i532;
        int i534 = i495 + 39;
        e5 = i534;
        of = i533;
        int i535 = i495 + 40;
        e5 = i535;
        pf = i534;
        int i536 = i495 + 41;
        e5 = i536;
        qf = i535;
        int i537 = i495 + 42;
        e5 = i537;
        rf = i536;
        int i538 = i495 + 43;
        e5 = i538;
        sf = i537;
        int i539 = i495 + 44;
        e5 = i539;
        tf = i538;
        int i540 = i495 + 45;
        e5 = i540;
        uf = i539;
        int i541 = i495 + 46;
        e5 = i541;
        vf = i540;
        int i542 = i495 + 47;
        e5 = i542;
        wf = i541;
        int i543 = i495 + 48;
        e5 = i543;
        xf = i542;
        e5 = i495 + 49;
        yf = i543;
        int i544 = e5;
        int i545 = i544 + 1;
        e5 = i545;
        zf = i544;
        int i546 = i544 + 2;
        e5 = i546;
        Af = i545;
        int i547 = i544 + 3;
        e5 = i547;
        Bf = i546;
        int i548 = i544 + 4;
        e5 = i548;
        Cf = i547;
        int i549 = i544 + 5;
        e5 = i549;
        Df = i548;
        int i550 = i544 + 6;
        e5 = i550;
        Ef = i549;
        int i551 = i544 + 7;
        e5 = i551;
        Ff = i550;
        int i552 = i544 + 8;
        e5 = i552;
        Gf = i551;
        int i553 = i544 + 9;
        e5 = i553;
        Hf = i552;
        int i554 = i544 + 10;
        e5 = i554;
        If = i553;
        int i555 = i544 + 11;
        e5 = i555;
        Jf = i554;
        int i556 = i544 + 12;
        e5 = i556;
        Kf = i555;
        int i557 = i544 + 13;
        e5 = i557;
        Lf = i556;
        int i558 = i544 + 14;
        e5 = i558;
        Mf = i557;
        int i559 = i544 + 15;
        e5 = i559;
        Nf = i558;
        int i560 = i544 + 16;
        e5 = i560;
        Of = i559;
        int i561 = i544 + 17;
        e5 = i561;
        Pf = i560;
        int i562 = i544 + 18;
        e5 = i562;
        Qf = i561;
        int i563 = i544 + 19;
        e5 = i563;
        Rf = i562;
        int i564 = i544 + 20;
        e5 = i564;
        Sf = i563;
        int i565 = i544 + 21;
        e5 = i565;
        Tf = i564;
        int i566 = i544 + 22;
        e5 = i566;
        Uf = i565;
        int i567 = i544 + 23;
        e5 = i567;
        Vf = i566;
        int i568 = i544 + 24;
        e5 = i568;
        Wf = i567;
        int i569 = i544 + 25;
        e5 = i569;
        Xf = i568;
        int i570 = i544 + 26;
        e5 = i570;
        Yf = i569;
        int i571 = i544 + 27;
        e5 = i571;
        Zf = i570;
        int i572 = i544 + 28;
        e5 = i572;
        ag = i571;
        int i573 = i544 + 29;
        e5 = i573;
        bg = i572;
        int i574 = i544 + 30;
        e5 = i574;
        cg = i573;
        int i575 = i544 + 31;
        e5 = i575;
        dg = i574;
        int i576 = i544 + 32;
        e5 = i576;
        eg = i575;
        int i577 = i544 + 33;
        e5 = i577;
        fg = i576;
        int i578 = i544 + 34;
        e5 = i578;
        gg = i577;
        int i579 = i544 + 35;
        e5 = i579;
        hg = i578;
        int i580 = i544 + 36;
        e5 = i580;
        ig = i579;
        int i581 = i544 + 37;
        e5 = i581;
        jg = i580;
        int i582 = i544 + 38;
        e5 = i582;
        kg = i581;
        int i583 = i544 + 39;
        e5 = i583;
        lg = i582;
        int i584 = i544 + 40;
        e5 = i584;
        mg = i583;
        int i585 = i544 + 41;
        e5 = i585;
        ng = i584;
        int i586 = i544 + 42;
        e5 = i586;
        og = i585;
        int i587 = i544 + 43;
        e5 = i587;
        pg = i586;
        int i588 = i544 + 44;
        e5 = i588;
        qg = i587;
        int i589 = i544 + 45;
        e5 = i589;
        rg = i588;
        int i590 = i544 + 46;
        e5 = i590;
        sg = i589;
        int i591 = i544 + 47;
        e5 = i591;
        tg = i590;
        int i592 = i544 + 48;
        e5 = i592;
        ug = i591;
        e5 = i544 + 49;
        vg = i592;
        int i593 = e5;
        int i594 = i593 + 1;
        e5 = i594;
        wg = i593;
        int i595 = i593 + 2;
        e5 = i595;
        xg = i594;
        int i596 = i593 + 3;
        e5 = i596;
        yg = i595;
        int i597 = i593 + 4;
        e5 = i597;
        zg = i596;
        int i598 = i593 + 5;
        e5 = i598;
        Ag = i597;
        int i599 = i593 + 6;
        e5 = i599;
        Bg = i598;
        int i600 = i593 + 7;
        e5 = i600;
        Cg = i599;
        int i601 = i593 + 8;
        e5 = i601;
        Dg = i600;
        int i602 = i593 + 9;
        e5 = i602;
        Eg = i601;
        int i603 = i593 + 10;
        e5 = i603;
        Fg = i602;
        int i604 = i593 + 11;
        e5 = i604;
        Gg = i603;
        int i605 = i593 + 12;
        e5 = i605;
        Hg = i604;
        int i606 = i593 + 13;
        e5 = i606;
        Ig = i605;
        int i607 = i593 + 14;
        e5 = i607;
        Jg = i606;
        int i608 = i593 + 15;
        e5 = i608;
        Kg = i607;
        int i609 = i593 + 16;
        e5 = i609;
        Lg = i608;
        int i610 = i593 + 17;
        e5 = i610;
        Mg = i609;
        int i611 = i593 + 18;
        e5 = i611;
        Ng = i610;
        int i612 = i593 + 19;
        e5 = i612;
        Og = i611;
        int i613 = i593 + 20;
        e5 = i613;
        Pg = i612;
        int i614 = i593 + 21;
        e5 = i614;
        Qg = i613;
        int i615 = i593 + 22;
        e5 = i615;
        Rg = i614;
        int i616 = i593 + 23;
        e5 = i616;
        Sg = i615;
        int i617 = i593 + 24;
        e5 = i617;
        Tg = i616;
        int i618 = i593 + 25;
        e5 = i618;
        Ug = i617;
        int i619 = i593 + 26;
        e5 = i619;
        Vg = i618;
        int i620 = i593 + 27;
        e5 = i620;
        Wg = i619;
        int i621 = i593 + 28;
        e5 = i621;
        Xg = i620;
        int i622 = i593 + 29;
        e5 = i622;
        Yg = i621;
        int i623 = i593 + 30;
        e5 = i623;
        Zg = i622;
        int i624 = i593 + 31;
        e5 = i624;
        ah = i623;
        int i625 = i593 + 32;
        e5 = i625;
        bh = i624;
        int i626 = i593 + 33;
        e5 = i626;
        ch = i625;
        int i627 = i593 + 34;
        e5 = i627;
        dh = i626;
        int i628 = i593 + 35;
        e5 = i628;
        eh = i627;
        int i629 = i593 + 36;
        e5 = i629;
        fh = i628;
        int i630 = i593 + 37;
        e5 = i630;
        gh = i629;
        int i631 = i593 + 38;
        e5 = i631;
        hh = i630;
        int i632 = i593 + 39;
        e5 = i632;
        ih = i631;
        int i633 = i593 + 40;
        e5 = i633;
        jh = i632;
        int i634 = i593 + 41;
        e5 = i634;
        kh = i633;
        int i635 = i593 + 42;
        e5 = i635;
        lh = i634;
        int i636 = i593 + 43;
        e5 = i636;
        mh = i635;
        int i637 = i593 + 44;
        e5 = i637;
        nh = i636;
        int i638 = i593 + 45;
        e5 = i638;
        oh = i637;
        int i639 = i593 + 46;
        e5 = i639;
        ph = i638;
        int i640 = i593 + 47;
        e5 = i640;
        qh = i639;
        int i641 = i593 + 48;
        e5 = i641;
        rh = i640;
        e5 = i593 + 49;
        sh = i641;
        int i642 = e5;
        int i643 = i642 + 1;
        e5 = i643;
        th = i642;
        int i644 = i642 + 2;
        e5 = i644;
        uh = i643;
        int i645 = i642 + 3;
        e5 = i645;
        vh = i644;
        int i646 = i642 + 4;
        e5 = i646;
        wh = i645;
        int i647 = i642 + 5;
        e5 = i647;
        xh = i646;
        int i648 = i642 + 6;
        e5 = i648;
        yh = i647;
        int i649 = i642 + 7;
        e5 = i649;
        zh = i648;
        int i650 = i642 + 8;
        e5 = i650;
        Ah = i649;
        int i651 = i642 + 9;
        e5 = i651;
        Bh = i650;
        int i652 = i642 + 10;
        e5 = i652;
        Ch = i651;
        int i653 = i642 + 11;
        e5 = i653;
        Dh = i652;
        int i654 = i642 + 12;
        e5 = i654;
        Eh = i653;
        int i655 = i642 + 13;
        e5 = i655;
        Fh = i654;
        int i656 = i642 + 14;
        e5 = i656;
        Gh = i655;
        int i657 = i642 + 15;
        e5 = i657;
        Hh = i656;
        int i658 = i642 + 16;
        e5 = i658;
        Ih = i657;
        int i659 = i642 + 17;
        e5 = i659;
        Jh = i658;
        int i660 = i642 + 18;
        e5 = i660;
        Kh = i659;
        int i661 = i642 + 19;
        e5 = i661;
        Lh = i660;
        int i662 = i642 + 20;
        e5 = i662;
        Mh = i661;
        int i663 = i642 + 21;
        e5 = i663;
        Nh = i662;
        int i664 = i642 + 22;
        e5 = i664;
        Oh = i663;
        int i665 = i642 + 23;
        e5 = i665;
        Ph = i664;
        int i666 = i642 + 24;
        e5 = i666;
        Qh = i665;
        int i667 = i642 + 25;
        e5 = i667;
        Rh = i666;
        int i668 = i642 + 26;
        e5 = i668;
        Sh = i667;
        int i669 = i642 + 27;
        e5 = i669;
        Th = i668;
        int i670 = i642 + 28;
        e5 = i670;
        Uh = i669;
        int i671 = i642 + 29;
        e5 = i671;
        Vh = i670;
        int i672 = i642 + 30;
        e5 = i672;
        Wh = i671;
        int i673 = i642 + 31;
        e5 = i673;
        Xh = i672;
        int i674 = i642 + 32;
        e5 = i674;
        Yh = i673;
        int i675 = i642 + 33;
        e5 = i675;
        Zh = i674;
        int i676 = i642 + 34;
        e5 = i676;
        ai = i675;
        int i677 = i642 + 35;
        e5 = i677;
        bi = i676;
        int i678 = i642 + 36;
        e5 = i678;
        ci = i677;
        int i679 = i642 + 37;
        e5 = i679;
        di = i678;
        int i680 = i642 + 38;
        e5 = i680;
        ei = i679;
        int i681 = i642 + 39;
        e5 = i681;
        fi = i680;
        int i682 = i642 + 40;
        e5 = i682;
        gi = i681;
        int i683 = i642 + 41;
        e5 = i683;
        hi = i682;
        int i684 = i642 + 42;
        e5 = i684;
        ii = i683;
        int i685 = i642 + 43;
        e5 = i685;
        ji = i684;
        int i686 = i642 + 44;
        e5 = i686;
        ki = i685;
        int i687 = i642 + 45;
        e5 = i687;
        li = i686;
        int i688 = i642 + 46;
        e5 = i688;
        mi = i687;
        int i689 = i642 + 47;
        e5 = i689;
        ni = i688;
        int i690 = i642 + 48;
        e5 = i690;
        oi = i689;
        e5 = i642 + 49;
        pi = i690;
        int i691 = e5;
        int i692 = i691 + 1;
        e5 = i692;
        qi = i691;
        int i693 = i691 + 2;
        e5 = i693;
        ri = i692;
        int i694 = i691 + 3;
        e5 = i694;
        si = i693;
        int i695 = i691 + 4;
        e5 = i695;
        ti = i694;
        int i696 = i691 + 5;
        e5 = i696;
        ui = i695;
        int i697 = i691 + 6;
        e5 = i697;
        vi = i696;
        int i698 = i691 + 7;
        e5 = i698;
        wi = i697;
        int i699 = i691 + 8;
        e5 = i699;
        xi = i698;
        int i700 = i691 + 9;
        e5 = i700;
        yi = i699;
        int i701 = i691 + 10;
        e5 = i701;
        zi = i700;
        int i702 = i691 + 11;
        e5 = i702;
        Ai = i701;
        int i703 = i691 + 12;
        e5 = i703;
        Bi = i702;
        int i704 = i691 + 13;
        e5 = i704;
        Ci = i703;
        int i705 = i691 + 14;
        e5 = i705;
        Di = i704;
        int i706 = i691 + 15;
        e5 = i706;
        Ei = i705;
        int i707 = i691 + 16;
        e5 = i707;
        Fi = i706;
        int i708 = i691 + 17;
        e5 = i708;
        Gi = i707;
        int i709 = i691 + 18;
        e5 = i709;
        Hi = i708;
        int i710 = i691 + 19;
        e5 = i710;
        Ii = i709;
        int i711 = i691 + 20;
        e5 = i711;
        Ji = i710;
        int i712 = i691 + 21;
        e5 = i712;
        Ki = i711;
        int i713 = i691 + 22;
        e5 = i713;
        Li = i712;
        int i714 = i691 + 23;
        e5 = i714;
        Mi = i713;
        int i715 = i691 + 24;
        e5 = i715;
        Ni = i714;
        int i716 = i691 + 25;
        e5 = i716;
        Oi = i715;
        int i717 = i691 + 26;
        e5 = i717;
        Pi = i716;
        int i718 = i691 + 27;
        e5 = i718;
        Qi = i717;
        int i719 = i691 + 28;
        e5 = i719;
        Ri = i718;
        int i720 = i691 + 29;
        e5 = i720;
        Si = i719;
        int i721 = i691 + 30;
        e5 = i721;
        Ti = i720;
        int i722 = i691 + 31;
        e5 = i722;
        Ui = i721;
        int i723 = i691 + 32;
        e5 = i723;
        Vi = i722;
        int i724 = i691 + 33;
        e5 = i724;
        Wi = i723;
        int i725 = i691 + 34;
        e5 = i725;
        Xi = i724;
        int i726 = i691 + 35;
        e5 = i726;
        Yi = i725;
        int i727 = i691 + 36;
        e5 = i727;
        Zi = i726;
        int i728 = i691 + 37;
        e5 = i728;
        aj = i727;
        int i729 = i691 + 38;
        e5 = i729;
        bj = i728;
        int i730 = i691 + 39;
        e5 = i730;
        cj = i729;
        int i731 = i691 + 40;
        e5 = i731;
        dj = i730;
        int i732 = i691 + 41;
        e5 = i732;
        ej = i731;
        int i733 = i691 + 42;
        e5 = i733;
        fj = i732;
        int i734 = i691 + 43;
        e5 = i734;
        gj = i733;
        int i735 = i691 + 44;
        e5 = i735;
        hj = i734;
        int i736 = i691 + 45;
        e5 = i736;
        ij = i735;
        int i737 = i691 + 46;
        e5 = i737;
        jj = i736;
        int i738 = i691 + 47;
        e5 = i738;
        kj = i737;
        int i739 = i691 + 48;
        e5 = i739;
        lj = i738;
        e5 = i691 + 49;
        mj = i739;
        int i740 = e5;
        int i741 = i740 + 1;
        e5 = i741;
        nj = i740;
        int i742 = i740 + 2;
        e5 = i742;
        oj = i741;
        int i743 = i740 + 3;
        e5 = i743;
        pj = i742;
        int i744 = i740 + 4;
        e5 = i744;
        qj = i743;
        int i745 = i740 + 5;
        e5 = i745;
        rj = i744;
        int i746 = i740 + 6;
        e5 = i746;
        sj = i745;
        int i747 = i740 + 7;
        e5 = i747;
        tj = i746;
        int i748 = i740 + 8;
        e5 = i748;
        uj = i747;
        int i749 = i740 + 9;
        e5 = i749;
        vj = i748;
        int i750 = i740 + 10;
        e5 = i750;
        wj = i749;
        int i751 = i740 + 11;
        e5 = i751;
        xj = i750;
        int i752 = i740 + 12;
        e5 = i752;
        yj = i751;
        int i753 = i740 + 13;
        e5 = i753;
        zj = i752;
        int i754 = i740 + 14;
        e5 = i754;
        Aj = i753;
        int i755 = i740 + 15;
        e5 = i755;
        Bj = i754;
        int i756 = i740 + 16;
        e5 = i756;
        Cj = i755;
        int i757 = i740 + 17;
        e5 = i757;
        Dj = i756;
        int i758 = i740 + 18;
        e5 = i758;
        Ej = i757;
        int i759 = i740 + 19;
        e5 = i759;
        Fj = i758;
        int i760 = i740 + 20;
        e5 = i760;
        Gj = i759;
        int i761 = i740 + 21;
        e5 = i761;
        Hj = i760;
        int i762 = i740 + 22;
        e5 = i762;
        Ij = i761;
        int i763 = i740 + 23;
        e5 = i763;
        Jj = i762;
        int i764 = i740 + 24;
        e5 = i764;
        Kj = i763;
        int i765 = i740 + 25;
        e5 = i765;
        Lj = i764;
        int i766 = i740 + 26;
        e5 = i766;
        Mj = i765;
        int i767 = i740 + 27;
        e5 = i767;
        Nj = i766;
        int i768 = i740 + 28;
        e5 = i768;
        Oj = i767;
        int i769 = i740 + 29;
        e5 = i769;
        Pj = i768;
        int i770 = i740 + 30;
        e5 = i770;
        Qj = i769;
        int i771 = i740 + 31;
        e5 = i771;
        Rj = i770;
        int i772 = i740 + 32;
        e5 = i772;
        Sj = i771;
        int i773 = i740 + 33;
        e5 = i773;
        Tj = i772;
        int i774 = i740 + 34;
        e5 = i774;
        Uj = i773;
        int i775 = i740 + 35;
        e5 = i775;
        Vj = i774;
        int i776 = i740 + 36;
        e5 = i776;
        Wj = i775;
        int i777 = i740 + 37;
        e5 = i777;
        Xj = i776;
        int i778 = i740 + 38;
        e5 = i778;
        Yj = i777;
        int i779 = i740 + 39;
        e5 = i779;
        Zj = i778;
        int i780 = i740 + 40;
        e5 = i780;
        ak = i779;
        int i781 = i740 + 41;
        e5 = i781;
        bk = i780;
        int i782 = i740 + 42;
        e5 = i782;
        ck = i781;
        int i783 = i740 + 43;
        e5 = i783;
        dk = i782;
        int i784 = i740 + 44;
        e5 = i784;
        ek = i783;
        int i785 = i740 + 45;
        e5 = i785;
        fk = i784;
        int i786 = i740 + 46;
        e5 = i786;
        gk = i785;
        int i787 = i740 + 47;
        e5 = i787;
        hk = i786;
        int i788 = i740 + 48;
        e5 = i788;
        ik = i787;
        e5 = i740 + 49;
        jk = i788;
        int i789 = e5;
        int i790 = i789 + 1;
        e5 = i790;
        kk = i789;
        int i791 = i789 + 2;
        e5 = i791;
        lk = i790;
        int i792 = i789 + 3;
        e5 = i792;
        mk = i791;
        int i793 = i789 + 4;
        e5 = i793;
        nk = i792;
        int i794 = i789 + 5;
        e5 = i794;
        ok = i793;
        int i795 = i789 + 6;
        e5 = i795;
        pk = i794;
        int i796 = i789 + 7;
        e5 = i796;
        qk = i795;
        rk = new int[]{i787, i788, i789, i790, i791, i792, i793, i794, i795};
        int i797 = i789 + 8;
        e5 = i797;
        sk = i796;
        int i798 = i789 + 9;
        e5 = i798;
        tk = i797;
        int i799 = i789 + 10;
        e5 = i799;
        uk = i798;
        int i800 = i789 + 11;
        e5 = i800;
        vk = i799;
        int i801 = i789 + 12;
        e5 = i801;
        wk = i800;
        int i802 = i789 + 13;
        e5 = i802;
        xk = i801;
        int i803 = i789 + 14;
        e5 = i803;
        yk = i802;
        int i804 = i789 + 15;
        e5 = i804;
        zk = i803;
        int i805 = i789 + 16;
        e5 = i805;
        Ak = i804;
        int i806 = i789 + 17;
        e5 = i806;
        Bk = i805;
        int i807 = i789 + 18;
        e5 = i807;
        Ck = i806;
        int i808 = i789 + 19;
        e5 = i808;
        Dk = i807;
        int i809 = i789 + 20;
        e5 = i809;
        Ek = i808;
        int i810 = i789 + 21;
        e5 = i810;
        Fk = i809;
        int i811 = i789 + 22;
        e5 = i811;
        Gk = i810;
        int i812 = i789 + 23;
        e5 = i812;
        Hk = i811;
        int i813 = i789 + 24;
        e5 = i813;
        Ik = i812;
        int i814 = i789 + 25;
        e5 = i814;
        Jk = i813;
        int i815 = i789 + 26;
        e5 = i815;
        Kk = i814;
        int i816 = i789 + 27;
        e5 = i816;
        Lk = i815;
        int i817 = i789 + 28;
        e5 = i817;
        Mk = i816;
        int i818 = i789 + 29;
        e5 = i818;
        Nk = i817;
        int i819 = i789 + 30;
        e5 = i819;
        Ok = i818;
        int i820 = i789 + 31;
        e5 = i820;
        Pk = i819;
        int i821 = i789 + 32;
        e5 = i821;
        Qk = i820;
        int i822 = i789 + 33;
        e5 = i822;
        Rk = i821;
        int i823 = i789 + 34;
        e5 = i823;
        Sk = i822;
        int i824 = i789 + 35;
        e5 = i824;
        Tk = i823;
        int i825 = i789 + 36;
        e5 = i825;
        Uk = i824;
        int i826 = i789 + 37;
        e5 = i826;
        Vk = i825;
        int i827 = i789 + 38;
        e5 = i827;
        Wk = i826;
        int i828 = i789 + 39;
        e5 = i828;
        Xk = i827;
        int i829 = i789 + 40;
        e5 = i829;
        Yk = i828;
        int i830 = i789 + 41;
        e5 = i830;
        Zk = i829;
        int i831 = i789 + 42;
        e5 = i831;
        al = i830;
        int i832 = i789 + 43;
        e5 = i832;
        bl = i831;
        int i833 = i789 + 44;
        e5 = i833;
        cl = i832;
        int i834 = i789 + 45;
        e5 = i834;
        dl = i833;
        int i835 = i789 + 46;
        e5 = i835;
        el = i834;
        int i836 = i789 + 47;
        e5 = i836;
        fl = i835;
        e5 = i789 + 48;
        gl = i836;
        int i837 = e5;
        int i838 = i837 + 1;
        e5 = i838;
        hl = i837;
        int i839 = i837 + 2;
        e5 = i839;
        il = i838;
        int i840 = i837 + 3;
        e5 = i840;
        jl = i839;
        int i841 = i837 + 4;
        e5 = i841;
        kl = i840;
        int i842 = i837 + 5;
        e5 = i842;
        ll = i841;
        int i843 = i837 + 6;
        e5 = i843;
        ml = i842;
        int i844 = i837 + 7;
        e5 = i844;
        nl = i843;
        int i845 = i837 + 8;
        e5 = i845;
        ol = i844;
        int i846 = i837 + 9;
        e5 = i846;
        pl = i845;
        int i847 = i837 + 10;
        e5 = i847;
        ql = i846;
        int i848 = i837 + 11;
        e5 = i848;
        rl = i847;
        int i849 = i837 + 12;
        e5 = i849;
        sl = i848;
        int i850 = i837 + 13;
        e5 = i850;
        tl = i849;
        int i851 = i837 + 14;
        e5 = i851;
        ul = i850;
        int i852 = i837 + 15;
        e5 = i852;
        vl = i851;
        int i853 = i837 + 16;
        e5 = i853;
        wl = i852;
        xl = new int[]{i842};
        int i854 = i837 + 17;
        e5 = i854;
        yl = i853;
        int i855 = i837 + 18;
        e5 = i855;
        zl = i854;
        int i856 = i837 + 19;
        e5 = i856;
        Al = i855;
        int i857 = i837 + 20;
        e5 = i857;
        Bl = i856;
        int i858 = i837 + 21;
        e5 = i858;
        Cl = i857;
        int i859 = i837 + 22;
        e5 = i859;
        Dl = i858;
        int i860 = i837 + 23;
        e5 = i860;
        El = i859;
        int i861 = i837 + 24;
        e5 = i861;
        Fl = i860;
        int i862 = i837 + 25;
        e5 = i862;
        Gl = i861;
        int i863 = i837 + 26;
        e5 = i863;
        Hl = i862;
        int i864 = i837 + 27;
        e5 = i864;
        Il = i863;
        int i865 = i837 + 28;
        e5 = i865;
        Jl = i864;
        int i866 = i837 + 29;
        e5 = i866;
        Kl = i865;
        int i867 = i837 + 30;
        e5 = i867;
        Ll = i866;
        int i868 = i837 + 31;
        e5 = i868;
        Ml = i867;
        int i869 = i837 + 32;
        e5 = i869;
        Nl = i868;
        int i870 = i837 + 33;
        e5 = i870;
        Ol = i869;
        int i871 = i837 + 34;
        e5 = i871;
        Pl = i870;
        int i872 = i837 + 35;
        e5 = i872;
        Ql = i871;
        int i873 = i837 + 36;
        e5 = i873;
        Rl = i872;
        int i874 = i837 + 37;
        e5 = i874;
        Sl = i873;
        int i875 = i837 + 38;
        e5 = i875;
        Tl = i874;
        int i876 = i837 + 39;
        e5 = i876;
        Ul = i875;
        int i877 = i837 + 40;
        e5 = i877;
        Vl = i876;
        int i878 = i837 + 41;
        e5 = i878;
        Wl = i877;
        int i879 = i837 + 42;
        e5 = i879;
        Xl = i878;
        int i880 = i837 + 43;
        e5 = i880;
        Yl = i879;
        int i881 = i837 + 44;
        e5 = i881;
        Zl = i880;
        int i882 = i837 + 45;
        e5 = i882;
        am = i881;
        e5 = i837 + 46;
        bm = i882;
        cm = new HashMap();
        dm = new HashMap();
        em = new HashMap();
        fm = new HashMap();
        SparseIntArray sparseIntArray = new SparseIntArray();
        hm = sparseIntArray;
        im = new HashSet();
        nm = new ThreadLocal();
        om = new ThreadLocal();
        pm = new ThreadLocal();
        qm = new ThreadLocal();
        rm = new ThreadLocal();
        gm = lve.b();
        int i883 = c6;
        sparseIntArray.put(i860, i883);
        int i884 = Z6;
        sparseIntArray.put(i861, i884);
        sparseIntArray.put(i863, i884);
        sparseIntArray.put(Aj, Si);
        sparseIntArray.put(Cj, p7);
        sparseIntArray.put(Za, sc);
        int i885 = Ei;
        sparseIntArray.put(i862, i885);
        sparseIntArray.put(Fi, i885);
        sparseIntArray.put(a6, i884);
        int i886 = b6;
        int i887 = y6;
        sparseIntArray.put(i886, i887);
        sparseIntArray.put(Id, Gi);
        int i888 = Jd;
        int i889 = Qb;
        sparseIntArray.put(i888, i889);
        sparseIntArray.put(Rb, i889);
        sparseIntArray.put(be, de);
        sparseIntArray.put(ce, ee);
        sparseIntArray.put(Kj, Jj);
        sparseIntArray.put(le, ke);
        sparseIntArray.put(nc, mc);
        sparseIntArray.put(zf, Gf);
        sparseIntArray.put(gj, dj);
        sparseIntArray.put(Mi, i885);
        sparseIntArray.put(e7, i887);
        sparseIntArray.put(kd, qa);
        sparseIntArray.put(ta, i883);
        sparseIntArray.put(Fb, qb);
        sparseIntArray.put(ld, Tc);
        sparseIntArray.put(Gb, rb);
        SparseIntArray sparseIntArray2 = hm;
        sparseIntArray2.put(L5, i884);
        sparseIntArray2.put(M5, H9);
        sparseIntArray2.put(Ti, N9);
        sparseIntArray2.put(Bi, i884);
        sparseIntArray2.put(na, ja);
        sparseIntArray2.put(S8, m6);
        int i890 = t6;
        int i891 = H6;
        sparseIntArray2.put(i890, i891);
        sparseIntArray2.put(u6, i891);
        sparseIntArray2.put(vj, gg);
        int i892 = wj;
        int i893 = fg;
        sparseIntArray2.put(i892, i893);
        sparseIntArray2.put(xj, i893);
        int i894 = d6;
        int i895 = c6;
        sparseIntArray2.put(i894, i895);
        sparseIntArray2.put(e6, i895);
        sparseIntArray2.put(N6, L6);
        sparseIntArray2.put(O6, M6);
        sparseIntArray2.put(P6, i895);
        sparseIntArray2.put(Q6, i895);
        sparseIntArray2.put(f6, i895);
        sparseIntArray2.put(G7, A7);
        sparseIntArray2.put(H7, B7);
        int i896 = R6;
        int i897 = h6;
        sparseIntArray2.put(i896, i897);
        sparseIntArray2.put(S6, i897);
        sparseIntArray2.put(i6, i897);
        int i898 = Ef;
        int i899 = Df;
        sparseIntArray2.put(i898, i899);
        sparseIntArray2.put(Af, i899);
        sparseIntArray2.put(Lf, p6);
        sparseIntArray2.put(Hf, Ff);
        int i900 = yj;
        int i901 = Gf;
        sparseIntArray2.put(i900, i901);
        sparseIntArray2.put(zj, Gj);
        sparseIntArray2.put(N5, i901);
        sparseIntArray2.put(O5, i899);
        SparseIntArray sparseIntArray3 = hm;
        sparseIntArray3.put(P5, i899);
        int i902 = Q5;
        int i903 = F6;
        sparseIntArray3.put(i902, i903);
        sparseIntArray3.put(nb, nf);
        sparseIntArray3.put(ob, i903);
        int i904 = R5;
        int i905 = A5;
        sparseIntArray3.put(i904, i905);
        sparseIntArray3.put(S5, i905);
        sparseIntArray3.put(T5, B5);
        sparseIntArray3.put(U5, Bf);
        sparseIntArray3.put(L8, r8);
        int i906 = M8;
        int i907 = s8;
        sparseIntArray3.put(i906, i907);
        sparseIntArray3.put(N8, u8);
        sparseIntArray3.put(O8, i903);
        sparseIntArray3.put(P8, B8);
        sparseIntArray3.put(Q8, C8);
        int i908 = h9;
        int i909 = f9;
        sparseIntArray3.put(i908, i909);
        int i910 = l9;
        int i911 = j9;
        sparseIntArray3.put(i910, i911);
        sparseIntArray3.put(X8, W8);
        sparseIntArray3.put(k9, i911);
        sparseIntArray3.put(m9, i911);
        sparseIntArray3.put(g9, i909);
        int i912 = L7;
        int i913 = U8;
        sparseIntArray3.put(i912, i913);
        int i914 = b9;
        int i915 = O9;
        sparseIntArray3.put(i914, i915);
        sparseIntArray3.put(c9, i913);
        int i916 = d9;
        int i917 = N9;
        sparseIntArray3.put(i916, i917);
        sparseIntArray3.put(e9, i917);
        sparseIntArray3.put(E8, I5);
        sparseIntArray3.put(i7, i913);
        int i918 = oa;
        int i919 = A8;
        sparseIntArray3.put(i918, i919);
        int i920 = pa;
        int i921 = tj;
        sparseIntArray3.put(i920, i921);
        sparseIntArray3.put(yb, i921);
        SparseIntArray sparseIntArray4 = hm;
        int i922 = H8;
        int i923 = z8;
        sparseIntArray4.put(i922, i923);
        sparseIntArray4.put(I8, i919);
        sparseIntArray4.put(J8, i923);
        sparseIntArray4.put(K8, i907);
        sparseIntArray4.put(ri, g8);
        sparseIntArray4.put(L9, d8);
        sparseIntArray4.put(Cc, Be);
        sparseIntArray4.put(G8, Z6);
        int i924 = Z9;
        int i925 = i5;
        sparseIntArray4.put(i924, i925);
        sparseIntArray4.put(aa, vd);
        sparseIntArray4.put(ba, i925);
        sparseIntArray4.put(ca, b7);
        sparseIntArray4.put(R8, r8);
        sparseIntArray4.put(u9, t9);
        sparseIntArray4.put(Bb, zb);
        sparseIntArray4.put(Cb, Ab);
        sparseIntArray4.put(Q9, i913);
        sparseIntArray4.put(R9, i915);
        sparseIntArray4.put(M7, J7);
        sparseIntArray4.put(Hi, Gi);
        int i926 = V5;
        int i927 = Ij;
        sparseIntArray4.put(i926, i927);
        sparseIntArray4.put(W5, i927);
        sparseIntArray4.put(kj, i925);
        int i928 = lj;
        int i929 = s6;
        sparseIntArray4.put(i928, i929);
        sparseIntArray4.put(mj, g5);
        sparseIntArray4.put(nj, h5);
        sparseIntArray4.put(ej, i929);
        sparseIntArray4.put(hj, v6);
        int i930 = Lc;
        int i931 = Ce;
        sparseIntArray4.put(i930, i931);
        SparseIntArray sparseIntArray5 = hm;
        sparseIntArray5.put(kg, i931);
        int i932 = lg;
        sparseIntArray5.put(i932, Me);
        sparseIntArray5.put(Mc, i932);
        int i933 = da;
        int i934 = ma;
        sparseIntArray5.put(i933, i934);
        sparseIntArray5.put(ea, i934);
        int i935 = fa;
        int i936 = ja;
        sparseIntArray5.put(i935, i936);
        sparseIntArray5.put(ga, i936);
        sparseIntArray5.put(pg, R5);
        sparseIntArray5.put(V9, A5);
        sparseIntArray5.put(n7, l6);
        sparseIntArray5.put(ui, x6);
        int i937 = vi;
        int i938 = K6;
        sparseIntArray5.put(i937, i938);
        sparseIntArray5.put(wi, i938);
        sparseIntArray5.put(xi, h6);
        sparseIntArray5.put(la, ka);
        int i939 = Fd;
        int i940 = k8;
        sparseIntArray5.put(i939, i940);
        sparseIntArray5.put(Pc, i940);
        sparseIntArray5.put(ec, ic);
        sparseIntArray5.put(fc, dc);
        int i941 = y7;
        int i942 = c6;
        sparseIntArray5.put(i941, i942);
        int i943 = X5;
        int i944 = N7;
        sparseIntArray5.put(i943, i944);
        sparseIntArray5.put(sk, Ye);
        sparseIntArray5.put(Ic, Dc);
        sparseIntArray5.put(xk, qb);
        sparseIntArray5.put(yk, Vc);
        int i945 = uk;
        sparseIntArray5.put(i945, Ad);
        sparseIntArray5.put(tk, Nb);
        sparseIntArray5.put(vk, i942);
        SparseIntArray sparseIntArray6 = hm;
        sparseIntArray6.put(wk, i942);
        sparseIntArray6.put(Y5, Zh);
        sparseIntArray6.put(Tk, T8);
        sparseIntArray6.put(Uk, f9);
        sparseIntArray6.put(K7, J7);
        sparseIntArray6.put(U7, i944);
        sparseIntArray6.put(V7, O7);
        sparseIntArray6.put(W7, P7);
        sparseIntArray6.put(X7, Q7);
        sparseIntArray6.put(Y7, R7);
        sparseIntArray6.put(Z7, S7);
        sparseIntArray6.put(a8, T7);
        sparseIntArray6.put(q9, p9);
        sparseIntArray6.put(dk, nk);
        sparseIntArray6.put(Xj, jk);
        sparseIntArray6.put(Zj, mk);
        sparseIntArray6.put(bk, ik);
        sparseIntArray6.put(ak, ok);
        int i946 = fk;
        int i947 = pk;
        sparseIntArray6.put(i946, i947);
        sparseIntArray6.put(ek, i947);
        sparseIntArray6.put(gk, qk);
        int i948 = kb;
        int i949 = Z6;
        sparseIntArray6.put(i948, i949);
        sparseIntArray6.put(lb, i945);
        int i950 = fi;
        sparseIntArray6.put(i950, d7);
        int i951 = gi;
        int i952 = c7;
        sparseIntArray6.put(i951, i952);
        sparseIntArray6.put(hl, i950);
        int i953 = il;
        int i954 = gl;
        sparseIntArray6.put(i953, i954);
        SparseIntArray sparseIntArray7 = hm;
        sparseIntArray7.put(jl, i951);
        sparseIntArray7.put(kl, i951);
        sparseIntArray7.put(ol, i954);
        int i955 = Ll;
        int i956 = F6;
        sparseIntArray7.put(i955, i956);
        sparseIntArray7.put(Kl, i949);
        sparseIntArray7.put(Jl, i956);
        sparseIntArray7.put(Ml, Ne);
        sparseIntArray7.put(Nl, Ke);
        int i957 = Ol;
        int i958 = g5;
        sparseIntArray7.put(i957, i958);
        sparseIntArray7.put(Pl, i958);
        int i959 = Ql;
        int i960 = Oe;
        sparseIntArray7.put(i959, i960);
        sparseIntArray7.put(Rl, i960);
        sparseIntArray7.put(Sl, i956);
        sparseIntArray7.put(z8, i956);
        sparseIntArray7.put(Wl, i956);
        sparseIntArray7.put(li, i956);
        sparseIntArray7.put(Xl, i960);
        int i961 = Yl;
        sparseIntArray7.put(i961, p6);
        sparseIntArray7.put(Zl, h5);
        sparseIntArray7.put(am, i952);
        sparseIntArray7.put(bm, kk);
        sparseIntArray7.put(sg, Uc);
        int i962 = tg;
        int i963 = Ei;
        sparseIntArray7.put(i962, i963);
        int i964 = ug;
        int i965 = Gi;
        sparseIntArray7.put(i964, i965);
        int i966 = vg;
        int i967 = Ii;
        sparseIntArray7.put(i966, i967);
        int i968 = yg;
        int i969 = h8;
        sparseIntArray7.put(i968, i969);
        int i970 = Bg;
        int i971 = k8;
        sparseIntArray7.put(i970, i971);
        sparseIntArray7.put(Eg, i961);
        sparseIntArray7.put(Hg, Vc);
        sparseIntArray7.put(Ig, i963);
        sparseIntArray7.put(Jg, i965);
        sparseIntArray7.put(Kg, i967);
        sparseIntArray7.put(Ng, i969);
        sparseIntArray7.put(Qg, i971);
        hm.put(Tg, i961);
        int i972 = 0;
        while (true) {
            int[] iArr = o8;
            if (i972 >= iArr.length) {
                break;
            }
            im.add(Integer.valueOf(iArr[i972]));
            i972++;
        }
        int i973 = 0;
        while (true) {
            int[] iArr2 = p8;
            if (i973 >= iArr2.length) {
                break;
            }
            im.add(Integer.valueOf(iArr2[i973]));
            i973++;
        }
        int i974 = 0;
        while (true) {
            int[] iArr3 = q8;
            if (i974 >= iArr3.length) {
                break;
            }
            im.add(Integer.valueOf(iArr3[i974]));
            i974++;
        }
        int i975 = 0;
        while (true) {
            int[] iArr4 = rk;
            int length = iArr4.length;
            hashSet = im;
            if (i975 >= length) {
                break;
            }
            hashSet.add(Integer.valueOf(iArr4[i975]));
            i975++;
        }
        hashSet.add(Integer.valueOf(ia));
        hashSet.add(Integer.valueOf(Xj));
        hashSet.add(Integer.valueOf(Yj));
        hashSet.add(Integer.valueOf(Zj));
        hashSet.add(Integer.valueOf(ak));
        hashSet.add(Integer.valueOf(bk));
        hashSet.add(Integer.valueOf(ck));
        hashSet.add(Integer.valueOf(dk));
        hashSet.add(Integer.valueOf(ek));
        hashSet.add(Integer.valueOf(fl));
        hashSet.add(Integer.valueOf(hl));
        hashSet.add(Integer.valueOf(il));
        hashSet.add(Integer.valueOf(jl));
        hashSet.add(Integer.valueOf(kl));
        hashSet.add(Integer.valueOf(ll));
        hashSet.add(Integer.valueOf(nl));
        hashSet.add(Integer.valueOf(ol));
        hashSet.add(Integer.valueOf(pl));
        hashSet.add(Integer.valueOf(ql));
        hashSet.add(Integer.valueOf(rl));
        hashSet.add(Integer.valueOf(sl));
        hashSet.add(Integer.valueOf(tl));
        hashSet.add(Integer.valueOf(ul));
        hashSet.add(Integer.valueOf(vl));
        hashSet.add(Integer.valueOf(wl));
        hashSet.add(Integer.valueOf(mh));
        hashSet.add(Integer.valueOf(vh));
        hashSet.add(Integer.valueOf(wh));
        hashSet.add(Integer.valueOf(xh));
        hashSet.add(Integer.valueOf(Ih));
        hashSet.add(Integer.valueOf(Gh));
        hashSet.add(Integer.valueOf(Hh));
        hashSet.add(Integer.valueOf(lh));
        hashSet.add(Integer.valueOf(Fh));
        hashSet.add(Integer.valueOf(nh));
        hashSet.add(Integer.valueOf(oh));
        hashSet.add(Integer.valueOf(ph));
        hashSet.add(Integer.valueOf(qh));
        hashSet.add(Integer.valueOf(rh));
        hashSet.add(Integer.valueOf(sh));
        hashSet.add(Integer.valueOf(th));
        hashSet.add(Integer.valueOf(uh));
        hashSet.add(Integer.valueOf(Eh));
        hashSet.add(Integer.valueOf(Ah));
        hashSet.add(Integer.valueOf(Bh));
        hashSet.add(Integer.valueOf(Ch));
        hashSet.add(Integer.valueOf(Dh));
        hashSet.add(Integer.valueOf(yh));
        hashSet.add(Integer.valueOf(zh));
        HashSet hashSet2 = im;
        hashSet2.add(Integer.valueOf(Zg));
        hashSet2.add(Integer.valueOf(ah));
        hashSet2.add(Integer.valueOf(bh));
        hashSet2.add(Integer.valueOf(ch));
        hashSet2.add(Integer.valueOf(Wg));
        hashSet2.add(Integer.valueOf(Xg));
        hashSet2.add(Integer.valueOf(Yg));
        hashSet2.add(Integer.valueOf(ih));
        hashSet2.add(Integer.valueOf(hh));
        hashSet2.add(Integer.valueOf(eh));
        hashSet2.add(Integer.valueOf(dh));
        hashSet2.add(Integer.valueOf(jh));
        hashSet2.add(Integer.valueOf(fh));
        hashSet2.add(Integer.valueOf(gh));
        hashSet2.add(Integer.valueOf(Ug));
        hashSet2.add(Integer.valueOf(Vg));
        hashSet2.add(Integer.valueOf(kh));
        hashSet2.add(Integer.valueOf(Jh));
        hashSet2.add(Integer.valueOf(Kh));
        hashSet2.add(Integer.valueOf(Lh));
        hashSet2.add(Integer.valueOf(Mh));
        hashSet2.add(Integer.valueOf(Nh));
        hashSet2.add(Integer.valueOf(Oh));
        hashSet2.add(Integer.valueOf(Ph));
        hashSet2.add(Integer.valueOf(Qh));
        hashSet2.add(Integer.valueOf(Rh));
        hashSet2.add(Integer.valueOf(Sh));
        hashSet2.add(Integer.valueOf(Th));
        hashSet2.add(Integer.valueOf(Uh));
        hashSet2.add(Integer.valueOf(Vh));
        hashSet2.add(Integer.valueOf(Wh));
        hashSet2.add(Integer.valueOf(Xh));
        hashSet2.add(Integer.valueOf(Yh));
        hashSet2.add(Integer.valueOf(Zh));
        hashSet2.add(Integer.valueOf(ai));
        hashSet2.add(Integer.valueOf(bi));
        hashSet2.add(Integer.valueOf(ci));
        hashSet2.add(Integer.valueOf(di));
        hashSet2.add(Integer.valueOf(ei));
        hashSet2.add(Integer.valueOf(Ak));
        hashSet2.add(Integer.valueOf(Bk));
        hashSet2.add(Integer.valueOf(Ck));
        hashSet2.add(Integer.valueOf(Dk));
        hashSet2.add(Integer.valueOf(Ek));
        hashSet2.add(Integer.valueOf(Fk));
        hashSet2.add(Integer.valueOf(Gk));
        hashSet2.add(Integer.valueOf(Hk));
        hashSet2.add(Integer.valueOf(Ik));
        hashSet2.add(Integer.valueOf(Kk));
        HashSet hashSet3 = im;
        hashSet3.add(Integer.valueOf(Lk));
        hashSet3.add(Integer.valueOf(Mk));
        hashSet3.add(Integer.valueOf(Xk));
        hashSet3.add(Integer.valueOf(Yk));
        hashSet3.add(Integer.valueOf(Zk));
        hashSet3.add(Integer.valueOf(al));
        hashSet3.add(Integer.valueOf(bl));
        hashSet3.add(Integer.valueOf(cl));
        ArrayList arrayList = new ArrayList();
        F = arrayList;
        G = new ArrayList();
        HashMap hashMap = new HashMap();
        H = hashMap;
        jm = new SparseIntArray();
        km = new SparseIntArray();
        SharedPreferences sharedPreferences = a.b.getSharedPreferences("themeconfig", 0);
        akb akbVar3 = new akb();
        akbVar3.a = "Blue";
        akbVar3.d = "bluebubbles.attheme";
        akbVar3.M = -6963476;
        akbVar3.R = -1;
        akbVar3.S = -3086593;
        akbVar3.T = true;
        akbVar3.Z = n;
        akbVar3.W = (byte) 1;
        akbVar3.t(new int[]{-10972987, -14444461, -3252606, -8428605, -14380627, -14050257, -7842636, -13464881, -12342073, -11359164, -3317869, -2981834, -8165684, -3256745, -2904512, -8681301}, new int[]{-4660851, -328756, -1572, -4108434, -3031781, -1335, -198952, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{0, -853047, -264993, 0, 0, -135756, -198730, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{0, -2104672, -937328, -2637335, -2639714, -1270157, -3428124, -6570777, -7223828, -6567550, -1793599, -1855875, -4674838, -1336199, -2900876, -6247730}, new int[]{0, -4532067, -1257580, -1524266, -1646910, -1519483, -1324823, -4138509, -4202516, -2040429, -1458474, -1256030, -3814930, -1000039, -1450082, -3485987}, new int[]{0, -1909081, -1592444, -2969879, -2439762, -1137033, -2119471, -6962197, -4857383, -4270699, -3364639, -2117514, -5000734, -1598028, -2045813, -5853742}, new int[]{0, -6371440, -1319256, -1258616, -1712961, -1186647, -1193816, -4467224, -4203544, -3023977, -1061929, -1255788, -2113811, -806526, -1715305, -3485976}, new int[]{99, 9, 10, 11, 12, 13, 14, 0, 1, 2, 3, 4, 5, 6, 7, 8}, new String[]{"", "p-pXcflrmFIBAAAAvXYQk-mCwZU", "JqSUrO0-mFIBAAAAWwTvLzoWGQI", "O-wmAfBPSFADAAAA4zINVfD_bro", "RepJ5uE_SVABAAAAr4d0YhgB850", "-Xc-np9y2VMCAAAARKr0yNNPYW0", "fqv01SQemVIBAAAApND8LDRUhRU", "fqv01SQemVIBAAAApND8LDRUhRU", "RepJ5uE_SVABAAAAr4d0YhgB850", "lp0prF8ISFAEAAAA_p385_CvG0w", "heptcj-hSVACAAAAC9RrMzOa-cs", "PllZ-bf_SFAEAAAA8crRfwZiDNg", "dhf9pceaQVACAAAAbzdVo4SCiZA", "Ujx2TFcJSVACAAAARJ4vLa50MkM", "p-pXcflrmFIBAAAAvXYQk-mCwZU", "dk_wwlghOFACAAAAfz9xrxi6euw"}, new int[]{0, kk7.J2, 45, 0, 45, kk7.J2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{0, 52, 46, 57, 45, 64, 52, 35, 36, 41, 50, 50, 35, 38, 37, 30});
        H1(akbVar3);
        L = akbVar3;
        K = akbVar3;
        arrayList.add(akbVar3);
        hashMap.put("Blue", akbVar3);
        akb akbVar4 = new akb();
        akbVar4.a = "Dark Blue";
        akbVar4.d = "darkblue.attheme";
        akbVar4.M = -10523006;
        akbVar4.R = -9009508;
        akbVar4.S = -8214301;
        akbVar4.W = (byte) 3;
        akbVar4.t(new int[]{-7177260, -9860357, -14440464, -8687151, -9848491, -14053142, -9403671, -10044691, -13203974, -12138259, -10179489, -1344335, -1142742, -6127120, -2931932, -1131212, -8417365, -13270557}, new int[]{-6464359, -10267323, -13532789, -5413850, -11898828, -13410942, -13215889, -10914461, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{-10465880, -9937588, -14983040, -6736562, -14197445, -13534568, -13144441, -10587280, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{-14213586, -15263198, -16310753, -15724781, -15853551, -16051428, -14868183, -14668758, -15854566, -15326427, -15327979, -14411490, -14345453, -14738135, -14543346, -14212843, -15263205, -15854566}, new int[]{-15659501, -14277074, -15459034, -14542297, -14735336, -15129808, -15591910, -15459810, -15260623, -15853800, -15259879, -14477540, -14674936, -15461604, -13820650, -15067635, -14605528, -15260623}, new int[]{-13951445, -15395557, -15985382, -15855853, -16050417, -15525854, -15260627, -15327189, -15788258, -14799314, -15458796, -13952727, -13754603, -14081231, -14478324, -14081004, -15197667, -15788258}, new int[]{-15330777, -15066858, -15915220, -14213847, -15262439, -15260879, -15657695, -16443625, -15459285, -15589601, -14932454, -14740451, -15002870, -15264997, -13821660, -14805234, -14605784, -15459285}, new int[]{11, 12, 13, 14, 15, 16, 17, 18, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, new String[]{"O-wmAfBPSFADAAAA4zINVfD_bro", "RepJ5uE_SVABAAAAr4d0YhgB850", "dk_wwlghOFACAAAAfz9xrxi6euw", "9LW_RcoOSVACAAAAFTk3DTyXN-M", "PllZ-bf_SFAEAAAA8crRfwZiDNg", "-Xc-np9y2VMCAAAARKr0yNNPYW0", "kO4jyq55SFABAAAA0WEpcLfahXk", "CJNyxPMgSVAEAAAAvW9sMwc51cw", "fqv01SQemVIBAAAApND8LDRUhRU", "RepJ5uE_SVABAAAAr4d0YhgB850", "CJNyxPMgSVAEAAAAvW9sMwc51cw", "9LW_RcoOSVACAAAAFTk3DTyXN-M", "9GcNVISdSVADAAAAUcw5BYjELW4", "F5oWoCs7QFACAAAAgf2bD_mg8Bw", "9ShF73d1MFIIAAAAjWnm8_ZMe8Q", "3rX-PaKbSFACAAAAEiHNvcEm6X4", "dk_wwlghOFACAAAAfz9xrxi6euw", "fqv01SQemVIBAAAApND8LDRUhRU"}, new int[]{kk7.B3, 45, kk7.B3, kk7.Q1, 45, kk7.B3, 45, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{40, 40, 31, 50, 25, 34, 35, 35, 38, 29, 24, 34, 34, 31, 29, 37, 21, 38});
        H1(akbVar4);
        arrayList.add(akbVar4);
        J = akbVar4;
        hashMap.put("Dark Blue", akbVar4);
        akb akbVar5 = new akb();
        akbVar5.a = "Arctic Blue";
        akbVar5.d = "arctic.attheme";
        akbVar5.M = -1971728;
        akbVar5.R = -1;
        akbVar5.S = -9657877;
        akbVar5.W = (byte) 5;
        akbVar5.t(new int[]{-12537374, -12472227, -3240928, -11033621, -2194124, -3382903, -13332245, -12342073, -11359164, -3317869, -2981834, -8165684, -3256745, -2904512, -8681301}, new int[]{-13525046, -14113959, -7579073, -13597229, -3581840, -8883763, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{-11616542, -9716647, -6400452, -12008744, -2592697, -4297041, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{-3808528, -2433367, -2700891, -1838093, -1120848, -1712148, -2037779, -4202261, -4005713, -1058332, -925763, -1975316, -1189672, -1318451, -2302235}, new int[]{-1510157, -4398164, -1647697, -3610898, -1130838, -1980692, -4270093, -4202261, -3415654, -1259815, -1521765, -4341268, -1127744, -1318219, -3945761}, new int[]{-4924688, -3283031, -1523567, -2494477, -1126510, -595210, -2037517, -3478548, -4661623, -927514, -796762, -2696971, -1188403, -1319735, -1577487}, new int[]{-3149585, -5714021, -1978209, -4925720, -1134713, -1718833, -3613709, -5317397, -3218014, -999207, -2116466, -4343054, -931397, -1583186, -3815718}, new int[]{9, 10, 11, 12, 13, 14, 0, 1, 2, 3, 4, 5, 6, 7, 8}, new String[]{"MIo6r0qGSFAFAAAAtL8TsDzNX60", "dhf9pceaQVACAAAAbzdVo4SCiZA", "fqv01SQemVIBAAAApND8LDRUhRU", "p-pXcflrmFIBAAAAvXYQk-mCwZU", "JqSUrO0-mFIBAAAAWwTvLzoWGQI", "F5oWoCs7QFACAAAAgf2bD_mg8Bw", "fqv01SQemVIBAAAApND8LDRUhRU", "RepJ5uE_SVABAAAAr4d0YhgB850", "PllZ-bf_SFAEAAAA8crRfwZiDNg", "pgJfpFNRSFABAAAACDT8s5sEjfc", "ptuUd96JSFACAAAATobI23sPpz0", "dhf9pceaQVACAAAAbzdVo4SCiZA", "JqSUrO0-mFIBAAAAWwTvLzoWGQI", "9iklpvIPQVABAAAAORQXKur_Eyc", "F5oWoCs7QFACAAAAgf2bD_mg8Bw"}, new int[]{kk7.l5, kk7.l5, kk7.B3, kk7.l5, 0, kk7.J2, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{50, 50, 58, 47, 46, 50, 49, 46, 51, 50, 49, 34, 54, 50, 40});
        H1(akbVar5);
        arrayList.add(akbVar5);
        hashMap.put("Arctic Blue", akbVar5);
        akb akbVar6 = new akb();
        akbVar6.a = "Day";
        akbVar6.d = "day.attheme";
        akbVar6.M = -1;
        akbVar6.R = -1315084;
        akbVar6.S = -8604930;
        akbVar6.W = (byte) 2;
        akbVar6.t(new int[]{-11099447, -3379581, -3109305, -3382174, -7963438, -11759137, -11029287, -11226775, -2506945, -3382174, -3379581, -6587438, -2649788, -8681301}, new int[]{-10125092, -9671214, -3451775, -3978678, -10711329, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{-12664362, -3642988, -2383569, -3109317, -11422261, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, null, null, new int[]{9, 10, 11, 12, 13, 0, 1, 2, 3, 4, 5, 6, 7, 8}, new String[]{"", "", "", "", "", "", "", "", "", "", "", "", "", ""}, new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
        H1(akbVar6);
        arrayList.add(akbVar6);
        hashMap.put("Day", akbVar6);
        akb akbVar7 = new akb();
        akbVar7.a = "Night";
        akbVar7.d = "night.attheme";
        akbVar7.M = -11315623;
        akbVar7.R = -9143676;
        akbVar7.S = -9067802;
        akbVar7.W = (byte) 4;
        akbVar7.t(new int[]{-9781697, -7505693, -2204034, -10913816, -2375398, -12678921, -11881005, -11880383, -2534026, -1934037, -7115558, -3128522, -1528292, -8812381}, new int[]{-7712108, -4953061, -5288081, -14258547, -9154889, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{-9939525, -5948598, -10335844, -13659747, -14054507, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{-15330532, -14806760, -15791344, -16184308, -16313063, -15921641, -15656164, -15986420, -15856883, -14871025, -16185078, -14937584, -14869736, -15855598}, new int[]{-14673881, -15724781, -15002342, -15458526, -15987697, -16184820, -16118258, -16250616, -15067624, -15527923, -14804447, -15790836, -15987960, -16316665}, new int[]{-15856877, -14608861, -15528430, -15921391, -15722209, -15197144, -15458015, -15591406, -15528431, -15068401, -16053749, -15594229, -15395825, -15724012}, new int[]{-14804694, -15658986, -14609382, -15656421, -16118509, -15855854, -16315381, -16052981, -14544354, -15791092, -15659241, -16316922, -15988214, -16185077}, new int[]{9, 10, 11, 12, 13, 0, 1, 2, 3, 4, 5, 6, 7, 8}, new String[]{"YIxYGEALQVADAAAAA3QbEH0AowY", "9LW_RcoOSVACAAAAFTk3DTyXN-M", "O-wmAfBPSFADAAAA4zINVfD_bro", "F5oWoCs7QFACAAAAgf2bD_mg8Bw", "-Xc-np9y2VMCAAAARKr0yNNPYW0", "fqv01SQemVIBAAAApND8LDRUhRU", "F5oWoCs7QFACAAAAgf2bD_mg8Bw", "ptuUd96JSFACAAAATobI23sPpz0", "p-pXcflrmFIBAAAAvXYQk-mCwZU", "Nl8Pg2rBQVACAAAA25Lxtb8SDp0", "dhf9pceaQVACAAAAbzdVo4SCiZA", "9GcNVISdSVADAAAAUcw5BYjELW4", "9LW_RcoOSVACAAAAFTk3DTyXN-M", "dk_wwlghOFACAAAAfz9xrxi6euw"}, new int[]{45, kk7.Q1, 0, kk7.J2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{34, 47, 52, 48, 54, 50, 37, 56, 48, 49, 40, 64, 38, 48});
        H1(akbVar7);
        arrayList.add(akbVar7);
        hashMap.put("Night", akbVar7);
        String str = null;
        String string = sharedPreferences.getString("themes2", null);
        if (sharedPreferences.getInt("remote_version", 0) == 1) {
            int i976 = 0;
            while (i976 < 4) {
                long[] jArr = E;
                StringBuilder sb2 = new StringBuilder("2remoteThemesHash");
                sb2.append(i976 != 0 ? Integer.valueOf(i976) : "");
                jArr[i976] = sharedPreferences.getLong(sb2.toString(), 0L);
                int[] iArr5 = D;
                StringBuilder sb3 = new StringBuilder("lastLoadingThemesTime");
                sb3.append(i976 != 0 ? Integer.valueOf(i976) : "");
                iArr5[i976] = sharedPreferences.getInt(sb3.toString(), 0);
                i976++;
            }
        }
        sharedPreferences.edit().putInt("remote_version", 1).apply();
        if (TextUtils.isEmpty(string)) {
            String string2 = sharedPreferences.getString("themes", null);
            if (!TextUtils.isEmpty(string2)) {
                for (String str2 : string2.split("&")) {
                    akb f10 = akb.f(str2);
                    if (f10 != null) {
                        G.add(f10);
                        F.add(f10);
                        H.put(f10.k(), f10);
                    }
                }
                w1(true, true);
                sharedPreferences.edit().remove("themes").commit();
            }
        } else {
            try {
                JSONArray jSONArray = new JSONArray(string);
                for (int i977 = 0; i977 < jSONArray.length(); i977++) {
                    akb e10 = akb.e(jSONArray.getJSONObject(i977));
                    if (e10 != null) {
                        G.add(e10);
                        F.add(e10);
                        H.put(e10.k(), e10);
                        e10.q(sharedPreferences);
                    }
                }
            } catch (Exception e11) {
                fa4.f(e11);
            }
        }
        Collections.sort(F, new pva((byte) 2));
        SharedPreferences c12 = na7.c1();
        try {
            HashMap hashMap2 = H;
            akb akbVar8 = (akb) hashMap2.get("Dark Blue");
            String string3 = c12.getString("theme", null);
            if ("Default".equals(string3)) {
                akbVar = (akb) hashMap2.get("Blue");
                akbVar.Z = n;
            } else if ("Dark".equals(string3)) {
                akbVar8.Z = 9;
                akbVar = akbVar8;
            } else if (string3 != null) {
                akbVar = (akb) hashMap2.get(string3);
                if (akbVar != null && !sharedPreferences.contains("lastDayTheme")) {
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.putString("lastDayTheme", akbVar.k());
                    edit.commit();
                }
            } else {
                akbVar = null;
            }
            String string4 = c12.getString("nighttheme", null);
            if ("Default".equals(string4)) {
                akbVar = (akb) hashMap2.get("Blue");
                akbVar.Z = n;
            } else if ("Dark".equals(string4)) {
                J = akbVar8;
                akbVar8.Z = 9;
            } else if (string4 != null && (akbVar2 = (akb) hashMap2.get(string4)) != null) {
                J = akbVar2;
            }
            if (J != null && !sharedPreferences.contains("lastDarkTheme")) {
                SharedPreferences.Editor edit2 = sharedPreferences.edit();
                edit2.putString("lastDarkTheme", J.k());
                edit2.commit();
            }
            Iterator it3 = hashMap2.values().iterator();
            SharedPreferences.Editor editor3 = null;
            SharedPreferences.Editor editor4 = null;
            while (it3.hasNext()) {
                akb akbVar9 = (akb) it3.next();
                if (akbVar9.d == null || akbVar9.Y == 0) {
                    i10 = i13;
                    it = it3;
                    editor3 = editor3;
                } else {
                    String string5 = sharedPreferences.getString("accents_" + akbVar9.d, str);
                    akbVar9.Z = sharedPreferences.getInt("accent_current_" + akbVar9.d, akbVar9.T ? n : (byte) 0);
                    ArrayList arrayList2 = new ArrayList();
                    if (TextUtils.isEmpty(string5)) {
                        it = it3;
                        editor = editor3;
                        String str3 = "accent_for_" + akbVar9.d;
                        int i978 = c12.getInt(str3, 0);
                        if (i978 != 0) {
                            if (editor == null) {
                                editor3 = c12.edit();
                                editor4 = sharedPreferences.edit();
                            } else {
                                editor3 = editor;
                            }
                            editor3.remove(str3);
                            int size = akbVar9.c0.size();
                            int i979 = 0;
                            while (true) {
                                if (i979 >= size) {
                                    zjb zjbVar = new zjb();
                                    zjbVar.a = 100;
                                    zjbVar.c = i978;
                                    zjbVar.b = akbVar9;
                                    akbVar9.b0.put(100, zjbVar);
                                    arrayList2.add(0, zjbVar);
                                    akbVar9.Z = 100;
                                    akbVar9.g0 = 101;
                                    SerializedData serializedData = new SerializedData(72);
                                    serializedData.writeInt32(9);
                                    serializedData.writeInt32(1);
                                    serializedData.writeInt32(zjbVar.a);
                                    serializedData.writeInt32(zjbVar.c);
                                    serializedData.writeInt32(zjbVar.e);
                                    serializedData.writeInt32(zjbVar.f);
                                    serializedData.writeInt32(zjbVar.g);
                                    serializedData.writeInt32(zjbVar.h);
                                    serializedData.writeBool(zjbVar.i);
                                    serializedData.writeInt64(zjbVar.j);
                                    serializedData.writeInt64(zjbVar.k);
                                    serializedData.writeInt64(zjbVar.l);
                                    serializedData.writeInt64(zjbVar.m);
                                    serializedData.writeInt32(zjbVar.n);
                                    serializedData.writeInt64(0L);
                                    serializedData.writeDouble(zjbVar.p);
                                    serializedData.writeBool(zjbVar.q);
                                    serializedData.writeString(zjbVar.o);
                                    serializedData.writeBool(false);
                                    i10 = 3;
                                    editor4.putString("accents_" + akbVar9.d, Base64.encodeToString(serializedData.toByteArray(), 3));
                                    break;
                                }
                                zjb zjbVar2 = (zjb) akbVar9.c0.get(i979);
                                if (zjbVar2.c == i978) {
                                    akbVar9.Z = zjbVar2.a;
                                    i10 = 3;
                                    break;
                                }
                                i979++;
                            }
                            editor4.putInt("accent_current_" + akbVar9.d, akbVar9.Z);
                            if (!arrayList2.isEmpty()) {
                                akbVar9.c0.addAll(0, arrayList2);
                                H1(akbVar9);
                            }
                            sparseArray = akbVar9.b0;
                            if (sparseArray != null && sparseArray.get(akbVar9.Z) == null) {
                                akbVar9.Z = !akbVar9.T ? n : (byte) 0;
                            }
                            akbVar9.q(sharedPreferences);
                            i12 = akbVar9.i(false);
                            if (i12 == null) {
                                akbVar9.j0 = i12.y;
                            }
                        } else {
                            i10 = 3;
                        }
                    } else {
                        try {
                            SerializedData serializedData2 = new SerializedData(Base64.decode(string5, i13));
                            boolean z12 = true;
                            int readInt32 = serializedData2.readInt32(true);
                            int readInt322 = serializedData2.readInt32(true);
                            int i980 = 0;
                            while (i980 < readInt322) {
                                try {
                                    zjb zjbVar3 = new zjb();
                                    zjbVar3.a = serializedData2.readInt32(z12);
                                    zjbVar3.c = serializedData2.readInt32(z12);
                                    if (readInt32 >= 9) {
                                        zjbVar3.d = serializedData2.readInt32(z12);
                                    }
                                    zjbVar3.b = akbVar9;
                                    zjbVar3.e = serializedData2.readInt32(true);
                                    zjbVar3.f = serializedData2.readInt32(true);
                                    if (readInt32 >= 7) {
                                        zjbVar3.g = serializedData2.readInt32(true);
                                        zjbVar3.h = serializedData2.readInt32(true);
                                    }
                                    if (readInt32 >= 8) {
                                        z11 = true;
                                        zjbVar3.i = serializedData2.readBool(true);
                                    } else {
                                        z11 = true;
                                    }
                                    if (readInt32 >= 3) {
                                        it2 = it3;
                                        editor2 = editor3;
                                        zjbVar3.j = serializedData2.readInt64(z11);
                                    } else {
                                        it2 = it3;
                                        editor2 = editor3;
                                        zjbVar3.j = serializedData2.readInt32(z11);
                                    }
                                    if (readInt32 >= 2) {
                                        zjbVar3.k = serializedData2.readInt64(z11);
                                    } else {
                                        zjbVar3.k = serializedData2.readInt32(z11);
                                    }
                                    ?? r11 = z11;
                                    if (readInt32 >= 6) {
                                        zjbVar3.l = serializedData2.readInt64(z11);
                                        zjbVar3.m = serializedData2.readInt64(z11);
                                        r11 = 1;
                                    }
                                    if (readInt32 >= r11) {
                                        zjbVar3.n = serializedData2.readInt32(r11);
                                    }
                                    if (readInt32 >= 4) {
                                        serializedData2.readInt64(r11);
                                        zjbVar3.p = (float) serializedData2.readDouble(r11);
                                        zjbVar3.q = serializedData2.readBool(r11);
                                        i11 = 5;
                                        if (readInt32 >= 5) {
                                            zjbVar3.o = serializedData2.readString(r11);
                                        }
                                        if (readInt32 >= i11 && serializedData2.readBool(true)) {
                                            zjbVar3.t = serializedData2.readInt32(true);
                                            zjbVar3.r = TLRPC.Theme.TLdeserialize(serializedData2, serializedData2.readInt32(true), true);
                                        }
                                        tL_theme = zjbVar3.r;
                                        if (tL_theme != null) {
                                            zjbVar3.z = tL_theme.isDefault;
                                        }
                                        akbVar9.b0.put(zjbVar3.a, zjbVar3);
                                        tL_theme2 = zjbVar3.r;
                                        if (tL_theme2 != null) {
                                            akbVar9.d0.put(tL_theme2.id, zjbVar3);
                                        }
                                        arrayList2.add(zjbVar3);
                                        akbVar9.g0 = Math.max(akbVar9.g0, zjbVar3.a);
                                        i980++;
                                        it3 = it2;
                                        editor3 = editor2;
                                        i13 = 3;
                                        z12 = true;
                                    }
                                    i11 = 5;
                                    if (readInt32 >= i11) {
                                        zjbVar3.t = serializedData2.readInt32(true);
                                        zjbVar3.r = TLRPC.Theme.TLdeserialize(serializedData2, serializedData2.readInt32(true), true);
                                    }
                                    tL_theme = zjbVar3.r;
                                    if (tL_theme != null) {
                                    }
                                    akbVar9.b0.put(zjbVar3.a, zjbVar3);
                                    tL_theme2 = zjbVar3.r;
                                    if (tL_theme2 != null) {
                                    }
                                    arrayList2.add(zjbVar3);
                                    akbVar9.g0 = Math.max(akbVar9.g0, zjbVar3.a);
                                    i980++;
                                    it3 = it2;
                                    editor3 = editor2;
                                    i13 = 3;
                                    z12 = true;
                                } finally {
                                }
                            }
                            it = it3;
                            editor = editor3;
                            i10 = i13;
                        } catch (Throwable th2) {
                            fa4.f(th2);
                            throw new RuntimeException(th2);
                        }
                    }
                    editor3 = editor;
                    if (!arrayList2.isEmpty()) {
                    }
                    sparseArray = akbVar9.b0;
                    if (sparseArray != null) {
                        akbVar9.Z = !akbVar9.T ? n : (byte) 0;
                    }
                    akbVar9.q(sharedPreferences);
                    i12 = akbVar9.i(false);
                    if (i12 == null) {
                    }
                }
                it3 = it;
                i13 = i10;
                str = null;
            }
            SharedPreferences.Editor editor5 = editor3;
            int i981 = i13;
            if (editor5 != null) {
                editor5.commit();
                editor4.commit();
            }
            o = c12.getInt("selectedAutoNightType", Build.VERSION.SDK_INT >= 29 ? i981 : 0);
            p = c12.getBoolean("autoNightScheduleByLocation", false);
            q = c12.getFloat("autoNightBrighnessThreshold", 0.25f);
            r = c12.getInt("autoNightDayStartTime", 1320);
            s = c12.getInt("autoNightDayEndTime", 480);
            t = c12.getInt("autoNightSunsetTime", 1320);
            v = c12.getInt("autoNightSunriseTime", 480);
            w = c12.getString("autoNightCityName", "");
            long j10 = c12.getLong("autoNightLocationLatitude3", 10000L);
            if (j10 != 10000) {
                x = Double.longBitsToDouble(j10);
            } else {
                x = 10000.0d;
            }
            long j11 = c12.getLong("autoNightLocationLongitude3", 10000L);
            if (j11 != 10000) {
                y = Double.longBitsToDouble(j11);
            } else {
                y = 10000.0d;
            }
            u = c12.getInt("autoNightLastSunCheckDay", -1);
            if (akbVar == null) {
                akbVar = L;
            } else {
                K = akbVar;
            }
            if (c12.contains("overrideThemeWallpaper") || c12.contains("selectedBackground2")) {
                boolean z13 = c12.getBoolean("overrideThemeWallpaper", false);
                long j12 = c12.getLong("selectedBackground2", 1000001L);
                if (j12 == -1 || (z13 && j12 != -2 && j12 != 1000001)) {
                    vjb vjbVar = new vjb();
                    vjbVar.d = c12.getInt("selectedColor", 0);
                    vjbVar.c = c12.getString("selectedBackgroundSlug", "");
                    if (j12 < -100 || j12 > -1 || vjbVar.d == 0) {
                        vjbVar.a = "wallpaper.jpg";
                        vjbVar.b = "wallpaper_original.jpg";
                    } else {
                        vjbVar.c = "c";
                        vjbVar.a = "";
                        vjbVar.b = "";
                    }
                    vjbVar.e = c12.getInt("selectedGradientColor", 0);
                    vjbVar.f = c12.getInt("selectedGradientColor2", 0);
                    vjbVar.g = c12.getInt("selectedGradientColor3", 0);
                    vjbVar.h = c12.getInt("selectedGradientRotation", 45);
                    vjbVar.i = c12.getBoolean("selectedBackgroundBlurred", false);
                    vjbVar.j = c12.getBoolean("selectedBackgroundMotion", false);
                    vjbVar.k = c12.getFloat("selectedIntensity", 0.5f);
                    K.v(vjbVar);
                    if (o != 0) {
                        J.v(vjbVar);
                    }
                }
                c12.edit().remove("overrideThemeWallpaper").remove("selectedBackground2").commit();
            }
            byte b10 = 2;
            if (q1() == 2) {
                akbVar = J;
                z10 = true;
            } else {
                z10 = false;
            }
            t(akbVar, false, z10);
            gl.c3(new am6(b10));
            xm = new mjb();
            ym = new int[2];
            Cm = new HashSet();
            Em = new Paint(1);
            Paint paint = new Paint(1);
            Fm = paint;
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            Paint paint2 = new Paint();
            Gm = paint2;
            paint2.setColor(-65536);
            new Paint().setColor(-16776961);
            new Paint().setColor(1073807104);
            Paint paint3 = new Paint();
            Hm = paint3;
            paint3.setColor(-1342112000);
            Paint paint4 = new Paint();
            Im = paint4;
            paint4.setColor(-65536);
            paint4.setStrokeWidth(2.0f);
            Paint.Style style = Paint.Style.STROKE;
            paint4.setStyle(style);
            Paint paint5 = new Paint();
            Jm = paint5;
            paint5.setColor(-16711936);
            paint5.setStrokeWidth(2.0f);
            paint5.setStyle(style);
        } catch (Exception e12) {
            fa4.f(e12);
            sdb.b(e12);
        }
    }

    public static void A() {
        if (o != 2) {
            if (k) {
                k = false;
                gl.r(m);
            }
            if (j) {
                j = false;
                gl.r(l);
            }
            if (g) {
                h = 1.0f;
                e.unregisterListener(xm, f);
                g = false;
                if (w01.a) {
                    fa4.b("light sensor unregistered");
                }
            }
        }
    }

    public static String A0() {
        akb akbVar = J;
        if (akbVar == null) {
            return "";
        }
        String l10 = akbVar.l();
        return l10.toLowerCase().endsWith(".attheme") ? l10.substring(0, l10.lastIndexOf(46)) : l10;
    }

    public static void A1(int i10, Drawable drawable) {
        if (drawable == null) {
            return;
        }
        if (drawable instanceof bya) {
            ((bya) drawable).b(i10);
            return;
        }
        if (drawable instanceof xf7) {
            ((xf7) drawable).a(i10);
            return;
        }
        if (drawable instanceof ShapeDrawable) {
            ((ShapeDrawable) drawable).getPaint().setColor(i10);
        } else if (drawable instanceof gq9) {
            ((gq9) drawable).b(i10);
        } else {
            drawable.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
        }
    }

    public static int B(akb akbVar, int i10, int i11) {
        int i12;
        if (i10 == 0 || (i12 = akbVar.Y) == 0 || i10 == i12 || (akbVar.T && akbVar.Z == n)) {
            return i11;
        }
        float[] N02 = N0(3);
        float[] N03 = N0(4);
        Color.colorToHSV(akbVar.Y, N02);
        Color.colorToHSV(i10, N03);
        return D(N02, N03, i11, akbVar.o(), i11);
    }

    public static akb B0() {
        akb akbVar = K;
        return akbVar != null ? akbVar : L;
    }

    public static void B1(int i10, Drawable drawable) {
        A1(w0(null, i10, false), drawable);
    }

    public static int C(boolean z10, int i10, int i11, int i12, int i13) {
        float[] N02 = N0(3);
        float[] N03 = N0(4);
        Color.colorToHSV(i10, N02);
        Color.colorToHSV(i11, N03);
        return D(N02, N03, i12, z10, i13);
    }

    public static int C0(int i10) {
        int indexOfKey = jm.indexOfKey(i10);
        if (indexOfKey < 0) {
            return 0;
        }
        int valueAt = jm.valueAt(indexOfKey);
        zjb i11 = I.i(false);
        if (i11 == null) {
            return 0;
        }
        float[] N02 = N0(1);
        float[] N03 = N0(2);
        Color.colorToHSV(I.Y, N02);
        Color.colorToHSV(i11.c, N03);
        return D(N02, N03, valueAt, I.o(), valueAt);
    }

    public static void C1(Drawable drawable, int i10, boolean z10) {
        if (drawable instanceof StateListDrawable) {
            try {
                Drawable M02 = z10 ? M0(0, drawable) : M0(1, drawable);
                if (M02 instanceof ShapeDrawable) {
                    ((ShapeDrawable) M02).getPaint().setColor(i10);
                } else {
                    M02.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static int D(float[] fArr, float[] fArr2, int i10, boolean z10, int i11) {
        float[] fArr3 = wm;
        if (fArr3 == null) {
            fArr3 = new float[3];
            wm = fArr3;
        }
        Color.colorToHSV(i10, fArr3);
        float f10 = fArr3[0];
        float f11 = fArr[0];
        float f12 = f10 - f11;
        if (f12 <= 0.0f) {
            f12 = -f12;
        }
        float f13 = (f10 - f11) - 360.0f;
        if (f13 <= 0.0f) {
            f13 = -f13;
        }
        if (Math.min(f12, f13) > 30.0f) {
            return i11;
        }
        float min = Math.min((fArr3[1] * 1.5f) / fArr[1], 1.0f);
        fArr3[0] = (fArr3[0] + fArr2[0]) - fArr[0];
        fArr3[1] = (fArr3[1] * fArr2[1]) / fArr[1];
        fArr3[2] = (((min * fArr2[2]) / fArr[2]) + (1.0f - min)) * fArr3[2];
        int HSVToColor = Color.HSVToColor(Color.alpha(i10), fArr3);
        float B10 = gl.B(i10);
        float B11 = gl.B(HSVToColor);
        if (z10) {
            if (B10 <= B11) {
                return HSVToColor;
            }
        } else if (B10 >= B11) {
            return HSVToColor;
        }
        float d10 = ls6.d(0.39999998f, B10, B11, 0.6f);
        int red = (int) (Color.red(HSVToColor) * d10);
        int green = (int) (Color.green(HSVToColor) * d10);
        int blue = (int) (Color.blue(HSVToColor) * d10);
        return Color.argb(Color.alpha(HSVToColor), red < 0 ? 0 : Math.min(red, kk7.d4), green < 0 ? 0 : Math.min(green, kk7.d4), blue >= 0 ? Math.min(blue, kk7.d4) : 0);
    }

    public static int D0(int i10) {
        int i11 = gm[i10];
        if (i11 != 0) {
            return i11;
        }
        int i12 = hm.get(i10, -1);
        return i12 != -1 ? D0(i12) : ((i10 >= pb && i10 < wb) || i10 == C9 || i10 == M9 || i10 == D9 || i10 == Fe || i10 == Ge) ? 0 : -65536;
    }

    public static void D1(ff0 ff0Var, float f10, float f11, float f12, float f13) {
        if (ug8.A(ff0Var)) {
            int numberOfLayers = ff0Var.getNumberOfLayers();
            for (int i10 = 0; i10 < numberOfLayers; i10++) {
                Drawable drawable = ff0Var.getDrawable(i10);
                if (drawable instanceof xjb) {
                    xjb xjbVar = (xjb) drawable;
                    float[] fArr = xjbVar.b;
                    float L10 = gl.L(f10);
                    fArr[1] = L10;
                    fArr[0] = L10;
                    float L11 = gl.L(f11);
                    fArr[3] = L11;
                    fArr[2] = L11;
                    float L12 = gl.L(f12);
                    fArr[5] = L12;
                    fArr[4] = L12;
                    float L13 = gl.L(f13);
                    fArr[7] = L13;
                    fArr[6] = L13;
                    xjbVar.c = true;
                    xjbVar.invalidateSelf();
                    return;
                }
            }
        }
    }

    public static void E(boolean z10) {
        if (M != null || N) {
            return;
        }
        if (!z10 && T > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = elapsedRealtime - U;
            U = elapsedRealtime;
            int i10 = (int) (T - j10);
            T = i10;
            if (i10 > 0) {
                return;
            }
        }
        if (z10) {
            if (k) {
                k = false;
                gl.r(m);
            }
            if (j) {
                j = false;
                gl.r(l);
            }
        }
        A();
        int q12 = q1();
        if (q12 != 0) {
            l(q12 == 2);
        }
        if (z10) {
            i = 0L;
        }
    }

    public static tn4 E0() {
        tn4 tn4Var = sm;
        if (tn4Var == null) {
            tn4Var = new tn4();
            tn4Var.a = new sn4[4];
            tn4Var.k = 1.0f;
            tn4Var.l = new ArrayList();
            tn4Var.m = new Paint(1);
            tn4Var.n = new Path();
            for (int i10 = 0; i10 < 4; i10++) {
                tn4Var.a[i10] = new sn4(i10);
            }
            sm = tn4Var;
        }
        return tn4Var;
    }

    public static void E1(ff0 ff0Var, int i10, int i11) {
        if (ug8.A(ff0Var)) {
            int numberOfLayers = ff0Var.getNumberOfLayers();
            for (int i12 = 0; i12 < numberOfLayers; i12++) {
                Drawable drawable = ff0Var.getDrawable(i12);
                if (drawable instanceof xjb) {
                    xjb xjbVar = (xjb) drawable;
                    float f10 = i10;
                    float f11 = i11;
                    float[] fArr = xjbVar.b;
                    float L10 = gl.L(f10);
                    fArr[3] = L10;
                    fArr[2] = L10;
                    fArr[1] = L10;
                    fArr[0] = L10;
                    float L11 = gl.L(f11);
                    fArr[7] = L11;
                    fArr[6] = L11;
                    fArr[5] = L11;
                    fArr[4] = L11;
                    xjbVar.c = true;
                    xjbVar.invalidateSelf();
                    return;
                }
            }
        }
    }

    public static void F(boolean z10) {
        int i10;
        if (A == 0) {
            if (z10 || Math.abs((System.currentTimeMillis() / 1000) - B) >= 3600) {
                int i11 = 0;
                while (i11 < 2) {
                    akb akbVar = i11 == 0 ? K : J;
                    if (akbVar != null && y6c.h(akbVar.F).o()) {
                        zjb i12 = akbVar.i(false);
                        TLRPC.TL_theme tL_theme = akbVar.G;
                        if (tL_theme != null) {
                            i10 = akbVar.F;
                        } else if (i12 != null && (tL_theme = i12.r) != null) {
                            i10 = y6c.t0;
                        }
                        if (tL_theme.document != null) {
                            A++;
                            TL_account.getTheme gettheme = new TL_account.getTheme();
                            gettheme.document_id = tL_theme.document.id;
                            gettheme.format = "android";
                            TLRPC.TL_inputTheme tL_inputTheme = new TLRPC.TL_inputTheme();
                            tL_inputTheme.access_hash = tL_theme.access_hash;
                            tL_inputTheme.id = tL_theme.id;
                            gettheme.theme = tL_inputTheme;
                            ConnectionsManager.getInstance(i10).sendRequest(gettheme, new ck8((Object) i12, (Object) akbVar, (Object) tL_theme, (byte) 24));
                        }
                    }
                    i11++;
                }
            }
        }
    }

    public static int F0(int i10) {
        return w0(null, i10, true);
    }

    public static boolean F1(Drawable drawable, int i10, boolean z10) {
        Drawable M02;
        boolean z11;
        if (!(drawable instanceof StateListDrawable)) {
            if (drawable instanceof RippleDrawable) {
                RippleDrawable rippleDrawable = (RippleDrawable) drawable;
                if (z10) {
                    rippleDrawable.setColor(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i10}));
                    return false;
                }
                if (rippleDrawable.getNumberOfLayers() > 0) {
                    Drawable drawable2 = rippleDrawable.getDrawable(0);
                    if (drawable2 instanceof ShapeDrawable) {
                        ShapeDrawable shapeDrawable = (ShapeDrawable) drawable2;
                        r1 = shapeDrawable.getPaint().getColor() != i10;
                        shapeDrawable.getPaint().setColor(i10);
                        return r1;
                    }
                    drawable2.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                }
            }
            return false;
        }
        try {
            if (z10) {
                Drawable M03 = M0(0, drawable);
                if (M03 instanceof ShapeDrawable) {
                    z11 = ((ShapeDrawable) M03).getPaint().getColor() != i10;
                    try {
                        ((ShapeDrawable) M03).getPaint().setColor(i10);
                    } catch (Throwable unused) {
                        return z11;
                    }
                } else {
                    M03.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                    z11 = false;
                }
                M02 = M0(1, drawable);
            } else {
                M02 = M0(2, drawable);
                z11 = false;
            }
            if (!(M02 instanceof ShapeDrawable)) {
                M02.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                return z11;
            }
            if (((ShapeDrawable) M02).getPaint().getColor() == i10 && !z11) {
                r1 = false;
            }
            try {
                ((ShapeDrawable) M02).getPaint().setColor(i10);
                return r1;
            } catch (Throwable unused2) {
                return r1;
            }
        } catch (Throwable unused3) {
            return false;
        }
    }

    public static void G(SparseIntArray sparseIntArray, akb akbVar) {
        if (akbVar == null || akbVar.k0 != -1) {
            return;
        }
        int i10 = c6;
        if (bm2.h(bm2.f(0.5f, G0(sparseIntArray, i10), G0(sparseIntArray, i10))) < 0.5d) {
            akbVar.k0 = 1;
        } else {
            akbVar.k0 = 0;
        }
    }

    public static int G0(SparseIntArray sparseIntArray, int i10) {
        int indexOfKey = sparseIntArray.indexOfKey(i10);
        return indexOfKey >= 0 ? sparseIntArray.valueAt(indexOfKey) : gm[i10];
    }

    public static void G1(akb akbVar, zjb zjbVar, TLRPC.TL_theme tL_theme, int i10, boolean z10) {
        String str;
        TLRPC.WallPaperSettings wallPaperSettings;
        if (tL_theme != null) {
            TLRPC.ThemeSettings themeSettings = tL_theme.settings.size() > 0 ? tL_theme.settings.get(0) : null;
            HashMap hashMap = H;
            if (themeSettings != null) {
                if (akbVar == null) {
                    String q02 = q0(themeSettings);
                    if (q02 == null || (akbVar = (akb) hashMap.get(q02)) == null) {
                        return;
                    } else {
                        zjbVar = (zjb) akbVar.d0.get(tL_theme.id);
                    }
                }
                if (zjbVar == null) {
                    return;
                }
                TLRPC.TL_theme tL_theme2 = zjbVar.r;
                if (tL_theme2 != null) {
                    akbVar.d0.remove(tL_theme2.id);
                }
                zjbVar.r = tL_theme;
                zjbVar.t = i10;
                akbVar.d0.put(tL_theme.id, zjbVar);
                if (!akb.a(zjbVar, themeSettings)) {
                    akb.g(zjbVar, themeSettings);
                    akb akbVar2 = I;
                    if (akbVar2 == akbVar && akbVar2.Z == zjbVar.a) {
                        r1(false, false);
                        akb akbVar3 = I;
                        I1(akbVar3, J == akbVar3, -1, null);
                    }
                }
                TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
                zjbVar.q = (wallPaper == null || (wallPaperSettings = wallPaper.settings) == null || !wallPaperSettings.motion) ? false : true;
                akbVar.U = false;
            } else {
                if (akbVar != null) {
                    str = akbVar.k();
                    hashMap.remove(str);
                } else {
                    str = "remote" + tL_theme.id;
                    akbVar = (akb) hashMap.get(str);
                }
                if (akbVar == null) {
                    return;
                }
                akbVar.G = tL_theme;
                akbVar.a = tL_theme.title;
                File file = new File(akbVar.b);
                File file2 = new File(a.h(), tb4.o(str, ".attheme"));
                if (!file.equals(file2)) {
                    try {
                        gl.E(file, file2);
                        akbVar.b = file2.getAbsolutePath();
                    } catch (Exception e10) {
                        fa4.g(e10, true);
                    }
                }
                if (z10) {
                    akbVar.H = false;
                    akbVar.h0 = null;
                    akbVar.i0 = null;
                    kk7.f(akbVar.F).a(akbVar, kk7.X1);
                    kk7.f(akbVar.F).a(akbVar, kk7.Y1);
                    ba4 G10 = ba4.G(akbVar.F);
                    TLRPC.TL_theme tL_theme3 = akbVar.G;
                    G10.X(tL_theme3.document, tL_theme3, 1, 1);
                } else {
                    akbVar.U = false;
                }
                hashMap.put(akbVar.k(), akbVar);
            }
            w1(true, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01ed A[Catch: all -> 0x0278, TryCatch #1 {all -> 0x0278, blocks: (B:86:0x015b, B:88:0x0163, B:90:0x016b, B:93:0x0171, B:95:0x0175, B:98:0x017c, B:100:0x0186, B:102:0x0190, B:104:0x0196, B:105:0x01ab, B:107:0x01b5, B:109:0x01bd, B:112:0x01c9, B:115:0x01ed, B:117:0x01ff, B:119:0x0203, B:120:0x020b, B:122:0x021f, B:124:0x022a, B:125:0x0231, B:126:0x0235, B:128:0x01cf, B:130:0x01d5, B:138:0x0199, B:141:0x0238, B:143:0x0244, B:145:0x024f, B:146:0x025d, B:148:0x0263, B:79:0x026e), top: B:85:0x015b }] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x027e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static gl2 H(akb akbVar, vjb vjbVar, SparseIntArray sparseIntArray, String str, String str2, int i10, int i11, int i12, boolean z10, boolean z11, boolean z12, boolean z13, TLRPC.Document document, boolean z14) {
        int width;
        int height;
        Bitmap l12;
        Bitmap bitmap;
        boolean z15;
        String str3;
        Bitmap bitmap2;
        boolean z16 = false;
        gl2 gl2Var = new gl2((byte) 16, false);
        Bitmap bitmap3 = null;
        gl2Var.b = z14 ? null : d0;
        boolean z17 = (!z11 || z12) && vjbVar != null;
        if (vjbVar != null) {
            gl2Var.d = Boolean.valueOf(vjbVar.j);
            gl2Var.e = Boolean.valueOf((vjbVar.d == 0 || "d".equals(vjbVar.c) || "c".equals(vjbVar.c)) ? false : true);
        } else {
            gl2Var.d = Boolean.valueOf(akbVar.n);
            gl2Var.e = Boolean.valueOf(akbVar.r != 0);
        }
        if (!z17) {
            int i13 = z10 ? 0 : sparseIntArray.get(De);
            int i14 = sparseIntArray.get(Ge);
            int i15 = sparseIntArray.get(Fe);
            int i16 = sparseIntArray.get(Ee);
            if (i13 != 0) {
                sparseIntArray.get(He, -1);
                if (TextUtils.isEmpty(str)) {
                    str3 = str;
                } else {
                    str3 = str;
                    try {
                        bitmap2 = m0(str3, document, !z14);
                    } catch (Throwable th2) {
                        fa4.g(th2, true);
                    }
                    boolean z18 = (i16 == 0 && i16 != i13) || i15 != 0;
                    if (bitmap2 == null || z18) {
                        ye7 ye7Var = new ye7(i13, i16, i15, i14, false, false);
                        ye7Var.r(i11, bitmap2);
                        if (bitmap2 != null) {
                            ye7Var.s(ye7Var.f());
                        }
                        ye7Var.t(i12);
                        gl2Var.b = ye7Var;
                    } else {
                        gl2Var.b = new ColorDrawable(i13);
                    }
                    if (!TextUtils.isEmpty(str3)) {
                        gl2Var.d = Boolean.valueOf(z13);
                        gl2Var.e = Boolean.TRUE;
                    }
                    gl2Var.f = Boolean.TRUE;
                }
                bitmap2 = null;
                if (i16 == 0) {
                }
                if (bitmap2 == null) {
                }
                ye7 ye7Var2 = new ye7(i13, i16, i15, i14, false, false);
                ye7Var2.r(i11, bitmap2);
                if (bitmap2 != null) {
                }
                ye7Var2.t(i12);
                gl2Var.b = ye7Var2;
                if (!TextUtils.isEmpty(str3)) {
                }
                gl2Var.f = Boolean.TRUE;
            } else if (str2 != null) {
                try {
                    Bitmap l13 = l1(new FileInputStream(sqc.d(str2)), 0);
                    if (l13 != null) {
                        BitmapDrawable bitmapDrawable = new BitmapDrawable(l13);
                        gl2Var.b = bitmapDrawable;
                        gl2Var.c = bitmapDrawable;
                        gl2Var.f = Boolean.TRUE;
                    }
                } catch (Exception e10) {
                    fa4.g(e10, true);
                }
            } else if (i10 > 0 && (akbVar.b != null || akbVar.d != null)) {
                try {
                    String str4 = akbVar.d;
                    Bitmap l14 = l1(new FileInputStream(str4 != null ? p0(str4) : new File(akbVar.b)), i10);
                    if (l14 != null) {
                        BitmapDrawable bitmapDrawable2 = new BitmapDrawable(l14);
                        d0 = bitmapDrawable2;
                        gl2Var.c = bitmapDrawable2;
                        gl2Var.b = bitmapDrawable2;
                        bitmapDrawable2.setFilterBitmap(true);
                        gl2Var.f = Boolean.TRUE;
                    }
                } catch (Throwable th3) {
                    fa4.g(th3, true);
                }
            }
        }
        if (((Drawable) gl2Var.b) == null) {
            int i17 = vjbVar != null ? vjbVar.d : 0;
            if (vjbVar != null) {
                if (!"d".equals(vjbVar.c)) {
                    if (!"c".equals(vjbVar.c) || vjbVar.e != 0) {
                        if (i17 != 0) {
                            boolean z19 = (vjbVar.e == 0 || vjbVar.f == 0) ? false : true;
                            if (((Boolean) gl2Var.e).booleanValue()) {
                                boolean z20 = !z14;
                                String str5 = vjbVar.c;
                                if (!TextUtils.isEmpty(str5)) {
                                    mqc d10 = zqc.d(str5);
                                    if (d10 != null) {
                                        bitmap = d10.a;
                                        File e11 = (((Boolean) gl2Var.e).booleanValue() || TextUtils.isEmpty(vjbVar.a)) ? null : sqc.e(vjbVar.a);
                                        if (bitmap == null) {
                                            if (e11 != null) {
                                                e11.delete();
                                            }
                                        } else if (e11 != null && e11.exists()) {
                                            Bitmap l15 = l1(new FileInputStream(e11), 0);
                                            if (z19) {
                                                bitmap = l15;
                                                z15 = l15 != null;
                                            } else {
                                                z15 = false;
                                                bitmap3 = l15;
                                            }
                                            if (bitmap3 != null) {
                                                BitmapDrawable bitmapDrawable3 = new BitmapDrawable(bitmap3);
                                                gl2Var.b = bitmapDrawable3;
                                                bitmapDrawable3.setFilterBitmap(true);
                                                gl2Var.f = Boolean.TRUE;
                                            } else if (bitmap == null && vjbVar.e == 0) {
                                                gl2Var.b = new ColorDrawable(i17);
                                            } else {
                                                ye7 ye7Var3 = new ye7(vjbVar.d, vjbVar.e, vjbVar.f, vjbVar.g, false, false);
                                                ye7Var3.t(i12);
                                                if (bitmap != null) {
                                                    ye7Var3.r((int) (vjbVar.k * 100.0f), bitmap);
                                                    if (!z15) {
                                                        ye7Var3.s(ye7Var3.f());
                                                    }
                                                    gl2Var.f = Boolean.TRUE;
                                                }
                                                gl2Var.b = ye7Var3;
                                            }
                                        }
                                        z15 = false;
                                        if (bitmap3 != null) {
                                        }
                                    } else {
                                        int i18 = y6c.t0;
                                        kjb kjbVar = new kjb(z20, str5, z16 ? 1 : 0);
                                        do3 do3Var = xqc.e;
                                        gl.c3(new clc(i18, str5, kjbVar));
                                    }
                                }
                            }
                            bitmap = null;
                            if (((Boolean) gl2Var.e).booleanValue()) {
                            }
                            if (bitmap == null) {
                            }
                            z15 = false;
                            if (bitmap3 != null) {
                            }
                        } else {
                            File e12 = sqc.e(vjbVar.a);
                            if (e12.exists() && (l12 = l1(new FileInputStream(e12), 0)) != null) {
                                BitmapDrawable bitmapDrawable4 = new BitmapDrawable(l12);
                                gl2Var.b = bitmapDrawable4;
                                bitmapDrawable4.setFilterBitmap(true);
                                gl2Var.f = Boolean.TRUE;
                            }
                            if (((Drawable) gl2Var.b) == null) {
                                gl2Var.b = R(0, 0);
                                gl2Var.f = Boolean.FALSE;
                            }
                        }
                    }
                    if (((Drawable) gl2Var.b) == null) {
                        if (i17 == 0) {
                            i17 = -2693905;
                        }
                        gl2Var.b = new ColorDrawable(i17);
                    }
                }
            }
            gl2Var.b = R(0, 0);
            gl2Var.f = Boolean.FALSE;
            if (((Drawable) gl2Var.b) == null) {
            }
        }
        if (!e66.e(32)) {
            Drawable drawable = (Drawable) gl2Var.b;
            if (drawable instanceof ye7) {
                ye7 ye7Var4 = (ye7) drawable;
                Bitmap bitmap4 = ye7Var4.u;
                if (bitmap4 == null) {
                    Point point = gl.q;
                    width = Math.min(point.x, point.y);
                    height = Math.max(point.x, point.y);
                } else {
                    width = bitmap4.getWidth();
                    height = ye7Var4.u.getHeight();
                }
                Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                ((Drawable) gl2Var.b).setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                ((Drawable) gl2Var.b).draw(canvas);
                gl2Var.b = new BitmapDrawable(createBitmap);
            }
        }
        return gl2Var;
    }

    public static ff0 H0(int i10, int i11) {
        return new ff0(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{(i11 & 16777215) | 419430400}), null, b0(i10, -1));
    }

    public static void H1(akb akbVar) {
        Collections.sort(akbVar.c0, new pva((byte) 3));
    }

    public static gl2 I(akb akbVar, SparseIntArray sparseIntArray, String str, int i10, boolean z10) {
        float f10;
        float f11;
        boolean z11 = akbVar.T && akbVar.Z == n;
        zjb i11 = akbVar.i(false);
        String str2 = i11 != null ? i11.o : null;
        boolean z12 = i11 != null && i11.q;
        vjb vjbVar = akbVar.j0;
        if (vjbVar != null) {
            f11 = vjbVar.k;
        } else {
            if (i11 == null) {
                f10 = akbVar.E;
                return H(akbVar, vjbVar, sparseIntArray, str2, str, jm.get(f5, -1), (int) f10, i10, z11, false, false, z12, null, z10);
            }
            f11 = i11.p;
        }
        f10 = f11 * 100.0f;
        return H(akbVar, vjbVar, sparseIntArray, str2, str, jm.get(f5, -1), (int) f10, i10, z11, false, false, z12, null, z10);
    }

    public static String I0() {
        vjb vjbVar = I.j0;
        return vjbVar != null ? vjbVar.c : e1() ? "t" : "d";
    }

    public static void I1(akb akbVar, boolean z10, int i10, View view) {
        int[] iArr = new int[2];
        if (view == null || !view.isAttachedToWindow()) {
            iArr[0] = gl.q.x / 2;
            iArr[1] = 0;
        } else {
            view.getLocationInWindow(iArr);
            iArr[0] = (view.getMeasuredWidth() / 2) + iArr[0];
            iArr[1] = (view.getMeasuredHeight() / 2) + iArr[1];
        }
        kk7.e().k(kk7.v4, akbVar, Boolean.valueOf(z10), iArr, Integer.valueOf(i10), Boolean.TRUE, null);
    }

    public static void J(Context context, boolean z10) {
        float f10;
        float f11;
        TextPaint textPaint;
        Drawable[] drawableArr;
        O();
        if (z10 || l3 != null) {
            f10 = 1.0f;
            f11 = 14.0f;
        } else {
            Resources resources = context.getResources();
            g3 = resources.getDrawable(R.drawable.video_muted);
            k3 = resources.getDrawable(R.drawable.media_live_on).mutate();
            byte b10 = 0;
            l3 = new m17(0, false, false, null);
            m3 = new m17(0, false, true, null);
            n3 = new m17(0, true, false, null);
            o3 = new m17(0, true, true, null);
            p3 = new m17(1, false, false, null);
            q3 = new m17(1, false, true, null);
            r3 = new m17(1, true, false, null);
            s3 = new m17(1, true, true, null);
            jy7 jy7Var = new jy7();
            jy7Var.a = new Path();
            jy7Var.b = -1.0f;
            jy7Var.g = new ArrayList();
            jy7Var.c = 0.293f;
            jy7Var.d = -26.0f;
            jy7Var.e = -28.0f;
            jy7Var.f = 1.0f;
            w3 = jy7Var;
            jy7Var.a("M 34.141 16.042 C 37.384 17.921 40.886 20.001 44.211 21.965 C 46.139 23.104 49.285 24.729 49.586 25.917 C 50.289 28.687 48.484 30 46.274 30 L 6 30.021 C 3.79 30.021 2.075 30.023 2 26.021 L 2.009 3.417 C 2.009 0.417 5.326 -0.58 7.068 0.417 C 10.545 2.406 25.024 10.761 34.141 16.042 Z", 166.0f);
            w3.a("M 37.843 17.769 C 41.143 19.508 44.131 21.164 47.429 23.117 C 48.542 23.775 49.623 24.561 49.761 25.993 C 50.074 28.708 48.557 30 46.347 30 L 6 30.012 C 3.79 30.012 2 28.222 2 26.012 L 2.009 4.609 C 2.009 1.626 5.276 0.664 7.074 1.541 C 10.608 3.309 28.488 12.842 37.843 17.769 Z", 200.0f);
            w3.a("M 40.644 18.756 C 43.986 20.389 49.867 23.108 49.884 25.534 C 49.897 27.154 49.88 24.441 49.894 26.059 C 49.911 28.733 48.6 30 46.39 30 L 6 30.013 C 3.79 30.013 2 28.223 2 26.013 L 2.008 5.52 C 2.008 2.55 5.237 1.614 7.079 2.401 C 10.656 4 31.106 14.097 40.644 18.756 Z", 217.0f);
            w3.a("M 43.782 19.218 C 47.117 20.675 50.075 21.538 50.041 24.796 C 50.022 26.606 50.038 24.309 50.039 26.104 C 50.038 28.736 48.663 30 46.453 30 L 6 29.986 C 3.79 29.986 2 28.196 2 25.986 L 2.008 6.491 C 2.008 3.535 5.196 2.627 7.085 3.316 C 10.708 4.731 33.992 14.944 43.782 19.218 Z", 234.0f);
            w3.a("M 47.421 16.941 C 50.544 18.191 50.783 19.91 50.769 22.706 C 50.761 24.484 50.76 23.953 50.79 26.073 C 50.814 27.835 49.334 30 47.124 30 L 5 30.01 C 2.79 30.01 1 28.22 1 26.01 L 1.001 10.823 C 1.001 8.218 3.532 6.895 5.572 7.26 C 7.493 8.01 47.421 16.941 47.421 16.941 Z", 267.0f);
            w3.a("M 47.641 17.125 C 50.641 18.207 51.09 19.935 51.078 22.653 C 51.07 24.191 51.062 21.23 51.088 23.063 C 51.109 24.886 49.587 27 47.377 27 L 5 27.009 C 2.79 27.009 1 25.219 1 23.009 L 0.983 11.459 C 0.983 8.908 3.414 7.522 5.476 7.838 C 7.138 8.486 47.641 17.125 47.641 17.125 Z", 300.0f);
            w3.a("M 48 7 C 50.21 7 52 8.79 52 11 C 52 19 52 19 52 19 C 52 21.21 50.21 23 48 23 L 4 23 C 1.79 23 0 21.21 0 19 L 0 11 C 0 8.79 1.79 7 4 7 C 48 7 48 7 48 7 Z", 383.0f);
            x3 = resources.getDrawable(R.drawable.msg_check_s).mutate();
            y3 = resources.getDrawable(R.drawable.msg_check_s).mutate();
            z3 = resources.getDrawable(R.drawable.msg_check_s).mutate();
            A3 = resources.getDrawable(R.drawable.msg_check_s).mutate();
            E3 = resources.getDrawable(R.drawable.msg_check_s).mutate();
            G3 = resources.getDrawable(R.drawable.msg_check_s).mutate();
            B3 = resources.getDrawable(R.drawable.msg_halfcheck).mutate();
            C3 = resources.getDrawable(R.drawable.msg_halfcheck).mutate();
            F3 = resources.getDrawable(R.drawable.msg_halfcheck_s).mutate();
            H3 = resources.getDrawable(R.drawable.msg_halfcheck_s).mutate();
            D3 = new xf7();
            K3 = resources.getDrawable(R.drawable.ic_lock_header).mutate();
            L3 = resources.getDrawable(R.drawable.msg_views).mutate();
            M3 = resources.getDrawable(R.drawable.msg_views).mutate();
            N3 = resources.getDrawable(R.drawable.msg_views).mutate();
            O3 = resources.getDrawable(R.drawable.msg_views).mutate();
            P3 = resources.getDrawable(R.drawable.msg_reply_small).mutate();
            Q3 = resources.getDrawable(R.drawable.msg_reply_small).mutate();
            R3 = resources.getDrawable(R.drawable.msg_reply_small).mutate();
            S3 = resources.getDrawable(R.drawable.msg_reply_small).mutate();
            T3 = resources.getDrawable(R.drawable.msg_pin_mini).mutate();
            U3 = resources.getDrawable(R.drawable.msg_pin_mini).mutate();
            V3 = resources.getDrawable(R.drawable.msg_pin_mini).mutate();
            W3 = resources.getDrawable(R.drawable.msg_pin_mini).mutate();
            Y3 = resources.getDrawable(R.drawable.msg_pin_mini).mutate();
            X3 = resources.getDrawable(R.drawable.msg_pin_mini).mutate();
            Z3 = resources.getDrawable(R.drawable.msg_views).mutate();
            a4 = resources.getDrawable(R.drawable.msg_reply_small).mutate();
            I3 = resources.getDrawable(R.drawable.msg_views).mutate();
            J3 = resources.getDrawable(R.drawable.msg_reply_small).mutate();
            b4 = resources.getDrawable(R.drawable.msg_actions).mutate();
            c4 = resources.getDrawable(R.drawable.msg_actions).mutate();
            d4 = resources.getDrawable(R.drawable.msg_actions).mutate();
            e4 = resources.getDrawable(R.drawable.msg_actions).mutate();
            f4 = resources.getDrawable(R.drawable.video_actions);
            g4 = resources.getDrawable(R.drawable.msg_instant).mutate();
            h4 = resources.getDrawable(R.drawable.msg_instant).mutate();
            i4 = resources.getDrawable(R.drawable.msg_warning);
            j4 = resources.getDrawable(R.drawable.list_mute).mutate();
            k4 = resources.getDrawable(R.drawable.ic_lock_header);
            Drawable mutate = resources.getDrawable(R.drawable.chat_calls_voice).mutate();
            Drawable[] drawableArr2 = F4;
            drawableArr2[0] = mutate;
            Drawable mutate2 = resources.getDrawable(R.drawable.chat_calls_voice).mutate();
            Drawable[] drawableArr3 = G4;
            drawableArr3[0] = mutate2;
            Drawable mutate3 = resources.getDrawable(R.drawable.chat_calls_voice).mutate();
            Drawable[] drawableArr4 = H4;
            drawableArr4[0] = mutate3;
            Drawable mutate4 = resources.getDrawable(R.drawable.chat_calls_voice).mutate();
            Drawable[] drawableArr5 = I4;
            drawableArr5[0] = mutate4;
            drawableArr2[1] = resources.getDrawable(R.drawable.chat_calls_video).mutate();
            drawableArr3[1] = resources.getDrawable(R.drawable.chat_calls_video).mutate();
            drawableArr4[1] = resources.getDrawable(R.drawable.chat_calls_video).mutate();
            drawableArr5[1] = resources.getDrawable(R.drawable.chat_calls_video).mutate();
            N4 = resources.getDrawable(R.drawable.chat_calls_outgoing).mutate();
            O4 = resources.getDrawable(R.drawable.chat_calls_incoming).mutate();
            P4 = resources.getDrawable(R.drawable.chat_calls_incoming).mutate();
            int i10 = 0;
            while (true) {
                drawableArr = L4;
                if (i10 >= 2) {
                    break;
                }
                J4[i10] = resources.getDrawable(R.drawable.poll_right).mutate();
                K4[i10] = resources.getDrawable(R.drawable.poll_wrong).mutate();
                drawableArr[i10] = resources.getDrawable(R.drawable.msg_emoji_objects).mutate();
                M4[i10] = resources.getDrawable(R.drawable.msg_psa).mutate();
                i10++;
            }
            U4 = resources.getDrawable(R.drawable.mini_call_out_16).mutate();
            V4 = resources.getDrawable(R.drawable.mini_call_out_16).mutate();
            W4 = resources.getDrawable(R.drawable.mini_call_in_16).mutate();
            X4 = resources.getDrawable(R.drawable.mini_call_in_16).mutate();
            l4 = resources.getDrawable(R.drawable.bot_file);
            m4 = resources.getDrawable(R.drawable.bot_music);
            n4 = resources.getDrawable(R.drawable.bot_location);
            u4 = resources.getDrawable(R.drawable.bot_link);
            w4 = resources.getDrawable(R.drawable.bot_lines);
            v4 = resources.getDrawable(R.drawable.bot_card);
            x4 = resources.getDrawable(R.drawable.bot_webview);
            y4 = resources.getDrawable(R.drawable.bot_invite);
            z4 = resources.getDrawable(R.drawable.permission_locked);
            A4 = resources.getDrawable(R.drawable.msg_msgbubble);
            B4 = resources.getDrawable(R.drawable.msg_msgbubble2);
            C4 = resources.getDrawable(R.drawable.msg_arrowright);
            D4 = resources.getDrawable(R.drawable.gradient_left);
            E4 = resources.getDrawable(R.drawable.gradient_right);
            o4 = resources.getDrawable(R.drawable.header_shadow).mutate();
            Q4 = resources.getDrawable(R.drawable.nophotos3);
            p4 = resources.getDrawable(R.drawable.filled_button_share).mutate();
            q4 = resources.getDrawable(R.drawable.filled_button_reply);
            r4 = resources.getDrawable(R.drawable.msg_voiceclose).mutate();
            s4 = resources.getDrawable(R.drawable.media_more).mutate();
            t4 = resources.getDrawable(R.drawable.filled_open_message);
            int L10 = gl.L(2.0f);
            RectF rectF = new RectF();
            Path path = new Path();
            Path[] pathArr = Y4;
            pathArr[0] = path;
            f10 = 1.0f;
            path.moveTo(gl.L(7.0f), gl.L(3.0f));
            pathArr[0].lineTo(gl.L(14.0f), gl.L(3.0f));
            pathArr[0].lineTo(gl.L(21.0f), gl.L(10.0f));
            pathArr[0].lineTo(gl.L(21.0f), gl.L(20.0f));
            int i11 = L10 << 1;
            f11 = 14.0f;
            rectF.set(gl.L(21.0f) - i11, gl.L(19.0f) - L10, gl.L(21.0f), gl.L(19.0f) + L10);
            pathArr[0].arcTo(rectF, 0.0f, 90.0f, false);
            pathArr[0].lineTo(gl.L(6.0f), gl.L(21.0f));
            rectF.set(gl.L(5.0f), gl.L(19.0f) - L10, gl.L(5.0f) + i11, gl.L(19.0f) + L10);
            pathArr[0].arcTo(rectF, 90.0f, 90.0f, false);
            pathArr[0].lineTo(gl.L(5.0f), gl.L(4.0f));
            rectF.set(gl.L(5.0f), gl.L(3.0f), gl.L(5.0f) + i11, gl.L(3.0f) + i11);
            pathArr[0].arcTo(rectF, 180.0f, 90.0f, false);
            pathArr[0].close();
            Path path2 = new Path();
            pathArr[1] = path2;
            path2.moveTo(gl.L(14.0f), gl.L(5.0f));
            pathArr[1].lineTo(gl.L(19.0f), gl.L(10.0f));
            pathArr[1].lineTo(gl.L(14.0f), gl.L(10.0f));
            pathArr[1].close();
            a5 = resources.getDrawable(R.drawable.filled_fire).mutate();
            b5 = resources.getDrawable(R.drawable.msg_round_gif_m).mutate();
            Drawable[][] drawableArr6 = T4;
            drawableArr6[0][0] = M(gl.L(44.0f), R.drawable.msg_round_play_m);
            drawableArr6[0][1] = M(gl.L(44.0f), R.drawable.msg_round_play_m);
            drawableArr6[1][0] = M(gl.L(44.0f), R.drawable.msg_round_pause_m);
            drawableArr6[1][1] = M(gl.L(44.0f), R.drawable.msg_round_pause_m);
            drawableArr6[2][0] = M(gl.L(44.0f), R.drawable.msg_round_load_m);
            drawableArr6[2][1] = M(gl.L(44.0f), R.drawable.msg_round_load_m);
            drawableArr6[3][0] = M(gl.L(44.0f), R.drawable.msg_round_file_s);
            drawableArr6[3][1] = M(gl.L(44.0f), R.drawable.msg_round_file_s);
            drawableArr6[4][0] = M(gl.L(44.0f), R.drawable.msg_round_cancel_m);
            drawableArr6[4][1] = M(gl.L(44.0f), R.drawable.msg_round_cancel_m);
            fm2 M10 = M(gl.L(44.0f), R.drawable.msg_contact);
            Drawable[] drawableArr7 = S4;
            drawableArr7[0] = M10;
            drawableArr7[1] = M(gl.L(44.0f), R.drawable.msg_contact);
            Drawable mutate5 = resources.getDrawable(R.drawable.msg_location).mutate();
            Drawable[] drawableArr8 = R4;
            drawableArr8[0] = mutate5;
            drawableArr8[1] = resources.getDrawable(R.drawable.msg_location).mutate();
            h3 = b00.d(context, R.drawable.compose_panel_shadow);
            i3 = b00.d(context, R.drawable.sheet_shadow_round);
            wl9 wl9Var = new wl9(b10);
            Paint paint = new Paint(1);
            wl9Var.b = paint;
            paint.setShadowLayer(gl.L(4.0f), 0.0f, 0.0f, 1593835520);
            j3 = wl9Var;
            cm.clear();
            dm.clear();
            Drawable drawable = w4;
            int i12 = ad;
            c("drawableBotInline", drawable, i12);
            c("drawableBotWebView", x4, i12);
            c("drawableBotLock", z4, i12);
            c("drawableBotLink", u4, i12);
            c("drawable_botInvite", y4, i12);
            c("drawableGoIcon", t4, i12);
            c("drawableCommentSticker", B4, i12);
            c("drawableMsgError", i4, wd);
            c("drawableMsgIn", l3, -1);
            c("drawableMsgInSelected", m3, -1);
            c("drawableMsgInMedia", p3, -1);
            c("drawableMsgInMediaSelected", q3, -1);
            c("drawableMsgInInstant", g4, td);
            c("drawableMsgOut", n3, -1);
            c("drawableMsgOutSelected", o3, -1);
            c("drawableMsgOutMedia", r3, -1);
            c("drawableMsgOutMediaSelected", s3, -1);
            Drawable drawable2 = drawableArr4[0];
            int i13 = Lb;
            c("drawableMsgOutCallAudio", drawable2, i13);
            Drawable drawable3 = drawableArr5[0];
            int i14 = Mb;
            c("drawableMsgOutCallAudioSelected", drawable3, i14);
            c("drawableMsgOutCallVideo", drawableArr4[1], i13);
            c("drawableMsgOutCallVideo", drawableArr5[1], i14);
            c("drawableMsgOutCheck", x3, zb);
            c("drawableMsgOutCheckSelected", y3, Ab);
            Drawable drawable4 = z3;
            int i15 = Bb;
            c("drawableMsgOutCheckRead", drawable4, i15);
            Drawable drawable5 = A3;
            int i16 = Cb;
            c("drawableMsgOutCheckReadSelected", drawable5, i16);
            c("drawableMsgOutHalfCheck", B3, i15);
            c("drawableMsgOutHalfCheckSelected", C3, i16);
            c("drawableMsgOutInstant", h4, i13);
            c("drawableMsgOutMenu", d4, Jb);
            c("drawableMsgOutMenuSelected", e4, Kb);
            Drawable drawable6 = V3;
            int i17 = Hb;
            c("drawableMsgOutPinned", drawable6, i17);
            Drawable drawable7 = W3;
            int i18 = Ib;
            c("drawableMsgOutPinnedSelected", drawable7, i18);
            c("drawableMsgOutReplies", R3, i17);
            c("drawableMsgOutReplies", S3, i18);
            c("drawableMsgOutViews", N3, i17);
            c("drawableMsgOutViewsSelected", O3, i18);
            Drawable drawable8 = G3;
            int i19 = Yc;
            c("drawableMsgStickerCheck", drawable8, i19);
            c("drawableMsgStickerHalfCheck", H3, i19);
            c("drawableMsgStickerPinned", X3, i19);
            c("drawableMsgStickerReplies", J3, i19);
            c("drawableMsgStickerViews", I3, i19);
            c("drawableReplyIcon", q4, i12);
            c("drawableCloseIcon", r4, i12);
            c("drawableMoreIcon", s4, i12);
            c("drawableShareIcon", p4, i12);
            c("drawableMuteIcon", j4, ed);
            c("drawableLockIcon", k4, fd);
            c("drawable_chat_pollHintDrawableOut", drawableArr[1], Nb);
            c("drawable_chat_pollHintDrawableIn", drawableArr[0], Ad);
            j(z10, false);
        }
        if (z10 || (textPaint = B2) == null) {
            return;
        }
        textPaint.setTextSize(gl.L(12.0f));
        C2.setTextSize(gl.L(12.0f));
        D2.setTextSize(gl.L(11.0f));
        F2.setTextSize(gl.L(15.0f));
        G2.setTextSize(gl.L(15.0f));
        H2.setTextSize(gl.L(13.0f));
        M2.setTextSize(gl.L(12.0f));
        E2.setTextSize(gl.L(12.0f));
        N2.setTextSize(gl.L(16.0f));
        O2.setTextSize(gl.L(15.0f));
        P2.setTextSize(gl.L(15.0f));
        Q2.setTextSize(gl.L(15.0f));
        R2.setTextSize(gl.L(13.0f));
        I2.setTextSize(gl.L(12.0f));
        V2.setTextSize(gl.L(r0));
        X2.setTextSize(gl.L(r0));
        Y2.setTextSize(gl.L(r0));
        float f12 = (((gba.S0 << 1) + 10) / 3.0f) - f10;
        c3.setTextSize(gl.L(f12));
        W2.setTextSize(gl.L(r0));
        T2.setTextSize(gl.L(f12));
        U2.setTextSize(gl.L(12.0f));
        S2.setTextSize(gl.L(12.0f));
        J2.setTextSize(gl.L(13.0f));
        K2.setTextSize(gl.L(13.0f));
        L2.setTextSize(gl.L(13.0f));
        W1.setStrokeWidth(gl.L(f10));
        Y1.setStrokeWidth(gl.L(1.1f));
        r2.setTextSize(gl.L(Math.max(16, gba.S0) - 2));
        s2.setTextSize(gl.L(Math.max(16, gba.S0) - 2));
        t2.setTextSize(gl.L(Math.max(16, gba.S0) - 3));
        u2.setTextSize(gl.L(Math.max(16, gba.S0)));
        e3.setTextSize(gl.L(15.0f));
        f3.setTextSize(gl.L(13.0f));
        j2.setStrokeWidth(gl.L(3.0f));
        k2.setStrokeWidth(gl.L(2.33f));
        d3.setTextSize(gl.L(f11));
        d3.setTypeface(gl.o());
    }

    public static ff0 J0(int i10, int i11, wjb wjbVar) {
        return i11 >= 0 ? new ff0(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i10}), new ColorDrawable(v0(i11, wjbVar)), new ColorDrawable(-1)) : f0(i10, 2, -1);
    }

    public static int J1(SparseIntArray sparseIntArray) {
        int i10 = ub;
        int i11 = vb;
        int i12 = qb;
        int[] iArr = {i12, tb, i10, i11};
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < 4; i17++) {
            int i18 = iArr[i17];
            if (i18 == i12 || sparseIntArray.indexOfKey(i18) >= 0) {
                int i19 = sparseIntArray.get(i18, gm[i18]);
                int red = Color.red(i19) + i13;
                int green = Color.green(i19) + i15;
                i14++;
                i16 = Color.blue(i19) + i16;
                i15 = green;
                i13 = red;
            }
        }
        return Color.rgb(i13 / i14, i15 / i14, i16 / i14);
    }

    public static ShapeDrawable K(int i10, int i11) {
        OvalShape ovalShape = new OvalShape();
        float f10 = i10;
        ovalShape.resize(f10, f10);
        ShapeDrawable shapeDrawable = new ShapeDrawable(ovalShape);
        shapeDrawable.setIntrinsicWidth(i10);
        shapeDrawable.setIntrinsicHeight(i10);
        shapeDrawable.getPaint().setColor(i11);
        return shapeDrawable;
    }

    public static ff0 K0(wjb wjbVar, boolean z10) {
        int v02 = v0(h6, wjbVar);
        return z10 ? J0(v02, c6, wjbVar) : f0(v02, 2, -1);
    }

    public static void K1(d dVar) {
        if (o != 0) {
            if (dVar != null) {
                try {
                    u21.b0(dVar).J(R.raw.auto_night_off, o == 3 ? k96.M0(2131753782, "AutoNightSystemModeOff") : k96.M0(2131753787, "AutoNightModeOff"), k96.M0(2131745303, "Settings"), 5000, false, new ro8(dVar, (byte) 27)).j();
                } catch (Exception e10) {
                    fa4.g(e10, true);
                }
            }
            o = 0;
            u1();
            A();
        }
    }

    public static ShapeDrawable L(int i10, int i11, int i12) {
        OvalShape ovalShape = new OvalShape();
        float f10 = i10;
        ovalShape.resize(f10, f10);
        ShapeDrawable shapeDrawable = new ShapeDrawable(ovalShape);
        shapeDrawable.setIntrinsicWidth(i10);
        shapeDrawable.setIntrinsicHeight(i10);
        shapeDrawable.getPaint().setShader(new LinearGradient(0.0f, 0.0f, 0.0f, f10, i11, i12, Shader.TileMode.CLAMP));
        return shapeDrawable;
    }

    public static ff0 L0(boolean z10) {
        int w02 = w0(null, h6, false);
        return z10 ? J0(w02, c6, null) : f0(w02, 2, -1);
    }

    public static void L1(k27 k27Var) {
        n40 n40Var = c5;
        if (n40Var == null) {
            return;
        }
        if (n40Var.i == null || k27Var == null) {
            n40Var.i = null;
            return;
        }
        HashMap hashMap = d5;
        if (hashMap == null) {
            hashMap = new HashMap();
            d5 = hashMap;
        }
        hashMap.put(k27Var, c5);
        c5.d(false, null);
        gl.d3(new os1(k27Var, (byte) 3), 200L);
        c5 = null;
    }

    public static fm2 M(int i10, int i11) {
        Drawable d10 = i11 != 0 ? b00.d(a.b, i11) : null;
        OvalShape ovalShape = new OvalShape();
        float f10 = i10;
        ovalShape.resize(f10, f10);
        ShapeDrawable shapeDrawable = new ShapeDrawable(ovalShape);
        shapeDrawable.getPaint().setColor(-1);
        fm2 fm2Var = new fm2(shapeDrawable, d10);
        fm2Var.h = i10;
        fm2Var.n = i10;
        return fm2Var;
    }

    public static Drawable M0(int i10, Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 29 && (drawable instanceof StateListDrawable)) {
            return ((StateListDrawable) drawable).getStateDrawable(i10);
        }
        if (um == null) {
            try {
                um = StateListDrawable.class.getDeclaredMethod("getStateDrawable", Integer.TYPE);
            } catch (Throwable unused) {
            }
        }
        Method method = um;
        if (method == null) {
            return null;
        }
        try {
            return (Drawable) method.invoke(drawable, Integer.valueOf(i10));
        } catch (Exception unused2) {
            return null;
        }
    }

    public static boolean M1(int i10, int i11) {
        float red = Color.red(i10) / 255.0f;
        float green = Color.green(i10) / 255.0f;
        float blue = Color.blue(i10) / 255.0f;
        return ((((((float) Color.blue(i11)) / 255.0f) * 0.5f) + (blue * 0.5f)) * 0.0722f) + (((((Color.green(i11) / 255.0f) * 0.5f) + (green * 0.5f)) * 0.7152f) + ((((Color.red(i11) / 255.0f) * 0.5f) + (red * 0.5f)) * 0.2126f)) > 0.705f || (blue * 0.0722f) + ((green * 0.7152f) + (red * 0.2126f)) > 0.705f;
    }

    public static ff0 N(int i10, int i11, int i12) {
        z.setColor(-1);
        return new ff0(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i10}), null, new ljb(i11, i12));
    }

    public static float[] N0(int i10) {
        ThreadLocal threadLocal = i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? rm : qm : pm : om : nm;
        float[] fArr = (float[]) threadLocal.get();
        if (fArr != null) {
            return fArr;
        }
        float[] fArr2 = new float[3];
        threadLocal.set(fArr2);
        return fArr2;
    }

    public static void O() {
        P();
        if (B2 == null) {
            B2 = new TextPaint(1);
            TextPaint textPaint = new TextPaint(1);
            C2 = textPaint;
            TextPaint i10 = de9.i(textPaint, 1);
            D2 = i10;
            TextPaint i11 = de9.i(i10, 1);
            F2 = i11;
            i11.setTypeface(gl.o());
            R1 = new Paint(1);
            Paint paint = new Paint(1);
            S1 = paint;
            Paint.Style style = Paint.Style.STROKE;
            paint.setStyle(style);
            Paint paint2 = S1;
            Paint.Cap cap = Paint.Cap.ROUND;
            paint2.setStrokeCap(cap);
            TextPaint textPaint2 = new TextPaint(1);
            G2 = textPaint2;
            H2 = de9.i(textPaint2, 1);
            Paint paint3 = new Paint();
            T1 = paint3;
            paint3.setPathEffect(b46.c());
            Paint paint4 = new Paint();
            U1 = paint4;
            paint4.setPathEffect(b46.c());
            Paint paint5 = new Paint();
            V1 = paint5;
            paint5.setPathEffect(b46.c());
            Paint paint6 = new Paint(1);
            j2 = paint6;
            paint6.setStrokeCap(cap);
            j2.setStyle(style);
            j2.setColor(-1610612737);
            Paint paint7 = new Paint(1);
            k2 = paint7;
            paint7.setStrokeCap(cap);
            k2.setStyle(style);
            M2 = new TextPaint(1);
            TextPaint textPaint3 = new TextPaint(1);
            E2 = textPaint3;
            textPaint3.setTypeface(Typeface.DEFAULT_BOLD);
            TextPaint textPaint4 = new TextPaint(1);
            N2 = textPaint4;
            O2 = de9.i(textPaint4, 1);
            TextPaint textPaint5 = new TextPaint(1);
            P2 = textPaint5;
            TextPaint i12 = de9.i(textPaint5, 1);
            Q2 = i12;
            R2 = de9.i(i12, 1);
            I2 = new TextPaint(1);
            TextPaint textPaint6 = new TextPaint(1);
            J2 = textPaint6;
            K2 = de9.i(textPaint6, 1);
            S2 = new TextPaint(1);
            T2 = new TextPaint(1);
            U2 = new TextPaint(1);
            TextPaint textPaint7 = new TextPaint(1);
            V2 = textPaint7;
            W2 = de9.i(textPaint7, 1);
            TextPaint textPaint8 = new TextPaint(1);
            X2 = textPaint8;
            Y2 = de9.i(textPaint8, 1);
            TextPaint textPaint9 = new TextPaint(1);
            c3 = textPaint9;
            b3 = de9.i(textPaint9, 1);
            d3 = new TextPaint(1);
            TextPaint textPaint10 = new TextPaint(1);
            L2 = textPaint10;
            textPaint10.setTypeface(gl.o());
            Paint paint8 = new Paint(1);
            W1 = paint8;
            paint8.setStyle(style);
            W1.setStrokeCap(cap);
            X1 = new Paint(1);
            Paint paint9 = new Paint(1);
            Y1 = paint9;
            paint9.setStyle(style);
            Y1.setStrokeCap(cap);
            Z1 = new Paint(1);
            a2 = new Paint(1);
            b2 = new Paint(1);
            Paint paint10 = new Paint(1);
            c2 = paint10;
            paint10.setStyle(style);
            c2.setStrokeCap(cap);
            r2 = new TextPaint(1);
            s2 = new TextPaint(1);
            t2 = new TextPaint(1);
            TextPaint i13 = de9.i(r2, 1);
            u2 = i13;
            i13.setTypeface(gl.o());
            Paint paint11 = new Paint(1);
            g2 = paint11;
            paint11.setColor(352321536);
            h2 = new Paint(1);
            TextPaint textPaint11 = new TextPaint(1);
            e3 = textPaint11;
            f3 = de9.i(textPaint11, 1);
            i2 = new Paint();
            new Paint(1);
            l2 = new Paint(1);
            m2 = new Paint(1);
            d2 = new Paint(1);
            e2 = new Paint(7);
            f2 = new Paint(7);
            d(xd, d2, "paintChatMessageBackgroundSelected");
            Paint paint12 = e2;
            int i14 = bd;
            d(i14, paint12, "paintChatActionBackground");
            d(i14, g2, "paintChatActionBackgroundDarken");
            d(cd, f2, "paintChatActionBackgroundSelected");
            TextPaint textPaint12 = r2;
            int i15 = Yc;
            d(i15, textPaint12, "paintChatActionText");
            d(i15, s2, "paintChatActionText2");
            d(i15, t2, "paintChatActionText3");
            d(Dd, P2, "paintChatBotButton");
            d(Ie, i2, "paintChatComposeBackground");
            d(md, h2, "paintChatTimeBackground");
        }
    }

    public static akb O0(String str) {
        return (akb) H.get(str);
    }

    public static void P() {
        synchronized (c) {
            if (n2 == null) {
                n2 = new TextPaint(1);
                w2 = new TextPaint(1);
                x2 = new TextPaint[6];
                y2 = new TextPaint(1);
                z2 = new TextPaint(1);
                A2 = new TextPaint(1);
                TextPaint textPaint = new TextPaint(1);
                v2 = textPaint;
                textPaint.setTypeface(gl.o());
                TextPaint textPaint2 = new TextPaint(1);
                V2 = textPaint2;
                textPaint2.setTypeface(gl.o());
                TextPaint textPaint3 = new TextPaint(1);
                X2 = textPaint3;
                textPaint3.setTypeface(gl.o());
                Y2 = new TextPaint(1);
                Z2 = new TextPaint(1);
                a3 = new TextPaint(1);
                b3 = new TextPaint(1);
                TextPaint textPaint4 = new TextPaint(1);
                c3 = textPaint4;
                textPaint4.setTypeface(gl.o());
                W2 = new TextPaint(1);
                T2 = new TextPaint(1);
                S2 = new TextPaint(1);
                TextPaint textPaint5 = new TextPaint(1);
                o2 = textPaint5;
                Typeface typeface = Typeface.MONOSPACE;
                textPaint5.setTypeface(typeface);
                TextPaint textPaint6 = new TextPaint(1);
                p2 = textPaint6;
                textPaint6.setTypeface(typeface);
                TextPaint textPaint7 = new TextPaint(1);
                q2 = textPaint7;
                textPaint7.setTypeface(typeface);
                new TextPaint(1);
                U2 = new TextPaint(1);
            }
            float[] fArr = {0.68f, 0.46f, 0.34f, 0.28f, 0.22f, 0.19f};
            int i10 = 0;
            while (true) {
                TextPaint[] textPaintArr = x2;
                if (i10 < textPaintArr.length) {
                    textPaintArr[i10] = new TextPaint(1);
                    x2[i10].setTextSize(gl.L(fArr[i10] * 120.0f));
                    i10++;
                } else {
                    y2.setTextSize(gl.L(46.0f));
                    z2.setTextSize(gl.L(38.0f));
                    A2.setTextSize(gl.L(30.0f));
                    n2.setTextSize(gl.L(gba.S0));
                    w2.setTextSize(gl.L(14.0f));
                    v2.setTextSize(gl.L(15.0f));
                    V2.setTextSize(gl.L(r1));
                    X2.setTextSize(gl.L(r1));
                    Y2.setTextSize(gl.L(r1));
                    float f10 = (((gba.S0 << 1) + 10) / 3.0f) - 1.0f;
                    Z2.setTextSize(gl.L(f10));
                    a3.setTextSize(gl.L(r1));
                    U2.setTextSize(gl.L(12.0f));
                    c3.setTextSize(gl.L(f10));
                    b3.setTextSize(gl.L(r1 - 2.0f));
                    W2.setTextSize(gl.L(r1));
                    T2.setTextSize(gl.L(f10));
                    o2.setTextSize(gl.L(Math.max(Math.min(10, gba.S0 - 1), gba.S0 - 2)));
                    p2.setTextSize(gl.L(Math.max(Math.min(10, gba.S0 - 2), gba.S0 - 3)));
                    q2.setTextSize(gl.L(Math.max(Math.min(10, gba.S0 - 2), gba.S0 - 5)));
                }
            }
        }
    }

    public static Drawable P0(String str) {
        return (Drawable) cm.get(str);
    }

    public static void Q(Context context) {
        if (j0 == null) {
            Paint paint = new Paint();
            j0 = paint;
            paint.setStrokeWidth(1.0f);
            Paint paint2 = new Paint();
            k0 = paint2;
            paint2.setStrokeWidth(1.0f);
            p0 = new Paint(1);
            Paint paint3 = new Paint(1);
            n0 = paint3;
            paint3.setStyle(Paint.Style.STROKE);
            n0.setStrokeWidth(gl.L(2.0f));
            n0.setStrokeCap(Paint.Cap.ROUND);
            Paint paint4 = new Paint(1);
            m0 = paint4;
            paint4.setColor(0);
            m0.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            o0 = new Paint(1);
            Paint paint5 = new Paint();
            l0 = paint5;
            paint5.setPathEffect(b46.c());
            Resources resources = context.getResources();
            Drawable drawable = resources.getDrawable(R.drawable.chats_saved);
            Drawable[] drawableArr = q0;
            drawableArr[0] = drawable;
            drawableArr[1] = resources.getDrawable(R.drawable.ghost);
            drawableArr[2] = resources.getDrawable(R.drawable.msg_folders_private);
            drawableArr[3] = resources.getDrawable(R.drawable.msg_folders_requests);
            drawableArr[4] = resources.getDrawable(R.drawable.msg_folders_groups);
            drawableArr[5] = resources.getDrawable(R.drawable.msg_folders_channels);
            drawableArr[6] = resources.getDrawable(R.drawable.msg_folders_bots);
            drawableArr[7] = resources.getDrawable(R.drawable.msg_folders_muted);
            drawableArr[8] = resources.getDrawable(R.drawable.msg_folders_read);
            drawableArr[9] = resources.getDrawable(R.drawable.msg_folders_archive);
            drawableArr[10] = resources.getDrawable(R.drawable.msg_folders_private);
            drawableArr[11] = resources.getDrawable(R.drawable.chats_replies);
            drawableArr[12] = resources.getDrawable(R.drawable.other_chats);
            drawableArr[13] = resources.getDrawable(R.drawable.msg_stories_closefriends);
            drawableArr[14] = resources.getDrawable(R.drawable.filled_gift_premium);
            drawableArr[15] = resources.getDrawable(R.drawable.filled_unknown);
            drawableArr[16] = resources.getDrawable(R.drawable.filled_unclaimed);
            drawableArr[17] = resources.getDrawable(R.drawable.large_repost_story);
            drawableArr[18] = resources.getDrawable(R.drawable.large_hidden);
            drawableArr[19] = resources.getDrawable(R.drawable.large_notes);
            drawableArr[20] = resources.getDrawable(R.drawable.filled_folder_new);
            drawableArr[21] = resources.getDrawable(R.drawable.filled_folder_existing);
            drawableArr[22] = resources.getDrawable(R.drawable.filled_giveaway_premium);
            drawableArr[23] = resources.getDrawable(R.drawable.filled_giveaway_stars);
            drawableArr[24] = resources.getDrawable(R.drawable.filled_suggest_chat_avatar);
            oy8 oy8Var = t1;
            if (oy8Var != null) {
                oy8Var.setCallback(null);
                t1.x(false);
            }
            oy8 oy8Var2 = u1;
            if (oy8Var2 != null) {
                oy8Var2.x(false);
            }
            oy8 oy8Var3 = v1;
            if (oy8Var3 != null) {
                oy8Var3.x(false);
            }
            oy8 oy8Var4 = w1;
            if (oy8Var4 != null) {
                oy8Var4.x(false);
            }
            oy8 oy8Var5 = x1;
            if (oy8Var5 != null) {
                oy8Var5.x(false);
            }
            oy8 oy8Var6 = y1;
            if (oy8Var6 != null) {
                oy8Var6.x(false);
            }
            t1 = new oy8(R.raw.chats_archiveavatar, gl.L(36.0f), gl.L(36.0f), false, null);
            u1 = new oy8(R.raw.chats_archive, gl.L(36.0f), gl.L(36.0f), false, null);
            v1 = new oy8(R.raw.chats_unarchive, gl.L(36.0f), gl.L(36.0f), false, null);
            w1 = new oy8(R.raw.chats_hide, gl.L(36.0f), gl.L(36.0f), false, null);
            x1 = new oy8(R.raw.chats_unhide, gl.L(36.0f), gl.L(36.0f), false, null);
            y1 = new oy8(R.raw.chat_audio_record_delete, gl.L(30.0f), gl.L(30.0f), false, null);
            G1 = new oy8(R.raw.swipe_mute, gl.L(36.0f), gl.L(36.0f), false, null);
            H1 = new oy8(R.raw.swipe_unmute, gl.L(36.0f), gl.L(36.0f), false, null);
            K1 = new oy8(R.raw.swipe_read, gl.L(36.0f), gl.L(36.0f), false, null);
            L1 = new oy8(R.raw.swipe_unread, gl.L(36.0f), gl.L(36.0f), false, null);
            I1 = new oy8(R.raw.swipe_delete, gl.L(36.0f), gl.L(36.0f), false, null);
            N1 = new oy8(R.raw.swipe_unpin, gl.L(36.0f), gl.L(36.0f), false, null);
            M1 = new oy8(R.raw.swipe_pin, gl.L(36.0f), gl.L(36.0f), false, null);
            J1 = new oy8(R.raw.swipe_community_ungroup, gl.L(28.0f), gl.L(28.0f), false, null);
            k();
        }
    }

    public static Drawable Q0(String str, wjb wjbVar) {
        Drawable drawable = wjbVar != null ? wjbVar.getDrawable(str) : null;
        return drawable != null ? drawable : (Drawable) cm.get(str);
    }

    public static ye7 R(int i10, int i11) {
        int i12;
        int i13;
        ye7 ye7Var = new ye7(-2368069, -9722489, -2762611, -7817084, i10 != 0, false);
        if (i10 <= 0 || i11 <= 0) {
            Point point = gl.q;
            int min = Math.min(point.x, point.y);
            int max = Math.max(point.x, point.y);
            mqc c10 = zqc.c();
            r1 = c10 != null ? c10.a : null;
            i12 = max;
            i13 = min;
        } else {
            i13 = i10;
            i12 = i11;
        }
        if (r1 == null) {
            r1 = lcb.c(1.0f, R.raw.default_pattern, i13, i12, -16777216, 2);
        }
        ye7Var.r(34, r1);
        ye7Var.s(ye7Var.f());
        return ye7Var;
    }

    public static SparseIntArray R0(File file, String str, String[] strArr) {
        boolean z10;
        FileInputStream fileInputStream;
        int intValue;
        SparseIntArray sparseIntArray = new SparseIntArray();
        FileInputStream fileInputStream2 = null;
        try {
            byte[] bArr = new byte[1024];
            fileInputStream = new FileInputStream(str != null ? p0(str) : file);
            int i10 = -1;
            int i11 = -1;
            int i12 = 0;
            boolean z11 = false;
            while (true) {
                try {
                    int read = fileInputStream.read(bArr);
                    if (read == i10) {
                        break;
                    }
                    int i13 = 0;
                    int i14 = 0;
                    int i15 = i12;
                    while (true) {
                        if (i13 >= read) {
                            break;
                        }
                        if (bArr[i13] == 10) {
                            int i16 = i13 - i14;
                            int i17 = i16 + 1;
                            String str2 = new String(bArr, i14, i16);
                            if (str2.startsWith("WLS=")) {
                                if (strArr != null && strArr.length > 0) {
                                    strArr[0] = str2.substring(4);
                                }
                            } else {
                                if (str2.startsWith("WPS")) {
                                    i11 = i15 + i17;
                                    z11 = true;
                                    break;
                                }
                                int indexOf = str2.indexOf(61);
                                if (indexOf != i10) {
                                    String substring = str2.substring(0, indexOf);
                                    String substring2 = str2.substring(indexOf + 1);
                                    if (substring2.length() <= 0 || substring2.charAt(0) != '#') {
                                        intValue = Utilities.z(substring2).intValue();
                                    } else {
                                        try {
                                            intValue = Color.parseColor(substring2);
                                        } catch (Exception unused) {
                                            intValue = Utilities.z(substring2).intValue();
                                        }
                                    }
                                    int d10 = lve.d(substring);
                                    if (d10 >= 0) {
                                        sparseIntArray.put(d10, intValue);
                                    }
                                }
                            }
                            i14 += i17;
                            i15 += i17;
                        }
                        i13++;
                        i10 = -1;
                    }
                    if (i12 == i15) {
                        break;
                    }
                    fileInputStream.getChannel().position(i15);
                    if (z11) {
                        break;
                    }
                    i12 = i15;
                    i10 = -1;
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream2 = fileInputStream;
                    z10 = true;
                    try {
                        fa4.g(th, true);
                        if (fileInputStream2 != null) {
                            try {
                                fileInputStream2.close();
                            } catch (Exception e10) {
                                e = e10;
                                fa4.g(e, z10);
                                return sparseIntArray;
                            }
                        }
                        return sparseIntArray;
                    } finally {
                    }
                }
            }
            sparseIntArray.put(f5, i11);
        } catch (Throwable th3) {
            th = th3;
        }
        try {
            fileInputStream.close();
        } catch (Exception e11) {
            e = e11;
            z10 = true;
            fa4.g(e, z10);
            return sparseIntArray;
        }
        return sparseIntArray;
    }

    public static void S(Context context) {
        Q(context);
        if (K0 == null) {
            TextPaint textPaint = new TextPaint(1);
            K0 = textPaint;
            TextPaint i10 = de9.i(textPaint, 1);
            L0 = i10;
            i10.setTypeface(gl.o());
            v0 = new Paint(1);
            s0 = new Paint(1);
            z0 = new Paint(1);
        }
        K0.setTextSize(gl.L(12.0f));
        L0.setTextSize(gl.L(13.0f));
        if (A0 == null) {
            Resources resources = context.getResources();
            A0 = new TextPaint[2];
            B0 = new TextPaint[2];
            E0 = new TextPaint[2];
            G0 = new TextPaint[2];
            for (int i11 = 0; i11 < 2; i11++) {
                A0[i11] = new TextPaint(1);
                A0[i11].setTypeface(gl.o());
                B0[i11] = new TextPaint(1);
                B0[i11].setTypeface(gl.o());
                E0[i11] = new TextPaint(1);
                G0[i11] = new TextPaint(1);
            }
            TextPaint textPaint2 = new TextPaint(1);
            C0 = textPaint2;
            TextPaint i12 = de9.i(textPaint2, 1);
            D0 = i12;
            TextPaint i13 = de9.i(i12, 1);
            F0 = i13;
            H0 = de9.i(i13, 1);
            I0 = new TextPaint(1);
            J0 = new TextPaint(1);
            TextPaint textPaint3 = new TextPaint(1);
            M0 = textPaint3;
            TextPaint i14 = de9.i(textPaint3, 1);
            N0 = i14;
            O0 = de9.i(i14, 1);
            P0 = new TextPaint(1);
            TextPaint textPaint4 = new TextPaint(1);
            Q0 = textPaint4;
            textPaint4.setTypeface(gl.o());
            t0 = new Paint();
            u0 = new Paint(1);
            x0 = new Paint(1);
            w0 = new Paint(1);
            y0 = new Paint(1);
            Z0 = resources.getDrawable(R.drawable.list_secret);
            a1 = resources.getDrawable(R.drawable.msg_mini_lock2);
            S0 = resources.getDrawable(R.drawable.list_check).mutate();
            R0 = resources.getDrawable(R.drawable.community_cards).mutate();
            T0 = resources.getDrawable(R.drawable.minithumb_play).mutate();
            U0 = resources.getDrawable(R.drawable.list_check).mutate();
            V0 = resources.getDrawable(R.drawable.list_halfcheck);
            W0 = new xf7();
            X0 = resources.getDrawable(R.drawable.list_warning_sign);
            Y0 = resources.getDrawable(R.drawable.list_reorder).mutate();
            b1 = resources.getDrawable(R.drawable.list_mute).mutate();
            c1 = resources.getDrawable(R.drawable.list_unmute).mutate();
            d1 = resources.getDrawable(R.drawable.mini_ephemeral_hidden_16).mutate();
            e1 = resources.getDrawable(R.drawable.verified_area).mutate();
            f1 = new gq9(0);
            g1 = new gq9(1);
            h1 = resources.getDrawable(R.drawable.verified_check).mutate();
            l1 = resources.getDrawable(R.drawable.filled_chatlist_mention).mutate();
            m1 = resources.getDrawable(R.drawable.filled_chatlist_reaction).mutate();
            n1 = resources.getDrawable(R.drawable.filled_chatlist_poll).mutate();
            o1 = resources.getDrawable(R.drawable.filled_chatlist_mention).mutate();
            p1 = resources.getDrawable(R.drawable.filled_chatlist_reaction).mutate();
            q1 = resources.getDrawable(R.drawable.filled_chatlist_poll).mutate();
            i1 = resources.getDrawable(R.drawable.list_pin);
            j1 = resources.getDrawable(R.drawable.msg_pin_mini).mutate();
            k1 = resources.getDrawable(R.drawable.msg_pin_mini).mutate();
            s1 = resources.getDrawable(R.drawable.msg_mini_forumarrow);
            r0 = resources.getDrawable(R.drawable.preview_arrow);
            RectF rectF = new RectF();
            Path path = new Path();
            Path[] pathArr = Z4;
            pathArr[0] = path;
            pathArr[2] = new Path();
            float L10 = gl.L(12.0f);
            float L11 = gl.L(12.0f);
            rectF.set(L10 - gl.L(5.0f), L11 - gl.L(5.0f), gl.L(5.0f) + L10, gl.L(5.0f) + L11);
            pathArr[2].arcTo(rectF, -160.0f, -110.0f, true);
            pathArr[2].arcTo(rectF, 20.0f, -110.0f, true);
            pathArr[0].moveTo(L10, gl.L(8.0f) + L11);
            pathArr[0].lineTo(L10, gl.L(2.0f) + L11);
            pathArr[0].lineTo(gl.L(3.0f) + L10, gl.L(5.0f) + L11);
            pathArr[0].close();
            pathArr[0].moveTo(L10, L11 - gl.L(8.0f));
            pathArr[0].lineTo(L10, L11 - gl.L(2.0f));
            pathArr[0].lineTo(L10 - gl.L(3.0f), L11 - gl.L(5.0f));
            pathArr[0].close();
            n();
        }
        F0.setTextSize(gl.L(14.0f));
        H0.setTextSize(gl.L(12.0f));
        I0.setTextSize(gl.L(12.0f));
        I0.setTypeface(gl.o());
        J0.setTextSize(gl.L(12.0f));
        J0.setTypeface(gl.o());
        M0.setTextSize(gl.L(13.0f));
        N0.setTextSize(gl.L(11.0f));
        O0.setTextSize(gl.L(15.0f));
        P0.setTextSize(gl.L(15.0f));
        Q0.setTextSize(gl.L(10.0f));
        C0.setTextSize(gl.L(16.0f));
        D0.setTextSize(gl.L(16.0f));
    }

    public static float S0(float f10) {
        return (f10 >= 0.0f || I.o()) ? f10 : -f10;
    }

    public static ojb T(Context context) {
        return U(context, w0(null, t5, false), w0(null, u5, false));
    }

    public static Paint T0(String str) {
        return Objects.equals(str, "paintDivider") ? j0 : (Paint) em.get(str);
    }

    public static ojb U(Context context, int i10, int i11) {
        Resources resources = context.getResources();
        Drawable mutate = resources.getDrawable(R.drawable.search_dark).mutate();
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(i10, mode));
        Drawable mutate2 = resources.getDrawable(R.drawable.search_dark_activated).mutate();
        mutate2.setColorFilter(new PorterDuffColorFilter(i11, mode));
        ojb ojbVar = new ojb();
        ojbVar.addState(new int[]{android.R.attr.state_enabled, android.R.attr.state_focused}, mutate2);
        ojbVar.addState(new int[]{android.R.attr.state_focused}, mutate2);
        ojbVar.addState(StateSet.WILD_CARD, mutate);
        return ojbVar;
    }

    public static Paint U0(String str, wjb wjbVar) {
        Paint d10;
        return (wjbVar == null || (d10 = wjbVar.d(str)) == null) ? T0(str) : d10;
    }

    public static ojb V(Context context, int i10, int i11, int i12) {
        Resources resources = context.getResources();
        Drawable mutate = resources.getDrawable(i10).mutate();
        if (i11 != 0) {
            mutate.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.MULTIPLY));
        }
        Drawable mutate2 = resources.getDrawable(i10).mutate();
        if (i12 != 0) {
            mutate2.setColorFilter(new PorterDuffColorFilter(i12, PorterDuff.Mode.MULTIPLY));
        }
        ojb ojbVar = new ojb();
        ojbVar.setEnterFadeDuration(1);
        ojbVar.setExitFadeDuration(kk7.d3);
        ojbVar.addState(new int[]{android.R.attr.state_selected}, mutate2);
        ojbVar.addState(new int[0], mutate);
        return ojbVar;
    }

    public static Drawable V0(Context context, int i10, int i11) {
        if (context == null) {
            return null;
        }
        Drawable d10 = b00.d(context, i10);
        d10.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.MULTIPLY));
        return d10;
    }

    public static ff0 W(float f10, int i10, int i11, int i12, int i13, int i14) {
        z.setColor(-1);
        return new ff0(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i10}), null, new rjb(i11, i12, i13, i14, f10));
    }

    public static Drawable W0(Context context, int i10, int i11) {
        return V0(context, i10, w0(null, i11, false));
    }

    public static void X(Context context) {
        if (P1 == null) {
            O1 = new TextPaint(1);
            Resources resources = context.getResources();
            P1 = resources.getDrawable(R.drawable.verified_area).mutate();
            Q1 = resources.getDrawable(R.drawable.verified_check).mutate();
            p();
        }
        O1.setTextSize(gl.L(16.0f));
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Drawable X0(boolean z10) {
        File file;
        int i10;
        Throwable th2;
        FileInputStream fileInputStream;
        int i11 = km.get(De);
        mqc mqcVar = null;
        if (i11 != 0) {
            int i12 = km.get(Ee);
            int i13 = km.get(Fe);
            int i14 = km.get(Ge);
            km.get(He, -1);
            zjb i15 = I.i(false);
            if (i15 != null && !TextUtils.isEmpty(i15.o) && M == null) {
                mqcVar = zqc.d(i15.o);
            }
            if (i12 == 0 && mqcVar == null) {
                return new ColorDrawable(i11);
            }
            ye7 ye7Var = new ye7(i11, i12, i13, i14, true, false);
            if (mqcVar != null) {
                ye7Var.r((int) (i15.p * 100.0f), mqcVar.a);
                ye7Var.s(ye7Var.f());
            }
            return ye7Var;
        }
        if (f0 > 0) {
            akb akbVar = I;
            if (akbVar.b != null || akbVar.d != null) {
                String str = akbVar.d;
                file = str != null ? p0(str) : new File(I.b);
                i10 = f0;
                if (file != null) {
                    try {
                        try {
                            if (z10) {
                                FileInputStream fileInputStream2 = new FileInputStream(file);
                                try {
                                    BitmapFactory.Options options = new BitmapFactory.Options();
                                    options.inJustDecodeBounds = true;
                                    long j10 = i10;
                                    fileInputStream2.getChannel().position(j10);
                                    BitmapFactory.decodeStream(fileInputStream2, null, options);
                                    float f10 = options.outWidth;
                                    float f11 = options.outHeight;
                                    int L10 = gl.L(100.0f);
                                    int i16 = 1;
                                    while (true) {
                                        f10 /= 2.0f;
                                        float f12 = L10;
                                        if (f10 < f12) {
                                            break;
                                        }
                                        f11 /= 2.0f;
                                        if (f11 < f12) {
                                            break;
                                        }
                                        i16 <<= 1;
                                    }
                                    options.inJustDecodeBounds = false;
                                    options.inSampleSize = i16;
                                    fileInputStream2.getChannel().position(j10);
                                    Bitmap decodeStream = BitmapFactory.decodeStream(fileInputStream2, null, options);
                                    if (decodeStream == null) {
                                        fileInputStream2.close();
                                        return null;
                                    }
                                    BitmapDrawable bitmapDrawable = new BitmapDrawable(decodeStream);
                                    try {
                                        fileInputStream2.close();
                                        return bitmapDrawable;
                                    } catch (Exception e10) {
                                        fa4.g(e10, true);
                                        return bitmapDrawable;
                                    }
                                } catch (Throwable th3) {
                                    fileInputStream = fileInputStream2;
                                    th2 = th3;
                                    try {
                                        fa4.g(th2, true);
                                        if (fileInputStream != null) {
                                            fileInputStream.close();
                                        }
                                        return null;
                                    } finally {
                                    }
                                }
                            } else {
                                Bitmap l12 = l1(new FileInputStream(file), i10);
                                if (l12 != null) {
                                    return new BitmapDrawable(l12);
                                }
                            }
                        } catch (Throwable th4) {
                            th2 = th4;
                            fileInputStream = null;
                        }
                    } catch (Exception e11) {
                        fa4.g(e11, true);
                    }
                }
                return null;
            }
        }
        file = null;
        i10 = 0;
        if (file != null) {
        }
        return null;
    }

    public static ff0 Y(int i10, int i11, int i12) {
        z.setColor(-1);
        return new ff0(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i10}), null, new xjb(i11, i12));
    }

    public static int Y0(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return i10 | (-16777216);
    }

    public static ff0 Z(int i10, int i11, int i12, int i13) {
        z.setColor(-1);
        float f10 = i12;
        float f11 = i13;
        return new ff0(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i11}), c0(gl.L(f10), gl.L(f11), i10), new xjb(f10, f11));
    }

    public static String Z0(vjb vjbVar) {
        String str;
        if (vjbVar == null || TextUtils.isEmpty(vjbVar.c) || vjbVar.c.equals("d")) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        if (vjbVar.i) {
            sb2.append("blur");
        }
        if (vjbVar.j) {
            if (sb2.length() > 0) {
                sb2.append("+");
            }
            sb2.append("motion");
        }
        int i10 = vjbVar.d;
        if (i10 == 0) {
            str = "https://attheme.org?slug=" + vjbVar.c;
        } else {
            String lowerCase = String.format("%02x%02x%02x", Integer.valueOf(((byte) (i10 >> 16)) & 255), Integer.valueOf(((byte) (vjbVar.d >> 8)) & 255), Byte.valueOf((byte) (vjbVar.d & kk7.d4))).toLowerCase();
            int i11 = vjbVar.e;
            String lowerCase2 = i11 != 0 ? String.format("%02x%02x%02x", Integer.valueOf(((byte) (i11 >> 16)) & 255), Integer.valueOf(((byte) (vjbVar.e >> 8)) & 255), Byte.valueOf((byte) (vjbVar.e & kk7.d4))).toLowerCase() : null;
            int i12 = vjbVar.f;
            String lowerCase3 = i12 != 0 ? String.format("%02x%02x%02x", Integer.valueOf(((byte) (i12 >> 16)) & 255), Integer.valueOf(((byte) (vjbVar.f >> 8)) & 255), Byte.valueOf((byte) (vjbVar.f & kk7.d4))).toLowerCase() : null;
            int i13 = vjbVar.g;
            String lowerCase4 = i13 != 0 ? String.format("%02x%02x%02x", Integer.valueOf(((byte) (i13 >> 16)) & 255), Integer.valueOf(((byte) (vjbVar.g >> 8)) & 255), Byte.valueOf((byte) (vjbVar.g & kk7.d4))).toLowerCase() : null;
            if (lowerCase2 != null) {
                if (lowerCase3 == null) {
                    StringBuilder k10 = b00.k(tb4.p(lowerCase, "-", lowerCase2), "&rotation=");
                    k10.append(vjbVar.h);
                    lowerCase = k10.toString();
                } else if (lowerCase4 != null) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(lowerCase);
                    sb3.append("~");
                    sb3.append(lowerCase2);
                    sb3.append("~");
                    sb3.append(lowerCase3);
                    lowerCase = b00.j(sb3, "~", lowerCase4);
                } else {
                    lowerCase = lowerCase + "~" + lowerCase2 + "~" + lowerCase3;
                }
            }
            str = "https://attheme.org?slug=" + vjbVar.c + "&intensity=" + ((int) (vjbVar.k * 100.0f)) + "&bg_color=" + lowerCase;
        }
        if (sb2.length() <= 0) {
            return str;
        }
        StringBuilder k11 = b00.k(str, "&mode=");
        k11.append(sb2.toString());
        return k11.toString();
    }

    public static int a(float f10, float f11, int i10) {
        float[] N02 = N0(5);
        Color.colorToHSV(i10, N02);
        float f12 = N02[1];
        if (f12 > 0.1f && f12 < 0.9f) {
            N02[1] = moe.a(f12 + f10, 0.0f, 1.0f);
        }
        N02[2] = moe.a(N02[2] + f11, 0.0f, 1.0f);
        return Color.HSVToColor(Color.alpha(i10), N02);
    }

    public static ff0 a0(int i10, int i11, int i12, int i13, int i14) {
        z.setColor(-1);
        xjb xjbVar = new xjb();
        xjbVar.a = new Path();
        xjbVar.b = new float[]{r5, r5, r5, r5, r5, r5, r5, r5};
        xjbVar.c = true;
        float L10 = gl.L(i11);
        float L11 = gl.L(i12);
        float L12 = gl.L(i13);
        float L13 = gl.L(i14);
        return new ff0(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i10}), null, xjbVar);
    }

    public static boolean a1() {
        return P && I.j0 != null;
    }

    public static int b(int i10, int i11) {
        float[] N02 = N0(5);
        Color.colorToHSV(i11, N02);
        float f10 = N02[0];
        float f11 = N02[1];
        Color.colorToHSV(i10, N02);
        N02[0] = f10;
        N02[1] = gl.R1(N02[1], f11, 0.25f);
        return Color.HSVToColor(Color.alpha(i10), N02);
    }

    public static ShapeDrawable b0(int i10, int i11) {
        float f10 = i10;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{f10, f10, f10, f10, f10, f10, f10, f10}, null, null));
        shapeDrawable.getPaint().setColor(i11);
        return shapeDrawable;
    }

    public static boolean b1() {
        return Y != null;
    }

    public static void c(String str, Drawable drawable, int i10) {
        cm.put(str, drawable);
        dm.put(str, Integer.valueOf(i10));
    }

    public static ShapeDrawable c0(int i10, int i11, int i12) {
        float f10 = i10;
        float f11 = i11;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{f10, f10, f10, f10, f11, f11, f11, f11}, null, null));
        shapeDrawable.getPaint().setColor(i12);
        return shapeDrawable;
    }

    public static boolean c1(int i10) {
        float[] N02 = N0(3);
        Color.colorToHSV(i10, N02);
        float f10 = N02[1];
        return f10 > 0.1f && f10 < 0.9f;
    }

    public static void d(int i10, Paint paint, String str) {
        em.put(str, paint);
        fm.put(str, Integer.valueOf(i10));
    }

    public static InsetDrawable d0(int i10, int i11) {
        float f10 = i10;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{f10, f10, f10, f10, f10, f10, f10, f10}, null, null));
        shapeDrawable.getPaint().setColor(i11);
        shapeDrawable.getPaint().setShadowLayer(gl.N(2.0f), 0.0f, gl.N(0.33f), p1(Color.alpha(i11) / 255.0f, 285212672));
        return new InsetDrawable((Drawable) shapeDrawable, gl.L(3.0f), gl.L(3.0f), gl.L(3.0f), gl.L(3.0f));
    }

    public static boolean d1(int i10) {
        return km.indexOfKey(i10) >= 0;
    }

    public static void e(SparseIntArray sparseIntArray, SparseIntArray sparseIntArray2, boolean z10) {
        if (z10) {
            int i10 = nl;
            if (sparseIntArray.indexOfKey(i10) < 0) {
                sparseIntArray2.put(i10, p1(0.1f, -1));
            }
        }
        int[] iArr = gm;
        int i11 = qa;
        int i12 = sparseIntArray2.get(i11, iArr[i11]);
        int J12 = J1(sparseIntArray2);
        int i13 = pl;
        if (sparseIntArray.indexOfKey(i13) < 0) {
            sparseIntArray2.put(i13, w(i12, z10, false));
        }
        int i14 = ql;
        if (sparseIntArray.indexOfKey(i14) < 0) {
            sparseIntArray2.put(i14, w(i12, z10, true));
        }
        int i15 = rl;
        if (sparseIntArray.indexOfKey(i15) < 0) {
            sparseIntArray2.put(i15, w(J12, z10, false));
        }
        int i16 = sl;
        if (sparseIntArray.indexOfKey(i16) < 0) {
            sparseIntArray2.put(i16, w(J12, z10, true));
        }
        int i17 = tl;
        if (sparseIntArray.indexOfKey(i17) < 0) {
            sparseIntArray2.put(i17, x(z10, false, true, i12));
        }
        int i18 = ul;
        if (sparseIntArray.indexOfKey(i18) < 0) {
            sparseIntArray2.put(i18, x(z10, true, true, J12));
        }
        int i19 = vl;
        if (sparseIntArray.indexOfKey(i19) < 0) {
            sparseIntArray2.put(i19, x(z10, false, false, i12));
        }
        int i20 = wl;
        if (sparseIntArray.indexOfKey(i20) < 0) {
            sparseIntArray2.put(i20, x(z10, true, false, J12));
        }
    }

    public static ff0 e0(int i10, int i11) {
        return f0(i10, i11, -1);
    }

    public static boolean e1() {
        akb akbVar = I;
        if (akbVar.T && akbVar.Z == n) {
            return false;
        }
        return km.indexOfKey(De) >= 0 || f0 > 0 || !TextUtils.isEmpty(g0);
    }

    public static void f(SparseIntArray sparseIntArray, SparseIntArray sparseIntArray2, boolean z10) {
        int[] iArr = gm;
        int i10 = qa;
        int i11 = sparseIntArray2.get(i10, iArr[i10]);
        int J12 = J1(sparseIntArray2);
        int i12 = hl;
        if (sparseIntArray.indexOfKey(i12) < 0) {
            sparseIntArray2.put(i12, y(i11, z10, false));
        }
        int i13 = il;
        if (sparseIntArray.indexOfKey(i13) < 0) {
            sparseIntArray2.put(i13, y(J12, z10, true));
        }
        int i14 = jl;
        if (sparseIntArray.indexOfKey(i14) < 0) {
            sparseIntArray2.put(i14, z(i11, z10, false));
        }
        int i15 = kl;
        if (sparseIntArray.indexOfKey(i15) < 0) {
            sparseIntArray2.put(i15, z(J12, z10, true));
        }
        int i16 = ml;
        if (sparseIntArray.indexOfKey(i16) < 0) {
            int i17 = Qb;
            sparseIntArray2.put(i16, p1(0.2f, sparseIntArray2.get(i17, iArr[i17])));
        }
        if (z10) {
            int i18 = ll;
            if (sparseIntArray.indexOfKey(i18) < 0) {
                int i19 = Od;
                sparseIntArray2.put(i18, p1(0.2f, sparseIntArray2.get(i19, iArr[i19])));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ff0 f0(int i10, int i11, int i12) {
        Drawable drawable;
        if (i11 != 1 && i11 != 5) {
            if (i11 == 1 || i11 == 3 || i11 == 4 || i11 == 5 || i11 == 6 || i11 == 7) {
                z.setColor(-1);
                drawable = new pjb(i11, i12);
            } else if (i11 == 2) {
                drawable = new ColorDrawable(-1);
            }
            ff0 ff0Var = new ff0(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i10}), null, drawable);
            if (i11 == 1) {
                if (i11 == 5) {
                    ff0Var.setRadius(-1);
                }
                return ff0Var;
            }
            if (i12 <= 0) {
                i12 = gl.L(20.0f);
            }
            ff0Var.setRadius(i12);
            return ff0Var;
        }
        drawable = null;
        ff0 ff0Var2 = new ff0(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i10}), null, drawable);
        if (i11 == 1) {
        }
    }

    public static boolean f1() {
        return lm != null;
    }

    public static void g(Drawable drawable) {
        Bitmap bitmap;
        if (d2 == null) {
            return;
        }
        int i10 = km.get(xd);
        boolean z10 = (drawable instanceof ye7) && gba.o() != 0 && i10 == 0;
        if (z10 && X != (bitmap = ((ye7) drawable).k)) {
            X = bitmap;
            Bitmap bitmap2 = X;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            Y = new BitmapShader(bitmap2, tileMode, tileMode);
            if (Z == null) {
                Z = new Matrix();
            }
        }
        if (Y != null && i10 == 0 && z10) {
            ColorMatrix colorMatrix = new ColorMatrix();
            gl.i(colorMatrix, 2.5f);
            gl.l2(colorMatrix, 0.75f);
            d2.setShader(Y);
            d2.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            d2.setAlpha(64);
            return;
        }
        Paint paint = d2;
        if (i10 == 0) {
            i10 = TLObject.FLAG_30;
        }
        paint.setColor(i10);
        d2.setColorFilter(null);
        d2.setShader(null);
    }

    public static ff0 g0(int i10, int i11) {
        return new ff0(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i11}), new ColorDrawable(i10), new ColorDrawable(i10));
    }

    public static boolean g1(wjb wjbVar) {
        return wjbVar != null ? wjbVar.e() : gba.D0;
    }

    public static void h() {
        Drawable drawable = d0;
        if (drawable != null) {
            i(drawable);
        }
    }

    public static ff0 h0(int i10, int i11, int i12) {
        OvalShape ovalShape = new OvalShape();
        float f10 = i10;
        ovalShape.resize(f10, f10);
        ShapeDrawable shapeDrawable = new ShapeDrawable(ovalShape);
        shapeDrawable.getPaint().setColor(i11);
        ShapeDrawable shapeDrawable2 = new ShapeDrawable(ovalShape);
        shapeDrawable2.getPaint().setColor(-1);
        return new ff0(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i12}), shapeDrawable, shapeDrawable2);
    }

    public static boolean h1() {
        return I.o();
    }

    public static void i(Drawable drawable) {
        int valueAt;
        int valueAt2;
        int i10;
        int i11;
        int i12;
        boolean z10;
        Bitmap bitmap;
        if (e2 == null) {
            return;
        }
        W = b0;
        a0 = c0;
        boolean z11 = gba.D0;
        int i13 = bd;
        if (z11) {
            int w02 = w0(null, ta, false);
            int w03 = w0(null, Da, false);
            valueAt = bm2.k(w03, w02);
            valueAt2 = bm2.k(bm2.o(w03, Math.min(kk7.d4, Color.alpha(w03) << 1)), w02);
            W = valueAt;
            a0 = valueAt2;
        } else {
            int indexOfKey = km.indexOfKey(i13);
            valueAt = indexOfKey >= 0 ? km.valueAt(indexOfKey) : W;
            int indexOfKey2 = km.indexOfKey(cd);
            valueAt2 = indexOfKey2 >= 0 ? km.valueAt(indexOfKey2) : a0;
        }
        if (z11 || !((((z10 = drawable instanceof ye7)) || (drawable instanceof BitmapDrawable)) && gba.o() != 0 && e66.e(32))) {
            X = null;
            Y = null;
            if (z11) {
                i12 = Ea;
                i10 = Fa;
                i11 = i12;
            } else {
                int i14 = Yc;
                int i15 = Zc;
                i10 = ad;
                i11 = i14;
                i12 = i15;
            }
            B1(i11, X3);
            B1(i11, G3);
            B1(i11, H3);
            B1(i11, I3);
            B1(i11, J3);
            r2.setColor(w0(null, i11, false));
            s2.setColor(w0(null, i11, false));
            t2.setColor(w0(null, i11, false));
            r2.linkColor = w0(null, i12, false);
            u2.setColor(w0(null, i11, false));
            B1(i10, B4);
            B1(i10, p4);
            B1(i10, q4);
            B1(i10, t4);
            B1(i10, w4);
            B1(i10, x4);
            B1(i10, z4);
            B1(i10, y4);
            B1(i10, u4);
            P2.setColor(w0(null, z11 ? Ga : Dd, false));
            Drawable drawable2 = r4;
            if (z11) {
                B1(i10, drawable2);
                B1(i10, s4);
            } else {
                if (drawable2 != null) {
                    drawable2.setColorFilter(null);
                }
                Drawable drawable3 = s4;
                if (drawable3 != null) {
                    drawable3.setColorFilter(null);
                }
            }
        } else {
            if (z10) {
                bitmap = ((ye7) drawable).k;
            } else {
                if (drawable instanceof BitmapDrawable) {
                    WeakReference weakReference = zm;
                    if (weakReference == null || weakReference.get() != drawable) {
                        WeakReference weakReference2 = zm;
                        if (weakReference2 != null) {
                            weakReference2.clear();
                        }
                        zm = null;
                        if (drawable.getIntrinsicWidth() == 0 || drawable.getIntrinsicHeight() == 0) {
                            Am = null;
                        } else {
                            zm = new WeakReference(drawable);
                            int intrinsicWidth = (int) ((drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight()) * 24.0f);
                            Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, 24, Bitmap.Config.ARGB_8888);
                            drawable.setBounds(0, 0, intrinsicWidth, 24);
                            ColorFilter colorFilter = drawable.getColorFilter();
                            ColorMatrix colorMatrix = new ColorMatrix();
                            colorMatrix.setSaturation(1.3f);
                            gl.l2(colorMatrix, 0.94f);
                            drawable.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                            drawable.draw(new Canvas(createBitmap));
                            drawable.setColorFilter(colorFilter);
                            Utilities.blurBitmap(createBitmap, 3);
                            Am = createBitmap;
                            bitmap = createBitmap;
                        }
                    } else {
                        bitmap = Am;
                    }
                }
                bitmap = null;
            }
            if (X != bitmap) {
                X = bitmap;
                Bitmap bitmap2 = X;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                Y = new BitmapShader(bitmap2, tileMode, tileMode);
                if (Build.VERSION.SDK_INT >= 33) {
                    Y.setFilterMode(2);
                }
                if (Z == null) {
                    Z = new Matrix();
                }
            }
            A1(-1, X3);
            A1(-1, G3);
            A1(-1, H3);
            A1(-1, I3);
            A1(-1, J3);
            r2.setColor(-1);
            s2.setColor(-1);
            t2.setColor(-1);
            r2.linkColor = -1;
            u2.setColor(-1);
            P2.setColor(-1);
            A1(-1, B4);
            A1(-1, p4);
            A1(-1, q4);
            A1(-1, t4);
            A1(-1, w4);
            A1(-1, x4);
            A1(-1, z4);
            A1(-1, y4);
            A1(-1, u4);
        }
        e2.setColor(valueAt);
        f2.setColor(valueAt2);
        if (Y == null || !(km.indexOfKey(i13) < 0 || (drawable instanceof ye7) || (drawable instanceof BitmapDrawable))) {
            e2.setColorFilter(null);
            e2.setShader(null);
            f2.setColorFilter(null);
            f2.setShader(null);
            g2.setAlpha(z11 ? 0 : 21);
            return;
        }
        ColorMatrix colorMatrix2 = new ColorMatrix();
        if (drawable instanceof ye7) {
            if (((ye7) drawable).q >= 0.0f) {
                colorMatrix2.setSaturation(1.6f);
                gl.l2(colorMatrix2, I.o() ? 0.97f : 0.92f);
                gl.h(colorMatrix2, I.o() ? 0.12f : -0.06f);
            } else {
                colorMatrix2.setSaturation(1.1f);
                gl.l2(colorMatrix2, I.o() ? 0.4f : 0.8f);
                gl.h(colorMatrix2, I.o() ? 0.08f : -0.06f);
            }
        } else {
            colorMatrix2.setSaturation(1.6f);
            gl.l2(colorMatrix2, I.o() ? 0.9f : 0.84f);
            gl.h(colorMatrix2, I.o() ? -0.04f : 0.06f);
        }
        e2.setFilterBitmap(true);
        e2.setShader(Y);
        e2.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
        e2.setAlpha(kk7.d4);
        f2.setFilterBitmap(true);
        f2.setShader(Y);
        ColorMatrix colorMatrix3 = new ColorMatrix(colorMatrix2);
        gl.i(colorMatrix3, 0.26f);
        h1();
        gl.l2(colorMatrix3, 0.92f);
        f2.setColorFilter(new ColorMatrixColorFilter(colorMatrix3));
        f2.setAlpha(kk7.d4);
        g2.setAlpha(0);
    }

    public static ff0 i0(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        float f10 = i10;
        float f11 = i11;
        float f12 = i12;
        float f13 = i13;
        float[] fArr = {f10, f10, f11, f11, f12, f12, f13, f13};
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        shapeDrawable.setPadding(0, 0, 0, 0);
        shapeDrawable.getPaint().setColor(i14);
        ShapeDrawable shapeDrawable2 = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        shapeDrawable2.getPaint().setColor(i16);
        shapeDrawable2.setPadding(0, 0, 0, 0);
        return new ff0(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i15}), shapeDrawable, shapeDrawable2);
    }

    public static boolean i1() {
        return !I.o();
    }

    public static void j(boolean z10, boolean z11) {
        if (n2 == null || l3 == null || z10) {
            return;
        }
        J2.setColor(w0(null, zd, false));
        I2.setColor(w0(null, yd, false));
        P2.setColor(w0(null, Dd, false));
        T1.setColor(w0(null, Be, false));
        U1.setColor(w0(null, Cc, false));
        V1.setColor(w0(null, Ce, false));
        a2.setColor(w0(null, vd, false));
        Paint paint = b2;
        int i10 = oa;
        paint.setColor(w0(null, i10, false));
        c2.setColor(w0(null, i10, false));
        TextPaint textPaint = r2;
        int i11 = Yc;
        textPaint.setColor(w0(null, i11, false));
        s2.setColor(w0(null, i11, false));
        t2.setColor(w0(null, i11, false));
        r2.linkColor = w0(null, Zc, false);
        u2.setColor(w0(null, i11, false));
        e3.setColor(w0(null, F6, false));
        Paint paint2 = i2;
        int i12 = Ie;
        paint2.setColor(w0(null, i12, false));
        h2.setColor(w0(null, md, false));
        B1(ae, g3);
        m17 m17Var = l3;
        int i13 = qa;
        B1(i13, m17Var);
        m17 m17Var2 = m3;
        int i14 = Tc;
        B1(i14, m17Var2);
        B1(i13, p3);
        B1(i14, q3);
        B1(zb, x3);
        B1(Ab, y3);
        Drawable drawable = z3;
        int i15 = Bb;
        B1(i15, drawable);
        Drawable drawable2 = A3;
        int i16 = Cb;
        B1(i16, drawable2);
        B1(i15, B3);
        B1(i16, C3);
        Drawable drawable3 = E3;
        int i17 = id;
        B1(i17, drawable3);
        B1(i17, F3);
        B1(i11, G3);
        B1(i11, H3);
        B1(i11, I3);
        B1(i11, J3);
        B1(i11, K3);
        Drawable drawable4 = p4;
        int i18 = ad;
        B1(i18, drawable4);
        B1(i18, q4);
        B1(i18, t4);
        B1(i18, w4);
        B1(i18, x4);
        Drawable drawable5 = z4;
        int i19 = fd;
        B1(i19, drawable5);
        B1(i18, y4);
        B1(i18, u4);
        Drawable drawable6 = L3;
        int i20 = nd;
        B1(i20, drawable6);
        Drawable drawable7 = M3;
        int i21 = od;
        B1(i21, drawable7);
        Drawable drawable8 = N3;
        int i22 = Hb;
        B1(i22, drawable8);
        Drawable drawable9 = O3;
        int i23 = Ib;
        B1(i23, drawable9);
        B1(i20, P3);
        B1(i21, Q3);
        B1(i22, R3);
        B1(i23, S3);
        B1(i20, T3);
        B1(i21, U3);
        B1(i22, V3);
        B1(i23, W3);
        Drawable drawable10 = Y3;
        int i24 = pd;
        B1(i24, drawable10);
        B1(i11, X3);
        B1(i24, Z3);
        B1(i24, a4);
        B1(qd, b4);
        B1(rd, c4);
        B1(Jb, d4);
        B1(Kb, e4);
        B1(sd, f4);
        Drawable drawable11 = h4;
        int i25 = Lb;
        B1(i25, drawable11);
        Drawable drawable12 = g4;
        int i26 = td;
        B1(i26, drawable12);
        B1(wd, i4);
        B1(ed, j4);
        B1(i19, k4);
        Drawable drawable13 = l4;
        int i27 = xf;
        B1(i27, drawable13);
        B1(i27, m4);
        B1(i27, n4);
        B1(i26, A4);
        B1(i18, B4);
        B1(i26, C4);
        Drawable drawable14 = D4;
        int i28 = sf;
        B1(i28, drawable14);
        B1(i28, E4);
        for (int i29 = 0; i29 < 2; i29++) {
            B1(i26, F4[i29]);
            B1(ud, G4[i29]);
            B1(i25, H4[i29]);
            B1(Mb, I4[i29]);
        }
        B1(yb, N4);
        Drawable drawable15 = O4;
        int i30 = q7;
        B1(i30, drawable15);
        B1(pa, P4);
        B1(i30, U4);
        Drawable drawable16 = V4;
        int i31 = tj;
        B1(i31, drawable16);
        B1(i30, W4);
        B1(i31, X4);
        int i32 = 0;
        while (true) {
            bya[] byaVarArr = t3;
            if (i32 >= byaVarArr.length) {
                break;
            }
            B1(o9, byaVarArr[i32]);
            i32++;
        }
        for (int i33 = 0; i33 < 5; i33++) {
            Drawable[][] drawableArr = T4;
            z1(drawableArr[i33][0], w0(null, Ye, false), false);
            z1(drawableArr[i33][0], w0(null, kd, false), true);
            z1(drawableArr[i33][1], w0(null, Ze, false), false);
            z1(drawableArr[i33][1], w0(null, ld, false), true);
        }
        Drawable[] drawableArr2 = S4;
        z1(drawableArr2[0], w0(null, hf, false), false);
        z1(drawableArr2[0], w0(null, jf, false), true);
        z1(drawableArr2[1], w0(null, Gc, false), false);
        z1(drawableArr2[1], w0(null, Hc, false), true);
        Drawable[] drawableArr3 = R4;
        A1(w0(null, gf, false), drawableArr3[0]);
        A1(w0(null, Fc, false), drawableArr3[1]);
        Drawable[] drawableArr4 = L4;
        A1(w0(null, Ad, false), drawableArr4[0]);
        A1(w0(null, Nb, false), drawableArr4[1]);
        Drawable[] drawableArr5 = M4;
        A1(w0(null, i20, false), drawableArr5[0]);
        A1(w0(null, i22, false), drawableArr5[1]);
        B1(Je, h3);
        B1(i12, i3);
        int w02 = w0(null, pc, false) == -1 ? w0(null, qb, false) : -1;
        A1(w02, J4[1]);
        A1(w02, K4[1]);
        A1(w0(null, ca, false), Q4);
        if (z11 || b) {
            if (!gba.D0 || b) {
                return;
            }
            h();
        } else {
            h();
            g(d0);
        }
    }

    public static boolean j0(akb akbVar, zjb zjbVar, boolean z10) {
        boolean z11 = false;
        if (zjbVar == null || akbVar == null || akbVar.c0 == null) {
            return false;
        }
        int i10 = zjbVar.a;
        boolean z12 = i10 == akbVar.Z;
        akbVar.b0.remove(i10);
        akbVar.c0.remove(zjbVar);
        TLRPC.TL_theme tL_theme = zjbVar.r;
        if (tL_theme != null) {
            akbVar.d0.remove(tL_theme.id);
        }
        vjb vjbVar = zjbVar.y;
        if (vjbVar != null) {
            vjbVar.a();
        }
        if (z12) {
            akbVar.u(((zjb) akbVar.c0.get(0)).a);
        }
        if (z10) {
            x1(akbVar, true, false, false, false, false);
            if (zjbVar.r != null) {
                na7 q12 = na7.q1(zjbVar.t);
                if (z12 && akbVar == J) {
                    z11 = true;
                }
                q12.A4(akbVar, zjbVar, z11, true);
            }
        }
        return z12;
    }

    public static boolean j1(zjb zjbVar) {
        akb akbVar = zjbVar.b;
        if (akbVar == null) {
            return false;
        }
        if (akbVar.k().equals("Blue") && zjbVar.a == 99) {
            return true;
        }
        if (zjbVar.b.k().equals("Day") && zjbVar.a == 9) {
            return true;
        }
        return (zjbVar.b.k().equals("Night") || zjbVar.b.k().equals("Dark Blue")) && zjbVar.a == 0;
    }

    public static void k() {
        Paint paint = j0;
        if (paint == null) {
            return;
        }
        paint.setColor(w0(null, c7, false));
        l0.setColor(w0(null, J6, false));
        int i10 = 0;
        while (true) {
            Drawable[] drawableArr = q0;
            int length = drawableArr.length;
            int i11 = I7;
            if (i10 >= length) {
                oy8 oy8Var = t1;
                oy8Var.a0 = true;
                int i12 = L7;
                oy8Var.L(w0(null, i12, true), "Arrow1");
                t1.L(w0(null, i12, true), "Arrow2");
                t1.L(w0(null, i11, true), "Box2");
                t1.L(w0(null, i11, true), "Box1");
                t1.j();
                B1 = false;
                t1.E(true);
                oy8 oy8Var2 = w1;
                oy8Var2.a0 = true;
                int i13 = d9;
                oy8Var2.L(w0(null, i13, true), "Arrow");
                w1.L(w0(null, i13, true), "Line");
                w1.j();
                oy8 oy8Var3 = x1;
                oy8Var3.a0 = true;
                oy8Var3.L(w0(null, i13, true), "Arrow");
                x1.L(w0(null, i13, true), "Line");
                x1.j();
                oy8 oy8Var4 = y1;
                oy8Var4.a0 = true;
                int i14 = b9;
                oy8Var4.L(w0(null, i14, true), "Line 1");
                y1.L(w0(null, i14, true), "Line 2");
                y1.L(w0(null, i14, true), "Line 3");
                y1.L(w0(null, i13, true), "Cup Red");
                y1.L(w0(null, i13, true), "Box");
                y1.j();
                A1 = false;
                oy8 oy8Var5 = u1;
                oy8Var5.a0 = true;
                oy8Var5.L(w0(null, i14, true), "Arrow");
                u1.L(w0(null, i13, true), "Box2");
                u1.L(w0(null, i13, true), "Box1");
                u1.j();
                z1 = false;
                oy8 oy8Var6 = v1;
                oy8Var6.a0 = true;
                oy8Var6.L(w0(null, i13, true), "Arrow1");
                v1.L(w0(null, c9, true), "Arrow2");
                v1.L(w0(null, i13, true), "Box2");
                v1.L(w0(null, i13, true), "Box1");
                v1.j();
                int w02 = w0(null, F6, false);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                u3 = new PorterDuffColorFilter(w02, mode);
                v3 = new PorterDuffColorFilter(w0(null, Vc, false), mode);
                nh8.d().b();
                return;
            }
            B1(i11, drawableArr[i10]);
            i10++;
        }
    }

    public static akb k0(File file, String str, TLRPC.TL_theme tL_theme) {
        String[] split;
        try {
            akb akbVar = new akb();
            akbVar.a = str;
            akbVar.G = tL_theme;
            akbVar.b = file.getAbsolutePath();
            akbVar.F = y6c.t0;
            String[] strArr = new String[1];
            G(R0(new File(akbVar.b), null, strArr), akbVar);
            if (TextUtils.isEmpty(strArr[0])) {
                g0 = null;
                return akbVar;
            }
            String str2 = strArr[0];
            akbVar.c = sqc.d(str2).getAbsolutePath();
            try {
                Uri parse = Uri.parse(str2);
                akbVar.e = parse.getQueryParameter("slug");
                String queryParameter = parse.getQueryParameter("mode");
                if (queryParameter != null && (split = queryParameter.toLowerCase().split(" ")) != null && split.length > 0) {
                    for (int i10 = 0; i10 < split.length; i10++) {
                        if ("blur".equals(split[i10])) {
                            akbVar.h = true;
                        } else if ("motion".equals(split[i10])) {
                            akbVar.n = true;
                        }
                    }
                }
                String queryParameter2 = parse.getQueryParameter("intensity");
                if (!TextUtils.isEmpty(queryParameter2)) {
                    try {
                        String queryParameter3 = parse.getQueryParameter("bg_color");
                        if (!TextUtils.isEmpty(queryParameter3)) {
                            akbVar.r = Integer.parseInt(queryParameter3.substring(0, 6), 16) | (-16777216);
                            if (queryParameter3.length() >= 13 && gl.Q1(queryParameter3.charAt(6))) {
                                akbVar.s = Integer.parseInt(queryParameter3.substring(7, 13), 16) | (-16777216);
                            }
                            if (queryParameter3.length() >= 20 && gl.Q1(queryParameter3.charAt(13))) {
                                akbVar.w = Integer.parseInt(queryParameter3.substring(14, 20), 16) | (-16777216);
                            }
                            if (queryParameter3.length() == 27 && gl.Q1(queryParameter3.charAt(20))) {
                                akbVar.x = Integer.parseInt(queryParameter3.substring(21), 16) | (-16777216);
                            }
                        }
                    } catch (Exception unused) {
                    }
                    try {
                        String queryParameter4 = parse.getQueryParameter("rotation");
                        if (!TextUtils.isEmpty(queryParameter4)) {
                            akbVar.y = Utilities.z(queryParameter4).intValue();
                        }
                    } catch (Exception unused2) {
                    }
                    if (!TextUtils.isEmpty(queryParameter2)) {
                        akbVar.E = Utilities.z(queryParameter2).intValue();
                    }
                    if (akbVar.E == 0) {
                        akbVar.E = 50;
                    }
                }
            } catch (Throwable th2) {
                fa4.g(th2, true);
            }
            return akbVar;
        } catch (Exception e10) {
            fa4.g(e10, true);
            return null;
        }
    }

    public static void k1(int i10, boolean z10) {
        boolean[] zArr = C;
        if (zArr[i10]) {
            return;
        }
        if ((z10 || Math.abs((System.currentTimeMillis() / 1000) - D[i10]) >= 3600) && y6c.h(i10).o()) {
            zArr[i10] = true;
            TL_account.getThemes getthemes = new TL_account.getThemes();
            getthemes.format = "android";
            if (!hq6.d0(i10).B0.isEmpty()) {
                getthemes.hash = E[i10];
            }
            if (w01.a) {
                Log.i("theme", "loading remote themes, hash " + getthemes.hash);
            }
            ConnectionsManager.getInstance(i10).sendRequest(getthemes, new vv0(i10, (byte) 3));
        }
    }

    public static void l(boolean z10) {
        akb akbVar;
        if (M == null) {
            if (z10) {
                akb akbVar2 = I;
                akb akbVar3 = J;
                if (akbVar2 != akbVar3) {
                    if (akbVar2 == null || !(akbVar3 == null || akbVar2.o() == J.o())) {
                        R = true;
                        i = SystemClock.elapsedRealtime();
                        Q = true;
                        I1(J, true, -1, null);
                        Q = false;
                        return;
                    }
                    return;
                }
                return;
            }
            akb akbVar4 = K;
            if (akbVar4 != null && akbVar4.o() && o != 0 && (akbVar = L) != null) {
                akbVar4 = akbVar;
            }
            akb akbVar5 = I;
            if (akbVar5 != akbVar4) {
                if (akbVar5 == null || !(akbVar4 == null || akbVar5.o() == akbVar4.o())) {
                    R = false;
                    i = SystemClock.elapsedRealtime();
                    Q = true;
                    I1(akbVar4, true, -1, null);
                    Q = false;
                }
            }
        }
    }

    public static Paint l0(int i10) {
        Paint paint = Em;
        if (paint.getColor() != i10) {
            paint.setColor(i10);
        }
        return paint;
    }

    public static Bitmap l1(FileInputStream fileInputStream, int i10) {
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            long j10 = i10;
            fileInputStream.getChannel().position(j10);
            BitmapFactory.decodeStream(fileInputStream, null, options);
            if (options.outWidth <= 0 || options.outHeight <= 0) {
                try {
                    fileInputStream.close();
                } catch (Exception unused) {
                }
                return null;
            }
            Point point = gl.q;
            long j11 = (point.x << 1) * point.y;
            int i11 = 1;
            while ((options.outWidth / i11) * (options.outHeight / i11) > j11) {
                i11 <<= 1;
            }
            options.inJustDecodeBounds = false;
            options.inSampleSize = i11;
            fileInputStream.getChannel().position(j10);
            return BitmapFactory.decodeStream(fileInputStream, null, options);
        } catch (Throwable th2) {
            try {
                fa4.g(th2, true);
                try {
                    fileInputStream.close();
                } catch (Exception unused2) {
                }
                return null;
            } finally {
                try {
                    fileInputStream.close();
                } catch (Exception unused3) {
                }
            }
        }
    }

    public static void m(Paint paint) {
        paint.setShadowLayer(gl.N(1.0f), 0.0f, gl.N(0.33f), a);
    }

    public static Bitmap m0(String str, TLRPC.Document document, boolean z10) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ng5 c10 = ng5.c(str);
        mqc d10 = zqc.d(str);
        byte b10 = 1;
        if (d10 == null && document != null) {
            ba4.G(y6c.t0);
            File J10 = ba4.J(document, null, true, true);
            if (J10.exists()) {
                d10 = zqc.e(c10, new c4b(J10, (byte) 2));
            }
        }
        if (d10 != null) {
            return d10.a;
        }
        int i10 = y6c.t0;
        kjb kjbVar = new kjb(z10, str, b10);
        do3 do3Var = xqc.e;
        gl.c3(new clc(i10, str, kjbVar));
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m1(boolean z10) {
        String str;
        TLRPC.Document document;
        boolean z11;
        float f10;
        float f11;
        TLRPC.WallPaper wallPaper;
        if (d0 != null) {
            return;
        }
        akb akbVar = I;
        boolean z12 = akbVar.T && akbVar.Z == n;
        zjb i10 = akbVar.i(false);
        TLRPC.Document document2 = null;
        if (i10 != null) {
            String str2 = i10.o;
            boolean z13 = i10.q;
            TLRPC.TL_theme tL_theme = i10.r;
            TLRPC.ThemeSettings themeSettings = (tL_theme == null || tL_theme.settings.size() <= 0) ? null : i10.r.settings.get(0);
            if (i10.r != null && themeSettings != null && (wallPaper = themeSettings.wallpaper) != null) {
                document2 = wallPaper.document;
            }
            document = document2;
            z11 = z13;
            str = str2;
        } else {
            str = null;
            document = null;
            z11 = false;
        }
        akb akbVar2 = I;
        vjb vjbVar = akbVar2.j0;
        if (vjbVar != null) {
            f11 = vjbVar.k;
        } else {
            if (i10 == null) {
                f10 = akbVar2.E;
                int i11 = (int) f10;
                if (!z10) {
                    co3 co3Var = Utilities.i;
                    fp6 fp6Var = new fp6(vjbVar, str, i11, z11, document, z12);
                    d = fp6Var;
                    co3Var.c(fp6Var);
                    return;
                }
                Drawable n12 = n1(vjbVar, str, i11, z11, document, z12);
                O();
                if (!b) {
                    i(n12);
                    g(n12);
                }
                kk7.e().k(kk7.B4, new Object[0]);
                return;
            }
            f11 = i10.p;
        }
        f10 = f11 * 100.0f;
        int i112 = (int) f10;
        if (!z10) {
        }
    }

    public static void n() {
        if (A0 == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            int i11 = o9;
            int i12 = f9;
            int i13 = Y8;
            int i14 = W8;
            if (i10 >= 2) {
                C0.setColor(w0(null, i14, false));
                D0.setColor(w0(null, i13, false));
                TextPaint textPaint = F0;
                int w02 = w0(null, l9, false);
                textPaint.linkColor = w02;
                textPaint.setColor(w02);
                t0.setColor(w0(null, s9, false));
                u0.setColor(w0(null, r9, false));
                H0.setColor(w0(null, p9, false));
                I0.setColor(w0(null, q9, false));
                TextPaint textPaint2 = J0;
                int i15 = Yl;
                textPaint2.setColor(w0(null, i15, false));
                TextPaint textPaint3 = K0;
                int i16 = V8;
                textPaint3.setColor(w0(null, i16, false));
                L0.setColor(w0(null, i16, false));
                TextPaint textPaint4 = M0;
                int i17 = e9;
                textPaint4.setColor(w0(null, i17, false));
                N0.setColor(w0(null, i17, false));
                Paint paint = v0;
                int i18 = T8;
                paint.setColor(w0(null, i18, false));
                Paint paint2 = x0;
                int i19 = U8;
                paint2.setColor(w0(null, i19, false));
                y0.setColor(w0(null, i11, false));
                w0.setColor(w0(null, w9, false));
                O0.setColor(w0(null, o6, false));
                P0.setColor(w0(null, z6, false));
                B1(Z8, Z0);
                Drawable drawable = a1;
                int i20 = a9;
                B1(i20, drawable);
                B1(t9, S0);
                B1(F6, R0);
                Drawable drawable2 = U0;
                int i21 = u9;
                B1(i21, drawable2);
                B1(i21, V0);
                B1(v9, W0);
                B1(x9, X0);
                B1(i20, i1);
                B1(i20, j1);
                B1(i15, k1);
                B1(i20, Y0);
                Drawable drawable3 = b1;
                int i22 = A9;
                B1(i22, drawable3);
                B1(i22, c1);
                B1(i22, d1);
                B1(i18, l1);
                B1(Y5, m1);
                B1(pk, n1);
                B1(i19, o1);
                B1(i19, p1);
                B1(i19, q1);
                B1(i12, s1);
                B1(y9, e1);
                B1(z9, h1);
                B1(z8, r1);
                gq9 gq9Var = f1;
                int i23 = i9;
                B1(i23, gq9Var);
                B1(i23, g1);
                return;
            }
            A0[i10].setColor(w0(null, i14, false));
            B0[i10].setColor(w0(null, i13, false));
            TextPaint textPaint5 = E0[i10];
            int w03 = w0(null, i12, false);
            textPaint5.linkColor = w03;
            textPaint5.setColor(w03);
            G0[i10].setColor(w0(null, i11, false));
            i10++;
        }
    }

    public static ColorFilter n0(wjb wjbVar) {
        return wjbVar != null ? wjbVar.c() : u3;
    }

    public static Drawable n1(vjb vjbVar, String str, int i10, boolean z10, TLRPC.Document document, boolean z11) {
        gl2 H10 = H(I, vjbVar, km, str, g0, f0, i10, S, z11, O, P, z10, document, false);
        Boolean bool = (Boolean) H10.d;
        h0 = bool != null ? bool.booleanValue() : h0;
        Boolean bool2 = (Boolean) H10.e;
        i0 = bool2 != null ? bool2.booleanValue() : i0;
        Boolean bool3 = (Boolean) H10.f;
        V = bool3 != null ? bool3.booleanValue() : V;
        Drawable drawable = (Drawable) H10.b;
        d0 = drawable != null ? drawable : d0;
        int[] q10 = gl.q(drawable);
        int i11 = q10[0];
        b0 = i11;
        W = i11;
        int i12 = q10[1];
        c0 = i12;
        a0 = i12;
        h();
        return drawable;
    }

    public static void o() {
        akb akbVar;
        akb akbVar2 = M;
        if (akbVar2 == null) {
            return;
        }
        O = false;
        if (R && (akbVar = J) != null) {
            t(akbVar, true, true);
        } else if (!P) {
            t(akbVar2, true, false);
        }
        P = false;
        M = null;
        E(false);
    }

    public static n40 o0(k27 k27Var) {
        HashMap hashMap = d5;
        if (hashMap == null || k27Var == null) {
            return null;
        }
        return (n40) hashMap.get(k27Var);
    }

    public static void o1(int i10, int i11, int... iArr) {
        for (int i12 : iArr) {
            Bm[i12] = (i10 << 16) | i11;
        }
    }

    public static void p() {
        if (P1 == null) {
            return;
        }
        O1.setColor(w0(null, F6, false));
        O1.linkColor = w0(null, I6, false);
        B1(pi, P1);
        B1(qi, Q1);
    }

    public static File p0(String str) {
        long j10;
        File file = new File(a.h(), str);
        try {
            InputStream open = a.b.getAssets().open(str);
            j10 = open.available();
            open.close();
        } catch (Exception e10) {
            fa4.g(e10, true);
            j10 = 0;
        }
        if (!file.exists() || (j10 != 0 && file.length() != j10)) {
            try {
                InputStream open2 = a.b.getAssets().open(str);
                try {
                    Typeface typeface = gl.a;
                    gl.D(open2, new FileOutputStream(file));
                    open2.close();
                } finally {
                }
            } catch (Exception e11) {
                fa4.g(e11, true);
            }
        }
        return file;
    }

    public static int p1(float f10, int i10) {
        return f10 == 1.0f ? i10 : bm2.o(i10, moe.b((int) (Color.alpha(i10) * f10), 0, kk7.d4));
    }

    public static void q(float f10, float f11, int i10, int i11) {
        r(X, Y, Z, i10, i11, f10, f11);
    }

    public static String q0(TLRPC.ThemeSettings themeSettings) {
        if (themeSettings == null) {
            return null;
        }
        TLRPC.BaseTheme baseTheme = themeSettings.base_theme;
        if (baseTheme instanceof TLRPC.TL_baseThemeClassic) {
            return "Blue";
        }
        if (baseTheme instanceof TLRPC.TL_baseThemeDay) {
            return "Day";
        }
        if (baseTheme instanceof TLRPC.TL_baseThemeTinted) {
            return "Dark Blue";
        }
        if (baseTheme instanceof TLRPC.TL_baseThemeArctic) {
            return "Arctic Blue";
        }
        if (baseTheme instanceof TLRPC.TL_baseThemeNight) {
            return "Night";
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00ce A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d2 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int q1() {
        mjb mjbVar;
        int i10;
        int i11;
        int i12 = o;
        if (i12 == 1) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(System.currentTimeMillis());
            int i13 = calendar.get(12) + (calendar.get(11) * 60);
            if (p) {
                int i14 = calendar.get(5);
                if (u != i14) {
                    double d10 = x;
                    if (d10 != 10000.0d) {
                        double d11 = y;
                        if (d11 != 10000.0d) {
                            int[] calculateSunriseSunset = SunDate.calculateSunriseSunset(d10, d11);
                            v = calculateSunriseSunset[0];
                            t = calculateSunriseSunset[1];
                            u = i14;
                            u1();
                        }
                    }
                }
                i10 = t;
                i11 = v;
            } else {
                i10 = r;
                i11 = s;
            }
            return (i10 >= i11 ? (i10 > i13 || i13 > 1440) && (i13 < 0 || i13 > i11) : i10 > i13 || i13 > i11) ? 1 : 2;
        }
        if (i12 == 2) {
            Sensor sensor = f;
            if (sensor == null) {
                SensorManager sensorManager = (SensorManager) a.b.getSystemService("sensor");
                e = sensorManager;
                sensor = sensorManager.getDefaultSensor(5);
                f = sensor;
            }
            if (!g && sensor != null && (mjbVar = xm) != null) {
                e.registerListener(mjbVar, sensor, 500000);
                g = true;
                if (w01.a) {
                    fa4.b("light sensor registered");
                }
            }
            if (h <= q) {
                if (!k) {
                }
            } else if (!j) {
            }
            return 0;
        }
        if (i12 == 3) {
            int i15 = a.b.getResources().getConfiguration().uiMode & 48;
            if (i15 != 0 && i15 != 16) {
                if (i15 != 32) {
                    return 0;
                }
            }
        }
        if (i12 == 0) {
        }
    }

    public static void r(Bitmap bitmap, BitmapShader bitmapShader, Matrix matrix, int i10, int i11, float f10, float f11) {
        if (bitmapShader == null || matrix == null) {
            return;
        }
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        float f12 = i10;
        float f13 = i11;
        float max = Math.max(f12 / width, f13 / height);
        matrix.reset();
        matrix.setTranslate(((f12 - (width * max)) / 2.0f) - f10, ((f13 - (height * max)) / 2.0f) - f11);
        matrix.preScale(max, max);
        bitmapShader.setLocalMatrix(matrix);
    }

    public static Drawable r0() {
        Drawable s02 = s0();
        if (s02 != null || d == null) {
            return s02;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Utilities.i.c(new wm3(countDownLatch, (byte) 1));
        try {
            countDownLatch.await();
        } catch (Exception e10) {
            fa4.g(e10, true);
        }
        return s0();
    }

    public static void r1(boolean z10, boolean z11) {
        SparseIntArray clone = jm.clone();
        zjb i10 = I.i(false);
        boolean d10 = i10 != null ? i10.d(jm, clone) : true;
        f(jm, clone, I.o());
        e(jm, clone, I.o());
        mm = d10;
        km = clone;
        if (!z11) {
            s1(!(LaunchActivity.Q() instanceof mu1));
        }
        k();
        n();
        p();
        j(false, z10);
        gl.c3(new yf4((byte) 3, !O));
    }

    public static void s(View view, View view2, wjb wjbVar) {
        if (view == null || view2 == null) {
            return;
        }
        int[] iArr = ym;
        view.getLocationOnScreen(iArr);
        int i10 = iArr[0];
        int i11 = iArr[1];
        view2.getLocationOnScreen(iArr);
        if (view2 instanceof gmb) {
            Bitmap bitmap = X;
            if (bitmap != null) {
                float width = bitmap.getWidth();
                i10 = (int) ((((view2.getMeasuredWidth() - (Math.max(view2.getMeasuredWidth() / width, view2.getMeasuredHeight() / X.getHeight()) * width)) / 2.0f) - ((gmb) view2).J) + i10);
            } else {
                i10 = (int) (i10 + (-((gmb) view2).J));
            }
            i11 = (int) (i11 + (-((gmb) view2).K));
        }
        if (wjbVar != null) {
            wjbVar.b(i10, i11 - iArr[1], view2.getMeasuredWidth(), view2.getMeasuredHeight());
        } else {
            q(i10, i11 - iArr[1], view2.getMeasuredWidth(), view2.getMeasuredHeight());
        }
    }

    public static Drawable s0() {
        Drawable drawable = e0;
        return drawable != null ? drawable : d0;
    }

    public static void s1(boolean z10) {
        Drawable drawable = d0;
        if (drawable instanceof ye7) {
            S = ((ye7) drawable).i;
        } else {
            S = 0;
        }
        d0 = null;
        e0 = null;
        m1(z10);
    }

    public static void t(akb akbVar, boolean z10, boolean z11) {
        SparseIntArray R02;
        String[] split;
        if (akbVar != null) {
            vm++;
            ThemeEditorView themeEditorView = ThemeEditorView.p;
            if (themeEditorView != null) {
                themeEditorView.a();
            }
            try {
                if (akbVar.b == null && akbVar.d == null) {
                    if (!z11 && z10) {
                        SharedPreferences.Editor edit = na7.c1().edit();
                        edit.remove("theme");
                        edit.commit();
                    }
                    jm.clear();
                    f0 = 0;
                    g0 = null;
                    d0 = null;
                    e0 = null;
                } else {
                    if (!z11 && z10) {
                        SharedPreferences.Editor edit2 = na7.c1().edit();
                        edit2.putString("theme", akbVar.k());
                        edit2.apply();
                    }
                    String[] strArr = new String[1];
                    String str = akbVar.d;
                    if (str != null) {
                        R02 = R0(null, str, null);
                        jm = R02;
                    } else {
                        R02 = R0(new File(akbVar.b), null, strArr);
                        jm = R02;
                    }
                    f0 = R02.get(f5, -1);
                    if (TextUtils.isEmpty(strArr[0])) {
                        try {
                            if (akbVar.c != null) {
                                new File(akbVar.c).delete();
                            }
                        } catch (Exception unused) {
                        }
                        akbVar.c = null;
                        g0 = null;
                    } else {
                        String str2 = strArr[0];
                        g0 = str2;
                        String absolutePath = sqc.d(str2).getAbsolutePath();
                        try {
                            String str3 = akbVar.c;
                            if (str3 != null && !str3.equals(absolutePath)) {
                                new File(akbVar.c).delete();
                            }
                        } catch (Exception unused2) {
                        }
                        akbVar.c = absolutePath;
                        try {
                            Uri parse = Uri.parse(g0);
                            akbVar.e = parse.getQueryParameter("slug");
                            String queryParameter = parse.getQueryParameter("mode");
                            if (queryParameter != null && (split = queryParameter.toLowerCase().split(" ")) != null && split.length > 0) {
                                for (int i10 = 0; i10 < split.length; i10++) {
                                    if ("blur".equals(split[i10])) {
                                        akbVar.h = true;
                                    } else if ("motion".equals(split[i10])) {
                                        akbVar.n = true;
                                    }
                                }
                            }
                            Utilities.z(parse.getQueryParameter("intensity"));
                            akbVar.y = 45;
                            try {
                                String queryParameter2 = parse.getQueryParameter("bg_color");
                                if (!TextUtils.isEmpty(queryParameter2)) {
                                    akbVar.r = Integer.parseInt(queryParameter2.substring(0, 6), 16) | (-16777216);
                                    if (queryParameter2.length() >= 13 && gl.Q1(queryParameter2.charAt(6))) {
                                        akbVar.s = Integer.parseInt(queryParameter2.substring(7, 13), 16) | (-16777216);
                                    }
                                    if (queryParameter2.length() >= 20 && gl.Q1(queryParameter2.charAt(13))) {
                                        akbVar.w = Integer.parseInt(queryParameter2.substring(14, 20), 16) | (-16777216);
                                    }
                                    if (queryParameter2.length() == 27 && gl.Q1(queryParameter2.charAt(20))) {
                                        akbVar.x = Integer.parseInt(queryParameter2.substring(21), 16) | (-16777216);
                                    }
                                }
                            } catch (Exception unused3) {
                            }
                            try {
                                String queryParameter3 = parse.getQueryParameter("rotation");
                                if (!TextUtils.isEmpty(queryParameter3)) {
                                    akbVar.y = Utilities.z(queryParameter3).intValue();
                                }
                            } catch (Exception unused4) {
                            }
                        } catch (Throwable th2) {
                            fa4.g(th2, true);
                        }
                    }
                }
                if (!z11 && M == null) {
                    K = akbVar;
                    if (I == J) {
                        T = 2000;
                        U = SystemClock.elapsedRealtime();
                        gl.d3(new am6((byte) 2), 2100L);
                    }
                }
                I = akbVar;
                r1(false, false);
            } catch (Exception e10) {
                fa4.g(e10, true);
            }
            float f10 = xk0.m1;
            xk0.o1 = 1.0f - (Color.alpha(w0(null, ng, true)) / 255.0f);
            if (M == null && z10 && !Q) {
                na7.q1(akbVar.F).A4(akbVar, akbVar.i(false), z11, false);
            }
        }
    }

    public static bya t0(int i10) {
        if (i10 < 0 || i10 > 5) {
            return null;
        }
        bya[] byaVarArr = t3;
        bya byaVar = byaVarArr[i10];
        if (byaVar != null) {
            return byaVar;
        }
        if (i10 == 0) {
            byaVarArr[0] = new a4c(true);
        } else if (i10 == 1) {
            byaVarArr[1] = new pg2(true);
        } else if (i10 == 2) {
            byaVarArr[2] = new m4a(true);
        } else if (i10 == 3) {
            byaVarArr[3] = new bd8(null, true);
        } else if (i10 == 4) {
            byaVarArr[4] = new oj9(true);
        } else if (i10 == 5) {
            byaVarArr[5] = new pg2();
        }
        bya byaVar2 = byaVarArr[i10];
        byaVar2.d();
        byaVar2.b(w0(null, o9, false));
        return byaVar2;
    }

    public static void t1(boolean z10) {
        if (!z10) {
            I.v(null);
        } else {
            P = false;
            s1(true);
        }
    }

    public static akb u(File file, String str, TLRPC.TL_theme tL_theme, boolean z10) {
        File file2;
        String str2;
        try {
            if (!str.toLowerCase().endsWith(".attheme")) {
                str = str.concat(".attheme");
            }
            if (z10) {
                kk7.e().k(kk7.w4, new Object[0]);
                akb akbVar = new akb();
                akbVar.a = str;
                akbVar.G = tL_theme;
                akbVar.b = file.getAbsolutePath();
                akbVar.F = y6c.t0;
                M = B0();
                O = true;
                P = false;
                t(akbVar, false, false);
                return akbVar;
            }
            if (tL_theme != null) {
                str2 = "remote" + tL_theme.id;
                file2 = new File(a.h(), str2.concat(".attheme"));
            } else {
                file2 = new File(a.h(), str);
                str2 = str;
            }
            if (!gl.E(file, file2)) {
                o();
                return null;
            }
            M = null;
            O = false;
            P = false;
            HashMap hashMap = H;
            akb akbVar2 = (akb) hashMap.get(str2);
            if (akbVar2 == null) {
                akbVar2 = new akb();
                akbVar2.a = str;
                akbVar2.F = y6c.t0;
                ArrayList arrayList = F;
                arrayList.add(akbVar2);
                G.add(akbVar2);
                Collections.sort(arrayList, new pva((byte) 2));
            } else {
                hashMap.remove(str2);
            }
            akbVar2.G = tL_theme;
            akbVar2.b = file2.getAbsolutePath();
            hashMap.put(akbVar2.k(), akbVar2);
            w1(true, false);
            t(akbVar2, true, false);
            return akbVar2;
        } catch (Exception e10) {
            fa4.g(e10, true);
            return null;
        }
    }

    public static int u0(int i10) {
        return w0(null, i10, false);
    }

    public static void u1() {
        SharedPreferences.Editor edit = na7.c1().edit();
        edit.putInt("selectedAutoNightType", o);
        edit.putBoolean("autoNightScheduleByLocation", p);
        edit.putFloat("autoNightBrighnessThreshold", q);
        edit.putInt("autoNightDayStartTime", r);
        edit.putInt("autoNightDayEndTime", s);
        edit.putInt("autoNightSunriseTime", v);
        edit.putString("autoNightCityName", w);
        edit.putInt("autoNightSunsetTime", t);
        edit.putLong("autoNightLocationLatitude3", Double.doubleToRawLongBits(x));
        edit.putLong("autoNightLocationLongitude3", Double.doubleToRawLongBits(y));
        edit.putInt("autoNightLastSunCheckDay", u);
        akb akbVar = J;
        if (akbVar != null) {
            edit.putString("nighttheme", akbVar.k());
        } else {
            edit.remove("nighttheme");
        }
        edit.commit();
    }

    public static int v(int i10, int i11) {
        float alpha = Color.alpha(i11) / 255.0f;
        float alpha2 = Color.alpha(i10) / 255.0f;
        float f10 = 1.0f - alpha;
        float f11 = (alpha2 * f10) + alpha;
        if (f11 == 0.0f) {
            return 0;
        }
        return Color.argb((int) (255.0f * f11), (int) ((((Color.red(i10) * alpha2) * f10) + (Color.red(i11) * alpha)) / f11), (int) ((((Color.green(i10) * alpha2) * f10) + (Color.green(i11) * alpha)) / f11), (int) ((((Color.blue(i10) * alpha2) * f10) + (Color.blue(i11) * alpha)) / f11));
    }

    public static int v0(int i10, wjb wjbVar) {
        Integer y02;
        return wjbVar != null ? (!wjbVar.e() || (y02 = y0(i10, wjbVar)) == null) ? wjbVar.h(i10) : y02.intValue() : w0(null, i10, false);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(24:0|1|(1:3)(1:148)|(1:5)(1:147)|(1:8)|9|(1:146)(1:13)|(1:15)(1:145)|16|(2:(1:19)(1:33)|(4:22|(2:24|(1:26))|(1:32)(1:30)|31))|34|(12:36|(2:37|(3:39|(2:42|43)|44)(0))|54|55|56|(1:62)|63|(2:65|(1:69))(2:92|(3:94|(1:96)|(1:99)))|(6:71|(1:73)|74|(1:76)|(1:78)|79)|81|82|(2:84|85)(1:87))(2:128|(4:131|(2:134|135)|136|129))|53|54|55|56|(3:58|60|62)|63|(0)(0)|(0)|81|82|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x01d2, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x019a, code lost:
    
        r7 = r3;
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01db, code lost:
    
        fa4.g(r0, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01de, code lost:
    
        if (r7 != null) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01e0, code lost:
    
        r7.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01e4, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01f7, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01f8, code lost:
    
        r1 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01f9, code lost:
    
        if (r7 == null) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01fb, code lost:
    
        r7.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:?, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01ff, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0200, code lost:
    
        fa4.g(r0, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0204, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:?, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01d0, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0197, code lost:
    
        r1 = r0;
        r7 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x01d8, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x01d9, code lost:
    
        r4 = true;
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x01d4, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x01d5, code lost:
    
        r1 = r0;
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01ca, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01cb, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01cc, code lost:
    
        fa4.g(r0, r4);
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01fb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010c A[Catch: all -> 0x01d0, Exception -> 0x01d2, TryCatch #8 {Exception -> 0x01d2, all -> 0x01d0, blocks: (B:56:0x00e6, B:58:0x00ec, B:60:0x00f0, B:62:0x00f6, B:63:0x00fb, B:65:0x010c, B:67:0x0129, B:69:0x012d, B:71:0x016b, B:73:0x0177, B:74:0x019d, B:76:0x01a3, B:78:0x01a7, B:79:0x01b0, B:92:0x013d, B:94:0x0141, B:96:0x014a, B:99:0x0167), top: B:55:0x00e6 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x016b A[Catch: all -> 0x01d0, Exception -> 0x01d2, TryCatch #8 {Exception -> 0x01d2, all -> 0x01d0, blocks: (B:56:0x00e6, B:58:0x00ec, B:60:0x00f0, B:62:0x00f6, B:63:0x00fb, B:65:0x010c, B:67:0x0129, B:69:0x012d, B:71:0x016b, B:73:0x0177, B:74:0x019d, B:76:0x01a3, B:78:0x01a7, B:79:0x01b0, B:92:0x013d, B:94:0x0141, B:96:0x014a, B:99:0x0167), top: B:55:0x00e6 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x013d A[Catch: all -> 0x01d0, Exception -> 0x01d2, TryCatch #8 {Exception -> 0x01d2, all -> 0x01d0, blocks: (B:56:0x00e6, B:58:0x00ec, B:60:0x00f0, B:62:0x00f6, B:63:0x00fb, B:65:0x010c, B:67:0x0129, B:69:0x012d, B:71:0x016b, B:73:0x0177, B:74:0x019d, B:76:0x01a3, B:78:0x01a7, B:79:0x01b0, B:92:0x013d, B:94:0x0141, B:96:0x014a, B:99:0x0167), top: B:55:0x00e6 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void v1(akb akbVar, boolean z10, boolean z11, boolean z12) {
        int i10;
        int i11;
        int i12;
        int i13;
        vjb vjbVar = akbVar.j0;
        String Z02 = vjbVar != null ? Z0(vjbVar) : g0;
        Drawable drawable = z11 ? d0 : e0;
        if (z11 && drawable != null) {
            e0 = d0;
        }
        zjb i14 = I.i(false);
        boolean z13 = I.T && i14.a == n;
        SparseIntArray sparseIntArray = z13 ? null : km;
        StringBuilder sb2 = new StringBuilder();
        if (!z13) {
            if (i14 != null) {
                i10 = i14.e;
                i11 = i14.f;
                i12 = i14.g;
                i13 = i14.h;
            } else {
                i10 = 0;
                i11 = 0;
                i12 = 0;
                i13 = 0;
            }
            if (i10 != 0 && i11 != 0) {
                sparseIntArray.put(qb, i10);
                sparseIntArray.put(tb, i11);
                if (i12 != 0) {
                    sparseIntArray.put(ub, i12);
                    if (i13 != 0) {
                        sparseIntArray.put(vb, i13);
                    }
                }
                sparseIntArray.put(Qc, (i14 == null || !i14.i) ? 0 : 1);
            }
        }
        int i15 = Ge;
        int i16 = Fe;
        int i17 = Ee;
        int i18 = De;
        if (z13) {
            int i19 = 0;
            while (true) {
                int[] iArr = gm;
                if (i19 < iArr.length) {
                    int i20 = iArr[i19];
                    if ((!(drawable instanceof BitmapDrawable) && Z02 == null) || (i18 != i19 && i17 != i19 && i16 != i19 && i15 != i19)) {
                        sb2.append(lve.c(i19));
                        sb2.append("=");
                        sb2.append(i20);
                        sb2.append("\n");
                    }
                    i19++;
                }
            }
            FileOutputStream fileOutputStream = new FileOutputStream(akbVar.b);
            if (sb2.length() == 0 && !(drawable instanceof BitmapDrawable) && TextUtils.isEmpty(Z02)) {
                sb2.append(' ');
            }
            fileOutputStream.write(gl.g1(sb2.toString()));
            if (TextUtils.isEmpty(Z02)) {
                fileOutputStream.write(gl.g1("WLS=" + Z02 + "\n"));
                if (z11 && (drawable instanceof BitmapDrawable)) {
                    sqc.c(((BitmapDrawable) drawable).getBitmap(), Bitmap.CompressFormat.JPEG, sqc.d(Z02));
                }
            } else if (drawable instanceof BitmapDrawable) {
                Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                if (bitmap != null) {
                    fileOutputStream.write(new byte[]{87, 80, 83, 10});
                    bitmap.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream);
                    fileOutputStream.write(new byte[]{10, 87, 80, 69, 10});
                }
                if (z10 && !z12) {
                    d0 = drawable;
                }
            }
            if (!z12) {
                HashMap hashMap = H;
                if (hashMap.get(akbVar.k()) == null) {
                    ArrayList arrayList = F;
                    arrayList.add(akbVar);
                    hashMap.put(akbVar.k(), akbVar);
                    G.add(akbVar);
                    w1(true, false);
                    Collections.sort(arrayList, new pva((byte) 2));
                }
                I = akbVar;
                if (akbVar != J) {
                    K = akbVar;
                }
                if (z13) {
                    jm.clear();
                    r1(false, false);
                }
                SharedPreferences.Editor edit = na7.c1().edit();
                edit.putString("theme", K.k());
                edit.apply();
            }
            fileOutputStream.close();
            if (z10) {
                na7.q1(akbVar.F).B4(akbVar, akbVar.i(false));
                return;
            }
            return;
        }
        for (int i21 = 0; i21 < sparseIntArray.size(); i21++) {
            int keyAt = sparseIntArray.keyAt(i21);
            int valueAt = sparseIntArray.valueAt(i21);
            if ((!(drawable instanceof BitmapDrawable) && Z02 == null) || (i18 != keyAt && i17 != keyAt && i16 != keyAt && i15 != keyAt)) {
                sb2.append(lve.c(keyAt));
                sb2.append("=");
                sb2.append(valueAt);
                sb2.append("\n");
            }
        }
        FileOutputStream fileOutputStream2 = new FileOutputStream(akbVar.b);
        if (sb2.length() == 0) {
            sb2.append(' ');
        }
        fileOutputStream2.write(gl.g1(sb2.toString()));
        if (TextUtils.isEmpty(Z02)) {
        }
        if (!z12) {
        }
        fileOutputStream2.close();
        if (z10) {
        }
    }

    public static int w(int i10, boolean z10, boolean z11) {
        if (z10) {
            return p1(z11 ? 0.22f : 0.12f, -1);
        }
        int i11 = z11 ? -3813931 : -1972501;
        float[] N02 = N0(3);
        Color.colorToHSV(i10, N02);
        return N02[1] > 0.02f ? b(i11, i10) : i11;
    }

    public static int w0(boolean[] zArr, int i10, boolean z10) {
        SparseIntArray sparseIntArray;
        int indexOfKey;
        Integer y02;
        return (!gba.D0 || (y02 = y0(i10, null)) == null) ? (z10 || (sparseIntArray = lm) == null || (indexOfKey = sparseIntArray.indexOfKey(i10)) < 0) ? x0(km, i10, zArr) : lm.valueAt(indexOfKey) : y02.intValue();
    }

    public static void w1(boolean z10, boolean z11) {
        boolean z12;
        ArrayList arrayList;
        JSONObject jSONObject;
        int i10 = 0;
        SharedPreferences.Editor edit = a.b.getSharedPreferences("themeconfig", 0).edit();
        if (z10) {
            JSONArray jSONArray = new JSONArray();
            int i11 = 0;
            while (true) {
                ArrayList arrayList2 = G;
                if (i11 >= arrayList2.size()) {
                    break;
                }
                akb akbVar = (akb) arrayList2.get(i11);
                akbVar.getClass();
                try {
                    jSONObject = new JSONObject();
                    jSONObject.put("name", akbVar.a);
                    jSONObject.put("path", akbVar.b);
                    jSONObject.put("account", akbVar.F);
                    TLRPC.TL_theme tL_theme = akbVar.G;
                    if (tL_theme != null) {
                        SerializedData serializedData = new SerializedData(tL_theme.getObjectSize());
                        akbVar.G.serializeToStream(serializedData);
                        jSONObject.put("info", Utilities.f(serializedData.toByteArray()));
                    }
                    jSONObject.put("loaded", akbVar.H);
                } catch (Exception e10) {
                    fa4.g(e10, true);
                    jSONObject = null;
                }
                if (jSONObject != null) {
                    jSONArray.put(jSONObject);
                }
                i11++;
            }
            edit.putString("themes2", jSONArray.toString());
        }
        int i12 = 0;
        while (i12 < 4) {
            StringBuilder sb2 = new StringBuilder("2remoteThemesHash");
            Object obj = "";
            sb2.append(i12 != 0 ? Integer.valueOf(i12) : "");
            edit.putLong(sb2.toString(), E[i12]);
            StringBuilder sb3 = new StringBuilder("lastLoadingThemesTime");
            if (i12 != 0) {
                obj = Integer.valueOf(i12);
            }
            sb3.append(obj);
            edit.putInt(sb3.toString(), D[i12]);
            i12++;
        }
        edit.putInt("lastLoadingCurrentThemeTime", B);
        edit.commit();
        if (z10) {
            while (i10 < 5) {
                akb akbVar2 = (akb) H.get(i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? "Night" : "Day" : "Arctic Blue" : "Dark Blue" : "Blue");
                if (akbVar2 == null || (arrayList = akbVar2.c0) == null || arrayList.isEmpty()) {
                    z12 = z11;
                } else {
                    z12 = z11;
                    x1(akbVar2, true, false, false, false, z12);
                }
                i10++;
                z11 = z12;
            }
        }
    }

    public static int x(boolean z10, boolean z11, boolean z12, int i10) {
        if (z10) {
            return p1(z12 ? 0.62f : 0.18f, -1);
        }
        int i11 = z12 ? -6380376 : -2565928;
        float[] N02 = N0(3);
        Color.colorToHSV(i10, N02);
        return (!z11 || N02[1] <= 0.02f) ? i11 : b(i11, i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x006c, code lost:
    
        if (r2.i == r0.i) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00b8, code lost:
    
        if (r2.i == r0.i) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00ed, code lost:
    
        if (r2.c == r0.c) goto L82;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int x0(SparseIntArray sparseIntArray, int i10, boolean[] zArr) {
        int indexOfKey;
        if (Y != null && (Yc == i10 || Zc == i10 || ad == i10 || Ld == i10 || Nd == i10 || Rd == i10)) {
            return -1;
        }
        akb akbVar = I;
        akb akbVar2 = L;
        int i11 = cd;
        int i12 = bd;
        if (akbVar == akbVar2) {
            int i13 = pb;
            byte b10 = n;
            if (i10 < i13 || i10 >= wb) {
                if (i10 < xb || i10 >= Jc) {
                    if (De != i10 && Ee != i10 && Fe != i10 && Ge != i10 && akbVar.T) {
                        if (akbVar.Z != b10) {
                            zjb zjbVar = (zjb) akbVar.b0.get(b10);
                            zjb zjbVar2 = (zjb) akbVar.b0.get(akbVar.Z);
                            if (zjbVar2 != null) {
                                if (zjbVar != null) {
                                }
                            }
                        }
                        return i10 == i12 ? W : i10 == i11 ? a0 : D0(i10);
                    }
                } else if (akbVar.T) {
                    if (akbVar.Z != b10) {
                        zjb zjbVar3 = (zjb) akbVar.b0.get(b10);
                        zjb zjbVar4 = (zjb) akbVar.b0.get(akbVar.Z);
                        if (zjbVar3 != null) {
                            if (zjbVar4 != null) {
                                if (zjbVar3.d == zjbVar4.d) {
                                    if (zjbVar3.e == zjbVar4.e) {
                                        if (zjbVar3.f == zjbVar4.f) {
                                            if (zjbVar3.g == zjbVar4.g) {
                                                if (zjbVar3.h == zjbVar4.h) {
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (i10 == i12) {
                    }
                }
            } else if (akbVar.T) {
                if (akbVar.Z != b10) {
                    zjb zjbVar5 = (zjb) akbVar.b0.get(b10);
                    zjb zjbVar6 = (zjb) akbVar.b0.get(akbVar.Z);
                    if (zjbVar5 != null) {
                        if (zjbVar6 != null) {
                            if (zjbVar5.e == zjbVar6.e) {
                                if (zjbVar5.f == zjbVar6.f) {
                                    if (zjbVar5.g == zjbVar6.g) {
                                        if (zjbVar5.h == zjbVar6.h) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (i10 == i12) {
                }
            }
        }
        int indexOfKey2 = sparseIntArray.indexOfKey(i10);
        if (indexOfKey2 >= 0) {
            int valueAt = sparseIntArray.valueAt(indexOfKey2);
            return (c6 == i10 || Z6 == i10 || r8 == i10 || L8 == i10) ? valueAt | (-16777216) : valueAt;
        }
        int i14 = hm.get(i10, -1);
        if (i14 != -1 && (indexOfKey = sparseIntArray.indexOfKey(i14)) >= 0) {
            return sparseIntArray.valueAt(indexOfKey);
        }
        if (zArr != null) {
            zArr[0] = true;
        }
        return i10 == i12 ? W : i10 == i11 ? a0 : D0(i10);
    }

    public static void x1(akb akbVar, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        if (z10) {
            SharedPreferences.Editor edit = a.b.getSharedPreferences("themeconfig", 0).edit();
            if (!z12) {
                int size = akbVar.c0.size();
                int max = Math.max(0, size - akbVar.X);
                SerializedData serializedData = new SerializedData(((max << 4) + 2) << 2);
                serializedData.writeInt32(9);
                serializedData.writeInt32(max);
                for (int i10 = 0; i10 < size; i10++) {
                    zjb zjbVar = (zjb) akbVar.c0.get(i10);
                    int i11 = zjbVar.a;
                    if (i11 >= 100) {
                        serializedData.writeInt32(i11);
                        serializedData.writeInt32(zjbVar.c);
                        serializedData.writeInt32(zjbVar.d);
                        serializedData.writeInt32(zjbVar.e);
                        serializedData.writeInt32(zjbVar.f);
                        serializedData.writeInt32(zjbVar.g);
                        serializedData.writeInt32(zjbVar.h);
                        serializedData.writeBool(zjbVar.i);
                        serializedData.writeInt64(zjbVar.j);
                        serializedData.writeInt64(zjbVar.k);
                        serializedData.writeInt64(zjbVar.l);
                        serializedData.writeInt64(zjbVar.m);
                        serializedData.writeInt32(zjbVar.n);
                        serializedData.writeInt64(0L);
                        serializedData.writeDouble(zjbVar.p);
                        serializedData.writeBool(zjbVar.q);
                        serializedData.writeString(zjbVar.o);
                        serializedData.writeBool(zjbVar.r != null);
                        if (zjbVar.r != null) {
                            serializedData.writeInt32(zjbVar.t);
                            zjbVar.r.serializeToStream(serializedData);
                        }
                    }
                }
                edit.putString("accents_" + akbVar.d, Base64.encodeToString(serializedData.toByteArray(), 3));
                if (!z14) {
                    kk7.e().k(kk7.s4, new Object[0]);
                }
                if (z13) {
                    na7.q1(y6c.t0).B4(akbVar, akbVar.i(false));
                }
            }
            edit.putInt("accent_current_" + akbVar.d, akbVar.Z);
            edit.commit();
        } else {
            if (akbVar.a0 != -1) {
                if (z11) {
                    zjb zjbVar2 = (zjb) akbVar.b0.get(akbVar.Z);
                    akbVar.b0.remove(zjbVar2.a);
                    akbVar.c0.remove(zjbVar2);
                    TLRPC.TL_theme tL_theme = zjbVar2.r;
                    if (tL_theme != null) {
                        akbVar.d0.remove(tL_theme.id);
                    }
                }
                akbVar.Z = akbVar.a0;
                zjb i12 = akbVar.i(false);
                if (i12 != null) {
                    akbVar.j0 = i12.y;
                } else {
                    akbVar.j0 = null;
                }
            }
            if (I == akbVar) {
                r1(false, false);
            }
        }
        akbVar.a0 = -1;
    }

    public static int y(int i10, boolean z10, boolean z11) {
        if (z10 && z11) {
            return p1(0.07f, -1);
        }
        float[] N02 = N0(3);
        Color.colorToHSV(i10, N02);
        if (z10) {
            N02[2] = Math.min(1.0f, N02[2] + 0.07f);
            if (z11) {
                N02[1] = Math.min(1.0f, N02[1] + 0.02f);
            }
        } else {
            N02[2] = Math.max(0.0f, N02[2] - (z11 ? 0.06f : 0.03f));
            if (z11) {
                float f10 = N02[1];
                if (f10 > 0.02f) {
                    N02[1] = Math.min(1.0f, f10 + 0.02f);
                }
            }
        }
        return Color.HSVToColor(Color.alpha(i10), N02);
    }

    public static Integer y0(int i10, wjb wjbVar) {
        int i11;
        if (!g1(wjbVar) || i10 < 0 || i10 >= (i11 = e5)) {
            return null;
        }
        if (Bm == null) {
            Bm = new int[i11];
            o1(2, La, ic, dc, Hb, Ib);
            o1(3, Qa, de, ee, nd, od);
            o1(1, Ma, zb, Ab, Bb, Cb, Db, Eb);
            o1(1, Oa, Qb, Rb);
            o1(1, Pa, Sb, Tb, Ub, Vb);
            o1(1, ab, Lb, Mb, Nb, Ob, Pb, Pc, Xb, Yb, jc, vc, Fc, Jb, Kb, Jd, Wb, ec, fc);
            o1(1, bb, Dc, Ec, Gc, pc, sc);
            o1(1, cb, Fb, Gb, Hc, gc, hc);
            o1(2, db, wc, xc, Ac, Bc, kc, lc);
            o1(2, eb, mc, oc, qc, rc, tc, uc, yc, zc, il, rl);
            o1(2, fb, kl, ml);
            o1(1, Ta, ie, je);
            o1(1, Ua, qe);
            o1(1, Va, oe, pe);
            o1(1, Wa, sk);
            o1(1, Xa, Ic);
            o1(1, Ea, Cd, Hd, Nd, Rd);
        }
        int i12 = Bm[i10];
        if (i12 == 0) {
            return null;
        }
        int i13 = 65535 & i12;
        int i14 = i12 >> 16;
        int i15 = ta;
        return i14 != 2 ? i14 != 3 ? Integer.valueOf(v0(i13, wjbVar)) : Integer.valueOf(bm2.k(v0(i13, wjbVar), v0(i15, wjbVar))) : Integer.valueOf(bm2.k(v0(i13, wjbVar), bm2.k(v0(Ka, wjbVar), v0(i15, wjbVar))));
    }

    public static void y1(int i10, int i11, boolean z10) {
        int i12 = r8;
        int i13 = Z6;
        int i14 = Ge;
        int i15 = Fe;
        int i16 = Ee;
        int i17 = De;
        if (i10 == i17 || i10 == i16 || i10 == i15 || i10 == i14 || i10 == c6 || i10 == i13 || i10 == i12 || i10 == L8) {
            i11 |= -16777216;
        }
        SparseIntArray sparseIntArray = km;
        if (z10) {
            sparseIntArray.delete(i10);
        } else {
            sparseIntArray.put(i10, i11);
        }
        if (i10 == xd) {
            g(d0);
            return;
        }
        if (i10 == bd || i10 == cd) {
            h();
            return;
        }
        if (i10 == i17 || i10 == i16 || i10 == i15 || i10 == i14 || i10 == He) {
            s1(true);
            return;
        }
        int i18 = kk7.t4;
        if (i10 == i12) {
            kk7.e().k(i18, new Object[0]);
        } else {
            if (i10 != i13 || Build.VERSION.SDK_INT < 26) {
                return;
            }
            kk7.e().k(i18, new Object[0]);
        }
    }

    public static int z(int i10, boolean z10, boolean z11) {
        if (z10 && z11) {
            return p1(0.14f, -1);
        }
        float[] N02 = N0(3);
        Color.colorToHSV(i10, N02);
        if (z10) {
            N02[2] = Math.min(1.0f, N02[2] + 0.14f);
            if (z11) {
                N02[1] = Math.min(1.0f, N02[1] + 0.03f);
            }
        } else {
            N02[2] = Math.max(0.0f, N02[2] - (z11 ? 0.14f : 0.12f));
            if (z11) {
                float f10 = N02[1];
                if (f10 > 0.02f) {
                    N02[1] = Math.min(1.0f, f10 + 0.04f);
                }
            }
        }
        return Color.HSVToColor(Color.alpha(i10), N02);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        if (r2 <= 31) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0055, code lost:
    
        bkb.r1 = org.telegram.messenger.a.b.getResources().getDrawable(org.telegram.messenger.beta.R.drawable.newyear);
        bkb.C1 = -gl.L(3.0f);
        bkb.D1 = -gl.L(-7.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0053, code lost:
    
        if (r2 == 1) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Drawable z0() {
        if (System.currentTimeMillis() - E1 >= 60000) {
            E1 = System.currentTimeMillis();
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(System.currentTimeMillis());
            int i10 = calendar.get(2);
            int i11 = calendar.get(5);
            calendar.get(12);
            int i12 = calendar.get(11);
            if (i10 == 0 && i11 == 1 && i12 <= 23) {
                F1 = true;
            } else {
                F1 = false;
            }
            if (r1 == null) {
                if (i10 == 11) {
                    boolean z10 = w01.a;
                    if (i11 >= 31) {
                    }
                }
                if (i10 == 0) {
                }
            }
        }
        return r1;
    }

    public static void z1(Drawable drawable, int i10, boolean z10) {
        if (drawable instanceof fm2) {
            Drawable drawable2 = z10 ? ((fm2) drawable).b : ((fm2) drawable).a;
            if (drawable2 instanceof ColorDrawable) {
                ((ColorDrawable) drawable2).setColor(i10);
            } else {
                drawable2.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
            }
        }
    }
}
