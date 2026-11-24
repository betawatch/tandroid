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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class PhotoViewer implements jm7, nu4, mu4, g94 {
    public static Drawable[] d9;
    public static final Paint e9 = new Paint(2);
    public static final HashMap f9 = new HashMap();
    public static DecelerateInterpolator g9;
    public static Paint h9;
    public static final Property i9;
    public static volatile PhotoViewer j9;
    public static volatile PhotoViewer k9;
    public j8 A0;
    public ucc A1;
    public View A2;
    public final int[] A3;
    public ImageReceiver A4;
    public boolean A5;
    public float A6;
    public boolean A7;
    public long A8;
    public r6 B0;
    public lx9 B1;
    public AnimatorSet B2;
    public boolean B3;
    public ImageReceiver B4;
    public byte B5;
    public float B6;
    public boolean B7;
    public float B8;
    public r7 C0;
    public AnimatorSet C1;
    public TextureView C2;
    public Bitmap C3;
    public ImageReceiver C4;
    public long C5;
    public float C6;
    public f C7;
    public ab8 C8;
    public r7 D0;
    public x68 D1;
    public SurfaceView D2;
    public Bitmap D3;
    public ej0 D4;
    public long D5;
    public float D6;
    public final float[] D7;
    public k47 D8;
    public Activity E;
    public r7 E0;
    public final n43 E1;
    public boolean E2;
    public ImageView E3;
    public ej0 E4;
    public k39 E5;
    public float E6;
    public final float[] E7;
    public boolean E8;
    public ContextThemeWrapper F;
    public r7 F0;
    public n43 F1;
    public kb8 F2;
    public boolean F3;
    public ej0 F4;
    public String F5;
    public float F6;
    public ObjectAnimator F7;
    public boolean F8;
    public x20 G;
    public a8 G0;
    public n43 G1;
    public ndc G2;
    public byte G3;
    public boolean G4;
    public boolean G5;
    public float G6;
    public byte G7;
    public boolean G8;
    public ImageView H;
    public o20 H0;
    public ao6 H1;
    public boolean H2;
    public boolean H3;
    public boolean H4;
    public long H5;
    public boolean H6;
    public e7a H7;
    public boolean H8;
    public Drawable I;
    public qmb I0;
    public ao6 I1;
    public Runnable I2;
    public boolean I3;
    public boolean I4;
    public int I5;
    public boolean I6;
    public float I7;
    public String I8;
    public sl0 J;
    public qmb J0;
    public n78 J1;
    public boolean J2;
    public boolean J3;
    public boolean J4;
    public int J5;
    public boolean J6;
    public float J7;
    public final ln J8;
    public boolean K;
    public zh2 K0;
    public AnimatorSet K1;
    public float K2;
    public boolean K3;
    public boolean K4;
    public int K5;
    public boolean K6;
    public final n88 K7;
    public ln[] K8;
    public boolean L;
    public final HashMap L0;
    public mx5 L1;
    public float L2;
    public boolean L3;
    public final Matrix L4;
    public boolean L5;
    public byte L6;
    public Path L7;
    public RectF L8;
    public AnimatorSet M;
    public final BackgroundDrawable M0;
    public sa8 M1;
    public float M2;
    public boolean M3;
    public final Paint M4;
    public boolean M5;
    public byte M6;
    public Paint M7;
    public RectF M8;
    public ob8 N;
    public final Paint N0;
    public boolean N1;
    public float N2;
    public float N3;
    public Bitmap N4;
    public boolean N5;
    public boolean N6;
    public Paint N7;
    public Matrix N8;
    public nb8 O;
    public CheckBox O0;
    public ra8 O1;
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
    public jp0 Q0;
    public he Q1;
    public boolean Q2;
    public boolean Q3;
    public boolean Q4;
    public boolean Q5;
    public boolean Q6;
    public Matrix Q7;
    public RenderNode Q8;
    public v98 R;
    public FrameLayout R0;
    public hb8 R1;
    public int R2;
    public boolean R3;
    public boolean R4;
    public boolean R5;
    public boolean R6;
    public Matrix R7;
    public final ucb R8;
    public boolean S;
    public FrameLayout S0;
    public FrameLayout S1;
    public ndc S2;
    public long S3;
    public k47 S4;
    public boolean S5;
    public byte S6;
    public final int[] S7;
    public final vh6 S8;
    public Paint T;
    public vi3 T0;
    public TextView T1;
    public SurfaceTexture T2;
    public View T3;
    public VideoAds T4;
    public boolean T5;
    public VelocityTracker T6;
    public rb8 T7;
    public boolean T8;
    public int U;
    public j85 U0;
    public ta8 U1;
    public boolean U2;
    public q98 U3;
    public ArrayList U4;
    public boolean U5;
    public Scroller U6;
    public kb2 U7;
    public ad8 U8;
    public int V;
    public kb2 V0;
    public aa8 V1;
    public boolean V2;
    public int V3;
    public Uri V4;
    public float V5;
    public final ArrayList V6;
    public RadialProgressView V7;
    public float V8;
    public int W;
    public TextView W0;
    public ba8 W1;
    public boolean W2;
    public tv3 W3;
    public final ib8 W4;
    public float W5;
    public final SparseArray[] W6;
    public FrameLayout W7;
    public boolean W8;
    public float X;
    public final w98[] X0;
    public float X1;
    public boolean X2;
    public int X3;
    public TLRPC.BotInlineResult X4;
    public float X5;
    public final ArrayList X6;
    public x98 X7;
    public boolean X8;
    public g98 Y;
    public dj1 Y0;
    public ne6 Y1;
    public boolean Y2;
    public byte Y3;
    public gn5 Y4;
    public float Y5;
    public final SparseArray[] Y6;
    public TextView Y7;
    public final RectF Y8;
    public km0 Z;
    public ImageView Z0;
    public FrameLayout Z1;
    public boolean Z2;
    public boolean Z3;
    public gn5 Z4;
    public float Z5;
    public final ArrayList Z6;
    public AnimatorSet Z7;
    public boolean Z8;
    public final fn0 a = new fn0(0, this, d53.h, 380, false);
    public g79 a0;
    public ImageView a1;
    public FrameLayout a2;
    public float a3;
    public final jc2 a4;
    public xw9 a5;
    public float a6;
    public final ArrayList a7;
    public long a8;
    public boolean a9;
    public final boolean b;
    public g79 b0;
    public ImageView b1;
    public i22 b2;
    public String b3;
    public final VideoFramesRewinder b4;
    public final String[] b5;
    public float b6;
    public final ArrayList b7;
    public long b8;
    public final n88 b9;
    public int c;
    public sm0 c0;
    public ImageView c1;
    public a26 c2;
    public String c3;
    public final ja8 c4;
    public qb8 c5;
    public float c6;
    public final ArrayList c7;
    public long c8;
    public final s98 c9;
    public pb8 d;
    public wm0 d0;
    public ImageView d1;
    public int d2;
    public long d3;
    public final v20 d4;
    public String d5;
    public float d6;
    public final ArrayList d7;
    public volatile int d8;
    public boolean e;
    public WindowManager.LayoutParams e0;
    public kc2 e1;
    public boolean e2;
    public float e3;
    public String e4;
    public long e5;
    public float e6;
    public final ArrayList e7;
    public volatile int e8;
    public boolean f;
    public lb8 f0;
    public c7 f1;
    public boolean f2;
    public boolean f3;
    public boolean f4;
    public String f5;
    public float f6;
    public final ArrayList f7;
    public int f8;
    public ya8 g0;
    public o96 g1;
    public boolean g2;
    public long g3;
    public boolean g4;
    public boolean g5;
    public float g6;
    public gn5 g7;
    public int g8;
    public int h;
    public z h0;
    public y98 h1;
    public boolean h2;
    public boolean h3;
    public final z98 h4;
    public TL_iv.PageBlock h5;
    public float h6;
    public a0 h7;
    public volatile int h8;
    public ClippingImageView i0;
    public ArrayList i1;
    public boolean i2;
    public vb8 i3;
    public final z98 i4;
    public jn5 i5;
    public float i6;
    public mb8 i7;
    public volatile int i8;
    public a6 j0;
    public ArrayList j1;
    public boolean j2;
    public String j3;
    public final float[][] j4;
    public boolean j5;
    public float j6;
    public final Rect j7;
    public volatile int j8;
    public View k0;
    public kcc k1;
    public kn k2;
    public ValueAnimator k3;
    public yv1 k4;
    public boolean k5;
    public float k6;
    public odc k7;
    public volatile int k8;
    public int l0;
    public hg5 l1;
    public boolean l2;
    public boolean l3;
    public org.telegram.ui.ActionBar.d l4;
    public boolean l5;
    public float l6;
    public Uri l7;
    public volatile int l8;
    public TextView m0;
    public td5 m1;
    public boolean m2;
    public final int[] m3;
    public byte m4;
    public boolean m5;
    public long m6;
    public long m7;
    public volatile int m8;
    public boolean n;
    public TextView n0;
    public kvb n1;
    public boolean n2;
    public final int[] n3;
    public long n4;
    public String n5;
    public int n6;
    public final n88 n7;
    public float n8;
    public TextView o0;
    public UndoView o1;
    public boolean o2;
    public lka o3;
    public Runnable o4;
    public n1b o5;
    public AnimatorSet o6;
    public a8 o7;
    public int o8;
    public r7 p0;
    public ub8 p1;
    public un5 p2;
    public ImageView p3;
    public qb8 p4;
    public wb8 p5;
    public AnimatorSet p6;
    public r86 p7;
    public volatile boolean p8;
    public r7 q0;
    public s30 q1;
    public boolean q2;
    public vdc q3;
    public qb8 q4;
    public ArrayList q5;
    public ou4 q6;
    public final po q7;
    public volatile boolean q8;
    public boolean r;
    public a8 r0;
    public ImageReceiver r1;
    public xb7 r2;
    public sb r3;
    public boolean r4;
    public yc r5;
    public boolean r6;
    public a26 r7;
    public long r8;
    public boolean s;
    public v7 s0;
    public boolean s1;
    public boolean s2;
    public ka8 s3;
    public boolean s4;
    public db8 s5;
    public final DecelerateInterpolator s6;
    public u31 s7;
    public long s8;
    public a8 t0;
    public final n88 t1;
    public final Rect t2;
    public AnimatorSet t3;
    public byte t4;
    public LinearLayout t5;
    public float t6;
    public int t7;
    public float t8;
    public a8 u0;
    public float u1;
    public boolean u2;
    public boolean u3;
    public final n88 u4;
    public db8 u5;
    public float u6;
    public boolean u7;
    public float u8;
    public j8 v0;
    public long v1;
    public boolean v2;
    public int v3;
    public byte v4;
    public db8 v5;
    public float v6;
    public CharSequence v7;
    public long v8;
    public int w;
    public a8 w0;
    public final GradientDrawable[] w1;
    public ylb w2;
    public bd8 w3;
    public String w4;
    public db8 w5;
    public float w6;
    public boolean w7;
    public long w8;
    public AnimatorSet x;
    public ai2 x0;
    public final boolean[] x1;
    public final t98 x2;
    public ImageView x3;
    public kw7 x4;
    public db8 x5;
    public float x6;
    public ValueAnimator x7;
    public long x8;
    public final n88 y;
    public LinearLayout y0;
    public final float[] y1;
    public final z98 y2;
    public final ImageView[] y3;
    public kw7 y4;
    public long y5;
    public float y6;
    public TLRPC.Document y7;
    public long y8;
    public final ArrayList z0;
    public int z1;
    public oa8 z2;
    public boolean z3;
    public kw7 z4;
    public boolean z5;
    public float z6;
    public TLRPC.Document z7;
    public long z8;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
    class BackgroundDrawable extends ColorDrawable {
        public static final /* synthetic */ int g = 0;
        public final RectF a;
        public final RectF b;
        public final Paint c;
        public a18 d;
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
            a26 a26Var = photoViewer.r7;
            if (a26Var != null) {
                a26Var.b(!this.e);
            }
            a26 a26Var2 = photoViewer.c2;
            if (a26Var2 != null) {
                a26Var2.b(!this.e);
            }
            i22 i22Var = photoViewer.b2;
            if (i22Var != null) {
                boolean z = this.e;
                i22Var.v2.m(i22Var.i4);
                if (i22Var.r4 != z) {
                    i22Var.r4 = z;
                    a22 a22Var = i22Var.v2;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = i22Var.d2;
                    if (a22Var != chatAttachAlertPhotoLayout || chatAttachAlertPhotoLayout == null || chatAttachAlertPhotoLayout.j1) {
                        return;
                    }
                    boolean z2 = !z || i22Var.s4;
                    if (!chatAttachAlertPhotoLayout.n || chatAttachAlertPhotoLayout.P0) {
                        return;
                    }
                    if (!z2) {
                        chatAttachAlertPhotoLayout.v0();
                        return;
                    }
                    m62 m62Var = chatAttachAlertPhotoLayout.Q;
                    if (m62Var != null) {
                        chatAttachAlertPhotoLayout.p0 = Boolean.valueOf(m62Var.isFrontface());
                        chatAttachAlertPhotoLayout.f0(true);
                    }
                }
            }
        }

        @Override // android.graphics.drawable.ColorDrawable, android.graphics.drawable.Drawable
        public final void draw(Canvas canvas) {
            a18 a18Var;
            qb8 qb8Var;
            Drawable[] drawableArr = PhotoViewer.d9;
            PhotoViewer photoViewer = PhotoViewer.this;
            if (photoViewer.m4 == 0 || gm.O1() || (qb8Var = photoViewer.c5) == null || qb8Var.m == null) {
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
                    rectF.inset(gm.L(1.0f), gm.L(1.0f));
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
            if (getAlpha() == 0 || (a18Var = this.d) == null) {
                return;
            }
            gm.c3(a18Var);
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
                    gm.d3(new Runnable() { // from class: org.telegram.ui.y
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

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
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
            textPaint.setTextSize(gm.L(15.0f));
            textPaint.setTypeface(gm.o());
            textPaint.setColor(-1);
            Paint paint = new Paint(1);
            this.c = paint;
            paint.setColor(-1);
            paint.setStrokeWidth(gm.L(2.0f));
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeJoin(Paint.Join.ROUND);
            this.f = new RectF();
            a(0);
        }

        public final void a(int i) {
            String valueOf = String.valueOf(Math.max(1, i));
            int L = gm.L(100.0f);
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
                qo qoVar = so.b;
                animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofInt(paint, qoVar, 0), ObjectAnimator.ofInt(textPaint, qoVar, 0));
                animatorSet.setInterpolator(new DecelerateInterpolator());
            } else {
                int i2 = this.h;
                if (i2 == 0) {
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this, (Property<CounterView, Float>) property, 0.0f, 1.0f);
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this, (Property<CounterView, Float>) property2, 0.0f, 1.0f);
                    qo qoVar2 = so.b;
                    animatorSet.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofInt(paint, qoVar2, 0, nm7.d4), ObjectAnimator.ofInt(textPaint, qoVar2, 0, nm7.d4));
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
            paint.setAlpha(nm7.d4);
            float L = gm.L(1.0f);
            float L2 = measuredHeight - gm.L(14.0f);
            float measuredWidth = getMeasuredWidth() - gm.L(1.0f);
            float L3 = gm.L(14.0f) + measuredHeight;
            RectF rectF = this.f;
            rectF.set(L, L2, measuredWidth, L3);
            canvas.drawRoundRect(rectF, gm.L(15.0f), gm.L(15.0f), paint);
            if (this.a != null) {
                this.b.setAlpha((int) ((1.0f - this.n) * 255.0f));
                canvas.save();
                canvas.translate((getMeasuredWidth() - this.d) / 2, (this.n * gm.L(5.0f)) + gm.N(0.2f) + ((getMeasuredHeight() - this.e) / 2));
                this.a.draw(canvas);
                canvas.restore();
                paint.setAlpha((int) (this.n * 255.0f));
                int centerX = (int) rectF.centerX();
                int B = (int) kt6.B(1.0f, this.n, gm.L(5.0f), (int) rectF.centerY());
                canvas.drawLine(gm.L(5.0f) + centerX, B - gm.L(5.0f), centerX - gm.L(5.0f), gm.L(5.0f) + B, paint);
                canvas.drawLine(centerX - gm.L(5.0f), B - gm.L(5.0f), gm.L(5.0f) + centerX, gm.L(5.0f) + B, paint);
            }
        }

        @Override // android.view.View
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("android.widget.Button");
            int i = this.h;
            if (i > 0) {
                accessibilityNodeInfo.setContentDescription(jb6.G(i, "PhotosSelected", new Object[0]));
            }
        }

        @Override // android.view.View
        public final void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.max(gm.L(20.0f) + this.d, gm.L(30.0f)), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(40.0f), TLObject.FLAG_30));
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
            i9 = new f98();
        } else {
            i9 = new ny1(Float.class, "progress", (byte) 2);
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
        this.y = new n88(this, (byte) 18);
        this.K = true;
        this.P = true;
        this.Q = false;
        this.a0 = new g79(0, false);
        this.z0 = new ArrayList();
        this.L0 = new HashMap(3);
        this.M0 = new BackgroundDrawable();
        Paint paint = new Paint();
        this.N0 = paint;
        this.X0 = new w98[3];
        this.t1 = new n88(this, (byte) 19);
        this.w1 = new GradientDrawable[2];
        this.x1 = new boolean[2];
        this.y1 = new float[2];
        this.E1 = new n43();
        this.F1 = new n43();
        this.G1 = new n43();
        this.X1 = -8.0f;
        this.t2 = new Rect();
        this.x2 = new t98(this);
        this.y2 = new z98(this, b);
        this.l3 = true;
        this.m3 = new int[2];
        this.n3 = new int[2];
        this.y3 = new ImageView[3];
        this.A3 = new int[2];
        this.K3 = true;
        this.V3 = -1;
        this.X3 = -10;
        this.a4 = new jc2(this, b2);
        VideoFramesRewinder videoFramesRewinder = new VideoFramesRewinder();
        this.b4 = videoFramesRewinder;
        this.c4 = new ja8(this, videoFramesRewinder);
        this.d4 = new v20(this);
        this.h4 = new z98(this, b2);
        this.i4 = new z98(this, (byte) 2);
        this.j4 = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 2, 13);
        this.u4 = new n88(this, (byte) 20);
        this.A4 = new ImageReceiver(null);
        this.B4 = new mm(this, (byte) 6);
        this.C4 = new ImageReceiver(null);
        byte b3 = 21;
        this.D4 = new ej0(1, new n88(this, b3));
        this.E4 = new ej0(1, new n88(this, b3));
        this.F4 = new ej0(1, new n88(this, b3));
        this.K4 = false;
        this.L4 = new Matrix();
        Paint paint2 = new Paint();
        this.M4 = paint2;
        this.N4 = null;
        this.W4 = new ib8();
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
        this.n7 = new n88(this, (byte) 22);
        this.q7 = new po(new int[]{nm7.r, nm7.s, nm7.W, nm7.V, nm7.g3});
        this.D7 = new float[]{1.0f};
        this.E7 = new float[]{1.0f};
        this.K7 = new n88(this, (byte) 23);
        this.S7 = new int[2];
        this.a8 = -1L;
        this.b8 = -1L;
        this.c8 = -1L;
        this.e8 = -1;
        this.J8 = new ln(new n88(this, b3), 180L, d53.g);
        this.R8 = new ucb();
        this.S8 = new vh6();
        this.Y8 = new RectF();
        this.b9 = new n88(this, (byte) 24);
        this.c9 = new s98(this);
        paint.setColor(-16777216);
        paint2.setColor(-1);
        this.B4.T(3);
    }

    public static boolean C0() {
        return j9 != null;
    }

    public static Bitmap E(Bitmap bitmap, ao6 ao6Var, int[] iArr, boolean z) {
        int i;
        int i2;
        try {
            int i3 = 0;
            int i4 = (ao6Var.k + (iArr != null ? iArr[0] : 0)) % 360;
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
            Bitmap createBitmap = Bitmap.createBitmap((int) (ao6Var.e * f), (int) (ao6Var.f * f2), Bitmap.Config.ARGB_8888);
            Matrix matrix = new Matrix();
            matrix.postTranslate((-width) / 2, (-height) / 2);
            if (z && ao6Var.l) {
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
            matrix.postRotate(ao6Var.d + i4);
            matrix.postTranslate(ao6Var.a * f, ao6Var.b * f2);
            float f3 = ao6Var.c;
            matrix.postScale(f3, f3);
            matrix.postTranslate(r10 / 2, r11 / 2);
            new Canvas(createBitmap).drawBitmap(bitmap, matrix, new Paint(2));
            return createBitmap;
        } catch (Throwable th) {
            fc4.g(th, true);
            return null;
        }
    }

    public static boolean N0(k47 k47Var) {
        return (j9 == null || j9.B3 || !j9.e || k47Var == null || j9.S4 == null || j9.S4.e1() != k47Var.e1() || k47.B0(j9.S4.k) != k47.B0(k47Var.k)) ? false : true;
    }

    public static boolean O0(k47 k47Var) {
        return (k9 == null || k47Var == null || k9.S4 == null || k9.S4.e1() != k47Var.e1() || k47.B0(k9.S4.k) != k47.B0(k47Var.k)) ? false : true;
    }

    public static boolean P0(k47 k47Var) {
        boolean z;
        if (j9 != null && !j9.B3 && j9.e && !j9.r4 && k47Var != null) {
            k47 k47Var2 = j9.S4;
            if (k47Var2 == null && j9.d != null) {
                k47Var2 = j9.d.W();
            }
            if (k47Var2 != null && k47Var2.e1() == k47Var.e1() && k47.B0(k47Var2.k) == k47.B0(k47Var.k)) {
                z = true;
                return (!z || k9 == null) ? z : k9.e && !k9.r4 && k47Var != null && k9.S4 != null && k9.S4.e1() == k47Var.e1() && k47.B0(k9.S4.k) == k47.B0(k47Var.k);
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

    public static int T(co6 co6Var) {
        if (co6Var.d()) {
            return gm.Y0(false);
        }
        return 512;
    }

    public static String X(int i, int i2) {
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

    public static String Y(int i, int i2, int i3) {
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
        return Build.VERSION.SDK_INT >= 31 && gda.X && gda.o() >= 2 && !gm.m0;
    }

    public static boolean a2(k47 k47Var) {
        if (k47Var == null || !k47.K4(k47Var.k)) {
            return false;
        }
        if (!k47Var.z0 && !k47Var.y0 && !k47Var.D2(true) && (!k47Var.B() || !gda.x0)) {
            return false;
        }
        boolean z = gda.a;
        return e86.e(1024);
    }

    public static String o0(gn5 gn5Var) {
        if (gn5Var == null || gn5Var.p != 2) {
            return null;
        }
        return "mp4";
    }

    public static PhotoViewer r0() {
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

    public static CharSequence s1(k47 k47Var) {
        if (k47Var.k == null) {
            return "";
        }
        Spannable A5 = k47.A5(gw3.m(new SpannableStringBuilder(k47Var.k.translatedText.text), cmb.n2.getFontMetricsInt(), false, null, 0), k47Var.k.translatedText.entities, cmb.n2.getFontMetricsInt(), false);
        if (k47.M(A5)) {
            try {
                gm.c(A5, 5, false, true);
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
        k47.h(k47Var.O3(), A5, true, 0, 0, true);
        k47.b(A5, k47Var.k.translatedText.entities, k47Var.O3(), true, true, true, 0);
        if (k47.K4(k47Var.k)) {
            k47.h(k47Var.O3(), A5, true, 3, (int) k47Var.L0(), false);
        } else if (k47Var.I3() || k47.Q4(k47Var.k)) {
            k47.h(k47Var.O3(), A5, true, 4, (int) k47Var.L0(), false);
        }
        return A5;
    }

    public static String x0() {
        return new File(bc4.z(4), gda.p() + "_temp.jpg").getAbsolutePath();
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x080e  */
    /* JADX WARN: Removed duplicated region for block: B:163:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x01d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A(boolean z, boolean z2) {
        float f;
        float f2;
        float f3;
        float f4;
        pb8 pb8Var;
        pb8 pb8Var2;
        char c;
        byte b;
        qb8 N;
        int i;
        int i2;
        byte b2;
        float f5;
        ya8 ya8Var;
        yv1 yv1Var;
        e7a e7aVar;
        VelocityTracker velocityTracker;
        boolean z3;
        float f6;
        float[][] fArr;
        byte b3;
        int i3;
        RectF rectF;
        float min;
        boolean[] zArr;
        boolean z4;
        byte b4;
        org.telegram.ui.ActionBar.d dVar;
        TLRPC.Document R;
        TLRPC.Document document;
        boolean z5;
        ImageReceiver imageReceiver;
        Bitmap m;
        int i4;
        byte b5;
        n1b n1bVar = this.o5;
        if (n1bVar != null) {
            n1bVar.W = false;
            db8 db8Var = this.s5;
            if (db8Var.o0 == 2) {
                db8Var.setCutOutState(true);
                g2(false, true);
                this.o5.f();
                this.f0.invalidate();
            }
        }
        if (!z2 && (b5 = this.t4) != 0) {
            if (b5 == 3 && this.M1 != null) {
                z();
                return;
            }
            if (b5 == 1) {
                this.E1.b(this.J2, this.K2, this.L2, this.P2, this.R2, this.O2, 1.0f, 1.0f, this.M2, this.N2, 0.0f, 0.0f, this.Q2);
            }
            if (this.t4 == 4) {
                e();
            }
            o2(0);
            return;
        }
        rb8 rb8Var = this.T7;
        if (rb8Var != null && rb8Var.getTag() != null) {
            ((TextView) this.U7.d).callOnClick();
            return;
        }
        this.f = false;
        this.m2 = false;
        try {
            he heVar = this.Q1;
            if (heVar != null) {
                heVar.dismiss();
                this.Q1 = null;
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
        if (this.f0 != null) {
            gm.r(this.u4);
            H2(true);
        }
        byte b6 = this.t4;
        byte b7 = 9;
        if (b6 != 0) {
            if (b6 == 2) {
                this.J1.c();
                this.f0.removeView(this.J1);
                this.J1 = null;
            } else if (b6 == 1) {
                this.V0.setVisibility(8);
                this.D1.setVisibility(8);
            } else if (b6 == 3) {
                this.M1.C0();
                this.f0.removeView(this.M1.getView());
                this.M1 = null;
                this.h7 = null;
            } else if (b6 == 4) {
                this.P1 = true;
                lb8 lb8Var = this.f0;
                if (lb8Var != null) {
                    lb8Var.invalidate();
                    this.f0.post(new a18(this, this.O1, b7));
                } else {
                    ra8 ra8Var = this.O1;
                    ra8Var.e.h();
                    ra8Var.c.postRunnable(new bn3((byte) 29));
                }
                this.O1 = null;
            }
            this.t4 = (byte) 0;
            d0().M.b(false);
            mx5 mx5Var = this.L1;
            if (mx5Var != null) {
                mx5Var.b(this.t4 != 3);
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
                if (obj instanceof co6) {
                    co6 co6Var = (co6) obj;
                    co6Var.s = l0();
                    if (this.d2 == 11) {
                        co6Var.e();
                    }
                }
            }
        }
        org.telegram.ui.ActionBar.d dVar2 = this.l4;
        if (dVar2 == null || dVar2.getFragmentView() == null) {
            f = 1.0f;
            f2 = 1.0f;
            f3 = 1.0f;
        } else {
            View fragmentView = this.l4.getFragmentView();
            f = fragmentView.getScaleX();
            f2 = fragmentView.getScaleY();
            fragmentView.setScaleX(1.0f);
            fragmentView.setScaleY(1.0f);
            i22 i22Var = this.b2;
            if (i22Var != null) {
                dy0 dy0Var = i22Var.c;
                f3 = dy0Var.getScaleX();
                f4 = dy0Var.getScaleY();
                dy0Var.setScaleX(1.0f);
                dy0Var.setScaleY(1.0f);
                pb8Var = this.d;
                if (pb8Var != null) {
                    pb8Var.Z(this.O4);
                }
                boolean[] zArr2 = {true};
                pb8Var2 = this.d;
                if (pb8Var2 != null) {
                    b = 3;
                    N = null;
                    c = '\b';
                } else {
                    c = '\b';
                    k47 k47Var = this.S4;
                    b = 3;
                    gn5 gn5Var = this.Y4;
                    N = pb8Var2.N(k47Var, gn5Var == null ? null : gn5Var.f, this.O4, true, true);
                }
                float f7 = 0.0f;
                if (this.G2 != null || N == null) {
                    i = 2;
                    i2 = 4;
                    b2 = 11;
                } else {
                    b2 = 11;
                    kn m2 = N.a.m();
                    if (m2 != null) {
                        f5 = f;
                        long j = (long) (m2.h0 * 1000.0f);
                        long S = this.G2.S();
                        if (j <= 0) {
                            j = 0;
                        }
                        long j2 = S + j;
                        if (this.G2.R() == null) {
                            k47 k47Var2 = this.S4;
                            if (k47Var2 == null) {
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
                                            z5 = true;
                                        } catch (Throwable th) {
                                            z5 = true;
                                            fc4.g(th, true);
                                        }
                                        if (document != null) {
                                            fc4.b("seeking from photo viewer to animation object");
                                            m2.y(j2, bc4.G(this.U).T(document, z5) ^ z5, z5);
                                        }
                                        imageReceiver = N.a;
                                        if (imageReceiver != null) {
                                            imageReceiver.u0 = z5;
                                            imageReceiver.w0(false);
                                        }
                                        ya8Var = this.g0;
                                        if (ya8Var != null) {
                                            vv3 vv3Var = ya8Var.f;
                                            vv3Var.stopLoading();
                                            vv3Var.loadUrl("about:blank");
                                            vv3Var.destroy();
                                            ya8Var.I = 0;
                                            ya8Var.J = 0;
                                            gm.r(ya8Var.M);
                                            this.f0.removeView(this.g0);
                                            this.g0 = null;
                                        }
                                        yv1Var = this.k4;
                                        if (yv1Var != null && yv1Var.getFragmentView() != null) {
                                            this.k4.getFragmentView().invalidate();
                                        }
                                        this.k4 = null;
                                        e7aVar = this.H7;
                                        if (e7aVar != null) {
                                            e7aVar.a();
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
                                            c1(N);
                                            this.f0.setScaleX(1.0f);
                                            this.f0.setScaleY(1.0f);
                                            if (!this.v2) {
                                                w1(true);
                                            }
                                        } else {
                                            BackgroundDrawable backgroundDrawable = this.M0;
                                            if (z) {
                                                ClippingImageView[] c0 = c0(N);
                                                int i5 = 0;
                                                while (true) {
                                                    int length = c0.length;
                                                    f6 = f7;
                                                    fArr = this.j4;
                                                    if (i5 >= length) {
                                                        break;
                                                    }
                                                    ClippingImageView clippingImageView = c0[i5];
                                                    boolean z6 = N == null ? false : N.r;
                                                    clippingImageView.O = fArr;
                                                    clippingImageView.L = false;
                                                    clippingImageView.N = z6;
                                                    clippingImageView.setVisibility(0);
                                                    i5++;
                                                    f7 = f6;
                                                }
                                                AnimatorSet animatorSet = new AnimatorSet();
                                                ViewGroup.LayoutParams layoutParams = this.i0.getLayoutParams();
                                                if (N != null) {
                                                    rectF = N.a.Q0;
                                                    b3 = 5;
                                                    layoutParams.width = (int) rectF.width();
                                                    layoutParams.height = (int) rectF.height();
                                                    ImageReceiver imageReceiver2 = N.a;
                                                    int i6 = imageReceiver2.V;
                                                    kn m3 = imageReceiver2.m();
                                                    int i7 = m3 != null ? m3.d[i] : 0;
                                                    if (i7 != 0) {
                                                        i6 = i7;
                                                    }
                                                    for (ClippingImageView clippingImageView2 : c0) {
                                                        int i8 = N.a.W;
                                                        clippingImageView2.e = i6;
                                                        clippingImageView2.f = i8;
                                                        clippingImageView2.setImageBitmap(N.e);
                                                    }
                                                    i3 = 6;
                                                } else {
                                                    b3 = 5;
                                                    i3 = 6;
                                                    ImageReceiver imageReceiver3 = this.B4;
                                                    layoutParams.width = (int) imageReceiver3.N0;
                                                    layoutParams.height = (int) imageReceiver3.O0;
                                                    for (ClippingImageView clippingImageView3 : c0) {
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
                                                    float min2 = Math.min(this.D1.getMeasuredWidth(), (this.D1.getMeasuredHeight() - gm.L(64.0f)) - (!this.s ? gm.m : 0)) - (gm.L(16.0f) << 1);
                                                    min = Math.max(min2 / layoutParams.width, min2 / layoutParams.height);
                                                } else {
                                                    min = Math.min(this.h0.getMeasuredWidth() / layoutParams.width, (gm.q.y + (!this.s ? gm.m : 0)) / layoutParams.height);
                                                }
                                                float f8 = layoutParams.width;
                                                float f10 = this.Z5;
                                                float f11 = layoutParams.height * f10 * min;
                                                float measuredWidth = (this.h0.getMeasuredWidth() - ((f8 * f10) * min)) / 2.0f;
                                                float measuredHeight = this.d2 == 1 ? ((this.D1.getMeasuredHeight() - (!this.s ? gm.m : 0)) - f11) / 2.0f : ((gm.q.y + (!this.s ? gm.m : 0)) - f11) / 2.0f;
                                                int i12 = 0;
                                                while (i12 < c0.length) {
                                                    c0[i12].setLayoutParams(layoutParams);
                                                    float f12 = min;
                                                    c0[i12].setTranslationX(measuredWidth + this.W5);
                                                    c0[i12].setTranslationY(this.X5 + measuredHeight);
                                                    c0[i12].setScaleX(this.Z5 * f12);
                                                    c0[i12].setScaleY(this.Z5 * f12);
                                                    i12++;
                                                    min = f12;
                                                }
                                                if (N != null) {
                                                    int abs = (int) Math.abs(rectF.left - N.a.L0);
                                                    int abs2 = (int) Math.abs(rectF.top - N.a.M0);
                                                    if (N.a.S0) {
                                                        abs = 0;
                                                    }
                                                    int[] iArr = new int[i];
                                                    N.d.getLocationInWindow(iArr);
                                                    int i13 = iArr[1];
                                                    float f13 = N.c;
                                                    float f14 = rectF.top;
                                                    float f15 = f13 + f14;
                                                    int i14 = (int) ((i13 - f15) + N.j);
                                                    if (i14 < 0) {
                                                        i14 = 0;
                                                    }
                                                    int height = (int) ((((rectF.bottom - f14) + f15) - (N.d.getHeight() + i13)) + N.i);
                                                    if (height < 0) {
                                                        height = 0;
                                                    }
                                                    int max = Math.max(i14, abs2);
                                                    int max2 = Math.max(height, abs2);
                                                    zArr = zArr2;
                                                    fArr[0][0] = this.i0.getScaleX();
                                                    fArr[0][1] = this.i0.getScaleY();
                                                    fArr[0][2] = this.i0.getTranslationX();
                                                    fArr[0][b] = this.i0.getTranslationY();
                                                    float[] fArr2 = fArr[0];
                                                    fArr2[i2] = f6;
                                                    fArr2[b3] = f6;
                                                    fArr2[i3] = f6;
                                                    fArr2[7] = f6;
                                                    fArr2[c] = f6;
                                                    fArr2[9] = f6;
                                                    fArr2[10] = f6;
                                                    fArr2[b2] = f6;
                                                    fArr2[12] = f6;
                                                    float[] fArr3 = fArr[1];
                                                    float f16 = N.k;
                                                    fArr3[0] = f16;
                                                    fArr3[1] = f16;
                                                    fArr3[2] = (rectF.left * f16) + N.b;
                                                    fArr3[b] = (rectF.top * f16) + N.c;
                                                    float f17 = abs;
                                                    fArr3[i2] = f17 * f16;
                                                    fArr3[b3] = max * f16;
                                                    fArr3[i3] = max2 * f16;
                                                    int i15 = 0;
                                                    for (int i16 = i2; i15 < i16; i16 = 4) {
                                                        fArr[1][i15 + 7] = N.h != null ? r11[i15] : f6;
                                                        i15++;
                                                    }
                                                    float[] fArr4 = fArr[1];
                                                    float f18 = N.k;
                                                    fArr4[b2] = abs2 * f18;
                                                    fArr4[12] = f17 * f18;
                                                    ArrayList arrayList2 = new ArrayList((this.d2 == 1 ? b : (byte) 2) + c0.length + (c0.length > 1 ? 1 : 0));
                                                    int i17 = 0;
                                                    while (i17 < c0.length) {
                                                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c0[i17], so.f, 0.0f, 1.0f);
                                                        if (i17 == 0) {
                                                            b4 = b2;
                                                            ofFloat.addUpdateListener(new h88(this, b4));
                                                        } else {
                                                            b4 = b2;
                                                        }
                                                        arrayList2.add(ofFloat);
                                                        i17++;
                                                        b2 = b4;
                                                    }
                                                    if (c0.length > 1) {
                                                        arrayList2.add(ObjectAnimator.ofFloat(this.i0, (Property<ClippingImageView, Float>) View.ALPHA, f6));
                                                        c0[1].setAdditionalTranslationX(-this.t2.left);
                                                    }
                                                    arrayList2.add(ObjectAnimator.ofInt(backgroundDrawable, so.d, 0));
                                                    lb8 lb8Var2 = this.f0;
                                                    Property property = View.ALPHA;
                                                    arrayList2.add(ObjectAnimator.ofFloat(lb8Var2, (Property<lb8, Float>) property, f6));
                                                    arrayList2.add(ObjectAnimator.ofFloat(this.k0, (Property<View, Float>) property, f6));
                                                    if (this.d2 == 1) {
                                                        arrayList2.add(ObjectAnimator.ofFloat(this.D1, (Property<x68, Float>) property, f6));
                                                    }
                                                    animatorSet.playTogether(arrayList2);
                                                } else {
                                                    zArr = zArr2;
                                                    byte b8 = 12;
                                                    int i18 = gm.q.y + (!this.s ? gm.m : 0);
                                                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                                                    ofFloat2.addUpdateListener(new h88(this, b8));
                                                    ObjectAnimator ofInt = ObjectAnimator.ofInt(backgroundDrawable, so.d, 0);
                                                    ClippingImageView clippingImageView4 = this.i0;
                                                    Property property2 = View.ALPHA;
                                                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(clippingImageView4, (Property<ClippingImageView, Float>) property2, f6);
                                                    ClippingImageView clippingImageView5 = this.i0;
                                                    Property property3 = View.TRANSLATION_Y;
                                                    if (this.X5 < f6) {
                                                        i18 = -i18;
                                                    }
                                                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(clippingImageView5, (Property<ClippingImageView, Float>) property3, i18);
                                                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.f0, (Property<lb8, Float>) property2, f6);
                                                    ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.k0, (Property<View, Float>) property2, f6);
                                                    Animator[] animatorArr = new Animator[i3];
                                                    animatorArr[0] = ofFloat2;
                                                    animatorArr[1] = ofInt;
                                                    animatorArr[2] = ofFloat3;
                                                    animatorArr[b] = ofFloat4;
                                                    animatorArr[4] = ofFloat5;
                                                    animatorArr[b3] = ofFloat6;
                                                    animatorSet.playTogether(animatorArr);
                                                }
                                                pb8 pb8Var3 = this.d;
                                                if (pb8Var3 != null) {
                                                    pb8Var3.r();
                                                }
                                                this.o4 = new q88(this, N, (byte) 1);
                                                animatorSet.setDuration(200L);
                                                animatorSet.addListener(new ha8(this, b3));
                                                if (zArr[0]) {
                                                    if (N == null || N.s) {
                                                        z4 = true;
                                                    } else {
                                                        z4 = true;
                                                        N.a.v0(false, true);
                                                    }
                                                    if (!this.v2) {
                                                        w1(z4);
                                                    }
                                                    this.m4 = b;
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
                                                ofFloat7.addUpdateListener(new h88(this, (byte) 13));
                                                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(this.f0, (Property<lb8, Float>) View.SCALE_X, 0.9f);
                                                ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(this.f0, (Property<lb8, Float>) View.SCALE_Y, 0.9f);
                                                ObjectAnimator ofInt2 = ObjectAnimator.ofInt(backgroundDrawable, so.d, 0);
                                                lb8 lb8Var3 = this.f0;
                                                Property property4 = View.ALPHA;
                                                byte b9 = 2;
                                                animatorSet2.playTogether(ofFloat7, ofFloat8, ofFloat9, ofInt2, ObjectAnimator.ofFloat(lb8Var3, (Property<lb8, Float>) property4, 0.0f), ObjectAnimator.ofFloat(this.k0, (Property<View, Float>) property4, 0.0f));
                                                pb8 pb8Var4 = this.d;
                                                if (pb8Var4 != null) {
                                                    pb8Var4.r();
                                                }
                                                this.o4 = new q88(this, N, b9);
                                                animatorSet2.setDuration(200L);
                                                animatorSet2.addListener(new ha8(this, (byte) 6));
                                                if (zArr2[0]) {
                                                    if (this.v2) {
                                                        z3 = true;
                                                    } else {
                                                        z3 = true;
                                                        w1(true);
                                                    }
                                                    this.m4 = (byte) 2;
                                                    this.n4 = System.currentTimeMillis();
                                                    this.f0.setLayerType(2, null);
                                                    animatorSet2.start();
                                                    if (N != null) {
                                                        N.a.v0(z3, z3);
                                                    }
                                                }
                                            }
                                            kn knVar = this.k2;
                                            if (knVar != null) {
                                                knVar.w(this.f0);
                                                this.k2 = null;
                                                this.B4.g0(null);
                                                this.E4.a();
                                            }
                                            pb8 pb8Var5 = this.d;
                                            if (pb8Var5 != null && !pb8Var5.U()) {
                                                this.d.t();
                                            }
                                        }
                                        dVar = this.l4;
                                        if (dVar == null || dVar.getFragmentView() == null) {
                                            return;
                                        }
                                        View fragmentView2 = this.l4.getFragmentView();
                                        fragmentView2.setScaleX(f5);
                                        fragmentView2.setScaleY(f2);
                                        i22 i22Var2 = this.b2;
                                        if (i22Var2 != null) {
                                            dy0 dy0Var2 = i22Var2.c;
                                            dy0Var2.setScaleX(f3);
                                            dy0Var2.setScaleY(f4);
                                            return;
                                        }
                                        return;
                                    }
                                    gm.y0(this.D2, m);
                                }
                                z5 = true;
                                if (document != null) {
                                }
                                imageReceiver = N.a;
                                if (imageReceiver != null) {
                                }
                                ya8Var = this.g0;
                                if (ya8Var != null) {
                                }
                                yv1Var = this.k4;
                                if (yv1Var != null) {
                                    this.k4.getFragmentView().invalidate();
                                }
                                this.k4 = null;
                                e7aVar = this.H7;
                                if (e7aVar != null) {
                                }
                                ConnectionsManager.getInstance(this.U).cancelRequestsForGuid(this.c);
                                this.K = false;
                                velocityTracker = this.T6;
                                if (velocityTracker != null) {
                                }
                                if (this.J3) {
                                }
                                dVar = this.l4;
                                if (dVar == null) {
                                    return;
                                } else {
                                    return;
                                }
                            }
                            R = k47Var2.F0();
                        } else {
                            R = this.G2.R();
                        }
                        i2 = 4;
                        document = R;
                        if (this.H3) {
                        }
                        i = 2;
                        z5 = true;
                        if (document != null) {
                        }
                        imageReceiver = N.a;
                        if (imageReceiver != null) {
                        }
                        ya8Var = this.g0;
                        if (ya8Var != null) {
                        }
                        yv1Var = this.k4;
                        if (yv1Var != null) {
                        }
                        this.k4 = null;
                        e7aVar = this.H7;
                        if (e7aVar != null) {
                        }
                        ConnectionsManager.getInstance(this.U).cancelRequestsForGuid(this.c);
                        this.K = false;
                        velocityTracker = this.T6;
                        if (velocityTracker != null) {
                        }
                        if (this.J3) {
                        }
                        dVar = this.l4;
                        if (dVar == null) {
                        }
                    } else {
                        i = 2;
                        i2 = 4;
                    }
                }
                f5 = f;
                ya8Var = this.g0;
                if (ya8Var != null) {
                }
                yv1Var = this.k4;
                if (yv1Var != null) {
                }
                this.k4 = null;
                e7aVar = this.H7;
                if (e7aVar != null) {
                }
                ConnectionsManager.getInstance(this.U).cancelRequestsForGuid(this.c);
                this.K = false;
                velocityTracker = this.T6;
                if (velocityTracker != null) {
                }
                if (this.J3) {
                }
                dVar = this.l4;
                if (dVar == null) {
                }
            } else {
                f3 = 1.0f;
            }
        }
        f4 = f3;
        pb8Var = this.d;
        if (pb8Var != null) {
        }
        boolean[] zArr22 = {true};
        pb8Var2 = this.d;
        if (pb8Var2 != null) {
        }
        float f72 = 0.0f;
        if (this.G2 != null) {
        }
        i = 2;
        i2 = 4;
        b2 = 11;
        f5 = f;
        ya8Var = this.g0;
        if (ya8Var != null) {
        }
        yv1Var = this.k4;
        if (yv1Var != null) {
        }
        this.k4 = null;
        e7aVar = this.H7;
        if (e7aVar != null) {
        }
        ConnectionsManager.getInstance(this.U).cancelRequestsForGuid(this.c);
        this.K = false;
        velocityTracker = this.T6;
        if (velocityTracker != null) {
        }
        if (this.J3) {
        }
        dVar = this.l4;
        if (dVar == null) {
        }
    }

    public final int A0() {
        int measuredHeight;
        int g0 = g0();
        lb8 lb8Var = this.f0;
        return (lb8Var == null || (measuredHeight = lb8Var.getMeasuredHeight()) <= 0) ? g0 : Math.min(g0, measuredHeight);
    }

    public final void A1() {
        if (J0()) {
            return;
        }
        k47 k47Var = this.S4;
        if (k47Var == null || !k47Var.q4()) {
            z98 z98Var = this.y2;
            gm.r(z98Var);
            gm.d3(z98Var, 3000L);
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
                this.p1.setTranslationY(z ? 0.0f : -gm.L(10.0f));
                this.P0.setRotationX(z ? 1.0f : 0.0f);
                if (z) {
                    return;
                }
                this.p1.setVisibility(8);
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.p1, (Property<ub8, Float>) View.ALPHA, z ? 1.0f : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.p1, (Property<ub8, Float>) View.TRANSLATION_Y, z ? 0.0f : -gm.L(10.0f)));
            arrayList.add(ObjectAnimator.ofFloat(this.P0, (Property<CounterView, Float>) View.ROTATION_X, z ? 1.0f : 0.0f));
            AnimatorSet animatorSet = new AnimatorSet();
            this.C1 = animatorSet;
            animatorSet.playTogether(arrayList);
            if (!z) {
                this.C1.addListener(new ha8(this, (byte) 4));
            }
            this.C1.setDuration(200L);
            this.C1.start();
        }
    }

    public final void B() {
        boolean z = this.E2;
        ad8 ad8Var = this.U8;
        if (!z) {
            ad8Var.a(new t88(this, (byte) 1));
        } else {
            ad8Var.a(new bn0((byte) 20));
            gm.c3(new n88(this, (byte) 8));
        }
    }

    public final boolean B0() {
        return b0(true) != 0;
    }

    public final void B1(long j) {
        p09 y;
        ib8 ib8Var = this.W4;
        ArrayList arrayList = ib8Var.e;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                pcc pccVar = (pcc) ib8Var.e.get(i);
                if (pccVar.a == 0 && (pccVar.b & 1) != 0) {
                    View view = pccVar.I;
                    if ((view instanceof bf0) && (y = ((bf0) view).getImageReceiver().y()) != null) {
                        long j2 = this.r8;
                        y.P(j - (j2 > 0 ? j2 / 1000 : 0L));
                    }
                }
            }
        }
    }

    public final void B2() {
        boolean z;
        ndc ndcVar;
        ndc ndcVar2;
        if (this.G2 == null) {
            ya8 ya8Var = this.g0;
            if (ya8Var == null || !ya8Var.y) {
                return;
            } else {
                z = ya8Var.H;
            }
        } else {
            z = this.P3;
        }
        m();
        gm.r(this.y2);
        if (z) {
            p1();
        } else {
            if (!this.s1) {
                if (Math.abs(this.q3.c() - this.X7.getRightProgress()) < 0.01f || ((ndcVar = this.G2) != null && ndcVar.S() == this.G2.U())) {
                    D1(0.0f);
                }
                A1();
            } else if (Math.abs(this.X7.getProgress() - this.X7.getRightProgress()) < 0.01f || ((ndcVar2 = this.G2) != null && ndcVar2.S() == this.G2.U())) {
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
        x68 x68Var = new x68(this.F, this.w2);
        this.D1 = x68Var;
        x68Var.setVisibility(8);
        this.D1.a();
        this.f0.addView(this.D1, this.f0.indexOfChild(this.W7) - 1, qoe.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        this.D1.setDelegate(new e98(this));
    }

    public final void C1(long j) {
        ya8 ya8Var = this.g0;
        if (ya8Var == null || !ya8Var.y) {
            ndc ndcVar = this.G2;
            if (ndcVar != null) {
                ndcVar.o0(j);
            }
        } else {
            ya8Var.i(j);
        }
        Q2();
    }

    public final void C2() {
        View view = this.T3;
        if (view != null) {
            w98 w98Var = this.X0[0];
            int i = w98Var.h;
            if (!w98Var.p || (i != 3 && i != 4 && i != 2 && i != 1)) {
                view.setVisibility(4);
                return;
            }
            if (i == 3) {
                view.setContentDescription(jb6.M0(2131754929, "AccActionPlay"));
            } else if (i == 2) {
                view.setContentDescription(jb6.M0(2131754938, "AccActionDownload"));
            } else if (i == 1) {
                view.setContentDescription(jb6.M0(2131754941, "AccActionCancelDownload"));
            } else {
                view.setContentDescription(jb6.M0(2131754930, "AccActionPause"));
            }
            this.T3.setVisibility(0);
        }
    }

    @Override // g94
    public final void D(int i, float f, float f2, h94 h94Var) {
        if (i == 0) {
            float f3 = 1.0f - f;
            this.U0.setTranslationY(gm.L(36.0f) * f3);
            this.U0.setAlpha(f);
            this.U0.setVisibility(f > 0.0f ? 0 : 8);
            if (this.g2) {
                this.Q0.setVisibility(f < 1.0f ? 0 : 8);
                this.Q0.setAlpha(f3);
                this.Q0.setTranslationY(gm.L(36.0f) * f);
                this.T0.setVisibility(f < 1.0f ? 0 : 8);
                this.T0.setAlpha(f3);
                this.T0.setTranslationY(gm.L(36.0f) * f);
            }
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
        ndc ndcVar = this.G2;
        if (ndcVar != null) {
            ndcVar.o0((long) (f * ndcVar.U()));
            return;
        }
        ya8 ya8Var = this.g0;
        if (ya8Var != null) {
            ya8Var.i((long) (f * ya8Var.getVideoDuration()));
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
            f = Math.max(f, gm.L(48.0f));
        }
        CounterView counterView = this.P0;
        if (counterView != null && counterView.getVisibility() == 0) {
            f = Math.max(f, gm.L(100.0f));
        }
        ob8 ob8Var = this.N;
        ValueAnimator valueAnimator = ob8Var.n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            ob8Var.n = null;
        }
        ob8Var.r = f;
        ob8Var.c[0].setRightPadding((int) f);
        ob8Var.d.setRightPadding(f);
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
        SharedPreferences d1 = oc7.d1();
        int i = this.e8;
        while (i < 5) {
            Locale locale = Locale.US;
            int i2 = d1.getInt("compress_video_" + i, -1);
            if (i2 >= 0) {
                return Math.min(i2, 2);
            }
            i++;
        }
        er3 q = er3.q(this.U);
        int e = org.telegram.messenger.a.e();
        return Math.min(2, Math.round((e == 1 ? q.p().h : e == 2 ? q.o().h : q.n().h) / (100.0f / i)) - 1);
    }

    public final void E2(Object obj) {
        TLRPC.EncryptedChat encryptedChat;
        CharSequence charSequence = this.u7 ? this.v7 : obj instanceof jo6 ? ((jo6) obj).a : ((obj instanceof TLRPC.BotInlineResult) || !(obj instanceof no6)) ? null : ((no6) obj).I;
        if (TextUtils.isEmpty(charSequence)) {
            d0().setText("");
        } else {
            d0().setText(gn.cloneSpans(charSequence, 3));
        }
        qu3 editText = d0().f.getEditText();
        yv1 yv1Var = this.k4;
        editText.setAllowTextEntitiesIntersection(yv1Var != null && ((encryptedChat = yv1Var.h) == null || gm.W0(encryptedChat.layer) >= 101));
    }

    public final void F() {
        ao6 ao6Var;
        if (this.O1 != null) {
            return;
        }
        if (this.d2 == 1) {
            ao6Var = new ao6();
            ao6Var.k = this.E1.i;
        } else {
            ao6Var = this.W4.c;
        }
        ao6 ao6Var2 = ao6Var;
        int q = this.B4.q();
        int o = this.B4.o();
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap createBitmap = Bitmap.createBitmap(q, o, config);
        n1b n1bVar = this.o5;
        if (n1bVar != null && n1bVar.getSourceBitmap() != null) {
            Bitmap sourceBitmap = this.o5.getSourceBitmap();
            Canvas canvas = new Canvas(createBitmap);
            canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
            canvas.rotate(this.o5.K);
            float width = createBitmap.getWidth() / ((this.o5.K / 90) % 2 != 0 ? sourceBitmap.getHeight() : sourceBitmap.getWidth());
            RectF rectF = gm.P;
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
            RectF rectF2 = gm.P;
            rectF2.set(((-n.getWidth()) / 2.0f) * width2, ((-n.getHeight()) / 2.0f) * width2, (n.getWidth() / 2.0f) * width2, (n.getHeight() / 2.0f) * width2);
            canvas2.drawBitmap(n, (Rect) null, rectF2, new Paint(3));
        }
        ra8 ra8Var = new ra8(this, this.E, this.U, createBitmap2, createBitmap, this.B4.V, ao6Var2);
        this.O1 = ra8Var;
        ra8Var.s.setOnClickListener(new m88(this, (byte) 5));
        this.O1.w.setOnClickListener(new m88(this, (byte) 6));
        this.O1.setEraser(this.N1);
        int indexOfChild = this.f0.indexOfChild(this.t5) - 1;
        if (indexOfChild < 0) {
            indexOfChild = this.f0.getChildCount();
        }
        this.f0.addView(this.O1, indexOfChild, qoe.c(-1.0f, -1));
        this.P1 = false;
    }

    public final void F0() {
        x68 x68Var = this.D1;
        if (x68Var != null) {
            x68Var.b(null, 0, false, false, null, null, null);
            if (this.d2 != 1) {
                return;
            }
            CropAreaView cropAreaView = this.D1.b.a;
            cropAreaView.f(true, false);
            cropAreaView.setDimVisibility(true);
            cropAreaView.invalidate();
            this.D1.setVisibility(0);
            this.D1.setAlpha(1.0f);
            u43 u43Var = this.D1.b;
            u43Var.q();
            CropAreaView cropAreaView2 = u43Var.a;
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
        rcc rccVar;
        String str;
        char c;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        ao6 ao6Var;
        ao6 ao6Var2;
        TLRPC.Chat chat;
        int i3;
        yv1 yv1Var;
        un5 un5Var;
        String str2;
        long j;
        String M0;
        TextureView textureView;
        if (K0() || this.d == null || this.v2) {
            return;
        }
        byte b2 = 1;
        if (this.d2 == 1) {
            if (!z4 && (un5Var = this.p2) != null) {
                TLObject tLObject = un5Var.a;
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
                int L = gm.L(8.0f);
                he heVar = alertDialog$Builder.a;
                heVar.W0 = L;
                Context context = this.f0.getContext();
                gdb gdbVar = new gdb(context);
                ImageReceiver imageReceiver = new ImageReceiver(gdbVar);
                gdbVar.a = imageReceiver;
                ImageReceiver imageReceiver2 = new ImageReceiver(gdbVar);
                gdbVar.b = imageReceiver2;
                pc0 pc0Var = new pc0((ylb) null);
                gdbVar.e = new Path();
                pc0Var.q(z8c.h(z8c.t0).f());
                imageReceiver.U(z8c.h(z8c.t0).f(), pc0Var, null);
                imageReceiver2.U(z8c.h(z8c.t0).f(), pc0Var, null);
                Drawable drawable = context.getDrawable(R.drawable.msg_arrow_avatar);
                gdbVar.f = drawable;
                drawable.setAlpha(100);
                TLObject tLObject2 = this.p2.a;
                lb8 lb8Var = this.f0;
                x68 x68Var = this.D1;
                pc0Var.k(tLObject2);
                imageReceiver.U(tLObject2, pc0Var, null);
                gdbVar.c = lb8Var;
                gdbVar.d = x68Var;
                heVar.W = gdbVar;
                if (this.p2.c == 1) {
                    if (z8c.h(this.U).n == j) {
                        heVar.U = gm.S2(jb6.M0(2131745233, "SetUserPhotoSelfAlertMessage"));
                    } else {
                        heVar.U = gm.S2(jb6.a0(null, null, 2131745234, str2, str2));
                    }
                    M0 = this.H4 ? jb6.M0(2131745231, "SetVideo") : jb6.M0(2131745253, "SetPhoto");
                } else {
                    if (this.H4) {
                        heVar.U = gm.S2(jb6.a0(null, null, 2131744081, str2));
                    } else {
                        heVar.U = gm.S2(jb6.a0(null, null, 2131744092, str2));
                    }
                    M0 = jb6.M0(2131744090, "SuggestPhotoShort");
                }
                String str4 = M0;
                alertDialog$Builder.g(jb6.M0(2131752542, "Cancel"), new bh7((byte) 29));
                alertDialog$Builder.j(str4, new ee() { // from class: c98
                    @Override // ee
                    public final void r(he heVar2, int i4) {
                        Drawable[] drawableArr = PhotoViewer.d9;
                        PhotoViewer.this.F1(z, i, i2, z2, z3, true);
                    }
                });
                heVar.J = cmb.fh;
                heVar.U0 = true;
                heVar.j(on2.p(-15461356, nm7.h3));
                heVar.show();
                heVar.o(cmb.w0(null, cmb.dh, false));
                heVar.setOnDismissListener(new kg3(this, b2));
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
                    fc4.g(th, true);
                    return;
                }
            }
            e();
        }
        if (!z2 && (yv1Var = this.k4) != null) {
            TLRPC.Chat chat2 = yv1Var.e;
            if (yv1Var.h() != null || ((sd2.T(chat2) && chat2.megagroup) || !sd2.T(chat2))) {
                oc7.r1(this.U).W3.edit().putBoolean("silent_" + this.k4.a(), !z).commit();
            }
        }
        rcc l0 = l0();
        ArrayList arrayList = this.f7;
        if (!arrayList.isEmpty() && (i3 = this.O4) >= 0 && i3 < arrayList.size()) {
            Object obj = arrayList.get(this.O4);
            if (obj instanceof co6) {
                ((co6) obj).s = l0;
            }
        }
        yv1 yv1Var2 = this.k4;
        if (yv1Var2 != null && (chat = yv1Var2.e) != null && this.d2 != 11) {
            if (this.s1 || l0 != null) {
                if (!sd2.u(chat)) {
                    mlb.y(null, 2131749312, new c41(this.f0, this.w2), null);
                    return;
                }
            } else if (!sd2.p(chat)) {
                mlb.y(null, 2131749316, new c41(this.f0, this.w2), null);
                return;
            }
        }
        this.v2 = true;
        if (l0 != null) {
            long j3 = (long) (l0.q * 0.9f);
            if ((j3 > 2097152000 && !z8c.h(this.U).p()) || j3 > 4194304000L) {
                if (this.b2 != null) {
                    i22 i22Var = this.b2;
                    new i46(6, z8c.t0, null, i22Var.c.getContext(), i22Var.Z1).show();
                    return;
                }
                return;
            }
        }
        if (z2) {
            b = 5;
            this.d.c(l0);
        } else {
            if (this.d2 == 11) {
                Object obj2 = arrayList.get(this.O4);
                if (obj2 instanceof jo6) {
                    jo6 jo6Var = (jo6) obj2;
                    Bitmap createBitmap = Bitmap.createBitmap(512, 512, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    Path path = new Path();
                    RectF rectF = new RectF();
                    rectF.set(0.0f, 0.0f, createBitmap.getWidth(), createBitmap.getHeight());
                    float width = createBitmap.getWidth() / 8;
                    path.addRoundRect(rectF, width, width, Path.Direction.CW);
                    canvas.clipPath(path);
                    int i0 = i0(this.t4);
                    g0();
                    float L2 = i0 - gm.L(20.0f);
                    n1b n1bVar = this.o5;
                    if (n1bVar == null || !n1bVar.j0 || n1bVar.getSourceBitmap() == null) {
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
                            f6 = gm.R1(0.0f, this.f6, this.k6);
                            c = 5;
                            f2 = gm.R1(this.Z5, this.d6, this.k6);
                            f3 = gm.R1(this.a6, this.e6, this.k6);
                            f4 = gm.R1(this.X5, this.c6, this.k6);
                            f5 = gm.R1(this.W5, this.b6, this.k6);
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
                        int i02 = i0(this.t4);
                        int g0 = g0();
                        matrix.preTranslate(f5, f4 + 0.0f);
                        matrix.preScale(f2, f2);
                        matrix.preRotate(f3);
                        int q = this.B4.q();
                        int o = this.B4.o();
                        float f8 = i02;
                        float f10 = g0;
                        float min = Math.min(f8 / q, f10 / o);
                        n43 n43Var = this.E1;
                        int i4 = n43Var.i;
                        if (i4 == 90 || i4 == 270) {
                            o = q;
                            q = o;
                        }
                        float f11 = n43Var.j;
                        float f12 = n43Var.k;
                        float f13 = q;
                        float f14 = o;
                        float f15 = f8 / ((int) ((((1.0f - f11) * 0.0f) + f11) * f13));
                        float f16 = (int) ((((1.0f - f12) * 0.0f) + f12) * f14);
                        if (f15 * f16 > f10) {
                            f15 = f10 / f16;
                        }
                        int i5 = this.d2;
                        ib8 ib8Var = this.W4;
                        if (i5 == 1 || n43Var.a) {
                            TextureView textureView2 = this.C2;
                            if (textureView2 != null) {
                                ao6 ao6Var3 = ib8Var.c;
                                textureView2.setScaleX((ao6Var3 == null || !ao6Var3.l) ? 1.0f : -1.0f);
                                kb8 kb8Var = this.F2;
                                if (kb8Var != null) {
                                    kb8Var.setScaleX(this.C2.getScaleX());
                                }
                            }
                            ao6 ao6Var4 = ib8Var.c;
                            float f17 = ao6Var4 != null ? ao6Var4.c : 1.0f;
                            float A = ((f15 / min) / td4.A(f17, 1.0f, 0.0f, 1.0f)) * f17;
                            matrix.preTranslate(n43Var.d * 1.0f, n43Var.e * 1.0f);
                            matrix.preScale(A, A);
                            matrix.preTranslate(mlb.C(n43Var.b, f13, min, 1.0f), mlb.C(n43Var.c, f14, min, 1.0f));
                            float f18 = n43Var.g + i4;
                            if (f18 > 180.0f) {
                                f18 -= 360.0f;
                            }
                            matrix.preRotate(f18);
                        }
                        if (!arrayList.isEmpty() && (ao6Var2 = ib8Var.c) != null && ao6Var2.l) {
                            matrix.preScale(-1.0f, 1.0f);
                        }
                        if (f6 > 0.0f) {
                            matrix.preScale(1.0f - (f6 * f), 1.0f);
                            matrix.preSkew(0.0f, td4.z(1.0f, f6, 4.0f * f6, 0.25f));
                        }
                        ImageReceiver imageReceiver4 = this.B4;
                        matrix.preTranslate((-imageReceiver4.N0) / f, (-imageReceiver4.O0) / f);
                        ImageReceiver imageReceiver5 = this.B4;
                        matrix.preScale(imageReceiver5.N0, imageReceiver5.O0);
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = jo6Var.p;
                        int size = arrayList3.size();
                        int i6 = 0;
                        String str5 = null;
                        while (i6 < size) {
                            Object obj3 = arrayList3.get(i6);
                            i6++;
                            pcc a = ((pcc) obj3).a();
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
                            if (jo6Var.w && (ao6Var = jo6Var.A) != null) {
                                a.e = (float) (a.e - ((ao6Var.k / 180.0f) * 3.141592653589793d));
                            }
                            a.e = (float) (a.e - ((this.a6 / 180.0f) * 3.141592653589793d));
                            arrayList2.add(a);
                            TLRPC.Document document = a.B;
                            if (document != null && str5 == null) {
                                str5 = k47.V(document, null, null);
                            }
                            arrayList3 = arrayList4;
                            matrix = matrix2;
                            size = i7;
                        }
                        rcc rccVar2 = new rcc();
                        rccVar2.I = true;
                        rccVar2.k = 512;
                        rccVar2.h = 512;
                        rccVar2.l = 512;
                        rccVar2.i = 512;
                        rccVar2.G = arrayList2;
                        long k = Utilities.k(jo6Var.t, 2999L, 800L);
                        rccVar2.r = k;
                        rccVar2.v = k;
                        rccVar2.m = 200000;
                        rccVar2.n = 30;
                        z5 = true;
                        rccVar2.N = true;
                        rccVar2.q = 262144L;
                        rccVar = rccVar2;
                        str = str5;
                    } else {
                        z5 = true;
                        rccVar = null;
                        str = null;
                    }
                    TLRPC.PhotoSize V = fn5.V(createBitmap, Bitmap.CompressFormat.WEBP, 512.0f, 512.0f, 100);
                    bc4.G(z8c.t0);
                    String file = bc4.J(V, "webp", z5, z5).toString();
                    if (rccVar != null) {
                        rccVar.o = file;
                    }
                    ArrayList arrayList5 = this.q5;
                    if (arrayList5 == null) {
                        arrayList5 = new ArrayList();
                        this.q5 = arrayList5;
                    }
                    if (arrayList5.isEmpty()) {
                        String str6 = this.o5.d0;
                        if (str6 == null || gw3.g(str6) == null) {
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
                    hx2 e = hx2.e();
                    n1b n1bVar2 = this.o5;
                    ArrayList arrayList7 = this.q5;
                    da8 da8Var = new da8(this, file, rccVar, jo6Var, z, i, i2, z3);
                    dx2 dx2Var = e.U;
                    Activity W = gm.W(n1bVar2.getContext());
                    if (W != null) {
                        e.l(W);
                        e.k(da8Var);
                        t5a t5aVar = new t5a();
                        t5aVar.a = file;
                        t5aVar.g = rccVar;
                        e.o = arrayList7;
                        e.i(null, t5aVar, null, null, null, 3, false, null, new r63(), 0);
                        gm.r(dx2Var);
                        gm.d3(dx2Var, 16L);
                        return;
                    }
                    return;
                }
            }
            b = 5;
            this.d.M(this.O4, l0, z, i, i2, z3);
        }
        if (this.P) {
            if (this.Q) {
                gm.d3(new b98(this, b), 200L);
            } else {
                A(false, false);
            }
        }
    }

    public final void F2() {
        int i;
        k47 k47Var;
        TLRPC.Message message;
        ArrayList arrayList = this.X6;
        if (arrayList.isEmpty() || (i = this.P4) < 0 || i >= arrayList.size() || (k47Var = (k47) arrayList.get(this.P4)) == null) {
            return;
        }
        if (!this.m5 || (message = k47Var.k) == null || message.translatedText == null || !TextUtils.equals(message.translatedToLanguage, s1c.G0())) {
            J1(k47Var, k47Var.z, this.m5, true);
        } else {
            J1(k47Var, s1(k47Var), false, true);
        }
    }

    public final void G() {
        int q;
        int o;
        ao6 ao6Var;
        if (this.M1 == null) {
            TextureView textureView = this.C2;
            if (textureView != null) {
                ncc nccVar = (ncc) textureView;
                q = nccVar.getVideoWidth();
                o = nccVar.getVideoHeight();
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
            ib8 ib8Var = this.W4;
            if (i == 1) {
                ao6Var = new ao6();
                ao6Var.k = this.E1.i;
            } else {
                ao6Var = ib8Var.c;
            }
            ao6 ao6Var2 = ao6Var;
            mx5 mx5Var = new mx5(this.h0, false, new t88(this, (byte) 3));
            mx5Var.f = true;
            mx5Var.g = true;
            this.L1 = mx5Var;
            mx5Var.b(this.t4 != 3);
            Activity activity = this.E;
            sa8 sa8Var = new sa8(this, activity, activity, this.U, bitmap2, this.s1 ? null : this.B4.n(), this.B4.V, ib8Var.e, ao6Var2, new n88(this, (byte) 10), this.w2);
            this.M1 = sa8Var;
            im0 c = this.Z.c(sa8Var.S0, null, false);
            c.p(qqd.i(this.w2));
            sa8Var.setBlurredBackgroundDrawableForTools(c);
            this.f0.addView(this.M1.getView(), qoe.c(-1.0f, -1));
            this.M1.setOnDoneButtonClickedListener(new n88(this, (byte) 11));
            this.M1.getCancelView().setOnClickListener(new m88(this, (byte) 9));
            this.M1.v0(gm.L(126.0f));
            this.M1.setOffsetTranslationX(-gm.L(12.0f));
        }
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
            ya8 ya8Var = new ya8(this, this, this.E, this.w0);
            this.g0 = ya8Var;
            TLRPC.WebPage webPage = k47.n1(this.S4.k).webpage;
            ya8Var.E = webPage;
            ya8Var.x = tvc.e(webPage.embed_url);
            String str = webPage.url;
            ya8Var.requestLayout();
            try {
                if (ya8Var.x != null) {
                    ya8Var.h.setVisibility(0);
                    ya8Var.y = true;
                    ya8Var.f.addJavascriptInterface(new ac8(ya8Var), "YoutubeProxy");
                    if (str != null) {
                        try {
                            Uri parse = Uri.parse(str);
                            valueOf = i > 0 ? String.valueOf(i) : null;
                            if (valueOf == null && (valueOf = parse.getQueryParameter("t")) == null) {
                                valueOf = parse.getQueryParameter("time_continue");
                            }
                        } catch (Exception e) {
                            fc4.g(e, true);
                        }
                        if (valueOf != null) {
                            if (valueOf.contains("m")) {
                                String[] split = valueOf.split("m");
                                intValue = (Utilities.z(split[0]).intValue() * 60) + Utilities.z(split[1]).intValue();
                            } else {
                                intValue = Utilities.z(valueOf).intValue();
                            }
                            open = ya8Var.getContext().getAssets().open("youtube_embed.html");
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
                            ya8Var.f.loadDataWithBaseURL("https://messenger.telegram.org/", String.format(Locale.US, byteArrayOutputStream.toString("UTF-8"), ya8Var.x, Integer.valueOf(intValue)), "text/html", "UTF-8", "https://youtube.com");
                        }
                    }
                    intValue = 0;
                    open = ya8Var.getContext().getAssets().open("youtube_embed.html");
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
                    ya8Var.f.loadDataWithBaseURL("https://messenger.telegram.org/", String.format(Locale.US, byteArrayOutputStream.toString("UTF-8"), ya8Var.x, Integer.valueOf(intValue)), "text/html", "UTF-8", "https://youtube.com");
                } else {
                    HashMap hashMap = new HashMap();
                    hashMap.put("Referer", "messenger.telegram.org");
                    ya8Var.f.loadUrl(webPage.embed_url, hashMap);
                }
            } catch (Exception e2) {
                fc4.g(e2, true);
            }
            ya8Var.r.setEnabled(false);
            ya8Var.r.setAlpha(0.5f);
            ya8Var.n.setVisibility(0);
            if (ya8Var.x != null) {
                ya8Var.h.setVisibility(0);
            }
            ya8Var.f.setVisibility(0);
            ya8Var.f.setKeepScreenOn(true);
            if (ya8Var.x != null && "disabled".equals(oc7.r1(ya8Var.a).l4.I0.f)) {
                ya8Var.r.setVisibility(8);
            }
            this.g0.setPlaybackSpeed(this.u1);
            this.f0.addView(this.g0, 0, qoe.c(-1.0f, -1));
            if (this.g0.y) {
                Y1(true, true);
            }
            vdc vdcVar = this.q3;
            vdcVar.F = null;
            vdcVar.J = -1;
            vdcVar.I = 0.0f;
            StaticLayout[] staticLayoutArr = vdcVar.K;
            if (staticLayoutArr != null) {
                staticLayoutArr[1] = null;
                staticLayoutArr[0] = null;
            }
            vdcVar.G = null;
            vdcVar.H = -1L;
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

    public final void G1(un5 un5Var) {
        String str;
        int i;
        TLRPC.User user;
        this.p2 = un5Var;
        if (this.d2 == 1) {
            if (T2()) {
                this.o0.setVisibility(0);
                this.T0.setVisibility(8);
            } else {
                this.T0.setVisibility(0);
                this.o0.setVisibility(8);
            }
            if (un5Var == null || (user = un5Var.b) == null || un5Var.c != 1 || !this.p2.d) {
                this.D1.setSubtitle(null);
            } else {
                boolean z = un5Var.e;
                x68 x68Var = this.D1;
                String str2 = user.first_name;
                if (z) {
                    x68Var.setSubtitle(jb6.a0(null, null, 2131745246, str2));
                } else {
                    x68Var.setSubtitle(jb6.a0(null, null, 2131745247, str2));
                }
            }
        }
        if (un5Var != null) {
            if (un5Var.c == 2) {
                if (un5Var.e) {
                    str = "SuggestVideo";
                    i = 2131744082;
                } else {
                    str = "SuggestPhoto";
                    i = 2131744093;
                }
                X1(jb6.M0(i, str));
            }
            if (un5Var.e) {
                this.Y7.setText(jb6.M0(2131745269, "SetCover"));
            }
            this.G.setBackground(null);
            this.G.setElevation(2.0f);
        }
    }

    public final void G2() {
        int i = cmb.pg;
        int y0 = y0(i);
        vi3 vi3Var = this.T0;
        if (vi3Var != null) {
            vi3Var.k();
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
        kb2 kb2Var = this.V0;
        if (kb2Var != null) {
            ((TextView) kb2Var.b).setTextColor(y0);
        }
        kb2 kb2Var2 = this.U7;
        if (kb2Var2 != null) {
            ((TextView) kb2Var2.b).setTextColor(y0);
        }
        sa8 sa8Var = this.M1;
        if (sa8Var != null) {
            sa8Var.updateColors();
        }
        n78 n78Var = this.J1;
        if (n78Var != null) {
            ImageView imageView6 = n78Var.C0;
            ImageView imageView7 = n78Var.B0;
            ImageView imageView8 = n78Var.A0;
            ylb ylbVar = n78Var.J0;
            TextView textView = n78Var.h0;
            if (textView != null) {
                textView.setTextColor(cmb.v0(i, ylbVar));
            }
            if (imageView8 != null && imageView8.getColorFilter() != null) {
                imageView8.setColorFilter(new PorterDuffColorFilter(cmb.v0(i, ylbVar), mode));
            }
            if (imageView7 != null && imageView7.getColorFilter() != null) {
                imageView7.setColorFilter(new PorterDuffColorFilter(cmb.v0(i, ylbVar), mode));
            }
            if (imageView6 != null && imageView6.getColorFilter() != null) {
                imageView6.setColorFilter(new PorterDuffColorFilter(cmb.v0(i, ylbVar), mode));
            }
            n78Var.i();
        }
        aa8 aa8Var = this.V1;
        if (aa8Var != null) {
            aa8Var.H(this.w2);
        }
        ba8 ba8Var = this.W1;
        if (ba8Var != null) {
            ba8Var.H(this.w2);
        }
        x98 x98Var = this.X7;
        if (x98Var != null) {
            x98Var.invalidate();
        }
        ub8 ub8Var = this.p1;
        if (ub8Var != null) {
            int childCount = ub8Var.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = this.p1.getChildAt(i2);
                if (childAt instanceof a88) {
                    ((a88) childAt).c.b(cmb.V9, cmb.W9, cmb.U9);
                }
            }
        }
        q98 q98Var = this.U3;
        if (q98Var != null) {
            q98Var.R0(true);
        }
    }

    public final void H() {
        vb8 vb8Var = new vb8(this.f0.getContext(), this);
        this.i3 = vb8Var;
        this.f0.addView(vb8Var, qoe.e(-1, 48, 83));
        byte b = 26;
        k44 k44Var = new k44(this, b);
        ia8 ia8Var = new ia8(this, k44Var);
        sb sbVar = new sb(b, this.f0.getContext(), this);
        this.r3 = sbVar;
        sbVar.setAccessibilityDelegate(ia8Var);
        this.r3.setImportantForAccessibility(1);
        this.i3.addView(this.r3, qoe.c(-1.0f, -1));
        vdc vdcVar = new vdc(this.r3);
        this.q3 = vdcVar;
        vdcVar.z = gm.L(2.0f);
        vdc vdcVar2 = this.q3;
        vdcVar2.k = 872415231;
        vdcVar2.l = 872415231;
        vdcVar2.m = -1;
        vdcVar2.n = -1;
        vdcVar2.A = 1509949439;
        vdcVar2.j = k44Var;
        ka8 ka8Var = new ka8(this, this.f0.getContext(), new u88(this));
        this.s3 = ka8Var;
        ka8Var.setAlpha(0.0f);
        this.f0.addView(this.s3, qoe.d(-2, -2.0f, 83, 0.0f, 0.0f, 0.0f, 58.0f));
        lka lkaVar = new lka(this.f0.getContext());
        this.o3 = lkaVar;
        lkaVar.setTextColor(-1);
        this.o3.setGravity(53);
        this.o3.setTextSize(14);
        this.o3.setImportantForAccessibility(2);
        this.i3.addView(this.o3, qoe.d(-2, -2.0f, 53, 0.0f, 15.0f, 12.0f, 0.0f));
        ImageView imageView = new ImageView(this.f0.getContext());
        this.p3 = imageView;
        imageView.setImageResource(R.drawable.msg_minvideo);
        this.p3.setContentDescription(jb6.M0(2131754723, "AccExitFullscreen"));
        this.p3.setScaleType(ImageView.ScaleType.CENTER);
        this.p3.setBackground(cmb.f0(1090519039, 1, -1));
        this.p3.setVisibility(4);
        this.i3.addView(this.p3, qoe.e(48, 48, 53));
        this.p3.setOnClickListener(new y88(this, (byte) 6));
    }

    public final void H0() {
        n1b n1bVar = this.o5;
        if (n1bVar == null || !n1bVar.W) {
            g79 g79Var = this.a0;
            if (g79Var != null) {
                Iterator it = g79Var.iterator();
                while (it.hasNext()) {
                    gm0 gm0Var = ((im0) it.next()).h0;
                    if (gm0Var != null) {
                        gm0Var.h = true;
                    }
                }
            }
            g79 g79Var2 = this.b0;
            if (g79Var2 != null) {
                Iterator it2 = g79Var2.iterator();
                while (it2.hasNext()) {
                    ((View) it2.next()).invalidate();
                }
            }
            aa8 aa8Var = this.V1;
            if (aa8Var != null) {
                aa8Var.m();
            }
            ba8 ba8Var = this.W1;
            if (ba8Var != null) {
                ba8Var.m();
            }
            db8 db8Var = this.s5;
            if (db8Var != null) {
                db8Var.invalidate();
            }
            db8 db8Var2 = this.u5;
            if (db8Var2 != null) {
                db8Var2.invalidate();
            }
            db8 db8Var3 = this.v5;
            if (db8Var3 != null) {
                db8Var3.invalidate();
            }
            db8 db8Var4 = this.w5;
            if (db8Var4 != null) {
                db8Var4.invalidate();
            }
            db8 db8Var5 = this.x5;
            if (db8Var5 != null) {
                db8Var5.invalidate();
            }
            x98 x98Var = this.X7;
            if (x98Var != null && x98Var.f0) {
                x98Var.invalidate();
            }
            lb8 lb8Var = this.f0;
            if (lb8Var != null) {
                lb8Var.invalidate();
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
        lb8 lb8Var;
        if (this.d2 == 1 || (lb8Var = this.f0) == null) {
            return;
        }
        this.f0.setSystemUiVisibility(!z ? (lb8Var.getPaddingLeft() > 0 || this.f0.getPaddingRight() > 0) ? 5894 : 1796 : 1792);
    }

    public final void I(lo6 lo6Var) {
        xm0 xm0Var;
        if (this.C2 == null) {
            byte b = 0;
            oa8 oa8Var = new oa8(b, this.E, this);
            this.z2 = oa8Var;
            oa8Var.setWillNotDraw(false);
            this.z2.setVisibility(4);
            this.f0.addView(this.z2, 0, qoe.e(-1, -1, 17));
            this.E2 = false;
            if (!this.f7.isEmpty()) {
                ncc nccVar = new ncc(this.G2, this.E);
                this.c0.e();
                sm0 sm0Var = this.c0;
                nccVar.s = sm0Var;
                uf4 uf4Var = nccVar.b;
                if (uf4Var != null && (xm0Var = uf4Var.J) != null) {
                    sm0 sm0Var2 = xm0Var.t;
                    if (sm0Var2 != null && sm0Var2.m != null) {
                        sm0Var2.m = null;
                    }
                    xm0Var.t = sm0Var;
                    if (sm0Var != null && sm0Var.m != xm0Var) {
                        sm0Var.m = xm0Var;
                        sm0Var.d();
                    }
                }
                if (lo6Var != null) {
                    nccVar.setDelegate(new p88(lo6Var, b));
                }
                this.C2 = nccVar;
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
                this.z2.addView(this.C2, qoe.e(-1, -1, 17));
            } else {
                this.z2.addView(this.D2, qoe.e(-1, -1, 17));
            }
            kb8 kb8Var = new kb8(this.E, this);
            this.F2 = kb8Var;
            kb8Var.setPivotX(0.0f);
            this.F2.setPivotY(0.0f);
            this.F2.setScaleType(ImageView.ScaleType.FIT_XY);
            this.z2.addView(this.F2, qoe.e(-1, -1, 17));
            if (this.d2 == 1) {
                View view = new View(this.E);
                this.A2 = view;
                view.setBackgroundColor(-1);
                this.A2.setAlpha(0.0f);
                this.z2.addView(this.A2, qoe.e(-1, -1, 17));
            }
        }
    }

    public final void I0() {
        ad8 ad8Var = this.U8;
        if (ad8Var != null) {
            ad8Var.d();
        }
    }

    public final void I1() {
        ncc nccVar;
        if (this.h2 || this.d2 != 1) {
            return;
        }
        if (!this.s1 || ((nccVar = (ncc) this.C2) != null && nccVar.getVideoWidth() > 0 && nccVar.getVideoHeight() > 0)) {
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
            this.D1.b(bitmap, i2, false, false, this.E1, this.s1 ? (ncc) this.C2 : null, this.W4.c);
        }
    }

    public final void I2(float f) {
        oa8 oa8Var = this.z2;
        if (oa8Var != null && oa8Var.getVisibility() == 0 && this.H3) {
            View view = this.E2 ? this.D2 : this.C2;
            f *= Math.min(i0(this.t4) / view.getMeasuredWidth(), A0() / view.getMeasuredHeight());
        }
        ImageReceiver imageReceiver = this.B4;
        float f2 = imageReceiver.N0;
        float f3 = imageReceiver.O0;
        ao6 ao6Var = this.W4.c;
        if (ao6Var != null) {
            f2 *= ao6Var.e;
            f3 *= ao6Var.f;
        }
        int i0 = this.d2 == 11 ? (int) (f2 * f) : ((int) ((f2 * f) - i0(this.t4))) / 2;
        int g0 = this.d2 == 11 ? (int) (f3 * f) : ((int) ((f3 * f) - g0())) / 2;
        if (i0 > 0) {
            this.D6 = -i0;
            this.E6 = i0;
        } else {
            this.E6 = 0.0f;
            this.D6 = 0.0f;
        }
        if (g0 > 0) {
            this.F6 = -g0;
            this.G6 = g0;
        } else {
            this.G6 = 0.0f;
            this.F6 = 0.0f;
        }
        sa8 sa8Var = this.M1;
        if (sa8Var != null) {
            boolean z = f <= 1.1f;
            LinearLayout linearLayout = sa8Var.n1;
            boolean z2 = !z;
            if (sa8Var.S1 != z2) {
                sa8Var.S1 = z2;
                linearLayout.animate().cancel();
                wi8.t(linearLayout.animate().alpha(z ? 0.0f : 1.0f), d53.h, 240L);
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
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, so.g, 0.0f, 1.0f));
        this.o6.setDuration(250L);
        this.o6.setInterpolator(d53.f);
        this.o6.addListener(new ha8(this, objArr == true ? 1 : 0));
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
            fc4.g(e, true);
            return false;
        }
    }

    public final void J1(k47 k47Var, CharSequence charSequence, boolean z, boolean z2) {
        int i;
        boolean z3;
        boolean z4;
        TLRPC.Message message;
        CharSequence cloneSpans = gn.cloneSpans(charSequence, 3);
        f2(this.Q4, z2);
        if (this.Q4 || this.d2 == 1) {
            d0().setText(cloneSpans);
            this.R1.setVisibility(8);
            return;
        }
        this.V1.setVisibility(8);
        this.W1.setVisibility(8);
        byte b = 0;
        if (!this.j2) {
            if (this.U1 == null) {
                FrameLayout frameLayout = new FrameLayout(this.f0.getContext());
                this.a2 = frameLayout;
                this.R1.setContainer(frameLayout);
                ta8 ta8Var = new ta8(this, this.f0.getContext(), this.R1, this.a2, (byte) 0);
                this.U1 = ta8Var;
                this.R1.setScrollView(ta8Var);
                this.a2.setClipChildren(false);
                this.U1.addView(this.a2, new ViewGroup.LayoutParams(-1, -2));
                this.f0.addView(this.U1, qoe.e(-1, -1, 80));
            }
            if (this.R1.getParent() != this.a2) {
                this.Q0.removeView(this.R1);
                this.R1.setMeasureAllChildren(true);
                this.a2.addView(this.R1, -1, -2);
                this.s3.bringToFront();
            }
            if (k47Var == null || !k47Var.q4()) {
                FrameLayout frameLayout2 = this.S1;
                if (frameLayout2 != null) {
                    gm.B2(frameLayout2);
                    this.R1.setPadding(0, 0, 0, 0);
                }
            } else {
                if (this.S1 == null) {
                    FrameLayout frameLayout3 = new FrameLayout(this.F);
                    this.S1 = frameLayout3;
                    frameLayout3.setBackground(cmb.Z(620756991, 369098751, 8, 8));
                    rve.b(this.S1, 0.05f, 1.25f);
                    TextView textView = new TextView(this.F);
                    this.T1 = textView;
                    textView.setTextSize(1, 14.0f);
                    this.T1.setTextColor(-1);
                    this.T1.setTypeface(gm.o());
                    this.S1.addView(this.T1, qoe.e(-2, -2, 17));
                    this.S1.setOnClickListener(new y88(this, (byte) 7));
                }
                gm.B2(this.S1);
                this.T1.setText(k47Var.Y0);
                this.a2.addView(this.S1, qoe.d(-1, 44.0f, 87, 16.0f, 0.0f, 16.0f, 12.0f));
                this.R1.setPadding(0, 0, 0, gm.L(64.0f));
                this.S1.bringToFront();
            }
        } else if (this.R1.getParent() != this.Q0) {
            FrameLayout frameLayout4 = this.a2;
            if (frameLayout4 != null) {
                frameLayout4.removeView(this.R1);
            }
            this.R1.setMeasureAllChildren(false);
            this.Q0.addView(this.R1, qoe.d(-1, -2.0f, 83, 0.0f, 0.0f, 76.0f, 48.0f));
        }
        boolean isEmpty = TextUtils.isEmpty(cloneSpans);
        boolean isEmpty2 = TextUtils.isEmpty(this.R1.getCurrentView().getText());
        hb8 hb8Var = this.R1;
        TextView nextView = z2 ? hb8Var.getNextView() : hb8Var.getCurrentView();
        if (!this.s1) {
            int maxLines = nextView.getMaxLines();
            if (maxLines == 1) {
                this.R1.getCurrentView().setSingleLine(false);
                this.R1.getNextView().setSingleLine(false);
            }
            if (this.j2) {
                Point point = gm.q;
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
        boolean z5 = this.j2;
        this.n2 = !z5 && z2 && isEmpty;
        if (!z5) {
            this.U1.l0 = false;
        }
        if (z2) {
            TransitionManager.endTransitions(z5 ? this.Q0 : this.U1);
            if (this.j2) {
                TransitionSet transitionSet = new TransitionSet();
                transitionSet.setOrdering(0);
                transitionSet.addTransition(new ChangeBounds());
                transitionSet.addTransition(new Fade(2));
                transitionSet.addTransition(new Fade(1));
                transitionSet.setDuration(200L);
                TransitionManager.beginDelayedTransition(this.Q0, transitionSet);
            } else {
                TransitionSet duration = new TransitionSet().addTransition(new ua8(this, isEmpty2, isEmpty, (byte) 1)).addTransition(new ua8(this, isEmpty2, isEmpty, (byte) 0)).setDuration(200L);
                if (!isEmpty2) {
                    this.U1.l0 = true;
                    duration.addTransition(new wa8(this, b));
                } else if (!isEmpty) {
                    duration.addTarget((View) this.R1);
                }
                TransitionManager.beginDelayedTransition(this.U1, duration);
            }
            z3 = true;
        } else {
            this.R1.getCurrentView().setText((CharSequence) null);
            ta8 ta8Var2 = this.U1;
            if (ta8Var2 != null) {
                ta8Var2.scrollTo(0, 0);
            }
            z3 = false;
        }
        if (isEmpty) {
            z4 = true;
            boolean z6 = this.j2;
            hb8 hb8Var2 = this.R1;
            if (z6) {
                hb8Var2.a(jb6.M0(2131754451, "AddCaption"), z2, false);
                this.R1.getCurrentView().setTextColor(-1291845633);
                this.R1.setTag("empty");
                this.R1.setVisibility(0);
            } else {
                hb8Var2.a(null, z2, false);
                this.R1.getCurrentView().setTextColor(-1);
                this.R1.b(4, !z3 || isEmpty2);
                this.R1.setTag(null);
            }
        } else {
            cmb.J(null, true);
            if (k47Var == null || !this.m5 || (message = k47Var.k) == null || message.translatedText == null || !TextUtils.equals(message.translatedToLanguage, s1c.G0())) {
                if (k47Var == null || k47Var.k.entities.isEmpty()) {
                    cloneSpans = gw3.m(new SpannableStringBuilder(cloneSpans), nextView.getPaint().getFontMetricsInt(), false, null, 0);
                } else {
                    SpannableString spannableString = new SpannableString(cloneSpans);
                    k47Var.c(spannableString, true, false);
                    if (k47.K4(k47Var.k)) {
                        k47.h(k47Var.O3(), spannableString, false, 3, (int) k47Var.L0(), false);
                    }
                    cloneSpans = gw3.m(spannableString, nextView.getPaint().getFontMetricsInt(), false, null, 0);
                }
            }
            if (k47Var != null && k47Var.q4()) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (!TextUtils.isEmpty(k47Var.S0)) {
                    spannableStringBuilder.append((CharSequence) k47Var.S0);
                    spannableStringBuilder.setSpan(new z5c(gm.o()), 0, spannableStringBuilder.length(), 33);
                    spannableStringBuilder.setSpan(new bb8(b), 0, spannableStringBuilder.length(), 33);
                    spannableStringBuilder.append((CharSequence) "\n");
                }
                spannableStringBuilder.append(cloneSpans);
                cloneSpans = spannableStringBuilder;
            }
            this.R1.setTag(cloneSpans);
            try {
                this.R1.a(cloneSpans, z2, this.q2 != z);
                ta8 ta8Var3 = this.U1;
                if (ta8Var3 != null) {
                    ta8Var3.H(ta8Var3.getWidth(), ta8Var3.getHeight());
                }
                z4 = true;
            } catch (Exception e) {
                z4 = true;
                fc4.g(e, true);
            }
            nextView.setScrollY(0);
            nextView.setTextColor(-1);
            this.R1.setVisibility((!this.K || (this.s1 && this.Q0.getVisibility() != 0 && this.i7 == null)) ? false : z4 ? 0 : 4);
        }
        if (this.R1.getCurrentView() instanceof gb8) {
            ((gb8) this.R1.getCurrentView()).setLoading(z);
        }
        this.q2 = (isEmpty || !z) ? false : z4;
    }

    public final void J2() {
        ndc ndcVar = this.G2;
        if (ndcVar != null) {
            ndcVar.s0(fp.w() || this.r);
        }
        boolean z = this.p8;
        c7 c7Var = this.f1;
        if (!z) {
            c7Var.setEnabled(false);
            this.f1.setClickable(false);
            this.f1.animate().alpha(0.5f).setDuration(180L).start();
            this.X7.setMode(0);
            return;
        }
        c7Var.setEnabled(true);
        this.f1.setClickable(true);
        this.f1.animate().alpha(1.0f).setDuration(180L).start();
        if (!this.r) {
            this.N.a(this.I8, true);
            kc2 kc2Var = this.e1;
            kc2Var.c = false;
            kc2Var.invalidateSelf();
            if (this.k1.getTag() != null) {
                this.k1.setAlpha(1.0f);
                this.k1.setEnabled(true);
            }
            this.X7.setMaxProgressDiff(1.0f);
            this.X7.setMode(0);
            return;
        }
        if (this.e4 == null) {
            this.N.a(jb6.M0(2131745013, "SoundMuted"), true);
        }
        kc2 kc2Var2 = this.e1;
        kc2Var2.c = true;
        kc2Var2.invalidateSelf();
        if (this.k1.getTag() != null) {
            this.k1.setAlpha(0.5f);
            this.k1.setEnabled(false);
        }
        int i = this.d2;
        x98 x98Var = this.X7;
        if (i != 1) {
            x98Var.setMaxProgressDiff(1.0f);
            this.X7.setMode(0);
        } else {
            x98Var.setMaxProgressDiff(9600.0f / this.n8);
            this.X7.setMode(1);
            P2();
        }
    }

    public final boolean K(float f, boolean z, Runnable runnable) {
        x68 x68Var;
        if (this.o6 == null && (x68Var = this.D1) != null) {
            x68Var.b.i();
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
                    ao6 ao6Var = this.W4.c;
                    if (ao6Var != null) {
                        q = (int) (q * ao6Var.e);
                        o = (int) (o * ao6Var.f);
                    }
                    float f2 = q;
                    float f3 = o;
                    float min = Math.min(i0(1) / f2, f0(1, false) / f3);
                    this.d6 = (Math.abs((f / 90.0f) % 2.0f) == 1.0f ? Math.min(i0(1) / f3, f0(1, false) / f2) : min) / min;
                }
            }
            if (this.d2 == 11) {
                this.Z5 = z1(false) * this.Z5;
                this.d6 = z1(false) * this.d6;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new dz1(this, f, this.D1.c.getRotation(), (byte) 4));
            this.o6.playTogether(ObjectAnimator.ofFloat(this, so.g, 0.0f, 1.0f), ofFloat);
            this.o6.setDuration(250L);
            this.o6.setInterpolator(d53.f);
            this.o6.addListener(new ok4(this, f, runnable, (byte) 3));
            this.o6.start();
            if (Math.abs(this.D1.b.getStateOrientation() + f) > 0.01f) {
                return true;
            }
        }
        return false;
    }

    public final boolean K0() {
        tc1 d0 = d0();
        if (d0 != null) {
            return d0.M.c() || d0.f.e;
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
            gm.d3(this.b9, 150L);
        }
    }

    public final void L() {
        if (this.E == null || this.h0 == null) {
            return;
        }
        ad8 ad8Var = this.U8;
        if (ad8Var != null) {
            this.U8 = null;
            ad8Var.b();
        }
        e7a e7aVar = this.H7;
        if (e7aVar != null) {
            e7aVar.a();
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
            fc4.g(e, true);
        }
        jn5 jn5Var = this.i5;
        if (jn5Var != null) {
            jn5Var.a();
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
                gn5 gn5Var = (gn5) this.Z6.get(this.O4);
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
                } else if (gn5Var != null) {
                    TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated2 = gn5Var.f;
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

    /* JADX WARN: Removed duplicated region for block: B:114:0x05fe  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x060c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0645  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x065d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x07bf  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x07eb  */
    /* JADX WARN: Removed duplicated region for block: B:188:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x07b1 A[LOOP:0: B:202:0x07af->B:203:0x07b1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x053b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x054f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x056a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0583  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void L1(boolean z, boolean z2, boolean z3, int i) {
        ao6 ao6Var;
        Integer num;
        ArrayList arrayList;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        long j;
        boolean z8;
        boolean z9;
        Uri uri;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean equals;
        boolean z13;
        qb8 qb8Var;
        qb8 N;
        boolean z14;
        boolean z15;
        Uri uri2;
        ib8 ib8Var;
        boolean z16;
        ao6 ao6Var2;
        int i2;
        k47 k47Var;
        k47 k47Var2;
        char c;
        char c2;
        boolean K4;
        k47 k47Var3;
        k47 k47Var4;
        k47 k47Var5;
        TLRPC.Message message;
        ao6 ao6Var3;
        jn5 jn5Var;
        if ((!z3 && this.O4 == i) || this.d == null) {
            return;
        }
        if (!z && (jn5Var = this.i5) != null) {
            jn5Var.a();
            this.i5 = null;
        }
        String p0 = p0(i);
        String[] strArr = this.b5;
        strArr[0] = p0;
        strArr[1] = p0(i + 1);
        strArr[2] = p0(i - 1);
        this.d.b0(this.O4);
        this.v1 = SystemClock.elapsedRealtime();
        int i3 = this.O4;
        this.O4 = i;
        P1(z, z2, false, i);
        n43 clone = this.E1.clone();
        ib8 ib8Var2 = this.W4;
        ao6 clone2 = (ib8Var2 == null || (ao6Var3 = ib8Var2.c) == null) ? null : ao6Var3.clone();
        boolean z17 = this.H4;
        ib8Var2.a = null;
        ib8Var2.c = null;
        ib8Var2.d = null;
        ib8Var2.e = null;
        ib8Var2.b = null;
        ib8Var2.f = null;
        ib8Var2.g = 0L;
        ArrayList arrayList2 = this.X6;
        boolean isEmpty = arrayList2.isEmpty();
        ArrayList arrayList3 = this.f7;
        if (isEmpty) {
            ao6Var = clone2;
            num = 1;
            ArrayList arrayList4 = this.d7;
            if (arrayList4.isEmpty()) {
                ArrayList arrayList5 = this.Z6;
                if (!arrayList5.isEmpty()) {
                    if (i < 0 || i >= arrayList5.size()) {
                        A(false, false);
                        return;
                    }
                    gn5 gn5Var = this.Y4;
                    gn5 gn5Var2 = (gn5) arrayList5.get(i);
                    if (z && gn5Var != null && gn5Var2 != null) {
                        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = gn5Var.f;
                        int i4 = tL_fileLocationToBeDeprecated.local_id;
                        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated2 = gn5Var2.f;
                        if (i4 == tL_fileLocationToBeDeprecated2.local_id && tL_fileLocationToBeDeprecated.volume_id == tL_fileLocationToBeDeprecated2.volume_id) {
                            z13 = true;
                            this.Y4 = (gn5) arrayList5.get(i);
                            this.Z4 = (gn5) this.a7.get(i);
                            this.p0.u(25);
                            arrayList = arrayList3;
                            z7 = z13;
                            z4 = z17;
                            j = 0;
                            z8 = false;
                            z5 = false;
                            uri = null;
                            z12 = true;
                            z6 = false;
                        }
                    }
                    z13 = false;
                    this.Y4 = (gn5) arrayList5.get(i);
                    this.Z4 = (gn5) this.a7.get(i);
                    this.p0.u(25);
                    arrayList = arrayList3;
                    z7 = z13;
                    z4 = z17;
                    j = 0;
                    z8 = false;
                    z5 = false;
                    uri = null;
                    z12 = true;
                    z6 = false;
                } else if (arrayList3.isEmpty()) {
                    arrayList = arrayList3;
                    z4 = z17;
                    mb8 mb8Var = this.i7;
                    if (mb8Var != null) {
                        int i5 = this.O4;
                        if (i5 < 0 || i5 >= mb8Var.j()) {
                            A(false, false);
                            return;
                        }
                        TL_iv.PageBlock pageBlock = this.i7.get(this.O4);
                        TL_iv.PageBlock pageBlock2 = this.h5;
                        boolean z18 = pageBlock2 != null && pageBlock2 == pageBlock;
                        this.h5 = pageBlock;
                        boolean z19 = this.i7.a(this.O4) || this.i7.e(this.O4);
                        this.p0.u(25);
                        z6 = z19;
                        z7 = z18;
                        j = 0;
                        z8 = false;
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
                            bc4.G(this.U);
                            this.d5 = bc4.I(botInlineResult.document).getAbsolutePath();
                            equals = k47.J4(botInlineResult.document);
                        } else {
                            if (botInlineResult.photo != null) {
                                bc4.G(this.U);
                                this.d5 = bc4.I(bc4.w(botInlineResult.photo.sizes, gm.Y0(false), false, null, false)).getAbsolutePath();
                            } else {
                                TLRPC.WebDocument webDocument = botInlineResult.content;
                                if (webDocument instanceof TLRPC.TL_webDocument) {
                                    this.d5 = webDocument.url;
                                    equals = botInlineResult.type.equals(MediaStreamTrack.VIDEO_TRACK_KIND);
                                }
                            }
                            equals = false;
                        }
                        z6 = equals;
                        arrayList = arrayList3;
                        z4 = z17;
                        j = 0;
                        z9 = false;
                        uri = null;
                        z10 = false;
                    } else {
                        if (obj instanceof jo6) {
                            jo6 jo6Var = (jo6) obj;
                            long j2 = jo6Var.H;
                            int i6 = jo6Var.G;
                            int i7 = jo6Var.F;
                            String str = jo6Var.I;
                            this.d5 = str;
                            if (str == null) {
                                A(false, false);
                                return;
                            }
                            z10 = jo6Var.d();
                            z6 = jo6Var.b;
                            long j3 = jo6Var.m;
                            this.e5 = j3;
                            ib8Var2.d = jo6Var.o;
                            ib8Var2.a = jo6Var.j;
                            ib8Var2.b = jo6Var.k;
                            ib8Var2.f = jo6Var.q;
                            z4 = z17;
                            ib8Var2.g = jo6Var.t;
                            ib8Var2.e = jo6Var.p;
                            ib8Var2.c = jo6Var.A;
                            File file = new File(str);
                            Uri fromFile = Uri.fromFile(file);
                            if (this.i2) {
                                StringBuilder sb = new StringBuilder();
                                if (i7 == 0 || i6 == 0) {
                                    arrayList = arrayList3;
                                } else {
                                    if (sb.length() > 0) {
                                        sb.append(", ");
                                    }
                                    Locale locale = Locale.US;
                                    arrayList = arrayList3;
                                    sb.append(i7 + "x" + i6);
                                }
                                if (jo6Var.b && !jo6Var.d()) {
                                    if (sb.length() > 0) {
                                        sb.append(", ");
                                    }
                                    sb.append(gm.g0(jo6Var.E, false, false));
                                }
                                if (j2 != 0) {
                                    if (sb.length() > 0) {
                                        sb.append(", ");
                                    }
                                    sb.append(gm.i0(j2, false, false));
                                }
                                this.m0.setText(file.getName());
                                this.n0.setText(sb);
                            } else {
                                arrayList = arrayList3;
                            }
                            z9 = this.h7 != null;
                            uri = fromFile;
                            j = j3;
                        } else {
                            arrayList = arrayList3;
                            z4 = z17;
                            if (obj instanceof no6) {
                                no6 no6Var = (no6) obj;
                                this.d5 = no6Var.g();
                                ib8Var2.d = no6Var.o;
                                ib8Var2.a = no6Var.j;
                                ib8Var2.b = no6Var.k;
                                ib8Var2.f = no6Var.q;
                                ib8Var2.g = no6Var.t;
                                ib8Var2.e = no6Var.p;
                                ib8Var2.c = no6Var.A;
                            }
                            j = 0;
                            z9 = false;
                            uri = null;
                            z10 = false;
                            z6 = false;
                        }
                        if (obj instanceof co6) {
                            co6 co6Var = (co6) obj;
                            if (B0()) {
                                this.f5 = co6Var.h;
                            } else {
                                String str2 = co6Var.i;
                                if (str2 != null) {
                                    this.f5 = str2;
                                } else {
                                    this.f5 = this.d5;
                                }
                            }
                        }
                    }
                    ao6 ao6Var4 = ib8Var2.c;
                    if (ao6Var4 != null) {
                        this.J2 = true;
                        float f = ao6Var4.a;
                        this.K2 = f;
                        float f2 = ao6Var4.b;
                        this.L2 = f2;
                        float f3 = ao6Var4.c;
                        this.O2 = f3;
                        float f4 = ao6Var4.d;
                        this.P2 = f4;
                        z11 = z9;
                        int i8 = ao6Var4.k;
                        this.R2 = i8;
                        float f5 = ao6Var4.e;
                        this.M2 = f5;
                        float f6 = ao6Var4.f;
                        this.N2 = f6;
                        boolean z20 = ao6Var4.l;
                        this.Q2 = z20;
                        this.E1.b(true, f, f2, f4, i8, f3, 1.0f, 1.0f, f5, f6, 0.0f, 0.0f, z20);
                    } else {
                        z11 = z9;
                        this.J2 = false;
                        this.E1.b(false, this.K2, this.L2, this.P2, this.R2, this.O2, 1.0f, 1.0f, this.M2, this.N2, 0.0f, 0.0f, this.Q2);
                    }
                    this.p0.u(25);
                    z8 = z10;
                    z5 = false;
                    z12 = true;
                    z7 = z11;
                }
                S1(z5, z12);
                qb8Var = this.c5;
                if (qb8Var != null) {
                    if (this.m4 == 0) {
                        qb8Var.a.v0(z12, z12);
                    } else {
                        this.p4 = qb8Var;
                    }
                }
                pb8 pb8Var = this.d;
                k47 k47Var6 = this.S4;
                gn5 gn5Var3 = this.Y4;
                N = pb8Var.N(k47Var6, gn5Var3 == null ? null : gn5Var3.f, this.O4, false, false);
                this.c5 = N;
                if (N != null || N.s) {
                    z14 = false;
                } else if (this.m4 == 0) {
                    z14 = false;
                    N.a.v0(false, true);
                } else {
                    z14 = false;
                    this.q4 = N;
                }
                w98[] w98VarArr = this.X0;
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
                    oa8 oa8Var = this.z2;
                    if (oa8Var != null) {
                        oa8Var.setVisibility(4);
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
                        this.H6 = (this.s4 || (arrayList.isEmpty() && (strArr[0] == null || w98VarArr[0].h == 0))) ? false : true;
                    }
                    I2(this.Z5);
                    w1(false);
                }
                if (z8 || this.d2 != 11) {
                    z15 = z8;
                    uri2 = uri;
                } else {
                    uri2 = null;
                    z15 = false;
                    z6 = false;
                }
                if (z6 || uri2 == null) {
                    ib8Var = ib8Var2;
                    z16 = z4;
                    ao6Var2 = ao6Var;
                } else {
                    this.Q3 = false;
                    z16 = z4;
                    ib8Var = ib8Var2;
                    ao6Var2 = ao6Var;
                    t1(null, uri2, (this.d2 == 1 && !(z15 && U0())) || (z15 && !U0()), false, ib8Var2.d, z15, j);
                }
                if (arrayList.isEmpty()) {
                    ib8Var.a = null;
                    ib8Var.c = null;
                    ib8Var.d = null;
                    ib8Var.e = null;
                    ib8Var.b = null;
                    ib8Var.f = null;
                    ib8Var.g = 0L;
                }
                this.H4 = z6;
                this.I4 = z15;
                if (i3 != -1 || z3) {
                    M1();
                    for (i2 = 0; i2 < 3; i2++) {
                        u(i2, false);
                    }
                } else {
                    u(0, false);
                    int i10 = this.O4;
                    ImageView[] imageViewArr = this.y3;
                    if (i3 > i10) {
                        ImageReceiver imageReceiver = this.C4;
                        this.C4 = this.B4;
                        this.B4 = this.A4;
                        this.A4 = imageReceiver;
                        ej0 ej0Var = this.F4;
                        this.F4 = this.E4;
                        this.E4 = this.D4;
                        this.D4 = ej0Var;
                        ln[] lnVarArr = this.K8;
                        if (lnVarArr != null) {
                            ln lnVar = lnVarArr[0];
                            lnVarArr[0] = lnVarArr[1];
                            lnVarArr[1] = lnVarArr[2];
                            lnVarArr[2] = lnVar;
                        }
                        this.J4 = z16;
                        this.G1 = clone;
                        this.I1 = ao6Var2;
                        w98 w98Var = w98VarArr[0];
                        w98VarArr[0] = w98VarArr[2];
                        w98VarArr[2] = w98Var;
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
                        Integer num2 = this.B4.Z0;
                        if (num2 != null && num2.equals(num)) {
                            N1(this.B4, this.O4, null);
                        }
                        C2();
                        u(1, false);
                        u(2, false);
                    } else {
                        Integer num3 = num;
                        boolean z21 = z16;
                        if (i3 < i10) {
                            ImageReceiver imageReceiver2 = this.A4;
                            this.A4 = this.B4;
                            this.B4 = this.C4;
                            this.C4 = imageReceiver2;
                            ej0 ej0Var2 = this.D4;
                            this.D4 = this.E4;
                            this.E4 = this.F4;
                            this.F4 = ej0Var2;
                            ln[] lnVarArr2 = this.K8;
                            if (lnVarArr2 != null) {
                                ln lnVar2 = lnVarArr2[2];
                                c2 = 1;
                                lnVarArr2[2] = lnVarArr2[1];
                                c = 0;
                                lnVarArr2[1] = lnVarArr2[0];
                                lnVarArr2[0] = lnVar2;
                            } else {
                                c = 0;
                                c2 = 1;
                            }
                            this.G4 = z21;
                            this.F1 = clone;
                            this.H1 = ao6Var2;
                            w98 w98Var2 = w98VarArr[c];
                            w98VarArr[c] = w98VarArr[c2];
                            w98VarArr[c2] = w98Var2;
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
                            Integer num4 = this.B4.Z0;
                            if (num4 != null && num4.equals(num3)) {
                                N1(this.B4, this.O4, null);
                            }
                            C2();
                            u(1, false);
                            u(2, false);
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
                    pb8 pb8Var2 = this.d;
                    long a = pb8Var2 != null ? pb8Var2.a() : 0L;
                    if (a == 0 && (k47Var2 = this.S4) != null) {
                        a = k47.B0(k47Var2.k);
                    }
                    this.V1.setDialogId(a);
                    ba8 ba8Var = this.W1;
                    if (ba8Var != null) {
                        ba8Var.setDialogId(a);
                    }
                }
                if (this.T0 != null) {
                    pb8 pb8Var3 = this.d;
                    long a2 = pb8Var3 != null ? pb8Var3.a() : 0L;
                    if (a2 == 0 && (k47Var = this.S4) != null) {
                        a2 = k47.B0(k47Var.k);
                    }
                    vi3 vi3Var = this.T0;
                    pb8 pb8Var4 = this.d;
                    long L1 = (pb8Var4 == null || !pb8Var4.p() || this.d.v()) ? oc7.r1(this.U).L1(a2) : 0L;
                    pb8 pb8Var5 = this.d;
                    vi3Var.i(Math.max(1, pb8Var5 == null ? 1 : pb8Var5.H()), L1, true);
                    return;
                }
                return;
            }
            if (i < 0 || i >= arrayList4.size()) {
                A(false, false);
                return;
            }
            this.a5 = (xw9) arrayList4.get(i);
            this.p0.u(25);
            arrayList = arrayList3;
            z4 = z17;
            z5 = false;
            z8 = z5;
            z7 = z8;
            z6 = z7;
            j = 0;
            uri = null;
            z12 = true;
            S1(z5, z12);
            qb8Var = this.c5;
            if (qb8Var != null) {
            }
            pb8 pb8Var6 = this.d;
            k47 k47Var62 = this.S4;
            gn5 gn5Var32 = this.Y4;
            N = pb8Var6.N(k47Var62, gn5Var32 == null ? null : gn5Var32.f, this.O4, false, false);
            this.c5 = N;
            if (N != null) {
            }
            z14 = false;
            w98[] w98VarArr2 = this.X0;
            if (!z7) {
            }
            if (z8) {
            }
            z15 = z8;
            uri2 = uri;
            if (z6) {
            }
            ib8Var = ib8Var2;
            z16 = z4;
            ao6Var2 = ao6Var;
            if (arrayList.isEmpty()) {
            }
            this.H4 = z6;
            this.I4 = z15;
            if (i3 != -1) {
            }
            M1();
            while (i2 < 3) {
            }
            M();
            if (this.V1 != null) {
            }
            if (this.T0 != null) {
            }
        } else {
            int i11 = this.O4;
            if (i11 < 0 || i11 >= arrayList2.size()) {
                A(false, false);
                return;
            }
            k47 k47Var7 = (k47) arrayList2.get(this.O4);
            boolean z22 = k47Var7 != null && (oc7.r1(this.U).B2(k47.B0(k47Var7.k)) || (((message = k47Var7.k) != null && message.noforwards) || k47Var7.y2()));
            z7 = z && (k47Var5 = this.S4) != null && k47Var5.e1() == k47Var7.e1();
            if (z7) {
                k47Var7.P = this.S4.P;
            }
            if (this.T4 == null || k47Var7 == null || ((k47Var4 = this.S4) != null && k47.B0(k47Var4.k) != k47.B0(k47Var7.k))) {
                VideoAds videoAds = this.T4;
                if (videoAds != null) {
                    videoAds.stop();
                    this.T4 = null;
                }
                if (k47Var7 != null) {
                    num = 1;
                    ao6Var = clone2;
                    VideoAds make = VideoAds.make(k47Var7.K1, k47.B0(k47Var7.k), k47Var7.e1(), new c41(this.f0, this.w2));
                    this.T4 = make;
                    ndc ndcVar = this.G2;
                    make.setWaitingPaused(ndcVar == null || (ndcVar.c0() && this.G2.d.h() == 3));
                    this.T4.setPauseOnPopupCallback(new n88(this, (byte) 25));
                    this.S4 = k47Var7;
                    if (k47Var7 != null) {
                        k47Var7.j3 = true;
                    }
                    z8 = k47Var7.D3();
                    K4 = k47.K4(k47Var7.k);
                    if (k47Var7.q4()) {
                        gm.r(this.y2);
                    }
                    if (this.B5 == 1) {
                        boolean x = k47Var7.x();
                        this.H6 = x;
                        if (x) {
                            boolean z23 = this.l2;
                            a8 a8Var = this.u0;
                            if (z23) {
                                a8Var.setVisibility(0);
                                this.v0.setVisibility(0);
                            } else {
                                a8Var.setVisibility(8);
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
                    if ((K4 || z8) && !this.s4) {
                        this.s0.setVisibility(8);
                        this.q0.setVisibility(8);
                        this.A0.setVisibility(8);
                        this.p0.Q(25, z22 && (k47Var3 = this.S4) != null && k47.R3(k47Var3.k) && !this.S4.D3());
                        this.p0.m();
                    } else {
                        this.s0.setVisibility(0);
                        this.q0.setVisibility(0);
                        this.p0.S(17);
                        this.p0.u(25);
                        this.A0.setVisibility(this.p0.getVisibleSubItemsCount() > 1 ? 0 : 8);
                    }
                    N2();
                    arrayList = arrayList3;
                    z6 = K4;
                    z4 = z17;
                    j = 0;
                }
            }
            ao6Var = clone2;
            num = 1;
            this.S4 = k47Var7;
            if (k47Var7 != null) {
            }
            z8 = k47Var7.D3();
            K4 = k47.K4(k47Var7.k);
            if (k47Var7.q4()) {
            }
            if (this.B5 == 1) {
            }
            if (K4) {
            }
            this.s0.setVisibility(8);
            this.q0.setVisibility(8);
            this.A0.setVisibility(8);
            this.p0.Q(25, z22 && (k47Var3 = this.S4) != null && k47.R3(k47Var3.k) && !this.S4.D3());
            this.p0.m();
            N2();
            arrayList = arrayList3;
            z6 = K4;
            z4 = z17;
            j = 0;
        }
        z5 = false;
        uri = null;
        z12 = true;
        S1(z5, z12);
        qb8Var = this.c5;
        if (qb8Var != null) {
        }
        pb8 pb8Var62 = this.d;
        k47 k47Var622 = this.S4;
        gn5 gn5Var322 = this.Y4;
        N = pb8Var62.N(k47Var622, gn5Var322 == null ? null : gn5Var322.f, this.O4, false, false);
        this.c5 = N;
        if (N != null) {
        }
        z14 = false;
        w98[] w98VarArr22 = this.X0;
        if (!z7) {
        }
        if (z8) {
        }
        z15 = z8;
        uri2 = uri;
        if (z6) {
        }
        ib8Var = ib8Var2;
        z16 = z4;
        ao6Var2 = ao6Var;
        if (arrayList.isEmpty()) {
        }
        this.H4 = z6;
        this.I4 = z15;
        if (i3 != -1) {
        }
        M1();
        while (i2 < 3) {
        }
        M();
        if (this.V1 != null) {
        }
        if (this.T0 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void L2() {
        t5b t5bVar;
        long j;
        String j2;
        ArrayList arrayList;
        Uri uri;
        TLRPC.Document document;
        if (this.f0 != null) {
            ndc ndcVar = this.G2;
            if (ndcVar == null || this.s1 || this.G8 || this.d2 != 0 || this.I4) {
                t5bVar = null;
            } else {
                Uri uri2 = this.V4;
                if (uri2 != null || this.U4 == null) {
                    j = 0;
                } else {
                    if (this.l7 == null) {
                        TLRPC.Document R = ndcVar.R();
                        ArrayList arrayList2 = this.U4;
                        int size = arrayList2.size();
                        int i = 0;
                        while (i < size) {
                            Object obj = arrayList2.get(i);
                            i++;
                            ArrayList arrayList3 = ((kdc) obj).d;
                            int size2 = arrayList3.size();
                            int i2 = 0;
                            while (i2 < size2) {
                                Object obj2 = arrayList3.get(i2);
                                i2++;
                                mdc mdcVar = (mdc) obj2;
                                if (R == null || (uri = mdcVar.d) == null || (document = mdcVar.g) == null) {
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
                        n88 n88Var = this.n7;
                        gm.r(n88Var);
                        gm.d3(n88Var, 3000L);
                        uri2 = null;
                    }
                }
                String scheme = uri2 == null ? null : uri2.getScheme();
                if (!"file".equals(scheme) || uri2.getPath() == null) {
                    if ("tg".equals(scheme)) {
                        Long A = uri2 == null ? null : Utilities.A(uri2.getQueryParameter("size"));
                        if (A != null && A.longValue() > j) {
                            t5bVar = new mj4(uri2, A, (byte) 28);
                            StringBuilder sb = new StringBuilder("captions: player video ");
                            if (t5bVar == null) {
                                j2 = b10.h("heard from ", scheme);
                            } else {
                                StringBuilder sb2 = new StringBuilder("can't be heard (");
                                if (uri2 == null) {
                                    scheme = "no single file";
                                }
                                j2 = b10.j(sb2, scheme, ")");
                            }
                            ts2.w(sb, j2, "Dictation");
                        }
                    }
                    t5bVar = null;
                    StringBuilder sb3 = new StringBuilder("captions: player video ");
                    if (t5bVar == null) {
                    }
                    ts2.w(sb3, j2, "Dictation");
                } else {
                    File file = new File(uri2.getPath());
                    if (file.exists()) {
                        t5bVar = new wm4((Object) file.getAbsolutePath(), (Object) file, (byte) 29);
                        StringBuilder sb32 = new StringBuilder("captions: player video ");
                        if (t5bVar == null) {
                        }
                        ts2.w(sb32, j2, "Dictation");
                    }
                    t5bVar = null;
                    StringBuilder sb322 = new StringBuilder("captions: player video ");
                    if (t5bVar == null) {
                    }
                    ts2.w(sb322, j2, "Dictation");
                }
            }
            if (t5bVar == null && this.k7 == null) {
                return;
            }
            odc odcVar = this.k7;
            if (odcVar == null) {
                odcVar = new odc(new e98(this));
                this.k7 = odcVar;
            }
            odcVar.a(this.U, t5bVar);
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
            jn5 p = this.B4.p();
            int i = this.B4.V;
            if (str == null || p == null || p.c == null) {
                return;
            }
            Utilities.e.c(new v36((Object) this, (Object) p, i, (Object) str, (byte) 18));
        }
    }

    public final boolean M0(mb8 mb8Var) {
        if (mb8Var == null) {
            return false;
        }
        Object g = mb8Var.g();
        if (!(g instanceof k47)) {
            return false;
        }
        k47 k47Var = (k47) g;
        if (k47Var.k != null) {
            return oc7.r1(this.U).B2(k47.B0(k47Var.k)) || k47Var.k.noforwards || k47Var.y2();
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

    /* JADX WARN: Removed duplicated region for block: B:188:0x044a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void M2(int i, boolean z) {
        ndc ndcVar;
        k47 k47Var;
        vdc vdcVar;
        k47 k47Var2;
        StaticLayout[] staticLayoutArr;
        String str;
        yc ycVar;
        float f;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        ya8 ya8Var;
        if (this.G2 != null || ((ya8Var = this.g0) != null && ya8Var.y)) {
            VideoAds videoAds = this.T4;
            byte b = 3;
            if (videoAds != null) {
                videoAds.setWaitingPaused((z && i == 3) ? false : true);
            }
            ya8 ya8Var2 = this.g0;
            if (ya8Var2 != null && ya8Var2.y && !z) {
                t2(true, true);
            }
            ya8 ya8Var3 = this.g0;
            if (ya8Var3 != null && ya8Var3.y && i == 3 && z0() >= 10000 && this.b3 == null && this.c3 == null) {
                if (this.S4 != null) {
                    long z0 = z0() / 1000;
                    TLRPC.Message message = this.S4.k;
                    String str2 = (message == null || (messageMedia = message.media) == null || (webPage = messageMedia.webpage) == null) ? null : webPage.url;
                    if (!TextUtils.isEmpty(str2)) {
                        if (z0 >= 10) {
                            sb8 sb8Var = (sb8) f9.get(str2);
                            k47 k47Var3 = this.S4;
                            f = 0.999f;
                            if (k47Var3.c0 < 0.0f && sb8Var != null) {
                                float f2 = sb8Var.a;
                                if (f2 > 0.0f && f2 < 0.999f) {
                                    k47Var3.c0 = f2;
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
                k47 k47Var4 = this.S4;
                if (k47Var4 != null) {
                    float f4 = k47Var4.c0;
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
                        gm.r(this.y2);
                    } else {
                        A1();
                    }
                    x2(z2, true);
                } else if (z) {
                    this.V2 = false;
                }
            }
            oa8 oa8Var = this.z2;
            if (oa8Var != null) {
                oa8Var.setKeepScreenOn((!z || i == 4 || i == 1) ? false : true);
            }
            if (!z || i == 4 || i == 1) {
                try {
                    this.E.getWindow().clearFlags(128);
                    this.h3 = false;
                } catch (Exception e) {
                    fc4.g(e, true);
                }
            } else {
                try {
                    this.E.getWindow().addFlags(128);
                    this.h3 = true;
                } catch (Exception e2) {
                    fc4.g(e2, true);
                }
            }
            if (i == 3 || i == 1) {
                k47 k47Var5 = this.S4;
                if (k47Var5 != null && (ndcVar = this.G2) != null) {
                    this.s3.c(k47Var5, ndcVar);
                }
                float f5 = this.a3;
                if (f5 != 0.0f) {
                    D1(f5);
                    this.a3 = 0.0f;
                    k47 k47Var6 = this.S4;
                    if (k47Var6 != null) {
                        bc4 G = bc4.G(k47Var6.K1);
                        TLRPC.Document F0 = this.S4.F0();
                        if (!G.T(F0, false) && !G.T(F0, true)) {
                            this.V2 = true;
                        }
                    }
                }
            }
            float f6 = 1.0f;
            if (i == 3) {
                oa8 oa8Var2 = this.z2;
                if (oa8Var2 != null && oa8Var2.getVisibility() != 0) {
                    this.z2.setVisibility(0);
                }
                if (!this.w0.isEnabled() && this.w0.getVisibility() == 0) {
                    this.s2 = true;
                    this.w0.setEnabled(true);
                    this.w0.animate().alpha(1.0f).setDuration(175L).withEndAction(null).start();
                }
                this.W2 = true;
                k47 k47Var7 = this.S4;
                if (k47Var7 != null && k47.K4(k47Var7.k)) {
                    gm.r(this.x2);
                    bc4.G(this.S4.K1).Z(this.S4.F0(), true, false);
                }
            } else if (i == 2 && z && (k47Var = this.S4) != null && k47.K4(k47Var.k)) {
                boolean z3 = this.W2;
                t98 t98Var = this.x2;
                if (z3) {
                    t98Var.run();
                } else {
                    gm.d3(t98Var, 1000L);
                }
            }
            ndc ndcVar2 = this.G2;
            if (ndcVar2 == null ? this.g0.H : ndcVar2.c0()) {
                if (i != 4) {
                    if (!this.P3) {
                        this.P3 = true;
                        this.X0[0].d(this.s1 ? -1 : 4, false, true);
                        w98 w98Var = this.X0[0];
                        if (!this.s1 && ((!J0() || this.X2) && ((this.Y2 && !this.X2) || !this.K))) {
                            f6 = 0.0f;
                        }
                        w98Var.e(1, f6, false);
                        this.X2 = true;
                        gm.c3(this.h4);
                    }
                    I0();
                    vdcVar = this.q3;
                    k47Var2 = this.S4;
                    long z02 = z0();
                    vdcVar.getClass();
                    if (k47Var2 != null || z02 < 0) {
                        vdcVar.F = null;
                        vdcVar.J = -1;
                        vdcVar.I = 0.0f;
                        staticLayoutArr = vdcVar.K;
                        if (staticLayoutArr != null) {
                            staticLayoutArr[1] = null;
                            staticLayoutArr[0] = null;
                        }
                        vdcVar.G = null;
                        vdcVar.H = -1L;
                    } else {
                        CharSequence charSequence = k47Var2.z;
                        if (k47Var2.d5()) {
                            if (k47Var2.B == null && (str = k47Var2.k.media.webpage.description) != null) {
                                k47Var2.B = SpannableString.valueOf(str);
                                k47.h(k47Var2.N3(), k47Var2.B, false, 3, (int) z02, false);
                            }
                            charSequence = k47Var2.B;
                        }
                        if (charSequence != vdcVar.G || vdcVar.H != z02) {
                            vdcVar.G = charSequence;
                            vdcVar.H = z02;
                            if (charSequence instanceof Spanned) {
                                Spanned spanned = (Spanned) charSequence;
                                try {
                                    g6c[] g6cVarArr = (g6c[]) spanned.getSpans(0, spanned.length(), g6c.class);
                                    vdcVar.F = new ArrayList();
                                    vdcVar.I = 0.0f;
                                    if (vdcVar.L == null) {
                                        TextPaint textPaint = new TextPaint(1);
                                        vdcVar.L = textPaint;
                                        textPaint.setTextSize(gm.L(12.0f));
                                        vdcVar.L.setColor(-1);
                                    }
                                    for (g6c g6cVar : g6cVarArr) {
                                        if (g6cVar != null && g6cVar.getURL() != null && g6cVar.d != null && g6cVar.getURL().startsWith("video?")) {
                                            if (Utilities.z(g6cVar.getURL().substring(6)).intValue() >= 0) {
                                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(g6cVar.d);
                                                gw3.l(spannableStringBuilder, vdcVar.L.getFontMetricsInt(), false);
                                                vdcVar.F.add(new Pair(Float.valueOf((r9.intValue() * 1000) / z02), spannableStringBuilder));
                                            }
                                        }
                                    }
                                    Collections.sort(vdcVar.F, new zua((byte) 11));
                                } catch (Exception e3) {
                                    fc4.g(e3, true);
                                    vdcVar.F = null;
                                    vdcVar.J = -1;
                                    vdcVar.I = 0.0f;
                                    StaticLayout[] staticLayoutArr2 = vdcVar.K;
                                    if (staticLayoutArr2 != null) {
                                        staticLayoutArr2[1] = null;
                                        staticLayoutArr2[0] = null;
                                    }
                                }
                            } else {
                                vdcVar.F = null;
                                vdcVar.J = -1;
                                vdcVar.I = 0.0f;
                                StaticLayout[] staticLayoutArr3 = vdcVar.K;
                                if (staticLayoutArr3 != null) {
                                    staticLayoutArr3[1] = null;
                                    staticLayoutArr3[0] = null;
                                }
                            }
                        }
                    }
                    Q2();
                    gm.c3(new n88(this, b));
                }
            }
            if (this.P3 || i == 4) {
                if (this.t4 != 3) {
                    this.X0[0].e(1, 1.0f, i == 4);
                    w98 w98Var2 = this.X0[0];
                    w98Var2.d(3, false, w98Var2.m[1] > 0.0f);
                }
                this.P3 = false;
                gm.r(this.h4);
                if (i == 4) {
                    if (this.s1) {
                        x98 x98Var = this.X7;
                        if (!x98Var.r) {
                            x98Var.setProgress(x98Var.getLeftProgress());
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
                    ad8 ad8Var = this.U8;
                    if (ad8Var != null) {
                        tl4 tl4Var = ad8Var.e;
                        if (tl4Var != null && (ycVar = tl4Var.o) != null) {
                            tl4Var.H = true;
                            tl4Var.I = 0.0f;
                            tl4Var.J = 0.0f;
                            ycVar.invalidate();
                            tl4Var.p();
                            if (!tl4Var.u) {
                                tl4Var.u = true;
                                tl4Var.o(true);
                                gm.r(tl4Var.P);
                                tl4Var.w = false;
                            }
                        }
                        ad8Var.b.d();
                    }
                }
            }
            I0();
            vdcVar = this.q3;
            k47Var2 = this.S4;
            long z022 = z0();
            vdcVar.getClass();
            if (k47Var2 != null) {
            }
            vdcVar.F = null;
            vdcVar.J = -1;
            vdcVar.I = 0.0f;
            staticLayoutArr = vdcVar.K;
            if (staticLayoutArr != null) {
            }
            vdcVar.G = null;
            vdcVar.H = -1L;
            Q2();
            gm.c3(new n88(this, b));
        }
    }

    public final void N() {
        SharedPreferences.Editor edit = oc7.d1().edit();
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
    public final void N1(ImageReceiver imageReceiver, int i, n43 n43Var) {
        k47 k47Var;
        TLRPC.PhotoSize photoSize;
        TLObject tLObject;
        int i2;
        boolean z;
        boolean z2;
        long[] jArr;
        gn5 gn5Var;
        Object obj;
        ?? r24;
        BitmapDrawable bitmapDrawable;
        gn5 gn5Var2;
        gn5 gn5Var3;
        boolean z3;
        TLRPC.Photo photo;
        BitmapDrawable bitmapDrawable2;
        gn5 gn5Var4;
        kn knVar;
        kn knVar2;
        TLRPC.PhotoSize photoSize2;
        BitmapDrawable bitmapDrawable3;
        gn5 gn5Var5;
        String str;
        vuc vucVar;
        gn5 gn5Var6;
        ?? r11;
        ao6 ao6Var;
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
        gn5 gn5Var7;
        TLRPC.Document document3;
        long j2;
        gn5 gn5Var8;
        TLObject tLObject4;
        gn5 gn5Var9;
        gn5 gn5Var10;
        TLRPC.Document document4;
        ao6 ao6Var2;
        boolean z5;
        Drawable drawable;
        Activity activity;
        Drawable drawable2;
        Drawable drawable3;
        Activity activity2;
        boolean z6;
        ao6 ao6Var3;
        ImageReceiver imageReceiver2;
        gn5 gn5Var11;
        gn5 gn5Var12;
        gn5 gn5Var13;
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
            gm.Y0(false);
            jn5 jn5Var = this.i5;
            if (jn5Var == null || imageReceiver != this.B4) {
                jn5Var = null;
            }
            if (jn5Var == null) {
                jn5Var = this.d.k(i);
            }
            xw9 xw9Var = (xw9) arrayList.get(i);
            long j3 = xw9Var.b.size;
            gn5 gn5Var14 = new gn5();
            gn5Var14.h = xw9Var;
            imageReceiver.Z(gn5Var14, "d", null, null, jn5Var != null ? new BitmapDrawable(jn5Var.c) : null, j3, null, null, 0);
            return;
        }
        ArrayList arrayList2 = this.f7;
        if (arrayList2.isEmpty()) {
            mb8 mb8Var = this.i7;
            if (mb8Var != null) {
                int[] iArr = new int[1];
                TLObject d = mb8Var.d(i);
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
                        if (imageReceiver != this.B4 || (knVar2 = this.k2) == null) {
                            return;
                        }
                        imageReceiver.g0(knVar2);
                        this.k2.f(this.f0);
                        return;
                    }
                    if (f.location instanceof TLRPC.TL_fileLocationUnavailable) {
                        imageReceiver.g0(this.E.getResources().getDrawable(R.drawable.photoview_placeholder));
                        return;
                    }
                    jn5 jn5Var2 = this.i5;
                    if (jn5Var2 == null || imageReceiver != this.B4) {
                        jn5Var2 = null;
                    }
                    imageReceiver.Z(null, null, jn5Var2 == null ? gn5.c(f, (TLRPC.Document) d) : null, "b", jn5Var2 != null ? new BitmapDrawable(jn5Var2.c) : null, 0L, null, this.i7.g(), 1);
                    return;
                }
                TLRPC.Photo photo2 = (TLRPC.Photo) d;
                jn5 jn5Var3 = this.i5;
                if (jn5Var3 == null || imageReceiver != this.B4) {
                    jn5Var3 = null;
                }
                if (iArr[0] == 0) {
                    iArr[0] = -1;
                }
                if ((er3.q(this.U).l() & 1) != 0 || this.O4 == i) {
                    photoSize2 = null;
                } else {
                    bc4.G(this.U);
                    photoSize2 = null;
                    if (!bc4.J(f, null, true, true).exists()) {
                        r13 = false;
                    }
                }
                if (jn5Var3 == null) {
                    gn5Var5 = gn5.i(bc4.w(photo2.sizes, 80, false, photoSize2, false), photo2);
                    bitmapDrawable3 = null;
                } else {
                    bitmapDrawable3 = new BitmapDrawable(jn5Var3.c);
                    gn5Var5 = null;
                }
                imageReceiver.Z(r13 ? gn5.i(f, photo2) : null, null, gn5Var5, "b", bitmapDrawable3, iArr[0], null, this.i7.g(), 1);
                imageReceiver.Z0 = r13 ? null : 1;
                return;
            }
            ArrayList arrayList3 = this.X6;
            if (arrayList3.isEmpty() || i < 0 || i >= arrayList3.size()) {
                k47Var = null;
            } else {
                k47 k47Var2 = (k47) arrayList3.get(i);
                imageReceiver.H0 = true;
                k47Var = k47Var2;
            }
            if (k47Var != null) {
                int i4 = k47Var.K1;
                if (!TextUtils.isEmpty(oc7.r1(i4).D1(k47Var.k.restriction_reason))) {
                    imageReceiver.g0(this.E.getResources().getDrawable(R.drawable.photoview_placeholder));
                    return;
                }
                if (k47.K4(k47Var.k)) {
                    ArrayList arrayList4 = k47Var.p0;
                    if (arrayList4 == null || arrayList4.isEmpty()) {
                        imageReceiver.g0(this.E.getResources().getDrawable(R.drawable.photoview_placeholder));
                        return;
                    }
                    jn5 jn5Var4 = this.i5;
                    if (jn5Var4 == null || imageReceiver != this.B4) {
                        jn5Var4 = null;
                    }
                    TLRPC.PhotoSize w = bc4.w(k47Var.p0, nm7.q5, false, null, false);
                    if (k47Var.D3()) {
                        imageReceiver.G0 = true;
                        imageReceiver.Z(q0(i, null), null, jn5Var4 == null ? gn5.f(w, k47Var.n0) : null, "b", jn5Var4 != null ? new BitmapDrawable(jn5Var4.c) : null, 0L, null, k47Var, 1);
                    } else {
                        imageReceiver.G0 = w.w < 100 && w.h < 100;
                        imageReceiver.Z(null, null, jn5Var4 == null ? gn5.f(w, k47Var.n0) : null, "b", jn5Var4 != null ? new BitmapDrawable(jn5Var4.c) : null, 0L, null, k47Var, 1);
                    }
                    jn5 jn5Var5 = this.i5;
                    if (jn5Var5 != null) {
                        imageReceiver.o0(jn5Var5.e, 0, false);
                        return;
                    }
                    return;
                }
                if (imageReceiver == this.B4 && (knVar = this.k2) != null) {
                    knVar.f(this.f0);
                    imageReceiver.g0(this.k2);
                    return;
                }
                if (this.B5 == 1) {
                    if (k47Var.x()) {
                        TLRPC.Document F0 = k47Var.F0();
                        imageReceiver.G0 = true;
                        jn5 jn5Var6 = this.i5;
                        if (jn5Var6 == null || imageReceiver != this.B4) {
                            jn5Var6 = null;
                        }
                        int i5 = (int) (2048.0f / gm.p);
                        if ((er3.q(this.U).l() & 8) == 0 && this.O4 != i) {
                            bc4.G(this.U);
                            if (!bc4.I(F0).exists()) {
                                r13 = false;
                            }
                        }
                        if (jn5Var6 == null) {
                            gn5Var4 = gn5.c(bc4.w(k47Var.p0, 100, false, null, false), F0);
                            bitmapDrawable2 = null;
                        } else {
                            bitmapDrawable2 = new BitmapDrawable(jn5Var6.c);
                            gn5Var4 = null;
                        }
                        gn5 b = r13 ? gn5.b(F0) : null;
                        Locale locale = Locale.US;
                        imageReceiver.Z(b, td4.n(i5, i5, "_"), gn5Var4, "b", bitmapDrawable2, F0.size, null, k47Var, 0);
                        imageReceiver.Z0 = r13 ? null : 1;
                        return;
                    }
                    Activity activity3 = this.E;
                    lb8 lb8Var = this.f0;
                    et7 et7Var = new et7();
                    et7Var.a = 0L;
                    et7Var.b = 0.0f;
                    et7Var.c = 0.0f;
                    et7Var.d = 0L;
                    et7Var.e = 0.0f;
                    et7Var.f = 1.0f;
                    TextPaint textPaint = et7.K;
                    textPaint.setTextSize(gm.L(14.0f));
                    TextPaint textPaint2 = et7.L;
                    textPaint2.setTextSize(gm.L(19.0f));
                    et7.M.setTextSize(gm.L(15.0f));
                    et7.N.setTextSize(gm.L(15.0f));
                    et7.O.setTextSize(gm.L(15.0f));
                    et7.P.setTextSize(gm.L(15.0f));
                    et7.J.setStrokeWidth(gm.L(2.0f));
                    et7Var.n = lb8Var;
                    et7Var.r = k47Var;
                    et7Var.s = er3.q(i4).k();
                    TLRPC.Document F02 = k47Var.F0();
                    if (F02 != null) {
                        String B = bc4.B(k47Var.F0());
                        et7Var.F = B;
                        if (TextUtils.isEmpty(B)) {
                            B = "name";
                            et7Var.F = "name";
                        }
                        int lastIndexOf = B.lastIndexOf(46);
                        String upperCase = lastIndexOf == -1 ? "" : B.substring(lastIndexOf + 1).toUpperCase();
                        et7Var.E = upperCase;
                        if (((int) Math.ceil(textPaint.measureText(upperCase))) > gm.L(40.0f)) {
                            et7Var.E = TextUtils.ellipsize(upperCase, textPaint, gm.L(40.0f), TextUtils.TruncateAt.END).toString();
                        }
                        Resources resources = activity3.getResources();
                        String str5 = k47Var.F0().mime_type;
                        et7Var.y = resources.getDrawable(gm.l1(B, true)).mutate();
                        et7Var.G = gm.i0(F02.size, false, false);
                        if (((int) Math.ceil(textPaint2.measureText(B))) > gm.L(320.0f)) {
                            et7Var.F = TextUtils.ellipsize(B, textPaint2, gm.L(320.0f), TextUtils.TruncateAt.END).toString();
                        }
                    }
                    et7Var.a();
                    imageReceiver.g0(et7Var);
                    return;
                }
            }
            long[] jArr2 = new long[1];
            gn5 q0 = q0(i, jArr2);
            TLObject n0 = n0(i, jArr2);
            imageReceiver.G0 = true;
            if (q0 == null) {
                if (jArr2[0] == 0) {
                    imageReceiver.g0(null);
                    return;
                } else {
                    imageReceiver.g0(this.E.getResources().getDrawable(R.drawable.photoview_placeholder));
                    return;
                }
            }
            jn5 jn5Var7 = this.i5;
            if (jn5Var7 == null || imageReceiver != this.B4) {
                jn5Var7 = null;
            }
            if (jArr2[0] == 0) {
                jArr2[0] = -1;
            }
            if (k47Var != null) {
                photoSize = bc4.w(k47Var.p0, 100, false, null, false);
                tLObject = k47Var.n0;
            } else {
                photoSize = null;
                tLObject = null;
            }
            if (photoSize != null && photoSize == n0) {
                photoSize = null;
            }
            if (photoSize == null && (photo = q0.l) != null && photo.sizes != null) {
                int i6 = 0;
                while (true) {
                    if (i6 >= q0.l.sizes.size()) {
                        break;
                    }
                    if (q0.l.sizes.get(i6) instanceof TLRPC.TL_photoStrippedSize) {
                        photoSize = q0.l.sizes.get(i6);
                        tLObject = q0.l;
                        break;
                    }
                    i6++;
                }
            }
            if (k47Var == null || !k47Var.Y4()) {
                z3 = false;
                if (this.y5 == 0) {
                    z3 = false;
                    if (!this.A5) {
                        i2 = 0;
                        z = false;
                        if (k47Var != null) {
                            z2 = z;
                            long j4 = this.y5;
                            if (j4 != 0) {
                                int i7 = this.U;
                                obj = j4 > 0 ? oc7.r1(i7).W1(Long.valueOf(this.y5)) : oc7.r1(i7).L0(Long.valueOf(-this.y5));
                                if (tLObject != null) {
                                    obj = tLObject;
                                }
                                if (jn5Var7 == null && (photoSize instanceof TLRPC.TL_photoStrippedSize)) {
                                    jn5Var7 = new jn5(fn5.B("b", photoSize.bytes));
                                }
                                jArr = jArr2;
                                gn5Var = null;
                                r24 = z2;
                            } else {
                                jArr = jArr2;
                                gn5Var = null;
                                obj = null;
                                r24 = z2;
                            }
                        } else if (this.B5 == 5) {
                            TLRPC.Document F03 = k47Var.F0();
                            r24 = z;
                            TLRPC.VideoSize J0 = k47.J0(F03);
                            k47 k47Var3 = k47Var;
                            jArr = jArr2;
                            gn5Var = J0 != null ? gn5.d(J0, F03) : null;
                            obj = k47Var3;
                        } else {
                            z2 = z;
                            obj = k47Var;
                            jArr = jArr2;
                            gn5Var = null;
                            r24 = z2;
                        }
                        if (gn5Var == null) {
                            imageReceiver.Y(q0, this.B5 == 5 ? "g" : null, gn5Var, null, jn5Var7 == null ? gn5.f(photoSize, tLObject) : null, "b", jn5Var7 != null ? new BitmapDrawable(jn5Var7.c) : null, jArr[r24], null, obj, i2);
                            imageReceiver.u0 = true;
                            return;
                        }
                        Object obj3 = obj;
                        long[] jArr3 = jArr;
                        String str6 = (this.y5 == 0 || q0.p != 2) ? null : "g";
                        boolean z7 = true;
                        if ((er3.q(this.U).l() & 1) == 0 && this.O4 != i) {
                            bc4.G(this.U);
                            if (!bc4.I(n0).exists()) {
                                z7 = r24;
                            }
                        }
                        if (jn5Var7 == null) {
                            gn5Var2 = q0;
                            gn5Var3 = gn5.f(photoSize, tLObject);
                            bitmapDrawable = null;
                        } else {
                            bitmapDrawable = new BitmapDrawable(jn5Var7.c);
                            gn5Var2 = q0;
                            gn5Var3 = null;
                        }
                        imageReceiver.Z(z7 ? gn5Var2 : null, str6, gn5Var3, "b", bitmapDrawable, jArr3[r24], null, obj3, i2);
                        imageReceiver.Z0 = z7 ? null : 1;
                        return;
                    }
                }
            } else {
                z3 = false;
            }
            i2 = 1;
            z = z3;
            if (k47Var != null) {
            }
            if (gn5Var == null) {
            }
        } else {
            if (i < 0 || i >= arrayList2.size()) {
                imageReceiver.g0(null);
                return;
            }
            Object obj4 = arrayList2.get(i);
            int Y0 = (int) (gm.Y0(false) / gm.p);
            jn5 jn5Var8 = this.i5;
            if (jn5Var8 == null || imageReceiver != this.B4) {
                jn5Var8 = null;
            }
            if (jn5Var8 == null) {
                jn5Var8 = this.d.k(i);
            }
            if (obj4 instanceof jo6) {
                jo6 jo6Var = (jo6) obj4;
                String str7 = jo6Var.I;
                ao6 ao6Var4 = jo6Var.A;
                boolean z8 = jo6Var.b;
                if (!z8 || jo6Var.d()) {
                    String str8 = jo6Var.i;
                    if (str8 != null) {
                        str7 = str8;
                    } else {
                        imageReceiver.o0(jo6Var.J, jo6Var.K, false);
                    }
                    Locale locale2 = Locale.US;
                    str = td4.n(Y0, Y0, "_");
                    str4 = str7;
                } else {
                    str4 = jo6Var.c;
                    if (str4 == null) {
                        str4 = "vthumb://" + jo6Var.C + ":" + str7;
                    } else if (this.l5) {
                        Bitmap decodeFile = BitmapFactory.decodeFile(str4);
                        if (decodeFile != null) {
                            jn5Var8 = new jn5(decodeFile);
                            jo6Var.c = null;
                        }
                        str = null;
                        str4 = null;
                    }
                    str = null;
                }
                vucVar = null;
                gn5Var6 = null;
                z4 = z8;
                i3 = 0;
                str2 = str4;
                j = 0;
                ao6Var = ao6Var4;
                r11 = 0;
                tLObject2 = null;
            } else {
                String str9 = "d";
                if (obj4 instanceof TLRPC.BotInlineResult) {
                    TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) obj4;
                    if (botInlineResult.type.equals(MediaStreamTrack.VIDEO_TRACK_KIND) || k47.J4(botInlineResult.document)) {
                        TLRPC.Document document6 = botInlineResult.document;
                        if (document6 != null) {
                            TLObject w2 = bc4.w(document6.thumbs, 90, false, null, false);
                            document2 = botInlineResult.document;
                            tLObject3 = w2;
                            str = null;
                            vucVar = null;
                            gn5Var7 = null;
                            document3 = null;
                            j2 = 0;
                            gn5Var9 = gn5Var7;
                            tLObject4 = tLObject3;
                            z4 = false;
                            TLRPC.Document document7 = document3;
                            tLObject2 = document2;
                            j = j2;
                            str2 = null;
                            i3 = 1;
                            ao6Var = null;
                            document5 = document7;
                            gn5Var6 = gn5Var9;
                            r11 = tLObject4;
                        } else {
                            TLRPC.WebDocument webDocument = botInlineResult.thumb;
                            if (webDocument instanceof TLRPC.TL_webDocument) {
                                vucVar = vuc.c(webDocument);
                                str = null;
                                r7 = null;
                                document2 = r7;
                                gn5Var8 = r7;
                                TLRPC.Document document8 = document2;
                                document3 = document8;
                                gn5Var7 = gn5Var8;
                                tLObject3 = document8;
                                j2 = 0;
                                gn5Var9 = gn5Var7;
                                tLObject4 = tLObject3;
                                z4 = false;
                                TLRPC.Document document72 = document3;
                                tLObject2 = document2;
                                j = j2;
                                str2 = null;
                                i3 = 1;
                                ao6Var = null;
                                document5 = document72;
                                gn5Var6 = gn5Var9;
                                r11 = tLObject4;
                            }
                        }
                    } else {
                        if (!botInlineResult.type.equals("gif") || (document4 = botInlineResult.document) == null) {
                            TLRPC.Photo photo3 = botInlineResult.photo;
                            if (photo3 != null) {
                                TLRPC.PhotoSize w3 = bc4.w(photo3.sizes, gm.Y0(false), false, null, false);
                                ?? r2 = botInlineResult.photo;
                                long j5 = w3.size;
                                Locale locale3 = Locale.US;
                                j2 = j5;
                                document3 = null;
                                document2 = r2;
                                tLObject4 = w3;
                                str = td4.n(Y0, Y0, "_");
                                vucVar = null;
                                gn5Var9 = null;
                            } else if (botInlineResult.content instanceof TLRPC.TL_webDocument) {
                                if (botInlineResult.type.equals("gif")) {
                                    TLRPC.WebDocument webDocument2 = botInlineResult.thumb;
                                    if ((webDocument2 instanceof TLRPC.TL_webDocument) && "video/mp4".equals(webDocument2.mime_type)) {
                                        gn5Var10 = gn5.p(vuc.c(botInlineResult.thumb));
                                        String str10 = str9;
                                        vucVar = vuc.c(botInlineResult.content);
                                        str = str10;
                                        document2 = null;
                                        gn5Var8 = gn5Var10;
                                        TLRPC.Document document82 = document2;
                                        document3 = document82;
                                        gn5Var7 = gn5Var8;
                                        tLObject3 = document82;
                                        j2 = 0;
                                        gn5Var9 = gn5Var7;
                                        tLObject4 = tLObject3;
                                    }
                                } else {
                                    Locale locale4 = Locale.US;
                                    str9 = td4.n(Y0, Y0, "_");
                                }
                                gn5Var10 = null;
                                String str102 = str9;
                                vucVar = vuc.c(botInlineResult.content);
                                str = str102;
                                document2 = null;
                                gn5Var8 = gn5Var10;
                                TLRPC.Document document822 = document2;
                                document3 = document822;
                                gn5Var7 = gn5Var8;
                                tLObject3 = document822;
                                j2 = 0;
                                gn5Var9 = gn5Var7;
                                tLObject4 = tLObject3;
                            }
                        } else {
                            long j6 = document4.size;
                            TLRPC.VideoSize J02 = k47.J0(document4);
                            document3 = document4;
                            j2 = j6;
                            document2 = null;
                            tLObject4 = null;
                            gn5Var9 = J02 != null ? gn5.d(J02, document4) : null;
                            str = "d";
                            vucVar = null;
                        }
                        z4 = false;
                        TLRPC.Document document722 = document3;
                        tLObject2 = document2;
                        j = j2;
                        str2 = null;
                        i3 = 1;
                        ao6Var = null;
                        document5 = document722;
                        gn5Var6 = gn5Var9;
                        r11 = tLObject4;
                    }
                    str = null;
                    vucVar = null;
                    r7 = null;
                    document2 = r7;
                    gn5Var8 = r7;
                    TLRPC.Document document8222 = document2;
                    document3 = document8222;
                    gn5Var7 = gn5Var8;
                    tLObject3 = document8222;
                    j2 = 0;
                    gn5Var9 = gn5Var7;
                    tLObject4 = tLObject3;
                    z4 = false;
                    TLRPC.Document document7222 = document3;
                    tLObject2 = document2;
                    j = j2;
                    str2 = null;
                    i3 = 1;
                    ao6Var = null;
                    document5 = document7222;
                    gn5Var6 = gn5Var9;
                    r11 = tLObject4;
                } else if (obj4 instanceof no6) {
                    no6 no6Var = (no6) obj4;
                    TLRPC.PhotoSize photoSize4 = no6Var.L;
                    if (photoSize4 != null) {
                        tLObject2 = no6Var.K;
                        j = photoSize4.size;
                        photoSize3 = photoSize4;
                        document = null;
                        str3 = null;
                    } else {
                        String str11 = no6Var.i;
                        if (str11 != null) {
                            str3 = str11;
                            document = null;
                            photoSize3 = null;
                            tLObject2 = null;
                            j = 0;
                        } else {
                            document = no6Var.J;
                            if (document != null) {
                                j = document.size;
                                photoSize3 = null;
                                tLObject2 = null;
                                str3 = null;
                            } else {
                                String str12 = no6Var.C;
                                j = no6Var.G;
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
                    ao6Var = no6Var.A;
                    str = "d";
                    vucVar = null;
                    document5 = document;
                    gn5Var6 = null;
                    r11 = photoSize3;
                } else {
                    str = null;
                    vucVar = null;
                    gn5Var6 = null;
                    r11 = 0;
                    ao6Var = null;
                    tLObject2 = null;
                    str2 = null;
                    i3 = 0;
                    z4 = false;
                    j = 0;
                }
            }
            if (document5 != null) {
                TLRPC.PhotoSize w4 = bc4.w(document5.thumbs, 90, false, null, false);
                if (gn5Var6 != null) {
                    gn5 b2 = gn5.b(document5);
                    if (jn5Var8 == null) {
                        gn5Var12 = gn5.c(w4, document5);
                        gn5Var11 = b2;
                    } else {
                        gn5Var11 = b2;
                        gn5Var12 = null;
                    }
                    Locale locale5 = Locale.US;
                    gn5 gn5Var15 = gn5Var6;
                    String n = td4.n(Y0, Y0, "_");
                    if (jn5Var8 != null) {
                        BitmapDrawable bitmapDrawable5 = new BitmapDrawable(jn5Var8.c);
                        gn5Var13 = gn5Var15;
                        obj2 = obj4;
                        bitmapDrawable4 = bitmapDrawable5;
                    } else {
                        gn5Var13 = gn5Var15;
                        obj2 = obj4;
                        bitmapDrawable4 = null;
                    }
                    ao6Var2 = ao6Var;
                    imageReceiver.Y(gn5Var11, "d", gn5Var13, null, gn5Var12, n, bitmapDrawable4, j, null, obj2, i3);
                } else {
                    long j7 = j;
                    ao6Var2 = ao6Var;
                    int i8 = i3;
                    gn5 b3 = gn5.b(document5);
                    gn5 c = jn5Var8 == null ? gn5.c(w4, document5) : null;
                    Locale locale6 = Locale.US;
                    imageReceiver.Z(b3, "d", c, td4.n(Y0, Y0, "_"), jn5Var8 != null ? new BitmapDrawable(jn5Var8.c) : null, j7, null, obj4, i8);
                }
            } else {
                ao6 ao6Var5 = ao6Var;
                int i10 = i3;
                if (r11 == 0) {
                    ao6Var2 = ao6Var5;
                    String str13 = str;
                    if (vucVar == null) {
                        z5 = z4;
                        if (jn5Var8 != null) {
                            drawable2 = new BitmapDrawable(jn5Var8.c);
                        } else if (!z5 || (activity = this.E) == null) {
                            drawable = null;
                            imageReceiver.e0(str2, str13, drawable, null, j);
                        } else {
                            drawable2 = activity.getResources().getDrawable(R.drawable.nophotos);
                        }
                        drawable = drawable2;
                        imageReceiver.e0(str2, str13, drawable, null, j);
                    } else if (gn5Var6 != null) {
                        imageReceiver.a0(gn5.p(vucVar), str13, gn5Var6, null, null, obj4, i10);
                    } else {
                        gn5 p = gn5.p(vucVar);
                        if (jn5Var8 != null) {
                            drawable3 = new BitmapDrawable(jn5Var8.c);
                            z5 = z4;
                        } else {
                            z5 = z4;
                            drawable3 = (!z5 || (activity2 = this.E) == null) ? null : activity2.getResources().getDrawable(R.drawable.nophotos);
                        }
                        imageReceiver.d0(p, str13, drawable3, null, obj4, i10);
                    }
                    if (n43Var != null) {
                        z6 = z5;
                        ao6Var3 = ao6Var2;
                        imageReceiver2 = imageReceiver;
                    } else if (ao6Var2 != null) {
                        float f2 = ao6Var2.a;
                        float f3 = ao6Var2.b;
                        float f4 = ao6Var2.d;
                        int i11 = ao6Var2.k;
                        float f5 = ao6Var2.c;
                        float f6 = ao6Var2.e;
                        float f7 = ao6Var2.f;
                        boolean z9 = ao6Var2.l;
                        z6 = z5;
                        ao6Var3 = ao6Var2;
                        imageReceiver2 = imageReceiver;
                        n43Var.b(true, f2, f3, f4, i11, f5, 1.0f, 1.0f, f6, f7, 0.0f, 0.0f, z9);
                    } else {
                        z6 = z5;
                        ao6Var3 = ao6Var2;
                        imageReceiver2 = imageReceiver;
                        n43Var.a = false;
                    }
                    if (imageReceiver2 != this.A4) {
                        this.H1 = ao6Var3;
                        this.G4 = z6;
                        return;
                    }
                    ao6 ao6Var6 = ao6Var3;
                    boolean z10 = z6;
                    if (imageReceiver2 == this.C4) {
                        this.I1 = ao6Var6;
                        this.J4 = z10;
                        return;
                    }
                    return;
                }
                gn5 f8 = gn5.f(r11, tLObject2);
                ao6Var2 = ao6Var5;
                imageReceiver.c0(f8, str, jn5Var8 != null ? new BitmapDrawable(jn5Var8.c) : null, j, null, obj4, i10);
            }
            z5 = z4;
            if (n43Var != null) {
            }
            if (imageReceiver2 != this.A4) {
            }
        }
    }

    public final void N2() {
        kdc kdcVar;
        int i;
        int i2;
        String str;
        kdc kdcVar2;
        kdc Z;
        String str2;
        ArrayList arrayList;
        String str3;
        String str4;
        String str5;
        k47 k47Var;
        ndc ndcVar;
        kdc kdcVar3;
        int i3;
        kdc kdcVar4;
        String str6;
        String str7;
        if (this.l7 == null && this.V4 == null && this.U4 != null) {
            L2();
        }
        ndc ndcVar2 = this.G2;
        String str8 = "";
        if (ndcVar2 == null || ndcVar2.Y() <= 1) {
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
        ndc ndcVar3 = this.G2;
        int T = ndcVar3.T();
        kdc Z2 = (T < 0 || T >= ndcVar3.Y()) ? null : ndcVar3.Z(T);
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
            textView.setText(jb6.M0(2131746186, null));
            textView.setTypeface(gm.o());
            textView.setPadding(gm.L(16.0f), gm.L(9.0f), gm.L(16.0f), gm.L(8.0f));
            textView.setTextSize(1, 14.0f);
            int i4 = -1;
            textView.setTextColor(-1);
            this.y0.addView(textView, qoe.o(-1, -2));
            final int i5 = -1;
            while (i5 < this.G2.Y()) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (i5 == i4) {
                    spannableStringBuilder.append((CharSequence) jb6.M0(2131746188, null));
                    if (i5 != this.G2.e0 || Z2 == null) {
                        kdcVar3 = Z2;
                        i3 = T2;
                        kdcVar4 = null;
                    } else {
                        spannableStringBuilder.append((CharSequence) " ");
                        int length = spannableStringBuilder.length();
                        if (gda.N0) {
                            spannableStringBuilder.append((CharSequence) Integer.toString(Z2.b)).append((CharSequence) "x").append((CharSequence) Integer.toString(Z2.c));
                        } else {
                            spannableStringBuilder.append((CharSequence) String.valueOf(Z2.b())).append((CharSequence) "p");
                        }
                        kdcVar3 = Z2;
                        i3 = T2;
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(cmb.p1(0.5f, -1)), length, spannableStringBuilder.length(), 33);
                        kdcVar4 = kdcVar3;
                    }
                } else {
                    kdcVar3 = Z2;
                    i3 = T2;
                    kdc Z3 = this.G2.Z(i5);
                    if (Z3.a) {
                        spannableStringBuilder.append((CharSequence) jb6.M0(2131746185, null));
                    } else if (Z3.b() >= 2000) {
                        spannableStringBuilder.append((CharSequence) jb6.M0(2131746195, null));
                    } else if (Z3.b() >= 1400) {
                        spannableStringBuilder.append((CharSequence) jb6.M0(2131746197, null));
                    } else if (Z3.b() >= 1000) {
                        spannableStringBuilder.append((CharSequence) jb6.M0(2131746200, null));
                    } else if (Z3.b() >= 700) {
                        spannableStringBuilder.append((CharSequence) jb6.M0(2131746190, null));
                    } else if (Z3.b() >= 400) {
                        spannableStringBuilder.append((CharSequence) jb6.M0(2131746191, null));
                    } else if (Z3.b() >= 340) {
                        spannableStringBuilder.append((CharSequence) jb6.M0(2131746192, null));
                    } else if (Z3.b() >= 200) {
                        spannableStringBuilder.append((CharSequence) jb6.M0(2131746193, null));
                    } else {
                        spannableStringBuilder.append((CharSequence) jb6.M0(2131746198, null));
                    }
                    spannableStringBuilder.append((CharSequence) " ");
                    int length2 = spannableStringBuilder.length();
                    if (gda.N0) {
                        spannableStringBuilder.append((CharSequence) Integer.toString(Z3.b)).append((CharSequence) "x").append((CharSequence) Integer.toString(Z3.c));
                    } else {
                        spannableStringBuilder.append((CharSequence) String.valueOf(Z3.b())).append((CharSequence) "p");
                    }
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(cmb.p1(0.5f, -1)), length2, spannableStringBuilder.length(), 33);
                    kdcVar4 = Z3;
                }
                a8 c = r7.c(false, false, this.y0, 0, spannableStringBuilder, true, null);
                if (!gda.N0 || kdcVar4 == null) {
                    str6 = str9;
                    str7 = str10;
                    c.setSubtext("");
                } else {
                    StringBuilder sb = new StringBuilder();
                    ArrayList arrayList3 = kdcVar4.d;
                    int size = arrayList3.size();
                    int i6 = 0;
                    while (i6 < size) {
                        Object obj = arrayList3.get(i6);
                        int i7 = i6 + 1;
                        mdc mdcVar = (mdc) obj;
                        if (sb.length() > 0) {
                            sb.append(str10);
                        }
                        ArrayList arrayList4 = arrayList3;
                        if (!TextUtils.isEmpty(mdcVar.m)) {
                            sb.append(mdcVar.m);
                            sb.append(str9);
                        }
                        int i8 = size;
                        sb.append(gm.i0(mdcVar.k, false, false).replace(" ", ""));
                        sb.append("(");
                        StringBuilder sb2 = new StringBuilder();
                        String str12 = str9;
                        String str13 = str10;
                        sb2.append(gm.i0((long) mdcVar.l, false, false).replace(" ", ""));
                        sb2.append("/s)");
                        sb.append(sb2.toString());
                        sb.append(mdcVar.c() ? "!" : " ");
                        sb.append(mdcVar.b() ? "!" : " ");
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
                c.setOnClickListener(new View.OnClickListener(this) { // from class: a98
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
                                photoViewer.v(i10);
                                break;
                            default:
                                Drawable[] drawableArr2 = PhotoViewer.d9;
                                photoViewer.v(i10);
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
                Z2 = kdcVar3;
                i4 = -1;
            }
            kdcVar = Z2;
            i = T2;
            j8 j8Var = new j8(cmb.G8, this.w2, this.F);
            j8Var.setTag(R.id.fit_width_tag, 1);
            j8Var.setColor(-15198184);
            this.y0.addView(j8Var, qoe.o(-1, 8));
        } else {
            kdcVar = Z2;
            i = T2;
            String str14 = ", ";
            String str15 = "\n";
            final int i10 = -1;
            while (i10 < this.G2.Y()) {
                int i11 = i10 + 1;
                a8 a8Var = (a8) arrayList2.get(i11);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                if (i10 == -1) {
                    spannableStringBuilder2.append((CharSequence) jb6.M0(2131746188, null));
                    if (i10 != this.G2.e0 || kdcVar == null) {
                        i2 = i11;
                        str = str14;
                        kdcVar2 = kdcVar;
                        str2 = str11;
                        Z = null;
                    } else {
                        spannableStringBuilder2.append((CharSequence) " ");
                        int length3 = spannableStringBuilder2.length();
                        if (gda.N0) {
                            kdcVar2 = kdcVar;
                            spannableStringBuilder2.append((CharSequence) Integer.toString(kdcVar2.b)).append((CharSequence) str11).append((CharSequence) Integer.toString(kdcVar2.c));
                        } else {
                            kdcVar2 = kdcVar;
                            spannableStringBuilder2.append((CharSequence) String.valueOf(kdcVar2.b())).append((CharSequence) "p");
                        }
                        i2 = i11;
                        str = str14;
                        spannableStringBuilder2.setSpan(new ForegroundColorSpan(cmb.p1(0.5f, -1)), length3, spannableStringBuilder2.length(), 33);
                        str2 = str11;
                        Z = kdcVar2;
                    }
                } else {
                    i2 = i11;
                    str = str14;
                    kdcVar2 = kdcVar;
                    Z = this.G2.Z(i10);
                    if (Z.a) {
                        spannableStringBuilder2.append((CharSequence) jb6.M0(2131746185, null));
                    } else if (Z.b() >= 2000) {
                        spannableStringBuilder2.append((CharSequence) jb6.M0(2131746195, null));
                    } else if (Z.b() >= 1400) {
                        spannableStringBuilder2.append((CharSequence) jb6.M0(2131746197, null));
                    } else if (Z.b() >= 1000) {
                        spannableStringBuilder2.append((CharSequence) jb6.M0(2131746200, null));
                    } else if (Z.b() >= 700) {
                        spannableStringBuilder2.append((CharSequence) jb6.M0(2131746190, null));
                    } else if (Z.b() >= 400) {
                        spannableStringBuilder2.append((CharSequence) jb6.M0(2131746191, null));
                    } else if (Z.b() >= 340) {
                        spannableStringBuilder2.append((CharSequence) jb6.M0(2131746192, null));
                    } else if (Z.b() >= 200) {
                        spannableStringBuilder2.append((CharSequence) jb6.M0(2131746193, null));
                    } else {
                        spannableStringBuilder2.append((CharSequence) jb6.M0(2131746198, null));
                    }
                    spannableStringBuilder2.append((CharSequence) " ");
                    int length4 = spannableStringBuilder2.length();
                    if (gda.N0) {
                        spannableStringBuilder2.append((CharSequence) Integer.toString(Z.b)).append((CharSequence) str11).append((CharSequence) Integer.toString(Z.c));
                    } else {
                        spannableStringBuilder2.append((CharSequence) String.valueOf(Z.b())).append((CharSequence) "p");
                    }
                    str2 = str11;
                    spannableStringBuilder2.setSpan(new ForegroundColorSpan(cmb.p1(0.5f, -1)), length4, spannableStringBuilder2.length(), 33);
                }
                a8Var.setText(spannableStringBuilder2);
                a8Var.setVisibility(0);
                if (!gda.N0 || Z == null) {
                    arrayList = arrayList2;
                    str3 = str;
                    str4 = str15;
                    a8Var.setSubtext("");
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    ArrayList arrayList5 = Z.d;
                    int size2 = arrayList5.size();
                    int i12 = 0;
                    while (i12 < size2) {
                        Object obj2 = arrayList5.get(i12);
                        int i13 = i12 + 1;
                        mdc mdcVar2 = (mdc) obj2;
                        String str16 = str15;
                        if (sb3.length() > 0) {
                            sb3.append(str16);
                        }
                        if (TextUtils.isEmpty(mdcVar2.m)) {
                            str5 = str;
                        } else {
                            sb3.append(mdcVar2.m);
                            str5 = str;
                            sb3.append(str5);
                        }
                        int i14 = size2;
                        ArrayList arrayList6 = arrayList5;
                        sb3.append(gm.i0(mdcVar2.k, false, false).replace(" ", ""));
                        sb3.append(" (");
                        StringBuilder sb4 = new StringBuilder();
                        ArrayList arrayList7 = arrayList2;
                        sb4.append(gm.i0((long) mdcVar2.l, false, false).replace(" ", ""));
                        sb4.append("/s)");
                        sb3.append(sb4.toString());
                        sb3.append(mdcVar2.c() ? "!" : " ");
                        sb3.append(mdcVar2.b() ? "!" : " ");
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
                    a8Var.setSubtext(sb3.toString());
                }
                a8Var.setChecked(i10 == this.G2.e0);
                final byte b2 = 1;
                a8Var.setOnClickListener(new View.OnClickListener(this) { // from class: a98
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
                                photoViewer.v(i102);
                                break;
                            default:
                                Drawable[] drawableArr2 = PhotoViewer.d9;
                                photoViewer.v(i102);
                                break;
                        }
                    }
                });
                arrayList2 = arrayList;
                kdcVar = kdcVar2;
                str14 = str3;
                i10 = i2;
                str11 = str2;
                str15 = str4;
            }
        }
        kdc kdcVar5 = kdcVar;
        if (kdcVar5 != null) {
            if (kdcVar5.b() >= 2000) {
                str8 = jb6.M0(2131746194, null);
            } else if (kdcVar5.b() >= 1000) {
                str8 = jb6.M0(2131746199, null);
            } else if (kdcVar5.b() >= 700) {
                str8 = jb6.M0(2131746189, null);
            } else {
                str8 = kdcVar5.b() + "p";
            }
        }
        this.x0.g.t(str8, true, true);
        ka8 ka8Var = this.s3;
        if (ka8Var != null && (k47Var = this.S4) != null && (ndcVar = this.G2) != null) {
            ka8Var.c(k47Var, ndcVar);
        }
        if (this.t7 != i) {
            try {
                fp.b(0);
                if (hi2.v().D()) {
                    hi2.v().Q(k0());
                }
                ndc ndcVar4 = this.G2;
                if (ndcVar4 != null) {
                    fp.z(ndcVar4.c0());
                }
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
    }

    public final void O() {
        a26 a26Var = this.r7;
        if (a26Var != null) {
            a26Var.a();
            this.r7 = null;
        }
        a26 a26Var2 = this.c2;
        if (a26Var2 != null) {
            a26Var2.a();
            this.c2 = null;
        }
        try {
            if (this.h0.getParent() != null) {
                ((WindowManager) this.E.getSystemService("window")).removeView(this.h0);
                a1();
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    public final void O1(int i, kw7 kw7Var) {
        ArrayList arrayList;
        String str;
        boolean z;
        if (kw7Var != null) {
            kw7Var.a();
            kw7Var.setVisibility(8);
            ArrayList arrayList2 = this.f7;
            if (arrayList2.isEmpty() || i < 0 || i >= arrayList2.size()) {
                return;
            }
            Object obj = arrayList2.get(i);
            if (obj instanceof jo6) {
                jo6 jo6Var = (jo6) obj;
                z = jo6Var.b;
                str = jo6Var.j;
                arrayList = jo6Var.p;
            } else {
                if (obj instanceof no6) {
                    no6 no6Var = (no6) obj;
                    str = no6Var.j;
                    arrayList = no6Var.p;
                } else {
                    arrayList = null;
                    str = null;
                }
                z = false;
            }
            kw7Var.setVisibility(0);
            kw7Var.b(arrayList, z, false, this.d2 != 11);
            if (str == null) {
                kw7Var.a = null;
                kw7Var.d = null;
                kw7Var.setBackground(null);
            } else {
                kw7Var.a = BitmapFactory.decodeFile(str);
                BitmapDrawable bitmapDrawable = new BitmapDrawable(kw7Var.a);
                kw7Var.d = bitmapDrawable;
                kw7Var.setBackground(bitmapDrawable);
            }
        }
    }

    public final void O2() {
        k47 k47Var;
        pb8 pb8Var = this.d;
        if (pb8Var != null) {
            int H = pb8Var.H();
            this.P0.a(H);
            if (H == 0) {
                A2(false, true);
            }
            if (this.T0 != null) {
                pb8 pb8Var2 = this.d;
                long a = pb8Var2 != null ? pb8Var2.a() : 0L;
                if (a == 0 && (k47Var = this.S4) != null) {
                    a = k47.B0(k47Var.k);
                }
                vi3 vi3Var = this.T0;
                pb8 pb8Var3 = this.d;
                long L1 = (pb8Var3 == null || !pb8Var3.p() || this.d.v()) ? oc7.r1(this.U).L1(a) : 0L;
                pb8 pb8Var4 = this.d;
                vi3Var.i(Math.max(1, pb8Var4 == null ? 1 : pb8Var4.H()), L1, true);
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
    public final void P(Canvas canvas, wm0 wm0Var, int i, int i2, boolean z, boolean z2, boolean z3) {
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
        ya8 ya8Var;
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
        ao6 ao6Var;
        Bitmap b4;
        oa8 oa8Var;
        float f44;
        float f45;
        float f46;
        float f47;
        float f48;
        Shader shader;
        int i16;
        Bitmap d4;
        oa8 oa8Var2;
        PhotoViewer photoViewer = this;
        wm0 wm0Var2 = wm0Var;
        if (a()) {
            RenderNode v0 = photoViewer.v0(wm0Var2.c);
            int k = gm.k(i, wm0Var2.c);
            if (photoViewer.P8 == null || v0 == null || !canvas.isHardwareAccelerated()) {
                canvas.drawColor(on2.l(i2, k));
                return;
            }
            canvas.drawColor(k);
            canvas.save();
            canvas.scale(photoViewer.P8.getWidth() / v0.getWidth(), photoViewer.P8.getHeight() / v0.getHeight());
            canvas.drawRenderNode(v0);
            canvas.restore();
            canvas.drawColor(i2);
            return;
        }
        boolean z10 = gda.Z;
        ln lnVar = photoViewer.J8;
        if (z10) {
            byte b5 = photoViewer.m4;
            d = lnVar.d(b5 == 0 || b5 == 2 || b5 == 3);
        } else {
            d = 1.0f;
        }
        wm0Var2.h.setShader(null);
        if (i != 0) {
            wm0Var2.h.setColor(i);
            wm0Var2.h.setAlpha((int) (gm.R1(0.7f, 1.0f, z2 ? d : 1.0f) * r2.getAlpha()));
            canvas.drawPaint(wm0Var2.h);
        }
        if (!gda.Z || photoViewer.m4 != 0) {
            float f49 = d;
            lnVar.e(true, 0.0f);
            if (i2 != 0) {
                wm0Var2.h.setColor(i2);
                Paint paint = wm0Var2.h;
                float alpha = paint.getAlpha();
                if (!z2) {
                    f49 = 1.0f;
                }
                paint.setAlpha((int) (gm.R1(0.7f, 1.0f, f49) * alpha));
                canvas.drawPaint(wm0Var2.h);
                return;
            }
            return;
        }
        if (z3) {
            if (photoViewer.K8 == null) {
                ln[] lnVarArr = new ln[3];
                photoViewer.K8 = lnVarArr;
                byte b6 = 21;
                n88 n88Var = new n88(photoViewer, b6);
                d53 d53Var = d53.g;
                b = 2;
                lnVarArr[0] = new ln(n88Var, 180L, d53Var);
                photoViewer.K8[1] = new ln(new n88(photoViewer, b6), 180L, d53Var);
                photoViewer.K8[2] = new ln(new n88(photoViewer, b6), 180L, d53Var);
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
            canvas.translate((photoViewer.s0() / 2) - (photoViewer.w0() / 2), 0.0f);
            if (z3) {
                photoViewer.N8.preTranslate((photoViewer.s0() / 2) - (photoViewer.w0() / 2), 0.0f);
            }
        }
        if (photoViewer.o6 != null) {
            float R1 = gm.R1(0.0f, photoViewer.f6, photoViewer.k6);
            float R12 = gm.R1(photoViewer.Z5, photoViewer.d6, photoViewer.k6);
            f = gm.R1(photoViewer.a6, photoViewer.e6, photoViewer.k6);
            float R13 = gm.R1(photoViewer.X5, photoViewer.c6, photoViewer.k6);
            i3 = 0;
            f2 = gm.R1(photoViewer.W5, photoViewer.b6, photoViewer.k6);
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
        int h0 = photoViewer.h0();
        int g0 = photoViewer.g0();
        if (photoViewer.I3 && (oa8Var2 = photoViewer.z2) != null && oa8Var2.getVisibility() == 0) {
            g0 = photoViewer.A0();
        }
        if (photoViewer.t4 == 0 && photoViewer.d2 != 1 && photoViewer.Z5 >= 1.0f && !photoViewer.Q6 && !photoViewer.J6) {
            if (f52 > photoViewer.E6 + gm.L(5.0f)) {
                imageReceiver = photoViewer.A4;
            } else if (f52 < photoViewer.D6 - gm.L(5.0f)) {
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
                        float min2 = Math.min(1.0f, (f53 - f52) / h0);
                        f48 = (1.0f - min2) * 0.3f;
                        f45 = 1.0f;
                        f47 = min2;
                        f46 = (-h0) - (gm.L(30.0f) / 2);
                        if (imageReceiver.B()) {
                            i5 = g0;
                            f6 = f;
                            imageReceiver3 = imageReceiver;
                            arrayList = arrayList2;
                            i4 = saveCount;
                            f7 = f3;
                            f8 = f44;
                        } else {
                            canvas.save();
                            canvas.translate(h0 / 2, g0 / 2);
                            canvas.translate((gm.L(30.0f) / 2) + h0 + f46, 0.0f);
                            float f54 = f45 - f48;
                            canvas.scale(f54, f54);
                            i5 = g0;
                            int q2 = imageReceiver.q();
                            float f55 = f;
                            int o2 = imageReceiver.o();
                            if (photoViewer.J4) {
                                imageReceiver3 = imageReceiver;
                                arrayList = arrayList2;
                                f6 = f55;
                            } else {
                                ao6 ao6Var2 = photoViewer.I1;
                                if (ao6Var2 != null) {
                                    arrayList = arrayList2;
                                    n43 n43Var = photoViewer.G1;
                                    if (n43Var.a) {
                                        imageReceiver3 = imageReceiver;
                                        f6 = f55;
                                        i4 = saveCount;
                                        f7 = f3;
                                        f8 = f44;
                                        h0 = h0;
                                        shader = null;
                                        photoViewer = this;
                                        photoViewer.d(canvas, h0, i5, q2, o2, 1.0f, n43Var, ao6Var2);
                                        float f56 = q2;
                                        float f57 = o2;
                                        float min3 = Math.min(h0 / f56, i5 / f57);
                                        int i17 = (int) (f56 * min3);
                                        int i18 = (int) (f57 * min3);
                                        if (!arrayList.isEmpty()) {
                                            if (photoViewer.t4 == 1 || photoViewer.d2 == 1) {
                                                i16 = photoViewer.G1.h;
                                            } else {
                                                ao6 ao6Var3 = photoViewer.I1;
                                                if (ao6Var3 != null && ao6Var3.l) {
                                                    i16 = 1;
                                                }
                                            }
                                            if (i16 != 0) {
                                                canvas.scale(-1.0f, f45);
                                            }
                                            d4 = photoViewer.F4.d(imageReceiver3);
                                            if (d4 != null) {
                                                wm0Var2.h.setShader(shader);
                                                wm0Var2.h.setAlpha((int) mlb.C(f47, 255.0f, f8, e));
                                                canvas.scale(d4.getWidth() / (d4.getWidth() - 3.0f), d4.getHeight() / (d4.getHeight() - 3.0f));
                                                canvas.translate((-i17) / 2, (-i18) / 2);
                                                canvas.scale((i17 * 1.0f) / d4.getWidth(), (i18 * 1.0f) / d4.getHeight());
                                                if (z) {
                                                    int i19 = i3;
                                                    canvas.clipRect(i19, i19, d4.getWidth(), d4.getHeight());
                                                }
                                                canvas.drawBitmap(d4, 0.0f, 0.0f, wm0Var2.h);
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
                            h0 = h0;
                            shader = null;
                            float f562 = q2;
                            float f572 = o2;
                            float min32 = Math.min(h0 / f562, i5 / f572);
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
                i5 = g0;
            }
            if (!photoViewer.Q6) {
                float f58 = photoViewer.E6;
                if (f52 > f58 && photoViewer.t4 == 0 && photoViewer.d2 != 1) {
                    float min4 = Math.min(1.0f, (f52 - f58) / h0);
                    float f59 = min4 * 0.3f;
                    f11 = 1.0f - min4;
                    f10 = photoViewer.E6;
                    f12 = f59;
                    boolean z11 = (photoViewer.I3 || (oa8Var = photoViewer.z2) == null || oa8Var.getVisibility() != 0) ? false : true;
                    if (!photoViewer.B4.B() || (z11 && photoViewer.H3)) {
                        canvas.save();
                        int i20 = h0 / 2;
                        int i21 = i5 / 2;
                        f13 = 2.0f;
                        canvas.translate(photoViewer.Z(photoViewer.t4) + i20, photoViewer.a0(photoViewer.t4) + i21);
                        float f60 = f4 + 0.0f;
                        canvas.translate(f10, f60);
                        f14 = f7 - f12;
                        canvas.scale(f14, f14);
                        float f61 = f6;
                        canvas.rotate(f61);
                        if (z3) {
                            z4 = z11;
                            photoViewer.N8.preTranslate(photoViewer.Z(photoViewer.t4) + i20, photoViewer.a0(photoViewer.t4) + i21);
                            photoViewer.N8.preTranslate(f10, f60);
                            photoViewer.N8.preScale(f14, f14, 0.0f, 0.0f);
                            photoViewer.N8.preRotate(f61);
                        } else {
                            z4 = z11;
                        }
                        if (photoViewer.t4 == 3 && photoViewer.M1 != null) {
                            int f0 = photoViewer.f0(0, true);
                            sa8 sa8Var = photoViewer.M1;
                            int i22 = gm.q.y;
                            Typeface typeface = gm.a;
                            gm.L(20.0f);
                            photoViewer.M1.getClass();
                            float f02 = (((f0 - sa8Var.d2) - photoViewer.f0(0, false)) / 2.0f) * 1.0f;
                            canvas.translate(0.0f, f02);
                            if (z3) {
                                Matrix matrix = photoViewer.N8;
                                photoViewer.M1.getClass();
                                matrix.preTranslate(0.0f, f02);
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
                        f15 = h0;
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
                            i7 = h0;
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
                                    min = photoViewer.j0(false);
                                    f24 = q3 * min;
                                    f65 = min * f41;
                                    f19 = f14;
                                    if (photoViewer.s1) {
                                        i7 = h0;
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
                                            i7 = h0;
                                            float max2 = Math.max(max, Math.max(fArr7[4], fArr7[6]));
                                            float[] fArr8 = photoViewer.O8;
                                            float max3 = Math.max(fArr8[1], fArr8[3]);
                                            float[] fArr9 = photoViewer.O8;
                                            imageReceiver4 = imageReceiver3;
                                            rectF.set(min7, min9, max2, Math.max(max3, Math.max(fArr9[5], fArr9[7])));
                                            f42 = photoViewer.K8[1].d(photoViewer.L8.intersect(photoViewer.M8));
                                        } else {
                                            i7 = h0;
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
                                            wm0Var2.h.setShader(null);
                                            wm0Var2.h.setAlpha((int) td4.z(1.0f, photoViewer.N3, f42 * 255.0f * f11, f8));
                                            canvas.scale(d2.getWidth() / (d2.getWidth() - 3.0f), d2.getHeight() / (d2.getHeight() - 3.0f));
                                            canvas.translate((-f24) / 2.0f, (-f65) / 2.0f);
                                            canvas.scale((f24 * 1.0f) / d2.getWidth(), (f65 * 1.0f) / d2.getHeight());
                                            if (z) {
                                                canvas.clipRect(0, 0, d2.getWidth(), d2.getHeight());
                                            }
                                            f43 = 0.0f;
                                            canvas.drawBitmap(d2, 0.0f, 0.0f, wm0Var2.h);
                                            canvas.restore();
                                        }
                                        if (photoViewer.N3 > f43 && (b3 = photoViewer.c0.b()) != null) {
                                            canvas.save();
                                            wm0Var2.h.setShader(null);
                                            wm0Var2.h.setAlpha((int) (f42 * 255.0f * f11 * photoViewer.N3 * f8));
                                            canvas.scale(b3.getWidth() / (b3.getWidth() - 3.0f), b3.getHeight() / (b3.getHeight() - 3.0f));
                                            canvas.translate((-f24) / 2.0f, (-f65) / 2.0f);
                                            canvas.scale((f24 * 1.0f) / b3.getWidth(), (f65 * 1.0f) / b3.getHeight());
                                            if (z) {
                                                canvas.clipRect(0, 0, b3.getWidth(), b3.getHeight());
                                            }
                                            canvas.drawBitmap(b3, 0.0f, 0.0f, wm0Var2.h);
                                            canvas.restore();
                                        }
                                        z5 = true;
                                        isEmpty = arrayList.isEmpty();
                                        ib8 ib8Var = photoViewer.W4;
                                        n43 n43Var2 = photoViewer.E1;
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
                                                            z7 = n43Var2.h;
                                                        } else {
                                                            ao6 ao6Var4 = ib8Var.c;
                                                            if (ao6Var4 != null && ao6Var4.l) {
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
                                                            canvas.skew(0.0f, td4.z(f28, f5, 4.0f * f5, 0.25f));
                                                        }
                                                        ya8Var = photoViewer.g0;
                                                        if (ya8Var != null || ya8Var.n.getVisibility() == 0) {
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
                                                                wm0Var2 = wm0Var;
                                                                wm0Var2.h.setShader(null);
                                                                f8 = f27;
                                                                wm0Var2.h.setAlpha((int) mlb.C(f25, 255.0f, f30, f8));
                                                                canvas.scale(b2.getWidth() / (b2.getWidth() - 3.0f), b2.getHeight() / (b2.getHeight() - 3.0f));
                                                                canvas.translate((-f24) / 2.0f, (-f29) / 2.0f);
                                                                canvas.scale((f24 * 1.0f) / b2.getWidth(), (f29 * 1.0f) / b2.getHeight());
                                                                if (z) {
                                                                    canvas.clipRect(0, 0, b2.getWidth(), b2.getHeight());
                                                                }
                                                                canvas.drawBitmap(b2, 0.0f, 0.0f, wm0Var2.h);
                                                                if (z8) {
                                                                    canvas.restore();
                                                                }
                                                                z6 = true;
                                                            }
                                                        }
                                                        wm0Var2 = wm0Var;
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
                                                    ya8Var = photoViewer.g0;
                                                    if (ya8Var != null) {
                                                    }
                                                    if (z3) {
                                                    }
                                                    b2 = photoViewer.c0.b();
                                                    if (b2 == null) {
                                                    }
                                                    if (b2 != null) {
                                                    }
                                                    wm0Var2 = wm0Var;
                                                    f8 = f27;
                                                    if (z8) {
                                                    }
                                                    z6 = true;
                                                } else {
                                                    wm0Var2 = wm0Var;
                                                    f8 = f27;
                                                }
                                                canvas.restore();
                                            }
                                            int i27 = n43Var2.i;
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
                                                float f66 = n43Var2.j;
                                                float f67 = n43Var2.k;
                                                f32 = i8;
                                                f26 = f65;
                                                f33 = 1.0f - f31;
                                                int A = (int) mlb.A(1.0f - f66, f33, f66, f32);
                                                f34 = i10;
                                                int i29 = (int) ((((1.0f - f67) * f33) + f67) * f34);
                                                f35 = A;
                                                f36 = f20 / f35;
                                                f37 = i29;
                                                if (f36 * f37 > f23) {
                                                    f36 = f23 / f37;
                                                }
                                                if (i28 != 1 && ((b7 != 1 || photoViewer.n6 == 0) && ib8Var.c != null)) {
                                                    float f68 = f35 * f36;
                                                    float f69 = f37 * f36;
                                                    if (f22 * f62 > f23) {
                                                        f22 = f63;
                                                    }
                                                    float A2 = td4.A((f21 * f22) / f19, f68, f33, f68);
                                                    float A3 = td4.A((f62 * f22) / f19, f69, f33, f69);
                                                    canvas.clipRect((-A2) / 2.0f, (-A3) / 2.0f, A2 / 2.0f, A3 / 2.0f);
                                                }
                                                i11 = photoViewer.d2;
                                                if (i11 != 1 || n43Var2.a) {
                                                    if (photoViewer.t4 != 1 || i11 == 1) {
                                                        textureView = photoViewer.C2;
                                                        if (textureView != null) {
                                                            textureView.setScaleX(n43Var2.h ? -1.0f : 1.0f);
                                                            kb8 kb8Var = photoViewer.F2;
                                                            if (kb8Var != null) {
                                                                kb8Var.setScaleX(photoViewer.C2.getScaleX());
                                                            }
                                                        }
                                                        float A4 = n43Var2.f / td4.A(n43Var2.l, 1.0f, f33, 1.0f);
                                                        f38 = f20 / f32;
                                                        if (f38 * f34 > f23) {
                                                            f38 = f23 / f34;
                                                        }
                                                        float f70 = (f38 / min5) * A4;
                                                        if (photoViewer.d2 == 1) {
                                                            if (photoViewer.t4 == 3 || (i12 = photoViewer.n6) == 3) {
                                                                f70 /= ((n43Var2.m - 1.0f) * f33) + 1.0f;
                                                            } else if (i12 == 0) {
                                                                f70 /= n43Var2.m;
                                                            }
                                                        }
                                                        f39 = f70;
                                                    } else {
                                                        TextureView textureView2 = photoViewer.C2;
                                                        if (textureView2 != null) {
                                                            ao6 ao6Var5 = ib8Var.c;
                                                            textureView2.setScaleX((ao6Var5 == null || !ao6Var5.l) ? 1.0f : -1.0f);
                                                            kb8 kb8Var2 = photoViewer.F2;
                                                            if (kb8Var2 != null) {
                                                                kb8Var2.setScaleX(photoViewer.C2.getScaleX());
                                                            }
                                                        }
                                                        ao6 ao6Var6 = ib8Var.c;
                                                        float f71 = ao6Var6 != null ? ao6Var6.c : 1.0f;
                                                        f39 = ((f36 / min5) / td4.A(f71, 1.0f, f33, 1.0f)) * f71;
                                                    }
                                                    float f72 = f39;
                                                    canvas.translate(n43Var2.d * f31, n43Var2.e * f31);
                                                    canvas.scale(f72, f72);
                                                    canvas.translate(mlb.C(n43Var2.b, f32, min5, f31), mlb.C(n43Var2.c, f34, min5, f31));
                                                    if (z3) {
                                                        photoViewer.N8.preTranslate(n43Var2.d * f31, n43Var2.e * f31);
                                                        photoViewer.N8.preScale(f72, f72);
                                                        photoViewer.N8.preTranslate(mlb.C(n43Var2.b, f32, min5, f31), mlb.C(n43Var2.c, f34, min5, f31));
                                                    }
                                                    f40 = n43Var2.g + i27;
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
                                                    float f662 = n43Var2.j;
                                                    float f672 = n43Var2.k;
                                                    f32 = i8;
                                                    f26 = f65;
                                                    f33 = 1.0f - f31;
                                                    int A5 = (int) mlb.A(1.0f - f662, f33, f662, f32);
                                                    f34 = i10;
                                                    int i292 = (int) ((((1.0f - f672) * f33) + f672) * f34);
                                                    f35 = A5;
                                                    f36 = f20 / f35;
                                                    f37 = i292;
                                                    if (f36 * f37 > f23) {
                                                    }
                                                    if (i28 != 1) {
                                                        float f682 = f35 * f36;
                                                        float f692 = f37 * f36;
                                                        if (f22 * f62 > f23) {
                                                        }
                                                        float A22 = td4.A((f21 * f22) / f19, f682, f33, f682);
                                                        float A32 = td4.A((f62 * f22) / f19, f692, f33, f692);
                                                        canvas.clipRect((-A22) / 2.0f, (-A32) / 2.0f, A22 / 2.0f, A32 / 2.0f);
                                                    }
                                                    i11 = photoViewer.d2;
                                                    if (i11 != 1) {
                                                    }
                                                    if (photoViewer.t4 != 1) {
                                                    }
                                                    textureView = photoViewer.C2;
                                                    if (textureView != null) {
                                                    }
                                                    float A42 = n43Var2.f / td4.A(n43Var2.l, 1.0f, f33, 1.0f);
                                                    f38 = f20 / f32;
                                                    if (f38 * f34 > f23) {
                                                    }
                                                    float f702 = (f38 / min5) * A42;
                                                    if (photoViewer.d2 == 1) {
                                                    }
                                                    f39 = f702;
                                                    float f722 = f39;
                                                    canvas.translate(n43Var2.d * f31, n43Var2.e * f31);
                                                    canvas.scale(f722, f722);
                                                    canvas.translate(mlb.C(n43Var2.b, f32, min5, f31), mlb.C(n43Var2.c, f34, min5, f31));
                                                    if (z3) {
                                                    }
                                                    f40 = n43Var2.g + i27;
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
                                                float f6622 = n43Var2.j;
                                                float f6722 = n43Var2.k;
                                                f32 = i8;
                                                f26 = f65;
                                                f33 = 1.0f - f31;
                                                int A52 = (int) mlb.A(1.0f - f6622, f33, f6622, f32);
                                                f34 = i10;
                                                int i2922 = (int) ((((1.0f - f6722) * f33) + f6722) * f34);
                                                f35 = A52;
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
                                                float A422 = n43Var2.f / td4.A(n43Var2.l, 1.0f, f33, 1.0f);
                                                f38 = f20 / f32;
                                                if (f38 * f34 > f23) {
                                                }
                                                float f7022 = (f38 / min5) * A422;
                                                if (photoViewer.d2 == 1) {
                                                }
                                                f39 = f7022;
                                                float f7222 = f39;
                                                canvas.translate(n43Var2.d * f31, n43Var2.e * f31);
                                                canvas.scale(f7222, f7222);
                                                canvas.translate(mlb.C(n43Var2.b, f32, min5, f31), mlb.C(n43Var2.c, f34, min5, f31));
                                                if (z3) {
                                                }
                                                f40 = n43Var2.g + i27;
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
                                                    float f66222 = n43Var2.j;
                                                    float f67222 = n43Var2.k;
                                                    f32 = i8;
                                                    f26 = f65;
                                                    f33 = 1.0f - f31;
                                                    int A522 = (int) mlb.A(1.0f - f66222, f33, f66222, f32);
                                                    f34 = i10;
                                                    int i29222 = (int) ((((1.0f - f67222) * f33) + f67222) * f34);
                                                    f35 = A522;
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
                                                    float A4222 = n43Var2.f / td4.A(n43Var2.l, 1.0f, f33, 1.0f);
                                                    f38 = f20 / f32;
                                                    if (f38 * f34 > f23) {
                                                    }
                                                    float f70222 = (f38 / min5) * A4222;
                                                    if (photoViewer.d2 == 1) {
                                                    }
                                                    f39 = f70222;
                                                    float f72222 = f39;
                                                    canvas.translate(n43Var2.d * f31, n43Var2.e * f31);
                                                    canvas.scale(f72222, f72222);
                                                    canvas.translate(mlb.C(n43Var2.b, f32, min5, f31), mlb.C(n43Var2.c, f34, min5, f31));
                                                    if (z3) {
                                                    }
                                                    f40 = n43Var2.g + i27;
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
                                                float f662222 = n43Var2.j;
                                                float f672222 = n43Var2.k;
                                                f32 = i8;
                                                f26 = f65;
                                                f33 = 1.0f - f31;
                                                int A5222 = (int) mlb.A(1.0f - f662222, f33, f662222, f32);
                                                f34 = i10;
                                                int i292222 = (int) ((((1.0f - f672222) * f33) + f672222) * f34);
                                                f35 = A5222;
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
                                                float A42222 = n43Var2.f / td4.A(n43Var2.l, 1.0f, f33, 1.0f);
                                                f38 = f20 / f32;
                                                if (f38 * f34 > f23) {
                                                }
                                                float f702222 = (f38 / min5) * A42222;
                                                if (photoViewer.d2 == 1) {
                                                }
                                                f39 = f702222;
                                                float f722222 = f39;
                                                canvas.translate(n43Var2.d * f31, n43Var2.e * f31);
                                                canvas.scale(f722222, f722222);
                                                canvas.translate(mlb.C(n43Var2.b, f32, min5, f31), mlb.C(n43Var2.c, f34, min5, f31));
                                                if (z3) {
                                                }
                                                f40 = n43Var2.g + i27;
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
                        ib8 ib8Var2 = photoViewer.W4;
                        n43 n43Var22 = photoViewer.E1;
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
                        i7 = h0;
                        i6 = i5;
                        imageReceiver4 = imageReceiver3;
                        f13 = 2.0f;
                        z6 = false;
                    }
                    if (!z6 && photoViewer.i0.getVisibility() == 0) {
                        canvas.save();
                        if (photoViewer.u2) {
                            canvas.translate((photoViewer.w0() / 2) - (photoViewer.s0() / 2), 0.0f);
                        }
                        canvas.translate(photoViewer.i0.getX(), photoViewer.i0.getY());
                        canvas.scale(photoViewer.i0.getScaleX(), photoViewer.i0.getScaleY(), photoViewer.i0.getPivotX(), photoViewer.i0.getPivotY());
                        b4 = photoViewer.E4.b(photoViewer.i0.getBitmapHolder());
                        if (b4 != null) {
                            canvas.save();
                            wm0Var2.h.setShader(null);
                            wm0Var2.h.setAlpha((int) (f8 * 255.0f));
                            canvas.scale((photoViewer.i0.getWidth() * 1.0f) / b4.getWidth(), (photoViewer.i0.getHeight() * 1.0f) / b4.getHeight());
                            canvas.scale(b4.getWidth() / (b4.getWidth() - 3.0f), b4.getHeight() / (b4.getHeight() - 3.0f), b4.getWidth() / f13, b4.getHeight() / f13);
                            canvas.drawBitmap(b4, 0.0f, 0.0f, wm0Var2.h);
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
                            canvas.translate(((-(((photoViewer.Z5 + 1.0f) * f75) + gm.L(30.0f))) / f13) + f52, 0.0f);
                            int q4 = imageReceiver5.q();
                            int o4 = imageReceiver5.o();
                            if (!photoViewer.G4 && (ao6Var = photoViewer.H1) != null) {
                                n43 n43Var3 = photoViewer.F1;
                                if (n43Var3.a) {
                                    i15 = i6;
                                    photoViewer.d(canvas, i30, i15, q4, o4, f7, n43Var3, ao6Var);
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
                                        ao6 ao6Var7 = photoViewer.H1;
                                        z9 = ao6Var7 != null && ao6Var7.l;
                                    }
                                    if (z9) {
                                        canvas.scale(-1.0f, 1.0f);
                                    }
                                    d3 = photoViewer.D4.d(imageReceiver5);
                                    if (d3 != null) {
                                        wm0Var2.h.setShader(null);
                                        wm0Var2.h.setAlpha((int) (f8 * 255.0f * e2));
                                        canvas.scale(d3.getWidth() / (d3.getWidth() - 3.0f), d3.getHeight() / (d3.getHeight() - 3.0f));
                                        canvas.translate((-i31) / 2, (-i32) / 2);
                                        canvas.scale((i31 * 1.0f) / d3.getWidth(), (i32 * 1.0f) / d3.getHeight());
                                        if (z) {
                                            canvas.clipRect(0, 0, d3.getWidth(), d3.getHeight());
                                        }
                                        canvas.drawBitmap(d3, 0.0f, 0.0f, wm0Var2.h);
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
                        wm0Var2.h.setColor(i2);
                        wm0Var2.h.setAlpha((int) (gm.R1(0.7f, 1.0f, f8) * r0.getAlpha()));
                        canvas.drawPaint(wm0Var2.h);
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
            int i202 = h0 / 2;
            int i212 = i5 / 2;
            f13 = 2.0f;
            canvas.translate(photoViewer.Z(photoViewer.t4) + i202, photoViewer.a0(photoViewer.t4) + i212);
            float f602 = f4 + 0.0f;
            canvas.translate(f10, f602);
            f14 = f7 - f12;
            canvas.scale(f14, f14);
            float f612 = f6;
            canvas.rotate(f612);
            if (z3) {
            }
            if (photoViewer.t4 == 3) {
                int f03 = photoViewer.f0(0, true);
                sa8 sa8Var2 = photoViewer.M1;
                int i222 = gm.q.y;
                Typeface typeface2 = gm.a;
                gm.L(20.0f);
                photoViewer.M1.getClass();
                float f022 = (((f03 - sa8Var2.d2) - photoViewer.f0(0, false)) / 2.0f) * 1.0f;
                canvas.translate(0.0f, f022);
                if (z3) {
                }
            }
            if (!z4) {
            }
            q = photoViewer.B4.q();
            o = photoViewer.B4.o();
            f15 = h0;
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
            i7 = h0;
            f19 = f14;
            f20 = f15;
            imageReceiver4 = imageReceiver3;
            f21 = f16;
            f22 = f17;
            f23 = f18;
            f24 = f642;
            z5 = false;
            isEmpty = arrayList.isEmpty();
            ib8 ib8Var22 = photoViewer.W4;
            n43 n43Var222 = photoViewer.E1;
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
        int i2022 = h0 / 2;
        int i2122 = i5 / 2;
        f13 = 2.0f;
        canvas.translate(photoViewer.Z(photoViewer.t4) + i2022, photoViewer.a0(photoViewer.t4) + i2122);
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
        f15 = h0;
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
        i7 = h0;
        f19 = f14;
        f20 = f15;
        imageReceiver4 = imageReceiver3;
        f21 = f16;
        f22 = f17;
        f23 = f18;
        f24 = f6422;
        z5 = false;
        isEmpty = arrayList.isEmpty();
        ib8 ib8Var222 = photoViewer.W4;
        n43 n43Var2222 = photoViewer.E1;
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
    
        if (k47.n1(((k47) r3.get(0)).k).webpage.url != null) goto L125;
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
    /* JADX WARN: Type inference failed for: r6v51, types: [nb8] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void P1(boolean z, boolean z2, boolean z3, int i) {
        int i2;
        int i3;
        CharSequence charSequence;
        boolean z4;
        k47 k47Var;
        CharSequence charSequence2;
        String L0;
        k47 k47Var2;
        boolean z5;
        ArrayList arrayList;
        Integer num;
        boolean z6;
        boolean z7;
        ao6 ao6Var;
        boolean z8;
        int i4;
        boolean z9;
        boolean z10;
        long j;
        long j2;
        boolean z11;
        boolean z12;
        boolean z13;
        ao6 ao6Var2;
        CharSequence charSequence3;
        int i5;
        boolean z14;
        int i6;
        jo6 jo6Var;
        boolean z15;
        int i7;
        boolean z16;
        ao6 ao6Var3;
        boolean z17;
        boolean z18;
        boolean z19;
        int i8;
        boolean z20;
        int i10;
        k47 k47Var3;
        String str;
        float f;
        boolean z21;
        TLRPC.Photo photo;
        Integer num2;
        int i11;
        TLRPC.Photo photo2;
        String str2;
        boolean z22;
        yv1 yv1Var;
        pb8 pb8Var;
        String str3;
        int i12;
        boolean z23;
        float f2;
        boolean z24;
        int i13;
        PorterDuffColorFilter porterDuffColorFilter;
        pb8 pb8Var2;
        TLRPC.User h;
        TLRPC.Chat f3;
        String str4;
        int i14;
        TLRPC.Photo photo3;
        ArrayList arrayList2;
        String str5;
        b3c b3cVar;
        ArrayList arrayList3;
        boolean z25;
        CharSequence D1;
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
            photoViewer.p0(i);
            if (z28) {
                TransitionSet transitionSet = new TransitionSet();
                transitionSet.addTransition(new Fade());
                transitionSet.addTransition(new ChangeBounds());
                transitionSet.setOrdering(0);
                transitionSet.setDuration(220L);
                transitionSet.setInterpolator((TimeInterpolator) d53.f);
                TransitionManager.beginDelayedTransition(photoViewer.I0, transitionSet);
            }
            photoViewer.p0.u(23);
            photoViewer.Q4 = false;
            ArrayList arrayList4 = photoViewer.X6;
            float f4 = 0.0f;
            long j3 = 0;
            if (arrayList4.isEmpty()) {
                ArrayList arrayList5 = photoViewer.d7;
                if (arrayList5.isEmpty()) {
                    ArrayList arrayList6 = photoViewer.Z6;
                    if (arrayList6.isEmpty()) {
                        ArrayList arrayList7 = photoViewer.f7;
                        if (arrayList7.isEmpty()) {
                            i2 = i;
                            mb8 mb8Var = photoViewer.i7;
                            if (mb8Var != null) {
                                int j4 = mb8Var.j();
                                int i22 = photoViewer.P4;
                                if (i22 < 0 || i22 >= j4) {
                                    return;
                                }
                                photoViewer.p0.u(19);
                                photoViewer.p0.u(20);
                                photoViewer.l2 = !oc7.r1(photoViewer.U).B2(photoViewer.D5) && ((k47Var2 = photoViewer.S4) == null || !k47Var2.y2()) && !photoViewer.M0(photoViewer.i7);
                                TL_iv.PageBlock pageBlock = photoViewer.i7.get(photoViewer.P4);
                                CharSequence i23 = photoViewer.i7.i(photoViewer.P4);
                                boolean a = photoViewer.i7.a(photoViewer.P4);
                                if (a) {
                                    boolean z30 = photoViewer.l2;
                                    r7 r7Var = photoViewer.p0;
                                    if (z30) {
                                        r7Var.R(10);
                                    } else {
                                        r7Var.u(10);
                                    }
                                    photoViewer.p0.m();
                                    boolean z31 = photoViewer.s2;
                                    a8 a8Var = photoViewer.w0;
                                    if (z31) {
                                        photoViewer.R1(a8Var, true, true);
                                    } else {
                                        a8Var.setEnabled(false);
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
                                nb8 nb8Var = photoViewer.O;
                                if (nb8Var != null) {
                                    nb8Var.d(j4 > 1, true);
                                    photoViewer.O.a(photoViewer.P4 + 1, j4);
                                }
                                if (photoViewer.k2 != null || (!photoViewer.i7.a(i2) && photoViewer.i7.e(i2))) {
                                    i3 = 8;
                                    photoViewer.u0.setVisibility(8);
                                    photoViewer.v0.setVisibility(8);
                                    boolean z32 = photoViewer.l2;
                                    r7 r7Var2 = photoViewer.p0;
                                    if (z32) {
                                        r7Var2.R(12);
                                    } else {
                                        r7Var2.u(12);
                                    }
                                    photoViewer.p0.m();
                                    L0 = jb6.L0(2131753936);
                                } else {
                                    L0 = j4 == 1 ? a ? jb6.L0(2131753898) : jb6.L0(2131753913) : null;
                                    photoViewer.u0.setVisibility(photoViewer.l2 ? 0 : 8);
                                    photoViewer.v0.setVisibility(photoViewer.l2 ? 0 : 8);
                                    photoViewer.p0.u(12);
                                    photoViewer.p0.m();
                                    i3 = 8;
                                }
                                photoViewer.m1.b();
                                photoViewer.i7.h(pageBlock);
                                charSequence = L0;
                                k47Var = null;
                                charSequence2 = i23;
                                z4 = z28;
                            } else {
                                i3 = 8;
                                charSequence = null;
                                photoViewer.p0.u(19);
                                photoViewer.p0.u(20);
                                z4 = z28;
                                k47Var = null;
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
                                z16 = document != null ? k47.J4(document) : botInlineResult.content instanceof TLRPC.TL_webDocument ? botInlineResult.type.equals(MediaStreamTrack.VIDEO_TRACK_KIND) : false;
                                arrayList = arrayList7;
                                i2 = i;
                                z14 = z28;
                                z17 = false;
                                z18 = false;
                                z19 = false;
                                charSequence2 = null;
                                ao6Var3 = null;
                                charSequence3 = null;
                            } else {
                                boolean z33 = obj instanceof jo6;
                                if (z33) {
                                    jo6 jo6Var2 = (jo6) obj;
                                    photoViewer.d5 = jo6Var2.I;
                                    z6 = jo6Var2.d();
                                    z7 = jo6Var2.b;
                                    long j5 = jo6Var2.m;
                                    photoViewer.e5 = j5;
                                    num = 1;
                                    long j6 = jo6Var2.P;
                                    i4 = jo6Var2.E;
                                    arrayList = arrayList7;
                                    z10 = z33;
                                    j = j5;
                                    z9 = false;
                                    ao6Var = jo6Var2.A;
                                    z8 = jo6Var2.c();
                                    j2 = j6;
                                } else {
                                    arrayList = arrayList7;
                                    num = 1;
                                    if (obj instanceof no6) {
                                        no6 no6Var = (no6) obj;
                                        photoViewer.d5 = no6Var.g();
                                        photoViewer.e5 = 0L;
                                        ao6Var = no6Var.A;
                                        j3 = 0;
                                        z6 = false;
                                        if (no6Var.H) {
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
                                        ao6Var = null;
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
                                        jo6 jo6Var3 = (jo6) obj;
                                        rcc rccVar = jo6Var3.s;
                                        if (rccVar != null) {
                                            boolean z35 = rccVar.t;
                                            float f5 = rccVar.d;
                                            f2 = rccVar.e;
                                            f4 = f5;
                                            z23 = z35;
                                            i12 = rccVar.f;
                                            str3 = jo6Var3.g;
                                        } else {
                                            str3 = null;
                                            i12 = -1;
                                            z23 = false;
                                            f2 = 1.0f;
                                        }
                                        TLRPC.Photo photo4 = jo6Var3.e;
                                        String str6 = str3;
                                        k47Var3 = jo6Var3.f;
                                        i10 = i12;
                                        str = str6;
                                        z21 = z23;
                                        f = f2;
                                        photo = photo4;
                                    } else {
                                        i10 = -1;
                                        k47Var3 = null;
                                        str = null;
                                        f = 1.0f;
                                        z21 = false;
                                        photo = null;
                                    }
                                    if (i24 != -1) {
                                        k47 k47Var4 = k47Var3;
                                        String str7 = str;
                                        ao6Var2 = ao6Var;
                                        float f6 = f4;
                                        TLRPC.Photo photo5 = photo;
                                        charSequence3 = null;
                                        z13 = z10;
                                        photoViewer.v1(photoViewer.d5, j7, z21, f6, f, i10, j2);
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
                                            gm.Q3(1.0f, photoViewer.f1, false, z28);
                                            gm.Q3(1.0f, photoViewer.g1, false, z28);
                                            gm.Q3(1.0f, photoViewer.h1, false, z28);
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
                                                gm.Q3(1.0f, photoViewer.f1, false, z28);
                                                gm.Q3(1.0f, photoViewer.g1, false, z28);
                                                gm.Q3(1.0f, photoViewer.h1, false, z28);
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
                                                gm.Q3(1.0f, photoViewer.f1, (photoViewer.e2 || z11) ? false : true, z28);
                                                gm.Q3(1.0f, photoViewer.g1, !photoViewer.e2 && z11 && ((pb8Var = photoViewer.d) == null || pb8Var.P()), z28);
                                                if (z11) {
                                                    photoViewer.g1.a(!photoViewer.U0(), true);
                                                }
                                                y98 y98Var = photoViewer.h1;
                                                if (!photoViewer.e2 && !z11 && (yv1Var = photoViewer.k4) != null) {
                                                    if (!m9c.D(yv1Var.h())) {
                                                        if (sd2.V(photoViewer.k4.f())) {
                                                            if (i4 < 20) {
                                                                photo2 = photo5;
                                                                str2 = str7;
                                                                if (photo2 == null) {
                                                                }
                                                                z22 = true;
                                                                gm.Q3(1.0f, y98Var, z22, z28);
                                                                y98 y98Var2 = photoViewer.h1;
                                                                if (photo2 != null) {
                                                                    y98Var2.a(photo2, k47Var4);
                                                                } else {
                                                                    y98Var2.setImage(str2);
                                                                }
                                                                photoViewer.k1.setVisibility((!photoViewer.e2 || photoViewer.f2) ? 8 : 0);
                                                                i11 = 0;
                                                            }
                                                        }
                                                    }
                                                    photo2 = photo5;
                                                    str2 = str7;
                                                    z22 = true;
                                                    gm.Q3(1.0f, y98Var, z22, z28);
                                                    y98 y98Var22 = photoViewer.h1;
                                                    if (photo2 != null) {
                                                    }
                                                    photoViewer.k1.setVisibility((!photoViewer.e2 || photoViewer.f2) ? 8 : 0);
                                                    i11 = 0;
                                                }
                                                photo2 = photo5;
                                                str2 = str7;
                                                z22 = false;
                                                gm.Q3(1.0f, y98Var, z22, z28);
                                                y98 y98Var222 = photoViewer.h1;
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
                                        ao6Var2 = ao6Var;
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
                                    ao6Var2 = ao6Var;
                                    Integer num3 = num;
                                    charSequence3 = null;
                                    photoViewer.m2(false, z28);
                                    photoViewer.Y7.setVisibility(8);
                                    gm.Q3(1.0f, photoViewer.f1, false, z28);
                                    gm.Q3(1.0f, photoViewer.g1, false, z28);
                                    gm.Q3(1.0f, photoViewer.h1, false, z28);
                                    boolean z36 = photoViewer.s1 ? false : z28;
                                    photoViewer.s1 = false;
                                    if (!z13 || (z15 = (jo6Var = (jo6) obj).b)) {
                                        i2 = i;
                                        photoViewer.k1.setVisibility(8);
                                    } else {
                                        if (z15 || (i7 = photoViewer.d2) == 11 || i7 == 10) {
                                            i2 = i;
                                        } else {
                                            i2 = i;
                                            if ((photoViewer.O4 == i2 ? photoViewer.l0() : jo6Var.s) == null) {
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
                                    pb8 pb8Var3 = photoViewer.d;
                                    String C = pb8Var3 != null ? pb8Var3.C(photoViewer.P4) : null;
                                    i5 = 1;
                                    photoViewer.N.a(C != null ? C : "", true);
                                    z14 = z36;
                                }
                                if (z13) {
                                    jo6 jo6Var4 = (jo6) obj;
                                    photoViewer.l5 = jo6Var4.B == 0 && jo6Var4.D == j3 && arrayList.size() == i5;
                                    charSequence2 = photoViewer.u7 ? photoViewer.v7 : jo6Var4.a;
                                    i8 = jo6Var4.x;
                                    z20 = jo6Var4.u;
                                    z18 = jo6Var4.v;
                                    z17 = jo6Var4.w;
                                } else if (obj instanceof no6) {
                                    no6 no6Var2 = (no6) obj;
                                    charSequence2 = no6Var2.I;
                                    i8 = no6Var2.x;
                                    z20 = no6Var2.u;
                                    z18 = no6Var2.v;
                                    z17 = no6Var2.w;
                                } else {
                                    charSequence2 = charSequence3;
                                    z16 = z12;
                                    ao6Var3 = ao6Var2;
                                    z17 = false;
                                    z18 = false;
                                    z19 = false;
                                    i21 = 0;
                                }
                                i21 = i8;
                                z19 = z20;
                                z16 = z12;
                                ao6Var3 = ao6Var2;
                            }
                            if (photoViewer.j0.getVisibility() != 8) {
                                photoViewer.j0.setVisibility(8);
                            }
                            photoViewer.j0.setTag(charSequence3);
                            nb8 nb8Var2 = photoViewer.O;
                            if (nb8Var2 != null) {
                                nb8Var2.d(false, z28);
                            }
                            CharSequence L03 = photoViewer.l5 ? z16 ? jb6.L0(2131753898) : jb6.L0(2131753913) : charSequence3;
                            yv1 yv1Var2 = photoViewer.k4;
                            if (yv1Var2 != null) {
                                z24 = z14;
                                if (yv1Var2.g4 == 3) {
                                    long f7 = yv1Var2.f7();
                                    yv1 yv1Var3 = photoViewer.k4;
                                    if (f7 >= j3) {
                                        h = yv1Var3.getMessagesController().W1(Long.valueOf(f7));
                                        f3 = null;
                                    } else {
                                        f3 = yv1Var3.getMessagesController().L0(Long.valueOf(-f7));
                                        h = null;
                                    }
                                } else {
                                    h = yv1Var2.h();
                                    f3 = photoViewer.k4.f();
                                }
                                if (f3 != null) {
                                    L03 = f3.title;
                                } else if (m9c.D(h)) {
                                    L03 = jb6.L0(photoViewer.k4.g4 == 3 ? 2131748060 : 2131745635);
                                } else {
                                    L03 = m9c.u(h) ? jb6.L0(2131754217) : m9c.r(h);
                                }
                            } else {
                                z24 = z14;
                            }
                            if (L03 == null && (pb8Var2 = photoViewer.d) != null) {
                                L03 = pb8Var2.d0(photoViewer.P4);
                            }
                            int i26 = photoViewer.d2;
                            if (i26 == 0 || i26 == 4 || ((i26 == 2 || i26 == 5) && arrayList.size() > 1)) {
                                photoViewer.O0.a(photoViewer.d.w(photoViewer.P4));
                            }
                            photoViewer.E2(obj);
                            PorterDuffColorFilter porterDuffColorFilter2 = new PorterDuffColorFilter(photoViewer.y0(cmb.pg), PorterDuff.Mode.MULTIPLY);
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
                                if (ao6Var3 != null) {
                                    boolean z38 = photoViewer.s1;
                                    boolean z39 = ao6Var3.l;
                                    if (!z38 ? z39 : !z39) {
                                        porterDuffColorFilter = porterDuffColorFilter2;
                                        imageView.setColorFilter(porterDuffColorFilter);
                                    }
                                }
                                porterDuffColorFilter = null;
                                imageView.setColorFilter(porterDuffColorFilter);
                            } else {
                                imageView.setColorFilter((ao6Var3 == null || !ao6Var3.l) ? null : porterDuffColorFilter2);
                            }
                            ImageView imageView2 = photoViewer.c1;
                            if (ao6Var3 == null || ao6Var3.k == 0) {
                                porterDuffColorFilter2 = null;
                            }
                            imageView2.setColorFilter(porterDuffColorFilter2);
                            photoViewer.Q4 = photoViewer.j2 && ((i13 = photoViewer.d2) == 0 || i13 == 2 || i13 == -1);
                            charSequence = L03;
                            z4 = z24;
                            k47Var = null;
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
                            r7 r7Var3 = photoViewer.p0;
                            if (L04) {
                                r7Var3.u(14);
                            } else {
                                r7Var3.R(14);
                            }
                            if (photoViewer.y5 <= 0) {
                                TLRPC.Chat L05 = oc7.r1(photoViewer.U).L0(Long.valueOf(-photoViewer.y5));
                                if (!photoViewer.L0() && !k47.r(photoViewer.U, false, (TLRPC.Message) photoViewer.c7.get(i), L05)) {
                                    photoViewer.p0.u(7);
                                }
                            }
                            photoViewer.p0.R(7);
                        }
                        long j8 = photoViewer.y5;
                        if (j8 != 0) {
                            str4 = pg3.k(z8c.t0, j8);
                            gn5 gn5Var = (gn5) arrayList6.get(i);
                            if (gn5Var == null || (photo3 = gn5Var.l) == null) {
                                photoViewer.N.a("", z28);
                            } else {
                                photoViewer.N.a(jb6.x(photo3.date, true), z28);
                            }
                            photoViewer.p0.R(23);
                        } else {
                            str4 = null;
                        }
                        xb7 xb7Var = photoViewer.r2;
                        if (xb7Var != null) {
                            xb7Var.b(i, z29);
                        }
                        nb8 nb8Var3 = photoViewer.O;
                        if (nb8Var3 != null) {
                            nb8Var3.d(arrayList6.size() > 1, true);
                            photoViewer.O.a(photoViewer.P4 + 1, arrayList6.size());
                        }
                        String str8 = photoViewer.e4;
                        if (str8 != null) {
                            str4 = str8;
                        } else if (photoViewer.A5) {
                            str4 = jb6.L0(2131753913);
                        }
                        boolean z40 = photoViewer.y5 != 0 && oc7.r1(photoViewer.U).B2(photoViewer.y5);
                        a8 a8Var2 = photoViewer.u0;
                        if (z40) {
                            a8Var2.setVisibility(8);
                            photoViewer.v0.setVisibility(8);
                        } else {
                            a8Var2.setVisibility(0);
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
                        k47Var = null;
                        charSequence2 = null;
                    }
                } else {
                    photoViewer.l2 = false;
                    photoViewer.p0.R(7);
                    photoViewer.u0.setVisibility(8);
                    photoViewer.v0.setVisibility(8);
                    photoViewer.p0.u(19);
                    photoViewer.p0.u(20);
                    nb8 nb8Var4 = photoViewer.O;
                    if (nb8Var4 != null) {
                        nb8Var4.d(arrayList5.size() > 1, true);
                        photoViewer.O.a(photoViewer.P4 + 1, arrayList5.size());
                    }
                    photoViewer.N.c("");
                    photoViewer.N.a("", z28);
                    k47Var = null;
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
                    ob8 ob8Var = photoViewer.N;
                    if (z28) {
                        if (i20 == i2) {
                            ob8Var.d(charSequence, true, true);
                        } else {
                            ob8Var.d(charSequence, false, i20 > i2);
                        }
                    } else {
                        ob8Var.c(charSequence);
                    }
                }
                photoViewer.J1(k47Var, charSequence2, z5, z4);
            }
            int i28 = photoViewer.P4;
            if (i28 < 0 || i28 >= arrayList4.size()) {
                return;
            }
            k47 k47Var5 = (k47) arrayList4.get(photoViewer.P4);
            k47Var5.f6(false);
            boolean D3 = k47Var5.D3();
            boolean G4 = k47Var5.G4();
            CharSequence b = ch4.b(k47Var5, photoViewer.P5 && !photoViewer.Q5);
            if (k47Var5.Z3() || k47Var5.q4() || (message3 = k47Var5.k) == null) {
                arrayList2 = arrayList4;
                str5 = null;
            } else {
                arrayList2 = arrayList4;
                str5 = jb6.s(message3.date, false);
            }
            photoViewer.N.a(str5, z28);
            boolean z310 = k47Var5.z3();
            boolean z43 = oc7.r1(photoViewer.U).B2(k47Var5.A0()) || ((message2 = k47Var5.k) != null && message2.noforwards) || k47Var5.y2();
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
                D1 = k47.n1(k47Var5.k).description;
                photoViewer.l2 = false;
                photoViewer.p0.u(19);
                photoViewer.p0.u(20);
                z5 = false;
                arrayList3 = arrayList2;
            } else {
                z4 = z2;
                b3c b3cVar2 = oc7.r1(photoViewer.U).i4;
                if (i20 != photoViewer.P4) {
                    photoViewer.m5 = false;
                    photoViewer.n5 = null;
                }
                if (b3cVar2.r()) {
                    b3cVar = b3cVar2;
                    photoViewer = this;
                    b3cVar.j(k47Var5, new rp2((Object) this, i, (Object) b3cVar, (Object) k47Var5, (byte) 4));
                } else {
                    b3cVar = b3cVar2;
                }
                if (b3cVar.r() && b3cVar.a(k47Var5, photoViewer.n5)) {
                    boolean z44 = photoViewer.m5;
                    r7 r7Var4 = photoViewer.p0;
                    if (z44) {
                        r7Var4.R(20);
                        photoViewer.p0.u(19);
                    } else {
                        r7Var4.R(19);
                        photoViewer.p0.u(20);
                    }
                } else {
                    photoViewer.p0.u(19);
                    photoViewer.p0.u(20);
                }
                photoViewer.l2 = !z43;
                if (k47Var5.L3() && photoViewer.l2 && !pg3.B(k47Var5.A0())) {
                    photoViewer.p0.R(12);
                }
                yv1 yv1Var4 = photoViewer.k4;
                if (k47Var5.s(null, yv1Var4 != null && yv1Var4.X7()) && photoViewer.w == 0) {
                    photoViewer.p0.R(7);
                } else {
                    photoViewer.p0.u(7);
                }
                photoViewer.p0.m();
                boolean z45 = !D3 && (k47Var5.F0() == null || k47Var5.x() || k47Var5.t1().startsWith("video/")) && !photoViewer.s4 && (((i15 = k47Var5.k.ttl) == 0 || i15 >= 3600) && !z43 && photoViewer.j() && !photoViewer.P5);
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
                    boolean z47 = k47Var5.o2() && !pg3.B(k47Var5.A0());
                    if (z46) {
                        photoViewer.R1(photoViewer.w0, false, (z47 || z45) ? false : true);
                    }
                    photoViewer.R1(photoViewer.D0, z45, (!z4 || z46 || z47) ? false : true);
                    photoViewer.R1(photoViewer.E0, z47, !z46);
                } else {
                    if (z43) {
                        if (photoViewer.w != 0) {
                            arrayList3 = arrayList2;
                            if (k47.n1(((k47) arrayList3.get(0)).k).webpage != null) {
                            }
                        } else if (k47.n1(k47Var5.k).webpage == null || k47.n1(k47Var5.k).webpage.url == null) {
                            arrayList3 = arrayList2;
                        }
                        photoViewer.p0.u(10);
                        z25 = photoViewer.E0.getVisibility() != 0;
                        if (z25) {
                            photoViewer.R1(photoViewer.E0, false, false);
                        }
                        if (z43) {
                            boolean z48 = photoViewer.s2;
                            a8 a8Var3 = photoViewer.w0;
                            if (z48) {
                                photoViewer.R1(a8Var3, true, !z25 && photoViewer.D0.getAlpha() <= 0.0f);
                            } else {
                                a8Var3.setEnabled(false);
                                photoViewer.Q1(0.5f, photoViewer.w0, true, !z25 && photoViewer.D0.getAlpha() <= 0.0f);
                                photoViewer.I0();
                            }
                        } else {
                            photoViewer.R1(photoViewer.w0, false, true);
                        }
                        photoViewer.R1(photoViewer.D0, false, false);
                        if (k47Var5.o2() || pg3.B(k47Var5.A0())) {
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
                    if (k47Var5.o2()) {
                    }
                    photoViewer.p0.u(13);
                    photoViewer.p0.m();
                }
                D1 = oc7.r1(k47Var5.K1).D1(k47Var5.k.restriction_reason);
                if (TextUtils.isEmpty(D1)) {
                    if (!photoViewer.m5 || (message = k47Var5.k) == null || message.translatedText == null || !TextUtils.equals(message.translatedToLanguage, s1c.G0())) {
                        D1 = k47Var5.z;
                        z5 = photoViewer.m5;
                    } else {
                        D1 = s1(k47Var5);
                    }
                }
                z5 = false;
            }
            if (photoViewer.k2 != null) {
                photoViewer.u0.setVisibility(8);
                photoViewer.v0.setVisibility(8);
                photoViewer.p0.u(9);
                photoViewer.R1(photoViewer.D0, false, z4);
                yv1 yv1Var5 = photoViewer.k4;
                if (!k47Var5.s(null, yv1Var5 != null && yv1Var5.X7())) {
                    photoViewer.p0.u(7);
                }
                photoViewer.l2 = !z43;
            }
            if (k47Var5.q4()) {
                nb8 nb8Var5 = photoViewer.O;
                if (nb8Var5 != null) {
                    nb8Var5.d(false, z4);
                }
            } else {
                yv1 yv1Var6 = photoViewer.k4;
                if (yv1Var6 != null && yv1Var6.g4 == 5) {
                    nb8 nb8Var6 = photoViewer.O;
                    if (nb8Var6 != null) {
                        nb8Var6.d(false, z4);
                    }
                } else if (photoViewer.G5 && (photoViewer.E5 != null || !TextUtils.isEmpty(photoViewer.F5))) {
                    nb8 nb8Var7 = photoViewer.O;
                    if (nb8Var7 != null) {
                        nb8Var7.d(true, z4);
                        photoViewer.O.a(photoViewer.P4 + 1, arrayList3.size());
                    }
                } else if (photoViewer.I5 + photoViewer.K5 == 0 || photoViewer.M5) {
                    if (photoViewer.w == 0 && (k47.n1(k47Var5.k) instanceof TLRPC.TL_messageMediaWebPage)) {
                        nb8 nb8Var8 = photoViewer.O;
                        if (nb8Var8 != null) {
                            nb8Var8.d(false, z4);
                        }
                        L02 = photoViewer.s4 ? "YouTube" : k47Var5.x() ? jb6.L0(2131753940) : k47Var5.D3() ? jb6.L0(2131753927) : k47Var5.G4() ? jb6.L0(2131753898) : k47Var5.q3() ? jb6.L0(2131753936) : jb6.L0(2131753913);
                    } else if (z310) {
                        nb8 nb8Var9 = photoViewer.O;
                        if (nb8Var9 != null) {
                            nb8Var9.d(false, z4);
                        }
                        L02 = k47.n1(k47Var5.k).title;
                    } else if (k47Var5.G4()) {
                        nb8 nb8Var10 = photoViewer.O;
                        if (nb8Var10 != null) {
                            nb8Var10.d(false, z4);
                        }
                        L02 = jb6.L0(2131753898);
                    } else if (k47Var5.q3()) {
                        nb8 nb8Var11 = photoViewer.O;
                        if (nb8Var11 != null) {
                            nb8Var11.d(false, z4);
                        }
                        L02 = jb6.L0(2131753936);
                    } else if (k47Var5.F0() != null) {
                        nb8 nb8Var12 = photoViewer.O;
                        if (nb8Var12 != null) {
                            nb8Var12.d(false, z4);
                        }
                        L02 = jb6.L0(2131753940);
                    }
                    charSequence4 = L02;
                    if ((pg3.B(photoViewer.D5) && !photoViewer.s4) || z43) {
                        photoViewer.R1(photoViewer.C0, false, false);
                    }
                    if (!photoViewer.s4 || (((i19 = k47Var5.k.ttl) != 0 && i19 < 3600) || z43)) {
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
                    charSequence2 = D1;
                    k47Var = k47Var5;
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
                                e1 = ((k47) b10.f(1, arrayList3)).e1();
                            }
                            if (!zArr[0] || photoViewer.H5 == 0) {
                                i18 = e1;
                                z27 = false;
                            } else {
                                i18 = (arrayList3.isEmpty() || ((k47) b10.f(i17, arrayList3)).A0() == photoViewer.H5) ? e1 : 0;
                                z27 = true;
                            }
                            if (!photoViewer.d.a0()) {
                                hs6.d0(photoViewer.U).P0(!z27 ? photoViewer.D5 : photoViewer.H5, 40, i18, 0, photoViewer.B5, photoViewer.C5, 1, photoViewer.c, 0, photoViewer.E5, null);
                                photoViewer.N5 = true;
                            }
                        }
                        if (photoViewer.J5 > 0 && photoViewer.P4 < 5 && !arrayList3.isEmpty()) {
                            int e12 = ((k47) arrayList3.get(0)).e1();
                            if (!photoViewer.d.a0()) {
                                hs6.d0(photoViewer.U).P0(photoViewer.D5, 40, 0, e12, photoViewer.B5, photoViewer.C5, 1, photoViewer.c, 0, photoViewer.E5, null);
                                photoViewer.N5 = true;
                            }
                        }
                        nb8 nb8Var13 = photoViewer.O;
                        if (nb8Var13 != null) {
                            nb8Var13.d(photoViewer.Q5, z4);
                            nb8 nb8Var14 = photoViewer.O;
                            int i29 = photoViewer.I5 + photoViewer.K5;
                            nb8Var14.a(i29 - (photoViewer.J5 + photoViewer.P4), i29);
                        }
                    } else {
                        if (arrayList3.size() >= photoViewer.I5 + photoViewer.K5 || photoViewer.N5 || photoViewer.P4 >= 5) {
                            r15 = 1;
                        } else {
                            int e13 = arrayList3.isEmpty() ? 0 : ((k47) arrayList3.get(0)).e1();
                            if (!zArr[0] || photoViewer.H5 == 0) {
                                i16 = e13;
                                z26 = false;
                            } else {
                                i16 = (arrayList3.isEmpty() || ((k47) arrayList3.get(0)).A0() == photoViewer.H5) ? e13 : 0;
                                z26 = true;
                            }
                            hs6.d0(photoViewer.U).P0(!z26 ? photoViewer.D5 : photoViewer.H5, 80, i16, 0, photoViewer.B5, photoViewer.C5, 1, photoViewer.c, 0, photoViewer.E5, null);
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
            if (pg3.B(photoViewer.D5)) {
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
                charSequence2 = D1;
                k47Var = k47Var5;
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
            charSequence2 = D1;
            k47Var = k47Var5;
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
            photoViewer.J1(k47Var, charSequence2, z5, z4);
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
        ib8 ib8Var = this.W4;
        if (ib8Var.b != null) {
            ArrayList arrayList2 = ib8Var.f;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                arrayList = this.W4.f;
            }
        } else {
            ArrayList arrayList3 = ib8Var.e;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                arrayList = this.W4.e;
            }
        }
        ib8 ib8Var2 = this.W4;
        String str = ib8Var2.b;
        if (str == null) {
            str = ib8Var2.a;
        }
        if (this.q8 && this.t8 == 0.0f && this.g8 == 0 && this.j8 == this.h8 && this.k8 == this.i8) {
            ib8 ib8Var3 = this.W4;
            if (ib8Var3.c == null && arrayList == null && str == null && ib8Var3.d == null && this.d2 != 1) {
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
                this.I8 = kt6.o(String.format("%dx%d", Integer.valueOf(i3), Integer.valueOf(i5)), ", ", kt6.o(gm.g0((int) (this.y8 / 1000), false, false), ", ~", gm.i0(this.x8, false, false)));
                this.G.k();
                if (this.e4 != null) {
                    this.N.a(this.r ? jb6.M0(2131745013, "SoundMuted") : this.I8, true);
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
        this.I8 = kt6.o(String.format("%dx%d", Integer.valueOf(i3), Integer.valueOf(i5)), ", ", kt6.o(gm.g0((int) (this.y8 / 1000), false, false), ", ~", gm.i0(this.x8, false, false)));
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
        ya8 ya8Var;
        n1b n1bVar;
        lb8 lb8Var;
        k1b[] k1bVarArr;
        boolean z3;
        boolean z4;
        float f3;
        k1b[] k1bVarArr2;
        boolean z5;
        float f4;
        int width;
        int height;
        float f5;
        k1b[] k1bVarArr3;
        boolean z6;
        boolean z7 = true;
        if (!this.f7.isEmpty()) {
            if (this.t4 == 1 || this.d2 == 1) {
                z = this.E1.h;
            } else {
                ao6 ao6Var = this.W4.c;
                if (ao6Var != null && ao6Var.l) {
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
                canvas.skew(0.0f, td4.z(1.0f, f, f * 4.0f, 0.25f));
            }
            ya8Var = this.g0;
            if (ya8Var != null || ya8Var.n.getVisibility() == 0) {
                if (!this.K4) {
                    Matrix matrix = this.L4;
                    ImageReceiver imageReceiver = this.B4;
                    matrix.preTranslate(imageReceiver.L0, imageReceiver.M0);
                }
                this.o5.g(canvas, false, this.f0, this.n6 == -1);
                this.B4.setAlpha(f2);
                this.B4.h(canvas, null);
                this.o5.g(canvas, true, this.f0, this.n6 == -1);
                n1bVar = this.o5;
                ImageReceiver imageReceiver2 = this.B4;
                Matrix matrix2 = this.L4;
                lb8Var = this.f0;
                ln lnVar = n1bVar.b;
                lnVar.a = lb8Var;
                if ((n1bVar.O == null || lnVar.c > 0.0f) && lb8Var != null) {
                    n1bVar.g0 = imageReceiver2.N0;
                    n1bVar.h0 = imageReceiver2.O0;
                    n1bVar.f0.set(matrix2);
                    float f11 = (n1bVar.R + n1bVar.S) % 1.0f;
                    float d = n1bVar.b.d(n1bVar.O == null);
                    canvas.drawColor(cmb.p1(d, 1342177280));
                    k1bVarArr = n1bVar.I;
                    if (k1bVarArr != null) {
                        int length = k1bVarArr.length;
                        int i = 0;
                        while (i < length) {
                            float f12 = f8;
                            k1b k1bVar = k1bVarArr[i];
                            if (k1bVar == null) {
                                k1bVarArr2 = k1bVarArr;
                                z5 = z2;
                                f4 = f6;
                                f3 = f10;
                            } else {
                                f3 = f10;
                                k1bVar.a.a = lb8Var;
                                if (k1bVar.t.J == null || d <= f7) {
                                    k1bVarArr2 = k1bVarArr;
                                    z5 = z2;
                                    f4 = f6;
                                } else {
                                    float f13 = f7;
                                    boolean z8 = z7;
                                    float R1 = gm.R1(f6, 1.05f, k1bVar.a.d(k1bVar.b)) * gm.R1(f6, 1.065f, d);
                                    int i2 = (k1bVar.c / 90) % 2;
                                    Bitmap bitmap = k1bVar.t.J;
                                    if (i2 != 0) {
                                        width = bitmap.getHeight();
                                        height = k1bVar.t.J.getWidth();
                                    } else {
                                        width = bitmap.getWidth();
                                        height = k1bVar.t.J.getHeight();
                                    }
                                    canvas.save();
                                    float f14 = f6;
                                    float f15 = width;
                                    float centerX = k1bVar.i.centerX() / f15;
                                    float f16 = k1bVar.j;
                                    float f17 = (centerX * f16) - (f16 / f3);
                                    float f18 = height;
                                    float centerY = k1bVar.i.centerY() / f18;
                                    float f19 = k1bVar.k;
                                    canvas.scale(R1, R1, f17, (centerY * f19) - (f19 / f3));
                                    if (k1bVar.o != null) {
                                        float f20 = k1bVar.n;
                                        int i3 = (int) (f11 * f20);
                                        int min = Math.min(500, (int) (f20 * 0.6f)) + i3;
                                        f5 = 0.6f;
                                        if (k1bVar.n > 0) {
                                            while (i3 <= min) {
                                                float f21 = f14 - ((min - i3) / k1bVar.n);
                                                if (f21 > f13) {
                                                    k1bVar.s.setAlpha((int) (f21 * 10.2f * d));
                                                    k1bVarArr3 = k1bVarArr;
                                                    z6 = z2;
                                                    canvas.drawPoints(k1bVar.o, (i3 % k1bVar.n) << 1, 2, k1bVar.s);
                                                } else {
                                                    k1bVarArr3 = k1bVarArr;
                                                    z6 = z2;
                                                }
                                                i3++;
                                                k1bVarArr = k1bVarArr3;
                                                z2 = z6;
                                            }
                                        }
                                        k1bVarArr2 = k1bVarArr;
                                        z5 = z2;
                                    } else {
                                        k1bVarArr2 = k1bVarArr;
                                        z5 = z2;
                                        f5 = 0.6f;
                                    }
                                    if (k1bVar.b() != null) {
                                        canvas.save();
                                        canvas.rotate(k1bVar.c);
                                        canvas.scale((f14 / f15) * k1bVar.j, (f14 / f18) * k1bVar.k);
                                        canvas.drawBitmap(k1bVar.b(), (-k1bVar.t.J.getWidth()) / f3, (-k1bVar.t.J.getHeight()) / f3, (Paint) null);
                                        canvas.restore();
                                    }
                                    float f22 = 255.0f;
                                    if (k1bVar.o != null) {
                                        float f23 = k1bVar.n;
                                        int i4 = (int) (f11 * f23);
                                        int min2 = Math.min(500, (int) (f23 * f5)) + i4;
                                        if (k1bVar.n > 0) {
                                            int i5 = i4;
                                            while (i5 <= min2) {
                                                float f24 = (i5 - i4) / (min2 - i4);
                                                k1bVar.r.setAlpha((int) (Math.min(f14, Math.min(f24, f14 - f24) * f12) * f22 * d));
                                                canvas.drawPoints(k1bVar.o, (i5 % k1bVar.n) << 1, 2, k1bVar.r);
                                                i5++;
                                                f22 = f22;
                                                f14 = 1.0f;
                                            }
                                        }
                                        f7 = f13;
                                        f4 = 1.0f;
                                    } else {
                                        k1bVar.t.n.setPath(k1bVar.l, false);
                                        k1bVar.m.reset();
                                        float length2 = k1bVar.t.n.getLength();
                                        if (length2 == f13) {
                                            f7 = f13;
                                            f4 = 1.0f;
                                        } else {
                                            k1bVar.t.h.setAlpha((int) (d * 255.0f));
                                            k1bVar.t.f.setAlpha((int) (64.0f * d));
                                            canvas.drawPath(k1bVar.m, k1bVar.t.f);
                                            float f25 = 0.2f + f11;
                                            k1bVar.t.n.getSegment(length2 * f11, length2 * f25, k1bVar.m, z8);
                                            canvas.drawPath(k1bVar.m, k1bVar.t.h);
                                            canvas.drawPath(k1bVar.m, k1bVar.t.h);
                                            f4 = 1.0f;
                                            if (f25 > 1.0f) {
                                                k1bVar.m.reset();
                                                k1bVar.t.n.setPath(k1bVar.l, false);
                                                f7 = f13;
                                                k1bVar.t.n.getSegment(f7, (f25 - 1.0f) * length2, k1bVar.m, true);
                                                canvas.drawPath(k1bVar.m, k1bVar.t.h);
                                                canvas.drawPath(k1bVar.m, k1bVar.t.h);
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
                            k1bVarArr = k1bVarArr2;
                            z2 = z5;
                            z7 = true;
                        }
                    }
                    z3 = z2;
                    lb8Var.invalidate();
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
        ya8Var = this.g0;
        if (ya8Var != null) {
        }
        if (!this.K4) {
        }
        this.o5.g(canvas, false, this.f0, this.n6 == -1);
        this.B4.setAlpha(f2);
        this.B4.h(canvas, null);
        this.o5.g(canvas, true, this.f0, this.n6 == -1);
        n1bVar = this.o5;
        ImageReceiver imageReceiver22 = this.B4;
        Matrix matrix22 = this.L4;
        lb8Var = this.f0;
        ln lnVar2 = n1bVar.b;
        lnVar2.a = lb8Var;
        if (n1bVar.O == null) {
        }
        n1bVar.g0 = imageReceiver22.N0;
        n1bVar.h0 = imageReceiver22.O0;
        n1bVar.f0.set(matrix22);
        float f112 = (n1bVar.R + n1bVar.S) % 1.0f;
        float d2 = n1bVar.b.d(n1bVar.O == null);
        canvas.drawColor(cmb.p1(d2, 1342177280));
        k1bVarArr = n1bVar.I;
        if (k1bVarArr != null) {
        }
        z3 = z2;
        lb8Var.invalidate();
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
                view.animate().alpha(f2).setDuration(100L).setUpdateListener(new h88(this, (byte) 6)).setInterpolator(new LinearInterpolator()).withEndAction(new yl6((Object) this, z, (Object) view, (byte) 13)).start();
            }
        }
    }

    public final void Q2() {
        int[] iArr = this.m3;
        Arrays.fill(iArr, 0);
        int[] iArr2 = this.n3;
        Arrays.fill(iArr2, 0);
        ndc ndcVar = this.G2;
        if (ndcVar != null) {
            long max = Math.max(0L, ndcVar.S());
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
            ya8 ya8Var = this.g0;
            if (ya8Var != null && ya8Var.y) {
                long max3 = Math.max(0, ya8Var.getCurrentPosition());
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
        String Y = i >= 60 ? Y(i / 60, i % 60, iArr[1]) : X(i, iArr[1]);
        int i2 = iArr2[0];
        String Y2 = i2 >= 60 ? Y(i2 / 60, i2 % 60, iArr2[1]) : X(i2, iArr2[1]);
        this.o3.l(Y + " / " + Y2, false);
        if (Objects.equals(this.j3, Y2)) {
            return;
        }
        this.j3 = Y2;
        this.i3.requestLayout();
    }

    public final void R(Canvas canvas) {
        float d;
        if (this.R4) {
            if (gda.Z) {
                byte b = this.m4;
                d = this.J8.d(b == 0 || b == 2 || b == 3);
            } else {
                d = 1.0f;
            }
            if (d <= 0.0f) {
                return;
            }
            int currentActionBarHeight = org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + ((int) (gm.m * 1.5f));
            int height = this.Q0.getHeight() + gm.n + (this.V1.getVisibility() == 0 ? gm.L(20.0f) + (this.V1.getEditTextHeightClosedKeyboard() / 2) : 0);
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
            canvas.saveLayerAlpha(0.0f, 0.0f, this.f0.getWidth(), this.f0.getHeight() + gm.n, (int) (d * (this.M0.getAlpha() - 127) * 2.007874f), 31);
            this.L7.rewind();
            Path path = this.L7;
            float width = this.f0.getWidth();
            float f = currentActionBarHeight;
            Path.Direction direction = Path.Direction.CW;
            path.addRect(0.0f, 0.0f, width, f, direction);
            this.L7.addRect(0.0f, (this.f0.getHeight() + gm.n) - height, this.f0.getWidth(), this.f0.getHeight() + gm.n, direction);
            canvas.clipPath(this.L7);
            canvas.drawColor(-16777216);
            P(canvas, this.d0, 0, 0, true, true, false);
            canvas.save();
            this.Q7.reset();
            this.Q7.postScale(1.0f, f / 16.0f);
            this.O7.setLocalMatrix(this.Q7);
            this.M7.setAlpha(nm7.l3);
            canvas.drawRect(0.0f, 0.0f, this.f0.getWidth(), f, this.M7);
            this.R7.reset();
            this.R7.postScale(1.0f, height / 16.0f);
            this.R7.postTranslate(0.0f, (this.f0.getHeight() - height) + gm.n);
            this.P7.setLocalMatrix(this.R7);
            this.N7.setAlpha(nm7.Q2);
            canvas.drawRect(0.0f, (this.f0.getHeight() + gm.n) - height, this.f0.getWidth(), this.f0.getHeight() + gm.n, this.N7);
            canvas.restore();
            canvas.restore();
        }
    }

    public final void R1(View view, boolean z, boolean z2) {
        Q1(1.0f, view, z, z2);
    }

    public final void R2() {
        vdc vdcVar = this.q3;
        int L = (gm.L(2.0f) + ((vdc.S / 2) + (vdcVar.f ? vdcVar.d : vdcVar.b))) - (this.s3.getMeasuredWidth() / 2);
        int L2 = gm.L(10.0f);
        int measuredWidth = (this.i3.getMeasuredWidth() - gm.L(10.0f)) - (this.s3.getMeasuredWidth() / 2);
        ka8 ka8Var = this.s3;
        if (L < L2) {
            ka8Var.setPivotX(Utilities.i((ka8Var.getMeasuredWidth() / 2.0f) - (L2 - L), this.s3.getMeasuredWidth(), 0.0f));
            L = L2;
        } else if (L >= measuredWidth) {
            ka8Var.setPivotX(Utilities.i((ka8Var.getMeasuredWidth() / 2.0f) + (L - measuredWidth), this.s3.getMeasuredWidth(), 0.0f));
            L = measuredWidth;
        } else {
            ka8Var.setPivotX(ka8Var.getMeasuredWidth() / 2.0f);
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
        w98[] w98VarArr;
        lx9 lx9Var;
        ImageView[] imageViewArr;
        x98 x98Var;
        ndc ndcVar;
        boolean z2 = true;
        boolean z3 = !this.s1 || (((x98Var = this.X7) == null || !x98Var.r) && ((this.d2 != 1 || this.H2) && !(((ndcVar = this.G2) != null && ndcVar.c0()) || this.n6 == 5 || this.t4 == 5)));
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
                    w98VarArr = this.X0;
                    if (!z) {
                        alpha *= this.G.getAlpha();
                    } else if (w98VarArr[0].h == 4) {
                        f6 += (1.0f - this.G.getAlpha()) * gm.N(8.0f);
                    }
                    lx9Var = this.B1;
                    if (lx9Var != null || !lx9Var.a()) {
                        canvas.save();
                        canvas.translate(f5, f6);
                        w98 w98Var = w98VarArr[0];
                        w98Var.o = 1.0f;
                        w98Var.e(0, alpha, false);
                        w98VarArr[0].c(canvas);
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
            w98VarArr = this.X0;
            if (!z) {
            }
            lx9Var = this.B1;
            if (lx9Var != null) {
            }
            canvas.save();
            canvas.translate(f5, f6);
            w98 w98Var2 = w98VarArr[0];
            w98Var2.o = 1.0f;
            w98Var2.e(0, alpha, false);
            w98VarArr[0].c(canvas);
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
            ai2 ai2Var = this.x0;
            if (abs < 0.001f) {
                ai2Var.f.t("", z, true);
            } else {
                ai2Var.f.t(dna.a(this.u1).concat("x"), z, true);
            }
        }
        this.s0.e(z, this.u1);
        qmb qmbVar = this.J0;
        float f = this.u1;
        a8[] a8VarArr = (a8[]) qmbVar.b;
        for (int i = 0; i < a8VarArr.length; i++) {
            if (!z2 || ((i != 0 || Math.abs(f - 0.2f) >= 0.01f) && ((i != 1 || Math.abs(f - 0.5f) >= 0.1f) && ((i != 2 || Math.abs(f - 1.0f) >= 0.1f) && ((i != 3 || Math.abs(f - 1.5f) >= 0.1f) && (i != 4 || Math.abs(f - 2.0f) >= 0.1f)))))) {
                a8VarArr[i].d(-328966, -328966);
            } else {
                a8VarArr[i].d(-9718023, -9718023);
            }
        }
    }

    public final void S2() {
        int q;
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
                    q = this.l8;
                } else if (this.j8 == this.h8 && this.k8 == this.i8) {
                    this.l8 = this.m8;
                    q = MediaController.q(this.j8, this.k8, this.l8, false);
                } else {
                    this.l8 = MediaController.P(this.i8, this.h8, this.m8, this.k8, this.j8);
                    q = MediaController.q(this.j8, this.k8, this.l8, false);
                }
                this.w8 = (long) (((q / 8) * this.n8) / 1000.0f);
            }
        }
    }

    public final boolean T0() {
        return this.I4 && U0() && this.d2 != 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void T1(Activity activity, org.telegram.ui.ActionBar.d dVar, ylb ylbVar) {
        Object[] objArr;
        a26 a26Var = this.r7;
        if (a26Var != null) {
            a26Var.a();
            this.r7 = null;
        }
        this.r7 = LaunchActivity.c0();
        Activity parentActivity = activity != null ? activity : dVar.getParentActivity();
        byte b = 0;
        cmb.J(parentActivity, false);
        this.w2 = ylbVar;
        this.l4 = dVar;
        int i = z8c.t0;
        this.U = i;
        this.B4.d = i;
        this.A4.d = i;
        this.C4.d = i;
        aa8 aa8Var = this.V1;
        if (aa8Var != null) {
            aa8Var.setAccount(i);
            this.V1.f.k(false);
        }
        ba8 ba8Var = this.W1;
        if (ba8Var != null) {
            ba8Var.setAccount(this.U);
            this.W1.f.k(false);
        }
        n1b n1bVar = this.o5;
        if (n1bVar != null) {
            n1bVar.setCurrentAccount(this.U);
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
        this.h0.addView(clippingImageView, qoe.c(40.0f, 40));
        lb8 lb8Var = new lb8(this, parentActivity, parentActivity);
        this.f0 = lb8Var;
        lb8Var.setFocusable(false);
        VideoFramesRewinder videoFramesRewinder = this.b4;
        if (videoFramesRewinder != null) {
            videoFramesRewinder.setParentView(this.f0);
        }
        this.f0.setClipChildren(true);
        this.f0.setClipToPadding(true);
        this.h0.setClipChildren(false);
        this.h0.setClipToPadding(false);
        sm0 sm0Var = new sm0(this.f0);
        this.c0 = sm0Var;
        sm0Var.a = true;
        this.Y = new g98(this);
        this.b0 = new g79();
        this.a0 = new g79();
        g98 g98Var = this.Y;
        km0 km0Var = new km0(g98Var, g98Var, g98Var);
        this.Z = km0Var;
        km0Var.e(new zgc(this.f0), this.f0);
        this.Z.g = this.b0;
        this.d0 = new wm0(this.c0, this.f0);
        this.h0.addView(this.f0, qoe.e(-1, -1, 51));
        lb8 lb8Var2 = this.f0;
        u88 u88Var = new u88(this);
        WeakHashMap weakHashMap = kfc.a;
        cfc.i(lb8Var2, u88Var);
        this.f0.setSystemUiVisibility(1792);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.e0 = layoutParams;
        layoutParams.height = -1;
        layoutParams.format = -3;
        layoutParams.width = -1;
        layoutParams.gravity = 51;
        layoutParams.type = 99;
        gm.m(layoutParams);
        this.e0.flags = -2147286784;
        kw7 kw7Var = new kw7(this.E);
        this.x4 = kw7Var;
        kw7Var.setVideoPosition(new u88(this));
        this.f0.addView(this.x4, qoe.c(-2.0f, -2));
        kw7 kw7Var2 = new kw7(this.E);
        this.y4 = kw7Var2;
        this.f0.addView(kw7Var2, qoe.c(-2.0f, -2));
        kw7 kw7Var3 = new kw7(this.E);
        this.z4 = kw7Var3;
        this.f0.addView(kw7Var3, qoe.c(-2.0f, -2));
        x20 x20Var = new x20(b2, parentActivity, this);
        this.G = x20Var;
        x20Var.setOverlayTitleAnimation(true);
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
        ob8 ob8Var = new ob8(parentActivity);
        this.N = ob8Var;
        this.G.addView(ob8Var, qoe.e(-1, -1, nm7.D1));
        this.f0.addView(this.G, qoe.c(-2.0f, -1));
        nb8 nb8Var = new nb8(parentActivity);
        this.O = nb8Var;
        this.f0.addView(nb8Var, qoe.e(-1, -2, 55));
        this.G.setActionBarMenuOnItemClick(new r98(this, ylbVar));
        r6 t = this.G.t();
        this.B0 = t;
        t.setOnLayoutListener(new n88(this, (byte) 17));
        r7 a = this.B0.a(26, R.drawable.menu_delete_old);
        this.F0 = a;
        a.setContentDescription(jb6.L0(2131751535));
        rve.a(this.F0);
        R1(this.F0, false, false);
        r7 a2 = this.B0.a(11, R.drawable.msg_mask);
        this.E0 = a2;
        a2.setContentDescription(jb6.L0(2131748436));
        r7 a3 = this.B0.a(18, R.drawable.msg_header_draw);
        this.D0 = a3;
        a3.setContentDescription(jb6.L0(2131754809));
        byte b4 = 4;
        r7 a4 = this.B0.a(4, R.drawable.msg_header_share);
        this.C0 = a4;
        a4.setContentDescription(jb6.L0(2131750519));
        r6 r6Var = this.B0;
        ai2 ai2Var = new ai2(this.F, R.drawable.video_settings, new r63());
        this.x0 = ai2Var;
        r7 d = r6Var.d(1, ai2Var);
        this.q0 = d;
        this.x0.setCallback(d.getIconView());
        this.q0.getPopupLayout().setSwipeBackForegroundColor(-14540254);
        this.q0.getPopupLayout().c = true;
        this.q0.getPopupLayout().setFitItems(true);
        this.q0.setMenuXOffset(gm.L(3.0f));
        v7 v7Var = new v7(this.F, ylbVar);
        this.s0 = v7Var;
        byte b5 = 5;
        v7Var.setStops(new float[]{0.5f, 1.0f, 1.5f, 2.0f, 2.5f});
        this.s0.setMinimumWidth(gm.L(196.0f));
        this.s0.setDrawShadow(false);
        this.s0.setBackgroundColor(-14540254);
        this.s0.setTextColor(-1);
        this.s0.setLabel(jb6.L0(2131743271));
        this.s0.setOnValueChange(new v88(this, (byte) 1));
        this.q0.getPopupLayout().a(this.s0, qoe.o(-1, 44));
        j8 a5 = this.q0.a(-1);
        this.A0 = a5;
        a5.setColor(-15198184);
        ActionBarPopupWindow$ActionBarPopupWindowLayout popupLayout = this.q0.getPopupLayout();
        qmb qmbVar = new qmb(this.F, new u88(this));
        this.J0 = qmbVar;
        popupLayout.addView(qmbVar);
        LinearLayout linearLayout = new LinearLayout(this.F);
        this.y0 = linearLayout;
        linearLayout.setOrientation(1);
        this.q0.getPopupLayout().addView(this.y0);
        a8 e = this.q0.e(22, R.drawable.menu_video_loop, jb6.L0(2131743272));
        this.t0 = e;
        e.setSelectorColor(268435455);
        o20 o20Var = new o20(this, this.F, b3);
        this.H0 = o20Var;
        try {
            o20Var.setRouteSelector(ie1.c(this.F).a());
            objArr = true;
        } catch (Exception e2) {
            fc4.f(e2);
            objArr = false;
        }
        this.H0.setVisibility(4);
        if (objArr != false) {
            a8 e3 = this.q0.e(24, R.drawable.menu_video_chromecast, jb6.L0(2131743276));
            this.G0 = e3;
            e3.f(false);
            this.G0.setSelectorColor(268435455);
            this.G0.addView(this.H0, 0, qoe.c(-1.0f, -1));
        }
        this.q0.I(-115203550);
        this.q0.setOnMenuDismiss(new t88(this, (byte) 9));
        r7 a6 = this.B0.a(0, R.drawable.media_more);
        this.p0 = a6;
        a6.setContentDescription(jb6.L0(2131754838));
        this.p0.setOnClickListener(new y88(this, b4));
        this.p0.setOnMenuDismiss(new t88(this, (byte) 10));
        this.p0.getPopupLayout().setSwipeBackForegroundColor(-14540254);
        this.p0.getPopupLayout().c = true;
        this.p0.getPopupLayout().setFitItems(true);
        this.K0 = new zh2(this.F, this.p0.getPopupLayout().getSwipeBack(), new u88(this));
        a8 i2 = this.p0.i(R.drawable.msg_gallery, null, jb6.L0(2131745663), this.K0.a);
        i2.d(-328966, -328966);
        this.u0 = i2;
        i2.setOnClickListener(new y88(this, b5));
        j8 a7 = this.p0.a(-1);
        this.v0 = a7;
        a7.setColor(-15198184);
        this.p0.e(10, R.drawable.msg_openin, jb6.L0(2131747529)).d(-328966, -328966);
        a8 e4 = this.p0.e(6, R.drawable.menu_video_pip, jb6.L0(2131746955));
        e4.d(-328966, -328966);
        this.w0 = e4;
        r86 r86Var = new r86(false);
        this.p7 = r86Var;
        a8 f = this.p0.f(r86Var, jb6.L0(2131743275), nm7.J1, true, 0);
        this.o7 = f;
        f.d(-328966, -328966);
        this.o7.setItemHeight(56);
        this.o7.setSelectorColor(268435455);
        this.o7.setRightIcon(R.drawable.msg_settings);
        this.o7.setSubtext(jb6.L0(2131743274));
        this.o7.getRightIcon().setBackground(cmb.e0(536870911, 1));
        int i3 = (jb6.a0 ? 3 : 5) | 16;
        ImageView rightIcon = this.o7.getRightIcon();
        boolean z = jb6.a0;
        rightIcon.setLayoutParams(qoe.d(40, 40.0f, i3, z ? 4.0f : 0.0f, 0.0f, z ? 0.0f : 4.0f, 0.0f));
        View view = new View(this.F);
        view.setBackgroundColor(536870911);
        boolean z2 = jb6.a0;
        FrameLayout.LayoutParams d2 = qoe.d(-1, 28.0f, i3, z2 ? 52.0f : 0.0f, 0.0f, z2 ? 0.0f : 52.0f, 0.0f);
        d2.width = 1;
        view.setLayoutParams(d2);
        this.o7.addView(view);
        View[] viewArr = {this.o7.getTextView(), this.o7.getSubtextView()};
        int i4 = 0;
        for (int i5 = 2; i4 < i5; i5 = 2) {
            View view2 = viewArr[i4];
            if (view2 != null) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) view2.getLayoutParams();
                layoutParams2.leftMargin = jb6.a0 ? gm.L(60.0f) : 0;
                layoutParams2.rightMargin = jb6.a0 ? 0 : gm.L(60.0f);
                view2.setLayoutParams(layoutParams2);
            }
            i4++;
        }
        this.o7.getRightIcon().setContentDescription(jb6.L0(2131744967));
        byte b6 = 8;
        this.o7.getRightIcon().setOnClickListener(new y88(this, b6));
        this.p0.u(nm7.J1);
        a8 e5 = this.p0.e(3, R.drawable.msg_media, jb6.L0(2131745081));
        this.r0 = e5;
        e5.d(-328966, -328966);
        this.p0.e(12, R.drawable.msg_gif, jb6.L0(2131745664)).d(-328966, -328966);
        this.p0.e(5, R.drawable.msg_message, jb6.L0(2131745076)).d(-328966, -328966);
        this.p0.e(25, R.drawable.msg_sticker, jb6.L0(2131751641)).d(-328966, -328966);
        this.p0.e(21, R.drawable.menu_reply, jb6.L0(2131745996)).d(-328966, -328966);
        this.p0.e(23, R.drawable.msg_report, jb6.L0(2131745945)).d(-328966, -328966);
        this.p0.e(9, R.drawable.msg_shareout, jb6.L0(2131745193)).d(-328966, -328966);
        this.p0.e(13, R.drawable.msg_sticker, jb6.L0(2131745062)).d(-328966, -328966);
        this.p0.e(14, R.drawable.msg_openprofile, jb6.L0(2131745276)).d(-328966, -328966);
        this.p0.e(19, R.drawable.msg_translate, jb6.L0(2131743643)).d(-328966, -328966);
        this.p0.e(20, R.drawable.msg_translate, jb6.L0(2131749061)).d(-328966, -328966);
        byte b7 = 7;
        this.p0.e(7, R.drawable.msg_delete, jb6.L0(2131751535)).d(-328966, -328966);
        this.p0.e(8, R.drawable.msg_cancel, jb6.L0(2131744528)).d(-328966, -328966);
        this.p0.I(-115203550);
        this.p0.u(19);
        this.p0.u(20);
        S1(false, true);
        this.p0.setPopupItemsSelectorColor(268435455);
        this.p0.setSubMenuDelegate(new s98(this));
        a6 a6Var = new a6(this.F, (byte) 23);
        this.j0 = a6Var;
        a6Var.setBackgroundColor(2130706432);
        this.f0.addView(this.j0, qoe.e(-1, 48, 83));
        View view3 = new View(this.F);
        this.k0 = view3;
        view3.setBackgroundColor(this.d2 == 11 ? -16777216 : 2130706432);
        this.h0.addView(this.k0, qoe.a(-1.0f, this.l0 / gm.p, 87));
        this.w1[0] = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{838860800, 0});
        this.w1[0].setShape(0);
        this.w1[1] = new GradientDrawable(GradientDrawable.Orientation.RIGHT_LEFT, new int[]{838860800, 0});
        this.w1[1].setShape(0);
        td5 td5Var = new td5(this.F, gm.L(10.0f));
        this.m1 = td5Var;
        this.f0.addView(td5Var, qoe.e(-1, 68, 83));
        this.m1.setDelegate(new u98(this));
        for (int i6 = 0; i6 < 3; i6++) {
            this.y3[i6] = new ImageView(this.E);
            this.y3[i6].setImageResource(R.drawable.msg_maxvideo);
            this.y3[i6].setContentDescription(jb6.M0(2131754717, "AccSwitchToFullscreen"));
            this.y3[i6].setScaleType(ImageView.ScaleType.CENTER);
            this.y3[i6].setBackground(cmb.f0(1090519039, 1, -1));
            this.y3[i6].setVisibility(4);
            this.y3[i6].setAlpha(1.0f);
            this.f0.addView(this.y3[i6], qoe.c(48.0f, 48));
            this.y3[i6].setOnClickListener(new m88(this, b));
        }
        this.R = new v98(null, new r63(), b);
        hb8 hb8Var = new hb8(this.f0.getContext());
        this.R1 = hb8Var;
        byte b8 = 3;
        hb8Var.setFactory(new jl3(this, b8));
        this.R1.setVisibility(4);
        H1(true);
        int i7 = 0;
        while (i7 < b8) {
            this.X0[i7] = new w98(this, this.f0);
            this.X0[i7].d(0, false, true);
            i7++;
            b8 = 3;
        }
        dj1 dj1Var = new dj1(this, this.F, ylbVar);
        this.Y0 = dj1Var;
        dj1Var.setUseSelfAlpha(true);
        this.Y0.setProgressColor(-1);
        this.Y0.setSize(gm.L(54.0f));
        this.Y0.setBackgroundResource(R.drawable.circle_big);
        this.Y0.setVisibility(4);
        this.Y0.setAlpha(0.0f);
        this.f0.addView(this.Y0, qoe.e(64, 64, 17));
        H();
        RadialProgressView radialProgressView = new RadialProgressView(this.E, ylbVar);
        this.V7 = radialProgressView;
        radialProgressView.setProgressColor(-1);
        this.V7.setBackgroundResource(R.drawable.circle_big);
        this.V7.setVisibility(4);
        this.f0.addView(this.V7, qoe.e(54, 54, 17));
        kb2 kb2Var = new kb2(this.E, (byte) 3);
        this.U7 = kb2Var;
        kb2Var.setBackgroundColor(2130706432);
        this.U7.b();
        this.U7.setTranslationY(gm.L(120.0f));
        ((TextView) this.U7.b).setText(jb6.M0(2131751291, "Done").toUpperCase());
        TextView textView = (TextView) this.U7.b;
        int i8 = cmb.pg;
        anb.X(textView, i8, ylbVar);
        this.f0.addView(this.U7, qoe.e(-1, 48, 83));
        ((TextView) this.U7.d).setOnClickListener(new m88(this, (byte) 3));
        ((TextView) this.U7.b).setOnClickListener(new m88(this, (byte) 4));
        ucc uccVar = new ucc(false);
        this.A1 = uccVar;
        uccVar.n = new fk3(this);
        lb8 lb8Var3 = this.f0;
        Objects.requireNonNull(lb8Var3);
        this.B1 = new lx9(new q78(lb8Var3, 1 == true ? 1 : 0), false);
        rb8 rb8Var = new rb8(this.E, this);
        this.T7 = rb8Var;
        rb8Var.setTranslationY(gm.L(120.0f));
        this.T7.setVisibility(4);
        this.T7.setBackgroundColor(2130706432);
        this.f0.addView(this.T7, qoe.d(-1, 70.0f, 83, 0.0f, 0.0f, 0.0f, 48.0f));
        new Paint().setColor(2130706432);
        jp0 jp0Var = new jp0(this, this.F);
        this.Q0 = jp0Var;
        this.f0.addView(jp0Var, qoe.e(-1, -2, 83));
        TextView textView2 = new TextView(this.f0.getContext());
        this.m0 = textView2;
        textView2.setTextSize(1, 15.0f);
        this.m0.setTypeface(gm.o());
        this.m0.setSingleLine(true);
        this.m0.setMaxLines(1);
        TextView textView3 = this.m0;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView3.setEllipsize(truncateAt);
        this.m0.setTextColor(-1);
        this.m0.setGravity(3);
        this.Q0.addView(this.m0, qoe.d(-1, -2.0f, 51, 20.0f, 23.0f, 84.0f, 0.0f));
        TextView textView4 = new TextView(this.f0.getContext());
        this.n0 = textView4;
        textView4.setTextSize(1, 14.0f);
        this.n0.setSingleLine(true);
        this.n0.setMaxLines(1);
        this.n0.setEllipsize(truncateAt);
        this.n0.setTextColor(-1);
        this.n0.setGravity(3);
        this.Q0.addView(this.n0, qoe.d(-1, -2.0f, 51, 20.0f, 46.0f, 84.0f, 0.0f));
        TextView textView5 = new TextView(this.f0.getContext());
        this.o0 = textView5;
        int i10 = cmb.Ei;
        anb.R(textView5, ulb.e(y0(i10), 6.0f), anb.M(i10), anb.e(i10), ylbVar);
        TextView textView6 = this.o0;
        int i11 = cmb.Ii;
        anb.X(textView6, i11, ylbVar);
        this.o0.setEllipsize(truncateAt);
        this.o0.setGravity(17);
        this.o0.setLines(1);
        this.o0.setSingleLine(true);
        this.o0.setText(jb6.M0(2131745275, "SetAsMyPhoto"));
        this.o0.setTextSize(1, 15.0f);
        this.o0.setTypeface(gm.o());
        this.o0.setOnClickListener(new m88(this, b7));
        this.o0.setVisibility(8);
        this.Q0.addView(this.o0, qoe.d(-1, 48.0f, 51, 20.0f, 0.0f, 20.0f, 64.0f));
        x98 x98Var = new x98(this.E, this);
        this.X7 = x98Var;
        x98Var.setDelegate(new uz0(this));
        FrameLayout frameLayout = new FrameLayout(this.E);
        this.W7 = frameLayout;
        frameLayout.setClipChildren(false);
        this.W7.addView(this.X7, qoe.e(-1, 54, 83));
        m2(false, false);
        this.f0.addView(this.W7, qoe.d(-1, 54.0f, 83, 0.0f, 8.0f, 0.0f, 0.0f));
        r7 r7Var = this.F0;
        if (r7Var != null) {
            im0 a8 = this.Z.a(r7Var);
            a8.p(qqd.i(ylbVar));
            a8.r(gm.L(20.0f));
            a8.q(gm.L(7.0f));
            r7Var.setBackground(tl0.d(a8, gm.L(54.0f), gm.L(54.0f)));
        }
        y98 y98Var = new y98(this.E, jb6.L0(2131751145));
        this.h1 = y98Var;
        im0 a9 = this.Z.a(y98Var);
        a9.p(qqd.i(ylbVar));
        y98Var.setBlurredBackgroundDrawable(a9);
        rve.a(this.h1);
        this.h1.setOnClickListener(new m88(this, b6));
        this.f0.addView(this.h1, qoe.d(-1, 32.0f, 87, 60.0f, 0.0f, 60.0f, 0.0f));
        wb8 wb8Var = new wb8(this.E, ylbVar, this.c0);
        this.p5 = wb8Var;
        cu3 cu3Var = wb8Var.c;
        im0 a10 = this.Z.a(cu3Var);
        a10.p(qqd.i(ylbVar));
        cu3Var.setBlurredBackgroundDrawable(a10);
        rve.a(this.p5.c);
        this.p5.setVisibility(8);
        this.p5.setAlpha(0.0f);
        this.p5.setOnClose(new n88(this, (byte) 12));
        this.f0.addView(this.p5, qoe.e(-1, -1, nm7.D1));
        this.p5.b.setOnClickListener(new m88(this, (byte) 10));
        this.p5.setOnGalleryImage(new t88(this, (byte) 4));
        c7 c7Var = new c7((byte) 3, this.E, this);
        this.f1 = c7Var;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        c7Var.setScaleType(scaleType);
        c7 c7Var2 = this.f1;
        kc2 kc2Var = new kc2(this.E);
        this.e1 = kc2Var;
        c7Var2.setImageDrawable(kc2Var);
        this.f1.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        View view4 = this.f1;
        im0 a11 = this.Z.a(view4);
        a11.p(qqd.i(null));
        a11.q(gm.L(4.0f));
        a11.r(gm.L(16.0f));
        view4.setBackground(a11);
        rve.a(this.f1);
        this.f0.addView(this.f1, qoe.d(40, 40.0f, 83, 8.0f, 0.0f, 0.0f, -4.0f));
        this.f1.setOnClickListener(new m88(this, (byte) 11));
        o96 o96Var = new o96(this.f0.getContext());
        this.g1 = o96Var;
        o96Var.setOnClickListener(new m88(this, (byte) 12));
        this.f0.addView(this.g1, qoe.d(45, 45.0f, 83, 8.0f, 0.0f, 0.0f, -4.0f));
        Context context = this.f0.getContext();
        z zVar2 = this.h0;
        lb8 lb8Var4 = this.f0;
        byte b9 = 16;
        aa8 aa8Var2 = new aa8(this, context, zVar2, lb8Var4, lb8Var4, ylbVar, this.c0, new n88(this, b9));
        this.V1 = aa8Var2;
        aa8Var2.setBlurredBackgroundDrawableForMentions(this.Z);
        this.V1.setOnTimerChange(new t88(this, (byte) 5));
        this.V1.setAccount(this.U);
        this.V1.setOnHeightUpdate(new t88(this, (byte) 6));
        this.V1.setOnAddPhotoClick(new m88(this, (byte) 13));
        ContextThemeWrapper contextThemeWrapper = this.F;
        z zVar3 = this.h0;
        lb8 lb8Var5 = this.f0;
        ba8 ba8Var2 = new ba8(this, contextThemeWrapper, zVar3, lb8Var5, lb8Var5, ylbVar, this.c0, new n88(this, b9));
        this.W1 = ba8Var2;
        ba8Var2.setBlurredBackgroundDrawableForMentions(this.Z);
        this.W1.D(true, false);
        this.W1.setOnTimerChange(new t88(this, (byte) 7));
        this.W1.setAccount(this.U);
        this.W1.setOnHeightUpdate(new t88(this, (byte) 8));
        this.W1.setOnAddPhotoClick(new m88(this, (byte) 14));
        yc ycVar = new yc(this, this.F);
        this.r5 = ycVar;
        ycVar.setVisibility(8);
        this.f0.addView(this.r5, qoe.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        n1b n1bVar2 = new n1b(this.F, ylbVar);
        this.o5 = n1bVar2;
        n1bVar2.setCurrentAccount(this.U);
        lb8 lb8Var6 = this.f0;
        lb8Var6.addView(this.o5, lb8Var6.indexOfChild(this.G) - 1, qoe.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        db8 db8Var = new db8(this);
        this.s5 = db8Var;
        db8Var.setRad(18);
        this.s5.l();
        this.o5.setStickerCutOutBtn(this.s5);
        this.s5.setOnClickListener(new m88(this, (byte) 15));
        this.s5.setCutOutState(false);
        this.f0.addView(this.s5, qoe.e(-1, 36, 17));
        LinearLayout linearLayout2 = new LinearLayout(this.E);
        this.t5 = linearLayout2;
        linearLayout2.setOrientation(0);
        db8 db8Var2 = new db8(this);
        this.u5 = db8Var2;
        db8Var2.s0 = true;
        db8Var2.setRad(18);
        this.u5.setEraseState(false);
        this.u5.setOnClickListener(new m88(this, b9));
        this.t5.addView(this.u5, qoe.o(-2, 36));
        this.t5.addView(new Space(this.E), qoe.o(12, -1));
        db8 db8Var3 = new db8(this);
        this.v5 = db8Var3;
        db8Var3.s0 = true;
        db8Var3.setRad(18);
        this.v5.setRestoreState(false);
        this.v5.setOnClickListener(new m88(this, (byte) 17));
        this.t5.addView(this.v5, qoe.o(-2, 36));
        this.f0.addView(this.t5, qoe.e(-2, 36, 17));
        db8 db8Var4 = new db8(this);
        this.w5 = db8Var4;
        db8Var4.setUndoState(false);
        this.w5.setRad(18);
        db8 db8Var5 = this.w5;
        db8Var5.s0 = true;
        db8Var5.setOnClickListener(new m88(this, (byte) 18));
        this.f0.addView(this.w5, qoe.e(-2, 36, 17));
        db8 db8Var6 = new db8(this);
        this.x5 = db8Var6;
        db8Var6.setOutlineState(false);
        this.x5.setRad(18);
        db8 db8Var7 = this.x5;
        db8Var7.s0 = true;
        db8Var7.setOnClickListener(new m88(this, (byte) 19));
        this.f0.addView(this.x5, qoe.e(-2, 36, 17));
        f2(false, false);
        k2(false, false);
        ne6 ne6Var = new ne6((byte) 9, this.E, this);
        this.Y1 = ne6Var;
        ne6Var.addView(this.V1, qoe.e(-1, -1, 83));
        this.f0.addView(this.Y1, qoe.d(-1, -1.0f, 83, 0.0f, 8.0f, 0.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(this.E);
        this.Z1 = frameLayout2;
        frameLayout2.addView(this.W1, qoe.e(-1, -1, 51));
        this.f0.addView(this.Z1, qoe.d(-1, -1.0f, 51, 0.0f, 8.0f, 0.0f, 0.0f));
        FrameLayout frameLayout3 = new FrameLayout(this.E);
        this.R0 = frameLayout3;
        this.f0.addView(frameLayout3, qoe.d(-1, 120.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        FrameLayout frameLayout4 = new FrameLayout(this.E);
        this.S0 = frameLayout4;
        this.f0.addView(frameLayout4, qoe.d(-1, 120.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView7 = new TextView(this.E);
        this.Y7 = textView7;
        textView7.setSingleLine(true);
        this.Y7.setVisibility(8);
        this.Y7.setText(jb6.M0(2131752070, "ChooseCover"));
        this.Y7.setGravity(1);
        this.Y7.setTextSize(1, 14.0f);
        this.Y7.setTextColor(-7566196);
        this.f0.addView(this.Y7, qoe.d(-1, -2.0f, 83, 0.0f, 8.0f, 0.0f, 0.0f));
        vi3 vi3Var = new vi3(this, this.E, ylbVar);
        this.T0 = vi3Var;
        int L = gm.L(52.0f);
        int L2 = gm.L(38.0f);
        vi3Var.L = L;
        vi3Var.M = L2;
        vi3 vi3Var2 = this.T0;
        vi3Var2.s0 = true;
        im0 a12 = this.Z.a(vi3Var2);
        a12.p(qqd.i(ylbVar));
        vi3Var2.setBlurredBackgroundDrawable(a12);
        this.f0.addView(this.T0, qoe.d(nm7.E1, 120.0f, 85, 0.0f, 0.0f, 8.0f, 2.0f));
        this.T0.setContentDescription(jb6.M0(2131745374, "Send"));
        rve.a(this.T0);
        this.T0.setOnClickListener(new m88(this, (byte) 20));
        this.T0.setOnLongClickListener(new au(this, (byte) 10));
        j85 j85Var = new j85(this.E);
        this.U0 = j85Var;
        View view5 = j85Var.b;
        im0 a13 = this.Z.a(view5);
        a13.p(qqd.i(ylbVar));
        a13.r(gm.L(18.0f));
        a13.q(gm.L(7.0f));
        view5.setBackground(a13);
        View view6 = this.U0.c;
        im0 a14 = this.Z.a(view6);
        a14.p(qqd.i(ylbVar));
        a14.r(gm.L(18.0f));
        a14.q(gm.L(7.0f));
        view6.setBackground(a14);
        this.U0.setVisibility(8);
        this.U0.b.setOnClickListener(new m88(this, (byte) 21));
        this.U0.c.setOnClickListener(new m88(this, (byte) 22));
        this.f0.addView(this.U0, qoe.e(-1, 56, 80));
        qmb qmbVar2 = new qmb((byte) 9, this.E, this);
        this.I0 = qmbVar2;
        qmbVar2.setOrientation(0);
        this.I0.setPadding(gm.L(2.0f), 0, gm.L(2.0f), 0);
        View view7 = this.I0;
        im0 a15 = this.Z.a(view7);
        a15.p(qqd.i(ylbVar));
        a15.q(gm.L(2.0f));
        a15.r(gm.L(22.0f));
        view7.setBackground(a15);
        this.Q0.addView(this.I0, qoe.d(-2, 48.0f, 81, 0.0f, 3.0f, 63.0f, 0.0f));
        ImageView imageView = new ImageView(this.E);
        this.a1 = imageView;
        imageView.setScaleType(scaleType);
        this.a1.setImageResource(R.drawable.media_crop);
        ImageView imageView2 = this.a1;
        float L3 = gm.L(22.0f);
        int L4 = gm.L(4.0f);
        int L5 = gm.L(6.0f);
        imageView2.setBackground(cmb.W(L3, 285212671, L4, L5, L4, L5));
        this.I0.addView(this.a1, qoe.o(48, 48));
        this.a1.setOnClickListener(new m88(this, (byte) 23));
        this.a1.setContentDescription(jb6.M0(2131751635, "CropImage"));
        ImageView imageView3 = new ImageView(this.E);
        this.c1 = imageView3;
        imageView3.setScaleType(scaleType);
        this.c1.setImageResource(R.drawable.msg_photo_rotate);
        ImageView imageView4 = this.c1;
        float L6 = gm.L(22.0f);
        int L7 = gm.L(4.0f);
        int L8 = gm.L(6.0f);
        imageView4.setBackground(cmb.W(L6, 285212671, L7, L8, L7, L8));
        this.I0.addView(this.c1, qoe.o(48, 48));
        this.c1.setOnClickListener(new m88(this, (byte) 24));
        this.c1.setContentDescription(jb6.M0(2131754782, "AccDescrRotate"));
        ImageView imageView5 = new ImageView(this.E);
        this.b1 = imageView5;
        imageView5.setScaleType(scaleType);
        this.b1.setImageResource(R.drawable.media_flip);
        ImageView imageView6 = this.b1;
        float L9 = gm.L(22.0f);
        int L10 = gm.L(4.0f);
        int L11 = gm.L(6.0f);
        imageView6.setBackground(cmb.W(L9, 285212671, L10, L11, L10, L11));
        this.I0.addView(this.b1, qoe.o(48, 48));
        this.b1.setOnClickListener(new m88(this, (byte) 25));
        this.b1.setContentDescription(jb6.M0(2131754839, "AccDescrMirror"));
        ImageView imageView7 = new ImageView(this.E);
        this.Z0 = imageView7;
        imageView7.setScaleType(scaleType);
        this.Z0.setImageResource(R.drawable.media_draw);
        ImageView imageView8 = this.Z0;
        float L12 = gm.L(22.0f);
        int L13 = gm.L(4.0f);
        int L14 = gm.L(6.0f);
        imageView8.setBackground(cmb.W(L12, 285212671, L13, L14, L13, L14));
        this.I0.addView(this.Z0, qoe.o(48, 48));
        this.Z0.setOnClickListener(new m88(this, (byte) 26));
        this.Z0.setContentDescription(jb6.M0(2131754809, "AccDescrPhotoEditor"));
        kcc kccVar = new kcc(this.E);
        this.k1 = kccVar;
        kccVar.setTag(1);
        kcc kccVar2 = this.k1;
        float L15 = gm.L(22.0f);
        int L16 = gm.L(4.0f);
        int L17 = gm.L(6.0f);
        kccVar2.setBackground(cmb.W(L15, 285212671, L16, L17, L16, L17));
        this.d8 = E1();
        this.k1.a(Math.min(this.j8, this.k8), this.p8 && this.e8 > 1, this.r);
        this.k1.setContentDescription(jb6.M0(2131754734, "AccDescrVideoQuality"));
        this.I0.addView(this.k1, qoe.o(48, 48));
        this.k1.setOnClickListener(new n06(this, parentActivity, (byte) 19));
        ImageView imageView9 = new ImageView(this.E);
        this.d1 = imageView9;
        imageView9.setScaleType(scaleType);
        this.d1.setImageResource(R.drawable.media_settings);
        ImageView imageView10 = this.d1;
        float L18 = gm.L(22.0f);
        int L19 = gm.L(4.0f);
        int L20 = gm.L(6.0f);
        imageView10.setBackground(cmb.W(L18, 285212671, L19, L20, L19, L20));
        this.I0.addView(this.d1, qoe.o(48, 48));
        this.d1.setOnClickListener(new m88(this, (byte) 27));
        this.d1.setContentDescription(jb6.M0(2131754810, "AccDescrPhotoAdjust"));
        kb2 kb2Var2 = new kb2(this.F, (byte) 3);
        this.V0 = kb2Var2;
        kb2Var2.setBackgroundColor(-872415232);
        this.V0.b();
        this.V0.setVisibility(8);
        this.f0.addView(this.V0, qoe.e(-1, 48, 83));
        ((TextView) this.V0.d).setOnClickListener(new m88(this, (byte) 28));
        ((TextView) this.V0.b).setOnClickListener(new m88(this, (byte) 29));
        TextView textView8 = new TextView(this.F);
        this.W0 = textView8;
        textView8.setClickable(false);
        this.W0.setVisibility(8);
        this.W0.setTextSize(1, 14.0f);
        this.W0.setTextColor(-1);
        this.W0.setGravity(17);
        this.W0.setBackgroundDrawable(cmb.e0(-12763843, 0));
        this.W0.setPadding(gm.L(20.0f), 0, gm.L(20.0f), 0);
        this.W0.setText(jb6.L0(2131751633).toUpperCase());
        this.W0.setTypeface(gm.o());
        this.V0.addView(this.W0, qoe.e(-2, -1, 49));
        this.W0.setOnClickListener(new y88(this, (byte) 0));
        ou4 ou4Var = new ou4(this.f0.getContext(), this);
        this.q6 = ou4Var;
        ou4Var.v = false;
        this.r6 = true;
        ou4Var.h = this;
        u88 u88Var2 = new u88(this);
        this.B4.p0(this.f0);
        ImageReceiver imageReceiver = this.B4;
        imageReceiver.l1 = (byte) 2;
        imageReceiver.K0 = true;
        imageReceiver.h1 = u88Var2;
        this.A4.p0(this.f0);
        ImageReceiver imageReceiver2 = this.A4;
        imageReceiver2.l1 = (byte) 2;
        imageReceiver2.K0 = true;
        imageReceiver2.h1 = u88Var2;
        this.C4.p0(this.f0);
        ImageReceiver imageReceiver3 = this.C4;
        imageReceiver3.l1 = (byte) 2;
        imageReceiver3.K0 = true;
        imageReceiver3.h1 = u88Var2;
        int rotation = ((WindowManager) org.telegram.messenger.a.b.getSystemService("window")).getDefaultDisplay().getRotation();
        CheckBox checkBox = new CheckBox(this.f0.getContext(), R.drawable.selectphoto_large);
        this.O0 = checkBox;
        checkBox.setDrawBackground(true);
        this.O0.setHasBorder(true);
        this.O0.setSize(34);
        this.O0.setCheckOffset(gm.L(1.0f));
        this.O0.c(y0(i8), -1);
        this.O0.setVisibility(8);
        this.f0.addView(this.O0, qoe.d(34, 34.0f, 53, 0.0f, (rotation == 3 || rotation == 1) ? 61.0f : 71.0f, 11.0f, 0.0f));
        if (!this.s) {
            ((FrameLayout.LayoutParams) this.O0.getLayoutParams()).topMargin += gm.m;
        }
        this.O0.setOnClickListener(new y88(this, 1 == true ? 1 : 0));
        CounterView counterView = new CounterView(this.E);
        this.P0 = counterView;
        this.f0.addView(counterView, qoe.d(40, 40.0f, 53, 0.0f, (rotation == 3 || rotation == 1) ? 58.0f : 68.0f, 64.0f, 0.0f));
        if (!this.s) {
            ((FrameLayout.LayoutParams) this.P0.getLayoutParams()).topMargin += gm.m;
        }
        this.P0.setOnClickListener(new y88(this, (byte) 2));
        ub8 ub8Var = new ub8(this.E);
        this.p1 = ub8Var;
        ub8Var.setVisibility(8);
        this.p1.setAlpha(0.0f);
        this.p1.setLayoutManager(new zs((byte) 11, 0, 1 == true ? 1 : 0));
        ub8 ub8Var2 = this.p1;
        s30 s30Var = new s30(this, this.E, (byte) 13);
        this.q1 = s30Var;
        ub8Var2.setAdapter(s30Var);
        this.f0.addView(this.p1, qoe.e(-1, nm7.n1, 51));
        this.p1.setOnItemClickListener(new kg4(this, (byte) 20));
        UndoView undoView = new UndoView(this.F, null, false, ylbVar);
        this.o1 = undoView;
        undoView.setAdditionalTranslationY(gm.L(112.0f));
        this.o1.h(-115203550, -1);
        this.f0.addView(this.o1, qoe.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        if (gm.A1()) {
            View view8 = new View(this.F);
            this.T3 = view8;
            view8.setContentDescription(jb6.M0(2131754929, "AccActionPlay"));
            this.T3.setFocusable(true);
            this.T3.setOnClickListener(new y88(this, (byte) 3));
            this.f0.addView(this.T3, qoe.e(64, 64, 17));
        }
        anb.R(this.o0, ulb.e(y0(i10), 6.0f), anb.M(i10), anb.e(i10), ylbVar);
        anb.X(this.o0, i11, ylbVar);
        v98 v98Var = this.R;
        v98Var.j0 = true;
        v98Var.h0 = false;
        rkb m = v98Var.m(this.h0.getContext());
        gm.B2(m);
        this.f0.addView(m);
        this.R.Q(this.f0);
        this.R.P();
        this.a.a(false, false);
    }

    public final boolean T2() {
        un5 un5Var = this.p2;
        return (un5Var == null || !un5Var.d || un5Var.e) ? false : true;
    }

    public final void U(TLRPC.Document document, TLRPC.Document document2, boolean z, f fVar) {
        this.z7 = document;
        this.y7 = document2;
        this.A7 = z;
        this.B7 = false;
        this.C7 = fVar;
        this.a6 = 0.0f;
        this.e6 = 0.0f;
        if (this.o5 != null) {
            db8 db8Var = this.x5;
            if (db8Var != null) {
                db8Var.m(false, false);
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
                        TLRPC.TL_messages_stickerSet n0 = hs6.d0(i).n0(documentAttribute.stickerset, true);
                        if (n0 != null && n0.packs != null) {
                            for (int i3 = 0; i3 < n0.packs.size(); i3++) {
                                TLRPC.TL_stickerPack tL_stickerPack = n0.packs.get(i3);
                                if (tL_stickerPack.documents.contains(Long.valueOf(document3.id)) && gw3.g(tL_stickerPack.emoticon) != null) {
                                    arrayList4.add(tL_stickerPack.emoticon);
                                }
                            }
                        }
                        if (arrayList4.isEmpty()) {
                            if (!TextUtils.isEmpty(documentAttribute.alt) && gw3.g(documentAttribute.alt) != null) {
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
        db8 db8Var2 = this.s5;
        if (db8Var2 != null) {
            db8Var2.setCutOutState(false);
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
        pb8 pb8Var = this.d;
        if (pb8Var != null && !pb8Var.P()) {
            return true;
        }
        Object obj = arrayList.get(this.O4);
        if (obj instanceof jo6) {
            return ((jo6) obj).j();
        }
        return false;
    }

    public final void U1(i22 i22Var) {
        this.b2 = i22Var;
        a26 a26Var = this.c2;
        if (a26Var != null) {
            a26Var.a();
            this.c2 = null;
        }
        if (i22Var != null) {
            dbc dbcVar = i22Var.j1;
            if (dbcVar == null) {
                dbcVar = new dbc(i22Var.getWindow());
                i22Var.j1 = dbcVar;
            }
            this.c2 = new a26(dbcVar);
        }
    }

    public final boolean V0() {
        return this.e && this.d != null;
    }

    public final void V1() {
        yv1 yv1Var;
        TLRPC.Chat chat;
        pb8 pb8Var = this.d;
        if (pb8Var != null) {
            if (pb8Var.u() != null && this.h > 0 && this.d.u().size() >= this.h && !this.d.w(this.O4)) {
                if (!this.n || (yv1Var = this.k4) == null || (chat = yv1Var.e) == null || sd2.N(chat) || !chat.slowmode_enabled) {
                    return;
                }
                ik.K(this.E, jb6.M0(2131745044, "Slowmode"), jb6.M0(2131745037, "SlowmodeSelectSendError")).o();
                return;
            }
            int E = this.d.E(this.O4, l0());
            boolean w = this.d.w(this.O4);
            this.O0.b(w, true);
            if (E >= 0) {
                s30 s30Var = this.q1;
                if (w) {
                    s30Var.i(E);
                    this.p1.z0(E);
                } else {
                    s30Var.s(E);
                    if (E == 0) {
                        this.q1.g(0);
                    }
                }
            }
            O2();
        }
    }

    public final void W() {
        ad8 ad8Var = this.U8;
        if (ad8Var == null || !ad8Var.e()) {
            this.U8 = yc3.c().k(this.c9);
        }
    }

    public final void W0() {
        WindowManager.LayoutParams layoutParams = this.e0;
        layoutParams.flags = -2147417856;
        layoutParams.softInputMode = nm7.u4;
        try {
            ((WindowManager) this.E.getSystemService("window")).updateViewLayout(this.h0, this.e0);
        } catch (Exception e) {
            fc4.g(e, true);
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
        float i0 = i0(this.t4);
        float g0 = g0();
        float min = Math.min(g0 / o, i0 / q);
        float max = Math.max(i0 / ((int) (q * min)), g0 / ((int) (o * min)));
        this.Z5 = max;
        I2(max);
    }

    public final void X0(String str, String str2, Bitmap bitmap, Bitmap bitmap2, float f, boolean z) {
        boolean z2;
        Bitmap.CompressFormat e0 = e0();
        if (bitmap == null) {
            try {
                bitmap = BitmapFactory.decodeFile(str2);
                z2 = true;
            } catch (Throwable th) {
                fc4.g(th, true);
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
        createBitmap.compress(e0, f == 512.0f ? 83 : 87, fileOutputStream);
        try {
            fileOutputStream.close();
        } catch (Exception e) {
            fc4.g(e, true);
        }
        if (z2) {
            bitmap.recycle();
        }
        createBitmap.recycle();
    }

    public final void X1(CharSequence charSequence) {
        ob8 ob8Var = this.N;
        this.e4 = (String) charSequence;
        ob8Var.c(charSequence);
        t2(true, false);
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
        k47 k47Var;
        TLRPC.Document F0;
        TLRPC.MessageMedia messageMedia;
        k47 k47Var2 = this.S4;
        String[] strArr = this.b5;
        if (k47Var2 == null && this.X4 == null && ((this.i7 == null || strArr[0] == null) && this.d2 != -1)) {
            return;
        }
        this.Q3 = false;
        if (k47Var2 != null) {
            String str = k47Var2.k.attachPath;
            if (str != null && str.length() != 0) {
                file = new File(this.S4.k.attachPath);
            }
            file = null;
            if (file == null) {
                ArrayList arrayList2 = new ArrayList();
                k47 k47Var3 = this.S4;
                TLRPC.Message message = k47Var3.k;
                if (message == null || (messageMedia = message.media) == null || (F0 = messageMedia.document) == null) {
                    F0 = k47Var3.F0();
                } else {
                    arrayList2.addAll(messageMedia.alt_documents);
                }
                if (arrayList2.size() + (F0 != null ? 1 : 0) <= 1) {
                    if (F0 != null) {
                        bc4.G(this.U);
                        file = bc4.J(F0, null, false, true);
                    } else {
                        int size = arrayList2.size();
                        int i2 = this.U;
                        if (size == 1) {
                            bc4.G(i2);
                            file = bc4.J((TLObject) arrayList2.get(0), null, false, true);
                        } else {
                            bc4.G(i2);
                            file = bc4.M(this.S4.k, false, true);
                        }
                    }
                    if (file == null || !file.exists()) {
                        if (F0 != null) {
                            bc4.G(this.U);
                            file = bc4.J(F0, null, true, true);
                        } else if (arrayList2.size() == 1) {
                            bc4.G(this.U);
                            file = bc4.J((TLObject) arrayList2.get(0), null, true, true);
                        } else {
                            file = null;
                        }
                    }
                }
                if (file != null && file.exists()) {
                    arrayList = null;
                } else if (k47.K4(this.S4.k) && ((this.S4.D2(true) || gda.x0) && !pg3.B(k47.B0(this.S4.k)) && this.S4.B())) {
                    int F = bc4.G(this.S4.K1).F(this.S4);
                    arrayList = new ArrayList();
                    arrayList.addAll(ndc.X(this.U, F0, arrayList2, F, true));
                    this.Q3 = true;
                    u(0, false);
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
                    if (this.B5 != 1 && (k47Var = this.S4) != null && !k47Var.x()) {
                        gm.q2(this.S4, this.E, null);
                        return;
                    }
                    k47 k47Var4 = this.S4;
                    t1(arrayList, uri2, true, false, null, k47Var4 == null && k47Var4.D3(), 0L);
                    this.I3 = true;
                }
                if (z) {
                    if (this.S4 != null) {
                        boolean S = bc4.G(this.U).S(strArr[0]);
                        int i3 = this.U;
                        if (S) {
                            bc4.G(i3).f(this.S4.F0());
                        } else {
                            bc4.G(i3).X(this.S4.F0(), this.S4, 1, 0);
                        }
                    } else {
                        TLRPC.BotInlineResult botInlineResult = this.X4;
                        if (botInlineResult != null) {
                            if (botInlineResult.document != null) {
                                boolean S2 = bc4.G(this.U).S(strArr[0]);
                                int i4 = this.U;
                                if (S2) {
                                    bc4.G(i4).f(this.X4.document);
                                } else {
                                    bc4.G(i4).X(this.X4.document, this.S4, 1, 0);
                                }
                            } else if (botInlineResult.content instanceof TLRPC.TL_webDocument) {
                                if (fn5.z().C.containsKey(this.X4.content.url)) {
                                    fn5.z().c(this.X4.content.url);
                                } else {
                                    fn5.z().H(this.U, this.X4.content.url, "mp4");
                                }
                            }
                        } else if (this.i7 != null) {
                            boolean S3 = bc4.G(this.U).S(strArr[0]);
                            int i5 = this.U;
                            if (S3) {
                                bc4.G(i5).f((TLRPC.Document) this.i7.d(this.O4));
                            } else {
                                bc4.G(i5).X((TLRPC.Document) this.i7.d(this.O4), this.i7.g(), 1, 1);
                            }
                        }
                    }
                    Drawable drawable = this.B4.n0;
                    if (drawable instanceof et7) {
                        ((et7) drawable).a();
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
                mb8 mb8Var = this.i7;
                if (mb8Var != null) {
                    TLObject d = mb8Var.d(this.O4);
                    if (d instanceof TLRPC.Document) {
                        File b = this.i7.b(this.O4);
                        if (b == null || b.exists()) {
                            uri = null;
                        } else {
                            uri = kd4.j(this.U, this.i7.g(), (TLRPC.Document) d);
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
                        k47 k47Var42 = this.S4;
                        t1(arrayList, uri2, true, false, null, k47Var42 == null && k47Var42.D3(), 0L);
                        this.I3 = true;
                    }
                    return;
                }
                if (this.d2 == -1) {
                    ArrayList arrayList3 = this.f7;
                    if (!arrayList3.isEmpty() && (i = this.O4) >= 0 && i < arrayList3.size()) {
                        Object obj = arrayList3.get(this.O4);
                        if (obj instanceof jo6) {
                            file = new File(((jo6) obj).I);
                            uri2 = null;
                        }
                    }
                }
                file = null;
                uri2 = null;
            } else if (botInlineResult2.document != null) {
                bc4.G(this.U);
                file = bc4.I(this.X4.document);
            } else {
                if (botInlineResult2.content instanceof TLRPC.TL_webDocument) {
                    file = new File(bc4.z(4), Utilities.a(this.X4.content.url) + "." + fn5.x(this.X4.content.url, "mp4"));
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
        k47 k47Var422 = this.S4;
        t1(arrayList, uri2, true, false, null, k47Var422 == null && k47Var422.D3(), 0L);
        this.I3 = true;
    }

    public final void Y1(boolean z, boolean z2) {
        if (this.l3 != z) {
            a6 a6Var = this.j0;
            if (z) {
                a6Var.setTag(1);
            } else {
                a6Var.setTag(null);
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
                ofFloat.addUpdateListener(new h88(this, r3));
                ofFloat.addListener(new pa8(this, z, r3));
                this.k3 = ofFloat;
                ofFloat.start();
            } else {
                this.i3.setVisibility(z ? (byte) 0 : (byte) 8);
                this.i3.setAlpha(z ? 1.0f : 0.0f);
            }
            if (this.l2 && this.i7 == null) {
                r7 r7Var = this.p0;
                if (z) {
                    r7Var.S(9);
                } else {
                    r7Var.u(9);
                }
            }
        }
    }

    public final int Z(int i) {
        if (i != 1) {
            if (i != 0) {
                if (i == 5 || i == 4 || i == 3) {
                    return 0;
                }
                return gm.L(14.0f);
            }
            if (this.d2 != 1) {
                return 0;
            }
        }
        return gm.L(16.0f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:445:0x0a85, code lost:
    
        if (r2 == 2) goto L461;
     */
    /* JADX WARN: Code restructure failed: missing block: B:446:0x0a9b, code lost:
    
        r55 = r0;
        r56 = r3;
        r57 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:608:0x0acd, code lost:
    
        if (r61.n6 != 3) goto L477;
     */
    /* JADX WARN: Code restructure failed: missing block: B:723:0x0a8d, code lost:
    
        if (r8 == (-1)) goto L455;
     */
    /* JADX WARN: Code restructure failed: missing block: B:729:0x0a99, code lost:
    
        if (r8 == r7) goto L461;
     */
    /* JADX WARN: Code restructure failed: missing block: B:750:0x0a04, code lost:
    
        if (r61.d2 == 1) goto L421;
     */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x05d5  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x05f4  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0624  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x07b1  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x07d9  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x07db  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0fb2  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x1010  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x102b  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x1051  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x10ff  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x1156  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x115d  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x11d9  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x10f1  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0818  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x08ca  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x090b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:427:0x0a29  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x0a6b  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x0ca7  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x0ce3  */
    /* JADX WARN: Removed duplicated region for block: B:461:0x0cf7  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x0d25  */
    /* JADX WARN: Removed duplicated region for block: B:468:0x0d32  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x0e8c  */
    /* JADX WARN: Removed duplicated region for block: B:529:0x0ea7  */
    /* JADX WARN: Removed duplicated region for block: B:537:0x0eba  */
    /* JADX WARN: Removed duplicated region for block: B:541:0x0ed4  */
    /* JADX WARN: Removed duplicated region for block: B:551:0x0ef9  */
    /* JADX WARN: Removed duplicated region for block: B:580:0x0f94 A[EDGE_INSN: B:580:0x0f94->B:581:0x0f94 BREAK  A[LOOP:1: B:549:0x0ef4->B:565:0x0f8e], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:589:0x0e80  */
    /* JADX WARN: Removed duplicated region for block: B:591:0x0d12  */
    /* JADX WARN: Removed duplicated region for block: B:594:0x0cce  */
    /* JADX WARN: Removed duplicated region for block: B:621:0x0b1b  */
    /* JADX WARN: Removed duplicated region for block: B:624:0x0b26 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:635:0x0b68  */
    /* JADX WARN: Removed duplicated region for block: B:645:0x0b8d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:664:0x0c25  */
    /* JADX WARN: Removed duplicated region for block: B:667:0x0c35  */
    /* JADX WARN: Removed duplicated region for block: B:670:0x0c4b  */
    /* JADX WARN: Removed duplicated region for block: B:673:0x0c62  */
    /* JADX WARN: Removed duplicated region for block: B:676:0x0c6a  */
    /* JADX WARN: Removed duplicated region for block: B:685:0x0c86  */
    /* JADX WARN: Removed duplicated region for block: B:689:0x0bc9  */
    /* JADX WARN: Removed duplicated region for block: B:698:0x0bf5  */
    /* JADX WARN: Removed duplicated region for block: B:701:0x0bfe  */
    /* JADX WARN: Removed duplicated region for block: B:732:0x0c90  */
    /* JADX WARN: Removed duplicated region for block: B:757:0x0824  */
    /* JADX WARN: Removed duplicated region for block: B:778:0x06d5  */
    /* JADX WARN: Removed duplicated region for block: B:782:0x05ef  */
    /* JADX WARN: Removed duplicated region for block: B:786:0x0676  */
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
        byte b;
        int i;
        int i2;
        w98[] w98VarArr;
        ImageView[] imageViewArr;
        long j;
        float f8;
        Canvas canvas3;
        float f10;
        float f11;
        float f12;
        ArrayList arrayList;
        long j2;
        float f13;
        float f14;
        float f15;
        boolean z;
        boolean z2;
        boolean z3;
        float f16;
        Matrix matrix;
        ra8 ra8Var;
        n1b n1bVar;
        float f17;
        float f18;
        float f19;
        ArrayList arrayList2;
        float f20;
        float f21;
        float f22;
        float f23;
        float f24;
        float f25;
        float f26;
        float f27;
        ArrayList arrayList3;
        float f28;
        float f29;
        float f30;
        float f31;
        float f32;
        Canvas canvas4;
        boolean z4;
        int q;
        int o;
        boolean z5;
        int i3;
        int i4;
        float f33;
        float f34;
        int i5;
        int i6;
        float f35;
        int i7;
        int i8;
        byte b2;
        float f36;
        float f37;
        boolean z6;
        float f38;
        float f39;
        float f40;
        Canvas canvas5;
        byte b3;
        long j3;
        int i10;
        GradientDrawable[] gradientDrawableArr;
        byte b4;
        Canvas canvas6;
        float f41;
        float f42;
        int i11;
        float f43;
        byte b5;
        float f44;
        float f45;
        float f46;
        int i12;
        int i13;
        float f47;
        float f48;
        float f49;
        float f50;
        float f51;
        int i14;
        float f52;
        float f53;
        int i15;
        int i16;
        TextureView textureView;
        float f54;
        float f55;
        float f56;
        int i17;
        float f57;
        int i18;
        int i19;
        boolean z7;
        int i20;
        boolean z8;
        ImageReceiver imageReceiver;
        int i21;
        Drawable drawable;
        int i22;
        float f58;
        float f59;
        int i23;
        boolean z9;
        kw7 kw7Var;
        ao6 ao6Var;
        boolean z10;
        oa8 oa8Var;
        byte b6;
        float f60;
        float f61;
        float f62;
        float f63;
        float f64;
        float f65;
        lx9 lx9Var;
        int i24;
        int i25;
        boolean z11;
        int i26;
        int i27;
        kw7 kw7Var2;
        float f66;
        int i28;
        int i29;
        oa8 oa8Var2;
        if (a()) {
            RenderNode renderNode = this.P8;
            if (renderNode == null) {
                renderNode = new RenderNode("photo viewer");
                this.P8 = renderNode;
            }
            renderNode.setPosition(0, 0, canvas.getWidth(), canvas.getHeight() + gm.n);
            canvas2 = this.P8.beginRecording();
        } else {
            canvas2 = canvas;
        }
        org.telegram.ui.ActionBar.d dVar = this.l4;
        float f67 = 1.0f;
        if (dVar != null && dVar.getFragmentView() != null) {
            if (!this.U6.isFinished() && this.U6.computeScrollOffset()) {
                if (this.U6.getStartX() < this.E6 && this.U6.getStartX() > this.D6) {
                    this.W5 = this.U6.getCurrX();
                }
                if (this.U6.getStartY() < this.G6 && this.U6.getStartY() > this.F6) {
                    this.X5 = this.U6.getCurrY();
                }
                H0();
                this.f0.invalidate();
            }
            float abs = Math.abs(this.X5) / (g0() / 2.0f);
            float f68 = this.l6;
            if (f68 != 0.0f) {
                abs = td4.A(1.0f, abs, f68, abs);
            }
            float i30 = ((1.0f - Utilities.i(abs, 1.0f, 0.0f)) * 0.1f) + 1.0f;
            if (!e86.e(32768)) {
                i30 = 1.0f;
            }
            View fragmentView = this.l4.getFragmentView();
            if (fragmentView.getScaleX() != i30 || fragmentView.getScaleY() != i30) {
                fragmentView.setPivotX(fragmentView.getWidth() / 2.0f);
                fragmentView.setPivotY(fragmentView.getHeight() / 2.0f);
                fragmentView.setScaleX(i30);
                fragmentView.setScaleY(i30);
            }
            i22 i22Var = this.b2;
            if (i22Var != null) {
                dy0 dy0Var = i22Var.c;
                if (dy0Var.getScaleX() != i30 || dy0Var.getScaleY() != i30) {
                    dy0Var.setPivotX(dy0Var.getWidth() / 2.0f);
                    dy0Var.setPivotY(dy0Var.getHeight() / 2.0f);
                    dy0Var.setScaleX(i30);
                    dy0Var.setScaleY(i30);
                }
            }
            byte b7 = this.m4;
            if (b7 == 1 || b7 == 2 || b7 == 3 || this.B3) {
                this.f0.invalidate();
            }
        }
        byte b8 = this.m4;
        if (b8 == 1) {
            if (this.u2) {
                canvas.save();
                canvas.translate((s0() / 2.0f) - (w0() / 2.0f), 0.0f);
            }
            if (this.i0 != null) {
                canvas.save();
                hg9.m(canvas.getHeight(), 2.0f, this.i0.getCenterY(), this.i0.getCenterX() - (canvas.getWidth() / 2.0f), canvas);
                float animationProgress = this.i0.getAnimationProgress();
                f67 = this.m4 == 1 ? animationProgress : 1.0f - animationProgress;
                canvas.scale(f67, f67, canvas.getWidth() / 2.0f, canvas.getHeight() / 2.0f);
            }
            S(0.0f, 1.0f, 0.0f, f67, canvas);
            Canvas canvas7 = canvas;
            if (this.i0 != null) {
                canvas7.restore();
            }
            if (this.u2) {
                canvas7.restore();
            }
            if (this.i0 != null && canvas2 != canvas7) {
                canvas2.save();
                canvas2.translate(this.i0.getX(), this.i0.getY());
                canvas2.scale(this.i0.getScaleX(), this.i0.getScaleY());
                this.i0.draw(canvas2);
                canvas2.restore();
            }
            if (a()) {
                this.P8.endRecording();
            } else {
                canvas7 = canvas2;
            }
            R(canvas7);
            return;
        }
        if (b8 == 3 || !(this.e || b8 == 2 || this.B3)) {
            if (a()) {
                this.P8.endRecording();
                canvas.drawRenderNode(this.P8);
                return;
            }
            return;
        }
        if (this.u2) {
            canvas2.save();
            canvas2.translate((s0() / 2) - (w0() / 2), 0.0f);
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j4 = currentTimeMillis - this.O3;
        if (j4 > 20) {
            j4 = 17;
        }
        this.O3 = currentTimeMillis;
        AnimatorSet animatorSet = this.o6;
        ArrayList arrayList4 = this.f7;
        if (animatorSet != null) {
            if (!this.U6.isFinished()) {
                this.U6.abortAnimation();
            }
            float f69 = this.Z5;
            f = 2.0f;
            float f70 = this.d6;
            float f71 = this.k6;
            float f72 = ((f70 - f69) * f71) + f69;
            float f73 = this.a6;
            float A = td4.A(this.e6, f73, f71, f73);
            float f74 = this.W5;
            float A2 = td4.A(this.b6, f74, f71, f74);
            float f75 = this.X5;
            float A3 = td4.A(this.c6, f75, f71, f75);
            float A4 = td4.A(this.f6, 0.0f, f71, 0.0f);
            f6 = (f70 == 1.0f && f69 == 1.0f && f74 == 0.0f) ? A3 : -1.0f;
            I2(f72);
            this.f0.invalidate();
            f4 = A2;
            f7 = A4;
            f5 = f72;
            f3 = A;
            f2 = A3;
        } else {
            f = 2.0f;
            if (this.m6 != 0) {
                this.W5 = this.b6;
                this.X5 = this.c6;
                float f76 = this.d6;
                this.Z5 = f76;
                this.a6 = this.e6;
                this.m6 = 0L;
                I2(f76);
                this.Q6 = false;
            }
            if (!this.U6.isFinished() && this.U6.computeScrollOffset()) {
                if (this.U6.getStartX() < this.E6 && this.U6.getStartX() > this.D6) {
                    this.W5 = this.U6.getCurrX();
                }
                if (this.U6.getStartY() < this.G6 && this.U6.getStartY() > this.F6) {
                    this.X5 = this.U6.getCurrY();
                }
                H0();
                this.f0.invalidate();
            }
            if (this.S6 != 0) {
                this.m2 = false;
                if (!arrayList4.isEmpty() && (i = this.O4) >= 0 && i < arrayList4.size()) {
                    Object obj = arrayList4.get(this.O4);
                    if (obj instanceof co6) {
                        ((co6) obj).s = l0();
                    }
                }
                byte b9 = this.S6;
                byte b10 = 1;
                if (b9 == 1) {
                    b = 0;
                    gm.c3(new n88(this, b));
                } else {
                    b = 0;
                    if (b9 == 2) {
                        gm.c3(new n88(this, b10));
                    }
                }
                this.S6 = b;
            }
            float f77 = this.Z5;
            float f78 = this.a6;
            f2 = this.X5;
            float f79 = this.W5;
            if (this.K6) {
                f3 = f78;
                f4 = f79;
                f5 = f77;
                f6 = -1.0f;
            } else {
                f3 = f78;
                f6 = f2;
                f4 = f79;
                f5 = f77;
            }
            f7 = 0.0f;
        }
        float f80 = f2 + this.Y5;
        if (this.t4 == 3) {
            f80 += this.M1.d2 / f;
        }
        float f81 = f80;
        ya8 ya8Var = this.g0;
        if (ya8Var != null) {
            ya8Var.setTranslationY(f81);
        }
        boolean z12 = this.K;
        ImageView[] imageViewArr2 = this.y3;
        if (z12) {
            boolean z13 = this.z3;
            if (f5 <= 1.0001f) {
                if (!z13 && imageViewArr2[0].getTag() == null) {
                    imageViewArr2[0].animate().alpha(1.0f).setDuration(120L).setListener(new ha8(this, (byte) 8)).start();
                    imageViewArr2[0].setTag(1);
                    this.z3 = true;
                }
            } else if (z13) {
                imageViewArr2[0].animate().alpha(0.0f).setDuration(120L).setListener(new ha8(this, (byte) 9)).start();
                imageViewArr2[0].setTag(1);
                this.z3 = false;
            }
        }
        int h0 = h0();
        int g0 = g0();
        if (this.I3 && (oa8Var2 = this.z2) != null && oa8Var2.getVisibility() == 0) {
            g0 = A0();
        }
        int i31 = g0;
        byte b11 = this.m4;
        if (b11 != 2 && b11 != 4 && !this.B3 && !this.J3) {
            byte b12 = this.t4;
            BackgroundDrawable backgroundDrawable = this.M0;
            if (b12 != 0 || (i29 = this.d2) == 1 || i29 == 11 || this.Z5 != 1.0f || f6 == -1.0f || this.Q6) {
                backgroundDrawable.setAlpha(nm7.d4);
            } else {
                float f82 = h0 / 4.0f;
                backgroundDrawable.setAlpha((int) Math.max(127.0f, (1.0f - (Math.min(Math.abs(f6), f82) / f82)) * 255.0f));
            }
        } else if (b11 == 4) {
            canvas2.drawColor(-16777216);
        }
        this.r1 = null;
        if (this.t4 == 0 && (i28 = this.d2) != 1 && i28 != 11) {
            if (this.Z5 >= 1.0f && !this.Q6 && !this.J6) {
                if (f4 > this.E6 + gm.L(5.0f)) {
                    this.r1 = this.A4;
                } else if (f4 < this.D6 - gm.L(5.0f)) {
                    this.r1 = this.C4;
                } else {
                    this.m1.setMoveProgress(0.0f);
                }
            }
            this.I6 = this.r1 != null;
        }
        for (int i32 = 0; i32 < 3; i32++) {
            if (i32 != 1) {
                if (i32 == 2) {
                    f66 = (f4 - this.E6) + ((-this.f0.getMeasuredWidth()) - gm.L(15.0f));
                } else {
                    float f83 = this.D6;
                    if (f4 < f83) {
                        f66 = f4 - f83;
                    }
                }
                imageViewArr2[i32].setTranslationX((f66 + this.f0.getMeasuredWidth()) - gm.L(48.0f));
            }
            f66 = 0.0f;
            imageViewArr2[i32].setTranslationX((f66 + this.f0.getMeasuredWidth()) - gm.L(48.0f));
        }
        ImageReceiver imageReceiver2 = this.r1;
        ImageReceiver imageReceiver3 = this.C4;
        w98[] w98VarArr2 = this.X0;
        if (imageReceiver2 == imageReceiver3) {
            if (!this.Q6) {
                float f84 = this.D6;
                if (f4 < f84) {
                    float min = Math.min(1.0f, (f84 - f4) / h0);
                    f60 = (-h0) - (gm.L(30.0f) / 2);
                    f62 = (1.0f - min) * 0.3f;
                    f61 = min;
                    if (this.r1.B()) {
                        f63 = f61;
                        i2 = i31;
                        w98VarArr = w98VarArr2;
                        imageViewArr = imageViewArr2;
                        j = j4;
                        f8 = f3;
                        canvas3 = canvas2;
                        f10 = f7;
                        f11 = f4;
                        f64 = f81;
                        arrayList = arrayList4;
                        j2 = 0;
                        f65 = f60;
                    } else {
                        canvas2.save();
                        float f85 = f61;
                        canvas2.translate(h0 / 2, i31 / 2);
                        canvas2.translate((gm.L(30.0f) / 2) + h0 + f60, 0.0f);
                        float f86 = 1.0f - f62;
                        canvas2.scale(f86, f86);
                        int q2 = this.r1.q();
                        int o2 = this.r1.o();
                        if (this.J4) {
                            float f87 = f60;
                            i24 = o2;
                            canvas3 = canvas2;
                            f65 = f87;
                            w98VarArr = w98VarArr2;
                            j = j4;
                            f10 = f7;
                            f63 = f85;
                            i25 = q2;
                        } else {
                            long j5 = j4;
                            ao6 ao6Var2 = this.I1;
                            if (ao6Var2 != null) {
                                n43 n43Var = this.G1;
                                if (n43Var.a) {
                                    imageViewArr = imageViewArr2;
                                    f63 = f85;
                                    float f88 = f60;
                                    i24 = o2;
                                    canvas3 = canvas2;
                                    f65 = f88;
                                    w98VarArr = w98VarArr2;
                                    f10 = f7;
                                    i25 = q2;
                                    j = j5;
                                    j2 = 0;
                                    d(canvas3, h0, i31, i25, i24, 1.0f, n43Var, ao6Var2);
                                    float f89 = i25;
                                    float f90 = i24;
                                    float min2 = Math.min(h0 / f89, i31 / f90);
                                    int i33 = (int) (f89 * min2);
                                    int i34 = (int) (f90 * min2);
                                    if (arrayList4.isEmpty()) {
                                        i2 = i31;
                                        if (this.t4 == 1 || this.d2 == 1) {
                                            z11 = this.G1.h;
                                        } else {
                                            ao6 ao6Var3 = this.I1;
                                            if (ao6Var3 != null && ao6Var3.l) {
                                                z11 = true;
                                            }
                                        }
                                        if (z11) {
                                            canvas3.scale(-1.0f, 1.0f);
                                        }
                                        this.r1.setAlpha(f63);
                                        i26 = (-i33) / 2;
                                        f8 = f3;
                                        f11 = f4;
                                        i27 = (-i34) / 2;
                                        arrayList = arrayList4;
                                        f64 = f81;
                                        this.r1.i0(i26, i27, i33, i34);
                                        this.r1.g(canvas3);
                                        kw7Var2 = this.z4;
                                        if (kw7Var2 != null && kw7Var2.getVisibility() == 0) {
                                            canvas3.clipRect(i26, i27, i33 / 2, i34 / 2);
                                            if (this.z4.getMeasuredWidth() == i25 || this.z4.getMeasuredHeight() != i24) {
                                                this.z4.measure(View.MeasureSpec.makeMeasureSpec(i25, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i24, TLObject.FLAG_30));
                                                this.z4.layout(0, 0, i25, i24);
                                            }
                                            canvas3.scale(min2, min2);
                                            canvas3.translate((-i25) / 2, (-i24) / 2);
                                            this.z4.setAlpha(1.0f);
                                            this.z4.draw(canvas3);
                                        }
                                        canvas3.restore();
                                    } else {
                                        i2 = i31;
                                    }
                                    z11 = false;
                                    if (z11) {
                                    }
                                    this.r1.setAlpha(f63);
                                    i26 = (-i33) / 2;
                                    f8 = f3;
                                    f11 = f4;
                                    i27 = (-i34) / 2;
                                    arrayList = arrayList4;
                                    f64 = f81;
                                    this.r1.i0(i26, i27, i33, i34);
                                    this.r1.g(canvas3);
                                    kw7Var2 = this.z4;
                                    if (kw7Var2 != null) {
                                        canvas3.clipRect(i26, i27, i33 / 2, i34 / 2);
                                        if (this.z4.getMeasuredWidth() == i25) {
                                        }
                                        this.z4.measure(View.MeasureSpec.makeMeasureSpec(i25, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i24, TLObject.FLAG_30));
                                        this.z4.layout(0, 0, i25, i24);
                                        canvas3.scale(min2, min2);
                                        canvas3.translate((-i25) / 2, (-i24) / 2);
                                        this.z4.setAlpha(1.0f);
                                        this.z4.draw(canvas3);
                                    }
                                    canvas3.restore();
                                }
                            }
                            float f91 = f60;
                            i24 = o2;
                            canvas3 = canvas2;
                            f65 = f91;
                            w98VarArr = w98VarArr2;
                            f10 = f7;
                            f63 = f85;
                            i25 = q2;
                            j = j5;
                        }
                        j2 = 0;
                        imageViewArr = imageViewArr2;
                        float f892 = i25;
                        float f902 = i24;
                        float min22 = Math.min(h0 / f892, i31 / f902);
                        int i332 = (int) (f892 * min22);
                        int i342 = (int) (f902 * min22);
                        if (arrayList4.isEmpty()) {
                        }
                        z11 = false;
                        if (z11) {
                        }
                        this.r1.setAlpha(f63);
                        i26 = (-i332) / 2;
                        f8 = f3;
                        f11 = f4;
                        i27 = (-i342) / 2;
                        arrayList = arrayList4;
                        f64 = f81;
                        this.r1.i0(i26, i27, i332, i342);
                        this.r1.g(canvas3);
                        kw7Var2 = this.z4;
                        if (kw7Var2 != null) {
                        }
                        canvas3.restore();
                    }
                    this.m1.setMoveProgress(-f63);
                    lx9Var = this.B1;
                    if (lx9Var == null && lx9Var.a()) {
                        f12 = f64;
                    } else {
                        canvas3.save();
                        canvas3.translate(f65, f64 / f5);
                        f12 = f64;
                        canvas3.translate((((this.Z5 + 1.0f) * h0) + gm.L(30.0f)) / f, (-f12) / f5);
                        w98 w98Var = w98VarArr[1];
                        w98Var.o = 1.0f - f62;
                        w98Var.e(0, f63, false);
                        w98VarArr[1].c(canvas3);
                        if (this.K) {
                            imageViewArr[1].setAlpha(f63);
                        }
                        canvas3.restore();
                    }
                }
            }
            f60 = f4;
            f61 = 1.0f;
            f62 = 0.0f;
            if (this.r1.B()) {
            }
            this.m1.setMoveProgress(-f63);
            lx9Var = this.B1;
            if (lx9Var == null) {
            }
            canvas3.save();
            canvas3.translate(f65, f64 / f5);
            f12 = f64;
            canvas3.translate((((this.Z5 + 1.0f) * h0) + gm.L(30.0f)) / f, (-f12) / f5);
            w98 w98Var2 = w98VarArr[1];
            w98Var2.o = 1.0f - f62;
            w98Var2.e(0, f63, false);
            w98VarArr[1].c(canvas3);
            if (this.K) {
            }
            canvas3.restore();
        } else {
            i2 = i31;
            w98VarArr = w98VarArr2;
            imageViewArr = imageViewArr2;
            j = j4;
            f8 = f3;
            canvas3 = canvas2;
            f10 = f7;
            f11 = f4;
            f12 = f81;
            arrayList = arrayList4;
            j2 = 0;
            if (this.K) {
                imageViewArr[1].setAlpha(0.0f);
            }
        }
        if (!this.Q6) {
            float f92 = this.E6;
            if (f11 > f92 && (((b6 = this.t4) == 0 || b6 == 4) && this.d2 != 1)) {
                float min3 = Math.min(1.0f, (f11 - f92) / h0);
                f15 = min3 * 0.3f;
                f14 = 1.0f - min3;
                f13 = this.E6;
                z = (this.I3 || (oa8Var = this.z2) == null || oa8Var.getVisibility() != 0) ? false : true;
                if (this.I4 || this.G2 == null || this.d2 == 11) {
                    z2 = z;
                    z3 = false;
                    f16 = 1.0f;
                } else if (U0()) {
                    z3 = true;
                    f16 = 1.0f;
                    z2 = false;
                } else {
                    float l = (this.G2.S() > j2 || this.G2.c0()) ? this.G2.U() > j2 ? Utilities.l(((this.G2.U() - 90) - r13) / 500.0f) : 1.0f : 0.0f;
                    if (l <= 0.0f) {
                        z3 = false;
                        z10 = false;
                    } else if (l < 1.0f) {
                        z10 = z;
                        z3 = true;
                    } else {
                        z10 = z;
                        z3 = false;
                    }
                    f16 = l;
                    z2 = z10;
                }
                if (!z2) {
                    this.Z8 = false;
                }
                this.K4 = false;
                matrix = this.L4;
                matrix.reset();
                ra8Var = this.O1;
                if (ra8Var != null && !this.P1 && ra8Var.getRenderView() != null) {
                    f14 = this.O1.getRenderView().getAlpha() <= 0.99f ? 0.0f : 1.0f;
                }
                if (!this.B4.B() || (z2 && this.H3)) {
                    n1bVar = this.o5;
                    if (n1bVar == null && n1bVar.j0) {
                        try {
                            arrayList2 = arrayList;
                            try {
                                z8 = ((jo6) arrayList2.get(this.O4)).w;
                            } catch (Exception unused) {
                                z8 = false;
                                if (z8) {
                                }
                                canvas3.save();
                                f20 = h0;
                                float f93 = f20 / f;
                                int i35 = i2;
                                f21 = i35;
                                float f94 = f21 / f;
                                canvas3.translate(f93 + Z(this.t4), f94 + a0(this.t4));
                                matrix.preTranslate(f93 + Z(this.t4), f94 + a0(this.t4));
                                float f95 = f12 + 0.0f;
                                canvas3.translate(f13, f95);
                                matrix.preTranslate(f13, f95);
                                f22 = f5 - f15;
                                canvas3.scale(f22, f22);
                                matrix.preScale(f22, f22);
                                canvas3.rotate(f18);
                                matrix.preRotate(f18);
                                if (this.t4 == 3) {
                                }
                                f23 = f13;
                                if (this.B3) {
                                }
                                f24 = f12;
                                f25 = f21;
                                f26 = f19;
                                f27 = f18;
                                arrayList3 = arrayList2;
                                f28 = f;
                                f29 = f10;
                                f30 = 1.0f;
                                f31 = f22;
                                f32 = f20;
                                canvas4 = canvas3;
                                z4 = z3;
                                if (!z2) {
                                }
                                q = this.B4.q();
                                o = this.B4.o();
                                float f96 = q;
                                float f97 = f32 / f96;
                                float f98 = o;
                                float f99 = f25 / f98;
                                float min4 = Math.min(f97, f99);
                                int i36 = (int) (f96 * min4);
                                z5 = z4;
                                int i37 = (int) (f98 * min4);
                                int i38 = o;
                                if (arrayList3.isEmpty()) {
                                }
                                i7 = i5;
                                i8 = i38;
                                f35 = 1.0f;
                                b2 = this.t4;
                                if (b2 == 3) {
                                }
                                f36 = f26;
                                if (z5) {
                                }
                                f37 = f33;
                                canvas4.save();
                                if (f37 > 0.0f) {
                                }
                                int i39 = i4;
                                float f100 = (-i39) / 2;
                                int i40 = i3;
                                float f101 = (-i40) / 2;
                                canvas4.translate(f100, f101);
                                if (!z2) {
                                }
                                canvas4.scale(min4, min4);
                                if (z2) {
                                }
                                if (z6) {
                                }
                                if (this.x4.getVisibility() == 0) {
                                }
                                canvas5.restore();
                                if (z5) {
                                }
                                canvas5.restore();
                                i10 = 0;
                                while (true) {
                                    gradientDrawableArr = this.w1;
                                    if (i10 >= gradientDrawableArr.length) {
                                    }
                                    i10++;
                                    b3 = b5;
                                }
                                b4 = b3;
                                canvas6 = canvas5;
                                f14 = f39;
                                f41 = 1.0f;
                                f42 = f5;
                                i11 = h0;
                                f43 = f23;
                                f12 = f34;
                                S(f43, f42, f12, f14, canvas6);
                                float f102 = f42;
                                float f103 = f12;
                                float f104 = f14;
                                Canvas canvas8 = canvas6;
                                imageReceiver = this.r1;
                                if (imageReceiver == this.A4) {
                                }
                                i21 = this.v3;
                                if (i21 != 0) {
                                }
                                if (this.u2) {
                                }
                                if (this.z2 != null) {
                                }
                                if (a()) {
                                }
                                R(canvas8);
                            }
                        } catch (Exception unused2) {
                            arrayList2 = arrayList;
                        }
                        if (z8) {
                            int L = h0 - gm.L(20.0f);
                            this.o5.k0.reset();
                            this.o5.k0.postTranslate(-0.5f, -0.5f);
                            float f105 = L;
                            this.o5.k0.postScale(f105, f105);
                            float f106 = 1.0f / f5;
                            this.o5.k0.postScale(f106, f106);
                            f19 = f11;
                            f17 = 20.0f;
                            this.o5.k0.postTranslate((-f19) / f5, (-f12) / f5);
                            f18 = f8;
                            this.o5.k0.postRotate(-f18);
                            this.o5.n();
                        } else {
                            this.o5.getClass();
                            f17 = 20.0f;
                            f18 = f8;
                            f19 = f11;
                        }
                    } else {
                        f17 = 20.0f;
                        f18 = f8;
                        f19 = f11;
                        arrayList2 = arrayList;
                    }
                    canvas3.save();
                    f20 = h0;
                    float f932 = f20 / f;
                    int i352 = i2;
                    f21 = i352;
                    float f942 = f21 / f;
                    canvas3.translate(f932 + Z(this.t4), f942 + a0(this.t4));
                    matrix.preTranslate(f932 + Z(this.t4), f942 + a0(this.t4));
                    float f952 = f12 + 0.0f;
                    canvas3.translate(f13, f952);
                    matrix.preTranslate(f13, f952);
                    f22 = f5 - f15;
                    canvas3.scale(f22, f22);
                    matrix.preScale(f22, f22);
                    canvas3.rotate(f18);
                    matrix.preRotate(f18);
                    if (this.t4 == 3 || this.M1 == null) {
                        f23 = f13;
                    } else {
                        int f0 = f0(0, true);
                        sa8 sa8Var = this.M1;
                        int i41 = gm.q.y;
                        Typeface typeface = gm.a;
                        gm.L(f17);
                        this.M1.getClass();
                        float f02 = (((f0 - sa8Var.d2) - f0(0, false)) / f) * 1.0f;
                        canvas3.translate(0.0f, f02);
                        f23 = f13;
                        this.M1.getClass();
                        matrix.preTranslate(0.0f, f02);
                    }
                    if (!this.B3 || (z2 && ((this.H3 || this.I3) && this.M3 && this.N3 == 1.0f))) {
                        f24 = f12;
                        f25 = f21;
                        f26 = f19;
                        f27 = f18;
                        arrayList3 = arrayList2;
                        f28 = f;
                        f29 = f10;
                        f30 = 1.0f;
                        f31 = f22;
                        f32 = f20;
                        canvas4 = canvas3;
                    } else {
                        Bitmap bitmap = this.N4;
                        if (bitmap == null || !this.s1) {
                            f24 = f12;
                            f25 = f21;
                            f26 = f19;
                            f27 = f18;
                            arrayList3 = arrayList2;
                            f28 = f;
                            f29 = f10;
                            f30 = 1.0f;
                            f31 = f22;
                            f32 = f20;
                            canvas4 = canvas3;
                            this.B4.setAlpha(f14);
                            int q3 = this.B4.q();
                            int o3 = this.B4.o();
                            float j0 = (this.s1 && this.t4 == 0 && this.d2 == 1) ? j0(false) : Math.min(f32 / q3, f25 / o3);
                            this.B4.i0((-r0) / 2, (-r2) / 2, (int) (q3 * j0), (int) (o3 * j0));
                            if (this.s1) {
                                if (this.I4) {
                                    z7 = U0() ? true : true;
                                }
                                this.B4.g(canvas4);
                                this.K4 = z7;
                            }
                            z4 = true;
                            if (!z2 && this.H3 && this.I3) {
                                View view = this.E2 ? this.D2 : this.C2;
                                q = view.getMeasuredWidth();
                                o = view.getMeasuredHeight();
                            } else {
                                q = this.B4.q();
                                o = this.B4.o();
                            }
                            float f962 = q;
                            float f972 = f32 / f962;
                            float f982 = o;
                            float f992 = f25 / f982;
                            float min42 = Math.min(f972, f992);
                            int i362 = (int) (f962 * min42);
                            z5 = z4;
                            int i372 = (int) (f982 * min42);
                            int i382 = o;
                            if (arrayList3.isEmpty()) {
                                byte b13 = this.t4;
                                f34 = f24;
                                i5 = q;
                                if (b13 == 3 || (i19 = this.n6) == 3) {
                                    i6 = i352;
                                } else {
                                    i6 = i352;
                                    if (this.d2 != 1) {
                                        int i42 = this.o6 != null ? -1 : -1;
                                        if (b13 != 0) {
                                            if (b13 != 4) {
                                                if (b13 != 1) {
                                                }
                                            }
                                        }
                                    } else if (i19 != 0) {
                                    }
                                }
                                n43 n43Var2 = this.E1;
                                int i43 = n43Var2.i;
                                if (i43 == 90 || i43 == 270) {
                                    f46 = f962;
                                    i12 = i5;
                                    i13 = i382;
                                } else {
                                    f46 = f962;
                                    i13 = i5;
                                    i12 = i382;
                                }
                                int i44 = this.d2;
                                if (i44 != 1) {
                                    f47 = f992;
                                    if (b13 != 3) {
                                    }
                                    f48 = f30;
                                    float f107 = n43Var2.j;
                                    i3 = i372;
                                    float f108 = n43Var2.k;
                                    f49 = i13;
                                    i4 = i362;
                                    f50 = f30 - f48;
                                    int A5 = (int) mlb.A(f30 - f107, f50, f107, f49);
                                    f51 = i12;
                                    i14 = (int) ((((f30 - f108) * f50) + f108) * f51);
                                    f33 = f29;
                                    float f109 = A5;
                                    f52 = f32 / f109;
                                    f53 = i14;
                                    if (f52 * f53 > f25) {
                                        f52 = f25 / f53;
                                    }
                                    ib8 ib8Var = this.W4;
                                    if (i44 != 1 || ((b13 == 1 && this.n6 != 0) || ib8Var.c == null)) {
                                        i15 = i14;
                                    } else {
                                        float f110 = f109 * f52;
                                        float f111 = f53 * f52;
                                        float f112 = f972 * f982 > f25 ? f47 : f972;
                                        float f113 = f112;
                                        float f114 = (f46 * f112) / f31;
                                        float f115 = f982 * f113;
                                        i15 = i14;
                                        float A6 = td4.A(f114, f110, f50, f110);
                                        float A7 = td4.A(f115 / f31, f111, f50, f111);
                                        canvas4.clipRect((-A6) / f28, (-A7) / f28, A6 / f28, A7 / f28);
                                    }
                                    i16 = this.d2;
                                    if (i16 != 1 || n43Var2.a) {
                                        if (this.t4 != 1 || i16 == 1) {
                                            textureView = this.C2;
                                            if (textureView != null) {
                                                textureView.setScaleX(n43Var2.h ? -1.0f : 1.0f);
                                                kb8 kb8Var = this.F2;
                                                if (kb8Var != null) {
                                                    kb8Var.setScaleX(this.C2.getScaleX());
                                                }
                                            }
                                            float A8 = n43Var2.f / td4.A(n43Var2.l, 1.0f, f50, 1.0f);
                                            f54 = f32 / f49;
                                            if (f54 * f51 > f25) {
                                                f54 = f25 / f51;
                                            }
                                            float f116 = (f54 / min42) * A8;
                                            if (this.d2 == 1) {
                                                if (this.t4 == 3 || (i17 = this.n6) == 3) {
                                                    f56 = ((n43Var2.m - 1.0f) * f50) + 1.0f;
                                                } else if (i17 == 0) {
                                                    f56 = n43Var2.m;
                                                }
                                                f116 /= f56;
                                            }
                                            f55 = f116;
                                        } else {
                                            TextureView textureView2 = this.C2;
                                            if (textureView2 != null) {
                                                ao6 ao6Var4 = ib8Var.c;
                                                textureView2.setScaleX((ao6Var4 == null || !ao6Var4.l) ? 1.0f : -1.0f);
                                                kb8 kb8Var2 = this.F2;
                                                if (kb8Var2 != null) {
                                                    kb8Var2.setScaleX(this.C2.getScaleX());
                                                }
                                            }
                                            ao6 ao6Var5 = ib8Var.c;
                                            float f117 = ao6Var5 != null ? ao6Var5.c : 1.0f;
                                            f55 = ((f52 / min42) / td4.A(f117, 1.0f, f50, 1.0f)) * f117;
                                        }
                                        canvas4.translate(n43Var2.d * f48, n43Var2.e * f48);
                                        if (!this.K4) {
                                            matrix.preTranslate(n43Var2.d * f48, n43Var2.e * f48);
                                        }
                                        canvas4.scale(f55, f55);
                                        if (!this.K4) {
                                            matrix.preScale(f55, f55);
                                        }
                                        canvas4.translate(mlb.C(n43Var2.b, f49, min42, f48), mlb.C(n43Var2.c, f51, min42, f48));
                                        if (!this.K4) {
                                            matrix.preTranslate(mlb.C(n43Var2.b, f49, min42, f48), mlb.C(n43Var2.c, f51, min42, f48));
                                        }
                                        f57 = n43Var2.g + i43;
                                        if (f57 > 180.0f) {
                                            f57 -= 360.0f;
                                        }
                                        if (this.d2 == 1 || !(this.t4 == 3 || this.n6 == 3)) {
                                            float f118 = f57 * f48;
                                            canvas4.rotate(f118);
                                            if (!this.K4) {
                                                matrix.preRotate(f118);
                                            }
                                        } else {
                                            canvas4.rotate(f57);
                                            if (!this.K4) {
                                                matrix.preRotate(f57);
                                            }
                                        }
                                    } else {
                                        TextureView textureView3 = this.C2;
                                        if (textureView3 != null) {
                                            float f119 = f30;
                                            textureView3.setScaleX(f119);
                                            this.C2.setScaleY(f119);
                                            kb8 kb8Var3 = this.F2;
                                            if (kb8Var3 != null) {
                                                kb8Var3.setScaleX(f119);
                                                this.F2.setScaleY(f119);
                                            }
                                        }
                                    }
                                    f35 = f52;
                                    i7 = A5;
                                    i8 = i15;
                                    b2 = this.t4;
                                    if (b2 == 3) {
                                        sa8 sa8Var2 = this.M1;
                                        sa8Var2.x0(f5, f26, (sa8Var2.getRenderView().getScaleX() * (this.d2 == 1 ? gm.m / f28 : 0.0f)) + f34, i7 * f35, i8 * f35);
                                    } else if (b2 == 4) {
                                        this.O1.b(f5, f26, f34, f27, i7 * f35, i8 * f35);
                                    }
                                    f36 = f26;
                                    if (z5 || this.E2) {
                                        f37 = f33;
                                    } else {
                                        f37 = f33;
                                        Q(canvas4, f37, f14);
                                    }
                                    canvas4.save();
                                    if (f37 > 0.0f) {
                                        canvas4.save();
                                        canvas4.scale(1.0f - (f37 * f28), 1.0f);
                                        canvas4.skew(0.0f, td4.z(1.0f, f37, f37 * 4.0f, 0.25f));
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    int i392 = i4;
                                    float f1002 = (-i392) / 2;
                                    int i402 = i3;
                                    float f1012 = (-i402) / 2;
                                    canvas4.translate(f1002, f1012);
                                    if (!z2 || this.x4.getVisibility() == 0) {
                                        canvas4.scale(min42, min42);
                                    }
                                    if (z2) {
                                        if (!this.M3 && ((this.E2 && this.S) || (this.H3 && this.I3))) {
                                            this.M3 = true;
                                            this.N3 = 0.0f;
                                            this.O3 = System.currentTimeMillis();
                                            this.f0.getMeasuredHeight();
                                        }
                                        TextureView textureView4 = this.C2;
                                        if (textureView4 != null) {
                                            textureView4.setAlpha(this.N3 * f14 * f16);
                                        }
                                        TextureView textureView5 = this.C2;
                                        if (textureView5 instanceof ncc) {
                                            ((ncc) textureView5).a(((h0 - i392) / f28) + Z(this.t4) + f23, ((i6 - i402) / f28) + a0(this.t4) + f34 + 0.0f, i392, i402);
                                        }
                                        SurfaceView surfaceView = this.D2;
                                        if (surfaceView != null && this.v3 == 0 && !this.F3 && !this.L3 && !this.B3 && surfaceView.getVisibility() != 0) {
                                            this.D2.setVisibility(0);
                                        }
                                        K2(f932 + Z(this.t4) + f23, f942 + a0(this.t4) + f34 + 0.0f, i392 * f31, i402 * f31);
                                        if (!this.E2 || this.S) {
                                            this.z2.draw(canvas4);
                                            VideoFramesRewinder videoFramesRewinder = this.b4;
                                            if (videoFramesRewinder != null) {
                                                videoFramesRewinder.draw(canvas4, this.z2.getWidth(), this.z2.getHeight());
                                            }
                                        }
                                        if (this.E2) {
                                            f45 = 1.0f;
                                            if (f14 != 1.0f) {
                                                Paint paint = this.T;
                                                if (paint == null) {
                                                    paint = new Paint();
                                                    this.T = paint;
                                                }
                                                paint.setAlpha((int) ((1.0f - f14) * 255.0f));
                                                f40 = min42;
                                                b3 = 2;
                                                i2 = i6;
                                                f39 = f14;
                                                f38 = f37;
                                                canvas5 = canvas4;
                                                canvas5.drawRect(-1.0f, -1.0f, this.z2.getWidth() + 1.0f, this.z2.getHeight() + 1.0f, this.T);
                                            } else {
                                                f38 = f37;
                                                f39 = f14;
                                                f40 = min42;
                                                canvas5 = canvas4;
                                                b3 = 2;
                                                i2 = i6;
                                            }
                                        } else {
                                            f38 = f37;
                                            f39 = f14;
                                            f40 = min42;
                                            canvas5 = canvas4;
                                            b3 = 2;
                                            i2 = i6;
                                            f45 = 1.0f;
                                        }
                                        if (this.M3) {
                                            float f120 = this.N3;
                                            if (f120 < f45) {
                                                j3 = j;
                                                this.N3 = (j3 / (this.U2 ? 100.0f : 200.0f)) + f120;
                                                this.f0.invalidate();
                                                H0();
                                                if (this.N3 > 1.0f) {
                                                    this.N3 = 1.0f;
                                                }
                                                this.x4.setAlpha(f39);
                                            }
                                        }
                                        j3 = j;
                                        this.x4.setAlpha(f39);
                                    } else {
                                        f38 = f37;
                                        f39 = f14;
                                        f40 = min42;
                                        canvas5 = canvas4;
                                        b3 = 2;
                                        j3 = j;
                                        i2 = i6;
                                    }
                                    if (z6) {
                                        canvas5.restore();
                                        canvas5.translate(f1002, f1012);
                                        if (z2 || this.x4.getVisibility() == 0) {
                                            canvas5.scale(f40, f40);
                                        }
                                    }
                                    if (this.x4.getVisibility() == 0 && (this.s1 || this.t4 != b3 || this.n6 != -1)) {
                                        if (this.d2 != 11) {
                                            canvas5.clipRect(0, 0, this.x4.getMeasuredWidth(), this.x4.getMeasuredHeight());
                                        }
                                        this.x4.draw(canvas5);
                                    }
                                    canvas5.restore();
                                    if (z5 && this.E2) {
                                        f44 = this.N3;
                                        if (f44 == 1.0f || f16 < 1.0f) {
                                            Q(canvas5, f38, Math.max(1.0f - f44, 1.0f - f16) * f39);
                                        }
                                    }
                                    canvas5.restore();
                                    i10 = 0;
                                    while (true) {
                                        gradientDrawableArr = this.w1;
                                        if (i10 >= gradientDrawableArr.length) {
                                            break;
                                        }
                                        boolean[] zArr = this.x1;
                                        boolean z14 = zArr[i10];
                                        float[] fArr = this.y1;
                                        if (z14 || fArr[i10] != 0.0f) {
                                            gradientDrawableArr[i10].setAlpha((int) (fArr[i10] * 255.0f));
                                            if (i10 == 0) {
                                                gradientDrawableArr[i10].setBounds(0, 0, this.f0.getMeasuredWidth() / 5, this.f0.getMeasuredHeight());
                                                b5 = b3;
                                            } else {
                                                b5 = b3;
                                                gradientDrawableArr[i10].setBounds(this.f0.getMeasuredWidth() - (this.f0.getMeasuredWidth() / 5), 0, this.f0.getMeasuredWidth(), this.f0.getMeasuredHeight());
                                            }
                                            gradientDrawableArr[i10].draw(canvas5);
                                        } else {
                                            b5 = b3;
                                        }
                                        if (zArr[i10]) {
                                            float f121 = fArr[i10];
                                            if (f121 < 1.0f) {
                                                float f122 = (j3 / 180.0f) + f121;
                                                fArr[i10] = f122;
                                                if (f122 > 1.0f) {
                                                    fArr[i10] = 1.0f;
                                                }
                                                this.f0.invalidate();
                                            }
                                        } else {
                                            float f123 = fArr[i10];
                                            if (f123 > 0.0f) {
                                                float f124 = f123 - (j3 / 180.0f);
                                                fArr[i10] = f124;
                                                if (f124 < 0.0f) {
                                                    fArr[i10] = 0.0f;
                                                }
                                                this.f0.invalidate();
                                            }
                                        }
                                        i10++;
                                        b3 = b5;
                                    }
                                    b4 = b3;
                                    canvas6 = canvas5;
                                    f14 = f39;
                                    f41 = 1.0f;
                                    f42 = f5;
                                    i11 = h0;
                                    f43 = f23;
                                    f12 = f34;
                                } else {
                                    f47 = f992;
                                }
                                if (this.o6 == null || (i18 = this.n6) == -1) {
                                    if (b13 == 2 || b13 == 3) {
                                        f48 = 0.0f;
                                        float f1072 = n43Var2.j;
                                        i3 = i372;
                                        float f1082 = n43Var2.k;
                                        f49 = i13;
                                        i4 = i362;
                                        f50 = f30 - f48;
                                        int A52 = (int) mlb.A(f30 - f1072, f50, f1072, f49);
                                        f51 = i12;
                                        i14 = (int) ((((f30 - f1082) * f50) + f1082) * f51);
                                        f33 = f29;
                                        float f1092 = A52;
                                        f52 = f32 / f1092;
                                        f53 = i14;
                                        if (f52 * f53 > f25) {
                                        }
                                        ib8 ib8Var2 = this.W4;
                                        if (i44 != 1) {
                                        }
                                        i15 = i14;
                                        i16 = this.d2;
                                        if (i16 != 1) {
                                        }
                                        if (this.t4 != 1) {
                                        }
                                        textureView = this.C2;
                                        if (textureView != null) {
                                        }
                                        float A82 = n43Var2.f / td4.A(n43Var2.l, 1.0f, f50, 1.0f);
                                        f54 = f32 / f49;
                                        if (f54 * f51 > f25) {
                                        }
                                        float f1162 = (f54 / min42) * A82;
                                        if (this.d2 == 1) {
                                        }
                                        f55 = f1162;
                                        canvas4.translate(n43Var2.d * f48, n43Var2.e * f48);
                                        if (!this.K4) {
                                        }
                                        canvas4.scale(f55, f55);
                                        if (!this.K4) {
                                        }
                                        canvas4.translate(mlb.C(n43Var2.b, f49, min42, f48), mlb.C(n43Var2.c, f51, min42, f48));
                                        if (!this.K4) {
                                        }
                                        f57 = n43Var2.g + i43;
                                        if (f57 > 180.0f) {
                                        }
                                        if (this.d2 == 1) {
                                        }
                                        float f1182 = f57 * f48;
                                        canvas4.rotate(f1182);
                                        if (!this.K4) {
                                        }
                                        f35 = f52;
                                        i7 = A52;
                                        i8 = i15;
                                        b2 = this.t4;
                                        if (b2 == 3) {
                                        }
                                        f36 = f26;
                                        if (z5) {
                                        }
                                        f37 = f33;
                                        canvas4.save();
                                        if (f37 > 0.0f) {
                                        }
                                        int i3922 = i4;
                                        float f10022 = (-i3922) / 2;
                                        int i4022 = i3;
                                        float f10122 = (-i4022) / 2;
                                        canvas4.translate(f10022, f10122);
                                        if (!z2) {
                                        }
                                        canvas4.scale(min42, min42);
                                        if (z2) {
                                        }
                                        if (z6) {
                                        }
                                        if (this.x4.getVisibility() == 0) {
                                            if (this.d2 != 11) {
                                            }
                                            this.x4.draw(canvas5);
                                        }
                                        canvas5.restore();
                                        if (z5) {
                                            f44 = this.N3;
                                            if (f44 == 1.0f) {
                                            }
                                            Q(canvas5, f38, Math.max(1.0f - f44, 1.0f - f16) * f39);
                                        }
                                        canvas5.restore();
                                        i10 = 0;
                                        while (true) {
                                            gradientDrawableArr = this.w1;
                                            if (i10 >= gradientDrawableArr.length) {
                                            }
                                            i10++;
                                            b3 = b5;
                                        }
                                        b4 = b3;
                                        canvas6 = canvas5;
                                        f14 = f39;
                                        f41 = 1.0f;
                                        f42 = f5;
                                        i11 = h0;
                                        f43 = f23;
                                        f12 = f34;
                                    }
                                    f48 = f30;
                                    float f10722 = n43Var2.j;
                                    i3 = i372;
                                    float f10822 = n43Var2.k;
                                    f49 = i13;
                                    i4 = i362;
                                    f50 = f30 - f48;
                                    int A522 = (int) mlb.A(f30 - f10722, f50, f10722, f49);
                                    f51 = i12;
                                    i14 = (int) ((((f30 - f10822) * f50) + f10822) * f51);
                                    f33 = f29;
                                    float f10922 = A522;
                                    f52 = f32 / f10922;
                                    f53 = i14;
                                    if (f52 * f53 > f25) {
                                    }
                                    ib8 ib8Var22 = this.W4;
                                    if (i44 != 1) {
                                    }
                                    i15 = i14;
                                    i16 = this.d2;
                                    if (i16 != 1) {
                                    }
                                    if (this.t4 != 1) {
                                    }
                                    textureView = this.C2;
                                    if (textureView != null) {
                                    }
                                    float A822 = n43Var2.f / td4.A(n43Var2.l, 1.0f, f50, 1.0f);
                                    f54 = f32 / f49;
                                    if (f54 * f51 > f25) {
                                    }
                                    float f11622 = (f54 / min42) * A822;
                                    if (this.d2 == 1) {
                                    }
                                    f55 = f11622;
                                    canvas4.translate(n43Var2.d * f48, n43Var2.e * f48);
                                    if (!this.K4) {
                                    }
                                    canvas4.scale(f55, f55);
                                    if (!this.K4) {
                                    }
                                    canvas4.translate(mlb.C(n43Var2.b, f49, min42, f48), mlb.C(n43Var2.c, f51, min42, f48));
                                    if (!this.K4) {
                                    }
                                    f57 = n43Var2.g + i43;
                                    if (f57 > 180.0f) {
                                    }
                                    if (this.d2 == 1) {
                                    }
                                    float f11822 = f57 * f48;
                                    canvas4.rotate(f11822);
                                    if (!this.K4) {
                                    }
                                    f35 = f52;
                                    i7 = A522;
                                    i8 = i15;
                                    b2 = this.t4;
                                    if (b2 == 3) {
                                    }
                                    f36 = f26;
                                    if (z5) {
                                    }
                                    f37 = f33;
                                    canvas4.save();
                                    if (f37 > 0.0f) {
                                    }
                                    int i39222 = i4;
                                    float f100222 = (-i39222) / 2;
                                    int i40222 = i3;
                                    float f101222 = (-i40222) / 2;
                                    canvas4.translate(f100222, f101222);
                                    if (!z2) {
                                    }
                                    canvas4.scale(min42, min42);
                                    if (z2) {
                                    }
                                    if (z6) {
                                    }
                                    if (this.x4.getVisibility() == 0) {
                                    }
                                    canvas5.restore();
                                    if (z5) {
                                    }
                                    canvas5.restore();
                                    i10 = 0;
                                    while (true) {
                                        gradientDrawableArr = this.w1;
                                        if (i10 >= gradientDrawableArr.length) {
                                        }
                                        i10++;
                                        b3 = b5;
                                    }
                                    b4 = b3;
                                    canvas6 = canvas5;
                                    f14 = f39;
                                    f41 = 1.0f;
                                    f42 = f5;
                                    i11 = h0;
                                    f43 = f23;
                                    f12 = f34;
                                } else {
                                    if (b13 != 1 && i18 != 1) {
                                        f48 = this.k6;
                                        if (i18 != 0) {
                                            f48 = f30 - f48;
                                        }
                                        float f107222 = n43Var2.j;
                                        i3 = i372;
                                        float f108222 = n43Var2.k;
                                        f49 = i13;
                                        i4 = i362;
                                        f50 = f30 - f48;
                                        int A5222 = (int) mlb.A(f30 - f107222, f50, f107222, f49);
                                        f51 = i12;
                                        i14 = (int) ((((f30 - f108222) * f50) + f108222) * f51);
                                        f33 = f29;
                                        float f109222 = A5222;
                                        f52 = f32 / f109222;
                                        f53 = i14;
                                        if (f52 * f53 > f25) {
                                        }
                                        ib8 ib8Var222 = this.W4;
                                        if (i44 != 1) {
                                        }
                                        i15 = i14;
                                        i16 = this.d2;
                                        if (i16 != 1) {
                                        }
                                        if (this.t4 != 1) {
                                        }
                                        textureView = this.C2;
                                        if (textureView != null) {
                                        }
                                        float A8222 = n43Var2.f / td4.A(n43Var2.l, 1.0f, f50, 1.0f);
                                        f54 = f32 / f49;
                                        if (f54 * f51 > f25) {
                                        }
                                        float f116222 = (f54 / min42) * A8222;
                                        if (this.d2 == 1) {
                                        }
                                        f55 = f116222;
                                        canvas4.translate(n43Var2.d * f48, n43Var2.e * f48);
                                        if (!this.K4) {
                                        }
                                        canvas4.scale(f55, f55);
                                        if (!this.K4) {
                                        }
                                        canvas4.translate(mlb.C(n43Var2.b, f49, min42, f48), mlb.C(n43Var2.c, f51, min42, f48));
                                        if (!this.K4) {
                                        }
                                        f57 = n43Var2.g + i43;
                                        if (f57 > 180.0f) {
                                        }
                                        if (this.d2 == 1) {
                                        }
                                        float f118222 = f57 * f48;
                                        canvas4.rotate(f118222);
                                        if (!this.K4) {
                                        }
                                        f35 = f52;
                                        i7 = A5222;
                                        i8 = i15;
                                        b2 = this.t4;
                                        if (b2 == 3) {
                                        }
                                        f36 = f26;
                                        if (z5) {
                                        }
                                        f37 = f33;
                                        canvas4.save();
                                        if (f37 > 0.0f) {
                                        }
                                        int i392222 = i4;
                                        float f1002222 = (-i392222) / 2;
                                        int i402222 = i3;
                                        float f1012222 = (-i402222) / 2;
                                        canvas4.translate(f1002222, f1012222);
                                        if (!z2) {
                                        }
                                        canvas4.scale(min42, min42);
                                        if (z2) {
                                        }
                                        if (z6) {
                                        }
                                        if (this.x4.getVisibility() == 0) {
                                        }
                                        canvas5.restore();
                                        if (z5) {
                                        }
                                        canvas5.restore();
                                        i10 = 0;
                                        while (true) {
                                            gradientDrawableArr = this.w1;
                                            if (i10 >= gradientDrawableArr.length) {
                                            }
                                            i10++;
                                            b3 = b5;
                                        }
                                        b4 = b3;
                                        canvas6 = canvas5;
                                        f14 = f39;
                                        f41 = 1.0f;
                                        f42 = f5;
                                        i11 = h0;
                                        f43 = f23;
                                        f12 = f34;
                                    }
                                    f48 = f30;
                                    float f1072222 = n43Var2.j;
                                    i3 = i372;
                                    float f1082222 = n43Var2.k;
                                    f49 = i13;
                                    i4 = i362;
                                    f50 = f30 - f48;
                                    int A52222 = (int) mlb.A(f30 - f1072222, f50, f1072222, f49);
                                    f51 = i12;
                                    i14 = (int) ((((f30 - f1082222) * f50) + f1082222) * f51);
                                    f33 = f29;
                                    float f1092222 = A52222;
                                    f52 = f32 / f1092222;
                                    f53 = i14;
                                    if (f52 * f53 > f25) {
                                    }
                                    ib8 ib8Var2222 = this.W4;
                                    if (i44 != 1) {
                                    }
                                    i15 = i14;
                                    i16 = this.d2;
                                    if (i16 != 1) {
                                    }
                                    if (this.t4 != 1) {
                                    }
                                    textureView = this.C2;
                                    if (textureView != null) {
                                    }
                                    float A82222 = n43Var2.f / td4.A(n43Var2.l, 1.0f, f50, 1.0f);
                                    f54 = f32 / f49;
                                    if (f54 * f51 > f25) {
                                    }
                                    float f1162222 = (f54 / min42) * A82222;
                                    if (this.d2 == 1) {
                                    }
                                    f55 = f1162222;
                                    canvas4.translate(n43Var2.d * f48, n43Var2.e * f48);
                                    if (!this.K4) {
                                    }
                                    canvas4.scale(f55, f55);
                                    if (!this.K4) {
                                    }
                                    canvas4.translate(mlb.C(n43Var2.b, f49, min42, f48), mlb.C(n43Var2.c, f51, min42, f48));
                                    if (!this.K4) {
                                    }
                                    f57 = n43Var2.g + i43;
                                    if (f57 > 180.0f) {
                                    }
                                    if (this.d2 == 1) {
                                    }
                                    float f1182222 = f57 * f48;
                                    canvas4.rotate(f1182222);
                                    if (!this.K4) {
                                    }
                                    f35 = f52;
                                    i7 = A52222;
                                    i8 = i15;
                                    b2 = this.t4;
                                    if (b2 == 3) {
                                    }
                                    f36 = f26;
                                    if (z5) {
                                    }
                                    f37 = f33;
                                    canvas4.save();
                                    if (f37 > 0.0f) {
                                    }
                                    int i3922222 = i4;
                                    float f10022222 = (-i3922222) / 2;
                                    int i4022222 = i3;
                                    float f10122222 = (-i4022222) / 2;
                                    canvas4.translate(f10022222, f10122222);
                                    if (!z2) {
                                    }
                                    canvas4.scale(min42, min42);
                                    if (z2) {
                                    }
                                    if (z6) {
                                    }
                                    if (this.x4.getVisibility() == 0) {
                                    }
                                    canvas5.restore();
                                    if (z5) {
                                    }
                                    canvas5.restore();
                                    i10 = 0;
                                    while (true) {
                                        gradientDrawableArr = this.w1;
                                        if (i10 >= gradientDrawableArr.length) {
                                        }
                                        i10++;
                                        b3 = b5;
                                    }
                                    b4 = b3;
                                    canvas6 = canvas5;
                                    f14 = f39;
                                    f41 = 1.0f;
                                    f42 = f5;
                                    i11 = h0;
                                    f43 = f23;
                                    f12 = f34;
                                }
                            } else {
                                i3 = i372;
                                i4 = i362;
                                f33 = f29;
                                f34 = f24;
                                i5 = q;
                                i6 = i352;
                            }
                            i7 = i5;
                            i8 = i382;
                            f35 = 1.0f;
                            b2 = this.t4;
                            if (b2 == 3) {
                            }
                            f36 = f26;
                            if (z5) {
                            }
                            f37 = f33;
                            canvas4.save();
                            if (f37 > 0.0f) {
                            }
                            int i39222222 = i4;
                            float f100222222 = (-i39222222) / 2;
                            int i40222222 = i3;
                            float f101222222 = (-i40222222) / 2;
                            canvas4.translate(f100222222, f101222222);
                            if (!z2) {
                            }
                            canvas4.scale(min42, min42);
                            if (z2) {
                            }
                            if (z6) {
                            }
                            if (this.x4.getVisibility() == 0) {
                            }
                            canvas5.restore();
                            if (z5) {
                            }
                            canvas5.restore();
                            i10 = 0;
                            while (true) {
                                gradientDrawableArr = this.w1;
                                if (i10 >= gradientDrawableArr.length) {
                                }
                                i10++;
                                b3 = b5;
                            }
                            b4 = b3;
                            canvas6 = canvas5;
                            f14 = f39;
                            f41 = 1.0f;
                            f42 = f5;
                            i11 = h0;
                            f43 = f23;
                            f12 = f34;
                        } else {
                            int width = bitmap.getWidth();
                            int i45 = (-width) / 2;
                            int i46 = (-this.N4.getHeight()) / 2;
                            if (f14 < 1.0f) {
                                float f125 = f;
                                f32 = f20;
                                canvas4 = canvas3;
                                f28 = f125;
                                f25 = f21;
                                f30 = 1.0f;
                                arrayList3 = arrayList2;
                                i20 = i45;
                                f26 = f19;
                                f27 = f18;
                                f24 = f12;
                                f29 = f10;
                                f31 = f22;
                                canvas4.saveLayerAlpha(i45, i46, i45 + width, r7 + i46, (int) (f14 * 255.0f), 31);
                            } else {
                                f24 = f12;
                                f25 = f21;
                                f26 = f19;
                                f27 = f18;
                                f30 = 1.0f;
                                f28 = f;
                                f29 = f10;
                                f31 = f22;
                                f32 = f20;
                                arrayList3 = arrayList2;
                                canvas4 = canvas3;
                                i20 = i45;
                            }
                            canvas4.drawBitmap(this.N4, i20, i46, this.M4);
                            if (f14 < 1.0f) {
                                canvas4.restore();
                            }
                        }
                    }
                    z4 = z3;
                    if (!z2) {
                    }
                    q = this.B4.q();
                    o = this.B4.o();
                    float f9622 = q;
                    float f9722 = f32 / f9622;
                    float f9822 = o;
                    float f9922 = f25 / f9822;
                    float min422 = Math.min(f9722, f9922);
                    int i3622 = (int) (f9622 * min422);
                    z5 = z4;
                    int i3722 = (int) (f9822 * min422);
                    int i3822 = o;
                    if (arrayList3.isEmpty()) {
                    }
                    i7 = i5;
                    i8 = i3822;
                    f35 = 1.0f;
                    b2 = this.t4;
                    if (b2 == 3) {
                    }
                    f36 = f26;
                    if (z5) {
                    }
                    f37 = f33;
                    canvas4.save();
                    if (f37 > 0.0f) {
                    }
                    int i392222222 = i4;
                    float f1002222222 = (-i392222222) / 2;
                    int i402222222 = i3;
                    float f1012222222 = (-i402222222) / 2;
                    canvas4.translate(f1002222222, f1012222222);
                    if (!z2) {
                    }
                    canvas4.scale(min422, min422);
                    if (z2) {
                    }
                    if (z6) {
                    }
                    if (this.x4.getVisibility() == 0) {
                    }
                    canvas5.restore();
                    if (z5) {
                    }
                    canvas5.restore();
                    i10 = 0;
                    while (true) {
                        gradientDrawableArr = this.w1;
                        if (i10 >= gradientDrawableArr.length) {
                        }
                        i10++;
                        b3 = b5;
                    }
                    b4 = b3;
                    canvas6 = canvas5;
                    f14 = f39;
                    f41 = 1.0f;
                    f42 = f5;
                    i11 = h0;
                    f43 = f23;
                    f12 = f34;
                } else {
                    canvas6 = canvas3;
                    f28 = f;
                    f36 = f11;
                    arrayList3 = arrayList;
                    f41 = 1.0f;
                    b4 = 2;
                    f43 = f13;
                    i11 = h0;
                    f42 = f5;
                }
                S(f43, f42, f12, f14, canvas6);
                float f1022 = f42;
                float f1032 = f12;
                float f1042 = f14;
                Canvas canvas82 = canvas6;
                imageReceiver = this.r1;
                if (imageReceiver == this.A4) {
                    if (imageReceiver.B()) {
                        canvas82.save();
                        canvas82.translate(i11 / 2, i2 / 2);
                        float f126 = i11;
                        canvas82.translate(((-(((this.Z5 + f41) * f126) + gm.L(30.0f))) / f28) + f36, 0.0f);
                        int q4 = this.r1.q();
                        int o4 = this.r1.o();
                        if (!this.G4 && (ao6Var = this.H1) != null) {
                            n43 n43Var3 = this.F1;
                            if (n43Var3.a) {
                                i22 = i11;
                                i23 = i2;
                                d(canvas82, i22, i23, q4, o4, f1022, n43Var3, ao6Var);
                                float f127 = q4;
                                float f128 = o4;
                                float min5 = Math.min(f126 / f127, i23 / f128);
                                int i47 = (int) (f127 * min5);
                                int i48 = (int) (f128 * min5);
                                if (!arrayList3.isEmpty()) {
                                    if (this.t4 == 1 || this.d2 == 1) {
                                        z9 = this.F1.h;
                                    } else {
                                        ao6 ao6Var6 = this.H1;
                                        if (ao6Var6 != null && ao6Var6.l) {
                                            z9 = true;
                                        }
                                    }
                                    if (z9) {
                                        canvas82.scale(-1.0f, f41);
                                    }
                                    this.r1.setAlpha(f41);
                                    int i49 = (-i47) / 2;
                                    int i50 = (-i48) / 2;
                                    f59 = f1042;
                                    this.r1.i0(i49, i50, i47, i48);
                                    this.r1.g(canvas82);
                                    kw7Var = this.y4;
                                    if (kw7Var == null && kw7Var.getVisibility() == 0) {
                                        canvas82.clipRect(i49, i50, i47 / 2, i48 / 2);
                                        if (this.y4.getMeasuredWidth() != q4 || this.y4.getMeasuredHeight() != o4) {
                                            this.y4.measure(View.MeasureSpec.makeMeasureSpec(q4, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(o4, TLObject.FLAG_30));
                                            this.y4.layout(0, 0, q4, o4);
                                        }
                                        canvas82.scale(min5, min5);
                                        canvas82.translate((-q4) / 2, (-o4) / 2);
                                        f58 = 1.0f;
                                        this.y4.setAlpha(1.0f);
                                        this.y4.draw(canvas82);
                                    } else {
                                        f58 = 1.0f;
                                    }
                                    canvas82.restore();
                                }
                                z9 = false;
                                if (z9) {
                                }
                                this.r1.setAlpha(f41);
                                int i492 = (-i47) / 2;
                                int i502 = (-i48) / 2;
                                f59 = f1042;
                                this.r1.i0(i492, i502, i47, i48);
                                this.r1.g(canvas82);
                                kw7Var = this.y4;
                                if (kw7Var == null) {
                                }
                                f58 = 1.0f;
                                canvas82.restore();
                            }
                        }
                        i22 = i11;
                        i23 = i2;
                        float f1272 = q4;
                        float f1282 = o4;
                        float min52 = Math.min(f126 / f1272, i23 / f1282);
                        int i472 = (int) (f1272 * min52);
                        int i482 = (int) (f1282 * min52);
                        if (!arrayList3.isEmpty()) {
                        }
                        z9 = false;
                        if (z9) {
                        }
                        this.r1.setAlpha(f41);
                        int i4922 = (-i472) / 2;
                        int i5022 = (-i482) / 2;
                        f59 = f1042;
                        this.r1.i0(i4922, i5022, i472, i482);
                        this.r1.g(canvas82);
                        kw7Var = this.y4;
                        if (kw7Var == null) {
                        }
                        f58 = 1.0f;
                        canvas82.restore();
                    } else {
                        i22 = i11;
                        f58 = f41;
                        f59 = f1042;
                    }
                    this.m1.setMoveProgress(f58 - f59);
                    lx9 lx9Var2 = this.B1;
                    if (lx9Var2 == null || !lx9Var2.a()) {
                        canvas82.save();
                        canvas82.translate(f36, f1032 / f1022);
                        canvas82.translate((-(((this.Z5 + 1.0f) * i22) + gm.L(30.0f))) / f28, (-f1032) / f1022);
                        w98 w98Var3 = w98VarArr[b4];
                        w98Var3.o = 1.0f;
                        w98Var3.e(0, 1.0f, false);
                        w98VarArr[b4].c(canvas82);
                        if (this.K) {
                            imageViewArr[b4].setAlpha(1.0f);
                        }
                        canvas82.restore();
                    }
                } else if (this.K) {
                    imageViewArr[b4].setAlpha(0.0f);
                }
                i21 = this.v3;
                if (i21 != 0) {
                    int i51 = i21 - 1;
                    this.v3 = i51;
                    if (i51 == 0) {
                        bd8 bd8Var = this.w3;
                        if (bd8Var != null && !this.E2) {
                            try {
                                ad8 ad8Var = this.U8;
                                this.C3 = ad8Var != null ? ad8Var.c() : bd8Var.getBitmap();
                                drawable = null;
                            } catch (Throwable th) {
                                Bitmap bitmap2 = this.C3;
                                if (bitmap2 != null) {
                                    bitmap2.recycle();
                                    drawable = null;
                                    this.C3 = null;
                                } else {
                                    drawable = null;
                                }
                                fc4.f(th);
                            }
                            Bitmap bitmap3 = this.C3;
                            ImageView imageView = this.x3;
                            if (bitmap3 != null) {
                                imageView.setVisibility(0);
                                this.x3.setImageBitmap(this.C3);
                            } else {
                                imageView.setImageDrawable(drawable);
                            }
                        }
                        if (this.U8 != null) {
                            B();
                        }
                    } else {
                        this.f0.invalidate();
                    }
                }
                if (this.u2) {
                    canvas82.restore();
                }
                if (this.z2 != null) {
                    int measuredHeight = ((int) ((f1022 - 1.0f) * r0.getMeasuredHeight())) / 2;
                    ucc uccVar = this.A1;
                    if (uccVar.j) {
                        int i52 = (int) (f1032 / f1022);
                        uccVar.setBounds(this.z2.getLeft(), (this.z2.getTop() - measuredHeight) + i52, this.z2.getRight(), this.z2.getBottom() + measuredHeight + i52);
                        this.A1.draw(canvas82);
                    }
                    if (this.B1.a()) {
                        this.B1.setBounds(this.z2.getLeft(), (int) ((this.G.getAlpha() * gm.L(90.0f)) + gm.m), this.z2.getRight(), this.z2.getBottom() + measuredHeight + ((int) (f1032 / f1022)));
                        this.B1.draw(canvas82);
                    }
                }
                if (a()) {
                    this.P8.endRecording();
                    canvas.drawRenderNode(this.P8);
                    canvas82 = canvas;
                }
                R(canvas82);
            }
        }
        f13 = f11;
        f14 = 1.0f;
        f15 = 0.0f;
        if (this.I3) {
        }
        if (this.I4) {
        }
        z2 = z;
        z3 = false;
        f16 = 1.0f;
        if (!z2) {
        }
        this.K4 = false;
        matrix = this.L4;
        matrix.reset();
        ra8Var = this.O1;
        if (ra8Var != null) {
            if (this.O1.getRenderView().getAlpha() <= 0.99f) {
            }
        }
        if (this.B4.B()) {
        }
        n1bVar = this.o5;
        if (n1bVar == null) {
        }
        f17 = 20.0f;
        f18 = f8;
        f19 = f11;
        arrayList2 = arrayList;
        canvas3.save();
        f20 = h0;
        float f9322 = f20 / f;
        int i3522 = i2;
        f21 = i3522;
        float f9422 = f21 / f;
        canvas3.translate(f9322 + Z(this.t4), f9422 + a0(this.t4));
        matrix.preTranslate(f9322 + Z(this.t4), f9422 + a0(this.t4));
        float f9522 = f12 + 0.0f;
        canvas3.translate(f13, f9522);
        matrix.preTranslate(f13, f9522);
        f22 = f5 - f15;
        canvas3.scale(f22, f22);
        matrix.preScale(f22, f22);
        canvas3.rotate(f18);
        matrix.preRotate(f18);
        if (this.t4 == 3) {
        }
        f23 = f13;
        if (this.B3) {
        }
        f24 = f12;
        f25 = f21;
        f26 = f19;
        f27 = f18;
        arrayList3 = arrayList2;
        f28 = f;
        f29 = f10;
        f30 = 1.0f;
        f31 = f22;
        f32 = f20;
        canvas4 = canvas3;
        z4 = z3;
        if (!z2) {
        }
        q = this.B4.q();
        o = this.B4.o();
        float f96222 = q;
        float f97222 = f32 / f96222;
        float f98222 = o;
        float f99222 = f25 / f98222;
        float min4222 = Math.min(f97222, f99222);
        int i36222 = (int) (f96222 * min4222);
        z5 = z4;
        int i37222 = (int) (f98222 * min4222);
        int i38222 = o;
        if (arrayList3.isEmpty()) {
        }
        i7 = i5;
        i8 = i38222;
        f35 = 1.0f;
        b2 = this.t4;
        if (b2 == 3) {
        }
        f36 = f26;
        if (z5) {
        }
        f37 = f33;
        canvas4.save();
        if (f37 > 0.0f) {
        }
        int i3922222222 = i4;
        float f10022222222 = (-i3922222222) / 2;
        int i4022222222 = i3;
        float f10122222222 = (-i4022222222) / 2;
        canvas4.translate(f10022222222, f10122222222);
        if (!z2) {
        }
        canvas4.scale(min4222, min4222);
        if (z2) {
        }
        if (z6) {
        }
        if (this.x4.getVisibility() == 0) {
        }
        canvas5.restore();
        if (z5) {
        }
        canvas5.restore();
        i10 = 0;
        while (true) {
            gradientDrawableArr = this.w1;
            if (i10 >= gradientDrawableArr.length) {
            }
            i10++;
            b3 = b5;
        }
        b4 = b3;
        canvas6 = canvas5;
        f14 = f39;
        f41 = 1.0f;
        f42 = f5;
        i11 = h0;
        f43 = f23;
        f12 = f34;
        S(f43, f42, f12, f14, canvas6);
        float f10222 = f42;
        float f10322 = f12;
        float f10422 = f14;
        Canvas canvas822 = canvas6;
        imageReceiver = this.r1;
        if (imageReceiver == this.A4) {
        }
        i21 = this.v3;
        if (i21 != 0) {
        }
        if (this.u2) {
        }
        if (this.z2 != null) {
        }
        if (a()) {
        }
        R(canvas822);
    }

    public final boolean Z1(int i) {
        mb8 mb8Var = this.i7;
        if (mb8Var == null) {
            return false;
        }
        if (!mb8Var.a(i) && !this.i7.e(i)) {
            return false;
        }
        boolean z = gda.a;
        if (!e86.e(1024)) {
            return false;
        }
        File b = this.i7.b(i);
        if (b == null || !b.exists()) {
            return gda.x0 && (this.i7.d(i) instanceof TLRPC.Document);
        }
        return true;
    }

    public final int a0(int i) {
        int L;
        if (i >= 0) {
            if (i == 1 || (i == 0 && this.d2 == 1)) {
                L = gm.L(16.0f);
                if (!this.s) {
                    r0 = gm.m;
                }
            } else {
                if (i == 3 && this.M1 != null) {
                    return this.M1.getAdditionalTop() + gm.L(8.0f) + (this.s ? 0 : gm.m);
                }
                if (i != 0 && i != 4 && i != 5) {
                    L = gm.L(14.0f);
                    if (!this.s) {
                        r0 = gm.m;
                    }
                }
            }
            return L + r0;
        }
        return 0;
    }

    public final void a1() {
        Activity activity = this.E;
        if (activity instanceof LaunchActivity) {
            ((LaunchActivity) activity).a1.remove(this.t1);
        }
        org.telegram.ui.ActionBar.d dVar = this.l4;
        if (dVar == null || dVar.getFragmentView() == null) {
            return;
        }
        this.l6 = 1.0f;
        View fragmentView = this.l4.getFragmentView();
        fragmentView.setScaleX(1.0f);
        fragmentView.setScaleY(1.0f);
        i22 i22Var = this.b2;
        if (i22Var != null) {
            dy0 dy0Var = i22Var.c;
            dy0Var.setScaleX(1.0f);
            dy0Var.setScaleY(1.0f);
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
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, so.g, 0.0f, 1.0f));
        this.o6.setInterpolator(this.s6);
        this.o6.setDuration(250L);
        this.o6.addListener(new ha8(this, (byte) 7));
        this.o6.start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        if ((r4 & 4) == 0) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0030 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0031 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b0(boolean z) {
        ib8 ib8Var = this.W4;
        ArrayList arrayList = ib8Var.e;
        if (arrayList == null) {
            return 0;
        }
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            pcc pccVar = (pcc) ib8Var.e.get(i2);
            if (pccVar.a == 0) {
                byte b = pccVar.b;
                if ((b & 1) == 0) {
                }
                i++;
                if (!z) {
                    return i;
                }
            }
            if (pccVar.k.isEmpty()) {
                continue;
            }
            i++;
            if (!z) {
            }
        }
        return i;
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
                nk3 nk3Var = new nk3(null);
                nk3Var.p2 = url;
                ((LaunchActivity) this.E).u0(nk3Var, false, true);
                A(false, false);
                return;
            }
            return;
        }
        if (this.k4 == null || !((clickableSpan instanceof i6c) || gm.D3(url))) {
            clickableSpan.onClick(textView);
        } else {
            ik.n0(this.k4, url, true, true);
        }
    }

    public final void b2(AlertDialog$Builder alertDialog$Builder) {
        if (this.E != null) {
            try {
                he heVar = this.Q1;
                if (heVar != null) {
                    heVar.dismiss();
                    this.Q1 = null;
                }
            } catch (Exception e) {
                fc4.g(e, true);
            }
            try {
                he o = alertDialog$Builder.o();
                this.Q1 = o;
                o.setCanceledOnTouchOutside(true);
                this.Q1.setOnDismissListener(new n1(this, (byte) 29));
            } catch (Exception e2) {
                fc4.g(e2, true);
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
            CharSequence text = d0().getText();
            CharSequence[] charSequenceArr = {text};
            if (this.u7 && !TextUtils.equals(this.v7, text) && this.d.T(this.O4) != 0 && this.d.H() > 0) {
                this.u7 = false;
            }
            hs6 d0 = hs6.d0(this.U);
            yv1 yv1Var = this.k4;
            ArrayList Y = d0.Y(charSequenceArr, yv1Var != null && ((encryptedChat = yv1Var.h) == null || gm.W0(encryptedChat.layer) >= 101), true);
            CharSequence charSequence = charSequenceArr[0];
            this.v7 = charSequence;
            if (obj instanceof jo6) {
                jo6 jo6Var = (jo6) obj;
                jo6Var.a = charSequence;
                jo6Var.n = Y;
            } else if (obj instanceof no6) {
                no6 no6Var = (no6) obj;
                no6Var.I = charSequence;
                no6Var.n = Y;
            }
            if (text.length() != 0 && !this.d.w(this.O4)) {
                V1();
            }
            pb8 pb8Var = this.d;
            if (pb8Var != null) {
                pb8Var.f(text);
            }
        }
    }

    public final ClippingImageView[] c0(qb8 qb8Var) {
        int i = (gm.O1() || qb8Var == null || qb8Var.m == null) ? 0 : 1;
        ClippingImageView[] clippingImageViewArr = new ClippingImageView[i + 1];
        clippingImageViewArr[0] = this.i0;
        if (i != 0) {
            bfa bfaVar = qb8Var.m;
            clippingImageViewArr[1] = bfaVar;
            bfaVar.setAdditionalTranslationY(qb8Var.n);
        }
        return clippingImageViewArr;
    }

    public final void c1(qb8 qb8Var) {
        if (this.v2) {
            w1(true);
        }
        k47 k47Var = this.S4;
        if (k47Var != null && !k47Var.P) {
            bc4.G(this.U).f(this.S4.F0());
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
        ta8 ta8Var = this.U1;
        if (ta8Var != null) {
            ta8Var.scrollTo(0, 0);
        }
        this.d2 = 0;
        this.e2 = false;
        this.f2 = false;
        this.g2 = false;
        this.i2 = false;
        jn5 jn5Var = this.i5;
        if (jn5Var != null) {
            jn5Var.a();
            this.i5 = null;
        }
        this.b2 = null;
        a26 a26Var = this.c2;
        if (a26Var != null) {
            a26Var.a();
            this.c2 = null;
        }
        kn knVar = this.k2;
        if (knVar != null) {
            knVar.w(this.f0);
            this.k2 = null;
        }
        for (int i = 0; i < 3; i++) {
            w98 w98Var = this.X0[i];
            if (w98Var != null) {
                w98Var.d(-1, false, true);
            }
        }
        x1(0);
        x98 x98Var = this.X7;
        if (x98Var != null) {
            x98Var.a();
        }
        this.o1.d(0, false);
        this.B4.g0(null);
        this.E4.a();
        this.A4.g0(null);
        this.D4.a();
        this.C4.g0(null);
        this.F4.a();
        this.f0.post(new q88(this, qb8Var, b));
        pb8 pb8Var = this.d;
        if (pb8Var != null) {
            pb8Var.G();
        }
        td5 td5Var = this.m1;
        td5Var.d.clear();
        td5Var.e.clear();
        td5Var.c.clear();
        pb8 pb8Var2 = this.d;
        if (pb8Var2 != null) {
            pb8Var2.D();
        }
        this.d = null;
        this.q1.f();
        this.i7 = null;
        this.r4 = false;
        this.t8 = 0.0f;
        this.u8 = 1.0f;
        if (qb8Var != null) {
            qb8Var.a.v0(true, true);
        }
        yv1 yv1Var = this.k4;
        if (yv1Var != null) {
            yv1Var.getFragmentView().invalidate();
        }
        Bitmap bitmap = this.N4;
        if (bitmap != null) {
            bitmap.recycle();
            this.N4 = null;
        }
    }

    public final boolean c2(FrameLayout frameLayout) {
        org.telegram.ui.ActionBar.d dVar = this.l4;
        if (!(dVar instanceof yv1) || !sd2.V(((yv1) dVar).e)) {
            return false;
        }
        u31 f = new c41(frameLayout, this.w2).f(oc7.r1(this.U).l4.h1.f(), new b98(this, (byte) 3));
        f.w = new b98(this, (byte) 4);
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
    public final void d(Canvas canvas, int i, int i2, int i3, int i4, float f, n43 n43Var, ao6 ao6Var) {
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
        int i11 = n43Var.i;
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
            float f22 = n43Var.j;
            float f23 = n43Var.k;
            float f24 = i10;
            f4 = 1.0f - f3;
            int A = (int) mlb.A(1.0f - f22, f4, f22, f24);
            f5 = i8;
            int i13 = (int) ((((1.0f - f23) * f4) + f23) * f5);
            f6 = A;
            f7 = f16 / f6;
            f8 = i13;
            if (f7 * f8 > f19) {
                f7 = f19 / f8;
            }
            if (i12 != 1 && ((b != 1 || this.n6 == 0) && ao6Var != null)) {
                float f25 = f6 * f7;
                float f26 = f8 * f7;
                if (f18 * f20 <= f19) {
                    f21 = f18;
                }
                float A2 = td4.A((f2 * f21) / f, f25, f4, f25);
                float A3 = td4.A((f21 * f20) / f, f26, f4, f26);
                canvas.clipRect((-A2) / 2.0f, (-A3) / 2.0f, A2 / 2.0f, A3 / 2.0f);
            }
            i6 = this.d2;
            if (i6 != 1 || n43Var.a) {
                b2 = this.t4;
                if (b2 != 1 || i6 == 1) {
                    float A4 = n43Var.f / td4.A(n43Var.l, 1.0f, f4, 1.0f);
                    f10 = f16 / f24;
                    if (f10 * f5 > f19) {
                        f10 = f19 / f5;
                    }
                    float f27 = (f10 / min) * A4;
                    if (i6 == 1) {
                        if (b2 == 3 || (i7 = this.n6) == 3) {
                            f12 = ((n43Var.m - 1.0f) * f4) + 1.0f;
                        } else if (i7 == 0) {
                            f12 = n43Var.m;
                        }
                        f27 /= f12;
                    }
                    f11 = f27;
                } else {
                    if (ao6Var != null) {
                        f14 = ao6Var.c;
                        f15 = 1.0f;
                    } else {
                        f14 = 1.0f;
                        f15 = 1.0f;
                    }
                    f11 = ((f7 / min) / td4.A(f14, f15, f4, f15)) * f14;
                }
                float f28 = f11;
                canvas.translate(n43Var.d * f3, n43Var.e * f3);
                canvas.scale(f28, f28);
                canvas.translate(mlb.C(n43Var.b, f24, min, f3), mlb.C(n43Var.c, f5, min, f3));
                f13 = n43Var.g + i11;
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
            iArr[0] = A;
            iArr[1] = i13;
        }
        b = b3;
        f2 = f17;
        f3 = 1.0f;
        float f222 = n43Var.j;
        float f232 = n43Var.k;
        float f242 = i10;
        f4 = 1.0f - f3;
        int A5 = (int) mlb.A(1.0f - f222, f4, f222, f242);
        f5 = i8;
        int i132 = (int) ((((1.0f - f232) * f4) + f232) * f5);
        f6 = A5;
        f7 = f16 / f6;
        f8 = i132;
        if (f7 * f8 > f19) {
        }
        if (i12 != 1) {
            float f252 = f6 * f7;
            float f262 = f8 * f7;
            if (f18 * f20 <= f19) {
            }
            float A22 = td4.A((f2 * f21) / f, f252, f4, f252);
            float A32 = td4.A((f21 * f20) / f, f262, f4, f262);
            canvas.clipRect((-A22) / 2.0f, (-A32) / 2.0f, A22 / 2.0f, A32 / 2.0f);
        }
        i6 = this.d2;
        if (i6 != 1) {
        }
        b2 = this.t4;
        if (b2 != 1) {
        }
        float A42 = n43Var.f / td4.A(n43Var.l, 1.0f, f4, 1.0f);
        f10 = f16 / f242;
        if (f10 * f5 > f19) {
        }
        float f272 = (f10 / min) * A42;
        if (i6 == 1) {
        }
        f11 = f272;
        float f282 = f11;
        canvas.translate(n43Var.d * f3, n43Var.e * f3);
        canvas.scale(f282, f282);
        canvas.translate(mlb.C(n43Var.b, f242, min, f3), mlb.C(n43Var.c, f5, min, f3));
        f13 = n43Var.g + i11;
        if (f13 > 180.0f) {
        }
        if (this.d2 == 1) {
        }
        canvas.rotate(f13 * f3);
        int[] iArr2 = this.S7;
        iArr2[0] = A5;
        iArr2[1] = i132;
    }

    public final tc1 d0() {
        pb8 pb8Var = this.d;
        return (pb8Var == null || !pb8Var.z()) ? this.V1 : this.W1;
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
    public final void d1(k47 k47Var, TLRPC.FileLocation fileLocation, gn5 gn5Var, gn5 gn5Var2, ArrayList arrayList, ArrayList arrayList2, List list, int i, qb8 qb8Var) {
        float f;
        boolean z;
        int i2;
        lc1 lc1Var;
        lc1 lc1Var2;
        pb8 pb8Var;
        int i3;
        ArrayList arrayList3;
        yv1 yv1Var;
        gn5 gn5Var3;
        ImageView imageView;
        k47 k47Var2;
        TLRPC.BotInlineResult botInlineResult;
        mb8 mb8Var;
        int i4;
        yv1 yv1Var2;
        pb8 pb8Var2;
        e51 e51Var;
        ndc ndcVar;
        k47 k47Var3;
        pb8 pb8Var3;
        yv1 yv1Var3;
        boolean z2;
        TLRPC.MessageAction messageAction;
        int i5;
        ya8 ya8Var;
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
        d0().M.b(this.t4 != 0);
        mx5 mx5Var = this.L1;
        if (mx5Var != null) {
            mx5Var.b(this.t4 != 3);
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
        sm0 sm0Var = this.c0;
        if (sm0Var != null) {
            sm0Var.e();
        }
        this.G.setElevation(0.0f);
        for (int i7 = 0; i7 < 2; i7++) {
            this.Y6[i7].clear();
            this.W6[i7].clear();
        }
        this.V6.clear();
        this.g7 = null;
        this.f0.setPadding(0, 0, 0, 0);
        jn5 jn5Var = this.i5;
        if (jn5Var != null) {
            jn5Var.a();
        }
        this.i5 = qb8Var != null ? qb8Var.e : null;
        this.A5 = qb8Var != null && qb8Var.l;
        this.B5 = (byte) 0;
        this.r0.setText(jb6.M0(2131745081, "ShowAllMedia"));
        R1(this.C0, false, false);
        R1(this.w0, false, true);
        x68 x68Var = this.D1;
        if (x68Var != null) {
            x68Var.setSubtitle(null);
        }
        this.G.setBackgroundColor(this.f2 ? 0 : 2130706432);
        o();
        this.j0.setVisibility(8);
        this.j0.setTag(0);
        nb8 nb8Var = this.O;
        if (nb8Var != null) {
            nb8Var.d(false, false);
        }
        if (this.d2 != 11 && this.o5 != null) {
            this.A7 = false;
            ImageView imageView2 = this.d1;
            if (imageView2 != null) {
                imageView2.setAlpha(1.0f);
            }
            db8 db8Var = this.x5;
            if (db8Var != null) {
                db8Var.m(false, false);
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
        rb8 rb8Var = this.T7;
        if (rb8Var != null) {
            rb8Var.setVisibility(4);
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
        gm.Q3(1.0f, this.f1, false, false);
        gm.Q3(1.0f, this.g1, false, false);
        gm.Q3(1.0f, this.h1, false, false);
        this.N.a(null, true);
        R1(this.E0, false, true);
        this.r = false;
        o96 o96Var = this.g1;
        if (o96Var != null) {
            o96Var.a(true, false);
        }
        x98 x98Var = this.X7;
        if (x98Var != null) {
            x98Var.setAlpha(1.0f);
        }
        kc2 kc2Var = this.e1;
        kc2Var.c = false;
        ((ln) kc2Var.f).f(false, true);
        kc2Var.invalidateSelf();
        this.V0.setVisibility(8);
        this.R1.setTag(null);
        this.R1.setVisibility(4);
        x68 x68Var2 = this.D1;
        if (x68Var2 != null) {
            x68Var2.setVisibility(8);
        }
        n78 n78Var = this.J1;
        if (n78Var != null) {
            n78Var.setVisibility(8);
        }
        for (int i8 = 0; i8 < 3; i8++) {
            w98 w98Var = this.X0[i8];
            if (w98Var != null) {
                w98Var.d(-1, false, true);
            }
        }
        td5 td5Var = this.m1;
        if (td5Var != null) {
            td5Var.d();
            this.m1.setAnimateBackground(!org.telegram.messenger.a.r());
        }
        pb8 pb8Var4 = this.d;
        if (pb8Var4 != null && pb8Var4.x() > 0) {
            this.I5 = this.d.x();
        }
        if (k47Var != null) {
            this.u1 = org.telegram.messenger.a.b.getSharedPreferences("playback_speed", 0).getFloat("speed" + k47Var.A0() + "_" + k47Var.e1(), 1.0f);
        } else {
            this.u1 = 1.0f;
        }
        S1(false, true);
        this.a.a(this.g2, false);
        boolean z3 = k47Var != null && (oc7.r1(this.U).B2(k47Var.A0()) || (((message = k47Var.k) != null && message.noforwards) || k47Var.y2()));
        try {
            if (k47Var != null && arrayList == null) {
                TLRPC.Message message2 = k47Var.k;
                if (message2 != null && (k47.n1(message2) instanceof TLRPC.TL_messageMediaWebPage) && k47.n1(k47Var.k).webpage != null && (str = (webPage = k47.n1(k47Var.k).webpage).site_name) != null) {
                    String lowerCase = str.toLowerCase();
                    if (lowerCase.equals("instagram") || lowerCase.equals("twitter") || "telegram_album".equals(webPage.type)) {
                        TextUtils.isEmpty(webPage.author);
                        if (webPage.cached_page instanceof TL_iv.TL_page) {
                            for (int i10 = 0; i10 < webPage.cached_page.blocks.size() && !(webPage.cached_page.blocks.get(i10) instanceof TL_iv.pageBlockAuthorDate); i10++) {
                            }
                        }
                        ArrayList l2 = k47Var.l2();
                        if (!l2.isEmpty()) {
                            this.w = k47Var.e1();
                            this.M5 = false;
                            this.X6.addAll(l2);
                            this.I5 = this.X6.size();
                            int indexOf = this.X6.indexOf(k47Var);
                            if (indexOf < 0) {
                                indexOf = 0;
                            }
                            K1(indexOf);
                        }
                    }
                }
                if (k47Var.x()) {
                    this.B5 = (byte) 1;
                    this.r0.setText(jb6.M0(2131745083, "ShowAllFiles"));
                } else if (k47Var.q3()) {
                    this.B5 = (byte) 5;
                    this.r0.setText(jb6.M0(2131745082, "ShowAllGIFs"));
                }
                if (this.s4 && ((ya8Var = this.g0) == null || !ya8Var.y)) {
                    this.j0.setTag(null);
                    this.j0.setVisibility(8);
                }
                if (this.w == 0) {
                    this.X6.add(k47Var);
                    this.p0.Q(25, (z3 || !k47Var.Q3() || k47Var.D3()) ? false : true);
                    int i11 = 0;
                    if (k47Var.T != 0) {
                        this.M5 = false;
                    } else if (this.k2 != null) {
                        this.M5 = false;
                        if (k47Var.w() && !z3) {
                            R1(this.C0, true, false);
                        }
                    } else if (!k47Var.r1 && !k47Var.Z3() && !k47Var.q4() && !(k47.n1(k47Var.k) instanceof TLRPC.TL_messageMediaInvoice) && !(k47.n1(k47Var.k) instanceof TLRPC.TL_messageMediaWebPage) && ((messageAction = k47Var.k.action) == null || (messageAction instanceof TLRPC.TL_messageActionEmpty))) {
                        this.M5 = true;
                        this.Y6[0].put(k47Var.e1(), k47Var);
                        yv1 yv1Var4 = this.k4;
                        if (yv1Var4 != null) {
                            i5 = (yv1Var4.j8() || (r2 = this.k4.g4) == 3) ? 5 : 5;
                            i11 = 0;
                            R1(this.C0, !z3, false);
                        }
                        this.p0.R(i5);
                        long A0 = k47Var.A0();
                        boolean B = A0 < 0 ? sd2.B(oc7.r1(k47Var.K1).L0(Long.valueOf(-A0))) : true;
                        r7 r7Var = this.p0;
                        if (B) {
                            r7Var.R(21);
                        } else {
                            r7Var.u(21);
                        }
                        this.p0.R(3);
                        i11 = 0;
                        R1(this.C0, !z3, false);
                    } else if (this.s4 && k47Var.T == 0) {
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
                long j = qb8Var != null ? qb8Var.f : 0L;
                this.y5 = j;
                this.z5 = qb8Var != null && qb8Var.p;
                if (gn5Var != null || j == 0) {
                    gn5Var3 = gn5Var;
                } else {
                    int i12 = this.U;
                    gn5Var3 = j > 0 ? gn5.m(this.U, 0, oc7.r1(i12).W1(Long.valueOf(this.y5))) : gn5.m(this.U, 0, oc7.r1(i12).L0(Long.valueOf(-this.y5)));
                }
                if (gn5Var3 == null) {
                    return;
                }
                this.Z6.add(gn5Var3);
                this.a7.add(gn5Var2 != null ? gn5Var2 : gn5Var3);
                this.g7 = gn5Var3;
                this.b7.add(Long.valueOf(qb8Var != null ? qb8Var.g : 0L));
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
                        k47 k47Var4 = (k47) arrayList.get(i3);
                        if (i3 != i6) {
                            i3 = k47Var4.x3() ? i3 + 1 : 0;
                        } else {
                            i6 = this.X6.size();
                        }
                        this.X6.add(k47Var4);
                    }
                    int i13 = 0;
                    while (true) {
                        int size = this.X6.size();
                        arrayList3 = this.X6;
                        if (i13 >= size) {
                            break;
                        }
                        k47 k47Var5 = (k47) arrayList3.get(i13);
                        this.Y6[k47Var5.A0() == this.D5 ? (char) 0 : (char) 1].put(k47Var5.e1(), k47Var5);
                        i13++;
                    }
                    k47 k47Var6 = (k47) arrayList3.get(i6);
                    this.p0.Q(25, !z3 && k47Var6.Q3());
                    if (k47Var6.r1 || k47Var6.Z3() || k47Var6.q4() || ((yv1Var = this.k4) != null && yv1Var.j8())) {
                        this.I5 = this.X6.size();
                    } else {
                        this.P5 = this.k4 == null;
                        if (this.l4 instanceof ProfileActivity) {
                            this.Q5 = true;
                        }
                        if (qb8Var != null) {
                            this.J5 = qb8Var.q;
                        }
                        this.p0.R(5);
                        long A02 = k47Var6.A0();
                        boolean B2 = A02 < 0 ? sd2.B(oc7.r1(k47Var6.K1).L0(Long.valueOf(-A02))) : true;
                        r7 r7Var2 = this.p0;
                        if (B2) {
                            r7Var2.R(21);
                        } else {
                            r7Var2.u(21);
                        }
                        if (k47Var6.w() && !z3) {
                            R1(this.C0, true, false);
                        }
                        if (k47Var6.x()) {
                            this.B5 = (byte) 1;
                            this.r0.setText(jb6.M0(2131745083, "ShowAllFiles"));
                        } else if (k47Var6.q3()) {
                            this.B5 = (byte) 5;
                            this.r0.setText(jb6.M0(2131745082, "ShowAllGIFs"));
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
                    aa8 aa8Var = this.V1;
                    int i15 = this.d2;
                    aa8Var.C(i15 != -1 && (i15 == 2 || i15 == 5) && this.d.h());
                    ba8 ba8Var = this.W1;
                    int i16 = this.d2;
                    ba8Var.C(i16 != -1 && (i16 == 2 || i16 == 5) && this.d.h());
                    this.p0.setVisibility(8);
                    this.p0.Q(25, false);
                    this.f7.addAll(list);
                    Object obj = this.f7.get(i6);
                    int i17 = this.d2;
                    if (i17 == -1 || !(obj instanceof jo6)) {
                        boolean z4 = obj instanceof TLRPC.BotInlineResult;
                        ImageView imageView3 = this.a1;
                        if (z4) {
                            imageView3.setVisibility(8);
                            this.c1.setVisibility(8);
                            this.b1.setVisibility(8);
                        } else {
                            imageView3.setVisibility((!(obj instanceof no6) || ((no6) obj).H) ? 8 : 0);
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
                            this.Q0.getLayoutParams().height = gm.L(84.0f);
                        } else {
                            boolean z5 = ((jo6) obj).b;
                            ImageView imageView4 = this.a1;
                            if (z5) {
                                imageView4.setVisibility(8);
                                this.c1.setVisibility(8);
                                this.b1.setVisibility(8);
                                this.j0.setVisibility(0);
                                this.j0.setTag(1);
                                this.j0.setTranslationY(-gm.L(48.0f));
                            } else {
                                imageView4.setVisibility(i17 != 1 ? 0 : 8);
                                this.c1.setVisibility(this.d2 != 1 ? 8 : 0);
                                this.b1.setVisibility(this.d2 != 1 ? 8 : 0);
                            }
                        }
                        z = !this.i2;
                    }
                    this.j2 = z && ((pb8Var = this.d) == null || pb8Var.y());
                    if (this.k4 != null && (lc1Var2 = this.V1.N) != null) {
                        lc1Var2.getAdapter().V(this.k4.r8);
                        this.V1.N.getAdapter().f0 = this.k4.e != null;
                        this.V1.N.getAdapter().g0 = false;
                    }
                    if (this.k4 == null || (lc1Var = this.W1.N) == null) {
                        i2 = 0;
                    } else {
                        lc1Var.getAdapter().V(this.k4.r8);
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
                    if (this.D5 != 0 || this.I5 != 0 || (k47Var3 = this.S4) == null || k47Var3.r1) {
                        if (this.y5 != 0 && this.d.s()) {
                            this.r2 = oc7.r1(this.U).T0(this.y5);
                            nm7.f(this.U).k(nm7.g3, this.r2);
                        }
                    } else if (this.G5 && (yv1Var3 = this.k4) != null) {
                        ArrayList R6 = yv1Var3.R6();
                        if (R6 != null) {
                            this.X6.clear();
                            for (int i19 = 0; i19 < R6.size(); i19++) {
                                k47 k47Var7 = (k47) R6.get(i19);
                                if (hs6.h0(k47Var7.k) == this.B5 && !k47Var7.x3()) {
                                    this.X6.add(k47Var7);
                                    this.Y6[0].put(k47Var7.e1(), k47Var7);
                                }
                            }
                            Collections.sort(this.X6, new qx7((byte) 3));
                            this.O4 = -1;
                            for (int i20 = 0; i20 < this.X6.size(); i20++) {
                                if (this.X6.get(i20) == this.S4 || ((k47) this.X6.get(i20)).e1() == this.S4.e1()) {
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
                            nb8 nb8Var2 = this.O;
                            if (nb8Var2 != null) {
                                nb8Var2.d(true, z2);
                                this.O.b(this.O4 + 1, this.X6.size(), z2);
                            }
                        } else {
                            z2 = false;
                        }
                        this.L5 = z2;
                    } else if (hs6.h0(k47Var3.k) == this.B5 && ((pb8Var3 = this.d) == null || !pb8Var3.L())) {
                        hs6.d0(this.U).f0(this.B5, this.c, this.D5, this.C5, true);
                        if (this.H5 != 0) {
                            hs6.d0(this.U).f0(this.B5, this.c, this.H5, this.C5, true);
                        }
                    }
                }
                k47Var2 = this.S4;
                if (!(k47Var2 == null && k47Var2.G4()) && (((botInlineResult = this.X4) == null || !(botInlineResult.type.equals(MediaStreamTrack.VIDEO_TRACK_KIND) || k47.J4(this.X4.document))) && ((mb8Var = this.i7) == null || !(mb8Var.a(i6) || this.i7.e(i6))))) {
                    i4 = -1;
                    if (this.d2 == -1 || !((jo6) this.f7.get(i6)).b) {
                        if (!this.f7.isEmpty()) {
                            Object obj2 = this.f7.get(i6);
                            yv1 yv1Var5 = this.k4;
                            TLRPC.User h = yv1Var5 != null ? yv1Var5.h() : null;
                            boolean z6 = !this.i2 && (!((yv1Var2 = this.k4) == null || yv1Var2.x() || this.k4.X7() || h == null || h.bot || m9c.D(h) || ((e51Var = this.k4.Y1) != null && e51Var.E3 != null)) || (this.k4 == null && (pb8Var2 = this.d) != null && pb8Var2.i()));
                            pb8 pb8Var5 = this.d;
                            if (pb8Var5 != null && pb8Var5.W() != null) {
                                z6 = false;
                            }
                            if (obj2 instanceof TLRPC.BotInlineResult) {
                                z6 = false;
                            } else if (z6 && (obj2 instanceof no6)) {
                                z6 = !((no6) obj2).H;
                            }
                            this.V1.E(z6, true);
                            this.W1.E(z6, true);
                        }
                        s();
                        ndc ndcVar2 = this.G2;
                        this.t7 = ndcVar2 != null ? ndcVar2.T() : i4;
                        fp.b(0);
                        if (hi2.v().D()) {
                            hi2.v().Q(k0());
                        }
                        ndcVar = this.G2;
                        if (ndcVar != null) {
                            fp.z(ndcVar.c0());
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
                ndc ndcVar22 = this.G2;
                this.t7 = ndcVar22 != null ? ndcVar22.T() : i4;
                fp.b(0);
                if (hi2.v().D()) {
                }
                ndcVar = this.G2;
                if (ndcVar != null) {
                }
            }
            fp.b(0);
            if (hi2.v().D()) {
            }
            ndcVar = this.G2;
            if (ndcVar != null) {
            }
        } catch (Exception e) {
            fc4.f(e);
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
                this.r2 = oc7.r1(this.U).T0(this.y5);
                nm7.f(this.U).k(nm7.g3, this.r2);
            }
        }
        k47Var2 = this.S4;
        if (k47Var2 == null) {
        }
        i4 = -1;
        if (this.d2 == -1) {
        }
        if (!this.f7.isEmpty()) {
        }
        s();
        ndc ndcVar222 = this.G2;
        this.t7 = ndcVar222 != null ? ndcVar222.T() : i4;
    }

    public final void d2() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.w2, this.E);
        String M0 = jb6.M0(R.string.AppName, null);
        he heVar = alertDialog$Builder.a;
        heVar.S = M0;
        alertDialog$Builder.j(jb6.M0(2131747564, "OK"), null);
        k47 k47Var = this.S4;
        if (k47Var != null && k47.K4(k47Var.k) && bc4.G(this.S4.K1).S(this.b5[0])) {
            heVar.U = jb6.M0(2131746937, null);
        } else {
            heVar.U = jb6.M0(2131746951, null);
        }
        b2(alertDialog$Builder);
    }

    /* JADX WARN: Code restructure failed: missing block: B:413:0x065c, code lost:
    
        if (k47.B0(((k47) b10.f(1, r22.V6)).k) != r22.H5) goto L370;
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x069d, code lost:
    
        r1 = 1;
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:439:0x069b, code lost:
    
        if (k47.B0(((k47) r22.V6.get(0)).k) != r22.H5) goto L370;
     */
    @Override // jm7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        ArrayList arrayList;
        SparseArray[] sparseArrayArr;
        int i3;
        k47 k47Var;
        int i4;
        int e1;
        int i5;
        char c;
        TLRPC.Chat L0;
        TLRPC.User user;
        gn5 m;
        ArrayList<TLRPC.PhotoSize> arrayList2;
        int i6;
        long j;
        k47 k47Var2;
        TLRPC.Document F0;
        k47 k47Var3;
        TLRPC.BotInlineResult botInlineResult;
        mb8 mb8Var;
        float f = 1.0f;
        int i7 = 3;
        int i8 = 2;
        boolean z = true;
        int i10 = 0;
        r7 = false;
        boolean z2 = false;
        if (i == nm7.Z1) {
            String str = (String) objArr[0];
            for (int i11 = 0; i11 < 3; i11++) {
                String str2 = this.b5[i11];
                if (str2 != null && str2.equals(str)) {
                    if (i11 == 0 || ((i11 == 1 && this.r1 == this.C4) || (i11 == 2 && this.r1 == this.A4))) {
                        z2 = true;
                    }
                    this.X0[i11].f(z2, 1.0f);
                    u(i11, true);
                    return;
                }
            }
            return;
        }
        if (i == nm7.u3) {
            A(false, false);
            return;
        }
        if (i == nm7.Y1) {
            String str3 = (String) objArr[0];
            int i12 = 0;
            while (i12 < 3) {
                String str4 = this.b5[i12];
                if (str4 != null && str4.equals(str3)) {
                    boolean z3 = i12 == 0 || (i12 == 1 && this.r1 == this.C4) || (i12 == 2 && this.r1 == this.A4);
                    this.X0[i12].f(z3, 1.0f);
                    u(i12, z3);
                    if (this.G2 == null && i12 == 0 && (((k47Var3 = this.S4) != null && k47.K4(k47Var3.k)) || (((botInlineResult = this.X4) != null && (botInlineResult.type.equals(MediaStreamTrack.VIDEO_TRACK_KIND) || k47.J4(this.X4.document))) || ((mb8Var = this.i7) != null && (mb8Var.a(this.O4) || this.i7.e(this.O4)))))) {
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
        if (i == nm7.X1) {
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
                                f = this.Q3 ? bc4.G(this.U).t(this.b5[0], f2) : 1.0f;
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
                        if (this.Q3 && this.E != null && !this.f3 && this.G2 != null && (k47Var2 = this.S4) != null && (F0 = k47Var2.F0()) != null && this.S4.L0() >= 20.0d) {
                            boolean z4 = F0.size >= 2147483648L;
                            if ((er3.q(this.U).l() & 4) != 0 && min < 0.9f) {
                                long j2 = F0.size;
                                if (j2 * min >= 5242880.0f || (min >= 0.5f && j2 >= 2097152)) {
                                    if (Math.abs(SystemClock.elapsedRealtime() - this.g3) >= (z4 ? 10000 : 3000)) {
                                        if (this.G2.U() == j) {
                                            Toast.makeText(this.E, jb6.M0(2131743282, null), 1).show();
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
        if (i == nm7.g3) {
            xb7 xb7Var = (xb7) objArr[0];
            if (this.y5 == xb7Var.a) {
                this.r2 = xb7Var;
                ArrayList arrayList3 = new ArrayList(xb7Var.b);
                if (this.y5 > 0) {
                    TLRPC.UserFull X1 = oc7.r1(this.U).X1(this.y5);
                    TLRPC.User W1 = oc7.r1(this.U).W1(Long.valueOf(this.y5));
                    if (X1 != null) {
                        TLRPC.Photo photo = X1.personal_photo;
                        if (photo instanceof TLRPC.TL_photo) {
                            arrayList3.add(0, photo);
                        }
                    }
                    if (W1 != null && W1.self && m9c.s(X1)) {
                        arrayList3.add(X1.fallback_photo);
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
                        TLRPC.PhotoSize w = bc4.w(arrayList2, 640, false, null, false);
                        TLRPC.VideoSize x = photo2.video_sizes.isEmpty() ? null : bc4.x(1000, photo2.video_sizes);
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
                            gn5 i21 = gn5.i(w, photo2);
                            gn5 j3 = x != null ? gn5.j(x, photo2) : i21;
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
                r7 r7Var = this.p0;
                if (isEmpty) {
                    r7Var.u(7);
                } else {
                    r7Var.S(7);
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
                    user = oc7.r1(i22).W1(Long.valueOf(this.y5));
                    L0 = null;
                } else {
                    L0 = oc7.r1(i22).L0(Long.valueOf(-this.y5));
                    user = null;
                }
                if (user != null) {
                    m = gn5.m(this.U, 0, user);
                } else if (L0 == null) {
                    return;
                } else {
                    m = gn5.m(this.U, 0, L0);
                }
                if (m != null) {
                    if (!this.Z6.isEmpty() && this.Z6.get(0) != null && ((gn5) this.Z6.get(0)).s == m.s) {
                        this.Z6.remove(0);
                        this.e7.remove(0);
                        this.b7.remove(0);
                        this.a7.remove(0);
                        this.c7.remove(0);
                    }
                    this.Z6.add(0, m);
                    this.e7.add(0, new TLRPC.TL_photoEmpty());
                    ArrayList arrayList4 = this.b7;
                    gn5 gn5Var = this.Z4;
                    arrayList4.add(0, gn5Var != null ? Long.valueOf(gn5Var.r) : null);
                    this.a7.add(0, this.Z4);
                    this.c7.add(0, null);
                    K1(0);
                    return;
                }
                return;
            }
            return;
        }
        if (i == nm7.W) {
            long longValue = ((Long) objArr[0]).longValue();
            long longValue2 = ((Long) objArr[1]).longValue();
            if (this.C5 == longValue2) {
                if (longValue == this.D5 || longValue == this.H5) {
                    k47 k47Var4 = this.S4;
                    if (k47Var4 == null || hs6.h0(k47Var4.k) == this.B5) {
                        if (longValue == this.D5) {
                            this.I5 = ((Integer) objArr[2]).intValue();
                        } else {
                            this.K5 = ((Integer) objArr[2]).intValue();
                        }
                        if (this.M5 && this.L5) {
                            this.L5 = false;
                            this.N5 = true;
                            hs6.d0(this.U).P0(this.D5, 20, 0, 0, this.B5, longValue2, 1, this.c, 0, this.E5, null);
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
        if (i == nm7.V) {
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
                        k47 k47Var5 = (k47) arrayList5.get(booleanValue ? (arrayList5.size() - 1) - i24 : i24);
                        if (this.Y6[c2 == true ? 1 : 0].indexOfKey(k47Var5.e1()) < 0) {
                            i23++;
                            boolean z5 = this.P5;
                            ArrayList arrayList6 = this.X6;
                            if (!z5) {
                                arrayList6.add(0, k47Var5);
                            } else if (booleanValue) {
                                arrayList6.add(0, k47Var5);
                                int i25 = this.J5 - 1;
                                this.J5 = i25;
                                this.O4++;
                                if (i25 < 0) {
                                    this.J5 = 0;
                                }
                            } else {
                                arrayList6.add(k47Var5);
                            }
                            this.Y6[c2 == true ? 1 : 0].put(k47Var5.e1(), k47Var5);
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
                k47 k47Var6 = (k47) this.X6.get(this.O4);
                int i27 = -1;
                int i28 = 0;
                for (int i29 = 0; i29 < arrayList5.size(); i29++) {
                    k47 k47Var7 = (k47) arrayList5.get(i29);
                    if (!k47Var7.x3() && this.W6[c2 == true ? 1 : 0].indexOfKey(k47Var7.e1()) < 0) {
                        this.W6[c2 == true ? 1 : 0].put(k47Var7.e1(), k47Var7);
                        boolean z6 = this.P5;
                        ArrayList arrayList7 = this.V6;
                        if (z6) {
                            arrayList7.add(k47Var7);
                            if (k47Var7.e1() == k47Var6.e1()) {
                                i27 = i28;
                            }
                            i28++;
                        } else {
                            i28++;
                            arrayList7.add(0, k47Var7);
                            if (k47Var7.e1() == k47Var6.e1()) {
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
                    e1 = arrayList8.isEmpty() ? 0 : ((k47) b10.f(1, this.V6)).e1();
                    if (c2 == 0 && this.O5[c2 == true ? 1 : 0] && this.H5 != 0) {
                        if (!this.V6.isEmpty()) {
                        }
                        i5 = e1;
                        c = 1;
                    }
                    i5 = e1;
                    c = c2;
                } else {
                    e1 = arrayList8.isEmpty() ? 0 : ((k47) this.V6.get(0)).e1();
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
                hs6.d0(this.U).P0(c == 0 ? this.D5 : this.H5, 40, i5, 0, this.B5, this.C5, 1, this.c, 0, this.E5, null);
                return;
            }
            return;
        }
        if (i == nm7.m4) {
            hb8 hb8Var = this.R1;
            if (hb8Var != null) {
                hb8Var.getCurrentView().invalidate();
                hb8Var.getNextView().invalidate();
                return;
            }
            return;
        }
        if (i == nm7.c2) {
            k47 k47Var8 = (k47) objArr[0];
            if (this.F8) {
                this.F8 = false;
                this.V7.setVisibility(4);
                t1(this.U4, this.V4, false, false, this.W4.d, false, 0L);
                return;
            } else if (this.E8) {
                w1(false);
                this.E8 = !MediaController.w().g0(this.D8, true, true, false);
                return;
            } else {
                if (k47Var8 == this.D8) {
                    this.H8 = false;
                    this.V7.setVisibility(4);
                    return;
                }
                return;
            }
        }
        if (i == nm7.b2) {
            if (((k47) objArr[0]) == this.D8) {
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
        if (i == nm7.m0) {
            if (this.D5 == ((Long) objArr[0]).longValue()) {
                ArrayList arrayList9 = (ArrayList) objArr[1];
                int i31 = 0;
                boolean z8 = false;
                while (i31 < arrayList9.size()) {
                    k47 k47Var9 = (k47) arrayList9.get(i31);
                    if (k47Var9 != null) {
                        if (this.X6 != null) {
                            i3 = 0;
                            while (i3 < this.X6.size()) {
                                k47Var = (k47) this.X6.get(i3);
                                if (k47Var != null && k47.B0(k47Var.k) == k47.B0(k47Var9.k) && k47Var.e1() == k47Var9.e1()) {
                                    break;
                                } else {
                                    i3++;
                                }
                            }
                        }
                        i3 = -1;
                        k47Var = null;
                        if (k47Var != null) {
                            this.X6.set(i3, k47Var9);
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
        if (i == nm7.y1) {
            if (this.D5 == ((Long) objArr[0]).longValue()) {
                A(true, false);
                return;
            }
            return;
        }
        if (i != nm7.v || ((Boolean) objArr[2]).booleanValue()) {
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
                    if (sparseArrayArr[i33].size() > 0 && ((k47) sparseArrayArr[i33].valueAt(i10)).k.peer_id.channel_id == longValue5) {
                        int size = arrayList10.size();
                        int i34 = i10;
                        while (i34 < size) {
                            int intValue2 = ((Integer) arrayList10.get(i34)).intValue();
                            boolean z11 = z;
                            k47 k47Var10 = (k47) sparseArrayArr[i33].get(((Integer) arrayList10.get(i34)).intValue());
                            if (k47Var10 != null) {
                                sparseArrayArr[i33].remove(intValue2);
                                arrayList.remove(k47Var10);
                                if (i33 == 0) {
                                    this.I5--;
                                } else {
                                    this.K5--;
                                }
                                if (k47Var10 == this.S4) {
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
        lo6 lo6Var;
        String str;
        View view;
        ?? r13;
        boolean z2;
        byte b;
        int i;
        pb8 pb8Var;
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
        my5 my5Var;
        w44 w44Var;
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
            if (i6 >= arrayList3.size() || !(arrayList3.get(photoViewer.O4) instanceof co6)) {
                return;
            }
            Bitmap[] bitmapArr3 = new Bitmap[1];
            co6 co6Var = (co6) arrayList3.get(photoViewer.O4);
            byte b2 = photoViewer.t4;
            byte b3 = 2;
            if (b2 == 1 || (b2 == 0 && photoViewer.d2 == 1)) {
                bitmapArr = bitmapArr3;
                f = 1000.0f;
                f2 = 2.0f;
                f3 = 1.0f;
                u43 u43Var = photoViewer.D1.b;
                RectF rectF = u43Var.O;
                CropAreaView cropAreaView = u43Var.a;
                if (u43Var.M != null) {
                    cropAreaView.d(rectF);
                    int ceil = (int) Math.ceil(u43.n(rectF, u43Var.P));
                    int ceil2 = (int) Math.ceil(r4 / cropAreaView.getAspectRatio());
                    float cropWidth = ceil / cropAreaView.getCropWidth();
                    if (co6Var.j != null) {
                        Bitmap createBitmap2 = Bitmap.createBitmap(ceil, ceil2, Bitmap.Config.ARGB_8888);
                        Canvas canvas3 = new Canvas(createBitmap2);
                        String g = u43.g(co6Var.j);
                        if (co6Var.k != null) {
                            new File(co6Var.k).delete();
                            co6Var.k = null;
                        }
                        co6Var.k = g;
                        ArrayList arrayList4 = co6Var.p;
                        if (arrayList4 == null || arrayList4.isEmpty()) {
                            co6Var.q = null;
                        } else {
                            co6Var.q = new ArrayList(co6Var.p.size());
                            int size = co6Var.p.size();
                            for (int i7 = 0; i7 < size; i7++) {
                                co6Var.q.add(((pcc) co6Var.p.get(i7)).a());
                            }
                        }
                        u43Var.getContext();
                        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.PNG;
                        Matrix matrix = u43Var.M.k;
                        int currentWidth = u43Var.getCurrentWidth();
                        int currentHeight = u43Var.getCurrentHeight();
                        s43 s43Var = u43Var.M;
                        u43.b(g, canvas3, createBitmap2, matrix, currentWidth, currentHeight, s43Var.e, s43Var.i, (int) s43Var.h, cropWidth, co6Var.q);
                    }
                    ao6 ao6Var = co6Var.A;
                    if (ao6Var == null) {
                        ao6Var = new ao6();
                        co6Var.A = ao6Var;
                    }
                    u43Var.a(ao6Var);
                }
                if (co6Var.A == null && photoViewer.t4 != 1) {
                    return;
                }
                if (photoViewer.s1) {
                    if (!TextUtils.isEmpty(co6Var.i)) {
                        n = fn5.G(co6Var.i, null, T(co6Var), T(co6Var), true);
                    } else if (co6Var.d() && !TextUtils.isEmpty(co6Var.a())) {
                        n = fn5.G(co6Var.a(), null, T(co6Var), T(co6Var), true);
                    } else if (photoViewer.d2 == 1) {
                        int[] iArr2 = new int[1];
                        iArr = iArr2;
                        n = a6a.r(co6Var.a(), photoViewer.A8 / 1000, iArr2, true);
                    } else {
                        n = a6a.r(co6Var.a(), (long) (photoViewer.X7.getLeftProgress() * photoViewer.G2.U() * 1000.0f), null, false);
                        z = false;
                        arrayList = null;
                        list = null;
                        iArr = null;
                        lo6Var = null;
                    }
                    arrayList = null;
                    list = null;
                    iArr = null;
                    lo6Var = null;
                    z = false;
                } else {
                    n = photoViewer.B4.n();
                    ImageReceiver imageReceiver = photoViewer.B4;
                    iArr = new int[]{imageReceiver.V, imageReceiver.W};
                }
                arrayList = null;
                list = null;
                lo6Var = null;
                z = false;
            } else if (b2 == 2) {
                Bitmap bitmap5 = photoViewer.J1.getBitmap();
                n1b n1bVar = photoViewer.o5;
                f = 1000.0f;
                int i8 = photoViewer.B4.V;
                n = n1bVar.e(bitmap5);
                lo6Var = photoViewer.J1.getSavedFilterState();
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
                    boolean a = photoViewer.M1.v0.a();
                    f2 = 2.0f;
                    sa8 sa8Var = photoViewer.M1;
                    f3 = 1.0f;
                    int i11 = sa8Var.F1;
                    my5 my5Var2 = sa8Var.P0;
                    Bitmap c = sa8Var.M0.c(false, false);
                    sa8Var.f1 = BigInteger.ONE;
                    if (c != null) {
                        int i12 = 0;
                        for (int i13 = 0; i13 < my5Var2.getChildCount(); i13++) {
                            if (my5Var2.getChildAt(i13) instanceof w44) {
                                i12++;
                            }
                        }
                        if (i12 > 0) {
                            int childCount = my5Var2.getChildCount();
                            int i14 = 0;
                            Canvas canvas4 = null;
                            while (i14 < childCount) {
                                byte b4 = b3;
                                View childAt = my5Var2.getChildAt(i14);
                                if (childAt instanceof w44) {
                                    w44 w44Var2 = (w44) childAt;
                                    PointF position = w44Var2.getPosition();
                                    if (!(w44Var2 instanceof kd1)) {
                                        if (arrayList5 != null) {
                                            pcc pccVar = new pcc();
                                            canvas = canvas4;
                                            bitmapArr2 = bitmapArr3;
                                            if (w44Var2 instanceof xjb) {
                                                pccVar.a = (byte) 1;
                                                xjb xjbVar = (xjb) w44Var2;
                                                CharSequence text = xjbVar.getText();
                                                if (text instanceof Spanned) {
                                                    Spanned spanned = (Spanned) text;
                                                    charSequence = text;
                                                    z11 = a;
                                                    i4 = childCount;
                                                    gn[] gnVarArr = (gn[]) spanned.getSpans(0, charSequence.length(), gn.class);
                                                    if (gnVarArr != null) {
                                                        int i15 = 0;
                                                        while (i15 < gnVarArr.length) {
                                                            gn gnVar = gnVarArr[i15];
                                                            gn[] gnVarArr2 = gnVarArr;
                                                            TLRPC.Document document = gnVar.document;
                                                            int i16 = i14;
                                                            my5 my5Var3 = my5Var2;
                                                            if (document == null) {
                                                                document = vm.e(i11, gnVar.getDocumentId());
                                                            }
                                                            if (document != null) {
                                                                vm.g(i11).e(document);
                                                            }
                                                            occ occVar = new occ();
                                                            PointF pointF2 = position;
                                                            int i17 = i15;
                                                            occVar.document_id = gnVar.getDocumentId();
                                                            occVar.document = document;
                                                            occVar.offset = spanned.getSpanStart(gnVar);
                                                            occVar.length = spanned.getSpanEnd(gnVar) - occVar.offset;
                                                            bc4.G(i11);
                                                            occVar.a = bc4.J(document, null, true, true).getAbsolutePath();
                                                            boolean K2 = k47.K2(occVar.document, true);
                                                            if (K2 || k47.N4(occVar.document)) {
                                                                occVar.c = (byte) (occVar.c | (K2 ? (byte) 1 : (byte) 4));
                                                            }
                                                            pccVar.k.add(occVar);
                                                            if (document != null) {
                                                                BigInteger valueOf = BigInteger.valueOf(5000L);
                                                                sa8Var.f1 = sa8Var.f1.multiply(valueOf).divide(sa8Var.f1.gcd(valueOf));
                                                            }
                                                            i15 = i17 + 1;
                                                            position = pointF2;
                                                            gnVarArr = gnVarArr2;
                                                            my5Var2 = my5Var3;
                                                            i14 = i16;
                                                        }
                                                    }
                                                    i5 = i14;
                                                    my5Var = my5Var2;
                                                    pointF = position;
                                                    pccVar.k.isEmpty();
                                                } else {
                                                    charSequence = text;
                                                    z11 = a;
                                                    i4 = childCount;
                                                    i5 = i14;
                                                    my5Var = my5Var2;
                                                    pointF = position;
                                                }
                                                pccVar.j = charSequence.toString();
                                                pccVar.b = (byte) xjbVar.getType();
                                                pccVar.l = xjbVar.getSwatch().a;
                                                pccVar.m = xjbVar.getTextSize();
                                                pccVar.n = xjbVar.getTypeface();
                                                pccVar.p = xjbVar.getAlign();
                                            } else {
                                                z11 = a;
                                                i4 = childCount;
                                                i5 = i14;
                                                my5Var = my5Var2;
                                                pointF = position;
                                                if (w44Var2 instanceof z1b) {
                                                    pccVar.a = (byte) 0;
                                                    z1b z1bVar = (z1b) w44Var2;
                                                    xka baseSize = z1bVar.getBaseSize();
                                                    pccVar.f = baseSize.a;
                                                    pccVar.g = baseSize.b;
                                                    pccVar.B = z1bVar.getSticker();
                                                    pccVar.C = z1bVar.getParentObject();
                                                    TLRPC.Document sticker = z1bVar.getSticker();
                                                    bc4.G(z8c.t0);
                                                    pccVar.j = bc4.J(sticker, null, true, true).getAbsolutePath();
                                                    if (k47.K2(sticker, true) || k47.N4(sticker)) {
                                                        boolean K22 = k47.K2(sticker, true);
                                                        pccVar.b = (byte) (pccVar.b | (K22 ? (byte) 1 : (byte) 4));
                                                        long duration = K22 ? z1bVar.getDuration() : 5000L;
                                                        if (duration != 0) {
                                                            BigInteger valueOf2 = BigInteger.valueOf(duration);
                                                            sa8Var.f1 = sa8Var.f1.multiply(valueOf2).divide(sa8Var.f1.gcd(valueOf2));
                                                        }
                                                    }
                                                    if (z1bVar.v0) {
                                                        pccVar.b = (byte) (pccVar.b | 2);
                                                    }
                                                } else if (w44Var2 instanceof g88) {
                                                    g88 g88Var = (g88) w44Var2;
                                                    pccVar.a = b4;
                                                    xka baseSize2 = g88Var.getBaseSize();
                                                    pccVar.f = baseSize2.a;
                                                    pccVar.g = baseSize2.b;
                                                    pccVar.j = g88Var.q(i11);
                                                    if (g88Var.v0) {
                                                        pccVar.b = (byte) (pccVar.b | b4);
                                                    }
                                                    z13 = false;
                                                    arrayList5.add(pccVar);
                                                    float scaleX = childAt.getScaleX();
                                                    float scaleY = childAt.getScaleY();
                                                    float x = childAt.getX();
                                                    float y = childAt.getY();
                                                    pccVar.q = childAt.getWidth();
                                                    pccVar.r = childAt.getHeight();
                                                    z12 = z13;
                                                    pccVar.f = (childAt.getWidth() * scaleX) / my5Var.getMeasuredWidth();
                                                    pccVar.g = (childAt.getHeight() * scaleY) / my5Var.getMeasuredHeight();
                                                    pccVar.c = ((((1.0f - scaleX) * childAt.getWidth()) / 2.0f) + x) / my5Var.getMeasuredWidth();
                                                    pccVar.d = ((((1.0f - scaleY) * childAt.getHeight()) / 2.0f) + y) / my5Var.getMeasuredHeight();
                                                    w44Var = w44Var2;
                                                    pccVar.e = (float) ((-childAt.getRotation()) * 0.017453292519943295d);
                                                    pccVar.y = ((childAt.getWidth() / 2.0f) + x) / my5Var.getMeasuredWidth();
                                                    pccVar.z = ((childAt.getHeight() / 2.0f) + y) / my5Var.getMeasuredHeight();
                                                    pccVar.w = pccVar.q / my5Var.getMeasuredWidth();
                                                    pccVar.x = pccVar.r / my5Var.getMeasuredHeight();
                                                    pccVar.v = scaleX;
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
                                                    my5Var2 = my5Var;
                                                    b3 = 2;
                                                }
                                            }
                                            z13 = true;
                                            arrayList5.add(pccVar);
                                            float scaleX2 = childAt.getScaleX();
                                            float scaleY2 = childAt.getScaleY();
                                            float x2 = childAt.getX();
                                            float y2 = childAt.getY();
                                            pccVar.q = childAt.getWidth();
                                            pccVar.r = childAt.getHeight();
                                            z12 = z13;
                                            pccVar.f = (childAt.getWidth() * scaleX2) / my5Var.getMeasuredWidth();
                                            pccVar.g = (childAt.getHeight() * scaleY2) / my5Var.getMeasuredHeight();
                                            pccVar.c = ((((1.0f - scaleX2) * childAt.getWidth()) / 2.0f) + x2) / my5Var.getMeasuredWidth();
                                            pccVar.d = ((((1.0f - scaleY2) * childAt.getHeight()) / 2.0f) + y2) / my5Var.getMeasuredHeight();
                                            w44Var = w44Var2;
                                            pccVar.e = (float) ((-childAt.getRotation()) * 0.017453292519943295d);
                                            pccVar.y = ((childAt.getWidth() / 2.0f) + x2) / my5Var.getMeasuredWidth();
                                            pccVar.z = ((childAt.getHeight() / 2.0f) + y2) / my5Var.getMeasuredHeight();
                                            pccVar.w = pccVar.q / my5Var.getMeasuredWidth();
                                            pccVar.x = pccVar.r / my5Var.getMeasuredHeight();
                                            pccVar.v = scaleX2;
                                            if (bitmapArr2[0] == null) {
                                            }
                                        } else {
                                            canvas = canvas4;
                                            bitmapArr2 = bitmapArr3;
                                            z11 = a;
                                            i4 = childCount;
                                            i5 = i14;
                                            my5Var = my5Var2;
                                            w44Var = w44Var2;
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
                                                canvas7.translate((-w44Var.getWidth()) / 2.0f, (-w44Var.getHeight()) / 2.0f);
                                                if (!(childAt instanceof xjb) || childAt.getHeight() <= 0 || childAt.getWidth() <= 0) {
                                                    arrayList2 = arrayList5;
                                                    canvas2 = canvas6;
                                                    childAt.draw(canvas7);
                                                } else {
                                                    int width = childAt.getWidth();
                                                    int height = childAt.getHeight();
                                                    Bitmap.Config config = Bitmap.Config.ARGB_8888;
                                                    Bitmap a2 = ld1.a(width, height);
                                                    Canvas canvas8 = new Canvas(a2);
                                                    childAt.draw(canvas8);
                                                    arrayList2 = arrayList5;
                                                    canvas2 = canvas6;
                                                    canvas7.drawBitmap(a2, (Rect) null, new Rect(0, 0, a2.getWidth(), a2.getHeight()), (Paint) null);
                                                    try {
                                                        canvas8.setBitmap(null);
                                                    } catch (Exception e) {
                                                        fc4.g(e, true);
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
                                        my5Var2 = my5Var;
                                        b3 = 2;
                                    } else if (arrayList5 != null) {
                                        ((kd1) w44Var2).y(my5Var2.getMeasuredWidth(), my5Var2.getMeasuredHeight(), arrayList5);
                                    }
                                }
                                canvas = canvas4;
                                bitmapArr2 = bitmapArr3;
                                z11 = a;
                                i4 = childCount;
                                i5 = i14;
                                my5Var = my5Var2;
                                canvas4 = canvas;
                                i14 = i5 + 1;
                                arrayList5 = arrayList5;
                                bitmapArr3 = bitmapArr2;
                                a = z11;
                                childCount = i4;
                                my5Var2 = my5Var;
                                b3 = 2;
                            }
                        }
                    }
                    bitmapArr = bitmapArr3;
                    z = a;
                    List<TLRPC.InputDocument> masks = photoViewer.M1.getMasks();
                    photoViewer.M1.P0.removeAllViews();
                    list = masks;
                    n = c;
                    arrayList = arrayList5;
                    iArr = null;
                    lo6Var = null;
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
                        n1b n1bVar2 = photoViewer.o5;
                        if (n1bVar2 != null) {
                            int i19 = photoViewer.B4.V - n1bVar2.K;
                            if (i19 == 0) {
                                k1b k1bVar = n1bVar2.F;
                                if (k1bVar != null) {
                                    k1bVar.e = n1bVar2.d(0, 0, bitmap6, true);
                                    k1b k1bVar2 = n1bVar2.F;
                                    k1bVar2.g = k1bVar2.c();
                                    n1b.c(n1bVar2.F, n1bVar2.U, n1bVar2.V);
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
                            n1b n1bVar3 = photoViewer.o5;
                            k1b k1bVar3 = n1bVar3.F;
                            if (k1bVar3 != null) {
                                k1bVar3.e = n1bVar3.d(0, 0, createBitmap3, true);
                                k1b k1bVar4 = n1bVar3.F;
                                k1bVar4.g = k1bVar4.c();
                                n1b.c(n1bVar3.F, n1bVar3.U, n1bVar3.V);
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
                    lo6Var = null;
                    z = false;
                }
            }
            if (n != null) {
                if (co6Var.c != null) {
                    new File(co6Var.c).delete();
                    str = null;
                    co6Var.c = null;
                } else {
                    str = null;
                }
                if (co6Var.h != null) {
                    new File(co6Var.h).delete();
                    co6Var.h = str;
                }
                byte b5 = photoViewer.t4;
                ib8 ib8Var = photoViewer.W4;
                if (b5 == 1 || (b5 == 0 && photoViewer.d2 == 1)) {
                    view = null;
                    r13 = 0;
                    r13 = 0;
                    r13 = 0;
                    r13 = 0;
                    ao6 ao6Var2 = co6Var.A;
                    ib8Var.c = ao6Var2;
                    ib8Var.b = co6Var.k;
                    ib8Var.f = co6Var.q;
                    if (ao6Var2 != null) {
                        Bitmap E = E(n, ao6Var2, iArr, true);
                        if (co6Var.j != null) {
                            Bitmap decodeFile = BitmapFactory.decodeFile(co6Var.l);
                            Bitmap E2 = E(decodeFile, co6Var.A, null, false);
                            if (!photoViewer.s1 || co6Var.d()) {
                                if (photoViewer.B0()) {
                                    TLRPC.PhotoSize V = fn5.V(E, photoViewer.e0(), gm.Y0(false), gm.Y0(false), 87);
                                    bc4.G(photoViewer.U);
                                    String file = bc4.K(V, true).toString();
                                    photoViewer.f5 = file;
                                    co6Var.h = file;
                                } else {
                                    String x0 = x0();
                                    co6Var.h = x0;
                                    photoViewer.X0(x0, null, E2, E, gm.Y0(false), true);
                                }
                            }
                            String x02 = x0();
                            co6Var.c = x02;
                            photoViewer = this;
                            photoViewer.X0(x02, null, E2, E, 512.0f, true);
                            if (E2 != null) {
                                E2.recycle();
                            }
                            if (decodeFile != null) {
                                decodeFile.recycle();
                            }
                        } else {
                            if (!photoViewer.s1 || co6Var.d()) {
                                TLRPC.PhotoSize V2 = fn5.V(E, photoViewer.e0(), gm.Y0(false), gm.Y0(false), 87);
                                bc4.G(photoViewer.U);
                                String file2 = bc4.K(V2, true).toString();
                                photoViewer.f5 = file2;
                                co6Var.h = file2;
                            }
                            TLRPC.PhotoSize T = fn5.T(E, 512.0f, 512.0f, 70, 101, 101);
                            bc4.G(photoViewer.U);
                            co6Var.c = bc4.K(T, true).toString();
                        }
                        if (photoViewer.t4 == 0 && photoViewer.s1) {
                            n.recycle();
                            n = E;
                        }
                    }
                } else if (b5 == 2) {
                    if (co6Var.i != null) {
                        new File(co6Var.i).delete();
                    }
                    TLRPC.PhotoSize V3 = fn5.V(n, photoViewer.e0(), gm.Y0(true), gm.Y0(true), 87);
                    bc4.G(photoViewer.U);
                    co6Var.i = bc4.J(V3, null, true, true).toString();
                    ao6 ao6Var3 = co6Var.A;
                    Bitmap E3 = ao6Var3 != null ? E(n, ao6Var3, null, true) : n;
                    String str4 = co6Var.j;
                    if (str4 == null) {
                        if (!photoViewer.s1 || co6Var.d()) {
                            TLRPC.PhotoSize V4 = fn5.V(E3, photoViewer.e0(), gm.Y0(false), gm.Y0(false), 87);
                            bc4.G(photoViewer.U);
                            str3 = null;
                            z10 = true;
                            String file3 = bc4.J(V4, null, true, true).toString();
                            photoViewer.f5 = file3;
                            co6Var.h = file3;
                        } else {
                            str3 = null;
                            z10 = true;
                        }
                        TLRPC.PhotoSize V5 = fn5.V(E3, photoViewer.e0(), 512.0f, 512.0f, 83);
                        bc4.G(photoViewer.U);
                        co6Var.c = bc4.J(V5, str3, z10, z10).toString();
                        view = null;
                        z9 = false;
                        bitmap3 = E3;
                    } else {
                        String str5 = co6Var.l;
                        Bitmap bitmap7 = str4.equals(str5) ? photoViewer.x4.getBitmap() : null;
                        ao6 ao6Var4 = co6Var.A;
                        if (ao6Var4 != null) {
                            if (bitmap7 == null) {
                                Bitmap decodeFile2 = BitmapFactory.decodeFile(co6Var.l);
                                view = null;
                                Bitmap E4 = E(decodeFile2, co6Var.A, null, false);
                                decodeFile2.recycle();
                                bitmap7 = E4;
                            } else {
                                view = null;
                                bitmap7 = E(bitmap7, ao6Var4, null, false);
                            }
                            z7 = true;
                        } else {
                            view = null;
                            z7 = false;
                        }
                        if (!photoViewer.s1 || co6Var.d()) {
                            if (photoViewer.B0()) {
                                TLRPC.PhotoSize V6 = fn5.V(E3, photoViewer.e0(), gm.Y0(false), gm.Y0(false), 87);
                                bc4.G(photoViewer.U);
                                String file4 = bc4.K(V6, true).toString();
                                photoViewer.f5 = file4;
                                co6Var.h = file4;
                            } else {
                                bitmap3 = E3;
                                String x03 = x0();
                                co6Var.h = x03;
                                bitmap4 = bitmap7;
                                str2 = str5;
                                z8 = false;
                                photoViewer.X0(x03, str2, bitmap4, bitmap3, gm.Y0(false), true);
                                String x04 = x0();
                                co6Var.c = x04;
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
                        bitmap3 = E3;
                        String x042 = x0();
                        co6Var.c = x042;
                        photoViewer = this;
                        photoViewer.X0(x042, str2, bitmap4, bitmap3, 512.0f, true);
                        z9 = z8;
                        if (z7) {
                        }
                    }
                    r13 = z9;
                    if (co6Var.A != null) {
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
                        if (co6Var.j != null) {
                            new File(co6Var.j).delete();
                            if (!co6Var.j.equals(co6Var.l)) {
                                new File(co6Var.l).delete();
                            }
                        }
                        Bitmap.CompressFormat compressFormat2 = Bitmap.CompressFormat.PNG;
                        TLRPC.PhotoSize V7 = fn5.V(n, compressFormat2, gm.Y0(false), gm.Y0(false), 87);
                        co6Var.r = list != null ? new ArrayList(list) : null;
                        bc4.G(photoViewer.U);
                        String file5 = bc4.K(V7, true).toString();
                        ib8Var.a = file5;
                        co6Var.j = file5;
                        kw7 kw7Var = photoViewer.x4;
                        ArrayList arrayList6 = (arrayList == null || arrayList.isEmpty()) ? null : arrayList;
                        ib8Var.e = arrayList6;
                        co6Var.p = arrayList6;
                        kw7Var.b(arrayList6, photoViewer.s1, true, photoViewer.d2 != 11);
                        long lcm = photoViewer.M1.getLcm();
                        ib8Var.g = lcm;
                        co6Var.t = lcm;
                        if (co6Var.p == null || (bitmap2 = bitmapArr[0]) == null) {
                            co6Var.l = co6Var.j;
                        } else {
                            TLRPC.PhotoSize V8 = fn5.V(bitmap2, compressFormat2, gm.Y0(false), gm.Y0(false), 87);
                            bc4.G(photoViewer.U);
                            co6Var.l = bc4.K(V8, true).toString();
                        }
                        photoViewer.x4.setBitmap(n);
                        ao6 ao6Var5 = co6Var.A;
                        if (ao6Var5 != null && ao6Var5.C) {
                            String g2 = u43.g(ib8Var.a);
                            if (ib8Var.b != null) {
                                new File(ib8Var.b).delete();
                                ib8Var.b = null;
                            }
                            ib8Var.b = g2;
                            ArrayList arrayList7 = ib8Var.e;
                            if (arrayList7 == null || arrayList7.isEmpty()) {
                                ib8Var.f = null;
                            } else {
                                ib8Var.f = new ArrayList(ib8Var.e.size());
                                int size2 = ib8Var.e.size();
                                for (int i20 = 0; i20 < size2; i20++) {
                                    ib8Var.f.add(((pcc) ib8Var.e.get(i20)).a());
                                }
                            }
                            ao6 ao6Var6 = co6Var.A;
                            Bitmap createBitmap4 = Bitmap.createBitmap(ao6Var6.s, ao6Var6.t, Bitmap.Config.ARGB_8888);
                            Canvas canvas10 = new Canvas(createBitmap4);
                            if (photoViewer.s1) {
                                ncc nccVar = (ncc) photoViewer.C2;
                                q = nccVar.getVideoWidth();
                                o = nccVar.getVideoHeight();
                            } else {
                                q = photoViewer.B4.q();
                                o = photoViewer.B4.o();
                            }
                            int i21 = o;
                            int i22 = q;
                            Bitmap.CompressFormat compressFormat3 = Bitmap.CompressFormat.PNG;
                            ao6 ao6Var7 = co6Var.A;
                            u43.b(g2, canvas10, createBitmap4, ao6Var7.r, i22, i21, ao6Var7.m, ao6Var7.d, ao6Var7.k, ao6Var7.o, ib8Var.f);
                            createBitmap4.recycle();
                            co6Var.k = ib8Var.b;
                            co6Var.q = ib8Var.f;
                        }
                        Bitmap bitmap8 = bitmapArr[0];
                        if (bitmap8 == null) {
                            bitmap8 = n;
                        }
                        ao6 ao6Var8 = co6Var.A;
                        if (ao6Var8 == null || !ao6Var8.C) {
                            z4 = false;
                        } else {
                            bitmap8 = E(bitmap8, ao6Var8, null, false);
                            z4 = true;
                        }
                        Bitmap bitmap9 = bitmap8;
                        if (photoViewer.s1) {
                            String str6 = co6Var.i;
                            if (str6 != null) {
                                z6 = true;
                                G = fn5.G(str6, null, T(co6Var), T(co6Var), true);
                            } else if (!co6Var.d() || TextUtils.isEmpty(co6Var.a())) {
                                G = a6a.r(co6Var.a(), (long) (photoViewer.X7.getLeftProgress() * photoViewer.G2.U() * f), null, false);
                                z6 = true;
                            } else {
                                z6 = true;
                                G = fn5.G(co6Var.a(), null, T(co6Var), T(co6Var), true);
                            }
                            ao6 ao6Var9 = co6Var.A;
                            createBitmap = ao6Var9 != null ? E(G, ao6Var9, null, z6) : G;
                            if (co6Var.A != null) {
                                G.recycle();
                            }
                        } else {
                            ImageReceiver imageReceiver2 = photoViewer.B4;
                            int[] iArr3 = {imageReceiver2.V, imageReceiver2.W};
                            if (co6Var.A != null) {
                                bitmap = E(imageReceiver2.n(), co6Var.A, iArr3, true);
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
                            if (photoViewer.s1 || co6Var.d()) {
                                if (photoViewer.B0()) {
                                    String x05 = x0();
                                    co6Var.h = x05;
                                    photoViewer.X0(x05, null, bitmap, bitmap9, gm.Y0(false), false);
                                } else {
                                    TLRPC.PhotoSize V9 = fn5.V(bitmap, photoViewer.e0(), gm.Y0(false), gm.Y0(false), 87);
                                    bc4.G(photoViewer.U);
                                    String file6 = bc4.K(V9, true).toString();
                                    photoViewer.f5 = file6;
                                    co6Var.h = file6;
                                }
                            }
                            String x06 = x0();
                            co6Var.c = x06;
                            photoViewer = this;
                            photoViewer.X0(x06, null, bitmap, bitmap9, 512.0f, false);
                            if (z4 && bitmap9 != null) {
                                bitmap9.recycle();
                            }
                            if (z5 && bitmap != null) {
                                bitmap.recycle();
                            }
                            if (photoViewer.d2 == 1 && photoViewer.G2 != null && photoViewer.s1 && photoViewer.b0(false) == 1 && photoViewer.X7.getLeftProgress() <= 0.0f && photoViewer.X7.getRightProgress() >= 1.0f) {
                                j = co6Var.t;
                                long U = photoViewer.G2.U();
                                while (j < 3000 && j < U) {
                                    j += co6Var.t;
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
                        co6Var.c = x062;
                        photoViewer = this;
                        photoViewer.X0(x062, null, bitmap, bitmap9, 512.0f, false);
                        if (z4) {
                            bitmap9.recycle();
                        }
                        if (z5) {
                            bitmap.recycle();
                        }
                        if (photoViewer.d2 == 1) {
                            j = co6Var.t;
                            long U2 = photoViewer.G2.U();
                            while (j < 3000) {
                                j += co6Var.t;
                            }
                            photoViewer.X7.setRightProgress(Math.min(1.0f, j / U2));
                        }
                    }
                }
                gda.x();
                if (lo6Var != null) {
                    ib8Var.d = lo6Var;
                    co6Var.o = lo6Var;
                    if (photoViewer.s1 && photoViewer.I4 && photoViewer.U0()) {
                        TextureView textureView = photoViewer.C2;
                        if (textureView instanceof ncc) {
                            z2 = true;
                            ((ncc) textureView).setDelegate(new p88(lo6Var, true ? 1 : 0));
                            b = photoViewer.t4;
                            if (b != z2) {
                                co6Var.w = z2;
                                anb.s(photoViewer.a1, cmb.pg, photoViewer.w2, PorterDuff.Mode.MULTIPLY);
                            } else if (b == 2) {
                                co6Var.u = z2;
                                anb.s(photoViewer.d1, cmb.pg, photoViewer.w2, PorterDuff.Mode.MULTIPLY);
                            } else if (b == 3) {
                                if (z) {
                                    co6Var.v = z2;
                                    anb.s(photoViewer.Z0, cmb.pg, photoViewer.w2, PorterDuff.Mode.MULTIPLY);
                                } else if (photoViewer.d2 == 11) {
                                    co6Var.v = z2;
                                }
                            }
                            i = photoViewer.d2;
                            if ((i != 0 || i == 4) && (pb8Var = photoViewer.d) != null) {
                                pb8Var.Y(photoViewer.O4);
                                if (!photoViewer.d.w(photoViewer.O4)) {
                                    photoViewer.V1();
                                }
                            }
                            boolean z14 = true;
                            if (photoViewer.t4 == 1) {
                                photoViewer.Z5 = Math.max(photoViewer.D1.getRectSizeX() / photoViewer.i0(photoViewer.t4), photoViewer.D1.getRectSizeY() / photoViewer.g0());
                                photoViewer.W5 = ((photoViewer.D1.getRectSizeX() / f2) + photoViewer.D1.getRectX()) - (photoViewer.i0(photoViewer.t4) / 2);
                                photoViewer.X5 = ((photoViewer.D1.getRectSizeY() / f2) + photoViewer.D1.getRectY()) - (photoViewer.g0() / 2);
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
                pb8Var.Y(photoViewer.O4);
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

    public final Bitmap.CompressFormat e0() {
        return this.d2 == 11 ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
    }

    public final void e1() {
        if (this.E == null || !this.l2) {
            return;
        }
        try {
            k47 k47Var = this.S4;
            boolean z = false;
            File file = null;
            file = null;
            file = null;
            if (k47Var != null) {
                boolean K4 = k47.K4(k47Var.k);
                if (!TextUtils.isEmpty(this.S4.k.attachPath)) {
                    File file2 = new File(this.S4.k.attachPath);
                    if (file2.exists()) {
                        file = file2;
                    }
                }
                if (file == null) {
                    bc4.G(this.U);
                    file = bc4.M(this.S4.k, false, true);
                }
                z = K4;
            } else if (this.Z4 != null) {
                bc4.G(this.U);
                gn5 gn5Var = this.Z4;
                File J = bc4.J(gn5Var == null ? null : gn5Var.f, o0(gn5Var), this.y5 != 0 || this.A5, true);
                if (J == null || !J.exists()) {
                    bc4.G(this.U);
                    gn5 gn5Var2 = this.Z4;
                    file = bc4.J(gn5Var2 != null ? gn5Var2.f : null, o0(gn5Var2), false, true);
                } else {
                    file = J;
                }
            } else {
                mb8 mb8Var = this.i7;
                if (mb8Var != null) {
                    file = mb8Var.b(this.O4);
                }
            }
            if (file != null && !file.exists()) {
                file = new File(bc4.z(4), file.getName());
            }
            if (file == null || !file.exists()) {
                d2();
                return;
            }
            Intent intent = new Intent("android.intent.action.SEND");
            if (z) {
                intent.setType("video/mp4");
            } else {
                k47 k47Var2 = this.S4;
                if (k47Var2 != null) {
                    intent.setType(k47Var2.t1());
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
            this.E.startActivityForResult(Intent.createChooser(intent, jb6.M0(2131745193, "ShareFile")), 500);
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    public final void e2(final tc1 tc1Var, boolean z, boolean z2, final float[] fArr) {
        pb8 pb8Var = this.d;
        float L = gm.L((pb8Var == null || !pb8Var.l()) ? 58.0f : 175.0f) * (tc1Var == this.W1 ? -1.0f : 1.0f);
        final byte b = 1;
        final byte b2 = 0;
        if (!z2) {
            tc1Var.animate().setListener(null).cancel();
            tc1Var.setVisibility(z ? 0 : 8);
            if (z) {
                L = 0.0f;
            }
            tc1Var.setTranslationY(L);
            float alpha = this.Q0.getAlpha();
            float f = z ? 1.0f : 0.0f;
            fArr[0] = f;
            tc1Var.setAlpha(alpha * f);
        } else if (z) {
            if (tc1Var.getTag() == null) {
                if (tc1Var.getVisibility() != 0) {
                    tc1Var.setVisibility(0);
                    tc1Var.setAlpha(this.Q0.getAlpha());
                    tc1Var.setTranslationY(L);
                }
                tc1Var.animate().translationY(0.0f).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: i88
                    public final /* synthetic */ PhotoViewer b;

                    {
                        this.b = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        byte b3 = b;
                        float[] fArr2 = fArr;
                        tc1 tc1Var2 = tc1Var;
                        PhotoViewer photoViewer = this.b;
                        switch (b3) {
                            case 0:
                                Drawable[] drawableArr = PhotoViewer.d9;
                                float alpha2 = photoViewer.Q0.getAlpha();
                                float animatedFraction = 1.0f - valueAnimator.getAnimatedFraction();
                                fArr2[0] = animatedFraction;
                                tc1Var2.setAlpha(alpha2 * animatedFraction);
                                if (tc1Var2 == photoViewer.V1) {
                                    FrameLayout frameLayout = photoViewer.W7;
                                    if (frameLayout != null) {
                                        frameLayout.setTranslationY(photoViewer.Q0.getTranslationY() - (photoViewer.V1.getAlpha() * b10.c(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                                    }
                                    photoViewer.f1.setTranslationY(photoViewer.V1.getAlpha() * (-b10.c(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                                    photoViewer.g1.setTranslationY(photoViewer.V1.getAlpha() * (-b10.c(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                                    photoViewer.h1.setTranslationY(photoViewer.V1.getAlpha() * (-b10.c(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                                }
                                photoViewer.H0();
                                break;
                            default:
                                Drawable[] drawableArr2 = PhotoViewer.d9;
                                float alpha3 = photoViewer.Q0.getAlpha();
                                float animatedFraction2 = valueAnimator.getAnimatedFraction();
                                fArr2[0] = animatedFraction2;
                                tc1Var2.setAlpha(alpha3 * animatedFraction2);
                                if (tc1Var2 == photoViewer.V1) {
                                    FrameLayout frameLayout2 = photoViewer.W7;
                                    if (frameLayout2 != null) {
                                        frameLayout2.setTranslationY(photoViewer.Q0.getTranslationY() - (photoViewer.V1.getAlpha() * b10.c(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                                    }
                                    photoViewer.f1.setTranslationY(photoViewer.V1.getAlpha() * (-b10.c(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                                    photoViewer.g1.setTranslationY(photoViewer.V1.getAlpha() * (-b10.c(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                                    photoViewer.h1.setTranslationY(photoViewer.V1.getAlpha() * (-b10.c(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                                }
                                photoViewer.H0();
                                break;
                        }
                    }
                }).setDuration(420L).setInterpolator(d53.h).start();
            }
        } else if (tc1Var.getTag() != null) {
            tc1Var.animate().translationY(L).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: i88
                public final /* synthetic */ PhotoViewer b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    byte b3 = b2;
                    float[] fArr2 = fArr;
                    tc1 tc1Var2 = tc1Var;
                    PhotoViewer photoViewer = this.b;
                    switch (b3) {
                        case 0:
                            Drawable[] drawableArr = PhotoViewer.d9;
                            float alpha2 = photoViewer.Q0.getAlpha();
                            float animatedFraction = 1.0f - valueAnimator.getAnimatedFraction();
                            fArr2[0] = animatedFraction;
                            tc1Var2.setAlpha(alpha2 * animatedFraction);
                            if (tc1Var2 == photoViewer.V1) {
                                FrameLayout frameLayout = photoViewer.W7;
                                if (frameLayout != null) {
                                    frameLayout.setTranslationY(photoViewer.Q0.getTranslationY() - (photoViewer.V1.getAlpha() * b10.c(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                                }
                                photoViewer.f1.setTranslationY(photoViewer.V1.getAlpha() * (-b10.c(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                                photoViewer.g1.setTranslationY(photoViewer.V1.getAlpha() * (-b10.c(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                                photoViewer.h1.setTranslationY(photoViewer.V1.getAlpha() * (-b10.c(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                            }
                            photoViewer.H0();
                            break;
                        default:
                            Drawable[] drawableArr2 = PhotoViewer.d9;
                            float alpha3 = photoViewer.Q0.getAlpha();
                            float animatedFraction2 = valueAnimator.getAnimatedFraction();
                            fArr2[0] = animatedFraction2;
                            tc1Var2.setAlpha(alpha3 * animatedFraction2);
                            if (tc1Var2 == photoViewer.V1) {
                                FrameLayout frameLayout2 = photoViewer.W7;
                                if (frameLayout2 != null) {
                                    frameLayout2.setTranslationY(photoViewer.Q0.getTranslationY() - (photoViewer.V1.getAlpha() * b10.c(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                                }
                                photoViewer.f1.setTranslationY(photoViewer.V1.getAlpha() * (-b10.c(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                                photoViewer.g1.setTranslationY(photoViewer.V1.getAlpha() * (-b10.c(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                                photoViewer.h1.setTranslationY(photoViewer.V1.getAlpha() * (-b10.c(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                            }
                            photoViewer.H0();
                            break;
                    }
                }
            }).setDuration(420L).setInterpolator(d53.h).withEndAction(new qc1(tc1Var, (byte) 1)).start();
        }
        tc1Var.setTag(z ? 1 : null);
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
        ao6 ao6Var;
        Bitmap bitmap3;
        PhotoViewer photoViewer;
        PhotoViewer photoViewer2;
        Bitmap bitmap4;
        Bitmap bitmap5;
        co6 co6Var = (co6) this.f7.get(this.O4);
        ImageReceiver imageReceiver = this.B4;
        int[] iArr = {imageReceiver.V, imageReceiver.W};
        ao6 ao6Var2 = co6Var.A;
        if (ao6Var2 != null) {
            createBitmap = E(bitmap, ao6Var2, iArr, true);
        } else {
            if (iArr[0] == 0) {
                bitmap2 = bitmap;
                z = false;
                b = this.t4;
                if ((b != 0 || b == 4) && this.d2 == 11 && !this.s1) {
                    ao6Var = co6Var.A;
                    String str = co6Var.j;
                    if (ao6Var != null) {
                        bitmap3 = bitmap2;
                        if (str != null) {
                            Bitmap decodeFile = BitmapFactory.decodeFile(co6Var.l);
                            if (B0()) {
                                TLRPC.PhotoSize V = fn5.V(bitmap3, e0(), gm.Y0(false), gm.Y0(false), 87);
                                bc4.G(this.U);
                                String file = bc4.J(V, null, true, true).toString();
                                this.f5 = file;
                                co6Var.h = file;
                                photoViewer = this;
                            } else {
                                String x0 = x0();
                                co6Var.h = x0;
                                photoViewer = this;
                                photoViewer.X0(x0, null, bitmap3, decodeFile, gm.Y0(false), false);
                            }
                            String x02 = x0();
                            co6Var.c = x02;
                            photoViewer.X0(x02, null, bitmap3, decodeFile, 512.0f, false);
                        } else {
                            TLRPC.PhotoSize V2 = fn5.V(bitmap3, e0(), gm.Y0(false), gm.Y0(false), 87);
                            bc4.G(this.U);
                            String file2 = bc4.J(V2, null, true, true).toString();
                            this.f5 = file2;
                            co6Var.h = file2;
                            TLRPC.PhotoSize T = fn5.T(bitmap3, 512.0f, 512.0f, 70, 101, 101);
                            bitmap3 = bitmap3;
                            bc4.G(this.U);
                            co6Var.c = bc4.J(T, null, true, true).toString();
                        }
                    } else if (str != null) {
                        Bitmap E = E(BitmapFactory.decodeFile(co6Var.l), co6Var.A, null, false);
                        if (B0()) {
                            TLRPC.PhotoSize V3 = fn5.V(bitmap2, e0(), gm.Y0(false), gm.Y0(false), 87);
                            bc4.G(this.U);
                            String file3 = bc4.J(V3, null, true, true).toString();
                            this.f5 = file3;
                            co6Var.h = file3;
                            Bitmap bitmap6 = bitmap2;
                            photoViewer2 = this;
                            bitmap4 = E;
                            bitmap5 = bitmap6;
                        } else {
                            String x03 = x0();
                            co6Var.h = x03;
                            Bitmap bitmap7 = bitmap2;
                            photoViewer2 = this;
                            photoViewer2.X0(x03, null, E, bitmap7, gm.Y0(false), true);
                            bitmap4 = E;
                            bitmap5 = bitmap7;
                        }
                        String x04 = x0();
                        co6Var.c = x04;
                        Bitmap bitmap8 = bitmap5;
                        photoViewer2.X0(x04, null, bitmap4, bitmap8, 512.0f, true);
                        bitmap3 = bitmap8;
                    } else {
                        TLRPC.PhotoSize V4 = fn5.V(bitmap2, e0(), gm.Y0(false), gm.Y0(false), 87);
                        bc4.G(this.U);
                        String file4 = bc4.J(V4, null, true, true).toString();
                        this.f5 = file4;
                        co6Var.h = file4;
                        TLRPC.PhotoSize T2 = fn5.T(bitmap2, 512.0f, 512.0f, 70, 101, 101);
                        bitmap3 = bitmap2;
                        bc4.G(this.U);
                        co6Var.c = bc4.J(T2, null, true, true).toString();
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
        ao6Var = co6Var.A;
        String str2 = co6Var.j;
        if (ao6Var != null) {
        }
        if (z) {
        }
    }

    public final int f0(int i, boolean z) {
        int measuredHeight;
        int additionalTop;
        boolean z2;
        if (z || (z2 = this.s)) {
            measuredHeight = this.f0.getMeasuredHeight();
        } else {
            measuredHeight = (gm.n - this.t2.bottom) + gm.q.y;
            if ((i == 0 || i == 4 || i == 5) && this.d2 != 1 && !z2) {
                measuredHeight += gm.m;
            }
        }
        if ((i == 0 && this.d2 == 1) || i == 1) {
            additionalTop = gm.L(144.0f);
        } else if (i == 2) {
            additionalTop = gm.L(214.0f);
        } else {
            if (i != 3) {
                return measuredHeight;
            }
            additionalTop = this.M1.getAdditionalTop() + org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + this.M1.getAdditionalBottom() + gm.L(48.0f);
        }
        return measuredHeight - additionalTop;
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x01ee, code lost:
    
        if (r3 > ((gm.L(100.0f) + g0()) / 2.0f)) goto L100;
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
        u(0, true);
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
        ya8 ya8Var;
        k47 k47Var;
        k47 k47Var2;
        if (this.R6) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (this.O0.getVisibility() != 0 && gda.q0 && this.d2 != 11) {
            if (y > gm.L(40.0f) + org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + gm.m) {
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
        k47 k47Var3 = this.S4;
        if (k47Var3 == null || !k47Var3.q4() || x < (i0(this.t4) - this.B4.N0) / 2.0f || x > (i0(this.t4) + this.B4.N0) / 2.0f || y < (g0() - this.B4.O0) / 2.0f || y > (g0() + this.B4.O0) / 2.0f) {
            ya8 ya8Var2 = this.g0;
            if (ya8Var2 != null && ya8Var2.y && this.K) {
                WebView webView = ya8Var2.getWebView();
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
                oa8 oa8Var = this.z2;
                boolean z = (oa8Var != null && oa8Var.getVisibility() == 0) || ((ya8Var = this.g0) != null && ya8Var.y);
                if (this.B5 != 1 || (k47Var2 = this.S4) == null) {
                    w98 w98Var = this.X0[0];
                    if (w98Var != null && this.f0 != null) {
                        int i = w98Var.h;
                        if (x >= (i0(this.t4) - gm.L(100.0f)) / 2.0f) {
                            if (x <= (gm.L(100.0f) + i0(this.t4)) / 2.0f && y >= (g0() - gm.L(100.0f)) / 2.0f) {
                            }
                        }
                    }
                } else if (!k47Var2.x()) {
                    float g0 = (g0() - gm.L(360.0f)) / 2.0f;
                    if (y >= g0 && y <= g0 + gm.L(360.0f)) {
                        Y0(true);
                        return true;
                    }
                }
                ya8 ya8Var3 = this.g0;
                if ((ya8Var3 == null || !ya8Var3.y || ya8Var3.H || !this.K) && ((k47Var = this.S4) == null || !k47Var.q4())) {
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
                    ndc ndcVar = this.G2;
                    if (ndcVar != null && !this.r && i2 != 1) {
                        ndcVar.A0(1.0f);
                    }
                    this.H2 = true;
                    B2();
                    return true;
                }
                TLRPC.BotInlineResult botInlineResult = this.X4;
                if (botInlineResult != null && (botInlineResult.type.equals(MediaStreamTrack.VIDEO_TRACK_KIND) || k47.J4(this.X4.document))) {
                    int i3 = this.X0[0].h;
                    if (i3 > 0 && i3 <= 3 && x >= (i0(this.t4) - gm.L(100.0f)) / 2.0f) {
                        if (x <= (gm.L(100.0f) + i0(this.t4)) / 2.0f && y >= (g0() - gm.L(100.0f)) / 2.0f) {
                            if (y <= (gm.L(100.0f) + g0()) / 2.0f) {
                                Y0(true);
                                u(0, true);
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
            org.telegram.ui.ActionBar.d dVar = this.l4;
            if (dVar instanceof yv1) {
                ((yv1) dVar).Y9(this.S4, true, true);
            }
            A(true, false);
            String str = this.S4.T0;
            if (str != null) {
                Context context = LaunchActivity.H1;
                if (context == null) {
                    context = this.F;
                }
                l11.t(context, Uri.parse(str), true, false, false, null, null, false, oc7.r1(this.U).l4.A2.f, false, false);
                return true;
            }
        }
        return true;
    }

    public final void f2(boolean z, boolean z2) {
        pb8 pb8Var = this.d;
        boolean z3 = false;
        boolean z4 = pb8Var != null && pb8Var.z();
        e2(this.V1, z && !z4, z2, this.D7);
        ba8 ba8Var = this.W1;
        if (z && z4) {
            z3 = true;
        }
        e2(ba8Var, z3, z2, this.E7);
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
        ao6 ao6Var;
        if (this.o6 != null) {
            f5 = gm.R1(0.0f, this.f6, this.k6);
            f = gm.R1(this.Z5, this.d6, this.k6);
            f2 = gm.R1(this.a6, this.e6, this.k6);
            f3 = gm.R1(this.X5, this.c6, this.k6);
            f4 = gm.R1(this.W5, this.b6, this.k6);
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
        int i0 = i0(this.t4);
        int g0 = g0();
        canvas.translate(Z(this.t4), a0(this.t4));
        canvas.translate(f4, f3 + 0.0f);
        canvas.scale(f, f);
        canvas.rotate(f2);
        int q = this.B4.q();
        int o = this.B4.o();
        float f10 = i0;
        float f11 = q;
        float f12 = f10 / f11;
        float f13 = g0;
        float f14 = o;
        float f15 = f13 / f14;
        float min = Math.min(f12, f15);
        n43 n43Var = this.E1;
        int i = n43Var.i;
        if (i == 90 || i == 270) {
            o = q;
            q = o;
        }
        float f16 = n43Var.j;
        float f17 = n43Var.k;
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
        ib8 ib8Var = this.W4;
        if (i3 != 1 && ((this.t4 != 1 || this.n6 == 0) && ib8Var.c != null)) {
            float f25 = f21 * f24;
            float f26 = f23 * f24;
            if (f12 * f14 > f13) {
                f12 = f15;
            }
            float A = td4.A((f11 * f12) / f20, f25, 0.0f, f25);
            float A2 = td4.A((f14 * f12) / f20, f26, 0.0f, f26);
            canvas.clipRect((-A) / 2.0f, (-A2) / 2.0f, A / 2.0f, A2 / 2.0f);
        }
        if (this.d2 == 1 || n43Var.a) {
            TextureView textureView = this.C2;
            if (textureView != null) {
                ao6 ao6Var2 = ib8Var.c;
                textureView.setScaleX((ao6Var2 == null || !ao6Var2.l) ? 1.0f : -1.0f);
                kb8 kb8Var = this.F2;
                if (kb8Var != null) {
                    kb8Var.setScaleX(this.C2.getScaleX());
                }
            }
            ao6 ao6Var3 = ib8Var.c;
            if (ao6Var3 != null) {
                f6 = ao6Var3.c;
                f7 = 1.0f;
            } else {
                f6 = 1.0f;
                f7 = 1.0f;
            }
            float A3 = ((f24 / min) / td4.A(f6, f7, 0.0f, f7)) * f6;
            canvas.translate(n43Var.d * f7, n43Var.e * f7);
            canvas.scale(A3, A3);
            canvas.translate(mlb.C(n43Var.b, f18, min, f7), mlb.C(n43Var.c, f19, min, f7));
            float f27 = n43Var.g + i;
            if (f27 > 180.0f) {
                f27 -= 360.0f;
            }
            canvas.rotate(f27);
        }
        if (this.f7.isEmpty() || (ao6Var = ib8Var.c) == null || !ao6Var.l) {
            f8 = 1.0f;
        } else {
            f8 = 1.0f;
            canvas.scale(-1.0f, 1.0f);
        }
        if (f5 > 0.0f) {
            canvas.scale(f8 - (2.0f * f5), f8);
            canvas.skew(0.0f, td4.z(f8, f5, 4.0f * f5, 0.25f));
        }
    }

    public final int g0() {
        return f0(this.t4, false);
    }

    public final void g1() {
        Activity activity;
        if (gm.F1(this.E)) {
            return;
        }
        if (gm.E || (Build.VERSION.SDK_INT >= 24 && (activity = this.E) != null && activity.isInMultiWindowMode())) {
            fc4.b("PhotoViewer: onStop in multi-window mode, keep playing");
            return;
        }
        if (this.G2 == null) {
            ya8 ya8Var = this.g0;
            if (ya8Var == null || !ya8Var.y || !ya8Var.H) {
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
        n1b n1bVar;
        boolean z3 = true;
        if (z && (n1bVar = this.o5) != null) {
            if (n1bVar.H) {
                k1b[] k1bVarArr = n1bVar.I;
                if (k1bVarArr != null) {
                    for (k1b k1bVar : k1bVarArr) {
                        if (k1bVar != null && k1bVar.e != null) {
                            break;
                        }
                    }
                }
                ra8 ra8Var = this.O1;
                if (ra8Var != null) {
                }
            }
            db8 db8Var = this.w5;
            if (z2) {
                db8Var.animate().setListener(null).cancel();
                this.w5.setVisibility(z3 ? 0 : 8);
                this.w5.setAlpha(z3 ? 1.0f : 0.0f);
                this.w5.setScaleX(z3 ? 1.0f : 0.8f);
                this.w5.setScaleY(z3 ? 1.0f : 0.8f);
            } else if (z3) {
                if (db8Var.getTag() == null) {
                    this.w5.animate().setListener(null).cancel();
                    if (this.w5.getVisibility() != 0) {
                        this.w5.setVisibility(0);
                        wi8.t(this.w5.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f), d53.h, 400L);
                    }
                }
            } else if (db8Var.getTag() != null) {
                this.w5.animate().setListener(null).cancel();
                wi8.t(this.w5.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setListener(new jf4(this.w5)), d53.h, 400L);
            }
            this.w5.setTag(!z3 ? r1 : null);
            db8 db8Var2 = this.u5;
            if (z2) {
                db8Var2.animate().setListener(null).cancel();
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
                if (db8Var2.getTag() == null) {
                    this.u5.animate().setListener(null).cancel();
                    this.v5.animate().setListener(null).cancel();
                    if (this.u5.getVisibility() != 0) {
                        this.u5.setVisibility(0);
                        ViewPropertyAnimator scaleY = this.u5.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f);
                        d53 d53Var = d53.h;
                        wi8.t(scaleY, d53Var, 400L);
                        this.v5.setVisibility(0);
                        this.v5.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setInterpolator(d53Var).setDuration(400L).start();
                    }
                }
            } else if (db8Var2.getTag() != null) {
                this.u5.animate().setListener(null).cancel();
                ViewPropertyAnimator listener = this.u5.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setListener(new jf4(this.u5));
                d53 d53Var2 = d53.h;
                wi8.t(listener, d53Var2, 400L);
                this.v5.animate().setListener(null).cancel();
                this.v5.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setListener(new jf4(this.v5)).setInterpolator(d53Var2).setDuration(400L).start();
            }
            this.u5.setTag(z ? 1 : null);
        }
        z3 = false;
        db8 db8Var3 = this.w5;
        if (z2) {
        }
        this.w5.setTag(!z3 ? r1 : null);
        db8 db8Var22 = this.u5;
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

    public final int h0() {
        return i0(this.t4);
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
        ra8 ra8Var;
        sa8 sa8Var;
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
                    float A = td4.A(this.b6, f7, f5, f7);
                    float f8 = this.X5;
                    float A2 = td4.A(this.c6, f8, f5, f8);
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
            jc2 jc2Var = this.a4;
            if (jc2Var.rewindCount <= 0) {
                ja8 ja8Var = this.c4;
                if (ja8Var.rewinding) {
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        ja8Var.cancelRewind();
                        return false;
                    }
                    if (motionEvent.getAction() == 2) {
                        ja8Var.setX(motionEvent.getX());
                        return true;
                    }
                }
                byte b = this.t4;
                if (b == 2) {
                    this.J1.h(motionEvent);
                    return true;
                }
                if (b != 1 && (b == 3 || this.d2 != 1)) {
                    if (d0().f.e || (d0().p0 && this.e && this.m4 == 0)) {
                        if (motionEvent.getAction() == 1) {
                            x(true);
                        }
                    } else {
                        if (this.t4 == 0 && this.d2 != 1 && motionEvent.getPointerCount() == 1 && this.q6.a(motionEvent) && this.N6) {
                            this.N6 = false;
                            this.K6 = false;
                            this.J6 = false;
                            t(false);
                            return true;
                        }
                        kvb kvbVar = this.n1;
                        if (kvbVar != null) {
                            zcb zcbVar = kvbVar.d;
                            if (kvbVar.c) {
                                ViewPropertyAnimator viewPropertyAnimator = kvbVar.b;
                                if (viewPropertyAnimator != null) {
                                    viewPropertyAnimator.setListener(null);
                                    kvbVar.b.cancel();
                                    kvbVar.b = null;
                                }
                                gm.r(zcbVar);
                                zcbVar.run();
                            }
                            kvbVar.c = false;
                        }
                        int actionMasked = motionEvent.getActionMasked();
                        n88 n88Var = this.K7;
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
                                        ra8 ra8Var2 = this.O1;
                                        ra8Var2.getHitRect(rect);
                                        if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                                            MotionEvent obtain4 = MotionEvent.obtain(motionEvent);
                                            obtain4.offsetLocation(-ra8Var2.getX(), -ra8Var2.getY());
                                            this.O1.a(obtain4);
                                            obtain4.recycle();
                                            this.M6 = (byte) 1;
                                        }
                                    }
                                }
                            }
                            if (motionEvent.getActionMasked() != 0) {
                                gm.r(n88Var);
                                return false;
                            }
                            this.J7 = motionEvent.getX();
                            gm.d3(n88Var, 300L);
                            return false;
                        }
                        float f12 = 3.0f;
                        float f13 = 1.0f;
                        float f14 = 0.0f;
                        if (motionEvent.getActionMasked() == 2) {
                            if (Math.abs(this.J7 - this.I7) > gm.e) {
                                gm.r(n88Var);
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
                                    this.z6 = ((this.x6 - (i0(this.t4) / 2)) - (((this.x6 - (i0(this.t4) / 2)) - this.W5) / (this.Z5 / this.v6))) - f15;
                                    this.A6 = ((this.y6 - (g0() / 2)) - (((this.y6 - (g0() / 2)) - this.X5) / (this.Z5 / this.v6))) - f16;
                                    this.x6 = x;
                                    this.y6 = y3;
                                }
                                if (this.d2 == 11 && this.t4 == 0) {
                                    this.a6 = (float) ((((Math.atan2(motionEvent.getY(1) - motionEvent.getY(0), motionEvent.getX(1) - motionEvent.getX(0)) - this.u6) / 3.141592653589793d) * 180.0d) + this.w6);
                                }
                                this.Z5 = (((float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0))) / this.t6) * this.v6;
                                this.W5 = hg9.x(this.Z5, this.v6, (this.x6 - (i0(this.t4) / 2)) - this.z6, this.x6 - (i0(this.t4) / 2));
                                float g0 = this.y6 - (g0() / 2);
                                float g02 = (this.y6 - (g0() / 2)) - this.A6;
                                float f19 = this.Z5;
                                this.X5 = hg9.x(f19, this.v6, g02, g0);
                                I2(f19);
                                H0();
                                this.f0.invalidate();
                                return false;
                            }
                            if (motionEvent.getPointerCount() == 1) {
                                if (this.L6 == 1 && (sa8Var = this.M1) != null) {
                                    View view2 = sa8Var.getView();
                                    MotionEvent obtain5 = MotionEvent.obtain(motionEvent);
                                    obtain5.offsetLocation(-view2.getX(), -view2.getY());
                                    this.M1.h(obtain5);
                                    obtain5.recycle();
                                    return true;
                                }
                                if (this.M6 == 1 && (ra8Var = this.O1) != null) {
                                    MotionEvent obtain6 = MotionEvent.obtain(motionEvent);
                                    obtain6.offsetLocation(-ra8Var.getX(), -ra8Var.getY());
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
                                    gm.r(n88Var);
                                    rb8 rb8Var = this.T7;
                                    if (rb8Var != null) {
                                    }
                                }
                                if (this.d.U() && this.t4 == 0 && (i3 = this.d2) != 1 && i3 != 11 && this.P6 && !this.U5 && this.Z5 == 1.0f && abs2 >= gm.L(30.0f) && abs2 / 2.0f > abs) {
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
                                    if (this.K6 || this.t4 != 0 || this.d2 == 11 || ((this.Z5 == 1.0f && Math.abs(y4) + gm.L(12.0f) < Math.abs(x2)) || this.Z5 != 1.0f)) {
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
                            gm.r(n88Var);
                            if (this.L6 == 1) {
                                sa8 sa8Var2 = this.M1;
                                if (sa8Var2 != null) {
                                    View view3 = sa8Var2.getView();
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
                                ra8 ra8Var3 = this.O1;
                                if (ra8Var3 != null) {
                                    MotionEvent obtain8 = MotionEvent.obtain(motionEvent);
                                    obtain8.offsetLocation(-ra8Var3.getX(), -ra8Var3.getY());
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
                                    float x3 = hg9.x(f12, this.v6, (this.x6 - (i0(this.t4) / 2)) - this.z6, this.x6 - (i0(this.t4) / 2));
                                    float x4 = hg9.x(f12, this.v6, (this.y6 - (g0() / 2)) - this.A6, this.y6 - (g0() / 2));
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
                                    t(true);
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
                                if (Math.abs(this.V5 - motionEvent.getY()) > g0() / 6.0f) {
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
                                    if ((this.W5 < this.D6 - (i0(r4) / 3) || f < (-gm.L(650.0f))) && this.C4.D()) {
                                        float f35 = this.Z5;
                                        if (f35 != 1.0f) {
                                            float i0 = (i0(this.t4) - this.B4.N0) / 2.0f;
                                            float f36 = this.Z5;
                                            f14 = i0 * f36;
                                            f35 = f36;
                                        }
                                        this.S6 = (byte) 1;
                                        b(f35, ((this.D6 - i0(this.t4)) - f14) - (gm.L(30.0f) / 2), this.X5, false);
                                        return true;
                                    }
                                    if ((this.W5 > this.E6 + (i0(this.t4) / 3) || f > gm.L(650.0f)) && this.A4.D()) {
                                        float f37 = this.Z5;
                                        if (f37 != 1.0f) {
                                            float i02 = (i0(this.t4) - this.B4.N0) / 2.0f;
                                            float f38 = this.Z5;
                                            f14 = i02 * f38;
                                            f37 = f38;
                                        }
                                        this.S6 = (byte) 2;
                                        b(f37, this.E6 + i0(this.t4) + f14 + (gm.L(30.0f) / 2), this.X5, false);
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
                jc2Var.cancelRewind();
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
            jp0 jp0Var = this.Q0;
            Property property = View.TRANSLATION_Y;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(jp0Var, (Property<jp0, Float>) property, 0.0f, this.V1.getEditTextHeight() + jp0Var.getHeight() + (this.s1 ? gm.L(58.0f) : 0));
            jp0 jp0Var2 = this.Q0;
            Property property2 = View.ALPHA;
            animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(jp0Var2, (Property<jp0, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.T0, (Property<vi3, Float>) property, 0.0f, gm.L(158.0f)), ObjectAnimator.ofFloat(this.k0, (Property<View, Float>) property2, this.R4 ? 0.0f : 1.0f, 1.0f));
        } else {
            this.T7.setTag(null);
            AnimatorSet animatorSet3 = this.Z7;
            rb8 rb8Var = this.T7;
            Property property3 = View.TRANSLATION_Y;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(rb8Var, (Property<rb8, Float>) property3, 0.0f, gm.L(166.0f)), ObjectAnimator.ofFloat(this.U7, (Property<kb2, Float>) property3, 0.0f, gm.L(166.0f)), ObjectAnimator.ofFloat(this.k0, (Property<View, Float>) View.ALPHA, 1.0f, this.R4 ? 0.0f : 1.0f));
        }
        this.Z7.addListener(new pa8(this, z, b));
        this.Z7.setDuration(200L);
        this.Z7.setInterpolator(gm.G);
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
        ya8 ya8Var;
        if (this.G2 != null || ((ya8Var = this.g0) != null && ya8Var.y)) {
            boolean z = motionEvent.getX() >= ((float) ((i0(this.t4) / 3) << 1));
            long m0 = m0();
            long z0 = z0();
            if (m0 != -9223372036854775807L && z0 > 15000 && (!z || z0 - m0 > 10000)) {
                return true;
            }
        }
        return false;
    }

    public final int i0(int i) {
        int L;
        int width = this.f0.getWidth();
        if (i != 1) {
            if (i != 0) {
                if (i == 4 || i == 5 || i == 3) {
                    return width;
                }
                L = gm.L(28.0f);
                return width - L;
            }
            if (this.d2 != 1) {
                return width;
            }
        }
        L = gm.L(32.0f);
        return width - L;
    }

    public final void i1() {
        final File file;
        final k47 k47Var;
        final boolean z;
        final boolean z2;
        final boolean z3;
        if (j()) {
            k47 k47Var2 = this.S4;
            File file2 = null;
            if (k47Var2 != null) {
                boolean z4 = k47Var2.t() && !this.S4.U2();
                boolean z5 = z4 && this.S4.O3();
                boolean K4 = k47.K4(this.S4.k);
                if (!TextUtils.isEmpty(this.S4.k.attachPath)) {
                    File file3 = new File(this.S4.k.attachPath);
                    if (file3.exists()) {
                        file2 = file3;
                    }
                }
                if (file2 == null) {
                    bc4.G(this.U);
                    file2 = bc4.M(this.S4.k, false, true);
                }
                k47Var = k47Var2;
                file = file2;
                z2 = z4;
                z3 = z5;
                z = K4;
            } else {
                file = null;
                k47Var = null;
                z = false;
                z2 = false;
                z3 = false;
            }
            if (file == null || !file.exists()) {
                d2();
                return;
            }
            this.h7 = new a0(this, this.O4, new ArrayList(this.X6), this.d);
            cb8 cb8Var = new cb8();
            cb8Var.c = false;
            u2(false, true, cb8Var);
            gm.d3(new Runnable() { // from class: org.telegram.ui.q
                @Override // java.lang.Runnable
                public final void run() {
                    Drawable[] drawableArr = PhotoViewer.d9;
                    PhotoViewer photoViewer = PhotoViewer.this;
                    photoViewer.getClass();
                    File file4 = file;
                    Pair L0 = gm.L0(file4);
                    int i = photoViewer.V3;
                    photoViewer.V3 = i - 1;
                    String absolutePath = file4.getAbsolutePath();
                    boolean z6 = z;
                    jo6 jo6Var = new jo6(i, absolutePath, z6 ? 0 : ((Integer) L0.first).intValue(), z6, 0, 0);
                    jo6Var.n(L0);
                    photoViewer.d2 = 2;
                    photoViewer.v2 = false;
                    photoViewer.d = new xa8(photoViewer, photoViewer.d, k47Var, jo6Var, z2, z3);
                    photoViewer.q1.f();
                    if (photoViewer.T6 == null) {
                        photoViewer.T6 = VelocityTracker.obtain();
                    }
                    photoViewer.G7 = (byte) 3;
                    photoViewer.A2(false, false);
                    photoViewer.t2(true, false);
                    yv1 yv1Var = photoViewer.k4;
                    if (yv1Var == null || yv1Var.a0 == null || !yv1Var.Y7()) {
                        photoViewer.W0();
                    } else {
                        photoViewer.k4.a0.R();
                    }
                    photoViewer.M0.setAlpha(nm7.d4);
                    photoViewer.f0.setAlpha(1.0f);
                    photoViewer.d1(null, null, null, null, null, null, Collections.singletonList(jo6Var), 0, null);
                    photoViewer.Q0.setTranslationY(gm.L(photoViewer.s1 ? 154.0f : 96.0f));
                    photoViewer.T0.setTranslationY(gm.L(photoViewer.s1 ? 154.0f : 96.0f));
                    photoViewer.G.setTranslationY(-r11.getHeight());
                    photoViewer.R1.setTranslationY(gm.L(photoViewer.s1 ? 154.0f : 96.0f));
                    photoViewer.G();
                    photoViewer.q2();
                    photoViewer.G7 = (byte) 0;
                }
            }, cb8Var.a);
        }
    }

    public final void i2() {
        long a;
        if (this.E != null) {
            yv1 yv1Var = this.k4;
            if (yv1Var != null) {
                a = yv1Var.a();
            } else {
                pb8 pb8Var = this.d;
                if (pb8Var == null) {
                    return;
                } else {
                    a = pb8Var.a();
                }
            }
            long j = a;
            ik.H(this.E, j, -1L, 0, false, new u88(this), null, new fk(-1, -14342875, 520093695, -1, -115203550, 620756991, cmb.w0(null, cmb.Ii, false), cmb.w0(null, cmb.Ei, false), cmb.w0(null, cmb.Gi, false)), null);
        }
    }

    public final boolean j() {
        yv1 yv1Var = this.k4;
        if (yv1Var == null) {
            return false;
        }
        if (yv1Var.f != null) {
            return true;
        }
        TLRPC.Chat chat = yv1Var.e;
        if (chat == null || sd2.r0(chat)) {
            return false;
        }
        return sd2.p(this.k4.e) || sd2.u(this.k4.e);
    }

    public final float j0(boolean z) {
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
        float min = Math.min(this.D1.getMeasuredWidth(), (this.D1.getMeasuredHeight() - gm.L(64.0f)) - (!this.s ? gm.m : 0)) - (gm.L(16.0f) << 1);
        return Math.max(min / q, min / o);
    }

    public final void j1(ArrayList arrayList, int i, az7 az7Var) {
        m1(null, null, null, null, null, arrayList, null, i, az7Var, null, 0L, 0L, 0L, true, null, null);
    }

    public final void j2(ArrayList arrayList) {
        boolean z;
        ndc ndcVar;
        k47 k47Var;
        boolean z2;
        lb8 lb8Var = this.f0;
        this.e0.softInputMode = 48;
        try {
            ((WindowManager) this.E.getSystemService("window")).updateViewLayout(this.h0, this.e0);
        } catch (Exception e) {
            fc4.g(e, true);
        }
        yv1 yv1Var = this.k4;
        if (yv1Var == null || yv1Var.a0 == null || yv1Var.getFragmentView() == null) {
            z = false;
        } else {
            ms1 ms1Var = this.k4.a0;
            if (ms1Var.p3) {
                ms1Var.Y1();
                z2 = true;
            } else {
                z2 = false;
            }
            gm.g3(this.k4.getParentActivity(), this.c);
            this.k4.getFragmentView().requestLayout();
            z = z2;
        }
        String str = null;
        Integer valueOf = (arrayList.size() != 1 || (ndcVar = this.G2) == null || ndcVar.S() <= 1500 || (k47Var = this.S4) == null || !k47.K4(k47Var.k)) ? null : Integer.valueOf((int) (this.G2.S() / 1000));
        if (arrayList.size() == 1) {
            k47 k47Var2 = (k47) arrayList.get(0);
            String K = sd2.K(oc7.r1(this.U).L0(Long.valueOf(-k47.B0(k47Var2.k))), false);
            if (!TextUtils.isEmpty(K)) {
                StringBuilder sb = new StringBuilder("https://");
                kt6.v(sb, oc7.r1(this.U).N2, "/", K, "/");
                sb.append(k47Var2.e1());
                str = sb.toString();
            }
        }
        ea8 ea8Var = new ea8(this, this.E, this.k4, arrayList, str, valueOf, lb8Var, z);
        ea8Var.v0(false);
        ea8Var.getWindow().setSoftInputMode(48);
        gm.d3(new a18(this, ea8Var, (byte) 7), 250L);
        ea8Var.show();
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
        x68 x68Var = this.D1;
        if (x68Var == null || (animatorSet = x68Var.s) == null) {
            return;
        }
        animatorSet.cancel();
        x68Var.s = null;
        x68Var.f = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final mi2 k0() {
        String str;
        k47 k47Var = this.S4;
        if (k47Var != null) {
            TLRPC.Document F0 = k47Var.F0();
            String I0 = this.S4.I0();
            if (TextUtils.isEmpty(I0)) {
                I0 = this.S4.S0();
            }
            long B0 = k47.B0(this.S4.k);
            boolean D = pg3.D(B0);
            int i = z8c.t0;
            if (D) {
                TLRPC.User W1 = oc7.r1(i).W1(Long.valueOf(B0));
                if (W1 != null) {
                    str = bw2.m(0, W1.first_name, W1.last_name);
                    if (k47.R3(this.S4.k)) {
                        ndc ndcVar = this.G2;
                        if (ndcVar != null) {
                            return ndcVar.Q(kt6.q(new StringBuilder(), F0 != null ? F0.id : this.S4.e1(), ""), str, I0);
                        }
                    } else {
                        bc4.G(this.S4.K1);
                        File M = bc4.M(this.S4.k, false, true);
                        if (M != null && M.exists()) {
                            ki2 ki2Var = new ki2("image/jpeg", Uri.parse("file://" + M.getAbsolutePath()), "/photo_" + this.S4.e1());
                            ki2Var.e = str;
                            ki2Var.f = I0;
                            return new mi2(new li2(ki2Var));
                        }
                    }
                }
                str = null;
                if (k47.R3(this.S4.k)) {
                }
            } else {
                TLRPC.Chat L0 = oc7.r1(i).L0(Long.valueOf(-B0));
                if (L0 != null) {
                    str = L0.title;
                    if (k47.R3(this.S4.k)) {
                    }
                }
                str = null;
                if (k47.R3(this.S4.k)) {
                }
            }
        }
        return null;
    }

    public final void k1(TLRPC.FileLocation fileLocation, gn5 gn5Var, jb8 jb8Var) {
        m1(null, fileLocation, gn5Var, null, null, null, null, 0, jb8Var, null, 0L, 0L, 0L, true, null, null);
    }

    public final void k2(boolean z, boolean z2) {
        n1b n1bVar = this.o5;
        if (!z2) {
            n1bVar.animate().setListener(null).cancel();
            this.o5.setVisibility(z ? 0 : 8);
            this.o5.setAlpha(this.Q0.getAlpha());
            this.r5.animate().setListener(null).cancel();
            this.r5.setVisibility(z ? 0 : 8);
            this.r5.setAlpha(z ? 1.0f : 0.0f);
        } else if (z) {
            if (n1bVar.getTag() == null) {
                this.o5.animate().setListener(null).cancel();
                this.r5.animate().setListener(null).cancel();
                if (this.o5.getVisibility() != 0) {
                    this.o5.setVisibility(0);
                    this.o5.animate().alpha(1.0f).start();
                    this.r5.setVisibility(0);
                    this.r5.animate().alpha(1.0f).start();
                }
            }
        } else if (n1bVar.getTag() != null) {
            this.o5.animate().setListener(null).cancel();
            this.o5.animate().alpha(0.0f).setListener(new jf4(this.o5)).start();
            this.r5.animate().setListener(null).cancel();
            this.r5.animate().alpha(0.0f).setListener(new jf4(this.r5)).start();
        }
        this.o5.setTag(z ? r1 : null);
        boolean z3 = (!z || this.s5.o0 == 1 || this.A7) ? false : true;
        db8 db8Var = this.s5;
        if (!z2) {
            db8Var.animate().setListener(null).cancel();
            this.s5.setVisibility(z3 ? 0 : 8);
            this.s5.setAlpha(z3 ? 1.0f : 0.0f);
        } else if (z3) {
            if (db8Var.getTag() == null) {
                this.s5.animate().setListener(null).cancel();
                if (this.s5.getVisibility() != 0) {
                    this.s5.setVisibility(0);
                }
                this.s5.animate().alpha(1.0f).start();
            }
        } else if (db8Var.getTag() != null) {
            this.s5.animate().setListener(null).cancel();
            this.s5.animate().alpha(0.0f).setListener(new jf4(this.s5)).start();
        }
        this.s5.setTag(z3 ? r1 : null);
        g2(z && this.s5.o0 == 1 && !this.A7, z2);
        this.o5.setOutlineVisible(z && this.s5.o0 == 1 && this.x5.u0 && !this.u5.u0 && !this.v5.u0);
        boolean z4 = z && this.s5.o0 == 1 && !this.u5.u0 && !this.v5.u0;
        db8 db8Var2 = this.x5;
        if (!z2) {
            db8Var2.animate().setListener(null).cancel();
            this.x5.setVisibility(z4 ? 0 : 8);
            this.x5.setAlpha(z4 ? 1.0f : 0.0f);
            this.x5.setScaleX(z4 ? 1.0f : 0.8f);
            this.x5.setScaleY(z4 ? 1.0f : 0.8f);
        } else if (z4) {
            if (db8Var2.getTag() == null) {
                this.x5.animate().setListener(null).cancel();
                if (this.x5.getVisibility() != 0) {
                    this.x5.setVisibility(0);
                }
                wi8.t(this.x5.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f), d53.h, 400L);
            }
        } else if (db8Var2.getTag() != null) {
            this.x5.animate().setListener(null).cancel();
            wi8.t(this.x5.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setListener(new jf4(this.x5)), d53.h, 400L);
        }
        this.x5.setTag(z4 ? 1 : null);
    }

    public final void l() {
        if (this.d2 == 11) {
            db8 db8Var = this.s5;
            if (db8Var.o0 == 2) {
                db8Var.setCutOutState(true);
                g2(true, true);
                this.o5.f();
                this.f0.invalidate();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x02df, code lost:
    
        if (r10 != null) goto L153;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final rcc l0() {
        int i;
        ao6 ao6Var;
        long j;
        MediaCodec mediaCodec = null;
        r10 = null;
        ArrayList arrayList = null;
        mediaCodec = null;
        if (!this.s1 && B0() && this.B4.q() > 0) {
            int i2 = this.d2;
            float f = i2 == 1 ? 800.0f : i2 == 11 ? 500.0f : 854.0f;
            rcc rccVar = new rcc();
            rccVar.a = 0L;
            rccVar.d = 0.0f;
            rccVar.b = Math.min(3000L, this.W4.g);
            while (true) {
                j = rccVar.b;
                if (j <= 0 || j >= 1000) {
                    break;
                }
                rccVar.b = j << 1;
            }
            rccVar.e = j;
            rccVar.f = this.d8;
            rccVar.g = 0;
            rccVar.o = this.f5;
            long j2 = rccVar.b;
            rccVar.q = (int) ((j2 / 1000.0f) * 115200.0f);
            rccVar.r = j2;
            rccVar.n = 30;
            rccVar.v = j2;
            ib8 ib8Var = this.W4;
            rccVar.A = ib8Var.d;
            String str = ib8Var.b;
            if (str != null) {
                rccVar.B = str;
                ArrayList arrayList2 = ib8Var.f;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    arrayList = this.W4.f;
                }
                rccVar.G = arrayList;
            } else {
                rccVar.B = ib8Var.a;
                rccVar.G = ib8Var.e;
            }
            rccVar.I = true;
            int q = this.B4.q();
            int o = this.B4.o();
            ao6 ao6Var2 = this.W4.c;
            if (ao6Var2 != null) {
                int i3 = ao6Var2.k;
                if (i3 == 90 || i3 == 270) {
                    o = q;
                    q = o;
                }
                q = (int) (q * ao6Var2.e);
                o = (int) (o * ao6Var2.f);
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
            rccVar.k = i5;
            rccVar.h = i5;
            rccVar.l = i6;
            rccVar.i = i6;
            rccVar.m = -1;
            rccVar.t = true;
            rccVar.c = 0L;
            return rccVar;
        }
        if (!this.s1 || ((this.V4 == null && this.U4 == null) || this.e8 == 0)) {
            return null;
        }
        rcc rccVar2 = new rcc();
        rccVar2.a = this.r8;
        rccVar2.b = this.s8;
        rccVar2.d = this.t8;
        rccVar2.e = this.u8;
        rccVar2.f = this.d8;
        rccVar2.g = this.g8;
        rccVar2.h = this.h8;
        rccVar2.i = this.i8;
        rccVar2.m = this.l8;
        rccVar2.o = this.d5;
        rccVar2.p = this.e5;
        long j3 = this.x8;
        if (j3 == 0) {
            j3 = 1;
        }
        rccVar2.q = j3;
        rccVar2.r = this.y8;
        rccVar2.n = this.o8;
        rccVar2.v = (long) (this.n8 * 1000.0f);
        ib8 ib8Var2 = this.W4;
        rccVar2.A = ib8Var2.d;
        String str2 = ib8Var2.b;
        if (str2 != null) {
            rccVar2.B = str2;
            ArrayList arrayList3 = ib8Var2.f;
            rccVar2.G = (arrayList3 == null || arrayList3.isEmpty()) ? null : this.W4.f;
        } else {
            rccVar2.B = ib8Var2.a;
            ArrayList arrayList4 = ib8Var2.e;
            rccVar2.G = (arrayList4 == null || arrayList4.isEmpty()) ? null : this.W4.e;
        }
        if (this.d2 == 1 || this.r || !(this.k1.getTag() == null || (rccVar2.k == this.h8 && rccVar2.l == this.i8))) {
            if (this.r || this.d2 == 1) {
                this.d8 = 1;
                S2();
            }
            rccVar2.k = this.j8;
            rccVar2.l = this.k8;
            if (!this.r && this.d2 != 1) {
                r5 = this.l8;
            }
            rccVar2.m = r5;
        } else {
            rccVar2.k = this.h8;
            rccVar2.l = this.i8;
            rccVar2.m = this.r ? -1 : this.m8;
        }
        ao6 ao6Var3 = this.W4.c;
        rccVar2.H = ao6Var3;
        if (ao6Var3 != null) {
            rccVar2.g += ao6Var3.k;
            while (true) {
                i = rccVar2.g;
                if (i < 360) {
                    break;
                }
                rccVar2.g = i - 360;
            }
            if (i == 90 || i == 270) {
                ao6Var = rccVar2.H;
                ao6Var.i = (int) (rccVar2.k * ao6Var.f);
                ao6Var.j = (int) (rccVar2.l * ao6Var.e);
            } else {
                ao6Var = rccVar2.H;
                ao6Var.i = (int) (rccVar2.k * ao6Var.e);
                ao6Var.j = (int) (rccVar2.l * ao6Var.f);
            }
            if (this.d2 == 1) {
                int i7 = ao6Var.i;
                int i8 = 800;
                if (i7 > 800) {
                    ao6Var.i = 800;
                    i7 = 800;
                }
                int i10 = ao6Var.j;
                if (i10 > 800) {
                    ao6Var.j = 800;
                } else {
                    i8 = i10;
                }
                int min = Math.min(i7, i8);
                ao6Var.j = min;
                ao6Var.i = min;
            }
            if (e21.a) {
                StringBuilder sb = new StringBuilder("original transformed w = ");
                sb.append(rccVar2.H.i);
                sb.append(" h = ");
                sb.append(rccVar2.H.j);
                sb.append(" r = ");
                b10.p(rccVar2.g, sb);
            }
            ao6 ao6Var4 = rccVar2.H;
            int i11 = ao6Var4.i;
            int i12 = ao6Var4.j;
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
            ao6 ao6Var5 = rccVar2.H;
            ao6Var5.i = iArr[0];
            ao6Var5.j = iArr[1];
            if (e21.a) {
                StringBuilder sb2 = new StringBuilder("fixed transformed w = ");
                sb2.append(rccVar2.H.i);
                sb2.append(" h = ");
                b10.p(rccVar2.H.j, sb2);
            }
        }
        if (this.d2 == 1) {
            rccVar2.c = this.A8;
            rccVar2.j = this.m8;
        }
        rccVar2.t = this.r || this.d2 == 1;
        return rccVar2;
    }

    public final boolean l1(k47 k47Var, yv1 yv1Var, long j, long j2, long j3, jb8 jb8Var) {
        return m1(k47Var, null, null, null, null, null, null, 0, jb8Var, yv1Var, j, j2, j3, true, null, null);
    }

    public final void l2(boolean z) {
        ya8 ya8Var;
        byte b = 1;
        Object tag = this.s3.getTag();
        if (z) {
            if (tag != null) {
                return;
            }
            if (!this.s3.s && ((ya8Var = this.g0) == null || !ya8Var.y || ya8Var.w.isEmpty())) {
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
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.s3, (Property<ka8, Float>) View.ALPHA, z ? 1.0f : 0.0f), ObjectAnimator.ofFloat(this.s3, (Property<ka8, Float>) View.SCALE_X, z ? 1.0f : 0.5f), ObjectAnimator.ofFloat(this.s3, (Property<ka8, Float>) View.SCALE_Y, z ? 1.0f : 0.5f), ObjectAnimator.ofFloat(this.s3, (Property<ka8, Float>) View.TRANSLATION_Y, z ? 0.0f : gm.L(12.0f)));
        this.t3.setDuration(380L);
        this.t3.setInterpolator(d53.h);
        this.t3.addListener(new ha8(this, b));
        this.t3.start();
    }

    public final void m() {
        Runnable runnable = this.I2;
        if (runnable != null) {
            gm.r(runnable);
            this.I2 = null;
        }
    }

    public final long m0() {
        ya8 ya8Var = this.g0;
        if (ya8Var != null && ya8Var.y) {
            return ya8Var.getCurrentPosition();
        }
        ndc ndcVar = this.G2;
        if (ndcVar == null) {
            return 0L;
        }
        return ndcVar.S();
    }

    public final boolean m1(k47 k47Var, TLRPC.FileLocation fileLocation, gn5 gn5Var, gn5 gn5Var2, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, int i, pb8 pb8Var, yv1 yv1Var, long j, long j2, long j3, boolean z, mb8 mb8Var, Integer num) {
        TLRPC.Message message;
        pb8 pb8Var2;
        hu1 hu1Var;
        hu1 hu1Var2;
        hu1 hu1Var3;
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        PhotoViewer photoViewer = this;
        if (photoViewer.E != null && !photoViewer.e && ((pb8Var != null || !photoViewer.p()) && (k47Var != null || fileLocation != null || arrayList != null || arrayList3 != null || arrayList2 != null || gn5Var != null || mb8Var != null))) {
            qb8 N = pb8Var.N(k47Var, fileLocation, i, true, false);
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
                if ((yv1Var == null || yv1Var.h == null) && ((photoViewer.y5 == 0 || !oc7.r1(photoViewer.U).B2(photoViewer.y5)) && ((k47Var == null || (!oc7.r1(photoViewer.U).B2(k47.B0(k47Var.k)) && ((message = k47Var.k) == null || !message.noforwards))) && ((k47Var == null || !k47Var.y2()) && !photoViewer.M0(mb8Var))))) {
                    photoViewer.e0.flags &= -8193;
                    gm.f2();
                } else {
                    photoViewer.e0.flags |= TLObject.FLAG_13;
                    gm.f2();
                }
                photoViewer.e0.softInputMode = nm7.u4;
                photoViewer.h0.setFocusable(false);
                photoViewer.f0.setFocusable(false);
                windowManager.addView(photoViewer.h0, photoViewer.e0);
                Activity activity = photoViewer.E;
                if (activity instanceof LaunchActivity) {
                    ((LaunchActivity) activity).a1.add(photoViewer.t1);
                }
                byte b = 2;
                if (Build.VERSION.SDK_INT >= 33 && (findOnBackInvokedDispatcher = photoViewer.h0.findOnBackInvokedDispatcher()) != null) {
                    findOnBackInvokedDispatcher.registerOnBackInvokedCallback(0, new up(photoViewer, b));
                }
                photoViewer.u7 = false;
                photoViewer.v2 = false;
                photoViewer.P = true;
                photoViewer.Q = false;
                photoViewer.z3 = true;
                photoViewer.E2 = false;
                photoViewer.k4 = yv1Var;
                photoViewer.s4 = num != null;
                y98 y98Var = photoViewer.h1;
                if (y98Var != null) {
                    y98Var.setImage((Bitmap) null);
                }
                photoViewer.N.c("");
                photoViewer.N.a("", false);
                nb8 nb8Var = photoViewer.O;
                if (nb8Var != null) {
                    nb8Var.b(0, 0, false);
                    photoViewer.O.d(false, false);
                }
                photoViewer.G.setTitleScrollNonFitText(false);
                e7a e7aVar = photoViewer.H7;
                if (e7aVar != null) {
                    e7aVar.a();
                    photoViewer.H7 = null;
                }
                e7a e7aVar2 = (e7a) new ov0(nm7.f(photoViewer.U), photoViewer).b;
                e7aVar2.e(nm7.m4);
                e7aVar2.b(nm7.Z1);
                e7aVar2.b(nm7.Y1);
                e7aVar2.b(nm7.u3);
                e7aVar2.b(nm7.X1);
                e7aVar2.b(nm7.W);
                e7aVar2.b(nm7.V);
                e7aVar2.b(nm7.g3);
                e7aVar2.b(nm7.v);
                e7aVar2.b(nm7.c2);
                e7aVar2.b(nm7.b2);
                e7aVar2.b(nm7.m0);
                e7aVar2.b(nm7.y1);
                photoViewer.H7 = e7aVar2;
                photoViewer.d = pb8Var;
                photoViewer.H5 = j2;
                photoViewer.D5 = j;
                photoViewer.E5 = (yv1Var == null || (hu1Var3 = yv1Var.D0) == null || !hu1Var3.O) ? null : yv1Var.F3;
                photoViewer.F5 = (yv1Var == null || (hu1Var2 = yv1Var.D0) == null || !hu1Var2.O) ? null : yv1Var.I3;
                photoViewer.G5 = (yv1Var == null || (hu1Var = yv1Var.D0) == null || !hu1Var.O) ? false : true;
                photoViewer.C5 = j3;
                photoViewer.q1.f();
                photoViewer.i7 = mb8Var;
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
                if (N != null) {
                    photoViewer.r4 = true;
                    photoViewer.m4 = (byte) 1;
                    if (k47Var != null) {
                        int i2 = k47Var.K1;
                        kn m = N.o ? N.a.m() : null;
                        photoViewer.k2 = m;
                        if (m != null) {
                            if (k47.K4(k47Var.k)) {
                                ImageReceiver imageReceiver = N.a;
                                imageReceiver.u0 = false;
                                imageReceiver.x0();
                                if (MediaController.w().D(k47Var)) {
                                    photoViewer.e3 = k47Var.b0;
                                }
                                photoViewer.V2 = photoViewer.S2 == null && !bc4.G(i2).T(k47Var.F0(), true) && (photoViewer.k2.s() || !bc4.G(i2).T(k47Var.F0(), false));
                                photoViewer.k2 = null;
                            } else if (k47Var.l2().size() > 1) {
                                photoViewer.k2 = null;
                            }
                        }
                    } else if (mb8Var != null) {
                        kn m2 = N.o ? N.a.m() : null;
                        photoViewer.k2 = m2;
                        if (m2 != null && mb8Var.a(i)) {
                            ImageReceiver imageReceiver2 = N.a;
                            imageReceiver2.u0 = false;
                            imageReceiver2.x0();
                            TLObject d = mb8Var.d(i);
                            TLRPC.Document document = d instanceof TLRPC.Document ? (TLRPC.Document) d : null;
                            photoViewer.V2 = photoViewer.S2 == null && document != null && !bc4.G(photoViewer.U).T(document, true) && (photoViewer.k2.s() || !bc4.G(photoViewer.U).T(document, false));
                            photoViewer.k2 = null;
                        }
                    }
                    photoViewer.d1(k47Var, fileLocation, gn5Var, gn5Var2, arrayList, arrayList2, arrayList3, i, N);
                    if (photoViewer.d2 == 1) {
                        photoViewer.D1.setVisibility(0);
                        photoViewer.D1.setAlpha(0.0f);
                        photoViewer.D1.setFreeform(false);
                    }
                    ImageReceiver imageReceiver3 = N.a;
                    RectF rectF = imageReceiver3.Q0;
                    float f = rectF.left;
                    float f2 = rectF.top;
                    int i3 = imageReceiver3.V;
                    kn m3 = imageReceiver3.m();
                    int i4 = m3 != null ? m3.d[2] : 0;
                    if (i4 != 0) {
                        i3 = i4;
                    }
                    ClippingImageView[] c0 = photoViewer.c0(N);
                    photoViewer.l6 = 1.0f;
                    for (int i5 = 0; i5 < c0.length; i5++) {
                        ClippingImageView clippingImageView = c0[i5];
                        boolean z2 = N.r;
                        clippingImageView.O = photoViewer.j4;
                        clippingImageView.L = true;
                        clippingImageView.N = z2;
                        clippingImageView.setVisibility(0);
                        c0[i5].setRadius(N.h);
                        ClippingImageView clippingImageView2 = c0[i5];
                        int i6 = N.a.W;
                        clippingImageView2.e = i3;
                        clippingImageView2.f = i6;
                        clippingImageView2.setImageBitmap(N.e);
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
                    for (int i7 = 0; i7 < c0.length; i7++) {
                        if (c0.length > 1 || N.r) {
                            c0[i7].setAlpha(0.0f);
                        } else {
                            c0[i7].setAlpha(1.0f);
                        }
                        c0[i7].setPivotX(0.0f);
                        c0[i7].setPivotY(0.0f);
                        c0[i7].setScaleX(N.k);
                        c0[i7].setScaleY(N.k);
                        c0[i7].setTranslationX((rectF.left * N.k) + N.b);
                        c0[i7].setTranslationY((rectF.top * N.k) + N.c);
                        c0[i7].setLayoutParams(layoutParams2);
                    }
                    photoViewer = this;
                    photoViewer.h0.getViewTreeObserver().addOnPreDrawListener(new v(this, c0, layoutParams2, f, N, f2, pb8Var, arrayList3, num));
                } else {
                    if (arrayList3 != null && photoViewer.d2 != 3 && ((pb8Var2 = photoViewer.d) == null || !pb8Var2.Q())) {
                        photoViewer.W0();
                    }
                    photoViewer.f0.setAlpha(1.0f);
                    photoViewer.d1(k47Var, fileLocation, gn5Var, gn5Var2, arrayList, arrayList2, arrayList3, i, N);
                    photoViewer.F0();
                    photoViewer.I1();
                    yv1 yv1Var2 = photoViewer.k4;
                    if (yv1Var2 != null) {
                        yv1Var2.i6();
                        UndoView undoView = yv1Var2.N3;
                        if (undoView != null) {
                            undoView.d(1, false);
                        }
                        photoViewer.k4.getFragmentView().invalidate();
                    }
                    photoViewer.h0.getViewTreeObserver().addOnPreDrawListener(new x(photoViewer, pb8Var, num));
                }
                AccessibilityManager accessibilityManager = (AccessibilityManager) photoViewer.E.getSystemService("accessibility");
                if (accessibilityManager.isTouchExplorationEnabled()) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    obtain.setEventType(TLObject.FLAG_14);
                    obtain.getText().add(jb6.M0(2131754808, "AccDescrPhotoViewer"));
                    accessibilityManager.sendAccessibilityEvent(obtain);
                }
                return true;
            } catch (Exception e) {
                fc4.g(e, true);
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
                    this.X7.setTranslationY(gm.L(58.0f));
                }
                ObjectAnimator objectAnimator = this.F7;
                if (objectAnimator != null) {
                    objectAnimator.removeAllListeners();
                    this.F7.cancel();
                }
                x98 x98Var = this.X7;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(x98Var, (Property<x98, Float>) View.TRANSLATION_Y, x98Var.getTranslationY(), 0.0f);
                this.F7 = ofFloat;
                ofFloat.setDuration(220L);
                this.F7.setInterpolator(d53.f);
                this.F7.start();
            }
        } else if (frameLayout.getTag() != null) {
            ObjectAnimator objectAnimator2 = this.F7;
            if (objectAnimator2 != null) {
                objectAnimator2.removeAllListeners();
                this.F7.cancel();
            }
            x98 x98Var2 = this.X7;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(x98Var2, (Property<x98, Float>) View.TRANSLATION_Y, x98Var2.getTranslationY(), gm.L(58.0f));
            this.F7 = ofFloat2;
            ofFloat2.addListener(new jf4(this.W7));
            this.F7.setDuration(220L);
            this.F7.setInterpolator(d53.f);
            this.F7.start();
        }
        FrameLayout frameLayout2 = this.W7;
        if (frameLayout2 != null && frameLayout2.getVisibility() != 8) {
            this.W7.setTranslationY(this.Q0.getTranslationY() - (this.V1.getAlpha() * b10.c(46.0f, this.V1.getEditTextHeight(), 0)));
        }
        this.W7.setTag(z ? 1 : null);
    }

    public final void n() {
        TextureView textureView;
        if (this.a8 == -1 || (textureView = this.C2) == null) {
            return;
        }
        this.a8 = -1L;
        this.A2.animate().alpha(1.0f).setInterpolator(d53.j).setDuration(85L).setListener(new u5(this, textureView.getBitmap(), (byte) 29)).start();
    }

    public final TLObject n0(int i, long[] jArr) {
        if (i < 0) {
            return null;
        }
        ArrayList arrayList = this.d7;
        if (!arrayList.isEmpty()) {
            if (i >= arrayList.size()) {
                return null;
            }
            if (jArr != null) {
                jArr[0] = ((xw9) arrayList.get(i)).b.size;
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
                return ((gn5) arrayList4.get(i)).f;
            }
            return null;
        }
        ArrayList arrayList5 = this.X6;
        if (arrayList5.isEmpty() || i >= arrayList5.size()) {
            return null;
        }
        k47 k47Var = (k47) arrayList5.get(i);
        TLRPC.Message message = k47Var.k;
        if (message instanceof TLRPC.TL_messageService) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionUserUpdatedPhoto) {
                return messageAction.newUserPhoto.photo_big;
            }
            TLRPC.PhotoSize w = bc4.w(k47Var.p0, gm.Y0(false), false, null, false);
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
            TLRPC.MessageMedia messageMedia = k47Var.a1;
            if (messageMedia != null) {
                TLRPC.Document document = messageMedia.document;
                if (document != null) {
                    TLRPC.PhotoSize w2 = bc4.w(document.thumbs, 90, false, null, false);
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
                    TLRPC.PhotoSize w3 = bc4.w(photo.sizes, gm.Y0(false), false, null, true);
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
            } else if (((k47.n1(message) instanceof TLRPC.TL_messageMediaPhoto) && k47.n1(k47Var.k).photo != null) || ((k47.n1(k47Var.k) instanceof TLRPC.TL_messageMediaWebPage) && k47.n1(k47Var.k).webpage != null)) {
                TLRPC.PhotoSize w4 = bc4.w(k47Var.p0, gm.Y0(true), false, null, true);
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
                if (k47.n1(k47Var.k) instanceof TLRPC.TL_messageMediaInvoice) {
                    return ((TLRPC.TL_messageMediaInvoice) k47.n1(k47Var.k)).photo;
                }
                if (k47Var.F0() != null && k47.W2(k47Var.F0())) {
                    TLRPC.PhotoSize w5 = bc4.w(k47Var.F0().thumbs, 90, false, null, false);
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

    public final boolean n1(ArrayList arrayList, int i, long j, long j2, long j3, pb8 pb8Var) {
        return m1((k47) arrayList.get(i), null, null, null, arrayList, null, null, i, pb8Var, null, j, j2, j3, true, null, null);
    }

    public final void n2() {
        ndc ndcVar;
        if (!this.s1 || (ndcVar = this.G2) == null || ndcVar.c0() || T0()) {
            return;
        }
        if (!this.r || this.d2 == 1) {
            this.G2.A0(0.0f);
        }
        this.H2 = false;
        B2();
    }

    public final void o() {
        r6 r6Var = this.B0;
        if (r6Var != null) {
            r6Var.setTranslationX(this.g2 ? -gm.L(4.0f) : 0.0f);
        }
        r7 r7Var = this.F0;
        if (r7Var != null) {
            R1(r7Var, this.g2, false);
        }
        boolean z = this.f2;
        if (z && this.J == null) {
            im0 c = this.Z.c(this.H, null, false);
            c.p(qqd.i(this.w2));
            c.r(gm.L(20.0f));
            c.q(gm.L(7.0f));
            int L = gm.L(54.0f);
            int L2 = gm.L(54.0f);
            Matrix matrix = tl0.a;
            this.J = new sl0(L, L2, c);
        }
        ImageView imageView = this.H;
        if (z) {
            rve.a(imageView);
            this.H.setBackground(this.J);
        } else {
            imageView.setStateListAnimator(null);
            this.H.setBackground(this.I);
        }
    }

    public final void o1(ArrayList arrayList, int i, int i2, boolean z, pb8 pb8Var, yv1 yv1Var) {
        io ioVar;
        int i3 = i2;
        this.i2 = z;
        vi3 vi3Var = this.T0;
        if (vi3Var != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) vi3Var.getLayoutParams();
            if (i3 == 4 || i3 == 5) {
                this.T0.setResourceId(R.drawable.send_plane_24);
                layoutParams.bottomMargin = gm.L(1.0f);
            } else if (i3 == 13 || i3 == 14 || i3 == 1 || i3 == 3 || i3 == 10 || i3 == 11) {
                this.T0.setResourceId(R.drawable.floating_check);
                this.T0.setPadding(0, gm.L(1.0f), 0, 0);
                layoutParams.bottomMargin = gm.L(1.0f);
            } else {
                this.T0.setResourceId(R.drawable.send_plane_24);
                layoutParams.bottomMargin = gm.L(1.0f);
            }
            this.T0.setLayoutParams(layoutParams);
        }
        if (i3 != 11 && this.o5 != null) {
            this.A7 = false;
            ImageView imageView = this.d1;
            if (imageView != null) {
                imageView.setAlpha(1.0f);
            }
            db8 db8Var = this.x5;
            if (db8Var != null) {
                db8Var.m(false, false);
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
            this.d = pb8Var;
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
            backgroundDrawable.setAlpha(nm7.d4);
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
            ob8 ob8Var = this.N;
            if (ob8Var != null && (ioVar = ob8Var.d) != null) {
                ioVar.setVisibility(this.f2 ? 8 : 0);
            }
            m1(null, null, null, null, null, null, arrayList, i, pb8Var, yv1Var, 0L, 0L, 0L, true, null, null);
            return;
        }
        this.d2 = i3;
        this.v2 = false;
        this.N.c("");
        this.N.a("", false);
        this.d = pb8Var;
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
        backgroundDrawable.setAlpha(nm7.d4);
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
        lo6 lo6Var;
        int i7;
        Bitmap decodeFile;
        Bitmap bitmap;
        int i8;
        int i10;
        byte b;
        kw7 kw7Var;
        ncc nccVar;
        ao6 ao6Var;
        int i11;
        boolean z;
        byte b2;
        int i12;
        int i13;
        int i14;
        boolean z2;
        float min;
        float f;
        ao6 ao6Var2;
        int i15;
        if (this.t4 != i) {
            boolean z3 = this.s1;
            if (z3) {
                w98[] w98VarArr = this.X0;
                if (w98VarArr[0].h != 3 && !z3 && (this.B4.n() == null || w98VarArr[0].h != -1)) {
                    return;
                }
            }
            if (this.p6 == null && this.o6 == null && !K0()) {
                pb8 pb8Var = this.d;
                if (pb8Var != null && (this.t4 == 0 || i == 0)) {
                    pb8Var.j();
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
                    nb8 nb8Var = this.O;
                    this.w7 = nb8Var != null && nb8Var.isShown();
                }
                nb8 nb8Var2 = this.O;
                if (nb8Var2 != null) {
                    nb8Var2.d(i == 0 && this.w7, true);
                }
                ib8 ib8Var = this.W4;
                n43 n43Var = this.E1;
                if (i == 0) {
                    Bitmap n = this.B4.n();
                    sa8 sa8Var = this.M1;
                    if (sa8Var != null) {
                        sa8Var.setDrawShadow(false);
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
                                int i17 = n43Var.i;
                                if (i17 == 90 || i17 == 270) {
                                    o = q;
                                    q = o;
                                }
                            } else {
                                ao6 ao6Var3 = ib8Var.c;
                                if (ao6Var3 != null) {
                                    int i18 = ao6Var3.k;
                                    if (i18 == 90 || i18 == 270) {
                                        o = q;
                                        q = o;
                                    }
                                    q = (int) (q * ao6Var3.e);
                                    o = (int) (o * ao6Var3.f);
                                }
                            }
                            float f6 = q;
                            float f7 = o;
                            float min2 = Math.min(i0(0) / f6, f0(0, false) / f7);
                            f = Math.min(i0(3) / f6, f0(3, false) / f7);
                            min = min2;
                            z2 = false;
                        } else {
                            if (b4 != 1 && (ao6Var2 = ib8Var.c) != null && ((i15 = ao6Var2.k) == 90 || i15 == 270)) {
                                float f8 = o;
                                float h0 = h0() / f8;
                                float f10 = q;
                                if (h0 * f10 > g0()) {
                                    h0 = g0() / f10;
                                }
                                this.Z5 = 1.0f / (h0 / Math.min(h0() / f10, g0() / f8));
                            } else if (this.d2 == 1 && ((i13 = n43Var.i) == 90 || i13 == 270)) {
                                float f11 = o;
                                float h02 = h0() / f11;
                                float f12 = q;
                                if (h02 * f12 > g0()) {
                                    h02 = g0() / f12;
                                }
                                this.Z5 = 1.0f / ((((n43Var.f / n43Var.l) * h02) / Math.min(h0() / f12, g0() / f11)) / n43Var.m);
                            }
                            ao6 ao6Var4 = ib8Var.c;
                            if (ao6Var4 != null) {
                                int i19 = ao6Var4.k;
                                if (i19 == 90 || i19 == 270) {
                                    o = q;
                                    q = o;
                                }
                                q = (int) (q * ao6Var4.e);
                                o = (int) (o * ao6Var4.f);
                            } else if (this.d2 == 1 && ((i14 = n43Var.i) == 90 || i14 == 270)) {
                                o = q;
                                q = o;
                            }
                            float f13 = q;
                            float f14 = o;
                            float min3 = Math.min(h0() / f13, g0() / f14);
                            if (this.d2 == 1) {
                                int i20 = n43Var.i;
                                min = j0(i20 == 90 || i20 == 270);
                                f = min3;
                                z2 = false;
                            } else {
                                z2 = false;
                                min = Math.min(i0(0) / f13, f0(0, false) / f14);
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
                                this.c6 = this.h6 + gm.L(56.0f);
                            } else if (b7 == 3) {
                                float L = this.h6 + gm.L(44.0f);
                                this.c6 = L;
                                if (this.M1 != null) {
                                    float additionalTop = L - (r4.getAdditionalTop() / 2.0f);
                                    this.c6 = additionalTop;
                                    this.c6 = (this.M1.getAdditionalBottom() / 2.0f) + additionalTop;
                                }
                            } else if (b7 == 2) {
                                this.c6 = this.h6 + gm.L(93.0f);
                            }
                            if (!this.s) {
                                this.c6 -= gm.m / 2;
                            }
                            this.d6 = (min / f) * this.i6;
                            this.e6 = this.j6;
                            this.f6 = 0.0f;
                            this.m6 = System.currentTimeMillis();
                            this.Q6 = true;
                        }
                        this.d6 = y1() * (min / f);
                        this.b6 = 0.0f;
                        this.W5 = (s0() / 2) - (w0() / 2);
                        int i21 = this.d2;
                        byte b8 = this.t4;
                        if (i21 != 1) {
                            if (b8 == 1) {
                                this.c6 = gm.L(56.0f);
                            } else if (b8 == 2) {
                                this.c6 = gm.L(93.0f);
                            } else if (b8 == 3) {
                                float L2 = gm.L(44.0f);
                                this.c6 = L2;
                                if (this.M1 != null) {
                                    float additionalTop2 = L2 - (r4.getAdditionalTop() / 2.0f);
                                    this.c6 = additionalTop2;
                                    this.c6 = (this.M1.getAdditionalBottom() / 2.0f) + additionalTop2;
                                }
                            }
                            if (!this.s) {
                                this.c6 -= gm.m / 2;
                            }
                        } else if (b8 == 2) {
                            this.c6 = gm.L(36.0f);
                        } else if (b8 == 3) {
                            float f15 = -gm.L(12.0f);
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
                        if (b2 != 1) {
                            arrayList.add(ObjectAnimator.ofFloat(this.V0, (Property<kb2, Float>) View.TRANSLATION_Y, gm.L(48.0f)));
                            arrayList.add(ObjectAnimator.ofFloat(this, so.g, 0.0f, 1.0f));
                            arrayList.add(ObjectAnimator.ofFloat(this.D1, (Property<x68, Float>) View.ALPHA, 0.0f));
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            ofFloat.addUpdateListener(new h88(this, (byte) 2));
                            arrayList.add(ofFloat);
                            i12 = 2;
                        } else if (b2 == 2) {
                            this.J1.c();
                            arrayList.add(ObjectAnimator.ofFloat(this.J1.getToolsView(), (Property<FrameLayout, Float>) View.TRANSLATION_Y, gm.L(186.0f)));
                            g78 curveControl = this.J1.getCurveControl();
                            Property property = View.ALPHA;
                            arrayList.add(ObjectAnimator.ofFloat(curveControl, (Property<g78, Float>) property, 0.0f));
                            arrayList.add(ObjectAnimator.ofFloat(this.J1.getBlurControl(), (Property<e78, Float>) property, 0.0f));
                            i12 = 2;
                            arrayList.add(ObjectAnimator.ofFloat(this, so.g, 0.0f, 1.0f));
                        } else {
                            if (b2 == 3) {
                                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.M1.getOffsetTranslationY(), gm.L(126.0f));
                                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, -gm.L(12.0f));
                                ofFloat2.addUpdateListener(new h88(this, (byte) 3));
                                ofFloat3.addUpdateListener(new h88(this, (byte) 4));
                                this.x4.c();
                                this.f0.invalidate();
                                this.M1.C0();
                                arrayList.add(ofFloat2);
                                arrayList.add(ofFloat3);
                                arrayList.add(ObjectAnimator.ofFloat(this, so.g, 0.0f, 1.0f));
                                this.M1.o0(true);
                            } else if (b2 == 4) {
                                arrayList.add(ObjectAnimator.ofFloat(this.O1.r, (Property<FrameLayout, Float>) View.TRANSLATION_Y, gm.L(18.0f)));
                                FrameLayout frameLayout = this.O1.r;
                                Property property2 = View.ALPHA;
                                arrayList.add(ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property2, 0.0f));
                                arrayList.add(ObjectAnimator.ofFloat(this.O1.x, (Property<aw7, Float>) View.TRANSLATION_X, gm.L(-18.0f)));
                                arrayList.add(ObjectAnimator.ofFloat(this.O1.x, (Property<aw7, Float>) property2, 0.0f));
                            } else if (b2 == 5) {
                                this.p5.setVisibility(0);
                                i12 = 2;
                                arrayList.add(ObjectAnimator.ofFloat(this.p5, (Property<wb8, Float>) View.ALPHA, 1.0f, 0.0f));
                            }
                            i12 = 2;
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
                        this.J2 = n43Var.a;
                        this.K2 = n43Var.b;
                        this.L2 = n43Var.c;
                        this.O2 = n43Var.f;
                        this.P2 = n43Var.g;
                        this.R2 = n43Var.i;
                        this.M2 = n43Var.j;
                        this.N2 = n43Var.k;
                        this.Q2 = n43Var.h;
                        CropAreaView cropAreaView = this.D1.b.a;
                        cropAreaView.f(true, false);
                        cropAreaView.setDimVisibility(true);
                        cropAreaView.invalidate();
                        ((TextView) this.V0.b).setText(jb6.L0(2131751636));
                        anb.X((TextView) this.V0.b, cmb.pg, this.w2);
                        this.p6 = new AnimatorSet();
                        ArrayList arrayList3 = new ArrayList();
                        jp0 jp0Var = this.Q0;
                        Property property3 = View.TRANSLATION_Y;
                        arrayList3.add(ObjectAnimator.ofFloat(jp0Var, (Property<jp0, Float>) property3, 0.0f, this.V1.getEditTextHeight() + jp0Var.getHeight() + (this.s1 ? gm.L(58.0f) : 0)));
                        jp0 jp0Var2 = this.Q0;
                        Property property4 = View.ALPHA;
                        arrayList3.add(ObjectAnimator.ofFloat(jp0Var2, (Property<jp0, Float>) property4, 0.0f));
                        n1b n1bVar = this.o5;
                        if (n1bVar != null) {
                            arrayList3.add(ObjectAnimator.ofFloat(n1bVar, (Property<n1b, Float>) property4, 0.0f));
                        }
                        yc ycVar = this.r5;
                        if (ycVar != null) {
                            arrayList3.add(ObjectAnimator.ofFloat(ycVar, (Property<yc, Float>) property4, 0.0f));
                        }
                        arrayList3.add(ObjectAnimator.ofFloat(this.T0, (Property<vi3, Float>) property3, 0.0f, gm.L(this.s1 ? 154.0f : 96.0f)));
                        arrayList3.add(ObjectAnimator.ofFloat(this.G, (Property<x20, Float>) property3, 0.0f, -r4.getHeight()));
                        arrayList3.add(ObjectAnimator.ofObject(this.k0, "backgroundColor", new ArgbEvaluator(), Integer.valueOf(color), Integer.valueOf(i16)));
                        if (this.j2) {
                            arrayList3.add(ObjectAnimator.ofFloat(this.R1, (Property<hb8, Float>) property3, 0.0f, gm.L(this.s1 ? 154.0f : 96.0f)));
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
                            arrayList3.add(ObjectAnimator.ofFloat(this.p1, (Property<ub8, Float>) property4, fArr));
                        }
                        if (this.f1.getTag() != null) {
                            float[] fArr2 = new float[i11];
                            // fill-array-data instruction
                            fArr2[0] = 1.0f;
                            fArr2[1] = 0.0f;
                            arrayList3.add(ObjectAnimator.ofFloat(this.f1, (Property<c7, Float>) property4, fArr2));
                        }
                        if (this.g1.getTag() != null) {
                            float[] fArr3 = new float[i11];
                            // fill-array-data instruction
                            fArr3[0] = 1.0f;
                            fArr3[1] = 0.0f;
                            arrayList3.add(ObjectAnimator.ofFloat(this.g1, (Property<o96, Float>) property4, fArr3));
                        }
                        if (this.h1.getTag() != null) {
                            float[] fArr4 = new float[i11];
                            // fill-array-data instruction
                            fArr4[0] = 1.0f;
                            fArr4[1] = 0.0f;
                            arrayList3.add(ObjectAnimator.ofFloat(this.h1, (Property<y98, Float>) property4, fArr4));
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
                                    lo6Var = null;
                                    i7 = 0;
                                } else {
                                    Object obj = arrayList4.get(this.O4);
                                    i7 = obj instanceof jo6 ? ((jo6) obj).J : 0;
                                    co6 co6Var = (co6) obj;
                                    lo6 lo6Var2 = co6Var.o;
                                    str = co6Var.a();
                                    lo6Var = lo6Var2;
                                }
                                if (z4) {
                                    i8 = i7;
                                    bitmap = null;
                                } else {
                                    if (lo6Var == null) {
                                        n1b n1bVar2 = this.o5;
                                        decodeFile = n1bVar2.M ? n1bVar2.getSourceBitmap() : this.B4.n();
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
                                    nccVar = (ncc) this.C2;
                                    kw7Var = null;
                                } else {
                                    kw7Var = this.x4;
                                    nccVar = null;
                                }
                                n78 n78Var = new n78(activity, nccVar, bitmap, segmentedDarkMaskImage, i8, lo6Var, kw7Var, i10, !z4 && (((ao6Var = ib8Var.c) != null && ao6Var.l) || n43Var.h), true, null, this.w2);
                                this.J1 = n78Var;
                                this.f0.addView(n78Var, qoe.c(-1.0f, -1));
                                this.J1.getDoneTextView().setOnClickListener(new m88(this, (byte) 1));
                                this.J1.getCancelTextView().setOnClickListener(new m88(this, (byte) 2));
                                this.J1.getToolsView().setTranslationY(gm.L(186.0f));
                            }
                            this.p6 = new AnimatorSet();
                            ArrayList arrayList5 = new ArrayList();
                            jp0 jp0Var3 = this.Q0;
                            Property property5 = View.TRANSLATION_Y;
                            arrayList5.add(ObjectAnimator.ofFloat(jp0Var3, (Property<jp0, Float>) property5, 0.0f, this.V1.getEditTextHeight() + jp0Var3.getHeight() + (this.s1 ? gm.L(58.0f) : 0)));
                            jp0 jp0Var4 = this.Q0;
                            Property property6 = View.ALPHA;
                            arrayList5.add(ObjectAnimator.ofFloat(jp0Var4, (Property<jp0, Float>) property6, 0.0f));
                            n1b n1bVar3 = this.o5;
                            if (n1bVar3 != null) {
                                arrayList5.add(ObjectAnimator.ofFloat(n1bVar3, (Property<n1b, Float>) property6, 0.0f));
                            }
                            yc ycVar2 = this.r5;
                            if (ycVar2 != null) {
                                arrayList5.add(ObjectAnimator.ofFloat(ycVar2, (Property<yc, Float>) property6, 0.0f));
                            }
                            arrayList5.add(ObjectAnimator.ofFloat(this.T0, (Property<vi3, Float>) property5, 0.0f, gm.L(this.s1 ? 154.0f : 96.0f)));
                            arrayList5.add(ObjectAnimator.ofFloat(this.G, (Property<x20, Float>) property5, 0.0f, -r4.getHeight()));
                            int i23 = this.d2;
                            if (i23 == 0 || i23 == 4) {
                                arrayList5.add(ObjectAnimator.ofFloat(this.O0, (Property<CheckBox, Float>) property6, 1.0f, 0.0f));
                                arrayList5.add(ObjectAnimator.ofFloat(this.P0, (Property<CounterView, Float>) property6, 1.0f, 0.0f));
                            } else if (i23 == 1) {
                                arrayList5.add(ObjectAnimator.ofFloat(this.D1, (Property<x68, Float>) property6, 1.0f, 0.0f));
                            }
                            if (this.p1.getVisibility() == 0) {
                                arrayList5.add(ObjectAnimator.ofFloat(this.p1, (Property<ub8, Float>) property6, 1.0f, 0.0f));
                            }
                            if (this.f1.getTag() != null) {
                                arrayList5.add(ObjectAnimator.ofFloat(this.f1, (Property<c7, Float>) property6, 1.0f, 0.0f));
                            }
                            if (this.g1.getTag() != null) {
                                arrayList5.add(ObjectAnimator.ofFloat(this.g1, (Property<o96, Float>) property6, 1.0f, 0.0f));
                            }
                            if (this.h1.getTag() != null) {
                                arrayList5.add(ObjectAnimator.ofFloat(this.h1, (Property<y98, Float>) property6, 1.0f, 0.0f));
                            }
                            arrayList5.add(ObjectAnimator.ofObject(this.k0, "backgroundColor", new ArgbEvaluator(), Integer.valueOf(color), Integer.valueOf(i16)));
                            this.p6.playTogether(arrayList5);
                            this.p6.setDuration(200L);
                            this.p6.addListener(new u(this, i));
                            this.p6.start();
                        } else if (i == 3) {
                            n2();
                            G();
                            this.p6 = new AnimatorSet();
                            ArrayList arrayList6 = new ArrayList();
                            jp0 jp0Var5 = this.Q0;
                            Property property7 = View.TRANSLATION_Y;
                            arrayList6.add(ObjectAnimator.ofFloat(jp0Var5, (Property<jp0, Float>) property7, this.V1.getEditTextHeight() + jp0Var5.getHeight() + (this.s1 ? gm.L(58.0f) : 0)));
                            jp0 jp0Var6 = this.Q0;
                            Property property8 = View.ALPHA;
                            arrayList6.add(ObjectAnimator.ofFloat(jp0Var6, (Property<jp0, Float>) property8, 0.0f));
                            n1b n1bVar4 = this.o5;
                            if (n1bVar4 != null) {
                                arrayList6.add(ObjectAnimator.ofFloat(n1bVar4, (Property<n1b, Float>) property8, this.A7 ? 1.0f : 0.0f));
                            }
                            yc ycVar3 = this.r5;
                            if (ycVar3 != null) {
                                arrayList6.add(ObjectAnimator.ofFloat(ycVar3, (Property<yc, Float>) property8, this.A7 ? 1.0f : 0.0f));
                            }
                            arrayList6.add(ObjectAnimator.ofFloat(this.T0, (Property<vi3, Float>) property7, gm.L(this.s1 ? 154.0f : 96.0f)));
                            arrayList6.add(ObjectAnimator.ofFloat(this.G, (Property<x20, Float>) property7, -r3.getHeight()));
                            arrayList6.add(ObjectAnimator.ofObject(this.k0, "backgroundColor", new ArgbEvaluator(), Integer.valueOf(color), Integer.valueOf(i16)));
                            if (this.j2) {
                                i5 = 1;
                                arrayList6.add(ObjectAnimator.ofFloat(this.R1, (Property<hb8, Float>) property7, gm.L(this.s1 ? 154.0f : 96.0f)));
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
                                arrayList6.add(ObjectAnimator.ofFloat(this.D1, (Property<x68, Float>) property8, 1.0f, 0.0f));
                            } else {
                                i6 = 2;
                            }
                            if (this.p1.getVisibility() == 0) {
                                float[] fArr5 = new float[i6];
                                // fill-array-data instruction
                                fArr5[0] = 1.0f;
                                fArr5[1] = 0.0f;
                                arrayList6.add(ObjectAnimator.ofFloat(this.p1, (Property<ub8, Float>) property8, fArr5));
                            }
                            if (this.f1.getTag() != null) {
                                float[] fArr6 = new float[i6];
                                // fill-array-data instruction
                                fArr6[0] = 1.0f;
                                fArr6[1] = 0.0f;
                                arrayList6.add(ObjectAnimator.ofFloat(this.f1, (Property<c7, Float>) property8, fArr6));
                            }
                            if (this.g1.getTag() != null) {
                                float[] fArr7 = new float[i6];
                                // fill-array-data instruction
                                fArr7[0] = 1.0f;
                                fArr7[1] = 0.0f;
                                arrayList6.add(ObjectAnimator.ofFloat(this.g1, (Property<o96, Float>) property8, fArr7));
                            }
                            if (this.h1.getTag() != null) {
                                float[] fArr8 = new float[i6];
                                // fill-array-data instruction
                                fArr8[0] = 1.0f;
                                fArr8[1] = 0.0f;
                                arrayList6.add(ObjectAnimator.ofFloat(this.h1, (Property<y98, Float>) property8, fArr8));
                            }
                            this.p6.playTogether(arrayList6);
                            this.p6.setDuration(200L);
                            this.p6.addListener(new ha8(this, (byte) 2));
                            this.p6.start();
                        } else if (i == 4) {
                            F();
                            this.p6 = new AnimatorSet();
                            ArrayList arrayList7 = new ArrayList();
                            jp0 jp0Var7 = this.Q0;
                            Property property9 = View.TRANSLATION_Y;
                            arrayList7.add(ObjectAnimator.ofFloat(jp0Var7, (Property<jp0, Float>) property9, this.V1.getEditTextHeight() + jp0Var7.getHeight() + (this.s1 ? gm.L(58.0f) : 0)));
                            jp0 jp0Var8 = this.Q0;
                            Property property10 = View.ALPHA;
                            arrayList7.add(ObjectAnimator.ofFloat(jp0Var8, (Property<jp0, Float>) property10, 0.0f));
                            n1b n1bVar5 = this.o5;
                            if (n1bVar5 != null) {
                                arrayList7.add(ObjectAnimator.ofFloat(n1bVar5, (Property<n1b, Float>) property10, 1.0f));
                            }
                            yc ycVar4 = this.r5;
                            if (ycVar4 != null) {
                                arrayList7.add(ObjectAnimator.ofFloat(ycVar4, (Property<yc, Float>) property10, 1.0f));
                            }
                            arrayList7.add(ObjectAnimator.ofFloat(this.T0, (Property<vi3, Float>) property9, gm.L(this.s1 ? 154.0f : 96.0f)));
                            arrayList7.add(ObjectAnimator.ofFloat(this.G, (Property<x20, Float>) property9, -r4.getHeight()));
                            arrayList7.add(ObjectAnimator.ofObject(this.k0, "backgroundColor", new ArgbEvaluator(), Integer.valueOf(color), Integer.valueOf(i16)));
                            if (this.j2) {
                                i3 = 1;
                                arrayList7.add(ObjectAnimator.ofFloat(this.R1, (Property<hb8, Float>) property9, gm.L(this.s1 ? 154.0f : 96.0f)));
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
                                arrayList7.add(ObjectAnimator.ofFloat(this.D1, (Property<x68, Float>) property10, 1.0f, 0.0f));
                            } else {
                                i4 = 2;
                            }
                            if (this.p1.getVisibility() == 0) {
                                float[] fArr9 = new float[i4];
                                // fill-array-data instruction
                                fArr9[0] = 1.0f;
                                fArr9[1] = 0.0f;
                                arrayList7.add(ObjectAnimator.ofFloat(this.p1, (Property<ub8, Float>) property10, fArr9));
                            }
                            if (this.f1.getTag() != null) {
                                float[] fArr10 = new float[i4];
                                // fill-array-data instruction
                                fArr10[0] = 1.0f;
                                fArr10[1] = 0.0f;
                                arrayList7.add(ObjectAnimator.ofFloat(this.f1, (Property<c7, Float>) property10, fArr10));
                            }
                            if (this.g1.getTag() != null) {
                                float[] fArr11 = new float[i4];
                                // fill-array-data instruction
                                fArr11[0] = 1.0f;
                                fArr11[1] = 0.0f;
                                arrayList7.add(ObjectAnimator.ofFloat(this.g1, (Property<o96, Float>) property10, fArr11));
                            }
                            if (this.h1.getTag() != null) {
                                float[] fArr12 = new float[i4];
                                // fill-array-data instruction
                                fArr12[0] = 1.0f;
                                fArr12[1] = 0.0f;
                                arrayList7.add(ObjectAnimator.ofFloat(this.h1, (Property<y98, Float>) property10, fArr12));
                            }
                            this.p6.playTogether(arrayList7);
                            this.p6.setDuration(200L);
                            this.p6.addListener(new qa8(this, i, (byte) 0));
                            this.p6.start();
                        } else if (i == 5) {
                            if (this.p5.b.a() || (i2 = this.O4) < 0 || i2 >= arrayList4.size() || !(arrayList4.get(this.O4) instanceof jo6)) {
                                return;
                            }
                            jo6 jo6Var = (jo6) arrayList4.get(this.O4);
                            this.p6 = new AnimatorSet();
                            ArrayList arrayList8 = new ArrayList();
                            jp0 jp0Var9 = this.Q0;
                            Property property11 = View.TRANSLATION_Y;
                            arrayList8.add(ObjectAnimator.ofFloat(jp0Var9, (Property<jp0, Float>) property11, this.V1.getEditTextHeight() + jp0Var9.getHeight() + (this.s1 ? gm.L(58.0f) : 0)));
                            jp0 jp0Var10 = this.Q0;
                            Property property12 = View.ALPHA;
                            arrayList8.add(ObjectAnimator.ofFloat(jp0Var10, (Property<jp0, Float>) property12, 0.0f));
                            arrayList8.add(ObjectAnimator.ofFloat(this.T0, (Property<vi3, Float>) property11, gm.L(this.s1 ? 154.0f : 96.0f)));
                            arrayList8.add(ObjectAnimator.ofFloat(this.G, (Property<x20, Float>) property11, -r4.getHeight()));
                            arrayList8.add(ObjectAnimator.ofObject(this.k0, "backgroundColor", new ArgbEvaluator(), Integer.valueOf(color), Integer.valueOf(i16)));
                            int i26 = this.d2;
                            if (i26 == 0 || i26 == 4) {
                                arrayList8.add(ObjectAnimator.ofFloat(this.O0, (Property<CheckBox, Float>) property12, 1.0f, 0.0f));
                                arrayList8.add(ObjectAnimator.ofFloat(this.P0, (Property<CounterView, Float>) property12, 1.0f, 0.0f));
                            } else if (i26 == 1) {
                                arrayList8.add(ObjectAnimator.ofFloat(this.D1, (Property<x68, Float>) property12, 1.0f, 0.0f));
                            }
                            if (this.p1.getVisibility() == 0) {
                                arrayList8.add(ObjectAnimator.ofFloat(this.p1, (Property<ub8, Float>) property12, 1.0f, 0.0f));
                            }
                            if (this.f1.getTag() != null) {
                                arrayList8.add(ObjectAnimator.ofFloat(this.f1, (Property<c7, Float>) property12, 1.0f, 0.0f));
                            }
                            if (this.g1.getTag() != null) {
                                arrayList8.add(ObjectAnimator.ofFloat(this.g1, (Property<o96, Float>) property12, 1.0f, 0.0f));
                            }
                            if (this.h1.getTag() != null) {
                                arrayList8.add(ObjectAnimator.ofFloat(this.h1, (Property<y98, Float>) property12, 1.0f, 0.0f));
                            }
                            this.p5.setVisibility(0);
                            arrayList8.add(ObjectAnimator.ofFloat(this.p5, (Property<wb8, Float>) property12, 0.0f, 1.0f));
                            this.p6.playTogether(arrayList8);
                            this.p6.setDuration(200L);
                            this.p6.addListener(new qa8(this, i, (byte) 1));
                            this.p6.start();
                            p1();
                            this.p5.a(jo6Var, this.G2, this.w2);
                        }
                    }
                }
                lb8 lb8Var = this.f0;
                if (lb8Var != null) {
                    lb8Var.X();
                }
            }
        }
    }

    @Override // nu4
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

    @Override // nu4
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.Z5 == 1.0f || this.d2 == 11) {
            return false;
        }
        this.U6.abortAnimation();
        this.U6.fling(Math.round(this.W5), Math.round(this.X5), Math.round(f), Math.round(f2), (int) this.D6, (int) this.E6, (int) this.F6, (int) this.G6);
        this.f0.postInvalidate();
        return false;
    }

    @Override // nu4
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
    @Override // nu4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        boolean z;
        if (!this.H6 && !this.r6) {
            return f1(motionEvent);
        }
        lb8 lb8Var = this.f0;
        if (lb8Var != null && lb8Var.getTag() != null && this.X0[0] != null) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (x >= (i0(this.t4) - gm.L(100.0f)) / 2.0f) {
                if (x <= (gm.L(100.0f) + i0(this.t4)) / 2.0f && y >= (g0() - gm.L(100.0f)) / 2.0f) {
                    if (y <= (gm.L(100.0f) + g0()) / 2.0f) {
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

    public final String p0(int i) {
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
                        mb8 mb8Var = this.i7;
                        if (mb8Var != null) {
                            return mb8Var.c(i);
                        }
                    } else if (i < arrayList4.size()) {
                        Object obj = arrayList4.get(i);
                        if (obj instanceof no6) {
                            no6 no6Var = (no6) obj;
                            TLRPC.PhotoSize photoSize = no6Var.L;
                            if (photoSize != null) {
                                return bc4.r(null, photoSize);
                            }
                            TLRPC.Document document = no6Var.J;
                            if (document != null) {
                                return bc4.r(null, document);
                            }
                            return Utilities.a(no6Var.C) + "." + fn5.x(no6Var.C, "jpg");
                        }
                        if (obj instanceof TLRPC.BotInlineResult) {
                            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) obj;
                            TLRPC.Document document2 = botInlineResult.document;
                            if (document2 != null) {
                                return bc4.r(null, document2);
                            }
                            TLRPC.Photo photo = botInlineResult.photo;
                            if (photo != null) {
                                return bc4.r(null, bc4.w(photo.sizes, gm.Y0(false), false, null, false));
                            }
                            if (botInlineResult.content instanceof TLRPC.TL_webDocument) {
                                StringBuilder sb = new StringBuilder();
                                sb.append(Utilities.a(botInlineResult.content.url));
                                sb.append(".");
                                TLRPC.WebDocument webDocument2 = botInlineResult.content;
                                sb.append(fn5.x(webDocument2.url, bc4.H(webDocument2.mime_type)));
                                return sb.toString();
                            }
                        }
                    }
                } else if (arrayList2.isEmpty()) {
                    if (i < arrayList3.size()) {
                        TLRPC.Message message = ((k47) arrayList3.get(i)).k;
                        Pattern pattern = bc4.J;
                        if (message == null) {
                            return "";
                        }
                        if (message instanceof TLRPC.TL_messageService) {
                            TLRPC.Photo photo2 = message.action.photo;
                            if (photo2 == null) {
                                return "";
                            }
                            ArrayList<TLRPC.PhotoSize> arrayList5 = photo2.sizes;
                            return (arrayList5.size() <= 0 || (w3 = bc4.w(arrayList5, gm.Y0(false), false, null, false)) == null) ? "" : bc4.r(null, w3);
                        }
                        if (k47.n1(message) instanceof TLRPC.TL_messageMediaDocument) {
                            return bc4.r(null, k47.n1(message).document);
                        }
                        if (k47.n1(message) instanceof TLRPC.TL_messageMediaPhoto) {
                            ArrayList<TLRPC.PhotoSize> arrayList6 = k47.n1(message).photo.sizes;
                            return (arrayList6.size() <= 0 || (w2 = bc4.w(arrayList6, gm.Y0(true), false, null, true)) == null) ? "" : bc4.r(null, w2);
                        }
                        if (k47.n1(message) instanceof TLRPC.TL_messageMediaWebPage) {
                            if (k47.n1(message).webpage.document != null) {
                                return bc4.r(null, k47.n1(message).webpage.document);
                            }
                            if (k47.n1(message).webpage.photo == null) {
                                return "";
                            }
                            ArrayList<TLRPC.PhotoSize> arrayList7 = k47.n1(message).webpage.photo.sizes;
                            return (arrayList7.size() <= 0 || (w = bc4.w(arrayList7, gm.Y0(false), false, null, false)) == null) ? "" : bc4.r(null, w);
                        }
                        if (!(k47.n1(message) instanceof TLRPC.TL_messageMediaInvoice) || (webDocument = ((TLRPC.TL_messageMediaInvoice) k47.n1(message)).webPhoto) == null) {
                            return "";
                        }
                        return Utilities.a(webDocument.url) + "." + fn5.x(webDocument.url, bc4.H(webDocument.mime_type));
                    }
                } else if (i < arrayList2.size()) {
                    gn5 gn5Var = (gn5) arrayList2.get(i);
                    gn5 gn5Var2 = (gn5) this.a7.get(i);
                    if (gn5Var != null) {
                        if (gn5Var2 == null || gn5Var2 == gn5Var) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(gn5Var.f.volume_id);
                            sb2.append("_");
                            return hg9.k(sb2, gn5Var.f.local_id, ".jpg");
                        }
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(gn5Var2.f.volume_id);
                        sb3.append("_");
                        return hg9.k(sb3, gn5Var2.f.local_id, ".mp4");
                    }
                }
            } else if (i < arrayList.size()) {
                xw9 xw9Var = (xw9) arrayList.get(i);
                StringBuilder sb4 = new StringBuilder();
                sb4.append(xw9Var.b.dc_id);
                sb4.append("_");
                return kt6.q(sb4, xw9Var.b.id, ".jpg");
            }
        }
        return null;
    }

    public final void p1() {
        ndc ndcVar = this.G2;
        if (ndcVar != null) {
            ndcVar.f0();
            return;
        }
        ya8 ya8Var = this.g0;
        if (ya8Var != null) {
            ya8Var.e();
        }
    }

    public final void p2(int i, boolean z) {
        if (this.S4 != null) {
            w1(false);
            bc4.G(this.U).f(this.S4.F0());
        } else if (this.h5 != null) {
            TLObject d = this.i7.d(this.O4);
            if (d instanceof TLRPC.Document) {
                w1(false);
                bc4.G(this.U).f((TLRPC.Document) d);
            }
        }
        td5 td5Var = this.m1;
        if (td5Var != null) {
            td5Var.setAnimateBackground(true);
        }
        this.Y2 = false;
        L1(z, true, false, this.O4 + i);
        if (a2(this.S4) || Z1(this.O4)) {
            this.Y2 = true;
            Y0(true);
            u(0, true);
        }
        s();
        try {
            fp.b(0);
            if (hi2.v().D()) {
                hi2.v().Q(k0());
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    public final void q(boolean z) {
        if (z) {
            bd8 bd8Var = this.w3;
            if (bd8Var != null) {
                bd8Var.getViewTreeObserver().addOnPreDrawListener(new fb(this, (byte) 8));
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
            oa8 oa8Var = this.z2;
            if (oa8Var != null) {
                int[] iArr = this.A3;
                oa8Var.getLocationInWindow(iArr);
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
                kb8 kb8Var = this.F2;
                if (kb8Var != null) {
                    kb8Var.setTranslationX(view.getTranslationX());
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new h88(this, (byte) 5));
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
                arrayList.add(ObjectAnimator.ofInt(this.M0, so.d, nm7.d4));
                kb8 kb8Var2 = this.F2;
                if (kb8Var2 != null) {
                    arrayList.add(ObjectAnimator.ofFloat(kb8Var2, (Property<kb8, Float>) property, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(this.F2, (Property<kb8, Float>) property2, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(this.F2, (Property<kb8, Float>) property3, x));
                    arrayList.add(ObjectAnimator.ofFloat(this.F2, (Property<kb8, Float>) property4, y));
                }
                u0(false);
                view.getWidth();
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.addUpdateListener(new pl(this, view, (byte) 18));
                arrayList.add(ofFloat2);
                animatorSet.playTogether(arrayList);
                DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator();
                animatorSet.setInterpolator(decelerateInterpolator);
                animatorSet.setDuration(250L);
                SurfaceView surfaceView = this.D2;
                if (surfaceView != null) {
                    surfaceView.setVisibility(0);
                }
                animatorSet.addListener(new ga8(this, view, b));
                animatorSet.start();
                cb8 cb8Var = new cb8();
                cb8Var.c = false;
                cb8Var.d = false;
                cb8Var.a = (short) 250;
                cb8Var.b = decelerateInterpolator;
                u2(true, true, cb8Var);
                this.G3 = (byte) 0;
            }
        }
    }

    public final gn5 q0(int i, long[] jArr) {
        if (i >= 0) {
            ArrayList arrayList = this.d7;
            if (arrayList.isEmpty()) {
                ArrayList arrayList2 = this.Z6;
                if (arrayList2.isEmpty()) {
                    ArrayList arrayList3 = this.X6;
                    if (!arrayList3.isEmpty() && i < arrayList3.size()) {
                        k47 k47Var = (k47) arrayList3.get(i);
                        TLRPC.Message message = k47Var.k;
                        if (!(message instanceof TLRPC.TL_messageService)) {
                            TLRPC.MessageMedia messageMedia = k47Var.a1;
                            if (messageMedia != null) {
                                TLRPC.Document document = messageMedia.document;
                                if (document != null) {
                                    return gn5.b(document);
                                }
                                TLRPC.Photo photo = messageMedia.photo;
                                if (photo != null) {
                                    TLRPC.PhotoSize w = bc4.w(photo.sizes, gm.Y0(false), false, null, true);
                                    if (w != null) {
                                        if (jArr != null) {
                                            long j = w.size;
                                            jArr[0] = j;
                                            if (j == 0) {
                                                jArr[0] = -1;
                                            }
                                        }
                                        return gn5.f(w, k47Var.a1.photo);
                                    }
                                    if (jArr != null) {
                                        jArr[0] = -1;
                                        return null;
                                    }
                                }
                            } else if ((!(k47.n1(message) instanceof TLRPC.TL_messageMediaPhoto) || k47.n1(k47Var.k).photo == null) && (!(k47.n1(k47Var.k) instanceof TLRPC.TL_messageMediaWebPage) || k47.n1(k47Var.k).webpage == null)) {
                                if (k47.n1(k47Var.k) instanceof TLRPC.TL_messageMediaInvoice) {
                                    return gn5.p(vuc.c(((TLRPC.TL_messageMediaInvoice) k47.n1(k47Var.k)).webPhoto));
                                }
                                if (k47Var.F0() != null) {
                                    TLRPC.Document F0 = k47Var.F0();
                                    if (this.B5 == 5) {
                                        return gn5.b(F0);
                                    }
                                    if (k47.W2(k47Var.F0())) {
                                        TLRPC.PhotoSize w2 = bc4.w(F0.thumbs, 90, false, null, false);
                                        if (jArr != null) {
                                            long j2 = w2.size;
                                            jArr[0] = j2;
                                            if (j2 == 0) {
                                                jArr[0] = -1;
                                            }
                                        }
                                        return gn5.c(w2, F0);
                                    }
                                }
                            } else {
                                if (k47.t3(k47Var.k)) {
                                    return gn5.b(k47Var.F0());
                                }
                                TLRPC.PhotoSize w3 = bc4.w(k47Var.p0, gm.Y0(true), false, null, true);
                                if (w3 != null) {
                                    if (jArr != null) {
                                        long j3 = w3.size;
                                        jArr[0] = j3;
                                        if (j3 == 0) {
                                            jArr[0] = -1;
                                        }
                                    }
                                    return gn5.f(w3, k47Var.n0);
                                }
                                if (jArr != null) {
                                    jArr[0] = -1;
                                    return null;
                                }
                            }
                        } else if (!(message.action instanceof TLRPC.TL_messageActionUserUpdatedPhoto)) {
                            TLRPC.PhotoSize w4 = bc4.w(k47Var.p0, gm.Y0(false), false, null, false);
                            if (w4 != null) {
                                if (jArr != null) {
                                    long j4 = w4.size;
                                    jArr[0] = j4;
                                    if (j4 == 0) {
                                        jArr[0] = -1;
                                    }
                                }
                                return gn5.f(w4, k47Var.n0);
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
                    return (gn5) this.a7.get(i);
                }
            } else if (i < arrayList.size()) {
                if (jArr != null) {
                    jArr[0] = ((xw9) arrayList.get(i)).b.size;
                }
                xw9 xw9Var = (xw9) arrayList.get(i);
                if (xw9Var == null) {
                    return null;
                }
                gn5 gn5Var = new gn5();
                gn5Var.h = xw9Var;
                return gn5Var;
            }
        }
        return null;
    }

    public final void q1(boolean z) {
        p09 y;
        ib8 ib8Var = this.W4;
        ArrayList arrayList = ib8Var.e;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                pcc pccVar = (pcc) ib8Var.e.get(i);
                if (pccVar.a == 0 && (pccVar.b & 1) != 0) {
                    View view = pccVar.I;
                    if ((view instanceof bf0) && (y = ((bf0) view).getImageReceiver().y()) != null) {
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
        x68 x68Var = this.D1;
        if (x68Var != null) {
            x68Var.setVisibility(4);
        }
        this.p1.setVisibility(8);
        this.p1.setAlpha(0.0f);
        this.p1.setTranslationY(-gm.L(10.0f));
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
        ib8 ib8Var = this.W4;
        if (n != null) {
            int q = this.B4.q();
            int o = this.B4.o();
            if (this.d2 == 1) {
                float L = gm.L(12.0f);
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
                    this.d6 = z1(false) * (Math.min(i0(3) / f3, f0(3, false) / f4) / Math.min(i0(this.t4) / f3, g0() / f4));
                    Rect rect = this.t2;
                    this.b6 = (rect.left / 2) - (rect.right / 2);
                    this.m6 = System.currentTimeMillis();
                    this.Q6 = true;
                }
                i = o;
                float f32 = q;
                float f42 = i;
                this.d6 = z1(false) * (Math.min(i0(3) / f32, f0(3, false) / f42) / Math.min(i0(this.t4) / f32, g0() / f42));
                Rect rect2 = this.t2;
                this.b6 = (rect2.left / 2) - (rect2.right / 2);
                this.m6 = System.currentTimeMillis();
                this.Q6 = true;
            } else {
                f = 0.0f;
                float f5 = (-gm.L(44.0f)) + (!this.s ? gm.m / 2 : 0);
                this.c6 = f5;
                if (this.M1 != null) {
                    float additionalTop = (r13.getAdditionalTop() / 2.0f) + f5;
                    this.c6 = additionalTop;
                    this.c6 = additionalTop - (this.M1.getAdditionalBottom() / 2.0f);
                }
                ao6 ao6Var = ib8Var.c;
                if (ao6Var != null) {
                    int i4 = ao6Var.k;
                    if (i4 == 90 || i4 == 270) {
                        o = q;
                        q = o;
                    }
                    q = (int) (q * ao6Var.e);
                    i = (int) (o * ao6Var.f);
                    float f322 = q;
                    float f422 = i;
                    this.d6 = z1(false) * (Math.min(i0(3) / f322, f0(3, false) / f422) / Math.min(i0(this.t4) / f322, g0() / f422));
                    Rect rect22 = this.t2;
                    this.b6 = (rect22.left / 2) - (rect22.right / 2);
                    this.m6 = System.currentTimeMillis();
                    this.Q6 = true;
                }
                i = o;
                float f3222 = q;
                float f4222 = i;
                this.d6 = z1(false) * (Math.min(i0(3) / f3222, f0(3, false) / f4222) / Math.min(i0(this.t4) / f3222, g0() / f4222));
                Rect rect222 = this.t2;
                this.b6 = (rect222.left / 2) - (rect222.right / 2);
                this.m6 = System.currentTimeMillis();
                this.Q6 = true;
            }
        } else {
            f = 0.0f;
        }
        sa8 sa8Var = this.M1;
        if (sa8Var != null) {
            sa8Var.setDrawShadow(this.d2 == 11 && (ib8Var == null || ib8Var.c == null));
        }
        this.h0.setClipChildren(true);
        this.k0.setVisibility(4);
        this.o6 = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(gm.L(126.0f), f);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(-gm.L(12.0f), f);
        ofFloat.addUpdateListener(new h88(this, (byte) 7));
        ofFloat2.addUpdateListener(new h88(this, b));
        this.o6.playTogether(ObjectAnimator.ofFloat(this, so.g, 0.0f, 1.0f), ofFloat, ofFloat2);
        this.M1.o0(true);
        this.o6.setDuration(200L);
        this.o6.addListener(new ha8(this, b2));
        this.o6.start();
    }

    public final void r() {
        qb8 qb8Var = this.c5;
        if (qb8Var != null) {
            qb8Var.a.v0(true, true);
        }
        pb8 pb8Var = this.d;
        qb8 qb8Var2 = null;
        if (pb8Var != null) {
            k47 k47Var = this.S4;
            gn5 gn5Var = this.Y4;
            qb8Var2 = pb8Var.N(k47Var, gn5Var != null ? gn5Var.f : null, this.O4, false, false);
        }
        this.c5 = qb8Var2;
        if (qb8Var2 == null || qb8Var2.s) {
            return;
        }
        qb8Var2.a.v0(false, true);
    }

    public final void r1() {
        ndc ndcVar = this.G2;
        if (ndcVar != null) {
            ndcVar.g0();
            return;
        }
        ya8 ya8Var = this.g0;
        if (ya8Var != null) {
            ya8Var.f();
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
        j88 j88Var;
        char c2;
        boolean z;
        yv1 yv1Var;
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
        gm.r(this.y2);
        qb8 qb8Var = this.c5;
        byte b2 = 5;
        if (qb8Var != null) {
            ImageReceiver imageReceiver = qb8Var.a;
            if (!imageReceiver.R0) {
                imageReceiver.v0(true, true);
                kn m = this.c5.a.m();
                if (m != null) {
                    Bitmap m2 = m.m();
                    if (m2 != null) {
                        try {
                            if (this.E2) {
                                Bitmap createBitmap = Bitmap.createBitmap(m2);
                                gm.z0(this.D2, createBitmap, new a18(m, createBitmap, b2));
                            } else {
                                Bitmap bitmap = this.C2.getBitmap(m2.getWidth(), m2.getHeight());
                                new Canvas(m2).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                                bitmap.recycle();
                            }
                        } catch (Throwable th) {
                            fc4.g(th, true);
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
        o49 u0 = u0(true);
        View view = this.E2 ? this.D2 : this.C2;
        float width = u0.c / view.getWidth();
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
        final float f3 = u0.a;
        final float x = (f3 - this.z2.getX()) + this.t2.left;
        final float f4 = u0.b;
        final float y = f4 - this.z2.getY();
        fa8 fa8Var = new fa8(ofFloat, width, b);
        AnimatorSet animatorSet2 = new AnimatorSet();
        j88 j88Var2 = new j88(this, view, fa8Var, f2, translationY, animatorSet2);
        final float f5 = translationY;
        final View view2 = view;
        if (this.D2 != null) {
            this.G2.d.V(false);
            if (this.E2) {
                int width2 = this.D2.getWidth();
                int height = this.D2.getHeight();
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                Bitmap a = ld1.a(width2, height);
                boolean[] zArr = new boolean[1];
                c2 = 5;
                SurfaceView surfaceView = this.D2;
                animatorSet = animatorSet2;
                c = 4;
                jy6 jy6Var = new jy6(this, a, zArr, j88Var2, (byte) 19);
                j88Var = j88Var2;
                gm.z0(surfaceView, a, jy6Var);
                gm.d3(new ud7((Object) this, (Object) zArr, (Object) j88Var, (byte) 23), 600L);
                z = true;
                j88 j88Var3 = j88Var;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: k88
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
                        kb8 kb8Var = photoViewer.F2;
                        if (kb8Var != null) {
                            kb8Var.setTranslationX(view3.getTranslationX());
                            photoViewer.F2.setTranslationY(view3.getTranslationY());
                            photoViewer.F2.setScaleX(view3.getScaleX());
                            photoViewer.F2.setScaleY(view3.getScaleY());
                            photoViewer.F2.invalidateOutline();
                        }
                    }
                });
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.addUpdateListener(new h88(this, (byte) 1));
                ImageView imageView = this.x3;
                Property property = View.SCALE_X;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, width);
                ImageView imageView2 = this.x3;
                Property property2 = View.SCALE_Y;
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property2, width);
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, width);
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) property2, width);
                ObjectAnimator ofInt = ObjectAnimator.ofInt(this.M0, so.d, 0);
                Animator[] animatorArr = new Animator[7];
                animatorArr[0] = ofFloat2;
                animatorArr[1] = ofFloat3;
                animatorArr[2] = ofFloat4;
                animatorArr[3] = ofFloat5;
                animatorArr[c] = ofFloat6;
                animatorArr[c2] = ofInt;
                animatorArr[6] = ofFloat;
                AnimatorSet animatorSet3 = animatorSet;
                animatorSet3.playTogether(animatorArr);
                animatorSet3.setInterpolator(new DecelerateInterpolator());
                animatorSet3.setDuration(250L);
                animatorSet3.addListener(new ga8(this, view2, b));
                if (!z) {
                    j88Var3.run();
                }
                cb8 cb8Var = new cb8();
                cb8Var.c = false;
                cb8Var.d = false;
                cb8Var.a = (short) 250;
                cb8Var.b = new DecelerateInterpolator();
                u2(false, true, cb8Var);
                yv1Var = this.k4;
                if (yv1Var != null || yv1Var.getFragmentView() == null) {
                }
                this.k4.getFragmentView().invalidate();
                return;
            }
            animatorSet = animatorSet2;
            c = 4;
            j88Var = j88Var2;
            c2 = 5;
            this.x3.setVisibility(0);
            this.D2.setVisibility(4);
        } else {
            animatorSet = animatorSet2;
            c = 4;
            j88Var = j88Var2;
            c2 = 5;
        }
        z = false;
        j88 j88Var32 = j88Var;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: k88
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
                kb8 kb8Var = photoViewer.F2;
                if (kb8Var != null) {
                    kb8Var.setTranslationX(view3.getTranslationX());
                    photoViewer.F2.setTranslationY(view3.getTranslationY());
                    photoViewer.F2.setScaleX(view3.getScaleX());
                    photoViewer.F2.setScaleY(view3.getScaleY());
                    photoViewer.F2.invalidateOutline();
                }
            }
        });
        ValueAnimator ofFloat22 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat22.addUpdateListener(new h88(this, (byte) 1));
        ImageView imageView3 = this.x3;
        Property property3 = View.SCALE_X;
        ObjectAnimator ofFloat32 = ObjectAnimator.ofFloat(imageView3, (Property<ImageView, Float>) property3, width);
        ImageView imageView22 = this.x3;
        Property property22 = View.SCALE_Y;
        ObjectAnimator ofFloat42 = ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property22, width);
        ObjectAnimator ofFloat52 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) property3, width);
        ObjectAnimator ofFloat62 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) property22, width);
        ObjectAnimator ofInt2 = ObjectAnimator.ofInt(this.M0, so.d, 0);
        Animator[] animatorArr2 = new Animator[7];
        animatorArr2[0] = ofFloat22;
        animatorArr2[1] = ofFloat32;
        animatorArr2[2] = ofFloat42;
        animatorArr2[3] = ofFloat52;
        animatorArr2[c] = ofFloat62;
        animatorArr2[c2] = ofInt2;
        animatorArr2[6] = ofFloat;
        AnimatorSet animatorSet32 = animatorSet;
        animatorSet32.playTogether(animatorArr2);
        animatorSet32.setInterpolator(new DecelerateInterpolator());
        animatorSet32.setDuration(250L);
        animatorSet32.addListener(new ga8(this, view2, b));
        if (!z) {
        }
        cb8 cb8Var2 = new cb8();
        cb8Var2.c = false;
        cb8Var2.d = false;
        cb8Var2.a = (short) 250;
        cb8Var2.b = new DecelerateInterpolator();
        u2(false, true, cb8Var2);
        yv1Var = this.k4;
        if (yv1Var != null) {
        }
    }

    public final void s() {
        k47 k47Var;
        TextureView textureView;
        TextureView textureView2;
        k47 k47Var2;
        ArrayList arrayList = this.X6;
        boolean isEmpty = arrayList.isEmpty();
        ImageView[] imageViewArr = this.y3;
        if (isEmpty || ((k47Var = this.S4) != null && k47Var.q4())) {
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
                k47 k47Var3 = (k47) arrayList.get(i3);
                if (k47.K4(k47Var3.k) || k47Var3.d5()) {
                    boolean z = k47Var3.d5() && (k47Var2 = this.S4) != null && k47Var2.e1() == k47Var3.e1();
                    int measuredWidth = z ? k47Var3.k.media.webpage.embed_width : (i2 != 0 || (textureView = this.C2) == null) ? 0 : textureView.getMeasuredWidth();
                    int measuredHeight = z ? k47Var3.k.media.webpage.embed_height : (i2 != 0 || (textureView2 = this.C2) == null) ? 0 : textureView2.getMeasuredHeight();
                    TLRPC.Document F0 = k47Var3.F0();
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
                    Point point = gm.q;
                    if (point.y > point.x && measuredWidth > measuredHeight) {
                        if (imageViewArr[i2].getVisibility() != 0) {
                            imageViewArr[i2].setVisibility(0);
                        }
                        if (this.K) {
                            imageViewArr[i2].setAlpha(1.0f);
                        }
                        ((FrameLayout.LayoutParams) imageViewArr[i2].getLayoutParams()).topMargin = ((this.f0.getMeasuredHeight() + ((int) (measuredHeight / (measuredWidth / this.f0.getMeasuredWidth())))) / 2) - gm.L(48.0f);
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
                            f2 = (f - this.E6) + ((-point.x) - gm.L(15.0f));
                        } else {
                            float f3 = this.D6;
                            if (f < f3) {
                                f2 = f - f3;
                            }
                        }
                    }
                    imageViewArr[i2].setTranslationX((f2 + point.x) - gm.L(48.0f));
                } else {
                    imageViewArr[i2].setVisibility(4);
                }
            }
            i2++;
        }
    }

    public final int s0() {
        return this.t2.left;
    }

    public final void s2() {
        AtomicInteger atomicInteger;
        f07 e;
        f07 e2;
        f07 e3;
        if (V0()) {
            this.T8 = true;
            ndc ndcVar = this.G2;
            if (ndcVar != null) {
                ndcVar.s0(fp.w() || this.r);
            }
            if (this.G2 != null && fp.w() && ((atomicInteger = fp.b) == null || atomicInteger.get() <= 0)) {
                k89 e4 = fp.e();
                long a = e4 == null ? -1L : e4.a();
                if (a >= 0 && Math.abs(this.G2.S() - a) > 1000) {
                    this.G2.o0(a);
                }
                k89 e5 = fp.e();
                boolean m = e5 == null ? false : !fp.a ? !e5.l() : e5.m();
                ndc ndcVar2 = this.G2;
                if (m) {
                    ndcVar2.g0();
                } else {
                    ndcVar2.f0();
                }
                if (this.F != null) {
                    float g = fp.g();
                    k89 e6 = fp.e();
                    float f = 0.5f;
                    if (Math.abs(g - ((e6 == null || (e3 = e6.e()) == null) ? 0.5f : (float) e3.r)) > 0.05f) {
                        AudioManager audioManager = (AudioManager) this.F.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
                        int streamMinVolume = Build.VERSION.SDK_INT >= 28 ? audioManager.getStreamMinVolume(3) : 0;
                        float f2 = streamMaxVolume - streamMinVolume;
                        k89 e7 = fp.e();
                        if (e7 != null && (e2 = e7.e()) != null) {
                            f = (float) e2.r;
                        }
                        int i = streamMinVolume + ((int) (f * f2));
                        if (i != audioManager.getStreamVolume(3)) {
                            audioManager.setStreamVolume(3, i, 1);
                        }
                    }
                }
                k89 e8 = fp.e();
                float f3 = 1.0f;
                if (e8 != null && (e = e8.e()) != null) {
                    f3 = (float) e.d;
                }
                w(true, false, f3);
            }
            ai2 ai2Var = this.x0;
            if (ai2Var != null) {
                ai2Var.a(fp.w());
            }
            this.T8 = false;
        }
    }

    public void setAnimationValue(float f) {
        this.k6 = f;
        this.f0.invalidate();
        H0();
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
    public final void t(boolean z) {
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

    public final TLRPC.Document t0() {
        int i;
        if (this.W5 != 0.0f || this.X5 != 0.0f || (i = this.O4) < 0) {
            return null;
        }
        ArrayList arrayList = this.f7;
        if (i >= arrayList.size()) {
            return null;
        }
        Object obj = arrayList.get(this.O4);
        if (!(obj instanceof co6)) {
            return null;
        }
        co6 co6Var = (co6) obj;
        if (co6Var.v || co6Var.w || co6Var.u) {
            return null;
        }
        return this.z7;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t1(ArrayList arrayList, Uri uri, boolean z, boolean z2, lo6 lo6Var, boolean z3, long j) {
        boolean z4;
        float f;
        Boolean bool;
        mb8 mb8Var;
        boolean z5;
        k47 k47Var;
        TLRPC.BotInlineResult botInlineResult;
        mb8 mb8Var2;
        k47 k47Var2;
        kdc kdcVar;
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
            tv3 tv3Var = new tv3(b, org.telegram.messenger.a.b, this);
            this.W3 = tv3Var;
            boolean canDetectOrientation = tv3Var.canDetectOrientation();
            tv3 tv3Var2 = this.W3;
            if (canDetectOrientation) {
                tv3Var2.enable();
            } else {
                tv3Var2.disable();
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
        ad8 ad8Var = this.U8;
        if (ad8Var != null && ad8Var.c == 0) {
            this.U8 = null;
            ad8Var.g();
        }
        if (this.G2 == null) {
            ndc ndcVar = this.S2;
            if (ndcVar != null) {
                this.G2 = ndcVar;
                this.S2 = null;
                this.U2 = true;
                M2(this.G2.d.h(), ndcVar.d.s());
                z6 = false;
            } else {
                la8 la8Var = new la8(this, z7 ? (byte) 1 : (byte) 0);
                this.G2 = la8Var;
                la8Var.i0 = new n88(this, (byte) 27);
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
            kb8 kb8Var = this.F2;
            if (kb8Var != null) {
                kb8Var.c = false;
                kb8Var.d = false;
                if (kb8Var.b) {
                    kb8Var.a++;
                    kb8Var.b = false;
                }
                kb8Var.setImageResource(android.R.color.transparent);
            }
            this.G2.K = new m41((Object) this, (byte) 9);
            z4 = z6;
        } else {
            z4 = false;
        }
        if (!this.f7.isEmpty()) {
            I(lo6Var);
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
        kw7 kw7Var = this.x4;
        if (kw7Var != null) {
            kw7Var.setAlpha(this.N3);
        }
        this.b3 = null;
        this.c3 = null;
        this.d3 = 0L;
        if (z4) {
            this.a3 = this.e3;
            this.q3.h(false, 0.0f);
            x98 x98Var = this.X7;
            x98Var.setProgress(x98Var.getLeftProgress());
            this.q3.f(0.0f);
            k47 k47Var3 = this.S4;
            if (k47Var3 != null) {
                int L0 = (int) k47Var3.L0();
                String V0 = this.S4.V0();
                if (!TextUtils.isEmpty(V0)) {
                    if (L0 >= 10) {
                        sb8 sb8Var = (sb8) f9.get(V0);
                        k47 k47Var4 = this.S4;
                        if (k47Var4.c0 < 0.0f && sb8Var != null) {
                            float f3 = sb8Var.a;
                            if (f3 > 0.0f && f3 < 0.999f) {
                                k47Var4.c0 = f3;
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
            ndc ndcVar2 = this.G2;
            if (arrayList != null) {
                k47 k47Var5 = this.S4;
                int i = ndc.k0;
                if (k47Var5 != null) {
                    long B0 = k47.B0(k47Var5.k);
                    int e1 = k47Var5.e1();
                    String string = org.telegram.messenger.a.b.getSharedPreferences("media_saved_pos", 0).getString(B0 + "_" + e1 + "q2", "");
                    if (!TextUtils.isEmpty(string)) {
                        int size = arrayList.size();
                        int i2 = 0;
                        while (i2 < size) {
                            Object obj = arrayList.get(i2);
                            i2++;
                            kdcVar = (kdc) obj;
                            StringBuilder sb = new StringBuilder();
                            f = f2;
                            sb.append(kdcVar.b);
                            sb.append("x");
                            sb.append(kdcVar.c);
                            sb.append(kdcVar.a ? "s" : "");
                            if (TextUtils.equals(string, sb.toString())) {
                                break;
                            } else {
                                f2 = f;
                            }
                        }
                    }
                }
                f = f2;
                kdcVar = null;
                ndcVar2.j0(arrayList, kdcVar);
            } else {
                f = 0.0f;
                ndcVar2.h0(j, uri, "other");
            }
            L2();
            h74 h74Var = this.G2.d;
            if (h74Var != null) {
                na8 na8Var = new na8(this);
                h74Var.y1();
                af8 U0 = h74Var.U0(h74Var.x);
                jte.p(!U0.f);
                U0.c = (byte) 7;
                jte.p(!U0.f);
                U0.d = na8Var;
                U0.b();
            }
            N2();
            this.G2.t0(z);
            if (!this.s4) {
                W();
            }
        } else {
            f = 0.0f;
        }
        k47 k47Var6 = this.S4;
        int i3 = ndc.k0;
        if (k47Var6 != null) {
            SharedPreferences sharedPreferences = org.telegram.messenger.a.b.getSharedPreferences("media_saved_pos", 0);
            String str = k47.B0(k47Var6.k) + "_" + k47Var6.e1() + "loop";
            if (sharedPreferences.contains(str)) {
                bool = Boolean.valueOf(sharedPreferences.getBoolean(str, false));
                if (!z3) {
                    this.Z2 = false;
                    z5 = false;
                } else if (bool != null) {
                    z5 = bool.booleanValue();
                    this.Z2 = z5;
                } else {
                    k47 k47Var7 = this.S4;
                    z5 = (k47Var7 != null && k47Var7.L0() <= 30.0d) || ((mb8Var = this.i7) != null && mb8Var.e(this.O4));
                    this.Z2 = z5;
                }
                this.i3.c(z5);
                this.G2.r0(this.Z2);
                this.t0.f(this.Z2);
                this.t0.setSelectorColor(!this.Z2 ? 259241196 : 268435455);
                k47Var = this.S4;
                if (k47Var != null) {
                    float f5 = k47Var.c0;
                    if (f5 >= f) {
                        this.a3 = f5;
                        k47Var.c0 = -1.0f;
                    }
                }
                botInlineResult = this.X4;
                if (botInlineResult == null && (botInlineResult.type.equals(MediaStreamTrack.VIDEO_TRACK_KIND) || k47.J4(this.X4.document))) {
                    this.j0.setVisibility(0);
                    this.j0.setPadding(0, 0, gm.L(84.0f), 0);
                    this.Q0.setVisibility(8);
                } else {
                    this.j0.setPadding(0, 0, 0, 0);
                }
                if (this.i7 != null) {
                    this.j0.setVisibility(0);
                }
                mb8Var2 = this.i7;
                if (mb8Var2 == null && mb8Var2.e(this.O4) && !this.i7.a(this.O4)) {
                    Y1(false, true);
                } else {
                    if (!this.s1 && !z3) {
                        z7 = true;
                    }
                    Y1(z7, true);
                }
                if (!this.s1) {
                    int i4 = this.Y2 ? 3000 : 1000;
                    z98 z98Var = this.y2;
                    if (!J0() && ((k47Var2 = this.S4) == null || !k47Var2.q4())) {
                        gm.r(z98Var);
                        gm.d3(z98Var, i4);
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
        k47Var = this.S4;
        if (k47Var != null) {
        }
        botInlineResult = this.X4;
        if (botInlineResult == null) {
        }
        this.j0.setPadding(0, 0, 0, 0);
        if (this.i7 != null) {
        }
        mb8Var2 = this.i7;
        if (mb8Var2 == null) {
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
        u2(z, z2, cb8.e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v40, types: [k47] */
    /* JADX WARN: Type inference failed for: r7v6, types: [k47] */
    public final void u(final int i, final boolean z) {
        boolean z2;
        final boolean z3;
        final boolean z4;
        cz6 cz6Var;
        final File file;
        final cz6 cz6Var2;
        File file2;
        File J;
        File J2;
        boolean z5;
        kn knVar;
        int i2 = this.O4;
        int i3 = i == 1 ? i2 + 1 : i == 2 ? i2 - 1 : i2;
        if (this.b5[i] == null) {
            if (!this.f7.isEmpty() && i3 >= 0 && i3 < this.f7.size()) {
                Object obj = this.f7.get(i3);
                if (obj instanceof jo6) {
                    jo6 jo6Var = (jo6) obj;
                    if (jo6Var.b && (!jo6Var.d() || (!jo6Var.j() && this.d2 != 11))) {
                        this.X0[i].d(3, z, true);
                        return;
                    }
                }
            }
            this.X0[i].d(-1, z, true);
            return;
        }
        boolean s = (i == 0 && i2 == 0 && (knVar = this.k2) != null) ? knVar.s() : false;
        File file3 = null;
        if (this.S4 == null) {
            if (this.X4 == null) {
                if (this.Y4 != null) {
                    if (i3 < 0 || i3 >= this.a7.size()) {
                        this.X0[i].d(-1, z, true);
                        return;
                    }
                    gn5 gn5Var = (gn5) this.a7.get(i3);
                    if (gn5Var != null) {
                        bc4.G(this.U);
                        J = bc4.J(gn5Var.f, o0(gn5Var), false, true);
                        bc4.G(this.U);
                        J2 = bc4.J(gn5Var.f, o0(gn5Var), true, true);
                    } else {
                        J2 = null;
                        J = null;
                    }
                } else if (this.a5 != null) {
                    if (i3 < 0 || i3 >= this.d7.size()) {
                        this.X0[i].d(-1, z, true);
                        return;
                    }
                    xw9 xw9Var = (xw9) this.d7.get(i3);
                    bc4.G(this.U);
                    J = bc4.J(xw9Var, null, true, true);
                    bc4.G(this.U);
                    J2 = bc4.J(xw9Var, null, false, true);
                } else if (this.d5 != null) {
                    file2 = new File(bc4.z(3), this.b5[i]);
                    file = new File(bc4.z(4), this.b5[i]);
                    z2 = false;
                    z3 = false;
                    z4 = false;
                } else {
                    mb8 mb8Var = this.i7;
                    if (mb8Var != null) {
                        File b = mb8Var.b(i3);
                        boolean z6 = this.i7.a(i3) || this.i7.e(i3);
                        z4 = z6;
                        z3 = z6 && gda.x0 && (this.i7.d(i3) instanceof TLRPC.Document);
                        cz6Var2 = null;
                        z2 = Z1(i3);
                        file3 = b;
                        cz6Var = null;
                        file = null;
                    } else {
                        z2 = false;
                        z3 = false;
                        z4 = false;
                        cz6Var = null;
                        file = null;
                        cz6Var2 = null;
                    }
                }
                z2 = false;
                z3 = false;
                z4 = false;
                cz6Var2 = null;
                file3 = J;
                file = J2;
                cz6Var = cz6Var2;
            } else {
                if (i3 < 0 || i3 >= this.f7.size()) {
                    this.X0[i].d(-1, z, true);
                    return;
                }
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) this.f7.get(i3);
                if (botInlineResult.type.equals(MediaStreamTrack.VIDEO_TRACK_KIND) || k47.J4(botInlineResult.document)) {
                    if (botInlineResult.document != null) {
                        bc4.G(this.U);
                        file2 = bc4.I(botInlineResult.document);
                    } else if (botInlineResult.content instanceof TLRPC.TL_webDocument) {
                        file2 = new File(bc4.z(4), Utilities.a(botInlineResult.content.url) + "." + fn5.x(botInlineResult.content.url, "mp4"));
                    } else {
                        file2 = null;
                    }
                    z5 = true;
                } else {
                    if (botInlineResult.document != null) {
                        file2 = new File(bc4.z(3), this.b5[i]);
                    } else if (botInlineResult.photo != null) {
                        file2 = new File(bc4.z(0), this.b5[i]);
                    } else {
                        z5 = false;
                        file2 = null;
                    }
                    z5 = false;
                }
                z2 = false;
                z3 = false;
                z4 = z5;
                file = new File(bc4.z(4), this.b5[i]);
            }
            cz6Var2 = null;
            file3 = file2;
            cz6Var = cz6Var2;
        } else {
            if (i3 < 0 || i3 >= this.X6.size()) {
                this.X0[i].d(-1, z, true);
                return;
            }
            ?? r4 = (k47) this.X6.get(i3);
            z2 = a2(r4);
            if (this.B5 == 1 && !r4.x()) {
                this.X0[i].d(-1, z, true);
                return;
            }
            File file4 = !TextUtils.isEmpty(r4.k.attachPath) ? new File(r4.k.attachPath) : null;
            cz6 cz6Var3 = ((k47.n1(r4.k) instanceof TLRPC.TL_messageMediaWebPage) && k47.n1(r4.k).webpage != null && k47.n1(r4.k).webpage.document == null) ? new cz6((Object) this, (Object) n0(i3, null), (byte) 18) : new cz6((Object) this, (Object) r4.k, (byte) 19);
            if (k47.K4(r4.k)) {
                cz6 cz6Var4 = cz6Var3;
                z3 = (gda.x0 && r4.B() && !pg3.B(k47.B0(r4.k))) || r4.D2(true);
                cz6Var = r4;
                file = null;
                file3 = file4;
                cz6Var2 = cz6Var4;
                z4 = true;
            } else {
                z4 = false;
                cz6Var = r4;
                file = null;
                file3 = file4;
                cz6Var2 = cz6Var3;
                z3 = false;
            }
        }
        final boolean z7 = !(i == 0 && this.k5) && z2;
        final File file5 = file3;
        final ?? r7 = cz6Var;
        final boolean z8 = s;
        Utilities.e.c(new Runnable() { // from class: z88
            @Override // java.lang.Runnable
            public final void run() {
                k47 k47Var;
                yv1 yv1Var;
                TLRPC.Document F0;
                Drawable[] drawableArr = PhotoViewer.d9;
                boolean z9 = z8;
                final File file6 = file5;
                if (!z9 && file6 != null) {
                    z9 = file6.exists();
                }
                File file7 = file;
                cz6 cz6Var5 = cz6Var2;
                File file8 = null;
                if (file7 == null && cz6Var5 != null) {
                    file7 = cz6Var5.a();
                } else if (cz6Var5 != null) {
                    file8 = cz6Var5.a();
                }
                final File file9 = file7;
                if (!z9 && file9 != null) {
                    z9 = file9.exists();
                }
                if (!z9 && file8 != null) {
                    z9 = file8.exists();
                }
                final boolean z10 = z9;
                final PhotoViewer photoViewer = PhotoViewer.this;
                final int i4 = i;
                final boolean z11 = z3;
                if (!z10 && i4 != 0 && (k47Var = r7) != null && z11 && er3.q(photoViewer.U).b(k47Var.k) != 0 && (((yv1Var = photoViewer.k4) == null || yv1Var.h == null) && !k47.Q5(k47Var.k) && (F0 = k47Var.F0()) != null)) {
                    bc4.G(photoViewer.U).X(F0, k47Var, 0, 10);
                }
                final boolean z12 = z4;
                final boolean z13 = z7;
                final boolean z14 = z;
                gm.c3(new Runnable() { // from class: o88
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean z15;
                        Drawable[] drawableArr2 = PhotoViewer.d9;
                        PhotoViewer photoViewer2 = PhotoViewer.this;
                        String[] strArr = photoViewer2.b5;
                        w98[] w98VarArr = photoViewer2.X0;
                        int i5 = i4;
                        File file10 = file6;
                        boolean z16 = z12;
                        boolean z17 = z14;
                        boolean z18 = true;
                        if (!(file10 == null && file9 == null) && ((z15 = z10) || z11)) {
                            if (i5 != 0 || !photoViewer2.P3) {
                                if (!z16 || (z13 && !(i5 == 0 && photoViewer2.X2))) {
                                    w98VarArr[i5].d(-1, z17, true);
                                } else {
                                    w98VarArr[i5].d(3, z17, true);
                                }
                            }
                            if (i5 == 0 && !photoViewer2.p0.y()) {
                                if (z15) {
                                    photoViewer2.p0.u(8);
                                } else {
                                    boolean S = bc4.G(photoViewer2.U).S(strArr[i5]);
                                    r7 r7Var = photoViewer2.p0;
                                    if (S) {
                                        r7Var.S(8);
                                    } else {
                                        r7Var.u(8);
                                    }
                                }
                            }
                        } else {
                            if (!z16) {
                                w98VarArr[i5].d(0, z17, true);
                            } else if (bc4.G(photoViewer2.U).S(strArr[i5])) {
                                w98VarArr[i5].d(1, false, true);
                            } else {
                                w98VarArr[i5].d(2, false, true);
                            }
                            Float s2 = fn5.z().s(strArr[i5]);
                            if (s2 == null) {
                                s2 = Float.valueOf(0.0f);
                            }
                            w98VarArr[i5].f(false, s2.floatValue());
                        }
                        if (i5 == 0) {
                            if (photoViewer2.s4 || (photoViewer2.f7.isEmpty() && (strArr[0] == null || w98VarArr[0].h == 0))) {
                                z18 = false;
                            }
                            photoViewer2.H6 = z18;
                        }
                    }
                });
            }
        });
    }

    public final o49 u0(boolean z) {
        ad8 ad8Var;
        tl4 tl4Var;
        RectF rectF = new RectF();
        if (z || (ad8Var = this.U8) == null || (tl4Var = ad8Var.e) == null) {
            s98 s98Var = this.c9;
            tl4.j(rectF, s98Var.S(), s98Var.o0());
        } else {
            tl4Var.g(rectF);
        }
        o49 o49Var = new o49();
        o49Var.a = rectF.left;
        o49Var.b = rectF.top;
        o49Var.c = rectF.width();
        o49Var.d = rectF.height();
        return o49Var;
    }

    public final void u1() {
        n1b n1bVar = this.o5;
        if (n1bVar == null || this.d2 != 11) {
            return;
        }
        if (this.A7) {
            n1bVar.b();
        } else {
            n1bVar.l(this.B4.n(), this.B4.V, i0(this.t4), g0(), new t88(this, (byte) 0));
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
    public final void u2(boolean z, boolean z2, cb8 cb8Var) {
        float f;
        int i;
        nb8 nb8Var;
        ta8 ta8Var;
        float f2;
        boolean z3;
        int i2;
        a6 a6Var;
        nb8 nb8Var2;
        View view;
        boolean z4;
        Property property;
        boolean z5;
        ta8 ta8Var2;
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
                        ka8 ka8Var = this.s3;
                        if (ka8Var != null) {
                            ka8Var.requestLayout();
                        }
                    }
                }
                this.K = z;
                ya8 ya8Var = this.g0;
                if (ya8Var != null) {
                    ya8Var.setTouchDisabled(z);
                }
                if (cb8Var.c) {
                    H2(z);
                }
                if (this.l3 && this.P3 && z) {
                    A1();
                } else {
                    gm.r(this.y2);
                }
                if (!z) {
                    u31.d(this.f0);
                }
                float N = gm.N(24.0f);
                this.i3.c(cb8Var.d && this.Z2);
                vb8 vb8Var = this.i3;
                boolean z7 = cb8Var.d;
                if (vb8Var.c != z7) {
                    vb8Var.c = z7;
                    if (!z7) {
                        vb8Var.setTranslationY(0.0f);
                    }
                    vb8Var.a(vb8Var.a);
                }
                w98[] w98VarArr = this.X0;
                ImageView[] imageViewArr = this.y3;
                if (!z2) {
                    x20 x20Var = this.G;
                    if (z) {
                        tc1 d0 = d0();
                        ba8 ba8Var = this.W1;
                        if (d0 != ba8Var || ba8Var.M.c()) {
                            f = 1.0f;
                            x20Var.setAlpha(f);
                            if (imageViewArr[0].getTranslationX() != 0.0f && this.z3) {
                                imageViewArr[0].setAlpha(!z ? 1.0f : 0.0f);
                            }
                            for (i = 0; i < 3; i++) {
                                imageViewArr[i].setTranslationY(z ? 0.0f : N);
                            }
                            this.G.setTranslationY(!z ? 0.0f : -N);
                            nb8Var = this.O;
                            if (nb8Var != null) {
                                nb8Var.setAlpha(z ? 1.0f : 0.0f);
                                this.O.setTranslationY(z ? 0.0f : -N);
                            }
                            this.j0.setAlpha(!z ? 1.0f : 0.0f);
                            this.j0.setTranslationY(!z ? 0.0f : N);
                            this.k0.setAlpha(!z ? 1.0f : 0.0f);
                            this.m1.setAlpha((z || this.G7 == 3) ? 0.0f : 1.0f);
                            this.m1.setTranslationY((z || this.G7 == 3) ? N : 0.0f);
                            if (!this.j2 && (ta8Var = this.U1) != null) {
                                ta8Var.setAlpha(!z ? 1.0f : 0.0f);
                                ta8 ta8Var3 = this.U1;
                                if (z) {
                                    N = 0.0f;
                                }
                                ta8Var3.setTranslationY(N);
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
                            w98VarArr[0].e(1, z ? 1.0f : 0.0f, false);
                            return;
                        }
                    }
                    f = 0.0f;
                    x20Var.setAlpha(f);
                    if (imageViewArr[0].getTranslationX() != 0.0f) {
                        imageViewArr[0].setAlpha(!z ? 1.0f : 0.0f);
                    }
                    while (i < 3) {
                    }
                    this.G.setTranslationY(!z ? 0.0f : -N);
                    nb8Var = this.O;
                    if (nb8Var != null) {
                    }
                    this.j0.setAlpha(!z ? 1.0f : 0.0f);
                    this.j0.setTranslationY(!z ? 0.0f : N);
                    this.k0.setAlpha(!z ? 1.0f : 0.0f);
                    this.m1.setAlpha((z || this.G7 == 3) ? 0.0f : 1.0f);
                    this.m1.setTranslationY((z || this.G7 == 3) ? N : 0.0f);
                    if (!this.j2) {
                        ta8Var.setAlpha(!z ? 1.0f : 0.0f);
                        ta8 ta8Var32 = this.U1;
                        if (z) {
                        }
                        ta8Var32.setTranslationY(N);
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
                x20 x20Var2 = this.G;
                Property property2 = View.ALPHA;
                if (z) {
                    tc1 d02 = d0();
                    ba8 ba8Var2 = this.W1;
                    if (d02 != ba8Var2 || ba8Var2.M.c()) {
                        f2 = 1.0f;
                        arrayList.add(ObjectAnimator.ofFloat(x20Var2, (Property<x20, Float>) property2, f2));
                        z3 = cb8Var.d;
                        x20 x20Var3 = this.G;
                        if (z3) {
                            x20Var3.setTranslationY(0.0f);
                        } else {
                            arrayList.add(ObjectAnimator.ofFloat(x20Var3, (Property<x20, Float>) View.TRANSLATION_Y, z ? 0.0f : -N));
                        }
                        if (this.z3) {
                            arrayList.add(ObjectAnimator.ofFloat(imageViewArr[0], (Property<ImageView, Float>) property2, z ? 1.0f : 0.0f));
                        }
                        for (i2 = 1; i2 < 3; i2++) {
                            imageViewArr[i2].setTranslationY(z ? 0.0f : N);
                        }
                        if (cb8Var.d) {
                            imageViewArr[0].setTranslationY(0.0f);
                        } else {
                            arrayList.add(ObjectAnimator.ofFloat(imageViewArr[0], (Property<ImageView, Float>) View.TRANSLATION_Y, z ? 0.0f : N));
                        }
                        a6Var = this.j0;
                        if (a6Var != null) {
                            arrayList.add(ObjectAnimator.ofFloat(a6Var, (Property<a6, Float>) View.ALPHA, z ? 1.0f : 0.0f));
                            boolean z8 = cb8Var.d;
                            a6 a6Var2 = this.j0;
                            if (z8) {
                                arrayList.add(ObjectAnimator.ofFloat(a6Var2, (Property<a6, Float>) View.TRANSLATION_Y, z ? 0.0f : N));
                            } else {
                                a6Var2.setTranslationY(0.0f);
                            }
                        }
                        nb8Var2 = this.O;
                        if (nb8Var2 != null) {
                            arrayList.add(ObjectAnimator.ofFloat(nb8Var2, (Property<nb8, Float>) View.ALPHA, z ? 1.0f : 0.0f));
                            boolean z9 = cb8Var.d;
                            nb8 nb8Var3 = this.O;
                            if (z9) {
                                arrayList.add(ObjectAnimator.ofFloat(nb8Var3, (Property<nb8, Float>) View.TRANSLATION_Y, z ? 0.0f : -N));
                            } else {
                                nb8Var3.setTranslationY(0.0f);
                            }
                        }
                        view = this.k0;
                        if (view != null) {
                            arrayList.add(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, z ? 1.0f : 0.0f));
                        }
                        z4 = this.l3;
                        vb8 vb8Var2 = this.i3;
                        if (z4) {
                            vb8Var2.b(z ? 1.0f : 0.0f);
                        } else {
                            arrayList.add(ObjectAnimator.ofFloat(vb8Var2, (Property<vb8, Float>) i9, z ? 1.0f : 0.0f));
                        }
                        td5 td5Var = this.m1;
                        property = View.ALPHA;
                        arrayList.add(ObjectAnimator.ofFloat(td5Var, (Property<td5, Float>) property, !z ? 1.0f : 0.0f));
                        byte b = 2;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat.addUpdateListener(new d98());
                        arrayList.add(ofFloat);
                        z5 = cb8Var.d;
                        td5 td5Var2 = this.m1;
                        if (z5) {
                            td5Var2.setTranslationY(0.0f);
                        } else {
                            arrayList.add(ObjectAnimator.ofFloat(td5Var2, (Property<td5, Float>) View.TRANSLATION_Y, z ? 0.0f : N));
                        }
                        if (!this.j2 && (ta8Var2 = this.U1) != null) {
                            arrayList.add(ObjectAnimator.ofFloat(ta8Var2, (Property<ta8, Float>) property, !z ? 1.0f : 0.0f));
                            z6 = cb8Var.d;
                            ta8 ta8Var4 = this.U1;
                            if (z6) {
                                ta8Var4.setTranslationY(0.0f);
                            } else {
                                Property property3 = View.TRANSLATION_Y;
                                if (z) {
                                    N = 0.0f;
                                }
                                arrayList.add(ObjectAnimator.ofFloat(ta8Var4, (Property<ta8, Float>) property3, N));
                            }
                        }
                        if (this.l3 && this.P3) {
                            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(w98VarArr[0].m[1], !z ? 1.0f : 0.0f);
                            ofFloat2.addUpdateListener(new h88(this, (byte) 14));
                            arrayList.add(ofFloat2);
                        }
                        if (this.f1.getTag() != null) {
                            arrayList.add(ObjectAnimator.ofFloat(this.f1, (Property<c7, Float>) property, z ? 1.0f : 0.0f));
                        }
                        if (this.g1.getTag() != null) {
                            arrayList.add(ObjectAnimator.ofFloat(this.g1, (Property<o96, Float>) property, z ? 1.0f : 0.0f));
                        }
                        if (this.h1.getTag() != null) {
                            arrayList.add(ObjectAnimator.ofFloat(this.h1, (Property<y98, Float>) property, z ? 1.0f : 0.0f));
                        }
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        this.M = animatorSet2;
                        animatorSet2.playTogether(arrayList);
                        this.M.setDuration(cb8Var.a);
                        this.M.setInterpolator(cb8Var.b);
                        this.M.addListener(new pa8(this, z, b));
                        this.M.start();
                    }
                }
                f2 = 0.0f;
                arrayList.add(ObjectAnimator.ofFloat(x20Var2, (Property<x20, Float>) property2, f2));
                z3 = cb8Var.d;
                x20 x20Var32 = this.G;
                if (z3) {
                }
                if (this.z3) {
                }
                while (i2 < 3) {
                }
                if (cb8Var.d) {
                }
                a6Var = this.j0;
                if (a6Var != null) {
                }
                nb8Var2 = this.O;
                if (nb8Var2 != null) {
                }
                view = this.k0;
                if (view != null) {
                }
                z4 = this.l3;
                vb8 vb8Var22 = this.i3;
                if (z4) {
                }
                td5 td5Var3 = this.m1;
                property = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(td5Var3, (Property<td5, Float>) property, !z ? 1.0f : 0.0f));
                byte b2 = 2;
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat3.addUpdateListener(new d98());
                arrayList.add(ofFloat3);
                z5 = cb8Var.d;
                td5 td5Var22 = this.m1;
                if (z5) {
                }
                if (!this.j2) {
                    arrayList.add(ObjectAnimator.ofFloat(ta8Var2, (Property<ta8, Float>) property, !z ? 1.0f : 0.0f));
                    z6 = cb8Var.d;
                    ta8 ta8Var42 = this.U1;
                    if (z6) {
                    }
                }
                if (this.l3) {
                    ValueAnimator ofFloat22 = ValueAnimator.ofFloat(w98VarArr[0].m[1], !z ? 1.0f : 0.0f);
                    ofFloat22.addUpdateListener(new h88(this, (byte) 14));
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
                this.M.setDuration(cb8Var.a);
                this.M.setInterpolator(cb8Var.b);
                this.M.addListener(new pa8(this, z, b2));
                this.M.start();
            }
        }
    }

    public final void v(int i) {
        ndc ndcVar = this.G2;
        if (ndcVar != null && ndcVar.d != null && i != ndcVar.e0) {
            ndcVar.e0 = i;
            ArrayList arrayList = ndcVar.O;
            ndcVar.v0(false, (arrayList == null || i < 0 || i >= arrayList.size()) ? null : (kdc) ndcVar.O.get(i));
        }
        if (i == -1) {
            ndc.n0(null, this.S4);
        } else {
            ndc ndcVar2 = this.G2;
            if (ndcVar2 != null) {
                ndc.n0(ndcVar2.Z(i), this.S4);
            }
        }
        N2();
        this.q0.U(null, null);
        try {
            fp.b(0);
            if (hi2.v().D()) {
                hi2.v().Q(k0());
            }
            ndc ndcVar3 = this.G2;
            if (ndcVar3 != null) {
                fp.z(ndcVar3.c0());
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    public final RenderNode v0(ColorMatrix colorMatrix) {
        RenderNode renderNode;
        if (this.P8 == null) {
            renderNode = null;
        } else {
            renderNode = this.Q8;
            if (renderNode == null) {
                ul1.p();
                renderNode = new RenderNode("pv_s_blur_false");
                float a = mr3.a(gm.L(40.0f), 6.0f);
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
        ucb ucbVar = this.R8;
        ucbVar.a = 0L;
        ucbVar.b = false;
        for (float f : colorMatrix.getArray()) {
            ucbVar.c(f);
        }
        ucbVar.a(0L);
        long j = ucbVar.b ? -1L : ucbVar.a;
        RenderNode renderNode2 = (RenderNode) this.S8.f(j);
        if (renderNode2 == null) {
            ul1.p();
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

    public final void v1(String str, long j, boolean z, float f, float f2, int i, long j2) {
        int parseInt;
        if (this.C8 != null) {
            Utilities.e.a(this.C8);
            this.C8 = null;
        }
        x98 x98Var = this.X7;
        x98Var.a();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        x98Var.E = mediaMetadataRetriever;
        boolean z2 = true;
        x98Var.x = j > 0;
        x98Var.d = f;
        x98Var.e = f2;
        float f3 = x98Var.s;
        if (f3 < f) {
            x98Var.s = f;
        } else if (f3 > f2) {
            x98Var.s = f2;
        }
        try {
            if (j > 0) {
                File file = new File(str);
                ParcelFileDescriptor open = ParcelFileDescriptor.open(file, TLObject.FLAG_28);
                x98Var.y = open;
                x98Var.E.setDataSource(open.getFileDescriptor(), j, file.length() - j);
            } else {
                mediaMetadataRetriever.setDataSource(str);
            }
            String extractMetadata = x98Var.E.extractMetadata(9);
            if (extractMetadata != null) {
                x98Var.a = Long.parseLong(extractMetadata);
            }
            String extractMetadata2 = x98Var.E.extractMetadata(18);
            if (extractMetadata2 != null) {
                x98Var.b = Integer.parseInt(extractMetadata2);
            }
            String extractMetadata3 = x98Var.E.extractMetadata(19);
            if (extractMetadata3 != null) {
                x98Var.c = Integer.parseInt(extractMetadata3);
            }
            String extractMetadata4 = x98Var.E.extractMetadata(24);
            if (extractMetadata4 != null && ((parseInt = Integer.parseInt(extractMetadata4)) == 90 || parseInt == 270)) {
                int i2 = x98Var.b;
                x98Var.b = x98Var.c;
                x98Var.c = i2;
            }
            if (x98Var.x) {
                x98Var.f = (float) ((j2 / 1000.0d) / x98Var.a);
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
        x98Var.invalidate();
        this.D8 = null;
        if (!z && this.d2 != 1) {
            z2 = false;
        }
        this.r = z2;
        this.e8 = -1;
        this.g8 = 0;
        this.o8 = 25;
        this.z8 = new File(str).length();
        mp3 mp3Var = Utilities.e;
        ab8 ab8Var = new ab8(this, str, j, i);
        this.C8 = ab8Var;
        mp3Var.c(ab8Var);
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
        pb8 pb8Var = this.d;
        if (pb8Var == null || !pb8Var.l()) {
            return;
        }
        c();
        tc1 d0 = d0();
        this.d.F(!r1.z());
        f2(true, true);
        tc1 d02 = d0();
        boolean z2 = this.d.z();
        if (d0 != d02) {
            jc1 jc1Var = d0.f;
            jc1Var.k(true);
            d02.setText(gn.cloneSpans(d0.getText()));
            jc1 jc1Var2 = d02.f;
            jc1Var2.getEditText().setAllowTextEntitiesIntersection(jc1Var.getEditText().getAllowTextEntitiesIntersection());
            if (jc1Var.getEditText().isFocused()) {
                jc1Var2.getEditText().requestFocus();
                jc1Var2.getEditText().setSelection(jc1Var.getEditText().getSelectionStart(), jc1Var.getEditText().getSelectionEnd());
            }
            lc1 lc1Var = d0.N;
            if (lc1Var != null) {
                gm.B2(lc1Var);
                d0.N = null;
            }
            ViewPropertyAnimator animate = this.G.animate();
            if (this.K) {
                tc1 d03 = d0();
                ba8 ba8Var = this.W1;
                if (d03 != ba8Var || !ba8Var.M.c()) {
                    f = 1.0f;
                    animate.alpha(f).start();
                    if (this.Q0.getVisibility() == 0) {
                        if (this.K) {
                            tc1 d04 = d0();
                            ba8 ba8Var2 = this.W1;
                            if (d04 != ba8Var2 || !ba8Var2.M.c()) {
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
        if (oc7.r1(this.U).X3.getInt("movecaptionhint", 0) >= 24) {
            boolean z3 = e21.a;
        } else {
            SharedPreferences sharedPreferences = oc7.r1(this.U).X3;
            sharedPreferences.edit().putInt("movecaptionhint", sharedPreferences.getInt("movecaptionhint", 0) + 1).apply();
            c41 c41Var = new c41(z2 ? this.S0 : this.R0, new r63());
            if (z2) {
                i = R.raw.caption_up;
                i2 = 2131748078;
            } else {
                i = R.raw.caption_down;
                i2 = 2131748080;
            }
            u31 I = c41Var.I(i, jb6.M0(i2, null), jb6.M0(z2 ? 2131748077 : 2131748079, null));
            y21 y21Var = I.e;
            if (y21Var instanceof r31) {
                s09 s09Var = ((r31) y21Var).a;
                s09Var.setScaleX(0.8f);
                s09Var.setScaleY(0.8f);
            }
            I.k(!z2);
        }
        aa8 aa8Var = this.V1;
        if (aa8Var != null) {
            jc1 jc1Var3 = aa8Var.f;
            jc1Var3.d();
            jc1Var3.k(true);
        }
    }

    public final void w(boolean z, boolean z2, float f) {
        if (f != this.u1) {
            this.u1 = f;
            if (this.S4 != null) {
                SharedPreferences sharedPreferences = org.telegram.messenger.a.b.getSharedPreferences("playback_speed", 0);
                if (Math.abs(this.u1 - 1.0f) < 0.001f) {
                    sharedPreferences.edit().remove("speed" + k47.B0(this.S4.k) + "_" + this.S4.e1()).commit();
                } else {
                    sharedPreferences.edit().putFloat("speed" + k47.B0(this.S4.k) + "_" + this.S4.e1(), this.u1).commit();
                }
            }
            ndc ndcVar = this.G2;
            if (ndcVar != null) {
                ndcVar.u0(this.u1);
            }
            ya8 ya8Var = this.g0;
            if (ya8Var != null) {
                ya8Var.setPlaybackSpeed(this.u1);
            }
        }
        S1(true, z);
        if (z2) {
            this.q0.U(null, null);
        }
    }

    public final int w0() {
        return this.t2.right;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void w1(boolean z) {
        this.l7 = null;
        gm.r(this.n7);
        odc odcVar = this.k7;
        if (odcVar != null) {
            odcVar.a(this.U, null);
        }
        D0();
        int i = 0;
        Object[] objArr = 0;
        this.E2 = false;
        ad8 ad8Var = this.U8;
        if (ad8Var != null && ad8Var.c == 0) {
            this.U8 = null;
            ad8Var.g();
        }
        ndc ndcVar = this.G2;
        HashMap hashMap = f9;
        z98 z98Var = this.y2;
        if (ndcVar != null) {
            m();
            gm.r(this.x2);
            gm.r(z98Var);
            if (this.c3 != null) {
                float S = this.G2.S() / this.G2.U();
                String str = this.c3;
                SystemClock.elapsedRealtime();
                hashMap.put(str, new sb8(S));
                k47 k47Var = this.S4;
                if (k47Var != null) {
                    k47Var.l3 = Float.valueOf(S);
                }
            }
            this.G2.l0();
            this.G2 = null;
        } else {
            this.X2 = false;
        }
        if (this.g0 != null) {
            gm.r(z98Var);
            if (this.c3 != null) {
                float m0 = m0() / z0();
                String str2 = this.c3;
                SystemClock.elapsedRealtime();
                hashMap.put(str2, new sb8(m0));
                k47 k47Var2 = this.S4;
                if (k47Var2 != null) {
                    k47Var2.l3 = Float.valueOf(m0);
                }
            }
        }
        tv3 tv3Var = this.W3;
        if (tv3Var != null) {
            tv3Var.disable();
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
                fc4.g(e, true);
            }
        }
        oa8 oa8Var = this.z2;
        if (oa8Var != null) {
            try {
                this.f0.removeView(oa8Var);
            } catch (Throwable unused) {
            }
            this.z2 = null;
        }
        k();
        this.A2 = null;
        TextureView textureView = this.C2;
        if (textureView != null) {
            if (textureView instanceof ncc) {
                ncc nccVar = (ncc) textureView;
                uf4 uf4Var = nccVar.b;
                if (uf4Var != null) {
                    uf4Var.postRunnable(new sf4(uf4Var, objArr == true ? 1 : 0));
                }
                nccVar.a = null;
            }
            this.C2 = null;
        }
        this.c0.e();
        if (this.D2 != null) {
            this.D2 = null;
        }
        if (this.P3) {
            this.P3 = false;
            gm.r(this.h4);
        }
        if (!z && !this.G8 && !this.H8) {
            Y1(false, true);
        }
        w98 w98Var = this.X0[0];
        while (true) {
            float[] fArr = w98Var.n;
            if (i >= fArr.length) {
                w98Var.a();
                return;
            } else {
                w98Var.m[i] = 1.0f;
                fArr[i] = 1.0f;
                i++;
            }
        }
    }

    public final void w2(boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        float N = gm.N(24.0f);
        jp0 jp0Var = this.Q0;
        Property property = View.ALPHA;
        arrayList.add(ObjectAnimator.ofFloat(jp0Var, (Property<jp0, Float>) property, z ? 1.0f : 0.0f));
        jp0 jp0Var2 = this.Q0;
        Property property2 = View.TRANSLATION_Y;
        arrayList.add(ObjectAnimator.ofFloat(jp0Var2, (Property<jp0, Float>) property2, z ? 0.0f : N));
        n1b n1bVar = this.o5;
        if (n1bVar != null) {
            arrayList.add(ObjectAnimator.ofFloat(n1bVar, (Property<n1b, Float>) property, z ? 1.0f : 0.0f));
        }
        if (this.o5 != null) {
            arrayList.add(ObjectAnimator.ofFloat(this.r5, (Property<yc, Float>) property, z ? 1.0f : 0.0f));
        }
        arrayList.add(ObjectAnimator.ofFloat(this.T0, (Property<vi3, Float>) property, z ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.T0, (Property<vi3, Float>) property2, z ? 0.0f : N));
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
        x(true);
        jc1 jc1Var = this.V1.f;
        if (jc1Var.e) {
            jc1Var.k(true);
        }
        jc1 jc1Var2 = this.W1.f;
        if (jc1Var2.e) {
            jc1Var2.k(true);
        }
        this.V1.f.d();
        this.W1.f.d();
    }

    public final void x(boolean z) {
        int i = this.O4;
        if (i < 0 || i >= this.f7.size() || !K0()) {
            return;
        }
        if (z) {
            c();
        }
        d0().p();
    }

    public final void x1(int i) {
        if (this.D8 != null) {
            MediaController.w().d(this.D8);
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
            w98 w98Var = this.X0[0];
            w98Var.f(w98Var.h == 0 || w98Var.k == 0, 0.0f);
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
                k47 k47Var = new k47(z8c.t0, tL_message, false, false);
                this.D8 = k47Var;
                k47Var.k.attachPath = new File(bc4.z(4), "video_preview.mp4").getAbsolutePath();
                this.D8.r0 = new rcc();
                rcc rccVar = this.D8.r0;
                rccVar.g = this.g8;
                rccVar.h = this.h8;
                this.D8.r0.i = this.i8;
                rcc rccVar2 = this.D8.r0;
                rccVar2.n = this.o8;
                Uri uri = this.V4;
                if (uri == null) {
                    rccVar2.o = uri.getPath();
                } else {
                    rccVar2.o = uri.getPath();
                }
            }
            rcc rccVar3 = this.D8.r0;
            long j = this.r8;
            rccVar3.a = j;
            long j2 = this.s8;
            rccVar3.b = j2;
            if (j == -1) {
                j = 0;
            }
            if (j2 == -1) {
                j2 = (long) (this.n8 * 1000.0f);
            }
            if (j2 - j > 5000000) {
                rccVar3.b = j + 5000000;
            }
            rccVar3.m = this.l8;
            this.D8.r0.k = this.j8;
            this.D8.r0.l = this.k8;
            rcc rccVar4 = this.D8.r0;
            rccVar4.X = true;
            rccVar4.v = (long) (this.n8 * 1000.0f);
            if (!MediaController.w().g0(this.D8, true, true, true)) {
                this.E8 = true;
            }
            this.H8 = true;
            w98 w98Var2 = this.X0[0];
            w98Var2.f(w98Var2.h == 0 || w98Var2.k == 0, 0.0f);
            this.X0[0].d(0, false, true);
        }
        this.f0.invalidate();
    }

    public final void x2(boolean z, boolean z2) {
        n88 n88Var = this.y;
        gm.r(n88Var);
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
            gm.d3(n88Var, 500L);
        } else {
            this.R3 = false;
            y2(true);
        }
    }

    @Override // nu4
    public final void y() {
        E0();
    }

    public final int y0(int i) {
        ylb ylbVar = this.w2;
        return ylbVar != null ? ylbVar.h(i) : cmb.w0(null, i, false);
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
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.Y0, (Property<dj1, Float>) View.ALPHA, z ? 1.0f : 0.0f));
        this.x.setDuration(200L);
        this.x.addListener(new pa8(this, z, (byte) 1));
        this.x.start();
    }

    public final void z() {
        sa8 sa8Var = this.M1;
        Activity activity = this.E;
        n88 n88Var = new n88(this, (byte) 2);
        if (sa8Var.B1) {
            sa8Var.y0(false);
            return;
        }
        if (sa8Var.a2) {
            sa8Var.i0(true);
            return;
        }
        if (sa8Var.J0 && sa8Var.I0 != null) {
            sa8Var.t0(null, true);
            return;
        }
        if (!sa8Var.v0.a()) {
            n88Var.run();
            return;
        }
        if (activity == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, sa8Var.G1, activity);
        String M0 = jb6.M0(2131747011, null);
        he heVar = alertDialog$Builder.a;
        heVar.U = M0;
        heVar.S = jb6.M0(2131751342, null);
        alertDialog$Builder.j(jb6.M0(2131747313, null), new wx4((Object) n88Var, (byte) 18));
        alertDialog$Builder.g(jb6.M0(2131752542, null), null);
        b2(alertDialog$Builder);
    }

    public final long z0() {
        ya8 ya8Var = this.g0;
        if (ya8Var != null && ya8Var.y) {
            return ya8Var.getVideoDuration();
        }
        ndc ndcVar = this.G2;
        if (ndcVar == null) {
            return 0L;
        }
        return ndcVar.U();
    }

    public final float z1(boolean z) {
        int i;
        if (this.d2 != 11) {
            return 1.0f;
        }
        int i0 = i0(this.t4);
        if (i0 == 0) {
            i0 = gm.q.x;
        }
        float z2 = b10.z(20.0f, i0, 1) / i0;
        if (z) {
            int q = this.B4.q();
            int o = this.B4.o();
            if ((q <= 1 || o <= 1) && (i = this.O4) >= 0) {
                ArrayList arrayList = this.f7;
                if (i < arrayList.size()) {
                    Object obj = arrayList.get(this.O4);
                    if (obj instanceof jo6) {
                        jo6 jo6Var = (jo6) obj;
                        q = jo6Var.F;
                        o = jo6Var.G;
                        if ((jo6Var.J / 90) % 2 != 0) {
                            o = q;
                            q = o;
                        }
                    }
                }
            }
            if (q > 1 && o > 1 && q > o) {
                return (q / o) * z2;
            }
        }
        return z2;
    }

    public final void z2(boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        float N = gm.N(24.0f);
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

    @Override // nu4
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // g94
    public final void V(float f, int i) {
    }
}
