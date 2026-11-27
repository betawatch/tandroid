package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.graphics.SurfaceTexture;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.media.AudioManager;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.SystemClock;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.URLSpan;
import android.transition.ChangeBounds;
import android.transition.Fade;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.util.Pair;
import android.util.Property;
import android.util.Range;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Scroller;
import android.widget.Space;
import android.widget.TextView;
import android.widget.Toast;
import android.window.OnBackInvokedDispatcher;
import androidx.core.content.FileProvider;
import j$.util.Objects;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.camera.Size;
import org.telegram.messenger.video.VideoAds;
import org.telegram.messenger.video.VideoFramesRewinder;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.CheckBox;
import org.telegram.ui.Components.ClippingImageView;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.PhotoViewer;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public class PhotoViewer implements fn7, qu4, pu4, s84 {
    public static Drawable[] d9;
    public static final Paint e9 = new Paint(2);
    public static final HashMap f9 = new HashMap();
    public static DecelerateInterpolator g9;
    public static Paint h9;
    public static final Property i9;
    public static volatile PhotoViewer j9;
    public static volatile PhotoViewer k9;
    public k8 A0;
    public rec A1;
    public View A2;
    public final int[] A3;
    public ImageReceiver A4;
    public boolean A5;
    public float A6;
    public boolean A7;
    public long A8;
    public s6 B0;
    public cz9 B1;
    public AnimatorSet B2;
    public boolean B3;
    public ImageReceiver B4;
    public byte B5;
    public float B6;
    public boolean B7;
    public float B8;
    public s7 C0;
    public AnimatorSet C1;
    public TextureView C2;
    public Bitmap C3;
    public ImageReceiver C4;
    public long C5;
    public float C6;
    public c C7;
    public pc8 C8;
    public s7 D0;
    public k88 D1;
    public SurfaceView D2;
    public Bitmap D3;
    public fi0 D4;
    public long D5;
    public float D6;
    public final float[] D7;
    public r47 D8;
    public Activity E;
    public s7 E0;
    public final u33 E1;
    public boolean E2;
    public ImageView E3;
    public fi0 E4;
    public w49 E5;
    public float E6;
    public final float[] E7;
    public boolean E8;
    public ContextThemeWrapper F;
    public s7 F0;
    public u33 F1;
    public zc8 F2;
    public boolean F3;
    public fi0 F4;
    public String F5;
    public float F6;
    public ObjectAnimator F7;
    public boolean F8;
    public y10 G;
    public b8 G0;
    public u33 G1;
    public kfc G2;
    public byte G3;
    public boolean G4;
    public boolean G5;
    public float G6;
    public byte G7;
    public boolean G8;
    public ImageView H;
    public p10 H0;
    public fo6 H1;
    public boolean H2;
    public boolean H3;
    public boolean H4;
    public long H5;
    public boolean H6;
    public u8a H7;
    public boolean H8;
    public Drawable I;
    public oob I0;
    public fo6 I1;
    public Runnable I2;
    public boolean I3;
    public boolean I4;
    public int I5;
    public boolean I6;
    public float I7;
    public String I8;
    public tk0 J;
    public oob J0;
    public c98 J1;
    public boolean J2;
    public boolean J3;
    public boolean J4;
    public int J5;
    public boolean J6;
    public float J7;
    public final mm J8;
    public boolean K;
    public dh2 K0;
    public AnimatorSet K1;
    public float K2;
    public boolean K3;
    public boolean K4;
    public int K5;
    public boolean K6;
    public final y98 K7;
    public mm[] K8;
    public boolean L;
    public final HashMap L0;
    public rx5 L1;
    public float L2;
    public boolean L3;
    public final Matrix L4;
    public boolean L5;
    public byte L6;
    public Path L7;
    public RectF L8;
    public AnimatorSet M;
    public final BackgroundDrawable M0;
    public hc8 M1;
    public float M2;
    public boolean M3;
    public final Paint M4;
    public boolean M5;
    public byte M6;
    public Paint M7;
    public RectF M8;
    public dd8 N;
    public final Paint N0;
    public boolean N1;
    public float N2;
    public float N3;
    public Bitmap N4;
    public boolean N5;
    public boolean N6;
    public Paint N7;
    public Matrix N8;
    public cd8 O;
    public CheckBox O0;
    public gc8 O1;
    public float O2;
    public long O3;
    public int O4;
    public final boolean[] O5;
    public boolean O6;
    public LinearGradient O7;
    public float[] O8;
    public boolean P;
    public CounterView P0;
    public boolean P1;
    public float P2;
    public boolean P3;
    public int P4;
    public boolean P5;
    public boolean P6;
    public LinearGradient P7;
    public RenderNode P8;
    public boolean Q;
    public jo0 Q0;
    public id Q1;
    public boolean Q2;
    public boolean Q3;
    public boolean Q4;
    public boolean Q5;
    public boolean Q6;
    public Matrix Q7;
    public RenderNode Q8;
    public kb8 R;
    public FrameLayout R0;
    public wc8 R1;
    public int R2;
    public boolean R3;
    public boolean R4;
    public boolean R5;
    public boolean R6;
    public Matrix R7;
    public final qeb R8;
    public boolean S;
    public FrameLayout S0;
    public FrameLayout S1;
    public kfc S2;
    public long S3;
    public r47 S4;
    public boolean S5;
    public byte S6;
    public final int[] S7;
    public final zh6 S8;
    public Paint T;
    public di3 T0;
    public TextView T1;
    public SurfaceTexture T2;
    public View T3;
    public VideoAds T4;
    public boolean T5;
    public VelocityTracker T6;
    public gd8 T7;
    public boolean T8;
    public int U;
    public n85 U0;
    public ic8 U1;
    public boolean U2;
    public fb8 U3;
    public ArrayList U4;
    public boolean U5;
    public Scroller U6;
    public pa2 U7;
    public me8 U8;
    public int V;
    public pa2 V0;
    public pb8 V1;
    public boolean V2;
    public int V3;
    public Uri V4;
    public float V5;
    public final ArrayList V6;
    public RadialProgressView V7;
    public float V8;
    public int W;
    public TextView W0;
    public qb8 W1;
    public boolean W2;
    public cv3 W3;
    public final xc8 W4;
    public float W5;
    public final SparseArray[] W6;
    public FrameLayout W7;
    public boolean W8;
    public float X;
    public final lb8[] X0;
    public float X1;
    public boolean X2;
    public int X3;
    public TLRPC.BotInlineResult X4;
    public float X5;
    public final ArrayList X6;
    public mb8 X7;
    public boolean X8;
    public wa8 Y;
    public ei1 Y0;
    public d26 Y1;
    public boolean Y2;
    public byte Y3;
    public jn5 Y4;
    public float Y5;
    public final SparseArray[] Y6;
    public TextView Y7;
    public final RectF Y8;
    public ll0 Z;
    public ImageView Z0;
    public FrameLayout Z1;
    public boolean Z2;
    public boolean Z3;
    public jn5 Z4;
    public float Z5;
    public final ArrayList Z6;
    public AnimatorSet Z7;
    public boolean Z8;
    public final fm0 a = new fm0(0, this, k43.h, 380, false);
    public r89 a0;
    public ImageView a1;
    public FrameLayout a2;
    public float a3;
    public final ob2 a4;
    public oy9 a5;
    public float a6;
    public final ArrayList a7;
    public long a8;
    public boolean a9;
    public final boolean b;
    public r89 b0;
    public ImageView b1;
    public n12 b2;
    public String b3;
    public final VideoFramesRewinder b4;
    public final String[] b5;
    public float b6;
    public final ArrayList b7;
    public long b8;
    public final y98 b9;
    public int c;
    public tl0 c0;
    public ImageView c1;
    public e26 c2;
    public String c3;
    public final yb8 c4;
    public fd8 c5;
    public float c6;
    public final ArrayList c7;
    public long c8;
    public final hb8 c9;
    public ed8 d;
    public xl0 d0;
    public ImageView d1;
    public int d2;
    public long d3;
    public final w10 d4;
    public String d5;
    public float d6;
    public final ArrayList d7;
    public volatile int d8;
    public boolean e;
    public WindowManager.LayoutParams e0;
    public pb2 e1;
    public boolean e2;
    public float e3;
    public String e4;
    public long e5;
    public float e6;
    public final ArrayList e7;
    public volatile int e8;
    public boolean f;
    public ad8 f0;
    public d7 f1;
    public boolean f2;
    public boolean f3;
    public boolean f4;
    public String f5;
    public float f6;
    public final ArrayList f7;
    public int f8;
    public nc8 g0;
    public s96 g1;
    public boolean g2;
    public long g3;
    public boolean g4;
    public boolean g5;
    public float g6;
    public jn5 g7;
    public int g8;
    public int h;
    public z h0;
    public nb8 h1;
    public boolean h2;
    public boolean h3;
    public final ob8 h4;
    public TL_iv.PageBlock h5;
    public float h6;
    public a0 h7;
    public volatile int h8;
    public ClippingImageView i0;
    public ArrayList i1;
    public boolean i2;
    public kd8 i3;
    public final ob8 i4;
    public mn5 i5;
    public float i6;
    public bd8 i7;
    public volatile int i8;
    public b6 j0;
    public ArrayList j1;
    public boolean j2;
    public String j3;
    public final float[][] j4;
    public boolean j5;
    public float j6;
    public final Rect j7;
    public volatile int j8;
    public View k0;
    public iec k1;
    public lm k2;
    public ValueAnimator k3;
    public zu1 k4;
    public boolean k5;
    public float k6;
    public lfc k7;
    public volatile int k8;
    public int l0;
    public kg5 l1;
    public boolean l2;
    public boolean l3;
    public org.telegram.ui.ActionBar.e l4;
    public boolean l5;
    public float l6;
    public Uri l7;
    public volatile int l8;
    public TextView m0;
    public wd5 m1;
    public boolean m2;
    public final int[] m3;
    public byte m4;
    public boolean m5;
    public long m6;
    public long m7;
    public volatile int m8;
    public boolean n;
    public TextView n0;
    public kxb n1;
    public boolean n2;
    public final int[] n3;
    public long n4;
    public String n5;
    public int n6;
    public final y98 n7;
    public float n8;
    public TextView o0;
    public UndoView o1;
    public boolean o2;
    public ema o3;
    public Runnable o4;
    public k3b o5;
    public AnimatorSet o6;
    public b8 o7;
    public int o8;
    public s7 p0;
    public jd8 p1;
    public xn5 p2;
    public ImageView p3;
    public fd8 p4;
    public ld8 p5;
    public AnimatorSet p6;
    public v86 p7;
    public volatile boolean p8;
    public s7 q0;
    public t20 q1;
    public boolean q2;
    public sfc q3;
    public fd8 q4;
    public ArrayList q5;
    public ru4 q6;
    public final pn q7;
    public volatile boolean q8;
    public boolean r;
    public b8 r0;
    public ImageReceiver r1;
    public dc7 r2;
    public tb r3;
    public boolean r4;
    public vl4 r5;
    public boolean r6;
    public e26 r7;
    public long r8;
    public boolean s;
    public w7 s0;
    public boolean s1;
    public boolean s2;
    public zb8 s3;
    public boolean s4;
    public sc8 s5;
    public final DecelerateInterpolator s6;
    public v21 s7;
    public long s8;
    public b8 t0;
    public final y98 t1;
    public final Rect t2;
    public AnimatorSet t3;
    public byte t4;
    public LinearLayout t5;
    public float t6;
    public int t7;
    public float t8;
    public b8 u0;
    public float u1;
    public boolean u2;
    public boolean u3;
    public final y98 u4;
    public sc8 u5;
    public float u6;
    public boolean u7;
    public float u8;
    public k8 v0;
    public long v1;
    public boolean v2;
    public int v3;
    public byte v4;
    public sc8 v5;
    public float v6;
    public CharSequence v7;
    public long v8;
    public int w;
    public b8 w0;
    public final GradientDrawable[] w1;
    public vnb w2;
    public ne8 w3;
    public String w4;
    public sc8 w5;
    public float w6;
    public boolean w7;
    public long w8;
    public AnimatorSet x;
    public eh2 x0;
    public final boolean[] x1;
    public final ib8 x2;
    public ImageView x3;
    public qx7 x4;
    public sc8 x5;
    public float x6;
    public ValueAnimator x7;
    public long x8;
    public final y98 y;
    public LinearLayout y0;
    public final float[] y1;
    public final ob8 y2;
    public final ImageView[] y3;
    public qx7 y4;
    public long y5;
    public float y6;
    public TLRPC.Document y7;
    public long y8;
    public final ArrayList z0;
    public int z1;
    public dc8 z2;
    public boolean z3;
    public qx7 z4;
    public boolean z5;
    public float z6;
    public TLRPC.Document z7;
    public long z8;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
    class BackgroundDrawable extends ColorDrawable {
        public static final /* synthetic */ int g = 0;
        public final RectF a;
        public final RectF b;
        public final Paint c;
        public h68 d;
        public boolean e;

        public BackgroundDrawable() {
            super(-16777216);
            this.a = new RectF();
            this.b = new RectF();
            Paint paint = new Paint(1);
            this.c = paint;
            paint.setColor(-16777216);
        }

        public final void a() {
            PhotoViewer photoViewer = PhotoViewer.this;
            e26 e26Var = photoViewer.r7;
            if (e26Var != null) {
                e26Var.b(!this.e);
            }
            e26 e26Var2 = photoViewer.c2;
            if (e26Var2 != null) {
                e26Var2.b(!this.e);
            }
            n12 n12Var = photoViewer.b2;
            if (n12Var != null) {
                boolean z = this.e;
                n12Var.v2.m(n12Var.i4);
                if (n12Var.r4 != z) {
                    n12Var.r4 = z;
                    f12 f12Var = n12Var.v2;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = n12Var.d2;
                    if (f12Var != chatAttachAlertPhotoLayout || chatAttachAlertPhotoLayout == null || chatAttachAlertPhotoLayout.j1) {
                        return;
                    }
                    boolean z2 = !z || n12Var.s4;
                    if (!chatAttachAlertPhotoLayout.n || chatAttachAlertPhotoLayout.P0) {
                        return;
                    }
                    if (!z2) {
                        chatAttachAlertPhotoLayout.u0();
                        return;
                    }
                    r52 r52Var = chatAttachAlertPhotoLayout.Q;
                    if (r52Var != null) {
                        chatAttachAlertPhotoLayout.p0 = Boolean.valueOf(r52Var.isFrontface());
                        chatAttachAlertPhotoLayout.e0(true);
                    }
                }
            }
        }

        @Override // android.graphics.drawable.ColorDrawable, android.graphics.drawable.Drawable
        public final void draw(Canvas canvas) {
            h68 h68Var;
            fd8 fd8Var;
            Drawable[] drawableArr = PhotoViewer.d9;
            PhotoViewer photoViewer = PhotoViewer.this;
            if (photoViewer.m4 == 0 || hl.O1() || (fd8Var = photoViewer.c5) == null || fd8Var.m == null) {
                super.draw(canvas);
            } else {
                ClippingImageView clippingImageView = photoViewer.i0;
                float translationX = clippingImageView.getTranslationX();
                RectF rectF = this.b;
                rectF.left = translationX;
                rectF.top = clippingImageView.getTranslationY();
                rectF.right = (clippingImageView.getScaleX() * clippingImageView.getMeasuredWidth()) + rectF.left;
                float scaleY = (clippingImageView.getScaleY() * clippingImageView.getMeasuredHeight()) + rectF.top;
                rectF.left += clippingImageView.b;
                rectF.top += clippingImageView.d;
                rectF.right -= clippingImageView.c;
                rectF.bottom = scaleY - clippingImageView.a;
                if (!rectF.isEmpty()) {
                    rectF.inset(hl.L(1.0f), hl.L(1.0f));
                    Rect bounds = getBounds();
                    float f = bounds.right;
                    float f2 = bounds.bottom;
                    for (int i = 0; i < 4; i++) {
                        RectF rectF2 = this.a;
                        if (i == 0) {
                            rectF2.set(0.0f, rectF.top, rectF.left, rectF.bottom);
                        } else if (i == 1) {
                            rectF2.set(0.0f, 0.0f, f, rectF.top);
                        } else if (i == 2) {
                            rectF2.set(rectF.right, rectF.top, f, rectF.bottom);
                        } else if (i == 3) {
                            rectF2.set(0.0f, rectF.bottom, f, f2);
                        }
                        canvas.drawRect(rectF2, this.c);
                    }
                }
            }
            if (getAlpha() == 0 || (h68Var = this.d) == null) {
                return;
            }
            hl.c3(h68Var);
            this.d = null;
        }

        @Override // android.graphics.drawable.ColorDrawable, android.graphics.drawable.Drawable
        public void setAlpha(int i) {
            PhotoViewer photoViewer = PhotoViewer.this;
            if (photoViewer.E instanceof LaunchActivity) {
                boolean z = (photoViewer.e && i == 255) ? false : true;
                this.e = z;
                if (z) {
                    a();
                } else {
                    hl.d3(new Runnable() { // from class: org.telegram.ui.y
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i2 = PhotoViewer.BackgroundDrawable.g;
                            PhotoViewer.BackgroundDrawable.this.a();
                        }
                    }, 70L);
                }
            }
            super.setAlpha(i);
            this.c.setAlpha(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
    public static class CounterView extends View {
        public StaticLayout a;
        public final TextPaint b;
        public final Paint c;
        public int d;
        public int e;
        public final RectF f;
        public int h;
        public float n;

        public CounterView(Context context) {
            super(context);
            this.h = 0;
            TextPaint textPaint = new TextPaint(1);
            this.b = textPaint;
            textPaint.setTextSize(hl.L(15.0f));
            textPaint.setTypeface(hl.o());
            textPaint.setColor(-1);
            Paint paint = new Paint(1);
            this.c = paint;
            paint.setColor(-1);
            paint.setStrokeWidth(hl.L(2.0f));
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeJoin(Paint.Join.ROUND);
            this.f = new RectF();
            a(0);
        }

        public final void a(int i) {
            String valueOf = String.valueOf(Math.max(1, i));
            int L = hl.L(100.0f);
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            TextPaint textPaint = this.b;
            this.a = new StaticLayout(valueOf, textPaint, L, alignment, 1.0f, 0.0f, false);
            this.d = (int) Math.ceil(r0.getLineWidth(0));
            this.e = this.a.getLineBottom(0);
            AnimatorSet animatorSet = new AnimatorSet();
            Paint paint = this.c;
            Property property = View.SCALE_X;
            Property property2 = View.SCALE_Y;
            if (i == 0) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, (Property<CounterView, Float>) property, 0.0f);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, (Property<CounterView, Float>) property2, 0.0f);
                qn qnVar = sn.b;
                animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofInt(paint, qnVar, 0), ObjectAnimator.ofInt(textPaint, qnVar, 0));
                animatorSet.setInterpolator(new DecelerateInterpolator());
            } else {
                int i2 = this.h;
                if (i2 == 0) {
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this, (Property<CounterView, Float>) property, 0.0f, 1.0f);
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this, (Property<CounterView, Float>) property2, 0.0f, 1.0f);
                    qn qnVar2 = sn.b;
                    animatorSet.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofInt(paint, qnVar2, 0, jn7.d4), ObjectAnimator.ofInt(textPaint, qnVar2, 0, jn7.d4));
                    animatorSet.setInterpolator(new DecelerateInterpolator());
                } else if (i < i2) {
                    animatorSet.playTogether(ObjectAnimator.ofFloat(this, (Property<CounterView, Float>) property, 1.1f, 1.0f), ObjectAnimator.ofFloat(this, (Property<CounterView, Float>) property2, 1.1f, 1.0f));
                    animatorSet.setInterpolator(new OvershootInterpolator());
                } else {
                    animatorSet.playTogether(ObjectAnimator.ofFloat(this, (Property<CounterView, Float>) property, 0.9f, 1.0f), ObjectAnimator.ofFloat(this, (Property<CounterView, Float>) property2, 0.9f, 1.0f));
                    animatorSet.setInterpolator(new OvershootInterpolator());
                }
            }
            animatorSet.setDuration(180L);
            animatorSet.start();
            requestLayout();
            this.h = i;
        }

        @Override // android.view.View
        public final float getRotationX() {
            return this.n;
        }

        @Override // android.view.View
        public final void onDraw(Canvas canvas) {
            int measuredHeight = getMeasuredHeight() / 2;
            Paint paint = this.c;
            paint.setAlpha(jn7.d4);
            float L = hl.L(1.0f);
            float L2 = measuredHeight - hl.L(14.0f);
            float measuredWidth = getMeasuredWidth() - hl.L(1.0f);
            float L3 = hl.L(14.0f) + measuredHeight;
            RectF rectF = this.f;
            rectF.set(L, L2, measuredWidth, L3);
            canvas.drawRoundRect(rectF, hl.L(15.0f), hl.L(15.0f), paint);
            if (this.a != null) {
                this.b.setAlpha((int) ((1.0f - this.n) * 255.0f));
                canvas.save();
                canvas.translate((getMeasuredWidth() - this.d) / 2, (this.n * hl.L(5.0f)) + hl.N(0.2f) + ((getMeasuredHeight() - this.e) / 2));
                this.a.draw(canvas);
                canvas.restore();
                paint.setAlpha((int) (this.n * 255.0f));
                int centerX = (int) rectF.centerX();
                int B = (int) qu6.B(1.0f, this.n, hl.L(5.0f), (int) rectF.centerY());
                canvas.drawLine(hl.L(5.0f) + centerX, B - hl.L(5.0f), centerX - hl.L(5.0f), hl.L(5.0f) + B, paint);
                canvas.drawLine(centerX - hl.L(5.0f), B - hl.L(5.0f), hl.L(5.0f) + centerX, hl.L(5.0f) + B, paint);
            }
        }

        @Override // android.view.View
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("android.widget.Button");
            int i = this.h;
            if (i > 0) {
                accessibilityNodeInfo.setContentDescription(ob6.G(i, "PhotosSelected", new Object[0]));
            }
        }

        @Override // android.view.View
        public final void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.max(hl.L(20.0f) + this.d, hl.L(30.0f)), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(40.0f), TLObject.FLAG_30));
        }

        @Override // android.view.View
        public void setRotationX(float f) {
            this.n = f;
            invalidate();
        }

        @Override // android.view.View
        public void setScaleX(float f) {
            super.setScaleX(f);
            invalidate();
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 24) {
            i9 = new va8();
        } else {
            i9 = new px1(Float.class, "progress", (byte) 2);
        }
        j9 = null;
        k9 = null;
    }

    public PhotoViewer() {
        byte b = 0;
        byte b2 = 1;
        this.b = Build.VERSION.SDK_INT >= 30;
        this.h = -1;
        this.n = true;
        this.y = new y98(this, (byte) 20);
        this.K = true;
        this.P = true;
        this.Q = false;
        this.a0 = new r89(0, false);
        this.z0 = new ArrayList();
        this.L0 = new HashMap(3);
        this.M0 = new BackgroundDrawable();
        Paint paint = new Paint();
        this.N0 = paint;
        this.X0 = new lb8[3];
        this.t1 = new y98(this, (byte) 21);
        this.w1 = new GradientDrawable[2];
        this.x1 = new boolean[2];
        this.y1 = new float[2];
        this.E1 = new u33();
        this.F1 = new u33();
        this.G1 = new u33();
        this.X1 = -8.0f;
        this.t2 = new Rect();
        this.x2 = new ib8(this);
        this.y2 = new ob8(this, b);
        this.l3 = true;
        this.m3 = new int[2];
        this.n3 = new int[2];
        this.y3 = new ImageView[3];
        this.A3 = new int[2];
        this.K3 = true;
        this.V3 = -1;
        this.X3 = -10;
        this.a4 = new ob2(this, b2);
        VideoFramesRewinder videoFramesRewinder = new VideoFramesRewinder();
        this.b4 = videoFramesRewinder;
        this.c4 = new yb8(this, videoFramesRewinder);
        this.d4 = new w10(this);
        this.h4 = new ob8(this, b2);
        this.i4 = new ob8(this, (byte) 2);
        this.j4 = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 2, 13);
        this.u4 = new y98(this, (byte) 22);
        this.A4 = new ImageReceiver(null);
        this.B4 = new nl(this, (byte) 6);
        this.C4 = new ImageReceiver(null);
        byte b3 = 23;
        this.D4 = new fi0(1, new y98(this, b3));
        this.E4 = new fi0(1, new y98(this, b3));
        this.F4 = new fi0(1, new y98(this, b3));
        this.K4 = false;
        this.L4 = new Matrix();
        Paint paint2 = new Paint();
        this.M4 = paint2;
        this.N4 = null;
        this.W4 = new xc8();
        this.b5 = new String[3];
        this.O5 = new boolean[]{false, true};
        this.Z5 = 1.0f;
        this.a6 = 0.0f;
        this.n6 = -1;
        this.s6 = new DecelerateInterpolator(1.5f);
        this.v6 = 1.0f;
        this.w6 = 0.0f;
        this.H6 = true;
        this.P6 = true;
        this.V6 = new ArrayList();
        this.W6 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.X6 = new ArrayList();
        this.Y6 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.Z6 = new ArrayList();
        this.a7 = new ArrayList();
        this.b7 = new ArrayList();
        this.c7 = new ArrayList();
        this.d7 = new ArrayList();
        this.e7 = new ArrayList();
        this.f7 = new ArrayList();
        this.g7 = null;
        this.h7 = null;
        this.j7 = new Rect();
        this.n7 = new y98(this, (byte) 24);
        this.q7 = new pn(new int[]{jn7.r, jn7.s, jn7.W, jn7.V, jn7.g3});
        this.D7 = new float[]{1.0f};
        this.E7 = new float[]{1.0f};
        this.K7 = new y98(this, (byte) 25);
        this.S7 = new int[2];
        this.a8 = -1L;
        this.b8 = -1L;
        this.c8 = -1L;
        this.e8 = -1;
        this.J8 = new mm(new y98(this, b3), 180L, k43.g);
        this.R8 = new qeb();
        this.S8 = new zh6();
        this.Y8 = new RectF();
        this.b9 = new y98(this, (byte) 26);
        this.c9 = new hb8(this);
        paint.setColor(-16777216);
        paint2.setColor(-1);
        this.B4.T(3);
    }

    public static boolean C0() {
        return j9 != null;
    }

    public static Bitmap D(Bitmap bitmap, fo6 fo6Var, int[] iArr, boolean z) {
        int i;
        int i2;
        try {
            int i3 = 0;
            int i4 = (fo6Var.k + (iArr != null ? iArr[0] : 0)) % 360;
            if (iArr != null && iArr.length > 1) {
                i3 = iArr[1];
            }
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            if (i4 == 90 || i4 == 270) {
                i = width;
                i2 = height;
            } else {
                i2 = width;
                i = height;
            }
            float f = i2;
            float f2 = i;
            Bitmap createBitmap = Bitmap.createBitmap((int) (fo6Var.e * f), (int) (fo6Var.f * f2), Bitmap.Config.ARGB_8888);
            Matrix matrix = new Matrix();
            matrix.postTranslate((-width) / 2, (-height) / 2);
            if (z && fo6Var.l) {
                if (i4 == 90 || i4 == 270) {
                    matrix.postScale(1.0f, -1.0f);
                } else {
                    matrix.postScale(-1.0f, 1.0f);
                }
            }
            if (i3 == 1) {
                matrix.postScale(-1.0f, 1.0f);
            } else if (i3 == 2) {
                matrix.postScale(1.0f, -1.0f);
            }
            matrix.postRotate(fo6Var.d + i4);
            matrix.postTranslate(fo6Var.a * f, fo6Var.b * f2);
            float f3 = fo6Var.c;
            matrix.postScale(f3, f3);
            matrix.postTranslate(r10 / 2, r11 / 2);
            new Canvas(createBitmap).drawBitmap(bitmap, matrix, new Paint(2));
            return createBitmap;
        } catch (Throwable th) {
            cc4.g(th, true);
            return null;
        }
    }

    public static boolean N0(r47 r47Var) {
        return (j9 == null || j9.B3 || !j9.e || r47Var == null || j9.S4 == null || j9.S4.e1() != r47Var.e1() || r47.B0(j9.S4.k) != r47.B0(r47Var.k)) ? false : true;
    }

    public static boolean O0(r47 r47Var) {
        return (k9 == null || r47Var == null || k9.S4 == null || k9.S4.e1() != r47Var.e1() || r47.B0(k9.S4.k) != r47.B0(r47Var.k)) ? false : true;
    }

    public static boolean P0(r47 r47Var) {
        boolean z;
        if (j9 != null && !j9.B3 && j9.e && !j9.r4 && r47Var != null) {
            r47 r47Var2 = j9.S4;
            if (r47Var2 == null && j9.d != null) {
                r47Var2 = j9.d.V();
            }
            if (r47Var2 != null && r47Var2.e1() == r47Var.e1() && r47.B0(r47Var2.k) == r47.B0(r47Var.k)) {
                z = true;
                return (!z || k9 == null) ? z : k9.e && !k9.r4 && r47Var != null && k9.S4 != null && k9.S4.e1() == r47Var.e1() && r47.B0(k9.S4.k) == r47.B0(r47Var.k);
            }
        }
        z = false;
        if (z) {
        }
    }

    public static boolean Q0(String str) {
        return (j9 == null || !j9.e || j9.r4 || str == null || !str.equals(j9.d5)) ? false : true;
    }

    public static boolean R0(TLRPC.BotInlineResult botInlineResult) {
        return (j9 == null || !j9.e || j9.r4 || botInlineResult == null || j9.X4 == null || botInlineResult.id != j9.X4.id) ? false : true;
    }

    public static boolean S0(TLRPC.FileLocation fileLocation) {
        if (j9 == null || !j9.e || j9.r4 || fileLocation == null) {
            return false;
        }
        if (j9.Y4 != null && fileLocation.local_id == j9.Y4.f.local_id && fileLocation.volume_id == j9.Y4.f.volume_id && fileLocation.dc_id == j9.Y4.a) {
            return true;
        }
        return j9.Z4 != null && fileLocation.local_id == j9.Z4.f.local_id && fileLocation.volume_id == j9.Z4.f.volume_id && fileLocation.dc_id == j9.Z4.a;
    }

    public static int T(go6 go6Var) {
        if (go6Var.d()) {
            return hl.Y0(false);
        }
        return 512;
    }

    public static String W(int i, int i2) {
        char c = (char) (((i >= 100 ? 99 : i) / 10) + 48);
        if (i >= 100) {
            i = 99;
        }
        char c2 = (char) ((i % 10) + 48);
        char c3 = (char) (((i2 >= 100 ? 99 : i2) / 10) + 48);
        if (i2 >= 100) {
            i2 = 99;
        }
        return new String(new char[]{c, c2, ':', c3, (char) ((i2 % 10) + 48)});
    }

    public static String X(int i, int i2, int i3) {
        char c = (char) (((i >= 100 ? 99 : i) / 10) + 48);
        if (i >= 100) {
            i = 99;
        }
        char c2 = (char) ((i % 10) + 48);
        char c3 = (char) (((i2 >= 100 ? 99 : i2) / 10) + 48);
        if (i2 >= 100) {
            i2 = 99;
        }
        char c4 = (char) ((i2 % 10) + 48);
        char c5 = (char) (((i3 >= 100 ? 99 : i3) / 10) + 48);
        if (i3 >= 100) {
            i3 = 99;
        }
        return new String(new char[]{c, c2, ':', c3, c4, ':', c5, (char) ((i3 % 10) + 48)});
    }

    public static boolean a() {
        return Build.VERSION.SDK_INT >= 31 && xea.X && xea.o() >= 2 && !hl.m0;
    }

    public static boolean a2(r47 r47Var) {
        if (r47Var == null || !r47.K4(r47Var.k)) {
            return false;
        }
        if (!r47Var.z0 && !r47Var.y0 && !r47Var.D2(true) && (!r47Var.B() || !xea.x0)) {
            return false;
        }
        boolean z = xea.a;
        return i86.e(1024);
    }

    public static String n0(jn5 jn5Var) {
        if (jn5Var == null || jn5Var.p != 2) {
            return null;
        }
        return "mp4";
    }

    public static PhotoViewer q0() {
        PhotoViewer photoViewer;
        PhotoViewer photoViewer2 = j9;
        if (photoViewer2 != null) {
            return photoViewer2;
        }
        synchronized (PhotoViewer.class) {
            photoViewer = j9;
            if (photoViewer == null) {
                photoViewer = new PhotoViewer();
                j9 = photoViewer;
            }
        }
        return photoViewer;
    }

    public static CharSequence s1(r47 r47Var) {
        if (r47Var.k == null) {
            return "";
        }
        Spannable A5 = r47.A5(pv3.m(new SpannableStringBuilder(r47Var.k.translatedText.text), aob.o2.getFontMetricsInt(), false, null, 0), r47Var.k.translatedText.entities, aob.o2.getFontMetricsInt(), false);
        if (r47.M(A5)) {
            try {
                hl.c(A5, 5, false, true);
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
        r47.h(r47Var.O3(), A5, true, 0, 0, true);
        r47.b(A5, r47Var.k.translatedText.entities, r47Var.O3(), true, true, true, 0);
        if (r47.K4(r47Var.k)) {
            r47.h(r47Var.O3(), A5, true, 3, (int) r47Var.L0(), false);
        } else if (r47Var.I3() || r47.Q4(r47Var.k)) {
            r47.h(r47Var.O3(), A5, true, 4, (int) r47Var.L0(), false);
        }
        return A5;
    }

    public static String x0() {
        return new File(xb4.z(4), xea.p() + "_temp.jpg").getAbsolutePath();
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x07f3  */
    /* JADX WARN: Removed duplicated region for block: B:163:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x01d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A(boolean z, boolean z2) {
        float f;
        float f2;
        float f3;
        float f4;
        ed8 ed8Var;
        ed8 ed8Var2;
        byte b;
        fd8 M;
        int i;
        int i2;
        byte b2;
        float f5;
        nc8 nc8Var;
        zu1 zu1Var;
        u8a u8aVar;
        VelocityTracker velocityTracker;
        float f6;
        float[][] fArr;
        int i3;
        RectF rectF;
        float min;
        boolean z3;
        org.telegram.ui.ActionBar.e eVar;
        TLRPC.Document R;
        TLRPC.Document document;
        boolean z4;
        ImageReceiver imageReceiver;
        Bitmap m;
        int i4;
        byte b3;
        k3b k3bVar = this.o5;
        byte b4 = 1;
        if (k3bVar != null) {
            k3bVar.W = false;
            sc8 sc8Var = this.s5;
            if (sc8Var.o0 == 2) {
                sc8Var.setCutOutState(true);
                g2(false, true);
                this.o5.f();
                this.f0.invalidate();
            }
        }
        if (!z2 && (b3 = this.t4) != 0) {
            if (b3 == 3 && this.M1 != null) {
                z();
                return;
            }
            if (b3 == 1) {
                this.E1.b(this.J2, this.K2, this.L2, this.P2, this.R2, this.O2, 1.0f, 1.0f, this.M2, this.N2, 0.0f, 0.0f, this.Q2);
            }
            if (this.t4 == 4) {
                e();
            }
            o2(0);
            return;
        }
        gd8 gd8Var = this.T7;
        if (gd8Var != null && gd8Var.getTag() != null) {
            ((TextView) this.U7.d).callOnClick();
            return;
        }
        this.f = false;
        this.m2 = false;
        try {
            id idVar = this.Q1;
            if (idVar != null) {
                idVar.dismiss();
                this.Q1 = null;
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
        if (this.f0 != null) {
            hl.r(this.u4);
            H2(true);
        }
        byte b5 = this.t4;
        byte b6 = 5;
        if (b5 != 0) {
            if (b5 == 2) {
                this.J1.c();
                this.f0.removeView(this.J1);
                this.J1 = null;
            } else if (b5 == 1) {
                this.V0.setVisibility(8);
                this.D1.setVisibility(8);
            } else if (b5 == 3) {
                this.M1.C0();
                this.f0.removeView(this.M1.getView());
                this.M1 = null;
                this.h7 = null;
            } else if (b5 == 4) {
                this.P1 = true;
                ad8 ad8Var = this.f0;
                if (ad8Var != null) {
                    ad8Var.invalidate();
                    this.f0.post(new h68(this, this.O1, b6));
                } else {
                    gc8 gc8Var = this.O1;
                    gc8Var.e.h();
                    gc8Var.c.postRunnable(new pg6(b4));
                }
                this.O1 = null;
            }
            this.t4 = (byte) 0;
            c0().M.b(false);
            rx5 rx5Var = this.L1;
            if (rx5Var != null) {
                rx5Var.b(this.t4 != 3);
            }
        }
        View view = this.k0;
        if (view != null) {
            view.setVisibility(0);
        }
        z zVar = this.h0;
        if (zVar != null) {
            zVar.setClipChildren(false);
        }
        if (this.E == null) {
            return;
        }
        if ((!this.J3 && !this.e) || p() || this.d == null) {
            return;
        }
        Activity activity = this.E;
        if (activity != null && this.Y3 != 0) {
            activity.setRequestedOrientation(this.X3);
            this.Y3 = (byte) 0;
            this.Z3 = false;
        }
        if (!this.v2) {
            ArrayList arrayList = this.f7;
            if (!arrayList.isEmpty() && (i4 = this.O4) >= 0 && i4 < arrayList.size()) {
                Object obj = arrayList.get(this.O4);
                if (obj instanceof go6) {
                    go6 go6Var = (go6) obj;
                    go6Var.s = k0();
                    if (this.d2 == 11) {
                        go6Var.e();
                    }
                }
            }
        }
        org.telegram.ui.ActionBar.e eVar2 = this.l4;
        if (eVar2 == null || eVar2.getFragmentView() == null) {
            f = 1.0f;
            f2 = 1.0f;
            f3 = 1.0f;
        } else {
            View fragmentView = this.l4.getFragmentView();
            f = fragmentView.getScaleX();
            f2 = fragmentView.getScaleY();
            fragmentView.setScaleX(1.0f);
            fragmentView.setScaleY(1.0f);
            n12 n12Var = this.b2;
            if (n12Var != null) {
                ex0 ex0Var = n12Var.c;
                f3 = ex0Var.getScaleX();
                f4 = ex0Var.getScaleY();
                ex0Var.setScaleX(1.0f);
                ex0Var.setScaleY(1.0f);
                ed8Var = this.d;
                if (ed8Var != null) {
                    ed8Var.Z(this.O4);
                }
                boolean[] zArr = {true};
                ed8Var2 = this.d;
                if (ed8Var2 != null) {
                    M = null;
                    b = 5;
                } else {
                    r47 r47Var = this.S4;
                    b = 5;
                    jn5 jn5Var = this.Y4;
                    M = ed8Var2.M(r47Var, jn5Var == null ? null : jn5Var.f, this.O4, true, true);
                }
                float f7 = 0.0f;
                if (this.G2 != null || M == null) {
                    i = 2;
                    i2 = 4;
                    b2 = 11;
                } else {
                    b2 = 11;
                    lm m2 = M.a.m();
                    if (m2 != null) {
                        f5 = f;
                        long j = (long) (m2.h0 * 1000.0f);
                        long S = this.G2.S();
                        if (j <= 0) {
                            j = 0;
                        }
                        long j2 = S + j;
                        if (this.G2.R() == null) {
                            r47 r47Var2 = this.S4;
                            if (r47Var2 == null) {
                                i2 = 4;
                                document = null;
                                if (this.H3 || (m = m2.m()) == null) {
                                    i = 2;
                                } else {
                                    i = 2;
                                    if (!this.E2) {
                                        try {
                                            Bitmap bitmap = this.C2.getBitmap(m.getWidth(), m.getHeight());
                                            new Canvas(m).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                                            bitmap.recycle();
                                            z4 = true;
                                        } catch (Throwable th) {
                                            z4 = true;
                                            cc4.g(th, true);
                                        }
                                        if (document != null) {
                                            cc4.b("seeking from photo viewer to animation object");
                                            m2.y(j2, xb4.G(this.U).T(document, z4) ^ z4, z4);
                                        }
                                        imageReceiver = M.a;
                                        if (imageReceiver != null) {
                                            imageReceiver.u0 = z4;
                                            imageReceiver.w0(false);
                                        }
                                        nc8Var = this.g0;
                                        if (nc8Var != null) {
                                            ev3 ev3Var = nc8Var.f;
                                            ev3Var.stopLoading();
                                            ev3Var.loadUrl("about:blank");
                                            ev3Var.destroy();
                                            nc8Var.I = 0;
                                            nc8Var.J = 0;
                                            hl.r(nc8Var.M);
                                            this.f0.removeView(this.g0);
                                            this.g0 = null;
                                        }
                                        zu1Var = this.k4;
                                        if (zu1Var != null && zu1Var.getFragmentView() != null) {
                                            this.k4.getFragmentView().invalidate();
                                        }
                                        this.k4 = null;
                                        u8aVar = this.H7;
                                        if (u8aVar != null) {
                                            u8aVar.a();
                                            this.H7 = null;
                                        }
                                        ConnectionsManager.getInstance(this.U).cancelRequestsForGuid(this.c);
                                        this.K = false;
                                        velocityTracker = this.T6;
                                        if (velocityTracker != null) {
                                            velocityTracker.recycle();
                                            this.T6 = null;
                                        }
                                        if (this.J3) {
                                            this.J3 = false;
                                            this.m4 = (byte) 0;
                                            c1(M);
                                            this.f0.setScaleX(1.0f);
                                            this.f0.setScaleY(1.0f);
                                            if (!this.v2) {
                                                w1(true);
                                            }
                                        } else {
                                            BackgroundDrawable backgroundDrawable = this.M0;
                                            if (z) {
                                                ClippingImageView[] b0 = b0(M);
                                                int i5 = 0;
                                                while (true) {
                                                    int length = b0.length;
                                                    f6 = f7;
                                                    fArr = this.j4;
                                                    if (i5 >= length) {
                                                        break;
                                                    }
                                                    ClippingImageView clippingImageView = b0[i5];
                                                    boolean z5 = M == null ? false : M.r;
                                                    clippingImageView.O = fArr;
                                                    clippingImageView.L = false;
                                                    clippingImageView.N = z5;
                                                    clippingImageView.setVisibility(0);
                                                    i5++;
                                                    f7 = f6;
                                                }
                                                AnimatorSet animatorSet = new AnimatorSet();
                                                ViewGroup.LayoutParams layoutParams = this.i0.getLayoutParams();
                                                if (M != null) {
                                                    rectF = M.a.Q0;
                                                    layoutParams.width = (int) rectF.width();
                                                    layoutParams.height = (int) rectF.height();
                                                    ImageReceiver imageReceiver2 = M.a;
                                                    int i6 = imageReceiver2.V;
                                                    lm m3 = imageReceiver2.m();
                                                    int i7 = m3 != null ? m3.d[i] : 0;
                                                    if (i7 != 0) {
                                                        i6 = i7;
                                                    }
                                                    for (ClippingImageView clippingImageView2 : b0) {
                                                        int i8 = M.a.W;
                                                        clippingImageView2.e = i6;
                                                        clippingImageView2.f = i8;
                                                        clippingImageView2.setImageBitmap(M.e);
                                                    }
                                                    i3 = 6;
                                                } else {
                                                    i3 = 6;
                                                    ImageReceiver imageReceiver3 = this.B4;
                                                    layoutParams.width = (int) imageReceiver3.N0;
                                                    layoutParams.height = (int) imageReceiver3.O0;
                                                    for (ClippingImageView clippingImageView3 : b0) {
                                                        ImageReceiver imageReceiver4 = this.B4;
                                                        int i10 = imageReceiver4.V;
                                                        int i11 = imageReceiver4.W;
                                                        clippingImageView3.e = i10;
                                                        clippingImageView3.f = i11;
                                                        clippingImageView3.setImageBitmap(imageReceiver4.p());
                                                    }
                                                    rectF = null;
                                                }
                                                if (layoutParams.width <= 0) {
                                                    layoutParams.width = 100;
                                                }
                                                if (layoutParams.height <= 0) {
                                                    layoutParams.height = 100;
                                                }
                                                if (this.d2 == 1) {
                                                    float min2 = Math.min(this.D1.getMeasuredWidth(), (this.D1.getMeasuredHeight() - hl.L(64.0f)) - (!this.s ? hl.m : 0)) - (hl.L(16.0f) << 1);
                                                    min = Math.max(min2 / layoutParams.width, min2 / layoutParams.height);
                                                } else {
                                                    min = Math.min(this.h0.getMeasuredWidth() / layoutParams.width, (hl.q.y + (!this.s ? hl.m : 0)) / layoutParams.height);
                                                }
                                                float f8 = layoutParams.width;
                                                float f10 = this.Z5;
                                                float f11 = layoutParams.height * f10 * min;
                                                float measuredWidth = (this.h0.getMeasuredWidth() - ((f8 * f10) * min)) / 2.0f;
                                                float f12 = min;
                                                float measuredHeight = this.d2 == 1 ? ((this.D1.getMeasuredHeight() - (!this.s ? hl.m : 0)) - f11) / 2.0f : ((hl.q.y + (!this.s ? hl.m : 0)) - f11) / 2.0f;
                                                int i12 = 0;
                                                while (i12 < b0.length) {
                                                    b0[i12].setLayoutParams(layoutParams);
                                                    int i13 = i12;
                                                    b0[i12].setTranslationX(this.W5 + measuredWidth);
                                                    b0[i13].setTranslationY(this.X5 + measuredHeight);
                                                    b0[i13].setScaleX(this.Z5 * f12);
                                                    b0[i13].setScaleY(this.Z5 * f12);
                                                    i12 = i13 + 1;
                                                }
                                                if (M != null) {
                                                    int abs = (int) Math.abs(rectF.left - M.a.L0);
                                                    int abs2 = (int) Math.abs(rectF.top - M.a.M0);
                                                    if (M.a.S0) {
                                                        abs = 0;
                                                    }
                                                    int[] iArr = new int[i];
                                                    M.d.getLocationInWindow(iArr);
                                                    float f13 = iArr[1];
                                                    float f14 = M.c;
                                                    float f15 = rectF.top;
                                                    float f16 = f14 + f15;
                                                    int i14 = (int) ((f13 - f16) + M.j);
                                                    if (i14 < 0) {
                                                        i14 = 0;
                                                    }
                                                    int height = (int) ((((rectF.bottom - f15) + f16) - (M.d.getHeight() + r4)) + M.i);
                                                    if (height < 0) {
                                                        height = 0;
                                                    }
                                                    int max = Math.max(i14, abs2);
                                                    int max2 = Math.max(height, abs2);
                                                    fArr[0][0] = this.i0.getScaleX();
                                                    fArr[0][1] = this.i0.getScaleY();
                                                    fArr[0][2] = this.i0.getTranslationX();
                                                    fArr[0][3] = this.i0.getTranslationY();
                                                    float[] fArr2 = fArr[0];
                                                    fArr2[i2] = f6;
                                                    fArr2[b] = f6;
                                                    fArr2[i3] = f6;
                                                    fArr2[7] = f6;
                                                    fArr2[8] = f6;
                                                    fArr2[9] = f6;
                                                    fArr2[10] = f6;
                                                    fArr2[b2] = f6;
                                                    fArr2[12] = f6;
                                                    float[] fArr3 = fArr[1];
                                                    float f17 = M.k;
                                                    fArr3[0] = f17;
                                                    fArr3[1] = f17;
                                                    fArr3[2] = (rectF.left * f17) + M.b;
                                                    fArr3[3] = (rectF.top * f17) + M.c;
                                                    float f18 = abs;
                                                    fArr3[i2] = f18 * f17;
                                                    fArr3[b] = max * f17;
                                                    fArr3[i3] = max2 * f17;
                                                    int i15 = 0;
                                                    for (int i16 = i2; i15 < i16; i16 = 4) {
                                                        fArr[1][i15 + 7] = M.h != null ? r11[i15] : f6;
                                                        i15++;
                                                    }
                                                    float[] fArr4 = fArr[1];
                                                    float f19 = M.k;
                                                    fArr4[b2] = abs2 * f19;
                                                    fArr4[12] = f18 * f19;
                                                    ArrayList arrayList2 = new ArrayList((this.d2 == 1 ? 3 : 2) + b0.length + (b0.length > 1 ? 1 : 0));
                                                    for (int i17 = 0; i17 < b0.length; i17++) {
                                                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(b0[i17], sn.f, 0.0f, 1.0f);
                                                        if (i17 == 0) {
                                                            ofFloat.addUpdateListener(new w98(this, (byte) 10));
                                                        }
                                                        arrayList2.add(ofFloat);
                                                    }
                                                    if (b0.length > 1) {
                                                        arrayList2.add(ObjectAnimator.ofFloat(this.i0, (Property<ClippingImageView, Float>) View.ALPHA, f6));
                                                        b0[1].setAdditionalTranslationX(-this.t2.left);
                                                    }
                                                    arrayList2.add(ObjectAnimator.ofInt(backgroundDrawable, sn.d, 0));
                                                    ad8 ad8Var2 = this.f0;
                                                    Property property = View.ALPHA;
                                                    arrayList2.add(ObjectAnimator.ofFloat(ad8Var2, (Property<ad8, Float>) property, f6));
                                                    arrayList2.add(ObjectAnimator.ofFloat(this.k0, (Property<View, Float>) property, f6));
                                                    if (this.d2 == 1) {
                                                        arrayList2.add(ObjectAnimator.ofFloat(this.D1, (Property<k88, Float>) property, f6));
                                                    }
                                                    animatorSet.playTogether(arrayList2);
                                                } else {
                                                    int i18 = hl.q.y + (!this.s ? hl.m : 0);
                                                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                                                    ofFloat2.addUpdateListener(new w98(this, b2));
                                                    ObjectAnimator ofInt = ObjectAnimator.ofInt(backgroundDrawable, sn.d, 0);
                                                    ClippingImageView clippingImageView4 = this.i0;
                                                    Property property2 = View.ALPHA;
                                                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(clippingImageView4, (Property<ClippingImageView, Float>) property2, f6);
                                                    ClippingImageView clippingImageView5 = this.i0;
                                                    Property property3 = View.TRANSLATION_Y;
                                                    if (this.X5 < f6) {
                                                        i18 = -i18;
                                                    }
                                                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(clippingImageView5, (Property<ClippingImageView, Float>) property3, i18);
                                                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.f0, (Property<ad8, Float>) property2, f6);
                                                    ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.k0, (Property<View, Float>) property2, f6);
                                                    Animator[] animatorArr = new Animator[i3];
                                                    animatorArr[0] = ofFloat2;
                                                    animatorArr[1] = ofInt;
                                                    animatorArr[2] = ofFloat3;
                                                    animatorArr[3] = ofFloat4;
                                                    animatorArr[4] = ofFloat5;
                                                    animatorArr[b] = ofFloat6;
                                                    animatorSet.playTogether(animatorArr);
                                                }
                                                ed8 ed8Var3 = this.d;
                                                if (ed8Var3 != null) {
                                                    ed8Var3.r();
                                                }
                                                this.o4 = new ba8(this, M, (byte) 1);
                                                animatorSet.setDuration(200L);
                                                animatorSet.addListener(new wb8(this, b));
                                                if (zArr[0]) {
                                                    if (M == null || M.s) {
                                                        z3 = true;
                                                    } else {
                                                        z3 = true;
                                                        M.a.v0(false, true);
                                                    }
                                                    if (!this.v2) {
                                                        w1(z3);
                                                    }
                                                    this.m4 = (byte) 3;
                                                    this.f0.invalidate();
                                                    this.n4 = System.currentTimeMillis();
                                                    this.f0.setLayerType(2, null);
                                                    animatorSet.start();
                                                }
                                            } else {
                                                AnimatorSet animatorSet2 = new AnimatorSet();
                                                float[] fArr5 = new float[i];
                                                // fill-array-data instruction
                                                fArr5[0] = 0.0f;
                                                fArr5[1] = 1.0f;
                                                ValueAnimator ofFloat7 = ValueAnimator.ofFloat(fArr5);
                                                ofFloat7.addUpdateListener(new w98(this, (byte) 12));
                                                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(this.f0, (Property<ad8, Float>) View.SCALE_X, 0.9f);
                                                ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(this.f0, (Property<ad8, Float>) View.SCALE_Y, 0.9f);
                                                ObjectAnimator ofInt2 = ObjectAnimator.ofInt(backgroundDrawable, sn.d, 0);
                                                ad8 ad8Var3 = this.f0;
                                                Property property4 = View.ALPHA;
                                                byte b7 = 2;
                                                animatorSet2.playTogether(ofFloat7, ofFloat8, ofFloat9, ofInt2, ObjectAnimator.ofFloat(ad8Var3, (Property<ad8, Float>) property4, 0.0f), ObjectAnimator.ofFloat(this.k0, (Property<View, Float>) property4, 0.0f));
                                                ed8 ed8Var4 = this.d;
                                                if (ed8Var4 != null) {
                                                    ed8Var4.r();
                                                }
                                                this.o4 = new ba8(this, M, b7);
                                                animatorSet2.setDuration(200L);
                                                animatorSet2.addListener(new wb8(this, (byte) 6));
                                                if (zArr[0]) {
                                                    if (!this.v2) {
                                                        w1(true);
                                                    }
                                                    this.m4 = (byte) 2;
                                                    this.n4 = System.currentTimeMillis();
                                                    this.f0.setLayerType(2, null);
                                                    animatorSet2.start();
                                                    if (M != null) {
                                                        M.a.v0(true, true);
                                                    }
                                                }
                                            }
                                            lm lmVar = this.k2;
                                            if (lmVar != null) {
                                                lmVar.w(this.f0);
                                                this.k2 = null;
                                                this.B4.g0(null);
                                                this.E4.a();
                                            }
                                            ed8 ed8Var5 = this.d;
                                            if (ed8Var5 != null && !ed8Var5.T()) {
                                                this.d.t();
                                            }
                                        }
                                        eVar = this.l4;
                                        if (eVar == null || eVar.getFragmentView() == null) {
                                            return;
                                        }
                                        View fragmentView2 = this.l4.getFragmentView();
                                        fragmentView2.setScaleX(f5);
                                        fragmentView2.setScaleY(f2);
                                        n12 n12Var2 = this.b2;
                                        if (n12Var2 != null) {
                                            ex0 ex0Var2 = n12Var2.c;
                                            ex0Var2.setScaleX(f3);
                                            ex0Var2.setScaleY(f4);
                                            return;
                                        }
                                        return;
                                    }
                                    hl.y0(this.D2, m);
                                }
                                z4 = true;
                                if (document != null) {
                                }
                                imageReceiver = M.a;
                                if (imageReceiver != null) {
                                }
                                nc8Var = this.g0;
                                if (nc8Var != null) {
                                }
                                zu1Var = this.k4;
                                if (zu1Var != null) {
                                    this.k4.getFragmentView().invalidate();
                                }
                                this.k4 = null;
                                u8aVar = this.H7;
                                if (u8aVar != null) {
                                }
                                ConnectionsManager.getInstance(this.U).cancelRequestsForGuid(this.c);
                                this.K = false;
                                velocityTracker = this.T6;
                                if (velocityTracker != null) {
                                }
                                if (this.J3) {
                                }
                                eVar = this.l4;
                                if (eVar == null) {
                                    return;
                                } else {
                                    return;
                                }
                            }
                            R = r47Var2.F0();
                        } else {
                            R = this.G2.R();
                        }
                        i2 = 4;
                        document = R;
                        if (this.H3) {
                        }
                        i = 2;
                        z4 = true;
                        if (document != null) {
                        }
                        imageReceiver = M.a;
                        if (imageReceiver != null) {
                        }
                        nc8Var = this.g0;
                        if (nc8Var != null) {
                        }
                        zu1Var = this.k4;
                        if (zu1Var != null) {
                        }
                        this.k4 = null;
                        u8aVar = this.H7;
                        if (u8aVar != null) {
                        }
                        ConnectionsManager.getInstance(this.U).cancelRequestsForGuid(this.c);
                        this.K = false;
                        velocityTracker = this.T6;
                        if (velocityTracker != null) {
                        }
                        if (this.J3) {
                        }
                        eVar = this.l4;
                        if (eVar == null) {
                        }
                    } else {
                        i = 2;
                        i2 = 4;
                    }
                }
                f5 = f;
                nc8Var = this.g0;
                if (nc8Var != null) {
                }
                zu1Var = this.k4;
                if (zu1Var != null) {
                }
                this.k4 = null;
                u8aVar = this.H7;
                if (u8aVar != null) {
                }
                ConnectionsManager.getInstance(this.U).cancelRequestsForGuid(this.c);
                this.K = false;
                velocityTracker = this.T6;
                if (velocityTracker != null) {
                }
                if (this.J3) {
                }
                eVar = this.l4;
                if (eVar == null) {
                }
            } else {
                f3 = 1.0f;
            }
        }
        f4 = f3;
        ed8Var = this.d;
        if (ed8Var != null) {
        }
        boolean[] zArr2 = {true};
        ed8Var2 = this.d;
        if (ed8Var2 != null) {
        }
        float f72 = 0.0f;
        if (this.G2 != null) {
        }
        i = 2;
        i2 = 4;
        b2 = 11;
        f5 = f;
        nc8Var = this.g0;
        if (nc8Var != null) {
        }
        zu1Var = this.k4;
        if (zu1Var != null) {
        }
        this.k4 = null;
        u8aVar = this.H7;
        if (u8aVar != null) {
        }
        ConnectionsManager.getInstance(this.U).cancelRequestsForGuid(this.c);
        this.K = false;
        velocityTracker = this.T6;
        if (velocityTracker != null) {
        }
        if (this.J3) {
        }
        eVar = this.l4;
        if (eVar == null) {
        }
    }

    public final int A0() {
        int measuredHeight;
        int f0 = f0();
        ad8 ad8Var = this.f0;
        return (ad8Var == null || (measuredHeight = ad8Var.getMeasuredHeight()) <= 0) ? f0 : Math.min(f0, measuredHeight);
    }

    public final void A1() {
        if (J0()) {
            return;
        }
        r47 r47Var = this.S4;
        if (r47Var == null || !r47Var.q4()) {
            ob8 ob8Var = this.y2;
            hl.r(ob8Var);
            hl.d3(ob8Var, 3000L);
        }
    }

    public final void A2(boolean z, boolean z2) {
        if (z != this.L) {
            if (z) {
                this.p1.setVisibility(0);
            }
            this.L = z;
            this.p1.setEnabled(z);
            if (!z2) {
                this.p1.setAlpha(z ? 1.0f : 0.0f);
                this.p1.setTranslationY(z ? 0.0f : -hl.L(10.0f));
                this.P0.setRotationX(z ? 1.0f : 0.0f);
                if (z) {
                    return;
                }
                this.p1.setVisibility(8);
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.p1, (Property<jd8, Float>) View.ALPHA, z ? 1.0f : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.p1, (Property<jd8, Float>) View.TRANSLATION_Y, z ? 0.0f : -hl.L(10.0f)));
            arrayList.add(ObjectAnimator.ofFloat(this.P0, (Property<CounterView, Float>) View.ROTATION_X, z ? 1.0f : 0.0f));
            AnimatorSet animatorSet = new AnimatorSet();
            this.C1 = animatorSet;
            animatorSet.playTogether(arrayList);
            if (!z) {
                this.C1.addListener(new wb8(this, (byte) 4));
            }
            this.C1.setDuration(200L);
            this.C1.start();
        }
    }

    public final void B() {
        boolean z = this.E2;
        me8 me8Var = this.U8;
        if (!z) {
            me8Var.a(new ea8(this, (byte) 3));
        } else {
            me8Var.a(new bm0((byte) 21));
            hl.c3(new y98(this, (byte) 14));
        }
    }

    public final boolean B0() {
        return a0(true) != 0;
    }

    public final void B1(long j) {
        b29 y;
        xc8 xc8Var = this.W4;
        ArrayList arrayList = xc8Var.e;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                mec mecVar = (mec) xc8Var.e.get(i);
                if (mecVar.a == 0 && (mecVar.b & 1) != 0) {
                    View view = mecVar.I;
                    if ((view instanceof de0) && (y = ((de0) view).getImageReceiver().y()) != null) {
                        long j2 = this.r8;
                        y.P(j - (j2 > 0 ? j2 / 1000 : 0L));
                    }
                }
            }
        }
    }

    public final void B2() {
        boolean z;
        kfc kfcVar;
        kfc kfcVar2;
        if (this.G2 == null) {
            nc8 nc8Var = this.g0;
            if (nc8Var == null || !nc8Var.y) {
                return;
            } else {
                z = nc8Var.H;
            }
        } else {
            z = this.P3;
        }
        m();
        hl.r(this.y2);
        if (z) {
            p1();
        } else {
            if (!this.s1) {
                if (Math.abs(this.q3.c() - this.X7.getRightProgress()) < 0.01f || ((kfcVar = this.G2) != null && kfcVar.S() == this.G2.U())) {
                    D1(0.0f);
                }
                A1();
            } else if (Math.abs(this.X7.getProgress() - this.X7.getRightProgress()) < 0.01f || ((kfcVar2 = this.G2) != null && kfcVar2.S() == this.G2.U())) {
                D1(this.X7.getLeftProgress());
            }
            r1();
        }
        this.f0.invalidate();
    }

    public final void C() {
        if (this.D1 != null) {
            return;
        }
        k88 k88Var = new k88(this.F, this.w2);
        this.D1 = k88Var;
        k88Var.setVisibility(8);
        this.D1.a();
        this.f0.addView(this.D1, this.f0.indexOfChild(this.W7) - 1, tre.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        this.D1.setDelegate(new ua8(this));
    }

    public final void C1(long j) {
        nc8 nc8Var = this.g0;
        if (nc8Var == null || !nc8Var.y) {
            kfc kfcVar = this.G2;
            if (kfcVar != null) {
                kfcVar.o0(j);
            }
        } else {
            nc8Var.i(j);
        }
        Q2();
    }

    public final void C2() {
        View view = this.T3;
        if (view != null) {
            lb8 lb8Var = this.X0[0];
            int i = lb8Var.h;
            if (!lb8Var.p || (i != 3 && i != 4 && i != 2 && i != 1)) {
                view.setVisibility(4);
                return;
            }
            if (i == 3) {
                view.setContentDescription(ob6.M0(2131754925, "AccActionPlay"));
            } else if (i == 2) {
                view.setContentDescription(ob6.M0(2131754934, "AccActionDownload"));
            } else if (i == 1) {
                view.setContentDescription(ob6.M0(2131754937, "AccActionCancelDownload"));
            } else {
                view.setContentDescription(ob6.M0(2131754926, "AccActionPause"));
            }
            this.T3.setVisibility(0);
        }
    }

    public final void D0() {
        if (this.X8) {
            this.X8 = false;
            ImageView imageView = this.x3;
            if (imageView != null) {
                imageView.setVisibility(4);
                this.x3.setImageDrawable(null);
            }
            Bitmap bitmap = this.C3;
            if (bitmap != null) {
                bitmap.recycle();
                this.C3 = null;
            }
        }
    }

    public final void D1(float f) {
        kfc kfcVar = this.G2;
        if (kfcVar != null) {
            kfcVar.o0((long) (f * kfcVar.U()));
            return;
        }
        nc8 nc8Var = this.g0;
        if (nc8Var != null) {
            nc8Var.i((long) (f * nc8Var.getVideoDuration()));
        }
    }

    public final void D2() {
        if (this.B0 == null || this.N == null) {
            return;
        }
        float f = 0.0f;
        for (int i = 0; i < this.B0.getChildCount(); i++) {
            View childAt = this.B0.getChildAt(i);
            if (childAt.getVisibility() == 0) {
                f = (Math.min(0.5f, childAt.getAlpha()) * 2.0f * childAt.getWidth()) + f;
            }
        }
        CheckBox checkBox = this.O0;
        if (checkBox != null && checkBox.getVisibility() == 0) {
            f = Math.max(f, hl.L(48.0f));
        }
        CounterView counterView = this.P0;
        if (counterView != null && counterView.getVisibility() == 0) {
            f = Math.max(f, hl.L(100.0f));
        }
        dd8 dd8Var = this.N;
        ValueAnimator valueAnimator = dd8Var.n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            dd8Var.n = null;
        }
        dd8Var.r = f;
        dd8Var.c[0].setRightPadding((int) f);
        dd8Var.d.setRightPadding(f);
    }

    public final void E() {
        fo6 fo6Var;
        if (this.O1 != null) {
            return;
        }
        if (this.d2 == 1) {
            fo6Var = new fo6();
            fo6Var.k = this.E1.i;
        } else {
            fo6Var = this.W4.c;
        }
        fo6 fo6Var2 = fo6Var;
        int q = this.B4.q();
        int o = this.B4.o();
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap createBitmap = Bitmap.createBitmap(q, o, config);
        k3b k3bVar = this.o5;
        if (k3bVar != null && k3bVar.getSourceBitmap() != null) {
            Bitmap sourceBitmap = this.o5.getSourceBitmap();
            Canvas canvas = new Canvas(createBitmap);
            canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
            canvas.rotate(this.o5.K);
            float width = createBitmap.getWidth() / ((this.o5.K / 90) % 2 != 0 ? sourceBitmap.getHeight() : sourceBitmap.getWidth());
            RectF rectF = hl.P;
            rectF.set(((-sourceBitmap.getWidth()) / 2.0f) * width, ((-sourceBitmap.getHeight()) / 2.0f) * width, (sourceBitmap.getWidth() / 2.0f) * width, (sourceBitmap.getHeight() / 2.0f) * width);
            canvas.drawBitmap(sourceBitmap, (Rect) null, rectF, new Paint(3));
        }
        Bitmap createBitmap2 = Bitmap.createBitmap(this.B4.q(), this.B4.o(), config);
        if (this.B4.n() != null) {
            Bitmap n = this.B4.n();
            Canvas canvas2 = new Canvas(createBitmap2);
            canvas2.translate(createBitmap2.getWidth() / 2.0f, createBitmap2.getHeight() / 2.0f);
            canvas2.rotate(this.B4.V);
            float width2 = createBitmap2.getWidth() / ((this.B4.V / 90) % 2 != 0 ? n.getHeight() : n.getWidth());
            RectF rectF2 = hl.P;
            rectF2.set(((-n.getWidth()) / 2.0f) * width2, ((-n.getHeight()) / 2.0f) * width2, (n.getWidth() / 2.0f) * width2, (n.getHeight() / 2.0f) * width2);
            canvas2.drawBitmap(n, (Rect) null, rectF2, new Paint(3));
        }
        gc8 gc8Var = new gc8(this, this.E, this.U, createBitmap2, createBitmap, this.B4.V, fo6Var2);
        this.O1 = gc8Var;
        gc8Var.s.setOnClickListener(new z98(this, (byte) 5));
        this.O1.w.setOnClickListener(new z98(this, (byte) 6));
        this.O1.setEraser(this.N1);
        int indexOfChild = this.f0.indexOfChild(this.t5) - 1;
        if (indexOfChild < 0) {
            indexOfChild = this.f0.getChildCount();
        }
        this.f0.addView(this.O1, indexOfChild, tre.c(-1.0f, -1));
        this.P1 = false;
    }

    public final void E0() {
        boolean[] zArr = this.x1;
        zArr[1] = false;
        zArr[0] = false;
        this.f0.invalidate();
    }

    public final int E1() {
        if (this.z8 > 1048576000) {
            return this.e8 - 1;
        }
        SharedPreferences e1 = uc7.e1();
        int i = this.e8;
        while (i < 5) {
            Locale locale = Locale.US;
            int i2 = e1.getInt("compress_video_" + i, -1);
            if (i2 >= 0) {
                return Math.min(i2, 2);
            }
            i++;
        }
        lq3 q = lq3.q(this.U);
        int e = org.telegram.messenger.a.e();
        return Math.min(2, Math.round((e == 1 ? q.p().h : e == 2 ? q.o().h : q.n().h) / (100.0f / i)) - 1);
    }

    public final void E2(Object obj) {
        TLRPC.EncryptedChat encryptedChat;
        CharSequence charSequence = this.u7 ? this.v7 : obj instanceof no6 ? ((no6) obj).a : ((obj instanceof TLRPC.BotInlineResult) || !(obj instanceof ro6)) ? null : ((ro6) obj).I;
        if (TextUtils.isEmpty(charSequence)) {
            c0().setText("");
        } else {
            c0().setText(hm.cloneSpans(charSequence, 3));
        }
        xt3 editText = c0().f.getEditText();
        zu1 zu1Var = this.k4;
        editText.setAllowTextEntitiesIntersection(zu1Var != null && ((encryptedChat = zu1Var.h) == null || hl.W0(encryptedChat.layer) >= 101));
    }

    public final void F() {
        int q;
        int o;
        fo6 fo6Var;
        if (this.M1 == null) {
            TextureView textureView = this.C2;
            if (textureView != null) {
                kec kecVar = (kec) textureView;
                q = kecVar.getVideoWidth();
                o = kecVar.getVideoHeight();
                while (true) {
                    if (q <= 1280 && o <= 1280) {
                        break;
                    }
                    q /= 2;
                    o /= 2;
                }
            } else {
                q = this.B4.q();
                o = this.B4.o();
            }
            Bitmap bitmap = this.x4.getBitmap();
            if (bitmap == null) {
                bitmap = Bitmap.createBitmap(q, o, Bitmap.Config.ARGB_8888);
            }
            Bitmap bitmap2 = bitmap;
            int i = this.d2;
            xc8 xc8Var = this.W4;
            if (i == 1) {
                fo6Var = new fo6();
                fo6Var.k = this.E1.i;
            } else {
                fo6Var = xc8Var.c;
            }
            fo6 fo6Var2 = fo6Var;
            rx5 rx5Var = new rx5(this.h0, false, new ea8(this, (byte) 2));
            rx5Var.f = true;
            rx5Var.g = true;
            this.L1 = rx5Var;
            rx5Var.b(this.t4 != 3);
            Activity activity = this.E;
            hc8 hc8Var = new hc8(this, activity, activity, this.U, bitmap2, this.s1 ? null : this.B4.n(), this.B4.V, xc8Var.e, fo6Var2, new y98(this, (byte) 11), this.w2);
            this.M1 = hc8Var;
            jl0 c = this.Z.c(hc8Var.M0, null, false);
            c.p(dtd.i(this.w2));
            hc8Var.setBlurredBackgroundDrawableForTools(c);
            this.f0.addView(this.M1.getView(), tre.c(-1.0f, -1));
            this.M1.setOnDoneButtonClickedListener(new y98(this, (byte) 12));
            this.M1.getCancelView().setOnClickListener(new z98(this, (byte) 9));
            this.M1.v0(hl.L(126.0f));
            this.M1.setOffsetTranslationX(-hl.L(12.0f));
        }
    }

    public final void F0() {
        k88 k88Var = this.D1;
        if (k88Var != null) {
            k88Var.b(null, 0, false, false, null, null, null);
            if (this.d2 != 1) {
                return;
            }
            CropAreaView cropAreaView = this.D1.b.a;
            cropAreaView.f(true, false);
            cropAreaView.setDimVisibility(true);
            cropAreaView.invalidate();
            this.D1.setVisibility(0);
            this.D1.setAlpha(1.0f);
            b43 b43Var = this.D1.b;
            b43Var.q();
            CropAreaView cropAreaView2 = b43Var.a;
            cropAreaView2.setDimVisibility(true);
            cropAreaView2.f(true, true);
            cropAreaView2.invalidate();
            this.u2 = true;
        }
    }

    public final void F1(final boolean z, final int i, final int i2, final boolean z2, final boolean z3, boolean z4) {
        byte b;
        float f;
        boolean z5;
        oec oecVar;
        String str;
        char c;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        fo6 fo6Var;
        fo6 fo6Var2;
        TLRPC.Chat chat;
        int i3;
        zu1 zu1Var;
        xn5 xn5Var;
        String str2;
        long j;
        String M0;
        TextureView textureView;
        if (K0() || this.d == null || this.v2) {
            return;
        }
        byte b2 = 1;
        if (this.d2 == 1) {
            if (!z4 && (xn5Var = this.p2) != null) {
                TLObject tLObject = xn5Var.a;
                if (tLObject instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject;
                    String str3 = user.first_name;
                    long j2 = user.id;
                    str2 = str3;
                    j = j2;
                } else {
                    str2 = "";
                    j = 0;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f0.getContext());
                int L = hl.L(8.0f);
                id idVar = alertDialog$Builder.a;
                idVar.W0 = L;
                Context context = this.f0.getContext();
                afb afbVar = new afb(context);
                ImageReceiver imageReceiver = new ImageReceiver(afbVar);
                afbVar.a = imageReceiver;
                ImageReceiver imageReceiver2 = new ImageReceiver(afbVar);
                afbVar.b = imageReceiver2;
                rb0 rb0Var = new rb0((vnb) null);
                afbVar.e = new Path();
                rb0Var.q(yac.h(yac.t0).f());
                imageReceiver.U(yac.h(yac.t0).f(), rb0Var, null);
                imageReceiver2.U(yac.h(yac.t0).f(), rb0Var, null);
                Drawable drawable = context.getDrawable(R.drawable.msg_arrow_avatar);
                afbVar.f = drawable;
                drawable.setAlpha(100);
                TLObject tLObject2 = this.p2.a;
                ad8 ad8Var = this.f0;
                k88 k88Var = this.D1;
                rb0Var.k(tLObject2);
                imageReceiver.U(tLObject2, rb0Var, null);
                afbVar.c = ad8Var;
                afbVar.d = k88Var;
                idVar.W = afbVar;
                if (this.p2.c == 1) {
                    if (yac.h(this.U).n == j) {
                        idVar.U = hl.S2(ob6.M0(2131745227, "SetUserPhotoSelfAlertMessage"));
                    } else {
                        idVar.U = hl.S2(ob6.a0(null, null, 2131745228, str2, str2));
                    }
                    M0 = this.H4 ? ob6.M0(2131745225, "SetVideo") : ob6.M0(2131745247, "SetPhoto");
                } else {
                    if (this.H4) {
                        idVar.U = hl.S2(ob6.a0(null, null, 2131744049, str2));
                    } else {
                        idVar.U = hl.S2(ob6.a0(null, null, 2131744060, str2));
                    }
                    M0 = ob6.M0(2131744058, "SuggestPhotoShort");
                }
                String str4 = M0;
                alertDialog$Builder.g(ob6.M0(2131752570, "Cancel"), new ku7((byte) 19));
                alertDialog$Builder.j(str4, new fd() { // from class: oa8
                    @Override // fd
                    public final void w(id idVar2, int i4) {
                        Drawable[] drawableArr = PhotoViewer.d9;
                        PhotoViewer.this.F1(z, i, i2, z2, z3, true);
                    }
                });
                idVar.J = aob.gh;
                idVar.U0 = true;
                idVar.j(vm2.o(-15461356, jn7.h3));
                idVar.show();
                idVar.o(aob.w0(null, aob.eh, false));
                idVar.setOnDismissListener(new rf3(this, b2));
                if (!this.s1 || (textureView = this.C2) == null) {
                    return;
                }
                try {
                    this.D3 = textureView.getBitmap();
                    ImageView imageView = this.E3;
                    if (imageView != null) {
                        this.z2.removeView(imageView);
                        this.E3 = null;
                    }
                    ImageView imageView2 = new ImageView(this.C2.getContext());
                    this.E3 = imageView2;
                    imageView2.setBackground(new BitmapDrawable(this.D3));
                    this.z2.addView(this.E3);
                    return;
                } catch (Throwable th) {
                    Bitmap bitmap = this.C3;
                    if (bitmap != null) {
                        bitmap.recycle();
                        this.C3 = null;
                    }
                    cc4.g(th, true);
                    return;
                }
            }
            e();
        }
        if (!z2 && (zu1Var = this.k4) != null) {
            TLRPC.Chat chat2 = zu1Var.e;
            if (zu1Var.h() != null || ((xc2.T(chat2) && chat2.megagroup) || !xc2.T(chat2))) {
                uc7.s1(this.U).W3.edit().putBoolean("silent_" + this.k4.a(), !z).commit();
            }
        }
        oec k0 = k0();
        ArrayList arrayList = this.f7;
        if (!arrayList.isEmpty() && (i3 = this.O4) >= 0 && i3 < arrayList.size()) {
            Object obj = arrayList.get(this.O4);
            if (obj instanceof go6) {
                ((go6) obj).s = k0;
            }
        }
        zu1 zu1Var2 = this.k4;
        if (zu1Var2 != null && (chat = zu1Var2.e) != null && this.d2 != 11) {
            if (this.s1 || k0 != null) {
                if (!xc2.u(chat)) {
                    xnb.x(null, 2131749309, new d31(this.f0, this.w2), null);
                    return;
                }
            } else if (!xc2.p(chat)) {
                xnb.x(null, 2131749313, new d31(this.f0, this.w2), null);
                return;
            }
        }
        this.v2 = true;
        if (k0 != null) {
            long j3 = (long) (k0.q * 0.9f);
            if ((j3 > 2097152000 && !yac.h(this.U).p()) || j3 > 4194304000L) {
                if (this.b2 != null) {
                    n12 n12Var = this.b2;
                    new l46(6, yac.t0, null, n12Var.c.getContext(), n12Var.Z1).show();
                    return;
                }
                return;
            }
        }
        if (z2) {
            b = 5;
            this.d.c(k0);
        } else {
            if (this.d2 == 11) {
                Object obj2 = arrayList.get(this.O4);
                if (obj2 instanceof no6) {
                    no6 no6Var = (no6) obj2;
                    Bitmap createBitmap = Bitmap.createBitmap(512, 512, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    Path path = new Path();
                    RectF rectF = new RectF();
                    rectF.set(0.0f, 0.0f, createBitmap.getWidth(), createBitmap.getHeight());
                    float width = createBitmap.getWidth() / 8;
                    path.addRoundRect(rectF, width, width, Path.Direction.CW);
                    canvas.clipPath(path);
                    int h0 = h0(this.t4);
                    f0();
                    float L2 = h0 - hl.L(20.0f);
                    k3b k3bVar = this.o5;
                    if (k3bVar == null || !k3bVar.j0 || k3bVar.getSourceBitmap() == null) {
                        canvas.save();
                        canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                        canvas.scale(createBitmap.getWidth() / L2, createBitmap.getHeight() / L2);
                        g(canvas);
                        this.B4.h(canvas, null);
                        canvas.restore();
                    } else {
                        canvas.save();
                        canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                        canvas.scale(createBitmap.getWidth() / L2, createBitmap.getHeight() / L2);
                        g(canvas);
                        this.o5.g(canvas, false, null, false);
                        canvas.restore();
                        canvas.save();
                        canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                        canvas.scale(createBitmap.getWidth() / L2, createBitmap.getHeight() / L2);
                        g(canvas);
                        this.B4.h(canvas, null);
                        canvas.restore();
                        canvas.save();
                        canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                        canvas.scale(createBitmap.getWidth() / L2, createBitmap.getHeight() / L2);
                        g(canvas);
                        this.o5.g(canvas, true, null, false);
                        canvas.restore();
                    }
                    if (this.x4 != null) {
                        canvas.save();
                        canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                        canvas.scale(createBitmap.getWidth() / L2, createBitmap.getHeight() / L2);
                        g(canvas);
                        ImageReceiver imageReceiver3 = this.B4;
                        canvas.translate((-imageReceiver3.N0) / 2.0f, (-imageReceiver3.O0) / 2.0f);
                        f = 2.0f;
                        canvas.scale(this.B4.N0 / this.x4.getMeasuredWidth(), this.B4.O0 / this.x4.getMeasuredHeight());
                        this.x4.e = !B0();
                        this.x4.draw(canvas);
                        this.x4.e = true;
                        canvas.restore();
                    } else {
                        f = 2.0f;
                    }
                    if (B0()) {
                        Matrix matrix = new Matrix();
                        matrix.reset();
                        float f7 = L2 / f;
                        matrix.preTranslate(f7, f7);
                        if (this.o6 != null) {
                            f6 = hl.R1(0.0f, this.f6, this.k6);
                            c = 5;
                            f2 = hl.R1(this.Z5, this.d6, this.k6);
                            f3 = hl.R1(this.a6, this.e6, this.k6);
                            f4 = hl.R1(this.X5, this.c6, this.k6);
                            f5 = hl.R1(this.W5, this.b6, this.k6);
                        } else {
                            c = 5;
                            f2 = this.Z5;
                            f3 = this.a6;
                            f4 = this.X5;
                            f5 = this.W5;
                            if (this.m6 != 0) {
                                f5 = this.b6;
                                f4 = this.c6;
                                f2 = this.d6;
                            }
                            f6 = 0.0f;
                        }
                        int h02 = h0(this.t4);
                        int f0 = f0();
                        matrix.preTranslate(f5, f4 + 0.0f);
                        matrix.preScale(f2, f2);
                        matrix.preRotate(f3);
                        int q = this.B4.q();
                        int o = this.B4.o();
                        float f8 = h02;
                        float f10 = f0;
                        float min = Math.min(f8 / q, f10 / o);
                        u33 u33Var = this.E1;
                        int i4 = u33Var.i;
                        if (i4 == 90 || i4 == 270) {
                            o = q;
                            q = o;
                        }
                        float f11 = u33Var.j;
                        float f12 = u33Var.k;
                        float f13 = q;
                        float f14 = o;
                        float f15 = f8 / ((int) ((((1.0f - f11) * 0.0f) + f11) * f13));
                        float f16 = (int) ((((1.0f - f12) * 0.0f) + f12) * f14);
                        if (f15 * f16 > f10) {
                            f15 = f10 / f16;
                        }
                        int i5 = this.d2;
                        xc8 xc8Var = this.W4;
                        if (i5 == 1 || u33Var.a) {
                            TextureView textureView2 = this.C2;
                            if (textureView2 != null) {
                                fo6 fo6Var3 = xc8Var.c;
                                textureView2.setScaleX((fo6Var3 == null || !fo6Var3.l) ? 1.0f : -1.0f);
                                zc8 zc8Var = this.F2;
                                if (zc8Var != null) {
                                    zc8Var.setScaleX(this.C2.getScaleX());
                                }
                            }
                            fo6 fo6Var4 = xc8Var.c;
                            float f17 = fo6Var4 != null ? fo6Var4.c : 1.0f;
                            float A = ((f15 / min) / qd4.A(f17, 1.0f, 0.0f, 1.0f)) * f17;
                            matrix.preTranslate(u33Var.d * 1.0f, u33Var.e * 1.0f);
                            matrix.preScale(A, A);
                            matrix.preTranslate(xnb.C(u33Var.b, f13, min, 1.0f), xnb.C(u33Var.c, f14, min, 1.0f));
                            float f18 = u33Var.g + i4;
                            if (f18 > 180.0f) {
                                f18 -= 360.0f;
                            }
                            matrix.preRotate(f18);
                        }
                        if (!arrayList.isEmpty() && (fo6Var2 = xc8Var.c) != null && fo6Var2.l) {
                            matrix.preScale(-1.0f, 1.0f);
                        }
                        if (f6 > 0.0f) {
                            matrix.preScale(1.0f - (f6 * f), 1.0f);
                            matrix.preSkew(0.0f, qd4.z(1.0f, f6, 4.0f * f6, 0.25f));
                        }
                        ImageReceiver imageReceiver4 = this.B4;
                        matrix.preTranslate((-imageReceiver4.N0) / f, (-imageReceiver4.O0) / f);
                        ImageReceiver imageReceiver5 = this.B4;
                        matrix.preScale(imageReceiver5.N0, imageReceiver5.O0);
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = no6Var.p;
                        int size = arrayList3.size();
                        int i6 = 0;
                        String str5 = null;
                        while (i6 < size) {
                            Object obj3 = arrayList3.get(i6);
                            i6++;
                            mec a = ((mec) obj3).a();
                            float f19 = a.c;
                            float f20 = a.d;
                            float f21 = a.f + f19;
                            float f22 = a.g + f20;
                            float[] fArr = new float[8];
                            fArr[0] = f19;
                            fArr[1] = f20;
                            fArr[2] = f21;
                            fArr[3] = f20;
                            fArr[4] = f21;
                            fArr[c] = f22;
                            fArr[6] = f19;
                            fArr[7] = f22;
                            matrix.mapPoints(fArr);
                            Matrix matrix2 = matrix;
                            ArrayList arrayList4 = arrayList3;
                            int i7 = size;
                            a.f = ((float) Math.sqrt(Math.pow(fArr[1] - fArr[3], 2.0d) + Math.pow(fArr[0] - fArr[2], 2.0d))) / L2;
                            float sqrt = ((float) Math.sqrt(Math.pow(fArr[1] - fArr[7], 2.0d) + Math.pow(fArr[0] - fArr[6], 2.0d))) / L2;
                            a.g = sqrt;
                            a.c = (((fArr[0] + fArr[4]) / f) / L2) - (a.f / f);
                            a.d = (((fArr[1] + fArr[c]) / f) / L2) - (sqrt / f);
                            a.v = 1.0f;
                            a.A = true;
                            if (no6Var.w && (fo6Var = no6Var.A) != null) {
                                a.e = (float) (a.e - ((fo6Var.k / 180.0f) * 3.141592653589793d));
                            }
                            a.e = (float) (a.e - ((this.a6 / 180.0f) * 3.141592653589793d));
                            arrayList2.add(a);
                            TLRPC.Document document = a.B;
                            if (document != null && str5 == null) {
                                str5 = r47.V(document, null, null);
                            }
                            arrayList3 = arrayList4;
                            matrix = matrix2;
                            size = i7;
                        }
                        oec oecVar2 = new oec();
                        oecVar2.I = true;
                        oecVar2.k = 512;
                        oecVar2.h = 512;
                        oecVar2.l = 512;
                        oecVar2.i = 512;
                        oecVar2.G = arrayList2;
                        long k = Utilities.k(no6Var.t, 2999L, 800L);
                        oecVar2.r = k;
                        oecVar2.v = k;
                        oecVar2.m = 200000;
                        oecVar2.n = 30;
                        z5 = true;
                        oecVar2.N = true;
                        oecVar2.q = 262144L;
                        oecVar = oecVar2;
                        str = str5;
                    } else {
                        z5 = true;
                        oecVar = null;
                        str = null;
                    }
                    TLRPC.PhotoSize V = in5.V(createBitmap, Bitmap.CompressFormat.WEBP, 512.0f, 512.0f, 100);
                    xb4.G(yac.t0);
                    String file = xb4.J(V, "webp", z5, z5).toString();
                    if (oecVar != null) {
                        oecVar.o = file;
                    }
                    ArrayList arrayList5 = this.q5;
                    if (arrayList5 == null) {
                        arrayList5 = new ArrayList();
                        this.q5 = arrayList5;
                    }
                    if (arrayList5.isEmpty()) {
                        String str6 = this.o5.d0;
                        if (str6 == null || pv3.g(str6) == null) {
                            ArrayList arrayList6 = this.q5;
                            if (str != null) {
                                arrayList6.add(str);
                            } else {
                                arrayList6.add("👍");
                            }
                        } else {
                            this.q5.add(this.o5.d0);
                        }
                    }
                    this.v2 = false;
                    rw2 e = rw2.e();
                    k3b k3bVar2 = this.o5;
                    ArrayList arrayList7 = this.q5;
                    sb8 sb8Var = new sb8(this, file, oecVar, no6Var, z, i, i2, z3);
                    nw2 nw2Var = e.U;
                    Activity W = hl.W(k3bVar2.getContext());
                    if (W != null) {
                        e.l(W);
                        e.k(sb8Var);
                        k7a k7aVar = new k7a();
                        k7aVar.a = file;
                        k7aVar.g = oecVar;
                        e.o = arrayList7;
                        e.i(null, k7aVar, null, null, null, 3, false, null, new x53(), 0);
                        hl.r(nw2Var);
                        hl.d3(nw2Var, 16L);
                        return;
                    }
                    return;
                }
            }
            b = 5;
            this.d.L(this.O4, k0, z, i, i2, z3);
        }
        if (this.P) {
            if (this.Q) {
                hl.d3(new na8(this, b), 200L);
            } else {
                A(false, false);
            }
        }
    }

    public final void F2() {
        int i;
        r47 r47Var;
        TLRPC.Message message;
        ArrayList arrayList = this.X6;
        if (arrayList.isEmpty() || (i = this.P4) < 0 || i >= arrayList.size() || (r47Var = (r47) arrayList.get(this.P4)) == null) {
            return;
        }
        if (!this.m5 || (message = r47Var.k) == null || message.translatedText == null || !TextUtils.equals(message.translatedToLanguage, r3c.H0())) {
            J1(r47Var, r47Var.z, this.m5, true);
        } else {
            J1(r47Var, s1(r47Var), false, true);
        }
    }

    public final void G() {
        kd8 kd8Var = new kd8(this.f0.getContext(), this);
        this.i3 = kd8Var;
        this.f0.addView(kd8Var, tre.e(-1, 48, 83));
        kj4 kj4Var = new kj4((Object) this, (byte) 27);
        xb8 xb8Var = new xb8(this, kj4Var);
        tb tbVar = new tb((byte) 26, this.f0.getContext(), this);
        this.r3 = tbVar;
        tbVar.setAccessibilityDelegate(xb8Var);
        this.r3.setImportantForAccessibility(1);
        this.i3.addView(this.r3, tre.c(-1.0f, -1));
        sfc sfcVar = new sfc(this.r3);
        this.q3 = sfcVar;
        sfcVar.z = hl.L(2.0f);
        sfc sfcVar2 = this.q3;
        sfcVar2.k = 872415231;
        sfcVar2.l = 872415231;
        sfcVar2.m = -1;
        sfcVar2.n = -1;
        sfcVar2.A = 1509949439;
        sfcVar2.j = kj4Var;
        zb8 zb8Var = new zb8(this, this.f0.getContext(), new fa8(this));
        this.s3 = zb8Var;
        zb8Var.setAlpha(0.0f);
        this.f0.addView(this.s3, tre.d(-2, -2.0f, 83, 0.0f, 0.0f, 0.0f, 58.0f));
        ema emaVar = new ema(this.f0.getContext());
        this.o3 = emaVar;
        emaVar.setTextColor(-1);
        this.o3.setGravity(53);
        this.o3.setTextSize(14);
        this.o3.setImportantForAccessibility(2);
        this.i3.addView(this.o3, tre.d(-2, -2.0f, 53, 0.0f, 15.0f, 12.0f, 0.0f));
        ImageView imageView = new ImageView(this.f0.getContext());
        this.p3 = imageView;
        imageView.setImageResource(R.drawable.msg_minvideo);
        this.p3.setContentDescription(ob6.M0(2131754719, "AccExitFullscreen"));
        this.p3.setScaleType(ImageView.ScaleType.CENTER);
        this.p3.setBackground(aob.f0(1090519039, 1, -1));
        this.p3.setVisibility(4);
        this.i3.addView(this.p3, tre.e(48, 48, 53));
        this.p3.setOnClickListener(new ma8(this, (byte) 6));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00b4 A[Catch: Exception -> 0x00f9, LOOP:0: B:13:0x00ae->B:15:0x00b4, LOOP_END, TryCatch #0 {Exception -> 0x00f9, blocks: (B:7:0x002f, B:9:0x0033, B:12:0x0097, B:13:0x00ae, B:15:0x00b4, B:17:0x00b8, B:50:0x0093, B:51:0x00e5, B:35:0x0048, B:37:0x004e, B:39:0x0056, B:41:0x005e, B:43:0x0066, B:45:0x006c, B:46:0x0088), top: B:6:0x002f, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b8 A[EDGE_INSN: B:16:0x00b8->B:17:0x00b8 BREAK  A[LOOP:0: B:13:0x00ae->B:15:0x00b4], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G0(int i) {
        String valueOf;
        int intValue;
        InputStream open;
        ByteArrayOutputStream byteArrayOutputStream;
        byte[] bArr;
        int read;
        if (this.s4) {
            nc8 nc8Var = new nc8(this, this, this.E, this.w0);
            this.g0 = nc8Var;
            TLRPC.WebPage webPage = r47.n1(this.S4.k).webpage;
            nc8Var.E = webPage;
            nc8Var.x = hyc.e(webPage.embed_url);
            String str = webPage.url;
            nc8Var.requestLayout();
            try {
                if (nc8Var.x != null) {
                    nc8Var.h.setVisibility(0);
                    nc8Var.y = true;
                    nc8Var.f.addJavascriptInterface(new pd8(nc8Var), "YoutubeProxy");
                    if (str != null) {
                        try {
                            Uri parse = Uri.parse(str);
                            valueOf = i > 0 ? String.valueOf(i) : null;
                            if (valueOf == null && (valueOf = parse.getQueryParameter("t")) == null) {
                                valueOf = parse.getQueryParameter("time_continue");
                            }
                        } catch (Exception e) {
                            cc4.g(e, true);
                        }
                        if (valueOf != null) {
                            if (valueOf.contains("m")) {
                                String[] split = valueOf.split("m");
                                intValue = (Utilities.z(split[0]).intValue() * 60) + Utilities.z(split[1]).intValue();
                            } else {
                                intValue = Utilities.z(valueOf).intValue();
                            }
                            open = nc8Var.getContext().getAssets().open("youtube_embed.html");
                            byteArrayOutputStream = new ByteArrayOutputStream();
                            bArr = new byte[10240];
                            while (true) {
                                read = open.read(bArr);
                                if (read != -1) {
                                    break;
                                } else {
                                    byteArrayOutputStream.write(bArr, 0, read);
                                }
                            }
                            byteArrayOutputStream.close();
                            open.close();
                            nc8Var.f.loadDataWithBaseURL("https://messenger.telegram.org/", String.format(Locale.US, byteArrayOutputStream.toString("UTF-8"), nc8Var.x, Integer.valueOf(intValue)), "text/html", "UTF-8", "https://youtube.com");
                        }
                    }
                    intValue = 0;
                    open = nc8Var.getContext().getAssets().open("youtube_embed.html");
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    bArr = new byte[10240];
                    while (true) {
                        read = open.read(bArr);
                        if (read != -1) {
                        }
                        byteArrayOutputStream.write(bArr, 0, read);
                    }
                    byteArrayOutputStream.close();
                    open.close();
                    nc8Var.f.loadDataWithBaseURL("https://messenger.telegram.org/", String.format(Locale.US, byteArrayOutputStream.toString("UTF-8"), nc8Var.x, Integer.valueOf(intValue)), "text/html", "UTF-8", "https://youtube.com");
                } else {
                    HashMap hashMap = new HashMap();
                    hashMap.put("Referer", "messenger.telegram.org");
                    nc8Var.f.loadUrl(webPage.embed_url, hashMap);
                }
            } catch (Exception e2) {
                cc4.g(e2, true);
            }
            nc8Var.r.setEnabled(false);
            nc8Var.r.setAlpha(0.5f);
            nc8Var.n.setVisibility(0);
            if (nc8Var.x != null) {
                nc8Var.h.setVisibility(0);
            }
            nc8Var.f.setVisibility(0);
            nc8Var.f.setKeepScreenOn(true);
            if (nc8Var.x != null && "disabled".equals(uc7.s1(nc8Var.a).k4.Q0.f)) {
                nc8Var.r.setVisibility(8);
            }
            this.g0.setPlaybackSpeed(this.u1);
            this.f0.addView(this.g0, 0, tre.c(-1.0f, -1));
            if (this.g0.y) {
                Y1(true, true);
            }
            sfc sfcVar = this.q3;
            sfcVar.F = null;
            sfcVar.J = -1;
            sfcVar.I = 0.0f;
            StaticLayout[] staticLayoutArr = sfcVar.K;
            if (staticLayoutArr != null) {
                staticLayoutArr[1] = null;
                staticLayoutArr[0] = null;
            }
            sfcVar.G = null;
            sfcVar.H = -1L;
            Q2();
            this.b3 = null;
            this.c3 = null;
            this.d3 = 0L;
            this.a3 = this.e3;
            this.q3.h(false, 0.0f);
            this.X7.setProgress(0.0f);
            this.q3.f(0.0f);
        }
    }

    public final void G1(xn5 xn5Var) {
        String str;
        int i;
        TLRPC.User user;
        this.p2 = xn5Var;
        if (this.d2 == 1) {
            if (T2()) {
                this.o0.setVisibility(0);
                this.T0.setVisibility(8);
            } else {
                this.T0.setVisibility(0);
                this.o0.setVisibility(8);
            }
            if (xn5Var == null || (user = xn5Var.b) == null || xn5Var.c != 1 || !this.p2.d) {
                this.D1.setSubtitle(null);
            } else {
                boolean z = xn5Var.e;
                k88 k88Var = this.D1;
                String str2 = user.first_name;
                if (z) {
                    k88Var.setSubtitle(ob6.a0(null, null, 2131745240, str2));
                } else {
                    k88Var.setSubtitle(ob6.a0(null, null, 2131745241, str2));
                }
            }
        }
        if (xn5Var != null) {
            if (xn5Var.c == 2) {
                if (xn5Var.e) {
                    str = "SuggestVideo";
                    i = 2131744050;
                } else {
                    str = "SuggestPhoto";
                    i = 2131744061;
                }
                X1(ob6.M0(i, str));
            }
            if (xn5Var.e) {
                this.Y7.setText(ob6.M0(2131745263, "SetCover"));
            }
            this.G.setBackground(null);
            this.G.setElevation(2.0f);
        }
    }

    public final void G2() {
        int i = aob.qg;
        int y0 = y0(i);
        di3 di3Var = this.T0;
        if (di3Var != null) {
            di3Var.k();
            this.T0.invalidate();
        }
        CheckBox checkBox = this.O0;
        if (checkBox != null) {
            checkBox.c(y0(i), -1);
        }
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(y0, mode);
        ImageView imageView = this.Z0;
        if (imageView != null && imageView.getColorFilter() != null) {
            this.Z0.setColorFilter(porterDuffColorFilter);
        }
        ImageView imageView2 = this.a1;
        if (imageView2 != null && imageView2.getColorFilter() != null) {
            this.a1.setColorFilter(porterDuffColorFilter);
        }
        ImageView imageView3 = this.d1;
        if (imageView3 != null && imageView3.getColorFilter() != null) {
            this.d1.setColorFilter(porterDuffColorFilter);
        }
        ImageView imageView4 = this.c1;
        if (imageView4 != null && imageView4.getColorFilter() != null) {
            this.c1.setColorFilter(porterDuffColorFilter);
        }
        ImageView imageView5 = this.b1;
        if (imageView5 != null && imageView5.getColorFilter() != null) {
            this.b1.setColorFilter(porterDuffColorFilter);
        }
        pa2 pa2Var = this.V0;
        if (pa2Var != null) {
            ((TextView) pa2Var.b).setTextColor(y0);
        }
        pa2 pa2Var2 = this.U7;
        if (pa2Var2 != null) {
            ((TextView) pa2Var2.b).setTextColor(y0);
        }
        hc8 hc8Var = this.M1;
        if (hc8Var != null) {
            hc8Var.updateColors();
        }
        c98 c98Var = this.J1;
        if (c98Var != null) {
            ImageView imageView6 = c98Var.C0;
            ImageView imageView7 = c98Var.B0;
            ImageView imageView8 = c98Var.A0;
            vnb vnbVar = c98Var.J0;
            TextView textView = c98Var.h0;
            if (textView != null) {
                textView.setTextColor(aob.v0(i, vnbVar));
            }
            if (imageView8 != null && imageView8.getColorFilter() != null) {
                imageView8.setColorFilter(new PorterDuffColorFilter(aob.v0(i, vnbVar), mode));
            }
            if (imageView7 != null && imageView7.getColorFilter() != null) {
                imageView7.setColorFilter(new PorterDuffColorFilter(aob.v0(i, vnbVar), mode));
            }
            if (imageView6 != null && imageView6.getColorFilter() != null) {
                imageView6.setColorFilter(new PorterDuffColorFilter(aob.v0(i, vnbVar), mode));
            }
            c98Var.f();
        }
        pb8 pb8Var = this.V1;
        if (pb8Var != null) {
            pb8Var.H(this.w2);
        }
        qb8 qb8Var = this.W1;
        if (qb8Var != null) {
            qb8Var.H(this.w2);
        }
        mb8 mb8Var = this.X7;
        if (mb8Var != null) {
            mb8Var.invalidate();
        }
        jd8 jd8Var = this.p1;
        if (jd8Var != null) {
            int childCount = jd8Var.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = this.p1.getChildAt(i2);
                if (childAt instanceof p98) {
                    ((p98) childAt).c.b(aob.W9, aob.X9, aob.V9);
                }
            }
        }
        fb8 fb8Var = this.U3;
        if (fb8Var != null) {
            fb8Var.S0(true);
        }
    }

    @Override // qu4
    public final void H() {
        E0();
    }

    public final void H0() {
        k3b k3bVar = this.o5;
        if (k3bVar == null || !k3bVar.W) {
            r89 r89Var = this.a0;
            if (r89Var != null) {
                Iterator it = r89Var.iterator();
                while (it.hasNext()) {
                    hl0 hl0Var = ((jl0) it.next()).h0;
                    if (hl0Var != null) {
                        hl0Var.h = true;
                    }
                }
            }
            r89 r89Var2 = this.b0;
            if (r89Var2 != null) {
                Iterator it2 = r89Var2.iterator();
                while (it2.hasNext()) {
                    ((View) it2.next()).invalidate();
                }
            }
            pb8 pb8Var = this.V1;
            if (pb8Var != null) {
                pb8Var.m();
            }
            qb8 qb8Var = this.W1;
            if (qb8Var != null) {
                qb8Var.m();
            }
            sc8 sc8Var = this.s5;
            if (sc8Var != null) {
                sc8Var.invalidate();
            }
            sc8 sc8Var2 = this.u5;
            if (sc8Var2 != null) {
                sc8Var2.invalidate();
            }
            sc8 sc8Var3 = this.v5;
            if (sc8Var3 != null) {
                sc8Var3.invalidate();
            }
            sc8 sc8Var4 = this.w5;
            if (sc8Var4 != null) {
                sc8Var4.invalidate();
            }
            sc8 sc8Var5 = this.x5;
            if (sc8Var5 != null) {
                sc8Var5.invalidate();
            }
            mb8 mb8Var = this.X7;
            if (mb8Var != null && mb8Var.f0) {
                mb8Var.invalidate();
            }
            ad8 ad8Var = this.f0;
            if (ad8Var != null) {
                ad8Var.invalidate();
            }
        }
    }

    public final void H1(boolean z) {
        if (this.o2 != z) {
            this.o2 = z;
            this.R1.setLayerType(2, null);
            this.R1.getCurrentView().setLayerType(2, null);
            this.R1.getNextView().setLayerType(2, null);
        }
    }

    public final void H2(boolean z) {
        ad8 ad8Var;
        if (this.d2 == 1 || (ad8Var = this.f0) == null) {
            return;
        }
        this.f0.setSystemUiVisibility(!z ? (ad8Var.getPaddingLeft() > 0 || this.f0.getPaddingRight() > 0) ? 5894 : 1796 : 1792);
    }

    public final void I(po6 po6Var) {
        yl0 yl0Var;
        if (this.C2 == null) {
            byte b = 0;
            dc8 dc8Var = new dc8(b, this.E, this);
            this.z2 = dc8Var;
            dc8Var.setWillNotDraw(false);
            this.z2.setVisibility(4);
            this.f0.addView(this.z2, 0, tre.e(-1, -1, 17));
            this.E2 = false;
            if (!this.f7.isEmpty()) {
                kec kecVar = new kec(this.G2, this.E);
                this.c0.e();
                tl0 tl0Var = this.c0;
                kecVar.s = tl0Var;
                rf4 rf4Var = kecVar.b;
                if (rf4Var != null && (yl0Var = rf4Var.J) != null) {
                    tl0 tl0Var2 = yl0Var.t;
                    if (tl0Var2 != null && tl0Var2.m != null) {
                        tl0Var2.m = null;
                    }
                    yl0Var.t = tl0Var;
                    if (tl0Var != null && tl0Var.m != yl0Var) {
                        tl0Var.m = yl0Var;
                        tl0Var.d();
                    }
                }
                if (po6Var != null) {
                    kecVar.setDelegate(new ja8(po6Var, b));
                }
                this.C2 = kecVar;
            } else if (this.b && this.T2 == null) {
                this.D2 = new SurfaceView(this.E);
                this.E2 = true;
            } else {
                this.C2 = new TextureView(this.E);
            }
            SurfaceTexture surfaceTexture = this.T2;
            if (surfaceTexture != null) {
                this.C2.setSurfaceTexture(surfaceTexture);
                this.H3 = true;
                this.I3 = true;
                this.T2 = null;
            }
            TextureView textureView = this.C2;
            if (textureView != null) {
                textureView.setPivotX(0.0f);
                this.C2.setPivotY(0.0f);
                this.C2.setOpaque(false);
                this.z2.addView(this.C2, tre.e(-1, -1, 17));
            } else {
                this.z2.addView(this.D2, tre.e(-1, -1, 17));
            }
            zc8 zc8Var = new zc8(this.E, this);
            this.F2 = zc8Var;
            zc8Var.setPivotX(0.0f);
            this.F2.setPivotY(0.0f);
            this.F2.setScaleType(ImageView.ScaleType.FIT_XY);
            this.z2.addView(this.F2, tre.e(-1, -1, 17));
            if (this.d2 == 1) {
                View view = new View(this.E);
                this.A2 = view;
                view.setBackgroundColor(-1);
                this.A2.setAlpha(0.0f);
                this.z2.addView(this.A2, tre.e(-1, -1, 17));
            }
        }
    }

    public final void I0() {
        me8 me8Var = this.U8;
        if (me8Var != null) {
            me8Var.e();
        }
    }

    public final void I1() {
        kec kecVar;
        if (this.h2 || this.d2 != 1) {
            return;
        }
        if (!this.s1 || ((kecVar = (kec) this.C2) != null && kecVar.getVideoWidth() > 0 && kecVar.getVideoHeight() > 0)) {
            this.h2 = true;
            Bitmap n = this.B4.n();
            int i = this.B4.V;
            if (n == null) {
                n = this.i0.getBitmap();
                i = this.i0.getOrientation();
            }
            Bitmap bitmap = n;
            int i2 = i;
            if (bitmap == null && this.C2 == null) {
                return;
            }
            this.D1.b(bitmap, i2, false, false, this.E1, this.s1 ? (kec) this.C2 : null, this.W4.c);
        }
    }

    public final void I2(float f) {
        dc8 dc8Var = this.z2;
        if (dc8Var != null && dc8Var.getVisibility() == 0 && this.H3) {
            View view = this.E2 ? this.D2 : this.C2;
            f *= Math.min(h0(this.t4) / view.getMeasuredWidth(), A0() / view.getMeasuredHeight());
        }
        ImageReceiver imageReceiver = this.B4;
        float f2 = imageReceiver.N0;
        float f3 = imageReceiver.O0;
        fo6 fo6Var = this.W4.c;
        if (fo6Var != null) {
            f2 *= fo6Var.e;
            f3 *= fo6Var.f;
        }
        int h0 = this.d2 == 11 ? (int) (f2 * f) : ((int) ((f2 * f) - h0(this.t4))) / 2;
        int f0 = this.d2 == 11 ? (int) (f3 * f) : ((int) ((f3 * f) - f0())) / 2;
        if (h0 > 0) {
            this.D6 = -h0;
            this.E6 = h0;
        } else {
            this.E6 = 0.0f;
            this.D6 = 0.0f;
        }
        if (f0 > 0) {
            this.F6 = -f0;
            this.G6 = f0;
        } else {
            this.G6 = 0.0f;
            this.F6 = 0.0f;
        }
        hc8 hc8Var = this.M1;
        if (hc8Var != null) {
            boolean z = f <= 1.1f;
            LinearLayout linearLayout = hc8Var.h1;
            boolean z2 = !z;
            if (hc8Var.M1 != z2) {
                hc8Var.M1 = z2;
                linearLayout.animate().cancel();
                ik8.t(linearLayout.animate().alpha(z ? 0.0f : 1.0f), k43.h, 240L);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean J() {
        Object[] objArr = 0;
        if (this.o6 != null || this.D1 == null) {
            return false;
        }
        this.f6 = 1.0f;
        this.m6 = System.currentTimeMillis();
        AnimatorSet animatorSet = new AnimatorSet();
        this.o6 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, sn.g, 0.0f, 1.0f));
        this.o6.setDuration(250L);
        this.o6.setInterpolator(k43.f);
        this.o6.addListener(new wb8(this, objArr == true ? 1 : 0));
        this.o6.start();
        return !(this.D1.b.M != null ? r6.j : false);
    }

    public final boolean J0() {
        try {
            AccessibilityManager accessibilityManager = (AccessibilityManager) this.F.getSystemService("accessibility");
            if (accessibilityManager.isEnabled()) {
                if (accessibilityManager.isTouchExplorationEnabled()) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            cc4.g(e, true);
            return false;
        }
    }

    public final void J1(r47 r47Var, CharSequence charSequence, boolean z, boolean z2) {
        int i;
        boolean z3;
        TLRPC.Message message;
        CharSequence cloneSpans = hm.cloneSpans(charSequence, 3);
        f2(this.Q4, z2);
        if (!this.Q4) {
            if (this.d2 != 1) {
                this.V1.setVisibility(8);
                this.W1.setVisibility(8);
                byte b = 4;
                byte b2 = 0;
                if (!this.j2) {
                    if (this.U1 == null) {
                        FrameLayout frameLayout = new FrameLayout(this.f0.getContext());
                        this.a2 = frameLayout;
                        this.R1.setContainer(frameLayout);
                        ic8 ic8Var = new ic8(this, this.f0.getContext(), this.R1, this.a2, (byte) 0);
                        this.U1 = ic8Var;
                        this.R1.setScrollView(ic8Var);
                        this.a2.setClipChildren(false);
                        this.U1.addView(this.a2, new ViewGroup.LayoutParams(-1, -2));
                        this.f0.addView(this.U1, tre.e(-1, -1, 80));
                    }
                    if (this.R1.getParent() != this.a2) {
                        this.Q0.removeView(this.R1);
                        this.R1.setMeasureAllChildren(true);
                        this.a2.addView(this.R1, -1, -2);
                        this.s3.bringToFront();
                    }
                    if (r47Var == null || !r47Var.q4()) {
                        FrameLayout frameLayout2 = this.S1;
                        if (frameLayout2 != null) {
                            hl.B2(frameLayout2);
                            this.R1.setPadding(0, 0, 0, 0);
                        }
                    } else {
                        if (this.S1 == null) {
                            FrameLayout frameLayout3 = new FrameLayout(this.F);
                            this.S1 = frameLayout3;
                            frameLayout3.setBackground(aob.Z(620756991, 369098751, 8, 8));
                            iye.b(this.S1, 0.05f, 1.25f);
                            TextView textView = new TextView(this.F);
                            this.T1 = textView;
                            textView.setTextSize(1, 14.0f);
                            this.T1.setTextColor(-1);
                            this.T1.setTypeface(hl.o());
                            this.S1.addView(this.T1, tre.e(-2, -2, 17));
                            this.S1.setOnClickListener(new z98(this, b));
                        }
                        hl.B2(this.S1);
                        this.T1.setText(r47Var.Y0);
                        this.a2.addView(this.S1, tre.d(-1, 44.0f, 87, 16.0f, 0.0f, 16.0f, 12.0f));
                        this.R1.setPadding(0, 0, 0, hl.L(64.0f));
                        this.S1.bringToFront();
                    }
                } else if (this.R1.getParent() != this.Q0) {
                    FrameLayout frameLayout4 = this.a2;
                    if (frameLayout4 != null) {
                        frameLayout4.removeView(this.R1);
                    }
                    this.R1.setMeasureAllChildren(false);
                    this.Q0.addView(this.R1, tre.d(-1, -2.0f, 83, 0.0f, 0.0f, 76.0f, 48.0f));
                }
                boolean isEmpty = TextUtils.isEmpty(cloneSpans);
                boolean isEmpty2 = TextUtils.isEmpty(this.R1.getCurrentView().getText());
                wc8 wc8Var = this.R1;
                TextView nextView = z2 ? wc8Var.getNextView() : wc8Var.getCurrentView();
                if (!this.s1) {
                    int maxLines = nextView.getMaxLines();
                    if (maxLines == 1) {
                        this.R1.getCurrentView().setSingleLine(false);
                        this.R1.getNextView().setSingleLine(false);
                    }
                    if (this.j2) {
                        Point point = hl.q;
                        i = point.x > point.y ? 5 : 10;
                    } else {
                        i = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    }
                    if (maxLines != i) {
                        this.R1.getCurrentView().setMaxLines(i);
                        this.R1.getNextView().setMaxLines(i);
                        this.R1.getCurrentView().setEllipsize(null);
                        this.R1.getNextView().setEllipsize(null);
                    }
                } else if (nextView.getMaxLines() != 1) {
                    this.R1.getCurrentView().setMaxLines(1);
                    this.R1.getNextView().setMaxLines(1);
                    this.R1.getCurrentView().setSingleLine(true);
                    this.R1.getNextView().setSingleLine(true);
                    TextView currentView = this.R1.getCurrentView();
                    TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                    currentView.setEllipsize(truncateAt);
                    this.R1.getNextView().setEllipsize(truncateAt);
                }
                nextView.setScrollX(0);
                boolean z4 = this.j2;
                this.n2 = !z4 && z2 && isEmpty;
                if (!z4) {
                    this.U1.l0 = false;
                }
                if (z2) {
                    TransitionManager.endTransitions(z4 ? this.Q0 : this.U1);
                    if (this.j2) {
                        TransitionSet transitionSet = new TransitionSet();
                        transitionSet.setOrdering(0);
                        transitionSet.addTransition(new ChangeBounds());
                        transitionSet.addTransition(new Fade(2));
                        transitionSet.addTransition(new Fade(1));
                        transitionSet.setDuration(200L);
                        TransitionManager.beginDelayedTransition(this.Q0, transitionSet);
                    } else {
                        TransitionSet duration = new TransitionSet().addTransition(new jc8(this, isEmpty2, isEmpty, (byte) 1)).addTransition(new jc8(this, isEmpty2, isEmpty, (byte) 0)).setDuration(200L);
                        if (!isEmpty2) {
                            this.U1.l0 = true;
                            duration.addTransition(new lc8(this, b2));
                        } else if (!isEmpty) {
                            duration.addTarget((View) this.R1);
                        }
                        TransitionManager.beginDelayedTransition(this.U1, duration);
                    }
                    z3 = true;
                } else {
                    this.R1.getCurrentView().setText((CharSequence) null);
                    ic8 ic8Var2 = this.U1;
                    if (ic8Var2 != null) {
                        ic8Var2.scrollTo(0, 0);
                    }
                    z3 = false;
                }
                if (isEmpty) {
                    boolean z5 = this.j2;
                    wc8 wc8Var2 = this.R1;
                    if (z5) {
                        wc8Var2.a(ob6.M0(2131754447, "AddCaption"), z2, false);
                        this.R1.getCurrentView().setTextColor(-1291845633);
                        this.R1.setTag("empty");
                        this.R1.setVisibility(0);
                    } else {
                        wc8Var2.a(null, z2, false);
                        this.R1.getCurrentView().setTextColor(-1);
                        this.R1.b(4, !z3 || isEmpty2);
                        this.R1.setTag(null);
                    }
                } else {
                    aob.J(null, true);
                    if (r47Var == null || !this.m5 || (message = r47Var.k) == null || message.translatedText == null || !TextUtils.equals(message.translatedToLanguage, r3c.H0())) {
                        if (r47Var == null || r47Var.k.entities.isEmpty()) {
                            cloneSpans = pv3.m(new SpannableStringBuilder(cloneSpans), nextView.getPaint().getFontMetricsInt(), false, null, 0);
                        } else {
                            SpannableString spannableString = new SpannableString(cloneSpans);
                            r47Var.c(spannableString, true, false);
                            if (r47.K4(r47Var.k)) {
                                r47.h(r47Var.O3(), spannableString, false, 3, (int) r47Var.L0(), false);
                            }
                            cloneSpans = pv3.m(spannableString, nextView.getPaint().getFontMetricsInt(), false, null, 0);
                        }
                    }
                    if (r47Var != null && r47Var.q4()) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        if (!TextUtils.isEmpty(r47Var.S0)) {
                            spannableStringBuilder.append((CharSequence) r47Var.S0);
                            spannableStringBuilder.setSpan(new y7c(hl.o()), 0, spannableStringBuilder.length(), 33);
                            spannableStringBuilder.setSpan(new qc8(b2), 0, spannableStringBuilder.length(), 33);
                            spannableStringBuilder.append((CharSequence) "\n");
                        }
                        spannableStringBuilder.append(cloneSpans);
                        cloneSpans = spannableStringBuilder;
                    }
                    this.R1.setTag(cloneSpans);
                    try {
                        this.R1.a(cloneSpans, z2, this.q2 != z);
                        ic8 ic8Var3 = this.U1;
                        if (ic8Var3 != null) {
                            ic8Var3.H(ic8Var3.getWidth(), ic8Var3.getHeight());
                        }
                    } catch (Exception e) {
                        cc4.g(e, true);
                    }
                    nextView.setScrollY(0);
                    nextView.setTextColor(-1);
                    this.R1.setVisibility(this.K && (!this.s1 || this.Q0.getVisibility() == 0 || this.i7 != null) ? 0 : 4);
                }
                if (this.R1.getCurrentView() instanceof vc8) {
                    ((vc8) this.R1.getCurrentView()).setLoading(z);
                }
                this.q2 = !isEmpty && z;
                return;
            }
        }
        c0().setText(cloneSpans);
        this.R1.setVisibility(8);
    }

    public final void J2() {
        kfc kfcVar = this.G2;
        if (kfcVar != null) {
            kfcVar.s0(go.w() || this.r);
        }
        boolean z = this.p8;
        d7 d7Var = this.f1;
        if (!z) {
            d7Var.setEnabled(false);
            this.f1.setClickable(false);
            this.f1.animate().alpha(0.5f).setDuration(180L).start();
            this.X7.setMode(0);
            return;
        }
        d7Var.setEnabled(true);
        this.f1.setClickable(true);
        this.f1.animate().alpha(1.0f).setDuration(180L).start();
        if (!this.r) {
            this.N.a(this.I8, true);
            pb2 pb2Var = this.e1;
            pb2Var.c = false;
            pb2Var.invalidateSelf();
            if (this.k1.getTag() != null) {
                this.k1.setAlpha(1.0f);
                this.k1.setEnabled(true);
            }
            this.X7.setMaxProgressDiff(1.0f);
            this.X7.setMode(0);
            return;
        }
        if (this.e4 == null) {
            this.N.a(ob6.M0(2131745007, "SoundMuted"), true);
        }
        pb2 pb2Var2 = this.e1;
        pb2Var2.c = true;
        pb2Var2.invalidateSelf();
        if (this.k1.getTag() != null) {
            this.k1.setAlpha(0.5f);
            this.k1.setEnabled(false);
        }
        int i = this.d2;
        mb8 mb8Var = this.X7;
        if (i != 1) {
            mb8Var.setMaxProgressDiff(1.0f);
            this.X7.setMode(0);
        } else {
            mb8Var.setMaxProgressDiff(9600.0f / this.n8);
            this.X7.setMode(1);
            P2();
        }
    }

    public final boolean K(float f, boolean z, Runnable runnable) {
        k88 k88Var;
        if (this.o6 == null && (k88Var = this.D1) != null) {
            k88Var.b.i();
            this.a6 = 0.0f;
            this.e6 = 0.0f + f;
            if (z) {
                this.f6 = 1.0f;
            }
            this.m6 = System.currentTimeMillis();
            this.o6 = new AnimatorSet();
            if (this.d2 == 1) {
                this.d6 = 1.0f;
                this.Z5 = 1.0f;
            } else {
                ImageReceiver imageReceiver = this.B4;
                if (imageReceiver != null) {
                    int q = imageReceiver.q();
                    int o = this.B4.o();
                    if (Math.abs((((int) this.D1.b.getStateOrientation()) / 90) % 2) == 1) {
                        o = q;
                        q = o;
                    }
                    fo6 fo6Var = this.W4.c;
                    if (fo6Var != null) {
                        q = (int) (q * fo6Var.e);
                        o = (int) (o * fo6Var.f);
                    }
                    float f2 = q;
                    float f3 = o;
                    float min = Math.min(h0(1) / f2, e0(1, false) / f3);
                    this.d6 = (Math.abs((f / 90.0f) % 2.0f) == 1.0f ? Math.min(h0(1) / f3, e0(1, false) / f2) : min) / min;
                }
            }
            if (this.d2 == 11) {
                this.Z5 = z1(false) * this.Z5;
                this.d6 = z1(false) * this.d6;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new gy1(this, f, this.D1.c.getRotation(), (byte) 4));
            this.o6.playTogether(ObjectAnimator.ofFloat(this, sn.g, 0.0f, 1.0f), ofFloat);
            this.o6.setDuration(250L);
            this.o6.setInterpolator(k43.f);
            this.o6.addListener(new ok4(this, f, runnable, (byte) 3));
            this.o6.start();
            if (Math.abs(this.D1.b.getStateOrientation() + f) > 0.01f) {
                return true;
            }
        }
        return false;
    }

    public final boolean K0() {
        ub1 c0 = c0();
        if (c0 != null) {
            return c0.M.c() || c0.f.e;
        }
        return false;
    }

    public final void K1(int i) {
        L1(true, false, false, i);
    }

    public final void K2(float f, float f2, float f3, float f4) {
        float f5 = f - (f3 / 2.0f);
        float f6 = f2 - (f4 / 2.0f);
        boolean z = this.Z8;
        RectF rectF = this.Y8;
        if (!z || Math.abs(rectF.left - f5) >= 1.0f || Math.abs(rectF.top - f6) >= 1.0f || Math.abs(rectF.width() - f3) >= 1.0f || Math.abs(rectF.height() - f4) >= 1.0f) {
            rectF.set(f5, f6, f3 + f5, f4 + f6);
            this.Z8 = true;
            if (this.U8 == null || this.a9) {
                return;
            }
            this.a9 = true;
            hl.d3(this.b9, 150L);
        }
    }

    public final void L() {
        if (this.E == null || this.h0 == null) {
            return;
        }
        me8 me8Var = this.U8;
        if (me8Var != null) {
            this.U8 = null;
            me8Var.b();
        }
        u8a u8aVar = this.H7;
        if (u8aVar != null) {
            u8aVar.a();
            this.H7 = null;
        }
        ConnectionsManager.getInstance(this.U).cancelRequestsForGuid(this.c);
        w1(false);
        try {
            if (this.h0.getParent() != null) {
                ((WindowManager) this.E.getSystemService("window")).removeViewImmediate(this.h0);
                a1();
            }
            this.h0 = null;
        } catch (Exception e) {
            cc4.g(e, true);
        }
        mn5 mn5Var = this.i5;
        if (mn5Var != null) {
            mn5Var.a();
            this.i5 = null;
        }
        this.i0.setImageBitmap(null);
        if (this == k9) {
            k9 = null;
        } else {
            j9 = null;
        }
        a1();
    }

    public final boolean L0() {
        int i;
        if (this.g7 != null && (i = this.O4) >= 0) {
            ArrayList arrayList = this.e7;
            if (i < arrayList.size()) {
                TLRPC.Photo photo = (TLRPC.Photo) arrayList.get(this.O4);
                jn5 jn5Var = (jn5) this.Z6.get(this.O4);
                if (photo instanceof TLRPC.TL_photoEmpty) {
                    photo = null;
                }
                if (photo != null) {
                    int size = photo.sizes.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        TLRPC.FileLocation fileLocation = photo.sizes.get(i2).location;
                        if (fileLocation != null) {
                            int i3 = fileLocation.local_id;
                            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = this.g7.f;
                            if (i3 == tL_fileLocationToBeDeprecated.local_id && fileLocation.volume_id == tL_fileLocationToBeDeprecated.volume_id) {
                                return true;
                            }
                        }
                    }
                } else if (jn5Var != null) {
                    TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated2 = jn5Var.f;
                    int i4 = tL_fileLocationToBeDeprecated2.local_id;
                    TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated3 = this.g7.f;
                    if (i4 == tL_fileLocationToBeDeprecated3.local_id && tL_fileLocationToBeDeprecated2.volume_id == tL_fileLocationToBeDeprecated3.volume_id) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:235:0x0130, code lost:
    
        if (r43.G2.d.h() == 3) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:216:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01aa A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void L1(boolean z, boolean z2, boolean z3, int i) {
        fo6 fo6Var;
        ArrayList arrayList;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        long j;
        long j2;
        boolean z8;
        Uri uri;
        boolean z9;
        boolean z10;
        File file;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        Uri uri2;
        boolean z15;
        boolean z16;
        xc8 xc8Var;
        fo6 fo6Var2;
        boolean z17;
        r47 r47Var;
        r47 r47Var2;
        char c;
        char c2;
        boolean z18;
        byte b;
        boolean z19;
        boolean K4;
        r47 r47Var3;
        r47 r47Var4;
        r47 r47Var5;
        TLRPC.Message message;
        fo6 fo6Var3;
        mn5 mn5Var;
        if ((z3 || this.O4 != i) && this.d != null) {
            if (!z && (mn5Var = this.i5) != null) {
                mn5Var.a();
                this.i5 = null;
            }
            String o0 = o0(i);
            String[] strArr = this.b5;
            strArr[0] = o0;
            strArr[1] = o0(i + 1);
            strArr[2] = o0(i - 1);
            this.d.b0(this.O4);
            this.v1 = SystemClock.elapsedRealtime();
            int i2 = this.O4;
            this.O4 = i;
            P1(z, z2, false, i);
            u33 clone = this.E1.clone();
            xc8 xc8Var2 = this.W4;
            fo6 clone2 = (xc8Var2 == null || (fo6Var3 = xc8Var2.c) == null) ? null : fo6Var3.clone();
            boolean z20 = this.H4;
            xc8Var2.a = null;
            xc8Var2.c = null;
            xc8Var2.d = null;
            xc8Var2.e = null;
            xc8Var2.b = null;
            xc8Var2.f = null;
            xc8Var2.g = 0L;
            ArrayList arrayList2 = this.X6;
            boolean isEmpty = arrayList2.isEmpty();
            ArrayList arrayList3 = this.f7;
            if (isEmpty) {
                fo6Var = clone2;
                ArrayList arrayList4 = this.d7;
                if (arrayList4.isEmpty()) {
                    ArrayList arrayList5 = this.Z6;
                    if (!arrayList5.isEmpty()) {
                        if (i < 0 || i >= arrayList5.size()) {
                            A(false, false);
                            return;
                        }
                        jn5 jn5Var = this.Y4;
                        jn5 jn5Var2 = (jn5) arrayList5.get(i);
                        if (z && jn5Var != null && jn5Var2 != null) {
                            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = jn5Var.f;
                            int i3 = tL_fileLocationToBeDeprecated.local_id;
                            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated2 = jn5Var2.f;
                            if (i3 == tL_fileLocationToBeDeprecated2.local_id && tL_fileLocationToBeDeprecated.volume_id == tL_fileLocationToBeDeprecated2.volume_id) {
                                z13 = true;
                                this.Y4 = (jn5) arrayList5.get(i);
                                this.Z4 = (jn5) this.a7.get(i);
                                this.p0.u(25);
                                arrayList = arrayList3;
                                z7 = z13;
                                z4 = z20;
                                j = 0;
                                z6 = false;
                            }
                        }
                        z13 = false;
                        this.Y4 = (jn5) arrayList5.get(i);
                        this.Z4 = (jn5) this.a7.get(i);
                        this.p0.u(25);
                        arrayList = arrayList3;
                        z7 = z13;
                        z4 = z20;
                        j = 0;
                        z6 = false;
                    } else if (arrayList3.isEmpty()) {
                        arrayList = arrayList3;
                        z4 = z20;
                        bd8 bd8Var = this.i7;
                        if (bd8Var != null) {
                            int i4 = this.O4;
                            if (i4 < 0 || i4 >= bd8Var.j()) {
                                A(false, false);
                                return;
                            }
                            TL_iv.PageBlock pageBlock = this.i7.get(this.O4);
                            TL_iv.PageBlock pageBlock2 = this.h5;
                            boolean z21 = pageBlock2 != null && pageBlock2 == pageBlock;
                            this.h5 = pageBlock;
                            z6 = this.i7.a(this.O4) || this.i7.e(this.O4);
                            this.p0.u(25);
                            z7 = z21;
                            j = 0;
                        } else {
                            z5 = false;
                            this.p0.u(25);
                        }
                    } else {
                        if (i < 0 || i >= arrayList3.size()) {
                            A(false, false);
                            return;
                        }
                        Object obj = arrayList3.get(i);
                        if (obj instanceof TLRPC.BotInlineResult) {
                            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) obj;
                            this.X4 = botInlineResult;
                            if (botInlineResult.document != null) {
                                xb4.G(this.U);
                                this.d5 = xb4.I(botInlineResult.document).getAbsolutePath();
                                z10 = r47.J4(botInlineResult.document);
                            } else {
                                if (botInlineResult.photo != null) {
                                    xb4.G(this.U);
                                    this.d5 = xb4.I(xb4.w(botInlineResult.photo.sizes, hl.Y0(false), false, null, false)).getAbsolutePath();
                                } else {
                                    TLRPC.WebDocument webDocument = botInlineResult.content;
                                    if (webDocument instanceof TLRPC.TL_webDocument) {
                                        this.d5 = webDocument.url;
                                        z10 = botInlineResult.type.equals(MediaStreamTrack.VIDEO_TRACK_KIND);
                                    }
                                }
                                z10 = false;
                            }
                            arrayList = arrayList3;
                            z4 = z20;
                            j2 = 0;
                            z7 = false;
                            uri = null;
                            z9 = false;
                        } else {
                            if (obj instanceof no6) {
                                no6 no6Var = (no6) obj;
                                long j3 = no6Var.H;
                                int i5 = no6Var.G;
                                int i6 = no6Var.F;
                                String str = no6Var.I;
                                this.d5 = str;
                                if (str == null) {
                                    A(false, false);
                                    return;
                                }
                                z9 = no6Var.d();
                                boolean z22 = no6Var.b;
                                z4 = z20;
                                long j4 = no6Var.m;
                                this.e5 = j4;
                                arrayList = arrayList3;
                                xc8Var2.d = no6Var.o;
                                xc8Var2.a = no6Var.j;
                                xc8Var2.b = no6Var.k;
                                xc8Var2.f = no6Var.q;
                                xc8Var2.g = no6Var.t;
                                xc8Var2.e = no6Var.p;
                                xc8Var2.c = no6Var.A;
                                File file2 = new File(str);
                                Uri fromFile = Uri.fromFile(file2);
                                if (this.i2) {
                                    StringBuilder sb = new StringBuilder();
                                    if (i6 == 0 || i5 == 0) {
                                        file = file2;
                                    } else {
                                        if (sb.length() > 0) {
                                            sb.append(", ");
                                        }
                                        Locale locale = Locale.US;
                                        file = file2;
                                        sb.append(i6 + "x" + i5);
                                    }
                                    if (no6Var.b && !no6Var.d()) {
                                        if (sb.length() > 0) {
                                            sb.append(", ");
                                        }
                                        sb.append(hl.g0(no6Var.E, false, false));
                                    }
                                    if (j3 != 0) {
                                        if (sb.length() > 0) {
                                            sb.append(", ");
                                        }
                                        sb.append(hl.i0(j3, false, false));
                                    }
                                    this.m0.setText(file.getName());
                                    this.n0.setText(sb);
                                }
                                z7 = this.h7 != null;
                                uri = fromFile;
                                j2 = j4;
                                z8 = z22;
                            } else {
                                arrayList = arrayList3;
                                z4 = z20;
                                if (obj instanceof ro6) {
                                    ro6 ro6Var = (ro6) obj;
                                    this.d5 = ro6Var.g();
                                    xc8Var2.d = ro6Var.o;
                                    xc8Var2.a = ro6Var.j;
                                    xc8Var2.b = ro6Var.k;
                                    xc8Var2.f = ro6Var.q;
                                    xc8Var2.g = ro6Var.t;
                                    xc8Var2.e = ro6Var.p;
                                    xc8Var2.c = ro6Var.A;
                                }
                                j2 = 0;
                                z8 = false;
                                z7 = false;
                                uri = null;
                                z9 = false;
                            }
                            if (obj instanceof go6) {
                                go6 go6Var = (go6) obj;
                                if (B0()) {
                                    this.f5 = go6Var.h;
                                } else {
                                    String str2 = go6Var.i;
                                    if (str2 != null) {
                                        this.f5 = str2;
                                    } else {
                                        this.f5 = this.d5;
                                    }
                                }
                            }
                            z10 = z8;
                        }
                        fo6 fo6Var4 = xc8Var2.c;
                        if (fo6Var4 != null) {
                            this.J2 = true;
                            float f = fo6Var4.a;
                            this.K2 = f;
                            float f2 = fo6Var4.b;
                            this.L2 = f2;
                            float f3 = fo6Var4.c;
                            this.O2 = f3;
                            float f4 = fo6Var4.d;
                            this.P2 = f4;
                            z11 = z10;
                            int i7 = fo6Var4.k;
                            this.R2 = i7;
                            float f5 = fo6Var4.e;
                            this.M2 = f5;
                            float f6 = fo6Var4.f;
                            this.N2 = f6;
                            boolean z23 = fo6Var4.l;
                            this.Q2 = z23;
                            this.E1.b(true, f, f2, f4, i7, f3, 1.0f, 1.0f, f5, f6, 0.0f, 0.0f, z23);
                        } else {
                            z11 = z10;
                            this.J2 = false;
                            this.E1.b(false, this.K2, this.L2, this.P2, this.R2, this.O2, 1.0f, 1.0f, this.M2, this.N2, 0.0f, 0.0f, this.Q2);
                        }
                        this.p0.u(25);
                        z6 = z11;
                        j = j2;
                        z5 = false;
                        z12 = true;
                    }
                    z5 = false;
                    uri = null;
                    z12 = true;
                    z9 = false;
                } else {
                    if (i < 0 || i >= arrayList4.size()) {
                        A(false, false);
                        return;
                    }
                    this.a5 = (oy9) arrayList4.get(i);
                    this.p0.u(25);
                    arrayList = arrayList3;
                    z4 = z20;
                    z5 = false;
                }
                z6 = z5;
                z7 = z6;
                z9 = z7;
                j = 0;
                uri = null;
                z12 = true;
            } else {
                int i8 = this.O4;
                if (i8 < 0 || i8 >= arrayList2.size()) {
                    A(false, false);
                    return;
                }
                r47 r47Var6 = (r47) arrayList2.get(this.O4);
                boolean z24 = r47Var6 != null && (uc7.s1(this.U).E2(r47.B0(r47Var6.k)) || (((message = r47Var6.k) != null && message.noforwards) || r47Var6.y2()));
                boolean z25 = z && (r47Var5 = this.S4) != null && r47Var5.e1() == r47Var6.e1();
                if (z25) {
                    r47Var6.P = this.S4.P;
                }
                if (this.T4 == null || r47Var6 == null || ((r47Var4 = this.S4) != null && r47.B0(r47Var4.k) != r47.B0(r47Var6.k))) {
                    VideoAds videoAds = this.T4;
                    if (videoAds != null) {
                        videoAds.stop();
                        this.T4 = null;
                    }
                    if (r47Var6 != null) {
                        z18 = z25;
                        fo6Var = clone2;
                        VideoAds make = VideoAds.make(r47Var6.K1, r47.B0(r47Var6.k), r47Var6.e1(), new d31(this.f0, this.w2));
                        this.T4 = make;
                        kfc kfcVar = this.G2;
                        if (kfcVar != null) {
                            if (kfcVar.c0()) {
                                b = 3;
                            } else {
                                b = 3;
                            }
                            z19 = false;
                            make.setWaitingPaused(z19);
                            this.T4.setPauseOnPopupCallback(new y98(this, b));
                            this.S4 = r47Var6;
                            if (r47Var6 != null) {
                                r47Var6.j3 = true;
                            }
                            boolean D3 = r47Var6.D3();
                            K4 = r47.K4(r47Var6.k);
                            if (r47Var6.q4()) {
                                hl.r(this.y2);
                            }
                            if (this.B5 == 1) {
                                boolean x = r47Var6.x();
                                this.H6 = x;
                                if (x) {
                                    boolean z26 = this.l2;
                                    b8 b8Var = this.u0;
                                    if (z26) {
                                        b8Var.setVisibility(0);
                                        this.v0.setVisibility(0);
                                    } else {
                                        b8Var.setVisibility(8);
                                        this.v0.setVisibility(8);
                                    }
                                    this.r6 = true;
                                    this.q6.h = this;
                                } else {
                                    this.u0.setVisibility(8);
                                    this.v0.setVisibility(8);
                                    this.r6 = false;
                                    this.q6.h = null;
                                }
                            }
                            if ((K4 || D3) && !this.s4) {
                                this.s0.setVisibility(8);
                                this.q0.setVisibility(8);
                                this.A0.setVisibility(8);
                                this.p0.Q(25, z24 && (r47Var3 = this.S4) != null && r47.R3(r47Var3.k) && !this.S4.D3());
                                this.p0.m();
                            } else {
                                this.s0.setVisibility(0);
                                this.q0.setVisibility(0);
                                this.p0.S(17);
                                this.p0.u(25);
                                this.A0.setVisibility(this.p0.getVisibleSubItemsCount() > 1 ? 0 : 8);
                            }
                            N2();
                            z9 = D3;
                            arrayList = arrayList3;
                            z6 = K4;
                            z4 = z20;
                            j = 0;
                            z5 = false;
                            uri = null;
                            z12 = true;
                            z7 = z18;
                        } else {
                            b = 3;
                        }
                        z19 = true;
                        make.setWaitingPaused(z19);
                        this.T4.setPauseOnPopupCallback(new y98(this, b));
                        this.S4 = r47Var6;
                        if (r47Var6 != null) {
                        }
                        boolean D32 = r47Var6.D3();
                        K4 = r47.K4(r47Var6.k);
                        if (r47Var6.q4()) {
                        }
                        if (this.B5 == 1) {
                        }
                        if (K4) {
                        }
                        this.s0.setVisibility(8);
                        this.q0.setVisibility(8);
                        this.A0.setVisibility(8);
                        this.p0.Q(25, z24 && (r47Var3 = this.S4) != null && r47.R3(r47Var3.k) && !this.S4.D3());
                        this.p0.m();
                        N2();
                        z9 = D32;
                        arrayList = arrayList3;
                        z6 = K4;
                        z4 = z20;
                        j = 0;
                        z5 = false;
                        uri = null;
                        z12 = true;
                        z7 = z18;
                    }
                }
                fo6Var = clone2;
                z18 = z25;
                this.S4 = r47Var6;
                if (r47Var6 != null) {
                }
                boolean D322 = r47Var6.D3();
                K4 = r47.K4(r47Var6.k);
                if (r47Var6.q4()) {
                }
                if (this.B5 == 1) {
                }
                if (K4) {
                }
                this.s0.setVisibility(8);
                this.q0.setVisibility(8);
                this.A0.setVisibility(8);
                this.p0.Q(25, z24 && (r47Var3 = this.S4) != null && r47.R3(r47Var3.k) && !this.S4.D3());
                this.p0.m();
                N2();
                z9 = D322;
                arrayList = arrayList3;
                z6 = K4;
                z4 = z20;
                j = 0;
                z5 = false;
                uri = null;
                z12 = true;
                z7 = z18;
            }
            S1(z5, z12);
            fd8 fd8Var = this.c5;
            if (fd8Var != null) {
                if (this.m4 == 0) {
                    fd8Var.a.v0(z12, z12);
                } else {
                    this.p4 = fd8Var;
                }
            }
            ed8 ed8Var = this.d;
            r47 r47Var7 = this.S4;
            jn5 jn5Var3 = this.Y4;
            fd8 M = ed8Var.M(r47Var7, jn5Var3 == null ? null : jn5Var3.f, this.O4, false, false);
            this.c5 = M;
            if (M == null || M.s) {
                z14 = false;
            } else if (this.m4 == 0) {
                z14 = false;
                M.a.v0(false, true);
            } else {
                z14 = false;
                this.q4 = M;
            }
            lb8[] lb8VarArr = this.X0;
            if (!z7) {
                this.U5 = z14;
                this.W5 = 0.0f;
                this.X5 = 0.0f;
                this.b6 = 0.0f;
                this.c6 = 0.0f;
                float z1 = z1(true);
                this.d6 = z1;
                this.Z5 = z1;
                this.e6 = 0.0f;
                this.m6 = 0L;
                this.Q6 = z14;
                this.o6 = null;
                this.p6 = null;
                dc8 dc8Var = this.z2;
                if (dc8Var != null) {
                    dc8Var.setVisibility(4);
                }
                this.t6 = 0.0f;
                this.u6 = 0.0f;
                this.v6 = 1.0f;
                this.w6 = 0.0f;
                this.x6 = 0.0f;
                this.y6 = 0.0f;
                this.z6 = 0.0f;
                this.A6 = 0.0f;
                this.B6 = 0.0f;
                this.C6 = 0.0f;
                this.J6 = false;
                this.K6 = false;
                this.L6 = (byte) 0;
                this.M6 = (byte) 0;
                this.N6 = false;
                this.O6 = false;
                this.P6 = true;
                this.I6 = false;
                this.S6 = (byte) 0;
                if (this.B5 != 1) {
                    this.H6 = (this.s4 || (arrayList.isEmpty() && (strArr[0] == null || lb8VarArr[0].h == 0))) ? false : true;
                }
                I2(this.Z5);
                w1(false);
            }
            if (z9 && this.d2 == 11) {
                uri2 = null;
                z15 = false;
                z16 = false;
            } else {
                uri2 = uri;
                z15 = z9;
                z16 = z6;
            }
            if (!z16 || uri2 == null) {
                xc8Var = xc8Var2;
                fo6Var2 = fo6Var;
                z17 = z4;
            } else {
                this.Q3 = false;
                xc8Var = xc8Var2;
                fo6Var2 = fo6Var;
                z17 = z4;
                t1(null, uri2, (this.d2 == 1 && !(z15 && U0())) || (z15 && !U0()), false, xc8Var2.d, z15, j);
            }
            if (arrayList.isEmpty()) {
                xc8Var.a = null;
                xc8Var.c = null;
                xc8Var.d = null;
                xc8Var.e = null;
                xc8Var.b = null;
                xc8Var.f = null;
                xc8Var.g = 0L;
            }
            this.H4 = z16;
            this.I4 = z15;
            if (i2 == -1 || z3) {
                M1();
                for (int i10 = 0; i10 < 3; i10++) {
                    v(i10, false);
                }
            } else {
                v(0, false);
                int i11 = this.O4;
                ImageView[] imageViewArr = this.y3;
                if (i2 > i11) {
                    ImageReceiver imageReceiver = this.C4;
                    this.C4 = this.B4;
                    this.B4 = this.A4;
                    this.A4 = imageReceiver;
                    fi0 fi0Var = this.F4;
                    this.F4 = this.E4;
                    this.E4 = this.D4;
                    this.D4 = fi0Var;
                    mm[] mmVarArr = this.K8;
                    if (mmVarArr != null) {
                        mm mmVar = mmVarArr[0];
                        mmVarArr[0] = mmVarArr[1];
                        mmVarArr[1] = mmVarArr[2];
                        mmVarArr[2] = mmVar;
                    }
                    this.J4 = z17;
                    this.G1 = clone;
                    this.I1 = fo6Var2;
                    lb8 lb8Var = lb8VarArr[0];
                    lb8VarArr[0] = lb8VarArr[2];
                    lb8VarArr[2] = lb8Var;
                    ImageView imageView = imageViewArr[0];
                    ImageView imageView2 = imageViewArr[2];
                    imageViewArr[0] = imageView2;
                    imageViewArr[2] = imageView;
                    imageView2.setTranslationY(imageView.getTranslationY());
                    this.H1 = null;
                    O1(this.O4 - 1, this.y4);
                    O1(this.O4, this.x4);
                    O1(this.O4 + 1, this.z4);
                    N1(this.A4, this.O4 - 1, this.F1);
                    Integer num = this.B4.Z0;
                    if (num != null && num.equals(1)) {
                        N1(this.B4, this.O4, null);
                    }
                    C2();
                    v(1, false);
                    v(2, false);
                } else {
                    fo6 fo6Var5 = fo6Var2;
                    boolean z27 = z17;
                    if (i2 < i11) {
                        ImageReceiver imageReceiver2 = this.A4;
                        this.A4 = this.B4;
                        this.B4 = this.C4;
                        this.C4 = imageReceiver2;
                        fi0 fi0Var2 = this.D4;
                        this.D4 = this.E4;
                        this.E4 = this.F4;
                        this.F4 = fi0Var2;
                        mm[] mmVarArr2 = this.K8;
                        if (mmVarArr2 != null) {
                            mm mmVar2 = mmVarArr2[2];
                            c2 = 1;
                            mmVarArr2[2] = mmVarArr2[1];
                            c = 0;
                            mmVarArr2[1] = mmVarArr2[0];
                            mmVarArr2[0] = mmVar2;
                        } else {
                            c = 0;
                            c2 = 1;
                        }
                        this.G4 = z27;
                        this.F1 = clone;
                        this.H1 = fo6Var5;
                        lb8 lb8Var2 = lb8VarArr[c];
                        lb8VarArr[c] = lb8VarArr[c2];
                        lb8VarArr[c2] = lb8Var2;
                        ImageView imageView3 = imageViewArr[c];
                        ImageView imageView4 = imageViewArr[c2];
                        imageViewArr[c] = imageView4;
                        imageViewArr[c2] = imageView3;
                        imageView4.setTranslationY(imageView3.getTranslationY());
                        this.I1 = null;
                        O1(this.O4 - 1, this.y4);
                        O1(this.O4, this.x4);
                        O1(this.O4 + 1, this.z4);
                        N1(this.C4, this.O4 + 1, this.G1);
                        Integer num2 = this.B4.Z0;
                        if (num2 != null && num2.equals(1)) {
                            N1(this.B4, this.O4, null);
                        }
                        C2();
                        v(1, false);
                        v(2, false);
                    }
                }
                Bitmap bitmap = this.N4;
                if (bitmap != null) {
                    bitmap.recycle();
                    this.N4 = null;
                }
            }
            M();
            if (this.V1 != null) {
                ed8 ed8Var2 = this.d;
                long a = ed8Var2 != null ? ed8Var2.a() : 0L;
                if (a == 0 && (r47Var2 = this.S4) != null) {
                    a = r47.B0(r47Var2.k);
                }
                this.V1.setDialogId(a);
                qb8 qb8Var = this.W1;
                if (qb8Var != null) {
                    qb8Var.setDialogId(a);
                }
            }
            if (this.T0 != null) {
                ed8 ed8Var3 = this.d;
                long a2 = ed8Var3 != null ? ed8Var3.a() : 0L;
                if (a2 == 0 && (r47Var = this.S4) != null) {
                    a2 = r47.B0(r47Var.k);
                }
                di3 di3Var = this.T0;
                ed8 ed8Var4 = this.d;
                long M1 = (ed8Var4 == null || !ed8Var4.p() || this.d.v()) ? uc7.s1(this.U).M1(a2) : 0L;
                ed8 ed8Var5 = this.d;
                di3Var.i(Math.max(1, ed8Var5 == null ? 1 : ed8Var5.G()), M1, true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void L2() {
        p7b p7bVar;
        long j;
        String k;
        ArrayList arrayList;
        Uri uri;
        TLRPC.Document document;
        if (this.f0 != null) {
            kfc kfcVar = this.G2;
            if (kfcVar == null || this.s1 || this.G8 || this.d2 != 0 || this.I4) {
                p7bVar = null;
            } else {
                Uri uri2 = this.V4;
                byte b = 0;
                if (uri2 != null || this.U4 == null) {
                    j = 0;
                } else {
                    if (this.l7 == null) {
                        TLRPC.Document R = kfcVar.R();
                        ArrayList arrayList2 = this.U4;
                        int size = arrayList2.size();
                        int i = 0;
                        while (i < size) {
                            Object obj = arrayList2.get(i);
                            i++;
                            ArrayList arrayList3 = ((hfc) obj).d;
                            int size2 = arrayList3.size();
                            int i2 = 0;
                            while (i2 < size2) {
                                Object obj2 = arrayList3.get(i2);
                                i2++;
                                jfc jfcVar = (jfc) obj2;
                                if (R == null || (uri = jfcVar.d) == null || (document = jfcVar.g) == null) {
                                    arrayList = arrayList2;
                                } else {
                                    arrayList = arrayList2;
                                    if (document.id == R.id) {
                                        this.l7 = uri;
                                        this.m7 = document.size;
                                    }
                                }
                                arrayList2 = arrayList;
                            }
                        }
                    }
                    j = 0;
                    uri2 = this.l7;
                    if (uri2 != null && "file".equals(uri2.getScheme()) && uri2.getPath() != null && this.m7 > 0 && new File(uri2.getPath()).length() < this.m7) {
                        y98 y98Var = this.n7;
                        hl.r(y98Var);
                        hl.d3(y98Var, 3000L);
                        uri2 = null;
                    }
                }
                String scheme = uri2 == null ? null : uri2.getScheme();
                if (!"file".equals(scheme) || uri2.getPath() == null) {
                    if ("tg".equals(scheme)) {
                        Long A = uri2 == null ? null : Utilities.A(uri2.getQueryParameter("size"));
                        if (A != null && A.longValue() > j) {
                            p7bVar = new ym4(uri2, A, (byte) 26);
                            StringBuilder sb = new StringBuilder("captions: player video ");
                            if (p7bVar == null) {
                                k = c00.i("heard from ", scheme);
                            } else {
                                StringBuilder sb2 = new StringBuilder("can't be heard (");
                                if (uri2 == null) {
                                    scheme = "no single file";
                                }
                                k = c00.k(sb2, scheme, ")");
                            }
                            bs2.x(sb, k, "Dictation");
                        }
                    }
                    p7bVar = null;
                    StringBuilder sb3 = new StringBuilder("captions: player video ");
                    if (p7bVar == null) {
                    }
                    bs2.x(sb3, k, "Dictation");
                } else {
                    File file = new File(uri2.getPath());
                    if (file.exists()) {
                        p7bVar = new k7b(file.getAbsolutePath(), file, b);
                        StringBuilder sb32 = new StringBuilder("captions: player video ");
                        if (p7bVar == null) {
                        }
                        bs2.x(sb32, k, "Dictation");
                    }
                    p7bVar = null;
                    StringBuilder sb322 = new StringBuilder("captions: player video ");
                    if (p7bVar == null) {
                    }
                    bs2.x(sb322, k, "Dictation");
                }
            }
            if (p7bVar == null && this.k7 == null) {
                return;
            }
            lfc lfcVar = this.k7;
            if (lfcVar == null) {
                lfcVar = new lfc(new ua8(this));
                this.k7 = lfcVar;
            }
            lfcVar.a(this.U, p7bVar);
        }
    }

    public final void M() {
        if (this.B4.m() != null || this.f7.isEmpty() || this.d2 == 1) {
            return;
        }
        String str = this.B4.R;
        String str2 = this.w4;
        if (str2 == null || !str2.equals(str)) {
            this.v4 = (byte) 0;
            mn5 p = this.B4.p();
            int i = this.B4.V;
            if (str == null || p == null || p.c == null) {
                return;
            }
            Utilities.e.c(new y36((Object) this, (Object) p, i, (Object) str, (byte) 19));
        }
    }

    public final boolean M0(bd8 bd8Var) {
        if (bd8Var == null) {
            return false;
        }
        Object g = bd8Var.g();
        if (!(g instanceof r47)) {
            return false;
        }
        r47 r47Var = (r47) g;
        if (r47Var.k != null) {
            return uc7.s1(this.U).E2(r47.B0(r47Var.k)) || r47Var.k.noforwards || r47Var.y2();
        }
        return false;
    }

    public final void M1() {
        if (this.m4 == 0) {
            N1(this.B4, this.O4, null);
            O1(this.O4, this.x4);
            N1(this.C4, this.O4 + 1, this.G1);
            O1(this.O4 + 1, this.z4);
            N1(this.A4, this.O4 - 1, this.F1);
            O1(this.O4 - 1, this.y4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:188:0x0449  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void M2(int i, boolean z) {
        kfc kfcVar;
        r47 r47Var;
        sfc sfcVar;
        r47 r47Var2;
        StaticLayout[] staticLayoutArr;
        String str;
        vl4 vl4Var;
        float f;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        nc8 nc8Var;
        if (this.G2 != null || ((nc8Var = this.g0) != null && nc8Var.y)) {
            VideoAds videoAds = this.T4;
            if (videoAds != null) {
                videoAds.setWaitingPaused((z && i == 3) ? false : true);
            }
            nc8 nc8Var2 = this.g0;
            if (nc8Var2 != null && nc8Var2.y && !z) {
                t2(true, true);
            }
            nc8 nc8Var3 = this.g0;
            if (nc8Var3 != null && nc8Var3.y && i == 3 && z0() >= 10000 && this.b3 == null && this.c3 == null) {
                if (this.S4 != null) {
                    long z0 = z0() / 1000;
                    TLRPC.Message message = this.S4.k;
                    String str2 = (message == null || (messageMedia = message.media) == null || (webPage = messageMedia.webpage) == null) ? null : webPage.url;
                    if (!TextUtils.isEmpty(str2)) {
                        if (z0 >= 10) {
                            hd8 hd8Var = (hd8) f9.get(str2);
                            r47 r47Var3 = this.S4;
                            f = 0.999f;
                            if (r47Var3.c0 < 0.0f && hd8Var != null) {
                                float f2 = hd8Var.a;
                                if (f2 > 0.0f && f2 < 0.999f) {
                                    r47Var3.c0 = f2;
                                    this.q3.h(false, f2);
                                }
                            }
                            this.c3 = str2;
                        } else {
                            f = 0.999f;
                        }
                        if (z0 >= 300) {
                            if (this.S4.c0 < 0.0f) {
                                float f3 = org.telegram.messenger.a.b.getSharedPreferences("media_saved_pos", 0).getFloat(str2, -1.0f);
                                if (f3 > 0.0f && f3 < f) {
                                    this.S4.c0 = f3;
                                    this.q3.h(false, f3);
                                }
                            }
                            this.b3 = str2;
                        }
                    }
                }
                r47 r47Var4 = this.S4;
                if (r47Var4 != null) {
                    float f4 = r47Var4.c0;
                    if (f4 >= 0.0f) {
                        D1(f4);
                        this.S4.c0 = -1.0f;
                    }
                }
            }
            if (this.Q3) {
                if (i != 2 || !this.V2) {
                    boolean z2 = this.a3 != 0.0f || i == 2;
                    if (z2) {
                        hl.r(this.y2);
                    } else {
                        A1();
                    }
                    x2(z2, true);
                } else if (z) {
                    this.V2 = false;
                }
            }
            dc8 dc8Var = this.z2;
            if (dc8Var != null) {
                dc8Var.setKeepScreenOn((!z || i == 4 || i == 1) ? false : true);
            }
            if (!z || i == 4 || i == 1) {
                try {
                    this.E.getWindow().clearFlags(128);
                    this.h3 = false;
                } catch (Exception e) {
                    cc4.g(e, true);
                }
            } else {
                try {
                    this.E.getWindow().addFlags(128);
                    this.h3 = true;
                } catch (Exception e2) {
                    cc4.g(e2, true);
                }
            }
            if (i == 3 || i == 1) {
                r47 r47Var5 = this.S4;
                if (r47Var5 != null && (kfcVar = this.G2) != null) {
                    this.s3.c(r47Var5, kfcVar);
                }
                float f5 = this.a3;
                if (f5 != 0.0f) {
                    D1(f5);
                    this.a3 = 0.0f;
                    r47 r47Var6 = this.S4;
                    if (r47Var6 != null) {
                        xb4 G = xb4.G(r47Var6.K1);
                        TLRPC.Document F0 = this.S4.F0();
                        if (!G.T(F0, false) && !G.T(F0, true)) {
                            this.V2 = true;
                        }
                    }
                }
            }
            float f6 = 1.0f;
            if (i == 3) {
                dc8 dc8Var2 = this.z2;
                if (dc8Var2 != null && dc8Var2.getVisibility() != 0) {
                    this.z2.setVisibility(0);
                }
                if (!this.w0.isEnabled() && this.w0.getVisibility() == 0) {
                    this.s2 = true;
                    this.w0.setEnabled(true);
                    this.w0.animate().alpha(1.0f).setDuration(175L).withEndAction(null).start();
                }
                this.W2 = true;
                r47 r47Var7 = this.S4;
                if (r47Var7 != null && r47.K4(r47Var7.k)) {
                    hl.r(this.x2);
                    xb4.G(this.S4.K1).Z(this.S4.F0(), true, false);
                }
            } else if (i == 2 && z && (r47Var = this.S4) != null && r47.K4(r47Var.k)) {
                boolean z3 = this.W2;
                ib8 ib8Var = this.x2;
                if (z3) {
                    ib8Var.run();
                } else {
                    hl.d3(ib8Var, 1000L);
                }
            }
            kfc kfcVar2 = this.G2;
            if (kfcVar2 == null ? this.g0.H : kfcVar2.c0()) {
                if (i != 4) {
                    if (!this.P3) {
                        this.P3 = true;
                        this.X0[0].d(this.s1 ? -1 : 4, false, true);
                        lb8 lb8Var = this.X0[0];
                        if (!this.s1 && ((!J0() || this.X2) && ((this.Y2 && !this.X2) || !this.K))) {
                            f6 = 0.0f;
                        }
                        lb8Var.e(1, f6, false);
                        this.X2 = true;
                        hl.c3(this.h4);
                    }
                    I0();
                    sfcVar = this.q3;
                    r47Var2 = this.S4;
                    long z02 = z0();
                    sfcVar.getClass();
                    if (r47Var2 != null || z02 < 0) {
                        sfcVar.F = null;
                        sfcVar.J = -1;
                        sfcVar.I = 0.0f;
                        staticLayoutArr = sfcVar.K;
                        if (staticLayoutArr != null) {
                            staticLayoutArr[1] = null;
                            staticLayoutArr[0] = null;
                        }
                        sfcVar.G = null;
                        sfcVar.H = -1L;
                    } else {
                        CharSequence charSequence = r47Var2.z;
                        if (r47Var2.d5()) {
                            if (r47Var2.B == null && (str = r47Var2.k.media.webpage.description) != null) {
                                r47Var2.B = SpannableString.valueOf(str);
                                r47.h(r47Var2.N3(), r47Var2.B, false, 3, (int) z02, false);
                            }
                            charSequence = r47Var2.B;
                        }
                        if (charSequence != sfcVar.G || sfcVar.H != z02) {
                            sfcVar.G = charSequence;
                            sfcVar.H = z02;
                            if (charSequence instanceof Spanned) {
                                Spanned spanned = (Spanned) charSequence;
                                try {
                                    f8c[] f8cVarArr = (f8c[]) spanned.getSpans(0, spanned.length(), f8c.class);
                                    sfcVar.F = new ArrayList();
                                    sfcVar.I = 0.0f;
                                    if (sfcVar.L == null) {
                                        TextPaint textPaint = new TextPaint(1);
                                        sfcVar.L = textPaint;
                                        textPaint.setTextSize(hl.L(12.0f));
                                        sfcVar.L.setColor(-1);
                                    }
                                    for (f8c f8cVar : f8cVarArr) {
                                        if (f8cVar != null && f8cVar.getURL() != null && f8cVar.d != null && f8cVar.getURL().startsWith("video?")) {
                                            if (Utilities.z(f8cVar.getURL().substring(6)).intValue() >= 0) {
                                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(f8cVar.d);
                                                pv3.l(spannableStringBuilder, sfcVar.L.getFontMetricsInt(), false);
                                                sfcVar.F.add(new Pair(Float.valueOf((r6.intValue() * 1000) / z02), spannableStringBuilder));
                                            }
                                        }
                                    }
                                    Collections.sort(sfcVar.F, new fna((byte) 13));
                                } catch (Exception e3) {
                                    cc4.g(e3, true);
                                    sfcVar.F = null;
                                    sfcVar.J = -1;
                                    sfcVar.I = 0.0f;
                                    StaticLayout[] staticLayoutArr2 = sfcVar.K;
                                    if (staticLayoutArr2 != null) {
                                        staticLayoutArr2[1] = null;
                                        staticLayoutArr2[0] = null;
                                    }
                                }
                            } else {
                                sfcVar.F = null;
                                sfcVar.J = -1;
                                sfcVar.I = 0.0f;
                                StaticLayout[] staticLayoutArr3 = sfcVar.K;
                                if (staticLayoutArr3 != null) {
                                    staticLayoutArr3[1] = null;
                                    staticLayoutArr3[0] = null;
                                }
                            }
                        }
                    }
                    Q2();
                    hl.c3(new y98(this, (byte) 10));
                }
            }
            if (this.P3 || i == 4) {
                if (this.t4 != 3) {
                    this.X0[0].e(1, 1.0f, i == 4);
                    lb8 lb8Var2 = this.X0[0];
                    lb8Var2.d(3, false, lb8Var2.m[1] > 0.0f);
                }
                this.P3 = false;
                hl.r(this.h4);
                if (i == 4) {
                    if (this.s1) {
                        mb8 mb8Var = this.X7;
                        if (!mb8Var.r) {
                            mb8Var.setProgress(mb8Var.getLeftProgress());
                            if (this.G8 || (this.t4 == 0 && this.W7.getVisibility() != 0)) {
                                D1(0.0f);
                            } else {
                                D1(this.X7.getLeftProgress());
                            }
                            this.H2 = false;
                            m();
                            if (this.d2 == 1 || this.t4 != 0 || this.n6 > 0) {
                                r1();
                            } else {
                                p1();
                            }
                            this.f0.invalidate();
                        }
                    } else {
                        this.q3.h(false, 0.0f);
                        this.r3.invalidate();
                        if (this.G8 || this.W7.getVisibility() != 0) {
                            D1(0.0f);
                        } else {
                            D1(this.X7.getLeftProgress());
                        }
                        this.H2 = false;
                        p1();
                        if (!this.K) {
                            t2(true, true);
                        }
                    }
                    me8 me8Var = this.U8;
                    if (me8Var != null) {
                        xl4 xl4Var = me8Var.e;
                        if (xl4Var != null && (vl4Var = xl4Var.q) != null) {
                            xl4Var.K = true;
                            xl4Var.L = 0.0f;
                            xl4Var.M = 0.0f;
                            vl4Var.invalidate();
                            xl4Var.s();
                            if (!xl4Var.x) {
                                xl4Var.x = true;
                                xl4Var.q(true);
                                hl.r(xl4Var.V);
                                xl4Var.z = false;
                            }
                        }
                        me8Var.b.d();
                    }
                }
            }
            I0();
            sfcVar = this.q3;
            r47Var2 = this.S4;
            long z022 = z0();
            sfcVar.getClass();
            if (r47Var2 != null) {
            }
            sfcVar.F = null;
            sfcVar.J = -1;
            sfcVar.I = 0.0f;
            staticLayoutArr = sfcVar.K;
            if (staticLayoutArr != null) {
            }
            sfcVar.G = null;
            sfcVar.H = -1L;
            Q2();
            hl.c3(new y98(this, (byte) 10));
        }
    }

    public final void N() {
        SharedPreferences.Editor edit = uc7.e1().edit();
        edit.putInt(String.format("compress_video_%d", Integer.valueOf(this.e8)), this.d8);
        edit.commit();
        S2();
        P2();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0797  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0804  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x0833  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x07ba  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0361  */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v37, types: [org.telegram.tgnet.TLRPC$PhotoSize] */
    /* JADX WARN: Type inference failed for: r11v44 */
    /* JADX WARN: Type inference failed for: r11v45 */
    /* JADX WARN: Type inference failed for: r11v46 */
    /* JADX WARN: Type inference failed for: r24v4 */
    /* JADX WARN: Type inference failed for: r24v6 */
    /* JADX WARN: Type inference failed for: r24v7 */
    /* JADX WARN: Type inference failed for: r24v8 */
    /* JADX WARN: Type inference failed for: r2v68, types: [org.telegram.tgnet.TLRPC$Photo] */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v34 */
    /* JADX WARN: Type inference failed for: r7v35 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N1(ImageReceiver imageReceiver, int i, u33 u33Var) {
        r47 r47Var;
        TLRPC.PhotoSize photoSize;
        TLObject tLObject;
        int i2;
        boolean z;
        boolean z2;
        long[] jArr;
        jn5 jn5Var;
        Object obj;
        ?? r24;
        BitmapDrawable bitmapDrawable;
        jn5 jn5Var2;
        jn5 jn5Var3;
        boolean z3;
        TLRPC.Photo photo;
        BitmapDrawable bitmapDrawable2;
        jn5 jn5Var4;
        lm lmVar;
        lm lmVar2;
        TLRPC.PhotoSize photoSize2;
        BitmapDrawable bitmapDrawable3;
        jn5 jn5Var5;
        String str;
        jxc jxcVar;
        jn5 jn5Var6;
        ?? r11;
        fo6 fo6Var;
        TLObject tLObject2;
        String str2;
        int i3;
        boolean z4;
        long j;
        TLRPC.Document document;
        String str3;
        TLRPC.PhotoSize photoSize3;
        ?? r7;
        TLRPC.Document document2;
        TLObject tLObject3;
        jn5 jn5Var7;
        TLRPC.Document document3;
        long j2;
        jn5 jn5Var8;
        TLObject tLObject4;
        jn5 jn5Var9;
        jn5 jn5Var10;
        TLRPC.Document document4;
        fo6 fo6Var2;
        boolean z5;
        Drawable drawable;
        Activity activity;
        Drawable drawable2;
        Drawable drawable3;
        Activity activity2;
        boolean z6;
        fo6 fo6Var3;
        ImageReceiver imageReceiver2;
        jn5 jn5Var11;
        jn5 jn5Var12;
        jn5 jn5Var13;
        Object obj2;
        BitmapDrawable bitmapDrawable4;
        String str4;
        imageReceiver.o0(0, 0, false);
        ArrayList arrayList = this.d7;
        TLRPC.Document document5 = null;
        document5 = null;
        if (!arrayList.isEmpty()) {
            if (i < 0 || i >= arrayList.size()) {
                return;
            }
            arrayList.get(i);
            hl.Y0(false);
            mn5 mn5Var = this.i5;
            if (mn5Var == null || imageReceiver != this.B4) {
                mn5Var = null;
            }
            if (mn5Var == null) {
                mn5Var = this.d.k(i);
            }
            oy9 oy9Var = (oy9) arrayList.get(i);
            long j3 = oy9Var.b.size;
            jn5 jn5Var14 = new jn5();
            jn5Var14.h = oy9Var;
            imageReceiver.Z(jn5Var14, "d", null, null, mn5Var != null ? new BitmapDrawable(mn5Var.c) : null, j3, null, null, 0);
            return;
        }
        ArrayList arrayList2 = this.f7;
        if (arrayList2.isEmpty()) {
            bd8 bd8Var = this.i7;
            if (bd8Var != null) {
                int[] iArr = new int[1];
                TLObject d = bd8Var.d(i);
                TLRPC.PhotoSize f = this.i7.f(d, iArr);
                if (f == null) {
                    if (iArr[0] == 0) {
                        imageReceiver.g0(null);
                        return;
                    } else {
                        imageReceiver.g0(this.E.getResources().getDrawable(R.drawable.transparent));
                        return;
                    }
                }
                if (!(d instanceof TLRPC.Photo)) {
                    if (!this.i7.a(i) && !this.i7.e(i)) {
                        if (imageReceiver != this.B4 || (lmVar2 = this.k2) == null) {
                            return;
                        }
                        imageReceiver.g0(lmVar2);
                        this.k2.f(this.f0);
                        return;
                    }
                    if (f.location instanceof TLRPC.TL_fileLocationUnavailable) {
                        imageReceiver.g0(this.E.getResources().getDrawable(R.drawable.photoview_placeholder));
                        return;
                    }
                    mn5 mn5Var2 = this.i5;
                    if (mn5Var2 == null || imageReceiver != this.B4) {
                        mn5Var2 = null;
                    }
                    imageReceiver.Z(null, null, mn5Var2 == null ? jn5.c(f, (TLRPC.Document) d) : null, "b", mn5Var2 != null ? new BitmapDrawable(mn5Var2.c) : null, 0L, null, this.i7.g(), 1);
                    return;
                }
                TLRPC.Photo photo2 = (TLRPC.Photo) d;
                mn5 mn5Var3 = this.i5;
                if (mn5Var3 == null || imageReceiver != this.B4) {
                    mn5Var3 = null;
                }
                if (iArr[0] == 0) {
                    iArr[0] = -1;
                }
                if ((lq3.q(this.U).l() & 1) != 0 || this.O4 == i) {
                    photoSize2 = null;
                } else {
                    xb4.G(this.U);
                    photoSize2 = null;
                    if (!xb4.J(f, null, true, true).exists()) {
                        r13 = false;
                    }
                }
                if (mn5Var3 == null) {
                    jn5Var5 = jn5.i(xb4.w(photo2.sizes, 80, false, photoSize2, false), photo2);
                    bitmapDrawable3 = null;
                } else {
                    bitmapDrawable3 = new BitmapDrawable(mn5Var3.c);
                    jn5Var5 = null;
                }
                imageReceiver.Z(r13 ? jn5.i(f, photo2) : null, null, jn5Var5, "b", bitmapDrawable3, iArr[0], null, this.i7.g(), 1);
                imageReceiver.Z0 = r13 ? null : 1;
                return;
            }
            ArrayList arrayList3 = this.X6;
            if (arrayList3.isEmpty() || i < 0 || i >= arrayList3.size()) {
                r47Var = null;
            } else {
                r47 r47Var2 = (r47) arrayList3.get(i);
                imageReceiver.H0 = true;
                r47Var = r47Var2;
            }
            if (r47Var != null) {
                int i4 = r47Var.K1;
                if (!TextUtils.isEmpty(uc7.s1(i4).E1(r47Var.k.restriction_reason))) {
                    imageReceiver.g0(this.E.getResources().getDrawable(R.drawable.photoview_placeholder));
                    return;
                }
                if (r47.K4(r47Var.k)) {
                    ArrayList arrayList4 = r47Var.p0;
                    if (arrayList4 == null || arrayList4.isEmpty()) {
                        imageReceiver.g0(this.E.getResources().getDrawable(R.drawable.photoview_placeholder));
                        return;
                    }
                    mn5 mn5Var4 = this.i5;
                    if (mn5Var4 == null || imageReceiver != this.B4) {
                        mn5Var4 = null;
                    }
                    TLRPC.PhotoSize w = xb4.w(r47Var.p0, jn7.q5, false, null, false);
                    if (r47Var.D3()) {
                        imageReceiver.G0 = true;
                        imageReceiver.Z(p0(i, null), null, mn5Var4 == null ? jn5.f(w, r47Var.n0) : null, "b", mn5Var4 != null ? new BitmapDrawable(mn5Var4.c) : null, 0L, null, r47Var, 1);
                    } else {
                        imageReceiver.G0 = w.w < 100 && w.h < 100;
                        imageReceiver.Z(null, null, mn5Var4 == null ? jn5.f(w, r47Var.n0) : null, "b", mn5Var4 != null ? new BitmapDrawable(mn5Var4.c) : null, 0L, null, r47Var, 1);
                    }
                    mn5 mn5Var5 = this.i5;
                    if (mn5Var5 != null) {
                        imageReceiver.o0(mn5Var5.e, 0, false);
                        return;
                    }
                    return;
                }
                if (imageReceiver == this.B4 && (lmVar = this.k2) != null) {
                    lmVar.f(this.f0);
                    imageReceiver.g0(this.k2);
                    return;
                }
                if (this.B5 == 1) {
                    if (r47Var.x()) {
                        TLRPC.Document F0 = r47Var.F0();
                        imageReceiver.G0 = true;
                        mn5 mn5Var6 = this.i5;
                        if (mn5Var6 == null || imageReceiver != this.B4) {
                            mn5Var6 = null;
                        }
                        int i5 = (int) (2048.0f / hl.p);
                        if ((lq3.q(this.U).l() & 8) == 0 && this.O4 != i) {
                            xb4.G(this.U);
                            if (!xb4.I(F0).exists()) {
                                r13 = false;
                            }
                        }
                        if (mn5Var6 == null) {
                            jn5Var4 = jn5.c(xb4.w(r47Var.p0, 100, false, null, false), F0);
                            bitmapDrawable2 = null;
                        } else {
                            bitmapDrawable2 = new BitmapDrawable(mn5Var6.c);
                            jn5Var4 = null;
                        }
                        jn5 b = r13 ? jn5.b(F0) : null;
                        Locale locale = Locale.US;
                        imageReceiver.Z(b, qd4.m(i5, i5, "_"), jn5Var4, "b", bitmapDrawable2, F0.size, null, r47Var, 0);
                        imageReceiver.Z0 = r13 ? null : 1;
                        return;
                    }
                    Activity activity3 = this.E;
                    ad8 ad8Var = this.f0;
                    iu7 iu7Var = new iu7();
                    iu7Var.a = 0L;
                    iu7Var.b = 0.0f;
                    iu7Var.c = 0.0f;
                    iu7Var.d = 0L;
                    iu7Var.e = 0.0f;
                    iu7Var.f = 1.0f;
                    TextPaint textPaint = iu7.K;
                    textPaint.setTextSize(hl.L(14.0f));
                    TextPaint textPaint2 = iu7.L;
                    textPaint2.setTextSize(hl.L(19.0f));
                    iu7.M.setTextSize(hl.L(15.0f));
                    iu7.N.setTextSize(hl.L(15.0f));
                    iu7.O.setTextSize(hl.L(15.0f));
                    iu7.P.setTextSize(hl.L(15.0f));
                    iu7.J.setStrokeWidth(hl.L(2.0f));
                    iu7Var.n = ad8Var;
                    iu7Var.r = r47Var;
                    iu7Var.s = lq3.q(i4).k();
                    TLRPC.Document F02 = r47Var.F0();
                    if (F02 != null) {
                        String B = xb4.B(r47Var.F0());
                        iu7Var.F = B;
                        if (TextUtils.isEmpty(B)) {
                            B = "name";
                            iu7Var.F = "name";
                        }
                        int lastIndexOf = B.lastIndexOf(46);
                        String upperCase = lastIndexOf == -1 ? "" : B.substring(lastIndexOf + 1).toUpperCase();
                        iu7Var.E = upperCase;
                        if (((int) Math.ceil(textPaint.measureText(upperCase))) > hl.L(40.0f)) {
                            iu7Var.E = TextUtils.ellipsize(upperCase, textPaint, hl.L(40.0f), TextUtils.TruncateAt.END).toString();
                        }
                        Resources resources = activity3.getResources();
                        String str5 = r47Var.F0().mime_type;
                        iu7Var.y = resources.getDrawable(hl.l1(B, true)).mutate();
                        iu7Var.G = hl.i0(F02.size, false, false);
                        if (((int) Math.ceil(textPaint2.measureText(B))) > hl.L(320.0f)) {
                            iu7Var.F = TextUtils.ellipsize(B, textPaint2, hl.L(320.0f), TextUtils.TruncateAt.END).toString();
                        }
                    }
                    iu7Var.a();
                    imageReceiver.g0(iu7Var);
                    return;
                }
            }
            long[] jArr2 = new long[1];
            jn5 p0 = p0(i, jArr2);
            TLObject m0 = m0(i, jArr2);
            imageReceiver.G0 = true;
            if (p0 == null) {
                if (jArr2[0] == 0) {
                    imageReceiver.g0(null);
                    return;
                } else {
                    imageReceiver.g0(this.E.getResources().getDrawable(R.drawable.photoview_placeholder));
                    return;
                }
            }
            mn5 mn5Var7 = this.i5;
            if (mn5Var7 == null || imageReceiver != this.B4) {
                mn5Var7 = null;
            }
            if (jArr2[0] == 0) {
                jArr2[0] = -1;
            }
            if (r47Var != null) {
                photoSize = xb4.w(r47Var.p0, 100, false, null, false);
                tLObject = r47Var.n0;
            } else {
                photoSize = null;
                tLObject = null;
            }
            if (photoSize != null && photoSize == m0) {
                photoSize = null;
            }
            if (photoSize == null && (photo = p0.l) != null && photo.sizes != null) {
                int i6 = 0;
                while (true) {
                    if (i6 >= p0.l.sizes.size()) {
                        break;
                    }
                    if (p0.l.sizes.get(i6) instanceof TLRPC.TL_photoStrippedSize) {
                        photoSize = p0.l.sizes.get(i6);
                        tLObject = p0.l;
                        break;
                    }
                    i6++;
                }
            }
            if (r47Var == null || !r47Var.Y4()) {
                z3 = false;
                if (this.y5 == 0) {
                    z3 = false;
                    if (!this.A5) {
                        i2 = 0;
                        z = false;
                        if (r47Var != null) {
                            z2 = z;
                            long j4 = this.y5;
                            if (j4 != 0) {
                                int i7 = this.U;
                                obj = j4 > 0 ? uc7.s1(i7).X1(Long.valueOf(this.y5)) : uc7.s1(i7).M0(Long.valueOf(-this.y5));
                                if (tLObject != null) {
                                    obj = tLObject;
                                }
                                if (mn5Var7 == null && (photoSize instanceof TLRPC.TL_photoStrippedSize)) {
                                    mn5Var7 = new mn5(in5.B("b", photoSize.bytes));
                                }
                                jArr = jArr2;
                                jn5Var = null;
                                r24 = z2;
                            } else {
                                jArr = jArr2;
                                jn5Var = null;
                                obj = null;
                                r24 = z2;
                            }
                        } else if (this.B5 == 5) {
                            TLRPC.Document F03 = r47Var.F0();
                            r24 = z;
                            TLRPC.VideoSize J0 = r47.J0(F03);
                            r47 r47Var3 = r47Var;
                            jArr = jArr2;
                            jn5Var = J0 != null ? jn5.d(J0, F03) : null;
                            obj = r47Var3;
                        } else {
                            z2 = z;
                            obj = r47Var;
                            jArr = jArr2;
                            jn5Var = null;
                            r24 = z2;
                        }
                        if (jn5Var == null) {
                            imageReceiver.Y(p0, this.B5 == 5 ? "g" : null, jn5Var, null, mn5Var7 == null ? jn5.f(photoSize, tLObject) : null, "b", mn5Var7 != null ? new BitmapDrawable(mn5Var7.c) : null, jArr[r24], null, obj, i2);
                            imageReceiver.u0 = true;
                            return;
                        }
                        Object obj3 = obj;
                        long[] jArr3 = jArr;
                        String str6 = (this.y5 == 0 || p0.p != 2) ? null : "g";
                        boolean z7 = true;
                        if ((lq3.q(this.U).l() & 1) == 0 && this.O4 != i) {
                            xb4.G(this.U);
                            if (!xb4.I(m0).exists()) {
                                z7 = r24;
                            }
                        }
                        if (mn5Var7 == null) {
                            jn5Var2 = p0;
                            jn5Var3 = jn5.f(photoSize, tLObject);
                            bitmapDrawable = null;
                        } else {
                            bitmapDrawable = new BitmapDrawable(mn5Var7.c);
                            jn5Var2 = p0;
                            jn5Var3 = null;
                        }
                        imageReceiver.Z(z7 ? jn5Var2 : null, str6, jn5Var3, "b", bitmapDrawable, jArr3[r24], null, obj3, i2);
                        imageReceiver.Z0 = z7 ? null : 1;
                        return;
                    }
                }
            } else {
                z3 = false;
            }
            i2 = 1;
            z = z3;
            if (r47Var != null) {
            }
            if (jn5Var == null) {
            }
        } else {
            if (i < 0 || i >= arrayList2.size()) {
                imageReceiver.g0(null);
                return;
            }
            Object obj4 = arrayList2.get(i);
            int Y0 = (int) (hl.Y0(false) / hl.p);
            mn5 mn5Var8 = this.i5;
            if (mn5Var8 == null || imageReceiver != this.B4) {
                mn5Var8 = null;
            }
            if (mn5Var8 == null) {
                mn5Var8 = this.d.k(i);
            }
            if (obj4 instanceof no6) {
                no6 no6Var = (no6) obj4;
                String str7 = no6Var.I;
                fo6 fo6Var4 = no6Var.A;
                boolean z8 = no6Var.b;
                if (!z8 || no6Var.d()) {
                    String str8 = no6Var.i;
                    if (str8 != null) {
                        str7 = str8;
                    } else {
                        imageReceiver.o0(no6Var.J, no6Var.K, false);
                    }
                    Locale locale2 = Locale.US;
                    str = qd4.m(Y0, Y0, "_");
                    str4 = str7;
                } else {
                    str4 = no6Var.c;
                    if (str4 == null) {
                        str4 = "vthumb://" + no6Var.C + ":" + str7;
                    } else if (this.l5) {
                        Bitmap decodeFile = BitmapFactory.decodeFile(str4);
                        if (decodeFile != null) {
                            mn5Var8 = new mn5(decodeFile);
                            no6Var.c = null;
                        }
                        str = null;
                        str4 = null;
                    }
                    str = null;
                }
                jxcVar = null;
                jn5Var6 = null;
                z4 = z8;
                i3 = 0;
                str2 = str4;
                j = 0;
                fo6Var = fo6Var4;
                r11 = 0;
                tLObject2 = null;
            } else {
                String str9 = "d";
                if (obj4 instanceof TLRPC.BotInlineResult) {
                    TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) obj4;
                    if (botInlineResult.type.equals(MediaStreamTrack.VIDEO_TRACK_KIND) || r47.J4(botInlineResult.document)) {
                        TLRPC.Document document6 = botInlineResult.document;
                        if (document6 != null) {
                            TLObject w2 = xb4.w(document6.thumbs, 90, false, null, false);
                            document2 = botInlineResult.document;
                            tLObject3 = w2;
                            str = null;
                            jxcVar = null;
                            jn5Var7 = null;
                            document3 = null;
                            j2 = 0;
                            jn5Var9 = jn5Var7;
                            tLObject4 = tLObject3;
                            z4 = false;
                            TLRPC.Document document7 = document3;
                            tLObject2 = document2;
                            j = j2;
                            str2 = null;
                            i3 = 1;
                            fo6Var = null;
                            document5 = document7;
                            jn5Var6 = jn5Var9;
                            r11 = tLObject4;
                        } else {
                            TLRPC.WebDocument webDocument = botInlineResult.thumb;
                            if (webDocument instanceof TLRPC.TL_webDocument) {
                                jxcVar = jxc.c(webDocument);
                                str = null;
                                r7 = null;
                                document2 = r7;
                                jn5Var8 = r7;
                                TLRPC.Document document8 = document2;
                                document3 = document8;
                                jn5Var7 = jn5Var8;
                                tLObject3 = document8;
                                j2 = 0;
                                jn5Var9 = jn5Var7;
                                tLObject4 = tLObject3;
                                z4 = false;
                                TLRPC.Document document72 = document3;
                                tLObject2 = document2;
                                j = j2;
                                str2 = null;
                                i3 = 1;
                                fo6Var = null;
                                document5 = document72;
                                jn5Var6 = jn5Var9;
                                r11 = tLObject4;
                            }
                        }
                    } else {
                        if (!botInlineResult.type.equals("gif") || (document4 = botInlineResult.document) == null) {
                            TLRPC.Photo photo3 = botInlineResult.photo;
                            if (photo3 != null) {
                                TLRPC.PhotoSize w3 = xb4.w(photo3.sizes, hl.Y0(false), false, null, false);
                                ?? r2 = botInlineResult.photo;
                                long j5 = w3.size;
                                Locale locale3 = Locale.US;
                                j2 = j5;
                                document3 = null;
                                document2 = r2;
                                tLObject4 = w3;
                                str = qd4.m(Y0, Y0, "_");
                                jxcVar = null;
                                jn5Var9 = null;
                            } else if (botInlineResult.content instanceof TLRPC.TL_webDocument) {
                                if (botInlineResult.type.equals("gif")) {
                                    TLRPC.WebDocument webDocument2 = botInlineResult.thumb;
                                    if ((webDocument2 instanceof TLRPC.TL_webDocument) && "video/mp4".equals(webDocument2.mime_type)) {
                                        jn5Var10 = jn5.p(jxc.c(botInlineResult.thumb));
                                        String str10 = str9;
                                        jxcVar = jxc.c(botInlineResult.content);
                                        str = str10;
                                        document2 = null;
                                        jn5Var8 = jn5Var10;
                                        TLRPC.Document document82 = document2;
                                        document3 = document82;
                                        jn5Var7 = jn5Var8;
                                        tLObject3 = document82;
                                        j2 = 0;
                                        jn5Var9 = jn5Var7;
                                        tLObject4 = tLObject3;
                                    }
                                } else {
                                    Locale locale4 = Locale.US;
                                    str9 = qd4.m(Y0, Y0, "_");
                                }
                                jn5Var10 = null;
                                String str102 = str9;
                                jxcVar = jxc.c(botInlineResult.content);
                                str = str102;
                                document2 = null;
                                jn5Var8 = jn5Var10;
                                TLRPC.Document document822 = document2;
                                document3 = document822;
                                jn5Var7 = jn5Var8;
                                tLObject3 = document822;
                                j2 = 0;
                                jn5Var9 = jn5Var7;
                                tLObject4 = tLObject3;
                            }
                        } else {
                            long j6 = document4.size;
                            TLRPC.VideoSize J02 = r47.J0(document4);
                            document3 = document4;
                            j2 = j6;
                            document2 = null;
                            tLObject4 = null;
                            jn5Var9 = J02 != null ? jn5.d(J02, document4) : null;
                            str = "d";
                            jxcVar = null;
                        }
                        z4 = false;
                        TLRPC.Document document722 = document3;
                        tLObject2 = document2;
                        j = j2;
                        str2 = null;
                        i3 = 1;
                        fo6Var = null;
                        document5 = document722;
                        jn5Var6 = jn5Var9;
                        r11 = tLObject4;
                    }
                    str = null;
                    jxcVar = null;
                    r7 = null;
                    document2 = r7;
                    jn5Var8 = r7;
                    TLRPC.Document document8222 = document2;
                    document3 = document8222;
                    jn5Var7 = jn5Var8;
                    tLObject3 = document8222;
                    j2 = 0;
                    jn5Var9 = jn5Var7;
                    tLObject4 = tLObject3;
                    z4 = false;
                    TLRPC.Document document7222 = document3;
                    tLObject2 = document2;
                    j = j2;
                    str2 = null;
                    i3 = 1;
                    fo6Var = null;
                    document5 = document7222;
                    jn5Var6 = jn5Var9;
                    r11 = tLObject4;
                } else if (obj4 instanceof ro6) {
                    ro6 ro6Var = (ro6) obj4;
                    TLRPC.PhotoSize photoSize4 = ro6Var.L;
                    if (photoSize4 != null) {
                        tLObject2 = ro6Var.K;
                        j = photoSize4.size;
                        photoSize3 = photoSize4;
                        document = null;
                        str3 = null;
                    } else {
                        String str11 = ro6Var.i;
                        if (str11 != null) {
                            str3 = str11;
                            document = null;
                            photoSize3 = null;
                            tLObject2 = null;
                            j = 0;
                        } else {
                            document = ro6Var.J;
                            if (document != null) {
                                j = document.size;
                                photoSize3 = null;
                                tLObject2 = null;
                                str3 = null;
                            } else {
                                String str12 = ro6Var.C;
                                j = ro6Var.G;
                                str3 = str12;
                                document = null;
                                photoSize3 = null;
                                tLObject2 = null;
                            }
                        }
                    }
                    z4 = false;
                    str2 = str3;
                    i3 = 1;
                    fo6Var = ro6Var.A;
                    str = "d";
                    jxcVar = null;
                    document5 = document;
                    jn5Var6 = null;
                    r11 = photoSize3;
                } else {
                    str = null;
                    jxcVar = null;
                    jn5Var6 = null;
                    r11 = 0;
                    fo6Var = null;
                    tLObject2 = null;
                    str2 = null;
                    i3 = 0;
                    z4 = false;
                    j = 0;
                }
            }
            if (document5 != null) {
                TLRPC.PhotoSize w4 = xb4.w(document5.thumbs, 90, false, null, false);
                if (jn5Var6 != null) {
                    jn5 b2 = jn5.b(document5);
                    if (mn5Var8 == null) {
                        jn5Var12 = jn5.c(w4, document5);
                        jn5Var11 = b2;
                    } else {
                        jn5Var11 = b2;
                        jn5Var12 = null;
                    }
                    Locale locale5 = Locale.US;
                    jn5 jn5Var15 = jn5Var6;
                    String m = qd4.m(Y0, Y0, "_");
                    if (mn5Var8 != null) {
                        BitmapDrawable bitmapDrawable5 = new BitmapDrawable(mn5Var8.c);
                        jn5Var13 = jn5Var15;
                        obj2 = obj4;
                        bitmapDrawable4 = bitmapDrawable5;
                    } else {
                        jn5Var13 = jn5Var15;
                        obj2 = obj4;
                        bitmapDrawable4 = null;
                    }
                    fo6Var2 = fo6Var;
                    imageReceiver.Y(jn5Var11, "d", jn5Var13, null, jn5Var12, m, bitmapDrawable4, j, null, obj2, i3);
                } else {
                    long j7 = j;
                    fo6Var2 = fo6Var;
                    int i8 = i3;
                    jn5 b3 = jn5.b(document5);
                    jn5 c = mn5Var8 == null ? jn5.c(w4, document5) : null;
                    Locale locale6 = Locale.US;
                    imageReceiver.Z(b3, "d", c, qd4.m(Y0, Y0, "_"), mn5Var8 != null ? new BitmapDrawable(mn5Var8.c) : null, j7, null, obj4, i8);
                }
            } else {
                fo6 fo6Var5 = fo6Var;
                int i10 = i3;
                if (r11 == 0) {
                    fo6Var2 = fo6Var5;
                    String str13 = str;
                    if (jxcVar == null) {
                        z5 = z4;
                        if (mn5Var8 != null) {
                            drawable2 = new BitmapDrawable(mn5Var8.c);
                        } else if (!z5 || (activity = this.E) == null) {
                            drawable = null;
                            imageReceiver.e0(str2, str13, drawable, null, j);
                        } else {
                            drawable2 = activity.getResources().getDrawable(R.drawable.nophotos);
                        }
                        drawable = drawable2;
                        imageReceiver.e0(str2, str13, drawable, null, j);
                    } else if (jn5Var6 != null) {
                        imageReceiver.a0(jn5.p(jxcVar), str13, jn5Var6, null, null, obj4, i10);
                    } else {
                        jn5 p = jn5.p(jxcVar);
                        if (mn5Var8 != null) {
                            drawable3 = new BitmapDrawable(mn5Var8.c);
                            z5 = z4;
                        } else {
                            z5 = z4;
                            drawable3 = (!z5 || (activity2 = this.E) == null) ? null : activity2.getResources().getDrawable(R.drawable.nophotos);
                        }
                        imageReceiver.d0(p, str13, drawable3, null, obj4, i10);
                    }
                    if (u33Var != null) {
                        z6 = z5;
                        fo6Var3 = fo6Var2;
                        imageReceiver2 = imageReceiver;
                    } else if (fo6Var2 != null) {
                        float f2 = fo6Var2.a;
                        float f3 = fo6Var2.b;
                        float f4 = fo6Var2.d;
                        int i11 = fo6Var2.k;
                        float f5 = fo6Var2.c;
                        float f6 = fo6Var2.e;
                        float f7 = fo6Var2.f;
                        boolean z9 = fo6Var2.l;
                        z6 = z5;
                        fo6Var3 = fo6Var2;
                        imageReceiver2 = imageReceiver;
                        u33Var.b(true, f2, f3, f4, i11, f5, 1.0f, 1.0f, f6, f7, 0.0f, 0.0f, z9);
                    } else {
                        z6 = z5;
                        fo6Var3 = fo6Var2;
                        imageReceiver2 = imageReceiver;
                        u33Var.a = false;
                    }
                    if (imageReceiver2 != this.A4) {
                        this.H1 = fo6Var3;
                        this.G4 = z6;
                        return;
                    }
                    fo6 fo6Var6 = fo6Var3;
                    boolean z10 = z6;
                    if (imageReceiver2 == this.C4) {
                        this.I1 = fo6Var6;
                        this.J4 = z10;
                        return;
                    }
                    return;
                }
                jn5 f8 = jn5.f(r11, tLObject2);
                fo6Var2 = fo6Var5;
                imageReceiver.c0(f8, str, mn5Var8 != null ? new BitmapDrawable(mn5Var8.c) : null, j, null, obj4, i10);
            }
            z5 = z4;
            if (u33Var != null) {
            }
            if (imageReceiver2 != this.A4) {
            }
        }
    }

    public final void N2() {
        hfc hfcVar;
        int i;
        int i2;
        String str;
        hfc hfcVar2;
        hfc Z;
        String str2;
        ArrayList arrayList;
        String str3;
        String str4;
        String str5;
        r47 r47Var;
        kfc kfcVar;
        hfc hfcVar3;
        int i3;
        hfc hfcVar4;
        String str6;
        String str7;
        if (this.l7 == null && this.V4 == null && this.U4 != null) {
            L2();
        }
        kfc kfcVar2 = this.G2;
        String str8 = "";
        if (kfcVar2 == null || kfcVar2.Y() <= 1) {
            this.y0.setVisibility(8);
            this.J0.setVisibility(0);
            this.u0.setRightIcon(0);
            this.x0.g.t("", true, true);
            this.t7 = -1;
            return;
        }
        this.u0.setRightIcon(R.drawable.msg_arrowright);
        this.J0.setVisibility(8);
        this.y0.setVisibility(0);
        kfc kfcVar3 = this.G2;
        int T = kfcVar3.T();
        hfc Z2 = (T < 0 || T >= kfcVar3.Y()) ? null : kfcVar3.Z(T);
        int T2 = this.G2.T();
        int Y = this.G2.Y() + 1;
        ArrayList arrayList2 = this.z0;
        String str9 = ", ";
        String str10 = "\n";
        String str11 = "x";
        if (Y != arrayList2.size()) {
            this.y0.removeAllViews();
            arrayList2.clear();
            TextView textView = new TextView(this.F);
            textView.setText(ob6.M0(2131746180, null));
            textView.setTypeface(hl.o());
            textView.setPadding(hl.L(16.0f), hl.L(9.0f), hl.L(16.0f), hl.L(8.0f));
            textView.setTextSize(1, 14.0f);
            int i4 = -1;
            textView.setTextColor(-1);
            this.y0.addView(textView, tre.o(-1, -2));
            final int i5 = -1;
            while (i5 < this.G2.Y()) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (i5 == i4) {
                    spannableStringBuilder.append((CharSequence) ob6.M0(2131746182, null));
                    if (i5 != this.G2.e0 || Z2 == null) {
                        hfcVar3 = Z2;
                        i3 = T2;
                        hfcVar4 = null;
                    } else {
                        spannableStringBuilder.append((CharSequence) " ");
                        int length = spannableStringBuilder.length();
                        if (xea.N0) {
                            spannableStringBuilder.append((CharSequence) Integer.toString(Z2.b)).append((CharSequence) "x").append((CharSequence) Integer.toString(Z2.c));
                        } else {
                            spannableStringBuilder.append((CharSequence) String.valueOf(Z2.b())).append((CharSequence) "p");
                        }
                        hfcVar3 = Z2;
                        i3 = T2;
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(aob.p1(0.5f, -1)), length, spannableStringBuilder.length(), 33);
                        hfcVar4 = hfcVar3;
                    }
                } else {
                    hfcVar3 = Z2;
                    i3 = T2;
                    hfc Z3 = this.G2.Z(i5);
                    if (Z3.a) {
                        spannableStringBuilder.append((CharSequence) ob6.M0(2131746179, null));
                    } else if (Z3.b() >= 2000) {
                        spannableStringBuilder.append((CharSequence) ob6.M0(2131746189, null));
                    } else if (Z3.b() >= 1400) {
                        spannableStringBuilder.append((CharSequence) ob6.M0(2131746191, null));
                    } else if (Z3.b() >= 1000) {
                        spannableStringBuilder.append((CharSequence) ob6.M0(2131746194, null));
                    } else if (Z3.b() >= 700) {
                        spannableStringBuilder.append((CharSequence) ob6.M0(2131746184, null));
                    } else if (Z3.b() >= 400) {
                        spannableStringBuilder.append((CharSequence) ob6.M0(2131746185, null));
                    } else if (Z3.b() >= 340) {
                        spannableStringBuilder.append((CharSequence) ob6.M0(2131746186, null));
                    } else if (Z3.b() >= 200) {
                        spannableStringBuilder.append((CharSequence) ob6.M0(2131746187, null));
                    } else {
                        spannableStringBuilder.append((CharSequence) ob6.M0(2131746192, null));
                    }
                    spannableStringBuilder.append((CharSequence) " ");
                    int length2 = spannableStringBuilder.length();
                    if (xea.N0) {
                        spannableStringBuilder.append((CharSequence) Integer.toString(Z3.b)).append((CharSequence) "x").append((CharSequence) Integer.toString(Z3.c));
                    } else {
                        spannableStringBuilder.append((CharSequence) String.valueOf(Z3.b())).append((CharSequence) "p");
                    }
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(aob.p1(0.5f, -1)), length2, spannableStringBuilder.length(), 33);
                    hfcVar4 = Z3;
                }
                b8 c = s7.c(false, false, this.y0, 0, spannableStringBuilder, true, null);
                if (!xea.N0 || hfcVar4 == null) {
                    str6 = str9;
                    str7 = str10;
                    c.setSubtext("");
                } else {
                    StringBuilder sb = new StringBuilder();
                    ArrayList arrayList3 = hfcVar4.d;
                    int size = arrayList3.size();
                    int i6 = 0;
                    while (i6 < size) {
                        Object obj = arrayList3.get(i6);
                        int i7 = i6 + 1;
                        jfc jfcVar = (jfc) obj;
                        if (sb.length() > 0) {
                            sb.append(str10);
                        }
                        ArrayList arrayList4 = arrayList3;
                        if (!TextUtils.isEmpty(jfcVar.m)) {
                            sb.append(jfcVar.m);
                            sb.append(str9);
                        }
                        int i8 = size;
                        sb.append(hl.i0(jfcVar.k, false, false).replace(" ", ""));
                        sb.append("(");
                        StringBuilder sb2 = new StringBuilder();
                        String str12 = str9;
                        String str13 = str10;
                        sb2.append(hl.i0((long) jfcVar.l, false, false).replace(" ", ""));
                        sb2.append("/s)");
                        sb.append(sb2.toString());
                        sb.append(jfcVar.c() ? "!" : " ");
                        sb.append(jfcVar.b() ? "!" : " ");
                        str9 = str12;
                        arrayList3 = arrayList4;
                        i6 = i7;
                        size = i8;
                        str10 = str13;
                    }
                    str6 = str9;
                    str7 = str10;
                    c.setSubtext(sb.toString());
                }
                c.setChecked(i5 == this.G2.e0);
                c.d(-328966, -328966);
                final byte b = 0;
                c.setVisibility(0);
                c.setOnClickListener(new View.OnClickListener(this) { // from class: ha8
                    public final /* synthetic */ PhotoViewer b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b2 = b;
                        int i10 = i5;
                        PhotoViewer photoViewer = this.b;
                        switch (b2) {
                            case 0:
                                Drawable[] drawableArr = PhotoViewer.d9;
                                photoViewer.w(i10);
                                break;
                            default:
                                Drawable[] drawableArr2 = PhotoViewer.d9;
                                photoViewer.w(i10);
                                break;
                        }
                    }
                });
                c.setSelectorColor(268435455);
                arrayList2.add(c);
                i5++;
                str9 = str6;
                T2 = i3;
                str10 = str7;
                Z2 = hfcVar3;
                i4 = -1;
            }
            hfcVar = Z2;
            i = T2;
            k8 k8Var = new k8(aob.H8, this.w2, this.F);
            k8Var.setTag(R.id.fit_width_tag, 1);
            k8Var.setColor(-15198184);
            this.y0.addView(k8Var, tre.o(-1, 8));
        } else {
            hfcVar = Z2;
            i = T2;
            String str14 = ", ";
            String str15 = "\n";
            final int i10 = -1;
            while (i10 < this.G2.Y()) {
                int i11 = i10 + 1;
                b8 b8Var = (b8) arrayList2.get(i11);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                if (i10 == -1) {
                    spannableStringBuilder2.append((CharSequence) ob6.M0(2131746182, null));
                    if (i10 != this.G2.e0 || hfcVar == null) {
                        i2 = i11;
                        str = str14;
                        hfcVar2 = hfcVar;
                        str2 = str11;
                        Z = null;
                    } else {
                        spannableStringBuilder2.append((CharSequence) " ");
                        int length3 = spannableStringBuilder2.length();
                        if (xea.N0) {
                            hfcVar2 = hfcVar;
                            spannableStringBuilder2.append((CharSequence) Integer.toString(hfcVar2.b)).append((CharSequence) str11).append((CharSequence) Integer.toString(hfcVar2.c));
                        } else {
                            hfcVar2 = hfcVar;
                            spannableStringBuilder2.append((CharSequence) String.valueOf(hfcVar2.b())).append((CharSequence) "p");
                        }
                        i2 = i11;
                        str = str14;
                        spannableStringBuilder2.setSpan(new ForegroundColorSpan(aob.p1(0.5f, -1)), length3, spannableStringBuilder2.length(), 33);
                        str2 = str11;
                        Z = hfcVar2;
                    }
                } else {
                    i2 = i11;
                    str = str14;
                    hfcVar2 = hfcVar;
                    Z = this.G2.Z(i10);
                    if (Z.a) {
                        spannableStringBuilder2.append((CharSequence) ob6.M0(2131746179, null));
                    } else if (Z.b() >= 2000) {
                        spannableStringBuilder2.append((CharSequence) ob6.M0(2131746189, null));
                    } else if (Z.b() >= 1400) {
                        spannableStringBuilder2.append((CharSequence) ob6.M0(2131746191, null));
                    } else if (Z.b() >= 1000) {
                        spannableStringBuilder2.append((CharSequence) ob6.M0(2131746194, null));
                    } else if (Z.b() >= 700) {
                        spannableStringBuilder2.append((CharSequence) ob6.M0(2131746184, null));
                    } else if (Z.b() >= 400) {
                        spannableStringBuilder2.append((CharSequence) ob6.M0(2131746185, null));
                    } else if (Z.b() >= 340) {
                        spannableStringBuilder2.append((CharSequence) ob6.M0(2131746186, null));
                    } else if (Z.b() >= 200) {
                        spannableStringBuilder2.append((CharSequence) ob6.M0(2131746187, null));
                    } else {
                        spannableStringBuilder2.append((CharSequence) ob6.M0(2131746192, null));
                    }
                    spannableStringBuilder2.append((CharSequence) " ");
                    int length4 = spannableStringBuilder2.length();
                    if (xea.N0) {
                        spannableStringBuilder2.append((CharSequence) Integer.toString(Z.b)).append((CharSequence) str11).append((CharSequence) Integer.toString(Z.c));
                    } else {
                        spannableStringBuilder2.append((CharSequence) String.valueOf(Z.b())).append((CharSequence) "p");
                    }
                    str2 = str11;
                    spannableStringBuilder2.setSpan(new ForegroundColorSpan(aob.p1(0.5f, -1)), length4, spannableStringBuilder2.length(), 33);
                }
                b8Var.setText(spannableStringBuilder2);
                b8Var.setVisibility(0);
                if (!xea.N0 || Z == null) {
                    arrayList = arrayList2;
                    str3 = str;
                    str4 = str15;
                    b8Var.setSubtext("");
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    ArrayList arrayList5 = Z.d;
                    int size2 = arrayList5.size();
                    int i12 = 0;
                    while (i12 < size2) {
                        Object obj2 = arrayList5.get(i12);
                        int i13 = i12 + 1;
                        jfc jfcVar2 = (jfc) obj2;
                        String str16 = str15;
                        if (sb3.length() > 0) {
                            sb3.append(str16);
                        }
                        if (TextUtils.isEmpty(jfcVar2.m)) {
                            str5 = str;
                        } else {
                            sb3.append(jfcVar2.m);
                            str5 = str;
                            sb3.append(str5);
                        }
                        int i14 = size2;
                        ArrayList arrayList6 = arrayList5;
                        sb3.append(hl.i0(jfcVar2.k, false, false).replace(" ", ""));
                        sb3.append(" (");
                        StringBuilder sb4 = new StringBuilder();
                        ArrayList arrayList7 = arrayList2;
                        sb4.append(hl.i0((long) jfcVar2.l, false, false).replace(" ", ""));
                        sb4.append("/s)");
                        sb3.append(sb4.toString());
                        sb3.append(jfcVar2.c() ? "!" : " ");
                        sb3.append(jfcVar2.b() ? "!" : " ");
                        arrayList2 = arrayList7;
                        size2 = i14;
                        i12 = i13;
                        arrayList5 = arrayList6;
                        str15 = str16;
                        str = str5;
                    }
                    arrayList = arrayList2;
                    str3 = str;
                    str4 = str15;
                    b8Var.setSubtext(sb3.toString());
                }
                b8Var.setChecked(i10 == this.G2.e0);
                final byte b2 = 1;
                b8Var.setOnClickListener(new View.OnClickListener(this) { // from class: ha8
                    public final /* synthetic */ PhotoViewer b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b22 = b2;
                        int i102 = i10;
                        PhotoViewer photoViewer = this.b;
                        switch (b22) {
                            case 0:
                                Drawable[] drawableArr = PhotoViewer.d9;
                                photoViewer.w(i102);
                                break;
                            default:
                                Drawable[] drawableArr2 = PhotoViewer.d9;
                                photoViewer.w(i102);
                                break;
                        }
                    }
                });
                arrayList2 = arrayList;
                hfcVar = hfcVar2;
                str14 = str3;
                i10 = i2;
                str11 = str2;
                str15 = str4;
            }
        }
        hfc hfcVar5 = hfcVar;
        if (hfcVar5 != null) {
            if (hfcVar5.b() >= 2000) {
                str8 = ob6.M0(2131746188, null);
            } else if (hfcVar5.b() >= 1000) {
                str8 = ob6.M0(2131746193, null);
            } else if (hfcVar5.b() >= 700) {
                str8 = ob6.M0(2131746183, null);
            } else {
                str8 = hfcVar5.b() + "p";
            }
        }
        this.x0.g.t(str8, true, true);
        zb8 zb8Var = this.s3;
        if (zb8Var != null && (r47Var = this.S4) != null && (kfcVar = this.G2) != null) {
            zb8Var.c(r47Var, kfcVar);
        }
        if (this.t7 != i) {
            try {
                go.b(0);
                if (lh2.t().w()) {
                    lh2.t().T(j0());
                }
                kfc kfcVar4 = this.G2;
                if (kfcVar4 != null) {
                    go.z(kfcVar4.c0());
                }
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
    }

    public final void O() {
        e26 e26Var = this.r7;
        if (e26Var != null) {
            e26Var.a();
            this.r7 = null;
        }
        e26 e26Var2 = this.c2;
        if (e26Var2 != null) {
            e26Var2.a();
            this.c2 = null;
        }
        try {
            if (this.h0.getParent() != null) {
                ((WindowManager) this.E.getSystemService("window")).removeView(this.h0);
                a1();
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public final void O1(int i, qx7 qx7Var) {
        ArrayList arrayList;
        String str;
        boolean z;
        if (qx7Var != null) {
            qx7Var.a();
            qx7Var.setVisibility(8);
            ArrayList arrayList2 = this.f7;
            if (arrayList2.isEmpty() || i < 0 || i >= arrayList2.size()) {
                return;
            }
            Object obj = arrayList2.get(i);
            if (obj instanceof no6) {
                no6 no6Var = (no6) obj;
                z = no6Var.b;
                str = no6Var.j;
                arrayList = no6Var.p;
            } else {
                if (obj instanceof ro6) {
                    ro6 ro6Var = (ro6) obj;
                    str = ro6Var.j;
                    arrayList = ro6Var.p;
                } else {
                    arrayList = null;
                    str = null;
                }
                z = false;
            }
            qx7Var.setVisibility(0);
            qx7Var.b(arrayList, z, false, this.d2 != 11);
            if (str == null) {
                qx7Var.a = null;
                qx7Var.d = null;
                qx7Var.setBackground(null);
            } else {
                qx7Var.a = BitmapFactory.decodeFile(str);
                BitmapDrawable bitmapDrawable = new BitmapDrawable(qx7Var.a);
                qx7Var.d = bitmapDrawable;
                qx7Var.setBackground(bitmapDrawable);
            }
        }
    }

    public final void O2() {
        r47 r47Var;
        ed8 ed8Var = this.d;
        if (ed8Var != null) {
            int G = ed8Var.G();
            this.P0.a(G);
            if (G == 0) {
                A2(false, true);
            }
            if (this.T0 != null) {
                ed8 ed8Var2 = this.d;
                long a = ed8Var2 != null ? ed8Var2.a() : 0L;
                if (a == 0 && (r47Var = this.S4) != null) {
                    a = r47.B0(r47Var.k);
                }
                di3 di3Var = this.T0;
                ed8 ed8Var3 = this.d;
                long M1 = (ed8Var3 == null || !ed8Var3.p() || this.d.v()) ? uc7.s1(this.U).M1(a) : 0L;
                ed8 ed8Var4 = this.d;
                di3Var.i(Math.max(1, ed8Var4 == null ? 1 : ed8Var4.G()), M1, true);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:265:0x075a, code lost:
    
        if (r7 == r19) goto L369;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x0762, code lost:
    
        if (r15 == (-1)) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x076b, code lost:
    
        if (r15 == r11) goto L369;
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x0791, code lost:
    
        if (r0.n6 != 3) goto L273;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03fa A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0ad2  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0ae1  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0b2d  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0bae  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0c21  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0c3f  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0c4e  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0c3c  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0cbe  */
    /* JADX WARN: Removed duplicated region for block: B:190:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x04fa A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0551  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0745  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x07e0  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x07e7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:309:0x07fb  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x081f  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0932  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0951  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0966  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0ac3  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x098e  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0a4b  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0a55  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0a3f  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x095e  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0ac9  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0827 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:381:0x08d5  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0900  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0908  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x0922  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x0867  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x0893  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x089c  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x071c  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x030b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void P(Canvas canvas, xl0 xl0Var, int i, int i2, boolean z, boolean z2, boolean z3) {
        float d;
        byte b;
        int i3;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        ImageReceiver imageReceiver;
        ImageReceiver imageReceiver2;
        float f6;
        ImageReceiver imageReceiver3;
        ArrayList arrayList;
        int i4;
        float f7;
        float f8;
        int i5;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        boolean z4;
        int q;
        int o;
        float f15;
        float f16;
        float f17;
        float f18;
        int i6;
        int i7;
        float f19;
        float f20;
        ImageReceiver imageReceiver4;
        float f21;
        float f22;
        float f23;
        float f24;
        boolean z5;
        boolean isEmpty;
        boolean z6;
        float f25;
        float f26;
        float f27;
        boolean z7;
        float f28;
        boolean z8;
        nc8 nc8Var;
        float f29;
        float f30;
        Bitmap b2;
        int i8;
        int i10;
        float f31;
        float f32;
        float f33;
        float f34;
        float f35;
        float f36;
        float f37;
        int i11;
        TextureView textureView;
        float f38;
        float f39;
        int i12;
        float f40;
        int i13;
        int i14;
        float f41;
        float min;
        float f42;
        float f43;
        Bitmap b3;
        Bitmap d2;
        ImageReceiver imageReceiver5;
        int i15;
        boolean z9;
        Bitmap d3;
        fo6 fo6Var;
        Bitmap b4;
        dc8 dc8Var;
        float f44;
        float f45;
        float f46;
        float f47;
        float f48;
        Shader shader;
        int i16;
        Bitmap d4;
        dc8 dc8Var2;
        PhotoViewer photoViewer = this;
        xl0 xl0Var2 = xl0Var;
        if (a()) {
            RenderNode u0 = photoViewer.u0(xl0Var2.c);
            int k = hl.k(i, xl0Var2.c);
            if (photoViewer.P8 == null || u0 == null || !canvas.isHardwareAccelerated()) {
                canvas.drawColor(vm2.k(i2, k));
                return;
            }
            canvas.drawColor(k);
            canvas.save();
            canvas.scale(photoViewer.P8.getWidth() / u0.getWidth(), photoViewer.P8.getHeight() / u0.getHeight());
            canvas.drawRenderNode(u0);
            canvas.restore();
            canvas.drawColor(i2);
            return;
        }
        boolean z10 = xea.Z;
        mm mmVar = photoViewer.J8;
        if (z10) {
            byte b5 = photoViewer.m4;
            d = mmVar.d(b5 == 0 || b5 == 2 || b5 == 3);
        } else {
            d = 1.0f;
        }
        xl0Var2.h.setShader(null);
        if (i != 0) {
            xl0Var2.h.setColor(i);
            xl0Var2.h.setAlpha((int) (hl.R1(0.7f, 1.0f, z2 ? d : 1.0f) * r2.getAlpha()));
            canvas.drawPaint(xl0Var2.h);
        }
        if (!xea.Z || photoViewer.m4 != 0) {
            float f49 = d;
            mmVar.e(true, 0.0f);
            if (i2 != 0) {
                xl0Var2.h.setColor(i2);
                Paint paint = xl0Var2.h;
                float alpha = paint.getAlpha();
                if (!z2) {
                    f49 = 1.0f;
                }
                paint.setAlpha((int) (hl.R1(0.7f, 1.0f, f49) * alpha));
                canvas.drawPaint(xl0Var2.h);
                return;
            }
            return;
        }
        if (z3) {
            if (photoViewer.K8 == null) {
                mm[] mmVarArr = new mm[3];
                photoViewer.K8 = mmVarArr;
                byte b6 = 23;
                y98 y98Var = new y98(photoViewer, b6);
                k43 k43Var = k43.g;
                b = 2;
                mmVarArr[0] = new mm(y98Var, 180L, k43Var);
                photoViewer.K8[1] = new mm(new y98(photoViewer, b6), 180L, k43Var);
                photoViewer.K8[2] = new mm(new y98(photoViewer, b6), 180L, k43Var);
            } else {
                b = 2;
            }
            photoViewer.K8[0].e(true, 1.0f);
            photoViewer.K8[b].e(true, 1.0f);
            if (photoViewer.L8 == null) {
                photoViewer.L8 = new RectF();
            }
            if (photoViewer.M8 == null) {
                photoViewer.M8 = new RectF();
            }
            if (photoViewer.N8 == null) {
                photoViewer.N8 = new Matrix();
            }
            if (photoViewer.O8 == null) {
                photoViewer.O8 = new float[8];
            }
            photoViewer.L8.set(photoViewer.V1.getBounds());
            photoViewer.L8.offset(photoViewer.Y1.getX(), photoViewer.Y1.getY());
            photoViewer.L8.offset(photoViewer.V1.getX(), photoViewer.V1.getY());
            photoViewer.N8.reset();
        } else {
            b = 2;
        }
        int saveCount = canvas.getSaveCount();
        if (photoViewer.u2) {
            canvas.save();
            canvas.translate((photoViewer.r0() / 2) - (photoViewer.w0() / 2), 0.0f);
            if (z3) {
                photoViewer.N8.preTranslate((photoViewer.r0() / 2) - (photoViewer.w0() / 2), 0.0f);
            }
        }
        if (photoViewer.o6 != null) {
            float R1 = hl.R1(0.0f, photoViewer.f6, photoViewer.k6);
            float R12 = hl.R1(photoViewer.Z5, photoViewer.d6, photoViewer.k6);
            f = hl.R1(photoViewer.a6, photoViewer.e6, photoViewer.k6);
            float R13 = hl.R1(photoViewer.X5, photoViewer.c6, photoViewer.k6);
            i3 = 0;
            f2 = hl.R1(photoViewer.W5, photoViewer.b6, photoViewer.k6);
            f5 = R1;
            f3 = R12;
            f4 = R13;
        } else {
            i3 = 0;
            float f50 = photoViewer.Z5;
            f = photoViewer.a6;
            float f51 = photoViewer.X5;
            f2 = photoViewer.W5;
            if (photoViewer.m6 != 0) {
                f2 = photoViewer.b6;
                f51 = photoViewer.c6;
                f50 = photoViewer.d6;
            }
            f3 = f50;
            f4 = f51;
            f5 = 0.0f;
        }
        float f52 = f2;
        int g0 = photoViewer.g0();
        int f0 = photoViewer.f0();
        if (photoViewer.I3 && (dc8Var2 = photoViewer.z2) != null && dc8Var2.getVisibility() == 0) {
            f0 = photoViewer.A0();
        }
        if (photoViewer.t4 == 0 && photoViewer.d2 != 1 && photoViewer.Z5 >= 1.0f && !photoViewer.Q6 && !photoViewer.J6) {
            if (f52 > photoViewer.E6 + hl.L(5.0f)) {
                imageReceiver = photoViewer.A4;
            } else if (f52 < photoViewer.D6 - hl.L(5.0f)) {
                imageReceiver = photoViewer.C4;
            }
            imageReceiver2 = photoViewer.C4;
            ArrayList arrayList2 = photoViewer.f7;
            if (imageReceiver != imageReceiver2) {
                float e = z3 ? photoViewer.K8[i3].e(true, 1.0f) : 1.0f;
                if (!photoViewer.Q6) {
                    float f53 = photoViewer.D6;
                    if (f52 < f53) {
                        f44 = d;
                        float min2 = Math.min(1.0f, (f53 - f52) / g0);
                        f48 = (1.0f - min2) * 0.3f;
                        f45 = 1.0f;
                        f47 = min2;
                        f46 = (-g0) - (hl.L(30.0f) / 2);
                        if (imageReceiver.B()) {
                            i5 = f0;
                            f6 = f;
                            imageReceiver3 = imageReceiver;
                            arrayList = arrayList2;
                            i4 = saveCount;
                            f7 = f3;
                            f8 = f44;
                        } else {
                            canvas.save();
                            canvas.translate(g0 / 2, f0 / 2);
                            canvas.translate((hl.L(30.0f) / 2) + g0 + f46, 0.0f);
                            float f54 = f45 - f48;
                            canvas.scale(f54, f54);
                            i5 = f0;
                            int q2 = imageReceiver.q();
                            float f55 = f;
                            int o2 = imageReceiver.o();
                            if (photoViewer.J4) {
                                imageReceiver3 = imageReceiver;
                                arrayList = arrayList2;
                                f6 = f55;
                            } else {
                                fo6 fo6Var2 = photoViewer.I1;
                                if (fo6Var2 != null) {
                                    arrayList = arrayList2;
                                    u33 u33Var = photoViewer.G1;
                                    if (u33Var.a) {
                                        imageReceiver3 = imageReceiver;
                                        f6 = f55;
                                        i4 = saveCount;
                                        f7 = f3;
                                        f8 = f44;
                                        g0 = g0;
                                        shader = null;
                                        photoViewer = this;
                                        photoViewer.d(canvas, g0, i5, q2, o2, 1.0f, u33Var, fo6Var2);
                                        float f56 = q2;
                                        float f57 = o2;
                                        float min3 = Math.min(g0 / f56, i5 / f57);
                                        int i17 = (int) (f56 * min3);
                                        int i18 = (int) (f57 * min3);
                                        if (!arrayList.isEmpty()) {
                                            if (photoViewer.t4 == 1 || photoViewer.d2 == 1) {
                                                i16 = photoViewer.G1.h;
                                            } else {
                                                fo6 fo6Var3 = photoViewer.I1;
                                                if (fo6Var3 != null && fo6Var3.l) {
                                                    i16 = 1;
                                                }
                                            }
                                            if (i16 != 0) {
                                                canvas.scale(-1.0f, f45);
                                            }
                                            d4 = photoViewer.F4.d(imageReceiver3);
                                            if (d4 != null) {
                                                xl0Var2.h.setShader(shader);
                                                xl0Var2.h.setAlpha((int) xnb.C(f47, 255.0f, f8, e));
                                                canvas.scale(d4.getWidth() / (d4.getWidth() - 3.0f), d4.getHeight() / (d4.getHeight() - 3.0f));
                                                canvas.translate((-i17) / 2, (-i18) / 2);
                                                canvas.scale((i17 * 1.0f) / d4.getWidth(), (i18 * 1.0f) / d4.getHeight());
                                                if (z) {
                                                    int i19 = i3;
                                                    canvas.clipRect(i19, i19, d4.getWidth(), d4.getHeight());
                                                }
                                                canvas.drawBitmap(d4, 0.0f, 0.0f, xl0Var2.h);
                                            }
                                            canvas.restore();
                                        }
                                        i16 = i3;
                                        if (i16 != 0) {
                                        }
                                        d4 = photoViewer.F4.d(imageReceiver3);
                                        if (d4 != null) {
                                        }
                                        canvas.restore();
                                    } else {
                                        photoViewer = this;
                                        f6 = f55;
                                        imageReceiver3 = imageReceiver;
                                    }
                                } else {
                                    f6 = f55;
                                    imageReceiver3 = imageReceiver;
                                    arrayList = arrayList2;
                                }
                            }
                            i4 = saveCount;
                            f7 = f3;
                            f8 = f44;
                            g0 = g0;
                            shader = null;
                            float f562 = q2;
                            float f572 = o2;
                            float min32 = Math.min(g0 / f562, i5 / f572);
                            int i172 = (int) (f562 * min32);
                            int i182 = (int) (f572 * min32);
                            if (!arrayList.isEmpty()) {
                            }
                            i16 = i3;
                            if (i16 != 0) {
                            }
                            d4 = photoViewer.F4.d(imageReceiver3);
                            if (d4 != null) {
                            }
                            canvas.restore();
                        }
                    }
                }
                f44 = d;
                f45 = 1.0f;
                f46 = f52;
                f47 = 1.0f;
                f48 = 0.0f;
                if (imageReceiver.B()) {
                }
            } else {
                f6 = f;
                imageReceiver3 = imageReceiver;
                arrayList = arrayList2;
                i4 = saveCount;
                f7 = f3;
                f8 = d;
                i5 = f0;
            }
            if (!photoViewer.Q6) {
                float f58 = photoViewer.E6;
                if (f52 > f58 && photoViewer.t4 == 0 && photoViewer.d2 != 1) {
                    float min4 = Math.min(1.0f, (f52 - f58) / g0);
                    float f59 = min4 * 0.3f;
                    f11 = 1.0f - min4;
                    f10 = photoViewer.E6;
                    f12 = f59;
                    boolean z11 = (photoViewer.I3 || (dc8Var = photoViewer.z2) == null || dc8Var.getVisibility() != 0) ? false : true;
                    if (!photoViewer.B4.B() || (z11 && photoViewer.H3)) {
                        canvas.save();
                        int i20 = g0 / 2;
                        int i21 = i5 / 2;
                        f13 = 2.0f;
                        canvas.translate(photoViewer.Y(photoViewer.t4) + i20, photoViewer.Z(photoViewer.t4) + i21);
                        float f60 = f4 + 0.0f;
                        canvas.translate(f10, f60);
                        f14 = f7 - f12;
                        canvas.scale(f14, f14);
                        float f61 = f6;
                        canvas.rotate(f61);
                        if (z3) {
                            z4 = z11;
                            photoViewer.N8.preTranslate(photoViewer.Y(photoViewer.t4) + i20, photoViewer.Z(photoViewer.t4) + i21);
                            photoViewer.N8.preTranslate(f10, f60);
                            photoViewer.N8.preScale(f14, f14, 0.0f, 0.0f);
                            photoViewer.N8.preRotate(f61);
                        } else {
                            z4 = z11;
                        }
                        if (photoViewer.t4 == 3 && photoViewer.M1 != null) {
                            int e0 = photoViewer.e0(0, true);
                            hc8 hc8Var = photoViewer.M1;
                            int i22 = hl.q.y;
                            Typeface typeface = hl.a;
                            hl.L(20.0f);
                            photoViewer.M1.getClass();
                            float e02 = (((e0 - hc8Var.X1) - photoViewer.e0(0, false)) / 2.0f) * 1.0f;
                            canvas.translate(0.0f, e02);
                            if (z3) {
                                Matrix matrix = photoViewer.N8;
                                photoViewer.M1.getClass();
                                matrix.preTranslate(0.0f, e02);
                            }
                        }
                        if (!z4 && photoViewer.H3 && photoViewer.I3) {
                            View view = photoViewer.E2 ? photoViewer.D2 : photoViewer.C2;
                            q = view.getMeasuredWidth();
                            o = view.getMeasuredHeight();
                        } else {
                            q = photoViewer.B4.q();
                            o = photoViewer.B4.o();
                        }
                        f15 = g0;
                        f16 = q;
                        f17 = f15 / f16;
                        f18 = i5;
                        i6 = i5;
                        float f62 = o;
                        float f63 = f18 / f62;
                        int i23 = o;
                        float min5 = Math.min(f17, f63);
                        int i24 = q;
                        int i25 = (int) (f62 * min5);
                        float f64 = (int) (f16 * min5);
                        float f65 = i25;
                        if (!photoViewer.B3 || ((z4 && ((photoViewer.H3 || photoViewer.I3) && photoViewer.M3 && photoViewer.N3 == 1.0f)) || (photoViewer.N4 != null && photoViewer.s1))) {
                            i7 = g0;
                            f19 = f14;
                            f20 = f15;
                            imageReceiver4 = imageReceiver3;
                            f21 = f16;
                            f22 = f17;
                            f23 = f18;
                            f24 = f64;
                        } else {
                            float q3 = photoViewer.B4.q();
                            float o3 = photoViewer.B4.o();
                            if (photoViewer.s1 && photoViewer.t4 == 0) {
                                f41 = o3;
                                if (photoViewer.d2 == 1) {
                                    min = photoViewer.i0(false);
                                    f24 = q3 * min;
                                    f65 = min * f41;
                                    f19 = f14;
                                    if (photoViewer.s1) {
                                        i7 = g0;
                                        f20 = f15;
                                        imageReceiver4 = imageReceiver3;
                                        f21 = f16;
                                        f22 = f17;
                                        f23 = f18;
                                    } else {
                                        if (z3) {
                                            f20 = f15;
                                            f21 = f16;
                                            photoViewer.N8.preTranslate((-f24) / 2.0f, (-f65) / 2.0f);
                                            float[] fArr = photoViewer.O8;
                                            fArr[0] = 0.0f;
                                            fArr[1] = 0.0f;
                                            fArr[b] = f24;
                                            fArr[3] = 0.0f;
                                            fArr[4] = f24;
                                            fArr[5] = f65;
                                            fArr[6] = 0.0f;
                                            fArr[7] = f65;
                                            photoViewer.N8.mapPoints(fArr);
                                            RectF rectF = photoViewer.M8;
                                            float[] fArr2 = photoViewer.O8;
                                            float min6 = Math.min(fArr2[0], fArr2[b]);
                                            float[] fArr3 = photoViewer.O8;
                                            f22 = f17;
                                            float min7 = Math.min(min6, Math.min(fArr3[4], fArr3[6]));
                                            float[] fArr4 = photoViewer.O8;
                                            float min8 = Math.min(fArr4[1], fArr4[3]);
                                            float[] fArr5 = photoViewer.O8;
                                            f23 = f18;
                                            float min9 = Math.min(min8, Math.min(fArr5[5], fArr5[7]));
                                            float[] fArr6 = photoViewer.O8;
                                            float max = Math.max(fArr6[0], fArr6[b]);
                                            float[] fArr7 = photoViewer.O8;
                                            i7 = g0;
                                            float max2 = Math.max(max, Math.max(fArr7[4], fArr7[6]));
                                            float[] fArr8 = photoViewer.O8;
                                            float max3 = Math.max(fArr8[1], fArr8[3]);
                                            float[] fArr9 = photoViewer.O8;
                                            imageReceiver4 = imageReceiver3;
                                            rectF.set(min7, min9, max2, Math.max(max3, Math.max(fArr9[5], fArr9[7])));
                                            f42 = photoViewer.K8[1].d(photoViewer.L8.intersect(photoViewer.M8));
                                        } else {
                                            i7 = g0;
                                            f20 = f15;
                                            imageReceiver4 = imageReceiver3;
                                            f21 = f16;
                                            f22 = f17;
                                            f23 = f18;
                                            f42 = 1.0f;
                                        }
                                        if (photoViewer.N3 >= 1.0f || (d2 = photoViewer.E4.d(photoViewer.B4)) == null) {
                                            f43 = 0.0f;
                                        } else {
                                            canvas.save();
                                            xl0Var2.h.setShader(null);
                                            xl0Var2.h.setAlpha((int) qd4.z(1.0f, photoViewer.N3, f42 * 255.0f * f11, f8));
                                            canvas.scale(d2.getWidth() / (d2.getWidth() - 3.0f), d2.getHeight() / (d2.getHeight() - 3.0f));
                                            canvas.translate((-f24) / 2.0f, (-f65) / 2.0f);
                                            canvas.scale((f24 * 1.0f) / d2.getWidth(), (f65 * 1.0f) / d2.getHeight());
                                            if (z) {
                                                canvas.clipRect(0, 0, d2.getWidth(), d2.getHeight());
                                            }
                                            f43 = 0.0f;
                                            canvas.drawBitmap(d2, 0.0f, 0.0f, xl0Var2.h);
                                            canvas.restore();
                                        }
                                        if (photoViewer.N3 > f43 && (b3 = photoViewer.c0.b()) != null) {
                                            canvas.save();
                                            xl0Var2.h.setShader(null);
                                            xl0Var2.h.setAlpha((int) (f42 * 255.0f * f11 * photoViewer.N3 * f8));
                                            canvas.scale(b3.getWidth() / (b3.getWidth() - 3.0f), b3.getHeight() / (b3.getHeight() - 3.0f));
                                            canvas.translate((-f24) / 2.0f, (-f65) / 2.0f);
                                            canvas.scale((f24 * 1.0f) / b3.getWidth(), (f65 * 1.0f) / b3.getHeight());
                                            if (z) {
                                                canvas.clipRect(0, 0, b3.getWidth(), b3.getHeight());
                                            }
                                            canvas.drawBitmap(b3, 0.0f, 0.0f, xl0Var2.h);
                                            canvas.restore();
                                        }
                                        z5 = true;
                                        isEmpty = arrayList.isEmpty();
                                        xc8 xc8Var = photoViewer.W4;
                                        u33 u33Var2 = photoViewer.E1;
                                        if (!isEmpty) {
                                            byte b7 = photoViewer.t4;
                                            if (b7 != 3 && (i14 = photoViewer.n6) != 3) {
                                                if (photoViewer.d2 != 1) {
                                                    int i26 = photoViewer.o6 != null ? -1 : -1;
                                                    if (b7 != 0) {
                                                        if (b7 != 1) {
                                                        }
                                                    }
                                                } else if (i14 != 0) {
                                                    if (b7 != 3) {
                                                    }
                                                }
                                                if (z6) {
                                                    if (!arrayList.isEmpty()) {
                                                        if (photoViewer.t4 == 1 || photoViewer.d2 == 1) {
                                                            z7 = u33Var2.h;
                                                        } else {
                                                            fo6 fo6Var4 = xc8Var.c;
                                                            if (fo6Var4 != null && fo6Var4.l) {
                                                                z7 = true;
                                                            }
                                                        }
                                                        if (z7) {
                                                            f28 = 1.0f;
                                                            z8 = false;
                                                        } else {
                                                            canvas.save();
                                                            f28 = 1.0f;
                                                            canvas.scale(-1.0f, 1.0f);
                                                            z8 = true;
                                                        }
                                                        if (f5 > 0.0f) {
                                                            if (!z8) {
                                                                canvas.save();
                                                                z8 = true;
                                                            }
                                                            canvas.scale(f28 - (f5 * 2.0f), f28);
                                                            canvas.skew(0.0f, qd4.z(f28, f5, 4.0f * f5, 0.25f));
                                                        }
                                                        nc8Var = photoViewer.g0;
                                                        if (nc8Var != null || nc8Var.n.getVisibility() == 0) {
                                                            if (z3) {
                                                                f29 = f26;
                                                                f30 = 1.0f;
                                                            } else {
                                                                f29 = f26;
                                                                photoViewer.N8.preTranslate((-f24) / 2.0f, (-f29) / 2.0f);
                                                                float[] fArr10 = photoViewer.O8;
                                                                fArr10[0] = 0.0f;
                                                                fArr10[1] = 0.0f;
                                                                fArr10[2] = f24;
                                                                fArr10[3] = 0.0f;
                                                                fArr10[4] = f24;
                                                                fArr10[5] = f29;
                                                                fArr10[6] = 0.0f;
                                                                fArr10[7] = f29;
                                                                photoViewer.N8.mapPoints(fArr10);
                                                                RectF rectF2 = photoViewer.M8;
                                                                float[] fArr11 = photoViewer.O8;
                                                                float min10 = Math.min(fArr11[0], fArr11[2]);
                                                                float[] fArr12 = photoViewer.O8;
                                                                float min11 = Math.min(min10, Math.min(fArr12[4], fArr12[6]));
                                                                float[] fArr13 = photoViewer.O8;
                                                                float min12 = Math.min(fArr13[1], fArr13[3]);
                                                                float[] fArr14 = photoViewer.O8;
                                                                float min13 = Math.min(min12, Math.min(fArr14[5], fArr14[7]));
                                                                float[] fArr15 = photoViewer.O8;
                                                                float max4 = Math.max(fArr15[0], fArr15[2]);
                                                                float[] fArr16 = photoViewer.O8;
                                                                float max5 = Math.max(max4, Math.max(fArr16[4], fArr16[6]));
                                                                float[] fArr17 = photoViewer.O8;
                                                                float max6 = Math.max(fArr17[1], fArr17[3]);
                                                                float[] fArr18 = photoViewer.O8;
                                                                rectF2.set(min11, min13, max5, Math.max(max6, Math.max(fArr18[5], fArr18[7])));
                                                                f30 = photoViewer.K8[1].d(photoViewer.L8.intersect(photoViewer.M8));
                                                            }
                                                            b2 = photoViewer.c0.b();
                                                            if (b2 == null) {
                                                                b2 = photoViewer.E4.d(photoViewer.B4);
                                                            }
                                                            if (b2 != null) {
                                                                xl0Var2 = xl0Var;
                                                                xl0Var2.h.setShader(null);
                                                                f8 = f27;
                                                                xl0Var2.h.setAlpha((int) xnb.C(f25, 255.0f, f30, f8));
                                                                canvas.scale(b2.getWidth() / (b2.getWidth() - 3.0f), b2.getHeight() / (b2.getHeight() - 3.0f));
                                                                canvas.translate((-f24) / 2.0f, (-f29) / 2.0f);
                                                                canvas.scale((f24 * 1.0f) / b2.getWidth(), (f29 * 1.0f) / b2.getHeight());
                                                                if (z) {
                                                                    canvas.clipRect(0, 0, b2.getWidth(), b2.getHeight());
                                                                }
                                                                canvas.drawBitmap(b2, 0.0f, 0.0f, xl0Var2.h);
                                                                if (z8) {
                                                                    canvas.restore();
                                                                }
                                                                z6 = true;
                                                            }
                                                        }
                                                        xl0Var2 = xl0Var;
                                                        f8 = f27;
                                                        if (z8) {
                                                        }
                                                        z6 = true;
                                                    }
                                                    z7 = false;
                                                    if (z7) {
                                                    }
                                                    if (f5 > 0.0f) {
                                                    }
                                                    nc8Var = photoViewer.g0;
                                                    if (nc8Var != null) {
                                                    }
                                                    if (z3) {
                                                    }
                                                    b2 = photoViewer.c0.b();
                                                    if (b2 == null) {
                                                    }
                                                    if (b2 != null) {
                                                    }
                                                    xl0Var2 = xl0Var;
                                                    f8 = f27;
                                                    if (z8) {
                                                    }
                                                    z6 = true;
                                                } else {
                                                    xl0Var2 = xl0Var;
                                                    f8 = f27;
                                                }
                                                canvas.restore();
                                            }
                                            int i27 = u33Var2.i;
                                            if (i27 == 90 || i27 == 270) {
                                                i8 = i23;
                                                i10 = i24;
                                            } else {
                                                i10 = i23;
                                                i8 = i24;
                                            }
                                            z6 = z5;
                                            int i28 = photoViewer.d2;
                                            f25 = f11;
                                            if (i28 != 1) {
                                                f27 = f8;
                                                if (b7 != 3) {
                                                }
                                                f31 = 1.0f;
                                                float f66 = u33Var2.j;
                                                float f67 = u33Var2.k;
                                                f32 = i8;
                                                f26 = f65;
                                                f33 = 1.0f - f31;
                                                int z12 = (int) xnb.z(1.0f - f66, f33, f66, f32);
                                                f34 = i10;
                                                int i29 = (int) ((((1.0f - f67) * f33) + f67) * f34);
                                                f35 = z12;
                                                f36 = f20 / f35;
                                                f37 = i29;
                                                if (f36 * f37 > f23) {
                                                    f36 = f23 / f37;
                                                }
                                                if (i28 != 1 && ((b7 != 1 || photoViewer.n6 == 0) && xc8Var.c != null)) {
                                                    float f68 = f35 * f36;
                                                    float f69 = f37 * f36;
                                                    if (f22 * f62 > f23) {
                                                        f22 = f63;
                                                    }
                                                    float A = qd4.A((f21 * f22) / f19, f68, f33, f68);
                                                    float A2 = qd4.A((f62 * f22) / f19, f69, f33, f69);
                                                    canvas.clipRect((-A) / 2.0f, (-A2) / 2.0f, A / 2.0f, A2 / 2.0f);
                                                }
                                                i11 = photoViewer.d2;
                                                if (i11 != 1 || u33Var2.a) {
                                                    if (photoViewer.t4 != 1 || i11 == 1) {
                                                        textureView = photoViewer.C2;
                                                        if (textureView != null) {
                                                            textureView.setScaleX(u33Var2.h ? -1.0f : 1.0f);
                                                            zc8 zc8Var = photoViewer.F2;
                                                            if (zc8Var != null) {
                                                                zc8Var.setScaleX(photoViewer.C2.getScaleX());
                                                            }
                                                        }
                                                        float A3 = u33Var2.f / qd4.A(u33Var2.l, 1.0f, f33, 1.0f);
                                                        f38 = f20 / f32;
                                                        if (f38 * f34 > f23) {
                                                            f38 = f23 / f34;
                                                        }
                                                        float f70 = (f38 / min5) * A3;
                                                        if (photoViewer.d2 == 1) {
                                                            if (photoViewer.t4 == 3 || (i12 = photoViewer.n6) == 3) {
                                                                f70 /= ((u33Var2.m - 1.0f) * f33) + 1.0f;
                                                            } else if (i12 == 0) {
                                                                f70 /= u33Var2.m;
                                                            }
                                                        }
                                                        f39 = f70;
                                                    } else {
                                                        TextureView textureView2 = photoViewer.C2;
                                                        if (textureView2 != null) {
                                                            fo6 fo6Var5 = xc8Var.c;
                                                            textureView2.setScaleX((fo6Var5 == null || !fo6Var5.l) ? 1.0f : -1.0f);
                                                            zc8 zc8Var2 = photoViewer.F2;
                                                            if (zc8Var2 != null) {
                                                                zc8Var2.setScaleX(photoViewer.C2.getScaleX());
                                                            }
                                                        }
                                                        fo6 fo6Var6 = xc8Var.c;
                                                        float f71 = fo6Var6 != null ? fo6Var6.c : 1.0f;
                                                        f39 = ((f36 / min5) / qd4.A(f71, 1.0f, f33, 1.0f)) * f71;
                                                    }
                                                    float f72 = f39;
                                                    canvas.translate(u33Var2.d * f31, u33Var2.e * f31);
                                                    canvas.scale(f72, f72);
                                                    canvas.translate(xnb.C(u33Var2.b, f32, min5, f31), xnb.C(u33Var2.c, f34, min5, f31));
                                                    if (z3) {
                                                        photoViewer.N8.preTranslate(u33Var2.d * f31, u33Var2.e * f31);
                                                        photoViewer.N8.preScale(f72, f72);
                                                        photoViewer.N8.preTranslate(xnb.C(u33Var2.b, f32, min5, f31), xnb.C(u33Var2.c, f34, min5, f31));
                                                    }
                                                    f40 = u33Var2.g + i27;
                                                    if (f40 > 180.0f) {
                                                        f40 -= 360.0f;
                                                    }
                                                    if (photoViewer.d2 == 1 || !(photoViewer.t4 == 3 || photoViewer.n6 == 3)) {
                                                        float f73 = f40 * f31;
                                                        canvas.rotate(f73);
                                                        if (z3) {
                                                            photoViewer.N8.preRotate(f73);
                                                        }
                                                    } else {
                                                        canvas.rotate(f40);
                                                        if (z3) {
                                                            photoViewer.N8.preRotate(f40);
                                                        }
                                                    }
                                                }
                                                if (z6) {
                                                }
                                                canvas.restore();
                                            } else {
                                                f27 = f8;
                                            }
                                            if (photoViewer.o6 == null || (i13 = photoViewer.n6) == -1) {
                                                if (b7 == 2 || b7 == 3) {
                                                    f31 = 0.0f;
                                                    float f662 = u33Var2.j;
                                                    float f672 = u33Var2.k;
                                                    f32 = i8;
                                                    f26 = f65;
                                                    f33 = 1.0f - f31;
                                                    int z122 = (int) xnb.z(1.0f - f662, f33, f662, f32);
                                                    f34 = i10;
                                                    int i292 = (int) ((((1.0f - f672) * f33) + f672) * f34);
                                                    f35 = z122;
                                                    f36 = f20 / f35;
                                                    f37 = i292;
                                                    if (f36 * f37 > f23) {
                                                    }
                                                    if (i28 != 1) {
                                                        float f682 = f35 * f36;
                                                        float f692 = f37 * f36;
                                                        if (f22 * f62 > f23) {
                                                        }
                                                        float A4 = qd4.A((f21 * f22) / f19, f682, f33, f682);
                                                        float A22 = qd4.A((f62 * f22) / f19, f692, f33, f692);
                                                        canvas.clipRect((-A4) / 2.0f, (-A22) / 2.0f, A4 / 2.0f, A22 / 2.0f);
                                                    }
                                                    i11 = photoViewer.d2;
                                                    if (i11 != 1) {
                                                    }
                                                    if (photoViewer.t4 != 1) {
                                                    }
                                                    textureView = photoViewer.C2;
                                                    if (textureView != null) {
                                                    }
                                                    float A32 = u33Var2.f / qd4.A(u33Var2.l, 1.0f, f33, 1.0f);
                                                    f38 = f20 / f32;
                                                    if (f38 * f34 > f23) {
                                                    }
                                                    float f702 = (f38 / min5) * A32;
                                                    if (photoViewer.d2 == 1) {
                                                    }
                                                    f39 = f702;
                                                    float f722 = f39;
                                                    canvas.translate(u33Var2.d * f31, u33Var2.e * f31);
                                                    canvas.scale(f722, f722);
                                                    canvas.translate(xnb.C(u33Var2.b, f32, min5, f31), xnb.C(u33Var2.c, f34, min5, f31));
                                                    if (z3) {
                                                    }
                                                    f40 = u33Var2.g + i27;
                                                    if (f40 > 180.0f) {
                                                    }
                                                    if (photoViewer.d2 == 1) {
                                                    }
                                                    float f732 = f40 * f31;
                                                    canvas.rotate(f732);
                                                    if (z3) {
                                                    }
                                                    if (z6) {
                                                    }
                                                    canvas.restore();
                                                }
                                                f31 = 1.0f;
                                                float f6622 = u33Var2.j;
                                                float f6722 = u33Var2.k;
                                                f32 = i8;
                                                f26 = f65;
                                                f33 = 1.0f - f31;
                                                int z1222 = (int) xnb.z(1.0f - f6622, f33, f6622, f32);
                                                f34 = i10;
                                                int i2922 = (int) ((((1.0f - f6722) * f33) + f6722) * f34);
                                                f35 = z1222;
                                                f36 = f20 / f35;
                                                f37 = i2922;
                                                if (f36 * f37 > f23) {
                                                }
                                                if (i28 != 1) {
                                                }
                                                i11 = photoViewer.d2;
                                                if (i11 != 1) {
                                                }
                                                if (photoViewer.t4 != 1) {
                                                }
                                                textureView = photoViewer.C2;
                                                if (textureView != null) {
                                                }
                                                float A322 = u33Var2.f / qd4.A(u33Var2.l, 1.0f, f33, 1.0f);
                                                f38 = f20 / f32;
                                                if (f38 * f34 > f23) {
                                                }
                                                float f7022 = (f38 / min5) * A322;
                                                if (photoViewer.d2 == 1) {
                                                }
                                                f39 = f7022;
                                                float f7222 = f39;
                                                canvas.translate(u33Var2.d * f31, u33Var2.e * f31);
                                                canvas.scale(f7222, f7222);
                                                canvas.translate(xnb.C(u33Var2.b, f32, min5, f31), xnb.C(u33Var2.c, f34, min5, f31));
                                                if (z3) {
                                                }
                                                f40 = u33Var2.g + i27;
                                                if (f40 > 180.0f) {
                                                }
                                                if (photoViewer.d2 == 1) {
                                                }
                                                float f7322 = f40 * f31;
                                                canvas.rotate(f7322);
                                                if (z3) {
                                                }
                                                if (z6) {
                                                }
                                                canvas.restore();
                                            } else {
                                                if (b7 != 1 && i13 != 1) {
                                                    float f74 = photoViewer.k6;
                                                    f31 = i13 == 0 ? f74 : 1.0f - f74;
                                                    float f66222 = u33Var2.j;
                                                    float f67222 = u33Var2.k;
                                                    f32 = i8;
                                                    f26 = f65;
                                                    f33 = 1.0f - f31;
                                                    int z12222 = (int) xnb.z(1.0f - f66222, f33, f66222, f32);
                                                    f34 = i10;
                                                    int i29222 = (int) ((((1.0f - f67222) * f33) + f67222) * f34);
                                                    f35 = z12222;
                                                    f36 = f20 / f35;
                                                    f37 = i29222;
                                                    if (f36 * f37 > f23) {
                                                    }
                                                    if (i28 != 1) {
                                                    }
                                                    i11 = photoViewer.d2;
                                                    if (i11 != 1) {
                                                    }
                                                    if (photoViewer.t4 != 1) {
                                                    }
                                                    textureView = photoViewer.C2;
                                                    if (textureView != null) {
                                                    }
                                                    float A3222 = u33Var2.f / qd4.A(u33Var2.l, 1.0f, f33, 1.0f);
                                                    f38 = f20 / f32;
                                                    if (f38 * f34 > f23) {
                                                    }
                                                    float f70222 = (f38 / min5) * A3222;
                                                    if (photoViewer.d2 == 1) {
                                                    }
                                                    f39 = f70222;
                                                    float f72222 = f39;
                                                    canvas.translate(u33Var2.d * f31, u33Var2.e * f31);
                                                    canvas.scale(f72222, f72222);
                                                    canvas.translate(xnb.C(u33Var2.b, f32, min5, f31), xnb.C(u33Var2.c, f34, min5, f31));
                                                    if (z3) {
                                                    }
                                                    f40 = u33Var2.g + i27;
                                                    if (f40 > 180.0f) {
                                                    }
                                                    if (photoViewer.d2 == 1) {
                                                    }
                                                    float f73222 = f40 * f31;
                                                    canvas.rotate(f73222);
                                                    if (z3) {
                                                    }
                                                    if (z6) {
                                                    }
                                                    canvas.restore();
                                                }
                                                f31 = 1.0f;
                                                float f662222 = u33Var2.j;
                                                float f672222 = u33Var2.k;
                                                f32 = i8;
                                                f26 = f65;
                                                f33 = 1.0f - f31;
                                                int z122222 = (int) xnb.z(1.0f - f662222, f33, f662222, f32);
                                                f34 = i10;
                                                int i292222 = (int) ((((1.0f - f672222) * f33) + f672222) * f34);
                                                f35 = z122222;
                                                f36 = f20 / f35;
                                                f37 = i292222;
                                                if (f36 * f37 > f23) {
                                                }
                                                if (i28 != 1) {
                                                }
                                                i11 = photoViewer.d2;
                                                if (i11 != 1) {
                                                }
                                                if (photoViewer.t4 != 1) {
                                                }
                                                textureView = photoViewer.C2;
                                                if (textureView != null) {
                                                }
                                                float A32222 = u33Var2.f / qd4.A(u33Var2.l, 1.0f, f33, 1.0f);
                                                f38 = f20 / f32;
                                                if (f38 * f34 > f23) {
                                                }
                                                float f702222 = (f38 / min5) * A32222;
                                                if (photoViewer.d2 == 1) {
                                                }
                                                f39 = f702222;
                                                float f722222 = f39;
                                                canvas.translate(u33Var2.d * f31, u33Var2.e * f31);
                                                canvas.scale(f722222, f722222);
                                                canvas.translate(xnb.C(u33Var2.b, f32, min5, f31), xnb.C(u33Var2.c, f34, min5, f31));
                                                if (z3) {
                                                }
                                                f40 = u33Var2.g + i27;
                                                if (f40 > 180.0f) {
                                                }
                                                if (photoViewer.d2 == 1) {
                                                }
                                                float f732222 = f40 * f31;
                                                canvas.rotate(f732222);
                                                if (z3) {
                                                }
                                                if (z6) {
                                                }
                                                canvas.restore();
                                            }
                                        }
                                        z6 = z5;
                                        f25 = f11;
                                        f26 = f65;
                                        f27 = f8;
                                        if (z6) {
                                        }
                                        canvas.restore();
                                    }
                                }
                            } else {
                                f41 = o3;
                            }
                            min = Math.min(f15 / q3, f18 / f41);
                            f24 = q3 * min;
                            f65 = min * f41;
                            f19 = f14;
                            if (photoViewer.s1) {
                            }
                        }
                        z5 = false;
                        isEmpty = arrayList.isEmpty();
                        xc8 xc8Var2 = photoViewer.W4;
                        u33 u33Var22 = photoViewer.E1;
                        if (!isEmpty) {
                        }
                        z6 = z5;
                        f25 = f11;
                        f26 = f65;
                        f27 = f8;
                        if (z6) {
                        }
                        canvas.restore();
                    } else {
                        i7 = g0;
                        i6 = i5;
                        imageReceiver4 = imageReceiver3;
                        f13 = 2.0f;
                        z6 = false;
                    }
                    if (!z6 && photoViewer.i0.getVisibility() == 0) {
                        canvas.save();
                        if (photoViewer.u2) {
                            canvas.translate((photoViewer.w0() / 2) - (photoViewer.r0() / 2), 0.0f);
                        }
                        canvas.translate(photoViewer.i0.getX(), photoViewer.i0.getY());
                        canvas.scale(photoViewer.i0.getScaleX(), photoViewer.i0.getScaleY(), photoViewer.i0.getPivotX(), photoViewer.i0.getPivotY());
                        b4 = photoViewer.E4.b(photoViewer.i0.getBitmapHolder());
                        if (b4 != null) {
                            canvas.save();
                            xl0Var2.h.setShader(null);
                            xl0Var2.h.setAlpha((int) (f8 * 255.0f));
                            canvas.scale((photoViewer.i0.getWidth() * 1.0f) / b4.getWidth(), (photoViewer.i0.getHeight() * 1.0f) / b4.getHeight());
                            canvas.scale(b4.getWidth() / (b4.getWidth() - 3.0f), b4.getHeight() / (b4.getHeight() - 3.0f), b4.getWidth() / f13, b4.getHeight() / f13);
                            canvas.drawBitmap(b4, 0.0f, 0.0f, xl0Var2.h);
                            if (z) {
                                canvas.clipRect(0, 0, b4.getWidth(), b4.getHeight());
                            }
                            canvas.restore();
                        }
                        canvas.restore();
                    }
                    imageReceiver5 = imageReceiver4;
                    if (imageReceiver5 == photoViewer.A4) {
                        float e2 = z3 ? photoViewer.K8[0].e(true, 1.0f) : 1.0f;
                        if (imageReceiver5 != null && imageReceiver5.B()) {
                            canvas.save();
                            canvas.translate(i7 / 2, i6 / 2);
                            int i30 = i7;
                            float f75 = i30;
                            canvas.translate(((-(((photoViewer.Z5 + 1.0f) * f75) + hl.L(30.0f))) / f13) + f52, 0.0f);
                            int q4 = imageReceiver5.q();
                            int o4 = imageReceiver5.o();
                            if (!photoViewer.G4 && (fo6Var = photoViewer.H1) != null) {
                                u33 u33Var3 = photoViewer.F1;
                                if (u33Var3.a) {
                                    i15 = i6;
                                    photoViewer.d(canvas, i30, i15, q4, o4, f7, u33Var3, fo6Var);
                                    float f76 = q4;
                                    float f77 = o4;
                                    float min14 = Math.min(f75 / f76, i15 / f77);
                                    int i31 = (int) (f76 * min14);
                                    int i32 = (int) (f77 * min14);
                                    if (!arrayList.isEmpty()) {
                                        z9 = false;
                                    } else if (photoViewer.t4 == 1 || photoViewer.d2 == 1) {
                                        z9 = photoViewer.F1.h;
                                    } else {
                                        fo6 fo6Var7 = photoViewer.H1;
                                        z9 = fo6Var7 != null && fo6Var7.l;
                                    }
                                    if (z9) {
                                        canvas.scale(-1.0f, 1.0f);
                                    }
                                    d3 = photoViewer.D4.d(imageReceiver5);
                                    if (d3 != null) {
                                        xl0Var2.h.setShader(null);
                                        xl0Var2.h.setAlpha((int) (f8 * 255.0f * e2));
                                        canvas.scale(d3.getWidth() / (d3.getWidth() - 3.0f), d3.getHeight() / (d3.getHeight() - 3.0f));
                                        canvas.translate((-i31) / 2, (-i32) / 2);
                                        canvas.scale((i31 * 1.0f) / d3.getWidth(), (i32 * 1.0f) / d3.getHeight());
                                        if (z) {
                                            canvas.clipRect(0, 0, d3.getWidth(), d3.getHeight());
                                        }
                                        canvas.drawBitmap(d3, 0.0f, 0.0f, xl0Var2.h);
                                    }
                                    canvas.restore();
                                }
                            }
                            i15 = i6;
                            float f762 = q4;
                            float f772 = o4;
                            float min142 = Math.min(f75 / f762, i15 / f772);
                            int i312 = (int) (f762 * min142);
                            int i322 = (int) (f772 * min142);
                            if (!arrayList.isEmpty()) {
                            }
                            if (z9) {
                            }
                            d3 = photoViewer.D4.d(imageReceiver5);
                            if (d3 != null) {
                            }
                            canvas.restore();
                        }
                    }
                    canvas.restoreToCount(i4);
                    if (i2 != 0) {
                        xl0Var2.h.setColor(i2);
                        xl0Var2.h.setAlpha((int) (hl.R1(0.7f, 1.0f, f8) * r0.getAlpha()));
                        canvas.drawPaint(xl0Var2.h);
                        return;
                    }
                    return;
                }
            }
            f10 = f52;
            f11 = 1.0f;
            f12 = 0.0f;
            if (photoViewer.I3) {
            }
            if (photoViewer.B4.B()) {
            }
            canvas.save();
            int i202 = g0 / 2;
            int i212 = i5 / 2;
            f13 = 2.0f;
            canvas.translate(photoViewer.Y(photoViewer.t4) + i202, photoViewer.Z(photoViewer.t4) + i212);
            float f602 = f4 + 0.0f;
            canvas.translate(f10, f602);
            f14 = f7 - f12;
            canvas.scale(f14, f14);
            float f612 = f6;
            canvas.rotate(f612);
            if (z3) {
            }
            if (photoViewer.t4 == 3) {
                int e03 = photoViewer.e0(0, true);
                hc8 hc8Var2 = photoViewer.M1;
                int i222 = hl.q.y;
                Typeface typeface2 = hl.a;
                hl.L(20.0f);
                photoViewer.M1.getClass();
                float e022 = (((e03 - hc8Var2.X1) - photoViewer.e0(0, false)) / 2.0f) * 1.0f;
                canvas.translate(0.0f, e022);
                if (z3) {
                }
            }
            if (!z4) {
            }
            q = photoViewer.B4.q();
            o = photoViewer.B4.o();
            f15 = g0;
            f16 = q;
            f17 = f15 / f16;
            f18 = i5;
            i6 = i5;
            float f622 = o;
            float f632 = f18 / f622;
            int i232 = o;
            float min52 = Math.min(f17, f632);
            int i242 = q;
            int i252 = (int) (f622 * min52);
            float f642 = (int) (f16 * min52);
            float f652 = i252;
            if (photoViewer.B3) {
            }
            i7 = g0;
            f19 = f14;
            f20 = f15;
            imageReceiver4 = imageReceiver3;
            f21 = f16;
            f22 = f17;
            f23 = f18;
            f24 = f642;
            z5 = false;
            isEmpty = arrayList.isEmpty();
            xc8 xc8Var22 = photoViewer.W4;
            u33 u33Var222 = photoViewer.E1;
            if (!isEmpty) {
            }
            z6 = z5;
            f25 = f11;
            f26 = f652;
            f27 = f8;
            if (z6) {
            }
            canvas.restore();
            if (!z6) {
                canvas.save();
                if (photoViewer.u2) {
                }
                canvas.translate(photoViewer.i0.getX(), photoViewer.i0.getY());
                canvas.scale(photoViewer.i0.getScaleX(), photoViewer.i0.getScaleY(), photoViewer.i0.getPivotX(), photoViewer.i0.getPivotY());
                b4 = photoViewer.E4.b(photoViewer.i0.getBitmapHolder());
                if (b4 != null) {
                }
                canvas.restore();
            }
            imageReceiver5 = imageReceiver4;
            if (imageReceiver5 == photoViewer.A4) {
            }
            canvas.restoreToCount(i4);
            if (i2 != 0) {
            }
        }
        imageReceiver = null;
        imageReceiver2 = photoViewer.C4;
        ArrayList arrayList22 = photoViewer.f7;
        if (imageReceiver != imageReceiver2) {
        }
        if (!photoViewer.Q6) {
        }
        f10 = f52;
        f11 = 1.0f;
        f12 = 0.0f;
        if (photoViewer.I3) {
        }
        if (photoViewer.B4.B()) {
        }
        canvas.save();
        int i2022 = g0 / 2;
        int i2122 = i5 / 2;
        f13 = 2.0f;
        canvas.translate(photoViewer.Y(photoViewer.t4) + i2022, photoViewer.Z(photoViewer.t4) + i2122);
        float f6022 = f4 + 0.0f;
        canvas.translate(f10, f6022);
        f14 = f7 - f12;
        canvas.scale(f14, f14);
        float f6122 = f6;
        canvas.rotate(f6122);
        if (z3) {
        }
        if (photoViewer.t4 == 3) {
        }
        if (!z4) {
        }
        q = photoViewer.B4.q();
        o = photoViewer.B4.o();
        f15 = g0;
        f16 = q;
        f17 = f15 / f16;
        f18 = i5;
        i6 = i5;
        float f6222 = o;
        float f6322 = f18 / f6222;
        int i2322 = o;
        float min522 = Math.min(f17, f6322);
        int i2422 = q;
        int i2522 = (int) (f6222 * min522);
        float f6422 = (int) (f16 * min522);
        float f6522 = i2522;
        if (photoViewer.B3) {
        }
        i7 = g0;
        f19 = f14;
        f20 = f15;
        imageReceiver4 = imageReceiver3;
        f21 = f16;
        f22 = f17;
        f23 = f18;
        f24 = f6422;
        z5 = false;
        isEmpty = arrayList.isEmpty();
        xc8 xc8Var222 = photoViewer.W4;
        u33 u33Var2222 = photoViewer.E1;
        if (!isEmpty) {
        }
        z6 = z5;
        f25 = f11;
        f26 = f6522;
        f27 = f8;
        if (z6) {
        }
        canvas.restore();
        if (!z6) {
        }
        imageReceiver5 = imageReceiver4;
        if (imageReceiver5 == photoViewer.A4) {
        }
        canvas.restoreToCount(i4);
        if (i2 != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:380:0x026c, code lost:
    
        if (r47.n1(((r47) r3.get(0)).k).webpage.url != null) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:697:0x0a83, code lost:
    
        if (r5 == null) goto L543;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0fb1  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:701:0x0a98  */
    /* JADX WARN: Removed duplicated region for block: B:704:0x0aa7  */
    /* JADX WARN: Removed duplicated region for block: B:710:0x0a9e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x066f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0f95  */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v20, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v21 */
    /* JADX WARN: Type inference failed for: r1v39, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r6v51, types: [cd8] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void P1(boolean z, boolean z2, boolean z3, int i) {
        int i2;
        int i3;
        CharSequence charSequence;
        boolean z4;
        r47 r47Var;
        CharSequence charSequence2;
        String L0;
        r47 r47Var2;
        boolean z5;
        ArrayList arrayList;
        Integer num;
        boolean z6;
        boolean z7;
        fo6 fo6Var;
        boolean z8;
        int i4;
        boolean z9;
        boolean z10;
        long j;
        long j2;
        boolean z11;
        boolean z12;
        boolean z13;
        fo6 fo6Var2;
        CharSequence charSequence3;
        int i5;
        boolean z14;
        int i6;
        no6 no6Var;
        boolean z15;
        int i7;
        boolean z16;
        fo6 fo6Var3;
        boolean z17;
        boolean z18;
        boolean z19;
        int i8;
        boolean z20;
        int i10;
        r47 r47Var3;
        String str;
        float f;
        boolean z21;
        TLRPC.Photo photo;
        Integer num2;
        int i11;
        TLRPC.Photo photo2;
        String str2;
        boolean z22;
        zu1 zu1Var;
        ed8 ed8Var;
        String str3;
        int i12;
        boolean z23;
        float f2;
        boolean z24;
        int i13;
        PorterDuffColorFilter porterDuffColorFilter;
        ed8 ed8Var2;
        TLRPC.User h;
        TLRPC.Chat e;
        String str4;
        int i14;
        TLRPC.Photo photo3;
        ArrayList arrayList2;
        String str5;
        a5c a5cVar;
        ArrayList arrayList3;
        boolean z25;
        CharSequence E1;
        TLRPC.Message message;
        int i15;
        String L02;
        CharSequence charSequence4;
        ?? r15;
        int i16;
        boolean z26;
        int i17;
        int e1;
        int i18;
        boolean z27;
        int i19;
        TLRPC.Message message2;
        TLRPC.Message message3;
        PhotoViewer photoViewer = this;
        boolean z28 = z2;
        if (z || photoViewer.P4 != i || z3) {
            int i20 = photoViewer.P4;
            int i21 = 0;
            boolean z29 = i >= i20;
            photoViewer.P4 = i;
            photoViewer.o0(i);
            if (z28) {
                TransitionSet transitionSet = new TransitionSet();
                transitionSet.addTransition(new Fade());
                transitionSet.addTransition(new ChangeBounds());
                transitionSet.setOrdering(0);
                transitionSet.setDuration(220L);
                transitionSet.setInterpolator((TimeInterpolator) k43.f);
                TransitionManager.beginDelayedTransition(photoViewer.I0, transitionSet);
            }
            photoViewer.p0.u(23);
            photoViewer.Q4 = false;
            ArrayList arrayList4 = photoViewer.X6;
            float f3 = 0.0f;
            long j3 = 0;
            if (arrayList4.isEmpty()) {
                ArrayList arrayList5 = photoViewer.d7;
                if (arrayList5.isEmpty()) {
                    ArrayList arrayList6 = photoViewer.Z6;
                    if (arrayList6.isEmpty()) {
                        ArrayList arrayList7 = photoViewer.f7;
                        if (arrayList7.isEmpty()) {
                            i2 = i;
                            bd8 bd8Var = photoViewer.i7;
                            if (bd8Var != null) {
                                int j4 = bd8Var.j();
                                int i22 = photoViewer.P4;
                                if (i22 < 0 || i22 >= j4) {
                                    return;
                                }
                                photoViewer.p0.u(19);
                                photoViewer.p0.u(20);
                                photoViewer.l2 = !uc7.s1(photoViewer.U).E2(photoViewer.D5) && ((r47Var2 = photoViewer.S4) == null || !r47Var2.y2()) && !photoViewer.M0(photoViewer.i7);
                                TL_iv.PageBlock pageBlock = photoViewer.i7.get(photoViewer.P4);
                                CharSequence i23 = photoViewer.i7.i(photoViewer.P4);
                                boolean a = photoViewer.i7.a(photoViewer.P4);
                                if (a) {
                                    boolean z30 = photoViewer.l2;
                                    s7 s7Var = photoViewer.p0;
                                    if (z30) {
                                        s7Var.R(10);
                                    } else {
                                        s7Var.u(10);
                                    }
                                    photoViewer.p0.m();
                                    boolean z31 = photoViewer.s2;
                                    b8 b8Var = photoViewer.w0;
                                    if (z31) {
                                        photoViewer.R1(b8Var, true, true);
                                    } else {
                                        b8Var.setEnabled(false);
                                        photoViewer.Q1(0.5f, photoViewer.w0, true, true);
                                        photoViewer.I0();
                                    }
                                } else {
                                    photoViewer.p0.u(10);
                                    photoViewer.R1(photoViewer.w0, false, true);
                                }
                                if (photoViewer.j0.getVisibility() != 8) {
                                    photoViewer.j0.setVisibility(8);
                                }
                                photoViewer.j0.setTag(null);
                                cd8 cd8Var = photoViewer.O;
                                if (cd8Var != null) {
                                    cd8Var.d(j4 > 1, true);
                                    photoViewer.O.a(photoViewer.P4 + 1, j4);
                                }
                                if (photoViewer.k2 != null || (!photoViewer.i7.a(i2) && photoViewer.i7.e(i2))) {
                                    i3 = 8;
                                    photoViewer.u0.setVisibility(8);
                                    photoViewer.v0.setVisibility(8);
                                    boolean z32 = photoViewer.l2;
                                    s7 s7Var2 = photoViewer.p0;
                                    if (z32) {
                                        s7Var2.R(12);
                                    } else {
                                        s7Var2.u(12);
                                    }
                                    photoViewer.p0.m();
                                    L0 = ob6.L0(2131753964);
                                } else {
                                    L0 = j4 == 1 ? a ? ob6.L0(2131753926) : ob6.L0(2131753941) : null;
                                    photoViewer.u0.setVisibility(photoViewer.l2 ? 0 : 8);
                                    photoViewer.v0.setVisibility(photoViewer.l2 ? 0 : 8);
                                    photoViewer.p0.u(12);
                                    photoViewer.p0.m();
                                    i3 = 8;
                                }
                                photoViewer.m1.b();
                                photoViewer.i7.h(pageBlock);
                                charSequence = L0;
                                r47Var = null;
                                charSequence2 = i23;
                                z4 = z28;
                            } else {
                                i3 = 8;
                                charSequence = null;
                                photoViewer.p0.u(19);
                                photoViewer.p0.u(20);
                                z4 = z28;
                                r47Var = null;
                                charSequence2 = null;
                            }
                        } else {
                            if (i < 0 || i >= arrayList7.size()) {
                                return;
                            }
                            photoViewer.p0.u(19);
                            photoViewer.p0.u(20);
                            Object obj = arrayList7.get(i);
                            if (obj instanceof TLRPC.BotInlineResult) {
                                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) obj;
                                photoViewer.X4 = botInlineResult;
                                TLRPC.Document document = botInlineResult.document;
                                z16 = document != null ? r47.J4(document) : botInlineResult.content instanceof TLRPC.TL_webDocument ? botInlineResult.type.equals(MediaStreamTrack.VIDEO_TRACK_KIND) : false;
                                arrayList = arrayList7;
                                i2 = i;
                                z14 = z28;
                                z17 = false;
                                z18 = false;
                                z19 = false;
                                charSequence2 = null;
                                fo6Var3 = null;
                                charSequence3 = null;
                            } else {
                                boolean z33 = obj instanceof no6;
                                if (z33) {
                                    no6 no6Var2 = (no6) obj;
                                    photoViewer.d5 = no6Var2.I;
                                    z6 = no6Var2.d();
                                    z7 = no6Var2.b;
                                    long j5 = no6Var2.m;
                                    photoViewer.e5 = j5;
                                    num = 1;
                                    long j6 = no6Var2.P;
                                    i4 = no6Var2.E;
                                    arrayList = arrayList7;
                                    z10 = z33;
                                    j = j5;
                                    z9 = false;
                                    fo6Var = no6Var2.A;
                                    z8 = no6Var2.c();
                                    j2 = j6;
                                } else {
                                    arrayList = arrayList7;
                                    num = 1;
                                    if (obj instanceof ro6) {
                                        ro6 ro6Var = (ro6) obj;
                                        photoViewer.d5 = ro6Var.g();
                                        photoViewer.e5 = 0L;
                                        fo6Var = ro6Var.A;
                                        j3 = 0;
                                        z6 = false;
                                        if (ro6Var.H) {
                                            z7 = false;
                                            z8 = false;
                                            i4 = 0;
                                            z9 = true;
                                            z10 = z33;
                                            j = j3;
                                            j2 = j;
                                        } else {
                                            z7 = false;
                                        }
                                    } else {
                                        z6 = false;
                                        z7 = false;
                                        fo6Var = null;
                                    }
                                    z8 = false;
                                    i4 = 0;
                                    z9 = false;
                                    z10 = z33;
                                    j = j3;
                                    j2 = j;
                                }
                                int i24 = photoViewer.d2;
                                long j7 = j;
                                if (i24 == 11 && z6) {
                                    z12 = false;
                                    z11 = false;
                                } else {
                                    z11 = z6;
                                    z12 = z7;
                                }
                                if (z12) {
                                    boolean z34 = !photoViewer.s1 ? false : z28;
                                    if (i24 != -1) {
                                        photoViewer.s1 = true;
                                    }
                                    if (z10) {
                                        no6 no6Var3 = (no6) obj;
                                        oec oecVar = no6Var3.s;
                                        if (oecVar != null) {
                                            boolean z35 = oecVar.t;
                                            float f4 = oecVar.d;
                                            f2 = oecVar.e;
                                            f3 = f4;
                                            z23 = z35;
                                            i12 = oecVar.f;
                                            str3 = no6Var3.g;
                                        } else {
                                            str3 = null;
                                            i12 = -1;
                                            z23 = false;
                                            f2 = 1.0f;
                                        }
                                        TLRPC.Photo photo4 = no6Var3.e;
                                        String str6 = str3;
                                        r47Var3 = no6Var3.f;
                                        i10 = i12;
                                        str = str6;
                                        z21 = z23;
                                        f = f2;
                                        photo = photo4;
                                    } else {
                                        i10 = -1;
                                        r47Var3 = null;
                                        str = null;
                                        f = 1.0f;
                                        z21 = false;
                                        photo = null;
                                    }
                                    if (i24 != -1) {
                                        r47 r47Var4 = r47Var3;
                                        String str7 = str;
                                        fo6Var2 = fo6Var;
                                        float f5 = f3;
                                        TLRPC.Photo photo5 = photo;
                                        charSequence3 = null;
                                        z13 = z10;
                                        photoViewer.v1(photoViewer.d5, j7, z21, f5, f, i10, j2);
                                        if (photoViewer.i2) {
                                            photoViewer.m2(false, z28);
                                            photoViewer.Y7.setVisibility(8);
                                            photoViewer.a1.setVisibility(8);
                                            photoViewer.a1.setTag(null);
                                            photoViewer.d1.setVisibility(8);
                                            photoViewer.d1.setTag(null);
                                            photoViewer.Z0.setVisibility(8);
                                            photoViewer.Z0.setTag(null);
                                            photoViewer.c1.setVisibility(8);
                                            photoViewer.c1.setTag(null);
                                            photoViewer.b1.setVisibility(8);
                                            photoViewer.b1.setTag(null);
                                            hl.Q3(1.0f, photoViewer.f1, false, z28);
                                            hl.Q3(1.0f, photoViewer.g1, false, z28);
                                            hl.Q3(1.0f, photoViewer.h1, false, z28);
                                            photoViewer.k1.setVisibility(8);
                                        } else {
                                            photoViewer.m2(!z11, z28);
                                            int i25 = photoViewer.d2;
                                            if (i25 == 1 || i25 == 11) {
                                                num2 = num;
                                                i11 = 0;
                                                photoViewer.Y7.setVisibility(0);
                                                photoViewer.a1.setVisibility(8);
                                                photoViewer.a1.setTag(null);
                                                photoViewer.c1.setVisibility(0);
                                                photoViewer.c1.setTag(num2);
                                                photoViewer.b1.setVisibility(0);
                                                photoViewer.b1.setTag(num2);
                                                hl.Q3(1.0f, photoViewer.f1, false, z28);
                                                hl.Q3(1.0f, photoViewer.g1, false, z28);
                                                hl.Q3(1.0f, photoViewer.h1, false, z28);
                                                photoViewer.k1.setVisibility(8);
                                            } else {
                                                photoViewer.Y7.setVisibility(8);
                                                photoViewer.a1.setVisibility(0);
                                                num2 = num;
                                                photoViewer.a1.setTag(num2);
                                                photoViewer.c1.setVisibility(8);
                                                photoViewer.c1.setTag(null);
                                                photoViewer.b1.setVisibility(8);
                                                photoViewer.b1.setTag(null);
                                                hl.Q3(1.0f, photoViewer.f1, (photoViewer.e2 || z11) ? false : true, z28);
                                                hl.Q3(1.0f, photoViewer.g1, !photoViewer.e2 && z11 && ((ed8Var = photoViewer.d) == null || ed8Var.O()), z28);
                                                if (z11) {
                                                    photoViewer.g1.a(!photoViewer.U0(), true);
                                                }
                                                nb8 nb8Var = photoViewer.h1;
                                                if (!photoViewer.e2 && !z11 && (zu1Var = photoViewer.k4) != null) {
                                                    if (!lbc.D(zu1Var.h())) {
                                                        if (xc2.V(photoViewer.k4.e())) {
                                                            if (i4 < 20) {
                                                                photo2 = photo5;
                                                                str2 = str7;
                                                                if (photo2 == null) {
                                                                }
                                                                z22 = true;
                                                                hl.Q3(1.0f, nb8Var, z22, z28);
                                                                nb8 nb8Var2 = photoViewer.h1;
                                                                if (photo2 != null) {
                                                                    nb8Var2.a(photo2, r47Var4);
                                                                } else {
                                                                    nb8Var2.setImage(str2);
                                                                }
                                                                photoViewer.k1.setVisibility((!photoViewer.e2 || photoViewer.f2) ? 8 : 0);
                                                                i11 = 0;
                                                            }
                                                        }
                                                    }
                                                    photo2 = photo5;
                                                    str2 = str7;
                                                    z22 = true;
                                                    hl.Q3(1.0f, nb8Var, z22, z28);
                                                    nb8 nb8Var22 = photoViewer.h1;
                                                    if (photo2 != null) {
                                                    }
                                                    photoViewer.k1.setVisibility((!photoViewer.e2 || photoViewer.f2) ? 8 : 0);
                                                    i11 = 0;
                                                }
                                                photo2 = photo5;
                                                str2 = str7;
                                                z22 = false;
                                                hl.Q3(1.0f, nb8Var, z22, z28);
                                                nb8 nb8Var222 = photoViewer.h1;
                                                if (photo2 != null) {
                                                }
                                                photoViewer.k1.setVisibility((!photoViewer.e2 || photoViewer.f2) ? 8 : 0);
                                                i11 = 0;
                                            }
                                            photoViewer.d1.setVisibility(i11);
                                            photoViewer.d1.setTag(num2);
                                            photoViewer.Z0.setVisibility(i11);
                                            photoViewer.Z0.setTag(num2);
                                        }
                                    } else {
                                        z13 = z10;
                                        fo6Var2 = fo6Var;
                                        charSequence3 = null;
                                    }
                                    if (z11 && z13) {
                                        photoViewer.k1.setVisibility((photoViewer.e2 || photoViewer.f2 || photoViewer.d2 == 10) ? 8 : 0);
                                        photoViewer.k1.setPhotoState(z8);
                                    }
                                    i2 = i;
                                    z14 = z34;
                                    i5 = 1;
                                } else {
                                    z13 = z10;
                                    fo6Var2 = fo6Var;
                                    Integer num3 = num;
                                    charSequence3 = null;
                                    photoViewer.m2(false, z28);
                                    photoViewer.Y7.setVisibility(8);
                                    hl.Q3(1.0f, photoViewer.f1, false, z28);
                                    hl.Q3(1.0f, photoViewer.g1, false, z28);
                                    hl.Q3(1.0f, photoViewer.h1, false, z28);
                                    boolean z36 = photoViewer.s1 ? false : z28;
                                    photoViewer.s1 = false;
                                    if (!z13 || (z15 = (no6Var = (no6) obj).b)) {
                                        i2 = i;
                                        photoViewer.k1.setVisibility(8);
                                    } else {
                                        if (z15 || (i7 = photoViewer.d2) == 11 || i7 == 10) {
                                            i2 = i;
                                        } else {
                                            i2 = i;
                                            if ((photoViewer.O4 == i2 ? photoViewer.k0() : no6Var.s) == null) {
                                                photoViewer.k1.setVisibility((photoViewer.e2 || photoViewer.f2) ? 8 : 0);
                                                photoViewer.k1.setPhotoState(z8);
                                            }
                                        }
                                        photoViewer.k1.setVisibility(8);
                                    }
                                    if (z9 || (i6 = photoViewer.d2) == 10 || photoViewer.i2) {
                                        photoViewer.Z0.setVisibility(8);
                                        photoViewer.Z0.setTag(null);
                                        photoViewer.a1.setVisibility(8);
                                        photoViewer.c1.setVisibility(8);
                                        photoViewer.b1.setVisibility(8);
                                        photoViewer.d1.setVisibility(8);
                                        photoViewer.d1.setTag(null);
                                    } else {
                                        if (i6 == 4 || i6 == 5) {
                                            photoViewer.Z0.setVisibility(8);
                                            photoViewer.Z0.setTag(null);
                                            photoViewer.d1.setVisibility(8);
                                            photoViewer.d1.setTag(null);
                                        } else {
                                            photoViewer.Z0.setVisibility(0);
                                            photoViewer.Z0.setTag(num3);
                                            photoViewer.d1.setVisibility(0);
                                            photoViewer.d1.setTag(num3);
                                        }
                                        photoViewer.a1.setVisibility(photoViewer.d2 != 1 ? 0 : 8);
                                        photoViewer.c1.setVisibility(photoViewer.d2 != 1 ? 8 : 0);
                                        photoViewer.b1.setVisibility(photoViewer.d2 != 1 ? 8 : 0);
                                    }
                                    if (z28) {
                                        photoViewer.G.k();
                                    }
                                    ed8 ed8Var3 = photoViewer.d;
                                    String B = ed8Var3 != null ? ed8Var3.B(photoViewer.P4) : null;
                                    i5 = 1;
                                    photoViewer.N.a(B != null ? B : "", true);
                                    z14 = z36;
                                }
                                if (z13) {
                                    no6 no6Var4 = (no6) obj;
                                    photoViewer.l5 = no6Var4.B == 0 && no6Var4.D == j3 && arrayList.size() == i5;
                                    charSequence2 = photoViewer.u7 ? photoViewer.v7 : no6Var4.a;
                                    i8 = no6Var4.x;
                                    z20 = no6Var4.u;
                                    z18 = no6Var4.v;
                                    z17 = no6Var4.w;
                                } else if (obj instanceof ro6) {
                                    ro6 ro6Var2 = (ro6) obj;
                                    charSequence2 = ro6Var2.I;
                                    i8 = ro6Var2.x;
                                    z20 = ro6Var2.u;
                                    z18 = ro6Var2.v;
                                    z17 = ro6Var2.w;
                                } else {
                                    charSequence2 = charSequence3;
                                    z16 = z12;
                                    fo6Var3 = fo6Var2;
                                    z17 = false;
                                    z18 = false;
                                    z19 = false;
                                    i21 = 0;
                                }
                                i21 = i8;
                                z19 = z20;
                                z16 = z12;
                                fo6Var3 = fo6Var2;
                            }
                            if (photoViewer.j0.getVisibility() != 8) {
                                photoViewer.j0.setVisibility(8);
                            }
                            photoViewer.j0.setTag(charSequence3);
                            cd8 cd8Var2 = photoViewer.O;
                            if (cd8Var2 != null) {
                                cd8Var2.d(false, z28);
                            }
                            CharSequence L03 = photoViewer.l5 ? z16 ? ob6.L0(2131753926) : ob6.L0(2131753941) : charSequence3;
                            zu1 zu1Var2 = photoViewer.k4;
                            if (zu1Var2 != null) {
                                z24 = z14;
                                if (zu1Var2.g4 == 3) {
                                    long f7 = zu1Var2.f7();
                                    zu1 zu1Var3 = photoViewer.k4;
                                    if (f7 >= j3) {
                                        h = zu1Var3.getMessagesController().X1(Long.valueOf(f7));
                                        e = null;
                                    } else {
                                        e = zu1Var3.getMessagesController().M0(Long.valueOf(-f7));
                                        h = null;
                                    }
                                } else {
                                    h = zu1Var2.h();
                                    e = photoViewer.k4.e();
                                }
                                if (e != null) {
                                    L03 = e.title;
                                } else if (lbc.D(h)) {
                                    L03 = ob6.L0(photoViewer.k4.g4 == 3 ? 2131748057 : 2131745629);
                                } else {
                                    L03 = lbc.u(h) ? ob6.L0(2131754245) : lbc.r(h);
                                }
                            } else {
                                z24 = z14;
                            }
                            if (L03 == null && (ed8Var2 = photoViewer.d) != null) {
                                L03 = ed8Var2.d0(photoViewer.P4);
                            }
                            int i26 = photoViewer.d2;
                            if (i26 == 0 || i26 == 4 || ((i26 == 2 || i26 == 5) && arrayList.size() > 1)) {
                                photoViewer.O0.a(photoViewer.d.w(photoViewer.P4));
                            }
                            photoViewer.E2(obj);
                            PorterDuffColorFilter porterDuffColorFilter2 = new PorterDuffColorFilter(photoViewer.y0(aob.qg), PorterDuff.Mode.MULTIPLY);
                            photoViewer.V1.setIsVideo(z16);
                            photoViewer.V1.setTimer(i21);
                            photoViewer.W1.setIsVideo(z16);
                            photoViewer.W1.setTimer(i21);
                            photoViewer.Z0.setColorFilter(z18 ? porterDuffColorFilter2 : null);
                            photoViewer.a1.setColorFilter(z17 ? porterDuffColorFilter2 : null);
                            photoViewer.d1.setColorFilter(z19 ? porterDuffColorFilter2 : null);
                            boolean z37 = photoViewer.l5;
                            ImageView imageView = photoViewer.b1;
                            if (z37) {
                                if (fo6Var3 != null) {
                                    boolean z38 = photoViewer.s1;
                                    boolean z39 = fo6Var3.l;
                                    if (!z38 ? z39 : !z39) {
                                        porterDuffColorFilter = porterDuffColorFilter2;
                                        imageView.setColorFilter(porterDuffColorFilter);
                                    }
                                }
                                porterDuffColorFilter = null;
                                imageView.setColorFilter(porterDuffColorFilter);
                            } else {
                                imageView.setColorFilter((fo6Var3 == null || !fo6Var3.l) ? null : porterDuffColorFilter2);
                            }
                            ImageView imageView2 = photoViewer.c1;
                            if (fo6Var3 == null || fo6Var3.k == 0) {
                                porterDuffColorFilter2 = null;
                            }
                            imageView2.setColorFilter(porterDuffColorFilter2);
                            photoViewer.Q4 = photoViewer.j2 && ((i13 = photoViewer.d2) == 0 || i13 == 2 || i13 == -1);
                            charSequence = L03;
                            z4 = z24;
                            r47Var = null;
                            i3 = 8;
                        }
                        z5 = false;
                    } else {
                        if (i < 0 || i >= arrayList6.size()) {
                            return;
                        }
                        photoViewer.p0.u(19);
                        photoViewer.p0.u(20);
                        if (!photoViewer.z5 || photoViewer.e7.isEmpty()) {
                            photoViewer.p0.u(15);
                            photoViewer.p0.u(14);
                            photoViewer.p0.u(7);
                        } else {
                            photoViewer.p0.R(15);
                            boolean L04 = photoViewer.L0();
                            s7 s7Var3 = photoViewer.p0;
                            if (L04) {
                                s7Var3.u(14);
                            } else {
                                s7Var3.R(14);
                            }
                            if (photoViewer.y5 <= 0) {
                                TLRPC.Chat M0 = uc7.s1(photoViewer.U).M0(Long.valueOf(-photoViewer.y5));
                                if (!photoViewer.L0() && !r47.r(photoViewer.U, false, (TLRPC.Message) photoViewer.c7.get(i), M0)) {
                                    photoViewer.p0.u(7);
                                }
                            }
                            photoViewer.p0.R(7);
                        }
                        long j8 = photoViewer.y5;
                        if (j8 != 0) {
                            str4 = wf3.k(yac.t0, j8);
                            jn5 jn5Var = (jn5) arrayList6.get(i);
                            if (jn5Var == null || (photo3 = jn5Var.l) == null) {
                                photoViewer.N.a("", z28);
                            } else {
                                photoViewer.N.a(ob6.x(photo3.date, true), z28);
                            }
                            photoViewer.p0.R(23);
                        } else {
                            str4 = null;
                        }
                        dc7 dc7Var = photoViewer.r2;
                        if (dc7Var != null) {
                            dc7Var.b(i, z29);
                        }
                        cd8 cd8Var3 = photoViewer.O;
                        if (cd8Var3 != null) {
                            cd8Var3.d(arrayList6.size() > 1, true);
                            photoViewer.O.a(photoViewer.P4 + 1, arrayList6.size());
                        }
                        String str8 = photoViewer.e4;
                        if (str8 != null) {
                            str4 = str8;
                        } else if (photoViewer.A5) {
                            str4 = ob6.L0(2131753941);
                        }
                        boolean z40 = photoViewer.y5 != 0 && uc7.s1(photoViewer.U).E2(photoViewer.y5);
                        b8 b8Var2 = photoViewer.u0;
                        if (z40) {
                            b8Var2.setVisibility(8);
                            photoViewer.v0.setVisibility(8);
                        } else {
                            b8Var2.setVisibility(0);
                            photoViewer.v0.setVisibility(0);
                        }
                        photoViewer.l2 = !z40;
                        photoViewer.p0.R(9);
                        photoViewer.p0.m();
                        photoViewer.m1.b();
                        photoViewer.Q4 = photoViewer.j2 && ((i14 = photoViewer.d2) == 0 || i14 == 2 || i14 == -1);
                        i2 = i;
                        charSequence = str4;
                        z4 = z28;
                        z5 = false;
                        r47Var = null;
                        charSequence2 = null;
                    }
                } else {
                    photoViewer.l2 = false;
                    photoViewer.p0.R(7);
                    photoViewer.u0.setVisibility(8);
                    photoViewer.v0.setVisibility(8);
                    photoViewer.p0.u(19);
                    photoViewer.p0.u(20);
                    cd8 cd8Var4 = photoViewer.O;
                    if (cd8Var4 != null) {
                        cd8Var4.d(arrayList5.size() > 1, true);
                        photoViewer.O.a(photoViewer.P4 + 1, arrayList5.size());
                    }
                    photoViewer.N.c("");
                    photoViewer.N.a("", z28);
                    r47Var = null;
                    charSequence = null;
                    z4 = z28;
                    z5 = false;
                    i3 = 8;
                    i2 = i;
                    charSequence2 = null;
                }
                boolean z41 = (!photoViewer.Q4 && photoViewer.p2 == null) || photoViewer.d2 == 11;
                photoViewer.R4 = z41;
                photoViewer.G.setBackgroundColor((photoViewer.f2 && !z41 && photoViewer.p2 == null) ? 2130706432 : 0);
                photoViewer.o();
                photoViewer.N.b(photoViewer.R4);
                View view = photoViewer.k0;
                if (photoViewer.R4 || photoViewer.d2 == 11) {
                    i3 = 0;
                }
                view.setVisibility(i3);
                if (photoViewer.t4 == 0) {
                    View view2 = photoViewer.k0;
                    boolean z42 = photoViewer.R4;
                    int i27 = photoViewer.d2;
                    view2.setBackgroundColor(z42 ? i27 == 11 ? 1711276032 : 0 : i27 == 11 ? -16777216 : 2130706432);
                }
                if (charSequence != null) {
                    dd8 dd8Var = photoViewer.N;
                    if (z28) {
                        if (i20 == i2) {
                            dd8Var.d(charSequence, true, true);
                        } else {
                            dd8Var.d(charSequence, false, i20 > i2);
                        }
                    } else {
                        dd8Var.c(charSequence);
                    }
                }
                photoViewer.J1(r47Var, charSequence2, z5, z4);
            }
            int i28 = photoViewer.P4;
            if (i28 < 0 || i28 >= arrayList4.size()) {
                return;
            }
            r47 r47Var5 = (r47) arrayList4.get(photoViewer.P4);
            r47Var5.f6(false);
            boolean D3 = r47Var5.D3();
            boolean G4 = r47Var5.G4();
            CharSequence b = yg4.b(r47Var5, photoViewer.P5 && !photoViewer.Q5);
            if (r47Var5.Z3() || r47Var5.q4() || (message3 = r47Var5.k) == null) {
                arrayList2 = arrayList4;
                str5 = null;
            } else {
                arrayList2 = arrayList4;
                str5 = ob6.s(message3.date, false);
            }
            photoViewer.N.a(str5, z28);
            boolean z310 = r47Var5.z3();
            boolean z43 = uc7.s1(photoViewer.U).E2(r47Var5.A0()) || ((message2 = r47Var5.k) != null && message2.noforwards) || r47Var5.y2();
            if (!G4 || D3) {
                photoViewer.j0.setVisibility(8);
                photoViewer.j0.setTag(null);
            } else {
                photoViewer.j0.setVisibility(0);
                photoViewer.j0.setTag(1);
            }
            if (z310) {
                z4 = z2;
                photoViewer.R1(photoViewer.E0, false, z4);
                photoViewer.R1(photoViewer.D0, false, z4);
                photoViewer.p0.u(7);
                photoViewer.p0.u(10);
                E1 = r47.n1(r47Var5.k).description;
                photoViewer.l2 = false;
                photoViewer.p0.u(19);
                photoViewer.p0.u(20);
                z5 = false;
                arrayList3 = arrayList2;
            } else {
                z4 = z2;
                a5c a5cVar2 = uc7.s1(photoViewer.U).i4;
                if (i20 != photoViewer.P4) {
                    photoViewer.m5 = false;
                    photoViewer.n5 = null;
                }
                if (a5cVar2.r()) {
                    a5cVar = a5cVar2;
                    photoViewer = this;
                    a5cVar.j(r47Var5, new zo2((Object) this, i, (Object) a5cVar, (Object) r47Var5, (byte) 5));
                } else {
                    a5cVar = a5cVar2;
                }
                if (a5cVar.r() && a5cVar.a(r47Var5, photoViewer.n5)) {
                    boolean z44 = photoViewer.m5;
                    s7 s7Var4 = photoViewer.p0;
                    if (z44) {
                        s7Var4.R(20);
                        photoViewer.p0.u(19);
                    } else {
                        s7Var4.R(19);
                        photoViewer.p0.u(20);
                    }
                } else {
                    photoViewer.p0.u(19);
                    photoViewer.p0.u(20);
                }
                photoViewer.l2 = !z43;
                if (r47Var5.L3() && photoViewer.l2 && !wf3.B(r47Var5.A0())) {
                    photoViewer.p0.R(12);
                }
                zu1 zu1Var4 = photoViewer.k4;
                if (r47Var5.s(null, zu1Var4 != null && zu1Var4.X7()) && photoViewer.w == 0) {
                    photoViewer.p0.R(7);
                } else {
                    photoViewer.p0.u(7);
                }
                photoViewer.p0.m();
                boolean z45 = !D3 && (r47Var5.F0() == null || r47Var5.x() || r47Var5.t1().startsWith("video/")) && !photoViewer.s4 && (((i15 = r47Var5.k.ttl) == 0 || i15 >= 3600) && !z43 && photoViewer.j() && !photoViewer.P5);
                if (photoViewer.s4) {
                    photoViewer.p0.R(10);
                    photoViewer.R1(photoViewer.D0, false, false);
                    photoViewer.R1(photoViewer.w0, true, false);
                    arrayList3 = arrayList2;
                } else if (!G4 || D3) {
                    arrayList3 = arrayList2;
                    photoViewer.s0.setVisibility(8);
                    photoViewer.q0.setVisibility(8);
                    photoViewer.A0.setVisibility(8);
                    photoViewer.p0.u(10);
                    photoViewer.p0.m();
                    boolean z46 = photoViewer.w0.getVisibility() == 0;
                    boolean z47 = r47Var5.o2() && !wf3.B(r47Var5.A0());
                    if (z46) {
                        photoViewer.R1(photoViewer.w0, false, (z47 || z45) ? false : true);
                    }
                    photoViewer.R1(photoViewer.D0, z45, (!z4 || z46 || z47) ? false : true);
                    photoViewer.R1(photoViewer.E0, z47, !z46);
                } else {
                    if (z43) {
                        if (photoViewer.w != 0) {
                            arrayList3 = arrayList2;
                            if (r47.n1(((r47) arrayList3.get(0)).k).webpage != null) {
                            }
                        } else if (r47.n1(r47Var5.k).webpage == null || r47.n1(r47Var5.k).webpage.url == null) {
                            arrayList3 = arrayList2;
                        }
                        photoViewer.p0.u(10);
                        z25 = photoViewer.E0.getVisibility() != 0;
                        if (z25) {
                            photoViewer.R1(photoViewer.E0, false, false);
                        }
                        if (z43) {
                            boolean z48 = photoViewer.s2;
                            b8 b8Var3 = photoViewer.w0;
                            if (z48) {
                                photoViewer.R1(b8Var3, true, !z25 && photoViewer.D0.getAlpha() <= 0.0f);
                            } else {
                                b8Var3.setEnabled(false);
                                photoViewer.Q1(0.5f, photoViewer.w0, true, !z25 && photoViewer.D0.getAlpha() <= 0.0f);
                                photoViewer.I0();
                            }
                        } else {
                            photoViewer.R1(photoViewer.w0, false, true);
                        }
                        photoViewer.R1(photoViewer.D0, false, false);
                        if (r47Var5.o2() || wf3.B(r47Var5.A0())) {
                            photoViewer.p0.u(13);
                        } else {
                            photoViewer.p0.R(13);
                        }
                        photoViewer.p0.m();
                    }
                    arrayList3 = arrayList2;
                    photoViewer.p0.R(10);
                    if (photoViewer.E0.getVisibility() != 0) {
                    }
                    if (z25) {
                    }
                    if (z43) {
                    }
                    photoViewer.R1(photoViewer.D0, false, false);
                    if (r47Var5.o2()) {
                    }
                    photoViewer.p0.u(13);
                    photoViewer.p0.m();
                }
                E1 = uc7.s1(r47Var5.K1).E1(r47Var5.k.restriction_reason);
                if (TextUtils.isEmpty(E1)) {
                    if (!photoViewer.m5 || (message = r47Var5.k) == null || message.translatedText == null || !TextUtils.equals(message.translatedToLanguage, r3c.H0())) {
                        E1 = r47Var5.z;
                        z5 = photoViewer.m5;
                    } else {
                        E1 = s1(r47Var5);
                    }
                }
                z5 = false;
            }
            if (photoViewer.k2 != null) {
                photoViewer.u0.setVisibility(8);
                photoViewer.v0.setVisibility(8);
                photoViewer.p0.u(9);
                photoViewer.R1(photoViewer.D0, false, z4);
                zu1 zu1Var5 = photoViewer.k4;
                if (!r47Var5.s(null, zu1Var5 != null && zu1Var5.X7())) {
                    photoViewer.p0.u(7);
                }
                photoViewer.l2 = !z43;
            }
            if (r47Var5.q4()) {
                cd8 cd8Var5 = photoViewer.O;
                if (cd8Var5 != null) {
                    cd8Var5.d(false, z4);
                }
            } else {
                zu1 zu1Var6 = photoViewer.k4;
                if (zu1Var6 != null && zu1Var6.g4 == 5) {
                    cd8 cd8Var6 = photoViewer.O;
                    if (cd8Var6 != null) {
                        cd8Var6.d(false, z4);
                    }
                } else if (photoViewer.G5 && (photoViewer.E5 != null || !TextUtils.isEmpty(photoViewer.F5))) {
                    cd8 cd8Var7 = photoViewer.O;
                    if (cd8Var7 != null) {
                        cd8Var7.d(true, z4);
                        photoViewer.O.a(photoViewer.P4 + 1, arrayList3.size());
                    }
                } else if (photoViewer.I5 + photoViewer.K5 == 0 || photoViewer.M5) {
                    if (photoViewer.w == 0 && (r47.n1(r47Var5.k) instanceof TLRPC.TL_messageMediaWebPage)) {
                        cd8 cd8Var8 = photoViewer.O;
                        if (cd8Var8 != null) {
                            cd8Var8.d(false, z4);
                        }
                        L02 = photoViewer.s4 ? "YouTube" : r47Var5.x() ? ob6.L0(2131753968) : r47Var5.D3() ? ob6.L0(2131753955) : r47Var5.G4() ? ob6.L0(2131753926) : r47Var5.q3() ? ob6.L0(2131753964) : ob6.L0(2131753941);
                    } else if (z310) {
                        cd8 cd8Var9 = photoViewer.O;
                        if (cd8Var9 != null) {
                            cd8Var9.d(false, z4);
                        }
                        L02 = r47.n1(r47Var5.k).title;
                    } else if (r47Var5.G4()) {
                        cd8 cd8Var10 = photoViewer.O;
                        if (cd8Var10 != null) {
                            cd8Var10.d(false, z4);
                        }
                        L02 = ob6.L0(2131753926);
                    } else if (r47Var5.q3()) {
                        cd8 cd8Var11 = photoViewer.O;
                        if (cd8Var11 != null) {
                            cd8Var11.d(false, z4);
                        }
                        L02 = ob6.L0(2131753964);
                    } else if (r47Var5.F0() != null) {
                        cd8 cd8Var12 = photoViewer.O;
                        if (cd8Var12 != null) {
                            cd8Var12.d(false, z4);
                        }
                        L02 = ob6.L0(2131753968);
                    }
                    charSequence4 = L02;
                    if ((wf3.B(photoViewer.D5) && !photoViewer.s4) || z43) {
                        photoViewer.R1(photoViewer.C0, false, false);
                    }
                    if (!photoViewer.s4 || (((i19 = r47Var5.k.ttl) != 0 && i19 < 3600) || z43)) {
                        photoViewer.l2 = false;
                        photoViewer.u0.setVisibility(8);
                        photoViewer.v0.setVisibility(8);
                        photoViewer.p0.u(9);
                        photoViewer.R1(photoViewer.D0, false, z4);
                    } else {
                        photoViewer.l2 = true;
                        photoViewer.u0.setVisibility(0);
                        photoViewer.v0.setVisibility(0);
                        photoViewer.p0.R(9);
                    }
                    photoViewer.m1.b();
                    charSequence = charSequence4;
                    z28 = z4;
                    i2 = i;
                    charSequence2 = E1;
                    r47Var = r47Var5;
                } else {
                    boolean z49 = photoViewer.P5;
                    boolean[] zArr = photoViewer.O5;
                    if (z49) {
                        if (arrayList3.size() + photoViewer.J5 < photoViewer.I5 + photoViewer.K5 && !photoViewer.N5 && photoViewer.P4 > arrayList3.size() - 5) {
                            if (arrayList3.isEmpty()) {
                                e1 = 0;
                                i17 = 1;
                            } else {
                                i17 = 1;
                                e1 = ((r47) c00.g(1, arrayList3)).e1();
                            }
                            if (!zArr[0] || photoViewer.H5 == 0) {
                                i18 = e1;
                                z27 = false;
                            } else {
                                i18 = (arrayList3.isEmpty() || ((r47) c00.g(i17, arrayList3)).A0() == photoViewer.H5) ? e1 : 0;
                                z27 = true;
                            }
                            if (!photoViewer.d.a0()) {
                                ls6.d0(photoViewer.U).P0(!z27 ? photoViewer.D5 : photoViewer.H5, 40, i18, 0, photoViewer.B5, photoViewer.C5, 1, photoViewer.c, 0, photoViewer.E5, null);
                                photoViewer.N5 = true;
                            }
                        }
                        if (photoViewer.J5 > 0 && photoViewer.P4 < 5 && !arrayList3.isEmpty()) {
                            int e12 = ((r47) arrayList3.get(0)).e1();
                            if (!photoViewer.d.a0()) {
                                ls6.d0(photoViewer.U).P0(photoViewer.D5, 40, 0, e12, photoViewer.B5, photoViewer.C5, 1, photoViewer.c, 0, photoViewer.E5, null);
                                photoViewer.N5 = true;
                            }
                        }
                        cd8 cd8Var13 = photoViewer.O;
                        if (cd8Var13 != null) {
                            cd8Var13.d(photoViewer.Q5, z4);
                            cd8 cd8Var14 = photoViewer.O;
                            int i29 = photoViewer.I5 + photoViewer.K5;
                            cd8Var14.a(i29 - (photoViewer.J5 + photoViewer.P4), i29);
                        }
                    } else {
                        if (arrayList3.size() >= photoViewer.I5 + photoViewer.K5 || photoViewer.N5 || photoViewer.P4 >= 5) {
                            r15 = 1;
                        } else {
                            int e13 = arrayList3.isEmpty() ? 0 : ((r47) arrayList3.get(0)).e1();
                            if (!zArr[0] || photoViewer.H5 == 0) {
                                i16 = e13;
                                z26 = false;
                            } else {
                                i16 = (arrayList3.isEmpty() || ((r47) arrayList3.get(0)).A0() == photoViewer.H5) ? e13 : 0;
                                z26 = true;
                            }
                            ls6.d0(photoViewer.U).P0(!z26 ? photoViewer.D5 : photoViewer.H5, 80, i16, 0, photoViewer.B5, photoViewer.C5, 1, photoViewer.c, 0, photoViewer.E5, null);
                            r15 = 1;
                            photoViewer.N5 = true;
                        }
                        ?? r6 = photoViewer.O;
                        if (r6 != 0) {
                            r6.d(r15, z4);
                            photoViewer.O.a(((photoViewer.I5 + photoViewer.K5) - arrayList3.size()) + photoViewer.P4 + r15, photoViewer.I5 + photoViewer.K5);
                        }
                    }
                }
            }
            charSequence4 = b;
            if (wf3.B(photoViewer.D5)) {
                photoViewer.R1(photoViewer.C0, false, false);
                if (photoViewer.s4) {
                }
                photoViewer.l2 = false;
                photoViewer.u0.setVisibility(8);
                photoViewer.v0.setVisibility(8);
                photoViewer.p0.u(9);
                photoViewer.R1(photoViewer.D0, false, z4);
                photoViewer.m1.b();
                charSequence = charSequence4;
                z28 = z4;
                i2 = i;
                charSequence2 = E1;
                r47Var = r47Var5;
            }
            photoViewer.R1(photoViewer.C0, false, false);
            if (photoViewer.s4) {
            }
            photoViewer.l2 = false;
            photoViewer.u0.setVisibility(8);
            photoViewer.v0.setVisibility(8);
            photoViewer.p0.u(9);
            photoViewer.R1(photoViewer.D0, false, z4);
            photoViewer.m1.b();
            charSequence = charSequence4;
            z28 = z4;
            i2 = i;
            charSequence2 = E1;
            r47Var = r47Var5;
            i3 = 8;
            if (photoViewer.Q4) {
            }
            photoViewer.R4 = z41;
            photoViewer.G.setBackgroundColor((photoViewer.f2 && !z41 && photoViewer.p2 == null) ? 2130706432 : 0);
            photoViewer.o();
            photoViewer.N.b(photoViewer.R4);
            View view3 = photoViewer.k0;
            if (photoViewer.R4) {
            }
            i3 = 0;
            view3.setVisibility(i3);
            if (photoViewer.t4 == 0) {
            }
            if (charSequence != null) {
            }
            photoViewer.J1(r47Var, charSequence2, z5, z4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void P2() {
        boolean z;
        boolean z2;
        float f;
        float f2;
        int i;
        if (this.G == null) {
            return;
        }
        ArrayList arrayList = null;
        if (this.e8 == 0) {
            this.N.a(null, true);
            return;
        }
        if (!this.I4) {
            this.k1.a(Math.min(this.j8, this.k8), this.p8 && this.e8 > 1, this.r);
        }
        this.I0.requestLayout();
        this.y8 = (long) Math.ceil((this.X7.getRightProgress() - this.X7.getLeftProgress()) * this.n8);
        this.t8 = this.X7.getLeftProgress();
        this.u8 = this.X7.getRightProgress();
        int i2 = this.g8;
        int i3 = (i2 == 90 || i2 == 270) ? this.k8 : this.j8;
        int i4 = this.g8;
        int i5 = (i4 == 90 || i4 == 270) ? this.j8 : this.k8;
        xc8 xc8Var = this.W4;
        if (xc8Var.b != null) {
            ArrayList arrayList2 = xc8Var.f;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                arrayList = this.W4.f;
            }
        } else {
            ArrayList arrayList3 = xc8Var.e;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                arrayList = this.W4.e;
            }
        }
        xc8 xc8Var2 = this.W4;
        String str = xc8Var2.b;
        if (str == null) {
            str = xc8Var2.a;
        }
        if (this.q8 && this.t8 == 0.0f && this.g8 == 0 && this.j8 == this.h8 && this.k8 == this.i8) {
            xc8 xc8Var3 = this.W4;
            if (xc8Var3.c == null && arrayList == null && str == null && xc8Var3.d == null && this.d2 != 1) {
                z = false;
                z2 = this.r;
                int i6 = this.d2;
                if (z2) {
                    boolean z3 = i6 == 1;
                    if (z) {
                        long j = (long) ((this.y8 / this.n8) * ((z3 ? 0L : this.v8) + this.w8));
                        this.x8 = j + ((j / 32768) << 4);
                    } else {
                        float f3 = this.z8;
                        float f4 = this.y8 / this.n8;
                        long j2 = (long) (f3 * f4);
                        this.x8 = j2;
                        if (z3) {
                            this.x8 = j2 - ((long) (f4 * this.v8));
                        }
                    }
                } else {
                    if (i6 == 1) {
                        long j3 = this.y8;
                        i = j3 <= 2000 ? 2600000 : j3 <= 5000 ? 2200000 : 1560000;
                    } else {
                        i = 921600;
                    }
                    long j4 = (long) ((this.y8 / 1000.0f) * (i / 8));
                    this.x8 = j4 + ((j4 / 32768) << 4);
                }
                f = this.t8;
                if (f != 0.0f) {
                    this.r8 = -1L;
                } else {
                    this.r8 = ((long) (f * this.n8)) * 1000;
                }
                f2 = this.u8;
                if (f2 != 1.0f) {
                    this.s8 = -1L;
                } else {
                    this.s8 = ((long) (f2 * this.n8)) * 1000;
                }
                this.I8 = qd4.y(String.format("%dx%d", Integer.valueOf(i3), Integer.valueOf(i5)), ", ", qd4.y(hl.g0((int) (this.y8 / 1000), false, false), ", ~", hl.i0(this.x8, false, false)));
                this.G.k();
                if (this.e4 != null) {
                    this.N.a(this.r ? ob6.M0(2131745007, "SoundMuted") : this.I8, true);
                    return;
                }
                return;
            }
        }
        z = true;
        z2 = this.r;
        int i62 = this.d2;
        if (z2) {
        }
        f = this.t8;
        if (f != 0.0f) {
        }
        f2 = this.u8;
        if (f2 != 1.0f) {
        }
        this.I8 = qd4.y(String.format("%dx%d", Integer.valueOf(i3), Integer.valueOf(i5)), ", ", qd4.y(hl.g0((int) (this.y8 / 1000), false, false), ", ~", hl.i0(this.x8, false, false)));
        this.G.k();
        if (this.e4 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Q(Canvas canvas, float f, float f2) {
        boolean z;
        boolean z2;
        nc8 nc8Var;
        k3b k3bVar;
        ad8 ad8Var;
        h3b[] h3bVarArr;
        boolean z3;
        boolean z4;
        float f3;
        h3b[] h3bVarArr2;
        boolean z5;
        float f4;
        int width;
        int height;
        float f5;
        h3b[] h3bVarArr3;
        boolean z6;
        boolean z7 = true;
        if (!this.f7.isEmpty()) {
            if (this.t4 == 1 || this.d2 == 1) {
                z = this.E1.h;
            } else {
                fo6 fo6Var = this.W4.c;
                if (fo6Var != null && fo6Var.l) {
                    z = true;
                }
            }
            float f6 = 1.0f;
            if (z) {
                z2 = false;
            } else {
                canvas.save();
                canvas.scale(-1.0f, 1.0f);
                z2 = true;
            }
            float f7 = 0.0f;
            float f8 = 4.0f;
            float f10 = 2.0f;
            if (f > 0.0f) {
                if (!z2) {
                    canvas.save();
                    z2 = true;
                }
                canvas.scale(1.0f - (f * 2.0f), 1.0f);
                canvas.skew(0.0f, qd4.z(1.0f, f, f * 4.0f, 0.25f));
            }
            nc8Var = this.g0;
            if (nc8Var != null || nc8Var.n.getVisibility() == 0) {
                if (!this.K4) {
                    Matrix matrix = this.L4;
                    ImageReceiver imageReceiver = this.B4;
                    matrix.preTranslate(imageReceiver.L0, imageReceiver.M0);
                }
                this.o5.g(canvas, false, this.f0, this.n6 == -1);
                this.B4.setAlpha(f2);
                this.B4.h(canvas, null);
                this.o5.g(canvas, true, this.f0, this.n6 == -1);
                k3bVar = this.o5;
                ImageReceiver imageReceiver2 = this.B4;
                Matrix matrix2 = this.L4;
                ad8Var = this.f0;
                mm mmVar = k3bVar.b;
                mmVar.a = ad8Var;
                if ((k3bVar.O == null || mmVar.c > 0.0f) && ad8Var != null) {
                    k3bVar.g0 = imageReceiver2.N0;
                    k3bVar.h0 = imageReceiver2.O0;
                    k3bVar.f0.set(matrix2);
                    float f11 = (k3bVar.R + k3bVar.S) % 1.0f;
                    float d = k3bVar.b.d(k3bVar.O == null);
                    canvas.drawColor(aob.p1(d, 1342177280));
                    h3bVarArr = k3bVar.I;
                    if (h3bVarArr != null) {
                        int length = h3bVarArr.length;
                        int i = 0;
                        while (i < length) {
                            float f12 = f8;
                            h3b h3bVar = h3bVarArr[i];
                            if (h3bVar == null) {
                                h3bVarArr2 = h3bVarArr;
                                z5 = z2;
                                f4 = f6;
                                f3 = f10;
                            } else {
                                f3 = f10;
                                h3bVar.a.a = ad8Var;
                                if (h3bVar.t.J == null || d <= f7) {
                                    h3bVarArr2 = h3bVarArr;
                                    z5 = z2;
                                    f4 = f6;
                                } else {
                                    float f13 = f7;
                                    boolean z8 = z7;
                                    float R1 = hl.R1(f6, 1.05f, h3bVar.a.d(h3bVar.b)) * hl.R1(f6, 1.065f, d);
                                    int i2 = (h3bVar.c / 90) % 2;
                                    Bitmap bitmap = h3bVar.t.J;
                                    if (i2 != 0) {
                                        width = bitmap.getHeight();
                                        height = h3bVar.t.J.getWidth();
                                    } else {
                                        width = bitmap.getWidth();
                                        height = h3bVar.t.J.getHeight();
                                    }
                                    canvas.save();
                                    float f14 = f6;
                                    float f15 = width;
                                    float centerX = h3bVar.i.centerX() / f15;
                                    float f16 = h3bVar.j;
                                    float f17 = (centerX * f16) - (f16 / f3);
                                    float f18 = height;
                                    float centerY = h3bVar.i.centerY() / f18;
                                    float f19 = h3bVar.k;
                                    canvas.scale(R1, R1, f17, (centerY * f19) - (f19 / f3));
                                    if (h3bVar.o != null) {
                                        float f20 = h3bVar.n;
                                        int i3 = (int) (f11 * f20);
                                        int min = Math.min(500, (int) (f20 * 0.6f)) + i3;
                                        f5 = 0.6f;
                                        if (h3bVar.n > 0) {
                                            while (i3 <= min) {
                                                float f21 = f14 - ((min - i3) / h3bVar.n);
                                                if (f21 > f13) {
                                                    h3bVar.s.setAlpha((int) (f21 * 10.2f * d));
                                                    h3bVarArr3 = h3bVarArr;
                                                    z6 = z2;
                                                    canvas.drawPoints(h3bVar.o, (i3 % h3bVar.n) << 1, 2, h3bVar.s);
                                                } else {
                                                    h3bVarArr3 = h3bVarArr;
                                                    z6 = z2;
                                                }
                                                i3++;
                                                h3bVarArr = h3bVarArr3;
                                                z2 = z6;
                                            }
                                        }
                                        h3bVarArr2 = h3bVarArr;
                                        z5 = z2;
                                    } else {
                                        h3bVarArr2 = h3bVarArr;
                                        z5 = z2;
                                        f5 = 0.6f;
                                    }
                                    if (h3bVar.b() != null) {
                                        canvas.save();
                                        canvas.rotate(h3bVar.c);
                                        canvas.scale((f14 / f15) * h3bVar.j, (f14 / f18) * h3bVar.k);
                                        canvas.drawBitmap(h3bVar.b(), (-h3bVar.t.J.getWidth()) / f3, (-h3bVar.t.J.getHeight()) / f3, (Paint) null);
                                        canvas.restore();
                                    }
                                    float f22 = 255.0f;
                                    if (h3bVar.o != null) {
                                        float f23 = h3bVar.n;
                                        int i4 = (int) (f11 * f23);
                                        int min2 = Math.min(500, (int) (f23 * f5)) + i4;
                                        if (h3bVar.n > 0) {
                                            int i5 = i4;
                                            while (i5 <= min2) {
                                                float f24 = (i5 - i4) / (min2 - i4);
                                                h3bVar.r.setAlpha((int) (Math.min(f14, Math.min(f24, f14 - f24) * f12) * f22 * d));
                                                canvas.drawPoints(h3bVar.o, (i5 % h3bVar.n) << 1, 2, h3bVar.r);
                                                i5++;
                                                f22 = f22;
                                                f14 = 1.0f;
                                            }
                                        }
                                        f7 = f13;
                                        f4 = 1.0f;
                                    } else {
                                        h3bVar.t.n.setPath(h3bVar.l, false);
                                        h3bVar.m.reset();
                                        float length2 = h3bVar.t.n.getLength();
                                        if (length2 == f13) {
                                            f7 = f13;
                                            f4 = 1.0f;
                                        } else {
                                            h3bVar.t.h.setAlpha((int) (d * 255.0f));
                                            h3bVar.t.f.setAlpha((int) (64.0f * d));
                                            canvas.drawPath(h3bVar.m, h3bVar.t.f);
                                            float f25 = 0.2f + f11;
                                            h3bVar.t.n.getSegment(length2 * f11, length2 * f25, h3bVar.m, z8);
                                            canvas.drawPath(h3bVar.m, h3bVar.t.h);
                                            canvas.drawPath(h3bVar.m, h3bVar.t.h);
                                            f4 = 1.0f;
                                            if (f25 > 1.0f) {
                                                h3bVar.m.reset();
                                                h3bVar.t.n.setPath(h3bVar.l, false);
                                                f7 = f13;
                                                h3bVar.t.n.getSegment(f7, (f25 - 1.0f) * length2, h3bVar.m, true);
                                                canvas.drawPath(h3bVar.m, h3bVar.t.h);
                                                canvas.drawPath(h3bVar.m, h3bVar.t.h);
                                            } else {
                                                f7 = f13;
                                            }
                                        }
                                    }
                                    canvas.restore();
                                }
                            }
                            i++;
                            f8 = f12;
                            f10 = f3;
                            f6 = f4;
                            h3bVarArr = h3bVarArr2;
                            z2 = z5;
                            z7 = true;
                        }
                    }
                    z3 = z2;
                    ad8Var.invalidate();
                    z4 = true;
                } else {
                    z3 = z2;
                    z4 = true;
                }
                this.K4 = z4;
            } else {
                z3 = z2;
            }
            if (z3) {
                return;
            }
            canvas.restore();
            return;
        }
        z = false;
        float f62 = 1.0f;
        if (z) {
        }
        float f72 = 0.0f;
        float f82 = 4.0f;
        float f102 = 2.0f;
        if (f > 0.0f) {
        }
        nc8Var = this.g0;
        if (nc8Var != null) {
        }
        if (!this.K4) {
        }
        this.o5.g(canvas, false, this.f0, this.n6 == -1);
        this.B4.setAlpha(f2);
        this.B4.h(canvas, null);
        this.o5.g(canvas, true, this.f0, this.n6 == -1);
        k3bVar = this.o5;
        ImageReceiver imageReceiver22 = this.B4;
        Matrix matrix22 = this.L4;
        ad8Var = this.f0;
        mm mmVar2 = k3bVar.b;
        mmVar2.a = ad8Var;
        if (k3bVar.O == null) {
        }
        k3bVar.g0 = imageReceiver22.N0;
        k3bVar.h0 = imageReceiver22.O0;
        k3bVar.f0.set(matrix22);
        float f112 = (k3bVar.R + k3bVar.S) % 1.0f;
        float d2 = k3bVar.b.d(k3bVar.O == null);
        canvas.drawColor(aob.p1(d2, 1342177280));
        h3bVarArr = k3bVar.I;
        if (h3bVarArr != null) {
        }
        z3 = z2;
        ad8Var.invalidate();
        z4 = true;
        this.K4 = z4;
        if (z3) {
        }
    }

    public final void Q1(float f, View view, boolean z, boolean z2) {
        HashMap hashMap = this.L0;
        Boolean bool = (Boolean) hashMap.get(view);
        if (bool == null || bool.booleanValue() != z) {
            hashMap.put(view, Boolean.valueOf(z));
            view.animate().cancel();
            float f2 = (z ? 1.0f : 0.0f) * f;
            if (!z2 || bool == null) {
                view.setVisibility(z ? 0 : 8);
                view.setAlpha(f2);
                D2();
            } else {
                if (z) {
                    view.setVisibility(0);
                }
                view.animate().alpha(f2).setDuration(100L).setUpdateListener(new w98(this, (byte) 4)).setInterpolator(new LinearInterpolator()).withEndAction(new yn6((Object) this, z, (Object) view, (byte) 12)).start();
            }
        }
    }

    public final void Q2() {
        int[] iArr = this.m3;
        Arrays.fill(iArr, 0);
        int[] iArr2 = this.n3;
        Arrays.fill(iArr2, 0);
        kfc kfcVar = this.G2;
        if (kfcVar != null) {
            long max = Math.max(0L, kfcVar.S());
            long max2 = Math.max(0L, this.G2.U());
            if (!this.G8 && this.W7.getVisibility() == 0) {
                max2 = (long) ((this.X7.getRightProgress() - this.X7.getLeftProgress()) * max2);
                max = (long) (max - (this.X7.getLeftProgress() * max2));
                if (max > max2) {
                    max = max2;
                }
            }
            long j = max / 1000;
            long j2 = max2 / 1000;
            iArr[0] = (int) (j / 60);
            iArr[1] = (int) (j % 60);
            iArr2[0] = (int) (j2 / 60);
            iArr2[1] = (int) (j2 % 60);
        } else {
            nc8 nc8Var = this.g0;
            if (nc8Var != null && nc8Var.y) {
                long max3 = Math.max(0, nc8Var.getCurrentPosition());
                long max4 = Math.max(0, this.g0.getVideoDuration());
                if (!this.G8 && this.W7.getVisibility() == 0) {
                    max4 = (long) ((this.X7.getRightProgress() - this.X7.getLeftProgress()) * max4);
                    max3 = (long) (max3 - (this.X7.getLeftProgress() * max4));
                    if (max3 > max4) {
                        max3 = max4;
                    }
                }
                long j3 = max3 / 1000;
                long j4 = max4 / 1000;
                iArr[0] = (int) (j3 / 60);
                iArr[1] = (int) (j3 % 60);
                iArr2[0] = (int) (j4 / 60);
                iArr2[1] = (int) (j4 % 60);
            }
        }
        int i = iArr[0];
        String X = i >= 60 ? X(i / 60, i % 60, iArr[1]) : W(i, iArr[1]);
        int i2 = iArr2[0];
        String X2 = i2 >= 60 ? X(i2 / 60, i2 % 60, iArr2[1]) : W(i2, iArr2[1]);
        this.o3.l(X + " / " + X2, false);
        if (Objects.equals(this.j3, X2)) {
            return;
        }
        this.j3 = X2;
        this.i3.requestLayout();
    }

    public final void R(Canvas canvas) {
        float d;
        if (this.R4) {
            if (xea.Z) {
                byte b = this.m4;
                d = this.J8.d(b == 0 || b == 2 || b == 3);
            } else {
                d = 1.0f;
            }
            if (d <= 0.0f) {
                return;
            }
            int currentActionBarHeight = org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + ((int) (hl.m * 1.5f));
            int height = this.Q0.getHeight() + hl.n + (this.V1.getVisibility() == 0 ? hl.L(20.0f) + (this.V1.getEditTextHeightClosedKeyboard() / 2) : 0);
            if (this.L7 == null) {
                this.L7 = new Path();
                Paint paint = new Paint(1);
                this.M7 = paint;
                PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
                paint.setXfermode(new PorterDuffXfermode(mode));
                Paint paint2 = new Paint(1);
                this.N7 = paint2;
                paint2.setXfermode(new PorterDuffXfermode(mode));
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                this.O7 = new LinearGradient(0.0f, 0.0f, 0.0f, 16.0f, new int[]{-16777216, 0}, new float[]{0.0f, 1.0f}, tileMode);
                this.P7 = new LinearGradient(0.0f, 0.0f, 0.0f, 16.0f, new int[]{0, -16777216}, new float[]{0.0f, 1.0f}, tileMode);
                this.Q7 = new Matrix();
                this.R7 = new Matrix();
                this.M7.setShader(this.O7);
                this.N7.setShader(this.P7);
            }
            canvas.saveLayerAlpha(0.0f, 0.0f, this.f0.getWidth(), this.f0.getHeight() + hl.n, (int) (d * (this.M0.getAlpha() - 127) * 2.007874f), 31);
            this.L7.rewind();
            Path path = this.L7;
            float width = this.f0.getWidth();
            float f = currentActionBarHeight;
            Path.Direction direction = Path.Direction.CW;
            path.addRect(0.0f, 0.0f, width, f, direction);
            this.L7.addRect(0.0f, (this.f0.getHeight() + hl.n) - height, this.f0.getWidth(), this.f0.getHeight() + hl.n, direction);
            canvas.clipPath(this.L7);
            canvas.drawColor(-16777216);
            P(canvas, this.d0, 0, 0, true, true, false);
            canvas.save();
            this.Q7.reset();
            this.Q7.postScale(1.0f, f / 16.0f);
            this.O7.setLocalMatrix(this.Q7);
            this.M7.setAlpha(jn7.l3);
            canvas.drawRect(0.0f, 0.0f, this.f0.getWidth(), f, this.M7);
            this.R7.reset();
            this.R7.postScale(1.0f, height / 16.0f);
            this.R7.postTranslate(0.0f, (this.f0.getHeight() - height) + hl.n);
            this.P7.setLocalMatrix(this.R7);
            this.N7.setAlpha(jn7.Q2);
            canvas.drawRect(0.0f, (this.f0.getHeight() + hl.n) - height, this.f0.getWidth(), this.f0.getHeight() + hl.n, this.N7);
            canvas.restore();
            canvas.restore();
        }
    }

    public final void R1(View view, boolean z, boolean z2) {
        Q1(1.0f, view, z, z2);
    }

    public final void R2() {
        sfc sfcVar = this.q3;
        int L = (hl.L(2.0f) + ((sfc.S / 2) + (sfcVar.f ? sfcVar.d : sfcVar.b))) - (this.s3.getMeasuredWidth() / 2);
        int L2 = hl.L(10.0f);
        int measuredWidth = (this.i3.getMeasuredWidth() - hl.L(10.0f)) - (this.s3.getMeasuredWidth() / 2);
        zb8 zb8Var = this.s3;
        if (L < L2) {
            zb8Var.setPivotX(Utilities.i((zb8Var.getMeasuredWidth() / 2.0f) - (L2 - L), this.s3.getMeasuredWidth(), 0.0f));
            L = L2;
        } else if (L >= measuredWidth) {
            zb8Var.setPivotX(Utilities.i((zb8Var.getMeasuredWidth() / 2.0f) + (L - measuredWidth), this.s3.getMeasuredWidth(), 0.0f));
            L = measuredWidth;
        } else {
            zb8Var.setPivotX(zb8Var.getMeasuredWidth() / 2.0f);
        }
        this.s3.setTranslationX(L);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void S(float f, float f2, float f3, float f4, Canvas canvas) {
        float f5;
        float f6;
        float alpha;
        boolean z;
        lb8[] lb8VarArr;
        cz9 cz9Var;
        ImageView[] imageViewArr;
        mb8 mb8Var;
        kfc kfcVar;
        boolean z2 = true;
        boolean z3 = !this.s1 || (((mb8Var = this.X7) == null || !mb8Var.r) && ((this.d2 != 1 || this.H2) && !(((kfcVar = this.G2) != null && kfcVar.c0()) || this.n6 == 5 || this.t4 == 5)));
        if (this.I4 && (U0() || this.S4 != null)) {
            z3 = false;
        }
        if (this.Y0.getVisibility() != 0 && this.x == null) {
            z2 = false;
        }
        if (z3) {
            if (!this.Q6) {
                float f7 = -f;
                float f8 = this.E6;
                if (f7 > f8) {
                    f5 = f8 + f;
                    f6 = f2 == 1.0f ? f3 : 0.0f;
                    alpha = !z2 ? (1.0f - this.Y0.getAlpha()) * f4 : f4;
                    z = this.B3;
                    lb8VarArr = this.X0;
                    if (!z) {
                        alpha *= this.G.getAlpha();
                    } else if (lb8VarArr[0].h == 4) {
                        f6 += (1.0f - this.G.getAlpha()) * hl.N(8.0f);
                    }
                    cz9Var = this.B1;
                    if (cz9Var != null || !cz9Var.a()) {
                        canvas.save();
                        canvas.translate(f5, f6);
                        lb8 lb8Var = lb8VarArr[0];
                        lb8Var.o = 1.0f;
                        lb8Var.e(0, alpha, false);
                        lb8VarArr[0].c(canvas);
                        if (this.K && this.z3) {
                            imageViewArr = this.y3;
                            if (imageViewArr[0].getTag() == null) {
                                ImageView imageView = imageViewArr[0];
                                imageView.setAlpha(Math.min(imageView.getAlpha(), f4));
                            }
                        }
                        canvas.restore();
                    }
                }
            }
            f5 = 0.0f;
            if (f2 == 1.0f) {
            }
            if (!z2) {
            }
            z = this.B3;
            lb8VarArr = this.X0;
            if (!z) {
            }
            cz9Var = this.B1;
            if (cz9Var != null) {
            }
            canvas.save();
            canvas.translate(f5, f6);
            lb8 lb8Var2 = lb8VarArr[0];
            lb8Var2.o = 1.0f;
            lb8Var2.e(0, alpha, false);
            lb8VarArr[0].c(canvas);
            if (this.K) {
                imageViewArr = this.y3;
                if (imageViewArr[0].getTag() == null) {
                }
            }
            canvas.restore();
        }
        if (!z2 || this.B3) {
            return;
        }
        canvas.save();
        canvas.translate(this.Y0.getLeft() + f, (f3 / f2) + this.Y0.getTop());
        this.Y0.draw(canvas);
        canvas.restore();
    }

    public final void S1(boolean z, boolean z2) {
        if (this.s0.getVisibility() != 0) {
            this.x0.f.t("", z, true);
        } else {
            float abs = Math.abs(this.u1 - 1.0f);
            eh2 eh2Var = this.x0;
            if (abs < 0.001f) {
                eh2Var.f.t("", z, true);
            } else {
                eh2Var.f.t(zoa.a(this.u1).concat("x"), z, true);
            }
        }
        this.s0.e(z, this.u1);
        oob oobVar = this.J0;
        float f = this.u1;
        b8[] b8VarArr = (b8[]) oobVar.b;
        for (int i = 0; i < b8VarArr.length; i++) {
            if (!z2 || ((i != 0 || Math.abs(f - 0.2f) >= 0.01f) && ((i != 1 || Math.abs(f - 0.5f) >= 0.1f) && ((i != 2 || Math.abs(f - 1.0f) >= 0.1f) && ((i != 3 || Math.abs(f - 1.5f) >= 0.1f) && (i != 4 || Math.abs(f - 2.0f) >= 0.1f)))))) {
                b8VarArr[i].d(-328966, -328966);
            } else {
                b8VarArr[i].d(-9718023, -9718023);
            }
        }
    }

    public final void S2() {
        int s;
        if (this.e8 > 0) {
            if (this.d8 >= this.e8) {
                this.d8 = this.e8 - 1;
            }
            if (this.d2 == 1) {
                float max = Math.max(800.0f / this.h8, 800.0f / this.i8);
                this.j8 = Math.round((this.h8 * max) / 2.0f) << 1;
                this.k8 = Math.round((this.i8 * max) / 2.0f) << 1;
            } else {
                Size h = h();
                this.j8 = h.getWidth();
                this.k8 = h.getHeight();
            }
            if (this.l8 != 0) {
                if (this.d2 == 1) {
                    this.l8 = 1560000;
                    s = this.l8;
                } else if (this.j8 == this.h8 && this.k8 == this.i8) {
                    this.l8 = this.m8;
                    s = MediaController.s(this.j8, this.k8, this.l8, false);
                } else {
                    this.l8 = MediaController.T(this.i8, this.h8, this.m8, this.k8, this.j8);
                    s = MediaController.s(this.j8, this.k8, this.l8, false);
                }
                this.w8 = (long) (((s / 8) * this.n8) / 1000.0f);
            }
        }
    }

    public final boolean T0() {
        return this.I4 && U0() && this.d2 != 1;
    }

    public final void T1(Activity activity, org.telegram.ui.ActionBar.e eVar, vnb vnbVar) {
        boolean z;
        e26 e26Var = this.r7;
        if (e26Var != null) {
            e26Var.a();
            this.r7 = null;
        }
        this.r7 = LaunchActivity.c0();
        Activity parentActivity = activity != null ? activity : eVar.getParentActivity();
        byte b = 0;
        aob.J(parentActivity, false);
        this.w2 = vnbVar;
        this.l4 = eVar;
        int i = yac.t0;
        this.U = i;
        this.B4.d = i;
        this.A4.d = i;
        this.C4.d = i;
        pb8 pb8Var = this.V1;
        if (pb8Var != null) {
            pb8Var.setAccount(i);
            this.V1.f.k(false);
        }
        qb8 qb8Var = this.W1;
        if (qb8Var != null) {
            qb8Var.setAccount(this.U);
            this.W1.f.k(false);
        }
        k3b k3bVar = this.o5;
        if (k3bVar != null) {
            k3bVar.setCurrentAccount(this.U);
        }
        if (this.E == parentActivity || parentActivity == null) {
            G2();
            return;
        }
        this.s = parentActivity instanceof BubbleActivity;
        this.E = parentActivity;
        this.F = new ContextThemeWrapper(this.E, R.style.Theme_TMessages);
        this.z1 = ViewConfiguration.get(this.E).getScaledTouchSlop();
        byte b2 = 3;
        byte b3 = 1;
        if (d9 == null) {
            d9 = new Drawable[]{this.E.getDrawable(R.drawable.circle_big), this.E.getDrawable(R.drawable.cancel_big), this.E.getDrawable(R.drawable.load_big)};
        }
        this.U6 = new Scroller(parentActivity);
        z zVar = new z(this, parentActivity);
        this.h0 = zVar;
        zVar.setBackground(this.M0);
        this.h0.setFocusable(false);
        ClippingImageView clippingImageView = new ClippingImageView(parentActivity);
        this.i0 = clippingImageView;
        clippingImageView.O = this.j4;
        clippingImageView.L = false;
        clippingImageView.N = false;
        this.h0.addView(clippingImageView, tre.c(40.0f, 40));
        ad8 ad8Var = new ad8(this, parentActivity, parentActivity);
        this.f0 = ad8Var;
        ad8Var.setFocusable(false);
        VideoFramesRewinder videoFramesRewinder = this.b4;
        if (videoFramesRewinder != null) {
            videoFramesRewinder.setParentView(this.f0);
        }
        this.f0.setClipChildren(true);
        this.f0.setClipToPadding(true);
        this.h0.setClipChildren(false);
        this.h0.setClipToPadding(false);
        tl0 tl0Var = new tl0(this.f0);
        this.c0 = tl0Var;
        tl0Var.a = true;
        this.Y = new wa8(this);
        this.b0 = new r89();
        this.a0 = new r89();
        wa8 wa8Var = this.Y;
        ll0 ll0Var = new ll0(wa8Var, wa8Var, wa8Var);
        this.Z = ll0Var;
        ll0Var.e(new yic(this.f0), this.f0);
        this.Z.g = this.b0;
        this.d0 = new xl0(this.c0, this.f0);
        this.h0.addView(this.f0, tre.e(-1, -1, 51));
        ad8 ad8Var2 = this.f0;
        fa8 fa8Var = new fa8(this);
        WeakHashMap weakHashMap = ihc.a;
        ahc.i(ad8Var2, fa8Var);
        this.f0.setSystemUiVisibility(1792);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.e0 = layoutParams;
        layoutParams.height = -1;
        layoutParams.format = -3;
        layoutParams.width = -1;
        layoutParams.gravity = 51;
        layoutParams.type = 99;
        hl.m(layoutParams);
        this.e0.flags = -2147286784;
        qx7 qx7Var = new qx7(this.E);
        this.x4 = qx7Var;
        qx7Var.setVideoPosition(new fa8(this));
        this.f0.addView(this.x4, tre.c(-2.0f, -2));
        qx7 qx7Var2 = new qx7(this.E);
        this.y4 = qx7Var2;
        this.f0.addView(qx7Var2, tre.c(-2.0f, -2));
        qx7 qx7Var3 = new qx7(this.E);
        this.z4 = qx7Var3;
        this.f0.addView(qx7Var3, tre.c(-2.0f, -2));
        y10 y10Var = new y10(b2, parentActivity, this);
        this.G = y10Var;
        y10Var.setOverlayTitleAnimation(true);
        this.G.setTitleColor(-1);
        this.G.setSubtitleColor(-1);
        this.G.setBackgroundColor(2130706432);
        this.G.setOccupyStatusBar(!this.s);
        this.G.G(1090519039, false);
        this.G.H(-1, false);
        this.G.setBackButtonImage(R.drawable.ic_ab_back);
        ImageView backButton = this.G.getBackButton();
        this.H = backButton;
        this.I = backButton.getBackground();
        this.J = null;
        dd8 dd8Var = new dd8(parentActivity);
        this.N = dd8Var;
        this.G.addView(dd8Var, tre.e(-1, -1, jn7.D1));
        this.f0.addView(this.G, tre.c(-2.0f, -1));
        cd8 cd8Var = new cd8(parentActivity);
        this.O = cd8Var;
        this.f0.addView(cd8Var, tre.e(-1, -2, 55));
        this.G.setActionBarMenuOnItemClick(new gb8(this, vnbVar));
        s6 u = this.G.u();
        this.B0 = u;
        u.setOnLayoutListener(new y98(this, (byte) 19));
        s7 a = this.B0.a(26, R.drawable.menu_delete_old);
        this.F0 = a;
        a.setContentDescription(ob6.L0(2131751563));
        iye.a(this.F0);
        R1(this.F0, false, false);
        s7 a2 = this.B0.a(11, R.drawable.msg_mask);
        this.E0 = a2;
        a2.setContentDescription(ob6.L0(2131748433));
        s7 a3 = this.B0.a(18, R.drawable.msg_header_draw);
        this.D0 = a3;
        a3.setContentDescription(ob6.L0(2131754805));
        byte b4 = 4;
        s7 a4 = this.B0.a(4, R.drawable.msg_header_share);
        this.C0 = a4;
        a4.setContentDescription(ob6.L0(2131750547));
        s6 s6Var = this.B0;
        eh2 eh2Var = new eh2(this.F, R.drawable.video_settings, new x53());
        this.x0 = eh2Var;
        s7 d = s6Var.d(1, eh2Var);
        this.q0 = d;
        this.x0.setCallback(d.getIconView());
        this.q0.getPopupLayout().setSwipeBackForegroundColor(-14540254);
        this.q0.getPopupLayout().c = true;
        this.q0.getPopupLayout().setFitItems(true);
        this.q0.setMenuXOffset(hl.L(3.0f));
        w7 w7Var = new w7(this.F, vnbVar);
        this.s0 = w7Var;
        byte b5 = 5;
        w7Var.setStops(new float[]{0.5f, 1.0f, 1.5f, 2.0f, 2.5f});
        this.s0.setMinimumWidth(hl.L(196.0f));
        this.s0.setDrawShadow(false);
        this.s0.setBackgroundColor(-14540254);
        this.s0.setTextColor(-1);
        this.s0.setLabel(ob6.L0(2131743239));
        this.s0.setOnValueChange(new ga8(this, (byte) 1));
        this.q0.getPopupLayout().a(this.s0, tre.o(-1, 44));
        k8 a5 = this.q0.a(-1);
        this.A0 = a5;
        a5.setColor(-15198184);
        ActionBarPopupWindow$ActionBarPopupWindowLayout popupLayout = this.q0.getPopupLayout();
        oob oobVar = new oob(this.F, new fa8(this));
        this.J0 = oobVar;
        popupLayout.addView(oobVar);
        LinearLayout linearLayout = new LinearLayout(this.F);
        this.y0 = linearLayout;
        linearLayout.setOrientation(1);
        this.q0.getPopupLayout().addView(this.y0);
        b8 e = this.q0.e(22, R.drawable.menu_video_loop, ob6.L0(2131743240));
        this.t0 = e;
        e.setSelectorColor(268435455);
        p10 p10Var = new p10(this, this.F, b3);
        this.H0 = p10Var;
        try {
            p10Var.setRouteSelector(id1.c(this.F).a());
            z = true;
        } catch (Exception e2) {
            cc4.f(e2);
            z = false;
        }
        this.H0.setVisibility(4);
        if (z) {
            b8 e3 = this.q0.e(24, R.drawable.menu_video_chromecast, ob6.L0(2131743244));
            this.G0 = e3;
            e3.f(false);
            this.G0.setSelectorColor(268435455);
            this.G0.addView(this.H0, 0, tre.c(-1.0f, -1));
        }
        this.q0.I(-115203550);
        byte b6 = 9;
        this.q0.setOnMenuDismiss(new ea8(this, b6));
        s7 a6 = this.B0.a(0, R.drawable.media_more);
        this.p0 = a6;
        a6.setContentDescription(ob6.L0(2131754834));
        this.p0.setOnClickListener(new ma8(this, b4));
        this.p0.setOnMenuDismiss(new ea8(this, (byte) 10));
        this.p0.getPopupLayout().setSwipeBackForegroundColor(-14540254);
        this.p0.getPopupLayout().c = true;
        this.p0.getPopupLayout().setFitItems(true);
        this.K0 = new dh2(this.F, this.p0.getPopupLayout().getSwipeBack(), new fa8(this));
        b8 i2 = this.p0.i(R.drawable.msg_gallery, null, ob6.L0(2131745657), this.K0.a);
        i2.d(-328966, -328966);
        this.u0 = i2;
        i2.setOnClickListener(new ma8(this, b5));
        k8 a7 = this.p0.a(-1);
        this.v0 = a7;
        a7.setColor(-15198184);
        this.p0.e(10, R.drawable.msg_openin, ob6.L0(2131747523)).d(-328966, -328966);
        b8 e4 = this.p0.e(6, R.drawable.menu_video_pip, ob6.L0(2131746949));
        e4.d(-328966, -328966);
        this.w0 = e4;
        v86 v86Var = new v86(false);
        this.p7 = v86Var;
        b8 f = this.p0.f(v86Var, ob6.L0(2131743243), jn7.J1, true, 0);
        this.o7 = f;
        f.d(-328966, -328966);
        this.o7.setItemHeight(56);
        this.o7.setSelectorColor(268435455);
        this.o7.setRightIcon(R.drawable.msg_settings);
        this.o7.setSubtext(ob6.L0(2131743242));
        this.o7.getRightIcon().setBackground(aob.e0(536870911, 1));
        int i3 = (ob6.a0 ? 3 : 5) | 16;
        ImageView rightIcon = this.o7.getRightIcon();
        boolean z2 = ob6.a0;
        rightIcon.setLayoutParams(tre.d(40, 40.0f, i3, z2 ? 4.0f : 0.0f, 0.0f, z2 ? 0.0f : 4.0f, 0.0f));
        View view = new View(this.F);
        view.setBackgroundColor(536870911);
        boolean z3 = ob6.a0;
        FrameLayout.LayoutParams d2 = tre.d(-1, 28.0f, i3, z3 ? 52.0f : 0.0f, 0.0f, z3 ? 0.0f : 52.0f, 0.0f);
        d2.width = 1;
        view.setLayoutParams(d2);
        this.o7.addView(view);
        View[] viewArr = {this.o7.getTextView(), this.o7.getSubtextView()};
        int i4 = 0;
        for (int i5 = 2; i4 < i5; i5 = 2) {
            View view2 = viewArr[i4];
            if (view2 != null) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) view2.getLayoutParams();
                layoutParams2.leftMargin = ob6.a0 ? hl.L(60.0f) : 0;
                layoutParams2.rightMargin = ob6.a0 ? 0 : hl.L(60.0f);
                view2.setLayoutParams(layoutParams2);
            }
            i4++;
        }
        this.o7.getRightIcon().setContentDescription(ob6.L0(2131744940));
        byte b7 = 7;
        this.o7.getRightIcon().setOnClickListener(new ma8(this, b7));
        this.p0.u(jn7.J1);
        b8 e5 = this.p0.e(3, R.drawable.msg_media, ob6.L0(2131745075));
        this.r0 = e5;
        e5.d(-328966, -328966);
        this.p0.e(12, R.drawable.msg_gif, ob6.L0(2131745658)).d(-328966, -328966);
        this.p0.e(5, R.drawable.msg_message, ob6.L0(2131745070)).d(-328966, -328966);
        this.p0.e(25, R.drawable.msg_sticker, ob6.L0(2131751669)).d(-328966, -328966);
        this.p0.e(21, R.drawable.menu_reply, ob6.L0(2131745990)).d(-328966, -328966);
        this.p0.e(23, R.drawable.msg_report, ob6.L0(2131745939)).d(-328966, -328966);
        this.p0.e(9, R.drawable.msg_shareout, ob6.L0(2131745187)).d(-328966, -328966);
        this.p0.e(13, R.drawable.msg_sticker, ob6.L0(2131745056)).d(-328966, -328966);
        this.p0.e(14, R.drawable.msg_openprofile, ob6.L0(2131745270)).d(-328966, -328966);
        this.p0.e(19, R.drawable.msg_translate, ob6.L0(2131743611)).d(-328966, -328966);
        this.p0.e(20, R.drawable.msg_translate, ob6.L0(2131749058)).d(-328966, -328966);
        this.p0.e(7, R.drawable.msg_delete, ob6.L0(2131751563)).d(-328966, -328966);
        byte b8 = 8;
        this.p0.e(8, R.drawable.msg_cancel, ob6.L0(2131744496)).d(-328966, -328966);
        this.p0.I(-115203550);
        this.p0.u(19);
        this.p0.u(20);
        S1(false, true);
        this.p0.setPopupItemsSelectorColor(268435455);
        this.p0.setSubMenuDelegate(new hb8(this));
        b6 b6Var = new b6(this.F, (byte) 24);
        this.j0 = b6Var;
        b6Var.setBackgroundColor(2130706432);
        this.f0.addView(this.j0, tre.e(-1, 48, 83));
        View view3 = new View(this.F);
        this.k0 = view3;
        view3.setBackgroundColor(this.d2 == 11 ? -16777216 : 2130706432);
        this.h0.addView(this.k0, tre.a(-1.0f, this.l0 / hl.p, 87));
        this.w1[0] = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{838860800, 0});
        this.w1[0].setShape(0);
        this.w1[1] = new GradientDrawable(GradientDrawable.Orientation.RIGHT_LEFT, new int[]{838860800, 0});
        this.w1[1].setShape(0);
        wd5 wd5Var = new wd5(this.F, hl.L(10.0f));
        this.m1 = wd5Var;
        this.f0.addView(wd5Var, tre.e(-1, 68, 83));
        this.m1.setDelegate(new jb8(this));
        for (int i6 = 0; i6 < 3; i6++) {
            this.y3[i6] = new ImageView(this.E);
            this.y3[i6].setImageResource(R.drawable.msg_maxvideo);
            this.y3[i6].setContentDescription(ob6.M0(2131754713, "AccSwitchToFullscreen"));
            this.y3[i6].setScaleType(ImageView.ScaleType.CENTER);
            this.y3[i6].setBackground(aob.f0(1090519039, 1, -1));
            this.y3[i6].setVisibility(4);
            this.y3[i6].setAlpha(1.0f);
            this.f0.addView(this.y3[i6], tre.c(48.0f, 48));
            this.y3[i6].setOnClickListener(new ma8(this, b8));
        }
        this.R = new kb8(null, new x53(), b);
        wc8 wc8Var = new wc8(this.f0.getContext());
        this.R1 = wc8Var;
        byte b9 = 3;
        wc8Var.setFactory(new qk3(this, b9));
        this.R1.setVisibility(4);
        H1(true);
        int i7 = 0;
        while (i7 < b9) {
            this.X0[i7] = new lb8(this, this.f0);
            this.X0[i7].d(0, false, true);
            i7++;
            b9 = 3;
        }
        ei1 ei1Var = new ei1(this, this.F, vnbVar);
        this.Y0 = ei1Var;
        ei1Var.setUseSelfAlpha(true);
        this.Y0.setProgressColor(-1);
        this.Y0.setSize(hl.L(54.0f));
        this.Y0.setBackgroundResource(R.drawable.circle_big);
        this.Y0.setVisibility(4);
        this.Y0.setAlpha(0.0f);
        this.f0.addView(this.Y0, tre.e(64, 64, 17));
        G();
        RadialProgressView radialProgressView = new RadialProgressView(this.E, vnbVar);
        this.V7 = radialProgressView;
        radialProgressView.setProgressColor(-1);
        this.V7.setBackgroundResource(R.drawable.circle_big);
        this.V7.setVisibility(4);
        this.f0.addView(this.V7, tre.e(54, 54, 17));
        pa2 pa2Var = new pa2(this.E, (byte) 3);
        this.U7 = pa2Var;
        pa2Var.setBackgroundColor(2130706432);
        this.U7.b();
        this.U7.setTranslationY(hl.L(120.0f));
        ((TextView) this.U7.b).setText(ob6.M0(2131751319, "Done").toUpperCase());
        TextView textView = (TextView) this.U7.b;
        int i8 = aob.qg;
        yob.X(textView, i8, vnbVar);
        this.f0.addView(this.U7, tre.e(-1, 48, 83));
        ((TextView) this.U7.d).setOnClickListener(new z98(this, (byte) 2));
        ((TextView) this.U7.b).setOnClickListener(new z98(this, (byte) 3));
        rec recVar = new rec(false);
        this.A1 = recVar;
        recVar.n = new v34(this, (byte) 24);
        ad8 ad8Var3 = this.f0;
        Objects.requireNonNull(ad8Var3);
        this.B1 = new cz9(new x38(ad8Var3, b6), false);
        gd8 gd8Var = new gd8(this.E, this);
        this.T7 = gd8Var;
        gd8Var.setTranslationY(hl.L(120.0f));
        this.T7.setVisibility(4);
        this.T7.setBackgroundColor(2130706432);
        this.f0.addView(this.T7, tre.d(-1, 70.0f, 83, 0.0f, 0.0f, 0.0f, 48.0f));
        new Paint().setColor(2130706432);
        jo0 jo0Var = new jo0(this, this.F);
        this.Q0 = jo0Var;
        this.f0.addView(jo0Var, tre.e(-1, -2, 83));
        TextView textView2 = new TextView(this.f0.getContext());
        this.m0 = textView2;
        textView2.setTextSize(1, 15.0f);
        this.m0.setTypeface(hl.o());
        this.m0.setSingleLine(true);
        this.m0.setMaxLines(1);
        TextView textView3 = this.m0;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView3.setEllipsize(truncateAt);
        this.m0.setTextColor(-1);
        this.m0.setGravity(3);
        this.Q0.addView(this.m0, tre.d(-1, -2.0f, 51, 20.0f, 23.0f, 84.0f, 0.0f));
        TextView textView4 = new TextView(this.f0.getContext());
        this.n0 = textView4;
        textView4.setTextSize(1, 14.0f);
        this.n0.setSingleLine(true);
        this.n0.setMaxLines(1);
        this.n0.setEllipsize(truncateAt);
        this.n0.setTextColor(-1);
        this.n0.setGravity(3);
        this.Q0.addView(this.n0, tre.d(-1, -2.0f, 51, 20.0f, 46.0f, 84.0f, 0.0f));
        TextView textView5 = new TextView(this.f0.getContext());
        this.o0 = textView5;
        int i10 = aob.Fi;
        yob.R(textView5, rnb.e(y0(i10), 6.0f), yob.M(i10), yob.e(i10), vnbVar);
        TextView textView6 = this.o0;
        int i11 = aob.Ji;
        yob.X(textView6, i11, vnbVar);
        this.o0.setEllipsize(truncateAt);
        this.o0.setGravity(17);
        this.o0.setLines(1);
        this.o0.setSingleLine(true);
        this.o0.setText(ob6.M0(2131745269, "SetAsMyPhoto"));
        this.o0.setTextSize(1, 15.0f);
        this.o0.setTypeface(hl.o());
        this.o0.setOnClickListener(new z98(this, b7));
        this.o0.setVisibility(8);
        this.Q0.addView(this.o0, tre.d(-1, 48.0f, 51, 20.0f, 0.0f, 20.0f, 64.0f));
        mb8 mb8Var = new mb8(this.E, this);
        this.X7 = mb8Var;
        mb8Var.setDelegate(new vy0(this));
        FrameLayout frameLayout = new FrameLayout(this.E);
        this.W7 = frameLayout;
        frameLayout.setClipChildren(false);
        this.W7.addView(this.X7, tre.e(-1, 54, 83));
        m2(false, false);
        this.f0.addView(this.W7, tre.d(-1, 54.0f, 83, 0.0f, 8.0f, 0.0f, 0.0f));
        s7 s7Var = this.F0;
        if (s7Var != null) {
            jl0 a8 = this.Z.a(s7Var);
            a8.p(dtd.i(vnbVar));
            a8.r(hl.L(20.0f));
            a8.q(hl.L(7.0f));
            s7Var.setBackground(uk0.d(a8, hl.L(54.0f), hl.L(54.0f)));
        }
        nb8 nb8Var = new nb8(this.E, ob6.L0(2131751173));
        this.h1 = nb8Var;
        jl0 a9 = this.Z.a(nb8Var);
        a9.p(dtd.i(vnbVar));
        nb8Var.setBlurredBackgroundDrawable(a9);
        iye.a(this.h1);
        this.h1.setOnClickListener(new z98(this, b8));
        this.f0.addView(this.h1, tre.d(-1, 32.0f, 87, 60.0f, 0.0f, 60.0f, 0.0f));
        ld8 ld8Var = new ld8(this.E, vnbVar, this.c0);
        this.p5 = ld8Var;
        kt3 kt3Var = ld8Var.c;
        jl0 a10 = this.Z.a(kt3Var);
        a10.p(dtd.i(vnbVar));
        kt3Var.setBlurredBackgroundDrawable(a10);
        iye.a(this.p5.c);
        this.p5.setVisibility(8);
        this.p5.setAlpha(0.0f);
        this.p5.setOnClose(new y98(this, (byte) 13));
        this.f0.addView(this.p5, tre.e(-1, -1, jn7.D1));
        this.p5.b.setOnClickListener(new z98(this, (byte) 10));
        this.p5.setOnGalleryImage(new ea8(this, (byte) 4));
        d7 d7Var = new d7((byte) 3, this.E, this);
        this.f1 = d7Var;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        d7Var.setScaleType(scaleType);
        d7 d7Var2 = this.f1;
        pb2 pb2Var = new pb2(this.E);
        this.e1 = pb2Var;
        d7Var2.setImageDrawable(pb2Var);
        this.f1.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        View view4 = this.f1;
        jl0 a11 = this.Z.a(view4);
        a11.p(dtd.i(null));
        a11.q(hl.L(4.0f));
        a11.r(hl.L(16.0f));
        view4.setBackground(a11);
        iye.a(this.f1);
        this.f0.addView(this.f1, tre.d(40, 40.0f, 83, 8.0f, 0.0f, 0.0f, -4.0f));
        this.f1.setOnClickListener(new z98(this, (byte) 11));
        s96 s96Var = new s96(this.f0.getContext());
        this.g1 = s96Var;
        s96Var.setOnClickListener(new z98(this, (byte) 12));
        this.f0.addView(this.g1, tre.d(45, 45.0f, 83, 8.0f, 0.0f, 0.0f, -4.0f));
        Context context = this.f0.getContext();
        z zVar2 = this.h0;
        ad8 ad8Var4 = this.f0;
        byte b10 = 18;
        pb8 pb8Var2 = new pb8(this, context, zVar2, ad8Var4, ad8Var4, vnbVar, this.c0, new y98(this, b10));
        this.V1 = pb8Var2;
        pb8Var2.setBlurredBackgroundDrawableForMentions(this.Z);
        this.V1.setOnTimerChange(new ea8(this, (byte) 5));
        this.V1.setAccount(this.U);
        this.V1.setOnHeightUpdate(new ea8(this, (byte) 6));
        this.V1.setOnAddPhotoClick(new z98(this, (byte) 13));
        ContextThemeWrapper contextThemeWrapper = this.F;
        z zVar3 = this.h0;
        ad8 ad8Var5 = this.f0;
        qb8 qb8Var2 = new qb8(this, contextThemeWrapper, zVar3, ad8Var5, ad8Var5, vnbVar, this.c0, new y98(this, b10));
        this.W1 = qb8Var2;
        qb8Var2.setBlurredBackgroundDrawableForMentions(this.Z);
        this.W1.D(true, false);
        this.W1.setOnTimerChange(new ea8(this, (byte) 7));
        this.W1.setAccount(this.U);
        this.W1.setOnHeightUpdate(new ea8(this, (byte) 8));
        this.W1.setOnAddPhotoClick(new z98(this, (byte) 14));
        vl4 vl4Var = new vl4(this, this.F);
        this.r5 = vl4Var;
        vl4Var.setVisibility(8);
        this.f0.addView(this.r5, tre.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        k3b k3bVar2 = new k3b(this.F, vnbVar);
        this.o5 = k3bVar2;
        k3bVar2.setCurrentAccount(this.U);
        this.f0.addView(this.o5, r0.indexOfChild(this.G) - 1, tre.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        sc8 sc8Var = new sc8(this);
        this.s5 = sc8Var;
        sc8Var.setRad(18);
        this.s5.l();
        this.o5.setStickerCutOutBtn(this.s5);
        this.s5.setOnClickListener(new z98(this, (byte) 15));
        this.s5.setCutOutState(false);
        this.f0.addView(this.s5, tre.e(-1, 36, 17));
        LinearLayout linearLayout2 = new LinearLayout(this.E);
        this.t5 = linearLayout2;
        linearLayout2.setOrientation(0);
        sc8 sc8Var2 = new sc8(this);
        this.u5 = sc8Var2;
        sc8Var2.s0 = true;
        sc8Var2.setRad(18);
        this.u5.setEraseState(false);
        this.u5.setOnClickListener(new z98(this, (byte) 16));
        this.t5.addView(this.u5, tre.o(-2, 36));
        this.t5.addView(new Space(this.E), tre.o(12, -1));
        sc8 sc8Var3 = new sc8(this);
        this.v5 = sc8Var3;
        sc8Var3.s0 = true;
        sc8Var3.setRad(18);
        this.v5.setRestoreState(false);
        this.v5.setOnClickListener(new z98(this, (byte) 17));
        this.t5.addView(this.v5, tre.o(-2, 36));
        this.f0.addView(this.t5, tre.e(-2, 36, 17));
        sc8 sc8Var4 = new sc8(this);
        this.w5 = sc8Var4;
        sc8Var4.setUndoState(false);
        this.w5.setRad(18);
        sc8 sc8Var5 = this.w5;
        sc8Var5.s0 = true;
        sc8Var5.setOnClickListener(new z98(this, b10));
        this.f0.addView(this.w5, tre.e(-2, 36, 17));
        sc8 sc8Var6 = new sc8(this);
        this.x5 = sc8Var6;
        sc8Var6.setOutlineState(false);
        this.x5.setRad(18);
        sc8 sc8Var7 = this.x5;
        sc8Var7.s0 = true;
        sc8Var7.setOnClickListener(new z98(this, (byte) 19));
        this.f0.addView(this.x5, tre.e(-2, 36, 17));
        f2(false, false);
        k2(false, false);
        d26 d26Var = new d26((byte) 11, this.E, this);
        this.Y1 = d26Var;
        d26Var.addView(this.V1, tre.e(-1, -1, 83));
        this.f0.addView(this.Y1, tre.d(-1, -1.0f, 83, 0.0f, 8.0f, 0.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(this.E);
        this.Z1 = frameLayout2;
        frameLayout2.addView(this.W1, tre.e(-1, -1, 51));
        this.f0.addView(this.Z1, tre.d(-1, -1.0f, 51, 0.0f, 8.0f, 0.0f, 0.0f));
        FrameLayout frameLayout3 = new FrameLayout(this.E);
        this.R0 = frameLayout3;
        this.f0.addView(frameLayout3, tre.d(-1, 120.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        FrameLayout frameLayout4 = new FrameLayout(this.E);
        this.S0 = frameLayout4;
        this.f0.addView(frameLayout4, tre.d(-1, 120.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView7 = new TextView(this.E);
        this.Y7 = textView7;
        textView7.setSingleLine(true);
        this.Y7.setVisibility(8);
        this.Y7.setText(ob6.M0(2131752098, "ChooseCover"));
        this.Y7.setGravity(1);
        this.Y7.setTextSize(1, 14.0f);
        this.Y7.setTextColor(-7566196);
        this.f0.addView(this.Y7, tre.d(-1, -2.0f, 83, 0.0f, 8.0f, 0.0f, 0.0f));
        di3 di3Var = new di3(this, this.E, vnbVar);
        this.T0 = di3Var;
        int L = hl.L(52.0f);
        int L2 = hl.L(38.0f);
        di3Var.L = L;
        di3Var.M = L2;
        di3 di3Var2 = this.T0;
        di3Var2.t0 = true;
        jl0 a12 = this.Z.a(di3Var2);
        a12.p(dtd.i(vnbVar));
        di3Var2.setBlurredBackgroundDrawable(a12);
        this.f0.addView(this.T0, tre.d(jn7.E1, 120.0f, 85, 0.0f, 0.0f, 8.0f, 2.0f));
        this.T0.setContentDescription(ob6.M0(2131745368, "Send"));
        iye.a(this.T0);
        this.T0.setOnClickListener(new z98(this, (byte) 20));
        this.T0.setOnLongClickListener(new zs(this, (byte) 10));
        n85 n85Var = new n85(this.E);
        this.U0 = n85Var;
        View view5 = n85Var.b;
        jl0 a13 = this.Z.a(view5);
        a13.p(dtd.i(vnbVar));
        a13.r(hl.L(18.0f));
        a13.q(hl.L(7.0f));
        view5.setBackground(a13);
        View view6 = this.U0.c;
        jl0 a14 = this.Z.a(view6);
        a14.p(dtd.i(vnbVar));
        a14.r(hl.L(18.0f));
        a14.q(hl.L(7.0f));
        view6.setBackground(a14);
        this.U0.setVisibility(8);
        byte b11 = 21;
        this.U0.b.setOnClickListener(new z98(this, b11));
        this.U0.c.setOnClickListener(new z98(this, (byte) 22));
        this.f0.addView(this.U0, tre.e(-1, 56, 80));
        oob oobVar2 = new oob((byte) 9, this.E, this);
        this.I0 = oobVar2;
        oobVar2.setOrientation(0);
        this.I0.setPadding(hl.L(2.0f), 0, hl.L(2.0f), 0);
        View view7 = this.I0;
        jl0 a15 = this.Z.a(view7);
        a15.p(dtd.i(vnbVar));
        a15.q(hl.L(2.0f));
        a15.r(hl.L(22.0f));
        view7.setBackground(a15);
        this.Q0.addView(this.I0, tre.d(-2, 48.0f, 81, 0.0f, 3.0f, 63.0f, 0.0f));
        ImageView imageView = new ImageView(this.E);
        this.a1 = imageView;
        imageView.setScaleType(scaleType);
        this.a1.setImageResource(R.drawable.media_crop);
        ImageView imageView2 = this.a1;
        float L3 = hl.L(22.0f);
        int L4 = hl.L(4.0f);
        int L5 = hl.L(6.0f);
        imageView2.setBackground(aob.W(L3, 285212671, L4, L5, L4, L5));
        this.I0.addView(this.a1, tre.o(48, 48));
        this.a1.setOnClickListener(new z98(this, (byte) 23));
        this.a1.setContentDescription(ob6.M0(2131751663, "CropImage"));
        ImageView imageView3 = new ImageView(this.E);
        this.c1 = imageView3;
        imageView3.setScaleType(scaleType);
        this.c1.setImageResource(R.drawable.msg_photo_rotate);
        ImageView imageView4 = this.c1;
        float L6 = hl.L(22.0f);
        int L7 = hl.L(4.0f);
        int L8 = hl.L(6.0f);
        imageView4.setBackground(aob.W(L6, 285212671, L7, L8, L7, L8));
        this.I0.addView(this.c1, tre.o(48, 48));
        this.c1.setOnClickListener(new z98(this, (byte) 24));
        this.c1.setContentDescription(ob6.M0(2131754778, "AccDescrRotate"));
        ImageView imageView5 = new ImageView(this.E);
        this.b1 = imageView5;
        imageView5.setScaleType(scaleType);
        this.b1.setImageResource(R.drawable.media_flip);
        ImageView imageView6 = this.b1;
        float L9 = hl.L(22.0f);
        int L10 = hl.L(4.0f);
        int L11 = hl.L(6.0f);
        imageView6.setBackground(aob.W(L9, 285212671, L10, L11, L10, L11));
        this.I0.addView(this.b1, tre.o(48, 48));
        this.b1.setOnClickListener(new z98(this, (byte) 25));
        this.b1.setContentDescription(ob6.M0(2131754835, "AccDescrMirror"));
        ImageView imageView7 = new ImageView(this.E);
        this.Z0 = imageView7;
        imageView7.setScaleType(scaleType);
        this.Z0.setImageResource(R.drawable.media_draw);
        ImageView imageView8 = this.Z0;
        float L12 = hl.L(22.0f);
        int L13 = hl.L(4.0f);
        int L14 = hl.L(6.0f);
        imageView8.setBackground(aob.W(L12, 285212671, L13, L14, L13, L14));
        this.I0.addView(this.Z0, tre.o(48, 48));
        this.Z0.setOnClickListener(new z98(this, (byte) 26));
        this.Z0.setContentDescription(ob6.M0(2131754805, "AccDescrPhotoEditor"));
        iec iecVar = new iec(this.E);
        this.k1 = iecVar;
        iecVar.setTag(1);
        iec iecVar2 = this.k1;
        float L15 = hl.L(22.0f);
        int L16 = hl.L(4.0f);
        int L17 = hl.L(6.0f);
        iecVar2.setBackground(aob.W(L15, 285212671, L16, L17, L16, L17));
        this.d8 = E1();
        this.k1.a(Math.min(this.j8, this.k8), this.p8 && this.e8 > 1, this.r);
        this.k1.setContentDescription(ob6.M0(2131754730, "AccDescrVideoQuality"));
        this.I0.addView(this.k1, tre.o(48, 48));
        this.k1.setOnClickListener(new uv5(this, parentActivity, b11));
        ImageView imageView9 = new ImageView(this.E);
        this.d1 = imageView9;
        imageView9.setScaleType(scaleType);
        this.d1.setImageResource(R.drawable.media_settings);
        ImageView imageView10 = this.d1;
        float L18 = hl.L(22.0f);
        int L19 = hl.L(4.0f);
        int L20 = hl.L(6.0f);
        imageView10.setBackground(aob.W(L18, 285212671, L19, L20, L19, L20));
        this.I0.addView(this.d1, tre.o(48, 48));
        this.d1.setOnClickListener(new z98(this, (byte) 27));
        this.d1.setContentDescription(ob6.M0(2131754806, "AccDescrPhotoAdjust"));
        pa2 pa2Var2 = new pa2(this.F, (byte) 3);
        this.V0 = pa2Var2;
        pa2Var2.setBackgroundColor(-872415232);
        this.V0.b();
        this.V0.setVisibility(8);
        this.f0.addView(this.V0, tre.e(-1, 48, 83));
        ((TextView) this.V0.d).setOnClickListener(new z98(this, (byte) 28));
        ((TextView) this.V0.b).setOnClickListener(new z98(this, (byte) 29));
        TextView textView8 = new TextView(this.F);
        this.W0 = textView8;
        textView8.setClickable(false);
        this.W0.setVisibility(8);
        this.W0.setTextSize(1, 14.0f);
        this.W0.setTextColor(-1);
        this.W0.setGravity(17);
        this.W0.setBackgroundDrawable(aob.e0(-12763843, 0));
        this.W0.setPadding(hl.L(20.0f), 0, hl.L(20.0f), 0);
        this.W0.setText(ob6.L0(2131751661).toUpperCase());
        this.W0.setTypeface(hl.o());
        this.V0.addView(this.W0, tre.e(-2, -1, 49));
        this.W0.setOnClickListener(new ma8(this, (byte) 0));
        ru4 ru4Var = new ru4(this.f0.getContext(), this);
        this.q6 = ru4Var;
        ru4Var.v = false;
        this.r6 = true;
        ru4Var.h = this;
        fa8 fa8Var2 = new fa8(this);
        this.B4.p0(this.f0);
        ImageReceiver imageReceiver = this.B4;
        imageReceiver.l1 = (byte) 2;
        imageReceiver.K0 = true;
        imageReceiver.h1 = fa8Var2;
        this.A4.p0(this.f0);
        ImageReceiver imageReceiver2 = this.A4;
        imageReceiver2.l1 = (byte) 2;
        imageReceiver2.K0 = true;
        imageReceiver2.h1 = fa8Var2;
        this.C4.p0(this.f0);
        ImageReceiver imageReceiver3 = this.C4;
        imageReceiver3.l1 = (byte) 2;
        imageReceiver3.K0 = true;
        imageReceiver3.h1 = fa8Var2;
        int rotation = ((WindowManager) org.telegram.messenger.a.b.getSystemService("window")).getDefaultDisplay().getRotation();
        CheckBox checkBox = new CheckBox(this.f0.getContext(), R.drawable.selectphoto_large);
        this.O0 = checkBox;
        checkBox.setDrawBackground(true);
        this.O0.setHasBorder(true);
        this.O0.setSize(34);
        this.O0.setCheckOffset(hl.L(1.0f));
        this.O0.c(y0(i8), -1);
        this.O0.setVisibility(8);
        this.f0.addView(this.O0, tre.d(34, 34.0f, 53, 0.0f, (rotation == 3 || rotation == 1) ? 61.0f : 71.0f, 11.0f, 0.0f));
        if (!this.s) {
            ((FrameLayout.LayoutParams) this.O0.getLayoutParams()).topMargin += hl.m;
        }
        this.O0.setOnClickListener(new ma8(this, (byte) 1));
        CounterView counterView = new CounterView(this.E);
        this.P0 = counterView;
        this.f0.addView(counterView, tre.d(40, 40.0f, 53, 0.0f, (rotation == 3 || rotation == 1) ? 58.0f : 68.0f, 64.0f, 0.0f));
        if (!this.s) {
            ((FrameLayout.LayoutParams) this.P0.getLayoutParams()).topMargin += hl.m;
        }
        this.P0.setOnClickListener(new ma8(this, (byte) 2));
        jd8 jd8Var = new jd8(this.E);
        this.p1 = jd8Var;
        jd8Var.setVisibility(8);
        this.p1.setAlpha(0.0f);
        this.p1.setLayoutManager(new as((byte) 11, 0, true));
        jd8 jd8Var2 = this.p1;
        t20 t20Var = new t20(this, this.E, (byte) 13);
        this.q1 = t20Var;
        jd8Var2.setAdapter(t20Var);
        this.f0.addView(this.p1, tre.e(-1, jn7.n1, 51));
        this.p1.setOnItemClickListener(new zg4(this, (byte) 19));
        UndoView undoView = new UndoView(this.F, null, false, vnbVar);
        this.o1 = undoView;
        undoView.setAdditionalTranslationY(hl.L(112.0f));
        this.o1.h(-115203550, -1);
        this.f0.addView(this.o1, tre.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        if (hl.A1()) {
            View view8 = new View(this.F);
            this.T3 = view8;
            view8.setContentDescription(ob6.M0(2131754925, "AccActionPlay"));
            this.T3.setFocusable(true);
            this.T3.setOnClickListener(new ma8(this, (byte) 3));
            this.f0.addView(this.T3, tre.e(64, 64, 17));
        }
        yob.R(this.o0, rnb.e(y0(i10), 6.0f), yob.M(i10), yob.e(i10), vnbVar);
        yob.X(this.o0, i11, vnbVar);
        kb8 kb8Var = this.R;
        kb8Var.j0 = true;
        kb8Var.h0 = false;
        lmb m = kb8Var.m(this.h0.getContext());
        hl.B2(m);
        this.f0.addView(m);
        this.R.Q(this.f0);
        this.R.P();
        this.a.a(false, false);
    }

    public final boolean T2() {
        xn5 xn5Var = this.p2;
        return (xn5Var == null || !xn5Var.d || xn5Var.e) ? false : true;
    }

    public final void U(TLRPC.Document document, TLRPC.Document document2, boolean z, c cVar) {
        this.z7 = document;
        this.y7 = document2;
        this.A7 = z;
        this.B7 = false;
        this.C7 = cVar;
        this.a6 = 0.0f;
        this.e6 = 0.0f;
        if (this.o5 != null) {
            sc8 sc8Var = this.x5;
            if (sc8Var != null) {
                sc8Var.m(false, false);
            }
            this.o5.b();
            ArrayList arrayList = this.q5;
            if (arrayList != null) {
                arrayList.clear();
            }
        }
        if (this.z7 != null) {
            ArrayList arrayList2 = this.q5;
            if (arrayList2 == null) {
                this.q5 = new ArrayList();
            } else {
                arrayList2.clear();
            }
            TLRPC.Document document3 = this.z7;
            int i = this.U;
            ArrayList arrayList3 = null;
            if (document3 != null) {
                ArrayList arrayList4 = new ArrayList();
                int size = document3.attributes.size();
                for (int i2 = 0; i2 < size; i2++) {
                    TLRPC.DocumentAttribute documentAttribute = document3.attributes.get(i2);
                    if ((documentAttribute instanceof TLRPC.TL_documentAttributeCustomEmoji) || (documentAttribute instanceof TLRPC.TL_documentAttributeSticker)) {
                        TLRPC.TL_messages_stickerSet n0 = ls6.d0(i).n0(documentAttribute.stickerset, true);
                        if (n0 != null && n0.packs != null) {
                            for (int i3 = 0; i3 < n0.packs.size(); i3++) {
                                TLRPC.TL_stickerPack tL_stickerPack = n0.packs.get(i3);
                                if (tL_stickerPack.documents.contains(Long.valueOf(document3.id)) && pv3.g(tL_stickerPack.emoticon) != null) {
                                    arrayList4.add(tL_stickerPack.emoticon);
                                }
                            }
                        }
                        if (arrayList4.isEmpty()) {
                            if (!TextUtils.isEmpty(documentAttribute.alt) && pv3.g(documentAttribute.alt) != null) {
                                arrayList4.add(documentAttribute.alt);
                            }
                        }
                        arrayList3 = arrayList4;
                        break;
                    }
                }
            }
            if (arrayList3 != null) {
                this.q5.addAll(arrayList3);
            }
        }
        sc8 sc8Var2 = this.s5;
        if (sc8Var2 != null) {
            sc8Var2.setCutOutState(false);
        }
        k2(true, false);
        ImageView imageView = this.d1;
        if (imageView != null) {
            imageView.setAlpha(this.A7 ? 0.4f : 1.0f);
        }
    }

    public final boolean U0() {
        if (this.d2 == 11) {
            return true;
        }
        int i = this.O4;
        if (i < 0) {
            return false;
        }
        ArrayList arrayList = this.f7;
        if (i >= arrayList.size()) {
            return false;
        }
        ed8 ed8Var = this.d;
        if (ed8Var != null && !ed8Var.O()) {
            return true;
        }
        Object obj = arrayList.get(this.O4);
        if (obj instanceof no6) {
            return ((no6) obj).j();
        }
        return false;
    }

    public final void U1(n12 n12Var) {
        this.b2 = n12Var;
        e26 e26Var = this.c2;
        if (e26Var != null) {
            e26Var.a();
            this.c2 = null;
        }
        if (n12Var != null) {
            cdc cdcVar = n12Var.j1;
            if (cdcVar == null) {
                cdcVar = new cdc(n12Var.getWindow());
                n12Var.j1 = cdcVar;
            }
            this.c2 = new e26(cdcVar);
        }
    }

    public final void V() {
        me8 me8Var = this.U8;
        if (me8Var == null || !me8Var.f()) {
            this.U8 = fc3.b().k(this.c9);
        }
    }

    public final boolean V0() {
        return this.e && this.d != null;
    }

    public final void V1() {
        zu1 zu1Var;
        TLRPC.Chat chat;
        ed8 ed8Var = this.d;
        if (ed8Var != null) {
            if (ed8Var.u() != null && this.h > 0 && this.d.u().size() >= this.h && !this.d.w(this.O4)) {
                if (!this.n || (zu1Var = this.k4) == null || (chat = zu1Var.e) == null || xc2.N(chat) || !chat.slowmode_enabled) {
                    return;
                }
                jj.K(this.E, ob6.M0(2131745038, "Slowmode"), ob6.M0(2131745031, "SlowmodeSelectSendError")).o();
                return;
            }
            int D = this.d.D(this.O4, k0());
            boolean w = this.d.w(this.O4);
            this.O0.b(w, true);
            if (D >= 0) {
                t20 t20Var = this.q1;
                if (w) {
                    t20Var.i(D);
                    this.p1.A0(D);
                } else {
                    t20Var.s(D);
                    if (D == 0) {
                        this.q1.g(0);
                    }
                }
            }
            O2();
        }
    }

    public final void W0() {
        WindowManager.LayoutParams layoutParams = this.e0;
        layoutParams.flags = -2147417856;
        layoutParams.softInputMode = jn7.u4;
        try {
            ((WindowManager) this.E.getSystemService("window")).updateViewLayout(this.h0, this.e0);
        } catch (Exception e) {
            cc4.g(e, true);
        }
        this.h0.setFocusable(true);
        this.f0.setFocusable(true);
    }

    public final void W1() {
        float q = this.B4.q();
        float o = this.B4.o();
        if (q == 0.0f || o == 0.0f) {
            return;
        }
        float h0 = h0(this.t4);
        float f0 = f0();
        float min = Math.min(f0 / o, h0 / q);
        float max = Math.max(h0 / ((int) (q * min)), f0 / ((int) (o * min)));
        this.Z5 = max;
        I2(max);
    }

    public final void X0(String str, String str2, Bitmap bitmap, Bitmap bitmap2, float f, boolean z) {
        boolean z2;
        Bitmap.CompressFormat d0 = d0();
        if (bitmap == null) {
            try {
                bitmap = BitmapFactory.decodeFile(str2);
                z2 = true;
            } catch (Throwable th) {
                cc4.g(th, true);
                return;
            }
        } else {
            z2 = false;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        float f2 = width;
        if (f2 > f || height > f) {
            float max = Math.max(width, height) / f;
            height = (int) (height / max);
            width = (int) (f2 / max);
        }
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Rect rect = new Rect(0, 0, width, height);
        Paint paint = e9;
        if (z) {
            canvas.drawBitmap(bitmap2, (Rect) null, rect, paint);
            canvas.drawBitmap(bitmap, (Rect) null, rect, paint);
        } else {
            canvas.drawBitmap(bitmap, (Rect) null, rect, paint);
            canvas.drawBitmap(bitmap2, (Rect) null, rect, paint);
        }
        FileOutputStream fileOutputStream = new FileOutputStream(new File(str));
        createBitmap.compress(d0, f == 512.0f ? 83 : 87, fileOutputStream);
        try {
            fileOutputStream.close();
        } catch (Exception e) {
            cc4.g(e, true);
        }
        if (z2) {
            bitmap.recycle();
        }
        createBitmap.recycle();
    }

    public final void X1(CharSequence charSequence) {
        dd8 dd8Var = this.N;
        this.e4 = (String) charSequence;
        dd8Var.c(charSequence);
        t2(true, false);
    }

    public final int Y(int i) {
        if (i != 1) {
            if (i != 0) {
                if (i == 5 || i == 4 || i == 3) {
                    return 0;
                }
                return hl.L(14.0f);
            }
            if (this.d2 != 1) {
                return 0;
            }
        }
        return hl.L(16.0f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:130:0x0138, code lost:
    
        if (r1.exists() == false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0178, code lost:
    
        if (r1.exists() != false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003b, code lost:
    
        if (r1.exists() == false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01e3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01ed A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Y0(boolean z) {
        int i;
        File file;
        Uri uri;
        Uri uri2;
        ArrayList arrayList;
        r47 r47Var;
        TLRPC.Document F0;
        TLRPC.MessageMedia messageMedia;
        r47 r47Var2 = this.S4;
        String[] strArr = this.b5;
        if (r47Var2 == null && this.X4 == null && ((this.i7 == null || strArr[0] == null) && this.d2 != -1)) {
            return;
        }
        this.Q3 = false;
        if (r47Var2 != null) {
            String str = r47Var2.k.attachPath;
            if (str != null && str.length() != 0) {
                file = new File(this.S4.k.attachPath);
            }
            file = null;
            if (file == null) {
                ArrayList arrayList2 = new ArrayList();
                r47 r47Var3 = this.S4;
                TLRPC.Message message = r47Var3.k;
                if (message == null || (messageMedia = message.media) == null || (F0 = messageMedia.document) == null) {
                    F0 = r47Var3.F0();
                } else {
                    arrayList2.addAll(messageMedia.alt_documents);
                }
                if (arrayList2.size() + (F0 != null ? 1 : 0) <= 1) {
                    if (F0 != null) {
                        xb4.G(this.U);
                        file = xb4.J(F0, null, false, true);
                    } else {
                        int size = arrayList2.size();
                        int i2 = this.U;
                        if (size == 1) {
                            xb4.G(i2);
                            file = xb4.J((TLObject) arrayList2.get(0), null, false, true);
                        } else {
                            xb4.G(i2);
                            file = xb4.M(this.S4.k, false, true);
                        }
                    }
                    if (file == null || !file.exists()) {
                        if (F0 != null) {
                            xb4.G(this.U);
                            file = xb4.J(F0, null, true, true);
                        } else if (arrayList2.size() == 1) {
                            xb4.G(this.U);
                            file = xb4.J((TLObject) arrayList2.get(0), null, true, true);
                        } else {
                            file = null;
                        }
                    }
                }
                if (file != null && file.exists()) {
                    arrayList = null;
                } else if (r47.K4(this.S4.k) && ((this.S4.D2(true) || xea.x0) && !wf3.B(r47.B0(this.S4.k)) && this.S4.B())) {
                    int F = xb4.G(this.S4.K1).F(this.S4);
                    arrayList = new ArrayList();
                    arrayList.addAll(kfc.X(this.U, F0, arrayList2, F, true));
                    this.Q3 = true;
                    v(0, false);
                    file = null;
                } else {
                    file = null;
                    arrayList = null;
                }
                uri2 = null;
                if (file != null && uri2 == null && arrayList == null) {
                    uri2 = Uri.fromFile(file);
                }
                if (uri2 == null || arrayList != null) {
                    if (this.B5 != 1 && (r47Var = this.S4) != null && !r47Var.x()) {
                        hl.q2(this.S4, this.E, null);
                        return;
                    }
                    r47 r47Var4 = this.S4;
                    t1(arrayList, uri2, true, false, null, r47Var4 == null && r47Var4.D3(), 0L);
                    this.I3 = true;
                }
                if (z) {
                    if (this.S4 != null) {
                        boolean S = xb4.G(this.U).S(strArr[0]);
                        int i3 = this.U;
                        if (S) {
                            xb4.G(i3).f(this.S4.F0());
                        } else {
                            xb4.G(i3).X(this.S4.F0(), this.S4, 1, 0);
                        }
                    } else {
                        TLRPC.BotInlineResult botInlineResult = this.X4;
                        if (botInlineResult != null) {
                            if (botInlineResult.document != null) {
                                boolean S2 = xb4.G(this.U).S(strArr[0]);
                                int i4 = this.U;
                                if (S2) {
                                    xb4.G(i4).f(this.X4.document);
                                } else {
                                    xb4.G(i4).X(this.X4.document, this.S4, 1, 0);
                                }
                            } else if (botInlineResult.content instanceof TLRPC.TL_webDocument) {
                                if (in5.z().C.containsKey(this.X4.content.url)) {
                                    in5.z().c(this.X4.content.url);
                                } else {
                                    in5.z().H(this.U, this.X4.content.url, "mp4");
                                }
                            }
                        } else if (this.i7 != null) {
                            boolean S3 = xb4.G(this.U).S(strArr[0]);
                            int i5 = this.U;
                            if (S3) {
                                xb4.G(i5).f((TLRPC.Document) this.i7.d(this.O4));
                            } else {
                                xb4.G(i5).X((TLRPC.Document) this.i7.d(this.O4), this.i7.g(), 1, 1);
                            }
                        }
                    }
                    Drawable drawable = this.B4.n0;
                    if (drawable instanceof iu7) {
                        ((iu7) drawable).a();
                        return;
                    }
                    return;
                }
                return;
            }
            uri2 = null;
        } else {
            TLRPC.BotInlineResult botInlineResult2 = this.X4;
            if (botInlineResult2 == null) {
                bd8 bd8Var = this.i7;
                if (bd8Var != null) {
                    TLObject d = bd8Var.d(this.O4);
                    if (d instanceof TLRPC.Document) {
                        File b = this.i7.b(this.O4);
                        if (b == null || b.exists()) {
                            uri = null;
                        } else {
                            uri = hd4.j(this.U, this.i7.g(), (TLRPC.Document) d);
                            this.Q3 = true;
                        }
                        uri2 = uri;
                        file = b;
                        arrayList = null;
                        if (file != null) {
                            uri2 = Uri.fromFile(file);
                        }
                        if (uri2 == null) {
                        }
                        if (this.B5 != 1) {
                        }
                        r47 r47Var42 = this.S4;
                        t1(arrayList, uri2, true, false, null, r47Var42 == null && r47Var42.D3(), 0L);
                        this.I3 = true;
                    }
                    return;
                }
                if (this.d2 == -1) {
                    ArrayList arrayList3 = this.f7;
                    if (!arrayList3.isEmpty() && (i = this.O4) >= 0 && i < arrayList3.size()) {
                        Object obj = arrayList3.get(this.O4);
                        if (obj instanceof no6) {
                            file = new File(((no6) obj).I);
                            uri2 = null;
                        }
                    }
                }
                file = null;
                uri2 = null;
            } else if (botInlineResult2.document != null) {
                xb4.G(this.U);
                file = xb4.I(this.X4.document);
            } else {
                if (botInlineResult2.content instanceof TLRPC.TL_webDocument) {
                    file = new File(xb4.z(4), Utilities.a(this.X4.content.url) + "." + in5.x(this.X4.content.url, "mp4"));
                }
                file = null;
                uri2 = null;
            }
        }
        arrayList = uri2;
        if (file != null) {
        }
        if (uri2 == null) {
        }
        if (this.B5 != 1) {
        }
        r47 r47Var422 = this.S4;
        t1(arrayList, uri2, true, false, null, r47Var422 == null && r47Var422.D3(), 0L);
        this.I3 = true;
    }

    public final void Y1(boolean z, boolean z2) {
        if (this.l3 != z) {
            b6 b6Var = this.j0;
            if (z) {
                b6Var.setTag(1);
            } else {
                b6Var.setTag(null);
            }
            ValueAnimator valueAnimator = this.k3;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.l3 = z;
            if (z2) {
                if (z) {
                    this.i3.setVisibility(0);
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.i3.getAlpha(), z ? 1.0f : 0.0f);
                ofFloat.setDuration(200L);
                ofFloat.addUpdateListener(new w98(this, r3));
                ofFloat.addListener(new ec8(this, z, r3));
                this.k3 = ofFloat;
                ofFloat.start();
            } else {
                this.i3.setVisibility(z ? (byte) 0 : (byte) 8);
                this.i3.setAlpha(z ? 1.0f : 0.0f);
            }
            if (this.l2 && this.i7 == null) {
                s7 s7Var = this.p0;
                if (z) {
                    s7Var.S(9);
                } else {
                    s7Var.u(9);
                }
            }
        }
    }

    public final int Z(int i) {
        int L;
        if (i >= 0) {
            if (i == 1 || (i == 0 && this.d2 == 1)) {
                L = hl.L(16.0f);
                if (!this.s) {
                    r0 = hl.m;
                }
            } else {
                if (i == 3 && this.M1 != null) {
                    return this.M1.getAdditionalTop() + hl.L(8.0f) + (this.s ? 0 : hl.m);
                }
                if (i != 0 && i != 4 && i != 5) {
                    L = hl.L(14.0f);
                    if (!this.s) {
                        r0 = hl.m;
                    }
                }
            }
            return L + r0;
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:444:0x0a78, code lost:
    
        if (r2 == 2) goto L459;
     */
    /* JADX WARN: Code restructure failed: missing block: B:445:0x0a8e, code lost:
    
        r52 = r0;
        r53 = r4;
        r54 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:608:0x0ac0, code lost:
    
        if (r1.n6 != 3) goto L475;
     */
    /* JADX WARN: Code restructure failed: missing block: B:723:0x0a80, code lost:
    
        if (r9 == (-1)) goto L453;
     */
    /* JADX WARN: Code restructure failed: missing block: B:729:0x0a8c, code lost:
    
        if (r9 == r8) goto L459;
     */
    /* JADX WARN: Code restructure failed: missing block: B:750:0x09f5, code lost:
    
        if (r1.d2 == 1) goto L419;
     */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0539  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x05c2  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x05e1  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0611  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x079b  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x07c3  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x07c5  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0f9a  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0ff9  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x1014  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x1038  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x10e8  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x113f  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x1146  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x11c2  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x10d8  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x0808  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x08bc  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x08fd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:426:0x0a1c  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x0a5e  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x0c9a  */
    /* JADX WARN: Removed duplicated region for block: B:455:0x0cdc  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x0cf0  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x0d1e  */
    /* JADX WARN: Removed duplicated region for block: B:467:0x0d2b  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x0e45  */
    /* JADX WARN: Removed duplicated region for block: B:521:0x0e82  */
    /* JADX WARN: Removed duplicated region for block: B:528:0x0e9d  */
    /* JADX WARN: Removed duplicated region for block: B:536:0x0eb0  */
    /* JADX WARN: Removed duplicated region for block: B:540:0x0eca  */
    /* JADX WARN: Removed duplicated region for block: B:550:0x0eef  */
    /* JADX WARN: Removed duplicated region for block: B:578:0x0f7d A[EDGE_INSN: B:578:0x0f7d->B:579:0x0f7d BREAK  A[LOOP:1: B:548:0x0eea->B:563:0x0f79], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:589:0x0e76  */
    /* JADX WARN: Removed duplicated region for block: B:591:0x0d0b  */
    /* JADX WARN: Removed duplicated region for block: B:594:0x0cc1  */
    /* JADX WARN: Removed duplicated region for block: B:621:0x0b0e  */
    /* JADX WARN: Removed duplicated region for block: B:624:0x0b19 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:635:0x0b5b  */
    /* JADX WARN: Removed duplicated region for block: B:645:0x0b80 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:664:0x0c18  */
    /* JADX WARN: Removed duplicated region for block: B:667:0x0c28  */
    /* JADX WARN: Removed duplicated region for block: B:670:0x0c3e  */
    /* JADX WARN: Removed duplicated region for block: B:673:0x0c55  */
    /* JADX WARN: Removed duplicated region for block: B:676:0x0c5d  */
    /* JADX WARN: Removed duplicated region for block: B:685:0x0c79  */
    /* JADX WARN: Removed duplicated region for block: B:689:0x0bbc  */
    /* JADX WARN: Removed duplicated region for block: B:698:0x0be8  */
    /* JADX WARN: Removed duplicated region for block: B:701:0x0bf1  */
    /* JADX WARN: Removed duplicated region for block: B:732:0x0c83  */
    /* JADX WARN: Removed duplicated region for block: B:757:0x0814  */
    /* JADX WARN: Removed duplicated region for block: B:778:0x06c2  */
    /* JADX WARN: Removed duplicated region for block: B:782:0x05dc  */
    /* JADX WARN: Removed duplicated region for block: B:786:0x0663  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Z0(Canvas canvas) {
        Canvas canvas2;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        int i;
        float f10;
        int i2;
        lb8[] lb8VarArr;
        float f11;
        Canvas canvas3;
        float f12;
        ArrayList arrayList;
        long j;
        long j2;
        float f13;
        ImageView[] imageViewArr;
        float f14;
        float f15;
        float f16;
        boolean z;
        boolean z2;
        boolean z3;
        float f17;
        Matrix matrix;
        gc8 gc8Var;
        k3b k3bVar;
        float f18;
        float f19;
        float f20;
        ArrayList arrayList2;
        float f21;
        int i3;
        float f22;
        float f23;
        float f24;
        float f25;
        int i4;
        float f26;
        Matrix matrix2;
        float f27;
        float f28;
        ImageView[] imageViewArr2;
        float f29;
        float f30;
        Canvas canvas4;
        ArrayList arrayList3;
        boolean z4;
        int q;
        int o;
        boolean z5;
        int i5;
        int i6;
        float f31;
        float f32;
        int i7;
        float f33;
        float f34;
        int i8;
        int i10;
        byte b;
        float f35;
        float f36;
        boolean z6;
        float f37;
        float f38;
        Canvas canvas5;
        float f39;
        byte b2;
        long j3;
        float f40;
        int i11;
        GradientDrawable[] gradientDrawableArr;
        Canvas canvas6;
        float f41;
        float f42;
        float f43;
        int i12;
        float f44;
        float f45;
        float f46;
        float f47;
        int i13;
        int i14;
        float f48;
        float f49;
        float f50;
        float f51;
        float f52;
        int i15;
        float f53;
        float f54;
        int i16;
        int i17;
        TextureView textureView;
        float f55;
        float f56;
        float f57;
        int i18;
        float f58;
        int i19;
        int i20;
        boolean z7;
        int i21;
        boolean z8;
        ImageReceiver imageReceiver;
        int i22;
        Drawable drawable;
        int i23;
        float f59;
        byte b3;
        int i24;
        boolean z9;
        qx7 qx7Var;
        fo6 fo6Var;
        boolean z10;
        dc8 dc8Var;
        byte b4;
        float f60;
        float f61;
        float f62;
        float f63;
        float f64;
        float f65;
        cz9 cz9Var;
        boolean z11;
        int i25;
        int i26;
        qx7 qx7Var2;
        fo6 fo6Var2;
        float f66;
        int i27;
        int i28;
        dc8 dc8Var2;
        PhotoViewer photoViewer = this;
        if (a()) {
            RenderNode renderNode = photoViewer.P8;
            if (renderNode == null) {
                renderNode = new RenderNode("photo viewer");
                photoViewer.P8 = renderNode;
            }
            renderNode.setPosition(0, 0, canvas.getWidth(), canvas.getHeight() + hl.n);
            canvas2 = photoViewer.P8.beginRecording();
        } else {
            canvas2 = canvas;
        }
        org.telegram.ui.ActionBar.e eVar = photoViewer.l4;
        float f67 = 1.0f;
        if (eVar != null && eVar.getFragmentView() != null) {
            if (!photoViewer.U6.isFinished() && photoViewer.U6.computeScrollOffset()) {
                if (photoViewer.U6.getStartX() < photoViewer.E6 && photoViewer.U6.getStartX() > photoViewer.D6) {
                    photoViewer.W5 = photoViewer.U6.getCurrX();
                }
                if (photoViewer.U6.getStartY() < photoViewer.G6 && photoViewer.U6.getStartY() > photoViewer.F6) {
                    photoViewer.X5 = photoViewer.U6.getCurrY();
                }
                photoViewer.H0();
                photoViewer.f0.invalidate();
            }
            float abs = Math.abs(photoViewer.X5) / (photoViewer.f0() / 2.0f);
            float f68 = photoViewer.l6;
            if (f68 != 0.0f) {
                abs = qd4.A(1.0f, abs, f68, abs);
            }
            float i29 = ((1.0f - Utilities.i(abs, 1.0f, 0.0f)) * 0.1f) + 1.0f;
            if (!i86.e(32768)) {
                i29 = 1.0f;
            }
            View fragmentView = photoViewer.l4.getFragmentView();
            if (fragmentView.getScaleX() != i29 || fragmentView.getScaleY() != i29) {
                fragmentView.setPivotX(fragmentView.getWidth() / 2.0f);
                fragmentView.setPivotY(fragmentView.getHeight() / 2.0f);
                fragmentView.setScaleX(i29);
                fragmentView.setScaleY(i29);
            }
            n12 n12Var = photoViewer.b2;
            if (n12Var != null) {
                ex0 ex0Var = n12Var.c;
                if (ex0Var.getScaleX() != i29 || ex0Var.getScaleY() != i29) {
                    ex0Var.setPivotX(ex0Var.getWidth() / 2.0f);
                    ex0Var.setPivotY(ex0Var.getHeight() / 2.0f);
                    ex0Var.setScaleX(i29);
                    ex0Var.setScaleY(i29);
                }
            }
            byte b5 = photoViewer.m4;
            if (b5 == 1 || b5 == 2 || b5 == 3 || photoViewer.B3) {
                photoViewer.f0.invalidate();
            }
        }
        byte b6 = photoViewer.m4;
        if (b6 == 1) {
            if (photoViewer.u2) {
                canvas.save();
                canvas.translate((photoViewer.r0() / 2.0f) - (photoViewer.w0() / 2.0f), 0.0f);
            }
            if (photoViewer.i0 != null) {
                canvas.save();
                uh9.n(canvas.getHeight(), 2.0f, photoViewer.i0.getCenterY(), photoViewer.i0.getCenterX() - (canvas.getWidth() / 2.0f), canvas);
                float animationProgress = photoViewer.i0.getAnimationProgress();
                f67 = photoViewer.m4 == 1 ? animationProgress : 1.0f - animationProgress;
                canvas.scale(f67, f67, canvas.getWidth() / 2.0f, canvas.getHeight() / 2.0f);
            }
            photoViewer.S(0.0f, 1.0f, 0.0f, f67, canvas);
            Canvas canvas7 = canvas;
            if (photoViewer.i0 != null) {
                canvas7.restore();
            }
            if (photoViewer.u2) {
                canvas7.restore();
            }
            if (photoViewer.i0 != null && canvas2 != canvas7) {
                canvas2.save();
                canvas2.translate(photoViewer.i0.getX(), photoViewer.i0.getY());
                canvas2.scale(photoViewer.i0.getScaleX(), photoViewer.i0.getScaleY());
                photoViewer.i0.draw(canvas2);
                canvas2.restore();
            }
            if (a()) {
                photoViewer.P8.endRecording();
            } else {
                canvas7 = canvas2;
            }
            photoViewer.R(canvas7);
            return;
        }
        if (b6 == 3 || !(photoViewer.e || b6 == 2 || photoViewer.B3)) {
            if (a()) {
                photoViewer.P8.endRecording();
                canvas.drawRenderNode(photoViewer.P8);
                return;
            }
            return;
        }
        if (photoViewer.u2) {
            canvas2.save();
            canvas2.translate((photoViewer.r0() / 2) - (photoViewer.w0() / 2), 0.0f);
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j4 = currentTimeMillis - photoViewer.O3;
        if (j4 > 20) {
            j4 = 17;
        }
        photoViewer.O3 = currentTimeMillis;
        AnimatorSet animatorSet = photoViewer.o6;
        long j5 = j4;
        ArrayList arrayList4 = photoViewer.f7;
        if (animatorSet != null) {
            if (!photoViewer.U6.isFinished()) {
                photoViewer.U6.abortAnimation();
            }
            float f69 = photoViewer.Z5;
            f2 = -1.0f;
            float f70 = photoViewer.d6;
            f = 2.0f;
            float f71 = photoViewer.k6;
            float f72 = ((f70 - f69) * f71) + f69;
            float f73 = photoViewer.a6;
            float A = qd4.A(photoViewer.e6, f73, f71, f73);
            float f74 = photoViewer.W5;
            f5 = qd4.A(photoViewer.b6, f74, f71, f74);
            float f75 = photoViewer.X5;
            float A2 = qd4.A(photoViewer.c6, f75, f71, f75);
            float A3 = qd4.A(photoViewer.f6, 0.0f, f71, 0.0f);
            f3 = (f70 == 1.0f && f69 == 1.0f && f74 == 0.0f) ? A2 : -1.0f;
            photoViewer.I2(f72);
            photoViewer.f0.invalidate();
            f4 = A;
            f7 = A2;
            f6 = f72;
            f8 = A3;
        } else {
            f = 2.0f;
            f2 = -1.0f;
            if (photoViewer.m6 != 0) {
                photoViewer.W5 = photoViewer.b6;
                photoViewer.X5 = photoViewer.c6;
                float f76 = photoViewer.d6;
                photoViewer.Z5 = f76;
                photoViewer.a6 = photoViewer.e6;
                photoViewer.m6 = 0L;
                photoViewer.I2(f76);
                photoViewer.Q6 = false;
            }
            if (!photoViewer.U6.isFinished() && photoViewer.U6.computeScrollOffset()) {
                if (photoViewer.U6.getStartX() < photoViewer.E6 && photoViewer.U6.getStartX() > photoViewer.D6) {
                    photoViewer.W5 = photoViewer.U6.getCurrX();
                }
                if (photoViewer.U6.getStartY() < photoViewer.G6 && photoViewer.U6.getStartY() > photoViewer.F6) {
                    photoViewer.X5 = photoViewer.U6.getCurrY();
                }
                photoViewer.H0();
                photoViewer.f0.invalidate();
            }
            if (photoViewer.S6 != 0) {
                photoViewer.m2 = false;
                if (!arrayList4.isEmpty() && (i = photoViewer.O4) >= 0 && i < arrayList4.size()) {
                    Object obj = arrayList4.get(photoViewer.O4);
                    if (obj instanceof go6) {
                        ((go6) obj).s = photoViewer.k0();
                    }
                }
                byte b7 = photoViewer.S6;
                if (b7 == 1) {
                    hl.c3(new y98(photoViewer, (byte) 7));
                } else if (b7 == 2) {
                    hl.c3(new y98(photoViewer, (byte) 8));
                }
                photoViewer.S6 = (byte) 0;
            }
            float f77 = photoViewer.Z5;
            float f78 = photoViewer.a6;
            f3 = photoViewer.X5;
            f4 = f78;
            f5 = photoViewer.W5;
            f6 = f77;
            f7 = f3;
            f8 = 0.0f;
            if (photoViewer.K6) {
                f3 = -1.0f;
            }
        }
        float f79 = f7 + photoViewer.Y5;
        if (photoViewer.t4 == 3) {
            f79 += photoViewer.M1.X1 / f;
        }
        float f80 = f79;
        nc8 nc8Var = photoViewer.g0;
        if (nc8Var != null) {
            nc8Var.setTranslationY(f80);
        }
        boolean z12 = photoViewer.K;
        ImageView[] imageViewArr3 = photoViewer.y3;
        if (z12) {
            boolean z13 = photoViewer.z3;
            if (f6 <= 1.0001f) {
                if (!z13 && imageViewArr3[0].getTag() == null) {
                    imageViewArr3[0].animate().alpha(1.0f).setDuration(120L).setListener(new wb8(photoViewer, (byte) 8)).start();
                    imageViewArr3[0].setTag(1);
                    photoViewer.z3 = true;
                }
            } else if (z13) {
                imageViewArr3[0].animate().alpha(0.0f).setDuration(120L).setListener(new wb8(photoViewer, (byte) 9)).start();
                imageViewArr3[0].setTag(1);
                photoViewer.z3 = false;
            }
        }
        float f81 = f3;
        int g0 = photoViewer.g0();
        int f0 = photoViewer.f0();
        if (photoViewer.I3 && (dc8Var2 = photoViewer.z2) != null && dc8Var2.getVisibility() == 0) {
            f0 = photoViewer.A0();
        }
        byte b8 = photoViewer.m4;
        if (b8 != 2 && b8 != 4 && !photoViewer.B3 && !photoViewer.J3) {
            byte b9 = photoViewer.t4;
            BackgroundDrawable backgroundDrawable = photoViewer.M0;
            if (b9 != 0 || (i28 = photoViewer.d2) == 1 || i28 == 11 || photoViewer.Z5 != 1.0f || f81 == f2 || photoViewer.Q6) {
                backgroundDrawable.setAlpha(jn7.d4);
            } else {
                float f82 = g0 / 4.0f;
                backgroundDrawable.setAlpha((int) Math.max(127.0f, (1.0f - (Math.min(Math.abs(f81), f82) / f82)) * 255.0f));
            }
        } else if (b8 == 4) {
            canvas2.drawColor(-16777216);
        }
        photoViewer.r1 = null;
        if (photoViewer.t4 == 0 && (i27 = photoViewer.d2) != 1 && i27 != 11) {
            if (photoViewer.Z5 >= 1.0f && !photoViewer.Q6 && !photoViewer.J6) {
                if (f5 > photoViewer.E6 + hl.L(5.0f)) {
                    photoViewer.r1 = photoViewer.A4;
                } else if (f5 < photoViewer.D6 - hl.L(5.0f)) {
                    photoViewer.r1 = photoViewer.C4;
                } else {
                    photoViewer.m1.setMoveProgress(0.0f);
                }
            }
            photoViewer.I6 = photoViewer.r1 != null;
        }
        for (int i30 = 0; i30 < 3; i30++) {
            if (i30 != 1) {
                if (i30 == 2) {
                    f66 = ((-photoViewer.f0.getMeasuredWidth()) - hl.L(15.0f)) + (f5 - photoViewer.E6);
                } else {
                    float f83 = photoViewer.D6;
                    if (f5 < f83) {
                        f66 = f5 - f83;
                    }
                }
                imageViewArr3[i30].setTranslationX((f66 + photoViewer.f0.getMeasuredWidth()) - hl.L(48.0f));
            }
            f66 = 0.0f;
            imageViewArr3[i30].setTranslationX((f66 + photoViewer.f0.getMeasuredWidth()) - hl.L(48.0f));
        }
        ImageReceiver imageReceiver2 = photoViewer.r1;
        ImageReceiver imageReceiver3 = photoViewer.C4;
        lb8[] lb8VarArr2 = photoViewer.X0;
        if (imageReceiver2 == imageReceiver3) {
            if (!photoViewer.Q6) {
                float f84 = photoViewer.D6;
                if (f5 < f84) {
                    f61 = Math.min(1.0f, (f84 - f5) / g0);
                    f60 = (-g0) - (hl.L(30.0f) / 2);
                    f62 = (1.0f - f61) * 0.3f;
                    if (photoViewer.r1.B()) {
                        f10 = f5;
                        i2 = f0;
                        lb8VarArr = lb8VarArr2;
                        f11 = f4;
                        f63 = f80;
                        arrayList = arrayList4;
                        j = j5;
                        j2 = 0;
                        f13 = f8;
                        imageViewArr = imageViewArr3;
                        f64 = f61;
                        canvas3 = canvas2;
                        f65 = f60;
                    } else {
                        canvas2.save();
                        canvas2.translate(g0 / 2, f0 / 2);
                        canvas2.translate((hl.L(30.0f) / 2) + g0 + f60, 0.0f);
                        float f85 = 1.0f - f62;
                        canvas2.scale(f85, f85);
                        int q2 = photoViewer.r1.q();
                        int o2 = photoViewer.r1.o();
                        float f86 = f61;
                        int i31 = f0;
                        if (photoViewer.J4 || (fo6Var2 = photoViewer.I1) == null) {
                            canvas3 = canvas2;
                            j = j5;
                            j2 = 0;
                            f65 = f60;
                        } else {
                            float f87 = f60;
                            u33 u33Var = photoViewer.G1;
                            if (u33Var.a) {
                                Canvas canvas8 = canvas2;
                                f65 = f87;
                                canvas3 = canvas8;
                                j = j5;
                                j2 = 0;
                                f13 = f8;
                                imageViewArr = imageViewArr3;
                                f64 = f86;
                                lb8VarArr = lb8VarArr2;
                                photoViewer = this;
                                photoViewer.d(canvas3, g0, i31, q2, o2, 1.0f, u33Var, fo6Var2);
                                float f88 = q2;
                                float f89 = o2;
                                float min = Math.min(g0 / f88, i31 / f89);
                                int i32 = (int) (f88 * min);
                                int i33 = (int) (f89 * min);
                                if (arrayList4.isEmpty()) {
                                    i2 = i31;
                                    if (photoViewer.t4 == 1 || photoViewer.d2 == 1) {
                                        z11 = photoViewer.G1.h;
                                    } else {
                                        fo6 fo6Var3 = photoViewer.I1;
                                        if (fo6Var3 != null && fo6Var3.l) {
                                            z11 = true;
                                        }
                                    }
                                    if (z11) {
                                        canvas3.scale(-1.0f, 1.0f);
                                    }
                                    photoViewer.r1.setAlpha(f64);
                                    i25 = (-i32) / 2;
                                    f11 = f4;
                                    f10 = f5;
                                    i26 = (-i33) / 2;
                                    arrayList = arrayList4;
                                    f63 = f80;
                                    photoViewer.r1.i0(i25, i26, i32, i33);
                                    photoViewer.r1.g(canvas3);
                                    qx7Var2 = photoViewer.z4;
                                    if (qx7Var2 != null && qx7Var2.getVisibility() == 0) {
                                        canvas3.clipRect(i25, i26, i32 / 2, i33 / 2);
                                        if (photoViewer.z4.getMeasuredWidth() == q2 || photoViewer.z4.getMeasuredHeight() != o2) {
                                            photoViewer.z4.measure(View.MeasureSpec.makeMeasureSpec(q2, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(o2, TLObject.FLAG_30));
                                            photoViewer.z4.layout(0, 0, q2, o2);
                                        }
                                        canvas3.scale(min, min);
                                        canvas3.translate((-q2) / 2, (-o2) / 2);
                                        photoViewer.z4.setAlpha(1.0f);
                                        photoViewer.z4.draw(canvas3);
                                    }
                                    canvas3.restore();
                                } else {
                                    i2 = i31;
                                }
                                z11 = false;
                                if (z11) {
                                }
                                photoViewer.r1.setAlpha(f64);
                                i25 = (-i32) / 2;
                                f11 = f4;
                                f10 = f5;
                                i26 = (-i33) / 2;
                                arrayList = arrayList4;
                                f63 = f80;
                                photoViewer.r1.i0(i25, i26, i32, i33);
                                photoViewer.r1.g(canvas3);
                                qx7Var2 = photoViewer.z4;
                                if (qx7Var2 != null) {
                                    canvas3.clipRect(i25, i26, i32 / 2, i33 / 2);
                                    if (photoViewer.z4.getMeasuredWidth() == q2) {
                                    }
                                    photoViewer.z4.measure(View.MeasureSpec.makeMeasureSpec(q2, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(o2, TLObject.FLAG_30));
                                    photoViewer.z4.layout(0, 0, q2, o2);
                                    canvas3.scale(min, min);
                                    canvas3.translate((-q2) / 2, (-o2) / 2);
                                    photoViewer.z4.setAlpha(1.0f);
                                    photoViewer.z4.draw(canvas3);
                                }
                                canvas3.restore();
                            } else {
                                Canvas canvas9 = canvas2;
                                f65 = f87;
                                canvas3 = canvas9;
                                photoViewer = this;
                                j = j5;
                                j2 = 0;
                            }
                        }
                        f13 = f8;
                        imageViewArr = imageViewArr3;
                        f64 = f86;
                        lb8VarArr = lb8VarArr2;
                        float f882 = q2;
                        float f892 = o2;
                        float min2 = Math.min(g0 / f882, i31 / f892);
                        int i322 = (int) (f882 * min2);
                        int i332 = (int) (f892 * min2);
                        if (arrayList4.isEmpty()) {
                        }
                        z11 = false;
                        if (z11) {
                        }
                        photoViewer.r1.setAlpha(f64);
                        i25 = (-i322) / 2;
                        f11 = f4;
                        f10 = f5;
                        i26 = (-i332) / 2;
                        arrayList = arrayList4;
                        f63 = f80;
                        photoViewer.r1.i0(i25, i26, i322, i332);
                        photoViewer.r1.g(canvas3);
                        qx7Var2 = photoViewer.z4;
                        if (qx7Var2 != null) {
                        }
                        canvas3.restore();
                    }
                    photoViewer.m1.setMoveProgress(-f64);
                    cz9Var = photoViewer.B1;
                    if (cz9Var == null && cz9Var.a()) {
                        f12 = f63;
                    } else {
                        canvas3.save();
                        canvas3.translate(f65, f63 / f6);
                        f12 = f63;
                        canvas3.translate((((photoViewer.Z5 + 1.0f) * g0) + hl.L(30.0f)) / f, (-f12) / f6);
                        lb8 lb8Var = lb8VarArr[1];
                        lb8Var.o = 1.0f - f62;
                        lb8Var.e(0, f64, false);
                        lb8VarArr[1].c(canvas3);
                        if (photoViewer.K) {
                            imageViewArr[1].setAlpha(f64);
                        }
                        canvas3.restore();
                    }
                }
            }
            f60 = f5;
            f61 = 1.0f;
            f62 = 0.0f;
            if (photoViewer.r1.B()) {
            }
            photoViewer.m1.setMoveProgress(-f64);
            cz9Var = photoViewer.B1;
            if (cz9Var == null) {
            }
            canvas3.save();
            canvas3.translate(f65, f63 / f6);
            f12 = f63;
            canvas3.translate((((photoViewer.Z5 + 1.0f) * g0) + hl.L(30.0f)) / f, (-f12) / f6);
            lb8 lb8Var2 = lb8VarArr[1];
            lb8Var2.o = 1.0f - f62;
            lb8Var2.e(0, f64, false);
            lb8VarArr[1].c(canvas3);
            if (photoViewer.K) {
            }
            canvas3.restore();
        } else {
            f10 = f5;
            i2 = f0;
            lb8VarArr = lb8VarArr2;
            f11 = f4;
            canvas3 = canvas2;
            f12 = f80;
            arrayList = arrayList4;
            j = j5;
            j2 = 0;
            f13 = f8;
            imageViewArr = imageViewArr3;
            if (photoViewer.K) {
                imageViewArr[1].setAlpha(0.0f);
            }
        }
        if (!photoViewer.Q6) {
            float f90 = photoViewer.E6;
            if (f10 > f90 && (((b4 = photoViewer.t4) == 0 || b4 == 4) && photoViewer.d2 != 1)) {
                float min3 = Math.min(1.0f, (f10 - f90) / g0);
                f16 = min3 * 0.3f;
                f15 = 1.0f - min3;
                f14 = photoViewer.E6;
                z = (photoViewer.I3 || (dc8Var = photoViewer.z2) == null || dc8Var.getVisibility() != 0) ? false : true;
                if (photoViewer.I4 || photoViewer.G2 == null || photoViewer.d2 == 11) {
                    z2 = z;
                    z3 = false;
                    f17 = 1.0f;
                } else if (photoViewer.U0()) {
                    z3 = true;
                    f17 = 1.0f;
                    z2 = false;
                } else {
                    f17 = (photoViewer.G2.S() > j2 || photoViewer.G2.c0()) ? photoViewer.G2.U() > j2 ? Utilities.l(((photoViewer.G2.U() - 90) - r12) / 500.0f) : 1.0f : 0.0f;
                    if (f17 <= 0.0f) {
                        z3 = false;
                        z10 = false;
                    } else if (f17 < 1.0f) {
                        z10 = z;
                        z3 = true;
                    } else {
                        z10 = z;
                        z3 = false;
                    }
                    z2 = z10;
                }
                if (!z2) {
                    photoViewer.Z8 = false;
                }
                photoViewer.K4 = false;
                matrix = photoViewer.L4;
                matrix.reset();
                gc8Var = photoViewer.O1;
                if (gc8Var != null && !photoViewer.P1 && gc8Var.getRenderView() != null) {
                    f15 = photoViewer.O1.getRenderView().getAlpha() <= 0.99f ? 0.0f : 1.0f;
                }
                if (!photoViewer.B4.B() || (z2 && photoViewer.H3)) {
                    k3bVar = photoViewer.o5;
                    if (k3bVar == null && k3bVar.j0) {
                        try {
                            arrayList2 = arrayList;
                            try {
                                z8 = ((no6) arrayList2.get(photoViewer.O4)).w;
                            } catch (Exception unused) {
                                z8 = false;
                                if (z8) {
                                }
                                canvas3.save();
                                f21 = g0;
                                float f91 = f21 / f;
                                i3 = i2;
                                float f92 = i3;
                                float f93 = f92 / f;
                                canvas3.translate(f91 + photoViewer.Y(photoViewer.t4), f93 + photoViewer.Z(photoViewer.t4));
                                matrix.preTranslate(f91 + photoViewer.Y(photoViewer.t4), f93 + photoViewer.Z(photoViewer.t4));
                                float f94 = f12 + 0.0f;
                                canvas3.translate(f14, f94);
                                matrix.preTranslate(f14, f94);
                                f22 = f6 - f16;
                                canvas3.scale(f22, f22);
                                matrix.preScale(f22, f22);
                                canvas3.rotate(f19);
                                matrix.preRotate(f19);
                                if (photoViewer.t4 == 3) {
                                }
                                f23 = f14;
                                if (photoViewer.B3) {
                                }
                                f24 = f22;
                                f25 = f21;
                                i4 = i3;
                                f26 = f20;
                                matrix2 = matrix;
                                f27 = f19;
                                f28 = f13;
                                imageViewArr2 = imageViewArr;
                                f29 = f;
                                f30 = 1.0f;
                                canvas4 = canvas3;
                                arrayList3 = arrayList2;
                                z4 = z3;
                                if (!z2) {
                                }
                                q = photoViewer.B4.q();
                                o = photoViewer.B4.o();
                                float f95 = q;
                                float f96 = f25 / f95;
                                float f97 = o;
                                float f98 = f92 / f97;
                                float min4 = Math.min(f96, f98);
                                int i34 = (int) (f95 * min4);
                                z5 = z4;
                                int i35 = (int) (f97 * min4);
                                int i36 = o;
                                if (arrayList3.isEmpty()) {
                                }
                                i8 = i7;
                                i10 = i36;
                                f34 = 1.0f;
                                b = photoViewer.t4;
                                if (b == 3) {
                                }
                                f35 = f26;
                                if (z5) {
                                }
                                f36 = f31;
                                canvas4.save();
                                if (f28 <= 0.0f) {
                                }
                                int i37 = i6;
                                float f99 = (-i37) / 2;
                                int i38 = i5;
                                float f100 = (-i38) / 2;
                                canvas4.translate(f99, f100);
                                if (!z2) {
                                }
                                canvas4.scale(min4, min4);
                                if (z2) {
                                }
                                if (z6) {
                                }
                                if (photoViewer.x4.getVisibility() == 0) {
                                }
                                canvas5.restore();
                                if (z5) {
                                }
                                canvas5.restore();
                                i11 = 0;
                                while (true) {
                                    gradientDrawableArr = photoViewer.w1;
                                    if (i11 < gradientDrawableArr.length) {
                                    }
                                    i11++;
                                }
                                canvas6 = canvas5;
                                f15 = f40;
                                f41 = 1.0f;
                                f42 = f6;
                                f43 = f32;
                                i12 = g0;
                                f44 = f23;
                                photoViewer.S(f44, f42, f43, f15, canvas6);
                                float f101 = f42;
                                float f102 = f43;
                                float f103 = f15;
                                Canvas canvas10 = canvas6;
                                imageReceiver = photoViewer.r1;
                                if (imageReceiver == photoViewer.A4) {
                                }
                                i22 = photoViewer.v3;
                                if (i22 != 0) {
                                }
                                if (photoViewer.u2) {
                                }
                                if (photoViewer.z2 != null) {
                                }
                                if (a()) {
                                }
                                photoViewer.R(canvas10);
                            }
                        } catch (Exception unused2) {
                            arrayList2 = arrayList;
                        }
                        if (z8) {
                            int L = g0 - hl.L(20.0f);
                            photoViewer.o5.k0.reset();
                            photoViewer.o5.k0.postTranslate(-0.5f, -0.5f);
                            float f104 = L;
                            photoViewer.o5.k0.postScale(f104, f104);
                            float f105 = 1.0f / f6;
                            photoViewer.o5.k0.postScale(f105, f105);
                            f20 = f10;
                            f18 = 20.0f;
                            photoViewer.o5.k0.postTranslate((-f20) / f6, (-f12) / f6);
                            f19 = f11;
                            photoViewer.o5.k0.postRotate(-f19);
                            photoViewer.o5.n();
                        } else {
                            photoViewer.o5.getClass();
                            f18 = 20.0f;
                            f19 = f11;
                            f20 = f10;
                        }
                    } else {
                        f18 = 20.0f;
                        f19 = f11;
                        f20 = f10;
                        arrayList2 = arrayList;
                    }
                    canvas3.save();
                    f21 = g0;
                    float f912 = f21 / f;
                    i3 = i2;
                    float f922 = i3;
                    float f932 = f922 / f;
                    canvas3.translate(f912 + photoViewer.Y(photoViewer.t4), f932 + photoViewer.Z(photoViewer.t4));
                    matrix.preTranslate(f912 + photoViewer.Y(photoViewer.t4), f932 + photoViewer.Z(photoViewer.t4));
                    float f942 = f12 + 0.0f;
                    canvas3.translate(f14, f942);
                    matrix.preTranslate(f14, f942);
                    f22 = f6 - f16;
                    canvas3.scale(f22, f22);
                    matrix.preScale(f22, f22);
                    canvas3.rotate(f19);
                    matrix.preRotate(f19);
                    if (photoViewer.t4 == 3 || photoViewer.M1 == null) {
                        f23 = f14;
                    } else {
                        int e0 = photoViewer.e0(0, true);
                        hc8 hc8Var = photoViewer.M1;
                        int i39 = hl.q.y;
                        Typeface typeface = hl.a;
                        hl.L(f18);
                        photoViewer.M1.getClass();
                        float e02 = (((e0 - hc8Var.X1) - photoViewer.e0(0, false)) / f) * 1.0f;
                        canvas3.translate(0.0f, e02);
                        f23 = f14;
                        photoViewer.M1.getClass();
                        matrix.preTranslate(0.0f, e02);
                    }
                    if (!photoViewer.B3 || (z2 && ((photoViewer.H3 || photoViewer.I3) && photoViewer.M3 && photoViewer.N3 == 1.0f))) {
                        f24 = f22;
                        f25 = f21;
                        i4 = i3;
                        f26 = f20;
                        matrix2 = matrix;
                        f27 = f19;
                        f28 = f13;
                        imageViewArr2 = imageViewArr;
                        f29 = f;
                        f30 = 1.0f;
                        canvas4 = canvas3;
                        arrayList3 = arrayList2;
                    } else {
                        Bitmap bitmap = photoViewer.N4;
                        if (bitmap == null || !photoViewer.s1) {
                            f24 = f22;
                            f25 = f21;
                            i4 = i3;
                            f26 = f20;
                            matrix2 = matrix;
                            f27 = f19;
                            f28 = f13;
                            imageViewArr2 = imageViewArr;
                            f29 = f;
                            f30 = 1.0f;
                            canvas4 = canvas3;
                            arrayList3 = arrayList2;
                            photoViewer.B4.setAlpha(f15);
                            int q3 = photoViewer.B4.q();
                            int o3 = photoViewer.B4.o();
                            float i0 = (photoViewer.s1 && photoViewer.t4 == 0 && photoViewer.d2 == 1) ? photoViewer.i0(false) : Math.min(f25 / q3, f922 / o3);
                            photoViewer.B4.i0((-r0) / 2, (-r2) / 2, (int) (q3 * i0), (int) (o3 * i0));
                            if (photoViewer.s1) {
                                if (photoViewer.I4) {
                                    z7 = photoViewer.U0() ? true : true;
                                }
                                photoViewer.B4.g(canvas4);
                                photoViewer.K4 = z7;
                            }
                            z4 = true;
                            if (!z2 && photoViewer.H3 && photoViewer.I3) {
                                View view = photoViewer.E2 ? photoViewer.D2 : photoViewer.C2;
                                q = view.getMeasuredWidth();
                                o = view.getMeasuredHeight();
                            } else {
                                q = photoViewer.B4.q();
                                o = photoViewer.B4.o();
                            }
                            float f952 = q;
                            float f962 = f25 / f952;
                            float f972 = o;
                            float f982 = f922 / f972;
                            float min42 = Math.min(f962, f982);
                            int i342 = (int) (f952 * min42);
                            z5 = z4;
                            int i352 = (int) (f972 * min42);
                            int i362 = o;
                            if (arrayList3.isEmpty()) {
                                byte b10 = photoViewer.t4;
                                f32 = f12;
                                i7 = q;
                                if (b10 == 3 || (i20 = photoViewer.n6) == 3) {
                                    f33 = f17;
                                } else {
                                    f33 = f17;
                                    if (photoViewer.d2 != 1) {
                                        int i40 = photoViewer.o6 != null ? -1 : -1;
                                        if (b10 != 0) {
                                            if (b10 != 4) {
                                                if (b10 != 1) {
                                                }
                                            }
                                        }
                                    } else if (i20 != 0) {
                                    }
                                }
                                u33 u33Var2 = photoViewer.E1;
                                int i41 = u33Var2.i;
                                if (i41 == 90 || i41 == 270) {
                                    f47 = f952;
                                    i13 = i7;
                                    i14 = i362;
                                } else {
                                    f47 = f952;
                                    i14 = i7;
                                    i13 = i362;
                                }
                                int i42 = photoViewer.d2;
                                if (i42 != 1) {
                                    f48 = f982;
                                    if (b10 != 3) {
                                    }
                                    f49 = f30;
                                    float f106 = u33Var2.j;
                                    i5 = i352;
                                    float f107 = u33Var2.k;
                                    f50 = i14;
                                    i6 = i342;
                                    f51 = f30 - f49;
                                    int z14 = (int) xnb.z(f30 - f106, f51, f106, f50);
                                    f52 = i13;
                                    i15 = (int) ((((f30 - f107) * f51) + f107) * f52);
                                    f31 = f15;
                                    float f108 = z14;
                                    f53 = f25 / f108;
                                    f54 = i15;
                                    if (f53 * f54 > f922) {
                                        f53 = f922 / f54;
                                    }
                                    xc8 xc8Var = photoViewer.W4;
                                    if (i42 != 1 || ((b10 == 1 && photoViewer.n6 != 0) || xc8Var.c == null)) {
                                        i16 = i15;
                                    } else {
                                        float f109 = f108 * f53;
                                        float f110 = f54 * f53;
                                        float f111 = f962 * f972 > f922 ? f48 : f962;
                                        float f112 = f111;
                                        float f113 = (f47 * f111) / f24;
                                        float f114 = f972 * f112;
                                        i16 = i15;
                                        float A4 = qd4.A(f113, f109, f51, f109);
                                        float A5 = qd4.A(f114 / f24, f110, f51, f110);
                                        canvas4.clipRect((-A4) / f29, (-A5) / f29, A4 / f29, A5 / f29);
                                    }
                                    i17 = photoViewer.d2;
                                    if (i17 != 1 || u33Var2.a) {
                                        if (photoViewer.t4 != 1 || i17 == 1) {
                                            textureView = photoViewer.C2;
                                            if (textureView != null) {
                                                textureView.setScaleX(u33Var2.h ? -1.0f : 1.0f);
                                                zc8 zc8Var = photoViewer.F2;
                                                if (zc8Var != null) {
                                                    zc8Var.setScaleX(photoViewer.C2.getScaleX());
                                                }
                                            }
                                            float A6 = u33Var2.f / qd4.A(u33Var2.l, 1.0f, f51, 1.0f);
                                            f55 = f25 / f50;
                                            if (f55 * f52 > f922) {
                                                f55 = f922 / f52;
                                            }
                                            float f115 = (f55 / min42) * A6;
                                            if (photoViewer.d2 == 1) {
                                                if (photoViewer.t4 == 3 || (i18 = photoViewer.n6) == 3) {
                                                    f57 = ((u33Var2.m - 1.0f) * f51) + 1.0f;
                                                } else if (i18 == 0) {
                                                    f57 = u33Var2.m;
                                                }
                                                f115 /= f57;
                                            }
                                            f56 = f115;
                                        } else {
                                            TextureView textureView2 = photoViewer.C2;
                                            if (textureView2 != null) {
                                                fo6 fo6Var4 = xc8Var.c;
                                                textureView2.setScaleX((fo6Var4 == null || !fo6Var4.l) ? 1.0f : -1.0f);
                                                zc8 zc8Var2 = photoViewer.F2;
                                                if (zc8Var2 != null) {
                                                    zc8Var2.setScaleX(photoViewer.C2.getScaleX());
                                                }
                                            }
                                            fo6 fo6Var5 = xc8Var.c;
                                            float f116 = fo6Var5 != null ? fo6Var5.c : 1.0f;
                                            f56 = ((f53 / min42) / qd4.A(f116, 1.0f, f51, 1.0f)) * f116;
                                        }
                                        canvas4.translate(u33Var2.d * f49, u33Var2.e * f49);
                                        if (!photoViewer.K4) {
                                            matrix2.preTranslate(u33Var2.d * f49, u33Var2.e * f49);
                                        }
                                        canvas4.scale(f56, f56);
                                        if (!photoViewer.K4) {
                                            matrix2.preScale(f56, f56);
                                        }
                                        canvas4.translate(xnb.C(u33Var2.b, f50, min42, f49), xnb.C(u33Var2.c, f52, min42, f49));
                                        if (!photoViewer.K4) {
                                            matrix2.preTranslate(xnb.C(u33Var2.b, f50, min42, f49), xnb.C(u33Var2.c, f52, min42, f49));
                                        }
                                        f58 = u33Var2.g + i41;
                                        if (f58 > 180.0f) {
                                            f58 -= 360.0f;
                                        }
                                        if (photoViewer.d2 == 1 || !(photoViewer.t4 == 3 || photoViewer.n6 == 3)) {
                                            float f117 = f58 * f49;
                                            canvas4.rotate(f117);
                                            if (!photoViewer.K4) {
                                                matrix2.preRotate(f117);
                                            }
                                        } else {
                                            canvas4.rotate(f58);
                                            if (!photoViewer.K4) {
                                                matrix2.preRotate(f58);
                                            }
                                        }
                                    } else {
                                        TextureView textureView3 = photoViewer.C2;
                                        if (textureView3 != null) {
                                            float f118 = f30;
                                            textureView3.setScaleX(f118);
                                            photoViewer.C2.setScaleY(f118);
                                            zc8 zc8Var3 = photoViewer.F2;
                                            if (zc8Var3 != null) {
                                                zc8Var3.setScaleX(f118);
                                                photoViewer.F2.setScaleY(f118);
                                            }
                                        }
                                    }
                                    f34 = f53;
                                    i8 = z14;
                                    i10 = i16;
                                    b = photoViewer.t4;
                                    if (b == 3) {
                                        hc8 hc8Var2 = photoViewer.M1;
                                        hc8Var2.x0(f6, f26, (hc8Var2.getRenderView().getScaleX() * (photoViewer.d2 == 1 ? hl.m / f29 : 0.0f)) + f32, i8 * f34, i10 * f34);
                                    } else if (b == 4) {
                                        float f119 = f32;
                                        photoViewer.O1.b(f6, f26, f119, f27, i8 * f34, i10 * f34);
                                        f35 = f26;
                                        f32 = f119;
                                        if (z5 || photoViewer.E2) {
                                            f36 = f31;
                                        } else {
                                            f36 = f31;
                                            photoViewer.Q(canvas4, f28, f36);
                                        }
                                        canvas4.save();
                                        if (f28 <= 0.0f) {
                                            canvas4.save();
                                            canvas4.scale(1.0f - (f28 * f29), 1.0f);
                                            canvas4.skew(0.0f, qd4.z(1.0f, f28, f28 * 4.0f, 0.25f));
                                            z6 = true;
                                        } else {
                                            z6 = false;
                                        }
                                        int i372 = i6;
                                        float f992 = (-i372) / 2;
                                        int i382 = i5;
                                        float f1002 = (-i382) / 2;
                                        canvas4.translate(f992, f1002);
                                        if (!z2 || photoViewer.x4.getVisibility() == 0) {
                                            canvas4.scale(min42, min42);
                                        }
                                        if (z2) {
                                            f37 = min42;
                                            f38 = f28;
                                            canvas5 = canvas4;
                                            f39 = 0.0f;
                                            b2 = 2;
                                            j3 = j;
                                            f40 = f36;
                                        } else {
                                            if (!photoViewer.M3 && ((photoViewer.E2 && photoViewer.S) || (photoViewer.H3 && photoViewer.I3))) {
                                                photoViewer.M3 = true;
                                                photoViewer.N3 = 0.0f;
                                                photoViewer.O3 = System.currentTimeMillis();
                                                photoViewer.f0.getMeasuredHeight();
                                            }
                                            TextureView textureView4 = photoViewer.C2;
                                            if (textureView4 != null) {
                                                textureView4.setAlpha(photoViewer.N3 * f36 * f33);
                                            }
                                            TextureView textureView5 = photoViewer.C2;
                                            if (textureView5 instanceof kec) {
                                                f39 = 0.0f;
                                                ((kec) textureView5).a(((g0 - i372) / f29) + photoViewer.Y(photoViewer.t4) + f23, ((i4 - i382) / f29) + photoViewer.Z(photoViewer.t4) + f32 + 0.0f, i372, i382);
                                            } else {
                                                f39 = 0.0f;
                                            }
                                            SurfaceView surfaceView = photoViewer.D2;
                                            if (surfaceView != null && photoViewer.v3 == 0 && !photoViewer.F3 && !photoViewer.L3 && !photoViewer.B3 && surfaceView.getVisibility() != 0) {
                                                photoViewer.D2.setVisibility(0);
                                            }
                                            photoViewer.K2(f912 + photoViewer.Y(photoViewer.t4) + f23, f932 + photoViewer.Z(photoViewer.t4) + f32 + f39, i372 * f24, i382 * f24);
                                            if (!photoViewer.E2 || photoViewer.S) {
                                                photoViewer.z2.draw(canvas4);
                                                VideoFramesRewinder videoFramesRewinder = photoViewer.b4;
                                                if (videoFramesRewinder != null) {
                                                    videoFramesRewinder.draw(canvas4, photoViewer.z2.getWidth(), photoViewer.z2.getHeight());
                                                }
                                            }
                                            if (photoViewer.E2) {
                                                f46 = 1.0f;
                                                if (f36 != 1.0f) {
                                                    Paint paint = photoViewer.T;
                                                    if (paint == null) {
                                                        paint = new Paint();
                                                        photoViewer.T = paint;
                                                    }
                                                    paint.setAlpha((int) ((1.0f - f36) * 255.0f));
                                                    f38 = f28;
                                                    f37 = min42;
                                                    canvas5 = canvas4;
                                                    b2 = 2;
                                                    f40 = f36;
                                                    canvas5.drawRect(-1.0f, -1.0f, photoViewer.z2.getWidth() + 1.0f, photoViewer.z2.getHeight() + 1.0f, photoViewer.T);
                                                    if (photoViewer.M3) {
                                                        float f120 = photoViewer.N3;
                                                        if (f120 < f46) {
                                                            j3 = j;
                                                            photoViewer.N3 = (j3 / (photoViewer.U2 ? 100.0f : 200.0f)) + f120;
                                                            photoViewer.f0.invalidate();
                                                            photoViewer.H0();
                                                            if (photoViewer.N3 > 1.0f) {
                                                                photoViewer.N3 = 1.0f;
                                                            }
                                                            photoViewer.x4.setAlpha(f40);
                                                        }
                                                    }
                                                    j3 = j;
                                                    photoViewer.x4.setAlpha(f40);
                                                } else {
                                                    f37 = min42;
                                                    f38 = f28;
                                                    canvas5 = canvas4;
                                                    b2 = 2;
                                                }
                                            } else {
                                                f37 = min42;
                                                f38 = f28;
                                                canvas5 = canvas4;
                                                b2 = 2;
                                                f46 = 1.0f;
                                            }
                                            f40 = f36;
                                            if (photoViewer.M3) {
                                            }
                                            j3 = j;
                                            photoViewer.x4.setAlpha(f40);
                                        }
                                        if (z6) {
                                            canvas5.restore();
                                            canvas5.translate(f992, f1002);
                                            if (z2 || photoViewer.x4.getVisibility() == 0) {
                                                canvas5.scale(f37, f37);
                                            }
                                        }
                                        if (photoViewer.x4.getVisibility() == 0 && (photoViewer.s1 || photoViewer.t4 != b2 || photoViewer.n6 != -1)) {
                                            if (photoViewer.d2 != 11) {
                                                canvas5.clipRect(0, 0, photoViewer.x4.getMeasuredWidth(), photoViewer.x4.getMeasuredHeight());
                                            }
                                            photoViewer.x4.draw(canvas5);
                                        }
                                        canvas5.restore();
                                        if (z5 && photoViewer.E2) {
                                            f45 = photoViewer.N3;
                                            if (f45 == 1.0f || f33 < 1.0f) {
                                                photoViewer.Q(canvas5, f38, Math.max(1.0f - f45, 1.0f - f33) * f40);
                                            }
                                        }
                                        canvas5.restore();
                                        i11 = 0;
                                        while (true) {
                                            gradientDrawableArr = photoViewer.w1;
                                            if (i11 < gradientDrawableArr.length) {
                                                break;
                                            }
                                            boolean[] zArr = photoViewer.x1;
                                            boolean z15 = zArr[i11];
                                            float[] fArr = photoViewer.y1;
                                            if (z15 || fArr[i11] != f39) {
                                                gradientDrawableArr[i11].setAlpha((int) (fArr[i11] * 255.0f));
                                                if (i11 == 0) {
                                                    gradientDrawableArr[i11].setBounds(0, 0, photoViewer.f0.getMeasuredWidth() / 5, photoViewer.f0.getMeasuredHeight());
                                                } else {
                                                    gradientDrawableArr[i11].setBounds(photoViewer.f0.getMeasuredWidth() - (photoViewer.f0.getMeasuredWidth() / 5), 0, photoViewer.f0.getMeasuredWidth(), photoViewer.f0.getMeasuredHeight());
                                                }
                                                gradientDrawableArr[i11].draw(canvas5);
                                            }
                                            if (zArr[i11]) {
                                                float f121 = fArr[i11];
                                                if (f121 < 1.0f) {
                                                    float f122 = (j3 / 180.0f) + f121;
                                                    fArr[i11] = f122;
                                                    if (f122 > 1.0f) {
                                                        fArr[i11] = 1.0f;
                                                    }
                                                    photoViewer.f0.invalidate();
                                                }
                                            } else {
                                                float f123 = fArr[i11];
                                                if (f123 > f39) {
                                                    float f124 = f123 - (j3 / 180.0f);
                                                    fArr[i11] = f124;
                                                    if (f124 < f39) {
                                                        fArr[i11] = f39;
                                                    }
                                                    photoViewer.f0.invalidate();
                                                }
                                            }
                                            i11++;
                                        }
                                        canvas6 = canvas5;
                                        f15 = f40;
                                        f41 = 1.0f;
                                        f42 = f6;
                                        f43 = f32;
                                        i12 = g0;
                                        f44 = f23;
                                    }
                                    f35 = f26;
                                    if (z5) {
                                    }
                                    f36 = f31;
                                    canvas4.save();
                                    if (f28 <= 0.0f) {
                                    }
                                    int i3722 = i6;
                                    float f9922 = (-i3722) / 2;
                                    int i3822 = i5;
                                    float f10022 = (-i3822) / 2;
                                    canvas4.translate(f9922, f10022);
                                    if (!z2) {
                                    }
                                    canvas4.scale(min42, min42);
                                    if (z2) {
                                    }
                                    if (z6) {
                                    }
                                    if (photoViewer.x4.getVisibility() == 0) {
                                        if (photoViewer.d2 != 11) {
                                        }
                                        photoViewer.x4.draw(canvas5);
                                    }
                                    canvas5.restore();
                                    if (z5) {
                                        f45 = photoViewer.N3;
                                        if (f45 == 1.0f) {
                                        }
                                        photoViewer.Q(canvas5, f38, Math.max(1.0f - f45, 1.0f - f33) * f40);
                                    }
                                    canvas5.restore();
                                    i11 = 0;
                                    while (true) {
                                        gradientDrawableArr = photoViewer.w1;
                                        if (i11 < gradientDrawableArr.length) {
                                        }
                                        i11++;
                                    }
                                    canvas6 = canvas5;
                                    f15 = f40;
                                    f41 = 1.0f;
                                    f42 = f6;
                                    f43 = f32;
                                    i12 = g0;
                                    f44 = f23;
                                } else {
                                    f48 = f982;
                                }
                                if (photoViewer.o6 == null || (i19 = photoViewer.n6) == -1) {
                                    if (b10 == 2 || b10 == 3) {
                                        f49 = 0.0f;
                                        float f1062 = u33Var2.j;
                                        i5 = i352;
                                        float f1072 = u33Var2.k;
                                        f50 = i14;
                                        i6 = i342;
                                        f51 = f30 - f49;
                                        int z142 = (int) xnb.z(f30 - f1062, f51, f1062, f50);
                                        f52 = i13;
                                        i15 = (int) ((((f30 - f1072) * f51) + f1072) * f52);
                                        f31 = f15;
                                        float f1082 = z142;
                                        f53 = f25 / f1082;
                                        f54 = i15;
                                        if (f53 * f54 > f922) {
                                        }
                                        xc8 xc8Var2 = photoViewer.W4;
                                        if (i42 != 1) {
                                        }
                                        i16 = i15;
                                        i17 = photoViewer.d2;
                                        if (i17 != 1) {
                                        }
                                        if (photoViewer.t4 != 1) {
                                        }
                                        textureView = photoViewer.C2;
                                        if (textureView != null) {
                                        }
                                        float A62 = u33Var2.f / qd4.A(u33Var2.l, 1.0f, f51, 1.0f);
                                        f55 = f25 / f50;
                                        if (f55 * f52 > f922) {
                                        }
                                        float f1152 = (f55 / min42) * A62;
                                        if (photoViewer.d2 == 1) {
                                        }
                                        f56 = f1152;
                                        canvas4.translate(u33Var2.d * f49, u33Var2.e * f49);
                                        if (!photoViewer.K4) {
                                        }
                                        canvas4.scale(f56, f56);
                                        if (!photoViewer.K4) {
                                        }
                                        canvas4.translate(xnb.C(u33Var2.b, f50, min42, f49), xnb.C(u33Var2.c, f52, min42, f49));
                                        if (!photoViewer.K4) {
                                        }
                                        f58 = u33Var2.g + i41;
                                        if (f58 > 180.0f) {
                                        }
                                        if (photoViewer.d2 == 1) {
                                        }
                                        float f1172 = f58 * f49;
                                        canvas4.rotate(f1172);
                                        if (!photoViewer.K4) {
                                        }
                                        f34 = f53;
                                        i8 = z142;
                                        i10 = i16;
                                        b = photoViewer.t4;
                                        if (b == 3) {
                                        }
                                        f35 = f26;
                                        if (z5) {
                                        }
                                        f36 = f31;
                                        canvas4.save();
                                        if (f28 <= 0.0f) {
                                        }
                                        int i37222 = i6;
                                        float f99222 = (-i37222) / 2;
                                        int i38222 = i5;
                                        float f100222 = (-i38222) / 2;
                                        canvas4.translate(f99222, f100222);
                                        if (!z2) {
                                        }
                                        canvas4.scale(min42, min42);
                                        if (z2) {
                                        }
                                        if (z6) {
                                        }
                                        if (photoViewer.x4.getVisibility() == 0) {
                                        }
                                        canvas5.restore();
                                        if (z5) {
                                        }
                                        canvas5.restore();
                                        i11 = 0;
                                        while (true) {
                                            gradientDrawableArr = photoViewer.w1;
                                            if (i11 < gradientDrawableArr.length) {
                                            }
                                            i11++;
                                        }
                                        canvas6 = canvas5;
                                        f15 = f40;
                                        f41 = 1.0f;
                                        f42 = f6;
                                        f43 = f32;
                                        i12 = g0;
                                        f44 = f23;
                                    }
                                    f49 = f30;
                                    float f10622 = u33Var2.j;
                                    i5 = i352;
                                    float f10722 = u33Var2.k;
                                    f50 = i14;
                                    i6 = i342;
                                    f51 = f30 - f49;
                                    int z1422 = (int) xnb.z(f30 - f10622, f51, f10622, f50);
                                    f52 = i13;
                                    i15 = (int) ((((f30 - f10722) * f51) + f10722) * f52);
                                    f31 = f15;
                                    float f10822 = z1422;
                                    f53 = f25 / f10822;
                                    f54 = i15;
                                    if (f53 * f54 > f922) {
                                    }
                                    xc8 xc8Var22 = photoViewer.W4;
                                    if (i42 != 1) {
                                    }
                                    i16 = i15;
                                    i17 = photoViewer.d2;
                                    if (i17 != 1) {
                                    }
                                    if (photoViewer.t4 != 1) {
                                    }
                                    textureView = photoViewer.C2;
                                    if (textureView != null) {
                                    }
                                    float A622 = u33Var2.f / qd4.A(u33Var2.l, 1.0f, f51, 1.0f);
                                    f55 = f25 / f50;
                                    if (f55 * f52 > f922) {
                                    }
                                    float f11522 = (f55 / min42) * A622;
                                    if (photoViewer.d2 == 1) {
                                    }
                                    f56 = f11522;
                                    canvas4.translate(u33Var2.d * f49, u33Var2.e * f49);
                                    if (!photoViewer.K4) {
                                    }
                                    canvas4.scale(f56, f56);
                                    if (!photoViewer.K4) {
                                    }
                                    canvas4.translate(xnb.C(u33Var2.b, f50, min42, f49), xnb.C(u33Var2.c, f52, min42, f49));
                                    if (!photoViewer.K4) {
                                    }
                                    f58 = u33Var2.g + i41;
                                    if (f58 > 180.0f) {
                                    }
                                    if (photoViewer.d2 == 1) {
                                    }
                                    float f11722 = f58 * f49;
                                    canvas4.rotate(f11722);
                                    if (!photoViewer.K4) {
                                    }
                                    f34 = f53;
                                    i8 = z1422;
                                    i10 = i16;
                                    b = photoViewer.t4;
                                    if (b == 3) {
                                    }
                                    f35 = f26;
                                    if (z5) {
                                    }
                                    f36 = f31;
                                    canvas4.save();
                                    if (f28 <= 0.0f) {
                                    }
                                    int i372222 = i6;
                                    float f992222 = (-i372222) / 2;
                                    int i382222 = i5;
                                    float f1002222 = (-i382222) / 2;
                                    canvas4.translate(f992222, f1002222);
                                    if (!z2) {
                                    }
                                    canvas4.scale(min42, min42);
                                    if (z2) {
                                    }
                                    if (z6) {
                                    }
                                    if (photoViewer.x4.getVisibility() == 0) {
                                    }
                                    canvas5.restore();
                                    if (z5) {
                                    }
                                    canvas5.restore();
                                    i11 = 0;
                                    while (true) {
                                        gradientDrawableArr = photoViewer.w1;
                                        if (i11 < gradientDrawableArr.length) {
                                        }
                                        i11++;
                                    }
                                    canvas6 = canvas5;
                                    f15 = f40;
                                    f41 = 1.0f;
                                    f42 = f6;
                                    f43 = f32;
                                    i12 = g0;
                                    f44 = f23;
                                } else {
                                    if (b10 != 1 && i19 != 1) {
                                        f49 = photoViewer.k6;
                                        if (i19 != 0) {
                                            f49 = f30 - f49;
                                        }
                                        float f106222 = u33Var2.j;
                                        i5 = i352;
                                        float f107222 = u33Var2.k;
                                        f50 = i14;
                                        i6 = i342;
                                        f51 = f30 - f49;
                                        int z14222 = (int) xnb.z(f30 - f106222, f51, f106222, f50);
                                        f52 = i13;
                                        i15 = (int) ((((f30 - f107222) * f51) + f107222) * f52);
                                        f31 = f15;
                                        float f108222 = z14222;
                                        f53 = f25 / f108222;
                                        f54 = i15;
                                        if (f53 * f54 > f922) {
                                        }
                                        xc8 xc8Var222 = photoViewer.W4;
                                        if (i42 != 1) {
                                        }
                                        i16 = i15;
                                        i17 = photoViewer.d2;
                                        if (i17 != 1) {
                                        }
                                        if (photoViewer.t4 != 1) {
                                        }
                                        textureView = photoViewer.C2;
                                        if (textureView != null) {
                                        }
                                        float A6222 = u33Var2.f / qd4.A(u33Var2.l, 1.0f, f51, 1.0f);
                                        f55 = f25 / f50;
                                        if (f55 * f52 > f922) {
                                        }
                                        float f115222 = (f55 / min42) * A6222;
                                        if (photoViewer.d2 == 1) {
                                        }
                                        f56 = f115222;
                                        canvas4.translate(u33Var2.d * f49, u33Var2.e * f49);
                                        if (!photoViewer.K4) {
                                        }
                                        canvas4.scale(f56, f56);
                                        if (!photoViewer.K4) {
                                        }
                                        canvas4.translate(xnb.C(u33Var2.b, f50, min42, f49), xnb.C(u33Var2.c, f52, min42, f49));
                                        if (!photoViewer.K4) {
                                        }
                                        f58 = u33Var2.g + i41;
                                        if (f58 > 180.0f) {
                                        }
                                        if (photoViewer.d2 == 1) {
                                        }
                                        float f117222 = f58 * f49;
                                        canvas4.rotate(f117222);
                                        if (!photoViewer.K4) {
                                        }
                                        f34 = f53;
                                        i8 = z14222;
                                        i10 = i16;
                                        b = photoViewer.t4;
                                        if (b == 3) {
                                        }
                                        f35 = f26;
                                        if (z5) {
                                        }
                                        f36 = f31;
                                        canvas4.save();
                                        if (f28 <= 0.0f) {
                                        }
                                        int i3722222 = i6;
                                        float f9922222 = (-i3722222) / 2;
                                        int i3822222 = i5;
                                        float f10022222 = (-i3822222) / 2;
                                        canvas4.translate(f9922222, f10022222);
                                        if (!z2) {
                                        }
                                        canvas4.scale(min42, min42);
                                        if (z2) {
                                        }
                                        if (z6) {
                                        }
                                        if (photoViewer.x4.getVisibility() == 0) {
                                        }
                                        canvas5.restore();
                                        if (z5) {
                                        }
                                        canvas5.restore();
                                        i11 = 0;
                                        while (true) {
                                            gradientDrawableArr = photoViewer.w1;
                                            if (i11 < gradientDrawableArr.length) {
                                            }
                                            i11++;
                                        }
                                        canvas6 = canvas5;
                                        f15 = f40;
                                        f41 = 1.0f;
                                        f42 = f6;
                                        f43 = f32;
                                        i12 = g0;
                                        f44 = f23;
                                    }
                                    f49 = f30;
                                    float f1062222 = u33Var2.j;
                                    i5 = i352;
                                    float f1072222 = u33Var2.k;
                                    f50 = i14;
                                    i6 = i342;
                                    f51 = f30 - f49;
                                    int z142222 = (int) xnb.z(f30 - f1062222, f51, f1062222, f50);
                                    f52 = i13;
                                    i15 = (int) ((((f30 - f1072222) * f51) + f1072222) * f52);
                                    f31 = f15;
                                    float f1082222 = z142222;
                                    f53 = f25 / f1082222;
                                    f54 = i15;
                                    if (f53 * f54 > f922) {
                                    }
                                    xc8 xc8Var2222 = photoViewer.W4;
                                    if (i42 != 1) {
                                    }
                                    i16 = i15;
                                    i17 = photoViewer.d2;
                                    if (i17 != 1) {
                                    }
                                    if (photoViewer.t4 != 1) {
                                    }
                                    textureView = photoViewer.C2;
                                    if (textureView != null) {
                                    }
                                    float A62222 = u33Var2.f / qd4.A(u33Var2.l, 1.0f, f51, 1.0f);
                                    f55 = f25 / f50;
                                    if (f55 * f52 > f922) {
                                    }
                                    float f1152222 = (f55 / min42) * A62222;
                                    if (photoViewer.d2 == 1) {
                                    }
                                    f56 = f1152222;
                                    canvas4.translate(u33Var2.d * f49, u33Var2.e * f49);
                                    if (!photoViewer.K4) {
                                    }
                                    canvas4.scale(f56, f56);
                                    if (!photoViewer.K4) {
                                    }
                                    canvas4.translate(xnb.C(u33Var2.b, f50, min42, f49), xnb.C(u33Var2.c, f52, min42, f49));
                                    if (!photoViewer.K4) {
                                    }
                                    f58 = u33Var2.g + i41;
                                    if (f58 > 180.0f) {
                                    }
                                    if (photoViewer.d2 == 1) {
                                    }
                                    float f1172222 = f58 * f49;
                                    canvas4.rotate(f1172222);
                                    if (!photoViewer.K4) {
                                    }
                                    f34 = f53;
                                    i8 = z142222;
                                    i10 = i16;
                                    b = photoViewer.t4;
                                    if (b == 3) {
                                    }
                                    f35 = f26;
                                    if (z5) {
                                    }
                                    f36 = f31;
                                    canvas4.save();
                                    if (f28 <= 0.0f) {
                                    }
                                    int i37222222 = i6;
                                    float f99222222 = (-i37222222) / 2;
                                    int i38222222 = i5;
                                    float f100222222 = (-i38222222) / 2;
                                    canvas4.translate(f99222222, f100222222);
                                    if (!z2) {
                                    }
                                    canvas4.scale(min42, min42);
                                    if (z2) {
                                    }
                                    if (z6) {
                                    }
                                    if (photoViewer.x4.getVisibility() == 0) {
                                    }
                                    canvas5.restore();
                                    if (z5) {
                                    }
                                    canvas5.restore();
                                    i11 = 0;
                                    while (true) {
                                        gradientDrawableArr = photoViewer.w1;
                                        if (i11 < gradientDrawableArr.length) {
                                        }
                                        i11++;
                                    }
                                    canvas6 = canvas5;
                                    f15 = f40;
                                    f41 = 1.0f;
                                    f42 = f6;
                                    f43 = f32;
                                    i12 = g0;
                                    f44 = f23;
                                }
                            } else {
                                i5 = i352;
                                i6 = i342;
                                f31 = f15;
                                f32 = f12;
                                i7 = q;
                                f33 = f17;
                            }
                            i8 = i7;
                            i10 = i362;
                            f34 = 1.0f;
                            b = photoViewer.t4;
                            if (b == 3) {
                            }
                            f35 = f26;
                            if (z5) {
                            }
                            f36 = f31;
                            canvas4.save();
                            if (f28 <= 0.0f) {
                            }
                            int i372222222 = i6;
                            float f992222222 = (-i372222222) / 2;
                            int i382222222 = i5;
                            float f1002222222 = (-i382222222) / 2;
                            canvas4.translate(f992222222, f1002222222);
                            if (!z2) {
                            }
                            canvas4.scale(min42, min42);
                            if (z2) {
                            }
                            if (z6) {
                            }
                            if (photoViewer.x4.getVisibility() == 0) {
                            }
                            canvas5.restore();
                            if (z5) {
                            }
                            canvas5.restore();
                            i11 = 0;
                            while (true) {
                                gradientDrawableArr = photoViewer.w1;
                                if (i11 < gradientDrawableArr.length) {
                                }
                                i11++;
                            }
                            canvas6 = canvas5;
                            f15 = f40;
                            f41 = 1.0f;
                            f42 = f6;
                            f43 = f32;
                            i12 = g0;
                            f44 = f23;
                        } else {
                            int width = bitmap.getWidth();
                            int i43 = (-width) / 2;
                            int i44 = (-photoViewer.N4.getHeight()) / 2;
                            f30 = 1.0f;
                            if (f15 < 1.0f) {
                                f27 = f19;
                                Canvas canvas11 = canvas3;
                                imageViewArr2 = imageViewArr;
                                f24 = f22;
                                i4 = i3;
                                f29 = f;
                                matrix2 = matrix;
                                f25 = f21;
                                arrayList3 = arrayList2;
                                f28 = f13;
                                i21 = i43;
                                f26 = f20;
                                canvas4 = canvas11;
                                canvas4.saveLayerAlpha(i43, i44, i43 + width, r7 + i44, (int) (f15 * 255.0f), 31);
                            } else {
                                f24 = f22;
                                i4 = i3;
                                f26 = f20;
                                matrix2 = matrix;
                                f27 = f19;
                                f28 = f13;
                                imageViewArr2 = imageViewArr;
                                f29 = f;
                                canvas4 = canvas3;
                                f25 = f21;
                                i21 = i43;
                                arrayList3 = arrayList2;
                            }
                            canvas4.drawBitmap(photoViewer.N4, i21, i44, photoViewer.M4);
                            if (f15 < 1.0f) {
                                canvas4.restore();
                            }
                        }
                    }
                    z4 = z3;
                    if (!z2) {
                    }
                    q = photoViewer.B4.q();
                    o = photoViewer.B4.o();
                    float f9522 = q;
                    float f9622 = f25 / f9522;
                    float f9722 = o;
                    float f9822 = f922 / f9722;
                    float min422 = Math.min(f9622, f9822);
                    int i3422 = (int) (f9522 * min422);
                    z5 = z4;
                    int i3522 = (int) (f9722 * min422);
                    int i3622 = o;
                    if (arrayList3.isEmpty()) {
                    }
                    i8 = i7;
                    i10 = i3622;
                    f34 = 1.0f;
                    b = photoViewer.t4;
                    if (b == 3) {
                    }
                    f35 = f26;
                    if (z5) {
                    }
                    f36 = f31;
                    canvas4.save();
                    if (f28 <= 0.0f) {
                    }
                    int i3722222222 = i6;
                    float f9922222222 = (-i3722222222) / 2;
                    int i3822222222 = i5;
                    float f10022222222 = (-i3822222222) / 2;
                    canvas4.translate(f9922222222, f10022222222);
                    if (!z2) {
                    }
                    canvas4.scale(min422, min422);
                    if (z2) {
                    }
                    if (z6) {
                    }
                    if (photoViewer.x4.getVisibility() == 0) {
                    }
                    canvas5.restore();
                    if (z5) {
                    }
                    canvas5.restore();
                    i11 = 0;
                    while (true) {
                        gradientDrawableArr = photoViewer.w1;
                        if (i11 < gradientDrawableArr.length) {
                        }
                        i11++;
                    }
                    canvas6 = canvas5;
                    f15 = f40;
                    f41 = 1.0f;
                    f42 = f6;
                    f43 = f32;
                    i12 = g0;
                    f44 = f23;
                } else {
                    canvas6 = canvas3;
                    i12 = g0;
                    f43 = f12;
                    imageViewArr2 = imageViewArr;
                    f29 = f;
                    f42 = f6;
                    i4 = i2;
                    arrayList3 = arrayList;
                    f41 = 1.0f;
                    b2 = 2;
                    f39 = 0.0f;
                    f44 = f14;
                    f35 = f10;
                }
                photoViewer.S(f44, f42, f43, f15, canvas6);
                float f1012 = f42;
                float f1022 = f43;
                float f1032 = f15;
                Canvas canvas102 = canvas6;
                imageReceiver = photoViewer.r1;
                if (imageReceiver == photoViewer.A4) {
                    if (imageReceiver.B()) {
                        canvas102.save();
                        canvas102.translate(i12 / 2, i4 / 2);
                        float f125 = i12;
                        canvas102.translate(((-(((photoViewer.Z5 + f41) * f125) + hl.L(30.0f))) / f29) + f35, f39);
                        int q4 = photoViewer.r1.q();
                        int o4 = photoViewer.r1.o();
                        if (!photoViewer.G4 && (fo6Var = photoViewer.H1) != null) {
                            u33 u33Var3 = photoViewer.F1;
                            if (u33Var3.a) {
                                i23 = i12;
                                i24 = i4;
                                photoViewer.d(canvas102, i23, i24, q4, o4, f1012, u33Var3, fo6Var);
                                float f126 = q4;
                                float f127 = o4;
                                float min5 = Math.min(f125 / f126, i24 / f127);
                                int i45 = (int) (f126 * min5);
                                int i46 = (int) (f127 * min5);
                                if (!arrayList3.isEmpty()) {
                                    if (photoViewer.t4 == 1 || photoViewer.d2 == 1) {
                                        z9 = photoViewer.F1.h;
                                    } else {
                                        fo6 fo6Var6 = photoViewer.H1;
                                        if (fo6Var6 != null && fo6Var6.l) {
                                            z9 = true;
                                        }
                                    }
                                    if (z9) {
                                        canvas102.scale(-1.0f, f41);
                                    }
                                    photoViewer.r1.setAlpha(f41);
                                    int i47 = (-i45) / b2;
                                    int i48 = (-i46) / b2;
                                    b3 = b2;
                                    photoViewer.r1.i0(i47, i48, i45, i46);
                                    photoViewer.r1.g(canvas102);
                                    qx7Var = photoViewer.y4;
                                    if (qx7Var == null && qx7Var.getVisibility() == 0) {
                                        canvas102.clipRect(i47, i48, i45 / 2, i46 / 2);
                                        if (photoViewer.y4.getMeasuredWidth() != q4 || photoViewer.y4.getMeasuredHeight() != o4) {
                                            photoViewer.y4.measure(View.MeasureSpec.makeMeasureSpec(q4, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(o4, TLObject.FLAG_30));
                                            photoViewer.y4.layout(0, 0, q4, o4);
                                        }
                                        canvas102.scale(min5, min5);
                                        canvas102.translate((-q4) / 2, (-o4) / 2);
                                        f59 = 1.0f;
                                        photoViewer.y4.setAlpha(1.0f);
                                        photoViewer.y4.draw(canvas102);
                                    } else {
                                        f59 = 1.0f;
                                    }
                                    canvas102.restore();
                                }
                                z9 = false;
                                if (z9) {
                                }
                                photoViewer.r1.setAlpha(f41);
                                int i472 = (-i45) / b2;
                                int i482 = (-i46) / b2;
                                b3 = b2;
                                photoViewer.r1.i0(i472, i482, i45, i46);
                                photoViewer.r1.g(canvas102);
                                qx7Var = photoViewer.y4;
                                if (qx7Var == null) {
                                }
                                f59 = 1.0f;
                                canvas102.restore();
                            }
                        }
                        i23 = i12;
                        i24 = i4;
                        float f1262 = q4;
                        float f1272 = o4;
                        float min52 = Math.min(f125 / f1262, i24 / f1272);
                        int i452 = (int) (f1262 * min52);
                        int i462 = (int) (f1272 * min52);
                        if (!arrayList3.isEmpty()) {
                        }
                        z9 = false;
                        if (z9) {
                        }
                        photoViewer.r1.setAlpha(f41);
                        int i4722 = (-i452) / b2;
                        int i4822 = (-i462) / b2;
                        b3 = b2;
                        photoViewer.r1.i0(i4722, i4822, i452, i462);
                        photoViewer.r1.g(canvas102);
                        qx7Var = photoViewer.y4;
                        if (qx7Var == null) {
                        }
                        f59 = 1.0f;
                        canvas102.restore();
                    } else {
                        i23 = i12;
                        f59 = f41;
                        b3 = b2;
                    }
                    photoViewer.m1.setMoveProgress(f59 - f1032);
                    cz9 cz9Var2 = photoViewer.B1;
                    if (cz9Var2 == null || !cz9Var2.a()) {
                        canvas102.save();
                        canvas102.translate(f35, f1022 / f1012);
                        canvas102.translate((-(((photoViewer.Z5 + 1.0f) * i23) + hl.L(30.0f))) / f29, (-f1022) / f1012);
                        lb8 lb8Var3 = lb8VarArr[b3];
                        lb8Var3.o = 1.0f;
                        lb8Var3.e(0, 1.0f, false);
                        lb8VarArr[b3].c(canvas102);
                        if (photoViewer.K) {
                            imageViewArr2[b3].setAlpha(1.0f);
                        }
                        canvas102.restore();
                    }
                } else {
                    byte b11 = b2;
                    if (photoViewer.K) {
                        imageViewArr2[b11].setAlpha(0.0f);
                    }
                }
                i22 = photoViewer.v3;
                if (i22 != 0) {
                    int i49 = i22 - 1;
                    photoViewer.v3 = i49;
                    if (i49 == 0) {
                        ne8 ne8Var = photoViewer.w3;
                        if (ne8Var != null && !photoViewer.E2) {
                            try {
                                me8 me8Var = photoViewer.U8;
                                photoViewer.C3 = me8Var != null ? me8Var.d() : ne8Var.getBitmap();
                                drawable = null;
                            } catch (Throwable th) {
                                Bitmap bitmap2 = photoViewer.C3;
                                if (bitmap2 != null) {
                                    bitmap2.recycle();
                                    drawable = null;
                                    photoViewer.C3 = null;
                                } else {
                                    drawable = null;
                                }
                                cc4.f(th);
                            }
                            Bitmap bitmap3 = photoViewer.C3;
                            ImageView imageView = photoViewer.x3;
                            if (bitmap3 != null) {
                                imageView.setVisibility(0);
                                photoViewer.x3.setImageBitmap(photoViewer.C3);
                            } else {
                                imageView.setImageDrawable(drawable);
                            }
                        }
                        if (photoViewer.U8 != null) {
                            photoViewer.B();
                        }
                    } else {
                        photoViewer.f0.invalidate();
                    }
                }
                if (photoViewer.u2) {
                    canvas102.restore();
                }
                if (photoViewer.z2 != null) {
                    int measuredHeight = ((int) ((f1012 - 1.0f) * r0.getMeasuredHeight())) / 2;
                    rec recVar = photoViewer.A1;
                    if (recVar.j) {
                        int i50 = (int) (f1022 / f1012);
                        recVar.setBounds(photoViewer.z2.getLeft(), (photoViewer.z2.getTop() - measuredHeight) + i50, photoViewer.z2.getRight(), photoViewer.z2.getBottom() + measuredHeight + i50);
                        photoViewer.A1.draw(canvas102);
                    }
                    if (photoViewer.B1.a()) {
                        photoViewer.B1.setBounds(photoViewer.z2.getLeft(), (int) ((photoViewer.G.getAlpha() * hl.L(90.0f)) + hl.m), photoViewer.z2.getRight(), photoViewer.z2.getBottom() + measuredHeight + ((int) (f1022 / f1012)));
                        photoViewer.B1.draw(canvas102);
                    }
                }
                if (a()) {
                    photoViewer.P8.endRecording();
                    canvas.drawRenderNode(photoViewer.P8);
                    canvas102 = canvas;
                }
                photoViewer.R(canvas102);
            }
        }
        f14 = f10;
        f15 = 1.0f;
        f16 = 0.0f;
        if (photoViewer.I3) {
        }
        if (photoViewer.I4) {
        }
        z2 = z;
        z3 = false;
        f17 = 1.0f;
        if (!z2) {
        }
        photoViewer.K4 = false;
        matrix = photoViewer.L4;
        matrix.reset();
        gc8Var = photoViewer.O1;
        if (gc8Var != null) {
            if (photoViewer.O1.getRenderView().getAlpha() <= 0.99f) {
            }
        }
        if (photoViewer.B4.B()) {
        }
        k3bVar = photoViewer.o5;
        if (k3bVar == null) {
        }
        f18 = 20.0f;
        f19 = f11;
        f20 = f10;
        arrayList2 = arrayList;
        canvas3.save();
        f21 = g0;
        float f9122 = f21 / f;
        i3 = i2;
        float f9222 = i3;
        float f9322 = f9222 / f;
        canvas3.translate(f9122 + photoViewer.Y(photoViewer.t4), f9322 + photoViewer.Z(photoViewer.t4));
        matrix.preTranslate(f9122 + photoViewer.Y(photoViewer.t4), f9322 + photoViewer.Z(photoViewer.t4));
        float f9422 = f12 + 0.0f;
        canvas3.translate(f14, f9422);
        matrix.preTranslate(f14, f9422);
        f22 = f6 - f16;
        canvas3.scale(f22, f22);
        matrix.preScale(f22, f22);
        canvas3.rotate(f19);
        matrix.preRotate(f19);
        if (photoViewer.t4 == 3) {
        }
        f23 = f14;
        if (photoViewer.B3) {
        }
        f24 = f22;
        f25 = f21;
        i4 = i3;
        f26 = f20;
        matrix2 = matrix;
        f27 = f19;
        f28 = f13;
        imageViewArr2 = imageViewArr;
        f29 = f;
        f30 = 1.0f;
        canvas4 = canvas3;
        arrayList3 = arrayList2;
        z4 = z3;
        if (!z2) {
        }
        q = photoViewer.B4.q();
        o = photoViewer.B4.o();
        float f95222 = q;
        float f96222 = f25 / f95222;
        float f97222 = o;
        float f98222 = f9222 / f97222;
        float min4222 = Math.min(f96222, f98222);
        int i34222 = (int) (f95222 * min4222);
        z5 = z4;
        int i35222 = (int) (f97222 * min4222);
        int i36222 = o;
        if (arrayList3.isEmpty()) {
        }
        i8 = i7;
        i10 = i36222;
        f34 = 1.0f;
        b = photoViewer.t4;
        if (b == 3) {
        }
        f35 = f26;
        if (z5) {
        }
        f36 = f31;
        canvas4.save();
        if (f28 <= 0.0f) {
        }
        int i37222222222 = i6;
        float f99222222222 = (-i37222222222) / 2;
        int i38222222222 = i5;
        float f100222222222 = (-i38222222222) / 2;
        canvas4.translate(f99222222222, f100222222222);
        if (!z2) {
        }
        canvas4.scale(min4222, min4222);
        if (z2) {
        }
        if (z6) {
        }
        if (photoViewer.x4.getVisibility() == 0) {
        }
        canvas5.restore();
        if (z5) {
        }
        canvas5.restore();
        i11 = 0;
        while (true) {
            gradientDrawableArr = photoViewer.w1;
            if (i11 < gradientDrawableArr.length) {
            }
            i11++;
        }
        canvas6 = canvas5;
        f15 = f40;
        f41 = 1.0f;
        f42 = f6;
        f43 = f32;
        i12 = g0;
        f44 = f23;
        photoViewer.S(f44, f42, f43, f15, canvas6);
        float f10122 = f42;
        float f10222 = f43;
        float f10322 = f15;
        Canvas canvas1022 = canvas6;
        imageReceiver = photoViewer.r1;
        if (imageReceiver == photoViewer.A4) {
        }
        i22 = photoViewer.v3;
        if (i22 != 0) {
        }
        if (photoViewer.u2) {
        }
        if (photoViewer.z2 != null) {
        }
        if (a()) {
        }
        photoViewer.R(canvas1022);
    }

    public final boolean Z1(int i) {
        bd8 bd8Var = this.i7;
        if (bd8Var == null) {
            return false;
        }
        if (!bd8Var.a(i) && !this.i7.e(i)) {
            return false;
        }
        boolean z = xea.a;
        if (!i86.e(1024)) {
            return false;
        }
        File b = this.i7.b(i);
        if (b == null || !b.exists()) {
            return xea.x0 && (this.i7.d(i) instanceof TLRPC.Document);
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        if ((r4 & 4) == 0) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0030 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0031 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a0(boolean z) {
        xc8 xc8Var = this.W4;
        ArrayList arrayList = xc8Var.e;
        if (arrayList == null) {
            return 0;
        }
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            mec mecVar = (mec) xc8Var.e.get(i2);
            if (mecVar.a == 0) {
                byte b = mecVar.b;
                if ((b & 1) == 0) {
                }
                i++;
                if (!z) {
                    return i;
                }
            }
            if (mecVar.k.isEmpty()) {
                continue;
            }
            i++;
            if (!z) {
            }
        }
        return i;
    }

    public final void a1() {
        Activity activity = this.E;
        if (activity instanceof LaunchActivity) {
            ((LaunchActivity) activity).a1.remove(this.t1);
        }
        org.telegram.ui.ActionBar.e eVar = this.l4;
        if (eVar == null || eVar.getFragmentView() == null) {
            return;
        }
        this.l6 = 1.0f;
        View fragmentView = this.l4.getFragmentView();
        fragmentView.setScaleX(1.0f);
        fragmentView.setScaleY(1.0f);
        n12 n12Var = this.b2;
        if (n12Var != null) {
            ex0 ex0Var = n12Var.c;
            ex0Var.setScaleX(1.0f);
            ex0Var.setScaleY(1.0f);
        }
    }

    public final void b(float f, float f2, float f3, boolean z) {
        if (this.Z5 == f && this.W5 == f2 && this.X5 == f3) {
            return;
        }
        this.Q6 = z;
        this.d6 = f;
        this.b6 = f2;
        this.c6 = f3;
        this.m6 = System.currentTimeMillis();
        AnimatorSet animatorSet = new AnimatorSet();
        this.o6 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, sn.g, 0.0f, 1.0f));
        this.o6.setInterpolator(this.s6);
        this.o6.setDuration(250L);
        this.o6.addListener(new wb8(this, (byte) 7));
        this.o6.start();
    }

    public final ClippingImageView[] b0(fd8 fd8Var) {
        int i = (hl.O1() || fd8Var == null || fd8Var.m == null) ? 0 : 1;
        ClippingImageView[] clippingImageViewArr = new ClippingImageView[i + 1];
        clippingImageViewArr[0] = this.i0;
        if (i != 0) {
            sga sgaVar = fd8Var.m;
            clippingImageViewArr[1] = sgaVar;
            sgaVar.setAdditionalTranslationY(fd8Var.n);
        }
        return clippingImageViewArr;
    }

    public final void b1(ClickableSpan clickableSpan, TextView textView) {
        if (textView == null || !(clickableSpan instanceof URLSpan)) {
            clickableSpan.onClick(textView);
            return;
        }
        String url = ((URLSpan) clickableSpan).getURL();
        if (url.startsWith(MediaStreamTrack.VIDEO_TRACK_KIND)) {
            if (this.G2 == null || this.S4 == null) {
                return;
            }
            int intValue = Utilities.z(url).intValue();
            if (this.G2.U() == -9223372036854775807L) {
                this.a3 = intValue / ((float) this.S4.L0());
                return;
            }
            long j = intValue * 1000;
            this.G2.o0(j);
            this.q3.h(true, j / this.G2.U());
            this.r3.invalidate();
            return;
        }
        if (url.startsWith("#")) {
            if (this.E instanceof LaunchActivity) {
                uj3 uj3Var = new uj3(null);
                uj3Var.p2 = url;
                ((LaunchActivity) this.E).u0(uj3Var, false, true);
                A(false, false);
                return;
            }
            return;
        }
        if (this.k4 == null || !((clickableSpan instanceof h8c) || hl.D3(url))) {
            clickableSpan.onClick(textView);
        } else {
            jj.n0(this.k4, url, true, true);
        }
    }

    public final void b2(AlertDialog$Builder alertDialog$Builder) {
        if (this.E != null) {
            try {
                id idVar = this.Q1;
                if (idVar != null) {
                    idVar.dismiss();
                    this.Q1 = null;
                }
            } catch (Exception e) {
                cc4.g(e, true);
            }
            try {
                id o = alertDialog$Builder.o();
                this.Q1 = o;
                o.setCanceledOnTouchOutside(true);
                this.Q1.setOnDismissListener(new o1(this, (byte) 29));
            } catch (Exception e2) {
                cc4.g(e2, true);
            }
        }
    }

    public final void c() {
        int i;
        TLRPC.EncryptedChat encryptedChat;
        if (!V0() || this.d == null || (i = this.O4) < 0) {
            return;
        }
        ArrayList arrayList = this.f7;
        if (i < arrayList.size()) {
            Object obj = arrayList.get(this.O4);
            CharSequence text = c0().getText();
            CharSequence[] charSequenceArr = {text};
            if (this.u7 && !TextUtils.equals(this.v7, text) && this.d.S(this.O4) != 0 && this.d.G() > 0) {
                this.u7 = false;
            }
            ls6 d0 = ls6.d0(this.U);
            zu1 zu1Var = this.k4;
            ArrayList Y = d0.Y(charSequenceArr, zu1Var != null && ((encryptedChat = zu1Var.h) == null || hl.W0(encryptedChat.layer) >= 101), true);
            CharSequence charSequence = charSequenceArr[0];
            this.v7 = charSequence;
            if (obj instanceof no6) {
                no6 no6Var = (no6) obj;
                no6Var.a = charSequence;
                no6Var.n = Y;
            } else if (obj instanceof ro6) {
                ro6 ro6Var = (ro6) obj;
                ro6Var.I = charSequence;
                ro6Var.n = Y;
            }
            if (text.length() != 0 && !this.d.w(this.O4)) {
                V1();
            }
            ed8 ed8Var = this.d;
            if (ed8Var != null) {
                ed8Var.f(text);
            }
        }
    }

    public final ub1 c0() {
        ed8 ed8Var = this.d;
        return (ed8Var == null || !ed8Var.z()) ? this.V1 : this.W1;
    }

    public final void c1(fd8 fd8Var) {
        if (this.v2) {
            w1(true);
        }
        r47 r47Var = this.S4;
        if (r47Var != null && !r47Var.P) {
            xb4.G(this.U).f(this.S4.F0());
        }
        byte b = 0;
        this.e = false;
        this.f = false;
        this.h2 = false;
        this.r4 = true;
        this.S4 = null;
        this.X4 = null;
        this.Y4 = null;
        this.Z4 = null;
        this.a5 = null;
        this.h5 = null;
        this.d5 = null;
        this.r2 = null;
        VideoAds videoAds = this.T4;
        if (videoAds != null) {
            videoAds.stop();
            this.T4 = null;
        }
        if (this.i3 != null) {
            Y1(false, false);
        }
        ic8 ic8Var = this.U1;
        if (ic8Var != null) {
            ic8Var.scrollTo(0, 0);
        }
        this.d2 = 0;
        this.e2 = false;
        this.f2 = false;
        this.g2 = false;
        this.i2 = false;
        mn5 mn5Var = this.i5;
        if (mn5Var != null) {
            mn5Var.a();
            this.i5 = null;
        }
        this.b2 = null;
        e26 e26Var = this.c2;
        if (e26Var != null) {
            e26Var.a();
            this.c2 = null;
        }
        lm lmVar = this.k2;
        if (lmVar != null) {
            lmVar.w(this.f0);
            this.k2 = null;
        }
        for (int i = 0; i < 3; i++) {
            lb8 lb8Var = this.X0[i];
            if (lb8Var != null) {
                lb8Var.d(-1, false, true);
            }
        }
        x1(0);
        mb8 mb8Var = this.X7;
        if (mb8Var != null) {
            mb8Var.a();
        }
        this.o1.d(0, false);
        this.B4.g0(null);
        this.E4.a();
        this.A4.g0(null);
        this.D4.a();
        this.C4.g0(null);
        this.F4.a();
        this.f0.post(new ba8(this, fd8Var, b));
        ed8 ed8Var = this.d;
        if (ed8Var != null) {
            ed8Var.F();
        }
        wd5 wd5Var = this.m1;
        wd5Var.d.clear();
        wd5Var.e.clear();
        wd5Var.c.clear();
        ed8 ed8Var2 = this.d;
        if (ed8Var2 != null) {
            ed8Var2.C();
        }
        this.d = null;
        this.q1.f();
        this.i7 = null;
        this.r4 = false;
        this.t8 = 0.0f;
        this.u8 = 1.0f;
        if (fd8Var != null) {
            fd8Var.a.v0(true, true);
        }
        zu1 zu1Var = this.k4;
        if (zu1Var != null) {
            zu1Var.getFragmentView().invalidate();
        }
        Bitmap bitmap = this.N4;
        if (bitmap != null) {
            bitmap.recycle();
            this.N4 = null;
        }
    }

    public final boolean c2(FrameLayout frameLayout) {
        org.telegram.ui.ActionBar.e eVar = this.l4;
        if (!(eVar instanceof zu1) || !xc2.V(((zu1) eVar).e)) {
            return false;
        }
        v21 f = new d31(frameLayout, this.w2).f(uc7.s1(this.U).k4.p1.f(), new na8(this, (byte) 3));
        f.w = new na8(this, (byte) 4);
        this.s7 = f.j();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(Canvas canvas, int i, int i2, int i3, int i4, float f, u33 u33Var, fo6 fo6Var) {
        float f2;
        byte b;
        float f3;
        int i5;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        int i6;
        byte b2;
        float f10;
        float f11;
        float f12;
        int i7;
        float f13;
        float f14;
        float f15;
        byte b3;
        float f16 = i;
        int i8 = i3;
        float f17 = i8;
        float f18 = f16 / f17;
        float f19 = i2;
        int i10 = i4;
        float f20 = i10;
        float f21 = f19 / f20;
        float min = Math.min(f18, f21);
        int i11 = u33Var.i;
        if (i11 != 90 && i11 != 270) {
            i10 = i8;
            i8 = i10;
        }
        int i12 = this.d2;
        if (i12 == 1 || !((b3 = this.t4) == 3 || this.n6 == 3)) {
            if (this.o6 == null || (i5 = this.n6) == -1) {
                f2 = f17;
                b = this.t4;
                if (b == 2 || b == 3) {
                    f3 = 0.0f;
                }
            } else {
                byte b4 = this.t4;
                f2 = f17;
                if (b4 == 1 || i5 == 1) {
                    f3 = 1.0f;
                } else {
                    f3 = this.k6;
                    if (i5 != 0) {
                        f3 = 1.0f - f3;
                    }
                }
                b = b4;
            }
            float f22 = u33Var.j;
            float f23 = u33Var.k;
            float f24 = i10;
            f4 = 1.0f - f3;
            int z = (int) xnb.z(1.0f - f22, f4, f22, f24);
            f5 = i8;
            int i13 = (int) ((((1.0f - f23) * f4) + f23) * f5);
            f6 = z;
            f7 = f16 / f6;
            f8 = i13;
            if (f7 * f8 > f19) {
                f7 = f19 / f8;
            }
            if (i12 != 1 && ((b != 1 || this.n6 == 0) && fo6Var != null)) {
                float f25 = f6 * f7;
                float f26 = f8 * f7;
                if (f18 * f20 <= f19) {
                    f21 = f18;
                }
                float A = qd4.A((f2 * f21) / f, f25, f4, f25);
                float A2 = qd4.A((f21 * f20) / f, f26, f4, f26);
                canvas.clipRect((-A) / 2.0f, (-A2) / 2.0f, A / 2.0f, A2 / 2.0f);
            }
            i6 = this.d2;
            if (i6 != 1 || u33Var.a) {
                b2 = this.t4;
                if (b2 != 1 || i6 == 1) {
                    float A3 = u33Var.f / qd4.A(u33Var.l, 1.0f, f4, 1.0f);
                    f10 = f16 / f24;
                    if (f10 * f5 > f19) {
                        f10 = f19 / f5;
                    }
                    float f27 = (f10 / min) * A3;
                    if (i6 == 1) {
                        if (b2 == 3 || (i7 = this.n6) == 3) {
                            f12 = ((u33Var.m - 1.0f) * f4) + 1.0f;
                        } else if (i7 == 0) {
                            f12 = u33Var.m;
                        }
                        f27 /= f12;
                    }
                    f11 = f27;
                } else {
                    if (fo6Var != null) {
                        f14 = fo6Var.c;
                        f15 = 1.0f;
                    } else {
                        f14 = 1.0f;
                        f15 = 1.0f;
                    }
                    f11 = ((f7 / min) / qd4.A(f14, f15, f4, f15)) * f14;
                }
                float f28 = f11;
                canvas.translate(u33Var.d * f3, u33Var.e * f3);
                canvas.scale(f28, f28);
                canvas.translate(xnb.C(u33Var.b, f24, min, f3), xnb.C(u33Var.c, f5, min, f3));
                f13 = u33Var.g + i11;
                if (f13 > 180.0f) {
                    f13 -= 360.0f;
                }
                if (this.d2 == 1 || !(this.t4 == 3 || this.n6 == 3)) {
                    canvas.rotate(f13 * f3);
                } else {
                    canvas.rotate(f13);
                }
            }
            int[] iArr = this.S7;
            iArr[0] = z;
            iArr[1] = i13;
        }
        b = b3;
        f2 = f17;
        f3 = 1.0f;
        float f222 = u33Var.j;
        float f232 = u33Var.k;
        float f242 = i10;
        f4 = 1.0f - f3;
        int z2 = (int) xnb.z(1.0f - f222, f4, f222, f242);
        f5 = i8;
        int i132 = (int) ((((1.0f - f232) * f4) + f232) * f5);
        f6 = z2;
        f7 = f16 / f6;
        f8 = i132;
        if (f7 * f8 > f19) {
        }
        if (i12 != 1) {
            float f252 = f6 * f7;
            float f262 = f8 * f7;
            if (f18 * f20 <= f19) {
            }
            float A4 = qd4.A((f2 * f21) / f, f252, f4, f252);
            float A22 = qd4.A((f21 * f20) / f, f262, f4, f262);
            canvas.clipRect((-A4) / 2.0f, (-A22) / 2.0f, A4 / 2.0f, A22 / 2.0f);
        }
        i6 = this.d2;
        if (i6 != 1) {
        }
        b2 = this.t4;
        if (b2 != 1) {
        }
        float A32 = u33Var.f / qd4.A(u33Var.l, 1.0f, f4, 1.0f);
        f10 = f16 / f242;
        if (f10 * f5 > f19) {
        }
        float f272 = (f10 / min) * A32;
        if (i6 == 1) {
        }
        f11 = f272;
        float f282 = f11;
        canvas.translate(u33Var.d * f3, u33Var.e * f3);
        canvas.scale(f282, f282);
        canvas.translate(xnb.C(u33Var.b, f242, min, f3), xnb.C(u33Var.c, f5, min, f3));
        f13 = u33Var.g + i11;
        if (f13 > 180.0f) {
        }
        if (this.d2 == 1) {
        }
        canvas.rotate(f13 * f3);
        int[] iArr2 = this.S7;
        iArr2[0] = z2;
        iArr2[1] = i132;
    }

    public final Bitmap.CompressFormat d0() {
        return this.d2 == 11 ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
    }

    /* JADX WARN: Code restructure failed: missing block: B:191:0x0516, code lost:
    
        if (r2 != 5) goto L199;
     */
    /* JADX WARN: Removed duplicated region for block: B:213:0x09f0  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0c33  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0c4a A[Catch: Exception -> 0x0c61, TryCatch #0 {Exception -> 0x0c61, blocks: (B:295:0x0c3d, B:297:0x0c4a, B:298:0x0c55, B:300:0x0c59), top: B:294:0x0c3d }] */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0c59 A[Catch: Exception -> 0x0c61, TRY_LEAVE, TryCatch #0 {Exception -> 0x0c61, blocks: (B:295:0x0c3d, B:297:0x0c4a, B:298:0x0c55, B:300:0x0c59), top: B:294:0x0c3d }] */
    /* JADX WARN: Removed duplicated region for block: B:304:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0c38  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0bb8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d1(r47 r47Var, TLRPC.FileLocation fileLocation, jn5 jn5Var, jn5 jn5Var2, ArrayList arrayList, ArrayList arrayList2, List list, int i, fd8 fd8Var) {
        float f;
        boolean z;
        int i2;
        mb1 mb1Var;
        mb1 mb1Var2;
        ed8 ed8Var;
        int i3;
        ArrayList arrayList3;
        zu1 zu1Var;
        jn5 jn5Var3;
        ImageView imageView;
        r47 r47Var2;
        TLRPC.BotInlineResult botInlineResult;
        bd8 bd8Var;
        int i4;
        zu1 zu1Var2;
        ed8 ed8Var2;
        f41 f41Var;
        kfc kfcVar;
        r47 r47Var3;
        ed8 ed8Var3;
        zu1 zu1Var3;
        boolean z2;
        TLRPC.MessageAction messageAction;
        int i5;
        nc8 nc8Var;
        TLRPC.WebPage webPage;
        String str;
        TLRPC.Message message;
        int i6 = i;
        this.c = ConnectionsManager.generateClassGuid();
        this.e4 = null;
        this.f4 = false;
        this.S4 = null;
        this.Y4 = null;
        this.Z4 = null;
        this.a5 = null;
        this.d5 = null;
        this.e5 = 0L;
        this.h5 = null;
        this.l5 = false;
        this.X4 = null;
        this.B8 = 0.0f;
        this.A8 = 0L;
        this.O4 = -1;
        String[] strArr = this.b5;
        strArr[0] = null;
        strArr[1] = null;
        strArr[2] = null;
        this.y5 = 0L;
        this.z5 = false;
        this.I5 = 0;
        this.K5 = 0;
        this.t4 = (byte) 0;
        c0().M.b(this.t4 != 0);
        rx5 rx5Var = this.L1;
        if (rx5Var != null) {
            rx5Var.b(this.t4 != 3);
        }
        this.L5 = true;
        this.M5 = false;
        this.N5 = false;
        boolean[] zArr = this.O5;
        zArr[0] = false;
        zArr[1] = this.H5 == 0;
        this.P5 = false;
        this.Q5 = false;
        this.j2 = false;
        this.f0.setTag(1);
        this.Y2 = false;
        this.s1 = false;
        this.X6.clear();
        this.Z6.clear();
        this.b7.clear();
        this.a7.clear();
        this.c7.clear();
        this.e7.clear();
        this.d7.clear();
        this.f7.clear();
        VideoAds videoAds = this.T4;
        if (videoAds != null) {
            videoAds.stop();
            this.T4 = null;
        }
        tl0 tl0Var = this.c0;
        if (tl0Var != null) {
            tl0Var.e();
        }
        this.G.setElevation(0.0f);
        for (int i7 = 0; i7 < 2; i7++) {
            this.Y6[i7].clear();
            this.W6[i7].clear();
        }
        this.V6.clear();
        this.g7 = null;
        this.f0.setPadding(0, 0, 0, 0);
        mn5 mn5Var = this.i5;
        if (mn5Var != null) {
            mn5Var.a();
        }
        this.i5 = fd8Var != null ? fd8Var.e : null;
        this.A5 = fd8Var != null && fd8Var.l;
        this.B5 = (byte) 0;
        this.r0.setText(ob6.M0(2131745075, "ShowAllMedia"));
        R1(this.C0, false, false);
        R1(this.w0, false, true);
        k88 k88Var = this.D1;
        if (k88Var != null) {
            k88Var.setSubtitle(null);
        }
        this.G.setBackgroundColor(this.f2 ? 0 : 2130706432);
        o();
        this.j0.setVisibility(8);
        this.j0.setTag(0);
        cd8 cd8Var = this.O;
        if (cd8Var != null) {
            cd8Var.d(false, false);
        }
        if (this.d2 != 11 && this.o5 != null) {
            this.A7 = false;
            ImageView imageView2 = this.d1;
            if (imageView2 != null) {
                imageView2.setAlpha(1.0f);
            }
            sc8 sc8Var = this.x5;
            if (sc8Var != null) {
                sc8Var.m(false, false);
            }
            this.o5.b();
            ArrayList arrayList4 = this.q5;
            if (arrayList4 != null) {
                arrayList4.clear();
            }
        }
        this.j0.setTranslationY(0.0f);
        this.R1.setTranslationY(0.0f);
        R1(this.D0, false, false);
        gd8 gd8Var = this.T7;
        if (gd8Var != null) {
            gd8Var.setVisibility(4);
            this.U7.setVisibility(4);
            this.T7.setTag(null);
        }
        AnimatorSet animatorSet = this.Z7;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.Z7 = null;
        }
        this.r6 = true;
        this.q6.h = this;
        this.l2 = false;
        this.w = 0;
        this.p0.u(3);
        this.p0.u(5);
        this.p0.u(25);
        this.p0.u(21);
        this.p0.u(23);
        this.p0.u(9);
        this.p0.u(10);
        this.p0.u(12);
        this.p0.u(13);
        this.p0.u(15);
        this.p0.u(14);
        this.p0.u(7);
        this.p0.u(8);
        this.s0.setVisibility(8);
        this.A0.setVisibility(8);
        this.q0.setVisibility(8);
        this.G.setTranslationY(0.0f);
        this.r2 = null;
        this.O0.setAlpha(1.0f);
        this.O0.setTranslationY(0.0f);
        this.O0.setVisibility(8);
        this.G.setTitleRightMargin(0);
        this.P0.setAlpha(1.0f);
        this.P0.setTranslationY(0.0f);
        this.P0.setVisibility(8);
        D2();
        this.Q0.setVisibility(8);
        this.T0.setVisibility(8);
        this.o0.setVisibility(8);
        this.T0.setTranslationY(0.0f);
        this.Q0.setAlpha(1.0f);
        this.T0.setAlpha(1.0f);
        this.Q0.setTranslationY(0.0f);
        this.Z0.setVisibility(8);
        this.Z0.setTag(null);
        this.a1.setVisibility(8);
        this.d1.setVisibility(8);
        this.d1.setTag(null);
        this.V1.E(false, false);
        this.V1.D(false, false);
        this.W1.E(false, false);
        this.c1.setVisibility(8);
        this.b1.setVisibility(8);
        this.Q0.getLayoutParams().height = -2;
        this.n0.setVisibility(8);
        this.m0.setVisibility(8);
        m2(false, false);
        f2(false, false);
        k2(false, false);
        this.Y7.setVisibility(8);
        this.k1.setVisibility(8);
        hl.Q3(1.0f, this.f1, false, false);
        hl.Q3(1.0f, this.g1, false, false);
        hl.Q3(1.0f, this.h1, false, false);
        this.N.a(null, true);
        R1(this.E0, false, true);
        this.r = false;
        s96 s96Var = this.g1;
        if (s96Var != null) {
            s96Var.a(true, false);
        }
        mb8 mb8Var = this.X7;
        if (mb8Var != null) {
            mb8Var.setAlpha(1.0f);
        }
        pb2 pb2Var = this.e1;
        pb2Var.c = false;
        ((mm) pb2Var.f).f(false, true);
        pb2Var.invalidateSelf();
        this.V0.setVisibility(8);
        this.R1.setTag(null);
        this.R1.setVisibility(4);
        k88 k88Var2 = this.D1;
        if (k88Var2 != null) {
            k88Var2.setVisibility(8);
        }
        c98 c98Var = this.J1;
        if (c98Var != null) {
            c98Var.setVisibility(8);
        }
        for (int i8 = 0; i8 < 3; i8++) {
            lb8 lb8Var = this.X0[i8];
            if (lb8Var != null) {
                lb8Var.d(-1, false, true);
            }
        }
        wd5 wd5Var = this.m1;
        if (wd5Var != null) {
            wd5Var.d();
            this.m1.setAnimateBackground(!org.telegram.messenger.a.r());
        }
        ed8 ed8Var4 = this.d;
        if (ed8Var4 != null && ed8Var4.x() > 0) {
            this.I5 = this.d.x();
        }
        if (r47Var != null) {
            this.u1 = org.telegram.messenger.a.b.getSharedPreferences("playback_speed", 0).getFloat("speed" + r47Var.A0() + "_" + r47Var.e1(), 1.0f);
        } else {
            this.u1 = 1.0f;
        }
        S1(false, true);
        this.a.a(this.g2, false);
        boolean z3 = r47Var != null && (uc7.s1(this.U).E2(r47Var.A0()) || (((message = r47Var.k) != null && message.noforwards) || r47Var.y2()));
        try {
            if (r47Var != null && arrayList == null) {
                TLRPC.Message message2 = r47Var.k;
                if (message2 != null && (r47.n1(message2) instanceof TLRPC.TL_messageMediaWebPage) && r47.n1(r47Var.k).webpage != null && (str = (webPage = r47.n1(r47Var.k).webpage).site_name) != null) {
                    String lowerCase = str.toLowerCase();
                    if (lowerCase.equals("instagram") || lowerCase.equals("twitter") || "telegram_album".equals(webPage.type)) {
                        TextUtils.isEmpty(webPage.author);
                        if (webPage.cached_page instanceof TL_iv.TL_page) {
                            for (int i10 = 0; i10 < webPage.cached_page.blocks.size() && !(webPage.cached_page.blocks.get(i10) instanceof TL_iv.pageBlockAuthorDate); i10++) {
                            }
                        }
                        ArrayList l2 = r47Var.l2();
                        if (!l2.isEmpty()) {
                            this.w = r47Var.e1();
                            this.M5 = false;
                            this.X6.addAll(l2);
                            this.I5 = this.X6.size();
                            int indexOf = this.X6.indexOf(r47Var);
                            if (indexOf < 0) {
                                indexOf = 0;
                            }
                            K1(indexOf);
                        }
                    }
                }
                if (r47Var.x()) {
                    this.B5 = (byte) 1;
                    this.r0.setText(ob6.M0(2131745077, "ShowAllFiles"));
                } else if (r47Var.q3()) {
                    this.B5 = (byte) 5;
                    this.r0.setText(ob6.M0(2131745076, "ShowAllGIFs"));
                }
                if (this.s4 && ((nc8Var = this.g0) == null || !nc8Var.y)) {
                    this.j0.setTag(null);
                    this.j0.setVisibility(8);
                }
                if (this.w == 0) {
                    this.X6.add(r47Var);
                    this.p0.Q(25, (z3 || !r47Var.Q3() || r47Var.D3()) ? false : true);
                    int i11 = 0;
                    if (r47Var.T != 0) {
                        this.M5 = false;
                    } else if (this.k2 != null) {
                        this.M5 = false;
                        if (r47Var.w() && !z3) {
                            R1(this.C0, true, false);
                        }
                    } else if (!r47Var.r1 && !r47Var.Z3() && !r47Var.q4() && !(r47.n1(r47Var.k) instanceof TLRPC.TL_messageMediaInvoice) && !(r47.n1(r47Var.k) instanceof TLRPC.TL_messageMediaWebPage) && ((messageAction = r47Var.k.action) == null || (messageAction instanceof TLRPC.TL_messageActionEmpty))) {
                        this.M5 = true;
                        this.Y6[0].put(r47Var.e1(), r47Var);
                        zu1 zu1Var4 = this.k4;
                        if (zu1Var4 != null) {
                            i5 = (zu1Var4.k8() || (r2 = this.k4.g4) == 3) ? 5 : 5;
                            i11 = 0;
                            R1(this.C0, !z3, false);
                        }
                        this.p0.R(i5);
                        long A0 = r47Var.A0();
                        boolean B = A0 < 0 ? xc2.B(uc7.s1(r47Var.K1).M0(Long.valueOf(-A0))) : true;
                        s7 s7Var = this.p0;
                        if (B) {
                            s7Var.R(21);
                        } else {
                            s7Var.u(21);
                        }
                        this.p0.R(3);
                        i11 = 0;
                        R1(this.C0, !z3, false);
                    } else if (this.s4 && r47Var.T == 0) {
                        i11 = 0;
                        R1(this.C0, true, false);
                    } else {
                        i11 = 0;
                    }
                    K1(i11);
                }
            } else if (arrayList2 != null) {
                this.d7.addAll(arrayList2);
                K1(i6);
            } else if (fileLocation != null) {
                long j = fd8Var != null ? fd8Var.f : 0L;
                this.y5 = j;
                this.z5 = fd8Var != null && fd8Var.p;
                if (jn5Var != null || j == 0) {
                    jn5Var3 = jn5Var;
                } else {
                    int i12 = this.U;
                    jn5Var3 = j > 0 ? jn5.m(this.U, 0, uc7.s1(i12).X1(Long.valueOf(this.y5))) : jn5.m(this.U, 0, uc7.s1(i12).M0(Long.valueOf(-this.y5)));
                }
                if (jn5Var3 == null) {
                    return;
                }
                this.Z6.add(jn5Var3);
                this.a7.add(jn5Var2 != null ? jn5Var2 : jn5Var3);
                this.g7 = jn5Var3;
                this.b7.add(Long.valueOf(fd8Var != null ? fd8Var.g : 0L));
                this.c7.add(null);
                this.e7.add(new TLRPC.TL_photoEmpty());
                this.l2 = true;
                this.p0.u(3);
                this.p0.R(9);
                K1(0);
                if (this.d2 == 1) {
                    if (T2()) {
                        this.o0.setVisibility(0);
                    } else {
                        this.T0.setVisibility(0);
                    }
                    this.T0.setTranslationY(0.0f);
                    this.T0.setAlpha(1.0f);
                    View view = this.k0;
                    if (view != null) {
                        view.setVisibility(0);
                        this.k0.setAlpha(1.0f);
                    }
                    this.j0.setVisibility(8);
                    this.j0.setTag(null);
                    this.f0.setTag(null);
                }
            } else {
                if (arrayList != null) {
                    while (i3 < arrayList.size()) {
                        r47 r47Var4 = (r47) arrayList.get(i3);
                        if (i3 != i6) {
                            i3 = r47Var4.x3() ? i3 + 1 : 0;
                        } else {
                            i6 = this.X6.size();
                        }
                        this.X6.add(r47Var4);
                    }
                    int i13 = 0;
                    while (true) {
                        int size = this.X6.size();
                        arrayList3 = this.X6;
                        if (i13 >= size) {
                            break;
                        }
                        r47 r47Var5 = (r47) arrayList3.get(i13);
                        this.Y6[r47Var5.A0() == this.D5 ? (char) 0 : (char) 1].put(r47Var5.e1(), r47Var5);
                        i13++;
                    }
                    r47 r47Var6 = (r47) arrayList3.get(i6);
                    this.p0.Q(25, !z3 && r47Var6.Q3());
                    if (r47Var6.r1 || r47Var6.Z3() || r47Var6.q4() || ((zu1Var = this.k4) != null && zu1Var.k8())) {
                        this.I5 = this.X6.size();
                    } else {
                        this.P5 = this.k4 == null;
                        if (this.l4 instanceof ProfileActivity) {
                            this.Q5 = true;
                        }
                        if (fd8Var != null) {
                            this.J5 = fd8Var.q;
                        }
                        this.p0.R(5);
                        long A02 = r47Var6.A0();
                        boolean B2 = A02 < 0 ? xc2.B(uc7.s1(r47Var6.K1).M0(Long.valueOf(-A02))) : true;
                        s7 s7Var2 = this.p0;
                        if (B2) {
                            s7Var2.R(21);
                        } else {
                            s7Var2.u(21);
                        }
                        if (r47Var6.w() && !z3) {
                            R1(this.C0, true, false);
                        }
                        if (r47Var6.x()) {
                            this.B5 = (byte) 1;
                            this.r0.setText(ob6.M0(2131745077, "ShowAllFiles"));
                        } else if (r47Var6.q3()) {
                            this.B5 = (byte) 5;
                            this.r0.setText(ob6.M0(2131745076, "ShowAllGIFs"));
                        }
                    }
                    K1(i6);
                    f = 1.0f;
                } else if (list != null) {
                    int i14 = this.d2;
                    if (i14 != -1 && !this.e2 && !this.f2 && ((i14 == 0 || i14 == 4 || ((i14 == 2 || i14 == 5) && list.size() > 1)) && !this.f4)) {
                        this.O0.setVisibility(0);
                        this.P0.setVisibility(0);
                        D2();
                    }
                    pb8 pb8Var = this.V1;
                    int i15 = this.d2;
                    pb8Var.C(i15 != -1 && (i15 == 2 || i15 == 5) && this.d.h());
                    qb8 qb8Var = this.W1;
                    int i16 = this.d2;
                    qb8Var.C(i16 != -1 && (i16 == 2 || i16 == 5) && this.d.h());
                    this.p0.setVisibility(8);
                    this.p0.Q(25, false);
                    this.f7.addAll(list);
                    Object obj = this.f7.get(i6);
                    int i17 = this.d2;
                    if (i17 == -1 || !(obj instanceof no6)) {
                        boolean z4 = obj instanceof TLRPC.BotInlineResult;
                        ImageView imageView3 = this.a1;
                        if (z4) {
                            imageView3.setVisibility(8);
                            this.c1.setVisibility(8);
                            this.b1.setVisibility(8);
                        } else {
                            imageView3.setVisibility((!(obj instanceof ro6) || ((ro6) obj).H) ? 8 : 0);
                            this.c1.setVisibility(8);
                            this.b1.setVisibility(8);
                            if (this.a1.getVisibility() == 0) {
                                z = true;
                            }
                        }
                        z = false;
                    } else {
                        if (i17 == 10) {
                            this.a1.setVisibility(8);
                            this.c1.setVisibility(8);
                            this.b1.setVisibility(8);
                        } else if (this.i2) {
                            this.a1.setVisibility(8);
                            this.c1.setVisibility(8);
                            this.b1.setVisibility(8);
                            this.n0.setVisibility(0);
                            this.m0.setVisibility(0);
                            this.Q0.getLayoutParams().height = hl.L(84.0f);
                        } else {
                            boolean z5 = ((no6) obj).b;
                            ImageView imageView4 = this.a1;
                            if (z5) {
                                imageView4.setVisibility(8);
                                this.c1.setVisibility(8);
                                this.b1.setVisibility(8);
                                this.j0.setVisibility(0);
                                this.j0.setTag(1);
                                this.j0.setTranslationY(-hl.L(48.0f));
                            } else {
                                imageView4.setVisibility(i17 != 1 ? 0 : 8);
                                this.c1.setVisibility(this.d2 != 1 ? 8 : 0);
                                this.b1.setVisibility(this.d2 != 1 ? 8 : 0);
                            }
                        }
                        z = !this.i2;
                    }
                    this.j2 = z && ((ed8Var = this.d) == null || ed8Var.y());
                    if (this.k4 != null && (mb1Var2 = this.V1.N) != null) {
                        mb1Var2.getAdapter().V(this.k4.r8);
                        this.V1.N.getAdapter().f0 = this.k4.e != null;
                        this.V1.N.getAdapter().g0 = false;
                    }
                    if (this.k4 == null || (mb1Var = this.W1.N) == null) {
                        i2 = 0;
                    } else {
                        mb1Var.getAdapter().V(this.k4.r8);
                        this.W1.N.getAdapter().f0 = this.k4.e != null;
                        i2 = 0;
                        this.W1.N.getAdapter().g0 = false;
                    }
                    if (this.d2 != -1) {
                        if (!this.g2) {
                            this.Q0.setVisibility(i2);
                        }
                        if (T2()) {
                            this.o0.setVisibility(i2);
                        } else if (!this.g2) {
                            this.T0.setVisibility(i2);
                            this.T0.setTranslationY(0.0f);
                            this.T0.setAlpha(1.0f);
                        }
                        View view2 = this.k0;
                        if (view2 == null || (this.R4 && this.d2 != 11)) {
                            f = 1.0f;
                        } else {
                            view2.setVisibility(0);
                            f = 1.0f;
                            this.k0.setAlpha(1.0f);
                        }
                        this.j0.setVisibility(8);
                        this.j0.setTag(null);
                        this.f0.setTag(null);
                    } else {
                        f = 1.0f;
                    }
                    K1(i6);
                    int i18 = this.d2;
                    if (i18 == 1) {
                        this.Z0.setVisibility(0);
                        this.d1.setVisibility(0);
                    } else if (i18 == 4 || i18 == 5) {
                        this.Z0.setVisibility(8);
                        this.d1.setVisibility(8);
                    } else {
                        ImageView imageView5 = this.Z0;
                        imageView5.setVisibility(imageView5.getTag() != null ? 0 : 8);
                        ImageView imageView6 = this.d1;
                        imageView6.setVisibility(imageView6.getTag() != null ? 0 : 8);
                    }
                    O2();
                } else {
                    f = 1.0f;
                    K1(i6);
                }
                imageView = this.d1;
                if (imageView != null) {
                    imageView.setAlpha(this.A7 ? 0.4f : f);
                }
                this.r2 = null;
                if (this.k2 == null && !this.A5) {
                    if (this.D5 != 0 || this.I5 != 0 || (r47Var3 = this.S4) == null || r47Var3.r1) {
                        if (this.y5 != 0 && this.d.s()) {
                            this.r2 = uc7.s1(this.U).U0(this.y5);
                            jn7.f(this.U).k(jn7.g3, this.r2);
                        }
                    } else if (this.G5 && (zu1Var3 = this.k4) != null) {
                        ArrayList R6 = zu1Var3.R6();
                        if (R6 != null) {
                            this.X6.clear();
                            for (int i19 = 0; i19 < R6.size(); i19++) {
                                r47 r47Var7 = (r47) R6.get(i19);
                                if (ls6.h0(r47Var7.k) == this.B5 && !r47Var7.x3()) {
                                    this.X6.add(r47Var7);
                                    this.Y6[0].put(r47Var7.e1(), r47Var7);
                                }
                            }
                            Collections.sort(this.X6, new qq7((byte) 5));
                            this.O4 = -1;
                            for (int i20 = 0; i20 < this.X6.size(); i20++) {
                                if (this.X6.get(i20) == this.S4 || ((r47) this.X6.get(i20)).e1() == this.S4.e1()) {
                                    this.O4 = i20;
                                }
                            }
                            if (this.O4 < 0) {
                                this.O4 = this.X6.size();
                                this.X6.add(this.S4);
                                z2 = false;
                                this.Y6[0].put(this.S4.e1(), this.S4);
                            } else {
                                z2 = false;
                            }
                            M1();
                            cd8 cd8Var2 = this.O;
                            if (cd8Var2 != null) {
                                cd8Var2.d(true, z2);
                                this.O.b(this.O4 + 1, this.X6.size(), z2);
                            }
                        } else {
                            z2 = false;
                        }
                        this.L5 = z2;
                    } else if (ls6.h0(r47Var3.k) == this.B5 && ((ed8Var3 = this.d) == null || !ed8Var3.K())) {
                        ls6.d0(this.U).f0(this.B5, this.c, this.D5, this.C5, true);
                        if (this.H5 != 0) {
                            ls6.d0(this.U).f0(this.B5, this.c, this.H5, this.C5, true);
                        }
                    }
                }
                r47Var2 = this.S4;
                if (!(r47Var2 == null && r47Var2.G4()) && (((botInlineResult = this.X4) == null || !(botInlineResult.type.equals(MediaStreamTrack.VIDEO_TRACK_KIND) || r47.J4(this.X4.document))) && ((bd8Var = this.i7) == null || !(bd8Var.a(i6) || this.i7.e(i6))))) {
                    i4 = -1;
                    if (this.d2 == -1 || !((no6) this.f7.get(i6)).b) {
                        if (!this.f7.isEmpty()) {
                            Object obj2 = this.f7.get(i6);
                            zu1 zu1Var5 = this.k4;
                            TLRPC.User h = zu1Var5 != null ? zu1Var5.h() : null;
                            boolean z6 = !this.i2 && (!((zu1Var2 = this.k4) == null || zu1Var2.y() || this.k4.X7() || h == null || h.bot || lbc.D(h) || ((f41Var = this.k4.Y1) != null && f41Var.E3 != null)) || (this.k4 == null && (ed8Var2 = this.d) != null && ed8Var2.i()));
                            ed8 ed8Var5 = this.d;
                            if (ed8Var5 != null && ed8Var5.V() != null) {
                                z6 = false;
                            }
                            if (obj2 instanceof TLRPC.BotInlineResult) {
                                z6 = false;
                            } else if (z6 && (obj2 instanceof ro6)) {
                                z6 = !((ro6) obj2).H;
                            }
                            this.V1.E(z6, true);
                            this.W1.E(z6, true);
                        }
                        s();
                        kfc kfcVar2 = this.G2;
                        this.t7 = kfcVar2 != null ? kfcVar2.T() : i4;
                        go.b(0);
                        if (lh2.t().w()) {
                            lh2.t().T(j0());
                        }
                        kfcVar = this.G2;
                        if (kfcVar != null) {
                            go.z(kfcVar.c0());
                            return;
                        }
                        return;
                    }
                } else {
                    i4 = -1;
                }
                this.Y2 = true;
                Y0(false);
                s();
                kfc kfcVar22 = this.G2;
                this.t7 = kfcVar22 != null ? kfcVar22.T() : i4;
                go.b(0);
                if (lh2.t().w()) {
                }
                kfcVar = this.G2;
                if (kfcVar != null) {
                }
            }
            go.b(0);
            if (lh2.t().w()) {
            }
            kfcVar = this.G2;
            if (kfcVar != null) {
            }
        } catch (Exception e) {
            cc4.f(e);
            return;
        }
        f = 1.0f;
        imageView = this.d1;
        if (imageView != null) {
        }
        this.r2 = null;
        if (this.k2 == null) {
            if (this.D5 != 0) {
            }
            if (this.y5 != 0) {
                this.r2 = uc7.s1(this.U).U0(this.y5);
                jn7.f(this.U).k(jn7.g3, this.r2);
            }
        }
        r47Var2 = this.S4;
        if (r47Var2 == null) {
        }
        i4 = -1;
        if (this.d2 == -1) {
        }
        if (!this.f7.isEmpty()) {
        }
        s();
        kfc kfcVar222 = this.G2;
        this.t7 = kfcVar222 != null ? kfcVar222.T() : i4;
    }

    public final void d2() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.w2, this.E);
        String M0 = ob6.M0(R.string.AppName, null);
        id idVar = alertDialog$Builder.a;
        idVar.S = M0;
        alertDialog$Builder.j(ob6.M0(2131747558, "OK"), null);
        r47 r47Var = this.S4;
        if (r47Var != null && r47.K4(r47Var.k) && xb4.G(this.S4.K1).S(this.b5[0])) {
            idVar.U = ob6.M0(2131746931, null);
        } else {
            idVar.U = ob6.M0(2131746945, null);
        }
        b2(alertDialog$Builder);
    }

    /* JADX WARN: Code restructure failed: missing block: B:413:0x065c, code lost:
    
        if (r47.B0(((r47) c00.g(1, r22.V6)).k) != r22.H5) goto L370;
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x069d, code lost:
    
        r1 = 1;
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:439:0x069b, code lost:
    
        if (r47.B0(((r47) r22.V6.get(0)).k) != r22.H5) goto L370;
     */
    @Override // fn7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        ArrayList arrayList;
        SparseArray[] sparseArrayArr;
        int i3;
        r47 r47Var;
        int i4;
        int e1;
        int i5;
        char c;
        TLRPC.Chat M0;
        TLRPC.User user;
        jn5 m;
        ArrayList<TLRPC.PhotoSize> arrayList2;
        int i6;
        long j;
        r47 r47Var2;
        TLRPC.Document F0;
        r47 r47Var3;
        TLRPC.BotInlineResult botInlineResult;
        bd8 bd8Var;
        float f = 1.0f;
        int i7 = 3;
        int i8 = 2;
        boolean z = true;
        int i10 = 0;
        r7 = false;
        boolean z2 = false;
        if (i == jn7.Z1) {
            String str = (String) objArr[0];
            for (int i11 = 0; i11 < 3; i11++) {
                String str2 = this.b5[i11];
                if (str2 != null && str2.equals(str)) {
                    if (i11 == 0 || ((i11 == 1 && this.r1 == this.C4) || (i11 == 2 && this.r1 == this.A4))) {
                        z2 = true;
                    }
                    this.X0[i11].f(z2, 1.0f);
                    v(i11, true);
                    return;
                }
            }
            return;
        }
        if (i == jn7.u3) {
            A(false, false);
            return;
        }
        if (i == jn7.Y1) {
            String str3 = (String) objArr[0];
            int i12 = 0;
            while (i12 < 3) {
                String str4 = this.b5[i12];
                if (str4 != null && str4.equals(str3)) {
                    boolean z3 = i12 == 0 || (i12 == 1 && this.r1 == this.C4) || (i12 == 2 && this.r1 == this.A4);
                    this.X0[i12].f(z3, 1.0f);
                    v(i12, z3);
                    if (this.G2 == null && i12 == 0 && (((r47Var3 = this.S4) != null && r47.K4(r47Var3.k)) || (((botInlineResult = this.X4) != null && (botInlineResult.type.equals(MediaStreamTrack.VIDEO_TRACK_KIND) || r47.J4(this.X4.document))) || ((bd8Var = this.i7) != null && (bd8Var.a(this.O4) || this.i7.e(this.O4)))))) {
                        Y0(false);
                    }
                    if (i12 != 0 || this.G2 == null) {
                        return;
                    }
                    this.g5 = true;
                    return;
                }
                i12++;
            }
            return;
        }
        if (i == jn7.X1) {
            String str5 = (String) objArr[0];
            int i13 = 0;
            while (i13 < i7) {
                String str6 = this.b5[i13];
                if (str6 != null && str6.equals(str5)) {
                    float min = Math.min(f, ((Long) objArr[1]).longValue() / ((Long) objArr[2]).longValue());
                    this.X0[i13].f(i13 == 0 || (i13 == 1 && this.r1 == this.C4) || (i13 == 2 && this.r1 == this.A4), min);
                    if (i13 == 0 && this.G2 != null && this.q3 != null) {
                        if (this.g5) {
                            i6 = i7;
                            j = -9223372036854775807L;
                        } else {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            j = -9223372036854775807L;
                            if (Math.abs(elapsedRealtime - this.S3) >= 500) {
                                float f2 = this.a3;
                                if (f2 == 0.0f) {
                                    long U = this.G2.U();
                                    i6 = i7;
                                    long S = this.G2.S();
                                    f2 = (U < 0 || U == -9223372036854775807L || S < 0) ? 0.0f : S / U;
                                } else {
                                    i6 = i7;
                                }
                                f = this.Q3 ? xb4.G(this.U).t(this.b5[0], f2) : 1.0f;
                                this.S3 = elapsedRealtime;
                            } else {
                                i6 = i7;
                                f = -1.0f;
                            }
                        }
                        if (f != -1.0f) {
                            this.q3.f(f);
                            this.V8 = f;
                            this.r3.invalidate();
                        }
                        if (this.Q3 && this.E != null && !this.f3 && this.G2 != null && (r47Var2 = this.S4) != null && (F0 = r47Var2.F0()) != null && this.S4.L0() >= 20.0d) {
                            boolean z4 = F0.size >= 2147483648L;
                            if ((lq3.q(this.U).l() & 4) != 0 && min < 0.9f) {
                                long j2 = F0.size;
                                if (j2 * min >= 5242880.0f || (min >= 0.5f && j2 >= 2097152)) {
                                    if (Math.abs(SystemClock.elapsedRealtime() - this.g3) >= (z4 ? 10000 : 3000)) {
                                        if (this.G2.U() == j) {
                                            Toast.makeText(this.E, ob6.M0(2131743250, null), 1).show();
                                        }
                                        this.f3 = true;
                                    }
                                }
                            }
                        }
                        i13++;
                        i7 = i6;
                        f = 1.0f;
                    }
                }
                i6 = i7;
                i13++;
                i7 = i6;
                f = 1.0f;
            }
            return;
        }
        if (i == jn7.g3) {
            dc7 dc7Var = (dc7) objArr[0];
            if (this.y5 == dc7Var.a) {
                this.r2 = dc7Var;
                ArrayList arrayList3 = new ArrayList(dc7Var.b);
                if (this.y5 > 0) {
                    TLRPC.UserFull Y1 = uc7.s1(this.U).Y1(this.y5);
                    TLRPC.User X1 = uc7.s1(this.U).X1(Long.valueOf(this.y5));
                    if (Y1 != null) {
                        TLRPC.Photo photo = Y1.personal_photo;
                        if (photo instanceof TLRPC.TL_photo) {
                            arrayList3.add(0, photo);
                        }
                    }
                    if (X1 != null && X1.self && lbc.s(Y1)) {
                        arrayList3.add(Y1.fallback_photo);
                    }
                }
                this.Z6.clear();
                this.b7.clear();
                this.a7.clear();
                this.c7.clear();
                this.e7.clear();
                int i14 = -1;
                for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                    TLRPC.Photo photo2 = (TLRPC.Photo) arrayList3.get(i15);
                    if (photo2 == null || (photo2 instanceof TLRPC.TL_photoEmpty) || (arrayList2 = photo2.sizes) == null) {
                        this.Z6.add(null);
                        this.b7.add(null);
                        this.a7.add(null);
                        this.c7.add(null);
                        this.e7.add(null);
                    } else {
                        TLRPC.PhotoSize w = xb4.w(arrayList2, 640, false, null, false);
                        TLRPC.VideoSize x = photo2.video_sizes.isEmpty() ? null : xb4.x(1000, photo2.video_sizes);
                        if (w != null) {
                            if (i14 == -1 && this.Y4 != null) {
                                int i16 = 0;
                                while (true) {
                                    if (i16 >= photo2.sizes.size()) {
                                        break;
                                    }
                                    TLRPC.FileLocation fileLocation = photo2.sizes.get(i16).location;
                                    if (fileLocation != null) {
                                        int i17 = fileLocation.local_id;
                                        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = this.Y4.f;
                                        if (i17 == tL_fileLocationToBeDeprecated.local_id && fileLocation.volume_id == tL_fileLocationToBeDeprecated.volume_id) {
                                            i14 = this.Z6.size();
                                            break;
                                        }
                                    }
                                    i16++;
                                }
                            }
                            if (i14 == -1 && this.Y4 != null) {
                                int i18 = 0;
                                while (true) {
                                    if (i18 >= photo2.video_sizes.size()) {
                                        break;
                                    }
                                    TLRPC.FileLocation fileLocation2 = photo2.video_sizes.get(i18).location;
                                    if (fileLocation2 != null) {
                                        int i19 = fileLocation2.local_id;
                                        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated2 = this.Y4.f;
                                        if (i19 == tL_fileLocationToBeDeprecated2.local_id && fileLocation2.volume_id == tL_fileLocationToBeDeprecated2.volume_id) {
                                            i14 = this.Z6.size();
                                            break;
                                        }
                                    }
                                    i18++;
                                }
                            }
                            int i20 = photo2.dc_id;
                            if (i20 != 0) {
                                TLRPC.FileLocation fileLocation3 = w.location;
                                fileLocation3.dc_id = i20;
                                fileLocation3.file_reference = photo2.file_reference;
                            }
                            jn5 i21 = jn5.i(w, photo2);
                            jn5 j3 = x != null ? jn5.j(x, photo2) : i21;
                            if (i21 != null) {
                                this.Z6.add(i21);
                                this.b7.add(j3 != null ? Long.valueOf(j3.r) : null);
                                this.a7.add(j3);
                                this.c7.add(null);
                                this.e7.add(photo2);
                            }
                        }
                    }
                }
                boolean isEmpty = this.e7.isEmpty();
                s7 s7Var = this.p0;
                if (isEmpty) {
                    s7Var.u(7);
                } else {
                    s7Var.S(7);
                }
                this.M5 = false;
                this.O4 = -1;
                if (i14 != -1) {
                    K1(i14);
                    return;
                }
                long j4 = this.y5;
                int i22 = this.U;
                if (j4 > 0) {
                    user = uc7.s1(i22).X1(Long.valueOf(this.y5));
                    M0 = null;
                } else {
                    M0 = uc7.s1(i22).M0(Long.valueOf(-this.y5));
                    user = null;
                }
                if (user != null) {
                    m = jn5.m(this.U, 0, user);
                } else if (M0 == null) {
                    return;
                } else {
                    m = jn5.m(this.U, 0, M0);
                }
                if (m != null) {
                    if (!this.Z6.isEmpty() && this.Z6.get(0) != null && ((jn5) this.Z6.get(0)).s == m.s) {
                        this.Z6.remove(0);
                        this.e7.remove(0);
                        this.b7.remove(0);
                        this.a7.remove(0);
                        this.c7.remove(0);
                    }
                    this.Z6.add(0, m);
                    this.e7.add(0, new TLRPC.TL_photoEmpty());
                    ArrayList arrayList4 = this.b7;
                    jn5 jn5Var = this.Z4;
                    arrayList4.add(0, jn5Var != null ? Long.valueOf(jn5Var.r) : null);
                    this.a7.add(0, this.Z4);
                    this.c7.add(0, null);
                    K1(0);
                    return;
                }
                return;
            }
            return;
        }
        if (i == jn7.W) {
            long longValue = ((Long) objArr[0]).longValue();
            long longValue2 = ((Long) objArr[1]).longValue();
            if (this.C5 == longValue2) {
                if (longValue == this.D5 || longValue == this.H5) {
                    r47 r47Var4 = this.S4;
                    if (r47Var4 == null || ls6.h0(r47Var4.k) == this.B5) {
                        if (longValue == this.D5) {
                            this.I5 = ((Integer) objArr[2]).intValue();
                        } else {
                            this.K5 = ((Integer) objArr[2]).intValue();
                        }
                        if (this.M5 && this.L5) {
                            this.L5 = false;
                            this.N5 = true;
                            ls6.d0(this.U).P0(this.D5, 20, 0, 0, this.B5, longValue2, 1, this.c, 0, this.E5, null);
                            return;
                        } else {
                            if (this.X6.isEmpty()) {
                                return;
                            }
                            P1(true, true, false, this.P4);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (i == jn7.V) {
            long longValue3 = ((Long) objArr[0]).longValue();
            int intValue = ((Integer) objArr[3]).intValue();
            long j5 = this.D5;
            if ((longValue3 == j5 || longValue3 == this.H5) && intValue == this.c) {
                this.N5 = false;
                char c2 = longValue3 == j5 ? (char) 0 : (char) 1;
                ArrayList arrayList5 = (ArrayList) objArr[2];
                this.O5[c2 == true ? 1 : 0] = ((Boolean) objArr[5]).booleanValue();
                boolean booleanValue = ((Boolean) objArr[6]).booleanValue();
                if (!this.M5) {
                    int i23 = 0;
                    for (int i24 = 0; i24 < arrayList5.size(); i24++) {
                        r47 r47Var5 = (r47) arrayList5.get(booleanValue ? (arrayList5.size() - 1) - i24 : i24);
                        if (this.Y6[c2 == true ? 1 : 0].indexOfKey(r47Var5.e1()) < 0) {
                            i23++;
                            boolean z5 = this.P5;
                            ArrayList arrayList6 = this.X6;
                            if (!z5) {
                                arrayList6.add(0, r47Var5);
                            } else if (booleanValue) {
                                arrayList6.add(0, r47Var5);
                                int i25 = this.J5 - 1;
                                this.J5 = i25;
                                this.O4++;
                                if (i25 < 0) {
                                    this.J5 = 0;
                                }
                            } else {
                                arrayList6.add(r47Var5);
                            }
                            this.Y6[c2 == true ? 1 : 0].put(r47Var5.e1(), r47Var5);
                        }
                    }
                    if (this.P5) {
                        if (i23 != 0 || booleanValue) {
                            return;
                        }
                        this.I5 = this.X6.size() + this.J5;
                        this.K5 = 0;
                        return;
                    }
                    if (i23 == 0) {
                        this.I5 = this.X6.size();
                        this.K5 = 0;
                        return;
                    } else {
                        int i26 = this.O4;
                        this.O4 = -1;
                        K1(i26 + i23);
                        return;
                    }
                }
                if ((arrayList5.isEmpty() && (c2 != 0 || this.H5 == 0)) || (i4 = this.O4) < 0 || i4 >= this.X6.size()) {
                    this.M5 = false;
                    return;
                }
                r47 r47Var6 = (r47) this.X6.get(this.O4);
                int i27 = -1;
                int i28 = 0;
                for (int i29 = 0; i29 < arrayList5.size(); i29++) {
                    r47 r47Var7 = (r47) arrayList5.get(i29);
                    if (!r47Var7.x3() && this.W6[c2 == true ? 1 : 0].indexOfKey(r47Var7.e1()) < 0) {
                        this.W6[c2 == true ? 1 : 0].put(r47Var7.e1(), r47Var7);
                        boolean z6 = this.P5;
                        ArrayList arrayList7 = this.V6;
                        if (z6) {
                            arrayList7.add(r47Var7);
                            if (r47Var7.e1() == r47Var6.e1()) {
                                i27 = i28;
                            }
                            i28++;
                        } else {
                            i28++;
                            arrayList7.add(0, r47Var7);
                            if (r47Var7.e1() == r47Var6.e1()) {
                                i27 = arrayList5.size() - i28;
                            }
                        }
                    }
                }
                if (i28 == 0 && (c2 != 0 || this.H5 == 0)) {
                    this.I5 = this.X6.size();
                    this.K5 = 0;
                }
                if (i27 != -1) {
                    this.X6.clear();
                    this.X6.addAll(this.V6);
                    for (int i30 = 0; i30 < 2; i30++) {
                        this.Y6[i30] = this.W6[i30].clone();
                        this.W6[i30].clear();
                    }
                    this.V6.clear();
                    this.M5 = false;
                    this.O4 = -1;
                    if (i27 >= this.X6.size()) {
                        i27 = this.X6.size() - 1;
                    }
                    K1(i27);
                    return;
                }
                boolean z7 = this.P5;
                ArrayList arrayList8 = this.V6;
                if (z7) {
                    e1 = arrayList8.isEmpty() ? 0 : ((r47) c00.g(1, this.V6)).e1();
                    if (c2 == 0 && this.O5[c2 == true ? 1 : 0] && this.H5 != 0) {
                        if (!this.V6.isEmpty()) {
                        }
                        i5 = e1;
                        c = 1;
                    }
                    i5 = e1;
                    c = c2;
                } else {
                    e1 = arrayList8.isEmpty() ? 0 : ((r47) this.V6.get(0)).e1();
                    if (c2 == 0 && this.O5[c2 == true ? 1 : 0] && this.H5 != 0) {
                        if (!this.V6.isEmpty()) {
                        }
                        i5 = e1;
                        c = 1;
                    }
                    i5 = e1;
                    c = c2;
                }
                if (this.O5[c]) {
                    return;
                }
                this.N5 = true;
                ls6.d0(this.U).P0(c == 0 ? this.D5 : this.H5, 40, i5, 0, this.B5, this.C5, 1, this.c, 0, this.E5, null);
                return;
            }
            return;
        }
        if (i == jn7.l4) {
            wc8 wc8Var = this.R1;
            if (wc8Var != null) {
                wc8Var.getCurrentView().invalidate();
                wc8Var.getNextView().invalidate();
                return;
            }
            return;
        }
        if (i == jn7.c2) {
            r47 r47Var8 = (r47) objArr[0];
            if (this.F8) {
                this.F8 = false;
                this.V7.setVisibility(4);
                t1(this.U4, this.V4, false, false, this.W4.d, false, 0L);
                return;
            } else if (this.E8) {
                w1(false);
                this.E8 = !MediaController.z().j0(this.D8, true, true, false);
                return;
            } else {
                if (r47Var8 == this.D8) {
                    this.H8 = false;
                    this.V7.setVisibility(4);
                    return;
                }
                return;
            }
        }
        if (i == jn7.b2) {
            if (((r47) objArr[0]) == this.D8) {
                String str7 = (String) objArr[1];
                long longValue4 = ((Long) objArr[3]).longValue();
                this.X0[0].f(true, ((Float) objArr[4]).floatValue());
                if (longValue4 != 0) {
                    this.H8 = false;
                    this.X0[0].f(true, 1.0f);
                    this.X0[0].d(3, true, true);
                    t1(null, Uri.fromFile(new File(str7)), false, true, this.W4.d, false, 0L);
                    return;
                }
                return;
            }
            return;
        }
        if (i == jn7.m0) {
            if (this.D5 == ((Long) objArr[0]).longValue()) {
                ArrayList arrayList9 = (ArrayList) objArr[1];
                int i31 = 0;
                boolean z8 = false;
                while (i31 < arrayList9.size()) {
                    r47 r47Var9 = (r47) arrayList9.get(i31);
                    if (r47Var9 != null) {
                        if (this.X6 != null) {
                            i3 = 0;
                            while (i3 < this.X6.size()) {
                                r47Var = (r47) this.X6.get(i3);
                                if (r47Var != null && r47.B0(r47Var.k) == r47.B0(r47Var9.k) && r47Var.e1() == r47Var9.e1()) {
                                    break;
                                } else {
                                    i3++;
                                }
                            }
                        }
                        i3 = -1;
                        r47Var = null;
                        if (r47Var != null) {
                            this.X6.set(i3, r47Var9);
                            if (this.O4 == i3) {
                                z8 = true;
                            }
                        }
                    }
                    i31++;
                    z8 = z8;
                }
                if (z8) {
                    L1(false, true, true, this.O4);
                    return;
                }
                return;
            }
            return;
        }
        if (i == jn7.y1) {
            if (this.D5 == ((Long) objArr[0]).longValue()) {
                A(true, false);
                return;
            }
            return;
        }
        if (i != jn7.v || ((Boolean) objArr[2]).booleanValue()) {
            return;
        }
        long longValue5 = ((Long) objArr[1]).longValue();
        ArrayList arrayList10 = (ArrayList) objArr[0];
        int i32 = 0;
        boolean z9 = false;
        boolean z10 = false;
        while (i32 < i8) {
            if (i32 == 0) {
                arrayList = this.X6;
                sparseArrayArr = this.Y6;
            } else {
                arrayList = this.V6;
                sparseArrayArr = this.W6;
            }
            if (!arrayList.isEmpty()) {
                int i33 = i10;
                while (i33 < i8) {
                    if (sparseArrayArr[i33].size() > 0 && ((r47) sparseArrayArr[i33].valueAt(i10)).k.peer_id.channel_id == longValue5) {
                        int size = arrayList10.size();
                        int i34 = i10;
                        while (i34 < size) {
                            int intValue2 = ((Integer) arrayList10.get(i34)).intValue();
                            boolean z11 = z;
                            r47 r47Var10 = (r47) sparseArrayArr[i33].get(((Integer) arrayList10.get(i34)).intValue());
                            if (r47Var10 != null) {
                                sparseArrayArr[i33].remove(intValue2);
                                arrayList.remove(r47Var10);
                                if (i33 == 0) {
                                    this.I5--;
                                } else {
                                    this.K5--;
                                }
                                if (r47Var10 == this.S4) {
                                    z10 = z11;
                                }
                                z9 = z11;
                            }
                            i34++;
                            z = z11;
                        }
                    }
                    i33++;
                    z = z;
                    i8 = 2;
                    i10 = 0;
                }
            }
            i32++;
            z = z;
            i8 = 2;
            i10 = 0;
        }
        boolean z12 = z;
        if (z9) {
            if (z10 && this == k9) {
                L();
                return;
            }
            if (this.X6.isEmpty()) {
                A(false, z12);
                return;
            }
            int i35 = this.O4;
            this.O4 = -1;
            if (i35 >= this.X6.size()) {
                i35 = this.X6.size() - 1;
            }
            K1(i35);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x07e2  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0a41  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0a68  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0bf6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0c52  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0c4a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0c04  */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r13v26 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e() {
        Bitmap[] bitmapArr;
        float f;
        float f2;
        float f3;
        Bitmap n;
        int[] iArr;
        ArrayList arrayList;
        List<TLRPC.InputDocument> list;
        boolean z;
        po6 po6Var;
        String str;
        View view;
        ?? r13;
        boolean z2;
        byte b;
        int i;
        ed8 ed8Var;
        boolean z3;
        boolean z4;
        boolean z5;
        Bitmap bitmap;
        Bitmap createBitmap;
        long j;
        boolean z6;
        Bitmap G;
        int q;
        int o;
        Bitmap bitmap2;
        boolean z7;
        Bitmap bitmap3;
        Bitmap bitmap4;
        String str2;
        boolean z8;
        boolean z9;
        String str3;
        boolean z10;
        int i2;
        int i3;
        Canvas canvas;
        Bitmap[] bitmapArr2;
        boolean z11;
        int i4;
        int i5;
        ry5 ry5Var;
        h44 h44Var;
        PointF pointF;
        boolean z12;
        ArrayList arrayList2;
        Canvas canvas2;
        boolean z13;
        CharSequence charSequence;
        PhotoViewer photoViewer = this;
        int i6 = photoViewer.O4;
        if (i6 >= 0) {
            ArrayList arrayList3 = photoViewer.f7;
            if (i6 >= arrayList3.size() || !(arrayList3.get(photoViewer.O4) instanceof go6)) {
                return;
            }
            Bitmap[] bitmapArr3 = new Bitmap[1];
            go6 go6Var = (go6) arrayList3.get(photoViewer.O4);
            byte b2 = photoViewer.t4;
            byte b3 = 2;
            if (b2 == 1 || (b2 == 0 && photoViewer.d2 == 1)) {
                bitmapArr = bitmapArr3;
                f = 1000.0f;
                f2 = 2.0f;
                f3 = 1.0f;
                b43 b43Var = photoViewer.D1.b;
                RectF rectF = b43Var.O;
                CropAreaView cropAreaView = b43Var.a;
                if (b43Var.M != null) {
                    cropAreaView.d(rectF);
                    int ceil = (int) Math.ceil(b43.n(rectF, b43Var.P));
                    int ceil2 = (int) Math.ceil(r4 / cropAreaView.getAspectRatio());
                    float cropWidth = ceil / cropAreaView.getCropWidth();
                    if (go6Var.j != null) {
                        Bitmap createBitmap2 = Bitmap.createBitmap(ceil, ceil2, Bitmap.Config.ARGB_8888);
                        Canvas canvas3 = new Canvas(createBitmap2);
                        String g = b43.g(go6Var.j);
                        if (go6Var.k != null) {
                            new File(go6Var.k).delete();
                            go6Var.k = null;
                        }
                        go6Var.k = g;
                        ArrayList arrayList4 = go6Var.p;
                        if (arrayList4 == null || arrayList4.isEmpty()) {
                            go6Var.q = null;
                        } else {
                            go6Var.q = new ArrayList(go6Var.p.size());
                            int size = go6Var.p.size();
                            for (int i7 = 0; i7 < size; i7++) {
                                go6Var.q.add(((mec) go6Var.p.get(i7)).a());
                            }
                        }
                        b43Var.getContext();
                        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.PNG;
                        Matrix matrix = b43Var.M.k;
                        int currentWidth = b43Var.getCurrentWidth();
                        int currentHeight = b43Var.getCurrentHeight();
                        z33 z33Var = b43Var.M;
                        b43.b(g, canvas3, createBitmap2, matrix, currentWidth, currentHeight, z33Var.e, z33Var.i, (int) z33Var.h, cropWidth, go6Var.q);
                    }
                    fo6 fo6Var = go6Var.A;
                    if (fo6Var == null) {
                        fo6Var = new fo6();
                        go6Var.A = fo6Var;
                    }
                    b43Var.a(fo6Var);
                }
                if (go6Var.A == null && photoViewer.t4 != 1) {
                    return;
                }
                if (photoViewer.s1) {
                    if (!TextUtils.isEmpty(go6Var.i)) {
                        n = in5.G(go6Var.i, null, T(go6Var), T(go6Var), true);
                    } else if (go6Var.d() && !TextUtils.isEmpty(go6Var.a())) {
                        n = in5.G(go6Var.a(), null, T(go6Var), T(go6Var), true);
                    } else if (photoViewer.d2 == 1) {
                        int[] iArr2 = new int[1];
                        iArr = iArr2;
                        n = r7a.r(go6Var.a(), photoViewer.A8 / 1000, iArr2, true);
                    } else {
                        n = r7a.r(go6Var.a(), (long) (photoViewer.X7.getLeftProgress() * photoViewer.G2.U() * 1000.0f), null, false);
                        z = false;
                        arrayList = null;
                        list = null;
                        iArr = null;
                        po6Var = null;
                    }
                    arrayList = null;
                    list = null;
                    iArr = null;
                    po6Var = null;
                    z = false;
                } else {
                    n = photoViewer.B4.n();
                    ImageReceiver imageReceiver = photoViewer.B4;
                    iArr = new int[]{imageReceiver.V, imageReceiver.W};
                }
                arrayList = null;
                list = null;
                po6Var = null;
                z = false;
            } else if (b2 == 2) {
                Bitmap bitmap5 = photoViewer.J1.getBitmap();
                k3b k3bVar = photoViewer.o5;
                f = 1000.0f;
                int i8 = photoViewer.B4.V;
                n = k3bVar.e(bitmap5);
                po6Var = photoViewer.J1.getSavedFilterState();
                bitmapArr = bitmapArr3;
                z = false;
                arrayList = null;
                list = null;
                iArr = null;
                f2 = 2.0f;
                f3 = 1.0f;
            } else {
                f = 1000.0f;
                if (b2 == 3) {
                    int i10 = photoViewer.d2;
                    ArrayList arrayList5 = (i10 == 0 || i10 == 1 || i10 == 11 || i10 == 2) ? new ArrayList() : null;
                    boolean a = photoViewer.M1.p0.a();
                    f2 = 2.0f;
                    hc8 hc8Var = photoViewer.M1;
                    f3 = 1.0f;
                    int i11 = hc8Var.z1;
                    ry5 ry5Var2 = hc8Var.J0;
                    Bitmap c = hc8Var.G0.c(false, false);
                    hc8Var.Z0 = BigInteger.ONE;
                    if (c != null) {
                        int i12 = 0;
                        for (int i13 = 0; i13 < ry5Var2.getChildCount(); i13++) {
                            if (ry5Var2.getChildAt(i13) instanceof h44) {
                                i12++;
                            }
                        }
                        if (i12 > 0) {
                            int childCount = ry5Var2.getChildCount();
                            int i14 = 0;
                            Canvas canvas4 = null;
                            while (i14 < childCount) {
                                byte b4 = b3;
                                View childAt = ry5Var2.getChildAt(i14);
                                if (childAt instanceof h44) {
                                    h44 h44Var2 = (h44) childAt;
                                    PointF position = h44Var2.getPosition();
                                    if (!(h44Var2 instanceof kc1)) {
                                        if (arrayList5 != null) {
                                            mec mecVar = new mec();
                                            canvas = canvas4;
                                            bitmapArr2 = bitmapArr3;
                                            if (h44Var2 instanceof rlb) {
                                                mecVar.a = (byte) 1;
                                                rlb rlbVar = (rlb) h44Var2;
                                                CharSequence text = rlbVar.getText();
                                                if (text instanceof Spanned) {
                                                    Spanned spanned = (Spanned) text;
                                                    charSequence = text;
                                                    z11 = a;
                                                    i4 = childCount;
                                                    hm[] hmVarArr = (hm[]) spanned.getSpans(0, charSequence.length(), hm.class);
                                                    if (hmVarArr != null) {
                                                        int i15 = 0;
                                                        while (i15 < hmVarArr.length) {
                                                            hm hmVar = hmVarArr[i15];
                                                            hm[] hmVarArr2 = hmVarArr;
                                                            TLRPC.Document document = hmVar.document;
                                                            int i16 = i14;
                                                            ry5 ry5Var3 = ry5Var2;
                                                            if (document == null) {
                                                                document = wl.e(i11, hmVar.getDocumentId());
                                                            }
                                                            if (document != null) {
                                                                wl.g(i11).e(document);
                                                            }
                                                            lec lecVar = new lec();
                                                            PointF pointF2 = position;
                                                            int i17 = i15;
                                                            lecVar.document_id = hmVar.getDocumentId();
                                                            lecVar.document = document;
                                                            lecVar.offset = spanned.getSpanStart(hmVar);
                                                            lecVar.length = spanned.getSpanEnd(hmVar) - lecVar.offset;
                                                            xb4.G(i11);
                                                            lecVar.a = xb4.J(document, null, true, true).getAbsolutePath();
                                                            boolean K2 = r47.K2(lecVar.document, true);
                                                            if (K2 || r47.N4(lecVar.document)) {
                                                                lecVar.c = (byte) (lecVar.c | (K2 ? (byte) 1 : (byte) 4));
                                                            }
                                                            mecVar.k.add(lecVar);
                                                            if (document != null) {
                                                                BigInteger valueOf = BigInteger.valueOf(5000L);
                                                                hc8Var.Z0 = hc8Var.Z0.multiply(valueOf).divide(hc8Var.Z0.gcd(valueOf));
                                                            }
                                                            i15 = i17 + 1;
                                                            position = pointF2;
                                                            hmVarArr = hmVarArr2;
                                                            ry5Var2 = ry5Var3;
                                                            i14 = i16;
                                                        }
                                                    }
                                                    i5 = i14;
                                                    ry5Var = ry5Var2;
                                                    pointF = position;
                                                    mecVar.k.isEmpty();
                                                } else {
                                                    charSequence = text;
                                                    z11 = a;
                                                    i4 = childCount;
                                                    i5 = i14;
                                                    ry5Var = ry5Var2;
                                                    pointF = position;
                                                }
                                                mecVar.j = charSequence.toString();
                                                mecVar.b = (byte) rlbVar.getType();
                                                mecVar.l = rlbVar.getSwatch().a;
                                                mecVar.m = rlbVar.getTextSize();
                                                mecVar.n = rlbVar.getTypeface();
                                                mecVar.p = rlbVar.getAlign();
                                            } else {
                                                z11 = a;
                                                i4 = childCount;
                                                i5 = i14;
                                                ry5Var = ry5Var2;
                                                pointF = position;
                                                if (h44Var2 instanceof v3b) {
                                                    mecVar.a = (byte) 0;
                                                    v3b v3bVar = (v3b) h44Var2;
                                                    qma baseSize = v3bVar.getBaseSize();
                                                    mecVar.f = baseSize.a;
                                                    mecVar.g = baseSize.b;
                                                    mecVar.B = v3bVar.getSticker();
                                                    mecVar.C = v3bVar.getParentObject();
                                                    TLRPC.Document sticker = v3bVar.getSticker();
                                                    xb4.G(yac.t0);
                                                    mecVar.j = xb4.J(sticker, null, true, true).getAbsolutePath();
                                                    if (r47.K2(sticker, true) || r47.N4(sticker)) {
                                                        boolean K22 = r47.K2(sticker, true);
                                                        mecVar.b = (byte) (mecVar.b | (K22 ? (byte) 1 : (byte) 4));
                                                        long duration = K22 ? v3bVar.getDuration() : 5000L;
                                                        if (duration != 0) {
                                                            BigInteger valueOf2 = BigInteger.valueOf(duration);
                                                            hc8Var.Z0 = hc8Var.Z0.multiply(valueOf2).divide(hc8Var.Z0.gcd(valueOf2));
                                                        }
                                                    }
                                                    if (v3bVar.v0) {
                                                        mecVar.b = (byte) (mecVar.b | 2);
                                                    }
                                                } else if (h44Var2 instanceof v98) {
                                                    v98 v98Var = (v98) h44Var2;
                                                    mecVar.a = b4;
                                                    qma baseSize2 = v98Var.getBaseSize();
                                                    mecVar.f = baseSize2.a;
                                                    mecVar.g = baseSize2.b;
                                                    mecVar.j = v98Var.q(i11);
                                                    if (v98Var.v0) {
                                                        mecVar.b = (byte) (mecVar.b | b4);
                                                    }
                                                    z13 = false;
                                                    arrayList5.add(mecVar);
                                                    float scaleX = childAt.getScaleX();
                                                    float scaleY = childAt.getScaleY();
                                                    float x = childAt.getX();
                                                    float y = childAt.getY();
                                                    mecVar.q = childAt.getWidth();
                                                    mecVar.r = childAt.getHeight();
                                                    z12 = z13;
                                                    mecVar.f = (childAt.getWidth() * scaleX) / ry5Var.getMeasuredWidth();
                                                    mecVar.g = (childAt.getHeight() * scaleY) / ry5Var.getMeasuredHeight();
                                                    mecVar.c = ((((1.0f - scaleX) * childAt.getWidth()) / 2.0f) + x) / ry5Var.getMeasuredWidth();
                                                    mecVar.d = ((((1.0f - scaleY) * childAt.getHeight()) / 2.0f) + y) / ry5Var.getMeasuredHeight();
                                                    h44Var = h44Var2;
                                                    mecVar.e = (float) ((-childAt.getRotation()) * 0.017453292519943295d);
                                                    mecVar.y = ((childAt.getWidth() / 2.0f) + x) / ry5Var.getMeasuredWidth();
                                                    mecVar.z = ((childAt.getHeight() / 2.0f) + y) / ry5Var.getMeasuredHeight();
                                                    mecVar.w = mecVar.q / ry5Var.getMeasuredWidth();
                                                    mecVar.x = mecVar.r / ry5Var.getMeasuredHeight();
                                                    mecVar.v = scaleX;
                                                    if (bitmapArr2[0] == null) {
                                                        bitmapArr2[0] = Bitmap.createBitmap(c.getWidth(), c.getHeight(), c.getConfig());
                                                        Canvas canvas5 = new Canvas(bitmapArr2[0]);
                                                        canvas5.drawBitmap(c, 0.0f, 0.0f, (Paint) null);
                                                        canvas = canvas5;
                                                    }
                                                } else {
                                                    canvas4 = canvas;
                                                    i14 = i5 + 1;
                                                    arrayList5 = arrayList5;
                                                    bitmapArr3 = bitmapArr2;
                                                    a = z11;
                                                    childCount = i4;
                                                    ry5Var2 = ry5Var;
                                                    b3 = 2;
                                                }
                                            }
                                            z13 = true;
                                            arrayList5.add(mecVar);
                                            float scaleX2 = childAt.getScaleX();
                                            float scaleY2 = childAt.getScaleY();
                                            float x2 = childAt.getX();
                                            float y2 = childAt.getY();
                                            mecVar.q = childAt.getWidth();
                                            mecVar.r = childAt.getHeight();
                                            z12 = z13;
                                            mecVar.f = (childAt.getWidth() * scaleX2) / ry5Var.getMeasuredWidth();
                                            mecVar.g = (childAt.getHeight() * scaleY2) / ry5Var.getMeasuredHeight();
                                            mecVar.c = ((((1.0f - scaleX2) * childAt.getWidth()) / 2.0f) + x2) / ry5Var.getMeasuredWidth();
                                            mecVar.d = ((((1.0f - scaleY2) * childAt.getHeight()) / 2.0f) + y2) / ry5Var.getMeasuredHeight();
                                            h44Var = h44Var2;
                                            mecVar.e = (float) ((-childAt.getRotation()) * 0.017453292519943295d);
                                            mecVar.y = ((childAt.getWidth() / 2.0f) + x2) / ry5Var.getMeasuredWidth();
                                            mecVar.z = ((childAt.getHeight() / 2.0f) + y2) / ry5Var.getMeasuredHeight();
                                            mecVar.w = mecVar.q / ry5Var.getMeasuredWidth();
                                            mecVar.x = mecVar.r / ry5Var.getMeasuredHeight();
                                            mecVar.v = scaleX2;
                                            if (bitmapArr2[0] == null) {
                                            }
                                        } else {
                                            canvas = canvas4;
                                            bitmapArr2 = bitmapArr3;
                                            z11 = a;
                                            i4 = childCount;
                                            i5 = i14;
                                            ry5Var = ry5Var2;
                                            h44Var = h44Var2;
                                            pointF = position;
                                            z12 = false;
                                        }
                                        Canvas canvas6 = new Canvas(c);
                                        int i18 = 0;
                                        while (i18 < 2) {
                                            Canvas canvas7 = i18 == 0 ? canvas6 : canvas;
                                            if (canvas7 == null || (i18 == 0 && z12)) {
                                                arrayList2 = arrayList5;
                                                canvas2 = canvas6;
                                            } else {
                                                canvas7.save();
                                                canvas7.translate(pointF.x, pointF.y);
                                                canvas7.scale(childAt.getScaleX(), childAt.getScaleY());
                                                canvas7.rotate(childAt.getRotation());
                                                canvas7.translate((-h44Var.getWidth()) / 2.0f, (-h44Var.getHeight()) / 2.0f);
                                                if (!(childAt instanceof rlb) || childAt.getHeight() <= 0 || childAt.getWidth() <= 0) {
                                                    arrayList2 = arrayList5;
                                                    canvas2 = canvas6;
                                                    childAt.draw(canvas7);
                                                } else {
                                                    int width = childAt.getWidth();
                                                    int height = childAt.getHeight();
                                                    Bitmap.Config config = Bitmap.Config.ARGB_8888;
                                                    Bitmap a2 = lc1.a(width, height);
                                                    Canvas canvas8 = new Canvas(a2);
                                                    childAt.draw(canvas8);
                                                    arrayList2 = arrayList5;
                                                    canvas2 = canvas6;
                                                    canvas7.drawBitmap(a2, (Rect) null, new Rect(0, 0, a2.getWidth(), a2.getHeight()), (Paint) null);
                                                    try {
                                                        canvas8.setBitmap(null);
                                                    } catch (Exception e) {
                                                        cc4.g(e, true);
                                                    }
                                                    a2.recycle();
                                                }
                                                canvas7.restore();
                                            }
                                            i18++;
                                            arrayList5 = arrayList2;
                                            canvas6 = canvas2;
                                        }
                                        canvas4 = canvas;
                                        i14 = i5 + 1;
                                        arrayList5 = arrayList5;
                                        bitmapArr3 = bitmapArr2;
                                        a = z11;
                                        childCount = i4;
                                        ry5Var2 = ry5Var;
                                        b3 = 2;
                                    } else if (arrayList5 != null) {
                                        ((kc1) h44Var2).y(ry5Var2.getMeasuredWidth(), ry5Var2.getMeasuredHeight(), arrayList5);
                                    }
                                }
                                canvas = canvas4;
                                bitmapArr2 = bitmapArr3;
                                z11 = a;
                                i4 = childCount;
                                i5 = i14;
                                ry5Var = ry5Var2;
                                canvas4 = canvas;
                                i14 = i5 + 1;
                                arrayList5 = arrayList5;
                                bitmapArr3 = bitmapArr2;
                                a = z11;
                                childCount = i4;
                                ry5Var2 = ry5Var;
                                b3 = 2;
                            }
                        }
                    }
                    bitmapArr = bitmapArr3;
                    z = a;
                    List<TLRPC.InputDocument> masks = photoViewer.M1.getMasks();
                    photoViewer.M1.J0.removeAllViews();
                    list = masks;
                    n = c;
                    arrayList = arrayList5;
                    iArr = null;
                    po6Var = null;
                } else {
                    bitmapArr = bitmapArr3;
                    f2 = 2.0f;
                    f3 = 1.0f;
                    if (b2 == 4) {
                        Bitmap bitmap6 = photoViewer.O1.getBitmap();
                        photoViewer.B4.f0(bitmap6);
                        photoViewer.f(bitmap6);
                        photoViewer.u5.m(false, true);
                        photoViewer.v5.m(false, true);
                        k3b k3bVar2 = photoViewer.o5;
                        if (k3bVar2 != null) {
                            int i19 = photoViewer.B4.V - k3bVar2.K;
                            if (i19 == 0) {
                                h3b h3bVar = k3bVar2.F;
                                if (h3bVar != null) {
                                    h3bVar.e = k3bVar2.d(0, 0, bitmap6, true);
                                    h3b h3bVar2 = k3bVar2.F;
                                    h3bVar2.g = h3bVar2.c();
                                    k3b.c(k3bVar2.F, k3bVar2.U, k3bVar2.V);
                                    return;
                                }
                                return;
                            }
                            int width2 = bitmap6.getWidth();
                            int height2 = bitmap6.getHeight();
                            if ((i19 / 90) % 2 != 0) {
                                i3 = width2;
                                i2 = height2;
                            } else {
                                i2 = width2;
                                i3 = height2;
                            }
                            Bitmap createBitmap3 = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
                            Canvas canvas9 = new Canvas(createBitmap3);
                            canvas9.translate((-width2) / 2.0f, (-height2) / 2.0f);
                            canvas9.rotate(i19);
                            canvas9.translate(i2 / 2.0f, i3 / 2.0f);
                            canvas9.drawBitmap(bitmap6, 0.0f, 0.0f, new Paint(3));
                            k3b k3bVar3 = photoViewer.o5;
                            h3b h3bVar3 = k3bVar3.F;
                            if (h3bVar3 != null) {
                                h3bVar3.e = k3bVar3.d(0, 0, createBitmap3, true);
                                h3b h3bVar4 = k3bVar3.F;
                                h3bVar4.g = h3bVar4.c();
                                k3b.c(k3bVar3.F, k3bVar3.U, k3bVar3.V);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    n = null;
                    arrayList = null;
                    list = null;
                    iArr = null;
                    po6Var = null;
                    z = false;
                }
            }
            if (n != null) {
                if (go6Var.c != null) {
                    new File(go6Var.c).delete();
                    str = null;
                    go6Var.c = null;
                } else {
                    str = null;
                }
                if (go6Var.h != null) {
                    new File(go6Var.h).delete();
                    go6Var.h = str;
                }
                byte b5 = photoViewer.t4;
                xc8 xc8Var = photoViewer.W4;
                if (b5 == 1 || (b5 == 0 && photoViewer.d2 == 1)) {
                    view = null;
                    r13 = 0;
                    r13 = 0;
                    r13 = 0;
                    r13 = 0;
                    fo6 fo6Var2 = go6Var.A;
                    xc8Var.c = fo6Var2;
                    xc8Var.b = go6Var.k;
                    xc8Var.f = go6Var.q;
                    if (fo6Var2 != null) {
                        Bitmap D = D(n, fo6Var2, iArr, true);
                        if (go6Var.j != null) {
                            Bitmap decodeFile = BitmapFactory.decodeFile(go6Var.l);
                            Bitmap D2 = D(decodeFile, go6Var.A, null, false);
                            if (!photoViewer.s1 || go6Var.d()) {
                                if (photoViewer.B0()) {
                                    TLRPC.PhotoSize V = in5.V(D, photoViewer.d0(), hl.Y0(false), hl.Y0(false), 87);
                                    xb4.G(photoViewer.U);
                                    String file = xb4.K(V, true).toString();
                                    photoViewer.f5 = file;
                                    go6Var.h = file;
                                } else {
                                    String x0 = x0();
                                    go6Var.h = x0;
                                    photoViewer.X0(x0, null, D2, D, hl.Y0(false), true);
                                }
                            }
                            String x02 = x0();
                            go6Var.c = x02;
                            photoViewer = this;
                            photoViewer.X0(x02, null, D2, D, 512.0f, true);
                            if (D2 != null) {
                                D2.recycle();
                            }
                            if (decodeFile != null) {
                                decodeFile.recycle();
                            }
                        } else {
                            if (!photoViewer.s1 || go6Var.d()) {
                                TLRPC.PhotoSize V2 = in5.V(D, photoViewer.d0(), hl.Y0(false), hl.Y0(false), 87);
                                xb4.G(photoViewer.U);
                                String file2 = xb4.K(V2, true).toString();
                                photoViewer.f5 = file2;
                                go6Var.h = file2;
                            }
                            TLRPC.PhotoSize T = in5.T(D, 512.0f, 512.0f, 70, 101, 101);
                            xb4.G(photoViewer.U);
                            go6Var.c = xb4.K(T, true).toString();
                        }
                        if (photoViewer.t4 == 0 && photoViewer.s1) {
                            n.recycle();
                            n = D;
                        }
                    }
                } else if (b5 == 2) {
                    if (go6Var.i != null) {
                        new File(go6Var.i).delete();
                    }
                    TLRPC.PhotoSize V3 = in5.V(n, photoViewer.d0(), hl.Y0(true), hl.Y0(true), 87);
                    xb4.G(photoViewer.U);
                    go6Var.i = xb4.J(V3, null, true, true).toString();
                    fo6 fo6Var3 = go6Var.A;
                    Bitmap D3 = fo6Var3 != null ? D(n, fo6Var3, null, true) : n;
                    String str4 = go6Var.j;
                    if (str4 == null) {
                        if (!photoViewer.s1 || go6Var.d()) {
                            TLRPC.PhotoSize V4 = in5.V(D3, photoViewer.d0(), hl.Y0(false), hl.Y0(false), 87);
                            xb4.G(photoViewer.U);
                            str3 = null;
                            z10 = true;
                            String file3 = xb4.J(V4, null, true, true).toString();
                            photoViewer.f5 = file3;
                            go6Var.h = file3;
                        } else {
                            str3 = null;
                            z10 = true;
                        }
                        TLRPC.PhotoSize V5 = in5.V(D3, photoViewer.d0(), 512.0f, 512.0f, 83);
                        xb4.G(photoViewer.U);
                        go6Var.c = xb4.J(V5, str3, z10, z10).toString();
                        view = null;
                        z9 = false;
                        bitmap3 = D3;
                    } else {
                        String str5 = go6Var.l;
                        Bitmap bitmap7 = str4.equals(str5) ? photoViewer.x4.getBitmap() : null;
                        fo6 fo6Var4 = go6Var.A;
                        if (fo6Var4 != null) {
                            if (bitmap7 == null) {
                                Bitmap decodeFile2 = BitmapFactory.decodeFile(go6Var.l);
                                view = null;
                                Bitmap D4 = D(decodeFile2, go6Var.A, null, false);
                                decodeFile2.recycle();
                                bitmap7 = D4;
                            } else {
                                view = null;
                                bitmap7 = D(bitmap7, fo6Var4, null, false);
                            }
                            z7 = true;
                        } else {
                            view = null;
                            z7 = false;
                        }
                        if (!photoViewer.s1 || go6Var.d()) {
                            if (photoViewer.B0()) {
                                TLRPC.PhotoSize V6 = in5.V(D3, photoViewer.d0(), hl.Y0(false), hl.Y0(false), 87);
                                xb4.G(photoViewer.U);
                                String file4 = xb4.K(V6, true).toString();
                                photoViewer.f5 = file4;
                                go6Var.h = file4;
                            } else {
                                bitmap3 = D3;
                                String x03 = x0();
                                go6Var.h = x03;
                                bitmap4 = bitmap7;
                                str2 = str5;
                                z8 = false;
                                photoViewer.X0(x03, str2, bitmap4, bitmap3, hl.Y0(false), true);
                                String x04 = x0();
                                go6Var.c = x04;
                                photoViewer = this;
                                photoViewer.X0(x04, str2, bitmap4, bitmap3, 512.0f, true);
                                z9 = z8;
                                if (z7) {
                                    bitmap4.recycle();
                                    z9 = z8;
                                }
                            }
                        }
                        bitmap4 = bitmap7;
                        str2 = str5;
                        z8 = false;
                        bitmap3 = D3;
                        String x042 = x0();
                        go6Var.c = x042;
                        photoViewer = this;
                        photoViewer.X0(x042, str2, bitmap4, bitmap3, 512.0f, true);
                        z9 = z8;
                        if (z7) {
                        }
                    }
                    r13 = z9;
                    if (go6Var.A != null) {
                        bitmap3.recycle();
                        r13 = z9;
                    }
                } else {
                    view = null;
                    r13 = 0;
                    r13 = 0;
                    r13 = 0;
                    r13 = 0;
                    r13 = 0;
                    r13 = 0;
                    r13 = 0;
                    r13 = 0;
                    if (b5 == 3) {
                        if (go6Var.j != null) {
                            new File(go6Var.j).delete();
                            if (!go6Var.j.equals(go6Var.l)) {
                                new File(go6Var.l).delete();
                            }
                        }
                        Bitmap.CompressFormat compressFormat2 = Bitmap.CompressFormat.PNG;
                        TLRPC.PhotoSize V7 = in5.V(n, compressFormat2, hl.Y0(false), hl.Y0(false), 87);
                        go6Var.r = list != null ? new ArrayList(list) : null;
                        xb4.G(photoViewer.U);
                        String file5 = xb4.K(V7, true).toString();
                        xc8Var.a = file5;
                        go6Var.j = file5;
                        qx7 qx7Var = photoViewer.x4;
                        ArrayList arrayList6 = (arrayList == null || arrayList.isEmpty()) ? null : arrayList;
                        xc8Var.e = arrayList6;
                        go6Var.p = arrayList6;
                        qx7Var.b(arrayList6, photoViewer.s1, true, photoViewer.d2 != 11);
                        long lcm = photoViewer.M1.getLcm();
                        xc8Var.g = lcm;
                        go6Var.t = lcm;
                        if (go6Var.p == null || (bitmap2 = bitmapArr[0]) == null) {
                            go6Var.l = go6Var.j;
                        } else {
                            TLRPC.PhotoSize V8 = in5.V(bitmap2, compressFormat2, hl.Y0(false), hl.Y0(false), 87);
                            xb4.G(photoViewer.U);
                            go6Var.l = xb4.K(V8, true).toString();
                        }
                        photoViewer.x4.setBitmap(n);
                        fo6 fo6Var5 = go6Var.A;
                        if (fo6Var5 != null && fo6Var5.C) {
                            String g2 = b43.g(xc8Var.a);
                            if (xc8Var.b != null) {
                                new File(xc8Var.b).delete();
                                xc8Var.b = null;
                            }
                            xc8Var.b = g2;
                            ArrayList arrayList7 = xc8Var.e;
                            if (arrayList7 == null || arrayList7.isEmpty()) {
                                xc8Var.f = null;
                            } else {
                                xc8Var.f = new ArrayList(xc8Var.e.size());
                                int size2 = xc8Var.e.size();
                                for (int i20 = 0; i20 < size2; i20++) {
                                    xc8Var.f.add(((mec) xc8Var.e.get(i20)).a());
                                }
                            }
                            fo6 fo6Var6 = go6Var.A;
                            Bitmap createBitmap4 = Bitmap.createBitmap(fo6Var6.s, fo6Var6.t, Bitmap.Config.ARGB_8888);
                            Canvas canvas10 = new Canvas(createBitmap4);
                            if (photoViewer.s1) {
                                kec kecVar = (kec) photoViewer.C2;
                                q = kecVar.getVideoWidth();
                                o = kecVar.getVideoHeight();
                            } else {
                                q = photoViewer.B4.q();
                                o = photoViewer.B4.o();
                            }
                            int i21 = o;
                            int i22 = q;
                            Bitmap.CompressFormat compressFormat3 = Bitmap.CompressFormat.PNG;
                            fo6 fo6Var7 = go6Var.A;
                            b43.b(g2, canvas10, createBitmap4, fo6Var7.r, i22, i21, fo6Var7.m, fo6Var7.d, fo6Var7.k, fo6Var7.o, xc8Var.f);
                            createBitmap4.recycle();
                            go6Var.k = xc8Var.b;
                            go6Var.q = xc8Var.f;
                        }
                        Bitmap bitmap8 = bitmapArr[0];
                        if (bitmap8 == null) {
                            bitmap8 = n;
                        }
                        fo6 fo6Var8 = go6Var.A;
                        if (fo6Var8 == null || !fo6Var8.C) {
                            z4 = false;
                        } else {
                            bitmap8 = D(bitmap8, fo6Var8, null, false);
                            z4 = true;
                        }
                        Bitmap bitmap9 = bitmap8;
                        if (photoViewer.s1) {
                            String str6 = go6Var.i;
                            if (str6 != null) {
                                z6 = true;
                                G = in5.G(str6, null, T(go6Var), T(go6Var), true);
                            } else if (!go6Var.d() || TextUtils.isEmpty(go6Var.a())) {
                                G = r7a.r(go6Var.a(), (long) (photoViewer.X7.getLeftProgress() * photoViewer.G2.U() * f), null, false);
                                z6 = true;
                            } else {
                                z6 = true;
                                G = in5.G(go6Var.a(), null, T(go6Var), T(go6Var), true);
                            }
                            fo6 fo6Var9 = go6Var.A;
                            createBitmap = fo6Var9 != null ? D(G, fo6Var9, null, z6) : G;
                            if (go6Var.A != null) {
                                G.recycle();
                            }
                        } else {
                            ImageReceiver imageReceiver2 = photoViewer.B4;
                            int[] iArr3 = {imageReceiver2.V, imageReceiver2.W};
                            if (go6Var.A != null) {
                                bitmap = D(imageReceiver2.n(), go6Var.A, iArr3, true);
                                z5 = true;
                            } else {
                                Bitmap n2 = imageReceiver2.n();
                                if (iArr3[0] != 0) {
                                    Matrix matrix2 = new Matrix();
                                    matrix2.postRotate(iArr3[0]);
                                    int i23 = iArr3[1];
                                    float f4 = f3;
                                    if (i23 == 1) {
                                        matrix2.postScale(-1.0f, f4);
                                    } else if (i23 == 2) {
                                        matrix2.postScale(f4, -1.0f);
                                    }
                                    createBitmap = Bitmap.createBitmap(n2, 0, 0, n2.getWidth(), n2.getHeight(), matrix2, true);
                                } else {
                                    z5 = false;
                                    bitmap = n2;
                                }
                            }
                            if (photoViewer.s1 || go6Var.d()) {
                                if (photoViewer.B0()) {
                                    String x05 = x0();
                                    go6Var.h = x05;
                                    photoViewer.X0(x05, null, bitmap, bitmap9, hl.Y0(false), false);
                                } else {
                                    TLRPC.PhotoSize V9 = in5.V(bitmap, photoViewer.d0(), hl.Y0(false), hl.Y0(false), 87);
                                    xb4.G(photoViewer.U);
                                    String file6 = xb4.K(V9, true).toString();
                                    photoViewer.f5 = file6;
                                    go6Var.h = file6;
                                }
                            }
                            String x06 = x0();
                            go6Var.c = x06;
                            photoViewer = this;
                            photoViewer.X0(x06, null, bitmap, bitmap9, 512.0f, false);
                            if (z4 && bitmap9 != null) {
                                bitmap9.recycle();
                            }
                            if (z5 && bitmap != null) {
                                bitmap.recycle();
                            }
                            if (photoViewer.d2 == 1 && photoViewer.G2 != null && photoViewer.s1 && photoViewer.a0(false) == 1 && photoViewer.X7.getLeftProgress() <= 0.0f && photoViewer.X7.getRightProgress() >= 1.0f) {
                                j = go6Var.t;
                                long U = photoViewer.G2.U();
                                while (j < 3000 && j < U) {
                                    j += go6Var.t;
                                }
                                photoViewer.X7.setRightProgress(Math.min(1.0f, j / U));
                            }
                        }
                        bitmap = createBitmap;
                        z5 = true;
                        if (photoViewer.s1) {
                        }
                        if (photoViewer.B0()) {
                        }
                        String x062 = x0();
                        go6Var.c = x062;
                        photoViewer = this;
                        photoViewer.X0(x062, null, bitmap, bitmap9, 512.0f, false);
                        if (z4) {
                            bitmap9.recycle();
                        }
                        if (z5) {
                            bitmap.recycle();
                        }
                        if (photoViewer.d2 == 1) {
                            j = go6Var.t;
                            long U2 = photoViewer.G2.U();
                            while (j < 3000) {
                                j += go6Var.t;
                            }
                            photoViewer.X7.setRightProgress(Math.min(1.0f, j / U2));
                        }
                    }
                }
                xea.x();
                if (po6Var != null) {
                    xc8Var.d = po6Var;
                    go6Var.o = po6Var;
                    if (photoViewer.s1 && photoViewer.I4 && photoViewer.U0()) {
                        TextureView textureView = photoViewer.C2;
                        if (textureView instanceof kec) {
                            z2 = true;
                            ((kec) textureView).setDelegate(new ja8(po6Var, true ? 1 : 0));
                            b = photoViewer.t4;
                            if (b != z2) {
                                go6Var.w = z2;
                                yob.s(photoViewer.a1, aob.qg, photoViewer.w2, PorterDuff.Mode.MULTIPLY);
                            } else if (b == 2) {
                                go6Var.u = z2;
                                yob.s(photoViewer.d1, aob.qg, photoViewer.w2, PorterDuff.Mode.MULTIPLY);
                            } else if (b == 3) {
                                if (z) {
                                    go6Var.v = z2;
                                    yob.s(photoViewer.Z0, aob.qg, photoViewer.w2, PorterDuff.Mode.MULTIPLY);
                                } else if (photoViewer.d2 == 11) {
                                    go6Var.v = z2;
                                }
                            }
                            i = photoViewer.d2;
                            if ((i != 0 || i == 4) && (ed8Var = photoViewer.d) != null) {
                                ed8Var.X(photoViewer.O4);
                                if (!photoViewer.d.w(photoViewer.O4)) {
                                    photoViewer.V1();
                                }
                            }
                            boolean z14 = true;
                            if (photoViewer.t4 == 1) {
                                photoViewer.Z5 = Math.max(photoViewer.D1.getRectSizeX() / photoViewer.h0(photoViewer.t4), photoViewer.D1.getRectSizeY() / photoViewer.f0());
                                photoViewer.W5 = ((photoViewer.D1.getRectSizeX() / f2) + photoViewer.D1.getRectX()) - (photoViewer.h0(photoViewer.t4) / 2);
                                photoViewer.X5 = ((photoViewer.D1.getRectSizeY() / f2) + photoViewer.D1.getRectY()) - (photoViewer.f0() / 2);
                                z14 = true;
                                photoViewer.Q6 = true;
                                photoViewer.D1.a();
                            }
                            photoViewer.B4.p0(view);
                            photoViewer.j5 = z14;
                            z3 = photoViewer.s1;
                            byte b6 = photoViewer.t4;
                            if (!z3 ? b6 == 2 : !(b6 != z14 && ((b6 != 0 || photoViewer.d2 != z14) && (b6 != 2 || !photoViewer.I4 || !photoViewer.U0())))) {
                                photoViewer.B4.f0(n);
                                photoViewer.B4.o0(r13, r13, true);
                                photoViewer.E4.a();
                                photoViewer.f0.requestLayout();
                            }
                            photoViewer.j5 = r13;
                            photoViewer.B4.p0(photoViewer.f0);
                        }
                    }
                }
                z2 = true;
                b = photoViewer.t4;
                if (b != z2) {
                }
                i = photoViewer.d2;
                if (i != 0) {
                }
                ed8Var.X(photoViewer.O4);
                if (!photoViewer.d.w(photoViewer.O4)) {
                }
                boolean z142 = true;
                if (photoViewer.t4 == 1) {
                }
                photoViewer.B4.p0(view);
                photoViewer.j5 = z142;
                z3 = photoViewer.s1;
                byte b62 = photoViewer.t4;
                if (!z3) {
                    photoViewer.B4.f0(n);
                    photoViewer.B4.o0(r13, r13, true);
                    photoViewer.E4.a();
                    photoViewer.f0.requestLayout();
                }
                photoViewer.j5 = r13;
                photoViewer.B4.p0(photoViewer.f0);
            }
        }
    }

    public final int e0(int i, boolean z) {
        int measuredHeight;
        int additionalTop;
        boolean z2;
        if (z || (z2 = this.s)) {
            measuredHeight = this.f0.getMeasuredHeight();
        } else {
            measuredHeight = (hl.n - this.t2.bottom) + hl.q.y;
            if ((i == 0 || i == 4 || i == 5) && this.d2 != 1 && !z2) {
                measuredHeight += hl.m;
            }
        }
        if ((i == 0 && this.d2 == 1) || i == 1) {
            additionalTop = hl.L(144.0f);
        } else if (i == 2) {
            additionalTop = hl.L(214.0f);
        } else {
            if (i != 3) {
                return measuredHeight;
            }
            additionalTop = this.M1.getAdditionalTop() + org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + this.M1.getAdditionalBottom() + hl.L(48.0f);
        }
        return measuredHeight - additionalTop;
    }

    public final void e1() {
        if (this.E == null || !this.l2) {
            return;
        }
        try {
            r47 r47Var = this.S4;
            boolean z = false;
            File file = null;
            file = null;
            file = null;
            if (r47Var != null) {
                boolean K4 = r47.K4(r47Var.k);
                if (!TextUtils.isEmpty(this.S4.k.attachPath)) {
                    File file2 = new File(this.S4.k.attachPath);
                    if (file2.exists()) {
                        file = file2;
                    }
                }
                if (file == null) {
                    xb4.G(this.U);
                    file = xb4.M(this.S4.k, false, true);
                }
                z = K4;
            } else if (this.Z4 != null) {
                xb4.G(this.U);
                jn5 jn5Var = this.Z4;
                File J = xb4.J(jn5Var == null ? null : jn5Var.f, n0(jn5Var), this.y5 != 0 || this.A5, true);
                if (J == null || !J.exists()) {
                    xb4.G(this.U);
                    jn5 jn5Var2 = this.Z4;
                    file = xb4.J(jn5Var2 != null ? jn5Var2.f : null, n0(jn5Var2), false, true);
                } else {
                    file = J;
                }
            } else {
                bd8 bd8Var = this.i7;
                if (bd8Var != null) {
                    file = bd8Var.b(this.O4);
                }
            }
            if (file != null && !file.exists()) {
                file = new File(xb4.z(4), file.getName());
            }
            if (file == null || !file.exists()) {
                d2();
                return;
            }
            Intent intent = new Intent("android.intent.action.SEND");
            if (z) {
                intent.setType("video/mp4");
            } else {
                r47 r47Var2 = this.S4;
                if (r47Var2 != null) {
                    intent.setType(r47Var2.t1());
                } else {
                    intent.setType("image/jpeg");
                }
            }
            if (Build.VERSION.SDK_INT >= 24) {
                try {
                    Activity activity = this.E;
                    org.telegram.messenger.a.d();
                    intent.putExtra("android.intent.extra.STREAM", FileProvider.c(activity, "org.telegram.messenger.beta.provider", file));
                    intent.setFlags(1);
                } catch (Exception unused) {
                    intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(file));
                }
            } else {
                intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(file));
            }
            this.E.startActivityForResult(Intent.createChooser(intent, ob6.M0(2131745187, "ShareFile")), 500);
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public final void e2(final ub1 ub1Var, boolean z, boolean z2, final float[] fArr) {
        ed8 ed8Var = this.d;
        float L = hl.L((ed8Var == null || !ed8Var.l()) ? 58.0f : 175.0f) * (ub1Var == this.W1 ? -1.0f : 1.0f);
        final byte b = 1;
        final byte b2 = 0;
        if (!z2) {
            ub1Var.animate().setListener(null).cancel();
            ub1Var.setVisibility(z ? 0 : 8);
            if (z) {
                L = 0.0f;
            }
            ub1Var.setTranslationY(L);
            float alpha = this.Q0.getAlpha();
            float f = z ? 1.0f : 0.0f;
            fArr[0] = f;
            ub1Var.setAlpha(alpha * f);
        } else if (z) {
            if (ub1Var.getTag() == null) {
                if (ub1Var.getVisibility() != 0) {
                    ub1Var.setVisibility(0);
                    ub1Var.setAlpha(this.Q0.getAlpha());
                    ub1Var.setTranslationY(L);
                }
                ub1Var.animate().translationY(0.0f).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: qa8
                    public final /* synthetic */ PhotoViewer b;

                    {
                        this.b = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        byte b3 = b2;
                        float[] fArr2 = fArr;
                        ub1 ub1Var2 = ub1Var;
                        PhotoViewer photoViewer = this.b;
                        switch (b3) {
                            case 0:
                                Drawable[] drawableArr = PhotoViewer.d9;
                                float alpha2 = photoViewer.Q0.getAlpha();
                                float animatedFraction = valueAnimator.getAnimatedFraction();
                                fArr2[0] = animatedFraction;
                                ub1Var2.setAlpha(alpha2 * animatedFraction);
                                if (ub1Var2 == photoViewer.V1) {
                                    FrameLayout frameLayout = photoViewer.W7;
                                    if (frameLayout != null) {
                                        frameLayout.setTranslationY(photoViewer.Q0.getTranslationY() - (photoViewer.V1.getAlpha() * c00.d(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                                    }
                                    photoViewer.f1.setTranslationY(photoViewer.V1.getAlpha() * (-c00.d(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                                    photoViewer.g1.setTranslationY(photoViewer.V1.getAlpha() * (-c00.d(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                                    photoViewer.h1.setTranslationY(photoViewer.V1.getAlpha() * (-c00.d(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                                }
                                photoViewer.H0();
                                break;
                            default:
                                Drawable[] drawableArr2 = PhotoViewer.d9;
                                float alpha3 = photoViewer.Q0.getAlpha();
                                float animatedFraction2 = 1.0f - valueAnimator.getAnimatedFraction();
                                fArr2[0] = animatedFraction2;
                                ub1Var2.setAlpha(alpha3 * animatedFraction2);
                                if (ub1Var2 == photoViewer.V1) {
                                    FrameLayout frameLayout2 = photoViewer.W7;
                                    if (frameLayout2 != null) {
                                        frameLayout2.setTranslationY(photoViewer.Q0.getTranslationY() - (photoViewer.V1.getAlpha() * c00.d(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                                    }
                                    photoViewer.f1.setTranslationY(photoViewer.V1.getAlpha() * (-c00.d(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                                    photoViewer.g1.setTranslationY(photoViewer.V1.getAlpha() * (-c00.d(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                                    photoViewer.h1.setTranslationY(photoViewer.V1.getAlpha() * (-c00.d(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                                }
                                photoViewer.H0();
                                break;
                        }
                    }
                }).setDuration(420L).setInterpolator(k43.h).start();
            }
        } else if (ub1Var.getTag() != null) {
            ub1Var.animate().translationY(L).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: qa8
                public final /* synthetic */ PhotoViewer b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    byte b3 = b;
                    float[] fArr2 = fArr;
                    ub1 ub1Var2 = ub1Var;
                    PhotoViewer photoViewer = this.b;
                    switch (b3) {
                        case 0:
                            Drawable[] drawableArr = PhotoViewer.d9;
                            float alpha2 = photoViewer.Q0.getAlpha();
                            float animatedFraction = valueAnimator.getAnimatedFraction();
                            fArr2[0] = animatedFraction;
                            ub1Var2.setAlpha(alpha2 * animatedFraction);
                            if (ub1Var2 == photoViewer.V1) {
                                FrameLayout frameLayout = photoViewer.W7;
                                if (frameLayout != null) {
                                    frameLayout.setTranslationY(photoViewer.Q0.getTranslationY() - (photoViewer.V1.getAlpha() * c00.d(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                                }
                                photoViewer.f1.setTranslationY(photoViewer.V1.getAlpha() * (-c00.d(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                                photoViewer.g1.setTranslationY(photoViewer.V1.getAlpha() * (-c00.d(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                                photoViewer.h1.setTranslationY(photoViewer.V1.getAlpha() * (-c00.d(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                            }
                            photoViewer.H0();
                            break;
                        default:
                            Drawable[] drawableArr2 = PhotoViewer.d9;
                            float alpha3 = photoViewer.Q0.getAlpha();
                            float animatedFraction2 = 1.0f - valueAnimator.getAnimatedFraction();
                            fArr2[0] = animatedFraction2;
                            ub1Var2.setAlpha(alpha3 * animatedFraction2);
                            if (ub1Var2 == photoViewer.V1) {
                                FrameLayout frameLayout2 = photoViewer.W7;
                                if (frameLayout2 != null) {
                                    frameLayout2.setTranslationY(photoViewer.Q0.getTranslationY() - (photoViewer.V1.getAlpha() * c00.d(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                                }
                                photoViewer.f1.setTranslationY(photoViewer.V1.getAlpha() * (-c00.d(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                                photoViewer.g1.setTranslationY(photoViewer.V1.getAlpha() * (-c00.d(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                                photoViewer.h1.setTranslationY(photoViewer.V1.getAlpha() * (-c00.d(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                            }
                            photoViewer.H0();
                            break;
                    }
                }
            }).setDuration(420L).setInterpolator(k43.h).withEndAction(new rb1(ub1Var, (byte) 1)).start();
        }
        ub1Var.setTag(z ? 1 : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(Bitmap bitmap) {
        Bitmap bitmap2;
        boolean z;
        Bitmap createBitmap;
        byte b;
        fo6 fo6Var;
        Bitmap bitmap3;
        PhotoViewer photoViewer;
        PhotoViewer photoViewer2;
        Bitmap bitmap4;
        Bitmap bitmap5;
        go6 go6Var = (go6) this.f7.get(this.O4);
        ImageReceiver imageReceiver = this.B4;
        int[] iArr = {imageReceiver.V, imageReceiver.W};
        fo6 fo6Var2 = go6Var.A;
        if (fo6Var2 != null) {
            createBitmap = D(bitmap, fo6Var2, iArr, true);
        } else {
            if (iArr[0] == 0) {
                bitmap2 = bitmap;
                z = false;
                b = this.t4;
                if ((b != 0 || b == 4) && this.d2 == 11 && !this.s1) {
                    fo6Var = go6Var.A;
                    String str = go6Var.j;
                    if (fo6Var != null) {
                        bitmap3 = bitmap2;
                        if (str != null) {
                            Bitmap decodeFile = BitmapFactory.decodeFile(go6Var.l);
                            if (B0()) {
                                TLRPC.PhotoSize V = in5.V(bitmap3, d0(), hl.Y0(false), hl.Y0(false), 87);
                                xb4.G(this.U);
                                String file = xb4.J(V, null, true, true).toString();
                                this.f5 = file;
                                go6Var.h = file;
                                photoViewer = this;
                            } else {
                                String x0 = x0();
                                go6Var.h = x0;
                                photoViewer = this;
                                photoViewer.X0(x0, null, bitmap3, decodeFile, hl.Y0(false), false);
                            }
                            String x02 = x0();
                            go6Var.c = x02;
                            photoViewer.X0(x02, null, bitmap3, decodeFile, 512.0f, false);
                        } else {
                            TLRPC.PhotoSize V2 = in5.V(bitmap3, d0(), hl.Y0(false), hl.Y0(false), 87);
                            xb4.G(this.U);
                            String file2 = xb4.J(V2, null, true, true).toString();
                            this.f5 = file2;
                            go6Var.h = file2;
                            TLRPC.PhotoSize T = in5.T(bitmap3, 512.0f, 512.0f, 70, 101, 101);
                            bitmap3 = bitmap3;
                            xb4.G(this.U);
                            go6Var.c = xb4.J(T, null, true, true).toString();
                        }
                    } else if (str != null) {
                        Bitmap D = D(BitmapFactory.decodeFile(go6Var.l), go6Var.A, null, false);
                        if (B0()) {
                            TLRPC.PhotoSize V3 = in5.V(bitmap2, d0(), hl.Y0(false), hl.Y0(false), 87);
                            xb4.G(this.U);
                            String file3 = xb4.J(V3, null, true, true).toString();
                            this.f5 = file3;
                            go6Var.h = file3;
                            Bitmap bitmap6 = bitmap2;
                            photoViewer2 = this;
                            bitmap4 = D;
                            bitmap5 = bitmap6;
                        } else {
                            String x03 = x0();
                            go6Var.h = x03;
                            Bitmap bitmap7 = bitmap2;
                            photoViewer2 = this;
                            photoViewer2.X0(x03, null, D, bitmap7, hl.Y0(false), true);
                            bitmap4 = D;
                            bitmap5 = bitmap7;
                        }
                        String x04 = x0();
                        go6Var.c = x04;
                        Bitmap bitmap8 = bitmap5;
                        photoViewer2.X0(x04, null, bitmap4, bitmap8, 512.0f, true);
                        bitmap3 = bitmap8;
                    } else {
                        TLRPC.PhotoSize V4 = in5.V(bitmap2, d0(), hl.Y0(false), hl.Y0(false), 87);
                        xb4.G(this.U);
                        String file4 = xb4.J(V4, null, true, true).toString();
                        this.f5 = file4;
                        go6Var.h = file4;
                        TLRPC.PhotoSize T2 = in5.T(bitmap2, 512.0f, 512.0f, 70, 101, 101);
                        bitmap3 = bitmap2;
                        xb4.G(this.U);
                        go6Var.c = xb4.J(T2, null, true, true).toString();
                    }
                } else {
                    bitmap3 = bitmap2;
                }
                if (z || bitmap3 == null) {
                }
                bitmap3.recycle();
                return;
            }
            Matrix matrix = new Matrix();
            matrix.postRotate(iArr[0]);
            int i = iArr[1];
            if (i == 1) {
                matrix.postScale(-1.0f, 1.0f);
            } else if (i == 2) {
                matrix.postScale(1.0f, -1.0f);
            }
            createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        }
        bitmap2 = createBitmap;
        z = true;
        b = this.t4;
        if (b != 0) {
        }
        fo6Var = go6Var.A;
        String str2 = go6Var.j;
        if (fo6Var != null) {
        }
        if (z) {
        }
    }

    public final int f0() {
        return e0(this.t4, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x01ee, code lost:
    
        if (r3 > ((hl.L(100.0f) + f0()) / 2.0f)) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01f4, code lost:
    
        if (r4 != false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01f6, code lost:
    
        if (r10 <= 0) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01f8, code lost:
    
        if (r10 > 3) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01fa, code lost:
    
        Y0(true);
        v(0, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0200, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0201, code lost:
    
        if (r10 == 3) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0203, code lost:
    
        if (r10 != 4) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x020b, code lost:
    
        if (r17.X0[0].p == false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x020d, code lost:
    
        r17.H2 = true;
        B2();
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0212, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x01f2, code lost:
    
        if (r17.I4 != false) goto L102;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f1(MotionEvent motionEvent) {
        nc8 nc8Var;
        r47 r47Var;
        r47 r47Var2;
        if (this.R6) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (this.O0.getVisibility() != 0 && xea.q0 && this.d2 != 11) {
            if (y > hl.L(40.0f) + org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + hl.m) {
                if (x < Math.min(135, this.f0.getMeasuredWidth() / 8)) {
                    if (this.A4.D()) {
                        p2(-1, true);
                        return true;
                    }
                } else if (x > this.f0.getMeasuredWidth() - r4 && this.C4.D()) {
                    p2(1, true);
                    return true;
                }
            }
        }
        r47 r47Var3 = this.S4;
        if (r47Var3 == null || !r47Var3.q4() || x < (h0(this.t4) - this.B4.N0) / 2.0f || x > (h0(this.t4) + this.B4.N0) / 2.0f || y < (f0() - this.B4.O0) / 2.0f || y > (f0() + this.B4.O0) / 2.0f) {
            nc8 nc8Var2 = this.g0;
            if (nc8Var2 != null && nc8Var2.y && this.K) {
                WebView webView = nc8Var2.getWebView();
                if (x >= webView.getX() && x <= webView.getX() + webView.getWidth() && y >= webView.getY() && y <= webView.getY() + webView.getHeight()) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.setAction(0);
                    obtain.offsetLocation(-webView.getX(), -webView.getY());
                    webView.dispatchTouchEvent(obtain);
                    obtain.setAction(1);
                    webView.dispatchTouchEvent(obtain);
                    obtain.recycle();
                    A1();
                    return true;
                }
            }
            if (this.f0.getTag() != null) {
                dc8 dc8Var = this.z2;
                boolean z = (dc8Var != null && dc8Var.getVisibility() == 0) || ((nc8Var = this.g0) != null && nc8Var.y);
                if (this.B5 != 1 || (r47Var2 = this.S4) == null) {
                    lb8 lb8Var = this.X0[0];
                    if (lb8Var != null && this.f0 != null) {
                        int i = lb8Var.h;
                        if (x >= (h0(this.t4) - hl.L(100.0f)) / 2.0f) {
                            if (x <= (hl.L(100.0f) + h0(this.t4)) / 2.0f && y >= (f0() - hl.L(100.0f)) / 2.0f) {
                            }
                        }
                    }
                } else if (!r47Var2.x()) {
                    float f0 = (f0() - hl.L(360.0f)) / 2.0f;
                    if (y >= f0 && y <= f0 + hl.L(360.0f)) {
                        Y0(true);
                        return true;
                    }
                }
                nc8 nc8Var3 = this.g0;
                if ((nc8Var3 == null || !nc8Var3.y || nc8Var3.H || !this.K) && ((r47Var = this.S4) == null || !r47Var.q4())) {
                    t2(!this.K, true);
                    return true;
                }
            } else {
                int i2 = this.d2;
                if (i2 == 0 || i2 == 4) {
                    if (!this.s1) {
                        this.O0.performClick();
                        return true;
                    }
                    kfc kfcVar = this.G2;
                    if (kfcVar != null && !this.r && i2 != 1) {
                        kfcVar.A0(1.0f);
                    }
                    this.H2 = true;
                    B2();
                    return true;
                }
                TLRPC.BotInlineResult botInlineResult = this.X4;
                if (botInlineResult != null && (botInlineResult.type.equals(MediaStreamTrack.VIDEO_TRACK_KIND) || r47.J4(this.X4.document))) {
                    int i3 = this.X0[0].h;
                    if (i3 > 0 && i3 <= 3 && x >= (h0(this.t4) - hl.L(100.0f)) / 2.0f) {
                        if (x <= (hl.L(100.0f) + h0(this.t4)) / 2.0f && y >= (f0() - hl.L(100.0f)) / 2.0f) {
                            if (y <= (hl.L(100.0f) + f0()) / 2.0f) {
                                Y0(true);
                                v(0, true);
                                return true;
                            }
                        }
                    }
                } else if (this.d2 == 2 && this.s1) {
                    this.H2 = true;
                    B2();
                }
            }
        } else {
            org.telegram.ui.ActionBar.e eVar = this.l4;
            if (eVar instanceof zu1) {
                ((zu1) eVar).Z9(this.S4, true, true);
            }
            A(true, false);
            String str = this.S4.T0;
            if (str != null) {
                Context context = LaunchActivity.H1;
                if (context == null) {
                    context = this.F;
                }
                m01.t(context, Uri.parse(str), true, false, false, null, null, false, uc7.s1(this.U).k4.I2.f, false, false);
                return true;
            }
        }
        return true;
    }

    public final void f2(boolean z, boolean z2) {
        ed8 ed8Var = this.d;
        boolean z3 = false;
        boolean z4 = ed8Var != null && ed8Var.z();
        e2(this.V1, z && !z4, z2, this.D7);
        qb8 qb8Var = this.W1;
        if (z && z4) {
            z3 = true;
        }
        e2(qb8Var, z3, z2, this.E7);
    }

    public final void g(Canvas canvas) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        fo6 fo6Var;
        if (this.o6 != null) {
            f5 = hl.R1(0.0f, this.f6, this.k6);
            f = hl.R1(this.Z5, this.d6, this.k6);
            f2 = hl.R1(this.a6, this.e6, this.k6);
            f3 = hl.R1(this.X5, this.c6, this.k6);
            f4 = hl.R1(this.W5, this.b6, this.k6);
        } else {
            f = this.Z5;
            f2 = this.a6;
            f3 = this.X5;
            f4 = this.W5;
            if (this.m6 != 0) {
                f4 = this.b6;
                f3 = this.c6;
                f = this.d6;
            }
            f5 = 0.0f;
        }
        int h0 = h0(this.t4);
        int f0 = f0();
        canvas.translate(Y(this.t4), Z(this.t4));
        canvas.translate(f4, f3 + 0.0f);
        canvas.scale(f, f);
        canvas.rotate(f2);
        int q = this.B4.q();
        int o = this.B4.o();
        float f10 = h0;
        float f11 = q;
        float f12 = f10 / f11;
        float f13 = f0;
        float f14 = o;
        float f15 = f13 / f14;
        float min = Math.min(f12, f15);
        u33 u33Var = this.E1;
        int i = u33Var.i;
        if (i == 90 || i == 270) {
            o = q;
            q = o;
        }
        float f16 = u33Var.j;
        float f17 = u33Var.k;
        float f18 = q;
        float f19 = o;
        float f20 = f;
        int i2 = (int) ((((1.0f - f17) * 0.0f) + f17) * f19);
        float f21 = (int) ((((1.0f - f16) * 0.0f) + f16) * f18);
        float f22 = f10 / f21;
        float f23 = i2;
        if (f22 * f23 > f13) {
            f22 = f13 / f23;
        }
        int i3 = this.d2;
        float f24 = f22;
        xc8 xc8Var = this.W4;
        if (i3 != 1 && ((this.t4 != 1 || this.n6 == 0) && xc8Var.c != null)) {
            float f25 = f21 * f24;
            float f26 = f23 * f24;
            if (f12 * f14 > f13) {
                f12 = f15;
            }
            float A = qd4.A((f11 * f12) / f20, f25, 0.0f, f25);
            float A2 = qd4.A((f14 * f12) / f20, f26, 0.0f, f26);
            canvas.clipRect((-A) / 2.0f, (-A2) / 2.0f, A / 2.0f, A2 / 2.0f);
        }
        if (this.d2 == 1 || u33Var.a) {
            TextureView textureView = this.C2;
            if (textureView != null) {
                fo6 fo6Var2 = xc8Var.c;
                textureView.setScaleX((fo6Var2 == null || !fo6Var2.l) ? 1.0f : -1.0f);
                zc8 zc8Var = this.F2;
                if (zc8Var != null) {
                    zc8Var.setScaleX(this.C2.getScaleX());
                }
            }
            fo6 fo6Var3 = xc8Var.c;
            if (fo6Var3 != null) {
                f6 = fo6Var3.c;
                f7 = 1.0f;
            } else {
                f6 = 1.0f;
                f7 = 1.0f;
            }
            float A3 = ((f24 / min) / qd4.A(f6, f7, 0.0f, f7)) * f6;
            canvas.translate(u33Var.d * f7, u33Var.e * f7);
            canvas.scale(A3, A3);
            canvas.translate(xnb.C(u33Var.b, f18, min, f7), xnb.C(u33Var.c, f19, min, f7));
            float f27 = u33Var.g + i;
            if (f27 > 180.0f) {
                f27 -= 360.0f;
            }
            canvas.rotate(f27);
        }
        if (this.f7.isEmpty() || (fo6Var = xc8Var.c) == null || !fo6Var.l) {
            f8 = 1.0f;
        } else {
            f8 = 1.0f;
            canvas.scale(-1.0f, 1.0f);
        }
        if (f5 > 0.0f) {
            canvas.scale(f8 - (2.0f * f5), f8);
            canvas.skew(0.0f, qd4.z(f8, f5, 4.0f * f5, 0.25f));
        }
    }

    public final int g0() {
        return h0(this.t4);
    }

    public final void g1() {
        Activity activity;
        if (hl.F1(this.E)) {
            return;
        }
        if (hl.E || (Build.VERSION.SDK_INT >= 24 && (activity = this.E) != null && activity.isInMultiWindowMode())) {
            cc4.b("PhotoViewer: onStop in multi-window mode, keep playing");
            return;
        }
        if (this.G2 == null) {
            nc8 nc8Var = this.g0;
            if (nc8Var == null || !nc8Var.y || !nc8Var.H) {
                return;
            }
        } else if (!this.P3) {
            return;
        }
        p1();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x002d, code lost:
    
        if (r3.b.a() != false) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g2(boolean z, boolean z2) {
        k3b k3bVar;
        boolean z3 = true;
        if (z && (k3bVar = this.o5) != null) {
            if (k3bVar.H) {
                h3b[] h3bVarArr = k3bVar.I;
                if (h3bVarArr != null) {
                    for (h3b h3bVar : h3bVarArr) {
                        if (h3bVar != null && h3bVar.e != null) {
                            break;
                        }
                    }
                }
                gc8 gc8Var = this.O1;
                if (gc8Var != null) {
                }
            }
            sc8 sc8Var = this.w5;
            if (z2) {
                sc8Var.animate().setListener(null).cancel();
                this.w5.setVisibility(z3 ? 0 : 8);
                this.w5.setAlpha(z3 ? 1.0f : 0.0f);
                this.w5.setScaleX(z3 ? 1.0f : 0.8f);
                this.w5.setScaleY(z3 ? 1.0f : 0.8f);
            } else if (z3) {
                if (sc8Var.getTag() == null) {
                    this.w5.animate().setListener(null).cancel();
                    if (this.w5.getVisibility() != 0) {
                        this.w5.setVisibility(0);
                        ik8.t(this.w5.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f), k43.h, 400L);
                    }
                }
            } else if (sc8Var.getTag() != null) {
                this.w5.animate().setListener(null).cancel();
                ik8.t(this.w5.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setListener(new gf4(this.w5)), k43.h, 400L);
            }
            this.w5.setTag(!z3 ? r1 : null);
            sc8 sc8Var2 = this.u5;
            if (z2) {
                sc8Var2.animate().setListener(null).cancel();
                this.u5.setVisibility(z ? 0 : 8);
                this.u5.setAlpha(z ? 1.0f : 0.0f);
                this.u5.setScaleX(z ? 1.0f : 0.8f);
                this.u5.setScaleY(z ? 1.0f : 0.8f);
                this.v5.animate().setListener(null).cancel();
                this.v5.setVisibility(z ? 0 : 8);
                this.v5.setAlpha(z ? 1.0f : 0.0f);
                this.v5.setScaleX(z ? 1.0f : 0.8f);
                this.v5.setScaleY(z ? 1.0f : 0.8f);
            } else if (z) {
                if (sc8Var2.getTag() == null) {
                    this.u5.animate().setListener(null).cancel();
                    this.v5.animate().setListener(null).cancel();
                    if (this.u5.getVisibility() != 0) {
                        this.u5.setVisibility(0);
                        ViewPropertyAnimator scaleY = this.u5.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f);
                        k43 k43Var = k43.h;
                        ik8.t(scaleY, k43Var, 400L);
                        this.v5.setVisibility(0);
                        this.v5.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setInterpolator(k43Var).setDuration(400L).start();
                    }
                }
            } else if (sc8Var2.getTag() != null) {
                this.u5.animate().setListener(null).cancel();
                ViewPropertyAnimator listener = this.u5.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setListener(new gf4(this.u5));
                k43 k43Var2 = k43.h;
                ik8.t(listener, k43Var2, 400L);
                this.v5.animate().setListener(null).cancel();
                this.v5.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setListener(new gf4(this.v5)).setInterpolator(k43Var2).setDuration(400L).start();
            }
            this.u5.setTag(z ? 1 : null);
        }
        z3 = false;
        sc8 sc8Var3 = this.w5;
        if (z2) {
        }
        this.w5.setTag(!z3 ? r1 : null);
        sc8 sc8Var22 = this.u5;
        if (z2) {
        }
        this.u5.setTag(z ? 1 : null);
    }

    public float getAnimationValue() {
        return this.k6;
    }

    public final Size h() {
        int round;
        int i;
        if (this.e8 == 1) {
            return new Size(this.h8, this.i8);
        }
        int i2 = this.d8;
        float f = (i2 != 0 ? i2 != 1 ? i2 != 2 ? 1920.0f : 1280.0f : 854.0f : 480.0f) / (this.h8 > this.i8 ? this.h8 : this.i8);
        if (this.d8 != this.e8 - 1 || f < 1.0f) {
            int round2 = Math.round((this.h8 * f) / 2.0f) << 1;
            round = Math.round((this.i8 * f) / 2.0f) << 1;
            i = round2;
        } else {
            i = this.h8;
            round = this.i8;
        }
        int i3 = i % 4;
        if (i3 != 0 || round % 4 != 0) {
            i = (i - i3) - (round % 4);
        }
        return new Size(i, round);
    }

    public final int h0(int i) {
        int L;
        int width = this.f0.getWidth();
        if (i != 1) {
            if (i != 0) {
                if (i == 4 || i == 5 || i == 3) {
                    return width;
                }
                L = hl.L(28.0f);
                return width - L;
            }
            if (this.d2 != 1) {
                return width;
            }
        }
        L = hl.L(32.0f);
        return width - L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:240:0x031c, code lost:
    
        if (r6.getVisibility() == 0) goto L407;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x055b, code lost:
    
        if (r1 > r3) goto L274;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x0568, code lost:
    
        if (r2 > r3) goto L279;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x058b, code lost:
    
        if (r3 > r4) goto L287;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x059a, code lost:
    
        if (r3 > r4) goto L292;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x06c2, code lost:
    
        if (r3 > r4) goto L346;
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x06d1, code lost:
    
        if (r3 > r4) goto L351;
     */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0461  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h1(MotionEvent motionEvent) {
        float f;
        int i;
        float f2;
        int i2;
        int i3;
        gc8 gc8Var;
        hc8 hc8Var;
        this.I7 = motionEvent.getX();
        if (this.t4 == 3 && this.m6 != 0 && (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5)) {
            if (motionEvent.getPointerCount() >= 2) {
                AnimatorSet animatorSet = this.o6;
                if (animatorSet != null) {
                    float f3 = this.Z5;
                    float f4 = this.d6 - f3;
                    float f5 = this.k6;
                    float f6 = (f4 * f5) + f3;
                    float f7 = this.W5;
                    float A = qd4.A(this.b6, f7, f5, f7);
                    float f8 = this.X5;
                    float A2 = qd4.A(this.c6, f8, f5, f8);
                    float f10 = this.a6;
                    float f11 = ((this.e6 - f10) * f5) + f10;
                    animatorSet.cancel();
                    this.Z5 = f6;
                    this.W5 = A;
                    this.X5 = A2;
                    this.m6 = 0L;
                    this.a6 = f11;
                    I2(f6);
                    this.Q6 = false;
                    this.f0.invalidate();
                }
            }
            return true;
        }
        if (this.m4 == 0 && this.m6 == 0) {
            ob2 ob2Var = this.a4;
            if (ob2Var.rewindCount <= 0) {
                yb8 yb8Var = this.c4;
                if (yb8Var.rewinding) {
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        yb8Var.cancelRewind();
                        return false;
                    }
                    if (motionEvent.getAction() == 2) {
                        yb8Var.setX(motionEvent.getX());
                        return true;
                    }
                }
                byte b = this.t4;
                if (b == 2) {
                    this.J1.h(motionEvent);
                    return true;
                }
                if (b != 1 && (b == 3 || this.d2 != 1)) {
                    if (c0().f.e || (c0().p0 && this.e && this.m4 == 0)) {
                        if (motionEvent.getAction() == 1) {
                            y(true);
                        }
                    } else {
                        if (this.t4 == 0 && this.d2 != 1 && motionEvent.getPointerCount() == 1 && this.q6.a(motionEvent) && this.N6) {
                            this.N6 = false;
                            this.K6 = false;
                            this.J6 = false;
                            u(false);
                            return true;
                        }
                        kxb kxbVar = this.n1;
                        if (kxbVar != null) {
                            s8b s8bVar = kxbVar.d;
                            if (kxbVar.c) {
                                ViewPropertyAnimator viewPropertyAnimator = kxbVar.b;
                                if (viewPropertyAnimator != null) {
                                    viewPropertyAnimator.setListener(null);
                                    kxbVar.b.cancel();
                                    kxbVar.b = null;
                                }
                                hl.r(s8bVar);
                                s8bVar.run();
                            }
                            kxbVar.c = false;
                        }
                        int actionMasked = motionEvent.getActionMasked();
                        y98 y98Var = this.K7;
                        if (actionMasked == 0 || motionEvent.getActionMasked() == 5) {
                            this.R6 = false;
                            if (!this.U6.isFinished()) {
                                this.U6.abortAnimation();
                            }
                            if (!this.U5 && !this.I6) {
                                if (this.H6 && motionEvent.getPointerCount() == 2) {
                                    if (this.L6 == 1) {
                                        MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                                        this.M1.h(obtain);
                                        obtain.recycle();
                                        this.L6 = (byte) 2;
                                    } else if (this.M6 == 1) {
                                        MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                                        this.O1.a(obtain2);
                                        obtain2.recycle();
                                        this.M6 = (byte) 2;
                                    }
                                    this.t6 = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                                    this.u6 = (float) Math.atan2(motionEvent.getY(1) - motionEvent.getY(0), motionEvent.getX(1) - motionEvent.getX(0));
                                    this.v6 = this.Z5;
                                    this.w6 = this.a6;
                                    this.x6 = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                                    float y = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                                    this.y6 = y;
                                    this.z6 = this.W5;
                                    this.A6 = this.X5;
                                    this.J6 = true;
                                    this.K6 = false;
                                    if (this.t4 == 3 || this.d2 == 11) {
                                        this.B6 = this.x6;
                                        this.C6 = y;
                                        this.U5 = false;
                                        this.P6 = false;
                                    }
                                    E0();
                                    VelocityTracker velocityTracker = this.T6;
                                    if (velocityTracker != null) {
                                        velocityTracker.clear();
                                    }
                                } else if (motionEvent.getPointerCount() == 1) {
                                    byte b2 = this.t4;
                                    Rect rect = this.j7;
                                    if (b2 == 3) {
                                        if (this.L6 == 0) {
                                            View view = this.M1.getView();
                                            view.getHitRect(rect);
                                            if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                                                MotionEvent obtain3 = MotionEvent.obtain(motionEvent);
                                                obtain3.offsetLocation(-view.getX(), -view.getY());
                                                this.M1.h(obtain3);
                                                obtain3.recycle();
                                                this.L6 = (byte) 1;
                                            }
                                        }
                                    } else if (b2 != 4) {
                                        this.B6 = motionEvent.getX();
                                        float y2 = motionEvent.getY();
                                        this.C6 = y2;
                                        this.V5 = y2;
                                        this.U5 = false;
                                        this.P6 = true;
                                        VelocityTracker velocityTracker2 = this.T6;
                                        if (velocityTracker2 != null) {
                                            velocityTracker2.clear();
                                        }
                                    } else if (this.M6 == 0) {
                                        gc8 gc8Var2 = this.O1;
                                        gc8Var2.getHitRect(rect);
                                        if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                                            MotionEvent obtain4 = MotionEvent.obtain(motionEvent);
                                            obtain4.offsetLocation(-gc8Var2.getX(), -gc8Var2.getY());
                                            this.O1.a(obtain4);
                                            obtain4.recycle();
                                            this.M6 = (byte) 1;
                                        }
                                    }
                                }
                            }
                            if (motionEvent.getActionMasked() != 0) {
                                hl.r(y98Var);
                                return false;
                            }
                            this.J7 = motionEvent.getX();
                            hl.d3(y98Var, 300L);
                            return false;
                        }
                        float f12 = 3.0f;
                        float f13 = 1.0f;
                        float f14 = 0.0f;
                        if (motionEvent.getActionMasked() == 2) {
                            if (Math.abs(this.J7 - this.I7) > hl.e) {
                                hl.r(y98Var);
                            }
                            if (this.H6 && motionEvent.getPointerCount() == 2 && !this.U5 && this.J6 && !this.I6) {
                                this.R6 = true;
                                if (this.t4 == 3 || this.d2 == 11) {
                                    float x = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                                    float y3 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                                    float f15 = this.B6 - x;
                                    float f16 = this.C6 - y3;
                                    this.B6 = x;
                                    this.C6 = y3;
                                    float f17 = this.W5;
                                    if (f17 < this.D6 || f17 > this.E6) {
                                        f15 /= 3.0f;
                                    }
                                    float f18 = this.X5;
                                    if (f18 < this.F6 || f18 > this.G6) {
                                        f16 /= 3.0f;
                                    }
                                    this.z6 = ((this.x6 - (h0(this.t4) / 2)) - (((this.x6 - (h0(this.t4) / 2)) - this.W5) / (this.Z5 / this.v6))) - f15;
                                    this.A6 = ((this.y6 - (f0() / 2)) - (((this.y6 - (f0() / 2)) - this.X5) / (this.Z5 / this.v6))) - f16;
                                    this.x6 = x;
                                    this.y6 = y3;
                                }
                                if (this.d2 == 11 && this.t4 == 0) {
                                    this.a6 = (float) ((((Math.atan2(motionEvent.getY(1) - motionEvent.getY(0), motionEvent.getX(1) - motionEvent.getX(0)) - this.u6) / 3.141592653589793d) * 180.0d) + this.w6);
                                }
                                this.Z5 = (((float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0))) / this.t6) * this.v6;
                                this.W5 = uh9.x(this.Z5, this.v6, (this.x6 - (h0(this.t4) / 2)) - this.z6, this.x6 - (h0(this.t4) / 2));
                                float f0 = this.y6 - (f0() / 2);
                                float f02 = (this.y6 - (f0() / 2)) - this.A6;
                                float f19 = this.Z5;
                                this.X5 = uh9.x(f19, this.v6, f02, f0);
                                I2(f19);
                                H0();
                                this.f0.invalidate();
                                return false;
                            }
                            if (motionEvent.getPointerCount() == 1) {
                                if (this.L6 == 1 && (hc8Var = this.M1) != null) {
                                    View view2 = hc8Var.getView();
                                    MotionEvent obtain5 = MotionEvent.obtain(motionEvent);
                                    obtain5.offsetLocation(-view2.getX(), -view2.getY());
                                    this.M1.h(obtain5);
                                    obtain5.recycle();
                                    return true;
                                }
                                if (this.M6 == 1 && (gc8Var = this.O1) != null) {
                                    MotionEvent obtain6 = MotionEvent.obtain(motionEvent);
                                    obtain6.offsetLocation(-gc8Var.getX(), -gc8Var.getY());
                                    this.O1.a(obtain6);
                                    obtain6.recycle();
                                    return true;
                                }
                                VelocityTracker velocityTracker3 = this.T6;
                                if (velocityTracker3 != null) {
                                    velocityTracker3.addMovement(motionEvent);
                                }
                                float abs = Math.abs(motionEvent.getX() - this.B6);
                                float abs2 = Math.abs(motionEvent.getY() - this.V5);
                                float f20 = this.z1;
                                if (abs > f20 || abs2 > f20) {
                                    this.R6 = true;
                                    E0();
                                    hl.r(y98Var);
                                    gd8 gd8Var = this.T7;
                                    if (gd8Var != null) {
                                    }
                                }
                                if (this.d.T() && this.t4 == 0 && (i3 = this.d2) != 1 && i3 != 11 && this.P6 && !this.U5 && this.Z5 == 1.0f && abs2 >= hl.L(30.0f) && abs2 / 2.0f > abs) {
                                    this.U5 = true;
                                    E0();
                                    this.K6 = false;
                                    this.V5 = motionEvent.getY();
                                    if (this.K && this.f0.getTag() != null) {
                                        t2(false, true);
                                        return true;
                                    }
                                    if (this.Q0.getVisibility() == 0) {
                                        t2(false, true);
                                        A2(false, true);
                                        w2(false);
                                        return true;
                                    }
                                } else {
                                    if (this.U5) {
                                        this.X5 = motionEvent.getY() - this.V5;
                                        this.f0.invalidate();
                                        return false;
                                    }
                                    if (this.O6 || this.m6 != 0) {
                                        this.O6 = false;
                                        this.B6 = motionEvent.getX();
                                        this.C6 = motionEvent.getY();
                                        return false;
                                    }
                                    float x2 = this.B6 - motionEvent.getX();
                                    float y4 = this.C6 - motionEvent.getY();
                                    if (this.K6 || this.t4 != 0 || this.d2 == 11 || ((this.Z5 == 1.0f && Math.abs(y4) + hl.L(12.0f) < Math.abs(x2)) || this.Z5 != 1.0f)) {
                                        if (!this.K6) {
                                            this.K6 = true;
                                            this.P6 = false;
                                            E0();
                                            x2 = 0.0f;
                                            y4 = 0.0f;
                                        }
                                        this.B6 = motionEvent.getX();
                                        this.C6 = motionEvent.getY();
                                        I2(this.Z5);
                                        if ((this.W5 < this.D6 && (this.t4 != 0 || !this.C4.D())) || (this.W5 > this.E6 && (this.t4 != 0 || !this.A4.D()))) {
                                            x2 /= 3.0f;
                                        }
                                        float f21 = this.G6;
                                        if (f21 == 0.0f) {
                                            f2 = this.F6;
                                            if (f2 == 0.0f && this.t4 == 0 && (i2 = this.d2) != 1 && i2 != 11) {
                                                float f22 = this.X5;
                                                float f23 = f22 - y4;
                                                if (f23 < f2) {
                                                    this.X5 = f2;
                                                    f21 = f2;
                                                    this.W5 -= x2;
                                                    if (this.Z5 == 1.0f || this.t4 != 0 || this.d2 == 11) {
                                                        this.X5 = f21 - f14;
                                                    }
                                                    H0();
                                                    this.f0.invalidate();
                                                    return false;
                                                }
                                                if (f23 > f21) {
                                                    this.X5 = f21;
                                                    this.W5 -= x2;
                                                    if (this.Z5 == 1.0f) {
                                                    }
                                                    this.X5 = f21 - f14;
                                                    H0();
                                                    this.f0.invalidate();
                                                    return false;
                                                }
                                                f21 = f22;
                                                f14 = y4;
                                                this.W5 -= x2;
                                                if (this.Z5 == 1.0f) {
                                                }
                                                this.X5 = f21 - f14;
                                                H0();
                                                this.f0.invalidate();
                                                return false;
                                            }
                                        }
                                        f2 = this.X5;
                                        if (f2 < this.F6 || f2 > f21) {
                                            f14 = y4 / 3.0f;
                                            f21 = f2;
                                            this.W5 -= x2;
                                            if (this.Z5 == 1.0f) {
                                            }
                                            this.X5 = f21 - f14;
                                            H0();
                                            this.f0.invalidate();
                                            return false;
                                        }
                                        f21 = f2;
                                        f14 = y4;
                                        this.W5 -= x2;
                                        if (this.Z5 == 1.0f) {
                                        }
                                        this.X5 = f21 - f14;
                                        H0();
                                        this.f0.invalidate();
                                        return false;
                                    }
                                }
                            }
                        } else if (motionEvent.getActionMasked() == 3 || motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 6) {
                            E0();
                            hl.r(y98Var);
                            if (this.L6 == 1) {
                                hc8 hc8Var2 = this.M1;
                                if (hc8Var2 != null) {
                                    View view3 = hc8Var2.getView();
                                    MotionEvent obtain7 = MotionEvent.obtain(motionEvent);
                                    obtain7.offsetLocation(-view3.getX(), -view3.getY());
                                    this.M1.h(obtain7);
                                    obtain7.recycle();
                                }
                                this.L6 = (byte) 0;
                                this.M6 = (byte) 0;
                                return true;
                            }
                            if (this.M6 == 1) {
                                gc8 gc8Var3 = this.O1;
                                if (gc8Var3 != null) {
                                    MotionEvent obtain8 = MotionEvent.obtain(motionEvent);
                                    obtain8.offsetLocation(-gc8Var3.getX(), -gc8Var3.getY());
                                    this.O1.a(obtain8);
                                    obtain8.recycle();
                                }
                                this.L6 = (byte) 0;
                                this.M6 = (byte) 0;
                                return true;
                            }
                            this.L6 = (byte) 0;
                            this.M6 = (byte) 0;
                            if (this.J6) {
                                this.O6 = true;
                                if (this.d2 == 11) {
                                    f12 = 10.0f;
                                    f13 = 0.33f;
                                }
                                float f24 = this.Z5;
                                if (f24 < f13) {
                                    I2(f13);
                                    b(f13, 0.0f, 0.0f, true);
                                } else if (f24 > f12) {
                                    float x3 = uh9.x(f12, this.v6, (this.x6 - (h0(this.t4) / 2)) - this.z6, this.x6 - (h0(this.t4) / 2));
                                    float x4 = uh9.x(f12, this.v6, (this.y6 - (f0() / 2)) - this.A6, this.y6 - (f0() / 2));
                                    I2(f12);
                                    float f25 = this.D6;
                                    if (x3 >= f25) {
                                        f25 = this.E6;
                                    }
                                    x3 = f25;
                                    float f26 = this.F6;
                                    if (x4 >= f26) {
                                        f26 = this.G6;
                                    }
                                    x4 = f26;
                                    b(f12, x3, x4, true);
                                } else {
                                    u(true);
                                    if (this.t4 == 3) {
                                        float f27 = this.W5;
                                        float f28 = this.X5;
                                        I2(this.Z5);
                                        float f29 = this.W5;
                                        float f30 = this.D6;
                                        if (f29 >= f30) {
                                            f30 = this.E6;
                                        }
                                        f27 = f30;
                                        float f31 = this.X5;
                                        float f32 = this.F6;
                                        if (f31 >= f32) {
                                            f32 = this.G6;
                                        }
                                        f28 = f32;
                                        b(this.Z5, f27, f28, false);
                                    }
                                }
                                this.J6 = false;
                                this.K6 = false;
                                return false;
                            }
                            if (this.U5) {
                                if (Math.abs(this.V5 - motionEvent.getY()) > f0() / 6.0f) {
                                    A(true, false);
                                } else {
                                    if (this.Q0.getVisibility() == 0) {
                                        t2(true, true);
                                        w2(true);
                                    }
                                    b(1.0f, 0.0f, 0.0f, false);
                                }
                                this.U5 = false;
                                return false;
                            }
                            if (this.K6) {
                                float f33 = this.W5;
                                float f34 = this.X5;
                                I2(this.Z5);
                                this.K6 = false;
                                this.P6 = true;
                                VelocityTracker velocityTracker4 = this.T6;
                                if (velocityTracker4 == null || this.Z5 != 1.0f) {
                                    f = 0.0f;
                                } else {
                                    velocityTracker4.computeCurrentVelocity(1000);
                                    f = this.T6.getXVelocity();
                                }
                                if (this.t4 == 0 && (i = this.d2) != 1 && i != 11) {
                                    if ((this.W5 < this.D6 - (h0(r4) / 3) || f < (-hl.L(650.0f))) && this.C4.D()) {
                                        float f35 = this.Z5;
                                        if (f35 != 1.0f) {
                                            float h0 = (h0(this.t4) - this.B4.N0) / 2.0f;
                                            float f36 = this.Z5;
                                            f14 = h0 * f36;
                                            f35 = f36;
                                        }
                                        this.S6 = (byte) 1;
                                        b(f35, ((this.D6 - h0(this.t4)) - f14) - (hl.L(30.0f) / 2), this.X5, false);
                                        return true;
                                    }
                                    if ((this.W5 > this.E6 + (h0(this.t4) / 3) || f > hl.L(650.0f)) && this.A4.D()) {
                                        float f37 = this.Z5;
                                        if (f37 != 1.0f) {
                                            float h02 = (h0(this.t4) - this.B4.N0) / 2.0f;
                                            float f38 = this.Z5;
                                            f14 = h02 * f38;
                                            f37 = f38;
                                        }
                                        this.S6 = (byte) 2;
                                        b(f37, this.E6 + h0(this.t4) + f14 + (hl.L(30.0f) / 2), this.X5, false);
                                        return true;
                                    }
                                }
                                float f39 = this.W5;
                                float f40 = this.D6;
                                if (f39 >= f40) {
                                    f40 = this.E6;
                                }
                                f33 = f40;
                                float f41 = this.X5;
                                float f42 = this.F6;
                                if (f41 >= f42) {
                                    f42 = this.G6;
                                }
                                f34 = f42;
                                b(this.Z5, f33, f34, false);
                                return false;
                            }
                        }
                    }
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                ob2Var.cancelRewind();
                return false;
            }
            return true;
        }
        return false;
    }

    public final void h2(boolean z) {
        TextureView textureView;
        if (z && this.H3 && this.I3 && !this.F3 && (textureView = this.C2) != null) {
            this.N4 = textureView.getBitmap();
        }
        if (z) {
            this.f8 = this.d8;
        }
        AnimatorSet animatorSet = this.Z7;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.Z7 = new AnimatorSet();
        byte b = 3;
        if (z) {
            if (this.R4) {
                this.k0.setVisibility(0);
                this.k0.setAlpha(this.d2 == 11 ? 1.0f : 0.0f);
                this.k0.setBackgroundColor(this.d2 == 11 ? 1711276032 : 2130706432);
            }
            this.T7.setTag(1);
            AnimatorSet animatorSet2 = this.Z7;
            jo0 jo0Var = this.Q0;
            Property property = View.TRANSLATION_Y;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(jo0Var, (Property<jo0, Float>) property, 0.0f, this.V1.getEditTextHeight() + jo0Var.getHeight() + (this.s1 ? hl.L(58.0f) : 0));
            jo0 jo0Var2 = this.Q0;
            Property property2 = View.ALPHA;
            animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(jo0Var2, (Property<jo0, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.T0, (Property<di3, Float>) property, 0.0f, hl.L(158.0f)), ObjectAnimator.ofFloat(this.k0, (Property<View, Float>) property2, this.R4 ? 0.0f : 1.0f, 1.0f));
        } else {
            this.T7.setTag(null);
            AnimatorSet animatorSet3 = this.Z7;
            gd8 gd8Var = this.T7;
            Property property3 = View.TRANSLATION_Y;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(gd8Var, (Property<gd8, Float>) property3, 0.0f, hl.L(166.0f)), ObjectAnimator.ofFloat(this.U7, (Property<pa2, Float>) property3, 0.0f, hl.L(166.0f)), ObjectAnimator.ofFloat(this.k0, (Property<View, Float>) View.ALPHA, 1.0f, this.R4 ? 0.0f : 1.0f));
        }
        this.Z7.addListener(new ec8(this, z, b));
        this.Z7.setDuration(200L);
        this.Z7.setInterpolator(hl.G);
        this.Z7.start();
        if (this.f1.getVisibility() == 0) {
            this.f1.animate().scaleX(z ? 0.25f : 1.0f).scaleY(z ? 0.25f : 1.0f).alpha(z ? 0.0f : 1.0f).setDuration(200L);
        }
        if (this.g1.getVisibility() == 0) {
            this.g1.animate().scaleX(z ? 0.25f : 1.0f).scaleY(z ? 0.25f : 1.0f).alpha(z ? 0.0f : 1.0f).setDuration(200L);
        }
        if (this.h1.getVisibility() == 0) {
            this.h1.animate().scaleX(z ? 0.25f : 1.0f).scaleY(z ? 0.25f : 1.0f).alpha(z ? 0.0f : 1.0f).setDuration(200L);
        }
    }

    public final boolean i(MotionEvent motionEvent) {
        nc8 nc8Var;
        if (this.G2 != null || ((nc8Var = this.g0) != null && nc8Var.y)) {
            boolean z = motionEvent.getX() >= ((float) ((h0(this.t4) / 3) << 1));
            long l0 = l0();
            long z0 = z0();
            if (l0 != -9223372036854775807L && z0 > 15000 && (!z || z0 - l0 > 10000)) {
                return true;
            }
        }
        return false;
    }

    public final float i0(boolean z) {
        int q;
        int o;
        ImageReceiver imageReceiver = this.B4;
        if (z) {
            q = imageReceiver.o();
            o = this.B4.q();
        } else {
            q = imageReceiver.q();
            o = this.B4.o();
        }
        float min = Math.min(this.D1.getMeasuredWidth(), (this.D1.getMeasuredHeight() - hl.L(64.0f)) - (!this.s ? hl.m : 0)) - (hl.L(16.0f) << 1);
        return Math.max(min / q, min / o);
    }

    public final void i1() {
        final File file;
        final r47 r47Var;
        final boolean z;
        final boolean z2;
        final boolean z3;
        if (j()) {
            r47 r47Var2 = this.S4;
            File file2 = null;
            if (r47Var2 != null) {
                boolean z4 = r47Var2.t() && !this.S4.U2();
                boolean z5 = z4 && this.S4.O3();
                boolean K4 = r47.K4(this.S4.k);
                if (!TextUtils.isEmpty(this.S4.k.attachPath)) {
                    File file3 = new File(this.S4.k.attachPath);
                    if (file3.exists()) {
                        file2 = file3;
                    }
                }
                if (file2 == null) {
                    xb4.G(this.U);
                    file2 = xb4.M(this.S4.k, false, true);
                }
                r47Var = r47Var2;
                file = file2;
                z2 = z4;
                z3 = z5;
                z = K4;
            } else {
                file = null;
                r47Var = null;
                z = false;
                z2 = false;
                z3 = false;
            }
            if (file == null || !file.exists()) {
                d2();
                return;
            }
            this.h7 = new a0(this, this.O4, new ArrayList(this.X6), this.d);
            rc8 rc8Var = new rc8();
            rc8Var.c = false;
            u2(false, true, rc8Var);
            hl.d3(new Runnable() { // from class: org.telegram.ui.q
                @Override // java.lang.Runnable
                public final void run() {
                    Drawable[] drawableArr = PhotoViewer.d9;
                    PhotoViewer photoViewer = PhotoViewer.this;
                    photoViewer.getClass();
                    File file4 = file;
                    Pair L0 = hl.L0(file4);
                    int i = photoViewer.V3;
                    photoViewer.V3 = i - 1;
                    String absolutePath = file4.getAbsolutePath();
                    boolean z6 = z;
                    no6 no6Var = new no6(i, absolutePath, z6 ? 0 : ((Integer) L0.first).intValue(), z6, 0, 0);
                    no6Var.n(L0);
                    photoViewer.d2 = 2;
                    photoViewer.v2 = false;
                    photoViewer.d = new mc8(photoViewer, photoViewer.d, r47Var, no6Var, z2, z3);
                    photoViewer.q1.f();
                    if (photoViewer.T6 == null) {
                        photoViewer.T6 = VelocityTracker.obtain();
                    }
                    photoViewer.G7 = (byte) 3;
                    photoViewer.A2(false, false);
                    photoViewer.t2(true, false);
                    zu1 zu1Var = photoViewer.k4;
                    if (zu1Var == null || zu1Var.a0 == null || !zu1Var.Y7()) {
                        photoViewer.W0();
                    } else {
                        photoViewer.k4.a0.U();
                    }
                    photoViewer.M0.setAlpha(jn7.d4);
                    photoViewer.f0.setAlpha(1.0f);
                    photoViewer.d1(null, null, null, null, null, null, Collections.singletonList(no6Var), 0, null);
                    photoViewer.Q0.setTranslationY(hl.L(photoViewer.s1 ? 154.0f : 96.0f));
                    photoViewer.T0.setTranslationY(hl.L(photoViewer.s1 ? 154.0f : 96.0f));
                    photoViewer.G.setTranslationY(-r11.getHeight());
                    photoViewer.R1.setTranslationY(hl.L(photoViewer.s1 ? 154.0f : 96.0f));
                    photoViewer.F();
                    photoViewer.q2();
                    photoViewer.G7 = (byte) 0;
                }
            }, rc8Var.a);
        }
    }

    public final void i2() {
        long a;
        if (this.E != null) {
            zu1 zu1Var = this.k4;
            if (zu1Var != null) {
                a = zu1Var.a();
            } else {
                ed8 ed8Var = this.d;
                if (ed8Var == null) {
                    return;
                } else {
                    a = ed8Var.a();
                }
            }
            long j = a;
            jj.H(this.E, j, -1L, 0, false, new fa8(this), null, new gj(-1, -14342875, 520093695, -1, -115203550, 620756991, aob.w0(null, aob.Ji, false), aob.w0(null, aob.Fi, false), aob.w0(null, aob.Hi, false)), null);
        }
    }

    public final boolean j() {
        zu1 zu1Var = this.k4;
        if (zu1Var == null) {
            return false;
        }
        if (zu1Var.f != null) {
            return true;
        }
        TLRPC.Chat chat = zu1Var.e;
        if (chat == null || xc2.r0(chat)) {
            return false;
        }
        return xc2.p(this.k4.e) || xc2.u(this.k4.e);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final qh2 j0() {
        String str;
        r47 r47Var = this.S4;
        if (r47Var != null) {
            TLRPC.Document F0 = r47Var.F0();
            String I0 = this.S4.I0();
            if (TextUtils.isEmpty(I0)) {
                I0 = this.S4.S0();
            }
            long B0 = r47.B0(this.S4.k);
            boolean D = wf3.D(B0);
            int i = yac.t0;
            if (D) {
                TLRPC.User X1 = uc7.s1(i).X1(Long.valueOf(B0));
                if (X1 != null) {
                    str = lv2.m(0, X1.first_name, X1.last_name);
                    if (r47.R3(this.S4.k)) {
                        kfc kfcVar = this.G2;
                        if (kfcVar != null) {
                            return kfcVar.Q(qu6.p(new StringBuilder(), F0 != null ? F0.id : this.S4.e1(), ""), str, I0);
                        }
                    } else {
                        xb4.G(this.S4.K1);
                        File M = xb4.M(this.S4.k, false, true);
                        if (M != null && M.exists()) {
                            oh2 oh2Var = new oh2("image/jpeg", Uri.parse("file://" + M.getAbsolutePath()), "/photo_" + this.S4.e1());
                            oh2Var.e = str;
                            oh2Var.f = I0;
                            return new qh2(new ph2(oh2Var));
                        }
                    }
                }
                str = null;
                if (r47.R3(this.S4.k)) {
                }
            } else {
                TLRPC.Chat M0 = uc7.s1(i).M0(Long.valueOf(-B0));
                if (M0 != null) {
                    str = M0.title;
                    if (r47.R3(this.S4.k)) {
                    }
                }
                str = null;
                if (r47.R3(this.S4.k)) {
                }
            }
        }
        return null;
    }

    public final void j1(ArrayList arrayList, int i, f08 f08Var) {
        m1(null, null, null, null, null, arrayList, null, i, f08Var, null, 0L, 0L, 0L, true, null, null);
    }

    public final void j2(ArrayList arrayList) {
        boolean z;
        kfc kfcVar;
        r47 r47Var;
        boolean z2;
        ad8 ad8Var = this.f0;
        this.e0.softInputMode = 48;
        try {
            ((WindowManager) this.E.getSystemService("window")).updateViewLayout(this.h0, this.e0);
        } catch (Exception e) {
            cc4.g(e, true);
        }
        zu1 zu1Var = this.k4;
        if (zu1Var == null || zu1Var.a0 == null || zu1Var.getFragmentView() == null) {
            z = false;
        } else {
            nr1 nr1Var = this.k4.a0;
            if (nr1Var.o3) {
                nr1Var.h2();
                z2 = true;
            } else {
                z2 = false;
            }
            hl.g3(this.k4.getParentActivity(), this.c);
            this.k4.getFragmentView().requestLayout();
            z = z2;
        }
        String str = null;
        Integer valueOf = (arrayList.size() != 1 || (kfcVar = this.G2) == null || kfcVar.S() <= 1500 || (r47Var = this.S4) == null || !r47.K4(r47Var.k)) ? null : Integer.valueOf((int) (this.G2.S() / 1000));
        if (arrayList.size() == 1) {
            r47 r47Var2 = (r47) arrayList.get(0);
            String K = xc2.K(uc7.s1(this.U).M0(Long.valueOf(-r47.B0(r47Var2.k))), false);
            if (!TextUtils.isEmpty(K)) {
                StringBuilder sb = new StringBuilder("https://");
                qu6.u(sb, uc7.s1(this.U).N2, "/", K, "/");
                sb.append(r47Var2.e1());
                str = sb.toString();
            }
        }
        tb8 tb8Var = new tb8(this, this.E, this.k4, arrayList, str, valueOf, ad8Var, z);
        tb8Var.w0(false);
        tb8Var.getWindow().setSoftInputMode(48);
        hl.d3(new h68(this, tb8Var, (byte) 3), 250L);
        tb8Var.show();
    }

    public final void k() {
        AnimatorSet animatorSet;
        View view = this.A2;
        if (view != null) {
            view.animate().setListener(null).cancel();
            this.A2.setAlpha(0.0f);
        }
        AnimatorSet animatorSet2 = this.B2;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
            this.B2 = null;
        }
        k88 k88Var = this.D1;
        if (k88Var == null || (animatorSet = k88Var.s) == null) {
            return;
        }
        animatorSet.cancel();
        k88Var.s = null;
        k88Var.f = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x02df, code lost:
    
        if (r10 != null) goto L153;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final oec k0() {
        int i;
        fo6 fo6Var;
        long j;
        MediaCodec mediaCodec = null;
        r10 = null;
        ArrayList arrayList = null;
        mediaCodec = null;
        if (!this.s1 && B0() && this.B4.q() > 0) {
            int i2 = this.d2;
            float f = i2 == 1 ? 800.0f : i2 == 11 ? 500.0f : 854.0f;
            oec oecVar = new oec();
            oecVar.a = 0L;
            oecVar.d = 0.0f;
            oecVar.b = Math.min(3000L, this.W4.g);
            while (true) {
                j = oecVar.b;
                if (j <= 0 || j >= 1000) {
                    break;
                }
                oecVar.b = j << 1;
            }
            oecVar.e = j;
            oecVar.f = this.d8;
            oecVar.g = 0;
            oecVar.o = this.f5;
            long j2 = oecVar.b;
            oecVar.q = (int) ((j2 / 1000.0f) * 115200.0f);
            oecVar.r = j2;
            oecVar.n = 30;
            oecVar.v = j2;
            xc8 xc8Var = this.W4;
            oecVar.A = xc8Var.d;
            String str = xc8Var.b;
            if (str != null) {
                oecVar.B = str;
                ArrayList arrayList2 = xc8Var.f;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    arrayList = this.W4.f;
                }
                oecVar.G = arrayList;
            } else {
                oecVar.B = xc8Var.a;
                oecVar.G = xc8Var.e;
            }
            oecVar.I = true;
            int q = this.B4.q();
            int o = this.B4.o();
            fo6 fo6Var2 = this.W4.c;
            if (fo6Var2 != null) {
                int i3 = fo6Var2.k;
                if (i3 == 90 || i3 == 270) {
                    o = q;
                    q = o;
                }
                q = (int) (q * fo6Var2.e);
                o = (int) (o * fo6Var2.f);
            }
            int i4 = this.d2;
            if (i4 == 1 || i4 == 11) {
                q = o;
            }
            float f2 = q;
            float f3 = o;
            float max = Math.max(f2 / f, f3 / f);
            if (max < 1.0f) {
                max = 1.0f;
            }
            int i5 = (int) (f2 / max);
            int i6 = (int) (f3 / max);
            if (i5 % 16 != 0) {
                i5 = Math.max(1, Math.round(i5 / 16.0f)) << 4;
            }
            if (i6 % 16 != 0) {
                i6 = Math.max(1, Math.round(i6 / 16.0f)) << 4;
            }
            oecVar.k = i5;
            oecVar.h = i5;
            oecVar.l = i6;
            oecVar.i = i6;
            oecVar.m = -1;
            oecVar.t = true;
            oecVar.c = 0L;
            return oecVar;
        }
        if (!this.s1 || ((this.V4 == null && this.U4 == null) || this.e8 == 0)) {
            return null;
        }
        oec oecVar2 = new oec();
        oecVar2.a = this.r8;
        oecVar2.b = this.s8;
        oecVar2.d = this.t8;
        oecVar2.e = this.u8;
        oecVar2.f = this.d8;
        oecVar2.g = this.g8;
        oecVar2.h = this.h8;
        oecVar2.i = this.i8;
        oecVar2.m = this.l8;
        oecVar2.o = this.d5;
        oecVar2.p = this.e5;
        long j3 = this.x8;
        if (j3 == 0) {
            j3 = 1;
        }
        oecVar2.q = j3;
        oecVar2.r = this.y8;
        oecVar2.n = this.o8;
        oecVar2.v = (long) (this.n8 * 1000.0f);
        xc8 xc8Var2 = this.W4;
        oecVar2.A = xc8Var2.d;
        String str2 = xc8Var2.b;
        if (str2 != null) {
            oecVar2.B = str2;
            ArrayList arrayList3 = xc8Var2.f;
            oecVar2.G = (arrayList3 == null || arrayList3.isEmpty()) ? null : this.W4.f;
        } else {
            oecVar2.B = xc8Var2.a;
            ArrayList arrayList4 = xc8Var2.e;
            oecVar2.G = (arrayList4 == null || arrayList4.isEmpty()) ? null : this.W4.e;
        }
        if (this.d2 == 1 || this.r || !(this.k1.getTag() == null || (oecVar2.k == this.h8 && oecVar2.l == this.i8))) {
            if (this.r || this.d2 == 1) {
                this.d8 = 1;
                S2();
            }
            oecVar2.k = this.j8;
            oecVar2.l = this.k8;
            if (!this.r && this.d2 != 1) {
                r5 = this.l8;
            }
            oecVar2.m = r5;
        } else {
            oecVar2.k = this.h8;
            oecVar2.l = this.i8;
            oecVar2.m = this.r ? -1 : this.m8;
        }
        fo6 fo6Var3 = this.W4.c;
        oecVar2.H = fo6Var3;
        if (fo6Var3 != null) {
            oecVar2.g += fo6Var3.k;
            while (true) {
                i = oecVar2.g;
                if (i < 360) {
                    break;
                }
                oecVar2.g = i - 360;
            }
            if (i == 90 || i == 270) {
                fo6Var = oecVar2.H;
                fo6Var.i = (int) (oecVar2.k * fo6Var.f);
                fo6Var.j = (int) (oecVar2.l * fo6Var.e);
            } else {
                fo6Var = oecVar2.H;
                fo6Var.i = (int) (oecVar2.k * fo6Var.e);
                fo6Var.j = (int) (oecVar2.l * fo6Var.f);
            }
            if (this.d2 == 1) {
                int i7 = fo6Var.i;
                int i8 = 800;
                if (i7 > 800) {
                    fo6Var.i = 800;
                    i7 = 800;
                }
                int i10 = fo6Var.j;
                if (i10 > 800) {
                    fo6Var.j = 800;
                } else {
                    i8 = i10;
                }
                int min = Math.min(i7, i8);
                fo6Var.j = min;
                fo6Var.i = min;
            }
            if (f11.a) {
                StringBuilder sb = new StringBuilder("original transformed w = ");
                sb.append(oecVar2.H.i);
                sb.append(" h = ");
                sb.append(oecVar2.H.j);
                sb.append(" r = ");
                c00.q(oecVar2.g, sb);
            }
            fo6 fo6Var4 = oecVar2.H;
            int i11 = fo6Var4.i;
            int i12 = fo6Var4.j;
            int[] iArr = {i11, i12};
            try {
                mediaCodec = MediaCodec.createEncoderByType("video/avc");
                MediaCodecInfo.VideoCapabilities videoCapabilities = mediaCodec.getCodecInfo().getCapabilitiesForType("video/avc").getVideoCapabilities();
                Range<Integer> supportedWidths = videoCapabilities.getSupportedWidths();
                Range<Integer> supportedHeights = videoCapabilities.getSupportedHeights();
                iArr[0] = Math.max(supportedWidths.getLower().intValue(), Math.round(i11 / 16.0f) << 4);
                iArr[1] = Math.max(supportedHeights.getLower().intValue(), Math.round(i12 / 16.0f) << 4);
            } catch (Exception unused) {
            } catch (Throwable th) {
                if (mediaCodec != null) {
                    try {
                        mediaCodec.release();
                    } catch (Exception unused2) {
                    }
                }
                throw th;
            }
            try {
                mediaCodec.release();
            } catch (Exception unused3) {
            }
            fo6 fo6Var5 = oecVar2.H;
            fo6Var5.i = iArr[0];
            fo6Var5.j = iArr[1];
            if (f11.a) {
                StringBuilder sb2 = new StringBuilder("fixed transformed w = ");
                sb2.append(oecVar2.H.i);
                sb2.append(" h = ");
                c00.q(oecVar2.H.j, sb2);
            }
        }
        if (this.d2 == 1) {
            oecVar2.c = this.A8;
            oecVar2.j = this.m8;
        }
        oecVar2.t = this.r || this.d2 == 1;
        return oecVar2;
    }

    public final void k1(TLRPC.FileLocation fileLocation, jn5 jn5Var, yc8 yc8Var) {
        m1(null, fileLocation, jn5Var, null, null, null, null, 0, yc8Var, null, 0L, 0L, 0L, true, null, null);
    }

    public final void k2(boolean z, boolean z2) {
        k3b k3bVar = this.o5;
        if (!z2) {
            k3bVar.animate().setListener(null).cancel();
            this.o5.setVisibility(z ? 0 : 8);
            this.o5.setAlpha(this.Q0.getAlpha());
            this.r5.animate().setListener(null).cancel();
            this.r5.setVisibility(z ? 0 : 8);
            this.r5.setAlpha(z ? 1.0f : 0.0f);
        } else if (z) {
            if (k3bVar.getTag() == null) {
                this.o5.animate().setListener(null).cancel();
                this.r5.animate().setListener(null).cancel();
                if (this.o5.getVisibility() != 0) {
                    this.o5.setVisibility(0);
                    this.o5.animate().alpha(1.0f).start();
                    this.r5.setVisibility(0);
                    this.r5.animate().alpha(1.0f).start();
                }
            }
        } else if (k3bVar.getTag() != null) {
            this.o5.animate().setListener(null).cancel();
            this.o5.animate().alpha(0.0f).setListener(new gf4(this.o5)).start();
            this.r5.animate().setListener(null).cancel();
            this.r5.animate().alpha(0.0f).setListener(new gf4(this.r5)).start();
        }
        this.o5.setTag(z ? r1 : null);
        boolean z3 = (!z || this.s5.o0 == 1 || this.A7) ? false : true;
        sc8 sc8Var = this.s5;
        if (!z2) {
            sc8Var.animate().setListener(null).cancel();
            this.s5.setVisibility(z3 ? 0 : 8);
            this.s5.setAlpha(z3 ? 1.0f : 0.0f);
        } else if (z3) {
            if (sc8Var.getTag() == null) {
                this.s5.animate().setListener(null).cancel();
                if (this.s5.getVisibility() != 0) {
                    this.s5.setVisibility(0);
                }
                this.s5.animate().alpha(1.0f).start();
            }
        } else if (sc8Var.getTag() != null) {
            this.s5.animate().setListener(null).cancel();
            this.s5.animate().alpha(0.0f).setListener(new gf4(this.s5)).start();
        }
        this.s5.setTag(z3 ? r1 : null);
        g2(z && this.s5.o0 == 1 && !this.A7, z2);
        this.o5.setOutlineVisible(z && this.s5.o0 == 1 && this.x5.u0 && !this.u5.u0 && !this.v5.u0);
        boolean z4 = z && this.s5.o0 == 1 && !this.u5.u0 && !this.v5.u0;
        sc8 sc8Var2 = this.x5;
        if (!z2) {
            sc8Var2.animate().setListener(null).cancel();
            this.x5.setVisibility(z4 ? 0 : 8);
            this.x5.setAlpha(z4 ? 1.0f : 0.0f);
            this.x5.setScaleX(z4 ? 1.0f : 0.8f);
            this.x5.setScaleY(z4 ? 1.0f : 0.8f);
        } else if (z4) {
            if (sc8Var2.getTag() == null) {
                this.x5.animate().setListener(null).cancel();
                if (this.x5.getVisibility() != 0) {
                    this.x5.setVisibility(0);
                }
                ik8.t(this.x5.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f), k43.h, 400L);
            }
        } else if (sc8Var2.getTag() != null) {
            this.x5.animate().setListener(null).cancel();
            ik8.t(this.x5.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setListener(new gf4(this.x5)), k43.h, 400L);
        }
        this.x5.setTag(z4 ? 1 : null);
    }

    public final void l() {
        if (this.d2 == 11) {
            sc8 sc8Var = this.s5;
            if (sc8Var.o0 == 2) {
                sc8Var.setCutOutState(true);
                g2(true, true);
                this.o5.f();
                this.f0.invalidate();
            }
        }
    }

    public final long l0() {
        nc8 nc8Var = this.g0;
        if (nc8Var != null && nc8Var.y) {
            return nc8Var.getCurrentPosition();
        }
        kfc kfcVar = this.G2;
        if (kfcVar == null) {
            return 0L;
        }
        return kfcVar.S();
    }

    public final boolean l1(r47 r47Var, zu1 zu1Var, long j, long j2, long j3, yc8 yc8Var) {
        return m1(r47Var, null, null, null, null, null, null, 0, yc8Var, zu1Var, j, j2, j3, true, null, null);
    }

    public final void l2(boolean z) {
        nc8 nc8Var;
        byte b = 1;
        Object tag = this.s3.getTag();
        if (z) {
            if (tag != null) {
                return;
            }
            if (!this.s3.s && ((nc8Var = this.g0) == null || !nc8Var.y || nc8Var.w.isEmpty())) {
                this.u3 = true;
                return;
            }
        } else if (tag == null) {
            return;
        }
        AnimatorSet animatorSet = this.t3;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.s3.setTag(z ? 1 : null);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.t3 = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.s3, (Property<zb8, Float>) View.ALPHA, z ? 1.0f : 0.0f), ObjectAnimator.ofFloat(this.s3, (Property<zb8, Float>) View.SCALE_X, z ? 1.0f : 0.5f), ObjectAnimator.ofFloat(this.s3, (Property<zb8, Float>) View.SCALE_Y, z ? 1.0f : 0.5f), ObjectAnimator.ofFloat(this.s3, (Property<zb8, Float>) View.TRANSLATION_Y, z ? 0.0f : hl.L(12.0f)));
        this.t3.setDuration(380L);
        this.t3.setInterpolator(k43.h);
        this.t3.addListener(new wb8(this, b));
        this.t3.start();
    }

    public final void m() {
        Runnable runnable = this.I2;
        if (runnable != null) {
            hl.r(runnable);
            this.I2 = null;
        }
    }

    public final TLObject m0(int i, long[] jArr) {
        if (i < 0) {
            return null;
        }
        ArrayList arrayList = this.d7;
        if (!arrayList.isEmpty()) {
            if (i >= arrayList.size()) {
                return null;
            }
            if (jArr != null) {
                jArr[0] = ((oy9) arrayList.get(i)).b.size;
            }
            return (TLObject) arrayList.get(i);
        }
        ArrayList arrayList2 = this.Z6;
        if (!arrayList2.isEmpty()) {
            if (i >= arrayList2.size()) {
                return null;
            }
            if (jArr != null) {
                ArrayList arrayList3 = this.b7;
                if (arrayList3.get(i) != null) {
                    jArr[0] = ((Long) arrayList3.get(i)).longValue();
                }
            }
            ArrayList arrayList4 = this.a7;
            if (arrayList4.get(i) != null) {
                return ((jn5) arrayList4.get(i)).f;
            }
            return null;
        }
        ArrayList arrayList5 = this.X6;
        if (arrayList5.isEmpty() || i >= arrayList5.size()) {
            return null;
        }
        r47 r47Var = (r47) arrayList5.get(i);
        TLRPC.Message message = r47Var.k;
        if (message instanceof TLRPC.TL_messageService) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionUserUpdatedPhoto) {
                return messageAction.newUserPhoto.photo_big;
            }
            TLRPC.PhotoSize w = xb4.w(r47Var.p0, hl.Y0(false), false, null, false);
            if (w != null) {
                if (jArr != null) {
                    long j = w.size;
                    jArr[0] = j;
                    if (j == 0) {
                        jArr[0] = -1;
                    }
                }
                return w;
            }
            if (jArr != null) {
                jArr[0] = -1;
            }
        } else {
            TLRPC.MessageMedia messageMedia = r47Var.a1;
            if (messageMedia != null) {
                TLRPC.Document document = messageMedia.document;
                if (document != null) {
                    TLRPC.PhotoSize w2 = xb4.w(document.thumbs, 90, false, null, false);
                    if (jArr != null) {
                        long j2 = w2.size;
                        jArr[0] = j2;
                        if (j2 == 0) {
                            jArr[0] = -1;
                        }
                    }
                    return w2;
                }
                TLRPC.Photo photo = messageMedia.photo;
                if (photo != null) {
                    TLRPC.PhotoSize w3 = xb4.w(photo.sizes, hl.Y0(false), false, null, true);
                    if (w3 != null) {
                        if (jArr != null) {
                            long j3 = w3.size;
                            jArr[0] = j3;
                            if (j3 == 0) {
                                jArr[0] = -1;
                            }
                        }
                        return w3;
                    }
                    if (jArr != null) {
                        jArr[0] = -1;
                    }
                }
            } else if (((r47.n1(message) instanceof TLRPC.TL_messageMediaPhoto) && r47.n1(r47Var.k).photo != null) || ((r47.n1(r47Var.k) instanceof TLRPC.TL_messageMediaWebPage) && r47.n1(r47Var.k).webpage != null)) {
                TLRPC.PhotoSize w4 = xb4.w(r47Var.p0, hl.Y0(true), false, null, true);
                if (w4 != null) {
                    if (jArr != null) {
                        long j4 = w4.size;
                        jArr[0] = j4;
                        if (j4 == 0) {
                            jArr[0] = -1;
                        }
                    }
                    return w4;
                }
                if (jArr != null) {
                    jArr[0] = -1;
                }
            } else {
                if (r47.n1(r47Var.k) instanceof TLRPC.TL_messageMediaInvoice) {
                    return ((TLRPC.TL_messageMediaInvoice) r47.n1(r47Var.k)).photo;
                }
                if (r47Var.F0() != null && r47.W2(r47Var.F0())) {
                    TLRPC.PhotoSize w5 = xb4.w(r47Var.F0().thumbs, 90, false, null, false);
                    if (jArr != null) {
                        long j5 = w5.size;
                        jArr[0] = j5;
                        if (j5 == 0) {
                            jArr[0] = -1;
                        }
                    }
                    return w5;
                }
            }
        }
        return null;
    }

    public final boolean m1(r47 r47Var, TLRPC.FileLocation fileLocation, jn5 jn5Var, jn5 jn5Var2, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, int i, ed8 ed8Var, zu1 zu1Var, long j, long j2, long j3, boolean z, bd8 bd8Var, Integer num) {
        TLRPC.Message message;
        ed8 ed8Var2;
        it1 it1Var;
        it1 it1Var2;
        it1 it1Var3;
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        PhotoViewer photoViewer = this;
        if (photoViewer.E != null && !photoViewer.e && ((ed8Var != null || !photoViewer.p()) && (r47Var != null || fileLocation != null || arrayList != null || arrayList3 != null || arrayList2 != null || jn5Var != null || bd8Var != null))) {
            fd8 M = ed8Var.M(r47Var, fileLocation, i, true, false);
            WindowManager windowManager = (WindowManager) photoViewer.E.getSystemService("window");
            if (photoViewer.R5) {
                try {
                    windowManager.removeView(photoViewer.h0);
                    photoViewer.a1();
                } catch (Exception unused) {
                }
            }
            try {
                WindowManager.LayoutParams layoutParams = photoViewer.e0;
                layoutParams.type = 99;
                layoutParams.flags = -2147286784;
                if ((zu1Var == null || zu1Var.h == null) && ((photoViewer.y5 == 0 || !uc7.s1(photoViewer.U).E2(photoViewer.y5)) && ((r47Var == null || (!uc7.s1(photoViewer.U).E2(r47.B0(r47Var.k)) && ((message = r47Var.k) == null || !message.noforwards))) && ((r47Var == null || !r47Var.y2()) && !photoViewer.M0(bd8Var))))) {
                    photoViewer.e0.flags &= -8193;
                    hl.f2();
                } else {
                    photoViewer.e0.flags |= TLObject.FLAG_13;
                    hl.f2();
                }
                photoViewer.e0.softInputMode = jn7.u4;
                photoViewer.h0.setFocusable(false);
                photoViewer.f0.setFocusable(false);
                windowManager.addView(photoViewer.h0, photoViewer.e0);
                Activity activity = photoViewer.E;
                if (activity instanceof LaunchActivity) {
                    ((LaunchActivity) activity).a1.add(photoViewer.t1);
                }
                byte b = 2;
                if (Build.VERSION.SDK_INT >= 33 && (findOnBackInvokedDispatcher = photoViewer.h0.findOnBackInvokedDispatcher()) != null) {
                    findOnBackInvokedDispatcher.registerOnBackInvokedCallback(0, new vo(photoViewer, b));
                }
                photoViewer.u7 = false;
                photoViewer.v2 = false;
                photoViewer.P = true;
                photoViewer.Q = false;
                photoViewer.z3 = true;
                photoViewer.E2 = false;
                photoViewer.k4 = zu1Var;
                photoViewer.s4 = num != null;
                nb8 nb8Var = photoViewer.h1;
                if (nb8Var != null) {
                    nb8Var.setImage((Bitmap) null);
                }
                photoViewer.N.c("");
                photoViewer.N.a("", false);
                cd8 cd8Var = photoViewer.O;
                if (cd8Var != null) {
                    cd8Var.b(0, 0, false);
                    photoViewer.O.d(false, false);
                }
                photoViewer.G.setTitleScrollNonFitText(false);
                u8a u8aVar = photoViewer.H7;
                if (u8aVar != null) {
                    u8aVar.a();
                    photoViewer.H7 = null;
                }
                u8a u8aVar2 = (u8a) new ou0(jn7.f(photoViewer.U), photoViewer).b;
                u8aVar2.e(jn7.l4);
                u8aVar2.b(jn7.Z1);
                u8aVar2.b(jn7.Y1);
                u8aVar2.b(jn7.u3);
                u8aVar2.b(jn7.X1);
                u8aVar2.b(jn7.W);
                u8aVar2.b(jn7.V);
                u8aVar2.b(jn7.g3);
                u8aVar2.b(jn7.v);
                u8aVar2.b(jn7.c2);
                u8aVar2.b(jn7.b2);
                u8aVar2.b(jn7.m0);
                u8aVar2.b(jn7.y1);
                photoViewer.H7 = u8aVar2;
                photoViewer.d = ed8Var;
                photoViewer.H5 = j2;
                photoViewer.D5 = j;
                photoViewer.E5 = (zu1Var == null || (it1Var3 = zu1Var.D0) == null || !it1Var3.O) ? null : zu1Var.F3;
                photoViewer.F5 = (zu1Var == null || (it1Var2 = zu1Var.D0) == null || !it1Var2.O) ? null : zu1Var.I3;
                photoViewer.G5 = (zu1Var == null || (it1Var = zu1Var.D0) == null || !it1Var.O) ? false : true;
                photoViewer.C5 = j3;
                photoViewer.q1.f();
                photoViewer.i7 = bd8Var;
                photoViewer.p2 = null;
                if (photoViewer.T6 == null) {
                    photoViewer.T6 = VelocityTracker.obtain();
                }
                photoViewer.e = true;
                photoViewer.f = true;
                photoViewer.A2(false, false);
                photoViewer.m2 = !z;
                if (!z) {
                    photoViewer.t2(false, false);
                } else if (photoViewer.d2 == 1) {
                    photoViewer.C();
                    photoViewer.t2(false, false);
                } else {
                    photoViewer.t2(true, false);
                }
                photoViewer.h0.setClipChildren(false);
                photoViewer.k0.setVisibility(0);
                photoViewer.e3 = 0.0f;
                photoViewer.V2 = false;
                photoViewer.U2 = false;
                if (M != null) {
                    photoViewer.r4 = true;
                    photoViewer.m4 = (byte) 1;
                    if (r47Var != null) {
                        int i2 = r47Var.K1;
                        lm m = M.o ? M.a.m() : null;
                        photoViewer.k2 = m;
                        if (m != null) {
                            if (r47.K4(r47Var.k)) {
                                ImageReceiver imageReceiver = M.a;
                                imageReceiver.u0 = false;
                                imageReceiver.x0();
                                if (MediaController.z().H(r47Var)) {
                                    photoViewer.e3 = r47Var.b0;
                                }
                                photoViewer.V2 = photoViewer.S2 == null && !xb4.G(i2).T(r47Var.F0(), true) && (photoViewer.k2.s() || !xb4.G(i2).T(r47Var.F0(), false));
                                photoViewer.k2 = null;
                            } else if (r47Var.l2().size() > 1) {
                                photoViewer.k2 = null;
                            }
                        }
                    } else if (bd8Var != null) {
                        lm m2 = M.o ? M.a.m() : null;
                        photoViewer.k2 = m2;
                        if (m2 != null && bd8Var.a(i)) {
                            ImageReceiver imageReceiver2 = M.a;
                            imageReceiver2.u0 = false;
                            imageReceiver2.x0();
                            TLObject d = bd8Var.d(i);
                            TLRPC.Document document = d instanceof TLRPC.Document ? (TLRPC.Document) d : null;
                            photoViewer.V2 = photoViewer.S2 == null && document != null && !xb4.G(photoViewer.U).T(document, true) && (photoViewer.k2.s() || !xb4.G(photoViewer.U).T(document, false));
                            photoViewer.k2 = null;
                        }
                    }
                    photoViewer.d1(r47Var, fileLocation, jn5Var, jn5Var2, arrayList, arrayList2, arrayList3, i, M);
                    if (photoViewer.d2 == 1) {
                        photoViewer.D1.setVisibility(0);
                        photoViewer.D1.setAlpha(0.0f);
                        photoViewer.D1.setFreeform(false);
                    }
                    ImageReceiver imageReceiver3 = M.a;
                    RectF rectF = imageReceiver3.Q0;
                    float f = rectF.left;
                    float f2 = rectF.top;
                    int i3 = imageReceiver3.V;
                    lm m3 = imageReceiver3.m();
                    int i4 = m3 != null ? m3.d[2] : 0;
                    if (i4 != 0) {
                        i3 = i4;
                    }
                    ClippingImageView[] b0 = photoViewer.b0(M);
                    photoViewer.l6 = 1.0f;
                    for (int i5 = 0; i5 < b0.length; i5++) {
                        ClippingImageView clippingImageView = b0[i5];
                        boolean z2 = M.r;
                        clippingImageView.O = photoViewer.j4;
                        clippingImageView.L = true;
                        clippingImageView.N = z2;
                        clippingImageView.setVisibility(0);
                        b0[i5].setRadius(M.h);
                        ClippingImageView clippingImageView2 = b0[i5];
                        int i6 = M.a.W;
                        clippingImageView2.e = i3;
                        clippingImageView2.f = i6;
                        clippingImageView2.setImageBitmap(M.e);
                    }
                    photoViewer.F0();
                    if (photoViewer.d2 == 1) {
                        photoViewer.D1.setAspectRatio(1.0f);
                    }
                    ViewGroup.LayoutParams layoutParams2 = photoViewer.i0.getLayoutParams();
                    layoutParams2.width = (int) rectF.width();
                    int height = (int) rectF.height();
                    layoutParams2.height = height;
                    if (layoutParams2.width <= 0) {
                        layoutParams2.width = 100;
                    }
                    if (height <= 0) {
                        layoutParams2.height = 100;
                    }
                    for (int i7 = 0; i7 < b0.length; i7++) {
                        if (b0.length > 1 || M.r) {
                            b0[i7].setAlpha(0.0f);
                        } else {
                            b0[i7].setAlpha(1.0f);
                        }
                        b0[i7].setPivotX(0.0f);
                        b0[i7].setPivotY(0.0f);
                        b0[i7].setScaleX(M.k);
                        b0[i7].setScaleY(M.k);
                        b0[i7].setTranslationX((rectF.left * M.k) + M.b);
                        b0[i7].setTranslationY((rectF.top * M.k) + M.c);
                        b0[i7].setLayoutParams(layoutParams2);
                    }
                    photoViewer = this;
                    photoViewer.h0.getViewTreeObserver().addOnPreDrawListener(new v(this, b0, layoutParams2, f, M, f2, ed8Var, arrayList3, num));
                } else {
                    if (arrayList3 != null && photoViewer.d2 != 3 && ((ed8Var2 = photoViewer.d) == null || !ed8Var2.P())) {
                        photoViewer.W0();
                    }
                    photoViewer.f0.setAlpha(1.0f);
                    photoViewer.d1(r47Var, fileLocation, jn5Var, jn5Var2, arrayList, arrayList2, arrayList3, i, M);
                    photoViewer.F0();
                    photoViewer.I1();
                    zu1 zu1Var2 = photoViewer.k4;
                    if (zu1Var2 != null) {
                        zu1Var2.i6();
                        UndoView undoView = zu1Var2.N3;
                        if (undoView != null) {
                            undoView.d(1, false);
                        }
                        photoViewer.k4.getFragmentView().invalidate();
                    }
                    photoViewer.h0.getViewTreeObserver().addOnPreDrawListener(new x(photoViewer, ed8Var, num));
                }
                AccessibilityManager accessibilityManager = (AccessibilityManager) photoViewer.E.getSystemService("accessibility");
                if (accessibilityManager.isTouchExplorationEnabled()) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    obtain.setEventType(TLObject.FLAG_14);
                    obtain.getText().add(ob6.M0(2131754804, "AccDescrPhotoViewer"));
                    accessibilityManager.sendAccessibilityEvent(obtain);
                }
                return true;
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
        return false;
    }

    public final void m2(boolean z, boolean z2) {
        FrameLayout frameLayout = this.W7;
        if (!z2) {
            frameLayout.animate().setListener(null).cancel();
            this.W7.setVisibility(z ? 0 : 8);
            this.X7.setTranslationY(0.0f);
            this.W7.setAlpha(this.Q0.getAlpha());
        } else if (z) {
            if (frameLayout.getTag() == null) {
                if (this.W7.getVisibility() != 0) {
                    this.W7.setVisibility(0);
                    this.W7.setAlpha(this.Q0.getAlpha());
                    this.X7.setTranslationY(hl.L(58.0f));
                }
                ObjectAnimator objectAnimator = this.F7;
                if (objectAnimator != null) {
                    objectAnimator.removeAllListeners();
                    this.F7.cancel();
                }
                mb8 mb8Var = this.X7;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(mb8Var, (Property<mb8, Float>) View.TRANSLATION_Y, mb8Var.getTranslationY(), 0.0f);
                this.F7 = ofFloat;
                ofFloat.setDuration(220L);
                this.F7.setInterpolator(k43.f);
                this.F7.start();
            }
        } else if (frameLayout.getTag() != null) {
            ObjectAnimator objectAnimator2 = this.F7;
            if (objectAnimator2 != null) {
                objectAnimator2.removeAllListeners();
                this.F7.cancel();
            }
            mb8 mb8Var2 = this.X7;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(mb8Var2, (Property<mb8, Float>) View.TRANSLATION_Y, mb8Var2.getTranslationY(), hl.L(58.0f));
            this.F7 = ofFloat2;
            ofFloat2.addListener(new gf4(this.W7));
            this.F7.setDuration(220L);
            this.F7.setInterpolator(k43.f);
            this.F7.start();
        }
        FrameLayout frameLayout2 = this.W7;
        if (frameLayout2 != null && frameLayout2.getVisibility() != 8) {
            this.W7.setTranslationY(this.Q0.getTranslationY() - (this.V1.getAlpha() * c00.d(46.0f, this.V1.getEditTextHeight(), 0)));
        }
        this.W7.setTag(z ? 1 : null);
    }

    public final void n() {
        TextureView textureView;
        if (this.a8 == -1 || (textureView = this.C2) == null) {
            return;
        }
        this.a8 = -1L;
        this.A2.animate().alpha(1.0f).setInterpolator(k43.j).setDuration(85L).setListener(new v5(this, textureView.getBitmap(), (byte) 29)).start();
    }

    public final boolean n1(ArrayList arrayList, int i, long j, long j2, long j3, ed8 ed8Var) {
        return m1((r47) arrayList.get(i), null, null, null, arrayList, null, null, i, ed8Var, null, j, j2, j3, true, null, null);
    }

    public final void n2() {
        kfc kfcVar;
        if (!this.s1 || (kfcVar = this.G2) == null || kfcVar.c0() || T0()) {
            return;
        }
        if (!this.r || this.d2 == 1) {
            this.G2.A0(0.0f);
        }
        this.H2 = false;
        B2();
    }

    public final void o() {
        s6 s6Var = this.B0;
        if (s6Var != null) {
            s6Var.setTranslationX(this.g2 ? -hl.L(4.0f) : 0.0f);
        }
        s7 s7Var = this.F0;
        if (s7Var != null) {
            R1(s7Var, this.g2, false);
        }
        boolean z = this.f2;
        if (z && this.J == null) {
            jl0 c = this.Z.c(this.H, null, false);
            c.p(dtd.i(this.w2));
            c.r(hl.L(20.0f));
            c.q(hl.L(7.0f));
            int L = hl.L(54.0f);
            int L2 = hl.L(54.0f);
            Matrix matrix = uk0.a;
            this.J = new tk0(L, L2, c);
        }
        ImageView imageView = this.H;
        if (z) {
            iye.a(imageView);
            this.H.setBackground(this.J);
        } else {
            imageView.setStateListAnimator(null);
            this.H.setBackground(this.I);
        }
    }

    public final String o0(int i) {
        TLRPC.WebDocument webDocument;
        TLRPC.PhotoSize w;
        TLRPC.PhotoSize w2;
        TLRPC.PhotoSize w3;
        if (i >= 0) {
            ArrayList arrayList = this.d7;
            if (arrayList.isEmpty()) {
                ArrayList arrayList2 = this.Z6;
                boolean isEmpty = arrayList2.isEmpty();
                ArrayList arrayList3 = this.X6;
                if (isEmpty && arrayList3.isEmpty()) {
                    ArrayList arrayList4 = this.f7;
                    if (arrayList4.isEmpty()) {
                        bd8 bd8Var = this.i7;
                        if (bd8Var != null) {
                            return bd8Var.c(i);
                        }
                    } else if (i < arrayList4.size()) {
                        Object obj = arrayList4.get(i);
                        if (obj instanceof ro6) {
                            ro6 ro6Var = (ro6) obj;
                            TLRPC.PhotoSize photoSize = ro6Var.L;
                            if (photoSize != null) {
                                return xb4.r(null, photoSize);
                            }
                            TLRPC.Document document = ro6Var.J;
                            if (document != null) {
                                return xb4.r(null, document);
                            }
                            return Utilities.a(ro6Var.C) + "." + in5.x(ro6Var.C, "jpg");
                        }
                        if (obj instanceof TLRPC.BotInlineResult) {
                            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) obj;
                            TLRPC.Document document2 = botInlineResult.document;
                            if (document2 != null) {
                                return xb4.r(null, document2);
                            }
                            TLRPC.Photo photo = botInlineResult.photo;
                            if (photo != null) {
                                return xb4.r(null, xb4.w(photo.sizes, hl.Y0(false), false, null, false));
                            }
                            if (botInlineResult.content instanceof TLRPC.TL_webDocument) {
                                StringBuilder sb = new StringBuilder();
                                sb.append(Utilities.a(botInlineResult.content.url));
                                sb.append(".");
                                TLRPC.WebDocument webDocument2 = botInlineResult.content;
                                sb.append(in5.x(webDocument2.url, xb4.H(webDocument2.mime_type)));
                                return sb.toString();
                            }
                        }
                    }
                } else if (arrayList2.isEmpty()) {
                    if (i < arrayList3.size()) {
                        TLRPC.Message message = ((r47) arrayList3.get(i)).k;
                        Pattern pattern = xb4.J;
                        if (message == null) {
                            return "";
                        }
                        if (message instanceof TLRPC.TL_messageService) {
                            TLRPC.Photo photo2 = message.action.photo;
                            if (photo2 == null) {
                                return "";
                            }
                            ArrayList<TLRPC.PhotoSize> arrayList5 = photo2.sizes;
                            return (arrayList5.size() <= 0 || (w3 = xb4.w(arrayList5, hl.Y0(false), false, null, false)) == null) ? "" : xb4.r(null, w3);
                        }
                        if (r47.n1(message) instanceof TLRPC.TL_messageMediaDocument) {
                            return xb4.r(null, r47.n1(message).document);
                        }
                        if (r47.n1(message) instanceof TLRPC.TL_messageMediaPhoto) {
                            ArrayList<TLRPC.PhotoSize> arrayList6 = r47.n1(message).photo.sizes;
                            return (arrayList6.size() <= 0 || (w2 = xb4.w(arrayList6, hl.Y0(true), false, null, true)) == null) ? "" : xb4.r(null, w2);
                        }
                        if (r47.n1(message) instanceof TLRPC.TL_messageMediaWebPage) {
                            if (r47.n1(message).webpage.document != null) {
                                return xb4.r(null, r47.n1(message).webpage.document);
                            }
                            if (r47.n1(message).webpage.photo == null) {
                                return "";
                            }
                            ArrayList<TLRPC.PhotoSize> arrayList7 = r47.n1(message).webpage.photo.sizes;
                            return (arrayList7.size() <= 0 || (w = xb4.w(arrayList7, hl.Y0(false), false, null, false)) == null) ? "" : xb4.r(null, w);
                        }
                        if (!(r47.n1(message) instanceof TLRPC.TL_messageMediaInvoice) || (webDocument = ((TLRPC.TL_messageMediaInvoice) r47.n1(message)).webPhoto) == null) {
                            return "";
                        }
                        return Utilities.a(webDocument.url) + "." + in5.x(webDocument.url, xb4.H(webDocument.mime_type));
                    }
                } else if (i < arrayList2.size()) {
                    jn5 jn5Var = (jn5) arrayList2.get(i);
                    jn5 jn5Var2 = (jn5) this.a7.get(i);
                    if (jn5Var != null) {
                        if (jn5Var2 == null || jn5Var2 == jn5Var) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(jn5Var.f.volume_id);
                            sb2.append("_");
                            return uh9.l(sb2, jn5Var.f.local_id, ".jpg");
                        }
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(jn5Var2.f.volume_id);
                        sb3.append("_");
                        return uh9.l(sb3, jn5Var2.f.local_id, ".mp4");
                    }
                }
            } else if (i < arrayList.size()) {
                oy9 oy9Var = (oy9) arrayList.get(i);
                StringBuilder sb4 = new StringBuilder();
                sb4.append(oy9Var.b.dc_id);
                sb4.append("_");
                return qu6.p(sb4, oy9Var.b.id, ".jpg");
            }
        }
        return null;
    }

    public final void o1(ArrayList arrayList, int i, int i2, boolean z, ed8 ed8Var, zu1 zu1Var) {
        in inVar;
        int i3 = i2;
        this.i2 = z;
        di3 di3Var = this.T0;
        if (di3Var != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) di3Var.getLayoutParams();
            if (i3 == 4 || i3 == 5) {
                this.T0.setResourceId(R.drawable.send_plane_24);
                layoutParams.bottomMargin = hl.L(1.0f);
            } else if (i3 == 13 || i3 == 14 || i3 == 1 || i3 == 3 || i3 == 10 || i3 == 11) {
                this.T0.setResourceId(R.drawable.floating_check);
                this.T0.setPadding(0, hl.L(1.0f), 0, 0);
                layoutParams.bottomMargin = hl.L(1.0f);
            } else {
                this.T0.setResourceId(R.drawable.send_plane_24);
                layoutParams.bottomMargin = hl.L(1.0f);
            }
            this.T0.setLayoutParams(layoutParams);
        }
        if (i3 != 11 && this.o5 != null) {
            this.A7 = false;
            ImageView imageView = this.d1;
            if (imageView != null) {
                imageView.setAlpha(1.0f);
            }
            sc8 sc8Var = this.x5;
            if (sc8Var != null) {
                sc8Var.m(false, false);
            }
            this.o5.b();
            ArrayList arrayList2 = this.q5;
            if (arrayList2 != null) {
                arrayList2.clear();
            }
        }
        boolean z2 = this.e;
        BackgroundDrawable backgroundDrawable = this.M0;
        if (z2 && this.d2 != i3 && i3 == 1) {
            this.d2 = i3;
            this.v2 = false;
            this.N.c("");
            this.N.a("", false);
            this.d = ed8Var;
            this.H5 = 0L;
            this.D5 = 0L;
            this.q1.f();
            this.i7 = null;
            if (this.T6 == null) {
                this.T6 = VelocityTracker.obtain();
            }
            this.e = true;
            this.f = true;
            A2(false, false);
            this.m2 = false;
            C();
            t2(false, false);
            this.e3 = 0.0f;
            this.V2 = false;
            this.U2 = false;
            W0();
            backgroundDrawable.setAlpha(jn7.d4);
            this.f0.setAlpha(1.0f);
            d1(null, null, null, null, null, null, arrayList, i, null);
            F0();
            I1();
            return;
        }
        if (!z2 || this.d2 == i3 || i3 != 11) {
            this.d2 = i3;
            if (i3 == 12) {
                this.d2 = 0;
                this.e2 = true;
                i3 = 0;
            }
            boolean z3 = i3 == 14;
            this.g2 = z3;
            if (i3 == 13 || z3) {
                this.d2 = 0;
                this.f2 = true;
            }
            this.a.a(z3, false);
            if (this.d2 == 11) {
                this.k0.setBackgroundColor(-16777216);
            }
            dd8 dd8Var = this.N;
            if (dd8Var != null && (inVar = dd8Var.d) != null) {
                inVar.setVisibility(this.f2 ? 8 : 0);
            }
            m1(null, null, null, null, null, null, arrayList, i, ed8Var, zu1Var, 0L, 0L, 0L, true, null, null);
            return;
        }
        this.d2 = i3;
        this.v2 = false;
        this.N.c("");
        this.N.a("", false);
        this.d = ed8Var;
        this.H5 = 0L;
        this.D5 = 0L;
        this.q1.f();
        this.i7 = null;
        if (this.T6 == null) {
            this.T6 = VelocityTracker.obtain();
        }
        this.e = true;
        this.f = true;
        A2(false, false);
        this.e3 = 0.0f;
        this.V2 = false;
        this.U2 = false;
        W0();
        backgroundDrawable.setAlpha(jn7.d4);
        this.f0.setAlpha(1.0f);
        d1(null, null, null, null, null, null, arrayList, i, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:501:0x0088, code lost:
    
        if (r37.d2 == 11) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0273, code lost:
    
        if (r3 == 1) goto L167;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0402  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o2(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        String str;
        po6 po6Var;
        int i7;
        Bitmap decodeFile;
        Bitmap bitmap;
        int i8;
        int i10;
        byte b;
        qx7 qx7Var;
        kec kecVar;
        fo6 fo6Var;
        int i11;
        boolean z;
        byte b2;
        int i12;
        int i13;
        int i14;
        boolean z2;
        float min;
        float f;
        fo6 fo6Var2;
        int i15;
        if (this.t4 != i) {
            boolean z3 = this.s1;
            if (z3) {
                lb8[] lb8VarArr = this.X0;
                if (lb8VarArr[0].h != 3 && !z3 && (this.B4.n() == null || lb8VarArr[0].h != -1)) {
                    return;
                }
            }
            if (this.p6 == null && this.o6 == null && !K0()) {
                ed8 ed8Var = this.d;
                if (ed8Var != null && (this.t4 == 0 || i == 0)) {
                    ed8Var.j();
                }
                this.h0.setClipChildren(i == 2);
                int i16 = 2130706432;
                int color = this.k0.getBackground() instanceof ColorDrawable ? ((ColorDrawable) this.k0.getBackground()).getColor() : 2130706432;
                if (i == 1) {
                    i16 = -872415232;
                } else {
                    if (i != 3) {
                        if (i == 0 && this.R4 && this.h7 == null) {
                            i16 = this.d2 == 11 ? 1711276032 : 0;
                        }
                    }
                    i16 = -16777216;
                }
                f2(this.Q4 && this.h7 == null && i == 0, true);
                k2((i == 0 || i == 4 || (i == 3 && this.A7)) && this.d2 == 11, true);
                this.k0.setVisibility(i != 2 ? 0 : 4);
                this.n6 = i;
                if (this.t4 == 0) {
                    cd8 cd8Var = this.O;
                    this.w7 = cd8Var != null && cd8Var.isShown();
                }
                cd8 cd8Var2 = this.O;
                if (cd8Var2 != null) {
                    cd8Var2.d(i == 0 && this.w7, true);
                }
                xc8 xc8Var = this.W4;
                u33 u33Var = this.E1;
                if (i == 0) {
                    Bitmap n = this.B4.n();
                    hc8 hc8Var = this.M1;
                    if (hc8Var != null) {
                        hc8Var.setDrawShadow(false);
                    }
                    byte b3 = this.t4;
                    if (b3 == 4 || b3 == 5) {
                        this.m6 = System.currentTimeMillis();
                        float f2 = this.X5;
                        this.h6 = f2;
                        this.c6 = f2;
                        float f3 = this.W5;
                        this.g6 = f3;
                        this.b6 = f3;
                        float f4 = this.a6;
                        this.j6 = f4;
                        this.e6 = f4;
                        this.f6 = 0.0f;
                        float f5 = this.Z5;
                        this.i6 = f5;
                        this.d6 = f5;
                    } else if (n != null) {
                        int q = this.B4.q();
                        int o = this.B4.o();
                        byte b4 = this.t4;
                        if (b4 == 3) {
                            if (this.d2 == 1) {
                                int i17 = u33Var.i;
                                if (i17 == 90 || i17 == 270) {
                                    o = q;
                                    q = o;
                                }
                            } else {
                                fo6 fo6Var3 = xc8Var.c;
                                if (fo6Var3 != null) {
                                    int i18 = fo6Var3.k;
                                    if (i18 == 90 || i18 == 270) {
                                        o = q;
                                        q = o;
                                    }
                                    q = (int) (q * fo6Var3.e);
                                    o = (int) (o * fo6Var3.f);
                                }
                            }
                            float f6 = q;
                            float f7 = o;
                            float min2 = Math.min(h0(0) / f6, e0(0, false) / f7);
                            f = Math.min(h0(3) / f6, e0(3, false) / f7);
                            min = min2;
                            z2 = false;
                        } else {
                            if (b4 != 1 && (fo6Var2 = xc8Var.c) != null && ((i15 = fo6Var2.k) == 90 || i15 == 270)) {
                                float f8 = o;
                                float g0 = g0() / f8;
                                float f10 = q;
                                if (g0 * f10 > f0()) {
                                    g0 = f0() / f10;
                                }
                                this.Z5 = 1.0f / (g0 / Math.min(g0() / f10, f0() / f8));
                            } else if (this.d2 == 1 && ((i13 = u33Var.i) == 90 || i13 == 270)) {
                                float f11 = o;
                                float g02 = g0() / f11;
                                float f12 = q;
                                if (g02 * f12 > f0()) {
                                    g02 = f0() / f12;
                                }
                                this.Z5 = 1.0f / ((((u33Var.f / u33Var.l) * g02) / Math.min(g0() / f12, f0() / f11)) / u33Var.m);
                            }
                            fo6 fo6Var4 = xc8Var.c;
                            if (fo6Var4 != null) {
                                int i19 = fo6Var4.k;
                                if (i19 == 90 || i19 == 270) {
                                    o = q;
                                    q = o;
                                }
                                q = (int) (q * fo6Var4.e);
                                o = (int) (o * fo6Var4.f);
                            } else if (this.d2 == 1 && ((i14 = u33Var.i) == 90 || i14 == 270)) {
                                o = q;
                                q = o;
                            }
                            float f13 = q;
                            float f14 = o;
                            float min3 = Math.min(g0() / f13, f0() / f14);
                            if (this.d2 == 1) {
                                int i20 = u33Var.i;
                                min = i0(i20 == 90 || i20 == 270);
                                f = min3;
                                z2 = false;
                            } else {
                                z2 = false;
                                min = Math.min(h0(0) / f13, e0(0, false) / f14);
                                f = min3;
                            }
                        }
                        if (this.t4 == 4) {
                            this.u5.m(z2, true);
                            this.v5.m(z2, true);
                        }
                        if (this.d2 == 11) {
                            byte b5 = this.t4;
                            byte b6 = (b5 == 3 || b5 == 2) ? (byte) 1 : (byte) 1;
                            this.m6 = System.currentTimeMillis();
                            this.b6 = this.g6;
                            byte b7 = this.t4;
                            if (b7 == b6) {
                                this.c6 = this.h6 + hl.L(56.0f);
                            } else if (b7 == 3) {
                                float L = this.h6 + hl.L(44.0f);
                                this.c6 = L;
                                if (this.M1 != null) {
                                    float additionalTop = L - (r4.getAdditionalTop() / 2.0f);
                                    this.c6 = additionalTop;
                                    this.c6 = (this.M1.getAdditionalBottom() / 2.0f) + additionalTop;
                                }
                            } else if (b7 == 2) {
                                this.c6 = this.h6 + hl.L(93.0f);
                            }
                            if (!this.s) {
                                this.c6 -= hl.m / 2;
                            }
                            this.d6 = (min / f) * this.i6;
                            this.e6 = this.j6;
                            this.f6 = 0.0f;
                            this.m6 = System.currentTimeMillis();
                            this.Q6 = true;
                        }
                        this.d6 = y1() * (min / f);
                        this.b6 = 0.0f;
                        this.W5 = (r0() / 2) - (w0() / 2);
                        int i21 = this.d2;
                        byte b8 = this.t4;
                        if (i21 != 1) {
                            if (b8 == 1) {
                                this.c6 = hl.L(56.0f);
                            } else if (b8 == 2) {
                                this.c6 = hl.L(93.0f);
                            } else if (b8 == 3) {
                                float L2 = hl.L(44.0f);
                                this.c6 = L2;
                                if (this.M1 != null) {
                                    float additionalTop2 = L2 - (r4.getAdditionalTop() / 2.0f);
                                    this.c6 = additionalTop2;
                                    this.c6 = (this.M1.getAdditionalBottom() / 2.0f) + additionalTop2;
                                }
                            }
                            if (!this.s) {
                                this.c6 -= hl.m / 2;
                            }
                        } else if (b8 == 2) {
                            this.c6 = hl.L(36.0f);
                        } else if (b8 == 3) {
                            float f15 = -hl.L(12.0f);
                            this.c6 = f15;
                            if (this.M1 != null) {
                                this.c6 = f15 - (r4.getAdditionalTop() / 2.0f);
                            }
                        }
                        this.m6 = System.currentTimeMillis();
                        this.Q6 = true;
                    } else {
                        z = false;
                        this.u2 = z;
                        this.o6 = new AnimatorSet();
                        ArrayList arrayList = new ArrayList(4);
                        b2 = this.t4;
                        byte b9 = 1;
                        if (b2 != 1) {
                            arrayList.add(ObjectAnimator.ofFloat(this.V0, (Property<pa2, Float>) View.TRANSLATION_Y, hl.L(48.0f)));
                            arrayList.add(ObjectAnimator.ofFloat(this, sn.g, 0.0f, 1.0f));
                            arrayList.add(ObjectAnimator.ofFloat(this.D1, (Property<k88, Float>) View.ALPHA, 0.0f));
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            ofFloat.addUpdateListener(new w98(this, b9));
                            arrayList.add(ofFloat);
                            i12 = 2;
                        } else {
                            byte b10 = 2;
                            if (b2 == 2) {
                                this.J1.c();
                                arrayList.add(ObjectAnimator.ofFloat(this.J1.getToolsView(), (Property<FrameLayout, Float>) View.TRANSLATION_Y, hl.L(186.0f)));
                                v88 curveControl = this.J1.getCurveControl();
                                Property property = View.ALPHA;
                                arrayList.add(ObjectAnimator.ofFloat(curveControl, (Property<v88, Float>) property, 0.0f));
                                arrayList.add(ObjectAnimator.ofFloat(this.J1.getBlurControl(), (Property<t88, Float>) property, 0.0f));
                                i12 = 2;
                                arrayList.add(ObjectAnimator.ofFloat(this, sn.g, 0.0f, 1.0f));
                            } else {
                                if (b2 == 3) {
                                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.M1.getOffsetTranslationY(), hl.L(126.0f));
                                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, -hl.L(12.0f));
                                    ofFloat2.addUpdateListener(new w98(this, b10));
                                    ofFloat3.addUpdateListener(new w98(this, (byte) 3));
                                    this.x4.c();
                                    this.f0.invalidate();
                                    this.M1.C0();
                                    arrayList.add(ofFloat2);
                                    arrayList.add(ofFloat3);
                                    arrayList.add(ObjectAnimator.ofFloat(this, sn.g, 0.0f, 1.0f));
                                    this.M1.o0(true);
                                } else if (b2 == 4) {
                                    arrayList.add(ObjectAnimator.ofFloat(this.O1.r, (Property<FrameLayout, Float>) View.TRANSLATION_Y, hl.L(18.0f)));
                                    FrameLayout frameLayout = this.O1.r;
                                    Property property2 = View.ALPHA;
                                    arrayList.add(ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property2, 0.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(this.O1.x, (Property<gx7, Float>) View.TRANSLATION_X, hl.L(-18.0f)));
                                    arrayList.add(ObjectAnimator.ofFloat(this.O1.x, (Property<gx7, Float>) property2, 0.0f));
                                } else if (b2 == 5) {
                                    this.p5.setVisibility(0);
                                    i12 = 2;
                                    arrayList.add(ObjectAnimator.ofFloat(this.p5, (Property<ld8, Float>) View.ALPHA, 1.0f, 0.0f));
                                }
                                i12 = 2;
                            }
                        }
                        View view = this.k0;
                        ArgbEvaluator argbEvaluator = new ArgbEvaluator();
                        Integer valueOf = Integer.valueOf(color);
                        Integer valueOf2 = Integer.valueOf(i16);
                        Object[] objArr = new Object[i12];
                        objArr[0] = valueOf;
                        objArr[1] = valueOf2;
                        arrayList.add(ObjectAnimator.ofObject(view, "backgroundColor", argbEvaluator, objArr));
                        this.o6.playTogether(arrayList);
                        this.o6.setDuration(200L);
                        this.o6.addListener(new s(this, i));
                        this.o6.start();
                    }
                    z = false;
                    this.u2 = z;
                    this.o6 = new AnimatorSet();
                    ArrayList arrayList2 = new ArrayList(4);
                    b2 = this.t4;
                    byte b92 = 1;
                    if (b2 != 1) {
                    }
                    View view2 = this.k0;
                    ArgbEvaluator argbEvaluator2 = new ArgbEvaluator();
                    Integer valueOf3 = Integer.valueOf(color);
                    Integer valueOf22 = Integer.valueOf(i16);
                    Object[] objArr2 = new Object[i12];
                    objArr2[0] = valueOf3;
                    objArr2[1] = valueOf22;
                    arrayList2.add(ObjectAnimator.ofObject(view2, "backgroundColor", argbEvaluator2, objArr2));
                    this.o6.playTogether(arrayList2);
                    this.o6.setDuration(200L);
                    this.o6.addListener(new s(this, i));
                    this.o6.start();
                } else {
                    if (i == 1) {
                        n2();
                        C();
                        this.J2 = u33Var.a;
                        this.K2 = u33Var.b;
                        this.L2 = u33Var.c;
                        this.O2 = u33Var.f;
                        this.P2 = u33Var.g;
                        this.R2 = u33Var.i;
                        this.M2 = u33Var.j;
                        this.N2 = u33Var.k;
                        this.Q2 = u33Var.h;
                        CropAreaView cropAreaView = this.D1.b.a;
                        cropAreaView.f(true, false);
                        cropAreaView.setDimVisibility(true);
                        cropAreaView.invalidate();
                        ((TextView) this.V0.b).setText(ob6.L0(2131751664));
                        yob.X((TextView) this.V0.b, aob.qg, this.w2);
                        this.p6 = new AnimatorSet();
                        ArrayList arrayList3 = new ArrayList();
                        jo0 jo0Var = this.Q0;
                        Property property3 = View.TRANSLATION_Y;
                        arrayList3.add(ObjectAnimator.ofFloat(jo0Var, (Property<jo0, Float>) property3, 0.0f, this.V1.getEditTextHeight() + jo0Var.getHeight() + (this.s1 ? hl.L(58.0f) : 0)));
                        jo0 jo0Var2 = this.Q0;
                        Property property4 = View.ALPHA;
                        arrayList3.add(ObjectAnimator.ofFloat(jo0Var2, (Property<jo0, Float>) property4, 0.0f));
                        k3b k3bVar = this.o5;
                        if (k3bVar != null) {
                            arrayList3.add(ObjectAnimator.ofFloat(k3bVar, (Property<k3b, Float>) property4, 0.0f));
                        }
                        vl4 vl4Var = this.r5;
                        if (vl4Var != null) {
                            arrayList3.add(ObjectAnimator.ofFloat(vl4Var, (Property<vl4, Float>) property4, 0.0f));
                        }
                        arrayList3.add(ObjectAnimator.ofFloat(this.T0, (Property<di3, Float>) property3, 0.0f, hl.L(this.s1 ? 154.0f : 96.0f)));
                        arrayList3.add(ObjectAnimator.ofFloat(this.G, (Property<y10, Float>) property3, 0.0f, -r4.getHeight()));
                        arrayList3.add(ObjectAnimator.ofObject(this.k0, "backgroundColor", new ArgbEvaluator(), Integer.valueOf(color), Integer.valueOf(i16)));
                        if (this.j2) {
                            arrayList3.add(ObjectAnimator.ofFloat(this.R1, (Property<wc8, Float>) property3, 0.0f, hl.L(this.s1 ? 154.0f : 96.0f)));
                        }
                        int i22 = this.d2;
                        if (i22 == 0 || i22 == 4) {
                            i11 = 2;
                            arrayList3.add(ObjectAnimator.ofFloat(this.O0, (Property<CheckBox, Float>) property4, 1.0f, 0.0f));
                            arrayList3.add(ObjectAnimator.ofFloat(this.P0, (Property<CounterView, Float>) property4, 1.0f, 0.0f));
                        } else {
                            i11 = 2;
                        }
                        if (this.p1.getVisibility() == 0) {
                            float[] fArr = new float[i11];
                            // fill-array-data instruction
                            fArr[0] = 1.0f;
                            fArr[1] = 0.0f;
                            arrayList3.add(ObjectAnimator.ofFloat(this.p1, (Property<jd8, Float>) property4, fArr));
                        }
                        if (this.f1.getTag() != null) {
                            float[] fArr2 = new float[i11];
                            // fill-array-data instruction
                            fArr2[0] = 1.0f;
                            fArr2[1] = 0.0f;
                            arrayList3.add(ObjectAnimator.ofFloat(this.f1, (Property<d7, Float>) property4, fArr2));
                        }
                        if (this.g1.getTag() != null) {
                            float[] fArr3 = new float[i11];
                            // fill-array-data instruction
                            fArr3[0] = 1.0f;
                            fArr3[1] = 0.0f;
                            arrayList3.add(ObjectAnimator.ofFloat(this.g1, (Property<s96, Float>) property4, fArr3));
                        }
                        if (this.h1.getTag() != null) {
                            float[] fArr4 = new float[i11];
                            // fill-array-data instruction
                            fArr4[0] = 1.0f;
                            fArr4[1] = 0.0f;
                            arrayList3.add(ObjectAnimator.ofFloat(this.h1, (Property<nb8, Float>) property4, fArr4));
                        }
                        View view3 = this.k0;
                        if (view3 != null) {
                            arrayList3.add(ObjectAnimator.ofFloat(view3, (Property<View, Float>) property4, 1.0f));
                        }
                        this.p6.playTogether(arrayList3);
                        this.p6.setDuration(200L);
                        this.p6.addListener(new t(this, i));
                        this.p6.start();
                    } else {
                        ArrayList arrayList4 = this.f7;
                        if (i == 2) {
                            boolean z4 = (!this.s1 || this.C2 == null || (this.I4 && U0())) ? false : true;
                            if (z4) {
                                n2();
                            }
                            if (this.J1 == null) {
                                if (arrayList4.isEmpty()) {
                                    str = null;
                                    po6Var = null;
                                    i7 = 0;
                                } else {
                                    Object obj = arrayList4.get(this.O4);
                                    i7 = obj instanceof no6 ? ((no6) obj).J : 0;
                                    go6 go6Var = (go6) obj;
                                    po6 po6Var2 = go6Var.o;
                                    str = go6Var.a();
                                    po6Var = po6Var2;
                                }
                                if (z4) {
                                    i8 = i7;
                                    bitmap = null;
                                } else {
                                    if (po6Var == null) {
                                        k3b k3bVar2 = this.o5;
                                        decodeFile = k3bVar2.M ? k3bVar2.getSourceBitmap() : this.B4.n();
                                        i7 = this.B4.V;
                                    } else {
                                        decodeFile = BitmapFactory.decodeFile(str);
                                    }
                                    bitmap = decodeFile;
                                    i8 = i7;
                                }
                                if (this.d2 == 1) {
                                    i10 = 1;
                                } else if (z4 || (b = this.v4) == 2) {
                                    i10 = 2;
                                } else {
                                    i10 = b == 1 ? 1 : 0;
                                }
                                Bitmap segmentedDarkMaskImage = this.o5.getSegmentedDarkMaskImage();
                                Activity activity = this.E;
                                if (z4) {
                                    kecVar = (kec) this.C2;
                                    qx7Var = null;
                                } else {
                                    qx7Var = this.x4;
                                    kecVar = null;
                                }
                                c98 c98Var = new c98(activity, kecVar, bitmap, segmentedDarkMaskImage, i8, po6Var, qx7Var, i10, !z4 && (((fo6Var = xc8Var.c) != null && fo6Var.l) || u33Var.h), true, null, this.w2);
                                this.J1 = c98Var;
                                this.f0.addView(c98Var, tre.c(-1.0f, -1));
                                this.J1.getDoneTextView().setOnClickListener(new z98(this, (byte) 0));
                                this.J1.getCancelTextView().setOnClickListener(new z98(this, (byte) 1));
                                this.J1.getToolsView().setTranslationY(hl.L(186.0f));
                            }
                            this.p6 = new AnimatorSet();
                            ArrayList arrayList5 = new ArrayList();
                            jo0 jo0Var3 = this.Q0;
                            Property property5 = View.TRANSLATION_Y;
                            arrayList5.add(ObjectAnimator.ofFloat(jo0Var3, (Property<jo0, Float>) property5, 0.0f, this.V1.getEditTextHeight() + jo0Var3.getHeight() + (this.s1 ? hl.L(58.0f) : 0)));
                            jo0 jo0Var4 = this.Q0;
                            Property property6 = View.ALPHA;
                            arrayList5.add(ObjectAnimator.ofFloat(jo0Var4, (Property<jo0, Float>) property6, 0.0f));
                            k3b k3bVar3 = this.o5;
                            if (k3bVar3 != null) {
                                arrayList5.add(ObjectAnimator.ofFloat(k3bVar3, (Property<k3b, Float>) property6, 0.0f));
                            }
                            vl4 vl4Var2 = this.r5;
                            if (vl4Var2 != null) {
                                arrayList5.add(ObjectAnimator.ofFloat(vl4Var2, (Property<vl4, Float>) property6, 0.0f));
                            }
                            arrayList5.add(ObjectAnimator.ofFloat(this.T0, (Property<di3, Float>) property5, 0.0f, hl.L(this.s1 ? 154.0f : 96.0f)));
                            arrayList5.add(ObjectAnimator.ofFloat(this.G, (Property<y10, Float>) property5, 0.0f, -r4.getHeight()));
                            int i23 = this.d2;
                            if (i23 == 0 || i23 == 4) {
                                arrayList5.add(ObjectAnimator.ofFloat(this.O0, (Property<CheckBox, Float>) property6, 1.0f, 0.0f));
                                arrayList5.add(ObjectAnimator.ofFloat(this.P0, (Property<CounterView, Float>) property6, 1.0f, 0.0f));
                            } else if (i23 == 1) {
                                arrayList5.add(ObjectAnimator.ofFloat(this.D1, (Property<k88, Float>) property6, 1.0f, 0.0f));
                            }
                            if (this.p1.getVisibility() == 0) {
                                arrayList5.add(ObjectAnimator.ofFloat(this.p1, (Property<jd8, Float>) property6, 1.0f, 0.0f));
                            }
                            if (this.f1.getTag() != null) {
                                arrayList5.add(ObjectAnimator.ofFloat(this.f1, (Property<d7, Float>) property6, 1.0f, 0.0f));
                            }
                            if (this.g1.getTag() != null) {
                                arrayList5.add(ObjectAnimator.ofFloat(this.g1, (Property<s96, Float>) property6, 1.0f, 0.0f));
                            }
                            if (this.h1.getTag() != null) {
                                arrayList5.add(ObjectAnimator.ofFloat(this.h1, (Property<nb8, Float>) property6, 1.0f, 0.0f));
                            }
                            arrayList5.add(ObjectAnimator.ofObject(this.k0, "backgroundColor", new ArgbEvaluator(), Integer.valueOf(color), Integer.valueOf(i16)));
                            this.p6.playTogether(arrayList5);
                            this.p6.setDuration(200L);
                            this.p6.addListener(new u(this, i));
                            this.p6.start();
                        } else if (i == 3) {
                            n2();
                            F();
                            this.p6 = new AnimatorSet();
                            ArrayList arrayList6 = new ArrayList();
                            jo0 jo0Var5 = this.Q0;
                            Property property7 = View.TRANSLATION_Y;
                            arrayList6.add(ObjectAnimator.ofFloat(jo0Var5, (Property<jo0, Float>) property7, this.V1.getEditTextHeight() + jo0Var5.getHeight() + (this.s1 ? hl.L(58.0f) : 0)));
                            jo0 jo0Var6 = this.Q0;
                            Property property8 = View.ALPHA;
                            arrayList6.add(ObjectAnimator.ofFloat(jo0Var6, (Property<jo0, Float>) property8, 0.0f));
                            k3b k3bVar4 = this.o5;
                            if (k3bVar4 != null) {
                                arrayList6.add(ObjectAnimator.ofFloat(k3bVar4, (Property<k3b, Float>) property8, this.A7 ? 1.0f : 0.0f));
                            }
                            vl4 vl4Var3 = this.r5;
                            if (vl4Var3 != null) {
                                arrayList6.add(ObjectAnimator.ofFloat(vl4Var3, (Property<vl4, Float>) property8, this.A7 ? 1.0f : 0.0f));
                            }
                            arrayList6.add(ObjectAnimator.ofFloat(this.T0, (Property<di3, Float>) property7, hl.L(this.s1 ? 154.0f : 96.0f)));
                            arrayList6.add(ObjectAnimator.ofFloat(this.G, (Property<y10, Float>) property7, -r3.getHeight()));
                            arrayList6.add(ObjectAnimator.ofObject(this.k0, "backgroundColor", new ArgbEvaluator(), Integer.valueOf(color), Integer.valueOf(i16)));
                            if (this.j2) {
                                i5 = 1;
                                arrayList6.add(ObjectAnimator.ofFloat(this.R1, (Property<wc8, Float>) property7, hl.L(this.s1 ? 154.0f : 96.0f)));
                            } else {
                                i5 = 1;
                            }
                            int i24 = this.d2;
                            if (i24 == 0 || i24 == 4) {
                                i6 = 2;
                                arrayList6.add(ObjectAnimator.ofFloat(this.O0, (Property<CheckBox, Float>) property8, 1.0f, 0.0f));
                                arrayList6.add(ObjectAnimator.ofFloat(this.P0, (Property<CounterView, Float>) property8, 1.0f, 0.0f));
                            } else if (i24 == i5) {
                                i6 = 2;
                                arrayList6.add(ObjectAnimator.ofFloat(this.D1, (Property<k88, Float>) property8, 1.0f, 0.0f));
                            } else {
                                i6 = 2;
                            }
                            if (this.p1.getVisibility() == 0) {
                                float[] fArr5 = new float[i6];
                                // fill-array-data instruction
                                fArr5[0] = 1.0f;
                                fArr5[1] = 0.0f;
                                arrayList6.add(ObjectAnimator.ofFloat(this.p1, (Property<jd8, Float>) property8, fArr5));
                            }
                            if (this.f1.getTag() != null) {
                                float[] fArr6 = new float[i6];
                                // fill-array-data instruction
                                fArr6[0] = 1.0f;
                                fArr6[1] = 0.0f;
                                arrayList6.add(ObjectAnimator.ofFloat(this.f1, (Property<d7, Float>) property8, fArr6));
                            }
                            if (this.g1.getTag() != null) {
                                float[] fArr7 = new float[i6];
                                // fill-array-data instruction
                                fArr7[0] = 1.0f;
                                fArr7[1] = 0.0f;
                                arrayList6.add(ObjectAnimator.ofFloat(this.g1, (Property<s96, Float>) property8, fArr7));
                            }
                            if (this.h1.getTag() != null) {
                                float[] fArr8 = new float[i6];
                                // fill-array-data instruction
                                fArr8[0] = 1.0f;
                                fArr8[1] = 0.0f;
                                arrayList6.add(ObjectAnimator.ofFloat(this.h1, (Property<nb8, Float>) property8, fArr8));
                            }
                            this.p6.playTogether(arrayList6);
                            this.p6.setDuration(200L);
                            this.p6.addListener(new wb8(this, (byte) 2));
                            this.p6.start();
                        } else if (i == 4) {
                            E();
                            this.p6 = new AnimatorSet();
                            ArrayList arrayList7 = new ArrayList();
                            jo0 jo0Var7 = this.Q0;
                            Property property9 = View.TRANSLATION_Y;
                            arrayList7.add(ObjectAnimator.ofFloat(jo0Var7, (Property<jo0, Float>) property9, this.V1.getEditTextHeight() + jo0Var7.getHeight() + (this.s1 ? hl.L(58.0f) : 0)));
                            jo0 jo0Var8 = this.Q0;
                            Property property10 = View.ALPHA;
                            arrayList7.add(ObjectAnimator.ofFloat(jo0Var8, (Property<jo0, Float>) property10, 0.0f));
                            k3b k3bVar5 = this.o5;
                            if (k3bVar5 != null) {
                                arrayList7.add(ObjectAnimator.ofFloat(k3bVar5, (Property<k3b, Float>) property10, 1.0f));
                            }
                            vl4 vl4Var4 = this.r5;
                            if (vl4Var4 != null) {
                                arrayList7.add(ObjectAnimator.ofFloat(vl4Var4, (Property<vl4, Float>) property10, 1.0f));
                            }
                            arrayList7.add(ObjectAnimator.ofFloat(this.T0, (Property<di3, Float>) property9, hl.L(this.s1 ? 154.0f : 96.0f)));
                            arrayList7.add(ObjectAnimator.ofFloat(this.G, (Property<y10, Float>) property9, -r4.getHeight()));
                            arrayList7.add(ObjectAnimator.ofObject(this.k0, "backgroundColor", new ArgbEvaluator(), Integer.valueOf(color), Integer.valueOf(i16)));
                            if (this.j2) {
                                i3 = 1;
                                arrayList7.add(ObjectAnimator.ofFloat(this.R1, (Property<wc8, Float>) property9, hl.L(this.s1 ? 154.0f : 96.0f)));
                            } else {
                                i3 = 1;
                            }
                            int i25 = this.d2;
                            if (i25 == 0 || i25 == 4) {
                                i4 = 2;
                                arrayList7.add(ObjectAnimator.ofFloat(this.O0, (Property<CheckBox, Float>) property10, 1.0f, 0.0f));
                                arrayList7.add(ObjectAnimator.ofFloat(this.P0, (Property<CounterView, Float>) property10, 1.0f, 0.0f));
                            } else if (i25 == i3) {
                                i4 = 2;
                                arrayList7.add(ObjectAnimator.ofFloat(this.D1, (Property<k88, Float>) property10, 1.0f, 0.0f));
                            } else {
                                i4 = 2;
                            }
                            if (this.p1.getVisibility() == 0) {
                                float[] fArr9 = new float[i4];
                                // fill-array-data instruction
                                fArr9[0] = 1.0f;
                                fArr9[1] = 0.0f;
                                arrayList7.add(ObjectAnimator.ofFloat(this.p1, (Property<jd8, Float>) property10, fArr9));
                            }
                            if (this.f1.getTag() != null) {
                                float[] fArr10 = new float[i4];
                                // fill-array-data instruction
                                fArr10[0] = 1.0f;
                                fArr10[1] = 0.0f;
                                arrayList7.add(ObjectAnimator.ofFloat(this.f1, (Property<d7, Float>) property10, fArr10));
                            }
                            if (this.g1.getTag() != null) {
                                float[] fArr11 = new float[i4];
                                // fill-array-data instruction
                                fArr11[0] = 1.0f;
                                fArr11[1] = 0.0f;
                                arrayList7.add(ObjectAnimator.ofFloat(this.g1, (Property<s96, Float>) property10, fArr11));
                            }
                            if (this.h1.getTag() != null) {
                                float[] fArr12 = new float[i4];
                                // fill-array-data instruction
                                fArr12[0] = 1.0f;
                                fArr12[1] = 0.0f;
                                arrayList7.add(ObjectAnimator.ofFloat(this.h1, (Property<nb8, Float>) property10, fArr12));
                            }
                            this.p6.playTogether(arrayList7);
                            this.p6.setDuration(200L);
                            this.p6.addListener(new fc8(this, i, (byte) 0));
                            this.p6.start();
                        } else if (i == 5) {
                            if (this.p5.b.a() || (i2 = this.O4) < 0 || i2 >= arrayList4.size() || !(arrayList4.get(this.O4) instanceof no6)) {
                                return;
                            }
                            no6 no6Var = (no6) arrayList4.get(this.O4);
                            this.p6 = new AnimatorSet();
                            ArrayList arrayList8 = new ArrayList();
                            jo0 jo0Var9 = this.Q0;
                            Property property11 = View.TRANSLATION_Y;
                            arrayList8.add(ObjectAnimator.ofFloat(jo0Var9, (Property<jo0, Float>) property11, this.V1.getEditTextHeight() + jo0Var9.getHeight() + (this.s1 ? hl.L(58.0f) : 0)));
                            jo0 jo0Var10 = this.Q0;
                            Property property12 = View.ALPHA;
                            arrayList8.add(ObjectAnimator.ofFloat(jo0Var10, (Property<jo0, Float>) property12, 0.0f));
                            arrayList8.add(ObjectAnimator.ofFloat(this.T0, (Property<di3, Float>) property11, hl.L(this.s1 ? 154.0f : 96.0f)));
                            arrayList8.add(ObjectAnimator.ofFloat(this.G, (Property<y10, Float>) property11, -r4.getHeight()));
                            arrayList8.add(ObjectAnimator.ofObject(this.k0, "backgroundColor", new ArgbEvaluator(), Integer.valueOf(color), Integer.valueOf(i16)));
                            int i26 = this.d2;
                            if (i26 == 0 || i26 == 4) {
                                arrayList8.add(ObjectAnimator.ofFloat(this.O0, (Property<CheckBox, Float>) property12, 1.0f, 0.0f));
                                arrayList8.add(ObjectAnimator.ofFloat(this.P0, (Property<CounterView, Float>) property12, 1.0f, 0.0f));
                            } else if (i26 == 1) {
                                arrayList8.add(ObjectAnimator.ofFloat(this.D1, (Property<k88, Float>) property12, 1.0f, 0.0f));
                            }
                            if (this.p1.getVisibility() == 0) {
                                arrayList8.add(ObjectAnimator.ofFloat(this.p1, (Property<jd8, Float>) property12, 1.0f, 0.0f));
                            }
                            if (this.f1.getTag() != null) {
                                arrayList8.add(ObjectAnimator.ofFloat(this.f1, (Property<d7, Float>) property12, 1.0f, 0.0f));
                            }
                            if (this.g1.getTag() != null) {
                                arrayList8.add(ObjectAnimator.ofFloat(this.g1, (Property<s96, Float>) property12, 1.0f, 0.0f));
                            }
                            if (this.h1.getTag() != null) {
                                arrayList8.add(ObjectAnimator.ofFloat(this.h1, (Property<nb8, Float>) property12, 1.0f, 0.0f));
                            }
                            this.p5.setVisibility(0);
                            arrayList8.add(ObjectAnimator.ofFloat(this.p5, (Property<ld8, Float>) property12, 0.0f, 1.0f));
                            this.p6.playTogether(arrayList8);
                            this.p6.setDuration(200L);
                            this.p6.addListener(new fc8(this, i, (byte) 1));
                            this.p6.start();
                            p1();
                            this.p5.a(no6Var, this.G2, this.w2);
                        }
                    }
                }
                ad8 ad8Var = this.f0;
                if (ad8Var != null) {
                    ad8Var.X();
                }
            }
        }
    }

    @Override // qu4
    public final boolean onDown(MotionEvent motionEvent) {
        if (!this.N6 && this.O0.getVisibility() != 0) {
            boolean[] zArr = this.x1;
            if (!zArr[0] && !zArr[1]) {
                float x = motionEvent.getX();
                if (x < Math.min(135, this.f0.getMeasuredWidth() / 8)) {
                    if (this.A4.D()) {
                        zArr[0] = true;
                        this.f0.invalidate();
                        return false;
                    }
                } else if (x > this.f0.getMeasuredWidth() - r3 && this.C4.D()) {
                    zArr[1] = true;
                    this.f0.invalidate();
                }
            }
        }
        return false;
    }

    @Override // qu4
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.Z5 == 1.0f || this.d2 == 11) {
            return false;
        }
        this.U6.abortAnimation();
        this.U6.fling(Math.round(this.W5), Math.round(this.X5), Math.round(f), Math.round(f2), (int) this.D6, (int) this.E6, (int) this.F6, (int) this.G6);
        this.f0.postInvalidate();
        return false;
    }

    @Override // qu4
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
    @Override // qu4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        boolean z;
        if (!this.H6 && !this.r6) {
            return f1(motionEvent);
        }
        ad8 ad8Var = this.f0;
        if (ad8Var != null && ad8Var.getTag() != null && this.X0[0] != null) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (x >= (h0(this.t4) - hl.L(100.0f)) / 2.0f) {
                if (x <= (hl.L(100.0f) + h0(this.t4)) / 2.0f && y >= (f0() - hl.L(100.0f)) / 2.0f) {
                    if (y <= (hl.L(100.0f) + f0()) / 2.0f) {
                        z = f1(motionEvent);
                        if (z) {
                            this.R6 = true;
                            return true;
                        }
                    }
                }
            }
            z = false;
            if (z) {
            }
        }
        return false;
    }

    public final boolean p() {
        if (this.m4 != 0) {
            H0();
            if (Math.abs(this.n4 - System.currentTimeMillis()) >= 500) {
                Runnable runnable = this.o4;
                if (runnable != null) {
                    runnable.run();
                    this.o4 = null;
                }
                this.m4 = (byte) 0;
            }
        }
        return this.m4 != 0;
    }

    public final jn5 p0(int i, long[] jArr) {
        if (i >= 0) {
            ArrayList arrayList = this.d7;
            if (arrayList.isEmpty()) {
                ArrayList arrayList2 = this.Z6;
                if (arrayList2.isEmpty()) {
                    ArrayList arrayList3 = this.X6;
                    if (!arrayList3.isEmpty() && i < arrayList3.size()) {
                        r47 r47Var = (r47) arrayList3.get(i);
                        TLRPC.Message message = r47Var.k;
                        if (!(message instanceof TLRPC.TL_messageService)) {
                            TLRPC.MessageMedia messageMedia = r47Var.a1;
                            if (messageMedia != null) {
                                TLRPC.Document document = messageMedia.document;
                                if (document != null) {
                                    return jn5.b(document);
                                }
                                TLRPC.Photo photo = messageMedia.photo;
                                if (photo != null) {
                                    TLRPC.PhotoSize w = xb4.w(photo.sizes, hl.Y0(false), false, null, true);
                                    if (w != null) {
                                        if (jArr != null) {
                                            long j = w.size;
                                            jArr[0] = j;
                                            if (j == 0) {
                                                jArr[0] = -1;
                                            }
                                        }
                                        return jn5.f(w, r47Var.a1.photo);
                                    }
                                    if (jArr != null) {
                                        jArr[0] = -1;
                                        return null;
                                    }
                                }
                            } else if ((!(r47.n1(message) instanceof TLRPC.TL_messageMediaPhoto) || r47.n1(r47Var.k).photo == null) && (!(r47.n1(r47Var.k) instanceof TLRPC.TL_messageMediaWebPage) || r47.n1(r47Var.k).webpage == null)) {
                                if (r47.n1(r47Var.k) instanceof TLRPC.TL_messageMediaInvoice) {
                                    return jn5.p(jxc.c(((TLRPC.TL_messageMediaInvoice) r47.n1(r47Var.k)).webPhoto));
                                }
                                if (r47Var.F0() != null) {
                                    TLRPC.Document F0 = r47Var.F0();
                                    if (this.B5 == 5) {
                                        return jn5.b(F0);
                                    }
                                    if (r47.W2(r47Var.F0())) {
                                        TLRPC.PhotoSize w2 = xb4.w(F0.thumbs, 90, false, null, false);
                                        if (jArr != null) {
                                            long j2 = w2.size;
                                            jArr[0] = j2;
                                            if (j2 == 0) {
                                                jArr[0] = -1;
                                            }
                                        }
                                        return jn5.c(w2, F0);
                                    }
                                }
                            } else {
                                if (r47.t3(r47Var.k)) {
                                    return jn5.b(r47Var.F0());
                                }
                                TLRPC.PhotoSize w3 = xb4.w(r47Var.p0, hl.Y0(true), false, null, true);
                                if (w3 != null) {
                                    if (jArr != null) {
                                        long j3 = w3.size;
                                        jArr[0] = j3;
                                        if (j3 == 0) {
                                            jArr[0] = -1;
                                        }
                                    }
                                    return jn5.f(w3, r47Var.n0);
                                }
                                if (jArr != null) {
                                    jArr[0] = -1;
                                    return null;
                                }
                            }
                        } else if (!(message.action instanceof TLRPC.TL_messageActionUserUpdatedPhoto)) {
                            TLRPC.PhotoSize w4 = xb4.w(r47Var.p0, hl.Y0(false), false, null, false);
                            if (w4 != null) {
                                if (jArr != null) {
                                    long j4 = w4.size;
                                    jArr[0] = j4;
                                    if (j4 == 0) {
                                        jArr[0] = -1;
                                    }
                                }
                                return jn5.f(w4, r47Var.n0);
                            }
                            if (jArr != null) {
                                jArr[0] = -1;
                                return null;
                            }
                        }
                    }
                } else if (i < arrayList2.size()) {
                    if (jArr != null) {
                        ArrayList arrayList4 = this.b7;
                        if (arrayList4.get(i) != null) {
                            jArr[0] = ((Long) arrayList4.get(i)).longValue();
                        }
                    }
                    return (jn5) this.a7.get(i);
                }
            } else if (i < arrayList.size()) {
                if (jArr != null) {
                    jArr[0] = ((oy9) arrayList.get(i)).b.size;
                }
                oy9 oy9Var = (oy9) arrayList.get(i);
                if (oy9Var == null) {
                    return null;
                }
                jn5 jn5Var = new jn5();
                jn5Var.h = oy9Var;
                return jn5Var;
            }
        }
        return null;
    }

    public final void p1() {
        kfc kfcVar = this.G2;
        if (kfcVar != null) {
            kfcVar.f0();
            return;
        }
        nc8 nc8Var = this.g0;
        if (nc8Var != null) {
            nc8Var.e();
        }
    }

    public final void p2(int i, boolean z) {
        if (this.S4 != null) {
            w1(false);
            xb4.G(this.U).f(this.S4.F0());
        } else if (this.h5 != null) {
            TLObject d = this.i7.d(this.O4);
            if (d instanceof TLRPC.Document) {
                w1(false);
                xb4.G(this.U).f((TLRPC.Document) d);
            }
        }
        wd5 wd5Var = this.m1;
        if (wd5Var != null) {
            wd5Var.setAnimateBackground(true);
        }
        this.Y2 = false;
        L1(z, true, false, this.O4 + i);
        if (a2(this.S4) || Z1(this.O4)) {
            this.Y2 = true;
            Y0(true);
            v(0, true);
        }
        s();
        try {
            go.b(0);
            if (lh2.t().w()) {
                lh2.t().T(j0());
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public final void q(boolean z) {
        if (z) {
            ne8 ne8Var = this.w3;
            if (ne8Var != null) {
                ne8Var.getViewTreeObserver().addOnPreDrawListener(new gb(this, (byte) 9));
                this.w3.invalidate();
                return;
            }
            return;
        }
        if (this.G3 == 2) {
            ImageView imageView = this.x3;
            if (imageView != null && !this.X8) {
                imageView.setVisibility(4);
                this.x3.setImageDrawable(null);
                Bitmap bitmap = this.C3;
                if (bitmap != null) {
                    bitmap.recycle();
                    this.C3 = null;
                }
            }
            this.L3 = false;
            View view = this.E2 ? this.D2 : this.C2;
            dc8 dc8Var = this.z2;
            if (dc8Var != null) {
                int[] iArr = this.A3;
                dc8Var.getLocationInWindow(iArr);
                byte b = 1;
                iArr[1] = (int) (iArr[1] - this.f0.getTranslationY());
                ImageView imageView2 = this.x3;
                Rect rect = this.t2;
                if (imageView2 != null) {
                    imageView2.setTranslationX(imageView2.getTranslationX() + rect.left);
                }
                if (view != null) {
                    view.setTranslationX((view.getTranslationX() + rect.left) - this.z2.getX());
                }
                zc8 zc8Var = this.F2;
                if (zc8Var != null) {
                    zc8Var.setTranslationX(view.getTranslationX());
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new w98(this, (byte) 5));
                float x = this.E2 ? 0.0f : iArr[0] - this.z2.getX();
                float y = this.E2 ? 0.0f : iArr[1] - this.z2.getY();
                AnimatorSet animatorSet = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                arrayList.add(ofFloat);
                ImageView imageView3 = this.x3;
                Property property = View.SCALE_X;
                arrayList.add(ObjectAnimator.ofFloat(imageView3, (Property<ImageView, Float>) property, 1.0f));
                ImageView imageView4 = this.x3;
                Property property2 = View.SCALE_Y;
                arrayList.add(ObjectAnimator.ofFloat(imageView4, (Property<ImageView, Float>) property2, 1.0f));
                ImageView imageView5 = this.x3;
                Property property3 = View.TRANSLATION_X;
                arrayList.add(ObjectAnimator.ofFloat(imageView5, (Property<ImageView, Float>) property3, this.E2 ? 0.0f : iArr[0]));
                ImageView imageView6 = this.x3;
                Property property4 = View.TRANSLATION_Y;
                arrayList.add(ObjectAnimator.ofFloat(imageView6, (Property<ImageView, Float>) property4, this.E2 ? 0.0f : iArr[1]));
                arrayList.add(ObjectAnimator.ofFloat(view, (Property<View, Float>) property, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(view, (Property<View, Float>) property3, x));
                arrayList.add(ObjectAnimator.ofFloat(view, (Property<View, Float>) property4, y));
                arrayList.add(ObjectAnimator.ofInt(this.M0, sn.d, jn7.d4));
                zc8 zc8Var2 = this.F2;
                if (zc8Var2 != null) {
                    arrayList.add(ObjectAnimator.ofFloat(zc8Var2, (Property<zc8, Float>) property, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(this.F2, (Property<zc8, Float>) property2, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(this.F2, (Property<zc8, Float>) property3, x));
                    arrayList.add(ObjectAnimator.ofFloat(this.F2, (Property<zc8, Float>) property4, y));
                }
                t0(false);
                view.getWidth();
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.addUpdateListener(new lk(this, view, (byte) 18));
                arrayList.add(ofFloat2);
                animatorSet.playTogether(arrayList);
                DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator();
                animatorSet.setInterpolator(decelerateInterpolator);
                animatorSet.setDuration(250L);
                SurfaceView surfaceView = this.D2;
                if (surfaceView != null) {
                    surfaceView.setVisibility(0);
                }
                animatorSet.addListener(new vb8(this, view, b));
                animatorSet.start();
                rc8 rc8Var = new rc8();
                rc8Var.c = false;
                rc8Var.d = false;
                rc8Var.a = (short) 250;
                rc8Var.b = decelerateInterpolator;
                u2(true, true, rc8Var);
                this.G3 = (byte) 0;
            }
        }
    }

    public final void q1(boolean z) {
        b29 y;
        xc8 xc8Var = this.W4;
        ArrayList arrayList = xc8Var.e;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                mec mecVar = (mec) xc8Var.e.get(i);
                if (mecVar.a == 0 && (mecVar.b & 1) != 0) {
                    View view = mecVar.I;
                    if ((view instanceof de0) && (y = ((de0) view).getImageReceiver().y()) != null) {
                        if (z) {
                            y.start();
                        } else {
                            y.stop();
                        }
                    }
                }
            }
        }
    }

    public final void q2() {
        float f;
        int i;
        this.p6 = null;
        byte b = 8;
        this.Q0.setVisibility(8);
        this.T0.setVisibility(8);
        this.o0.setVisibility(8);
        this.f1.setVisibility(8);
        this.g1.setVisibility(8);
        this.h1.setVisibility(8);
        k88 k88Var = this.D1;
        if (k88Var != null) {
            k88Var.setVisibility(4);
        }
        this.p1.setVisibility(8);
        this.p1.setAlpha(0.0f);
        this.p1.setTranslationY(-hl.L(10.0f));
        this.P0.setRotationX(0.0f);
        this.p1.setEnabled(false);
        this.L = false;
        if (this.j2) {
            this.R1.setVisibility(4);
        }
        int i2 = this.d2;
        if (i2 == 0 || i2 == 4 || ((i2 == 2 || i2 == 5) && this.f7.size() > 1)) {
            this.O0.setVisibility(8);
            this.P0.setVisibility(8);
            D2();
        }
        f2(false, true);
        k2(false, true);
        Bitmap n = this.B4.n();
        float f2 = this.Z5;
        if (this.d2 == 11) {
            this.h6 = this.X5;
            this.g6 = this.W5;
            this.i6 = f2;
            this.j6 = this.a6;
            this.e6 = 0.0f;
        }
        byte b2 = 3;
        xc8 xc8Var = this.W4;
        if (n != null) {
            int q = this.B4.q();
            int o = this.B4.o();
            if (this.d2 == 1) {
                float L = hl.L(12.0f);
                this.c6 = L;
                f = 0.0f;
                if (this.M1 != null) {
                    this.c6 = (r4.getAdditionalTop() / 2.0f) + L;
                }
                int i3 = this.E1.i;
                if (i3 == 90 || i3 == 270) {
                    i = q;
                    q = o;
                    float f3 = q;
                    float f4 = i;
                    this.d6 = z1(false) * (Math.min(h0(3) / f3, e0(3, false) / f4) / Math.min(h0(this.t4) / f3, f0() / f4));
                    Rect rect = this.t2;
                    this.b6 = (rect.left / 2) - (rect.right / 2);
                    this.m6 = System.currentTimeMillis();
                    this.Q6 = true;
                }
                i = o;
                float f32 = q;
                float f42 = i;
                this.d6 = z1(false) * (Math.min(h0(3) / f32, e0(3, false) / f42) / Math.min(h0(this.t4) / f32, f0() / f42));
                Rect rect2 = this.t2;
                this.b6 = (rect2.left / 2) - (rect2.right / 2);
                this.m6 = System.currentTimeMillis();
                this.Q6 = true;
            } else {
                f = 0.0f;
                float f5 = (-hl.L(44.0f)) + (!this.s ? hl.m / 2 : 0);
                this.c6 = f5;
                if (this.M1 != null) {
                    float additionalTop = (r13.getAdditionalTop() / 2.0f) + f5;
                    this.c6 = additionalTop;
                    this.c6 = additionalTop - (this.M1.getAdditionalBottom() / 2.0f);
                }
                fo6 fo6Var = xc8Var.c;
                if (fo6Var != null) {
                    int i4 = fo6Var.k;
                    if (i4 == 90 || i4 == 270) {
                        o = q;
                        q = o;
                    }
                    q = (int) (q * fo6Var.e);
                    i = (int) (o * fo6Var.f);
                    float f322 = q;
                    float f422 = i;
                    this.d6 = z1(false) * (Math.min(h0(3) / f322, e0(3, false) / f422) / Math.min(h0(this.t4) / f322, f0() / f422));
                    Rect rect22 = this.t2;
                    this.b6 = (rect22.left / 2) - (rect22.right / 2);
                    this.m6 = System.currentTimeMillis();
                    this.Q6 = true;
                }
                i = o;
                float f3222 = q;
                float f4222 = i;
                this.d6 = z1(false) * (Math.min(h0(3) / f3222, e0(3, false) / f4222) / Math.min(h0(this.t4) / f3222, f0() / f4222));
                Rect rect222 = this.t2;
                this.b6 = (rect222.left / 2) - (rect222.right / 2);
                this.m6 = System.currentTimeMillis();
                this.Q6 = true;
            }
        } else {
            f = 0.0f;
        }
        hc8 hc8Var = this.M1;
        if (hc8Var != null) {
            hc8Var.setDrawShadow(this.d2 == 11 && (xc8Var == null || xc8Var.c == null));
        }
        this.h0.setClipChildren(true);
        this.k0.setVisibility(4);
        this.o6 = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(hl.L(126.0f), f);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(-hl.L(12.0f), f);
        ofFloat.addUpdateListener(new w98(this, (byte) 7));
        ofFloat2.addUpdateListener(new w98(this, b));
        this.o6.playTogether(ObjectAnimator.ofFloat(this, sn.g, 0.0f, 1.0f), ofFloat, ofFloat2);
        this.M1.o0(true);
        this.o6.setDuration(200L);
        this.o6.addListener(new wb8(this, b2));
        this.o6.start();
    }

    public final void r() {
        fd8 fd8Var = this.c5;
        if (fd8Var != null) {
            fd8Var.a.v0(true, true);
        }
        ed8 ed8Var = this.d;
        fd8 fd8Var2 = null;
        if (ed8Var != null) {
            r47 r47Var = this.S4;
            jn5 jn5Var = this.Y4;
            fd8Var2 = ed8Var.M(r47Var, jn5Var != null ? jn5Var.f : null, this.O4, false, false);
        }
        this.c5 = fd8Var2;
        if (fd8Var2 == null || fd8Var2.s) {
            return;
        }
        fd8Var2.a.v0(false, true);
    }

    public final int r0() {
        return this.t2.left;
    }

    public final void r1() {
        kfc kfcVar = this.G2;
        if (kfcVar != null) {
            kfcVar.g0();
            return;
        }
        nc8 nc8Var = this.g0;
        if (nc8Var != null) {
            nc8Var.f();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0226  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r2() {
        float translationX;
        float translationY;
        float translationY2;
        AnimatorSet animatorSet;
        char c;
        ra8 ra8Var;
        char c2;
        boolean z;
        zu1 zu1Var;
        if (this.G2 == null || !this.H3 || this.F3 || this.L3 || this.J3) {
            return;
        }
        if (k9 != null) {
            k9.L();
        }
        byte b = 0;
        this.m2 = false;
        k9 = j9;
        j9 = null;
        this.L3 = true;
        this.e = false;
        this.f = false;
        hl.r(this.y2);
        fd8 fd8Var = this.c5;
        byte b2 = 6;
        if (fd8Var != null) {
            ImageReceiver imageReceiver = fd8Var.a;
            if (!imageReceiver.R0) {
                imageReceiver.v0(true, true);
                lm m = this.c5.a.m();
                if (m != null) {
                    Bitmap m2 = m.m();
                    if (m2 != null) {
                        try {
                            if (this.E2) {
                                Bitmap createBitmap = Bitmap.createBitmap(m2);
                                hl.z0(this.D2, createBitmap, new h68(m, createBitmap, b2));
                            } else {
                                Bitmap bitmap = this.C2.getBitmap(m2.getWidth(), m2.getHeight());
                                new Canvas(m2).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                                bitmap.recycle();
                            }
                        } catch (Throwable th) {
                            cc4.g(th, true);
                        }
                    }
                    m.y(this.G2.S(), true, false);
                    ImageReceiver imageReceiver2 = this.c5.a;
                    imageReceiver2.u0 = true;
                    imageReceiver2.w0(false);
                }
            }
        }
        this.B3 = true;
        a69 t0 = t0(true);
        View view = this.E2 ? this.D2 : this.C2;
        float width = t0.c / view.getWidth();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        if (this.E2) {
            translationX = view.getTranslationX() + this.z2.getLeft();
            translationY = view.getTranslationY() + this.z2.getTop() + this.X5;
            translationY2 = this.x3.getTranslationY() + this.z2.getTop() + this.X5;
        } else {
            translationX = view.getTranslationX();
            translationY = this.X5 + view.getTranslationY();
            translationY2 = this.X5 + this.x3.getTranslationY();
        }
        final float f = translationX;
        final float f2 = translationY2;
        final float f3 = t0.a;
        final float x = (f3 - this.z2.getX()) + this.t2.left;
        final float f4 = t0.b;
        final float y = f4 - this.z2.getY();
        ub8 ub8Var = new ub8(ofFloat, width, b);
        AnimatorSet animatorSet2 = new AnimatorSet();
        ra8 ra8Var2 = new ra8(this, view, ub8Var, f2, translationY, animatorSet2);
        final float f5 = translationY;
        final View view2 = view;
        if (this.D2 != null) {
            this.G2.d.V(false);
            if (this.E2) {
                int width2 = this.D2.getWidth();
                int height = this.D2.getHeight();
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                Bitmap a = lc1.a(width2, height);
                boolean[] zArr = new boolean[1];
                c2 = 6;
                SurfaceView surfaceView = this.D2;
                animatorSet = animatorSet2;
                c = 4;
                oy6 oy6Var = new oy6(this, a, zArr, ra8Var2, (byte) 21);
                ra8Var = ra8Var2;
                hl.z0(surfaceView, a, oy6Var);
                hl.d3(new sa8(this, zArr, ra8Var, b), 600L);
                z = true;
                ra8 ra8Var3 = ra8Var;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ta8
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        Drawable[] drawableArr = PhotoViewer.d9;
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        PhotoViewer photoViewer = PhotoViewer.this;
                        ImageView imageView = photoViewer.x3;
                        float f6 = f;
                        if (imageView != null) {
                            float f7 = 1.0f - floatValue;
                            imageView.setTranslationX((f3 * floatValue) + (f6 * f7));
                            photoViewer.x3.setTranslationY((f4 * floatValue) + (f2 * f7));
                            photoViewer.x3.invalidateOutline();
                        }
                        float f8 = 1.0f - floatValue;
                        float f10 = (x * floatValue) + (f6 * f8);
                        View view3 = view2;
                        view3.setTranslationX(f10);
                        view3.setTranslationY((y * floatValue) + (f5 * f8));
                        view3.invalidateOutline();
                        zc8 zc8Var = photoViewer.F2;
                        if (zc8Var != null) {
                            zc8Var.setTranslationX(view3.getTranslationX());
                            photoViewer.F2.setTranslationY(view3.getTranslationY());
                            photoViewer.F2.setScaleX(view3.getScaleX());
                            photoViewer.F2.setScaleY(view3.getScaleY());
                            photoViewer.F2.invalidateOutline();
                        }
                    }
                });
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.addUpdateListener(new w98(this, (byte) 14));
                ImageView imageView = this.x3;
                Property property = View.SCALE_X;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, width);
                ImageView imageView2 = this.x3;
                Property property2 = View.SCALE_Y;
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property2, width);
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, width);
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) property2, width);
                ObjectAnimator ofInt = ObjectAnimator.ofInt(this.M0, sn.d, 0);
                Animator[] animatorArr = new Animator[7];
                animatorArr[0] = ofFloat2;
                animatorArr[1] = ofFloat3;
                animatorArr[2] = ofFloat4;
                animatorArr[3] = ofFloat5;
                animatorArr[c] = ofFloat6;
                animatorArr[5] = ofInt;
                animatorArr[c2] = ofFloat;
                AnimatorSet animatorSet3 = animatorSet;
                animatorSet3.playTogether(animatorArr);
                animatorSet3.setInterpolator(new DecelerateInterpolator());
                animatorSet3.setDuration(250L);
                animatorSet3.addListener(new vb8(this, view2, b));
                if (!z) {
                    ra8Var3.run();
                }
                rc8 rc8Var = new rc8();
                rc8Var.c = false;
                rc8Var.d = false;
                rc8Var.a = (short) 250;
                rc8Var.b = new DecelerateInterpolator();
                u2(false, true, rc8Var);
                zu1Var = this.k4;
                if (zu1Var != null || zu1Var.getFragmentView() == null) {
                }
                this.k4.getFragmentView().invalidate();
                return;
            }
            animatorSet = animatorSet2;
            c = 4;
            ra8Var = ra8Var2;
            c2 = 6;
            this.x3.setVisibility(0);
            this.D2.setVisibility(4);
        } else {
            animatorSet = animatorSet2;
            c = 4;
            ra8Var = ra8Var2;
            c2 = 6;
        }
        z = false;
        ra8 ra8Var32 = ra8Var;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ta8
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                Drawable[] drawableArr = PhotoViewer.d9;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                PhotoViewer photoViewer = PhotoViewer.this;
                ImageView imageView3 = photoViewer.x3;
                float f6 = f;
                if (imageView3 != null) {
                    float f7 = 1.0f - floatValue;
                    imageView3.setTranslationX((f3 * floatValue) + (f6 * f7));
                    photoViewer.x3.setTranslationY((f4 * floatValue) + (f2 * f7));
                    photoViewer.x3.invalidateOutline();
                }
                float f8 = 1.0f - floatValue;
                float f10 = (x * floatValue) + (f6 * f8);
                View view3 = view2;
                view3.setTranslationX(f10);
                view3.setTranslationY((y * floatValue) + (f5 * f8));
                view3.invalidateOutline();
                zc8 zc8Var = photoViewer.F2;
                if (zc8Var != null) {
                    zc8Var.setTranslationX(view3.getTranslationX());
                    photoViewer.F2.setTranslationY(view3.getTranslationY());
                    photoViewer.F2.setScaleX(view3.getScaleX());
                    photoViewer.F2.setScaleY(view3.getScaleY());
                    photoViewer.F2.invalidateOutline();
                }
            }
        });
        ValueAnimator ofFloat22 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat22.addUpdateListener(new w98(this, (byte) 14));
        ImageView imageView3 = this.x3;
        Property property3 = View.SCALE_X;
        ObjectAnimator ofFloat32 = ObjectAnimator.ofFloat(imageView3, (Property<ImageView, Float>) property3, width);
        ImageView imageView22 = this.x3;
        Property property22 = View.SCALE_Y;
        ObjectAnimator ofFloat42 = ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property22, width);
        ObjectAnimator ofFloat52 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) property3, width);
        ObjectAnimator ofFloat62 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) property22, width);
        ObjectAnimator ofInt2 = ObjectAnimator.ofInt(this.M0, sn.d, 0);
        Animator[] animatorArr2 = new Animator[7];
        animatorArr2[0] = ofFloat22;
        animatorArr2[1] = ofFloat32;
        animatorArr2[2] = ofFloat42;
        animatorArr2[3] = ofFloat52;
        animatorArr2[c] = ofFloat62;
        animatorArr2[5] = ofInt2;
        animatorArr2[c2] = ofFloat;
        AnimatorSet animatorSet32 = animatorSet;
        animatorSet32.playTogether(animatorArr2);
        animatorSet32.setInterpolator(new DecelerateInterpolator());
        animatorSet32.setDuration(250L);
        animatorSet32.addListener(new vb8(this, view2, b));
        if (!z) {
        }
        rc8 rc8Var2 = new rc8();
        rc8Var2.c = false;
        rc8Var2.d = false;
        rc8Var2.a = (short) 250;
        rc8Var2.b = new DecelerateInterpolator();
        u2(false, true, rc8Var2);
        zu1Var = this.k4;
        if (zu1Var != null) {
        }
    }

    public final void s() {
        r47 r47Var;
        TextureView textureView;
        TextureView textureView2;
        r47 r47Var2;
        ArrayList arrayList = this.X6;
        boolean isEmpty = arrayList.isEmpty();
        ImageView[] imageViewArr = this.y3;
        if (isEmpty || ((r47Var = this.S4) != null && r47Var.q4())) {
            for (int i = 0; i < 3; i++) {
                imageViewArr[i].setVisibility(4);
            }
            return;
        }
        int i2 = 0;
        while (i2 < 3) {
            int i3 = this.O4;
            if (i2 == 1) {
                i3++;
            } else if (i2 == 2) {
                i3--;
            }
            if (i3 < 0 || i3 >= arrayList.size()) {
                imageViewArr[i2].setVisibility(4);
            } else {
                r47 r47Var3 = (r47) arrayList.get(i3);
                if (r47.K4(r47Var3.k) || r47Var3.d5()) {
                    boolean z = r47Var3.d5() && (r47Var2 = this.S4) != null && r47Var2.e1() == r47Var3.e1();
                    int measuredWidth = z ? r47Var3.k.media.webpage.embed_width : (i2 != 0 || (textureView = this.C2) == null) ? 0 : textureView.getMeasuredWidth();
                    int measuredHeight = z ? r47Var3.k.media.webpage.embed_height : (i2 != 0 || (textureView2 = this.C2) == null) ? 0 : textureView2.getMeasuredHeight();
                    TLRPC.Document F0 = r47Var3.F0();
                    if (F0 != null) {
                        int size = F0.attributes.size();
                        int i4 = 0;
                        while (true) {
                            if (i4 >= size) {
                                break;
                            }
                            TLRPC.DocumentAttribute documentAttribute = F0.attributes.get(i4);
                            if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                                measuredWidth = documentAttribute.w;
                                measuredHeight = documentAttribute.h;
                                break;
                            }
                            i4++;
                        }
                    }
                    Point point = hl.q;
                    if (point.y > point.x && measuredWidth > measuredHeight) {
                        if (imageViewArr[i2].getVisibility() != 0) {
                            imageViewArr[i2].setVisibility(0);
                        }
                        if (this.K) {
                            imageViewArr[i2].setAlpha(1.0f);
                        }
                        ((FrameLayout.LayoutParams) imageViewArr[i2].getLayoutParams()).topMargin = ((this.f0.getMeasuredHeight() + ((int) (measuredHeight / (measuredWidth / this.f0.getMeasuredWidth())))) / 2) - hl.L(48.0f);
                    } else if (imageViewArr[i2].getVisibility() != 4) {
                        imageViewArr[i2].setVisibility(4);
                    }
                    AnimatorSet animatorSet = this.o6;
                    float f = this.W5;
                    if (animatorSet != null) {
                        f += (this.b6 - f) * this.k6;
                    }
                    float f2 = 0.0f;
                    if (i2 != 1) {
                        if (i2 == 2) {
                            f2 = (f - this.E6) + ((-point.x) - hl.L(15.0f));
                        } else {
                            float f3 = this.D6;
                            if (f < f3) {
                                f2 = f - f3;
                            }
                        }
                    }
                    imageViewArr[i2].setTranslationX((f2 + point.x) - hl.L(48.0f));
                } else {
                    imageViewArr[i2].setVisibility(4);
                }
            }
            i2++;
        }
    }

    public final TLRPC.Document s0() {
        int i;
        if (this.W5 != 0.0f || this.X5 != 0.0f || (i = this.O4) < 0) {
            return null;
        }
        ArrayList arrayList = this.f7;
        if (i >= arrayList.size()) {
            return null;
        }
        Object obj = arrayList.get(this.O4);
        if (!(obj instanceof go6)) {
            return null;
        }
        go6 go6Var = (go6) obj;
        if (go6Var.v || go6Var.w || go6Var.u) {
            return null;
        }
        return this.z7;
    }

    public final void s2() {
        AtomicInteger atomicInteger;
        j07 e;
        j07 e2;
        j07 e3;
        if (V0()) {
            this.T8 = true;
            kfc kfcVar = this.G2;
            if (kfcVar != null) {
                kfcVar.s0(go.w() || this.r);
            }
            if (this.G2 != null && go.w() && ((atomicInteger = go.b) == null || atomicInteger.get() <= 0)) {
                v99 e4 = go.e();
                long a = e4 == null ? -1L : e4.a();
                if (a >= 0 && Math.abs(this.G2.S() - a) > 1000) {
                    this.G2.o0(a);
                }
                v99 e5 = go.e();
                boolean m = e5 == null ? false : !go.a ? !e5.l() : e5.m();
                kfc kfcVar2 = this.G2;
                if (m) {
                    kfcVar2.g0();
                } else {
                    kfcVar2.f0();
                }
                if (this.F != null) {
                    float g = go.g();
                    v99 e6 = go.e();
                    float f = 0.5f;
                    if (Math.abs(g - ((e6 == null || (e3 = e6.e()) == null) ? 0.5f : (float) e3.r)) > 0.05f) {
                        AudioManager audioManager = (AudioManager) this.F.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
                        int streamMinVolume = Build.VERSION.SDK_INT >= 28 ? audioManager.getStreamMinVolume(3) : 0;
                        float f2 = streamMaxVolume - streamMinVolume;
                        v99 e7 = go.e();
                        if (e7 != null && (e2 = e7.e()) != null) {
                            f = (float) e2.r;
                        }
                        int i = streamMinVolume + ((int) (f * f2));
                        if (i != audioManager.getStreamVolume(3)) {
                            audioManager.setStreamVolume(3, i, 1);
                        }
                    }
                }
                v99 e8 = go.e();
                float f3 = 1.0f;
                if (e8 != null && (e = e8.e()) != null) {
                    f3 = (float) e.d;
                }
                x(true, false, f3);
            }
            eh2 eh2Var = this.x0;
            if (eh2Var != null) {
                eh2Var.a(go.w());
            }
            this.T8 = false;
        }
    }

    public void setAnimationValue(float f) {
        this.k6 = f;
        this.f0.invalidate();
        H0();
    }

    @Override // s84
    public final void t(int i, float f, float f2, t84 t84Var) {
        if (i == 0) {
            float f3 = 1.0f - f;
            this.U0.setTranslationY(hl.L(36.0f) * f3);
            this.U0.setAlpha(f);
            this.U0.setVisibility(f > 0.0f ? 0 : 8);
            if (this.g2) {
                this.Q0.setVisibility(f < 1.0f ? 0 : 8);
                this.Q0.setAlpha(f3);
                this.Q0.setTranslationY(hl.L(36.0f) * f);
                this.T0.setVisibility(f < 1.0f ? 0 : 8);
                this.T0.setAlpha(f3);
                this.T0.setTranslationY(hl.L(36.0f) * f);
            }
        }
    }

    public final a69 t0(boolean z) {
        me8 me8Var;
        xl4 xl4Var;
        RectF rectF = new RectF();
        if (z || (me8Var = this.U8) == null || (xl4Var = me8Var.e) == null) {
            hb8 hb8Var = this.c9;
            xl4.k(rectF, hb8Var.U(), hb8Var.q0());
        } else {
            xl4Var.g(rectF);
        }
        a69 a69Var = new a69();
        a69Var.a = rectF.left;
        a69Var.b = rectF.top;
        a69Var.c = rectF.width();
        a69Var.d = rectF.height();
        return a69Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t1(ArrayList arrayList, Uri uri, boolean z, boolean z2, po6 po6Var, boolean z3, long j) {
        boolean z4;
        float f;
        Boolean bool;
        bd8 bd8Var;
        boolean z5;
        r47 r47Var;
        TLRPC.BotInlineResult botInlineResult;
        bd8 bd8Var2;
        r47 r47Var2;
        hfc hfcVar;
        boolean z6;
        if (!z2) {
            this.V4 = uri;
            this.U4 = arrayList;
        }
        if (this.E == null) {
            return;
        }
        boolean z7 = false;
        z7 = false;
        this.f3 = false;
        this.g3 = SystemClock.elapsedRealtime();
        this.g5 = false;
        this.S3 = 0L;
        byte b = 1;
        this.R3 = true;
        this.G8 = z2;
        w1(false);
        if (this.f7.isEmpty()) {
            I(null);
        }
        float f2 = 0.0f;
        if (this.x3 == null) {
            ImageView imageView = new ImageView(this.E);
            this.x3 = imageView;
            imageView.setBackgroundColor(-65536);
            this.x3.setPivotX(0.0f);
            this.x3.setPivotY(0.0f);
            this.x3.setVisibility(4);
            this.f0.addView(this.x3);
        }
        s();
        if (this.W3 == null) {
            cv3 cv3Var = new cv3(b, org.telegram.messenger.a.b, this);
            this.W3 = cv3Var;
            boolean canDetectOrientation = cv3Var.canDetectOrientation();
            cv3 cv3Var2 = this.W3;
            if (canDetectOrientation) {
                cv3Var2.enable();
            } else {
                cv3Var2.disable();
                this.W3 = null;
            }
        }
        this.H3 = false;
        this.I3 = false;
        this.M3 = false;
        this.W2 = false;
        this.X2 = false;
        this.b8 = -1L;
        this.a8 = -1L;
        this.c8 = -1L;
        this.S = false;
        me8 me8Var = this.U8;
        if (me8Var != null && me8Var.c == 0) {
            this.U8 = null;
            me8Var.h();
        }
        if (this.G2 == null) {
            kfc kfcVar = this.S2;
            if (kfcVar != null) {
                this.G2 = kfcVar;
                this.S2 = null;
                this.U2 = true;
                M2(this.G2.d.h(), kfcVar.d.s());
                z6 = false;
            } else {
                ac8 ac8Var = new ac8(this, z7 ? (byte) 1 : (byte) 0);
                this.G2 = ac8Var;
                ac8Var.i0 = new y98(this, z7 ? (byte) 1 : (byte) 0);
                z6 = true;
            }
            TextureView textureView = this.C2;
            if (textureView != null) {
                this.G2.z0(textureView);
            } else {
                SurfaceView surfaceView = this.D2;
                if (surfaceView != null) {
                    this.G2.y0(surfaceView);
                }
            }
            zc8 zc8Var = this.F2;
            if (zc8Var != null) {
                zc8Var.c = false;
                zc8Var.d = false;
                if (zc8Var.b) {
                    zc8Var.a++;
                    zc8Var.b = false;
                }
                zc8Var.setImageResource(android.R.color.transparent);
            }
            this.G2.K = new n31((Object) this, (byte) 9);
            z4 = z6;
        } else {
            z4 = false;
        }
        if (!this.f7.isEmpty()) {
            I(po6Var);
        }
        this.N3 = 0.0f;
        TextureView textureView2 = this.C2;
        if (textureView2 != null) {
            textureView2.setAlpha(0.0f);
        }
        SurfaceView surfaceView2 = this.D2;
        if (surfaceView2 != null) {
            surfaceView2.setVisibility(4);
        }
        qx7 qx7Var = this.x4;
        if (qx7Var != null) {
            qx7Var.setAlpha(this.N3);
        }
        this.b3 = null;
        this.c3 = null;
        this.d3 = 0L;
        if (z4) {
            this.a3 = this.e3;
            this.q3.h(false, 0.0f);
            mb8 mb8Var = this.X7;
            mb8Var.setProgress(mb8Var.getLeftProgress());
            this.q3.f(0.0f);
            r47 r47Var3 = this.S4;
            if (r47Var3 != null) {
                int L0 = (int) r47Var3.L0();
                String V0 = this.S4.V0();
                if (!TextUtils.isEmpty(V0)) {
                    if (L0 >= 10) {
                        hd8 hd8Var = (hd8) f9.get(V0);
                        r47 r47Var4 = this.S4;
                        if (r47Var4.c0 < 0.0f && hd8Var != null) {
                            float f3 = hd8Var.a;
                            if (f3 > 0.0f && f3 < 0.999f) {
                                r47Var4.c0 = f3;
                                this.q3.h(false, f3);
                            }
                        }
                        this.c3 = V0;
                    }
                    if (L0 >= 300) {
                        if (this.S4.c0 < 0.0f) {
                            float f4 = org.telegram.messenger.a.b.getSharedPreferences("media_saved_pos", 0).getFloat(V0, -1.0f);
                            if (f4 > 0.0f && f4 < 0.999f) {
                                this.S4.c0 = f4;
                                this.q3.h(false, f4);
                            }
                        }
                        this.b3 = V0;
                    }
                }
            }
            kfc kfcVar2 = this.G2;
            if (arrayList != null) {
                r47 r47Var5 = this.S4;
                int i = kfc.k0;
                if (r47Var5 != null) {
                    long B0 = r47.B0(r47Var5.k);
                    int e1 = r47Var5.e1();
                    String string = org.telegram.messenger.a.b.getSharedPreferences("media_saved_pos", 0).getString(B0 + "_" + e1 + "q2", "");
                    if (!TextUtils.isEmpty(string)) {
                        int size = arrayList.size();
                        int i2 = 0;
                        while (i2 < size) {
                            Object obj = arrayList.get(i2);
                            i2++;
                            hfcVar = (hfc) obj;
                            StringBuilder sb = new StringBuilder();
                            f = f2;
                            sb.append(hfcVar.b);
                            sb.append("x");
                            sb.append(hfcVar.c);
                            sb.append(hfcVar.a ? "s" : "");
                            if (TextUtils.equals(string, sb.toString())) {
                                break;
                            } else {
                                f2 = f;
                            }
                        }
                    }
                }
                f = f2;
                hfcVar = null;
                kfcVar2.j0(arrayList, hfcVar);
            } else {
                f = 0.0f;
                kfcVar2.h0(j, uri, "other");
            }
            L2();
            s64 s64Var = this.G2.d;
            if (s64Var != null) {
                cc8 cc8Var = new cc8(this);
                s64Var.y1();
                mg8 U0 = s64Var.U0(s64Var.x);
                yve.p(!U0.f);
                U0.c = (byte) 7;
                yve.p(!U0.f);
                U0.d = cc8Var;
                U0.b();
            }
            N2();
            this.G2.t0(z);
            if (!this.s4) {
                V();
            }
        } else {
            f = 0.0f;
        }
        r47 r47Var6 = this.S4;
        int i3 = kfc.k0;
        if (r47Var6 != null) {
            SharedPreferences sharedPreferences = org.telegram.messenger.a.b.getSharedPreferences("media_saved_pos", 0);
            String str = r47.B0(r47Var6.k) + "_" + r47Var6.e1() + "loop";
            if (sharedPreferences.contains(str)) {
                bool = Boolean.valueOf(sharedPreferences.getBoolean(str, false));
                if (!z3) {
                    this.Z2 = false;
                    z5 = false;
                } else if (bool != null) {
                    z5 = bool.booleanValue();
                    this.Z2 = z5;
                } else {
                    r47 r47Var7 = this.S4;
                    z5 = (r47Var7 != null && r47Var7.L0() <= 30.0d) || ((bd8Var = this.i7) != null && bd8Var.e(this.O4));
                    this.Z2 = z5;
                }
                this.i3.c(z5);
                this.G2.r0(this.Z2);
                this.t0.f(this.Z2);
                this.t0.setSelectorColor(!this.Z2 ? 259241196 : 268435455);
                r47Var = this.S4;
                if (r47Var != null) {
                    float f5 = r47Var.c0;
                    if (f5 >= f) {
                        this.a3 = f5;
                        r47Var.c0 = -1.0f;
                    }
                }
                botInlineResult = this.X4;
                if (botInlineResult == null && (botInlineResult.type.equals(MediaStreamTrack.VIDEO_TRACK_KIND) || r47.J4(this.X4.document))) {
                    this.j0.setVisibility(0);
                    this.j0.setPadding(0, 0, hl.L(84.0f), 0);
                    this.Q0.setVisibility(8);
                } else {
                    this.j0.setPadding(0, 0, 0, 0);
                }
                if (this.i7 != null) {
                    this.j0.setVisibility(0);
                }
                bd8Var2 = this.i7;
                if (bd8Var2 == null && bd8Var2.e(this.O4) && !this.i7.a(this.O4)) {
                    Y1(false, true);
                } else {
                    if (!this.s1 && !z3) {
                        z7 = true;
                    }
                    Y1(z7, true);
                }
                if (!this.s1) {
                    int i4 = this.Y2 ? 3000 : 1000;
                    ob8 ob8Var = this.y2;
                    if (!J0() && ((r47Var2 = this.S4) == null || !r47Var2.q4())) {
                        hl.r(ob8Var);
                        hl.d3(ob8Var, i4);
                    }
                }
                if (this.S4 != null) {
                    this.G2.u0(this.u1);
                }
                this.G8 = z2;
            }
        }
        bool = null;
        if (!z3) {
        }
        this.i3.c(z5);
        this.G2.r0(this.Z2);
        this.t0.f(this.Z2);
        this.t0.setSelectorColor(!this.Z2 ? 259241196 : 268435455);
        r47Var = this.S4;
        if (r47Var != null) {
        }
        botInlineResult = this.X4;
        if (botInlineResult == null) {
        }
        this.j0.setPadding(0, 0, 0, 0);
        if (this.i7 != null) {
        }
        bd8Var2 = this.i7;
        if (bd8Var2 == null) {
        }
        if (!this.s1) {
            z7 = true;
        }
        Y1(z7, true);
        if (!this.s1) {
        }
        if (this.S4 != null) {
        }
        this.G8 = z2;
    }

    public final void t2(boolean z, boolean z2) {
        u2(z, z2, rc8.e);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0015, code lost:
    
        if (r2 > r3) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
    
        if (r2 > r3) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(boolean z) {
        float f = this.W5;
        float f2 = this.X5;
        I2(this.Z5);
        float f3 = this.W5;
        float f4 = this.D6;
        if (f3 >= f4) {
            f4 = this.E6;
        }
        f = f4;
        float f5 = this.X5;
        float f6 = this.F6;
        if (f5 >= f6) {
            f6 = this.G6;
        }
        f2 = f6;
        b(this.Z5, f, f2, z);
    }

    public final RenderNode u0(ColorMatrix colorMatrix) {
        RenderNode renderNode;
        if (this.P8 == null) {
            renderNode = null;
        } else {
            renderNode = this.Q8;
            if (renderNode == null) {
                vk1.p();
                renderNode = new RenderNode("pv_s_blur_false");
                float a = tq3.a(hl.L(40.0f), 6.0f);
                renderNode.setRenderEffect(RenderEffect.createBlurEffect(a, a, Shader.TileMode.CLAMP));
                this.Q8 = renderNode;
            }
            int ceil = (int) Math.ceil(this.P8.getWidth() / 6.0f);
            int ceil2 = (int) Math.ceil(this.P8.getHeight() / 6.0f);
            if ((!renderNode.hasDisplayList()) | renderNode.setPosition(0, 0, ceil, ceil2)) {
                RecordingCanvas beginRecording = renderNode.beginRecording();
                beginRecording.save();
                beginRecording.scale(ceil / this.P8.getWidth(), ceil2 / this.P8.getHeight());
                beginRecording.drawRenderNode(this.P8);
                beginRecording.restore();
                renderNode.endRecording();
            }
        }
        if (renderNode == null) {
            return null;
        }
        qeb qebVar = this.R8;
        qebVar.a = 0L;
        qebVar.b = false;
        for (float f : colorMatrix.getArray()) {
            qebVar.c(f);
        }
        qebVar.a(0L);
        long j = qebVar.b ? -1L : qebVar.a;
        RenderNode renderNode2 = (RenderNode) this.S8.f(j);
        if (renderNode2 == null) {
            vk1.p();
            RenderNode renderNode3 = new RenderNode("pv_mat_" + j + "_false");
            renderNode3.setRenderEffect(RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix)));
            renderNode2 = renderNode3;
        }
        if ((!renderNode2.hasDisplayList()) | renderNode2.setPosition(0, 0, renderNode.getWidth(), renderNode.getHeight())) {
            renderNode2.beginRecording().drawRenderNode(renderNode);
            renderNode2.endRecording();
        }
        return renderNode2;
    }

    public final void u1() {
        k3b k3bVar = this.o5;
        if (k3bVar == null || this.d2 != 11) {
            return;
        }
        if (this.A7) {
            k3bVar.b();
        } else {
            k3bVar.l(this.B4.n(), this.B4.V, h0(this.t4), f0(), new ea8(this, (byte) 0));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u2(boolean z, boolean z2, rc8 rc8Var) {
        float f;
        int i;
        cd8 cd8Var;
        ic8 ic8Var;
        float f2;
        boolean z3;
        int i2;
        b6 b6Var;
        cd8 cd8Var2;
        View view;
        boolean z4;
        Property property;
        boolean z5;
        ic8 ic8Var2;
        boolean z6;
        if (this.t4 == 0) {
            int i3 = this.n6;
            if (i3 == 0 || i3 == -1) {
                AnimatorSet animatorSet = this.M;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                if (z) {
                    this.G.setVisibility(0);
                    if (this.j0.getTag() != null) {
                        this.j0.setVisibility(0);
                    }
                    if (this.R1.getTag() != null) {
                        this.R1.setVisibility(0);
                        zb8 zb8Var = this.s3;
                        if (zb8Var != null) {
                            zb8Var.requestLayout();
                        }
                    }
                }
                this.K = z;
                nc8 nc8Var = this.g0;
                if (nc8Var != null) {
                    nc8Var.setTouchDisabled(z);
                }
                if (rc8Var.c) {
                    H2(z);
                }
                if (this.l3 && this.P3 && z) {
                    A1();
                } else {
                    hl.r(this.y2);
                }
                if (!z) {
                    v21.d(this.f0);
                }
                float N = hl.N(24.0f);
                this.i3.c(rc8Var.d && this.Z2);
                kd8 kd8Var = this.i3;
                boolean z7 = rc8Var.d;
                if (kd8Var.c != z7) {
                    kd8Var.c = z7;
                    if (!z7) {
                        kd8Var.setTranslationY(0.0f);
                    }
                    kd8Var.a(kd8Var.a);
                }
                lb8[] lb8VarArr = this.X0;
                ImageView[] imageViewArr = this.y3;
                if (!z2) {
                    y10 y10Var = this.G;
                    if (z) {
                        ub1 c0 = c0();
                        qb8 qb8Var = this.W1;
                        if (c0 != qb8Var || qb8Var.M.c()) {
                            f = 1.0f;
                            y10Var.setAlpha(f);
                            if (imageViewArr[0].getTranslationX() != 0.0f && this.z3) {
                                imageViewArr[0].setAlpha(!z ? 1.0f : 0.0f);
                            }
                            for (i = 0; i < 3; i++) {
                                imageViewArr[i].setTranslationY(z ? 0.0f : N);
                            }
                            this.G.setTranslationY(!z ? 0.0f : -N);
                            cd8Var = this.O;
                            if (cd8Var != null) {
                                cd8Var.setAlpha(z ? 1.0f : 0.0f);
                                this.O.setTranslationY(z ? 0.0f : -N);
                            }
                            this.j0.setAlpha(!z ? 1.0f : 0.0f);
                            this.j0.setTranslationY(!z ? 0.0f : N);
                            this.k0.setAlpha(!z ? 1.0f : 0.0f);
                            this.m1.setAlpha((z || this.G7 == 3) ? 0.0f : 1.0f);
                            this.m1.setTranslationY((z || this.G7 == 3) ? N : 0.0f);
                            if (!this.j2 && (ic8Var = this.U1) != null) {
                                ic8Var.setAlpha(!z ? 1.0f : 0.0f);
                                ic8 ic8Var3 = this.U1;
                                if (z) {
                                    N = 0.0f;
                                }
                                ic8Var3.setTranslationY(N);
                            }
                            this.i3.b(!z ? 1.0f : 0.0f);
                            if (this.f1.getTag() != null) {
                                this.f1.setAlpha(z ? 1.0f : 0.0f);
                            }
                            if (this.g1.getTag() != null) {
                                this.g1.setAlpha(z ? 1.0f : 0.0f);
                            }
                            if (this.l3 || !this.P3) {
                                return;
                            }
                            lb8VarArr[0].e(1, z ? 1.0f : 0.0f, false);
                            return;
                        }
                    }
                    f = 0.0f;
                    y10Var.setAlpha(f);
                    if (imageViewArr[0].getTranslationX() != 0.0f) {
                        imageViewArr[0].setAlpha(!z ? 1.0f : 0.0f);
                    }
                    while (i < 3) {
                    }
                    this.G.setTranslationY(!z ? 0.0f : -N);
                    cd8Var = this.O;
                    if (cd8Var != null) {
                    }
                    this.j0.setAlpha(!z ? 1.0f : 0.0f);
                    this.j0.setTranslationY(!z ? 0.0f : N);
                    this.k0.setAlpha(!z ? 1.0f : 0.0f);
                    this.m1.setAlpha((z || this.G7 == 3) ? 0.0f : 1.0f);
                    this.m1.setTranslationY((z || this.G7 == 3) ? N : 0.0f);
                    if (!this.j2) {
                        ic8Var.setAlpha(!z ? 1.0f : 0.0f);
                        ic8 ic8Var32 = this.U1;
                        if (z) {
                        }
                        ic8Var32.setTranslationY(N);
                    }
                    this.i3.b(!z ? 1.0f : 0.0f);
                    if (this.f1.getTag() != null) {
                    }
                    if (this.g1.getTag() != null) {
                    }
                    if (this.l3) {
                        return;
                    } else {
                        return;
                    }
                }
                ArrayList arrayList = new ArrayList();
                y10 y10Var2 = this.G;
                Property property2 = View.ALPHA;
                if (z) {
                    ub1 c02 = c0();
                    qb8 qb8Var2 = this.W1;
                    if (c02 != qb8Var2 || qb8Var2.M.c()) {
                        f2 = 1.0f;
                        arrayList.add(ObjectAnimator.ofFloat(y10Var2, (Property<y10, Float>) property2, f2));
                        z3 = rc8Var.d;
                        y10 y10Var3 = this.G;
                        if (z3) {
                            y10Var3.setTranslationY(0.0f);
                        } else {
                            arrayList.add(ObjectAnimator.ofFloat(y10Var3, (Property<y10, Float>) View.TRANSLATION_Y, z ? 0.0f : -N));
                        }
                        if (this.z3) {
                            arrayList.add(ObjectAnimator.ofFloat(imageViewArr[0], (Property<ImageView, Float>) property2, z ? 1.0f : 0.0f));
                        }
                        for (i2 = 1; i2 < 3; i2++) {
                            imageViewArr[i2].setTranslationY(z ? 0.0f : N);
                        }
                        if (rc8Var.d) {
                            imageViewArr[0].setTranslationY(0.0f);
                        } else {
                            arrayList.add(ObjectAnimator.ofFloat(imageViewArr[0], (Property<ImageView, Float>) View.TRANSLATION_Y, z ? 0.0f : N));
                        }
                        b6Var = this.j0;
                        if (b6Var != null) {
                            arrayList.add(ObjectAnimator.ofFloat(b6Var, (Property<b6, Float>) View.ALPHA, z ? 1.0f : 0.0f));
                            boolean z8 = rc8Var.d;
                            b6 b6Var2 = this.j0;
                            if (z8) {
                                arrayList.add(ObjectAnimator.ofFloat(b6Var2, (Property<b6, Float>) View.TRANSLATION_Y, z ? 0.0f : N));
                            } else {
                                b6Var2.setTranslationY(0.0f);
                            }
                        }
                        cd8Var2 = this.O;
                        if (cd8Var2 != null) {
                            arrayList.add(ObjectAnimator.ofFloat(cd8Var2, (Property<cd8, Float>) View.ALPHA, z ? 1.0f : 0.0f));
                            boolean z9 = rc8Var.d;
                            cd8 cd8Var3 = this.O;
                            if (z9) {
                                arrayList.add(ObjectAnimator.ofFloat(cd8Var3, (Property<cd8, Float>) View.TRANSLATION_Y, z ? 0.0f : -N));
                            } else {
                                cd8Var3.setTranslationY(0.0f);
                            }
                        }
                        view = this.k0;
                        if (view != null) {
                            arrayList.add(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, z ? 1.0f : 0.0f));
                        }
                        z4 = this.l3;
                        kd8 kd8Var2 = this.i3;
                        if (z4) {
                            kd8Var2.b(z ? 1.0f : 0.0f);
                        } else {
                            arrayList.add(ObjectAnimator.ofFloat(kd8Var2, (Property<kd8, Float>) i9, z ? 1.0f : 0.0f));
                        }
                        wd5 wd5Var = this.m1;
                        property = View.ALPHA;
                        arrayList.add(ObjectAnimator.ofFloat(wd5Var, (Property<wd5, Float>) property, !z ? 1.0f : 0.0f));
                        byte b = 2;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat.addUpdateListener(new pa8());
                        arrayList.add(ofFloat);
                        z5 = rc8Var.d;
                        wd5 wd5Var2 = this.m1;
                        if (z5) {
                            wd5Var2.setTranslationY(0.0f);
                        } else {
                            arrayList.add(ObjectAnimator.ofFloat(wd5Var2, (Property<wd5, Float>) View.TRANSLATION_Y, z ? 0.0f : N));
                        }
                        if (!this.j2 && (ic8Var2 = this.U1) != null) {
                            arrayList.add(ObjectAnimator.ofFloat(ic8Var2, (Property<ic8, Float>) property, !z ? 1.0f : 0.0f));
                            z6 = rc8Var.d;
                            ic8 ic8Var4 = this.U1;
                            if (z6) {
                                ic8Var4.setTranslationY(0.0f);
                            } else {
                                Property property3 = View.TRANSLATION_Y;
                                if (z) {
                                    N = 0.0f;
                                }
                                arrayList.add(ObjectAnimator.ofFloat(ic8Var4, (Property<ic8, Float>) property3, N));
                            }
                        }
                        if (this.l3 && this.P3) {
                            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(lb8VarArr[0].m[1], !z ? 1.0f : 0.0f);
                            ofFloat2.addUpdateListener(new w98(this, (byte) 13));
                            arrayList.add(ofFloat2);
                        }
                        if (this.f1.getTag() != null) {
                            arrayList.add(ObjectAnimator.ofFloat(this.f1, (Property<d7, Float>) property, z ? 1.0f : 0.0f));
                        }
                        if (this.g1.getTag() != null) {
                            arrayList.add(ObjectAnimator.ofFloat(this.g1, (Property<s96, Float>) property, z ? 1.0f : 0.0f));
                        }
                        if (this.h1.getTag() != null) {
                            arrayList.add(ObjectAnimator.ofFloat(this.h1, (Property<nb8, Float>) property, z ? 1.0f : 0.0f));
                        }
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        this.M = animatorSet2;
                        animatorSet2.playTogether(arrayList);
                        this.M.setDuration(rc8Var.a);
                        this.M.setInterpolator(rc8Var.b);
                        this.M.addListener(new ec8(this, z, b));
                        this.M.start();
                    }
                }
                f2 = 0.0f;
                arrayList.add(ObjectAnimator.ofFloat(y10Var2, (Property<y10, Float>) property2, f2));
                z3 = rc8Var.d;
                y10 y10Var32 = this.G;
                if (z3) {
                }
                if (this.z3) {
                }
                while (i2 < 3) {
                }
                if (rc8Var.d) {
                }
                b6Var = this.j0;
                if (b6Var != null) {
                }
                cd8Var2 = this.O;
                if (cd8Var2 != null) {
                }
                view = this.k0;
                if (view != null) {
                }
                z4 = this.l3;
                kd8 kd8Var22 = this.i3;
                if (z4) {
                }
                wd5 wd5Var3 = this.m1;
                property = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(wd5Var3, (Property<wd5, Float>) property, !z ? 1.0f : 0.0f));
                byte b2 = 2;
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat3.addUpdateListener(new pa8());
                arrayList.add(ofFloat3);
                z5 = rc8Var.d;
                wd5 wd5Var22 = this.m1;
                if (z5) {
                }
                if (!this.j2) {
                    arrayList.add(ObjectAnimator.ofFloat(ic8Var2, (Property<ic8, Float>) property, !z ? 1.0f : 0.0f));
                    z6 = rc8Var.d;
                    ic8 ic8Var42 = this.U1;
                    if (z6) {
                    }
                }
                if (this.l3) {
                    ValueAnimator ofFloat22 = ValueAnimator.ofFloat(lb8VarArr[0].m[1], !z ? 1.0f : 0.0f);
                    ofFloat22.addUpdateListener(new w98(this, (byte) 13));
                    arrayList.add(ofFloat22);
                }
                if (this.f1.getTag() != null) {
                }
                if (this.g1.getTag() != null) {
                }
                if (this.h1.getTag() != null) {
                }
                AnimatorSet animatorSet22 = new AnimatorSet();
                this.M = animatorSet22;
                animatorSet22.playTogether(arrayList);
                this.M.setDuration(rc8Var.a);
                this.M.setInterpolator(rc8Var.b);
                this.M.addListener(new ec8(this, z, b2));
                this.M.start();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v26, types: [r47] */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v32 */
    public final void v(final int i, final boolean z) {
        boolean z2;
        final boolean z3;
        final boolean z4;
        boolean z5;
        final File file;
        final m88 m88Var;
        final ?? r7;
        m88 m88Var2;
        File file2;
        File J;
        File J2;
        boolean z6;
        lm lmVar;
        int i2 = this.O4;
        byte b = 2;
        int i3 = i == 1 ? i2 + 1 : i == 2 ? i2 - 1 : i2;
        byte b2 = 3;
        if (this.b5[i] == null) {
            if (!this.f7.isEmpty() && i3 >= 0 && i3 < this.f7.size()) {
                Object obj = this.f7.get(i3);
                if (obj instanceof no6) {
                    no6 no6Var = (no6) obj;
                    if (no6Var.b && (!no6Var.d() || (!no6Var.j() && this.d2 != 11))) {
                        this.X0[i].d(3, z, true);
                        return;
                    }
                }
            }
            this.X0[i].d(-1, z, true);
            return;
        }
        boolean s = (i == 0 && i2 == 0 && (lmVar = this.k2) != null) ? lmVar.s() : false;
        File file3 = null;
        if (this.S4 == null) {
            if (this.X4 == null) {
                if (this.Y4 != null) {
                    if (i3 < 0 || i3 >= this.a7.size()) {
                        this.X0[i].d(-1, z, true);
                        return;
                    }
                    jn5 jn5Var = (jn5) this.a7.get(i3);
                    if (jn5Var != null) {
                        xb4.G(this.U);
                        J = xb4.J(jn5Var.f, n0(jn5Var), false, true);
                        xb4.G(this.U);
                        J2 = xb4.J(jn5Var.f, n0(jn5Var), true, true);
                    } else {
                        J2 = null;
                        J = null;
                    }
                } else if (this.a5 != null) {
                    if (i3 < 0 || i3 >= this.d7.size()) {
                        this.X0[i].d(-1, z, true);
                        return;
                    }
                    oy9 oy9Var = (oy9) this.d7.get(i3);
                    xb4.G(this.U);
                    J = xb4.J(oy9Var, null, true, true);
                    xb4.G(this.U);
                    J2 = xb4.J(oy9Var, null, false, true);
                } else if (this.d5 != null) {
                    file2 = new File(xb4.z(3), this.b5[i]);
                    file = new File(xb4.z(4), this.b5[i]);
                    z3 = false;
                    z4 = false;
                    z5 = false;
                } else {
                    bd8 bd8Var = this.i7;
                    if (bd8Var != null) {
                        File b3 = bd8Var.b(i3);
                        boolean z7 = this.i7.a(i3) || this.i7.e(i3);
                        z3 = z7 && xea.x0 && (this.i7.d(i3) instanceof TLRPC.Document);
                        z5 = Z1(i3);
                        z4 = z7;
                        file = null;
                        m88Var2 = null;
                        file3 = b3;
                        z2 = false;
                        m88Var = m88Var2;
                        r7 = m88Var2;
                    } else {
                        z2 = false;
                        z3 = false;
                        z4 = false;
                        z5 = false;
                        file = null;
                        m88Var = null;
                        r7 = 0;
                    }
                }
                z3 = false;
                z4 = false;
                z5 = false;
                r7 = 0;
                file3 = J;
                m88Var = null;
                file = J2;
                z2 = false;
            } else {
                if (i3 < 0 || i3 >= this.f7.size()) {
                    this.X0[i].d(-1, z, true);
                    return;
                }
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) this.f7.get(i3);
                if (botInlineResult.type.equals(MediaStreamTrack.VIDEO_TRACK_KIND) || r47.J4(botInlineResult.document)) {
                    if (botInlineResult.document != null) {
                        xb4.G(this.U);
                        file2 = xb4.I(botInlineResult.document);
                    } else if (botInlineResult.content instanceof TLRPC.TL_webDocument) {
                        file2 = new File(xb4.z(4), Utilities.a(botInlineResult.content.url) + "." + in5.x(botInlineResult.content.url, "mp4"));
                    } else {
                        file2 = null;
                    }
                    z6 = true;
                } else {
                    if (botInlineResult.document != null) {
                        file2 = new File(xb4.z(3), this.b5[i]);
                    } else if (botInlineResult.photo != null) {
                        file2 = new File(xb4.z(0), this.b5[i]);
                    } else {
                        z6 = false;
                        file2 = null;
                    }
                    z6 = false;
                }
                z4 = z6;
                z3 = false;
                z5 = false;
                file = new File(xb4.z(4), this.b5[i]);
            }
            m88Var2 = null;
            file3 = file2;
            z2 = z5;
            m88Var = m88Var2;
            r7 = m88Var2;
        } else {
            if (i3 < 0 || i3 >= this.X6.size()) {
                this.X0[i].d(-1, z, true);
                return;
            }
            r47 r47Var = (r47) this.X6.get(i3);
            z5 = a2(r47Var);
            if (this.B5 == 1 && !r47Var.x()) {
                this.X0[i].d(-1, z, true);
                return;
            }
            File file4 = !TextUtils.isEmpty(r47Var.k.attachPath) ? new File(r47Var.k.attachPath) : null;
            m88 m88Var3 = ((r47.n1(r47Var.k) instanceof TLRPC.TL_messageMediaWebPage) && r47.n1(r47Var.k).webpage != null && r47.n1(r47Var.k).webpage.document == null) ? new m88(this, m0(i3, null), b) : new m88(this, r47Var.k, b2);
            if (r47.K4(r47Var.k)) {
                file = null;
                file3 = file4;
                z3 = (xea.x0 && r47Var.B() && !wf3.B(r47.B0(r47Var.k))) || r47Var.D2(true);
                z2 = false;
                m88Var = m88Var3;
                r7 = r47Var;
                z4 = true;
            } else {
                z2 = false;
                file = null;
                m88Var = m88Var3;
                file3 = file4;
                r7 = r47Var;
                z3 = false;
                z4 = false;
            }
        }
        boolean z8 = ((i == 0 && this.k5) || !z5) ? z2 : true;
        final boolean z9 = s;
        final File file5 = file3;
        final boolean z10 = z8;
        Utilities.e.c(new Runnable() { // from class: aa8
            @Override // java.lang.Runnable
            public final void run() {
                r47 r47Var2;
                zu1 zu1Var;
                TLRPC.Document F0;
                Drawable[] drawableArr = PhotoViewer.d9;
                boolean z11 = z9;
                final File file6 = file5;
                if (!z11 && file6 != null) {
                    z11 = file6.exists();
                }
                File file7 = file;
                m88 m88Var4 = m88Var;
                File file8 = null;
                if (file7 == null && m88Var4 != null) {
                    file7 = m88Var4.e();
                } else if (m88Var4 != null) {
                    file8 = m88Var4.e();
                }
                final File file9 = file7;
                if (!z11 && file9 != null) {
                    z11 = file9.exists();
                }
                if (!z11 && file8 != null) {
                    z11 = file8.exists();
                }
                final boolean z12 = z11;
                final PhotoViewer photoViewer = PhotoViewer.this;
                final int i4 = i;
                final boolean z13 = z3;
                if (!z12 && i4 != 0 && (r47Var2 = r7) != null && z13 && lq3.q(photoViewer.U).b(r47Var2.k) != 0 && (((zu1Var = photoViewer.k4) == null || zu1Var.h == null) && !r47.Q5(r47Var2.k) && (F0 = r47Var2.F0()) != null)) {
                    xb4.G(photoViewer.U).X(F0, r47Var2, 0, 10);
                }
                final boolean z14 = z4;
                final boolean z15 = z10;
                final boolean z16 = z;
                hl.c3(new Runnable() { // from class: ia8
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean z17;
                        Drawable[] drawableArr2 = PhotoViewer.d9;
                        PhotoViewer photoViewer2 = PhotoViewer.this;
                        String[] strArr = photoViewer2.b5;
                        lb8[] lb8VarArr = photoViewer2.X0;
                        int i5 = i4;
                        File file10 = file6;
                        boolean z18 = z14;
                        boolean z19 = z16;
                        boolean z20 = true;
                        if (!(file10 == null && file9 == null) && ((z17 = z12) || z13)) {
                            if (i5 != 0 || !photoViewer2.P3) {
                                if (!z18 || (z15 && !(i5 == 0 && photoViewer2.X2))) {
                                    lb8VarArr[i5].d(-1, z19, true);
                                } else {
                                    lb8VarArr[i5].d(3, z19, true);
                                }
                            }
                            if (i5 == 0 && !photoViewer2.p0.y()) {
                                if (z17) {
                                    photoViewer2.p0.u(8);
                                } else {
                                    boolean S = xb4.G(photoViewer2.U).S(strArr[i5]);
                                    s7 s7Var = photoViewer2.p0;
                                    if (S) {
                                        s7Var.S(8);
                                    } else {
                                        s7Var.u(8);
                                    }
                                }
                            }
                        } else {
                            if (!z18) {
                                lb8VarArr[i5].d(0, z19, true);
                            } else if (xb4.G(photoViewer2.U).S(strArr[i5])) {
                                lb8VarArr[i5].d(1, false, true);
                            } else {
                                lb8VarArr[i5].d(2, false, true);
                            }
                            Float s2 = in5.z().s(strArr[i5]);
                            if (s2 == null) {
                                s2 = Float.valueOf(0.0f);
                            }
                            lb8VarArr[i5].f(false, s2.floatValue());
                        }
                        if (i5 == 0) {
                            if (photoViewer2.s4 || (photoViewer2.f7.isEmpty() && (strArr[0] == null || lb8VarArr[0].h == 0))) {
                                z20 = false;
                            }
                            photoViewer2.H6 = z20;
                        }
                    }
                });
            }
        });
    }

    public final void v1(String str, long j, boolean z, float f, float f2, int i, long j2) {
        int parseInt;
        if (this.C8 != null) {
            Utilities.e.a(this.C8);
            this.C8 = null;
        }
        mb8 mb8Var = this.X7;
        mb8Var.a();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        mb8Var.E = mediaMetadataRetriever;
        boolean z2 = true;
        mb8Var.x = j > 0;
        mb8Var.d = f;
        mb8Var.e = f2;
        float f3 = mb8Var.s;
        if (f3 < f) {
            mb8Var.s = f;
        } else if (f3 > f2) {
            mb8Var.s = f2;
        }
        try {
            if (j > 0) {
                File file = new File(str);
                ParcelFileDescriptor open = ParcelFileDescriptor.open(file, TLObject.FLAG_28);
                mb8Var.y = open;
                mb8Var.E.setDataSource(open.getFileDescriptor(), j, file.length() - j);
            } else {
                mediaMetadataRetriever.setDataSource(str);
            }
            String extractMetadata = mb8Var.E.extractMetadata(9);
            if (extractMetadata != null) {
                mb8Var.a = Long.parseLong(extractMetadata);
            }
            String extractMetadata2 = mb8Var.E.extractMetadata(18);
            if (extractMetadata2 != null) {
                mb8Var.b = Integer.parseInt(extractMetadata2);
            }
            String extractMetadata3 = mb8Var.E.extractMetadata(19);
            if (extractMetadata3 != null) {
                mb8Var.c = Integer.parseInt(extractMetadata3);
            }
            String extractMetadata4 = mb8Var.E.extractMetadata(24);
            if (extractMetadata4 != null && ((parseInt = Integer.parseInt(extractMetadata4)) == 90 || parseInt == 270)) {
                int i2 = mb8Var.b;
                mb8Var.b = mb8Var.c;
                mb8Var.c = i2;
            }
            if (mb8Var.x) {
                mb8Var.f = (float) ((j2 / 1000.0d) / mb8Var.a);
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
        mb8Var.invalidate();
        this.D8 = null;
        if (!z && this.d2 != 1) {
            z2 = false;
        }
        this.r = z2;
        this.e8 = -1;
        this.g8 = 0;
        this.o8 = 25;
        this.z8 = new File(str).length();
        to3 to3Var = Utilities.e;
        pc8 pc8Var = new pc8(this, str, j, i);
        this.C8 = pc8Var;
        to3Var.c(pc8Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v2() {
        int i;
        int i2;
        float f;
        boolean z;
        ed8 ed8Var = this.d;
        if (ed8Var == null || !ed8Var.l()) {
            return;
        }
        c();
        ub1 c0 = c0();
        this.d.E(!r1.z());
        f2(true, true);
        ub1 c02 = c0();
        boolean z2 = this.d.z();
        if (c0 != c02) {
            kb1 kb1Var = c0.f;
            kb1Var.k(true);
            c02.setText(hm.cloneSpans(c0.getText()));
            kb1 kb1Var2 = c02.f;
            kb1Var2.getEditText().setAllowTextEntitiesIntersection(kb1Var.getEditText().getAllowTextEntitiesIntersection());
            if (kb1Var.getEditText().isFocused()) {
                kb1Var2.getEditText().requestFocus();
                kb1Var2.getEditText().setSelection(kb1Var.getEditText().getSelectionStart(), kb1Var.getEditText().getSelectionEnd());
            }
            mb1 mb1Var = c0.N;
            if (mb1Var != null) {
                hl.B2(mb1Var);
                c0.N = null;
            }
            ViewPropertyAnimator animate = this.G.animate();
            if (this.K) {
                ub1 c03 = c0();
                qb8 qb8Var = this.W1;
                if (c03 != qb8Var || !qb8Var.M.c()) {
                    f = 1.0f;
                    animate.alpha(f).start();
                    if (this.Q0.getVisibility() == 0) {
                        if (this.K) {
                            ub1 c04 = c0();
                            qb8 qb8Var2 = this.W1;
                            if (c04 != qb8Var2 || !qb8Var2.M.c()) {
                                z = true;
                                z2(z);
                            }
                        }
                        z = false;
                        z2(z);
                    }
                }
            }
            f = 0.0f;
            animate.alpha(f).start();
            if (this.Q0.getVisibility() == 0) {
            }
        }
        if (uc7.s1(this.U).X3.getInt("movecaptionhint", 0) >= 24) {
            boolean z3 = f11.a;
        } else {
            SharedPreferences sharedPreferences = uc7.s1(this.U).X3;
            sharedPreferences.edit().putInt("movecaptionhint", sharedPreferences.getInt("movecaptionhint", 0) + 1).apply();
            d31 d31Var = new d31(z2 ? this.S0 : this.R0, new x53());
            if (z2) {
                i = R.raw.caption_up;
                i2 = 2131748075;
            } else {
                i = R.raw.caption_down;
                i2 = 2131748077;
            }
            v21 I = d31Var.I(i, ob6.M0(i2, null), ob6.M0(z2 ? 2131748074 : 2131748076, null));
            z11 z11Var = I.e;
            if (z11Var instanceof s21) {
                e29 e29Var = ((s21) z11Var).a;
                e29Var.setScaleX(0.8f);
                e29Var.setScaleY(0.8f);
            }
            I.k(!z2);
        }
        pb8 pb8Var = this.V1;
        if (pb8Var != null) {
            kb1 kb1Var3 = pb8Var.f;
            kb1Var3.d();
            kb1Var3.k(true);
        }
    }

    public final void w(int i) {
        kfc kfcVar = this.G2;
        if (kfcVar != null && kfcVar.d != null && i != kfcVar.e0) {
            kfcVar.e0 = i;
            ArrayList arrayList = kfcVar.O;
            kfcVar.v0(false, (arrayList == null || i < 0 || i >= arrayList.size()) ? null : (hfc) kfcVar.O.get(i));
        }
        if (i == -1) {
            kfc.n0(null, this.S4);
        } else {
            kfc kfcVar2 = this.G2;
            if (kfcVar2 != null) {
                kfc.n0(kfcVar2.Z(i), this.S4);
            }
        }
        N2();
        this.q0.U(null, null);
        try {
            go.b(0);
            if (lh2.t().w()) {
                lh2.t().T(j0());
            }
            kfc kfcVar3 = this.G2;
            if (kfcVar3 != null) {
                go.z(kfcVar3.c0());
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public final int w0() {
        return this.t2.right;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void w1(boolean z) {
        this.l7 = null;
        hl.r(this.n7);
        lfc lfcVar = this.k7;
        if (lfcVar != null) {
            lfcVar.a(this.U, null);
        }
        D0();
        int i = 0;
        Object[] objArr = 0;
        this.E2 = false;
        me8 me8Var = this.U8;
        if (me8Var != null && me8Var.c == 0) {
            this.U8 = null;
            me8Var.h();
        }
        kfc kfcVar = this.G2;
        HashMap hashMap = f9;
        ob8 ob8Var = this.y2;
        if (kfcVar != null) {
            m();
            hl.r(this.x2);
            hl.r(ob8Var);
            if (this.c3 != null) {
                float S = this.G2.S() / this.G2.U();
                String str = this.c3;
                SystemClock.elapsedRealtime();
                hashMap.put(str, new hd8(S));
                r47 r47Var = this.S4;
                if (r47Var != null) {
                    r47Var.l3 = Float.valueOf(S);
                }
            }
            this.G2.l0();
            this.G2 = null;
        } else {
            this.X2 = false;
        }
        if (this.g0 != null) {
            hl.r(ob8Var);
            if (this.c3 != null) {
                float l0 = l0() / z0();
                String str2 = this.c3;
                SystemClock.elapsedRealtime();
                hashMap.put(str2, new hd8(l0));
                r47 r47Var2 = this.S4;
                if (r47Var2 != null) {
                    r47Var2.l3 = Float.valueOf(l0);
                }
            }
        }
        cv3 cv3Var = this.W3;
        if (cv3Var != null) {
            cv3Var.disable();
            this.W3 = null;
        }
        this.s3.a();
        x2(false, false);
        this.s2 = false;
        this.U2 = false;
        if (this.w0.isEnabled()) {
            this.w0.setEnabled(false);
            this.w0.animate().alpha(0.5f).setDuration(175L).withEndAction(null).start();
        }
        if (this.h3) {
            try {
                this.E.getWindow().clearFlags(128);
                this.h3 = false;
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
        dc8 dc8Var = this.z2;
        if (dc8Var != null) {
            try {
                this.f0.removeView(dc8Var);
            } catch (Throwable unused) {
            }
            this.z2 = null;
        }
        k();
        this.A2 = null;
        TextureView textureView = this.C2;
        if (textureView != null) {
            if (textureView instanceof kec) {
                kec kecVar = (kec) textureView;
                rf4 rf4Var = kecVar.b;
                if (rf4Var != null) {
                    rf4Var.postRunnable(new pf4(rf4Var, objArr == true ? 1 : 0));
                }
                kecVar.a = null;
            }
            this.C2 = null;
        }
        this.c0.e();
        if (this.D2 != null) {
            this.D2 = null;
        }
        if (this.P3) {
            this.P3 = false;
            hl.r(this.h4);
        }
        if (!z && !this.G8 && !this.H8) {
            Y1(false, true);
        }
        lb8 lb8Var = this.X0[0];
        while (true) {
            float[] fArr = lb8Var.n;
            if (i >= fArr.length) {
                lb8Var.a();
                return;
            } else {
                lb8Var.m[i] = 1.0f;
                fArr[i] = 1.0f;
                i++;
            }
        }
    }

    public final void w2(boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        float N = hl.N(24.0f);
        jo0 jo0Var = this.Q0;
        Property property = View.ALPHA;
        arrayList.add(ObjectAnimator.ofFloat(jo0Var, (Property<jo0, Float>) property, z ? 1.0f : 0.0f));
        jo0 jo0Var2 = this.Q0;
        Property property2 = View.TRANSLATION_Y;
        arrayList.add(ObjectAnimator.ofFloat(jo0Var2, (Property<jo0, Float>) property2, z ? 0.0f : N));
        k3b k3bVar = this.o5;
        if (k3bVar != null) {
            arrayList.add(ObjectAnimator.ofFloat(k3bVar, (Property<k3b, Float>) property, z ? 1.0f : 0.0f));
        }
        if (this.o5 != null) {
            arrayList.add(ObjectAnimator.ofFloat(this.r5, (Property<vl4, Float>) property, z ? 1.0f : 0.0f));
        }
        arrayList.add(ObjectAnimator.ofFloat(this.T0, (Property<di3, Float>) property, z ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.T0, (Property<di3, Float>) property2, z ? 0.0f : N));
        int i = this.d2;
        if (i == 0 || i == 4) {
            arrayList.add(ObjectAnimator.ofFloat(this.O0, (Property<CheckBox, Float>) property, z ? 1.0f : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.O0, (Property<CheckBox, Float>) property2, z ? 0.0f : -N));
            arrayList.add(ObjectAnimator.ofFloat(this.P0, (Property<CounterView, Float>) property, z ? 1.0f : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.P0, (Property<CounterView, Float>) property2, z ? 0.0f : -N));
        }
        animatorSet.playTogether(arrayList);
        animatorSet.setDuration(200L);
        animatorSet.start();
        if (z || !K0()) {
            return;
        }
        y(true);
        kb1 kb1Var = this.V1.f;
        if (kb1Var.e) {
            kb1Var.k(true);
        }
        kb1 kb1Var2 = this.W1.f;
        if (kb1Var2.e) {
            kb1Var2.k(true);
        }
        this.V1.f.d();
        this.W1.f.d();
    }

    public final void x(boolean z, boolean z2, float f) {
        if (f != this.u1) {
            this.u1 = f;
            if (this.S4 != null) {
                SharedPreferences sharedPreferences = org.telegram.messenger.a.b.getSharedPreferences("playback_speed", 0);
                if (Math.abs(this.u1 - 1.0f) < 0.001f) {
                    sharedPreferences.edit().remove("speed" + r47.B0(this.S4.k) + "_" + this.S4.e1()).commit();
                } else {
                    sharedPreferences.edit().putFloat("speed" + r47.B0(this.S4.k) + "_" + this.S4.e1(), this.u1).commit();
                }
            }
            kfc kfcVar = this.G2;
            if (kfcVar != null) {
                kfcVar.u0(this.u1);
            }
            nc8 nc8Var = this.g0;
            if (nc8Var != null) {
                nc8Var.setPlaybackSpeed(this.u1);
            }
        }
        S1(true, z);
        if (z2) {
            this.q0.U(null, null);
        }
    }

    public final void x1(int i) {
        if (this.D8 != null) {
            MediaController.z().d(this.D8);
        }
        boolean z = this.H8 && !this.E8;
        this.H8 = false;
        this.F8 = false;
        this.V7.setVisibility(4);
        if (i != 1) {
            this.E8 = false;
            this.X0[0].d(3, false, true);
            if (i == 2) {
                t1(this.U4, this.V4, false, false, this.W4.d, false, 0L);
                this.G2.o0((long) (this.X7.getLeftProgress() * this.n8));
            }
        } else if (this.k8 == this.i8 && this.j8 == this.h8) {
            this.E8 = false;
            lb8 lb8Var = this.X0[0];
            lb8Var.f(lb8Var.h == 0 || lb8Var.k == 0, 0.0f);
            this.X0[0].d(3, false, true);
            if (z) {
                this.F8 = true;
            } else {
                t1(this.U4, this.V4, false, false, this.W4.d, false, 0L);
                this.G2.o0((long) (this.X7.getLeftProgress() * this.n8));
            }
        } else {
            w1(false);
            if (this.D8 == null) {
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.id = 0;
                tL_message.message = "";
                tL_message.media = new TLRPC.TL_messageMediaEmpty();
                tL_message.action = new TLRPC.TL_messageActionEmpty();
                tL_message.dialog_id = this.D5;
                r47 r47Var = new r47(yac.t0, tL_message, false, false);
                this.D8 = r47Var;
                r47Var.k.attachPath = new File(xb4.z(4), "video_preview.mp4").getAbsolutePath();
                this.D8.r0 = new oec();
                oec oecVar = this.D8.r0;
                oecVar.g = this.g8;
                oecVar.h = this.h8;
                this.D8.r0.i = this.i8;
                oec oecVar2 = this.D8.r0;
                oecVar2.n = this.o8;
                Uri uri = this.V4;
                if (uri == null) {
                    oecVar2.o = uri.getPath();
                } else {
                    oecVar2.o = uri.getPath();
                }
            }
            oec oecVar3 = this.D8.r0;
            long j = this.r8;
            oecVar3.a = j;
            long j2 = this.s8;
            oecVar3.b = j2;
            if (j == -1) {
                j = 0;
            }
            if (j2 == -1) {
                j2 = (long) (this.n8 * 1000.0f);
            }
            if (j2 - j > 5000000) {
                oecVar3.b = j + 5000000;
            }
            oecVar3.m = this.l8;
            this.D8.r0.k = this.j8;
            this.D8.r0.l = this.k8;
            oec oecVar4 = this.D8.r0;
            oecVar4.X = true;
            oecVar4.v = (long) (this.n8 * 1000.0f);
            if (!MediaController.z().j0(this.D8, true, true, true)) {
                this.E8 = true;
            }
            this.H8 = true;
            lb8 lb8Var2 = this.X0[0];
            lb8Var2.f(lb8Var2.h == 0 || lb8Var2.k == 0, 0.0f);
            this.X0[0].d(0, false, true);
        }
        this.f0.invalidate();
    }

    public final void x2(boolean z, boolean z2) {
        y98 y98Var = this.y;
        hl.r(y98Var);
        if (!z2) {
            AnimatorSet animatorSet = this.x;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.x = null;
            }
            this.Y0.setAlpha(z ? 1.0f : 0.0f);
            this.Y0.setVisibility(z ? 0 : 4);
            return;
        }
        y2(z);
        AnimatorSet animatorSet2 = this.x;
        if (!z) {
            if (animatorSet2 != null) {
                animatorSet2.cancel();
                y2(false);
                return;
            }
            return;
        }
        if (animatorSet2 != null) {
            animatorSet2.cancel();
            this.x = null;
        }
        if (!this.R3) {
            hl.d3(y98Var, 500L);
        } else {
            this.R3 = false;
            y2(true);
        }
    }

    public final void y(boolean z) {
        int i = this.O4;
        if (i < 0 || i >= this.f7.size() || !K0()) {
            return;
        }
        if (z) {
            c();
        }
        c0().p();
    }

    public final int y0(int i) {
        vnb vnbVar = this.w2;
        return vnbVar != null ? vnbVar.h(i) : aob.w0(null, i, false);
    }

    public final float y1() {
        return z1(true);
    }

    public final void y2(boolean z) {
        if (z) {
            this.Y0.setVisibility(0);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        this.x = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.Y0, (Property<ei1, Float>) View.ALPHA, z ? 1.0f : 0.0f));
        this.x.setDuration(200L);
        this.x.addListener(new ec8(this, z, (byte) 1));
        this.x.start();
    }

    public final void z() {
        hc8 hc8Var = this.M1;
        Activity activity = this.E;
        y98 y98Var = new y98(this, (byte) 1);
        if (hc8Var.v1) {
            hc8Var.y0(false);
            return;
        }
        if (hc8Var.U1) {
            hc8Var.i0(true);
            return;
        }
        if (hc8Var.D0 && hc8Var.C0 != null) {
            hc8Var.t0(null, true);
            return;
        }
        if (!hc8Var.p0.a()) {
            y98Var.run();
            return;
        }
        if (activity == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, hc8Var.A1, activity);
        String M0 = ob6.M0(2131747005, null);
        id idVar = alertDialog$Builder.a;
        idVar.U = M0;
        idVar.S = ob6.M0(2131751370, null);
        alertDialog$Builder.j(ob6.M0(2131747307, null), new e05((Object) y98Var, (byte) 17));
        alertDialog$Builder.g(ob6.M0(2131752570, null), null);
        b2(alertDialog$Builder);
    }

    public final long z0() {
        nc8 nc8Var = this.g0;
        if (nc8Var != null && nc8Var.y) {
            return nc8Var.getVideoDuration();
        }
        kfc kfcVar = this.G2;
        if (kfcVar == null) {
            return 0L;
        }
        return kfcVar.U();
    }

    public final float z1(boolean z) {
        int i;
        if (this.d2 != 11) {
            return 1.0f;
        }
        int h0 = h0(this.t4);
        if (h0 == 0) {
            h0 = hl.q.x;
        }
        float A = c00.A(20.0f, h0, 1) / h0;
        if (z) {
            int q = this.B4.q();
            int o = this.B4.o();
            if ((q <= 1 || o <= 1) && (i = this.O4) >= 0) {
                ArrayList arrayList = this.f7;
                if (i < arrayList.size()) {
                    Object obj = arrayList.get(this.O4);
                    if (obj instanceof no6) {
                        no6 no6Var = (no6) obj;
                        q = no6Var.F;
                        o = no6Var.G;
                        if ((no6Var.J / 90) % 2 != 0) {
                            o = q;
                            q = o;
                        }
                    }
                }
            }
            if (q > 1 && o > 1 && q > o) {
                return (q / o) * A;
            }
        }
        return A;
    }

    public final void z2(boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        float N = hl.N(24.0f);
        int i = this.d2;
        if (i == 0 || i == 4) {
            CheckBox checkBox = this.O0;
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(checkBox, (Property<CheckBox, Float>) property, z ? 1.0f : 0.0f));
            CheckBox checkBox2 = this.O0;
            Property property2 = View.TRANSLATION_Y;
            arrayList.add(ObjectAnimator.ofFloat(checkBox2, (Property<CheckBox, Float>) property2, z ? 0.0f : -N));
            arrayList.add(ObjectAnimator.ofFloat(this.P0, (Property<CounterView, Float>) property, z ? 1.0f : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.P0, (Property<CounterView, Float>) property2, z ? 0.0f : -N));
        }
        animatorSet.playTogether(arrayList);
        animatorSet.setDuration(200L);
        animatorSet.start();
    }

    @Override // qu4
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // s84
    public final void v0(float f, int i) {
    }
}
