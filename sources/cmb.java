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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class cmb {
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
    public static ai7 D3;
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
    public static p09 G1;
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
    public static p09 H1;
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
    public static bmb I;
    public static TextPaint I0;
    public static p09 I1;
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
    public static bmb J;
    public static TextPaint J0;
    public static p09 J1;
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
    public static bmb K;
    public static TextPaint K0;
    public static p09 K1;
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
    public static final bmb L;
    public static TextPaint L0;
    public static p09 L1;
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
    public static bmb M;
    public static TextPaint M0;
    public static p09 M1;
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
    public static p09 N1;
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
    public static ai7 W0;
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
    public static n50 c5;
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
    public static fr6 d;
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
    public static hs9 f1;
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
    public static hs9 g1;
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
    public static wn9 j3;
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
    public static m37 l3;
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
    public static m37 m3;
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
    public static m37 n3;
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
    public static m37 o3;
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
    public static m37 p3;
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
    public static m37 q3;
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
    public static m37 r3;
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
    public static m37 s3;
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
    public static vp4 sm;
    public static int t;
    public static Paint t0;
    public static p09 t1;
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
    public static wm9 tm;
    public static int u;
    public static Paint u0;
    public static p09 u1;
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
    public static p09 v1;
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
    public static p09 w1;
    public static TextPaint w2;
    public static l08 w3;
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
    public static p09 x1;
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
    public static final olb xm;
    public static double y;
    public static Paint y0;
    public static p09 y1;
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
    public static final int a = on2.p(-16777216, 27);
    public static final Object c = new Object();
    public static float h = 1.0f;
    public static final sw l = new sw(11);
    public static final sw m = new sw(12);
    public static final byte n = 99;
    public static final Paint z = new Paint(1);
    public static final boolean[] C = new boolean[4];
    public static final int[] D = new int[4];
    public static final long[] E = new long[4];
    public static final Drawable[] q0 = new Drawable[25];
    public static final e0b[] t3 = new e0b[6];
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
    /* JADX WARN: Removed duplicated region for block: B:101:0x26a1  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x26ae A[Catch: Exception -> 0x28c8, TryCatch #1 {Exception -> 0x28c8, blocks: (B:55:0x2351, B:57:0x236b, B:58:0x23a8, B:60:0x23b6, B:61:0x23dd, B:63:0x23e1, B:65:0x23e9, B:66:0x23fb, B:67:0x2405, B:69:0x240b, B:71:0x2415, B:73:0x2419, B:75:0x2447, B:76:0x244b, B:90:0x267f, B:92:0x2685, B:93:0x268e, B:95:0x2692, B:97:0x269a, B:99:0x269e, B:100:0x26a2, B:102:0x26a4, B:104:0x26ae, B:78:0x2575, B:81:0x2594, B:82:0x259f, B:84:0x25ab, B:88:0x25b7, B:89:0x2663, B:86:0x25be, B:109:0x25c1, B:168:0x256c, B:169:0x2574, B:176:0x26c3, B:177:0x26c9, B:180:0x26d4, B:182:0x272b, B:183:0x2739, B:185:0x2747, B:186:0x2755, B:219:0x274e, B:220:0x2732, B:222:0x23c4, B:224:0x23cc, B:226:0x23d3, B:228:0x23db, B:229:0x2378, B:231:0x2380, B:233:0x2386, B:235:0x238e, B:237:0x2396, B:114:0x245c, B:161:0x255f, B:162:0x2564), top: B:54:0x2351, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x26b9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x2532 A[Catch: all -> 0x255e, TryCatch #3 {all -> 0x255e, blocks: (B:118:0x2471, B:120:0x2486, B:121:0x248c, B:123:0x249e, B:126:0x24ae, B:129:0x24bb, B:132:0x24d2, B:135:0x24e3, B:137:0x24f2, B:140:0x24fb, B:142:0x250e, B:144:0x2517, B:146:0x251e, B:147:0x252e, B:149:0x2532, B:150:0x2536, B:152:0x2541, B:153:0x2548, B:156:0x24d9, B:157:0x24c5), top: B:117:0x2471, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x2541 A[Catch: all -> 0x255e, TryCatch #3 {all -> 0x255e, blocks: (B:118:0x2471, B:120:0x2486, B:121:0x248c, B:123:0x249e, B:126:0x24ae, B:129:0x24bb, B:132:0x24d2, B:135:0x24e3, B:137:0x24f2, B:140:0x24fb, B:142:0x250e, B:144:0x2517, B:146:0x251e, B:147:0x252e, B:149:0x2532, B:150:0x2536, B:152:0x2541, B:153:0x2548, B:156:0x24d9, B:157:0x24c5), top: B:117:0x2471, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x2685 A[Catch: Exception -> 0x28c8, TryCatch #1 {Exception -> 0x28c8, blocks: (B:55:0x2351, B:57:0x236b, B:58:0x23a8, B:60:0x23b6, B:61:0x23dd, B:63:0x23e1, B:65:0x23e9, B:66:0x23fb, B:67:0x2405, B:69:0x240b, B:71:0x2415, B:73:0x2419, B:75:0x2447, B:76:0x244b, B:90:0x267f, B:92:0x2685, B:93:0x268e, B:95:0x2692, B:97:0x269a, B:99:0x269e, B:100:0x26a2, B:102:0x26a4, B:104:0x26ae, B:78:0x2575, B:81:0x2594, B:82:0x259f, B:84:0x25ab, B:88:0x25b7, B:89:0x2663, B:86:0x25be, B:109:0x25c1, B:168:0x256c, B:169:0x2574, B:176:0x26c3, B:177:0x26c9, B:180:0x26d4, B:182:0x272b, B:183:0x2739, B:185:0x2747, B:186:0x2755, B:219:0x274e, B:220:0x2732, B:222:0x23c4, B:224:0x23cc, B:226:0x23d3, B:228:0x23db, B:229:0x2378, B:231:0x2380, B:233:0x2386, B:235:0x238e, B:237:0x2396, B:114:0x245c, B:161:0x255f, B:162:0x2564), top: B:54:0x2351, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x269e A[Catch: Exception -> 0x28c8, TryCatch #1 {Exception -> 0x28c8, blocks: (B:55:0x2351, B:57:0x236b, B:58:0x23a8, B:60:0x23b6, B:61:0x23dd, B:63:0x23e1, B:65:0x23e9, B:66:0x23fb, B:67:0x2405, B:69:0x240b, B:71:0x2415, B:73:0x2419, B:75:0x2447, B:76:0x244b, B:90:0x267f, B:92:0x2685, B:93:0x268e, B:95:0x2692, B:97:0x269a, B:99:0x269e, B:100:0x26a2, B:102:0x26a4, B:104:0x26ae, B:78:0x2575, B:81:0x2594, B:82:0x259f, B:84:0x25ab, B:88:0x25b7, B:89:0x2663, B:86:0x25be, B:109:0x25c1, B:168:0x256c, B:169:0x2574, B:176:0x26c3, B:177:0x26c9, B:180:0x26d4, B:182:0x272b, B:183:0x2739, B:185:0x2747, B:186:0x2755, B:219:0x274e, B:220:0x2732, B:222:0x23c4, B:224:0x23cc, B:226:0x23d3, B:228:0x23db, B:229:0x2378, B:231:0x2380, B:233:0x2386, B:235:0x238e, B:237:0x2396, B:114:0x245c, B:161:0x255f, B:162:0x2564), top: B:54:0x2351, inners: #2 }] */
    /* JADX WARN: Type inference failed for: r11v103, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v108 */
    /* JADX WARN: Type inference failed for: r11v132 */
    static {
        HashSet hashSet;
        bmb bmbVar;
        bmb bmbVar2;
        boolean z10;
        byte b10;
        Iterator it;
        SharedPreferences.Editor editor;
        RuntimeException runtimeException;
        boolean z11;
        Iterator it2;
        SharedPreferences.Editor editor2;
        int i10;
        TLRPC.TL_theme tL_theme;
        TLRPC.TL_theme tL_theme2;
        SparseArray sparseArray;
        amb i11;
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
        byte b11 = 3;
        int i12 = e5;
        int i13 = i12 + 1;
        e5 = i13;
        f5 = i12;
        int i14 = i12 + 2;
        e5 = i14;
        g5 = i13;
        int i15 = i12 + 3;
        e5 = i15;
        h5 = i14;
        int i16 = i12 + 4;
        e5 = i16;
        i5 = i15;
        int i17 = i12 + 5;
        e5 = i17;
        j5 = i16;
        int i18 = i12 + 6;
        e5 = i18;
        k5 = i17;
        int i19 = i12 + 7;
        e5 = i19;
        l5 = i18;
        int i20 = i12 + 8;
        e5 = i20;
        m5 = i19;
        int i21 = i12 + 9;
        e5 = i21;
        n5 = i20;
        int i22 = i12 + 10;
        e5 = i22;
        o5 = i21;
        int i23 = i12 + 11;
        e5 = i23;
        p5 = i22;
        int i24 = i12 + 12;
        e5 = i24;
        q5 = i23;
        int i25 = i12 + 13;
        e5 = i25;
        r5 = i24;
        int i26 = i12 + 14;
        e5 = i26;
        s5 = i25;
        int i27 = i12 + 15;
        e5 = i27;
        t5 = i26;
        int i28 = i12 + 16;
        e5 = i28;
        u5 = i27;
        int i29 = i12 + 17;
        e5 = i29;
        v5 = i28;
        int i30 = i12 + 18;
        e5 = i30;
        w5 = i29;
        int i31 = i12 + 19;
        e5 = i31;
        x5 = i30;
        int i32 = i12 + 20;
        e5 = i32;
        y5 = i31;
        int i33 = i12 + 21;
        e5 = i33;
        z5 = i32;
        int i34 = i12 + 22;
        e5 = i34;
        A5 = i33;
        int i35 = i12 + 23;
        e5 = i35;
        B5 = i34;
        int i36 = i12 + 24;
        e5 = i36;
        C5 = i35;
        int i37 = i12 + 25;
        e5 = i37;
        D5 = i36;
        int i38 = i12 + 26;
        e5 = i38;
        E5 = i37;
        int i39 = i12 + 27;
        e5 = i39;
        F5 = i38;
        int i40 = i12 + 28;
        e5 = i40;
        G5 = i39;
        int i41 = i12 + 29;
        e5 = i41;
        H5 = i40;
        int i42 = i12 + 30;
        e5 = i42;
        I5 = i41;
        int i43 = i12 + 31;
        e5 = i43;
        J5 = i42;
        int i44 = i12 + 32;
        e5 = i44;
        K5 = i43;
        int i45 = i12 + 33;
        e5 = i45;
        L5 = i44;
        int i46 = i12 + 34;
        e5 = i46;
        M5 = i45;
        int i47 = i12 + 35;
        e5 = i47;
        N5 = i46;
        int i48 = i12 + 36;
        e5 = i48;
        O5 = i47;
        int i49 = i12 + 37;
        e5 = i49;
        P5 = i48;
        int i50 = i12 + 38;
        e5 = i50;
        Q5 = i49;
        int i51 = i12 + 39;
        e5 = i51;
        R5 = i50;
        int i52 = i12 + 40;
        e5 = i52;
        S5 = i51;
        int i53 = i12 + 41;
        e5 = i53;
        T5 = i52;
        int i54 = i12 + 42;
        e5 = i54;
        U5 = i53;
        int i55 = i12 + 43;
        e5 = i55;
        V5 = i54;
        int i56 = i12 + 44;
        e5 = i56;
        W5 = i55;
        int i57 = i12 + 45;
        e5 = i57;
        X5 = i56;
        int i58 = i12 + 46;
        e5 = i58;
        Y5 = i57;
        int i59 = i12 + 47;
        e5 = i59;
        Z5 = i58;
        int i60 = i12 + 48;
        e5 = i60;
        a6 = i59;
        e5 = i12 + 49;
        b6 = i60;
        int i61 = e5;
        int i62 = i61 + 1;
        e5 = i62;
        c6 = i61;
        int i63 = i61 + 2;
        e5 = i63;
        d6 = i62;
        int i64 = i61 + 3;
        e5 = i64;
        e6 = i63;
        int i65 = i61 + 4;
        e5 = i65;
        f6 = i64;
        int i66 = i61 + 5;
        e5 = i66;
        g6 = i65;
        int i67 = i61 + 6;
        e5 = i67;
        h6 = i66;
        int i68 = i61 + 7;
        e5 = i68;
        i6 = i67;
        int i69 = i61 + 8;
        e5 = i69;
        j6 = i68;
        int i70 = i61 + 9;
        e5 = i70;
        k6 = i69;
        int i71 = i61 + 10;
        e5 = i71;
        l6 = i70;
        int i72 = i61 + 11;
        e5 = i72;
        m6 = i71;
        int i73 = i61 + 12;
        e5 = i73;
        n6 = i72;
        int i74 = i61 + 13;
        e5 = i74;
        o6 = i73;
        int i75 = i61 + 14;
        e5 = i75;
        p6 = i74;
        int i76 = i61 + 15;
        e5 = i76;
        q6 = i75;
        int i77 = i61 + 16;
        e5 = i77;
        r6 = i76;
        int i78 = i61 + 17;
        e5 = i78;
        s6 = i77;
        int i79 = i61 + 18;
        e5 = i79;
        t6 = i78;
        int i80 = i61 + 19;
        e5 = i80;
        u6 = i79;
        int i81 = i61 + 20;
        e5 = i81;
        v6 = i80;
        int i82 = i61 + 21;
        e5 = i82;
        w6 = i81;
        int i83 = i61 + 22;
        e5 = i83;
        x6 = i82;
        int i84 = i61 + 23;
        e5 = i84;
        y6 = i83;
        int i85 = i61 + 24;
        e5 = i85;
        z6 = i84;
        int i86 = i61 + 25;
        e5 = i86;
        A6 = i85;
        int i87 = i61 + 26;
        e5 = i87;
        B6 = i86;
        int i88 = i61 + 27;
        e5 = i88;
        C6 = i87;
        int i89 = i61 + 28;
        e5 = i89;
        D6 = i88;
        int i90 = i61 + 29;
        e5 = i90;
        E6 = i89;
        int i91 = i61 + 30;
        e5 = i91;
        F6 = i90;
        int i92 = i61 + 31;
        e5 = i92;
        G6 = i91;
        int i93 = i61 + 32;
        e5 = i93;
        H6 = i92;
        int i94 = i61 + 33;
        e5 = i94;
        I6 = i93;
        int i95 = i61 + 34;
        e5 = i95;
        J6 = i94;
        int i96 = i61 + 35;
        e5 = i96;
        K6 = i95;
        int i97 = i61 + 36;
        e5 = i97;
        L6 = i96;
        int i98 = i61 + 37;
        e5 = i98;
        M6 = i97;
        int i99 = i61 + 38;
        e5 = i99;
        N6 = i98;
        int i100 = i61 + 39;
        e5 = i100;
        O6 = i99;
        int i101 = i61 + 40;
        e5 = i101;
        P6 = i100;
        int i102 = i61 + 41;
        e5 = i102;
        Q6 = i101;
        int i103 = i61 + 42;
        e5 = i103;
        R6 = i102;
        int i104 = i61 + 43;
        e5 = i104;
        S6 = i103;
        int i105 = i61 + 44;
        e5 = i105;
        T6 = i104;
        int i106 = i61 + 45;
        e5 = i106;
        U6 = i105;
        int i107 = i61 + 46;
        e5 = i107;
        V6 = i106;
        int i108 = i61 + 47;
        e5 = i108;
        W6 = i107;
        int i109 = i61 + 48;
        e5 = i109;
        X6 = i108;
        e5 = i61 + 49;
        Y6 = i109;
        int i110 = e5;
        int i111 = i110 + 1;
        e5 = i111;
        Z6 = i110;
        int i112 = i110 + 2;
        e5 = i112;
        a7 = i111;
        int i113 = i110 + 3;
        e5 = i113;
        b7 = i112;
        int i114 = i110 + 4;
        e5 = i114;
        c7 = i113;
        int i115 = i110 + 5;
        e5 = i115;
        d7 = i114;
        int i116 = i110 + 6;
        e5 = i116;
        e7 = i115;
        int i117 = i110 + 7;
        e5 = i117;
        f7 = i116;
        int i118 = i110 + 8;
        e5 = i118;
        g7 = i117;
        int i119 = i110 + 9;
        e5 = i119;
        h7 = i118;
        int i120 = i110 + 10;
        e5 = i120;
        i7 = i119;
        int i121 = i110 + 11;
        e5 = i121;
        j7 = i120;
        int i122 = i110 + 12;
        e5 = i122;
        k7 = i121;
        int i123 = i110 + 13;
        e5 = i123;
        l7 = i122;
        int i124 = i110 + 14;
        e5 = i124;
        m7 = i123;
        int i125 = i110 + 15;
        e5 = i125;
        n7 = i124;
        int i126 = i110 + 16;
        e5 = i126;
        o7 = i125;
        int i127 = i110 + 17;
        e5 = i127;
        p7 = i126;
        int i128 = i110 + 18;
        e5 = i128;
        q7 = i127;
        int i129 = i110 + 19;
        e5 = i129;
        r7 = i128;
        int i130 = i110 + 20;
        e5 = i130;
        s7 = i129;
        int i131 = i110 + 21;
        e5 = i131;
        t7 = i130;
        int i132 = i110 + 22;
        e5 = i132;
        u7 = i131;
        int i133 = i110 + 23;
        e5 = i133;
        v7 = i132;
        int i134 = i110 + 24;
        e5 = i134;
        w7 = i133;
        int i135 = i110 + 25;
        e5 = i135;
        x7 = i134;
        int i136 = i110 + 26;
        e5 = i136;
        y7 = i135;
        int i137 = i110 + 27;
        e5 = i137;
        z7 = i136;
        int i138 = i110 + 28;
        e5 = i138;
        A7 = i137;
        int i139 = i110 + 29;
        e5 = i139;
        B7 = i138;
        int i140 = i110 + 30;
        e5 = i140;
        C7 = i139;
        int i141 = i110 + 31;
        e5 = i141;
        D7 = i140;
        int i142 = i110 + 32;
        e5 = i142;
        E7 = i141;
        int i143 = i110 + 33;
        e5 = i143;
        F7 = i142;
        int i144 = i110 + 34;
        e5 = i144;
        G7 = i143;
        int i145 = i110 + 35;
        e5 = i145;
        H7 = i144;
        int i146 = i110 + 36;
        e5 = i146;
        I7 = i145;
        int i147 = i110 + 37;
        e5 = i147;
        J7 = i146;
        int i148 = i110 + 38;
        e5 = i148;
        K7 = i147;
        int i149 = i110 + 39;
        e5 = i149;
        L7 = i148;
        int i150 = i110 + 40;
        e5 = i150;
        M7 = i149;
        int i151 = i110 + 41;
        e5 = i151;
        N7 = i150;
        int i152 = i110 + 42;
        e5 = i152;
        O7 = i151;
        int i153 = i110 + 43;
        e5 = i153;
        P7 = i152;
        int i154 = i110 + 44;
        e5 = i154;
        Q7 = i153;
        int i155 = i110 + 45;
        e5 = i155;
        R7 = i154;
        int i156 = i110 + 46;
        e5 = i156;
        S7 = i155;
        int i157 = i110 + 47;
        e5 = i157;
        T7 = i156;
        int i158 = i110 + 48;
        e5 = i158;
        U7 = i157;
        e5 = i110 + 49;
        V7 = i158;
        int i159 = e5;
        int i160 = i159 + 1;
        e5 = i160;
        W7 = i159;
        int i161 = i159 + 2;
        e5 = i161;
        X7 = i160;
        int i162 = i159 + 3;
        e5 = i162;
        Y7 = i161;
        int i163 = i159 + 4;
        e5 = i163;
        Z7 = i162;
        int i164 = i159 + 5;
        e5 = i164;
        a8 = i163;
        int i165 = i159 + 6;
        e5 = i165;
        b8 = i164;
        int i166 = i159 + 7;
        e5 = i166;
        c8 = i165;
        int i167 = i159 + 8;
        e5 = i167;
        d8 = i166;
        int i168 = i159 + 9;
        e5 = i168;
        e8 = i167;
        int i169 = i159 + 10;
        e5 = i169;
        f8 = i168;
        int i170 = i159 + 11;
        e5 = i170;
        g8 = i169;
        int i171 = i159 + 12;
        e5 = i171;
        h8 = i170;
        int i172 = i159 + 13;
        e5 = i172;
        i8 = i171;
        int i173 = i159 + 14;
        e5 = i173;
        j8 = i172;
        int i174 = i159 + 15;
        e5 = i174;
        k8 = i173;
        int i175 = i159 + 16;
        e5 = i175;
        l8 = i174;
        int i176 = i159 + 17;
        e5 = i176;
        m8 = i175;
        int i177 = i159 + 18;
        e5 = i177;
        n8 = i176;
        o8 = new int[]{i150, i151, i152, i153, i154, i155, i156};
        p8 = new int[]{i157, i158, i159, i160, i161, i162, i163};
        q8 = new int[]{i170, i171, i172, i173, i174, i175, i176};
        int i178 = i159 + 19;
        e5 = i178;
        r8 = i177;
        int i179 = i159 + 20;
        e5 = i179;
        s8 = i178;
        int i180 = i159 + 21;
        e5 = i180;
        t8 = i179;
        int i181 = i159 + 22;
        e5 = i181;
        u8 = i180;
        int i182 = i159 + 23;
        e5 = i182;
        v8 = i181;
        int i183 = i159 + 24;
        e5 = i183;
        w8 = i182;
        int i184 = i159 + 25;
        e5 = i184;
        x8 = i183;
        int i185 = i159 + 26;
        e5 = i185;
        y8 = i184;
        int i186 = i159 + 27;
        e5 = i186;
        z8 = i185;
        int i187 = i159 + 28;
        e5 = i187;
        A8 = i186;
        int i188 = i159 + 29;
        e5 = i188;
        B8 = i187;
        int i189 = i159 + 30;
        e5 = i189;
        C8 = i188;
        int i190 = i159 + 31;
        e5 = i190;
        D8 = i189;
        int i191 = i159 + 32;
        e5 = i191;
        E8 = i190;
        int i192 = i159 + 33;
        e5 = i192;
        F8 = i191;
        int i193 = i159 + 34;
        e5 = i193;
        G8 = i192;
        int i194 = i159 + 35;
        e5 = i194;
        H8 = i193;
        int i195 = i159 + 36;
        e5 = i195;
        I8 = i194;
        int i196 = i159 + 37;
        e5 = i196;
        J8 = i195;
        int i197 = i159 + 38;
        e5 = i197;
        K8 = i196;
        int i198 = i159 + 39;
        e5 = i198;
        L8 = i197;
        int i199 = i159 + 40;
        e5 = i199;
        M8 = i198;
        int i200 = i159 + 41;
        e5 = i200;
        N8 = i199;
        int i201 = i159 + 42;
        e5 = i201;
        O8 = i200;
        int i202 = i159 + 43;
        e5 = i202;
        P8 = i201;
        int i203 = i159 + 44;
        e5 = i203;
        Q8 = i202;
        int i204 = i159 + 45;
        e5 = i204;
        R8 = i203;
        e5 = i159 + 46;
        S8 = i204;
        int i205 = e5;
        int i206 = i205 + 1;
        e5 = i206;
        T8 = i205;
        int i207 = i205 + 2;
        e5 = i207;
        U8 = i206;
        int i208 = i205 + 3;
        e5 = i208;
        V8 = i207;
        int i209 = i205 + 4;
        e5 = i209;
        W8 = i208;
        int i210 = i205 + 5;
        e5 = i210;
        X8 = i209;
        int i211 = i205 + 6;
        e5 = i211;
        Y8 = i210;
        int i212 = i205 + 7;
        e5 = i212;
        Z8 = i211;
        int i213 = i205 + 8;
        e5 = i213;
        a9 = i212;
        int i214 = i205 + 9;
        e5 = i214;
        b9 = i213;
        int i215 = i205 + 10;
        e5 = i215;
        c9 = i214;
        int i216 = i205 + 11;
        e5 = i216;
        d9 = i215;
        int i217 = i205 + 12;
        e5 = i217;
        e9 = i216;
        int i218 = i205 + 13;
        e5 = i218;
        f9 = i217;
        int i219 = i205 + 14;
        e5 = i219;
        g9 = i218;
        int i220 = i205 + 15;
        e5 = i220;
        h9 = i219;
        int i221 = i205 + 16;
        e5 = i221;
        i9 = i220;
        int i222 = i205 + 17;
        e5 = i222;
        j9 = i221;
        int i223 = i205 + 18;
        e5 = i223;
        k9 = i222;
        int i224 = i205 + 19;
        e5 = i224;
        l9 = i223;
        int i225 = i205 + 20;
        e5 = i225;
        m9 = i224;
        int i226 = i205 + 21;
        e5 = i226;
        n9 = i225;
        int i227 = i205 + 22;
        e5 = i227;
        o9 = i226;
        int i228 = i205 + 23;
        e5 = i228;
        p9 = i227;
        int i229 = i205 + 24;
        e5 = i229;
        q9 = i228;
        int i230 = i205 + 25;
        e5 = i230;
        r9 = i229;
        int i231 = i205 + 26;
        e5 = i231;
        s9 = i230;
        int i232 = i205 + 27;
        e5 = i232;
        t9 = i231;
        int i233 = i205 + 28;
        e5 = i233;
        u9 = i232;
        int i234 = i205 + 29;
        e5 = i234;
        v9 = i233;
        int i235 = i205 + 30;
        e5 = i235;
        w9 = i234;
        int i236 = i205 + 31;
        e5 = i236;
        x9 = i235;
        int i237 = i205 + 32;
        e5 = i237;
        y9 = i236;
        int i238 = i205 + 33;
        e5 = i238;
        z9 = i237;
        int i239 = i205 + 34;
        e5 = i239;
        A9 = i238;
        int i240 = i205 + 35;
        e5 = i240;
        B9 = i239;
        int i241 = i205 + 36;
        e5 = i241;
        C9 = i240;
        int i242 = i205 + 37;
        e5 = i242;
        D9 = i241;
        int i243 = i205 + 38;
        e5 = i243;
        E9 = i242;
        int i244 = i205 + 39;
        e5 = i244;
        F9 = i243;
        int i245 = i205 + 40;
        e5 = i245;
        G9 = i244;
        int i246 = i205 + 41;
        e5 = i246;
        H9 = i245;
        int i247 = i205 + 42;
        e5 = i247;
        I9 = i246;
        int i248 = i205 + 43;
        e5 = i248;
        J9 = i247;
        int i249 = i205 + 44;
        e5 = i249;
        K9 = i248;
        int i250 = i205 + 45;
        e5 = i250;
        L9 = i249;
        int i251 = i205 + 46;
        e5 = i251;
        M9 = i250;
        int i252 = i205 + 47;
        e5 = i252;
        N9 = i251;
        int i253 = i205 + 48;
        e5 = i253;
        O9 = i252;
        e5 = i205 + 49;
        P9 = i253;
        int i254 = e5;
        int i255 = i254 + 1;
        e5 = i255;
        Q9 = i254;
        int i256 = i254 + 2;
        e5 = i256;
        R9 = i255;
        int i257 = i254 + 3;
        e5 = i257;
        S9 = i256;
        int i258 = i254 + 4;
        e5 = i258;
        T9 = i257;
        int i259 = i254 + 5;
        e5 = i259;
        U9 = i258;
        int i260 = i254 + 6;
        e5 = i260;
        V9 = i259;
        int i261 = i254 + 7;
        e5 = i261;
        W9 = i260;
        int i262 = i254 + 8;
        e5 = i262;
        X9 = i261;
        int i263 = i254 + 9;
        e5 = i263;
        Y9 = i262;
        int i264 = i254 + 10;
        e5 = i264;
        Z9 = i263;
        int i265 = i254 + 11;
        e5 = i265;
        aa = i264;
        int i266 = i254 + 12;
        e5 = i266;
        ba = i265;
        int i267 = i254 + 13;
        e5 = i267;
        ca = i266;
        int i268 = i254 + 14;
        e5 = i268;
        da = i267;
        int i269 = i254 + 15;
        e5 = i269;
        ea = i268;
        int i270 = i254 + 16;
        e5 = i270;
        fa = i269;
        int i271 = i254 + 17;
        e5 = i271;
        ga = i270;
        int i272 = i254 + 18;
        e5 = i272;
        ha = i271;
        int i273 = i254 + 19;
        e5 = i273;
        ia = i272;
        int i274 = i254 + 20;
        e5 = i274;
        ja = i273;
        int i275 = i254 + 21;
        e5 = i275;
        ka = i274;
        int i276 = i254 + 22;
        e5 = i276;
        la = i275;
        int i277 = i254 + 23;
        e5 = i277;
        ma = i276;
        int i278 = i254 + 24;
        e5 = i278;
        na = i277;
        int i279 = i254 + 25;
        e5 = i279;
        oa = i278;
        int i280 = i254 + 26;
        e5 = i280;
        pa = i279;
        int i281 = i254 + 27;
        e5 = i281;
        qa = i280;
        int i282 = i254 + 28;
        e5 = i282;
        ra = i281;
        int i283 = i254 + 29;
        e5 = i283;
        sa = i282;
        int i284 = i254 + 30;
        e5 = i284;
        ta = i283;
        int i285 = i254 + 31;
        e5 = i285;
        ua = i284;
        int i286 = i254 + 32;
        e5 = i286;
        va = i285;
        int i287 = i254 + 33;
        e5 = i287;
        wa = i286;
        int i288 = i254 + 34;
        e5 = i288;
        xa = i287;
        int i289 = i254 + 35;
        e5 = i289;
        ya = i288;
        int i290 = i254 + 36;
        e5 = i290;
        za = i289;
        int i291 = i254 + 37;
        e5 = i291;
        Aa = i290;
        int i292 = i254 + 38;
        e5 = i292;
        Ba = i291;
        int i293 = i254 + 39;
        e5 = i293;
        Ca = i292;
        int i294 = i254 + 40;
        e5 = i294;
        Da = i293;
        int i295 = i254 + 41;
        e5 = i295;
        Ea = i294;
        int i296 = i254 + 42;
        e5 = i296;
        Fa = i295;
        int i297 = i254 + 43;
        e5 = i297;
        Ga = i296;
        int i298 = i254 + 44;
        e5 = i298;
        Ha = i297;
        int i299 = i254 + 45;
        e5 = i299;
        Ia = i298;
        int i300 = i254 + 46;
        e5 = i300;
        Ja = i299;
        int i301 = i254 + 47;
        e5 = i301;
        Ka = i300;
        int i302 = i254 + 48;
        e5 = i302;
        La = i301;
        e5 = i254 + 49;
        Ma = i302;
        int i303 = e5;
        int i304 = i303 + 1;
        e5 = i304;
        Na = i303;
        int i305 = i303 + 2;
        e5 = i305;
        Oa = i304;
        int i306 = i303 + 3;
        e5 = i306;
        Pa = i305;
        int i307 = i303 + 4;
        e5 = i307;
        Qa = i306;
        int i308 = i303 + 5;
        e5 = i308;
        Ra = i307;
        int i309 = i303 + 6;
        e5 = i309;
        Sa = i308;
        int i310 = i303 + 7;
        e5 = i310;
        Ta = i309;
        int i311 = i303 + 8;
        e5 = i311;
        Ua = i310;
        int i312 = i303 + 9;
        e5 = i312;
        Va = i311;
        int i313 = i303 + 10;
        e5 = i313;
        Wa = i312;
        int i314 = i303 + 11;
        e5 = i314;
        Xa = i313;
        int i315 = i303 + 12;
        e5 = i315;
        Ya = i314;
        int i316 = i303 + 13;
        e5 = i316;
        Za = i315;
        int i317 = i303 + 14;
        e5 = i317;
        ab = i316;
        int i318 = i303 + 15;
        e5 = i318;
        bb = i317;
        int i319 = i303 + 16;
        e5 = i319;
        cb = i318;
        int i320 = i303 + 17;
        e5 = i320;
        db = i319;
        int i321 = i303 + 18;
        e5 = i321;
        eb = i320;
        int i322 = i303 + 19;
        e5 = i322;
        fb = i321;
        int i323 = i303 + 20;
        e5 = i323;
        gb = i322;
        int i324 = i303 + 21;
        e5 = i324;
        hb = i323;
        int i325 = i303 + 22;
        e5 = i325;
        ib = i324;
        int i326 = i303 + 23;
        e5 = i326;
        jb = i325;
        int i327 = i303 + 24;
        e5 = i327;
        kb = i326;
        int i328 = i303 + 25;
        e5 = i328;
        lb = i327;
        int i329 = i303 + 26;
        e5 = i329;
        mb = i328;
        int i330 = i303 + 27;
        e5 = i330;
        nb = i329;
        int i331 = i303 + 28;
        e5 = i331;
        ob = i330;
        pb = i331;
        int i332 = i303 + 29;
        e5 = i332;
        qb = i331;
        int i333 = i303 + 30;
        e5 = i333;
        rb = i332;
        int i334 = i303 + 31;
        e5 = i334;
        sb = i333;
        int i335 = i303 + 32;
        e5 = i335;
        tb = i334;
        int i336 = i303 + 33;
        e5 = i336;
        ub = i335;
        int i337 = i303 + 34;
        e5 = i337;
        vb = i336;
        wb = i337;
        xb = i337;
        int i338 = i303 + 35;
        e5 = i338;
        yb = i337;
        int i339 = i303 + 36;
        e5 = i339;
        zb = i338;
        int i340 = i303 + 37;
        e5 = i340;
        Ab = i339;
        int i341 = i303 + 38;
        e5 = i341;
        Bb = i340;
        int i342 = i303 + 39;
        e5 = i342;
        Cb = i341;
        int i343 = i303 + 40;
        e5 = i343;
        Db = i342;
        int i344 = i303 + 41;
        e5 = i344;
        Eb = i343;
        int i345 = i303 + 42;
        e5 = i345;
        Fb = i344;
        int i346 = i303 + 43;
        e5 = i346;
        Gb = i345;
        int i347 = i303 + 44;
        e5 = i347;
        Hb = i346;
        int i348 = i303 + 45;
        e5 = i348;
        Ib = i347;
        e5 = i303 + 46;
        Jb = i348;
        int i349 = e5;
        int i350 = i349 + 1;
        e5 = i350;
        Kb = i349;
        int i351 = i349 + 2;
        e5 = i351;
        Lb = i350;
        int i352 = i349 + 3;
        e5 = i352;
        Mb = i351;
        int i353 = i349 + 4;
        e5 = i353;
        Nb = i352;
        int i354 = i349 + 5;
        e5 = i354;
        Ob = i353;
        int i355 = i349 + 6;
        e5 = i355;
        Pb = i354;
        int i356 = i349 + 7;
        e5 = i356;
        Qb = i355;
        int i357 = i349 + 8;
        e5 = i357;
        Rb = i356;
        int i358 = i349 + 9;
        e5 = i358;
        Sb = i357;
        int i359 = i349 + 10;
        e5 = i359;
        Tb = i358;
        int i360 = i349 + 11;
        e5 = i360;
        Ub = i359;
        int i361 = i349 + 12;
        e5 = i361;
        Vb = i360;
        int i362 = i349 + 13;
        e5 = i362;
        Wb = i361;
        int i363 = i349 + 14;
        e5 = i363;
        Xb = i362;
        int i364 = i349 + 15;
        e5 = i364;
        Yb = i363;
        int i365 = i349 + 16;
        e5 = i365;
        Zb = i364;
        int i366 = i349 + 17;
        e5 = i366;
        ac = i365;
        int i367 = i349 + 18;
        e5 = i367;
        bc = i366;
        int i368 = i349 + 19;
        e5 = i368;
        cc = i367;
        int i369 = i349 + 20;
        e5 = i369;
        dc = i368;
        int i370 = i349 + 21;
        e5 = i370;
        ec = i369;
        int i371 = i349 + 22;
        e5 = i371;
        fc = i370;
        int i372 = i349 + 23;
        e5 = i372;
        gc = i371;
        int i373 = i349 + 24;
        e5 = i373;
        hc = i372;
        int i374 = i349 + 25;
        e5 = i374;
        ic = i373;
        int i375 = i349 + 26;
        e5 = i375;
        jc = i374;
        int i376 = i349 + 27;
        e5 = i376;
        kc = i375;
        int i377 = i349 + 28;
        e5 = i377;
        lc = i376;
        int i378 = i349 + 29;
        e5 = i378;
        mc = i377;
        int i379 = i349 + 30;
        e5 = i379;
        nc = i378;
        int i380 = i349 + 31;
        e5 = i380;
        oc = i379;
        int i381 = i349 + 32;
        e5 = i381;
        pc = i380;
        int i382 = i349 + 33;
        e5 = i382;
        qc = i381;
        int i383 = i349 + 34;
        e5 = i383;
        rc = i382;
        int i384 = i349 + 35;
        e5 = i384;
        sc = i383;
        int i385 = i349 + 36;
        e5 = i385;
        tc = i384;
        int i386 = i349 + 37;
        e5 = i386;
        uc = i385;
        int i387 = i349 + 38;
        e5 = i387;
        vc = i386;
        int i388 = i349 + 39;
        e5 = i388;
        wc = i387;
        int i389 = i349 + 40;
        e5 = i389;
        xc = i388;
        int i390 = i349 + 41;
        e5 = i390;
        yc = i389;
        int i391 = i349 + 42;
        e5 = i391;
        zc = i390;
        int i392 = i349 + 43;
        e5 = i392;
        Ac = i391;
        int i393 = i349 + 44;
        e5 = i393;
        Bc = i392;
        int i394 = i349 + 45;
        e5 = i394;
        Cc = i393;
        int i395 = i349 + 46;
        e5 = i395;
        Dc = i394;
        int i396 = i349 + 47;
        e5 = i396;
        Ec = i395;
        int i397 = i349 + 48;
        e5 = i397;
        Fc = i396;
        e5 = i349 + 49;
        Gc = i397;
        int i398 = e5;
        int i399 = i398 + 1;
        e5 = i399;
        Hc = i398;
        int i400 = i398 + 2;
        e5 = i400;
        Ic = i399;
        Jc = i400;
        Kc = i400;
        int i401 = i398 + 3;
        e5 = i401;
        Lc = i400;
        int i402 = i398 + 4;
        e5 = i402;
        Mc = i401;
        int i403 = i398 + 5;
        e5 = i403;
        Nc = i402;
        int i404 = i398 + 6;
        e5 = i404;
        Oc = i403;
        int i405 = i398 + 7;
        e5 = i405;
        Pc = i404;
        int i406 = i398 + 8;
        e5 = i406;
        Qc = i405;
        int i407 = i398 + 9;
        e5 = i407;
        Rc = i406;
        Sc = i407;
        int i408 = i398 + 10;
        e5 = i408;
        Tc = i407;
        int i409 = i398 + 11;
        e5 = i409;
        Uc = i408;
        int i410 = i398 + 12;
        e5 = i410;
        Vc = i409;
        int i411 = i398 + 13;
        e5 = i411;
        Wc = i410;
        int i412 = i398 + 14;
        e5 = i412;
        Xc = i411;
        int i413 = i398 + 15;
        e5 = i413;
        Yc = i412;
        int i414 = i398 + 16;
        e5 = i414;
        Zc = i413;
        int i415 = i398 + 17;
        e5 = i415;
        ad = i414;
        int i416 = i398 + 18;
        e5 = i416;
        bd = i415;
        int i417 = i398 + 19;
        e5 = i417;
        cd = i416;
        int i418 = i398 + 20;
        e5 = i418;
        dd = i417;
        int i419 = i398 + 21;
        e5 = i419;
        ed = i418;
        int i420 = i398 + 22;
        e5 = i420;
        fd = i419;
        int i421 = i398 + 23;
        e5 = i421;
        gd = i420;
        int i422 = i398 + 24;
        e5 = i422;
        hd = i421;
        int i423 = i398 + 25;
        e5 = i423;
        id = i422;
        int i424 = i398 + 26;
        e5 = i424;
        jd = i423;
        int i425 = i398 + 27;
        e5 = i425;
        kd = i424;
        int i426 = i398 + 28;
        e5 = i426;
        ld = i425;
        int i427 = i398 + 29;
        e5 = i427;
        md = i426;
        int i428 = i398 + 30;
        e5 = i428;
        nd = i427;
        int i429 = i398 + 31;
        e5 = i429;
        od = i428;
        int i430 = i398 + 32;
        e5 = i430;
        pd = i429;
        int i431 = i398 + 33;
        e5 = i431;
        qd = i430;
        int i432 = i398 + 34;
        e5 = i432;
        rd = i431;
        int i433 = i398 + 35;
        e5 = i433;
        sd = i432;
        int i434 = i398 + 36;
        e5 = i434;
        td = i433;
        int i435 = i398 + 37;
        e5 = i435;
        ud = i434;
        int i436 = i398 + 38;
        e5 = i436;
        vd = i435;
        int i437 = i398 + 39;
        e5 = i437;
        wd = i436;
        int i438 = i398 + 40;
        e5 = i438;
        xd = i437;
        int i439 = i398 + 41;
        e5 = i439;
        yd = i438;
        int i440 = i398 + 42;
        e5 = i440;
        zd = i439;
        int i441 = i398 + 43;
        e5 = i441;
        Ad = i440;
        int i442 = i398 + 44;
        e5 = i442;
        Bd = i441;
        int i443 = i398 + 45;
        e5 = i443;
        Cd = i442;
        e5 = i398 + 46;
        Dd = i443;
        int i444 = e5;
        int i445 = i444 + 1;
        e5 = i445;
        Ed = i444;
        int i446 = i444 + 2;
        e5 = i446;
        Fd = i445;
        int i447 = i444 + 3;
        e5 = i447;
        Gd = i446;
        int i448 = i444 + 4;
        e5 = i448;
        Hd = i447;
        int i449 = i444 + 5;
        e5 = i449;
        Id = i448;
        int i450 = i444 + 6;
        e5 = i450;
        Jd = i449;
        int i451 = i444 + 7;
        e5 = i451;
        Kd = i450;
        int i452 = i444 + 8;
        e5 = i452;
        Ld = i451;
        int i453 = i444 + 9;
        e5 = i453;
        Md = i452;
        int i454 = i444 + 10;
        e5 = i454;
        Nd = i453;
        int i455 = i444 + 11;
        e5 = i455;
        Od = i454;
        int i456 = i444 + 12;
        e5 = i456;
        Pd = i455;
        int i457 = i444 + 13;
        e5 = i457;
        Qd = i456;
        int i458 = i444 + 14;
        e5 = i458;
        Rd = i457;
        int i459 = i444 + 15;
        e5 = i459;
        Sd = i458;
        int i460 = i444 + 16;
        e5 = i460;
        Td = i459;
        int i461 = i444 + 17;
        e5 = i461;
        Ud = i460;
        int i462 = i444 + 18;
        e5 = i462;
        Vd = i461;
        int i463 = i444 + 19;
        e5 = i463;
        Wd = i462;
        int i464 = i444 + 20;
        e5 = i464;
        Xd = i463;
        int i465 = i444 + 21;
        e5 = i465;
        Yd = i464;
        int i466 = i444 + 22;
        e5 = i466;
        Zd = i465;
        int i467 = i444 + 23;
        e5 = i467;
        ae = i466;
        int i468 = i444 + 24;
        e5 = i468;
        be = i467;
        int i469 = i444 + 25;
        e5 = i469;
        ce = i468;
        int i470 = i444 + 26;
        e5 = i470;
        de = i469;
        int i471 = i444 + 27;
        e5 = i471;
        ee = i470;
        int i472 = i444 + 28;
        e5 = i472;
        fe = i471;
        int i473 = i444 + 29;
        e5 = i473;
        ge = i472;
        int i474 = i444 + 30;
        e5 = i474;
        he = i473;
        int i475 = i444 + 31;
        e5 = i475;
        ie = i474;
        int i476 = i444 + 32;
        e5 = i476;
        je = i475;
        int i477 = i444 + 33;
        e5 = i477;
        ke = i476;
        int i478 = i444 + 34;
        e5 = i478;
        le = i477;
        int i479 = i444 + 35;
        e5 = i479;
        me = i478;
        int i480 = i444 + 36;
        e5 = i480;
        ne = i479;
        int i481 = i444 + 37;
        e5 = i481;
        oe = i480;
        int i482 = i444 + 38;
        e5 = i482;
        pe = i481;
        int i483 = i444 + 39;
        e5 = i483;
        qe = i482;
        int i484 = i444 + 40;
        e5 = i484;
        re = i483;
        int i485 = i444 + 41;
        e5 = i485;
        se = i484;
        int i486 = i444 + 42;
        e5 = i486;
        te = i485;
        int i487 = i444 + 43;
        e5 = i487;
        ue = i486;
        int i488 = i444 + 44;
        e5 = i488;
        ve = i487;
        int i489 = i444 + 45;
        e5 = i489;
        we = i488;
        int i490 = i444 + 46;
        e5 = i490;
        xe = i489;
        int i491 = i444 + 47;
        e5 = i491;
        ye = i490;
        int i492 = i444 + 48;
        e5 = i492;
        ze = i491;
        e5 = i444 + 49;
        Ae = i492;
        int i493 = e5;
        int i494 = i493 + 1;
        e5 = i494;
        Be = i493;
        int i495 = i493 + 2;
        e5 = i495;
        Ce = i494;
        int i496 = i493 + 3;
        e5 = i496;
        De = i495;
        int i497 = i493 + 4;
        e5 = i497;
        Ee = i496;
        int i498 = i493 + 5;
        e5 = i498;
        Fe = i497;
        int i499 = i493 + 6;
        e5 = i499;
        Ge = i498;
        int i500 = i493 + 7;
        e5 = i500;
        He = i499;
        int i501 = i493 + 8;
        e5 = i501;
        Ie = i500;
        int i502 = i493 + 9;
        e5 = i502;
        Je = i501;
        int i503 = i493 + 10;
        e5 = i503;
        Ke = i502;
        int i504 = i493 + 11;
        e5 = i504;
        Le = i503;
        int i505 = i493 + 12;
        e5 = i505;
        Me = i504;
        int i506 = i493 + 13;
        e5 = i506;
        Ne = i505;
        int i507 = i493 + 14;
        e5 = i507;
        Oe = i506;
        int i508 = i493 + 15;
        e5 = i508;
        Pe = i507;
        int i509 = i493 + 16;
        e5 = i509;
        Qe = i508;
        int i510 = i493 + 17;
        e5 = i510;
        Re = i509;
        int i511 = i493 + 18;
        e5 = i511;
        Se = i510;
        int i512 = i493 + 19;
        e5 = i512;
        Te = i511;
        int i513 = i493 + 20;
        e5 = i513;
        Ue = i512;
        int i514 = i493 + 21;
        e5 = i514;
        Ve = i513;
        int i515 = i493 + 22;
        e5 = i515;
        We = i514;
        int i516 = i493 + 23;
        e5 = i516;
        Xe = i515;
        int i517 = i493 + 24;
        e5 = i517;
        Ye = i516;
        int i518 = i493 + 25;
        e5 = i518;
        Ze = i517;
        int i519 = i493 + 26;
        e5 = i519;
        af = i518;
        int i520 = i493 + 27;
        e5 = i520;
        bf = i519;
        int i521 = i493 + 28;
        e5 = i521;
        cf = i520;
        int i522 = i493 + 29;
        e5 = i522;
        df = i521;
        int i523 = i493 + 30;
        e5 = i523;
        ef = i522;
        int i524 = i493 + 31;
        e5 = i524;
        ff = i523;
        int i525 = i493 + 32;
        e5 = i525;
        gf = i524;
        int i526 = i493 + 33;
        e5 = i526;
        hf = i525;
        int i527 = i493 + 34;
        e5 = i527;
        jf = i526;
        int i528 = i493 + 35;
        e5 = i528;
        kf = i527;
        int i529 = i493 + 36;
        e5 = i529;
        lf = i528;
        int i530 = i493 + 37;
        e5 = i530;
        mf = i529;
        int i531 = i493 + 38;
        e5 = i531;
        nf = i530;
        int i532 = i493 + 39;
        e5 = i532;
        of = i531;
        int i533 = i493 + 40;
        e5 = i533;
        pf = i532;
        int i534 = i493 + 41;
        e5 = i534;
        qf = i533;
        int i535 = i493 + 42;
        e5 = i535;
        rf = i534;
        int i536 = i493 + 43;
        e5 = i536;
        sf = i535;
        int i537 = i493 + 44;
        e5 = i537;
        tf = i536;
        int i538 = i493 + 45;
        e5 = i538;
        uf = i537;
        int i539 = i493 + 46;
        e5 = i539;
        vf = i538;
        int i540 = i493 + 47;
        e5 = i540;
        wf = i539;
        int i541 = i493 + 48;
        e5 = i541;
        xf = i540;
        e5 = i493 + 49;
        yf = i541;
        int i542 = e5;
        int i543 = i542 + 1;
        e5 = i543;
        zf = i542;
        int i544 = i542 + 2;
        e5 = i544;
        Af = i543;
        int i545 = i542 + 3;
        e5 = i545;
        Bf = i544;
        int i546 = i542 + 4;
        e5 = i546;
        Cf = i545;
        int i547 = i542 + 5;
        e5 = i547;
        Df = i546;
        int i548 = i542 + 6;
        e5 = i548;
        Ef = i547;
        int i549 = i542 + 7;
        e5 = i549;
        Ff = i548;
        int i550 = i542 + 8;
        e5 = i550;
        Gf = i549;
        int i551 = i542 + 9;
        e5 = i551;
        Hf = i550;
        int i552 = i542 + 10;
        e5 = i552;
        If = i551;
        int i553 = i542 + 11;
        e5 = i553;
        Jf = i552;
        int i554 = i542 + 12;
        e5 = i554;
        Kf = i553;
        int i555 = i542 + 13;
        e5 = i555;
        Lf = i554;
        int i556 = i542 + 14;
        e5 = i556;
        Mf = i555;
        int i557 = i542 + 15;
        e5 = i557;
        Nf = i556;
        int i558 = i542 + 16;
        e5 = i558;
        Of = i557;
        int i559 = i542 + 17;
        e5 = i559;
        Pf = i558;
        int i560 = i542 + 18;
        e5 = i560;
        Qf = i559;
        int i561 = i542 + 19;
        e5 = i561;
        Rf = i560;
        int i562 = i542 + 20;
        e5 = i562;
        Sf = i561;
        int i563 = i542 + 21;
        e5 = i563;
        Tf = i562;
        int i564 = i542 + 22;
        e5 = i564;
        Uf = i563;
        int i565 = i542 + 23;
        e5 = i565;
        Vf = i564;
        int i566 = i542 + 24;
        e5 = i566;
        Wf = i565;
        int i567 = i542 + 25;
        e5 = i567;
        Xf = i566;
        int i568 = i542 + 26;
        e5 = i568;
        Yf = i567;
        int i569 = i542 + 27;
        e5 = i569;
        Zf = i568;
        int i570 = i542 + 28;
        e5 = i570;
        ag = i569;
        int i571 = i542 + 29;
        e5 = i571;
        bg = i570;
        int i572 = i542 + 30;
        e5 = i572;
        cg = i571;
        int i573 = i542 + 31;
        e5 = i573;
        dg = i572;
        int i574 = i542 + 32;
        e5 = i574;
        eg = i573;
        int i575 = i542 + 33;
        e5 = i575;
        fg = i574;
        int i576 = i542 + 34;
        e5 = i576;
        gg = i575;
        int i577 = i542 + 35;
        e5 = i577;
        hg = i576;
        int i578 = i542 + 36;
        e5 = i578;
        ig = i577;
        int i579 = i542 + 37;
        e5 = i579;
        jg = i578;
        int i580 = i542 + 38;
        e5 = i580;
        kg = i579;
        int i581 = i542 + 39;
        e5 = i581;
        lg = i580;
        int i582 = i542 + 40;
        e5 = i582;
        mg = i581;
        int i583 = i542 + 41;
        e5 = i583;
        ng = i582;
        int i584 = i542 + 42;
        e5 = i584;
        og = i583;
        int i585 = i542 + 43;
        e5 = i585;
        pg = i584;
        int i586 = i542 + 44;
        e5 = i586;
        qg = i585;
        int i587 = i542 + 45;
        e5 = i587;
        rg = i586;
        int i588 = i542 + 46;
        e5 = i588;
        sg = i587;
        int i589 = i542 + 47;
        e5 = i589;
        tg = i588;
        int i590 = i542 + 48;
        e5 = i590;
        ug = i589;
        e5 = i542 + 49;
        vg = i590;
        int i591 = e5;
        int i592 = i591 + 1;
        e5 = i592;
        wg = i591;
        int i593 = i591 + 2;
        e5 = i593;
        xg = i592;
        int i594 = i591 + 3;
        e5 = i594;
        yg = i593;
        int i595 = i591 + 4;
        e5 = i595;
        zg = i594;
        int i596 = i591 + 5;
        e5 = i596;
        Ag = i595;
        int i597 = i591 + 6;
        e5 = i597;
        Bg = i596;
        int i598 = i591 + 7;
        e5 = i598;
        Cg = i597;
        int i599 = i591 + 8;
        e5 = i599;
        Dg = i598;
        int i600 = i591 + 9;
        e5 = i600;
        Eg = i599;
        int i601 = i591 + 10;
        e5 = i601;
        Fg = i600;
        int i602 = i591 + 11;
        e5 = i602;
        Gg = i601;
        int i603 = i591 + 12;
        e5 = i603;
        Hg = i602;
        int i604 = i591 + 13;
        e5 = i604;
        Ig = i603;
        int i605 = i591 + 14;
        e5 = i605;
        Jg = i604;
        int i606 = i591 + 15;
        e5 = i606;
        Kg = i605;
        int i607 = i591 + 16;
        e5 = i607;
        Lg = i606;
        int i608 = i591 + 17;
        e5 = i608;
        Mg = i607;
        int i609 = i591 + 18;
        e5 = i609;
        Ng = i608;
        int i610 = i591 + 19;
        e5 = i610;
        Og = i609;
        int i611 = i591 + 20;
        e5 = i611;
        Pg = i610;
        int i612 = i591 + 21;
        e5 = i612;
        Qg = i611;
        int i613 = i591 + 22;
        e5 = i613;
        Rg = i612;
        int i614 = i591 + 23;
        e5 = i614;
        Sg = i613;
        int i615 = i591 + 24;
        e5 = i615;
        Tg = i614;
        int i616 = i591 + 25;
        e5 = i616;
        Ug = i615;
        int i617 = i591 + 26;
        e5 = i617;
        Vg = i616;
        int i618 = i591 + 27;
        e5 = i618;
        Wg = i617;
        int i619 = i591 + 28;
        e5 = i619;
        Xg = i618;
        int i620 = i591 + 29;
        e5 = i620;
        Yg = i619;
        int i621 = i591 + 30;
        e5 = i621;
        Zg = i620;
        int i622 = i591 + 31;
        e5 = i622;
        ah = i621;
        int i623 = i591 + 32;
        e5 = i623;
        bh = i622;
        int i624 = i591 + 33;
        e5 = i624;
        ch = i623;
        int i625 = i591 + 34;
        e5 = i625;
        dh = i624;
        int i626 = i591 + 35;
        e5 = i626;
        eh = i625;
        int i627 = i591 + 36;
        e5 = i627;
        fh = i626;
        int i628 = i591 + 37;
        e5 = i628;
        gh = i627;
        int i629 = i591 + 38;
        e5 = i629;
        hh = i628;
        int i630 = i591 + 39;
        e5 = i630;
        ih = i629;
        int i631 = i591 + 40;
        e5 = i631;
        jh = i630;
        int i632 = i591 + 41;
        e5 = i632;
        kh = i631;
        int i633 = i591 + 42;
        e5 = i633;
        lh = i632;
        int i634 = i591 + 43;
        e5 = i634;
        mh = i633;
        int i635 = i591 + 44;
        e5 = i635;
        nh = i634;
        int i636 = i591 + 45;
        e5 = i636;
        oh = i635;
        int i637 = i591 + 46;
        e5 = i637;
        ph = i636;
        int i638 = i591 + 47;
        e5 = i638;
        qh = i637;
        int i639 = i591 + 48;
        e5 = i639;
        rh = i638;
        e5 = i591 + 49;
        sh = i639;
        int i640 = e5;
        int i641 = i640 + 1;
        e5 = i641;
        th = i640;
        int i642 = i640 + 2;
        e5 = i642;
        uh = i641;
        int i643 = i640 + 3;
        e5 = i643;
        vh = i642;
        int i644 = i640 + 4;
        e5 = i644;
        wh = i643;
        int i645 = i640 + 5;
        e5 = i645;
        xh = i644;
        int i646 = i640 + 6;
        e5 = i646;
        yh = i645;
        int i647 = i640 + 7;
        e5 = i647;
        zh = i646;
        int i648 = i640 + 8;
        e5 = i648;
        Ah = i647;
        int i649 = i640 + 9;
        e5 = i649;
        Bh = i648;
        int i650 = i640 + 10;
        e5 = i650;
        Ch = i649;
        int i651 = i640 + 11;
        e5 = i651;
        Dh = i650;
        int i652 = i640 + 12;
        e5 = i652;
        Eh = i651;
        int i653 = i640 + 13;
        e5 = i653;
        Fh = i652;
        int i654 = i640 + 14;
        e5 = i654;
        Gh = i653;
        int i655 = i640 + 15;
        e5 = i655;
        Hh = i654;
        int i656 = i640 + 16;
        e5 = i656;
        Ih = i655;
        int i657 = i640 + 17;
        e5 = i657;
        Jh = i656;
        int i658 = i640 + 18;
        e5 = i658;
        Kh = i657;
        int i659 = i640 + 19;
        e5 = i659;
        Lh = i658;
        int i660 = i640 + 20;
        e5 = i660;
        Mh = i659;
        int i661 = i640 + 21;
        e5 = i661;
        Nh = i660;
        int i662 = i640 + 22;
        e5 = i662;
        Oh = i661;
        int i663 = i640 + 23;
        e5 = i663;
        Ph = i662;
        int i664 = i640 + 24;
        e5 = i664;
        Qh = i663;
        int i665 = i640 + 25;
        e5 = i665;
        Rh = i664;
        int i666 = i640 + 26;
        e5 = i666;
        Sh = i665;
        int i667 = i640 + 27;
        e5 = i667;
        Th = i666;
        int i668 = i640 + 28;
        e5 = i668;
        Uh = i667;
        int i669 = i640 + 29;
        e5 = i669;
        Vh = i668;
        int i670 = i640 + 30;
        e5 = i670;
        Wh = i669;
        int i671 = i640 + 31;
        e5 = i671;
        Xh = i670;
        int i672 = i640 + 32;
        e5 = i672;
        Yh = i671;
        int i673 = i640 + 33;
        e5 = i673;
        Zh = i672;
        int i674 = i640 + 34;
        e5 = i674;
        ai = i673;
        int i675 = i640 + 35;
        e5 = i675;
        bi = i674;
        int i676 = i640 + 36;
        e5 = i676;
        ci = i675;
        int i677 = i640 + 37;
        e5 = i677;
        di = i676;
        int i678 = i640 + 38;
        e5 = i678;
        ei = i677;
        int i679 = i640 + 39;
        e5 = i679;
        fi = i678;
        int i680 = i640 + 40;
        e5 = i680;
        gi = i679;
        int i681 = i640 + 41;
        e5 = i681;
        hi = i680;
        int i682 = i640 + 42;
        e5 = i682;
        ii = i681;
        int i683 = i640 + 43;
        e5 = i683;
        ji = i682;
        int i684 = i640 + 44;
        e5 = i684;
        ki = i683;
        int i685 = i640 + 45;
        e5 = i685;
        li = i684;
        int i686 = i640 + 46;
        e5 = i686;
        mi = i685;
        int i687 = i640 + 47;
        e5 = i687;
        ni = i686;
        int i688 = i640 + 48;
        e5 = i688;
        oi = i687;
        e5 = i640 + 49;
        pi = i688;
        int i689 = e5;
        int i690 = i689 + 1;
        e5 = i690;
        qi = i689;
        int i691 = i689 + 2;
        e5 = i691;
        ri = i690;
        int i692 = i689 + 3;
        e5 = i692;
        si = i691;
        int i693 = i689 + 4;
        e5 = i693;
        ti = i692;
        int i694 = i689 + 5;
        e5 = i694;
        ui = i693;
        int i695 = i689 + 6;
        e5 = i695;
        vi = i694;
        int i696 = i689 + 7;
        e5 = i696;
        wi = i695;
        int i697 = i689 + 8;
        e5 = i697;
        xi = i696;
        int i698 = i689 + 9;
        e5 = i698;
        yi = i697;
        int i699 = i689 + 10;
        e5 = i699;
        zi = i698;
        int i700 = i689 + 11;
        e5 = i700;
        Ai = i699;
        int i701 = i689 + 12;
        e5 = i701;
        Bi = i700;
        int i702 = i689 + 13;
        e5 = i702;
        Ci = i701;
        int i703 = i689 + 14;
        e5 = i703;
        Di = i702;
        int i704 = i689 + 15;
        e5 = i704;
        Ei = i703;
        int i705 = i689 + 16;
        e5 = i705;
        Fi = i704;
        int i706 = i689 + 17;
        e5 = i706;
        Gi = i705;
        int i707 = i689 + 18;
        e5 = i707;
        Hi = i706;
        int i708 = i689 + 19;
        e5 = i708;
        Ii = i707;
        int i709 = i689 + 20;
        e5 = i709;
        Ji = i708;
        int i710 = i689 + 21;
        e5 = i710;
        Ki = i709;
        int i711 = i689 + 22;
        e5 = i711;
        Li = i710;
        int i712 = i689 + 23;
        e5 = i712;
        Mi = i711;
        int i713 = i689 + 24;
        e5 = i713;
        Ni = i712;
        int i714 = i689 + 25;
        e5 = i714;
        Oi = i713;
        int i715 = i689 + 26;
        e5 = i715;
        Pi = i714;
        int i716 = i689 + 27;
        e5 = i716;
        Qi = i715;
        int i717 = i689 + 28;
        e5 = i717;
        Ri = i716;
        int i718 = i689 + 29;
        e5 = i718;
        Si = i717;
        int i719 = i689 + 30;
        e5 = i719;
        Ti = i718;
        int i720 = i689 + 31;
        e5 = i720;
        Ui = i719;
        int i721 = i689 + 32;
        e5 = i721;
        Vi = i720;
        int i722 = i689 + 33;
        e5 = i722;
        Wi = i721;
        int i723 = i689 + 34;
        e5 = i723;
        Xi = i722;
        int i724 = i689 + 35;
        e5 = i724;
        Yi = i723;
        int i725 = i689 + 36;
        e5 = i725;
        Zi = i724;
        int i726 = i689 + 37;
        e5 = i726;
        aj = i725;
        int i727 = i689 + 38;
        e5 = i727;
        bj = i726;
        int i728 = i689 + 39;
        e5 = i728;
        cj = i727;
        int i729 = i689 + 40;
        e5 = i729;
        dj = i728;
        int i730 = i689 + 41;
        e5 = i730;
        ej = i729;
        int i731 = i689 + 42;
        e5 = i731;
        fj = i730;
        int i732 = i689 + 43;
        e5 = i732;
        gj = i731;
        int i733 = i689 + 44;
        e5 = i733;
        hj = i732;
        int i734 = i689 + 45;
        e5 = i734;
        ij = i733;
        int i735 = i689 + 46;
        e5 = i735;
        jj = i734;
        int i736 = i689 + 47;
        e5 = i736;
        kj = i735;
        int i737 = i689 + 48;
        e5 = i737;
        lj = i736;
        e5 = i689 + 49;
        mj = i737;
        int i738 = e5;
        int i739 = i738 + 1;
        e5 = i739;
        nj = i738;
        int i740 = i738 + 2;
        e5 = i740;
        oj = i739;
        int i741 = i738 + 3;
        e5 = i741;
        pj = i740;
        int i742 = i738 + 4;
        e5 = i742;
        qj = i741;
        int i743 = i738 + 5;
        e5 = i743;
        rj = i742;
        int i744 = i738 + 6;
        e5 = i744;
        sj = i743;
        int i745 = i738 + 7;
        e5 = i745;
        tj = i744;
        int i746 = i738 + 8;
        e5 = i746;
        uj = i745;
        int i747 = i738 + 9;
        e5 = i747;
        vj = i746;
        int i748 = i738 + 10;
        e5 = i748;
        wj = i747;
        int i749 = i738 + 11;
        e5 = i749;
        xj = i748;
        int i750 = i738 + 12;
        e5 = i750;
        yj = i749;
        int i751 = i738 + 13;
        e5 = i751;
        zj = i750;
        int i752 = i738 + 14;
        e5 = i752;
        Aj = i751;
        int i753 = i738 + 15;
        e5 = i753;
        Bj = i752;
        int i754 = i738 + 16;
        e5 = i754;
        Cj = i753;
        int i755 = i738 + 17;
        e5 = i755;
        Dj = i754;
        int i756 = i738 + 18;
        e5 = i756;
        Ej = i755;
        int i757 = i738 + 19;
        e5 = i757;
        Fj = i756;
        int i758 = i738 + 20;
        e5 = i758;
        Gj = i757;
        int i759 = i738 + 21;
        e5 = i759;
        Hj = i758;
        int i760 = i738 + 22;
        e5 = i760;
        Ij = i759;
        int i761 = i738 + 23;
        e5 = i761;
        Jj = i760;
        int i762 = i738 + 24;
        e5 = i762;
        Kj = i761;
        int i763 = i738 + 25;
        e5 = i763;
        Lj = i762;
        int i764 = i738 + 26;
        e5 = i764;
        Mj = i763;
        int i765 = i738 + 27;
        e5 = i765;
        Nj = i764;
        int i766 = i738 + 28;
        e5 = i766;
        Oj = i765;
        int i767 = i738 + 29;
        e5 = i767;
        Pj = i766;
        int i768 = i738 + 30;
        e5 = i768;
        Qj = i767;
        int i769 = i738 + 31;
        e5 = i769;
        Rj = i768;
        int i770 = i738 + 32;
        e5 = i770;
        Sj = i769;
        int i771 = i738 + 33;
        e5 = i771;
        Tj = i770;
        int i772 = i738 + 34;
        e5 = i772;
        Uj = i771;
        int i773 = i738 + 35;
        e5 = i773;
        Vj = i772;
        int i774 = i738 + 36;
        e5 = i774;
        Wj = i773;
        int i775 = i738 + 37;
        e5 = i775;
        Xj = i774;
        int i776 = i738 + 38;
        e5 = i776;
        Yj = i775;
        int i777 = i738 + 39;
        e5 = i777;
        Zj = i776;
        int i778 = i738 + 40;
        e5 = i778;
        ak = i777;
        int i779 = i738 + 41;
        e5 = i779;
        bk = i778;
        int i780 = i738 + 42;
        e5 = i780;
        ck = i779;
        int i781 = i738 + 43;
        e5 = i781;
        dk = i780;
        int i782 = i738 + 44;
        e5 = i782;
        ek = i781;
        int i783 = i738 + 45;
        e5 = i783;
        fk = i782;
        int i784 = i738 + 46;
        e5 = i784;
        gk = i783;
        int i785 = i738 + 47;
        e5 = i785;
        hk = i784;
        int i786 = i738 + 48;
        e5 = i786;
        ik = i785;
        e5 = i738 + 49;
        jk = i786;
        int i787 = e5;
        int i788 = i787 + 1;
        e5 = i788;
        kk = i787;
        int i789 = i787 + 2;
        e5 = i789;
        lk = i788;
        int i790 = i787 + 3;
        e5 = i790;
        mk = i789;
        int i791 = i787 + 4;
        e5 = i791;
        nk = i790;
        int i792 = i787 + 5;
        e5 = i792;
        ok = i791;
        int i793 = i787 + 6;
        e5 = i793;
        pk = i792;
        int i794 = i787 + 7;
        e5 = i794;
        qk = i793;
        rk = new int[]{i785, i786, i787, i788, i789, i790, i791, i792, i793};
        int i795 = i787 + 8;
        e5 = i795;
        sk = i794;
        int i796 = i787 + 9;
        e5 = i796;
        tk = i795;
        int i797 = i787 + 10;
        e5 = i797;
        uk = i796;
        int i798 = i787 + 11;
        e5 = i798;
        vk = i797;
        int i799 = i787 + 12;
        e5 = i799;
        wk = i798;
        int i800 = i787 + 13;
        e5 = i800;
        xk = i799;
        int i801 = i787 + 14;
        e5 = i801;
        yk = i800;
        int i802 = i787 + 15;
        e5 = i802;
        zk = i801;
        int i803 = i787 + 16;
        e5 = i803;
        Ak = i802;
        int i804 = i787 + 17;
        e5 = i804;
        Bk = i803;
        int i805 = i787 + 18;
        e5 = i805;
        Ck = i804;
        int i806 = i787 + 19;
        e5 = i806;
        Dk = i805;
        int i807 = i787 + 20;
        e5 = i807;
        Ek = i806;
        int i808 = i787 + 21;
        e5 = i808;
        Fk = i807;
        int i809 = i787 + 22;
        e5 = i809;
        Gk = i808;
        int i810 = i787 + 23;
        e5 = i810;
        Hk = i809;
        int i811 = i787 + 24;
        e5 = i811;
        Ik = i810;
        int i812 = i787 + 25;
        e5 = i812;
        Jk = i811;
        int i813 = i787 + 26;
        e5 = i813;
        Kk = i812;
        int i814 = i787 + 27;
        e5 = i814;
        Lk = i813;
        int i815 = i787 + 28;
        e5 = i815;
        Mk = i814;
        int i816 = i787 + 29;
        e5 = i816;
        Nk = i815;
        int i817 = i787 + 30;
        e5 = i817;
        Ok = i816;
        int i818 = i787 + 31;
        e5 = i818;
        Pk = i817;
        int i819 = i787 + 32;
        e5 = i819;
        Qk = i818;
        int i820 = i787 + 33;
        e5 = i820;
        Rk = i819;
        int i821 = i787 + 34;
        e5 = i821;
        Sk = i820;
        int i822 = i787 + 35;
        e5 = i822;
        Tk = i821;
        int i823 = i787 + 36;
        e5 = i823;
        Uk = i822;
        int i824 = i787 + 37;
        e5 = i824;
        Vk = i823;
        int i825 = i787 + 38;
        e5 = i825;
        Wk = i824;
        int i826 = i787 + 39;
        e5 = i826;
        Xk = i825;
        int i827 = i787 + 40;
        e5 = i827;
        Yk = i826;
        int i828 = i787 + 41;
        e5 = i828;
        Zk = i827;
        int i829 = i787 + 42;
        e5 = i829;
        al = i828;
        int i830 = i787 + 43;
        e5 = i830;
        bl = i829;
        int i831 = i787 + 44;
        e5 = i831;
        cl = i830;
        int i832 = i787 + 45;
        e5 = i832;
        dl = i831;
        int i833 = i787 + 46;
        e5 = i833;
        el = i832;
        int i834 = i787 + 47;
        e5 = i834;
        fl = i833;
        e5 = i787 + 48;
        gl = i834;
        int i835 = e5;
        int i836 = i835 + 1;
        e5 = i836;
        hl = i835;
        int i837 = i835 + 2;
        e5 = i837;
        il = i836;
        int i838 = i835 + 3;
        e5 = i838;
        jl = i837;
        int i839 = i835 + 4;
        e5 = i839;
        kl = i838;
        int i840 = i835 + 5;
        e5 = i840;
        ll = i839;
        int i841 = i835 + 6;
        e5 = i841;
        ml = i840;
        int i842 = i835 + 7;
        e5 = i842;
        nl = i841;
        int i843 = i835 + 8;
        e5 = i843;
        ol = i842;
        int i844 = i835 + 9;
        e5 = i844;
        pl = i843;
        int i845 = i835 + 10;
        e5 = i845;
        ql = i844;
        int i846 = i835 + 11;
        e5 = i846;
        rl = i845;
        int i847 = i835 + 12;
        e5 = i847;
        sl = i846;
        int i848 = i835 + 13;
        e5 = i848;
        tl = i847;
        int i849 = i835 + 14;
        e5 = i849;
        ul = i848;
        int i850 = i835 + 15;
        e5 = i850;
        vl = i849;
        int i851 = i835 + 16;
        e5 = i851;
        wl = i850;
        xl = new int[]{i840};
        int i852 = i835 + 17;
        e5 = i852;
        yl = i851;
        int i853 = i835 + 18;
        e5 = i853;
        zl = i852;
        int i854 = i835 + 19;
        e5 = i854;
        Al = i853;
        int i855 = i835 + 20;
        e5 = i855;
        Bl = i854;
        int i856 = i835 + 21;
        e5 = i856;
        Cl = i855;
        int i857 = i835 + 22;
        e5 = i857;
        Dl = i856;
        int i858 = i835 + 23;
        e5 = i858;
        El = i857;
        int i859 = i835 + 24;
        e5 = i859;
        Fl = i858;
        int i860 = i835 + 25;
        e5 = i860;
        Gl = i859;
        int i861 = i835 + 26;
        e5 = i861;
        Hl = i860;
        int i862 = i835 + 27;
        e5 = i862;
        Il = i861;
        int i863 = i835 + 28;
        e5 = i863;
        Jl = i862;
        int i864 = i835 + 29;
        e5 = i864;
        Kl = i863;
        int i865 = i835 + 30;
        e5 = i865;
        Ll = i864;
        int i866 = i835 + 31;
        e5 = i866;
        Ml = i865;
        int i867 = i835 + 32;
        e5 = i867;
        Nl = i866;
        int i868 = i835 + 33;
        e5 = i868;
        Ol = i867;
        int i869 = i835 + 34;
        e5 = i869;
        Pl = i868;
        int i870 = i835 + 35;
        e5 = i870;
        Ql = i869;
        int i871 = i835 + 36;
        e5 = i871;
        Rl = i870;
        int i872 = i835 + 37;
        e5 = i872;
        Sl = i871;
        int i873 = i835 + 38;
        e5 = i873;
        Tl = i872;
        int i874 = i835 + 39;
        e5 = i874;
        Ul = i873;
        int i875 = i835 + 40;
        e5 = i875;
        Vl = i874;
        int i876 = i835 + 41;
        e5 = i876;
        Wl = i875;
        int i877 = i835 + 42;
        e5 = i877;
        Xl = i876;
        int i878 = i835 + 43;
        e5 = i878;
        Yl = i877;
        int i879 = i835 + 44;
        e5 = i879;
        Zl = i878;
        int i880 = i835 + 45;
        e5 = i880;
        am = i879;
        e5 = i835 + 46;
        bm = i880;
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
        gm = nxe.b();
        int i881 = c6;
        sparseIntArray.put(i858, i881);
        int i882 = Z6;
        sparseIntArray.put(i859, i882);
        sparseIntArray.put(i861, i882);
        sparseIntArray.put(Aj, Si);
        sparseIntArray.put(Cj, p7);
        sparseIntArray.put(Za, sc);
        int i883 = Ei;
        sparseIntArray.put(i860, i883);
        sparseIntArray.put(Fi, i883);
        sparseIntArray.put(a6, i882);
        int i884 = b6;
        int i885 = y6;
        sparseIntArray.put(i884, i885);
        sparseIntArray.put(Id, Gi);
        int i886 = Jd;
        int i887 = Qb;
        sparseIntArray.put(i886, i887);
        sparseIntArray.put(Rb, i887);
        sparseIntArray.put(be, de);
        sparseIntArray.put(ce, ee);
        sparseIntArray.put(Kj, Jj);
        sparseIntArray.put(le, ke);
        sparseIntArray.put(nc, mc);
        sparseIntArray.put(zf, Gf);
        sparseIntArray.put(gj, dj);
        sparseIntArray.put(Mi, i883);
        sparseIntArray.put(e7, i885);
        sparseIntArray.put(kd, qa);
        sparseIntArray.put(ta, i881);
        sparseIntArray.put(Fb, qb);
        sparseIntArray.put(ld, Tc);
        sparseIntArray.put(Gb, rb);
        SparseIntArray sparseIntArray2 = hm;
        sparseIntArray2.put(L5, i882);
        sparseIntArray2.put(M5, H9);
        sparseIntArray2.put(Ti, N9);
        sparseIntArray2.put(Bi, i882);
        sparseIntArray2.put(na, ja);
        sparseIntArray2.put(S8, m6);
        int i888 = t6;
        int i889 = H6;
        sparseIntArray2.put(i888, i889);
        sparseIntArray2.put(u6, i889);
        sparseIntArray2.put(vj, gg);
        int i890 = wj;
        int i891 = fg;
        sparseIntArray2.put(i890, i891);
        sparseIntArray2.put(xj, i891);
        int i892 = d6;
        int i893 = c6;
        sparseIntArray2.put(i892, i893);
        sparseIntArray2.put(e6, i893);
        sparseIntArray2.put(N6, L6);
        sparseIntArray2.put(O6, M6);
        sparseIntArray2.put(P6, i893);
        sparseIntArray2.put(Q6, i893);
        sparseIntArray2.put(f6, i893);
        sparseIntArray2.put(G7, A7);
        sparseIntArray2.put(H7, B7);
        int i894 = R6;
        int i895 = h6;
        sparseIntArray2.put(i894, i895);
        sparseIntArray2.put(S6, i895);
        sparseIntArray2.put(i6, i895);
        int i896 = Ef;
        int i897 = Df;
        sparseIntArray2.put(i896, i897);
        sparseIntArray2.put(Af, i897);
        sparseIntArray2.put(Lf, p6);
        sparseIntArray2.put(Hf, Ff);
        int i898 = yj;
        int i899 = Gf;
        sparseIntArray2.put(i898, i899);
        sparseIntArray2.put(zj, Gj);
        sparseIntArray2.put(N5, i899);
        sparseIntArray2.put(O5, i897);
        SparseIntArray sparseIntArray3 = hm;
        sparseIntArray3.put(P5, i897);
        int i900 = Q5;
        int i901 = F6;
        sparseIntArray3.put(i900, i901);
        sparseIntArray3.put(nb, nf);
        sparseIntArray3.put(ob, i901);
        int i902 = R5;
        int i903 = A5;
        sparseIntArray3.put(i902, i903);
        sparseIntArray3.put(S5, i903);
        sparseIntArray3.put(T5, B5);
        sparseIntArray3.put(U5, Bf);
        sparseIntArray3.put(L8, r8);
        int i904 = M8;
        int i905 = s8;
        sparseIntArray3.put(i904, i905);
        sparseIntArray3.put(N8, u8);
        sparseIntArray3.put(O8, i901);
        sparseIntArray3.put(P8, B8);
        sparseIntArray3.put(Q8, C8);
        int i906 = h9;
        int i907 = f9;
        sparseIntArray3.put(i906, i907);
        int i908 = l9;
        int i909 = j9;
        sparseIntArray3.put(i908, i909);
        sparseIntArray3.put(X8, W8);
        sparseIntArray3.put(k9, i909);
        sparseIntArray3.put(m9, i909);
        sparseIntArray3.put(g9, i907);
        int i910 = L7;
        int i911 = U8;
        sparseIntArray3.put(i910, i911);
        int i912 = b9;
        int i913 = O9;
        sparseIntArray3.put(i912, i913);
        sparseIntArray3.put(c9, i911);
        int i914 = d9;
        int i915 = N9;
        sparseIntArray3.put(i914, i915);
        sparseIntArray3.put(e9, i915);
        sparseIntArray3.put(E8, I5);
        sparseIntArray3.put(i7, i911);
        int i916 = oa;
        int i917 = A8;
        sparseIntArray3.put(i916, i917);
        int i918 = pa;
        int i919 = tj;
        sparseIntArray3.put(i918, i919);
        sparseIntArray3.put(yb, i919);
        SparseIntArray sparseIntArray4 = hm;
        int i920 = H8;
        int i921 = z8;
        sparseIntArray4.put(i920, i921);
        sparseIntArray4.put(I8, i917);
        sparseIntArray4.put(J8, i921);
        sparseIntArray4.put(K8, i905);
        sparseIntArray4.put(ri, g8);
        sparseIntArray4.put(L9, d8);
        sparseIntArray4.put(Cc, Be);
        sparseIntArray4.put(G8, Z6);
        int i922 = Z9;
        int i923 = i5;
        sparseIntArray4.put(i922, i923);
        sparseIntArray4.put(aa, vd);
        sparseIntArray4.put(ba, i923);
        sparseIntArray4.put(ca, b7);
        sparseIntArray4.put(R8, r8);
        sparseIntArray4.put(u9, t9);
        sparseIntArray4.put(Bb, zb);
        sparseIntArray4.put(Cb, Ab);
        sparseIntArray4.put(Q9, i911);
        sparseIntArray4.put(R9, i913);
        sparseIntArray4.put(M7, J7);
        sparseIntArray4.put(Hi, Gi);
        int i924 = V5;
        int i925 = Ij;
        sparseIntArray4.put(i924, i925);
        sparseIntArray4.put(W5, i925);
        sparseIntArray4.put(kj, i923);
        int i926 = lj;
        int i927 = s6;
        sparseIntArray4.put(i926, i927);
        sparseIntArray4.put(mj, g5);
        sparseIntArray4.put(nj, h5);
        sparseIntArray4.put(ej, i927);
        sparseIntArray4.put(hj, v6);
        int i928 = Lc;
        int i929 = Ce;
        sparseIntArray4.put(i928, i929);
        SparseIntArray sparseIntArray5 = hm;
        sparseIntArray5.put(kg, i929);
        int i930 = lg;
        sparseIntArray5.put(i930, Me);
        sparseIntArray5.put(Mc, i930);
        int i931 = da;
        int i932 = ma;
        sparseIntArray5.put(i931, i932);
        sparseIntArray5.put(ea, i932);
        int i933 = fa;
        int i934 = ja;
        sparseIntArray5.put(i933, i934);
        sparseIntArray5.put(ga, i934);
        sparseIntArray5.put(pg, R5);
        sparseIntArray5.put(V9, A5);
        sparseIntArray5.put(n7, l6);
        sparseIntArray5.put(ui, x6);
        int i935 = vi;
        int i936 = K6;
        sparseIntArray5.put(i935, i936);
        sparseIntArray5.put(wi, i936);
        sparseIntArray5.put(xi, h6);
        sparseIntArray5.put(la, ka);
        int i937 = Fd;
        int i938 = k8;
        sparseIntArray5.put(i937, i938);
        sparseIntArray5.put(Pc, i938);
        sparseIntArray5.put(ec, ic);
        sparseIntArray5.put(fc, dc);
        int i939 = y7;
        int i940 = c6;
        sparseIntArray5.put(i939, i940);
        int i941 = X5;
        int i942 = N7;
        sparseIntArray5.put(i941, i942);
        sparseIntArray5.put(sk, Ye);
        sparseIntArray5.put(Ic, Dc);
        sparseIntArray5.put(xk, qb);
        sparseIntArray5.put(yk, Vc);
        int i943 = uk;
        sparseIntArray5.put(i943, Ad);
        sparseIntArray5.put(tk, Nb);
        sparseIntArray5.put(vk, i940);
        SparseIntArray sparseIntArray6 = hm;
        sparseIntArray6.put(wk, i940);
        sparseIntArray6.put(Y5, Zh);
        sparseIntArray6.put(Tk, T8);
        sparseIntArray6.put(Uk, f9);
        sparseIntArray6.put(K7, J7);
        sparseIntArray6.put(U7, i942);
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
        int i944 = fk;
        int i945 = pk;
        sparseIntArray6.put(i944, i945);
        sparseIntArray6.put(ek, i945);
        sparseIntArray6.put(gk, qk);
        int i946 = kb;
        int i947 = Z6;
        sparseIntArray6.put(i946, i947);
        sparseIntArray6.put(lb, i943);
        int i948 = fi;
        sparseIntArray6.put(i948, d7);
        int i949 = gi;
        int i950 = c7;
        sparseIntArray6.put(i949, i950);
        sparseIntArray6.put(hl, i948);
        int i951 = il;
        int i952 = gl;
        sparseIntArray6.put(i951, i952);
        SparseIntArray sparseIntArray7 = hm;
        sparseIntArray7.put(jl, i949);
        sparseIntArray7.put(kl, i949);
        sparseIntArray7.put(ol, i952);
        int i953 = Ll;
        int i954 = F6;
        sparseIntArray7.put(i953, i954);
        sparseIntArray7.put(Kl, i947);
        sparseIntArray7.put(Jl, i954);
        sparseIntArray7.put(Ml, Ne);
        sparseIntArray7.put(Nl, Ke);
        int i955 = Ol;
        int i956 = g5;
        sparseIntArray7.put(i955, i956);
        sparseIntArray7.put(Pl, i956);
        int i957 = Ql;
        int i958 = Oe;
        sparseIntArray7.put(i957, i958);
        sparseIntArray7.put(Rl, i958);
        sparseIntArray7.put(Sl, i954);
        sparseIntArray7.put(z8, i954);
        sparseIntArray7.put(Wl, i954);
        sparseIntArray7.put(li, i954);
        sparseIntArray7.put(Xl, i958);
        int i959 = Yl;
        sparseIntArray7.put(i959, p6);
        sparseIntArray7.put(Zl, h5);
        sparseIntArray7.put(am, i950);
        sparseIntArray7.put(bm, kk);
        sparseIntArray7.put(sg, Uc);
        int i960 = tg;
        int i961 = Ei;
        sparseIntArray7.put(i960, i961);
        int i962 = ug;
        int i963 = Gi;
        sparseIntArray7.put(i962, i963);
        int i964 = vg;
        int i965 = Ii;
        sparseIntArray7.put(i964, i965);
        int i966 = yg;
        int i967 = h8;
        sparseIntArray7.put(i966, i967);
        int i968 = Bg;
        int i969 = k8;
        sparseIntArray7.put(i968, i969);
        sparseIntArray7.put(Eg, i959);
        sparseIntArray7.put(Hg, Vc);
        sparseIntArray7.put(Ig, i961);
        sparseIntArray7.put(Jg, i963);
        sparseIntArray7.put(Kg, i965);
        sparseIntArray7.put(Ng, i967);
        sparseIntArray7.put(Qg, i969);
        hm.put(Tg, i959);
        int i970 = 0;
        while (true) {
            int[] iArr = o8;
            if (i970 >= iArr.length) {
                break;
            }
            im.add(Integer.valueOf(iArr[i970]));
            i970++;
        }
        int i971 = 0;
        while (true) {
            int[] iArr2 = p8;
            if (i971 >= iArr2.length) {
                break;
            }
            im.add(Integer.valueOf(iArr2[i971]));
            i971++;
        }
        int i972 = 0;
        while (true) {
            int[] iArr3 = q8;
            if (i972 >= iArr3.length) {
                break;
            }
            im.add(Integer.valueOf(iArr3[i972]));
            i972++;
        }
        int i973 = 0;
        while (true) {
            int[] iArr4 = rk;
            int length = iArr4.length;
            hashSet = im;
            if (i973 >= length) {
                break;
            }
            hashSet.add(Integer.valueOf(iArr4[i973]));
            i973++;
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
        bmb bmbVar3 = new bmb();
        bmbVar3.a = "Blue";
        bmbVar3.d = "bluebubbles.attheme";
        bmbVar3.M = -6963476;
        bmbVar3.R = -1;
        bmbVar3.S = -3086593;
        bmbVar3.T = true;
        bmbVar3.Z = n;
        bmbVar3.W = (byte) 1;
        bmbVar3.t(new int[]{-10972987, -14444461, -3252606, -8428605, -14380627, -14050257, -7842636, -13464881, -12342073, -11359164, -3317869, -2981834, -8165684, -3256745, -2904512, -8681301}, new int[]{-4660851, -328756, -1572, -4108434, -3031781, -1335, -198952, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{0, -853047, -264993, 0, 0, -135756, -198730, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{0, -2104672, -937328, -2637335, -2639714, -1270157, -3428124, -6570777, -7223828, -6567550, -1793599, -1855875, -4674838, -1336199, -2900876, -6247730}, new int[]{0, -4532067, -1257580, -1524266, -1646910, -1519483, -1324823, -4138509, -4202516, -2040429, -1458474, -1256030, -3814930, -1000039, -1450082, -3485987}, new int[]{0, -1909081, -1592444, -2969879, -2439762, -1137033, -2119471, -6962197, -4857383, -4270699, -3364639, -2117514, -5000734, -1598028, -2045813, -5853742}, new int[]{0, -6371440, -1319256, -1258616, -1712961, -1186647, -1193816, -4467224, -4203544, -3023977, -1061929, -1255788, -2113811, -806526, -1715305, -3485976}, new int[]{99, 9, 10, 11, 12, 13, 14, 0, 1, 2, 3, 4, 5, 6, 7, 8}, new String[]{"", "p-pXcflrmFIBAAAAvXYQk-mCwZU", "JqSUrO0-mFIBAAAAWwTvLzoWGQI", "O-wmAfBPSFADAAAA4zINVfD_bro", "RepJ5uE_SVABAAAAr4d0YhgB850", "-Xc-np9y2VMCAAAARKr0yNNPYW0", "fqv01SQemVIBAAAApND8LDRUhRU", "fqv01SQemVIBAAAApND8LDRUhRU", "RepJ5uE_SVABAAAAr4d0YhgB850", "lp0prF8ISFAEAAAA_p385_CvG0w", "heptcj-hSVACAAAAC9RrMzOa-cs", "PllZ-bf_SFAEAAAA8crRfwZiDNg", "dhf9pceaQVACAAAAbzdVo4SCiZA", "Ujx2TFcJSVACAAAARJ4vLa50MkM", "p-pXcflrmFIBAAAAvXYQk-mCwZU", "dk_wwlghOFACAAAAfz9xrxi6euw"}, new int[]{0, nm7.J2, 45, 0, 45, nm7.J2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{0, 52, 46, 57, 45, 64, 52, 35, 36, 41, 50, 50, 35, 38, 37, 30});
        H1(bmbVar3);
        L = bmbVar3;
        K = bmbVar3;
        arrayList.add(bmbVar3);
        hashMap.put("Blue", bmbVar3);
        bmb bmbVar4 = new bmb();
        bmbVar4.a = "Dark Blue";
        bmbVar4.d = "darkblue.attheme";
        bmbVar4.M = -10523006;
        bmbVar4.R = -9009508;
        bmbVar4.S = -8214301;
        bmbVar4.W = (byte) 3;
        bmbVar4.t(new int[]{-7177260, -9860357, -14440464, -8687151, -9848491, -14053142, -9403671, -10044691, -13203974, -12138259, -10179489, -1344335, -1142742, -6127120, -2931932, -1131212, -8417365, -13270557}, new int[]{-6464359, -10267323, -13532789, -5413850, -11898828, -13410942, -13215889, -10914461, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{-10465880, -9937588, -14983040, -6736562, -14197445, -13534568, -13144441, -10587280, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{-14213586, -15263198, -16310753, -15724781, -15853551, -16051428, -14868183, -14668758, -15854566, -15326427, -15327979, -14411490, -14345453, -14738135, -14543346, -14212843, -15263205, -15854566}, new int[]{-15659501, -14277074, -15459034, -14542297, -14735336, -15129808, -15591910, -15459810, -15260623, -15853800, -15259879, -14477540, -14674936, -15461604, -13820650, -15067635, -14605528, -15260623}, new int[]{-13951445, -15395557, -15985382, -15855853, -16050417, -15525854, -15260627, -15327189, -15788258, -14799314, -15458796, -13952727, -13754603, -14081231, -14478324, -14081004, -15197667, -15788258}, new int[]{-15330777, -15066858, -15915220, -14213847, -15262439, -15260879, -15657695, -16443625, -15459285, -15589601, -14932454, -14740451, -15002870, -15264997, -13821660, -14805234, -14605784, -15459285}, new int[]{11, 12, 13, 14, 15, 16, 17, 18, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, new String[]{"O-wmAfBPSFADAAAA4zINVfD_bro", "RepJ5uE_SVABAAAAr4d0YhgB850", "dk_wwlghOFACAAAAfz9xrxi6euw", "9LW_RcoOSVACAAAAFTk3DTyXN-M", "PllZ-bf_SFAEAAAA8crRfwZiDNg", "-Xc-np9y2VMCAAAARKr0yNNPYW0", "kO4jyq55SFABAAAA0WEpcLfahXk", "CJNyxPMgSVAEAAAAvW9sMwc51cw", "fqv01SQemVIBAAAApND8LDRUhRU", "RepJ5uE_SVABAAAAr4d0YhgB850", "CJNyxPMgSVAEAAAAvW9sMwc51cw", "9LW_RcoOSVACAAAAFTk3DTyXN-M", "9GcNVISdSVADAAAAUcw5BYjELW4", "F5oWoCs7QFACAAAAgf2bD_mg8Bw", "9ShF73d1MFIIAAAAjWnm8_ZMe8Q", "3rX-PaKbSFACAAAAEiHNvcEm6X4", "dk_wwlghOFACAAAAfz9xrxi6euw", "fqv01SQemVIBAAAApND8LDRUhRU"}, new int[]{nm7.B3, 45, nm7.B3, 135, 45, nm7.B3, 45, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{40, 40, 31, 50, 25, 34, 35, 35, 38, 29, 24, 34, 34, 31, 29, 37, 21, 38});
        H1(bmbVar4);
        arrayList.add(bmbVar4);
        J = bmbVar4;
        hashMap.put("Dark Blue", bmbVar4);
        bmb bmbVar5 = new bmb();
        bmbVar5.a = "Arctic Blue";
        bmbVar5.d = "arctic.attheme";
        bmbVar5.M = -1971728;
        bmbVar5.R = -1;
        bmbVar5.S = -9657877;
        bmbVar5.W = (byte) 5;
        bmbVar5.t(new int[]{-12537374, -12472227, -3240928, -11033621, -2194124, -3382903, -13332245, -12342073, -11359164, -3317869, -2981834, -8165684, -3256745, -2904512, -8681301}, new int[]{-13525046, -14113959, -7579073, -13597229, -3581840, -8883763, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{-11616542, -9716647, -6400452, -12008744, -2592697, -4297041, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{-3808528, -2433367, -2700891, -1838093, -1120848, -1712148, -2037779, -4202261, -4005713, -1058332, -925763, -1975316, -1189672, -1318451, -2302235}, new int[]{-1510157, -4398164, -1647697, -3610898, -1130838, -1980692, -4270093, -4202261, -3415654, -1259815, -1521765, -4341268, -1127744, -1318219, -3945761}, new int[]{-4924688, -3283031, -1523567, -2494477, -1126510, -595210, -2037517, -3478548, -4661623, -927514, -796762, -2696971, -1188403, -1319735, -1577487}, new int[]{-3149585, -5714021, -1978209, -4925720, -1134713, -1718833, -3613709, -5317397, -3218014, -999207, -2116466, -4343054, -931397, -1583186, -3815718}, new int[]{9, 10, 11, 12, 13, 14, 0, 1, 2, 3, 4, 5, 6, 7, 8}, new String[]{"MIo6r0qGSFAFAAAAtL8TsDzNX60", "dhf9pceaQVACAAAAbzdVo4SCiZA", "fqv01SQemVIBAAAApND8LDRUhRU", "p-pXcflrmFIBAAAAvXYQk-mCwZU", "JqSUrO0-mFIBAAAAWwTvLzoWGQI", "F5oWoCs7QFACAAAAgf2bD_mg8Bw", "fqv01SQemVIBAAAApND8LDRUhRU", "RepJ5uE_SVABAAAAr4d0YhgB850", "PllZ-bf_SFAEAAAA8crRfwZiDNg", "pgJfpFNRSFABAAAACDT8s5sEjfc", "ptuUd96JSFACAAAATobI23sPpz0", "dhf9pceaQVACAAAAbzdVo4SCiZA", "JqSUrO0-mFIBAAAAWwTvLzoWGQI", "9iklpvIPQVABAAAAORQXKur_Eyc", "F5oWoCs7QFACAAAAgf2bD_mg8Bw"}, new int[]{nm7.l5, nm7.l5, nm7.B3, nm7.l5, 0, nm7.J2, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{50, 50, 58, 47, 46, 50, 49, 46, 51, 50, 49, 34, 54, 50, 40});
        H1(bmbVar5);
        arrayList.add(bmbVar5);
        hashMap.put("Arctic Blue", bmbVar5);
        bmb bmbVar6 = new bmb();
        bmbVar6.a = "Day";
        bmbVar6.d = "day.attheme";
        bmbVar6.M = -1;
        bmbVar6.R = -1315084;
        bmbVar6.S = -8604930;
        bmbVar6.W = (byte) 2;
        bmbVar6.t(new int[]{-11099447, -3379581, -3109305, -3382174, -7963438, -11759137, -11029287, -11226775, -2506945, -3382174, -3379581, -6587438, -2649788, -8681301}, new int[]{-10125092, -9671214, -3451775, -3978678, -10711329, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{-12664362, -3642988, -2383569, -3109317, -11422261, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, null, null, new int[]{9, 10, 11, 12, 13, 0, 1, 2, 3, 4, 5, 6, 7, 8}, new String[]{"", "", "", "", "", "", "", "", "", "", "", "", "", ""}, new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
        H1(bmbVar6);
        arrayList.add(bmbVar6);
        hashMap.put("Day", bmbVar6);
        bmb bmbVar7 = new bmb();
        bmbVar7.a = "Night";
        bmbVar7.d = "night.attheme";
        bmbVar7.M = -11315623;
        bmbVar7.R = -9143676;
        bmbVar7.S = -9067802;
        bmbVar7.W = (byte) 4;
        bmbVar7.t(new int[]{-9781697, -7505693, -2204034, -10913816, -2375398, -12678921, -11881005, -11880383, -2534026, -1934037, -7115558, -3128522, -1528292, -8812381}, new int[]{-7712108, -4953061, -5288081, -14258547, -9154889, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{-9939525, -5948598, -10335844, -13659747, -14054507, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{-15330532, -14806760, -15791344, -16184308, -16313063, -15921641, -15656164, -15986420, -15856883, -14871025, -16185078, -14937584, -14869736, -15855598}, new int[]{-14673881, -15724781, -15002342, -15458526, -15987697, -16184820, -16118258, -16250616, -15067624, -15527923, -14804447, -15790836, -15987960, -16316665}, new int[]{-15856877, -14608861, -15528430, -15921391, -15722209, -15197144, -15458015, -15591406, -15528431, -15068401, -16053749, -15594229, -15395825, -15724012}, new int[]{-14804694, -15658986, -14609382, -15656421, -16118509, -15855854, -16315381, -16052981, -14544354, -15791092, -15659241, -16316922, -15988214, -16185077}, new int[]{9, 10, 11, 12, 13, 0, 1, 2, 3, 4, 5, 6, 7, 8}, new String[]{"YIxYGEALQVADAAAAA3QbEH0AowY", "9LW_RcoOSVACAAAAFTk3DTyXN-M", "O-wmAfBPSFADAAAA4zINVfD_bro", "F5oWoCs7QFACAAAAgf2bD_mg8Bw", "-Xc-np9y2VMCAAAARKr0yNNPYW0", "fqv01SQemVIBAAAApND8LDRUhRU", "F5oWoCs7QFACAAAAgf2bD_mg8Bw", "ptuUd96JSFACAAAATobI23sPpz0", "p-pXcflrmFIBAAAAvXYQk-mCwZU", "Nl8Pg2rBQVACAAAA25Lxtb8SDp0", "dhf9pceaQVACAAAAbzdVo4SCiZA", "9GcNVISdSVADAAAAUcw5BYjELW4", "9LW_RcoOSVACAAAAFTk3DTyXN-M", "dk_wwlghOFACAAAAfz9xrxi6euw"}, new int[]{45, 135, 0, nm7.J2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{34, 47, 52, 48, 54, 50, 37, 56, 48, 49, 40, 64, 38, 48});
        H1(bmbVar7);
        arrayList.add(bmbVar7);
        hashMap.put("Night", bmbVar7);
        String str = null;
        String string = sharedPreferences.getString("themes2", null);
        if (sharedPreferences.getInt("remote_version", 0) == 1) {
            int i974 = 0;
            while (i974 < 4) {
                long[] jArr = E;
                StringBuilder sb2 = new StringBuilder("2remoteThemesHash");
                sb2.append(i974 != 0 ? Integer.valueOf(i974) : "");
                jArr[i974] = sharedPreferences.getLong(sb2.toString(), 0L);
                int[] iArr5 = D;
                StringBuilder sb3 = new StringBuilder("lastLoadingThemesTime");
                sb3.append(i974 != 0 ? Integer.valueOf(i974) : "");
                iArr5[i974] = sharedPreferences.getInt(sb3.toString(), 0);
                i974++;
            }
        }
        sharedPreferences.edit().putInt("remote_version", 1).apply();
        if (TextUtils.isEmpty(string)) {
            String string2 = sharedPreferences.getString("themes", null);
            if (!TextUtils.isEmpty(string2)) {
                for (String str2 : string2.split("&")) {
                    bmb f10 = bmb.f(str2);
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
                for (int i975 = 0; i975 < jSONArray.length(); i975++) {
                    bmb e10 = bmb.e(jSONArray.getJSONObject(i975));
                    if (e10 != null) {
                        G.add(e10);
                        F.add(e10);
                        H.put(e10.k(), e10);
                        e10.q(sharedPreferences);
                    }
                }
            } catch (Exception e11) {
                fc4.f(e11);
            }
        }
        Collections.sort(F, new zua(b11));
        SharedPreferences d12 = oc7.d1();
        try {
            HashMap hashMap2 = H;
            bmb bmbVar8 = (bmb) hashMap2.get("Dark Blue");
            String string3 = d12.getString("theme", null);
            if ("Default".equals(string3)) {
                bmbVar = (bmb) hashMap2.get("Blue");
                bmbVar.Z = n;
            } else if ("Dark".equals(string3)) {
                bmbVar8.Z = 9;
                bmbVar = bmbVar8;
            } else if (string3 != null) {
                bmbVar = (bmb) hashMap2.get(string3);
                if (bmbVar != null && !sharedPreferences.contains("lastDayTheme")) {
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.putString("lastDayTheme", bmbVar.k());
                    edit.commit();
                }
            } else {
                bmbVar = null;
            }
            String string4 = d12.getString("nighttheme", null);
            if ("Default".equals(string4)) {
                bmbVar = (bmb) hashMap2.get("Blue");
                bmbVar.Z = n;
            } else if ("Dark".equals(string4)) {
                J = bmbVar8;
                bmbVar8.Z = 9;
            } else if (string4 != null && (bmbVar2 = (bmb) hashMap2.get(string4)) != null) {
                J = bmbVar2;
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
                bmb bmbVar9 = (bmb) it3.next();
                if (bmbVar9.d == null || bmbVar9.Y == 0) {
                    b10 = b11;
                    it = it3;
                    editor3 = editor3;
                } else {
                    String string5 = sharedPreferences.getString("accents_" + bmbVar9.d, str);
                    bmbVar9.Z = sharedPreferences.getInt("accent_current_" + bmbVar9.d, bmbVar9.T ? n : (byte) 0);
                    ArrayList arrayList2 = new ArrayList();
                    if (TextUtils.isEmpty(string5)) {
                        it = it3;
                        editor = editor3;
                        String str3 = "accent_for_" + bmbVar9.d;
                        int i976 = d12.getInt(str3, 0);
                        if (i976 != 0) {
                            if (editor == null) {
                                editor3 = d12.edit();
                                editor4 = sharedPreferences.edit();
                            } else {
                                editor3 = editor;
                            }
                            editor3.remove(str3);
                            int size = bmbVar9.c0.size();
                            int i977 = 0;
                            while (true) {
                                if (i977 >= size) {
                                    amb ambVar = new amb();
                                    ambVar.a = 100;
                                    ambVar.c = i976;
                                    ambVar.b = bmbVar9;
                                    bmbVar9.b0.put(100, ambVar);
                                    arrayList2.add(0, ambVar);
                                    bmbVar9.Z = 100;
                                    bmbVar9.g0 = 101;
                                    SerializedData serializedData = new SerializedData(72);
                                    serializedData.writeInt32(9);
                                    serializedData.writeInt32(1);
                                    serializedData.writeInt32(ambVar.a);
                                    serializedData.writeInt32(ambVar.c);
                                    serializedData.writeInt32(ambVar.e);
                                    serializedData.writeInt32(ambVar.f);
                                    serializedData.writeInt32(ambVar.g);
                                    serializedData.writeInt32(ambVar.h);
                                    serializedData.writeBool(ambVar.i);
                                    serializedData.writeInt64(ambVar.j);
                                    serializedData.writeInt64(ambVar.k);
                                    serializedData.writeInt64(ambVar.l);
                                    serializedData.writeInt64(ambVar.m);
                                    serializedData.writeInt32(ambVar.n);
                                    serializedData.writeInt64(0L);
                                    serializedData.writeDouble(ambVar.p);
                                    serializedData.writeBool(ambVar.q);
                                    serializedData.writeString(ambVar.o);
                                    serializedData.writeBool(false);
                                    b10 = 3;
                                    editor4.putString("accents_" + bmbVar9.d, Base64.encodeToString(serializedData.toByteArray(), 3));
                                    break;
                                }
                                amb ambVar2 = (amb) bmbVar9.c0.get(i977);
                                if (ambVar2.c == i976) {
                                    bmbVar9.Z = ambVar2.a;
                                    b10 = 3;
                                    break;
                                }
                                i977++;
                            }
                            editor4.putInt("accent_current_" + bmbVar9.d, bmbVar9.Z);
                            if (!arrayList2.isEmpty()) {
                                bmbVar9.c0.addAll(0, arrayList2);
                                H1(bmbVar9);
                            }
                            sparseArray = bmbVar9.b0;
                            if (sparseArray != null && sparseArray.get(bmbVar9.Z) == null) {
                                bmbVar9.Z = !bmbVar9.T ? n : (byte) 0;
                            }
                            bmbVar9.q(sharedPreferences);
                            i11 = bmbVar9.i(false);
                            if (i11 == null) {
                                bmbVar9.j0 = i11.y;
                            }
                        } else {
                            b10 = 3;
                        }
                    } else {
                        try {
                            SerializedData serializedData2 = new SerializedData(Base64.decode(string5, b11));
                            boolean z12 = true;
                            int readInt32 = serializedData2.readInt32(true);
                            int readInt322 = serializedData2.readInt32(true);
                            int i978 = 0;
                            while (i978 < readInt322) {
                                try {
                                    amb ambVar3 = new amb();
                                    ambVar3.a = serializedData2.readInt32(z12);
                                    ambVar3.c = serializedData2.readInt32(z12);
                                    if (readInt32 >= 9) {
                                        ambVar3.d = serializedData2.readInt32(z12);
                                    }
                                    ambVar3.b = bmbVar9;
                                    ambVar3.e = serializedData2.readInt32(true);
                                    ambVar3.f = serializedData2.readInt32(true);
                                    if (readInt32 >= 7) {
                                        ambVar3.g = serializedData2.readInt32(true);
                                        ambVar3.h = serializedData2.readInt32(true);
                                    }
                                    if (readInt32 >= 8) {
                                        z11 = true;
                                        ambVar3.i = serializedData2.readBool(true);
                                    } else {
                                        z11 = true;
                                    }
                                    if (readInt32 >= 3) {
                                        it2 = it3;
                                        editor2 = editor3;
                                        ambVar3.j = serializedData2.readInt64(z11);
                                    } else {
                                        it2 = it3;
                                        editor2 = editor3;
                                        ambVar3.j = serializedData2.readInt32(z11);
                                    }
                                    if (readInt32 >= 2) {
                                        ambVar3.k = serializedData2.readInt64(z11);
                                    } else {
                                        ambVar3.k = serializedData2.readInt32(z11);
                                    }
                                    ?? r11 = z11;
                                    if (readInt32 >= 6) {
                                        ambVar3.l = serializedData2.readInt64(z11);
                                        ambVar3.m = serializedData2.readInt64(z11);
                                        r11 = 1;
                                    }
                                    if (readInt32 >= r11) {
                                        ambVar3.n = serializedData2.readInt32(r11);
                                    }
                                    if (readInt32 >= 4) {
                                        serializedData2.readInt64(r11);
                                        ambVar3.p = (float) serializedData2.readDouble(r11);
                                        ambVar3.q = serializedData2.readBool(r11);
                                        i10 = 5;
                                        if (readInt32 >= 5) {
                                            ambVar3.o = serializedData2.readString(r11);
                                        }
                                        if (readInt32 >= i10 && serializedData2.readBool(true)) {
                                            ambVar3.t = serializedData2.readInt32(true);
                                            ambVar3.r = TLRPC.Theme.TLdeserialize(serializedData2, serializedData2.readInt32(true), true);
                                        }
                                        tL_theme = ambVar3.r;
                                        if (tL_theme != null) {
                                            ambVar3.z = tL_theme.isDefault;
                                        }
                                        bmbVar9.b0.put(ambVar3.a, ambVar3);
                                        tL_theme2 = ambVar3.r;
                                        if (tL_theme2 != null) {
                                            bmbVar9.d0.put(tL_theme2.id, ambVar3);
                                        }
                                        arrayList2.add(ambVar3);
                                        bmbVar9.g0 = Math.max(bmbVar9.g0, ambVar3.a);
                                        i978++;
                                        it3 = it2;
                                        editor3 = editor2;
                                        b11 = 3;
                                        z12 = true;
                                    }
                                    i10 = 5;
                                    if (readInt32 >= i10) {
                                        ambVar3.t = serializedData2.readInt32(true);
                                        ambVar3.r = TLRPC.Theme.TLdeserialize(serializedData2, serializedData2.readInt32(true), true);
                                    }
                                    tL_theme = ambVar3.r;
                                    if (tL_theme != null) {
                                    }
                                    bmbVar9.b0.put(ambVar3.a, ambVar3);
                                    tL_theme2 = ambVar3.r;
                                    if (tL_theme2 != null) {
                                    }
                                    arrayList2.add(ambVar3);
                                    bmbVar9.g0 = Math.max(bmbVar9.g0, ambVar3.a);
                                    i978++;
                                    it3 = it2;
                                    editor3 = editor2;
                                    b11 = 3;
                                    z12 = true;
                                } finally {
                                }
                            }
                            it = it3;
                            editor = editor3;
                            b10 = b11;
                        } catch (Throwable th2) {
                            fc4.f(th2);
                            throw new RuntimeException(th2);
                        }
                    }
                    editor3 = editor;
                    if (!arrayList2.isEmpty()) {
                    }
                    sparseArray = bmbVar9.b0;
                    if (sparseArray != null) {
                        bmbVar9.Z = !bmbVar9.T ? n : (byte) 0;
                    }
                    bmbVar9.q(sharedPreferences);
                    i11 = bmbVar9.i(false);
                    if (i11 == null) {
                    }
                }
                it3 = it;
                b11 = b10;
                str = null;
            }
            SharedPreferences.Editor editor5 = editor3;
            byte b12 = b11;
            if (editor5 != null) {
                editor5.commit();
                editor4.commit();
            }
            o = d12.getInt("selectedAutoNightType", Build.VERSION.SDK_INT >= 29 ? b12 : (byte) 0);
            p = d12.getBoolean("autoNightScheduleByLocation", false);
            q = d12.getFloat("autoNightBrighnessThreshold", 0.25f);
            r = d12.getInt("autoNightDayStartTime", 1320);
            s = d12.getInt("autoNightDayEndTime", 480);
            t = d12.getInt("autoNightSunsetTime", 1320);
            v = d12.getInt("autoNightSunriseTime", 480);
            w = d12.getString("autoNightCityName", "");
            long j10 = d12.getLong("autoNightLocationLatitude3", 10000L);
            if (j10 != 10000) {
                x = Double.longBitsToDouble(j10);
            } else {
                x = 10000.0d;
            }
            long j11 = d12.getLong("autoNightLocationLongitude3", 10000L);
            if (j11 != 10000) {
                y = Double.longBitsToDouble(j11);
            } else {
                y = 10000.0d;
            }
            u = d12.getInt("autoNightLastSunCheckDay", -1);
            if (bmbVar == null) {
                bmbVar = L;
            } else {
                K = bmbVar;
            }
            if (d12.contains("overrideThemeWallpaper") || d12.contains("selectedBackground2")) {
                boolean z13 = d12.getBoolean("overrideThemeWallpaper", false);
                long j12 = d12.getLong("selectedBackground2", 1000001L);
                if (j12 == -1 || (z13 && j12 != -2 && j12 != 1000001)) {
                    xlb xlbVar = new xlb();
                    xlbVar.d = d12.getInt("selectedColor", 0);
                    xlbVar.c = d12.getString("selectedBackgroundSlug", "");
                    if (j12 < -100 || j12 > -1 || xlbVar.d == 0) {
                        xlbVar.a = "wallpaper.jpg";
                        xlbVar.b = "wallpaper_original.jpg";
                    } else {
                        xlbVar.c = "c";
                        xlbVar.a = "";
                        xlbVar.b = "";
                    }
                    xlbVar.e = d12.getInt("selectedGradientColor", 0);
                    xlbVar.f = d12.getInt("selectedGradientColor2", 0);
                    xlbVar.g = d12.getInt("selectedGradientColor3", 0);
                    xlbVar.h = d12.getInt("selectedGradientRotation", 45);
                    xlbVar.i = d12.getBoolean("selectedBackgroundBlurred", false);
                    xlbVar.j = d12.getBoolean("selectedBackgroundMotion", false);
                    xlbVar.k = d12.getFloat("selectedIntensity", 0.5f);
                    K.v(xlbVar);
                    if (o != 0) {
                        J.v(xlbVar);
                    }
                }
                d12.edit().remove("overrideThemeWallpaper").remove("selectedBackground2").commit();
            }
            byte b13 = 2;
            if (q1() == 2) {
                bmbVar = J;
                z10 = true;
            } else {
                z10 = false;
            }
            t(bmbVar, false, z10);
            gm.c3(new bo6(b13));
            xm = new olb();
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
            new Paint().setColor(-1342112000);
            Paint paint3 = new Paint();
            Hm = paint3;
            paint3.setColor(-65536);
            paint3.setStrokeWidth(2.0f);
            Paint.Style style = Paint.Style.STROKE;
            paint3.setStyle(style);
            Paint paint4 = new Paint();
            Im = paint4;
            paint4.setColor(-16711936);
            paint4.setStrokeWidth(2.0f);
            paint4.setStyle(style);
        } catch (Exception e12) {
            fc4.f(e12);
            rjb.m(e12);
        }
    }

    public static void A() {
        if (o != 2) {
            if (k) {
                k = false;
                gm.r(m);
            }
            if (j) {
                j = false;
                gm.r(l);
            }
            if (g) {
                h = 1.0f;
                e.unregisterListener(xm, f);
                g = false;
                if (e21.a) {
                    fc4.b("light sensor unregistered");
                }
            }
        }
    }

    public static String A0() {
        bmb bmbVar = J;
        if (bmbVar == null) {
            return "";
        }
        String l10 = bmbVar.l();
        return l10.toLowerCase().endsWith(".attheme") ? l10.substring(0, l10.lastIndexOf(46)) : l10;
    }

    public static void A1(int i10, Drawable drawable) {
        if (drawable == null) {
            return;
        }
        if (drawable instanceof e0b) {
            ((e0b) drawable).b(i10);
            return;
        }
        if (drawable instanceof ai7) {
            ((ai7) drawable).a(i10);
            return;
        }
        if (drawable instanceof ShapeDrawable) {
            ((ShapeDrawable) drawable).getPaint().setColor(i10);
        } else if (drawable instanceof hs9) {
            ((hs9) drawable).b(i10);
        } else {
            drawable.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
        }
    }

    public static int B(bmb bmbVar, int i10, int i11) {
        int i12;
        if (i10 == 0 || (i12 = bmbVar.Y) == 0 || i10 == i12 || (bmbVar.T && bmbVar.Z == n)) {
            return i11;
        }
        float[] N02 = N0(3);
        float[] N03 = N0(4);
        Color.colorToHSV(bmbVar.Y, N02);
        Color.colorToHSV(i10, N03);
        return D(N02, N03, i11, bmbVar.o(), i11);
    }

    public static bmb B0() {
        bmb bmbVar = K;
        return bmbVar != null ? bmbVar : L;
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
        amb i11 = I.i(false);
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
        float B10 = gm.B(i10);
        float B11 = gm.B(HSVToColor);
        if (z10) {
            if (B10 <= B11) {
                return HSVToColor;
            }
        } else if (B10 >= B11) {
            return HSVToColor;
        }
        float d10 = kt6.d(0.39999998f, B10, B11, 0.6f);
        int red = (int) (Color.red(HSVToColor) * d10);
        int green = (int) (Color.green(HSVToColor) * d10);
        int blue = (int) (Color.blue(HSVToColor) * d10);
        return Color.argb(Color.alpha(HSVToColor), red < 0 ? 0 : Math.min(red, nm7.d4), green < 0 ? 0 : Math.min(green, nm7.d4), blue >= 0 ? Math.min(blue, nm7.d4) : 0);
    }

    public static int D0(int i10) {
        int i11 = gm[i10];
        if (i11 != 0) {
            return i11;
        }
        int i12 = hm.get(i10, -1);
        return i12 != -1 ? D0(i12) : ((i10 >= pb && i10 < wb) || i10 == C9 || i10 == M9 || i10 == D9 || i10 == Fe || i10 == Ge) ? 0 : -65536;
    }

    public static void D1(fg0 fg0Var, float f10, float f11, float f12, float f13) {
        if (wi8.A(fg0Var)) {
            int numberOfLayers = fg0Var.getNumberOfLayers();
            for (int i10 = 0; i10 < numberOfLayers; i10++) {
                Drawable drawable = fg0Var.getDrawable(i10);
                if (drawable instanceof zlb) {
                    zlb zlbVar = (zlb) drawable;
                    float[] fArr = zlbVar.b;
                    float L10 = gm.L(f10);
                    fArr[1] = L10;
                    fArr[0] = L10;
                    float L11 = gm.L(f11);
                    fArr[3] = L11;
                    fArr[2] = L11;
                    float L12 = gm.L(f12);
                    fArr[5] = L12;
                    fArr[4] = L12;
                    float L13 = gm.L(f13);
                    fArr[7] = L13;
                    fArr[6] = L13;
                    zlbVar.c = true;
                    zlbVar.invalidateSelf();
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
                gm.r(m);
            }
            if (j) {
                j = false;
                gm.r(l);
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

    public static vp4 E0() {
        vp4 vp4Var = sm;
        if (vp4Var == null) {
            vp4Var = new vp4();
            vp4Var.a = new up4[4];
            vp4Var.k = 1.0f;
            vp4Var.l = new ArrayList();
            vp4Var.m = new Paint(1);
            vp4Var.n = new Path();
            for (int i10 = 0; i10 < 4; i10++) {
                vp4Var.a[i10] = new up4(i10);
            }
            sm = vp4Var;
        }
        return vp4Var;
    }

    public static void E1(fg0 fg0Var, int i10, int i11) {
        if (wi8.A(fg0Var)) {
            int numberOfLayers = fg0Var.getNumberOfLayers();
            for (int i12 = 0; i12 < numberOfLayers; i12++) {
                Drawable drawable = fg0Var.getDrawable(i12);
                if (drawable instanceof zlb) {
                    zlb zlbVar = (zlb) drawable;
                    float f10 = i10;
                    float f11 = i11;
                    float[] fArr = zlbVar.b;
                    float L10 = gm.L(f10);
                    fArr[3] = L10;
                    fArr[2] = L10;
                    fArr[1] = L10;
                    fArr[0] = L10;
                    float L11 = gm.L(f11);
                    fArr[7] = L11;
                    fArr[6] = L11;
                    fArr[5] = L11;
                    fArr[4] = L11;
                    zlbVar.c = true;
                    zlbVar.invalidateSelf();
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
                    bmb bmbVar = i11 == 0 ? K : J;
                    if (bmbVar != null && z8c.h(bmbVar.F).o()) {
                        amb i12 = bmbVar.i(false);
                        TLRPC.TL_theme tL_theme = bmbVar.G;
                        if (tL_theme != null) {
                            i10 = bmbVar.F;
                        } else if (i12 != null && (tL_theme = i12.r) != null) {
                            i10 = z8c.t0;
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
                            ConnectionsManager.getInstance(i10).sendRequest(gettheme, new fm8((Object) i12, (Object) bmbVar, (Object) tL_theme, (byte) 24));
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

    public static void G(SparseIntArray sparseIntArray, bmb bmbVar) {
        if (bmbVar == null || bmbVar.k0 != -1) {
            return;
        }
        int i10 = c6;
        if (on2.h(on2.f(0.5f, G0(sparseIntArray, i10), G0(sparseIntArray, i10))) < 0.5d) {
            bmbVar.k0 = 1;
        } else {
            bmbVar.k0 = 0;
        }
    }

    public static int G0(SparseIntArray sparseIntArray, int i10) {
        int indexOfKey = sparseIntArray.indexOfKey(i10);
        return indexOfKey >= 0 ? sparseIntArray.valueAt(indexOfKey) : gm[i10];
    }

    public static void G1(bmb bmbVar, amb ambVar, TLRPC.TL_theme tL_theme, int i10, boolean z10) {
        String str;
        TLRPC.WallPaperSettings wallPaperSettings;
        if (tL_theme != null) {
            TLRPC.ThemeSettings themeSettings = tL_theme.settings.size() > 0 ? tL_theme.settings.get(0) : null;
            HashMap hashMap = H;
            if (themeSettings != null) {
                if (bmbVar == null) {
                    String q02 = q0(themeSettings);
                    if (q02 == null || (bmbVar = (bmb) hashMap.get(q02)) == null) {
                        return;
                    } else {
                        ambVar = (amb) bmbVar.d0.get(tL_theme.id);
                    }
                }
                if (ambVar == null) {
                    return;
                }
                TLRPC.TL_theme tL_theme2 = ambVar.r;
                if (tL_theme2 != null) {
                    bmbVar.d0.remove(tL_theme2.id);
                }
                ambVar.r = tL_theme;
                ambVar.t = i10;
                bmbVar.d0.put(tL_theme.id, ambVar);
                if (!bmb.a(ambVar, themeSettings)) {
                    bmb.g(ambVar, themeSettings);
                    bmb bmbVar2 = I;
                    if (bmbVar2 == bmbVar && bmbVar2.Z == ambVar.a) {
                        r1(false, false);
                        bmb bmbVar3 = I;
                        I1(bmbVar3, J == bmbVar3, -1, null);
                    }
                }
                TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
                ambVar.q = (wallPaper == null || (wallPaperSettings = wallPaper.settings) == null || !wallPaperSettings.motion) ? false : true;
                bmbVar.U = false;
            } else {
                if (bmbVar != null) {
                    str = bmbVar.k();
                    hashMap.remove(str);
                } else {
                    str = "remote" + tL_theme.id;
                    bmbVar = (bmb) hashMap.get(str);
                }
                if (bmbVar == null) {
                    return;
                }
                bmbVar.G = tL_theme;
                bmbVar.a = tL_theme.title;
                File file = new File(bmbVar.b);
                File file2 = new File(a.h(), td4.p(str, ".attheme"));
                if (!file.equals(file2)) {
                    try {
                        gm.E(file, file2);
                        bmbVar.b = file2.getAbsolutePath();
                    } catch (Exception e10) {
                        fc4.g(e10, true);
                    }
                }
                if (z10) {
                    bmbVar.H = false;
                    bmbVar.h0 = null;
                    bmbVar.i0 = null;
                    nm7.f(bmbVar.F).a(bmbVar, nm7.Y1);
                    nm7.f(bmbVar.F).a(bmbVar, nm7.Z1);
                    bc4 G10 = bc4.G(bmbVar.F);
                    TLRPC.TL_theme tL_theme3 = bmbVar.G;
                    G10.X(tL_theme3.document, tL_theme3, 1, 1);
                } else {
                    bmbVar.U = false;
                }
                hashMap.put(bmbVar.k(), bmbVar);
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
    public static sm2 H(bmb bmbVar, xlb xlbVar, SparseIntArray sparseIntArray, String str, String str2, int i10, int i11, int i12, boolean z10, boolean z11, boolean z12, boolean z13, TLRPC.Document document, boolean z14) {
        int width;
        int height;
        Bitmap l12;
        Bitmap bitmap;
        boolean z15;
        String str3;
        Bitmap bitmap2;
        boolean z16 = false;
        sm2 sm2Var = new sm2((byte) 17, false);
        Bitmap bitmap3 = null;
        sm2Var.b = z14 ? null : d0;
        boolean z17 = (!z11 || z12) && xlbVar != null;
        if (xlbVar != null) {
            sm2Var.d = Boolean.valueOf(xlbVar.j);
            sm2Var.e = Boolean.valueOf((xlbVar.d == 0 || "d".equals(xlbVar.c) || "c".equals(xlbVar.c)) ? false : true);
        } else {
            sm2Var.d = Boolean.valueOf(bmbVar.n);
            sm2Var.e = Boolean.valueOf(bmbVar.r != 0);
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
                        fc4.g(th2, true);
                    }
                    boolean z18 = (i16 == 0 && i16 != i13) || i15 != 0;
                    if (bitmap2 == null || z18) {
                        ah7 ah7Var = new ah7(i13, i16, i15, i14, false, false);
                        ah7Var.r(i11, bitmap2);
                        if (bitmap2 != null) {
                            ah7Var.s(ah7Var.f());
                        }
                        ah7Var.t(i12);
                        sm2Var.b = ah7Var;
                    } else {
                        sm2Var.b = new ColorDrawable(i13);
                    }
                    if (!TextUtils.isEmpty(str3)) {
                        sm2Var.d = Boolean.valueOf(z13);
                        sm2Var.e = Boolean.TRUE;
                    }
                    sm2Var.f = Boolean.TRUE;
                }
                bitmap2 = null;
                if (i16 == 0) {
                }
                if (bitmap2 == null) {
                }
                ah7 ah7Var2 = new ah7(i13, i16, i15, i14, false, false);
                ah7Var2.r(i11, bitmap2);
                if (bitmap2 != null) {
                }
                ah7Var2.t(i12);
                sm2Var.b = ah7Var2;
                if (!TextUtils.isEmpty(str3)) {
                }
                sm2Var.f = Boolean.TRUE;
            } else if (str2 != null) {
                try {
                    Bitmap l13 = l1(new FileInputStream(usc.d(str2)), 0);
                    if (l13 != null) {
                        BitmapDrawable bitmapDrawable = new BitmapDrawable(l13);
                        sm2Var.b = bitmapDrawable;
                        sm2Var.c = bitmapDrawable;
                        sm2Var.f = Boolean.TRUE;
                    }
                } catch (Exception e10) {
                    fc4.g(e10, true);
                }
            } else if (i10 > 0 && (bmbVar.b != null || bmbVar.d != null)) {
                try {
                    String str4 = bmbVar.d;
                    Bitmap l14 = l1(new FileInputStream(str4 != null ? p0(str4) : new File(bmbVar.b)), i10);
                    if (l14 != null) {
                        BitmapDrawable bitmapDrawable2 = new BitmapDrawable(l14);
                        d0 = bitmapDrawable2;
                        sm2Var.c = bitmapDrawable2;
                        sm2Var.b = bitmapDrawable2;
                        bitmapDrawable2.setFilterBitmap(true);
                        sm2Var.f = Boolean.TRUE;
                    }
                } catch (Throwable th3) {
                    fc4.g(th3, true);
                }
            }
        }
        if (((Drawable) sm2Var.b) == null) {
            int i17 = xlbVar != null ? xlbVar.d : 0;
            if (xlbVar != null) {
                if (!"d".equals(xlbVar.c)) {
                    if (!"c".equals(xlbVar.c) || xlbVar.e != 0) {
                        if (i17 != 0) {
                            boolean z19 = (xlbVar.e == 0 || xlbVar.f == 0) ? false : true;
                            if (((Boolean) sm2Var.e).booleanValue()) {
                                boolean z20 = !z14;
                                String str5 = xlbVar.c;
                                if (!TextUtils.isEmpty(str5)) {
                                    osc d10 = btc.d(str5);
                                    if (d10 != null) {
                                        bitmap = d10.a;
                                        File e11 = (((Boolean) sm2Var.e).booleanValue() || TextUtils.isEmpty(xlbVar.a)) ? null : usc.e(xlbVar.a);
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
                                                sm2Var.b = bitmapDrawable3;
                                                bitmapDrawable3.setFilterBitmap(true);
                                                sm2Var.f = Boolean.TRUE;
                                            } else if (bitmap == null && xlbVar.e == 0) {
                                                sm2Var.b = new ColorDrawable(i17);
                                            } else {
                                                ah7 ah7Var3 = new ah7(xlbVar.d, xlbVar.e, xlbVar.f, xlbVar.g, false, false);
                                                ah7Var3.t(i12);
                                                if (bitmap != null) {
                                                    ah7Var3.r((int) (xlbVar.k * 100.0f), bitmap);
                                                    if (!z15) {
                                                        ah7Var3.s(ah7Var3.f());
                                                    }
                                                    sm2Var.f = Boolean.TRUE;
                                                }
                                                sm2Var.b = ah7Var3;
                                            }
                                        }
                                        z15 = false;
                                        if (bitmap3 != null) {
                                        }
                                    } else {
                                        int i18 = z8c.t0;
                                        llb llbVar = new llb(z20, str5, z16 ? 1 : 0);
                                        np3 np3Var = zsc.e;
                                        gm.c3(new bnc(i18, str5, llbVar));
                                    }
                                }
                            }
                            bitmap = null;
                            if (((Boolean) sm2Var.e).booleanValue()) {
                            }
                            if (bitmap == null) {
                            }
                            z15 = false;
                            if (bitmap3 != null) {
                            }
                        } else {
                            File e12 = usc.e(xlbVar.a);
                            if (e12.exists() && (l12 = l1(new FileInputStream(e12), 0)) != null) {
                                BitmapDrawable bitmapDrawable4 = new BitmapDrawable(l12);
                                sm2Var.b = bitmapDrawable4;
                                bitmapDrawable4.setFilterBitmap(true);
                                sm2Var.f = Boolean.TRUE;
                            }
                            if (((Drawable) sm2Var.b) == null) {
                                sm2Var.b = R(0, 0);
                                sm2Var.f = Boolean.FALSE;
                            }
                        }
                    }
                    if (((Drawable) sm2Var.b) == null) {
                        if (i17 == 0) {
                            i17 = -2693905;
                        }
                        sm2Var.b = new ColorDrawable(i17);
                    }
                }
            }
            sm2Var.b = R(0, 0);
            sm2Var.f = Boolean.FALSE;
            if (((Drawable) sm2Var.b) == null) {
            }
        }
        if (!e86.e(32)) {
            Drawable drawable = (Drawable) sm2Var.b;
            if (drawable instanceof ah7) {
                ah7 ah7Var4 = (ah7) drawable;
                Bitmap bitmap4 = ah7Var4.u;
                if (bitmap4 == null) {
                    Point point = gm.q;
                    width = Math.min(point.x, point.y);
                    height = Math.max(point.x, point.y);
                } else {
                    width = bitmap4.getWidth();
                    height = ah7Var4.u.getHeight();
                }
                Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                ((Drawable) sm2Var.b).setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                ((Drawable) sm2Var.b).draw(canvas);
                sm2Var.b = new BitmapDrawable(createBitmap);
            }
        }
        return sm2Var;
    }

    public static fg0 H0(int i10, int i11) {
        return new fg0(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{(i11 & 16777215) | 419430400}), null, b0(i10, -1));
    }

    public static void H1(bmb bmbVar) {
        Collections.sort(bmbVar.c0, new zua((byte) 4));
    }

    public static sm2 I(bmb bmbVar, SparseIntArray sparseIntArray, String str, int i10, boolean z10) {
        float f10;
        float f11;
        boolean z11 = bmbVar.T && bmbVar.Z == n;
        amb i11 = bmbVar.i(false);
        String str2 = i11 != null ? i11.o : null;
        boolean z12 = i11 != null && i11.q;
        xlb xlbVar = bmbVar.j0;
        if (xlbVar != null) {
            f11 = xlbVar.k;
        } else {
            if (i11 == null) {
                f10 = bmbVar.E;
                return H(bmbVar, xlbVar, sparseIntArray, str2, str, jm.get(f5, -1), (int) f10, i10, z11, false, false, z12, null, z10);
            }
            f11 = i11.p;
        }
        f10 = f11 * 100.0f;
        return H(bmbVar, xlbVar, sparseIntArray, str2, str, jm.get(f5, -1), (int) f10, i10, z11, false, false, z12, null, z10);
    }

    public static String I0() {
        xlb xlbVar = I.j0;
        return xlbVar != null ? xlbVar.c : e1() ? "t" : "d";
    }

    public static void I1(bmb bmbVar, boolean z10, int i10, View view) {
        int[] iArr = new int[2];
        if (view == null || !view.isAttachedToWindow()) {
            iArr[0] = gm.q.x / 2;
            iArr[1] = 0;
        } else {
            view.getLocationInWindow(iArr);
            iArr[0] = (view.getMeasuredWidth() / 2) + iArr[0];
            iArr[1] = (view.getMeasuredHeight() / 2) + iArr[1];
        }
        nm7.e().k(nm7.x4, bmbVar, Boolean.valueOf(z10), iArr, Integer.valueOf(i10), Boolean.TRUE, null);
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
            l3 = new m37(0, false, false, null);
            m3 = new m37(0, false, true, null);
            n3 = new m37(0, true, false, null);
            o3 = new m37(0, true, true, null);
            p3 = new m37(1, false, false, null);
            q3 = new m37(1, false, true, null);
            r3 = new m37(1, true, false, null);
            s3 = new m37(1, true, true, null);
            l08 l08Var = new l08();
            l08Var.a = new Path();
            l08Var.b = -1.0f;
            l08Var.g = new ArrayList();
            l08Var.c = 0.293f;
            l08Var.d = -26.0f;
            l08Var.e = -28.0f;
            l08Var.f = 1.0f;
            w3 = l08Var;
            l08Var.a("M 34.141 16.042 C 37.384 17.921 40.886 20.001 44.211 21.965 C 46.139 23.104 49.285 24.729 49.586 25.917 C 50.289 28.687 48.484 30 46.274 30 L 6 30.021 C 3.79 30.021 2.075 30.023 2 26.021 L 2.009 3.417 C 2.009 0.417 5.326 -0.58 7.068 0.417 C 10.545 2.406 25.024 10.761 34.141 16.042 Z", 166.0f);
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
            D3 = new ai7();
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
            int L10 = gm.L(2.0f);
            RectF rectF = new RectF();
            Path path = new Path();
            Path[] pathArr = Y4;
            pathArr[0] = path;
            f10 = 1.0f;
            path.moveTo(gm.L(7.0f), gm.L(3.0f));
            pathArr[0].lineTo(gm.L(14.0f), gm.L(3.0f));
            pathArr[0].lineTo(gm.L(21.0f), gm.L(10.0f));
            pathArr[0].lineTo(gm.L(21.0f), gm.L(20.0f));
            int i11 = L10 << 1;
            f11 = 14.0f;
            rectF.set(gm.L(21.0f) - i11, gm.L(19.0f) - L10, gm.L(21.0f), gm.L(19.0f) + L10);
            pathArr[0].arcTo(rectF, 0.0f, 90.0f, false);
            pathArr[0].lineTo(gm.L(6.0f), gm.L(21.0f));
            rectF.set(gm.L(5.0f), gm.L(19.0f) - L10, gm.L(5.0f) + i11, gm.L(19.0f) + L10);
            pathArr[0].arcTo(rectF, 90.0f, 90.0f, false);
            pathArr[0].lineTo(gm.L(5.0f), gm.L(4.0f));
            rectF.set(gm.L(5.0f), gm.L(3.0f), gm.L(5.0f) + i11, gm.L(3.0f) + i11);
            pathArr[0].arcTo(rectF, 180.0f, 90.0f, false);
            pathArr[0].close();
            Path path2 = new Path();
            pathArr[1] = path2;
            path2.moveTo(gm.L(14.0f), gm.L(5.0f));
            pathArr[1].lineTo(gm.L(19.0f), gm.L(10.0f));
            pathArr[1].lineTo(gm.L(14.0f), gm.L(10.0f));
            pathArr[1].close();
            a5 = resources.getDrawable(R.drawable.filled_fire).mutate();
            b5 = resources.getDrawable(R.drawable.msg_round_gif_m).mutate();
            Drawable[][] drawableArr6 = T4;
            drawableArr6[0][0] = M(gm.L(44.0f), R.drawable.msg_round_play_m);
            drawableArr6[0][1] = M(gm.L(44.0f), R.drawable.msg_round_play_m);
            drawableArr6[1][0] = M(gm.L(44.0f), R.drawable.msg_round_pause_m);
            drawableArr6[1][1] = M(gm.L(44.0f), R.drawable.msg_round_pause_m);
            drawableArr6[2][0] = M(gm.L(44.0f), R.drawable.msg_round_load_m);
            drawableArr6[2][1] = M(gm.L(44.0f), R.drawable.msg_round_load_m);
            drawableArr6[3][0] = M(gm.L(44.0f), R.drawable.msg_round_file_s);
            drawableArr6[3][1] = M(gm.L(44.0f), R.drawable.msg_round_file_s);
            drawableArr6[4][0] = M(gm.L(44.0f), R.drawable.msg_round_cancel_m);
            drawableArr6[4][1] = M(gm.L(44.0f), R.drawable.msg_round_cancel_m);
            sn2 M10 = M(gm.L(44.0f), R.drawable.msg_contact);
            Drawable[] drawableArr7 = S4;
            drawableArr7[0] = M10;
            drawableArr7[1] = M(gm.L(44.0f), R.drawable.msg_contact);
            Drawable mutate5 = resources.getDrawable(R.drawable.msg_location).mutate();
            Drawable[] drawableArr8 = R4;
            drawableArr8[0] = mutate5;
            drawableArr8[1] = resources.getDrawable(R.drawable.msg_location).mutate();
            h3 = b10.d(context, R.drawable.compose_panel_shadow);
            i3 = b10.d(context, R.drawable.sheet_shadow_round);
            wn9 wn9Var = new wn9(b10);
            Paint paint = new Paint(1);
            wn9Var.b = paint;
            paint.setShadowLayer(gm.L(4.0f), 0.0f, 0.0f, 1593835520);
            j3 = wn9Var;
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
        textPaint.setTextSize(gm.L(12.0f));
        C2.setTextSize(gm.L(12.0f));
        D2.setTextSize(gm.L(11.0f));
        F2.setTextSize(gm.L(15.0f));
        G2.setTextSize(gm.L(15.0f));
        H2.setTextSize(gm.L(13.0f));
        M2.setTextSize(gm.L(12.0f));
        E2.setTextSize(gm.L(12.0f));
        N2.setTextSize(gm.L(16.0f));
        O2.setTextSize(gm.L(15.0f));
        P2.setTextSize(gm.L(15.0f));
        Q2.setTextSize(gm.L(15.0f));
        R2.setTextSize(gm.L(13.0f));
        I2.setTextSize(gm.L(12.0f));
        V2.setTextSize(gm.L(r0));
        X2.setTextSize(gm.L(r0));
        Y2.setTextSize(gm.L(r0));
        float f12 = (((gda.S0 << 1) + 10) / 3.0f) - f10;
        c3.setTextSize(gm.L(f12));
        W2.setTextSize(gm.L(r0));
        T2.setTextSize(gm.L(f12));
        U2.setTextSize(gm.L(12.0f));
        S2.setTextSize(gm.L(12.0f));
        J2.setTextSize(gm.L(13.0f));
        K2.setTextSize(gm.L(13.0f));
        L2.setTextSize(gm.L(13.0f));
        W1.setStrokeWidth(gm.L(f10));
        Y1.setStrokeWidth(gm.L(1.1f));
        r2.setTextSize(gm.L(Math.max(16, gda.S0) - 2));
        s2.setTextSize(gm.L(Math.max(16, gda.S0) - 2));
        t2.setTextSize(gm.L(Math.max(16, gda.S0) - 3));
        u2.setTextSize(gm.L(Math.max(16, gda.S0)));
        e3.setTextSize(gm.L(15.0f));
        f3.setTextSize(gm.L(13.0f));
        j2.setStrokeWidth(gm.L(3.0f));
        k2.setStrokeWidth(gm.L(2.33f));
        d3.setTextSize(gm.L(f11));
        d3.setTypeface(gm.o());
    }

    public static fg0 J0(int i10, int i11, ylb ylbVar) {
        return i11 >= 0 ? new fg0(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i10}), new ColorDrawable(v0(i11, ylbVar)), new ColorDrawable(-1)) : f0(i10, 2, -1);
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

    public static fg0 K0(ylb ylbVar, boolean z10) {
        int v02 = v0(h6, ylbVar);
        return z10 ? J0(v02, c6, ylbVar) : f0(v02, 2, -1);
    }

    public static void K1(d dVar) {
        if (o != 0) {
            if (dVar != null) {
                try {
                    c41.b0(dVar).J(R.raw.auto_night_off, o == 3 ? jb6.M0(2131753750, "AutoNightSystemModeOff") : jb6.M0(2131753755, "AutoNightModeOff"), jb6.M0(2131745229, "Settings"), 5000, false, new sq8(dVar, (byte) 27)).j();
                } catch (Exception e10) {
                    fc4.g(e10, true);
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

    public static fg0 L0(boolean z10) {
        int w02 = w0(null, h6, false);
        return z10 ? J0(w02, c6, null) : f0(w02, 2, -1);
    }

    public static void L1(k47 k47Var) {
        n50 n50Var = c5;
        if (n50Var == null) {
            return;
        }
        if (n50Var.i == null || k47Var == null) {
            n50Var.i = null;
            return;
        }
        HashMap hashMap = d5;
        if (hashMap == null) {
            hashMap = new HashMap();
            d5 = hashMap;
        }
        hashMap.put(k47Var, c5);
        c5.d(false, null);
        gm.d3(new au1(k47Var, (byte) 3), 200L);
        c5 = null;
    }

    public static sn2 M(int i10, int i11) {
        Drawable d10 = i11 != 0 ? b10.d(a.b, i11) : null;
        OvalShape ovalShape = new OvalShape();
        float f10 = i10;
        ovalShape.resize(f10, f10);
        ShapeDrawable shapeDrawable = new ShapeDrawable(ovalShape);
        shapeDrawable.getPaint().setColor(-1);
        sn2 sn2Var = new sn2(shapeDrawable, d10);
        sn2Var.h = i10;
        sn2Var.n = i10;
        return sn2Var;
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

    public static fg0 N(int i10, int i11, int i12) {
        z.setColor(-1);
        return new fg0(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i10}), null, new nlb(i11, i12));
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
            TextPaint k10 = mlb.k(textPaint, 1);
            D2 = k10;
            TextPaint k11 = mlb.k(k10, 1);
            F2 = k11;
            k11.setTypeface(gm.o());
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
            H2 = mlb.k(textPaint2, 1);
            Paint paint3 = new Paint();
            T1 = paint3;
            paint3.setPathEffect(b66.c());
            Paint paint4 = new Paint();
            U1 = paint4;
            paint4.setPathEffect(b66.c());
            Paint paint5 = new Paint();
            V1 = paint5;
            paint5.setPathEffect(b66.c());
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
            O2 = mlb.k(textPaint4, 1);
            TextPaint textPaint5 = new TextPaint(1);
            P2 = textPaint5;
            TextPaint k12 = mlb.k(textPaint5, 1);
            Q2 = k12;
            R2 = mlb.k(k12, 1);
            I2 = new TextPaint(1);
            TextPaint textPaint6 = new TextPaint(1);
            J2 = textPaint6;
            K2 = mlb.k(textPaint6, 1);
            S2 = new TextPaint(1);
            T2 = new TextPaint(1);
            U2 = new TextPaint(1);
            TextPaint textPaint7 = new TextPaint(1);
            V2 = textPaint7;
            W2 = mlb.k(textPaint7, 1);
            TextPaint textPaint8 = new TextPaint(1);
            X2 = textPaint8;
            Y2 = mlb.k(textPaint8, 1);
            TextPaint textPaint9 = new TextPaint(1);
            c3 = textPaint9;
            b3 = mlb.k(textPaint9, 1);
            d3 = new TextPaint(1);
            TextPaint textPaint10 = new TextPaint(1);
            L2 = textPaint10;
            textPaint10.setTypeface(gm.o());
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
            TextPaint k13 = mlb.k(r2, 1);
            u2 = k13;
            k13.setTypeface(gm.o());
            Paint paint11 = new Paint(1);
            g2 = paint11;
            paint11.setColor(352321536);
            h2 = new Paint(1);
            TextPaint textPaint11 = new TextPaint(1);
            e3 = textPaint11;
            f3 = mlb.k(textPaint11, 1);
            i2 = new Paint();
            new Paint(1);
            l2 = new Paint(1);
            m2 = new Paint(1);
            d2 = new Paint(1);
            e2 = new Paint(7);
            f2 = new Paint(7);
            d(xd, d2, "paintChatMessageBackgroundSelected");
            Paint paint12 = e2;
            int i10 = bd;
            d(i10, paint12, "paintChatActionBackground");
            d(i10, g2, "paintChatActionBackgroundDarken");
            d(cd, f2, "paintChatActionBackgroundSelected");
            TextPaint textPaint12 = r2;
            int i11 = Yc;
            d(i11, textPaint12, "paintChatActionText");
            d(i11, s2, "paintChatActionText2");
            d(i11, t2, "paintChatActionText3");
            d(Dd, P2, "paintChatBotButton");
            d(Ie, i2, "paintChatComposeBackground");
            d(md, h2, "paintChatTimeBackground");
        }
    }

    public static bmb O0(String str) {
        return (bmb) H.get(str);
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
                textPaint.setTypeface(gm.o());
                TextPaint textPaint2 = new TextPaint(1);
                V2 = textPaint2;
                textPaint2.setTypeface(gm.o());
                TextPaint textPaint3 = new TextPaint(1);
                X2 = textPaint3;
                textPaint3.setTypeface(gm.o());
                Y2 = new TextPaint(1);
                Z2 = new TextPaint(1);
                a3 = new TextPaint(1);
                b3 = new TextPaint(1);
                TextPaint textPaint4 = new TextPaint(1);
                c3 = textPaint4;
                textPaint4.setTypeface(gm.o());
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
                    x2[i10].setTextSize(gm.L(fArr[i10] * 120.0f));
                    i10++;
                } else {
                    y2.setTextSize(gm.L(46.0f));
                    z2.setTextSize(gm.L(38.0f));
                    A2.setTextSize(gm.L(30.0f));
                    n2.setTextSize(gm.L(gda.S0));
                    w2.setTextSize(gm.L(14.0f));
                    v2.setTextSize(gm.L(15.0f));
                    V2.setTextSize(gm.L(r1));
                    X2.setTextSize(gm.L(r1));
                    Y2.setTextSize(gm.L(r1));
                    float f10 = (((gda.S0 << 1) + 10) / 3.0f) - 1.0f;
                    Z2.setTextSize(gm.L(f10));
                    a3.setTextSize(gm.L(r1));
                    U2.setTextSize(gm.L(12.0f));
                    c3.setTextSize(gm.L(f10));
                    b3.setTextSize(gm.L(r1 - 2.0f));
                    W2.setTextSize(gm.L(r1));
                    T2.setTextSize(gm.L(f10));
                    o2.setTextSize(gm.L(Math.max(Math.min(10, gda.S0 - 1), gda.S0 - 2)));
                    p2.setTextSize(gm.L(Math.max(Math.min(10, gda.S0 - 2), gda.S0 - 3)));
                    q2.setTextSize(gm.L(Math.max(Math.min(10, gda.S0 - 2), gda.S0 - 5)));
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
            n0.setStrokeWidth(gm.L(2.0f));
            n0.setStrokeCap(Paint.Cap.ROUND);
            Paint paint4 = new Paint(1);
            m0 = paint4;
            paint4.setColor(0);
            m0.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            o0 = new Paint(1);
            Paint paint5 = new Paint();
            l0 = paint5;
            paint5.setPathEffect(b66.c());
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
            p09 p09Var = t1;
            if (p09Var != null) {
                p09Var.setCallback(null);
                t1.x(false);
            }
            p09 p09Var2 = u1;
            if (p09Var2 != null) {
                p09Var2.x(false);
            }
            p09 p09Var3 = v1;
            if (p09Var3 != null) {
                p09Var3.x(false);
            }
            p09 p09Var4 = w1;
            if (p09Var4 != null) {
                p09Var4.x(false);
            }
            p09 p09Var5 = x1;
            if (p09Var5 != null) {
                p09Var5.x(false);
            }
            p09 p09Var6 = y1;
            if (p09Var6 != null) {
                p09Var6.x(false);
            }
            t1 = new p09(R.raw.chats_archiveavatar, gm.L(36.0f), gm.L(36.0f), false, null);
            u1 = new p09(R.raw.chats_archive, gm.L(36.0f), gm.L(36.0f), false, null);
            v1 = new p09(R.raw.chats_unarchive, gm.L(36.0f), gm.L(36.0f), false, null);
            w1 = new p09(R.raw.chats_hide, gm.L(36.0f), gm.L(36.0f), false, null);
            x1 = new p09(R.raw.chats_unhide, gm.L(36.0f), gm.L(36.0f), false, null);
            y1 = new p09(R.raw.chat_audio_record_delete, gm.L(30.0f), gm.L(30.0f), false, null);
            G1 = new p09(R.raw.swipe_mute, gm.L(36.0f), gm.L(36.0f), false, null);
            H1 = new p09(R.raw.swipe_unmute, gm.L(36.0f), gm.L(36.0f), false, null);
            K1 = new p09(R.raw.swipe_read, gm.L(36.0f), gm.L(36.0f), false, null);
            L1 = new p09(R.raw.swipe_unread, gm.L(36.0f), gm.L(36.0f), false, null);
            I1 = new p09(R.raw.swipe_delete, gm.L(36.0f), gm.L(36.0f), false, null);
            N1 = new p09(R.raw.swipe_unpin, gm.L(36.0f), gm.L(36.0f), false, null);
            M1 = new p09(R.raw.swipe_pin, gm.L(36.0f), gm.L(36.0f), false, null);
            J1 = new p09(R.raw.swipe_community_ungroup, gm.L(28.0f), gm.L(28.0f), false, null);
            k();
        }
    }

    public static Drawable Q0(String str, ylb ylbVar) {
        Drawable drawable = ylbVar != null ? ylbVar.getDrawable(str) : null;
        return drawable != null ? drawable : (Drawable) cm.get(str);
    }

    public static ah7 R(int i10, int i11) {
        int i12;
        int i13;
        ah7 ah7Var = new ah7(-2368069, -9722489, -2762611, -7817084, i10 != 0, false);
        if (i10 <= 0 || i11 <= 0) {
            Point point = gm.q;
            int min = Math.min(point.x, point.y);
            int max = Math.max(point.x, point.y);
            osc c10 = btc.c();
            r1 = c10 != null ? c10.a : null;
            i12 = max;
            i13 = min;
        } else {
            i13 = i10;
            i12 = i11;
        }
        if (r1 == null) {
            r1 = neb.c(1.0f, R.raw.default_pattern, i13, i12, -16777216, 2);
        }
        ah7Var.r(34, r1);
        ah7Var.s(ah7Var.f());
        return ah7Var;
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
                                    int d10 = nxe.d(substring);
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
                        fc4.g(th, true);
                        if (fileInputStream2 != null) {
                            try {
                                fileInputStream2.close();
                            } catch (Exception e10) {
                                e = e10;
                                fc4.g(e, z10);
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
            fc4.g(e, z10);
            return sparseIntArray;
        }
        return sparseIntArray;
    }

    public static void S(Context context) {
        Q(context);
        if (K0 == null) {
            TextPaint textPaint = new TextPaint(1);
            K0 = textPaint;
            TextPaint k10 = mlb.k(textPaint, 1);
            L0 = k10;
            k10.setTypeface(gm.o());
            v0 = new Paint(1);
            s0 = new Paint(1);
            z0 = new Paint(1);
        }
        K0.setTextSize(gm.L(12.0f));
        L0.setTextSize(gm.L(13.0f));
        if (A0 == null) {
            Resources resources = context.getResources();
            A0 = new TextPaint[2];
            B0 = new TextPaint[2];
            E0 = new TextPaint[2];
            G0 = new TextPaint[2];
            for (int i10 = 0; i10 < 2; i10++) {
                A0[i10] = new TextPaint(1);
                A0[i10].setTypeface(gm.o());
                B0[i10] = new TextPaint(1);
                B0[i10].setTypeface(gm.o());
                E0[i10] = new TextPaint(1);
                G0[i10] = new TextPaint(1);
            }
            TextPaint textPaint2 = new TextPaint(1);
            C0 = textPaint2;
            TextPaint k11 = mlb.k(textPaint2, 1);
            D0 = k11;
            TextPaint k12 = mlb.k(k11, 1);
            F0 = k12;
            H0 = mlb.k(k12, 1);
            I0 = new TextPaint(1);
            J0 = new TextPaint(1);
            TextPaint textPaint3 = new TextPaint(1);
            M0 = textPaint3;
            TextPaint k13 = mlb.k(textPaint3, 1);
            N0 = k13;
            O0 = mlb.k(k13, 1);
            P0 = new TextPaint(1);
            TextPaint textPaint4 = new TextPaint(1);
            Q0 = textPaint4;
            textPaint4.setTypeface(gm.o());
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
            W0 = new ai7();
            X0 = resources.getDrawable(R.drawable.list_warning_sign);
            Y0 = resources.getDrawable(R.drawable.list_reorder).mutate();
            b1 = resources.getDrawable(R.drawable.list_mute).mutate();
            c1 = resources.getDrawable(R.drawable.list_unmute).mutate();
            d1 = resources.getDrawable(R.drawable.mini_ephemeral_hidden_16).mutate();
            e1 = resources.getDrawable(R.drawable.verified_area).mutate();
            f1 = new hs9(0);
            g1 = new hs9(1);
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
            float L10 = gm.L(12.0f);
            float L11 = gm.L(12.0f);
            rectF.set(L10 - gm.L(5.0f), L11 - gm.L(5.0f), gm.L(5.0f) + L10, gm.L(5.0f) + L11);
            pathArr[2].arcTo(rectF, -160.0f, -110.0f, true);
            pathArr[2].arcTo(rectF, 20.0f, -110.0f, true);
            pathArr[0].moveTo(L10, gm.L(8.0f) + L11);
            pathArr[0].lineTo(L10, gm.L(2.0f) + L11);
            pathArr[0].lineTo(gm.L(3.0f) + L10, gm.L(5.0f) + L11);
            pathArr[0].close();
            pathArr[0].moveTo(L10, L11 - gm.L(8.0f));
            pathArr[0].lineTo(L10, L11 - gm.L(2.0f));
            pathArr[0].lineTo(L10 - gm.L(3.0f), L11 - gm.L(5.0f));
            pathArr[0].close();
            n();
        }
        F0.setTextSize(gm.L(14.0f));
        H0.setTextSize(gm.L(12.0f));
        I0.setTextSize(gm.L(12.0f));
        I0.setTypeface(gm.o());
        J0.setTextSize(gm.L(12.0f));
        J0.setTypeface(gm.o());
        M0.setTextSize(gm.L(13.0f));
        N0.setTextSize(gm.L(11.0f));
        O0.setTextSize(gm.L(15.0f));
        P0.setTextSize(gm.L(15.0f));
        Q0.setTextSize(gm.L(10.0f));
        C0.setTextSize(gm.L(16.0f));
        D0.setTextSize(gm.L(16.0f));
    }

    public static float S0(float f10) {
        return (f10 >= 0.0f || I.o()) ? f10 : -f10;
    }

    public static qlb T(Context context) {
        return U(context, w0(null, t5, false), w0(null, u5, false));
    }

    public static Paint T0(String str) {
        return Objects.equals(str, "paintDivider") ? j0 : (Paint) em.get(str);
    }

    public static qlb U(Context context, int i10, int i11) {
        Resources resources = context.getResources();
        Drawable mutate = resources.getDrawable(R.drawable.search_dark).mutate();
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(i10, mode));
        Drawable mutate2 = resources.getDrawable(R.drawable.search_dark_activated).mutate();
        mutate2.setColorFilter(new PorterDuffColorFilter(i11, mode));
        qlb qlbVar = new qlb();
        qlbVar.addState(new int[]{android.R.attr.state_enabled, android.R.attr.state_focused}, mutate2);
        qlbVar.addState(new int[]{android.R.attr.state_focused}, mutate2);
        qlbVar.addState(StateSet.WILD_CARD, mutate);
        return qlbVar;
    }

    public static Paint U0(String str, ylb ylbVar) {
        Paint d10;
        return (ylbVar == null || (d10 = ylbVar.d(str)) == null) ? T0(str) : d10;
    }

    public static qlb V(Context context, int i10, int i11, int i12) {
        Resources resources = context.getResources();
        Drawable mutate = resources.getDrawable(i10).mutate();
        if (i11 != 0) {
            mutate.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.MULTIPLY));
        }
        Drawable mutate2 = resources.getDrawable(i10).mutate();
        if (i12 != 0) {
            mutate2.setColorFilter(new PorterDuffColorFilter(i12, PorterDuff.Mode.MULTIPLY));
        }
        qlb qlbVar = new qlb();
        qlbVar.setEnterFadeDuration(1);
        qlbVar.setExitFadeDuration(nm7.d3);
        qlbVar.addState(new int[]{android.R.attr.state_selected}, mutate2);
        qlbVar.addState(new int[0], mutate);
        return qlbVar;
    }

    public static Drawable V0(Context context, int i10, int i11) {
        if (context == null) {
            return null;
        }
        Drawable d10 = b10.d(context, i10);
        d10.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.MULTIPLY));
        return d10;
    }

    public static fg0 W(float f10, int i10, int i11, int i12, int i13, int i14) {
        z.setColor(-1);
        return new fg0(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i10}), null, new tlb(i11, i12, i13, i14, f10));
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
        O1.setTextSize(gm.L(16.0f));
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
        osc oscVar = null;
        if (i11 != 0) {
            int i12 = km.get(Ee);
            int i13 = km.get(Fe);
            int i14 = km.get(Ge);
            km.get(He, -1);
            amb i15 = I.i(false);
            if (i15 != null && !TextUtils.isEmpty(i15.o) && M == null) {
                oscVar = btc.d(i15.o);
            }
            if (i12 == 0 && oscVar == null) {
                return new ColorDrawable(i11);
            }
            ah7 ah7Var = new ah7(i11, i12, i13, i14, true, false);
            if (oscVar != null) {
                ah7Var.r((int) (i15.p * 100.0f), oscVar.a);
                ah7Var.s(ah7Var.f());
            }
            return ah7Var;
        }
        if (f0 > 0) {
            bmb bmbVar = I;
            if (bmbVar.b != null || bmbVar.d != null) {
                String str = bmbVar.d;
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
                                    int L10 = gm.L(100.0f);
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
                                        fc4.g(e10, true);
                                        return bitmapDrawable;
                                    }
                                } catch (Throwable th3) {
                                    fileInputStream = fileInputStream2;
                                    th2 = th3;
                                    try {
                                        fc4.g(th2, true);
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
                        fc4.g(e11, true);
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

    public static fg0 Y(int i10, int i11, int i12) {
        z.setColor(-1);
        return new fg0(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i10}), null, new zlb(i11, i12));
    }

    public static int Y0(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return i10 | (-16777216);
    }

    public static fg0 Z(int i10, int i11, int i12, int i13) {
        z.setColor(-1);
        float f10 = i12;
        float f11 = i13;
        return new fg0(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i11}), c0(gm.L(f10), gm.L(f11), i10), new zlb(f10, f11));
    }

    public static String Z0(xlb xlbVar) {
        String str;
        if (xlbVar == null || TextUtils.isEmpty(xlbVar.c) || xlbVar.c.equals("d")) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        if (xlbVar.i) {
            sb2.append("blur");
        }
        if (xlbVar.j) {
            if (sb2.length() > 0) {
                sb2.append("+");
            }
            sb2.append("motion");
        }
        int i10 = xlbVar.d;
        if (i10 == 0) {
            str = "https://attheme.org?slug=" + xlbVar.c;
        } else {
            String lowerCase = String.format("%02x%02x%02x", Integer.valueOf(((byte) (i10 >> 16)) & 255), Integer.valueOf(((byte) (xlbVar.d >> 8)) & 255), Byte.valueOf((byte) (xlbVar.d & nm7.d4))).toLowerCase();
            int i11 = xlbVar.e;
            String lowerCase2 = i11 != 0 ? String.format("%02x%02x%02x", Integer.valueOf(((byte) (i11 >> 16)) & 255), Integer.valueOf(((byte) (xlbVar.e >> 8)) & 255), Byte.valueOf((byte) (xlbVar.e & nm7.d4))).toLowerCase() : null;
            int i12 = xlbVar.f;
            String lowerCase3 = i12 != 0 ? String.format("%02x%02x%02x", Integer.valueOf(((byte) (i12 >> 16)) & 255), Integer.valueOf(((byte) (xlbVar.f >> 8)) & 255), Byte.valueOf((byte) (xlbVar.f & nm7.d4))).toLowerCase() : null;
            int i13 = xlbVar.g;
            String lowerCase4 = i13 != 0 ? String.format("%02x%02x%02x", Integer.valueOf(((byte) (i13 >> 16)) & 255), Integer.valueOf(((byte) (xlbVar.g >> 8)) & 255), Byte.valueOf((byte) (xlbVar.g & nm7.d4))).toLowerCase() : null;
            if (lowerCase2 != null) {
                if (lowerCase3 == null) {
                    StringBuilder k10 = b10.k(td4.q(lowerCase, "-", lowerCase2), "&rotation=");
                    k10.append(xlbVar.h);
                    lowerCase = k10.toString();
                } else if (lowerCase4 != null) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(lowerCase);
                    sb3.append("~");
                    sb3.append(lowerCase2);
                    sb3.append("~");
                    sb3.append(lowerCase3);
                    lowerCase = b10.j(sb3, "~", lowerCase4);
                } else {
                    lowerCase = lowerCase + "~" + lowerCase2 + "~" + lowerCase3;
                }
            }
            str = "https://attheme.org?slug=" + xlbVar.c + "&intensity=" + ((int) (xlbVar.k * 100.0f)) + "&bg_color=" + lowerCase;
        }
        if (sb2.length() <= 0) {
            return str;
        }
        StringBuilder k11 = b10.k(str, "&mode=");
        k11.append(sb2.toString());
        return k11.toString();
    }

    public static int a(float f10, float f11, int i10) {
        float[] N02 = N0(5);
        Color.colorToHSV(i10, N02);
        float f12 = N02[1];
        if (f12 > 0.1f && f12 < 0.9f) {
            N02[1] = pqe.a(f12 + f10, 0.0f, 1.0f);
        }
        N02[2] = pqe.a(N02[2] + f11, 0.0f, 1.0f);
        return Color.HSVToColor(Color.alpha(i10), N02);
    }

    public static fg0 a0(int i10, int i11, int i12, int i13, int i14) {
        z.setColor(-1);
        zlb zlbVar = new zlb();
        zlbVar.a = new Path();
        zlbVar.b = new float[]{r5, r5, r5, r5, r5, r5, r5, r5};
        zlbVar.c = true;
        float L10 = gm.L(i11);
        float L11 = gm.L(i12);
        float L12 = gm.L(i13);
        float L13 = gm.L(i14);
        return new fg0(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i10}), null, zlbVar);
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
        N02[1] = gm.R1(N02[1], f11, 0.25f);
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
        shapeDrawable.getPaint().setShadowLayer(gm.N(2.0f), 0.0f, gm.N(0.33f), p1(Color.alpha(i11) / 255.0f, 285212672));
        return new InsetDrawable((Drawable) shapeDrawable, gm.L(3.0f), gm.L(3.0f), gm.L(3.0f), gm.L(3.0f));
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

    public static fg0 e0(int i10, int i11) {
        return f0(i10, i11, -1);
    }

    public static boolean e1() {
        bmb bmbVar = I;
        if (bmbVar.T && bmbVar.Z == n) {
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
    public static fg0 f0(int i10, int i11, int i12) {
        Drawable drawable;
        if (i11 != 1 && i11 != 5) {
            if (i11 == 1 || i11 == 3 || i11 == 4 || i11 == 5 || i11 == 6 || i11 == 7) {
                z.setColor(-1);
                drawable = new rlb(i11, i12);
            } else if (i11 == 2) {
                drawable = new ColorDrawable(-1);
            }
            fg0 fg0Var = new fg0(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i10}), null, drawable);
            if (i11 == 1) {
                if (i11 == 5) {
                    fg0Var.setRadius(-1);
                }
                return fg0Var;
            }
            if (i12 <= 0) {
                i12 = gm.L(20.0f);
            }
            fg0Var.setRadius(i12);
            return fg0Var;
        }
        drawable = null;
        fg0 fg0Var2 = new fg0(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i10}), null, drawable);
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
        boolean z10 = (drawable instanceof ah7) && gda.o() != 0 && i10 == 0;
        if (z10 && X != (bitmap = ((ah7) drawable).k)) {
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
            gm.i(colorMatrix, 2.5f);
            gm.l2(colorMatrix, 0.75f);
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

    public static fg0 g0(int i10, int i11) {
        return new fg0(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i11}), new ColorDrawable(i10), new ColorDrawable(i10));
    }

    public static boolean g1(ylb ylbVar) {
        return ylbVar != null ? ylbVar.e() : gda.D0;
    }

    public static void h() {
        Drawable drawable = d0;
        if (drawable != null) {
            i(drawable);
        }
    }

    public static fg0 h0(int i10, int i11, int i12) {
        OvalShape ovalShape = new OvalShape();
        float f10 = i10;
        ovalShape.resize(f10, f10);
        ShapeDrawable shapeDrawable = new ShapeDrawable(ovalShape);
        shapeDrawable.getPaint().setColor(i11);
        ShapeDrawable shapeDrawable2 = new ShapeDrawable(ovalShape);
        shapeDrawable2.getPaint().setColor(-1);
        return new fg0(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i12}), shapeDrawable, shapeDrawable2);
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
        boolean z11 = gda.D0;
        int i13 = bd;
        if (z11) {
            int w02 = w0(null, ta, false);
            int w03 = w0(null, Da, false);
            valueAt = on2.l(w03, w02);
            valueAt2 = on2.l(on2.p(w03, Math.min(nm7.d4, Color.alpha(w03) << 1)), w02);
            W = valueAt;
            a0 = valueAt2;
        } else {
            int indexOfKey = km.indexOfKey(i13);
            valueAt = indexOfKey >= 0 ? km.valueAt(indexOfKey) : W;
            int indexOfKey2 = km.indexOfKey(cd);
            valueAt2 = indexOfKey2 >= 0 ? km.valueAt(indexOfKey2) : a0;
        }
        if (z11 || !((((z10 = drawable instanceof ah7)) || (drawable instanceof BitmapDrawable)) && gda.o() != 0 && e86.e(32))) {
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
                bitmap = ((ah7) drawable).k;
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
                            gm.l2(colorMatrix, 0.94f);
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
        if (Y == null || !(km.indexOfKey(i13) < 0 || (drawable instanceof ah7) || (drawable instanceof BitmapDrawable))) {
            e2.setColorFilter(null);
            e2.setShader(null);
            f2.setColorFilter(null);
            f2.setShader(null);
            g2.setAlpha(z11 ? 0 : 21);
            return;
        }
        ColorMatrix colorMatrix2 = new ColorMatrix();
        if (drawable instanceof ah7) {
            if (((ah7) drawable).q >= 0.0f) {
                colorMatrix2.setSaturation(1.6f);
                gm.l2(colorMatrix2, I.o() ? 0.97f : 0.92f);
                gm.h(colorMatrix2, I.o() ? 0.12f : -0.06f);
            } else {
                colorMatrix2.setSaturation(1.1f);
                gm.l2(colorMatrix2, I.o() ? 0.4f : 0.8f);
                gm.h(colorMatrix2, I.o() ? 0.08f : -0.06f);
            }
        } else {
            colorMatrix2.setSaturation(1.6f);
            gm.l2(colorMatrix2, I.o() ? 0.9f : 0.84f);
            gm.h(colorMatrix2, I.o() ? -0.04f : 0.06f);
        }
        e2.setFilterBitmap(true);
        e2.setShader(Y);
        e2.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
        e2.setAlpha(nm7.d4);
        f2.setFilterBitmap(true);
        f2.setShader(Y);
        ColorMatrix colorMatrix3 = new ColorMatrix(colorMatrix2);
        gm.i(colorMatrix3, 0.26f);
        h1();
        gm.l2(colorMatrix3, 0.92f);
        f2.setColorFilter(new ColorMatrixColorFilter(colorMatrix3));
        f2.setAlpha(nm7.d4);
        g2.setAlpha(0);
    }

    public static fg0 i0(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
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
        return new fg0(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i15}), shapeDrawable, shapeDrawable2);
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
        m37 m37Var = l3;
        int i13 = qa;
        B1(i13, m37Var);
        m37 m37Var2 = m3;
        int i14 = Tc;
        B1(i14, m37Var2);
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
            e0b[] e0bVarArr = t3;
            if (i32 >= e0bVarArr.length) {
                break;
            }
            B1(o9, e0bVarArr[i32]);
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
            if (!gda.D0 || b) {
                return;
            }
            h();
        } else {
            h();
            g(d0);
        }
    }

    public static boolean j0(bmb bmbVar, amb ambVar, boolean z10) {
        boolean z11 = false;
        if (ambVar == null || bmbVar == null || bmbVar.c0 == null) {
            return false;
        }
        int i10 = ambVar.a;
        boolean z12 = i10 == bmbVar.Z;
        bmbVar.b0.remove(i10);
        bmbVar.c0.remove(ambVar);
        TLRPC.TL_theme tL_theme = ambVar.r;
        if (tL_theme != null) {
            bmbVar.d0.remove(tL_theme.id);
        }
        xlb xlbVar = ambVar.y;
        if (xlbVar != null) {
            xlbVar.a();
        }
        if (z12) {
            bmbVar.u(((amb) bmbVar.c0.get(0)).a);
        }
        if (z10) {
            x1(bmbVar, true, false, false, false, false);
            if (ambVar.r != null) {
                oc7 r12 = oc7.r1(ambVar.t);
                if (z12 && bmbVar == J) {
                    z11 = true;
                }
                r12.C4(bmbVar, ambVar, z11, true);
            }
        }
        return z12;
    }

    public static boolean j1(amb ambVar) {
        bmb bmbVar = ambVar.b;
        if (bmbVar == null) {
            return false;
        }
        if (bmbVar.k().equals("Blue") && ambVar.a == 99) {
            return true;
        }
        if (ambVar.b.k().equals("Day") && ambVar.a == 9) {
            return true;
        }
        return (ambVar.b.k().equals("Night") || ambVar.b.k().equals("Dark Blue")) && ambVar.a == 0;
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
                p09 p09Var = t1;
                p09Var.a0 = true;
                int i12 = L7;
                p09Var.L(w0(null, i12, true), "Arrow1");
                t1.L(w0(null, i12, true), "Arrow2");
                t1.L(w0(null, i11, true), "Box2");
                t1.L(w0(null, i11, true), "Box1");
                t1.j();
                B1 = false;
                t1.E(true);
                p09 p09Var2 = w1;
                p09Var2.a0 = true;
                int i13 = d9;
                p09Var2.L(w0(null, i13, true), "Arrow");
                w1.L(w0(null, i13, true), "Line");
                w1.j();
                p09 p09Var3 = x1;
                p09Var3.a0 = true;
                p09Var3.L(w0(null, i13, true), "Arrow");
                x1.L(w0(null, i13, true), "Line");
                x1.j();
                p09 p09Var4 = y1;
                p09Var4.a0 = true;
                int i14 = b9;
                p09Var4.L(w0(null, i14, true), "Line 1");
                y1.L(w0(null, i14, true), "Line 2");
                y1.L(w0(null, i14, true), "Line 3");
                y1.L(w0(null, i13, true), "Cup Red");
                y1.L(w0(null, i13, true), "Box");
                y1.j();
                A1 = false;
                p09 p09Var5 = u1;
                p09Var5.a0 = true;
                p09Var5.L(w0(null, i14, true), "Arrow");
                u1.L(w0(null, i13, true), "Box2");
                u1.L(w0(null, i13, true), "Box1");
                u1.j();
                z1 = false;
                p09 p09Var6 = v1;
                p09Var6.a0 = true;
                p09Var6.L(w0(null, i13, true), "Arrow1");
                v1.L(w0(null, c9, true), "Arrow2");
                v1.L(w0(null, i13, true), "Box2");
                v1.L(w0(null, i13, true), "Box1");
                v1.j();
                int w02 = w0(null, F6, false);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                u3 = new PorterDuffColorFilter(w02, mode);
                v3 = new PorterDuffColorFilter(w0(null, Vc, false), mode);
                oj8.d().b();
                return;
            }
            B1(i11, drawableArr[i10]);
            i10++;
        }
    }

    public static bmb k0(File file, String str, TLRPC.TL_theme tL_theme) {
        String[] split;
        try {
            bmb bmbVar = new bmb();
            bmbVar.a = str;
            bmbVar.G = tL_theme;
            bmbVar.b = file.getAbsolutePath();
            bmbVar.F = z8c.t0;
            String[] strArr = new String[1];
            G(R0(new File(bmbVar.b), null, strArr), bmbVar);
            if (TextUtils.isEmpty(strArr[0])) {
                g0 = null;
                return bmbVar;
            }
            String str2 = strArr[0];
            bmbVar.c = usc.d(str2).getAbsolutePath();
            try {
                Uri parse = Uri.parse(str2);
                bmbVar.e = parse.getQueryParameter("slug");
                String queryParameter = parse.getQueryParameter("mode");
                if (queryParameter != null && (split = queryParameter.toLowerCase().split(" ")) != null && split.length > 0) {
                    for (int i10 = 0; i10 < split.length; i10++) {
                        if ("blur".equals(split[i10])) {
                            bmbVar.h = true;
                        } else if ("motion".equals(split[i10])) {
                            bmbVar.n = true;
                        }
                    }
                }
                String queryParameter2 = parse.getQueryParameter("intensity");
                if (!TextUtils.isEmpty(queryParameter2)) {
                    try {
                        String queryParameter3 = parse.getQueryParameter("bg_color");
                        if (!TextUtils.isEmpty(queryParameter3)) {
                            bmbVar.r = Integer.parseInt(queryParameter3.substring(0, 6), 16) | (-16777216);
                            if (queryParameter3.length() >= 13 && gm.Q1(queryParameter3.charAt(6))) {
                                bmbVar.s = Integer.parseInt(queryParameter3.substring(7, 13), 16) | (-16777216);
                            }
                            if (queryParameter3.length() >= 20 && gm.Q1(queryParameter3.charAt(13))) {
                                bmbVar.w = Integer.parseInt(queryParameter3.substring(14, 20), 16) | (-16777216);
                            }
                            if (queryParameter3.length() == 27 && gm.Q1(queryParameter3.charAt(20))) {
                                bmbVar.x = Integer.parseInt(queryParameter3.substring(21), 16) | (-16777216);
                            }
                        }
                    } catch (Exception unused) {
                    }
                    try {
                        String queryParameter4 = parse.getQueryParameter("rotation");
                        if (!TextUtils.isEmpty(queryParameter4)) {
                            bmbVar.y = Utilities.z(queryParameter4).intValue();
                        }
                    } catch (Exception unused2) {
                    }
                    if (!TextUtils.isEmpty(queryParameter2)) {
                        bmbVar.E = Utilities.z(queryParameter2).intValue();
                    }
                    if (bmbVar.E == 0) {
                        bmbVar.E = 50;
                    }
                }
            } catch (Throwable th2) {
                fc4.g(th2, true);
            }
            return bmbVar;
        } catch (Exception e10) {
            fc4.g(e10, true);
            return null;
        }
    }

    public static void k1(int i10, boolean z10) {
        boolean[] zArr = C;
        if (zArr[i10]) {
            return;
        }
        if ((z10 || Math.abs((System.currentTimeMillis() / 1000) - D[i10]) >= 3600) && z8c.h(i10).o()) {
            zArr[i10] = true;
            TL_account.getThemes getthemes = new TL_account.getThemes();
            getthemes.format = "android";
            if (!hs6.d0(i10).B0.isEmpty()) {
                getthemes.hash = E[i10];
            }
            if (e21.a) {
                Log.i("theme", "loading remote themes, hash " + getthemes.hash);
            }
            ConnectionsManager.getInstance(i10).sendRequest(getthemes, new dx0(i10, (byte) 3));
        }
    }

    public static void l(boolean z10) {
        bmb bmbVar;
        if (M == null) {
            if (z10) {
                bmb bmbVar2 = I;
                bmb bmbVar3 = J;
                if (bmbVar2 != bmbVar3) {
                    if (bmbVar2 == null || !(bmbVar3 == null || bmbVar2.o() == J.o())) {
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
            bmb bmbVar4 = K;
            if (bmbVar4 != null && bmbVar4.o() && o != 0 && (bmbVar = L) != null) {
                bmbVar4 = bmbVar;
            }
            bmb bmbVar5 = I;
            if (bmbVar5 != bmbVar4) {
                if (bmbVar5 == null || !(bmbVar4 == null || bmbVar5.o() == bmbVar4.o())) {
                    R = false;
                    i = SystemClock.elapsedRealtime();
                    Q = true;
                    I1(bmbVar4, true, -1, null);
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
            Point point = gm.q;
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
                fc4.g(th2, true);
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
        paint.setShadowLayer(gm.N(1.0f), 0.0f, gm.N(0.33f), a);
    }

    public static Bitmap m0(String str, TLRPC.Document document, boolean z10) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        mi5 c10 = mi5.c(str);
        osc d10 = btc.d(str);
        byte b10 = 1;
        if (d10 == null && document != null) {
            bc4.G(z8c.t0);
            File J10 = bc4.J(document, null, true, true);
            if (J10.exists()) {
                d10 = btc.e(c10, new d6b(J10, (byte) 2));
            }
        }
        if (d10 != null) {
            return d10.a;
        }
        int i10 = z8c.t0;
        llb llbVar = new llb(z10, str, b10);
        np3 np3Var = zsc.e;
        gm.c3(new bnc(i10, str, llbVar));
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
        bmb bmbVar = I;
        boolean z12 = bmbVar.T && bmbVar.Z == n;
        amb i10 = bmbVar.i(false);
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
        bmb bmbVar2 = I;
        xlb xlbVar = bmbVar2.j0;
        if (xlbVar != null) {
            f11 = xlbVar.k;
        } else {
            if (i10 == null) {
                f10 = bmbVar2.E;
                int i11 = (int) f10;
                if (!z10) {
                    mp3 mp3Var = Utilities.i;
                    fr6 fr6Var = new fr6(xlbVar, str, i11, z11, document, z12);
                    d = fr6Var;
                    mp3Var.c(fr6Var);
                    return;
                }
                Drawable n12 = n1(xlbVar, str, i11, z11, document, z12);
                O();
                if (!b) {
                    i(n12);
                    g(n12);
                }
                nm7.e().k(nm7.D4, new Object[0]);
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
                hs9 hs9Var = f1;
                int i23 = i9;
                B1(i23, hs9Var);
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

    public static ColorFilter n0(ylb ylbVar) {
        return ylbVar != null ? ylbVar.c() : u3;
    }

    public static Drawable n1(xlb xlbVar, String str, int i10, boolean z10, TLRPC.Document document, boolean z11) {
        sm2 H10 = H(I, xlbVar, km, str, g0, f0, i10, S, z11, O, P, z10, document, false);
        Boolean bool = (Boolean) H10.d;
        h0 = bool != null ? bool.booleanValue() : h0;
        Boolean bool2 = (Boolean) H10.e;
        i0 = bool2 != null ? bool2.booleanValue() : i0;
        Boolean bool3 = (Boolean) H10.f;
        V = bool3 != null ? bool3.booleanValue() : V;
        Drawable drawable = (Drawable) H10.b;
        d0 = drawable != null ? drawable : d0;
        int[] q10 = gm.q(drawable);
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
        bmb bmbVar;
        bmb bmbVar2 = M;
        if (bmbVar2 == null) {
            return;
        }
        O = false;
        if (R && (bmbVar = J) != null) {
            t(bmbVar, true, true);
        } else if (!P) {
            t(bmbVar2, true, false);
        }
        P = false;
        M = null;
        E(false);
    }

    public static n50 o0(k47 k47Var) {
        HashMap hashMap = d5;
        if (hashMap == null || k47Var == null) {
            return null;
        }
        return (n50) hashMap.get(k47Var);
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
            fc4.g(e10, true);
            j10 = 0;
        }
        if (!file.exists() || (j10 != 0 && file.length() != j10)) {
            try {
                InputStream open2 = a.b.getAssets().open(str);
                try {
                    Typeface typeface = gm.a;
                    gm.D(open2, new FileOutputStream(file));
                    open2.close();
                } finally {
                }
            } catch (Exception e11) {
                fc4.g(e11, true);
            }
        }
        return file;
    }

    public static int p1(float f10, int i10) {
        return f10 == 1.0f ? i10 : on2.p(i10, pqe.b((int) (Color.alpha(i10) * f10), 0, nm7.d4));
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
        olb olbVar;
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
            if (!g && sensor != null && (olbVar = xm) != null) {
                e.registerListener(olbVar, sensor, 500000);
                g = true;
                if (e21.a) {
                    fc4.b("light sensor registered");
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
        Utilities.i.c(new go3(countDownLatch, (byte) 1));
        try {
            countDownLatch.await();
        } catch (Exception e10) {
            fc4.g(e10, true);
        }
        return s0();
    }

    public static void r1(boolean z10, boolean z11) {
        SparseIntArray clone = jm.clone();
        amb i10 = I.i(false);
        boolean d10 = i10 != null ? i10.d(jm, clone) : true;
        f(jm, clone, I.o());
        e(jm, clone, I.o());
        mm = d10;
        km = clone;
        if (!z11) {
            s1(!(LaunchActivity.Q() instanceof yv1));
        }
        k();
        n();
        p();
        j(false, z10);
        gm.c3(new zh4((byte) 3, !O));
    }

    public static void s(View view, View view2, ylb ylbVar) {
        if (view == null || view2 == null) {
            return;
        }
        int[] iArr = ym;
        view.getLocationOnScreen(iArr);
        int i10 = iArr[0];
        int i11 = iArr[1];
        view2.getLocationOnScreen(iArr);
        if (view2 instanceof hob) {
            Bitmap bitmap = X;
            if (bitmap != null) {
                float width = bitmap.getWidth();
                i10 = (int) ((((view2.getMeasuredWidth() - (Math.max(view2.getMeasuredWidth() / width, view2.getMeasuredHeight() / X.getHeight()) * width)) / 2.0f) - ((hob) view2).J) + i10);
            } else {
                i10 = (int) (i10 + (-((hob) view2).J));
            }
            i11 = (int) (i11 + (-((hob) view2).K));
        }
        if (ylbVar != null) {
            ylbVar.b(i10, i11 - iArr[1], view2.getMeasuredWidth(), view2.getMeasuredHeight());
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
        if (drawable instanceof ah7) {
            S = ((ah7) drawable).i;
        } else {
            S = 0;
        }
        d0 = null;
        e0 = null;
        m1(z10);
    }

    public static void t(bmb bmbVar, boolean z10, boolean z11) {
        SparseIntArray R02;
        String[] split;
        if (bmbVar != null) {
            vm++;
            ThemeEditorView themeEditorView = ThemeEditorView.p;
            if (themeEditorView != null) {
                themeEditorView.a();
            }
            try {
                if (bmbVar.b == null && bmbVar.d == null) {
                    if (!z11 && z10) {
                        SharedPreferences.Editor edit = oc7.d1().edit();
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
                        SharedPreferences.Editor edit2 = oc7.d1().edit();
                        edit2.putString("theme", bmbVar.k());
                        edit2.apply();
                    }
                    String[] strArr = new String[1];
                    String str = bmbVar.d;
                    if (str != null) {
                        R02 = R0(null, str, null);
                        jm = R02;
                    } else {
                        R02 = R0(new File(bmbVar.b), null, strArr);
                        jm = R02;
                    }
                    f0 = R02.get(f5, -1);
                    if (TextUtils.isEmpty(strArr[0])) {
                        try {
                            if (bmbVar.c != null) {
                                new File(bmbVar.c).delete();
                            }
                        } catch (Exception unused) {
                        }
                        bmbVar.c = null;
                        g0 = null;
                    } else {
                        String str2 = strArr[0];
                        g0 = str2;
                        String absolutePath = usc.d(str2).getAbsolutePath();
                        try {
                            String str3 = bmbVar.c;
                            if (str3 != null && !str3.equals(absolutePath)) {
                                new File(bmbVar.c).delete();
                            }
                        } catch (Exception unused2) {
                        }
                        bmbVar.c = absolutePath;
                        try {
                            Uri parse = Uri.parse(g0);
                            bmbVar.e = parse.getQueryParameter("slug");
                            String queryParameter = parse.getQueryParameter("mode");
                            if (queryParameter != null && (split = queryParameter.toLowerCase().split(" ")) != null && split.length > 0) {
                                for (int i10 = 0; i10 < split.length; i10++) {
                                    if ("blur".equals(split[i10])) {
                                        bmbVar.h = true;
                                    } else if ("motion".equals(split[i10])) {
                                        bmbVar.n = true;
                                    }
                                }
                            }
                            Utilities.z(parse.getQueryParameter("intensity"));
                            bmbVar.y = 45;
                            try {
                                String queryParameter2 = parse.getQueryParameter("bg_color");
                                if (!TextUtils.isEmpty(queryParameter2)) {
                                    bmbVar.r = Integer.parseInt(queryParameter2.substring(0, 6), 16) | (-16777216);
                                    if (queryParameter2.length() >= 13 && gm.Q1(queryParameter2.charAt(6))) {
                                        bmbVar.s = Integer.parseInt(queryParameter2.substring(7, 13), 16) | (-16777216);
                                    }
                                    if (queryParameter2.length() >= 20 && gm.Q1(queryParameter2.charAt(13))) {
                                        bmbVar.w = Integer.parseInt(queryParameter2.substring(14, 20), 16) | (-16777216);
                                    }
                                    if (queryParameter2.length() == 27 && gm.Q1(queryParameter2.charAt(20))) {
                                        bmbVar.x = Integer.parseInt(queryParameter2.substring(21), 16) | (-16777216);
                                    }
                                }
                            } catch (Exception unused3) {
                            }
                            try {
                                String queryParameter3 = parse.getQueryParameter("rotation");
                                if (!TextUtils.isEmpty(queryParameter3)) {
                                    bmbVar.y = Utilities.z(queryParameter3).intValue();
                                }
                            } catch (Exception unused4) {
                            }
                        } catch (Throwable th2) {
                            fc4.g(th2, true);
                        }
                    }
                }
                if (!z11 && M == null) {
                    K = bmbVar;
                    if (I == J) {
                        T = 2000;
                        U = SystemClock.elapsedRealtime();
                        gm.d3(new bo6((byte) 2), 2100L);
                    }
                }
                I = bmbVar;
                r1(false, false);
            } catch (Exception e10) {
                fc4.g(e10, true);
            }
            float f10 = xl0.m1;
            xl0.o1 = 1.0f - (Color.alpha(w0(null, ng, true)) / 255.0f);
            if (M == null && z10 && !Q) {
                oc7.r1(bmbVar.F).C4(bmbVar, bmbVar.i(false), z11, false);
            }
        }
    }

    public static e0b t0(int i10) {
        if (i10 < 0 || i10 > 5) {
            return null;
        }
        e0b[] e0bVarArr = t3;
        e0b e0bVar = e0bVarArr[i10];
        if (e0bVar != null) {
            return e0bVar;
        }
        if (i10 == 0) {
            e0bVarArr[0] = new a6c(true);
        } else if (i10 == 1) {
            e0bVarArr[1] = new di2(true);
        } else if (i10 == 2) {
            e0bVarArr[2] = new o6a(true);
        } else if (i10 == 3) {
            e0bVarArr[3] = new df8(null, true);
        } else if (i10 == 4) {
            e0bVarArr[4] = new ql9(true);
        } else if (i10 == 5) {
            e0bVarArr[5] = new di2();
        }
        e0b e0bVar2 = e0bVarArr[i10];
        e0bVar2.d();
        e0bVar2.b(w0(null, o9, false));
        return e0bVar2;
    }

    public static void t1(boolean z10) {
        if (!z10) {
            I.v(null);
        } else {
            P = false;
            s1(true);
        }
    }

    public static bmb u(File file, String str, TLRPC.TL_theme tL_theme, boolean z10) {
        File file2;
        String str2;
        try {
            if (!str.toLowerCase().endsWith(".attheme")) {
                str = str.concat(".attheme");
            }
            if (z10) {
                nm7.e().k(nm7.y4, new Object[0]);
                bmb bmbVar = new bmb();
                bmbVar.a = str;
                bmbVar.G = tL_theme;
                bmbVar.b = file.getAbsolutePath();
                bmbVar.F = z8c.t0;
                M = B0();
                O = true;
                P = false;
                t(bmbVar, false, false);
                return bmbVar;
            }
            if (tL_theme != null) {
                str2 = "remote" + tL_theme.id;
                file2 = new File(a.h(), str2.concat(".attheme"));
            } else {
                file2 = new File(a.h(), str);
                str2 = str;
            }
            if (!gm.E(file, file2)) {
                o();
                return null;
            }
            M = null;
            O = false;
            P = false;
            HashMap hashMap = H;
            bmb bmbVar2 = (bmb) hashMap.get(str2);
            if (bmbVar2 == null) {
                bmbVar2 = new bmb();
                bmbVar2.a = str;
                bmbVar2.F = z8c.t0;
                ArrayList arrayList = F;
                arrayList.add(bmbVar2);
                G.add(bmbVar2);
                Collections.sort(arrayList, new zua((byte) 3));
            } else {
                hashMap.remove(str2);
            }
            bmbVar2.G = tL_theme;
            bmbVar2.b = file2.getAbsolutePath();
            hashMap.put(bmbVar2.k(), bmbVar2);
            w1(true, false);
            t(bmbVar2, true, false);
            return bmbVar2;
        } catch (Exception e10) {
            fc4.g(e10, true);
            return null;
        }
    }

    public static int u0(int i10) {
        return w0(null, i10, false);
    }

    public static void u1() {
        SharedPreferences.Editor edit = oc7.d1().edit();
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
        bmb bmbVar = J;
        if (bmbVar != null) {
            edit.putString("nighttheme", bmbVar.k());
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

    public static int v0(int i10, ylb ylbVar) {
        Integer y02;
        return ylbVar != null ? (!ylbVar.e() || (y02 = y0(i10, ylbVar)) == null) ? ylbVar.h(i10) : y02.intValue() : w0(null, i10, false);
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
    
        fc4.g(r0, r4);
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
    
        fc4.g(r0, true);
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
    
        fc4.g(r0, r4);
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
    public static void v1(bmb bmbVar, boolean z10, boolean z11, boolean z12) {
        int i10;
        int i11;
        int i12;
        int i13;
        xlb xlbVar = bmbVar.j0;
        String Z02 = xlbVar != null ? Z0(xlbVar) : g0;
        Drawable drawable = z11 ? d0 : e0;
        if (z11 && drawable != null) {
            e0 = d0;
        }
        amb i14 = I.i(false);
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
                        sb2.append(nxe.c(i19));
                        sb2.append("=");
                        sb2.append(i20);
                        sb2.append("\n");
                    }
                    i19++;
                }
            }
            FileOutputStream fileOutputStream = new FileOutputStream(bmbVar.b);
            if (sb2.length() == 0 && !(drawable instanceof BitmapDrawable) && TextUtils.isEmpty(Z02)) {
                sb2.append(' ');
            }
            fileOutputStream.write(gm.g1(sb2.toString()));
            if (TextUtils.isEmpty(Z02)) {
                fileOutputStream.write(gm.g1("WLS=" + Z02 + "\n"));
                if (z11 && (drawable instanceof BitmapDrawable)) {
                    usc.c(((BitmapDrawable) drawable).getBitmap(), Bitmap.CompressFormat.JPEG, usc.d(Z02));
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
                if (hashMap.get(bmbVar.k()) == null) {
                    ArrayList arrayList = F;
                    arrayList.add(bmbVar);
                    hashMap.put(bmbVar.k(), bmbVar);
                    G.add(bmbVar);
                    w1(true, false);
                    Collections.sort(arrayList, new zua((byte) 3));
                }
                I = bmbVar;
                if (bmbVar != J) {
                    K = bmbVar;
                }
                if (z13) {
                    jm.clear();
                    r1(false, false);
                }
                SharedPreferences.Editor edit = oc7.d1().edit();
                edit.putString("theme", K.k());
                edit.apply();
            }
            fileOutputStream.close();
            if (z10) {
                oc7.r1(bmbVar.F).D4(bmbVar, bmbVar.i(false));
                return;
            }
            return;
        }
        for (int i21 = 0; i21 < sparseIntArray.size(); i21++) {
            int keyAt = sparseIntArray.keyAt(i21);
            int valueAt = sparseIntArray.valueAt(i21);
            if ((!(drawable instanceof BitmapDrawable) && Z02 == null) || (i18 != keyAt && i17 != keyAt && i16 != keyAt && i15 != keyAt)) {
                sb2.append(nxe.c(keyAt));
                sb2.append("=");
                sb2.append(valueAt);
                sb2.append("\n");
            }
        }
        FileOutputStream fileOutputStream2 = new FileOutputStream(bmbVar.b);
        if (sb2.length() == 0) {
            sb2.append(' ');
        }
        fileOutputStream2.write(gm.g1(sb2.toString()));
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
        return (!gda.D0 || (y02 = y0(i10, null)) == null) ? (z10 || (sparseIntArray = lm) == null || (indexOfKey = sparseIntArray.indexOfKey(i10)) < 0) ? x0(km, i10, zArr) : lm.valueAt(indexOfKey) : y02.intValue();
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
                bmb bmbVar = (bmb) arrayList2.get(i11);
                bmbVar.getClass();
                try {
                    jSONObject = new JSONObject();
                    jSONObject.put("name", bmbVar.a);
                    jSONObject.put("path", bmbVar.b);
                    jSONObject.put("account", bmbVar.F);
                    TLRPC.TL_theme tL_theme = bmbVar.G;
                    if (tL_theme != null) {
                        SerializedData serializedData = new SerializedData(tL_theme.getObjectSize());
                        bmbVar.G.serializeToStream(serializedData);
                        jSONObject.put("info", Utilities.f(serializedData.toByteArray()));
                    }
                    jSONObject.put("loaded", bmbVar.H);
                } catch (Exception e10) {
                    fc4.g(e10, true);
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
                bmb bmbVar2 = (bmb) H.get(i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? "Night" : "Day" : "Arctic Blue" : "Dark Blue" : "Blue");
                if (bmbVar2 == null || (arrayList = bmbVar2.c0) == null || arrayList.isEmpty()) {
                    z12 = z11;
                } else {
                    z12 = z11;
                    x1(bmbVar2, true, false, false, false, z12);
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
        bmb bmbVar = I;
        bmb bmbVar2 = L;
        int i11 = cd;
        int i12 = bd;
        if (bmbVar == bmbVar2) {
            int i13 = pb;
            byte b10 = n;
            if (i10 < i13 || i10 >= wb) {
                if (i10 < xb || i10 >= Jc) {
                    if (De != i10 && Ee != i10 && Fe != i10 && Ge != i10 && bmbVar.T) {
                        if (bmbVar.Z != b10) {
                            amb ambVar = (amb) bmbVar.b0.get(b10);
                            amb ambVar2 = (amb) bmbVar.b0.get(bmbVar.Z);
                            if (ambVar2 != null) {
                                if (ambVar != null) {
                                }
                            }
                        }
                        return i10 == i12 ? W : i10 == i11 ? a0 : D0(i10);
                    }
                } else if (bmbVar.T) {
                    if (bmbVar.Z != b10) {
                        amb ambVar3 = (amb) bmbVar.b0.get(b10);
                        amb ambVar4 = (amb) bmbVar.b0.get(bmbVar.Z);
                        if (ambVar3 != null) {
                            if (ambVar4 != null) {
                                if (ambVar3.d == ambVar4.d) {
                                    if (ambVar3.e == ambVar4.e) {
                                        if (ambVar3.f == ambVar4.f) {
                                            if (ambVar3.g == ambVar4.g) {
                                                if (ambVar3.h == ambVar4.h) {
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
            } else if (bmbVar.T) {
                if (bmbVar.Z != b10) {
                    amb ambVar5 = (amb) bmbVar.b0.get(b10);
                    amb ambVar6 = (amb) bmbVar.b0.get(bmbVar.Z);
                    if (ambVar5 != null) {
                        if (ambVar6 != null) {
                            if (ambVar5.e == ambVar6.e) {
                                if (ambVar5.f == ambVar6.f) {
                                    if (ambVar5.g == ambVar6.g) {
                                        if (ambVar5.h == ambVar6.h) {
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

    public static void x1(bmb bmbVar, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        if (z10) {
            SharedPreferences.Editor edit = a.b.getSharedPreferences("themeconfig", 0).edit();
            if (!z12) {
                int size = bmbVar.c0.size();
                int max = Math.max(0, size - bmbVar.X);
                SerializedData serializedData = new SerializedData(((max << 4) + 2) << 2);
                serializedData.writeInt32(9);
                serializedData.writeInt32(max);
                for (int i10 = 0; i10 < size; i10++) {
                    amb ambVar = (amb) bmbVar.c0.get(i10);
                    int i11 = ambVar.a;
                    if (i11 >= 100) {
                        serializedData.writeInt32(i11);
                        serializedData.writeInt32(ambVar.c);
                        serializedData.writeInt32(ambVar.d);
                        serializedData.writeInt32(ambVar.e);
                        serializedData.writeInt32(ambVar.f);
                        serializedData.writeInt32(ambVar.g);
                        serializedData.writeInt32(ambVar.h);
                        serializedData.writeBool(ambVar.i);
                        serializedData.writeInt64(ambVar.j);
                        serializedData.writeInt64(ambVar.k);
                        serializedData.writeInt64(ambVar.l);
                        serializedData.writeInt64(ambVar.m);
                        serializedData.writeInt32(ambVar.n);
                        serializedData.writeInt64(0L);
                        serializedData.writeDouble(ambVar.p);
                        serializedData.writeBool(ambVar.q);
                        serializedData.writeString(ambVar.o);
                        serializedData.writeBool(ambVar.r != null);
                        if (ambVar.r != null) {
                            serializedData.writeInt32(ambVar.t);
                            ambVar.r.serializeToStream(serializedData);
                        }
                    }
                }
                edit.putString("accents_" + bmbVar.d, Base64.encodeToString(serializedData.toByteArray(), 3));
                if (!z14) {
                    nm7.e().k(nm7.u4, new Object[0]);
                }
                if (z13) {
                    oc7.r1(z8c.t0).D4(bmbVar, bmbVar.i(false));
                }
            }
            edit.putInt("accent_current_" + bmbVar.d, bmbVar.Z);
            edit.commit();
        } else {
            if (bmbVar.a0 != -1) {
                if (z11) {
                    amb ambVar2 = (amb) bmbVar.b0.get(bmbVar.Z);
                    bmbVar.b0.remove(ambVar2.a);
                    bmbVar.c0.remove(ambVar2);
                    TLRPC.TL_theme tL_theme = ambVar2.r;
                    if (tL_theme != null) {
                        bmbVar.d0.remove(tL_theme.id);
                    }
                }
                bmbVar.Z = bmbVar.a0;
                amb i12 = bmbVar.i(false);
                if (i12 != null) {
                    bmbVar.j0 = i12.y;
                } else {
                    bmbVar.j0 = null;
                }
            }
            if (I == bmbVar) {
                r1(false, false);
            }
        }
        bmbVar.a0 = -1;
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

    public static Integer y0(int i10, ylb ylbVar) {
        int i11;
        if (!g1(ylbVar) || i10 < 0 || i10 >= (i11 = e5)) {
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
        return i14 != 2 ? i14 != 3 ? Integer.valueOf(v0(i13, ylbVar)) : Integer.valueOf(on2.l(v0(i13, ylbVar), v0(i15, ylbVar))) : Integer.valueOf(on2.l(v0(i13, ylbVar), on2.l(v0(Ka, ylbVar), v0(i15, ylbVar))));
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
        int i18 = nm7.v4;
        if (i10 == i12) {
            nm7.e().k(i18, new Object[0]);
        } else {
            if (i10 != i13 || Build.VERSION.SDK_INT < 26) {
                return;
            }
            nm7.e().k(i18, new Object[0]);
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
    
        cmb.r1 = org.telegram.messenger.a.b.getResources().getDrawable(org.telegram.messenger.beta.R.drawable.newyear);
        cmb.C1 = -gm.L(3.0f);
        cmb.D1 = -gm.L(-7.0f);
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
                    boolean z10 = e21.a;
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
        if (drawable instanceof sn2) {
            Drawable drawable2 = z10 ? ((sn2) drawable).b : ((sn2) drawable).a;
            if (drawable2 instanceof ColorDrawable) {
                ((ColorDrawable) drawable2).setColor(i10);
            } else {
                drawable2.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
            }
        }
    }
}
