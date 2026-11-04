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
import b8.be;
import b8.ke;
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
import org.telegram.messenger.Utilities;
import org.telegram.messenger.az;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.c9;
import org.telegram.messenger.h10;
import org.telegram.messenger.hc;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.kz;
import org.telegram.messenger.lc;
import org.telegram.messenger.li;
import org.telegram.messenger.time.SunDate;
import org.telegram.messenger.tq;
import org.telegram.messenger.w7;
import org.telegram.messenger.zi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.ThemeEditorView;
import org.telegram.ui.Components.a8;
import org.telegram.ui.Components.ap;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.d9;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.gc0;
import org.telegram.ui.Components.gn0;
import org.telegram.ui.Components.hk0;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.j00;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.k00;
import org.telegram.ui.Components.ke0;
import org.telegram.ui.Components.kk0;
import org.telegram.ui.Components.la0;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.nu0;
import org.telegram.ui.Components.p31;
import org.telegram.ui.Components.sa0;
import org.telegram.ui.Components.xp;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.b71;
import org.telegram.ui.wm;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class k6 {
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
    public static final int Al;
    public static int Am;
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
    public static final Paint Bm;
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
    public static final int Cl;
    public static final Paint Cm;
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
    public static final int Dl;
    public static final Paint Dm;
    public static TextPaint E0;
    public static int E1;
    public static TextPaint E2;
    public static sa0 E3;
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
    public static final int Fl;
    public static final Paint Fm;
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
    public static final int Gl;
    public static final Paint Gm;
    public static final HashMap H;
    public static TextPaint[] H0;
    public static ch0 H1;
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
    public static j6 I;
    public static TextPaint I0;
    public static ch0 I1;
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
    public static j6 J;
    public static TextPaint J0;
    public static ch0 J1;
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
    public static j6 K;
    public static TextPaint K0;
    public static ch0 K1;
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
    public static final j6 L;
    public static TextPaint L0;
    public static ch0 L1;
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
    public static j6 M;
    public static TextPaint M0;
    public static ch0 M1;
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
    public static ch0 N1;
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
    public static final int Nl;
    public static boolean O;
    public static TextPaint O0;
    public static ch0 O1;
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
    public static d9 V;
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
    public static final int Wl;
    public static int X;
    public static sa0 X0;
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
    public static final int Yl;
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
    public static final int Zl;
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
    public static final HashMap am;
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
    public static final HashMap bm;
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
    public static final HashMap cm;
    public static kg.q0 d;
    public static int d0;
    public static Drawable d1;
    public static Paint d2;
    public static TextPaint d3;
    public static Drawable d4;
    public static a8 d5;
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
    public static final int[] em;
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
    public static final SparseIntArray fm;
    public static boolean g;
    public static int g0;
    public static kk0 g1;
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
    public static final HashSet gm;
    public static String h0;
    public static kk0 h1;
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
    public static SparseIntArray hm;
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
    public static SparseIntArray im;
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
    public static final int jl;
    public static SparseIntArray jm;
    public static boolean k;
    public static Paint k0;
    public static Drawable k1;
    public static Paint k2;
    public static gi.k3 k3;
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
    public static boolean km;
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
    public static final int ll;
    public static final ThreadLocal lm;
    public static Paint m0;
    public static Drawable m1;
    public static Paint m2;
    public static t4 m3;
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
    public static final ThreadLocal mm;
    public static Paint n0;
    public static Drawable n1;
    public static Paint n2;
    public static t4 n3;
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
    public static t4 o3;
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
    public static final int ol;
    public static final ThreadLocal om;
    public static boolean p;
    public static Paint p0;
    public static Drawable p1;
    public static TextPaint p2;
    public static t4 p3;
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
    public static final int[] pk;
    public static final int pl;
    public static final ThreadLocal pm;
    public static float q;
    public static Paint q0;
    public static Drawable q1;
    public static TextPaint q2;
    public static t4 q3;
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
    public static k00 qm;
    public static int r;
    public static Drawable r1;
    public static TextPaint r2;
    public static t4 r3;
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
    public static final int rl;
    public static k4.j rm;
    public static int s;
    public static Drawable s0;
    public static Drawable s1;
    public static TextPaint s2;
    public static t4 s3;
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
    public static Method sm;
    public static int t;
    public static Paint t0;
    public static Drawable t1;
    public static TextPaint t2;
    public static t4 t3;
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
    public static int tm;
    public static int u;
    public static Paint u0;
    public static ch0 u1;
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
    public static final int ul;
    public static float[] um;
    public static int v;
    public static Paint v0;
    public static ch0 v1;
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
    public static final int[] vl;
    public static final o5 vm;
    public static String w;
    public static Paint w0;
    public static ch0 w1;
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
    public static final int wl;
    public static final int[] wm;
    public static double x;
    public static Paint x0;
    public static ch0 x1;
    public static TextPaint x2;
    public static gc0 x3;
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
    public static final int xl;
    public static WeakReference xm;
    public static double y;
    public static Paint y0;
    public static ch0 y1;
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
    public static final int yl;
    public static Bitmap ym;
    public static Paint z0;
    public static ch0 z1;
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
    public static int[] zm;
    public static final int a = i0.a.o(-16777216, 27);
    public static final Object c = new Object();
    public static float h = 1.0f;
    public static final androidx.emoji2.text.o l = new androidx.emoji2.text.o(6);
    public static final androidx.emoji2.text.o m = new androidx.emoji2.text.o(7);
    public static final int n = 99;
    public static final Paint z = new Paint(1);
    public static final boolean[] C = new boolean[4];
    public static final int[] D = new int[4];
    public static final long[] E = new long[4];
    public static final Drawable[] r0 = new Drawable[25];
    public static final nu0[] u3 = new nu0[6];
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
    /* JADX WARN: Removed duplicated region for block: B:149:0x251c A[Catch: all -> 0x2549, TryCatch #3 {all -> 0x2549, blocks: (B:118:0x2459, B:120:0x246e, B:121:0x2474, B:123:0x2486, B:126:0x2496, B:129:0x24a3, B:132:0x24bb, B:135:0x24cd, B:137:0x24dc, B:140:0x24e5, B:142:0x24f8, B:144:0x2501, B:146:0x2508, B:147:0x2518, B:149:0x251c, B:150:0x2520, B:152:0x252b, B:153:0x2532, B:156:0x24c3, B:157:0x24ae), top: B:117:0x2459, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x252b A[Catch: all -> 0x2549, TryCatch #3 {all -> 0x2549, blocks: (B:118:0x2459, B:120:0x246e, B:121:0x2474, B:123:0x2486, B:126:0x2496, B:129:0x24a3, B:132:0x24bb, B:135:0x24cd, B:137:0x24dc, B:140:0x24e5, B:142:0x24f8, B:144:0x2501, B:146:0x2508, B:147:0x2518, B:149:0x251c, B:150:0x2520, B:152:0x252b, B:153:0x2532, B:156:0x24c3, B:157:0x24ae), top: B:117:0x2459, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x2673 A[Catch: Exception -> 0x28b9, TryCatch #1 {Exception -> 0x28b9, blocks: (B:55:0x2339, B:57:0x2353, B:58:0x2390, B:60:0x239e, B:61:0x23c5, B:63:0x23c9, B:65:0x23d1, B:66:0x23e3, B:67:0x23ed, B:69:0x23f3, B:71:0x23fd, B:73:0x2401, B:75:0x242f, B:76:0x2433, B:82:0x266d, B:84:0x2673, B:85:0x267c, B:87:0x2680, B:89:0x2688, B:91:0x268c, B:92:0x2690, B:94:0x2692, B:96:0x269c, B:78:0x2562, B:101:0x2581, B:102:0x258c, B:104:0x2598, B:108:0x25a4, B:109:0x2652, B:106:0x25ad, B:111:0x25b0, B:168:0x2559, B:169:0x2561, B:176:0x26b4, B:177:0x26ba, B:180:0x26c5, B:182:0x271c, B:183:0x272a, B:185:0x2738, B:186:0x2746, B:221:0x273f, B:222:0x2723, B:224:0x23ac, B:226:0x23b4, B:228:0x23bb, B:230:0x23c3, B:231:0x2360, B:233:0x2368, B:235:0x236e, B:237:0x2376, B:239:0x237e, B:114:0x2444, B:161:0x254a, B:162:0x254f), top: B:54:0x2339, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x268c A[Catch: Exception -> 0x28b9, TryCatch #1 {Exception -> 0x28b9, blocks: (B:55:0x2339, B:57:0x2353, B:58:0x2390, B:60:0x239e, B:61:0x23c5, B:63:0x23c9, B:65:0x23d1, B:66:0x23e3, B:67:0x23ed, B:69:0x23f3, B:71:0x23fd, B:73:0x2401, B:75:0x242f, B:76:0x2433, B:82:0x266d, B:84:0x2673, B:85:0x267c, B:87:0x2680, B:89:0x2688, B:91:0x268c, B:92:0x2690, B:94:0x2692, B:96:0x269c, B:78:0x2562, B:101:0x2581, B:102:0x258c, B:104:0x2598, B:108:0x25a4, B:109:0x2652, B:106:0x25ad, B:111:0x25b0, B:168:0x2559, B:169:0x2561, B:176:0x26b4, B:177:0x26ba, B:180:0x26c5, B:182:0x271c, B:183:0x272a, B:185:0x2738, B:186:0x2746, B:221:0x273f, B:222:0x2723, B:224:0x23ac, B:226:0x23b4, B:228:0x23bb, B:230:0x23c3, B:231:0x2360, B:233:0x2368, B:235:0x236e, B:237:0x2376, B:239:0x237e, B:114:0x2444, B:161:0x254a, B:162:0x254f), top: B:54:0x2339, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x268f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x269c A[Catch: Exception -> 0x28b9, TryCatch #1 {Exception -> 0x28b9, blocks: (B:55:0x2339, B:57:0x2353, B:58:0x2390, B:60:0x239e, B:61:0x23c5, B:63:0x23c9, B:65:0x23d1, B:66:0x23e3, B:67:0x23ed, B:69:0x23f3, B:71:0x23fd, B:73:0x2401, B:75:0x242f, B:76:0x2433, B:82:0x266d, B:84:0x2673, B:85:0x267c, B:87:0x2680, B:89:0x2688, B:91:0x268c, B:92:0x2690, B:94:0x2692, B:96:0x269c, B:78:0x2562, B:101:0x2581, B:102:0x258c, B:104:0x2598, B:108:0x25a4, B:109:0x2652, B:106:0x25ad, B:111:0x25b0, B:168:0x2559, B:169:0x2561, B:176:0x26b4, B:177:0x26ba, B:180:0x26c5, B:182:0x271c, B:183:0x272a, B:185:0x2738, B:186:0x2746, B:221:0x273f, B:222:0x2723, B:224:0x23ac, B:226:0x23b4, B:228:0x23bb, B:230:0x23c3, B:231:0x2360, B:233:0x2368, B:235:0x236e, B:237:0x2376, B:239:0x237e, B:114:0x2444, B:161:0x254a, B:162:0x254f), top: B:54:0x2339, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x26a8 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v101 */
    /* JADX WARN: Type inference failed for: r12v92, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v97 */
    static {
        j6 j6Var;
        j6 j6Var2;
        j6 j6Var3;
        int i10;
        char c10;
        j6 j6Var4;
        SharedPreferences.Editor editor;
        boolean z10;
        SharedPreferences.Editor editor2;
        j6 j6Var5;
        int i11;
        TLRPC.TL_theme tL_theme;
        TLRPC.TL_theme tL_theme2;
        SparseArray sparseArray;
        g6 k10;
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
        int i12 = 3;
        int i13 = f5;
        int i14 = i13 + 1;
        f5 = i14;
        g5 = i13;
        int i15 = i13 + 2;
        f5 = i15;
        h5 = i14;
        int i16 = i13 + 3;
        f5 = i16;
        i5 = i15;
        int i17 = i13 + 4;
        f5 = i17;
        j5 = i16;
        int i18 = i13 + 5;
        f5 = i18;
        k5 = i17;
        int i19 = i13 + 6;
        f5 = i19;
        l5 = i18;
        int i20 = i13 + 7;
        f5 = i20;
        m5 = i19;
        int i21 = i13 + 8;
        f5 = i21;
        n5 = i20;
        int i22 = i13 + 9;
        f5 = i22;
        o5 = i21;
        int i23 = i13 + 10;
        f5 = i23;
        p5 = i22;
        int i24 = i13 + 11;
        f5 = i24;
        q5 = i23;
        int i25 = i13 + 12;
        f5 = i25;
        r5 = i24;
        int i26 = i13 + 13;
        f5 = i26;
        s5 = i25;
        int i27 = i13 + 14;
        f5 = i27;
        t5 = i26;
        int i28 = i13 + 15;
        f5 = i28;
        u5 = i27;
        int i29 = i13 + 16;
        f5 = i29;
        v5 = i28;
        int i30 = i13 + 17;
        f5 = i30;
        w5 = i29;
        int i31 = i13 + 18;
        f5 = i31;
        x5 = i30;
        int i32 = i13 + 19;
        f5 = i32;
        y5 = i31;
        int i33 = i13 + 20;
        f5 = i33;
        z5 = i32;
        int i34 = i13 + 21;
        f5 = i34;
        A5 = i33;
        int i35 = i13 + 22;
        f5 = i35;
        B5 = i34;
        int i36 = i13 + 23;
        f5 = i36;
        C5 = i35;
        int i37 = i13 + 24;
        f5 = i37;
        D5 = i36;
        int i38 = i13 + 25;
        f5 = i38;
        E5 = i37;
        int i39 = i13 + 26;
        f5 = i39;
        F5 = i38;
        int i40 = i13 + 27;
        f5 = i40;
        G5 = i39;
        int i41 = i13 + 28;
        f5 = i41;
        H5 = i40;
        int i42 = i13 + 29;
        f5 = i42;
        I5 = i41;
        int i43 = i13 + 30;
        f5 = i43;
        J5 = i42;
        int i44 = i13 + 31;
        f5 = i44;
        K5 = i43;
        int i45 = i13 + 32;
        f5 = i45;
        L5 = i44;
        int i46 = i13 + 33;
        f5 = i46;
        M5 = i45;
        int i47 = i13 + 34;
        f5 = i47;
        N5 = i46;
        int i48 = i13 + 35;
        f5 = i48;
        O5 = i47;
        int i49 = i13 + 36;
        f5 = i49;
        P5 = i48;
        int i50 = i13 + 37;
        f5 = i50;
        Q5 = i49;
        int i51 = i13 + 38;
        f5 = i51;
        R5 = i50;
        int i52 = i13 + 39;
        f5 = i52;
        S5 = i51;
        int i53 = i13 + 40;
        f5 = i53;
        T5 = i52;
        int i54 = i13 + 41;
        f5 = i54;
        U5 = i53;
        int i55 = i13 + 42;
        f5 = i55;
        V5 = i54;
        int i56 = i13 + 43;
        f5 = i56;
        W5 = i55;
        int i57 = i13 + 44;
        f5 = i57;
        X5 = i56;
        int i58 = i13 + 45;
        f5 = i58;
        Y5 = i57;
        int i59 = i13 + 46;
        f5 = i59;
        Z5 = i58;
        int i60 = i13 + 47;
        f5 = i60;
        a6 = i59;
        int i61 = i13 + 48;
        f5 = i61;
        b6 = i60;
        f5 = i13 + 49;
        c6 = i61;
        int i62 = f5;
        int i63 = i62 + 1;
        f5 = i63;
        d6 = i62;
        int i64 = i62 + 2;
        f5 = i64;
        e6 = i63;
        int i65 = i62 + 3;
        f5 = i65;
        f6 = i64;
        int i66 = i62 + 4;
        f5 = i66;
        g6 = i65;
        int i67 = i62 + 5;
        f5 = i67;
        h6 = i66;
        int i68 = i62 + 6;
        f5 = i68;
        i6 = i67;
        int i69 = i62 + 7;
        f5 = i69;
        j6 = i68;
        int i70 = i62 + 8;
        f5 = i70;
        k6 = i69;
        int i71 = i62 + 9;
        f5 = i71;
        l6 = i70;
        int i72 = i62 + 10;
        f5 = i72;
        m6 = i71;
        int i73 = i62 + 11;
        f5 = i73;
        n6 = i72;
        int i74 = i62 + 12;
        f5 = i74;
        o6 = i73;
        int i75 = i62 + 13;
        f5 = i75;
        p6 = i74;
        int i76 = i62 + 14;
        f5 = i76;
        q6 = i75;
        int i77 = i62 + 15;
        f5 = i77;
        r6 = i76;
        int i78 = i62 + 16;
        f5 = i78;
        s6 = i77;
        int i79 = i62 + 17;
        f5 = i79;
        t6 = i78;
        int i80 = i62 + 18;
        f5 = i80;
        u6 = i79;
        int i81 = i62 + 19;
        f5 = i81;
        v6 = i80;
        int i82 = i62 + 20;
        f5 = i82;
        w6 = i81;
        int i83 = i62 + 21;
        f5 = i83;
        x6 = i82;
        int i84 = i62 + 22;
        f5 = i84;
        y6 = i83;
        int i85 = i62 + 23;
        f5 = i85;
        z6 = i84;
        int i86 = i62 + 24;
        f5 = i86;
        A6 = i85;
        int i87 = i62 + 25;
        f5 = i87;
        B6 = i86;
        int i88 = i62 + 26;
        f5 = i88;
        C6 = i87;
        int i89 = i62 + 27;
        f5 = i89;
        D6 = i88;
        int i90 = i62 + 28;
        f5 = i90;
        E6 = i89;
        int i91 = i62 + 29;
        f5 = i91;
        F6 = i90;
        int i92 = i62 + 30;
        f5 = i92;
        G6 = i91;
        int i93 = i62 + 31;
        f5 = i93;
        H6 = i92;
        int i94 = i62 + 32;
        f5 = i94;
        I6 = i93;
        int i95 = i62 + 33;
        f5 = i95;
        J6 = i94;
        int i96 = i62 + 34;
        f5 = i96;
        K6 = i95;
        int i97 = i62 + 35;
        f5 = i97;
        L6 = i96;
        int i98 = i62 + 36;
        f5 = i98;
        M6 = i97;
        int i99 = i62 + 37;
        f5 = i99;
        N6 = i98;
        int i100 = i62 + 38;
        f5 = i100;
        O6 = i99;
        int i101 = i62 + 39;
        f5 = i101;
        P6 = i100;
        int i102 = i62 + 40;
        f5 = i102;
        Q6 = i101;
        int i103 = i62 + 41;
        f5 = i103;
        R6 = i102;
        int i104 = i62 + 42;
        f5 = i104;
        S6 = i103;
        int i105 = i62 + 43;
        f5 = i105;
        T6 = i104;
        int i106 = i62 + 44;
        f5 = i106;
        U6 = i105;
        int i107 = i62 + 45;
        f5 = i107;
        V6 = i106;
        int i108 = i62 + 46;
        f5 = i108;
        W6 = i107;
        int i109 = i62 + 47;
        f5 = i109;
        X6 = i108;
        int i110 = i62 + 48;
        f5 = i110;
        Y6 = i109;
        f5 = i62 + 49;
        Z6 = i110;
        int i111 = f5;
        int i112 = i111 + 1;
        f5 = i112;
        a7 = i111;
        int i113 = i111 + 2;
        f5 = i113;
        b7 = i112;
        int i114 = i111 + 3;
        f5 = i114;
        c7 = i113;
        int i115 = i111 + 4;
        f5 = i115;
        d7 = i114;
        int i116 = i111 + 5;
        f5 = i116;
        e7 = i115;
        int i117 = i111 + 6;
        f5 = i117;
        f7 = i116;
        int i118 = i111 + 7;
        f5 = i118;
        g7 = i117;
        int i119 = i111 + 8;
        f5 = i119;
        h7 = i118;
        int i120 = i111 + 9;
        f5 = i120;
        i7 = i119;
        int i121 = i111 + 10;
        f5 = i121;
        j7 = i120;
        int i122 = i111 + 11;
        f5 = i122;
        k7 = i121;
        int i123 = i111 + 12;
        f5 = i123;
        l7 = i122;
        int i124 = i111 + 13;
        f5 = i124;
        m7 = i123;
        int i125 = i111 + 14;
        f5 = i125;
        n7 = i124;
        int i126 = i111 + 15;
        f5 = i126;
        o7 = i125;
        int i127 = i111 + 16;
        f5 = i127;
        p7 = i126;
        int i128 = i111 + 17;
        f5 = i128;
        q7 = i127;
        int i129 = i111 + 18;
        f5 = i129;
        r7 = i128;
        int i130 = i111 + 19;
        f5 = i130;
        s7 = i129;
        int i131 = i111 + 20;
        f5 = i131;
        t7 = i130;
        int i132 = i111 + 21;
        f5 = i132;
        u7 = i131;
        int i133 = i111 + 22;
        f5 = i133;
        v7 = i132;
        int i134 = i111 + 23;
        f5 = i134;
        w7 = i133;
        int i135 = i111 + 24;
        f5 = i135;
        x7 = i134;
        int i136 = i111 + 25;
        f5 = i136;
        y7 = i135;
        int i137 = i111 + 26;
        f5 = i137;
        z7 = i136;
        int i138 = i111 + 27;
        f5 = i138;
        A7 = i137;
        int i139 = i111 + 28;
        f5 = i139;
        B7 = i138;
        int i140 = i111 + 29;
        f5 = i140;
        C7 = i139;
        int i141 = i111 + 30;
        f5 = i141;
        D7 = i140;
        int i142 = i111 + 31;
        f5 = i142;
        E7 = i141;
        int i143 = i111 + 32;
        f5 = i143;
        F7 = i142;
        int i144 = i111 + 33;
        f5 = i144;
        G7 = i143;
        int i145 = i111 + 34;
        f5 = i145;
        H7 = i144;
        int i146 = i111 + 35;
        f5 = i146;
        I7 = i145;
        int i147 = i111 + 36;
        f5 = i147;
        J7 = i146;
        int i148 = i111 + 37;
        f5 = i148;
        K7 = i147;
        int i149 = i111 + 38;
        f5 = i149;
        L7 = i148;
        int i150 = i111 + 39;
        f5 = i150;
        M7 = i149;
        int i151 = i111 + 40;
        f5 = i151;
        N7 = i150;
        int i152 = i111 + 41;
        f5 = i152;
        O7 = i151;
        int i153 = i111 + 42;
        f5 = i153;
        P7 = i152;
        int i154 = i111 + 43;
        f5 = i154;
        Q7 = i153;
        int i155 = i111 + 44;
        f5 = i155;
        R7 = i154;
        int i156 = i111 + 45;
        f5 = i156;
        S7 = i155;
        int i157 = i111 + 46;
        f5 = i157;
        T7 = i156;
        int i158 = i111 + 47;
        f5 = i158;
        U7 = i157;
        int i159 = i111 + 48;
        f5 = i159;
        V7 = i158;
        f5 = i111 + 49;
        W7 = i159;
        int i160 = f5;
        int i161 = i160 + 1;
        f5 = i161;
        X7 = i160;
        int i162 = i160 + 2;
        f5 = i162;
        Y7 = i161;
        int i163 = i160 + 3;
        f5 = i163;
        Z7 = i162;
        int i164 = i160 + 4;
        f5 = i164;
        a8 = i163;
        int i165 = i160 + 5;
        f5 = i165;
        b8 = i164;
        int i166 = i160 + 6;
        f5 = i166;
        c8 = i165;
        int i167 = i160 + 7;
        f5 = i167;
        d8 = i166;
        int i168 = i160 + 8;
        f5 = i168;
        e8 = i167;
        int i169 = i160 + 9;
        f5 = i169;
        f8 = i168;
        int i170 = i160 + 10;
        f5 = i170;
        g8 = i169;
        int i171 = i160 + 11;
        f5 = i171;
        h8 = i170;
        int i172 = i160 + 12;
        f5 = i172;
        i8 = i171;
        int i173 = i160 + 13;
        f5 = i173;
        j8 = i172;
        int i174 = i160 + 14;
        f5 = i174;
        k8 = i173;
        int i175 = i160 + 15;
        f5 = i175;
        l8 = i174;
        int i176 = i160 + 16;
        f5 = i176;
        m8 = i175;
        int i177 = i160 + 17;
        f5 = i177;
        n8 = i176;
        int i178 = i160 + 18;
        f5 = i178;
        o8 = i177;
        p8 = new int[]{i151, i152, i153, i154, i155, i156, i157};
        q8 = new int[]{i158, i159, i160, i161, i162, i163, i164};
        r8 = new int[]{i171, i172, i173, i174, i175, i176, i177};
        int i179 = i160 + 19;
        f5 = i179;
        s8 = i178;
        int i180 = i160 + 20;
        f5 = i180;
        t8 = i179;
        int i181 = i160 + 21;
        f5 = i181;
        u8 = i180;
        int i182 = i160 + 22;
        f5 = i182;
        v8 = i181;
        int i183 = i160 + 23;
        f5 = i183;
        w8 = i182;
        int i184 = i160 + 24;
        f5 = i184;
        x8 = i183;
        int i185 = i160 + 25;
        f5 = i185;
        y8 = i184;
        int i186 = i160 + 26;
        f5 = i186;
        z8 = i185;
        int i187 = i160 + 27;
        f5 = i187;
        A8 = i186;
        int i188 = i160 + 28;
        f5 = i188;
        B8 = i187;
        int i189 = i160 + 29;
        f5 = i189;
        C8 = i188;
        int i190 = i160 + 30;
        f5 = i190;
        D8 = i189;
        int i191 = i160 + 31;
        f5 = i191;
        E8 = i190;
        int i192 = i160 + 32;
        f5 = i192;
        F8 = i191;
        int i193 = i160 + 33;
        f5 = i193;
        G8 = i192;
        int i194 = i160 + 34;
        f5 = i194;
        H8 = i193;
        int i195 = i160 + 35;
        f5 = i195;
        I8 = i194;
        int i196 = i160 + 36;
        f5 = i196;
        J8 = i195;
        int i197 = i160 + 37;
        f5 = i197;
        K8 = i196;
        int i198 = i160 + 38;
        f5 = i198;
        L8 = i197;
        int i199 = i160 + 39;
        f5 = i199;
        M8 = i198;
        int i200 = i160 + 40;
        f5 = i200;
        N8 = i199;
        int i201 = i160 + 41;
        f5 = i201;
        O8 = i200;
        int i202 = i160 + 42;
        f5 = i202;
        P8 = i201;
        int i203 = i160 + 43;
        f5 = i203;
        Q8 = i202;
        int i204 = i160 + 44;
        f5 = i204;
        R8 = i203;
        int i205 = i160 + 45;
        f5 = i205;
        S8 = i204;
        f5 = i160 + 46;
        T8 = i205;
        int i206 = f5;
        int i207 = i206 + 1;
        f5 = i207;
        U8 = i206;
        int i208 = i206 + 2;
        f5 = i208;
        V8 = i207;
        int i209 = i206 + 3;
        f5 = i209;
        W8 = i208;
        int i210 = i206 + 4;
        f5 = i210;
        X8 = i209;
        int i211 = i206 + 5;
        f5 = i211;
        Y8 = i210;
        int i212 = i206 + 6;
        f5 = i212;
        Z8 = i211;
        int i213 = i206 + 7;
        f5 = i213;
        a9 = i212;
        int i214 = i206 + 8;
        f5 = i214;
        b9 = i213;
        int i215 = i206 + 9;
        f5 = i215;
        c9 = i214;
        int i216 = i206 + 10;
        f5 = i216;
        d9 = i215;
        int i217 = i206 + 11;
        f5 = i217;
        e9 = i216;
        int i218 = i206 + 12;
        f5 = i218;
        f9 = i217;
        int i219 = i206 + 13;
        f5 = i219;
        g9 = i218;
        int i220 = i206 + 14;
        f5 = i220;
        h9 = i219;
        int i221 = i206 + 15;
        f5 = i221;
        i9 = i220;
        int i222 = i206 + 16;
        f5 = i222;
        j9 = i221;
        int i223 = i206 + 17;
        f5 = i223;
        k9 = i222;
        int i224 = i206 + 18;
        f5 = i224;
        l9 = i223;
        int i225 = i206 + 19;
        f5 = i225;
        m9 = i224;
        int i226 = i206 + 20;
        f5 = i226;
        n9 = i225;
        int i227 = i206 + 21;
        f5 = i227;
        o9 = i226;
        int i228 = i206 + 22;
        f5 = i228;
        p9 = i227;
        int i229 = i206 + 23;
        f5 = i229;
        q9 = i228;
        int i230 = i206 + 24;
        f5 = i230;
        r9 = i229;
        int i231 = i206 + 25;
        f5 = i231;
        s9 = i230;
        int i232 = i206 + 26;
        f5 = i232;
        t9 = i231;
        int i233 = i206 + 27;
        f5 = i233;
        u9 = i232;
        int i234 = i206 + 28;
        f5 = i234;
        v9 = i233;
        int i235 = i206 + 29;
        f5 = i235;
        w9 = i234;
        int i236 = i206 + 30;
        f5 = i236;
        x9 = i235;
        int i237 = i206 + 31;
        f5 = i237;
        y9 = i236;
        int i238 = i206 + 32;
        f5 = i238;
        z9 = i237;
        int i239 = i206 + 33;
        f5 = i239;
        A9 = i238;
        int i240 = i206 + 34;
        f5 = i240;
        B9 = i239;
        int i241 = i206 + 35;
        f5 = i241;
        C9 = i240;
        int i242 = i206 + 36;
        f5 = i242;
        D9 = i241;
        int i243 = i206 + 37;
        f5 = i243;
        E9 = i242;
        int i244 = i206 + 38;
        f5 = i244;
        F9 = i243;
        int i245 = i206 + 39;
        f5 = i245;
        G9 = i244;
        int i246 = i206 + 40;
        f5 = i246;
        H9 = i245;
        int i247 = i206 + 41;
        f5 = i247;
        I9 = i246;
        int i248 = i206 + 42;
        f5 = i248;
        J9 = i247;
        int i249 = i206 + 43;
        f5 = i249;
        K9 = i248;
        int i250 = i206 + 44;
        f5 = i250;
        L9 = i249;
        int i251 = i206 + 45;
        f5 = i251;
        M9 = i250;
        int i252 = i206 + 46;
        f5 = i252;
        N9 = i251;
        int i253 = i206 + 47;
        f5 = i253;
        O9 = i252;
        int i254 = i206 + 48;
        f5 = i254;
        P9 = i253;
        f5 = i206 + 49;
        Q9 = i254;
        int i255 = f5;
        int i256 = i255 + 1;
        f5 = i256;
        R9 = i255;
        int i257 = i255 + 2;
        f5 = i257;
        S9 = i256;
        int i258 = i255 + 3;
        f5 = i258;
        T9 = i257;
        int i259 = i255 + 4;
        f5 = i259;
        U9 = i258;
        int i260 = i255 + 5;
        f5 = i260;
        V9 = i259;
        int i261 = i255 + 6;
        f5 = i261;
        W9 = i260;
        int i262 = i255 + 7;
        f5 = i262;
        X9 = i261;
        int i263 = i255 + 8;
        f5 = i263;
        Y9 = i262;
        int i264 = i255 + 9;
        f5 = i264;
        Z9 = i263;
        int i265 = i255 + 10;
        f5 = i265;
        aa = i264;
        int i266 = i255 + 11;
        f5 = i266;
        ba = i265;
        int i267 = i255 + 12;
        f5 = i267;
        ca = i266;
        int i268 = i255 + 13;
        f5 = i268;
        da = i267;
        int i269 = i255 + 14;
        f5 = i269;
        ea = i268;
        int i270 = i255 + 15;
        f5 = i270;
        fa = i269;
        int i271 = i255 + 16;
        f5 = i271;
        ga = i270;
        int i272 = i255 + 17;
        f5 = i272;
        ha = i271;
        int i273 = i255 + 18;
        f5 = i273;
        ia = i272;
        int i274 = i255 + 19;
        f5 = i274;
        ja = i273;
        int i275 = i255 + 20;
        f5 = i275;
        ka = i274;
        int i276 = i255 + 21;
        f5 = i276;
        la = i275;
        int i277 = i255 + 22;
        f5 = i277;
        ma = i276;
        int i278 = i255 + 23;
        f5 = i278;
        na = i277;
        int i279 = i255 + 24;
        f5 = i279;
        oa = i278;
        int i280 = i255 + 25;
        f5 = i280;
        pa = i279;
        int i281 = i255 + 26;
        f5 = i281;
        qa = i280;
        int i282 = i255 + 27;
        f5 = i282;
        ra = i281;
        int i283 = i255 + 28;
        f5 = i283;
        sa = i282;
        int i284 = i255 + 29;
        f5 = i284;
        ta = i283;
        int i285 = i255 + 30;
        f5 = i285;
        ua = i284;
        int i286 = i255 + 31;
        f5 = i286;
        va = i285;
        int i287 = i255 + 32;
        f5 = i287;
        wa = i286;
        int i288 = i255 + 33;
        f5 = i288;
        xa = i287;
        int i289 = i255 + 34;
        f5 = i289;
        ya = i288;
        int i290 = i255 + 35;
        f5 = i290;
        za = i289;
        int i291 = i255 + 36;
        f5 = i291;
        Aa = i290;
        int i292 = i255 + 37;
        f5 = i292;
        Ba = i291;
        int i293 = i255 + 38;
        f5 = i293;
        Ca = i292;
        int i294 = i255 + 39;
        f5 = i294;
        Da = i293;
        int i295 = i255 + 40;
        f5 = i295;
        Ea = i294;
        int i296 = i255 + 41;
        f5 = i296;
        Fa = i295;
        int i297 = i255 + 42;
        f5 = i297;
        Ga = i296;
        int i298 = i255 + 43;
        f5 = i298;
        Ha = i297;
        int i299 = i255 + 44;
        f5 = i299;
        Ia = i298;
        int i300 = i255 + 45;
        f5 = i300;
        Ja = i299;
        int i301 = i255 + 46;
        f5 = i301;
        Ka = i300;
        int i302 = i255 + 47;
        f5 = i302;
        La = i301;
        int i303 = i255 + 48;
        f5 = i303;
        Ma = i302;
        f5 = i255 + 49;
        Na = i303;
        int i304 = f5;
        int i305 = i304 + 1;
        f5 = i305;
        Oa = i304;
        int i306 = i304 + 2;
        f5 = i306;
        Pa = i305;
        int i307 = i304 + 3;
        f5 = i307;
        Qa = i306;
        int i308 = i304 + 4;
        f5 = i308;
        Ra = i307;
        int i309 = i304 + 5;
        f5 = i309;
        Sa = i308;
        int i310 = i304 + 6;
        f5 = i310;
        Ta = i309;
        int i311 = i304 + 7;
        f5 = i311;
        Ua = i310;
        int i312 = i304 + 8;
        f5 = i312;
        Va = i311;
        int i313 = i304 + 9;
        f5 = i313;
        Wa = i312;
        int i314 = i304 + 10;
        f5 = i314;
        Xa = i313;
        int i315 = i304 + 11;
        f5 = i315;
        Ya = i314;
        int i316 = i304 + 12;
        f5 = i316;
        Za = i315;
        int i317 = i304 + 13;
        f5 = i317;
        ab = i316;
        int i318 = i304 + 14;
        f5 = i318;
        bb = i317;
        int i319 = i304 + 15;
        f5 = i319;
        cb = i318;
        int i320 = i304 + 16;
        f5 = i320;
        db = i319;
        int i321 = i304 + 17;
        f5 = i321;
        eb = i320;
        int i322 = i304 + 18;
        f5 = i322;
        fb = i321;
        int i323 = i304 + 19;
        f5 = i323;
        gb = i322;
        int i324 = i304 + 20;
        f5 = i324;
        hb = i323;
        int i325 = i304 + 21;
        f5 = i325;
        ib = i324;
        int i326 = i304 + 22;
        f5 = i326;
        jb = i325;
        int i327 = i304 + 23;
        f5 = i327;
        kb = i326;
        int i328 = i304 + 24;
        f5 = i328;
        lb = i327;
        int i329 = i304 + 25;
        f5 = i329;
        mb = i328;
        nb = i329;
        int i330 = i304 + 26;
        f5 = i330;
        ob = i329;
        int i331 = i304 + 27;
        f5 = i331;
        pb = i330;
        int i332 = i304 + 28;
        f5 = i332;
        qb = i331;
        int i333 = i304 + 29;
        f5 = i333;
        rb = i332;
        int i334 = i304 + 30;
        f5 = i334;
        sb = i333;
        int i335 = i304 + 31;
        f5 = i335;
        tb = i334;
        ub = i335;
        vb = i335;
        int i336 = i304 + 32;
        f5 = i336;
        wb = i335;
        int i337 = i304 + 33;
        f5 = i337;
        xb = i336;
        int i338 = i304 + 34;
        f5 = i338;
        yb = i337;
        int i339 = i304 + 35;
        f5 = i339;
        zb = i338;
        int i340 = i304 + 36;
        f5 = i340;
        Ab = i339;
        int i341 = i304 + 37;
        f5 = i341;
        Bb = i340;
        int i342 = i304 + 38;
        f5 = i342;
        Cb = i341;
        int i343 = i304 + 39;
        f5 = i343;
        Db = i342;
        int i344 = i304 + 40;
        f5 = i344;
        Eb = i343;
        int i345 = i304 + 41;
        f5 = i345;
        Fb = i344;
        int i346 = i304 + 42;
        f5 = i346;
        Gb = i345;
        int i347 = i304 + 43;
        f5 = i347;
        Hb = i346;
        int i348 = i304 + 44;
        f5 = i348;
        Ib = i347;
        int i349 = i304 + 45;
        f5 = i349;
        Jb = i348;
        f5 = i304 + 46;
        Kb = i349;
        int i350 = f5;
        int i351 = i350 + 1;
        f5 = i351;
        Lb = i350;
        int i352 = i350 + 2;
        f5 = i352;
        Mb = i351;
        int i353 = i350 + 3;
        f5 = i353;
        Nb = i352;
        int i354 = i350 + 4;
        f5 = i354;
        Ob = i353;
        int i355 = i350 + 5;
        f5 = i355;
        Pb = i354;
        int i356 = i350 + 6;
        f5 = i356;
        Qb = i355;
        int i357 = i350 + 7;
        f5 = i357;
        Rb = i356;
        int i358 = i350 + 8;
        f5 = i358;
        Sb = i357;
        int i359 = i350 + 9;
        f5 = i359;
        Tb = i358;
        int i360 = i350 + 10;
        f5 = i360;
        Ub = i359;
        int i361 = i350 + 11;
        f5 = i361;
        Vb = i360;
        int i362 = i350 + 12;
        f5 = i362;
        Wb = i361;
        int i363 = i350 + 13;
        f5 = i363;
        Xb = i362;
        int i364 = i350 + 14;
        f5 = i364;
        Yb = i363;
        int i365 = i350 + 15;
        f5 = i365;
        Zb = i364;
        int i366 = i350 + 16;
        f5 = i366;
        ac = i365;
        int i367 = i350 + 17;
        f5 = i367;
        bc = i366;
        int i368 = i350 + 18;
        f5 = i368;
        cc = i367;
        int i369 = i350 + 19;
        f5 = i369;
        dc = i368;
        int i370 = i350 + 20;
        f5 = i370;
        ec = i369;
        int i371 = i350 + 21;
        f5 = i371;
        fc = i370;
        int i372 = i350 + 22;
        f5 = i372;
        gc = i371;
        int i373 = i350 + 23;
        f5 = i373;
        hc = i372;
        int i374 = i350 + 24;
        f5 = i374;
        ic = i373;
        int i375 = i350 + 25;
        f5 = i375;
        jc = i374;
        int i376 = i350 + 26;
        f5 = i376;
        kc = i375;
        int i377 = i350 + 27;
        f5 = i377;
        lc = i376;
        int i378 = i350 + 28;
        f5 = i378;
        mc = i377;
        int i379 = i350 + 29;
        f5 = i379;
        nc = i378;
        int i380 = i350 + 30;
        f5 = i380;
        oc = i379;
        int i381 = i350 + 31;
        f5 = i381;
        pc = i380;
        int i382 = i350 + 32;
        f5 = i382;
        qc = i381;
        int i383 = i350 + 33;
        f5 = i383;
        rc = i382;
        int i384 = i350 + 34;
        f5 = i384;
        sc = i383;
        int i385 = i350 + 35;
        f5 = i385;
        tc = i384;
        int i386 = i350 + 36;
        f5 = i386;
        uc = i385;
        int i387 = i350 + 37;
        f5 = i387;
        vc = i386;
        int i388 = i350 + 38;
        f5 = i388;
        wc = i387;
        int i389 = i350 + 39;
        f5 = i389;
        xc = i388;
        int i390 = i350 + 40;
        f5 = i390;
        yc = i389;
        int i391 = i350 + 41;
        f5 = i391;
        zc = i390;
        int i392 = i350 + 42;
        f5 = i392;
        Ac = i391;
        int i393 = i350 + 43;
        f5 = i393;
        Bc = i392;
        int i394 = i350 + 44;
        f5 = i394;
        Cc = i393;
        int i395 = i350 + 45;
        f5 = i395;
        Dc = i394;
        int i396 = i350 + 46;
        f5 = i396;
        Ec = i395;
        int i397 = i350 + 47;
        f5 = i397;
        Fc = i396;
        int i398 = i350 + 48;
        f5 = i398;
        Gc = i397;
        Hc = i398;
        int i399 = f5;
        Ic = i399;
        int i400 = i399 + 1;
        f5 = i400;
        Jc = i399;
        int i401 = i399 + 2;
        f5 = i401;
        Kc = i400;
        int i402 = i399 + 3;
        f5 = i402;
        Lc = i401;
        int i403 = i399 + 4;
        f5 = i403;
        Mc = i402;
        int i404 = i399 + 5;
        f5 = i404;
        Nc = i403;
        int i405 = i399 + 6;
        f5 = i405;
        Oc = i404;
        int i406 = i399 + 7;
        f5 = i406;
        Pc = i405;
        Qc = i406;
        int i407 = i399 + 8;
        f5 = i407;
        Rc = i406;
        int i408 = i399 + 9;
        f5 = i408;
        Sc = i407;
        int i409 = i399 + 10;
        f5 = i409;
        Tc = i408;
        int i410 = i399 + 11;
        f5 = i410;
        Uc = i409;
        int i411 = i399 + 12;
        f5 = i411;
        Vc = i410;
        int i412 = i399 + 13;
        f5 = i412;
        Wc = i411;
        int i413 = i399 + 14;
        f5 = i413;
        Xc = i412;
        int i414 = i399 + 15;
        f5 = i414;
        Yc = i413;
        int i415 = i399 + 16;
        f5 = i415;
        Zc = i414;
        int i416 = i399 + 17;
        f5 = i416;
        ad = i415;
        int i417 = i399 + 18;
        f5 = i417;
        bd = i416;
        int i418 = i399 + 19;
        f5 = i418;
        cd = i417;
        int i419 = i399 + 20;
        f5 = i419;
        dd = i418;
        int i420 = i399 + 21;
        f5 = i420;
        ed = i419;
        int i421 = i399 + 22;
        f5 = i421;
        fd = i420;
        int i422 = i399 + 23;
        f5 = i422;
        gd = i421;
        int i423 = i399 + 24;
        f5 = i423;
        hd = i422;
        int i424 = i399 + 25;
        f5 = i424;
        id = i423;
        int i425 = i399 + 26;
        f5 = i425;
        jd = i424;
        int i426 = i399 + 27;
        f5 = i426;
        kd = i425;
        int i427 = i399 + 28;
        f5 = i427;
        ld = i426;
        int i428 = i399 + 29;
        f5 = i428;
        md = i427;
        int i429 = i399 + 30;
        f5 = i429;
        nd = i428;
        int i430 = i399 + 31;
        f5 = i430;
        od = i429;
        int i431 = i399 + 32;
        f5 = i431;
        pd = i430;
        int i432 = i399 + 33;
        f5 = i432;
        qd = i431;
        int i433 = i399 + 34;
        f5 = i433;
        rd = i432;
        int i434 = i399 + 35;
        f5 = i434;
        sd = i433;
        int i435 = i399 + 36;
        f5 = i435;
        td = i434;
        int i436 = i399 + 37;
        f5 = i436;
        ud = i435;
        int i437 = i399 + 38;
        f5 = i437;
        vd = i436;
        int i438 = i399 + 39;
        f5 = i438;
        wd = i437;
        int i439 = i399 + 40;
        f5 = i439;
        xd = i438;
        int i440 = i399 + 41;
        f5 = i440;
        yd = i439;
        int i441 = i399 + 42;
        f5 = i441;
        zd = i440;
        int i442 = i399 + 43;
        f5 = i442;
        Ad = i441;
        int i443 = i399 + 44;
        f5 = i443;
        Bd = i442;
        int i444 = i399 + 45;
        f5 = i444;
        Cd = i443;
        int i445 = i399 + 46;
        f5 = i445;
        Dd = i444;
        f5 = i399 + 47;
        Ed = i445;
        int i446 = f5;
        int i447 = i446 + 1;
        f5 = i447;
        Fd = i446;
        int i448 = i446 + 2;
        f5 = i448;
        Gd = i447;
        int i449 = i446 + 3;
        f5 = i449;
        Hd = i448;
        int i450 = i446 + 4;
        f5 = i450;
        Id = i449;
        int i451 = i446 + 5;
        f5 = i451;
        Jd = i450;
        int i452 = i446 + 6;
        f5 = i452;
        Kd = i451;
        int i453 = i446 + 7;
        f5 = i453;
        Ld = i452;
        int i454 = i446 + 8;
        f5 = i454;
        Md = i453;
        int i455 = i446 + 9;
        f5 = i455;
        Nd = i454;
        int i456 = i446 + 10;
        f5 = i456;
        Od = i455;
        int i457 = i446 + 11;
        f5 = i457;
        Pd = i456;
        int i458 = i446 + 12;
        f5 = i458;
        Qd = i457;
        int i459 = i446 + 13;
        f5 = i459;
        Rd = i458;
        int i460 = i446 + 14;
        f5 = i460;
        Sd = i459;
        int i461 = i446 + 15;
        f5 = i461;
        Td = i460;
        int i462 = i446 + 16;
        f5 = i462;
        Ud = i461;
        int i463 = i446 + 17;
        f5 = i463;
        Vd = i462;
        int i464 = i446 + 18;
        f5 = i464;
        Wd = i463;
        int i465 = i446 + 19;
        f5 = i465;
        Xd = i464;
        int i466 = i446 + 20;
        f5 = i466;
        Yd = i465;
        int i467 = i446 + 21;
        f5 = i467;
        Zd = i466;
        int i468 = i446 + 22;
        f5 = i468;
        ae = i467;
        int i469 = i446 + 23;
        f5 = i469;
        be = i468;
        int i470 = i446 + 24;
        f5 = i470;
        ce = i469;
        int i471 = i446 + 25;
        f5 = i471;
        de = i470;
        int i472 = i446 + 26;
        f5 = i472;
        ee = i471;
        int i473 = i446 + 27;
        f5 = i473;
        fe = i472;
        int i474 = i446 + 28;
        f5 = i474;
        ge = i473;
        int i475 = i446 + 29;
        f5 = i475;
        he = i474;
        int i476 = i446 + 30;
        f5 = i476;
        ie = i475;
        int i477 = i446 + 31;
        f5 = i477;
        je = i476;
        int i478 = i446 + 32;
        f5 = i478;
        ke = i477;
        int i479 = i446 + 33;
        f5 = i479;
        le = i478;
        int i480 = i446 + 34;
        f5 = i480;
        me = i479;
        int i481 = i446 + 35;
        f5 = i481;
        ne = i480;
        int i482 = i446 + 36;
        f5 = i482;
        oe = i481;
        int i483 = i446 + 37;
        f5 = i483;
        pe = i482;
        int i484 = i446 + 38;
        f5 = i484;
        qe = i483;
        int i485 = i446 + 39;
        f5 = i485;
        re = i484;
        int i486 = i446 + 40;
        f5 = i486;
        se = i485;
        int i487 = i446 + 41;
        f5 = i487;
        te = i486;
        int i488 = i446 + 42;
        f5 = i488;
        ue = i487;
        int i489 = i446 + 43;
        f5 = i489;
        ve = i488;
        int i490 = i446 + 44;
        f5 = i490;
        we = i489;
        int i491 = i446 + 45;
        f5 = i491;
        xe = i490;
        int i492 = i446 + 46;
        f5 = i492;
        ye = i491;
        int i493 = i446 + 47;
        f5 = i493;
        ze = i492;
        int i494 = i446 + 48;
        f5 = i494;
        Ae = i493;
        f5 = i446 + 49;
        Be = i494;
        int i495 = f5;
        int i496 = i495 + 1;
        f5 = i496;
        Ce = i495;
        int i497 = i495 + 2;
        f5 = i497;
        De = i496;
        int i498 = i495 + 3;
        f5 = i498;
        Ee = i497;
        int i499 = i495 + 4;
        f5 = i499;
        Fe = i498;
        int i500 = i495 + 5;
        f5 = i500;
        Ge = i499;
        int i501 = i495 + 6;
        f5 = i501;
        He = i500;
        int i502 = i495 + 7;
        f5 = i502;
        Ie = i501;
        int i503 = i495 + 8;
        f5 = i503;
        Je = i502;
        int i504 = i495 + 9;
        f5 = i504;
        Ke = i503;
        int i505 = i495 + 10;
        f5 = i505;
        Le = i504;
        int i506 = i495 + 11;
        f5 = i506;
        Me = i505;
        int i507 = i495 + 12;
        f5 = i507;
        Ne = i506;
        int i508 = i495 + 13;
        f5 = i508;
        Oe = i507;
        int i509 = i495 + 14;
        f5 = i509;
        Pe = i508;
        int i510 = i495 + 15;
        f5 = i510;
        Qe = i509;
        int i511 = i495 + 16;
        f5 = i511;
        Re = i510;
        int i512 = i495 + 17;
        f5 = i512;
        Se = i511;
        int i513 = i495 + 18;
        f5 = i513;
        Te = i512;
        int i514 = i495 + 19;
        f5 = i514;
        Ue = i513;
        int i515 = i495 + 20;
        f5 = i515;
        Ve = i514;
        int i516 = i495 + 21;
        f5 = i516;
        We = i515;
        int i517 = i495 + 22;
        f5 = i517;
        Xe = i516;
        int i518 = i495 + 23;
        f5 = i518;
        Ye = i517;
        int i519 = i495 + 24;
        f5 = i519;
        Ze = i518;
        int i520 = i495 + 25;
        f5 = i520;
        af = i519;
        int i521 = i495 + 26;
        f5 = i521;
        bf = i520;
        int i522 = i495 + 27;
        f5 = i522;
        cf = i521;
        int i523 = i495 + 28;
        f5 = i523;
        df = i522;
        int i524 = i495 + 29;
        f5 = i524;
        ef = i523;
        int i525 = i495 + 30;
        f5 = i525;
        ff = i524;
        int i526 = i495 + 31;
        f5 = i526;
        gf = i525;
        int i527 = i495 + 32;
        f5 = i527;
        hf = i526;
        int i528 = i495 + 33;
        f5 = i528;
        jf = i527;
        int i529 = i495 + 34;
        f5 = i529;
        kf = i528;
        int i530 = i495 + 35;
        f5 = i530;
        lf = i529;
        int i531 = i495 + 36;
        f5 = i531;
        mf = i530;
        int i532 = i495 + 37;
        f5 = i532;
        nf = i531;
        int i533 = i495 + 38;
        f5 = i533;
        of = i532;
        int i534 = i495 + 39;
        f5 = i534;
        pf = i533;
        int i535 = i495 + 40;
        f5 = i535;
        qf = i534;
        int i536 = i495 + 41;
        f5 = i536;
        rf = i535;
        int i537 = i495 + 42;
        f5 = i537;
        sf = i536;
        int i538 = i495 + 43;
        f5 = i538;
        tf = i537;
        int i539 = i495 + 44;
        f5 = i539;
        uf = i538;
        int i540 = i495 + 45;
        f5 = i540;
        vf = i539;
        int i541 = i495 + 46;
        f5 = i541;
        wf = i540;
        int i542 = i495 + 47;
        f5 = i542;
        xf = i541;
        int i543 = i495 + 48;
        f5 = i543;
        yf = i542;
        f5 = i495 + 49;
        zf = i543;
        int i544 = f5;
        int i545 = i544 + 1;
        f5 = i545;
        Af = i544;
        int i546 = i544 + 2;
        f5 = i546;
        Bf = i545;
        int i547 = i544 + 3;
        f5 = i547;
        Cf = i546;
        int i548 = i544 + 4;
        f5 = i548;
        Df = i547;
        int i549 = i544 + 5;
        f5 = i549;
        Ef = i548;
        int i550 = i544 + 6;
        f5 = i550;
        Ff = i549;
        int i551 = i544 + 7;
        f5 = i551;
        Gf = i550;
        int i552 = i544 + 8;
        f5 = i552;
        Hf = i551;
        int i553 = i544 + 9;
        f5 = i553;
        If = i552;
        int i554 = i544 + 10;
        f5 = i554;
        Jf = i553;
        int i555 = i544 + 11;
        f5 = i555;
        Kf = i554;
        int i556 = i544 + 12;
        f5 = i556;
        Lf = i555;
        int i557 = i544 + 13;
        f5 = i557;
        Mf = i556;
        int i558 = i544 + 14;
        f5 = i558;
        Nf = i557;
        int i559 = i544 + 15;
        f5 = i559;
        Of = i558;
        int i560 = i544 + 16;
        f5 = i560;
        Pf = i559;
        int i561 = i544 + 17;
        f5 = i561;
        Qf = i560;
        int i562 = i544 + 18;
        f5 = i562;
        Rf = i561;
        int i563 = i544 + 19;
        f5 = i563;
        Sf = i562;
        int i564 = i544 + 20;
        f5 = i564;
        Tf = i563;
        int i565 = i544 + 21;
        f5 = i565;
        Uf = i564;
        int i566 = i544 + 22;
        f5 = i566;
        Vf = i565;
        int i567 = i544 + 23;
        f5 = i567;
        Wf = i566;
        int i568 = i544 + 24;
        f5 = i568;
        Xf = i567;
        int i569 = i544 + 25;
        f5 = i569;
        Yf = i568;
        int i570 = i544 + 26;
        f5 = i570;
        Zf = i569;
        int i571 = i544 + 27;
        f5 = i571;
        ag = i570;
        int i572 = i544 + 28;
        f5 = i572;
        bg = i571;
        int i573 = i544 + 29;
        f5 = i573;
        cg = i572;
        int i574 = i544 + 30;
        f5 = i574;
        dg = i573;
        int i575 = i544 + 31;
        f5 = i575;
        eg = i574;
        int i576 = i544 + 32;
        f5 = i576;
        fg = i575;
        int i577 = i544 + 33;
        f5 = i577;
        gg = i576;
        int i578 = i544 + 34;
        f5 = i578;
        hg = i577;
        int i579 = i544 + 35;
        f5 = i579;
        ig = i578;
        int i580 = i544 + 36;
        f5 = i580;
        jg = i579;
        int i581 = i544 + 37;
        f5 = i581;
        kg = i580;
        int i582 = i544 + 38;
        f5 = i582;
        lg = i581;
        int i583 = i544 + 39;
        f5 = i583;
        mg = i582;
        int i584 = i544 + 40;
        f5 = i584;
        ng = i583;
        int i585 = i544 + 41;
        f5 = i585;
        og = i584;
        int i586 = i544 + 42;
        f5 = i586;
        pg = i585;
        int i587 = i544 + 43;
        f5 = i587;
        qg = i586;
        int i588 = i544 + 44;
        f5 = i588;
        rg = i587;
        int i589 = i544 + 45;
        f5 = i589;
        sg = i588;
        int i590 = i544 + 46;
        f5 = i590;
        tg = i589;
        int i591 = i544 + 47;
        f5 = i591;
        ug = i590;
        int i592 = i544 + 48;
        f5 = i592;
        vg = i591;
        f5 = i544 + 49;
        wg = i592;
        int i593 = f5;
        int i594 = i593 + 1;
        f5 = i594;
        xg = i593;
        int i595 = i593 + 2;
        f5 = i595;
        yg = i594;
        int i596 = i593 + 3;
        f5 = i596;
        zg = i595;
        int i597 = i593 + 4;
        f5 = i597;
        Ag = i596;
        int i598 = i593 + 5;
        f5 = i598;
        Bg = i597;
        int i599 = i593 + 6;
        f5 = i599;
        Cg = i598;
        int i600 = i593 + 7;
        f5 = i600;
        Dg = i599;
        int i601 = i593 + 8;
        f5 = i601;
        Eg = i600;
        int i602 = i593 + 9;
        f5 = i602;
        Fg = i601;
        int i603 = i593 + 10;
        f5 = i603;
        Gg = i602;
        int i604 = i593 + 11;
        f5 = i604;
        Hg = i603;
        int i605 = i593 + 12;
        f5 = i605;
        Ig = i604;
        int i606 = i593 + 13;
        f5 = i606;
        Jg = i605;
        int i607 = i593 + 14;
        f5 = i607;
        Kg = i606;
        int i608 = i593 + 15;
        f5 = i608;
        Lg = i607;
        int i609 = i593 + 16;
        f5 = i609;
        Mg = i608;
        int i610 = i593 + 17;
        f5 = i610;
        Ng = i609;
        int i611 = i593 + 18;
        f5 = i611;
        Og = i610;
        int i612 = i593 + 19;
        f5 = i612;
        Pg = i611;
        int i613 = i593 + 20;
        f5 = i613;
        Qg = i612;
        int i614 = i593 + 21;
        f5 = i614;
        Rg = i613;
        int i615 = i593 + 22;
        f5 = i615;
        Sg = i614;
        int i616 = i593 + 23;
        f5 = i616;
        Tg = i615;
        int i617 = i593 + 24;
        f5 = i617;
        Ug = i616;
        int i618 = i593 + 25;
        f5 = i618;
        Vg = i617;
        int i619 = i593 + 26;
        f5 = i619;
        Wg = i618;
        int i620 = i593 + 27;
        f5 = i620;
        Xg = i619;
        int i621 = i593 + 28;
        f5 = i621;
        Yg = i620;
        int i622 = i593 + 29;
        f5 = i622;
        Zg = i621;
        int i623 = i593 + 30;
        f5 = i623;
        ah = i622;
        int i624 = i593 + 31;
        f5 = i624;
        bh = i623;
        int i625 = i593 + 32;
        f5 = i625;
        ch = i624;
        int i626 = i593 + 33;
        f5 = i626;
        dh = i625;
        int i627 = i593 + 34;
        f5 = i627;
        eh = i626;
        int i628 = i593 + 35;
        f5 = i628;
        fh = i627;
        int i629 = i593 + 36;
        f5 = i629;
        gh = i628;
        int i630 = i593 + 37;
        f5 = i630;
        hh = i629;
        int i631 = i593 + 38;
        f5 = i631;
        ih = i630;
        int i632 = i593 + 39;
        f5 = i632;
        jh = i631;
        int i633 = i593 + 40;
        f5 = i633;
        kh = i632;
        int i634 = i593 + 41;
        f5 = i634;
        lh = i633;
        int i635 = i593 + 42;
        f5 = i635;
        mh = i634;
        int i636 = i593 + 43;
        f5 = i636;
        nh = i635;
        int i637 = i593 + 44;
        f5 = i637;
        oh = i636;
        int i638 = i593 + 45;
        f5 = i638;
        ph = i637;
        int i639 = i593 + 46;
        f5 = i639;
        qh = i638;
        int i640 = i593 + 47;
        f5 = i640;
        rh = i639;
        int i641 = i593 + 48;
        f5 = i641;
        sh = i640;
        f5 = i593 + 49;
        th = i641;
        int i642 = f5;
        int i643 = i642 + 1;
        f5 = i643;
        uh = i642;
        int i644 = i642 + 2;
        f5 = i644;
        vh = i643;
        int i645 = i642 + 3;
        f5 = i645;
        wh = i644;
        int i646 = i642 + 4;
        f5 = i646;
        xh = i645;
        int i647 = i642 + 5;
        f5 = i647;
        yh = i646;
        int i648 = i642 + 6;
        f5 = i648;
        zh = i647;
        int i649 = i642 + 7;
        f5 = i649;
        Ah = i648;
        int i650 = i642 + 8;
        f5 = i650;
        Bh = i649;
        int i651 = i642 + 9;
        f5 = i651;
        Ch = i650;
        int i652 = i642 + 10;
        f5 = i652;
        Dh = i651;
        int i653 = i642 + 11;
        f5 = i653;
        Eh = i652;
        int i654 = i642 + 12;
        f5 = i654;
        Fh = i653;
        int i655 = i642 + 13;
        f5 = i655;
        Gh = i654;
        int i656 = i642 + 14;
        f5 = i656;
        Hh = i655;
        int i657 = i642 + 15;
        f5 = i657;
        Ih = i656;
        int i658 = i642 + 16;
        f5 = i658;
        Jh = i657;
        int i659 = i642 + 17;
        f5 = i659;
        Kh = i658;
        int i660 = i642 + 18;
        f5 = i660;
        Lh = i659;
        int i661 = i642 + 19;
        f5 = i661;
        Mh = i660;
        int i662 = i642 + 20;
        f5 = i662;
        Nh = i661;
        int i663 = i642 + 21;
        f5 = i663;
        Oh = i662;
        int i664 = i642 + 22;
        f5 = i664;
        Ph = i663;
        int i665 = i642 + 23;
        f5 = i665;
        Qh = i664;
        int i666 = i642 + 24;
        f5 = i666;
        Rh = i665;
        int i667 = i642 + 25;
        f5 = i667;
        Sh = i666;
        int i668 = i642 + 26;
        f5 = i668;
        Th = i667;
        int i669 = i642 + 27;
        f5 = i669;
        Uh = i668;
        int i670 = i642 + 28;
        f5 = i670;
        Vh = i669;
        int i671 = i642 + 29;
        f5 = i671;
        Wh = i670;
        int i672 = i642 + 30;
        f5 = i672;
        Xh = i671;
        int i673 = i642 + 31;
        f5 = i673;
        Yh = i672;
        int i674 = i642 + 32;
        f5 = i674;
        Zh = i673;
        int i675 = i642 + 33;
        f5 = i675;
        ai = i674;
        int i676 = i642 + 34;
        f5 = i676;
        bi = i675;
        int i677 = i642 + 35;
        f5 = i677;
        ci = i676;
        int i678 = i642 + 36;
        f5 = i678;
        di = i677;
        int i679 = i642 + 37;
        f5 = i679;
        ei = i678;
        int i680 = i642 + 38;
        f5 = i680;
        fi = i679;
        int i681 = i642 + 39;
        f5 = i681;
        gi = i680;
        int i682 = i642 + 40;
        f5 = i682;
        hi = i681;
        int i683 = i642 + 41;
        f5 = i683;
        ii = i682;
        int i684 = i642 + 42;
        f5 = i684;
        ji = i683;
        int i685 = i642 + 43;
        f5 = i685;
        ki = i684;
        int i686 = i642 + 44;
        f5 = i686;
        li = i685;
        int i687 = i642 + 45;
        f5 = i687;
        mi = i686;
        int i688 = i642 + 46;
        f5 = i688;
        ni = i687;
        int i689 = i642 + 47;
        f5 = i689;
        oi = i688;
        int i690 = i642 + 48;
        f5 = i690;
        pi = i689;
        f5 = i642 + 49;
        qi = i690;
        int i691 = f5;
        int i692 = i691 + 1;
        f5 = i692;
        ri = i691;
        int i693 = i691 + 2;
        f5 = i693;
        si = i692;
        int i694 = i691 + 3;
        f5 = i694;
        ti = i693;
        int i695 = i691 + 4;
        f5 = i695;
        ui = i694;
        int i696 = i691 + 5;
        f5 = i696;
        vi = i695;
        int i697 = i691 + 6;
        f5 = i697;
        wi = i696;
        int i698 = i691 + 7;
        f5 = i698;
        xi = i697;
        int i699 = i691 + 8;
        f5 = i699;
        yi = i698;
        int i700 = i691 + 9;
        f5 = i700;
        zi = i699;
        int i701 = i691 + 10;
        f5 = i701;
        Ai = i700;
        int i702 = i691 + 11;
        f5 = i702;
        Bi = i701;
        int i703 = i691 + 12;
        f5 = i703;
        Ci = i702;
        int i704 = i691 + 13;
        f5 = i704;
        Di = i703;
        int i705 = i691 + 14;
        f5 = i705;
        Ei = i704;
        int i706 = i691 + 15;
        f5 = i706;
        Fi = i705;
        int i707 = i691 + 16;
        f5 = i707;
        Gi = i706;
        int i708 = i691 + 17;
        f5 = i708;
        Hi = i707;
        int i709 = i691 + 18;
        f5 = i709;
        Ii = i708;
        int i710 = i691 + 19;
        f5 = i710;
        Ji = i709;
        int i711 = i691 + 20;
        f5 = i711;
        Ki = i710;
        int i712 = i691 + 21;
        f5 = i712;
        Li = i711;
        int i713 = i691 + 22;
        f5 = i713;
        Mi = i712;
        int i714 = i691 + 23;
        f5 = i714;
        Ni = i713;
        int i715 = i691 + 24;
        f5 = i715;
        Oi = i714;
        int i716 = i691 + 25;
        f5 = i716;
        Pi = i715;
        int i717 = i691 + 26;
        f5 = i717;
        Qi = i716;
        int i718 = i691 + 27;
        f5 = i718;
        Ri = i717;
        int i719 = i691 + 28;
        f5 = i719;
        Si = i718;
        int i720 = i691 + 29;
        f5 = i720;
        Ti = i719;
        int i721 = i691 + 30;
        f5 = i721;
        Ui = i720;
        int i722 = i691 + 31;
        f5 = i722;
        Vi = i721;
        int i723 = i691 + 32;
        f5 = i723;
        Wi = i722;
        int i724 = i691 + 33;
        f5 = i724;
        Xi = i723;
        int i725 = i691 + 34;
        f5 = i725;
        Yi = i724;
        int i726 = i691 + 35;
        f5 = i726;
        Zi = i725;
        int i727 = i691 + 36;
        f5 = i727;
        aj = i726;
        int i728 = i691 + 37;
        f5 = i728;
        bj = i727;
        int i729 = i691 + 38;
        f5 = i729;
        cj = i728;
        int i730 = i691 + 39;
        f5 = i730;
        dj = i729;
        int i731 = i691 + 40;
        f5 = i731;
        ej = i730;
        int i732 = i691 + 41;
        f5 = i732;
        fj = i731;
        int i733 = i691 + 42;
        f5 = i733;
        gj = i732;
        int i734 = i691 + 43;
        f5 = i734;
        hj = i733;
        int i735 = i691 + 44;
        f5 = i735;
        ij = i734;
        int i736 = i691 + 45;
        f5 = i736;
        jj = i735;
        int i737 = i691 + 46;
        f5 = i737;
        kj = i736;
        int i738 = i691 + 47;
        f5 = i738;
        lj = i737;
        int i739 = i691 + 48;
        f5 = i739;
        mj = i738;
        f5 = i691 + 49;
        nj = i739;
        int i740 = f5;
        int i741 = i740 + 1;
        f5 = i741;
        oj = i740;
        int i742 = i740 + 2;
        f5 = i742;
        pj = i741;
        int i743 = i740 + 3;
        f5 = i743;
        qj = i742;
        int i744 = i740 + 4;
        f5 = i744;
        rj = i743;
        int i745 = i740 + 5;
        f5 = i745;
        sj = i744;
        int i746 = i740 + 6;
        f5 = i746;
        tj = i745;
        int i747 = i740 + 7;
        f5 = i747;
        uj = i746;
        int i748 = i740 + 8;
        f5 = i748;
        vj = i747;
        int i749 = i740 + 9;
        f5 = i749;
        wj = i748;
        int i750 = i740 + 10;
        f5 = i750;
        xj = i749;
        int i751 = i740 + 11;
        f5 = i751;
        yj = i750;
        int i752 = i740 + 12;
        f5 = i752;
        zj = i751;
        int i753 = i740 + 13;
        f5 = i753;
        Aj = i752;
        int i754 = i740 + 14;
        f5 = i754;
        Bj = i753;
        int i755 = i740 + 15;
        f5 = i755;
        Cj = i754;
        int i756 = i740 + 16;
        f5 = i756;
        Dj = i755;
        int i757 = i740 + 17;
        f5 = i757;
        Ej = i756;
        int i758 = i740 + 18;
        f5 = i758;
        Fj = i757;
        int i759 = i740 + 19;
        f5 = i759;
        Gj = i758;
        int i760 = i740 + 20;
        f5 = i760;
        Hj = i759;
        int i761 = i740 + 21;
        f5 = i761;
        Ij = i760;
        int i762 = i740 + 22;
        f5 = i762;
        Jj = i761;
        int i763 = i740 + 23;
        f5 = i763;
        Kj = i762;
        int i764 = i740 + 24;
        f5 = i764;
        Lj = i763;
        int i765 = i740 + 25;
        f5 = i765;
        Mj = i764;
        int i766 = i740 + 26;
        f5 = i766;
        Nj = i765;
        int i767 = i740 + 27;
        f5 = i767;
        Oj = i766;
        int i768 = i740 + 28;
        f5 = i768;
        Pj = i767;
        int i769 = i740 + 29;
        f5 = i769;
        Qj = i768;
        int i770 = i740 + 30;
        f5 = i770;
        Rj = i769;
        int i771 = i740 + 31;
        f5 = i771;
        Sj = i770;
        int i772 = i740 + 32;
        f5 = i772;
        Tj = i771;
        int i773 = i740 + 33;
        f5 = i773;
        Uj = i772;
        int i774 = i740 + 34;
        f5 = i774;
        Vj = i773;
        int i775 = i740 + 35;
        f5 = i775;
        Wj = i774;
        int i776 = i740 + 36;
        f5 = i776;
        Xj = i775;
        int i777 = i740 + 37;
        f5 = i777;
        Yj = i776;
        int i778 = i740 + 38;
        f5 = i778;
        Zj = i777;
        int i779 = i740 + 39;
        f5 = i779;
        ak = i778;
        int i780 = i740 + 40;
        f5 = i780;
        bk = i779;
        int i781 = i740 + 41;
        f5 = i781;
        ck = i780;
        int i782 = i740 + 42;
        f5 = i782;
        dk = i781;
        int i783 = i740 + 43;
        f5 = i783;
        ek = i782;
        int i784 = i740 + 44;
        f5 = i784;
        fk = i783;
        int i785 = i740 + 45;
        f5 = i785;
        gk = i784;
        int i786 = i740 + 46;
        f5 = i786;
        hk = i785;
        int i787 = i740 + 47;
        f5 = i787;
        ik = i786;
        int i788 = i740 + 48;
        f5 = i788;
        jk = i787;
        f5 = i740 + 49;
        kk = i788;
        int i789 = f5;
        int i790 = i789 + 1;
        f5 = i790;
        lk = i789;
        int i791 = i789 + 2;
        f5 = i791;
        mk = i790;
        int i792 = i789 + 3;
        f5 = i792;
        nk = i791;
        int i793 = i789 + 4;
        f5 = i793;
        ok = i792;
        pk = new int[]{i784, i785, i786, i787, i788, i789, i790, i791, i792};
        int i794 = i789 + 5;
        f5 = i794;
        qk = i793;
        int i795 = i789 + 6;
        f5 = i795;
        rk = i794;
        int i796 = i789 + 7;
        f5 = i796;
        sk = i795;
        int i797 = i789 + 8;
        f5 = i797;
        tk = i796;
        int i798 = i789 + 9;
        f5 = i798;
        uk = i797;
        int i799 = i789 + 10;
        f5 = i799;
        vk = i798;
        int i800 = i789 + 11;
        f5 = i800;
        wk = i799;
        int i801 = i789 + 12;
        f5 = i801;
        xk = i800;
        int i802 = i789 + 13;
        f5 = i802;
        yk = i801;
        int i803 = i789 + 14;
        f5 = i803;
        zk = i802;
        int i804 = i789 + 15;
        f5 = i804;
        Ak = i803;
        int i805 = i789 + 16;
        f5 = i805;
        Bk = i804;
        int i806 = i789 + 17;
        f5 = i806;
        Ck = i805;
        int i807 = i789 + 18;
        f5 = i807;
        Dk = i806;
        int i808 = i789 + 19;
        f5 = i808;
        Ek = i807;
        int i809 = i789 + 20;
        f5 = i809;
        Fk = i808;
        int i810 = i789 + 21;
        f5 = i810;
        Gk = i809;
        int i811 = i789 + 22;
        f5 = i811;
        Hk = i810;
        int i812 = i789 + 23;
        f5 = i812;
        Ik = i811;
        int i813 = i789 + 24;
        f5 = i813;
        Jk = i812;
        int i814 = i789 + 25;
        f5 = i814;
        Kk = i813;
        int i815 = i789 + 26;
        f5 = i815;
        Lk = i814;
        int i816 = i789 + 27;
        f5 = i816;
        Mk = i815;
        int i817 = i789 + 28;
        f5 = i817;
        Nk = i816;
        int i818 = i789 + 29;
        f5 = i818;
        Ok = i817;
        int i819 = i789 + 30;
        f5 = i819;
        Pk = i818;
        int i820 = i789 + 31;
        f5 = i820;
        Qk = i819;
        int i821 = i789 + 32;
        f5 = i821;
        Rk = i820;
        int i822 = i789 + 33;
        f5 = i822;
        Sk = i821;
        int i823 = i789 + 34;
        f5 = i823;
        Tk = i822;
        int i824 = i789 + 35;
        f5 = i824;
        Uk = i823;
        int i825 = i789 + 36;
        f5 = i825;
        Vk = i824;
        int i826 = i789 + 37;
        f5 = i826;
        Wk = i825;
        int i827 = i789 + 38;
        f5 = i827;
        Xk = i826;
        int i828 = i789 + 39;
        f5 = i828;
        Yk = i827;
        int i829 = i789 + 40;
        f5 = i829;
        Zk = i828;
        int i830 = i789 + 41;
        f5 = i830;
        al = i829;
        int i831 = i789 + 42;
        f5 = i831;
        bl = i830;
        int i832 = i789 + 43;
        f5 = i832;
        cl = i831;
        int i833 = i789 + 44;
        f5 = i833;
        dl = i832;
        int i834 = i789 + 45;
        f5 = i834;
        el = i833;
        int i835 = i789 + 46;
        f5 = i835;
        fl = i834;
        int i836 = i789 + 47;
        f5 = i836;
        gl = i835;
        f5 = i789 + 48;
        hl = i836;
        int i837 = f5;
        int i838 = i837 + 1;
        f5 = i838;
        il = i837;
        int i839 = i837 + 2;
        f5 = i839;
        jl = i838;
        int i840 = i837 + 3;
        f5 = i840;
        kl = i839;
        int i841 = i837 + 4;
        f5 = i841;
        ll = i840;
        int i842 = i837 + 5;
        f5 = i842;
        ml = i841;
        int i843 = i837 + 6;
        f5 = i843;
        nl = i842;
        int i844 = i837 + 7;
        f5 = i844;
        ol = i843;
        int i845 = i837 + 8;
        f5 = i845;
        pl = i844;
        int i846 = i837 + 9;
        f5 = i846;
        ql = i845;
        int i847 = i837 + 10;
        f5 = i847;
        rl = i846;
        int i848 = i837 + 11;
        f5 = i848;
        sl = i847;
        int i849 = i837 + 12;
        f5 = i849;
        tl = i848;
        int i850 = i837 + 13;
        f5 = i850;
        ul = i849;
        vl = new int[]{i839};
        int i851 = i837 + 14;
        f5 = i851;
        wl = i850;
        int i852 = i837 + 15;
        f5 = i852;
        xl = i851;
        int i853 = i837 + 16;
        f5 = i853;
        yl = i852;
        int i854 = i837 + 17;
        f5 = i854;
        zl = i853;
        int i855 = i837 + 18;
        f5 = i855;
        Al = i854;
        int i856 = i837 + 19;
        f5 = i856;
        Bl = i855;
        int i857 = i837 + 20;
        f5 = i857;
        Cl = i856;
        int i858 = i837 + 21;
        f5 = i858;
        Dl = i857;
        int i859 = i837 + 22;
        f5 = i859;
        El = i858;
        int i860 = i837 + 23;
        f5 = i860;
        Fl = i859;
        int i861 = i837 + 24;
        f5 = i861;
        Gl = i860;
        int i862 = i837 + 25;
        f5 = i862;
        Hl = i861;
        int i863 = i837 + 26;
        f5 = i863;
        Il = i862;
        int i864 = i837 + 27;
        f5 = i864;
        Jl = i863;
        int i865 = i837 + 28;
        f5 = i865;
        Kl = i864;
        int i866 = i837 + 29;
        f5 = i866;
        Ll = i865;
        int i867 = i837 + 30;
        f5 = i867;
        Ml = i866;
        int i868 = i837 + 31;
        f5 = i868;
        Nl = i867;
        int i869 = i837 + 32;
        f5 = i869;
        Ol = i868;
        int i870 = i837 + 33;
        f5 = i870;
        Pl = i869;
        int i871 = i837 + 34;
        f5 = i871;
        Ql = i870;
        int i872 = i837 + 35;
        f5 = i872;
        Rl = i871;
        int i873 = i837 + 36;
        f5 = i873;
        Sl = i872;
        int i874 = i837 + 37;
        f5 = i874;
        Tl = i873;
        int i875 = i837 + 38;
        f5 = i875;
        Ul = i874;
        int i876 = i837 + 39;
        f5 = i876;
        Vl = i875;
        int i877 = i837 + 40;
        f5 = i877;
        Wl = i876;
        int i878 = i837 + 41;
        f5 = i878;
        Xl = i877;
        int i879 = i837 + 42;
        f5 = i879;
        Yl = i878;
        f5 = i837 + 43;
        Zl = i879;
        am = new HashMap();
        bm = new HashMap();
        cm = new HashMap();
        dm = new HashMap();
        SparseIntArray sparseIntArray = new SparseIntArray();
        fm = sparseIntArray;
        gm = new HashSet();
        lm = new ThreadLocal();
        mm = new ThreadLocal();
        nm = new ThreadLocal();
        om = new ThreadLocal();
        pm = new ThreadLocal();
        em = u4.b();
        int i880 = d6;
        sparseIntArray.put(i857, i880);
        int i881 = a7;
        sparseIntArray.put(i858, i881);
        sparseIntArray.put(i860, i881);
        sparseIntArray.put(yj, Qi);
        sparseIntArray.put(Aj, q7);
        int i882 = Ci;
        sparseIntArray.put(i859, i882);
        sparseIntArray.put(Di, i882);
        sparseIntArray.put(b6, i881);
        int i883 = c6;
        int i884 = z6;
        sparseIntArray.put(i883, i884);
        sparseIntArray.put(Gd, Ei);
        int i885 = Hd;
        int i886 = Ob;
        sparseIntArray.put(i885, i886);
        sparseIntArray.put(Pb, i886);
        sparseIntArray.put(Zd, be);
        sparseIntArray.put(ae, ce);
        sparseIntArray.put(Ij, Hj);
        sparseIntArray.put(je, ie);
        sparseIntArray.put(lc, kc);
        sparseIntArray.put(xf, Ef);
        sparseIntArray.put(ej, bj);
        sparseIntArray.put(Ki, i882);
        sparseIntArray.put(f7, i884);
        sparseIntArray.put(id, ra);
        sparseIntArray.put(ua, i880);
        sparseIntArray.put(Db, ob);
        sparseIntArray.put(jd, Rc);
        sparseIntArray.put(Eb, pb);
        sparseIntArray.put(M5, i881);
        SparseIntArray sparseIntArray2 = fm;
        sparseIntArray2.put(N5, I9);
        sparseIntArray2.put(Ri, O9);
        sparseIntArray2.put(zi, i881);
        sparseIntArray2.put(oa, ka);
        sparseIntArray2.put(T8, n6);
        int i887 = u6;
        int i888 = I6;
        sparseIntArray2.put(i887, i888);
        sparseIntArray2.put(v6, i888);
        sparseIntArray2.put(tj, eg);
        int i889 = uj;
        int i890 = dg;
        sparseIntArray2.put(i889, i890);
        sparseIntArray2.put(vj, i890);
        int i891 = e6;
        int i892 = d6;
        sparseIntArray2.put(i891, i892);
        sparseIntArray2.put(f6, i892);
        sparseIntArray2.put(O6, M6);
        sparseIntArray2.put(P6, N6);
        sparseIntArray2.put(Q6, i892);
        sparseIntArray2.put(R6, i892);
        sparseIntArray2.put(g6, i892);
        sparseIntArray2.put(H7, B7);
        sparseIntArray2.put(I7, C7);
        int i893 = S6;
        int i894 = i6;
        sparseIntArray2.put(i893, i894);
        sparseIntArray2.put(T6, i894);
        sparseIntArray2.put(j6, i894);
        int i895 = Cf;
        int i896 = Bf;
        sparseIntArray2.put(i895, i896);
        sparseIntArray2.put(yf, i896);
        sparseIntArray2.put(Jf, q6);
        sparseIntArray2.put(Ff, Df);
        int i897 = wj;
        int i898 = Ef;
        sparseIntArray2.put(i897, i898);
        sparseIntArray2.put(xj, Ej);
        sparseIntArray2.put(O5, i898);
        sparseIntArray2.put(P5, i896);
        sparseIntArray2.put(Q5, i896);
        SparseIntArray sparseIntArray3 = fm;
        int i899 = R5;
        int i900 = G6;
        sparseIntArray3.put(i899, i900);
        sparseIntArray3.put(lb, lf);
        sparseIntArray3.put(mb, i900);
        int i901 = S5;
        int i902 = B5;
        sparseIntArray3.put(i901, i902);
        sparseIntArray3.put(T5, i902);
        sparseIntArray3.put(U5, C5);
        sparseIntArray3.put(V5, zf);
        sparseIntArray3.put(M8, s8);
        int i903 = N8;
        int i904 = t8;
        sparseIntArray3.put(i903, i904);
        sparseIntArray3.put(O8, v8);
        sparseIntArray3.put(P8, i900);
        sparseIntArray3.put(Q8, C8);
        sparseIntArray3.put(R8, D8);
        int i905 = i9;
        int i906 = g9;
        sparseIntArray3.put(i905, i906);
        int i907 = m9;
        int i908 = k9;
        sparseIntArray3.put(i907, i908);
        sparseIntArray3.put(Y8, X8);
        sparseIntArray3.put(l9, i908);
        sparseIntArray3.put(n9, i908);
        sparseIntArray3.put(h9, i906);
        int i909 = M7;
        int i910 = V8;
        sparseIntArray3.put(i909, i910);
        int i911 = c9;
        int i912 = P9;
        sparseIntArray3.put(i911, i912);
        sparseIntArray3.put(d9, i910);
        int i913 = e9;
        int i914 = O9;
        sparseIntArray3.put(i913, i914);
        sparseIntArray3.put(f9, i914);
        sparseIntArray3.put(F8, J5);
        sparseIntArray3.put(j7, i910);
        int i915 = pa;
        int i916 = B8;
        sparseIntArray3.put(i915, i916);
        int i917 = qa;
        int i918 = rj;
        sparseIntArray3.put(i917, i918);
        sparseIntArray3.put(wb, i918);
        int i919 = I8;
        int i920 = A8;
        sparseIntArray3.put(i919, i920);
        SparseIntArray sparseIntArray4 = fm;
        sparseIntArray4.put(J8, i916);
        sparseIntArray4.put(K8, i920);
        sparseIntArray4.put(L8, i904);
        sparseIntArray4.put(pi, h8);
        sparseIntArray4.put(M9, e8);
        sparseIntArray4.put(Ac, ze);
        sparseIntArray4.put(H8, a7);
        int i921 = aa;
        int i922 = j5;
        sparseIntArray4.put(i921, i922);
        sparseIntArray4.put(ba, td);
        sparseIntArray4.put(ca, i922);
        sparseIntArray4.put(da, c7);
        sparseIntArray4.put(S8, s8);
        sparseIntArray4.put(v9, u9);
        sparseIntArray4.put(zb, xb);
        sparseIntArray4.put(Ab, yb);
        sparseIntArray4.put(R9, i910);
        sparseIntArray4.put(S9, i912);
        sparseIntArray4.put(N7, K7);
        sparseIntArray4.put(Fi, Ei);
        int i923 = W5;
        int i924 = Gj;
        sparseIntArray4.put(i923, i924);
        sparseIntArray4.put(X5, i924);
        sparseIntArray4.put(ij, i922);
        int i925 = jj;
        int i926 = t6;
        sparseIntArray4.put(i925, i926);
        sparseIntArray4.put(kj, h5);
        sparseIntArray4.put(lj, i5);
        sparseIntArray4.put(cj, i926);
        sparseIntArray4.put(fj, w6);
        int i927 = Jc;
        int i928 = Ae;
        sparseIntArray4.put(i927, i928);
        sparseIntArray4.put(ig, i928);
        int i929 = jg;
        sparseIntArray4.put(i929, Ke);
        SparseIntArray sparseIntArray5 = fm;
        sparseIntArray5.put(Kc, i929);
        int i930 = ea;
        int i931 = na;
        sparseIntArray5.put(i930, i931);
        sparseIntArray5.put(fa, i931);
        int i932 = ga;
        int i933 = ka;
        sparseIntArray5.put(i932, i933);
        sparseIntArray5.put(ha, i933);
        sparseIntArray5.put(ng, S5);
        sparseIntArray5.put(W9, B5);
        sparseIntArray5.put(o7, m6);
        sparseIntArray5.put(si, y6);
        int i934 = ti;
        int i935 = L6;
        sparseIntArray5.put(i934, i935);
        sparseIntArray5.put(ui, i935);
        sparseIntArray5.put(vi, i6);
        sparseIntArray5.put(ma, la);
        int i936 = Dd;
        int i937 = l8;
        sparseIntArray5.put(i936, i937);
        sparseIntArray5.put(Nc, i937);
        sparseIntArray5.put(cc, gc);
        sparseIntArray5.put(dc, bc);
        int i938 = z7;
        int i939 = d6;
        sparseIntArray5.put(i938, i939);
        int i940 = Y5;
        int i941 = O7;
        sparseIntArray5.put(i940, i941);
        sparseIntArray5.put(qk, We);
        sparseIntArray5.put(Gc, Bc);
        sparseIntArray5.put(vk, ob);
        sparseIntArray5.put(wk, Tc);
        int i942 = sk;
        sparseIntArray5.put(i942, yd);
        sparseIntArray5.put(rk, Lb);
        sparseIntArray5.put(tk, i939);
        sparseIntArray5.put(uk, i939);
        sparseIntArray5.put(Z5, Xh);
        SparseIntArray sparseIntArray6 = fm;
        sparseIntArray6.put(Rk, U8);
        sparseIntArray6.put(Sk, g9);
        sparseIntArray6.put(L7, K7);
        sparseIntArray6.put(V7, i941);
        sparseIntArray6.put(W7, P7);
        sparseIntArray6.put(X7, Q7);
        sparseIntArray6.put(Y7, R7);
        sparseIntArray6.put(Z7, S7);
        sparseIntArray6.put(a8, T7);
        sparseIntArray6.put(b8, U7);
        sparseIntArray6.put(r9, q9);
        sparseIntArray6.put(bk, lk);
        sparseIntArray6.put(Vj, hk);
        sparseIntArray6.put(Xj, kk);
        sparseIntArray6.put(Zj, gk);
        sparseIntArray6.put(Yj, mk);
        int i943 = dk;
        int i944 = nk;
        sparseIntArray6.put(i943, i944);
        sparseIntArray6.put(ck, i944);
        sparseIntArray6.put(ek, ok);
        int i945 = ib;
        int i946 = a7;
        sparseIntArray6.put(i945, i946);
        sparseIntArray6.put(jb, i942);
        int i947 = di;
        sparseIntArray6.put(i947, e7);
        int i948 = ei;
        int i949 = d7;
        sparseIntArray6.put(i948, i949);
        sparseIntArray6.put(fl, i947);
        int i950 = gl;
        int i951 = el;
        sparseIntArray6.put(i950, i951);
        sparseIntArray6.put(hl, i948);
        sparseIntArray6.put(il, i948);
        sparseIntArray6.put(ml, i951);
        SparseIntArray sparseIntArray7 = fm;
        int i952 = Jl;
        int i953 = G6;
        sparseIntArray7.put(i952, i953);
        sparseIntArray7.put(Il, i946);
        sparseIntArray7.put(Hl, i953);
        sparseIntArray7.put(Kl, Le);
        sparseIntArray7.put(Ll, Ie);
        int i954 = Ml;
        int i955 = h5;
        sparseIntArray7.put(i954, i955);
        sparseIntArray7.put(Nl, i955);
        int i956 = Ol;
        int i957 = Me;
        sparseIntArray7.put(i956, i957);
        sparseIntArray7.put(Pl, i957);
        sparseIntArray7.put(Ql, i953);
        sparseIntArray7.put(A8, i953);
        sparseIntArray7.put(Ul, i953);
        sparseIntArray7.put(ji, i953);
        sparseIntArray7.put(Vl, i957);
        int i958 = Wl;
        sparseIntArray7.put(i958, q6);
        sparseIntArray7.put(Xl, i5);
        sparseIntArray7.put(Yl, i949);
        sparseIntArray7.put(Zl, ik);
        sparseIntArray7.put(qg, Sc);
        int i959 = rg;
        int i960 = Ci;
        sparseIntArray7.put(i959, i960);
        int i961 = sg;
        int i962 = Ei;
        sparseIntArray7.put(i961, i962);
        int i963 = tg;
        int i964 = Gi;
        sparseIntArray7.put(i963, i964);
        int i965 = wg;
        int i966 = i8;
        sparseIntArray7.put(i965, i966);
        int i967 = zg;
        int i968 = l8;
        sparseIntArray7.put(i967, i968);
        sparseIntArray7.put(Cg, i958);
        sparseIntArray7.put(Fg, Tc);
        sparseIntArray7.put(Gg, i960);
        sparseIntArray7.put(Hg, i962);
        sparseIntArray7.put(Ig, i964);
        sparseIntArray7.put(Lg, i966);
        sparseIntArray7.put(Og, i968);
        sparseIntArray7.put(Rg, i958);
        int i969 = 0;
        while (true) {
            int[] iArr = p8;
            if (i969 >= iArr.length) {
                break;
            }
            gm.add(Integer.valueOf(iArr[i969]));
            i969++;
        }
        int i970 = 0;
        while (true) {
            int[] iArr2 = q8;
            if (i970 >= iArr2.length) {
                break;
            }
            gm.add(Integer.valueOf(iArr2[i970]));
            i970++;
        }
        int i971 = 0;
        while (true) {
            int[] iArr3 = r8;
            if (i971 >= iArr3.length) {
                break;
            }
            gm.add(Integer.valueOf(iArr3[i971]));
            i971++;
        }
        int i972 = 0;
        while (true) {
            int[] iArr4 = pk;
            if (i972 >= iArr4.length) {
                break;
            }
            gm.add(Integer.valueOf(iArr4[i972]));
            i972++;
        }
        HashSet hashSet = gm;
        hashSet.add(Integer.valueOf(ja));
        hashSet.add(Integer.valueOf(Vj));
        hashSet.add(Integer.valueOf(Wj));
        hashSet.add(Integer.valueOf(Xj));
        hashSet.add(Integer.valueOf(Yj));
        hashSet.add(Integer.valueOf(Zj));
        hashSet.add(Integer.valueOf(ak));
        hashSet.add(Integer.valueOf(bk));
        hashSet.add(Integer.valueOf(ck));
        hashSet.add(Integer.valueOf(dl));
        hashSet.add(Integer.valueOf(fl));
        hashSet.add(Integer.valueOf(gl));
        hashSet.add(Integer.valueOf(hl));
        hashSet.add(Integer.valueOf(il));
        hashSet.add(Integer.valueOf(jl));
        hashSet.add(Integer.valueOf(ll));
        hashSet.add(Integer.valueOf(ml));
        hashSet.add(Integer.valueOf(nl));
        hashSet.add(Integer.valueOf(ol));
        hashSet.add(Integer.valueOf(pl));
        hashSet.add(Integer.valueOf(ql));
        hashSet.add(Integer.valueOf(rl));
        hashSet.add(Integer.valueOf(sl));
        hashSet.add(Integer.valueOf(tl));
        hashSet.add(Integer.valueOf(ul));
        hashSet.add(Integer.valueOf(kh));
        hashSet.add(Integer.valueOf(th));
        hashSet.add(Integer.valueOf(uh));
        hashSet.add(Integer.valueOf(vh));
        hashSet.add(Integer.valueOf(Gh));
        hashSet.add(Integer.valueOf(Eh));
        hashSet.add(Integer.valueOf(Fh));
        hashSet.add(Integer.valueOf(jh));
        hashSet.add(Integer.valueOf(Dh));
        hashSet.add(Integer.valueOf(lh));
        hashSet.add(Integer.valueOf(mh));
        hashSet.add(Integer.valueOf(nh));
        hashSet.add(Integer.valueOf(oh));
        hashSet.add(Integer.valueOf(ph));
        hashSet.add(Integer.valueOf(qh));
        hashSet.add(Integer.valueOf(rh));
        hashSet.add(Integer.valueOf(sh));
        hashSet.add(Integer.valueOf(Ch));
        hashSet.add(Integer.valueOf(yh));
        hashSet.add(Integer.valueOf(zh));
        hashSet.add(Integer.valueOf(Ah));
        hashSet.add(Integer.valueOf(Bh));
        hashSet.add(Integer.valueOf(wh));
        hashSet.add(Integer.valueOf(xh));
        HashSet hashSet2 = gm;
        hashSet2.add(Integer.valueOf(Xg));
        hashSet2.add(Integer.valueOf(Yg));
        hashSet2.add(Integer.valueOf(Zg));
        hashSet2.add(Integer.valueOf(ah));
        hashSet2.add(Integer.valueOf(Ug));
        hashSet2.add(Integer.valueOf(Vg));
        hashSet2.add(Integer.valueOf(Wg));
        hashSet2.add(Integer.valueOf(gh));
        hashSet2.add(Integer.valueOf(fh));
        hashSet2.add(Integer.valueOf(ch));
        hashSet2.add(Integer.valueOf(bh));
        hashSet2.add(Integer.valueOf(hh));
        hashSet2.add(Integer.valueOf(dh));
        hashSet2.add(Integer.valueOf(eh));
        hashSet2.add(Integer.valueOf(Sg));
        hashSet2.add(Integer.valueOf(Tg));
        hashSet2.add(Integer.valueOf(ih));
        hashSet2.add(Integer.valueOf(Hh));
        hashSet2.add(Integer.valueOf(Ih));
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
        hashSet2.add(Integer.valueOf(yk));
        hashSet2.add(Integer.valueOf(zk));
        hashSet2.add(Integer.valueOf(Ak));
        hashSet2.add(Integer.valueOf(Bk));
        hashSet2.add(Integer.valueOf(Ck));
        hashSet2.add(Integer.valueOf(Dk));
        hashSet2.add(Integer.valueOf(Ek));
        hashSet2.add(Integer.valueOf(Fk));
        hashSet2.add(Integer.valueOf(Gk));
        hashSet2.add(Integer.valueOf(Ik));
        HashSet hashSet3 = gm;
        hashSet3.add(Integer.valueOf(Jk));
        hashSet3.add(Integer.valueOf(Kk));
        hashSet3.add(Integer.valueOf(Vk));
        hashSet3.add(Integer.valueOf(Wk));
        hashSet3.add(Integer.valueOf(Xk));
        hashSet3.add(Integer.valueOf(Yk));
        hashSet3.add(Integer.valueOf(Zk));
        hashSet3.add(Integer.valueOf(al));
        ArrayList arrayList = new ArrayList();
        F = arrayList;
        G = new ArrayList();
        HashMap hashMap = new HashMap();
        H = hashMap;
        hm = new SparseIntArray();
        im = new SparseIntArray();
        SharedPreferences sharedPreferences = org.telegram.messenger.t0.b.getSharedPreferences("themeconfig", 0);
        j6 j6Var6 = new j6();
        j6Var6.a = "Blue";
        j6Var6.d = "bluebubbles.attheme";
        j6Var6.M = -6963476;
        j6Var6.R = -1;
        j6Var6.S = -3086593;
        j6Var6.T = true;
        j6Var6.Z = n;
        j6Var6.W = 1;
        j6.b(j6Var6, new int[]{-10972987, -14444461, -3252606, -8428605, -14380627, -14050257, -7842636, -13464881, -12342073, -11359164, -3317869, -2981834, -8165684, -3256745, -2904512, -8681301}, new int[]{-4660851, -328756, -1572, -4108434, -3031781, -1335, -198952, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{0, -853047, -264993, 0, 0, -135756, -198730, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{0, -2104672, -937328, -2637335, -2639714, -1270157, -3428124, -6570777, -7223828, -6567550, -1793599, -1855875, -4674838, -1336199, -2900876, -6247730}, new int[]{0, -4532067, -1257580, -1524266, -1646910, -1519483, -1324823, -4138509, -4202516, -2040429, -1458474, -1256030, -3814930, -1000039, -1450082, -3485987}, new int[]{0, -1909081, -1592444, -2969879, -2439762, -1137033, -2119471, -6962197, -4857383, -4270699, -3364639, -2117514, -5000734, -1598028, -2045813, -5853742}, new int[]{0, -6371440, -1319256, -1258616, -1712961, -1186647, -1193816, -4467224, -4203544, -3023977, -1061929, -1255788, -2113811, -806526, -1715305, -3485976}, new int[]{99, 9, 10, 11, 12, 13, 14, 0, 1, 2, 3, 4, 5, 6, 7, 8}, new String[]{"", "p-pXcflrmFIBAAAAvXYQk-mCwZU", "JqSUrO0-mFIBAAAAWwTvLzoWGQI", "O-wmAfBPSFADAAAA4zINVfD_bro", "RepJ5uE_SVABAAAAr4d0YhgB850", "-Xc-np9y2VMCAAAARKr0yNNPYW0", "fqv01SQemVIBAAAApND8LDRUhRU", "fqv01SQemVIBAAAApND8LDRUhRU", "RepJ5uE_SVABAAAAr4d0YhgB850", "lp0prF8ISFAEAAAA_p385_CvG0w", "heptcj-hSVACAAAAC9RrMzOa-cs", "PllZ-bf_SFAEAAAA8crRfwZiDNg", "dhf9pceaQVACAAAAbzdVo4SCiZA", "Ujx2TFcJSVACAAAARJ4vLa50MkM", "p-pXcflrmFIBAAAAvXYQk-mCwZU", "dk_wwlghOFACAAAAfz9xrxi6euw"}, new int[]{0, hs.K2, 45, 0, 45, hs.K2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{0, 52, 46, 57, 45, 64, 52, 35, 36, 41, 50, 50, 35, 38, 37, 30});
        J1(j6Var6);
        L = j6Var6;
        K = j6Var6;
        arrayList.add(j6Var6);
        hashMap.put("Blue", j6Var6);
        j6 j6Var7 = new j6();
        j6Var7.a = "Dark Blue";
        j6Var7.d = "darkblue.attheme";
        j6Var7.M = -10523006;
        j6Var7.R = -9009508;
        j6Var7.S = -8214301;
        j6Var7.W = 3;
        j6.b(j6Var7, new int[]{-7177260, -9860357, -14440464, -8687151, -9848491, -14053142, -9403671, -10044691, -13203974, -12138259, -10179489, -1344335, -1142742, -6127120, -2931932, -1131212, -8417365, -13270557}, new int[]{-6464359, -10267323, -13532789, -5413850, -11898828, -13410942, -13215889, -10914461, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{-10465880, -9937588, -14983040, -6736562, -14197445, -13534568, -13144441, -10587280, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{-14213586, -15263198, -16310753, -15724781, -15853551, -16051428, -14868183, -14668758, -15854566, -15326427, -15327979, -14411490, -14345453, -14738135, -14543346, -14212843, -15263205, -15854566}, new int[]{-15659501, -14277074, -15459034, -14542297, -14735336, -15129808, -15591910, -15459810, -15260623, -15853800, -15259879, -14477540, -14674936, -15461604, -13820650, -15067635, -14605528, -15260623}, new int[]{-13951445, -15395557, -15985382, -15855853, -16050417, -15525854, -15260627, -15327189, -15788258, -14799314, -15458796, -13952727, -13754603, -14081231, -14478324, -14081004, -15197667, -15788258}, new int[]{-15330777, -15066858, -15915220, -14213847, -15262439, -15260879, -15657695, -16443625, -15459285, -15589601, -14932454, -14740451, -15002870, -15264997, -13821660, -14805234, -14605784, -15459285}, new int[]{11, 12, 13, 14, 15, 16, 17, 18, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, new String[]{"O-wmAfBPSFADAAAA4zINVfD_bro", "RepJ5uE_SVABAAAAr4d0YhgB850", "dk_wwlghOFACAAAAfz9xrxi6euw", "9LW_RcoOSVACAAAAFTk3DTyXN-M", "PllZ-bf_SFAEAAAA8crRfwZiDNg", "-Xc-np9y2VMCAAAARKr0yNNPYW0", "kO4jyq55SFABAAAA0WEpcLfahXk", "CJNyxPMgSVAEAAAAvW9sMwc51cw", "fqv01SQemVIBAAAApND8LDRUhRU", "RepJ5uE_SVABAAAAr4d0YhgB850", "CJNyxPMgSVAEAAAAvW9sMwc51cw", "9LW_RcoOSVACAAAAFTk3DTyXN-M", "9GcNVISdSVADAAAAUcw5BYjELW4", "F5oWoCs7QFACAAAAgf2bD_mg8Bw", "9ShF73d1MFIIAAAAjWnm8_ZMe8Q", "3rX-PaKbSFACAAAAEiHNvcEm6X4", "dk_wwlghOFACAAAAfz9xrxi6euw", "fqv01SQemVIBAAAApND8LDRUhRU"}, new int[]{hs.C3, 45, hs.C3, hs.R1, 45, hs.C3, 45, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{40, 40, 31, 50, 25, 34, 35, 35, 38, 29, 24, 34, 34, 31, 29, 37, 21, 38});
        J1(j6Var7);
        arrayList.add(j6Var7);
        J = j6Var7;
        hashMap.put("Dark Blue", j6Var7);
        j6 j6Var8 = new j6();
        j6Var8.a = "Arctic Blue";
        j6Var8.d = "arctic.attheme";
        j6Var8.M = -1971728;
        j6Var8.R = -1;
        j6Var8.S = -9657877;
        j6Var8.W = 5;
        j6.b(j6Var8, new int[]{-12537374, -12472227, -3240928, -11033621, -2194124, -3382903, -13332245, -12342073, -11359164, -3317869, -2981834, -8165684, -3256745, -2904512, -8681301}, new int[]{-13525046, -14113959, -7579073, -13597229, -3581840, -8883763, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{-11616542, -9716647, -6400452, -12008744, -2592697, -4297041, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{-3808528, -2433367, -2700891, -1838093, -1120848, -1712148, -2037779, -4202261, -4005713, -1058332, -925763, -1975316, -1189672, -1318451, -2302235}, new int[]{-1510157, -4398164, -1647697, -3610898, -1130838, -1980692, -4270093, -4202261, -3415654, -1259815, -1521765, -4341268, -1127744, -1318219, -3945761}, new int[]{-4924688, -3283031, -1523567, -2494477, -1126510, -595210, -2037517, -3478548, -4661623, -927514, -796762, -2696971, -1188403, -1319735, -1577487}, new int[]{-3149585, -5714021, -1978209, -4925720, -1134713, -1718833, -3613709, -5317397, -3218014, -999207, -2116466, -4343054, -931397, -1583186, -3815718}, new int[]{9, 10, 11, 12, 13, 14, 0, 1, 2, 3, 4, 5, 6, 7, 8}, new String[]{"MIo6r0qGSFAFAAAAtL8TsDzNX60", "dhf9pceaQVACAAAAbzdVo4SCiZA", "fqv01SQemVIBAAAApND8LDRUhRU", "p-pXcflrmFIBAAAAvXYQk-mCwZU", "JqSUrO0-mFIBAAAAWwTvLzoWGQI", "F5oWoCs7QFACAAAAgf2bD_mg8Bw", "fqv01SQemVIBAAAApND8LDRUhRU", "RepJ5uE_SVABAAAAr4d0YhgB850", "PllZ-bf_SFAEAAAA8crRfwZiDNg", "pgJfpFNRSFABAAAACDT8s5sEjfc", "ptuUd96JSFACAAAATobI23sPpz0", "dhf9pceaQVACAAAAbzdVo4SCiZA", "JqSUrO0-mFIBAAAAWwTvLzoWGQI", "9iklpvIPQVABAAAAORQXKur_Eyc", "F5oWoCs7QFACAAAAgf2bD_mg8Bw"}, new int[]{hs.m5, hs.m5, hs.C3, hs.m5, 0, hs.K2, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{50, 50, 58, 47, 46, 50, 49, 46, 51, 50, 49, 34, 54, 50, 40});
        J1(j6Var8);
        arrayList.add(j6Var8);
        hashMap.put("Arctic Blue", j6Var8);
        j6 j6Var9 = new j6();
        j6Var9.a = "Day";
        j6Var9.d = "day.attheme";
        j6Var9.M = -1;
        j6Var9.R = -1315084;
        j6Var9.S = -8604930;
        j6Var9.W = 2;
        j6.b(j6Var9, new int[]{-11099447, -3379581, -3109305, -3382174, -7963438, -11759137, -11029287, -11226775, -2506945, -3382174, -3379581, -6587438, -2649788, -8681301}, new int[]{-10125092, -9671214, -3451775, -3978678, -10711329, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{-12664362, -3642988, -2383569, -3109317, -11422261, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, null, null, new int[]{9, 10, 11, 12, 13, 0, 1, 2, 3, 4, 5, 6, 7, 8}, new String[]{"", "", "", "", "", "", "", "", "", "", "", "", "", ""}, new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
        J1(j6Var9);
        arrayList.add(j6Var9);
        hashMap.put("Day", j6Var9);
        j6 j6Var10 = new j6();
        j6Var10.a = "Night";
        j6Var10.d = "night.attheme";
        j6Var10.M = -11315623;
        j6Var10.R = -9143676;
        j6Var10.S = -9067802;
        j6Var10.W = 4;
        j6.b(j6Var10, new int[]{-9781697, -7505693, -2204034, -10913816, -2375398, -12678921, -11881005, -11880383, -2534026, -1934037, -7115558, -3128522, -1528292, -8812381}, new int[]{-7712108, -4953061, -5288081, -14258547, -9154889, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{-9939525, -5948598, -10335844, -13659747, -14054507, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{-15330532, -14806760, -15791344, -16184308, -16313063, -15921641, -15656164, -15986420, -15856883, -14871025, -16185078, -14937584, -14869736, -15855598}, new int[]{-14673881, -15724781, -15002342, -15458526, -15987697, -16184820, -16118258, -16250616, -15067624, -15527923, -14804447, -15790836, -15987960, -16316665}, new int[]{-15856877, -14608861, -15528430, -15921391, -15722209, -15197144, -15458015, -15591406, -15528431, -15068401, -16053749, -15594229, -15395825, -15724012}, new int[]{-14804694, -15658986, -14609382, -15656421, -16118509, -15855854, -16315381, -16052981, -14544354, -15791092, -15659241, -16316922, -15988214, -16185077}, new int[]{9, 10, 11, 12, 13, 0, 1, 2, 3, 4, 5, 6, 7, 8}, new String[]{"YIxYGEALQVADAAAAA3QbEH0AowY", "9LW_RcoOSVACAAAAFTk3DTyXN-M", "O-wmAfBPSFADAAAA4zINVfD_bro", "F5oWoCs7QFACAAAAgf2bD_mg8Bw", "-Xc-np9y2VMCAAAARKr0yNNPYW0", "fqv01SQemVIBAAAApND8LDRUhRU", "F5oWoCs7QFACAAAAgf2bD_mg8Bw", "ptuUd96JSFACAAAATobI23sPpz0", "p-pXcflrmFIBAAAAvXYQk-mCwZU", "Nl8Pg2rBQVACAAAA25Lxtb8SDp0", "dhf9pceaQVACAAAAbzdVo4SCiZA", "9GcNVISdSVADAAAAUcw5BYjELW4", "9LW_RcoOSVACAAAAFTk3DTyXN-M", "dk_wwlghOFACAAAAfz9xrxi6euw"}, new int[]{45, hs.R1, 0, hs.K2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{34, 47, 52, 48, 54, 50, 37, 56, 48, 49, 40, 64, 38, 48});
        J1(j6Var10);
        arrayList.add(j6Var10);
        hashMap.put("Night", j6Var10);
        String str = null;
        String string = sharedPreferences.getString("themes2", null);
        if (sharedPreferences.getInt("remote_version", 0) == 1) {
            int i973 = 0;
            while (i973 < 4) {
                long[] jArr = E;
                StringBuilder sb2 = new StringBuilder("2remoteThemesHash");
                sb2.append(i973 != 0 ? Integer.valueOf(i973) : "");
                jArr[i973] = sharedPreferences.getLong(sb2.toString(), 0L);
                int[] iArr5 = D;
                StringBuilder sb3 = new StringBuilder("lastLoadingThemesTime");
                sb3.append(i973 != 0 ? Integer.valueOf(i973) : "");
                iArr5[i973] = sharedPreferences.getInt(sb3.toString(), 0);
                i973++;
            }
        }
        sharedPreferences.edit().putInt("remote_version", 1).apply();
        if (TextUtils.isEmpty(string)) {
            String string2 = sharedPreferences.getString("themes", null);
            if (!TextUtils.isEmpty(string2)) {
                for (String str2 : string2.split("&")) {
                    j6 h10 = j6.h(str2);
                    if (h10 != null) {
                        G.add(h10);
                        F.add(h10);
                        H.put(h10.m(), h10);
                    }
                }
                y1(true, true);
                sharedPreferences.edit().remove("themes").commit();
            }
        } else {
            try {
                JSONArray jSONArray = new JSONArray(string);
                for (int i974 = 0; i974 < jSONArray.length(); i974++) {
                    j6 g10 = j6.g(jSONArray.getJSONObject(i974));
                    if (g10 != null) {
                        G.add(g10);
                        F.add(g10);
                        H.put(g10.m(), g10);
                        j6.c(g10, sharedPreferences);
                    }
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.f(e10);
            }
        }
        Collections.sort(F, new tq(15));
        SharedPreferences e12 = hp.e1();
        try {
            HashMap hashMap2 = H;
            j6 j6Var11 = (j6) hashMap2.get("Dark Blue");
            String string3 = e12.getString("theme", null);
            char c11 = '\t';
            if ("Default".equals(string3)) {
                j6Var = (j6) hashMap2.get("Blue");
                j6Var.Z = n;
            } else if ("Dark".equals(string3)) {
                j6Var11.Z = 9;
                j6Var = j6Var11;
            } else if (string3 != null) {
                j6Var = (j6) hashMap2.get(string3);
                if (j6Var != null && !sharedPreferences.contains("lastDayTheme")) {
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.putString("lastDayTheme", j6Var.m());
                    edit.commit();
                }
            } else {
                j6Var = null;
            }
            String string4 = e12.getString("nighttheme", null);
            if ("Default".equals(string4)) {
                j6Var = (j6) hashMap2.get("Blue");
                j6Var.Z = n;
            } else if ("Dark".equals(string4)) {
                J = j6Var11;
                j6Var11.Z = 9;
            } else if (string4 != null && (j6Var2 = (j6) hashMap2.get(string4)) != null) {
                J = j6Var2;
            }
            if (J != null && !sharedPreferences.contains("lastDarkTheme")) {
                SharedPreferences.Editor edit2 = sharedPreferences.edit();
                edit2.putString("lastDarkTheme", J.m());
                edit2.commit();
            }
            SharedPreferences.Editor editor3 = null;
            SharedPreferences.Editor editor4 = null;
            for (j6 j6Var12 : hashMap2.values()) {
                if (j6Var12.d == null || j6Var12.Y == 0) {
                    i10 = i12;
                    c10 = c11;
                    j6Var4 = j6Var;
                    editor3 = editor3;
                } else {
                    String string5 = sharedPreferences.getString("accents_" + j6Var12.d, str);
                    j6Var12.Z = sharedPreferences.getInt("accent_current_" + j6Var12.d, j6Var12.T ? n : 0);
                    ArrayList arrayList2 = new ArrayList();
                    if (TextUtils.isEmpty(string5)) {
                        editor = editor3;
                        j6Var4 = j6Var;
                        String str3 = "accent_for_" + j6Var12.d;
                        int i975 = e12.getInt(str3, 0);
                        if (i975 != 0) {
                            if (editor == null) {
                                editor3 = e12.edit();
                                editor4 = sharedPreferences.edit();
                            } else {
                                editor3 = editor;
                            }
                            editor3.remove(str3);
                            int size = j6Var12.c0.size();
                            int i976 = 0;
                            while (true) {
                                if (i976 >= size) {
                                    g6 g6Var = new g6();
                                    g6Var.a = 100;
                                    g6Var.c = i975;
                                    g6Var.b = j6Var12;
                                    j6Var12.b0.put(100, g6Var);
                                    arrayList2.add(0, g6Var);
                                    j6Var12.Z = 100;
                                    j6Var12.g0 = 101;
                                    SerializedData serializedData = new SerializedData(72);
                                    c10 = '\t';
                                    serializedData.writeInt32(9);
                                    serializedData.writeInt32(1);
                                    serializedData.writeInt32(g6Var.a);
                                    serializedData.writeInt32(g6Var.c);
                                    serializedData.writeInt32(g6Var.e);
                                    serializedData.writeInt32(g6Var.f);
                                    serializedData.writeInt32(g6Var.g);
                                    serializedData.writeInt32(g6Var.h);
                                    serializedData.writeBool(g6Var.i);
                                    serializedData.writeInt64(g6Var.j);
                                    serializedData.writeInt64(g6Var.k);
                                    serializedData.writeInt64(g6Var.l);
                                    serializedData.writeInt64(g6Var.m);
                                    serializedData.writeInt32(g6Var.n);
                                    serializedData.writeInt64(0L);
                                    serializedData.writeDouble(g6Var.p);
                                    serializedData.writeBool(g6Var.q);
                                    serializedData.writeString(g6Var.o);
                                    serializedData.writeBool(false);
                                    i10 = 3;
                                    editor4.putString("accents_" + j6Var12.d, Base64.encodeToString(serializedData.toByteArray(), 3));
                                    break;
                                }
                                g6 g6Var2 = (g6) j6Var12.c0.get(i976);
                                if (g6Var2.c == i975) {
                                    j6Var12.Z = g6Var2.a;
                                    c10 = '\t';
                                    i10 = 3;
                                    break;
                                }
                                i976++;
                            }
                            editor4.putInt("accent_current_" + j6Var12.d, j6Var12.Z);
                            if (!arrayList2.isEmpty()) {
                                j6Var12.c0.addAll(0, arrayList2);
                                J1(j6Var12);
                            }
                            sparseArray = j6Var12.b0;
                            if (sparseArray != null && sparseArray.get(j6Var12.Z) == null) {
                                j6Var12.Z = !j6Var12.T ? n : 0;
                            }
                            j6.c(j6Var12, sharedPreferences);
                            k10 = j6Var12.k(false);
                            if (k10 == null) {
                                j6Var12.j0 = k10.y;
                            }
                        }
                    } else {
                        try {
                            SerializedData serializedData2 = new SerializedData(Base64.decode(string5, i12));
                            boolean z11 = true;
                            int readInt32 = serializedData2.readInt32(true);
                            int readInt322 = serializedData2.readInt32(true);
                            int i977 = 0;
                            while (i977 < readInt322) {
                                try {
                                    g6 g6Var3 = new g6();
                                    g6Var3.a = serializedData2.readInt32(z11);
                                    g6Var3.c = serializedData2.readInt32(z11);
                                    if (readInt32 >= 9) {
                                        g6Var3.d = serializedData2.readInt32(z11);
                                    }
                                    g6Var3.b = j6Var12;
                                    g6Var3.e = serializedData2.readInt32(true);
                                    g6Var3.f = serializedData2.readInt32(true);
                                    if (readInt32 >= 7) {
                                        g6Var3.g = serializedData2.readInt32(true);
                                        g6Var3.h = serializedData2.readInt32(true);
                                    }
                                    if (readInt32 >= 8) {
                                        z10 = true;
                                        g6Var3.i = serializedData2.readBool(true);
                                    } else {
                                        z10 = true;
                                    }
                                    if (readInt32 >= 3) {
                                        editor2 = editor3;
                                        j6Var5 = j6Var;
                                        g6Var3.j = serializedData2.readInt64(z10);
                                    } else {
                                        editor2 = editor3;
                                        j6Var5 = j6Var;
                                        g6Var3.j = serializedData2.readInt32(z10);
                                    }
                                    if (readInt32 >= 2) {
                                        g6Var3.k = serializedData2.readInt64(z10);
                                    } else {
                                        g6Var3.k = serializedData2.readInt32(z10);
                                    }
                                    ?? r12 = z10;
                                    if (readInt32 >= 6) {
                                        g6Var3.l = serializedData2.readInt64(z10);
                                        g6Var3.m = serializedData2.readInt64(z10);
                                        r12 = 1;
                                    }
                                    if (readInt32 >= r12) {
                                        g6Var3.n = serializedData2.readInt32(r12);
                                    }
                                    if (readInt32 >= 4) {
                                        serializedData2.readInt64(r12);
                                        g6Var3.p = (float) serializedData2.readDouble(r12);
                                        g6Var3.q = serializedData2.readBool(r12);
                                        i11 = 5;
                                        if (readInt32 >= 5) {
                                            g6Var3.o = serializedData2.readString(r12);
                                        }
                                        if (readInt32 >= i11 && serializedData2.readBool(true)) {
                                            g6Var3.t = serializedData2.readInt32(true);
                                            g6Var3.r = TLRPC.Theme.TLdeserialize(serializedData2, serializedData2.readInt32(true), true);
                                        }
                                        tL_theme = g6Var3.r;
                                        if (tL_theme != null) {
                                            g6Var3.z = tL_theme.isDefault;
                                        }
                                        j6Var12.b0.put(g6Var3.a, g6Var3);
                                        tL_theme2 = g6Var3.r;
                                        if (tL_theme2 != null) {
                                            j6Var12.d0.put(tL_theme2.id, g6Var3);
                                        }
                                        arrayList2.add(g6Var3);
                                        j6Var12.g0 = Math.max(j6Var12.g0, g6Var3.a);
                                        i977++;
                                        j6Var = j6Var5;
                                        editor3 = editor2;
                                        z11 = true;
                                    }
                                    i11 = 5;
                                    if (readInt32 >= i11) {
                                        g6Var3.t = serializedData2.readInt32(true);
                                        g6Var3.r = TLRPC.Theme.TLdeserialize(serializedData2, serializedData2.readInt32(true), true);
                                    }
                                    tL_theme = g6Var3.r;
                                    if (tL_theme != null) {
                                    }
                                    j6Var12.b0.put(g6Var3.a, g6Var3);
                                    tL_theme2 = g6Var3.r;
                                    if (tL_theme2 != null) {
                                    }
                                    arrayList2.add(g6Var3);
                                    j6Var12.g0 = Math.max(j6Var12.g0, g6Var3.a);
                                    i977++;
                                    j6Var = j6Var5;
                                    editor3 = editor2;
                                    z11 = true;
                                } finally {
                                    RuntimeException runtimeException = new RuntimeException(th);
                                }
                            }
                            editor = editor3;
                            j6Var4 = j6Var;
                        } finally {
                            org.telegram.messenger.a8.f(th);
                        }
                    }
                    c10 = '\t';
                    i10 = 3;
                    editor3 = editor;
                    if (!arrayList2.isEmpty()) {
                    }
                    sparseArray = j6Var12.b0;
                    if (sparseArray != null) {
                        j6Var12.Z = !j6Var12.T ? n : 0;
                    }
                    j6.c(j6Var12, sharedPreferences);
                    k10 = j6Var12.k(false);
                    if (k10 == null) {
                    }
                }
                j6Var = j6Var4;
                c11 = c10;
                i12 = i10;
                str = null;
            }
            SharedPreferences.Editor editor5 = editor3;
            j6 j6Var13 = j6Var;
            int i978 = i12;
            if (editor5 != null) {
                editor5.commit();
                editor4.commit();
            }
            o = e12.getInt("selectedAutoNightType", Build.VERSION.SDK_INT >= 29 ? i978 : 0);
            p = e12.getBoolean("autoNightScheduleByLocation", false);
            q = e12.getFloat("autoNightBrighnessThreshold", 0.25f);
            r = e12.getInt("autoNightDayStartTime", 1320);
            s = e12.getInt("autoNightDayEndTime", 480);
            t = e12.getInt("autoNightSunsetTime", 1320);
            v = e12.getInt("autoNightSunriseTime", 480);
            w = e12.getString("autoNightCityName", "");
            long j10 = e12.getLong("autoNightLocationLatitude3", 10000L);
            if (j10 != 10000) {
                x = Double.longBitsToDouble(j10);
            } else {
                x = 10000.0d;
            }
            long j11 = e12.getLong("autoNightLocationLongitude3", 10000L);
            if (j11 != 10000) {
                y = Double.longBitsToDouble(j11);
            } else {
                y = 10000.0d;
            }
            u = e12.getInt("autoNightLastSunCheckDay", -1);
            if (j6Var13 == null) {
                j6Var3 = L;
            } else {
                K = j6Var13;
                j6Var3 = j6Var13;
            }
            if (e12.contains("overrideThemeWallpaper") || e12.contains("selectedBackground2")) {
                boolean z12 = e12.getBoolean("overrideThemeWallpaper", false);
                long j12 = e12.getLong("selectedBackground2", 1000001L);
                if (j12 == -1 || (z12 && j12 != -2 && j12 != 1000001)) {
                    b6 b6Var = new b6();
                    b6Var.d = e12.getInt("selectedColor", 0);
                    b6Var.c = e12.getString("selectedBackgroundSlug", "");
                    if (j12 < -100 || j12 > -1 || b6Var.d == 0) {
                        b6Var.a = "wallpaper.jpg";
                        b6Var.b = "wallpaper_original.jpg";
                    } else {
                        b6Var.c = "c";
                        b6Var.a = "";
                        b6Var.b = "";
                    }
                    b6Var.e = e12.getInt("selectedGradientColor", 0);
                    b6Var.f = e12.getInt("selectedGradientColor2", 0);
                    b6Var.g = e12.getInt("selectedGradientColor3", 0);
                    b6Var.h = e12.getInt("selectedGradientRotation", 45);
                    b6Var.i = e12.getBoolean("selectedBackgroundBlurred", false);
                    b6Var.j = e12.getBoolean("selectedBackgroundMotion", false);
                    b6Var.k = e12.getFloat("selectedIntensity", 0.5f);
                    K.v(b6Var);
                    if (o != 0) {
                        J.v(b6Var);
                    }
                }
                e12.edit().remove("overrideThemeWallpaper").remove("selectedBackground2").commit();
            }
            int s12 = s1();
            if (s12 == 2) {
                j6Var3 = J;
            }
            u(j6Var3, false, s12 == 2);
            org.telegram.messenger.g0.h3(new hc(8));
            vm = new o5();
            wm = new int[2];
            Bm = new Paint(1);
            Paint paint = new Paint(1);
            Cm = paint;
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            Paint paint2 = new Paint();
            Dm = paint2;
            paint2.setColor(-65536);
            new Paint().setColor(-16776961);
            new Paint().setColor(1073807104);
            Paint paint3 = new Paint();
            Em = paint3;
            paint3.setColor(-1342112000);
            Paint paint4 = new Paint();
            Fm = paint4;
            paint4.setColor(-65536);
            paint4.setStrokeWidth(2.0f);
            Paint.Style style = Paint.Style.STROKE;
            paint4.setStyle(style);
            Paint paint5 = new Paint();
            Gm = paint5;
            paint5.setColor(-16711936);
            paint5.setStrokeWidth(2.0f);
            paint5.setStyle(style);
        } catch (Exception e11) {
            throw new RuntimeException(e11);
        }
    }

    public static int A(int i10, boolean z10, boolean z11) {
        if (z10 && z11) {
            return r1(0.14f, -1);
        }
        float[] P02 = P0(3);
        Color.colorToHSV(i10, P02);
        if (z10) {
            P02[2] = Math.min(1.0f, P02[2] + 0.14f);
            if (z11) {
                P02[1] = Math.min(1.0f, P02[1] + 0.03f);
            }
        } else {
            P02[2] = Math.max(0.0f, P02[2] - (z11 ? 0.14f : 0.12f));
            if (z11) {
                float f10 = P02[1];
                if (f10 > 0.02f) {
                    P02[1] = Math.min(1.0f, f10 + 0.04f);
                }
            }
        }
        return Color.HSVToColor(Color.alpha(i10), P02);
    }

    public static a8 A0() {
        if (d5 == null) {
            d5 = new a8();
        }
        return d5;
    }

    public static void A1(int i10, int i11, boolean z10) {
        int i12 = s8;
        int i13 = a7;
        int i14 = Ee;
        int i15 = De;
        int i16 = Ce;
        int i17 = Be;
        if (i10 == i17 || i10 == i16 || i10 == i15 || i10 == i14 || i10 == d6 || i10 == i13 || i10 == i12 || i10 == M8) {
            i11 |= -16777216;
        }
        if (z10) {
            im.delete(i10);
        } else {
            im.put(i10, i11);
        }
        if (i10 == vd) {
            h(e0);
            return;
        }
        if (i10 == Zc || i10 == ad) {
            i();
            return;
        }
        if (i10 == i17 || i10 == i16 || i10 == i15 || i10 == i14 || i10 == Fe) {
            u1(true);
            return;
        }
        int i18 = hs.r4;
        if (i10 == i12) {
            hs.e().k(i18, new Object[0]);
        } else {
            if (i10 != i13 || Build.VERSION.SDK_INT < 26) {
                return;
            }
            hs.e().k(i18, new Object[0]);
        }
    }

    public static void B() {
        if (o != 2) {
            if (k) {
                k = false;
                org.telegram.messenger.g0.r(m);
            }
            if (j) {
                j = false;
                org.telegram.messenger.g0.r(l);
            }
            if (g) {
                h = 1.0f;
                e.unregisterListener(vm, f);
                g = false;
                if (org.telegram.messenger.r2.a) {
                    org.telegram.messenger.a8.b("light sensor unregistered");
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        if (r2 <= 31) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0055, code lost:
    
        org.telegram.ui.ActionBar.k6.s1 = org.telegram.messenger.t0.b.getResources().getDrawable(org.telegram.messenger.beta.R.drawable.newyear);
        org.telegram.ui.ActionBar.k6.D1 = -org.telegram.messenger.g0.L(3.0f);
        org.telegram.ui.ActionBar.k6.E1 = -org.telegram.messenger.g0.L(-7.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0053, code lost:
    
        if (r2 == 1) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Drawable B0() {
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
                    boolean z10 = org.telegram.messenger.r2.a;
                    if (i11 >= 31) {
                    }
                }
                if (i10 == 0) {
                }
            }
        }
        return s1;
    }

    public static void B1(Drawable drawable, int i10, boolean z10) {
        if (drawable instanceof xp) {
            Drawable drawable2 = z10 ? ((xp) drawable).b : ((xp) drawable).a;
            if (drawable2 instanceof ColorDrawable) {
                ((ColorDrawable) drawable2).setColor(i10);
            } else {
                drawable2.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
            }
        }
    }

    public static int C(j6 j6Var, int i10, int i11) {
        int i12;
        if (i10 == 0 || (i12 = j6Var.Y) == 0 || i10 == i12 || (j6Var.T && j6Var.Z == n)) {
            return i11;
        }
        float[] P02 = P0(3);
        float[] P03 = P0(4);
        Color.colorToHSV(j6Var.Y, P02);
        Color.colorToHSV(i10, P03);
        return E(P02, P03, i11, j6Var.q(), i11);
    }

    public static String C0() {
        j6 j6Var = J;
        if (j6Var == null) {
            return "";
        }
        String n10 = j6Var.n();
        return n10.toLowerCase().endsWith(".attheme") ? n10.substring(0, n10.lastIndexOf(46)) : n10;
    }

    public static void C1(int i10, Drawable drawable) {
        if (drawable == null) {
            return;
        }
        if (drawable instanceof nu0) {
            ((nu0) drawable).b(i10);
            return;
        }
        if (drawable instanceof sa0) {
            ((sa0) drawable).a(i10);
            return;
        }
        if (drawable instanceof ShapeDrawable) {
            ((ShapeDrawable) drawable).getPaint().setColor(i10);
        } else if (drawable instanceof kk0) {
            ((kk0) drawable).b(i10);
        } else {
            drawable.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
        }
    }

    public static int D(boolean z10, int i10, int i11, int i12, int i13) {
        float[] P02 = P0(3);
        float[] P03 = P0(4);
        Color.colorToHSV(i10, P02);
        Color.colorToHSV(i11, P03);
        return E(P02, P03, i12, z10, i13);
    }

    public static j6 D0() {
        j6 j6Var = K;
        return j6Var != null ? j6Var : L;
    }

    public static void D1(int i10, Drawable drawable) {
        C1(x0(null, i10, false), drawable);
    }

    public static int E(float[] fArr, float[] fArr2, int i10, boolean z10, int i11) {
        if (um == null) {
            um = new float[3];
        }
        float[] fArr3 = um;
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
        float B10 = org.telegram.messenger.g0.B(i10);
        float B11 = org.telegram.messenger.g0.B(HSVToColor);
        if (z10) {
            if (B10 <= B11) {
                return HSVToColor;
            }
        } else if (B10 >= B11) {
            return HSVToColor;
        }
        float e10 = a1.g.e(0.39999998f, B10, B11, 0.6f);
        int red = (int) (Color.red(HSVToColor) * e10);
        int green = (int) (Color.green(HSVToColor) * e10);
        int blue = (int) (Color.blue(HSVToColor) * e10);
        return Color.argb(Color.alpha(HSVToColor), red < 0 ? 0 : Math.min(red, hs.e4), green < 0 ? 0 : Math.min(green, hs.e4), blue >= 0 ? Math.min(blue, hs.e4) : 0);
    }

    public static int E0(int i10) {
        int indexOfKey = hm.indexOfKey(i10);
        if (indexOfKey < 0) {
            return 0;
        }
        int valueAt = hm.valueAt(indexOfKey);
        g6 k10 = I.k(false);
        if (k10 == null) {
            return 0;
        }
        float[] P02 = P0(1);
        float[] P03 = P0(2);
        Color.colorToHSV(I.Y, P02);
        Color.colorToHSV(k10.c, P03);
        return E(P02, P03, valueAt, I.q(), valueAt);
    }

    public static void E1(Drawable drawable, int i10, boolean z10) {
        if (drawable instanceof StateListDrawable) {
            try {
                Drawable O02 = z10 ? O0(0, drawable) : O0(1, drawable);
                if (O02 instanceof ShapeDrawable) {
                    ((ShapeDrawable) O02).getPaint().setColor(i10);
                } else {
                    O02.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static void F(boolean z10) {
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
                org.telegram.messenger.g0.r(m);
            }
            if (j) {
                j = false;
                org.telegram.messenger.g0.r(l);
            }
        }
        B();
        int s12 = s1();
        if (s12 != 0) {
            m(s12 == 2);
        }
        if (z10) {
            i = 0L;
        }
    }

    public static int F0(int i10) {
        int i11 = em[i10];
        if (i11 != 0) {
            return i11;
        }
        int i12 = fm.get(i10, -1);
        return i12 != -1 ? F0(i12) : ((i10 >= nb && i10 < ub) || i10 == D9 || i10 == N9 || i10 == E9 || i10 == De || i10 == Ee) ? 0 : -65536;
    }

    public static void F1(org.telegram.ui.Cells.y yVar, float f10, float f11, float f12, float f13) {
        if (com.google.android.recaptcha.internal.a.u(yVar)) {
            int numberOfLayers = yVar.getNumberOfLayers();
            for (int i10 = 0; i10 < numberOfLayers; i10++) {
                Drawable drawable = yVar.getDrawable(i10);
                if (drawable instanceof f6) {
                    f6 f6Var = (f6) drawable;
                    float[] fArr = f6Var.b;
                    float L10 = org.telegram.messenger.g0.L(f10);
                    fArr[1] = L10;
                    fArr[0] = L10;
                    float L11 = org.telegram.messenger.g0.L(f11);
                    fArr[3] = L11;
                    fArr[2] = L11;
                    float L12 = org.telegram.messenger.g0.L(f12);
                    fArr[5] = L12;
                    fArr[4] = L12;
                    float L13 = org.telegram.messenger.g0.L(f13);
                    fArr[7] = L13;
                    fArr[6] = L13;
                    f6Var.c = true;
                    f6Var.invalidateSelf();
                    return;
                }
            }
        }
    }

    public static void G(boolean z10) {
        int i10;
        if (A == 0) {
            if (z10 || Math.abs((System.currentTimeMillis() / 1000) - B) >= 3600) {
                int i11 = 0;
                while (i11 < 2) {
                    j6 j6Var = i11 == 0 ? K : J;
                    if (j6Var != null && h10.i(j6Var.F).p()) {
                        g6 k10 = j6Var.k(false);
                        TLRPC.TL_theme tL_theme = j6Var.G;
                        if (tL_theme != null) {
                            i10 = j6Var.F;
                        } else if (k10 != null && (tL_theme = k10.r) != null) {
                            i10 = h10.t0;
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
                            ConnectionsManager.getInstance(i10).sendRequest(gettheme, new ai.r6(k10, j6Var, tL_theme, 13));
                        }
                    }
                    i11++;
                }
            }
        }
    }

    public static k00 G0() {
        if (qm == null) {
            k00 k00Var = new k00();
            k00Var.a = new j00[4];
            k00Var.k = 1.0f;
            k00Var.l = new ArrayList();
            k00Var.m = new Paint(1);
            k00Var.n = new Path();
            for (int i10 = 0; i10 < 4; i10++) {
                k00Var.a[i10] = new j00(i10);
            }
            qm = k00Var;
        }
        return qm;
    }

    public static void G1(org.telegram.ui.Cells.y yVar, int i10, int i11) {
        if (com.google.android.recaptcha.internal.a.u(yVar)) {
            int numberOfLayers = yVar.getNumberOfLayers();
            for (int i12 = 0; i12 < numberOfLayers; i12++) {
                Drawable drawable = yVar.getDrawable(i12);
                if (drawable instanceof f6) {
                    f6 f6Var = (f6) drawable;
                    float f10 = i10;
                    float f11 = i11;
                    float[] fArr = f6Var.b;
                    float L10 = org.telegram.messenger.g0.L(f10);
                    fArr[3] = L10;
                    fArr[2] = L10;
                    fArr[1] = L10;
                    fArr[0] = L10;
                    float L11 = org.telegram.messenger.g0.L(f11);
                    fArr[7] = L11;
                    fArr[6] = L11;
                    fArr[5] = L11;
                    fArr[4] = L11;
                    f6Var.c = true;
                    f6Var.invalidateSelf();
                    return;
                }
            }
        }
    }

    public static void H(SparseIntArray sparseIntArray, j6 j6Var) {
        if (j6Var == null || j6Var.k0 != -1) {
            return;
        }
        int i10 = d6;
        if (i0.a.h(i0.a.f(0.5f, I0(sparseIntArray, i10), I0(sparseIntArray, i10))) < 0.5d) {
            j6Var.k0 = 1;
        } else {
            j6Var.k0 = 0;
        }
    }

    public static int H0(int i10) {
        return x0(null, i10, true);
    }

    public static boolean H1(Drawable drawable, int i10, boolean z10) {
        Drawable O02;
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
                Drawable O03 = O0(0, drawable);
                if (O03 instanceof ShapeDrawable) {
                    z11 = ((ShapeDrawable) O03).getPaint().getColor() != i10;
                    try {
                        ((ShapeDrawable) O03).getPaint().setColor(i10);
                    } catch (Throwable unused) {
                        return z11;
                    }
                } else {
                    O03.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                    z11 = false;
                }
                O02 = O0(1, drawable);
            } else {
                O02 = O0(2, drawable);
                z11 = false;
            }
            if (!(O02 instanceof ShapeDrawable)) {
                O02.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                return z11;
            }
            if (((ShapeDrawable) O02).getPaint().getColor() == i10 && !z11) {
                r1 = false;
            }
            try {
                ((ShapeDrawable) O02).getPaint().setColor(i10);
                return r1;
            } catch (Throwable unused2) {
                return r1;
            }
        } catch (Throwable unused3) {
            return false;
        }
    }

    public static ke I(j6 j6Var, SparseIntArray sparseIntArray, String str, int i10, boolean z10) {
        float f10;
        float f11;
        boolean z11 = j6Var.T && j6Var.Z == n;
        g6 k10 = j6Var.k(false);
        File e10 = k10 != null ? k10.e() : null;
        boolean z12 = k10 != null && k10.q;
        b6 b6Var = j6Var.j0;
        if (b6Var != null) {
            f11 = b6Var.k;
        } else {
            if (k10 == null) {
                f10 = j6Var.E;
                return J(j6Var, b6Var, sparseIntArray, e10, str, hm.get(g5, -1), (int) f10, i10, z11, false, false, z12, null, z10);
            }
            f11 = k10.p;
        }
        f10 = f11 * 100.0f;
        return J(j6Var, b6Var, sparseIntArray, e10, str, hm.get(g5, -1), (int) f10, i10, z11, false, false, z12, null, z10);
    }

    public static int I0(SparseIntArray sparseIntArray, int i10) {
        int indexOfKey = sparseIntArray.indexOfKey(i10);
        return indexOfKey >= 0 ? sparseIntArray.valueAt(indexOfKey) : em[i10];
    }

    public static void I1(j6 j6Var, g6 g6Var, TLRPC.TL_theme tL_theme, int i10, boolean z10) {
        String str;
        TLRPC.WallPaperSettings wallPaperSettings;
        if (tL_theme == null) {
            return;
        }
        TLRPC.ThemeSettings themeSettings = tL_theme.settings.size() > 0 ? tL_theme.settings.get(0) : null;
        HashMap hashMap = H;
        if (themeSettings != null) {
            if (j6Var == null) {
                String r02 = r0(themeSettings);
                if (r02 == null || (j6Var = (j6) hashMap.get(r02)) == null) {
                    return;
                } else {
                    g6Var = (g6) j6Var.d0.get(tL_theme.id);
                }
            }
            if (g6Var == null) {
                return;
            }
            TLRPC.TL_theme tL_theme2 = g6Var.r;
            if (tL_theme2 != null) {
                j6Var.d0.remove(tL_theme2.id);
            }
            g6Var.r = tL_theme;
            g6Var.t = i10;
            j6Var.d0.put(tL_theme.id, g6Var);
            if (!j6.a(g6Var, themeSettings)) {
                File e10 = g6Var.e();
                if (e10 != null) {
                    e10.delete();
                }
                j6.i(g6Var, themeSettings);
                j6 j6Var2 = I;
                if (j6Var2 == j6Var && j6Var2.Z == g6Var.a) {
                    t1(false, false);
                    j6 j6Var3 = I;
                    K1(j6Var3, J == j6Var3, -1, null);
                }
                d6.a(true);
            }
            TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
            g6Var.q = (wallPaper == null || (wallPaperSettings = wallPaper.settings) == null || !wallPaperSettings.motion) ? false : true;
            j6Var.U = false;
        } else {
            if (j6Var != null) {
                str = j6Var.m();
                hashMap.remove(str);
            } else {
                str = "remote" + tL_theme.id;
                j6Var = (j6) hashMap.get(str);
            }
            if (j6Var == null) {
                return;
            }
            j6Var.G = tL_theme;
            j6Var.a = tL_theme.title;
            File file = new File(j6Var.b);
            File file2 = new File(org.telegram.messenger.t0.h(), t4.c.q(str, ".attheme"));
            if (!file.equals(file2)) {
                try {
                    org.telegram.messenger.g0.E(file, file2);
                    j6Var.b = file2.getAbsolutePath();
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                }
            }
            if (z10) {
                j6Var.H = false;
                j6Var.h0 = null;
                j6Var.i0 = null;
                hs.f(j6Var.F).b(j6Var, hs.Y1);
                hs.f(j6Var.F).b(j6Var, hs.Z1);
                w7 G10 = w7.G(j6Var.F);
                TLRPC.TL_theme tL_theme3 = j6Var.G;
                G10.X(tL_theme3.document, tL_theme3, 1, 1);
            } else {
                j6Var.U = false;
            }
            hashMap.put(j6Var.m(), j6Var);
        }
        y1(true, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ke J(j6 j6Var, b6 b6Var, SparseIntArray sparseIntArray, File file, String str, int i10, int i11, int i12, boolean z10, boolean z11, boolean z12, boolean z13, TLRPC.Document document, boolean z14) {
        int width;
        int height;
        Bitmap n12;
        Bitmap n13;
        boolean z15;
        Bitmap bitmap;
        Bitmap c10;
        boolean z16;
        ke keVar = new ke(12);
        keVar.b = z14 ? null : e0;
        boolean z17 = (!z11 || z12) && b6Var != null;
        if (b6Var != null) {
            keVar.d = Boolean.valueOf(b6Var.j);
            keVar.e = Boolean.valueOf((b6Var.d == 0 || "d".equals(b6Var.c) || "c".equals(b6Var.c)) ? false : true);
        } else {
            keVar.d = Boolean.valueOf(j6Var.n);
            keVar.e = Boolean.valueOf(j6Var.r != 0);
        }
        if (!z17) {
            int i13 = z10 ? 0 : sparseIntArray.get(Be);
            int i14 = sparseIntArray.get(Ee);
            int i15 = sparseIntArray.get(De);
            int i16 = sparseIntArray.get(Ce);
            if (file == null || !file.exists()) {
                z15 = false;
            } else {
                try {
                    if (i13 == 0 || i16 == 0 || i15 == 0) {
                        keVar.b = Drawable.createFromPath(file.getAbsolutePath());
                        z15 = true;
                    } else {
                        la0 la0Var = new la0(false, i13, i16, i15, i14);
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
                            la0Var.s(decodeFile, i11);
                            la0Var.t(la0Var.f());
                            keVar.b = la0Var;
                        } catch (Throwable th2) {
                            th = th2;
                            z16 = true;
                            org.telegram.messenger.a8.g(th, z16);
                            if (!z15) {
                            }
                            if (((Drawable) keVar.b) == null) {
                            }
                            if (!lc.e(32)) {
                            }
                            return keVar;
                        }
                    }
                    keVar.d = Boolean.valueOf(z13);
                    Boolean bool = Boolean.TRUE;
                    keVar.e = bool;
                    keVar.f = bool;
                } catch (Throwable th3) {
                    th = th3;
                    z16 = true;
                    z15 = true;
                }
            }
            if (!z15) {
                if (i13 != 0) {
                    int i17 = sparseIntArray.get(Fe, -1);
                    if (i17 == -1) {
                        i17 = 45;
                    }
                    if (i16 == 0 || i15 == 0) {
                        int i18 = i13;
                        if (i16 == 0 || i16 == i18) {
                            keVar.b = new ColorDrawable(i18);
                        } else {
                            j9 j9Var = new j9(j9.d(i17), new int[]{i18, i16});
                            V = j9Var.f(i9.w(0.5f, 3), new q5(), 100L);
                            keVar.b = j9Var;
                        }
                    } else {
                        la0 la0Var2 = new la0(false, i13, i16, i15, i14);
                        if (file != null) {
                            Point point = org.telegram.messenger.g0.q;
                            int min = Math.min(point.x, point.y);
                            int max = Math.max(point.x, point.y);
                            if (document != null) {
                                w7.G(h10.t0);
                                c10 = kz.f(w7.K(document, null, true, true), min, max, 2);
                            } else {
                                c10 = kz.c(1.0f, R.raw.default_pattern, min, max, -1, 2);
                            }
                            bitmap = c10;
                            if (bitmap != null) {
                                try {
                                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                                    Bitmap copy2 = bitmap.copy(Bitmap.Config.ARGB_8888, true);
                                    copy2.compress(Bitmap.CompressFormat.PNG, 90, fileOutputStream);
                                    copy2.recycle();
                                    fileOutputStream.close();
                                } catch (Exception e10) {
                                    org.telegram.messenger.a8.g(e10, true);
                                    e10.printStackTrace();
                                }
                            }
                        } else {
                            bitmap = null;
                        }
                        la0Var2.s(bitmap, i11);
                        la0Var2.u(i12);
                        keVar.b = la0Var2;
                    }
                    keVar.f = Boolean.TRUE;
                } else if (str != null) {
                    try {
                        Bitmap n14 = n1(new FileInputStream(new File(org.telegram.messenger.t0.h(), Utilities.a(str) + ".wp")), 0);
                        if (n14 != null) {
                            BitmapDrawable bitmapDrawable = new BitmapDrawable(n14);
                            keVar.b = bitmapDrawable;
                            keVar.c = bitmapDrawable;
                            keVar.f = Boolean.TRUE;
                        }
                    } catch (Exception e11) {
                        org.telegram.messenger.a8.g(e11, true);
                    }
                } else if (i10 > 0 && (j6Var.b != null || j6Var.d != null)) {
                    try {
                        String str2 = j6Var.d;
                        Bitmap n15 = n1(new FileInputStream(str2 != null ? q0(str2) : new File(j6Var.b)), i10);
                        if (n15 != null) {
                            BitmapDrawable bitmapDrawable2 = new BitmapDrawable(n15);
                            e0 = bitmapDrawable2;
                            keVar.c = bitmapDrawable2;
                            keVar.b = bitmapDrawable2;
                            bitmapDrawable2.setFilterBitmap(true);
                            keVar.f = Boolean.TRUE;
                        }
                    } catch (Throwable th4) {
                        org.telegram.messenger.a8.g(th4, true);
                    }
                }
            }
        }
        if (((Drawable) keVar.b) == null) {
            int i19 = b6Var != null ? b6Var.d : 0;
            if (b6Var != null) {
                if (!"d".equals(b6Var.c)) {
                    if (!"c".equals(b6Var.c) || b6Var.e != 0) {
                        if (i19 == 0 || (j0 && b6Var.f == 0)) {
                            File file2 = new File(org.telegram.messenger.t0.h(), b6Var.a);
                            if (file2.exists() && (n12 = n1(new FileInputStream(file2), 0)) != null) {
                                BitmapDrawable bitmapDrawable3 = new BitmapDrawable(n12);
                                keVar.b = bitmapDrawable3;
                                bitmapDrawable3.setFilterBitmap(true);
                                keVar.f = Boolean.TRUE;
                            }
                            if (((Drawable) keVar.b) == null) {
                                keVar.b = S(0, 0);
                                keVar.f = Boolean.FALSE;
                            }
                        } else if (b6Var.e != 0 && b6Var.f != 0) {
                            la0 la0Var3 = new la0(false, b6Var.d, b6Var.e, b6Var.f, b6Var.g);
                            la0Var3.u(i12);
                            if (((Boolean) keVar.e).booleanValue()) {
                                File file3 = new File(org.telegram.messenger.t0.h(), b6Var.a);
                                if (file3.exists()) {
                                    la0Var3.s(n1(new FileInputStream(file3), 0), (int) (b6Var.k * 100.0f));
                                    keVar.f = Boolean.TRUE;
                                }
                            }
                            keVar.b = la0Var3;
                        } else if (((Boolean) keVar.e).booleanValue()) {
                            File file4 = new File(org.telegram.messenger.t0.h(), b6Var.a);
                            if (file4.exists() && (n13 = n1(new FileInputStream(file4), 0)) != null) {
                                BitmapDrawable bitmapDrawable4 = new BitmapDrawable(n13);
                                keVar.b = bitmapDrawable4;
                                bitmapDrawable4.setFilterBitmap(true);
                                keVar.f = Boolean.TRUE;
                            }
                        } else {
                            int i20 = b6Var.e;
                            if (i20 != 0) {
                                j9 j9Var2 = new j9(j9.d(b6Var.h), new int[]{i19, i20});
                                V = j9Var2.f(i9.w(0.5f, 3), new r5(), 100L);
                                keVar.b = j9Var2;
                            } else {
                                keVar.b = new ColorDrawable(i19);
                            }
                        }
                    }
                    if (((Drawable) keVar.b) == null) {
                        if (i19 == 0) {
                            i19 = -2693905;
                        }
                        keVar.b = new ColorDrawable(i19);
                    }
                }
            }
            keVar.b = S(0, 0);
            keVar.f = Boolean.FALSE;
            if (((Drawable) keVar.b) == null) {
            }
        }
        if (!lc.e(32)) {
            Drawable drawable = (Drawable) keVar.b;
            if (drawable instanceof la0) {
                la0 la0Var4 = (la0) drawable;
                Bitmap bitmap2 = la0Var4.u;
                if (bitmap2 == null) {
                    Point point2 = org.telegram.messenger.g0.q;
                    width = Math.min(point2.x, point2.y);
                    height = Math.max(point2.x, point2.y);
                } else {
                    width = bitmap2.getWidth();
                    height = la0Var4.u.getHeight();
                }
                Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                ((Drawable) keVar.b).setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                ((Drawable) keVar.b).draw(canvas);
                keVar.b = new BitmapDrawable(createBitmap);
            }
        }
        return keVar;
    }

    public static org.telegram.ui.Cells.y J0(int i10, int i11) {
        return new org.telegram.ui.Cells.y(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{(i11 & 16777215) | 419430400}), null, d0(i10, -1));
    }

    public static void J1(j6 j6Var) {
        Collections.sort(j6Var.c0, new tq(16));
    }

    public static void K(Context context, boolean z10) {
        float f10;
        float f11;
        float f12;
        TextPaint textPaint;
        Drawable[] drawableArr;
        P();
        if (z10 || m3 != null) {
            f10 = 1.0f;
            f11 = 14.0f;
            f12 = 3.0f;
        } else {
            Resources resources = context.getResources();
            h3 = resources.getDrawable(R.drawable.video_muted);
            l3 = resources.getDrawable(R.drawable.media_live_on).mutate();
            m3 = new t4(0, false, false, null);
            n3 = new t4(0, false, true, null);
            o3 = new t4(0, true, false, null);
            p3 = new t4(0, true, true, null);
            q3 = new t4(1, false, false, null);
            r3 = new t4(1, false, true, null);
            s3 = new t4(1, true, false, null);
            t3 = new t4(1, true, true, null);
            gc0 gc0Var = new gc0();
            gc0Var.a = new Path();
            gc0Var.b = -1.0f;
            gc0Var.g = new ArrayList();
            gc0Var.c = 0.293f;
            gc0Var.d = -26.0f;
            gc0Var.e = -28.0f;
            gc0Var.f = 1.0f;
            x3 = gc0Var;
            gc0Var.a("M 34.141 16.042 C 37.384 17.921 40.886 20.001 44.211 21.965 C 46.139 23.104 49.285 24.729 49.586 25.917 C 50.289 28.687 48.484 30 46.274 30 L 6 30.021 C 3.79 30.021 2.075 30.023 2 26.021 L 2.009 3.417 C 2.009 0.417 5.326 -0.58 7.068 0.417 C 10.545 2.406 25.024 10.761 34.141 16.042 Z", 166.0f);
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
            E3 = new sa0();
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
            int L10 = org.telegram.messenger.g0.L(2.0f);
            RectF rectF = new RectF();
            Path path = new Path();
            Path[] pathArr = Z4;
            pathArr[0] = path;
            f10 = 1.0f;
            path.moveTo(org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(3.0f));
            pathArr[0].lineTo(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(3.0f));
            pathArr[0].lineTo(org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(10.0f));
            pathArr[0].lineTo(org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(20.0f));
            int i11 = L10 * 2;
            f11 = 14.0f;
            f12 = 3.0f;
            rectF.set(org.telegram.messenger.g0.L(21.0f) - i11, org.telegram.messenger.g0.L(19.0f) - L10, org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(19.0f) + L10);
            pathArr[0].arcTo(rectF, 0.0f, 90.0f, false);
            pathArr[0].lineTo(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(21.0f));
            rectF.set(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(19.0f) - L10, org.telegram.messenger.g0.L(5.0f) + i11, org.telegram.messenger.g0.L(19.0f) + L10);
            pathArr[0].arcTo(rectF, 90.0f, 90.0f, false);
            pathArr[0].lineTo(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(4.0f));
            rectF.set(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(5.0f) + i11, org.telegram.messenger.g0.L(3.0f) + i11);
            pathArr[0].arcTo(rectF, 180.0f, 90.0f, false);
            pathArr[0].close();
            Path path2 = new Path();
            pathArr[1] = path2;
            path2.moveTo(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(5.0f));
            pathArr[1].lineTo(org.telegram.messenger.g0.L(19.0f), org.telegram.messenger.g0.L(10.0f));
            pathArr[1].lineTo(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(10.0f));
            pathArr[1].close();
            b5 = resources.getDrawable(R.drawable.filled_fire).mutate();
            c5 = resources.getDrawable(R.drawable.msg_round_gif_m).mutate();
            Drawable[][] drawableArr6 = U4;
            drawableArr6[0][0] = N(org.telegram.messenger.g0.L(44.0f), R.drawable.msg_round_play_m);
            drawableArr6[0][1] = N(org.telegram.messenger.g0.L(44.0f), R.drawable.msg_round_play_m);
            drawableArr6[1][0] = N(org.telegram.messenger.g0.L(44.0f), R.drawable.msg_round_pause_m);
            drawableArr6[1][1] = N(org.telegram.messenger.g0.L(44.0f), R.drawable.msg_round_pause_m);
            drawableArr6[2][0] = N(org.telegram.messenger.g0.L(44.0f), R.drawable.msg_round_load_m);
            drawableArr6[2][1] = N(org.telegram.messenger.g0.L(44.0f), R.drawable.msg_round_load_m);
            drawableArr6[3][0] = N(org.telegram.messenger.g0.L(44.0f), R.drawable.msg_round_file_s);
            drawableArr6[3][1] = N(org.telegram.messenger.g0.L(44.0f), R.drawable.msg_round_file_s);
            drawableArr6[4][0] = N(org.telegram.messenger.g0.L(44.0f), R.drawable.msg_round_cancel_m);
            drawableArr6[4][1] = N(org.telegram.messenger.g0.L(44.0f), R.drawable.msg_round_cancel_m);
            xp N10 = N(org.telegram.messenger.g0.L(44.0f), R.drawable.msg_contact);
            Drawable[] drawableArr7 = T4;
            drawableArr7[0] = N10;
            drawableArr7[1] = N(org.telegram.messenger.g0.L(44.0f), R.drawable.msg_contact);
            Drawable mutate5 = resources.getDrawable(R.drawable.msg_location).mutate();
            Drawable[] drawableArr8 = S4;
            drawableArr8[0] = mutate5;
            drawableArr8[1] = resources.getDrawable(R.drawable.msg_location).mutate();
            i3 = k2.p1.g(context, R.drawable.compose_panel_shadow);
            j3 = k2.p1.g(context, R.drawable.sheet_shadow_round);
            gi.k3 k3Var = new gi.k3();
            Paint paint = new Paint(1);
            k3Var.b = paint;
            paint.setShadowLayer(org.telegram.messenger.g0.L(4.0f), 0.0f, 0.0f, 1593835520);
            k3 = k3Var;
            am.clear();
            bm.clear();
            Drawable drawable = x4;
            int i12 = Yc;
            d("drawableBotInline", drawable, i12);
            d("drawableBotWebView", y4, i12);
            d("drawableBotLock", A4, i12);
            d("drawableBotLink", v4, i12);
            d("drawable_botInvite", z4, i12);
            d("drawableGoIcon", u4, i12);
            d("drawableCommentSticker", C4, i12);
            d("drawableMsgError", j4, ud);
            d("drawableMsgIn", m3, -1);
            d("drawableMsgInSelected", n3, -1);
            d("drawableMsgInMedia", q3, -1);
            d("drawableMsgInMediaSelected", r3, -1);
            d("drawableMsgInInstant", h4, rd);
            d("drawableMsgOut", o3, -1);
            d("drawableMsgOutSelected", p3, -1);
            d("drawableMsgOutMedia", s3, -1);
            d("drawableMsgOutMediaSelected", t3, -1);
            Drawable drawable2 = drawableArr4[0];
            int i13 = Jb;
            d("drawableMsgOutCallAudio", drawable2, i13);
            Drawable drawable3 = drawableArr5[0];
            int i14 = Kb;
            d("drawableMsgOutCallAudioSelected", drawable3, i14);
            d("drawableMsgOutCallVideo", drawableArr4[1], i13);
            d("drawableMsgOutCallVideo", drawableArr5[1], i14);
            d("drawableMsgOutCheck", y3, xb);
            d("drawableMsgOutCheckSelected", z3, yb);
            Drawable drawable4 = A3;
            int i15 = zb;
            d("drawableMsgOutCheckRead", drawable4, i15);
            Drawable drawable5 = B3;
            int i16 = Ab;
            d("drawableMsgOutCheckReadSelected", drawable5, i16);
            d("drawableMsgOutHalfCheck", C3, i15);
            d("drawableMsgOutHalfCheckSelected", D3, i16);
            d("drawableMsgOutInstant", i4, i13);
            d("drawableMsgOutMenu", e4, Hb);
            d("drawableMsgOutMenuSelected", f4, Ib);
            Drawable drawable6 = W3;
            int i17 = Fb;
            d("drawableMsgOutPinned", drawable6, i17);
            Drawable drawable7 = X3;
            int i18 = Gb;
            d("drawableMsgOutPinnedSelected", drawable7, i18);
            d("drawableMsgOutReplies", S3, i17);
            d("drawableMsgOutReplies", T3, i18);
            d("drawableMsgOutViews", O3, i17);
            d("drawableMsgOutViewsSelected", P3, i18);
            Drawable drawable8 = H3;
            int i19 = Wc;
            d("drawableMsgStickerCheck", drawable8, i19);
            d("drawableMsgStickerHalfCheck", I3, i19);
            d("drawableMsgStickerPinned", Y3, i19);
            d("drawableMsgStickerReplies", K3, i19);
            d("drawableMsgStickerViews", J3, i19);
            d("drawableReplyIcon", r4, i12);
            d("drawableCloseIcon", s4, i12);
            d("drawableMoreIcon", t4, i12);
            d("drawableShareIcon", q4, i12);
            d("drawableMuteIcon", k4, cd);
            d("drawableLockIcon", l4, dd);
            d("drawable_chat_pollHintDrawableOut", drawableArr[1], Lb);
            d("drawable_chat_pollHintDrawableIn", drawableArr[0], yd);
            k(z10, false);
        }
        if (z10 || (textPaint = C2) == null) {
            return;
        }
        textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
        D2.setTextSize(org.telegram.messenger.g0.L(12.0f));
        E2.setTextSize(org.telegram.messenger.g0.L(11.0f));
        G2.setTextSize(org.telegram.messenger.g0.L(15.0f));
        H2.setTextSize(org.telegram.messenger.g0.L(15.0f));
        I2.setTextSize(org.telegram.messenger.g0.L(13.0f));
        N2.setTextSize(org.telegram.messenger.g0.L(12.0f));
        F2.setTextSize(org.telegram.messenger.g0.L(12.0f));
        O2.setTextSize(org.telegram.messenger.g0.L(16.0f));
        P2.setTextSize(org.telegram.messenger.g0.L(15.0f));
        Q2.setTextSize(org.telegram.messenger.g0.L(15.0f));
        R2.setTextSize(org.telegram.messenger.g0.L(15.0f));
        S2.setTextSize(org.telegram.messenger.g0.L(13.0f));
        J2.setTextSize(org.telegram.messenger.g0.L(12.0f));
        W2.setTextSize(org.telegram.messenger.g0.L(r0));
        Y2.setTextSize(org.telegram.messenger.g0.L(r0));
        Z2.setTextSize(org.telegram.messenger.g0.L(r0));
        float f13 = (((az.W0 * 2) + 10) / f12) - f10;
        d3.setTextSize(org.telegram.messenger.g0.L(f13));
        X2.setTextSize(org.telegram.messenger.g0.L(r0));
        U2.setTextSize(org.telegram.messenger.g0.L(f13));
        V2.setTextSize(org.telegram.messenger.g0.L(12.0f));
        T2.setTextSize(org.telegram.messenger.g0.L(12.0f));
        K2.setTextSize(org.telegram.messenger.g0.L(13.0f));
        L2.setTextSize(org.telegram.messenger.g0.L(13.0f));
        M2.setTextSize(org.telegram.messenger.g0.L(13.0f));
        X1.setStrokeWidth(org.telegram.messenger.g0.L(f10));
        Z1.setStrokeWidth(org.telegram.messenger.g0.L(1.1f));
        s2.setTextSize(org.telegram.messenger.g0.L(Math.max(16, az.W0) - 2));
        t2.setTextSize(org.telegram.messenger.g0.L(Math.max(16, az.W0) - 2));
        u2.setTextSize(org.telegram.messenger.g0.L(Math.max(16, az.W0) - 3));
        v2.setTextSize(org.telegram.messenger.g0.L(Math.max(16, az.W0)));
        f3.setTextSize(org.telegram.messenger.g0.L(15.0f));
        g3.setTextSize(org.telegram.messenger.g0.L(13.0f));
        k2.setStrokeWidth(org.telegram.messenger.g0.L(f12));
        l2.setStrokeWidth(org.telegram.messenger.g0.L(2.33f));
        e3.setTextSize(org.telegram.messenger.g0.L(f11));
        e3.setTypeface(org.telegram.messenger.g0.o());
    }

    public static String K0() {
        b6 b6Var = I.j0;
        return b6Var != null ? b6Var.c : g1() ? "t" : "d";
    }

    public static void K1(j6 j6Var, boolean z10, int i10, View view) {
        int[] iArr = new int[2];
        if (view == null || !view.isAttachedToWindow()) {
            iArr[0] = org.telegram.messenger.g0.q.x / 2;
            iArr[1] = 0;
        } else {
            view.getLocationInWindow(iArr);
            iArr[0] = (view.getMeasuredWidth() / 2) + iArr[0];
            iArr[1] = (view.getMeasuredHeight() / 2) + iArr[1];
        }
        hs.e().k(hs.t4, j6Var, Boolean.valueOf(z10), iArr, Integer.valueOf(i10), Boolean.TRUE, null);
    }

    public static ShapeDrawable L(int i10, int i11) {
        OvalShape ovalShape = new OvalShape();
        float f10 = i10;
        ovalShape.resize(f10, f10);
        ShapeDrawable shapeDrawable = new ShapeDrawable(ovalShape);
        shapeDrawable.setIntrinsicWidth(i10);
        shapeDrawable.setIntrinsicHeight(i10);
        shapeDrawable.getPaint().setColor(i11);
        return shapeDrawable;
    }

    public static org.telegram.ui.Cells.y L0(int i10, int i11, e6 e6Var) {
        return i11 >= 0 ? new org.telegram.ui.Cells.y(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i10}), new ColorDrawable(w0(i11, e6Var)), new ColorDrawable(-1)) : h0(i10, 2, -1);
    }

    public static int L1(SparseIntArray sparseIntArray) {
        int i10 = sb;
        int i11 = tb;
        int i12 = ob;
        int[] iArr = {i12, rb, i10, i11};
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < 4; i17++) {
            int i18 = iArr[i17];
            if (i18 == i12 || sparseIntArray.indexOfKey(i18) >= 0) {
                int i19 = sparseIntArray.get(i18, em[i18]);
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

    public static ShapeDrawable M(int i10, int i11, int i12) {
        OvalShape ovalShape = new OvalShape();
        float f10 = i10;
        ovalShape.resize(f10, f10);
        ShapeDrawable shapeDrawable = new ShapeDrawable(ovalShape);
        shapeDrawable.setIntrinsicWidth(i10);
        shapeDrawable.setIntrinsicHeight(i10);
        shapeDrawable.getPaint().setShader(new LinearGradient(0.0f, 0.0f, 0.0f, f10, i11, i12, Shader.TileMode.CLAMP));
        return shapeDrawable;
    }

    public static org.telegram.ui.Cells.y M0(e6 e6Var, boolean z10) {
        int w02 = w0(i6, e6Var);
        return z10 ? L0(w02, d6, e6Var) : h0(w02, 2, -1);
    }

    public static void M1(d2 d2Var) {
        if (o != 0) {
            if (d2Var != null) {
                try {
                    fc.a0(d2Var).J(R.raw.auto_night_off, o == 3 ? bd.M0(2131753785, "AutoNightSystemModeOff") : bd.M0(2131753790, "AutoNightModeOff"), bd.M0(2131745505, "Settings"), 5000, false, new d4(d2Var, 5)).j();
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
            o = 0;
            w1();
            B();
        }
    }

    public static xp N(int i10, int i11) {
        Drawable g10 = i11 != 0 ? k2.p1.g(org.telegram.messenger.t0.b, i11) : null;
        OvalShape ovalShape = new OvalShape();
        float f10 = i10;
        ovalShape.resize(f10, f10);
        ShapeDrawable shapeDrawable = new ShapeDrawable(ovalShape);
        shapeDrawable.getPaint().setColor(-1);
        xp xpVar = new xp(shapeDrawable, g10);
        xpVar.h = i10;
        xpVar.n = i10;
        return xpVar;
    }

    public static org.telegram.ui.Cells.y N0(boolean z10) {
        int x02 = x0(null, i6, false);
        return z10 ? L0(x02, d6, null) : h0(x02, 2, -1);
    }

    public static void N1(zi ziVar) {
        a8 a8Var = d5;
        if (a8Var == null) {
            return;
        }
        if (a8Var.i == null || ziVar == null) {
            a8Var.i = null;
            return;
        }
        if (e5 == null) {
            e5 = new HashMap();
        }
        e5.put(ziVar, d5);
        d5.e(false, null);
        org.telegram.messenger.g0.i3(new d4(ziVar, 6), 200L);
        d5 = null;
    }

    public static org.telegram.ui.Cells.y O(int i10, int i11, int i12) {
        z.setColor(-1);
        return new org.telegram.ui.Cells.y(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i10}), null, new n5(i11, i12));
    }

    public static Drawable O0(int i10, Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 29 && (drawable instanceof StateListDrawable)) {
            return ((StateListDrawable) drawable).getStateDrawable(i10);
        }
        if (sm == null) {
            try {
                sm = StateListDrawable.class.getDeclaredMethod("getStateDrawable", Integer.TYPE);
            } catch (Throwable unused) {
            }
        }
        Method method = sm;
        if (method == null) {
            return null;
        }
        try {
            return (Drawable) method.invoke(drawable, Integer.valueOf(i10));
        } catch (Exception unused2) {
            return null;
        }
    }

    public static void P() {
        Q();
        if (C2 == null) {
            C2 = new TextPaint(1);
            TextPaint textPaint = new TextPaint(1);
            D2 = textPaint;
            TextPaint d10 = org.telegram.messenger.camera.q.d(textPaint, 1);
            E2 = d10;
            TextPaint d11 = org.telegram.messenger.camera.q.d(d10, 1);
            G2 = d11;
            d11.setTypeface(org.telegram.messenger.g0.o());
            S1 = new Paint(1);
            Paint paint = new Paint(1);
            T1 = paint;
            Paint.Style style = Paint.Style.STROKE;
            paint.setStyle(style);
            Paint paint2 = T1;
            Paint.Cap cap = Paint.Cap.ROUND;
            paint2.setStrokeCap(cap);
            TextPaint textPaint2 = new TextPaint(1);
            H2 = textPaint2;
            I2 = org.telegram.messenger.camera.q.d(textPaint2, 1);
            Paint paint3 = new Paint();
            U1 = paint3;
            paint3.setPathEffect(n70.c());
            Paint paint4 = new Paint();
            V1 = paint4;
            paint4.setPathEffect(n70.c());
            Paint paint5 = new Paint();
            W1 = paint5;
            paint5.setPathEffect(n70.c());
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
            TextPaint textPaint3 = new TextPaint(1);
            F2 = textPaint3;
            textPaint3.setTypeface(Typeface.DEFAULT_BOLD);
            TextPaint textPaint4 = new TextPaint(1);
            O2 = textPaint4;
            P2 = org.telegram.messenger.camera.q.d(textPaint4, 1);
            TextPaint textPaint5 = new TextPaint(1);
            Q2 = textPaint5;
            TextPaint d12 = org.telegram.messenger.camera.q.d(textPaint5, 1);
            R2 = d12;
            S2 = org.telegram.messenger.camera.q.d(d12, 1);
            J2 = new TextPaint(1);
            TextPaint textPaint6 = new TextPaint(1);
            K2 = textPaint6;
            L2 = org.telegram.messenger.camera.q.d(textPaint6, 1);
            T2 = new TextPaint(1);
            U2 = new TextPaint(1);
            V2 = new TextPaint(1);
            TextPaint textPaint7 = new TextPaint(1);
            W2 = textPaint7;
            X2 = org.telegram.messenger.camera.q.d(textPaint7, 1);
            TextPaint textPaint8 = new TextPaint(1);
            Y2 = textPaint8;
            Z2 = org.telegram.messenger.camera.q.d(textPaint8, 1);
            TextPaint textPaint9 = new TextPaint(1);
            d3 = textPaint9;
            c3 = org.telegram.messenger.camera.q.d(textPaint9, 1);
            e3 = new TextPaint(1);
            TextPaint textPaint10 = new TextPaint(1);
            M2 = textPaint10;
            textPaint10.setTypeface(org.telegram.messenger.g0.o());
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
            TextPaint d13 = org.telegram.messenger.camera.q.d(s2, 1);
            v2 = d13;
            d13.setTypeface(org.telegram.messenger.g0.o());
            Paint paint11 = new Paint(1);
            h2 = paint11;
            paint11.setColor(352321536);
            i2 = new Paint(1);
            TextPaint textPaint11 = new TextPaint(1);
            f3 = textPaint11;
            g3 = org.telegram.messenger.camera.q.d(textPaint11, 1);
            j2 = new Paint();
            new Paint(1);
            m2 = new Paint(1);
            n2 = new Paint(1);
            e2 = new Paint(1);
            f2 = new Paint(7);
            g2 = new Paint(7);
            e(vd, e2, "paintChatMessageBackgroundSelected");
            Paint paint12 = f2;
            int i10 = Zc;
            e(i10, paint12, "paintChatActionBackground");
            e(i10, h2, "paintChatActionBackgroundDarken");
            e(ad, g2, "paintChatActionBackgroundSelected");
            TextPaint textPaint12 = s2;
            int i11 = Wc;
            e(i11, textPaint12, "paintChatActionText");
            e(i11, t2, "paintChatActionText2");
            e(i11, u2, "paintChatActionText3");
            e(Bd, Q2, "paintChatBotButton");
            e(Ge, j2, "paintChatComposeBackground");
            e(kd, i2, "paintChatTimeBackground");
        }
    }

    public static float[] P0(int i10) {
        ThreadLocal threadLocal = i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? pm : om : nm : mm : lm;
        float[] fArr = (float[]) threadLocal.get();
        if (fArr != null) {
            return fArr;
        }
        float[] fArr2 = new float[3];
        threadLocal.set(fArr2);
        return fArr2;
    }

    public static void Q() {
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
                    textPaint.setTypeface(org.telegram.messenger.g0.o());
                    TextPaint textPaint2 = new TextPaint(1);
                    W2 = textPaint2;
                    textPaint2.setTypeface(org.telegram.messenger.g0.o());
                    TextPaint textPaint3 = new TextPaint(1);
                    Y2 = textPaint3;
                    textPaint3.setTypeface(org.telegram.messenger.g0.o());
                    Z2 = new TextPaint(1);
                    a3 = new TextPaint(1);
                    b3 = new TextPaint(1);
                    c3 = new TextPaint(1);
                    TextPaint textPaint4 = new TextPaint(1);
                    d3 = textPaint4;
                    textPaint4.setTypeface(org.telegram.messenger.g0.o());
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
                        y2[i10].setTextSize(org.telegram.messenger.g0.L(fArr[i10] * 120.0f));
                        i10++;
                    } else {
                        z2.setTextSize(org.telegram.messenger.g0.L(46.0f));
                        A2.setTextSize(org.telegram.messenger.g0.L(38.0f));
                        B2.setTextSize(org.telegram.messenger.g0.L(30.0f));
                        o2.setTextSize(org.telegram.messenger.g0.L(az.W0));
                        x2.setTextSize(org.telegram.messenger.g0.L(14.0f));
                        w2.setTextSize(org.telegram.messenger.g0.L(15.0f));
                        W2.setTextSize(org.telegram.messenger.g0.L(r1));
                        Y2.setTextSize(org.telegram.messenger.g0.L(r1));
                        Z2.setTextSize(org.telegram.messenger.g0.L(r1));
                        float f10 = (((az.W0 * 2) + 10) / 3.0f) - 1.0f;
                        a3.setTextSize(org.telegram.messenger.g0.L(f10));
                        b3.setTextSize(org.telegram.messenger.g0.L(r1));
                        V2.setTextSize(org.telegram.messenger.g0.L(12.0f));
                        d3.setTextSize(org.telegram.messenger.g0.L(f10));
                        c3.setTextSize(org.telegram.messenger.g0.L(r1 - 2.0f));
                        X2.setTextSize(org.telegram.messenger.g0.L(r1));
                        U2.setTextSize(org.telegram.messenger.g0.L(f10));
                        p2.setTextSize(org.telegram.messenger.g0.L(Math.max(Math.min(10, az.W0 - 1), az.W0 - 2)));
                        q2.setTextSize(org.telegram.messenger.g0.L(Math.max(Math.min(10, az.W0 - 2), az.W0 - 3)));
                        r2.setTextSize(org.telegram.messenger.g0.L(Math.max(Math.min(10, az.W0 - 2), az.W0 - 5)));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static j6 Q0(String str) {
        return (j6) H.get(str);
    }

    public static void R(Context context) {
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
            o0.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
            o0.setStrokeCap(Paint.Cap.ROUND);
            Paint paint4 = new Paint(1);
            n0 = paint4;
            paint4.setColor(0);
            n0.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            p0 = new Paint(1);
            Paint paint5 = new Paint();
            m0 = paint5;
            paint5.setPathEffect(n70.c());
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
            ch0 ch0Var = u1;
            if (ch0Var != null) {
                ch0Var.setCallback(null);
                u1.C(false);
            }
            ch0 ch0Var2 = v1;
            if (ch0Var2 != null) {
                ch0Var2.C(false);
            }
            ch0 ch0Var3 = w1;
            if (ch0Var3 != null) {
                ch0Var3.C(false);
            }
            ch0 ch0Var4 = x1;
            if (ch0Var4 != null) {
                ch0Var4.C(false);
            }
            ch0 ch0Var5 = y1;
            if (ch0Var5 != null) {
                ch0Var5.C(false);
            }
            ch0 ch0Var6 = z1;
            if (ch0Var6 != null) {
                ch0Var6.C(false);
            }
            u1 = new ch0(R.raw.chats_archiveavatar, org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(36.0f), false, null);
            v1 = new ch0(R.raw.chats_archive, org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(36.0f), false, null);
            w1 = new ch0(R.raw.chats_unarchive, org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(36.0f), false, null);
            x1 = new ch0(R.raw.chats_hide, org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(36.0f), false, null);
            y1 = new ch0(R.raw.chats_unhide, org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(36.0f), false, null);
            z1 = new ch0(R.raw.chat_audio_record_delete, org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(30.0f), false, null);
            H1 = new ch0(R.raw.swipe_mute, org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(36.0f), false, null);
            I1 = new ch0(R.raw.swipe_unmute, org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(36.0f), false, null);
            L1 = new ch0(R.raw.swipe_read, org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(36.0f), false, null);
            M1 = new ch0(R.raw.swipe_unread, org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(36.0f), false, null);
            J1 = new ch0(R.raw.swipe_delete, org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(36.0f), false, null);
            O1 = new ch0(R.raw.swipe_unpin, org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(36.0f), false, null);
            N1 = new ch0(R.raw.swipe_pin, org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(36.0f), false, null);
            K1 = new ch0(R.raw.swipe_community_ungroup, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), false, null);
            l();
        }
    }

    public static Drawable R0(String str) {
        return (Drawable) am.get(str);
    }

    public static la0 S(int i10, int i11) {
        int max;
        int i12;
        la0 la0Var = new la0(i10 != 0, -2368069, -9722489, -2762611, -7817084);
        if (i10 <= 0 || i11 <= 0) {
            Point point = org.telegram.messenger.g0.q;
            int min = Math.min(point.x, point.y);
            max = Math.max(point.x, point.y);
            i12 = min;
        } else {
            i12 = i10;
            max = i11;
        }
        la0Var.s(kz.c(1.0f, R.raw.default_pattern, i12, max, -16777216, 2), 34);
        la0Var.t(la0Var.f());
        return la0Var;
    }

    public static Drawable S0(String str, e6 e6Var) {
        Drawable drawable = e6Var != null ? e6Var.getDrawable(str) : null;
        return drawable != null ? drawable : (Drawable) am.get(str);
    }

    public static void T(Context context) {
        R(context);
        if (L0 == null) {
            TextPaint textPaint = new TextPaint(1);
            L0 = textPaint;
            TextPaint d10 = org.telegram.messenger.camera.q.d(textPaint, 1);
            M0 = d10;
            d10.setTypeface(org.telegram.messenger.g0.o());
            w0 = new Paint(1);
            t0 = new Paint(1);
            A0 = new Paint(1);
        }
        L0.setTextSize(org.telegram.messenger.g0.L(12.0f));
        M0.setTextSize(org.telegram.messenger.g0.L(13.0f));
        if (B0 == null) {
            Resources resources = context.getResources();
            B0 = new TextPaint[2];
            C0 = new TextPaint[2];
            F0 = new TextPaint[2];
            H0 = new TextPaint[2];
            for (int i10 = 0; i10 < 2; i10++) {
                B0[i10] = new TextPaint(1);
                B0[i10].setTypeface(org.telegram.messenger.g0.o());
                C0[i10] = new TextPaint(1);
                C0[i10].setTypeface(org.telegram.messenger.g0.o());
                F0[i10] = new TextPaint(1);
                H0[i10] = new TextPaint(1);
            }
            TextPaint textPaint2 = new TextPaint(1);
            D0 = textPaint2;
            TextPaint d11 = org.telegram.messenger.camera.q.d(textPaint2, 1);
            E0 = d11;
            TextPaint d12 = org.telegram.messenger.camera.q.d(d11, 1);
            G0 = d12;
            I0 = org.telegram.messenger.camera.q.d(d12, 1);
            J0 = new TextPaint(1);
            K0 = new TextPaint(1);
            TextPaint textPaint3 = new TextPaint(1);
            N0 = textPaint3;
            TextPaint d13 = org.telegram.messenger.camera.q.d(textPaint3, 1);
            O0 = d13;
            P0 = org.telegram.messenger.camera.q.d(d13, 1);
            Q0 = new TextPaint(1);
            TextPaint textPaint4 = new TextPaint(1);
            R0 = textPaint4;
            textPaint4.setTypeface(org.telegram.messenger.g0.o());
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
            X0 = new sa0();
            Y0 = resources.getDrawable(R.drawable.list_warning_sign);
            Z0 = resources.getDrawable(R.drawable.list_reorder).mutate();
            c1 = resources.getDrawable(R.drawable.list_mute).mutate();
            d1 = resources.getDrawable(R.drawable.list_unmute).mutate();
            e1 = resources.getDrawable(R.drawable.mini_ephemeral_hidden_16).mutate();
            f1 = resources.getDrawable(R.drawable.verified_area).mutate();
            g1 = new kk0(0);
            h1 = new kk0(1);
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
            float L10 = org.telegram.messenger.g0.L(12.0f);
            float L11 = org.telegram.messenger.g0.L(12.0f);
            rectF.set(L10 - org.telegram.messenger.g0.L(5.0f), L11 - org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(5.0f) + L10, org.telegram.messenger.g0.L(5.0f) + L11);
            pathArr[2].arcTo(rectF, -160.0f, -110.0f, true);
            pathArr[2].arcTo(rectF, 20.0f, -110.0f, true);
            pathArr[0].moveTo(L10, org.telegram.messenger.g0.L(8.0f) + L11);
            pathArr[0].lineTo(L10, org.telegram.messenger.g0.L(2.0f) + L11);
            pathArr[0].lineTo(org.telegram.messenger.g0.L(3.0f) + L10, org.telegram.messenger.g0.L(5.0f) + L11);
            pathArr[0].close();
            pathArr[0].moveTo(L10, L11 - org.telegram.messenger.g0.L(8.0f));
            pathArr[0].lineTo(L10, L11 - org.telegram.messenger.g0.L(2.0f));
            pathArr[0].lineTo(L10 - org.telegram.messenger.g0.L(3.0f), L11 - org.telegram.messenger.g0.L(5.0f));
            pathArr[0].close();
            o();
        }
        G0.setTextSize(org.telegram.messenger.g0.L(14.0f));
        I0.setTextSize(org.telegram.messenger.g0.L(12.0f));
        J0.setTextSize(org.telegram.messenger.g0.L(12.0f));
        J0.setTypeface(org.telegram.messenger.g0.o());
        K0.setTextSize(org.telegram.messenger.g0.L(12.0f));
        K0.setTypeface(org.telegram.messenger.g0.o());
        N0.setTextSize(org.telegram.messenger.g0.L(13.0f));
        O0.setTextSize(org.telegram.messenger.g0.L(11.0f));
        P0.setTextSize(org.telegram.messenger.g0.L(15.0f));
        Q0.setTextSize(org.telegram.messenger.g0.L(15.0f));
        R0.setTextSize(org.telegram.messenger.g0.L(10.0f));
        D0.setTextSize(org.telegram.messenger.g0.L(16.0f));
        E0.setTextSize(org.telegram.messenger.g0.L(16.0f));
    }

    public static SparseIntArray T0(File file, String str, String[] strArr) {
        boolean z10;
        FileInputStream fileInputStream;
        int intValue;
        SparseIntArray sparseIntArray = new SparseIntArray();
        FileInputStream fileInputStream2 = null;
        try {
            byte[] bArr = new byte[1024];
            fileInputStream = new FileInputStream(str != null ? q0(str) : file);
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
                                    int h10 = u4.h(substring);
                                    if (h10 >= 0) {
                                        sparseIntArray.put(h10, intValue);
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
                        org.telegram.messenger.a8.g(th, true);
                        if (fileInputStream2 != null) {
                            try {
                                fileInputStream2.close();
                            } catch (Exception e10) {
                                e = e10;
                                org.telegram.messenger.a8.g(e, z10);
                                return sparseIntArray;
                            }
                        }
                        return sparseIntArray;
                    } finally {
                    }
                }
            }
            sparseIntArray.put(g5, i11);
        } catch (Throwable th3) {
            th = th3;
        }
        try {
            fileInputStream.close();
        } catch (Exception e11) {
            e = e11;
            z10 = true;
            org.telegram.messenger.a8.g(e, z10);
            return sparseIntArray;
        }
        return sparseIntArray;
    }

    public static t5 U(Context context) {
        return V(context, x0(null, u5, false), x0(null, v5, false));
    }

    public static float U0(float f10) {
        return (f10 >= 0.0f || I.q()) ? f10 : -f10;
    }

    public static t5 V(Context context, int i10, int i11) {
        Resources resources = context.getResources();
        Drawable mutate = resources.getDrawable(R.drawable.search_dark).mutate();
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(i10, mode));
        Drawable mutate2 = resources.getDrawable(R.drawable.search_dark_activated).mutate();
        mutate2.setColorFilter(new PorterDuffColorFilter(i11, mode));
        t5 t5Var = new t5();
        t5Var.addState(new int[]{android.R.attr.state_enabled, android.R.attr.state_focused}, mutate2);
        t5Var.addState(new int[]{android.R.attr.state_focused}, mutate2);
        t5Var.addState(StateSet.WILD_CARD, mutate);
        return t5Var;
    }

    public static Paint V0(String str) {
        return Objects.equals(str, "paintDivider") ? k0 : (Paint) cm.get(str);
    }

    public static t5 W(Context context, int i10, int i11, int i12) {
        Resources resources = context.getResources();
        Drawable mutate = resources.getDrawable(i10).mutate();
        if (i11 != 0) {
            mutate.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.MULTIPLY));
        }
        Drawable mutate2 = resources.getDrawable(i10).mutate();
        if (i12 != 0) {
            mutate2.setColorFilter(new PorterDuffColorFilter(i12, PorterDuff.Mode.MULTIPLY));
        }
        t5 t5Var = new t5();
        t5Var.setEnterFadeDuration(1);
        t5Var.setExitFadeDuration(hs.e3);
        t5Var.addState(new int[]{android.R.attr.state_selected}, mutate2);
        t5Var.addState(new int[0], mutate);
        return t5Var;
    }

    public static Paint W0(String str, e6 e6Var) {
        Paint d10;
        return (e6Var == null || (d10 = e6Var.d(str)) == null) ? V0(str) : d10;
    }

    public static org.telegram.ui.Cells.y X(float f10, int i10, int i11) {
        return Y(f10, 285212671, i10, i11, i10, i11);
    }

    public static Drawable X0(Context context, int i10, int i11) {
        if (context == null) {
            return null;
        }
        Drawable g10 = k2.p1.g(context, i10);
        g10.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.MULTIPLY));
        return g10;
    }

    public static org.telegram.ui.Cells.y Y(float f10, int i10, int i11, int i12, int i13, int i14) {
        z.setColor(-1);
        return new org.telegram.ui.Cells.y(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i10}), null, new w5(i11, i12, i13, i14, f10));
    }

    public static Drawable Y0(Context context, int i10, int i11) {
        return X0(context, i10, x0(null, i11, false));
    }

    public static void Z(Context context) {
        if (Q1 == null) {
            P1 = new TextPaint(1);
            Resources resources = context.getResources();
            Q1 = resources.getDrawable(R.drawable.verified_area).mutate();
            R1 = resources.getDrawable(R.drawable.verified_check).mutate();
            q();
        }
        P1.setTextSize(org.telegram.messenger.g0.L(16.0f));
    }

    public static Drawable Z0(View view, boolean z10) {
        int i10;
        la0 la0Var;
        File file;
        Throwable th2;
        FileInputStream fileInputStream;
        int i11;
        File e10;
        int i12 = im.get(Be);
        if (i12 != 0) {
            int i13 = im.get(Ce);
            int i14 = im.get(De);
            int i15 = im.get(Ee);
            int i16 = im.get(Fe, -1);
            if (i16 == -1) {
                i16 = 45;
            }
            if (i13 == 0) {
                return new ColorDrawable(i12);
            }
            g6 k10 = I.k(false);
            file = (k10 == null || TextUtils.isEmpty(k10.o) || M != null || (e10 = k10.e()) == null || !e10.exists()) ? null : e10;
            if (i14 != 0) {
                la0Var = new la0(true, i12, i13, i14, i15);
                if (file == null) {
                    return la0Var;
                }
            } else {
                if (file == null) {
                    j9 j9Var = new j9(j9.d(i16), new int[]{i12, i13});
                    j9Var.f(!z10 ? i9.w(0.5f, 3) : i9.w(0.125f, 1), view != null ? new s5(view, z10) : null, 0L);
                    return j9Var;
                }
                la0Var = null;
            }
            i10 = 0;
        } else {
            if (g0 > 0) {
                j6 j6Var = I;
                if (j6Var.b != null || j6Var.d != null) {
                    String str = j6Var.d;
                    file = str != null ? q0(str) : new File(I.b);
                    i10 = g0;
                    la0Var = null;
                }
            }
            i10 = 0;
            la0Var = null;
            file = null;
        }
        try {
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
                            int L10 = org.telegram.messenger.g0.L(100.0f);
                            i11 = 1;
                            while (true) {
                                float f12 = L10;
                                if (f10 <= f12 && f11 <= f12) {
                                    break;
                                }
                                i11 *= 2;
                                f10 /= 2.0f;
                                f11 /= 2.0f;
                            }
                        } else {
                            i11 = 1;
                        }
                        Bitmap.Config config = Bitmap.Config.ALPHA_8;
                        options.inPreferredConfig = config;
                        options.inJustDecodeBounds = false;
                        options.inSampleSize = i11;
                        Bitmap decodeStream = BitmapFactory.decodeStream(fileInputStream, null, options);
                        if (la0Var == null) {
                            if (decodeStream == null) {
                                fileInputStream.close();
                                return null;
                            }
                            BitmapDrawable bitmapDrawable = new BitmapDrawable(decodeStream);
                            try {
                                fileInputStream.close();
                                return bitmapDrawable;
                            } catch (Exception e11) {
                                org.telegram.messenger.a8.g(e11, true);
                                return bitmapDrawable;
                            }
                        }
                        g6 k11 = I.k(false);
                        int i17 = k11 != null ? (int) (k11.p * 100.0f) : 100;
                        if (decodeStream != null && decodeStream.getConfig() != config) {
                            Bitmap copy = decodeStream.copy(config, false);
                            decodeStream.recycle();
                            decodeStream = copy;
                        }
                        la0Var.s(decodeStream, i17);
                        la0Var.t(la0Var.f());
                        try {
                            fileInputStream.close();
                            return la0Var;
                        } catch (Exception e12) {
                            org.telegram.messenger.a8.g(e12, true);
                            return la0Var;
                        }
                    } catch (Throwable th3) {
                        th2 = th3;
                        try {
                            org.telegram.messenger.a8.g(th2, true);
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
        } catch (Exception e13) {
            org.telegram.messenger.a8.g(e13, true);
        }
        return null;
    }

    public static boolean a(int i10, int i11) {
        float red = Color.red(i10) / 255.0f;
        float green = Color.green(i10) / 255.0f;
        float blue = Color.blue(i10) / 255.0f;
        return ((((((float) Color.blue(i11)) / 255.0f) * 0.5f) + (blue * 0.5f)) * 0.0722f) + (((((Color.green(i11) / 255.0f) * 0.5f) + (green * 0.5f)) * 0.7152f) + ((((Color.red(i11) / 255.0f) * 0.5f) + (red * 0.5f)) * 0.2126f)) > 0.705f || (blue * 0.0722f) + ((green * 0.7152f) + (red * 0.2126f)) > 0.705f;
    }

    public static org.telegram.ui.Cells.y a0(int i10, int i11, int i12) {
        z.setColor(-1);
        return new org.telegram.ui.Cells.y(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i10}), null, new f6(i11, i12));
    }

    public static int a1(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return i10 | (-16777216);
    }

    public static int b(float f10, float f11, int i10) {
        float[] P02 = P0(5);
        Color.colorToHSV(i10, P02);
        float f12 = P02[1];
        if (f12 > 0.1f && f12 < 0.9f) {
            P02[1] = be.a(f12 + f10, 0.0f, 1.0f);
        }
        P02[2] = be.a(P02[2] + f11, 0.0f, 1.0f);
        return Color.HSVToColor(Color.alpha(i10), P02);
    }

    public static org.telegram.ui.Cells.y b0(int i10, int i11, int i12, int i13) {
        z.setColor(-1);
        float f10 = i12;
        float f11 = i13;
        return new org.telegram.ui.Cells.y(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i11}), e0(org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(f11), i10), new f6(f10, f11));
    }

    public static String b1(b6 b6Var) {
        String str;
        if (b6Var == null || TextUtils.isEmpty(b6Var.c) || b6Var.c.equals("d")) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        if (b6Var.i) {
            sb2.append("blur");
        }
        if (b6Var.j) {
            if (sb2.length() > 0) {
                sb2.append("+");
            }
            sb2.append("motion");
        }
        int i10 = b6Var.d;
        if (i10 == 0) {
            str = "https://attheme.org?slug=" + b6Var.c;
        } else {
            String lowerCase = String.format("%02x%02x%02x", Integer.valueOf(((byte) (i10 >> 16)) & 255), Integer.valueOf(((byte) (b6Var.d >> 8)) & 255), Byte.valueOf((byte) (b6Var.d & hs.e4))).toLowerCase();
            int i11 = b6Var.e;
            String lowerCase2 = i11 != 0 ? String.format("%02x%02x%02x", Integer.valueOf(((byte) (i11 >> 16)) & 255), Integer.valueOf(((byte) (b6Var.e >> 8)) & 255), Byte.valueOf((byte) (b6Var.e & hs.e4))).toLowerCase() : null;
            int i12 = b6Var.f;
            String lowerCase3 = i12 != 0 ? String.format("%02x%02x%02x", Integer.valueOf(((byte) (i12 >> 16)) & 255), Integer.valueOf(((byte) (b6Var.f >> 8)) & 255), Byte.valueOf((byte) (b6Var.f & hs.e4))).toLowerCase() : null;
            int i13 = b6Var.g;
            String lowerCase4 = i13 != 0 ? String.format("%02x%02x%02x", Integer.valueOf(((byte) (i13 >> 16)) & 255), Integer.valueOf(((byte) (b6Var.g >> 8)) & 255), Byte.valueOf((byte) (b6Var.g & hs.e4))).toLowerCase() : null;
            if (lowerCase2 == null || lowerCase3 == null) {
                if (lowerCase2 != null) {
                    StringBuilder h10 = t4.c.h(a1.g.C(lowerCase, "-", lowerCase2), "&rotation=");
                    h10.append(b6Var.h);
                    lowerCase = h10.toString();
                }
            } else if (lowerCase4 != null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(lowerCase);
                sb3.append("~");
                sb3.append(lowerCase2);
                sb3.append("~");
                sb3.append(lowerCase3);
                lowerCase = a1.g.s(sb3, "~", lowerCase4);
            } else {
                lowerCase = lowerCase + "~" + lowerCase2 + "~" + lowerCase3;
            }
            str = "https://attheme.org?slug=" + b6Var.c + "&intensity=" + ((int) (b6Var.k * 100.0f)) + "&bg_color=" + lowerCase;
        }
        if (sb2.length() <= 0) {
            return str;
        }
        StringBuilder h11 = t4.c.h(str, "&mode=");
        h11.append(sb2.toString());
        return h11.toString();
    }

    public static int c(int i10, int i11) {
        float[] P02 = P0(5);
        Color.colorToHSV(i11, P02);
        float f10 = P02[0];
        float f11 = P02[1];
        Color.colorToHSV(i10, P02);
        P02[0] = f10;
        P02[1] = org.telegram.messenger.g0.T1(P02[1], f11, 0.25f);
        return Color.HSVToColor(Color.alpha(i10), P02);
    }

    public static org.telegram.ui.Cells.y c0(int i10, int i11, int i12, int i13, int i14) {
        z.setColor(-1);
        f6 f6Var = new f6();
        f6Var.a = new Path();
        f6Var.b = new float[]{r5, r5, r5, r5, r5, r5, r5, r5};
        f6Var.c = true;
        float L10 = org.telegram.messenger.g0.L(i11);
        float L11 = org.telegram.messenger.g0.L(i12);
        float L12 = org.telegram.messenger.g0.L(i13);
        float L13 = org.telegram.messenger.g0.L(i14);
        return new org.telegram.ui.Cells.y(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i10}), null, f6Var);
    }

    public static boolean c1() {
        return P && I.j0 != null;
    }

    public static void d(String str, Drawable drawable, int i10) {
        am.put(str, drawable);
        bm.put(str, Integer.valueOf(i10));
    }

    public static ShapeDrawable d0(int i10, int i11) {
        float f10 = i10;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{f10, f10, f10, f10, f10, f10, f10, f10}, null, null));
        shapeDrawable.getPaint().setColor(i11);
        return shapeDrawable;
    }

    public static boolean d1() {
        return Z != null;
    }

    public static void e(int i10, Paint paint, String str) {
        cm.put(str, paint);
        dm.put(str, Integer.valueOf(i10));
    }

    public static ShapeDrawable e0(int i10, int i11, int i12) {
        float f10 = i10;
        float f11 = i11;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{f10, f10, f10, f10, f11, f11, f11, f11}, null, null));
        shapeDrawable.getPaint().setColor(i12);
        return shapeDrawable;
    }

    public static boolean e1(int i10) {
        float[] P02 = P0(3);
        Color.colorToHSV(i10, P02);
        float f10 = P02[1];
        return f10 > 0.1f && f10 < 0.9f;
    }

    public static void f(SparseIntArray sparseIntArray, SparseIntArray sparseIntArray2, boolean z10) {
        if (z10) {
            int i10 = ll;
            if (sparseIntArray.indexOfKey(i10) < 0) {
                sparseIntArray2.put(i10, r1(0.1f, -1));
            }
        }
        int[] iArr = em;
        int i11 = ra;
        int i12 = sparseIntArray2.get(i11, iArr[i11]);
        int L12 = L1(sparseIntArray2);
        int i13 = nl;
        if (sparseIntArray.indexOfKey(i13) < 0) {
            sparseIntArray2.put(i13, x(i12, z10, false));
        }
        int i14 = ol;
        if (sparseIntArray.indexOfKey(i14) < 0) {
            sparseIntArray2.put(i14, x(i12, z10, true));
        }
        int i15 = pl;
        if (sparseIntArray.indexOfKey(i15) < 0) {
            sparseIntArray2.put(i15, x(L12, z10, false));
        }
        int i16 = ql;
        if (sparseIntArray.indexOfKey(i16) < 0) {
            sparseIntArray2.put(i16, x(L12, z10, true));
        }
        int i17 = rl;
        if (sparseIntArray.indexOfKey(i17) < 0) {
            sparseIntArray2.put(i17, y(i12, z10, false, true));
        }
        int i18 = sl;
        if (sparseIntArray.indexOfKey(i18) < 0) {
            sparseIntArray2.put(i18, y(L12, z10, true, true));
        }
        int i19 = tl;
        if (sparseIntArray.indexOfKey(i19) < 0) {
            sparseIntArray2.put(i19, y(i12, z10, false, false));
        }
        int i20 = ul;
        if (sparseIntArray.indexOfKey(i20) < 0) {
            sparseIntArray2.put(i20, y(L12, z10, true, false));
        }
    }

    public static InsetDrawable f0(int i10, int i11) {
        float f10 = i10;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{f10, f10, f10, f10, f10, f10, f10, f10}, null, null));
        shapeDrawable.getPaint().setColor(i11);
        shapeDrawable.getPaint().setShadowLayer(org.telegram.messenger.g0.N(2.0f), 0.0f, org.telegram.messenger.g0.N(0.33f), r1(Color.alpha(i11) / 255.0f, 285212672));
        return new InsetDrawable((Drawable) shapeDrawable, org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f));
    }

    public static boolean f1(int i10) {
        return im.indexOfKey(i10) >= 0;
    }

    public static void g(SparseIntArray sparseIntArray, SparseIntArray sparseIntArray2, boolean z10) {
        int[] iArr = em;
        int i10 = ra;
        int i11 = sparseIntArray2.get(i10, iArr[i10]);
        int L12 = L1(sparseIntArray2);
        int i12 = fl;
        if (sparseIntArray.indexOfKey(i12) < 0) {
            sparseIntArray2.put(i12, z(i11, z10, false));
        }
        int i13 = gl;
        if (sparseIntArray.indexOfKey(i13) < 0) {
            sparseIntArray2.put(i13, z(L12, z10, true));
        }
        int i14 = hl;
        if (sparseIntArray.indexOfKey(i14) < 0) {
            sparseIntArray2.put(i14, A(i11, z10, false));
        }
        int i15 = il;
        if (sparseIntArray.indexOfKey(i15) < 0) {
            sparseIntArray2.put(i15, A(L12, z10, true));
        }
        int i16 = kl;
        if (sparseIntArray.indexOfKey(i16) < 0) {
            int i17 = Ob;
            sparseIntArray2.put(i16, r1(0.2f, sparseIntArray2.get(i17, iArr[i17])));
        }
        if (z10) {
            int i18 = jl;
            if (sparseIntArray.indexOfKey(i18) < 0) {
                int i19 = Md;
                sparseIntArray2.put(i18, r1(0.2f, sparseIntArray2.get(i19, iArr[i19])));
            }
        }
    }

    public static org.telegram.ui.Cells.y g0(int i10, int i11) {
        return h0(i10, i11, -1);
    }

    public static boolean g1() {
        j6 j6Var = I;
        if (j6Var.T && j6Var.Z == n) {
            return false;
        }
        return im.indexOfKey(Be) >= 0 || g0 > 0 || !TextUtils.isEmpty(h0);
    }

    public static void h(Drawable drawable) {
        Bitmap bitmap;
        if (e2 == null) {
            return;
        }
        int i10 = im.get(vd);
        boolean z10 = (drawable instanceof la0) && az.o() != 0 && i10 == 0;
        if (z10 && Y != (bitmap = ((la0) drawable).k)) {
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
            org.telegram.messenger.g0.i(colorMatrix, 2.5f);
            org.telegram.messenger.g0.n2(colorMatrix, 0.75f);
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

    /* JADX WARN: Removed duplicated region for block: B:19:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static org.telegram.ui.Cells.y h0(int i10, int i11, int i12) {
        Drawable drawable;
        if (i11 != 1 && i11 != 5) {
            if (i11 == 1 || i11 == 3 || i11 == 4 || i11 == 5 || i11 == 6 || i11 == 7) {
                z.setColor(-1);
                drawable = new u5(i11, i12);
            } else if (i11 == 2) {
                drawable = new ColorDrawable(-1);
            }
            org.telegram.ui.Cells.y yVar = new org.telegram.ui.Cells.y(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i10}), null, drawable);
            if (i11 == 1) {
                if (i11 == 5) {
                    yVar.setRadius(-1);
                }
                return yVar;
            }
            if (i12 <= 0) {
                i12 = org.telegram.messenger.g0.L(20.0f);
            }
            yVar.setRadius(i12);
            return yVar;
        }
        drawable = null;
        org.telegram.ui.Cells.y yVar2 = new org.telegram.ui.Cells.y(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i10}), null, drawable);
        if (i11 == 1) {
        }
    }

    public static boolean h1() {
        return jm != null;
    }

    public static void i() {
        Drawable drawable = e0;
        if (drawable != null) {
            j(drawable);
        }
    }

    public static org.telegram.ui.Cells.y i0(int i10, int i11) {
        return new org.telegram.ui.Cells.y(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i11}), new ColorDrawable(i10), new ColorDrawable(i10));
    }

    public static boolean i1(e6 e6Var) {
        return e6Var != null ? e6Var.e() : az.H0;
    }

    public static void j(Drawable drawable) {
        int valueAt;
        int valueAt2;
        boolean z10;
        Bitmap bitmap;
        if (f2 == null) {
            return;
        }
        X = c0;
        b0 = d0;
        boolean z11 = az.H0;
        int i10 = Zc;
        if (z11) {
            int x02 = x0(null, ua, false);
            int x03 = x0(null, Ea, false);
            valueAt = i0.a.k(x03, x02);
            valueAt2 = i0.a.k(i0.a.o(x03, Math.min(hs.e4, Color.alpha(x03) * 2)), x02);
            X = valueAt;
            b0 = valueAt2;
        } else {
            int indexOfKey = im.indexOfKey(i10);
            valueAt = indexOfKey >= 0 ? im.valueAt(indexOfKey) : X;
            int indexOfKey2 = im.indexOfKey(ad);
            valueAt2 = indexOfKey2 >= 0 ? im.valueAt(indexOfKey2) : b0;
        }
        if (z11 || !((((z10 = drawable instanceof la0)) || (drawable instanceof BitmapDrawable)) && az.o() != 0 && lc.e(32))) {
            Y = null;
            Z = null;
            int i11 = Fa;
            int i12 = z11 ? i11 : Wc;
            if (!z11) {
                i11 = Xc;
            }
            int i13 = z11 ? Ga : Yc;
            D1(i12, Y3);
            D1(i12, H3);
            D1(i12, I3);
            D1(i12, J3);
            D1(i12, K3);
            s2.setColor(x0(null, i12, false));
            t2.setColor(x0(null, i12, false));
            u2.setColor(x0(null, i12, false));
            s2.linkColor = x0(null, i11, false);
            v2.setColor(x0(null, i12, false));
            D1(i13, C4);
            D1(i13, q4);
            D1(i13, r4);
            D1(i13, u4);
            D1(i13, x4);
            D1(i13, y4);
            D1(i13, A4);
            D1(i13, z4);
            D1(i13, v4);
            Q2.setColor(x0(null, z11 ? Ha : Bd, false));
            if (z11) {
                D1(i13, s4);
                D1(i13, t4);
            } else {
                Drawable drawable2 = s4;
                if (drawable2 != null) {
                    drawable2.setColorFilter(null);
                }
                Drawable drawable3 = t4;
                if (drawable3 != null) {
                    drawable3.setColorFilter(null);
                }
            }
        } else {
            if (z10) {
                bitmap = ((la0) drawable).k;
            } else {
                if (drawable instanceof BitmapDrawable) {
                    WeakReference weakReference = xm;
                    if (weakReference == null || weakReference.get() != drawable) {
                        WeakReference weakReference2 = xm;
                        if (weakReference2 != null) {
                            weakReference2.clear();
                        }
                        xm = null;
                        if (drawable.getIntrinsicWidth() == 0 || drawable.getIntrinsicHeight() == 0) {
                            ym = null;
                        } else {
                            xm = new WeakReference(drawable);
                            int intrinsicWidth = (int) ((drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight()) * 24.0f);
                            Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, 24, Bitmap.Config.ARGB_8888);
                            drawable.setBounds(0, 0, intrinsicWidth, 24);
                            ColorFilter colorFilter = drawable.getColorFilter();
                            ColorMatrix colorMatrix = new ColorMatrix();
                            colorMatrix.setSaturation(1.3f);
                            org.telegram.messenger.g0.n2(colorMatrix, 0.94f);
                            drawable.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                            drawable.draw(new Canvas(createBitmap));
                            drawable.setColorFilter(colorFilter);
                            Utilities.blurBitmap(createBitmap, 3);
                            ym = createBitmap;
                            bitmap = createBitmap;
                        }
                    } else {
                        bitmap = ym;
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
            C1(-1, Y3);
            C1(-1, H3);
            C1(-1, I3);
            C1(-1, J3);
            C1(-1, K3);
            s2.setColor(-1);
            t2.setColor(-1);
            u2.setColor(-1);
            s2.linkColor = -1;
            v2.setColor(-1);
            Q2.setColor(-1);
            C1(-1, C4);
            C1(-1, q4);
            C1(-1, r4);
            C1(-1, u4);
            C1(-1, x4);
            C1(-1, y4);
            C1(-1, A4);
            C1(-1, z4);
            C1(-1, v4);
        }
        f2.setColor(valueAt);
        g2.setColor(valueAt2);
        if (Z == null || !(im.indexOfKey(i10) < 0 || (drawable instanceof la0) || (drawable instanceof BitmapDrawable))) {
            f2.setColorFilter(null);
            f2.setShader(null);
            g2.setColorFilter(null);
            g2.setShader(null);
            h2.setAlpha(z11 ? 0 : 21);
            return;
        }
        ColorMatrix colorMatrix2 = new ColorMatrix();
        if (drawable instanceof la0) {
            if (((la0) drawable).q >= 0.0f) {
                colorMatrix2.setSaturation(1.6f);
                org.telegram.messenger.g0.n2(colorMatrix2, I.q() ? 0.97f : 0.92f);
                org.telegram.messenger.g0.h(colorMatrix2, I.q() ? 0.12f : -0.06f);
            } else {
                colorMatrix2.setSaturation(1.1f);
                org.telegram.messenger.g0.n2(colorMatrix2, I.q() ? 0.4f : 0.8f);
                org.telegram.messenger.g0.h(colorMatrix2, I.q() ? 0.08f : -0.06f);
            }
        } else {
            colorMatrix2.setSaturation(1.6f);
            org.telegram.messenger.g0.n2(colorMatrix2, I.q() ? 0.9f : 0.84f);
            org.telegram.messenger.g0.h(colorMatrix2, I.q() ? -0.04f : 0.06f);
        }
        f2.setFilterBitmap(true);
        f2.setShader(Z);
        f2.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
        f2.setAlpha(hs.e4);
        g2.setFilterBitmap(true);
        g2.setShader(Z);
        ColorMatrix colorMatrix3 = new ColorMatrix(colorMatrix2);
        org.telegram.messenger.g0.i(colorMatrix3, 0.26f);
        j1();
        org.telegram.messenger.g0.n2(colorMatrix3, 0.92f);
        g2.setColorFilter(new ColorMatrixColorFilter(colorMatrix3));
        g2.setAlpha(hs.e4);
        h2.setAlpha(0);
    }

    public static org.telegram.ui.Cells.y j0(int i10, int i11, int i12) {
        OvalShape ovalShape = new OvalShape();
        float f10 = i10;
        ovalShape.resize(f10, f10);
        ShapeDrawable shapeDrawable = new ShapeDrawable(ovalShape);
        shapeDrawable.getPaint().setColor(i11);
        ShapeDrawable shapeDrawable2 = new ShapeDrawable(ovalShape);
        shapeDrawable2.getPaint().setColor(-1);
        return new org.telegram.ui.Cells.y(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i12}), shapeDrawable, shapeDrawable2);
    }

    public static boolean j1() {
        return I.q();
    }

    public static void k(boolean z10, boolean z11) {
        if (o2 == null || m3 == null || z10) {
            return;
        }
        K2.setColor(x0(null, xd, false));
        J2.setColor(x0(null, wd, false));
        Q2.setColor(x0(null, Bd, false));
        U1.setColor(x0(null, ze, false));
        V1.setColor(x0(null, Ac, false));
        W1.setColor(x0(null, Ae, false));
        b2.setColor(x0(null, td, false));
        Paint paint = c2;
        int i10 = pa;
        paint.setColor(x0(null, i10, false));
        d2.setColor(x0(null, i10, false));
        TextPaint textPaint = s2;
        int i11 = Wc;
        textPaint.setColor(x0(null, i11, false));
        t2.setColor(x0(null, i11, false));
        u2.setColor(x0(null, i11, false));
        s2.linkColor = x0(null, Xc, false);
        v2.setColor(x0(null, i11, false));
        f3.setColor(x0(null, G6, false));
        Paint paint2 = j2;
        int i12 = Ge;
        paint2.setColor(x0(null, i12, false));
        i2.setColor(x0(null, kd, false));
        D1(Yd, h3);
        t4 t4Var = m3;
        int i13 = ra;
        D1(i13, t4Var);
        t4 t4Var2 = n3;
        int i14 = Rc;
        D1(i14, t4Var2);
        D1(i13, q3);
        D1(i14, r3);
        D1(xb, y3);
        D1(yb, z3);
        Drawable drawable = A3;
        int i15 = zb;
        D1(i15, drawable);
        Drawable drawable2 = B3;
        int i16 = Ab;
        D1(i16, drawable2);
        D1(i15, C3);
        D1(i16, D3);
        Drawable drawable3 = F3;
        int i17 = gd;
        D1(i17, drawable3);
        D1(i17, G3);
        D1(i11, H3);
        D1(i11, I3);
        D1(i11, J3);
        D1(i11, K3);
        D1(i11, L3);
        Drawable drawable4 = q4;
        int i18 = Yc;
        D1(i18, drawable4);
        D1(i18, r4);
        D1(i18, u4);
        D1(i18, x4);
        D1(i18, y4);
        Drawable drawable5 = A4;
        int i19 = dd;
        D1(i19, drawable5);
        D1(i18, z4);
        D1(i18, v4);
        Drawable drawable6 = M3;
        int i20 = ld;
        D1(i20, drawable6);
        Drawable drawable7 = N3;
        int i21 = md;
        D1(i21, drawable7);
        Drawable drawable8 = O3;
        int i22 = Fb;
        D1(i22, drawable8);
        Drawable drawable9 = P3;
        int i23 = Gb;
        D1(i23, drawable9);
        D1(i20, Q3);
        D1(i21, R3);
        D1(i22, S3);
        D1(i23, T3);
        D1(i20, U3);
        D1(i21, V3);
        D1(i22, W3);
        D1(i23, X3);
        Drawable drawable10 = Z3;
        int i24 = nd;
        D1(i24, drawable10);
        D1(i11, Y3);
        D1(i24, a4);
        D1(i24, b4);
        D1(od, c4);
        D1(pd, d4);
        D1(Hb, e4);
        D1(Ib, f4);
        D1(qd, g4);
        Drawable drawable11 = i4;
        int i25 = Jb;
        D1(i25, drawable11);
        Drawable drawable12 = h4;
        int i26 = rd;
        D1(i26, drawable12);
        D1(ud, j4);
        D1(cd, k4);
        D1(i19, l4);
        Drawable drawable13 = m4;
        int i27 = vf;
        D1(i27, drawable13);
        D1(i27, n4);
        D1(i27, o4);
        D1(i26, B4);
        D1(i18, C4);
        D1(i26, D4);
        Drawable drawable14 = E4;
        int i28 = qf;
        D1(i28, drawable14);
        D1(i28, F4);
        for (int i29 = 0; i29 < 2; i29++) {
            D1(i26, G4[i29]);
            D1(sd, H4[i29]);
            D1(i25, I4[i29]);
            D1(Kb, J4[i29]);
        }
        D1(wb, O4);
        Drawable drawable15 = P4;
        int i30 = r7;
        D1(i30, drawable15);
        D1(qa, Q4);
        D1(i30, V4);
        Drawable drawable16 = W4;
        int i31 = rj;
        D1(i31, drawable16);
        D1(i30, X4);
        D1(i31, Y4);
        int i32 = 0;
        while (true) {
            nu0[] nu0VarArr = u3;
            if (i32 >= nu0VarArr.length) {
                break;
            }
            D1(p9, nu0VarArr[i32]);
            i32++;
        }
        for (int i33 = 0; i33 < 5; i33++) {
            Drawable[][] drawableArr = U4;
            B1(drawableArr[i33][0], x0(null, We, false), false);
            B1(drawableArr[i33][0], x0(null, id, false), true);
            B1(drawableArr[i33][1], x0(null, Xe, false), false);
            B1(drawableArr[i33][1], x0(null, jd, false), true);
        }
        Drawable[] drawableArr2 = T4;
        B1(drawableArr2[0], x0(null, ff, false), false);
        B1(drawableArr2[0], x0(null, gf, false), true);
        B1(drawableArr2[1], x0(null, Ec, false), false);
        B1(drawableArr2[1], x0(null, Fc, false), true);
        Drawable[] drawableArr3 = S4;
        C1(x0(null, ef, false), drawableArr3[0]);
        C1(x0(null, Dc, false), drawableArr3[1]);
        Drawable[] drawableArr4 = M4;
        C1(x0(null, yd, false), drawableArr4[0]);
        C1(x0(null, Lb, false), drawableArr4[1]);
        Drawable[] drawableArr5 = N4;
        C1(x0(null, i20, false), drawableArr5[0]);
        C1(x0(null, i22, false), drawableArr5[1]);
        D1(He, i3);
        D1(i12, j3);
        int x02 = x0(null, nc, false) == -1 ? x0(null, ob, false) : -1;
        C1(x02, K4[1]);
        C1(x02, L4[1]);
        C1(x0(null, da, false), R4);
        if (z11 || b) {
            if (!az.H0 || b) {
                return;
            }
            i();
        } else {
            i();
            h(e0);
        }
    }

    public static org.telegram.ui.Cells.y k0(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
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
        return new org.telegram.ui.Cells.y(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i15}), shapeDrawable, shapeDrawable2);
    }

    public static boolean k1() {
        return !I.q();
    }

    public static void l() {
        Paint paint = k0;
        if (paint == null) {
            return;
        }
        paint.setColor(x0(null, d7, false));
        m0.setColor(x0(null, K6, false));
        int i10 = 0;
        while (true) {
            Drawable[] drawableArr = r0;
            int length = drawableArr.length;
            int i11 = J7;
            if (i10 >= length) {
                ch0 ch0Var = u1;
                ch0Var.a0 = true;
                int i12 = M7;
                ch0Var.Q(x0(null, i12, true), "Arrow1");
                u1.Q(x0(null, i12, true), "Arrow2");
                u1.Q(x0(null, i11, true), "Box2");
                u1.Q(x0(null, i11, true), "Box1");
                u1.o();
                C1 = false;
                u1.J(true);
                ch0 ch0Var2 = x1;
                ch0Var2.a0 = true;
                int i13 = e9;
                ch0Var2.Q(x0(null, i13, true), "Arrow");
                x1.Q(x0(null, i13, true), "Line");
                x1.o();
                ch0 ch0Var3 = y1;
                ch0Var3.a0 = true;
                ch0Var3.Q(x0(null, i13, true), "Arrow");
                y1.Q(x0(null, i13, true), "Line");
                y1.o();
                ch0 ch0Var4 = z1;
                ch0Var4.a0 = true;
                int i14 = c9;
                ch0Var4.Q(x0(null, i14, true), "Line 1");
                z1.Q(x0(null, i14, true), "Line 2");
                z1.Q(x0(null, i14, true), "Line 3");
                z1.Q(x0(null, i13, true), "Cup Red");
                z1.Q(x0(null, i13, true), "Box");
                z1.o();
                B1 = false;
                ch0 ch0Var5 = v1;
                ch0Var5.a0 = true;
                ch0Var5.Q(x0(null, i14, true), "Arrow");
                v1.Q(x0(null, i13, true), "Box2");
                v1.Q(x0(null, i13, true), "Box1");
                v1.o();
                A1 = false;
                ch0 ch0Var6 = w1;
                ch0Var6.a0 = true;
                ch0Var6.Q(x0(null, i13, true), "Arrow1");
                w1.Q(x0(null, d9, true), "Arrow2");
                w1.Q(x0(null, i13, true), "Box2");
                w1.Q(x0(null, i13, true), "Box1");
                w1.o();
                int x02 = x0(null, G6, false);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                v3 = new PorterDuffColorFilter(x02, mode);
                w3 = new PorterDuffColorFilter(x0(null, Tc, false), mode);
                ha.e.d().b();
                return;
            }
            D1(i11, drawableArr[i10]);
            i10++;
        }
    }

    public static boolean l0(j6 j6Var, g6 g6Var, boolean z10) {
        boolean z11 = false;
        if (g6Var == null || j6Var == null || j6Var.c0 == null) {
            return false;
        }
        boolean z12 = g6Var.a == j6Var.Z;
        File e10 = g6Var.e();
        if (e10 != null) {
            e10.delete();
        }
        j6Var.b0.remove(g6Var.a);
        j6Var.c0.remove(g6Var);
        TLRPC.TL_theme tL_theme = g6Var.r;
        if (tL_theme != null) {
            j6Var.d0.remove(tL_theme.id);
        }
        b6 b6Var = g6Var.y;
        if (b6Var != null) {
            b6.a(b6Var);
        }
        if (z12) {
            j6Var.u(((g6) j6Var.c0.get(0)).a);
        }
        if (z10) {
            z1(j6Var, true, false, false, false, false);
            if (g6Var.r != null) {
                hp s12 = hp.s1(g6Var.t);
                if (z12 && j6Var == J) {
                    z11 = true;
                }
                s12.x4(j6Var, g6Var, z11, true);
            }
        }
        return z12;
    }

    public static boolean l1(g6 g6Var) {
        j6 j6Var = g6Var.b;
        if (j6Var == null) {
            return false;
        }
        if (j6Var.m().equals("Blue") && g6Var.a == 99) {
            return true;
        }
        if (g6Var.b.m().equals("Day") && g6Var.a == 9) {
            return true;
        }
        return (g6Var.b.m().equals("Night") || g6Var.b.m().equals("Dark Blue")) && g6Var.a == 0;
    }

    public static void m(boolean z10) {
        j6 j6Var;
        if (M != null) {
            return;
        }
        if (z10) {
            j6 j6Var2 = I;
            j6 j6Var3 = J;
            if (j6Var2 != j6Var3) {
                if (j6Var2 == null || !(j6Var3 == null || j6Var2.q() == J.q())) {
                    R = true;
                    i = SystemClock.elapsedRealtime();
                    Q = true;
                    K1(J, true, -1, null);
                    Q = false;
                    return;
                }
                return;
            }
            return;
        }
        j6 j6Var4 = K;
        if (j6Var4 != null && j6Var4.q() && o != 0 && (j6Var = L) != null) {
            j6Var4 = j6Var;
        }
        j6 j6Var5 = I;
        if (j6Var5 != j6Var4) {
            if (j6Var5 == null || !(j6Var4 == null || j6Var5.q() == j6Var4.q())) {
                R = false;
                i = SystemClock.elapsedRealtime();
                Q = true;
                K1(j6Var4, true, -1, null);
                Q = false;
            }
        }
    }

    public static j6 m0(File file, String str, TLRPC.TL_theme tL_theme) {
        String[] split;
        try {
            j6 j6Var = new j6();
            j6Var.a = str;
            j6Var.G = tL_theme;
            j6Var.b = file.getAbsolutePath();
            j6Var.F = h10.t0;
            String[] strArr = new String[1];
            H(T0(new File(j6Var.b), null, strArr), j6Var);
            if (TextUtils.isEmpty(strArr[0])) {
                h0 = null;
                return j6Var;
            }
            String str2 = strArr[0];
            j6Var.c = new File(org.telegram.messenger.t0.h(), Utilities.a(str2) + ".wp").getAbsolutePath();
            try {
                Uri parse = Uri.parse(str2);
                j6Var.e = parse.getQueryParameter("slug");
                String queryParameter = parse.getQueryParameter("mode");
                if (queryParameter != null && (split = queryParameter.toLowerCase().split(" ")) != null && split.length > 0) {
                    for (int i10 = 0; i10 < split.length; i10++) {
                        if ("blur".equals(split[i10])) {
                            j6Var.h = true;
                        } else if ("motion".equals(split[i10])) {
                            j6Var.n = true;
                        }
                    }
                }
                String queryParameter2 = parse.getQueryParameter("intensity");
                if (!TextUtils.isEmpty(queryParameter2)) {
                    try {
                        String queryParameter3 = parse.getQueryParameter("bg_color");
                        if (!TextUtils.isEmpty(queryParameter3)) {
                            j6Var.r = Integer.parseInt(queryParameter3.substring(0, 6), 16) | (-16777216);
                            if (queryParameter3.length() >= 13 && org.telegram.messenger.g0.S1(queryParameter3.charAt(6))) {
                                j6Var.s = Integer.parseInt(queryParameter3.substring(7, 13), 16) | (-16777216);
                            }
                            if (queryParameter3.length() >= 20 && org.telegram.messenger.g0.S1(queryParameter3.charAt(13))) {
                                j6Var.w = Integer.parseInt(queryParameter3.substring(14, 20), 16) | (-16777216);
                            }
                            if (queryParameter3.length() == 27 && org.telegram.messenger.g0.S1(queryParameter3.charAt(20))) {
                                j6Var.x = Integer.parseInt(queryParameter3.substring(21), 16) | (-16777216);
                            }
                        }
                    } catch (Exception unused) {
                    }
                    try {
                        String queryParameter4 = parse.getQueryParameter("rotation");
                        if (!TextUtils.isEmpty(queryParameter4)) {
                            j6Var.y = Utilities.z(queryParameter4).intValue();
                        }
                    } catch (Exception unused2) {
                    }
                    if (!TextUtils.isEmpty(queryParameter2)) {
                        j6Var.E = Utilities.z(queryParameter2).intValue();
                    }
                    if (j6Var.E == 0) {
                        j6Var.E = 50;
                    }
                }
            } catch (Throwable th2) {
                org.telegram.messenger.a8.g(th2, true);
            }
            return j6Var;
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            return null;
        }
    }

    public static void m1(int i10, boolean z10) {
        boolean[] zArr = C;
        if (zArr[i10]) {
            return;
        }
        if ((z10 || Math.abs((System.currentTimeMillis() / 1000) - D[i10]) >= 3600) && h10.i(i10).p()) {
            zArr[i10] = true;
            TL_account.getThemes getthemes = new TL_account.getThemes();
            getthemes.format = "android";
            if (!li.b0(i10).B0.isEmpty()) {
                getthemes.hash = E[i10];
            }
            if (org.telegram.messenger.r2.a) {
                Log.i("theme", "loading remote themes, hash " + getthemes.hash);
            }
            ConnectionsManager.getInstance(i10).sendRequest(getthemes, new ii.g2(i10, 3));
        }
    }

    public static void n(Paint paint) {
        paint.setShadowLayer(org.telegram.messenger.g0.N(1.0f), 0.0f, org.telegram.messenger.g0.N(0.33f), a);
    }

    public static Paint n0(int i10) {
        Paint paint = Bm;
        if (paint.getColor() != i10) {
            paint.setColor(i10);
        }
        return paint;
    }

    public static Bitmap n1(FileInputStream fileInputStream, int i10) {
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
                Point point = org.telegram.messenger.g0.q;
                int min = Math.min(point.x, point.y);
                int max = Math.max(point.x, point.y);
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
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                try {
                    fileInputStream.close();
                } catch (Exception unused3) {
                }
                return null;
            }
        } catch (Throwable th2) {
            try {
                fileInputStream.close();
            } catch (Exception unused4) {
            }
            throw th2;
        }
    }

    public static void o() {
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
                D0.setColor(x0(null, i14, false));
                E0.setColor(x0(null, i13, false));
                TextPaint textPaint = G0;
                int x02 = x0(null, m9, false);
                textPaint.linkColor = x02;
                textPaint.setColor(x02);
                u0.setColor(x0(null, t9, false));
                v0.setColor(x0(null, s9, false));
                I0.setColor(x0(null, q9, false));
                J0.setColor(x0(null, r9, false));
                TextPaint textPaint2 = K0;
                int i15 = Wl;
                textPaint2.setColor(x0(null, i15, false));
                TextPaint textPaint3 = L0;
                int i16 = W8;
                textPaint3.setColor(x0(null, i16, false));
                M0.setColor(x0(null, i16, false));
                TextPaint textPaint4 = N0;
                int i17 = f9;
                textPaint4.setColor(x0(null, i17, false));
                O0.setColor(x0(null, i17, false));
                Paint paint = w0;
                int i18 = U8;
                paint.setColor(x0(null, i18, false));
                Paint paint2 = y0;
                int i19 = V8;
                paint2.setColor(x0(null, i19, false));
                z0.setColor(x0(null, i11, false));
                x0.setColor(x0(null, x9, false));
                P0.setColor(x0(null, p6, false));
                Q0.setColor(x0(null, A6, false));
                D1(a9, a1);
                Drawable drawable = b1;
                int i20 = b9;
                D1(i20, drawable);
                D1(u9, T0);
                D1(G6, S0);
                Drawable drawable2 = V0;
                int i21 = v9;
                D1(i21, drawable2);
                D1(i21, W0);
                D1(w9, X0);
                D1(y9, Y0);
                D1(i20, j1);
                D1(i20, k1);
                D1(i15, l1);
                D1(i20, Z0);
                Drawable drawable3 = c1;
                int i22 = B9;
                D1(i22, drawable3);
                D1(i22, d1);
                D1(i22, e1);
                D1(i18, m1);
                D1(Z5, n1);
                D1(nk, o1);
                D1(i19, p1);
                D1(i19, q1);
                D1(i19, r1);
                D1(i12, t1);
                D1(z9, f1);
                D1(A9, i1);
                D1(A8, s1);
                kk0 kk0Var = g1;
                int i23 = j9;
                D1(i23, kk0Var);
                D1(i23, h1);
                return;
            }
            B0[i10].setColor(x0(null, i14, false));
            C0[i10].setColor(x0(null, i13, false));
            TextPaint textPaint5 = F0[i10];
            int x03 = x0(null, i12, false);
            textPaint5.linkColor = x03;
            textPaint5.setColor(x03);
            H0[i10].setColor(x0(null, i11, false));
            i10++;
        }
    }

    public static ColorFilter o0(e6 e6Var) {
        return e6Var != null ? e6Var.c() : v3;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void o1(boolean z10) {
        File file;
        TLRPC.Document document;
        boolean z11;
        float f10;
        float f11;
        TLRPC.WallPaper wallPaper;
        if (e0 != null) {
            return;
        }
        j6 j6Var = I;
        boolean z12 = j6Var.T && j6Var.Z == n;
        g6 k10 = j6Var.k(false);
        TLRPC.Document document2 = null;
        if (k10 != null) {
            File e10 = k10.e();
            boolean z13 = k10.q;
            TLRPC.TL_theme tL_theme = k10.r;
            TLRPC.ThemeSettings themeSettings = (tL_theme == null || tL_theme.settings.size() <= 0) ? null : k10.r.settings.get(0);
            if (k10.r != null && themeSettings != null && (wallPaper = themeSettings.wallpaper) != null) {
                document2 = wallPaper.document;
            }
            document = document2;
            z11 = z13;
            file = e10;
        } else {
            file = null;
            document = null;
            z11 = false;
        }
        j6 j6Var2 = I;
        b6 b6Var = j6Var2.j0;
        if (b6Var != null) {
            f11 = b6Var.k;
        } else {
            if (k10 == null) {
                f10 = j6Var2.E;
                int i10 = (int) f10;
                if (!z10) {
                    org.telegram.messenger.p5 p5Var = Utilities.i;
                    kg.q0 q0Var = new kg.q0(b6Var, file, i10, z11, document, z12);
                    d = q0Var;
                    p5Var.c(q0Var);
                    return;
                }
                Drawable p12 = p1(b6Var, file, i10, z11, document, z12);
                P();
                if (!b) {
                    j(p12);
                    h(p12);
                }
                hs.e().k(hs.z4, new Object[0]);
                return;
            }
            f11 = k10.p;
        }
        f10 = f11 * 100.0f;
        int i102 = (int) f10;
        if (!z10) {
        }
    }

    public static void p() {
        j6 j6Var;
        j6 j6Var2 = M;
        if (j6Var2 == null) {
            return;
        }
        O = false;
        if (R && (j6Var = J) != null) {
            u(j6Var, true, true);
        } else if (!P) {
            u(j6Var2, true, false);
        }
        P = false;
        M = null;
        F(false);
    }

    public static a8 p0(zi ziVar) {
        HashMap hashMap = e5;
        if (hashMap == null || ziVar == null) {
            return null;
        }
        return (a8) hashMap.get(ziVar);
    }

    public static Drawable p1(b6 b6Var, File file, int i10, boolean z10, TLRPC.Document document, boolean z11) {
        ke J10 = J(I, b6Var, im, file, h0, g0, i10, S, z11, O, P, z10, document, false);
        Boolean bool = (Boolean) J10.d;
        i0 = bool != null ? bool.booleanValue() : i0;
        Boolean bool2 = (Boolean) J10.e;
        j0 = bool2 != null ? bool2.booleanValue() : j0;
        Boolean bool3 = (Boolean) J10.f;
        W = bool3 != null ? bool3.booleanValue() : W;
        Drawable drawable = (Drawable) J10.b;
        e0 = drawable != null ? drawable : e0;
        int[] q10 = org.telegram.messenger.g0.q(drawable);
        int i11 = q10[0];
        c0 = i11;
        X = i11;
        int i12 = q10[1];
        d0 = i12;
        b0 = i12;
        i();
        return drawable;
    }

    public static void q() {
        if (Q1 == null) {
            return;
        }
        P1.setColor(x0(null, G6, false));
        P1.linkColor = x0(null, J6, false);
        D1(ni, Q1);
        D1(oi, R1);
    }

    public static File q0(String str) {
        long j10;
        File file = new File(org.telegram.messenger.t0.h(), str);
        try {
            InputStream open = org.telegram.messenger.t0.b.getAssets().open(str);
            j10 = open.available();
            open.close();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            j10 = 0;
        }
        if (!file.exists() || (j10 != 0 && file.length() != j10)) {
            try {
                InputStream open2 = org.telegram.messenger.t0.b.getAssets().open(str);
                try {
                    Typeface typeface = org.telegram.messenger.g0.a;
                    org.telegram.messenger.g0.D(open2, new FileOutputStream(file));
                    open2.close();
                } finally {
                }
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
            }
        }
        return file;
    }

    public static void q1(int i10, int i11, int... iArr) {
        for (int i12 : iArr) {
            zm[i12] = (i10 << 16) | i11;
        }
    }

    public static void r(float f10, float f11, int i10, int i11) {
        s(Y, Z, a0, i10, i11, f10, f11);
    }

    public static String r0(TLRPC.ThemeSettings themeSettings) {
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

    public static int r1(float f10, int i10) {
        return f10 == 1.0f ? i10 : i0.a.o(i10, be.b((int) (Color.alpha(i10) * f10), 0, hs.e4));
    }

    public static void s(Bitmap bitmap, BitmapShader bitmapShader, Matrix matrix, int i10, int i11, float f10, float f11) {
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

    public static Drawable s0() {
        Drawable t02 = t0();
        if (t02 != null || d == null) {
            return t02;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Utilities.i.c(new d4(countDownLatch, 4));
        try {
            countDownLatch.await();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        return t0();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00d1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d5 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int s1() {
        Sensor sensor;
        o5 o5Var;
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
                            w1();
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
                SensorManager sensorManager = (SensorManager) org.telegram.messenger.t0.b.getSystemService("sensor");
                e = sensorManager;
                f = sensorManager.getDefaultSensor(5);
            }
            if (!g && (sensor = f) != null && (o5Var = vm) != null) {
                e.registerListener(o5Var, sensor, 500000);
                g = true;
                if (org.telegram.messenger.r2.a) {
                    org.telegram.messenger.a8.b("light sensor registered");
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
            int i15 = org.telegram.messenger.t0.b.getResources().getConfiguration().uiMode & 48;
            if (i15 != 0 && i15 != 16) {
                if (i15 != 32) {
                    return 0;
                }
            }
        }
        if (i12 == 0) {
        }
    }

    public static void t(View view, View view2, e6 e6Var) {
        if (view == null || view2 == null) {
            return;
        }
        int[] iArr = wm;
        view.getLocationOnScreen(iArr);
        int i10 = iArr[0];
        int i11 = iArr[1];
        view2.getLocationOnScreen(iArr);
        if (view2 instanceof b71) {
            Bitmap bitmap = Y;
            if (bitmap != null) {
                float width = bitmap.getWidth();
                i10 = (int) ((((view2.getMeasuredWidth() - (Math.max(view2.getMeasuredWidth() / width, view2.getMeasuredHeight() / Y.getHeight()) * width)) / 2.0f) - ((b71) view2).J) + i10);
            } else {
                i10 = (int) (i10 + (-((b71) view2).J));
            }
            i11 = (int) (i11 + (-((b71) view2).K));
        }
        if (e6Var != null) {
            e6Var.b(i10, i11 - iArr[1], view2.getMeasuredWidth(), view2.getMeasuredHeight());
        } else {
            r(i10, i11 - iArr[1], view2.getMeasuredWidth(), view2.getMeasuredHeight());
        }
    }

    public static Drawable t0() {
        Drawable drawable = f0;
        return drawable != null ? drawable : e0;
    }

    public static void t1(boolean z10, boolean z11) {
        SparseIntArray clone = hm.clone();
        g6 k10 = I.k(false);
        boolean d10 = k10 != null ? k10.d(hm, clone) : true;
        g(hm, clone, I.q());
        f(hm, clone, I.q());
        km = d10;
        im = clone;
        if (!z11) {
            u1(!(LaunchActivity.Q() instanceof wm));
        }
        l();
        o();
        q();
        k(false, z10);
        org.telegram.messenger.g0.h3(new c9(3, !O));
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0045, code lost:
    
        if (r11 == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0047, code lost:
    
        r3 = org.telegram.messenger.hp.e1().edit();
        r3.putString("theme", r10.m());
        r3.apply();
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01d1 A[Catch: Exception -> 0x0031, TryCatch #5 {Exception -> 0x0031, blocks: (B:7:0x0013, B:10:0x0019, B:15:0x0022, B:16:0x0034, B:18:0x01c0, B:20:0x01c4, B:24:0x01d1, B:26:0x01e7, B:41:0x0047, B:42:0x0059, B:44:0x005f, B:45:0x0073, B:47:0x0086, B:55:0x00c2, B:106:0x01a8, B:113:0x01ba, B:115:0x0066, B:57:0x00c4, B:59:0x00da, B:61:0x00e6, B:64:0x00ea, B:66:0x00ed, B:68:0x00f7, B:70:0x0109, B:71:0x00fd, B:73:0x0107, B:77:0x010c, B:79:0x0119, B:81:0x0125, B:83:0x013d, B:85:0x0147, B:86:0x0153, B:88:0x015b, B:90:0x0165, B:91:0x0172, B:93:0x017a, B:95:0x0184, B:98:0x0191, B:100:0x019d), top: B:6:0x0013, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void u(j6 j6Var, boolean z10, boolean z11) {
        String[] split;
        if (j6Var == null) {
            return;
        }
        tm++;
        ThemeEditorView themeEditorView = ThemeEditorView.p;
        if (themeEditorView != null) {
            themeEditorView.b();
        }
        try {
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        if (j6Var.b == null && j6Var.d == null) {
            if (!z11 && z10) {
                SharedPreferences.Editor edit = hp.e1().edit();
                edit.remove("theme");
                edit.commit();
            }
            hm.clear();
            g0 = 0;
            h0 = null;
            e0 = null;
            f0 = null;
            if (!z11 && M == null) {
                K = j6Var;
                if (I != J) {
                    T = 2000;
                    U = SystemClock.elapsedRealtime();
                    org.telegram.messenger.g0.i3(new hc(15), 2100L);
                }
            }
            I = j6Var;
            t1(false, false);
            float f10 = org.telegram.ui.j5.k1;
            org.telegram.ui.j5.m1 = 1.0f - (Color.alpha(x0(null, lg, true)) / 255.0f);
            if (M == null || !z10 || Q) {
                return;
            }
            hp.s1(j6Var.F).x4(j6Var, j6Var.k(false), z11, false);
            return;
        }
        String[] strArr = new String[1];
        String str = j6Var.d;
        if (str != null) {
            hm = T0(null, str, null);
        } else {
            hm = T0(new File(j6Var.b), null, strArr);
        }
        g0 = hm.get(g5, -1);
        if (TextUtils.isEmpty(strArr[0])) {
            try {
                if (j6Var.c != null) {
                    new File(j6Var.c).delete();
                }
            } catch (Exception unused) {
            }
            j6Var.c = null;
            h0 = null;
        } else {
            h0 = strArr[0];
            String absolutePath = new File(org.telegram.messenger.t0.h(), Utilities.a(h0) + ".wp").getAbsolutePath();
            try {
                String str2 = j6Var.c;
                if (str2 != null && !str2.equals(absolutePath)) {
                    new File(j6Var.c).delete();
                }
            } catch (Exception unused2) {
            }
            j6Var.c = absolutePath;
            try {
                Uri parse = Uri.parse(h0);
                j6Var.e = parse.getQueryParameter("slug");
                String queryParameter = parse.getQueryParameter("mode");
                if (queryParameter != null && (split = queryParameter.toLowerCase().split(" ")) != null && split.length > 0) {
                    for (int i10 = 0; i10 < split.length; i10++) {
                        if ("blur".equals(split[i10])) {
                            j6Var.h = true;
                        } else if ("motion".equals(split[i10])) {
                            j6Var.n = true;
                        }
                    }
                }
                Utilities.z(parse.getQueryParameter("intensity"));
                j6Var.y = 45;
                try {
                    String queryParameter2 = parse.getQueryParameter("bg_color");
                    if (!TextUtils.isEmpty(queryParameter2)) {
                        j6Var.r = Integer.parseInt(queryParameter2.substring(0, 6), 16) | (-16777216);
                        if (queryParameter2.length() >= 13 && org.telegram.messenger.g0.S1(queryParameter2.charAt(6))) {
                            j6Var.s = Integer.parseInt(queryParameter2.substring(7, 13), 16) | (-16777216);
                        }
                        if (queryParameter2.length() >= 20 && org.telegram.messenger.g0.S1(queryParameter2.charAt(13))) {
                            j6Var.w = Integer.parseInt(queryParameter2.substring(14, 20), 16) | (-16777216);
                        }
                        if (queryParameter2.length() == 27 && org.telegram.messenger.g0.S1(queryParameter2.charAt(20))) {
                            j6Var.x = Integer.parseInt(queryParameter2.substring(21), 16) | (-16777216);
                        }
                    }
                } catch (Exception unused3) {
                }
                try {
                    String queryParameter3 = parse.getQueryParameter("rotation");
                    if (!TextUtils.isEmpty(queryParameter3)) {
                        j6Var.y = Utilities.z(queryParameter3).intValue();
                    }
                } catch (Exception unused4) {
                }
            } catch (Throwable th2) {
                org.telegram.messenger.a8.g(th2, true);
            }
        }
        if (!z11) {
            K = j6Var;
            if (I != J) {
            }
        }
        I = j6Var;
        t1(false, false);
        float f102 = org.telegram.ui.j5.k1;
        org.telegram.ui.j5.m1 = 1.0f - (Color.alpha(x0(null, lg, true)) / 255.0f);
        if (M == null) {
        }
    }

    public static nu0 u0(int i10) {
        if (i10 < 0 || i10 > 5) {
            return null;
        }
        nu0[] nu0VarArr = u3;
        nu0 nu0Var = nu0VarArr[i10];
        if (nu0Var != null) {
            return nu0Var;
        }
        if (i10 == 0) {
            nu0VarArr[0] = new p31(true);
        } else if (i10 == 1) {
            nu0VarArr[1] = new ap(true);
        } else if (i10 == 2) {
            nu0VarArr[2] = new gn0(true);
        } else if (i10 == 3) {
            nu0VarArr[3] = new ke0(null, true);
        } else if (i10 == 4) {
            nu0VarArr[4] = new hk0(true);
        } else if (i10 == 5) {
            nu0VarArr[5] = new ap();
        }
        nu0 nu0Var2 = nu0VarArr[i10];
        nu0Var2.d();
        nu0Var2.b(x0(null, p9, false));
        return nu0Var2;
    }

    public static void u1(boolean z10) {
        d9 d9Var = V;
        if (d9Var != null) {
            d9Var.dispose();
            V = null;
        }
        Drawable drawable = e0;
        if (drawable instanceof la0) {
            S = ((la0) drawable).i;
        } else {
            S = 0;
        }
        e0 = null;
        f0 = null;
        o1(z10);
    }

    public static j6 v(File file, String str, TLRPC.TL_theme tL_theme, boolean z10) {
        File file2;
        String str2;
        try {
            if (!str.toLowerCase().endsWith(".attheme")) {
                str = str.concat(".attheme");
            }
            if (z10) {
                hs.e().k(hs.u4, new Object[0]);
                j6 j6Var = new j6();
                j6Var.a = str;
                j6Var.G = tL_theme;
                j6Var.b = file.getAbsolutePath();
                j6Var.F = h10.t0;
                M = D0();
                O = true;
                P = false;
                u(j6Var, false, false);
                return j6Var;
            }
            if (tL_theme != null) {
                str2 = "remote" + tL_theme.id;
                file2 = new File(org.telegram.messenger.t0.h(), str2 + ".attheme");
            } else {
                file2 = new File(org.telegram.messenger.t0.h(), str);
                str2 = str;
            }
            if (!org.telegram.messenger.g0.E(file, file2)) {
                p();
                return null;
            }
            M = null;
            O = false;
            P = false;
            HashMap hashMap = H;
            j6 j6Var2 = (j6) hashMap.get(str2);
            if (j6Var2 == null) {
                j6Var2 = new j6();
                j6Var2.a = str;
                j6Var2.F = h10.t0;
                ArrayList arrayList = F;
                arrayList.add(j6Var2);
                G.add(j6Var2);
                Collections.sort(arrayList, new tq(15));
            } else {
                hashMap.remove(str2);
            }
            j6Var2.G = tL_theme;
            j6Var2.b = file2.getAbsolutePath();
            hashMap.put(j6Var2.m(), j6Var2);
            y1(true, false);
            u(j6Var2, true, false);
            return j6Var2;
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            return null;
        }
    }

    public static int v0(int i10) {
        return x0(null, i10, false);
    }

    public static void v1(boolean z10) {
        if (!z10) {
            I.v(null);
        } else {
            P = false;
            u1(true);
        }
    }

    public static int w(int i10, int i11) {
        float alpha = Color.alpha(i11) / 255.0f;
        float alpha2 = Color.alpha(i10) / 255.0f;
        float f10 = 1.0f - alpha;
        float f11 = (alpha2 * f10) + alpha;
        if (f11 == 0.0f) {
            return 0;
        }
        return Color.argb((int) (255.0f * f11), (int) ((((Color.red(i10) * alpha2) * f10) + (Color.red(i11) * alpha)) / f11), (int) ((((Color.green(i10) * alpha2) * f10) + (Color.green(i11) * alpha)) / f11), (int) ((((Color.blue(i10) * alpha2) * f10) + (Color.blue(i11) * alpha)) / f11));
    }

    public static int w0(int i10, e6 e6Var) {
        Integer z02;
        return e6Var != null ? (!e6Var.e() || (z02 = z0(i10, e6Var)) == null) ? e6Var.h(i10) : z02.intValue() : v0(i10);
    }

    public static void w1() {
        SharedPreferences.Editor edit = hp.e1().edit();
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
        j6 j6Var = J;
        if (j6Var != null) {
            edit.putString("nighttheme", j6Var.m());
        } else {
            edit.remove("nighttheme");
        }
        edit.commit();
    }

    public static int x(int i10, boolean z10, boolean z11) {
        if (z10) {
            return r1(z11 ? 0.22f : 0.12f, -1);
        }
        int i11 = z11 ? -3813931 : -1972501;
        float[] P02 = P0(3);
        Color.colorToHSV(i10, P02);
        return P02[1] > 0.02f ? c(i11, i10) : i11;
    }

    public static int x0(boolean[] zArr, int i10, boolean z10) {
        SparseIntArray sparseIntArray;
        int indexOfKey;
        Integer z02;
        return (!az.H0 || (z02 = z0(i10, null)) == null) ? (z10 || (sparseIntArray = jm) == null || (indexOfKey = sparseIntArray.indexOfKey(i10)) < 0) ? y0(im, i10, zArr) : jm.valueAt(indexOfKey) : z02.intValue();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(24:0|1|(1:3)(1:160)|(1:5)(1:159)|(1:8)|9|(1:158)(1:13)|(1:15)(1:157)|16|(5:(1:19)(1:42)|(1:21)(1:41)|(1:23)(1:40)|(1:25)(1:39)|(4:28|(2:30|(1:32))|(1:38)(1:36)|37))|43|(12:45|(2:46|(3:48|(2:51|52)|53)(0))|63|64|65|(1:71)|72|(2:74|(2:98|99))(2:104|(3:106|(1:108)|(1:111)))|(6:77|(1:79)|80|(1:82)|(1:84)|85)|87|88|(2:90|91)(1:93))(2:140|(4:143|(2:146|147)|148|141))|62|63|64|65|(3:67|69|71)|72|(0)(0)|(0)|87|88|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x010d, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x010e, code lost:
    
        r7 = r3;
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x020c, code lost:
    
        org.telegram.messenger.a8.g(r0, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x020f, code lost:
    
        if (r7 != null) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0211, code lost:
    
        r7.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0215, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0228, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0229, code lost:
    
        r1 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x022a, code lost:
    
        if (r7 == null) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x022c, code lost:
    
        r7.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:?, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0230, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0231, code lost:
    
        org.telegram.messenger.a8.g(r0, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0235, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:?, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0108, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0109, code lost:
    
        r1 = r0;
        r7 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0209, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x020a, code lost:
    
        r2 = true;
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0205, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0206, code lost:
    
        r1 = r0;
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01ff, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0200, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0201, code lost:
    
        org.telegram.messenger.a8.g(r0, r2);
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x017a A[Catch: all -> 0x0108, Exception -> 0x010d, TryCatch #9 {Exception -> 0x010d, all -> 0x0108, blocks: (B:65:0x00f2, B:67:0x00f8, B:69:0x00fc, B:71:0x0102, B:72:0x0112, B:74:0x0125, B:77:0x01a6, B:79:0x01b2, B:80:0x01d2, B:82:0x01d8, B:84:0x01dc, B:85:0x01e5, B:103:0x0176, B:104:0x017a, B:106:0x017e, B:108:0x0187, B:111:0x01a2), top: B:64:0x00f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x022c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:132:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0125 A[Catch: all -> 0x0108, Exception -> 0x010d, TRY_LEAVE, TryCatch #9 {Exception -> 0x010d, all -> 0x0108, blocks: (B:65:0x00f2, B:67:0x00f8, B:69:0x00fc, B:71:0x0102, B:72:0x0112, B:74:0x0125, B:77:0x01a6, B:79:0x01b2, B:80:0x01d2, B:82:0x01d8, B:84:0x01dc, B:85:0x01e5, B:103:0x0176, B:104:0x017a, B:106:0x017e, B:108:0x0187, B:111:0x01a2), top: B:64:0x00f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a6 A[Catch: all -> 0x0108, Exception -> 0x010d, TryCatch #9 {Exception -> 0x010d, all -> 0x0108, blocks: (B:65:0x00f2, B:67:0x00f8, B:69:0x00fc, B:71:0x0102, B:72:0x0112, B:74:0x0125, B:77:0x01a6, B:79:0x01b2, B:80:0x01d2, B:82:0x01d8, B:84:0x01dc, B:85:0x01e5, B:103:0x0176, B:104:0x017a, B:106:0x017e, B:108:0x0187, B:111:0x01a2), top: B:64:0x00f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void x1(j6 j6Var, boolean z10, boolean z11, boolean z12) {
        b6 b6Var = j6Var.j0;
        String b12 = b6Var != null ? b1(b6Var) : h0;
        Drawable drawable = z11 ? e0 : f0;
        if (z11 && drawable != null) {
            f0 = e0;
        }
        g6 k10 = I.k(false);
        boolean z13 = I.T && k10.a == n;
        SparseIntArray sparseIntArray = z13 ? null : im;
        StringBuilder sb2 = new StringBuilder();
        if (!z13) {
            int i10 = k10 != null ? k10.e : 0;
            int i11 = k10 != null ? k10.f : 0;
            int i12 = k10 != null ? k10.g : 0;
            int i13 = k10 != null ? k10.h : 0;
            if (i10 != 0 && i11 != 0) {
                sparseIntArray.put(ob, i10);
                sparseIntArray.put(rb, i11);
                if (i12 != 0) {
                    sparseIntArray.put(sb, i12);
                    if (i13 != 0) {
                        sparseIntArray.put(tb, i13);
                    }
                }
                sparseIntArray.put(Oc, (k10 == null || !k10.i) ? 0 : 1);
            }
        }
        int i14 = Ee;
        int i15 = De;
        int i16 = Ce;
        int i17 = Be;
        if (z13) {
            int i18 = 0;
            while (true) {
                int[] iArr = em;
                if (i18 < iArr.length) {
                    int i19 = iArr[i18];
                    if ((!(drawable instanceof BitmapDrawable) && b12 == null) || (i17 != i18 && i16 != i18 && i15 != i18 && i14 != i18)) {
                        sb2.append(u4.c(i18));
                        sb2.append("=");
                        sb2.append(i19);
                        sb2.append("\n");
                    }
                    i18++;
                }
            }
            FileOutputStream fileOutputStream = new FileOutputStream(j6Var.b);
            if (sb2.length() == 0 && !(drawable instanceof BitmapDrawable) && TextUtils.isEmpty(b12)) {
                sb2.append(' ');
            }
            fileOutputStream.write(org.telegram.messenger.g0.h1(sb2.toString()));
            if (TextUtils.isEmpty(b12)) {
                fileOutputStream.write(org.telegram.messenger.g0.h1("WLS=" + b12 + "\n"));
                if (z11) {
                    try {
                        Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                        FileOutputStream fileOutputStream2 = new FileOutputStream(new File(org.telegram.messenger.t0.h(), Utilities.a(b12) + ".wp"));
                        bitmap.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream2);
                        fileOutputStream2.close();
                    } catch (Throwable th2) {
                        org.telegram.messenger.a8.g(th2, true);
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
                if (hashMap.get(j6Var.m()) == null) {
                    ArrayList arrayList = F;
                    arrayList.add(j6Var);
                    hashMap.put(j6Var.m(), j6Var);
                    G.add(j6Var);
                    y1(true, false);
                    Collections.sort(arrayList, new tq(15));
                }
                I = j6Var;
                if (j6Var != J) {
                    K = j6Var;
                }
                if (z13) {
                    hm.clear();
                    t1(false, false);
                }
                SharedPreferences.Editor edit = hp.e1().edit();
                edit.putString("theme", K.m());
                edit.apply();
            }
            fileOutputStream.close();
            if (z10) {
                hp.s1(j6Var.F).y4(j6Var, j6Var.k(false));
                return;
            }
            return;
        }
        for (int i20 = 0; i20 < sparseIntArray.size(); i20++) {
            int keyAt = sparseIntArray.keyAt(i20);
            int valueAt = sparseIntArray.valueAt(i20);
            if ((!(drawable instanceof BitmapDrawable) && b12 == null) || (i17 != keyAt && i16 != keyAt && i15 != keyAt && i14 != keyAt)) {
                sb2.append(u4.c(keyAt));
                sb2.append("=");
                sb2.append(valueAt);
                sb2.append("\n");
            }
        }
        FileOutputStream fileOutputStream3 = new FileOutputStream(j6Var.b);
        if (sb2.length() == 0) {
            sb2.append(' ');
        }
        fileOutputStream3.write(org.telegram.messenger.g0.h1(sb2.toString()));
        if (TextUtils.isEmpty(b12)) {
        }
        if (!z12) {
        }
        fileOutputStream3.close();
        if (z10) {
        }
    }

    public static int y(int i10, boolean z10, boolean z11, boolean z12) {
        if (z10) {
            return r1(z12 ? 0.62f : 0.18f, -1);
        }
        int i11 = z12 ? -6380376 : -2565928;
        float[] P02 = P0(3);
        Color.colorToHSV(i10, P02);
        return (!z11 || P02[1] <= 0.02f) ? i11 : c(i11, i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0072, code lost:
    
        if (r2.i == r0.i) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00c4, code lost:
    
        if (r2.i == r0.i) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00fc, code lost:
    
        if (r2.c == r0.c) goto L91;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int y0(SparseIntArray sparseIntArray, int i10, boolean[] zArr) {
        int indexOfKey;
        if (Z != null && (Wc == i10 || Xc == i10 || Yc == i10 || Jd == i10 || Ld == i10 || Pd == i10)) {
            return -1;
        }
        j6 j6Var = I;
        j6 j6Var2 = L;
        int i11 = ad;
        int i12 = Zc;
        if (j6Var == j6Var2) {
            int i13 = nb;
            int i14 = n;
            if (i10 < i13 || i10 >= ub) {
                if (i10 < vb || i10 >= Hc) {
                    if (Be != i10 && Ce != i10 && De != i10 && Ee != i10 && j6Var.T) {
                        if (j6Var.Z != i14) {
                            g6 g6Var = (g6) j6Var.b0.get(i14);
                            g6 g6Var2 = (g6) j6Var.b0.get(j6Var.Z);
                            if (g6Var2 != null) {
                                if (g6Var != null) {
                                }
                            }
                        }
                        return i10 == i12 ? X : i10 == i11 ? b0 : F0(i10);
                    }
                } else if (j6Var.T) {
                    if (j6Var.Z != i14) {
                        g6 g6Var3 = (g6) j6Var.b0.get(i14);
                        g6 g6Var4 = (g6) j6Var.b0.get(j6Var.Z);
                        if (g6Var3 != null) {
                            if (g6Var4 != null) {
                                if (g6Var3.d == g6Var4.d) {
                                    if (g6Var3.e == g6Var4.e) {
                                        if (g6Var3.f == g6Var4.f) {
                                            if (g6Var3.g == g6Var4.g) {
                                                if (g6Var3.h == g6Var4.h) {
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
            } else if (j6Var.T) {
                if (j6Var.Z != i14) {
                    g6 g6Var5 = (g6) j6Var.b0.get(i14);
                    g6 g6Var6 = (g6) j6Var.b0.get(j6Var.Z);
                    if (g6Var5 != null) {
                        if (g6Var6 != null) {
                            if (g6Var5.e == g6Var6.e) {
                                if (g6Var5.f == g6Var6.f) {
                                    if (g6Var5.g == g6Var6.g) {
                                        if (g6Var5.h == g6Var6.h) {
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
            return (d6 == i10 || a7 == i10 || s8 == i10 || M8 == i10) ? valueAt | (-16777216) : valueAt;
        }
        int i15 = fm.get(i10, -1);
        if (i15 != -1 && (indexOfKey = sparseIntArray.indexOfKey(i15)) >= 0) {
            return sparseIntArray.valueAt(indexOfKey);
        }
        if (zArr != null) {
            zArr[0] = true;
        }
        return i10 == i12 ? X : i10 == i11 ? b0 : F0(i10);
    }

    public static void y1(boolean z10, boolean z11) {
        boolean z12;
        ArrayList arrayList;
        JSONObject jSONObject;
        int i10 = 0;
        SharedPreferences.Editor edit = org.telegram.messenger.t0.b.getSharedPreferences("themeconfig", 0).edit();
        if (z10) {
            JSONArray jSONArray = new JSONArray();
            int i11 = 0;
            while (true) {
                ArrayList arrayList2 = G;
                if (i11 >= arrayList2.size()) {
                    break;
                }
                j6 j6Var = (j6) arrayList2.get(i11);
                j6Var.getClass();
                try {
                    jSONObject = new JSONObject();
                    jSONObject.put("name", j6Var.a);
                    jSONObject.put("path", j6Var.b);
                    jSONObject.put("account", j6Var.F);
                    TLRPC.TL_theme tL_theme = j6Var.G;
                    if (tL_theme != null) {
                        SerializedData serializedData = new SerializedData(tL_theme.getObjectSize());
                        j6Var.G.serializeToStream(serializedData);
                        jSONObject.put("info", Utilities.f(serializedData.toByteArray()));
                    }
                    jSONObject.put("loaded", j6Var.H);
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
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
                j6 j6Var2 = (j6) H.get(i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? "Night" : "Day" : "Arctic Blue" : "Dark Blue" : "Blue");
                if (j6Var2 == null || (arrayList = j6Var2.c0) == null || arrayList.isEmpty()) {
                    z12 = z11;
                } else {
                    z12 = z11;
                    z1(j6Var2, true, false, false, false, z12);
                }
                i10++;
                z11 = z12;
            }
        }
    }

    public static int z(int i10, boolean z10, boolean z11) {
        if (z10 && z11) {
            return r1(0.07f, -1);
        }
        float[] P02 = P0(3);
        Color.colorToHSV(i10, P02);
        if (z10) {
            P02[2] = Math.min(1.0f, P02[2] + 0.07f);
            if (z11) {
                P02[1] = Math.min(1.0f, P02[1] + 0.02f);
            }
        } else {
            P02[2] = Math.max(0.0f, P02[2] - (z11 ? 0.06f : 0.03f));
            if (z11) {
                float f10 = P02[1];
                if (f10 > 0.02f) {
                    P02[1] = Math.min(1.0f, f10 + 0.02f);
                }
            }
        }
        return Color.HSVToColor(Color.alpha(i10), P02);
    }

    public static Integer z0(int i10, e6 e6Var) {
        int i11;
        if (!i1(e6Var) || i10 < 0 || i10 >= (i11 = f5)) {
            return null;
        }
        if (zm == null) {
            zm = new int[i11];
            q1(2, Ma, gc, bc, Fb, Gb);
            q1(3, Ra, be, ce, ld, md);
            q1(1, Na, xb, yb, zb, Ab, Bb, Cb);
            q1(1, Pa, Ob, Pb);
            q1(1, Qa, Qb, Rb, Sb, Tb);
            q1(1, Ya, Jb, Kb, Lb, Mb, Nb, Nc, Vb, Wb, hc, tc, Dc, Hb, Ib, Hd, Ub, cc, dc);
            q1(1, Za, Bc, Cc, Ec, nc, qc);
            q1(1, ab, Db, Eb, Fc, ec, fc);
            q1(2, bb, uc, vc, yc, zc, ic, jc);
            q1(2, cb, kc, mc, oc, pc, rc, sc, wc, xc, gl, pl);
            q1(2, db, il, kl);
            q1(1, Ua, ge, he);
            q1(1, Va, oe);
            q1(1, Wa, me, ne);
            q1(1, Xa, qk);
            q1(1, Fa, Ad, Fd, Ld, Pd);
        }
        int i12 = zm[i10];
        if (i12 == 0) {
            return null;
        }
        int i13 = 65535 & i12;
        int i14 = i12 >> 16;
        int i15 = ua;
        return i14 != 2 ? i14 != 3 ? Integer.valueOf(w0(i13, e6Var)) : Integer.valueOf(i0.a.k(w0(i13, e6Var), w0(i15, e6Var))) : Integer.valueOf(i0.a.k(w0(i13, e6Var), i0.a.k(w0(La, e6Var), w0(i15, e6Var))));
    }

    public static void z1(j6 j6Var, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        if (z10) {
            SharedPreferences.Editor edit = org.telegram.messenger.t0.b.getSharedPreferences("themeconfig", 0).edit();
            if (!z12) {
                int size = j6Var.c0.size();
                int max = Math.max(0, size - j6Var.X);
                SerializedData serializedData = new SerializedData(((max * 16) + 2) * 4);
                serializedData.writeInt32(9);
                serializedData.writeInt32(max);
                for (int i10 = 0; i10 < size; i10++) {
                    g6 g6Var = (g6) j6Var.c0.get(i10);
                    int i11 = g6Var.a;
                    if (i11 >= 100) {
                        serializedData.writeInt32(i11);
                        serializedData.writeInt32(g6Var.c);
                        serializedData.writeInt32(g6Var.d);
                        serializedData.writeInt32(g6Var.e);
                        serializedData.writeInt32(g6Var.f);
                        serializedData.writeInt32(g6Var.g);
                        serializedData.writeInt32(g6Var.h);
                        serializedData.writeBool(g6Var.i);
                        serializedData.writeInt64(g6Var.j);
                        serializedData.writeInt64(g6Var.k);
                        serializedData.writeInt64(g6Var.l);
                        serializedData.writeInt64(g6Var.m);
                        serializedData.writeInt32(g6Var.n);
                        serializedData.writeInt64(0L);
                        serializedData.writeDouble(g6Var.p);
                        serializedData.writeBool(g6Var.q);
                        serializedData.writeString(g6Var.o);
                        serializedData.writeBool(g6Var.r != null);
                        if (g6Var.r != null) {
                            serializedData.writeInt32(g6Var.t);
                            g6Var.r.serializeToStream(serializedData);
                        }
                    }
                }
                edit.putString("accents_" + j6Var.d, Base64.encodeToString(serializedData.toByteArray(), 3));
                if (!z14) {
                    hs.e().k(hs.q4, new Object[0]);
                }
                if (z13) {
                    hp.s1(h10.t0).y4(j6Var, j6Var.k(false));
                }
            }
            edit.putInt("accent_current_" + j6Var.d, j6Var.Z);
            edit.commit();
        } else {
            if (j6Var.a0 != -1) {
                if (z11) {
                    g6 g6Var2 = (g6) j6Var.b0.get(j6Var.Z);
                    j6Var.b0.remove(g6Var2.a);
                    j6Var.c0.remove(g6Var2);
                    TLRPC.TL_theme tL_theme = g6Var2.r;
                    if (tL_theme != null) {
                        j6Var.d0.remove(tL_theme.id);
                    }
                }
                j6Var.Z = j6Var.a0;
                g6 k10 = j6Var.k(false);
                if (k10 != null) {
                    j6Var.j0 = k10.y;
                } else {
                    j6Var.j0 = null;
                }
            }
            if (I == j6Var) {
                t1(false, false);
            }
        }
        j6Var.a0 = -1;
    }
}
