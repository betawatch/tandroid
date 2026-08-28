package org.telegram.ui.ActionBar;

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
import java.util.concurrent.CountDownLatch;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.time.SunDate;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.ThemeEditorView;
import org.telegram.ui.Components.d8;
import org.telegram.ui.Components.f80;
import org.telegram.ui.Components.fd0;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.Components.go0;
import org.telegram.ui.Components.h10;
import org.telegram.ui.Components.hp;
import org.telegram.ui.Components.i10;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.j41;
import org.telegram.ui.Components.jb0;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.Components.n9;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.qb0;
import org.telegram.ui.Components.rf0;
import org.telegram.ui.Components.tv0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.dc1;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class f6 {
    public static int A;
    public static Paint A0;
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
    public static j4.c Al;
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
    public static final int[] Bj;
    public static final int Bk;
    public static Method Bl;
    public static TextPaint[] C0;
    public static boolean C1;
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
    public static float[] Cl;
    public static TextPaint D0;
    public static int D1;
    public static TextPaint D2;
    public static Drawable D3;
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
    public static final m5 Dl;
    public static TextPaint E0;
    public static int E1;
    public static TextPaint E2;
    public static qb0 E3;
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
    public static final int[] El;
    public static final ArrayList F;
    public static TextPaint[] F0;
    public static long F1;
    public static TextPaint F2;
    public static Drawable F3;
    public static Drawable F4;
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
    public static WeakReference Fl;
    public static final ArrayList G;
    public static TextPaint G0;
    public static boolean G1;
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
    public static Bitmap Gl;
    public static final HashMap H;
    public static TextPaint[] H0;
    public static mi0 H1;
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
    public static final int[] Hk;
    public static final Paint Hl;
    public static e6 I;
    public static TextPaint I0;
    public static mi0 I1;
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
    public static final Paint Il;
    public static e6 J;
    public static TextPaint J0;
    public static mi0 J1;
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
    public static final Paint Jl;
    public static e6 K;
    public static TextPaint K0;
    public static mi0 K1;
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
    public static final Paint Kl;
    public static final e6 L;
    public static TextPaint L0;
    public static mi0 L1;
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
    public static final Paint Ll;
    public static e6 M;
    public static TextPaint M0;
    public static mi0 M1;
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
    public static final Paint Ml;
    public static boolean N;
    public static TextPaint N0;
    public static mi0 N1;
    public static TextPaint N2;
    public static Drawable N3;
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
    public static boolean O;
    public static TextPaint O0;
    public static mi0 O1;
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
    public static boolean P;
    public static TextPaint P0;
    public static TextPaint P1;
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
    public static boolean R;
    public static TextPaint R0;
    public static Drawable R1;
    public static TextPaint R2;
    public static Drawable R3;
    public static Drawable R4;
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
    public static long U;
    public static Drawable U0;
    public static Paint U1;
    public static TextPaint U2;
    public static Drawable U3;
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
    public static i9 V;
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
    public static boolean W;
    public static Drawable W0;
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
    public static int X;
    public static qb0 X0;
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
    public static Bitmap Y;
    public static Drawable Y0;
    public static Paint Y1;
    public static TextPaint Y2;
    public static Drawable Y3;
    public static Drawable Y4;
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
    public static BitmapShader Z;
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
    public static Matrix a0;
    public static Drawable a1;
    public static Paint a2;
    public static TextPaint a3;
    public static Drawable a4;
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
    public static int c0;
    public static Drawable c1;
    public static Paint c2;
    public static TextPaint c3;
    public static Drawable c4;
    public static Drawable c5;
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
    public static of.r0 d;
    public static int d0;
    public static Drawable d1;
    public static Paint d2;
    public static TextPaint d3;
    public static Drawable d4;
    public static d8 d5;
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
    public static SensorManager e;
    public static Drawable e0;
    public static Drawable e1;
    public static Paint e2;
    public static TextPaint e3;
    public static Drawable e4;
    public static HashMap e5;
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
    public static Sensor f;
    public static Drawable f0;
    public static Drawable f1;
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
    public static boolean g;
    public static int g0;
    public static il0 g1;
    public static Paint g2;
    public static TextPaint g3;
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
    public static String h0;
    public static il0 h1;
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
    public static boolean j;
    public static boolean j0;
    public static Drawable j1;
    public static Paint j2;
    public static Drawable j3;
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
    public static final HashMap jl;
    public static boolean k;
    public static Paint k0;
    public static Drawable k1;
    public static Paint k2;
    public static f5 k3;
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
    public static final HashMap kl;
    public static Paint l0;
    public static Drawable l1;
    public static Paint l2;
    public static Drawable l3;
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
    public static final HashMap ll;
    public static final androidx.emoji2.text.m m;
    public static Paint m0;
    public static Drawable m1;
    public static Paint m2;
    public static d5 m3;
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
    public static final HashMap ml;
    public static Paint n0;
    public static Drawable n1;
    public static Paint n2;
    public static d5 n3;
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
    public static final int[] nl;
    public static int o;
    public static Paint o0;
    public static Drawable o1;
    public static TextPaint o2;
    public static d5 o3;
    public static Drawable o4;
    public static final int o5;
    public static final int o6;
    public static final int o7;
    public static final int o8;
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
    public static final SparseIntArray ol;
    public static boolean p;
    public static Paint p0;
    public static Drawable p1;
    public static TextPaint p2;
    public static d5 p3;
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
    public static final HashSet pl;
    public static float q;
    public static Paint q0;
    public static Drawable q1;
    public static TextPaint q2;
    public static d5 q3;
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
    public static SparseIntArray ql;
    public static int r;
    public static Drawable r1;
    public static TextPaint r2;
    public static d5 r3;
    public static Drawable r4;
    public static final int r5;
    public static final int r6;
    public static final int r7;
    public static final int[] r8;
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
    public static final int rk;
    public static SparseIntArray rl;
    public static int s;
    public static Drawable s0;
    public static Drawable s1;
    public static TextPaint s2;
    public static d5 s3;
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
    public static SparseIntArray sl;
    public static int t;
    public static Paint t0;
    public static Drawable t1;
    public static TextPaint t2;
    public static d5 t3;
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
    public static boolean tl;
    public static int u;
    public static Paint u0;
    public static mi0 u1;
    public static TextPaint u2;
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
    public static final ThreadLocal ul;
    public static int v;
    public static Paint v0;
    public static mi0 v1;
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
    public static final ThreadLocal vl;
    public static String w;
    public static Paint w0;
    public static mi0 w1;
    public static TextPaint w2;
    public static PorterDuffColorFilter w3;
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
    public static final ThreadLocal wl;
    public static double x;
    public static Paint x0;
    public static mi0 x1;
    public static TextPaint x2;
    public static fd0 x3;
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
    public static final ThreadLocal xl;
    public static double y;
    public static Paint y0;
    public static mi0 y1;
    public static TextPaint[] y2;
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
    public static final ThreadLocal yl;
    public static Paint z0;
    public static mi0 z1;
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
    public static i10 zl;
    public static final int a = i0.a.k(-16777216, 27);
    public static final Object c = new Object();
    public static float h = 1.0f;
    public static final androidx.emoji2.text.m l = new androidx.emoji2.text.m(2);
    public static final int n = 99;
    public static final Paint z = new Paint(1);
    public static final boolean[] C = new boolean[4];
    public static final int[] D = new int[4];
    public static final long[] E = new long[4];
    public static final Drawable[] r0 = new Drawable[25];
    public static final tv0[] u3 = new tv0[6];
    public static final Drawable[] G4 = new Drawable[2];
    public static final Drawable[] H4 = new Drawable[2];
    public static final Drawable[] I4 = new Drawable[2];
    public static final Drawable[] J4 = new Drawable[2];
    public static final Drawable[] K4 = new Drawable[2];
    public static final Drawable[] L4 = new Drawable[2];
    public static final Drawable[] M4 = new Drawable[2];
    public static final Drawable[] N4 = new Drawable[2];
    public static final Drawable[] S4 = new Drawable[2];
    public static final Drawable[] T4 = new Drawable[2];
    public static final Drawable[][] U4 = (Drawable[][]) Array.newInstance((Class<?>) Drawable.class, 5, 2);
    public static final Path[] Z4 = new Path[2];
    public static final Path[] a5 = new Path[3];

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:149:0x2401 A[Catch: all -> 0x242f, TryCatch #2 {all -> 0x242f, blocks: (B:118:0x233e, B:120:0x2353, B:121:0x2359, B:123:0x236b, B:126:0x237b, B:129:0x2388, B:132:0x23a0, B:135:0x23b2, B:137:0x23c1, B:140:0x23ca, B:142:0x23dd, B:144:0x23e6, B:146:0x23ed, B:147:0x23fd, B:149:0x2401, B:150:0x2405, B:152:0x2410, B:153:0x2417, B:156:0x23a8, B:157:0x2393), top: B:117:0x233e, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x2410 A[Catch: all -> 0x242f, TryCatch #2 {all -> 0x242f, blocks: (B:118:0x233e, B:120:0x2353, B:121:0x2359, B:123:0x236b, B:126:0x237b, B:129:0x2388, B:132:0x23a0, B:135:0x23b2, B:137:0x23c1, B:140:0x23ca, B:142:0x23dd, B:144:0x23e6, B:146:0x23ed, B:147:0x23fd, B:149:0x2401, B:150:0x2405, B:152:0x2410, B:153:0x2417, B:156:0x23a8, B:157:0x2393), top: B:117:0x233e, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x2559 A[Catch: Exception -> 0x27a1, TryCatch #3 {Exception -> 0x27a1, blocks: (B:55:0x221e, B:57:0x2238, B:58:0x2275, B:60:0x2283, B:61:0x22aa, B:63:0x22ae, B:65:0x22b6, B:66:0x22c8, B:67:0x22d2, B:69:0x22d8, B:71:0x22e2, B:73:0x22e6, B:75:0x2314, B:76:0x2318, B:82:0x2553, B:84:0x2559, B:85:0x2562, B:87:0x2566, B:89:0x256e, B:91:0x2572, B:92:0x2576, B:94:0x2578, B:96:0x2582, B:78:0x2448, B:101:0x2467, B:102:0x2472, B:104:0x247e, B:108:0x248a, B:109:0x2538, B:106:0x2493, B:111:0x2496, B:168:0x243f, B:169:0x2447, B:176:0x259c, B:177:0x25a2, B:180:0x25ad, B:182:0x2604, B:183:0x2612, B:185:0x2620, B:186:0x262e, B:221:0x2627, B:222:0x260b, B:224:0x2291, B:226:0x2299, B:228:0x22a0, B:230:0x22a8, B:231:0x2245, B:233:0x224d, B:235:0x2253, B:237:0x225b, B:239:0x2263, B:114:0x2329, B:161:0x2430, B:162:0x2435, B:118:0x233e, B:120:0x2353, B:121:0x2359, B:123:0x236b, B:126:0x237b, B:129:0x2388, B:132:0x23a0, B:135:0x23b2, B:137:0x23c1, B:140:0x23ca, B:142:0x23dd, B:144:0x23e6, B:146:0x23ed, B:147:0x23fd, B:149:0x2401, B:150:0x2405, B:152:0x2410, B:153:0x2417, B:156:0x23a8, B:157:0x2393), top: B:54:0x221e, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x2572 A[Catch: Exception -> 0x27a1, TryCatch #3 {Exception -> 0x27a1, blocks: (B:55:0x221e, B:57:0x2238, B:58:0x2275, B:60:0x2283, B:61:0x22aa, B:63:0x22ae, B:65:0x22b6, B:66:0x22c8, B:67:0x22d2, B:69:0x22d8, B:71:0x22e2, B:73:0x22e6, B:75:0x2314, B:76:0x2318, B:82:0x2553, B:84:0x2559, B:85:0x2562, B:87:0x2566, B:89:0x256e, B:91:0x2572, B:92:0x2576, B:94:0x2578, B:96:0x2582, B:78:0x2448, B:101:0x2467, B:102:0x2472, B:104:0x247e, B:108:0x248a, B:109:0x2538, B:106:0x2493, B:111:0x2496, B:168:0x243f, B:169:0x2447, B:176:0x259c, B:177:0x25a2, B:180:0x25ad, B:182:0x2604, B:183:0x2612, B:185:0x2620, B:186:0x262e, B:221:0x2627, B:222:0x260b, B:224:0x2291, B:226:0x2299, B:228:0x22a0, B:230:0x22a8, B:231:0x2245, B:233:0x224d, B:235:0x2253, B:237:0x225b, B:239:0x2263, B:114:0x2329, B:161:0x2430, B:162:0x2435, B:118:0x233e, B:120:0x2353, B:121:0x2359, B:123:0x236b, B:126:0x237b, B:129:0x2388, B:132:0x23a0, B:135:0x23b2, B:137:0x23c1, B:140:0x23ca, B:142:0x23dd, B:144:0x23e6, B:146:0x23ed, B:147:0x23fd, B:149:0x2401, B:150:0x2405, B:152:0x2410, B:153:0x2417, B:156:0x23a8, B:157:0x2393), top: B:54:0x221e, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x2575  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x2582 A[Catch: Exception -> 0x27a1, TryCatch #3 {Exception -> 0x27a1, blocks: (B:55:0x221e, B:57:0x2238, B:58:0x2275, B:60:0x2283, B:61:0x22aa, B:63:0x22ae, B:65:0x22b6, B:66:0x22c8, B:67:0x22d2, B:69:0x22d8, B:71:0x22e2, B:73:0x22e6, B:75:0x2314, B:76:0x2318, B:82:0x2553, B:84:0x2559, B:85:0x2562, B:87:0x2566, B:89:0x256e, B:91:0x2572, B:92:0x2576, B:94:0x2578, B:96:0x2582, B:78:0x2448, B:101:0x2467, B:102:0x2472, B:104:0x247e, B:108:0x248a, B:109:0x2538, B:106:0x2493, B:111:0x2496, B:168:0x243f, B:169:0x2447, B:176:0x259c, B:177:0x25a2, B:180:0x25ad, B:182:0x2604, B:183:0x2612, B:185:0x2620, B:186:0x262e, B:221:0x2627, B:222:0x260b, B:224:0x2291, B:226:0x2299, B:228:0x22a0, B:230:0x22a8, B:231:0x2245, B:233:0x224d, B:235:0x2253, B:237:0x225b, B:239:0x2263, B:114:0x2329, B:161:0x2430, B:162:0x2435, B:118:0x233e, B:120:0x2353, B:121:0x2359, B:123:0x236b, B:126:0x237b, B:129:0x2388, B:132:0x23a0, B:135:0x23b2, B:137:0x23c1, B:140:0x23ca, B:142:0x23dd, B:144:0x23e6, B:146:0x23ed, B:147:0x23fd, B:149:0x2401, B:150:0x2405, B:152:0x2410, B:153:0x2417, B:156:0x23a8, B:157:0x2393), top: B:54:0x221e, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x258f A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v104 */
    /* JADX WARN: Type inference failed for: r11v124 */
    /* JADX WARN: Type inference failed for: r11v99, types: [boolean] */
    static {
        e6 e6Var;
        e6 e6Var2;
        e6 e6Var3;
        e6 e6Var4;
        SharedPreferences.Editor editor;
        boolean z10;
        SharedPreferences.Editor editor2;
        e6 e6Var5;
        int i10;
        TLRPC.TL_theme tL_theme;
        TLRPC.TL_theme tL_theme2;
        SparseArray sparseArray;
        d6 k10;
        int i11 = 3;
        m = new androidx.emoji2.text.m(i11);
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
        int i12 = f5;
        int i13 = i12 + 1;
        f5 = i13;
        g5 = i12;
        int i14 = i12 + 2;
        f5 = i14;
        h5 = i13;
        int i15 = i12 + 3;
        f5 = i15;
        i5 = i14;
        int i16 = i12 + 4;
        f5 = i16;
        j5 = i15;
        int i17 = i12 + 5;
        f5 = i17;
        k5 = i16;
        int i18 = i12 + 6;
        f5 = i18;
        l5 = i17;
        int i19 = i12 + 7;
        f5 = i19;
        m5 = i18;
        int i20 = i12 + 8;
        f5 = i20;
        n5 = i19;
        int i21 = i12 + 9;
        f5 = i21;
        o5 = i20;
        int i22 = i12 + 10;
        f5 = i22;
        p5 = i21;
        int i23 = i12 + 11;
        f5 = i23;
        q5 = i22;
        int i24 = i12 + 12;
        f5 = i24;
        r5 = i23;
        int i25 = i12 + 13;
        f5 = i25;
        s5 = i24;
        int i26 = i12 + 14;
        f5 = i26;
        t5 = i25;
        int i27 = i12 + 15;
        f5 = i27;
        u5 = i26;
        int i28 = i12 + 16;
        f5 = i28;
        v5 = i27;
        int i29 = i12 + 17;
        f5 = i29;
        w5 = i28;
        int i30 = i12 + 18;
        f5 = i30;
        x5 = i29;
        int i31 = i12 + 19;
        f5 = i31;
        y5 = i30;
        int i32 = i12 + 20;
        f5 = i32;
        z5 = i31;
        int i33 = i12 + 21;
        f5 = i33;
        A5 = i32;
        int i34 = i12 + 22;
        f5 = i34;
        B5 = i33;
        int i35 = i12 + 23;
        f5 = i35;
        C5 = i34;
        int i36 = i12 + 24;
        f5 = i36;
        D5 = i35;
        int i37 = i12 + 25;
        f5 = i37;
        E5 = i36;
        int i38 = i12 + 26;
        f5 = i38;
        F5 = i37;
        int i39 = i12 + 27;
        f5 = i39;
        G5 = i38;
        int i40 = i12 + 28;
        f5 = i40;
        H5 = i39;
        int i41 = i12 + 29;
        f5 = i41;
        I5 = i40;
        int i42 = i12 + 30;
        f5 = i42;
        J5 = i41;
        int i43 = i12 + 31;
        f5 = i43;
        K5 = i42;
        int i44 = i12 + 32;
        f5 = i44;
        L5 = i43;
        int i45 = i12 + 33;
        f5 = i45;
        M5 = i44;
        int i46 = i12 + 34;
        f5 = i46;
        N5 = i45;
        int i47 = i12 + 35;
        f5 = i47;
        O5 = i46;
        int i48 = i12 + 36;
        f5 = i48;
        P5 = i47;
        int i49 = i12 + 37;
        f5 = i49;
        Q5 = i48;
        int i50 = i12 + 38;
        f5 = i50;
        R5 = i49;
        int i51 = i12 + 39;
        f5 = i51;
        S5 = i50;
        int i52 = i12 + 40;
        f5 = i52;
        T5 = i51;
        int i53 = i12 + 41;
        f5 = i53;
        U5 = i52;
        int i54 = i12 + 42;
        f5 = i54;
        V5 = i53;
        int i55 = i12 + 43;
        f5 = i55;
        W5 = i54;
        int i56 = i12 + 44;
        f5 = i56;
        X5 = i55;
        int i57 = i12 + 45;
        f5 = i57;
        Y5 = i56;
        int i58 = i12 + 46;
        f5 = i58;
        Z5 = i57;
        int i59 = i12 + 47;
        f5 = i59;
        a6 = i58;
        int i60 = i12 + 48;
        f5 = i60;
        b6 = i59;
        f5 = i12 + 49;
        c6 = i60;
        int i61 = f5;
        int i62 = i61 + 1;
        f5 = i62;
        d6 = i61;
        int i63 = i61 + 2;
        f5 = i63;
        e6 = i62;
        int i64 = i61 + 3;
        f5 = i64;
        f6 = i63;
        int i65 = i61 + 4;
        f5 = i65;
        g6 = i64;
        int i66 = i61 + 5;
        f5 = i66;
        h6 = i65;
        int i67 = i61 + 6;
        f5 = i67;
        i6 = i66;
        int i68 = i61 + 7;
        f5 = i68;
        j6 = i67;
        int i69 = i61 + 8;
        f5 = i69;
        k6 = i68;
        int i70 = i61 + 9;
        f5 = i70;
        l6 = i69;
        int i71 = i61 + 10;
        f5 = i71;
        m6 = i70;
        int i72 = i61 + 11;
        f5 = i72;
        n6 = i71;
        int i73 = i61 + 12;
        f5 = i73;
        o6 = i72;
        int i74 = i61 + 13;
        f5 = i74;
        p6 = i73;
        int i75 = i61 + 14;
        f5 = i75;
        q6 = i74;
        int i76 = i61 + 15;
        f5 = i76;
        r6 = i75;
        int i77 = i61 + 16;
        f5 = i77;
        s6 = i76;
        int i78 = i61 + 17;
        f5 = i78;
        t6 = i77;
        int i79 = i61 + 18;
        f5 = i79;
        u6 = i78;
        int i80 = i61 + 19;
        f5 = i80;
        v6 = i79;
        int i81 = i61 + 20;
        f5 = i81;
        w6 = i80;
        int i82 = i61 + 21;
        f5 = i82;
        x6 = i81;
        int i83 = i61 + 22;
        f5 = i83;
        y6 = i82;
        int i84 = i61 + 23;
        f5 = i84;
        z6 = i83;
        int i85 = i61 + 24;
        f5 = i85;
        A6 = i84;
        int i86 = i61 + 25;
        f5 = i86;
        B6 = i85;
        int i87 = i61 + 26;
        f5 = i87;
        C6 = i86;
        int i88 = i61 + 27;
        f5 = i88;
        D6 = i87;
        int i89 = i61 + 28;
        f5 = i89;
        E6 = i88;
        int i90 = i61 + 29;
        f5 = i90;
        F6 = i89;
        int i91 = i61 + 30;
        f5 = i91;
        G6 = i90;
        int i92 = i61 + 31;
        f5 = i92;
        H6 = i91;
        int i93 = i61 + 32;
        f5 = i93;
        I6 = i92;
        int i94 = i61 + 33;
        f5 = i94;
        J6 = i93;
        int i95 = i61 + 34;
        f5 = i95;
        K6 = i94;
        int i96 = i61 + 35;
        f5 = i96;
        L6 = i95;
        int i97 = i61 + 36;
        f5 = i97;
        M6 = i96;
        int i98 = i61 + 37;
        f5 = i98;
        N6 = i97;
        int i99 = i61 + 38;
        f5 = i99;
        O6 = i98;
        int i100 = i61 + 39;
        f5 = i100;
        P6 = i99;
        int i101 = i61 + 40;
        f5 = i101;
        Q6 = i100;
        int i102 = i61 + 41;
        f5 = i102;
        R6 = i101;
        int i103 = i61 + 42;
        f5 = i103;
        S6 = i102;
        int i104 = i61 + 43;
        f5 = i104;
        T6 = i103;
        int i105 = i61 + 44;
        f5 = i105;
        U6 = i104;
        int i106 = i61 + 45;
        f5 = i106;
        V6 = i105;
        int i107 = i61 + 46;
        f5 = i107;
        W6 = i106;
        int i108 = i61 + 47;
        f5 = i108;
        X6 = i107;
        int i109 = i61 + 48;
        f5 = i109;
        Y6 = i108;
        f5 = i61 + 49;
        Z6 = i109;
        int i110 = f5;
        int i111 = i110 + 1;
        f5 = i111;
        a7 = i110;
        int i112 = i110 + 2;
        f5 = i112;
        b7 = i111;
        int i113 = i110 + 3;
        f5 = i113;
        c7 = i112;
        int i114 = i110 + 4;
        f5 = i114;
        d7 = i113;
        int i115 = i110 + 5;
        f5 = i115;
        e7 = i114;
        int i116 = i110 + 6;
        f5 = i116;
        f7 = i115;
        int i117 = i110 + 7;
        f5 = i117;
        g7 = i116;
        int i118 = i110 + 8;
        f5 = i118;
        h7 = i117;
        int i119 = i110 + 9;
        f5 = i119;
        i7 = i118;
        int i120 = i110 + 10;
        f5 = i120;
        j7 = i119;
        int i121 = i110 + 11;
        f5 = i121;
        k7 = i120;
        int i122 = i110 + 12;
        f5 = i122;
        l7 = i121;
        int i123 = i110 + 13;
        f5 = i123;
        m7 = i122;
        int i124 = i110 + 14;
        f5 = i124;
        n7 = i123;
        int i125 = i110 + 15;
        f5 = i125;
        o7 = i124;
        int i126 = i110 + 16;
        f5 = i126;
        p7 = i125;
        int i127 = i110 + 17;
        f5 = i127;
        q7 = i126;
        int i128 = i110 + 18;
        f5 = i128;
        r7 = i127;
        int i129 = i110 + 19;
        f5 = i129;
        s7 = i128;
        int i130 = i110 + 20;
        f5 = i130;
        t7 = i129;
        int i131 = i110 + 21;
        f5 = i131;
        u7 = i130;
        int i132 = i110 + 22;
        f5 = i132;
        v7 = i131;
        int i133 = i110 + 23;
        f5 = i133;
        w7 = i132;
        int i134 = i110 + 24;
        f5 = i134;
        x7 = i133;
        int i135 = i110 + 25;
        f5 = i135;
        y7 = i134;
        int i136 = i110 + 26;
        f5 = i136;
        z7 = i135;
        int i137 = i110 + 27;
        f5 = i137;
        A7 = i136;
        int i138 = i110 + 28;
        f5 = i138;
        B7 = i137;
        int i139 = i110 + 29;
        f5 = i139;
        C7 = i138;
        int i140 = i110 + 30;
        f5 = i140;
        D7 = i139;
        int i141 = i110 + 31;
        f5 = i141;
        E7 = i140;
        int i142 = i110 + 32;
        f5 = i142;
        F7 = i141;
        int i143 = i110 + 33;
        f5 = i143;
        G7 = i142;
        int i144 = i110 + 34;
        f5 = i144;
        H7 = i143;
        int i145 = i110 + 35;
        f5 = i145;
        I7 = i144;
        int i146 = i110 + 36;
        f5 = i146;
        J7 = i145;
        int i147 = i110 + 37;
        f5 = i147;
        K7 = i146;
        int i148 = i110 + 38;
        f5 = i148;
        L7 = i147;
        int i149 = i110 + 39;
        f5 = i149;
        M7 = i148;
        int i150 = i110 + 40;
        f5 = i150;
        N7 = i149;
        int i151 = i110 + 41;
        f5 = i151;
        O7 = i150;
        int i152 = i110 + 42;
        f5 = i152;
        P7 = i151;
        int i153 = i110 + 43;
        f5 = i153;
        Q7 = i152;
        int i154 = i110 + 44;
        f5 = i154;
        R7 = i153;
        int i155 = i110 + 45;
        f5 = i155;
        S7 = i154;
        int i156 = i110 + 46;
        f5 = i156;
        T7 = i155;
        int i157 = i110 + 47;
        f5 = i157;
        U7 = i156;
        int i158 = i110 + 48;
        f5 = i158;
        V7 = i157;
        f5 = i110 + 49;
        W7 = i158;
        int i159 = f5;
        int i160 = i159 + 1;
        f5 = i160;
        X7 = i159;
        int i161 = i159 + 2;
        f5 = i161;
        Y7 = i160;
        int i162 = i159 + 3;
        f5 = i162;
        Z7 = i161;
        int i163 = i159 + 4;
        f5 = i163;
        a8 = i162;
        int i164 = i159 + 5;
        f5 = i164;
        b8 = i163;
        int i165 = i159 + 6;
        f5 = i165;
        c8 = i164;
        int i166 = i159 + 7;
        f5 = i166;
        d8 = i165;
        int i167 = i159 + 8;
        f5 = i167;
        e8 = i166;
        int i168 = i159 + 9;
        f5 = i168;
        f8 = i167;
        int i169 = i159 + 10;
        f5 = i169;
        g8 = i168;
        int i170 = i159 + 11;
        f5 = i170;
        h8 = i169;
        int i171 = i159 + 12;
        f5 = i171;
        i8 = i170;
        int i172 = i159 + 13;
        f5 = i172;
        j8 = i171;
        int i173 = i159 + 14;
        f5 = i173;
        k8 = i172;
        int i174 = i159 + 15;
        f5 = i174;
        l8 = i173;
        int i175 = i159 + 16;
        f5 = i175;
        m8 = i174;
        int i176 = i159 + 17;
        f5 = i176;
        n8 = i175;
        int i177 = i159 + 18;
        f5 = i177;
        o8 = i176;
        p8 = new int[]{i150, i151, i152, i153, i154, i155, i156};
        q8 = new int[]{i157, i158, i159, i160, i161, i162, i163};
        r8 = new int[]{i170, i171, i172, i173, i174, i175, i176};
        int i178 = i159 + 19;
        f5 = i178;
        s8 = i177;
        int i179 = i159 + 20;
        f5 = i179;
        t8 = i178;
        int i180 = i159 + 21;
        f5 = i180;
        u8 = i179;
        int i181 = i159 + 22;
        f5 = i181;
        v8 = i180;
        int i182 = i159 + 23;
        f5 = i182;
        w8 = i181;
        int i183 = i159 + 24;
        f5 = i183;
        x8 = i182;
        int i184 = i159 + 25;
        f5 = i184;
        y8 = i183;
        int i185 = i159 + 26;
        f5 = i185;
        z8 = i184;
        int i186 = i159 + 27;
        f5 = i186;
        A8 = i185;
        int i187 = i159 + 28;
        f5 = i187;
        B8 = i186;
        int i188 = i159 + 29;
        f5 = i188;
        C8 = i187;
        int i189 = i159 + 30;
        f5 = i189;
        D8 = i188;
        int i190 = i159 + 31;
        f5 = i190;
        E8 = i189;
        int i191 = i159 + 32;
        f5 = i191;
        F8 = i190;
        int i192 = i159 + 33;
        f5 = i192;
        G8 = i191;
        int i193 = i159 + 34;
        f5 = i193;
        H8 = i192;
        int i194 = i159 + 35;
        f5 = i194;
        I8 = i193;
        int i195 = i159 + 36;
        f5 = i195;
        J8 = i194;
        int i196 = i159 + 37;
        f5 = i196;
        K8 = i195;
        int i197 = i159 + 38;
        f5 = i197;
        L8 = i196;
        int i198 = i159 + 39;
        f5 = i198;
        M8 = i197;
        int i199 = i159 + 40;
        f5 = i199;
        N8 = i198;
        int i200 = i159 + 41;
        f5 = i200;
        O8 = i199;
        int i201 = i159 + 42;
        f5 = i201;
        P8 = i200;
        int i202 = i159 + 43;
        f5 = i202;
        Q8 = i201;
        int i203 = i159 + 44;
        f5 = i203;
        R8 = i202;
        int i204 = i159 + 45;
        f5 = i204;
        S8 = i203;
        f5 = i159 + 46;
        T8 = i204;
        int i205 = f5;
        int i206 = i205 + 1;
        f5 = i206;
        U8 = i205;
        int i207 = i205 + 2;
        f5 = i207;
        V8 = i206;
        int i208 = i205 + 3;
        f5 = i208;
        W8 = i207;
        int i209 = i205 + 4;
        f5 = i209;
        X8 = i208;
        int i210 = i205 + 5;
        f5 = i210;
        Y8 = i209;
        int i211 = i205 + 6;
        f5 = i211;
        Z8 = i210;
        int i212 = i205 + 7;
        f5 = i212;
        a9 = i211;
        int i213 = i205 + 8;
        f5 = i213;
        b9 = i212;
        int i214 = i205 + 9;
        f5 = i214;
        c9 = i213;
        int i215 = i205 + 10;
        f5 = i215;
        d9 = i214;
        int i216 = i205 + 11;
        f5 = i216;
        e9 = i215;
        int i217 = i205 + 12;
        f5 = i217;
        f9 = i216;
        int i218 = i205 + 13;
        f5 = i218;
        g9 = i217;
        int i219 = i205 + 14;
        f5 = i219;
        h9 = i218;
        int i220 = i205 + 15;
        f5 = i220;
        i9 = i219;
        int i221 = i205 + 16;
        f5 = i221;
        j9 = i220;
        int i222 = i205 + 17;
        f5 = i222;
        k9 = i221;
        int i223 = i205 + 18;
        f5 = i223;
        l9 = i222;
        int i224 = i205 + 19;
        f5 = i224;
        m9 = i223;
        int i225 = i205 + 20;
        f5 = i225;
        n9 = i224;
        int i226 = i205 + 21;
        f5 = i226;
        o9 = i225;
        int i227 = i205 + 22;
        f5 = i227;
        p9 = i226;
        int i228 = i205 + 23;
        f5 = i228;
        q9 = i227;
        int i229 = i205 + 24;
        f5 = i229;
        r9 = i228;
        int i230 = i205 + 25;
        f5 = i230;
        s9 = i229;
        int i231 = i205 + 26;
        f5 = i231;
        t9 = i230;
        int i232 = i205 + 27;
        f5 = i232;
        u9 = i231;
        int i233 = i205 + 28;
        f5 = i233;
        v9 = i232;
        int i234 = i205 + 29;
        f5 = i234;
        w9 = i233;
        int i235 = i205 + 30;
        f5 = i235;
        x9 = i234;
        int i236 = i205 + 31;
        f5 = i236;
        y9 = i235;
        int i237 = i205 + 32;
        f5 = i237;
        z9 = i236;
        int i238 = i205 + 33;
        f5 = i238;
        A9 = i237;
        int i239 = i205 + 34;
        f5 = i239;
        B9 = i238;
        int i240 = i205 + 35;
        f5 = i240;
        C9 = i239;
        int i241 = i205 + 36;
        f5 = i241;
        D9 = i240;
        int i242 = i205 + 37;
        f5 = i242;
        E9 = i241;
        int i243 = i205 + 38;
        f5 = i243;
        F9 = i242;
        int i244 = i205 + 39;
        f5 = i244;
        G9 = i243;
        int i245 = i205 + 40;
        f5 = i245;
        H9 = i244;
        int i246 = i205 + 41;
        f5 = i246;
        I9 = i245;
        int i247 = i205 + 42;
        f5 = i247;
        J9 = i246;
        int i248 = i205 + 43;
        f5 = i248;
        K9 = i247;
        int i249 = i205 + 44;
        f5 = i249;
        L9 = i248;
        int i250 = i205 + 45;
        f5 = i250;
        M9 = i249;
        int i251 = i205 + 46;
        f5 = i251;
        N9 = i250;
        int i252 = i205 + 47;
        f5 = i252;
        O9 = i251;
        int i253 = i205 + 48;
        f5 = i253;
        P9 = i252;
        f5 = i205 + 49;
        Q9 = i253;
        int i254 = f5;
        int i255 = i254 + 1;
        f5 = i255;
        R9 = i254;
        int i256 = i254 + 2;
        f5 = i256;
        S9 = i255;
        int i257 = i254 + 3;
        f5 = i257;
        T9 = i256;
        int i258 = i254 + 4;
        f5 = i258;
        U9 = i257;
        int i259 = i254 + 5;
        f5 = i259;
        V9 = i258;
        int i260 = i254 + 6;
        f5 = i260;
        W9 = i259;
        int i261 = i254 + 7;
        f5 = i261;
        X9 = i260;
        int i262 = i254 + 8;
        f5 = i262;
        Y9 = i261;
        int i263 = i254 + 9;
        f5 = i263;
        Z9 = i262;
        int i264 = i254 + 10;
        f5 = i264;
        aa = i263;
        int i265 = i254 + 11;
        f5 = i265;
        ba = i264;
        int i266 = i254 + 12;
        f5 = i266;
        ca = i265;
        int i267 = i254 + 13;
        f5 = i267;
        da = i266;
        int i268 = i254 + 14;
        f5 = i268;
        ea = i267;
        int i269 = i254 + 15;
        f5 = i269;
        fa = i268;
        int i270 = i254 + 16;
        f5 = i270;
        ga = i269;
        int i271 = i254 + 17;
        f5 = i271;
        ha = i270;
        int i272 = i254 + 18;
        f5 = i272;
        ia = i271;
        int i273 = i254 + 19;
        f5 = i273;
        ja = i272;
        int i274 = i254 + 20;
        f5 = i274;
        ka = i273;
        int i275 = i254 + 21;
        f5 = i275;
        la = i274;
        int i276 = i254 + 22;
        f5 = i276;
        ma = i275;
        int i277 = i254 + 23;
        f5 = i277;
        na = i276;
        int i278 = i254 + 24;
        f5 = i278;
        oa = i277;
        int i279 = i254 + 25;
        f5 = i279;
        pa = i278;
        int i280 = i254 + 26;
        f5 = i280;
        qa = i279;
        int i281 = i254 + 27;
        f5 = i281;
        ra = i280;
        int i282 = i254 + 28;
        f5 = i282;
        sa = i281;
        int i283 = i254 + 29;
        f5 = i283;
        ta = i282;
        int i284 = i254 + 30;
        f5 = i284;
        ua = i283;
        int i285 = i254 + 31;
        f5 = i285;
        va = i284;
        int i286 = i254 + 32;
        f5 = i286;
        wa = i285;
        int i287 = i254 + 33;
        f5 = i287;
        xa = i286;
        int i288 = i254 + 34;
        f5 = i288;
        ya = i287;
        za = i288;
        int i289 = i254 + 35;
        f5 = i289;
        Aa = i288;
        int i290 = i254 + 36;
        f5 = i290;
        Ba = i289;
        int i291 = i254 + 37;
        f5 = i291;
        Ca = i290;
        int i292 = i254 + 38;
        f5 = i292;
        Da = i291;
        int i293 = i254 + 39;
        f5 = i293;
        Ea = i292;
        int i294 = i254 + 40;
        f5 = i294;
        Fa = i293;
        Ga = i294;
        Ha = i294;
        int i295 = i254 + 41;
        f5 = i295;
        Ia = i294;
        int i296 = i254 + 42;
        f5 = i296;
        Ja = i295;
        int i297 = i254 + 43;
        f5 = i297;
        Ka = i296;
        int i298 = i254 + 44;
        f5 = i298;
        La = i297;
        int i299 = i254 + 45;
        f5 = i299;
        Ma = i298;
        f5 = i254 + 46;
        Na = i299;
        int i300 = f5;
        int i301 = i300 + 1;
        f5 = i301;
        Oa = i300;
        int i302 = i300 + 2;
        f5 = i302;
        Pa = i301;
        int i303 = i300 + 3;
        f5 = i303;
        Qa = i302;
        int i304 = i300 + 4;
        f5 = i304;
        Ra = i303;
        int i305 = i300 + 5;
        f5 = i305;
        Sa = i304;
        int i306 = i300 + 6;
        f5 = i306;
        Ta = i305;
        int i307 = i300 + 7;
        f5 = i307;
        Ua = i306;
        int i308 = i300 + 8;
        f5 = i308;
        Va = i307;
        int i309 = i300 + 9;
        f5 = i309;
        Wa = i308;
        int i310 = i300 + 10;
        f5 = i310;
        Xa = i309;
        int i311 = i300 + 11;
        f5 = i311;
        Ya = i310;
        int i312 = i300 + 12;
        f5 = i312;
        Za = i311;
        int i313 = i300 + 13;
        f5 = i313;
        ab = i312;
        int i314 = i300 + 14;
        f5 = i314;
        bb = i313;
        int i315 = i300 + 15;
        f5 = i315;
        cb = i314;
        int i316 = i300 + 16;
        f5 = i316;
        db = i315;
        int i317 = i300 + 17;
        f5 = i317;
        eb = i316;
        int i318 = i300 + 18;
        f5 = i318;
        fb = i317;
        int i319 = i300 + 19;
        f5 = i319;
        gb = i318;
        int i320 = i300 + 20;
        f5 = i320;
        hb = i319;
        int i321 = i300 + 21;
        f5 = i321;
        ib = i320;
        int i322 = i300 + 22;
        f5 = i322;
        jb = i321;
        int i323 = i300 + 23;
        f5 = i323;
        kb = i322;
        int i324 = i300 + 24;
        f5 = i324;
        lb = i323;
        int i325 = i300 + 25;
        f5 = i325;
        mb = i324;
        int i326 = i300 + 26;
        f5 = i326;
        nb = i325;
        int i327 = i300 + 27;
        f5 = i327;
        ob = i326;
        int i328 = i300 + 28;
        f5 = i328;
        pb = i327;
        int i329 = i300 + 29;
        f5 = i329;
        qb = i328;
        int i330 = i300 + 30;
        f5 = i330;
        rb = i329;
        int i331 = i300 + 31;
        f5 = i331;
        sb = i330;
        int i332 = i300 + 32;
        f5 = i332;
        tb = i331;
        int i333 = i300 + 33;
        f5 = i333;
        ub = i332;
        int i334 = i300 + 34;
        f5 = i334;
        vb = i333;
        int i335 = i300 + 35;
        f5 = i335;
        wb = i334;
        int i336 = i300 + 36;
        f5 = i336;
        xb = i335;
        int i337 = i300 + 37;
        f5 = i337;
        yb = i336;
        int i338 = i300 + 38;
        f5 = i338;
        zb = i337;
        int i339 = i300 + 39;
        f5 = i339;
        Ab = i338;
        int i340 = i300 + 40;
        f5 = i340;
        Bb = i339;
        int i341 = i300 + 41;
        f5 = i341;
        Cb = i340;
        int i342 = i300 + 42;
        f5 = i342;
        Db = i341;
        int i343 = i300 + 43;
        f5 = i343;
        Eb = i342;
        int i344 = i300 + 44;
        f5 = i344;
        Fb = i343;
        int i345 = i300 + 45;
        f5 = i345;
        Gb = i344;
        int i346 = i300 + 46;
        f5 = i346;
        Hb = i345;
        int i347 = i300 + 47;
        f5 = i347;
        Ib = i346;
        int i348 = i300 + 48;
        f5 = i348;
        Jb = i347;
        f5 = i300 + 49;
        Kb = i348;
        int i349 = f5;
        int i350 = i349 + 1;
        f5 = i350;
        Lb = i349;
        int i351 = i349 + 2;
        f5 = i351;
        Mb = i350;
        int i352 = i349 + 3;
        f5 = i352;
        Nb = i351;
        int i353 = i349 + 4;
        f5 = i353;
        Ob = i352;
        int i354 = i349 + 5;
        f5 = i354;
        Pb = i353;
        int i355 = i349 + 6;
        f5 = i355;
        Qb = i354;
        int i356 = i349 + 7;
        f5 = i356;
        Rb = i355;
        int i357 = i349 + 8;
        f5 = i357;
        Sb = i356;
        Tb = i357;
        Ub = i357;
        int i358 = i349 + 9;
        f5 = i358;
        Vb = i357;
        int i359 = i349 + 10;
        f5 = i359;
        Wb = i358;
        int i360 = i349 + 11;
        f5 = i360;
        Xb = i359;
        int i361 = i349 + 12;
        f5 = i361;
        Yb = i360;
        int i362 = i349 + 13;
        f5 = i362;
        Zb = i361;
        int i363 = i349 + 14;
        f5 = i363;
        ac = i362;
        int i364 = i349 + 15;
        f5 = i364;
        bc = i363;
        cc = i364;
        int i365 = i349 + 16;
        f5 = i365;
        dc = i364;
        int i366 = i349 + 17;
        f5 = i366;
        ec = i365;
        int i367 = i349 + 18;
        f5 = i367;
        fc = i366;
        int i368 = i349 + 19;
        f5 = i368;
        gc = i367;
        int i369 = i349 + 20;
        f5 = i369;
        hc = i368;
        int i370 = i349 + 21;
        f5 = i370;
        ic = i369;
        int i371 = i349 + 22;
        f5 = i371;
        jc = i370;
        int i372 = i349 + 23;
        f5 = i372;
        kc = i371;
        int i373 = i349 + 24;
        f5 = i373;
        lc = i372;
        int i374 = i349 + 25;
        f5 = i374;
        mc = i373;
        int i375 = i349 + 26;
        f5 = i375;
        nc = i374;
        int i376 = i349 + 27;
        f5 = i376;
        oc = i375;
        int i377 = i349 + 28;
        f5 = i377;
        pc = i376;
        int i378 = i349 + 29;
        f5 = i378;
        qc = i377;
        int i379 = i349 + 30;
        f5 = i379;
        rc = i378;
        int i380 = i349 + 31;
        f5 = i380;
        sc = i379;
        int i381 = i349 + 32;
        f5 = i381;
        tc = i380;
        int i382 = i349 + 33;
        f5 = i382;
        uc = i381;
        int i383 = i349 + 34;
        f5 = i383;
        vc = i382;
        int i384 = i349 + 35;
        f5 = i384;
        wc = i383;
        int i385 = i349 + 36;
        f5 = i385;
        xc = i384;
        int i386 = i349 + 37;
        f5 = i386;
        yc = i385;
        int i387 = i349 + 38;
        f5 = i387;
        zc = i386;
        int i388 = i349 + 39;
        f5 = i388;
        Ac = i387;
        int i389 = i349 + 40;
        f5 = i389;
        Bc = i388;
        int i390 = i349 + 41;
        f5 = i390;
        Cc = i389;
        int i391 = i349 + 42;
        f5 = i391;
        Dc = i390;
        int i392 = i349 + 43;
        f5 = i392;
        Ec = i391;
        int i393 = i349 + 44;
        f5 = i393;
        Fc = i392;
        int i394 = i349 + 45;
        f5 = i394;
        Gc = i393;
        f5 = i349 + 46;
        Hc = i394;
        int i395 = f5;
        int i396 = i395 + 1;
        f5 = i396;
        Ic = i395;
        int i397 = i395 + 2;
        f5 = i397;
        Jc = i396;
        int i398 = i395 + 3;
        f5 = i398;
        Kc = i397;
        int i399 = i395 + 4;
        f5 = i399;
        Lc = i398;
        int i400 = i395 + 5;
        f5 = i400;
        Mc = i399;
        int i401 = i395 + 6;
        f5 = i401;
        Nc = i400;
        int i402 = i395 + 7;
        f5 = i402;
        Oc = i401;
        int i403 = i395 + 8;
        f5 = i403;
        Pc = i402;
        int i404 = i395 + 9;
        f5 = i404;
        Qc = i403;
        int i405 = i395 + 10;
        f5 = i405;
        Rc = i404;
        int i406 = i395 + 11;
        f5 = i406;
        Sc = i405;
        int i407 = i395 + 12;
        f5 = i407;
        Tc = i406;
        int i408 = i395 + 13;
        f5 = i408;
        Uc = i407;
        int i409 = i395 + 14;
        f5 = i409;
        Vc = i408;
        int i410 = i395 + 15;
        f5 = i410;
        Wc = i409;
        int i411 = i395 + 16;
        f5 = i411;
        Xc = i410;
        int i412 = i395 + 17;
        f5 = i412;
        Yc = i411;
        int i413 = i395 + 18;
        f5 = i413;
        Zc = i412;
        int i414 = i395 + 19;
        f5 = i414;
        ad = i413;
        int i415 = i395 + 20;
        f5 = i415;
        bd = i414;
        int i416 = i395 + 21;
        f5 = i416;
        cd = i415;
        int i417 = i395 + 22;
        f5 = i417;
        dd = i416;
        int i418 = i395 + 23;
        f5 = i418;
        ed = i417;
        int i419 = i395 + 24;
        f5 = i419;
        fd = i418;
        int i420 = i395 + 25;
        f5 = i420;
        gd = i419;
        int i421 = i395 + 26;
        f5 = i421;
        hd = i420;
        int i422 = i395 + 27;
        f5 = i422;
        id = i421;
        int i423 = i395 + 28;
        f5 = i423;
        jd = i422;
        int i424 = i395 + 29;
        f5 = i424;
        kd = i423;
        int i425 = i395 + 30;
        f5 = i425;
        ld = i424;
        int i426 = i395 + 31;
        f5 = i426;
        md = i425;
        int i427 = i395 + 32;
        f5 = i427;
        nd = i426;
        int i428 = i395 + 33;
        f5 = i428;
        od = i427;
        int i429 = i395 + 34;
        f5 = i429;
        pd = i428;
        int i430 = i395 + 35;
        f5 = i430;
        qd = i429;
        int i431 = i395 + 36;
        f5 = i431;
        rd = i430;
        int i432 = i395 + 37;
        f5 = i432;
        sd = i431;
        int i433 = i395 + 38;
        f5 = i433;
        td = i432;
        int i434 = i395 + 39;
        f5 = i434;
        ud = i433;
        int i435 = i395 + 40;
        f5 = i435;
        vd = i434;
        int i436 = i395 + 41;
        f5 = i436;
        wd = i435;
        int i437 = i395 + 42;
        f5 = i437;
        xd = i436;
        int i438 = i395 + 43;
        f5 = i438;
        yd = i437;
        int i439 = i395 + 44;
        f5 = i439;
        zd = i438;
        int i440 = i395 + 45;
        f5 = i440;
        Ad = i439;
        int i441 = i395 + 46;
        f5 = i441;
        Bd = i440;
        int i442 = i395 + 47;
        f5 = i442;
        Cd = i441;
        int i443 = i395 + 48;
        f5 = i443;
        Dd = i442;
        f5 = i395 + 49;
        Ed = i443;
        int i444 = f5;
        int i445 = i444 + 1;
        f5 = i445;
        Fd = i444;
        int i446 = i444 + 2;
        f5 = i446;
        Gd = i445;
        int i447 = i444 + 3;
        f5 = i447;
        Hd = i446;
        int i448 = i444 + 4;
        f5 = i448;
        Id = i447;
        int i449 = i444 + 5;
        f5 = i449;
        Jd = i448;
        int i450 = i444 + 6;
        f5 = i450;
        Kd = i449;
        int i451 = i444 + 7;
        f5 = i451;
        Ld = i450;
        int i452 = i444 + 8;
        f5 = i452;
        Md = i451;
        int i453 = i444 + 9;
        f5 = i453;
        Nd = i452;
        int i454 = i444 + 10;
        f5 = i454;
        Od = i453;
        int i455 = i444 + 11;
        f5 = i455;
        Pd = i454;
        int i456 = i444 + 12;
        f5 = i456;
        Qd = i455;
        int i457 = i444 + 13;
        f5 = i457;
        Rd = i456;
        int i458 = i444 + 14;
        f5 = i458;
        Sd = i457;
        int i459 = i444 + 15;
        f5 = i459;
        Td = i458;
        int i460 = i444 + 16;
        f5 = i460;
        Ud = i459;
        int i461 = i444 + 17;
        f5 = i461;
        Vd = i460;
        int i462 = i444 + 18;
        f5 = i462;
        Wd = i461;
        int i463 = i444 + 19;
        f5 = i463;
        Xd = i462;
        int i464 = i444 + 20;
        f5 = i464;
        Yd = i463;
        int i465 = i444 + 21;
        f5 = i465;
        Zd = i464;
        int i466 = i444 + 22;
        f5 = i466;
        ae = i465;
        int i467 = i444 + 23;
        f5 = i467;
        be = i466;
        int i468 = i444 + 24;
        f5 = i468;
        ce = i467;
        int i469 = i444 + 25;
        f5 = i469;
        de = i468;
        int i470 = i444 + 26;
        f5 = i470;
        ee = i469;
        int i471 = i444 + 27;
        f5 = i471;
        fe = i470;
        int i472 = i444 + 28;
        f5 = i472;
        ge = i471;
        int i473 = i444 + 29;
        f5 = i473;
        he = i472;
        int i474 = i444 + 30;
        f5 = i474;
        ie = i473;
        int i475 = i444 + 31;
        f5 = i475;
        je = i474;
        int i476 = i444 + 32;
        f5 = i476;
        ke = i475;
        int i477 = i444 + 33;
        f5 = i477;
        le = i476;
        int i478 = i444 + 34;
        f5 = i478;
        me = i477;
        int i479 = i444 + 35;
        f5 = i479;
        ne = i478;
        int i480 = i444 + 36;
        f5 = i480;
        oe = i479;
        int i481 = i444 + 37;
        f5 = i481;
        pe = i480;
        int i482 = i444 + 38;
        f5 = i482;
        qe = i481;
        int i483 = i444 + 39;
        f5 = i483;
        re = i482;
        int i484 = i444 + 40;
        f5 = i484;
        se = i483;
        int i485 = i444 + 41;
        f5 = i485;
        te = i484;
        int i486 = i444 + 42;
        f5 = i486;
        ue = i485;
        int i487 = i444 + 43;
        f5 = i487;
        ve = i486;
        int i488 = i444 + 44;
        f5 = i488;
        we = i487;
        int i489 = i444 + 45;
        f5 = i489;
        xe = i488;
        int i490 = i444 + 46;
        f5 = i490;
        ye = i489;
        int i491 = i444 + 47;
        f5 = i491;
        ze = i490;
        int i492 = i444 + 48;
        f5 = i492;
        Ae = i491;
        f5 = i444 + 49;
        Be = i492;
        int i493 = f5;
        int i494 = i493 + 1;
        f5 = i494;
        Ce = i493;
        int i495 = i493 + 2;
        f5 = i495;
        De = i494;
        int i496 = i493 + 3;
        f5 = i496;
        Ee = i495;
        int i497 = i493 + 4;
        f5 = i497;
        Fe = i496;
        int i498 = i493 + 5;
        f5 = i498;
        Ge = i497;
        int i499 = i493 + 6;
        f5 = i499;
        He = i498;
        int i500 = i493 + 7;
        f5 = i500;
        Ie = i499;
        int i501 = i493 + 8;
        f5 = i501;
        Je = i500;
        int i502 = i493 + 9;
        f5 = i502;
        Ke = i501;
        int i503 = i493 + 10;
        f5 = i503;
        Le = i502;
        int i504 = i493 + 11;
        f5 = i504;
        Me = i503;
        int i505 = i493 + 12;
        f5 = i505;
        Ne = i504;
        int i506 = i493 + 13;
        f5 = i506;
        Oe = i505;
        int i507 = i493 + 14;
        f5 = i507;
        Pe = i506;
        int i508 = i493 + 15;
        f5 = i508;
        Qe = i507;
        int i509 = i493 + 16;
        f5 = i509;
        Re = i508;
        int i510 = i493 + 17;
        f5 = i510;
        Se = i509;
        int i511 = i493 + 18;
        f5 = i511;
        Te = i510;
        int i512 = i493 + 19;
        f5 = i512;
        Ue = i511;
        int i513 = i493 + 20;
        f5 = i513;
        Ve = i512;
        int i514 = i493 + 21;
        f5 = i514;
        We = i513;
        int i515 = i493 + 22;
        f5 = i515;
        Xe = i514;
        int i516 = i493 + 23;
        f5 = i516;
        Ye = i515;
        int i517 = i493 + 24;
        f5 = i517;
        Ze = i516;
        int i518 = i493 + 25;
        f5 = i518;
        af = i517;
        int i519 = i493 + 26;
        f5 = i519;
        bf = i518;
        int i520 = i493 + 27;
        f5 = i520;
        cf = i519;
        int i521 = i493 + 28;
        f5 = i521;
        df = i520;
        int i522 = i493 + 29;
        f5 = i522;
        ef = i521;
        int i523 = i493 + 30;
        f5 = i523;
        ff = i522;
        int i524 = i493 + 31;
        f5 = i524;
        gf = i523;
        int i525 = i493 + 32;
        f5 = i525;
        hf = i524;
        int i526 = i493 + 33;
        f5 = i526;
        jf = i525;
        int i527 = i493 + 34;
        f5 = i527;
        kf = i526;
        int i528 = i493 + 35;
        f5 = i528;
        lf = i527;
        int i529 = i493 + 36;
        f5 = i529;
        mf = i528;
        int i530 = i493 + 37;
        f5 = i530;
        nf = i529;
        int i531 = i493 + 38;
        f5 = i531;
        of = i530;
        int i532 = i493 + 39;
        f5 = i532;
        pf = i531;
        int i533 = i493 + 40;
        f5 = i533;
        qf = i532;
        int i534 = i493 + 41;
        f5 = i534;
        rf = i533;
        int i535 = i493 + 42;
        f5 = i535;
        sf = i534;
        int i536 = i493 + 43;
        f5 = i536;
        tf = i535;
        int i537 = i493 + 44;
        f5 = i537;
        uf = i536;
        int i538 = i493 + 45;
        f5 = i538;
        vf = i537;
        int i539 = i493 + 46;
        f5 = i539;
        wf = i538;
        int i540 = i493 + 47;
        f5 = i540;
        xf = i539;
        int i541 = i493 + 48;
        f5 = i541;
        yf = i540;
        f5 = i493 + 49;
        zf = i541;
        int i542 = f5;
        int i543 = i542 + 1;
        f5 = i543;
        Af = i542;
        int i544 = i542 + 2;
        f5 = i544;
        Bf = i543;
        int i545 = i542 + 3;
        f5 = i545;
        Cf = i544;
        int i546 = i542 + 4;
        f5 = i546;
        Df = i545;
        int i547 = i542 + 5;
        f5 = i547;
        Ef = i546;
        int i548 = i542 + 6;
        f5 = i548;
        Ff = i547;
        int i549 = i542 + 7;
        f5 = i549;
        Gf = i548;
        int i550 = i542 + 8;
        f5 = i550;
        Hf = i549;
        int i551 = i542 + 9;
        f5 = i551;
        If = i550;
        int i552 = i542 + 10;
        f5 = i552;
        Jf = i551;
        int i553 = i542 + 11;
        f5 = i553;
        Kf = i552;
        int i554 = i542 + 12;
        f5 = i554;
        Lf = i553;
        int i555 = i542 + 13;
        f5 = i555;
        Mf = i554;
        int i556 = i542 + 14;
        f5 = i556;
        Nf = i555;
        int i557 = i542 + 15;
        f5 = i557;
        Of = i556;
        int i558 = i542 + 16;
        f5 = i558;
        Pf = i557;
        int i559 = i542 + 17;
        f5 = i559;
        Qf = i558;
        int i560 = i542 + 18;
        f5 = i560;
        Rf = i559;
        int i561 = i542 + 19;
        f5 = i561;
        Sf = i560;
        int i562 = i542 + 20;
        f5 = i562;
        Tf = i561;
        int i563 = i542 + 21;
        f5 = i563;
        Uf = i562;
        int i564 = i542 + 22;
        f5 = i564;
        Vf = i563;
        int i565 = i542 + 23;
        f5 = i565;
        Wf = i564;
        int i566 = i542 + 24;
        f5 = i566;
        Xf = i565;
        int i567 = i542 + 25;
        f5 = i567;
        Yf = i566;
        int i568 = i542 + 26;
        f5 = i568;
        Zf = i567;
        int i569 = i542 + 27;
        f5 = i569;
        ag = i568;
        int i570 = i542 + 28;
        f5 = i570;
        bg = i569;
        int i571 = i542 + 29;
        f5 = i571;
        cg = i570;
        int i572 = i542 + 30;
        f5 = i572;
        dg = i571;
        int i573 = i542 + 31;
        f5 = i573;
        eg = i572;
        int i574 = i542 + 32;
        f5 = i574;
        fg = i573;
        int i575 = i542 + 33;
        f5 = i575;
        gg = i574;
        int i576 = i542 + 34;
        f5 = i576;
        hg = i575;
        int i577 = i542 + 35;
        f5 = i577;
        ig = i576;
        int i578 = i542 + 36;
        f5 = i578;
        jg = i577;
        int i579 = i542 + 37;
        f5 = i579;
        kg = i578;
        int i580 = i542 + 38;
        f5 = i580;
        lg = i579;
        int i581 = i542 + 39;
        f5 = i581;
        mg = i580;
        int i582 = i542 + 40;
        f5 = i582;
        ng = i581;
        int i583 = i542 + 41;
        f5 = i583;
        og = i582;
        int i584 = i542 + 42;
        f5 = i584;
        pg = i583;
        int i585 = i542 + 43;
        f5 = i585;
        qg = i584;
        int i586 = i542 + 44;
        f5 = i586;
        rg = i585;
        int i587 = i542 + 45;
        f5 = i587;
        sg = i586;
        int i588 = i542 + 46;
        f5 = i588;
        tg = i587;
        int i589 = i542 + 47;
        f5 = i589;
        ug = i588;
        int i590 = i542 + 48;
        f5 = i590;
        vg = i589;
        f5 = i542 + 49;
        wg = i590;
        int i591 = f5;
        int i592 = i591 + 1;
        f5 = i592;
        xg = i591;
        int i593 = i591 + 2;
        f5 = i593;
        yg = i592;
        int i594 = i591 + 3;
        f5 = i594;
        zg = i593;
        int i595 = i591 + 4;
        f5 = i595;
        Ag = i594;
        int i596 = i591 + 5;
        f5 = i596;
        Bg = i595;
        int i597 = i591 + 6;
        f5 = i597;
        Cg = i596;
        int i598 = i591 + 7;
        f5 = i598;
        Dg = i597;
        int i599 = i591 + 8;
        f5 = i599;
        Eg = i598;
        int i600 = i591 + 9;
        f5 = i600;
        Fg = i599;
        int i601 = i591 + 10;
        f5 = i601;
        Gg = i600;
        int i602 = i591 + 11;
        f5 = i602;
        Hg = i601;
        int i603 = i591 + 12;
        f5 = i603;
        Ig = i602;
        int i604 = i591 + 13;
        f5 = i604;
        Jg = i603;
        int i605 = i591 + 14;
        f5 = i605;
        Kg = i604;
        int i606 = i591 + 15;
        f5 = i606;
        Lg = i605;
        int i607 = i591 + 16;
        f5 = i607;
        Mg = i606;
        int i608 = i591 + 17;
        f5 = i608;
        Ng = i607;
        int i609 = i591 + 18;
        f5 = i609;
        Og = i608;
        int i610 = i591 + 19;
        f5 = i610;
        Pg = i609;
        int i611 = i591 + 20;
        f5 = i611;
        Qg = i610;
        int i612 = i591 + 21;
        f5 = i612;
        Rg = i611;
        int i613 = i591 + 22;
        f5 = i613;
        Sg = i612;
        int i614 = i591 + 23;
        f5 = i614;
        Tg = i613;
        int i615 = i591 + 24;
        f5 = i615;
        Ug = i614;
        int i616 = i591 + 25;
        f5 = i616;
        Vg = i615;
        int i617 = i591 + 26;
        f5 = i617;
        Wg = i616;
        int i618 = i591 + 27;
        f5 = i618;
        Xg = i617;
        int i619 = i591 + 28;
        f5 = i619;
        Yg = i618;
        int i620 = i591 + 29;
        f5 = i620;
        Zg = i619;
        int i621 = i591 + 30;
        f5 = i621;
        ah = i620;
        int i622 = i591 + 31;
        f5 = i622;
        bh = i621;
        int i623 = i591 + 32;
        f5 = i623;
        ch = i622;
        int i624 = i591 + 33;
        f5 = i624;
        dh = i623;
        int i625 = i591 + 34;
        f5 = i625;
        eh = i624;
        int i626 = i591 + 35;
        f5 = i626;
        fh = i625;
        int i627 = i591 + 36;
        f5 = i627;
        gh = i626;
        int i628 = i591 + 37;
        f5 = i628;
        hh = i627;
        int i629 = i591 + 38;
        f5 = i629;
        ih = i628;
        int i630 = i591 + 39;
        f5 = i630;
        jh = i629;
        int i631 = i591 + 40;
        f5 = i631;
        kh = i630;
        int i632 = i591 + 41;
        f5 = i632;
        lh = i631;
        int i633 = i591 + 42;
        f5 = i633;
        mh = i632;
        int i634 = i591 + 43;
        f5 = i634;
        nh = i633;
        int i635 = i591 + 44;
        f5 = i635;
        oh = i634;
        int i636 = i591 + 45;
        f5 = i636;
        ph = i635;
        int i637 = i591 + 46;
        f5 = i637;
        qh = i636;
        int i638 = i591 + 47;
        f5 = i638;
        rh = i637;
        int i639 = i591 + 48;
        f5 = i639;
        sh = i638;
        f5 = i591 + 49;
        th = i639;
        int i640 = f5;
        int i641 = i640 + 1;
        f5 = i641;
        uh = i640;
        int i642 = i640 + 2;
        f5 = i642;
        vh = i641;
        int i643 = i640 + 3;
        f5 = i643;
        wh = i642;
        int i644 = i640 + 4;
        f5 = i644;
        xh = i643;
        int i645 = i640 + 5;
        f5 = i645;
        yh = i644;
        int i646 = i640 + 6;
        f5 = i646;
        zh = i645;
        int i647 = i640 + 7;
        f5 = i647;
        Ah = i646;
        int i648 = i640 + 8;
        f5 = i648;
        Bh = i647;
        int i649 = i640 + 9;
        f5 = i649;
        Ch = i648;
        int i650 = i640 + 10;
        f5 = i650;
        Dh = i649;
        int i651 = i640 + 11;
        f5 = i651;
        Eh = i650;
        int i652 = i640 + 12;
        f5 = i652;
        Fh = i651;
        int i653 = i640 + 13;
        f5 = i653;
        Gh = i652;
        int i654 = i640 + 14;
        f5 = i654;
        Hh = i653;
        int i655 = i640 + 15;
        f5 = i655;
        Ih = i654;
        int i656 = i640 + 16;
        f5 = i656;
        Jh = i655;
        int i657 = i640 + 17;
        f5 = i657;
        Kh = i656;
        int i658 = i640 + 18;
        f5 = i658;
        Lh = i657;
        int i659 = i640 + 19;
        f5 = i659;
        Mh = i658;
        int i660 = i640 + 20;
        f5 = i660;
        Nh = i659;
        int i661 = i640 + 21;
        f5 = i661;
        Oh = i660;
        int i662 = i640 + 22;
        f5 = i662;
        Ph = i661;
        int i663 = i640 + 23;
        f5 = i663;
        Qh = i662;
        int i664 = i640 + 24;
        f5 = i664;
        Rh = i663;
        int i665 = i640 + 25;
        f5 = i665;
        Sh = i664;
        int i666 = i640 + 26;
        f5 = i666;
        Th = i665;
        int i667 = i640 + 27;
        f5 = i667;
        Uh = i666;
        int i668 = i640 + 28;
        f5 = i668;
        Vh = i667;
        int i669 = i640 + 29;
        f5 = i669;
        Wh = i668;
        int i670 = i640 + 30;
        f5 = i670;
        Xh = i669;
        int i671 = i640 + 31;
        f5 = i671;
        Yh = i670;
        int i672 = i640 + 32;
        f5 = i672;
        Zh = i671;
        int i673 = i640 + 33;
        f5 = i673;
        ai = i672;
        int i674 = i640 + 34;
        f5 = i674;
        bi = i673;
        int i675 = i640 + 35;
        f5 = i675;
        ci = i674;
        int i676 = i640 + 36;
        f5 = i676;
        di = i675;
        int i677 = i640 + 37;
        f5 = i677;
        ei = i676;
        int i678 = i640 + 38;
        f5 = i678;
        fi = i677;
        int i679 = i640 + 39;
        f5 = i679;
        gi = i678;
        int i680 = i640 + 40;
        f5 = i680;
        hi = i679;
        int i681 = i640 + 41;
        f5 = i681;
        ii = i680;
        int i682 = i640 + 42;
        f5 = i682;
        ji = i681;
        int i683 = i640 + 43;
        f5 = i683;
        ki = i682;
        int i684 = i640 + 44;
        f5 = i684;
        li = i683;
        int i685 = i640 + 45;
        f5 = i685;
        mi = i684;
        int i686 = i640 + 46;
        f5 = i686;
        ni = i685;
        int i687 = i640 + 47;
        f5 = i687;
        oi = i686;
        int i688 = i640 + 48;
        f5 = i688;
        pi = i687;
        f5 = i640 + 49;
        qi = i688;
        int i689 = f5;
        int i690 = i689 + 1;
        f5 = i690;
        ri = i689;
        int i691 = i689 + 2;
        f5 = i691;
        si = i690;
        int i692 = i689 + 3;
        f5 = i692;
        ti = i691;
        int i693 = i689 + 4;
        f5 = i693;
        ui = i692;
        int i694 = i689 + 5;
        f5 = i694;
        vi = i693;
        int i695 = i689 + 6;
        f5 = i695;
        wi = i694;
        int i696 = i689 + 7;
        f5 = i696;
        xi = i695;
        int i697 = i689 + 8;
        f5 = i697;
        yi = i696;
        int i698 = i689 + 9;
        f5 = i698;
        zi = i697;
        int i699 = i689 + 10;
        f5 = i699;
        Ai = i698;
        int i700 = i689 + 11;
        f5 = i700;
        Bi = i699;
        int i701 = i689 + 12;
        f5 = i701;
        Ci = i700;
        int i702 = i689 + 13;
        f5 = i702;
        Di = i701;
        int i703 = i689 + 14;
        f5 = i703;
        Ei = i702;
        int i704 = i689 + 15;
        f5 = i704;
        Fi = i703;
        int i705 = i689 + 16;
        f5 = i705;
        Gi = i704;
        int i706 = i689 + 17;
        f5 = i706;
        Hi = i705;
        int i707 = i689 + 18;
        f5 = i707;
        Ii = i706;
        int i708 = i689 + 19;
        f5 = i708;
        Ji = i707;
        int i709 = i689 + 20;
        f5 = i709;
        Ki = i708;
        int i710 = i689 + 21;
        f5 = i710;
        Li = i709;
        int i711 = i689 + 22;
        f5 = i711;
        Mi = i710;
        int i712 = i689 + 23;
        f5 = i712;
        Ni = i711;
        int i713 = i689 + 24;
        f5 = i713;
        Oi = i712;
        int i714 = i689 + 25;
        f5 = i714;
        Pi = i713;
        int i715 = i689 + 26;
        f5 = i715;
        Qi = i714;
        int i716 = i689 + 27;
        f5 = i716;
        Ri = i715;
        int i717 = i689 + 28;
        f5 = i717;
        Si = i716;
        int i718 = i689 + 29;
        f5 = i718;
        Ti = i717;
        int i719 = i689 + 30;
        f5 = i719;
        Ui = i718;
        int i720 = i689 + 31;
        f5 = i720;
        Vi = i719;
        int i721 = i689 + 32;
        f5 = i721;
        Wi = i720;
        int i722 = i689 + 33;
        f5 = i722;
        Xi = i721;
        int i723 = i689 + 34;
        f5 = i723;
        Yi = i722;
        int i724 = i689 + 35;
        f5 = i724;
        Zi = i723;
        int i725 = i689 + 36;
        f5 = i725;
        aj = i724;
        int i726 = i689 + 37;
        f5 = i726;
        bj = i725;
        int i727 = i689 + 38;
        f5 = i727;
        cj = i726;
        int i728 = i689 + 39;
        f5 = i728;
        dj = i727;
        int i729 = i689 + 40;
        f5 = i729;
        ej = i728;
        int i730 = i689 + 41;
        f5 = i730;
        fj = i729;
        int i731 = i689 + 42;
        f5 = i731;
        gj = i730;
        int i732 = i689 + 43;
        f5 = i732;
        hj = i731;
        int i733 = i689 + 44;
        f5 = i733;
        ij = i732;
        int i734 = i689 + 45;
        f5 = i734;
        jj = i733;
        int i735 = i689 + 46;
        f5 = i735;
        kj = i734;
        int i736 = i689 + 47;
        f5 = i736;
        lj = i735;
        int i737 = i689 + 48;
        f5 = i737;
        mj = i736;
        f5 = i689 + 49;
        nj = i737;
        int i738 = f5;
        int i739 = i738 + 1;
        f5 = i739;
        oj = i738;
        int i740 = i738 + 2;
        f5 = i740;
        pj = i739;
        int i741 = i738 + 3;
        f5 = i741;
        qj = i740;
        int i742 = i738 + 4;
        f5 = i742;
        rj = i741;
        int i743 = i738 + 5;
        f5 = i743;
        sj = i742;
        int i744 = i738 + 6;
        f5 = i744;
        tj = i743;
        int i745 = i738 + 7;
        f5 = i745;
        uj = i744;
        int i746 = i738 + 8;
        f5 = i746;
        vj = i745;
        int i747 = i738 + 9;
        f5 = i747;
        wj = i746;
        int i748 = i738 + 10;
        f5 = i748;
        xj = i747;
        int i749 = i738 + 11;
        f5 = i749;
        yj = i748;
        int i750 = i738 + 12;
        f5 = i750;
        zj = i749;
        int i751 = i738 + 13;
        f5 = i751;
        Aj = i750;
        Bj = new int[]{i742, i743, i744, i745, i746, i747, i748, i749, i750};
        int i752 = i738 + 14;
        f5 = i752;
        Cj = i751;
        int i753 = i738 + 15;
        f5 = i753;
        Dj = i752;
        int i754 = i738 + 16;
        f5 = i754;
        Ej = i753;
        int i755 = i738 + 17;
        f5 = i755;
        Fj = i754;
        int i756 = i738 + 18;
        f5 = i756;
        Gj = i755;
        int i757 = i738 + 19;
        f5 = i757;
        Hj = i756;
        int i758 = i738 + 20;
        f5 = i758;
        Ij = i757;
        int i759 = i738 + 21;
        f5 = i759;
        Jj = i758;
        int i760 = i738 + 22;
        f5 = i760;
        Kj = i759;
        int i761 = i738 + 23;
        f5 = i761;
        Lj = i760;
        int i762 = i738 + 24;
        f5 = i762;
        Mj = i761;
        int i763 = i738 + 25;
        f5 = i763;
        Nj = i762;
        int i764 = i738 + 26;
        f5 = i764;
        Oj = i763;
        int i765 = i738 + 27;
        f5 = i765;
        Pj = i764;
        int i766 = i738 + 28;
        f5 = i766;
        Qj = i765;
        int i767 = i738 + 29;
        f5 = i767;
        Rj = i766;
        int i768 = i738 + 30;
        f5 = i768;
        Sj = i767;
        int i769 = i738 + 31;
        f5 = i769;
        Tj = i768;
        int i770 = i738 + 32;
        f5 = i770;
        Uj = i769;
        int i771 = i738 + 33;
        f5 = i771;
        Vj = i770;
        int i772 = i738 + 34;
        f5 = i772;
        Wj = i771;
        int i773 = i738 + 35;
        f5 = i773;
        Xj = i772;
        int i774 = i738 + 36;
        f5 = i774;
        Yj = i773;
        int i775 = i738 + 37;
        f5 = i775;
        Zj = i774;
        int i776 = i738 + 38;
        f5 = i776;
        ak = i775;
        int i777 = i738 + 39;
        f5 = i777;
        bk = i776;
        int i778 = i738 + 40;
        f5 = i778;
        ck = i777;
        int i779 = i738 + 41;
        f5 = i779;
        dk = i778;
        int i780 = i738 + 42;
        f5 = i780;
        ek = i779;
        int i781 = i738 + 43;
        f5 = i781;
        fk = i780;
        int i782 = i738 + 44;
        f5 = i782;
        gk = i781;
        int i783 = i738 + 45;
        f5 = i783;
        hk = i782;
        int i784 = i738 + 46;
        f5 = i784;
        ik = i783;
        int i785 = i738 + 47;
        f5 = i785;
        jk = i784;
        f5 = i738 + 48;
        kk = i785;
        int i786 = f5;
        int i787 = i786 + 1;
        f5 = i787;
        lk = i786;
        int i788 = i786 + 2;
        f5 = i788;
        mk = i787;
        int i789 = i786 + 3;
        f5 = i789;
        nk = i788;
        int i790 = i786 + 4;
        f5 = i790;
        ok = i789;
        int i791 = i786 + 5;
        f5 = i791;
        pk = i790;
        int i792 = i786 + 6;
        f5 = i792;
        qk = i791;
        int i793 = i786 + 7;
        f5 = i793;
        rk = i792;
        int i794 = i786 + 8;
        f5 = i794;
        sk = i793;
        int i795 = i786 + 9;
        f5 = i795;
        tk = i794;
        int i796 = i786 + 10;
        f5 = i796;
        uk = i795;
        int i797 = i786 + 11;
        f5 = i797;
        vk = i796;
        int i798 = i786 + 12;
        f5 = i798;
        wk = i797;
        int i799 = i786 + 13;
        f5 = i799;
        xk = i798;
        int i800 = i786 + 14;
        f5 = i800;
        yk = i799;
        int i801 = i786 + 15;
        f5 = i801;
        zk = i800;
        int i802 = i786 + 16;
        f5 = i802;
        Ak = i801;
        int i803 = i786 + 17;
        f5 = i803;
        Bk = i802;
        int i804 = i786 + 18;
        f5 = i804;
        Ck = i803;
        int i805 = i786 + 19;
        f5 = i805;
        Dk = i804;
        int i806 = i786 + 20;
        f5 = i806;
        Ek = i805;
        int i807 = i786 + 21;
        f5 = i807;
        Fk = i806;
        int i808 = i786 + 22;
        f5 = i808;
        Gk = i807;
        Hk = new int[]{i797};
        int i809 = i786 + 23;
        f5 = i809;
        Ik = i808;
        int i810 = i786 + 24;
        f5 = i810;
        Jk = i809;
        int i811 = i786 + 25;
        f5 = i811;
        Kk = i810;
        int i812 = i786 + 26;
        f5 = i812;
        Lk = i811;
        int i813 = i786 + 27;
        f5 = i813;
        Mk = i812;
        int i814 = i786 + 28;
        f5 = i814;
        Nk = i813;
        int i815 = i786 + 29;
        f5 = i815;
        Ok = i814;
        int i816 = i786 + 30;
        f5 = i816;
        Pk = i815;
        int i817 = i786 + 31;
        f5 = i817;
        Qk = i816;
        int i818 = i786 + 32;
        f5 = i818;
        Rk = i817;
        int i819 = i786 + 33;
        f5 = i819;
        Sk = i818;
        int i820 = i786 + 34;
        f5 = i820;
        Tk = i819;
        int i821 = i786 + 35;
        f5 = i821;
        Uk = i820;
        int i822 = i786 + 36;
        f5 = i822;
        Vk = i821;
        int i823 = i786 + 37;
        f5 = i823;
        Wk = i822;
        int i824 = i786 + 38;
        f5 = i824;
        Xk = i823;
        int i825 = i786 + 39;
        f5 = i825;
        Yk = i824;
        int i826 = i786 + 40;
        f5 = i826;
        Zk = i825;
        int i827 = i786 + 41;
        f5 = i827;
        al = i826;
        int i828 = i786 + 42;
        f5 = i828;
        bl = i827;
        int i829 = i786 + 43;
        f5 = i829;
        cl = i828;
        int i830 = i786 + 44;
        f5 = i830;
        dl = i829;
        int i831 = i786 + 45;
        f5 = i831;
        el = i830;
        int i832 = i786 + 46;
        f5 = i832;
        fl = i831;
        int i833 = i786 + 47;
        f5 = i833;
        gl = i832;
        f5 = i786 + 48;
        hl = i833;
        int i834 = f5;
        f5 = i834 + 1;
        il = i834;
        jl = new HashMap();
        kl = new HashMap();
        ll = new HashMap();
        ml = new HashMap();
        SparseIntArray sparseIntArray = new SparseIntArray();
        ol = sparseIntArray;
        pl = new HashSet();
        ul = new ThreadLocal();
        vl = new ThreadLocal();
        wl = new ThreadLocal();
        xl = new ThreadLocal();
        yl = new ThreadLocal();
        nl = e5.e();
        sparseIntArray.put(i815, d6);
        int i835 = a7;
        sparseIntArray.put(i816, i835);
        sparseIntArray.put(i818, i835);
        sparseIntArray.put(Ki, ci);
        sparseIntArray.put(Mi, q7);
        int i836 = Oh;
        sparseIntArray.put(i817, i836);
        sparseIntArray.put(Ph, i836);
        sparseIntArray.put(b6, i835);
        int i837 = c6;
        int i838 = z6;
        sparseIntArray.put(i837, i838);
        sparseIntArray.put(Sc, Qh);
        int i839 = Tc;
        int i840 = ab;
        sparseIntArray.put(i839, i840);
        sparseIntArray.put(bb, i840);
        sparseIntArray.put(ld, nd);
        sparseIntArray.put(md, od);
        sparseIntArray.put(Ui, Ti);
        sparseIntArray.put(vd, ud);
        sparseIntArray.put(xb, wb);
        sparseIntArray.put(Ie, Pe);
        sparseIntArray.put(qi, ni);
        sparseIntArray.put(Wh, i836);
        sparseIntArray.put(f7, i838);
        sparseIntArray.put(uc, ra);
        sparseIntArray.put(Pa, Aa);
        sparseIntArray.put(vc, dc);
        sparseIntArray.put(Qa, Ba);
        sparseIntArray.put(M5, i835);
        sparseIntArray.put(N5, I9);
        SparseIntArray sparseIntArray2 = ol;
        sparseIntArray2.put(di, O9);
        sparseIntArray2.put(Lh, i835);
        sparseIntArray2.put(oa, ka);
        sparseIntArray2.put(T8, n6);
        int i841 = u6;
        int i842 = I6;
        sparseIntArray2.put(i841, i842);
        sparseIntArray2.put(v6, i842);
        sparseIntArray2.put(Fi, qf);
        int i843 = Gi;
        int i844 = pf;
        sparseIntArray2.put(i843, i844);
        sparseIntArray2.put(Hi, i844);
        int i845 = e6;
        int i846 = d6;
        sparseIntArray2.put(i845, i846);
        sparseIntArray2.put(f6, i846);
        sparseIntArray2.put(O6, M6);
        sparseIntArray2.put(P6, N6);
        sparseIntArray2.put(Q6, i846);
        sparseIntArray2.put(R6, i846);
        sparseIntArray2.put(g6, i846);
        sparseIntArray2.put(H7, B7);
        sparseIntArray2.put(I7, C7);
        int i847 = S6;
        int i848 = i6;
        sparseIntArray2.put(i847, i848);
        sparseIntArray2.put(T6, i848);
        sparseIntArray2.put(j6, i848);
        int i849 = Ne;
        int i850 = Me;
        sparseIntArray2.put(i849, i850);
        sparseIntArray2.put(Je, i850);
        sparseIntArray2.put(Ue, q6);
        sparseIntArray2.put(Qe, Oe);
        int i851 = Ii;
        int i852 = Pe;
        sparseIntArray2.put(i851, i852);
        sparseIntArray2.put(Ji, Qi);
        sparseIntArray2.put(O5, i852);
        sparseIntArray2.put(P5, i850);
        sparseIntArray2.put(Q5, i850);
        int i853 = R5;
        int i854 = G6;
        sparseIntArray2.put(i853, i854);
        SparseIntArray sparseIntArray3 = ol;
        sparseIntArray3.put(xa, we);
        sparseIntArray3.put(ya, i854);
        int i855 = S5;
        int i856 = B5;
        sparseIntArray3.put(i855, i856);
        sparseIntArray3.put(T5, i856);
        sparseIntArray3.put(U5, C5);
        sparseIntArray3.put(V5, Ke);
        sparseIntArray3.put(M8, s8);
        int i857 = N8;
        int i858 = t8;
        sparseIntArray3.put(i857, i858);
        sparseIntArray3.put(O8, v8);
        sparseIntArray3.put(P8, i854);
        sparseIntArray3.put(Q8, C8);
        sparseIntArray3.put(R8, D8);
        int i859 = i9;
        int i860 = g9;
        sparseIntArray3.put(i859, i860);
        int i861 = m9;
        int i862 = k9;
        sparseIntArray3.put(i861, i862);
        sparseIntArray3.put(Y8, X8);
        sparseIntArray3.put(l9, i862);
        sparseIntArray3.put(n9, i862);
        sparseIntArray3.put(h9, i860);
        int i863 = M7;
        int i864 = V8;
        sparseIntArray3.put(i863, i864);
        int i865 = c9;
        int i866 = P9;
        sparseIntArray3.put(i865, i866);
        sparseIntArray3.put(d9, i864);
        int i867 = e9;
        int i868 = O9;
        sparseIntArray3.put(i867, i868);
        sparseIntArray3.put(f9, i868);
        sparseIntArray3.put(F8, J5);
        sparseIntArray3.put(j7, i864);
        int i869 = pa;
        int i870 = B8;
        sparseIntArray3.put(i869, i870);
        int i871 = qa;
        int i872 = Di;
        sparseIntArray3.put(i871, i872);
        sparseIntArray3.put(Ia, i872);
        int i873 = I8;
        int i874 = A8;
        sparseIntArray3.put(i873, i874);
        sparseIntArray3.put(J8, i870);
        SparseIntArray sparseIntArray4 = ol;
        sparseIntArray4.put(K8, i874);
        sparseIntArray4.put(L8, i858);
        sparseIntArray4.put(Bh, h8);
        sparseIntArray4.put(M9, e8);
        sparseIntArray4.put(Mb, Ld);
        sparseIntArray4.put(H8, a7);
        int i875 = aa;
        int i876 = j5;
        sparseIntArray4.put(i875, i876);
        sparseIntArray4.put(ba, Fc);
        sparseIntArray4.put(ca, i876);
        sparseIntArray4.put(da, c7);
        sparseIntArray4.put(S8, s8);
        sparseIntArray4.put(v9, u9);
        sparseIntArray4.put(La, Ja);
        sparseIntArray4.put(Ma, Ka);
        sparseIntArray4.put(R9, i864);
        sparseIntArray4.put(S9, i866);
        sparseIntArray4.put(N7, K7);
        sparseIntArray4.put(Rh, Qh);
        int i877 = W5;
        int i878 = Si;
        sparseIntArray4.put(i877, i878);
        sparseIntArray4.put(X5, i878);
        sparseIntArray4.put(ui, i876);
        int i879 = vi;
        int i880 = t6;
        sparseIntArray4.put(i879, i880);
        sparseIntArray4.put(wi, h5);
        sparseIntArray4.put(xi, i5);
        sparseIntArray4.put(oi, i880);
        sparseIntArray4.put(ri, w6);
        int i881 = Vb;
        int i882 = Md;
        sparseIntArray4.put(i881, i882);
        sparseIntArray4.put(uf, i882);
        int i883 = vf;
        sparseIntArray4.put(i883, Wd);
        SparseIntArray sparseIntArray5 = ol;
        sparseIntArray5.put(Wb, i883);
        int i884 = ea;
        int i885 = na;
        sparseIntArray5.put(i884, i885);
        sparseIntArray5.put(fa, i885);
        int i886 = ga;
        int i887 = ka;
        sparseIntArray5.put(i886, i887);
        sparseIntArray5.put(ha, i887);
        sparseIntArray5.put(zf, S5);
        sparseIntArray5.put(W9, B5);
        sparseIntArray5.put(o7, m6);
        sparseIntArray5.put(Eh, y6);
        int i888 = Fh;
        int i889 = L6;
        sparseIntArray5.put(i888, i889);
        sparseIntArray5.put(Gh, i889);
        sparseIntArray5.put(Hh, i6);
        sparseIntArray5.put(ma, la);
        int i890 = Pc;
        int i891 = l8;
        sparseIntArray5.put(i890, i891);
        sparseIntArray5.put(Zb, i891);
        sparseIntArray5.put(ob, sb);
        sparseIntArray5.put(pb, nb);
        int i892 = z7;
        int i893 = d6;
        sparseIntArray5.put(i892, i893);
        int i894 = Y5;
        int i895 = O7;
        sparseIntArray5.put(i894, i895);
        sparseIntArray5.put(Cj, ie);
        sparseIntArray5.put(Sb, Nb);
        sparseIntArray5.put(Hj, Aa);
        sparseIntArray5.put(Ij, fc);
        int i896 = Ej;
        sparseIntArray5.put(i896, Kc);
        sparseIntArray5.put(Dj, Xa);
        sparseIntArray5.put(Fj, i893);
        sparseIntArray5.put(Gj, i893);
        sparseIntArray5.put(Z5, jh);
        SparseIntArray sparseIntArray6 = ol;
        sparseIntArray6.put(dk, U8);
        sparseIntArray6.put(ek, g9);
        sparseIntArray6.put(L7, K7);
        sparseIntArray6.put(V7, i895);
        sparseIntArray6.put(W7, P7);
        sparseIntArray6.put(X7, Q7);
        sparseIntArray6.put(Y7, R7);
        sparseIntArray6.put(Z7, S7);
        sparseIntArray6.put(a8, T7);
        sparseIntArray6.put(b8, U7);
        sparseIntArray6.put(r9, q9);
        sparseIntArray6.put(nj, xj);
        sparseIntArray6.put(hj, tj);
        sparseIntArray6.put(jj, wj);
        sparseIntArray6.put(lj, sj);
        sparseIntArray6.put(kj, yj);
        int i897 = pj;
        int i898 = zj;
        sparseIntArray6.put(i897, i898);
        sparseIntArray6.put(oj, i898);
        sparseIntArray6.put(qj, Aj);
        int i899 = ua;
        int i900 = a7;
        sparseIntArray6.put(i899, i900);
        sparseIntArray6.put(va, i896);
        int i901 = ph;
        sparseIntArray6.put(i901, e7);
        int i902 = qh;
        sparseIntArray6.put(i902, d7);
        sparseIntArray6.put(rk, i901);
        int i903 = sk;
        int i904 = qk;
        sparseIntArray6.put(i903, i904);
        sparseIntArray6.put(tk, i902);
        sparseIntArray6.put(uk, i902);
        sparseIntArray6.put(yk, i904);
        SparseIntArray sparseIntArray7 = ol;
        int i905 = Vk;
        int i906 = G6;
        sparseIntArray7.put(i905, i906);
        sparseIntArray7.put(Uk, i900);
        sparseIntArray7.put(Tk, i906);
        sparseIntArray7.put(Wk, Xd);
        sparseIntArray7.put(Xk, Ud);
        int i907 = Yk;
        int i908 = h5;
        sparseIntArray7.put(i907, i908);
        sparseIntArray7.put(Zk, i908);
        int i909 = al;
        int i910 = Yd;
        sparseIntArray7.put(i909, i910);
        sparseIntArray7.put(bl, i910);
        sparseIntArray7.put(cl, i906);
        sparseIntArray7.put(A8, i906);
        sparseIntArray7.put(gl, i906);
        sparseIntArray7.put(vh, i906);
        sparseIntArray7.put(hl, i910);
        int i911 = il;
        sparseIntArray7.put(i911, q6);
        sparseIntArray7.put(Cf, ec);
        int i912 = Df;
        int i913 = Oh;
        sparseIntArray7.put(i912, i913);
        int i914 = Ef;
        int i915 = Qh;
        sparseIntArray7.put(i914, i915);
        int i916 = Ff;
        int i917 = Sh;
        sparseIntArray7.put(i916, i917);
        int i918 = If;
        int i919 = i8;
        sparseIntArray7.put(i918, i919);
        int i920 = Lf;
        int i921 = l8;
        sparseIntArray7.put(i920, i921);
        sparseIntArray7.put(Of, i911);
        sparseIntArray7.put(Rf, fc);
        sparseIntArray7.put(Sf, i913);
        sparseIntArray7.put(Tf, i915);
        sparseIntArray7.put(Uf, i917);
        sparseIntArray7.put(Xf, i919);
        sparseIntArray7.put(ag, i921);
        sparseIntArray7.put(dg, i911);
        int i922 = 0;
        while (true) {
            int[] iArr = p8;
            if (i922 >= iArr.length) {
                break;
            }
            pl.add(Integer.valueOf(iArr[i922]));
            i922++;
        }
        int i923 = 0;
        while (true) {
            int[] iArr2 = q8;
            if (i923 >= iArr2.length) {
                break;
            }
            pl.add(Integer.valueOf(iArr2[i923]));
            i923++;
        }
        int i924 = 0;
        while (true) {
            int[] iArr3 = r8;
            if (i924 >= iArr3.length) {
                break;
            }
            pl.add(Integer.valueOf(iArr3[i924]));
            i924++;
        }
        int i925 = 0;
        while (true) {
            int[] iArr4 = Bj;
            if (i925 >= iArr4.length) {
                break;
            }
            pl.add(Integer.valueOf(iArr4[i925]));
            i925++;
        }
        HashSet hashSet = pl;
        hashSet.add(Integer.valueOf(ja));
        hashSet.add(Integer.valueOf(hj));
        hashSet.add(Integer.valueOf(ij));
        hashSet.add(Integer.valueOf(jj));
        hashSet.add(Integer.valueOf(kj));
        hashSet.add(Integer.valueOf(lj));
        hashSet.add(Integer.valueOf(mj));
        hashSet.add(Integer.valueOf(nj));
        hashSet.add(Integer.valueOf(oj));
        hashSet.add(Integer.valueOf(pk));
        hashSet.add(Integer.valueOf(rk));
        hashSet.add(Integer.valueOf(sk));
        hashSet.add(Integer.valueOf(tk));
        hashSet.add(Integer.valueOf(uk));
        hashSet.add(Integer.valueOf(vk));
        hashSet.add(Integer.valueOf(xk));
        hashSet.add(Integer.valueOf(yk));
        hashSet.add(Integer.valueOf(zk));
        hashSet.add(Integer.valueOf(Ak));
        hashSet.add(Integer.valueOf(Bk));
        hashSet.add(Integer.valueOf(Ck));
        hashSet.add(Integer.valueOf(Dk));
        hashSet.add(Integer.valueOf(Ek));
        hashSet.add(Integer.valueOf(Fk));
        hashSet.add(Integer.valueOf(Gk));
        hashSet.add(Integer.valueOf(wg));
        hashSet.add(Integer.valueOf(Fg));
        hashSet.add(Integer.valueOf(Gg));
        hashSet.add(Integer.valueOf(Hg));
        hashSet.add(Integer.valueOf(Sg));
        hashSet.add(Integer.valueOf(Qg));
        hashSet.add(Integer.valueOf(Rg));
        hashSet.add(Integer.valueOf(vg));
        hashSet.add(Integer.valueOf(Pg));
        hashSet.add(Integer.valueOf(xg));
        hashSet.add(Integer.valueOf(yg));
        hashSet.add(Integer.valueOf(zg));
        hashSet.add(Integer.valueOf(Ag));
        hashSet.add(Integer.valueOf(Bg));
        hashSet.add(Integer.valueOf(Cg));
        hashSet.add(Integer.valueOf(Dg));
        hashSet.add(Integer.valueOf(Eg));
        hashSet.add(Integer.valueOf(Og));
        hashSet.add(Integer.valueOf(Kg));
        hashSet.add(Integer.valueOf(Lg));
        hashSet.add(Integer.valueOf(Mg));
        hashSet.add(Integer.valueOf(Ng));
        hashSet.add(Integer.valueOf(Ig));
        hashSet.add(Integer.valueOf(Jg));
        HashSet hashSet2 = pl;
        hashSet2.add(Integer.valueOf(jg));
        hashSet2.add(Integer.valueOf(kg));
        hashSet2.add(Integer.valueOf(lg));
        hashSet2.add(Integer.valueOf(mg));
        hashSet2.add(Integer.valueOf(gg));
        hashSet2.add(Integer.valueOf(hg));
        hashSet2.add(Integer.valueOf(ig));
        hashSet2.add(Integer.valueOf(sg));
        hashSet2.add(Integer.valueOf(rg));
        hashSet2.add(Integer.valueOf(og));
        hashSet2.add(Integer.valueOf(ng));
        hashSet2.add(Integer.valueOf(tg));
        hashSet2.add(Integer.valueOf(pg));
        hashSet2.add(Integer.valueOf(qg));
        hashSet2.add(Integer.valueOf(eg));
        hashSet2.add(Integer.valueOf(fg));
        hashSet2.add(Integer.valueOf(ug));
        hashSet2.add(Integer.valueOf(Tg));
        hashSet2.add(Integer.valueOf(Ug));
        hashSet2.add(Integer.valueOf(Vg));
        hashSet2.add(Integer.valueOf(Wg));
        hashSet2.add(Integer.valueOf(Xg));
        hashSet2.add(Integer.valueOf(Yg));
        hashSet2.add(Integer.valueOf(Zg));
        hashSet2.add(Integer.valueOf(ah));
        hashSet2.add(Integer.valueOf(bh));
        hashSet2.add(Integer.valueOf(ch));
        hashSet2.add(Integer.valueOf(dh));
        hashSet2.add(Integer.valueOf(eh));
        hashSet2.add(Integer.valueOf(fh));
        hashSet2.add(Integer.valueOf(gh));
        hashSet2.add(Integer.valueOf(hh));
        hashSet2.add(Integer.valueOf(ih));
        hashSet2.add(Integer.valueOf(jh));
        hashSet2.add(Integer.valueOf(kh));
        hashSet2.add(Integer.valueOf(lh));
        hashSet2.add(Integer.valueOf(mh));
        hashSet2.add(Integer.valueOf(nh));
        hashSet2.add(Integer.valueOf(oh));
        hashSet2.add(Integer.valueOf(Kj));
        hashSet2.add(Integer.valueOf(Lj));
        hashSet2.add(Integer.valueOf(Mj));
        hashSet2.add(Integer.valueOf(Nj));
        hashSet2.add(Integer.valueOf(Oj));
        hashSet2.add(Integer.valueOf(Pj));
        hashSet2.add(Integer.valueOf(Qj));
        hashSet2.add(Integer.valueOf(Rj));
        hashSet2.add(Integer.valueOf(Sj));
        hashSet2.add(Integer.valueOf(Uj));
        HashSet hashSet3 = pl;
        hashSet3.add(Integer.valueOf(Vj));
        hashSet3.add(Integer.valueOf(Wj));
        hashSet3.add(Integer.valueOf(hk));
        hashSet3.add(Integer.valueOf(ik));
        hashSet3.add(Integer.valueOf(jk));
        hashSet3.add(Integer.valueOf(kk));
        hashSet3.add(Integer.valueOf(lk));
        hashSet3.add(Integer.valueOf(mk));
        ArrayList arrayList = new ArrayList();
        F = arrayList;
        G = new ArrayList();
        HashMap hashMap = new HashMap();
        H = hashMap;
        ql = new SparseIntArray();
        rl = new SparseIntArray();
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
        e6 e6Var6 = new e6();
        e6Var6.a = "Blue";
        e6Var6.d = "bluebubbles.attheme";
        e6Var6.H = -6963476;
        e6Var6.M = -1;
        e6Var6.N = -3086593;
        e6Var6.O = true;
        e6Var6.U = n;
        e6Var6.R = 1;
        e6.b(e6Var6, new int[]{-10972987, -14444461, -3252606, -8428605, -14380627, -14050257, -7842636, -13464881, -12342073, -11359164, -3317869, -2981834, -8165684, -3256745, -2904512, -8681301}, new int[]{-4660851, -328756, -1572, -4108434, -3031781, -1335, -198952, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{0, -853047, -264993, 0, 0, -135756, -198730, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{0, -2104672, -937328, -2637335, -2639714, -1270157, -3428124, -6570777, -7223828, -6567550, -1793599, -1855875, -4674838, -1336199, -2900876, -6247730}, new int[]{0, -4532067, -1257580, -1524266, -1646910, -1519483, -1324823, -4138509, -4202516, -2040429, -1458474, -1256030, -3814930, -1000039, -1450082, -3485987}, new int[]{0, -1909081, -1592444, -2969879, -2439762, -1137033, -2119471, -6962197, -4857383, -4270699, -3364639, -2117514, -5000734, -1598028, -2045813, -5853742}, new int[]{0, -6371440, -1319256, -1258616, -1712961, -1186647, -1193816, -4467224, -4203544, -3023977, -1061929, -1255788, -2113811, -806526, -1715305, -3485976}, new int[]{99, 9, 10, 11, 12, 13, 14, 0, 1, 2, 3, 4, 5, 6, 7, 8}, new String[]{"", "p-pXcflrmFIBAAAAvXYQk-mCwZU", "JqSUrO0-mFIBAAAAWwTvLzoWGQI", "O-wmAfBPSFADAAAA4zINVfD_bro", "RepJ5uE_SVABAAAAr4d0YhgB850", "-Xc-np9y2VMCAAAARKr0yNNPYW0", "fqv01SQemVIBAAAApND8LDRUhRU", "fqv01SQemVIBAAAApND8LDRUhRU", "RepJ5uE_SVABAAAAr4d0YhgB850", "lp0prF8ISFAEAAAA_p385_CvG0w", "heptcj-hSVACAAAAC9RrMzOa-cs", "PllZ-bf_SFAEAAAA8crRfwZiDNg", "dhf9pceaQVACAAAAbzdVo4SCiZA", "Ujx2TFcJSVACAAAARJ4vLa50MkM", "p-pXcflrmFIBAAAAvXYQk-mCwZU", "dk_wwlghOFACAAAAfz9xrxi6euw"}, new int[]{0, 180, 45, 0, 45, 180, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{0, 52, 46, 57, 45, 64, 52, 35, 36, 41, 50, 50, 35, 38, 37, 30});
        D1(e6Var6);
        L = e6Var6;
        K = e6Var6;
        arrayList.add(e6Var6);
        hashMap.put("Blue", e6Var6);
        e6 e6Var7 = new e6();
        e6Var7.a = "Dark Blue";
        e6Var7.d = "darkblue.attheme";
        e6Var7.H = -10523006;
        e6Var7.M = -9009508;
        e6Var7.N = -8214301;
        e6Var7.R = 3;
        e6.b(e6Var7, new int[]{-7177260, -9860357, -14440464, -8687151, -9848491, -14053142, -9403671, -10044691, -13203974, -12138259, -10179489, -1344335, -1142742, -6127120, -2931932, -1131212, -8417365, -13270557}, new int[]{-6464359, -10267323, -13532789, -5413850, -11898828, -13410942, -13215889, -10914461, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{-10465880, -9937588, -14983040, -6736562, -14197445, -13534568, -13144441, -10587280, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{-14213586, -15263198, -16310753, -15724781, -15853551, -16051428, -14868183, -14668758, -15854566, -15326427, -15327979, -14411490, -14345453, -14738135, -14543346, -14212843, -15263205, -15854566}, new int[]{-15659501, -14277074, -15459034, -14542297, -14735336, -15129808, -15591910, -15459810, -15260623, -15853800, -15259879, -14477540, -14674936, -15461604, -13820650, -15067635, -14605528, -15260623}, new int[]{-13951445, -15395557, -15985382, -15855853, -16050417, -15525854, -15260627, -15327189, -15788258, -14799314, -15458796, -13952727, -13754603, -14081231, -14478324, -14081004, -15197667, -15788258}, new int[]{-15330777, -15066858, -15915220, -14213847, -15262439, -15260879, -15657695, -16443625, -15459285, -15589601, -14932454, -14740451, -15002870, -15264997, -13821660, -14805234, -14605784, -15459285}, new int[]{11, 12, 13, 14, 15, 16, 17, 18, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, new String[]{"O-wmAfBPSFADAAAA4zINVfD_bro", "RepJ5uE_SVABAAAAr4d0YhgB850", "dk_wwlghOFACAAAAfz9xrxi6euw", "9LW_RcoOSVACAAAAFTk3DTyXN-M", "PllZ-bf_SFAEAAAA8crRfwZiDNg", "-Xc-np9y2VMCAAAARKr0yNNPYW0", "kO4jyq55SFABAAAA0WEpcLfahXk", "CJNyxPMgSVAEAAAAvW9sMwc51cw", "fqv01SQemVIBAAAApND8LDRUhRU", "RepJ5uE_SVABAAAAr4d0YhgB850", "CJNyxPMgSVAEAAAAvW9sMwc51cw", "9LW_RcoOSVACAAAAFTk3DTyXN-M", "9GcNVISdSVADAAAAUcw5BYjELW4", "F5oWoCs7QFACAAAAgf2bD_mg8Bw", "9ShF73d1MFIIAAAAjWnm8_ZMe8Q", "3rX-PaKbSFACAAAAEiHNvcEm6X4", "dk_wwlghOFACAAAAfz9xrxi6euw", "fqv01SQemVIBAAAApND8LDRUhRU"}, new int[]{225, 45, 225, 135, 45, 225, 45, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{40, 40, 31, 50, 25, 34, 35, 35, 38, 29, 24, 34, 34, 31, 29, 37, 21, 38});
        D1(e6Var7);
        arrayList.add(e6Var7);
        J = e6Var7;
        hashMap.put("Dark Blue", e6Var7);
        e6 e6Var8 = new e6();
        e6Var8.a = "Arctic Blue";
        e6Var8.d = "arctic.attheme";
        e6Var8.H = -1971728;
        e6Var8.M = -1;
        e6Var8.N = -9657877;
        e6Var8.R = 5;
        e6.b(e6Var8, new int[]{-12537374, -12472227, -3240928, -11033621, -2194124, -3382903, -13332245, -12342073, -11359164, -3317869, -2981834, -8165684, -3256745, -2904512, -8681301}, new int[]{-13525046, -14113959, -7579073, -13597229, -3581840, -8883763, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{-11616542, -9716647, -6400452, -12008744, -2592697, -4297041, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{-3808528, -2433367, -2700891, -1838093, -1120848, -1712148, -2037779, -4202261, -4005713, -1058332, -925763, -1975316, -1189672, -1318451, -2302235}, new int[]{-1510157, -4398164, -1647697, -3610898, -1130838, -1980692, -4270093, -4202261, -3415654, -1259815, -1521765, -4341268, -1127744, -1318219, -3945761}, new int[]{-4924688, -3283031, -1523567, -2494477, -1126510, -595210, -2037517, -3478548, -4661623, -927514, -796762, -2696971, -1188403, -1319735, -1577487}, new int[]{-3149585, -5714021, -1978209, -4925720, -1134713, -1718833, -3613709, -5317397, -3218014, -999207, -2116466, -4343054, -931397, -1583186, -3815718}, new int[]{9, 10, 11, 12, 13, 14, 0, 1, 2, 3, 4, 5, 6, 7, 8}, new String[]{"MIo6r0qGSFAFAAAAtL8TsDzNX60", "dhf9pceaQVACAAAAbzdVo4SCiZA", "fqv01SQemVIBAAAApND8LDRUhRU", "p-pXcflrmFIBAAAAvXYQk-mCwZU", "JqSUrO0-mFIBAAAAWwTvLzoWGQI", "F5oWoCs7QFACAAAAgf2bD_mg8Bw", "fqv01SQemVIBAAAApND8LDRUhRU", "RepJ5uE_SVABAAAAr4d0YhgB850", "PllZ-bf_SFAEAAAA8crRfwZiDNg", "pgJfpFNRSFABAAAACDT8s5sEjfc", "ptuUd96JSFACAAAATobI23sPpz0", "dhf9pceaQVACAAAAbzdVo4SCiZA", "JqSUrO0-mFIBAAAAWwTvLzoWGQI", "9iklpvIPQVABAAAAORQXKur_Eyc", "F5oWoCs7QFACAAAAgf2bD_mg8Bw"}, new int[]{315, 315, 225, 315, 0, 180, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{50, 50, 58, 47, 46, 50, 49, 46, 51, 50, 49, 34, 54, 50, 40});
        D1(e6Var8);
        arrayList.add(e6Var8);
        hashMap.put("Arctic Blue", e6Var8);
        e6 e6Var9 = new e6();
        e6Var9.a = "Day";
        e6Var9.d = "day.attheme";
        e6Var9.H = -1;
        e6Var9.M = -1315084;
        e6Var9.N = -8604930;
        e6Var9.R = 2;
        e6.b(e6Var9, new int[]{-11099447, -3379581, -3109305, -3382174, -7963438, -11759137, -11029287, -11226775, -2506945, -3382174, -3379581, -6587438, -2649788, -8681301}, new int[]{-10125092, -9671214, -3451775, -3978678, -10711329, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{-12664362, -3642988, -2383569, -3109317, -11422261, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, null, null, new int[]{9, 10, 11, 12, 13, 0, 1, 2, 3, 4, 5, 6, 7, 8}, new String[]{"", "", "", "", "", "", "", "", "", "", "", "", "", ""}, new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
        D1(e6Var9);
        arrayList.add(e6Var9);
        hashMap.put("Day", e6Var9);
        e6 e6Var10 = new e6();
        e6Var10.a = "Night";
        e6Var10.d = "night.attheme";
        e6Var10.H = -11315623;
        e6Var10.M = -9143676;
        e6Var10.N = -9067802;
        e6Var10.R = 4;
        e6.b(e6Var10, new int[]{-9781697, -7505693, -2204034, -10913816, -2375398, -12678921, -11881005, -11880383, -2534026, -1934037, -7115558, -3128522, -1528292, -8812381}, new int[]{-7712108, -4953061, -5288081, -14258547, -9154889, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{-9939525, -5948598, -10335844, -13659747, -14054507, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{-15330532, -14806760, -15791344, -16184308, -16313063, -15921641, -15656164, -15986420, -15856883, -14871025, -16185078, -14937584, -14869736, -15855598}, new int[]{-14673881, -15724781, -15002342, -15458526, -15987697, -16184820, -16118258, -16250616, -15067624, -15527923, -14804447, -15790836, -15987960, -16316665}, new int[]{-15856877, -14608861, -15528430, -15921391, -15722209, -15197144, -15458015, -15591406, -15528431, -15068401, -16053749, -15594229, -15395825, -15724012}, new int[]{-14804694, -15658986, -14609382, -15656421, -16118509, -15855854, -16315381, -16052981, -14544354, -15791092, -15659241, -16316922, -15988214, -16185077}, new int[]{9, 10, 11, 12, 13, 0, 1, 2, 3, 4, 5, 6, 7, 8}, new String[]{"YIxYGEALQVADAAAAA3QbEH0AowY", "9LW_RcoOSVACAAAAFTk3DTyXN-M", "O-wmAfBPSFADAAAA4zINVfD_bro", "F5oWoCs7QFACAAAAgf2bD_mg8Bw", "-Xc-np9y2VMCAAAARKr0yNNPYW0", "fqv01SQemVIBAAAApND8LDRUhRU", "F5oWoCs7QFACAAAAgf2bD_mg8Bw", "ptuUd96JSFACAAAATobI23sPpz0", "p-pXcflrmFIBAAAAvXYQk-mCwZU", "Nl8Pg2rBQVACAAAA25Lxtb8SDp0", "dhf9pceaQVACAAAAbzdVo4SCiZA", "9GcNVISdSVADAAAAUcw5BYjELW4", "9LW_RcoOSVACAAAAFTk3DTyXN-M", "dk_wwlghOFACAAAAfz9xrxi6euw"}, new int[]{45, 135, 0, 180, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{34, 47, 52, 48, 54, 50, 37, 56, 48, 49, 40, 64, 38, 48});
        D1(e6Var10);
        arrayList.add(e6Var10);
        hashMap.put("Night", e6Var10);
        String str = null;
        String string = sharedPreferences.getString("themes2", null);
        if (sharedPreferences.getInt("remote_version", 0) == 1) {
            int i926 = 0;
            while (i926 < 4) {
                long[] jArr = E;
                StringBuilder sb2 = new StringBuilder("2remoteThemesHash");
                sb2.append(i926 != 0 ? Integer.valueOf(i926) : "");
                jArr[i926] = sharedPreferences.getLong(sb2.toString(), 0L);
                int[] iArr5 = D;
                StringBuilder sb3 = new StringBuilder("lastLoadingThemesTime");
                sb3.append(i926 != 0 ? Integer.valueOf(i926) : "");
                iArr5[i926] = sharedPreferences.getInt(sb3.toString(), 0);
                i926++;
            }
        }
        sharedPreferences.edit().putInt("remote_version", 1).apply();
        if (TextUtils.isEmpty(string)) {
            String string2 = sharedPreferences.getString("themes", null);
            if (!TextUtils.isEmpty(string2)) {
                for (String str2 : string2.split("&")) {
                    e6 h10 = e6.h(str2);
                    if (h10 != null) {
                        G.add(h10);
                        F.add(h10);
                        H.put(h10.m(), h10);
                    }
                }
                s1(true, true);
                sharedPreferences.edit().remove("themes").commit();
            }
        } else {
            try {
                JSONArray jSONArray = new JSONArray(string);
                for (int i927 = 0; i927 < jSONArray.length(); i927++) {
                    e6 g10 = e6.g(jSONArray.getJSONObject(i927));
                    if (g10 != null) {
                        G.add(g10);
                        F.add(g10);
                        H.put(g10.m(), g10);
                        e6.c(g10, sharedPreferences);
                    }
                }
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        Collections.sort(F, new j9.a(11));
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        try {
            HashMap hashMap2 = H;
            e6 e6Var11 = (e6) hashMap2.get("Dark Blue");
            String string3 = globalMainSettings.getString("theme", null);
            if ("Default".equals(string3)) {
                e6Var = (e6) hashMap2.get("Blue");
                e6Var.U = n;
            } else if ("Dark".equals(string3)) {
                e6Var11.U = 9;
                e6Var = e6Var11;
            } else if (string3 != null) {
                e6Var = (e6) hashMap2.get(string3);
                if (e6Var != null && !sharedPreferences.contains("lastDayTheme")) {
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.putString("lastDayTheme", e6Var.m());
                    edit.commit();
                }
            } else {
                e6Var = null;
            }
            String string4 = globalMainSettings.getString("nighttheme", null);
            if ("Default".equals(string4)) {
                e6Var = (e6) hashMap2.get("Blue");
                e6Var.U = n;
            } else if ("Dark".equals(string4)) {
                J = e6Var11;
                e6Var11.U = 9;
            } else if (string4 != null && (e6Var2 = (e6) hashMap2.get(string4)) != null) {
                J = e6Var2;
            }
            if (J != null && !sharedPreferences.contains("lastDarkTheme")) {
                SharedPreferences.Editor edit2 = sharedPreferences.edit();
                edit2.putString("lastDarkTheme", J.m());
                edit2.commit();
            }
            SharedPreferences.Editor editor3 = null;
            SharedPreferences.Editor editor4 = null;
            for (e6 e6Var12 : hashMap2.values()) {
                if (e6Var12.d == null || e6Var12.T == 0) {
                    e6Var4 = e6Var;
                    editor3 = editor3;
                } else {
                    String string5 = sharedPreferences.getString("accents_" + e6Var12.d, str);
                    e6Var12.U = sharedPreferences.getInt("accent_current_" + e6Var12.d, e6Var12.O ? n : 0);
                    ArrayList arrayList2 = new ArrayList();
                    if (TextUtils.isEmpty(string5)) {
                        editor = editor3;
                        e6Var4 = e6Var;
                        String str3 = "accent_for_" + e6Var12.d;
                        int i928 = globalMainSettings.getInt(str3, 0);
                        if (i928 != 0) {
                            if (editor == null) {
                                editor3 = globalMainSettings.edit();
                                editor4 = sharedPreferences.edit();
                            } else {
                                editor3 = editor;
                            }
                            editor3.remove(str3);
                            int size = e6Var12.X.size();
                            int i929 = 0;
                            while (true) {
                                if (i929 >= size) {
                                    d6 d6Var = new d6();
                                    d6Var.a = 100;
                                    d6Var.c = i928;
                                    d6Var.b = e6Var12;
                                    e6Var12.W.put(100, d6Var);
                                    arrayList2.add(0, d6Var);
                                    e6Var12.U = 100;
                                    e6Var12.b0 = 101;
                                    SerializedData serializedData = new SerializedData(72);
                                    serializedData.writeInt32(9);
                                    serializedData.writeInt32(1);
                                    serializedData.writeInt32(d6Var.a);
                                    serializedData.writeInt32(d6Var.c);
                                    serializedData.writeInt32(d6Var.e);
                                    serializedData.writeInt32(d6Var.f);
                                    serializedData.writeInt32(d6Var.g);
                                    serializedData.writeInt32(d6Var.h);
                                    serializedData.writeBool(d6Var.i);
                                    serializedData.writeInt64(d6Var.j);
                                    serializedData.writeInt64(d6Var.k);
                                    serializedData.writeInt64(d6Var.l);
                                    serializedData.writeInt64(d6Var.m);
                                    serializedData.writeInt32(d6Var.n);
                                    serializedData.writeInt64(0L);
                                    serializedData.writeDouble(d6Var.p);
                                    serializedData.writeBool(d6Var.q);
                                    serializedData.writeString(d6Var.o);
                                    serializedData.writeBool(false);
                                    editor4.putString("accents_" + e6Var12.d, Base64.encodeToString(serializedData.toByteArray(), 3));
                                    break;
                                }
                                d6 d6Var2 = (d6) e6Var12.X.get(i929);
                                if (d6Var2.c == i928) {
                                    e6Var12.U = d6Var2.a;
                                    break;
                                }
                                i929++;
                            }
                            editor4.putInt("accent_current_" + e6Var12.d, e6Var12.U);
                            if (!arrayList2.isEmpty()) {
                                e6Var12.X.addAll(0, arrayList2);
                                D1(e6Var12);
                            }
                            sparseArray = e6Var12.W;
                            if (sparseArray != null && sparseArray.get(e6Var12.U) == null) {
                                e6Var12.U = !e6Var12.O ? n : 0;
                            }
                            e6.c(e6Var12, sharedPreferences);
                            k10 = e6Var12.k(false);
                            if (k10 == null) {
                                e6Var12.e0 = k10.y;
                            }
                        }
                    } else {
                        try {
                            SerializedData serializedData2 = new SerializedData(Base64.decode(string5, i11));
                            boolean z11 = true;
                            int readInt32 = serializedData2.readInt32(true);
                            int readInt322 = serializedData2.readInt32(true);
                            int i930 = 0;
                            while (i930 < readInt322) {
                                try {
                                    d6 d6Var3 = new d6();
                                    d6Var3.a = serializedData2.readInt32(z11);
                                    d6Var3.c = serializedData2.readInt32(z11);
                                    if (readInt32 >= 9) {
                                        d6Var3.d = serializedData2.readInt32(z11);
                                    }
                                    d6Var3.b = e6Var12;
                                    d6Var3.e = serializedData2.readInt32(true);
                                    d6Var3.f = serializedData2.readInt32(true);
                                    if (readInt32 >= 7) {
                                        d6Var3.g = serializedData2.readInt32(true);
                                        d6Var3.h = serializedData2.readInt32(true);
                                    }
                                    if (readInt32 >= 8) {
                                        z10 = true;
                                        d6Var3.i = serializedData2.readBool(true);
                                    } else {
                                        z10 = true;
                                    }
                                    if (readInt32 >= 3) {
                                        editor2 = editor3;
                                        e6Var5 = e6Var;
                                        d6Var3.j = serializedData2.readInt64(z10);
                                    } else {
                                        editor2 = editor3;
                                        e6Var5 = e6Var;
                                        d6Var3.j = serializedData2.readInt32(z10);
                                    }
                                    if (readInt32 >= 2) {
                                        d6Var3.k = serializedData2.readInt64(z10);
                                    } else {
                                        d6Var3.k = serializedData2.readInt32(z10);
                                    }
                                    ?? r11 = z10;
                                    if (readInt32 >= 6) {
                                        d6Var3.l = serializedData2.readInt64(z10);
                                        d6Var3.m = serializedData2.readInt64(z10);
                                        r11 = 1;
                                    }
                                    if (readInt32 >= r11) {
                                        d6Var3.n = serializedData2.readInt32(r11);
                                    }
                                    if (readInt32 >= 4) {
                                        serializedData2.readInt64(r11);
                                        d6Var3.p = (float) serializedData2.readDouble(r11);
                                        d6Var3.q = serializedData2.readBool(r11);
                                        i10 = 5;
                                        if (readInt32 >= 5) {
                                            d6Var3.o = serializedData2.readString(r11);
                                        }
                                        if (readInt32 >= i10 && serializedData2.readBool(true)) {
                                            d6Var3.t = serializedData2.readInt32(true);
                                            d6Var3.r = TLRPC.Theme.TLdeserialize(serializedData2, serializedData2.readInt32(true), true);
                                        }
                                        tL_theme = d6Var3.r;
                                        if (tL_theme != null) {
                                            d6Var3.z = tL_theme.isDefault;
                                        }
                                        e6Var12.W.put(d6Var3.a, d6Var3);
                                        tL_theme2 = d6Var3.r;
                                        if (tL_theme2 != null) {
                                            e6Var12.Y.put(tL_theme2.id, d6Var3);
                                        }
                                        arrayList2.add(d6Var3);
                                        e6Var12.b0 = Math.max(e6Var12.b0, d6Var3.a);
                                        i930++;
                                        e6Var = e6Var5;
                                        editor3 = editor2;
                                        z11 = true;
                                    }
                                    i10 = 5;
                                    if (readInt32 >= i10) {
                                        d6Var3.t = serializedData2.readInt32(true);
                                        d6Var3.r = TLRPC.Theme.TLdeserialize(serializedData2, serializedData2.readInt32(true), true);
                                    }
                                    tL_theme = d6Var3.r;
                                    if (tL_theme != null) {
                                    }
                                    e6Var12.W.put(d6Var3.a, d6Var3);
                                    tL_theme2 = d6Var3.r;
                                    if (tL_theme2 != null) {
                                    }
                                    arrayList2.add(d6Var3);
                                    e6Var12.b0 = Math.max(e6Var12.b0, d6Var3.a);
                                    i930++;
                                    e6Var = e6Var5;
                                    editor3 = editor2;
                                    z11 = true;
                                } finally {
                                    RuntimeException runtimeException = new RuntimeException(th);
                                }
                            }
                            editor = editor3;
                            e6Var4 = e6Var;
                        } finally {
                            FileLog.e(th);
                        }
                    }
                    editor3 = editor;
                    if (!arrayList2.isEmpty()) {
                    }
                    sparseArray = e6Var12.W;
                    if (sparseArray != null) {
                        e6Var12.U = !e6Var12.O ? n : 0;
                    }
                    e6.c(e6Var12, sharedPreferences);
                    k10 = e6Var12.k(false);
                    if (k10 == null) {
                    }
                }
                e6Var = e6Var4;
                str = null;
                i11 = 3;
            }
            SharedPreferences.Editor editor5 = editor3;
            e6 e6Var13 = e6Var;
            if (editor5 != null) {
                editor5.commit();
                editor4.commit();
            }
            o = globalMainSettings.getInt("selectedAutoNightType", Build.VERSION.SDK_INT >= 29 ? 3 : 0);
            p = globalMainSettings.getBoolean("autoNightScheduleByLocation", false);
            q = globalMainSettings.getFloat("autoNightBrighnessThreshold", 0.25f);
            r = globalMainSettings.getInt("autoNightDayStartTime", 1320);
            s = globalMainSettings.getInt("autoNightDayEndTime", 480);
            t = globalMainSettings.getInt("autoNightSunsetTime", 1320);
            v = globalMainSettings.getInt("autoNightSunriseTime", 480);
            w = globalMainSettings.getString("autoNightCityName", "");
            long j10 = globalMainSettings.getLong("autoNightLocationLatitude3", 10000L);
            if (j10 != 10000) {
                x = Double.longBitsToDouble(j10);
            } else {
                x = 10000.0d;
            }
            long j11 = globalMainSettings.getLong("autoNightLocationLongitude3", 10000L);
            if (j11 != 10000) {
                y = Double.longBitsToDouble(j11);
            } else {
                y = 10000.0d;
            }
            u = globalMainSettings.getInt("autoNightLastSunCheckDay", -1);
            if (e6Var13 == null) {
                e6Var3 = L;
            } else {
                K = e6Var13;
                e6Var3 = e6Var13;
            }
            if (globalMainSettings.contains("overrideThemeWallpaper") || globalMainSettings.contains("selectedBackground2")) {
                boolean z12 = globalMainSettings.getBoolean("overrideThemeWallpaper", false);
                long j12 = globalMainSettings.getLong("selectedBackground2", 1000001L);
                if (j12 == -1 || (z12 && j12 != -2 && j12 != 1000001)) {
                    y5 y5Var = new y5();
                    y5Var.d = globalMainSettings.getInt("selectedColor", 0);
                    y5Var.c = globalMainSettings.getString("selectedBackgroundSlug", "");
                    if (j12 < -100 || j12 > -1 || y5Var.d == 0) {
                        y5Var.a = "wallpaper.jpg";
                        y5Var.b = "wallpaper_original.jpg";
                    } else {
                        y5Var.c = "c";
                        y5Var.a = "";
                        y5Var.b = "";
                    }
                    y5Var.e = globalMainSettings.getInt("selectedGradientColor", 0);
                    y5Var.f = globalMainSettings.getInt("selectedGradientColor2", 0);
                    y5Var.g = globalMainSettings.getInt("selectedGradientColor3", 0);
                    y5Var.h = globalMainSettings.getInt("selectedGradientRotation", 45);
                    y5Var.i = globalMainSettings.getBoolean("selectedBackgroundBlurred", false);
                    y5Var.j = globalMainSettings.getBoolean("selectedBackgroundMotion", false);
                    y5Var.k = globalMainSettings.getFloat("selectedIntensity", 0.5f);
                    K.v(y5Var);
                    if (o != 0) {
                        J.v(y5Var);
                    }
                }
                globalMainSettings.edit().remove("overrideThemeWallpaper").remove("selectedBackground2").commit();
            }
            int m12 = m1();
            if (m12 == 2) {
                e6Var3 = J;
            }
            t(e6Var3, false, m12 == 2);
            AndroidUtilities.runOnUIThread(new org.telegram.messenger.w1(15));
            Dl = new m5();
            El = new int[2];
            Hl = new Paint(1);
            Paint paint = new Paint(1);
            Il = paint;
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            Paint paint2 = new Paint();
            Jl = paint2;
            paint2.setColor(-65536);
            new Paint().setColor(-16776961);
            new Paint().setColor(1073807104);
            Paint paint3 = new Paint();
            Kl = paint3;
            paint3.setColor(-1342112000);
            Paint paint4 = new Paint();
            Ll = paint4;
            paint4.setColor(-65536);
            paint4.setStrokeWidth(2.0f);
            Paint.Style style = Paint.Style.STROKE;
            paint4.setStyle(style);
            Paint paint5 = new Paint();
            Ml = paint5;
            paint5.setColor(-16711936);
            paint5.setStrokeWidth(2.0f);
            paint5.setStyle(style);
        } catch (Exception e11) {
            throw new RuntimeException(e11);
        }
    }

    public static void A() {
        if (o != 2) {
            if (k) {
                k = false;
                AndroidUtilities.cancelRunOnUIThread(m);
            }
            if (j) {
                j = false;
                AndroidUtilities.cancelRunOnUIThread(l);
            }
            if (g) {
                h = 1.0f;
                e.unregisterListener(Dl, f);
                g = false;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("light sensor unregistered");
                }
            }
        }
    }

    public static e6 A0() {
        e6 e6Var = K;
        return e6Var != null ? e6Var : L;
    }

    public static void A1(org.telegram.ui.Cells.z zVar, int i10, int i11) {
        if (e2.c.v(zVar)) {
            int numberOfLayers = zVar.getNumberOfLayers();
            for (int i12 = 0; i12 < numberOfLayers; i12++) {
                Drawable drawable = zVar.getDrawable(i12);
                if (drawable instanceof c6) {
                    c6 c6Var = (c6) drawable;
                    float f10 = i10;
                    float f11 = i11;
                    float[] fArr = c6Var.b;
                    float dp = AndroidUtilities.dp(f10);
                    fArr[3] = dp;
                    fArr[2] = dp;
                    fArr[1] = dp;
                    fArr[0] = dp;
                    float dp2 = AndroidUtilities.dp(f11);
                    fArr[7] = dp2;
                    fArr[6] = dp2;
                    fArr[5] = dp2;
                    fArr[4] = dp2;
                    c6Var.c = true;
                    c6Var.invalidateSelf();
                    return;
                }
            }
        }
    }

    public static int B(e6 e6Var, int i10, int i11) {
        int i12;
        if (i10 == 0 || (i12 = e6Var.T) == 0 || i10 == i12 || (e6Var.O && e6Var.U == n)) {
            return i11;
        }
        float[] M02 = M0(3);
        float[] M03 = M0(4);
        Color.colorToHSV(e6Var.T, M02);
        Color.colorToHSV(i10, M03);
        return D(M02, M03, i11, e6Var.q(), i11);
    }

    public static int B0(int i10) {
        int indexOfKey = ql.indexOfKey(i10);
        if (indexOfKey < 0) {
            return 0;
        }
        int valueAt = ql.valueAt(indexOfKey);
        d6 k10 = I.k(false);
        if (k10 == null) {
            return 0;
        }
        float[] M02 = M0(1);
        float[] M03 = M0(2);
        Color.colorToHSV(I.T, M02);
        Color.colorToHSV(k10.c, M03);
        return D(M02, M03, valueAt, I.q(), valueAt);
    }

    public static boolean B1(Drawable drawable, int i10, boolean z10) {
        Drawable L02;
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
                Drawable L03 = L0(0, drawable);
                if (L03 instanceof ShapeDrawable) {
                    z11 = ((ShapeDrawable) L03).getPaint().getColor() != i10;
                    try {
                        ((ShapeDrawable) L03).getPaint().setColor(i10);
                    } catch (Throwable unused) {
                        return z11;
                    }
                } else {
                    L03.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                    z11 = false;
                }
                L02 = L0(1, drawable);
            } else {
                L02 = L0(2, drawable);
                z11 = false;
            }
            if (!(L02 instanceof ShapeDrawable)) {
                L02.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                return z11;
            }
            if (((ShapeDrawable) L02).getPaint().getColor() == i10 && !z11) {
                r1 = false;
            }
            try {
                ((ShapeDrawable) L02).getPaint().setColor(i10);
                return r1;
            } catch (Throwable unused2) {
                return r1;
            }
        } catch (Throwable unused3) {
            return false;
        }
    }

    public static int C(boolean z10, int i10, int i11, int i12, int i13) {
        float[] M02 = M0(3);
        float[] M03 = M0(4);
        Color.colorToHSV(i10, M02);
        Color.colorToHSV(i11, M03);
        return D(M02, M03, i12, z10, i13);
    }

    public static int C0(int i10) {
        int i11 = nl[i10];
        if (i11 != 0) {
            return i11;
        }
        int i12 = ol.get(i10, -1);
        return i12 != -1 ? C0(i12) : ((i10 >= za && i10 < Ga) || i10 == D9 || i10 == N9 || i10 == E9 || i10 == Pd || i10 == Qd) ? 0 : -65536;
    }

    public static void C1(e6 e6Var, d6 d6Var, TLRPC.TL_theme tL_theme, int i10, boolean z10) {
        String str;
        TLRPC.WallPaperSettings wallPaperSettings;
        if (tL_theme == null) {
            return;
        }
        TLRPC.ThemeSettings themeSettings = tL_theme.settings.size() > 0 ? tL_theme.settings.get(0) : null;
        HashMap hashMap = H;
        if (themeSettings != null) {
            if (e6Var == null) {
                String q02 = q0(themeSettings);
                if (q02 == null || (e6Var = (e6) hashMap.get(q02)) == null) {
                    return;
                } else {
                    d6Var = (d6) e6Var.Y.get(tL_theme.id);
                }
            }
            if (d6Var == null) {
                return;
            }
            TLRPC.TL_theme tL_theme2 = d6Var.r;
            if (tL_theme2 != null) {
                e6Var.Y.remove(tL_theme2.id);
            }
            d6Var.r = tL_theme;
            d6Var.t = i10;
            e6Var.Y.put(tL_theme.id, d6Var);
            if (!e6.a(d6Var, themeSettings)) {
                File d10 = d6Var.d();
                if (d10 != null) {
                    d10.delete();
                }
                e6.i(d6Var, themeSettings);
                e6 e6Var2 = I;
                if (e6Var2 == e6Var && e6Var2.U == d6Var.a) {
                    n1(false, false);
                    NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                    int i11 = NotificationCenter.needSetDayNightTheme;
                    e6 e6Var3 = I;
                    globalInstance.lambda$postNotificationNameOnUIThread$1(i11, e6Var3, Boolean.valueOf(J == e6Var3), null, -1);
                }
                a6.a(true);
            }
            TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
            d6Var.q = (wallPaper == null || (wallPaperSettings = wallPaper.settings) == null || !wallPaperSettings.motion) ? false : true;
            e6Var.P = false;
        } else {
            if (e6Var != null) {
                str = e6Var.m();
                hashMap.remove(str);
            } else {
                str = "remote" + tL_theme.id;
                e6Var = (e6) hashMap.get(str);
            }
            if (e6Var == null) {
                return;
            }
            e6Var.B = tL_theme;
            e6Var.a = tL_theme.title;
            File file = new File(e6Var.b);
            File file2 = new File(ApplicationLoader.getFilesDirFixed(), ta.b.j(str, ".attheme"));
            if (!file.equals(file2)) {
                try {
                    AndroidUtilities.copyFile(file, file2);
                    e6Var.b = file2.getAbsolutePath();
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
            if (z10) {
                e6Var.C = false;
                e6Var.c0 = null;
                e6Var.d0 = null;
                NotificationCenter.getInstance(e6Var.A).addObserver(e6Var, NotificationCenter.fileLoaded);
                NotificationCenter.getInstance(e6Var.A).addObserver(e6Var, NotificationCenter.fileLoadFailed);
                FileLoader fileLoader = FileLoader.getInstance(e6Var.A);
                TLRPC.TL_theme tL_theme3 = e6Var.B;
                fileLoader.loadFile(tL_theme3.document, tL_theme3, 1, 1);
            } else {
                e6Var.P = false;
            }
            hashMap.put(e6Var.m(), e6Var);
        }
        s1(true, false);
    }

    public static int D(float[] fArr, float[] fArr2, int i10, boolean z10, int i11) {
        if (Cl == null) {
            Cl = new float[3];
        }
        float[] fArr3 = Cl;
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
        float computePerceivedBrightness = AndroidUtilities.computePerceivedBrightness(i10);
        float computePerceivedBrightness2 = AndroidUtilities.computePerceivedBrightness(HSVToColor);
        if (z10) {
            if (computePerceivedBrightness <= computePerceivedBrightness2) {
                return HSVToColor;
            }
        } else if (computePerceivedBrightness >= computePerceivedBrightness2) {
            return HSVToColor;
        }
        float d10 = aa.d.d(0.39999998f, computePerceivedBrightness, computePerceivedBrightness2, 0.6f);
        int red = (int) (Color.red(HSVToColor) * d10);
        int green = (int) (Color.green(HSVToColor) * d10);
        int blue = (int) (Color.blue(HSVToColor) * d10);
        return Color.argb(Color.alpha(HSVToColor), red < 0 ? 0 : Math.min(red, 255), green < 0 ? 0 : Math.min(green, 255), blue >= 0 ? Math.min(blue, 255) : 0);
    }

    public static i10 D0() {
        if (zl == null) {
            i10 i10Var = new i10();
            i10Var.a = new h10[4];
            i10Var.k = 1.0f;
            i10Var.l = new ArrayList();
            i10Var.m = new Paint(1);
            i10Var.n = new Path();
            for (int i10 = 0; i10 < 4; i10++) {
                i10Var.a[i10] = new h10(i10);
            }
            zl = i10Var;
        }
        return zl;
    }

    public static void D1(e6 e6Var) {
        Collections.sort(e6Var.X, new j9.a(12));
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
                AndroidUtilities.cancelRunOnUIThread(m);
            }
            if (j) {
                j = false;
                AndroidUtilities.cancelRunOnUIThread(l);
            }
        }
        A();
        int m12 = m1();
        if (m12 != 0) {
            l(m12 == 2);
        }
        if (z10) {
            i = 0L;
        }
    }

    public static int E0(int i10) {
        return w0(null, i10, true);
    }

    public static int E1(SparseIntArray sparseIntArray) {
        int i10 = Ea;
        int i11 = Fa;
        int i12 = Aa;
        int[] iArr = {i12, Da, i10, i11};
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < 4; i17++) {
            int i18 = iArr[i17];
            if (i18 == i12 || sparseIntArray.indexOfKey(i18) >= 0) {
                int i19 = sparseIntArray.get(i18, nl[i18]);
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

    public static void F(boolean z10) {
        int i10;
        if (A == 0) {
            if (z10 || Math.abs((System.currentTimeMillis() / 1000) - B) >= 3600) {
                int i11 = 0;
                while (i11 < 2) {
                    e6 e6Var = i11 == 0 ? K : J;
                    if (e6Var != null && UserConfig.getInstance(e6Var.A).isClientActivated()) {
                        d6 k10 = e6Var.k(false);
                        TLRPC.TL_theme tL_theme = e6Var.B;
                        if (tL_theme != null) {
                            i10 = e6Var.A;
                        } else if (k10 != null && (tL_theme = k10.r) != null) {
                            i10 = UserConfig.selectedAccount;
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
                            ConnectionsManager.getInstance(i10).sendRequest(gettheme, new bg.b0(k10, e6Var, tL_theme, 15));
                        }
                    }
                    i11++;
                }
            }
        }
    }

    public static int F0(SparseIntArray sparseIntArray, int i10) {
        int indexOfKey = sparseIntArray.indexOfKey(i10);
        return indexOfKey >= 0 ? sparseIntArray.valueAt(indexOfKey) : nl[i10];
    }

    public static void F1(o2 o2Var) {
        if (o != 0) {
            if (o2Var != null) {
                try {
                    oc.a0(o2Var).I(R.raw.auto_night_off, o == 3 ? LocaleController.getString("AutoNightSystemModeOff", R.string.AutoNightSystemModeOff) : LocaleController.getString("AutoNightModeOff", R.string.AutoNightModeOff), LocaleController.getString("Settings", R.string.Settings), 5000, false, new p(o2Var, 17)).j();
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
            o = 0;
            q1();
            A();
        }
    }

    public static void G(SparseIntArray sparseIntArray, e6 e6Var) {
        if (e6Var == null || e6Var.f0 != -1) {
            return;
        }
        int i10 = d6;
        if (i0.a.f(i0.a.d(0.5f, F0(sparseIntArray, i10), F0(sparseIntArray, i10))) < 0.5d) {
            e6Var.f0 = 1;
        } else {
            e6Var.f0 = 0;
        }
    }

    public static org.telegram.ui.Cells.z G0(int i10, int i11) {
        return new org.telegram.ui.Cells.z(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{(i11 & 16777215) | 419430400}), null, b0(i10, -1));
    }

    public static void G1(MessageObject messageObject) {
        d8 d8Var = d5;
        if (d8Var == null) {
            return;
        }
        if (d8Var.i == null || messageObject == null) {
            d8Var.i = null;
            return;
        }
        if (e5 == null) {
            e5 = new HashMap();
        }
        e5.put(messageObject, d5);
        d5.e(false, true, null);
        AndroidUtilities.runOnUIThread(new p(messageObject, 18), 200L);
        d5 = null;
    }

    public static b3.b H(e6 e6Var, SparseIntArray sparseIntArray, String str, int i10, boolean z10) {
        float f10;
        float f11;
        boolean z11 = e6Var.O && e6Var.U == n;
        d6 k10 = e6Var.k(false);
        File d10 = k10 != null ? k10.d() : null;
        boolean z12 = k10 != null && k10.q;
        y5 y5Var = e6Var.e0;
        if (y5Var != null) {
            f11 = y5Var.k;
        } else {
            if (k10 == null) {
                f10 = e6Var.y;
                return I(e6Var, y5Var, sparseIntArray, d10, str, ql.get(g5, -1), (int) f10, i10, z11, false, false, z12, null, z10);
            }
            f11 = k10.p;
        }
        f10 = f11 * 100.0f;
        return I(e6Var, y5Var, sparseIntArray, d10, str, ql.get(g5, -1), (int) f10, i10, z11, false, false, z12, null, z10);
    }

    public static String H0() {
        y5 y5Var = I.e0;
        return y5Var != null ? y5Var.c : d1() ? "t" : "d";
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static b3.b I(e6 e6Var, y5 y5Var, SparseIntArray sparseIntArray, File file, String str, int i10, int i11, int i12, boolean z10, boolean z11, boolean z12, boolean z13, TLRPC.Document document, boolean z14) {
        int height;
        int i13;
        Bitmap i14;
        Bitmap i15;
        boolean z15;
        Bitmap bitmap;
        b3.b bVar = new b3.b();
        bVar.a = z14 ? null : e0;
        boolean z16 = (!z11 || z12) && y5Var != null;
        if (y5Var != null) {
            bVar.c = Boolean.valueOf(y5Var.j);
            bVar.d = Boolean.valueOf((y5Var.d == 0 || "d".equals(y5Var.c) || "c".equals(y5Var.c)) ? false : true);
        } else {
            bVar.c = Boolean.valueOf(e6Var.n);
            bVar.d = Boolean.valueOf(e6Var.r != 0);
        }
        if (!z16) {
            int i16 = z10 ? 0 : sparseIntArray.get(Nd);
            int i17 = sparseIntArray.get(Qd);
            int i18 = sparseIntArray.get(Pd);
            int i19 = sparseIntArray.get(Od);
            if (file == null || !file.exists()) {
                z15 = false;
            } else {
                try {
                    if (i16 == 0 || i19 == 0 || i18 == 0) {
                        bVar.a = Drawable.createFromPath(file.getAbsolutePath());
                        z15 = true;
                    } else {
                        jb0 jb0Var = new jb0(false, i16, i19, i18, i17);
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        Bitmap.Config config = Bitmap.Config.ALPHA_8;
                        options.inPreferredConfig = config;
                        Bitmap decodeFile = BitmapFactory.decodeFile(file.getAbsolutePath(), options);
                        if (decodeFile != null && decodeFile.getConfig() != config) {
                            Bitmap copy = decodeFile.copy(config, false);
                            decodeFile.recycle();
                            decodeFile = copy;
                        }
                        z15 = decodeFile != null;
                        try {
                            jb0Var.t(decodeFile, i11);
                            jb0Var.u(jb0Var.f());
                            bVar.a = jb0Var;
                        } catch (Throwable th2) {
                            th = th2;
                            FileLog.e(th);
                            if (!z15) {
                            }
                            if (((Drawable) bVar.a) == null) {
                            }
                            if (!LiteMode.isEnabled(32)) {
                            }
                            return bVar;
                        }
                    }
                    bVar.c = Boolean.valueOf(z13);
                    Boolean bool = Boolean.TRUE;
                    bVar.d = bool;
                    bVar.e = bool;
                } catch (Throwable th3) {
                    th = th3;
                    z15 = true;
                }
            }
            if (!z15) {
                if (i16 != 0) {
                    int i20 = sparseIntArray.get(Rd, -1);
                    if (i20 == -1) {
                        i20 = 45;
                    }
                    if (i19 == 0 || i18 == 0) {
                        int i21 = i16;
                        if (i19 == 0 || i19 == i21) {
                            bVar.a = new ColorDrawable(i21);
                        } else {
                            n9 n9Var = new n9(n9.d(i20), new int[]{i21, i19});
                            V = n9Var.f(m5.c0.m(0.5f, 3), new o5(), 100L);
                            bVar.a = n9Var;
                        }
                    } else {
                        jb0 jb0Var2 = new jb0(false, i16, i19, i18, i17);
                        if (file != null) {
                            Point point = AndroidUtilities.displaySize;
                            int min = Math.min(point.x, point.y);
                            Point point2 = AndroidUtilities.displaySize;
                            int max = Math.max(point2.x, point2.y);
                            bitmap = document != null ? SvgHelper.getBitmap(FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(document, true), min, max, false, SvgHelper.ScaleMode.ByWidth) : SvgHelper.getBitmap(R.raw.default_pattern, min, max, -1, 1.0f, SvgHelper.ScaleMode.ByWidth);
                            if (bitmap != null) {
                                try {
                                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                                    Bitmap copy2 = bitmap.copy(Bitmap.Config.ARGB_8888, true);
                                    copy2.compress(Bitmap.CompressFormat.PNG, 90, fileOutputStream);
                                    copy2.recycle();
                                    fileOutputStream.close();
                                } catch (Exception e10) {
                                    FileLog.e(e10);
                                    e10.printStackTrace();
                                }
                            }
                        } else {
                            bitmap = null;
                        }
                        jb0Var2.t(bitmap, i11);
                        jb0Var2.v(i12);
                        bVar.a = jb0Var2;
                    }
                    bVar.e = Boolean.TRUE;
                } else if (str != null) {
                    try {
                        Bitmap i110 = i1(new FileInputStream(new File(ApplicationLoader.getFilesDirFixed(), Utilities.MD5(str) + ".wp")), 0);
                        if (i110 != null) {
                            BitmapDrawable bitmapDrawable = new BitmapDrawable(i110);
                            bVar.a = bitmapDrawable;
                            bVar.b = bitmapDrawable;
                            bVar.e = Boolean.TRUE;
                        }
                    } catch (Exception e11) {
                        FileLog.e(e11);
                    }
                } else if (i10 > 0 && (e6Var.b != null || e6Var.d != null)) {
                    try {
                        String str2 = e6Var.d;
                        Bitmap i111 = i1(new FileInputStream(str2 != null ? p0(str2) : new File(e6Var.b)), i10);
                        if (i111 != null) {
                            BitmapDrawable bitmapDrawable2 = new BitmapDrawable(i111);
                            e0 = bitmapDrawable2;
                            bVar.b = bitmapDrawable2;
                            bVar.a = bitmapDrawable2;
                            bitmapDrawable2.setFilterBitmap(true);
                            bVar.e = Boolean.TRUE;
                        }
                    } catch (Throwable th4) {
                        FileLog.e(th4);
                    }
                }
            }
        }
        if (((Drawable) bVar.a) == null) {
            int i22 = y5Var != null ? y5Var.d : 0;
            if (y5Var != null) {
                if (!"d".equals(y5Var.c)) {
                    if (!"c".equals(y5Var.c) || y5Var.e != 0) {
                        if (i22 == 0 || (j0 && y5Var.f == 0)) {
                            File file2 = new File(ApplicationLoader.getFilesDirFixed(), y5Var.a);
                            if (file2.exists() && (i14 = i1(new FileInputStream(file2), 0)) != null) {
                                BitmapDrawable bitmapDrawable3 = new BitmapDrawable(i14);
                                bVar.a = bitmapDrawable3;
                                bitmapDrawable3.setFilterBitmap(true);
                                bVar.e = Boolean.TRUE;
                            }
                            if (((Drawable) bVar.a) == null) {
                                bVar.a = Q(0, 0);
                                bVar.e = Boolean.FALSE;
                            }
                        } else if (y5Var.e != 0 && y5Var.f != 0) {
                            jb0 jb0Var3 = new jb0(false, y5Var.d, y5Var.e, y5Var.f, y5Var.g);
                            jb0Var3.v(i12);
                            if (((Boolean) bVar.d).booleanValue()) {
                                File file3 = new File(ApplicationLoader.getFilesDirFixed(), y5Var.a);
                                if (file3.exists()) {
                                    jb0Var3.t(i1(new FileInputStream(file3), 0), (int) (y5Var.k * 100.0f));
                                    bVar.e = Boolean.TRUE;
                                }
                            }
                            bVar.a = jb0Var3;
                        } else if (((Boolean) bVar.d).booleanValue()) {
                            File file4 = new File(ApplicationLoader.getFilesDirFixed(), y5Var.a);
                            if (file4.exists() && (i15 = i1(new FileInputStream(file4), 0)) != null) {
                                BitmapDrawable bitmapDrawable4 = new BitmapDrawable(i15);
                                bVar.a = bitmapDrawable4;
                                bitmapDrawable4.setFilterBitmap(true);
                                bVar.e = Boolean.TRUE;
                            }
                        } else {
                            int i23 = y5Var.e;
                            if (i23 != 0) {
                                n9 n9Var2 = new n9(n9.d(y5Var.h), new int[]{i22, i23});
                                V = n9Var2.f(m5.c0.m(0.5f, 3), new p5(), 100L);
                                bVar.a = n9Var2;
                            } else {
                                bVar.a = new ColorDrawable(i22);
                            }
                        }
                    }
                    if (((Drawable) bVar.a) == null) {
                        if (i22 == 0) {
                            i22 = -2693905;
                        }
                        bVar.a = new ColorDrawable(i22);
                    }
                }
            }
            bVar.a = Q(0, 0);
            bVar.e = Boolean.FALSE;
            if (((Drawable) bVar.a) == null) {
            }
        }
        if (!LiteMode.isEnabled(32)) {
            Drawable drawable = (Drawable) bVar.a;
            if (drawable instanceof jb0) {
                jb0 jb0Var4 = (jb0) drawable;
                Bitmap bitmap2 = jb0Var4.u;
                if (bitmap2 == null) {
                    Point point3 = AndroidUtilities.displaySize;
                    i13 = Math.min(point3.x, point3.y);
                    Point point4 = AndroidUtilities.displaySize;
                    height = Math.max(point4.x, point4.y);
                } else {
                    int width = bitmap2.getWidth();
                    height = jb0Var4.u.getHeight();
                    i13 = width;
                }
                Bitmap createBitmap = Bitmap.createBitmap(i13, height, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                ((Drawable) bVar.a).setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                ((Drawable) bVar.a).draw(canvas);
                bVar.a = new BitmapDrawable(createBitmap);
            }
        }
        return bVar;
    }

    public static org.telegram.ui.Cells.z I0(int i10, int i11, b6 b6Var) {
        return i11 >= 0 ? new org.telegram.ui.Cells.z(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i10}), new ColorDrawable(v0(i11, b6Var)), new ColorDrawable(-1)) : f0(i10, 2, -1);
    }

    public static void J(Context context, boolean z10) {
        float f10;
        float f11;
        float f12;
        TextPaint textPaint;
        Drawable[] drawableArr;
        N();
        if (z10 || m3 != null) {
            f10 = 1.0f;
            f11 = 3.0f;
            f12 = 14.0f;
        } else {
            Resources resources = context.getResources();
            h3 = resources.getDrawable(R.drawable.video_muted);
            l3 = resources.getDrawable(R.drawable.media_live_on).mutate();
            m3 = new d5(0, false, false, null);
            n3 = new d5(0, false, true, null);
            o3 = new d5(0, true, false, null);
            p3 = new d5(0, true, true, null);
            q3 = new d5(1, false, false, null);
            r3 = new d5(1, false, true, null);
            s3 = new d5(1, true, false, null);
            t3 = new d5(1, true, true, null);
            fd0 fd0Var = new fd0();
            fd0Var.a = new Path();
            fd0Var.b = -1.0f;
            fd0Var.g = new ArrayList();
            fd0Var.c = 0.293f;
            fd0Var.d = -26.0f;
            fd0Var.e = -28.0f;
            fd0Var.f = 1.0f;
            x3 = fd0Var;
            fd0Var.a("M 34.141 16.042 C 37.384 17.921 40.886 20.001 44.211 21.965 C 46.139 23.104 49.285 24.729 49.586 25.917 C 50.289 28.687 48.484 30 46.274 30 L 6 30.021 C 3.79 30.021 2.075 30.023 2 26.021 L 2.009 3.417 C 2.009 0.417 5.326 -0.58 7.068 0.417 C 10.545 2.406 25.024 10.761 34.141 16.042 Z", 166.0f);
            x3.a("M 37.843 17.769 C 41.143 19.508 44.131 21.164 47.429 23.117 C 48.542 23.775 49.623 24.561 49.761 25.993 C 50.074 28.708 48.557 30 46.347 30 L 6 30.012 C 3.79 30.012 2 28.222 2 26.012 L 2.009 4.609 C 2.009 1.626 5.276 0.664 7.074 1.541 C 10.608 3.309 28.488 12.842 37.843 17.769 Z", 200.0f);
            x3.a("M 40.644 18.756 C 43.986 20.389 49.867 23.108 49.884 25.534 C 49.897 27.154 49.88 24.441 49.894 26.059 C 49.911 28.733 48.6 30 46.39 30 L 6 30.013 C 3.79 30.013 2 28.223 2 26.013 L 2.008 5.52 C 2.008 2.55 5.237 1.614 7.079 2.401 C 10.656 4 31.106 14.097 40.644 18.756 Z", 217.0f);
            x3.a("M 43.782 19.218 C 47.117 20.675 50.075 21.538 50.041 24.796 C 50.022 26.606 50.038 24.309 50.039 26.104 C 50.038 28.736 48.663 30 46.453 30 L 6 29.986 C 3.79 29.986 2 28.196 2 25.986 L 2.008 6.491 C 2.008 3.535 5.196 2.627 7.085 3.316 C 10.708 4.731 33.992 14.944 43.782 19.218 Z", 234.0f);
            x3.a("M 47.421 16.941 C 50.544 18.191 50.783 19.91 50.769 22.706 C 50.761 24.484 50.76 23.953 50.79 26.073 C 50.814 27.835 49.334 30 47.124 30 L 5 30.01 C 2.79 30.01 1 28.22 1 26.01 L 1.001 10.823 C 1.001 8.218 3.532 6.895 5.572 7.26 C 7.493 8.01 47.421 16.941 47.421 16.941 Z", 267.0f);
            x3.a("M 47.641 17.125 C 50.641 18.207 51.09 19.935 51.078 22.653 C 51.07 24.191 51.062 21.23 51.088 23.063 C 51.109 24.886 49.587 27 47.377 27 L 5 27.009 C 2.79 27.009 1 25.219 1 23.009 L 0.983 11.459 C 0.983 8.908 3.414 7.522 5.476 7.838 C 7.138 8.486 47.641 17.125 47.641 17.125 Z", 300.0f);
            x3.a("M 48 7 C 50.21 7 52 8.79 52 11 C 52 19 52 19 52 19 C 52 21.21 50.21 23 48 23 L 4 23 C 1.79 23 0 21.21 0 19 L 0 11 C 0 8.79 1.79 7 4 7 C 48 7 48 7 48 7 Z", 383.0f);
            y3 = resources.getDrawable(R.drawable.msg_check_s).mutate();
            z3 = resources.getDrawable(R.drawable.msg_check_s).mutate();
            A3 = resources.getDrawable(R.drawable.msg_check_s).mutate();
            B3 = resources.getDrawable(R.drawable.msg_check_s).mutate();
            F3 = resources.getDrawable(R.drawable.msg_check_s).mutate();
            H3 = resources.getDrawable(R.drawable.msg_check_s).mutate();
            C3 = resources.getDrawable(R.drawable.msg_halfcheck).mutate();
            D3 = resources.getDrawable(R.drawable.msg_halfcheck).mutate();
            G3 = resources.getDrawable(R.drawable.msg_halfcheck_s).mutate();
            I3 = resources.getDrawable(R.drawable.msg_halfcheck_s).mutate();
            E3 = new qb0();
            L3 = resources.getDrawable(R.drawable.ic_lock_header).mutate();
            M3 = resources.getDrawable(R.drawable.msg_views).mutate();
            N3 = resources.getDrawable(R.drawable.msg_views).mutate();
            O3 = resources.getDrawable(R.drawable.msg_views).mutate();
            P3 = resources.getDrawable(R.drawable.msg_views).mutate();
            Q3 = resources.getDrawable(R.drawable.msg_reply_small).mutate();
            R3 = resources.getDrawable(R.drawable.msg_reply_small).mutate();
            S3 = resources.getDrawable(R.drawable.msg_reply_small).mutate();
            T3 = resources.getDrawable(R.drawable.msg_reply_small).mutate();
            U3 = resources.getDrawable(R.drawable.msg_pin_mini).mutate();
            V3 = resources.getDrawable(R.drawable.msg_pin_mini).mutate();
            W3 = resources.getDrawable(R.drawable.msg_pin_mini).mutate();
            X3 = resources.getDrawable(R.drawable.msg_pin_mini).mutate();
            Z3 = resources.getDrawable(R.drawable.msg_pin_mini).mutate();
            Y3 = resources.getDrawable(R.drawable.msg_pin_mini).mutate();
            a4 = resources.getDrawable(R.drawable.msg_views).mutate();
            b4 = resources.getDrawable(R.drawable.msg_reply_small).mutate();
            J3 = resources.getDrawable(R.drawable.msg_views).mutate();
            K3 = resources.getDrawable(R.drawable.msg_reply_small).mutate();
            c4 = resources.getDrawable(R.drawable.msg_actions).mutate();
            d4 = resources.getDrawable(R.drawable.msg_actions).mutate();
            e4 = resources.getDrawable(R.drawable.msg_actions).mutate();
            f4 = resources.getDrawable(R.drawable.msg_actions).mutate();
            g4 = resources.getDrawable(R.drawable.video_actions);
            h4 = resources.getDrawable(R.drawable.msg_instant).mutate();
            i4 = resources.getDrawable(R.drawable.msg_instant).mutate();
            j4 = resources.getDrawable(R.drawable.msg_warning);
            k4 = resources.getDrawable(R.drawable.list_mute).mutate();
            l4 = resources.getDrawable(R.drawable.ic_lock_header);
            Drawable mutate = resources.getDrawable(R.drawable.chat_calls_voice).mutate();
            Drawable[] drawableArr2 = G4;
            drawableArr2[0] = mutate;
            Drawable mutate2 = resources.getDrawable(R.drawable.chat_calls_voice).mutate();
            Drawable[] drawableArr3 = H4;
            drawableArr3[0] = mutate2;
            Drawable mutate3 = resources.getDrawable(R.drawable.chat_calls_voice).mutate();
            Drawable[] drawableArr4 = I4;
            drawableArr4[0] = mutate3;
            Drawable mutate4 = resources.getDrawable(R.drawable.chat_calls_voice).mutate();
            Drawable[] drawableArr5 = J4;
            drawableArr5[0] = mutate4;
            drawableArr2[1] = resources.getDrawable(R.drawable.chat_calls_video).mutate();
            drawableArr3[1] = resources.getDrawable(R.drawable.chat_calls_video).mutate();
            drawableArr4[1] = resources.getDrawable(R.drawable.chat_calls_video).mutate();
            drawableArr5[1] = resources.getDrawable(R.drawable.chat_calls_video).mutate();
            O4 = resources.getDrawable(R.drawable.chat_calls_outgoing).mutate();
            P4 = resources.getDrawable(R.drawable.chat_calls_incoming).mutate();
            Q4 = resources.getDrawable(R.drawable.chat_calls_incoming).mutate();
            int i10 = 0;
            while (true) {
                drawableArr = M4;
                if (i10 >= 2) {
                    break;
                }
                K4[i10] = resources.getDrawable(R.drawable.poll_right).mutate();
                L4[i10] = resources.getDrawable(R.drawable.poll_wrong).mutate();
                drawableArr[i10] = resources.getDrawable(R.drawable.msg_emoji_objects).mutate();
                N4[i10] = resources.getDrawable(R.drawable.msg_psa).mutate();
                i10++;
            }
            V4 = resources.getDrawable(R.drawable.mini_call_out_16).mutate();
            W4 = resources.getDrawable(R.drawable.mini_call_out_16).mutate();
            X4 = resources.getDrawable(R.drawable.mini_call_in_16).mutate();
            Y4 = resources.getDrawable(R.drawable.mini_call_in_16).mutate();
            m4 = resources.getDrawable(R.drawable.bot_file);
            n4 = resources.getDrawable(R.drawable.bot_music);
            o4 = resources.getDrawable(R.drawable.bot_location);
            v4 = resources.getDrawable(R.drawable.bot_link);
            x4 = resources.getDrawable(R.drawable.bot_lines);
            w4 = resources.getDrawable(R.drawable.bot_card);
            y4 = resources.getDrawable(R.drawable.bot_webview);
            z4 = resources.getDrawable(R.drawable.bot_invite);
            A4 = resources.getDrawable(R.drawable.permission_locked);
            B4 = resources.getDrawable(R.drawable.msg_msgbubble);
            C4 = resources.getDrawable(R.drawable.msg_msgbubble2);
            D4 = resources.getDrawable(R.drawable.msg_arrowright);
            E4 = resources.getDrawable(R.drawable.gradient_left);
            F4 = resources.getDrawable(R.drawable.gradient_right);
            p4 = resources.getDrawable(R.drawable.header_shadow).mutate();
            R4 = resources.getDrawable(R.drawable.nophotos3);
            q4 = resources.getDrawable(R.drawable.filled_button_share).mutate();
            r4 = resources.getDrawable(R.drawable.filled_button_reply);
            s4 = resources.getDrawable(R.drawable.msg_voiceclose).mutate();
            t4 = resources.getDrawable(R.drawable.media_more).mutate();
            u4 = resources.getDrawable(R.drawable.filled_open_message);
            int dp = AndroidUtilities.dp(2.0f);
            RectF rectF = new RectF();
            Path path = new Path();
            Path[] pathArr = Z4;
            pathArr[0] = path;
            f10 = 1.0f;
            path.moveTo(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(3.0f));
            pathArr[0].lineTo(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(3.0f));
            pathArr[0].lineTo(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(10.0f));
            pathArr[0].lineTo(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(20.0f));
            int i11 = dp * 2;
            f12 = 14.0f;
            f11 = 3.0f;
            rectF.set(AndroidUtilities.dp(21.0f) - i11, AndroidUtilities.dp(19.0f) - dp, AndroidUtilities.dp(21.0f), AndroidUtilities.dp(19.0f) + dp);
            pathArr[0].arcTo(rectF, 0.0f, 90.0f, false);
            pathArr[0].lineTo(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(21.0f));
            rectF.set(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(19.0f) - dp, AndroidUtilities.dp(5.0f) + i11, AndroidUtilities.dp(19.0f) + dp);
            pathArr[0].arcTo(rectF, 90.0f, 90.0f, false);
            pathArr[0].lineTo(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(4.0f));
            rectF.set(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(5.0f) + i11, AndroidUtilities.dp(3.0f) + i11);
            pathArr[0].arcTo(rectF, 180.0f, 90.0f, false);
            pathArr[0].close();
            Path path2 = new Path();
            pathArr[1] = path2;
            path2.moveTo(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(5.0f));
            pathArr[1].lineTo(AndroidUtilities.dp(19.0f), AndroidUtilities.dp(10.0f));
            pathArr[1].lineTo(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(10.0f));
            pathArr[1].close();
            b5 = resources.getDrawable(R.drawable.filled_fire).mutate();
            c5 = resources.getDrawable(R.drawable.msg_round_gif_m).mutate();
            Drawable[][] drawableArr6 = U4;
            drawableArr6[0][0] = L(AndroidUtilities.dp(44.0f), R.drawable.msg_round_play_m);
            drawableArr6[0][1] = L(AndroidUtilities.dp(44.0f), R.drawable.msg_round_play_m);
            drawableArr6[1][0] = L(AndroidUtilities.dp(44.0f), R.drawable.msg_round_pause_m);
            drawableArr6[1][1] = L(AndroidUtilities.dp(44.0f), R.drawable.msg_round_pause_m);
            drawableArr6[2][0] = L(AndroidUtilities.dp(44.0f), R.drawable.msg_round_load_m);
            drawableArr6[2][1] = L(AndroidUtilities.dp(44.0f), R.drawable.msg_round_load_m);
            drawableArr6[3][0] = L(AndroidUtilities.dp(44.0f), R.drawable.msg_round_file_s);
            drawableArr6[3][1] = L(AndroidUtilities.dp(44.0f), R.drawable.msg_round_file_s);
            drawableArr6[4][0] = L(AndroidUtilities.dp(44.0f), R.drawable.msg_round_cancel_m);
            drawableArr6[4][1] = L(AndroidUtilities.dp(44.0f), R.drawable.msg_round_cancel_m);
            fq L10 = L(AndroidUtilities.dp(44.0f), R.drawable.msg_contact);
            Drawable[] drawableArr7 = T4;
            drawableArr7[0] = L10;
            drawableArr7[1] = L(AndroidUtilities.dp(44.0f), R.drawable.msg_contact);
            Drawable mutate5 = resources.getDrawable(R.drawable.msg_location).mutate();
            Drawable[] drawableArr8 = S4;
            drawableArr8[0] = mutate5;
            drawableArr8[1] = resources.getDrawable(R.drawable.msg_location).mutate();
            i3 = context.getResources().getDrawable(R.drawable.compose_panel_shadow).mutate();
            j3 = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
            f5 f5Var = new f5(0);
            Paint paint = new Paint(1);
            f5Var.b = paint;
            paint.setShadowLayer(AndroidUtilities.dp(4.0f), 0.0f, 0.0f, 1593835520);
            k3 = f5Var;
            jl.clear();
            kl.clear();
            Drawable drawable = x4;
            int i12 = kc;
            d(i12, "drawableBotInline", drawable);
            d(i12, "drawableBotWebView", y4);
            d(i12, "drawableBotLock", A4);
            d(i12, "drawableBotLink", v4);
            d(i12, "drawable_botInvite", z4);
            d(i12, "drawableGoIcon", u4);
            d(i12, "drawableCommentSticker", C4);
            d(Gc, "drawableMsgError", j4);
            d(-1, "drawableMsgIn", m3);
            d(-1, "drawableMsgInSelected", n3);
            d(-1, "drawableMsgInMedia", q3);
            d(-1, "drawableMsgInMediaSelected", r3);
            d(Dc, "drawableMsgInInstant", h4);
            d(-1, "drawableMsgOut", o3);
            d(-1, "drawableMsgOutSelected", p3);
            d(-1, "drawableMsgOutMedia", s3);
            d(-1, "drawableMsgOutMediaSelected", t3);
            Drawable drawable2 = drawableArr4[0];
            int i13 = Va;
            d(i13, "drawableMsgOutCallAudio", drawable2);
            Drawable drawable3 = drawableArr5[0];
            int i14 = Wa;
            d(i14, "drawableMsgOutCallAudioSelected", drawable3);
            d(i13, "drawableMsgOutCallVideo", drawableArr4[1]);
            d(i14, "drawableMsgOutCallVideo", drawableArr5[1]);
            d(Ja, "drawableMsgOutCheck", y3);
            d(Ka, "drawableMsgOutCheckSelected", z3);
            Drawable drawable4 = A3;
            int i15 = La;
            d(i15, "drawableMsgOutCheckRead", drawable4);
            Drawable drawable5 = B3;
            int i16 = Ma;
            d(i16, "drawableMsgOutCheckReadSelected", drawable5);
            d(i15, "drawableMsgOutHalfCheck", C3);
            d(i16, "drawableMsgOutHalfCheckSelected", D3);
            d(i13, "drawableMsgOutInstant", i4);
            d(Ta, "drawableMsgOutMenu", e4);
            d(Ua, "drawableMsgOutMenuSelected", f4);
            Drawable drawable6 = W3;
            int i17 = Ra;
            d(i17, "drawableMsgOutPinned", drawable6);
            Drawable drawable7 = X3;
            int i18 = Sa;
            d(i18, "drawableMsgOutPinnedSelected", drawable7);
            d(i17, "drawableMsgOutReplies", S3);
            d(i18, "drawableMsgOutReplies", T3);
            d(i17, "drawableMsgOutViews", O3);
            d(i18, "drawableMsgOutViewsSelected", P3);
            Drawable drawable8 = H3;
            int i19 = ic;
            d(i19, "drawableMsgStickerCheck", drawable8);
            d(i19, "drawableMsgStickerHalfCheck", I3);
            d(i19, "drawableMsgStickerPinned", Y3);
            d(i19, "drawableMsgStickerReplies", K3);
            d(i19, "drawableMsgStickerViews", J3);
            d(i12, "drawableReplyIcon", r4);
            d(i12, "drawableCloseIcon", s4);
            d(i12, "drawableMoreIcon", t4);
            d(i12, "drawableShareIcon", q4);
            d(oc, "drawableMuteIcon", k4);
            d(pc, "drawableLockIcon", l4);
            d(Xa, "drawable_chat_pollHintDrawableOut", drawableArr[1]);
            d(Kc, "drawable_chat_pollHintDrawableIn", drawableArr[0]);
            j(z10, false);
        }
        if (z10 || (textPaint = C2) == null) {
            return;
        }
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        D2.setTextSize(AndroidUtilities.dp(12.0f));
        E2.setTextSize(AndroidUtilities.dp(11.0f));
        G2.setTextSize(AndroidUtilities.dp(15.0f));
        H2.setTextSize(AndroidUtilities.dp(15.0f));
        I2.setTextSize(AndroidUtilities.dp(13.0f));
        N2.setTextSize(AndroidUtilities.dp(12.0f));
        F2.setTextSize(AndroidUtilities.dp(12.0f));
        O2.setTextSize(AndroidUtilities.dp(16.0f));
        P2.setTextSize(AndroidUtilities.dp(15.0f));
        Q2.setTextSize(AndroidUtilities.dp(15.0f));
        R2.setTextSize(AndroidUtilities.dp(15.0f));
        S2.setTextSize(AndroidUtilities.dp(13.0f));
        J2.setTextSize(AndroidUtilities.dp(12.0f));
        W2.setTextSize(AndroidUtilities.dp(r0));
        Y2.setTextSize(AndroidUtilities.dp(r0));
        Z2.setTextSize(AndroidUtilities.dp(r0));
        float f13 = (((SharedConfig.fontSize * 2) + 10) / f11) - f10;
        d3.setTextSize(AndroidUtilities.dp(f13));
        X2.setTextSize(AndroidUtilities.dp(r0));
        U2.setTextSize(AndroidUtilities.dp(f13));
        V2.setTextSize(AndroidUtilities.dp(12.0f));
        T2.setTextSize(AndroidUtilities.dp(12.0f));
        K2.setTextSize(AndroidUtilities.dp(13.0f));
        L2.setTextSize(AndroidUtilities.dp(13.0f));
        M2.setTextSize(AndroidUtilities.dp(13.0f));
        X1.setStrokeWidth(AndroidUtilities.dp(f10));
        Z1.setStrokeWidth(AndroidUtilities.dp(1.1f));
        s2.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 2));
        t2.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 2));
        u2.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 3));
        v2.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize)));
        f3.setTextSize(AndroidUtilities.dp(15.0f));
        g3.setTextSize(AndroidUtilities.dp(13.0f));
        k2.setStrokeWidth(AndroidUtilities.dp(f11));
        l2.setStrokeWidth(AndroidUtilities.dp(2.33f));
        e3.setTextSize(AndroidUtilities.dp(f12));
        e3.setTypeface(AndroidUtilities.bold());
    }

    public static org.telegram.ui.Cells.z J0(b6 b6Var, boolean z10) {
        int v02 = v0(i6, b6Var);
        return z10 ? I0(v02, d6, b6Var) : f0(v02, 2, -1);
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

    public static org.telegram.ui.Cells.z K0(boolean z10) {
        int w02 = w0(null, i6, false);
        return z10 ? I0(w02, d6, null) : f0(w02, 2, -1);
    }

    public static fq L(int i10, int i11) {
        Drawable mutate = i11 != 0 ? ApplicationLoader.applicationContext.getResources().getDrawable(i11).mutate() : null;
        OvalShape ovalShape = new OvalShape();
        float f10 = i10;
        ovalShape.resize(f10, f10);
        ShapeDrawable shapeDrawable = new ShapeDrawable(ovalShape);
        shapeDrawable.getPaint().setColor(-1);
        fq fqVar = new fq(shapeDrawable, mutate);
        fqVar.h = i10;
        fqVar.n = i10;
        return fqVar;
    }

    public static Drawable L0(int i10, Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 29 && (drawable instanceof StateListDrawable)) {
            return ((StateListDrawable) drawable).getStateDrawable(i10);
        }
        if (Bl == null) {
            try {
                Bl = StateListDrawable.class.getDeclaredMethod("getStateDrawable", Integer.TYPE);
            } catch (Throwable unused) {
            }
        }
        Method method = Bl;
        if (method == null) {
            return null;
        }
        try {
            return (Drawable) method.invoke(drawable, Integer.valueOf(i10));
        } catch (Exception unused2) {
            return null;
        }
    }

    public static org.telegram.ui.Cells.z M(int i10, int i11, int i12) {
        z.setColor(-1);
        return new org.telegram.ui.Cells.z(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i10}), null, new l5(i11, i12));
    }

    public static float[] M0(int i10) {
        ThreadLocal threadLocal = i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? yl : xl : wl : vl : ul;
        float[] fArr = (float[]) threadLocal.get();
        if (fArr != null) {
            return fArr;
        }
        float[] fArr2 = new float[3];
        threadLocal.set(fArr2);
        return fArr2;
    }

    public static void N() {
        O();
        if (C2 == null) {
            C2 = new TextPaint(1);
            TextPaint textPaint = new TextPaint(1);
            D2 = textPaint;
            textPaint.setTypeface(AndroidUtilities.bold());
            TextPaint textPaint2 = new TextPaint(1);
            E2 = textPaint2;
            textPaint2.setTypeface(AndroidUtilities.bold());
            TextPaint textPaint3 = new TextPaint(1);
            G2 = textPaint3;
            textPaint3.setTypeface(AndroidUtilities.bold());
            S1 = new Paint(1);
            Paint paint = new Paint(1);
            T1 = paint;
            Paint.Style style = Paint.Style.STROKE;
            paint.setStyle(style);
            Paint paint2 = T1;
            Paint.Cap cap = Paint.Cap.ROUND;
            paint2.setStrokeCap(cap);
            TextPaint textPaint4 = new TextPaint(1);
            H2 = textPaint4;
            textPaint4.setTypeface(AndroidUtilities.bold());
            I2 = new TextPaint(1);
            Paint paint3 = new Paint();
            U1 = paint3;
            paint3.setPathEffect(f80.c());
            Paint paint4 = new Paint();
            V1 = paint4;
            paint4.setPathEffect(f80.c());
            Paint paint5 = new Paint();
            W1 = paint5;
            paint5.setPathEffect(f80.c());
            Paint paint6 = new Paint(1);
            k2 = paint6;
            paint6.setStrokeCap(cap);
            k2.setStyle(style);
            k2.setColor(-1610612737);
            Paint paint7 = new Paint(1);
            l2 = paint7;
            paint7.setStrokeCap(cap);
            l2.setStyle(style);
            N2 = new TextPaint(1);
            TextPaint textPaint5 = new TextPaint(1);
            F2 = textPaint5;
            textPaint5.setTypeface(Typeface.DEFAULT_BOLD);
            TextPaint textPaint6 = new TextPaint(1);
            O2 = textPaint6;
            textPaint6.setTypeface(AndroidUtilities.bold());
            P2 = new TextPaint(1);
            TextPaint textPaint7 = new TextPaint(1);
            Q2 = textPaint7;
            textPaint7.setTypeface(AndroidUtilities.bold());
            TextPaint textPaint8 = new TextPaint(1);
            R2 = textPaint8;
            textPaint8.setTypeface(AndroidUtilities.bold());
            S2 = new TextPaint(1);
            J2 = new TextPaint(1);
            TextPaint textPaint9 = new TextPaint(1);
            K2 = textPaint9;
            textPaint9.setTypeface(AndroidUtilities.bold());
            L2 = new TextPaint(1);
            T2 = new TextPaint(1);
            U2 = new TextPaint(1);
            V2 = new TextPaint(1);
            TextPaint textPaint10 = new TextPaint(1);
            W2 = textPaint10;
            textPaint10.setTypeface(AndroidUtilities.bold());
            X2 = new TextPaint(1);
            TextPaint textPaint11 = new TextPaint(1);
            Y2 = textPaint11;
            textPaint11.setTypeface(AndroidUtilities.bold());
            Z2 = new TextPaint(1);
            TextPaint textPaint12 = new TextPaint(1);
            d3 = textPaint12;
            textPaint12.setTypeface(AndroidUtilities.bold());
            c3 = new TextPaint(1);
            e3 = new TextPaint(1);
            TextPaint textPaint13 = new TextPaint(1);
            M2 = textPaint13;
            textPaint13.setTypeface(AndroidUtilities.bold());
            Paint paint8 = new Paint(1);
            X1 = paint8;
            paint8.setStyle(style);
            X1.setStrokeCap(cap);
            Y1 = new Paint(1);
            Paint paint9 = new Paint(1);
            Z1 = paint9;
            paint9.setStyle(style);
            Z1.setStrokeCap(cap);
            a2 = new Paint(1);
            b2 = new Paint(1);
            c2 = new Paint(1);
            Paint paint10 = new Paint(1);
            d2 = paint10;
            paint10.setStyle(style);
            d2.setStrokeCap(cap);
            s2 = new TextPaint(1);
            t2 = new TextPaint(1);
            u2 = new TextPaint(1);
            s2.setTypeface(AndroidUtilities.bold());
            TextPaint textPaint14 = new TextPaint(1);
            v2 = textPaint14;
            textPaint14.setTypeface(AndroidUtilities.bold());
            Paint paint11 = new Paint(1);
            h2 = paint11;
            paint11.setColor(352321536);
            i2 = new Paint(1);
            TextPaint textPaint15 = new TextPaint(1);
            f3 = textPaint15;
            textPaint15.setTypeface(AndroidUtilities.bold());
            g3 = new TextPaint(1);
            j2 = new Paint();
            new Paint(1);
            m2 = new Paint(1);
            n2 = new Paint(1);
            e2 = new Paint(1);
            f2 = new Paint(7);
            g2 = new Paint(7);
            e(Hc, e2, "paintChatMessageBackgroundSelected");
            Paint paint12 = f2;
            int i10 = lc;
            e(i10, paint12, "paintChatActionBackground");
            e(i10, h2, "paintChatActionBackgroundDarken");
            e(mc, g2, "paintChatActionBackgroundSelected");
            TextPaint textPaint16 = s2;
            int i11 = ic;
            e(i11, textPaint16, "paintChatActionText");
            e(i11, t2, "paintChatActionText2");
            e(i11, u2, "paintChatActionText3");
            e(Nc, Q2, "paintChatBotButton");
            e(Sd, j2, "paintChatComposeBackground");
            e(wc, i2, "paintChatTimeBackground");
        }
    }

    public static e6 N0(String str) {
        return (e6) H.get(str);
    }

    public static void O() {
        synchronized (c) {
            try {
                if (o2 == null) {
                    o2 = new TextPaint(1);
                    x2 = new TextPaint(1);
                    y2 = new TextPaint[6];
                    z2 = new TextPaint(1);
                    A2 = new TextPaint(1);
                    B2 = new TextPaint(1);
                    TextPaint textPaint = new TextPaint(1);
                    w2 = textPaint;
                    textPaint.setTypeface(AndroidUtilities.bold());
                    TextPaint textPaint2 = new TextPaint(1);
                    W2 = textPaint2;
                    textPaint2.setTypeface(AndroidUtilities.bold());
                    TextPaint textPaint3 = new TextPaint(1);
                    Y2 = textPaint3;
                    textPaint3.setTypeface(AndroidUtilities.bold());
                    Z2 = new TextPaint(1);
                    a3 = new TextPaint(1);
                    b3 = new TextPaint(1);
                    c3 = new TextPaint(1);
                    TextPaint textPaint4 = new TextPaint(1);
                    d3 = textPaint4;
                    textPaint4.setTypeface(AndroidUtilities.bold());
                    X2 = new TextPaint(1);
                    U2 = new TextPaint(1);
                    T2 = new TextPaint(1);
                    TextPaint textPaint5 = new TextPaint(1);
                    p2 = textPaint5;
                    Typeface typeface = Typeface.MONOSPACE;
                    textPaint5.setTypeface(typeface);
                    TextPaint textPaint6 = new TextPaint(1);
                    q2 = textPaint6;
                    textPaint6.setTypeface(typeface);
                    TextPaint textPaint7 = new TextPaint(1);
                    r2 = textPaint7;
                    textPaint7.setTypeface(typeface);
                    new TextPaint(1);
                    V2 = new TextPaint(1);
                }
                float[] fArr = {0.68f, 0.46f, 0.34f, 0.28f, 0.22f, 0.19f};
                int i10 = 0;
                while (true) {
                    TextPaint[] textPaintArr = y2;
                    if (i10 < textPaintArr.length) {
                        textPaintArr[i10] = new TextPaint(1);
                        y2[i10].setTextSize(AndroidUtilities.dp(fArr[i10] * 120.0f));
                        i10++;
                    } else {
                        z2.setTextSize(AndroidUtilities.dp(46.0f));
                        A2.setTextSize(AndroidUtilities.dp(38.0f));
                        B2.setTextSize(AndroidUtilities.dp(30.0f));
                        o2.setTextSize(AndroidUtilities.dp(SharedConfig.fontSize));
                        x2.setTextSize(AndroidUtilities.dp(14.0f));
                        w2.setTextSize(AndroidUtilities.dp(15.0f));
                        W2.setTextSize(AndroidUtilities.dp(r1));
                        Y2.setTextSize(AndroidUtilities.dp(r1));
                        Z2.setTextSize(AndroidUtilities.dp(r1));
                        float f10 = (((SharedConfig.fontSize * 2) + 10) / 3.0f) - 1.0f;
                        a3.setTextSize(AndroidUtilities.dp(f10));
                        b3.setTextSize(AndroidUtilities.dp(r1));
                        V2.setTextSize(AndroidUtilities.dp(12.0f));
                        d3.setTextSize(AndroidUtilities.dp(f10));
                        c3.setTextSize(AndroidUtilities.dp(r1 - 2.0f));
                        X2.setTextSize(AndroidUtilities.dp(r1));
                        U2.setTextSize(AndroidUtilities.dp(f10));
                        p2.setTextSize(AndroidUtilities.dp(Math.max(Math.min(10, SharedConfig.fontSize - 1), SharedConfig.fontSize - 2)));
                        q2.setTextSize(AndroidUtilities.dp(Math.max(Math.min(10, SharedConfig.fontSize - 2), SharedConfig.fontSize - 3)));
                        r2.setTextSize(AndroidUtilities.dp(Math.max(Math.min(10, SharedConfig.fontSize - 2), SharedConfig.fontSize - 5)));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static Drawable O0(String str) {
        return (Drawable) jl.get(str);
    }

    public static void P(Context context) {
        if (k0 == null) {
            Paint paint = new Paint();
            k0 = paint;
            paint.setStrokeWidth(1.0f);
            Paint paint2 = new Paint();
            l0 = paint2;
            paint2.setStrokeWidth(1.0f);
            q0 = new Paint(1);
            Paint paint3 = new Paint(1);
            o0 = paint3;
            paint3.setStyle(Paint.Style.STROKE);
            o0.setStrokeWidth(AndroidUtilities.dp(2.0f));
            o0.setStrokeCap(Paint.Cap.ROUND);
            Paint paint4 = new Paint(1);
            n0 = paint4;
            paint4.setColor(0);
            n0.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            p0 = new Paint(1);
            Paint paint5 = new Paint();
            m0 = paint5;
            paint5.setPathEffect(f80.c());
            Resources resources = context.getResources();
            Drawable drawable = resources.getDrawable(R.drawable.chats_saved);
            Drawable[] drawableArr = r0;
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
            mi0 mi0Var = u1;
            if (mi0Var != null) {
                mi0Var.setCallback(null);
                u1.A(false);
            }
            mi0 mi0Var2 = v1;
            if (mi0Var2 != null) {
                mi0Var2.A(false);
            }
            mi0 mi0Var3 = w1;
            if (mi0Var3 != null) {
                mi0Var3.A(false);
            }
            mi0 mi0Var4 = x1;
            if (mi0Var4 != null) {
                mi0Var4.A(false);
            }
            mi0 mi0Var5 = y1;
            if (mi0Var5 != null) {
                mi0Var5.A(false);
            }
            mi0 mi0Var6 = z1;
            if (mi0Var6 != null) {
                mi0Var6.A(false);
            }
            u1 = new mi0(R.raw.chats_archiveavatar, "chats_archiveavatar", AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f), false, null);
            v1 = new mi0(R.raw.chats_archive, "chats_archive", AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f), false, null);
            w1 = new mi0(R.raw.chats_unarchive, "chats_unarchive", AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f), false, null);
            x1 = new mi0(R.raw.chats_hide, "chats_hide", AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f), false, null);
            y1 = new mi0(R.raw.chats_unhide, "chats_unhide", AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f), false, null);
            z1 = new mi0(R.raw.chat_audio_record_delete, "chats_psahide", AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f), false, null);
            H1 = new mi0(R.raw.swipe_mute, "swipe_mute", AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f), false, null);
            I1 = new mi0(R.raw.swipe_unmute, "swipe_unmute", AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f), false, null);
            L1 = new mi0(R.raw.swipe_read, "swipe_read", AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f), false, null);
            M1 = new mi0(R.raw.swipe_unread, "swipe_unread", AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f), false, null);
            J1 = new mi0(R.raw.swipe_delete, "swipe_delete", AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f), false, null);
            O1 = new mi0(R.raw.swipe_unpin, "swipe_unpin", AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f), false, null);
            N1 = new mi0(R.raw.swipe_pin, "swipe_pin", AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f), false, null);
            K1 = new mi0(R.raw.swipe_community_ungroup, "swipe_community_ungroup", AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), false, null);
            k();
        }
    }

    public static Drawable P0(String str, b6 b6Var) {
        Drawable drawable = b6Var != null ? b6Var.getDrawable(str) : null;
        return drawable != null ? drawable : (Drawable) jl.get(str);
    }

    public static jb0 Q(int i10, int i11) {
        jb0 jb0Var = new jb0(i10 != 0, -2368069, -9722489, -2762611, -7817084);
        if (i10 <= 0 || i11 <= 0) {
            Point point = AndroidUtilities.displaySize;
            i10 = Math.min(point.x, point.y);
            Point point2 = AndroidUtilities.displaySize;
            i11 = Math.max(point2.x, point2.y);
        }
        jb0Var.t(SvgHelper.getBitmap(R.raw.default_pattern, i10, i11, -16777216, 1.0f, SvgHelper.ScaleMode.ByWidth), 34);
        jb0Var.u(jb0Var.f());
        return jb0Var;
    }

    public static SparseIntArray Q0(File file, String str, String[] strArr) {
        int intValue;
        SparseIntArray sparseIntArray = new SparseIntArray();
        FileInputStream fileInputStream = null;
        try {
            try {
                byte[] bArr = new byte[1024];
                FileInputStream fileInputStream2 = new FileInputStream(str != null ? p0(str) : file);
                int i10 = -1;
                int i11 = 0;
                int i12 = -1;
                boolean z10 = false;
                while (true) {
                    try {
                        int read = fileInputStream2.read(bArr);
                        if (read == i10) {
                            break;
                        }
                        int i13 = i11;
                        int i14 = 0;
                        int i15 = 0;
                        while (true) {
                            if (i14 >= read) {
                                break;
                            }
                            if (bArr[i14] == 10) {
                                int i16 = i14 - i15;
                                int i17 = i16 + 1;
                                String str2 = new String(bArr, i15, i16);
                                if (str2.startsWith("WLS=")) {
                                    if (strArr != null && strArr.length > 0) {
                                        strArr[0] = str2.substring(4);
                                    }
                                } else {
                                    if (str2.startsWith("WPS")) {
                                        i12 = i13 + i17;
                                        z10 = true;
                                        break;
                                    }
                                    int indexOf = str2.indexOf(61);
                                    if (indexOf != i10) {
                                        String substring = str2.substring(0, indexOf);
                                        String substring2 = str2.substring(indexOf + 1);
                                        if (substring2.length() <= 0 || substring2.charAt(0) != '#') {
                                            intValue = Utilities.parseInt((CharSequence) substring2).intValue();
                                        } else {
                                            try {
                                                intValue = Color.parseColor(substring2);
                                            } catch (Exception unused) {
                                                intValue = Utilities.parseInt((CharSequence) substring2).intValue();
                                            }
                                        }
                                        int s10 = e5.s(substring);
                                        if (s10 >= 0) {
                                            sparseIntArray.put(s10, intValue);
                                        }
                                    }
                                }
                                i15 += i17;
                                i13 += i17;
                            }
                            i14++;
                            i10 = -1;
                        }
                        if (i11 == i13) {
                            break;
                        }
                        fileInputStream2.getChannel().position(i13);
                        if (z10) {
                            break;
                        }
                        i11 = i13;
                        i10 = -1;
                    } catch (Throwable th2) {
                        th = th2;
                        fileInputStream = fileInputStream2;
                        try {
                            FileLog.e(th);
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                            return sparseIntArray;
                        } finally {
                        }
                    }
                }
                sparseIntArray.put(g5, i12);
                fileInputStream2.close();
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        return sparseIntArray;
    }

    public static void R(Context context) {
        P(context);
        if (L0 == null) {
            TextPaint textPaint = new TextPaint(1);
            L0 = textPaint;
            textPaint.setTypeface(AndroidUtilities.bold());
            TextPaint textPaint2 = new TextPaint(1);
            M0 = textPaint2;
            textPaint2.setTypeface(AndroidUtilities.bold());
            w0 = new Paint(1);
            t0 = new Paint(1);
            A0 = new Paint(1);
        }
        L0.setTextSize(AndroidUtilities.dp(12.0f));
        M0.setTextSize(AndroidUtilities.dp(13.0f));
        if (B0 == null) {
            Resources resources = context.getResources();
            B0 = new TextPaint[2];
            C0 = new TextPaint[2];
            F0 = new TextPaint[2];
            H0 = new TextPaint[2];
            for (int i10 = 0; i10 < 2; i10++) {
                B0[i10] = new TextPaint(1);
                B0[i10].setTypeface(AndroidUtilities.bold());
                C0[i10] = new TextPaint(1);
                C0[i10].setTypeface(AndroidUtilities.bold());
                F0[i10] = new TextPaint(1);
                H0[i10] = new TextPaint(1);
            }
            TextPaint textPaint3 = new TextPaint(1);
            D0 = textPaint3;
            textPaint3.setTypeface(AndroidUtilities.bold());
            TextPaint textPaint4 = new TextPaint(1);
            E0 = textPaint4;
            textPaint4.setTypeface(AndroidUtilities.bold());
            TextPaint textPaint5 = new TextPaint(1);
            G0 = textPaint5;
            textPaint5.setTypeface(AndroidUtilities.bold());
            I0 = new TextPaint(1);
            J0 = new TextPaint(1);
            K0 = new TextPaint(1);
            TextPaint textPaint6 = new TextPaint(1);
            N0 = textPaint6;
            textPaint6.setTypeface(AndroidUtilities.bold());
            TextPaint textPaint7 = new TextPaint(1);
            O0 = textPaint7;
            textPaint7.setTypeface(AndroidUtilities.bold());
            P0 = new TextPaint(1);
            Q0 = new TextPaint(1);
            TextPaint textPaint8 = new TextPaint(1);
            R0 = textPaint8;
            textPaint8.setTypeface(AndroidUtilities.bold());
            u0 = new Paint();
            v0 = new Paint(1);
            y0 = new Paint(1);
            x0 = new Paint(1);
            z0 = new Paint(1);
            a1 = resources.getDrawable(R.drawable.list_secret);
            b1 = resources.getDrawable(R.drawable.msg_mini_lock2);
            T0 = resources.getDrawable(R.drawable.list_check).mutate();
            S0 = resources.getDrawable(R.drawable.community_cards).mutate();
            U0 = resources.getDrawable(R.drawable.minithumb_play).mutate();
            V0 = resources.getDrawable(R.drawable.list_check).mutate();
            W0 = resources.getDrawable(R.drawable.list_halfcheck);
            X0 = new qb0();
            Y0 = resources.getDrawable(R.drawable.list_warning_sign);
            Z0 = resources.getDrawable(R.drawable.list_reorder).mutate();
            c1 = resources.getDrawable(R.drawable.list_mute).mutate();
            d1 = resources.getDrawable(R.drawable.list_unmute).mutate();
            e1 = resources.getDrawable(R.drawable.mini_ephemeral_hidden_16).mutate();
            f1 = resources.getDrawable(R.drawable.verified_area).mutate();
            g1 = new il0(0);
            h1 = new il0(1);
            i1 = resources.getDrawable(R.drawable.verified_check).mutate();
            m1 = resources.getDrawable(R.drawable.filled_chatlist_mention).mutate();
            n1 = resources.getDrawable(R.drawable.filled_chatlist_reaction).mutate();
            o1 = resources.getDrawable(R.drawable.filled_chatlist_poll).mutate();
            p1 = resources.getDrawable(R.drawable.filled_chatlist_mention).mutate();
            q1 = resources.getDrawable(R.drawable.filled_chatlist_reaction).mutate();
            r1 = resources.getDrawable(R.drawable.filled_chatlist_poll).mutate();
            j1 = resources.getDrawable(R.drawable.list_pin);
            k1 = resources.getDrawable(R.drawable.msg_pin_mini).mutate();
            l1 = resources.getDrawable(R.drawable.msg_pin_mini).mutate();
            t1 = resources.getDrawable(R.drawable.msg_mini_forumarrow);
            s0 = resources.getDrawable(R.drawable.preview_arrow);
            RectF rectF = new RectF();
            Path path = new Path();
            Path[] pathArr = a5;
            pathArr[0] = path;
            pathArr[2] = new Path();
            float dp = AndroidUtilities.dp(12.0f);
            float dp2 = AndroidUtilities.dp(12.0f);
            rectF.set(dp - AndroidUtilities.dp(5.0f), dp2 - AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f) + dp, AndroidUtilities.dp(5.0f) + dp2);
            pathArr[2].arcTo(rectF, -160.0f, -110.0f, true);
            pathArr[2].arcTo(rectF, 20.0f, -110.0f, true);
            pathArr[0].moveTo(dp, AndroidUtilities.dp(8.0f) + dp2);
            pathArr[0].lineTo(dp, AndroidUtilities.dp(2.0f) + dp2);
            pathArr[0].lineTo(AndroidUtilities.dp(3.0f) + dp, AndroidUtilities.dp(5.0f) + dp2);
            pathArr[0].close();
            pathArr[0].moveTo(dp, dp2 - AndroidUtilities.dp(8.0f));
            pathArr[0].lineTo(dp, dp2 - AndroidUtilities.dp(2.0f));
            pathArr[0].lineTo(dp - AndroidUtilities.dp(3.0f), dp2 - AndroidUtilities.dp(5.0f));
            pathArr[0].close();
            n();
        }
        G0.setTextSize(AndroidUtilities.dp(14.0f));
        I0.setTextSize(AndroidUtilities.dp(12.0f));
        J0.setTextSize(AndroidUtilities.dp(12.0f));
        J0.setTypeface(AndroidUtilities.bold());
        K0.setTextSize(AndroidUtilities.dp(12.0f));
        K0.setTypeface(AndroidUtilities.bold());
        N0.setTextSize(AndroidUtilities.dp(13.0f));
        O0.setTextSize(AndroidUtilities.dp(11.0f));
        P0.setTextSize(AndroidUtilities.dp(15.0f));
        Q0.setTextSize(AndroidUtilities.dp(15.0f));
        R0.setTextSize(AndroidUtilities.dp(10.0f));
        D0.setTextSize(AndroidUtilities.dp(16.0f));
        E0.setTextSize(AndroidUtilities.dp(16.0f));
    }

    public static float R0(float f10) {
        return (f10 >= 0.0f || I.q()) ? f10 : -f10;
    }

    public static r5 S(Context context) {
        return T(context, w0(null, u5, false), w0(null, v5, false));
    }

    public static Paint S0(String str) {
        return Objects.equals(str, "paintDivider") ? k0 : (Paint) ll.get(str);
    }

    public static r5 T(Context context, int i10, int i11) {
        Resources resources = context.getResources();
        Drawable mutate = resources.getDrawable(R.drawable.search_dark).mutate();
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(i10, mode));
        Drawable mutate2 = resources.getDrawable(R.drawable.search_dark_activated).mutate();
        mutate2.setColorFilter(new PorterDuffColorFilter(i11, mode));
        r5 r5Var = new r5();
        r5Var.addState(new int[]{android.R.attr.state_enabled, android.R.attr.state_focused}, mutate2);
        r5Var.addState(new int[]{android.R.attr.state_focused}, mutate2);
        r5Var.addState(StateSet.WILD_CARD, mutate);
        return r5Var;
    }

    public static Paint T0(String str, b6 b6Var) {
        Paint O10;
        return (b6Var == null || (O10 = b6Var.O(str)) == null) ? S0(str) : O10;
    }

    public static r5 U(Context context, int i10, int i11, int i12) {
        Resources resources = context.getResources();
        Drawable mutate = resources.getDrawable(i10).mutate();
        if (i11 != 0) {
            mutate.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.MULTIPLY));
        }
        Drawable mutate2 = resources.getDrawable(i10).mutate();
        if (i12 != 0) {
            mutate2.setColorFilter(new PorterDuffColorFilter(i12, PorterDuff.Mode.MULTIPLY));
        }
        r5 r5Var = new r5();
        r5Var.setEnterFadeDuration(1);
        r5Var.setExitFadeDuration(200);
        r5Var.addState(new int[]{android.R.attr.state_selected}, mutate2);
        r5Var.addState(new int[0], mutate);
        return r5Var;
    }

    public static Drawable U0(Context context, int i10, int i11) {
        if (context == null) {
            return null;
        }
        Drawable mutate = context.getResources().getDrawable(i10).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.MULTIPLY));
        return mutate;
    }

    public static org.telegram.ui.Cells.z V(float f10, int i10, int i11) {
        return W(f10, 285212671, i10, i11, i10, i11);
    }

    public static Drawable V0(Context context, int i10, int i11) {
        return U0(context, i10, w0(null, i11, false));
    }

    public static org.telegram.ui.Cells.z W(float f10, int i10, int i11, int i12, int i13, int i14) {
        z.setColor(-1);
        return new org.telegram.ui.Cells.z(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i10}), null, new t5(i11, i12, i13, i14, f10));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(3:3|(1:5)|(2:7|8)(3:10|(1:105)(1:20)|(2:22|(1:24))(1:(5:96|(1:98)(1:103)|(1:100)|101|102)(1:104))))(3:106|(2:108|(7:112|(1:114)(1:117)|115|116|26|(7:29|30|31|32|(2:34|(2:35|(1:41)(1:39)))(0)|43|(7:45|(1:47)(1:60)|(1:51)|52|53|54|55)(1:(4:62|63|64|65)(2:70|71)))|28))|118)|25|26|(0)|28|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x014e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x014f, code lost:
    
        org.telegram.messenger.FileLog.e(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Drawable W0(View view, boolean z10) {
        jb0 jb0Var;
        File file;
        int i10;
        Throwable th2;
        FileInputStream fileInputStream;
        File d10;
        int i11 = rl.get(Nd);
        int i12 = 1;
        if (i11 != 0) {
            int i13 = rl.get(Od);
            int i14 = rl.get(Pd);
            int i15 = rl.get(Qd);
            int i16 = rl.get(Rd, -1);
            if (i16 == -1) {
                i16 = 45;
            }
            if (i13 == 0) {
                return new ColorDrawable(i11);
            }
            d6 k10 = I.k(false);
            file = (k10 == null || TextUtils.isEmpty(k10.o) || M != null || (d10 = k10.d()) == null || !d10.exists()) ? null : d10;
            if (i14 != 0) {
                jb0Var = new jb0(true, i11, i13, i14, i15);
                if (file == null) {
                    return jb0Var;
                }
            } else {
                if (file == null) {
                    n9 n9Var = new n9(n9.d(i16), new int[]{i11, i13});
                    n9Var.f(!z10 ? m5.c0.m(0.5f, 3) : m5.c0.m(0.125f, 1), view != null ? new q5(view, z10) : null, 0L);
                    return n9Var;
                }
                jb0Var = null;
            }
        } else {
            if (g0 > 0) {
                e6 e6Var = I;
                if (e6Var.b != null || e6Var.d != null) {
                    String str = e6Var.d;
                    file = str != null ? p0(str) : new File(I.b);
                    i10 = g0;
                    jb0Var = null;
                    if (file != null) {
                        try {
                            fileInputStream = new FileInputStream(file);
                            try {
                                fileInputStream.getChannel().position(i10);
                                BitmapFactory.Options options = new BitmapFactory.Options();
                                if (z10) {
                                    options.inJustDecodeBounds = true;
                                    float f10 = options.outWidth;
                                    float f11 = options.outHeight;
                                    int dp = AndroidUtilities.dp(100.0f);
                                    while (true) {
                                        float f12 = dp;
                                        if (f10 <= f12 && f11 <= f12) {
                                            break;
                                        }
                                        i12 *= 2;
                                        f10 /= 2.0f;
                                        f11 /= 2.0f;
                                    }
                                }
                                Bitmap.Config config = Bitmap.Config.ALPHA_8;
                                options.inPreferredConfig = config;
                                options.inJustDecodeBounds = false;
                                options.inSampleSize = i12;
                                Bitmap decodeStream = BitmapFactory.decodeStream(fileInputStream, null, options);
                                if (jb0Var == null) {
                                    if (decodeStream == null) {
                                        fileInputStream.close();
                                        return null;
                                    }
                                    BitmapDrawable bitmapDrawable = new BitmapDrawable(decodeStream);
                                    try {
                                        fileInputStream.close();
                                        return bitmapDrawable;
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                        return bitmapDrawable;
                                    }
                                }
                                d6 k11 = I.k(false);
                                int i17 = k11 != null ? (int) (k11.p * 100.0f) : 100;
                                if (decodeStream != null && decodeStream.getConfig() != config) {
                                    Bitmap copy = decodeStream.copy(config, false);
                                    decodeStream.recycle();
                                    decodeStream = copy;
                                }
                                jb0Var.t(decodeStream, i17);
                                jb0Var.u(jb0Var.f());
                                try {
                                    fileInputStream.close();
                                    return jb0Var;
                                } catch (Exception e11) {
                                    FileLog.e(e11);
                                    return jb0Var;
                                }
                            } catch (Throwable th3) {
                                th2 = th3;
                                try {
                                    FileLog.e(th2);
                                    if (fileInputStream != null) {
                                        fileInputStream.close();
                                    }
                                    return null;
                                } finally {
                                }
                            }
                        } catch (Throwable th4) {
                            th2 = th4;
                            fileInputStream = null;
                        }
                    }
                    return null;
                }
            }
            jb0Var = null;
            file = null;
        }
        i10 = 0;
        if (file != null) {
        }
        return null;
    }

    public static void X(Context context) {
        if (Q1 == null) {
            P1 = new TextPaint(1);
            Resources resources = context.getResources();
            Q1 = resources.getDrawable(R.drawable.verified_area).mutate();
            R1 = resources.getDrawable(R.drawable.verified_check).mutate();
            p();
        }
        P1.setTextSize(AndroidUtilities.dp(16.0f));
    }

    public static int X0(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return i10 | (-16777216);
    }

    public static org.telegram.ui.Cells.z Y(int i10, int i11, int i12) {
        z.setColor(-1);
        return new org.telegram.ui.Cells.z(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i10}), null, new c6(i11, i12));
    }

    public static String Y0(y5 y5Var) {
        String str;
        if (y5Var == null || TextUtils.isEmpty(y5Var.c) || y5Var.c.equals("d")) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        if (y5Var.i) {
            sb2.append("blur");
        }
        if (y5Var.j) {
            if (sb2.length() > 0) {
                sb2.append("+");
            }
            sb2.append("motion");
        }
        int i10 = y5Var.d;
        if (i10 == 0) {
            str = "https://attheme.org?slug=" + y5Var.c;
        } else {
            String lowerCase = String.format("%02x%02x%02x", Integer.valueOf(((byte) (i10 >> 16)) & 255), Integer.valueOf(((byte) (y5Var.d >> 8)) & 255), Byte.valueOf((byte) (y5Var.d & 255))).toLowerCase();
            int i11 = y5Var.e;
            String lowerCase2 = i11 != 0 ? String.format("%02x%02x%02x", Integer.valueOf(((byte) (i11 >> 16)) & 255), Integer.valueOf(((byte) (y5Var.e >> 8)) & 255), Byte.valueOf((byte) (y5Var.e & 255))).toLowerCase() : null;
            int i12 = y5Var.f;
            String lowerCase3 = i12 != 0 ? String.format("%02x%02x%02x", Integer.valueOf(((byte) (i12 >> 16)) & 255), Integer.valueOf(((byte) (y5Var.f >> 8)) & 255), Byte.valueOf((byte) (y5Var.f & 255))).toLowerCase() : null;
            int i13 = y5Var.g;
            String lowerCase4 = i13 != 0 ? String.format("%02x%02x%02x", Integer.valueOf(((byte) (i13 >> 16)) & 255), Integer.valueOf(((byte) (y5Var.g >> 8)) & 255), Byte.valueOf((byte) (y5Var.g & 255))).toLowerCase() : null;
            if (lowerCase2 == null || lowerCase3 == null) {
                if (lowerCase2 != null) {
                    StringBuilder e10 = ta.b.e(aa.d.z(lowerCase, "-", lowerCase2), "&rotation=");
                    e10.append(y5Var.h);
                    lowerCase = e10.toString();
                }
            } else if (lowerCase4 != null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(lowerCase);
                sb3.append("~");
                sb3.append(lowerCase2);
                sb3.append("~");
                sb3.append(lowerCase3);
                lowerCase = aa.d.r(sb3, "~", lowerCase4);
            } else {
                lowerCase = lowerCase + "~" + lowerCase2 + "~" + lowerCase3;
            }
            str = "https://attheme.org?slug=" + y5Var.c + "&intensity=" + ((int) (y5Var.k * 100.0f)) + "&bg_color=" + lowerCase;
        }
        if (sb2.length() <= 0) {
            return str;
        }
        StringBuilder e11 = ta.b.e(str, "&mode=");
        e11.append(sb2.toString());
        return e11.toString();
    }

    public static org.telegram.ui.Cells.z Z(int i10, int i11, int i12, int i13) {
        z.setColor(-1);
        float f10 = i12;
        float f11 = i13;
        return new org.telegram.ui.Cells.z(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i11}), c0(AndroidUtilities.dp(f10), AndroidUtilities.dp(f11), i10), new c6(f10, f11));
    }

    public static boolean Z0() {
        return P && I.e0 != null;
    }

    public static boolean a(int i10, int i11) {
        float red = Color.red(i10) / 255.0f;
        float green = Color.green(i10) / 255.0f;
        float blue = Color.blue(i10) / 255.0f;
        return ((((((float) Color.blue(i11)) / 255.0f) * 0.5f) + (blue * 0.5f)) * 0.0722f) + (((((Color.green(i11) / 255.0f) * 0.5f) + (green * 0.5f)) * 0.7152f) + ((((Color.red(i11) / 255.0f) * 0.5f) + (red * 0.5f)) * 0.2126f)) > 0.705f || (blue * 0.0722f) + ((green * 0.7152f) + (red * 0.2126f)) > 0.705f;
    }

    public static org.telegram.ui.Cells.z a0(int i10, int i11, int i12, int i13, int i14) {
        z.setColor(-1);
        c6 c6Var = new c6();
        c6Var.a = new Path();
        c6Var.b = new float[]{r5, r5, r5, r5, r5, r5, r5, r5};
        c6Var.c = true;
        float dp = AndroidUtilities.dp(i11);
        float dp2 = AndroidUtilities.dp(i12);
        float dp3 = AndroidUtilities.dp(i13);
        float dp4 = AndroidUtilities.dp(i14);
        return new org.telegram.ui.Cells.z(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i10}), null, c6Var);
    }

    public static boolean a1() {
        return Z != null;
    }

    public static int b(float f10, float f11, int i10) {
        float[] M02 = M0(5);
        Color.colorToHSV(i10, M02);
        float f12 = M02[1];
        if (f12 > 0.1f && f12 < 0.9f) {
            M02[1] = g7.n.a(f12 + f10, 0.0f, 1.0f);
        }
        M02[2] = g7.n.a(M02[2] + f11, 0.0f, 1.0f);
        return Color.HSVToColor(Color.alpha(i10), M02);
    }

    public static ShapeDrawable b0(int i10, int i11) {
        float f10 = i10;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{f10, f10, f10, f10, f10, f10, f10, f10}, null, null));
        shapeDrawable.getPaint().setColor(i11);
        return shapeDrawable;
    }

    public static boolean b1(int i10) {
        float[] M02 = M0(3);
        Color.colorToHSV(i10, M02);
        float f10 = M02[1];
        return f10 > 0.1f && f10 < 0.9f;
    }

    public static int c(int i10, int i11) {
        float[] M02 = M0(5);
        Color.colorToHSV(i11, M02);
        float f10 = M02[0];
        float f11 = M02[1];
        Color.colorToHSV(i10, M02);
        M02[0] = f10;
        M02[1] = AndroidUtilities.lerp(M02[1], f11, 0.25f);
        return Color.HSVToColor(Color.alpha(i10), M02);
    }

    public static ShapeDrawable c0(int i10, int i11, int i12) {
        float f10 = i10;
        float f11 = i11;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{f10, f10, f10, f10, f11, f11, f11, f11}, null, null));
        shapeDrawable.getPaint().setColor(i12);
        return shapeDrawable;
    }

    public static boolean c1(int i10) {
        return rl.indexOfKey(i10) >= 0;
    }

    public static void d(int i10, String str, Drawable drawable) {
        jl.put(str, drawable);
        kl.put(str, Integer.valueOf(i10));
    }

    public static InsetDrawable d0(int i10, int i11) {
        float f10 = i10;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{f10, f10, f10, f10, f10, f10, f10, f10}, null, null));
        shapeDrawable.getPaint().setColor(i11);
        shapeDrawable.getPaint().setShadowLayer(AndroidUtilities.dpf2(2.0f), 0.0f, AndroidUtilities.dpf2(0.33f), l1(Color.alpha(i11) / 255.0f, 285212672));
        return new InsetDrawable((Drawable) shapeDrawable, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
    }

    public static boolean d1() {
        e6 e6Var = I;
        if (e6Var.O && e6Var.U == n) {
            return false;
        }
        return rl.indexOfKey(Nd) >= 0 || g0 > 0 || !TextUtils.isEmpty(h0);
    }

    public static void e(int i10, Paint paint, String str) {
        ll.put(str, paint);
        ml.put(str, Integer.valueOf(i10));
    }

    public static org.telegram.ui.Cells.z e0(int i10, int i11) {
        return f0(i10, i11, -1);
    }

    public static boolean e1() {
        return I.q();
    }

    public static void f(SparseIntArray sparseIntArray, SparseIntArray sparseIntArray2, boolean z10) {
        if (z10) {
            int i10 = xk;
            if (sparseIntArray.indexOfKey(i10) < 0) {
                sparseIntArray2.put(i10, l1(0.1f, -1));
            }
        }
        int[] iArr = nl;
        int i11 = ra;
        int i12 = sparseIntArray2.get(i11, iArr[i11]);
        int E12 = E1(sparseIntArray2);
        int i13 = zk;
        if (sparseIntArray.indexOfKey(i13) < 0) {
            sparseIntArray2.put(i13, w(i12, z10, false));
        }
        int i14 = Ak;
        if (sparseIntArray.indexOfKey(i14) < 0) {
            sparseIntArray2.put(i14, w(i12, z10, true));
        }
        int i15 = Bk;
        if (sparseIntArray.indexOfKey(i15) < 0) {
            sparseIntArray2.put(i15, w(E12, z10, false));
        }
        int i16 = Ck;
        if (sparseIntArray.indexOfKey(i16) < 0) {
            sparseIntArray2.put(i16, w(E12, z10, true));
        }
        int i17 = Dk;
        if (sparseIntArray.indexOfKey(i17) < 0) {
            sparseIntArray2.put(i17, x(i12, z10, false, true));
        }
        int i18 = Ek;
        if (sparseIntArray.indexOfKey(i18) < 0) {
            sparseIntArray2.put(i18, x(E12, z10, true, true));
        }
        int i19 = Fk;
        if (sparseIntArray.indexOfKey(i19) < 0) {
            sparseIntArray2.put(i19, x(i12, z10, false, false));
        }
        int i20 = Gk;
        if (sparseIntArray.indexOfKey(i20) < 0) {
            sparseIntArray2.put(i20, x(E12, z10, true, false));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static org.telegram.ui.Cells.z f0(int i10, int i11, int i12) {
        Drawable drawable;
        if ((i11 != 1 && i11 != 5) || Build.VERSION.SDK_INT < 23) {
            if (i11 == 1 || i11 == 3 || i11 == 4 || i11 == 5 || i11 == 6 || i11 == 7) {
                z.setColor(-1);
                drawable = new og.c(i11, i12);
            } else if (i11 == 2) {
                drawable = new ColorDrawable(-1);
            }
            org.telegram.ui.Cells.z zVar = new org.telegram.ui.Cells.z(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i10}), null, drawable);
            if (Build.VERSION.SDK_INT >= 23) {
                if (i11 == 1) {
                    if (i12 <= 0) {
                        i12 = AndroidUtilities.dp(20.0f);
                    }
                    zVar.setRadius(i12);
                    return zVar;
                }
                if (i11 == 5) {
                    zVar.setRadius(-1);
                }
            }
            return zVar;
        }
        drawable = null;
        org.telegram.ui.Cells.z zVar2 = new org.telegram.ui.Cells.z(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i10}), null, drawable);
        if (Build.VERSION.SDK_INT >= 23) {
        }
        return zVar2;
    }

    public static boolean f1() {
        return !I.q();
    }

    public static void g(SparseIntArray sparseIntArray, SparseIntArray sparseIntArray2, boolean z10) {
        int[] iArr = nl;
        int i10 = ra;
        int i11 = sparseIntArray2.get(i10, iArr[i10]);
        int E12 = E1(sparseIntArray2);
        int i12 = rk;
        if (sparseIntArray.indexOfKey(i12) < 0) {
            sparseIntArray2.put(i12, y(i11, z10, false));
        }
        int i13 = sk;
        if (sparseIntArray.indexOfKey(i13) < 0) {
            sparseIntArray2.put(i13, y(E12, z10, true));
        }
        int i14 = tk;
        if (sparseIntArray.indexOfKey(i14) < 0) {
            sparseIntArray2.put(i14, z(i11, z10, false));
        }
        int i15 = uk;
        if (sparseIntArray.indexOfKey(i15) < 0) {
            sparseIntArray2.put(i15, z(E12, z10, true));
        }
        int i16 = wk;
        if (sparseIntArray.indexOfKey(i16) < 0) {
            int i17 = ab;
            sparseIntArray2.put(i16, l1(0.2f, sparseIntArray2.get(i17, iArr[i17])));
        }
        if (z10) {
            int i18 = vk;
            if (sparseIntArray.indexOfKey(i18) < 0) {
                int i19 = Yc;
                sparseIntArray2.put(i18, l1(0.2f, sparseIntArray2.get(i19, iArr[i19])));
            }
        }
    }

    public static org.telegram.ui.Cells.z g0(int i10, int i11) {
        return new org.telegram.ui.Cells.z(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i11}), new ColorDrawable(i10), new ColorDrawable(i10));
    }

    public static boolean g1(d6 d6Var) {
        e6 e6Var = d6Var.b;
        if (e6Var == null) {
            return false;
        }
        if (e6Var.m().equals("Blue") && d6Var.a == 99) {
            return true;
        }
        if (d6Var.b.m().equals("Day") && d6Var.a == 9) {
            return true;
        }
        return (d6Var.b.m().equals("Night") || d6Var.b.m().equals("Dark Blue")) && d6Var.a == 0;
    }

    public static void h(Drawable drawable) {
        Bitmap bitmap;
        if (e2 == null) {
            return;
        }
        int i10 = rl.get(Hc);
        boolean z10 = (drawable instanceof jb0) && SharedConfig.getDevicePerformanceClass() != 0 && i10 == 0;
        if (z10 && Y != (bitmap = ((jb0) drawable).k)) {
            Y = bitmap;
            Bitmap bitmap2 = Y;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            Z = new BitmapShader(bitmap2, tileMode, tileMode);
            if (a0 == null) {
                a0 = new Matrix();
            }
        }
        if (Z != null && i10 == 0 && z10) {
            ColorMatrix colorMatrix = new ColorMatrix();
            AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 2.5f);
            AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.75f);
            e2.setShader(Z);
            e2.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            e2.setAlpha(64);
            return;
        }
        Paint paint = e2;
        if (i10 == 0) {
            i10 = TLObject.FLAG_30;
        }
        paint.setColor(i10);
        e2.setColorFilter(null);
        e2.setShader(null);
    }

    public static org.telegram.ui.Cells.z h0(int i10, int i11, int i12) {
        OvalShape ovalShape = new OvalShape();
        float f10 = i10;
        ovalShape.resize(f10, f10);
        ShapeDrawable shapeDrawable = new ShapeDrawable(ovalShape);
        shapeDrawable.getPaint().setColor(i11);
        ShapeDrawable shapeDrawable2 = new ShapeDrawable(ovalShape);
        shapeDrawable2.getPaint().setColor(-1);
        return new org.telegram.ui.Cells.z(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i12}), shapeDrawable, shapeDrawable2);
    }

    public static void h1(int i10, boolean z10) {
        boolean[] zArr = C;
        if (zArr[i10]) {
            return;
        }
        if ((z10 || Math.abs((System.currentTimeMillis() / 1000) - D[i10]) >= 3600) && UserConfig.getInstance(i10).isClientActivated()) {
            zArr[i10] = true;
            TL_account.getThemes getthemes = new TL_account.getThemes();
            getthemes.format = "android";
            if (!MediaDataController.getInstance(i10).defaultEmojiThemes.isEmpty()) {
                getthemes.hash = E[i10];
            }
            if (BuildVars.LOGS_ENABLED) {
                Log.i("theme", "loading remote themes, hash " + getthemes.hash);
            }
            ConnectionsManager.getInstance(i10).sendRequest(getthemes, new mh.j2(i10, 3));
        }
    }

    public static void i(Drawable drawable) {
        Bitmap bitmap;
        if (f2 == null) {
            return;
        }
        X = c0;
        b0 = d0;
        SparseIntArray sparseIntArray = rl;
        int i10 = lc;
        int indexOfKey = sparseIntArray.indexOfKey(i10);
        int valueAt = indexOfKey >= 0 ? rl.valueAt(indexOfKey) : X;
        int indexOfKey2 = rl.indexOfKey(mc);
        int valueAt2 = indexOfKey2 >= 0 ? rl.valueAt(indexOfKey2) : b0;
        boolean z10 = drawable instanceof jb0;
        if ((z10 || (drawable instanceof BitmapDrawable)) && SharedConfig.getDevicePerformanceClass() != 0 && LiteMode.isEnabled(32)) {
            if (z10) {
                bitmap = ((jb0) drawable).k;
            } else {
                if (drawable instanceof BitmapDrawable) {
                    WeakReference weakReference = Fl;
                    if (weakReference == null || weakReference.get() != drawable) {
                        WeakReference weakReference2 = Fl;
                        if (weakReference2 != null) {
                            weakReference2.clear();
                        }
                        Fl = null;
                        if (drawable.getIntrinsicWidth() == 0 || drawable.getIntrinsicHeight() == 0) {
                            Gl = null;
                        } else {
                            Fl = new WeakReference(drawable);
                            int intrinsicWidth = (int) ((drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight()) * 24.0f);
                            Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, 24, Bitmap.Config.ARGB_8888);
                            drawable.setBounds(0, 0, intrinsicWidth, 24);
                            ColorFilter colorFilter = drawable.getColorFilter();
                            ColorMatrix colorMatrix = new ColorMatrix();
                            colorMatrix.setSaturation(1.3f);
                            AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.94f);
                            drawable.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                            drawable.draw(new Canvas(createBitmap));
                            drawable.setColorFilter(colorFilter);
                            Utilities.blurBitmap(createBitmap, 3);
                            Gl = createBitmap;
                            bitmap = createBitmap;
                        }
                    } else {
                        bitmap = Gl;
                    }
                }
                bitmap = null;
            }
            if (Y != bitmap) {
                Y = bitmap;
                Bitmap bitmap2 = Y;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                Z = new BitmapShader(bitmap2, tileMode, tileMode);
                if (Build.VERSION.SDK_INT >= 33) {
                    Z.setFilterMode(2);
                }
                if (a0 == null) {
                    a0 = new Matrix();
                }
            }
            w1(-1, Y3);
            w1(-1, H3);
            w1(-1, I3);
            w1(-1, J3);
            w1(-1, K3);
            s2.setColor(-1);
            t2.setColor(-1);
            u2.setColor(-1);
            s2.linkColor = -1;
            v2.setColor(-1);
            Q2.setColor(-1);
            w1(-1, C4);
            w1(-1, q4);
            w1(-1, r4);
            w1(-1, u4);
            w1(-1, x4);
            w1(-1, y4);
            w1(-1, A4);
            w1(-1, z4);
            w1(-1, v4);
        } else {
            Y = null;
            Z = null;
            Drawable drawable2 = Y3;
            int i11 = ic;
            x1(i11, drawable2);
            x1(i11, H3);
            x1(i11, I3);
            x1(i11, J3);
            x1(i11, K3);
            s2.setColor(w0(null, i11, false));
            t2.setColor(w0(null, i11, false));
            s2.linkColor = w0(null, jc, false);
            v2.setColor(w0(null, i11, false));
            Drawable drawable3 = C4;
            int i12 = kc;
            x1(i12, drawable3);
            x1(i12, q4);
            x1(i12, r4);
            x1(i12, u4);
            x1(i12, x4);
            x1(i12, y4);
            x1(i12, A4);
            x1(i12, z4);
            x1(i12, v4);
            Q2.setColor(w0(null, Nc, false));
        }
        f2.setColor(valueAt);
        g2.setColor(valueAt2);
        if (Z == null || !(rl.indexOfKey(i10) < 0 || z10 || (drawable instanceof BitmapDrawable))) {
            f2.setColorFilter(null);
            f2.setShader(null);
            g2.setColorFilter(null);
            g2.setShader(null);
            h2.setAlpha(21);
            return;
        }
        ColorMatrix colorMatrix2 = new ColorMatrix();
        if (z10) {
            if (((jb0) drawable).q >= 0.0f) {
                colorMatrix2.setSaturation(1.6f);
                AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix2, I.q() ? 0.97f : 0.92f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix2, I.q() ? 0.12f : -0.06f);
            } else {
                colorMatrix2.setSaturation(1.1f);
                AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix2, I.q() ? 0.4f : 0.8f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix2, I.q() ? 0.08f : -0.06f);
            }
        } else {
            colorMatrix2.setSaturation(1.6f);
            AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix2, I.q() ? 0.9f : 0.84f);
            AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix2, I.q() ? -0.04f : 0.06f);
        }
        f2.setFilterBitmap(true);
        f2.setShader(Z);
        f2.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
        f2.setAlpha(255);
        g2.setFilterBitmap(true);
        g2.setShader(Z);
        ColorMatrix colorMatrix3 = new ColorMatrix(colorMatrix2);
        AndroidUtilities.adjustSaturationColorMatrix(colorMatrix3, 0.26f);
        e1();
        AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix3, 0.92f);
        g2.setColorFilter(new ColorMatrixColorFilter(colorMatrix3));
        g2.setAlpha(255);
        h2.setAlpha(0);
    }

    public static org.telegram.ui.Cells.z i0(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
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
        return new org.telegram.ui.Cells.z(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i15}), shapeDrawable, shapeDrawable2);
    }

    public static Bitmap i1(FileInputStream fileInputStream, int i10) {
        int i11;
        try {
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 1;
                options.inJustDecodeBounds = true;
                long j10 = i10;
                fileInputStream.getChannel().position(j10);
                BitmapFactory.decodeStream(fileInputStream, null, options);
                float f10 = options.outWidth;
                float f11 = options.outHeight;
                Point point = AndroidUtilities.displaySize;
                int min = Math.min(point.x, point.y);
                Point point2 = AndroidUtilities.displaySize;
                int max = Math.max(point2.x, point2.y);
                float min2 = (min < max || f10 <= f11) ? Math.min(f10 / min, f11 / max) : Math.max(f10 / min, f11 / max);
                if (min2 < 1.2f) {
                    min2 = 1.0f;
                }
                options.inJustDecodeBounds = false;
                if (min2 <= 1.0f || (f10 <= min && f11 <= max)) {
                    options.inSampleSize = (int) min2;
                } else {
                    int i12 = 1;
                    while (true) {
                        i11 = i12 * 2;
                        if (i12 * 4 >= min2) {
                            break;
                        }
                        i12 = i11;
                    }
                    options.inSampleSize = i11;
                }
                fileInputStream.getChannel().position(j10);
                Bitmap decodeStream = BitmapFactory.decodeStream(fileInputStream, null, options);
                if (decodeStream.getWidth() < min || decodeStream.getHeight() < max) {
                    float max2 = Math.max(min / decodeStream.getWidth(), max / decodeStream.getHeight());
                    if (max2 >= 1.02f) {
                        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(decodeStream, (int) (decodeStream.getWidth() * max2), (int) (decodeStream.getHeight() * max2), true);
                        decodeStream.recycle();
                        try {
                            fileInputStream.close();
                        } catch (Exception unused) {
                        }
                        return createScaledBitmap;
                    }
                }
                try {
                    fileInputStream.close();
                } catch (Exception unused2) {
                }
                return decodeStream;
            } catch (Throwable th2) {
                try {
                    fileInputStream.close();
                } catch (Exception unused3) {
                }
                throw th2;
            }
        } catch (Exception e10) {
            FileLog.e(e10);
            try {
                fileInputStream.close();
            } catch (Exception unused4) {
            }
            return null;
        }
    }

    public static void j(boolean z10, boolean z11) {
        if (o2 == null || m3 == null || z10) {
            return;
        }
        K2.setColor(w0(null, Jc, false));
        J2.setColor(w0(null, Ic, false));
        Q2.setColor(w0(null, Nc, false));
        U1.setColor(w0(null, Ld, false));
        V1.setColor(w0(null, Mb, false));
        W1.setColor(w0(null, Md, false));
        b2.setColor(w0(null, Fc, false));
        Paint paint = c2;
        int i10 = pa;
        paint.setColor(w0(null, i10, false));
        d2.setColor(w0(null, i10, false));
        TextPaint textPaint = s2;
        int i11 = ic;
        textPaint.setColor(w0(null, i11, false));
        t2.setColor(w0(null, i11, false));
        u2.setColor(w0(null, i11, false));
        s2.linkColor = w0(null, jc, false);
        v2.setColor(w0(null, i11, false));
        f3.setColor(w0(null, G6, false));
        Paint paint2 = j2;
        int i12 = Sd;
        paint2.setColor(w0(null, i12, false));
        i2.setColor(w0(null, wc, false));
        x1(kd, h3);
        d5 d5Var = m3;
        int i13 = ra;
        x1(i13, d5Var);
        d5 d5Var2 = n3;
        int i14 = dc;
        x1(i14, d5Var2);
        x1(i13, q3);
        x1(i14, r3);
        x1(Ja, y3);
        x1(Ka, z3);
        Drawable drawable = A3;
        int i15 = La;
        x1(i15, drawable);
        Drawable drawable2 = B3;
        int i16 = Ma;
        x1(i16, drawable2);
        x1(i15, C3);
        x1(i16, D3);
        Drawable drawable3 = F3;
        int i17 = sc;
        x1(i17, drawable3);
        x1(i17, G3);
        x1(i11, H3);
        x1(i11, I3);
        x1(i11, J3);
        x1(i11, K3);
        x1(i11, L3);
        Drawable drawable4 = q4;
        int i18 = kc;
        x1(i18, drawable4);
        x1(i18, r4);
        x1(i18, u4);
        x1(i18, x4);
        x1(i18, y4);
        Drawable drawable5 = A4;
        int i19 = pc;
        x1(i19, drawable5);
        x1(i18, z4);
        x1(i18, v4);
        Drawable drawable6 = M3;
        int i20 = xc;
        x1(i20, drawable6);
        Drawable drawable7 = N3;
        int i21 = yc;
        x1(i21, drawable7);
        Drawable drawable8 = O3;
        int i22 = Ra;
        x1(i22, drawable8);
        Drawable drawable9 = P3;
        int i23 = Sa;
        x1(i23, drawable9);
        x1(i20, Q3);
        x1(i21, R3);
        x1(i22, S3);
        x1(i23, T3);
        x1(i20, U3);
        x1(i21, V3);
        x1(i22, W3);
        x1(i23, X3);
        Drawable drawable10 = Z3;
        int i24 = zc;
        x1(i24, drawable10);
        x1(i11, Y3);
        x1(i24, a4);
        x1(i24, b4);
        x1(Ac, c4);
        x1(Bc, d4);
        x1(Ta, e4);
        x1(Ua, f4);
        x1(Cc, g4);
        Drawable drawable11 = i4;
        int i25 = Va;
        x1(i25, drawable11);
        Drawable drawable12 = h4;
        int i26 = Dc;
        x1(i26, drawable12);
        x1(Gc, j4);
        x1(oc, k4);
        x1(i19, l4);
        Drawable drawable13 = m4;
        int i27 = Ge;
        x1(i27, drawable13);
        x1(i27, n4);
        x1(i27, o4);
        x1(i26, B4);
        x1(i18, C4);
        x1(i26, D4);
        Drawable drawable14 = E4;
        int i28 = Be;
        x1(i28, drawable14);
        x1(i28, F4);
        for (int i29 = 0; i29 < 2; i29++) {
            x1(i26, G4[i29]);
            x1(Ec, H4[i29]);
            x1(i25, I4[i29]);
            x1(Wa, J4[i29]);
        }
        x1(Ia, O4);
        Drawable drawable15 = P4;
        int i30 = r7;
        x1(i30, drawable15);
        x1(qa, Q4);
        x1(i30, V4);
        Drawable drawable16 = W4;
        int i31 = Di;
        x1(i31, drawable16);
        x1(i30, X4);
        x1(i31, Y4);
        int i32 = 0;
        while (true) {
            tv0[] tv0VarArr = u3;
            if (i32 >= tv0VarArr.length) {
                break;
            }
            x1(p9, tv0VarArr[i32]);
            i32++;
        }
        for (int i33 = 0; i33 < 5; i33++) {
            Drawable[][] drawableArr = U4;
            v1(drawableArr[i33][0], w0(null, ie, false), false);
            v1(drawableArr[i33][0], w0(null, uc, false), true);
            v1(drawableArr[i33][1], w0(null, je, false), false);
            v1(drawableArr[i33][1], w0(null, vc, false), true);
        }
        Drawable[] drawableArr2 = T4;
        v1(drawableArr2[0], w0(null, re, false), false);
        v1(drawableArr2[0], w0(null, se, false), true);
        v1(drawableArr2[1], w0(null, Qb, false), false);
        v1(drawableArr2[1], w0(null, Rb, false), true);
        Drawable[] drawableArr3 = S4;
        w1(w0(null, qe, false), drawableArr3[0]);
        w1(w0(null, Pb, false), drawableArr3[1]);
        Drawable[] drawableArr4 = M4;
        w1(w0(null, Kc, false), drawableArr4[0]);
        w1(w0(null, Xa, false), drawableArr4[1]);
        Drawable[] drawableArr5 = N4;
        w1(w0(null, i20, false), drawableArr5[0]);
        w1(w0(null, i22, false), drawableArr5[1]);
        x1(Td, i3);
        x1(i12, j3);
        int w02 = w0(null, zb, false) == -1 ? w0(null, Aa, false) : -1;
        w1(w02, K4[1]);
        w1(w02, L4[1]);
        w1(w0(null, da, false), R4);
        if (z11 || b) {
            return;
        }
        Drawable drawable17 = e0;
        if (drawable17 != null) {
            i(drawable17);
        }
        h(e0);
    }

    public static boolean j0(e6 e6Var, d6 d6Var, boolean z10) {
        boolean z11 = false;
        if (d6Var == null || e6Var == null || e6Var.X == null) {
            return false;
        }
        boolean z12 = d6Var.a == e6Var.U;
        File d10 = d6Var.d();
        if (d10 != null) {
            d10.delete();
        }
        e6Var.W.remove(d6Var.a);
        e6Var.X.remove(d6Var);
        TLRPC.TL_theme tL_theme = d6Var.r;
        if (tL_theme != null) {
            e6Var.Y.remove(tL_theme.id);
        }
        y5 y5Var = d6Var.y;
        if (y5Var != null) {
            y5.a(y5Var);
        }
        if (z12) {
            e6Var.u(((d6) e6Var.X.get(0)).a);
        }
        if (z10) {
            t1(e6Var, true, false, false, false, false);
            if (d6Var.r != null) {
                MessagesController messagesController = MessagesController.getInstance(d6Var.t);
                if (z12 && e6Var == J) {
                    z11 = true;
                }
                messagesController.saveTheme(e6Var, d6Var, z11, true);
            }
        }
        return z12;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void j1(boolean z10) {
        File file;
        TLRPC.Document document;
        boolean z11;
        float f10;
        float f11;
        TLRPC.WallPaper wallPaper;
        if (e0 != null) {
            return;
        }
        e6 e6Var = I;
        boolean z12 = e6Var.O && e6Var.U == n;
        d6 k10 = e6Var.k(false);
        TLRPC.Document document2 = null;
        if (k10 != null) {
            File d10 = k10.d();
            boolean z13 = k10.q;
            TLRPC.TL_theme tL_theme = k10.r;
            TLRPC.ThemeSettings themeSettings = (tL_theme == null || tL_theme.settings.size() <= 0) ? null : k10.r.settings.get(0);
            if (k10.r != null && themeSettings != null && (wallPaper = themeSettings.wallpaper) != null) {
                document2 = wallPaper.document;
            }
            document = document2;
            z11 = z13;
            file = d10;
        } else {
            file = null;
            document = null;
            z11 = false;
        }
        e6 e6Var2 = I;
        y5 y5Var = e6Var2.e0;
        if (y5Var != null) {
            f11 = y5Var.k;
        } else {
            if (k10 == null) {
                f10 = e6Var2.y;
                int i10 = (int) f10;
                if (!z10) {
                    DispatchQueue dispatchQueue = Utilities.themeQueue;
                    of.r0 r0Var = new of.r0(y5Var, file, i10, z11, document, z12);
                    d = r0Var;
                    dispatchQueue.postRunnable(r0Var);
                    return;
                }
                Drawable k12 = k1(y5Var, file, i10, z11, document, z12);
                N();
                if (!b) {
                    i(k12);
                    h(k12);
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetNewWallpapper, new Object[0]);
                return;
            }
            f11 = k10.p;
        }
        f10 = f11 * 100.0f;
        int i102 = (int) f10;
        if (!z10) {
        }
    }

    public static void k() {
        Paint paint = k0;
        if (paint == null) {
            return;
        }
        paint.setColor(w0(null, d7, false));
        m0.setColor(w0(null, K6, false));
        int i10 = 0;
        while (true) {
            Drawable[] drawableArr = r0;
            int length = drawableArr.length;
            int i11 = J7;
            if (i10 >= length) {
                mi0 mi0Var = u1;
                mi0Var.W = true;
                int i12 = M7;
                mi0Var.O(w0(null, i12, true), "Arrow1");
                u1.O(w0(null, i12, true), "Arrow2");
                u1.O(w0(null, i11, true), "Box2");
                u1.O(w0(null, i11, true), "Box1");
                u1.m();
                C1 = false;
                u1.H(true);
                mi0 mi0Var2 = x1;
                mi0Var2.W = true;
                int i13 = e9;
                mi0Var2.O(w0(null, i13, true), "Arrow");
                x1.O(w0(null, i13, true), "Line");
                x1.m();
                mi0 mi0Var3 = y1;
                mi0Var3.W = true;
                mi0Var3.O(w0(null, i13, true), "Arrow");
                y1.O(w0(null, i13, true), "Line");
                y1.m();
                mi0 mi0Var4 = z1;
                mi0Var4.W = true;
                int i14 = c9;
                mi0Var4.O(w0(null, i14, true), "Line 1");
                z1.O(w0(null, i14, true), "Line 2");
                z1.O(w0(null, i14, true), "Line 3");
                z1.O(w0(null, i13, true), "Cup Red");
                z1.O(w0(null, i13, true), "Box");
                z1.m();
                B1 = false;
                mi0 mi0Var5 = v1;
                mi0Var5.W = true;
                mi0Var5.O(w0(null, i14, true), "Arrow");
                v1.O(w0(null, i13, true), "Box2");
                v1.O(w0(null, i13, true), "Box1");
                v1.m();
                A1 = false;
                mi0 mi0Var6 = w1;
                mi0Var6.W = true;
                mi0Var6.O(w0(null, i13, true), "Arrow1");
                w1.O(w0(null, d9, true), "Arrow2");
                w1.O(w0(null, i13, true), "Box2");
                w1.O(w0(null, i13, true), "Box1");
                w1.m();
                int w02 = w0(null, G6, false);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                v3 = new PorterDuffColorFilter(w02, mode);
                w3 = new PorterDuffColorFilter(w0(null, fc, false), mode);
                zf.a1.d().b();
                return;
            }
            x1(i11, drawableArr[i10]);
            i10++;
        }
    }

    public static e6 k0(File file, String str, TLRPC.TL_theme tL_theme) {
        String[] split;
        try {
            e6 e6Var = new e6();
            e6Var.a = str;
            e6Var.B = tL_theme;
            e6Var.b = file.getAbsolutePath();
            e6Var.A = UserConfig.selectedAccount;
            String[] strArr = new String[1];
            G(Q0(new File(e6Var.b), null, strArr), e6Var);
            if (TextUtils.isEmpty(strArr[0])) {
                h0 = null;
                return e6Var;
            }
            String str2 = strArr[0];
            e6Var.c = new File(ApplicationLoader.getFilesDirFixed(), Utilities.MD5(str2) + ".wp").getAbsolutePath();
            try {
                Uri parse = Uri.parse(str2);
                e6Var.e = parse.getQueryParameter("slug");
                String queryParameter = parse.getQueryParameter("mode");
                if (queryParameter != null && (split = queryParameter.toLowerCase().split(" ")) != null && split.length > 0) {
                    for (int i10 = 0; i10 < split.length; i10++) {
                        if ("blur".equals(split[i10])) {
                            e6Var.h = true;
                        } else if ("motion".equals(split[i10])) {
                            e6Var.n = true;
                        }
                    }
                }
                String queryParameter2 = parse.getQueryParameter("intensity");
                if (!TextUtils.isEmpty(queryParameter2)) {
                    try {
                        String queryParameter3 = parse.getQueryParameter("bg_color");
                        if (!TextUtils.isEmpty(queryParameter3)) {
                            e6Var.r = Integer.parseInt(queryParameter3.substring(0, 6), 16) | (-16777216);
                            if (queryParameter3.length() >= 13 && AndroidUtilities.isValidWallChar(queryParameter3.charAt(6))) {
                                e6Var.s = Integer.parseInt(queryParameter3.substring(7, 13), 16) | (-16777216);
                            }
                            if (queryParameter3.length() >= 20 && AndroidUtilities.isValidWallChar(queryParameter3.charAt(13))) {
                                e6Var.v = Integer.parseInt(queryParameter3.substring(14, 20), 16) | (-16777216);
                            }
                            if (queryParameter3.length() == 27 && AndroidUtilities.isValidWallChar(queryParameter3.charAt(20))) {
                                e6Var.w = Integer.parseInt(queryParameter3.substring(21), 16) | (-16777216);
                            }
                        }
                    } catch (Exception unused) {
                    }
                    try {
                        String queryParameter4 = parse.getQueryParameter("rotation");
                        if (!TextUtils.isEmpty(queryParameter4)) {
                            e6Var.x = Utilities.parseInt((CharSequence) queryParameter4).intValue();
                        }
                    } catch (Exception unused2) {
                    }
                    if (!TextUtils.isEmpty(queryParameter2)) {
                        e6Var.y = Utilities.parseInt((CharSequence) queryParameter2).intValue();
                    }
                    if (e6Var.y == 0) {
                        e6Var.y = 50;
                    }
                }
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
            return e6Var;
        } catch (Exception e10) {
            FileLog.e(e10);
            return null;
        }
    }

    public static Drawable k1(y5 y5Var, File file, int i10, boolean z10, TLRPC.Document document, boolean z11) {
        b3.b I10 = I(I, y5Var, rl, file, h0, g0, i10, S, z11, O, P, z10, document, false);
        Boolean bool = (Boolean) I10.c;
        i0 = bool != null ? bool.booleanValue() : i0;
        Boolean bool2 = (Boolean) I10.d;
        j0 = bool2 != null ? bool2.booleanValue() : j0;
        Boolean bool3 = (Boolean) I10.e;
        W = bool3 != null ? bool3.booleanValue() : W;
        Drawable drawable = (Drawable) I10.a;
        e0 = drawable != null ? drawable : e0;
        int[] calcDrawableColor = AndroidUtilities.calcDrawableColor(drawable);
        int i11 = calcDrawableColor[0];
        c0 = i11;
        X = i11;
        int i12 = calcDrawableColor[1];
        d0 = i12;
        b0 = i12;
        Drawable drawable2 = e0;
        if (drawable2 != null) {
            i(drawable2);
        }
        return drawable;
    }

    public static void l(boolean z10) {
        e6 e6Var;
        if (M != null) {
            return;
        }
        if (z10) {
            e6 e6Var2 = I;
            e6 e6Var3 = J;
            if (e6Var2 != e6Var3) {
                if (e6Var2 == null || !(e6Var3 == null || e6Var2.q() == J.q())) {
                    R = true;
                    i = SystemClock.elapsedRealtime();
                    Q = true;
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, J, Boolean.TRUE, null, -1);
                    Q = false;
                    return;
                }
                return;
            }
            return;
        }
        e6 e6Var4 = K;
        if (e6Var4 != null && e6Var4.q() && o != 0 && (e6Var = L) != null) {
            e6Var4 = e6Var;
        }
        e6 e6Var5 = I;
        if (e6Var5 != e6Var4) {
            if (e6Var5 == null || !(e6Var4 == null || e6Var5.q() == e6Var4.q())) {
                R = false;
                i = SystemClock.elapsedRealtime();
                Q = true;
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, e6Var4, Boolean.TRUE, null, -1);
                Q = false;
            }
        }
    }

    public static Paint l0(int i10) {
        Paint paint = Hl;
        if (paint.getColor() != i10) {
            paint.setColor(i10);
        }
        return paint;
    }

    public static int l1(float f10, int i10) {
        return f10 == 1.0f ? i10 : i0.a.k(i10, g7.n.b((int) (Color.alpha(i10) * f10), 0, 255));
    }

    public static void m(Paint paint) {
        paint.setShadowLayer(AndroidUtilities.dpf2(1.0f), 0.0f, AndroidUtilities.dpf2(0.33f), a);
    }

    public static e6 m0() {
        return I;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00d1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d5 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m1() {
        Sensor sensor;
        m5 m5Var;
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
                            q1();
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
            if (f == null) {
                SensorManager sensorManager = (SensorManager) ApplicationLoader.applicationContext.getSystemService("sensor");
                e = sensorManager;
                f = sensorManager.getDefaultSensor(5);
            }
            if (!g && (sensor = f) != null && (m5Var = Dl) != null) {
                e.registerListener(m5Var, sensor, 500000);
                g = true;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("light sensor registered");
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
            int i15 = ApplicationLoader.applicationContext.getResources().getConfiguration().uiMode & 48;
            if (i15 != 0 && i15 != 16) {
                if (i15 != 32) {
                    return 0;
                }
            }
        }
        if (i12 == 0) {
        }
    }

    public static void n() {
        if (B0 == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            int i11 = p9;
            int i12 = g9;
            int i13 = Z8;
            int i14 = X8;
            if (i10 >= 2) {
                D0.setColor(w0(null, i14, false));
                E0.setColor(w0(null, i13, false));
                TextPaint textPaint = G0;
                int w02 = w0(null, m9, false);
                textPaint.linkColor = w02;
                textPaint.setColor(w02);
                u0.setColor(w0(null, t9, false));
                v0.setColor(w0(null, s9, false));
                I0.setColor(w0(null, q9, false));
                J0.setColor(w0(null, r9, false));
                TextPaint textPaint2 = K0;
                int i15 = il;
                textPaint2.setColor(w0(null, i15, false));
                TextPaint textPaint3 = L0;
                int i16 = W8;
                textPaint3.setColor(w0(null, i16, false));
                M0.setColor(w0(null, i16, false));
                TextPaint textPaint4 = N0;
                int i17 = f9;
                textPaint4.setColor(w0(null, i17, false));
                O0.setColor(w0(null, i17, false));
                Paint paint = w0;
                int i18 = U8;
                paint.setColor(w0(null, i18, false));
                Paint paint2 = y0;
                int i19 = V8;
                paint2.setColor(w0(null, i19, false));
                z0.setColor(w0(null, i11, false));
                x0.setColor(w0(null, x9, false));
                P0.setColor(w0(null, p6, false));
                Q0.setColor(w0(null, A6, false));
                x1(a9, a1);
                Drawable drawable = b1;
                int i20 = b9;
                x1(i20, drawable);
                x1(u9, T0);
                x1(G6, S0);
                Drawable drawable2 = V0;
                int i21 = v9;
                x1(i21, drawable2);
                x1(i21, W0);
                x1(w9, X0);
                x1(y9, Y0);
                x1(i20, j1);
                x1(i20, k1);
                x1(i15, l1);
                x1(i20, Z0);
                Drawable drawable3 = c1;
                int i22 = B9;
                x1(i22, drawable3);
                x1(i22, d1);
                x1(i22, e1);
                x1(i18, m1);
                x1(Z5, n1);
                x1(zj, o1);
                x1(i19, p1);
                x1(i19, q1);
                x1(i19, r1);
                x1(i12, t1);
                x1(z9, f1);
                x1(A9, i1);
                x1(A8, s1);
                il0 il0Var = g1;
                int i23 = j9;
                x1(i23, il0Var);
                x1(i23, h1);
                return;
            }
            B0[i10].setColor(w0(null, i14, false));
            C0[i10].setColor(w0(null, i13, false));
            TextPaint textPaint5 = F0[i10];
            int w03 = w0(null, i12, false);
            textPaint5.linkColor = w03;
            textPaint5.setColor(w03);
            H0[i10].setColor(w0(null, i11, false));
            i10++;
        }
    }

    public static ColorFilter n0(b6 b6Var) {
        return b6Var != null ? b6Var.H() : v3;
    }

    public static void n1(boolean z10, boolean z11) {
        rl = ql.clone();
        tl = true;
        d6 k10 = I.k(false);
        if (k10 != null) {
            tl = k10.c(ql, rl);
        }
        g(ql, rl, I.q());
        f(ql, rl, I.q());
        if (!z11) {
            o1(!(LaunchActivity.R() instanceof qn));
        }
        k();
        n();
        p();
        j(false, z10);
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.w3(3, !O));
    }

    public static void o() {
        e6 e6Var;
        e6 e6Var2 = M;
        if (e6Var2 == null) {
            return;
        }
        O = false;
        if (R && (e6Var = J) != null) {
            t(e6Var, true, true);
        } else if (!P) {
            t(e6Var2, true, false);
        }
        P = false;
        M = null;
        E(false);
    }

    public static d8 o0(MessageObject messageObject) {
        HashMap hashMap = e5;
        if (hashMap == null || messageObject == null) {
            return null;
        }
        return (d8) hashMap.get(messageObject);
    }

    public static void o1(boolean z10) {
        i9 i9Var = V;
        if (i9Var != null) {
            i9Var.dispose();
            V = null;
        }
        Drawable drawable = e0;
        if (drawable instanceof jb0) {
            S = ((jb0) drawable).i;
        } else {
            S = 0;
        }
        e0 = null;
        f0 = null;
        j1(z10);
    }

    public static void p() {
        if (Q1 == null) {
            return;
        }
        P1.setColor(w0(null, G6, false));
        P1.linkColor = w0(null, J6, false);
        x1(zh, Q1);
        x1(Ah, R1);
    }

    public static File p0(String str) {
        long j10;
        File file = new File(ApplicationLoader.getFilesDirFixed(), str);
        try {
            InputStream open = ApplicationLoader.applicationContext.getAssets().open(str);
            j10 = open.available();
            open.close();
        } catch (Exception e10) {
            FileLog.e(e10);
            j10 = 0;
        }
        if (!file.exists() || (j10 != 0 && file.length() != j10)) {
            try {
                InputStream open2 = ApplicationLoader.applicationContext.getAssets().open(str);
                try {
                    AndroidUtilities.copyFile(open2, file);
                    if (open2 != null) {
                        open2.close();
                    }
                } finally {
                }
            } catch (Exception e11) {
                FileLog.e(e11);
            }
        }
        return file;
    }

    public static void p1(boolean z10) {
        if (!z10) {
            I.v(null);
        } else {
            P = false;
            o1(true);
        }
    }

    public static void q(float f10, float f11, int i10, int i11) {
        r(Y, Z, a0, i10, i11, f10, f11);
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

    public static void q1() {
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
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
        e6 e6Var = J;
        if (e6Var != null) {
            edit.putString("nighttheme", e6Var.m());
        } else {
            edit.remove("nighttheme");
        }
        edit.commit();
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
        Utilities.themeQueue.postRunnable(new p(countDownLatch, 16));
        try {
            countDownLatch.await();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        return s0();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(24:0|1|(1:3)(1:155)|(1:5)(1:154)|(1:8)|9|(1:153)(1:13)|(1:15)(1:152)|16|(5:(1:19)(1:42)|(1:21)(1:41)|(1:23)(1:40)|(1:25)(1:39)|(4:28|(2:30|(1:32))|(1:38)(1:36)|37))|43|(12:45|(2:46|(3:48|(2:51|52)|53)(0))|63|65|66|(1:72)|73|(2:75|(2:96|97))(2:101|(3:103|(1:105)|(1:108)))|(6:78|(1:80)|81|(1:83)|(1:85)|86)|88|89|(2:91|92)(1:94))(2:135|(4:138|(2:141|142)|143|136))|62|63|65|66|(3:68|70|72)|73|(0)(0)|(0)|88|89|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x010d, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x010e, code lost:
    
        r7 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0208, code lost:
    
        org.telegram.messenger.FileLog.e(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x020b, code lost:
    
        if (r7 != null) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x020d, code lost:
    
        r7.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0221, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0222, code lost:
    
        r1 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0223, code lost:
    
        if (r7 == null) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0225, code lost:
    
        r7.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:?, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0229, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x022a, code lost:
    
        org.telegram.messenger.FileLog.e(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x022d, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:?, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0108, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0109, code lost:
    
        r1 = r0;
        r7 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x01fd, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x01fe, code lost:
    
        org.telegram.messenger.FileLog.e(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0206, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0207, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0202, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0203, code lost:
    
        r1 = r0;
        r7 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0178 A[Catch: all -> 0x0108, Exception -> 0x010d, TryCatch #7 {Exception -> 0x010d, all -> 0x0108, blocks: (B:66:0x00f2, B:68:0x00f8, B:70:0x00fc, B:72:0x0102, B:73:0x0111, B:75:0x0124, B:78:0x01a4, B:80:0x01b0, B:81:0x01d0, B:83:0x01d6, B:85:0x01da, B:86:0x01e3, B:100:0x0174, B:101:0x0178, B:103:0x017c, B:105:0x0185, B:108:0x01a0), top: B:65:0x00f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0225 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:126:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0124 A[Catch: all -> 0x0108, Exception -> 0x010d, TRY_LEAVE, TryCatch #7 {Exception -> 0x010d, all -> 0x0108, blocks: (B:66:0x00f2, B:68:0x00f8, B:70:0x00fc, B:72:0x0102, B:73:0x0111, B:75:0x0124, B:78:0x01a4, B:80:0x01b0, B:81:0x01d0, B:83:0x01d6, B:85:0x01da, B:86:0x01e3, B:100:0x0174, B:101:0x0178, B:103:0x017c, B:105:0x0185, B:108:0x01a0), top: B:65:0x00f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a4 A[Catch: all -> 0x0108, Exception -> 0x010d, TryCatch #7 {Exception -> 0x010d, all -> 0x0108, blocks: (B:66:0x00f2, B:68:0x00f8, B:70:0x00fc, B:72:0x0102, B:73:0x0111, B:75:0x0124, B:78:0x01a4, B:80:0x01b0, B:81:0x01d0, B:83:0x01d6, B:85:0x01da, B:86:0x01e3, B:100:0x0174, B:101:0x0178, B:103:0x017c, B:105:0x0185, B:108:0x01a0), top: B:65:0x00f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:122:0x01fe -> B:84:0x0210). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void r1(e6 e6Var, boolean z10, boolean z11, boolean z12) {
        y5 y5Var = e6Var.e0;
        String Y02 = y5Var != null ? Y0(y5Var) : h0;
        Drawable drawable = z11 ? e0 : f0;
        if (z11 && drawable != null) {
            f0 = e0;
        }
        d6 k10 = I.k(false);
        boolean z13 = I.O && k10.a == n;
        SparseIntArray sparseIntArray = z13 ? null : rl;
        StringBuilder sb2 = new StringBuilder();
        if (!z13) {
            int i10 = k10 != null ? k10.e : 0;
            int i11 = k10 != null ? k10.f : 0;
            int i12 = k10 != null ? k10.g : 0;
            int i13 = k10 != null ? k10.h : 0;
            if (i10 != 0 && i11 != 0) {
                sparseIntArray.put(Aa, i10);
                sparseIntArray.put(Da, i11);
                if (i12 != 0) {
                    sparseIntArray.put(Ea, i12);
                    if (i13 != 0) {
                        sparseIntArray.put(Fa, i13);
                    }
                }
                sparseIntArray.put(ac, (k10 == null || !k10.i) ? 0 : 1);
            }
        }
        int i14 = Qd;
        int i15 = Pd;
        int i16 = Od;
        int i17 = Nd;
        if (z13) {
            int i18 = 0;
            while (true) {
                int[] iArr = nl;
                if (i18 < iArr.length) {
                    int i19 = iArr[i18];
                    if ((!(drawable instanceof BitmapDrawable) && Y02 == null) || (i17 != i18 && i16 != i18 && i15 != i18 && i14 != i18)) {
                        sb2.append(e5.i(i18));
                        sb2.append("=");
                        sb2.append(i19);
                        sb2.append("\n");
                    }
                    i18++;
                }
            }
            FileOutputStream fileOutputStream = new FileOutputStream(e6Var.b);
            if (sb2.length() == 0 && !(drawable instanceof BitmapDrawable) && TextUtils.isEmpty(Y02)) {
                sb2.append(' ');
            }
            fileOutputStream.write(AndroidUtilities.getStringBytes(sb2.toString()));
            if (TextUtils.isEmpty(Y02)) {
                fileOutputStream.write(AndroidUtilities.getStringBytes("WLS=" + Y02 + "\n"));
                if (z11) {
                    try {
                        Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                        FileOutputStream fileOutputStream2 = new FileOutputStream(new File(ApplicationLoader.getFilesDirFixed(), Utilities.MD5(Y02) + ".wp"));
                        bitmap.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream2);
                        fileOutputStream2.close();
                    } catch (Throwable th2) {
                        FileLog.e(th2);
                    }
                }
            } else if (drawable instanceof BitmapDrawable) {
                Bitmap bitmap2 = ((BitmapDrawable) drawable).getBitmap();
                if (bitmap2 != null) {
                    fileOutputStream.write(new byte[]{87, 80, 83, 10});
                    bitmap2.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream);
                    fileOutputStream.write(new byte[]{10, 87, 80, 69, 10});
                }
                if (z10 && !z12) {
                    e0 = drawable;
                }
            }
            if (!z12) {
                HashMap hashMap = H;
                if (hashMap.get(e6Var.m()) == null) {
                    ArrayList arrayList = F;
                    arrayList.add(e6Var);
                    hashMap.put(e6Var.m(), e6Var);
                    G.add(e6Var);
                    s1(true, false);
                    Collections.sort(arrayList, new j9.a(11));
                }
                I = e6Var;
                if (e6Var != J) {
                    K = e6Var;
                }
                if (z13) {
                    ql.clear();
                    n1(false, false);
                }
                SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                edit.putString("theme", K.m());
                edit.apply();
            }
            fileOutputStream.close();
            if (z10) {
                MessagesController.getInstance(e6Var.A).saveThemeToServer(e6Var, e6Var.k(false));
                return;
            }
            return;
        }
        for (int i20 = 0; i20 < sparseIntArray.size(); i20++) {
            int keyAt = sparseIntArray.keyAt(i20);
            int valueAt = sparseIntArray.valueAt(i20);
            if ((!(drawable instanceof BitmapDrawable) && Y02 == null) || (i17 != keyAt && i16 != keyAt && i15 != keyAt && i14 != keyAt)) {
                sb2.append(e5.i(keyAt));
                sb2.append("=");
                sb2.append(valueAt);
                sb2.append("\n");
            }
        }
        FileOutputStream fileOutputStream3 = new FileOutputStream(e6Var.b);
        if (sb2.length() == 0) {
            sb2.append(' ');
        }
        fileOutputStream3.write(AndroidUtilities.getStringBytes(sb2.toString()));
        if (TextUtils.isEmpty(Y02)) {
        }
        if (!z12) {
        }
        fileOutputStream3.close();
        if (z10) {
        }
    }

    public static void s(View view, View view2, b6 b6Var) {
        if (view == null || view2 == null) {
            return;
        }
        int[] iArr = El;
        view.getLocationOnScreen(iArr);
        int i10 = iArr[0];
        int i11 = iArr[1];
        view2.getLocationOnScreen(iArr);
        if (view2 instanceof dc1) {
            Bitmap bitmap = Y;
            if (bitmap != null) {
                float width = bitmap.getWidth();
                i10 = (int) ((((view2.getMeasuredWidth() - (Math.max(view2.getMeasuredWidth() / width, view2.getMeasuredHeight() / Y.getHeight()) * width)) / 2.0f) - ((dc1) view2).E) + i10);
            } else {
                i10 = (int) (i10 + (-((dc1) view2).E));
            }
            i11 = (int) (i11 + (-((dc1) view2).F));
        }
        if (b6Var != null) {
            b6Var.o(i10, i11 - iArr[1], view2.getMeasuredWidth(), view2.getMeasuredHeight());
        } else {
            q(i10, i11 - iArr[1], view2.getMeasuredWidth(), view2.getMeasuredHeight());
        }
    }

    public static Drawable s0() {
        Drawable drawable = f0;
        return drawable != null ? drawable : e0;
    }

    public static void s1(boolean z10, boolean z11) {
        boolean z12;
        ArrayList arrayList;
        JSONObject jSONObject;
        int i10 = 0;
        SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
        if (z10) {
            JSONArray jSONArray = new JSONArray();
            int i11 = 0;
            while (true) {
                ArrayList arrayList2 = G;
                if (i11 >= arrayList2.size()) {
                    break;
                }
                e6 e6Var = (e6) arrayList2.get(i11);
                e6Var.getClass();
                try {
                    jSONObject = new JSONObject();
                    jSONObject.put("name", e6Var.a);
                    jSONObject.put("path", e6Var.b);
                    jSONObject.put("account", e6Var.A);
                    TLRPC.TL_theme tL_theme = e6Var.B;
                    if (tL_theme != null) {
                        SerializedData serializedData = new SerializedData(tL_theme.getObjectSize());
                        e6Var.B.serializeToStream(serializedData);
                        jSONObject.put("info", Utilities.bytesToHex(serializedData.toByteArray()));
                    }
                    jSONObject.put("loaded", e6Var.C);
                } catch (Exception e10) {
                    FileLog.e(e10);
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
                e6 e6Var2 = (e6) H.get(i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? "Night" : "Day" : "Arctic Blue" : "Dark Blue" : "Blue");
                if (e6Var2 == null || (arrayList = e6Var2.X) == null || arrayList.isEmpty()) {
                    z12 = z11;
                } else {
                    z12 = z11;
                    t1(e6Var2, true, false, false, false, z12);
                }
                i10++;
                z11 = z12;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0042, code lost:
    
        if (r12 == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0044, code lost:
    
        r3 = org.telegram.messenger.MessagesController.getGlobalMainSettings().edit();
        r3.putString("theme", r11.m());
        r3.apply();
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01d2 A[Catch: Exception -> 0x002e, TryCatch #2 {Exception -> 0x002e, blocks: (B:7:0x000e, B:10:0x0016, B:15:0x001f, B:16:0x0031, B:18:0x01c1, B:20:0x01c5, B:24:0x01d2, B:26:0x01e6, B:41:0x0044, B:42:0x0056, B:44:0x005c, B:45:0x0070, B:47:0x0083, B:55:0x00bf, B:106:0x01a9, B:113:0x01bb, B:115:0x0063, B:57:0x00c1, B:59:0x00d7, B:61:0x00e3, B:64:0x00e7, B:66:0x00ea, B:68:0x00f4, B:70:0x0106, B:71:0x00fa, B:73:0x0104, B:77:0x0109, B:79:0x011a, B:81:0x0126, B:83:0x013e, B:85:0x0148, B:86:0x0154, B:88:0x015c, B:90:0x0166, B:91:0x0173, B:93:0x017b, B:95:0x0185, B:98:0x0190, B:100:0x019c), top: B:6:0x000e, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void t(e6 e6Var, boolean z10, boolean z11) {
        int i10;
        String[] split;
        if (e6Var == null) {
            return;
        }
        ThemeEditorView themeEditorView = ThemeEditorView.n;
        if (themeEditorView != null) {
            themeEditorView.a();
        }
        try {
            i10 = 21;
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        if (e6Var.b == null && e6Var.d == null) {
            if (!z11 && z10) {
                SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                edit.remove("theme");
                edit.commit();
            }
            ql.clear();
            g0 = 0;
            h0 = null;
            e0 = null;
            f0 = null;
            if (!z11 && M == null) {
                K = e6Var;
                if (I != J) {
                    T = 2000;
                    U = SystemClock.elapsedRealtime();
                    AndroidUtilities.runOnUIThread(new bg.d2(i10), 2100L);
                }
            }
            I = e6Var;
            n1(false, false);
            float f10 = org.telegram.ui.i5.c;
            org.telegram.ui.i5.e = 1.0f - (Color.alpha(w0(null, xf, true)) / 255.0f);
            if (M == null || !z10 || Q) {
                return;
            }
            MessagesController.getInstance(e6Var.A).saveTheme(e6Var, e6Var.k(false), z11, false);
            return;
        }
        String[] strArr = new String[1];
        String str = e6Var.d;
        if (str != null) {
            ql = Q0(null, str, null);
        } else {
            ql = Q0(new File(e6Var.b), null, strArr);
        }
        g0 = ql.get(g5, -1);
        if (TextUtils.isEmpty(strArr[0])) {
            try {
                if (e6Var.c != null) {
                    new File(e6Var.c).delete();
                }
            } catch (Exception unused) {
            }
            e6Var.c = null;
            h0 = null;
        } else {
            h0 = strArr[0];
            String absolutePath = new File(ApplicationLoader.getFilesDirFixed(), Utilities.MD5(h0) + ".wp").getAbsolutePath();
            try {
                String str2 = e6Var.c;
                if (str2 != null && !str2.equals(absolutePath)) {
                    new File(e6Var.c).delete();
                }
            } catch (Exception unused2) {
            }
            e6Var.c = absolutePath;
            try {
                Uri parse = Uri.parse(h0);
                e6Var.e = parse.getQueryParameter("slug");
                String queryParameter = parse.getQueryParameter("mode");
                if (queryParameter != null && (split = queryParameter.toLowerCase().split(" ")) != null && split.length > 0) {
                    for (int i11 = 0; i11 < split.length; i11++) {
                        if ("blur".equals(split[i11])) {
                            e6Var.h = true;
                        } else if ("motion".equals(split[i11])) {
                            e6Var.n = true;
                        }
                    }
                }
                Utilities.parseInt((CharSequence) parse.getQueryParameter("intensity")).getClass();
                e6Var.x = 45;
                try {
                    String queryParameter2 = parse.getQueryParameter("bg_color");
                    if (!TextUtils.isEmpty(queryParameter2)) {
                        e6Var.r = Integer.parseInt(queryParameter2.substring(0, 6), 16) | (-16777216);
                        if (queryParameter2.length() >= 13 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(6))) {
                            e6Var.s = Integer.parseInt(queryParameter2.substring(7, 13), 16) | (-16777216);
                        }
                        if (queryParameter2.length() >= 20 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(13))) {
                            e6Var.v = Integer.parseInt(queryParameter2.substring(14, 20), 16) | (-16777216);
                        }
                        if (queryParameter2.length() == 27 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(20))) {
                            e6Var.w = Integer.parseInt(queryParameter2.substring(21), 16) | (-16777216);
                        }
                    }
                } catch (Exception unused3) {
                }
                try {
                    String queryParameter3 = parse.getQueryParameter("rotation");
                    if (!TextUtils.isEmpty(queryParameter3)) {
                        e6Var.x = Utilities.parseInt((CharSequence) queryParameter3).intValue();
                    }
                } catch (Exception unused4) {
                }
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        if (!z11) {
            K = e6Var;
            if (I != J) {
            }
        }
        I = e6Var;
        n1(false, false);
        float f102 = org.telegram.ui.i5.c;
        org.telegram.ui.i5.e = 1.0f - (Color.alpha(w0(null, xf, true)) / 255.0f);
        if (M == null) {
        }
    }

    public static tv0 t0(int i10) {
        if (i10 < 0 || i10 > 5) {
            return null;
        }
        tv0[] tv0VarArr = u3;
        tv0 tv0Var = tv0VarArr[i10];
        if (tv0Var != null) {
            return tv0Var;
        }
        if (i10 == 0) {
            tv0VarArr[0] = new j41(true);
        } else if (i10 == 1) {
            tv0VarArr[1] = new hp(true);
        } else if (i10 == 2) {
            tv0VarArr[2] = new go0(true);
        } else if (i10 == 3) {
            tv0VarArr[3] = new rf0(null, true);
        } else if (i10 == 4) {
            tv0VarArr[4] = new gl0(true);
        } else if (i10 == 5) {
            tv0VarArr[5] = new hp();
        }
        tv0 tv0Var2 = tv0VarArr[i10];
        tv0Var2.d();
        tv0Var2.b(w0(null, p9, false));
        return tv0Var2;
    }

    public static void t1(e6 e6Var, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        if (z10) {
            SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
            if (!z12) {
                int size = e6Var.X.size();
                int max = Math.max(0, size - e6Var.S);
                SerializedData serializedData = new SerializedData(((max * 16) + 2) * 4);
                serializedData.writeInt32(9);
                serializedData.writeInt32(max);
                for (int i10 = 0; i10 < size; i10++) {
                    d6 d6Var = (d6) e6Var.X.get(i10);
                    int i11 = d6Var.a;
                    if (i11 >= 100) {
                        serializedData.writeInt32(i11);
                        serializedData.writeInt32(d6Var.c);
                        serializedData.writeInt32(d6Var.d);
                        serializedData.writeInt32(d6Var.e);
                        serializedData.writeInt32(d6Var.f);
                        serializedData.writeInt32(d6Var.g);
                        serializedData.writeInt32(d6Var.h);
                        serializedData.writeBool(d6Var.i);
                        serializedData.writeInt64(d6Var.j);
                        serializedData.writeInt64(d6Var.k);
                        serializedData.writeInt64(d6Var.l);
                        serializedData.writeInt64(d6Var.m);
                        serializedData.writeInt32(d6Var.n);
                        serializedData.writeInt64(0L);
                        serializedData.writeDouble(d6Var.p);
                        serializedData.writeBool(d6Var.q);
                        serializedData.writeString(d6Var.o);
                        serializedData.writeBool(d6Var.r != null);
                        if (d6Var.r != null) {
                            serializedData.writeInt32(d6Var.t);
                            d6Var.r.serializeToStream(serializedData);
                        }
                    }
                }
                edit.putString("accents_" + e6Var.d, Base64.encodeToString(serializedData.toByteArray(), 3));
                if (!z14) {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeAccentListUpdated, new Object[0]);
                }
                if (z13) {
                    MessagesController.getInstance(UserConfig.selectedAccount).saveThemeToServer(e6Var, e6Var.k(false));
                }
            }
            edit.putInt("accent_current_" + e6Var.d, e6Var.U);
            edit.commit();
        } else {
            if (e6Var.V != -1) {
                if (z11) {
                    d6 d6Var2 = (d6) e6Var.W.get(e6Var.U);
                    e6Var.W.remove(d6Var2.a);
                    e6Var.X.remove(d6Var2);
                    TLRPC.TL_theme tL_theme = d6Var2.r;
                    if (tL_theme != null) {
                        e6Var.Y.remove(tL_theme.id);
                    }
                }
                e6Var.U = e6Var.V;
                d6 k10 = e6Var.k(false);
                if (k10 != null) {
                    e6Var.e0 = k10.y;
                } else {
                    e6Var.e0 = null;
                }
            }
            if (I == e6Var) {
                n1(false, false);
            }
        }
        e6Var.V = -1;
    }

    public static e6 u(File file, String str, TLRPC.TL_theme tL_theme, boolean z10) {
        File file2;
        String str2;
        try {
            if (!str.toLowerCase().endsWith(".attheme")) {
                str = str.concat(".attheme");
            }
            if (z10) {
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.goingToPreviewTheme, new Object[0]);
                e6 e6Var = new e6();
                e6Var.a = str;
                e6Var.B = tL_theme;
                e6Var.b = file.getAbsolutePath();
                e6Var.A = UserConfig.selectedAccount;
                M = A0();
                O = true;
                P = false;
                t(e6Var, false, false);
                return e6Var;
            }
            if (tL_theme != null) {
                str2 = "remote" + tL_theme.id;
                file2 = new File(ApplicationLoader.getFilesDirFixed(), str2 + ".attheme");
            } else {
                file2 = new File(ApplicationLoader.getFilesDirFixed(), str);
                str2 = str;
            }
            if (!AndroidUtilities.copyFile(file, file2)) {
                o();
                return null;
            }
            M = null;
            O = false;
            P = false;
            HashMap hashMap = H;
            e6 e6Var2 = (e6) hashMap.get(str2);
            if (e6Var2 == null) {
                e6Var2 = new e6();
                e6Var2.a = str;
                e6Var2.A = UserConfig.selectedAccount;
                ArrayList arrayList = F;
                arrayList.add(e6Var2);
                G.add(e6Var2);
                Collections.sort(arrayList, new j9.a(11));
            } else {
                hashMap.remove(str2);
            }
            e6Var2.B = tL_theme;
            e6Var2.b = file2.getAbsolutePath();
            hashMap.put(e6Var2.m(), e6Var2);
            s1(true, false);
            t(e6Var2, true, false);
            return e6Var2;
        } catch (Exception e10) {
            FileLog.e(e10);
            return null;
        }
    }

    public static int u0(int i10) {
        return w0(null, i10, false);
    }

    public static void u1(int i10, int i11, boolean z10) {
        int i12 = s8;
        int i13 = a7;
        int i14 = Qd;
        int i15 = Pd;
        int i16 = Od;
        int i17 = Nd;
        if (i10 == i17 || i10 == i16 || i10 == i15 || i10 == i14 || i10 == d6 || i10 == i13 || i10 == i12 || i10 == M8) {
            i11 |= -16777216;
        }
        if (z10) {
            rl.delete(i10);
        } else {
            rl.put(i10, i11);
        }
        if (i10 == Hc) {
            h(e0);
            return;
        }
        if (i10 == lc || i10 == mc) {
            Drawable drawable = e0;
            if (drawable != null) {
                i(drawable);
                return;
            }
            return;
        }
        if (i10 == i17 || i10 == i16 || i10 == i15 || i10 == i14 || i10 == Rd) {
            o1(true);
            return;
        }
        if (i10 == i12) {
            if (Build.VERSION.SDK_INT >= 23) {
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
            }
        } else {
            if (i10 != i13 || Build.VERSION.SDK_INT < 26) {
                return;
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        }
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

    public static int v0(int i10, b6 b6Var) {
        return b6Var != null ? b6Var.N0(i10) : w0(null, i10, false);
    }

    public static void v1(Drawable drawable, int i10, boolean z10) {
        if (drawable instanceof fq) {
            Drawable drawable2 = z10 ? ((fq) drawable).b : ((fq) drawable).a;
            if (drawable2 instanceof ColorDrawable) {
                ((ColorDrawable) drawable2).setColor(i10);
            } else {
                drawable2.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
            }
        }
    }

    public static int w(int i10, boolean z10, boolean z11) {
        if (z10) {
            return l1(z11 ? 0.22f : 0.12f, -1);
        }
        int i11 = z11 ? -3813931 : -1972501;
        float[] M02 = M0(3);
        Color.colorToHSV(i10, M02);
        return M02[1] > 0.02f ? c(i11, i10) : i11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0085, code lost:
    
        if (r1.i == r8.i) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00d7, code lost:
    
        if (r1.i == r8.i) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x010f, code lost:
    
        if (r1.c == r8.c) goto L98;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int w0(boolean[] zArr, int i10, boolean z10) {
        int indexOfKey;
        SparseIntArray sparseIntArray;
        int indexOfKey2;
        if (!z10 && (sparseIntArray = sl) != null && (indexOfKey2 = sparseIntArray.indexOfKey(i10)) >= 0) {
            return sl.valueAt(indexOfKey2);
        }
        if (Z != null && (ic == i10 || jc == i10 || kc == i10 || Vc == i10 || Xc == i10 || bd == i10)) {
            return -1;
        }
        e6 e6Var = I;
        e6 e6Var2 = L;
        int i11 = mc;
        int i12 = lc;
        if (e6Var == e6Var2) {
            int i13 = za;
            int i14 = n;
            if (i10 < i13 || i10 >= Ga) {
                if (i10 < Ha || i10 >= Tb) {
                    if (Nd != i10 && Od != i10 && Pd != i10 && Qd != i10 && e6Var.O) {
                        if (e6Var.U != i14) {
                            d6 d6Var = (d6) e6Var.W.get(i14);
                            d6 d6Var2 = (d6) e6Var.W.get(e6Var.U);
                            if (d6Var2 != null) {
                                if (d6Var != null) {
                                }
                            }
                        }
                        return i10 == i12 ? X : i10 == i11 ? b0 : C0(i10);
                    }
                } else if (e6Var.O) {
                    if (e6Var.U != i14) {
                        d6 d6Var3 = (d6) e6Var.W.get(i14);
                        d6 d6Var4 = (d6) e6Var.W.get(e6Var.U);
                        if (d6Var3 != null) {
                            if (d6Var4 != null) {
                                if (d6Var3.d == d6Var4.d) {
                                    if (d6Var3.e == d6Var4.e) {
                                        if (d6Var3.f == d6Var4.f) {
                                            if (d6Var3.g == d6Var4.g) {
                                                if (d6Var3.h == d6Var4.h) {
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
            } else if (e6Var.O) {
                if (e6Var.U != i14) {
                    d6 d6Var5 = (d6) e6Var.W.get(i14);
                    d6 d6Var6 = (d6) e6Var.W.get(e6Var.U);
                    if (d6Var5 != null) {
                        if (d6Var6 != null) {
                            if (d6Var5.e == d6Var6.e) {
                                if (d6Var5.f == d6Var6.f) {
                                    if (d6Var5.g == d6Var6.g) {
                                        if (d6Var5.h == d6Var6.h) {
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
        int indexOfKey3 = rl.indexOfKey(i10);
        if (indexOfKey3 >= 0) {
            int valueAt = rl.valueAt(indexOfKey3);
            return (d6 == i10 || a7 == i10 || s8 == i10 || M8 == i10) ? valueAt | (-16777216) : valueAt;
        }
        int i15 = ol.get(i10, -1);
        if (i15 != -1 && (indexOfKey = rl.indexOfKey(i15)) >= 0) {
            return rl.valueAt(indexOfKey);
        }
        if (zArr != null) {
            zArr[0] = true;
        }
        return i10 == i12 ? X : i10 == i11 ? b0 : C0(i10);
    }

    public static void w1(int i10, Drawable drawable) {
        if (drawable == null) {
            return;
        }
        if (drawable instanceof tv0) {
            ((tv0) drawable).b(i10);
            return;
        }
        if (drawable instanceof qb0) {
            ((qb0) drawable).a(i10);
            return;
        }
        if (drawable instanceof ShapeDrawable) {
            ((ShapeDrawable) drawable).getPaint().setColor(i10);
        } else if (drawable instanceof il0) {
            ((il0) drawable).b(i10);
        } else {
            drawable.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
        }
    }

    public static int x(int i10, boolean z10, boolean z11, boolean z12) {
        if (z10) {
            return l1(z12 ? 0.62f : 0.18f, -1);
        }
        int i11 = z12 ? -6380376 : -2565928;
        float[] M02 = M0(3);
        Color.colorToHSV(i10, M02);
        return (!z11 || M02[1] <= 0.02f) ? i11 : c(i11, i10);
    }

    public static d8 x0() {
        if (d5 == null) {
            d5 = new d8();
        }
        return d5;
    }

    public static void x1(int i10, Drawable drawable) {
        w1(w0(null, i10, false), drawable);
    }

    public static int y(int i10, boolean z10, boolean z11) {
        if (z10 && z11) {
            return l1(0.07f, -1);
        }
        float[] M02 = M0(3);
        Color.colorToHSV(i10, M02);
        if (z10) {
            M02[2] = Math.min(1.0f, M02[2] + 0.07f);
            if (z11) {
                M02[1] = Math.min(1.0f, M02[1] + 0.02f);
            }
        } else {
            M02[2] = Math.max(0.0f, M02[2] - (z11 ? 0.06f : 0.03f));
            if (z11) {
                float f10 = M02[1];
                if (f10 > 0.02f) {
                    M02[1] = Math.min(1.0f, f10 + 0.02f);
                }
            }
        }
        return Color.HSVToColor(Color.alpha(i10), M02);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0056, code lost:
    
        if (r2 <= 31) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005c, code lost:
    
        org.telegram.ui.ActionBar.f6.s1 = org.telegram.messenger.ApplicationLoader.applicationContext.getResources().getDrawable(org.telegram.messenger.R.drawable.newyear);
        org.telegram.ui.ActionBar.f6.D1 = -org.telegram.messenger.AndroidUtilities.dp(3.0f);
        org.telegram.ui.ActionBar.f6.E1 = -org.telegram.messenger.AndroidUtilities.dp(-7.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005a, code lost:
    
        if (r2 == 1) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Drawable y0() {
        if (System.currentTimeMillis() - F1 >= 60000) {
            F1 = System.currentTimeMillis();
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(System.currentTimeMillis());
            int i10 = calendar.get(2);
            int i11 = calendar.get(5);
            calendar.get(12);
            int i12 = calendar.get(11);
            if (i10 == 0 && i11 == 1 && i12 <= 23) {
                G1 = true;
            } else {
                G1 = false;
            }
            if (s1 == null) {
                if (i10 == 11) {
                    if (i11 >= (BuildVars.DEBUG_PRIVATE_VERSION ? 29 : 31)) {
                    }
                }
                if (i10 == 0) {
                }
            }
        }
        return s1;
    }

    public static void y1(Drawable drawable, int i10, boolean z10) {
        if (drawable instanceof StateListDrawable) {
            try {
                Drawable L02 = z10 ? L0(0, drawable) : L0(1, drawable);
                if (L02 instanceof ShapeDrawable) {
                    ((ShapeDrawable) L02).getPaint().setColor(i10);
                } else {
                    L02.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static int z(int i10, boolean z10, boolean z11) {
        if (z10 && z11) {
            return l1(0.14f, -1);
        }
        float[] M02 = M0(3);
        Color.colorToHSV(i10, M02);
        if (z10) {
            M02[2] = Math.min(1.0f, M02[2] + 0.14f);
            if (z11) {
                M02[1] = Math.min(1.0f, M02[1] + 0.03f);
            }
        } else {
            M02[2] = Math.max(0.0f, M02[2] - (z11 ? 0.14f : 0.12f));
            if (z11) {
                float f10 = M02[1];
                if (f10 > 0.02f) {
                    M02[1] = Math.min(1.0f, f10 + 0.04f);
                }
            }
        }
        return Color.HSVToColor(Color.alpha(i10), M02);
    }

    public static String z0() {
        e6 e6Var = J;
        if (e6Var == null) {
            return "";
        }
        String n10 = e6Var.n();
        return n10.toLowerCase().endsWith(".attheme") ? n10.substring(0, n10.lastIndexOf(46)) : n10;
    }

    public static void z1(org.telegram.ui.Cells.z zVar, float f10, float f11, float f12, float f13) {
        if (e2.c.v(zVar)) {
            int numberOfLayers = zVar.getNumberOfLayers();
            for (int i10 = 0; i10 < numberOfLayers; i10++) {
                Drawable drawable = zVar.getDrawable(i10);
                if (drawable instanceof c6) {
                    c6 c6Var = (c6) drawable;
                    float[] fArr = c6Var.b;
                    float dp = AndroidUtilities.dp(f10);
                    fArr[1] = dp;
                    fArr[0] = dp;
                    float dp2 = AndroidUtilities.dp(f11);
                    fArr[3] = dp2;
                    fArr[2] = dp2;
                    float dp3 = AndroidUtilities.dp(f12);
                    fArr[5] = dp3;
                    fArr[4] = dp3;
                    float dp4 = AndroidUtilities.dp(f13);
                    fArr[7] = dp4;
                    fArr[6] = dp4;
                    c6Var.c = true;
                    c6Var.invalidateSelf();
                    return;
                }
            }
        }
    }
}
