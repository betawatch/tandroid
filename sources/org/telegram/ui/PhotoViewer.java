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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public class PhotoViewer implements gk7, ms4, ls4, x74 {
    public static Drawable[] f9;
    public static final Paint g9 = new Paint(2);
    public static final HashMap h9 = new HashMap();
    public static DecelerateInterpolator i9;
    public static Paint j9;
    public static final Property k9;
    public static volatile PhotoViewer l9;
    public static volatile PhotoViewer m9;
    public j8 A0;
    public rac A1;
    public View A2;
    public final int[] A3;
    public ju7 A4;
    public boolean A5;
    public float A6;
    public TLRPC.Document A7;
    public long A8;
    public r6 B0;
    public iv9 B1;
    public AnimatorSet B2;
    public boolean B3;
    public ImageReceiver B4;
    public boolean B5;
    public float B6;
    public boolean B7;
    public long B8;
    public r7 C0;
    public AnimatorSet C1;
    public TextureView C2;
    public Bitmap C3;
    public ImageReceiver C4;
    public byte C5;
    public float C6;
    public boolean C7;
    public float C8;
    public r7 D0;
    public v48 D1;
    public SurfaceView D2;
    public Bitmap D3;
    public ImageReceiver D4;
    public long D5;
    public float D6;
    public f D7;
    public y88 D8;
    public Activity E;
    public r7 E0;
    public final c33 E1;
    public boolean E2;
    public ImageView E3;
    public ei0 E4;
    public long E5;
    public float E6;
    public final float[] E7;
    public k27 E8;
    public ContextThemeWrapper F;
    public r7 F0;
    public c33 F1;
    public j98 F2;
    public boolean F3;
    public ei0 F4;
    public h19 F5;
    public float F6;
    public final float[] F7;
    public boolean F8;
    public x10 G;
    public a8 G0;
    public c33 G1;
    public lbc G2;
    public byte G3;
    public ei0 G4;
    public String G5;
    public float G6;
    public ObjectAnimator G7;
    public boolean G8;
    public ImageView H;
    public o10 H0;
    public zl6 H1;
    public boolean H2;
    public boolean H3;
    public boolean H4;
    public boolean H5;
    public float H6;
    public byte H7;
    public boolean H8;
    public Drawable I;
    public pkb I0;
    public zl6 I1;
    public Runnable I2;
    public boolean I3;
    public boolean I4;
    public long I5;
    public boolean I6;
    public wtc I7;
    public boolean I8;
    public sk0 J;
    public pkb J0;
    public l58 J1;
    public boolean J2;
    public boolean J3;
    public boolean J4;
    public int J5;
    public boolean J6;
    public float J7;
    public String J8;
    public boolean K;
    public lg2 K0;
    public AnimatorSet K1;
    public float K2;
    public boolean K3;
    public boolean K4;
    public int K5;
    public boolean K6;
    public float K7;
    public final lm K8;
    public boolean L;
    public final HashMap L0;
    public mv5 L1;
    public float L2;
    public boolean L3;
    public boolean L4;
    public int L5;
    public boolean L6;
    public final l68 L7;
    public lm[] L8;
    public AnimatorSet M;
    public final BackgroundDrawable M0;
    public q88 M1;
    public float M2;
    public boolean M3;
    public final Matrix M4;
    public boolean M5;
    public byte M6;
    public Path M7;
    public RectF M8;
    public n98 N;
    public final Paint N0;
    public boolean N1;
    public float N2;
    public float N3;
    public final Paint N4;
    public boolean N5;
    public byte N6;
    public Paint N7;
    public RectF N8;
    public m98 O;
    public CheckBox O0;
    public p88 O1;
    public float O2;
    public long O3;
    public Bitmap O4;
    public boolean O5;
    public boolean O6;
    public Paint O7;
    public Matrix O8;
    public boolean P;
    public CounterView P0;
    public boolean P1;
    public float P2;
    public boolean P3;
    public int P4;
    public final boolean[] P5;
    public boolean P6;
    public LinearGradient P7;
    public float[] P8;
    public boolean Q;
    public jo0 Q0;
    public hd Q1;
    public boolean Q2;
    public boolean Q3;
    public int Q4;
    public boolean Q5;
    public boolean Q6;
    public LinearGradient Q7;
    public RenderNode Q8;
    public t78 R;
    public FrameLayout R0;
    public g98 R1;
    public int R2;
    public boolean R3;
    public boolean R4;
    public boolean R5;
    public boolean R6;
    public Matrix R7;
    public RenderNode R8;
    public boolean S;
    public FrameLayout S0;
    public FrameLayout S1;
    public lbc S2;
    public long S3;
    public boolean S4;
    public boolean S5;
    public boolean S6;
    public Matrix S7;
    public final tab S8;
    public Paint T;
    public jh3 T0;
    public TextView T1;
    public SurfaceTexture T2;
    public View T3;
    public k27 T4;
    public boolean T5;
    public byte T6;
    public final int[] T7;
    public final vf6 T8;
    public int U;
    public l65 U0;
    public r88 U1;
    public boolean U2;
    public o78 U3;
    public VideoAds U4;
    public boolean U5;
    public VelocityTracker U6;
    public q98 U7;
    public boolean U8;
    public int V;
    public z92 V0;
    public y78 V1;
    public boolean V2;
    public int V3;
    public ArrayList V4;
    public boolean V5;
    public Scroller V6;
    public z92 V7;
    public xa8 V8;
    public int W;
    public TextView W0;
    public z78 W1;
    public boolean W2;
    public iu3 W3;
    public Uri W4;
    public float W5;
    public final ArrayList W6;
    public RadialProgressView W7;
    public ya8 W8;
    public float X;
    public final u78[] X0;
    public float X1;
    public boolean X2;
    public int X3;
    public final h98 X4;
    public float X5;
    public final SparseArray[] X6;
    public FrameLayout X7;
    public float X8;
    public f78 Y;
    public wh1 Y0;
    public oc6 Y1;
    public boolean Y2;
    public byte Y3;
    public TLRPC.BotInlineResult Y4;
    public float Y5;
    public final ArrayList Y6;
    public v78 Y7;
    public boolean Y8;
    public kl0 Z;
    public ImageView Z0;
    public FrameLayout Z1;
    public boolean Z2;
    public boolean Z3;
    public gl5 Z4;
    public float Z5;
    public final SparseArray[] Z6;
    public TextView Z7;
    public final RectF Z8;
    public final fm0 a = new fm0(0, this, s33.h, 380, false);
    public e59 a0;
    public ImageView a1;
    public FrameLayout a2;
    public float a3;
    public final ya2 a4;
    public gl5 a5;
    public float a6;
    public final ArrayList a7;
    public AnimatorSet a8;
    public boolean a9;
    public final boolean b;
    public e59 b0;
    public ImageView b1;
    public x02 b2;
    public String b3;
    public final VideoFramesRewinder b4;
    public uu9 b5;
    public float b6;
    public final ArrayList b7;
    public long b8;
    public boolean b9;
    public int c;
    public sl0 c0;
    public ImageView c1;
    public a06 c2;
    public String c3;
    public final f88 c4;
    public final String[] c5;
    public float c6;
    public final ArrayList c7;
    public long c8;
    public final l68 c9;
    public o98 d;
    public wl0 d0;
    public ImageView d1;
    public int d2;
    public long d3;
    public final v10 d4;
    public p98 d5;
    public float d6;
    public final ArrayList d7;
    public long d8;
    public final q78 d9;
    public boolean e;
    public WindowManager.LayoutParams e0;
    public za2 e1;
    public boolean e2;
    public float e3;
    public String e4;
    public String e5;
    public float e6;
    public final ArrayList e7;
    public volatile int e8;
    public View e9;
    public boolean f;
    public k98 f0;
    public c7 f1;
    public boolean f2;
    public boolean f3;
    public boolean f4;
    public long f5;
    public float f6;
    public final ArrayList f7;
    public volatile int f8;
    public x88 g0;
    public o76 g1;
    public boolean g2;
    public long g3;
    public boolean g4;
    public String g5;
    public float g6;
    public final ArrayList g7;
    public int g8;
    public int h;
    public z h0;
    public w78 h1;
    public boolean h2;
    public boolean h3;
    public final x78 h4;
    public boolean h5;
    public float h6;
    public gl5 h7;
    public int h8;
    public ClippingImageView i0;
    public ArrayList i1;
    public boolean i2;
    public u98 i3;
    public final x78 i4;
    public TL_iv.PageBlock i5;
    public float i6;
    public a0 i7;
    public volatile int i8;
    public a6 j0;
    public ArrayList j1;
    public boolean j2;
    public String j3;
    public final up5 j4;
    public jl5 j5;
    public float j6;
    public l98 j7;
    public volatile int j8;
    public View k0;
    public iac k1;
    public km k2;
    public ValueAnimator k3;
    public final float[][] k4;
    public boolean k5;
    public float k6;
    public final Rect k7;
    public volatile int k8;
    public int l0;
    public je5 l1;
    public boolean l2;
    public boolean l3;
    public mu1 l4;
    public boolean l5;
    public float l6;
    public mbc l7;
    public volatile int l8;
    public TextView m0;
    public vb5 m1;
    public boolean m2;
    public final int[] m3;
    public org.telegram.ui.ActionBar.d m4;
    public boolean m5;
    public float m6;
    public Uri m7;
    public volatile int m8;
    public boolean n;
    public TextView n0;
    public jtb n1;
    public boolean n2;
    public final int[] n3;
    public byte n4;
    public boolean n5;
    public long n6;
    public long n7;
    public volatile int n8;
    public TextView o0;
    public UndoView o1;
    public boolean o2;
    public jia o3;
    public long o4;
    public String o5;
    public int o6;
    public final l68 o7;
    public float o8;
    public r7 p0;
    public t98 p1;
    public ul5 p2;
    public ImageView p3;
    public Runnable p4;
    public mza p5;
    public AnimatorSet p6;
    public a8 p7;
    public int p8;
    public r7 q0;
    public s20 q1;
    public boolean q2;
    public tbc q3;
    public p98 q4;
    public v98 q5;
    public AnimatorSet q6;
    public r66 q7;
    public volatile boolean q8;
    public boolean r;
    public a8 r0;
    public ImageReceiver r1;
    public w97 r2;
    public sb r3;
    public p98 r4;
    public ArrayList r5;
    public ns4 r6;
    public final on r7;
    public volatile boolean r8;
    public boolean s;
    public v7 s0;
    public boolean s1;
    public boolean s2;
    public h88 s3;
    public boolean s4;
    public rj4 s5;
    public boolean s6;
    public a06 s7;
    public long s8;
    public a8 t0;
    public final l68 t1;
    public final Rect t2;
    public AnimatorSet t3;
    public boolean t4;
    public c98 t5;
    public final DecelerateInterpolator t6;
    public m21 t7;
    public long t8;
    public a8 u0;
    public float u1;
    public boolean u2;
    public boolean u3;
    public byte u4;
    public LinearLayout u5;
    public float u6;
    public int u7;
    public float u8;
    public j8 v0;
    public long v1;
    public boolean v2;
    public int v3;
    public final l68 v4;
    public c98 v5;
    public float v6;
    public boolean v7;
    public float v8;
    public int w;
    public a8 w0;
    public final GradientDrawable[] w1;
    public wjb w2;
    public ya8 w3;
    public byte w4;
    public c98 w5;
    public float w6;
    public CharSequence w7;
    public long w8;
    public AnimatorSet x;
    public mg2 x0;
    public final boolean[] x1;
    public final r78 x2;
    public ImageView x3;
    public String x4;
    public c98 x5;
    public float x6;
    public boolean x7;
    public long x8;
    public final l68 y;
    public LinearLayout y0;
    public final float[] y1;
    public final x78 y2;
    public final ImageView[] y3;
    public ju7 y4;
    public c98 y5;
    public float y6;
    public ValueAnimator y7;
    public long y8;
    public final ArrayList z0;
    public int z1;
    public m88 z2;
    public boolean z3;
    public ju7 z4;
    public long z5;
    public float z6;
    public TLRPC.Document z7;
    public long z8;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
    class BackgroundDrawable extends ColorDrawable {
        public static final /* synthetic */ int g = 0;
        public final RectF a;
        public final RectF b;
        public final Paint c;
        public h18 d;
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
            a06 a06Var = photoViewer.s7;
            if (a06Var != null) {
                a06Var.b(!this.e);
            }
            a06 a06Var2 = photoViewer.c2;
            if (a06Var2 != null) {
                a06Var2.b(!this.e);
            }
            x02 x02Var = photoViewer.b2;
            if (x02Var != null) {
                boolean z = this.e;
                x02Var.v2.m(x02Var.i4);
                if (x02Var.r4 != z) {
                    x02Var.r4 = z;
                    p02 p02Var = x02Var.v2;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = x02Var.d2;
                    if (p02Var != chatAttachAlertPhotoLayout || chatAttachAlertPhotoLayout == null || chatAttachAlertPhotoLayout.j1) {
                        return;
                    }
                    boolean z2 = !z || x02Var.s4;
                    if (!chatAttachAlertPhotoLayout.n || chatAttachAlertPhotoLayout.P0) {
                        return;
                    }
                    if (!z2) {
                        chatAttachAlertPhotoLayout.v0();
                        return;
                    }
                    b52 b52Var = chatAttachAlertPhotoLayout.Q;
                    if (b52Var != null) {
                        chatAttachAlertPhotoLayout.p0 = Boolean.valueOf(b52Var.isFrontface());
                        chatAttachAlertPhotoLayout.f0(true);
                    }
                }
            }
        }

        @Override // android.graphics.drawable.ColorDrawable, android.graphics.drawable.Drawable
        public final void draw(Canvas canvas) {
            h18 h18Var;
            p98 p98Var;
            Drawable[] drawableArr = PhotoViewer.f9;
            PhotoViewer photoViewer = PhotoViewer.this;
            if (photoViewer.n4 == 0 || gl.O1() || (p98Var = photoViewer.d5) == null || p98Var.m == null) {
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
                    rectF.inset(gl.L(1.0f), gl.L(1.0f));
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
            if (getAlpha() == 0 || (h18Var = this.d) == null) {
                return;
            }
            gl.d3(h18Var);
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
                    gl.e3(new Runnable() { // from class: org.telegram.ui.y
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
    /* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
            textPaint.setTextSize(gl.L(15.0f));
            textPaint.setTypeface(gl.o());
            textPaint.setColor(-1);
            Paint paint = new Paint(1);
            this.c = paint;
            paint.setColor(-1);
            paint.setStrokeWidth(gl.L(2.0f));
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeJoin(Paint.Join.ROUND);
            this.f = new RectF();
            a(0);
        }

        public final void a(int i) {
            String valueOf = String.valueOf(Math.max(1, i));
            int L = gl.L(100.0f);
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
                pn pnVar = rn.b;
                animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofInt(paint, pnVar, 0), ObjectAnimator.ofInt(textPaint, pnVar, 0));
                animatorSet.setInterpolator(new DecelerateInterpolator());
            } else {
                int i2 = this.h;
                if (i2 == 0) {
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this, (Property<CounterView, Float>) property, 0.0f, 1.0f);
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this, (Property<CounterView, Float>) property2, 0.0f, 1.0f);
                    pn pnVar2 = rn.b;
                    animatorSet.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofInt(paint, pnVar2, 0, kk7.d4), ObjectAnimator.ofInt(textPaint, pnVar2, 0, kk7.d4));
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
            paint.setAlpha(kk7.d4);
            float L = gl.L(1.0f);
            float L2 = measuredHeight - gl.L(14.0f);
            float measuredWidth = getMeasuredWidth() - gl.L(1.0f);
            float L3 = gl.L(14.0f) + measuredHeight;
            RectF rectF = this.f;
            rectF.set(L, L2, measuredWidth, L3);
            canvas.drawRoundRect(rectF, gl.L(15.0f), gl.L(15.0f), paint);
            if (this.a != null) {
                this.b.setAlpha((int) ((1.0f - this.n) * 255.0f));
                canvas.save();
                canvas.translate((getMeasuredWidth() - this.d) / 2, (this.n * gl.L(5.0f)) + gl.N(0.2f) + ((getMeasuredHeight() - this.e) / 2));
                this.a.draw(canvas);
                canvas.restore();
                paint.setAlpha((int) (this.n * 255.0f));
                int centerX = (int) rectF.centerX();
                int B = (int) ls6.B(1.0f, this.n, gl.L(5.0f), (int) rectF.centerY());
                canvas.drawLine(gl.L(5.0f) + centerX, B - gl.L(5.0f), centerX - gl.L(5.0f), gl.L(5.0f) + B, paint);
                canvas.drawLine(centerX - gl.L(5.0f), B - gl.L(5.0f), gl.L(5.0f) + centerX, gl.L(5.0f) + B, paint);
            }
        }

        @Override // android.view.View
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("android.widget.Button");
            int i = this.h;
            if (i > 0) {
                accessibilityNodeInfo.setContentDescription(k96.G(i, "PhotosSelected", new Object[0]));
            }
        }

        @Override // android.view.View
        public final void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.max(gl.L(20.0f) + this.d, gl.L(30.0f)), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(40.0f), TLObject.FLAG_30));
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
            k9 = new e78();
        } else {
            k9 = new ax1(Float.class, "progress", (byte) 2);
        }
        l9 = null;
        m9 = null;
    }

    public PhotoViewer() {
        byte b = 0;
        byte b2 = 1;
        this.b = Build.VERSION.SDK_INT >= 30;
        this.h = -1;
        this.n = true;
        this.y = new l68(this, (byte) 18);
        this.K = true;
        this.P = true;
        this.Q = false;
        this.a0 = new e59(0, false);
        this.z0 = new ArrayList();
        this.L0 = new HashMap(3);
        this.M0 = new BackgroundDrawable();
        Paint paint = new Paint();
        this.N0 = paint;
        this.X0 = new u78[3];
        this.t1 = new l68(this, (byte) 19);
        this.w1 = new GradientDrawable[2];
        this.x1 = new boolean[2];
        this.y1 = new float[2];
        this.E1 = new c33();
        this.F1 = new c33();
        this.G1 = new c33();
        this.X1 = -8.0f;
        this.t2 = new Rect();
        this.x2 = new r78(this);
        this.y2 = new x78(this, b);
        this.l3 = true;
        this.m3 = new int[2];
        this.n3 = new int[2];
        this.y3 = new ImageView[3];
        this.A3 = new int[2];
        this.K3 = true;
        this.V3 = -1;
        this.X3 = -10;
        this.a4 = new ya2(this, b2);
        VideoFramesRewinder videoFramesRewinder = new VideoFramesRewinder();
        this.b4 = videoFramesRewinder;
        this.c4 = new f88(this, videoFramesRewinder);
        this.d4 = new v10(this);
        this.h4 = new x78(this, b2);
        this.i4 = new x78(this, (byte) 2);
        this.j4 = new up5(this, b2);
        this.k4 = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 2, 13);
        this.v4 = new l68(this, (byte) 20);
        this.B4 = new ImageReceiver(null);
        this.C4 = new ml(this, (byte) 6);
        this.D4 = new ImageReceiver(null);
        byte b3 = 21;
        this.E4 = new ei0(1, new l68(this, b3));
        this.F4 = new ei0(1, new l68(this, b3));
        this.G4 = new ei0(1, new l68(this, b3));
        this.L4 = false;
        this.M4 = new Matrix();
        Paint paint2 = new Paint();
        this.N4 = paint2;
        this.O4 = null;
        this.X4 = new h98();
        this.c5 = new String[3];
        this.P5 = new boolean[]{false, true};
        this.a6 = 1.0f;
        this.b6 = 0.0f;
        this.o6 = -1;
        this.t6 = new DecelerateInterpolator(1.5f);
        this.w6 = 1.0f;
        this.x6 = 0.0f;
        this.I6 = true;
        this.Q6 = true;
        this.W6 = new ArrayList();
        this.X6 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.Y6 = new ArrayList();
        this.Z6 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.a7 = new ArrayList();
        this.b7 = new ArrayList();
        this.c7 = new ArrayList();
        this.d7 = new ArrayList();
        this.e7 = new ArrayList();
        this.f7 = new ArrayList();
        this.g7 = new ArrayList();
        this.h7 = null;
        this.i7 = null;
        this.k7 = new Rect();
        this.o7 = new l68(this, (byte) 22);
        this.r7 = new on(new int[]{kk7.r, kk7.s, kk7.V, kk7.U, kk7.f3});
        this.E7 = new float[]{1.0f};
        this.F7 = new float[]{1.0f};
        this.L7 = new l68(this, (byte) 23);
        this.T7 = new int[2];
        this.b8 = -1L;
        this.c8 = -1L;
        this.d8 = -1L;
        this.f8 = -1;
        this.K8 = new lm(new l68(this, b3), 180L, s33.g);
        this.S8 = new tab();
        this.T8 = new vf6();
        this.Z8 = new RectF();
        this.c9 = new l68(this, (byte) 24);
        this.d9 = new q78(this);
        paint.setColor(-16777216);
        paint2.setColor(-1);
        this.C4.T(3);
    }

    public static boolean C0() {
        return l9 != null;
    }

    public static Bitmap F(Bitmap bitmap, zl6 zl6Var, int[] iArr, boolean z) {
        int i;
        int i2;
        try {
            int i3 = 0;
            int i4 = (zl6Var.k + (iArr != null ? iArr[0] : 0)) % 360;
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
            Bitmap createBitmap = Bitmap.createBitmap((int) (zl6Var.e * f), (int) (zl6Var.f * f2), Bitmap.Config.ARGB_8888);
            Matrix matrix = new Matrix();
            matrix.postTranslate((-width) / 2, (-height) / 2);
            if (z && zl6Var.l) {
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
            matrix.postRotate(zl6Var.d + i4);
            matrix.postTranslate(zl6Var.a * f, zl6Var.b * f2);
            float f3 = zl6Var.c;
            matrix.postScale(f3, f3);
            matrix.postTranslate(r10 / 2, r11 / 2);
            new Canvas(createBitmap).drawBitmap(bitmap, matrix, new Paint(2));
            return createBitmap;
        } catch (Throwable th) {
            fa4.g(th, true);
            return null;
        }
    }

    public static boolean M0(k27 k27Var) {
        return (l9 == null || l9.B3 || !l9.e || k27Var == null || l9.T4 == null || l9.T4.e1() != k27Var.e1() || k27.B0(l9.T4.k) != k27.B0(k27Var.k)) ? false : true;
    }

    public static boolean N0(k27 k27Var) {
        return (m9 == null || k27Var == null || m9.T4 == null || m9.T4.e1() != k27Var.e1() || k27.B0(m9.T4.k) != k27.B0(k27Var.k)) ? false : true;
    }

    public static boolean O0(k27 k27Var) {
        boolean z;
        if (l9 != null && !l9.B3 && l9.e && !l9.s4 && k27Var != null) {
            k27 k27Var2 = l9.T4;
            if (k27Var2 == null && l9.d != null) {
                k27Var2 = l9.d.V();
            }
            if (k27Var2 != null && k27Var2.e1() == k27Var.e1() && k27.B0(k27Var2.k) == k27.B0(k27Var.k)) {
                z = true;
                return (!z || m9 == null) ? z : m9.e && !m9.s4 && k27Var != null && m9.T4 != null && m9.T4.e1() == k27Var.e1() && k27.B0(m9.T4.k) == k27.B0(k27Var.k);
            }
        }
        z = false;
        if (z) {
        }
    }

    public static boolean P0(String str) {
        return (l9 == null || !l9.e || l9.s4 || str == null || !str.equals(l9.e5)) ? false : true;
    }

    public static boolean Q0(TLRPC.BotInlineResult botInlineResult) {
        return (l9 == null || !l9.e || l9.s4 || botInlineResult == null || l9.Y4 == null || botInlineResult.id != l9.Y4.id) ? false : true;
    }

    public static boolean R0(TLRPC.FileLocation fileLocation) {
        if (l9 == null || !l9.e || l9.s4 || fileLocation == null) {
            return false;
        }
        if (l9.Z4 != null && fileLocation.local_id == l9.Z4.f.local_id && fileLocation.volume_id == l9.Z4.f.volume_id && fileLocation.dc_id == l9.Z4.a) {
            return true;
        }
        return l9.a5 != null && fileLocation.local_id == l9.a5.f.local_id && fileLocation.volume_id == l9.a5.f.volume_id && fileLocation.dc_id == l9.a5.a;
    }

    public static int U(bm6 bm6Var) {
        if (bm6Var.d()) {
            return gl.Y0(false);
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

    public static boolean Z1(k27 k27Var) {
        if (k27Var == null || !k27.K4(k27Var.k)) {
            return false;
        }
        if (!k27Var.z0 && !k27Var.y0 && !k27Var.D2(true) && (!k27Var.B() || !gba.x0)) {
            return false;
        }
        boolean z = gba.a;
        return e66.e(1024);
    }

    public static boolean a() {
        return Build.VERSION.SDK_INT >= 31 && gba.X && gba.o() >= 2 && !gl.m0;
    }

    public static String o0(gl5 gl5Var) {
        if (gl5Var == null || gl5Var.p != 2) {
            return null;
        }
        return "mp4";
    }

    public static PhotoViewer r0() {
        PhotoViewer photoViewer;
        PhotoViewer photoViewer2 = l9;
        if (photoViewer2 != null) {
            return photoViewer2;
        }
        synchronized (PhotoViewer.class) {
            photoViewer = l9;
            if (photoViewer == null) {
                photoViewer = new PhotoViewer();
                l9 = photoViewer;
            }
        }
        return photoViewer;
    }

    public static CharSequence r1(k27 k27Var) {
        if (k27Var.k == null) {
            return "";
        }
        Spannable A5 = k27.A5(vu3.m(new SpannableStringBuilder(k27Var.k.translatedText.text), bkb.n2.getFontMetricsInt(), false, null, 0), k27Var.k.translatedText.entities, bkb.n2.getFontMetricsInt(), false);
        if (k27.M(A5)) {
            try {
                gl.c(A5, 5, false, true);
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
        k27.h(k27Var.O3(), A5, true, 0, 0, true);
        k27.b(A5, k27Var.k.translatedText.entities, k27Var.O3(), true, true, true, 0);
        if (k27.K4(k27Var.k)) {
            k27.h(k27Var.O3(), A5, true, 3, (int) k27Var.L0(), false);
        } else if (k27Var.I3() || k27.Q4(k27Var.k)) {
            k27.h(k27Var.O3(), A5, true, 4, (int) k27Var.L0(), false);
        }
        return A5;
    }

    public static String x0() {
        return new File(ba4.z(4), gba.p() + "_temp.jpg").getAbsolutePath();
    }

    public final void A() {
        q88 q88Var = this.M1;
        Activity activity = this.E;
        l68 l68Var = new l68(this, (byte) 2);
        if (q88Var.B1) {
            q88Var.y0(false);
            return;
        }
        if (q88Var.a2) {
            q88Var.i0(true);
            return;
        }
        if (q88Var.J0 && q88Var.I0 != null) {
            q88Var.t0(null, true);
            return;
        }
        if (!q88Var.v0.a()) {
            l68Var.run();
            return;
        }
        if (activity == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, q88Var.G1, activity);
        String M0 = k96.M0(2131747085, null);
        hd hdVar = alertDialog$Builder.a;
        hdVar.U = M0;
        hdVar.S = k96.M0(2131751393, null);
        alertDialog$Builder.j(k96.M0(2131747387, null), new ry4((Object) l68Var, (byte) 15));
        alertDialog$Builder.g(k96.M0(2131752577, null), null);
        a2(alertDialog$Builder);
    }

    public final int A0() {
        int measuredHeight;
        int g0 = g0();
        k98 k98Var = this.f0;
        return (k98Var == null || (measuredHeight = k98Var.getMeasuredHeight()) <= 0) ? g0 : Math.min(g0, measuredHeight);
    }

    public final void A1(long j) {
        oy8 y;
        h98 h98Var = this.X4;
        ArrayList arrayList = h98Var.e;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                mac macVar = (mac) h98Var.e.get(i);
                if (macVar.a == 0 && (macVar.b & 1) != 0) {
                    View view = macVar.I;
                    if ((view instanceof be0) && (y = ((be0) view).getImageReceiver().y()) != null) {
                        long j2 = this.s8;
                        y.P(j - (j2 > 0 ? j2 / 1000 : 0L));
                    }
                }
            }
        }
    }

    public final void A2() {
        boolean z;
        lbc lbcVar;
        lbc lbcVar2;
        if (this.G2 == null) {
            x88 x88Var = this.g0;
            if (x88Var == null || !x88Var.y) {
                return;
            } else {
                z = x88Var.H;
            }
        } else {
            z = this.P3;
        }
        n();
        gl.r(this.y2);
        if (z) {
            o1();
        } else {
            if (!this.s1) {
                if (Math.abs(this.q3.c() - this.Y7.getRightProgress()) < 0.01f || ((lbcVar = this.G2) != null && lbcVar.S() == this.G2.U())) {
                    C1(0.0f);
                }
                z1();
            } else if (Math.abs(this.Y7.getProgress() - this.Y7.getRightProgress()) < 0.01f || ((lbcVar2 = this.G2) != null && lbcVar2.S() == this.G2.U())) {
                C1(this.Y7.getLeftProgress());
            }
            q1();
        }
        this.f0.invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0808  */
    /* JADX WARN: Removed duplicated region for block: B:163:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x01d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(boolean z, boolean z2) {
        float f;
        float f2;
        float f3;
        float f4;
        o98 o98Var;
        o98 o98Var2;
        char c;
        byte b;
        p98 M;
        int i;
        int i2;
        byte b2;
        float f5;
        x88 x88Var;
        mu1 mu1Var;
        wtc wtcVar;
        VelocityTracker velocityTracker;
        boolean z3;
        float f6;
        float[][] fArr;
        byte b3;
        int i3;
        RectF rectF;
        float min;
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
        mza mzaVar = this.p5;
        if (mzaVar != null) {
            mzaVar.W = false;
            c98 c98Var = this.t5;
            if (c98Var.o0 == 2) {
                c98Var.setCutOutState(true);
                f2(false, true);
                this.p5.f();
                this.f0.invalidate();
            }
        }
        if (!z2 && (b5 = this.u4) != 0) {
            if (b5 == 3 && this.M1 != null) {
                A();
                return;
            }
            if (b5 == 1) {
                this.E1.b(this.J2, this.K2, this.L2, this.P2, this.R2, this.O2, 1.0f, 1.0f, this.M2, this.N2, 0.0f, 0.0f, this.Q2);
            }
            if (this.u4 == 4) {
                e();
            }
            n2(0);
            return;
        }
        q98 q98Var = this.U7;
        if (q98Var != null && q98Var.getTag() != null) {
            ((TextView) this.V7.d).callOnClick();
            return;
        }
        this.f = false;
        this.m2 = false;
        try {
            hd hdVar = this.Q1;
            if (hdVar != null) {
                hdVar.dismiss();
                this.Q1 = null;
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
        if (this.f0 != null) {
            gl.r(this.v4);
            G2(true);
        }
        byte b6 = this.u4;
        byte b7 = 8;
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
                this.i7 = null;
            } else if (b6 == 4) {
                this.P1 = true;
                k98 k98Var = this.f0;
                if (k98Var != null) {
                    k98Var.invalidate();
                    this.f0.post(new h18(this, this.O1, b7));
                } else {
                    p88 p88Var = this.O1;
                    p88Var.e.h();
                    p88Var.c.postRunnable(new ql3((byte) 29));
                }
                this.O1 = null;
            }
            this.u4 = (byte) 0;
            d0().M.b(false);
            mv5 mv5Var = this.L1;
            if (mv5Var != null) {
                mv5Var.b(this.u4 != 3);
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
        if ((!this.J3 && !this.e) || r() || this.d == null) {
            return;
        }
        Activity activity = this.E;
        if (activity != null && this.Y3 != 0) {
            activity.setRequestedOrientation(this.X3);
            this.Y3 = (byte) 0;
            this.Z3 = false;
        }
        if (!this.v2) {
            ArrayList arrayList = this.g7;
            if (!arrayList.isEmpty() && (i4 = this.P4) >= 0 && i4 < arrayList.size()) {
                Object obj = arrayList.get(this.P4);
                if (obj instanceof bm6) {
                    bm6 bm6Var = (bm6) obj;
                    bm6Var.s = l0();
                    if (this.d2 == 11) {
                        bm6Var.e();
                    }
                }
            }
        }
        org.telegram.ui.ActionBar.d dVar2 = this.m4;
        if (dVar2 == null || dVar2.getFragmentView() == null) {
            f = 1.0f;
            f2 = 1.0f;
            f3 = 1.0f;
        } else {
            View fragmentView = this.m4.getFragmentView();
            f = fragmentView.getScaleX();
            f2 = fragmentView.getScaleY();
            fragmentView.setScaleX(1.0f);
            fragmentView.setScaleY(1.0f);
            x02 x02Var = this.b2;
            if (x02Var != null) {
                ww0 ww0Var = x02Var.c;
                f3 = ww0Var.getScaleX();
                f4 = ww0Var.getScaleY();
                ww0Var.setScaleX(1.0f);
                ww0Var.setScaleY(1.0f);
                o98Var = this.d;
                if (o98Var != null) {
                    o98Var.Y(this.P4);
                }
                boolean[] zArr = {true};
                o98Var2 = this.d;
                if (o98Var2 != null) {
                    b = 3;
                    M = null;
                    c = '\b';
                } else {
                    c = '\b';
                    k27 k27Var = this.T4;
                    b = 3;
                    gl5 gl5Var = this.Z4;
                    M = o98Var2.M(k27Var, gl5Var == null ? null : gl5Var.f, this.P4, true, true);
                }
                float f7 = 0.0f;
                if (this.G2 != null || M == null) {
                    i = 2;
                    i2 = 4;
                    b2 = 11;
                } else {
                    b2 = 11;
                    km m2 = M.a.m();
                    if (m2 != null) {
                        f5 = f;
                        long j = (long) (m2.h0 * 1000.0f);
                        long S = this.G2.S();
                        if (j <= 0) {
                            j = 0;
                        }
                        long j2 = S + j;
                        if (this.G2.R() == null) {
                            k27 k27Var2 = this.T4;
                            if (k27Var2 == null) {
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
                                            fa4.g(th, true);
                                        }
                                        if (document != null) {
                                            fa4.b("seeking from photo viewer to animation object");
                                            m2.y(j2, ba4.G(this.U).T(document, z5) ^ z5, z5);
                                        }
                                        imageReceiver = M.a;
                                        if (imageReceiver != null) {
                                            imageReceiver.u0 = z5;
                                            imageReceiver.w0(false);
                                        }
                                        x88Var = this.g0;
                                        if (x88Var != null) {
                                            ku3 ku3Var = x88Var.f;
                                            ku3Var.stopLoading();
                                            ku3Var.loadUrl("about:blank");
                                            ku3Var.destroy();
                                            x88Var.I = 0;
                                            x88Var.J = 0;
                                            gl.r(x88Var.M);
                                            this.f0.removeView(this.g0);
                                            this.g0 = null;
                                        }
                                        mu1Var = this.l4;
                                        if (mu1Var != null && mu1Var.getFragmentView() != null) {
                                            this.l4.getFragmentView().invalidate();
                                        }
                                        this.l4 = null;
                                        wtcVar = this.I7;
                                        if (wtcVar != null) {
                                            wtcVar.a();
                                            this.I7 = null;
                                        }
                                        ConnectionsManager.getInstance(this.U).cancelRequestsForGuid(this.c);
                                        this.K = false;
                                        velocityTracker = this.U6;
                                        if (velocityTracker != null) {
                                            velocityTracker.recycle();
                                            this.U6 = null;
                                        }
                                        if (this.J3) {
                                            this.J3 = false;
                                            this.n4 = (byte) 0;
                                            b1(M);
                                            this.f0.setScaleX(1.0f);
                                            this.f0.setScaleY(1.0f);
                                            if (!this.v2) {
                                                v1(true);
                                            }
                                        } else {
                                            BackgroundDrawable backgroundDrawable = this.M0;
                                            if (z) {
                                                ClippingImageView[] c0 = c0(M);
                                                int i5 = 0;
                                                while (true) {
                                                    int length = c0.length;
                                                    f6 = f7;
                                                    fArr = this.k4;
                                                    if (i5 >= length) {
                                                        break;
                                                    }
                                                    ClippingImageView clippingImageView = c0[i5];
                                                    boolean z6 = M == null ? false : M.r;
                                                    clippingImageView.O = fArr;
                                                    clippingImageView.L = false;
                                                    clippingImageView.N = z6;
                                                    clippingImageView.setVisibility(0);
                                                    i5++;
                                                    f7 = f6;
                                                }
                                                AnimatorSet animatorSet = new AnimatorSet();
                                                ViewGroup.LayoutParams layoutParams = this.i0.getLayoutParams();
                                                if (M != null) {
                                                    rectF = M.a.Q0;
                                                    b3 = 5;
                                                    layoutParams.width = (int) rectF.width();
                                                    layoutParams.height = (int) rectF.height();
                                                    ImageReceiver imageReceiver2 = M.a;
                                                    int i6 = imageReceiver2.V;
                                                    km m3 = imageReceiver2.m();
                                                    int i7 = m3 != null ? m3.d[i] : 0;
                                                    if (i7 != 0) {
                                                        i6 = i7;
                                                    }
                                                    for (ClippingImageView clippingImageView2 : c0) {
                                                        int i8 = M.a.W;
                                                        clippingImageView2.e = i6;
                                                        clippingImageView2.f = i8;
                                                        clippingImageView2.setImageBitmap(M.e);
                                                    }
                                                    i3 = 6;
                                                } else {
                                                    b3 = 5;
                                                    i3 = 6;
                                                    ImageReceiver imageReceiver3 = this.C4;
                                                    layoutParams.width = (int) imageReceiver3.N0;
                                                    layoutParams.height = (int) imageReceiver3.O0;
                                                    for (ClippingImageView clippingImageView3 : c0) {
                                                        ImageReceiver imageReceiver4 = this.C4;
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
                                                    float min2 = Math.min(this.D1.getMeasuredWidth(), (this.D1.getMeasuredHeight() - gl.L(64.0f)) - (!this.s ? gl.m : 0)) - (gl.L(16.0f) << 1);
                                                    min = Math.max(min2 / layoutParams.width, min2 / layoutParams.height);
                                                } else {
                                                    min = Math.min(this.h0.getMeasuredWidth() / layoutParams.width, (gl.q.y + (!this.s ? gl.m : 0)) / layoutParams.height);
                                                }
                                                float f8 = layoutParams.width;
                                                float f10 = this.a6;
                                                float f11 = layoutParams.height * f10 * min;
                                                float measuredWidth = (this.h0.getMeasuredWidth() - ((f8 * f10) * min)) / 2.0f;
                                                float measuredHeight = this.d2 == 1 ? ((this.D1.getMeasuredHeight() - (!this.s ? gl.m : 0)) - f11) / 2.0f : ((gl.q.y + (!this.s ? gl.m : 0)) - f11) / 2.0f;
                                                int i12 = 0;
                                                while (i12 < c0.length) {
                                                    c0[i12].setLayoutParams(layoutParams);
                                                    float f12 = min;
                                                    c0[i12].setTranslationX(measuredWidth + this.X5);
                                                    c0[i12].setTranslationY(this.Y5 + measuredHeight);
                                                    c0[i12].setScaleX(this.a6 * f12);
                                                    c0[i12].setScaleY(this.a6 * f12);
                                                    i12++;
                                                    min = f12;
                                                }
                                                if (M != null) {
                                                    int abs = (int) Math.abs(rectF.left - M.a.L0);
                                                    int abs2 = (int) Math.abs(rectF.top - M.a.M0);
                                                    if (M.a.S0) {
                                                        abs = 0;
                                                    }
                                                    int[] iArr = new int[i];
                                                    M.d.getLocationInWindow(iArr);
                                                    int i13 = iArr[1];
                                                    float f13 = M.c;
                                                    float f14 = rectF.top;
                                                    float f15 = f13 + f14;
                                                    int i14 = (int) ((i13 - f15) + M.j);
                                                    if (i14 < 0) {
                                                        i14 = 0;
                                                    }
                                                    int height = (int) ((((rectF.bottom - f14) + f15) - (M.d.getHeight() + i13)) + M.i);
                                                    if (height < 0) {
                                                        height = 0;
                                                    }
                                                    int max = Math.max(i14, abs2);
                                                    int max2 = Math.max(height, abs2);
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
                                                    float f16 = M.k;
                                                    fArr3[0] = f16;
                                                    fArr3[1] = f16;
                                                    fArr3[2] = (rectF.left * f16) + M.b;
                                                    fArr3[b] = (rectF.top * f16) + M.c;
                                                    float f17 = abs;
                                                    fArr3[i2] = f17 * f16;
                                                    fArr3[b3] = max * f16;
                                                    fArr3[i3] = max2 * f16;
                                                    int i15 = 0;
                                                    for (int i16 = i2; i15 < i16; i16 = 4) {
                                                        fArr[1][i15 + 7] = M.h != null ? r10[i15] : f6;
                                                        i15++;
                                                    }
                                                    float[] fArr4 = fArr[1];
                                                    float f18 = M.k;
                                                    fArr4[b2] = abs2 * f18;
                                                    fArr4[12] = f17 * f18;
                                                    ArrayList arrayList2 = new ArrayList((this.d2 == 1 ? b : (byte) 2) + c0.length + (c0.length > 1 ? 1 : 0));
                                                    int i17 = 0;
                                                    while (i17 < c0.length) {
                                                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c0[i17], rn.f, 0.0f, 1.0f);
                                                        if (i17 == 0) {
                                                            b4 = b2;
                                                            ofFloat.addUpdateListener(new f68(this, b4));
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
                                                    arrayList2.add(ObjectAnimator.ofInt(backgroundDrawable, rn.d, 0));
                                                    k98 k98Var2 = this.f0;
                                                    Property property = View.ALPHA;
                                                    arrayList2.add(ObjectAnimator.ofFloat(k98Var2, (Property<k98, Float>) property, f6));
                                                    arrayList2.add(ObjectAnimator.ofFloat(this.k0, (Property<View, Float>) property, f6));
                                                    if (this.d2 == 1) {
                                                        arrayList2.add(ObjectAnimator.ofFloat(this.D1, (Property<v48, Float>) property, f6));
                                                    }
                                                    animatorSet.playTogether(arrayList2);
                                                } else {
                                                    byte b8 = 12;
                                                    int i18 = gl.q.y + (!this.s ? gl.m : 0);
                                                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                                                    ofFloat2.addUpdateListener(new f68(this, b8));
                                                    ObjectAnimator ofInt = ObjectAnimator.ofInt(backgroundDrawable, rn.d, 0);
                                                    ClippingImageView clippingImageView4 = this.i0;
                                                    Property property2 = View.ALPHA;
                                                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(clippingImageView4, (Property<ClippingImageView, Float>) property2, f6);
                                                    ClippingImageView clippingImageView5 = this.i0;
                                                    Property property3 = View.TRANSLATION_Y;
                                                    if (this.Y5 < f6) {
                                                        i18 = -i18;
                                                    }
                                                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(clippingImageView5, (Property<ClippingImageView, Float>) property3, i18);
                                                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.f0, (Property<k98, Float>) property2, f6);
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
                                                o98 o98Var3 = this.d;
                                                if (o98Var3 != null) {
                                                    o98Var3.r();
                                                }
                                                this.p4 = new n68(this, M, (byte) 1);
                                                animatorSet.setDuration(200L);
                                                animatorSet.addListener(new e88(this, b3));
                                                if (zArr[0]) {
                                                    if (M == null || M.s) {
                                                        z4 = true;
                                                    } else {
                                                        z4 = true;
                                                        M.a.v0(false, true);
                                                    }
                                                    if (!this.v2) {
                                                        v1(z4);
                                                    }
                                                    this.n4 = b;
                                                    this.f0.invalidate();
                                                    this.o4 = System.currentTimeMillis();
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
                                                ofFloat7.addUpdateListener(new f68(this, (byte) 13));
                                                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(this.f0, (Property<k98, Float>) View.SCALE_X, 0.9f);
                                                ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(this.f0, (Property<k98, Float>) View.SCALE_Y, 0.9f);
                                                ObjectAnimator ofInt2 = ObjectAnimator.ofInt(backgroundDrawable, rn.d, 0);
                                                k98 k98Var3 = this.f0;
                                                Property property4 = View.ALPHA;
                                                byte b9 = 2;
                                                animatorSet2.playTogether(ofFloat7, ofFloat8, ofFloat9, ofInt2, ObjectAnimator.ofFloat(k98Var3, (Property<k98, Float>) property4, 0.0f), ObjectAnimator.ofFloat(this.k0, (Property<View, Float>) property4, 0.0f));
                                                o98 o98Var4 = this.d;
                                                if (o98Var4 != null) {
                                                    o98Var4.r();
                                                }
                                                this.p4 = new n68(this, M, b9);
                                                animatorSet2.setDuration(200L);
                                                animatorSet2.addListener(new e88(this, (byte) 6));
                                                if (zArr[0]) {
                                                    if (this.v2) {
                                                        z3 = true;
                                                    } else {
                                                        z3 = true;
                                                        v1(true);
                                                    }
                                                    this.n4 = (byte) 2;
                                                    this.o4 = System.currentTimeMillis();
                                                    this.f0.setLayerType(2, null);
                                                    animatorSet2.start();
                                                    if (M != null) {
                                                        M.a.v0(z3, z3);
                                                    }
                                                }
                                            }
                                            km kmVar = this.k2;
                                            if (kmVar != null) {
                                                kmVar.w(this.f0);
                                                this.k2 = null;
                                                this.C4.g0(null);
                                                this.F4.a();
                                            }
                                            o98 o98Var5 = this.d;
                                            if (o98Var5 != null && !o98Var5.T()) {
                                                this.d.t();
                                            }
                                        }
                                        dVar = this.m4;
                                        if (dVar == null || dVar.getFragmentView() == null) {
                                            return;
                                        }
                                        View fragmentView2 = this.m4.getFragmentView();
                                        fragmentView2.setScaleX(f5);
                                        fragmentView2.setScaleY(f2);
                                        x02 x02Var2 = this.b2;
                                        if (x02Var2 != null) {
                                            ww0 ww0Var2 = x02Var2.c;
                                            ww0Var2.setScaleX(f3);
                                            ww0Var2.setScaleY(f4);
                                            return;
                                        }
                                        return;
                                    }
                                    gl.y0(this.D2, m);
                                }
                                z5 = true;
                                if (document != null) {
                                }
                                imageReceiver = M.a;
                                if (imageReceiver != null) {
                                }
                                x88Var = this.g0;
                                if (x88Var != null) {
                                }
                                mu1Var = this.l4;
                                if (mu1Var != null) {
                                    this.l4.getFragmentView().invalidate();
                                }
                                this.l4 = null;
                                wtcVar = this.I7;
                                if (wtcVar != null) {
                                }
                                ConnectionsManager.getInstance(this.U).cancelRequestsForGuid(this.c);
                                this.K = false;
                                velocityTracker = this.U6;
                                if (velocityTracker != null) {
                                }
                                if (this.J3) {
                                }
                                dVar = this.m4;
                                if (dVar == null) {
                                    return;
                                } else {
                                    return;
                                }
                            }
                            R = k27Var2.F0();
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
                        imageReceiver = M.a;
                        if (imageReceiver != null) {
                        }
                        x88Var = this.g0;
                        if (x88Var != null) {
                        }
                        mu1Var = this.l4;
                        if (mu1Var != null) {
                        }
                        this.l4 = null;
                        wtcVar = this.I7;
                        if (wtcVar != null) {
                        }
                        ConnectionsManager.getInstance(this.U).cancelRequestsForGuid(this.c);
                        this.K = false;
                        velocityTracker = this.U6;
                        if (velocityTracker != null) {
                        }
                        if (this.J3) {
                        }
                        dVar = this.m4;
                        if (dVar == null) {
                        }
                    } else {
                        i = 2;
                        i2 = 4;
                    }
                }
                f5 = f;
                x88Var = this.g0;
                if (x88Var != null) {
                }
                mu1Var = this.l4;
                if (mu1Var != null) {
                }
                this.l4 = null;
                wtcVar = this.I7;
                if (wtcVar != null) {
                }
                ConnectionsManager.getInstance(this.U).cancelRequestsForGuid(this.c);
                this.K = false;
                velocityTracker = this.U6;
                if (velocityTracker != null) {
                }
                if (this.J3) {
                }
                dVar = this.m4;
                if (dVar == null) {
                }
            } else {
                f3 = 1.0f;
            }
        }
        f4 = f3;
        o98Var = this.d;
        if (o98Var != null) {
        }
        boolean[] zArr2 = {true};
        o98Var2 = this.d;
        if (o98Var2 != null) {
        }
        float f72 = 0.0f;
        if (this.G2 != null) {
        }
        i = 2;
        i2 = 4;
        b2 = 11;
        f5 = f;
        x88Var = this.g0;
        if (x88Var != null) {
        }
        mu1Var = this.l4;
        if (mu1Var != null) {
        }
        this.l4 = null;
        wtcVar = this.I7;
        if (wtcVar != null) {
        }
        ConnectionsManager.getInstance(this.U).cancelRequestsForGuid(this.c);
        this.K = false;
        velocityTracker = this.U6;
        if (velocityTracker != null) {
        }
        if (this.J3) {
        }
        dVar = this.m4;
        if (dVar == null) {
        }
    }

    public final boolean B0() {
        return b0(true) != 0;
    }

    public final void B1(long j) {
        x88 x88Var = this.g0;
        if (x88Var == null || !x88Var.y) {
            lbc lbcVar = this.G2;
            if (lbcVar != null) {
                lbcVar.o0(j);
            }
        } else {
            x88Var.i(j);
        }
        P2();
    }

    public final void B2() {
        View view = this.T3;
        if (view != null) {
            u78 u78Var = this.X0[0];
            int i = u78Var.h;
            if (!u78Var.p || (i != 3 && i != 4 && i != 2 && i != 1)) {
                view.setVisibility(4);
                return;
            }
            if (i == 3) {
                view.setContentDescription(k96.M0(2131754929, "AccActionPlay"));
            } else if (i == 2) {
                view.setContentDescription(k96.M0(2131754938, "AccActionDownload"));
            } else if (i == 1) {
                view.setContentDescription(k96.M0(2131754941, "AccActionCancelDownload"));
            } else {
                view.setContentDescription(k96.M0(2131754930, "AccActionPause"));
            }
            this.T3.setVisibility(0);
        }
    }

    public final void C() {
        boolean z = this.E2;
        xa8 xa8Var = this.V8;
        if (!z) {
            xa8Var.a(new q68(this, (byte) 1));
        } else {
            xa8Var.a(new bm0((byte) 20));
            gl.d3(new l68(this, (byte) 7));
        }
    }

    public final void C1(float f) {
        lbc lbcVar = this.G2;
        if (lbcVar != null) {
            lbcVar.o0((long) (f * lbcVar.U()));
            return;
        }
        x88 x88Var = this.g0;
        if (x88Var != null) {
            x88Var.i((long) (f * x88Var.getVideoDuration()));
        }
    }

    public final void C2() {
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
            f = Math.max(f, gl.L(48.0f));
        }
        CounterView counterView = this.P0;
        if (counterView != null && counterView.getVisibility() == 0) {
            f = Math.max(f, gl.L(100.0f));
        }
        n98 n98Var = this.N;
        ValueAnimator valueAnimator = n98Var.n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            n98Var.n = null;
        }
        n98Var.r = f;
        n98Var.c[0].setRightPadding((int) f);
        n98Var.d.setRightPadding(f);
    }

    public final void D0() {
        boolean[] zArr = this.x1;
        zArr[1] = false;
        zArr[0] = false;
        this.f0.invalidate();
    }

    public final int D1() {
        if (this.A8 > 1048576000) {
            return this.f8 - 1;
        }
        SharedPreferences c1 = na7.c1();
        int i = this.f8;
        while (i < 5) {
            Locale locale = Locale.US;
            int i2 = c1.getInt("compress_video_" + i, -1);
            if (i2 >= 0) {
                return Math.min(i2, 2);
            }
            i++;
        }
        up3 q = up3.q(this.U);
        int e = org.telegram.messenger.a.e();
        return Math.min(2, Math.round((e == 1 ? q.p().h : e == 2 ? q.o().h : q.n().h) / (100.0f / i)) - 1);
    }

    public final void D2(Object obj) {
        TLRPC.EncryptedChat encryptedChat;
        CharSequence charSequence = this.v7 ? this.w7 : obj instanceof jm6 ? ((jm6) obj).a : ((obj instanceof TLRPC.BotInlineResult) || !(obj instanceof nm6)) ? null : ((nm6) obj).I;
        if (TextUtils.isEmpty(charSequence)) {
            d0().setText("");
        } else {
            d0().setText(gm.cloneSpans(charSequence, 3));
        }
        gt3 editText = d0().f.getEditText();
        mu1 mu1Var = this.l4;
        editText.setAllowTextEntitiesIntersection(mu1Var != null && ((encryptedChat = mu1Var.h) == null || gl.W0(encryptedChat.layer) >= 101));
    }

    public final void E() {
        if (this.D1 != null) {
            return;
        }
        v48 v48Var = new v48(this.F, this.w2);
        this.D1 = v48Var;
        v48Var.setVisibility(8);
        this.D1.a();
        this.f0.addView(this.D1, this.f0.indexOfChild(this.X7) - 1, nme.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        this.D1.setDelegate(new d78(this));
    }

    public final void E0() {
        v48 v48Var = this.D1;
        if (v48Var != null) {
            v48Var.b(null, 0, false, false, null, null, null);
            if (this.d2 != 1) {
                return;
            }
            CropAreaView cropAreaView = this.D1.b.a;
            cropAreaView.f(true, false);
            cropAreaView.setDimVisibility(true);
            cropAreaView.invalidate();
            this.D1.setVisibility(0);
            this.D1.setAlpha(1.0f);
            j33 j33Var = this.D1.b;
            j33Var.q();
            CropAreaView cropAreaView2 = j33Var.a;
            cropAreaView2.setDimVisibility(true);
            cropAreaView2.f(true, true);
            cropAreaView2.invalidate();
            this.u2 = true;
        }
    }

    public final void E1(final boolean z, final int i, final int i2, final boolean z2, final boolean z3, boolean z4) {
        byte b;
        float f;
        boolean z5;
        oac oacVar;
        String str;
        char c;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        zl6 zl6Var;
        zl6 zl6Var2;
        TLRPC.Chat chat;
        int i3;
        mu1 mu1Var;
        ul5 ul5Var;
        String str2;
        long j;
        String M0;
        TextureView textureView;
        if (J0() || this.d == null || this.v2) {
            return;
        }
        byte b2 = 1;
        if (this.d2 == 1) {
            if (!z4 && (ul5Var = this.p2) != null) {
                TLObject tLObject = ul5Var.a;
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
                int L = gl.L(8.0f);
                hd hdVar = alertDialog$Builder.a;
                hdVar.W0 = L;
                Context context = this.f0.getContext();
                ebb ebbVar = new ebb(context);
                ImageReceiver imageReceiver = new ImageReceiver(ebbVar);
                ebbVar.a = imageReceiver;
                ImageReceiver imageReceiver2 = new ImageReceiver(ebbVar);
                ebbVar.b = imageReceiver2;
                pb0 pb0Var = new pb0((wjb) null);
                ebbVar.e = new Path();
                pb0Var.q(y6c.h(y6c.t0).f());
                imageReceiver.U(y6c.h(y6c.t0).f(), pb0Var, null);
                imageReceiver2.U(y6c.h(y6c.t0).f(), pb0Var, null);
                Drawable drawable = context.getDrawable(R.drawable.msg_arrow_avatar);
                ebbVar.f = drawable;
                drawable.setAlpha(100);
                TLObject tLObject2 = this.p2.a;
                k98 k98Var = this.f0;
                v48 v48Var = this.D1;
                pb0Var.k(tLObject2);
                imageReceiver.U(tLObject2, pb0Var, null);
                ebbVar.c = k98Var;
                ebbVar.d = v48Var;
                hdVar.W = ebbVar;
                if (this.p2.c == 1) {
                    if (y6c.h(this.U).n == j) {
                        hdVar.U = gl.T2(k96.M0(2131745307, "SetUserPhotoSelfAlertMessage"));
                    } else {
                        hdVar.U = gl.T2(k96.a0(null, null, 2131745308, str2, str2));
                    }
                    M0 = this.I4 ? k96.M0(2131745305, "SetVideo") : k96.M0(2131745327, "SetPhoto");
                } else {
                    if (this.I4) {
                        hdVar.U = gl.T2(k96.a0(null, null, 2131744155, str2));
                    } else {
                        hdVar.U = gl.T2(k96.a0(null, null, 2131744166, str2));
                    }
                    M0 = k96.M0(2131744164, "SuggestPhotoShort");
                }
                String str4 = M0;
                alertDialog$Builder.g(k96.M0(2131752577, "Cancel"), new fi7((byte) 27));
                alertDialog$Builder.j(str4, new ed() { // from class: a78
                    @Override // ed
                    public final void u(hd hdVar2, int i4) {
                        Drawable[] drawableArr = PhotoViewer.f9;
                        PhotoViewer.this.E1(z, i, i2, z2, z3, true);
                    }
                });
                hdVar.J = bkb.fh;
                hdVar.U0 = true;
                hdVar.j(bm2.o(-15461356, kk7.h3));
                hdVar.show();
                hdVar.o(bkb.w0(null, bkb.dh, false));
                hdVar.setOnDismissListener(new xe3(this, b2));
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
                    fa4.g(th, true);
                    return;
                }
            }
            e();
        }
        if (!z2 && (mu1Var = this.l4) != null) {
            TLRPC.Chat chat2 = mu1Var.e;
            if (mu1Var.h() != null || ((hc2.T(chat2) && chat2.megagroup) || !hc2.T(chat2))) {
                na7.q1(this.U).W3.edit().putBoolean("silent_" + this.l4.a(), !z).commit();
            }
        }
        oac l0 = l0();
        ArrayList arrayList = this.g7;
        if (!arrayList.isEmpty() && (i3 = this.P4) >= 0 && i3 < arrayList.size()) {
            Object obj = arrayList.get(this.P4);
            if (obj instanceof bm6) {
                ((bm6) obj).s = l0;
            }
        }
        mu1 mu1Var2 = this.l4;
        if (mu1Var2 != null && (chat = mu1Var2.e) != null && this.d2 != 11) {
            if (this.s1 || l0 != null) {
                if (!hc2.u(chat)) {
                    yjb.x(null, 2131749363, new u21(this.f0, this.w2), null);
                    return;
                }
            } else if (!hc2.p(chat)) {
                yjb.x(null, 2131749367, new u21(this.f0, this.w2), null);
                return;
            }
        }
        this.v2 = true;
        if (l0 != null) {
            long j3 = (long) (l0.q * 0.9f);
            if ((j3 > 2097152000 && !y6c.h(this.U).p()) || j3 > 4194304000L) {
                if (this.b2 != null) {
                    x02 x02Var = this.b2;
                    new h26(6, y6c.t0, null, x02Var.c.getContext(), x02Var.Z1).show();
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
                Object obj2 = arrayList.get(this.P4);
                if (obj2 instanceof jm6) {
                    jm6 jm6Var = (jm6) obj2;
                    Bitmap createBitmap = Bitmap.createBitmap(512, 512, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    Path path = new Path();
                    RectF rectF = new RectF();
                    rectF.set(0.0f, 0.0f, createBitmap.getWidth(), createBitmap.getHeight());
                    float width = createBitmap.getWidth() / 8;
                    path.addRoundRect(rectF, width, width, Path.Direction.CW);
                    canvas.clipPath(path);
                    int i0 = i0(this.u4);
                    g0();
                    float L2 = i0 - gl.L(20.0f);
                    mza mzaVar = this.p5;
                    if (mzaVar == null || !mzaVar.j0 || mzaVar.getSourceBitmap() == null) {
                        canvas.save();
                        canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                        canvas.scale(createBitmap.getWidth() / L2, createBitmap.getHeight() / L2);
                        g(canvas);
                        this.C4.h(canvas, null);
                        canvas.restore();
                    } else {
                        canvas.save();
                        canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                        canvas.scale(createBitmap.getWidth() / L2, createBitmap.getHeight() / L2);
                        g(canvas);
                        this.p5.g(canvas, false, null, false);
                        canvas.restore();
                        canvas.save();
                        canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                        canvas.scale(createBitmap.getWidth() / L2, createBitmap.getHeight() / L2);
                        g(canvas);
                        this.C4.h(canvas, null);
                        canvas.restore();
                        canvas.save();
                        canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                        canvas.scale(createBitmap.getWidth() / L2, createBitmap.getHeight() / L2);
                        g(canvas);
                        this.p5.g(canvas, true, null, false);
                        canvas.restore();
                    }
                    if (this.y4 != null) {
                        canvas.save();
                        canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                        canvas.scale(createBitmap.getWidth() / L2, createBitmap.getHeight() / L2);
                        g(canvas);
                        ImageReceiver imageReceiver3 = this.C4;
                        canvas.translate((-imageReceiver3.N0) / 2.0f, (-imageReceiver3.O0) / 2.0f);
                        f = 2.0f;
                        canvas.scale(this.C4.N0 / this.y4.getMeasuredWidth(), this.C4.O0 / this.y4.getMeasuredHeight());
                        this.y4.e = !B0();
                        this.y4.draw(canvas);
                        this.y4.e = true;
                        canvas.restore();
                    } else {
                        f = 2.0f;
                    }
                    if (B0()) {
                        Matrix matrix = new Matrix();
                        matrix.reset();
                        float f7 = L2 / f;
                        matrix.preTranslate(f7, f7);
                        if (this.p6 != null) {
                            f6 = gl.R1(0.0f, this.g6, this.l6);
                            c = 5;
                            f2 = gl.R1(this.a6, this.e6, this.l6);
                            f3 = gl.R1(this.b6, this.f6, this.l6);
                            f4 = gl.R1(this.Y5, this.d6, this.l6);
                            f5 = gl.R1(this.X5, this.c6, this.l6);
                        } else {
                            c = 5;
                            f2 = this.a6;
                            f3 = this.b6;
                            f4 = this.Y5;
                            f5 = this.X5;
                            if (this.n6 != 0) {
                                f5 = this.c6;
                                f4 = this.d6;
                                f2 = this.e6;
                            }
                            f6 = 0.0f;
                        }
                        int i02 = i0(this.u4);
                        int g0 = g0();
                        matrix.preTranslate(f5, f4 + 0.0f);
                        matrix.preScale(f2, f2);
                        matrix.preRotate(f3);
                        int q = this.C4.q();
                        int o = this.C4.o();
                        float f8 = i02;
                        float f10 = g0;
                        float min = Math.min(f8 / q, f10 / o);
                        c33 c33Var = this.E1;
                        int i4 = c33Var.i;
                        if (i4 == 90 || i4 == 270) {
                            o = q;
                            q = o;
                        }
                        float f11 = c33Var.j;
                        float f12 = c33Var.k;
                        float f13 = q;
                        float f14 = o;
                        float f15 = f8 / ((int) ((((1.0f - f11) * 0.0f) + f11) * f13));
                        float f16 = (int) ((((1.0f - f12) * 0.0f) + f12) * f14);
                        if (f15 * f16 > f10) {
                            f15 = f10 / f16;
                        }
                        int i5 = this.d2;
                        h98 h98Var = this.X4;
                        if (i5 == 1 || c33Var.a) {
                            TextureView textureView2 = this.C2;
                            if (textureView2 != null) {
                                zl6 zl6Var3 = h98Var.c;
                                textureView2.setScaleX((zl6Var3 == null || !zl6Var3.l) ? 1.0f : -1.0f);
                                j98 j98Var = this.F2;
                                if (j98Var != null) {
                                    j98Var.setScaleX(this.C2.getScaleX());
                                }
                            }
                            zl6 zl6Var4 = h98Var.c;
                            float f17 = zl6Var4 != null ? zl6Var4.c : 1.0f;
                            float A = ((f15 / min) / tb4.A(f17, 1.0f, 0.0f, 1.0f)) * f17;
                            matrix.preTranslate(c33Var.d * 1.0f, c33Var.e * 1.0f);
                            matrix.preScale(A, A);
                            matrix.preTranslate(yjb.C(c33Var.b, f13, min, 1.0f), yjb.C(c33Var.c, f14, min, 1.0f));
                            float f18 = c33Var.g + i4;
                            if (f18 > 180.0f) {
                                f18 -= 360.0f;
                            }
                            matrix.preRotate(f18);
                        }
                        if (!arrayList.isEmpty() && (zl6Var2 = h98Var.c) != null && zl6Var2.l) {
                            matrix.preScale(-1.0f, 1.0f);
                        }
                        if (f6 > 0.0f) {
                            matrix.preScale(1.0f - (f6 * f), 1.0f);
                            matrix.preSkew(0.0f, tb4.z(1.0f, f6, 4.0f * f6, 0.25f));
                        }
                        ImageReceiver imageReceiver4 = this.C4;
                        matrix.preTranslate((-imageReceiver4.N0) / f, (-imageReceiver4.O0) / f);
                        ImageReceiver imageReceiver5 = this.C4;
                        matrix.preScale(imageReceiver5.N0, imageReceiver5.O0);
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = jm6Var.p;
                        int size = arrayList3.size();
                        int i6 = 0;
                        String str5 = null;
                        while (i6 < size) {
                            Object obj3 = arrayList3.get(i6);
                            i6++;
                            mac a = ((mac) obj3).a();
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
                            if (jm6Var.w && (zl6Var = jm6Var.A) != null) {
                                a.e = (float) (a.e - ((zl6Var.k / 180.0f) * 3.141592653589793d));
                            }
                            a.e = (float) (a.e - ((this.b6 / 180.0f) * 3.141592653589793d));
                            arrayList2.add(a);
                            TLRPC.Document document = a.B;
                            if (document != null && str5 == null) {
                                str5 = k27.V(document, null, null);
                            }
                            arrayList3 = arrayList4;
                            matrix = matrix2;
                            size = i7;
                        }
                        oac oacVar2 = new oac();
                        oacVar2.I = true;
                        oacVar2.k = 512;
                        oacVar2.h = 512;
                        oacVar2.l = 512;
                        oacVar2.i = 512;
                        oacVar2.G = arrayList2;
                        long k = Utilities.k(jm6Var.t, 2999L, 800L);
                        oacVar2.r = k;
                        oacVar2.v = k;
                        oacVar2.m = 200000;
                        oacVar2.n = 30;
                        z5 = true;
                        oacVar2.N = true;
                        oacVar2.q = 262144L;
                        oacVar = oacVar2;
                        str = str5;
                    } else {
                        z5 = true;
                        oacVar = null;
                        str = null;
                    }
                    TLRPC.PhotoSize V = fl5.V(createBitmap, Bitmap.CompressFormat.WEBP, 512.0f, 512.0f, 100);
                    ba4.G(y6c.t0);
                    String file = ba4.J(V, "webp", z5, z5).toString();
                    if (oacVar != null) {
                        oacVar.o = file;
                    }
                    ArrayList arrayList5 = this.r5;
                    if (arrayList5 == null) {
                        arrayList5 = new ArrayList();
                        this.r5 = arrayList5;
                    }
                    if (arrayList5.isEmpty()) {
                        String str6 = this.p5.d0;
                        if (str6 == null || vu3.g(str6) == null) {
                            ArrayList arrayList6 = this.r5;
                            if (str != null) {
                                arrayList6.add(str);
                            } else {
                                arrayList6.add("👍");
                            }
                        } else {
                            this.r5.add(this.p5.d0);
                        }
                    }
                    this.v2 = false;
                    xv2 e = xv2.e();
                    mza mzaVar2 = this.p5;
                    ArrayList arrayList7 = this.r5;
                    b88 b88Var = new b88(this, file, oacVar, jm6Var, z, i, i2, z3);
                    tv2 tv2Var = e.U;
                    Activity W = gl.W(mzaVar2.getContext());
                    if (W != null) {
                        e.l(W);
                        e.k(b88Var);
                        s3a s3aVar = new s3a();
                        s3aVar.a = file;
                        s3aVar.g = oacVar;
                        e.o = arrayList7;
                        e.i(null, s3aVar, null, null, null, 3, false, null, new f53(), 0);
                        gl.r(tv2Var);
                        gl.e3(tv2Var, 16L);
                        return;
                    }
                    return;
                }
            }
            b = 5;
            this.d.L(this.P4, l0, z, i, i2, z3);
        }
        if (this.P) {
            if (this.Q) {
                gl.e3(new y68(this, b), 200L);
            } else {
                B(false, false);
            }
        }
    }

    public final void E2() {
        int i;
        k27 k27Var;
        TLRPC.Message message;
        ArrayList arrayList = this.Y6;
        if (arrayList.isEmpty() || (i = this.Q4) < 0 || i >= arrayList.size() || (k27Var = (k27) arrayList.get(this.Q4)) == null) {
            return;
        }
        if (!this.n5 || (message = k27Var.k) == null || message.translatedText == null || !TextUtils.equals(message.translatedToLanguage, rzb.G0())) {
            I1(k27Var, k27Var.z, this.n5, true);
        } else {
            I1(k27Var, r1(k27Var), false, true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00b4 A[Catch: Exception -> 0x00f9, LOOP:0: B:13:0x00ae->B:15:0x00b4, LOOP_END, TryCatch #0 {Exception -> 0x00f9, blocks: (B:7:0x002f, B:9:0x0033, B:12:0x0097, B:13:0x00ae, B:15:0x00b4, B:17:0x00b8, B:50:0x0093, B:51:0x00e5, B:35:0x0048, B:37:0x004e, B:39:0x0056, B:41:0x005e, B:43:0x0066, B:45:0x006c, B:46:0x0088), top: B:6:0x002f, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b8 A[EDGE_INSN: B:16:0x00b8->B:17:0x00b8 BREAK  A[LOOP:0: B:13:0x00ae->B:15:0x00b4], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void F0(int i) {
        String valueOf;
        int intValue;
        InputStream open;
        ByteArrayOutputStream byteArrayOutputStream;
        byte[] bArr;
        int read;
        if (this.t4) {
            x88 x88Var = new x88(this, this, this.E, this.w0);
            this.g0 = x88Var;
            TLRPC.WebPage webPage = k27.n1(this.T4.k).webpage;
            x88Var.E = webPage;
            x88Var.x = stc.e(webPage.embed_url);
            String str = webPage.url;
            x88Var.requestLayout();
            try {
                if (x88Var.x != null) {
                    x88Var.h.setVisibility(0);
                    x88Var.y = true;
                    x88Var.f.addJavascriptInterface(new z98(x88Var), "YoutubeProxy");
                    if (str != null) {
                        try {
                            Uri parse = Uri.parse(str);
                            valueOf = i > 0 ? String.valueOf(i) : null;
                            if (valueOf == null && (valueOf = parse.getQueryParameter("t")) == null) {
                                valueOf = parse.getQueryParameter("time_continue");
                            }
                        } catch (Exception e) {
                            fa4.g(e, true);
                        }
                        if (valueOf != null) {
                            if (valueOf.contains("m")) {
                                String[] split = valueOf.split("m");
                                intValue = (Utilities.z(split[0]).intValue() * 60) + Utilities.z(split[1]).intValue();
                            } else {
                                intValue = Utilities.z(valueOf).intValue();
                            }
                            open = x88Var.getContext().getAssets().open("youtube_embed.html");
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
                            x88Var.f.loadDataWithBaseURL("https://messenger.telegram.org/", String.format(Locale.US, byteArrayOutputStream.toString("UTF-8"), x88Var.x, Integer.valueOf(intValue)), "text/html", "UTF-8", "https://youtube.com");
                        }
                    }
                    intValue = 0;
                    open = x88Var.getContext().getAssets().open("youtube_embed.html");
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
                    x88Var.f.loadDataWithBaseURL("https://messenger.telegram.org/", String.format(Locale.US, byteArrayOutputStream.toString("UTF-8"), x88Var.x, Integer.valueOf(intValue)), "text/html", "UTF-8", "https://youtube.com");
                } else {
                    HashMap hashMap = new HashMap();
                    hashMap.put("Referer", "messenger.telegram.org");
                    x88Var.f.loadUrl(webPage.embed_url, hashMap);
                }
            } catch (Exception e2) {
                fa4.g(e2, true);
            }
            x88Var.r.setEnabled(false);
            x88Var.r.setAlpha(0.5f);
            x88Var.n.setVisibility(0);
            if (x88Var.x != null) {
                x88Var.h.setVisibility(0);
            }
            x88Var.f.setVisibility(0);
            x88Var.f.setKeepScreenOn(true);
            if (x88Var.x != null && "disabled".equals(na7.q1(x88Var.a).k4.I0.f)) {
                x88Var.r.setVisibility(8);
            }
            this.g0.setPlaybackSpeed(this.u1);
            this.f0.addView(this.g0, 0, nme.c(-1.0f, -1));
            if (this.g0.y) {
                X1(true, true);
            }
            tbc tbcVar = this.q3;
            tbcVar.F = null;
            tbcVar.J = -1;
            tbcVar.I = 0.0f;
            StaticLayout[] staticLayoutArr = tbcVar.K;
            if (staticLayoutArr != null) {
                staticLayoutArr[1] = null;
                staticLayoutArr[0] = null;
            }
            tbcVar.G = null;
            tbcVar.H = -1L;
            P2();
            this.b3 = null;
            this.c3 = null;
            this.d3 = 0L;
            this.a3 = this.e3;
            this.q3.h(false, 0.0f);
            this.Y7.setProgress(0.0f);
            this.q3.f(0.0f);
        }
    }

    public final void F1(ul5 ul5Var) {
        String str;
        int i;
        TLRPC.User user;
        this.p2 = ul5Var;
        if (this.d2 == 1) {
            if (S2()) {
                this.o0.setVisibility(0);
                this.T0.setVisibility(8);
            } else {
                this.T0.setVisibility(0);
                this.o0.setVisibility(8);
            }
            if (ul5Var == null || (user = ul5Var.b) == null || ul5Var.c != 1 || !this.p2.d) {
                this.D1.setSubtitle(null);
            } else {
                boolean z = ul5Var.e;
                v48 v48Var = this.D1;
                String str2 = user.first_name;
                if (z) {
                    v48Var.setSubtitle(k96.a0(null, null, 2131745320, str2));
                } else {
                    v48Var.setSubtitle(k96.a0(null, null, 2131745321, str2));
                }
            }
        }
        if (ul5Var != null) {
            if (ul5Var.c == 2) {
                if (ul5Var.e) {
                    str = "SuggestVideo";
                    i = 2131744156;
                } else {
                    str = "SuggestPhoto";
                    i = 2131744167;
                }
                W1(k96.M0(i, str));
            }
            if (ul5Var.e) {
                this.Z7.setText(k96.M0(2131745343, "SetCover"));
            }
            this.G.setBackground(null);
            this.G.setElevation(2.0f);
        }
    }

    public final void F2() {
        int i = bkb.pg;
        int y0 = y0(i);
        jh3 jh3Var = this.T0;
        if (jh3Var != null) {
            jh3Var.k();
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
        z92 z92Var = this.V0;
        if (z92Var != null) {
            ((TextView) z92Var.b).setTextColor(y0);
        }
        z92 z92Var2 = this.V7;
        if (z92Var2 != null) {
            ((TextView) z92Var2.b).setTextColor(y0);
        }
        q88 q88Var = this.M1;
        if (q88Var != null) {
            q88Var.updateColors();
        }
        l58 l58Var = this.J1;
        if (l58Var != null) {
            ImageView imageView6 = l58Var.C0;
            ImageView imageView7 = l58Var.B0;
            ImageView imageView8 = l58Var.A0;
            wjb wjbVar = l58Var.J0;
            TextView textView = l58Var.h0;
            if (textView != null) {
                textView.setTextColor(bkb.v0(i, wjbVar));
            }
            if (imageView8 != null && imageView8.getColorFilter() != null) {
                imageView8.setColorFilter(new PorterDuffColorFilter(bkb.v0(i, wjbVar), mode));
            }
            if (imageView7 != null && imageView7.getColorFilter() != null) {
                imageView7.setColorFilter(new PorterDuffColorFilter(bkb.v0(i, wjbVar), mode));
            }
            if (imageView6 != null && imageView6.getColorFilter() != null) {
                imageView6.setColorFilter(new PorterDuffColorFilter(bkb.v0(i, wjbVar), mode));
            }
            l58Var.f();
        }
        y78 y78Var = this.V1;
        if (y78Var != null) {
            y78Var.H(this.w2);
        }
        z78 z78Var = this.W1;
        if (z78Var != null) {
            z78Var.H(this.w2);
        }
        v78 v78Var = this.Y7;
        if (v78Var != null) {
            v78Var.invalidate();
        }
        t98 t98Var = this.p1;
        if (t98Var != null) {
            int childCount = t98Var.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = this.p1.getChildAt(i2);
                if (childAt instanceof y58) {
                    ((y58) childAt).c.b(bkb.V9, bkb.W9, bkb.U9);
                }
            }
        }
        o78 o78Var = this.U3;
        if (o78Var != null) {
            o78Var.R0(true);
        }
    }

    public final void G() {
        zl6 zl6Var;
        if (this.O1 != null) {
            return;
        }
        if (this.d2 == 1) {
            zl6Var = new zl6();
            zl6Var.k = this.E1.i;
        } else {
            zl6Var = this.X4.c;
        }
        zl6 zl6Var2 = zl6Var;
        int q = this.C4.q();
        int o = this.C4.o();
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap createBitmap = Bitmap.createBitmap(q, o, config);
        mza mzaVar = this.p5;
        if (mzaVar != null && mzaVar.getSourceBitmap() != null) {
            Bitmap sourceBitmap = this.p5.getSourceBitmap();
            Canvas canvas = new Canvas(createBitmap);
            canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
            canvas.rotate(this.p5.K);
            float width = createBitmap.getWidth() / ((this.p5.K / 90) % 2 != 0 ? sourceBitmap.getHeight() : sourceBitmap.getWidth());
            RectF rectF = gl.P;
            rectF.set(((-sourceBitmap.getWidth()) / 2.0f) * width, ((-sourceBitmap.getHeight()) / 2.0f) * width, (sourceBitmap.getWidth() / 2.0f) * width, (sourceBitmap.getHeight() / 2.0f) * width);
            canvas.drawBitmap(sourceBitmap, (Rect) null, rectF, new Paint(3));
        }
        Bitmap createBitmap2 = Bitmap.createBitmap(this.C4.q(), this.C4.o(), config);
        if (this.C4.n() != null) {
            Bitmap n = this.C4.n();
            Canvas canvas2 = new Canvas(createBitmap2);
            canvas2.translate(createBitmap2.getWidth() / 2.0f, createBitmap2.getHeight() / 2.0f);
            canvas2.rotate(this.C4.V);
            float width2 = createBitmap2.getWidth() / ((this.C4.V / 90) % 2 != 0 ? n.getHeight() : n.getWidth());
            RectF rectF2 = gl.P;
            rectF2.set(((-n.getWidth()) / 2.0f) * width2, ((-n.getHeight()) / 2.0f) * width2, (n.getWidth() / 2.0f) * width2, (n.getHeight() / 2.0f) * width2);
            canvas2.drawBitmap(n, (Rect) null, rectF2, new Paint(3));
        }
        p88 p88Var = new p88(this, this.E, this.U, createBitmap2, createBitmap, this.C4.V, zl6Var2);
        this.O1 = p88Var;
        p88Var.s.setOnClickListener(new j68(this, (byte) 5));
        this.O1.w.setOnClickListener(new j68(this, (byte) 6));
        this.O1.setEraser(this.N1);
        int indexOfChild = this.f0.indexOfChild(this.u5) - 1;
        if (indexOfChild < 0) {
            indexOfChild = this.f0.getChildCount();
        }
        this.f0.addView(this.O1, indexOfChild, nme.c(-1.0f, -1));
        this.P1 = false;
    }

    public final void G0() {
        mza mzaVar = this.p5;
        if (mzaVar == null || !mzaVar.W) {
            e59 e59Var = this.a0;
            if (e59Var != null) {
                Iterator it = e59Var.iterator();
                while (it.hasNext()) {
                    gl0 gl0Var = ((il0) it.next()).h0;
                    if (gl0Var != null) {
                        gl0Var.h = true;
                    }
                }
            }
            e59 e59Var2 = this.b0;
            if (e59Var2 != null) {
                Iterator it2 = e59Var2.iterator();
                while (it2.hasNext()) {
                    ((View) it2.next()).invalidate();
                }
            }
            y78 y78Var = this.V1;
            if (y78Var != null) {
                y78Var.m();
            }
            z78 z78Var = this.W1;
            if (z78Var != null) {
                z78Var.m();
            }
            c98 c98Var = this.t5;
            if (c98Var != null) {
                c98Var.invalidate();
            }
            c98 c98Var2 = this.v5;
            if (c98Var2 != null) {
                c98Var2.invalidate();
            }
            c98 c98Var3 = this.w5;
            if (c98Var3 != null) {
                c98Var3.invalidate();
            }
            c98 c98Var4 = this.x5;
            if (c98Var4 != null) {
                c98Var4.invalidate();
            }
            c98 c98Var5 = this.y5;
            if (c98Var5 != null) {
                c98Var5.invalidate();
            }
            v78 v78Var = this.Y7;
            if (v78Var != null && v78Var.f0) {
                v78Var.invalidate();
            }
            k98 k98Var = this.f0;
            if (k98Var != null) {
                k98Var.invalidate();
            }
        }
    }

    public final void G1(boolean z) {
        if (this.o2 != z) {
            this.o2 = z;
            this.R1.setLayerType(2, null);
            this.R1.getCurrentView().setLayerType(2, null);
            this.R1.getNextView().setLayerType(2, null);
        }
    }

    public final void G2(boolean z) {
        k98 k98Var;
        if (this.d2 == 1 || (k98Var = this.f0) == null) {
            return;
        }
        this.f0.setSystemUiVisibility(!z ? (k98Var.getPaddingLeft() > 0 || this.f0.getPaddingRight() > 0) ? 5894 : 1796 : 1792);
    }

    public final void H() {
        int q;
        int o;
        zl6 zl6Var;
        if (this.M1 == null) {
            TextureView textureView = this.C2;
            if (textureView != null) {
                kac kacVar = (kac) textureView;
                q = kacVar.getVideoWidth();
                o = kacVar.getVideoHeight();
                while (true) {
                    if (q <= 1280 && o <= 1280) {
                        break;
                    }
                    q /= 2;
                    o /= 2;
                }
            } else {
                q = this.C4.q();
                o = this.C4.o();
            }
            Bitmap bitmap = this.y4.getBitmap();
            if (bitmap == null) {
                bitmap = Bitmap.createBitmap(q, o, Bitmap.Config.ARGB_8888);
            }
            Bitmap bitmap2 = bitmap;
            int i = this.d2;
            h98 h98Var = this.X4;
            if (i == 1) {
                zl6Var = new zl6();
                zl6Var.k = this.E1.i;
            } else {
                zl6Var = h98Var.c;
            }
            zl6 zl6Var2 = zl6Var;
            mv5 mv5Var = new mv5(this.h0, false, new q68(this, (byte) 3));
            mv5Var.f = true;
            mv5Var.g = true;
            this.L1 = mv5Var;
            mv5Var.b(this.u4 != 3);
            Activity activity = this.E;
            q88 q88Var = new q88(this, activity, activity, this.U, bitmap2, this.s1 ? null : this.C4.n(), this.C4.V, h98Var.e, zl6Var2, new l68(this, (byte) 10), this.w2);
            this.M1 = q88Var;
            il0 c = this.Z.c(q88Var.S0, null, false);
            c.p(nod.i(this.w2));
            q88Var.setBlurredBackgroundDrawableForTools(c);
            this.f0.addView(this.M1.getView(), nme.c(-1.0f, -1));
            this.M1.setOnDoneButtonClickedListener(new l68(this, (byte) 11));
            this.M1.getCancelView().setOnClickListener(new j68(this, (byte) 9));
            this.M1.v0(gl.L(126.0f));
            this.M1.setOffsetTranslationX(-gl.L(12.0f));
        }
    }

    public final void H0() {
        xa8 xa8Var = this.V8;
        if (xa8Var != null) {
            xa8Var.c();
        }
    }

    public final void H1() {
        kac kacVar;
        if (this.h2 || this.d2 != 1) {
            return;
        }
        if (!this.s1 || ((kacVar = (kac) this.C2) != null && kacVar.getVideoWidth() > 0 && kacVar.getVideoHeight() > 0)) {
            this.h2 = true;
            Bitmap n = this.C4.n();
            int i = this.C4.V;
            if (n == null) {
                n = this.i0.getBitmap();
                i = this.i0.getOrientation();
            }
            Bitmap bitmap = n;
            int i2 = i;
            if (bitmap == null && this.C2 == null) {
                return;
            }
            this.D1.b(bitmap, i2, false, false, this.E1, this.s1 ? (kac) this.C2 : null, this.X4.c);
        }
    }

    public final void H2(float f) {
        m88 m88Var = this.z2;
        if (m88Var != null && m88Var.getVisibility() == 0 && this.H3) {
            View view = this.E2 ? this.D2 : this.C2;
            f *= Math.min(i0(this.u4) / view.getMeasuredWidth(), A0() / view.getMeasuredHeight());
        }
        ImageReceiver imageReceiver = this.C4;
        float f2 = imageReceiver.N0;
        float f3 = imageReceiver.O0;
        zl6 zl6Var = this.X4.c;
        if (zl6Var != null) {
            f2 *= zl6Var.e;
            f3 *= zl6Var.f;
        }
        int i0 = this.d2 == 11 ? (int) (f2 * f) : ((int) ((f2 * f) - i0(this.u4))) / 2;
        int g0 = this.d2 == 11 ? (int) (f3 * f) : ((int) ((f3 * f) - g0())) / 2;
        if (i0 > 0) {
            this.E6 = -i0;
            this.F6 = i0;
        } else {
            this.F6 = 0.0f;
            this.E6 = 0.0f;
        }
        if (g0 > 0) {
            this.G6 = -g0;
            this.H6 = g0;
        } else {
            this.H6 = 0.0f;
            this.G6 = 0.0f;
        }
        q88 q88Var = this.M1;
        if (q88Var != null) {
            boolean z = f <= 1.1f;
            LinearLayout linearLayout = q88Var.n1;
            boolean z2 = !z;
            if (q88Var.S1 != z2) {
                q88Var.S1 = z2;
                linearLayout.animate().cancel();
                ug8.t(linearLayout.animate().alpha(z ? 0.0f : 1.0f), s33.h, 240L);
            }
        }
    }

    public final void I() {
        u98 u98Var = new u98(this.f0.getContext(), this);
        this.i3 = u98Var;
        this.f0.addView(u98Var, nme.e(-1, 48, 83));
        byte b = 25;
        pj4 pj4Var = new pj4(this, b);
        g88 g88Var = new g88(this, pj4Var);
        sb sbVar = new sb(b, this.f0.getContext(), this);
        this.r3 = sbVar;
        sbVar.setAccessibilityDelegate(g88Var);
        this.r3.setImportantForAccessibility(1);
        this.i3.addView(this.r3, nme.c(-1.0f, -1));
        tbc tbcVar = new tbc(this.r3);
        this.q3 = tbcVar;
        tbcVar.z = gl.L(2.0f);
        tbc tbcVar2 = this.q3;
        tbcVar2.k = 872415231;
        tbcVar2.l = 872415231;
        tbcVar2.m = -1;
        tbcVar2.n = -1;
        tbcVar2.A = 1509949439;
        tbcVar2.j = pj4Var;
        h88 h88Var = new h88(this, this.f0.getContext(), new r68(this));
        this.s3 = h88Var;
        h88Var.setAlpha(0.0f);
        this.f0.addView(this.s3, nme.d(-2, -2.0f, 83, 0.0f, 0.0f, 0.0f, 58.0f));
        jia jiaVar = new jia(this.f0.getContext());
        this.o3 = jiaVar;
        jiaVar.setTextColor(-1);
        this.o3.setGravity(53);
        this.o3.setTextSize(14);
        this.o3.setImportantForAccessibility(2);
        this.i3.addView(this.o3, nme.d(-2, -2.0f, 53, 0.0f, 15.0f, 12.0f, 0.0f));
        ImageView imageView = new ImageView(this.f0.getContext());
        this.p3 = imageView;
        imageView.setImageResource(R.drawable.msg_minvideo);
        this.p3.setContentDescription(k96.M0(2131754723, "AccExitFullscreen"));
        this.p3.setScaleType(ImageView.ScaleType.CENTER);
        this.p3.setBackground(bkb.f0(1090519039, 1, -1));
        this.p3.setVisibility(4);
        this.i3.addView(this.p3, nme.e(48, 48, 53));
        this.p3.setOnClickListener(new v68(this, (byte) 6));
    }

    public final boolean I0() {
        try {
            AccessibilityManager accessibilityManager = (AccessibilityManager) this.F.getSystemService("accessibility");
            if (accessibilityManager.isEnabled()) {
                if (accessibilityManager.isTouchExplorationEnabled()) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            fa4.g(e, true);
            return false;
        }
    }

    public final void I1(k27 k27Var, CharSequence charSequence, boolean z, boolean z2) {
        int i;
        boolean z3;
        boolean z4;
        TLRPC.Message message;
        CharSequence cloneSpans = gm.cloneSpans(charSequence, 3);
        e2(this.R4, z2);
        if (this.R4 || this.d2 == 1) {
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
                r88 r88Var = new r88(this, this.f0.getContext(), this.R1, this.a2, (byte) 0);
                this.U1 = r88Var;
                this.R1.setScrollView(r88Var);
                this.a2.setClipChildren(false);
                this.U1.addView(this.a2, new ViewGroup.LayoutParams(-1, -2));
                this.f0.addView(this.U1, nme.e(-1, -1, 80));
            }
            if (this.R1.getParent() != this.a2) {
                this.Q0.removeView(this.R1);
                this.R1.setMeasureAllChildren(true);
                this.a2.addView(this.R1, -1, -2);
                this.s3.bringToFront();
            }
            if (k27Var == null || !k27Var.q4()) {
                FrameLayout frameLayout2 = this.S1;
                if (frameLayout2 != null) {
                    gl.B2(frameLayout2);
                    this.R1.setPadding(0, 0, 0, 0);
                }
            } else {
                if (this.S1 == null) {
                    FrameLayout frameLayout3 = new FrameLayout(this.F);
                    this.S1 = frameLayout3;
                    frameLayout3.setBackground(bkb.Z(620756991, 369098751, 8, 8));
                    ote.b(this.S1, 0.05f, 1.25f);
                    TextView textView = new TextView(this.F);
                    this.T1 = textView;
                    textView.setTextSize(1, 14.0f);
                    this.T1.setTextColor(-1);
                    this.T1.setTypeface(gl.o());
                    this.S1.addView(this.T1, nme.e(-2, -2, 17));
                    this.S1.setOnClickListener(new v68(this, (byte) 7));
                }
                gl.B2(this.S1);
                this.T1.setText(k27Var.Y0);
                this.a2.addView(this.S1, nme.d(-1, 44.0f, 87, 16.0f, 0.0f, 16.0f, 12.0f));
                this.R1.setPadding(0, 0, 0, gl.L(64.0f));
                this.S1.bringToFront();
            }
        } else if (this.R1.getParent() != this.Q0) {
            FrameLayout frameLayout4 = this.a2;
            if (frameLayout4 != null) {
                frameLayout4.removeView(this.R1);
            }
            this.R1.setMeasureAllChildren(false);
            this.Q0.addView(this.R1, nme.d(-1, -2.0f, 83, 0.0f, 0.0f, 76.0f, 48.0f));
        }
        boolean isEmpty = TextUtils.isEmpty(cloneSpans);
        boolean isEmpty2 = TextUtils.isEmpty(this.R1.getCurrentView().getText());
        g98 g98Var = this.R1;
        TextView nextView = z2 ? g98Var.getNextView() : g98Var.getCurrentView();
        if (!this.s1) {
            int maxLines = nextView.getMaxLines();
            if (maxLines == 1) {
                this.R1.getCurrentView().setSingleLine(false);
                this.R1.getNextView().setSingleLine(false);
            }
            if (this.j2) {
                Point point = gl.q;
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
                TransitionSet duration = new TransitionSet().addTransition(new s88(this, isEmpty2, isEmpty, (byte) 1)).addTransition(new s88(this, isEmpty2, isEmpty, (byte) 0)).setDuration(200L);
                if (!isEmpty2) {
                    this.U1.l0 = true;
                    duration.addTransition(new u88(this, b));
                } else if (!isEmpty) {
                    duration.addTarget((View) this.R1);
                }
                TransitionManager.beginDelayedTransition(this.U1, duration);
            }
            z3 = true;
        } else {
            this.R1.getCurrentView().setText((CharSequence) null);
            r88 r88Var2 = this.U1;
            if (r88Var2 != null) {
                r88Var2.scrollTo(0, 0);
            }
            z3 = false;
        }
        if (isEmpty) {
            z4 = true;
            boolean z6 = this.j2;
            g98 g98Var2 = this.R1;
            if (z6) {
                g98Var2.a(k96.M0(2131754451, "AddCaption"), z2, false);
                this.R1.getCurrentView().setTextColor(-1291845633);
                this.R1.setTag("empty");
                this.R1.setVisibility(0);
            } else {
                g98Var2.a(null, z2, false);
                this.R1.getCurrentView().setTextColor(-1);
                this.R1.b(4, !z3 || isEmpty2);
                this.R1.setTag(null);
            }
        } else {
            bkb.J(null, true);
            if (k27Var == null || !this.n5 || (message = k27Var.k) == null || message.translatedText == null || !TextUtils.equals(message.translatedToLanguage, rzb.G0())) {
                if (k27Var == null || k27Var.k.entities.isEmpty()) {
                    cloneSpans = vu3.m(new SpannableStringBuilder(cloneSpans), nextView.getPaint().getFontMetricsInt(), false, null, 0);
                } else {
                    SpannableString spannableString = new SpannableString(cloneSpans);
                    k27Var.c(spannableString, true, false);
                    if (k27.K4(k27Var.k)) {
                        k27.h(k27Var.O3(), spannableString, false, 3, (int) k27Var.L0(), false);
                    }
                    cloneSpans = vu3.m(spannableString, nextView.getPaint().getFontMetricsInt(), false, null, 0);
                }
            }
            if (k27Var != null && k27Var.q4()) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (!TextUtils.isEmpty(k27Var.S0)) {
                    spannableStringBuilder.append((CharSequence) k27Var.S0);
                    spannableStringBuilder.setSpan(new z3c(gl.o()), 0, spannableStringBuilder.length(), 33);
                    spannableStringBuilder.setSpan(new z88(b), 0, spannableStringBuilder.length(), 33);
                    spannableStringBuilder.append((CharSequence) "\n");
                }
                spannableStringBuilder.append(cloneSpans);
                cloneSpans = spannableStringBuilder;
            }
            this.R1.setTag(cloneSpans);
            try {
                this.R1.a(cloneSpans, z2, this.q2 != z);
                r88 r88Var3 = this.U1;
                if (r88Var3 != null) {
                    r88Var3.H(r88Var3.getWidth(), r88Var3.getHeight());
                }
                z4 = true;
            } catch (Exception e) {
                z4 = true;
                fa4.g(e, true);
            }
            nextView.setScrollY(0);
            nextView.setTextColor(-1);
            this.R1.setVisibility((!this.K || (this.s1 && this.Q0.getVisibility() != 0 && this.j7 == null)) ? false : z4 ? 0 : 4);
        }
        if (this.R1.getCurrentView() instanceof f98) {
            ((f98) this.R1.getCurrentView()).setLoading(z);
        }
        this.q2 = (isEmpty || !z) ? false : z4;
    }

    public final void I2() {
        lbc lbcVar = this.G2;
        if (lbcVar != null) {
            lbcVar.s0(fo.w() || this.r);
        }
        boolean z = this.q8;
        c7 c7Var = this.f1;
        if (!z) {
            c7Var.setEnabled(false);
            this.f1.setClickable(false);
            this.f1.animate().alpha(0.5f).setDuration(180L).start();
            this.Y7.setMode(0);
            return;
        }
        c7Var.setEnabled(true);
        this.f1.setClickable(true);
        this.f1.animate().alpha(1.0f).setDuration(180L).start();
        if (!this.r) {
            this.N.a(this.J8, true);
            za2 za2Var = this.e1;
            za2Var.c = false;
            za2Var.invalidateSelf();
            if (this.k1.getTag() != null) {
                this.k1.setAlpha(1.0f);
                this.k1.setEnabled(true);
            }
            this.Y7.setMaxProgressDiff(1.0f);
            this.Y7.setMode(0);
            return;
        }
        if (this.e4 == null) {
            this.N.a(k96.M0(2131745087, "SoundMuted"), true);
        }
        za2 za2Var2 = this.e1;
        za2Var2.c = true;
        za2Var2.invalidateSelf();
        if (this.k1.getTag() != null) {
            this.k1.setAlpha(0.5f);
            this.k1.setEnabled(false);
        }
        int i = this.d2;
        v78 v78Var = this.Y7;
        if (i != 1) {
            v78Var.setMaxProgressDiff(1.0f);
            this.Y7.setMode(0);
        } else {
            v78Var.setMaxProgressDiff(9600.0f / this.o8);
            this.Y7.setMode(1);
            O2();
        }
    }

    public final void J(lm6 lm6Var) {
        xl0 xl0Var;
        if (this.C2 == null) {
            byte b = 0;
            m88 m88Var = new m88(b, this.E, this);
            this.z2 = m88Var;
            m88Var.setWillNotDraw(false);
            this.z2.setVisibility(4);
            this.f0.addView(this.z2, 0, nme.e(-1, -1, 17));
            this.E2 = false;
            if (!this.g7.isEmpty()) {
                kac kacVar = new kac(this.G2, this.E);
                this.c0.e();
                sl0 sl0Var = this.c0;
                kacVar.s = sl0Var;
                td4 td4Var = kacVar.b;
                if (td4Var != null && (xl0Var = td4Var.J) != null) {
                    sl0 sl0Var2 = xl0Var.t;
                    if (sl0Var2 != null && sl0Var2.m != null) {
                        sl0Var2.m = null;
                    }
                    xl0Var.t = sl0Var;
                    if (sl0Var != null && sl0Var.m != xl0Var) {
                        sl0Var.m = xl0Var;
                        sl0Var.d();
                    }
                }
                if (lm6Var != null) {
                    kacVar.setDelegate(new m68(lm6Var, b));
                }
                this.C2 = kacVar;
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
                this.z2.addView(this.C2, nme.e(-1, -1, 17));
            } else {
                this.z2.addView(this.D2, nme.e(-1, -1, 17));
            }
            j98 j98Var = new j98(this.E, this);
            this.F2 = j98Var;
            j98Var.setPivotX(0.0f);
            this.F2.setPivotY(0.0f);
            this.F2.setScaleType(ImageView.ScaleType.FIT_XY);
            this.z2.addView(this.F2, nme.e(-1, -1, 17));
            View view = new View(this.E);
            this.e9 = view;
            this.z2.addView(view, nme.c(-1.0f, -1));
            if (this.d2 == 1) {
                View view2 = new View(this.E);
                this.A2 = view2;
                view2.setBackgroundColor(-1);
                this.A2.setAlpha(0.0f);
                this.z2.addView(this.A2, nme.e(-1, -1, 17));
            }
        }
    }

    public final boolean J0() {
        mb1 d0 = d0();
        if (d0 != null) {
            return d0.M.c() || d0.f.e;
        }
        return false;
    }

    public final void J1(int i) {
        K1(true, false, false, i);
    }

    public final void J2(float f, float f2, float f3, float f4) {
        float f5 = f - (f3 / 2.0f);
        float f6 = f2 - (f4 / 2.0f);
        boolean z = this.a9;
        RectF rectF = this.Z8;
        if (!z || Math.abs(rectF.left - f5) >= 1.0f || Math.abs(rectF.top - f6) >= 1.0f || Math.abs(rectF.width() - f3) >= 1.0f || Math.abs(rectF.height() - f4) >= 1.0f) {
            rectF.set(f5, f6, f3 + f5, f4 + f6);
            this.a9 = true;
            if (this.V8 == null || this.b9) {
                return;
            }
            this.b9 = true;
            gl.e3(this.c9, 150L);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean K() {
        Object[] objArr = 0;
        if (this.p6 != null || this.D1 == null) {
            return false;
        }
        this.g6 = 1.0f;
        this.n6 = System.currentTimeMillis();
        AnimatorSet animatorSet = new AnimatorSet();
        this.p6 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, rn.g, 0.0f, 1.0f));
        this.p6.setDuration(250L);
        this.p6.setInterpolator(s33.f);
        this.p6.addListener(new e88(this, objArr == true ? 1 : 0));
        this.p6.start();
        return !(this.D1.b.M != null ? r6.j : false);
    }

    public final boolean K0() {
        int i;
        if (this.h7 != null && (i = this.P4) >= 0) {
            ArrayList arrayList = this.f7;
            if (i < arrayList.size()) {
                TLRPC.Photo photo = (TLRPC.Photo) arrayList.get(this.P4);
                gl5 gl5Var = (gl5) this.a7.get(this.P4);
                if (photo instanceof TLRPC.TL_photoEmpty) {
                    photo = null;
                }
                if (photo != null) {
                    int size = photo.sizes.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        TLRPC.FileLocation fileLocation = photo.sizes.get(i2).location;
                        if (fileLocation != null) {
                            int i3 = fileLocation.local_id;
                            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = this.h7.f;
                            if (i3 == tL_fileLocationToBeDeprecated.local_id && fileLocation.volume_id == tL_fileLocationToBeDeprecated.volume_id) {
                                return true;
                            }
                        }
                    }
                } else if (gl5Var != null) {
                    TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated2 = gl5Var.f;
                    int i4 = tL_fileLocationToBeDeprecated2.local_id;
                    TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated3 = this.h7.f;
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
    public final void K1(boolean z, boolean z2, boolean z3, int i) {
        zl6 zl6Var;
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
        p98 p98Var;
        p98 M;
        boolean z14;
        boolean z15;
        Uri uri2;
        h98 h98Var;
        boolean z16;
        zl6 zl6Var2;
        int i2;
        k27 k27Var;
        k27 k27Var2;
        char c;
        char c2;
        boolean K4;
        k27 k27Var3;
        k27 k27Var4;
        k27 k27Var5;
        TLRPC.Message message;
        zl6 zl6Var3;
        jl5 jl5Var;
        if ((!z3 && this.P4 == i) || this.d == null) {
            return;
        }
        if (!z && (jl5Var = this.j5) != null) {
            jl5Var.a();
            this.j5 = null;
        }
        String p0 = p0(i);
        String[] strArr = this.c5;
        strArr[0] = p0;
        strArr[1] = p0(i + 1);
        strArr[2] = p0(i - 1);
        this.d.a0(this.P4);
        this.v1 = SystemClock.elapsedRealtime();
        int i3 = this.P4;
        this.P4 = i;
        O1(z, z2, false, i);
        c33 clone = this.E1.clone();
        h98 h98Var2 = this.X4;
        zl6 clone2 = (h98Var2 == null || (zl6Var3 = h98Var2.c) == null) ? null : zl6Var3.clone();
        boolean z17 = this.I4;
        h98Var2.a = null;
        h98Var2.c = null;
        h98Var2.d = null;
        h98Var2.e = null;
        h98Var2.b = null;
        h98Var2.f = null;
        h98Var2.g = 0L;
        ArrayList arrayList2 = this.Y6;
        boolean isEmpty = arrayList2.isEmpty();
        ArrayList arrayList3 = this.g7;
        if (isEmpty) {
            zl6Var = clone2;
            num = 1;
            ArrayList arrayList4 = this.e7;
            if (arrayList4.isEmpty()) {
                ArrayList arrayList5 = this.a7;
                if (!arrayList5.isEmpty()) {
                    if (i < 0 || i >= arrayList5.size()) {
                        B(false, false);
                        return;
                    }
                    gl5 gl5Var = this.Z4;
                    gl5 gl5Var2 = (gl5) arrayList5.get(i);
                    if (z && gl5Var != null && gl5Var2 != null) {
                        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = gl5Var.f;
                        int i4 = tL_fileLocationToBeDeprecated.local_id;
                        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated2 = gl5Var2.f;
                        if (i4 == tL_fileLocationToBeDeprecated2.local_id && tL_fileLocationToBeDeprecated.volume_id == tL_fileLocationToBeDeprecated2.volume_id) {
                            z13 = true;
                            this.Z4 = (gl5) arrayList5.get(i);
                            this.a5 = (gl5) this.b7.get(i);
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
                    this.Z4 = (gl5) arrayList5.get(i);
                    this.a5 = (gl5) this.b7.get(i);
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
                    l98 l98Var = this.j7;
                    if (l98Var != null) {
                        int i5 = this.P4;
                        if (i5 < 0 || i5 >= l98Var.j()) {
                            B(false, false);
                            return;
                        }
                        TL_iv.PageBlock pageBlock = this.j7.get(this.P4);
                        TL_iv.PageBlock pageBlock2 = this.i5;
                        boolean z18 = pageBlock2 != null && pageBlock2 == pageBlock;
                        this.i5 = pageBlock;
                        boolean z19 = this.j7.a(this.P4) || this.j7.e(this.P4);
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
                        B(false, false);
                        return;
                    }
                    Object obj = arrayList3.get(i);
                    if (obj instanceof TLRPC.BotInlineResult) {
                        TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) obj;
                        this.Y4 = botInlineResult;
                        if (botInlineResult.document != null) {
                            ba4.G(this.U);
                            this.e5 = ba4.I(botInlineResult.document).getAbsolutePath();
                            equals = k27.J4(botInlineResult.document);
                        } else {
                            if (botInlineResult.photo != null) {
                                ba4.G(this.U);
                                this.e5 = ba4.I(ba4.w(botInlineResult.photo.sizes, gl.Y0(false), false, null, false)).getAbsolutePath();
                            } else {
                                TLRPC.WebDocument webDocument = botInlineResult.content;
                                if (webDocument instanceof TLRPC.TL_webDocument) {
                                    this.e5 = webDocument.url;
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
                        if (obj instanceof jm6) {
                            jm6 jm6Var = (jm6) obj;
                            long j2 = jm6Var.H;
                            int i6 = jm6Var.G;
                            int i7 = jm6Var.F;
                            String str = jm6Var.I;
                            this.e5 = str;
                            if (str == null) {
                                B(false, false);
                                return;
                            }
                            z10 = jm6Var.d();
                            z6 = jm6Var.b;
                            long j3 = jm6Var.m;
                            this.f5 = j3;
                            h98Var2.d = jm6Var.o;
                            h98Var2.a = jm6Var.j;
                            h98Var2.b = jm6Var.k;
                            h98Var2.f = jm6Var.q;
                            z4 = z17;
                            h98Var2.g = jm6Var.t;
                            h98Var2.e = jm6Var.p;
                            h98Var2.c = jm6Var.A;
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
                                if (jm6Var.b && !jm6Var.d()) {
                                    if (sb.length() > 0) {
                                        sb.append(", ");
                                    }
                                    sb.append(gl.g0(jm6Var.E, false, false));
                                }
                                if (j2 != 0) {
                                    if (sb.length() > 0) {
                                        sb.append(", ");
                                    }
                                    sb.append(gl.i0(j2, false, false));
                                }
                                this.m0.setText(file.getName());
                                this.n0.setText(sb);
                            } else {
                                arrayList = arrayList3;
                            }
                            z9 = this.i7 != null;
                            uri = fromFile;
                            j = j3;
                        } else {
                            arrayList = arrayList3;
                            z4 = z17;
                            if (obj instanceof nm6) {
                                nm6 nm6Var = (nm6) obj;
                                this.e5 = nm6Var.g();
                                h98Var2.d = nm6Var.o;
                                h98Var2.a = nm6Var.j;
                                h98Var2.b = nm6Var.k;
                                h98Var2.f = nm6Var.q;
                                h98Var2.g = nm6Var.t;
                                h98Var2.e = nm6Var.p;
                                h98Var2.c = nm6Var.A;
                            }
                            j = 0;
                            z9 = false;
                            uri = null;
                            z10 = false;
                            z6 = false;
                        }
                        if (obj instanceof bm6) {
                            bm6 bm6Var = (bm6) obj;
                            if (B0()) {
                                this.g5 = bm6Var.h;
                            } else {
                                String str2 = bm6Var.i;
                                if (str2 != null) {
                                    this.g5 = str2;
                                } else {
                                    this.g5 = this.e5;
                                }
                            }
                        }
                    }
                    zl6 zl6Var4 = h98Var2.c;
                    if (zl6Var4 != null) {
                        this.J2 = true;
                        float f = zl6Var4.a;
                        this.K2 = f;
                        float f2 = zl6Var4.b;
                        this.L2 = f2;
                        float f3 = zl6Var4.c;
                        this.O2 = f3;
                        float f4 = zl6Var4.d;
                        this.P2 = f4;
                        z11 = z9;
                        int i8 = zl6Var4.k;
                        this.R2 = i8;
                        float f5 = zl6Var4.e;
                        this.M2 = f5;
                        float f6 = zl6Var4.f;
                        this.N2 = f6;
                        boolean z20 = zl6Var4.l;
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
                R1(z5, z12);
                p98Var = this.d5;
                if (p98Var != null) {
                    if (this.n4 == 0) {
                        p98Var.a.v0(z12, z12);
                    } else {
                        this.q4 = p98Var;
                    }
                }
                o98 o98Var = this.d;
                k27 k27Var6 = this.T4;
                gl5 gl5Var3 = this.Z4;
                M = o98Var.M(k27Var6, gl5Var3 == null ? null : gl5Var3.f, this.P4, false, false);
                this.d5 = M;
                if (M != null || M.s) {
                    z14 = false;
                } else if (this.n4 == 0) {
                    z14 = false;
                    M.a.v0(false, true);
                } else {
                    z14 = false;
                    this.r4 = M;
                }
                u78[] u78VarArr = this.X0;
                if (!z7) {
                    this.V5 = z14;
                    this.X5 = 0.0f;
                    this.Y5 = 0.0f;
                    this.c6 = 0.0f;
                    this.d6 = 0.0f;
                    float y1 = y1(true);
                    this.e6 = y1;
                    this.a6 = y1;
                    this.f6 = 0.0f;
                    this.n6 = 0L;
                    this.R6 = z14;
                    this.p6 = null;
                    this.q6 = null;
                    m88 m88Var = this.z2;
                    if (m88Var != null) {
                        m88Var.setVisibility(4);
                    }
                    this.u6 = 0.0f;
                    this.v6 = 0.0f;
                    this.w6 = 1.0f;
                    this.x6 = 0.0f;
                    this.y6 = 0.0f;
                    this.z6 = 0.0f;
                    this.A6 = 0.0f;
                    this.B6 = 0.0f;
                    this.C6 = 0.0f;
                    this.D6 = 0.0f;
                    this.K6 = false;
                    this.L6 = false;
                    this.M6 = (byte) 0;
                    this.N6 = (byte) 0;
                    this.O6 = false;
                    this.P6 = false;
                    this.Q6 = true;
                    this.J6 = false;
                    this.T6 = (byte) 0;
                    if (this.C5 != 1) {
                        this.I6 = (this.t4 || (arrayList.isEmpty() && (strArr[0] == null || u78VarArr[0].h == 0))) ? false : true;
                    }
                    H2(this.a6);
                    v1(false);
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
                    h98Var = h98Var2;
                    z16 = z4;
                    zl6Var2 = zl6Var;
                } else {
                    this.Q3 = false;
                    z16 = z4;
                    h98Var = h98Var2;
                    zl6Var2 = zl6Var;
                    s1(null, uri2, (this.d2 == 1 && !(z15 && T0())) || (z15 && !T0()), false, h98Var2.d, z15, j);
                }
                if (arrayList.isEmpty()) {
                    h98Var.a = null;
                    h98Var.c = null;
                    h98Var.d = null;
                    h98Var.e = null;
                    h98Var.b = null;
                    h98Var.f = null;
                    h98Var.g = 0L;
                }
                this.I4 = z6;
                this.J4 = z15;
                if (i3 != -1 || z3) {
                    L1();
                    for (i2 = 0; i2 < 3; i2++) {
                        w(i2, false);
                    }
                } else {
                    w(0, false);
                    int i10 = this.P4;
                    ImageView[] imageViewArr = this.y3;
                    if (i3 > i10) {
                        ImageReceiver imageReceiver = this.D4;
                        this.D4 = this.C4;
                        this.C4 = this.B4;
                        this.B4 = imageReceiver;
                        ei0 ei0Var = this.G4;
                        this.G4 = this.F4;
                        this.F4 = this.E4;
                        this.E4 = ei0Var;
                        lm[] lmVarArr = this.L8;
                        if (lmVarArr != null) {
                            lm lmVar = lmVarArr[0];
                            lmVarArr[0] = lmVarArr[1];
                            lmVarArr[1] = lmVarArr[2];
                            lmVarArr[2] = lmVar;
                        }
                        this.K4 = z16;
                        this.G1 = clone;
                        this.I1 = zl6Var2;
                        u78 u78Var = u78VarArr[0];
                        u78VarArr[0] = u78VarArr[2];
                        u78VarArr[2] = u78Var;
                        ImageView imageView = imageViewArr[0];
                        ImageView imageView2 = imageViewArr[2];
                        imageViewArr[0] = imageView2;
                        imageViewArr[2] = imageView;
                        imageView2.setTranslationY(imageView.getTranslationY());
                        this.H1 = null;
                        N1(this.P4 - 1, this.z4);
                        N1(this.P4, this.y4);
                        N1(this.P4 + 1, this.A4);
                        M1(this.B4, this.P4 - 1, this.F1);
                        Integer num2 = this.C4.Z0;
                        if (num2 != null && num2.equals(num)) {
                            M1(this.C4, this.P4, null);
                        }
                        B2();
                        w(1, false);
                        w(2, false);
                    } else {
                        Integer num3 = num;
                        boolean z21 = z16;
                        if (i3 < i10) {
                            ImageReceiver imageReceiver2 = this.B4;
                            this.B4 = this.C4;
                            this.C4 = this.D4;
                            this.D4 = imageReceiver2;
                            ei0 ei0Var2 = this.E4;
                            this.E4 = this.F4;
                            this.F4 = this.G4;
                            this.G4 = ei0Var2;
                            lm[] lmVarArr2 = this.L8;
                            if (lmVarArr2 != null) {
                                lm lmVar2 = lmVarArr2[2];
                                c2 = 1;
                                lmVarArr2[2] = lmVarArr2[1];
                                c = 0;
                                lmVarArr2[1] = lmVarArr2[0];
                                lmVarArr2[0] = lmVar2;
                            } else {
                                c = 0;
                                c2 = 1;
                            }
                            this.H4 = z21;
                            this.F1 = clone;
                            this.H1 = zl6Var2;
                            u78 u78Var2 = u78VarArr[c];
                            u78VarArr[c] = u78VarArr[c2];
                            u78VarArr[c2] = u78Var2;
                            ImageView imageView3 = imageViewArr[c];
                            ImageView imageView4 = imageViewArr[c2];
                            imageViewArr[c] = imageView4;
                            imageViewArr[c2] = imageView3;
                            imageView4.setTranslationY(imageView3.getTranslationY());
                            this.I1 = null;
                            N1(this.P4 - 1, this.z4);
                            N1(this.P4, this.y4);
                            N1(this.P4 + 1, this.A4);
                            M1(this.D4, this.P4 + 1, this.G1);
                            Integer num4 = this.C4.Z0;
                            if (num4 != null && num4.equals(num3)) {
                                M1(this.C4, this.P4, null);
                            }
                            B2();
                            w(1, false);
                            w(2, false);
                        }
                    }
                    Bitmap bitmap = this.O4;
                    if (bitmap != null) {
                        bitmap.recycle();
                        this.O4 = null;
                    }
                }
                N();
                if (this.V1 != null) {
                    o98 o98Var2 = this.d;
                    long a = o98Var2 != null ? o98Var2.a() : 0L;
                    if (a == 0 && (k27Var2 = this.T4) != null) {
                        a = k27.B0(k27Var2.k);
                    }
                    this.V1.setDialogId(a);
                    z78 z78Var = this.W1;
                    if (z78Var != null) {
                        z78Var.setDialogId(a);
                    }
                }
                if (this.T0 != null) {
                    o98 o98Var3 = this.d;
                    long a2 = o98Var3 != null ? o98Var3.a() : 0L;
                    if (a2 == 0 && (k27Var = this.T4) != null) {
                        a2 = k27.B0(k27Var.k);
                    }
                    jh3 jh3Var = this.T0;
                    o98 o98Var4 = this.d;
                    long K1 = (o98Var4 == null || !o98Var4.p() || this.d.v()) ? na7.q1(this.U).K1(a2) : 0L;
                    o98 o98Var5 = this.d;
                    jh3Var.i(Math.max(1, o98Var5 == null ? 1 : o98Var5.G()), K1, true);
                    return;
                }
                return;
            }
            if (i < 0 || i >= arrayList4.size()) {
                B(false, false);
                return;
            }
            this.b5 = (uu9) arrayList4.get(i);
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
            R1(z5, z12);
            p98Var = this.d5;
            if (p98Var != null) {
            }
            o98 o98Var6 = this.d;
            k27 k27Var62 = this.T4;
            gl5 gl5Var32 = this.Z4;
            M = o98Var6.M(k27Var62, gl5Var32 == null ? null : gl5Var32.f, this.P4, false, false);
            this.d5 = M;
            if (M != null) {
            }
            z14 = false;
            u78[] u78VarArr2 = this.X0;
            if (!z7) {
            }
            if (z8) {
            }
            z15 = z8;
            uri2 = uri;
            if (z6) {
            }
            h98Var = h98Var2;
            z16 = z4;
            zl6Var2 = zl6Var;
            if (arrayList.isEmpty()) {
            }
            this.I4 = z6;
            this.J4 = z15;
            if (i3 != -1) {
            }
            L1();
            while (i2 < 3) {
            }
            N();
            if (this.V1 != null) {
            }
            if (this.T0 != null) {
            }
        } else {
            int i11 = this.P4;
            if (i11 < 0 || i11 >= arrayList2.size()) {
                B(false, false);
                return;
            }
            k27 k27Var7 = (k27) arrayList2.get(this.P4);
            boolean z22 = k27Var7 != null && (na7.q1(this.U).z2(k27.B0(k27Var7.k)) || (((message = k27Var7.k) != null && message.noforwards) || k27Var7.y2()));
            z7 = z && (k27Var5 = this.T4) != null && k27Var5.e1() == k27Var7.e1();
            if (z7) {
                k27Var7.P = this.T4.P;
            }
            if (this.U4 == null || k27Var7 == null || ((k27Var4 = this.T4) != null && k27.B0(k27Var4.k) != k27.B0(k27Var7.k))) {
                VideoAds videoAds = this.U4;
                if (videoAds != null) {
                    videoAds.stop();
                    this.U4 = null;
                }
                if (k27Var7 != null) {
                    num = 1;
                    zl6Var = clone2;
                    VideoAds make = VideoAds.make(k27Var7.K1, k27.B0(k27Var7.k), k27Var7.e1(), new u21(this.f0, this.w2));
                    this.U4 = make;
                    lbc lbcVar = this.G2;
                    make.setWaitingPaused(lbcVar == null || (lbcVar.c0() && this.G2.d.h() == 3));
                    this.U4.setPauseOnPopupCallback(new l68(this, (byte) 25));
                    this.T4 = k27Var7;
                    if (k27Var7 != null) {
                        k27Var7.j3 = true;
                    }
                    z8 = k27Var7.D3();
                    K4 = k27.K4(k27Var7.k);
                    if (k27Var7.q4()) {
                        gl.r(this.y2);
                    }
                    if (this.C5 == 1) {
                        boolean x = k27Var7.x();
                        this.I6 = x;
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
                            this.s6 = true;
                            this.r6.h = this;
                        } else {
                            this.u0.setVisibility(8);
                            this.v0.setVisibility(8);
                            this.s6 = false;
                            this.r6.h = null;
                        }
                    }
                    if ((K4 || z8) && !this.t4) {
                        this.s0.setVisibility(8);
                        this.q0.setVisibility(8);
                        this.A0.setVisibility(8);
                        this.p0.Q(25, z22 && (k27Var3 = this.T4) != null && k27.R3(k27Var3.k) && !this.T4.D3());
                        this.p0.m();
                    } else {
                        this.s0.setVisibility(0);
                        this.q0.setVisibility(0);
                        this.p0.S(17);
                        this.p0.u(25);
                        this.A0.setVisibility(this.p0.getVisibleSubItemsCount() > 1 ? 0 : 8);
                    }
                    M2();
                    arrayList = arrayList3;
                    z6 = K4;
                    z4 = z17;
                    j = 0;
                }
            }
            zl6Var = clone2;
            num = 1;
            this.T4 = k27Var7;
            if (k27Var7 != null) {
            }
            z8 = k27Var7.D3();
            K4 = k27.K4(k27Var7.k);
            if (k27Var7.q4()) {
            }
            if (this.C5 == 1) {
            }
            if (K4) {
            }
            this.s0.setVisibility(8);
            this.q0.setVisibility(8);
            this.A0.setVisibility(8);
            this.p0.Q(25, z22 && (k27Var3 = this.T4) != null && k27.R3(k27Var3.k) && !this.T4.D3());
            this.p0.m();
            M2();
            arrayList = arrayList3;
            z6 = K4;
            z4 = z17;
            j = 0;
        }
        z5 = false;
        uri = null;
        z12 = true;
        R1(z5, z12);
        p98Var = this.d5;
        if (p98Var != null) {
        }
        o98 o98Var62 = this.d;
        k27 k27Var622 = this.T4;
        gl5 gl5Var322 = this.Z4;
        M = o98Var62.M(k27Var622, gl5Var322 == null ? null : gl5Var322.f, this.P4, false, false);
        this.d5 = M;
        if (M != null) {
        }
        z14 = false;
        u78[] u78VarArr22 = this.X0;
        if (!z7) {
        }
        if (z8) {
        }
        z15 = z8;
        uri2 = uri;
        if (z6) {
        }
        h98Var = h98Var2;
        z16 = z4;
        zl6Var2 = zl6Var;
        if (arrayList.isEmpty()) {
        }
        this.I4 = z6;
        this.J4 = z15;
        if (i3 != -1) {
        }
        L1();
        while (i2 < 3) {
        }
        N();
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
    public final void K2() {
        s3b s3bVar;
        long j;
        String j2;
        ArrayList arrayList;
        Uri uri;
        TLRPC.Document document;
        if (this.f0 != null) {
            lbc lbcVar = this.G2;
            if (lbcVar == null || this.s1 || this.H8 || this.d2 != 0 || this.J4) {
                s3bVar = null;
            } else {
                Uri uri2 = this.W4;
                if (uri2 != null || this.V4 == null) {
                    j = 0;
                } else {
                    if (this.m7 == null) {
                        TLRPC.Document R = lbcVar.R();
                        ArrayList arrayList2 = this.V4;
                        int size = arrayList2.size();
                        int i = 0;
                        while (i < size) {
                            Object obj = arrayList2.get(i);
                            i++;
                            ArrayList arrayList3 = ((hbc) obj).d;
                            int size2 = arrayList3.size();
                            int i2 = 0;
                            while (i2 < size2) {
                                Object obj2 = arrayList3.get(i2);
                                i2++;
                                jbc jbcVar = (jbc) obj2;
                                if (R == null || (uri = jbcVar.d) == null || (document = jbcVar.g) == null) {
                                    arrayList = arrayList2;
                                } else {
                                    arrayList = arrayList2;
                                    if (document.id == R.id) {
                                        this.m7 = uri;
                                        this.n7 = document.size;
                                    }
                                }
                                arrayList2 = arrayList;
                            }
                        }
                    }
                    j = 0;
                    uri2 = this.m7;
                    if (uri2 != null && "file".equals(uri2.getScheme()) && uri2.getPath() != null && this.n7 > 0 && new File(uri2.getPath()).length() < this.n7) {
                        l68 l68Var = this.o7;
                        gl.r(l68Var);
                        gl.e3(l68Var, 3000L);
                        uri2 = null;
                    }
                }
                String scheme = uri2 == null ? null : uri2.getScheme();
                if (!"file".equals(scheme) || uri2.getPath() == null) {
                    if ("tg".equals(scheme)) {
                        Long A = uri2 == null ? null : Utilities.A(uri2.getQueryParameter("size"));
                        if (A != null && A.longValue() > j) {
                            s3bVar = new sk4(uri2, A, (byte) 26);
                            StringBuilder sb = new StringBuilder("captions: player video ");
                            if (s3bVar == null) {
                                j2 = b00.h("heard from ", scheme);
                            } else {
                                StringBuilder sb2 = new StringBuilder("can't be heard (");
                                if (uri2 == null) {
                                    scheme = "no single file";
                                }
                                j2 = b00.j(sb2, scheme, ")");
                            }
                            ir2.x(sb, j2, "Dictation");
                        }
                    }
                    s3bVar = null;
                    StringBuilder sb3 = new StringBuilder("captions: player video ");
                    if (s3bVar == null) {
                    }
                    ir2.x(sb3, j2, "Dictation");
                } else {
                    File file = new File(uri2.getPath());
                    if (file.exists()) {
                        s3bVar = new wk4((Object) file.getAbsolutePath(), (Object) file, (byte) 29);
                        StringBuilder sb32 = new StringBuilder("captions: player video ");
                        if (s3bVar == null) {
                        }
                        ir2.x(sb32, j2, "Dictation");
                    }
                    s3bVar = null;
                    StringBuilder sb322 = new StringBuilder("captions: player video ");
                    if (s3bVar == null) {
                    }
                    ir2.x(sb322, j2, "Dictation");
                }
            }
            if (s3bVar == null && this.l7 == null) {
                return;
            }
            mbc mbcVar = this.l7;
            if (mbcVar == null) {
                mbcVar = new mbc(new d78(this));
                this.l7 = mbcVar;
            }
            mbcVar.a(this.U, s3bVar);
        }
    }

    public final boolean L(float f, boolean z, Runnable runnable) {
        v48 v48Var;
        if (this.p6 == null && (v48Var = this.D1) != null) {
            v48Var.b.i();
            this.b6 = 0.0f;
            this.f6 = 0.0f + f;
            if (z) {
                this.g6 = 1.0f;
            }
            this.n6 = System.currentTimeMillis();
            this.p6 = new AnimatorSet();
            if (this.d2 == 1) {
                this.e6 = 1.0f;
                this.a6 = 1.0f;
            } else {
                ImageReceiver imageReceiver = this.C4;
                if (imageReceiver != null) {
                    int q = imageReceiver.q();
                    int o = this.C4.o();
                    if (Math.abs((((int) this.D1.b.getStateOrientation()) / 90) % 2) == 1) {
                        o = q;
                        q = o;
                    }
                    zl6 zl6Var = this.X4.c;
                    if (zl6Var != null) {
                        q = (int) (q * zl6Var.e);
                        o = (int) (o * zl6Var.f);
                    }
                    float f2 = q;
                    float f3 = o;
                    float min = Math.min(i0(1) / f2, f0(1, false) / f3);
                    this.e6 = (Math.abs((f / 90.0f) % 2.0f) == 1.0f ? Math.min(i0(1) / f3, f0(1, false) / f2) : min) / min;
                }
            }
            if (this.d2 == 11) {
                this.a6 = y1(false) * this.a6;
                this.e6 = y1(false) * this.e6;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new qx1(this, f, this.D1.c.getRotation(), (byte) 4));
            this.p6.playTogether(ObjectAnimator.ofFloat(this, rn.g, 0.0f, 1.0f), ofFloat);
            this.p6.setDuration(250L);
            this.p6.setInterpolator(s33.f);
            this.p6.addListener(new ji4(this, f, runnable, (byte) 3));
            this.p6.start();
            if (Math.abs(this.D1.b.getStateOrientation() + f) > 0.01f) {
                return true;
            }
        }
        return false;
    }

    public final boolean L0(l98 l98Var) {
        if (l98Var == null) {
            return false;
        }
        Object g = l98Var.g();
        if (!(g instanceof k27)) {
            return false;
        }
        k27 k27Var = (k27) g;
        if (k27Var.k != null) {
            return na7.q1(this.U).z2(k27.B0(k27Var.k)) || k27Var.k.noforwards || k27Var.y2();
        }
        return false;
    }

    public final void L1() {
        if (this.n4 == 0) {
            M1(this.C4, this.P4, null);
            N1(this.P4, this.y4);
            M1(this.D4, this.P4 + 1, this.G1);
            N1(this.P4 + 1, this.A4);
            M1(this.B4, this.P4 - 1, this.F1);
            N1(this.P4 - 1, this.z4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:188:0x044a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void L2(int i, boolean z) {
        lbc lbcVar;
        k27 k27Var;
        tbc tbcVar;
        k27 k27Var2;
        StaticLayout[] staticLayoutArr;
        String str;
        rj4 rj4Var;
        float f;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        x88 x88Var;
        if (this.G2 != null || ((x88Var = this.g0) != null && x88Var.y)) {
            VideoAds videoAds = this.U4;
            byte b = 3;
            if (videoAds != null) {
                videoAds.setWaitingPaused((z && i == 3) ? false : true);
            }
            x88 x88Var2 = this.g0;
            if (x88Var2 != null && x88Var2.y && !z) {
                s2(true, true);
            }
            x88 x88Var3 = this.g0;
            if (x88Var3 != null && x88Var3.y && i == 3 && z0() >= 10000 && this.b3 == null && this.c3 == null) {
                if (this.T4 != null) {
                    long z0 = z0() / 1000;
                    TLRPC.Message message = this.T4.k;
                    String str2 = (message == null || (messageMedia = message.media) == null || (webPage = messageMedia.webpage) == null) ? null : webPage.url;
                    if (!TextUtils.isEmpty(str2)) {
                        if (z0 >= 10) {
                            r98 r98Var = (r98) h9.get(str2);
                            k27 k27Var3 = this.T4;
                            f = 0.999f;
                            if (k27Var3.c0 < 0.0f && r98Var != null) {
                                float f2 = r98Var.a;
                                if (f2 > 0.0f && f2 < 0.999f) {
                                    k27Var3.c0 = f2;
                                    this.q3.h(false, f2);
                                }
                            }
                            this.c3 = str2;
                        } else {
                            f = 0.999f;
                        }
                        if (z0 >= 300) {
                            if (this.T4.c0 < 0.0f) {
                                float f3 = org.telegram.messenger.a.b.getSharedPreferences("media_saved_pos", 0).getFloat(str2, -1.0f);
                                if (f3 > 0.0f && f3 < f) {
                                    this.T4.c0 = f3;
                                    this.q3.h(false, f3);
                                }
                            }
                            this.b3 = str2;
                        }
                    }
                }
                k27 k27Var4 = this.T4;
                if (k27Var4 != null) {
                    float f4 = k27Var4.c0;
                    if (f4 >= 0.0f) {
                        C1(f4);
                        this.T4.c0 = -1.0f;
                    }
                }
            }
            if (this.Q3) {
                if (i != 2 || !this.V2) {
                    boolean z2 = this.a3 != 0.0f || i == 2;
                    if (z2) {
                        gl.r(this.y2);
                    } else {
                        z1();
                    }
                    w2(z2, true);
                } else if (z) {
                    this.V2 = false;
                }
            }
            m88 m88Var = this.z2;
            if (m88Var != null) {
                m88Var.setKeepScreenOn((!z || i == 4 || i == 1) ? false : true);
            }
            if (!z || i == 4 || i == 1) {
                try {
                    this.E.getWindow().clearFlags(128);
                    this.h3 = false;
                } catch (Exception e) {
                    fa4.g(e, true);
                }
            } else {
                try {
                    this.E.getWindow().addFlags(128);
                    this.h3 = true;
                } catch (Exception e2) {
                    fa4.g(e2, true);
                }
            }
            if (i == 3 || i == 1) {
                k27 k27Var5 = this.T4;
                if (k27Var5 != null && (lbcVar = this.G2) != null) {
                    this.s3.c(k27Var5, lbcVar);
                }
                float f5 = this.a3;
                if (f5 != 0.0f) {
                    C1(f5);
                    this.a3 = 0.0f;
                    k27 k27Var6 = this.T4;
                    if (k27Var6 != null) {
                        ba4 G = ba4.G(k27Var6.K1);
                        TLRPC.Document F0 = this.T4.F0();
                        if (!G.T(F0, false) && !G.T(F0, true)) {
                            this.V2 = true;
                        }
                    }
                }
            }
            float f6 = 1.0f;
            if (i == 3) {
                m88 m88Var2 = this.z2;
                if (m88Var2 != null && m88Var2.getVisibility() != 0) {
                    this.z2.setVisibility(0);
                }
                if (!this.w0.isEnabled() && this.w0.getVisibility() == 0) {
                    this.s2 = true;
                    this.w0.setEnabled(true);
                    this.w0.animate().alpha(1.0f).setDuration(175L).withEndAction(null).start();
                }
                this.W2 = true;
                k27 k27Var7 = this.T4;
                if (k27Var7 != null && k27.K4(k27Var7.k)) {
                    gl.r(this.x2);
                    ba4.G(this.T4.K1).Z(this.T4.F0(), true, false);
                }
            } else if (i == 2 && z && (k27Var = this.T4) != null && k27.K4(k27Var.k)) {
                boolean z3 = this.W2;
                r78 r78Var = this.x2;
                if (z3) {
                    r78Var.run();
                } else {
                    gl.e3(r78Var, 1000L);
                }
            }
            lbc lbcVar2 = this.G2;
            if (lbcVar2 == null ? this.g0.H : lbcVar2.c0()) {
                if (i != 4) {
                    if (!this.P3) {
                        this.P3 = true;
                        this.X0[0].d(this.s1 ? -1 : 4, false, true);
                        u78 u78Var = this.X0[0];
                        if (!this.s1 && ((!I0() || this.X2) && ((this.Y2 && !this.X2) || !this.K))) {
                            f6 = 0.0f;
                        }
                        u78Var.e(1, f6, false);
                        this.X2 = true;
                        gl.d3(this.h4);
                    }
                    H0();
                    tbcVar = this.q3;
                    k27Var2 = this.T4;
                    long z02 = z0();
                    tbcVar.getClass();
                    if (k27Var2 != null || z02 < 0) {
                        tbcVar.F = null;
                        tbcVar.J = -1;
                        tbcVar.I = 0.0f;
                        staticLayoutArr = tbcVar.K;
                        if (staticLayoutArr != null) {
                            staticLayoutArr[1] = null;
                            staticLayoutArr[0] = null;
                        }
                        tbcVar.G = null;
                        tbcVar.H = -1L;
                    } else {
                        CharSequence charSequence = k27Var2.z;
                        if (k27Var2.d5()) {
                            if (k27Var2.B == null && (str = k27Var2.k.media.webpage.description) != null) {
                                k27Var2.B = SpannableString.valueOf(str);
                                k27.h(k27Var2.N3(), k27Var2.B, false, 3, (int) z02, false);
                            }
                            charSequence = k27Var2.B;
                        }
                        if (charSequence != tbcVar.G || tbcVar.H != z02) {
                            tbcVar.G = charSequence;
                            tbcVar.H = z02;
                            if (charSequence instanceof Spanned) {
                                Spanned spanned = (Spanned) charSequence;
                                try {
                                    g4c[] g4cVarArr = (g4c[]) spanned.getSpans(0, spanned.length(), g4c.class);
                                    tbcVar.F = new ArrayList();
                                    tbcVar.I = 0.0f;
                                    if (tbcVar.L == null) {
                                        TextPaint textPaint = new TextPaint(1);
                                        tbcVar.L = textPaint;
                                        textPaint.setTextSize(gl.L(12.0f));
                                        tbcVar.L.setColor(-1);
                                    }
                                    for (g4c g4cVar : g4cVarArr) {
                                        if (g4cVar != null && g4cVar.getURL() != null && g4cVar.d != null && g4cVar.getURL().startsWith("video?")) {
                                            if (Utilities.z(g4cVar.getURL().substring(6)).intValue() >= 0) {
                                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(g4cVar.d);
                                                vu3.l(spannableStringBuilder, tbcVar.L.getFontMetricsInt(), false);
                                                tbcVar.F.add(new Pair(Float.valueOf((r9.intValue() * 1000) / z02), spannableStringBuilder));
                                            }
                                        }
                                    }
                                    Collections.sort(tbcVar.F, new pva((byte) 10));
                                } catch (Exception e3) {
                                    fa4.g(e3, true);
                                    tbcVar.F = null;
                                    tbcVar.J = -1;
                                    tbcVar.I = 0.0f;
                                    StaticLayout[] staticLayoutArr2 = tbcVar.K;
                                    if (staticLayoutArr2 != null) {
                                        staticLayoutArr2[1] = null;
                                        staticLayoutArr2[0] = null;
                                    }
                                }
                            } else {
                                tbcVar.F = null;
                                tbcVar.J = -1;
                                tbcVar.I = 0.0f;
                                StaticLayout[] staticLayoutArr3 = tbcVar.K;
                                if (staticLayoutArr3 != null) {
                                    staticLayoutArr3[1] = null;
                                    staticLayoutArr3[0] = null;
                                }
                            }
                        }
                    }
                    P2();
                    gl.d3(new l68(this, b));
                }
            }
            if (this.P3 || i == 4) {
                if (this.u4 != 3) {
                    this.X0[0].e(1, 1.0f, i == 4);
                    u78 u78Var2 = this.X0[0];
                    u78Var2.d(3, false, u78Var2.m[1] > 0.0f);
                }
                this.P3 = false;
                gl.r(this.h4);
                if (i == 4) {
                    if (this.s1) {
                        v78 v78Var = this.Y7;
                        if (!v78Var.r) {
                            v78Var.setProgress(v78Var.getLeftProgress());
                            if (this.H8 || (this.u4 == 0 && this.X7.getVisibility() != 0)) {
                                C1(0.0f);
                            } else {
                                C1(this.Y7.getLeftProgress());
                            }
                            this.H2 = false;
                            n();
                            if (this.d2 == 1 || this.u4 != 0 || this.o6 > 0) {
                                q1();
                            } else {
                                o1();
                            }
                            this.f0.invalidate();
                        }
                    } else {
                        this.q3.h(false, 0.0f);
                        this.r3.invalidate();
                        if (this.H8 || this.X7.getVisibility() != 0) {
                            C1(0.0f);
                        } else {
                            C1(this.Y7.getLeftProgress());
                        }
                        this.H2 = false;
                        o1();
                        if (!this.K) {
                            s2(true, true);
                        }
                    }
                    xa8 xa8Var = this.V8;
                    if (xa8Var != null) {
                        sj4 sj4Var = xa8Var.e;
                        if (sj4Var != null && (rj4Var = sj4Var.o) != null) {
                            sj4Var.H = true;
                            sj4Var.I = 0.0f;
                            sj4Var.J = 0.0f;
                            rj4Var.invalidate();
                            sj4Var.p();
                            if (!sj4Var.u) {
                                sj4Var.u = true;
                                sj4Var.o(true);
                                gl.r(sj4Var.P);
                                sj4Var.w = false;
                            }
                        }
                        xa8Var.b.d();
                    }
                }
            }
            H0();
            tbcVar = this.q3;
            k27Var2 = this.T4;
            long z022 = z0();
            tbcVar.getClass();
            if (k27Var2 != null) {
            }
            tbcVar.F = null;
            tbcVar.J = -1;
            tbcVar.I = 0.0f;
            staticLayoutArr = tbcVar.K;
            if (staticLayoutArr != null) {
            }
            tbcVar.G = null;
            tbcVar.H = -1L;
            P2();
            gl.d3(new l68(this, b));
        }
    }

    public final void M() {
        if (this.E == null || this.h0 == null) {
            return;
        }
        xa8 xa8Var = this.V8;
        if (xa8Var != null) {
            this.V8 = null;
            xa8Var.b();
        }
        wtc wtcVar = this.I7;
        if (wtcVar != null) {
            wtcVar.a();
            this.I7 = null;
        }
        ConnectionsManager.getInstance(this.U).cancelRequestsForGuid(this.c);
        v1(false);
        try {
            if (this.h0.getParent() != null) {
                ((WindowManager) this.E.getSystemService("window")).removeViewImmediate(this.h0);
                Z0();
            }
            this.h0 = null;
        } catch (Exception e) {
            fa4.g(e, true);
        }
        jl5 jl5Var = this.j5;
        if (jl5Var != null) {
            jl5Var.a();
            this.j5 = null;
        }
        this.i0.setImageBitmap(null);
        if (this == m9) {
            m9 = null;
        } else {
            l9 = null;
        }
        Z0();
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
    public final void M1(ImageReceiver imageReceiver, int i, c33 c33Var) {
        k27 k27Var;
        TLRPC.PhotoSize photoSize;
        TLObject tLObject;
        int i2;
        boolean z;
        boolean z2;
        long[] jArr;
        gl5 gl5Var;
        Object obj;
        ?? r24;
        BitmapDrawable bitmapDrawable;
        gl5 gl5Var2;
        gl5 gl5Var3;
        boolean z3;
        TLRPC.Photo photo;
        BitmapDrawable bitmapDrawable2;
        gl5 gl5Var4;
        km kmVar;
        km kmVar2;
        TLRPC.PhotoSize photoSize2;
        BitmapDrawable bitmapDrawable3;
        gl5 gl5Var5;
        String str;
        usc uscVar;
        gl5 gl5Var6;
        ?? r11;
        zl6 zl6Var;
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
        gl5 gl5Var7;
        TLRPC.Document document3;
        long j2;
        gl5 gl5Var8;
        TLObject tLObject4;
        gl5 gl5Var9;
        gl5 gl5Var10;
        TLRPC.Document document4;
        zl6 zl6Var2;
        boolean z5;
        Drawable drawable;
        Activity activity;
        Drawable drawable2;
        Drawable drawable3;
        Activity activity2;
        boolean z6;
        zl6 zl6Var3;
        ImageReceiver imageReceiver2;
        gl5 gl5Var11;
        gl5 gl5Var12;
        gl5 gl5Var13;
        Object obj2;
        BitmapDrawable bitmapDrawable4;
        String str4;
        imageReceiver.o0(0, 0, false);
        ArrayList arrayList = this.e7;
        TLRPC.Document document5 = null;
        document5 = null;
        if (!arrayList.isEmpty()) {
            if (i < 0 || i >= arrayList.size()) {
                return;
            }
            arrayList.get(i);
            gl.Y0(false);
            jl5 jl5Var = this.j5;
            if (jl5Var == null || imageReceiver != this.C4) {
                jl5Var = null;
            }
            if (jl5Var == null) {
                jl5Var = this.d.k(i);
            }
            uu9 uu9Var = (uu9) arrayList.get(i);
            long j3 = uu9Var.b.size;
            gl5 gl5Var14 = new gl5();
            gl5Var14.h = uu9Var;
            imageReceiver.Z(gl5Var14, "d", null, null, jl5Var != null ? new BitmapDrawable(jl5Var.c) : null, j3, null, null, 0);
            return;
        }
        ArrayList arrayList2 = this.g7;
        if (arrayList2.isEmpty()) {
            l98 l98Var = this.j7;
            if (l98Var != null) {
                int[] iArr = new int[1];
                TLObject d = l98Var.d(i);
                TLRPC.PhotoSize f = this.j7.f(d, iArr);
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
                    if (!this.j7.a(i) && !this.j7.e(i)) {
                        if (imageReceiver != this.C4 || (kmVar2 = this.k2) == null) {
                            return;
                        }
                        imageReceiver.g0(kmVar2);
                        this.k2.f(this.f0);
                        return;
                    }
                    if (f.location instanceof TLRPC.TL_fileLocationUnavailable) {
                        imageReceiver.g0(this.E.getResources().getDrawable(R.drawable.photoview_placeholder));
                        return;
                    }
                    jl5 jl5Var2 = this.j5;
                    if (jl5Var2 == null || imageReceiver != this.C4) {
                        jl5Var2 = null;
                    }
                    imageReceiver.Z(null, null, jl5Var2 == null ? gl5.c(f, (TLRPC.Document) d) : null, "b", jl5Var2 != null ? new BitmapDrawable(jl5Var2.c) : null, 0L, null, this.j7.g(), 1);
                    return;
                }
                TLRPC.Photo photo2 = (TLRPC.Photo) d;
                jl5 jl5Var3 = this.j5;
                if (jl5Var3 == null || imageReceiver != this.C4) {
                    jl5Var3 = null;
                }
                if (iArr[0] == 0) {
                    iArr[0] = -1;
                }
                if ((up3.q(this.U).l() & 1) != 0 || this.P4 == i) {
                    photoSize2 = null;
                } else {
                    ba4.G(this.U);
                    photoSize2 = null;
                    if (!ba4.J(f, null, true, true).exists()) {
                        r13 = false;
                    }
                }
                if (jl5Var3 == null) {
                    gl5Var5 = gl5.i(ba4.w(photo2.sizes, 80, false, photoSize2, false), photo2);
                    bitmapDrawable3 = null;
                } else {
                    bitmapDrawable3 = new BitmapDrawable(jl5Var3.c);
                    gl5Var5 = null;
                }
                imageReceiver.Z(r13 ? gl5.i(f, photo2) : null, null, gl5Var5, "b", bitmapDrawable3, iArr[0], null, this.j7.g(), 1);
                imageReceiver.Z0 = r13 ? null : 1;
                return;
            }
            ArrayList arrayList3 = this.Y6;
            if (arrayList3.isEmpty() || i < 0 || i >= arrayList3.size()) {
                k27Var = null;
            } else {
                k27 k27Var2 = (k27) arrayList3.get(i);
                imageReceiver.H0 = true;
                k27Var = k27Var2;
            }
            if (k27Var != null) {
                int i4 = k27Var.K1;
                if (!TextUtils.isEmpty(na7.q1(i4).C1(k27Var.k.restriction_reason))) {
                    imageReceiver.g0(this.E.getResources().getDrawable(R.drawable.photoview_placeholder));
                    return;
                }
                if (k27.K4(k27Var.k)) {
                    ArrayList arrayList4 = k27Var.p0;
                    if (arrayList4 == null || arrayList4.isEmpty()) {
                        imageReceiver.g0(this.E.getResources().getDrawable(R.drawable.photoview_placeholder));
                        return;
                    }
                    jl5 jl5Var4 = this.j5;
                    if (jl5Var4 == null || imageReceiver != this.C4) {
                        jl5Var4 = null;
                    }
                    TLRPC.PhotoSize w = ba4.w(k27Var.p0, kk7.q5, false, null, false);
                    if (k27Var.D3()) {
                        imageReceiver.G0 = true;
                        imageReceiver.Z(q0(i, null), null, jl5Var4 == null ? gl5.f(w, k27Var.n0) : null, "b", jl5Var4 != null ? new BitmapDrawable(jl5Var4.c) : null, 0L, null, k27Var, 1);
                    } else {
                        imageReceiver.G0 = w.w < 100 && w.h < 100;
                        imageReceiver.Z(null, null, jl5Var4 == null ? gl5.f(w, k27Var.n0) : null, "b", jl5Var4 != null ? new BitmapDrawable(jl5Var4.c) : null, 0L, null, k27Var, 1);
                    }
                    jl5 jl5Var5 = this.j5;
                    if (jl5Var5 != null) {
                        imageReceiver.o0(jl5Var5.e, 0, false);
                        return;
                    }
                    return;
                }
                if (imageReceiver == this.C4 && (kmVar = this.k2) != null) {
                    kmVar.f(this.f0);
                    imageReceiver.g0(this.k2);
                    return;
                }
                if (this.C5 == 1) {
                    if (k27Var.x()) {
                        TLRPC.Document F0 = k27Var.F0();
                        imageReceiver.G0 = true;
                        jl5 jl5Var6 = this.j5;
                        if (jl5Var6 == null || imageReceiver != this.C4) {
                            jl5Var6 = null;
                        }
                        int i5 = (int) (2048.0f / gl.p);
                        if ((up3.q(this.U).l() & 8) == 0 && this.P4 != i) {
                            ba4.G(this.U);
                            if (!ba4.I(F0).exists()) {
                                r13 = false;
                            }
                        }
                        if (jl5Var6 == null) {
                            gl5Var4 = gl5.c(ba4.w(k27Var.p0, 100, false, null, false), F0);
                            bitmapDrawable2 = null;
                        } else {
                            bitmapDrawable2 = new BitmapDrawable(jl5Var6.c);
                            gl5Var4 = null;
                        }
                        gl5 b = r13 ? gl5.b(F0) : null;
                        Locale locale = Locale.US;
                        imageReceiver.Z(b, tb4.m(i5, i5, "_"), gl5Var4, "b", bitmapDrawable2, F0.size, null, k27Var, 0);
                        imageReceiver.Z0 = r13 ? null : 1;
                        return;
                    }
                    Activity activity3 = this.E;
                    k98 k98Var = this.f0;
                    cr7 cr7Var = new cr7();
                    cr7Var.a = 0L;
                    cr7Var.b = 0.0f;
                    cr7Var.c = 0.0f;
                    cr7Var.d = 0L;
                    cr7Var.e = 0.0f;
                    cr7Var.f = 1.0f;
                    TextPaint textPaint = cr7.K;
                    textPaint.setTextSize(gl.L(14.0f));
                    TextPaint textPaint2 = cr7.L;
                    textPaint2.setTextSize(gl.L(19.0f));
                    cr7.M.setTextSize(gl.L(15.0f));
                    cr7.N.setTextSize(gl.L(15.0f));
                    cr7.O.setTextSize(gl.L(15.0f));
                    cr7.P.setTextSize(gl.L(15.0f));
                    cr7.J.setStrokeWidth(gl.L(2.0f));
                    cr7Var.n = k98Var;
                    cr7Var.r = k27Var;
                    cr7Var.s = up3.q(i4).k();
                    TLRPC.Document F02 = k27Var.F0();
                    if (F02 != null) {
                        String B = ba4.B(k27Var.F0());
                        cr7Var.F = B;
                        if (TextUtils.isEmpty(B)) {
                            B = "name";
                            cr7Var.F = "name";
                        }
                        int lastIndexOf = B.lastIndexOf(46);
                        String upperCase = lastIndexOf == -1 ? "" : B.substring(lastIndexOf + 1).toUpperCase();
                        cr7Var.E = upperCase;
                        if (((int) Math.ceil(textPaint.measureText(upperCase))) > gl.L(40.0f)) {
                            cr7Var.E = TextUtils.ellipsize(upperCase, textPaint, gl.L(40.0f), TextUtils.TruncateAt.END).toString();
                        }
                        Resources resources = activity3.getResources();
                        String str5 = k27Var.F0().mime_type;
                        cr7Var.y = resources.getDrawable(gl.l1(B, true)).mutate();
                        cr7Var.G = gl.i0(F02.size, false, false);
                        if (((int) Math.ceil(textPaint2.measureText(B))) > gl.L(320.0f)) {
                            cr7Var.F = TextUtils.ellipsize(B, textPaint2, gl.L(320.0f), TextUtils.TruncateAt.END).toString();
                        }
                    }
                    cr7Var.a();
                    imageReceiver.g0(cr7Var);
                    return;
                }
            }
            long[] jArr2 = new long[1];
            gl5 q0 = q0(i, jArr2);
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
            jl5 jl5Var7 = this.j5;
            if (jl5Var7 == null || imageReceiver != this.C4) {
                jl5Var7 = null;
            }
            if (jArr2[0] == 0) {
                jArr2[0] = -1;
            }
            if (k27Var != null) {
                photoSize = ba4.w(k27Var.p0, 100, false, null, false);
                tLObject = k27Var.n0;
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
            if (k27Var == null || !k27Var.Y4()) {
                z3 = false;
                if (this.z5 == 0) {
                    z3 = false;
                    if (!this.B5) {
                        i2 = 0;
                        z = false;
                        if (k27Var != null) {
                            z2 = z;
                            long j4 = this.z5;
                            if (j4 != 0) {
                                int i7 = this.U;
                                obj = j4 > 0 ? na7.q1(i7).V1(Long.valueOf(this.z5)) : na7.q1(i7).K0(Long.valueOf(-this.z5));
                                if (tLObject != null) {
                                    obj = tLObject;
                                }
                                if (jl5Var7 == null && (photoSize instanceof TLRPC.TL_photoStrippedSize)) {
                                    jl5Var7 = new jl5(fl5.B("b", photoSize.bytes));
                                }
                                jArr = jArr2;
                                gl5Var = null;
                                r24 = z2;
                            } else {
                                jArr = jArr2;
                                gl5Var = null;
                                obj = null;
                                r24 = z2;
                            }
                        } else if (this.C5 == 5) {
                            TLRPC.Document F03 = k27Var.F0();
                            r24 = z;
                            TLRPC.VideoSize J0 = k27.J0(F03);
                            k27 k27Var3 = k27Var;
                            jArr = jArr2;
                            gl5Var = J0 != null ? gl5.d(J0, F03) : null;
                            obj = k27Var3;
                        } else {
                            z2 = z;
                            obj = k27Var;
                            jArr = jArr2;
                            gl5Var = null;
                            r24 = z2;
                        }
                        if (gl5Var == null) {
                            imageReceiver.Y(q0, this.C5 == 5 ? "g" : null, gl5Var, null, jl5Var7 == null ? gl5.f(photoSize, tLObject) : null, "b", jl5Var7 != null ? new BitmapDrawable(jl5Var7.c) : null, jArr[r24], null, obj, i2);
                            imageReceiver.u0 = true;
                            return;
                        }
                        Object obj3 = obj;
                        long[] jArr3 = jArr;
                        String str6 = (this.z5 == 0 || q0.p != 2) ? null : "g";
                        boolean z7 = true;
                        if ((up3.q(this.U).l() & 1) == 0 && this.P4 != i) {
                            ba4.G(this.U);
                            if (!ba4.I(n0).exists()) {
                                z7 = r24;
                            }
                        }
                        if (jl5Var7 == null) {
                            gl5Var2 = q0;
                            gl5Var3 = gl5.f(photoSize, tLObject);
                            bitmapDrawable = null;
                        } else {
                            bitmapDrawable = new BitmapDrawable(jl5Var7.c);
                            gl5Var2 = q0;
                            gl5Var3 = null;
                        }
                        imageReceiver.Z(z7 ? gl5Var2 : null, str6, gl5Var3, "b", bitmapDrawable, jArr3[r24], null, obj3, i2);
                        imageReceiver.Z0 = z7 ? null : 1;
                        return;
                    }
                }
            } else {
                z3 = false;
            }
            i2 = 1;
            z = z3;
            if (k27Var != null) {
            }
            if (gl5Var == null) {
            }
        } else {
            if (i < 0 || i >= arrayList2.size()) {
                imageReceiver.g0(null);
                return;
            }
            Object obj4 = arrayList2.get(i);
            int Y0 = (int) (gl.Y0(false) / gl.p);
            jl5 jl5Var8 = this.j5;
            if (jl5Var8 == null || imageReceiver != this.C4) {
                jl5Var8 = null;
            }
            if (jl5Var8 == null) {
                jl5Var8 = this.d.k(i);
            }
            if (obj4 instanceof jm6) {
                jm6 jm6Var = (jm6) obj4;
                String str7 = jm6Var.I;
                zl6 zl6Var4 = jm6Var.A;
                boolean z8 = jm6Var.b;
                if (!z8 || jm6Var.d()) {
                    String str8 = jm6Var.i;
                    if (str8 != null) {
                        str7 = str8;
                    } else {
                        imageReceiver.o0(jm6Var.J, jm6Var.K, false);
                    }
                    Locale locale2 = Locale.US;
                    str = tb4.m(Y0, Y0, "_");
                    str4 = str7;
                } else {
                    str4 = jm6Var.c;
                    if (str4 == null) {
                        str4 = "vthumb://" + jm6Var.C + ":" + str7;
                    } else if (this.m5) {
                        Bitmap decodeFile = BitmapFactory.decodeFile(str4);
                        if (decodeFile != null) {
                            jl5Var8 = new jl5(decodeFile);
                            jm6Var.c = null;
                        }
                        str = null;
                        str4 = null;
                    }
                    str = null;
                }
                uscVar = null;
                gl5Var6 = null;
                z4 = z8;
                i3 = 0;
                str2 = str4;
                j = 0;
                zl6Var = zl6Var4;
                r11 = 0;
                tLObject2 = null;
            } else {
                String str9 = "d";
                if (obj4 instanceof TLRPC.BotInlineResult) {
                    TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) obj4;
                    if (botInlineResult.type.equals(MediaStreamTrack.VIDEO_TRACK_KIND) || k27.J4(botInlineResult.document)) {
                        TLRPC.Document document6 = botInlineResult.document;
                        if (document6 != null) {
                            TLObject w2 = ba4.w(document6.thumbs, 90, false, null, false);
                            document2 = botInlineResult.document;
                            tLObject3 = w2;
                            str = null;
                            uscVar = null;
                            gl5Var7 = null;
                            document3 = null;
                            j2 = 0;
                            gl5Var9 = gl5Var7;
                            tLObject4 = tLObject3;
                            z4 = false;
                            TLRPC.Document document7 = document3;
                            tLObject2 = document2;
                            j = j2;
                            str2 = null;
                            i3 = 1;
                            zl6Var = null;
                            document5 = document7;
                            gl5Var6 = gl5Var9;
                            r11 = tLObject4;
                        } else {
                            TLRPC.WebDocument webDocument = botInlineResult.thumb;
                            if (webDocument instanceof TLRPC.TL_webDocument) {
                                uscVar = usc.c(webDocument);
                                str = null;
                                r7 = null;
                                document2 = r7;
                                gl5Var8 = r7;
                                TLRPC.Document document8 = document2;
                                document3 = document8;
                                gl5Var7 = gl5Var8;
                                tLObject3 = document8;
                                j2 = 0;
                                gl5Var9 = gl5Var7;
                                tLObject4 = tLObject3;
                                z4 = false;
                                TLRPC.Document document72 = document3;
                                tLObject2 = document2;
                                j = j2;
                                str2 = null;
                                i3 = 1;
                                zl6Var = null;
                                document5 = document72;
                                gl5Var6 = gl5Var9;
                                r11 = tLObject4;
                            }
                        }
                    } else {
                        if (!botInlineResult.type.equals("gif") || (document4 = botInlineResult.document) == null) {
                            TLRPC.Photo photo3 = botInlineResult.photo;
                            if (photo3 != null) {
                                TLRPC.PhotoSize w3 = ba4.w(photo3.sizes, gl.Y0(false), false, null, false);
                                ?? r2 = botInlineResult.photo;
                                long j5 = w3.size;
                                Locale locale3 = Locale.US;
                                j2 = j5;
                                document3 = null;
                                document2 = r2;
                                tLObject4 = w3;
                                str = tb4.m(Y0, Y0, "_");
                                uscVar = null;
                                gl5Var9 = null;
                            } else if (botInlineResult.content instanceof TLRPC.TL_webDocument) {
                                if (botInlineResult.type.equals("gif")) {
                                    TLRPC.WebDocument webDocument2 = botInlineResult.thumb;
                                    if ((webDocument2 instanceof TLRPC.TL_webDocument) && "video/mp4".equals(webDocument2.mime_type)) {
                                        gl5Var10 = gl5.p(usc.c(botInlineResult.thumb));
                                        String str10 = str9;
                                        uscVar = usc.c(botInlineResult.content);
                                        str = str10;
                                        document2 = null;
                                        gl5Var8 = gl5Var10;
                                        TLRPC.Document document82 = document2;
                                        document3 = document82;
                                        gl5Var7 = gl5Var8;
                                        tLObject3 = document82;
                                        j2 = 0;
                                        gl5Var9 = gl5Var7;
                                        tLObject4 = tLObject3;
                                    }
                                } else {
                                    Locale locale4 = Locale.US;
                                    str9 = tb4.m(Y0, Y0, "_");
                                }
                                gl5Var10 = null;
                                String str102 = str9;
                                uscVar = usc.c(botInlineResult.content);
                                str = str102;
                                document2 = null;
                                gl5Var8 = gl5Var10;
                                TLRPC.Document document822 = document2;
                                document3 = document822;
                                gl5Var7 = gl5Var8;
                                tLObject3 = document822;
                                j2 = 0;
                                gl5Var9 = gl5Var7;
                                tLObject4 = tLObject3;
                            }
                        } else {
                            long j6 = document4.size;
                            TLRPC.VideoSize J02 = k27.J0(document4);
                            document3 = document4;
                            j2 = j6;
                            document2 = null;
                            tLObject4 = null;
                            gl5Var9 = J02 != null ? gl5.d(J02, document4) : null;
                            str = "d";
                            uscVar = null;
                        }
                        z4 = false;
                        TLRPC.Document document722 = document3;
                        tLObject2 = document2;
                        j = j2;
                        str2 = null;
                        i3 = 1;
                        zl6Var = null;
                        document5 = document722;
                        gl5Var6 = gl5Var9;
                        r11 = tLObject4;
                    }
                    str = null;
                    uscVar = null;
                    r7 = null;
                    document2 = r7;
                    gl5Var8 = r7;
                    TLRPC.Document document8222 = document2;
                    document3 = document8222;
                    gl5Var7 = gl5Var8;
                    tLObject3 = document8222;
                    j2 = 0;
                    gl5Var9 = gl5Var7;
                    tLObject4 = tLObject3;
                    z4 = false;
                    TLRPC.Document document7222 = document3;
                    tLObject2 = document2;
                    j = j2;
                    str2 = null;
                    i3 = 1;
                    zl6Var = null;
                    document5 = document7222;
                    gl5Var6 = gl5Var9;
                    r11 = tLObject4;
                } else if (obj4 instanceof nm6) {
                    nm6 nm6Var = (nm6) obj4;
                    TLRPC.PhotoSize photoSize4 = nm6Var.L;
                    if (photoSize4 != null) {
                        tLObject2 = nm6Var.K;
                        j = photoSize4.size;
                        photoSize3 = photoSize4;
                        document = null;
                        str3 = null;
                    } else {
                        String str11 = nm6Var.i;
                        if (str11 != null) {
                            str3 = str11;
                            document = null;
                            photoSize3 = null;
                            tLObject2 = null;
                            j = 0;
                        } else {
                            document = nm6Var.J;
                            if (document != null) {
                                j = document.size;
                                photoSize3 = null;
                                tLObject2 = null;
                                str3 = null;
                            } else {
                                String str12 = nm6Var.C;
                                j = nm6Var.G;
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
                    zl6Var = nm6Var.A;
                    str = "d";
                    uscVar = null;
                    document5 = document;
                    gl5Var6 = null;
                    r11 = photoSize3;
                } else {
                    str = null;
                    uscVar = null;
                    gl5Var6 = null;
                    r11 = 0;
                    zl6Var = null;
                    tLObject2 = null;
                    str2 = null;
                    i3 = 0;
                    z4 = false;
                    j = 0;
                }
            }
            if (document5 != null) {
                TLRPC.PhotoSize w4 = ba4.w(document5.thumbs, 90, false, null, false);
                if (gl5Var6 != null) {
                    gl5 b2 = gl5.b(document5);
                    if (jl5Var8 == null) {
                        gl5Var12 = gl5.c(w4, document5);
                        gl5Var11 = b2;
                    } else {
                        gl5Var11 = b2;
                        gl5Var12 = null;
                    }
                    Locale locale5 = Locale.US;
                    gl5 gl5Var15 = gl5Var6;
                    String m = tb4.m(Y0, Y0, "_");
                    if (jl5Var8 != null) {
                        BitmapDrawable bitmapDrawable5 = new BitmapDrawable(jl5Var8.c);
                        gl5Var13 = gl5Var15;
                        obj2 = obj4;
                        bitmapDrawable4 = bitmapDrawable5;
                    } else {
                        gl5Var13 = gl5Var15;
                        obj2 = obj4;
                        bitmapDrawable4 = null;
                    }
                    zl6Var2 = zl6Var;
                    imageReceiver.Y(gl5Var11, "d", gl5Var13, null, gl5Var12, m, bitmapDrawable4, j, null, obj2, i3);
                } else {
                    long j7 = j;
                    zl6Var2 = zl6Var;
                    int i8 = i3;
                    gl5 b3 = gl5.b(document5);
                    gl5 c = jl5Var8 == null ? gl5.c(w4, document5) : null;
                    Locale locale6 = Locale.US;
                    imageReceiver.Z(b3, "d", c, tb4.m(Y0, Y0, "_"), jl5Var8 != null ? new BitmapDrawable(jl5Var8.c) : null, j7, null, obj4, i8);
                }
            } else {
                zl6 zl6Var5 = zl6Var;
                int i10 = i3;
                if (r11 == 0) {
                    zl6Var2 = zl6Var5;
                    String str13 = str;
                    if (uscVar == null) {
                        z5 = z4;
                        if (jl5Var8 != null) {
                            drawable2 = new BitmapDrawable(jl5Var8.c);
                        } else if (!z5 || (activity = this.E) == null) {
                            drawable = null;
                            imageReceiver.e0(str2, str13, drawable, null, j);
                        } else {
                            drawable2 = activity.getResources().getDrawable(R.drawable.nophotos);
                        }
                        drawable = drawable2;
                        imageReceiver.e0(str2, str13, drawable, null, j);
                    } else if (gl5Var6 != null) {
                        imageReceiver.a0(gl5.p(uscVar), str13, gl5Var6, null, null, obj4, i10);
                    } else {
                        gl5 p = gl5.p(uscVar);
                        if (jl5Var8 != null) {
                            drawable3 = new BitmapDrawable(jl5Var8.c);
                            z5 = z4;
                        } else {
                            z5 = z4;
                            drawable3 = (!z5 || (activity2 = this.E) == null) ? null : activity2.getResources().getDrawable(R.drawable.nophotos);
                        }
                        imageReceiver.d0(p, str13, drawable3, null, obj4, i10);
                    }
                    if (c33Var != null) {
                        z6 = z5;
                        zl6Var3 = zl6Var2;
                        imageReceiver2 = imageReceiver;
                    } else if (zl6Var2 != null) {
                        float f2 = zl6Var2.a;
                        float f3 = zl6Var2.b;
                        float f4 = zl6Var2.d;
                        int i11 = zl6Var2.k;
                        float f5 = zl6Var2.c;
                        float f6 = zl6Var2.e;
                        float f7 = zl6Var2.f;
                        boolean z9 = zl6Var2.l;
                        z6 = z5;
                        zl6Var3 = zl6Var2;
                        imageReceiver2 = imageReceiver;
                        c33Var.b(true, f2, f3, f4, i11, f5, 1.0f, 1.0f, f6, f7, 0.0f, 0.0f, z9);
                    } else {
                        z6 = z5;
                        zl6Var3 = zl6Var2;
                        imageReceiver2 = imageReceiver;
                        c33Var.a = false;
                    }
                    if (imageReceiver2 != this.B4) {
                        this.H1 = zl6Var3;
                        this.H4 = z6;
                        return;
                    }
                    zl6 zl6Var6 = zl6Var3;
                    boolean z10 = z6;
                    if (imageReceiver2 == this.D4) {
                        this.I1 = zl6Var6;
                        this.K4 = z10;
                        return;
                    }
                    return;
                }
                gl5 f8 = gl5.f(r11, tLObject2);
                zl6Var2 = zl6Var5;
                imageReceiver.c0(f8, str, jl5Var8 != null ? new BitmapDrawable(jl5Var8.c) : null, j, null, obj4, i10);
            }
            z5 = z4;
            if (c33Var != null) {
            }
            if (imageReceiver2 != this.B4) {
            }
        }
    }

    public final void M2() {
        hbc hbcVar;
        int i;
        int i2;
        String str;
        hbc hbcVar2;
        hbc Z;
        String str2;
        ArrayList arrayList;
        String str3;
        String str4;
        String str5;
        k27 k27Var;
        lbc lbcVar;
        hbc hbcVar3;
        int i3;
        hbc hbcVar4;
        String str6;
        String str7;
        if (this.m7 == null && this.W4 == null && this.V4 != null) {
            K2();
        }
        lbc lbcVar2 = this.G2;
        String str8 = "";
        if (lbcVar2 == null || lbcVar2.Y() <= 1) {
            this.y0.setVisibility(8);
            this.J0.setVisibility(0);
            this.u0.setRightIcon(0);
            this.x0.g.t("", true, true);
            this.u7 = -1;
            return;
        }
        this.u0.setRightIcon(R.drawable.msg_arrowright);
        this.J0.setVisibility(8);
        this.y0.setVisibility(0);
        lbc lbcVar3 = this.G2;
        int T = lbcVar3.T();
        hbc Z2 = (T < 0 || T >= lbcVar3.Y()) ? null : lbcVar3.Z(T);
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
            textView.setText(k96.M0(2131746260, null));
            textView.setTypeface(gl.o());
            textView.setPadding(gl.L(16.0f), gl.L(9.0f), gl.L(16.0f), gl.L(8.0f));
            textView.setTextSize(1, 14.0f);
            int i4 = -1;
            textView.setTextColor(-1);
            this.y0.addView(textView, nme.o(-1, -2));
            final int i5 = -1;
            while (i5 < this.G2.Y()) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (i5 == i4) {
                    spannableStringBuilder.append((CharSequence) k96.M0(2131746262, null));
                    if (i5 != this.G2.e0 || Z2 == null) {
                        hbcVar3 = Z2;
                        i3 = T2;
                        hbcVar4 = null;
                    } else {
                        spannableStringBuilder.append((CharSequence) " ");
                        int length = spannableStringBuilder.length();
                        if (gba.O0) {
                            spannableStringBuilder.append((CharSequence) Integer.toString(Z2.b)).append((CharSequence) "x").append((CharSequence) Integer.toString(Z2.c));
                        } else {
                            spannableStringBuilder.append((CharSequence) String.valueOf(Z2.b())).append((CharSequence) "p");
                        }
                        hbcVar3 = Z2;
                        i3 = T2;
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(bkb.p1(0.5f, -1)), length, spannableStringBuilder.length(), 33);
                        hbcVar4 = hbcVar3;
                    }
                } else {
                    hbcVar3 = Z2;
                    i3 = T2;
                    hbc Z3 = this.G2.Z(i5);
                    if (Z3.a) {
                        spannableStringBuilder.append((CharSequence) k96.M0(2131746259, null));
                    } else if (Z3.b() >= 2000) {
                        spannableStringBuilder.append((CharSequence) k96.M0(2131746269, null));
                    } else if (Z3.b() >= 1400) {
                        spannableStringBuilder.append((CharSequence) k96.M0(2131746271, null));
                    } else if (Z3.b() >= 1000) {
                        spannableStringBuilder.append((CharSequence) k96.M0(2131746274, null));
                    } else if (Z3.b() >= 700) {
                        spannableStringBuilder.append((CharSequence) k96.M0(2131746264, null));
                    } else if (Z3.b() >= 400) {
                        spannableStringBuilder.append((CharSequence) k96.M0(2131746265, null));
                    } else if (Z3.b() >= 340) {
                        spannableStringBuilder.append((CharSequence) k96.M0(2131746266, null));
                    } else if (Z3.b() >= 200) {
                        spannableStringBuilder.append((CharSequence) k96.M0(2131746267, null));
                    } else {
                        spannableStringBuilder.append((CharSequence) k96.M0(2131746272, null));
                    }
                    spannableStringBuilder.append((CharSequence) " ");
                    int length2 = spannableStringBuilder.length();
                    if (gba.O0) {
                        spannableStringBuilder.append((CharSequence) Integer.toString(Z3.b)).append((CharSequence) "x").append((CharSequence) Integer.toString(Z3.c));
                    } else {
                        spannableStringBuilder.append((CharSequence) String.valueOf(Z3.b())).append((CharSequence) "p");
                    }
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(bkb.p1(0.5f, -1)), length2, spannableStringBuilder.length(), 33);
                    hbcVar4 = Z3;
                }
                a8 c = r7.c(false, false, this.y0, 0, spannableStringBuilder, true, null);
                if (!gba.O0 || hbcVar4 == null) {
                    str6 = str9;
                    str7 = str10;
                    c.setSubtext("");
                } else {
                    StringBuilder sb = new StringBuilder();
                    ArrayList arrayList3 = hbcVar4.d;
                    int size = arrayList3.size();
                    int i6 = 0;
                    while (i6 < size) {
                        Object obj = arrayList3.get(i6);
                        int i7 = i6 + 1;
                        jbc jbcVar = (jbc) obj;
                        if (sb.length() > 0) {
                            sb.append(str10);
                        }
                        ArrayList arrayList4 = arrayList3;
                        if (!TextUtils.isEmpty(jbcVar.m)) {
                            sb.append(jbcVar.m);
                            sb.append(str9);
                        }
                        int i8 = size;
                        sb.append(gl.i0(jbcVar.k, false, false).replace(" ", ""));
                        sb.append("(");
                        StringBuilder sb2 = new StringBuilder();
                        String str12 = str9;
                        String str13 = str10;
                        sb2.append(gl.i0((long) jbcVar.l, false, false).replace(" ", ""));
                        sb2.append("/s)");
                        sb.append(sb2.toString());
                        sb.append(jbcVar.c() ? "!" : " ");
                        sb.append(jbcVar.b() ? "!" : " ");
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
                c.setOnClickListener(new View.OnClickListener(this) { // from class: x68
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
                                Drawable[] drawableArr = PhotoViewer.f9;
                                photoViewer.x(i10);
                                break;
                            default:
                                Drawable[] drawableArr2 = PhotoViewer.f9;
                                photoViewer.x(i10);
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
                Z2 = hbcVar3;
                i4 = -1;
            }
            hbcVar = Z2;
            i = T2;
            j8 j8Var = new j8(bkb.G8, this.w2, this.F);
            j8Var.setTag(R.id.fit_width_tag, 1);
            j8Var.setColor(-15198184);
            this.y0.addView(j8Var, nme.o(-1, 8));
        } else {
            hbcVar = Z2;
            i = T2;
            String str14 = ", ";
            String str15 = "\n";
            final int i10 = -1;
            while (i10 < this.G2.Y()) {
                int i11 = i10 + 1;
                a8 a8Var = (a8) arrayList2.get(i11);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                if (i10 == -1) {
                    spannableStringBuilder2.append((CharSequence) k96.M0(2131746262, null));
                    if (i10 != this.G2.e0 || hbcVar == null) {
                        i2 = i11;
                        str = str14;
                        hbcVar2 = hbcVar;
                        str2 = str11;
                        Z = null;
                    } else {
                        spannableStringBuilder2.append((CharSequence) " ");
                        int length3 = spannableStringBuilder2.length();
                        if (gba.O0) {
                            hbcVar2 = hbcVar;
                            spannableStringBuilder2.append((CharSequence) Integer.toString(hbcVar2.b)).append((CharSequence) str11).append((CharSequence) Integer.toString(hbcVar2.c));
                        } else {
                            hbcVar2 = hbcVar;
                            spannableStringBuilder2.append((CharSequence) String.valueOf(hbcVar2.b())).append((CharSequence) "p");
                        }
                        i2 = i11;
                        str = str14;
                        spannableStringBuilder2.setSpan(new ForegroundColorSpan(bkb.p1(0.5f, -1)), length3, spannableStringBuilder2.length(), 33);
                        str2 = str11;
                        Z = hbcVar2;
                    }
                } else {
                    i2 = i11;
                    str = str14;
                    hbcVar2 = hbcVar;
                    Z = this.G2.Z(i10);
                    if (Z.a) {
                        spannableStringBuilder2.append((CharSequence) k96.M0(2131746259, null));
                    } else if (Z.b() >= 2000) {
                        spannableStringBuilder2.append((CharSequence) k96.M0(2131746269, null));
                    } else if (Z.b() >= 1400) {
                        spannableStringBuilder2.append((CharSequence) k96.M0(2131746271, null));
                    } else if (Z.b() >= 1000) {
                        spannableStringBuilder2.append((CharSequence) k96.M0(2131746274, null));
                    } else if (Z.b() >= 700) {
                        spannableStringBuilder2.append((CharSequence) k96.M0(2131746264, null));
                    } else if (Z.b() >= 400) {
                        spannableStringBuilder2.append((CharSequence) k96.M0(2131746265, null));
                    } else if (Z.b() >= 340) {
                        spannableStringBuilder2.append((CharSequence) k96.M0(2131746266, null));
                    } else if (Z.b() >= 200) {
                        spannableStringBuilder2.append((CharSequence) k96.M0(2131746267, null));
                    } else {
                        spannableStringBuilder2.append((CharSequence) k96.M0(2131746272, null));
                    }
                    spannableStringBuilder2.append((CharSequence) " ");
                    int length4 = spannableStringBuilder2.length();
                    if (gba.O0) {
                        spannableStringBuilder2.append((CharSequence) Integer.toString(Z.b)).append((CharSequence) str11).append((CharSequence) Integer.toString(Z.c));
                    } else {
                        spannableStringBuilder2.append((CharSequence) String.valueOf(Z.b())).append((CharSequence) "p");
                    }
                    str2 = str11;
                    spannableStringBuilder2.setSpan(new ForegroundColorSpan(bkb.p1(0.5f, -1)), length4, spannableStringBuilder2.length(), 33);
                }
                a8Var.setText(spannableStringBuilder2);
                a8Var.setVisibility(0);
                if (!gba.O0 || Z == null) {
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
                        jbc jbcVar2 = (jbc) obj2;
                        String str16 = str15;
                        if (sb3.length() > 0) {
                            sb3.append(str16);
                        }
                        if (TextUtils.isEmpty(jbcVar2.m)) {
                            str5 = str;
                        } else {
                            sb3.append(jbcVar2.m);
                            str5 = str;
                            sb3.append(str5);
                        }
                        int i14 = size2;
                        ArrayList arrayList6 = arrayList5;
                        sb3.append(gl.i0(jbcVar2.k, false, false).replace(" ", ""));
                        sb3.append(" (");
                        StringBuilder sb4 = new StringBuilder();
                        ArrayList arrayList7 = arrayList2;
                        sb4.append(gl.i0((long) jbcVar2.l, false, false).replace(" ", ""));
                        sb4.append("/s)");
                        sb3.append(sb4.toString());
                        sb3.append(jbcVar2.c() ? "!" : " ");
                        sb3.append(jbcVar2.b() ? "!" : " ");
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
                a8Var.setOnClickListener(new View.OnClickListener(this) { // from class: x68
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
                                Drawable[] drawableArr = PhotoViewer.f9;
                                photoViewer.x(i102);
                                break;
                            default:
                                Drawable[] drawableArr2 = PhotoViewer.f9;
                                photoViewer.x(i102);
                                break;
                        }
                    }
                });
                arrayList2 = arrayList;
                hbcVar = hbcVar2;
                str14 = str3;
                i10 = i2;
                str11 = str2;
                str15 = str4;
            }
        }
        hbc hbcVar5 = hbcVar;
        if (hbcVar5 != null) {
            if (hbcVar5.b() >= 2000) {
                str8 = k96.M0(2131746268, null);
            } else if (hbcVar5.b() >= 1000) {
                str8 = k96.M0(2131746273, null);
            } else if (hbcVar5.b() >= 700) {
                str8 = k96.M0(2131746263, null);
            } else {
                str8 = hbcVar5.b() + "p";
            }
        }
        this.x0.g.t(str8, true, true);
        h88 h88Var = this.s3;
        if (h88Var != null && (k27Var = this.T4) != null && (lbcVar = this.G2) != null) {
            h88Var.c(k27Var, lbcVar);
        }
        if (this.u7 != i) {
            try {
                fo.b(0);
                if (tg2.D().I()) {
                    tg2.D().X(k0());
                }
                lbc lbcVar4 = this.G2;
                if (lbcVar4 != null) {
                    fo.z(lbcVar4.c0());
                }
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
    }

    public final void N() {
        if (this.C4.m() != null || this.g7.isEmpty() || this.d2 == 1) {
            return;
        }
        String str = this.C4.R;
        String str2 = this.x4;
        if (str2 == null || !str2.equals(str)) {
            this.w4 = (byte) 0;
            jl5 p = this.C4.p();
            int i = this.C4.V;
            if (str == null || p == null || p.c == null) {
                return;
            }
            Utilities.e.c(new q76((Object) this, (Object) p, i, (Object) str, (byte) 17));
        }
    }

    public final void N1(int i, ju7 ju7Var) {
        ArrayList arrayList;
        String str;
        boolean z;
        if (ju7Var != null) {
            ju7Var.a();
            ju7Var.setVisibility(8);
            ArrayList arrayList2 = this.g7;
            if (arrayList2.isEmpty() || i < 0 || i >= arrayList2.size()) {
                return;
            }
            Object obj = arrayList2.get(i);
            if (obj instanceof jm6) {
                jm6 jm6Var = (jm6) obj;
                z = jm6Var.b;
                str = jm6Var.j;
                arrayList = jm6Var.p;
            } else {
                if (obj instanceof nm6) {
                    nm6 nm6Var = (nm6) obj;
                    str = nm6Var.j;
                    arrayList = nm6Var.p;
                } else {
                    arrayList = null;
                    str = null;
                }
                z = false;
            }
            ju7Var.setVisibility(0);
            ju7Var.b(arrayList, z, false, this.d2 != 11);
            if (str == null) {
                ju7Var.a = null;
                ju7Var.d = null;
                ju7Var.setBackground(null);
            } else {
                ju7Var.a = BitmapFactory.decodeFile(str);
                BitmapDrawable bitmapDrawable = new BitmapDrawable(ju7Var.a);
                ju7Var.d = bitmapDrawable;
                ju7Var.setBackground(bitmapDrawable);
            }
        }
    }

    public final void N2() {
        k27 k27Var;
        o98 o98Var = this.d;
        if (o98Var != null) {
            int G = o98Var.G();
            this.P0.a(G);
            if (G == 0) {
                z2(false, true);
            }
            if (this.T0 != null) {
                o98 o98Var2 = this.d;
                long a = o98Var2 != null ? o98Var2.a() : 0L;
                if (a == 0 && (k27Var = this.T4) != null) {
                    a = k27.B0(k27Var.k);
                }
                jh3 jh3Var = this.T0;
                o98 o98Var3 = this.d;
                long K1 = (o98Var3 == null || !o98Var3.p() || this.d.v()) ? na7.q1(this.U).K1(a) : 0L;
                o98 o98Var4 = this.d;
                jh3Var.i(Math.max(1, o98Var4 == null ? 1 : o98Var4.G()), K1, true);
            }
        }
    }

    public final void O() {
        SharedPreferences.Editor edit = na7.c1().edit();
        edit.putInt(String.format("compress_video_%d", Integer.valueOf(this.f8)), this.e8);
        edit.commit();
        R2();
        O2();
    }

    /* JADX WARN: Code restructure failed: missing block: B:380:0x026c, code lost:
    
        if (k27.n1(((k27) r3.get(0)).k).webpage.url != null) goto L125;
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
    /* JADX WARN: Type inference failed for: r6v51, types: [m98] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void O1(boolean z, boolean z2, boolean z3, int i) {
        int i2;
        int i3;
        CharSequence charSequence;
        boolean z4;
        k27 k27Var;
        CharSequence charSequence2;
        String L0;
        k27 k27Var2;
        boolean z5;
        ArrayList arrayList;
        Integer num;
        boolean z6;
        boolean z7;
        zl6 zl6Var;
        boolean z8;
        int i4;
        boolean z9;
        boolean z10;
        long j;
        long j2;
        boolean z11;
        boolean z12;
        boolean z13;
        zl6 zl6Var2;
        CharSequence charSequence3;
        int i5;
        boolean z14;
        int i6;
        jm6 jm6Var;
        boolean z15;
        int i7;
        boolean z16;
        zl6 zl6Var3;
        boolean z17;
        boolean z18;
        boolean z19;
        int i8;
        boolean z20;
        int i10;
        k27 k27Var3;
        String str;
        float f;
        boolean z21;
        TLRPC.Photo photo;
        Integer num2;
        int i11;
        TLRPC.Photo photo2;
        String str2;
        boolean z22;
        mu1 mu1Var;
        o98 o98Var;
        String str3;
        int i12;
        boolean z23;
        float f2;
        boolean z24;
        int i13;
        PorterDuffColorFilter porterDuffColorFilter;
        o98 o98Var2;
        TLRPC.User h;
        TLRPC.Chat f3;
        String str4;
        int i14;
        TLRPC.Photo photo3;
        ArrayList arrayList2;
        String str5;
        b1c b1cVar;
        ArrayList arrayList3;
        boolean z25;
        CharSequence C1;
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
        if (z || photoViewer.Q4 != i || z3) {
            int i20 = photoViewer.Q4;
            int i21 = 0;
            boolean z29 = i >= i20;
            photoViewer.Q4 = i;
            photoViewer.p0(i);
            if (z28) {
                TransitionSet transitionSet = new TransitionSet();
                transitionSet.addTransition(new Fade());
                transitionSet.addTransition(new ChangeBounds());
                transitionSet.setOrdering(0);
                transitionSet.setDuration(220L);
                transitionSet.setInterpolator((TimeInterpolator) s33.f);
                TransitionManager.beginDelayedTransition(photoViewer.I0, transitionSet);
            }
            photoViewer.p0.u(23);
            photoViewer.R4 = false;
            ArrayList arrayList4 = photoViewer.Y6;
            float f4 = 0.0f;
            long j3 = 0;
            if (arrayList4.isEmpty()) {
                ArrayList arrayList5 = photoViewer.e7;
                if (arrayList5.isEmpty()) {
                    ArrayList arrayList6 = photoViewer.a7;
                    if (arrayList6.isEmpty()) {
                        ArrayList arrayList7 = photoViewer.g7;
                        if (arrayList7.isEmpty()) {
                            i2 = i;
                            l98 l98Var = photoViewer.j7;
                            if (l98Var != null) {
                                int j4 = l98Var.j();
                                int i22 = photoViewer.Q4;
                                if (i22 < 0 || i22 >= j4) {
                                    return;
                                }
                                photoViewer.p0.u(19);
                                photoViewer.p0.u(20);
                                photoViewer.l2 = !na7.q1(photoViewer.U).z2(photoViewer.E5) && ((k27Var2 = photoViewer.T4) == null || !k27Var2.y2()) && !photoViewer.L0(photoViewer.j7);
                                TL_iv.PageBlock pageBlock = photoViewer.j7.get(photoViewer.Q4);
                                CharSequence i23 = photoViewer.j7.i(photoViewer.Q4);
                                boolean a = photoViewer.j7.a(photoViewer.Q4);
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
                                        photoViewer.Q1(a8Var, true, true);
                                    } else {
                                        a8Var.setEnabled(false);
                                        photoViewer.P1(0.5f, photoViewer.w0, true, true);
                                        photoViewer.H0();
                                    }
                                } else {
                                    photoViewer.p0.u(10);
                                    photoViewer.Q1(photoViewer.w0, false, true);
                                }
                                if (photoViewer.j0.getVisibility() != 8) {
                                    photoViewer.j0.setVisibility(8);
                                }
                                photoViewer.j0.setTag(null);
                                m98 m98Var = photoViewer.O;
                                if (m98Var != null) {
                                    m98Var.d(j4 > 1, true);
                                    photoViewer.O.a(photoViewer.Q4 + 1, j4);
                                }
                                if (photoViewer.k2 != null || (!photoViewer.j7.a(i2) && photoViewer.j7.e(i2))) {
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
                                    L0 = k96.L0(2131753968);
                                } else {
                                    L0 = j4 == 1 ? a ? k96.L0(2131753930) : k96.L0(2131753945) : null;
                                    photoViewer.u0.setVisibility(photoViewer.l2 ? 0 : 8);
                                    photoViewer.v0.setVisibility(photoViewer.l2 ? 0 : 8);
                                    photoViewer.p0.u(12);
                                    photoViewer.p0.m();
                                    i3 = 8;
                                }
                                photoViewer.m1.b();
                                photoViewer.j7.h(pageBlock);
                                charSequence = L0;
                                k27Var = null;
                                charSequence2 = i23;
                                z4 = z28;
                            } else {
                                i3 = 8;
                                charSequence = null;
                                photoViewer.p0.u(19);
                                photoViewer.p0.u(20);
                                z4 = z28;
                                k27Var = null;
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
                                photoViewer.Y4 = botInlineResult;
                                TLRPC.Document document = botInlineResult.document;
                                z16 = document != null ? k27.J4(document) : botInlineResult.content instanceof TLRPC.TL_webDocument ? botInlineResult.type.equals(MediaStreamTrack.VIDEO_TRACK_KIND) : false;
                                arrayList = arrayList7;
                                i2 = i;
                                z14 = z28;
                                z17 = false;
                                z18 = false;
                                z19 = false;
                                charSequence2 = null;
                                zl6Var3 = null;
                                charSequence3 = null;
                            } else {
                                boolean z33 = obj instanceof jm6;
                                if (z33) {
                                    jm6 jm6Var2 = (jm6) obj;
                                    photoViewer.e5 = jm6Var2.I;
                                    z6 = jm6Var2.d();
                                    z7 = jm6Var2.b;
                                    long j5 = jm6Var2.m;
                                    photoViewer.f5 = j5;
                                    num = 1;
                                    long j6 = jm6Var2.P;
                                    i4 = jm6Var2.E;
                                    arrayList = arrayList7;
                                    z10 = z33;
                                    j = j5;
                                    z9 = false;
                                    zl6Var = jm6Var2.A;
                                    z8 = jm6Var2.c();
                                    j2 = j6;
                                } else {
                                    arrayList = arrayList7;
                                    num = 1;
                                    if (obj instanceof nm6) {
                                        nm6 nm6Var = (nm6) obj;
                                        photoViewer.e5 = nm6Var.g();
                                        photoViewer.f5 = 0L;
                                        zl6Var = nm6Var.A;
                                        j3 = 0;
                                        z6 = false;
                                        if (nm6Var.H) {
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
                                        zl6Var = null;
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
                                        jm6 jm6Var3 = (jm6) obj;
                                        oac oacVar = jm6Var3.s;
                                        if (oacVar != null) {
                                            boolean z35 = oacVar.t;
                                            float f5 = oacVar.d;
                                            f2 = oacVar.e;
                                            f4 = f5;
                                            z23 = z35;
                                            i12 = oacVar.f;
                                            str3 = jm6Var3.g;
                                        } else {
                                            str3 = null;
                                            i12 = -1;
                                            z23 = false;
                                            f2 = 1.0f;
                                        }
                                        TLRPC.Photo photo4 = jm6Var3.e;
                                        String str6 = str3;
                                        k27Var3 = jm6Var3.f;
                                        i10 = i12;
                                        str = str6;
                                        z21 = z23;
                                        f = f2;
                                        photo = photo4;
                                    } else {
                                        i10 = -1;
                                        k27Var3 = null;
                                        str = null;
                                        f = 1.0f;
                                        z21 = false;
                                        photo = null;
                                    }
                                    if (i24 != -1) {
                                        k27 k27Var4 = k27Var3;
                                        String str7 = str;
                                        zl6Var2 = zl6Var;
                                        float f6 = f4;
                                        TLRPC.Photo photo5 = photo;
                                        charSequence3 = null;
                                        z13 = z10;
                                        photoViewer.u1(photoViewer.e5, j7, z21, f6, f, i10, j2);
                                        if (photoViewer.i2) {
                                            photoViewer.l2(false, z28);
                                            photoViewer.Z7.setVisibility(8);
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
                                            gl.R3(1.0f, photoViewer.f1, false, z28);
                                            gl.R3(1.0f, photoViewer.g1, false, z28);
                                            gl.R3(1.0f, photoViewer.h1, false, z28);
                                            photoViewer.k1.setVisibility(8);
                                        } else {
                                            photoViewer.l2(!z11, z28);
                                            int i25 = photoViewer.d2;
                                            if (i25 == 1 || i25 == 11) {
                                                num2 = num;
                                                i11 = 0;
                                                photoViewer.Z7.setVisibility(0);
                                                photoViewer.a1.setVisibility(8);
                                                photoViewer.a1.setTag(null);
                                                photoViewer.c1.setVisibility(0);
                                                photoViewer.c1.setTag(num2);
                                                photoViewer.b1.setVisibility(0);
                                                photoViewer.b1.setTag(num2);
                                                gl.R3(1.0f, photoViewer.f1, false, z28);
                                                gl.R3(1.0f, photoViewer.g1, false, z28);
                                                gl.R3(1.0f, photoViewer.h1, false, z28);
                                                photoViewer.k1.setVisibility(8);
                                            } else {
                                                photoViewer.Z7.setVisibility(8);
                                                photoViewer.a1.setVisibility(0);
                                                num2 = num;
                                                photoViewer.a1.setTag(num2);
                                                photoViewer.c1.setVisibility(8);
                                                photoViewer.c1.setTag(null);
                                                photoViewer.b1.setVisibility(8);
                                                photoViewer.b1.setTag(null);
                                                gl.R3(1.0f, photoViewer.f1, (photoViewer.e2 || z11) ? false : true, z28);
                                                gl.R3(1.0f, photoViewer.g1, !photoViewer.e2 && z11 && ((o98Var = photoViewer.d) == null || o98Var.O()), z28);
                                                if (z11) {
                                                    photoViewer.g1.a(!photoViewer.T0(), true);
                                                }
                                                w78 w78Var = photoViewer.h1;
                                                if (!photoViewer.e2 && !z11 && (mu1Var = photoViewer.l4) != null) {
                                                    if (!l7c.C(mu1Var.h())) {
                                                        if (hc2.V(photoViewer.l4.f())) {
                                                            if (i4 < 20) {
                                                                photo2 = photo5;
                                                                str2 = str7;
                                                                if (photo2 == null) {
                                                                }
                                                                z22 = true;
                                                                gl.R3(1.0f, w78Var, z22, z28);
                                                                w78 w78Var2 = photoViewer.h1;
                                                                if (photo2 != null) {
                                                                    w78Var2.a(photo2, k27Var4);
                                                                } else {
                                                                    w78Var2.setImage(str2);
                                                                }
                                                                photoViewer.k1.setVisibility((!photoViewer.e2 || photoViewer.f2) ? 8 : 0);
                                                                i11 = 0;
                                                            }
                                                        }
                                                    }
                                                    photo2 = photo5;
                                                    str2 = str7;
                                                    z22 = true;
                                                    gl.R3(1.0f, w78Var, z22, z28);
                                                    w78 w78Var22 = photoViewer.h1;
                                                    if (photo2 != null) {
                                                    }
                                                    photoViewer.k1.setVisibility((!photoViewer.e2 || photoViewer.f2) ? 8 : 0);
                                                    i11 = 0;
                                                }
                                                photo2 = photo5;
                                                str2 = str7;
                                                z22 = false;
                                                gl.R3(1.0f, w78Var, z22, z28);
                                                w78 w78Var222 = photoViewer.h1;
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
                                        zl6Var2 = zl6Var;
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
                                    zl6Var2 = zl6Var;
                                    Integer num3 = num;
                                    charSequence3 = null;
                                    photoViewer.l2(false, z28);
                                    photoViewer.Z7.setVisibility(8);
                                    gl.R3(1.0f, photoViewer.f1, false, z28);
                                    gl.R3(1.0f, photoViewer.g1, false, z28);
                                    gl.R3(1.0f, photoViewer.h1, false, z28);
                                    boolean z36 = photoViewer.s1 ? false : z28;
                                    photoViewer.s1 = false;
                                    if (!z13 || (z15 = (jm6Var = (jm6) obj).b)) {
                                        i2 = i;
                                        photoViewer.k1.setVisibility(8);
                                    } else {
                                        if (z15 || (i7 = photoViewer.d2) == 11 || i7 == 10) {
                                            i2 = i;
                                        } else {
                                            i2 = i;
                                            if ((photoViewer.P4 == i2 ? photoViewer.l0() : jm6Var.s) == null) {
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
                                        photoViewer.G.j();
                                    }
                                    o98 o98Var3 = photoViewer.d;
                                    String B = o98Var3 != null ? o98Var3.B(photoViewer.Q4) : null;
                                    i5 = 1;
                                    photoViewer.N.a(B != null ? B : "", true);
                                    z14 = z36;
                                }
                                if (z13) {
                                    jm6 jm6Var4 = (jm6) obj;
                                    photoViewer.m5 = jm6Var4.B == 0 && jm6Var4.D == j3 && arrayList.size() == i5;
                                    charSequence2 = photoViewer.v7 ? photoViewer.w7 : jm6Var4.a;
                                    i8 = jm6Var4.x;
                                    z20 = jm6Var4.u;
                                    z18 = jm6Var4.v;
                                    z17 = jm6Var4.w;
                                } else if (obj instanceof nm6) {
                                    nm6 nm6Var2 = (nm6) obj;
                                    charSequence2 = nm6Var2.I;
                                    i8 = nm6Var2.x;
                                    z20 = nm6Var2.u;
                                    z18 = nm6Var2.v;
                                    z17 = nm6Var2.w;
                                } else {
                                    charSequence2 = charSequence3;
                                    z16 = z12;
                                    zl6Var3 = zl6Var2;
                                    z17 = false;
                                    z18 = false;
                                    z19 = false;
                                    i21 = 0;
                                }
                                i21 = i8;
                                z19 = z20;
                                z16 = z12;
                                zl6Var3 = zl6Var2;
                            }
                            if (photoViewer.j0.getVisibility() != 8) {
                                photoViewer.j0.setVisibility(8);
                            }
                            photoViewer.j0.setTag(charSequence3);
                            m98 m98Var2 = photoViewer.O;
                            if (m98Var2 != null) {
                                m98Var2.d(false, z28);
                            }
                            CharSequence L03 = photoViewer.m5 ? z16 ? k96.L0(2131753930) : k96.L0(2131753945) : charSequence3;
                            mu1 mu1Var2 = photoViewer.l4;
                            if (mu1Var2 != null) {
                                z24 = z14;
                                if (mu1Var2.g4 == 3) {
                                    long V6 = mu1Var2.V6();
                                    mu1 mu1Var3 = photoViewer.l4;
                                    if (V6 >= j3) {
                                        h = mu1Var3.getMessagesController().V1(Long.valueOf(V6));
                                        f3 = null;
                                    } else {
                                        f3 = mu1Var3.getMessagesController().K0(Long.valueOf(-V6));
                                        h = null;
                                    }
                                } else {
                                    h = mu1Var2.h();
                                    f3 = photoViewer.l4.f();
                                }
                                if (f3 != null) {
                                    L03 = f3.title;
                                } else if (l7c.C(h)) {
                                    L03 = k96.L0(photoViewer.l4.g4 == 3 ? 2131748111 : 2131745709);
                                } else {
                                    L03 = l7c.t(h) ? k96.L0(2131754249) : l7c.q(h);
                                }
                            } else {
                                z24 = z14;
                            }
                            if (L03 == null && (o98Var2 = photoViewer.d) != null) {
                                L03 = o98Var2.c0(photoViewer.Q4);
                            }
                            int i26 = photoViewer.d2;
                            if (i26 == 0 || i26 == 4 || ((i26 == 2 || i26 == 5) && arrayList.size() > 1)) {
                                photoViewer.O0.a(photoViewer.d.w(photoViewer.Q4));
                            }
                            photoViewer.D2(obj);
                            PorterDuffColorFilter porterDuffColorFilter2 = new PorterDuffColorFilter(photoViewer.y0(bkb.pg), PorterDuff.Mode.MULTIPLY);
                            photoViewer.V1.setIsVideo(z16);
                            photoViewer.V1.setTimer(i21);
                            photoViewer.W1.setIsVideo(z16);
                            photoViewer.W1.setTimer(i21);
                            photoViewer.Z0.setColorFilter(z18 ? porterDuffColorFilter2 : null);
                            photoViewer.a1.setColorFilter(z17 ? porterDuffColorFilter2 : null);
                            photoViewer.d1.setColorFilter(z19 ? porterDuffColorFilter2 : null);
                            boolean z37 = photoViewer.m5;
                            ImageView imageView = photoViewer.b1;
                            if (z37) {
                                if (zl6Var3 != null) {
                                    boolean z38 = photoViewer.s1;
                                    boolean z39 = zl6Var3.l;
                                    if (!z38 ? z39 : !z39) {
                                        porterDuffColorFilter = porterDuffColorFilter2;
                                        imageView.setColorFilter(porterDuffColorFilter);
                                    }
                                }
                                porterDuffColorFilter = null;
                                imageView.setColorFilter(porterDuffColorFilter);
                            } else {
                                imageView.setColorFilter((zl6Var3 == null || !zl6Var3.l) ? null : porterDuffColorFilter2);
                            }
                            ImageView imageView2 = photoViewer.c1;
                            if (zl6Var3 == null || zl6Var3.k == 0) {
                                porterDuffColorFilter2 = null;
                            }
                            imageView2.setColorFilter(porterDuffColorFilter2);
                            photoViewer.R4 = photoViewer.j2 && ((i13 = photoViewer.d2) == 0 || i13 == 2 || i13 == -1);
                            charSequence = L03;
                            z4 = z24;
                            k27Var = null;
                            i3 = 8;
                        }
                        z5 = false;
                    } else {
                        if (i < 0 || i >= arrayList6.size()) {
                            return;
                        }
                        photoViewer.p0.u(19);
                        photoViewer.p0.u(20);
                        if (!photoViewer.A5 || photoViewer.f7.isEmpty()) {
                            photoViewer.p0.u(15);
                            photoViewer.p0.u(14);
                            photoViewer.p0.u(7);
                        } else {
                            photoViewer.p0.R(15);
                            boolean K0 = photoViewer.K0();
                            r7 r7Var3 = photoViewer.p0;
                            if (K0) {
                                r7Var3.u(14);
                            } else {
                                r7Var3.R(14);
                            }
                            if (photoViewer.z5 <= 0) {
                                TLRPC.Chat K02 = na7.q1(photoViewer.U).K0(Long.valueOf(-photoViewer.z5));
                                if (!photoViewer.K0() && !k27.r(photoViewer.U, false, (TLRPC.Message) photoViewer.d7.get(i), K02)) {
                                    photoViewer.p0.u(7);
                                }
                            }
                            photoViewer.p0.R(7);
                        }
                        long j8 = photoViewer.z5;
                        if (j8 != 0) {
                            str4 = cf3.k(y6c.t0, j8);
                            gl5 gl5Var = (gl5) arrayList6.get(i);
                            if (gl5Var == null || (photo3 = gl5Var.l) == null) {
                                photoViewer.N.a("", z28);
                            } else {
                                photoViewer.N.a(k96.x(photo3.date, true), z28);
                            }
                            photoViewer.p0.R(23);
                        } else {
                            str4 = null;
                        }
                        w97 w97Var = photoViewer.r2;
                        if (w97Var != null) {
                            w97Var.b(i, z29);
                        }
                        m98 m98Var3 = photoViewer.O;
                        if (m98Var3 != null) {
                            m98Var3.d(arrayList6.size() > 1, true);
                            photoViewer.O.a(photoViewer.Q4 + 1, arrayList6.size());
                        }
                        String str8 = photoViewer.e4;
                        if (str8 != null) {
                            str4 = str8;
                        } else if (photoViewer.B5) {
                            str4 = k96.L0(2131753945);
                        }
                        boolean z40 = photoViewer.z5 != 0 && na7.q1(photoViewer.U).z2(photoViewer.z5);
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
                        photoViewer.R4 = photoViewer.j2 && ((i14 = photoViewer.d2) == 0 || i14 == 2 || i14 == -1);
                        i2 = i;
                        charSequence = str4;
                        z4 = z28;
                        z5 = false;
                        k27Var = null;
                        charSequence2 = null;
                    }
                } else {
                    photoViewer.l2 = false;
                    photoViewer.p0.R(7);
                    photoViewer.u0.setVisibility(8);
                    photoViewer.v0.setVisibility(8);
                    photoViewer.p0.u(19);
                    photoViewer.p0.u(20);
                    m98 m98Var4 = photoViewer.O;
                    if (m98Var4 != null) {
                        m98Var4.d(arrayList5.size() > 1, true);
                        photoViewer.O.a(photoViewer.Q4 + 1, arrayList5.size());
                    }
                    photoViewer.N.c("");
                    photoViewer.N.a("", z28);
                    k27Var = null;
                    charSequence = null;
                    z4 = z28;
                    z5 = false;
                    i3 = 8;
                    i2 = i;
                    charSequence2 = null;
                }
                boolean z41 = (!photoViewer.R4 && photoViewer.p2 == null) || photoViewer.d2 == 11;
                photoViewer.S4 = z41;
                photoViewer.G.setBackgroundColor((photoViewer.f2 && !z41 && photoViewer.p2 == null) ? 2130706432 : 0);
                photoViewer.q();
                photoViewer.N.b(photoViewer.S4);
                View view = photoViewer.k0;
                if (photoViewer.S4 || photoViewer.d2 == 11) {
                    i3 = 0;
                }
                view.setVisibility(i3);
                if (photoViewer.u4 == 0) {
                    View view2 = photoViewer.k0;
                    boolean z42 = photoViewer.S4;
                    int i27 = photoViewer.d2;
                    view2.setBackgroundColor(z42 ? i27 == 11 ? 1711276032 : 0 : i27 == 11 ? -16777216 : 2130706432);
                }
                if (charSequence != null) {
                    n98 n98Var = photoViewer.N;
                    if (z28) {
                        if (i20 == i2) {
                            n98Var.d(charSequence, true, true);
                        } else {
                            n98Var.d(charSequence, false, i20 > i2);
                        }
                    } else {
                        n98Var.c(charSequence);
                    }
                }
                photoViewer.I1(k27Var, charSequence2, z5, z4);
            }
            int i28 = photoViewer.Q4;
            if (i28 < 0 || i28 >= arrayList4.size()) {
                return;
            }
            k27 k27Var5 = (k27) arrayList4.get(photoViewer.Q4);
            k27Var5.f6(false);
            boolean D3 = k27Var5.D3();
            boolean G4 = k27Var5.G4();
            CharSequence b = af4.b(k27Var5, photoViewer.Q5 && !photoViewer.R5);
            if (k27Var5.Z3() || k27Var5.q4() || (message3 = k27Var5.k) == null) {
                arrayList2 = arrayList4;
                str5 = null;
            } else {
                arrayList2 = arrayList4;
                str5 = k96.s(message3.date, false);
            }
            photoViewer.N.a(str5, z28);
            boolean z310 = k27Var5.z3();
            boolean z43 = na7.q1(photoViewer.U).z2(k27Var5.A0()) || ((message2 = k27Var5.k) != null && message2.noforwards) || k27Var5.y2();
            if (!G4 || D3) {
                photoViewer.j0.setVisibility(8);
                photoViewer.j0.setTag(null);
            } else {
                photoViewer.j0.setVisibility(0);
                photoViewer.j0.setTag(1);
            }
            if (z310) {
                z4 = z2;
                photoViewer.Q1(photoViewer.E0, false, z4);
                photoViewer.Q1(photoViewer.D0, false, z4);
                photoViewer.p0.u(7);
                photoViewer.p0.u(10);
                C1 = k27.n1(k27Var5.k).description;
                photoViewer.l2 = false;
                photoViewer.p0.u(19);
                photoViewer.p0.u(20);
                z5 = false;
                arrayList3 = arrayList2;
            } else {
                z4 = z2;
                b1c b1cVar2 = na7.q1(photoViewer.U).i4;
                if (i20 != photoViewer.Q4) {
                    photoViewer.n5 = false;
                    photoViewer.o5 = null;
                }
                if (b1cVar2.r()) {
                    b1cVar = b1cVar2;
                    photoViewer = this;
                    b1cVar.j(k27Var5, new go2((Object) this, i, (Object) b1cVar, (Object) k27Var5, (byte) 4));
                } else {
                    b1cVar = b1cVar2;
                }
                if (b1cVar.r() && b1cVar.a(k27Var5, photoViewer.o5)) {
                    boolean z44 = photoViewer.n5;
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
                if (k27Var5.L3() && photoViewer.l2 && !cf3.B(k27Var5.A0())) {
                    photoViewer.p0.R(12);
                }
                mu1 mu1Var4 = photoViewer.l4;
                if (k27Var5.s(null, mu1Var4 != null && mu1Var4.N7()) && photoViewer.w == 0) {
                    photoViewer.p0.R(7);
                } else {
                    photoViewer.p0.u(7);
                }
                photoViewer.p0.m();
                boolean z45 = !D3 && (k27Var5.F0() == null || k27Var5.x() || k27Var5.t1().startsWith("video/")) && !photoViewer.t4 && (((i15 = k27Var5.k.ttl) == 0 || i15 >= 3600) && !z43 && photoViewer.k() && !photoViewer.Q5);
                if (photoViewer.t4) {
                    photoViewer.p0.R(10);
                    photoViewer.Q1(photoViewer.D0, false, false);
                    photoViewer.Q1(photoViewer.w0, true, false);
                    arrayList3 = arrayList2;
                } else if (!G4 || D3) {
                    arrayList3 = arrayList2;
                    photoViewer.s0.setVisibility(8);
                    photoViewer.q0.setVisibility(8);
                    photoViewer.A0.setVisibility(8);
                    photoViewer.p0.u(10);
                    photoViewer.p0.m();
                    boolean z46 = photoViewer.w0.getVisibility() == 0;
                    boolean z47 = k27Var5.o2() && !cf3.B(k27Var5.A0());
                    if (z46) {
                        photoViewer.Q1(photoViewer.w0, false, (z47 || z45) ? false : true);
                    }
                    photoViewer.Q1(photoViewer.D0, z45, (!z4 || z46 || z47) ? false : true);
                    photoViewer.Q1(photoViewer.E0, z47, !z46);
                } else {
                    if (z43) {
                        if (photoViewer.w != 0) {
                            arrayList3 = arrayList2;
                            if (k27.n1(((k27) arrayList3.get(0)).k).webpage != null) {
                            }
                        } else if (k27.n1(k27Var5.k).webpage == null || k27.n1(k27Var5.k).webpage.url == null) {
                            arrayList3 = arrayList2;
                        }
                        photoViewer.p0.u(10);
                        z25 = photoViewer.E0.getVisibility() != 0;
                        if (z25) {
                            photoViewer.Q1(photoViewer.E0, false, false);
                        }
                        if (z43) {
                            boolean z48 = photoViewer.s2;
                            a8 a8Var3 = photoViewer.w0;
                            if (z48) {
                                photoViewer.Q1(a8Var3, true, !z25 && photoViewer.D0.getAlpha() <= 0.0f);
                            } else {
                                a8Var3.setEnabled(false);
                                photoViewer.P1(0.5f, photoViewer.w0, true, !z25 && photoViewer.D0.getAlpha() <= 0.0f);
                                photoViewer.H0();
                            }
                        } else {
                            photoViewer.Q1(photoViewer.w0, false, true);
                        }
                        photoViewer.Q1(photoViewer.D0, false, false);
                        if (k27Var5.o2() || cf3.B(k27Var5.A0())) {
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
                    photoViewer.Q1(photoViewer.D0, false, false);
                    if (k27Var5.o2()) {
                    }
                    photoViewer.p0.u(13);
                    photoViewer.p0.m();
                }
                C1 = na7.q1(k27Var5.K1).C1(k27Var5.k.restriction_reason);
                if (TextUtils.isEmpty(C1)) {
                    if (!photoViewer.n5 || (message = k27Var5.k) == null || message.translatedText == null || !TextUtils.equals(message.translatedToLanguage, rzb.G0())) {
                        C1 = k27Var5.z;
                        z5 = photoViewer.n5;
                    } else {
                        C1 = r1(k27Var5);
                    }
                }
                z5 = false;
            }
            if (photoViewer.k2 != null) {
                photoViewer.u0.setVisibility(8);
                photoViewer.v0.setVisibility(8);
                photoViewer.p0.u(9);
                photoViewer.Q1(photoViewer.D0, false, z4);
                mu1 mu1Var5 = photoViewer.l4;
                if (!k27Var5.s(null, mu1Var5 != null && mu1Var5.N7())) {
                    photoViewer.p0.u(7);
                }
                photoViewer.l2 = !z43;
            }
            if (k27Var5.q4()) {
                m98 m98Var5 = photoViewer.O;
                if (m98Var5 != null) {
                    m98Var5.d(false, z4);
                }
            } else {
                mu1 mu1Var6 = photoViewer.l4;
                if (mu1Var6 != null && mu1Var6.g4 == 5) {
                    m98 m98Var6 = photoViewer.O;
                    if (m98Var6 != null) {
                        m98Var6.d(false, z4);
                    }
                } else if (photoViewer.H5 && (photoViewer.F5 != null || !TextUtils.isEmpty(photoViewer.G5))) {
                    m98 m98Var7 = photoViewer.O;
                    if (m98Var7 != null) {
                        m98Var7.d(true, z4);
                        photoViewer.O.a(photoViewer.Q4 + 1, arrayList3.size());
                    }
                } else if (photoViewer.J5 + photoViewer.L5 == 0 || photoViewer.N5) {
                    if (photoViewer.w == 0 && (k27.n1(k27Var5.k) instanceof TLRPC.TL_messageMediaWebPage)) {
                        m98 m98Var8 = photoViewer.O;
                        if (m98Var8 != null) {
                            m98Var8.d(false, z4);
                        }
                        L02 = photoViewer.t4 ? "YouTube" : k27Var5.x() ? k96.L0(2131753972) : k27Var5.D3() ? k96.L0(2131753959) : k27Var5.G4() ? k96.L0(2131753930) : k27Var5.q3() ? k96.L0(2131753968) : k96.L0(2131753945);
                    } else if (z310) {
                        m98 m98Var9 = photoViewer.O;
                        if (m98Var9 != null) {
                            m98Var9.d(false, z4);
                        }
                        L02 = k27.n1(k27Var5.k).title;
                    } else if (k27Var5.G4()) {
                        m98 m98Var10 = photoViewer.O;
                        if (m98Var10 != null) {
                            m98Var10.d(false, z4);
                        }
                        L02 = k96.L0(2131753930);
                    } else if (k27Var5.q3()) {
                        m98 m98Var11 = photoViewer.O;
                        if (m98Var11 != null) {
                            m98Var11.d(false, z4);
                        }
                        L02 = k96.L0(2131753968);
                    } else if (k27Var5.F0() != null) {
                        m98 m98Var12 = photoViewer.O;
                        if (m98Var12 != null) {
                            m98Var12.d(false, z4);
                        }
                        L02 = k96.L0(2131753972);
                    }
                    charSequence4 = L02;
                    if ((cf3.B(photoViewer.E5) && !photoViewer.t4) || z43) {
                        photoViewer.Q1(photoViewer.C0, false, false);
                    }
                    if (!photoViewer.t4 || (((i19 = k27Var5.k.ttl) != 0 && i19 < 3600) || z43)) {
                        photoViewer.l2 = false;
                        photoViewer.u0.setVisibility(8);
                        photoViewer.v0.setVisibility(8);
                        photoViewer.p0.u(9);
                        photoViewer.Q1(photoViewer.D0, false, z4);
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
                    charSequence2 = C1;
                    k27Var = k27Var5;
                } else {
                    boolean z49 = photoViewer.Q5;
                    boolean[] zArr = photoViewer.P5;
                    if (z49) {
                        if (arrayList3.size() + photoViewer.K5 < photoViewer.J5 + photoViewer.L5 && !photoViewer.O5 && photoViewer.Q4 > arrayList3.size() - 5) {
                            if (arrayList3.isEmpty()) {
                                e1 = 0;
                                i17 = 1;
                            } else {
                                i17 = 1;
                                e1 = ((k27) b00.f(1, arrayList3)).e1();
                            }
                            if (!zArr[0] || photoViewer.I5 == 0) {
                                i18 = e1;
                                z27 = false;
                            } else {
                                i18 = (arrayList3.isEmpty() || ((k27) b00.f(i17, arrayList3)).A0() == photoViewer.I5) ? e1 : 0;
                                z27 = true;
                            }
                            if (!photoViewer.d.Z()) {
                                hq6.d0(photoViewer.U).P0(!z27 ? photoViewer.E5 : photoViewer.I5, 40, i18, 0, photoViewer.C5, photoViewer.D5, 1, photoViewer.c, 0, photoViewer.F5, null);
                                photoViewer.O5 = true;
                            }
                        }
                        if (photoViewer.K5 > 0 && photoViewer.Q4 < 5 && !arrayList3.isEmpty()) {
                            int e12 = ((k27) arrayList3.get(0)).e1();
                            if (!photoViewer.d.Z()) {
                                hq6.d0(photoViewer.U).P0(photoViewer.E5, 40, 0, e12, photoViewer.C5, photoViewer.D5, 1, photoViewer.c, 0, photoViewer.F5, null);
                                photoViewer.O5 = true;
                            }
                        }
                        m98 m98Var13 = photoViewer.O;
                        if (m98Var13 != null) {
                            m98Var13.d(photoViewer.R5, z4);
                            m98 m98Var14 = photoViewer.O;
                            int i29 = photoViewer.J5 + photoViewer.L5;
                            m98Var14.a(i29 - (photoViewer.K5 + photoViewer.Q4), i29);
                        }
                    } else {
                        if (arrayList3.size() >= photoViewer.J5 + photoViewer.L5 || photoViewer.O5 || photoViewer.Q4 >= 5) {
                            r15 = 1;
                        } else {
                            int e13 = arrayList3.isEmpty() ? 0 : ((k27) arrayList3.get(0)).e1();
                            if (!zArr[0] || photoViewer.I5 == 0) {
                                i16 = e13;
                                z26 = false;
                            } else {
                                i16 = (arrayList3.isEmpty() || ((k27) arrayList3.get(0)).A0() == photoViewer.I5) ? e13 : 0;
                                z26 = true;
                            }
                            hq6.d0(photoViewer.U).P0(!z26 ? photoViewer.E5 : photoViewer.I5, 80, i16, 0, photoViewer.C5, photoViewer.D5, 1, photoViewer.c, 0, photoViewer.F5, null);
                            r15 = 1;
                            photoViewer.O5 = true;
                        }
                        ?? r6 = photoViewer.O;
                        if (r6 != 0) {
                            r6.d(r15, z4);
                            photoViewer.O.a(((photoViewer.J5 + photoViewer.L5) - arrayList3.size()) + photoViewer.Q4 + r15, photoViewer.J5 + photoViewer.L5);
                        }
                    }
                }
            }
            charSequence4 = b;
            if (cf3.B(photoViewer.E5)) {
                photoViewer.Q1(photoViewer.C0, false, false);
                if (photoViewer.t4) {
                }
                photoViewer.l2 = false;
                photoViewer.u0.setVisibility(8);
                photoViewer.v0.setVisibility(8);
                photoViewer.p0.u(9);
                photoViewer.Q1(photoViewer.D0, false, z4);
                photoViewer.m1.b();
                charSequence = charSequence4;
                z28 = z4;
                i2 = i;
                charSequence2 = C1;
                k27Var = k27Var5;
            }
            photoViewer.Q1(photoViewer.C0, false, false);
            if (photoViewer.t4) {
            }
            photoViewer.l2 = false;
            photoViewer.u0.setVisibility(8);
            photoViewer.v0.setVisibility(8);
            photoViewer.p0.u(9);
            photoViewer.Q1(photoViewer.D0, false, z4);
            photoViewer.m1.b();
            charSequence = charSequence4;
            z28 = z4;
            i2 = i;
            charSequence2 = C1;
            k27Var = k27Var5;
            i3 = 8;
            if (photoViewer.R4) {
            }
            photoViewer.S4 = z41;
            photoViewer.G.setBackgroundColor((photoViewer.f2 && !z41 && photoViewer.p2 == null) ? 2130706432 : 0);
            photoViewer.q();
            photoViewer.N.b(photoViewer.S4);
            View view3 = photoViewer.k0;
            if (photoViewer.S4) {
            }
            i3 = 0;
            view3.setVisibility(i3);
            if (photoViewer.u4 == 0) {
            }
            if (charSequence != null) {
            }
            photoViewer.I1(k27Var, charSequence2, z5, z4);
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
    public final void O2() {
        boolean z;
        boolean z2;
        float f;
        float f2;
        int i;
        if (this.G == null) {
            return;
        }
        ArrayList arrayList = null;
        if (this.f8 == 0) {
            this.N.a(null, true);
            return;
        }
        if (!this.J4) {
            this.k1.a(Math.min(this.k8, this.l8), this.q8 && this.f8 > 1, this.r);
        }
        this.I0.requestLayout();
        this.z8 = (long) Math.ceil((this.Y7.getRightProgress() - this.Y7.getLeftProgress()) * this.o8);
        this.u8 = this.Y7.getLeftProgress();
        this.v8 = this.Y7.getRightProgress();
        int i2 = this.h8;
        int i3 = (i2 == 90 || i2 == 270) ? this.l8 : this.k8;
        int i4 = this.h8;
        int i5 = (i4 == 90 || i4 == 270) ? this.k8 : this.l8;
        h98 h98Var = this.X4;
        if (h98Var.b != null) {
            ArrayList arrayList2 = h98Var.f;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                arrayList = this.X4.f;
            }
        } else {
            ArrayList arrayList3 = h98Var.e;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                arrayList = this.X4.e;
            }
        }
        h98 h98Var2 = this.X4;
        String str = h98Var2.b;
        if (str == null) {
            str = h98Var2.a;
        }
        if (this.r8 && this.u8 == 0.0f && this.h8 == 0 && this.k8 == this.i8 && this.l8 == this.j8) {
            h98 h98Var3 = this.X4;
            if (h98Var3.c == null && arrayList == null && str == null && h98Var3.d == null && this.d2 != 1) {
                z = false;
                z2 = this.r;
                int i6 = this.d2;
                if (z2) {
                    boolean z3 = i6 == 1;
                    if (z) {
                        long j = (long) ((this.z8 / this.o8) * ((z3 ? 0L : this.w8) + this.x8));
                        this.y8 = j + ((j / 32768) << 4);
                    } else {
                        float f3 = this.A8;
                        float f4 = this.z8 / this.o8;
                        long j2 = (long) (f3 * f4);
                        this.y8 = j2;
                        if (z3) {
                            this.y8 = j2 - ((long) (f4 * this.w8));
                        }
                    }
                } else {
                    if (i6 == 1) {
                        long j3 = this.z8;
                        i = j3 <= 2000 ? 2600000 : j3 <= 5000 ? 2200000 : 1560000;
                    } else {
                        i = 921600;
                    }
                    long j4 = (long) ((this.z8 / 1000.0f) * (i / 8));
                    this.y8 = j4 + ((j4 / 32768) << 4);
                }
                f = this.u8;
                if (f != 0.0f) {
                    this.s8 = -1L;
                } else {
                    this.s8 = ((long) (f * this.o8)) * 1000;
                }
                f2 = this.v8;
                if (f2 != 1.0f) {
                    this.t8 = -1L;
                } else {
                    this.t8 = ((long) (f2 * this.o8)) * 1000;
                }
                this.J8 = tb4.y(String.format("%dx%d", Integer.valueOf(i3), Integer.valueOf(i5)), ", ", tb4.y(gl.g0((int) (this.z8 / 1000), false, false), ", ~", gl.i0(this.y8, false, false)));
                this.G.j();
                if (this.e4 != null) {
                    this.N.a(this.r ? k96.M0(2131745087, "SoundMuted") : this.J8, true);
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
        f = this.u8;
        if (f != 0.0f) {
        }
        f2 = this.v8;
        if (f2 != 1.0f) {
        }
        this.J8 = tb4.y(String.format("%dx%d", Integer.valueOf(i3), Integer.valueOf(i5)), ", ", tb4.y(gl.g0((int) (this.z8 / 1000), false, false), ", ~", gl.i0(this.y8, false, false)));
        this.G.j();
        if (this.e4 != null) {
        }
    }

    public final void P() {
        a06 a06Var = this.s7;
        if (a06Var != null) {
            a06Var.a();
            this.s7 = null;
        }
        a06 a06Var2 = this.c2;
        if (a06Var2 != null) {
            a06Var2.a();
            this.c2 = null;
        }
        try {
            if (this.h0.getParent() != null) {
                ((WindowManager) this.E.getSystemService("window")).removeView(this.h0);
                Z0();
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    public final void P1(float f, View view, boolean z, boolean z2) {
        HashMap hashMap = this.L0;
        Boolean bool = (Boolean) hashMap.get(view);
        if (bool == null || bool.booleanValue() != z) {
            hashMap.put(view, Boolean.valueOf(z));
            view.animate().cancel();
            float f2 = (z ? 1.0f : 0.0f) * f;
            if (!z2 || bool == null) {
                view.setVisibility(z ? 0 : 8);
                view.setAlpha(f2);
                C2();
            } else {
                if (z) {
                    view.setVisibility(0);
                }
                view.animate().alpha(f2).setDuration(100L).setUpdateListener(new f68(this, (byte) 6)).setInterpolator(new LinearInterpolator()).withEndAction(new vj6((Object) this, z, (Object) view, (byte) 13)).start();
            }
        }
    }

    public final void P2() {
        int[] iArr = this.m3;
        Arrays.fill(iArr, 0);
        int[] iArr2 = this.n3;
        Arrays.fill(iArr2, 0);
        lbc lbcVar = this.G2;
        if (lbcVar != null) {
            long max = Math.max(0L, lbcVar.S());
            long max2 = Math.max(0L, this.G2.U());
            if (!this.H8 && this.X7.getVisibility() == 0) {
                max2 = (long) ((this.Y7.getRightProgress() - this.Y7.getLeftProgress()) * max2);
                max = (long) (max - (this.Y7.getLeftProgress() * max2));
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
            x88 x88Var = this.g0;
            if (x88Var != null && x88Var.y) {
                long max3 = Math.max(0, x88Var.getCurrentPosition());
                long max4 = Math.max(0, this.g0.getVideoDuration());
                if (!this.H8 && this.X7.getVisibility() == 0) {
                    max4 = (long) ((this.Y7.getRightProgress() - this.Y7.getLeftProgress()) * max4);
                    max3 = (long) (max3 - (this.Y7.getLeftProgress() * max4));
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
    
        if (r0.o6 != 3) goto L273;
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
    public final void Q(Canvas canvas, wl0 wl0Var, int i, int i2, boolean z, boolean z2, boolean z3) {
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
        x88 x88Var;
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
        zl6 zl6Var;
        Bitmap b4;
        m88 m88Var;
        float f44;
        float f45;
        float f46;
        float f47;
        float f48;
        Shader shader;
        int i16;
        Bitmap d4;
        m88 m88Var2;
        PhotoViewer photoViewer = this;
        wl0 wl0Var2 = wl0Var;
        if (a()) {
            RenderNode v0 = photoViewer.v0(wl0Var2.c);
            int k = gl.k(i, wl0Var2.c);
            if (photoViewer.Q8 == null || v0 == null || !canvas.isHardwareAccelerated()) {
                canvas.drawColor(bm2.k(i2, k));
                return;
            }
            canvas.drawColor(k);
            canvas.save();
            canvas.scale(photoViewer.Q8.getWidth() / v0.getWidth(), photoViewer.Q8.getHeight() / v0.getHeight());
            canvas.drawRenderNode(v0);
            canvas.restore();
            canvas.drawColor(i2);
            return;
        }
        boolean z10 = gba.Z;
        lm lmVar = photoViewer.K8;
        if (z10) {
            byte b5 = photoViewer.n4;
            d = lmVar.d(b5 == 0 || b5 == 2 || b5 == 3);
        } else {
            d = 1.0f;
        }
        wl0Var2.h.setShader(null);
        if (i != 0) {
            wl0Var2.h.setColor(i);
            wl0Var2.h.setAlpha((int) (gl.R1(0.7f, 1.0f, z2 ? d : 1.0f) * r2.getAlpha()));
            canvas.drawPaint(wl0Var2.h);
        }
        if (!gba.Z || photoViewer.n4 != 0) {
            float f49 = d;
            lmVar.e(true, 0.0f);
            if (i2 != 0) {
                wl0Var2.h.setColor(i2);
                Paint paint = wl0Var2.h;
                float alpha = paint.getAlpha();
                if (!z2) {
                    f49 = 1.0f;
                }
                paint.setAlpha((int) (gl.R1(0.7f, 1.0f, f49) * alpha));
                canvas.drawPaint(wl0Var2.h);
                return;
            }
            return;
        }
        if (z3) {
            if (photoViewer.L8 == null) {
                lm[] lmVarArr = new lm[3];
                photoViewer.L8 = lmVarArr;
                byte b6 = 21;
                l68 l68Var = new l68(photoViewer, b6);
                s33 s33Var = s33.g;
                b = 2;
                lmVarArr[0] = new lm(l68Var, 180L, s33Var);
                photoViewer.L8[1] = new lm(new l68(photoViewer, b6), 180L, s33Var);
                photoViewer.L8[2] = new lm(new l68(photoViewer, b6), 180L, s33Var);
            } else {
                b = 2;
            }
            photoViewer.L8[0].e(true, 1.0f);
            photoViewer.L8[b].e(true, 1.0f);
            if (photoViewer.M8 == null) {
                photoViewer.M8 = new RectF();
            }
            if (photoViewer.N8 == null) {
                photoViewer.N8 = new RectF();
            }
            if (photoViewer.O8 == null) {
                photoViewer.O8 = new Matrix();
            }
            if (photoViewer.P8 == null) {
                photoViewer.P8 = new float[8];
            }
            photoViewer.M8.set(photoViewer.V1.getBounds());
            photoViewer.M8.offset(photoViewer.Y1.getX(), photoViewer.Y1.getY());
            photoViewer.M8.offset(photoViewer.V1.getX(), photoViewer.V1.getY());
            photoViewer.O8.reset();
        } else {
            b = 2;
        }
        int saveCount = canvas.getSaveCount();
        if (photoViewer.u2) {
            canvas.save();
            canvas.translate((photoViewer.s0() / 2) - (photoViewer.w0() / 2), 0.0f);
            if (z3) {
                photoViewer.O8.preTranslate((photoViewer.s0() / 2) - (photoViewer.w0() / 2), 0.0f);
            }
        }
        if (photoViewer.p6 != null) {
            float R1 = gl.R1(0.0f, photoViewer.g6, photoViewer.l6);
            float R12 = gl.R1(photoViewer.a6, photoViewer.e6, photoViewer.l6);
            f = gl.R1(photoViewer.b6, photoViewer.f6, photoViewer.l6);
            float R13 = gl.R1(photoViewer.Y5, photoViewer.d6, photoViewer.l6);
            i3 = 0;
            f2 = gl.R1(photoViewer.X5, photoViewer.c6, photoViewer.l6);
            f5 = R1;
            f3 = R12;
            f4 = R13;
        } else {
            i3 = 0;
            float f50 = photoViewer.a6;
            f = photoViewer.b6;
            float f51 = photoViewer.Y5;
            f2 = photoViewer.X5;
            if (photoViewer.n6 != 0) {
                f2 = photoViewer.c6;
                f51 = photoViewer.d6;
                f50 = photoViewer.e6;
            }
            f3 = f50;
            f4 = f51;
            f5 = 0.0f;
        }
        float f52 = f2;
        int h0 = photoViewer.h0();
        int g0 = photoViewer.g0();
        if (photoViewer.I3 && (m88Var2 = photoViewer.z2) != null && m88Var2.getVisibility() == 0) {
            g0 = photoViewer.A0();
        }
        if (photoViewer.u4 == 0 && photoViewer.d2 != 1 && photoViewer.a6 >= 1.0f && !photoViewer.R6 && !photoViewer.K6) {
            if (f52 > photoViewer.F6 + gl.L(5.0f)) {
                imageReceiver = photoViewer.B4;
            } else if (f52 < photoViewer.E6 - gl.L(5.0f)) {
                imageReceiver = photoViewer.D4;
            }
            imageReceiver2 = photoViewer.D4;
            ArrayList arrayList2 = photoViewer.g7;
            if (imageReceiver != imageReceiver2) {
                float e = z3 ? photoViewer.L8[i3].e(true, 1.0f) : 1.0f;
                if (!photoViewer.R6) {
                    float f53 = photoViewer.E6;
                    if (f52 < f53) {
                        f44 = d;
                        float min2 = Math.min(1.0f, (f53 - f52) / h0);
                        f48 = (1.0f - min2) * 0.3f;
                        f45 = 1.0f;
                        f47 = min2;
                        f46 = (-h0) - (gl.L(30.0f) / 2);
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
                            canvas.translate((gl.L(30.0f) / 2) + h0 + f46, 0.0f);
                            float f54 = f45 - f48;
                            canvas.scale(f54, f54);
                            i5 = g0;
                            int q2 = imageReceiver.q();
                            float f55 = f;
                            int o2 = imageReceiver.o();
                            if (photoViewer.K4) {
                                imageReceiver3 = imageReceiver;
                                arrayList = arrayList2;
                                f6 = f55;
                            } else {
                                zl6 zl6Var2 = photoViewer.I1;
                                if (zl6Var2 != null) {
                                    arrayList = arrayList2;
                                    c33 c33Var = photoViewer.G1;
                                    if (c33Var.a) {
                                        imageReceiver3 = imageReceiver;
                                        f6 = f55;
                                        i4 = saveCount;
                                        f7 = f3;
                                        f8 = f44;
                                        h0 = h0;
                                        shader = null;
                                        photoViewer = this;
                                        photoViewer.d(canvas, h0, i5, q2, o2, 1.0f, c33Var, zl6Var2);
                                        float f56 = q2;
                                        float f57 = o2;
                                        float min3 = Math.min(h0 / f56, i5 / f57);
                                        int i17 = (int) (f56 * min3);
                                        int i18 = (int) (f57 * min3);
                                        if (!arrayList.isEmpty()) {
                                            if (photoViewer.u4 == 1 || photoViewer.d2 == 1) {
                                                i16 = photoViewer.G1.h;
                                            } else {
                                                zl6 zl6Var3 = photoViewer.I1;
                                                if (zl6Var3 != null && zl6Var3.l) {
                                                    i16 = 1;
                                                }
                                            }
                                            if (i16 != 0) {
                                                canvas.scale(-1.0f, f45);
                                            }
                                            d4 = photoViewer.G4.d(imageReceiver3);
                                            if (d4 != null) {
                                                wl0Var2.h.setShader(shader);
                                                wl0Var2.h.setAlpha((int) yjb.C(f47, 255.0f, f8, e));
                                                canvas.scale(d4.getWidth() / (d4.getWidth() - 3.0f), d4.getHeight() / (d4.getHeight() - 3.0f));
                                                canvas.translate((-i17) / 2, (-i18) / 2);
                                                canvas.scale((i17 * 1.0f) / d4.getWidth(), (i18 * 1.0f) / d4.getHeight());
                                                if (z) {
                                                    int i19 = i3;
                                                    canvas.clipRect(i19, i19, d4.getWidth(), d4.getHeight());
                                                }
                                                canvas.drawBitmap(d4, 0.0f, 0.0f, wl0Var2.h);
                                            }
                                            canvas.restore();
                                        }
                                        i16 = i3;
                                        if (i16 != 0) {
                                        }
                                        d4 = photoViewer.G4.d(imageReceiver3);
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
                            d4 = photoViewer.G4.d(imageReceiver3);
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
            if (!photoViewer.R6) {
                float f58 = photoViewer.F6;
                if (f52 > f58 && photoViewer.u4 == 0 && photoViewer.d2 != 1) {
                    float min4 = Math.min(1.0f, (f52 - f58) / h0);
                    float f59 = min4 * 0.3f;
                    f11 = 1.0f - min4;
                    f10 = photoViewer.F6;
                    f12 = f59;
                    boolean z11 = (photoViewer.I3 || (m88Var = photoViewer.z2) == null || m88Var.getVisibility() != 0) ? false : true;
                    if (!photoViewer.C4.B() || (z11 && photoViewer.H3)) {
                        canvas.save();
                        int i20 = h0 / 2;
                        int i21 = i5 / 2;
                        f13 = 2.0f;
                        canvas.translate(photoViewer.Z(photoViewer.u4) + i20, photoViewer.a0(photoViewer.u4) + i21);
                        float f60 = f4 + 0.0f;
                        canvas.translate(f10, f60);
                        f14 = f7 - f12;
                        canvas.scale(f14, f14);
                        float f61 = f6;
                        canvas.rotate(f61);
                        if (z3) {
                            z4 = z11;
                            photoViewer.O8.preTranslate(photoViewer.Z(photoViewer.u4) + i20, photoViewer.a0(photoViewer.u4) + i21);
                            photoViewer.O8.preTranslate(f10, f60);
                            photoViewer.O8.preScale(f14, f14, 0.0f, 0.0f);
                            photoViewer.O8.preRotate(f61);
                        } else {
                            z4 = z11;
                        }
                        if (photoViewer.u4 == 3 && photoViewer.M1 != null) {
                            int f0 = photoViewer.f0(0, true);
                            q88 q88Var = photoViewer.M1;
                            int i22 = gl.q.y;
                            Typeface typeface = gl.a;
                            gl.L(20.0f);
                            photoViewer.M1.getClass();
                            float f02 = (((f0 - q88Var.d2) - photoViewer.f0(0, false)) / 2.0f) * 1.0f;
                            canvas.translate(0.0f, f02);
                            if (z3) {
                                Matrix matrix = photoViewer.O8;
                                photoViewer.M1.getClass();
                                matrix.preTranslate(0.0f, f02);
                            }
                        }
                        if (!z4 && photoViewer.H3 && photoViewer.I3) {
                            View view = photoViewer.E2 ? photoViewer.D2 : photoViewer.C2;
                            q = view.getMeasuredWidth();
                            o = view.getMeasuredHeight();
                        } else {
                            q = photoViewer.C4.q();
                            o = photoViewer.C4.o();
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
                        if (!photoViewer.B3 || ((z4 && ((photoViewer.H3 || photoViewer.I3) && photoViewer.M3 && photoViewer.N3 == 1.0f)) || (photoViewer.O4 != null && photoViewer.s1))) {
                            i7 = h0;
                            f19 = f14;
                            f20 = f15;
                            imageReceiver4 = imageReceiver3;
                            f21 = f16;
                            f22 = f17;
                            f23 = f18;
                            f24 = f64;
                        } else {
                            float q3 = photoViewer.C4.q();
                            float o3 = photoViewer.C4.o();
                            if (photoViewer.s1 && photoViewer.u4 == 0) {
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
                                            photoViewer.O8.preTranslate((-f24) / 2.0f, (-f65) / 2.0f);
                                            float[] fArr = photoViewer.P8;
                                            fArr[0] = 0.0f;
                                            fArr[1] = 0.0f;
                                            fArr[b] = f24;
                                            fArr[3] = 0.0f;
                                            fArr[4] = f24;
                                            fArr[5] = f65;
                                            fArr[6] = 0.0f;
                                            fArr[7] = f65;
                                            photoViewer.O8.mapPoints(fArr);
                                            RectF rectF = photoViewer.N8;
                                            float[] fArr2 = photoViewer.P8;
                                            float min6 = Math.min(fArr2[0], fArr2[b]);
                                            float[] fArr3 = photoViewer.P8;
                                            f22 = f17;
                                            float min7 = Math.min(min6, Math.min(fArr3[4], fArr3[6]));
                                            float[] fArr4 = photoViewer.P8;
                                            float min8 = Math.min(fArr4[1], fArr4[3]);
                                            float[] fArr5 = photoViewer.P8;
                                            f23 = f18;
                                            float min9 = Math.min(min8, Math.min(fArr5[5], fArr5[7]));
                                            float[] fArr6 = photoViewer.P8;
                                            float max = Math.max(fArr6[0], fArr6[b]);
                                            float[] fArr7 = photoViewer.P8;
                                            i7 = h0;
                                            float max2 = Math.max(max, Math.max(fArr7[4], fArr7[6]));
                                            float[] fArr8 = photoViewer.P8;
                                            float max3 = Math.max(fArr8[1], fArr8[3]);
                                            float[] fArr9 = photoViewer.P8;
                                            imageReceiver4 = imageReceiver3;
                                            rectF.set(min7, min9, max2, Math.max(max3, Math.max(fArr9[5], fArr9[7])));
                                            f42 = photoViewer.L8[1].d(photoViewer.M8.intersect(photoViewer.N8));
                                        } else {
                                            i7 = h0;
                                            f20 = f15;
                                            imageReceiver4 = imageReceiver3;
                                            f21 = f16;
                                            f22 = f17;
                                            f23 = f18;
                                            f42 = 1.0f;
                                        }
                                        if (photoViewer.N3 >= 1.0f || (d2 = photoViewer.F4.d(photoViewer.C4)) == null) {
                                            f43 = 0.0f;
                                        } else {
                                            canvas.save();
                                            wl0Var2.h.setShader(null);
                                            wl0Var2.h.setAlpha((int) tb4.z(1.0f, photoViewer.N3, f42 * 255.0f * f11, f8));
                                            canvas.scale(d2.getWidth() / (d2.getWidth() - 3.0f), d2.getHeight() / (d2.getHeight() - 3.0f));
                                            canvas.translate((-f24) / 2.0f, (-f65) / 2.0f);
                                            canvas.scale((f24 * 1.0f) / d2.getWidth(), (f65 * 1.0f) / d2.getHeight());
                                            if (z) {
                                                canvas.clipRect(0, 0, d2.getWidth(), d2.getHeight());
                                            }
                                            f43 = 0.0f;
                                            canvas.drawBitmap(d2, 0.0f, 0.0f, wl0Var2.h);
                                            canvas.restore();
                                        }
                                        if (photoViewer.N3 > f43 && (b3 = photoViewer.c0.b()) != null) {
                                            canvas.save();
                                            wl0Var2.h.setShader(null);
                                            wl0Var2.h.setAlpha((int) (f42 * 255.0f * f11 * photoViewer.N3 * f8));
                                            canvas.scale(b3.getWidth() / (b3.getWidth() - 3.0f), b3.getHeight() / (b3.getHeight() - 3.0f));
                                            canvas.translate((-f24) / 2.0f, (-f65) / 2.0f);
                                            canvas.scale((f24 * 1.0f) / b3.getWidth(), (f65 * 1.0f) / b3.getHeight());
                                            if (z) {
                                                canvas.clipRect(0, 0, b3.getWidth(), b3.getHeight());
                                            }
                                            canvas.drawBitmap(b3, 0.0f, 0.0f, wl0Var2.h);
                                            canvas.restore();
                                        }
                                        z5 = true;
                                        isEmpty = arrayList.isEmpty();
                                        h98 h98Var = photoViewer.X4;
                                        c33 c33Var2 = photoViewer.E1;
                                        if (!isEmpty) {
                                            byte b7 = photoViewer.u4;
                                            if (b7 != 3 && (i14 = photoViewer.o6) != 3) {
                                                if (photoViewer.d2 != 1) {
                                                    int i26 = photoViewer.p6 != null ? -1 : -1;
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
                                                        if (photoViewer.u4 == 1 || photoViewer.d2 == 1) {
                                                            z7 = c33Var2.h;
                                                        } else {
                                                            zl6 zl6Var4 = h98Var.c;
                                                            if (zl6Var4 != null && zl6Var4.l) {
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
                                                            canvas.skew(0.0f, tb4.z(f28, f5, 4.0f * f5, 0.25f));
                                                        }
                                                        x88Var = photoViewer.g0;
                                                        if (x88Var != null || x88Var.n.getVisibility() == 0) {
                                                            if (z3) {
                                                                f29 = f26;
                                                                f30 = 1.0f;
                                                            } else {
                                                                f29 = f26;
                                                                photoViewer.O8.preTranslate((-f24) / 2.0f, (-f29) / 2.0f);
                                                                float[] fArr10 = photoViewer.P8;
                                                                fArr10[0] = 0.0f;
                                                                fArr10[1] = 0.0f;
                                                                fArr10[2] = f24;
                                                                fArr10[3] = 0.0f;
                                                                fArr10[4] = f24;
                                                                fArr10[5] = f29;
                                                                fArr10[6] = 0.0f;
                                                                fArr10[7] = f29;
                                                                photoViewer.O8.mapPoints(fArr10);
                                                                RectF rectF2 = photoViewer.N8;
                                                                float[] fArr11 = photoViewer.P8;
                                                                float min10 = Math.min(fArr11[0], fArr11[2]);
                                                                float[] fArr12 = photoViewer.P8;
                                                                float min11 = Math.min(min10, Math.min(fArr12[4], fArr12[6]));
                                                                float[] fArr13 = photoViewer.P8;
                                                                float min12 = Math.min(fArr13[1], fArr13[3]);
                                                                float[] fArr14 = photoViewer.P8;
                                                                float min13 = Math.min(min12, Math.min(fArr14[5], fArr14[7]));
                                                                float[] fArr15 = photoViewer.P8;
                                                                float max4 = Math.max(fArr15[0], fArr15[2]);
                                                                float[] fArr16 = photoViewer.P8;
                                                                float max5 = Math.max(max4, Math.max(fArr16[4], fArr16[6]));
                                                                float[] fArr17 = photoViewer.P8;
                                                                float max6 = Math.max(fArr17[1], fArr17[3]);
                                                                float[] fArr18 = photoViewer.P8;
                                                                rectF2.set(min11, min13, max5, Math.max(max6, Math.max(fArr18[5], fArr18[7])));
                                                                f30 = photoViewer.L8[1].d(photoViewer.M8.intersect(photoViewer.N8));
                                                            }
                                                            b2 = photoViewer.c0.b();
                                                            if (b2 == null) {
                                                                b2 = photoViewer.F4.d(photoViewer.C4);
                                                            }
                                                            if (b2 != null) {
                                                                wl0Var2 = wl0Var;
                                                                wl0Var2.h.setShader(null);
                                                                f8 = f27;
                                                                wl0Var2.h.setAlpha((int) yjb.C(f25, 255.0f, f30, f8));
                                                                canvas.scale(b2.getWidth() / (b2.getWidth() - 3.0f), b2.getHeight() / (b2.getHeight() - 3.0f));
                                                                canvas.translate((-f24) / 2.0f, (-f29) / 2.0f);
                                                                canvas.scale((f24 * 1.0f) / b2.getWidth(), (f29 * 1.0f) / b2.getHeight());
                                                                if (z) {
                                                                    canvas.clipRect(0, 0, b2.getWidth(), b2.getHeight());
                                                                }
                                                                canvas.drawBitmap(b2, 0.0f, 0.0f, wl0Var2.h);
                                                                if (z8) {
                                                                    canvas.restore();
                                                                }
                                                                z6 = true;
                                                            }
                                                        }
                                                        wl0Var2 = wl0Var;
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
                                                    x88Var = photoViewer.g0;
                                                    if (x88Var != null) {
                                                    }
                                                    if (z3) {
                                                    }
                                                    b2 = photoViewer.c0.b();
                                                    if (b2 == null) {
                                                    }
                                                    if (b2 != null) {
                                                    }
                                                    wl0Var2 = wl0Var;
                                                    f8 = f27;
                                                    if (z8) {
                                                    }
                                                    z6 = true;
                                                } else {
                                                    wl0Var2 = wl0Var;
                                                    f8 = f27;
                                                }
                                                canvas.restore();
                                            }
                                            int i27 = c33Var2.i;
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
                                                float f66 = c33Var2.j;
                                                float f67 = c33Var2.k;
                                                f32 = i8;
                                                f26 = f65;
                                                f33 = 1.0f - f31;
                                                int z12 = (int) yjb.z(1.0f - f66, f33, f66, f32);
                                                f34 = i10;
                                                int i29 = (int) ((((1.0f - f67) * f33) + f67) * f34);
                                                f35 = z12;
                                                f36 = f20 / f35;
                                                f37 = i29;
                                                if (f36 * f37 > f23) {
                                                    f36 = f23 / f37;
                                                }
                                                if (i28 != 1 && ((b7 != 1 || photoViewer.o6 == 0) && h98Var.c != null)) {
                                                    float f68 = f35 * f36;
                                                    float f69 = f37 * f36;
                                                    if (f22 * f62 > f23) {
                                                        f22 = f63;
                                                    }
                                                    float A = tb4.A((f21 * f22) / f19, f68, f33, f68);
                                                    float A2 = tb4.A((f62 * f22) / f19, f69, f33, f69);
                                                    canvas.clipRect((-A) / 2.0f, (-A2) / 2.0f, A / 2.0f, A2 / 2.0f);
                                                }
                                                i11 = photoViewer.d2;
                                                if (i11 != 1 || c33Var2.a) {
                                                    if (photoViewer.u4 != 1 || i11 == 1) {
                                                        textureView = photoViewer.C2;
                                                        if (textureView != null) {
                                                            textureView.setScaleX(c33Var2.h ? -1.0f : 1.0f);
                                                            j98 j98Var = photoViewer.F2;
                                                            if (j98Var != null) {
                                                                j98Var.setScaleX(photoViewer.C2.getScaleX());
                                                            }
                                                        }
                                                        float A3 = c33Var2.f / tb4.A(c33Var2.l, 1.0f, f33, 1.0f);
                                                        f38 = f20 / f32;
                                                        if (f38 * f34 > f23) {
                                                            f38 = f23 / f34;
                                                        }
                                                        float f70 = (f38 / min5) * A3;
                                                        if (photoViewer.d2 == 1) {
                                                            if (photoViewer.u4 == 3 || (i12 = photoViewer.o6) == 3) {
                                                                f70 /= ((c33Var2.m - 1.0f) * f33) + 1.0f;
                                                            } else if (i12 == 0) {
                                                                f70 /= c33Var2.m;
                                                            }
                                                        }
                                                        f39 = f70;
                                                    } else {
                                                        TextureView textureView2 = photoViewer.C2;
                                                        if (textureView2 != null) {
                                                            zl6 zl6Var5 = h98Var.c;
                                                            textureView2.setScaleX((zl6Var5 == null || !zl6Var5.l) ? 1.0f : -1.0f);
                                                            j98 j98Var2 = photoViewer.F2;
                                                            if (j98Var2 != null) {
                                                                j98Var2.setScaleX(photoViewer.C2.getScaleX());
                                                            }
                                                        }
                                                        zl6 zl6Var6 = h98Var.c;
                                                        float f71 = zl6Var6 != null ? zl6Var6.c : 1.0f;
                                                        f39 = ((f36 / min5) / tb4.A(f71, 1.0f, f33, 1.0f)) * f71;
                                                    }
                                                    float f72 = f39;
                                                    canvas.translate(c33Var2.d * f31, c33Var2.e * f31);
                                                    canvas.scale(f72, f72);
                                                    canvas.translate(yjb.C(c33Var2.b, f32, min5, f31), yjb.C(c33Var2.c, f34, min5, f31));
                                                    if (z3) {
                                                        photoViewer.O8.preTranslate(c33Var2.d * f31, c33Var2.e * f31);
                                                        photoViewer.O8.preScale(f72, f72);
                                                        photoViewer.O8.preTranslate(yjb.C(c33Var2.b, f32, min5, f31), yjb.C(c33Var2.c, f34, min5, f31));
                                                    }
                                                    f40 = c33Var2.g + i27;
                                                    if (f40 > 180.0f) {
                                                        f40 -= 360.0f;
                                                    }
                                                    if (photoViewer.d2 == 1 || !(photoViewer.u4 == 3 || photoViewer.o6 == 3)) {
                                                        float f73 = f40 * f31;
                                                        canvas.rotate(f73);
                                                        if (z3) {
                                                            photoViewer.O8.preRotate(f73);
                                                        }
                                                    } else {
                                                        canvas.rotate(f40);
                                                        if (z3) {
                                                            photoViewer.O8.preRotate(f40);
                                                        }
                                                    }
                                                }
                                                if (z6) {
                                                }
                                                canvas.restore();
                                            } else {
                                                f27 = f8;
                                            }
                                            if (photoViewer.p6 == null || (i13 = photoViewer.o6) == -1) {
                                                if (b7 == 2 || b7 == 3) {
                                                    f31 = 0.0f;
                                                    float f662 = c33Var2.j;
                                                    float f672 = c33Var2.k;
                                                    f32 = i8;
                                                    f26 = f65;
                                                    f33 = 1.0f - f31;
                                                    int z122 = (int) yjb.z(1.0f - f662, f33, f662, f32);
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
                                                        float A4 = tb4.A((f21 * f22) / f19, f682, f33, f682);
                                                        float A22 = tb4.A((f62 * f22) / f19, f692, f33, f692);
                                                        canvas.clipRect((-A4) / 2.0f, (-A22) / 2.0f, A4 / 2.0f, A22 / 2.0f);
                                                    }
                                                    i11 = photoViewer.d2;
                                                    if (i11 != 1) {
                                                    }
                                                    if (photoViewer.u4 != 1) {
                                                    }
                                                    textureView = photoViewer.C2;
                                                    if (textureView != null) {
                                                    }
                                                    float A32 = c33Var2.f / tb4.A(c33Var2.l, 1.0f, f33, 1.0f);
                                                    f38 = f20 / f32;
                                                    if (f38 * f34 > f23) {
                                                    }
                                                    float f702 = (f38 / min5) * A32;
                                                    if (photoViewer.d2 == 1) {
                                                    }
                                                    f39 = f702;
                                                    float f722 = f39;
                                                    canvas.translate(c33Var2.d * f31, c33Var2.e * f31);
                                                    canvas.scale(f722, f722);
                                                    canvas.translate(yjb.C(c33Var2.b, f32, min5, f31), yjb.C(c33Var2.c, f34, min5, f31));
                                                    if (z3) {
                                                    }
                                                    f40 = c33Var2.g + i27;
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
                                                float f6622 = c33Var2.j;
                                                float f6722 = c33Var2.k;
                                                f32 = i8;
                                                f26 = f65;
                                                f33 = 1.0f - f31;
                                                int z1222 = (int) yjb.z(1.0f - f6622, f33, f6622, f32);
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
                                                if (photoViewer.u4 != 1) {
                                                }
                                                textureView = photoViewer.C2;
                                                if (textureView != null) {
                                                }
                                                float A322 = c33Var2.f / tb4.A(c33Var2.l, 1.0f, f33, 1.0f);
                                                f38 = f20 / f32;
                                                if (f38 * f34 > f23) {
                                                }
                                                float f7022 = (f38 / min5) * A322;
                                                if (photoViewer.d2 == 1) {
                                                }
                                                f39 = f7022;
                                                float f7222 = f39;
                                                canvas.translate(c33Var2.d * f31, c33Var2.e * f31);
                                                canvas.scale(f7222, f7222);
                                                canvas.translate(yjb.C(c33Var2.b, f32, min5, f31), yjb.C(c33Var2.c, f34, min5, f31));
                                                if (z3) {
                                                }
                                                f40 = c33Var2.g + i27;
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
                                                    float f74 = photoViewer.l6;
                                                    f31 = i13 == 0 ? f74 : 1.0f - f74;
                                                    float f66222 = c33Var2.j;
                                                    float f67222 = c33Var2.k;
                                                    f32 = i8;
                                                    f26 = f65;
                                                    f33 = 1.0f - f31;
                                                    int z12222 = (int) yjb.z(1.0f - f66222, f33, f66222, f32);
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
                                                    if (photoViewer.u4 != 1) {
                                                    }
                                                    textureView = photoViewer.C2;
                                                    if (textureView != null) {
                                                    }
                                                    float A3222 = c33Var2.f / tb4.A(c33Var2.l, 1.0f, f33, 1.0f);
                                                    f38 = f20 / f32;
                                                    if (f38 * f34 > f23) {
                                                    }
                                                    float f70222 = (f38 / min5) * A3222;
                                                    if (photoViewer.d2 == 1) {
                                                    }
                                                    f39 = f70222;
                                                    float f72222 = f39;
                                                    canvas.translate(c33Var2.d * f31, c33Var2.e * f31);
                                                    canvas.scale(f72222, f72222);
                                                    canvas.translate(yjb.C(c33Var2.b, f32, min5, f31), yjb.C(c33Var2.c, f34, min5, f31));
                                                    if (z3) {
                                                    }
                                                    f40 = c33Var2.g + i27;
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
                                                float f662222 = c33Var2.j;
                                                float f672222 = c33Var2.k;
                                                f32 = i8;
                                                f26 = f65;
                                                f33 = 1.0f - f31;
                                                int z122222 = (int) yjb.z(1.0f - f662222, f33, f662222, f32);
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
                                                if (photoViewer.u4 != 1) {
                                                }
                                                textureView = photoViewer.C2;
                                                if (textureView != null) {
                                                }
                                                float A32222 = c33Var2.f / tb4.A(c33Var2.l, 1.0f, f33, 1.0f);
                                                f38 = f20 / f32;
                                                if (f38 * f34 > f23) {
                                                }
                                                float f702222 = (f38 / min5) * A32222;
                                                if (photoViewer.d2 == 1) {
                                                }
                                                f39 = f702222;
                                                float f722222 = f39;
                                                canvas.translate(c33Var2.d * f31, c33Var2.e * f31);
                                                canvas.scale(f722222, f722222);
                                                canvas.translate(yjb.C(c33Var2.b, f32, min5, f31), yjb.C(c33Var2.c, f34, min5, f31));
                                                if (z3) {
                                                }
                                                f40 = c33Var2.g + i27;
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
                        h98 h98Var2 = photoViewer.X4;
                        c33 c33Var22 = photoViewer.E1;
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
                        b4 = photoViewer.F4.b(photoViewer.i0.getBitmapHolder());
                        if (b4 != null) {
                            canvas.save();
                            wl0Var2.h.setShader(null);
                            wl0Var2.h.setAlpha((int) (f8 * 255.0f));
                            canvas.scale((photoViewer.i0.getWidth() * 1.0f) / b4.getWidth(), (photoViewer.i0.getHeight() * 1.0f) / b4.getHeight());
                            canvas.scale(b4.getWidth() / (b4.getWidth() - 3.0f), b4.getHeight() / (b4.getHeight() - 3.0f), b4.getWidth() / f13, b4.getHeight() / f13);
                            canvas.drawBitmap(b4, 0.0f, 0.0f, wl0Var2.h);
                            if (z) {
                                canvas.clipRect(0, 0, b4.getWidth(), b4.getHeight());
                            }
                            canvas.restore();
                        }
                        canvas.restore();
                    }
                    imageReceiver5 = imageReceiver4;
                    if (imageReceiver5 == photoViewer.B4) {
                        float e2 = z3 ? photoViewer.L8[0].e(true, 1.0f) : 1.0f;
                        if (imageReceiver5 != null && imageReceiver5.B()) {
                            canvas.save();
                            canvas.translate(i7 / 2, i6 / 2);
                            int i30 = i7;
                            float f75 = i30;
                            canvas.translate(((-(((photoViewer.a6 + 1.0f) * f75) + gl.L(30.0f))) / f13) + f52, 0.0f);
                            int q4 = imageReceiver5.q();
                            int o4 = imageReceiver5.o();
                            if (!photoViewer.H4 && (zl6Var = photoViewer.H1) != null) {
                                c33 c33Var3 = photoViewer.F1;
                                if (c33Var3.a) {
                                    i15 = i6;
                                    photoViewer.d(canvas, i30, i15, q4, o4, f7, c33Var3, zl6Var);
                                    float f76 = q4;
                                    float f77 = o4;
                                    float min14 = Math.min(f75 / f76, i15 / f77);
                                    int i31 = (int) (f76 * min14);
                                    int i32 = (int) (f77 * min14);
                                    if (!arrayList.isEmpty()) {
                                        z9 = false;
                                    } else if (photoViewer.u4 == 1 || photoViewer.d2 == 1) {
                                        z9 = photoViewer.F1.h;
                                    } else {
                                        zl6 zl6Var7 = photoViewer.H1;
                                        z9 = zl6Var7 != null && zl6Var7.l;
                                    }
                                    if (z9) {
                                        canvas.scale(-1.0f, 1.0f);
                                    }
                                    d3 = photoViewer.E4.d(imageReceiver5);
                                    if (d3 != null) {
                                        wl0Var2.h.setShader(null);
                                        wl0Var2.h.setAlpha((int) (f8 * 255.0f * e2));
                                        canvas.scale(d3.getWidth() / (d3.getWidth() - 3.0f), d3.getHeight() / (d3.getHeight() - 3.0f));
                                        canvas.translate((-i31) / 2, (-i32) / 2);
                                        canvas.scale((i31 * 1.0f) / d3.getWidth(), (i32 * 1.0f) / d3.getHeight());
                                        if (z) {
                                            canvas.clipRect(0, 0, d3.getWidth(), d3.getHeight());
                                        }
                                        canvas.drawBitmap(d3, 0.0f, 0.0f, wl0Var2.h);
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
                            d3 = photoViewer.E4.d(imageReceiver5);
                            if (d3 != null) {
                            }
                            canvas.restore();
                        }
                    }
                    canvas.restoreToCount(i4);
                    if (i2 != 0) {
                        wl0Var2.h.setColor(i2);
                        wl0Var2.h.setAlpha((int) (gl.R1(0.7f, 1.0f, f8) * r0.getAlpha()));
                        canvas.drawPaint(wl0Var2.h);
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
            if (photoViewer.C4.B()) {
            }
            canvas.save();
            int i202 = h0 / 2;
            int i212 = i5 / 2;
            f13 = 2.0f;
            canvas.translate(photoViewer.Z(photoViewer.u4) + i202, photoViewer.a0(photoViewer.u4) + i212);
            float f602 = f4 + 0.0f;
            canvas.translate(f10, f602);
            f14 = f7 - f12;
            canvas.scale(f14, f14);
            float f612 = f6;
            canvas.rotate(f612);
            if (z3) {
            }
            if (photoViewer.u4 == 3) {
                int f03 = photoViewer.f0(0, true);
                q88 q88Var2 = photoViewer.M1;
                int i222 = gl.q.y;
                Typeface typeface2 = gl.a;
                gl.L(20.0f);
                photoViewer.M1.getClass();
                float f022 = (((f03 - q88Var2.d2) - photoViewer.f0(0, false)) / 2.0f) * 1.0f;
                canvas.translate(0.0f, f022);
                if (z3) {
                }
            }
            if (!z4) {
            }
            q = photoViewer.C4.q();
            o = photoViewer.C4.o();
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
            h98 h98Var22 = photoViewer.X4;
            c33 c33Var222 = photoViewer.E1;
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
                b4 = photoViewer.F4.b(photoViewer.i0.getBitmapHolder());
                if (b4 != null) {
                }
                canvas.restore();
            }
            imageReceiver5 = imageReceiver4;
            if (imageReceiver5 == photoViewer.B4) {
            }
            canvas.restoreToCount(i4);
            if (i2 != 0) {
            }
        }
        imageReceiver = null;
        imageReceiver2 = photoViewer.D4;
        ArrayList arrayList22 = photoViewer.g7;
        if (imageReceiver != imageReceiver2) {
        }
        if (!photoViewer.R6) {
        }
        f10 = f52;
        f11 = 1.0f;
        f12 = 0.0f;
        if (photoViewer.I3) {
        }
        if (photoViewer.C4.B()) {
        }
        canvas.save();
        int i2022 = h0 / 2;
        int i2122 = i5 / 2;
        f13 = 2.0f;
        canvas.translate(photoViewer.Z(photoViewer.u4) + i2022, photoViewer.a0(photoViewer.u4) + i2122);
        float f6022 = f4 + 0.0f;
        canvas.translate(f10, f6022);
        f14 = f7 - f12;
        canvas.scale(f14, f14);
        float f6122 = f6;
        canvas.rotate(f6122);
        if (z3) {
        }
        if (photoViewer.u4 == 3) {
        }
        if (!z4) {
        }
        q = photoViewer.C4.q();
        o = photoViewer.C4.o();
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
        h98 h98Var222 = photoViewer.X4;
        c33 c33Var2222 = photoViewer.E1;
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
        if (imageReceiver5 == photoViewer.B4) {
        }
        canvas.restoreToCount(i4);
        if (i2 != 0) {
        }
    }

    public final void Q1(View view, boolean z, boolean z2) {
        P1(1.0f, view, z, z2);
    }

    public final void Q2() {
        tbc tbcVar = this.q3;
        int L = (gl.L(2.0f) + ((tbc.S / 2) + (tbcVar.f ? tbcVar.d : tbcVar.b))) - (this.s3.getMeasuredWidth() / 2);
        int L2 = gl.L(10.0f);
        int measuredWidth = (this.i3.getMeasuredWidth() - gl.L(10.0f)) - (this.s3.getMeasuredWidth() / 2);
        h88 h88Var = this.s3;
        if (L < L2) {
            h88Var.setPivotX(Utilities.i((h88Var.getMeasuredWidth() / 2.0f) - (L2 - L), this.s3.getMeasuredWidth(), 0.0f));
            L = L2;
        } else if (L >= measuredWidth) {
            h88Var.setPivotX(Utilities.i((h88Var.getMeasuredWidth() / 2.0f) + (L - measuredWidth), this.s3.getMeasuredWidth(), 0.0f));
            L = measuredWidth;
        } else {
            h88Var.setPivotX(h88Var.getMeasuredWidth() / 2.0f);
        }
        this.s3.setTranslationX(L);
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
    public final void R(Canvas canvas, float f, float f2) {
        boolean z;
        boolean z2;
        x88 x88Var;
        mza mzaVar;
        k98 k98Var;
        jza[] jzaVarArr;
        boolean z3;
        boolean z4;
        float f3;
        jza[] jzaVarArr2;
        boolean z5;
        float f4;
        int width;
        int height;
        float f5;
        jza[] jzaVarArr3;
        boolean z6;
        boolean z7 = true;
        if (!this.g7.isEmpty()) {
            if (this.u4 == 1 || this.d2 == 1) {
                z = this.E1.h;
            } else {
                zl6 zl6Var = this.X4.c;
                if (zl6Var != null && zl6Var.l) {
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
                canvas.skew(0.0f, tb4.z(1.0f, f, f * 4.0f, 0.25f));
            }
            x88Var = this.g0;
            if (x88Var != null || x88Var.n.getVisibility() == 0) {
                if (!this.L4) {
                    Matrix matrix = this.M4;
                    ImageReceiver imageReceiver = this.C4;
                    matrix.preTranslate(imageReceiver.L0, imageReceiver.M0);
                }
                this.p5.g(canvas, false, this.f0, this.o6 == -1);
                this.C4.setAlpha(f2);
                this.C4.h(canvas, null);
                this.p5.g(canvas, true, this.f0, this.o6 == -1);
                mzaVar = this.p5;
                ImageReceiver imageReceiver2 = this.C4;
                Matrix matrix2 = this.M4;
                k98Var = this.f0;
                lm lmVar = mzaVar.b;
                lmVar.a = k98Var;
                if ((mzaVar.O == null || lmVar.c > 0.0f) && k98Var != null) {
                    mzaVar.g0 = imageReceiver2.N0;
                    mzaVar.h0 = imageReceiver2.O0;
                    mzaVar.f0.set(matrix2);
                    float f11 = (mzaVar.R + mzaVar.S) % 1.0f;
                    float d = mzaVar.b.d(mzaVar.O == null);
                    canvas.drawColor(bkb.p1(d, 1342177280));
                    jzaVarArr = mzaVar.I;
                    if (jzaVarArr != null) {
                        int length = jzaVarArr.length;
                        int i = 0;
                        while (i < length) {
                            float f12 = f8;
                            jza jzaVar = jzaVarArr[i];
                            if (jzaVar == null) {
                                jzaVarArr2 = jzaVarArr;
                                z5 = z2;
                                f4 = f6;
                                f3 = f10;
                            } else {
                                f3 = f10;
                                jzaVar.a.a = k98Var;
                                if (jzaVar.t.J == null || d <= f7) {
                                    jzaVarArr2 = jzaVarArr;
                                    z5 = z2;
                                    f4 = f6;
                                } else {
                                    float f13 = f7;
                                    boolean z8 = z7;
                                    float R1 = gl.R1(f6, 1.05f, jzaVar.a.d(jzaVar.b)) * gl.R1(f6, 1.065f, d);
                                    int i2 = (jzaVar.c / 90) % 2;
                                    Bitmap bitmap = jzaVar.t.J;
                                    if (i2 != 0) {
                                        width = bitmap.getHeight();
                                        height = jzaVar.t.J.getWidth();
                                    } else {
                                        width = bitmap.getWidth();
                                        height = jzaVar.t.J.getHeight();
                                    }
                                    canvas.save();
                                    float f14 = f6;
                                    float f15 = width;
                                    float centerX = jzaVar.i.centerX() / f15;
                                    float f16 = jzaVar.j;
                                    float f17 = (centerX * f16) - (f16 / f3);
                                    float f18 = height;
                                    float centerY = jzaVar.i.centerY() / f18;
                                    float f19 = jzaVar.k;
                                    canvas.scale(R1, R1, f17, (centerY * f19) - (f19 / f3));
                                    if (jzaVar.o != null) {
                                        float f20 = jzaVar.n;
                                        int i3 = (int) (f11 * f20);
                                        int min = Math.min(500, (int) (f20 * 0.6f)) + i3;
                                        f5 = 0.6f;
                                        if (jzaVar.n > 0) {
                                            while (i3 <= min) {
                                                float f21 = f14 - ((min - i3) / jzaVar.n);
                                                if (f21 > f13) {
                                                    jzaVar.s.setAlpha((int) (f21 * 10.2f * d));
                                                    jzaVarArr3 = jzaVarArr;
                                                    z6 = z2;
                                                    canvas.drawPoints(jzaVar.o, (i3 % jzaVar.n) << 1, 2, jzaVar.s);
                                                } else {
                                                    jzaVarArr3 = jzaVarArr;
                                                    z6 = z2;
                                                }
                                                i3++;
                                                jzaVarArr = jzaVarArr3;
                                                z2 = z6;
                                            }
                                        }
                                        jzaVarArr2 = jzaVarArr;
                                        z5 = z2;
                                    } else {
                                        jzaVarArr2 = jzaVarArr;
                                        z5 = z2;
                                        f5 = 0.6f;
                                    }
                                    if (jzaVar.b() != null) {
                                        canvas.save();
                                        canvas.rotate(jzaVar.c);
                                        canvas.scale((f14 / f15) * jzaVar.j, (f14 / f18) * jzaVar.k);
                                        canvas.drawBitmap(jzaVar.b(), (-jzaVar.t.J.getWidth()) / f3, (-jzaVar.t.J.getHeight()) / f3, (Paint) null);
                                        canvas.restore();
                                    }
                                    float f22 = 255.0f;
                                    if (jzaVar.o != null) {
                                        float f23 = jzaVar.n;
                                        int i4 = (int) (f11 * f23);
                                        int min2 = Math.min(500, (int) (f23 * f5)) + i4;
                                        if (jzaVar.n > 0) {
                                            int i5 = i4;
                                            while (i5 <= min2) {
                                                float f24 = (i5 - i4) / (min2 - i4);
                                                jzaVar.r.setAlpha((int) (Math.min(f14, Math.min(f24, f14 - f24) * f12) * f22 * d));
                                                canvas.drawPoints(jzaVar.o, (i5 % jzaVar.n) << 1, 2, jzaVar.r);
                                                i5++;
                                                f22 = f22;
                                                f14 = 1.0f;
                                            }
                                        }
                                        f7 = f13;
                                        f4 = 1.0f;
                                    } else {
                                        jzaVar.t.n.setPath(jzaVar.l, false);
                                        jzaVar.m.reset();
                                        float length2 = jzaVar.t.n.getLength();
                                        if (length2 == f13) {
                                            f7 = f13;
                                            f4 = 1.0f;
                                        } else {
                                            jzaVar.t.h.setAlpha((int) (d * 255.0f));
                                            jzaVar.t.f.setAlpha((int) (64.0f * d));
                                            canvas.drawPath(jzaVar.m, jzaVar.t.f);
                                            float f25 = 0.2f + f11;
                                            jzaVar.t.n.getSegment(length2 * f11, length2 * f25, jzaVar.m, z8);
                                            canvas.drawPath(jzaVar.m, jzaVar.t.h);
                                            canvas.drawPath(jzaVar.m, jzaVar.t.h);
                                            f4 = 1.0f;
                                            if (f25 > 1.0f) {
                                                jzaVar.m.reset();
                                                jzaVar.t.n.setPath(jzaVar.l, false);
                                                f7 = f13;
                                                jzaVar.t.n.getSegment(f7, (f25 - 1.0f) * length2, jzaVar.m, true);
                                                canvas.drawPath(jzaVar.m, jzaVar.t.h);
                                                canvas.drawPath(jzaVar.m, jzaVar.t.h);
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
                            jzaVarArr = jzaVarArr2;
                            z2 = z5;
                            z7 = true;
                        }
                    }
                    z3 = z2;
                    k98Var.invalidate();
                    z4 = true;
                } else {
                    z3 = z2;
                    z4 = true;
                }
                this.L4 = z4;
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
        x88Var = this.g0;
        if (x88Var != null) {
        }
        if (!this.L4) {
        }
        this.p5.g(canvas, false, this.f0, this.o6 == -1);
        this.C4.setAlpha(f2);
        this.C4.h(canvas, null);
        this.p5.g(canvas, true, this.f0, this.o6 == -1);
        mzaVar = this.p5;
        ImageReceiver imageReceiver22 = this.C4;
        Matrix matrix22 = this.M4;
        k98Var = this.f0;
        lm lmVar2 = mzaVar.b;
        lmVar2.a = k98Var;
        if (mzaVar.O == null) {
        }
        mzaVar.g0 = imageReceiver22.N0;
        mzaVar.h0 = imageReceiver22.O0;
        mzaVar.f0.set(matrix22);
        float f112 = (mzaVar.R + mzaVar.S) % 1.0f;
        float d2 = mzaVar.b.d(mzaVar.O == null);
        canvas.drawColor(bkb.p1(d2, 1342177280));
        jzaVarArr = mzaVar.I;
        if (jzaVarArr != null) {
        }
        z3 = z2;
        k98Var.invalidate();
        z4 = true;
        this.L4 = z4;
        if (z3) {
        }
    }

    public final void R1(boolean z, boolean z2) {
        if (this.s0.getVisibility() != 0) {
            this.x0.f.t("", z, true);
        } else {
            float abs = Math.abs(this.u1 - 1.0f);
            mg2 mg2Var = this.x0;
            if (abs < 0.001f) {
                mg2Var.f.t("", z, true);
            } else {
                mg2Var.f.t(cla.a(this.u1).concat("x"), z, true);
            }
        }
        this.s0.e(z, this.u1);
        pkb pkbVar = this.J0;
        float f = this.u1;
        a8[] a8VarArr = (a8[]) pkbVar.b;
        for (int i = 0; i < a8VarArr.length; i++) {
            if (!z2 || ((i != 0 || Math.abs(f - 0.2f) >= 0.01f) && ((i != 1 || Math.abs(f - 0.5f) >= 0.1f) && ((i != 2 || Math.abs(f - 1.0f) >= 0.1f) && ((i != 3 || Math.abs(f - 1.5f) >= 0.1f) && (i != 4 || Math.abs(f - 2.0f) >= 0.1f)))))) {
                a8VarArr[i].d(-328966, -328966);
            } else {
                a8VarArr[i].d(-9718023, -9718023);
            }
        }
    }

    public final void R2() {
        int q;
        if (this.f8 > 0) {
            if (this.e8 >= this.f8) {
                this.e8 = this.f8 - 1;
            }
            if (this.d2 == 1) {
                float max = Math.max(800.0f / this.i8, 800.0f / this.j8);
                this.k8 = Math.round((this.i8 * max) / 2.0f) << 1;
                this.l8 = Math.round((this.j8 * max) / 2.0f) << 1;
            } else {
                Size i = i();
                this.k8 = i.getWidth();
                this.l8 = i.getHeight();
            }
            if (this.m8 != 0) {
                if (this.d2 == 1) {
                    this.m8 = 1560000;
                    q = this.m8;
                } else if (this.k8 == this.i8 && this.l8 == this.j8) {
                    this.m8 = this.n8;
                    q = MediaController.q(this.k8, this.l8, this.m8, false);
                } else {
                    this.m8 = MediaController.P(this.j8, this.i8, this.n8, this.l8, this.k8);
                    q = MediaController.q(this.k8, this.l8, this.m8, false);
                }
                this.x8 = (long) (((q / 8) * this.o8) / 1000.0f);
            }
        }
    }

    public final void S(Canvas canvas) {
        float d;
        if (this.S4) {
            if (gba.Z) {
                byte b = this.n4;
                d = this.K8.d(b == 0 || b == 2 || b == 3);
            } else {
                d = 1.0f;
            }
            if (d <= 0.0f) {
                return;
            }
            int currentActionBarHeight = org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + ((int) (gl.m * 1.5f));
            int height = this.Q0.getHeight() + gl.n + (this.V1.getVisibility() == 0 ? gl.L(20.0f) + (this.V1.getEditTextHeightClosedKeyboard() / 2) : 0);
            if (this.M7 == null) {
                this.M7 = new Path();
                Paint paint = new Paint(1);
                this.N7 = paint;
                PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
                paint.setXfermode(new PorterDuffXfermode(mode));
                Paint paint2 = new Paint(1);
                this.O7 = paint2;
                paint2.setXfermode(new PorterDuffXfermode(mode));
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                this.P7 = new LinearGradient(0.0f, 0.0f, 0.0f, 16.0f, new int[]{-16777216, 0}, new float[]{0.0f, 1.0f}, tileMode);
                this.Q7 = new LinearGradient(0.0f, 0.0f, 0.0f, 16.0f, new int[]{0, -16777216}, new float[]{0.0f, 1.0f}, tileMode);
                this.R7 = new Matrix();
                this.S7 = new Matrix();
                this.N7.setShader(this.P7);
                this.O7.setShader(this.Q7);
            }
            canvas.saveLayerAlpha(0.0f, 0.0f, this.f0.getWidth(), this.f0.getHeight() + gl.n, (int) (d * (this.M0.getAlpha() - 127) * 2.007874f), 31);
            this.M7.rewind();
            Path path = this.M7;
            float width = this.f0.getWidth();
            float f = currentActionBarHeight;
            Path.Direction direction = Path.Direction.CW;
            path.addRect(0.0f, 0.0f, width, f, direction);
            this.M7.addRect(0.0f, (this.f0.getHeight() + gl.n) - height, this.f0.getWidth(), this.f0.getHeight() + gl.n, direction);
            canvas.clipPath(this.M7);
            canvas.drawColor(-16777216);
            Q(canvas, this.d0, 0, 0, true, true, false);
            canvas.save();
            this.R7.reset();
            this.R7.postScale(1.0f, f / 16.0f);
            this.P7.setLocalMatrix(this.R7);
            this.N7.setAlpha(kk7.l3);
            canvas.drawRect(0.0f, 0.0f, this.f0.getWidth(), f, this.N7);
            this.S7.reset();
            this.S7.postScale(1.0f, height / 16.0f);
            this.S7.postTranslate(0.0f, (this.f0.getHeight() - height) + gl.n);
            this.Q7.setLocalMatrix(this.S7);
            this.O7.setAlpha(kk7.Q2);
            canvas.drawRect(0.0f, (this.f0.getHeight() + gl.n) - height, this.f0.getWidth(), this.f0.getHeight() + gl.n, this.O7);
            canvas.restore();
            canvas.restore();
        }
    }

    public final boolean S0() {
        return this.J4 && T0() && this.d2 != 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void S1(Activity activity, org.telegram.ui.ActionBar.d dVar, wjb wjbVar) {
        Object[] objArr;
        a06 a06Var = this.s7;
        if (a06Var != null) {
            a06Var.a();
            this.s7 = null;
        }
        this.s7 = LaunchActivity.c0();
        Activity parentActivity = activity != null ? activity : dVar.getParentActivity();
        byte b = 0;
        bkb.J(parentActivity, false);
        this.w2 = wjbVar;
        this.m4 = dVar;
        int i = y6c.t0;
        this.U = i;
        this.C4.d = i;
        this.B4.d = i;
        this.D4.d = i;
        y78 y78Var = this.V1;
        if (y78Var != null) {
            y78Var.setAccount(i);
            this.V1.f.k(false);
        }
        z78 z78Var = this.W1;
        if (z78Var != null) {
            z78Var.setAccount(this.U);
            this.W1.f.k(false);
        }
        mza mzaVar = this.p5;
        if (mzaVar != null) {
            mzaVar.setCurrentAccount(this.U);
        }
        if (this.E == parentActivity || parentActivity == null) {
            F2();
            return;
        }
        this.s = parentActivity instanceof BubbleActivity;
        this.E = parentActivity;
        this.F = new ContextThemeWrapper(this.E, R.style.Theme_TMessages);
        this.z1 = ViewConfiguration.get(this.E).getScaledTouchSlop();
        byte b2 = 3;
        byte b3 = 1;
        if (f9 == null) {
            f9 = new Drawable[]{this.E.getDrawable(R.drawable.circle_big), this.E.getDrawable(R.drawable.cancel_big), this.E.getDrawable(R.drawable.load_big)};
        }
        this.V6 = new Scroller(parentActivity);
        z zVar = new z(this, parentActivity);
        this.h0 = zVar;
        zVar.setBackground(this.M0);
        this.h0.setFocusable(false);
        ClippingImageView clippingImageView = new ClippingImageView(parentActivity);
        this.i0 = clippingImageView;
        clippingImageView.O = this.k4;
        clippingImageView.L = false;
        clippingImageView.N = false;
        this.h0.addView(clippingImageView, nme.c(40.0f, 40));
        k98 k98Var = new k98(this, parentActivity, parentActivity);
        this.f0 = k98Var;
        k98Var.setFocusable(false);
        VideoFramesRewinder videoFramesRewinder = this.b4;
        if (videoFramesRewinder != null) {
            videoFramesRewinder.setParentView(this.f0);
        }
        this.f0.setClipChildren(true);
        this.f0.setClipToPadding(true);
        this.h0.setClipChildren(false);
        this.h0.setClipToPadding(false);
        sl0 sl0Var = new sl0(this.f0);
        this.c0 = sl0Var;
        sl0Var.a = true;
        this.Y = new f78(this);
        this.b0 = new e59();
        this.a0 = new e59();
        f78 f78Var = this.Y;
        kl0 kl0Var = new kl0(f78Var, f78Var, f78Var);
        this.Z = kl0Var;
        kl0Var.e(new zec(this.f0), this.f0);
        this.Z.g = this.b0;
        this.d0 = new wl0(this.c0, this.f0);
        this.h0.addView(this.f0, nme.e(-1, -1, 51));
        k98 k98Var2 = this.f0;
        r68 r68Var = new r68(this);
        WeakHashMap weakHashMap = jdc.a;
        bdc.i(k98Var2, r68Var);
        this.f0.setSystemUiVisibility(1792);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.e0 = layoutParams;
        layoutParams.height = -1;
        layoutParams.format = -3;
        layoutParams.width = -1;
        layoutParams.gravity = 51;
        layoutParams.type = 99;
        gl.m(layoutParams);
        this.e0.flags = -2147286784;
        ju7 ju7Var = new ju7(this.E);
        this.y4 = ju7Var;
        ju7Var.setVideoPosition(new r68(this));
        this.f0.addView(this.y4, nme.c(-2.0f, -2));
        ju7 ju7Var2 = new ju7(this.E);
        this.z4 = ju7Var2;
        this.f0.addView(ju7Var2, nme.c(-2.0f, -2));
        ju7 ju7Var3 = new ju7(this.E);
        this.A4 = ju7Var3;
        this.f0.addView(ju7Var3, nme.c(-2.0f, -2));
        x10 x10Var = new x10(b2, parentActivity, this);
        this.G = x10Var;
        x10Var.setOverlayTitleAnimation(true);
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
        n98 n98Var = new n98(parentActivity);
        this.N = n98Var;
        this.G.addView(n98Var, nme.e(-1, -1, kk7.D1));
        this.f0.addView(this.G, nme.c(-2.0f, -1));
        m98 m98Var = new m98(parentActivity);
        this.O = m98Var;
        this.f0.addView(m98Var, nme.e(-1, -2, 55));
        this.G.setActionBarMenuOnItemClick(new p78(this, wjbVar));
        r6 t = this.G.t();
        this.B0 = t;
        t.setOnLayoutListener(new l68(this, (byte) 17));
        r7 a = this.B0.a(26, R.drawable.menu_delete_old);
        this.F0 = a;
        a.setContentDescription(k96.L0(2131751586));
        ote.a(this.F0);
        Q1(this.F0, false, false);
        r7 a2 = this.B0.a(11, R.drawable.msg_mask);
        this.E0 = a2;
        a2.setContentDescription(k96.L0(2131748487));
        r7 a3 = this.B0.a(18, R.drawable.msg_header_draw);
        this.D0 = a3;
        a3.setContentDescription(k96.L0(2131754809));
        byte b4 = 4;
        r7 a4 = this.B0.a(4, R.drawable.msg_header_share);
        this.C0 = a4;
        a4.setContentDescription(k96.L0(2131750570));
        r6 r6Var = this.B0;
        mg2 mg2Var = new mg2(this.F, R.drawable.video_settings, new f53());
        this.x0 = mg2Var;
        r7 d = r6Var.d(1, mg2Var);
        this.q0 = d;
        this.x0.setCallback(d.getIconView());
        this.q0.getPopupLayout().setSwipeBackForegroundColor(-14540254);
        this.q0.getPopupLayout().c = true;
        this.q0.getPopupLayout().setFitItems(true);
        this.q0.setMenuXOffset(gl.L(3.0f));
        v7 v7Var = new v7(this.F, wjbVar);
        this.s0 = v7Var;
        byte b5 = 5;
        v7Var.setStops(new float[]{0.5f, 1.0f, 1.5f, 2.0f, 2.5f});
        this.s0.setMinimumWidth(gl.L(196.0f));
        this.s0.setDrawShadow(false);
        this.s0.setBackgroundColor(-14540254);
        this.s0.setTextColor(-1);
        this.s0.setLabel(k96.L0(2131743345));
        this.s0.setOnValueChange(new s68(this, (byte) 1));
        this.q0.getPopupLayout().a(this.s0, nme.o(-1, 44));
        j8 a5 = this.q0.a(-1);
        this.A0 = a5;
        a5.setColor(-15198184);
        ActionBarPopupWindow$ActionBarPopupWindowLayout popupLayout = this.q0.getPopupLayout();
        pkb pkbVar = new pkb(this.F, new r68(this));
        this.J0 = pkbVar;
        popupLayout.addView(pkbVar);
        LinearLayout linearLayout = new LinearLayout(this.F);
        this.y0 = linearLayout;
        linearLayout.setOrientation(1);
        this.q0.getPopupLayout().addView(this.y0);
        a8 e = this.q0.e(22, R.drawable.menu_video_loop, k96.L0(2131743346));
        this.t0 = e;
        e.setSelectorColor(268435455);
        o10 o10Var = new o10(this, this.F, b3);
        this.H0 = o10Var;
        try {
            o10Var.setRouteSelector(ad1.c(this.F).a());
            objArr = true;
        } catch (Exception e2) {
            fa4.f(e2);
            objArr = false;
        }
        this.H0.setVisibility(4);
        if (objArr != false) {
            a8 e3 = this.q0.e(24, R.drawable.menu_video_chromecast, k96.L0(2131743350));
            this.G0 = e3;
            e3.f(false);
            this.G0.setSelectorColor(268435455);
            this.G0.addView(this.H0, 0, nme.c(-1.0f, -1));
        }
        this.q0.I(-115203550);
        this.q0.setOnMenuDismiss(new q68(this, (byte) 9));
        r7 a6 = this.B0.a(0, R.drawable.media_more);
        this.p0 = a6;
        a6.setContentDescription(k96.L0(2131754838));
        this.p0.setOnClickListener(new v68(this, b4));
        this.p0.setOnMenuDismiss(new q68(this, (byte) 10));
        this.p0.getPopupLayout().setSwipeBackForegroundColor(-14540254);
        this.p0.getPopupLayout().c = true;
        this.p0.getPopupLayout().setFitItems(true);
        this.K0 = new lg2(this.F, this.p0.getPopupLayout().getSwipeBack(), new r68(this));
        a8 i2 = this.p0.i(R.drawable.msg_gallery, null, k96.L0(2131745737), this.K0.a);
        i2.d(-328966, -328966);
        this.u0 = i2;
        i2.setOnClickListener(new v68(this, b5));
        j8 a7 = this.p0.a(-1);
        this.v0 = a7;
        a7.setColor(-15198184);
        this.p0.e(10, R.drawable.msg_openin, k96.L0(2131747603)).d(-328966, -328966);
        a8 e4 = this.p0.e(6, R.drawable.menu_video_pip, k96.L0(2131747029));
        e4.d(-328966, -328966);
        this.w0 = e4;
        r66 r66Var = new r66(false);
        this.q7 = r66Var;
        a8 f = this.p0.f(r66Var, k96.L0(2131743349), kk7.J1, true, 0);
        this.p7 = f;
        f.d(-328966, -328966);
        this.p7.setItemHeight(56);
        this.p7.setSelectorColor(268435455);
        this.p7.setRightIcon(R.drawable.msg_settings);
        this.p7.setSubtext(k96.L0(2131743348));
        this.p7.getRightIcon().setBackground(bkb.e0(536870911, 1));
        int i3 = (k96.a0 ? 3 : 5) | 16;
        ImageView rightIcon = this.p7.getRightIcon();
        boolean z = k96.a0;
        rightIcon.setLayoutParams(nme.d(40, 40.0f, i3, z ? 4.0f : 0.0f, 0.0f, z ? 0.0f : 4.0f, 0.0f));
        View view = new View(this.F);
        view.setBackgroundColor(536870911);
        boolean z2 = k96.a0;
        FrameLayout.LayoutParams d2 = nme.d(-1, 28.0f, i3, z2 ? 52.0f : 0.0f, 0.0f, z2 ? 0.0f : 52.0f, 0.0f);
        d2.width = 1;
        view.setLayoutParams(d2);
        this.p7.addView(view);
        View[] viewArr = {this.p7.getTextView(), this.p7.getSubtextView()};
        int i4 = 0;
        for (int i5 = 2; i4 < i5; i5 = 2) {
            View view2 = viewArr[i4];
            if (view2 != null) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) view2.getLayoutParams();
                layoutParams2.leftMargin = k96.a0 ? gl.L(60.0f) : 0;
                layoutParams2.rightMargin = k96.a0 ? 0 : gl.L(60.0f);
                view2.setLayoutParams(layoutParams2);
            }
            i4++;
        }
        this.p7.getRightIcon().setContentDescription(k96.L0(2131745041));
        byte b6 = 8;
        this.p7.getRightIcon().setOnClickListener(new v68(this, b6));
        this.p0.u(kk7.J1);
        a8 e5 = this.p0.e(3, R.drawable.msg_media, k96.L0(2131745155));
        this.r0 = e5;
        e5.d(-328966, -328966);
        this.p0.e(12, R.drawable.msg_gif, k96.L0(2131745738)).d(-328966, -328966);
        this.p0.e(5, R.drawable.msg_message, k96.L0(2131745150)).d(-328966, -328966);
        this.p0.e(25, R.drawable.msg_sticker, k96.L0(2131751692)).d(-328966, -328966);
        this.p0.e(21, R.drawable.menu_reply, k96.L0(2131746070)).d(-328966, -328966);
        this.p0.e(23, R.drawable.msg_report, k96.L0(2131746019)).d(-328966, -328966);
        this.p0.e(9, R.drawable.msg_shareout, k96.L0(2131745267)).d(-328966, -328966);
        this.p0.e(13, R.drawable.msg_sticker, k96.L0(2131745136)).d(-328966, -328966);
        this.p0.e(14, R.drawable.msg_openprofile, k96.L0(2131745350)).d(-328966, -328966);
        this.p0.e(19, R.drawable.msg_translate, k96.L0(2131743717)).d(-328966, -328966);
        this.p0.e(20, R.drawable.msg_translate, k96.L0(2131749112)).d(-328966, -328966);
        byte b7 = 7;
        this.p0.e(7, R.drawable.msg_delete, k96.L0(2131751586)).d(-328966, -328966);
        this.p0.e(8, R.drawable.msg_cancel, k96.L0(2131744602)).d(-328966, -328966);
        this.p0.I(-115203550);
        this.p0.u(19);
        this.p0.u(20);
        R1(false, true);
        this.p0.setPopupItemsSelectorColor(268435455);
        this.p0.setSubMenuDelegate(new q78(this));
        a6 a6Var = new a6(this.F, (byte) 23);
        this.j0 = a6Var;
        a6Var.setBackgroundColor(2130706432);
        this.f0.addView(this.j0, nme.e(-1, 48, 83));
        View view3 = new View(this.F);
        this.k0 = view3;
        view3.setBackgroundColor(this.d2 == 11 ? -16777216 : 2130706432);
        this.h0.addView(this.k0, nme.a(-1.0f, this.l0 / gl.p, 87));
        this.w1[0] = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{838860800, 0});
        this.w1[0].setShape(0);
        this.w1[1] = new GradientDrawable(GradientDrawable.Orientation.RIGHT_LEFT, new int[]{838860800, 0});
        this.w1[1].setShape(0);
        vb5 vb5Var = new vb5(this.F, gl.L(10.0f));
        this.m1 = vb5Var;
        this.f0.addView(vb5Var, nme.e(-1, 68, 83));
        this.m1.setDelegate(new s78(this));
        for (int i6 = 0; i6 < 3; i6++) {
            this.y3[i6] = new ImageView(this.E);
            this.y3[i6].setImageResource(R.drawable.msg_maxvideo);
            this.y3[i6].setContentDescription(k96.M0(2131754717, "AccSwitchToFullscreen"));
            this.y3[i6].setScaleType(ImageView.ScaleType.CENTER);
            this.y3[i6].setBackground(bkb.f0(1090519039, 1, -1));
            this.y3[i6].setVisibility(4);
            this.y3[i6].setAlpha(1.0f);
            this.f0.addView(this.y3[i6], nme.c(48.0f, 48));
            this.y3[i6].setOnClickListener(new j68(this, b));
        }
        this.R = new t78(null, new f53(), b);
        g98 g98Var = new g98(this.f0.getContext());
        this.R1 = g98Var;
        byte b8 = 3;
        g98Var.setFactory(new zj3(this, b8));
        this.R1.setVisibility(4);
        G1(true);
        int i7 = 0;
        while (i7 < b8) {
            this.X0[i7] = new u78(this, this.f0);
            this.X0[i7].d(0, false, true);
            i7++;
            b8 = 3;
        }
        wh1 wh1Var = new wh1(this, this.F, wjbVar);
        this.Y0 = wh1Var;
        wh1Var.setUseSelfAlpha(true);
        this.Y0.setProgressColor(-1);
        this.Y0.setSize(gl.L(54.0f));
        this.Y0.setBackgroundResource(R.drawable.circle_big);
        this.Y0.setVisibility(4);
        this.Y0.setAlpha(0.0f);
        this.f0.addView(this.Y0, nme.e(64, 64, 17));
        I();
        RadialProgressView radialProgressView = new RadialProgressView(this.E, wjbVar);
        this.W7 = radialProgressView;
        radialProgressView.setProgressColor(-1);
        this.W7.setBackgroundResource(R.drawable.circle_big);
        this.W7.setVisibility(4);
        this.f0.addView(this.W7, nme.e(54, 54, 17));
        z92 z92Var = new z92(this.E, (byte) 3);
        this.V7 = z92Var;
        z92Var.setBackgroundColor(2130706432);
        this.V7.b();
        this.V7.setTranslationY(gl.L(120.0f));
        ((TextView) this.V7.b).setText(k96.M0(2131751342, "Done").toUpperCase());
        TextView textView = (TextView) this.V7.b;
        int i8 = bkb.pg;
        zkb.X(textView, i8, wjbVar);
        this.f0.addView(this.V7, nme.e(-1, 48, 83));
        ((TextView) this.V7.d).setOnClickListener(new j68(this, (byte) 3));
        ((TextView) this.V7.b).setOnClickListener(new j68(this, (byte) 4));
        rac racVar = new rac(false);
        this.A1 = racVar;
        byte b9 = 24;
        racVar.n = new s34(this, b9);
        k98 k98Var3 = this.f0;
        Objects.requireNonNull(k98Var3);
        this.B1 = new iv9(new oq7(k98Var3, b9), false);
        q98 q98Var = new q98(this.E, this);
        this.U7 = q98Var;
        q98Var.setTranslationY(gl.L(120.0f));
        this.U7.setVisibility(4);
        this.U7.setBackgroundColor(2130706432);
        this.f0.addView(this.U7, nme.d(-1, 70.0f, 83, 0.0f, 0.0f, 0.0f, 48.0f));
        new Paint().setColor(2130706432);
        jo0 jo0Var = new jo0(this, this.F);
        this.Q0 = jo0Var;
        this.f0.addView(jo0Var, nme.e(-1, -2, 83));
        TextView textView2 = new TextView(this.f0.getContext());
        this.m0 = textView2;
        textView2.setTextSize(1, 15.0f);
        this.m0.setTypeface(gl.o());
        this.m0.setSingleLine(true);
        this.m0.setMaxLines(1);
        TextView textView3 = this.m0;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView3.setEllipsize(truncateAt);
        this.m0.setTextColor(-1);
        this.m0.setGravity(3);
        this.Q0.addView(this.m0, nme.d(-1, -2.0f, 51, 20.0f, 23.0f, 84.0f, 0.0f));
        TextView textView4 = new TextView(this.f0.getContext());
        this.n0 = textView4;
        textView4.setTextSize(1, 14.0f);
        this.n0.setSingleLine(true);
        this.n0.setMaxLines(1);
        this.n0.setEllipsize(truncateAt);
        this.n0.setTextColor(-1);
        this.n0.setGravity(3);
        this.Q0.addView(this.n0, nme.d(-1, -2.0f, 51, 20.0f, 46.0f, 84.0f, 0.0f));
        TextView textView5 = new TextView(this.f0.getContext());
        this.o0 = textView5;
        int i10 = bkb.Ei;
        zkb.R(textView5, sjb.e(y0(i10), 6.0f), zkb.M(i10), zkb.e(i10), wjbVar);
        TextView textView6 = this.o0;
        int i11 = bkb.Ii;
        zkb.X(textView6, i11, wjbVar);
        this.o0.setEllipsize(truncateAt);
        this.o0.setGravity(17);
        this.o0.setLines(1);
        this.o0.setSingleLine(true);
        this.o0.setText(k96.M0(2131745349, "SetAsMyPhoto"));
        this.o0.setTextSize(1, 15.0f);
        this.o0.setTypeface(gl.o());
        this.o0.setOnClickListener(new j68(this, b7));
        this.o0.setVisibility(8);
        this.Q0.addView(this.o0, nme.d(-1, 48.0f, 51, 20.0f, 0.0f, 20.0f, 64.0f));
        v78 v78Var = new v78(this.E, this);
        this.Y7 = v78Var;
        v78Var.setDelegate(new ny0(this));
        FrameLayout frameLayout = new FrameLayout(this.E);
        this.X7 = frameLayout;
        frameLayout.setClipChildren(false);
        this.X7.addView(this.Y7, nme.e(-1, 54, 83));
        l2(false, false);
        this.f0.addView(this.X7, nme.d(-1, 54.0f, 83, 0.0f, 8.0f, 0.0f, 0.0f));
        r7 r7Var = this.F0;
        if (r7Var != null) {
            il0 a8 = this.Z.a(r7Var);
            a8.p(nod.i(wjbVar));
            a8.r(gl.L(20.0f));
            a8.q(gl.L(7.0f));
            r7Var.setBackground(tk0.d(a8, gl.L(54.0f), gl.L(54.0f)));
        }
        w78 w78Var = new w78(this.E, k96.L0(2131751196));
        this.h1 = w78Var;
        il0 a9 = this.Z.a(w78Var);
        a9.p(nod.i(wjbVar));
        w78Var.setBlurredBackgroundDrawable(a9);
        ote.a(this.h1);
        this.h1.setOnClickListener(new j68(this, b6));
        this.f0.addView(this.h1, nme.d(-1, 32.0f, 87, 60.0f, 0.0f, 60.0f, 0.0f));
        v98 v98Var = new v98(this.E, wjbVar, this.c0);
        this.q5 = v98Var;
        ss3 ss3Var = v98Var.c;
        il0 a10 = this.Z.a(ss3Var);
        a10.p(nod.i(wjbVar));
        ss3Var.setBlurredBackgroundDrawable(a10);
        ote.a(this.q5.c);
        this.q5.setVisibility(8);
        this.q5.setAlpha(0.0f);
        this.q5.setOnClose(new l68(this, (byte) 13));
        this.f0.addView(this.q5, nme.e(-1, -1, kk7.D1));
        this.q5.b.setOnClickListener(new j68(this, (byte) 10));
        this.q5.setOnGalleryImage(new q68(this, (byte) 4));
        c7 c7Var = new c7((byte) 3, this.E, this);
        this.f1 = c7Var;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        c7Var.setScaleType(scaleType);
        c7 c7Var2 = this.f1;
        za2 za2Var = new za2(this.E);
        this.e1 = za2Var;
        c7Var2.setImageDrawable(za2Var);
        this.f1.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        View view4 = this.f1;
        il0 a11 = this.Z.a(view4);
        a11.p(nod.i(null));
        a11.q(gl.L(4.0f));
        a11.r(gl.L(16.0f));
        view4.setBackground(a11);
        ote.a(this.f1);
        this.f0.addView(this.f1, nme.d(40, 40.0f, 83, 8.0f, 0.0f, 0.0f, -4.0f));
        this.f1.setOnClickListener(new j68(this, (byte) 11));
        o76 o76Var = new o76(this.f0.getContext());
        this.g1 = o76Var;
        o76Var.setOnClickListener(new j68(this, (byte) 12));
        this.f0.addView(this.g1, nme.d(45, 45.0f, 83, 8.0f, 0.0f, 0.0f, -4.0f));
        Context context = this.f0.getContext();
        z zVar2 = this.h0;
        k98 k98Var4 = this.f0;
        y78 y78Var2 = new y78(this, context, zVar2, k98Var4, k98Var4, wjbVar, this.c0, new l68(this, (byte) 16));
        this.V1 = y78Var2;
        y78Var2.setBlurredBackgroundDrawableForMentions(this.Z);
        this.V1.setOnTimerChange(new q68(this, (byte) 5));
        this.V1.setAccount(this.U);
        this.V1.setOnHeightUpdate(new q68(this, (byte) 6));
        this.V1.setOnAddPhotoClick(new j68(this, (byte) 13));
        ContextThemeWrapper contextThemeWrapper = this.F;
        z zVar3 = this.h0;
        k98 k98Var5 = this.f0;
        z78 z78Var2 = new z78(this, contextThemeWrapper, zVar3, k98Var5, k98Var5, wjbVar, this.c0, new l68(this, (byte) 16));
        this.W1 = z78Var2;
        z78Var2.setBlurredBackgroundDrawableForMentions(this.Z);
        this.W1.D(true, false);
        this.W1.setOnTimerChange(new q68(this, (byte) 7));
        this.W1.setAccount(this.U);
        this.W1.setOnHeightUpdate(new q68(this, (byte) 8));
        this.W1.setOnAddPhotoClick(new j68(this, (byte) 14));
        rj4 rj4Var = new rj4(this, this.F);
        this.s5 = rj4Var;
        rj4Var.setVisibility(8);
        this.f0.addView(this.s5, nme.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        mza mzaVar2 = new mza(this.F, wjbVar);
        this.p5 = mzaVar2;
        mzaVar2.setCurrentAccount(this.U);
        k98 k98Var6 = this.f0;
        k98Var6.addView(this.p5, k98Var6.indexOfChild(this.G) - 1, nme.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        c98 c98Var = new c98(this);
        this.t5 = c98Var;
        byte b10 = 18;
        c98Var.setRad(18);
        this.t5.l();
        this.p5.setStickerCutOutBtn(this.t5);
        this.t5.setOnClickListener(new j68(this, (byte) 15));
        this.t5.setCutOutState(false);
        this.f0.addView(this.t5, nme.e(-1, 36, 17));
        LinearLayout linearLayout2 = new LinearLayout(this.E);
        this.u5 = linearLayout2;
        linearLayout2.setOrientation(0);
        c98 c98Var2 = new c98(this);
        this.v5 = c98Var2;
        c98Var2.s0 = true;
        c98Var2.setRad(18);
        this.v5.setEraseState(false);
        this.v5.setOnClickListener(new j68(this, (byte) 16));
        this.u5.addView(this.v5, nme.o(-2, 36));
        this.u5.addView(new Space(this.E), nme.o(12, -1));
        c98 c98Var3 = new c98(this);
        this.w5 = c98Var3;
        c98Var3.s0 = true;
        c98Var3.setRad(18);
        this.w5.setRestoreState(false);
        this.w5.setOnClickListener(new j68(this, (byte) 17));
        this.u5.addView(this.w5, nme.o(-2, 36));
        this.f0.addView(this.u5, nme.e(-2, 36, 17));
        c98 c98Var4 = new c98(this);
        this.x5 = c98Var4;
        c98Var4.setUndoState(false);
        this.x5.setRad(18);
        c98 c98Var5 = this.x5;
        c98Var5.s0 = true;
        c98Var5.setOnClickListener(new j68(this, b10));
        this.f0.addView(this.x5, nme.e(-2, 36, 17));
        c98 c98Var6 = new c98(this);
        this.y5 = c98Var6;
        c98Var6.setOutlineState(false);
        this.y5.setRad(18);
        c98 c98Var7 = this.y5;
        c98Var7.s0 = true;
        c98Var7.setOnClickListener(new j68(this, (byte) 19));
        this.f0.addView(this.y5, nme.e(-2, 36, 17));
        e2(false, false);
        j2(false, false);
        byte b11 = 9;
        oc6 oc6Var = new oc6(b11, this.E, this);
        this.Y1 = oc6Var;
        oc6Var.addView(this.V1, nme.e(-1, -1, 83));
        this.f0.addView(this.Y1, nme.d(-1, -1.0f, 83, 0.0f, 8.0f, 0.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(this.E);
        this.Z1 = frameLayout2;
        frameLayout2.addView(this.W1, nme.e(-1, -1, 51));
        this.f0.addView(this.Z1, nme.d(-1, -1.0f, 51, 0.0f, 8.0f, 0.0f, 0.0f));
        FrameLayout frameLayout3 = new FrameLayout(this.E);
        this.R0 = frameLayout3;
        this.f0.addView(frameLayout3, nme.d(-1, 120.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        FrameLayout frameLayout4 = new FrameLayout(this.E);
        this.S0 = frameLayout4;
        this.f0.addView(frameLayout4, nme.d(-1, 120.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView7 = new TextView(this.E);
        this.Z7 = textView7;
        textView7.setSingleLine(true);
        this.Z7.setVisibility(8);
        this.Z7.setText(k96.M0(2131752121, "ChooseCover"));
        this.Z7.setGravity(1);
        this.Z7.setTextSize(1, 14.0f);
        this.Z7.setTextColor(-7566196);
        this.f0.addView(this.Z7, nme.d(-1, -2.0f, 83, 0.0f, 8.0f, 0.0f, 0.0f));
        jh3 jh3Var = new jh3(this, this.E, wjbVar);
        this.T0 = jh3Var;
        int L = gl.L(52.0f);
        int L2 = gl.L(38.0f);
        jh3Var.L = L;
        jh3Var.M = L2;
        jh3 jh3Var2 = this.T0;
        jh3Var2.s0 = true;
        il0 a12 = this.Z.a(jh3Var2);
        a12.p(nod.i(wjbVar));
        jh3Var2.setBlurredBackgroundDrawable(a12);
        this.f0.addView(this.T0, nme.d(120, 120.0f, 85, 0.0f, 0.0f, 8.0f, 2.0f));
        this.T0.setContentDescription(k96.M0(2131745448, "Send"));
        ote.a(this.T0);
        this.T0.setOnClickListener(new j68(this, (byte) 20));
        this.T0.setOnLongClickListener(new zs(this, (byte) 10));
        l65 l65Var = new l65(this.E);
        this.U0 = l65Var;
        View view5 = l65Var.b;
        il0 a13 = this.Z.a(view5);
        a13.p(nod.i(wjbVar));
        a13.r(gl.L(18.0f));
        a13.q(gl.L(7.0f));
        view5.setBackground(a13);
        View view6 = this.U0.c;
        il0 a14 = this.Z.a(view6);
        a14.p(nod.i(wjbVar));
        a14.r(gl.L(18.0f));
        a14.q(gl.L(7.0f));
        view6.setBackground(a14);
        this.U0.setVisibility(8);
        this.U0.b.setOnClickListener(new j68(this, (byte) 21));
        this.U0.c.setOnClickListener(new j68(this, (byte) 22));
        this.f0.addView(this.U0, nme.e(-1, 56, 80));
        pkb pkbVar2 = new pkb(b11, this.E, this);
        this.I0 = pkbVar2;
        pkbVar2.setOrientation(0);
        this.I0.setPadding(gl.L(2.0f), 0, gl.L(2.0f), 0);
        View view7 = this.I0;
        il0 a15 = this.Z.a(view7);
        a15.p(nod.i(wjbVar));
        a15.q(gl.L(2.0f));
        a15.r(gl.L(22.0f));
        view7.setBackground(a15);
        this.Q0.addView(this.I0, nme.d(-2, 48.0f, 81, 0.0f, 3.0f, 63.0f, 0.0f));
        ImageView imageView = new ImageView(this.E);
        this.a1 = imageView;
        imageView.setScaleType(scaleType);
        this.a1.setImageResource(R.drawable.media_crop);
        ImageView imageView2 = this.a1;
        float L3 = gl.L(22.0f);
        int L4 = gl.L(4.0f);
        int L5 = gl.L(6.0f);
        imageView2.setBackground(bkb.W(L3, 285212671, L4, L5, L4, L5));
        this.I0.addView(this.a1, nme.o(48, 48));
        this.a1.setOnClickListener(new j68(this, (byte) 23));
        this.a1.setContentDescription(k96.M0(2131751686, "CropImage"));
        ImageView imageView3 = new ImageView(this.E);
        this.c1 = imageView3;
        imageView3.setScaleType(scaleType);
        this.c1.setImageResource(R.drawable.msg_photo_rotate);
        ImageView imageView4 = this.c1;
        float L6 = gl.L(22.0f);
        int L7 = gl.L(4.0f);
        int L8 = gl.L(6.0f);
        imageView4.setBackground(bkb.W(L6, 285212671, L7, L8, L7, L8));
        this.I0.addView(this.c1, nme.o(48, 48));
        this.c1.setOnClickListener(new j68(this, (byte) 24));
        this.c1.setContentDescription(k96.M0(2131754782, "AccDescrRotate"));
        ImageView imageView5 = new ImageView(this.E);
        this.b1 = imageView5;
        imageView5.setScaleType(scaleType);
        this.b1.setImageResource(R.drawable.media_flip);
        ImageView imageView6 = this.b1;
        float L9 = gl.L(22.0f);
        int L10 = gl.L(4.0f);
        int L11 = gl.L(6.0f);
        imageView6.setBackground(bkb.W(L9, 285212671, L10, L11, L10, L11));
        this.I0.addView(this.b1, nme.o(48, 48));
        this.b1.setOnClickListener(new j68(this, (byte) 25));
        this.b1.setContentDescription(k96.M0(2131754839, "AccDescrMirror"));
        ImageView imageView7 = new ImageView(this.E);
        this.Z0 = imageView7;
        imageView7.setScaleType(scaleType);
        this.Z0.setImageResource(R.drawable.media_draw);
        ImageView imageView8 = this.Z0;
        float L12 = gl.L(22.0f);
        int L13 = gl.L(4.0f);
        int L14 = gl.L(6.0f);
        imageView8.setBackground(bkb.W(L12, 285212671, L13, L14, L13, L14));
        this.I0.addView(this.Z0, nme.o(48, 48));
        this.Z0.setOnClickListener(new j68(this, (byte) 26));
        this.Z0.setContentDescription(k96.M0(2131754809, "AccDescrPhotoEditor"));
        iac iacVar = new iac(this.E);
        this.k1 = iacVar;
        iacVar.setTag(1);
        iac iacVar2 = this.k1;
        float L15 = gl.L(22.0f);
        int L16 = gl.L(4.0f);
        int L17 = gl.L(6.0f);
        iacVar2.setBackground(bkb.W(L15, 285212671, L16, L17, L16, L17));
        this.e8 = D1();
        this.k1.a(Math.min(this.k8, this.l8), this.q8 && this.f8 > 1, this.r);
        this.k1.setContentDescription(k96.M0(2131754734, "AccDescrVideoQuality"));
        this.I0.addView(this.k1, nme.o(48, 48));
        this.k1.setOnClickListener(new v16(this, parentActivity, b10));
        ImageView imageView9 = new ImageView(this.E);
        this.d1 = imageView9;
        imageView9.setScaleType(scaleType);
        this.d1.setImageResource(R.drawable.media_settings);
        ImageView imageView10 = this.d1;
        float L18 = gl.L(22.0f);
        int L19 = gl.L(4.0f);
        int L20 = gl.L(6.0f);
        imageView10.setBackground(bkb.W(L18, 285212671, L19, L20, L19, L20));
        this.I0.addView(this.d1, nme.o(48, 48));
        this.d1.setOnClickListener(new j68(this, (byte) 27));
        this.d1.setContentDescription(k96.M0(2131754810, "AccDescrPhotoAdjust"));
        z92 z92Var2 = new z92(this.F, (byte) 3);
        this.V0 = z92Var2;
        z92Var2.setBackgroundColor(-872415232);
        this.V0.b();
        this.V0.setVisibility(8);
        this.f0.addView(this.V0, nme.e(-1, 48, 83));
        ((TextView) this.V0.d).setOnClickListener(new j68(this, (byte) 28));
        ((TextView) this.V0.b).setOnClickListener(new j68(this, (byte) 29));
        TextView textView8 = new TextView(this.F);
        this.W0 = textView8;
        textView8.setClickable(false);
        this.W0.setVisibility(8);
        this.W0.setTextSize(1, 14.0f);
        this.W0.setTextColor(-1);
        this.W0.setGravity(17);
        this.W0.setBackgroundDrawable(bkb.e0(-12763843, 0));
        this.W0.setPadding(gl.L(20.0f), 0, gl.L(20.0f), 0);
        this.W0.setText(k96.L0(2131751684).toUpperCase());
        this.W0.setTypeface(gl.o());
        this.V0.addView(this.W0, nme.e(-2, -1, 49));
        this.W0.setOnClickListener(new v68(this, b));
        ns4 ns4Var = new ns4(this.f0.getContext(), this);
        this.r6 = ns4Var;
        ns4Var.v = false;
        this.s6 = true;
        ns4Var.h = this;
        r68 r68Var2 = new r68(this);
        this.C4.p0(this.f0);
        ImageReceiver imageReceiver = this.C4;
        imageReceiver.l1 = (byte) 2;
        imageReceiver.K0 = true;
        imageReceiver.h1 = r68Var2;
        this.B4.p0(this.f0);
        ImageReceiver imageReceiver2 = this.B4;
        imageReceiver2.l1 = (byte) 2;
        imageReceiver2.K0 = true;
        imageReceiver2.h1 = r68Var2;
        this.D4.p0(this.f0);
        ImageReceiver imageReceiver3 = this.D4;
        imageReceiver3.l1 = (byte) 2;
        imageReceiver3.K0 = true;
        imageReceiver3.h1 = r68Var2;
        int rotation = ((WindowManager) org.telegram.messenger.a.b.getSystemService("window")).getDefaultDisplay().getRotation();
        CheckBox checkBox = new CheckBox(this.f0.getContext(), R.drawable.selectphoto_large);
        this.O0 = checkBox;
        checkBox.setDrawBackground(true);
        this.O0.setHasBorder(true);
        this.O0.setSize(34);
        this.O0.setCheckOffset(gl.L(1.0f));
        this.O0.c(y0(i8), -1);
        this.O0.setVisibility(8);
        this.f0.addView(this.O0, nme.d(34, 34.0f, 53, 0.0f, (rotation == 3 || rotation == 1) ? 61.0f : 71.0f, 11.0f, 0.0f));
        if (!this.s) {
            ((FrameLayout.LayoutParams) this.O0.getLayoutParams()).topMargin += gl.m;
        }
        this.O0.setOnClickListener(new v68(this, 1 == true ? 1 : 0));
        CounterView counterView = new CounterView(this.E);
        this.P0 = counterView;
        this.f0.addView(counterView, nme.d(40, 40.0f, 53, 0.0f, (rotation == 3 || rotation == 1) ? 58.0f : 68.0f, 64.0f, 0.0f));
        if (!this.s) {
            ((FrameLayout.LayoutParams) this.P0.getLayoutParams()).topMargin += gl.m;
        }
        this.P0.setOnClickListener(new v68(this, (byte) 2));
        t98 t98Var = new t98(this.E);
        this.p1 = t98Var;
        t98Var.setVisibility(8);
        this.p1.setAlpha(0.0f);
        this.p1.setLayoutManager(new zr((byte) 11, b, 1 == true ? 1 : 0));
        t98 t98Var2 = this.p1;
        s20 s20Var = new s20(this, this.E, (byte) 13);
        this.q1 = s20Var;
        t98Var2.setAdapter(s20Var);
        this.f0.addView(this.p1, nme.e(-1, kk7.n1, 51));
        this.p1.setOnItemClickListener(new bf4(this, (byte) 19));
        UndoView undoView = new UndoView(this.F, null, false, wjbVar);
        this.o1 = undoView;
        undoView.setAdditionalTranslationY(gl.L(112.0f));
        this.o1.h(-115203550, -1);
        this.f0.addView(this.o1, nme.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        if (gl.A1()) {
            View view8 = new View(this.F);
            this.T3 = view8;
            view8.setContentDescription(k96.M0(2131754929, "AccActionPlay"));
            this.T3.setFocusable(true);
            this.T3.setOnClickListener(new v68(this, (byte) 3));
            this.f0.addView(this.T3, nme.e(64, 64, 17));
        }
        zkb.R(this.o0, sjb.e(y0(i10), 6.0f), zkb.M(i10), zkb.e(i10), wjbVar);
        zkb.X(this.o0, i11, wjbVar);
        t78 t78Var = this.R;
        t78Var.j0 = true;
        t78Var.h0 = false;
        qib m = t78Var.m(this.h0.getContext());
        gl.B2(m);
        this.f0.addView(m);
        this.R.Q(this.f0);
        this.R.P();
        this.a.a(false, false);
    }

    public final boolean S2() {
        ul5 ul5Var = this.p2;
        return (ul5Var == null || !ul5Var.d || ul5Var.e) ? false : true;
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
    public final void T(float f, float f2, float f3, float f4, Canvas canvas) {
        float f5;
        float f6;
        float alpha;
        boolean z;
        u78[] u78VarArr;
        iv9 iv9Var;
        ImageView[] imageViewArr;
        v78 v78Var;
        lbc lbcVar;
        boolean z2 = true;
        boolean z3 = !this.s1 || (((v78Var = this.Y7) == null || !v78Var.r) && ((this.d2 != 1 || this.H2) && !(((lbcVar = this.G2) != null && lbcVar.c0()) || this.o6 == 5 || this.u4 == 5)));
        if (this.J4 && (T0() || this.T4 != null)) {
            z3 = false;
        }
        if (this.Y0.getVisibility() != 0 && this.x == null) {
            z2 = false;
        }
        if (z3) {
            if (!this.R6) {
                float f7 = -f;
                float f8 = this.F6;
                if (f7 > f8) {
                    f5 = f8 + f;
                    f6 = f2 == 1.0f ? f3 : 0.0f;
                    alpha = !z2 ? (1.0f - this.Y0.getAlpha()) * f4 : f4;
                    z = this.B3;
                    u78VarArr = this.X0;
                    if (!z) {
                        alpha *= this.G.getAlpha();
                    } else if (u78VarArr[0].h == 4) {
                        f6 += (1.0f - this.G.getAlpha()) * gl.N(8.0f);
                    }
                    iv9Var = this.B1;
                    if (iv9Var != null || !iv9Var.a()) {
                        canvas.save();
                        canvas.translate(f5, f6);
                        u78 u78Var = u78VarArr[0];
                        u78Var.o = 1.0f;
                        u78Var.e(0, alpha, false);
                        u78VarArr[0].c(canvas);
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
            u78VarArr = this.X0;
            if (!z) {
            }
            iv9Var = this.B1;
            if (iv9Var != null) {
            }
            canvas.save();
            canvas.translate(f5, f6);
            u78 u78Var2 = u78VarArr[0];
            u78Var2.o = 1.0f;
            u78Var2.e(0, alpha, false);
            u78VarArr[0].c(canvas);
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

    public final boolean T0() {
        if (this.d2 == 11) {
            return true;
        }
        int i = this.P4;
        if (i < 0) {
            return false;
        }
        ArrayList arrayList = this.g7;
        if (i >= arrayList.size()) {
            return false;
        }
        o98 o98Var = this.d;
        if (o98Var != null && !o98Var.O()) {
            return true;
        }
        Object obj = arrayList.get(this.P4);
        if (obj instanceof jm6) {
            return ((jm6) obj).j();
        }
        return false;
    }

    public final void T1(x02 x02Var) {
        this.b2 = x02Var;
        a06 a06Var = this.c2;
        if (a06Var != null) {
            a06Var.a();
            this.c2 = null;
        }
        if (x02Var != null) {
            c9c c9cVar = x02Var.j1;
            if (c9cVar == null) {
                c9cVar = new c9c(x02Var.getWindow());
                x02Var.j1 = c9cVar;
            }
            this.c2 = new a06(c9cVar);
        }
    }

    public final boolean U0() {
        return this.e && this.d != null;
    }

    public final void U1() {
        mu1 mu1Var;
        TLRPC.Chat chat;
        o98 o98Var = this.d;
        if (o98Var != null) {
            if (o98Var.u() != null && this.h > 0 && this.d.u().size() >= this.h && !this.d.w(this.P4)) {
                if (!this.n || (mu1Var = this.l4) == null || (chat = mu1Var.e) == null || hc2.N(chat) || !chat.slowmode_enabled) {
                    return;
                }
                ij.K(this.E, k96.M0(2131745118, "Slowmode"), k96.M0(2131745111, "SlowmodeSelectSendError")).o();
                return;
            }
            int D = this.d.D(this.P4, l0());
            boolean w = this.d.w(this.P4);
            this.O0.b(w, true);
            if (D >= 0) {
                s20 s20Var = this.q1;
                if (w) {
                    s20Var.i(D);
                    this.p1.z0(D);
                } else {
                    s20Var.r(D);
                    if (D == 0) {
                        this.q1.g(0);
                    }
                }
            }
            N2();
        }
    }

    public final void V(TLRPC.Document document, TLRPC.Document document2, boolean z, f fVar) {
        this.A7 = document;
        this.z7 = document2;
        this.B7 = z;
        this.C7 = false;
        this.D7 = fVar;
        this.b6 = 0.0f;
        this.f6 = 0.0f;
        if (this.p5 != null) {
            c98 c98Var = this.y5;
            if (c98Var != null) {
                c98Var.m(false, false);
            }
            this.p5.b();
            ArrayList arrayList = this.r5;
            if (arrayList != null) {
                arrayList.clear();
            }
        }
        if (this.A7 != null) {
            ArrayList arrayList2 = this.r5;
            if (arrayList2 == null) {
                this.r5 = new ArrayList();
            } else {
                arrayList2.clear();
            }
            TLRPC.Document document3 = this.A7;
            int i = this.U;
            ArrayList arrayList3 = null;
            if (document3 != null) {
                ArrayList arrayList4 = new ArrayList();
                int size = document3.attributes.size();
                for (int i2 = 0; i2 < size; i2++) {
                    TLRPC.DocumentAttribute documentAttribute = document3.attributes.get(i2);
                    if ((documentAttribute instanceof TLRPC.TL_documentAttributeCustomEmoji) || (documentAttribute instanceof TLRPC.TL_documentAttributeSticker)) {
                        TLRPC.TL_messages_stickerSet n0 = hq6.d0(i).n0(documentAttribute.stickerset, true);
                        if (n0 != null && n0.packs != null) {
                            for (int i3 = 0; i3 < n0.packs.size(); i3++) {
                                TLRPC.TL_stickerPack tL_stickerPack = n0.packs.get(i3);
                                if (tL_stickerPack.documents.contains(Long.valueOf(document3.id)) && vu3.g(tL_stickerPack.emoticon) != null) {
                                    arrayList4.add(tL_stickerPack.emoticon);
                                }
                            }
                        }
                        if (arrayList4.isEmpty()) {
                            if (!TextUtils.isEmpty(documentAttribute.alt) && vu3.g(documentAttribute.alt) != null) {
                                arrayList4.add(documentAttribute.alt);
                            }
                        }
                        arrayList3 = arrayList4;
                        break;
                    }
                }
            }
            if (arrayList3 != null) {
                this.r5.addAll(arrayList3);
            }
        }
        c98 c98Var2 = this.t5;
        if (c98Var2 != null) {
            c98Var2.setCutOutState(false);
        }
        j2(true, false);
        ImageView imageView = this.d1;
        if (imageView != null) {
            imageView.setAlpha(this.B7 ? 0.4f : 1.0f);
        }
    }

    public final void V0() {
        WindowManager.LayoutParams layoutParams = this.e0;
        layoutParams.flags = -2147417856;
        layoutParams.softInputMode = kk7.u4;
        try {
            ((WindowManager) this.E.getSystemService("window")).updateViewLayout(this.h0, this.e0);
        } catch (Exception e) {
            fa4.g(e, true);
        }
        this.h0.setFocusable(true);
        this.f0.setFocusable(true);
    }

    public final void V1() {
        float q = this.C4.q();
        float o = this.C4.o();
        if (q == 0.0f || o == 0.0f) {
            return;
        }
        float i0 = i0(this.u4);
        float g0 = g0();
        float min = Math.min(g0 / o, i0 / q);
        float max = Math.max(i0 / ((int) (q * min)), g0 / ((int) (o * min)));
        this.a6 = max;
        H2(max);
    }

    public final void W() {
        xa8 xa8Var = this.V8;
        if (xa8Var == null || !xa8Var.d()) {
            this.V8 = mb3.c().k(this.d9);
        }
    }

    public final void W0(String str, String str2, Bitmap bitmap, Bitmap bitmap2, float f, boolean z) {
        boolean z2;
        Bitmap.CompressFormat e0 = e0();
        if (bitmap == null) {
            try {
                bitmap = BitmapFactory.decodeFile(str2);
                z2 = true;
            } catch (Throwable th) {
                fa4.g(th, true);
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
        Paint paint = g9;
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
            fa4.g(e, true);
        }
        if (z2) {
            bitmap.recycle();
        }
        createBitmap.recycle();
    }

    public final void W1(CharSequence charSequence) {
        n98 n98Var = this.N;
        this.e4 = (String) charSequence;
        n98Var.c(charSequence);
        s2(true, false);
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
    public final void X0(boolean z) {
        int i;
        File file;
        Uri uri;
        Uri uri2;
        ArrayList arrayList;
        k27 k27Var;
        TLRPC.Document F0;
        TLRPC.MessageMedia messageMedia;
        k27 k27Var2 = this.T4;
        String[] strArr = this.c5;
        if (k27Var2 == null && this.Y4 == null && ((this.j7 == null || strArr[0] == null) && this.d2 != -1)) {
            return;
        }
        this.Q3 = false;
        if (k27Var2 != null) {
            String str = k27Var2.k.attachPath;
            if (str != null && str.length() != 0) {
                file = new File(this.T4.k.attachPath);
            }
            file = null;
            if (file == null) {
                ArrayList arrayList2 = new ArrayList();
                k27 k27Var3 = this.T4;
                TLRPC.Message message = k27Var3.k;
                if (message == null || (messageMedia = message.media) == null || (F0 = messageMedia.document) == null) {
                    F0 = k27Var3.F0();
                } else {
                    arrayList2.addAll(messageMedia.alt_documents);
                }
                if (arrayList2.size() + (F0 != null ? 1 : 0) <= 1) {
                    if (F0 != null) {
                        ba4.G(this.U);
                        file = ba4.J(F0, null, false, true);
                    } else {
                        int size = arrayList2.size();
                        int i2 = this.U;
                        if (size == 1) {
                            ba4.G(i2);
                            file = ba4.J((TLObject) arrayList2.get(0), null, false, true);
                        } else {
                            ba4.G(i2);
                            file = ba4.M(this.T4.k, false, true);
                        }
                    }
                    if (file == null || !file.exists()) {
                        if (F0 != null) {
                            ba4.G(this.U);
                            file = ba4.J(F0, null, true, true);
                        } else if (arrayList2.size() == 1) {
                            ba4.G(this.U);
                            file = ba4.J((TLObject) arrayList2.get(0), null, true, true);
                        } else {
                            file = null;
                        }
                    }
                }
                if (file != null && file.exists()) {
                    arrayList = null;
                } else if (k27.K4(this.T4.k) && ((this.T4.D2(true) || gba.x0) && !cf3.B(k27.B0(this.T4.k)) && this.T4.B())) {
                    int F = ba4.G(this.T4.K1).F(this.T4);
                    arrayList = new ArrayList();
                    arrayList.addAll(lbc.X(this.U, F0, arrayList2, F, true));
                    this.Q3 = true;
                    w(0, false);
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
                    if (this.C5 != 1 && (k27Var = this.T4) != null && !k27Var.x()) {
                        gl.q2(this.T4, this.E, null);
                        return;
                    }
                    k27 k27Var4 = this.T4;
                    s1(arrayList, uri2, true, false, null, k27Var4 == null && k27Var4.D3(), 0L);
                    this.I3 = true;
                }
                if (z) {
                    if (this.T4 != null) {
                        boolean S = ba4.G(this.U).S(strArr[0]);
                        int i3 = this.U;
                        if (S) {
                            ba4.G(i3).f(this.T4.F0());
                        } else {
                            ba4.G(i3).X(this.T4.F0(), this.T4, 1, 0);
                        }
                    } else {
                        TLRPC.BotInlineResult botInlineResult = this.Y4;
                        if (botInlineResult != null) {
                            if (botInlineResult.document != null) {
                                boolean S2 = ba4.G(this.U).S(strArr[0]);
                                int i4 = this.U;
                                if (S2) {
                                    ba4.G(i4).f(this.Y4.document);
                                } else {
                                    ba4.G(i4).X(this.Y4.document, this.T4, 1, 0);
                                }
                            } else if (botInlineResult.content instanceof TLRPC.TL_webDocument) {
                                if (fl5.z().C.containsKey(this.Y4.content.url)) {
                                    fl5.z().c(this.Y4.content.url);
                                } else {
                                    fl5.z().H(this.U, this.Y4.content.url, "mp4");
                                }
                            }
                        } else if (this.j7 != null) {
                            boolean S3 = ba4.G(this.U).S(strArr[0]);
                            int i5 = this.U;
                            if (S3) {
                                ba4.G(i5).f((TLRPC.Document) this.j7.d(this.P4));
                            } else {
                                ba4.G(i5).X((TLRPC.Document) this.j7.d(this.P4), this.j7.g(), 1, 1);
                            }
                        }
                    }
                    Drawable drawable = this.C4.n0;
                    if (drawable instanceof cr7) {
                        ((cr7) drawable).a();
                        return;
                    }
                    return;
                }
                return;
            }
            uri2 = null;
        } else {
            TLRPC.BotInlineResult botInlineResult2 = this.Y4;
            if (botInlineResult2 == null) {
                l98 l98Var = this.j7;
                if (l98Var != null) {
                    TLObject d = l98Var.d(this.P4);
                    if (d instanceof TLRPC.Document) {
                        File b = this.j7.b(this.P4);
                        if (b == null || b.exists()) {
                            uri = null;
                        } else {
                            uri = kb4.j(this.U, this.j7.g(), (TLRPC.Document) d);
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
                        if (this.C5 != 1) {
                        }
                        k27 k27Var42 = this.T4;
                        s1(arrayList, uri2, true, false, null, k27Var42 == null && k27Var42.D3(), 0L);
                        this.I3 = true;
                    }
                    return;
                }
                if (this.d2 == -1) {
                    ArrayList arrayList3 = this.g7;
                    if (!arrayList3.isEmpty() && (i = this.P4) >= 0 && i < arrayList3.size()) {
                        Object obj = arrayList3.get(this.P4);
                        if (obj instanceof jm6) {
                            file = new File(((jm6) obj).I);
                            uri2 = null;
                        }
                    }
                }
                file = null;
                uri2 = null;
            } else if (botInlineResult2.document != null) {
                ba4.G(this.U);
                file = ba4.I(this.Y4.document);
            } else {
                if (botInlineResult2.content instanceof TLRPC.TL_webDocument) {
                    file = new File(ba4.z(4), Utilities.a(this.Y4.content.url) + "." + fl5.x(this.Y4.content.url, "mp4"));
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
        if (this.C5 != 1) {
        }
        k27 k27Var422 = this.T4;
        s1(arrayList, uri2, true, false, null, k27Var422 == null && k27Var422.D3(), 0L);
        this.I3 = true;
    }

    public final void X1(boolean z, boolean z2) {
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
                ofFloat.addUpdateListener(new f68(this, r3));
                ofFloat.addListener(new n88(this, z, r3));
                this.k3 = ofFloat;
                ofFloat.start();
            } else {
                this.i3.setVisibility(z ? (byte) 0 : (byte) 8);
                this.i3.setAlpha(z ? 1.0f : 0.0f);
            }
            if (this.l2 && this.j7 == null) {
                r7 r7Var = this.p0;
                if (z) {
                    r7Var.S(9);
                } else {
                    r7Var.u(9);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:441:0x0a85, code lost:
    
        if (r2 == 2) goto L461;
     */
    /* JADX WARN: Code restructure failed: missing block: B:442:0x0a9b, code lost:
    
        r55 = r0;
        r56 = r3;
        r57 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:604:0x0acd, code lost:
    
        if (r61.o6 != 3) goto L477;
     */
    /* JADX WARN: Code restructure failed: missing block: B:719:0x0a8d, code lost:
    
        if (r8 == (-1)) goto L455;
     */
    /* JADX WARN: Code restructure failed: missing block: B:725:0x0a99, code lost:
    
        if (r8 == r7) goto L461;
     */
    /* JADX WARN: Code restructure failed: missing block: B:746:0x0a04, code lost:
    
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
    /* JADX WARN: Removed duplicated region for block: B:357:0x114d  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x1154  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x11d0  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x10f1  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0818  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x08ca  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x090b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:423:0x0a29  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x0a6b  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x0ca7  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x0ce3  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x0cf7  */
    /* JADX WARN: Removed duplicated region for block: B:461:0x0d25  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x0d32  */
    /* JADX WARN: Removed duplicated region for block: B:518:0x0e8c  */
    /* JADX WARN: Removed duplicated region for block: B:525:0x0ea7  */
    /* JADX WARN: Removed duplicated region for block: B:533:0x0eba  */
    /* JADX WARN: Removed duplicated region for block: B:537:0x0ed4  */
    /* JADX WARN: Removed duplicated region for block: B:547:0x0ef9  */
    /* JADX WARN: Removed duplicated region for block: B:576:0x0f94 A[EDGE_INSN: B:576:0x0f94->B:577:0x0f94 BREAK  A[LOOP:1: B:545:0x0ef4->B:561:0x0f8e], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:585:0x0e80  */
    /* JADX WARN: Removed duplicated region for block: B:587:0x0d12  */
    /* JADX WARN: Removed duplicated region for block: B:590:0x0cce  */
    /* JADX WARN: Removed duplicated region for block: B:617:0x0b1b  */
    /* JADX WARN: Removed duplicated region for block: B:620:0x0b26 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:631:0x0b68  */
    /* JADX WARN: Removed duplicated region for block: B:641:0x0b8d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:660:0x0c25  */
    /* JADX WARN: Removed duplicated region for block: B:663:0x0c35  */
    /* JADX WARN: Removed duplicated region for block: B:666:0x0c4b  */
    /* JADX WARN: Removed duplicated region for block: B:669:0x0c62  */
    /* JADX WARN: Removed duplicated region for block: B:672:0x0c6a  */
    /* JADX WARN: Removed duplicated region for block: B:681:0x0c86  */
    /* JADX WARN: Removed duplicated region for block: B:685:0x0bc9  */
    /* JADX WARN: Removed duplicated region for block: B:694:0x0bf5  */
    /* JADX WARN: Removed duplicated region for block: B:697:0x0bfe  */
    /* JADX WARN: Removed duplicated region for block: B:728:0x0c90  */
    /* JADX WARN: Removed duplicated region for block: B:753:0x0824  */
    /* JADX WARN: Removed duplicated region for block: B:774:0x06d5  */
    /* JADX WARN: Removed duplicated region for block: B:778:0x05ef  */
    /* JADX WARN: Removed duplicated region for block: B:782:0x0676  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Y0(Canvas canvas) {
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
        u78[] u78VarArr;
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
        p88 p88Var;
        mza mzaVar;
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
        ju7 ju7Var;
        zl6 zl6Var;
        boolean z10;
        m88 m88Var;
        byte b6;
        float f60;
        float f61;
        float f62;
        float f63;
        float f64;
        float f65;
        iv9 iv9Var;
        int i24;
        int i25;
        boolean z11;
        int i26;
        int i27;
        ju7 ju7Var2;
        float f66;
        int i28;
        int i29;
        m88 m88Var2;
        if (a()) {
            RenderNode renderNode = this.Q8;
            if (renderNode == null) {
                renderNode = new RenderNode("photo viewer");
                this.Q8 = renderNode;
            }
            renderNode.setPosition(0, 0, canvas.getWidth(), canvas.getHeight() + gl.n);
            canvas2 = this.Q8.beginRecording();
        } else {
            canvas2 = canvas;
        }
        org.telegram.ui.ActionBar.d dVar = this.m4;
        float f67 = 1.0f;
        if (dVar != null && dVar.getFragmentView() != null) {
            if (!this.V6.isFinished() && this.V6.computeScrollOffset()) {
                if (this.V6.getStartX() < this.F6 && this.V6.getStartX() > this.E6) {
                    this.X5 = this.V6.getCurrX();
                }
                if (this.V6.getStartY() < this.H6 && this.V6.getStartY() > this.G6) {
                    this.Y5 = this.V6.getCurrY();
                }
                G0();
                this.f0.invalidate();
            }
            float abs = Math.abs(this.Y5) / (g0() / 2.0f);
            float f68 = this.m6;
            if (f68 != 0.0f) {
                abs = tb4.A(1.0f, abs, f68, abs);
            }
            float i30 = ((1.0f - Utilities.i(abs, 1.0f, 0.0f)) * 0.1f) + 1.0f;
            if (!e66.e(32768)) {
                i30 = 1.0f;
            }
            View fragmentView = this.m4.getFragmentView();
            if (fragmentView.getScaleX() != i30 || fragmentView.getScaleY() != i30) {
                fragmentView.setPivotX(fragmentView.getWidth() / 2.0f);
                fragmentView.setPivotY(fragmentView.getHeight() / 2.0f);
                fragmentView.setScaleX(i30);
                fragmentView.setScaleY(i30);
            }
            x02 x02Var = this.b2;
            if (x02Var != null) {
                ww0 ww0Var = x02Var.c;
                if (ww0Var.getScaleX() != i30 || ww0Var.getScaleY() != i30) {
                    ww0Var.setPivotX(ww0Var.getWidth() / 2.0f);
                    ww0Var.setPivotY(ww0Var.getHeight() / 2.0f);
                    ww0Var.setScaleX(i30);
                    ww0Var.setScaleY(i30);
                }
            }
            byte b7 = this.n4;
            if (b7 == 1 || b7 == 2 || b7 == 3 || this.B3) {
                this.f0.invalidate();
            }
        }
        byte b8 = this.n4;
        if (b8 == 1) {
            if (this.u2) {
                canvas.save();
                canvas.translate((s0() / 2.0f) - (w0() / 2.0f), 0.0f);
            }
            if (this.i0 != null) {
                canvas.save();
                de9.n(canvas.getHeight(), 2.0f, this.i0.getCenterY(), this.i0.getCenterX() - (canvas.getWidth() / 2.0f), canvas);
                float animationProgress = this.i0.getAnimationProgress();
                f67 = this.n4 == 1 ? animationProgress : 1.0f - animationProgress;
                canvas.scale(f67, f67, canvas.getWidth() / 2.0f, canvas.getHeight() / 2.0f);
            }
            T(0.0f, 1.0f, 0.0f, f67, canvas);
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
                this.Q8.endRecording();
            } else {
                canvas7 = canvas2;
            }
            S(canvas7);
            return;
        }
        if (b8 == 3 || !(this.e || b8 == 2 || this.B3)) {
            if (a()) {
                this.Q8.endRecording();
                canvas.drawRenderNode(this.Q8);
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
        AnimatorSet animatorSet = this.p6;
        ArrayList arrayList4 = this.g7;
        if (animatorSet != null) {
            if (!this.V6.isFinished()) {
                this.V6.abortAnimation();
            }
            float f69 = this.a6;
            f = 2.0f;
            float f70 = this.e6;
            float f71 = this.l6;
            float f72 = ((f70 - f69) * f71) + f69;
            float f73 = this.b6;
            float A = tb4.A(this.f6, f73, f71, f73);
            float f74 = this.X5;
            float A2 = tb4.A(this.c6, f74, f71, f74);
            float f75 = this.Y5;
            float A3 = tb4.A(this.d6, f75, f71, f75);
            float A4 = tb4.A(this.g6, 0.0f, f71, 0.0f);
            f6 = (f70 == 1.0f && f69 == 1.0f && f74 == 0.0f) ? A3 : -1.0f;
            H2(f72);
            this.f0.invalidate();
            f4 = A2;
            f7 = A4;
            f5 = f72;
            f3 = A;
            f2 = A3;
        } else {
            f = 2.0f;
            if (this.n6 != 0) {
                this.X5 = this.c6;
                this.Y5 = this.d6;
                float f76 = this.e6;
                this.a6 = f76;
                this.b6 = this.f6;
                this.n6 = 0L;
                H2(f76);
                this.R6 = false;
            }
            if (!this.V6.isFinished() && this.V6.computeScrollOffset()) {
                if (this.V6.getStartX() < this.F6 && this.V6.getStartX() > this.E6) {
                    this.X5 = this.V6.getCurrX();
                }
                if (this.V6.getStartY() < this.H6 && this.V6.getStartY() > this.G6) {
                    this.Y5 = this.V6.getCurrY();
                }
                G0();
                this.f0.invalidate();
            }
            if (this.T6 != 0) {
                this.m2 = false;
                if (!arrayList4.isEmpty() && (i = this.P4) >= 0 && i < arrayList4.size()) {
                    Object obj = arrayList4.get(this.P4);
                    if (obj instanceof bm6) {
                        ((bm6) obj).s = l0();
                    }
                }
                byte b9 = this.T6;
                byte b10 = 1;
                if (b9 == 1) {
                    b = 0;
                    gl.d3(new l68(this, b));
                } else {
                    b = 0;
                    if (b9 == 2) {
                        gl.d3(new l68(this, b10));
                    }
                }
                this.T6 = b;
            }
            float f77 = this.a6;
            float f78 = this.b6;
            f2 = this.Y5;
            float f79 = this.X5;
            if (this.L6) {
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
        float f80 = f2 + this.Z5;
        if (this.u4 == 3) {
            f80 += this.M1.d2 / f;
        }
        float f81 = f80;
        x88 x88Var = this.g0;
        if (x88Var != null) {
            x88Var.setTranslationY(f81);
        }
        boolean z12 = this.K;
        ImageView[] imageViewArr2 = this.y3;
        if (z12) {
            boolean z13 = this.z3;
            if (f5 <= 1.0001f) {
                if (!z13 && imageViewArr2[0].getTag() == null) {
                    imageViewArr2[0].animate().alpha(1.0f).setDuration(120L).setListener(new e88(this, (byte) 8)).start();
                    imageViewArr2[0].setTag(1);
                    this.z3 = true;
                }
            } else if (z13) {
                imageViewArr2[0].animate().alpha(0.0f).setDuration(120L).setListener(new e88(this, (byte) 9)).start();
                imageViewArr2[0].setTag(1);
                this.z3 = false;
            }
        }
        int h0 = h0();
        int g0 = g0();
        if (this.I3 && (m88Var2 = this.z2) != null && m88Var2.getVisibility() == 0) {
            g0 = A0();
        }
        int i31 = g0;
        byte b11 = this.n4;
        if (b11 != 2 && b11 != 4 && !this.B3 && !this.J3) {
            byte b12 = this.u4;
            BackgroundDrawable backgroundDrawable = this.M0;
            if (b12 != 0 || (i29 = this.d2) == 1 || i29 == 11 || this.a6 != 1.0f || f6 == -1.0f || this.R6) {
                backgroundDrawable.setAlpha(kk7.d4);
            } else {
                float f82 = h0 / 4.0f;
                backgroundDrawable.setAlpha((int) Math.max(127.0f, (1.0f - (Math.min(Math.abs(f6), f82) / f82)) * 255.0f));
            }
        } else if (b11 == 4) {
            canvas2.drawColor(-16777216);
        }
        this.r1 = null;
        if (this.u4 == 0 && (i28 = this.d2) != 1 && i28 != 11) {
            if (this.a6 >= 1.0f && !this.R6 && !this.K6) {
                if (f4 > this.F6 + gl.L(5.0f)) {
                    this.r1 = this.B4;
                } else if (f4 < this.E6 - gl.L(5.0f)) {
                    this.r1 = this.D4;
                } else {
                    this.m1.setMoveProgress(0.0f);
                }
            }
            this.J6 = this.r1 != null;
        }
        for (int i32 = 0; i32 < 3; i32++) {
            if (i32 != 1) {
                if (i32 == 2) {
                    f66 = (f4 - this.F6) + ((-this.f0.getMeasuredWidth()) - gl.L(15.0f));
                } else {
                    float f83 = this.E6;
                    if (f4 < f83) {
                        f66 = f4 - f83;
                    }
                }
                imageViewArr2[i32].setTranslationX((f66 + this.f0.getMeasuredWidth()) - gl.L(48.0f));
            }
            f66 = 0.0f;
            imageViewArr2[i32].setTranslationX((f66 + this.f0.getMeasuredWidth()) - gl.L(48.0f));
        }
        ImageReceiver imageReceiver2 = this.r1;
        ImageReceiver imageReceiver3 = this.D4;
        u78[] u78VarArr2 = this.X0;
        if (imageReceiver2 == imageReceiver3) {
            if (!this.R6) {
                float f84 = this.E6;
                if (f4 < f84) {
                    float min = Math.min(1.0f, (f84 - f4) / h0);
                    f60 = (-h0) - (gl.L(30.0f) / 2);
                    f62 = (1.0f - min) * 0.3f;
                    f61 = min;
                    if (this.r1.B()) {
                        f63 = f61;
                        i2 = i31;
                        u78VarArr = u78VarArr2;
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
                        canvas2.translate((gl.L(30.0f) / 2) + h0 + f60, 0.0f);
                        float f86 = 1.0f - f62;
                        canvas2.scale(f86, f86);
                        int q2 = this.r1.q();
                        int o2 = this.r1.o();
                        if (this.K4) {
                            float f87 = f60;
                            i24 = o2;
                            canvas3 = canvas2;
                            f65 = f87;
                            u78VarArr = u78VarArr2;
                            j = j4;
                            f10 = f7;
                            f63 = f85;
                            i25 = q2;
                        } else {
                            long j5 = j4;
                            zl6 zl6Var2 = this.I1;
                            if (zl6Var2 != null) {
                                c33 c33Var = this.G1;
                                if (c33Var.a) {
                                    imageViewArr = imageViewArr2;
                                    f63 = f85;
                                    float f88 = f60;
                                    i24 = o2;
                                    canvas3 = canvas2;
                                    f65 = f88;
                                    u78VarArr = u78VarArr2;
                                    f10 = f7;
                                    i25 = q2;
                                    j = j5;
                                    j2 = 0;
                                    d(canvas3, h0, i31, i25, i24, 1.0f, c33Var, zl6Var2);
                                    float f89 = i25;
                                    float f90 = i24;
                                    float min2 = Math.min(h0 / f89, i31 / f90);
                                    int i33 = (int) (f89 * min2);
                                    int i34 = (int) (f90 * min2);
                                    if (arrayList4.isEmpty()) {
                                        i2 = i31;
                                        if (this.u4 == 1 || this.d2 == 1) {
                                            z11 = this.G1.h;
                                        } else {
                                            zl6 zl6Var3 = this.I1;
                                            if (zl6Var3 != null && zl6Var3.l) {
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
                                        ju7Var2 = this.A4;
                                        if (ju7Var2 != null && ju7Var2.getVisibility() == 0) {
                                            canvas3.clipRect(i26, i27, i33 / 2, i34 / 2);
                                            if (this.A4.getMeasuredWidth() == i25 || this.A4.getMeasuredHeight() != i24) {
                                                this.A4.measure(View.MeasureSpec.makeMeasureSpec(i25, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i24, TLObject.FLAG_30));
                                                this.A4.layout(0, 0, i25, i24);
                                            }
                                            canvas3.scale(min2, min2);
                                            canvas3.translate((-i25) / 2, (-i24) / 2);
                                            this.A4.setAlpha(1.0f);
                                            this.A4.draw(canvas3);
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
                                    ju7Var2 = this.A4;
                                    if (ju7Var2 != null) {
                                        canvas3.clipRect(i26, i27, i33 / 2, i34 / 2);
                                        if (this.A4.getMeasuredWidth() == i25) {
                                        }
                                        this.A4.measure(View.MeasureSpec.makeMeasureSpec(i25, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i24, TLObject.FLAG_30));
                                        this.A4.layout(0, 0, i25, i24);
                                        canvas3.scale(min2, min2);
                                        canvas3.translate((-i25) / 2, (-i24) / 2);
                                        this.A4.setAlpha(1.0f);
                                        this.A4.draw(canvas3);
                                    }
                                    canvas3.restore();
                                }
                            }
                            float f91 = f60;
                            i24 = o2;
                            canvas3 = canvas2;
                            f65 = f91;
                            u78VarArr = u78VarArr2;
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
                        ju7Var2 = this.A4;
                        if (ju7Var2 != null) {
                        }
                        canvas3.restore();
                    }
                    this.m1.setMoveProgress(-f63);
                    iv9Var = this.B1;
                    if (iv9Var == null && iv9Var.a()) {
                        f12 = f64;
                    } else {
                        canvas3.save();
                        canvas3.translate(f65, f64 / f5);
                        f12 = f64;
                        canvas3.translate((((this.a6 + 1.0f) * h0) + gl.L(30.0f)) / f, (-f12) / f5);
                        u78 u78Var = u78VarArr[1];
                        u78Var.o = 1.0f - f62;
                        u78Var.e(0, f63, false);
                        u78VarArr[1].c(canvas3);
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
            iv9Var = this.B1;
            if (iv9Var == null) {
            }
            canvas3.save();
            canvas3.translate(f65, f64 / f5);
            f12 = f64;
            canvas3.translate((((this.a6 + 1.0f) * h0) + gl.L(30.0f)) / f, (-f12) / f5);
            u78 u78Var2 = u78VarArr[1];
            u78Var2.o = 1.0f - f62;
            u78Var2.e(0, f63, false);
            u78VarArr[1].c(canvas3);
            if (this.K) {
            }
            canvas3.restore();
        } else {
            i2 = i31;
            u78VarArr = u78VarArr2;
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
        if (!this.R6) {
            float f92 = this.F6;
            if (f11 > f92 && (((b6 = this.u4) == 0 || b6 == 4) && this.d2 != 1)) {
                float min3 = Math.min(1.0f, (f11 - f92) / h0);
                f15 = min3 * 0.3f;
                f14 = 1.0f - min3;
                f13 = this.F6;
                z = (this.I3 || (m88Var = this.z2) == null || m88Var.getVisibility() != 0) ? false : true;
                if (this.J4 || this.G2 == null || this.d2 == 11) {
                    z2 = z;
                    z3 = false;
                    f16 = 1.0f;
                } else if (T0()) {
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
                    this.a9 = false;
                }
                this.L4 = false;
                matrix = this.M4;
                matrix.reset();
                p88Var = this.O1;
                if (p88Var != null && !this.P1 && p88Var.getRenderView() != null) {
                    f14 = this.O1.getRenderView().getAlpha() <= 0.99f ? 0.0f : 1.0f;
                }
                if (!this.C4.B() || (z2 && this.H3)) {
                    mzaVar = this.p5;
                    if (mzaVar == null && mzaVar.j0) {
                        try {
                            arrayList2 = arrayList;
                            try {
                                z8 = ((jm6) arrayList2.get(this.P4)).w;
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
                                canvas3.translate(f93 + Z(this.u4), f94 + a0(this.u4));
                                matrix.preTranslate(f93 + Z(this.u4), f94 + a0(this.u4));
                                float f95 = f12 + 0.0f;
                                canvas3.translate(f13, f95);
                                matrix.preTranslate(f13, f95);
                                f22 = f5 - f15;
                                canvas3.scale(f22, f22);
                                matrix.preScale(f22, f22);
                                canvas3.rotate(f18);
                                matrix.preRotate(f18);
                                if (this.u4 == 3) {
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
                                q = this.C4.q();
                                o = this.C4.o();
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
                                b2 = this.u4;
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
                                if (this.y4.getVisibility() == 0) {
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
                                T(f43, f42, f12, f14, canvas6);
                                float f102 = f42;
                                float f103 = f12;
                                float f104 = f14;
                                Canvas canvas8 = canvas6;
                                imageReceiver = this.r1;
                                if (imageReceiver == this.B4) {
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
                                S(canvas8);
                            }
                        } catch (Exception unused2) {
                            arrayList2 = arrayList;
                        }
                        if (z8) {
                            int L = h0 - gl.L(20.0f);
                            this.p5.k0.reset();
                            this.p5.k0.postTranslate(-0.5f, -0.5f);
                            float f105 = L;
                            this.p5.k0.postScale(f105, f105);
                            float f106 = 1.0f / f5;
                            this.p5.k0.postScale(f106, f106);
                            f19 = f11;
                            f17 = 20.0f;
                            this.p5.k0.postTranslate((-f19) / f5, (-f12) / f5);
                            f18 = f8;
                            this.p5.k0.postRotate(-f18);
                            this.p5.n();
                        } else {
                            this.p5.getClass();
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
                    canvas3.translate(f932 + Z(this.u4), f942 + a0(this.u4));
                    matrix.preTranslate(f932 + Z(this.u4), f942 + a0(this.u4));
                    float f952 = f12 + 0.0f;
                    canvas3.translate(f13, f952);
                    matrix.preTranslate(f13, f952);
                    f22 = f5 - f15;
                    canvas3.scale(f22, f22);
                    matrix.preScale(f22, f22);
                    canvas3.rotate(f18);
                    matrix.preRotate(f18);
                    if (this.u4 == 3 || this.M1 == null) {
                        f23 = f13;
                    } else {
                        int f0 = f0(0, true);
                        q88 q88Var = this.M1;
                        int i41 = gl.q.y;
                        Typeface typeface = gl.a;
                        gl.L(f17);
                        this.M1.getClass();
                        float f02 = (((f0 - q88Var.d2) - f0(0, false)) / f) * 1.0f;
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
                        Bitmap bitmap = this.O4;
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
                            this.C4.setAlpha(f14);
                            int q3 = this.C4.q();
                            int o3 = this.C4.o();
                            float j0 = (this.s1 && this.u4 == 0 && this.d2 == 1) ? j0(false) : Math.min(f32 / q3, f25 / o3);
                            this.C4.i0((-r0) / 2, (-r2) / 2, (int) (q3 * j0), (int) (o3 * j0));
                            if (this.s1) {
                                if (this.J4) {
                                    z7 = T0() ? true : true;
                                }
                                this.C4.g(canvas4);
                                this.L4 = z7;
                            }
                            z4 = true;
                            if (!z2 && this.H3 && this.I3) {
                                View view = this.E2 ? this.D2 : this.C2;
                                q = view.getMeasuredWidth();
                                o = view.getMeasuredHeight();
                            } else {
                                q = this.C4.q();
                                o = this.C4.o();
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
                                byte b13 = this.u4;
                                f34 = f24;
                                i5 = q;
                                if (b13 == 3 || (i19 = this.o6) == 3) {
                                    i6 = i352;
                                } else {
                                    i6 = i352;
                                    if (this.d2 != 1) {
                                        int i42 = this.p6 != null ? -1 : -1;
                                        if (b13 != 0) {
                                            if (b13 != 4) {
                                                if (b13 != 1) {
                                                }
                                            }
                                        }
                                    } else if (i19 != 0) {
                                    }
                                }
                                c33 c33Var2 = this.E1;
                                int i43 = c33Var2.i;
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
                                    float f107 = c33Var2.j;
                                    i3 = i372;
                                    float f108 = c33Var2.k;
                                    f49 = i13;
                                    i4 = i362;
                                    f50 = f30 - f48;
                                    int z14 = (int) yjb.z(f30 - f107, f50, f107, f49);
                                    f51 = i12;
                                    i14 = (int) ((((f30 - f108) * f50) + f108) * f51);
                                    f33 = f29;
                                    float f109 = z14;
                                    f52 = f32 / f109;
                                    f53 = i14;
                                    if (f52 * f53 > f25) {
                                        f52 = f25 / f53;
                                    }
                                    h98 h98Var = this.X4;
                                    if (i44 != 1 || ((b13 == 1 && this.o6 != 0) || h98Var.c == null)) {
                                        i15 = i14;
                                    } else {
                                        float f110 = f109 * f52;
                                        float f111 = f53 * f52;
                                        float f112 = f972 * f982 > f25 ? f47 : f972;
                                        float f113 = f112;
                                        float f114 = (f46 * f112) / f31;
                                        float f115 = f982 * f113;
                                        i15 = i14;
                                        float A5 = tb4.A(f114, f110, f50, f110);
                                        float A6 = tb4.A(f115 / f31, f111, f50, f111);
                                        canvas4.clipRect((-A5) / f28, (-A6) / f28, A5 / f28, A6 / f28);
                                    }
                                    i16 = this.d2;
                                    if (i16 != 1 || c33Var2.a) {
                                        if (this.u4 != 1 || i16 == 1) {
                                            textureView = this.C2;
                                            if (textureView != null) {
                                                textureView.setScaleX(c33Var2.h ? -1.0f : 1.0f);
                                                j98 j98Var = this.F2;
                                                if (j98Var != null) {
                                                    j98Var.setScaleX(this.C2.getScaleX());
                                                }
                                            }
                                            float A7 = c33Var2.f / tb4.A(c33Var2.l, 1.0f, f50, 1.0f);
                                            f54 = f32 / f49;
                                            if (f54 * f51 > f25) {
                                                f54 = f25 / f51;
                                            }
                                            float f116 = (f54 / min42) * A7;
                                            if (this.d2 == 1) {
                                                if (this.u4 == 3 || (i17 = this.o6) == 3) {
                                                    f56 = ((c33Var2.m - 1.0f) * f50) + 1.0f;
                                                } else if (i17 == 0) {
                                                    f56 = c33Var2.m;
                                                }
                                                f116 /= f56;
                                            }
                                            f55 = f116;
                                        } else {
                                            TextureView textureView2 = this.C2;
                                            if (textureView2 != null) {
                                                zl6 zl6Var4 = h98Var.c;
                                                textureView2.setScaleX((zl6Var4 == null || !zl6Var4.l) ? 1.0f : -1.0f);
                                                j98 j98Var2 = this.F2;
                                                if (j98Var2 != null) {
                                                    j98Var2.setScaleX(this.C2.getScaleX());
                                                }
                                            }
                                            zl6 zl6Var5 = h98Var.c;
                                            float f117 = zl6Var5 != null ? zl6Var5.c : 1.0f;
                                            f55 = ((f52 / min42) / tb4.A(f117, 1.0f, f50, 1.0f)) * f117;
                                        }
                                        canvas4.translate(c33Var2.d * f48, c33Var2.e * f48);
                                        if (!this.L4) {
                                            matrix.preTranslate(c33Var2.d * f48, c33Var2.e * f48);
                                        }
                                        canvas4.scale(f55, f55);
                                        if (!this.L4) {
                                            matrix.preScale(f55, f55);
                                        }
                                        canvas4.translate(yjb.C(c33Var2.b, f49, min42, f48), yjb.C(c33Var2.c, f51, min42, f48));
                                        if (!this.L4) {
                                            matrix.preTranslate(yjb.C(c33Var2.b, f49, min42, f48), yjb.C(c33Var2.c, f51, min42, f48));
                                        }
                                        f57 = c33Var2.g + i43;
                                        if (f57 > 180.0f) {
                                            f57 -= 360.0f;
                                        }
                                        if (this.d2 == 1 || !(this.u4 == 3 || this.o6 == 3)) {
                                            float f118 = f57 * f48;
                                            canvas4.rotate(f118);
                                            if (!this.L4) {
                                                matrix.preRotate(f118);
                                            }
                                        } else {
                                            canvas4.rotate(f57);
                                            if (!this.L4) {
                                                matrix.preRotate(f57);
                                            }
                                        }
                                    } else {
                                        TextureView textureView3 = this.C2;
                                        if (textureView3 != null) {
                                            float f119 = f30;
                                            textureView3.setScaleX(f119);
                                            this.C2.setScaleY(f119);
                                            j98 j98Var3 = this.F2;
                                            if (j98Var3 != null) {
                                                j98Var3.setScaleX(f119);
                                                this.F2.setScaleY(f119);
                                            }
                                        }
                                    }
                                    f35 = f52;
                                    i7 = z14;
                                    i8 = i15;
                                    b2 = this.u4;
                                    if (b2 == 3) {
                                        q88 q88Var2 = this.M1;
                                        q88Var2.x0(f5, f26, (q88Var2.getRenderView().getScaleX() * (this.d2 == 1 ? gl.m / f28 : 0.0f)) + f34, i7 * f35, i8 * f35);
                                    } else if (b2 == 4) {
                                        this.O1.b(f5, f26, f34, f27, i7 * f35, i8 * f35);
                                    }
                                    f36 = f26;
                                    if (z5 || this.E2) {
                                        f37 = f33;
                                    } else {
                                        f37 = f33;
                                        R(canvas4, f37, f14);
                                    }
                                    canvas4.save();
                                    if (f37 > 0.0f) {
                                        canvas4.save();
                                        canvas4.scale(1.0f - (f37 * f28), 1.0f);
                                        canvas4.skew(0.0f, tb4.z(1.0f, f37, f37 * 4.0f, 0.25f));
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    int i392 = i4;
                                    float f1002 = (-i392) / 2;
                                    int i402 = i3;
                                    float f1012 = (-i402) / 2;
                                    canvas4.translate(f1002, f1012);
                                    if (!z2 || this.y4.getVisibility() == 0) {
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
                                        if (textureView5 instanceof kac) {
                                            ((kac) textureView5).a(((h0 - i392) / f28) + Z(this.u4) + f23, ((i6 - i402) / f28) + a0(this.u4) + f34 + 0.0f, i392, i402);
                                        }
                                        SurfaceView surfaceView = this.D2;
                                        if (surfaceView != null && this.v3 == 0 && !this.F3 && !this.L3 && !this.B3 && surfaceView.getVisibility() != 0) {
                                            this.D2.setVisibility(0);
                                        }
                                        J2(f932 + Z(this.u4) + f23, f942 + a0(this.u4) + f34 + 0.0f, i392 * f31, i402 * f31);
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
                                                G0();
                                                if (this.N3 > 1.0f) {
                                                    this.N3 = 1.0f;
                                                }
                                                this.y4.setAlpha(f39);
                                            }
                                        }
                                        j3 = j;
                                        this.y4.setAlpha(f39);
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
                                        if (z2 || this.y4.getVisibility() == 0) {
                                            canvas5.scale(f40, f40);
                                        }
                                    }
                                    if (this.y4.getVisibility() == 0 && (this.s1 || this.u4 != b3 || this.o6 != -1)) {
                                        if (this.d2 != 11) {
                                            canvas5.clipRect(0, 0, this.y4.getMeasuredWidth(), this.y4.getMeasuredHeight());
                                        }
                                        this.y4.draw(canvas5);
                                    }
                                    canvas5.restore();
                                    if (z5 && this.E2) {
                                        f44 = this.N3;
                                        if (f44 == 1.0f || f16 < 1.0f) {
                                            R(canvas5, f38, Math.max(1.0f - f44, 1.0f - f16) * f39);
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
                                        boolean z15 = zArr[i10];
                                        float[] fArr = this.y1;
                                        if (z15 || fArr[i10] != 0.0f) {
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
                                if (this.p6 == null || (i18 = this.o6) == -1) {
                                    if (b13 == 2 || b13 == 3) {
                                        f48 = 0.0f;
                                        float f1072 = c33Var2.j;
                                        i3 = i372;
                                        float f1082 = c33Var2.k;
                                        f49 = i13;
                                        i4 = i362;
                                        f50 = f30 - f48;
                                        int z142 = (int) yjb.z(f30 - f1072, f50, f1072, f49);
                                        f51 = i12;
                                        i14 = (int) ((((f30 - f1082) * f50) + f1082) * f51);
                                        f33 = f29;
                                        float f1092 = z142;
                                        f52 = f32 / f1092;
                                        f53 = i14;
                                        if (f52 * f53 > f25) {
                                        }
                                        h98 h98Var2 = this.X4;
                                        if (i44 != 1) {
                                        }
                                        i15 = i14;
                                        i16 = this.d2;
                                        if (i16 != 1) {
                                        }
                                        if (this.u4 != 1) {
                                        }
                                        textureView = this.C2;
                                        if (textureView != null) {
                                        }
                                        float A72 = c33Var2.f / tb4.A(c33Var2.l, 1.0f, f50, 1.0f);
                                        f54 = f32 / f49;
                                        if (f54 * f51 > f25) {
                                        }
                                        float f1162 = (f54 / min42) * A72;
                                        if (this.d2 == 1) {
                                        }
                                        f55 = f1162;
                                        canvas4.translate(c33Var2.d * f48, c33Var2.e * f48);
                                        if (!this.L4) {
                                        }
                                        canvas4.scale(f55, f55);
                                        if (!this.L4) {
                                        }
                                        canvas4.translate(yjb.C(c33Var2.b, f49, min42, f48), yjb.C(c33Var2.c, f51, min42, f48));
                                        if (!this.L4) {
                                        }
                                        f57 = c33Var2.g + i43;
                                        if (f57 > 180.0f) {
                                        }
                                        if (this.d2 == 1) {
                                        }
                                        float f1182 = f57 * f48;
                                        canvas4.rotate(f1182);
                                        if (!this.L4) {
                                        }
                                        f35 = f52;
                                        i7 = z142;
                                        i8 = i15;
                                        b2 = this.u4;
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
                                        if (this.y4.getVisibility() == 0) {
                                            if (this.d2 != 11) {
                                            }
                                            this.y4.draw(canvas5);
                                        }
                                        canvas5.restore();
                                        if (z5) {
                                            f44 = this.N3;
                                            if (f44 == 1.0f) {
                                            }
                                            R(canvas5, f38, Math.max(1.0f - f44, 1.0f - f16) * f39);
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
                                    float f10722 = c33Var2.j;
                                    i3 = i372;
                                    float f10822 = c33Var2.k;
                                    f49 = i13;
                                    i4 = i362;
                                    f50 = f30 - f48;
                                    int z1422 = (int) yjb.z(f30 - f10722, f50, f10722, f49);
                                    f51 = i12;
                                    i14 = (int) ((((f30 - f10822) * f50) + f10822) * f51);
                                    f33 = f29;
                                    float f10922 = z1422;
                                    f52 = f32 / f10922;
                                    f53 = i14;
                                    if (f52 * f53 > f25) {
                                    }
                                    h98 h98Var22 = this.X4;
                                    if (i44 != 1) {
                                    }
                                    i15 = i14;
                                    i16 = this.d2;
                                    if (i16 != 1) {
                                    }
                                    if (this.u4 != 1) {
                                    }
                                    textureView = this.C2;
                                    if (textureView != null) {
                                    }
                                    float A722 = c33Var2.f / tb4.A(c33Var2.l, 1.0f, f50, 1.0f);
                                    f54 = f32 / f49;
                                    if (f54 * f51 > f25) {
                                    }
                                    float f11622 = (f54 / min42) * A722;
                                    if (this.d2 == 1) {
                                    }
                                    f55 = f11622;
                                    canvas4.translate(c33Var2.d * f48, c33Var2.e * f48);
                                    if (!this.L4) {
                                    }
                                    canvas4.scale(f55, f55);
                                    if (!this.L4) {
                                    }
                                    canvas4.translate(yjb.C(c33Var2.b, f49, min42, f48), yjb.C(c33Var2.c, f51, min42, f48));
                                    if (!this.L4) {
                                    }
                                    f57 = c33Var2.g + i43;
                                    if (f57 > 180.0f) {
                                    }
                                    if (this.d2 == 1) {
                                    }
                                    float f11822 = f57 * f48;
                                    canvas4.rotate(f11822);
                                    if (!this.L4) {
                                    }
                                    f35 = f52;
                                    i7 = z1422;
                                    i8 = i15;
                                    b2 = this.u4;
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
                                    if (this.y4.getVisibility() == 0) {
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
                                        f48 = this.l6;
                                        if (i18 != 0) {
                                            f48 = f30 - f48;
                                        }
                                        float f107222 = c33Var2.j;
                                        i3 = i372;
                                        float f108222 = c33Var2.k;
                                        f49 = i13;
                                        i4 = i362;
                                        f50 = f30 - f48;
                                        int z14222 = (int) yjb.z(f30 - f107222, f50, f107222, f49);
                                        f51 = i12;
                                        i14 = (int) ((((f30 - f108222) * f50) + f108222) * f51);
                                        f33 = f29;
                                        float f109222 = z14222;
                                        f52 = f32 / f109222;
                                        f53 = i14;
                                        if (f52 * f53 > f25) {
                                        }
                                        h98 h98Var222 = this.X4;
                                        if (i44 != 1) {
                                        }
                                        i15 = i14;
                                        i16 = this.d2;
                                        if (i16 != 1) {
                                        }
                                        if (this.u4 != 1) {
                                        }
                                        textureView = this.C2;
                                        if (textureView != null) {
                                        }
                                        float A7222 = c33Var2.f / tb4.A(c33Var2.l, 1.0f, f50, 1.0f);
                                        f54 = f32 / f49;
                                        if (f54 * f51 > f25) {
                                        }
                                        float f116222 = (f54 / min42) * A7222;
                                        if (this.d2 == 1) {
                                        }
                                        f55 = f116222;
                                        canvas4.translate(c33Var2.d * f48, c33Var2.e * f48);
                                        if (!this.L4) {
                                        }
                                        canvas4.scale(f55, f55);
                                        if (!this.L4) {
                                        }
                                        canvas4.translate(yjb.C(c33Var2.b, f49, min42, f48), yjb.C(c33Var2.c, f51, min42, f48));
                                        if (!this.L4) {
                                        }
                                        f57 = c33Var2.g + i43;
                                        if (f57 > 180.0f) {
                                        }
                                        if (this.d2 == 1) {
                                        }
                                        float f118222 = f57 * f48;
                                        canvas4.rotate(f118222);
                                        if (!this.L4) {
                                        }
                                        f35 = f52;
                                        i7 = z14222;
                                        i8 = i15;
                                        b2 = this.u4;
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
                                        if (this.y4.getVisibility() == 0) {
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
                                    float f1072222 = c33Var2.j;
                                    i3 = i372;
                                    float f1082222 = c33Var2.k;
                                    f49 = i13;
                                    i4 = i362;
                                    f50 = f30 - f48;
                                    int z142222 = (int) yjb.z(f30 - f1072222, f50, f1072222, f49);
                                    f51 = i12;
                                    i14 = (int) ((((f30 - f1082222) * f50) + f1082222) * f51);
                                    f33 = f29;
                                    float f1092222 = z142222;
                                    f52 = f32 / f1092222;
                                    f53 = i14;
                                    if (f52 * f53 > f25) {
                                    }
                                    h98 h98Var2222 = this.X4;
                                    if (i44 != 1) {
                                    }
                                    i15 = i14;
                                    i16 = this.d2;
                                    if (i16 != 1) {
                                    }
                                    if (this.u4 != 1) {
                                    }
                                    textureView = this.C2;
                                    if (textureView != null) {
                                    }
                                    float A72222 = c33Var2.f / tb4.A(c33Var2.l, 1.0f, f50, 1.0f);
                                    f54 = f32 / f49;
                                    if (f54 * f51 > f25) {
                                    }
                                    float f1162222 = (f54 / min42) * A72222;
                                    if (this.d2 == 1) {
                                    }
                                    f55 = f1162222;
                                    canvas4.translate(c33Var2.d * f48, c33Var2.e * f48);
                                    if (!this.L4) {
                                    }
                                    canvas4.scale(f55, f55);
                                    if (!this.L4) {
                                    }
                                    canvas4.translate(yjb.C(c33Var2.b, f49, min42, f48), yjb.C(c33Var2.c, f51, min42, f48));
                                    if (!this.L4) {
                                    }
                                    f57 = c33Var2.g + i43;
                                    if (f57 > 180.0f) {
                                    }
                                    if (this.d2 == 1) {
                                    }
                                    float f1182222 = f57 * f48;
                                    canvas4.rotate(f1182222);
                                    if (!this.L4) {
                                    }
                                    f35 = f52;
                                    i7 = z142222;
                                    i8 = i15;
                                    b2 = this.u4;
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
                                    if (this.y4.getVisibility() == 0) {
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
                            b2 = this.u4;
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
                            if (this.y4.getVisibility() == 0) {
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
                            int i46 = (-this.O4.getHeight()) / 2;
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
                            canvas4.drawBitmap(this.O4, i20, i46, this.N4);
                            if (f14 < 1.0f) {
                                canvas4.restore();
                            }
                        }
                    }
                    z4 = z3;
                    if (!z2) {
                    }
                    q = this.C4.q();
                    o = this.C4.o();
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
                    b2 = this.u4;
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
                    if (this.y4.getVisibility() == 0) {
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
                T(f43, f42, f12, f14, canvas6);
                float f1022 = f42;
                float f1032 = f12;
                float f1042 = f14;
                Canvas canvas82 = canvas6;
                imageReceiver = this.r1;
                if (imageReceiver == this.B4) {
                    if (imageReceiver.B()) {
                        canvas82.save();
                        canvas82.translate(i11 / 2, i2 / 2);
                        float f126 = i11;
                        canvas82.translate(((-(((this.a6 + f41) * f126) + gl.L(30.0f))) / f28) + f36, 0.0f);
                        int q4 = this.r1.q();
                        int o4 = this.r1.o();
                        if (!this.H4 && (zl6Var = this.H1) != null) {
                            c33 c33Var3 = this.F1;
                            if (c33Var3.a) {
                                i22 = i11;
                                i23 = i2;
                                d(canvas82, i22, i23, q4, o4, f1022, c33Var3, zl6Var);
                                float f127 = q4;
                                float f128 = o4;
                                float min5 = Math.min(f126 / f127, i23 / f128);
                                int i47 = (int) (f127 * min5);
                                int i48 = (int) (f128 * min5);
                                if (!arrayList3.isEmpty()) {
                                    if (this.u4 == 1 || this.d2 == 1) {
                                        z9 = this.F1.h;
                                    } else {
                                        zl6 zl6Var6 = this.H1;
                                        if (zl6Var6 != null && zl6Var6.l) {
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
                                    ju7Var = this.z4;
                                    if (ju7Var == null && ju7Var.getVisibility() == 0) {
                                        canvas82.clipRect(i49, i50, i47 / 2, i48 / 2);
                                        if (this.z4.getMeasuredWidth() != q4 || this.z4.getMeasuredHeight() != o4) {
                                            this.z4.measure(View.MeasureSpec.makeMeasureSpec(q4, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(o4, TLObject.FLAG_30));
                                            this.z4.layout(0, 0, q4, o4);
                                        }
                                        canvas82.scale(min5, min5);
                                        canvas82.translate((-q4) / 2, (-o4) / 2);
                                        f58 = 1.0f;
                                        this.z4.setAlpha(1.0f);
                                        this.z4.draw(canvas82);
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
                                ju7Var = this.z4;
                                if (ju7Var == null) {
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
                        ju7Var = this.z4;
                        if (ju7Var == null) {
                        }
                        f58 = 1.0f;
                        canvas82.restore();
                    } else {
                        i22 = i11;
                        f58 = f41;
                        f59 = f1042;
                    }
                    this.m1.setMoveProgress(f58 - f59);
                    iv9 iv9Var2 = this.B1;
                    if (iv9Var2 == null || !iv9Var2.a()) {
                        canvas82.save();
                        canvas82.translate(f36, f1032 / f1022);
                        canvas82.translate((-(((this.a6 + 1.0f) * i22) + gl.L(30.0f))) / f28, (-f1032) / f1022);
                        u78 u78Var3 = u78VarArr[b4];
                        u78Var3.o = 1.0f;
                        u78Var3.e(0, 1.0f, false);
                        u78VarArr[b4].c(canvas82);
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
                        ya8 ya8Var = this.w3;
                        if (ya8Var != null && !this.E2) {
                            try {
                                this.C3 = ya8Var.getBitmap();
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
                                fa4.f(th);
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
                        if (this.V8 != null) {
                            C();
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
                    rac racVar = this.A1;
                    if (racVar.j) {
                        int i52 = (int) (f1032 / f1022);
                        racVar.setBounds(this.z2.getLeft(), (this.z2.getTop() - measuredHeight) + i52, this.z2.getRight(), this.z2.getBottom() + measuredHeight + i52);
                        this.A1.draw(canvas82);
                    }
                    if (this.B1.a()) {
                        this.B1.setBounds(this.z2.getLeft(), (int) ((this.G.getAlpha() * gl.L(90.0f)) + gl.m), this.z2.getRight(), this.z2.getBottom() + measuredHeight + ((int) (f1032 / f1022)));
                        this.B1.draw(canvas82);
                    }
                }
                if (a()) {
                    this.Q8.endRecording();
                    canvas.drawRenderNode(this.Q8);
                    canvas82 = canvas;
                }
                S(canvas82);
            }
        }
        f13 = f11;
        f14 = 1.0f;
        f15 = 0.0f;
        if (this.I3) {
        }
        if (this.J4) {
        }
        z2 = z;
        z3 = false;
        f16 = 1.0f;
        if (!z2) {
        }
        this.L4 = false;
        matrix = this.M4;
        matrix.reset();
        p88Var = this.O1;
        if (p88Var != null) {
            if (this.O1.getRenderView().getAlpha() <= 0.99f) {
            }
        }
        if (this.C4.B()) {
        }
        mzaVar = this.p5;
        if (mzaVar == null) {
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
        canvas3.translate(f9322 + Z(this.u4), f9422 + a0(this.u4));
        matrix.preTranslate(f9322 + Z(this.u4), f9422 + a0(this.u4));
        float f9522 = f12 + 0.0f;
        canvas3.translate(f13, f9522);
        matrix.preTranslate(f13, f9522);
        f22 = f5 - f15;
        canvas3.scale(f22, f22);
        matrix.preScale(f22, f22);
        canvas3.rotate(f18);
        matrix.preRotate(f18);
        if (this.u4 == 3) {
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
        q = this.C4.q();
        o = this.C4.o();
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
        b2 = this.u4;
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
        if (this.y4.getVisibility() == 0) {
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
        T(f43, f42, f12, f14, canvas6);
        float f10222 = f42;
        float f10322 = f12;
        float f10422 = f14;
        Canvas canvas822 = canvas6;
        imageReceiver = this.r1;
        if (imageReceiver == this.B4) {
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
        S(canvas822);
    }

    public final boolean Y1(int i) {
        l98 l98Var = this.j7;
        if (l98Var == null) {
            return false;
        }
        if (!l98Var.a(i) && !this.j7.e(i)) {
            return false;
        }
        boolean z = gba.a;
        if (!e66.e(1024)) {
            return false;
        }
        File b = this.j7.b(i);
        if (b == null || !b.exists()) {
            return gba.x0 && (this.j7.d(i) instanceof TLRPC.Document);
        }
        return true;
    }

    public final int Z(int i) {
        if (i != 1) {
            if (i != 0) {
                if (i == 5 || i == 4 || i == 3) {
                    return 0;
                }
                return gl.L(14.0f);
            }
            if (this.d2 != 1) {
                return 0;
            }
        }
        return gl.L(16.0f);
    }

    public final void Z0() {
        Activity activity = this.E;
        if (activity instanceof LaunchActivity) {
            ((LaunchActivity) activity).a1.remove(this.t1);
        }
        org.telegram.ui.ActionBar.d dVar = this.m4;
        if (dVar == null || dVar.getFragmentView() == null) {
            return;
        }
        this.m6 = 1.0f;
        View fragmentView = this.m4.getFragmentView();
        fragmentView.setScaleX(1.0f);
        fragmentView.setScaleY(1.0f);
        x02 x02Var = this.b2;
        if (x02Var != null) {
            ww0 ww0Var = x02Var.c;
            ww0Var.setScaleX(1.0f);
            ww0Var.setScaleY(1.0f);
        }
    }

    public final int a0(int i) {
        int L;
        if (i >= 0) {
            if (i == 1 || (i == 0 && this.d2 == 1)) {
                L = gl.L(16.0f);
                if (!this.s) {
                    r0 = gl.m;
                }
            } else {
                if (i == 3 && this.M1 != null) {
                    return this.M1.getAdditionalTop() + gl.L(8.0f) + (this.s ? 0 : gl.m);
                }
                if (i != 0 && i != 4 && i != 5) {
                    L = gl.L(14.0f);
                    if (!this.s) {
                        r0 = gl.m;
                    }
                }
            }
            return L + r0;
        }
        return 0;
    }

    public final void a1(ClickableSpan clickableSpan, TextView textView) {
        if (textView == null || !(clickableSpan instanceof URLSpan)) {
            clickableSpan.onClick(textView);
            return;
        }
        String url = ((URLSpan) clickableSpan).getURL();
        if (url.startsWith(MediaStreamTrack.VIDEO_TRACK_KIND)) {
            if (this.G2 == null || this.T4 == null) {
                return;
            }
            int intValue = Utilities.z(url).intValue();
            if (this.G2.U() == -9223372036854775807L) {
                this.a3 = intValue / ((float) this.T4.L0());
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
                cj3 cj3Var = new cj3(null);
                cj3Var.p2 = url;
                ((LaunchActivity) this.E).u0(cj3Var, false, true);
                B(false, false);
                return;
            }
            return;
        }
        if (this.l4 == null || !((clickableSpan instanceof i4c) || gl.E3(url))) {
            clickableSpan.onClick(textView);
        } else {
            ij.n0(this.l4, url, true, true);
        }
    }

    public final void a2(AlertDialog$Builder alertDialog$Builder) {
        if (this.E != null) {
            try {
                hd hdVar = this.Q1;
                if (hdVar != null) {
                    hdVar.dismiss();
                    this.Q1 = null;
                }
            } catch (Exception e) {
                fa4.g(e, true);
            }
            try {
                hd o = alertDialog$Builder.o();
                this.Q1 = o;
                o.setCanceledOnTouchOutside(true);
                this.Q1.setOnDismissListener(new n1(this, (byte) 29));
            } catch (Exception e2) {
                fa4.g(e2, true);
            }
        }
    }

    public final void b(float f, float f2, float f3, boolean z) {
        if (this.a6 == f && this.X5 == f2 && this.Y5 == f3) {
            return;
        }
        this.R6 = z;
        this.e6 = f;
        this.c6 = f2;
        this.d6 = f3;
        this.n6 = System.currentTimeMillis();
        AnimatorSet animatorSet = new AnimatorSet();
        this.p6 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, rn.g, 0.0f, 1.0f));
        this.p6.setInterpolator(this.t6);
        this.p6.setDuration(250L);
        this.p6.addListener(new e88(this, (byte) 7));
        this.p6.start();
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
        h98 h98Var = this.X4;
        ArrayList arrayList = h98Var.e;
        if (arrayList == null) {
            return 0;
        }
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            mac macVar = (mac) h98Var.e.get(i2);
            if (macVar.a == 0) {
                byte b = macVar.b;
                if ((b & 1) == 0) {
                }
                i++;
                if (!z) {
                    return i;
                }
            }
            if (macVar.k.isEmpty()) {
                continue;
            }
            i++;
            if (!z) {
            }
        }
        return i;
    }

    public final void b1(p98 p98Var) {
        if (this.v2) {
            v1(true);
        }
        k27 k27Var = this.T4;
        if (k27Var != null && !k27Var.P) {
            ba4.G(this.U).f(this.T4.F0());
        }
        byte b = 0;
        this.e = false;
        this.f = false;
        this.h2 = false;
        this.s4 = true;
        this.T4 = null;
        this.Y4 = null;
        this.Z4 = null;
        this.a5 = null;
        this.b5 = null;
        this.i5 = null;
        this.e5 = null;
        this.r2 = null;
        VideoAds videoAds = this.U4;
        if (videoAds != null) {
            videoAds.stop();
            this.U4 = null;
        }
        if (this.i3 != null) {
            X1(false, false);
        }
        r88 r88Var = this.U1;
        if (r88Var != null) {
            r88Var.scrollTo(0, 0);
        }
        this.d2 = 0;
        this.e2 = false;
        this.f2 = false;
        this.g2 = false;
        this.i2 = false;
        jl5 jl5Var = this.j5;
        if (jl5Var != null) {
            jl5Var.a();
            this.j5 = null;
        }
        this.b2 = null;
        a06 a06Var = this.c2;
        if (a06Var != null) {
            a06Var.a();
            this.c2 = null;
        }
        km kmVar = this.k2;
        if (kmVar != null) {
            kmVar.w(this.f0);
            this.k2 = null;
        }
        for (int i = 0; i < 3; i++) {
            u78 u78Var = this.X0[i];
            if (u78Var != null) {
                u78Var.d(-1, false, true);
            }
        }
        w1(0);
        v78 v78Var = this.Y7;
        if (v78Var != null) {
            v78Var.a();
        }
        this.o1.d(0, false);
        this.C4.g0(null);
        this.F4.a();
        this.B4.g0(null);
        this.E4.a();
        this.D4.g0(null);
        this.G4.a();
        this.f0.post(new n68(this, p98Var, b));
        o98 o98Var = this.d;
        if (o98Var != null) {
            o98Var.F();
        }
        vb5 vb5Var = this.m1;
        vb5Var.d.clear();
        vb5Var.e.clear();
        vb5Var.c.clear();
        o98 o98Var2 = this.d;
        if (o98Var2 != null) {
            o98Var2.C();
        }
        this.d = null;
        this.q1.f();
        this.j7 = null;
        this.s4 = false;
        this.u8 = 0.0f;
        this.v8 = 1.0f;
        if (p98Var != null) {
            p98Var.a.v0(true, true);
        }
        mu1 mu1Var = this.l4;
        if (mu1Var != null) {
            mu1Var.getFragmentView().invalidate();
        }
        Bitmap bitmap = this.O4;
        if (bitmap != null) {
            bitmap.recycle();
            this.O4 = null;
        }
    }

    public final boolean b2(FrameLayout frameLayout) {
        org.telegram.ui.ActionBar.d dVar = this.m4;
        if (!(dVar instanceof mu1) || !hc2.V(((mu1) dVar).e)) {
            return false;
        }
        m21 f = new u21(frameLayout, this.w2).f(na7.q1(this.U).k4.h1.f(), new y68(this, (byte) 3));
        f.v = new y68(this, (byte) 4);
        this.t7 = f.j();
        return true;
    }

    public final void c() {
        int i;
        TLRPC.EncryptedChat encryptedChat;
        if (!U0() || this.d == null || (i = this.P4) < 0) {
            return;
        }
        ArrayList arrayList = this.g7;
        if (i < arrayList.size()) {
            Object obj = arrayList.get(this.P4);
            CharSequence text = d0().getText();
            CharSequence[] charSequenceArr = {text};
            if (this.v7 && !TextUtils.equals(this.w7, text) && this.d.S(this.P4) != 0 && this.d.G() > 0) {
                this.v7 = false;
            }
            hq6 d0 = hq6.d0(this.U);
            mu1 mu1Var = this.l4;
            ArrayList Y = d0.Y(charSequenceArr, mu1Var != null && ((encryptedChat = mu1Var.h) == null || gl.W0(encryptedChat.layer) >= 101), true);
            CharSequence charSequence = charSequenceArr[0];
            this.w7 = charSequence;
            if (obj instanceof jm6) {
                jm6 jm6Var = (jm6) obj;
                jm6Var.a = charSequence;
                jm6Var.n = Y;
            } else if (obj instanceof nm6) {
                nm6 nm6Var = (nm6) obj;
                nm6Var.I = charSequence;
                nm6Var.n = Y;
            }
            if (text.length() != 0 && !this.d.w(this.P4)) {
                U1();
            }
            o98 o98Var = this.d;
            if (o98Var != null) {
                o98Var.f(text);
            }
        }
    }

    public final ClippingImageView[] c0(p98 p98Var) {
        int i = (gl.O1() || p98Var == null || p98Var.m == null) ? 0 : 1;
        ClippingImageView[] clippingImageViewArr = new ClippingImageView[i + 1];
        clippingImageViewArr[0] = this.i0;
        if (i != 0) {
            bda bdaVar = p98Var.m;
            clippingImageViewArr[1] = bdaVar;
            bdaVar.setAdditionalTranslationY(p98Var.n);
        }
        return clippingImageViewArr;
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
    public final void c1(k27 k27Var, TLRPC.FileLocation fileLocation, gl5 gl5Var, gl5 gl5Var2, ArrayList arrayList, ArrayList arrayList2, List list, int i, p98 p98Var) {
        float f;
        boolean z;
        int i2;
        eb1 eb1Var;
        eb1 eb1Var2;
        o98 o98Var;
        int i3;
        ArrayList arrayList3;
        mu1 mu1Var;
        gl5 gl5Var3;
        ImageView imageView;
        k27 k27Var2;
        TLRPC.BotInlineResult botInlineResult;
        l98 l98Var;
        int i4;
        mu1 mu1Var2;
        o98 o98Var2;
        x31 x31Var;
        lbc lbcVar;
        k27 k27Var3;
        o98 o98Var3;
        mu1 mu1Var3;
        boolean z2;
        TLRPC.MessageAction messageAction;
        int i5;
        x88 x88Var;
        TLRPC.WebPage webPage;
        String str;
        TLRPC.Message message;
        int i6 = i;
        this.c = ConnectionsManager.generateClassGuid();
        this.e4 = null;
        this.f4 = false;
        this.T4 = null;
        this.Z4 = null;
        this.a5 = null;
        this.b5 = null;
        this.e5 = null;
        this.f5 = 0L;
        this.i5 = null;
        this.m5 = false;
        this.Y4 = null;
        this.C8 = 0.0f;
        this.B8 = 0L;
        this.P4 = -1;
        String[] strArr = this.c5;
        strArr[0] = null;
        strArr[1] = null;
        strArr[2] = null;
        this.z5 = 0L;
        this.A5 = false;
        this.J5 = 0;
        this.L5 = 0;
        this.u4 = (byte) 0;
        d0().M.b(this.u4 != 0);
        mv5 mv5Var = this.L1;
        if (mv5Var != null) {
            mv5Var.b(this.u4 != 3);
        }
        this.M5 = true;
        this.N5 = false;
        this.O5 = false;
        boolean[] zArr = this.P5;
        zArr[0] = false;
        zArr[1] = this.I5 == 0;
        this.Q5 = false;
        this.R5 = false;
        this.j2 = false;
        this.f0.setTag(1);
        this.Y2 = false;
        this.s1 = false;
        this.Y6.clear();
        this.a7.clear();
        this.c7.clear();
        this.b7.clear();
        this.d7.clear();
        this.f7.clear();
        this.e7.clear();
        this.g7.clear();
        VideoAds videoAds = this.U4;
        if (videoAds != null) {
            videoAds.stop();
            this.U4 = null;
        }
        sl0 sl0Var = this.c0;
        if (sl0Var != null) {
            sl0Var.e();
        }
        this.G.setElevation(0.0f);
        for (int i7 = 0; i7 < 2; i7++) {
            this.Z6[i7].clear();
            this.X6[i7].clear();
        }
        this.W6.clear();
        this.h7 = null;
        this.f0.setPadding(0, 0, 0, 0);
        jl5 jl5Var = this.j5;
        if (jl5Var != null) {
            jl5Var.a();
        }
        this.j5 = p98Var != null ? p98Var.e : null;
        this.B5 = p98Var != null && p98Var.l;
        this.C5 = (byte) 0;
        this.r0.setText(k96.M0(2131745155, "ShowAllMedia"));
        Q1(this.C0, false, false);
        Q1(this.w0, false, true);
        v48 v48Var = this.D1;
        if (v48Var != null) {
            v48Var.setSubtitle(null);
        }
        this.G.setBackgroundColor(this.f2 ? 0 : 2130706432);
        q();
        this.j0.setVisibility(8);
        this.j0.setTag(0);
        m98 m98Var = this.O;
        if (m98Var != null) {
            m98Var.d(false, false);
        }
        if (this.d2 != 11 && this.p5 != null) {
            this.B7 = false;
            ImageView imageView2 = this.d1;
            if (imageView2 != null) {
                imageView2.setAlpha(1.0f);
            }
            c98 c98Var = this.y5;
            if (c98Var != null) {
                c98Var.m(false, false);
            }
            this.p5.b();
            ArrayList arrayList4 = this.r5;
            if (arrayList4 != null) {
                arrayList4.clear();
            }
        }
        this.j0.setTranslationY(0.0f);
        this.R1.setTranslationY(0.0f);
        Q1(this.D0, false, false);
        q98 q98Var = this.U7;
        if (q98Var != null) {
            q98Var.setVisibility(4);
            this.V7.setVisibility(4);
            this.U7.setTag(null);
        }
        AnimatorSet animatorSet = this.a8;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.a8 = null;
        }
        this.s6 = true;
        this.r6.h = this;
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
        C2();
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
        l2(false, false);
        e2(false, false);
        j2(false, false);
        this.Z7.setVisibility(8);
        this.k1.setVisibility(8);
        gl.R3(1.0f, this.f1, false, false);
        gl.R3(1.0f, this.g1, false, false);
        gl.R3(1.0f, this.h1, false, false);
        this.N.a(null, true);
        Q1(this.E0, false, true);
        this.r = false;
        o76 o76Var = this.g1;
        if (o76Var != null) {
            o76Var.a(true, false);
        }
        v78 v78Var = this.Y7;
        if (v78Var != null) {
            v78Var.setAlpha(1.0f);
        }
        za2 za2Var = this.e1;
        za2Var.c = false;
        ((lm) za2Var.f).f(false, true);
        za2Var.invalidateSelf();
        this.V0.setVisibility(8);
        this.R1.setTag(null);
        this.R1.setVisibility(4);
        v48 v48Var2 = this.D1;
        if (v48Var2 != null) {
            v48Var2.setVisibility(8);
        }
        l58 l58Var = this.J1;
        if (l58Var != null) {
            l58Var.setVisibility(8);
        }
        for (int i8 = 0; i8 < 3; i8++) {
            u78 u78Var = this.X0[i8];
            if (u78Var != null) {
                u78Var.d(-1, false, true);
            }
        }
        vb5 vb5Var = this.m1;
        if (vb5Var != null) {
            vb5Var.d();
            this.m1.setAnimateBackground(!org.telegram.messenger.a.r());
        }
        o98 o98Var4 = this.d;
        if (o98Var4 != null && o98Var4.x() > 0) {
            this.J5 = this.d.x();
        }
        if (k27Var != null) {
            this.u1 = org.telegram.messenger.a.b.getSharedPreferences("playback_speed", 0).getFloat("speed" + k27Var.A0() + "_" + k27Var.e1(), 1.0f);
        } else {
            this.u1 = 1.0f;
        }
        R1(false, true);
        this.a.a(this.g2, false);
        boolean z3 = k27Var != null && (na7.q1(this.U).z2(k27Var.A0()) || (((message = k27Var.k) != null && message.noforwards) || k27Var.y2()));
        try {
            if (k27Var != null && arrayList == null) {
                TLRPC.Message message2 = k27Var.k;
                if (message2 != null && (k27.n1(message2) instanceof TLRPC.TL_messageMediaWebPage) && k27.n1(k27Var.k).webpage != null && (str = (webPage = k27.n1(k27Var.k).webpage).site_name) != null) {
                    String lowerCase = str.toLowerCase();
                    if (lowerCase.equals("instagram") || lowerCase.equals("twitter") || "telegram_album".equals(webPage.type)) {
                        TextUtils.isEmpty(webPage.author);
                        if (webPage.cached_page instanceof TL_iv.TL_page) {
                            for (int i10 = 0; i10 < webPage.cached_page.blocks.size() && !(webPage.cached_page.blocks.get(i10) instanceof TL_iv.pageBlockAuthorDate); i10++) {
                            }
                        }
                        ArrayList l2 = k27Var.l2();
                        if (!l2.isEmpty()) {
                            this.w = k27Var.e1();
                            this.N5 = false;
                            this.Y6.addAll(l2);
                            this.J5 = this.Y6.size();
                            int indexOf = this.Y6.indexOf(k27Var);
                            if (indexOf < 0) {
                                indexOf = 0;
                            }
                            J1(indexOf);
                        }
                    }
                }
                if (k27Var.x()) {
                    this.C5 = (byte) 1;
                    this.r0.setText(k96.M0(2131745157, "ShowAllFiles"));
                } else if (k27Var.q3()) {
                    this.C5 = (byte) 5;
                    this.r0.setText(k96.M0(2131745156, "ShowAllGIFs"));
                }
                if (this.t4 && ((x88Var = this.g0) == null || !x88Var.y)) {
                    this.j0.setTag(null);
                    this.j0.setVisibility(8);
                }
                if (this.w == 0) {
                    this.Y6.add(k27Var);
                    this.p0.Q(25, (z3 || !k27Var.Q3() || k27Var.D3()) ? false : true);
                    int i11 = 0;
                    if (k27Var.T != 0) {
                        this.N5 = false;
                    } else if (this.k2 != null) {
                        this.N5 = false;
                        if (k27Var.w() && !z3) {
                            Q1(this.C0, true, false);
                        }
                    } else if (!k27Var.r1 && !k27Var.Z3() && !k27Var.q4() && !(k27.n1(k27Var.k) instanceof TLRPC.TL_messageMediaInvoice) && !(k27.n1(k27Var.k) instanceof TLRPC.TL_messageMediaWebPage) && ((messageAction = k27Var.k.action) == null || (messageAction instanceof TLRPC.TL_messageActionEmpty))) {
                        this.N5 = true;
                        this.Z6[0].put(k27Var.e1(), k27Var);
                        mu1 mu1Var4 = this.l4;
                        if (mu1Var4 != null) {
                            i5 = (mu1Var4.Y7() || (r2 = this.l4.g4) == 3) ? 5 : 5;
                            i11 = 0;
                            Q1(this.C0, !z3, false);
                        }
                        this.p0.R(i5);
                        long A0 = k27Var.A0();
                        boolean B = A0 < 0 ? hc2.B(na7.q1(k27Var.K1).K0(Long.valueOf(-A0))) : true;
                        r7 r7Var = this.p0;
                        if (B) {
                            r7Var.R(21);
                        } else {
                            r7Var.u(21);
                        }
                        this.p0.R(3);
                        i11 = 0;
                        Q1(this.C0, !z3, false);
                    } else if (this.t4 && k27Var.T == 0) {
                        i11 = 0;
                        Q1(this.C0, true, false);
                    } else {
                        i11 = 0;
                    }
                    J1(i11);
                }
            } else if (arrayList2 != null) {
                this.e7.addAll(arrayList2);
                J1(i6);
            } else if (fileLocation != null) {
                long j = p98Var != null ? p98Var.f : 0L;
                this.z5 = j;
                this.A5 = p98Var != null && p98Var.p;
                if (gl5Var != null || j == 0) {
                    gl5Var3 = gl5Var;
                } else {
                    int i12 = this.U;
                    gl5Var3 = j > 0 ? gl5.m(this.U, 0, na7.q1(i12).V1(Long.valueOf(this.z5))) : gl5.m(this.U, 0, na7.q1(i12).K0(Long.valueOf(-this.z5)));
                }
                if (gl5Var3 == null) {
                    return;
                }
                this.a7.add(gl5Var3);
                this.b7.add(gl5Var2 != null ? gl5Var2 : gl5Var3);
                this.h7 = gl5Var3;
                this.c7.add(Long.valueOf(p98Var != null ? p98Var.g : 0L));
                this.d7.add(null);
                this.f7.add(new TLRPC.TL_photoEmpty());
                this.l2 = true;
                this.p0.u(3);
                this.p0.R(9);
                J1(0);
                if (this.d2 == 1) {
                    if (S2()) {
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
                        k27 k27Var4 = (k27) arrayList.get(i3);
                        if (i3 != i6) {
                            i3 = k27Var4.x3() ? i3 + 1 : 0;
                        } else {
                            i6 = this.Y6.size();
                        }
                        this.Y6.add(k27Var4);
                    }
                    int i13 = 0;
                    while (true) {
                        int size = this.Y6.size();
                        arrayList3 = this.Y6;
                        if (i13 >= size) {
                            break;
                        }
                        k27 k27Var5 = (k27) arrayList3.get(i13);
                        this.Z6[k27Var5.A0() == this.E5 ? (char) 0 : (char) 1].put(k27Var5.e1(), k27Var5);
                        i13++;
                    }
                    k27 k27Var6 = (k27) arrayList3.get(i6);
                    this.p0.Q(25, !z3 && k27Var6.Q3());
                    if (k27Var6.r1 || k27Var6.Z3() || k27Var6.q4() || ((mu1Var = this.l4) != null && mu1Var.Y7())) {
                        this.J5 = this.Y6.size();
                    } else {
                        this.Q5 = this.l4 == null;
                        if (this.m4 instanceof ProfileActivity) {
                            this.R5 = true;
                        }
                        if (p98Var != null) {
                            this.K5 = p98Var.q;
                        }
                        this.p0.R(5);
                        long A02 = k27Var6.A0();
                        boolean B2 = A02 < 0 ? hc2.B(na7.q1(k27Var6.K1).K0(Long.valueOf(-A02))) : true;
                        r7 r7Var2 = this.p0;
                        if (B2) {
                            r7Var2.R(21);
                        } else {
                            r7Var2.u(21);
                        }
                        if (k27Var6.w() && !z3) {
                            Q1(this.C0, true, false);
                        }
                        if (k27Var6.x()) {
                            this.C5 = (byte) 1;
                            this.r0.setText(k96.M0(2131745157, "ShowAllFiles"));
                        } else if (k27Var6.q3()) {
                            this.C5 = (byte) 5;
                            this.r0.setText(k96.M0(2131745156, "ShowAllGIFs"));
                        }
                    }
                    J1(i6);
                    f = 1.0f;
                } else if (list != null) {
                    int i14 = this.d2;
                    if (i14 != -1 && !this.e2 && !this.f2 && ((i14 == 0 || i14 == 4 || ((i14 == 2 || i14 == 5) && list.size() > 1)) && !this.f4)) {
                        this.O0.setVisibility(0);
                        this.P0.setVisibility(0);
                        C2();
                    }
                    y78 y78Var = this.V1;
                    int i15 = this.d2;
                    y78Var.C(i15 != -1 && (i15 == 2 || i15 == 5) && this.d.h());
                    z78 z78Var = this.W1;
                    int i16 = this.d2;
                    z78Var.C(i16 != -1 && (i16 == 2 || i16 == 5) && this.d.h());
                    this.p0.setVisibility(8);
                    this.p0.Q(25, false);
                    this.g7.addAll(list);
                    Object obj = this.g7.get(i6);
                    int i17 = this.d2;
                    if (i17 == -1 || !(obj instanceof jm6)) {
                        boolean z4 = obj instanceof TLRPC.BotInlineResult;
                        ImageView imageView3 = this.a1;
                        if (z4) {
                            imageView3.setVisibility(8);
                            this.c1.setVisibility(8);
                            this.b1.setVisibility(8);
                        } else {
                            imageView3.setVisibility((!(obj instanceof nm6) || ((nm6) obj).H) ? 8 : 0);
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
                            this.Q0.getLayoutParams().height = gl.L(84.0f);
                        } else {
                            boolean z5 = ((jm6) obj).b;
                            ImageView imageView4 = this.a1;
                            if (z5) {
                                imageView4.setVisibility(8);
                                this.c1.setVisibility(8);
                                this.b1.setVisibility(8);
                                this.j0.setVisibility(0);
                                this.j0.setTag(1);
                                this.j0.setTranslationY(-gl.L(48.0f));
                            } else {
                                imageView4.setVisibility(i17 != 1 ? 0 : 8);
                                this.c1.setVisibility(this.d2 != 1 ? 8 : 0);
                                this.b1.setVisibility(this.d2 != 1 ? 8 : 0);
                            }
                        }
                        z = !this.i2;
                    }
                    this.j2 = z && ((o98Var = this.d) == null || o98Var.y());
                    if (this.l4 != null && (eb1Var2 = this.V1.N) != null) {
                        eb1Var2.getAdapter().V(this.l4.r8);
                        this.V1.N.getAdapter().f0 = this.l4.e != null;
                        this.V1.N.getAdapter().g0 = false;
                    }
                    if (this.l4 == null || (eb1Var = this.W1.N) == null) {
                        i2 = 0;
                    } else {
                        eb1Var.getAdapter().V(this.l4.r8);
                        this.W1.N.getAdapter().f0 = this.l4.e != null;
                        i2 = 0;
                        this.W1.N.getAdapter().g0 = false;
                    }
                    if (this.d2 != -1) {
                        if (!this.g2) {
                            this.Q0.setVisibility(i2);
                        }
                        if (S2()) {
                            this.o0.setVisibility(i2);
                        } else if (!this.g2) {
                            this.T0.setVisibility(i2);
                            this.T0.setTranslationY(0.0f);
                            this.T0.setAlpha(1.0f);
                        }
                        View view2 = this.k0;
                        if (view2 == null || (this.S4 && this.d2 != 11)) {
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
                    J1(i6);
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
                    N2();
                } else {
                    f = 1.0f;
                    J1(i6);
                }
                imageView = this.d1;
                if (imageView != null) {
                    imageView.setAlpha(this.B7 ? 0.4f : f);
                }
                this.r2 = null;
                if (this.k2 == null && !this.B5) {
                    if (this.E5 != 0 || this.J5 != 0 || (k27Var3 = this.T4) == null || k27Var3.r1) {
                        if (this.z5 != 0 && this.d.s()) {
                            this.r2 = na7.q1(this.U).S0(this.z5);
                            kk7.f(this.U).k(kk7.f3, this.r2);
                        }
                    } else if (this.H5 && (mu1Var3 = this.l4) != null) {
                        ArrayList I6 = mu1Var3.I6();
                        if (I6 != null) {
                            this.Y6.clear();
                            for (int i19 = 0; i19 < I6.size(); i19++) {
                                k27 k27Var7 = (k27) I6.get(i19);
                                if (hq6.h0(k27Var7.k) == this.C5 && !k27Var7.x3()) {
                                    this.Y6.add(k27Var7);
                                    this.Z6[0].put(k27Var7.e1(), k27Var7);
                                }
                            }
                            Collections.sort(this.Y6, new fx7((byte) 2));
                            this.P4 = -1;
                            for (int i20 = 0; i20 < this.Y6.size(); i20++) {
                                if (this.Y6.get(i20) == this.T4 || ((k27) this.Y6.get(i20)).e1() == this.T4.e1()) {
                                    this.P4 = i20;
                                }
                            }
                            if (this.P4 < 0) {
                                this.P4 = this.Y6.size();
                                this.Y6.add(this.T4);
                                z2 = false;
                                this.Z6[0].put(this.T4.e1(), this.T4);
                            } else {
                                z2 = false;
                            }
                            L1();
                            m98 m98Var2 = this.O;
                            if (m98Var2 != null) {
                                m98Var2.d(true, z2);
                                this.O.b(this.P4 + 1, this.Y6.size(), z2);
                            }
                        } else {
                            z2 = false;
                        }
                        this.M5 = z2;
                    } else if (hq6.h0(k27Var3.k) == this.C5 && ((o98Var3 = this.d) == null || !o98Var3.K())) {
                        hq6.d0(this.U).f0(this.C5, this.c, this.E5, this.D5, true);
                        if (this.I5 != 0) {
                            hq6.d0(this.U).f0(this.C5, this.c, this.I5, this.D5, true);
                        }
                    }
                }
                k27Var2 = this.T4;
                if (!(k27Var2 == null && k27Var2.G4()) && (((botInlineResult = this.Y4) == null || !(botInlineResult.type.equals(MediaStreamTrack.VIDEO_TRACK_KIND) || k27.J4(this.Y4.document))) && ((l98Var = this.j7) == null || !(l98Var.a(i6) || this.j7.e(i6))))) {
                    i4 = -1;
                    if (this.d2 == -1 || !((jm6) this.g7.get(i6)).b) {
                        if (!this.g7.isEmpty()) {
                            Object obj2 = this.g7.get(i6);
                            mu1 mu1Var5 = this.l4;
                            TLRPC.User h = mu1Var5 != null ? mu1Var5.h() : null;
                            boolean z6 = !this.i2 && (!((mu1Var2 = this.l4) == null || mu1Var2.y() || this.l4.N7() || h == null || h.bot || l7c.C(h) || ((x31Var = this.l4.Y1) != null && x31Var.E3 != null)) || (this.l4 == null && (o98Var2 = this.d) != null && o98Var2.i()));
                            o98 o98Var5 = this.d;
                            if (o98Var5 != null && o98Var5.V() != null) {
                                z6 = false;
                            }
                            if (obj2 instanceof TLRPC.BotInlineResult) {
                                z6 = false;
                            } else if (z6 && (obj2 instanceof nm6)) {
                                z6 = !((nm6) obj2).H;
                            }
                            this.V1.E(z6, true);
                            this.W1.E(z6, true);
                        }
                        u();
                        lbc lbcVar2 = this.G2;
                        this.u7 = lbcVar2 != null ? lbcVar2.T() : i4;
                        fo.b(0);
                        if (tg2.D().I()) {
                            tg2.D().X(k0());
                        }
                        lbcVar = this.G2;
                        if (lbcVar != null) {
                            fo.z(lbcVar.c0());
                            return;
                        }
                        return;
                    }
                } else {
                    i4 = -1;
                }
                this.Y2 = true;
                X0(false);
                u();
                lbc lbcVar22 = this.G2;
                this.u7 = lbcVar22 != null ? lbcVar22.T() : i4;
                fo.b(0);
                if (tg2.D().I()) {
                }
                lbcVar = this.G2;
                if (lbcVar != null) {
                }
            }
            fo.b(0);
            if (tg2.D().I()) {
            }
            lbcVar = this.G2;
            if (lbcVar != null) {
            }
        } catch (Exception e) {
            fa4.f(e);
            return;
        }
        f = 1.0f;
        imageView = this.d1;
        if (imageView != null) {
        }
        this.r2 = null;
        if (this.k2 == null) {
            if (this.E5 != 0) {
            }
            if (this.z5 != 0) {
                this.r2 = na7.q1(this.U).S0(this.z5);
                kk7.f(this.U).k(kk7.f3, this.r2);
            }
        }
        k27Var2 = this.T4;
        if (k27Var2 == null) {
        }
        i4 = -1;
        if (this.d2 == -1) {
        }
        if (!this.g7.isEmpty()) {
        }
        u();
        lbc lbcVar222 = this.G2;
        this.u7 = lbcVar222 != null ? lbcVar222.T() : i4;
    }

    public final void c2() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.w2, this.E);
        String M0 = k96.M0(R.string.AppName, null);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = M0;
        alertDialog$Builder.j(k96.M0(2131747638, "OK"), null);
        k27 k27Var = this.T4;
        if (k27Var != null && k27.K4(k27Var.k) && ba4.G(this.T4.K1).S(this.c5[0])) {
            hdVar.U = k96.M0(2131747011, null);
        } else {
            hdVar.U = k96.M0(2131747025, null);
        }
        a2(alertDialog$Builder);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(Canvas canvas, int i, int i2, int i3, int i4, float f, c33 c33Var, zl6 zl6Var) {
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
        int i11 = c33Var.i;
        if (i11 != 90 && i11 != 270) {
            i10 = i8;
            i8 = i10;
        }
        int i12 = this.d2;
        if (i12 == 1 || !((b3 = this.u4) == 3 || this.o6 == 3)) {
            if (this.p6 == null || (i5 = this.o6) == -1) {
                f2 = f17;
                b = this.u4;
                if (b == 2 || b == 3) {
                    f3 = 0.0f;
                }
            } else {
                byte b4 = this.u4;
                f2 = f17;
                if (b4 == 1 || i5 == 1) {
                    f3 = 1.0f;
                } else {
                    f3 = this.l6;
                    if (i5 != 0) {
                        f3 = 1.0f - f3;
                    }
                }
                b = b4;
            }
            float f22 = c33Var.j;
            float f23 = c33Var.k;
            float f24 = i10;
            f4 = 1.0f - f3;
            int z = (int) yjb.z(1.0f - f22, f4, f22, f24);
            f5 = i8;
            int i13 = (int) ((((1.0f - f23) * f4) + f23) * f5);
            f6 = z;
            f7 = f16 / f6;
            f8 = i13;
            if (f7 * f8 > f19) {
                f7 = f19 / f8;
            }
            if (i12 != 1 && ((b != 1 || this.o6 == 0) && zl6Var != null)) {
                float f25 = f6 * f7;
                float f26 = f8 * f7;
                if (f18 * f20 <= f19) {
                    f21 = f18;
                }
                float A = tb4.A((f2 * f21) / f, f25, f4, f25);
                float A2 = tb4.A((f21 * f20) / f, f26, f4, f26);
                canvas.clipRect((-A) / 2.0f, (-A2) / 2.0f, A / 2.0f, A2 / 2.0f);
            }
            i6 = this.d2;
            if (i6 != 1 || c33Var.a) {
                b2 = this.u4;
                if (b2 != 1 || i6 == 1) {
                    float A3 = c33Var.f / tb4.A(c33Var.l, 1.0f, f4, 1.0f);
                    f10 = f16 / f24;
                    if (f10 * f5 > f19) {
                        f10 = f19 / f5;
                    }
                    float f27 = (f10 / min) * A3;
                    if (i6 == 1) {
                        if (b2 == 3 || (i7 = this.o6) == 3) {
                            f12 = ((c33Var.m - 1.0f) * f4) + 1.0f;
                        } else if (i7 == 0) {
                            f12 = c33Var.m;
                        }
                        f27 /= f12;
                    }
                    f11 = f27;
                } else {
                    if (zl6Var != null) {
                        f14 = zl6Var.c;
                        f15 = 1.0f;
                    } else {
                        f14 = 1.0f;
                        f15 = 1.0f;
                    }
                    f11 = ((f7 / min) / tb4.A(f14, f15, f4, f15)) * f14;
                }
                float f28 = f11;
                canvas.translate(c33Var.d * f3, c33Var.e * f3);
                canvas.scale(f28, f28);
                canvas.translate(yjb.C(c33Var.b, f24, min, f3), yjb.C(c33Var.c, f5, min, f3));
                f13 = c33Var.g + i11;
                if (f13 > 180.0f) {
                    f13 -= 360.0f;
                }
                if (this.d2 == 1 || !(this.u4 == 3 || this.o6 == 3)) {
                    canvas.rotate(f13 * f3);
                } else {
                    canvas.rotate(f13);
                }
            }
            int[] iArr = this.T7;
            iArr[0] = z;
            iArr[1] = i13;
        }
        b = b3;
        f2 = f17;
        f3 = 1.0f;
        float f222 = c33Var.j;
        float f232 = c33Var.k;
        float f242 = i10;
        f4 = 1.0f - f3;
        int z2 = (int) yjb.z(1.0f - f222, f4, f222, f242);
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
            float A4 = tb4.A((f2 * f21) / f, f252, f4, f252);
            float A22 = tb4.A((f21 * f20) / f, f262, f4, f262);
            canvas.clipRect((-A4) / 2.0f, (-A22) / 2.0f, A4 / 2.0f, A22 / 2.0f);
        }
        i6 = this.d2;
        if (i6 != 1) {
        }
        b2 = this.u4;
        if (b2 != 1) {
        }
        float A32 = c33Var.f / tb4.A(c33Var.l, 1.0f, f4, 1.0f);
        f10 = f16 / f242;
        if (f10 * f5 > f19) {
        }
        float f272 = (f10 / min) * A32;
        if (i6 == 1) {
        }
        f11 = f272;
        float f282 = f11;
        canvas.translate(c33Var.d * f3, c33Var.e * f3);
        canvas.scale(f282, f282);
        canvas.translate(yjb.C(c33Var.b, f242, min, f3), yjb.C(c33Var.c, f5, min, f3));
        f13 = c33Var.g + i11;
        if (f13 > 180.0f) {
        }
        if (this.d2 == 1) {
        }
        canvas.rotate(f13 * f3);
        int[] iArr2 = this.T7;
        iArr2[0] = z2;
        iArr2[1] = i132;
    }

    public final mb1 d0() {
        o98 o98Var = this.d;
        return (o98Var == null || !o98Var.z()) ? this.V1 : this.W1;
    }

    public final void d1() {
        if (this.E == null || !this.l2) {
            return;
        }
        try {
            k27 k27Var = this.T4;
            boolean z = false;
            File file = null;
            file = null;
            file = null;
            if (k27Var != null) {
                boolean K4 = k27.K4(k27Var.k);
                if (!TextUtils.isEmpty(this.T4.k.attachPath)) {
                    File file2 = new File(this.T4.k.attachPath);
                    if (file2.exists()) {
                        file = file2;
                    }
                }
                if (file == null) {
                    ba4.G(this.U);
                    file = ba4.M(this.T4.k, false, true);
                }
                z = K4;
            } else if (this.a5 != null) {
                ba4.G(this.U);
                gl5 gl5Var = this.a5;
                File J = ba4.J(gl5Var == null ? null : gl5Var.f, o0(gl5Var), this.z5 != 0 || this.B5, true);
                if (J == null || !J.exists()) {
                    ba4.G(this.U);
                    gl5 gl5Var2 = this.a5;
                    file = ba4.J(gl5Var2 != null ? gl5Var2.f : null, o0(gl5Var2), false, true);
                } else {
                    file = J;
                }
            } else {
                l98 l98Var = this.j7;
                if (l98Var != null) {
                    file = l98Var.b(this.P4);
                }
            }
            if (file != null && !file.exists()) {
                file = new File(ba4.z(4), file.getName());
            }
            if (file == null || !file.exists()) {
                c2();
                return;
            }
            Intent intent = new Intent("android.intent.action.SEND");
            if (z) {
                intent.setType("video/mp4");
            } else {
                k27 k27Var2 = this.T4;
                if (k27Var2 != null) {
                    intent.setType(k27Var2.t1());
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
            this.E.startActivityForResult(Intent.createChooser(intent, k96.M0(2131745267, "ShareFile")), 500);
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    public final void d2(final mb1 mb1Var, boolean z, boolean z2, final float[] fArr) {
        o98 o98Var = this.d;
        float L = gl.L((o98Var == null || !o98Var.l()) ? 58.0f : 175.0f) * (mb1Var == this.W1 ? -1.0f : 1.0f);
        final byte b = 1;
        final byte b2 = 0;
        if (!z2) {
            mb1Var.animate().setListener(null).cancel();
            mb1Var.setVisibility(z ? 0 : 8);
            if (z) {
                L = 0.0f;
            }
            mb1Var.setTranslationY(L);
            float alpha = this.Q0.getAlpha();
            float f = z ? 1.0f : 0.0f;
            fArr[0] = f;
            mb1Var.setAlpha(alpha * f);
        } else if (z) {
            if (mb1Var.getTag() == null) {
                if (mb1Var.getVisibility() != 0) {
                    mb1Var.setVisibility(0);
                    mb1Var.setAlpha(this.Q0.getAlpha());
                    mb1Var.setTranslationY(L);
                }
                mb1Var.animate().translationY(0.0f).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: g68
                    public final /* synthetic */ PhotoViewer b;

                    {
                        this.b = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        byte b3 = b2;
                        float[] fArr2 = fArr;
                        mb1 mb1Var2 = mb1Var;
                        PhotoViewer photoViewer = this.b;
                        switch (b3) {
                            case 0:
                                Drawable[] drawableArr = PhotoViewer.f9;
                                float alpha2 = photoViewer.Q0.getAlpha();
                                float animatedFraction = valueAnimator.getAnimatedFraction();
                                fArr2[0] = animatedFraction;
                                mb1Var2.setAlpha(alpha2 * animatedFraction);
                                if (mb1Var2 == photoViewer.V1) {
                                    FrameLayout frameLayout = photoViewer.X7;
                                    if (frameLayout != null) {
                                        frameLayout.setTranslationY(photoViewer.Q0.getTranslationY() - (photoViewer.V1.getAlpha() * b00.c(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                                    }
                                    photoViewer.f1.setTranslationY(photoViewer.V1.getAlpha() * (-b00.c(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                                    photoViewer.g1.setTranslationY(photoViewer.V1.getAlpha() * (-b00.c(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                                    photoViewer.h1.setTranslationY(photoViewer.V1.getAlpha() * (-b00.c(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                                }
                                photoViewer.G0();
                                break;
                            default:
                                Drawable[] drawableArr2 = PhotoViewer.f9;
                                float alpha3 = photoViewer.Q0.getAlpha();
                                float animatedFraction2 = 1.0f - valueAnimator.getAnimatedFraction();
                                fArr2[0] = animatedFraction2;
                                mb1Var2.setAlpha(alpha3 * animatedFraction2);
                                if (mb1Var2 == photoViewer.V1) {
                                    FrameLayout frameLayout2 = photoViewer.X7;
                                    if (frameLayout2 != null) {
                                        frameLayout2.setTranslationY(photoViewer.Q0.getTranslationY() - (photoViewer.V1.getAlpha() * b00.c(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                                    }
                                    photoViewer.f1.setTranslationY(photoViewer.V1.getAlpha() * (-b00.c(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                                    photoViewer.g1.setTranslationY(photoViewer.V1.getAlpha() * (-b00.c(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                                    photoViewer.h1.setTranslationY(photoViewer.V1.getAlpha() * (-b00.c(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                                }
                                photoViewer.G0();
                                break;
                        }
                    }
                }).setDuration(420L).setInterpolator(s33.h).start();
            }
        } else if (mb1Var.getTag() != null) {
            mb1Var.animate().translationY(L).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: g68
                public final /* synthetic */ PhotoViewer b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    byte b3 = b;
                    float[] fArr2 = fArr;
                    mb1 mb1Var2 = mb1Var;
                    PhotoViewer photoViewer = this.b;
                    switch (b3) {
                        case 0:
                            Drawable[] drawableArr = PhotoViewer.f9;
                            float alpha2 = photoViewer.Q0.getAlpha();
                            float animatedFraction = valueAnimator.getAnimatedFraction();
                            fArr2[0] = animatedFraction;
                            mb1Var2.setAlpha(alpha2 * animatedFraction);
                            if (mb1Var2 == photoViewer.V1) {
                                FrameLayout frameLayout = photoViewer.X7;
                                if (frameLayout != null) {
                                    frameLayout.setTranslationY(photoViewer.Q0.getTranslationY() - (photoViewer.V1.getAlpha() * b00.c(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                                }
                                photoViewer.f1.setTranslationY(photoViewer.V1.getAlpha() * (-b00.c(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                                photoViewer.g1.setTranslationY(photoViewer.V1.getAlpha() * (-b00.c(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                                photoViewer.h1.setTranslationY(photoViewer.V1.getAlpha() * (-b00.c(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                            }
                            photoViewer.G0();
                            break;
                        default:
                            Drawable[] drawableArr2 = PhotoViewer.f9;
                            float alpha3 = photoViewer.Q0.getAlpha();
                            float animatedFraction2 = 1.0f - valueAnimator.getAnimatedFraction();
                            fArr2[0] = animatedFraction2;
                            mb1Var2.setAlpha(alpha3 * animatedFraction2);
                            if (mb1Var2 == photoViewer.V1) {
                                FrameLayout frameLayout2 = photoViewer.X7;
                                if (frameLayout2 != null) {
                                    frameLayout2.setTranslationY(photoViewer.Q0.getTranslationY() - (photoViewer.V1.getAlpha() * b00.c(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                                }
                                photoViewer.f1.setTranslationY(photoViewer.V1.getAlpha() * (-b00.c(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                                photoViewer.g1.setTranslationY(photoViewer.V1.getAlpha() * (-b00.c(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                                photoViewer.h1.setTranslationY(photoViewer.V1.getAlpha() * (-b00.c(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                            }
                            photoViewer.G0();
                            break;
                    }
                }
            }).setDuration(420L).setInterpolator(s33.h).withEndAction(new jb1(mb1Var, (byte) 1)).start();
        }
        mb1Var.setTag(z ? 1 : null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:413:0x065c, code lost:
    
        if (k27.B0(((k27) b00.f(1, r22.W6)).k) != r22.I5) goto L370;
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x069d, code lost:
    
        r1 = 1;
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:439:0x069b, code lost:
    
        if (k27.B0(((k27) r22.W6.get(0)).k) != r22.I5) goto L370;
     */
    @Override // gk7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        ArrayList arrayList;
        SparseArray[] sparseArrayArr;
        int i3;
        k27 k27Var;
        int i4;
        int e1;
        int i5;
        char c;
        TLRPC.Chat K0;
        TLRPC.User user;
        gl5 m;
        ArrayList<TLRPC.PhotoSize> arrayList2;
        int i6;
        long j;
        k27 k27Var2;
        TLRPC.Document F0;
        k27 k27Var3;
        TLRPC.BotInlineResult botInlineResult;
        l98 l98Var;
        float f = 1.0f;
        int i7 = 3;
        int i8 = 2;
        boolean z = true;
        int i10 = 0;
        r7 = false;
        boolean z2 = false;
        if (i == kk7.Y1) {
            String str = (String) objArr[0];
            for (int i11 = 0; i11 < 3; i11++) {
                String str2 = this.c5[i11];
                if (str2 != null && str2.equals(str)) {
                    if (i11 == 0 || ((i11 == 1 && this.r1 == this.D4) || (i11 == 2 && this.r1 == this.B4))) {
                        z2 = true;
                    }
                    this.X0[i11].f(z2, 1.0f);
                    w(i11, true);
                    return;
                }
            }
            return;
        }
        if (i == kk7.t3) {
            B(false, false);
            return;
        }
        if (i == kk7.X1) {
            String str3 = (String) objArr[0];
            int i12 = 0;
            while (i12 < 3) {
                String str4 = this.c5[i12];
                if (str4 != null && str4.equals(str3)) {
                    boolean z3 = i12 == 0 || (i12 == 1 && this.r1 == this.D4) || (i12 == 2 && this.r1 == this.B4);
                    this.X0[i12].f(z3, 1.0f);
                    w(i12, z3);
                    if (this.G2 == null && i12 == 0 && (((k27Var3 = this.T4) != null && k27.K4(k27Var3.k)) || (((botInlineResult = this.Y4) != null && (botInlineResult.type.equals(MediaStreamTrack.VIDEO_TRACK_KIND) || k27.J4(this.Y4.document))) || ((l98Var = this.j7) != null && (l98Var.a(this.P4) || this.j7.e(this.P4)))))) {
                        X0(false);
                    }
                    if (i12 != 0 || this.G2 == null) {
                        return;
                    }
                    this.h5 = true;
                    return;
                }
                i12++;
            }
            return;
        }
        if (i == kk7.W1) {
            String str5 = (String) objArr[0];
            int i13 = 0;
            while (i13 < i7) {
                String str6 = this.c5[i13];
                if (str6 != null && str6.equals(str5)) {
                    float min = Math.min(f, ((Long) objArr[1]).longValue() / ((Long) objArr[2]).longValue());
                    this.X0[i13].f(i13 == 0 || (i13 == 1 && this.r1 == this.D4) || (i13 == 2 && this.r1 == this.B4), min);
                    if (i13 == 0 && this.G2 != null && this.q3 != null) {
                        if (this.h5) {
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
                                f = this.Q3 ? ba4.G(this.U).t(this.c5[0], f2) : 1.0f;
                                this.S3 = elapsedRealtime;
                            } else {
                                i6 = i7;
                                f = -1.0f;
                            }
                        }
                        if (f != -1.0f) {
                            this.q3.f(f);
                            this.X8 = f;
                            this.r3.invalidate();
                        }
                        if (this.Q3 && this.E != null && !this.f3 && this.G2 != null && (k27Var2 = this.T4) != null && (F0 = k27Var2.F0()) != null && this.T4.L0() >= 20.0d) {
                            boolean z4 = F0.size >= 2147483648L;
                            if ((up3.q(this.U).l() & 4) != 0 && min < 0.9f) {
                                long j2 = F0.size;
                                if (j2 * min >= 5242880.0f || (min >= 0.5f && j2 >= 2097152)) {
                                    if (Math.abs(SystemClock.elapsedRealtime() - this.g3) >= (z4 ? 10000 : 3000)) {
                                        if (this.G2.U() == j) {
                                            Toast.makeText(this.E, k96.M0(2131743356, null), 1).show();
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
        if (i == kk7.f3) {
            w97 w97Var = (w97) objArr[0];
            if (this.z5 == w97Var.a) {
                this.r2 = w97Var;
                ArrayList arrayList3 = new ArrayList(w97Var.b);
                if (this.z5 > 0) {
                    TLRPC.UserFull W1 = na7.q1(this.U).W1(this.z5);
                    TLRPC.User V1 = na7.q1(this.U).V1(Long.valueOf(this.z5));
                    if (W1 != null) {
                        TLRPC.Photo photo = W1.personal_photo;
                        if (photo instanceof TLRPC.TL_photo) {
                            arrayList3.add(0, photo);
                        }
                    }
                    if (V1 != null && V1.self && l7c.r(W1)) {
                        arrayList3.add(W1.fallback_photo);
                    }
                }
                this.a7.clear();
                this.c7.clear();
                this.b7.clear();
                this.d7.clear();
                this.f7.clear();
                int i14 = -1;
                for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                    TLRPC.Photo photo2 = (TLRPC.Photo) arrayList3.get(i15);
                    if (photo2 == null || (photo2 instanceof TLRPC.TL_photoEmpty) || (arrayList2 = photo2.sizes) == null) {
                        this.a7.add(null);
                        this.c7.add(null);
                        this.b7.add(null);
                        this.d7.add(null);
                        this.f7.add(null);
                    } else {
                        TLRPC.PhotoSize w = ba4.w(arrayList2, 640, false, null, false);
                        TLRPC.VideoSize x = photo2.video_sizes.isEmpty() ? null : ba4.x(1000, photo2.video_sizes);
                        if (w != null) {
                            if (i14 == -1 && this.Z4 != null) {
                                int i16 = 0;
                                while (true) {
                                    if (i16 >= photo2.sizes.size()) {
                                        break;
                                    }
                                    TLRPC.FileLocation fileLocation = photo2.sizes.get(i16).location;
                                    if (fileLocation != null) {
                                        int i17 = fileLocation.local_id;
                                        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = this.Z4.f;
                                        if (i17 == tL_fileLocationToBeDeprecated.local_id && fileLocation.volume_id == tL_fileLocationToBeDeprecated.volume_id) {
                                            i14 = this.a7.size();
                                            break;
                                        }
                                    }
                                    i16++;
                                }
                            }
                            if (i14 == -1 && this.Z4 != null) {
                                int i18 = 0;
                                while (true) {
                                    if (i18 >= photo2.video_sizes.size()) {
                                        break;
                                    }
                                    TLRPC.FileLocation fileLocation2 = photo2.video_sizes.get(i18).location;
                                    if (fileLocation2 != null) {
                                        int i19 = fileLocation2.local_id;
                                        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated2 = this.Z4.f;
                                        if (i19 == tL_fileLocationToBeDeprecated2.local_id && fileLocation2.volume_id == tL_fileLocationToBeDeprecated2.volume_id) {
                                            i14 = this.a7.size();
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
                            gl5 i21 = gl5.i(w, photo2);
                            gl5 j3 = x != null ? gl5.j(x, photo2) : i21;
                            if (i21 != null) {
                                this.a7.add(i21);
                                this.c7.add(j3 != null ? Long.valueOf(j3.r) : null);
                                this.b7.add(j3);
                                this.d7.add(null);
                                this.f7.add(photo2);
                            }
                        }
                    }
                }
                boolean isEmpty = this.f7.isEmpty();
                r7 r7Var = this.p0;
                if (isEmpty) {
                    r7Var.u(7);
                } else {
                    r7Var.S(7);
                }
                this.N5 = false;
                this.P4 = -1;
                if (i14 != -1) {
                    J1(i14);
                    return;
                }
                long j4 = this.z5;
                int i22 = this.U;
                if (j4 > 0) {
                    user = na7.q1(i22).V1(Long.valueOf(this.z5));
                    K0 = null;
                } else {
                    K0 = na7.q1(i22).K0(Long.valueOf(-this.z5));
                    user = null;
                }
                if (user != null) {
                    m = gl5.m(this.U, 0, user);
                } else if (K0 == null) {
                    return;
                } else {
                    m = gl5.m(this.U, 0, K0);
                }
                if (m != null) {
                    if (!this.a7.isEmpty() && this.a7.get(0) != null && ((gl5) this.a7.get(0)).s == m.s) {
                        this.a7.remove(0);
                        this.f7.remove(0);
                        this.c7.remove(0);
                        this.b7.remove(0);
                        this.d7.remove(0);
                    }
                    this.a7.add(0, m);
                    this.f7.add(0, new TLRPC.TL_photoEmpty());
                    ArrayList arrayList4 = this.c7;
                    gl5 gl5Var = this.a5;
                    arrayList4.add(0, gl5Var != null ? Long.valueOf(gl5Var.r) : null);
                    this.b7.add(0, this.a5);
                    this.d7.add(0, null);
                    J1(0);
                    return;
                }
                return;
            }
            return;
        }
        if (i == kk7.V) {
            long longValue = ((Long) objArr[0]).longValue();
            long longValue2 = ((Long) objArr[1]).longValue();
            if (this.D5 == longValue2) {
                if (longValue == this.E5 || longValue == this.I5) {
                    k27 k27Var4 = this.T4;
                    if (k27Var4 == null || hq6.h0(k27Var4.k) == this.C5) {
                        if (longValue == this.E5) {
                            this.J5 = ((Integer) objArr[2]).intValue();
                        } else {
                            this.L5 = ((Integer) objArr[2]).intValue();
                        }
                        if (this.N5 && this.M5) {
                            this.M5 = false;
                            this.O5 = true;
                            hq6.d0(this.U).P0(this.E5, 20, 0, 0, this.C5, longValue2, 1, this.c, 0, this.F5, null);
                            return;
                        } else {
                            if (this.Y6.isEmpty()) {
                                return;
                            }
                            O1(true, true, false, this.Q4);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (i == kk7.U) {
            long longValue3 = ((Long) objArr[0]).longValue();
            int intValue = ((Integer) objArr[3]).intValue();
            long j5 = this.E5;
            if ((longValue3 == j5 || longValue3 == this.I5) && intValue == this.c) {
                this.O5 = false;
                char c2 = longValue3 == j5 ? (char) 0 : (char) 1;
                ArrayList arrayList5 = (ArrayList) objArr[2];
                this.P5[c2 == true ? 1 : 0] = ((Boolean) objArr[5]).booleanValue();
                boolean booleanValue = ((Boolean) objArr[6]).booleanValue();
                if (!this.N5) {
                    int i23 = 0;
                    for (int i24 = 0; i24 < arrayList5.size(); i24++) {
                        k27 k27Var5 = (k27) arrayList5.get(booleanValue ? (arrayList5.size() - 1) - i24 : i24);
                        if (this.Z6[c2 == true ? 1 : 0].indexOfKey(k27Var5.e1()) < 0) {
                            i23++;
                            boolean z5 = this.Q5;
                            ArrayList arrayList6 = this.Y6;
                            if (!z5) {
                                arrayList6.add(0, k27Var5);
                            } else if (booleanValue) {
                                arrayList6.add(0, k27Var5);
                                int i25 = this.K5 - 1;
                                this.K5 = i25;
                                this.P4++;
                                if (i25 < 0) {
                                    this.K5 = 0;
                                }
                            } else {
                                arrayList6.add(k27Var5);
                            }
                            this.Z6[c2 == true ? 1 : 0].put(k27Var5.e1(), k27Var5);
                        }
                    }
                    if (this.Q5) {
                        if (i23 != 0 || booleanValue) {
                            return;
                        }
                        this.J5 = this.Y6.size() + this.K5;
                        this.L5 = 0;
                        return;
                    }
                    if (i23 == 0) {
                        this.J5 = this.Y6.size();
                        this.L5 = 0;
                        return;
                    } else {
                        int i26 = this.P4;
                        this.P4 = -1;
                        J1(i26 + i23);
                        return;
                    }
                }
                if ((arrayList5.isEmpty() && (c2 != 0 || this.I5 == 0)) || (i4 = this.P4) < 0 || i4 >= this.Y6.size()) {
                    this.N5 = false;
                    return;
                }
                k27 k27Var6 = (k27) this.Y6.get(this.P4);
                int i27 = -1;
                int i28 = 0;
                for (int i29 = 0; i29 < arrayList5.size(); i29++) {
                    k27 k27Var7 = (k27) arrayList5.get(i29);
                    if (!k27Var7.x3() && this.X6[c2 == true ? 1 : 0].indexOfKey(k27Var7.e1()) < 0) {
                        this.X6[c2 == true ? 1 : 0].put(k27Var7.e1(), k27Var7);
                        boolean z6 = this.Q5;
                        ArrayList arrayList7 = this.W6;
                        if (z6) {
                            arrayList7.add(k27Var7);
                            if (k27Var7.e1() == k27Var6.e1()) {
                                i27 = i28;
                            }
                            i28++;
                        } else {
                            i28++;
                            arrayList7.add(0, k27Var7);
                            if (k27Var7.e1() == k27Var6.e1()) {
                                i27 = arrayList5.size() - i28;
                            }
                        }
                    }
                }
                if (i28 == 0 && (c2 != 0 || this.I5 == 0)) {
                    this.J5 = this.Y6.size();
                    this.L5 = 0;
                }
                if (i27 != -1) {
                    this.Y6.clear();
                    this.Y6.addAll(this.W6);
                    for (int i30 = 0; i30 < 2; i30++) {
                        this.Z6[i30] = this.X6[i30].clone();
                        this.X6[i30].clear();
                    }
                    this.W6.clear();
                    this.N5 = false;
                    this.P4 = -1;
                    if (i27 >= this.Y6.size()) {
                        i27 = this.Y6.size() - 1;
                    }
                    J1(i27);
                    return;
                }
                boolean z7 = this.Q5;
                ArrayList arrayList8 = this.W6;
                if (z7) {
                    e1 = arrayList8.isEmpty() ? 0 : ((k27) b00.f(1, this.W6)).e1();
                    if (c2 == 0 && this.P5[c2 == true ? 1 : 0] && this.I5 != 0) {
                        if (!this.W6.isEmpty()) {
                        }
                        i5 = e1;
                        c = 1;
                    }
                    i5 = e1;
                    c = c2;
                } else {
                    e1 = arrayList8.isEmpty() ? 0 : ((k27) this.W6.get(0)).e1();
                    if (c2 == 0 && this.P5[c2 == true ? 1 : 0] && this.I5 != 0) {
                        if (!this.W6.isEmpty()) {
                        }
                        i5 = e1;
                        c = 1;
                    }
                    i5 = e1;
                    c = c2;
                }
                if (this.P5[c]) {
                    return;
                }
                this.O5 = true;
                hq6.d0(this.U).P0(c == 0 ? this.E5 : this.I5, 40, i5, 0, this.C5, this.D5, 1, this.c, 0, this.F5, null);
                return;
            }
            return;
        }
        if (i == kk7.k4) {
            g98 g98Var = this.R1;
            if (g98Var != null) {
                g98Var.getCurrentView().invalidate();
                g98Var.getNextView().invalidate();
                return;
            }
            return;
        }
        if (i == kk7.b2) {
            k27 k27Var8 = (k27) objArr[0];
            if (this.G8) {
                this.G8 = false;
                this.W7.setVisibility(4);
                s1(this.V4, this.W4, false, false, this.X4.d, false, 0L);
                return;
            } else if (this.F8) {
                v1(false);
                this.F8 = !MediaController.w().g0(this.E8, true, true, false);
                return;
            } else {
                if (k27Var8 == this.E8) {
                    this.I8 = false;
                    this.W7.setVisibility(4);
                    return;
                }
                return;
            }
        }
        if (i == kk7.a2) {
            if (((k27) objArr[0]) == this.E8) {
                String str7 = (String) objArr[1];
                long longValue4 = ((Long) objArr[3]).longValue();
                this.X0[0].f(true, ((Float) objArr[4]).floatValue());
                if (longValue4 != 0) {
                    this.I8 = false;
                    this.X0[0].f(true, 1.0f);
                    this.X0[0].d(3, true, true);
                    s1(null, Uri.fromFile(new File(str7)), false, true, this.X4.d, false, 0L);
                    return;
                }
                return;
            }
            return;
        }
        if (i == kk7.l0) {
            if (this.E5 == ((Long) objArr[0]).longValue()) {
                ArrayList arrayList9 = (ArrayList) objArr[1];
                int i31 = 0;
                boolean z8 = false;
                while (i31 < arrayList9.size()) {
                    k27 k27Var9 = (k27) arrayList9.get(i31);
                    if (k27Var9 != null) {
                        if (this.Y6 != null) {
                            i3 = 0;
                            while (i3 < this.Y6.size()) {
                                k27Var = (k27) this.Y6.get(i3);
                                if (k27Var != null && k27.B0(k27Var.k) == k27.B0(k27Var9.k) && k27Var.e1() == k27Var9.e1()) {
                                    break;
                                } else {
                                    i3++;
                                }
                            }
                        }
                        i3 = -1;
                        k27Var = null;
                        if (k27Var != null) {
                            this.Y6.set(i3, k27Var9);
                            if (this.P4 == i3) {
                                z8 = true;
                            }
                        }
                    }
                    i31++;
                    z8 = z8;
                }
                if (z8) {
                    K1(false, true, true, this.P4);
                    return;
                }
                return;
            }
            return;
        }
        if (i == kk7.x1) {
            if (this.E5 == ((Long) objArr[0]).longValue()) {
                B(true, false);
                return;
            }
            return;
        }
        if (i != kk7.v || ((Boolean) objArr[2]).booleanValue()) {
            return;
        }
        long longValue5 = ((Long) objArr[1]).longValue();
        ArrayList arrayList10 = (ArrayList) objArr[0];
        int i32 = 0;
        boolean z9 = false;
        boolean z10 = false;
        while (i32 < i8) {
            if (i32 == 0) {
                arrayList = this.Y6;
                sparseArrayArr = this.Z6;
            } else {
                arrayList = this.W6;
                sparseArrayArr = this.X6;
            }
            if (!arrayList.isEmpty()) {
                int i33 = i10;
                while (i33 < i8) {
                    if (sparseArrayArr[i33].size() > 0 && ((k27) sparseArrayArr[i33].valueAt(i10)).k.peer_id.channel_id == longValue5) {
                        int size = arrayList10.size();
                        int i34 = i10;
                        while (i34 < size) {
                            int intValue2 = ((Integer) arrayList10.get(i34)).intValue();
                            boolean z11 = z;
                            k27 k27Var10 = (k27) sparseArrayArr[i33].get(((Integer) arrayList10.get(i34)).intValue());
                            if (k27Var10 != null) {
                                sparseArrayArr[i33].remove(intValue2);
                                arrayList.remove(k27Var10);
                                if (i33 == 0) {
                                    this.J5--;
                                } else {
                                    this.L5--;
                                }
                                if (k27Var10 == this.T4) {
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
            if (z10 && this == m9) {
                M();
                return;
            }
            if (this.Y6.isEmpty()) {
                B(false, z12);
                return;
            }
            int i35 = this.P4;
            this.P4 = -1;
            if (i35 >= this.Y6.size()) {
                i35 = this.Y6.size() - 1;
            }
            J1(i35);
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
        lm6 lm6Var;
        String str;
        View view;
        ?? r13;
        boolean z2;
        byte b;
        int i;
        o98 o98Var;
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
        mw5 mw5Var;
        l34 l34Var;
        PointF pointF;
        boolean z12;
        ArrayList arrayList2;
        Canvas canvas2;
        boolean z13;
        CharSequence charSequence;
        PhotoViewer photoViewer = this;
        int i6 = photoViewer.P4;
        if (i6 >= 0) {
            ArrayList arrayList3 = photoViewer.g7;
            if (i6 >= arrayList3.size() || !(arrayList3.get(photoViewer.P4) instanceof bm6)) {
                return;
            }
            Bitmap[] bitmapArr3 = new Bitmap[1];
            bm6 bm6Var = (bm6) arrayList3.get(photoViewer.P4);
            byte b2 = photoViewer.u4;
            byte b3 = 2;
            if (b2 == 1 || (b2 == 0 && photoViewer.d2 == 1)) {
                bitmapArr = bitmapArr3;
                f = 1000.0f;
                f2 = 2.0f;
                f3 = 1.0f;
                j33 j33Var = photoViewer.D1.b;
                RectF rectF = j33Var.O;
                CropAreaView cropAreaView = j33Var.a;
                if (j33Var.M != null) {
                    cropAreaView.d(rectF);
                    int ceil = (int) Math.ceil(j33.n(rectF, j33Var.P));
                    int ceil2 = (int) Math.ceil(r4 / cropAreaView.getAspectRatio());
                    float cropWidth = ceil / cropAreaView.getCropWidth();
                    if (bm6Var.j != null) {
                        Bitmap createBitmap2 = Bitmap.createBitmap(ceil, ceil2, Bitmap.Config.ARGB_8888);
                        Canvas canvas3 = new Canvas(createBitmap2);
                        String g = j33.g(bm6Var.j);
                        if (bm6Var.k != null) {
                            new File(bm6Var.k).delete();
                            bm6Var.k = null;
                        }
                        bm6Var.k = g;
                        ArrayList arrayList4 = bm6Var.p;
                        if (arrayList4 == null || arrayList4.isEmpty()) {
                            bm6Var.q = null;
                        } else {
                            bm6Var.q = new ArrayList(bm6Var.p.size());
                            int size = bm6Var.p.size();
                            for (int i7 = 0; i7 < size; i7++) {
                                bm6Var.q.add(((mac) bm6Var.p.get(i7)).a());
                            }
                        }
                        j33Var.getContext();
                        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.PNG;
                        Matrix matrix = j33Var.M.k;
                        int currentWidth = j33Var.getCurrentWidth();
                        int currentHeight = j33Var.getCurrentHeight();
                        h33 h33Var = j33Var.M;
                        j33.b(g, canvas3, createBitmap2, matrix, currentWidth, currentHeight, h33Var.e, h33Var.i, (int) h33Var.h, cropWidth, bm6Var.q);
                    }
                    zl6 zl6Var = bm6Var.A;
                    if (zl6Var == null) {
                        zl6Var = new zl6();
                        bm6Var.A = zl6Var;
                    }
                    j33Var.a(zl6Var);
                }
                if (bm6Var.A == null && photoViewer.u4 != 1) {
                    return;
                }
                if (photoViewer.s1) {
                    if (!TextUtils.isEmpty(bm6Var.i)) {
                        n = fl5.G(bm6Var.i, null, U(bm6Var), U(bm6Var), true);
                    } else if (bm6Var.d() && !TextUtils.isEmpty(bm6Var.a())) {
                        n = fl5.G(bm6Var.a(), null, U(bm6Var), U(bm6Var), true);
                    } else if (photoViewer.d2 == 1) {
                        int[] iArr2 = new int[1];
                        iArr = iArr2;
                        n = z3a.r(bm6Var.a(), photoViewer.B8 / 1000, iArr2, true);
                    } else {
                        n = z3a.r(bm6Var.a(), (long) (photoViewer.Y7.getLeftProgress() * photoViewer.G2.U() * 1000.0f), null, false);
                        z = false;
                        arrayList = null;
                        list = null;
                        iArr = null;
                        lm6Var = null;
                    }
                    arrayList = null;
                    list = null;
                    iArr = null;
                    lm6Var = null;
                    z = false;
                } else {
                    n = photoViewer.C4.n();
                    ImageReceiver imageReceiver = photoViewer.C4;
                    iArr = new int[]{imageReceiver.V, imageReceiver.W};
                }
                arrayList = null;
                list = null;
                lm6Var = null;
                z = false;
            } else if (b2 == 2) {
                Bitmap bitmap5 = photoViewer.J1.getBitmap();
                mza mzaVar = photoViewer.p5;
                f = 1000.0f;
                int i8 = photoViewer.C4.V;
                n = mzaVar.e(bitmap5);
                lm6Var = photoViewer.J1.getSavedFilterState();
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
                    q88 q88Var = photoViewer.M1;
                    f3 = 1.0f;
                    int i11 = q88Var.F1;
                    mw5 mw5Var2 = q88Var.P0;
                    Bitmap c = q88Var.M0.c(false, false);
                    q88Var.f1 = BigInteger.ONE;
                    if (c != null) {
                        int i12 = 0;
                        for (int i13 = 0; i13 < mw5Var2.getChildCount(); i13++) {
                            if (mw5Var2.getChildAt(i13) instanceof l34) {
                                i12++;
                            }
                        }
                        if (i12 > 0) {
                            int childCount = mw5Var2.getChildCount();
                            int i14 = 0;
                            Canvas canvas4 = null;
                            while (i14 < childCount) {
                                byte b4 = b3;
                                View childAt = mw5Var2.getChildAt(i14);
                                if (childAt instanceof l34) {
                                    l34 l34Var2 = (l34) childAt;
                                    PointF position = l34Var2.getPosition();
                                    if (!(l34Var2 instanceof cc1)) {
                                        if (arrayList5 != null) {
                                            mac macVar = new mac();
                                            canvas = canvas4;
                                            bitmapArr2 = bitmapArr3;
                                            if (l34Var2 instanceof vhb) {
                                                macVar.a = (byte) 1;
                                                vhb vhbVar = (vhb) l34Var2;
                                                CharSequence text = vhbVar.getText();
                                                if (text instanceof Spanned) {
                                                    Spanned spanned = (Spanned) text;
                                                    charSequence = text;
                                                    z11 = a;
                                                    i4 = childCount;
                                                    gm[] gmVarArr = (gm[]) spanned.getSpans(0, charSequence.length(), gm.class);
                                                    if (gmVarArr != null) {
                                                        int i15 = 0;
                                                        while (i15 < gmVarArr.length) {
                                                            gm gmVar = gmVarArr[i15];
                                                            gm[] gmVarArr2 = gmVarArr;
                                                            TLRPC.Document document = gmVar.document;
                                                            int i16 = i14;
                                                            mw5 mw5Var3 = mw5Var2;
                                                            if (document == null) {
                                                                document = vl.e(i11, gmVar.getDocumentId());
                                                            }
                                                            if (document != null) {
                                                                vl.g(i11).e(document);
                                                            }
                                                            lac lacVar = new lac();
                                                            PointF pointF2 = position;
                                                            int i17 = i15;
                                                            lacVar.document_id = gmVar.getDocumentId();
                                                            lacVar.document = document;
                                                            lacVar.offset = spanned.getSpanStart(gmVar);
                                                            lacVar.length = spanned.getSpanEnd(gmVar) - lacVar.offset;
                                                            ba4.G(i11);
                                                            lacVar.a = ba4.J(document, null, true, true).getAbsolutePath();
                                                            boolean K2 = k27.K2(lacVar.document, true);
                                                            if (K2 || k27.N4(lacVar.document)) {
                                                                lacVar.c = (byte) (lacVar.c | (K2 ? (byte) 1 : (byte) 4));
                                                            }
                                                            macVar.k.add(lacVar);
                                                            if (document != null) {
                                                                BigInteger valueOf = BigInteger.valueOf(5000L);
                                                                q88Var.f1 = q88Var.f1.multiply(valueOf).divide(q88Var.f1.gcd(valueOf));
                                                            }
                                                            i15 = i17 + 1;
                                                            position = pointF2;
                                                            gmVarArr = gmVarArr2;
                                                            mw5Var2 = mw5Var3;
                                                            i14 = i16;
                                                        }
                                                    }
                                                    i5 = i14;
                                                    mw5Var = mw5Var2;
                                                    pointF = position;
                                                    macVar.k.isEmpty();
                                                } else {
                                                    charSequence = text;
                                                    z11 = a;
                                                    i4 = childCount;
                                                    i5 = i14;
                                                    mw5Var = mw5Var2;
                                                    pointF = position;
                                                }
                                                macVar.j = charSequence.toString();
                                                macVar.b = (byte) vhbVar.getType();
                                                macVar.l = vhbVar.getSwatch().a;
                                                macVar.m = vhbVar.getTextSize();
                                                macVar.n = vhbVar.getTypeface();
                                                macVar.p = vhbVar.getAlign();
                                            } else {
                                                z11 = a;
                                                i4 = childCount;
                                                i5 = i14;
                                                mw5Var = mw5Var2;
                                                pointF = position;
                                                if (l34Var2 instanceof yza) {
                                                    macVar.a = (byte) 0;
                                                    yza yzaVar = (yza) l34Var2;
                                                    via baseSize = yzaVar.getBaseSize();
                                                    macVar.f = baseSize.a;
                                                    macVar.g = baseSize.b;
                                                    macVar.B = yzaVar.getSticker();
                                                    macVar.C = yzaVar.getParentObject();
                                                    TLRPC.Document sticker = yzaVar.getSticker();
                                                    ba4.G(y6c.t0);
                                                    macVar.j = ba4.J(sticker, null, true, true).getAbsolutePath();
                                                    if (k27.K2(sticker, true) || k27.N4(sticker)) {
                                                        boolean K22 = k27.K2(sticker, true);
                                                        macVar.b = (byte) (macVar.b | (K22 ? (byte) 1 : (byte) 4));
                                                        long duration = K22 ? yzaVar.getDuration() : 5000L;
                                                        if (duration != 0) {
                                                            BigInteger valueOf2 = BigInteger.valueOf(duration);
                                                            q88Var.f1 = q88Var.f1.multiply(valueOf2).divide(q88Var.f1.gcd(valueOf2));
                                                        }
                                                    }
                                                    if (yzaVar.v0) {
                                                        macVar.b = (byte) (macVar.b | 2);
                                                    }
                                                } else if (l34Var2 instanceof e68) {
                                                    e68 e68Var = (e68) l34Var2;
                                                    macVar.a = b4;
                                                    via baseSize2 = e68Var.getBaseSize();
                                                    macVar.f = baseSize2.a;
                                                    macVar.g = baseSize2.b;
                                                    macVar.j = e68Var.q(i11);
                                                    if (e68Var.v0) {
                                                        macVar.b = (byte) (macVar.b | b4);
                                                    }
                                                    z13 = false;
                                                    arrayList5.add(macVar);
                                                    float scaleX = childAt.getScaleX();
                                                    float scaleY = childAt.getScaleY();
                                                    float x = childAt.getX();
                                                    float y = childAt.getY();
                                                    macVar.q = childAt.getWidth();
                                                    macVar.r = childAt.getHeight();
                                                    z12 = z13;
                                                    macVar.f = (childAt.getWidth() * scaleX) / mw5Var.getMeasuredWidth();
                                                    macVar.g = (childAt.getHeight() * scaleY) / mw5Var.getMeasuredHeight();
                                                    macVar.c = ((((1.0f - scaleX) * childAt.getWidth()) / 2.0f) + x) / mw5Var.getMeasuredWidth();
                                                    macVar.d = ((((1.0f - scaleY) * childAt.getHeight()) / 2.0f) + y) / mw5Var.getMeasuredHeight();
                                                    l34Var = l34Var2;
                                                    macVar.e = (float) ((-childAt.getRotation()) * 0.017453292519943295d);
                                                    macVar.y = ((childAt.getWidth() / 2.0f) + x) / mw5Var.getMeasuredWidth();
                                                    macVar.z = ((childAt.getHeight() / 2.0f) + y) / mw5Var.getMeasuredHeight();
                                                    macVar.w = macVar.q / mw5Var.getMeasuredWidth();
                                                    macVar.x = macVar.r / mw5Var.getMeasuredHeight();
                                                    macVar.v = scaleX;
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
                                                    mw5Var2 = mw5Var;
                                                    b3 = 2;
                                                }
                                            }
                                            z13 = true;
                                            arrayList5.add(macVar);
                                            float scaleX2 = childAt.getScaleX();
                                            float scaleY2 = childAt.getScaleY();
                                            float x2 = childAt.getX();
                                            float y2 = childAt.getY();
                                            macVar.q = childAt.getWidth();
                                            macVar.r = childAt.getHeight();
                                            z12 = z13;
                                            macVar.f = (childAt.getWidth() * scaleX2) / mw5Var.getMeasuredWidth();
                                            macVar.g = (childAt.getHeight() * scaleY2) / mw5Var.getMeasuredHeight();
                                            macVar.c = ((((1.0f - scaleX2) * childAt.getWidth()) / 2.0f) + x2) / mw5Var.getMeasuredWidth();
                                            macVar.d = ((((1.0f - scaleY2) * childAt.getHeight()) / 2.0f) + y2) / mw5Var.getMeasuredHeight();
                                            l34Var = l34Var2;
                                            macVar.e = (float) ((-childAt.getRotation()) * 0.017453292519943295d);
                                            macVar.y = ((childAt.getWidth() / 2.0f) + x2) / mw5Var.getMeasuredWidth();
                                            macVar.z = ((childAt.getHeight() / 2.0f) + y2) / mw5Var.getMeasuredHeight();
                                            macVar.w = macVar.q / mw5Var.getMeasuredWidth();
                                            macVar.x = macVar.r / mw5Var.getMeasuredHeight();
                                            macVar.v = scaleX2;
                                            if (bitmapArr2[0] == null) {
                                            }
                                        } else {
                                            canvas = canvas4;
                                            bitmapArr2 = bitmapArr3;
                                            z11 = a;
                                            i4 = childCount;
                                            i5 = i14;
                                            mw5Var = mw5Var2;
                                            l34Var = l34Var2;
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
                                                canvas7.translate((-l34Var.getWidth()) / 2.0f, (-l34Var.getHeight()) / 2.0f);
                                                if (!(childAt instanceof vhb) || childAt.getHeight() <= 0 || childAt.getWidth() <= 0) {
                                                    arrayList2 = arrayList5;
                                                    canvas2 = canvas6;
                                                    childAt.draw(canvas7);
                                                } else {
                                                    int width = childAt.getWidth();
                                                    int height = childAt.getHeight();
                                                    Bitmap.Config config = Bitmap.Config.ARGB_8888;
                                                    Bitmap a2 = dc1.a(width, height);
                                                    Canvas canvas8 = new Canvas(a2);
                                                    childAt.draw(canvas8);
                                                    arrayList2 = arrayList5;
                                                    canvas2 = canvas6;
                                                    canvas7.drawBitmap(a2, (Rect) null, new Rect(0, 0, a2.getWidth(), a2.getHeight()), (Paint) null);
                                                    try {
                                                        canvas8.setBitmap(null);
                                                    } catch (Exception e) {
                                                        fa4.g(e, true);
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
                                        mw5Var2 = mw5Var;
                                        b3 = 2;
                                    } else if (arrayList5 != null) {
                                        ((cc1) l34Var2).y(mw5Var2.getMeasuredWidth(), mw5Var2.getMeasuredHeight(), arrayList5);
                                    }
                                }
                                canvas = canvas4;
                                bitmapArr2 = bitmapArr3;
                                z11 = a;
                                i4 = childCount;
                                i5 = i14;
                                mw5Var = mw5Var2;
                                canvas4 = canvas;
                                i14 = i5 + 1;
                                arrayList5 = arrayList5;
                                bitmapArr3 = bitmapArr2;
                                a = z11;
                                childCount = i4;
                                mw5Var2 = mw5Var;
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
                    lm6Var = null;
                } else {
                    bitmapArr = bitmapArr3;
                    f2 = 2.0f;
                    f3 = 1.0f;
                    if (b2 == 4) {
                        Bitmap bitmap6 = photoViewer.O1.getBitmap();
                        photoViewer.C4.f0(bitmap6);
                        photoViewer.f(bitmap6);
                        photoViewer.v5.m(false, true);
                        photoViewer.w5.m(false, true);
                        mza mzaVar2 = photoViewer.p5;
                        if (mzaVar2 != null) {
                            int i19 = photoViewer.C4.V - mzaVar2.K;
                            if (i19 == 0) {
                                jza jzaVar = mzaVar2.F;
                                if (jzaVar != null) {
                                    jzaVar.e = mzaVar2.d(0, 0, bitmap6, true);
                                    jza jzaVar2 = mzaVar2.F;
                                    jzaVar2.g = jzaVar2.c();
                                    mza.c(mzaVar2.F, mzaVar2.U, mzaVar2.V);
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
                            mza mzaVar3 = photoViewer.p5;
                            jza jzaVar3 = mzaVar3.F;
                            if (jzaVar3 != null) {
                                jzaVar3.e = mzaVar3.d(0, 0, createBitmap3, true);
                                jza jzaVar4 = mzaVar3.F;
                                jzaVar4.g = jzaVar4.c();
                                mza.c(mzaVar3.F, mzaVar3.U, mzaVar3.V);
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
                    lm6Var = null;
                    z = false;
                }
            }
            if (n != null) {
                if (bm6Var.c != null) {
                    new File(bm6Var.c).delete();
                    str = null;
                    bm6Var.c = null;
                } else {
                    str = null;
                }
                if (bm6Var.h != null) {
                    new File(bm6Var.h).delete();
                    bm6Var.h = str;
                }
                byte b5 = photoViewer.u4;
                h98 h98Var = photoViewer.X4;
                if (b5 == 1 || (b5 == 0 && photoViewer.d2 == 1)) {
                    view = null;
                    r13 = 0;
                    r13 = 0;
                    r13 = 0;
                    r13 = 0;
                    zl6 zl6Var2 = bm6Var.A;
                    h98Var.c = zl6Var2;
                    h98Var.b = bm6Var.k;
                    h98Var.f = bm6Var.q;
                    if (zl6Var2 != null) {
                        Bitmap F = F(n, zl6Var2, iArr, true);
                        if (bm6Var.j != null) {
                            Bitmap decodeFile = BitmapFactory.decodeFile(bm6Var.l);
                            Bitmap F2 = F(decodeFile, bm6Var.A, null, false);
                            if (!photoViewer.s1 || bm6Var.d()) {
                                if (photoViewer.B0()) {
                                    TLRPC.PhotoSize V = fl5.V(F, photoViewer.e0(), gl.Y0(false), gl.Y0(false), 87);
                                    ba4.G(photoViewer.U);
                                    String file = ba4.K(V, true).toString();
                                    photoViewer.g5 = file;
                                    bm6Var.h = file;
                                } else {
                                    String x0 = x0();
                                    bm6Var.h = x0;
                                    photoViewer.W0(x0, null, F2, F, gl.Y0(false), true);
                                }
                            }
                            String x02 = x0();
                            bm6Var.c = x02;
                            photoViewer = this;
                            photoViewer.W0(x02, null, F2, F, 512.0f, true);
                            if (F2 != null) {
                                F2.recycle();
                            }
                            if (decodeFile != null) {
                                decodeFile.recycle();
                            }
                        } else {
                            if (!photoViewer.s1 || bm6Var.d()) {
                                TLRPC.PhotoSize V2 = fl5.V(F, photoViewer.e0(), gl.Y0(false), gl.Y0(false), 87);
                                ba4.G(photoViewer.U);
                                String file2 = ba4.K(V2, true).toString();
                                photoViewer.g5 = file2;
                                bm6Var.h = file2;
                            }
                            TLRPC.PhotoSize T = fl5.T(F, 512.0f, 512.0f, 70, 101, 101);
                            ba4.G(photoViewer.U);
                            bm6Var.c = ba4.K(T, true).toString();
                        }
                        if (photoViewer.u4 == 0 && photoViewer.s1) {
                            n.recycle();
                            n = F;
                        }
                    }
                } else if (b5 == 2) {
                    if (bm6Var.i != null) {
                        new File(bm6Var.i).delete();
                    }
                    TLRPC.PhotoSize V3 = fl5.V(n, photoViewer.e0(), gl.Y0(true), gl.Y0(true), 87);
                    ba4.G(photoViewer.U);
                    bm6Var.i = ba4.J(V3, null, true, true).toString();
                    zl6 zl6Var3 = bm6Var.A;
                    Bitmap F3 = zl6Var3 != null ? F(n, zl6Var3, null, true) : n;
                    String str4 = bm6Var.j;
                    if (str4 == null) {
                        if (!photoViewer.s1 || bm6Var.d()) {
                            TLRPC.PhotoSize V4 = fl5.V(F3, photoViewer.e0(), gl.Y0(false), gl.Y0(false), 87);
                            ba4.G(photoViewer.U);
                            str3 = null;
                            z10 = true;
                            String file3 = ba4.J(V4, null, true, true).toString();
                            photoViewer.g5 = file3;
                            bm6Var.h = file3;
                        } else {
                            str3 = null;
                            z10 = true;
                        }
                        TLRPC.PhotoSize V5 = fl5.V(F3, photoViewer.e0(), 512.0f, 512.0f, 83);
                        ba4.G(photoViewer.U);
                        bm6Var.c = ba4.J(V5, str3, z10, z10).toString();
                        view = null;
                        z9 = false;
                        bitmap3 = F3;
                    } else {
                        String str5 = bm6Var.l;
                        Bitmap bitmap7 = str4.equals(str5) ? photoViewer.y4.getBitmap() : null;
                        zl6 zl6Var4 = bm6Var.A;
                        if (zl6Var4 != null) {
                            if (bitmap7 == null) {
                                Bitmap decodeFile2 = BitmapFactory.decodeFile(bm6Var.l);
                                view = null;
                                Bitmap F4 = F(decodeFile2, bm6Var.A, null, false);
                                decodeFile2.recycle();
                                bitmap7 = F4;
                            } else {
                                view = null;
                                bitmap7 = F(bitmap7, zl6Var4, null, false);
                            }
                            z7 = true;
                        } else {
                            view = null;
                            z7 = false;
                        }
                        if (!photoViewer.s1 || bm6Var.d()) {
                            if (photoViewer.B0()) {
                                TLRPC.PhotoSize V6 = fl5.V(F3, photoViewer.e0(), gl.Y0(false), gl.Y0(false), 87);
                                ba4.G(photoViewer.U);
                                String file4 = ba4.K(V6, true).toString();
                                photoViewer.g5 = file4;
                                bm6Var.h = file4;
                            } else {
                                bitmap3 = F3;
                                String x03 = x0();
                                bm6Var.h = x03;
                                bitmap4 = bitmap7;
                                str2 = str5;
                                z8 = false;
                                photoViewer.W0(x03, str2, bitmap4, bitmap3, gl.Y0(false), true);
                                String x04 = x0();
                                bm6Var.c = x04;
                                photoViewer = this;
                                photoViewer.W0(x04, str2, bitmap4, bitmap3, 512.0f, true);
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
                        bitmap3 = F3;
                        String x042 = x0();
                        bm6Var.c = x042;
                        photoViewer = this;
                        photoViewer.W0(x042, str2, bitmap4, bitmap3, 512.0f, true);
                        z9 = z8;
                        if (z7) {
                        }
                    }
                    r13 = z9;
                    if (bm6Var.A != null) {
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
                        if (bm6Var.j != null) {
                            new File(bm6Var.j).delete();
                            if (!bm6Var.j.equals(bm6Var.l)) {
                                new File(bm6Var.l).delete();
                            }
                        }
                        Bitmap.CompressFormat compressFormat2 = Bitmap.CompressFormat.PNG;
                        TLRPC.PhotoSize V7 = fl5.V(n, compressFormat2, gl.Y0(false), gl.Y0(false), 87);
                        bm6Var.r = list != null ? new ArrayList(list) : null;
                        ba4.G(photoViewer.U);
                        String file5 = ba4.K(V7, true).toString();
                        h98Var.a = file5;
                        bm6Var.j = file5;
                        ju7 ju7Var = photoViewer.y4;
                        ArrayList arrayList6 = (arrayList == null || arrayList.isEmpty()) ? null : arrayList;
                        h98Var.e = arrayList6;
                        bm6Var.p = arrayList6;
                        ju7Var.b(arrayList6, photoViewer.s1, true, photoViewer.d2 != 11);
                        long lcm = photoViewer.M1.getLcm();
                        h98Var.g = lcm;
                        bm6Var.t = lcm;
                        if (bm6Var.p == null || (bitmap2 = bitmapArr[0]) == null) {
                            bm6Var.l = bm6Var.j;
                        } else {
                            TLRPC.PhotoSize V8 = fl5.V(bitmap2, compressFormat2, gl.Y0(false), gl.Y0(false), 87);
                            ba4.G(photoViewer.U);
                            bm6Var.l = ba4.K(V8, true).toString();
                        }
                        photoViewer.y4.setBitmap(n);
                        zl6 zl6Var5 = bm6Var.A;
                        if (zl6Var5 != null && zl6Var5.C) {
                            String g2 = j33.g(h98Var.a);
                            if (h98Var.b != null) {
                                new File(h98Var.b).delete();
                                h98Var.b = null;
                            }
                            h98Var.b = g2;
                            ArrayList arrayList7 = h98Var.e;
                            if (arrayList7 == null || arrayList7.isEmpty()) {
                                h98Var.f = null;
                            } else {
                                h98Var.f = new ArrayList(h98Var.e.size());
                                int size2 = h98Var.e.size();
                                for (int i20 = 0; i20 < size2; i20++) {
                                    h98Var.f.add(((mac) h98Var.e.get(i20)).a());
                                }
                            }
                            zl6 zl6Var6 = bm6Var.A;
                            Bitmap createBitmap4 = Bitmap.createBitmap(zl6Var6.s, zl6Var6.t, Bitmap.Config.ARGB_8888);
                            Canvas canvas10 = new Canvas(createBitmap4);
                            if (photoViewer.s1) {
                                kac kacVar = (kac) photoViewer.C2;
                                q = kacVar.getVideoWidth();
                                o = kacVar.getVideoHeight();
                            } else {
                                q = photoViewer.C4.q();
                                o = photoViewer.C4.o();
                            }
                            int i21 = o;
                            int i22 = q;
                            Bitmap.CompressFormat compressFormat3 = Bitmap.CompressFormat.PNG;
                            zl6 zl6Var7 = bm6Var.A;
                            j33.b(g2, canvas10, createBitmap4, zl6Var7.r, i22, i21, zl6Var7.m, zl6Var7.d, zl6Var7.k, zl6Var7.o, h98Var.f);
                            createBitmap4.recycle();
                            bm6Var.k = h98Var.b;
                            bm6Var.q = h98Var.f;
                        }
                        Bitmap bitmap8 = bitmapArr[0];
                        if (bitmap8 == null) {
                            bitmap8 = n;
                        }
                        zl6 zl6Var8 = bm6Var.A;
                        if (zl6Var8 == null || !zl6Var8.C) {
                            z4 = false;
                        } else {
                            bitmap8 = F(bitmap8, zl6Var8, null, false);
                            z4 = true;
                        }
                        Bitmap bitmap9 = bitmap8;
                        if (photoViewer.s1) {
                            String str6 = bm6Var.i;
                            if (str6 != null) {
                                z6 = true;
                                G = fl5.G(str6, null, U(bm6Var), U(bm6Var), true);
                            } else if (!bm6Var.d() || TextUtils.isEmpty(bm6Var.a())) {
                                G = z3a.r(bm6Var.a(), (long) (photoViewer.Y7.getLeftProgress() * photoViewer.G2.U() * f), null, false);
                                z6 = true;
                            } else {
                                z6 = true;
                                G = fl5.G(bm6Var.a(), null, U(bm6Var), U(bm6Var), true);
                            }
                            zl6 zl6Var9 = bm6Var.A;
                            createBitmap = zl6Var9 != null ? F(G, zl6Var9, null, z6) : G;
                            if (bm6Var.A != null) {
                                G.recycle();
                            }
                        } else {
                            ImageReceiver imageReceiver2 = photoViewer.C4;
                            int[] iArr3 = {imageReceiver2.V, imageReceiver2.W};
                            if (bm6Var.A != null) {
                                bitmap = F(imageReceiver2.n(), bm6Var.A, iArr3, true);
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
                            if (photoViewer.s1 || bm6Var.d()) {
                                if (photoViewer.B0()) {
                                    String x05 = x0();
                                    bm6Var.h = x05;
                                    photoViewer.W0(x05, null, bitmap, bitmap9, gl.Y0(false), false);
                                } else {
                                    TLRPC.PhotoSize V9 = fl5.V(bitmap, photoViewer.e0(), gl.Y0(false), gl.Y0(false), 87);
                                    ba4.G(photoViewer.U);
                                    String file6 = ba4.K(V9, true).toString();
                                    photoViewer.g5 = file6;
                                    bm6Var.h = file6;
                                }
                            }
                            String x06 = x0();
                            bm6Var.c = x06;
                            photoViewer = this;
                            photoViewer.W0(x06, null, bitmap, bitmap9, 512.0f, false);
                            if (z4 && bitmap9 != null) {
                                bitmap9.recycle();
                            }
                            if (z5 && bitmap != null) {
                                bitmap.recycle();
                            }
                            if (photoViewer.d2 == 1 && photoViewer.G2 != null && photoViewer.s1 && photoViewer.b0(false) == 1 && photoViewer.Y7.getLeftProgress() <= 0.0f && photoViewer.Y7.getRightProgress() >= 1.0f) {
                                j = bm6Var.t;
                                long U = photoViewer.G2.U();
                                while (j < 3000 && j < U) {
                                    j += bm6Var.t;
                                }
                                photoViewer.Y7.setRightProgress(Math.min(1.0f, j / U));
                            }
                        }
                        bitmap = createBitmap;
                        z5 = true;
                        if (photoViewer.s1) {
                        }
                        if (photoViewer.B0()) {
                        }
                        String x062 = x0();
                        bm6Var.c = x062;
                        photoViewer = this;
                        photoViewer.W0(x062, null, bitmap, bitmap9, 512.0f, false);
                        if (z4) {
                            bitmap9.recycle();
                        }
                        if (z5) {
                            bitmap.recycle();
                        }
                        if (photoViewer.d2 == 1) {
                            j = bm6Var.t;
                            long U2 = photoViewer.G2.U();
                            while (j < 3000) {
                                j += bm6Var.t;
                            }
                            photoViewer.Y7.setRightProgress(Math.min(1.0f, j / U2));
                        }
                    }
                }
                gba.x();
                if (lm6Var != null) {
                    h98Var.d = lm6Var;
                    bm6Var.o = lm6Var;
                    if (photoViewer.s1 && photoViewer.J4 && photoViewer.T0()) {
                        TextureView textureView = photoViewer.C2;
                        if (textureView instanceof kac) {
                            z2 = true;
                            ((kac) textureView).setDelegate(new m68(lm6Var, true ? 1 : 0));
                            b = photoViewer.u4;
                            if (b != z2) {
                                bm6Var.w = z2;
                                zkb.s(photoViewer.a1, bkb.pg, photoViewer.w2, PorterDuff.Mode.MULTIPLY);
                            } else if (b == 2) {
                                bm6Var.u = z2;
                                zkb.s(photoViewer.d1, bkb.pg, photoViewer.w2, PorterDuff.Mode.MULTIPLY);
                            } else if (b == 3) {
                                if (z) {
                                    bm6Var.v = z2;
                                    zkb.s(photoViewer.Z0, bkb.pg, photoViewer.w2, PorterDuff.Mode.MULTIPLY);
                                } else if (photoViewer.d2 == 11) {
                                    bm6Var.v = z2;
                                }
                            }
                            i = photoViewer.d2;
                            if ((i != 0 || i == 4) && (o98Var = photoViewer.d) != null) {
                                o98Var.X(photoViewer.P4);
                                if (!photoViewer.d.w(photoViewer.P4)) {
                                    photoViewer.U1();
                                }
                            }
                            boolean z14 = true;
                            if (photoViewer.u4 == 1) {
                                photoViewer.a6 = Math.max(photoViewer.D1.getRectSizeX() / photoViewer.i0(photoViewer.u4), photoViewer.D1.getRectSizeY() / photoViewer.g0());
                                photoViewer.X5 = ((photoViewer.D1.getRectSizeX() / f2) + photoViewer.D1.getRectX()) - (photoViewer.i0(photoViewer.u4) / 2);
                                photoViewer.Y5 = ((photoViewer.D1.getRectSizeY() / f2) + photoViewer.D1.getRectY()) - (photoViewer.g0() / 2);
                                z14 = true;
                                photoViewer.R6 = true;
                                photoViewer.D1.a();
                            }
                            photoViewer.C4.p0(view);
                            photoViewer.k5 = z14;
                            z3 = photoViewer.s1;
                            byte b6 = photoViewer.u4;
                            if (!z3 ? b6 == 2 : !(b6 != z14 && ((b6 != 0 || photoViewer.d2 != z14) && (b6 != 2 || !photoViewer.J4 || !photoViewer.T0())))) {
                                photoViewer.C4.f0(n);
                                photoViewer.C4.o0(r13, r13, true);
                                photoViewer.F4.a();
                                photoViewer.f0.requestLayout();
                            }
                            photoViewer.k5 = r13;
                            photoViewer.C4.p0(photoViewer.f0);
                        }
                    }
                }
                z2 = true;
                b = photoViewer.u4;
                if (b != z2) {
                }
                i = photoViewer.d2;
                if (i != 0) {
                }
                o98Var.X(photoViewer.P4);
                if (!photoViewer.d.w(photoViewer.P4)) {
                }
                boolean z142 = true;
                if (photoViewer.u4 == 1) {
                }
                photoViewer.C4.p0(view);
                photoViewer.k5 = z142;
                z3 = photoViewer.s1;
                byte b62 = photoViewer.u4;
                if (!z3) {
                    photoViewer.C4.f0(n);
                    photoViewer.C4.o0(r13, r13, true);
                    photoViewer.F4.a();
                    photoViewer.f0.requestLayout();
                }
                photoViewer.k5 = r13;
                photoViewer.C4.p0(photoViewer.f0);
            }
        }
    }

    public final Bitmap.CompressFormat e0() {
        return this.d2 == 11 ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x01ee, code lost:
    
        if (r3 > ((gl.L(100.0f) + g0()) / 2.0f)) goto L100;
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
    
        X0(true);
        w(0, true);
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
        A2();
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0212, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x01f2, code lost:
    
        if (r17.J4 != false) goto L102;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e1(MotionEvent motionEvent) {
        x88 x88Var;
        k27 k27Var;
        k27 k27Var2;
        if (this.S6) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (this.O0.getVisibility() != 0 && gba.q0 && this.d2 != 11) {
            if (y > gl.L(40.0f) + org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + gl.m) {
                if (x < Math.min(kk7.Q1, this.f0.getMeasuredWidth() / 8)) {
                    if (this.B4.D()) {
                        o2(-1, true);
                        return true;
                    }
                } else if (x > this.f0.getMeasuredWidth() - r4 && this.D4.D()) {
                    o2(1, true);
                    return true;
                }
            }
        }
        k27 k27Var3 = this.T4;
        if (k27Var3 == null || !k27Var3.q4() || x < (i0(this.u4) - this.C4.N0) / 2.0f || x > (i0(this.u4) + this.C4.N0) / 2.0f || y < (g0() - this.C4.O0) / 2.0f || y > (g0() + this.C4.O0) / 2.0f) {
            x88 x88Var2 = this.g0;
            if (x88Var2 != null && x88Var2.y && this.K) {
                WebView webView = x88Var2.getWebView();
                if (x >= webView.getX() && x <= webView.getX() + webView.getWidth() && y >= webView.getY() && y <= webView.getY() + webView.getHeight()) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.setAction(0);
                    obtain.offsetLocation(-webView.getX(), -webView.getY());
                    webView.dispatchTouchEvent(obtain);
                    obtain.setAction(1);
                    webView.dispatchTouchEvent(obtain);
                    obtain.recycle();
                    z1();
                    return true;
                }
            }
            if (this.f0.getTag() != null) {
                m88 m88Var = this.z2;
                boolean z = (m88Var != null && m88Var.getVisibility() == 0) || ((x88Var = this.g0) != null && x88Var.y);
                if (this.C5 != 1 || (k27Var2 = this.T4) == null) {
                    u78 u78Var = this.X0[0];
                    if (u78Var != null && this.f0 != null) {
                        int i = u78Var.h;
                        if (x >= (i0(this.u4) - gl.L(100.0f)) / 2.0f) {
                            if (x <= (gl.L(100.0f) + i0(this.u4)) / 2.0f && y >= (g0() - gl.L(100.0f)) / 2.0f) {
                            }
                        }
                    }
                } else if (!k27Var2.x()) {
                    float g0 = (g0() - gl.L(360.0f)) / 2.0f;
                    if (y >= g0 && y <= g0 + gl.L(360.0f)) {
                        X0(true);
                        return true;
                    }
                }
                x88 x88Var3 = this.g0;
                if ((x88Var3 == null || !x88Var3.y || x88Var3.H || !this.K) && ((k27Var = this.T4) == null || !k27Var.q4())) {
                    s2(!this.K, true);
                    return true;
                }
            } else {
                int i2 = this.d2;
                if (i2 == 0 || i2 == 4) {
                    if (!this.s1) {
                        this.O0.performClick();
                        return true;
                    }
                    lbc lbcVar = this.G2;
                    if (lbcVar != null && !this.r && i2 != 1) {
                        lbcVar.A0(1.0f);
                    }
                    this.H2 = true;
                    A2();
                    return true;
                }
                TLRPC.BotInlineResult botInlineResult = this.Y4;
                if (botInlineResult != null && (botInlineResult.type.equals(MediaStreamTrack.VIDEO_TRACK_KIND) || k27.J4(this.Y4.document))) {
                    int i3 = this.X0[0].h;
                    if (i3 > 0 && i3 <= 3 && x >= (i0(this.u4) - gl.L(100.0f)) / 2.0f) {
                        if (x <= (gl.L(100.0f) + i0(this.u4)) / 2.0f && y >= (g0() - gl.L(100.0f)) / 2.0f) {
                            if (y <= (gl.L(100.0f) + g0()) / 2.0f) {
                                X0(true);
                                w(0, true);
                                return true;
                            }
                        }
                    }
                } else if (this.d2 == 2 && this.s1) {
                    this.H2 = true;
                    A2();
                }
            }
        } else {
            org.telegram.ui.ActionBar.d dVar = this.m4;
            if (dVar instanceof mu1) {
                ((mu1) dVar).M9(this.T4, true, true);
            }
            B(true, false);
            String str = this.T4.T0;
            if (str != null) {
                Context context = LaunchActivity.H1;
                if (context == null) {
                    context = this.F;
                }
                d01.s(context, Uri.parse(str), true, false, false, null, null, false, na7.q1(this.U).k4.A2.f, false, false);
                return true;
            }
        }
        return true;
    }

    public final void e2(boolean z, boolean z2) {
        o98 o98Var = this.d;
        boolean z3 = false;
        boolean z4 = o98Var != null && o98Var.z();
        d2(this.V1, z && !z4, z2, this.E7);
        z78 z78Var = this.W1;
        if (z && z4) {
            z3 = true;
        }
        d2(z78Var, z3, z2, this.F7);
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
        zl6 zl6Var;
        Bitmap bitmap3;
        PhotoViewer photoViewer;
        PhotoViewer photoViewer2;
        Bitmap bitmap4;
        Bitmap bitmap5;
        bm6 bm6Var = (bm6) this.g7.get(this.P4);
        ImageReceiver imageReceiver = this.C4;
        int[] iArr = {imageReceiver.V, imageReceiver.W};
        zl6 zl6Var2 = bm6Var.A;
        if (zl6Var2 != null) {
            createBitmap = F(bitmap, zl6Var2, iArr, true);
        } else {
            if (iArr[0] == 0) {
                bitmap2 = bitmap;
                z = false;
                b = this.u4;
                if ((b != 0 || b == 4) && this.d2 == 11 && !this.s1) {
                    zl6Var = bm6Var.A;
                    String str = bm6Var.j;
                    if (zl6Var != null) {
                        bitmap3 = bitmap2;
                        if (str != null) {
                            Bitmap decodeFile = BitmapFactory.decodeFile(bm6Var.l);
                            if (B0()) {
                                TLRPC.PhotoSize V = fl5.V(bitmap3, e0(), gl.Y0(false), gl.Y0(false), 87);
                                ba4.G(this.U);
                                String file = ba4.J(V, null, true, true).toString();
                                this.g5 = file;
                                bm6Var.h = file;
                                photoViewer = this;
                            } else {
                                String x0 = x0();
                                bm6Var.h = x0;
                                photoViewer = this;
                                photoViewer.W0(x0, null, bitmap3, decodeFile, gl.Y0(false), false);
                            }
                            String x02 = x0();
                            bm6Var.c = x02;
                            photoViewer.W0(x02, null, bitmap3, decodeFile, 512.0f, false);
                        } else {
                            TLRPC.PhotoSize V2 = fl5.V(bitmap3, e0(), gl.Y0(false), gl.Y0(false), 87);
                            ba4.G(this.U);
                            String file2 = ba4.J(V2, null, true, true).toString();
                            this.g5 = file2;
                            bm6Var.h = file2;
                            TLRPC.PhotoSize T = fl5.T(bitmap3, 512.0f, 512.0f, 70, 101, 101);
                            bitmap3 = bitmap3;
                            ba4.G(this.U);
                            bm6Var.c = ba4.J(T, null, true, true).toString();
                        }
                    } else if (str != null) {
                        Bitmap F = F(BitmapFactory.decodeFile(bm6Var.l), bm6Var.A, null, false);
                        if (B0()) {
                            TLRPC.PhotoSize V3 = fl5.V(bitmap2, e0(), gl.Y0(false), gl.Y0(false), 87);
                            ba4.G(this.U);
                            String file3 = ba4.J(V3, null, true, true).toString();
                            this.g5 = file3;
                            bm6Var.h = file3;
                            Bitmap bitmap6 = bitmap2;
                            photoViewer2 = this;
                            bitmap4 = F;
                            bitmap5 = bitmap6;
                        } else {
                            String x03 = x0();
                            bm6Var.h = x03;
                            Bitmap bitmap7 = bitmap2;
                            photoViewer2 = this;
                            photoViewer2.W0(x03, null, F, bitmap7, gl.Y0(false), true);
                            bitmap4 = F;
                            bitmap5 = bitmap7;
                        }
                        String x04 = x0();
                        bm6Var.c = x04;
                        Bitmap bitmap8 = bitmap5;
                        photoViewer2.W0(x04, null, bitmap4, bitmap8, 512.0f, true);
                        bitmap3 = bitmap8;
                    } else {
                        TLRPC.PhotoSize V4 = fl5.V(bitmap2, e0(), gl.Y0(false), gl.Y0(false), 87);
                        ba4.G(this.U);
                        String file4 = ba4.J(V4, null, true, true).toString();
                        this.g5 = file4;
                        bm6Var.h = file4;
                        TLRPC.PhotoSize T2 = fl5.T(bitmap2, 512.0f, 512.0f, 70, 101, 101);
                        bitmap3 = bitmap2;
                        ba4.G(this.U);
                        bm6Var.c = ba4.J(T2, null, true, true).toString();
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
        b = this.u4;
        if (b != 0) {
        }
        zl6Var = bm6Var.A;
        String str2 = bm6Var.j;
        if (zl6Var != null) {
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
            measuredHeight = (gl.n - this.t2.bottom) + gl.q.y;
            if ((i == 0 || i == 4 || i == 5) && this.d2 != 1 && !z2) {
                measuredHeight += gl.m;
            }
        }
        if ((i == 0 && this.d2 == 1) || i == 1) {
            additionalTop = gl.L(144.0f);
        } else if (i == 2) {
            additionalTop = gl.L(214.0f);
        } else {
            if (i != 3) {
                return measuredHeight;
            }
            additionalTop = this.M1.getAdditionalTop() + org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + this.M1.getAdditionalBottom() + gl.L(48.0f);
        }
        return measuredHeight - additionalTop;
    }

    public final void f1() {
        Activity activity;
        if (gl.F1(this.E)) {
            return;
        }
        if (gl.E || (Build.VERSION.SDK_INT >= 24 && (activity = this.E) != null && activity.isInMultiWindowMode())) {
            fa4.b("PhotoViewer: onStop in multi-window mode, keep playing");
            return;
        }
        if (this.G2 == null) {
            x88 x88Var = this.g0;
            if (x88Var == null || !x88Var.y || !x88Var.H) {
                return;
            }
        } else if (!this.P3) {
            return;
        }
        o1();
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
    public final void f2(boolean z, boolean z2) {
        mza mzaVar;
        boolean z3 = true;
        if (z && (mzaVar = this.p5) != null) {
            if (mzaVar.H) {
                jza[] jzaVarArr = mzaVar.I;
                if (jzaVarArr != null) {
                    for (jza jzaVar : jzaVarArr) {
                        if (jzaVar != null && jzaVar.e != null) {
                            break;
                        }
                    }
                }
                p88 p88Var = this.O1;
                if (p88Var != null) {
                }
            }
            c98 c98Var = this.x5;
            if (z2) {
                c98Var.animate().setListener(null).cancel();
                this.x5.setVisibility(z3 ? 0 : 8);
                this.x5.setAlpha(z3 ? 1.0f : 0.0f);
                this.x5.setScaleX(z3 ? 1.0f : 0.8f);
                this.x5.setScaleY(z3 ? 1.0f : 0.8f);
            } else if (z3) {
                if (c98Var.getTag() == null) {
                    this.x5.animate().setListener(null).cancel();
                    if (this.x5.getVisibility() != 0) {
                        this.x5.setVisibility(0);
                        ug8.t(this.x5.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f), s33.h, 400L);
                    }
                }
            } else if (c98Var.getTag() != null) {
                this.x5.animate().setListener(null).cancel();
                ug8.t(this.x5.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setListener(new id4(this.x5)), s33.h, 400L);
            }
            this.x5.setTag(!z3 ? r1 : null);
            c98 c98Var2 = this.v5;
            if (z2) {
                c98Var2.animate().setListener(null).cancel();
                this.v5.setVisibility(z ? 0 : 8);
                this.v5.setAlpha(z ? 1.0f : 0.0f);
                this.v5.setScaleX(z ? 1.0f : 0.8f);
                this.v5.setScaleY(z ? 1.0f : 0.8f);
                this.w5.animate().setListener(null).cancel();
                this.w5.setVisibility(z ? 0 : 8);
                this.w5.setAlpha(z ? 1.0f : 0.0f);
                this.w5.setScaleX(z ? 1.0f : 0.8f);
                this.w5.setScaleY(z ? 1.0f : 0.8f);
            } else if (z) {
                if (c98Var2.getTag() == null) {
                    this.v5.animate().setListener(null).cancel();
                    this.w5.animate().setListener(null).cancel();
                    if (this.v5.getVisibility() != 0) {
                        this.v5.setVisibility(0);
                        ViewPropertyAnimator scaleY = this.v5.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f);
                        s33 s33Var = s33.h;
                        ug8.t(scaleY, s33Var, 400L);
                        this.w5.setVisibility(0);
                        this.w5.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setInterpolator(s33Var).setDuration(400L).start();
                    }
                }
            } else if (c98Var2.getTag() != null) {
                this.v5.animate().setListener(null).cancel();
                ViewPropertyAnimator listener = this.v5.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setListener(new id4(this.v5));
                s33 s33Var2 = s33.h;
                ug8.t(listener, s33Var2, 400L);
                this.w5.animate().setListener(null).cancel();
                this.w5.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setListener(new id4(this.w5)).setInterpolator(s33Var2).setDuration(400L).start();
            }
            this.v5.setTag(z ? 1 : null);
        }
        z3 = false;
        c98 c98Var3 = this.x5;
        if (z2) {
        }
        this.x5.setTag(!z3 ? r1 : null);
        c98 c98Var22 = this.v5;
        if (z2) {
        }
        this.v5.setTag(z ? 1 : null);
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
        zl6 zl6Var;
        if (this.p6 != null) {
            f5 = gl.R1(0.0f, this.g6, this.l6);
            f = gl.R1(this.a6, this.e6, this.l6);
            f2 = gl.R1(this.b6, this.f6, this.l6);
            f3 = gl.R1(this.Y5, this.d6, this.l6);
            f4 = gl.R1(this.X5, this.c6, this.l6);
        } else {
            f = this.a6;
            f2 = this.b6;
            f3 = this.Y5;
            f4 = this.X5;
            if (this.n6 != 0) {
                f4 = this.c6;
                f3 = this.d6;
                f = this.e6;
            }
            f5 = 0.0f;
        }
        int i0 = i0(this.u4);
        int g0 = g0();
        canvas.translate(Z(this.u4), a0(this.u4));
        canvas.translate(f4, f3 + 0.0f);
        canvas.scale(f, f);
        canvas.rotate(f2);
        int q = this.C4.q();
        int o = this.C4.o();
        float f10 = i0;
        float f11 = q;
        float f12 = f10 / f11;
        float f13 = g0;
        float f14 = o;
        float f15 = f13 / f14;
        float min = Math.min(f12, f15);
        c33 c33Var = this.E1;
        int i = c33Var.i;
        if (i == 90 || i == 270) {
            o = q;
            q = o;
        }
        float f16 = c33Var.j;
        float f17 = c33Var.k;
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
        h98 h98Var = this.X4;
        if (i3 != 1 && ((this.u4 != 1 || this.o6 == 0) && h98Var.c != null)) {
            float f25 = f21 * f24;
            float f26 = f23 * f24;
            if (f12 * f14 > f13) {
                f12 = f15;
            }
            float A = tb4.A((f11 * f12) / f20, f25, 0.0f, f25);
            float A2 = tb4.A((f14 * f12) / f20, f26, 0.0f, f26);
            canvas.clipRect((-A) / 2.0f, (-A2) / 2.0f, A / 2.0f, A2 / 2.0f);
        }
        if (this.d2 == 1 || c33Var.a) {
            TextureView textureView = this.C2;
            if (textureView != null) {
                zl6 zl6Var2 = h98Var.c;
                textureView.setScaleX((zl6Var2 == null || !zl6Var2.l) ? 1.0f : -1.0f);
                j98 j98Var = this.F2;
                if (j98Var != null) {
                    j98Var.setScaleX(this.C2.getScaleX());
                }
            }
            zl6 zl6Var3 = h98Var.c;
            if (zl6Var3 != null) {
                f6 = zl6Var3.c;
                f7 = 1.0f;
            } else {
                f6 = 1.0f;
                f7 = 1.0f;
            }
            float A3 = ((f24 / min) / tb4.A(f6, f7, 0.0f, f7)) * f6;
            canvas.translate(c33Var.d * f7, c33Var.e * f7);
            canvas.scale(A3, A3);
            canvas.translate(yjb.C(c33Var.b, f18, min, f7), yjb.C(c33Var.c, f19, min, f7));
            float f27 = c33Var.g + i;
            if (f27 > 180.0f) {
                f27 -= 360.0f;
            }
            canvas.rotate(f27);
        }
        if (this.g7.isEmpty() || (zl6Var = h98Var.c) == null || !zl6Var.l) {
            f8 = 1.0f;
        } else {
            f8 = 1.0f;
            canvas.scale(-1.0f, 1.0f);
        }
        if (f5 > 0.0f) {
            canvas.scale(f8 - (2.0f * f5), f8);
            canvas.skew(0.0f, tb4.z(f8, f5, 4.0f * f5, 0.25f));
        }
    }

    public final int g0() {
        return f0(this.u4, false);
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
    public final boolean g1(MotionEvent motionEvent) {
        float f;
        int i;
        float f2;
        int i2;
        int i3;
        p88 p88Var;
        q88 q88Var;
        this.J7 = motionEvent.getX();
        if (this.u4 == 3 && this.n6 != 0 && (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5)) {
            if (motionEvent.getPointerCount() >= 2) {
                AnimatorSet animatorSet = this.p6;
                if (animatorSet != null) {
                    float f3 = this.a6;
                    float f4 = this.e6 - f3;
                    float f5 = this.l6;
                    float f6 = (f4 * f5) + f3;
                    float f7 = this.X5;
                    float A = tb4.A(this.c6, f7, f5, f7);
                    float f8 = this.Y5;
                    float A2 = tb4.A(this.d6, f8, f5, f8);
                    float f10 = this.b6;
                    float f11 = ((this.f6 - f10) * f5) + f10;
                    animatorSet.cancel();
                    this.a6 = f6;
                    this.X5 = A;
                    this.Y5 = A2;
                    this.n6 = 0L;
                    this.b6 = f11;
                    H2(f6);
                    this.R6 = false;
                    this.f0.invalidate();
                }
            }
            return true;
        }
        if (this.n4 == 0 && this.n6 == 0) {
            ya2 ya2Var = this.a4;
            if (ya2Var.rewindCount <= 0) {
                f88 f88Var = this.c4;
                if (f88Var.rewinding) {
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        f88Var.cancelRewind();
                        return false;
                    }
                    if (motionEvent.getAction() == 2) {
                        f88Var.setX(motionEvent.getX());
                        return true;
                    }
                }
                byte b = this.u4;
                if (b == 2) {
                    this.J1.h(motionEvent);
                    return true;
                }
                if (b != 1 && (b == 3 || this.d2 != 1)) {
                    if (d0().f.e || (d0().p0 && this.e && this.n4 == 0)) {
                        if (motionEvent.getAction() == 1) {
                            z(true);
                        }
                    } else {
                        if (this.u4 == 0 && this.d2 != 1 && motionEvent.getPointerCount() == 1 && this.r6.a(motionEvent) && this.O6) {
                            this.O6 = false;
                            this.L6 = false;
                            this.K6 = false;
                            v(false);
                            return true;
                        }
                        jtb jtbVar = this.n1;
                        if (jtbVar != null) {
                            cib cibVar = jtbVar.d;
                            if (jtbVar.c) {
                                ViewPropertyAnimator viewPropertyAnimator = jtbVar.b;
                                if (viewPropertyAnimator != null) {
                                    viewPropertyAnimator.setListener(null);
                                    jtbVar.b.cancel();
                                    jtbVar.b = null;
                                }
                                gl.r(cibVar);
                                cibVar.run();
                            }
                            jtbVar.c = false;
                        }
                        int actionMasked = motionEvent.getActionMasked();
                        l68 l68Var = this.L7;
                        if (actionMasked == 0 || motionEvent.getActionMasked() == 5) {
                            this.S6 = false;
                            if (!this.V6.isFinished()) {
                                this.V6.abortAnimation();
                            }
                            if (!this.V5 && !this.J6) {
                                if (this.I6 && motionEvent.getPointerCount() == 2) {
                                    if (this.M6 == 1) {
                                        MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                                        this.M1.h(obtain);
                                        obtain.recycle();
                                        this.M6 = (byte) 2;
                                    } else if (this.N6 == 1) {
                                        MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                                        this.O1.a(obtain2);
                                        obtain2.recycle();
                                        this.N6 = (byte) 2;
                                    }
                                    this.u6 = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                                    this.v6 = (float) Math.atan2(motionEvent.getY(1) - motionEvent.getY(0), motionEvent.getX(1) - motionEvent.getX(0));
                                    this.w6 = this.a6;
                                    this.x6 = this.b6;
                                    this.y6 = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                                    float y = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                                    this.z6 = y;
                                    this.A6 = this.X5;
                                    this.B6 = this.Y5;
                                    this.K6 = true;
                                    this.L6 = false;
                                    if (this.u4 == 3 || this.d2 == 11) {
                                        this.C6 = this.y6;
                                        this.D6 = y;
                                        this.V5 = false;
                                        this.Q6 = false;
                                    }
                                    D0();
                                    VelocityTracker velocityTracker = this.U6;
                                    if (velocityTracker != null) {
                                        velocityTracker.clear();
                                    }
                                } else if (motionEvent.getPointerCount() == 1) {
                                    byte b2 = this.u4;
                                    Rect rect = this.k7;
                                    if (b2 == 3) {
                                        if (this.M6 == 0) {
                                            View view = this.M1.getView();
                                            view.getHitRect(rect);
                                            if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                                                MotionEvent obtain3 = MotionEvent.obtain(motionEvent);
                                                obtain3.offsetLocation(-view.getX(), -view.getY());
                                                this.M1.h(obtain3);
                                                obtain3.recycle();
                                                this.M6 = (byte) 1;
                                            }
                                        }
                                    } else if (b2 != 4) {
                                        this.C6 = motionEvent.getX();
                                        float y2 = motionEvent.getY();
                                        this.D6 = y2;
                                        this.W5 = y2;
                                        this.V5 = false;
                                        this.Q6 = true;
                                        VelocityTracker velocityTracker2 = this.U6;
                                        if (velocityTracker2 != null) {
                                            velocityTracker2.clear();
                                        }
                                    } else if (this.N6 == 0) {
                                        p88 p88Var2 = this.O1;
                                        p88Var2.getHitRect(rect);
                                        if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                                            MotionEvent obtain4 = MotionEvent.obtain(motionEvent);
                                            obtain4.offsetLocation(-p88Var2.getX(), -p88Var2.getY());
                                            this.O1.a(obtain4);
                                            obtain4.recycle();
                                            this.N6 = (byte) 1;
                                        }
                                    }
                                }
                            }
                            if (motionEvent.getActionMasked() != 0) {
                                gl.r(l68Var);
                                return false;
                            }
                            this.K7 = motionEvent.getX();
                            gl.e3(l68Var, 300L);
                            return false;
                        }
                        float f12 = 3.0f;
                        float f13 = 1.0f;
                        float f14 = 0.0f;
                        if (motionEvent.getActionMasked() == 2) {
                            if (Math.abs(this.K7 - this.J7) > gl.e) {
                                gl.r(l68Var);
                            }
                            if (this.I6 && motionEvent.getPointerCount() == 2 && !this.V5 && this.K6 && !this.J6) {
                                this.S6 = true;
                                if (this.u4 == 3 || this.d2 == 11) {
                                    float x = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                                    float y3 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                                    float f15 = this.C6 - x;
                                    float f16 = this.D6 - y3;
                                    this.C6 = x;
                                    this.D6 = y3;
                                    float f17 = this.X5;
                                    if (f17 < this.E6 || f17 > this.F6) {
                                        f15 /= 3.0f;
                                    }
                                    float f18 = this.Y5;
                                    if (f18 < this.G6 || f18 > this.H6) {
                                        f16 /= 3.0f;
                                    }
                                    this.A6 = ((this.y6 - (i0(this.u4) / 2)) - (((this.y6 - (i0(this.u4) / 2)) - this.X5) / (this.a6 / this.w6))) - f15;
                                    this.B6 = ((this.z6 - (g0() / 2)) - (((this.z6 - (g0() / 2)) - this.Y5) / (this.a6 / this.w6))) - f16;
                                    this.y6 = x;
                                    this.z6 = y3;
                                }
                                if (this.d2 == 11 && this.u4 == 0) {
                                    this.b6 = (float) ((((Math.atan2(motionEvent.getY(1) - motionEvent.getY(0), motionEvent.getX(1) - motionEvent.getX(0)) - this.v6) / 3.141592653589793d) * 180.0d) + this.x6);
                                }
                                this.a6 = (((float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0))) / this.u6) * this.w6;
                                this.X5 = de9.x(this.a6, this.w6, (this.y6 - (i0(this.u4) / 2)) - this.A6, this.y6 - (i0(this.u4) / 2));
                                float g0 = this.z6 - (g0() / 2);
                                float g02 = (this.z6 - (g0() / 2)) - this.B6;
                                float f19 = this.a6;
                                this.Y5 = de9.x(f19, this.w6, g02, g0);
                                H2(f19);
                                G0();
                                this.f0.invalidate();
                                return false;
                            }
                            if (motionEvent.getPointerCount() == 1) {
                                if (this.M6 == 1 && (q88Var = this.M1) != null) {
                                    View view2 = q88Var.getView();
                                    MotionEvent obtain5 = MotionEvent.obtain(motionEvent);
                                    obtain5.offsetLocation(-view2.getX(), -view2.getY());
                                    this.M1.h(obtain5);
                                    obtain5.recycle();
                                    return true;
                                }
                                if (this.N6 == 1 && (p88Var = this.O1) != null) {
                                    MotionEvent obtain6 = MotionEvent.obtain(motionEvent);
                                    obtain6.offsetLocation(-p88Var.getX(), -p88Var.getY());
                                    this.O1.a(obtain6);
                                    obtain6.recycle();
                                    return true;
                                }
                                VelocityTracker velocityTracker3 = this.U6;
                                if (velocityTracker3 != null) {
                                    velocityTracker3.addMovement(motionEvent);
                                }
                                float abs = Math.abs(motionEvent.getX() - this.C6);
                                float abs2 = Math.abs(motionEvent.getY() - this.W5);
                                float f20 = this.z1;
                                if (abs > f20 || abs2 > f20) {
                                    this.S6 = true;
                                    D0();
                                    gl.r(l68Var);
                                    q98 q98Var = this.U7;
                                    if (q98Var != null) {
                                    }
                                }
                                if (this.d.T() && this.u4 == 0 && (i3 = this.d2) != 1 && i3 != 11 && this.Q6 && !this.V5 && this.a6 == 1.0f && abs2 >= gl.L(30.0f) && abs2 / 2.0f > abs) {
                                    this.V5 = true;
                                    D0();
                                    this.L6 = false;
                                    this.W5 = motionEvent.getY();
                                    if (this.K && this.f0.getTag() != null) {
                                        s2(false, true);
                                        return true;
                                    }
                                    if (this.Q0.getVisibility() == 0) {
                                        s2(false, true);
                                        z2(false, true);
                                        v2(false);
                                        return true;
                                    }
                                } else {
                                    if (this.V5) {
                                        this.Y5 = motionEvent.getY() - this.W5;
                                        this.f0.invalidate();
                                        return false;
                                    }
                                    if (this.P6 || this.n6 != 0) {
                                        this.P6 = false;
                                        this.C6 = motionEvent.getX();
                                        this.D6 = motionEvent.getY();
                                        return false;
                                    }
                                    float x2 = this.C6 - motionEvent.getX();
                                    float y4 = this.D6 - motionEvent.getY();
                                    if (this.L6 || this.u4 != 0 || this.d2 == 11 || ((this.a6 == 1.0f && Math.abs(y4) + gl.L(12.0f) < Math.abs(x2)) || this.a6 != 1.0f)) {
                                        if (!this.L6) {
                                            this.L6 = true;
                                            this.Q6 = false;
                                            D0();
                                            x2 = 0.0f;
                                            y4 = 0.0f;
                                        }
                                        this.C6 = motionEvent.getX();
                                        this.D6 = motionEvent.getY();
                                        H2(this.a6);
                                        if ((this.X5 < this.E6 && (this.u4 != 0 || !this.D4.D())) || (this.X5 > this.F6 && (this.u4 != 0 || !this.B4.D()))) {
                                            x2 /= 3.0f;
                                        }
                                        float f21 = this.H6;
                                        if (f21 == 0.0f) {
                                            f2 = this.G6;
                                            if (f2 == 0.0f && this.u4 == 0 && (i2 = this.d2) != 1 && i2 != 11) {
                                                float f22 = this.Y5;
                                                float f23 = f22 - y4;
                                                if (f23 < f2) {
                                                    this.Y5 = f2;
                                                    f21 = f2;
                                                    this.X5 -= x2;
                                                    if (this.a6 == 1.0f || this.u4 != 0 || this.d2 == 11) {
                                                        this.Y5 = f21 - f14;
                                                    }
                                                    G0();
                                                    this.f0.invalidate();
                                                    return false;
                                                }
                                                if (f23 > f21) {
                                                    this.Y5 = f21;
                                                    this.X5 -= x2;
                                                    if (this.a6 == 1.0f) {
                                                    }
                                                    this.Y5 = f21 - f14;
                                                    G0();
                                                    this.f0.invalidate();
                                                    return false;
                                                }
                                                f21 = f22;
                                                f14 = y4;
                                                this.X5 -= x2;
                                                if (this.a6 == 1.0f) {
                                                }
                                                this.Y5 = f21 - f14;
                                                G0();
                                                this.f0.invalidate();
                                                return false;
                                            }
                                        }
                                        f2 = this.Y5;
                                        if (f2 < this.G6 || f2 > f21) {
                                            f14 = y4 / 3.0f;
                                            f21 = f2;
                                            this.X5 -= x2;
                                            if (this.a6 == 1.0f) {
                                            }
                                            this.Y5 = f21 - f14;
                                            G0();
                                            this.f0.invalidate();
                                            return false;
                                        }
                                        f21 = f2;
                                        f14 = y4;
                                        this.X5 -= x2;
                                        if (this.a6 == 1.0f) {
                                        }
                                        this.Y5 = f21 - f14;
                                        G0();
                                        this.f0.invalidate();
                                        return false;
                                    }
                                }
                            }
                        } else if (motionEvent.getActionMasked() == 3 || motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 6) {
                            D0();
                            gl.r(l68Var);
                            if (this.M6 == 1) {
                                q88 q88Var2 = this.M1;
                                if (q88Var2 != null) {
                                    View view3 = q88Var2.getView();
                                    MotionEvent obtain7 = MotionEvent.obtain(motionEvent);
                                    obtain7.offsetLocation(-view3.getX(), -view3.getY());
                                    this.M1.h(obtain7);
                                    obtain7.recycle();
                                }
                                this.M6 = (byte) 0;
                                this.N6 = (byte) 0;
                                return true;
                            }
                            if (this.N6 == 1) {
                                p88 p88Var3 = this.O1;
                                if (p88Var3 != null) {
                                    MotionEvent obtain8 = MotionEvent.obtain(motionEvent);
                                    obtain8.offsetLocation(-p88Var3.getX(), -p88Var3.getY());
                                    this.O1.a(obtain8);
                                    obtain8.recycle();
                                }
                                this.M6 = (byte) 0;
                                this.N6 = (byte) 0;
                                return true;
                            }
                            this.M6 = (byte) 0;
                            this.N6 = (byte) 0;
                            if (this.K6) {
                                this.P6 = true;
                                if (this.d2 == 11) {
                                    f12 = 10.0f;
                                    f13 = 0.33f;
                                }
                                float f24 = this.a6;
                                if (f24 < f13) {
                                    H2(f13);
                                    b(f13, 0.0f, 0.0f, true);
                                } else if (f24 > f12) {
                                    float x3 = de9.x(f12, this.w6, (this.y6 - (i0(this.u4) / 2)) - this.A6, this.y6 - (i0(this.u4) / 2));
                                    float x4 = de9.x(f12, this.w6, (this.z6 - (g0() / 2)) - this.B6, this.z6 - (g0() / 2));
                                    H2(f12);
                                    float f25 = this.E6;
                                    if (x3 >= f25) {
                                        f25 = this.F6;
                                    }
                                    x3 = f25;
                                    float f26 = this.G6;
                                    if (x4 >= f26) {
                                        f26 = this.H6;
                                    }
                                    x4 = f26;
                                    b(f12, x3, x4, true);
                                } else {
                                    v(true);
                                    if (this.u4 == 3) {
                                        float f27 = this.X5;
                                        float f28 = this.Y5;
                                        H2(this.a6);
                                        float f29 = this.X5;
                                        float f30 = this.E6;
                                        if (f29 >= f30) {
                                            f30 = this.F6;
                                        }
                                        f27 = f30;
                                        float f31 = this.Y5;
                                        float f32 = this.G6;
                                        if (f31 >= f32) {
                                            f32 = this.H6;
                                        }
                                        f28 = f32;
                                        b(this.a6, f27, f28, false);
                                    }
                                }
                                this.K6 = false;
                                this.L6 = false;
                                return false;
                            }
                            if (this.V5) {
                                if (Math.abs(this.W5 - motionEvent.getY()) > g0() / 6.0f) {
                                    B(true, false);
                                } else {
                                    if (this.Q0.getVisibility() == 0) {
                                        s2(true, true);
                                        v2(true);
                                    }
                                    b(1.0f, 0.0f, 0.0f, false);
                                }
                                this.V5 = false;
                                return false;
                            }
                            if (this.L6) {
                                float f33 = this.X5;
                                float f34 = this.Y5;
                                H2(this.a6);
                                this.L6 = false;
                                this.Q6 = true;
                                VelocityTracker velocityTracker4 = this.U6;
                                if (velocityTracker4 == null || this.a6 != 1.0f) {
                                    f = 0.0f;
                                } else {
                                    velocityTracker4.computeCurrentVelocity(1000);
                                    f = this.U6.getXVelocity();
                                }
                                if (this.u4 == 0 && (i = this.d2) != 1 && i != 11) {
                                    if ((this.X5 < this.E6 - (i0(r4) / 3) || f < (-gl.L(650.0f))) && this.D4.D()) {
                                        float f35 = this.a6;
                                        if (f35 != 1.0f) {
                                            float i0 = (i0(this.u4) - this.C4.N0) / 2.0f;
                                            float f36 = this.a6;
                                            f14 = i0 * f36;
                                            f35 = f36;
                                        }
                                        this.T6 = (byte) 1;
                                        b(f35, ((this.E6 - i0(this.u4)) - f14) - (gl.L(30.0f) / 2), this.Y5, false);
                                        return true;
                                    }
                                    if ((this.X5 > this.F6 + (i0(this.u4) / 3) || f > gl.L(650.0f)) && this.B4.D()) {
                                        float f37 = this.a6;
                                        if (f37 != 1.0f) {
                                            float i02 = (i0(this.u4) - this.C4.N0) / 2.0f;
                                            float f38 = this.a6;
                                            f14 = i02 * f38;
                                            f37 = f38;
                                        }
                                        this.T6 = (byte) 2;
                                        b(f37, this.F6 + i0(this.u4) + f14 + (gl.L(30.0f) / 2), this.Y5, false);
                                        return true;
                                    }
                                }
                                float f39 = this.X5;
                                float f40 = this.E6;
                                if (f39 >= f40) {
                                    f40 = this.F6;
                                }
                                f33 = f40;
                                float f41 = this.Y5;
                                float f42 = this.G6;
                                if (f41 >= f42) {
                                    f42 = this.H6;
                                }
                                f34 = f42;
                                b(this.a6, f33, f34, false);
                                return false;
                            }
                        }
                    }
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                ya2Var.cancelRewind();
                return false;
            }
            return true;
        }
        return false;
    }

    public final void g2(boolean z) {
        TextureView textureView;
        if (z && this.H3 && this.I3 && !this.F3 && (textureView = this.C2) != null) {
            this.O4 = textureView.getBitmap();
        }
        if (z) {
            this.g8 = this.e8;
        }
        AnimatorSet animatorSet = this.a8;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.a8 = new AnimatorSet();
        byte b = 3;
        if (z) {
            if (this.S4) {
                this.k0.setVisibility(0);
                this.k0.setAlpha(this.d2 == 11 ? 1.0f : 0.0f);
                this.k0.setBackgroundColor(this.d2 == 11 ? 1711276032 : 2130706432);
            }
            this.U7.setTag(1);
            AnimatorSet animatorSet2 = this.a8;
            jo0 jo0Var = this.Q0;
            Property property = View.TRANSLATION_Y;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(jo0Var, (Property<jo0, Float>) property, 0.0f, this.V1.getEditTextHeight() + jo0Var.getHeight() + (this.s1 ? gl.L(58.0f) : 0));
            jo0 jo0Var2 = this.Q0;
            Property property2 = View.ALPHA;
            animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(jo0Var2, (Property<jo0, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.T0, (Property<jh3, Float>) property, 0.0f, gl.L(158.0f)), ObjectAnimator.ofFloat(this.k0, (Property<View, Float>) property2, this.S4 ? 0.0f : 1.0f, 1.0f));
        } else {
            this.U7.setTag(null);
            AnimatorSet animatorSet3 = this.a8;
            q98 q98Var = this.U7;
            Property property3 = View.TRANSLATION_Y;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(q98Var, (Property<q98, Float>) property3, 0.0f, gl.L(166.0f)), ObjectAnimator.ofFloat(this.V7, (Property<z92, Float>) property3, 0.0f, gl.L(166.0f)), ObjectAnimator.ofFloat(this.k0, (Property<View, Float>) View.ALPHA, 1.0f, this.S4 ? 0.0f : 1.0f));
        }
        this.a8.addListener(new n88(this, z, b));
        this.a8.setDuration(200L);
        this.a8.setInterpolator(gl.G);
        this.a8.start();
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

    public float getAnimationValue() {
        return this.l6;
    }

    @Override // ms4
    public final void h() {
        D0();
    }

    public final int h0() {
        return i0(this.u4);
    }

    public final void h1() {
        final File file;
        final k27 k27Var;
        final boolean z;
        final boolean z2;
        final boolean z3;
        if (k()) {
            k27 k27Var2 = this.T4;
            File file2 = null;
            if (k27Var2 != null) {
                boolean z4 = k27Var2.t() && !this.T4.U2();
                boolean z5 = z4 && this.T4.O3();
                boolean K4 = k27.K4(this.T4.k);
                if (!TextUtils.isEmpty(this.T4.k.attachPath)) {
                    File file3 = new File(this.T4.k.attachPath);
                    if (file3.exists()) {
                        file2 = file3;
                    }
                }
                if (file2 == null) {
                    ba4.G(this.U);
                    file2 = ba4.M(this.T4.k, false, true);
                }
                k27Var = k27Var2;
                file = file2;
                z2 = z4;
                z3 = z5;
                z = K4;
            } else {
                file = null;
                k27Var = null;
                z = false;
                z2 = false;
                z3 = false;
            }
            if (file == null || !file.exists()) {
                c2();
                return;
            }
            this.i7 = new a0(this, this.P4, new ArrayList(this.Y6), this.d);
            b98 b98Var = new b98();
            b98Var.c = false;
            t2(false, true, b98Var);
            gl.e3(new Runnable() { // from class: org.telegram.ui.q
                @Override // java.lang.Runnable
                public final void run() {
                    Drawable[] drawableArr = PhotoViewer.f9;
                    PhotoViewer photoViewer = PhotoViewer.this;
                    photoViewer.getClass();
                    File file4 = file;
                    Pair L0 = gl.L0(file4);
                    int i = photoViewer.V3;
                    photoViewer.V3 = i - 1;
                    String absolutePath = file4.getAbsolutePath();
                    boolean z6 = z;
                    jm6 jm6Var = new jm6(i, absolutePath, z6 ? 0 : ((Integer) L0.first).intValue(), z6, 0, 0);
                    jm6Var.n(L0);
                    photoViewer.d2 = 2;
                    photoViewer.v2 = false;
                    photoViewer.d = new v88(photoViewer, photoViewer.d, k27Var, jm6Var, z2, z3);
                    photoViewer.q1.f();
                    if (photoViewer.U6 == null) {
                        photoViewer.U6 = VelocityTracker.obtain();
                    }
                    photoViewer.H7 = (byte) 3;
                    photoViewer.z2(false, false);
                    photoViewer.s2(true, false);
                    mu1 mu1Var = photoViewer.l4;
                    if (mu1Var == null || mu1Var.a0 == null || !mu1Var.O7()) {
                        photoViewer.V0();
                    } else {
                        photoViewer.l4.a0.S();
                    }
                    photoViewer.M0.setAlpha(kk7.d4);
                    photoViewer.f0.setAlpha(1.0f);
                    photoViewer.c1(null, null, null, null, null, null, Collections.singletonList(jm6Var), 0, null);
                    photoViewer.Q0.setTranslationY(gl.L(photoViewer.s1 ? 154.0f : 96.0f));
                    photoViewer.T0.setTranslationY(gl.L(photoViewer.s1 ? 154.0f : 96.0f));
                    photoViewer.G.setTranslationY(-r11.getHeight());
                    photoViewer.R1.setTranslationY(gl.L(photoViewer.s1 ? 154.0f : 96.0f));
                    photoViewer.H();
                    photoViewer.p2();
                    photoViewer.H7 = (byte) 0;
                }
            }, b98Var.a);
        }
    }

    public final void h2() {
        long a;
        if (this.E != null) {
            mu1 mu1Var = this.l4;
            if (mu1Var != null) {
                a = mu1Var.a();
            } else {
                o98 o98Var = this.d;
                if (o98Var == null) {
                    return;
                } else {
                    a = o98Var.a();
                }
            }
            long j = a;
            ij.H(this.E, j, -1L, 0, false, new r68(this), null, new fj(-1, -14342875, 520093695, -1, -115203550, 620756991, bkb.w0(null, bkb.Ii, false), bkb.w0(null, bkb.Ei, false), bkb.w0(null, bkb.Gi, false)), null);
        }
    }

    public final Size i() {
        int round;
        int i;
        if (this.f8 == 1) {
            return new Size(this.i8, this.j8);
        }
        int i2 = this.e8;
        float f = (i2 != 0 ? i2 != 1 ? i2 != 2 ? 1920.0f : 1280.0f : 854.0f : 480.0f) / (this.i8 > this.j8 ? this.i8 : this.j8);
        if (this.e8 != this.f8 - 1 || f < 1.0f) {
            int round2 = Math.round((this.i8 * f) / 2.0f) << 1;
            round = Math.round((this.j8 * f) / 2.0f) << 1;
            i = round2;
        } else {
            i = this.i8;
            round = this.j8;
        }
        int i3 = i % 4;
        if (i3 != 0 || round % 4 != 0) {
            i = (i - i3) - (round % 4);
        }
        return new Size(i, round);
    }

    public final int i0(int i) {
        int L;
        int width = this.f0.getWidth();
        if (i != 1) {
            if (i != 0) {
                if (i == 4 || i == 5 || i == 3) {
                    return width;
                }
                L = gl.L(28.0f);
                return width - L;
            }
            if (this.d2 != 1) {
                return width;
            }
        }
        L = gl.L(32.0f);
        return width - L;
    }

    public final void i1(ArrayList arrayList, int i, long j, long j2, long j3, o98 o98Var) {
        m1((k27) arrayList.get(i), null, null, null, arrayList, null, null, i, o98Var, null, j, j2, j3, true, null, null);
    }

    public final void i2(ArrayList arrayList) {
        boolean z;
        lbc lbcVar;
        k27 k27Var;
        boolean z2;
        k98 k98Var = this.f0;
        this.e0.softInputMode = 48;
        try {
            ((WindowManager) this.E.getSystemService("window")).updateViewLayout(this.h0, this.e0);
        } catch (Exception e) {
            fa4.g(e, true);
        }
        mu1 mu1Var = this.l4;
        if (mu1Var == null || mu1Var.a0 == null || mu1Var.getFragmentView() == null) {
            z = false;
        } else {
            ar1 ar1Var = this.l4.a0;
            if (ar1Var.p3) {
                ar1Var.V1();
                z2 = true;
            } else {
                z2 = false;
            }
            gl.h3(this.l4.getParentActivity(), this.c);
            this.l4.getFragmentView().requestLayout();
            z = z2;
        }
        String str = null;
        Integer valueOf = (arrayList.size() != 1 || (lbcVar = this.G2) == null || lbcVar.S() <= 1500 || (k27Var = this.T4) == null || !k27.K4(k27Var.k)) ? null : Integer.valueOf((int) (this.G2.S() / 1000));
        if (arrayList.size() == 1) {
            k27 k27Var2 = (k27) arrayList.get(0);
            String K = hc2.K(na7.q1(this.U).K0(Long.valueOf(-k27.B0(k27Var2.k))), false);
            if (!TextUtils.isEmpty(K)) {
                StringBuilder sb = new StringBuilder("https://");
                ls6.u(sb, na7.q1(this.U).N2, "/", K, "/");
                sb.append(k27Var2.e1());
                str = sb.toString();
            }
        }
        c88 c88Var = new c88(this, this.E, this.l4, arrayList, str, valueOf, k98Var, z);
        c88Var.v0(false);
        c88Var.getWindow().setSoftInputMode(48);
        gl.e3(new h18(this, c88Var, (byte) 6), 250L);
        c88Var.show();
    }

    public final boolean j(MotionEvent motionEvent) {
        x88 x88Var;
        if (this.G2 != null || ((x88Var = this.g0) != null && x88Var.y)) {
            boolean z = motionEvent.getX() >= ((float) ((i0(this.u4) / 3) << 1));
            long m0 = m0();
            long z0 = z0();
            if (m0 != -9223372036854775807L && z0 > 15000 && (!z || z0 - m0 > 10000)) {
                return true;
            }
        }
        return false;
    }

    public final float j0(boolean z) {
        int q;
        int o;
        ImageReceiver imageReceiver = this.C4;
        if (z) {
            q = imageReceiver.o();
            o = this.C4.q();
        } else {
            q = imageReceiver.q();
            o = this.C4.o();
        }
        float min = Math.min(this.D1.getMeasuredWidth(), (this.D1.getMeasuredHeight() - gl.L(64.0f)) - (!this.s ? gl.m : 0)) - (gl.L(16.0f) << 1);
        return Math.max(min / q, min / o);
    }

    public final void j1(ArrayList arrayList, int i, xw7 xw7Var) {
        m1(null, null, null, null, null, arrayList, null, i, xw7Var, null, 0L, 0L, 0L, true, null, null);
    }

    public final void j2(boolean z, boolean z2) {
        mza mzaVar = this.p5;
        if (!z2) {
            mzaVar.animate().setListener(null).cancel();
            this.p5.setVisibility(z ? 0 : 8);
            this.p5.setAlpha(this.Q0.getAlpha());
            this.s5.animate().setListener(null).cancel();
            this.s5.setVisibility(z ? 0 : 8);
            this.s5.setAlpha(z ? 1.0f : 0.0f);
        } else if (z) {
            if (mzaVar.getTag() == null) {
                this.p5.animate().setListener(null).cancel();
                this.s5.animate().setListener(null).cancel();
                if (this.p5.getVisibility() != 0) {
                    this.p5.setVisibility(0);
                    this.p5.animate().alpha(1.0f).start();
                    this.s5.setVisibility(0);
                    this.s5.animate().alpha(1.0f).start();
                }
            }
        } else if (mzaVar.getTag() != null) {
            this.p5.animate().setListener(null).cancel();
            this.p5.animate().alpha(0.0f).setListener(new id4(this.p5)).start();
            this.s5.animate().setListener(null).cancel();
            this.s5.animate().alpha(0.0f).setListener(new id4(this.s5)).start();
        }
        this.p5.setTag(z ? r1 : null);
        boolean z3 = (!z || this.t5.o0 == 1 || this.B7) ? false : true;
        c98 c98Var = this.t5;
        if (!z2) {
            c98Var.animate().setListener(null).cancel();
            this.t5.setVisibility(z3 ? 0 : 8);
            this.t5.setAlpha(z3 ? 1.0f : 0.0f);
        } else if (z3) {
            if (c98Var.getTag() == null) {
                this.t5.animate().setListener(null).cancel();
                if (this.t5.getVisibility() != 0) {
                    this.t5.setVisibility(0);
                }
                this.t5.animate().alpha(1.0f).start();
            }
        } else if (c98Var.getTag() != null) {
            this.t5.animate().setListener(null).cancel();
            this.t5.animate().alpha(0.0f).setListener(new id4(this.t5)).start();
        }
        this.t5.setTag(z3 ? r1 : null);
        f2(z && this.t5.o0 == 1 && !this.B7, z2);
        this.p5.setOutlineVisible(z && this.t5.o0 == 1 && this.y5.u0 && !this.v5.u0 && !this.w5.u0);
        boolean z4 = z && this.t5.o0 == 1 && !this.v5.u0 && !this.w5.u0;
        c98 c98Var2 = this.y5;
        if (!z2) {
            c98Var2.animate().setListener(null).cancel();
            this.y5.setVisibility(z4 ? 0 : 8);
            this.y5.setAlpha(z4 ? 1.0f : 0.0f);
            this.y5.setScaleX(z4 ? 1.0f : 0.8f);
            this.y5.setScaleY(z4 ? 1.0f : 0.8f);
        } else if (z4) {
            if (c98Var2.getTag() == null) {
                this.y5.animate().setListener(null).cancel();
                if (this.y5.getVisibility() != 0) {
                    this.y5.setVisibility(0);
                }
                ug8.t(this.y5.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f), s33.h, 400L);
            }
        } else if (c98Var2.getTag() != null) {
            this.y5.animate().setListener(null).cancel();
            ug8.t(this.y5.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setListener(new id4(this.y5)), s33.h, 400L);
        }
        this.y5.setTag(z4 ? 1 : null);
    }

    public final boolean k() {
        mu1 mu1Var = this.l4;
        if (mu1Var == null) {
            return false;
        }
        if (mu1Var.f != null) {
            return true;
        }
        TLRPC.Chat chat = mu1Var.e;
        if (chat == null || hc2.r0(chat)) {
            return false;
        }
        return hc2.p(this.l4.e) || hc2.u(this.l4.e);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final yg2 k0() {
        String str;
        k27 k27Var = this.T4;
        if (k27Var != null) {
            TLRPC.Document F0 = k27Var.F0();
            String I0 = this.T4.I0();
            if (TextUtils.isEmpty(I0)) {
                I0 = this.T4.S0();
            }
            long B0 = k27.B0(this.T4.k);
            boolean D = cf3.D(B0);
            int i = y6c.t0;
            if (D) {
                TLRPC.User V1 = na7.q1(i).V1(Long.valueOf(B0));
                if (V1 != null) {
                    str = qu2.m(0, V1.first_name, V1.last_name);
                    if (k27.R3(this.T4.k)) {
                        lbc lbcVar = this.G2;
                        if (lbcVar != null) {
                            return lbcVar.Q(ls6.p(new StringBuilder(), F0 != null ? F0.id : this.T4.e1(), ""), str, I0);
                        }
                    } else {
                        ba4.G(this.T4.K1);
                        File M = ba4.M(this.T4.k, false, true);
                        if (M != null && M.exists()) {
                            wg2 wg2Var = new wg2("image/jpeg", Uri.parse("file://" + M.getAbsolutePath()), "/photo_" + this.T4.e1());
                            wg2Var.e = str;
                            wg2Var.f = I0;
                            return new yg2(new xg2(wg2Var));
                        }
                    }
                }
                str = null;
                if (k27.R3(this.T4.k)) {
                }
            } else {
                TLRPC.Chat K0 = na7.q1(i).K0(Long.valueOf(-B0));
                if (K0 != null) {
                    str = K0.title;
                    if (k27.R3(this.T4.k)) {
                    }
                }
                str = null;
                if (k27.R3(this.T4.k)) {
                }
            }
        }
        return null;
    }

    public final void k1(TLRPC.FileLocation fileLocation, gl5 gl5Var, i98 i98Var) {
        m1(null, fileLocation, gl5Var, null, null, null, null, 0, i98Var, null, 0L, 0L, 0L, true, null, null);
    }

    public final void k2(boolean z) {
        x88 x88Var;
        byte b = 1;
        Object tag = this.s3.getTag();
        if (z) {
            if (tag != null) {
                return;
            }
            if (!this.s3.s && ((x88Var = this.g0) == null || !x88Var.y || x88Var.w.isEmpty())) {
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
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.s3, (Property<h88, Float>) View.ALPHA, z ? 1.0f : 0.0f), ObjectAnimator.ofFloat(this.s3, (Property<h88, Float>) View.SCALE_X, z ? 1.0f : 0.5f), ObjectAnimator.ofFloat(this.s3, (Property<h88, Float>) View.SCALE_Y, z ? 1.0f : 0.5f), ObjectAnimator.ofFloat(this.s3, (Property<h88, Float>) View.TRANSLATION_Y, z ? 0.0f : gl.L(12.0f)));
        this.t3.setDuration(380L);
        this.t3.setInterpolator(s33.h);
        this.t3.addListener(new e88(this, b));
        this.t3.start();
    }

    public final void l() {
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
        v48 v48Var = this.D1;
        if (v48Var == null || (animatorSet = v48Var.s) == null) {
            return;
        }
        animatorSet.cancel();
        v48Var.s = null;
        v48Var.f = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x02df, code lost:
    
        if (r10 != null) goto L153;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final oac l0() {
        int i;
        zl6 zl6Var;
        long j;
        MediaCodec mediaCodec = null;
        r10 = null;
        ArrayList arrayList = null;
        mediaCodec = null;
        if (!this.s1 && B0() && this.C4.q() > 0) {
            int i2 = this.d2;
            float f = i2 == 1 ? 800.0f : i2 == 11 ? 500.0f : 854.0f;
            oac oacVar = new oac();
            oacVar.a = 0L;
            oacVar.d = 0.0f;
            oacVar.b = Math.min(3000L, this.X4.g);
            while (true) {
                j = oacVar.b;
                if (j <= 0 || j >= 1000) {
                    break;
                }
                oacVar.b = j << 1;
            }
            oacVar.e = j;
            oacVar.f = this.e8;
            oacVar.g = 0;
            oacVar.o = this.g5;
            long j2 = oacVar.b;
            oacVar.q = (int) ((j2 / 1000.0f) * 115200.0f);
            oacVar.r = j2;
            oacVar.n = 30;
            oacVar.v = j2;
            h98 h98Var = this.X4;
            oacVar.A = h98Var.d;
            String str = h98Var.b;
            if (str != null) {
                oacVar.B = str;
                ArrayList arrayList2 = h98Var.f;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    arrayList = this.X4.f;
                }
                oacVar.G = arrayList;
            } else {
                oacVar.B = h98Var.a;
                oacVar.G = h98Var.e;
            }
            oacVar.I = true;
            int q = this.C4.q();
            int o = this.C4.o();
            zl6 zl6Var2 = this.X4.c;
            if (zl6Var2 != null) {
                int i3 = zl6Var2.k;
                if (i3 == 90 || i3 == 270) {
                    o = q;
                    q = o;
                }
                q = (int) (q * zl6Var2.e);
                o = (int) (o * zl6Var2.f);
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
            oacVar.k = i5;
            oacVar.h = i5;
            oacVar.l = i6;
            oacVar.i = i6;
            oacVar.m = -1;
            oacVar.t = true;
            oacVar.c = 0L;
            return oacVar;
        }
        if (!this.s1 || ((this.W4 == null && this.V4 == null) || this.f8 == 0)) {
            return null;
        }
        oac oacVar2 = new oac();
        oacVar2.a = this.s8;
        oacVar2.b = this.t8;
        oacVar2.d = this.u8;
        oacVar2.e = this.v8;
        oacVar2.f = this.e8;
        oacVar2.g = this.h8;
        oacVar2.h = this.i8;
        oacVar2.i = this.j8;
        oacVar2.m = this.m8;
        oacVar2.o = this.e5;
        oacVar2.p = this.f5;
        long j3 = this.y8;
        if (j3 == 0) {
            j3 = 1;
        }
        oacVar2.q = j3;
        oacVar2.r = this.z8;
        oacVar2.n = this.p8;
        oacVar2.v = (long) (this.o8 * 1000.0f);
        h98 h98Var2 = this.X4;
        oacVar2.A = h98Var2.d;
        String str2 = h98Var2.b;
        if (str2 != null) {
            oacVar2.B = str2;
            ArrayList arrayList3 = h98Var2.f;
            oacVar2.G = (arrayList3 == null || arrayList3.isEmpty()) ? null : this.X4.f;
        } else {
            oacVar2.B = h98Var2.a;
            ArrayList arrayList4 = h98Var2.e;
            oacVar2.G = (arrayList4 == null || arrayList4.isEmpty()) ? null : this.X4.e;
        }
        if (this.d2 == 1 || this.r || !(this.k1.getTag() == null || (oacVar2.k == this.i8 && oacVar2.l == this.j8))) {
            if (this.r || this.d2 == 1) {
                this.e8 = 1;
                R2();
            }
            oacVar2.k = this.k8;
            oacVar2.l = this.l8;
            if (!this.r && this.d2 != 1) {
                r5 = this.m8;
            }
            oacVar2.m = r5;
        } else {
            oacVar2.k = this.i8;
            oacVar2.l = this.j8;
            oacVar2.m = this.r ? -1 : this.n8;
        }
        zl6 zl6Var3 = this.X4.c;
        oacVar2.H = zl6Var3;
        if (zl6Var3 != null) {
            oacVar2.g += zl6Var3.k;
            while (true) {
                i = oacVar2.g;
                if (i < 360) {
                    break;
                }
                oacVar2.g = i - 360;
            }
            if (i == 90 || i == 270) {
                zl6Var = oacVar2.H;
                zl6Var.i = (int) (oacVar2.k * zl6Var.f);
                zl6Var.j = (int) (oacVar2.l * zl6Var.e);
            } else {
                zl6Var = oacVar2.H;
                zl6Var.i = (int) (oacVar2.k * zl6Var.e);
                zl6Var.j = (int) (oacVar2.l * zl6Var.f);
            }
            if (this.d2 == 1) {
                int i7 = zl6Var.i;
                int i8 = 800;
                if (i7 > 800) {
                    zl6Var.i = 800;
                    i7 = 800;
                }
                int i10 = zl6Var.j;
                if (i10 > 800) {
                    zl6Var.j = 800;
                } else {
                    i8 = i10;
                }
                int min = Math.min(i7, i8);
                zl6Var.j = min;
                zl6Var.i = min;
            }
            if (w01.a) {
                StringBuilder sb = new StringBuilder("original transformed w = ");
                sb.append(oacVar2.H.i);
                sb.append(" h = ");
                sb.append(oacVar2.H.j);
                sb.append(" r = ");
                b00.p(oacVar2.g, sb);
            }
            zl6 zl6Var4 = oacVar2.H;
            int i11 = zl6Var4.i;
            int i12 = zl6Var4.j;
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
            zl6 zl6Var5 = oacVar2.H;
            zl6Var5.i = iArr[0];
            zl6Var5.j = iArr[1];
            if (w01.a) {
                StringBuilder sb2 = new StringBuilder("fixed transformed w = ");
                sb2.append(oacVar2.H.i);
                sb2.append(" h = ");
                b00.p(oacVar2.H.j, sb2);
            }
        }
        if (this.d2 == 1) {
            oacVar2.c = this.B8;
            oacVar2.j = this.n8;
        }
        oacVar2.t = this.r || this.d2 == 1;
        return oacVar2;
    }

    public final boolean l1(k27 k27Var, mu1 mu1Var, long j, long j2, long j3, i98 i98Var) {
        return m1(k27Var, null, null, null, null, null, null, 0, i98Var, mu1Var, j, j2, j3, true, null, null);
    }

    public final void l2(boolean z, boolean z2) {
        FrameLayout frameLayout = this.X7;
        if (!z2) {
            frameLayout.animate().setListener(null).cancel();
            this.X7.setVisibility(z ? 0 : 8);
            this.Y7.setTranslationY(0.0f);
            this.X7.setAlpha(this.Q0.getAlpha());
        } else if (z) {
            if (frameLayout.getTag() == null) {
                if (this.X7.getVisibility() != 0) {
                    this.X7.setVisibility(0);
                    this.X7.setAlpha(this.Q0.getAlpha());
                    this.Y7.setTranslationY(gl.L(58.0f));
                }
                ObjectAnimator objectAnimator = this.G7;
                if (objectAnimator != null) {
                    objectAnimator.removeAllListeners();
                    this.G7.cancel();
                }
                v78 v78Var = this.Y7;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(v78Var, (Property<v78, Float>) View.TRANSLATION_Y, v78Var.getTranslationY(), 0.0f);
                this.G7 = ofFloat;
                ofFloat.setDuration(220L);
                this.G7.setInterpolator(s33.f);
                this.G7.start();
            }
        } else if (frameLayout.getTag() != null) {
            ObjectAnimator objectAnimator2 = this.G7;
            if (objectAnimator2 != null) {
                objectAnimator2.removeAllListeners();
                this.G7.cancel();
            }
            v78 v78Var2 = this.Y7;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(v78Var2, (Property<v78, Float>) View.TRANSLATION_Y, v78Var2.getTranslationY(), gl.L(58.0f));
            this.G7 = ofFloat2;
            ofFloat2.addListener(new id4(this.X7));
            this.G7.setDuration(220L);
            this.G7.setInterpolator(s33.f);
            this.G7.start();
        }
        FrameLayout frameLayout2 = this.X7;
        if (frameLayout2 != null && frameLayout2.getVisibility() != 8) {
            this.X7.setTranslationY(this.Q0.getTranslationY() - (this.V1.getAlpha() * b00.c(46.0f, this.V1.getEditTextHeight(), 0)));
        }
        this.X7.setTag(z ? 1 : null);
    }

    public final void m() {
        if (this.d2 == 11) {
            c98 c98Var = this.t5;
            if (c98Var.o0 == 2) {
                c98Var.setCutOutState(true);
                f2(true, true);
                this.p5.f();
                this.f0.invalidate();
            }
        }
    }

    public final long m0() {
        x88 x88Var = this.g0;
        if (x88Var != null && x88Var.y) {
            return x88Var.getCurrentPosition();
        }
        lbc lbcVar = this.G2;
        if (lbcVar == null) {
            return 0L;
        }
        return lbcVar.S();
    }

    public final boolean m1(k27 k27Var, TLRPC.FileLocation fileLocation, gl5 gl5Var, gl5 gl5Var2, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, int i, o98 o98Var, mu1 mu1Var, long j, long j2, long j3, boolean z, l98 l98Var, Integer num) {
        TLRPC.Message message;
        o98 o98Var2;
        vs1 vs1Var;
        vs1 vs1Var2;
        vs1 vs1Var3;
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        PhotoViewer photoViewer = this;
        if (photoViewer.E != null && !photoViewer.e && ((o98Var != null || !photoViewer.r()) && (k27Var != null || fileLocation != null || arrayList != null || arrayList3 != null || arrayList2 != null || gl5Var != null || l98Var != null))) {
            p98 M = o98Var.M(k27Var, fileLocation, i, true, false);
            WindowManager windowManager = (WindowManager) photoViewer.E.getSystemService("window");
            if (photoViewer.S5) {
                try {
                    windowManager.removeView(photoViewer.h0);
                    photoViewer.Z0();
                } catch (Exception unused) {
                }
            }
            try {
                WindowManager.LayoutParams layoutParams = photoViewer.e0;
                layoutParams.type = 99;
                layoutParams.flags = -2147286784;
                if ((mu1Var == null || mu1Var.h == null) && ((photoViewer.z5 == 0 || !na7.q1(photoViewer.U).z2(photoViewer.z5)) && ((k27Var == null || (!na7.q1(photoViewer.U).z2(k27.B0(k27Var.k)) && ((message = k27Var.k) == null || !message.noforwards))) && ((k27Var == null || !k27Var.y2()) && !photoViewer.L0(l98Var))))) {
                    photoViewer.e0.flags &= -8193;
                    gl.f2();
                } else {
                    photoViewer.e0.flags |= TLObject.FLAG_13;
                    gl.f2();
                }
                photoViewer.e0.softInputMode = kk7.u4;
                photoViewer.h0.setFocusable(false);
                photoViewer.f0.setFocusable(false);
                windowManager.addView(photoViewer.h0, photoViewer.e0);
                Activity activity = photoViewer.E;
                if (activity instanceof LaunchActivity) {
                    ((LaunchActivity) activity).a1.add(photoViewer.t1);
                }
                byte b = 2;
                if (Build.VERSION.SDK_INT >= 33 && (findOnBackInvokedDispatcher = photoViewer.h0.findOnBackInvokedDispatcher()) != null) {
                    findOnBackInvokedDispatcher.registerOnBackInvokedCallback(0, new uo(photoViewer, b));
                }
                photoViewer.v7 = false;
                photoViewer.v2 = false;
                photoViewer.P = true;
                photoViewer.Q = false;
                photoViewer.z3 = true;
                photoViewer.E2 = false;
                photoViewer.l4 = mu1Var;
                photoViewer.t4 = num != null;
                w78 w78Var = photoViewer.h1;
                if (w78Var != null) {
                    w78Var.setImage((Bitmap) null);
                }
                photoViewer.N.c("");
                photoViewer.N.a("", false);
                m98 m98Var = photoViewer.O;
                if (m98Var != null) {
                    m98Var.b(0, 0, false);
                    photoViewer.O.d(false, false);
                }
                photoViewer.G.setTitleScrollNonFitText(false);
                wtc wtcVar = photoViewer.I7;
                if (wtcVar != null) {
                    wtcVar.a();
                    photoViewer.I7 = null;
                }
                wtc wtcVar2 = (wtc) new fu0(kk7.f(photoViewer.U), photoViewer).b;
                wtcVar2.e(kk7.k4);
                wtcVar2.b(kk7.Y1);
                wtcVar2.b(kk7.X1);
                wtcVar2.b(kk7.t3);
                wtcVar2.b(kk7.W1);
                wtcVar2.b(kk7.V);
                wtcVar2.b(kk7.U);
                wtcVar2.b(kk7.f3);
                wtcVar2.b(kk7.v);
                wtcVar2.b(kk7.b2);
                wtcVar2.b(kk7.a2);
                wtcVar2.b(kk7.l0);
                wtcVar2.b(kk7.x1);
                photoViewer.I7 = wtcVar2;
                photoViewer.d = o98Var;
                photoViewer.I5 = j2;
                photoViewer.E5 = j;
                photoViewer.F5 = (mu1Var == null || (vs1Var3 = mu1Var.D0) == null || !vs1Var3.O) ? null : mu1Var.F3;
                photoViewer.G5 = (mu1Var == null || (vs1Var2 = mu1Var.D0) == null || !vs1Var2.O) ? null : mu1Var.I3;
                photoViewer.H5 = (mu1Var == null || (vs1Var = mu1Var.D0) == null || !vs1Var.O) ? false : true;
                photoViewer.D5 = j3;
                photoViewer.q1.f();
                photoViewer.j7 = l98Var;
                photoViewer.p2 = null;
                if (photoViewer.U6 == null) {
                    photoViewer.U6 = VelocityTracker.obtain();
                }
                photoViewer.e = true;
                photoViewer.f = true;
                photoViewer.z2(false, false);
                photoViewer.m2 = !z;
                if (!z) {
                    photoViewer.s2(false, false);
                } else if (photoViewer.d2 == 1) {
                    photoViewer.E();
                    photoViewer.s2(false, false);
                } else {
                    photoViewer.s2(true, false);
                }
                photoViewer.h0.setClipChildren(false);
                photoViewer.k0.setVisibility(0);
                photoViewer.e3 = 0.0f;
                photoViewer.V2 = false;
                photoViewer.U2 = false;
                if (M != null) {
                    photoViewer.s4 = true;
                    photoViewer.n4 = (byte) 1;
                    if (k27Var != null) {
                        int i2 = k27Var.K1;
                        km m = M.o ? M.a.m() : null;
                        photoViewer.k2 = m;
                        if (m != null) {
                            if (k27.K4(k27Var.k)) {
                                ImageReceiver imageReceiver = M.a;
                                imageReceiver.u0 = false;
                                imageReceiver.x0();
                                if (MediaController.w().D(k27Var)) {
                                    photoViewer.e3 = k27Var.b0;
                                }
                                photoViewer.V2 = photoViewer.S2 == null && !ba4.G(i2).T(k27Var.F0(), true) && (photoViewer.k2.s() || !ba4.G(i2).T(k27Var.F0(), false));
                                photoViewer.k2 = null;
                            } else if (k27Var.l2().size() > 1) {
                                photoViewer.k2 = null;
                            }
                        }
                    } else if (l98Var != null) {
                        km m2 = M.o ? M.a.m() : null;
                        photoViewer.k2 = m2;
                        if (m2 != null && l98Var.a(i)) {
                            ImageReceiver imageReceiver2 = M.a;
                            imageReceiver2.u0 = false;
                            imageReceiver2.x0();
                            TLObject d = l98Var.d(i);
                            TLRPC.Document document = d instanceof TLRPC.Document ? (TLRPC.Document) d : null;
                            photoViewer.V2 = photoViewer.S2 == null && document != null && !ba4.G(photoViewer.U).T(document, true) && (photoViewer.k2.s() || !ba4.G(photoViewer.U).T(document, false));
                            photoViewer.k2 = null;
                        }
                    }
                    photoViewer.c1(k27Var, fileLocation, gl5Var, gl5Var2, arrayList, arrayList2, arrayList3, i, M);
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
                    km m3 = imageReceiver3.m();
                    int i4 = m3 != null ? m3.d[2] : 0;
                    if (i4 != 0) {
                        i3 = i4;
                    }
                    ClippingImageView[] c0 = photoViewer.c0(M);
                    photoViewer.m6 = 1.0f;
                    for (int i5 = 0; i5 < c0.length; i5++) {
                        ClippingImageView clippingImageView = c0[i5];
                        boolean z2 = M.r;
                        clippingImageView.O = photoViewer.k4;
                        clippingImageView.L = true;
                        clippingImageView.N = z2;
                        clippingImageView.setVisibility(0);
                        c0[i5].setRadius(M.h);
                        ClippingImageView clippingImageView2 = c0[i5];
                        int i6 = M.a.W;
                        clippingImageView2.e = i3;
                        clippingImageView2.f = i6;
                        clippingImageView2.setImageBitmap(M.e);
                    }
                    photoViewer.E0();
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
                        if (c0.length > 1 || M.r) {
                            c0[i7].setAlpha(0.0f);
                        } else {
                            c0[i7].setAlpha(1.0f);
                        }
                        c0[i7].setPivotX(0.0f);
                        c0[i7].setPivotY(0.0f);
                        c0[i7].setScaleX(M.k);
                        c0[i7].setScaleY(M.k);
                        c0[i7].setTranslationX((rectF.left * M.k) + M.b);
                        c0[i7].setTranslationY((rectF.top * M.k) + M.c);
                        c0[i7].setLayoutParams(layoutParams2);
                    }
                    photoViewer = this;
                    photoViewer.h0.getViewTreeObserver().addOnPreDrawListener(new v(this, c0, layoutParams2, f, M, f2, o98Var, arrayList3, num));
                } else {
                    if (arrayList3 != null && photoViewer.d2 != 3 && ((o98Var2 = photoViewer.d) == null || !o98Var2.P())) {
                        photoViewer.V0();
                    }
                    photoViewer.f0.setAlpha(1.0f);
                    photoViewer.c1(k27Var, fileLocation, gl5Var, gl5Var2, arrayList, arrayList2, arrayList3, i, M);
                    photoViewer.E0();
                    photoViewer.H1();
                    mu1 mu1Var2 = photoViewer.l4;
                    if (mu1Var2 != null) {
                        mu1Var2.Z5();
                        UndoView undoView = mu1Var2.N3;
                        if (undoView != null) {
                            undoView.d(1, false);
                        }
                        photoViewer.l4.getFragmentView().invalidate();
                    }
                    photoViewer.h0.getViewTreeObserver().addOnPreDrawListener(new x(photoViewer, o98Var, num));
                }
                AccessibilityManager accessibilityManager = (AccessibilityManager) photoViewer.E.getSystemService("accessibility");
                if (accessibilityManager.isTouchExplorationEnabled()) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    obtain.setEventType(TLObject.FLAG_14);
                    obtain.getText().add(k96.M0(2131754808, "AccDescrPhotoViewer"));
                    accessibilityManager.sendAccessibilityEvent(obtain);
                }
                return true;
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
        return false;
    }

    public final void m2() {
        lbc lbcVar;
        if (!this.s1 || (lbcVar = this.G2) == null || lbcVar.c0() || S0()) {
            return;
        }
        if (!this.r || this.d2 == 1) {
            this.G2.A0(0.0f);
        }
        this.H2 = false;
        A2();
    }

    public final void n() {
        Runnable runnable = this.I2;
        if (runnable != null) {
            gl.r(runnable);
            this.I2 = null;
        }
    }

    public final TLObject n0(int i, long[] jArr) {
        if (i < 0) {
            return null;
        }
        ArrayList arrayList = this.e7;
        if (!arrayList.isEmpty()) {
            if (i >= arrayList.size()) {
                return null;
            }
            if (jArr != null) {
                jArr[0] = ((uu9) arrayList.get(i)).b.size;
            }
            return (TLObject) arrayList.get(i);
        }
        ArrayList arrayList2 = this.a7;
        if (!arrayList2.isEmpty()) {
            if (i >= arrayList2.size()) {
                return null;
            }
            if (jArr != null) {
                ArrayList arrayList3 = this.c7;
                if (arrayList3.get(i) != null) {
                    jArr[0] = ((Long) arrayList3.get(i)).longValue();
                }
            }
            ArrayList arrayList4 = this.b7;
            if (arrayList4.get(i) != null) {
                return ((gl5) arrayList4.get(i)).f;
            }
            return null;
        }
        ArrayList arrayList5 = this.Y6;
        if (arrayList5.isEmpty() || i >= arrayList5.size()) {
            return null;
        }
        k27 k27Var = (k27) arrayList5.get(i);
        TLRPC.Message message = k27Var.k;
        if (message instanceof TLRPC.TL_messageService) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionUserUpdatedPhoto) {
                return messageAction.newUserPhoto.photo_big;
            }
            TLRPC.PhotoSize w = ba4.w(k27Var.p0, gl.Y0(false), false, null, false);
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
            TLRPC.MessageMedia messageMedia = k27Var.a1;
            if (messageMedia != null) {
                TLRPC.Document document = messageMedia.document;
                if (document != null) {
                    TLRPC.PhotoSize w2 = ba4.w(document.thumbs, 90, false, null, false);
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
                    TLRPC.PhotoSize w3 = ba4.w(photo.sizes, gl.Y0(false), false, null, true);
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
            } else if (((k27.n1(message) instanceof TLRPC.TL_messageMediaPhoto) && k27.n1(k27Var.k).photo != null) || ((k27.n1(k27Var.k) instanceof TLRPC.TL_messageMediaWebPage) && k27.n1(k27Var.k).webpage != null)) {
                TLRPC.PhotoSize w4 = ba4.w(k27Var.p0, gl.Y0(true), false, null, true);
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
                if (k27.n1(k27Var.k) instanceof TLRPC.TL_messageMediaInvoice) {
                    return ((TLRPC.TL_messageMediaInvoice) k27.n1(k27Var.k)).photo;
                }
                if (k27Var.F0() != null && k27.W2(k27Var.F0())) {
                    TLRPC.PhotoSize w5 = ba4.w(k27Var.F0().thumbs, 90, false, null, false);
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

    public final void n1(ArrayList arrayList, int i, int i2, boolean z, o98 o98Var, mu1 mu1Var) {
        hn hnVar;
        int i3 = i2;
        this.i2 = z;
        jh3 jh3Var = this.T0;
        if (jh3Var != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) jh3Var.getLayoutParams();
            if (i3 == 4 || i3 == 5) {
                this.T0.setResourceId(R.drawable.send_plane_24);
                layoutParams.bottomMargin = gl.L(1.0f);
            } else if (i3 == 13 || i3 == 14 || i3 == 1 || i3 == 3 || i3 == 10 || i3 == 11) {
                this.T0.setResourceId(R.drawable.floating_check);
                this.T0.setPadding(0, gl.L(1.0f), 0, 0);
                layoutParams.bottomMargin = gl.L(1.0f);
            } else {
                this.T0.setResourceId(R.drawable.send_plane_24);
                layoutParams.bottomMargin = gl.L(1.0f);
            }
            this.T0.setLayoutParams(layoutParams);
        }
        if (i3 != 11 && this.p5 != null) {
            this.B7 = false;
            ImageView imageView = this.d1;
            if (imageView != null) {
                imageView.setAlpha(1.0f);
            }
            c98 c98Var = this.y5;
            if (c98Var != null) {
                c98Var.m(false, false);
            }
            this.p5.b();
            ArrayList arrayList2 = this.r5;
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
            this.d = o98Var;
            this.I5 = 0L;
            this.E5 = 0L;
            this.q1.f();
            this.j7 = null;
            if (this.U6 == null) {
                this.U6 = VelocityTracker.obtain();
            }
            this.e = true;
            this.f = true;
            z2(false, false);
            this.m2 = false;
            E();
            s2(false, false);
            this.e3 = 0.0f;
            this.V2 = false;
            this.U2 = false;
            V0();
            backgroundDrawable.setAlpha(kk7.d4);
            this.f0.setAlpha(1.0f);
            c1(null, null, null, null, null, null, arrayList, i, null);
            E0();
            H1();
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
            n98 n98Var = this.N;
            if (n98Var != null && (hnVar = n98Var.d) != null) {
                hnVar.setVisibility(this.f2 ? 8 : 0);
            }
            m1(null, null, null, null, null, null, arrayList, i, o98Var, mu1Var, 0L, 0L, 0L, true, null, null);
            return;
        }
        this.d2 = i3;
        this.v2 = false;
        this.N.c("");
        this.N.a("", false);
        this.d = o98Var;
        this.I5 = 0L;
        this.E5 = 0L;
        this.q1.f();
        this.j7 = null;
        if (this.U6 == null) {
            this.U6 = VelocityTracker.obtain();
        }
        this.e = true;
        this.f = true;
        z2(false, false);
        this.e3 = 0.0f;
        this.V2 = false;
        this.U2 = false;
        V0();
        backgroundDrawable.setAlpha(kk7.d4);
        this.f0.setAlpha(1.0f);
        c1(null, null, null, null, null, null, arrayList, i, null);
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
    public final void n2(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        String str;
        lm6 lm6Var;
        int i7;
        Bitmap decodeFile;
        Bitmap bitmap;
        int i8;
        int i10;
        byte b;
        ju7 ju7Var;
        kac kacVar;
        zl6 zl6Var;
        int i11;
        boolean z;
        byte b2;
        int i12;
        int i13;
        int i14;
        boolean z2;
        float min;
        float f;
        zl6 zl6Var2;
        int i15;
        if (this.u4 != i) {
            boolean z3 = this.s1;
            if (z3) {
                u78[] u78VarArr = this.X0;
                if (u78VarArr[0].h != 3 && !z3 && (this.C4.n() == null || u78VarArr[0].h != -1)) {
                    return;
                }
            }
            if (this.q6 == null && this.p6 == null && !J0()) {
                o98 o98Var = this.d;
                if (o98Var != null && (this.u4 == 0 || i == 0)) {
                    o98Var.j();
                }
                this.h0.setClipChildren(i == 2);
                int i16 = 2130706432;
                int color = this.k0.getBackground() instanceof ColorDrawable ? ((ColorDrawable) this.k0.getBackground()).getColor() : 2130706432;
                if (i == 1) {
                    i16 = -872415232;
                } else {
                    if (i != 3) {
                        if (i == 0 && this.S4 && this.i7 == null) {
                            i16 = this.d2 == 11 ? 1711276032 : 0;
                        }
                    }
                    i16 = -16777216;
                }
                e2(this.R4 && this.i7 == null && i == 0, true);
                j2((i == 0 || i == 4 || (i == 3 && this.B7)) && this.d2 == 11, true);
                this.k0.setVisibility(i != 2 ? 0 : 4);
                this.o6 = i;
                if (this.u4 == 0) {
                    m98 m98Var = this.O;
                    this.x7 = m98Var != null && m98Var.isShown();
                }
                m98 m98Var2 = this.O;
                if (m98Var2 != null) {
                    m98Var2.d(i == 0 && this.x7, true);
                }
                h98 h98Var = this.X4;
                c33 c33Var = this.E1;
                if (i == 0) {
                    Bitmap n = this.C4.n();
                    q88 q88Var = this.M1;
                    if (q88Var != null) {
                        q88Var.setDrawShadow(false);
                    }
                    byte b3 = this.u4;
                    if (b3 == 4 || b3 == 5) {
                        this.n6 = System.currentTimeMillis();
                        float f2 = this.Y5;
                        this.i6 = f2;
                        this.d6 = f2;
                        float f3 = this.X5;
                        this.h6 = f3;
                        this.c6 = f3;
                        float f4 = this.b6;
                        this.k6 = f4;
                        this.f6 = f4;
                        this.g6 = 0.0f;
                        float f5 = this.a6;
                        this.j6 = f5;
                        this.e6 = f5;
                    } else if (n != null) {
                        int q = this.C4.q();
                        int o = this.C4.o();
                        byte b4 = this.u4;
                        if (b4 == 3) {
                            if (this.d2 == 1) {
                                int i17 = c33Var.i;
                                if (i17 == 90 || i17 == 270) {
                                    o = q;
                                    q = o;
                                }
                            } else {
                                zl6 zl6Var3 = h98Var.c;
                                if (zl6Var3 != null) {
                                    int i18 = zl6Var3.k;
                                    if (i18 == 90 || i18 == 270) {
                                        o = q;
                                        q = o;
                                    }
                                    q = (int) (q * zl6Var3.e);
                                    o = (int) (o * zl6Var3.f);
                                }
                            }
                            float f6 = q;
                            float f7 = o;
                            float min2 = Math.min(i0(0) / f6, f0(0, false) / f7);
                            f = Math.min(i0(3) / f6, f0(3, false) / f7);
                            min = min2;
                            z2 = false;
                        } else {
                            if (b4 != 1 && (zl6Var2 = h98Var.c) != null && ((i15 = zl6Var2.k) == 90 || i15 == 270)) {
                                float f8 = o;
                                float h0 = h0() / f8;
                                float f10 = q;
                                if (h0 * f10 > g0()) {
                                    h0 = g0() / f10;
                                }
                                this.a6 = 1.0f / (h0 / Math.min(h0() / f10, g0() / f8));
                            } else if (this.d2 == 1 && ((i13 = c33Var.i) == 90 || i13 == 270)) {
                                float f11 = o;
                                float h02 = h0() / f11;
                                float f12 = q;
                                if (h02 * f12 > g0()) {
                                    h02 = g0() / f12;
                                }
                                this.a6 = 1.0f / ((((c33Var.f / c33Var.l) * h02) / Math.min(h0() / f12, g0() / f11)) / c33Var.m);
                            }
                            zl6 zl6Var4 = h98Var.c;
                            if (zl6Var4 != null) {
                                int i19 = zl6Var4.k;
                                if (i19 == 90 || i19 == 270) {
                                    o = q;
                                    q = o;
                                }
                                q = (int) (q * zl6Var4.e);
                                o = (int) (o * zl6Var4.f);
                            } else if (this.d2 == 1 && ((i14 = c33Var.i) == 90 || i14 == 270)) {
                                o = q;
                                q = o;
                            }
                            float f13 = q;
                            float f14 = o;
                            float min3 = Math.min(h0() / f13, g0() / f14);
                            if (this.d2 == 1) {
                                int i20 = c33Var.i;
                                min = j0(i20 == 90 || i20 == 270);
                                f = min3;
                                z2 = false;
                            } else {
                                z2 = false;
                                min = Math.min(i0(0) / f13, f0(0, false) / f14);
                                f = min3;
                            }
                        }
                        if (this.u4 == 4) {
                            this.v5.m(z2, true);
                            this.w5.m(z2, true);
                        }
                        if (this.d2 == 11) {
                            byte b5 = this.u4;
                            byte b6 = (b5 == 3 || b5 == 2) ? (byte) 1 : (byte) 1;
                            this.n6 = System.currentTimeMillis();
                            this.c6 = this.h6;
                            byte b7 = this.u4;
                            if (b7 == b6) {
                                this.d6 = this.i6 + gl.L(56.0f);
                            } else if (b7 == 3) {
                                float L = this.i6 + gl.L(44.0f);
                                this.d6 = L;
                                if (this.M1 != null) {
                                    float additionalTop = L - (r4.getAdditionalTop() / 2.0f);
                                    this.d6 = additionalTop;
                                    this.d6 = (this.M1.getAdditionalBottom() / 2.0f) + additionalTop;
                                }
                            } else if (b7 == 2) {
                                this.d6 = this.i6 + gl.L(93.0f);
                            }
                            if (!this.s) {
                                this.d6 -= gl.m / 2;
                            }
                            this.e6 = (min / f) * this.j6;
                            this.f6 = this.k6;
                            this.g6 = 0.0f;
                            this.n6 = System.currentTimeMillis();
                            this.R6 = true;
                        }
                        this.e6 = x1() * (min / f);
                        this.c6 = 0.0f;
                        this.X5 = (s0() / 2) - (w0() / 2);
                        int i21 = this.d2;
                        byte b8 = this.u4;
                        if (i21 != 1) {
                            if (b8 == 1) {
                                this.d6 = gl.L(56.0f);
                            } else if (b8 == 2) {
                                this.d6 = gl.L(93.0f);
                            } else if (b8 == 3) {
                                float L2 = gl.L(44.0f);
                                this.d6 = L2;
                                if (this.M1 != null) {
                                    float additionalTop2 = L2 - (r4.getAdditionalTop() / 2.0f);
                                    this.d6 = additionalTop2;
                                    this.d6 = (this.M1.getAdditionalBottom() / 2.0f) + additionalTop2;
                                }
                            }
                            if (!this.s) {
                                this.d6 -= gl.m / 2;
                            }
                        } else if (b8 == 2) {
                            this.d6 = gl.L(36.0f);
                        } else if (b8 == 3) {
                            float f15 = -gl.L(12.0f);
                            this.d6 = f15;
                            if (this.M1 != null) {
                                this.d6 = f15 - (r4.getAdditionalTop() / 2.0f);
                            }
                        }
                        this.n6 = System.currentTimeMillis();
                        this.R6 = true;
                    } else {
                        z = false;
                        this.u2 = z;
                        this.p6 = new AnimatorSet();
                        ArrayList arrayList = new ArrayList(4);
                        b2 = this.u4;
                        if (b2 != 1) {
                            arrayList.add(ObjectAnimator.ofFloat(this.V0, (Property<z92, Float>) View.TRANSLATION_Y, gl.L(48.0f)));
                            arrayList.add(ObjectAnimator.ofFloat(this, rn.g, 0.0f, 1.0f));
                            arrayList.add(ObjectAnimator.ofFloat(this.D1, (Property<v48, Float>) View.ALPHA, 0.0f));
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            ofFloat.addUpdateListener(new f68(this, (byte) 2));
                            arrayList.add(ofFloat);
                            i12 = 2;
                        } else if (b2 == 2) {
                            this.J1.c();
                            arrayList.add(ObjectAnimator.ofFloat(this.J1.getToolsView(), (Property<FrameLayout, Float>) View.TRANSLATION_Y, gl.L(186.0f)));
                            e58 curveControl = this.J1.getCurveControl();
                            Property property = View.ALPHA;
                            arrayList.add(ObjectAnimator.ofFloat(curveControl, (Property<e58, Float>) property, 0.0f));
                            arrayList.add(ObjectAnimator.ofFloat(this.J1.getBlurControl(), (Property<c58, Float>) property, 0.0f));
                            i12 = 2;
                            arrayList.add(ObjectAnimator.ofFloat(this, rn.g, 0.0f, 1.0f));
                        } else {
                            if (b2 == 3) {
                                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.M1.getOffsetTranslationY(), gl.L(126.0f));
                                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, -gl.L(12.0f));
                                ofFloat2.addUpdateListener(new f68(this, (byte) 3));
                                ofFloat3.addUpdateListener(new f68(this, (byte) 4));
                                this.y4.c();
                                this.f0.invalidate();
                                this.M1.C0();
                                arrayList.add(ofFloat2);
                                arrayList.add(ofFloat3);
                                arrayList.add(ObjectAnimator.ofFloat(this, rn.g, 0.0f, 1.0f));
                                this.M1.o0(true);
                            } else if (b2 == 4) {
                                arrayList.add(ObjectAnimator.ofFloat(this.O1.r, (Property<FrameLayout, Float>) View.TRANSLATION_Y, gl.L(18.0f)));
                                FrameLayout frameLayout = this.O1.r;
                                Property property2 = View.ALPHA;
                                arrayList.add(ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property2, 0.0f));
                                arrayList.add(ObjectAnimator.ofFloat(this.O1.x, (Property<zt7, Float>) View.TRANSLATION_X, gl.L(-18.0f)));
                                arrayList.add(ObjectAnimator.ofFloat(this.O1.x, (Property<zt7, Float>) property2, 0.0f));
                            } else if (b2 == 5) {
                                this.q5.setVisibility(0);
                                i12 = 2;
                                arrayList.add(ObjectAnimator.ofFloat(this.q5, (Property<v98, Float>) View.ALPHA, 1.0f, 0.0f));
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
                        this.p6.playTogether(arrayList);
                        this.p6.setDuration(200L);
                        this.p6.addListener(new s(this, i));
                        this.p6.start();
                    }
                    z = false;
                    this.u2 = z;
                    this.p6 = new AnimatorSet();
                    ArrayList arrayList2 = new ArrayList(4);
                    b2 = this.u4;
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
                    this.p6.playTogether(arrayList2);
                    this.p6.setDuration(200L);
                    this.p6.addListener(new s(this, i));
                    this.p6.start();
                } else {
                    if (i == 1) {
                        m2();
                        E();
                        this.J2 = c33Var.a;
                        this.K2 = c33Var.b;
                        this.L2 = c33Var.c;
                        this.O2 = c33Var.f;
                        this.P2 = c33Var.g;
                        this.R2 = c33Var.i;
                        this.M2 = c33Var.j;
                        this.N2 = c33Var.k;
                        this.Q2 = c33Var.h;
                        CropAreaView cropAreaView = this.D1.b.a;
                        cropAreaView.f(true, false);
                        cropAreaView.setDimVisibility(true);
                        cropAreaView.invalidate();
                        ((TextView) this.V0.b).setText(k96.L0(2131751687));
                        zkb.X((TextView) this.V0.b, bkb.pg, this.w2);
                        this.q6 = new AnimatorSet();
                        ArrayList arrayList3 = new ArrayList();
                        jo0 jo0Var = this.Q0;
                        Property property3 = View.TRANSLATION_Y;
                        arrayList3.add(ObjectAnimator.ofFloat(jo0Var, (Property<jo0, Float>) property3, 0.0f, this.V1.getEditTextHeight() + jo0Var.getHeight() + (this.s1 ? gl.L(58.0f) : 0)));
                        jo0 jo0Var2 = this.Q0;
                        Property property4 = View.ALPHA;
                        arrayList3.add(ObjectAnimator.ofFloat(jo0Var2, (Property<jo0, Float>) property4, 0.0f));
                        mza mzaVar = this.p5;
                        if (mzaVar != null) {
                            arrayList3.add(ObjectAnimator.ofFloat(mzaVar, (Property<mza, Float>) property4, 0.0f));
                        }
                        rj4 rj4Var = this.s5;
                        if (rj4Var != null) {
                            arrayList3.add(ObjectAnimator.ofFloat(rj4Var, (Property<rj4, Float>) property4, 0.0f));
                        }
                        arrayList3.add(ObjectAnimator.ofFloat(this.T0, (Property<jh3, Float>) property3, 0.0f, gl.L(this.s1 ? 154.0f : 96.0f)));
                        arrayList3.add(ObjectAnimator.ofFloat(this.G, (Property<x10, Float>) property3, 0.0f, -r4.getHeight()));
                        arrayList3.add(ObjectAnimator.ofObject(this.k0, "backgroundColor", new ArgbEvaluator(), Integer.valueOf(color), Integer.valueOf(i16)));
                        if (this.j2) {
                            arrayList3.add(ObjectAnimator.ofFloat(this.R1, (Property<g98, Float>) property3, 0.0f, gl.L(this.s1 ? 154.0f : 96.0f)));
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
                            arrayList3.add(ObjectAnimator.ofFloat(this.p1, (Property<t98, Float>) property4, fArr));
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
                            arrayList3.add(ObjectAnimator.ofFloat(this.g1, (Property<o76, Float>) property4, fArr3));
                        }
                        if (this.h1.getTag() != null) {
                            float[] fArr4 = new float[i11];
                            // fill-array-data instruction
                            fArr4[0] = 1.0f;
                            fArr4[1] = 0.0f;
                            arrayList3.add(ObjectAnimator.ofFloat(this.h1, (Property<w78, Float>) property4, fArr4));
                        }
                        View view3 = this.k0;
                        if (view3 != null) {
                            arrayList3.add(ObjectAnimator.ofFloat(view3, (Property<View, Float>) property4, 1.0f));
                        }
                        this.q6.playTogether(arrayList3);
                        this.q6.setDuration(200L);
                        this.q6.addListener(new t(this, i));
                        this.q6.start();
                    } else {
                        ArrayList arrayList4 = this.g7;
                        if (i == 2) {
                            boolean z4 = (!this.s1 || this.C2 == null || (this.J4 && T0())) ? false : true;
                            if (z4) {
                                m2();
                            }
                            if (this.J1 == null) {
                                if (arrayList4.isEmpty()) {
                                    str = null;
                                    lm6Var = null;
                                    i7 = 0;
                                } else {
                                    Object obj = arrayList4.get(this.P4);
                                    i7 = obj instanceof jm6 ? ((jm6) obj).J : 0;
                                    bm6 bm6Var = (bm6) obj;
                                    lm6 lm6Var2 = bm6Var.o;
                                    str = bm6Var.a();
                                    lm6Var = lm6Var2;
                                }
                                if (z4) {
                                    i8 = i7;
                                    bitmap = null;
                                } else {
                                    if (lm6Var == null) {
                                        mza mzaVar2 = this.p5;
                                        decodeFile = mzaVar2.M ? mzaVar2.getSourceBitmap() : this.C4.n();
                                        i7 = this.C4.V;
                                    } else {
                                        decodeFile = BitmapFactory.decodeFile(str);
                                    }
                                    bitmap = decodeFile;
                                    i8 = i7;
                                }
                                if (this.d2 == 1) {
                                    i10 = 1;
                                } else if (z4 || (b = this.w4) == 2) {
                                    i10 = 2;
                                } else {
                                    i10 = b == 1 ? 1 : 0;
                                }
                                Bitmap segmentedDarkMaskImage = this.p5.getSegmentedDarkMaskImage();
                                Activity activity = this.E;
                                if (z4) {
                                    kacVar = (kac) this.C2;
                                    ju7Var = null;
                                } else {
                                    ju7Var = this.y4;
                                    kacVar = null;
                                }
                                l58 l58Var = new l58(activity, kacVar, bitmap, segmentedDarkMaskImage, i8, lm6Var, ju7Var, i10, !z4 && (((zl6Var = h98Var.c) != null && zl6Var.l) || c33Var.h), true, null, this.w2);
                                this.J1 = l58Var;
                                this.f0.addView(l58Var, nme.c(-1.0f, -1));
                                this.J1.getDoneTextView().setOnClickListener(new j68(this, (byte) 1));
                                this.J1.getCancelTextView().setOnClickListener(new j68(this, (byte) 2));
                                this.J1.getToolsView().setTranslationY(gl.L(186.0f));
                            }
                            this.q6 = new AnimatorSet();
                            ArrayList arrayList5 = new ArrayList();
                            jo0 jo0Var3 = this.Q0;
                            Property property5 = View.TRANSLATION_Y;
                            arrayList5.add(ObjectAnimator.ofFloat(jo0Var3, (Property<jo0, Float>) property5, 0.0f, this.V1.getEditTextHeight() + jo0Var3.getHeight() + (this.s1 ? gl.L(58.0f) : 0)));
                            jo0 jo0Var4 = this.Q0;
                            Property property6 = View.ALPHA;
                            arrayList5.add(ObjectAnimator.ofFloat(jo0Var4, (Property<jo0, Float>) property6, 0.0f));
                            mza mzaVar3 = this.p5;
                            if (mzaVar3 != null) {
                                arrayList5.add(ObjectAnimator.ofFloat(mzaVar3, (Property<mza, Float>) property6, 0.0f));
                            }
                            rj4 rj4Var2 = this.s5;
                            if (rj4Var2 != null) {
                                arrayList5.add(ObjectAnimator.ofFloat(rj4Var2, (Property<rj4, Float>) property6, 0.0f));
                            }
                            arrayList5.add(ObjectAnimator.ofFloat(this.T0, (Property<jh3, Float>) property5, 0.0f, gl.L(this.s1 ? 154.0f : 96.0f)));
                            arrayList5.add(ObjectAnimator.ofFloat(this.G, (Property<x10, Float>) property5, 0.0f, -r4.getHeight()));
                            int i23 = this.d2;
                            if (i23 == 0 || i23 == 4) {
                                arrayList5.add(ObjectAnimator.ofFloat(this.O0, (Property<CheckBox, Float>) property6, 1.0f, 0.0f));
                                arrayList5.add(ObjectAnimator.ofFloat(this.P0, (Property<CounterView, Float>) property6, 1.0f, 0.0f));
                            } else if (i23 == 1) {
                                arrayList5.add(ObjectAnimator.ofFloat(this.D1, (Property<v48, Float>) property6, 1.0f, 0.0f));
                            }
                            if (this.p1.getVisibility() == 0) {
                                arrayList5.add(ObjectAnimator.ofFloat(this.p1, (Property<t98, Float>) property6, 1.0f, 0.0f));
                            }
                            if (this.f1.getTag() != null) {
                                arrayList5.add(ObjectAnimator.ofFloat(this.f1, (Property<c7, Float>) property6, 1.0f, 0.0f));
                            }
                            if (this.g1.getTag() != null) {
                                arrayList5.add(ObjectAnimator.ofFloat(this.g1, (Property<o76, Float>) property6, 1.0f, 0.0f));
                            }
                            if (this.h1.getTag() != null) {
                                arrayList5.add(ObjectAnimator.ofFloat(this.h1, (Property<w78, Float>) property6, 1.0f, 0.0f));
                            }
                            arrayList5.add(ObjectAnimator.ofObject(this.k0, "backgroundColor", new ArgbEvaluator(), Integer.valueOf(color), Integer.valueOf(i16)));
                            this.q6.playTogether(arrayList5);
                            this.q6.setDuration(200L);
                            this.q6.addListener(new u(this, i));
                            this.q6.start();
                        } else if (i == 3) {
                            m2();
                            H();
                            this.q6 = new AnimatorSet();
                            ArrayList arrayList6 = new ArrayList();
                            jo0 jo0Var5 = this.Q0;
                            Property property7 = View.TRANSLATION_Y;
                            arrayList6.add(ObjectAnimator.ofFloat(jo0Var5, (Property<jo0, Float>) property7, this.V1.getEditTextHeight() + jo0Var5.getHeight() + (this.s1 ? gl.L(58.0f) : 0)));
                            jo0 jo0Var6 = this.Q0;
                            Property property8 = View.ALPHA;
                            arrayList6.add(ObjectAnimator.ofFloat(jo0Var6, (Property<jo0, Float>) property8, 0.0f));
                            mza mzaVar4 = this.p5;
                            if (mzaVar4 != null) {
                                arrayList6.add(ObjectAnimator.ofFloat(mzaVar4, (Property<mza, Float>) property8, this.B7 ? 1.0f : 0.0f));
                            }
                            rj4 rj4Var3 = this.s5;
                            if (rj4Var3 != null) {
                                arrayList6.add(ObjectAnimator.ofFloat(rj4Var3, (Property<rj4, Float>) property8, this.B7 ? 1.0f : 0.0f));
                            }
                            arrayList6.add(ObjectAnimator.ofFloat(this.T0, (Property<jh3, Float>) property7, gl.L(this.s1 ? 154.0f : 96.0f)));
                            arrayList6.add(ObjectAnimator.ofFloat(this.G, (Property<x10, Float>) property7, -r3.getHeight()));
                            arrayList6.add(ObjectAnimator.ofObject(this.k0, "backgroundColor", new ArgbEvaluator(), Integer.valueOf(color), Integer.valueOf(i16)));
                            if (this.j2) {
                                i5 = 1;
                                arrayList6.add(ObjectAnimator.ofFloat(this.R1, (Property<g98, Float>) property7, gl.L(this.s1 ? 154.0f : 96.0f)));
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
                                arrayList6.add(ObjectAnimator.ofFloat(this.D1, (Property<v48, Float>) property8, 1.0f, 0.0f));
                            } else {
                                i6 = 2;
                            }
                            if (this.p1.getVisibility() == 0) {
                                float[] fArr5 = new float[i6];
                                // fill-array-data instruction
                                fArr5[0] = 1.0f;
                                fArr5[1] = 0.0f;
                                arrayList6.add(ObjectAnimator.ofFloat(this.p1, (Property<t98, Float>) property8, fArr5));
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
                                arrayList6.add(ObjectAnimator.ofFloat(this.g1, (Property<o76, Float>) property8, fArr7));
                            }
                            if (this.h1.getTag() != null) {
                                float[] fArr8 = new float[i6];
                                // fill-array-data instruction
                                fArr8[0] = 1.0f;
                                fArr8[1] = 0.0f;
                                arrayList6.add(ObjectAnimator.ofFloat(this.h1, (Property<w78, Float>) property8, fArr8));
                            }
                            this.q6.playTogether(arrayList6);
                            this.q6.setDuration(200L);
                            this.q6.addListener(new e88(this, (byte) 2));
                            this.q6.start();
                        } else if (i == 4) {
                            G();
                            this.q6 = new AnimatorSet();
                            ArrayList arrayList7 = new ArrayList();
                            jo0 jo0Var7 = this.Q0;
                            Property property9 = View.TRANSLATION_Y;
                            arrayList7.add(ObjectAnimator.ofFloat(jo0Var7, (Property<jo0, Float>) property9, this.V1.getEditTextHeight() + jo0Var7.getHeight() + (this.s1 ? gl.L(58.0f) : 0)));
                            jo0 jo0Var8 = this.Q0;
                            Property property10 = View.ALPHA;
                            arrayList7.add(ObjectAnimator.ofFloat(jo0Var8, (Property<jo0, Float>) property10, 0.0f));
                            mza mzaVar5 = this.p5;
                            if (mzaVar5 != null) {
                                arrayList7.add(ObjectAnimator.ofFloat(mzaVar5, (Property<mza, Float>) property10, 1.0f));
                            }
                            rj4 rj4Var4 = this.s5;
                            if (rj4Var4 != null) {
                                arrayList7.add(ObjectAnimator.ofFloat(rj4Var4, (Property<rj4, Float>) property10, 1.0f));
                            }
                            arrayList7.add(ObjectAnimator.ofFloat(this.T0, (Property<jh3, Float>) property9, gl.L(this.s1 ? 154.0f : 96.0f)));
                            arrayList7.add(ObjectAnimator.ofFloat(this.G, (Property<x10, Float>) property9, -r4.getHeight()));
                            arrayList7.add(ObjectAnimator.ofObject(this.k0, "backgroundColor", new ArgbEvaluator(), Integer.valueOf(color), Integer.valueOf(i16)));
                            if (this.j2) {
                                i3 = 1;
                                arrayList7.add(ObjectAnimator.ofFloat(this.R1, (Property<g98, Float>) property9, gl.L(this.s1 ? 154.0f : 96.0f)));
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
                                arrayList7.add(ObjectAnimator.ofFloat(this.D1, (Property<v48, Float>) property10, 1.0f, 0.0f));
                            } else {
                                i4 = 2;
                            }
                            if (this.p1.getVisibility() == 0) {
                                float[] fArr9 = new float[i4];
                                // fill-array-data instruction
                                fArr9[0] = 1.0f;
                                fArr9[1] = 0.0f;
                                arrayList7.add(ObjectAnimator.ofFloat(this.p1, (Property<t98, Float>) property10, fArr9));
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
                                arrayList7.add(ObjectAnimator.ofFloat(this.g1, (Property<o76, Float>) property10, fArr11));
                            }
                            if (this.h1.getTag() != null) {
                                float[] fArr12 = new float[i4];
                                // fill-array-data instruction
                                fArr12[0] = 1.0f;
                                fArr12[1] = 0.0f;
                                arrayList7.add(ObjectAnimator.ofFloat(this.h1, (Property<w78, Float>) property10, fArr12));
                            }
                            this.q6.playTogether(arrayList7);
                            this.q6.setDuration(200L);
                            this.q6.addListener(new o88(this, i, (byte) 0));
                            this.q6.start();
                        } else if (i == 5) {
                            if (this.q5.b.a() || (i2 = this.P4) < 0 || i2 >= arrayList4.size() || !(arrayList4.get(this.P4) instanceof jm6)) {
                                return;
                            }
                            jm6 jm6Var = (jm6) arrayList4.get(this.P4);
                            this.q6 = new AnimatorSet();
                            ArrayList arrayList8 = new ArrayList();
                            jo0 jo0Var9 = this.Q0;
                            Property property11 = View.TRANSLATION_Y;
                            arrayList8.add(ObjectAnimator.ofFloat(jo0Var9, (Property<jo0, Float>) property11, this.V1.getEditTextHeight() + jo0Var9.getHeight() + (this.s1 ? gl.L(58.0f) : 0)));
                            jo0 jo0Var10 = this.Q0;
                            Property property12 = View.ALPHA;
                            arrayList8.add(ObjectAnimator.ofFloat(jo0Var10, (Property<jo0, Float>) property12, 0.0f));
                            arrayList8.add(ObjectAnimator.ofFloat(this.T0, (Property<jh3, Float>) property11, gl.L(this.s1 ? 154.0f : 96.0f)));
                            arrayList8.add(ObjectAnimator.ofFloat(this.G, (Property<x10, Float>) property11, -r4.getHeight()));
                            arrayList8.add(ObjectAnimator.ofObject(this.k0, "backgroundColor", new ArgbEvaluator(), Integer.valueOf(color), Integer.valueOf(i16)));
                            int i26 = this.d2;
                            if (i26 == 0 || i26 == 4) {
                                arrayList8.add(ObjectAnimator.ofFloat(this.O0, (Property<CheckBox, Float>) property12, 1.0f, 0.0f));
                                arrayList8.add(ObjectAnimator.ofFloat(this.P0, (Property<CounterView, Float>) property12, 1.0f, 0.0f));
                            } else if (i26 == 1) {
                                arrayList8.add(ObjectAnimator.ofFloat(this.D1, (Property<v48, Float>) property12, 1.0f, 0.0f));
                            }
                            if (this.p1.getVisibility() == 0) {
                                arrayList8.add(ObjectAnimator.ofFloat(this.p1, (Property<t98, Float>) property12, 1.0f, 0.0f));
                            }
                            if (this.f1.getTag() != null) {
                                arrayList8.add(ObjectAnimator.ofFloat(this.f1, (Property<c7, Float>) property12, 1.0f, 0.0f));
                            }
                            if (this.g1.getTag() != null) {
                                arrayList8.add(ObjectAnimator.ofFloat(this.g1, (Property<o76, Float>) property12, 1.0f, 0.0f));
                            }
                            if (this.h1.getTag() != null) {
                                arrayList8.add(ObjectAnimator.ofFloat(this.h1, (Property<w78, Float>) property12, 1.0f, 0.0f));
                            }
                            this.q5.setVisibility(0);
                            arrayList8.add(ObjectAnimator.ofFloat(this.q5, (Property<v98, Float>) property12, 0.0f, 1.0f));
                            this.q6.playTogether(arrayList8);
                            this.q6.setDuration(200L);
                            this.q6.addListener(new o88(this, i, (byte) 1));
                            this.q6.start();
                            o1();
                            this.q5.a(jm6Var, this.G2, this.w2);
                        }
                    }
                }
                k98 k98Var = this.f0;
                if (k98Var != null) {
                    k98Var.X();
                }
            }
        }
    }

    public final void o() {
        TextureView textureView;
        if (this.b8 == -1 || (textureView = this.C2) == null) {
            return;
        }
        this.b8 = -1L;
        this.A2.animate().alpha(1.0f).setInterpolator(s33.j).setDuration(85L).setListener(new u5(this, textureView.getBitmap(), (byte) 29)).start();
    }

    public final void o1() {
        lbc lbcVar = this.G2;
        if (lbcVar != null) {
            lbcVar.f0();
            return;
        }
        x88 x88Var = this.g0;
        if (x88Var != null) {
            x88Var.e();
        }
    }

    public final void o2(int i, boolean z) {
        if (this.T4 != null) {
            v1(false);
            ba4.G(this.U).f(this.T4.F0());
        } else if (this.i5 != null) {
            TLObject d = this.j7.d(this.P4);
            if (d instanceof TLRPC.Document) {
                v1(false);
                ba4.G(this.U).f((TLRPC.Document) d);
            }
        }
        vb5 vb5Var = this.m1;
        if (vb5Var != null) {
            vb5Var.setAnimateBackground(true);
        }
        this.Y2 = false;
        K1(z, true, false, this.P4 + i);
        if (Z1(this.T4) || Y1(this.P4)) {
            this.Y2 = true;
            X0(true);
            w(0, true);
        }
        u();
        try {
            fo.b(0);
            if (tg2.D().I()) {
                tg2.D().X(k0());
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // ms4
    public final boolean onDown(MotionEvent motionEvent) {
        if (!this.O6 && this.O0.getVisibility() != 0) {
            boolean[] zArr = this.x1;
            if (!zArr[0] && !zArr[1]) {
                float x = motionEvent.getX();
                if (x < Math.min(kk7.Q1, this.f0.getMeasuredWidth() / 8)) {
                    if (this.B4.D()) {
                        zArr[0] = true;
                        this.f0.invalidate();
                        return false;
                    }
                } else if (x > this.f0.getMeasuredWidth() - r3 && this.D4.D()) {
                    zArr[1] = true;
                    this.f0.invalidate();
                }
            }
        }
        return false;
    }

    @Override // ms4
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.a6 == 1.0f || this.d2 == 11) {
            return false;
        }
        this.V6.abortAnimation();
        this.V6.fling(Math.round(this.X5), Math.round(this.Y5), Math.round(f), Math.round(f2), (int) this.E6, (int) this.F6, (int) this.G6, (int) this.H6);
        this.f0.postInvalidate();
        return false;
    }

    @Override // ms4
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
    @Override // ms4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        boolean z;
        if (!this.I6 && !this.s6) {
            return e1(motionEvent);
        }
        k98 k98Var = this.f0;
        if (k98Var != null && k98Var.getTag() != null && this.X0[0] != null) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (x >= (i0(this.u4) - gl.L(100.0f)) / 2.0f) {
                if (x <= (gl.L(100.0f) + i0(this.u4)) / 2.0f && y >= (g0() - gl.L(100.0f)) / 2.0f) {
                    if (y <= (gl.L(100.0f) + g0()) / 2.0f) {
                        z = e1(motionEvent);
                        if (z) {
                            this.S6 = true;
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

    @Override // x74
    public final void p(int i, float f, float f2, y74 y74Var) {
        if (i == 0) {
            float f3 = 1.0f - f;
            this.U0.setTranslationY(gl.L(36.0f) * f3);
            this.U0.setAlpha(f);
            this.U0.setVisibility(f > 0.0f ? 0 : 8);
            if (this.g2) {
                this.Q0.setVisibility(f < 1.0f ? 0 : 8);
                this.Q0.setAlpha(f3);
                this.Q0.setTranslationY(gl.L(36.0f) * f);
                this.T0.setVisibility(f < 1.0f ? 0 : 8);
                this.T0.setAlpha(f3);
                this.T0.setTranslationY(gl.L(36.0f) * f);
            }
        }
    }

    public final String p0(int i) {
        TLRPC.WebDocument webDocument;
        TLRPC.PhotoSize w;
        TLRPC.PhotoSize w2;
        TLRPC.PhotoSize w3;
        if (i >= 0) {
            ArrayList arrayList = this.e7;
            if (arrayList.isEmpty()) {
                ArrayList arrayList2 = this.a7;
                boolean isEmpty = arrayList2.isEmpty();
                ArrayList arrayList3 = this.Y6;
                if (isEmpty && arrayList3.isEmpty()) {
                    ArrayList arrayList4 = this.g7;
                    if (arrayList4.isEmpty()) {
                        l98 l98Var = this.j7;
                        if (l98Var != null) {
                            return l98Var.c(i);
                        }
                    } else if (i < arrayList4.size()) {
                        Object obj = arrayList4.get(i);
                        if (obj instanceof nm6) {
                            nm6 nm6Var = (nm6) obj;
                            TLRPC.PhotoSize photoSize = nm6Var.L;
                            if (photoSize != null) {
                                return ba4.r(null, photoSize);
                            }
                            TLRPC.Document document = nm6Var.J;
                            if (document != null) {
                                return ba4.r(null, document);
                            }
                            return Utilities.a(nm6Var.C) + "." + fl5.x(nm6Var.C, "jpg");
                        }
                        if (obj instanceof TLRPC.BotInlineResult) {
                            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) obj;
                            TLRPC.Document document2 = botInlineResult.document;
                            if (document2 != null) {
                                return ba4.r(null, document2);
                            }
                            TLRPC.Photo photo = botInlineResult.photo;
                            if (photo != null) {
                                return ba4.r(null, ba4.w(photo.sizes, gl.Y0(false), false, null, false));
                            }
                            if (botInlineResult.content instanceof TLRPC.TL_webDocument) {
                                StringBuilder sb = new StringBuilder();
                                sb.append(Utilities.a(botInlineResult.content.url));
                                sb.append(".");
                                TLRPC.WebDocument webDocument2 = botInlineResult.content;
                                sb.append(fl5.x(webDocument2.url, ba4.H(webDocument2.mime_type)));
                                return sb.toString();
                            }
                        }
                    }
                } else if (arrayList2.isEmpty()) {
                    if (i < arrayList3.size()) {
                        TLRPC.Message message = ((k27) arrayList3.get(i)).k;
                        Pattern pattern = ba4.J;
                        if (message == null) {
                            return "";
                        }
                        if (message instanceof TLRPC.TL_messageService) {
                            TLRPC.Photo photo2 = message.action.photo;
                            if (photo2 == null) {
                                return "";
                            }
                            ArrayList<TLRPC.PhotoSize> arrayList5 = photo2.sizes;
                            return (arrayList5.size() <= 0 || (w3 = ba4.w(arrayList5, gl.Y0(false), false, null, false)) == null) ? "" : ba4.r(null, w3);
                        }
                        if (k27.n1(message) instanceof TLRPC.TL_messageMediaDocument) {
                            return ba4.r(null, k27.n1(message).document);
                        }
                        if (k27.n1(message) instanceof TLRPC.TL_messageMediaPhoto) {
                            ArrayList<TLRPC.PhotoSize> arrayList6 = k27.n1(message).photo.sizes;
                            return (arrayList6.size() <= 0 || (w2 = ba4.w(arrayList6, gl.Y0(true), false, null, true)) == null) ? "" : ba4.r(null, w2);
                        }
                        if (k27.n1(message) instanceof TLRPC.TL_messageMediaWebPage) {
                            if (k27.n1(message).webpage.document != null) {
                                return ba4.r(null, k27.n1(message).webpage.document);
                            }
                            if (k27.n1(message).webpage.photo == null) {
                                return "";
                            }
                            ArrayList<TLRPC.PhotoSize> arrayList7 = k27.n1(message).webpage.photo.sizes;
                            return (arrayList7.size() <= 0 || (w = ba4.w(arrayList7, gl.Y0(false), false, null, false)) == null) ? "" : ba4.r(null, w);
                        }
                        if (!(k27.n1(message) instanceof TLRPC.TL_messageMediaInvoice) || (webDocument = ((TLRPC.TL_messageMediaInvoice) k27.n1(message)).webPhoto) == null) {
                            return "";
                        }
                        return Utilities.a(webDocument.url) + "." + fl5.x(webDocument.url, ba4.H(webDocument.mime_type));
                    }
                } else if (i < arrayList2.size()) {
                    gl5 gl5Var = (gl5) arrayList2.get(i);
                    gl5 gl5Var2 = (gl5) this.b7.get(i);
                    if (gl5Var != null) {
                        if (gl5Var2 == null || gl5Var2 == gl5Var) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(gl5Var.f.volume_id);
                            sb2.append("_");
                            return de9.l(sb2, gl5Var.f.local_id, ".jpg");
                        }
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(gl5Var2.f.volume_id);
                        sb3.append("_");
                        return de9.l(sb3, gl5Var2.f.local_id, ".mp4");
                    }
                }
            } else if (i < arrayList.size()) {
                uu9 uu9Var = (uu9) arrayList.get(i);
                StringBuilder sb4 = new StringBuilder();
                sb4.append(uu9Var.b.dc_id);
                sb4.append("_");
                return ls6.p(sb4, uu9Var.b.id, ".jpg");
            }
        }
        return null;
    }

    public final void p1(boolean z) {
        oy8 y;
        h98 h98Var = this.X4;
        ArrayList arrayList = h98Var.e;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                mac macVar = (mac) h98Var.e.get(i);
                if (macVar.a == 0 && (macVar.b & 1) != 0) {
                    View view = macVar.I;
                    if ((view instanceof be0) && (y = ((be0) view).getImageReceiver().y()) != null) {
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

    public final void p2() {
        float f;
        int i;
        this.q6 = null;
        byte b = 8;
        this.Q0.setVisibility(8);
        this.T0.setVisibility(8);
        this.o0.setVisibility(8);
        this.f1.setVisibility(8);
        this.g1.setVisibility(8);
        this.h1.setVisibility(8);
        v48 v48Var = this.D1;
        if (v48Var != null) {
            v48Var.setVisibility(4);
        }
        this.p1.setVisibility(8);
        this.p1.setAlpha(0.0f);
        this.p1.setTranslationY(-gl.L(10.0f));
        this.P0.setRotationX(0.0f);
        this.p1.setEnabled(false);
        this.L = false;
        if (this.j2) {
            this.R1.setVisibility(4);
        }
        int i2 = this.d2;
        if (i2 == 0 || i2 == 4 || ((i2 == 2 || i2 == 5) && this.g7.size() > 1)) {
            this.O0.setVisibility(8);
            this.P0.setVisibility(8);
            C2();
        }
        e2(false, true);
        j2(false, true);
        Bitmap n = this.C4.n();
        float f2 = this.a6;
        if (this.d2 == 11) {
            this.i6 = this.Y5;
            this.h6 = this.X5;
            this.j6 = f2;
            this.k6 = this.b6;
            this.f6 = 0.0f;
        }
        byte b2 = 3;
        h98 h98Var = this.X4;
        if (n != null) {
            int q = this.C4.q();
            int o = this.C4.o();
            if (this.d2 == 1) {
                float L = gl.L(12.0f);
                this.d6 = L;
                f = 0.0f;
                if (this.M1 != null) {
                    this.d6 = (r4.getAdditionalTop() / 2.0f) + L;
                }
                int i3 = this.E1.i;
                if (i3 == 90 || i3 == 270) {
                    i = q;
                    q = o;
                    float f3 = q;
                    float f4 = i;
                    this.e6 = y1(false) * (Math.min(i0(3) / f3, f0(3, false) / f4) / Math.min(i0(this.u4) / f3, g0() / f4));
                    Rect rect = this.t2;
                    this.c6 = (rect.left / 2) - (rect.right / 2);
                    this.n6 = System.currentTimeMillis();
                    this.R6 = true;
                }
                i = o;
                float f32 = q;
                float f42 = i;
                this.e6 = y1(false) * (Math.min(i0(3) / f32, f0(3, false) / f42) / Math.min(i0(this.u4) / f32, g0() / f42));
                Rect rect2 = this.t2;
                this.c6 = (rect2.left / 2) - (rect2.right / 2);
                this.n6 = System.currentTimeMillis();
                this.R6 = true;
            } else {
                f = 0.0f;
                float f5 = (-gl.L(44.0f)) + (!this.s ? gl.m / 2 : 0);
                this.d6 = f5;
                if (this.M1 != null) {
                    float additionalTop = (r13.getAdditionalTop() / 2.0f) + f5;
                    this.d6 = additionalTop;
                    this.d6 = additionalTop - (this.M1.getAdditionalBottom() / 2.0f);
                }
                zl6 zl6Var = h98Var.c;
                if (zl6Var != null) {
                    int i4 = zl6Var.k;
                    if (i4 == 90 || i4 == 270) {
                        o = q;
                        q = o;
                    }
                    q = (int) (q * zl6Var.e);
                    i = (int) (o * zl6Var.f);
                    float f322 = q;
                    float f422 = i;
                    this.e6 = y1(false) * (Math.min(i0(3) / f322, f0(3, false) / f422) / Math.min(i0(this.u4) / f322, g0() / f422));
                    Rect rect22 = this.t2;
                    this.c6 = (rect22.left / 2) - (rect22.right / 2);
                    this.n6 = System.currentTimeMillis();
                    this.R6 = true;
                }
                i = o;
                float f3222 = q;
                float f4222 = i;
                this.e6 = y1(false) * (Math.min(i0(3) / f3222, f0(3, false) / f4222) / Math.min(i0(this.u4) / f3222, g0() / f4222));
                Rect rect222 = this.t2;
                this.c6 = (rect222.left / 2) - (rect222.right / 2);
                this.n6 = System.currentTimeMillis();
                this.R6 = true;
            }
        } else {
            f = 0.0f;
        }
        q88 q88Var = this.M1;
        if (q88Var != null) {
            q88Var.setDrawShadow(this.d2 == 11 && (h98Var == null || h98Var.c == null));
        }
        this.h0.setClipChildren(true);
        this.k0.setVisibility(4);
        this.p6 = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(gl.L(126.0f), f);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(-gl.L(12.0f), f);
        ofFloat.addUpdateListener(new f68(this, (byte) 7));
        ofFloat2.addUpdateListener(new f68(this, b));
        this.p6.playTogether(ObjectAnimator.ofFloat(this, rn.g, 0.0f, 1.0f), ofFloat, ofFloat2);
        this.M1.o0(true);
        this.p6.setDuration(200L);
        this.p6.addListener(new e88(this, b2));
        this.p6.start();
    }

    public final void q() {
        r6 r6Var = this.B0;
        if (r6Var != null) {
            r6Var.setTranslationX(this.g2 ? -gl.L(4.0f) : 0.0f);
        }
        r7 r7Var = this.F0;
        if (r7Var != null) {
            Q1(r7Var, this.g2, false);
        }
        boolean z = this.f2;
        if (z && this.J == null) {
            il0 c = this.Z.c(this.H, null, false);
            c.p(nod.i(this.w2));
            c.r(gl.L(20.0f));
            c.q(gl.L(7.0f));
            int L = gl.L(54.0f);
            int L2 = gl.L(54.0f);
            Matrix matrix = tk0.a;
            this.J = new sk0(L, L2, c);
        }
        ImageView imageView = this.H;
        if (z) {
            ote.a(imageView);
            this.H.setBackground(this.J);
        } else {
            imageView.setStateListAnimator(null);
            this.H.setBackground(this.I);
        }
    }

    public final gl5 q0(int i, long[] jArr) {
        if (i >= 0) {
            ArrayList arrayList = this.e7;
            if (arrayList.isEmpty()) {
                ArrayList arrayList2 = this.a7;
                if (arrayList2.isEmpty()) {
                    ArrayList arrayList3 = this.Y6;
                    if (!arrayList3.isEmpty() && i < arrayList3.size()) {
                        k27 k27Var = (k27) arrayList3.get(i);
                        TLRPC.Message message = k27Var.k;
                        if (!(message instanceof TLRPC.TL_messageService)) {
                            TLRPC.MessageMedia messageMedia = k27Var.a1;
                            if (messageMedia != null) {
                                TLRPC.Document document = messageMedia.document;
                                if (document != null) {
                                    return gl5.b(document);
                                }
                                TLRPC.Photo photo = messageMedia.photo;
                                if (photo != null) {
                                    TLRPC.PhotoSize w = ba4.w(photo.sizes, gl.Y0(false), false, null, true);
                                    if (w != null) {
                                        if (jArr != null) {
                                            long j = w.size;
                                            jArr[0] = j;
                                            if (j == 0) {
                                                jArr[0] = -1;
                                            }
                                        }
                                        return gl5.f(w, k27Var.a1.photo);
                                    }
                                    if (jArr != null) {
                                        jArr[0] = -1;
                                        return null;
                                    }
                                }
                            } else if ((!(k27.n1(message) instanceof TLRPC.TL_messageMediaPhoto) || k27.n1(k27Var.k).photo == null) && (!(k27.n1(k27Var.k) instanceof TLRPC.TL_messageMediaWebPage) || k27.n1(k27Var.k).webpage == null)) {
                                if (k27.n1(k27Var.k) instanceof TLRPC.TL_messageMediaInvoice) {
                                    return gl5.p(usc.c(((TLRPC.TL_messageMediaInvoice) k27.n1(k27Var.k)).webPhoto));
                                }
                                if (k27Var.F0() != null) {
                                    TLRPC.Document F0 = k27Var.F0();
                                    if (this.C5 == 5) {
                                        return gl5.b(F0);
                                    }
                                    if (k27.W2(k27Var.F0())) {
                                        TLRPC.PhotoSize w2 = ba4.w(F0.thumbs, 90, false, null, false);
                                        if (jArr != null) {
                                            long j2 = w2.size;
                                            jArr[0] = j2;
                                            if (j2 == 0) {
                                                jArr[0] = -1;
                                            }
                                        }
                                        return gl5.c(w2, F0);
                                    }
                                }
                            } else {
                                if (k27.t3(k27Var.k)) {
                                    return gl5.b(k27Var.F0());
                                }
                                TLRPC.PhotoSize w3 = ba4.w(k27Var.p0, gl.Y0(true), false, null, true);
                                if (w3 != null) {
                                    if (jArr != null) {
                                        long j3 = w3.size;
                                        jArr[0] = j3;
                                        if (j3 == 0) {
                                            jArr[0] = -1;
                                        }
                                    }
                                    return gl5.f(w3, k27Var.n0);
                                }
                                if (jArr != null) {
                                    jArr[0] = -1;
                                    return null;
                                }
                            }
                        } else if (!(message.action instanceof TLRPC.TL_messageActionUserUpdatedPhoto)) {
                            TLRPC.PhotoSize w4 = ba4.w(k27Var.p0, gl.Y0(false), false, null, false);
                            if (w4 != null) {
                                if (jArr != null) {
                                    long j4 = w4.size;
                                    jArr[0] = j4;
                                    if (j4 == 0) {
                                        jArr[0] = -1;
                                    }
                                }
                                return gl5.f(w4, k27Var.n0);
                            }
                            if (jArr != null) {
                                jArr[0] = -1;
                                return null;
                            }
                        }
                    }
                } else if (i < arrayList2.size()) {
                    if (jArr != null) {
                        ArrayList arrayList4 = this.c7;
                        if (arrayList4.get(i) != null) {
                            jArr[0] = ((Long) arrayList4.get(i)).longValue();
                        }
                    }
                    return (gl5) this.b7.get(i);
                }
            } else if (i < arrayList.size()) {
                if (jArr != null) {
                    jArr[0] = ((uu9) arrayList.get(i)).b.size;
                }
                uu9 uu9Var = (uu9) arrayList.get(i);
                if (uu9Var == null) {
                    return null;
                }
                gl5 gl5Var = new gl5();
                gl5Var.h = uu9Var;
                return gl5Var;
            }
        }
        return null;
    }

    public final void q1() {
        lbc lbcVar = this.G2;
        if (lbcVar != null) {
            lbcVar.g0();
            return;
        }
        x88 x88Var = this.g0;
        if (x88Var != null) {
            x88Var.f();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0227  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q2() {
        float translationX;
        float translationY;
        float translationY2;
        AnimatorSet animatorSet;
        h68 h68Var;
        boolean z;
        mu1 mu1Var;
        if (this.G2 == null || !this.H3 || this.F3 || this.L3 || this.J3) {
            return;
        }
        if (m9 != null) {
            m9.M();
        }
        byte b = 0;
        this.m2 = false;
        m9 = l9;
        final s33 s33Var = null;
        l9 = null;
        this.L3 = true;
        this.e = false;
        this.f = false;
        gl.r(this.y2);
        p98 p98Var = this.d5;
        byte b2 = 4;
        if (p98Var != null) {
            ImageReceiver imageReceiver = p98Var.a;
            if (!imageReceiver.R0) {
                imageReceiver.v0(true, true);
                km m = this.d5.a.m();
                if (m != null) {
                    Bitmap m2 = m.m();
                    if (m2 != null) {
                        try {
                            if (this.E2) {
                                Bitmap createBitmap = Bitmap.createBitmap(m2);
                                gl.z0(this.D2, createBitmap, new h18(m, createBitmap, b2));
                            } else {
                                Bitmap bitmap = this.C2.getBitmap(m2.getWidth(), m2.getHeight());
                                new Canvas(m2).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                                bitmap.recycle();
                            }
                        } catch (Throwable th) {
                            fa4.g(th, true);
                        }
                    }
                    m.y(this.G2.S(), true, false);
                    ImageReceiver imageReceiver2 = this.d5.a;
                    imageReceiver2.u0 = true;
                    imageReceiver2.w0(false);
                }
            }
        }
        this.B3 = true;
        l29 u0 = u0(true);
        View view = this.E2 ? this.D2 : this.C2;
        float width = u0.c / view.getWidth();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        if (this.E2) {
            translationX = view.getTranslationX() + this.z2.getLeft();
            translationY = view.getTranslationY() + this.z2.getTop() + this.Y5;
            translationY2 = this.x3.getTranslationY() + this.z2.getTop() + this.Y5;
        } else {
            translationX = view.getTranslationX();
            translationY = this.Y5 + view.getTranslationY();
            translationY2 = this.Y5 + this.x3.getTranslationY();
        }
        final float f = translationX;
        final float f2 = translationY2;
        final float f3 = u0.a;
        final float x = (f3 - this.z2.getX()) + this.t2.left;
        final float f4 = u0.b;
        final float y = f4 - this.z2.getY();
        d88 d88Var = new d88(ofFloat, width, b);
        AnimatorSet animatorSet2 = new AnimatorSet();
        h68 h68Var2 = new h68(this, view, d88Var, f2, translationY, animatorSet2);
        final View view2 = view;
        final float f5 = translationY;
        if (this.D2 != null) {
            this.G2.d.V(false);
            if (this.E2) {
                int width2 = this.D2.getWidth();
                int height = this.D2.getHeight();
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                Bitmap a = dc1.a(width2, height);
                boolean[] zArr = new boolean[1];
                SurfaceView surfaceView = this.D2;
                animatorSet = animatorSet2;
                jw6 jw6Var = new jw6(this, a, zArr, h68Var2, (byte) 19);
                h68Var = h68Var2;
                gl.z0(surfaceView, a, jw6Var);
                gl.e3(new pc7((Object) this, (Object) zArr, (Object) h68Var, (byte) 20), 600L);
                z = true;
                h68 h68Var3 = h68Var;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: i68
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        Drawable[] drawableArr = PhotoViewer.f9;
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        s33 s33Var2 = s33Var;
                        float interpolation = s33Var2 == null ? floatValue : s33Var2.getInterpolation(floatValue);
                        PhotoViewer photoViewer = PhotoViewer.this;
                        ImageView imageView = photoViewer.x3;
                        float f6 = f;
                        if (imageView != null) {
                            imageView.setTranslationX((f3 * floatValue) + ((1.0f - floatValue) * f6));
                            photoViewer.x3.setTranslationY((f4 * interpolation) + ((1.0f - interpolation) * f2));
                            photoViewer.x3.invalidateOutline();
                        }
                        float f7 = (x * floatValue) + ((1.0f - floatValue) * f6);
                        View view3 = view2;
                        view3.setTranslationX(f7);
                        view3.setTranslationY((y * interpolation) + ((1.0f - interpolation) * f5));
                        view3.invalidateOutline();
                        j98 j98Var = photoViewer.F2;
                        if (j98Var != null) {
                            j98Var.setTranslationX(view3.getTranslationX());
                            photoViewer.F2.setTranslationY(view3.getTranslationY());
                            photoViewer.F2.setScaleX(view3.getScaleX());
                            photoViewer.F2.setScaleY(view3.getScaleY());
                            photoViewer.F2.invalidateOutline();
                        }
                    }
                });
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.addUpdateListener(new f68(this, (byte) 1));
                ImageView imageView = this.x3;
                Property property = View.SCALE_X;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, width);
                ImageView imageView2 = this.x3;
                Property property2 = View.SCALE_Y;
                Animator[] animatorArr = {ofFloat2, ofFloat3, ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property2, width), ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, width), ObjectAnimator.ofFloat(view2, (Property<View, Float>) property2, width), ObjectAnimator.ofInt(this.M0, rn.d, 0), ofFloat};
                AnimatorSet animatorSet3 = animatorSet;
                animatorSet3.playTogether(animatorArr);
                animatorSet3.setInterpolator(new DecelerateInterpolator());
                animatorSet3.setDuration(250L);
                animatorSet3.addListener(new c78(this, view2, (byte) 1));
                if (!z) {
                    h68Var3.run();
                }
                b98 b98Var = new b98();
                b98Var.c = false;
                b98Var.d = false;
                b98Var.a = (short) 250;
                b98Var.b = new DecelerateInterpolator();
                t2(false, true, b98Var);
                mu1Var = this.l4;
                if (mu1Var != null || mu1Var.getFragmentView() == null) {
                }
                this.l4.getFragmentView().invalidate();
                return;
            }
            animatorSet = animatorSet2;
            h68Var = h68Var2;
            this.x3.setVisibility(0);
            this.D2.setVisibility(4);
        } else {
            animatorSet = animatorSet2;
            h68Var = h68Var2;
        }
        z = false;
        h68 h68Var32 = h68Var;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: i68
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                Drawable[] drawableArr = PhotoViewer.f9;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s33 s33Var2 = s33Var;
                float interpolation = s33Var2 == null ? floatValue : s33Var2.getInterpolation(floatValue);
                PhotoViewer photoViewer = PhotoViewer.this;
                ImageView imageView3 = photoViewer.x3;
                float f6 = f;
                if (imageView3 != null) {
                    imageView3.setTranslationX((f3 * floatValue) + ((1.0f - floatValue) * f6));
                    photoViewer.x3.setTranslationY((f4 * interpolation) + ((1.0f - interpolation) * f2));
                    photoViewer.x3.invalidateOutline();
                }
                float f7 = (x * floatValue) + ((1.0f - floatValue) * f6);
                View view3 = view2;
                view3.setTranslationX(f7);
                view3.setTranslationY((y * interpolation) + ((1.0f - interpolation) * f5));
                view3.invalidateOutline();
                j98 j98Var = photoViewer.F2;
                if (j98Var != null) {
                    j98Var.setTranslationX(view3.getTranslationX());
                    photoViewer.F2.setTranslationY(view3.getTranslationY());
                    photoViewer.F2.setScaleX(view3.getScaleX());
                    photoViewer.F2.setScaleY(view3.getScaleY());
                    photoViewer.F2.invalidateOutline();
                }
            }
        });
        ValueAnimator ofFloat22 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat22.addUpdateListener(new f68(this, (byte) 1));
        ImageView imageView3 = this.x3;
        Property property3 = View.SCALE_X;
        ObjectAnimator ofFloat32 = ObjectAnimator.ofFloat(imageView3, (Property<ImageView, Float>) property3, width);
        ImageView imageView22 = this.x3;
        Property property22 = View.SCALE_Y;
        Animator[] animatorArr2 = {ofFloat22, ofFloat32, ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property22, width), ObjectAnimator.ofFloat(view2, (Property<View, Float>) property3, width), ObjectAnimator.ofFloat(view2, (Property<View, Float>) property22, width), ObjectAnimator.ofInt(this.M0, rn.d, 0), ofFloat};
        AnimatorSet animatorSet32 = animatorSet;
        animatorSet32.playTogether(animatorArr2);
        animatorSet32.setInterpolator(new DecelerateInterpolator());
        animatorSet32.setDuration(250L);
        animatorSet32.addListener(new c78(this, view2, (byte) 1));
        if (!z) {
        }
        b98 b98Var2 = new b98();
        b98Var2.c = false;
        b98Var2.d = false;
        b98Var2.a = (short) 250;
        b98Var2.b = new DecelerateInterpolator();
        t2(false, true, b98Var2);
        mu1Var = this.l4;
        if (mu1Var != null) {
        }
    }

    public final boolean r() {
        if (this.n4 != 0) {
            G0();
            if (Math.abs(this.o4 - System.currentTimeMillis()) >= 500) {
                Runnable runnable = this.p4;
                if (runnable != null) {
                    runnable.run();
                    this.p4 = null;
                }
                this.n4 = (byte) 0;
            }
        }
        return this.n4 != 0;
    }

    public final void r2() {
        AtomicInteger atomicInteger;
        fy6 e;
        fy6 e2;
        fy6 e3;
        if (U0()) {
            this.U8 = true;
            lbc lbcVar = this.G2;
            if (lbcVar != null) {
                lbcVar.s0(fo.w() || this.r);
            }
            if (this.G2 != null && fo.w() && ((atomicInteger = fo.b) == null || atomicInteger.get() <= 0)) {
                i69 e4 = fo.e();
                long a = e4 == null ? -1L : e4.a();
                if (a >= 0 && Math.abs(this.G2.S() - a) > 1000) {
                    this.G2.o0(a);
                }
                i69 e5 = fo.e();
                boolean m = e5 == null ? false : !fo.a ? !e5.l() : e5.m();
                lbc lbcVar2 = this.G2;
                if (m) {
                    lbcVar2.g0();
                } else {
                    lbcVar2.f0();
                }
                if (this.F != null) {
                    float g = fo.g();
                    i69 e6 = fo.e();
                    float f = 0.5f;
                    if (Math.abs(g - ((e6 == null || (e3 = e6.e()) == null) ? 0.5f : (float) e3.r)) > 0.05f) {
                        AudioManager audioManager = (AudioManager) this.F.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
                        int streamMinVolume = Build.VERSION.SDK_INT >= 28 ? audioManager.getStreamMinVolume(3) : 0;
                        float f2 = streamMaxVolume - streamMinVolume;
                        i69 e7 = fo.e();
                        if (e7 != null && (e2 = e7.e()) != null) {
                            f = (float) e2.r;
                        }
                        int i = streamMinVolume + ((int) (f * f2));
                        if (i != audioManager.getStreamVolume(3)) {
                            audioManager.setStreamVolume(3, i, 1);
                        }
                    }
                }
                i69 e8 = fo.e();
                float f3 = 1.0f;
                if (e8 != null && (e = e8.e()) != null) {
                    f3 = (float) e.d;
                }
                y(true, false, f3);
            }
            mg2 mg2Var = this.x0;
            if (mg2Var != null) {
                mg2Var.a(fo.w());
            }
            this.U8 = false;
        }
    }

    public final void s(boolean z) {
        if (z) {
            ya8 ya8Var = this.w3;
            if (ya8Var != null) {
                ya8Var.getViewTreeObserver().addOnPreDrawListener(new fb(this, (byte) 8));
                this.w3.invalidate();
                return;
            }
            return;
        }
        if (this.G3 == 2) {
            ImageView imageView = this.x3;
            if (imageView != null) {
                imageView.setVisibility(4);
                this.x3.setImageDrawable(null);
                Bitmap bitmap = this.C3;
                if (bitmap != null) {
                    bitmap.recycle();
                    this.C3 = null;
                }
            }
            byte b = 0;
            this.L3 = false;
            View view = this.E2 ? this.D2 : this.C2;
            m88 m88Var = this.z2;
            if (m88Var != null) {
                int[] iArr = this.A3;
                m88Var.getLocationInWindow(iArr);
                iArr[1] = (int) (iArr[1] - this.f0.getTranslationY());
                ImageView imageView2 = this.x3;
                Rect rect = this.t2;
                if (imageView2 != null) {
                    imageView2.setTranslationX(imageView2.getTranslationX() + rect.left);
                }
                if (view != null) {
                    view.setTranslationX((view.getTranslationX() + rect.left) - this.z2.getX());
                }
                j98 j98Var = this.F2;
                if (j98Var != null) {
                    j98Var.setTranslationX(view.getTranslationX());
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new f68(this, (byte) 5));
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
                arrayList.add(ObjectAnimator.ofInt(this.M0, rn.d, kk7.d4));
                j98 j98Var2 = this.F2;
                if (j98Var2 != null) {
                    arrayList.add(ObjectAnimator.ofFloat(j98Var2, (Property<j98, Float>) property, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(this.F2, (Property<j98, Float>) property2, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(this.F2, (Property<j98, Float>) property3, x));
                    arrayList.add(ObjectAnimator.ofFloat(this.F2, (Property<j98, Float>) property4, y));
                }
                u0(false);
                view.getWidth();
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.addUpdateListener(new pk(this, view, (byte) 18));
                arrayList.add(ofFloat2);
                animatorSet.playTogether(arrayList);
                DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator();
                animatorSet.setInterpolator(decelerateInterpolator);
                animatorSet.setDuration(250L);
                SurfaceView surfaceView = this.D2;
                if (surfaceView != null) {
                    surfaceView.setVisibility(0);
                }
                animatorSet.addListener(new c78(this, view, b));
                animatorSet.start();
                b98 b98Var = new b98();
                b98Var.c = false;
                b98Var.d = false;
                b98Var.a = (short) 250;
                b98Var.b = decelerateInterpolator;
                t2(true, true, b98Var);
                this.G3 = (byte) 0;
            }
        }
    }

    public final int s0() {
        return this.t2.left;
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
    public final void s1(ArrayList arrayList, Uri uri, boolean z, boolean z2, lm6 lm6Var, boolean z3, long j) {
        boolean z4;
        float f;
        Boolean bool;
        l98 l98Var;
        boolean z5;
        k27 k27Var;
        TLRPC.BotInlineResult botInlineResult;
        l98 l98Var2;
        k27 k27Var2;
        hbc hbcVar;
        boolean z6;
        if (!z2) {
            this.W4 = uri;
            this.V4 = arrayList;
        }
        if (this.E == null) {
            return;
        }
        boolean z7 = false;
        z7 = false;
        this.f3 = false;
        this.g3 = SystemClock.elapsedRealtime();
        this.h5 = false;
        this.S3 = 0L;
        byte b = 1;
        this.R3 = true;
        this.H8 = z2;
        v1(false);
        if (this.g7.isEmpty()) {
            J(null);
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
        u();
        if (this.W3 == null) {
            iu3 iu3Var = new iu3(b, org.telegram.messenger.a.b, this);
            this.W3 = iu3Var;
            boolean canDetectOrientation = iu3Var.canDetectOrientation();
            iu3 iu3Var2 = this.W3;
            if (canDetectOrientation) {
                iu3Var2.enable();
            } else {
                iu3Var2.disable();
                this.W3 = null;
            }
        }
        this.H3 = false;
        this.I3 = false;
        this.M3 = false;
        this.W2 = false;
        this.X2 = false;
        this.c8 = -1L;
        this.b8 = -1L;
        this.d8 = -1L;
        this.S = false;
        xa8 xa8Var = this.V8;
        if (xa8Var != null && xa8Var.c == 0) {
            this.V8 = null;
            xa8Var.f();
        }
        if (this.G2 == null) {
            lbc lbcVar = this.S2;
            if (lbcVar != null) {
                this.G2 = lbcVar;
                this.S2 = null;
                this.U2 = true;
                L2(this.G2.d.h(), lbcVar.d.s());
                z6 = false;
            } else {
                i88 i88Var = new i88(this, z7 ? (byte) 1 : (byte) 0);
                this.G2 = i88Var;
                i88Var.i0 = new l68(this, (byte) 27);
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
            j98 j98Var = this.F2;
            if (j98Var != null) {
                j98Var.c = false;
                j98Var.d = false;
                if (j98Var.b) {
                    j98Var.a++;
                    j98Var.b = false;
                }
                j98Var.setImageResource(android.R.color.transparent);
            }
            this.G2.K = new e31((Object) this, (byte) 9);
            z4 = z6;
        } else {
            z4 = false;
        }
        if (!this.g7.isEmpty()) {
            J(lm6Var);
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
        ju7 ju7Var = this.y4;
        if (ju7Var != null) {
            ju7Var.setAlpha(this.N3);
        }
        this.b3 = null;
        this.c3 = null;
        this.d3 = 0L;
        if (z4) {
            this.a3 = this.e3;
            this.q3.h(false, 0.0f);
            v78 v78Var = this.Y7;
            v78Var.setProgress(v78Var.getLeftProgress());
            this.q3.f(0.0f);
            k27 k27Var3 = this.T4;
            if (k27Var3 != null) {
                int L0 = (int) k27Var3.L0();
                String V0 = this.T4.V0();
                if (!TextUtils.isEmpty(V0)) {
                    if (L0 >= 10) {
                        r98 r98Var = (r98) h9.get(V0);
                        k27 k27Var4 = this.T4;
                        if (k27Var4.c0 < 0.0f && r98Var != null) {
                            float f3 = r98Var.a;
                            if (f3 > 0.0f && f3 < 0.999f) {
                                k27Var4.c0 = f3;
                                this.q3.h(false, f3);
                            }
                        }
                        this.c3 = V0;
                    }
                    if (L0 >= 300) {
                        if (this.T4.c0 < 0.0f) {
                            float f4 = org.telegram.messenger.a.b.getSharedPreferences("media_saved_pos", 0).getFloat(V0, -1.0f);
                            if (f4 > 0.0f && f4 < 0.999f) {
                                this.T4.c0 = f4;
                                this.q3.h(false, f4);
                            }
                        }
                        this.b3 = V0;
                    }
                }
            }
            lbc lbcVar2 = this.G2;
            if (arrayList != null) {
                k27 k27Var5 = this.T4;
                int i = lbc.k0;
                if (k27Var5 != null) {
                    long B0 = k27.B0(k27Var5.k);
                    int e1 = k27Var5.e1();
                    String string = org.telegram.messenger.a.b.getSharedPreferences("media_saved_pos", 0).getString(B0 + "_" + e1 + "q2", "");
                    if (!TextUtils.isEmpty(string)) {
                        int size = arrayList.size();
                        int i2 = 0;
                        while (i2 < size) {
                            Object obj = arrayList.get(i2);
                            i2++;
                            hbcVar = (hbc) obj;
                            StringBuilder sb = new StringBuilder();
                            f = f2;
                            sb.append(hbcVar.b);
                            sb.append("x");
                            sb.append(hbcVar.c);
                            sb.append(hbcVar.a ? "s" : "");
                            if (TextUtils.equals(string, sb.toString())) {
                                break;
                            } else {
                                f2 = f;
                            }
                        }
                    }
                }
                f = f2;
                hbcVar = null;
                lbcVar2.j0(arrayList, hbcVar);
            } else {
                f = 0.0f;
                lbcVar2.h0(j, uri, "other");
            }
            K2();
            y54 y54Var = this.G2.d;
            if (y54Var != null) {
                l88 l88Var = new l88(this);
                y54Var.y1();
                yc8 U0 = y54Var.U0(y54Var.x);
                gre.p(!U0.f);
                U0.c = (byte) 7;
                gre.p(!U0.f);
                U0.d = l88Var;
                U0.b();
            }
            M2();
            this.G2.t0(z);
            if (!this.t4) {
                W();
            }
        } else {
            f = 0.0f;
        }
        k27 k27Var6 = this.T4;
        int i3 = lbc.k0;
        if (k27Var6 != null) {
            SharedPreferences sharedPreferences = org.telegram.messenger.a.b.getSharedPreferences("media_saved_pos", 0);
            String str = k27.B0(k27Var6.k) + "_" + k27Var6.e1() + "loop";
            if (sharedPreferences.contains(str)) {
                bool = Boolean.valueOf(sharedPreferences.getBoolean(str, false));
                if (!z3) {
                    this.Z2 = false;
                    z5 = false;
                } else if (bool != null) {
                    z5 = bool.booleanValue();
                    this.Z2 = z5;
                } else {
                    k27 k27Var7 = this.T4;
                    z5 = (k27Var7 != null && k27Var7.L0() <= 30.0d) || ((l98Var = this.j7) != null && l98Var.e(this.P4));
                    this.Z2 = z5;
                }
                this.i3.c(z5);
                this.G2.r0(this.Z2);
                this.t0.f(this.Z2);
                this.t0.setSelectorColor(!this.Z2 ? 259241196 : 268435455);
                k27Var = this.T4;
                if (k27Var != null) {
                    float f5 = k27Var.c0;
                    if (f5 >= f) {
                        this.a3 = f5;
                        k27Var.c0 = -1.0f;
                    }
                }
                botInlineResult = this.Y4;
                if (botInlineResult == null && (botInlineResult.type.equals(MediaStreamTrack.VIDEO_TRACK_KIND) || k27.J4(this.Y4.document))) {
                    this.j0.setVisibility(0);
                    this.j0.setPadding(0, 0, gl.L(84.0f), 0);
                    this.Q0.setVisibility(8);
                } else {
                    this.j0.setPadding(0, 0, 0, 0);
                }
                if (this.j7 != null) {
                    this.j0.setVisibility(0);
                }
                l98Var2 = this.j7;
                if (l98Var2 == null && l98Var2.e(this.P4) && !this.j7.a(this.P4)) {
                    X1(false, true);
                } else {
                    if (!this.s1 && !z3) {
                        z7 = true;
                    }
                    X1(z7, true);
                }
                if (!this.s1) {
                    int i4 = this.Y2 ? 3000 : 1000;
                    x78 x78Var = this.y2;
                    if (!I0() && ((k27Var2 = this.T4) == null || !k27Var2.q4())) {
                        gl.r(x78Var);
                        gl.e3(x78Var, i4);
                    }
                }
                if (this.T4 != null) {
                    this.G2.u0(this.u1);
                }
                this.H8 = z2;
            }
        }
        bool = null;
        if (!z3) {
        }
        this.i3.c(z5);
        this.G2.r0(this.Z2);
        this.t0.f(this.Z2);
        this.t0.setSelectorColor(!this.Z2 ? 259241196 : 268435455);
        k27Var = this.T4;
        if (k27Var != null) {
        }
        botInlineResult = this.Y4;
        if (botInlineResult == null) {
        }
        this.j0.setPadding(0, 0, 0, 0);
        if (this.j7 != null) {
        }
        l98Var2 = this.j7;
        if (l98Var2 == null) {
        }
        if (!this.s1) {
            z7 = true;
        }
        X1(z7, true);
        if (!this.s1) {
        }
        if (this.T4 != null) {
        }
        this.H8 = z2;
    }

    public final void s2(boolean z, boolean z2) {
        t2(z, z2, b98.e);
    }

    public void setAnimationValue(float f) {
        this.l6 = f;
        this.f0.invalidate();
        G0();
    }

    public final void t() {
        p98 p98Var = this.d5;
        if (p98Var != null) {
            p98Var.a.v0(true, true);
        }
        o98 o98Var = this.d;
        p98 p98Var2 = null;
        if (o98Var != null) {
            k27 k27Var = this.T4;
            gl5 gl5Var = this.Z4;
            p98Var2 = o98Var.M(k27Var, gl5Var != null ? gl5Var.f : null, this.P4, false, false);
        }
        this.d5 = p98Var2;
        if (p98Var2 == null || p98Var2.s) {
            return;
        }
        p98Var2.a.v0(false, true);
    }

    public final TLRPC.Document t0() {
        int i;
        if (this.X5 != 0.0f || this.Y5 != 0.0f || (i = this.P4) < 0) {
            return null;
        }
        ArrayList arrayList = this.g7;
        if (i >= arrayList.size()) {
            return null;
        }
        Object obj = arrayList.get(this.P4);
        if (!(obj instanceof bm6)) {
            return null;
        }
        bm6 bm6Var = (bm6) obj;
        if (bm6Var.v || bm6Var.w || bm6Var.u) {
            return null;
        }
        return this.A7;
    }

    public final void t1() {
        mza mzaVar = this.p5;
        if (mzaVar == null || this.d2 != 11) {
            return;
        }
        if (this.B7) {
            mzaVar.b();
        } else {
            mzaVar.l(this.C4.n(), this.C4.V, i0(this.u4), g0(), new q68(this, (byte) 0));
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
    public final void t2(boolean z, boolean z2, b98 b98Var) {
        float f;
        int i;
        m98 m98Var;
        r88 r88Var;
        float f2;
        boolean z3;
        int i2;
        a6 a6Var;
        m98 m98Var2;
        View view;
        boolean z4;
        Property property;
        boolean z5;
        r88 r88Var2;
        boolean z6;
        if (this.u4 == 0) {
            int i3 = this.o6;
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
                        h88 h88Var = this.s3;
                        if (h88Var != null) {
                            h88Var.requestLayout();
                        }
                    }
                }
                this.K = z;
                x88 x88Var = this.g0;
                if (x88Var != null) {
                    x88Var.setTouchDisabled(z);
                }
                if (b98Var.c) {
                    G2(z);
                }
                if (this.l3 && this.P3 && z) {
                    z1();
                } else {
                    gl.r(this.y2);
                }
                if (!z) {
                    m21.d(this.f0);
                }
                float N = gl.N(24.0f);
                this.i3.c(b98Var.d && this.Z2);
                u98 u98Var = this.i3;
                boolean z7 = b98Var.d;
                if (u98Var.c != z7) {
                    u98Var.c = z7;
                    if (!z7) {
                        u98Var.setTranslationY(0.0f);
                    }
                    u98Var.a(u98Var.a);
                }
                u78[] u78VarArr = this.X0;
                ImageView[] imageViewArr = this.y3;
                if (!z2) {
                    x10 x10Var = this.G;
                    if (z) {
                        mb1 d0 = d0();
                        z78 z78Var = this.W1;
                        if (d0 != z78Var || z78Var.M.c()) {
                            f = 1.0f;
                            x10Var.setAlpha(f);
                            if (imageViewArr[0].getTranslationX() != 0.0f && this.z3) {
                                imageViewArr[0].setAlpha(!z ? 1.0f : 0.0f);
                            }
                            for (i = 0; i < 3; i++) {
                                imageViewArr[i].setTranslationY(z ? 0.0f : N);
                            }
                            this.G.setTranslationY(!z ? 0.0f : -N);
                            m98Var = this.O;
                            if (m98Var != null) {
                                m98Var.setAlpha(z ? 1.0f : 0.0f);
                                this.O.setTranslationY(z ? 0.0f : -N);
                            }
                            this.j0.setAlpha(!z ? 1.0f : 0.0f);
                            this.j0.setTranslationY(!z ? 0.0f : N);
                            this.k0.setAlpha(!z ? 1.0f : 0.0f);
                            this.m1.setAlpha((z || this.H7 == 3) ? 0.0f : 1.0f);
                            this.m1.setTranslationY((z || this.H7 == 3) ? N : 0.0f);
                            if (!this.j2 && (r88Var = this.U1) != null) {
                                r88Var.setAlpha(!z ? 1.0f : 0.0f);
                                r88 r88Var3 = this.U1;
                                if (z) {
                                    N = 0.0f;
                                }
                                r88Var3.setTranslationY(N);
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
                            u78VarArr[0].e(1, z ? 1.0f : 0.0f, false);
                            return;
                        }
                    }
                    f = 0.0f;
                    x10Var.setAlpha(f);
                    if (imageViewArr[0].getTranslationX() != 0.0f) {
                        imageViewArr[0].setAlpha(!z ? 1.0f : 0.0f);
                    }
                    while (i < 3) {
                    }
                    this.G.setTranslationY(!z ? 0.0f : -N);
                    m98Var = this.O;
                    if (m98Var != null) {
                    }
                    this.j0.setAlpha(!z ? 1.0f : 0.0f);
                    this.j0.setTranslationY(!z ? 0.0f : N);
                    this.k0.setAlpha(!z ? 1.0f : 0.0f);
                    this.m1.setAlpha((z || this.H7 == 3) ? 0.0f : 1.0f);
                    this.m1.setTranslationY((z || this.H7 == 3) ? N : 0.0f);
                    if (!this.j2) {
                        r88Var.setAlpha(!z ? 1.0f : 0.0f);
                        r88 r88Var32 = this.U1;
                        if (z) {
                        }
                        r88Var32.setTranslationY(N);
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
                x10 x10Var2 = this.G;
                Property property2 = View.ALPHA;
                if (z) {
                    mb1 d02 = d0();
                    z78 z78Var2 = this.W1;
                    if (d02 != z78Var2 || z78Var2.M.c()) {
                        f2 = 1.0f;
                        arrayList.add(ObjectAnimator.ofFloat(x10Var2, (Property<x10, Float>) property2, f2));
                        z3 = b98Var.d;
                        x10 x10Var3 = this.G;
                        if (z3) {
                            x10Var3.setTranslationY(0.0f);
                        } else {
                            arrayList.add(ObjectAnimator.ofFloat(x10Var3, (Property<x10, Float>) View.TRANSLATION_Y, z ? 0.0f : -N));
                        }
                        if (this.z3) {
                            arrayList.add(ObjectAnimator.ofFloat(imageViewArr[0], (Property<ImageView, Float>) property2, z ? 1.0f : 0.0f));
                        }
                        for (i2 = 1; i2 < 3; i2++) {
                            imageViewArr[i2].setTranslationY(z ? 0.0f : N);
                        }
                        if (b98Var.d) {
                            imageViewArr[0].setTranslationY(0.0f);
                        } else {
                            arrayList.add(ObjectAnimator.ofFloat(imageViewArr[0], (Property<ImageView, Float>) View.TRANSLATION_Y, z ? 0.0f : N));
                        }
                        a6Var = this.j0;
                        if (a6Var != null) {
                            arrayList.add(ObjectAnimator.ofFloat(a6Var, (Property<a6, Float>) View.ALPHA, z ? 1.0f : 0.0f));
                            boolean z8 = b98Var.d;
                            a6 a6Var2 = this.j0;
                            if (z8) {
                                arrayList.add(ObjectAnimator.ofFloat(a6Var2, (Property<a6, Float>) View.TRANSLATION_Y, z ? 0.0f : N));
                            } else {
                                a6Var2.setTranslationY(0.0f);
                            }
                        }
                        m98Var2 = this.O;
                        if (m98Var2 != null) {
                            arrayList.add(ObjectAnimator.ofFloat(m98Var2, (Property<m98, Float>) View.ALPHA, z ? 1.0f : 0.0f));
                            boolean z9 = b98Var.d;
                            m98 m98Var3 = this.O;
                            if (z9) {
                                arrayList.add(ObjectAnimator.ofFloat(m98Var3, (Property<m98, Float>) View.TRANSLATION_Y, z ? 0.0f : -N));
                            } else {
                                m98Var3.setTranslationY(0.0f);
                            }
                        }
                        view = this.k0;
                        if (view != null) {
                            arrayList.add(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, z ? 1.0f : 0.0f));
                        }
                        z4 = this.l3;
                        u98 u98Var2 = this.i3;
                        if (z4) {
                            u98Var2.b(z ? 1.0f : 0.0f);
                        } else {
                            arrayList.add(ObjectAnimator.ofFloat(u98Var2, (Property<u98, Float>) k9, z ? 1.0f : 0.0f));
                        }
                        vb5 vb5Var = this.m1;
                        property = View.ALPHA;
                        arrayList.add(ObjectAnimator.ofFloat(vb5Var, (Property<vb5, Float>) property, !z ? 1.0f : 0.0f));
                        byte b = 2;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat.addUpdateListener(new b78());
                        arrayList.add(ofFloat);
                        z5 = b98Var.d;
                        vb5 vb5Var2 = this.m1;
                        if (z5) {
                            vb5Var2.setTranslationY(0.0f);
                        } else {
                            arrayList.add(ObjectAnimator.ofFloat(vb5Var2, (Property<vb5, Float>) View.TRANSLATION_Y, z ? 0.0f : N));
                        }
                        if (!this.j2 && (r88Var2 = this.U1) != null) {
                            arrayList.add(ObjectAnimator.ofFloat(r88Var2, (Property<r88, Float>) property, !z ? 1.0f : 0.0f));
                            z6 = b98Var.d;
                            r88 r88Var4 = this.U1;
                            if (z6) {
                                r88Var4.setTranslationY(0.0f);
                            } else {
                                Property property3 = View.TRANSLATION_Y;
                                if (z) {
                                    N = 0.0f;
                                }
                                arrayList.add(ObjectAnimator.ofFloat(r88Var4, (Property<r88, Float>) property3, N));
                            }
                        }
                        if (this.l3 && this.P3) {
                            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(u78VarArr[0].m[1], !z ? 1.0f : 0.0f);
                            ofFloat2.addUpdateListener(new f68(this, (byte) 14));
                            arrayList.add(ofFloat2);
                        }
                        if (this.f1.getTag() != null) {
                            arrayList.add(ObjectAnimator.ofFloat(this.f1, (Property<c7, Float>) property, z ? 1.0f : 0.0f));
                        }
                        if (this.g1.getTag() != null) {
                            arrayList.add(ObjectAnimator.ofFloat(this.g1, (Property<o76, Float>) property, z ? 1.0f : 0.0f));
                        }
                        if (this.h1.getTag() != null) {
                            arrayList.add(ObjectAnimator.ofFloat(this.h1, (Property<w78, Float>) property, z ? 1.0f : 0.0f));
                        }
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        this.M = animatorSet2;
                        animatorSet2.playTogether(arrayList);
                        this.M.setDuration(b98Var.a);
                        this.M.setInterpolator(b98Var.b);
                        this.M.addListener(new n88(this, z, b));
                        this.M.start();
                    }
                }
                f2 = 0.0f;
                arrayList.add(ObjectAnimator.ofFloat(x10Var2, (Property<x10, Float>) property2, f2));
                z3 = b98Var.d;
                x10 x10Var32 = this.G;
                if (z3) {
                }
                if (this.z3) {
                }
                while (i2 < 3) {
                }
                if (b98Var.d) {
                }
                a6Var = this.j0;
                if (a6Var != null) {
                }
                m98Var2 = this.O;
                if (m98Var2 != null) {
                }
                view = this.k0;
                if (view != null) {
                }
                z4 = this.l3;
                u98 u98Var22 = this.i3;
                if (z4) {
                }
                vb5 vb5Var3 = this.m1;
                property = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(vb5Var3, (Property<vb5, Float>) property, !z ? 1.0f : 0.0f));
                byte b2 = 2;
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat3.addUpdateListener(new b78());
                arrayList.add(ofFloat3);
                z5 = b98Var.d;
                vb5 vb5Var22 = this.m1;
                if (z5) {
                }
                if (!this.j2) {
                    arrayList.add(ObjectAnimator.ofFloat(r88Var2, (Property<r88, Float>) property, !z ? 1.0f : 0.0f));
                    z6 = b98Var.d;
                    r88 r88Var42 = this.U1;
                    if (z6) {
                    }
                }
                if (this.l3) {
                    ValueAnimator ofFloat22 = ValueAnimator.ofFloat(u78VarArr[0].m[1], !z ? 1.0f : 0.0f);
                    ofFloat22.addUpdateListener(new f68(this, (byte) 14));
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
                this.M.setDuration(b98Var.a);
                this.M.setInterpolator(b98Var.b);
                this.M.addListener(new n88(this, z, b2));
                this.M.start();
            }
        }
    }

    public final void u() {
        k27 k27Var;
        TextureView textureView;
        TextureView textureView2;
        k27 k27Var2;
        ArrayList arrayList = this.Y6;
        boolean isEmpty = arrayList.isEmpty();
        ImageView[] imageViewArr = this.y3;
        if (isEmpty || ((k27Var = this.T4) != null && k27Var.q4())) {
            for (int i = 0; i < 3; i++) {
                imageViewArr[i].setVisibility(4);
            }
            return;
        }
        int i2 = 0;
        while (i2 < 3) {
            int i3 = this.P4;
            if (i2 == 1) {
                i3++;
            } else if (i2 == 2) {
                i3--;
            }
            if (i3 < 0 || i3 >= arrayList.size()) {
                imageViewArr[i2].setVisibility(4);
            } else {
                k27 k27Var3 = (k27) arrayList.get(i3);
                if (k27.K4(k27Var3.k) || k27Var3.d5()) {
                    boolean z = k27Var3.d5() && (k27Var2 = this.T4) != null && k27Var2.e1() == k27Var3.e1();
                    int measuredWidth = z ? k27Var3.k.media.webpage.embed_width : (i2 != 0 || (textureView = this.C2) == null) ? 0 : textureView.getMeasuredWidth();
                    int measuredHeight = z ? k27Var3.k.media.webpage.embed_height : (i2 != 0 || (textureView2 = this.C2) == null) ? 0 : textureView2.getMeasuredHeight();
                    TLRPC.Document F0 = k27Var3.F0();
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
                    Point point = gl.q;
                    if (point.y > point.x && measuredWidth > measuredHeight) {
                        if (imageViewArr[i2].getVisibility() != 0) {
                            imageViewArr[i2].setVisibility(0);
                        }
                        if (this.K) {
                            imageViewArr[i2].setAlpha(1.0f);
                        }
                        ((FrameLayout.LayoutParams) imageViewArr[i2].getLayoutParams()).topMargin = ((this.f0.getMeasuredHeight() + ((int) (measuredHeight / (measuredWidth / this.f0.getMeasuredWidth())))) / 2) - gl.L(48.0f);
                    } else if (imageViewArr[i2].getVisibility() != 4) {
                        imageViewArr[i2].setVisibility(4);
                    }
                    AnimatorSet animatorSet = this.p6;
                    float f = this.X5;
                    if (animatorSet != null) {
                        f += (this.c6 - f) * this.l6;
                    }
                    float f2 = 0.0f;
                    if (i2 != 1) {
                        if (i2 == 2) {
                            f2 = (f - this.F6) + ((-point.x) - gl.L(15.0f));
                        } else {
                            float f3 = this.E6;
                            if (f < f3) {
                                f2 = f - f3;
                            }
                        }
                    }
                    imageViewArr[i2].setTranslationX((f2 + point.x) - gl.L(48.0f));
                } else {
                    imageViewArr[i2].setVisibility(4);
                }
            }
            i2++;
        }
    }

    public final l29 u0(boolean z) {
        xa8 xa8Var;
        sj4 sj4Var;
        RectF rectF = new RectF();
        if (z || (xa8Var = this.V8) == null || (sj4Var = xa8Var.e) == null) {
            q78 q78Var = this.d9;
            sj4.j(rectF, q78Var.Q0(), q78Var.S1());
        } else {
            sj4Var.g(rectF);
        }
        l29 l29Var = new l29();
        l29Var.a = rectF.left;
        l29Var.b = rectF.top;
        l29Var.c = rectF.width();
        l29Var.d = rectF.height();
        return l29Var;
    }

    public final void u1(String str, long j, boolean z, float f, float f2, int i, long j2) {
        int parseInt;
        if (this.D8 != null) {
            Utilities.e.a(this.D8);
            this.D8 = null;
        }
        v78 v78Var = this.Y7;
        v78Var.a();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        v78Var.E = mediaMetadataRetriever;
        boolean z2 = true;
        v78Var.x = j > 0;
        v78Var.d = f;
        v78Var.e = f2;
        float f3 = v78Var.s;
        if (f3 < f) {
            v78Var.s = f;
        } else if (f3 > f2) {
            v78Var.s = f2;
        }
        try {
            if (j > 0) {
                File file = new File(str);
                ParcelFileDescriptor open = ParcelFileDescriptor.open(file, TLObject.FLAG_28);
                v78Var.y = open;
                v78Var.E.setDataSource(open.getFileDescriptor(), j, file.length() - j);
            } else {
                mediaMetadataRetriever.setDataSource(str);
            }
            String extractMetadata = v78Var.E.extractMetadata(9);
            if (extractMetadata != null) {
                v78Var.a = Long.parseLong(extractMetadata);
            }
            String extractMetadata2 = v78Var.E.extractMetadata(18);
            if (extractMetadata2 != null) {
                v78Var.b = Integer.parseInt(extractMetadata2);
            }
            String extractMetadata3 = v78Var.E.extractMetadata(19);
            if (extractMetadata3 != null) {
                v78Var.c = Integer.parseInt(extractMetadata3);
            }
            String extractMetadata4 = v78Var.E.extractMetadata(24);
            if (extractMetadata4 != null && ((parseInt = Integer.parseInt(extractMetadata4)) == 90 || parseInt == 270)) {
                int i2 = v78Var.b;
                v78Var.b = v78Var.c;
                v78Var.c = i2;
            }
            if (v78Var.x) {
                v78Var.f = (float) ((j2 / 1000.0d) / v78Var.a);
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
        v78Var.invalidate();
        this.E8 = null;
        if (!z && this.d2 != 1) {
            z2 = false;
        }
        this.r = z2;
        this.f8 = -1;
        this.h8 = 0;
        this.p8 = 25;
        this.A8 = new File(str).length();
        co3 co3Var = Utilities.e;
        y88 y88Var = new y88(this, str, j, i);
        this.D8 = y88Var;
        co3Var.c(y88Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u2() {
        int i;
        int i2;
        float f;
        boolean z;
        o98 o98Var = this.d;
        if (o98Var == null || !o98Var.l()) {
            return;
        }
        c();
        mb1 d0 = d0();
        this.d.E(!r1.z());
        e2(true, true);
        mb1 d02 = d0();
        boolean z2 = this.d.z();
        if (d0 != d02) {
            cb1 cb1Var = d0.f;
            cb1Var.k(true);
            d02.setText(gm.cloneSpans(d0.getText()));
            cb1 cb1Var2 = d02.f;
            cb1Var2.getEditText().setAllowTextEntitiesIntersection(cb1Var.getEditText().getAllowTextEntitiesIntersection());
            if (cb1Var.getEditText().isFocused()) {
                cb1Var2.getEditText().requestFocus();
                cb1Var2.getEditText().setSelection(cb1Var.getEditText().getSelectionStart(), cb1Var.getEditText().getSelectionEnd());
            }
            eb1 eb1Var = d0.N;
            if (eb1Var != null) {
                gl.B2(eb1Var);
                d0.N = null;
            }
            ViewPropertyAnimator animate = this.G.animate();
            if (this.K) {
                mb1 d03 = d0();
                z78 z78Var = this.W1;
                if (d03 != z78Var || !z78Var.M.c()) {
                    f = 1.0f;
                    animate.alpha(f).start();
                    if (this.Q0.getVisibility() == 0) {
                        if (this.K) {
                            mb1 d04 = d0();
                            z78 z78Var2 = this.W1;
                            if (d04 != z78Var2 || !z78Var2.M.c()) {
                                z = true;
                                y2(z);
                            }
                        }
                        z = false;
                        y2(z);
                    }
                }
            }
            f = 0.0f;
            animate.alpha(f).start();
            if (this.Q0.getVisibility() == 0) {
            }
        }
        if (na7.q1(this.U).X3.getInt("movecaptionhint", 0) >= 24) {
            boolean z3 = w01.a;
        } else {
            SharedPreferences sharedPreferences = na7.q1(this.U).X3;
            sharedPreferences.edit().putInt("movecaptionhint", sharedPreferences.getInt("movecaptionhint", 0) + 1).apply();
            u21 u21Var = new u21(z2 ? this.S0 : this.R0, new f53());
            if (z2) {
                i = R.raw.caption_up;
                i2 = 2131748129;
            } else {
                i = R.raw.caption_down;
                i2 = 2131748131;
            }
            m21 I = u21Var.I(i, k96.M0(i2, null), k96.M0(z2 ? 2131748128 : 2131748130, null));
            q11 q11Var = I.e;
            if (q11Var instanceof j21) {
                ry8 ry8Var = ((j21) q11Var).a;
                ry8Var.setScaleX(0.8f);
                ry8Var.setScaleY(0.8f);
            }
            I.k(!z2);
        }
        y78 y78Var = this.V1;
        if (y78Var != null) {
            cb1 cb1Var3 = y78Var.f;
            cb1Var3.d();
            cb1Var3.k(true);
        }
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
    public final void v(boolean z) {
        float f = this.X5;
        float f2 = this.Y5;
        H2(this.a6);
        float f3 = this.X5;
        float f4 = this.E6;
        if (f3 >= f4) {
            f4 = this.F6;
        }
        f = f4;
        float f5 = this.Y5;
        float f6 = this.G6;
        if (f5 >= f6) {
            f6 = this.H6;
        }
        f2 = f6;
        b(this.a6, f, f2, z);
    }

    public final RenderNode v0(ColorMatrix colorMatrix) {
        RenderNode renderNode;
        if (this.Q8 == null) {
            renderNode = null;
        } else {
            renderNode = this.R8;
            if (renderNode == null) {
                mk1.p();
                renderNode = new RenderNode("pv_s_blur_false");
                float a = cq3.a(gl.L(40.0f), 6.0f);
                renderNode.setRenderEffect(RenderEffect.createBlurEffect(a, a, Shader.TileMode.CLAMP));
                this.R8 = renderNode;
            }
            int ceil = (int) Math.ceil(this.Q8.getWidth() / 6.0f);
            int ceil2 = (int) Math.ceil(this.Q8.getHeight() / 6.0f);
            if ((!renderNode.hasDisplayList()) | renderNode.setPosition(0, 0, ceil, ceil2)) {
                RecordingCanvas beginRecording = renderNode.beginRecording();
                beginRecording.save();
                beginRecording.scale(ceil / this.Q8.getWidth(), ceil2 / this.Q8.getHeight());
                beginRecording.drawRenderNode(this.Q8);
                beginRecording.restore();
                renderNode.endRecording();
            }
        }
        if (renderNode == null) {
            return null;
        }
        tab tabVar = this.S8;
        tabVar.a = 0L;
        tabVar.b = false;
        for (float f : colorMatrix.getArray()) {
            tabVar.c(f);
        }
        tabVar.a(0L);
        long j = tabVar.b ? -1L : tabVar.a;
        RenderNode renderNode2 = (RenderNode) this.T8.f(j);
        if (renderNode2 == null) {
            mk1.p();
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

    /* JADX WARN: Multi-variable type inference failed */
    public final void v1(boolean z) {
        this.m7 = null;
        gl.r(this.o7);
        mbc mbcVar = this.l7;
        if (mbcVar != null) {
            mbcVar.a(this.U, null);
        }
        int i = 0;
        Object[] objArr = 0;
        this.E2 = false;
        xa8 xa8Var = this.V8;
        if (xa8Var != null && xa8Var.c == 0) {
            this.V8 = null;
            xa8Var.f();
        }
        lbc lbcVar = this.G2;
        HashMap hashMap = h9;
        x78 x78Var = this.y2;
        if (lbcVar != null) {
            n();
            gl.r(this.x2);
            gl.r(x78Var);
            if (this.c3 != null) {
                float S = this.G2.S() / this.G2.U();
                String str = this.c3;
                SystemClock.elapsedRealtime();
                hashMap.put(str, new r98(S));
                k27 k27Var = this.T4;
                if (k27Var != null) {
                    k27Var.l3 = Float.valueOf(S);
                }
            }
            this.G2.l0();
            this.G2 = null;
        } else {
            this.X2 = false;
        }
        if (this.g0 != null) {
            gl.r(x78Var);
            if (this.c3 != null) {
                float m0 = m0() / z0();
                String str2 = this.c3;
                SystemClock.elapsedRealtime();
                hashMap.put(str2, new r98(m0));
                k27 k27Var2 = this.T4;
                if (k27Var2 != null) {
                    k27Var2.l3 = Float.valueOf(m0);
                }
            }
        }
        iu3 iu3Var = this.W3;
        if (iu3Var != null) {
            iu3Var.disable();
            this.W3 = null;
        }
        this.s3.a();
        w2(false, false);
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
                fa4.g(e, true);
            }
        }
        m88 m88Var = this.z2;
        if (m88Var != null) {
            try {
                this.f0.removeView(m88Var);
            } catch (Throwable unused) {
            }
            this.z2 = null;
        }
        l();
        this.A2 = null;
        TextureView textureView = this.C2;
        if (textureView != null) {
            if (textureView instanceof kac) {
                kac kacVar = (kac) textureView;
                td4 td4Var = kacVar.b;
                if (td4Var != null) {
                    td4Var.postRunnable(new rd4(td4Var, objArr == true ? 1 : 0));
                }
                kacVar.a = null;
            }
            this.C2 = null;
        }
        this.c0.e();
        if (this.D2 != null) {
            this.D2 = null;
        }
        if (this.P3) {
            this.P3 = false;
            gl.r(this.h4);
        }
        if (!z && !this.H8 && !this.I8) {
            X1(false, true);
        }
        u78 u78Var = this.X0[0];
        while (true) {
            float[] fArr = u78Var.n;
            if (i >= fArr.length) {
                u78Var.a();
                return;
            } else {
                u78Var.m[i] = 1.0f;
                fArr[i] = 1.0f;
                i++;
            }
        }
    }

    public final void v2(boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        float N = gl.N(24.0f);
        jo0 jo0Var = this.Q0;
        Property property = View.ALPHA;
        arrayList.add(ObjectAnimator.ofFloat(jo0Var, (Property<jo0, Float>) property, z ? 1.0f : 0.0f));
        jo0 jo0Var2 = this.Q0;
        Property property2 = View.TRANSLATION_Y;
        arrayList.add(ObjectAnimator.ofFloat(jo0Var2, (Property<jo0, Float>) property2, z ? 0.0f : N));
        mza mzaVar = this.p5;
        if (mzaVar != null) {
            arrayList.add(ObjectAnimator.ofFloat(mzaVar, (Property<mza, Float>) property, z ? 1.0f : 0.0f));
        }
        if (this.p5 != null) {
            arrayList.add(ObjectAnimator.ofFloat(this.s5, (Property<rj4, Float>) property, z ? 1.0f : 0.0f));
        }
        arrayList.add(ObjectAnimator.ofFloat(this.T0, (Property<jh3, Float>) property, z ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.T0, (Property<jh3, Float>) property2, z ? 0.0f : N));
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
        if (z || !J0()) {
            return;
        }
        z(true);
        cb1 cb1Var = this.V1.f;
        if (cb1Var.e) {
            cb1Var.k(true);
        }
        cb1 cb1Var2 = this.W1.f;
        if (cb1Var2.e) {
            cb1Var2.k(true);
        }
        this.V1.f.d();
        this.W1.f.d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v40, types: [k27] */
    /* JADX WARN: Type inference failed for: r7v6, types: [k27] */
    public final void w(final int i, final boolean z) {
        boolean z2;
        final boolean z3;
        final boolean z4;
        dx6 dx6Var;
        final File file;
        final dx6 dx6Var2;
        File file2;
        File J;
        File J2;
        boolean z5;
        km kmVar;
        int i2 = this.P4;
        int i3 = i == 1 ? i2 + 1 : i == 2 ? i2 - 1 : i2;
        if (this.c5[i] == null) {
            if (!this.g7.isEmpty() && i3 >= 0 && i3 < this.g7.size()) {
                Object obj = this.g7.get(i3);
                if (obj instanceof jm6) {
                    jm6 jm6Var = (jm6) obj;
                    if (jm6Var.b && (!jm6Var.d() || (!jm6Var.j() && this.d2 != 11))) {
                        this.X0[i].d(3, z, true);
                        return;
                    }
                }
            }
            this.X0[i].d(-1, z, true);
            return;
        }
        boolean s = (i == 0 && i2 == 0 && (kmVar = this.k2) != null) ? kmVar.s() : false;
        File file3 = null;
        if (this.T4 == null) {
            if (this.Y4 == null) {
                if (this.Z4 != null) {
                    if (i3 < 0 || i3 >= this.b7.size()) {
                        this.X0[i].d(-1, z, true);
                        return;
                    }
                    gl5 gl5Var = (gl5) this.b7.get(i3);
                    if (gl5Var != null) {
                        ba4.G(this.U);
                        J = ba4.J(gl5Var.f, o0(gl5Var), false, true);
                        ba4.G(this.U);
                        J2 = ba4.J(gl5Var.f, o0(gl5Var), true, true);
                    } else {
                        J2 = null;
                        J = null;
                    }
                } else if (this.b5 != null) {
                    if (i3 < 0 || i3 >= this.e7.size()) {
                        this.X0[i].d(-1, z, true);
                        return;
                    }
                    uu9 uu9Var = (uu9) this.e7.get(i3);
                    ba4.G(this.U);
                    J = ba4.J(uu9Var, null, true, true);
                    ba4.G(this.U);
                    J2 = ba4.J(uu9Var, null, false, true);
                } else if (this.e5 != null) {
                    file2 = new File(ba4.z(3), this.c5[i]);
                    file = new File(ba4.z(4), this.c5[i]);
                    z2 = false;
                    z3 = false;
                    z4 = false;
                } else {
                    l98 l98Var = this.j7;
                    if (l98Var != null) {
                        File b = l98Var.b(i3);
                        boolean z6 = this.j7.a(i3) || this.j7.e(i3);
                        z4 = z6;
                        z3 = z6 && gba.x0 && (this.j7.d(i3) instanceof TLRPC.Document);
                        dx6Var2 = null;
                        z2 = Y1(i3);
                        file3 = b;
                        dx6Var = null;
                        file = null;
                    } else {
                        z2 = false;
                        z3 = false;
                        z4 = false;
                        dx6Var = null;
                        file = null;
                        dx6Var2 = null;
                    }
                }
                z2 = false;
                z3 = false;
                z4 = false;
                dx6Var2 = null;
                file3 = J;
                file = J2;
                dx6Var = dx6Var2;
            } else {
                if (i3 < 0 || i3 >= this.g7.size()) {
                    this.X0[i].d(-1, z, true);
                    return;
                }
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) this.g7.get(i3);
                if (botInlineResult.type.equals(MediaStreamTrack.VIDEO_TRACK_KIND) || k27.J4(botInlineResult.document)) {
                    if (botInlineResult.document != null) {
                        ba4.G(this.U);
                        file2 = ba4.I(botInlineResult.document);
                    } else if (botInlineResult.content instanceof TLRPC.TL_webDocument) {
                        file2 = new File(ba4.z(4), Utilities.a(botInlineResult.content.url) + "." + fl5.x(botInlineResult.content.url, "mp4"));
                    } else {
                        file2 = null;
                    }
                    z5 = true;
                } else {
                    if (botInlineResult.document != null) {
                        file2 = new File(ba4.z(3), this.c5[i]);
                    } else if (botInlineResult.photo != null) {
                        file2 = new File(ba4.z(0), this.c5[i]);
                    } else {
                        z5 = false;
                        file2 = null;
                    }
                    z5 = false;
                }
                z2 = false;
                z3 = false;
                z4 = z5;
                file = new File(ba4.z(4), this.c5[i]);
            }
            dx6Var2 = null;
            file3 = file2;
            dx6Var = dx6Var2;
        } else {
            if (i3 < 0 || i3 >= this.Y6.size()) {
                this.X0[i].d(-1, z, true);
                return;
            }
            ?? r4 = (k27) this.Y6.get(i3);
            z2 = Z1(r4);
            if (this.C5 == 1 && !r4.x()) {
                this.X0[i].d(-1, z, true);
                return;
            }
            File file4 = !TextUtils.isEmpty(r4.k.attachPath) ? new File(r4.k.attachPath) : null;
            dx6 dx6Var3 = ((k27.n1(r4.k) instanceof TLRPC.TL_messageMediaWebPage) && k27.n1(r4.k).webpage != null && k27.n1(r4.k).webpage.document == null) ? new dx6((Object) this, (Object) n0(i3, null), (byte) 17) : new dx6((Object) this, (Object) r4.k, (byte) 18);
            if (k27.K4(r4.k)) {
                dx6 dx6Var4 = dx6Var3;
                z3 = (gba.x0 && r4.B() && !cf3.B(k27.B0(r4.k))) || r4.D2(true);
                dx6Var = r4;
                file = null;
                file3 = file4;
                dx6Var2 = dx6Var4;
                z4 = true;
            } else {
                z4 = false;
                dx6Var = r4;
                file = null;
                file3 = file4;
                dx6Var2 = dx6Var3;
                z3 = false;
            }
        }
        final boolean z7 = !(i == 0 && this.l5) && z2;
        final File file5 = file3;
        final ?? r7 = dx6Var;
        final boolean z8 = s;
        Utilities.e.c(new Runnable() { // from class: w68
            @Override // java.lang.Runnable
            public final void run() {
                k27 k27Var;
                mu1 mu1Var;
                TLRPC.Document F0;
                Drawable[] drawableArr = PhotoViewer.f9;
                boolean z9 = z8;
                final File file6 = file5;
                if (!z9 && file6 != null) {
                    z9 = file6.exists();
                }
                File file7 = file;
                dx6 dx6Var5 = dx6Var2;
                File file8 = null;
                if (file7 == null && dx6Var5 != null) {
                    file7 = dx6Var5.a();
                } else if (dx6Var5 != null) {
                    file8 = dx6Var5.a();
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
                if (!z10 && i4 != 0 && (k27Var = r7) != null && z11 && up3.q(photoViewer.U).b(k27Var.k) != 0 && (((mu1Var = photoViewer.l4) == null || mu1Var.h == null) && !k27.Q5(k27Var.k) && (F0 = k27Var.F0()) != null)) {
                    ba4.G(photoViewer.U).X(F0, k27Var, 0, 10);
                }
                final boolean z12 = z4;
                final boolean z13 = z7;
                final boolean z14 = z;
                gl.d3(new Runnable() { // from class: z68
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean z15;
                        Drawable[] drawableArr2 = PhotoViewer.f9;
                        PhotoViewer photoViewer2 = PhotoViewer.this;
                        String[] strArr = photoViewer2.c5;
                        u78[] u78VarArr = photoViewer2.X0;
                        int i5 = i4;
                        File file10 = file6;
                        boolean z16 = z12;
                        boolean z17 = z14;
                        boolean z18 = true;
                        if (!(file10 == null && file9 == null) && ((z15 = z10) || z11)) {
                            if (i5 != 0 || !photoViewer2.P3) {
                                if (!z16 || (z13 && !(i5 == 0 && photoViewer2.X2))) {
                                    u78VarArr[i5].d(-1, z17, true);
                                } else {
                                    u78VarArr[i5].d(3, z17, true);
                                }
                            }
                            if (i5 == 0 && !photoViewer2.p0.y()) {
                                if (z15) {
                                    photoViewer2.p0.u(8);
                                } else {
                                    boolean S = ba4.G(photoViewer2.U).S(strArr[i5]);
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
                                u78VarArr[i5].d(0, z17, true);
                            } else if (ba4.G(photoViewer2.U).S(strArr[i5])) {
                                u78VarArr[i5].d(1, false, true);
                            } else {
                                u78VarArr[i5].d(2, false, true);
                            }
                            Float s2 = fl5.z().s(strArr[i5]);
                            if (s2 == null) {
                                s2 = Float.valueOf(0.0f);
                            }
                            u78VarArr[i5].f(false, s2.floatValue());
                        }
                        if (i5 == 0) {
                            if (photoViewer2.t4 || (photoViewer2.g7.isEmpty() && (strArr[0] == null || u78VarArr[0].h == 0))) {
                                z18 = false;
                            }
                            photoViewer2.I6 = z18;
                        }
                    }
                });
            }
        });
    }

    public final int w0() {
        return this.t2.right;
    }

    public final void w1(int i) {
        if (this.E8 != null) {
            MediaController.w().d(this.E8);
        }
        boolean z = this.I8 && !this.F8;
        this.I8 = false;
        this.G8 = false;
        this.W7.setVisibility(4);
        if (i != 1) {
            this.F8 = false;
            this.X0[0].d(3, false, true);
            if (i == 2) {
                s1(this.V4, this.W4, false, false, this.X4.d, false, 0L);
                this.G2.o0((long) (this.Y7.getLeftProgress() * this.o8));
            }
        } else if (this.l8 == this.j8 && this.k8 == this.i8) {
            this.F8 = false;
            u78 u78Var = this.X0[0];
            u78Var.f(u78Var.h == 0 || u78Var.k == 0, 0.0f);
            this.X0[0].d(3, false, true);
            if (z) {
                this.G8 = true;
            } else {
                s1(this.V4, this.W4, false, false, this.X4.d, false, 0L);
                this.G2.o0((long) (this.Y7.getLeftProgress() * this.o8));
            }
        } else {
            v1(false);
            if (this.E8 == null) {
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.id = 0;
                tL_message.message = "";
                tL_message.media = new TLRPC.TL_messageMediaEmpty();
                tL_message.action = new TLRPC.TL_messageActionEmpty();
                tL_message.dialog_id = this.E5;
                k27 k27Var = new k27(y6c.t0, tL_message, false, false);
                this.E8 = k27Var;
                k27Var.k.attachPath = new File(ba4.z(4), "video_preview.mp4").getAbsolutePath();
                this.E8.r0 = new oac();
                oac oacVar = this.E8.r0;
                oacVar.g = this.h8;
                oacVar.h = this.i8;
                this.E8.r0.i = this.j8;
                oac oacVar2 = this.E8.r0;
                oacVar2.n = this.p8;
                Uri uri = this.W4;
                if (uri == null) {
                    oacVar2.o = uri.getPath();
                } else {
                    oacVar2.o = uri.getPath();
                }
            }
            oac oacVar3 = this.E8.r0;
            long j = this.s8;
            oacVar3.a = j;
            long j2 = this.t8;
            oacVar3.b = j2;
            if (j == -1) {
                j = 0;
            }
            if (j2 == -1) {
                j2 = (long) (this.o8 * 1000.0f);
            }
            if (j2 - j > 5000000) {
                oacVar3.b = j + 5000000;
            }
            oacVar3.m = this.m8;
            this.E8.r0.k = this.k8;
            this.E8.r0.l = this.l8;
            oac oacVar4 = this.E8.r0;
            oacVar4.X = true;
            oacVar4.v = (long) (this.o8 * 1000.0f);
            if (!MediaController.w().g0(this.E8, true, true, true)) {
                this.F8 = true;
            }
            this.I8 = true;
            u78 u78Var2 = this.X0[0];
            u78Var2.f(u78Var2.h == 0 || u78Var2.k == 0, 0.0f);
            this.X0[0].d(0, false, true);
        }
        this.f0.invalidate();
    }

    public final void w2(boolean z, boolean z2) {
        l68 l68Var = this.y;
        gl.r(l68Var);
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
        x2(z);
        AnimatorSet animatorSet2 = this.x;
        if (!z) {
            if (animatorSet2 != null) {
                animatorSet2.cancel();
                x2(false);
                return;
            }
            return;
        }
        if (animatorSet2 != null) {
            animatorSet2.cancel();
            this.x = null;
        }
        if (!this.R3) {
            gl.e3(l68Var, 500L);
        } else {
            this.R3 = false;
            x2(true);
        }
    }

    public final void x(int i) {
        lbc lbcVar = this.G2;
        if (lbcVar != null && lbcVar.d != null && i != lbcVar.e0) {
            lbcVar.e0 = i;
            ArrayList arrayList = lbcVar.O;
            lbcVar.v0(false, (arrayList == null || i < 0 || i >= arrayList.size()) ? null : (hbc) lbcVar.O.get(i));
        }
        if (i == -1) {
            lbc.n0(null, this.T4);
        } else {
            lbc lbcVar2 = this.G2;
            if (lbcVar2 != null) {
                lbc.n0(lbcVar2.Z(i), this.T4);
            }
        }
        M2();
        this.q0.U(null, null);
        try {
            fo.b(0);
            if (tg2.D().I()) {
                tg2.D().X(k0());
            }
            lbc lbcVar3 = this.G2;
            if (lbcVar3 != null) {
                fo.z(lbcVar3.c0());
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    public final float x1() {
        return y1(true);
    }

    public final void x2(boolean z) {
        if (z) {
            this.Y0.setVisibility(0);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        this.x = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.Y0, (Property<wh1, Float>) View.ALPHA, z ? 1.0f : 0.0f));
        this.x.setDuration(200L);
        this.x.addListener(new n88(this, z, (byte) 1));
        this.x.start();
    }

    public final void y(boolean z, boolean z2, float f) {
        if (f != this.u1) {
            this.u1 = f;
            if (this.T4 != null) {
                SharedPreferences sharedPreferences = org.telegram.messenger.a.b.getSharedPreferences("playback_speed", 0);
                if (Math.abs(this.u1 - 1.0f) < 0.001f) {
                    sharedPreferences.edit().remove("speed" + k27.B0(this.T4.k) + "_" + this.T4.e1()).commit();
                } else {
                    sharedPreferences.edit().putFloat("speed" + k27.B0(this.T4.k) + "_" + this.T4.e1(), this.u1).commit();
                }
            }
            lbc lbcVar = this.G2;
            if (lbcVar != null) {
                lbcVar.u0(this.u1);
            }
            x88 x88Var = this.g0;
            if (x88Var != null) {
                x88Var.setPlaybackSpeed(this.u1);
            }
        }
        R1(true, z);
        if (z2) {
            this.q0.U(null, null);
        }
    }

    public final int y0(int i) {
        wjb wjbVar = this.w2;
        return wjbVar != null ? wjbVar.h(i) : bkb.w0(null, i, false);
    }

    public final float y1(boolean z) {
        int i;
        if (this.d2 != 11) {
            return 1.0f;
        }
        int i0 = i0(this.u4);
        if (i0 == 0) {
            i0 = gl.q.x;
        }
        float z2 = b00.z(20.0f, i0, 1) / i0;
        if (z) {
            int q = this.C4.q();
            int o = this.C4.o();
            if ((q <= 1 || o <= 1) && (i = this.P4) >= 0) {
                ArrayList arrayList = this.g7;
                if (i < arrayList.size()) {
                    Object obj = arrayList.get(this.P4);
                    if (obj instanceof jm6) {
                        jm6 jm6Var = (jm6) obj;
                        q = jm6Var.F;
                        o = jm6Var.G;
                        if ((jm6Var.J / 90) % 2 != 0) {
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

    public final void y2(boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        float N = gl.N(24.0f);
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

    public final void z(boolean z) {
        int i = this.P4;
        if (i < 0 || i >= this.g7.size() || !J0()) {
            return;
        }
        if (z) {
            c();
        }
        d0().p();
    }

    public final long z0() {
        x88 x88Var = this.g0;
        if (x88Var != null && x88Var.y) {
            return x88Var.getVideoDuration();
        }
        lbc lbcVar = this.G2;
        if (lbcVar == null) {
            return 0L;
        }
        return lbcVar.U();
    }

    public final void z1() {
        if (I0()) {
            return;
        }
        k27 k27Var = this.T4;
        if (k27Var == null || !k27Var.q4()) {
            x78 x78Var = this.y2;
            gl.r(x78Var);
            gl.e3(x78Var, 3000L);
        }
    }

    public final void z2(boolean z, boolean z2) {
        if (z != this.L) {
            if (z) {
                this.p1.setVisibility(0);
            }
            this.L = z;
            this.p1.setEnabled(z);
            if (!z2) {
                this.p1.setAlpha(z ? 1.0f : 0.0f);
                this.p1.setTranslationY(z ? 0.0f : -gl.L(10.0f));
                this.P0.setRotationX(z ? 1.0f : 0.0f);
                if (z) {
                    return;
                }
                this.p1.setVisibility(8);
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.p1, (Property<t98, Float>) View.ALPHA, z ? 1.0f : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.p1, (Property<t98, Float>) View.TRANSLATION_Y, z ? 0.0f : -gl.L(10.0f)));
            arrayList.add(ObjectAnimator.ofFloat(this.P0, (Property<CounterView, Float>) View.ROTATION_X, z ? 1.0f : 0.0f));
            AnimatorSet animatorSet = new AnimatorSet();
            this.C1 = animatorSet;
            animatorSet.playTogether(arrayList);
            if (!z) {
                this.C1.addListener(new e88(this, (byte) 4));
            }
            this.C1.setDuration(200L);
            this.C1.start();
        }
    }

    @Override // ms4
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // x74
    public final void D(float f, int i) {
    }
}
